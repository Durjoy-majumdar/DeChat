package p172io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;

/* renamed from: io.flutter.plugins.webviewflutter.InputAwareWebView */
class InputAwareWebView extends WebView {
    private static final String TAG = "InputAwareWebView";
    /* access modifiers changed from: private */
    public View containerView;
    private ThreadedInputConnectionProxyAdapterView proxyAdapterView;
    private View threadedInputConnectionProxyView;

    public InputAwareWebView(Context context, View view) {
        super(context);
        this.containerView = view;
    }

    private boolean isCalledFromListPopupWindowShow() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }

    private void resetInputConnection() {
        View view;
        if (this.proxyAdapterView != null && (view = this.containerView) != null) {
            setInputConnectionTarget(view);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.threadedInputConnectionProxyView;
        this.threadedInputConnectionProxyView = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.containerView;
        if (view3 == null) {
            return super.checkInputConnectionProxy(view);
        }
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = new ThreadedInputConnectionProxyAdapterView(view3, view, view.getHandler());
        this.proxyAdapterView = threadedInputConnectionProxyAdapterView;
        setInputConnectionTarget(threadedInputConnectionProxyAdapterView);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        resetInputConnection();
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        resetInputConnection();
    }

    public void lockInputConnection() {
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView != null) {
            threadedInputConnectionProxyAdapterView.setLocked(true);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28 || !isCalledFromListPopupWindowShow() || z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    public void setContainerView(View view) {
        this.containerView = view;
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView != null && view != null) {
            setInputConnectionTarget(threadedInputConnectionProxyAdapterView);
        }
    }

    public void setInputConnectionTarget(final View view) {
        if (this.containerView != null) {
            view.requestFocus();
            this.containerView.post(new Runnable() {
                public void run() {
                    if (InputAwareWebView.this.containerView != null) {
                        view.onWindowFocusChanged(true);
                        ((InputMethodManager) InputAwareWebView.this.getContext().getSystemService("input_method")).isActive(InputAwareWebView.this.containerView);
                    }
                }
            });
        }
    }

    public void unlockInputConnection() {
        ThreadedInputConnectionProxyAdapterView threadedInputConnectionProxyAdapterView = this.proxyAdapterView;
        if (threadedInputConnectionProxyAdapterView != null) {
            threadedInputConnectionProxyAdapterView.setLocked(false);
        }
    }
}
