package com.tencent.p014mm.plugin.gallery.picker.view;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.cropview.BaseCropLayout;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C59741c0;
import gy3.C87412m;
import kotlin.Metadata;
import nw1.C109764e0;
import nw1.C109765f0;
import nw1.C109766g0;
import nw1.C109767h0;
import nw1.C109768i0;
import nw1.C109769j0;
import nw1.C11282c0;
import nw1.C11284d0;
import ph2.C110218c;
import ph2.C110220d;
import po3.C110239i;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002Z[B\u001b\b\u0016\u0012\u0006\u0010S\u001a\u00020R\u0012\b\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WB#\b\u0016\u0012\u0006\u0010S\u001a\u00020R\u0012\b\u0010U\u001a\u0004\u0018\u00010T\u0012\u0006\u0010X\u001a\u00020\u001e¢\u0006\u0004\bV\u0010YJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010.R$\u00106\u001a\u0002002\u0006\u00101\u001a\u0002008\u0002@BX\u000e¢\u0006\f\n\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010>\u001a\u0002072\u0006\u00101\u001a\u0002078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010M\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bM\u0010O\"\u0004\bP\u0010Q¨\u0006\\"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/WxMediaCropLayout;", "Landroid/widget/FrameLayout;", "", "enable", "Lrx3/b0;", "setEnableScale", "Lcom/tencent/mm/plugin/gallery/picker/view/WxMediaCropLayout$a;", "getCurrentCropInfo", "Landroid/widget/ImageView;", "e", "Lrx3/g;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "f", "Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "getVideoView", "()Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "setVideoView", "(Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;)V", "videoView", "Lph2/d;", "g", "Lph2/d;", "getMusicController", "()Lph2/d;", "setMusicController", "(Lph2/d;)V", "musicController", "", "h", "I", "getCurrentType", "()I", "setCurrentType", "(I)V", "currentType", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "n", "getLayout", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "layout", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout;", "o", "getOperationLayout", "()Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout;", "operationLayout", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "value", "p", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "setStyle", "(Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;)V", "style", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "q", "Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "getCropLayoutScaleType", "()Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;", "setCropLayoutScaleType", "(Lcom/tencent/mm/ui/widget/cropview/CropLayout$e;)V", "cropLayoutScaleType", "", "s", "[I", "getMediaWH", "()[I", "mediaWH", "", "t", "J", "getLockCropMediaId", "()J", "setLockCropMediaId", "(J)V", "lockCropMediaId", "isShowBorder", "Z", "()Z", "setShowBorder", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "gallery-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout */
public final class WxMediaCropLayout extends FrameLayout {

    /* renamed from: u */
    public static final /* synthetic */ int f313189u = 0;

    /* renamed from: d */
    public final LongSparseArray<C4425a> f313190d = new LongSparseArray<>();

    /* renamed from: e */
    public final C13601g f313191e = C36568h.m40985a(new C11284d0(this));

    /* renamed from: f */
    public CommonVideoView f313192f;

    /* renamed from: g */
    public C110220d f313193g;

    /* renamed from: h */
    public int f313194h;

    /* renamed from: i */
    public final RectF f313195i = new RectF();

    /* renamed from: j */
    public long f313196j = -1;

    /* renamed from: n */
    public final C13601g f313197n = C36568h.m40985a(new C109764e0(this));

    /* renamed from: o */
    public final C13601g f313198o = C36568h.m40985a(new C109766g0(this));

    /* renamed from: p */
    public WxCropOperationLayout.C94436h f313199p;

    /* renamed from: q */
    public CropLayout.C97279e f313200q;

    /* renamed from: r */
    public final C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, Object> f313201r;

    /* renamed from: s */
    public final int[] f313202s;

    /* renamed from: t */
    public long f313203t;

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout$a */
    public static final class C4425a {

        /* renamed from: a */
        public final long f19134a;

        /* renamed from: b */
        public final String f19135b;

        /* renamed from: c */
        public Matrix f19136c = new Matrix();

        /* renamed from: d */
        public Matrix f19137d = new Matrix();

        /* renamed from: e */
        public Matrix f19138e = new Matrix();

        /* renamed from: f */
        public Rect f19139f = new Rect();

        /* renamed from: g */
        public Rect f19140g = new Rect();

        /* renamed from: h */
        public Rect f19141h = new Rect();

        /* renamed from: i */
        public final Rect f19142i = new Rect();

        /* renamed from: j */
        public float f19143j = 1.0f;

        /* renamed from: k */
        public float f19144k = 1.0f;

        public C4425a(long j, String str) {
            C87412m.m108594g(str, "mediaPath");
            this.f19134a = j;
            this.f19135b = str;
        }

        /* renamed from: a */
        public final Matrix mo5354a() {
            this.f19137d.set(this.f19136c);
            this.f19137d.postTranslate(0.0f, -((float) this.f19139f.top));
            Log.m105918d("WxMediaCropLayout", "matrix=" + this.f19136c + " cropMatrix=" + this.f19137d + ' ' + this.f19139f);
            return this.f19137d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4425a)) {
                return false;
            }
            C4425a aVar = (C4425a) obj;
            return this.f19134a == aVar.f19134a && C87412m.m108589b(this.f19135b, aVar.f19135b);
        }

        public int hashCode() {
            long j = this.f19134a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f19135b.hashCode();
        }

        public String toString() {
            return "CropInfo(mediaId=" + this.f19134a + ", mediaPath=" + this.f19135b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout$b */
    public interface C4426b {
        /* renamed from: a */
        void mo5358a(int[] iArr, RectF rectF, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout$c */
    public static final class C105367c implements BaseCropLayout.C106802a {

        /* renamed from: a */
        public final /* synthetic */ WxMediaCropLayout f313204a;

        public C105367c(WxMediaCropLayout wxMediaCropLayout) {
            this.f313204a = wxMediaCropLayout;
        }

        public void onDismiss() {
            WxCropOperationLayout.m142543d(this.f313204a.getOperationLayout(), 0, 0, 2, (Object) null);
        }

        public void onShow() {
            this.f313204a.getOperationLayout().mo151289c(255, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxMediaCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        addView(getLayout(), new FrameLayout.LayoutParams(-1, -1));
        addView(getOperationLayout(), new FrameLayout.LayoutParams(-1, -1));
        this.f313199p = WxCropOperationLayout.C94436h.RECT_ADJUST;
        this.f313200q = CropLayout.C97279e.CENTER_CROP;
        this.f313201r = C11282c0.f33217d;
        this.f313202s = new int[2];
    }

    /* renamed from: d */
    public static final C4425a m141518d(WxMediaCropLayout wxMediaCropLayout, View view, int i, int i2, RectF rectF, long j, String str, int i3) {
        wxMediaCropLayout.getClass();
        Log.m105924i("WxMediaCropLayout", "[setCropView] mediaId=" + j + " viewW=" + i + " viewH=" + i2 + " defaultVisibilityRect=" + rectF + " lockCropRect=" + wxMediaCropLayout.f313195i + " path=" + str + " mediaType=" + i3);
        wxMediaCropLayout.f313196j = j;
        if (0 == wxMediaCropLayout.f313203t) {
            wxMediaCropLayout.f313203t = j;
        }
        C4425a e = wxMediaCropLayout.mo150014e(j, str);
        long j2 = wxMediaCropLayout.f313203t;
        if (j2 == j || j2 == 0) {
            wxMediaCropLayout.getOperationLayout().setStyle(wxMediaCropLayout.f313199p);
            if (!e.f19136c.isIdentity()) {
                rectF.set(wxMediaCropLayout.f313195i);
            }
            wxMediaCropLayout.f313195i.round(e.f19139f);
        } else {
            wxMediaCropLayout.getOperationLayout().setStyle(WxCropOperationLayout.C94436h.RECT_HARD);
            rectF.set(wxMediaCropLayout.f313195i);
            wxMediaCropLayout.f313195i.round(e.f19139f);
        }
        wxMediaCropLayout.getLayout().getVisibilityRect().set(rectF);
        wxMediaCropLayout.getOperationLayout().getVisibilityRect().set(rectF);
        wxMediaCropLayout.getOperationLayout().setOnOperationCallback(new C109767h0(wxMediaCropLayout, j, e));
        wxMediaCropLayout.getLayout().mo154438D(view, i, i2, e.f19136c, wxMediaCropLayout.f313200q, new C109768i0(new Matrix(e.f19136c), e, wxMediaCropLayout));
        wxMediaCropLayout.getLayout().setOnChangeListener(new C109769j0(e, wxMediaCropLayout));
        C4425a aVar = wxMediaCropLayout.f313190d.get(j);
        C87412m.m108593f(aVar, "matrixMap[mediaId]");
        return aVar;
    }

    /* renamed from: g */
    public static C4425a m141519g(WxMediaCropLayout wxMediaCropLayout, long j, String str, boolean z, C4426b bVar, C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, Object> qVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            bVar = null;
        }
        C4426b bVar2 = bVar;
        if ((i & 16) != 0) {
            qVar = wxMediaCropLayout.f313201r;
        }
        wxMediaCropLayout.getClass();
        C87412m.m108594g(str, "mediaPath");
        C87412m.m108594g(qVar, "contentCreator");
        if (j != wxMediaCropLayout.f313196j || z) {
            Log.m105924i("WxMediaCropLayout", "onPreviewImage");
            Log.m105924i("WxMediaCropLayout", "onUIPause");
            CommonVideoView commonVideoView = wxMediaCropLayout.f313192f;
            if (commonVideoView != null) {
                commonVideoView.mo79614b();
            }
            C110220d dVar = wxMediaCropLayout.f313193g;
            if (dVar != null) {
                ((C110218c) dVar).mo161623a();
            }
            wxMediaCropLayout.getLayout().mo154436B(true);
            wxMediaCropLayout.getLayout().setEnableScale(true);
            wxMediaCropLayout.getImageView().setImageDrawable(wxMediaCropLayout.getBackground());
            WxCropOperationLayout operationLayout = wxMediaCropLayout.getOperationLayout();
            for (View view : operationLayout.f315418E) {
                if (view != null) {
                    operationLayout.removeView(view);
                }
            }
            qVar.invoke(str, wxMediaCropLayout.getImageView(), new C109765f0(wxMediaCropLayout, bVar2, j, str));
            return wxMediaCropLayout.mo150014e(j, str);
        }
        C4425a aVar = wxMediaCropLayout.f313190d.get(j);
        if (aVar != null) {
            return aVar;
        }
        Log.m105920e("WxMediaCropLayout", "[error] currentPreviewMediaId=" + wxMediaCropLayout.f313196j + " mediaId=" + j + ' ');
        return new C4425a(-1, "");
    }

    /* access modifiers changed from: private */
    public final ImageView getImageView() {
        return (ImageView) this.f313191e.getValue();
    }

    /* access modifiers changed from: private */
    public final CropLayout getLayout() {
        return (CropLayout) this.f313197n.getValue();
    }

    /* access modifiers changed from: private */
    public final WxCropOperationLayout getOperationLayout() {
        return (WxCropOperationLayout) this.f313198o.getValue();
    }

    private final void setStyle(WxCropOperationLayout.C94436h hVar) {
        this.f313199p = hVar;
        getOperationLayout().setStyle(hVar);
    }

    /* renamed from: e */
    public final C4425a mo150014e(long j, String str) {
        if (this.f313190d.get(j) == null) {
            C4425a aVar = new C4425a(j, str);
            this.f313190d.put(j, aVar);
            this.f313195i.round(aVar.f19139f);
            return aVar;
        }
        C4425a aVar2 = this.f313190d.get(j);
        C87412m.m108593f(aVar2, "{\n            val cropIn…       cropInfo\n        }");
        return aVar2;
    }

    /* renamed from: f */
    public final void mo150015f(RectF rectF, WxCropOperationLayout.C94436h hVar) {
        C87412m.m108594g(rectF, "initCropRect");
        C87412m.m108594g(hVar, "style");
        setStyle(hVar);
        this.f313195i.set(rectF);
    }

    public final CropLayout.C97279e getCropLayoutScaleType() {
        return this.f313200q;
    }

    public final C4425a getCurrentCropInfo() {
        C4425a aVar = this.f313190d.get(this.f313196j);
        if (aVar != null) {
            return aVar;
        }
        Log.m105928w("WxMediaCropLayout", "[getCurrentCropInfo] currentPreviewMediaId=" + this.f313196j);
        return new C4425a(this.f313196j, "");
    }

    public final int getCurrentType() {
        return this.f313194h;
    }

    public final long getLockCropMediaId() {
        return this.f313203t;
    }

    public final int[] getMediaWH() {
        return this.f313202s;
    }

    public final C110220d getMusicController() {
        return this.f313193g;
    }

    public final CommonVideoView getVideoView() {
        return this.f313192f;
    }

    /* renamed from: h */
    public final void mo150023h() {
        getLayout().mo154486x();
    }

    /* renamed from: i */
    public final void mo150024i() {
        CropLayout layout = getLayout();
        layout.getClass();
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, new float[]{0.0f, -90.0f})});
        ofPropertyValuesHolder.addUpdateListener(new C110239i(layout, new C59741c0()));
        ofPropertyValuesHolder.setDuration((long) (((float) 110) * (Math.abs(-90.0f) / 90.0f)));
        ofPropertyValuesHolder.start();
    }

    /* renamed from: j */
    public final void mo150025j() {
        removeView(getOperationLayout());
    }

    public final void setCropLayoutScaleType(CropLayout.C97279e eVar) {
        C87412m.m108594g(eVar, "value");
        this.f313200q = eVar;
        getLayout().setScaleType(eVar);
    }

    public final void setCurrentType(int i) {
        this.f313194h = i;
    }

    public final void setEnableScale(boolean z) {
        getLayout().setEnableScale(z);
    }

    public final void setLockCropMediaId(long j) {
        this.f313203t = j;
    }

    public final void setMusicController(C110220d dVar) {
        this.f313193g = dVar;
    }

    public final void setShowBorder(boolean z) {
        getLayout().setHasBorder(z);
        if (z) {
            getLayout().setOnBorderVisibilityCallback(new C105367c(this));
        }
    }

    public final void setVideoView(CommonVideoView commonVideoView) {
        this.f313192f = commonVideoView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxMediaCropLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        addView(getLayout(), new FrameLayout.LayoutParams(-1, -1));
        addView(getOperationLayout(), new FrameLayout.LayoutParams(-1, -1));
        this.f313199p = WxCropOperationLayout.C94436h.RECT_ADJUST;
        this.f313200q = CropLayout.C97279e.CENTER_CROP;
        this.f313201r = C11282c0.f33217d;
        this.f313202s = new int[2];
    }
}
