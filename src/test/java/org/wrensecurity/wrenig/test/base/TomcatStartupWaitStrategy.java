/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.1.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.1.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2025 Wren Security.
 */
package org.wrensecurity.wrenig.test.base;

import org.testcontainers.containers.wait.strategy.LogMessageWaitStrategy;

/**
 * Wait strategy checking whether that Apache Tomcat started.
 */
public class TomcatStartupWaitStrategy extends LogMessageWaitStrategy {

    public TomcatStartupWaitStrategy() {
        withRegEx(".*Server startup in \\[.*\\] milliseconds\\n");
        withTimes(1);
    }

}
