/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.siddhi.extension.output.mapper.wso2event.service;

import org.wso2.carbon.databridge.commons.StreamDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class holds the event streams defined with the WSO2 sinks
 */
public class StreamDefinitionHolder {
    private static Map<String, StreamDefinition> streamDefinitionMap = new ConcurrentHashMap<>();

    public static StreamDefinition getStreamDefinition(String streamId) {
        return streamDefinitionMap.get(streamId);
    }

    public static void setStreamDefinition(StreamDefinition streamDefinition) {
        streamDefinitionMap.put(streamDefinition.getStreamId(), streamDefinition);
    }
}
