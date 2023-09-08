package com.tencent.xweb;

import android.app.Presentation;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import com.tencent.xweb.util.XWebLog;

public class XWebExtendPluginNativeViewClient {
    private static final String TAG = "XWebExtendPluginNativeViewClient";
    private final Context mContext;
    /* access modifiers changed from: private */
    public XWebExtendPluginNativeViewDelegate mDelegate;
    /* access modifiers changed from: private */
    public int mHeight;
    private NativeViewPresentation mNativeViewPresentation;
    /* access modifiers changed from: private */
    public FrameLayout mRootView;
    private final Surface mSurface;
    private final SurfaceTexture mSurfaceTexture;
    private VirtualDisplay mVirtualDisplay;
    /* access modifiers changed from: private */
    public int mWidth;

    public class NativeViewPresentation extends Presentation {
        private final XWebExtendPluginNativeViewClient mClient;
        private FrameLayout mContentView;
        private boolean mStartFocused = false;

        public NativeViewPresentation(Context context, Display display, boolean z, XWebExtendPluginNativeViewClient xWebExtendPluginNativeViewClient) {
            super(context, display);
            getWindow().setFlags(8, 8);
            this.mStartFocused = z;
            this.mClient = xWebExtendPluginNativeViewClient;
        }

        public void detach() {
            if (XWebExtendPluginNativeViewClient.this.mRootView != null) {
                XWebExtendPluginNativeViewClient.this.mRootView.removeAllViews();
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            FrameLayout unused = XWebExtendPluginNativeViewClient.this.mRootView = new FrameLayout(getContext());
            FrameLayout frameLayout = this.mContentView;
            if (frameLayout != null) {
                if (this.mStartFocused) {
                    frameLayout.requestFocus();
                }
                XWebExtendPluginNativeViewClient.this.mRootView.addView(this.mContentView);
            }
            setContentView(XWebExtendPluginNativeViewClient.this.mRootView);
            if (XWebExtendPluginNativeViewClient.this.mDelegate != null) {
                XWebExtendPluginNativeViewClient.this.mDelegate.onCreate(this.mClient.mWidth, this.mClient.mHeight);
            }
        }
    }

    public XWebExtendPluginNativeViewClient(Context context, SurfaceTexture surfaceTexture, int i, int i2) {
        this.mContext = context;
        this.mSurfaceTexture = surfaceTexture;
        this.mSurface = new Surface(surfaceTexture);
        this.mWidth = i;
        this.mHeight = i2;
    }

    private void refresh(boolean z) {
        NativeViewPresentation nativeViewPresentation = this.mNativeViewPresentation;
        if (nativeViewPresentation != null) {
            nativeViewPresentation.detach();
        }
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface((Surface) null);
            this.mVirtualDisplay.release();
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.mWidth, this.mHeight);
        }
        int i = getContext().getResources().getDisplayMetrics().densityDpi;
        this.mVirtualDisplay = ((DisplayManager) getContext().getSystemService("display")).createVirtualDisplay("xweb-vd" + hashCode(), this.mWidth, this.mHeight, i, this.mSurface, 0);
        NativeViewPresentation nativeViewPresentation2 = new NativeViewPresentation(getContext(), this.mVirtualDisplay.getDisplay(), false, this);
        this.mNativeViewPresentation = nativeViewPresentation2;
        nativeViewPresentation2.show();
    }

    public void dispose() {
        XWebExtendPluginNativeViewDelegate xWebExtendPluginNativeViewDelegate = this.mDelegate;
        if (xWebExtendPluginNativeViewDelegate != null) {
            xWebExtendPluginNativeViewDelegate.onDestroy();
        }
        NativeViewPresentation nativeViewPresentation = this.mNativeViewPresentation;
        if (nativeViewPresentation != null) {
            nativeViewPresentation.cancel();
            this.mNativeViewPresentation.detach();
        }
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
    }

    public Context getContext() {
        XWebExtendPluginNativeViewDelegate xWebExtendPluginNativeViewDelegate = this.mDelegate;
        if (xWebExtendPluginNativeViewDelegate != null) {
            return xWebExtendPluginNativeViewDelegate.getContext();
        }
        XWebLog.m21909e(TAG, "no context");
        return null;
    }

    public FrameLayout getRootView() {
        return this.mRootView;
    }

    public void onNativeViewDestroy(int i) {
    }

    public void onNativeViewReady(int i) {
    }

    public void onNativeViewSizeChanged(int i, int i2, int i3) {
    }

    public void onNativeViewTouch(int i, MotionEvent motionEvent) {
    }

    public void onSizeChanged(int i, int i2) {
        XWebExtendPluginNativeViewDelegate xWebExtendPluginNativeViewDelegate = this.mDelegate;
        if (xWebExtendPluginNativeViewDelegate != null) {
            xWebExtendPluginNativeViewDelegate.onSizeChanged(i, i2);
        }
        if (this.mWidth != i || this.mHeight != i2) {
            this.mWidth = i;
            this.mHeight = i2;
            refresh(false);
        }
    }

    public void setDelegate(XWebExtendPluginNativeViewDelegate xWebExtendPluginNativeViewDelegate) {
        this.mDelegate = xWebExtendPluginNativeViewDelegate;
        if (xWebExtendPluginNativeViewDelegate != null) {
            this.mRootView = new FrameLayout(xWebExtendPluginNativeViewDelegate.getContext());
            refresh(false);
        }
    }

    public XWebExtendPluginNativeViewClient(Context context, Surface surface, int i, int i2) {
        this.mContext = context;
        this.mSurfaceTexture = null;
        this.mSurface = surface;
        this.mWidth = i;
        this.mHeight = i2;
    }
}
