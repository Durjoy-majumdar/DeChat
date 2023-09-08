package org.chromium.support_lib_boundary;

import android.net.Uri;
import java.lang.reflect.InvocationHandler;

public interface WebViewProviderBoundaryInterface {
    InvocationHandler[] createWebMessageChannel();

    void insertVisualStateCallback(long j, InvocationHandler invocationHandler);

    void postMessageToMainFrame(InvocationHandler invocationHandler, Uri uri);
}
