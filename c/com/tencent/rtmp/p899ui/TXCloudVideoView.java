package com.tencent.rtmp.p899ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.liteav.base.util.C104506j;
import com.tencent.liteav.base.util.LiteavLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.rtmp.ui.TXCloudVideoView */
public class TXCloudVideoView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    private static final int FOCUS_AREA_SIZE_IN_DP = 70;
    private static final String TAG = "TXCloudVideoView";
    private WeakReference<C106890b> mCallback;
    private final DashBoard mDashBoard;
    private final Rect mDashMargin;
    private final C106889a mDelayedTapRunnable;
    private boolean mEnableShowLog;
    private boolean mEnableTouchToFocus;
    private boolean mEnableZoom;
    private FocusIndicatorView mFocusIndicatorView;
    public Object mGLContext;
    private final Runnable mHideIndicatorViewRunnable;
    private float mLastScaleFactor;
    private float mScaleFactor;
    private final ScaleGestureDetector mScaleGestureDetector;
    private SurfaceView mSurfaceView;
    /* access modifiers changed from: private */
    public C106891a mTapListener;
    private String mUserId;
    private TextureView mVideoView;
    private C106892b mZoomListener;

    /* renamed from: com.tencent.rtmp.ui.TXCloudVideoView$b */
    public interface C106890b {
        void onShowLog(boolean z);
    }

    public TXCloudVideoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void hideIndicatorView() {
        FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView != null) {
            focusIndicatorView.setVisibility(8);
        }
    }

    private boolean isShowLogEnabled() {
        return this.mEnableShowLog;
    }

    private static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void repositionDashBoard() {
        removeView(this.mDashBoard);
        addView(this.mDashBoard);
    }

    private void setShowLogCallback(WeakReference<C106890b> weakReference) {
        this.mCallback = weakReference;
    }

    /* access modifiers changed from: private */
    public void showFocusViewInternal(int i, int i2, int i3, int i4) {
        if (i3 == getWidth() && i4 == getHeight()) {
            LiteavLog.m16904v(TAG, "show indicator view at (%d,%d)", Integer.valueOf(i), Integer.valueOf(i2));
            removeCallbacks(this.mHideIndicatorViewRunnable);
            int i5 = (int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
            int i6 = i5 / 2;
            layoutParams.leftMargin = C104506j.m139787a(i - i6, 0, getWidth() - i5);
            layoutParams.topMargin = C104506j.m139787a(i2 - i6, 0, getHeight() - i5);
            FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
            if (focusIndicatorView == null) {
                FocusIndicatorView focusIndicatorView2 = new FocusIndicatorView(getContext());
                this.mFocusIndicatorView = focusIndicatorView2;
                addView(focusIndicatorView2, layoutParams);
            } else if (indexOfChild(focusIndicatorView) != getChildCount() - 1) {
                removeView(this.mFocusIndicatorView);
                addView(this.mFocusIndicatorView, layoutParams);
            } else {
                this.mFocusIndicatorView.setLayoutParams(layoutParams);
            }
            this.mFocusIndicatorView.setVisibility(0);
            FocusIndicatorView focusIndicatorView3 = this.mFocusIndicatorView;
            focusIndicatorView3.startAnimation(focusIndicatorView3.f221372a);
            postDelayed(this.mHideIndicatorViewRunnable, TimeUnit.SECONDS.toMillis(1));
            return;
        }
        LiteavLog.m16901i(TAG, "ignore show indicator view when view size changed");
    }

    public void addVideoView(TextureView textureView) {
        TextureView textureView2 = this.mVideoView;
        if (textureView2 != null) {
            removeView(textureView2);
        }
        this.mVideoView = textureView;
        addView(textureView);
        repositionDashBoard();
    }

    public void clearLastFrame(boolean z) {
        if (z) {
            setVisibility(8);
        }
    }

    public void clearLog() {
        DashBoard dashBoard = this.mDashBoard;
        if (dashBoard != null) {
            dashBoard.f320085a.setLength(0);
            TextView textView = dashBoard.f320086b;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = dashBoard.f320087c;
            if (textView2 != null) {
                textView2.setText("");
            }
        }
    }

    public void disableLog(boolean z) {
    }

    public TextureView getHWVideoView() {
        return this.mVideoView;
    }

    public Object getOpenGLContext() {
        return this.mGLContext;
    }

    public SurfaceView getSurfaceView() {
        return this.mSurfaceView;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public TextureView getVideoView() {
        return this.mVideoView;
    }

    public void onDestroy() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        DashBoard dashBoard = this.mDashBoard;
        Rect rect = this.mDashMargin;
        dashBoard.mo155403a(rect.left, rect.top, rect.right, rect.bottom);
        this.mDashBoard.setStatusTextSize((float) (((double) px2dip(getContext(), (float) getWidth())) / 30.0d));
        this.mDashBoard.setEventTextSize((float) (((double) px2dip(getContext(), (float) getWidth())) / 25.0d));
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.mEnableZoom) {
            return false;
        }
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        float a = C104506j.m139786a(this.mScaleFactor + (scaleGestureDetector.getScaleFactor() - this.mLastScaleFactor), 0.0f, 1.0f);
        this.mScaleFactor = a;
        C106892b bVar = this.mZoomListener;
        if (bVar != null) {
            bVar.mo20923a(a);
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        return this.mEnableZoom;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            if (this.mEnableTouchToFocus) {
                C106889a aVar = this.mDelayedTapRunnable;
                int width = getWidth();
                int height = getHeight();
                Point point = aVar.f320097a;
                point.x = (int) motionEvent.getX();
                point.y = (int) motionEvent.getY();
                aVar.f320098b = width;
                aVar.f320099c = height;
                removeCallbacks(this.mDelayedTapRunnable);
                postDelayed(this.mDelayedTapRunnable, 100);
            }
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2 && this.mEnableZoom) {
            removeCallbacks(this.mDelayedTapRunnable);
            hideIndicatorView();
            this.mScaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.mEnableZoom) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            performClick();
        }
        return true;
    }

    public void removeVideoView() {
        TextureView textureView = this.mVideoView;
        if (textureView != null) {
            removeView(textureView);
            this.mVideoView = null;
        }
        this.mSurfaceView = null;
    }

    public void setDashBoardMarginInPx(int i, int i2, int i3, int i4) {
        Rect rect = this.mDashMargin;
        rect.left = i;
        rect.right = i2;
        rect.top = i3;
        rect.bottom = i4;
        this.mDashBoard.mo155403a(i, i3, i2, i4);
    }

    public void setDashBoardMarginInRatio(float f, float f2, float f3, float f4) {
        final float f5 = f;
        final float f6 = f2;
        final float f7 = f3;
        final float f8 = f4;
        postDelayed(new Runnable() {
            public final void run() {
                TXCloudVideoView tXCloudVideoView = TXCloudVideoView.this;
                tXCloudVideoView.setDashBoardMarginInPx((int) (((float) tXCloudVideoView.getWidth()) * f5), (int) (((float) TXCloudVideoView.this.getWidth()) * f6), (int) (((float) TXCloudVideoView.this.getHeight()) * f7), (int) (((float) TXCloudVideoView.this.getHeight()) * f8));
            }
        }, 100);
    }

    public void setLogMargin(float f, float f2, float f3, float f4) {
        setDashBoardMarginInPx((int) f, (int) f2, (int) f3, (int) f4);
    }

    public void setOpenGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setTouchToFocusEnabled(boolean z, C106891a aVar) {
        this.mEnableTouchToFocus = z;
        this.mTapListener = aVar;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void setZoomEnabled(boolean z, C106892b bVar) {
        LiteavLog.m16901i(TAG, "setZoomEnabled: ".concat(String.valueOf(z)));
        this.mEnableZoom = z;
        this.mZoomListener = bVar;
    }

    public void showFocusView(int i, int i2, int i3, int i4) {
        post(C106894d.m144634a(this, i, i2, i3, i4));
    }

    public void showLog(boolean z) {
        this.mEnableShowLog = z;
        WeakReference<C106890b> weakReference = this.mCallback;
        C106890b bVar = weakReference == null ? null : weakReference.get();
        if (bVar != null) {
            bVar.onShowLog(z);
        }
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), (AttributeSet) null, surfaceView);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (SurfaceView) null);
    }

    /* renamed from: com.tencent.rtmp.ui.TXCloudVideoView$a */
    public class C106889a implements Runnable {

        /* renamed from: a */
        public final Point f320097a;

        /* renamed from: b */
        public int f320098b;

        /* renamed from: c */
        public int f320099c;

        private C106889a() {
            this.f320097a = new Point();
            this.f320098b = 0;
            this.f320099c = 0;
        }

        public final void run() {
            if (TXCloudVideoView.this.mTapListener != null) {
                C106891a access$100 = TXCloudVideoView.this.mTapListener;
                Point point = this.f320097a;
                access$100.mo20924a(point.x, point.y, this.f320098b, this.f320099c);
            }
        }

        public /* synthetic */ C106889a(TXCloudVideoView tXCloudVideoView, byte b) {
            this();
        }
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView) {
        super(context, attributeSet);
        this.mDashMargin = new Rect();
        this.mEnableTouchToFocus = false;
        this.mDelayedTapRunnable = new C106889a(this, (byte) 0);
        this.mEnableZoom = false;
        this.mUserId = "";
        this.mHideIndicatorViewRunnable = C106893c.m144633a(this);
        this.mDashBoard = new DashBoard(context);
        this.mSurfaceView = surfaceView;
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this);
    }
}
