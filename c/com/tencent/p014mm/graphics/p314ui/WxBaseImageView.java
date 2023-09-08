package com.tencent.p014mm.graphics.p314ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.C17756c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import d20.C20382b;
import d20.C31050d;
import d20.C7164a;
import e20.C116637d;
import e20.C86418c;
import e20.C97587e;
import e20.C97588f;
import f20.C20644a;
import g20.C98078a;
import java.lang.ref.WeakReference;
import lu3.C88654b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.graphics.ui.WxBaseImageView */
public class WxBaseImageView extends FrameLayout {

    /* renamed from: z */
    public static final /* synthetic */ int f48884z = 0;

    /* renamed from: d */
    public Context f48885d;

    /* renamed from: e */
    public ViewStub f48886e;

    /* renamed from: f */
    public SubsamplingScaleImageView f48887f;

    /* renamed from: g */
    public C31050d f48888g;

    /* renamed from: h */
    public int f48889h;

    /* renamed from: i */
    public int f48890i;

    /* renamed from: j */
    public long f48891j;

    /* renamed from: n */
    public boolean f48892n;

    /* renamed from: o */
    public Rect f48893o;

    /* renamed from: p */
    public C20644a.C20645a f48894p;

    /* renamed from: q */
    public C20644a.C20645a f48895q;

    /* renamed from: r */
    public boolean f48896r;

    /* renamed from: s */
    public boolean f48897s;

    /* renamed from: t */
    public boolean f48898t;

    /* renamed from: u */
    public boolean f48899u;

    /* renamed from: v */
    public boolean f48900v;

    /* renamed from: w */
    public boolean f48901w;

    /* renamed from: x */
    public boolean f48902x;

    /* renamed from: y */
    public MMHandler f48903y;

    /* renamed from: com.tencent.mm.graphics.ui.WxBaseImageView$a */
    public class C17757a implements C20382b {

        /* renamed from: a */
        public final /* synthetic */ C20382b f48904a;

        public C17757a(C20382b bVar) {
            this.f48904a = bVar;
        }

