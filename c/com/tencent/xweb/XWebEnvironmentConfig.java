package com.tencent.xweb;

import com.tencent.xweb.util.IXWebLogClient;

public class XWebEnvironmentConfig {
    private IXWebLogClient logInterface;
    private WebViewReporterInterface reporterInterface;
    private ISharedPreferenceProvider sharedPreferenceProvider;

    public static class XWebEnvironmentConfigBuilder {
        private IXWebLogClient logInterface;
        private WebViewReporterInterface reporterInterface;
        private ISharedPreferenceProvider sharedPreferenceProvider;

        public XWebEnvironmentConfig createXWebEnvironmentConfig() {
            return new XWebEnvironmentConfig(this.logInterface, this.reporterInterface, this.sharedPreferenceProvider);
        }

        public XWebEnvironmentConfigBuilder setLogInterface(IXWebLogClient iXWebLogClient) {
            this.logInterface = iXWebLogClient;
            return this;
        }

        public XWebEnvironmentConfigBuilder setReporterInterface(WebViewReporterInterface webViewReporterInterface) {
            this.reporterInterface = webViewReporterInterface;
            return this;
        }

        public XWebEnvironmentConfigBuilder setSharedPreferenceProvider(ISharedPreferenceProvider iSharedPreferenceProvider) {
            this.sharedPreferenceProvider = iSharedPreferenceProvider;
            return this;
        }
    }

    public XWebEnvironmentConfig(IXWebLogClient iXWebLogClient, WebViewReporterInterface webViewReporterInterface, ISharedPreferenceProvider iSharedPreferenceProvider) {
        this.logInterface = iXWebLogClient;
        this.reporterInterface = webViewReporterInterface;
        this.sharedPreferenceProvider = iSharedPreferenceProvider;
    }

    public IXWebLogClient getLogInterface() {
        return this.logInterface;
    }

    public WebViewReporterInterface getReporterInterface() {
        return this.reporterInterface;
    }

    public ISharedPreferenceProvider getSharedPreferenceProvider() {
        return this.sharedPreferenceProvider;
    }
}
