/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getOpenIDConnectProvider(GetOpenIDConnectProviderRequest) GetOpenIDConnectProvider operation}.
 * <p>
 * Returns information about the specified OpenID Connect provider.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getOpenIDConnectProvider(GetOpenIDConnectProviderRequest)
 */
public class GetOpenIDConnectProviderRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to get information for. You can get a list of OIDC provider
     * ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String openIDConnectProviderArn;

    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to get information for. You can get a list of OIDC provider
     * ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to get information for. You can get a list of OIDC provider
     *         ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     */
    public String getOpenIDConnectProviderArn() {
        return openIDConnectProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to get information for. You can get a list of OIDC provider
     * ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to get information for. You can get a list of OIDC provider
     *         ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     */
    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to get information for. You can get a list of OIDC provider
     * ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to get information for. You can get a list of OIDC provider
     *         ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderRequest withOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOpenIDConnectProviderArn() != null) sb.append("OpenIDConnectProviderArn: " + getOpenIDConnectProviderArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOpenIDConnectProviderArn() == null) ? 0 : getOpenIDConnectProviderArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOpenIDConnectProviderRequest == false) return false;
        GetOpenIDConnectProviderRequest other = (GetOpenIDConnectProviderRequest)obj;
        
        if (other.getOpenIDConnectProviderArn() == null ^ this.getOpenIDConnectProviderArn() == null) return false;
        if (other.getOpenIDConnectProviderArn() != null && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false) return false; 
        return true;
    }
    
}
    