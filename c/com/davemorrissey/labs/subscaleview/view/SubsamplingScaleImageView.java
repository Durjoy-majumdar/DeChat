package com.davemorrissey.labs.subscaleview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.davemorrissey.labs.subscaleview.C16932R;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory;
import com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory;
import com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory;
import com.davemorrissey.labs.subscaleview.model.IBitmapLoaderFactory;
import com.davemorrissey.labs.subscaleview.model.ILoadable;
import com.davemorrissey.labs.subscaleview.model.ITileInitLoaderFactory;
import com.davemorrissey.labs.subscaleview.model.ITileLoaderFactory;
import com.davemorrissey.labs.subscaleview.model.Tile;
import com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sn0.C90259e;

public class SubsamplingScaleImageView extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MAX_TILE_SIZE = 10000;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    public static int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public static final List<Integer> VALID_EASING_STYLES = Arrays.asList(new Integer[]{2, 1});
    private static final List<Integer> VALID_ORIENTATIONS = Arrays.asList(new Integer[]{0, 90, 180, 270, -1});
    private static final List<Integer> VALID_PAN_LIMITS = Arrays.asList(new Integer[]{1, 2, 3});
    private static final List<Integer> VALID_SCALE_TYPES = Arrays.asList(new Integer[]{2, 1, 3, 4});
    private static final List<Integer> VALID_ZOOM_STYLES = Arrays.asList(new Integer[]{1, 2, 3});
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static IBitmapLoaderFactory mBitmapLoader = new LegacyBitmapLoaderFactory();
    private static ITileInitLoaderFactory mTileInitLoader = new LegacyTileInitLoaderFactory();
    private static ITileLoaderFactory mTileLoader = new LegacyTileLoaderFactory();
    private static final float needScaleRate = 0.7f;
    private static Bitmap.Config preferredBitmapConfig = Bitmap.Config.ARGB_8888;
    public boolean IsinternalTouchEventConsumed;
    /* access modifiers changed from: private */
    public final String TAG;
    private byte _hellAccFlag_;
    private boolean allowInterceptTouch;
    /* access modifiers changed from: private */
    public Anim anim;
    /* access modifiers changed from: private */
    public Bitmap bitmap;
    private DecoderFactory<? extends ImageRegionDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean canDrawPreview;
    private boolean canRefresh;
    private boolean cancelled;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    /* access modifiers changed from: private */
    public Bitmap fullImageBitmap;
    private int fullImageSampleSize;
    private long fullImageTileLoadedEnd;
    private long fullImageTileLoadedStart;
    /* access modifiers changed from: private */
    public GestureDetector.SimpleOnGestureListener gestureDetectorListener;
    private Handler handler;
    private boolean horizontalLong;
    private boolean ignoreCancelEvent;
    private boolean imageLoadedSent;
    private boolean isFirstLoadFullImage;
    private boolean isPanning;
    private boolean isPreviewLoaded;
    /* access modifiers changed from: private */
    public boolean isQuickScaling;
    private boolean isSwipingXEdge;
    private boolean isSwipingYDown;
    private boolean isSwipingYEdge;
    /* access modifiers changed from: private */
    public boolean isZooming;
    private MotionEvent lastMotionEvent;
    private boolean mDrawFullSampleSizeBitmap;
    private Matrix mDrawableMatrix;
    private EdgeSwipeListener mEdgeSwipeListener;
    private float mHeightScale;
    private ImageDecodeRecord mImageDecodeRecord;
    private ImageSource mMainImageSource;
    private float mMaxZoomScale;
    private boolean mNeedPendingScale;
    private boolean mNeedScaleAndCenterWhenImageLoaded;
    private boolean mPreviewDone;
    private float mPreviewHeightScaleRate;
    private float mPreviewScaleRate;
    private ImageSource mPreviewSource;
    private float mPreviewWidthScaleRate;
    private float mScaleRate;
    private float mScreenExtraScale;
    private Matrix mSuppMatrix;
    private LinkedList<ILoadable> mTileLoadTaskList;
    private int mViewHeight;
    private int mViewWidth;
    private float mWidthScale;
    private Matrix matrix;
    private float[] matrixValues;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    /* access modifiers changed from: private */
    public int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private View.OnAttachStateChangeListener onAttachStateChangeListener;
    /* access modifiers changed from: private */
    public GestureDetector.OnDoubleTapListener onDoubleTapListener;
    /* access modifiers changed from: private */
    public OnImageEventListener onImageEventListener;
    /* access modifiers changed from: private */
    public View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private View.OnTouchListener onTouchListener;
    private int orientation;
    private Rect pRegion;
    /* access modifiers changed from: private */
    public boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    private int previewHeight;
    private int previewOrientation;
    private int previewWidth;
    /* access modifiers changed from: private */
    public boolean quickScaleEnabled;
    /* access modifiers changed from: private */
    public float quickScaleLastDistance;
    /* access modifiers changed from: private */
    public boolean quickScaleMoved;
    /* access modifiers changed from: private */
    public PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    /* access modifiers changed from: private */
    public PointF quickScaleVLastPoint;
    /* access modifiers changed from: private */
    public PointF quickScaleVStart;
    /* access modifiers changed from: private */
    public boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    /* access modifiers changed from: private */
    public int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    /* access modifiers changed from: private */
    public float scale;
    /* access modifiers changed from: private */
    public float scaleStart;
    private GestureDetector singleDetector;
    private float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<Tile>> tileMap;
    private float tmpScale;
    private Uri uri;
    /* access modifiers changed from: private */
    public PointF vCenterStart;
    private float vDistStart;
    private PointF vResetCenter;
    /* access modifiers changed from: private */
    public PointF vTranslate;
    private PointF vTranslateBefore;
    /* access modifiers changed from: private */
    public PointF vTranslateStart;
    private boolean verticalLong;
    private float x_down;
    private float y_down;
    /* access modifiers changed from: private */
    public boolean zoomEnabled;
    private int zoomScaleDuration;

    public static class Anim {
        /* access modifiers changed from: private */
        public long duration;
        /* access modifiers changed from: private */
        public int easing;
        /* access modifiers changed from: private */
        public boolean interruptible;
        /* access modifiers changed from: private */
        public OnAnimationEventListener listener;
        /* access modifiers changed from: private */
        public int origin;
        /* access modifiers changed from: private */
        public PointF sCenterEnd;
        /* access modifiers changed from: private */
        public PointF sCenterEndRequested;
        /* access modifiers changed from: private */
        public PointF sCenterStart;
        /* access modifiers changed from: private */
        public float scaleEnd;
        /* access modifiers changed from: private */
        public float scaleStart;
        /* access modifiers changed from: private */
        public long time;
        /* access modifiers changed from: private */
        public PointF vFocusEnd;
        /* access modifiers changed from: private */
        public PointF vFocusStart;

        private Anim() {
            this.duration = 200;
            this.interruptible = true;
            this.easing = 2;
            this.origin = 1;
            this.time = System.currentTimeMillis();
        }
    }

    public static class DefaultOnAnimationEventListener implements OnAnimationEventListener {
        public void onComplete() {
        }

        public void onInterruptedByNewAnim() {
        }

        public void onInterruptedByUser() {
        }
    }

    public static class DefaultOnImageEventListener implements OnImageEventListener {
        public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
        }

        public void onImageLoaded(Bitmap bitmap) {
        }

        public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
        }

        public void onPreviewLoaded() {
        }

        public void onPreviewReleased() {
        }

        public void onReady() {
        }

        public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
        }
    }

    public interface EdgeSwipeListener {
        void onSwipeXEdge(MotionEvent motionEvent);

        void onSwipeXEdgeEnd(MotionEvent motionEvent);

        void onSwipeYEdge(MotionEvent motionEvent, boolean z);

        void onSwipeYEdgeEnd(MotionEvent motionEvent, boolean z);

        void onSwipeYEdgeStart(MotionEvent motionEvent, boolean z);
    }

    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    public interface OnImageEventListener {
        void onImageLoadError(ImageDecodeResult imageDecodeResult);

        void onImageLoaded(Bitmap bitmap);

        void onPreviewLoadError(ImageDecodeResult imageDecodeResult);

        void onPreviewLoaded();

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(ImageDecodeResult imageDecodeResult);
    }

    public static class ScaleAndTranslate {
        /* access modifiers changed from: private */
        public float scale;
        /* access modifiers changed from: private */
        public PointF vTranslate;

        private ScaleAndTranslate(float f, PointF pointF) {
            this.scale = f;
            this.vTranslate = pointF;
        }
    }

    public static class DefaultOnStateChangedListener implements OnStateChangedListener {
        public void onCenterChanged(PointF pointF, int i) {
        }

        public void onScaleChanged(float f, float f2, int i) {
        }
    }

    public interface OnStateChangedListener {
        void onCenterChanged(PointF pointF, int i);

        void onScaleChanged(float f, float f2, int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        Class<SkiaImageRegionDecoder> cls = SkiaImageRegionDecoder.class;
        StringBuilder sb = new StringBuilder();
        Class<SubsamplingScaleImageView> cls2 = SubsamplingScaleImageView.class;
        sb.append("SubsamplingScaleImageView");
        sb.append(hashCode());
        this.TAG = sb.toString();
        this.isFirstLoadFullImage = true;
        this.fullImageTileLoadedStart = -1;
        this.fullImageTileLoadedEnd = -1;
        this.verticalLong = false;
        this.horizontalLong = false;
        this.debug = false;
        this.orientation = -1;
        this.maxScale = 2.0f;
        this.minScale = minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 3;
        int i = TILE_SIZE_AUTO;
        this.maxTileWidth = i;
        this.maxTileHeight = i;
        this.eagerLoadingEnabled = true;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 2.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = 200;
        this.zoomScaleDuration = 200;
        this.canRefresh = true;
        this.onDoubleTapListener = null;
        this.allowInterceptTouch = true;
        this.ignoreCancelEvent = false;
        this.lastMotionEvent = null;
        this.matrixValues = new float[9];
        this.tmpScale = 0.0f;
        this.previewOrientation = 0;
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.bitmapDecoderFactory = new CompatDecoderFactory(cls);
        this.regionDecoderFactory = new CompatDecoderFactory(cls);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.mTileLoadTaskList = new LinkedList<>();
        this.cancelled = false;
        this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.mScreenExtraScale = 1.0f;
        this.mMaxZoomScale = 20.0f;
        this.mPreviewDone = true;
        this.mDrawFullSampleSizeBitmap = false;
        this.mNeedScaleAndCenterWhenImageLoaded = false;
        this.mImageDecodeRecord = new ImageDecodeRecord();
        this.mEdgeSwipeListener = new EdgeSwipeListener() {
            public void onSwipeXEdge(MotionEvent motionEvent) {
            }

            public void onSwipeXEdgeEnd(MotionEvent motionEvent) {
            }

            public void onSwipeYEdge(MotionEvent motionEvent, boolean z) {
            }

            public void onSwipeYEdgeEnd(MotionEvent motionEvent, boolean z) {
            }

            public void onSwipeYEdgeStart(MotionEvent motionEvent, boolean z) {
            }
        };
        this.isSwipingXEdge = false;
        this.isSwipingYEdge = false;
        this.isSwipingYDown = false;
        this.IsinternalTouchEventConsumed = true;
        this.density = getResources().getDisplayMetrics().density;
        setDoubleTapZoomScale(2.0f);
        setMinimumTileDpi(C0947jz.f2205e);
        setGestureDetector(context);
        initImageView();
        this.handler = new Handler(new Handler.Callback() {
            public boolean handleMessage(Message message) {
                if (message.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                    int unused = SubsamplingScaleImageView.this.maxTouchCount = 0;
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener((View.OnLongClickListener) null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16932R.styleable.SubsamplingScaleImageView);
            int i2 = C16932R.styleable.SubsamplingScaleImageView_assetName;
            if (obtainStyledAttributes.hasValue(i2) && (string = obtainStyledAttributes.getString(i2)) != null && string.length() > 0) {
                setImage(ImageSource.asset(string).tilingEnabled());
            }
            int i3 = C16932R.styleable.SubsamplingScaleImageView_src;
            if (obtainStyledAttributes.hasValue(i3) && (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) > 0) {
                setImage(ImageSource.resource(resourceId).tilingEnabled());
            }
            int i4 = C16932R.styleable.SubsamplingScaleImageView_panEnabled;
            if (obtainStyledAttributes.hasValue(i4)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(i4, true));
            }
            int i5 = C16932R.styleable.SubsamplingScaleImageView_zoomEnabled;
            if (obtainStyledAttributes.hasValue(i5)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(i5, true));
            }
            int i6 = C16932R.styleable.SubsamplingScaleImageView_quickScaleEnabled;
            if (obtainStyledAttributes.hasValue(i6)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(i6, true));
            }
            int i7 = C16932R.styleable.SubsamplingScaleImageView_tileBackgroundColor;
            if (obtainStyledAttributes.hasValue(i7)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(i7, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
        float f = ((float) getContext().getResources().getDisplayMetrics().widthPixels) / 720.0f;
        if (f > 1.0f) {
            this.mScreenExtraScale = f;
        }
    }

    private int calculateInSampleSize(float f) {
        int i;
        if (this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= ((float) this.minimumTileDpi) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int sWidth2 = (int) (((float) sWidth()) * f);
        int sHeight2 = (int) (((float) sHeight()) * f);
        if (sWidth2 == 0 || sHeight2 == 0) {
            return 32;
        }
        int i2 = 1;
        if (sHeight() > sHeight2 || sWidth() > sWidth2) {
            i = Math.round(((float) sHeight()) / ((float) sHeight2));
            int round = Math.round(((float) sWidth()) / ((float) sWidth2));
            if (i >= round) {
                i = round;
            }
        } else {
            i = 1;
        }
        while (true) {
            int i3 = i2 * 2;
            if (i3 >= i) {
                return i2;
            }
            i2 = i3;
        }
    }

    private void cancelAllTileLoadTask() {
        if (!this.cancelled) {
            this.cancelled = true;
            Log.m105925i(this.TAG, "alvinluo cancelAllTileLoadTask, task size: %d", Integer.valueOf(this.mTileLoadTaskList.size()));
            Iterator<ILoadable> it = this.mTileLoadTaskList.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.mTileLoadTaskList.clear();
        }
    }

    private boolean checkImageLoaded() {
        boolean isBaseLayerReady = isBaseLayerReady();
        if (!this.imageLoadedSent && isBaseLayerReady) {
            preDraw();
            this.imageLoadedSent = true;
            onImageLoaded();
        }
        return isBaseLayerReady;
    }

    private boolean checkReady() {
        boolean z = getWidth() > 0 && getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || isBaseLayerReady());
        if (!this.readySent && z) {
            preDraw();
            this.readySent = true;
            onReady();
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null) {
                onImageEventListener2.onReady();
            }
        }
        return z;
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            Paint paint2 = new Paint();
            this.debugTextPaint = paint2;
            paint2.setTextSize((float) m16639px(20));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.debugLinePaint = paint3;
            paint3.setColor(-65281);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth((float) m16639px(1));
        }
    }

    private float distance(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    private void drawBitmap(Canvas canvas) {
        if (this.matrix == null) {
            this.matrix = new Matrix();
        }
        this.matrix.reset();
        int width = this.bitmap.getWidth();
        int height = this.bitmap.getHeight();
        int i = this.previewOrientation;
        if (i == 90 || i == 270) {
            width = this.bitmap.getHeight();
            height = this.bitmap.getWidth();
        }
        if (this.bitmapIsPreview) {
            initPreviewScale();
            this.matrix.postScale(this.mPreviewWidthScaleRate, this.mPreviewHeightScaleRate, ((float) width) / 2.0f, ((float) height) / 2.0f);
        }
        float width2 = (float) ((this.mViewWidth - this.bitmap.getWidth()) / 2);
        float height2 = (float) ((this.mViewHeight - this.bitmap.getHeight()) / 2);
        this.matrix.postTranslate(width2, height2);
        Log.m105919d(this.TAG, "alvinluo onDraw offsetX: %f, offsetY: %f", Float.valueOf(width2), Float.valueOf(height2));
        if (this.tileBgPaint != null) {
            if (this.sRect == null) {
                this.sRect = new RectF();
            }
            this.sRect.set(0.0f, 0.0f, (float) (this.bitmapIsPreview ? this.bitmap.getWidth() : this.sWidth), (float) (this.bitmapIsPreview ? this.bitmap.getHeight() : this.sHeight));
            this.matrix.mapRect(this.sRect);
            canvas.drawRect(this.sRect, this.tileBgPaint);
        }
        canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
    }

    private float ease(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return easeOutQuad(j, f, f2, j2);
        }
        if (i == 2) {
            return easeInOutQuad(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }

    private float easeInOutQuad(long j, float f, float f2, long j2) {
        float f3;
        float f4 = ((float) j) / (((float) j2) / 2.0f);
        if (f4 < 1.0f) {
            f3 = (f2 / 2.0f) * f4;
        } else {
            float f5 = f4 - 1.0f;
            f3 = (-f2) / 2.0f;
            f4 = (f5 * (f5 - 2.0f)) - 1.0f;
        }
        return (f3 * f4) + f;
    }

    private float easeOutQuad(long j, float f, float f2, long j2) {
        float f3 = ((float) j) / ((float) j2);
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    /* access modifiers changed from: private */
    public void fitToBounds(boolean z, ScaleAndTranslate scaleAndTranslate) {
        float f;
        float f2;
        int i;
        if (this.panLimit == 2 && isReady()) {
            z = false;
        }
        PointF access$4500 = scaleAndTranslate.vTranslate;
        float limitedScale = limitedScale(scaleAndTranslate.scale);
        float sWidth2 = ((float) sWidth()) * limitedScale;
        float sHeight2 = ((float) sHeight()) * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            access$4500.x = Math.max(access$4500.x, ((float) (getWidth() / 2)) - sWidth2);
            access$4500.y = Math.max(access$4500.y, ((float) (getHeight() / 2)) - sHeight2);
        } else if (z) {
            access$4500.x = Math.max(access$4500.x, ((float) getWidth()) - sWidth2);
            access$4500.y = Math.max(access$4500.y, ((float) getHeight()) - sHeight2);
        } else {
            access$4500.x = Math.max(access$4500.x, -sWidth2);
            access$4500.y = Math.max(access$4500.y, -sHeight2);
        }
        float f3 = 0.5f;
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? ((float) getPaddingLeft()) / ((float) (getPaddingLeft() + getPaddingRight())) : 0.5f;
        if (getPaddingTop() > 0 || getPaddingBottom() > 0) {
            f3 = ((float) getPaddingTop()) / ((float) (getPaddingTop() + getPaddingBottom()));
        }
        if (this.panLimit == 3 && isReady()) {
            f = (float) Math.max(0, getWidth() / 2);
            i = Math.max(0, getHeight() / 2);
        } else if (z) {
            f = Math.max(0.0f, (((float) getWidth()) - sWidth2) * paddingLeft);
            f2 = Math.max(0.0f, (((float) getHeight()) - sHeight2) * f3);
            access$4500.x = Math.min(access$4500.x, f);
            access$4500.y = Math.min(access$4500.y, f2);
            float unused = scaleAndTranslate.scale = limitedScale;
        } else {
            f = (float) Math.max(0, getWidth());
            i = Math.max(0, getHeight());
        }
        f2 = (float) i;
        access$4500.x = Math.min(access$4500.x, f);
        access$4500.y = Math.min(access$4500.y, f2);
        float unused2 = scaleAndTranslate.scale = limitedScale;
    }

    private float getDoubleTapZoomScale() {
        float f = this.mScaleRate;
        float f2 = this.mWidthScale;
        if (f2 * needScaleRate <= f) {
            f2 = this.mHeightScale;
            if (needScaleRate * f2 <= f) {
                f2 = this.doubleTapZoomScale * f;
            }
        }
        if (((double) f2) < 1.0d) {
            f2 = 1.0f;
        }
        float f3 = this.maxScale;
        return f2 > f3 ? f3 : f2;
    }

    private Point getMaxBitmapDimensions(Canvas canvas) {
        int min = Math.min(canvas.getMaximumBitmapWidth(), this.maxTileWidth);
        int min2 = Math.min(canvas.getMaximumBitmapHeight(), this.maxTileHeight);
        if (min > 10000) {
            min = 10000;
        }
        if (min2 > 10000) {
            min2 = 10000;
        }
        Log.m105925i(this.TAG, "alvinluo getMaxBitmapDimensions %d, %d", Integer.valueOf(min), Integer.valueOf(min2));
        return new Point(min, min2);
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    private void initImageView() {
        this.mSuppMatrix = new Matrix();
    }

    private void initMaxScale() {
        this.maxScale = getDoubleTapZoomScale() * 2.0f * this.mScreenExtraScale;
    }

    private void initMinScale() {
        this.minScale = Math.min(minScale(), this.mScaleRate * 0.75f);
    }

    private void initPreviewScale() {
        if (this.bitmap != null && this.bitmapIsPreview) {
            int sWidth2 = sWidth();
            int sHeight2 = sHeight();
            float f = (float) sWidth2;
            float f2 = (float) sHeight2;
            boolean z = f > f2 * 2.2f;
            this.horizontalLong = z;
            boolean z2 = f2 > f * 2.2f;
            this.verticalLong = z2;
            this.horizontalLong = z && sWidth2 > this.mViewWidth;
            this.verticalLong = z2 && sHeight2 > this.mViewHeight;
            initScaleRate();
            if (this.verticalLong) {
                this.mPreviewWidthScaleRate = (((float) this.mViewWidth) * 1.0f) / ((float) previewWidth());
                this.mPreviewHeightScaleRate = (((float) this.mViewHeight) * 1.0f) / ((float) previewHeight());
            } else if (this.horizontalLong) {
                this.mPreviewWidthScaleRate = (((float) this.mViewWidth) * 1.0f) / ((float) previewWidth());
                this.mPreviewHeightScaleRate = (this.mScaleRate * ((float) sHeight())) / ((float) previewHeight());
            } else {
                this.mPreviewWidthScaleRate = (this.mScaleRate * ((float) sWidth())) / ((float) previewWidth());
                this.mPreviewHeightScaleRate = (this.mScaleRate * ((float) sHeight())) / ((float) previewHeight());
            }
            Log.m105925i(this.TAG, "alvinluo initPreviewScaleRate previewWidthScale: %f, previewHeightScale: %f, previewHeight: %d, previewWidth: %d, verticalLong: %b, horizontalLong: %b, %s", Float.valueOf(this.mPreviewWidthScaleRate), Float.valueOf(this.mPreviewHeightScaleRate), Integer.valueOf(previewHeight()), Integer.valueOf(previewWidth()), Boolean.valueOf(this.verticalLong), Boolean.valueOf(this.horizontalLong), this.mMainImageSource.getUri().toString());
        }
    }

    private synchronized void initialiseBaseLayer(Point point) {
        debug("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        this.satTemp = scaleAndTranslate;
        fitToBounds(true, scaleAndTranslate);
        this.fullImageSampleSize = calculateInSampleSize(this.satTemp.scale);
        initialiseTileMap(point);
        for (Tile newLoadTask : this.tileMap.get(Integer.valueOf(this.fullImageSampleSize))) {
            Log.m105925i(this.TAG, "alvinluo tile fullSampleSize: %d", Integer.valueOf(this.fullImageSampleSize));
            newLoadTask(newLoadTask);
        }
        refreshRequiredTiles(true);
    }

    private void initialiseTileMap(Point point) {
        Point point2 = point;
        int i = 1;
        debug("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point2.x), Integer.valueOf(point2.y));
        this.tileMap = new LinkedHashMap();
        int i2 = this.fullImageSampleSize;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int sWidth2 = sWidth() / i3;
            int sHeight2 = sHeight() / i4;
            int i5 = sWidth2 / i2;
            int i6 = sHeight2 / i2;
            while (true) {
                if (i5 + i3 + i > point2.x || (((double) i5) > ((double) getWidth()) * 1.25d && i2 < this.fullImageSampleSize)) {
                    i3++;
                    sWidth2 = sWidth() / i3;
                    i5 = sWidth2 / i2;
                    i = 1;
                }
            }
            while (true) {
                if (i6 + i4 + i > point2.y || (((double) i6) > ((double) getHeight()) * 1.25d && i2 < this.fullImageSampleSize)) {
                    i4++;
                    sHeight2 = sHeight() / i4;
                    i6 = sHeight2 / i2;
                    i = 1;
                }
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    Tile tile = new Tile();
                    tile.sampleSize = i2;
                    tile.visible = i2 == this.fullImageSampleSize;
                    tile.sRect = new Rect(i7 * sWidth2, i8 * sHeight2, i7 == i3 + -1 ? sWidth() : (i7 + 1) * sWidth2, i8 == i4 + -1 ? sHeight() : (i8 + 1) * sHeight2);
                    tile.vRect = new Rect(0, 0, 0, 0);
                    tile.fileSRect = new Rect(tile.sRect);
                    arrayList.add(tile);
                    i8++;
                }
                i7++;
            }
            this.tileMap.put(Integer.valueOf(i2), arrayList);
            if (i2 != 1) {
                i2 /= 2;
                i = 1;
            } else {
                return;
            }
        }
    }

    private float invertViewX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return 0.0f;
        }
        float f2 = (f - pointF.x) / this.scale;
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return 0.0f;
        }
        return f2;
    }

    private float invertViewY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return 0.0f;
        }
        float f2 = (f - pointF.y) / this.scale;
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return 0.0f;
        }
        return f2;
    }

    private boolean isBaseLayerReady() {
        boolean z = true;
        if (this.bitmap != null && !this.bitmapIsPreview) {
            return true;
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map == null) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((Integer) next.getKey()).intValue() == this.fullImageSampleSize) {
                for (Tile tile : (List) next.getValue()) {
                    if (tile.loading || tile.bitmap == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public PointF limitedSCenter(float f, float f2, float f3, PointF pointF) {
        PointF vTranslateForSCenter = vTranslateForSCenter(f, f2, f3);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - vTranslateForSCenter.x) / f3, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - vTranslateForSCenter.y) / f3);
        return pointF;
    }

    /* access modifiers changed from: private */
    public float limitedScale(float f) {
        return Math.max(minScale(), f);
    }

    private float minScale() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.minimumScaleType;
        if (i == 2 || i == 4) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) sWidth()), ((float) (getHeight() - paddingBottom)) / ((float) sHeight()));
        }
        if (i == 3) {
            float f = this.minScale;
            if (f > 0.0f) {
                return f;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) sWidth()), ((float) (getHeight() - paddingBottom)) / ((float) sHeight()));
    }

    private void newLoadTask(Tile tile) {
        if (this.cancelled) {
            Log.m105924i(this.TAG, "alvinluo newLoadTask, has cancelled and ignore");
            return;
        }
        ILoadable newInstance = mTileLoader.newInstance(this, this.decoder, tile);
        newInstance.startLoad();
        this.mTileLoadTaskList.add(newInstance);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r3 != 262) goto L_0x0471;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0468  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onTouchEventInternal(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r19.getPointerCount()
            int r3 = r19.getAction()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x055d
            r8 = 3
            if (r3 == r7) goto L_0x0472
            r9 = 6
            r10 = 5
            if (r3 == r5) goto L_0x002a
            if (r3 == r8) goto L_0x0472
            if (r3 == r10) goto L_0x055d
            if (r3 == r9) goto L_0x0472
            r9 = 261(0x105, float:3.66E-43)
            if (r3 == r9) goto L_0x055d
            r9 = 262(0x106, float:3.67E-43)
            if (r3 == r9) goto L_0x0472
            goto L_0x0471
        L_0x002a:
            int r3 = r0.maxTouchCount
            if (r3 <= 0) goto L_0x0456
            r3 = 4
            r11 = 1084227584(0x40a00000, float:5.0)
            if (r2 < r5) goto L_0x01d2
            r0.setDrawFullSampleSizeBitmap(r6)
            float r2 = r1.getX(r6)
            float r9 = r1.getX(r7)
            float r10 = r1.getY(r6)
            float r12 = r1.getY(r7)
            float r2 = r0.distance(r2, r9, r10, r12)
            float r9 = r1.getX(r6)
            float r10 = r1.getX(r7)
            float r9 = r9 + r10
            float r9 = r9 / r4
            float r10 = r1.getY(r6)
            float r1 = r1.getY(r7)
            float r10 = r10 + r1
            float r10 = r10 / r4
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r9, r10)
            r0.vResetCenter = r1
            boolean r1 = r0.zoomEnabled
            if (r1 == 0) goto L_0x0456
            android.graphics.PointF r1 = r0.vCenterStart
            float r12 = r1.x
            float r1 = r1.y
            float r1 = r0.distance(r12, r9, r1, r10)
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0087
            float r1 = r0.vDistStart
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0087
            boolean r1 = r0.isPanning
            if (r1 == 0) goto L_0x0456
        L_0x0087:
            r0.isZooming = r7
            r0.isPanning = r7
            float r1 = r0.scale
            double r11 = (double) r1
            float r1 = r0.vDistStart
            float r1 = r2 / r1
            float r13 = r0.scaleStart
            float r1 = r1 * r13
            float r13 = r0.maxScale
            float r14 = r13 * r4
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 < 0) goto L_0x00a7
            float r4 = r4 * r13
            float r1 = r1 - r13
            r13 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r13
            float r1 = r1 + r4
        L_0x00a7:
            r0.scale = r1
            java.lang.String r1 = r0.TAG
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Double r4 = java.lang.Double.valueOf(r11)
            r3[r6] = r4
            float r4 = r0.scale
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3[r7] = r4
            float r4 = r18.minScale()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3[r5] = r4
            float r4 = r0.maxScale
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3[r8] = r4
            java.lang.String r4 = "alvinluo zoom preScale: %f, scale: %f, minScale: %f, maxScale: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r3)
            float r1 = r0.scale
            float r3 = r18.minScale()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x00f2
            r0.vDistStart = r2
            float r1 = r18.minScale()
            r0.scaleStart = r1
            android.graphics.PointF r1 = r0.vCenterStart
            r1.set(r9, r10)
            android.graphics.PointF r1 = r0.vTranslateStart
            android.graphics.PointF r2 = r0.vTranslate
            r1.set(r2)
            goto L_0x01c8
        L_0x00f2:
            boolean r1 = r0.panEnabled
            if (r1 == 0) goto L_0x0173
            android.graphics.PointF r1 = r0.vCenterStart
            float r3 = r1.x
            android.graphics.PointF r4 = r0.vTranslateStart
            float r5 = r4.x
            float r3 = r3 - r5
            float r1 = r1.y
            float r4 = r4.y
            float r1 = r1 - r4
            float r4 = r0.scale
            float r5 = r0.scaleStart
            float r8 = r4 / r5
            float r3 = r3 * r8
            float r4 = r4 / r5
            float r1 = r1 * r4
            android.graphics.PointF r4 = r0.vTranslate
            float r3 = r9 - r3
            r4.x = r3
            float r1 = r10 - r1
            r4.y = r1
            int r1 = r18.sHeight()
            double r3 = (double) r1
            double r3 = r3 * r11
            int r1 = r18.getHeight()
            double r13 = (double) r1
            int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x013b
            float r1 = r0.scale
            int r3 = r18.sHeight()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r18.getHeight()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x015d
        L_0x013b:
            int r1 = r18.sWidth()
            double r3 = (double) r1
            double r11 = r11 * r3
            int r1 = r18.getWidth()
            double r3 = (double) r1
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x01c8
            float r1 = r0.scale
            int r3 = r18.sWidth()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r18.getWidth()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x01c8
        L_0x015d:
            r0.fitToBounds(r7)
            android.graphics.PointF r1 = r0.vCenterStart
            r1.set(r9, r10)
            android.graphics.PointF r1 = r0.vTranslateStart
            android.graphics.PointF r3 = r0.vTranslate
            r1.set(r3)
            float r1 = r0.scale
            r0.scaleStart = r1
            r0.vDistStart = r2
            goto L_0x01c8
        L_0x0173:
            android.graphics.PointF r1 = r0.sRequestedCenter
            if (r1 == 0) goto L_0x019e
            android.graphics.PointF r1 = r0.vTranslate
            int r2 = r18.getWidth()
            int r2 = r2 / r5
            float r2 = (float) r2
            float r3 = r0.scale
            android.graphics.PointF r4 = r0.sRequestedCenter
            float r4 = r4.x
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.x = r2
            android.graphics.PointF r1 = r0.vTranslate
            int r2 = r18.getHeight()
            int r2 = r2 / r5
            float r2 = (float) r2
            float r3 = r0.scale
            android.graphics.PointF r4 = r0.sRequestedCenter
            float r4 = r4.y
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.y = r2
            goto L_0x01c8
        L_0x019e:
            android.graphics.PointF r1 = r0.vTranslate
            int r2 = r18.getWidth()
            int r2 = r2 / r5
            float r2 = (float) r2
            float r3 = r0.scale
            int r4 = r18.sWidth()
            int r4 = r4 / r5
            float r4 = (float) r4
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.x = r2
            android.graphics.PointF r1 = r0.vTranslate
            int r2 = r18.getHeight()
            int r2 = r2 / r5
            float r2 = (float) r2
            float r3 = r0.scale
            int r4 = r18.sHeight()
            int r4 = r4 / r5
            float r4 = (float) r4
            float r3 = r3 * r4
            float r2 = r2 - r3
            r1.y = r2
        L_0x01c8:
            r0.fitToBounds(r7)
            boolean r1 = r0.eagerLoadingEnabled
            r0.refreshRequiredTiles(r1)
            goto L_0x032c
        L_0x01d2:
            boolean r2 = r0.isQuickScaling
            if (r2 == 0) goto L_0x032f
            android.graphics.PointF r2 = r0.quickScaleVStart
            float r2 = r2.y
            float r3 = r19.getY()
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r4
            float r3 = r0.quickScaleThreshold
            float r2 = r2 + r3
            float r3 = r0.quickScaleLastDistance
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x01f2
            r0.quickScaleLastDistance = r2
        L_0x01f2:
            float r3 = r19.getY()
            android.graphics.PointF r4 = r0.quickScaleVLastPoint
            float r8 = r4.y
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0200
            r3 = 1
            goto L_0x0201
        L_0x0200:
            r3 = 0
        L_0x0201:
            float r1 = r19.getY()
            r8 = 0
            r4.set(r8, r1)
            float r1 = r0.quickScaleLastDistance
            float r1 = r2 / r1
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 - r1
            float r1 = java.lang.Math.abs(r1)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r9
            r9 = 1022739087(0x3cf5c28f, float:0.03)
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0224
            boolean r9 = r0.quickScaleMoved
            if (r9 == 0) goto L_0x0322
        L_0x0224:
            r0.quickScaleMoved = r7
            float r9 = r0.quickScaleLastDistance
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0232
            if (r3 == 0) goto L_0x0231
            float r1 = r1 + r4
            r4 = r1
            goto L_0x0232
        L_0x0231:
            float r4 = r4 - r1
        L_0x0232:
            float r1 = r0.scale
            double r9 = (double) r1
            float r1 = r18.minScale()
            float r3 = r0.maxScale
            float r11 = r0.scale
            float r11 = r11 * r4
            float r3 = java.lang.Math.min(r3, r11)
            float r1 = java.lang.Math.max(r1, r3)
            r0.scale = r1
            boolean r3 = r0.panEnabled
            if (r3 == 0) goto L_0x02cd
            android.graphics.PointF r3 = r0.vCenterStart
            float r4 = r3.x
            android.graphics.PointF r5 = r0.vTranslateStart
            float r11 = r5.x
            float r11 = r4 - r11
            float r3 = r3.y
            float r5 = r5.y
            float r5 = r3 - r5
            float r12 = r0.scaleStart
            float r13 = r1 / r12
            float r11 = r11 * r13
            float r1 = r1 / r12
            float r5 = r5 * r1
            android.graphics.PointF r1 = r0.vTranslate
            float r4 = r4 - r11
            r1.x = r4
            float r3 = r3 - r5
            r1.y = r3
            int r1 = r18.sHeight()
            double r3 = (double) r1
            double r3 = r3 * r9
            int r1 = r18.getHeight()
            double r11 = (double) r1
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0290
            float r1 = r0.scale
            int r3 = r18.sHeight()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r18.getHeight()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x02b2
        L_0x0290:
            int r1 = r18.sWidth()
            double r3 = (double) r1
            double r9 = r9 * r3
            int r1 = r18.getWidth()
            double r3 = (double) r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0322
            float r1 = r0.scale
            int r3 = r18.sWidth()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r3 = r18.getWidth()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0322
        L_0x02b2:
            r0.fitToBounds(r7)
            android.graphics.PointF r1 = r0.vCenterStart
            android.graphics.PointF r2 = r0.quickScaleSCenter
            android.graphics.PointF r2 = r0.sourceToViewCoord(r2)
            r1.set(r2)
            android.graphics.PointF r1 = r0.vTranslateStart
            android.graphics.PointF r2 = r0.vTranslate
            r1.set(r2)
            float r1 = r0.scale
            r0.scaleStart = r1
            r2 = 0
            goto L_0x0322
        L_0x02cd:
            android.graphics.PointF r1 = r0.sRequestedCenter
            if (r1 == 0) goto L_0x02f8
            android.graphics.PointF r1 = r0.vTranslate
            int r3 = r18.getWidth()
            int r3 = r3 / r5
            float r3 = (float) r3
            float r4 = r0.scale
            android.graphics.PointF r8 = r0.sRequestedCenter
            float r8 = r8.x
            float r4 = r4 * r8
            float r3 = r3 - r4
            r1.x = r3
            android.graphics.PointF r1 = r0.vTranslate
            int r3 = r18.getHeight()
            int r3 = r3 / r5
            float r3 = (float) r3
            float r4 = r0.scale
            android.graphics.PointF r5 = r0.sRequestedCenter
            float r5 = r5.y
            float r4 = r4 * r5
            float r3 = r3 - r4
            r1.y = r3
            goto L_0x0322
        L_0x02f8:
            android.graphics.PointF r1 = r0.vTranslate
            int r3 = r18.getWidth()
            int r3 = r3 / r5
            float r3 = (float) r3
            float r4 = r0.scale
            int r8 = r18.sWidth()
            int r8 = r8 / r5
            float r8 = (float) r8
            float r4 = r4 * r8
            float r3 = r3 - r4
            r1.x = r3
            android.graphics.PointF r1 = r0.vTranslate
            int r3 = r18.getHeight()
            int r3 = r3 / r5
            float r3 = (float) r3
            float r4 = r0.scale
            int r8 = r18.sHeight()
            int r8 = r8 / r5
            float r5 = (float) r8
            float r4 = r4 * r5
            float r3 = r3 - r4
            r1.y = r3
        L_0x0322:
            r0.quickScaleLastDistance = r2
            r0.fitToBounds(r7)
            boolean r1 = r0.eagerLoadingEnabled
            r0.refreshRequiredTiles(r1)
        L_0x032c:
            r1 = 1
            goto L_0x0457
        L_0x032f:
            boolean r2 = r0.isZooming
            if (r2 != 0) goto L_0x0456
            float r2 = r19.getX()
            android.graphics.PointF r4 = r0.vCenterStart
            float r4 = r4.x
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r4 = r19.getY()
            android.graphics.PointF r12 = r0.vCenterStart
            float r12 = r12.y
            float r4 = r4 - r12
            float r4 = java.lang.Math.abs(r4)
            float r12 = r0.density
            float r12 = r12 * r11
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x035d
            int r13 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r13 > 0) goto L_0x035d
            boolean r13 = r0.isPanning
            if (r13 == 0) goto L_0x0456
        L_0x035d:
            android.graphics.PointF r13 = r0.vTranslate
            android.graphics.PointF r14 = r0.vTranslateStart
            float r14 = r14.x
            float r15 = r19.getX()
            android.graphics.PointF r9 = r0.vCenterStart
            float r9 = r9.x
            float r15 = r15 - r9
            float r14 = r14 + r15
            r13.x = r14
            android.graphics.PointF r9 = r0.vTranslate
            android.graphics.PointF r13 = r0.vTranslateStart
            float r13 = r13.y
            float r1 = r19.getY()
            android.graphics.PointF r14 = r0.vCenterStart
            float r14 = r14.y
            float r1 = r1 - r14
            float r13 = r13 + r1
            r9.y = r13
            android.graphics.PointF r1 = r0.vTranslate
            float r9 = r1.x
            float r1 = r1.y
            r0.fitToBounds(r7)
            android.graphics.PointF r13 = r0.vTranslate
            float r14 = r13.x
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0394
            r9 = 1
            goto L_0x0395
        L_0x0394:
            r9 = 0
        L_0x0395:
            float r13 = r13.y
            int r14 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x039d
            r14 = 1
            goto L_0x039e
        L_0x039d:
            r14 = 0
        L_0x039e:
            if (r9 == 0) goto L_0x03aa
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x03aa
            boolean r15 = r0.isPanning
            if (r15 != 0) goto L_0x03aa
            r15 = 1
            goto L_0x03ab
        L_0x03aa:
            r15 = 0
        L_0x03ab:
            if (r14 == 0) goto L_0x03b7
            int r16 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r16 <= 0) goto L_0x03b7
            boolean r10 = r0.isPanning
            if (r10 != 0) goto L_0x03b7
            r10 = 1
            goto L_0x03b8
        L_0x03b7:
            r10 = 0
        L_0x03b8:
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x03c6
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r12
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x03c6
            r1 = 1
            goto L_0x03c7
        L_0x03c6:
            r1 = 0
        L_0x03c7:
            java.lang.String r13 = r0.TAG
            r3 = 9
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r9)
            r3[r6] = r17
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r14)
            r3[r7] = r17
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r15)
            r3[r5] = r17
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            r3[r8] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r8 = 4
            r3[r8] = r5
            boolean r5 = r0.isPanning
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8 = 5
            r3[r8] = r5
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r5 = 6
            r3[r5] = r2
            r2 = 7
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            r3[r2] = r5
            r2 = 8
            java.lang.Float r5 = java.lang.Float.valueOf(r12)
            r3[r2] = r5
            java.lang.String r2 = "alvinluo Action_Move edge atXEdge: %b, atYEdge: %b, edgeXSwipe: %b, edgeYSwipe: %b, yPan: %b, isPanning: %b,dx: %f, dy: %f, offset: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r13, r2, r3)
            if (r15 != 0) goto L_0x0421
            if (r10 != 0) goto L_0x0421
            if (r9 == 0) goto L_0x041e
            if (r14 == 0) goto L_0x041e
            if (r1 != 0) goto L_0x041e
            boolean r1 = r0.isPanning
            if (r1 == 0) goto L_0x0421
        L_0x041e:
            r0.isPanning = r7
            goto L_0x0437
        L_0x0421:
            if (r11 > 0) goto L_0x0427
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0437
        L_0x0427:
            r0.maxTouchCount = r6
            android.os.Handler r1 = r0.handler
            r1.removeMessages(r7)
            r0.requestDisallowInterceptTouchEvent(r6)
            boolean r1 = r0.allowInterceptTouch
            if (r1 != 0) goto L_0x0437
            r1 = 0
            goto L_0x0438
        L_0x0437:
            r1 = 1
        L_0x0438:
            boolean r2 = r0.panEnabled
            if (r2 != 0) goto L_0x0450
            android.graphics.PointF r2 = r0.vTranslate
            android.graphics.PointF r3 = r0.vTranslateStart
            float r4 = r3.x
            r2.x = r4
            float r3 = r3.y
            r2.y = r3
            r0.requestDisallowInterceptTouchEvent(r6)
            boolean r2 = r0.allowInterceptTouch
            if (r2 != 0) goto L_0x0450
            r1 = 0
        L_0x0450:
            boolean r2 = r0.eagerLoadingEnabled
            r0.refreshRequiredTiles(r2)
            goto L_0x0457
        L_0x0456:
            r1 = 0
        L_0x0457:
            java.lang.String r2 = r0.TAG
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r3[r6] = r4
            java.lang.String r4 = "alvinluo Action_Move consumed: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r3)
            if (r1 == 0) goto L_0x0471
            android.os.Handler r1 = r0.handler
            r1.removeMessages(r7)
            r18.invalidate()
            return r7
        L_0x0471:
            return r6
        L_0x0472:
            android.os.Handler r3 = r0.handler
            r3.removeMessages(r7)
            int r3 = r19.getAction()
            if (r3 != r8) goto L_0x0483
            boolean r3 = r0.ignoreCancelEvent
            if (r3 == 0) goto L_0x0483
            r0.ignoreCancelEvent = r6
        L_0x0483:
            boolean r3 = r0.isQuickScaling
            if (r3 == 0) goto L_0x0494
            r0.isQuickScaling = r6
            boolean r3 = r0.quickScaleMoved
            if (r3 != 0) goto L_0x0494
            android.graphics.PointF r3 = r0.quickScaleSCenter
            android.graphics.PointF r9 = r0.vCenterStart
            r0.doubleTapZoom((android.graphics.PointF) r3, (android.graphics.PointF) r9)
        L_0x0494:
            int r3 = r0.maxTouchCount
            if (r3 <= 0) goto L_0x0554
            boolean r3 = r0.isZooming
            if (r3 != 0) goto L_0x04a0
            boolean r9 = r0.isPanning
            if (r9 == 0) goto L_0x0554
        L_0x04a0:
            if (r3 == 0) goto L_0x0546
            if (r2 != r5) goto L_0x0546
            r0.isPanning = r7
            android.graphics.PointF r3 = r0.vTranslateStart
            android.graphics.PointF r9 = r0.vTranslate
            float r10 = r9.x
            float r9 = r9.y
            r3.set(r10, r9)
            int r3 = r19.getActionIndex()
            if (r3 != r7) goto L_0x04c5
            android.graphics.PointF r3 = r0.vCenterStart
            float r9 = r1.getX(r6)
            float r1 = r1.getY(r6)
            r3.set(r9, r1)
            goto L_0x04d2
        L_0x04c5:
            android.graphics.PointF r3 = r0.vCenterStart
            float r9 = r1.getX(r7)
            float r1 = r1.getY(r7)
            r3.set(r9, r1)
        L_0x04d2:
            float r1 = r0.scale
            float r3 = r0.mScaleRate
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0506
            java.lang.String r3 = r0.TAG
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4[r6] = r1
            float r1 = r0.mScaleRate
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4[r7] = r1
            java.lang.String r1 = "alvinluo scale %f less than %f, and need to reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r4)
            android.graphics.PointF r1 = new android.graphics.PointF
            int r3 = r0.mViewWidth
            int r3 = r3 / r5
            float r3 = (float) r3
            int r4 = r0.mViewHeight
            int r4 = r4 / r5
            float r4 = (float) r4
            r1.<init>(r3, r4)
            float r3 = r0.mScaleRate
            r0.zoomScaleAndCenter(r1, r1, r3)
            r0.isPanning = r6
            goto L_0x0546
        L_0x0506:
            float r3 = r18.getDoubleTapZoomScale()
            float r3 = r3 * r4
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0546
            java.lang.String r1 = r0.TAG
            java.lang.Object[] r3 = new java.lang.Object[r8]
            float r9 = r0.scale
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r3[r6] = r9
            float r9 = r0.maxScale
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r3[r7] = r9
            float r9 = r18.getDoubleTapZoomScale()
            float r9 = r9 * r4
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r3[r5] = r9
            java.lang.String r9 = "alvinluo current scale %f larger than maxScale: %f, and reset to scale: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r3)
            android.graphics.PointF r1 = r0.vResetCenter
            android.graphics.PointF r1 = r0.viewToSourceCoord(r1)
            android.graphics.PointF r3 = r0.vResetCenter
            float r9 = r18.getDoubleTapZoomScale()
            float r9 = r9 * r4
            r0.zoomScaleAndCenter(r1, r3, r9)
        L_0x0546:
            if (r2 >= r8) goto L_0x054a
            r0.isZooming = r6
        L_0x054a:
            if (r2 >= r5) goto L_0x0550
            r0.isPanning = r6
            r0.maxTouchCount = r6
        L_0x0550:
            r0.refreshRequiredTiles(r7)
            return r7
        L_0x0554:
            if (r2 != r7) goto L_0x055c
            r0.isZooming = r6
            r0.isPanning = r6
            r0.maxTouchCount = r6
        L_0x055c:
            return r6
        L_0x055d:
            float r3 = r19.getRawX()
            r0.x_down = r3
            float r3 = r19.getRawY()
            r0.y_down = r3
            r3 = 0
            r0.anim = r3
            r0.requestDisallowInterceptTouchEvent(r7)
            int r3 = r0.maxTouchCount
            int r3 = java.lang.Math.max(r3, r2)
            r0.maxTouchCount = r3
            if (r2 < r5) goto L_0x05c4
            boolean r2 = r0.zoomEnabled
            if (r2 == 0) goto L_0x05bc
            float r2 = r1.getX(r6)
            float r3 = r1.getX(r7)
            float r5 = r1.getY(r6)
            float r8 = r1.getY(r7)
            float r2 = r0.distance(r2, r3, r5, r8)
            float r3 = r0.scale
            r0.scaleStart = r3
            r0.vDistStart = r2
            android.graphics.PointF r2 = r0.vTranslateStart
            android.graphics.PointF r3 = r0.vTranslate
            float r5 = r3.x
            float r3 = r3.y
            r2.set(r5, r3)
            android.graphics.PointF r2 = r0.vCenterStart
            float r3 = r1.getX(r6)
            float r5 = r1.getX(r7)
            float r3 = r3 + r5
            float r3 = r3 / r4
            float r5 = r1.getY(r6)
            float r1 = r1.getY(r7)
            float r5 = r5 + r1
            float r5 = r5 / r4
            r2.set(r3, r5)
            goto L_0x05be
        L_0x05bc:
            r0.maxTouchCount = r6
        L_0x05be:
            android.os.Handler r1 = r0.handler
            r1.removeMessages(r7)
            goto L_0x05ee
        L_0x05c4:
            boolean r2 = r0.isQuickScaling
            if (r2 != 0) goto L_0x05ee
            android.graphics.PointF r2 = r0.vTranslateStart
            android.graphics.PointF r3 = r0.vTranslate
            float r4 = r3.x
            float r3 = r3.y
            r2.set(r4, r3)
            android.graphics.PointF r2 = r0.vCenterStart
            float r3 = r19.getX()
            float r1 = r19.getY()
            r2.set(r3, r1)
            java.lang.String r1 = r0.TAG
            java.lang.String r2 = "pennqin, delay time 601 ms."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.os.Handler r1 = r0.handler
            r2 = 601(0x259, double:2.97E-321)
            r1.sendEmptyMessageDelayed(r7, r2)
        L_0x05ee:
            boolean r1 = r0.allowInterceptTouch
            if (r1 == 0) goto L_0x05f3
            return r7
        L_0x05f3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.onTouchEventInternal(android.view.MotionEvent):boolean");
    }

    private void preDraw() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.sWidth > 0 && this.sHeight > 0) {
            if (!(this.sPendingCenter == null || (f = this.pendingScale) == null)) {
                this.scale = f.floatValue();
                if (this.vTranslate == null) {
                    this.vTranslate = new PointF();
                }
                this.vTranslate.x = ((float) (getWidth() / 2)) - (this.scale * this.sPendingCenter.x);
                this.vTranslate.y = ((float) (getHeight() / 2)) - (this.scale * this.sPendingCenter.y);
                this.sPendingCenter = null;
                this.pendingScale = null;
                this.mNeedPendingScale = false;
                fitToBounds(true);
                refreshRequiredTiles(true);
            }
            fitToBounds(false);
        }
    }

    private int previewHeight() {
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || !this.bitmapIsPreview) {
            return 0;
        }
        int i = this.previewOrientation;
        return (i == 90 || i == 270) ? bitmap2.getWidth() : bitmap2.getHeight();
    }

    private int previewWidth() {
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || !this.bitmapIsPreview) {
            return 0;
        }
        int i = this.previewOrientation;
        return (i == 90 || i == 270) ? bitmap2.getHeight() : bitmap2.getWidth();
    }

    /* renamed from: px */
    private int m16639px(int i) {
        return (int) (this.density * ((float) i));
    }

    private void refreshRequiredTiles(boolean z) {
        if (this.decoder != null && this.tileMap != null) {
            int min = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
            for (Map.Entry<Integer, List<Tile>> value : this.tileMap.entrySet()) {
                for (Tile tile : (List) value.getValue()) {
                    int i = tile.sampleSize;
                    if (i < min || (i > min && i != this.fullImageSampleSize)) {
                        tile.visible = false;
                        Bitmap bitmap2 = tile.bitmap;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            tile.bitmap = null;
                        }
                    }
                    int i2 = tile.sampleSize;
                    if (i2 == min) {
                        if (tileVisible(tile)) {
                            tile.visible = true;
                            if (!tile.loading && tile.bitmap == null && z) {
                                newLoadTask(tile);
                            }
                        } else if (tile.sampleSize != this.fullImageSampleSize) {
                            tile.visible = false;
                            Bitmap bitmap3 = tile.bitmap;
                            if (bitmap3 != null) {
                                bitmap3.recycle();
                                tile.bitmap = null;
                            }
                        }
                    } else if (i2 == this.fullImageSampleSize) {
                        tile.visible = true;
                    }
                }
            }
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            Log.m105925i(this.TAG, "alvinluo requestDisallowInterceptTouchEvent disallow: %b, allowInterceptTouch: %s", Boolean.valueOf(z), Boolean.valueOf(this.allowInterceptTouch));
            if (!this.allowInterceptTouch) {
                this.ignoreCancelEvent = true;
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: finally extract failed */
    private void reset(boolean z) {
        Bitmap bitmap2;
        OnImageEventListener onImageEventListener2;
        debug("reset newImage=" + z, new Object[0]);
        this.scale = 0.0f;
        this.scaleStart = 0.0f;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = Float.valueOf(0.0f);
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = 0.0f;
        this.quickScaleLastDistance = 0.0f;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if (z) {
            ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
            if (imageDecodeRecord != null) {
                imageDecodeRecord.reset();
            }
            this.uri = null;
            this.decoderLock.writeLock().lock();
            try {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null) {
                    imageRegionDecoder.recycle();
                    this.decoder = null;
                }
                this.decoderLock.writeLock().unlock();
                Bitmap bitmap3 = this.bitmap;
                if (bitmap3 != null && !this.bitmapIsCached) {
                    bitmap3.recycle();
                }
                if (!(this.bitmap == null || !this.bitmapIsCached || (onImageEventListener2 = this.onImageEventListener) == null)) {
                    onImageEventListener2.onPreviewReleased();
                }
                this.sWidth = 0;
                this.sHeight = 0;
                this.sOrientation = 0;
                this.sRegion = null;
                this.pRegion = null;
                this.readySent = false;
                this.imageLoadedSent = false;
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
                this.isPreviewLoaded = false;
                this.canDrawPreview = false;
                this.isFirstLoadFullImage = true;
            } catch (Throwable th) {
                this.decoderLock.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<Tile>> map = this.tileMap;
        if (map != null) {
            for (Map.Entry<Integer, List<Tile>> value : map.entrySet()) {
                for (Tile tile : (List) value.getValue()) {
                    tile.visible = false;
                    if (tile.bitmap != null) {
                        ImageSource imageSource = this.mPreviewSource;
                        if (imageSource == null || imageSource.getBitmap() != (bitmap2 = tile.bitmap)) {
                            tile.bitmap.recycle();
                            tile.bitmap = null;
                        } else {
                            Log.m105925i(this.TAG, "alvinluo reset tile bitmap not need to recycle: %d", Integer.valueOf(bitmap2.hashCode()));
                        }
                    }
                }
            }
            this.tileMap = null;
        }
        setGestureDetector(getContext());
    }

    private void resetScales() {
        this.maxScale = 2.0f;
        this.minScale = 1.0f;
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState != null && imageViewState.getCenter() != null && VALID_ORIENTATIONS.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            this.orientation = imageViewState.getOrientation();
            this.pendingScale = Float.valueOf(imageViewState.getScale());
            this.sPendingCenter = imageViewState.getCenter();
            invalidate();
        }
    }

    private int sHeight() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.sWidth : this.sHeight;
    }

    private int sWidth() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.sHeight : this.sWidth;
    }

    private void sendStateChanged(float f, PointF pointF, int i) {
        Log.m105925i(this.TAG, "alvinluo sendStateChanged oldScale: %s, %s", Float.valueOf(f), Float.valueOf(this.scale));
        OnStateChangedListener onStateChangedListener2 = this.onStateChangedListener;
        if (onStateChangedListener2 != null) {
            float f2 = this.scale;
            if (f2 != f) {
                onStateChangedListener2.onScaleChanged(f2, f, i);
            }
        }
        if (this.onStateChangedListener != null && !this.vTranslate.equals(pointF)) {
            this.onStateChangedListener.onCenterChanged(getCenter(), i);
        }
    }

    public static void setBitmapLoaderImp(IBitmapLoaderFactory iBitmapLoaderFactory) {
        mBitmapLoader = iBitmapLoaderFactory;
    }

    private void setFullImageBitmap(final Bitmap bitmap2) {
        ThreadPool.post(new Runnable() {
            public void run() {
                if (bitmap2 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    Bitmap unused = subsamplingScaleImageView.fullImageBitmap = subsamplingScaleImageView.rotateAndScaleBitmap(bitmap2, subsamplingScaleImageView.sOrientation, 1.0f, 1.0f);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Log.m105925i(SubsamplingScaleImageView.this.TAG, "alvinluo rotate and scale fullImageBitmap cost: %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                }
            }
        }, "rotateAndScaleBitmap");
    }

    /* access modifiers changed from: private */
    public void setGestureDetector(final Context context) {
        this.detector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            private byte _hellAccFlag_;

            public boolean onContextClick(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                C117292a.m165362h(onContextClick, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                if (SubsamplingScaleImageView.this.onDoubleTapListener != null && SubsamplingScaleImageView.this.onDoubleTapListener.onDoubleTap(motionEvent)) {
                    C117292a.m165362h(true, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                    return true;
                } else if (!SubsamplingScaleImageView.this.zoomEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null) {
                    boolean onDoubleTapEvent = super.onDoubleTapEvent(motionEvent);
                    C117292a.m165362h(onDoubleTapEvent, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                    return onDoubleTapEvent;
                } else {
                    SubsamplingScaleImageView.this.setGestureDetector(context);
                    Log.m105925i(SubsamplingScaleImageView.this.TAG, "alvinluo onDoubleTap, quickScaledEnabled: %b", Boolean.valueOf(SubsamplingScaleImageView.this.quickScaleEnabled));
                    if (SubsamplingScaleImageView.this.quickScaleEnabled) {
                        PointF unused = SubsamplingScaleImageView.this.vCenterStart = new PointF(motionEvent.getX(), motionEvent.getY());
                        PointF unused2 = SubsamplingScaleImageView.this.vTranslateStart = new PointF(SubsamplingScaleImageView.this.vTranslate.x, SubsamplingScaleImageView.this.vTranslate.y);
                        SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                        float unused3 = subsamplingScaleImageView.scaleStart = subsamplingScaleImageView.scale;
                        boolean unused4 = SubsamplingScaleImageView.this.isQuickScaling = true;
                        boolean unused5 = SubsamplingScaleImageView.this.isZooming = true;
                        float unused6 = SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                        SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                        PointF unused7 = subsamplingScaleImageView2.quickScaleSCenter = subsamplingScaleImageView2.viewToSourceCoord(subsamplingScaleImageView2.vCenterStart);
                        PointF unused8 = SubsamplingScaleImageView.this.quickScaleVStart = new PointF(motionEvent.getX(), motionEvent.getY());
                        PointF unused9 = SubsamplingScaleImageView.this.quickScaleVLastPoint = new PointF(SubsamplingScaleImageView.this.quickScaleSCenter.x, SubsamplingScaleImageView.this.quickScaleSCenter.y);
                        boolean unused10 = SubsamplingScaleImageView.this.quickScaleMoved = false;
                        C117292a.m165362h(false, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                    float unused11 = subsamplingScaleImageView3.doubleTapZoom(subsamplingScaleImageView3.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                    C117292a.m165362h(true, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                    return true;
                }
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!SubsamplingScaleImageView.this.panEnabled || !SubsamplingScaleImageView.this.readySent || SubsamplingScaleImageView.this.vTranslate == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.isZooming))) {
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
                PointF pointF = new PointF(SubsamplingScaleImageView.this.vTranslate.x + (f * 0.25f), SubsamplingScaleImageView.this.vTranslate.y + (f2 * 0.25f));
                new AnimationBuilder(new PointF((((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF.x) / SubsamplingScaleImageView.this.scale, (((float) (SubsamplingScaleImageView.this.getHeight() / 2)) - pointF.y) / SubsamplingScaleImageView.this.scale)).withEasing(1).withPanLimited(false).withOrigin(3).start();
                return true;
            }

            public void onLongPress(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                C117292a.m165361g(this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                boolean onSingleTapConfirmed;
                if (SubsamplingScaleImageView.this.onDoubleTapListener != null && SubsamplingScaleImageView.this.onDoubleTapListener.onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
                if (SubsamplingScaleImageView.this.gestureDetectorListener != null && (onSingleTapConfirmed = SubsamplingScaleImageView.this.gestureDetectorListener.onSingleTapConfirmed(motionEvent))) {
                    return onSingleTapConfirmed;
                }
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                C117292a.m165362h(onSingleTapUp, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
        this.singleDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            private byte _hellAccFlag_;

            public boolean onContextClick(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                C117292a.m165362h(onContextClick, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onDoubleTap = super.onDoubleTap(motionEvent);
                C117292a.m165362h(onDoubleTap, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }

            public void onLongPress(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                C117292a.m165361g(this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                C117292a.m165362h(onSingleTapUp, this, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }

    private void setMatrixArray(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    public static void setTileInitLoaderImp(ITileInitLoaderFactory iTileInitLoaderFactory) {
        mTileInitLoader = iTileInitLoaderFactory;
    }

    public static void setTileLoaderImp(ITileLoaderFactory iTileLoaderFactory) {
        mTileLoader = iTileLoaderFactory;
    }

    private Rect sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int) sourceToViewX((float) rect.left), (int) sourceToViewY((float) rect.top), (int) sourceToViewX((float) rect.right), (int) sourceToViewY((float) rect.bottom));
        return rect2;
    }

    private float sourceToViewX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.x;
    }

    private float sourceToViewY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.scale) + pointF.y;
    }

    private boolean tileVisible(Tile tile) {
        float viewToSourceX = viewToSourceX(0.0f);
        float viewToSourceX2 = viewToSourceX((float) getWidth());
        float viewToSourceY = viewToSourceY(0.0f);
        float viewToSourceY2 = viewToSourceY((float) getHeight());
        Rect rect = tile.sRect;
        return viewToSourceX <= ((float) rect.right) && ((float) rect.left) <= viewToSourceX2 && viewToSourceY <= ((float) rect.bottom) && ((float) rect.top) <= viewToSourceY2;
    }

    private void updateScale(float f) {
        float f2 = this.scale;
        float f3 = this.matrixValues[0];
        this.scale = f3;
        OnStateChangedListener onStateChangedListener2 = this.onStateChangedListener;
        if (onStateChangedListener2 != null) {
            onStateChangedListener2.onScaleChanged(f3, f2, 2);
        }
    }

    private PointF vTranslateForSCenter(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        float unused = this.satTemp.scale = f3;
        this.satTemp.vTranslate.set(((float) paddingLeft) - (f * f3), ((float) paddingTop) - (f2 * f3));
        fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    private float viewToSourceX(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.scale;
    }

    private void zoomScaleAndCenter(PointF pointF, PointF pointF2, float f) {
        new AnimationBuilder(f, pointF, pointF2).withInterruptible(false).withDuration((long) this.zoomScaleDuration).withOrigin(2).start();
    }

    public void addOnTouchListener(View.OnTouchListener onTouchListener2) {
        this.onTouchListener = onTouchListener2;
    }

    public synchronized void addPreviewLoadedTime(int i) {
        ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
        if (imageDecodeRecord != null) {
            imageDecodeRecord.addPreviewLoadedTime(i);
        }
    }

    public synchronized void addTileDecodeTime(int i) {
        ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
        if (imageDecodeRecord != null) {
            imageDecodeRecord.addTileDecodeTime(i);
        }
    }

    public synchronized void addTileInitTime(int i) {
        ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
        if (imageDecodeRecord != null) {
            imageDecodeRecord.addTileInitTime(i);
        }
    }

    public AnimationBuilder animateCenter(PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(pointF);
    }

    public AnimationBuilder animateScale(float f) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f);
    }

    public AnimationBuilder animateScaleAndCenter(float f, PointF pointF) {
        if (!isReady()) {
            return null;
        }
        return new AnimationBuilder(f, pointF);
    }

    public void debug(String str, Object... objArr) {
        Log.m105918d(this.TAG, String.format(str, objArr));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.m105918d(this.TAG, "alvinluo SubsamplingScaleImageView dispatchTouchEvent");
        return super.dispatchTouchEvent(motionEvent);
    }

    public float doubleTapZoom(float f, float f2) {
        PointF pointF = new PointF(f, f2);
        return doubleTapZoom(viewToSourceCoord(pointF), pointF);
    }

    public void fileSRect(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.sHeight;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else if (getRequiredRotation() == 180) {
            int i3 = this.sWidth;
            int i4 = this.sHeight;
            rect2.set(i3 - rect.right, i4 - rect.bottom, i3 - rect.left, i4 - rect.top);
        } else {
            int i5 = this.sWidth;
            rect2.set(i5 - rect.bottom, rect.left, i5 - rect.top, rect.right);
        }
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        return viewToSourceCoord((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public ReadWriteLock getDecoderLock() {
        return this.decoderLock;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.tencent.mm.vfs.f0$h, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r1 != 0) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9.TAG, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r1 == 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r1 != 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getExifOrientation(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "orientation"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x005c }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x005c }
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r11
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x005c }
            if (r1 == 0) goto L_0x0053
            boolean r10 = r1.moveToFirst()     // Catch:{ Exception -> 0x005c }
            if (r10 == 0) goto L_0x0053
            int r10 = r1.getInt(r2)     // Catch:{ Exception -> 0x005c }
            java.util.List<java.lang.Integer> r11 = VALID_ORIENTATIONS     // Catch:{ Exception -> 0x005c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x005c }
            boolean r11 = r11.contains(r0)     // Catch:{ Exception -> 0x005c }
            if (r11 == 0) goto L_0x003d
            r11 = -1
            if (r10 == r11) goto L_0x003d
            r2 = r10
            goto L_0x0053
        L_0x003d:
            java.lang.String r11 = r9.TAG     // Catch:{ Exception -> 0x005c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005c }
            r0.<init>()     // Catch:{ Exception -> 0x005c }
            java.lang.String r3 = "Unsupported orientation: "
            r0.append(r3)     // Catch:{ Exception -> 0x005c }
            r0.append(r10)     // Catch:{ Exception -> 0x005c }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r10)     // Catch:{ Exception -> 0x005c }
        L_0x0053:
            if (r1 == 0) goto L_0x00c9
        L_0x0055:
            r1.close()
            goto L_0x00c9
        L_0x005a:
            r10 = move-exception
            goto L_0x0066
        L_0x005c:
            java.lang.String r10 = r9.TAG     // Catch:{ all -> 0x005a }
            java.lang.String r11 = "Could not get orientation of image from media store"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x00c9
            goto L_0x0055
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            r1.close()
        L_0x006b:
            throw r10
        L_0x006c:
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106421C(r11, r1)     // Catch:{ Exception -> 0x00c2 }
            androidx.exifinterface.media.ExifInterface r11 = new androidx.exifinterface.media.ExifInterface     // Catch:{ all -> 0x00b6 }
            r11.<init>((java.io.InputStream) r10)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "Orientation"
            r1 = 1
            int r11 = r11.getAttributeInt(r0, r1)     // Catch:{ all -> 0x00b6 }
            if (r11 == r1) goto L_0x00b0
            if (r11 != 0) goto L_0x0081
            goto L_0x00b0
        L_0x0081:
            r0 = 6
            if (r11 != r0) goto L_0x0089
            r11 = 90
            r2 = 90
            goto L_0x00b0
        L_0x0089:
            r0 = 3
            if (r11 != r0) goto L_0x0091
            r11 = 180(0xb4, float:2.52E-43)
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00b0
        L_0x0091:
            r0 = 8
            if (r11 != r0) goto L_0x009a
            r11 = 270(0x10e, float:3.78E-43)
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00b0
        L_0x009a:
            java.lang.String r0 = r9.TAG     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r1.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "Unsupported EXIF orientation: "
            r1.append(r3)     // Catch:{ all -> 0x00b6 }
            r1.append(r11)     // Catch:{ all -> 0x00b6 }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x00b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r11)     // Catch:{ all -> 0x00b6 }
        L_0x00b0:
            if (r10 == 0) goto L_0x00c9
            r10.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00c9
        L_0x00b6:
            r11 = move-exception
            if (r10 == 0) goto L_0x00c1
            r10.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c1:
            throw r11     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            java.lang.String r10 = r9.TAG
            java.lang.String r11 = "Could not get EXIF orientation of image"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)
        L_0x00c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.getExifOrientation(android.content.Context, android.net.Uri):int");
    }

    public Bitmap getFullImageBitmap() {
        return this.fullImageBitmap;
    }

    public int getFullImageSampleSize() {
        return this.fullImageSampleSize;
    }

    public synchronized ImageDecodeRecord getImageDecodeRecord() {
        return this.mImageDecodeRecord;
    }

    public PointF getImageViewMatrixScale() {
        if (Float.isNaN(this.scale) || Float.isInfinite(this.scale)) {
            return new PointF(1.0f, 1.0f);
        }
        float f = this.scale;
        return new PointF(f, f);
    }

    public PointF getImageViewMatrixTranslation() {
        if (this.vTranslate == null) {
            return null;
        }
        PointF pointF = this.vTranslate;
        return new PointF(pointF.x, pointF.y);
    }

    public boolean getInternalTouchEventConsumed() {
        return this.IsinternalTouchEventConsumed;
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return minScale();
    }

    public OnImageEventListener getOnImageEventListener() {
        return this.onImageEventListener;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(RectF rectF) {
        if (isReady()) {
            float sWidth2 = this.scale * ((float) sWidth());
            float sHeight2 = this.scale * ((float) sHeight());
            int i = this.panLimit;
            if (i == 3) {
                rectF.top = Math.max(0.0f, -(this.vTranslate.y - ((float) (getHeight() / 2))));
                rectF.left = Math.max(0.0f, -(this.vTranslate.x - ((float) (getWidth() / 2))));
                rectF.bottom = Math.max(0.0f, this.vTranslate.y - (((float) (getHeight() / 2)) - sHeight2));
                rectF.right = Math.max(0.0f, this.vTranslate.x - (((float) (getWidth() / 2)) - sWidth2));
            } else if (i == 2) {
                rectF.top = Math.max(0.0f, -(this.vTranslate.y - ((float) getHeight())));
                rectF.left = Math.max(0.0f, -(this.vTranslate.x - ((float) getWidth())));
                rectF.bottom = Math.max(0.0f, this.vTranslate.y + sHeight2);
                rectF.right = Math.max(0.0f, this.vTranslate.x + sWidth2);
            } else {
                rectF.top = Math.max(0.0f, -this.vTranslate.y);
                rectF.left = Math.max(0.0f, -this.vTranslate.x);
                rectF.bottom = Math.max(0.0f, (sHeight2 + this.vTranslate.y) - ((float) getHeight()));
                rectF.right = Math.max(0.0f, (sWidth2 + this.vTranslate.x) - ((float) getWidth()));
            }
        }
    }

    public int getPreviewHeight() {
        return this.previewHeight;
    }

    public int getPreviewOrientation() {
        return this.previewOrientation;
    }

    public int getPreviewWidth() {
        return this.previewWidth;
    }

    public int getRequiredRotation() {
        int i = this.orientation;
        return i == -1 ? this.sOrientation : i;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageViewState getState() {
        if (this.vTranslate == null || this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    public Rect getsRegion() {
        return this.sRegion;
    }

    public boolean hasImage() {
        return (this.uri == null && this.bitmap == null) ? false : true;
    }

    public void initScaleRate() {
        Log.m105925i(this.TAG, "alvinluo initScaleRate: %f", Float.valueOf(this.mScaleRate));
        initMaxScale();
        initMinScale();
    }

    public PointF invertMapPoint(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return null;
        }
        return new PointF(invertViewX(fArr[0]), invertViewY(fArr[1]));
    }

    public Boolean isHorizontalLong() {
        if (this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return Boolean.valueOf(this.horizontalLong);
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public Boolean isVerticalLong() {
        if (this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return Boolean.valueOf(this.verticalLong);
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    public PointF mapPoint(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return null;
        }
        return new PointF(sourceToViewX(fArr[0]), sourceToViewY(fArr[1]));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View.OnAttachStateChangeListener onAttachStateChangeListener2 = this.onAttachStateChangeListener;
        if (onAttachStateChangeListener2 != null) {
            onAttachStateChangeListener2.onViewAttachedToWindow(this);
        }
        this.cancelled = false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAllTileLoadTask();
        View.OnAttachStateChangeListener onAttachStateChangeListener2 = this.onAttachStateChangeListener;
        if (onAttachStateChangeListener2 != null) {
            onAttachStateChangeListener2.onViewDetachedFromWindow(this);
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        Tile tile;
        int i3;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        System.currentTimeMillis();
        createPaints();
        if (this.sWidth != 0 && this.sHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            if (this.tileMap == null && this.decoder != null) {
                initialiseBaseLayer(getMaxBitmapDimensions(canvas));
            }
            if (checkReady()) {
                if (this.canRefresh) {
                    preDraw();
                }
                Anim anim2 = this.anim;
                if (!(anim2 == null || anim2.vFocusStart == null)) {
                    float f = this.scale;
                    if (this.vTranslateBefore == null) {
                        this.vTranslateBefore = new PointF(0.0f, 0.0f);
                    }
                    this.vTranslateBefore.set(this.vTranslate);
                    long currentTimeMillis = System.currentTimeMillis() - this.anim.time;
                    boolean z = currentTimeMillis > this.anim.duration;
                    long min = Math.min(currentTimeMillis, this.anim.duration);
                    this.scale = ease(this.anim.easing, min, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
                    float ease = ease(this.anim.easing, min, this.anim.vFocusStart.x, this.anim.vFocusEnd.x - this.anim.vFocusStart.x, this.anim.duration);
                    float ease2 = ease(this.anim.easing, min, this.anim.vFocusStart.y, this.anim.vFocusEnd.y - this.anim.vFocusStart.y, this.anim.duration);
                    this.vTranslate.x -= sourceToViewX(this.anim.sCenterEnd.x) - ease;
                    this.vTranslate.y -= sourceToViewY(this.anim.sCenterEnd.y) - ease2;
                    fitToBounds(z || this.anim.scaleStart == this.anim.scaleEnd);
                    sendStateChanged(f, this.vTranslateBefore, this.anim.origin);
                    refreshRequiredTiles(z);
                    if (z) {
                        if (this.anim.listener != null) {
                            try {
                                this.anim.listener.onComplete();
                            } catch (Exception e) {
                                Log.m105929w(this.TAG, "Error thrown by animation listener", e);
                            }
                        }
                        this.anim = null;
                    }
                    invalidate();
                }
                if (this.tileMap == null || !isBaseLayerReady() || !this.mPreviewDone) {
                    i2 = 15;
                    i = 5;
                    Bitmap bitmap2 = this.bitmap;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        Log.m105919d(this.TAG, "alvinluo onDraw bitmap scale: %f", Float.valueOf(this.scale));
                        if (!this.bitmapIsPreview) {
                            drawBitmap(canvas);
                        } else if (this.canDrawPreview) {
                            drawBitmap(canvas);
                        }
                    }
                } else {
                    int min2 = Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
                    if (this.mDrawFullSampleSizeBitmap) {
                        min2 = this.fullImageSampleSize;
                    }
                    boolean z2 = false;
                    for (Map.Entry next : this.tileMap.entrySet()) {
                        if (((Integer) next.getKey()).intValue() == min2) {
                            for (Tile tile2 : (List) next.getValue()) {
                                if (tile2.visible && (tile2.loading || tile2.bitmap == null)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry next2 : this.tileMap.entrySet()) {
                        if (((Integer) next2.getKey()).intValue() == min2 || z2) {
                            for (Tile tile3 : (List) next2.getValue()) {
                                sourceToViewRect(tile3.sRect, tile3.vRect);
                                boolean z3 = tile3.loading;
                                if (z3 || tile3.bitmap == null) {
                                    tile = tile3;
                                    i3 = 5;
                                    if (z3 && this.debug) {
                                        canvas2.drawText("LOADING", (float) (tile.vRect.left + m16639px(5)), (float) (tile.vRect.top + m16639px(35)), this.debugTextPaint);
                                    }
                                } else {
                                    Paint paint = this.tileBgPaint;
                                    if (paint != null) {
                                        canvas2.drawRect(tile3.vRect, paint);
                                    }
                                    if (this.matrix == null) {
                                        this.matrix = new Matrix();
                                    }
                                    this.matrix.reset();
                                    tile = tile3;
                                    i3 = 5;
                                    setMatrixArray(this.srcArray, 0.0f, 0.0f, (float) tile3.bitmap.getWidth(), 0.0f, (float) tile3.bitmap.getWidth(), (float) tile3.bitmap.getHeight(), 0.0f, (float) tile3.bitmap.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        float[] fArr = this.dstArray;
                                        Rect rect = tile.vRect;
                                        int i4 = rect.left;
                                        int i5 = rect.top;
                                        int i6 = rect.right;
                                        int i7 = rect.bottom;
                                        setMatrixArray(fArr, (float) i4, (float) i5, (float) i6, (float) i5, (float) i6, (float) i7, (float) i4, (float) i7);
                                    } else if (getRequiredRotation() == 90) {
                                        float[] fArr2 = this.dstArray;
                                        Rect rect2 = tile.vRect;
                                        int i8 = rect2.right;
                                        int i9 = rect2.top;
                                        float f2 = (float) i8;
                                        int i15 = rect2.bottom;
                                        int i16 = rect2.left;
                                        setMatrixArray(fArr2, (float) i8, (float) i9, f2, (float) i15, (float) i16, (float) i15, (float) i16, (float) i9);
                                    } else if (getRequiredRotation() == 180) {
                                        float[] fArr3 = this.dstArray;
                                        Rect rect3 = tile.vRect;
                                        int i17 = rect3.right;
                                        int i18 = rect3.bottom;
                                        int i19 = rect3.left;
                                        int i25 = rect3.top;
                                        setMatrixArray(fArr3, (float) i17, (float) i18, (float) i19, (float) i18, (float) i19, (float) i25, (float) i17, (float) i25);
                                    } else if (getRequiredRotation() == 270) {
                                        float[] fArr4 = this.dstArray;
                                        Rect rect4 = tile.vRect;
                                        int i26 = rect4.left;
                                        int i27 = rect4.bottom;
                                        float f3 = (float) i26;
                                        int i28 = rect4.top;
                                        int i29 = rect4.right;
                                        setMatrixArray(fArr4, (float) i26, (float) i27, f3, (float) i28, (float) i29, (float) i28, (float) i29, (float) i27);
                                    }
                                    this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                                    if (!tile.bitmap.isRecycled()) {
                                        canvas2.drawBitmap(tile.bitmap, this.matrix, this.bitmapPaint);
                                    }
                                    if (this.debug) {
                                        canvas2.drawRect(tile.vRect, this.debugLinePaint);
                                    }
                                }
                                if (tile.visible && this.debug) {
                                    canvas2.drawText("ISS " + tile.sampleSize + " RECT " + tile.sRect.top + "," + tile.sRect.left + "," + tile.sRect.bottom + "," + tile.sRect.right, (float) (tile.vRect.left + m16639px(i3)), (float) (tile.vRect.top + m16639px(15)), this.debugTextPaint);
                                }
                            }
                        }
                    }
                    i2 = 15;
                    i = 5;
                }
                if (this.debug) {
                    Log.m105919d(this.TAG, "alvinluo onDraw debug vTranslate %f, %f", Float.valueOf(this.vTranslate.x), Float.valueOf(this.vTranslate.y));
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scale: ");
                    Locale locale = Locale.ENGLISH;
                    sb.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(this.scale)}));
                    sb.append(" (");
                    sb.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(minScale())}));
                    sb.append(" - ");
                    sb.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(this.maxScale)}));
                    sb.append(")");
                    canvas2.drawText(sb.toString(), (float) m16639px(i), (float) m16639px(i2), this.debugTextPaint);
                    canvas2.drawText("Translate: " + String.format(locale, "%.2f", new Object[]{Float.valueOf(this.vTranslate.x)}) + XVFSFile.PATH_SEPARATOR + String.format(locale, "%.2f", new Object[]{Float.valueOf(this.vTranslate.y)}), (float) m16639px(i), (float) m16639px(30), this.debugTextPaint);
                    PointF center = getCenter();
                    canvas2.drawText("Source center: " + String.format(locale, "%.2f", new Object[]{Float.valueOf(center.x)}) + XVFSFile.PATH_SEPARATOR + String.format(locale, "%.2f", new Object[]{Float.valueOf(center.y)}), (float) m16639px(i), (float) m16639px(45), this.debugTextPaint);
                    Anim anim3 = this.anim;
                    if (anim3 != null) {
                        PointF sourceToViewCoord = sourceToViewCoord(anim3.sCenterStart);
                        PointF sourceToViewCoord2 = sourceToViewCoord(this.anim.sCenterEndRequested);
                        PointF sourceToViewCoord3 = sourceToViewCoord(this.anim.sCenterEnd);
                        canvas2.drawCircle(sourceToViewCoord.x, sourceToViewCoord.y, (float) m16639px(10), this.debugLinePaint);
                        this.debugLinePaint.setColor(-65536);
                        canvas2.drawCircle(sourceToViewCoord2.x, sourceToViewCoord2.y, (float) m16639px(20), this.debugLinePaint);
                        this.debugLinePaint.setColor(-16776961);
                        canvas2.drawCircle(sourceToViewCoord3.x, sourceToViewCoord3.y, (float) m16639px(25), this.debugLinePaint);
                        this.debugLinePaint.setColor(-16711936);
                        canvas2.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) m16639px(30), this.debugLinePaint);
                    }
                    if (this.vCenterStart != null) {
                        this.debugLinePaint.setColor(-65536);
                        PointF pointF = this.vCenterStart;
                        canvas2.drawCircle(pointF.x, pointF.y, (float) m16639px(20), this.debugLinePaint);
                    }
                    if (this.quickScaleSCenter != null) {
                        this.debugLinePaint.setColor(-16776961);
                        canvas2.drawCircle(sourceToViewX(this.quickScaleSCenter.x), sourceToViewY(this.quickScaleSCenter.y), (float) m16639px(35), this.debugLinePaint);
                    }
                    if (this.quickScaleVStart != null && this.isQuickScaling) {
                        this.debugLinePaint.setColor(-12303292);
                        PointF pointF2 = this.quickScaleVStart;
                        canvas2.drawCircle(pointF2.x, pointF2.y, (float) m16639px(30), this.debugLinePaint);
                    }
                    this.debugLinePaint.setColor(-65281);
                }
            }
        }
    }

    public synchronized void onImageLoaded(Bitmap bitmap2, int i, boolean z) {
        OnImageEventListener onImageEventListener2;
        debug("onImageLoaded has bitmap", new Object[0]);
        int i2 = this.sWidth;
        if (i2 > 0 && this.sHeight > 0 && !(i2 == bitmap2.getWidth() && this.sHeight == bitmap2.getHeight())) {
            reset(false);
        }
        Bitmap bitmap3 = this.bitmap;
        if (bitmap3 != null && !this.bitmapIsCached) {
            bitmap3.recycle();
        }
        if (!(this.bitmap == null || !this.bitmapIsCached || (onImageEventListener2 = this.onImageEventListener) == null)) {
            onImageEventListener2.onPreviewReleased();
        }
        this.bitmapIsPreview = false;
        this.bitmapIsCached = z;
        this.bitmap = bitmap2;
        this.sWidth = bitmap2.getWidth();
        this.sHeight = bitmap2.getHeight();
        this.sOrientation = i;
        final boolean checkReady = checkReady();
        final boolean checkImageLoaded = checkImageLoaded();
        final int i3 = i;
        final Bitmap bitmap4 = bitmap2;
        ThreadPool.post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                int i = i3;
                if (i != 0) {
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    Bitmap unused = subsamplingScaleImageView.bitmap = subsamplingScaleImageView.rotateAndScaleBitmap(bitmap4, i, 1.0f, 1.0f);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m105925i(SubsamplingScaleImageView.this.TAG, "alvinluo onImageLoaded rotaeAndScaleBitmap %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                SubsamplingScaleImageView.this.post(new Runnable() {
                    public void run() {
                        C169376 r0 = C169376.this;
                        if (checkReady || checkImageLoaded) {
                            SubsamplingScaleImageView.this.invalidate();
                            SubsamplingScaleImageView.this.requestLayout();
                        }
                    }
                });
            }
        }, "rotateAndScaleBitmap");
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z2 = mode != 1073741824;
        boolean z3 = mode2 != 1073741824;
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (z2 && z3) {
                size = sWidth();
                size2 = sHeight();
            } else if (z3) {
                size2 = (int) ((((double) sHeight()) / ((double) sWidth())) * ((double) size));
            } else if (z2) {
                size = (int) ((((double) sWidth()) / ((double) sHeight())) * ((double) size2));
            }
        }
        int max = Math.max(size, getSuggestedMinimumWidth());
        int max2 = Math.max(size2, getSuggestedMinimumHeight());
        setMeasuredDimension(max, max2);
        if (max == this.mViewWidth && max2 == this.mViewHeight) {
            z = false;
        } else {
            this.mViewWidth = max;
            this.mViewHeight = max2;
            z = true;
        }
        if (z && this.canRefresh) {
            invalidate();
        }
        Log.m105919d(this.TAG, "alvinluo SubsamplingImageView onMeasure mViewWidth: %d, mViewHeight: %d, needRefresh: %s, canRefresh: %s", Integer.valueOf(this.mViewWidth), Integer.valueOf(this.mViewHeight), Boolean.valueOf(z), Boolean.valueOf(this.canRefresh));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onPreviewLoaded(android.graphics.Bitmap r8, java.lang.Integer r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.TAG     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "alvinluo onPreviewLoaded"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00a6 }
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x002a
            java.lang.String r2 = r7.TAG     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = "alvinluo onPreviewLoaded %d, recycle: %b"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a6 }
            int r5 = r8.hashCode()     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a6 }
            r4[r1] = r5     // Catch:{ all -> 0x00a6 }
            boolean r5 = r8.isRecycled()     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00a6 }
            r4[r0] = r5     // Catch:{ all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x00a6 }
        L_0x002a:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a6 }
            boolean r4 = r7.imageLoadedSent     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x003b
            android.graphics.Bitmap r8 = r7.bitmap     // Catch:{ all -> 0x00a6 }
            if (r8 == 0) goto L_0x0039
            r8.recycle()     // Catch:{ all -> 0x00a6 }
        L_0x0039:
            monitor-exit(r7)
            return
        L_0x003b:
            android.graphics.Rect r4 = r7.pRegion     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x0066
            int r9 = r4.width()     // Catch:{ all -> 0x00a6 }
            if (r9 <= 0) goto L_0x0073
            android.graphics.Rect r9 = r7.pRegion     // Catch:{ all -> 0x00a6 }
            int r9 = r9.height()     // Catch:{ all -> 0x00a6 }
            if (r9 <= 0) goto L_0x0073
            android.graphics.Rect r9 = r7.pRegion     // Catch:{ all -> 0x00a6 }
            int r4 = r9.left     // Catch:{ all -> 0x00a6 }
            int r5 = r9.top     // Catch:{ all -> 0x00a6 }
            int r9 = r9.width()     // Catch:{ all -> 0x00a6 }
            android.graphics.Rect r6 = r7.pRegion     // Catch:{ all -> 0x00a6 }
            int r6 = r6.height()     // Catch:{ all -> 0x00a6 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r4, r5, r9, r6)     // Catch:{ all -> 0x00a6 }
            r7.bitmap = r8     // Catch:{ all -> 0x00a6 }
            r7.previewOrientation = r1     // Catch:{ all -> 0x00a6 }
            goto L_0x0073
        L_0x0066:
            if (r9 == 0) goto L_0x0071
            int r9 = r9.intValue()     // Catch:{ all -> 0x00a6 }
            r7.previewOrientation = r9     // Catch:{ all -> 0x00a6 }
            r7.bitmap = r8     // Catch:{ all -> 0x00a6 }
            goto L_0x0073
        L_0x0071:
            r7.bitmap = r8     // Catch:{ all -> 0x00a6 }
        L_0x0073:
            r7.bitmapIsPreview = r0     // Catch:{ all -> 0x00a6 }
            r7.canDrawPreview = r1     // Catch:{ all -> 0x00a6 }
            android.graphics.Bitmap r8 = r7.bitmap     // Catch:{ all -> 0x00a6 }
            int r8 = r8.getWidth()     // Catch:{ all -> 0x00a6 }
            r7.previewWidth = r8     // Catch:{ all -> 0x00a6 }
            android.graphics.Bitmap r8 = r7.bitmap     // Catch:{ all -> 0x00a6 }
            int r8 = r8.getHeight()     // Catch:{ all -> 0x00a6 }
            r7.previewHeight = r8     // Catch:{ all -> 0x00a6 }
            r7.initPreviewScale()     // Catch:{ all -> 0x00a6 }
            r7.canDrawPreview = r0     // Catch:{ all -> 0x00a6 }
            boolean r8 = r7.checkReady()     // Catch:{ all -> 0x00a6 }
            if (r8 == 0) goto L_0x0098
            r7.invalidate()     // Catch:{ all -> 0x00a6 }
            r7.requestLayout()     // Catch:{ all -> 0x00a6 }
        L_0x0098:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a6 }
            long r8 = r8 - r2
            int r9 = (int) r8     // Catch:{ all -> 0x00a6 }
            r7.addPreviewLoadedTime(r9)     // Catch:{ all -> 0x00a6 }
            r7.onPreviewLoaded()     // Catch:{ all -> 0x00a6 }
            monitor-exit(r7)
            return
        L_0x00a6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.onPreviewLoaded(android.graphics.Bitmap, java.lang.Integer):void");
    }

    public void onReady() {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        debug("onSizeChanged %dx%d -> %dx%d scale: %f, pendingScale: %f, needPendingScale: %b", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(this.scale), this.pendingScale, Boolean.valueOf(this.mNeedPendingScale));
        initScaleRate();
        PointF center = getCenter();
        if ((this.readySent || this.mNeedPendingScale) && center != null) {
            this.anim = null;
            if (!this.mNeedPendingScale) {
                this.pendingScale = Float.valueOf(this.scale);
                this.sPendingCenter = center;
            }
        }
    }

    public synchronized void onTileLoaded(Tile tile) {
        Bitmap bitmap2;
        this.fullImageTileLoadedStart = System.currentTimeMillis();
        String str = this.TAG;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(tile.sampleSize);
        objArr[1] = Boolean.valueOf(tile.bitmap == null);
        Log.m105919d(str, "alvinluo onTileLoaded sampleSize: %d, bitmap == null: %b", objArr);
        if (tile.sampleSize == this.fullImageSampleSize && tile.bitmap != null && this.isFirstLoadFullImage) {
            Log.m105924i(this.TAG, "alvinluo onTileLoaded set fullImageBitmap");
            this.isFirstLoadFullImage = false;
            this.fullImageBitmap = tile.bitmap;
        }
        checkReady();
        checkImageLoaded();
        if (isBaseLayerReady() && (bitmap2 = this.bitmap) != null) {
            if (!this.bitmapIsCached) {
                bitmap2.recycle();
            }
            this.bitmap = null;
            OnImageEventListener onImageEventListener2 = this.onImageEventListener;
            if (onImageEventListener2 != null && this.bitmapIsCached) {
                onImageEventListener2.onPreviewReleased();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = false;
        }
        invalidate();
    }

    public synchronized void onTilesInited(ImageRegionDecoder imageRegionDecoder, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        debug("alvinluo onTilesInited sWidth: %d, sHeight: %d, this.sWidth: %d, this.sHeight: %d, sOrientation: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.sWidth), Integer.valueOf(this.sHeight), Integer.valueOf(i3));
        int i8 = this.sWidth;
        if (i8 > 0 && (i7 = this.sHeight) > 0 && !(i8 == i && i7 == i2)) {
            reset(false);
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                if (!this.bitmapIsCached) {
                    bitmap2.recycle();
                }
                this.bitmap = null;
                OnImageEventListener onImageEventListener2 = this.onImageEventListener;
                if (onImageEventListener2 != null && this.bitmapIsCached) {
                    onImageEventListener2.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
        }
        this.decoder = imageRegionDecoder;
        this.sWidth = i;
        this.sHeight = i2;
        this.sOrientation = i3;
        checkReady();
        if (!checkImageLoaded() && (i4 = this.maxTileWidth) > 0 && i4 != (i5 = TILE_SIZE_AUTO) && (i6 = this.maxTileHeight) > 0 && i6 != i5 && getWidth() > 0 && getHeight() > 0) {
            initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
        }
        invalidate();
        requestLayout();
        System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0145, code lost:
        if (r3 != false) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r2 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r3 = "onTouchEvent"
            java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
            r5 = r18
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = r7.TAG
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r19.getAction()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            android.view.MotionEvent r3 = r7.lastMotionEvent
            r9 = 1
            r2[r9] = r3
            java.lang.String r3 = "alvinluo SubSamplingScaleImageView onTouchEvent: %d, lastMotionEvent: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r3, r2)
            boolean r0 = r7.allowInterceptTouch
            if (r0 != 0) goto L_0x0061
            android.view.MotionEvent r0 = r7.lastMotionEvent
            if (r0 == 0) goto L_0x0061
            int r0 = r0.getAction()
            int r2 = r19.getAction()
            if (r0 != r2) goto L_0x0061
            int r0 = r19.getAction()
            if (r0 != 0) goto L_0x0061
            r1 = 1
            java.lang.String r3 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r4 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x0061:
            int r0 = r19.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = 0
            if (r0 == r9) goto L_0x0074
            r5 = 6
            if (r0 == r5) goto L_0x0074
            if (r0 != r2) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            r7.lastMotionEvent = r8
            goto L_0x0076
        L_0x0074:
            r7.lastMotionEvent = r3
        L_0x0076:
            android.view.View$OnTouchListener r0 = r7.onTouchListener
            if (r0 == 0) goto L_0x007d
            r0.onTouch(r7, r8)
        L_0x007d:
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$Anim r0 = r7.anim
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.interruptible
            if (r0 != 0) goto L_0x0099
            r7.requestDisallowInterceptTouchEvent(r9)
            r1 = 1
            java.lang.String r3 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r4 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x0099:
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$Anim r0 = r7.anim
            if (r0 == 0) goto L_0x00b9
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$OnAnimationEventListener r0 = r0.listener
            if (r0 == 0) goto L_0x00b9
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$Anim r0 = r7.anim     // Catch:{ Exception -> 0x00ad }
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$OnAnimationEventListener r0 = r0.listener     // Catch:{ Exception -> 0x00ad }
            r0.onInterruptedByUser()     // Catch:{ Exception -> 0x00ad }
            goto L_0x00b9
        L_0x00ad:
            r0 = move-exception
            java.lang.String r5 = r7.TAG
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r4] = r0
            java.lang.String r0 = "Error thrown by animation listener"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r0, r6)
        L_0x00b9:
            r7.anim = r3
            android.graphics.PointF r0 = r7.vTranslate
            if (r0 != 0) goto L_0x0107
            android.view.GestureDetector r0 = r7.singleDetector
            if (r0 == 0) goto L_0x00f8
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r8)
            java.lang.Object[] r11 = r1.mo10232b()
            java.lang.String r12 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r13 = "onTouchEvent"
            java.lang.String r14 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r15 = "android/view/GestureDetector_EXEC_"
            java.lang.String r16 = "onTouchEvent"
            java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = r1.mo10231a(r4)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r11 = r0.onTouchEvent(r1)
            java.lang.String r12 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r13 = "onTouchEvent"
            java.lang.String r14 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r15 = "android/view/GestureDetector_EXEC_"
            java.lang.String r16 = "onTouchEvent"
            java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00f8:
            r1 = 1
            java.lang.String r3 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r4 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x0107:
            boolean r0 = r7.isQuickScaling
            if (r0 != 0) goto L_0x015c
            android.view.GestureDetector r0 = r7.detector
            if (r0 == 0) goto L_0x0147
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r8)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r13 = "onTouchEvent"
            java.lang.String r14 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r15 = "android/view/GestureDetector_EXEC_"
            java.lang.String r16 = "onTouchEvent"
            java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r4)
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3
            boolean r3 = r0.onTouchEvent(r3)
            java.lang.String r12 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r13 = "onTouchEvent"
            java.lang.String r14 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r15 = "android/view/GestureDetector_EXEC_"
            java.lang.String r16 = "onTouchEvent"
            java.lang.String r17 = "(Landroid/view/MotionEvent;)Z"
            r11 = r3
            j20.C117292a.m165360f(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x015c
        L_0x0147:
            r7.isZooming = r4
            r7.isPanning = r4
            r7.maxTouchCount = r4
            r1 = 1
            java.lang.String r3 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r4 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x015c:
            android.graphics.PointF r0 = r7.vTranslateStart
            r3 = 0
            if (r0 != 0) goto L_0x0168
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r3)
            r7.vTranslateStart = r0
        L_0x0168:
            android.graphics.PointF r0 = r7.vTranslateBefore
            if (r0 != 0) goto L_0x0173
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r3)
            r7.vTranslateBefore = r0
        L_0x0173:
            android.graphics.PointF r0 = r7.vCenterStart
            if (r0 != 0) goto L_0x017e
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r3)
            r7.vCenterStart = r0
        L_0x017e:
            float r0 = r7.scale
            android.graphics.PointF r3 = r7.vTranslateBefore
            android.graphics.PointF r5 = r7.vTranslate
            r3.set(r5)
            boolean r10 = r18.onTouchEventInternal(r19)
            r7.setInternalTouchEventConsumed(r10)
            android.graphics.PointF r3 = r7.vTranslateBefore
            r7.sendStateChanged(r0, r3, r1)
            boolean r0 = super.onTouchEvent(r19)
            java.lang.String r3 = r7.TAG
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r2[r4] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            r2[r9] = r5
            boolean r5 = r7.allowInterceptTouch
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2[r1] = r5
            java.lang.String r1 = "alvinluo onTouchEvent super: %b, handled: %b, allowInterceptTouch: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r1, r2)
            boolean r1 = r7.allowInterceptTouch
            if (r1 == 0) goto L_0x01cd
            if (r10 != 0) goto L_0x01be
            if (r0 == 0) goto L_0x01bd
            goto L_0x01be
        L_0x01bd:
            r9 = 0
        L_0x01be:
            java.lang.String r3 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r4 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            r1 = r9
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x01cd:
            java.lang.String r3 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r4 = "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            r1 = r10
            r2 = r18
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public Executor provideExecutor() {
        return this.executor;
    }

    public void recycle() {
        reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf(limitedScale(0.0f));
        if (isReady()) {
            this.sPendingCenter = new PointF((float) (sWidth() / 2), (float) (sHeight() / 2));
        } else {
            this.sPendingCenter = new PointF(0.0f, 0.0f);
        }
        invalidate();
    }

    public void resetSize() {
        setScaleAndCenter(this.mScaleRate, new PointF(0.0f, 0.0f));
    }

    public Bitmap rotateAndScaleBitmap(Bitmap bitmap2, int i, float f, float f2) {
        if (bitmap2 == null) {
            Log.m105920e(this.TAG, "alvinluo rotateAndScaleBitmap bitmap is null");
            return null;
        }
        Matrix matrix2 = new Matrix();
        matrix2.postScale(f, f2);
        if (i != 0) {
            matrix2.postRotate((float) i);
        }
        Log.m105919d(this.TAG, "alvinluo rotateAndScaleBitmap matrix.isIdentify: %b", Boolean.valueOf(matrix2.isIdentity()));
        if (bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0) {
            if (matrix2.isIdentity()) {
                return bitmap2;
            }
            try {
                return Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix2, true);
            } catch (OutOfMemoryError e) {
                Log.printErrStackTrace(this.TAG, e, "alvinluo createBitmap oom", new Object[0]);
                preferredBitmapConfig = Bitmap.Config.RGB_565;
            }
        }
        return null;
    }

    public void setAllowInterceptTouchEvent(boolean z) {
        this.allowInterceptTouch = z;
    }

    public final void setBitmapDecoderClass(Class<? extends ImageRegionDecoder> cls) {
        if (cls != null) {
            this.bitmapDecoderFactory = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.bitmapDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public void setCanRefresh(boolean z) {
        this.canRefresh = z;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.doubleTapZoomDuration = Math.max(0, i);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.doubleTapZoomScale = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (VALID_ZOOM_STYLES.contains(Integer.valueOf(i))) {
            this.doubleTapZoomStyle = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public void setDrawFullSampleSizeBitmap(boolean z) {
        if (this.mDrawFullSampleSizeBitmap != z) {
            Log.m105925i(this.TAG, "setDrawFullSampleSizeBitmap %s", Boolean.valueOf(z));
            this.mDrawFullSampleSizeBitmap = z;
            invalidate();
        }
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.eagerLoadingEnabled = z;
    }

    public void setEdgeSwipeListener(EdgeSwipeListener edgeSwipeListener) {
        this.mEdgeSwipeListener = edgeSwipeListener;
    }

    public void setExecutor(Executor executor2) {
        if (executor2 != null) {
            this.executor = executor2;
            return;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public void setGestureDetectorListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.gestureDetectorListener = simpleOnGestureListener;
    }

    public final void setImage(ImageSource imageSource) {
        setImage(imageSource, (ImageSource) null, (ImageViewState) null);
    }

    public void setImageViewMatrix(Matrix matrix2) {
        if (this.vTranslate == null) {
            this.vTranslate = new PointF();
        }
        matrix2.getValues(this.matrixValues);
        PointF pointF = this.vTranslate;
        float[] fArr = this.matrixValues;
        pointF.set(fArr[2], fArr[5]);
        updateScale(this.matrixValues[0]);
        fitToBounds(false);
        invalidate();
    }

    public void setInternalTouchEventConsumed(boolean z) {
        this.IsinternalTouchEventConsumed = z;
    }

    public final void setMaxScale(float f) {
        this.maxScale = f;
    }

    public void setMaxTileSize(int i) {
        this.maxTileWidth = i;
        this.maxTileHeight = i;
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinScale(float f) {
        this.minScale = f;
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i));
    }

    public final void setMinimumScaleType(int i) {
        if (VALID_SCALE_TYPES.contains(Integer.valueOf(i))) {
            this.minimumScaleType = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.minimumTileDpi = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i);
        if (isReady()) {
            reset(false);
            invalidate();
        }
    }

    public void setOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener2) {
        this.onAttachStateChangeListener = onAttachStateChangeListener2;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener2) {
        this.onDoubleTapListener = onDoubleTapListener2;
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener2) {
        this.onImageEventListener = onImageEventListener2;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener2) {
        this.onLongClickListener = onLongClickListener2;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener2) {
        this.onStateChangedListener = onStateChangedListener2;
    }

    public final void setOrientation(int i) {
        if (VALID_ORIENTATIONS.contains(Integer.valueOf(i))) {
            this.orientation = i;
            reset(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.panEnabled = z;
        if (!z && (pointF = this.vTranslate) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.scale * ((float) (sWidth() / 2)));
            this.vTranslate.y = ((float) (getHeight() / 2)) - (this.scale * ((float) (sHeight() / 2)));
            if (isReady()) {
                refreshRequiredTiles(true);
                invalidate();
            }
        }
    }

    public final void setPanLimit(int i) {
        if (VALID_PAN_LIMITS.contains(Integer.valueOf(i))) {
            this.panLimit = i;
            if (isReady()) {
                fitToBounds(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i);
    }

    public void setPreviewDone(boolean z) {
        this.mPreviewDone = z;
        invalidate();
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.quickScaleEnabled = z;
    }

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> cls) {
        if (cls != null) {
            this.regionDecoderFactory = new CompatDecoderFactory(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.regionDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setScaleAndCenter(float f, PointF pointF) {
        this.anim = null;
        this.mNeedPendingScale = true;
        this.pendingScale = Float.valueOf(f);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        invalidate();
    }

    public void setScaleRate(float f) {
        this.mScaleRate = f;
        resetScales();
        initMaxScale();
        initMinScale();
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.tileBgPaint = null;
        } else {
            Paint paint = new Paint();
            this.tileBgPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(i);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.zoomEnabled = z;
    }

    public void setsRegion(Rect rect) {
        this.sRegion = rect;
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
        if (this.vTranslate != null && this.readySent) {
            rect2.set((int) viewToSourceX((float) rect.left), (int) viewToSourceY((float) rect.top), (int) viewToSourceX((float) rect.right), (int) viewToSourceY((float) rect.bottom));
            fileSRect(rect2, rect2);
            rect2.set(Math.max(0, rect2.left), Math.max(0, rect2.top), Math.min(this.sWidth, rect2.right), Math.min(this.sHeight, rect2.bottom));
            Rect rect3 = this.sRegion;
            if (rect3 != null) {
                rect2.offset(rect3.left, rect3.top);
            }
        }
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    public void visibleFileRect(Rect rect) {
        if (this.vTranslate != null && this.readySent) {
            rect.set(0, 0, getWidth(), getHeight());
            viewToFileRect(rect, rect);
        }
    }

    public void zoomToWithAnimation(float f, float f2, float f3) {
        PointF pointF = new PointF(f2, f3);
        Log.m105927v(this.TAG, "alvinluo zoomToWithAnimation target scale: %s, mScaleRate: %s", Float.valueOf(f), Float.valueOf(this.mScaleRate));
        new AnimationBuilder(f, viewToSourceCoord(pointF)).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        invalidate();
    }

    public final void setImage(ImageSource imageSource, ImageViewState imageViewState) {
        setImage(imageSource, (ImageSource) null, imageViewState);
    }

    public final PointF sourceToViewCoord(float f, float f2) {
        return sourceToViewCoord(f, f2, new PointF());
    }

    public final PointF viewToSourceCoord(float f, float f2) {
        return viewToSourceCoord(f, f2, new PointF());
    }

    /* access modifiers changed from: private */
    public float doubleTapZoom(PointF pointF, PointF pointF2) {
        PointF pointF3 = pointF;
        if (!this.panEnabled) {
            PointF pointF4 = this.sRequestedCenter;
            if (pointF4 != null) {
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
            } else {
                pointF3.x = (float) (sWidth() / 2);
                pointF3.y = (float) (sHeight() / 2);
            }
        }
        float doubleTapZoomScale2 = getDoubleTapZoomScale();
        Log.m105925i(this.TAG, "alvinluo doubleTapZoom %f, scale: %s, mScaleRate: %s", Float.valueOf(doubleTapZoomScale2), Float.valueOf(this.scale), Float.valueOf(this.mScaleRate));
        float f = this.scale;
        boolean z = ((double) f) <= ((double) doubleTapZoomScale2) * 0.9d || f == this.mScaleRate;
        if (!z) {
            doubleTapZoomScale2 = this.mScaleRate;
        }
        float f2 = doubleTapZoomScale2;
        int i = this.doubleTapZoomStyle;
        if (i == 3) {
            setScaleAndCenter(f2, pointF3);
        } else if (i == 2 || !z || !this.panEnabled) {
            new AnimationBuilder(f2, pointF3).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        } else if (i == 1) {
            new AnimationBuilder(f2, pointF, pointF2).withInterruptible(false).withDuration((long) this.doubleTapZoomDuration).withOrigin(4).start();
        }
        invalidate();
        return f2;
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2) {
        setImage(imageSource, imageSource2, (ImageViewState) null);
    }

    public void setMaxTileSize(int i, int i2) {
        this.maxTileWidth = i;
        this.maxTileHeight = i2;
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        private final PointF vFocus;

        /* access modifiers changed from: private */
        public AnimationBuilder withOrigin(int i) {
            this.origin = i;
            return this;
        }

        /* access modifiers changed from: private */
        public AnimationBuilder withPanLimited(boolean z) {
            this.panLimited = z;
            return this;
        }

        public void start() {
            PointF pointF;
            if (!(SubsamplingScaleImageView.this.anim == null || SubsamplingScaleImageView.this.anim.listener == null)) {
                try {
                    SubsamplingScaleImageView.this.anim.listener.onInterruptedByNewAnim();
                } catch (Exception e) {
                    Log.m105929w(SubsamplingScaleImageView.this.TAG, "Error thrown by animation listener", e);
                }
            }
            int paddingLeft = SubsamplingScaleImageView.this.getPaddingLeft() + (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = SubsamplingScaleImageView.this.getPaddingTop() + (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float access$5300 = SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            if (this.panLimited) {
                SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                PointF pointF2 = this.targetSCenter;
                pointF = subsamplingScaleImageView.limitedSCenter(pointF2.x, pointF2.y, access$5300, new PointF());
            } else {
                pointF = this.targetSCenter;
            }
            Anim unused = SubsamplingScaleImageView.this.anim = new Anim();
            float unused2 = SubsamplingScaleImageView.this.anim.scaleStart = SubsamplingScaleImageView.this.scale;
            float unused3 = SubsamplingScaleImageView.this.anim.scaleEnd = access$5300;
            long unused4 = SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            PointF unused5 = SubsamplingScaleImageView.this.anim.sCenterEndRequested = pointF;
            PointF unused6 = SubsamplingScaleImageView.this.anim.sCenterStart = SubsamplingScaleImageView.this.getCenter();
            PointF unused7 = SubsamplingScaleImageView.this.anim.sCenterEnd = pointF;
            PointF unused8 = SubsamplingScaleImageView.this.anim.vFocusStart = SubsamplingScaleImageView.this.sourceToViewCoord(pointF);
            PointF unused9 = SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF((float) paddingLeft, (float) paddingTop);
            long unused10 = SubsamplingScaleImageView.this.anim.duration = this.duration;
            boolean unused11 = SubsamplingScaleImageView.this.anim.interruptible = this.interruptible;
            int unused12 = SubsamplingScaleImageView.this.anim.easing = this.easing;
            int unused13 = SubsamplingScaleImageView.this.anim.origin = this.origin;
            long unused14 = SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            OnAnimationEventListener unused15 = SubsamplingScaleImageView.this.anim.listener = this.listener;
            PointF pointF3 = this.vFocus;
            if (pointF3 != null) {
                float f = pointF3.x - (SubsamplingScaleImageView.this.anim.sCenterStart.x * access$5300);
                float f2 = this.vFocus.y - (SubsamplingScaleImageView.this.anim.sCenterStart.y * access$5300);
                ScaleAndTranslate scaleAndTranslate = new ScaleAndTranslate(access$5300, new PointF(f, f2));
                SubsamplingScaleImageView.this.fitToBounds(true, scaleAndTranslate);
                PointF unused16 = SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF(this.vFocus.x + (scaleAndTranslate.vTranslate.x - f), this.vFocus.y + (scaleAndTranslate.vTranslate.y - f2));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public AnimationBuilder withDuration(long j) {
            this.duration = j;
            return this;
        }

        public AnimationBuilder withEasing(int i) {
            if (SubsamplingScaleImageView.VALID_EASING_STYLES.contains(Integer.valueOf(i))) {
                this.easing = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        public AnimationBuilder withInterruptible(boolean z) {
            this.interruptible = z;
            return this;
        }

        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }

        private AnimationBuilder(PointF pointF) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = SubsamplingScaleImageView.this.scale;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = SubsamplingScaleImageView.this.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(float f, PointF pointF) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f, PointF pointF, PointF pointF2) {
            this.duration = 500;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2, ImageViewState imageViewState) {
        if (imageSource != null) {
            this.mMainImageSource = imageSource;
            this.mPreviewSource = imageSource2;
            reset(true);
            if (imageViewState != null) {
                restoreState(imageViewState);
            }
            if (imageSource.getUri() != null) {
                this.sOrientation = getExifOrientation(getContext(), imageSource.getUri());
            }
            if (imageSource2 != null) {
                imageSource.getBitmap();
                if (imageSource.getSWidth() <= 0 || imageSource.getSHeight() <= 0) {
                    Log.m105920e(this.TAG, "alvinluo Preview image cannot be used unless dimensions are provided for the main image");
                } else {
                    this.sWidth = imageSource.getSWidth();
                    this.sHeight = imageSource.getSHeight();
                    this.pRegion = imageSource2.getSRegion();
                    if (imageSource2.getBitmap() != null) {
                        this.bitmapIsCached = imageSource2.isCached();
                        onPreviewLoaded(imageSource2.getBitmap(), 0);
                    } else {
                        Uri uri2 = imageSource2.getUri();
                        if (uri2 == null && imageSource2.getResource() != null) {
                            uri2 = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource2.getResource());
                        }
                        mBitmapLoader.newInstance(this, getContext(), this.bitmapDecoderFactory, uri2, true).startLoad();
                    }
                }
            }
            if (imageSource.getBitmap() != null && imageSource.getSRegion() != null) {
                onImageLoaded(Bitmap.createBitmap(imageSource.getBitmap(), imageSource.getSRegion().left, imageSource.getSRegion().top, imageSource.getSRegion().width(), imageSource.getSRegion().height()), 0, false);
            } else if (imageSource.getBitmap() != null) {
                onImageLoaded(imageSource.getBitmap(), 0, imageSource.isCached());
            } else {
                this.sRegion = imageSource.getSRegion();
                Uri uri3 = imageSource.getUri();
                this.uri = uri3;
                if (uri3 == null && imageSource.getResource() != null) {
                    this.uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource.getResource());
                }
                if (imageSource.getTile() || this.sRegion != null) {
                    mTileInitLoader.newInstance(this, getContext(), this.regionDecoderFactory, this.uri).startLoad();
                    return;
                }
                mBitmapLoader.newInstance(this, getContext(), this.bitmapDecoderFactory, this.uri, false).startLoad();
            }
        } else {
            throw new NullPointerException("imageSource must not be null");
        }
    }

    public final PointF sourceToViewCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(sourceToViewX(f), sourceToViewY(f2));
        return pointF;
    }

    public final PointF viewToSourceCoord(float f, float f2, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(viewToSourceX(f), viewToSourceY(f2));
        return pointF;
    }

    public void onImageLoaded() {
        Log.m105924i(this.TAG, "alvinluo onImageLoaded");
        initScaleRate();
        setScaleAndCenter(this.mScaleRate, new PointF(0.0f, 0.0f));
        if (this.fullImageTileLoadedStart != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            this.fullImageTileLoadedEnd = currentTimeMillis;
            addTileDecodeTime((int) (currentTimeMillis - this.fullImageTileLoadedStart));
        }
        ThreadPool.post(new Runnable() {
            public void run() {
                if (SubsamplingScaleImageView.this.fullImageBitmap != null && !SubsamplingScaleImageView.this.fullImageBitmap.isRecycled()) {
                    Log.m105924i(SubsamplingScaleImageView.this.TAG, "alvinluo rotateAndScale fullImageBitmap");
                    SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
                    Bitmap unused = subsamplingScaleImageView.fullImageBitmap = subsamplingScaleImageView.rotateAndScaleBitmap(subsamplingScaleImageView.fullImageBitmap, SubsamplingScaleImageView.this.sOrientation, 1.0f, 1.0f);
                }
                SubsamplingScaleImageView.this.post(new Runnable() {
                    public void run() {
                        if (SubsamplingScaleImageView.this.onImageEventListener != null) {
                            SubsamplingScaleImageView.this.onImageEventListener.onImageLoaded(SubsamplingScaleImageView.this.fullImageBitmap);
                        }
                    }
                });
            }
        }, "rotateAndScaleFullImageBitmap");
    }

    private void fitToBounds(boolean z) {
        boolean z2;
        if (this.vTranslate == null) {
            z2 = true;
            this.vTranslate = new PointF(0.0f, 0.0f);
        } else {
            z2 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        float unused = this.satTemp.scale = this.scale;
        this.satTemp.vTranslate.set(this.vTranslate);
        fitToBounds(z, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if (z2 && this.minimumScaleType != 4) {
            this.vTranslate.set(vTranslateForSCenter((float) (sWidth() / 2), (float) (sHeight() / 2), this.scale));
        }
    }

    private void onPreviewLoaded() {
        OnImageEventListener onImageEventListener2;
        Log.m105924i(this.TAG, "alvinluo onPreviewLoaded");
        if (!this.isPreviewLoaded && (onImageEventListener2 = this.onImageEventListener) != null) {
            onImageEventListener2.onPreviewLoaded();
        }
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
