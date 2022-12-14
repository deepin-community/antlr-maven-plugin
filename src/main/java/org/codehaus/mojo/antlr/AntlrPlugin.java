package org.codehaus.mojo.antlr;

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

import java.util.List;

import org.apache.maven.plugin.MojoExecutionException;

//----------------------------------------------------------------------
// Don't remove this snippet
//----------------------------------------------------------------------
// START SNIPPET: generate-sources-0
/**
 * Generates files based on grammar files with Antlr tool.
 * 
 * @goal generate
 * @phase generate-sources
 * @requiresDependencyResolution compile
 * @author <a href="mailto:vincent.siveton@gmail.com">Vincent Siveton</a>
 * @version $Id: AntlrPlugin.java 13111 2010-11-16 22:16:36Z pgier $
 */
public class AntlrPlugin
    extends AbstractAntlrMojo
{
    /**
     * @see org.apache.maven.plugin.Mojo#execute()
     */
    public void execute()
        throws MojoExecutionException
    {
        executeAntlr();
    }

    // END SNIPPET: generate-sources-0
    // ----------------------------------------------------------------------
    // Don't remove this snippet
    // ----------------------------------------------------------------------

    /**
     * @see org.codehaus.mojo.antlr.AbstractAntlrMojo#addArgs(java.util.List)
     */
    protected void addArgs( List arguments )
    {
        // nop
    }
}
