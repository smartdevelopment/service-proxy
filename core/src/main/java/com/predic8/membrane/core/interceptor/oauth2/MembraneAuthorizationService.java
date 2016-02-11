/*
 * Copyright 2016 predic8 GmbH, www.predic8.com
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.predic8.membrane.core.interceptor.oauth2;

import com.predic8.membrane.core.interceptor.authentication.session.SessionManager;

public class MembraneAuthorizationService extends AuthorizationService {

    @Override
    protected void init() {
    }

    protected String getTokenEndpoint() {
        return null;
    }

    @Override
    protected String getLoginURL(String securityToken, String publicURL, String pathQuery) {
        return null;
    }

    @Override
    protected String getUserInfoEndpoint() {
        return null;
    }

    @Override
    protected String getUserIDProperty() {
        return null;
    }
}
