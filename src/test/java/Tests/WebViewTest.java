/*
 * Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package Tests;

import Pages.WebViewPage;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a webview
 */
public class WebViewTest extends TestBase {
    private final String FULL_URL = "http://www.google.com";
    private final String WEBVIEW_ACCESSIBILITY = "Google";

    private WebViewPage webViewPage;

    @Override
    public String getName() {
        return "Web";
    }

    /**
     * Sets up the webview page
     */
    @BeforeTest
    @Override
    public void setUpPage() {
        webViewPage = new WebViewPage(driver);
    }

    /**
     * Inputs navigates to a URL and then checks if the url is loaded by
     * checking the webview's content description
     */
    @Test
    public void testWebView() throws InterruptedException {
        webViewPage.gotoUrl(FULL_URL);
        Assert.assertTrue(webViewPage.getWebDescription(WEBVIEW_ACCESSIBILITY));
    }
}