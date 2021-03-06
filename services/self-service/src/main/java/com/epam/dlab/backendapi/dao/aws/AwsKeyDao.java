/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.epam.dlab.backendapi.dao.aws;

import com.epam.dlab.backendapi.dao.KeyDAO;
import com.epam.dlab.dto.UserInstanceStatus;
import com.epam.dlab.dto.aws.edge.EdgeInfoAws;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class AwsKeyDao extends KeyDAO {

	public AwsKeyDao() {
		log.info("{} is initialized", getClass().getSimpleName());
	}

	@Override
	public EdgeInfoAws getEdgeInfo(String user) {
		return super.getEdgeInfo(user, EdgeInfoAws.class, new EdgeInfoAws());
	}

	@Override
	public Optional<EdgeInfoAws> getEdgeInfoWhereStatusIn(String user, UserInstanceStatus... statuses) {
		return super.getEdgeInfoWhereStatusIn(user, EdgeInfoAws.class, statuses);
	}
}