        public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
            WxBaseImageView wxBaseImageView = WxBaseImageView.this;
            if (wxBaseImageView.f48895q != null) {
                wxBaseImageView.mo21390g(imageDecodeResult.errCode);
                wxBaseImageView.f48899u = true;
                wxBaseImageView.mo21401q();
            }
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onImageLoadError(imageDecodeResult);
            }
        }

        public void onImageLoaded(Bitmap bitmap) {
            WxBaseImageView wxBaseImageView = WxBaseImageView.this;
            if (!(wxBaseImageView.f48887f == null || wxBaseImageView.f48895q == null || !wxBaseImageView.f48897s)) {
                wxBaseImageView.mo21390g(0);
                wxBaseImageView.f48899u = true;
                wxBaseImageView.mo21401q();
            }
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onImageLoaded(bitmap);
            }
        }

        public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
            WxBaseImageView wxBaseImageView = WxBaseImageView.this;
            if (wxBaseImageView.f48894p != null) {
                wxBaseImageView.mo21398j(imageDecodeResult.errCode);
                wxBaseImageView.f48898t = true;
                wxBaseImageView.mo21401q();
            }
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onPreviewLoadError(imageDecodeResult);
            }
        }

        public void onPreviewLoaded() {
            WxBaseImageView wxBaseImageView = WxBaseImageView.this;
            if (!(wxBaseImageView.f48887f == null || wxBaseImageView.f48894p == null || !wxBaseImageView.f48896r)) {
                wxBaseImageView.mo21398j(0);
                wxBaseImageView.f48894p.f58119h = 0;
                wxBaseImageView.f48898t = true;
                wxBaseImageView.mo21401q();
            }
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onPreviewLoaded();
            }
        }

        public void onPreviewReleased() {
            Log.m105924i("MicroMsg.WxBaseImageView", "alvinluo onPreviewReleased");
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onPreviewReleased();
            }
        }

        public void onReady() {
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onReady();
            }
        }

        public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
            WxBaseImageView wxBaseImageView = WxBaseImageView.this;
            if (wxBaseImageView.f48895q != null) {
                wxBaseImageView.mo21390g(imageDecodeResult.errCode);
                wxBaseImageView.f48899u = true;
                wxBaseImageView.mo21401q();
            }
            C20382b bVar = this.f48904a;
            if (bVar != null) {
                bVar.onTileLoadError(imageDecodeResult);
            }
        }
    }

    public WxBaseImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    private String getActivityName() {
        Context context = this.f48885d;
        return (context == null || !(context instanceof Activity)) ? "Default" : ((Activity) context).getClass().getSimpleName();
    }

    /* renamed from: g */
    public final void mo21390g(int i) {
        C20644a.C20645a aVar;
        try {
            if (this.f48887f != null && (aVar = this.f48895q) != null) {
                aVar.f58120i = (int) (System.currentTimeMillis() - this.f48891j);
                ImageDecodeRecord imageDecodeRecord = this.f48887f.getImageDecodeRecord();
                if (imageDecodeRecord != null) {
                    this.f48895q.f58122k = imageDecodeRecord.getMainImageDecodeTime();
                } else {
                    this.f48894p.f58122k = 0;
                }
                C20644a.C20645a aVar2 = this.f48895q;
                aVar2.f58119h = i;
                aVar2.f58118g = this.f48887f.getRequiredRotation();
                this.f48895q.f58115d = this.f48887f.getSWidth();
                this.f48895q.f58116e = this.f48887f.getSHeight();
                this.f48895q.f58121j = this.f48887f.getFullImageSampleSize();
                C20644a.C20645a aVar3 = this.f48895q;
                aVar3.f58117f = (int) C86013q1.m106451l(aVar3.f58112a);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxBaseImageView", e, "alvinluo fillMainInfo exception", new Object[0]);
        }
    }

    public Bitmap getFullImageBitmap() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getFullImageBitmap();
        }
        return null;
    }

    public PointF getImageViewMatrixScale() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getImageViewMatrixScale();
        }
        return null;
    }

    public PointF getImageViewMatrixTranslation() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getImageViewMatrixTranslation();
        }
        return null;
    }

    public boolean getInternalTouchEventConsumed() {
        return this.f48887f.getInternalTouchEventConsumed();
    }

    public float getMinScale() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getMinScale();
        }
        return 1.0f;
    }

    public float getScale() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getScale();
        }
        return 1.0f;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: j */
    public final void mo21398j(int i) {
        C20644a.C20645a aVar;
        try {
            if (this.f48887f != null && (aVar = this.f48894p) != null) {
                aVar.f58120i = (int) (System.currentTimeMillis() - this.f48891j);
                ImageDecodeRecord imageDecodeRecord = this.f48887f.getImageDecodeRecord();
                if (imageDecodeRecord != null) {
                    this.f48894p.f58122k = imageDecodeRecord.getPreviewLoadedTime();
                } else {
                    this.f48894p.f58122k = 0;
                }
                C20644a.C20645a aVar2 = this.f48894p;
                aVar2.f58119h = i;
                aVar2.f58118g = this.f48887f.getPreviewOrientation();
                this.f48894p.f58115d = this.f48887f.getPreviewWidth();
                this.f48894p.f58116e = this.f48887f.getPreviewHeight();
                C20644a.C20645a aVar3 = this.f48894p;
                aVar3.f58121j = 1;
                aVar3.f58117f = (int) C86013q1.m106451l(aVar3.f58112a);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxBaseImageView", e, "alvinluo fillPreviewInfo exception", new Object[0]);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f48893o.left = getLeft();
        this.f48893o.right = getRight();
        this.f48893o.top = getTop();
        this.f48893o.bottom = getBottom();
        if (!getGlobalVisibleRect(this.f48893o)) {
            this.f48892n = false;
        } else {
            Log.m105918d("MicroMsg.WxBaseImageView", "alvinluo ImageView visible, can report");
            this.f48892n = true;
            if (!this.f48902x) {
                this.f48902x = true;
                C97588f fVar = C97588f.INSTANCE;
                synchronized (fVar.f286318h) {
                    if (fVar.f286316f) {
                        Log.m105928w("MicroMsg.PerformanceMonitor", "hy: already running. stop last and run new");
                        fVar.f286316f = false;
                    }
                    C88654b bVar = fVar.f286317g;
                    if (bVar != null) {
                        bVar.mo97819a();
                    }
                    System.gc();
                    fVar.f286315e.clear();
                    WeakReference<Context> weakReference = fVar.f286314d;
                    if (!(weakReference == null || weakReference.get() == null)) {
                        fVar.f286315e.put(2, new C86418c(fVar.f286314d.get()));
                    }
                    C119179t tVar = C119157j.f356862d;
                    C97587e eVar = new C97587e(fVar);
                    fVar.f286317g = eVar;
                    ((C119157j) tVar).mo183873d(eVar, 0, 5);
                    fVar.f286316f = true;
                }
            }
        }
        mo21401q();
    }

    /* renamed from: p */
    public void mo21400p(String str, ImageSource imageSource) {
        Log.m105919d("MicroMsg.WxBaseImageView", "alvinluo: loading from local file: %s, width: %d, height: %d, %d", str, Integer.valueOf(this.f48889h), Integer.valueOf(this.f48890i), Integer.valueOf(hashCode()));
        if (this.f48888g != C31050d.Tile) {
            return;
        }
        if (this.f48887f == null) {
            Log.m105920e("MicroMsg.WxBaseImageView", "alvinluo WxBaseImageView laodFile mTileIv is null");
        } else if (str == null) {
            Log.m105924i("MicroMsg.WxBaseImageView", "alvinluo WxBaseImageView loadFile path is null");
        } else {
            this.f48886e.setVisibility(0);
            ImageSource uri = ImageSource.uri(str);
            uri.dimensions(this.f48889h, this.f48890i);
            long currentTimeMillis = System.currentTimeMillis();
            this.f48891j = currentTimeMillis;
            Log.m105925i("MicroMsg.WxBaseImageView", "alvinluo onStartLoad imagePath: %s, mStartLoadTime: %d", str, Long.valueOf(currentTimeMillis));
            C20644a.C20645a aVar = new C20644a.C20645a();
            this.f48895q = aVar;
            aVar.f58114c = 22;
            aVar.f58112a = str;
            aVar.f58113b = getActivityName();
            this.f48897s = true;
            if (imageSource != null) {
                this.f48894p = new C20644a.C20645a();
                if (imageSource.getUri() != null) {
                    this.f48894p.f58112a = imageSource.getUri().toString();
                } else {
                    this.f48894p.f58112a = "";
                }
                Log.m105919d("MicroMsg.WxBaseImageView", "alvinluo onStartLoad previewImagePath: %s", this.f48894p.f58112a);
                C20644a.C20645a aVar2 = this.f48894p;
                aVar2.f58114c = 21;
                aVar2.f58113b = getActivityName();
                this.f48896r = true;
            } else {
                this.f48896r = false;
            }
            if (imageSource != null) {
                this.f48887f.setImage(uri, imageSource);
            } else {
                this.f48887f.setImage(uri);
            }
        }
    }

    /* renamed from: q */
    public final void mo21401q() {
        if (!this.f48892n || this.f48900v) {
            return;
        }
        if (this.f48896r && !this.f48898t) {
            return;
        }
        if (!this.f48897s || this.f48899u) {
            Log.m105924i("MicroMsg.WxBaseImageView", "alvinluo reportImageInfo info ready and report");
            C20644a aVar = C20644a.INSTANCE;
            C20644a.C20645a aVar2 = this.f48895q;
            C20644a.C20645a aVar3 = this.f48894p;
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar2 != null) {
                aVar.mo32325a(currentTimeMillis, aVar2);
            }
            if (aVar3 != null) {
                aVar.mo32325a(currentTimeMillis, aVar3);
            }
            this.f48900v = true;
        }
    }

    public void setAllowInterceptTouchEvent(boolean z) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setAllowInterceptTouchEvent(z);
        }
    }

    public void setAnimateMode(C7164a aVar) {
        Log.m105919d("MicroMsg.WxBaseImageView", "hy: set current animation mode: %s", aVar);
    }

    public void setCanRefresh(boolean z) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setCanRefresh(z);
        }
    }

    public void setCustomScaleRate(Float f) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null && f != null) {
            subsamplingScaleImageView.setScaleRate(f.floatValue());
        }
    }

    public void setDrawFullSampleSizeBitmap(boolean z) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setDrawFullSampleSizeBitmap(z);
        }
    }

    public void setEdgeSwipeListener(SubsamplingScaleImageView.EdgeSwipeListener edgeSwipeListener) {
        this.f48887f.setEdgeSwipeListener(edgeSwipeListener);
    }

    public void setFitType(ImageView.ScaleType scaleType) {
        Log.m105919d("MicroMsg.WxBaseImageView", "hy: set fit type: %s", scaleType);
    }

    public void setForceTileFlag(C31050d dVar) {
        Log.m105919d("MicroMsg.WxBaseImageView", "hy: setting force tile flag; %s", dVar);
        this.f48888g = dVar;
    }

    public void setGestureDetectorListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setGestureDetectorListener(simpleOnGestureListener);
        }
    }

    public void setImageViewMatrix(Matrix matrix) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setImageViewMatrix(matrix);
        }
    }

    public void setInternalTouchEventConsumed(boolean z) {
        this.f48887f.setInternalTouchEventConsumed(z);
    }

    public void setMinScale(float f) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setMinScale(f);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public void setOnImageLoadEventListener(C20382b bVar) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnImageEventListener(new C17757a(bVar));
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setOnZoomScaleChangedListener(SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnStateChangedListener(onStateChangedListener);
        }
    }

    public void setScaleRate(float f) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setScaleRate(f);
        }
    }

    public void setTileBackgroundColor(int i) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setTileBackgroundColor(i);
        }
    }

    public WxBaseImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48886e = null;
        this.f48887f = null;
        this.f48888g = C31050d.Tile;
        this.f48892n = false;
        this.f48893o = new Rect();
        this.f48901w = false;
        this.f48902x = false;
        this.f48903y = null;
        this.f48885d = context;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f360043cc0, this, true);
        ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.k9c);
        this.f48886e = viewStub;
        View inflate = viewStub.inflate();
        if (inflate != null) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) inflate;
            this.f48887f = subsamplingScaleImageView;
            subsamplingScaleImageView.setVisibility(0);
        }
        C116637d dVar = C116637d.INSTANCE;
        if (!dVar.f349740g) {
            dVar.f349740g = true;
            Log.m105925i("MicroMsg.Metronome", "[start] stack:%s", Util.getStack());
            dVar.mo180637a().postFrameCallback(dVar);
        }
        C97588f fVar = C97588f.INSTANCE;
        Context context2 = this.f48885d;
        fVar.getClass();
        fVar.f286314d = new WeakReference<>(context2);
        this.f48887f.setOnAttachStateChangeListener(new C98078a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17756c.f48883a);
        try {
            setTileBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
