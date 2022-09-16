/*
 * Copyright 2022 Dtsola.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtsola.oss.devops.sentinel.dashboard.nacos;

public final class NacosConfigUtil {

    public static final String GROUP_ID = "SENTINEL_GROUP";

    // 流控规则
    public static final String FLOW_DATA_ID_POSTFIX = "-flow-rules.json";

    // 熔断规则
    public static final String DEGRADE_DATA_ID_POSTFIX = "-degrade-rules.json";

    // 热点规则
    public static final String PARAM_FLOW_DATA_ID_POSTFIX = "-param-rules.json";

    // 系统规则
    public static final String SYSTEM_DATA_ID_POSTFIX = "-system-rules.json";

    // 授权规则
    public static final String AUTHORITY_DATA_ID_POSTFIX = "-authority-rules.json";

    // 集群流控
    // 目前 Sentinel 这一块还不完善
    // 先 已删除 集群流控 的菜单
    // 集群流控统一 在网关层 实现
    // 位置在 src\main\webapp\resources\app\scripts\directives\sidebar\sidebar.html
    // 忽略

    //
//    public static final String CLUSTER_MAP_DATA_ID_POSTFIX = "-cluster-map.json";
//
//    /**
//     * cc for `cluster-client`
//     */
//    public static final String CLIENT_CONFIG_DATA_ID_POSTFIX = "-cc-config.json";
//    /**
//     * cs for `cluster-server`
//     */
//    public static final String SERVER_TRANSPORT_CONFIG_DATA_ID_POSTFIX = "-cs-transport-config.json";
//    public static final String SERVER_FLOW_CONFIG_DATA_ID_POSTFIX = "-cs-flow-config.json";
//    public static final String SERVER_NAMESPACE_SET_DATA_ID_POSTFIX = "-cs-namespace-set.json";

    private NacosConfigUtil() {}
}
