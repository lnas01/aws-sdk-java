/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a single instance of a query execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     */
    private String queryExecutionId;
    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     */
    private String query;
    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results.
     * </p>
     */
    private ResultConfiguration resultConfiguration;
    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     */
    private QueryExecutionContext queryExecutionContext;
    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     */
    private QueryExecutionStatus status;
    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute.
     * </p>
     */
    private QueryExecutionStatistics statistics;

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique identifier for each query execution.
     */

    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * 
     * @return The unique identifier for each query execution.
     */

    public String getQueryExecutionId() {
        return this.queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier for each query execution.
     * </p>
     * 
     * @param queryExecutionId
     *        The unique identifier for each query execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withQueryExecutionId(String queryExecutionId) {
        setQueryExecutionId(queryExecutionId);
        return this;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * 
     * @param query
     *        The SQL query statements which the query execution ran.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * 
     * @return The SQL query statements which the query execution ran.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The SQL query statements which the query execution ran.
     * </p>
     * 
     * @param query
     *        The SQL query statements which the query execution ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results.
     * </p>
     * 
     * @param resultConfiguration
     *        The location in Amazon S3 where query results were stored and the encryption option, if any, used for
     *        query results.
     */

    public void setResultConfiguration(ResultConfiguration resultConfiguration) {
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results.
     * </p>
     * 
     * @return The location in Amazon S3 where query results were stored and the encryption option, if any, used for
     *         query results.
     */

    public ResultConfiguration getResultConfiguration() {
        return this.resultConfiguration;
    }

    /**
     * <p>
     * The location in Amazon S3 where query results were stored and the encryption option, if any, used for query
     * results.
     * </p>
     * 
     * @param resultConfiguration
     *        The location in Amazon S3 where query results were stored and the encryption option, if any, used for
     *        query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withResultConfiguration(ResultConfiguration resultConfiguration) {
        setResultConfiguration(resultConfiguration);
        return this;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * 
     * @param queryExecutionContext
     *        The database in which the query execution occurred.
     */

    public void setQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        this.queryExecutionContext = queryExecutionContext;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * 
     * @return The database in which the query execution occurred.
     */

    public QueryExecutionContext getQueryExecutionContext() {
        return this.queryExecutionContext;
    }

    /**
     * <p>
     * The database in which the query execution occurred.
     * </p>
     * 
     * @param queryExecutionContext
     *        The database in which the query execution occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withQueryExecutionContext(QueryExecutionContext queryExecutionContext) {
        setQueryExecutionContext(queryExecutionContext);
        return this;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     * 
     * @param status
     *        The completion date, current state, submission time, and state change reason (if applicable) for the query
     *        execution.
     */

    public void setStatus(QueryExecutionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     * 
     * @return The completion date, current state, submission time, and state change reason (if applicable) for the
     *         query execution.
     */

    public QueryExecutionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The completion date, current state, submission time, and state change reason (if applicable) for the query
     * execution.
     * </p>
     * 
     * @param status
     *        The completion date, current state, submission time, and state change reason (if applicable) for the query
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withStatus(QueryExecutionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute.
     * </p>
     * 
     * @param statistics
     *        The amount of data scanned during the query execution and the amount of time that it took to execute.
     */

    public void setStatistics(QueryExecutionStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute.
     * </p>
     * 
     * @return The amount of data scanned during the query execution and the amount of time that it took to execute.
     */

    public QueryExecutionStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The amount of data scanned during the query execution and the amount of time that it took to execute.
     * </p>
     * 
     * @param statistics
     *        The amount of data scanned during the query execution and the amount of time that it took to execute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryExecution withStatistics(QueryExecutionStatistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: ").append(getQueryExecutionId()).append(",");
        if (getQuery() != null)
            sb.append("Query: ").append(getQuery()).append(",");
        if (getResultConfiguration() != null)
            sb.append("ResultConfiguration: ").append(getResultConfiguration()).append(",");
        if (getQueryExecutionContext() != null)
            sb.append("QueryExecutionContext: ").append(getQueryExecutionContext()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecution == false)
            return false;
        QueryExecution other = (QueryExecution) obj;
        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getResultConfiguration() == null ^ this.getResultConfiguration() == null)
            return false;
        if (other.getResultConfiguration() != null && other.getResultConfiguration().equals(this.getResultConfiguration()) == false)
            return false;
        if (other.getQueryExecutionContext() == null ^ this.getQueryExecutionContext() == null)
            return false;
        if (other.getQueryExecutionContext() != null && other.getQueryExecutionContext().equals(this.getQueryExecutionContext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getResultConfiguration() == null) ? 0 : getResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getQueryExecutionContext() == null) ? 0 : getQueryExecutionContext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public QueryExecution clone() {
        try {
            return (QueryExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
