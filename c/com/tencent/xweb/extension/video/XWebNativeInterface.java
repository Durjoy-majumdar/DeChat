package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Display;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.xweb.C106947R;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebView;
import com.tencent.xweb.extension.video.VideoPlayerSeekBar;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.AccessibilityHelper;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import k20.C60958c;
import k20.C9556a;
import sn0.C90259e;

public class XWebNativeInterface implements VideoNativeInterface, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    private static final int AUTO_HIDE_INTERVAL = 7000;
    private static final int BRIGHTNESS_CONTROL = 2;
    private static final int INVALID_ORIENTATION = -3;
    private static final int MIN_DISTANCE_PROGRESS_CONTROL = 1;
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_ZOOM = 1;
    private static final int NONE_CONTROL = 0;
    private static final int PROGRESS_CONTROL = 3;
    private static final String TAG = "XWebNativeInterface";
    private static final int VOLUME_CONTROL = 1;
    private byte _hellAccFlag_;
    private final Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity == XWebNativeInterface.this.tryGetActivity() || (XWebNativeInterface.this.mFullscreenActivity != null && XWebNativeInterface.this.mFullscreenActivity.get() == activity)) {
                XWebLog.m21911i(XWebNativeInterface.TAG, "onActivityDestroyed");
                if (XWebNativeInterface.this.mCallback != null) {
                    XWebNativeInterface.this.mCallback.onCustomViewHidden();
                }
            }
        }

        public void onActivityPaused(Activity activity) {
            if (activity == XWebNativeInterface.this.tryGetActivity()) {
                XWebLog.m21911i(XWebNativeInterface.TAG, "onActivityPaused");
                boolean unused = XWebNativeInterface.this.mIsResumed = false;
            }
        }

        public void onActivityResumed(Activity activity) {
            if (activity == XWebNativeInterface.this.tryGetActivity()) {
                XWebLog.m21911i(XWebNativeInterface.TAG, "onActivityResumed");
                boolean unused = XWebNativeInterface.this.mIsResumed = true;
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (activity == XWebNativeInterface.this.tryGetActivity()) {
                XWebLog.m21911i(XWebNativeInterface.TAG, "onActivityStarted");
            }
        }

        public void onActivityStopped(Activity activity) {
            if (activity == XWebNativeInterface.this.tryGetActivity()) {
                XWebLog.m21911i(XWebNativeInterface.TAG, "onActivityStopped");
                boolean unused = XWebNativeInterface.this.mIsResumed = false;
            }
        }
    };
    private Application mApplication;
    private AudioManager mAudioManager;
    private Drawable mBackgroundDrawable;
    /* access modifiers changed from: private */
    public FrameLayout mBackgroundView;
    private float mBrightness = 1.0f;
    /* access modifiers changed from: private */
    public WebChromeClient.CustomViewCallback mCallback;
    /* access modifiers changed from: private */
    public ViewGroup mControlView;
    private Timer mControlViewTimer;
    /* access modifiers changed from: private */
    public int mCurrentOrientation = -3;
    /* access modifiers changed from: private */
    public GestureDetector mDetector;
    private boolean mDisableJsCallback;
    private boolean mEnableMute = false;
    private boolean mEnableSpeed = false;
    /* access modifiers changed from: private */
    public WeakReference<Activity> mFullscreenActivity;
    /* access modifiers changed from: private */
    public FullscreenStatus mFullscreenStatus = FullscreenStatus.None;
    /* access modifiers changed from: private */
    public boolean mHasInited;
    private final int mHideTime = 200;
    private ImageView mImageBack;
    private ImageView mImageExit;
    /* access modifiers changed from: private */
    public ImageView mImageMute;
    /* access modifiers changed from: private */
    public ImageView mImagePlay;
    private boolean mImmersiveSticky;
    /* access modifiers changed from: private */
    public boolean mIsFullscreen;
    /* access modifiers changed from: private */
    public boolean mIsResumed;
    private int mLastSystemUiVisibility;
    private ClickableFrameLayout mLayoutBlank;
    private WindowManager.LayoutParams mLayoutParams;
    /* access modifiers changed from: private */
    public View mLayoutProgress;
    /* access modifiers changed from: private */
    public FrameLayout mLayoutRate;
    private VideoStatusLayout mLayoutStatus;
    /* access modifiers changed from: private */
    public LinearLayout mLayoutTitleBar;
    /* access modifiers changed from: private */
    public LinearLayout mLayoutVideoControl;
    private int mMaxVideoVolume;
    /* access modifiers changed from: private */
    public int mMode;
    /* access modifiers changed from: private */
    public float mNewVideoProgress;
    private float mOldVideoProgress;
    private double mOldVideoVolume;
    private OrientationEventListener mOrientationEventListener;
    private boolean mOriginalForceNotFullscreen;
    private boolean mOriginalFullscreen;
    private int mPreOrientation = -3;
    /* access modifiers changed from: private */
    public ProgressBar mProgressLoading;
    /* access modifiers changed from: private */
    public WindowFocusChangedFrameLayout mRootView;
    /* access modifiers changed from: private */
    public ScaleGestureDetector mScaleDetector;
    /* access modifiers changed from: private */
    public VideoPlayerSeekBar mSeekBar;
    /* access modifiers changed from: private */
    public TextView mTextViewRate;
    private TextView mTextViewRate05;
    private TextView mTextViewRate075;
    private TextView mTextViewRate10;
    private TextView mTextViewRate15;
    private TextView mTextViewRate20;
    private TextView mTextViewRate30;
    private ViewGroup mTopViewParent;
    /* access modifiers changed from: private */
    public int mTouchStatus = 0;
    /* access modifiers changed from: private */
    public TextView mTvCurrentTime;
    /* access modifiers changed from: private */
    public TextView mTvTotalTime;
    /* access modifiers changed from: private */
    public double mVideoDuration;
    private double mVideoHeight;
    private long mVideoId;
    /* access modifiers changed from: private */
    public boolean mVideoIsEnterFullscreen;
    private String mVideoJs;
    private VideoJsCallback mVideoJsCallback;
    /* access modifiers changed from: private */
    public boolean mVideoMuted;
    private double mVideoRate = 1.0d;
    /* access modifiers changed from: private */
    public View mVideoView;
    private double mVideoWidth;
    /* access modifiers changed from: private */
    public WebView mWebView;
    private int mWebViewDescendantFocusability;
    private int mWebViewUIDescendantFocusability;
    private Window mWindow;
    private final WindowFocusChangedFrameLayout.WindowFocusChangedListener mWindowFocusChangedListener = new WindowFocusChangedFrameLayout.WindowFocusChangedListener() {
        public void onWindowFocusChanged(boolean z) {
            Activity access$3300;
            if (XWebNativeInterface.this.mIsResumed && z && (access$3300 = XWebNativeInterface.this.tryGetActivity()) != null) {
                XWebLog.m21911i(XWebNativeInterface.TAG, "window callback, onWindowFocusChanged hasFocus:" + z + ", mIsFullscreen:" + XWebNativeInterface.this.mIsFullscreen + ", focus element:" + access$3300.getCurrentFocus() + ", mCurrentOrientation:" + XWebNativeInterface.this.mCurrentOrientation + ", activity.getRequestedOrientation:" + access$3300.getRequestedOrientation());
                if (XWebNativeInterface.this.mIsFullscreen) {
                    if (!XWebNativeInterface.this.hasFocus()) {
                        XWebNativeInterface.this.runOnUIThread(new Runnable() {
                            public void run() {
                                XWebNativeInterface.this.fixFocus();
                            }
                        });
                    }
                    if (!(XWebNativeInterface.this.mCurrentOrientation == -3 || XWebNativeInterface.this.mCurrentOrientation == access$3300.getRequestedOrientation())) {
                        XWebNativeInterface xWebNativeInterface = XWebNativeInterface.this;
                        xWebNativeInterface.setRequestedOrientation(xWebNativeInterface.mCurrentOrientation);
                    }
                }
                boolean unused = XWebNativeInterface.this.mIsResumed = false;
            }
        }
    };

    public enum FullscreenStatus {
        None,
        Attaching,
        Attached,
        Detaching,
        AttachingDetached,
        DetachingAttached
    }

    public static class WindowFocusChangedFrameLayout extends FrameLayout {
        private WindowFocusChangedListener mWindowFocusChangedListener;

        public interface WindowFocusChangedListener {
            void onWindowFocusChanged(boolean z);
        }

        public WindowFocusChangedFrameLayout(Context context) {
            super(context);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            WindowFocusChangedListener windowFocusChangedListener = this.mWindowFocusChangedListener;
            if (windowFocusChangedListener != null) {
                windowFocusChangedListener.onWindowFocusChanged(z);
            }
        }

        public void setWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
            this.mWindowFocusChangedListener = windowFocusChangedListener;
        }
    }

    private Activity activityFromContext(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return activityFromContext(baseContext);
    }

    /* access modifiers changed from: private */
    public boolean checkIfLiveVideo(double d) {
        return Double.isInfinite(d) || d <= 0.0d;
    }

    /* access modifiers changed from: private */
    public void fixFocus() {
        int descendantFocusability;
        int descendantFocusability2;
        if ((this.mWebView.getView() instanceof ViewGroup) && (descendantFocusability2 = ((ViewGroup) this.mWebView.getView()).getDescendantFocusability()) != 131072) {
            this.mWebViewDescendantFocusability = descendantFocusability2;
            ((ViewGroup) this.mWebView.getView()).setDescendantFocusability(131072);
        }
        if ((this.mWebView.getWebViewUI() instanceof ViewGroup) && (descendantFocusability = ((ViewGroup) this.mWebView.getWebViewUI()).getDescendantFocusability()) != 131072) {
            this.mWebViewUIDescendantFocusability = descendantFocusability;
            ((ViewGroup) this.mWebView.getWebViewUI()).setDescendantFocusability(131072);
        }
        XWebLog.m21911i(TAG, "fixFocus, requestFocus return:" + this.mWebView.getView().requestFocus());
    }

    private String getAllVideoTime(double d) {
        StringBuilder sb = new StringBuilder();
        sb.append(getFormatVideoTime(d, this.mVideoDuration));
        sb.append("/");
        double d2 = this.mVideoDuration;
        sb.append(getFormatVideoTime(d2, d2));
        return sb.toString();
    }

    private FrameLayout.LayoutParams getAutoFixLayoutParams(int i, int i2, int i3) {
        int i4;
        int i5;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point(0, 0);
        defaultDisplay.getSize(point);
        if (i == 0) {
            i4 = Math.max(point.x, point.y);
            i5 = Math.min(point.x, point.y);
        } else {
            i5 = Math.max(point.x, point.y);
            i4 = Math.min(point.x, point.y);
        }
        double d = (((double) i2) * 1.0d) / ((double) i3);
        double d2 = (double) i4;
        double d3 = (double) i5;
        if (d >= (d2 * 1.0d) / d3) {
            i5 = (int) (d2 * (1.0d / d));
        } else {
            i4 = (int) (d3 * d);
        }
        return new FrameLayout.LayoutParams(i4, i5, 17);
    }

    /* access modifiers changed from: private */
    public Context getContext() {
        return this.mWebView.getContext();
    }

    /* access modifiers changed from: private */
    public String getCurrentVideoTime(double d) {
        return getFormatVideoTime(d, this.mVideoDuration);
    }

    private String getFormatVideoTime(double d, double d2) {
        String format = String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf((int) (d / 3600.0d))});
        int i = (int) (d % 3600.0d);
        String format2 = String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i / 60)});
        String format3 = String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i % 60)});
        if (d2 > 3600.0d) {
            return String.format(Locale.getDefault(), "%s:%s:%s", new Object[]{format, format2, format3});
        }
        return String.format(Locale.getDefault(), "%s:%s", new Object[]{format2, format3});
    }

    /* access modifiers changed from: private */
    public SurfaceView getSurfaceView(View view) {
        if (view instanceof SurfaceView) {
            return (SurfaceView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            SurfaceView surfaceView = getSurfaceView(viewGroup.getChildAt(i));
            if (surfaceView != null) {
                return surfaceView;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public TextureView getTextureView(View view) {
        if (view instanceof TextureView) {
            return (TextureView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            TextureView textureView = getTextureView(viewGroup.getChildAt(i));
            if (textureView != null) {
                return textureView;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public String getTotalVideoTime() {
        double d = this.mVideoDuration;
        return getFormatVideoTime(d, d);
    }

    /* access modifiers changed from: private */
    public boolean hasFocus() {
        return this.mWebView.getView().hasFocus();
    }

    private void hideLayoutRateView() {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mLayoutRate != null) {
                    XWebNativeInterface.this.mLayoutRate.setVisibility(4);
                }
            }
        });
    }

    private void hideProgressLoading() {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mProgressLoading != null) {
                    XWebNativeInterface.this.mProgressLoading.setVisibility(8);
                }
            }
        });
    }

    private boolean isLayoutRateViewVisible() {
        FrameLayout frameLayout = this.mLayoutRate;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    private void registerActivityLifecycleCallback(Activity activity) {
        if (activity != null) {
            Application application = activity.getApplication();
            this.mApplication = application;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            }
        }
        XWebLog.m21911i(TAG, "registerActivityLifecycleCallback activity:" + activity + ", mApplication:" + this.mApplication);
    }

    /* access modifiers changed from: private */
    public void resetRateTextViews() {
        if (Build.VERSION.SDK_INT >= 23) {
            TextView textView = this.mTextViewRate05;
            Context context = getContext();
            int i = C106947R.color.aln;
            textView.setTextColor(context.getColorStateList(i));
            this.mTextViewRate075.setTextColor(getContext().getColorStateList(i));
            this.mTextViewRate10.setTextColor(getContext().getColorStateList(i));
            this.mTextViewRate15.setTextColor(getContext().getColorStateList(i));
            this.mTextViewRate20.setTextColor(getContext().getColorStateList(i));
            this.mTextViewRate30.setTextColor(getContext().getColorStateList(i));
            double d = this.mVideoRate;
            if (d == 0.5d) {
                this.mTextViewRate05.setTextColor(getContext().getColorStateList(C106947R.color.ali));
            } else if (d == 0.75d) {
                this.mTextViewRate075.setTextColor(getContext().getColorStateList(C106947R.color.ali));
            } else if (d == 1.0d) {
                this.mTextViewRate10.setTextColor(getContext().getColorStateList(C106947R.color.ali));
            } else if (d == 1.5d) {
                this.mTextViewRate15.setTextColor(getContext().getColorStateList(C106947R.color.ali));
            } else if (d == 2.0d) {
                this.mTextViewRate20.setTextColor(getContext().getColorStateList(C106947R.color.ali));
            } else if (d == 3.0d) {
                this.mTextViewRate30.setTextColor(getContext().getColorStateList(C106947R.color.ali));
            }
        }
    }

    private void resumeFocus() {
        XWebLog.m21911i(TAG, "resumeFocus");
        if ((this.mWebView.getView() instanceof ViewGroup) && this.mWebViewDescendantFocusability != 0) {
            ((ViewGroup) this.mWebView.getView()).setDescendantFocusability(this.mWebViewDescendantFocusability);
            this.mWebViewDescendantFocusability = 0;
        }
        if ((this.mWebView.getWebViewUI() instanceof ViewGroup) && this.mWebViewUIDescendantFocusability != 0) {
            ((ViewGroup) this.mWebView.getView()).setDescendantFocusability(this.mWebViewUIDescendantFocusability);
            this.mWebViewUIDescendantFocusability = 0;
        }
    }

    private void setAutoFix(int i, int i2, int i3) {
        View view = this.mVideoView;
        if (view != null) {
            view.setLayoutParams(getAutoFixLayoutParams(i, i2, i3));
        }
    }

    /* access modifiers changed from: private */
    public void setRequestedOrientation(int i) {
        Activity tryGetActivity = tryGetActivity();
        if (tryGetActivity == null) {
            XWebLog.m21911i(TAG, "setRequestedOrientation activity = null");
            return;
        }
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback == null || !videoJsCallback.onSetRequestedOrientation(i)) {
            tryGetActivity.setRequestedOrientation(i);
        } else {
            XWebLog.m21911i(TAG, "setRequestedOrientation by wechat client");
        }
    }

    /* access modifiers changed from: private */
    public void showLayoutRateView() {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mLayoutRate != null) {
                    XWebNativeInterface.this.mLayoutRate.setVisibility(0);
                }
                XWebNativeInterface.this.resetRateTextViews();
            }
        });
    }

    private void showProgressLoading() {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mProgressLoading != null) {
                    XWebNativeInterface.this.mProgressLoading.setVisibility(0);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public Activity tryGetActivity() {
        Activity activityFromContext = activityFromContext(this.mWebView.getContext());
        if (activityFromContext == null) {
            XWebLog.m21909e(TAG, "tryGetActivity but no Activity");
        }
        return activityFromContext;
    }

    public void attach() {
        SurfaceView surfaceView;
        XWebLog.m21911i(TAG, "attach start");
        if (hasEnteredFullscreen()) {
            XWebLog.m21911i(TAG, "attach, has entered fullscreen");
            return;
        }
        Activity tryGetActivity = tryGetActivity();
        if (tryGetActivity == null) {
            XWebLog.m21911i(TAG, "attach, activity is null");
            return;
        }
        this.mFullscreenActivity = new WeakReference<>(tryGetActivity);
        OrientationEventListener orientationEventListener = this.mOrientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.mOrientationEventListener = null;
        }
        C2017139 r3 = new OrientationEventListener(getContext().getApplicationContext(), 3) {
            public void onOrientationChanged(int i) {
                XWebNativeInterface.this.onOrientationChanged(i);
            }
        };
        this.mOrientationEventListener = r3;
        r3.enable();
        this.mRootView.setWindowFocusChangedListener(this.mWindowFocusChangedListener);
        registerActivityLifecycleCallback(tryGetActivity);
        resetAudioAndBrightness();
        FullscreenStatus fullscreenStatus = this.mFullscreenStatus;
        if (fullscreenStatus == FullscreenStatus.None) {
            this.mFullscreenStatus = FullscreenStatus.Attaching;
        } else if (fullscreenStatus == FullscreenStatus.Detaching) {
            this.mFullscreenStatus = FullscreenStatus.DetachingAttached;
            return;
        }
        onToggleFullscreen(true);
        ((FrameLayout) tryGetActivity.getWindow().getDecorView()).addView(this.mRootView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.mRootView.setBackgroundColor(0);
        if (this.mWebView.isXWalkKernel()) {
            ViewGroup viewGroup = (ViewGroup) this.mWebView.getView().getParent();
            this.mTopViewParent = viewGroup;
            viewGroup.removeView(this.mWebView.getView());
            this.mRootView.addView(this.mWebView.getView(), this.mRootView.getChildCount());
            this.mBackgroundView.setBackgroundColor(0);
            runOnUIThread(new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
                    if (com.tencent.xweb.extension.video.XWebNativeInterface.access$3000(r0, com.tencent.xweb.extension.video.XWebNativeInterface.access$2800(r0)) != null) goto L_0x0024;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r2 = this;
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        com.tencent.xweb.WebView r0 = r0.mWebView
                        boolean r0 = r0.isXWalkKernel()
                        if (r0 == 0) goto L_0x003e
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        android.view.View r1 = r0.mVideoView
                        android.view.SurfaceView r0 = r0.getSurfaceView(r1)
                        if (r0 != 0) goto L_0x0024
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        android.view.View r1 = r0.mVideoView
                        android.view.TextureView r0 = r0.getTextureView(r1)
                        if (r0 == 0) goto L_0x003e
                    L_0x0024:
                        java.lang.String r0 = "XWebNativeInterface"
                        java.lang.String r1 = "attach, xwalk kernel and video view has surface view or texture view"
                        com.tencent.xweb.util.XWebLog.m21911i(r0, r1)
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        android.widget.FrameLayout r0 = r0.mBackgroundView
                        if (r0 == 0) goto L_0x003e
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        android.widget.FrameLayout r0 = r0.mBackgroundView
                        r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                        r0.setBackgroundColor(r1)
                    L_0x003e:
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        r1 = 1
                        r0.onActivityFullscreen(r1)
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        com.tencent.xweb.extension.video.XWebNativeInterface$FullscreenStatus r0 = r0.mFullscreenStatus
                        com.tencent.xweb.extension.video.XWebNativeInterface$FullscreenStatus r1 = com.tencent.xweb.extension.video.XWebNativeInterface.FullscreenStatus.AttachingDetached
                        if (r0 != r1) goto L_0x005b
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        com.tencent.xweb.extension.video.XWebNativeInterface$FullscreenStatus r1 = com.tencent.xweb.extension.video.XWebNativeInterface.FullscreenStatus.Attached
                        com.tencent.xweb.extension.video.XWebNativeInterface.FullscreenStatus unused = r0.mFullscreenStatus = r1
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        r0.detach()
                        goto L_0x0062
                    L_0x005b:
                        com.tencent.xweb.extension.video.XWebNativeInterface r0 = com.tencent.xweb.extension.video.XWebNativeInterface.this
                        com.tencent.xweb.extension.video.XWebNativeInterface$FullscreenStatus r1 = com.tencent.xweb.extension.video.XWebNativeInterface.FullscreenStatus.Attached
                        com.tencent.xweb.extension.video.XWebNativeInterface.FullscreenStatus unused = r0.mFullscreenStatus = r1
                    L_0x0062:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.extension.video.XWebNativeInterface.C2016440.run():void");
                }
            });
        } else {
            onActivityFullscreen(true);
            this.mFullscreenStatus = FullscreenStatus.Attached;
        }
        View view = this.mVideoView;
        if (view != null) {
            this.mBackgroundView.addView(view);
            this.mBackgroundView.setBackgroundColor(0);
            WindowFocusChangedFrameLayout windowFocusChangedFrameLayout = this.mRootView;
            windowFocusChangedFrameLayout.addView(this.mBackgroundView, windowFocusChangedFrameLayout.getChildCount(), new FrameLayout.LayoutParams(-1, -1, 17));
            if (this.mWebView.isSysKernel()) {
                View view2 = this.mVideoView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/xweb/extension/video/XWebNativeInterface", "attach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/xweb/extension/video/XWebNativeInterface", "attach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.mRootView.addView(this.mControlView, new FrameLayout.LayoutParams(-1, -1, 17));
        if (this.mWebView.isSysKernel() && (surfaceView = getSurfaceView(this.mVideoView)) != null) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        Drawable background = this.mWebView.getView().getBackground();
        this.mBackgroundDrawable = background;
        if (background != null) {
            this.mBackgroundDrawable = background.getConstantState().newDrawable().mutate();
        }
        this.mWebView.getView().setBackground(new ColorDrawable(-16777216));
        if (this.mWebView.isSysKernel()) {
            this.mRootView.postDelayed(new Runnable() {
                private byte _hellAccFlag_;

                public void run() {
                    if (XWebNativeInterface.this.mVideoView != null) {
                        View access$2800 = XWebNativeInterface.this.mVideoView;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(access$2800, aVar.mo10232b(), "com/tencent/xweb/extension/video/XWebNativeInterface$41", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        access$2800.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(access$2800, "com/tencent/xweb/extension/video/XWebNativeInterface$41", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }, 200);
        }
        XWebLog.m21911i(TAG, "attach end");
    }

    public void detach() {
        FrameLayout frameLayout;
        XWebLog.m21911i(TAG, "detach start");
        if (!hasEnteredFullscreen()) {
            XWebLog.m21911i(TAG, "detach, has exited fullscreen");
            return;
        }
        this.mFullscreenActivity = null;
        unsetAudioAndBrightness();
        OrientationEventListener orientationEventListener = this.mOrientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.mOrientationEventListener = null;
        }
        this.mRootView.setWindowFocusChangedListener((WindowFocusChangedFrameLayout.WindowFocusChangedListener) null);
        unRegisterActivityLifecycleCallback();
        FullscreenStatus fullscreenStatus = this.mFullscreenStatus;
        if (fullscreenStatus == FullscreenStatus.Attached) {
            this.mFullscreenStatus = FullscreenStatus.Detaching;
        } else if (fullscreenStatus == FullscreenStatus.Attaching) {
            this.mFullscreenStatus = FullscreenStatus.AttachingDetached;
            return;
        }
        if (this.mBackgroundDrawable != null) {
            this.mWebView.getView().setBackground(this.mBackgroundDrawable);
            this.mBackgroundDrawable = null;
        } else {
            this.mWebView.getView().setBackground(new ColorDrawable(0));
        }
        if (this.mWebView.isXWalkKernel()) {
            this.mRootView.removeView(this.mWebView.getView());
            this.mTopViewParent.addView(this.mWebView.getView(), 0);
        }
        View view = this.mVideoView;
        if (view != null && view.getParent() == (frameLayout = this.mBackgroundView)) {
            frameLayout.removeView(this.mVideoView);
        }
        ViewParent parent = this.mBackgroundView.getParent();
        WindowFocusChangedFrameLayout windowFocusChangedFrameLayout = this.mRootView;
        if (parent == windowFocusChangedFrameLayout) {
            windowFocusChangedFrameLayout.removeView(this.mBackgroundView);
        }
        ViewParent parent2 = this.mControlView.getParent();
        WindowFocusChangedFrameLayout windowFocusChangedFrameLayout2 = this.mRootView;
        if (parent2 == windowFocusChangedFrameLayout2) {
            windowFocusChangedFrameLayout2.removeView(this.mControlView);
        }
        this.mControlView.setVisibility(8);
        int i = this.mPreOrientation;
        if (i != -3) {
            setRequestedOrientation(i);
            this.mPreOrientation = -3;
        }
        onActivityFullscreen(false);
        if (this.mRootView.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.mRootView.getParent()).removeView(this.mRootView);
        }
        if (this.mFullscreenStatus == FullscreenStatus.DetachingAttached) {
            this.mFullscreenStatus = FullscreenStatus.None;
            attach();
        } else {
            this.mFullscreenStatus = FullscreenStatus.None;
        }
        onToggleFullscreen(false);
        XWebLog.m21911i(TAG, "detach end");
    }

    public void disableJsCallback(boolean z) {
        XWebLog.m21911i(TAG, "disableJsCallback:" + z);
        this.mDisableJsCallback = z;
    }

    public void evaluteJavascript(boolean z, boolean z2) {
        if (this.mWebView != null && z2 && this.mVideoJs != null) {
            XWebLog.m21911i(TAG, "evaluteJavascript, isPageStart:" + z);
            String str = this.mVideoJs;
            if (z) {
                str = XWebFullscreenVideoUtil.addDOMLoadedEventJS(str);
            }
            this.mWebView.evaluateJavascript(str, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    XWebLog.m21911i(XWebNativeInterface.TAG, "evaluteJavascript, onReceiveValue:" + str);
                }
            });
        }
    }

    public boolean hasEnteredFullscreen() {
        return this.mIsFullscreen;
    }

    public void hideControlView() {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mControlView != null) {
                    XWebNativeInterface.this.mLayoutTitleBar.setVisibility(4);
                    XWebNativeInterface.this.mLayoutVideoControl.setVisibility(4);
                }
            }
        });
    }

    public void init(Activity activity, View view, View view2, Context context, String str) {
        this.mWebView = (WebView) view;
        this.mVideoJs = str;
    }

    public void initConfigs(Bundle bundle) {
        if (bundle != null) {
            this.mEnableMute = bundle.getBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_MUTE, false);
            this.mEnableSpeed = bundle.getBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_SPEED, false);
            XWebLog.m21911i(TAG, "initConfigs, before enableMute:" + this.mEnableMute + ", enableSpeed:" + this.mEnableSpeed);
            String str = this.mVideoJs;
            if (str != null && !str.contains(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_MUTE_KEYWORD)) {
                this.mEnableMute = false;
            }
            String str2 = this.mVideoJs;
            if (str2 != null && !str2.contains(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_RATE_CHANGE_KEYWORD)) {
                this.mEnableSpeed = false;
            }
            XWebLog.m21911i(TAG, "initConfigs, after enableMute:" + this.mEnableMute + ", enableSpeed:" + this.mEnableSpeed);
        }
    }

    public void initView() {
        if (!this.mHasInited) {
            WindowFocusChangedFrameLayout windowFocusChangedFrameLayout = new WindowFocusChangedFrameLayout(getContext());
            this.mRootView = windowFocusChangedFrameLayout;
            windowFocusChangedFrameLayout.setId(C106947R.C20125id.lvh);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.mBackgroundView = frameLayout;
            frameLayout.setId(C106947R.C20125id.lvg);
            GestureDetector gestureDetector = new GestureDetector(getContext(), this);
            this.mDetector = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            this.mScaleDetector = new ScaleGestureDetector(getContext(), this);
            this.mDetector.setIsLongpressEnabled(false);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C106947R.C106949layout.cji, (ViewGroup) null);
            this.mControlView = viewGroup;
            viewGroup.setVisibility(8);
            this.mLayoutTitleBar = (LinearLayout) this.mControlView.findViewById(C106947R.C20125id.fjv);
            ImageView imageView = (ImageView) this.mControlView.findViewById(C106947R.C20125id.f3_);
            this.mImageBack = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    XWebNativeInterface.this.videoExitFullscreen();
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.mProgressLoading = (ProgressBar) this.mControlView.findViewById(C106947R.C20125id.i7l);
            this.mLayoutStatus = (VideoStatusLayout) this.mControlView.findViewById(C106947R.C20125id.fju);
            ClickableFrameLayout clickableFrameLayout = (ClickableFrameLayout) this.mControlView.findViewById(C106947R.C20125id.fjf);
            this.mLayoutBlank = clickableFrameLayout;
            clickableFrameLayout.setGestureDetector(this.mDetector);
            this.mLayoutBlank.setOnTouchListener(new View.OnTouchListener() {
                private byte _hellAccFlag_;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    if (!XWebNativeInterface.this.mVideoIsEnterFullscreen) {
                        C117292a.m165362h(false, this, "com/tencent/xweb/extension/video/XWebNativeInterface$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    int action = motionEvent.getAction() & 255;
                    if (action == 1) {
                        int unused = XWebNativeInterface.this.mMode = 0;
                    } else if (action != 5) {
                        if (action == 6) {
                            int unused2 = XWebNativeInterface.this.mMode = 0;
                        }
                    } else if (motionEvent.getPointerCount() == 2) {
                        int unused3 = XWebNativeInterface.this.mMode = 1;
                    }
                    if (motionEvent.getAction() == 1 && XWebNativeInterface.this.mTouchStatus == 3) {
                        XWebNativeInterface xWebNativeInterface = XWebNativeInterface.this;
                        if (!xWebNativeInterface.checkIfLiveVideo(xWebNativeInterface.mVideoDuration)) {
                            double access$300 = (XWebNativeInterface.this.mVideoDuration * ((double) XWebNativeInterface.this.mNewVideoProgress)) / 100.0d;
                            XWebNativeInterface.this.updateVideoTime(access$300, true);
                            XWebNativeInterface.this.videoSeek(access$300);
                            int unused4 = XWebNativeInterface.this.mTouchStatus = 0;
                        }
                    }
                    if (XWebNativeInterface.this.mMode == 1) {
                        boolean onTouchEvent = XWebNativeInterface.this.mScaleDetector.onTouchEvent(motionEvent);
                        C117292a.m165362h(onTouchEvent, this, "com/tencent/xweb/extension/video/XWebNativeInterface$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return onTouchEvent;
                    }
                    GestureDetector access$700 = XWebNativeInterface.this.mDetector;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(motionEvent);
                    GestureDetector gestureDetector = access$700;
                    C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/xweb/extension/video/XWebNativeInterface$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                    boolean onTouchEvent2 = access$700.onTouchEvent((MotionEvent) aVar.mo10231a(0));
                    C117292a.m165360f(gestureDetector, onTouchEvent2, "com/tencent/xweb/extension/video/XWebNativeInterface$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                    C117292a.m165362h(onTouchEvent2, this, "com/tencent/xweb/extension/video/XWebNativeInterface$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return onTouchEvent2;
                }
            });
            this.mLayoutVideoControl = (LinearLayout) this.mControlView.findViewById(C106947R.C20125id.fjw);
            this.mLayoutProgress = this.mControlView.findViewById(C106947R.C20125id.fjm);
            this.mTvCurrentTime = (TextView) this.mControlView.findViewById(C106947R.C20125id.f361706tv_current_time);
            this.mTvTotalTime = (TextView) this.mControlView.findViewById(C106947R.C20125id.kyr);
            VideoPlayerSeekBar videoPlayerSeekBar = new VideoPlayerSeekBar(this.mControlView.findViewById(C106947R.C20125id.hxp));
            this.mSeekBar = videoPlayerSeekBar;
            videoPlayerSeekBar.setVideoPlayerSeekCallback(new VideoPlayerSeekBar.IVideoPlaySeekCallback() {
                public void onProgressChanged(float f, boolean z) {
                    if (z) {
                        double access$300 = (XWebNativeInterface.this.mVideoDuration * ((double) f)) / 100.0d;
                        XWebNativeInterface.this.updateVideoTime(access$300, false);
                        XWebNativeInterface.this.videoSeek(access$300);
                    }
                    XWebNativeInterface.this.startControlViewTimer();
                }

                public void onSeekPre() {
                    XWebNativeInterface.this.stopControlViewTimer();
                    XWebNativeInterface.this.showControlView();
                }
            });
            ImageView imageView2 = (ImageView) this.mControlView.findViewById(C106947R.C20125id.f3c);
            this.mImageMute = imageView2;
            if (this.mEnableMute) {
                imageView2.setVisibility(0);
                this.mImageMute.setOnClickListener(new View.OnClickListener() {
                    private byte _hellAccFlag_;

                    public void onClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        WXWebReporter.onClickFullscreenVideoMute();
                        XWebNativeInterface xWebNativeInterface = XWebNativeInterface.this;
                        xWebNativeInterface.videoMute(!xWebNativeInterface.mVideoMuted);
                        C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) this.mControlView.findViewById(C106947R.C20125id.khs);
            this.mTextViewRate = textView;
            if (this.mEnableSpeed) {
                textView.setVisibility(0);
                this.mTextViewRate.setOnClickListener(new View.OnClickListener() {
                    private byte _hellAccFlag_;

                    public void onClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        WXWebReporter.onClickFullscreenVideoSpeed();
                        XWebNativeInterface.this.hideControlView();
                        XWebNativeInterface.this.showLayoutRateView();
                        C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                textView.setVisibility(8);
            }
            ImageView imageView3 = (ImageView) this.mControlView.findViewById(C106947R.C20125id.f3b);
            this.mImageExit = imageView3;
            imageView3.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    XWebNativeInterface.this.videoExitFullscreen();
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            ImageView imageView4 = (ImageView) this.mControlView.findViewById(C106947R.C20125id.f3d);
            this.mImagePlay = imageView4;
            imageView4.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    XWebNativeInterface.this.videoChangeStatus();
                    XWebNativeInterface.this.startControlViewTimer();
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            FrameLayout frameLayout2 = (FrameLayout) this.mControlView.findViewById(C106947R.C20125id.fjn);
            this.mLayoutRate = frameLayout2;
            TextView textView2 = (TextView) frameLayout2.findViewById(C106947R.C20125id.kht);
            this.mTextViewRate05 = textView2;
            textView2.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WXWebReporter.onClickFullscreenVideoSpeed05();
                    XWebNativeInterface.this.videoPlaybackRate(0.5d);
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            TextView textView3 = (TextView) this.mLayoutRate.findViewById(C106947R.C20125id.khu);
            this.mTextViewRate075 = textView3;
            textView3.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WXWebReporter.onClickFullscreenVideoSpeed075();
                    XWebNativeInterface.this.videoPlaybackRate(0.75d);
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            TextView textView4 = (TextView) this.mLayoutRate.findViewById(C106947R.C20125id.khv);
            this.mTextViewRate10 = textView4;
            textView4.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WXWebReporter.onClickFullscreenVideoSpeed10();
                    XWebNativeInterface.this.videoPlaybackRate(1.0d);
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            TextView textView5 = (TextView) this.mLayoutRate.findViewById(C106947R.C20125id.khw);
            this.mTextViewRate15 = textView5;
            textView5.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WXWebReporter.onClickFullscreenVideoSpeed15();
                    XWebNativeInterface.this.videoPlaybackRate(1.5d);
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            TextView textView6 = (TextView) this.mLayoutRate.findViewById(C106947R.C20125id.khx);
            this.mTextViewRate20 = textView6;
            textView6.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WXWebReporter.onClickFullscreenVideoSpeed20();
                    XWebNativeInterface.this.videoPlaybackRate(2.0d);
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            TextView textView7 = (TextView) this.mLayoutRate.findViewById(C106947R.C20125id.khy);
            this.mTextViewRate30 = textView7;
            textView7.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WXWebReporter.onClickFullscreenVideoSpeed30();
                    XWebNativeInterface.this.videoPlaybackRate(3.0d);
                    C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.mHasInited = true;
        }
    }

    public void onActivityFullscreen(boolean z) {
        Activity tryGetActivity = tryGetActivity();
        if (tryGetActivity == null) {
            XWebLog.m21911i(TAG, "onActivityFullscreen, activity is null");
        } else if (z) {
            if ((tryGetActivity.getWindow().getAttributes().flags & 2048) != 0) {
                this.mOriginalForceNotFullscreen = true;
                tryGetActivity.getWindow().clearFlags(2048);
            } else {
                this.mOriginalForceNotFullscreen = false;
            }
            if ((tryGetActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.mOriginalFullscreen = true;
            } else {
                this.mOriginalFullscreen = false;
                tryGetActivity.getWindow().addFlags(1024);
            }
            if ((this.mRootView.getSystemUiVisibility() & 4096) == 0 || (this.mRootView.getSystemUiVisibility() & 4) == 0 || (this.mRootView.getSystemUiVisibility() & 2) == 0) {
                this.mImmersiveSticky = false;
                this.mLastSystemUiVisibility = this.mRootView.getSystemUiVisibility();
                WindowFocusChangedFrameLayout windowFocusChangedFrameLayout = this.mRootView;
                windowFocusChangedFrameLayout.setSystemUiVisibility(windowFocusChangedFrameLayout.getSystemUiVisibility() | 4096 | 4 | 2);
                return;
            }
            this.mImmersiveSticky = true;
        } else {
            if (this.mOriginalForceNotFullscreen) {
                tryGetActivity.getWindow().addFlags(2048);
            }
            if (!this.mOriginalFullscreen) {
                tryGetActivity.getWindow().clearFlags(1024);
            }
            if (!this.mImmersiveSticky) {
                this.mRootView.setSystemUiVisibility(this.mLastSystemUiVisibility);
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        videoChangeStatus();
        C117292a.m165362h(true, this, "com/tencent/xweb/extension/video/XWebNativeInterface", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.mTouchStatus = 0;
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onHideCustomView() {
        XWebLog.m21911i(TAG, "onHideCustomView");
        resumeFocus();
        detach();
        uninitView();
        this.mVideoView = null;
        WebChromeClient.CustomViewCallback customViewCallback = this.mCallback;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.mCallback = null;
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/xweb/extension/video/XWebNativeInterface", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public void onOrientationChanged(int i) {
        int i2;
        if (tryGetActivity() != null) {
            if (i >= 80 && i <= 100) {
                i2 = 8;
            } else if (i >= 260 && i <= 280) {
                i2 = 0;
            } else if (i >= 170 && i <= 190) {
                i2 = 9;
            } else if (i <= 10 || i >= 350) {
                i2 = 1;
            } else {
                return;
            }
            int i3 = this.mCurrentOrientation;
            if (i3 == i2) {
                return;
            }
            if (i3 == 0 || i3 == 8) {
                if (i2 == 0 || i2 == 8) {
                    XWebLog.m21911i(TAG, "onOrientationChanged, orientation:" + i + ", rotation:" + i2);
                    this.mCurrentOrientation = i2;
                    setRequestedOrientation(i2);
                }
            } else if (i3 != 1 && i3 != 9) {
            } else {
                if (i2 == 1 || i2 == 9) {
                    XWebLog.m21911i(TAG, "onOrientationChanged, orientation:" + i + ", rotation:" + i2);
                    this.mCurrentOrientation = i2;
                    setRequestedOrientation(i2);
                }
            }
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        float f3;
        if (!(motionEvent == null || motionEvent2 == null)) {
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (this.mControlView.getHeight() > this.mControlView.getWidth()) {
                f3 = (float) this.mControlView.getWidth();
                i = this.mControlView.getHeight();
            } else {
                f3 = (float) this.mControlView.getHeight();
                i = this.mControlView.getWidth();
            }
            float f4 = (float) i;
            int i2 = this.mTouchStatus;
            float f5 = 1.0f;
            if (i2 == 0) {
                double ceil = Math.ceil((double) (this.mWebView.getContext().getResources().getDisplayMetrics().density * 25.0f));
                if (Math.abs(x) - Math.abs(y) > 1.0f) {
                    double d = ceil * 2.0d;
                    if (((double) motionEvent.getX()) < d || ((double) motionEvent.getX()) > ((double) this.mControlView.getWidth()) - d) {
                        this.mTouchStatus = 0;
                    } else {
                        this.mTouchStatus = 3;
                    }
                } else {
                    resetAudioAndBrightness();
                    double d2 = ceil * 2.0d;
                    if (((double) motionEvent.getY()) < d2 || ((double) motionEvent.getY()) > ((double) this.mControlView.getHeight()) - d2) {
                        this.mTouchStatus = 0;
                    } else if (motionEvent.getX() < ((float) this.mControlView.getWidth()) / 2.0f) {
                        this.mTouchStatus = 2;
                    } else {
                        this.mTouchStatus = 1;
                    }
                }
            } else if (i2 == 1) {
                float f6 = y * -1.0f;
                double d3 = (double) (((((float) this.mMaxVideoVolume) * f6) / f3) * 1.2f);
                int i3 = (int) d3;
                if (i3 == 0 && Math.abs(d3) > 0.20000000298023224d) {
                    if (f6 > 0.0f) {
                        i3 = 1;
                    } else if (f6 < 0.0f) {
                        i3 = -1;
                    }
                }
                double d4 = this.mOldVideoVolume + ((double) i3);
                int i4 = this.mMaxVideoVolume;
                if (d4 > ((double) i4)) {
                    d4 = (double) i4;
                } else if (d4 < 0.0d) {
                    d4 = 0.0d;
                }
                this.mAudioManager.setStreamVolume(3, (int) d4, 4);
                this.mLayoutStatus.setVolumeProgress((int) ((d4 / ((double) Float.valueOf((float) this.mMaxVideoVolume).floatValue())) * 100.0d));
                this.mLayoutStatus.show();
            } else if (i2 == 2) {
                float f7 = (((y * -1.0f) / f3) * 1.2f) + this.mBrightness;
                if (f7 < 0.0f) {
                    f5 = 0.0f;
                } else if (f7 <= 1.0f) {
                    f5 = f7;
                }
                WindowManager.LayoutParams layoutParams = this.mLayoutParams;
                layoutParams.screenBrightness = f5;
                this.mWindow.setAttributes(layoutParams);
                this.mLayoutStatus.setBrightProgress((int) (f5 * 100.0f));
                this.mLayoutStatus.show();
            } else if (i2 == 3 && !checkIfLiveVideo(this.mVideoDuration)) {
                float x2 = motionEvent2.getX() - motionEvent.getX();
                float progress = this.mSeekBar.getProgress();
                this.mOldVideoProgress = progress;
                if (x2 > 0.0f) {
                    float f8 = (float) ((int) (progress + ((x2 / f4) * 100.0f)));
                    this.mNewVideoProgress = f8;
                    if (f8 > 100.0f) {
                        this.mNewVideoProgress = 100.0f;
                    }
                } else {
                    float f9 = (float) ((int) (progress + ((x2 / f4) * 100.0f)));
                    this.mNewVideoProgress = f9;
                    if (f9 < 0.0f) {
                        this.mNewVideoProgress = 0.0f;
                    }
                }
                this.mLayoutStatus.setVideoTimeProgress(getAllVideoTime((this.mVideoDuration * ((double) this.mNewVideoProgress)) / 100.0d));
                this.mLayoutStatus.show();
            }
        }
        return true;
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        XWebLog.m21911i(TAG, "onShowCustomView");
        initView();
        this.mVideoView = view;
        this.mCallback = customViewCallback;
        if (view != null || this.mWebView.isXWalkKernel()) {
            if (this.mWebView.isXWalkKernel()) {
                WXWebReporter.onXWWebViewOnShowCustomViewSpecial();
            } else if (this.mWebView.isSysKernel()) {
                WXWebReporter.onSysWebViewOnShowCustomViewSpecial();
            }
            attach();
        }
        fixFocus();
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (isLayoutRateViewVisible()) {
            hideLayoutRateView();
            return true;
        }
        stopControlViewTimer();
        switchControlView();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/xweb/extension/video/XWebNativeInterface", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/xweb/extension/video/XWebNativeInterface", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @JavascriptInterface
    public void onSpecialVideoEnterFullscreen(int i) {
        XWebLog.m21911i(TAG, "onSpecialVideoEnterFullscreen:" + i);
        WXWebReporter.onSpecialVideoEnterFullscreen(i, this.mWebView.isXWalkKernel());
    }

    @JavascriptInterface
    public void onSpecialVideoHook(int i) {
        XWebLog.m21911i(TAG, "onSpecialVideoHook:" + i);
        WXWebReporter.onSpecialVideoHook(i, this.mWebView.isXWalkKernel());
    }

    public void onToggleFullscreen(boolean z) {
        if (z) {
            this.mIsFullscreen = true;
            return;
        }
        this.mIsFullscreen = false;
        this.mVideoIsEnterFullscreen = false;
    }

    @JavascriptInterface
    public boolean onVideoEmptied() {
        XWebLog.m21911i(TAG, "onVideoEmptied");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback == null) {
            return false;
        }
        videoJsCallback.onVideoEmptied();
        return true;
    }

    @JavascriptInterface
    public void onVideoEnded() {
        XWebLog.m21911i(TAG, "onVideoEnded");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoEnded();
        }
    }

    @JavascriptInterface
    public void onVideoEnterFullscreen(boolean z, long j, double d, double d2, boolean z2, boolean z3, double d3, double d4, double[] dArr) {
        double d5;
        boolean z4 = z;
        double d6 = d;
        double d7 = d2;
        double d8 = d4;
        boolean isAccessibilityEnable = AccessibilityHelper.getInstance(getContext()).isAccessibilityEnable();
        XWebLog.m21911i(TAG, "onVideoEnterFullscreen, isVideoTag:" + z4 + ",width:" + d6 + ",height:" + d7 + ",pause:" + z2 + ",seeking:" + z3 + ",currentTime:" + d3 + ",duration:" + d8 + ", accessibility:" + isAccessibilityEnable);
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            d5 = d8;
            videoJsCallback.onVideoEnterFullscreen(z, j, d, d2, z2, z3, d3, d4, dArr);
        } else {
            d5 = d8;
        }
        if (this.mWebView.isXWalkKernel()) {
            WXWebReporter.onXWWebViewOnShowCustomViewSpecialNative();
        } else if (this.mWebView.isSysKernel()) {
            WXWebReporter.onSysWebViewOnShowCustomViewSpecialNative();
        }
        if (z4) {
            if (this.mWebView.isXWalkKernel()) {
                WXWebReporter.onXWWebViewOnShowCustomViewSpecialNativeVideo();
            } else if (this.mWebView.isSysKernel()) {
                WXWebReporter.onSysWebViewOnShowCustomViewSpecialNativeVideo();
            }
            this.mVideoIsEnterFullscreen = true;
        } else {
            this.mVideoIsEnterFullscreen = false;
        }
        this.mVideoId = j;
        this.mVideoDuration = d5;
        this.mVideoWidth = d6;
        this.mVideoHeight = d7;
        if (z3) {
            onVideoSeeking();
        } else {
            onVideoSeeked();
        }
        final double d9 = d;
        final double d15 = d2;
        final boolean z5 = z;
        runOnUIThread(new Runnable() {
            private byte _hellAccFlag_;

            public void run() {
                XWebNativeInterface.this.onVideoSizeChanged((int) d9, (int) d15);
                if (z5) {
                    XWebNativeInterface xWebNativeInterface = XWebNativeInterface.this;
                    if (xWebNativeInterface.checkIfLiveVideo(xWebNativeInterface.mVideoDuration)) {
                        XWebLog.m21911i(XWebNativeInterface.TAG, "onVideoEnterFullscreen, maybe live video");
                        View access$2500 = XWebNativeInterface.this.mLayoutProgress;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(4);
                        C117292a.m165358d(access$2500, aVar.mo10232b(), "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        access$2500.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(access$2500, "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        XWebNativeInterface.this.mTextViewRate.setVisibility(8);
                    } else {
                        View access$25002 = XWebNativeInterface.this.mLayoutProgress;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        C117292a.m165358d(access$25002, aVar2.mo10232b(), "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        access$25002.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(access$25002, "com/tencent/xweb/extension/video/XWebNativeInterface$34", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (XWebNativeInterface.this.mWebView.isXWalkKernel()) {
                        XWebNativeInterface xWebNativeInterface2 = XWebNativeInterface.this;
                        if (xWebNativeInterface2.getSurfaceView(xWebNativeInterface2.mVideoView) == null) {
                            XWebNativeInterface xWebNativeInterface3 = XWebNativeInterface.this;
                            if (xWebNativeInterface3.getTextureView(xWebNativeInterface3.mVideoView) == null) {
                                XWebLog.m21911i(XWebNativeInterface.TAG, "onVideoEnterFullscreen, xwalk kernel and video view has no surface view or texture view");
                                XWebNativeInterface.this.mBackgroundView.setBackgroundColor(0);
                                XWebNativeInterface.this.showControlView();
                                return;
                            }
                        }
                    }
                    XWebNativeInterface.this.mBackgroundView.setBackgroundColor(-16777216);
                    XWebNativeInterface.this.mRootView.setBackgroundColor(0);
                    XWebNativeInterface.this.showControlView();
                    return;
                }
                XWebNativeInterface.this.mBackgroundView.setBackgroundColor(0);
                XWebNativeInterface.this.mRootView.setBackgroundColor(-16777216);
            }
        });
        onVideoTimeUpdate(d3, d4, dArr);
        updateImagePlay(z2);
    }

    @JavascriptInterface
    public void onVideoError(int i, String str) {
        XWebLog.m21911i(TAG, "onVideoError");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoError(i, str);
        }
    }

    @JavascriptInterface
    public void onVideoExitFullscreen() {
        XWebLog.m21911i(TAG, "onVideoExitFullscreen");
        this.mVideoIsEnterFullscreen = false;
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoExitFullscreen();
        }
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mControlView != null) {
                    XWebNativeInterface.this.mControlView.setVisibility(8);
                }
            }
        });
    }

    @JavascriptInterface
    public void onVideoPause() {
        XWebLog.m21911i(TAG, "onVideoPause");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoPause();
        }
        updateImagePlay(true);
    }

    @JavascriptInterface
    public void onVideoPlay() {
        XWebLog.m21911i(TAG, "onVideoPlay");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoPlay();
        }
        updateImagePlay(false);
    }

    @JavascriptInterface
    public void onVideoPlaying() {
        XWebLog.m21911i(TAG, "onVideoPlaying");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoPlaying();
        }
        hideProgressLoading();
    }

    @JavascriptInterface
    public void onVideoRateChange(double d) {
        XWebLog.m21911i(TAG, "onVideoRateChange, rate:" + d);
        this.mVideoRate = d;
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoRateChange(d);
        }
    }

    @JavascriptInterface
    public void onVideoSeeked() {
        XWebLog.m21911i(TAG, "onVideoSeeked");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoSeeked();
        }
        hideProgressLoading();
    }

    @JavascriptInterface
    public void onVideoSeeking() {
        XWebLog.m21911i(TAG, "onVideoSeeking");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoSeeking();
        }
        showProgressLoading();
    }

    public void onVideoSizeChanged(int i, int i2) {
        Activity tryGetActivity = tryGetActivity();
        if (tryGetActivity == null) {
            XWebLog.m21911i(TAG, "onVideoSizeChanged, activity is null");
        } else if (i == 0 || i2 == 0) {
            XWebLog.m21911i(TAG, "onVideoSizeChanged width == 0 || height == 0 return");
        } else {
            if (this.mPreOrientation == -3) {
                this.mPreOrientation = tryGetActivity.getRequestedOrientation();
            }
            int i3 = 1;
            if (i <= i2) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(0);
                i3 = 0;
            }
            this.mCurrentOrientation = i3;
            XWebLog.m21911i(TAG, "onVideoSizeChanged, currentOrientation:" + i3);
            setAutoFix(i3, i, i2);
        }
    }

    @JavascriptInterface
    public void onVideoSizeUpdate(double d, double d2) {
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoSizeUpdate(d, d2);
        }
        if (this.mVideoHeight != d2 || this.mVideoWidth != d) {
            XWebLog.m21911i(TAG, "onVideoSizeUpdate width:" + d + ", height:" + d2);
            this.mVideoWidth = d;
            this.mVideoHeight = d2;
            final double d3 = d;
            final double d4 = d2;
            runOnUIThread(new Runnable() {
                public void run() {
                    XWebNativeInterface.this.onVideoSizeChanged((int) d3, (int) d4);
                }
            });
        }
    }

    @JavascriptInterface
    public void onVideoTimeUpdate(double d, double d2, double[] dArr) {
        this.mVideoDuration = d2;
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoTimeUpdate(d, d2, dArr);
        }
        updateVideoTime(d, true);
        updateVideoCache(d2, dArr);
    }

    @JavascriptInterface
    public void onVideoVolumeChange(boolean z) {
        XWebLog.m21911i(TAG, "onVideoVolumeChange, muted:" + z);
        this.mVideoMuted = z;
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoVolumeChange(z);
        }
        updateImageMute(this.mVideoMuted);
    }

    @JavascriptInterface
    public void onVideoWaiting() {
        XWebLog.m21911i(TAG, "onVideoWaiting");
        VideoJsCallback videoJsCallback = this.mVideoJsCallback;
        if (videoJsCallback != null) {
            videoJsCallback.onVideoWaiting();
        }
        showProgressLoading();
    }

    public void registerJavascriptInterface(Object obj) {
        try {
            new ReflectMethod(obj, "addJavascriptInterface", (Class<?>[]) new Class[]{Object.class, String.class}).invoke(this, XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JAVASCRIPT_INTERFACE);
        } catch (Exception e) {
            XWebLog.m21910e(TAG, "registerJavascriptInterface, error", e);
        }
    }

    public void resetAudioAndBrightness() {
        Activity tryGetActivity;
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) getContext().getSystemService("audio");
        }
        this.mMaxVideoVolume = this.mAudioManager.getStreamMaxVolume(3);
        this.mOldVideoVolume = (double) this.mAudioManager.getStreamVolume(3);
        if (this.mWindow == null && (tryGetActivity = tryGetActivity()) != null) {
            this.mWindow = tryGetActivity.getWindow();
        }
        Window window = this.mWindow;
        if (window != null && this.mLayoutParams == null) {
            this.mLayoutParams = window.getAttributes();
        }
        WindowManager.LayoutParams layoutParams = this.mLayoutParams;
        if (layoutParams != null) {
            float f = layoutParams.screenBrightness;
            this.mBrightness = f;
            if (f == -1.0f) {
                try {
                    this.mBrightness = (float) (((double) Settings.System.getInt(getContext().getContentResolver(), "screen_brightness")) / 256.0d);
                } catch (Settings.SettingNotFoundException e) {
                    XWebLog.m21910e(TAG, "get brightness error", e);
                }
            }
        }
    }

    public void runOnUIThread(final Runnable runnable) {
        if (!this.mDisableJsCallback) {
            C2014622 r0 = new Runnable() {
                public void run() {
                    if (XWebNativeInterface.this.mHasInited) {
                        runnable.run();
                    }
                }
            };
            Activity tryGetActivity = tryGetActivity();
            if (tryGetActivity != null) {
                tryGetActivity.runOnUiThread(r0);
            } else {
                this.mWebView.getView().post(r0);
            }
        }
    }

    public boolean setVideoJsCallback(Object obj) {
        XWebLog.m21911i(TAG, "setVideoJsCallback:" + obj);
        this.mVideoJsCallback = (VideoJsCallback) obj;
        return true;
    }

    public void showControlView() {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mControlView != null) {
                    XWebNativeInterface.this.mControlView.setVisibility(0);
                    XWebNativeInterface.this.mLayoutTitleBar.setVisibility(0);
                    XWebNativeInterface.this.mLayoutVideoControl.setVisibility(0);
                    XWebNativeInterface.this.startControlViewTimer();
                }
            }
        });
    }

    public void startControlViewTimer() {
        stopControlViewTimer();
        if (!AccessibilityHelper.getInstance(getContext()).isAccessibilityEnable()) {
            Timer timer = new Timer();
            this.mControlViewTimer = timer;
            timer.schedule(new TimerTask() {
                public void run() {
                    XWebNativeInterface.this.hideControlView();
                }
            }, 7000);
        }
    }

    public void stopControlViewTimer() {
        Timer timer = this.mControlViewTimer;
        if (timer != null) {
            timer.cancel();
            this.mControlViewTimer.purge();
            this.mControlViewTimer = null;
        }
    }

    public boolean supportSetRequestedOrientationCallback() {
        return true;
    }

    public void switchControlView() {
        if (!AccessibilityHelper.getInstance(getContext()).isAccessibilityEnable()) {
            if (this.mLayoutTitleBar.getVisibility() == 0) {
                hideControlView();
            } else {
                showControlView();
            }
        } else {
            showControlView();
        }
    }

    public void unRegisterActivityLifecycleCallback() {
        XWebLog.m21911i(TAG, "unRegisterActivityLifecycleCallback application:" + this.mApplication);
        Application application = this.mApplication;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            this.mApplication = null;
        }
    }

    public void uninitView() {
        if (this.mHasInited) {
            this.mHasInited = false;
            this.mTopViewParent = null;
            this.mRootView = null;
            this.mBackgroundView = null;
            GestureDetector gestureDetector = this.mDetector;
            if (gestureDetector != null) {
                gestureDetector.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
                this.mDetector = null;
            }
            this.mScaleDetector = null;
            this.mControlView = null;
            this.mSeekBar = null;
            this.mLayoutProgress = null;
            this.mProgressLoading = null;
            this.mTvCurrentTime = null;
            this.mTvTotalTime = null;
            this.mLayoutStatus = null;
            this.mLayoutBlank.setGestureDetector((GestureDetector) null);
            this.mLayoutBlank.setOnTouchListener((View.OnTouchListener) null);
            this.mLayoutBlank = null;
            this.mLayoutTitleBar = null;
            this.mLayoutVideoControl = null;
            this.mTextViewRate = null;
            this.mTextViewRate05 = null;
            this.mTextViewRate075 = null;
            this.mTextViewRate10 = null;
            this.mTextViewRate15 = null;
            this.mTextViewRate20 = null;
            this.mTextViewRate30 = null;
            this.mLayoutRate = null;
            this.mImageExit.setOnClickListener((View.OnClickListener) null);
            this.mImageExit = null;
            this.mImagePlay.setOnClickListener((View.OnClickListener) null);
            this.mImagePlay = null;
            this.mImageBack.setOnClickListener((View.OnClickListener) null);
            this.mImageBack = null;
            this.mImageMute.setOnClickListener((View.OnClickListener) null);
            this.mImageMute = null;
            XWebLog.m21911i(TAG, "uninitView");
        }
    }

    public void unsetAudioAndBrightness() {
        this.mAudioManager = null;
        this.mWindow = null;
        this.mLayoutParams = null;
    }

    public void updateImageMute(final boolean z) {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mImageMute == null) {
                    return;
                }
                if (z) {
                    XWebNativeInterface.this.mImageMute.setImageResource(C106947R.C106948drawable.b4f);
                    XWebNativeInterface.this.mImageMute.setContentDescription(XWebNativeInterface.this.getContext().getString(C106947R.string.lpu));
                    return;
                }
                XWebNativeInterface.this.mImageMute.setImageResource(C106947R.C106948drawable.b4g);
                XWebNativeInterface.this.mImageMute.setContentDescription(XWebNativeInterface.this.getContext().getString(C106947R.string.lpv));
            }
        });
    }

    public void updateImagePlay(final boolean z) {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mImagePlay == null) {
                    return;
                }
                if (z) {
                    XWebNativeInterface.this.mImagePlay.setImageResource(C106947R.C106948drawable.bd8);
                    XWebNativeInterface.this.mImagePlay.setContentDescription(XWebNativeInterface.this.getContext().getString(C106947R.string.lpx));
                    return;
                }
                XWebNativeInterface.this.mImagePlay.setImageResource(C106947R.C106948drawable.bd7);
                XWebNativeInterface.this.mImagePlay.setContentDescription(XWebNativeInterface.this.getContext().getString(C106947R.string.lpw));
            }
        });
    }

    public void updateVideoCache(final double d, final double[] dArr) {
        runOnUIThread(new Runnable() {
            public void run() {
                if (XWebNativeInterface.this.mSeekBar != null) {
                    XWebNativeInterface.this.mSeekBar.updateCacheProgress(d, dArr);
                }
            }
        });
    }

    public void updateVideoTime(final double d, final boolean z) {
        runOnUIThread(new Runnable() {
            public void run() {
                if (!(XWebNativeInterface.this.mSeekBar == null || !z || XWebNativeInterface.this.mVideoDuration == 0.0d)) {
                    XWebNativeInterface.this.mSeekBar.setProgress((float) ((d * 100.0d) / XWebNativeInterface.this.mVideoDuration), false);
                }
                if (XWebNativeInterface.this.mTvCurrentTime != null) {
                    XWebNativeInterface.this.mTvCurrentTime.setText(XWebNativeInterface.this.getCurrentVideoTime(d));
                }
                if (XWebNativeInterface.this.mTvTotalTime != null) {
                    XWebNativeInterface.this.mTvTotalTime.setText(XWebNativeInterface.this.getTotalVideoTime());
                }
            }
        });
    }

    public void videoChangeStatus() {
        XWebLog.m21911i(TAG, "xwebToJS, videoChangeStatus");
        this.mWebView.evaluateJavascript(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_PLAY, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoChangeStatus, result:" + str);
            }
        });
    }

    public void videoExitFullscreen() {
        XWebLog.m21911i(TAG, "xwebToJS, videoExitFullscreen");
        this.mWebView.evaluateJavascript(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_EXITFULLSCREEN, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoExitFullscreen, result:" + str);
            }
        });
    }

    public void videoMute(boolean z) {
        XWebLog.m21911i(TAG, "xwebToJS, videoMute muted:" + z);
        this.mWebView.evaluateJavascript(String.format(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_MUTE, new Object[]{Boolean.valueOf(z)}), new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoMute, result:" + str);
            }
        });
    }

    public void videoPause() {
        XWebLog.m21911i(TAG, "xwebToJS, videoPause");
        this.mWebView.evaluateJavascript(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_NEW_PAUSE, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoPause, result:" + str);
            }
        });
    }

    public void videoPlay() {
        XWebLog.m21911i(TAG, "xwebToJS, videoPlay");
        this.mWebView.evaluateJavascript(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_NEW_PLAY, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoPlay, result:" + str);
            }
        });
    }

    public void videoPlaybackRate(double d) {
        XWebLog.m21911i(TAG, "xwebToJS, videoPlaybackRate rate:" + d);
        hideLayoutRateView();
        this.mWebView.evaluateJavascript(String.format(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_RATE_CHANGE, new Object[]{Double.valueOf(d)}), new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoPlaybackRate, result:" + str);
            }
        });
    }

    public void videoSeek(double d) {
        XWebLog.m21911i(TAG, "xwebToJS, videoSeek time:" + d);
        this.mWebView.evaluateJavascript(String.format(XWebFullscreenVideoUtil.XWEB_FULLSCREEN_VIDEO_JS_FUNCTION_SEEK, new Object[]{Double.valueOf(d)}), new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                XWebLog.m21908d(XWebNativeInterface.TAG, "xwebToJS, videoSeek, result:" + str);
            }
        });
    }
}
