package com.tencent.xweb.internal;

import java.util.Locale;

public interface IWebViewContextWrapper {
    ClassLoader getWebViewCoreClassLoader();

    void updateResourceLocale(Locale locale);
}
