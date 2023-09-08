package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import p707tz.C65000f;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import u23.C65003a;
import u23.C65004e;
import u23.C65005i;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/FrameListView2;", "Landroid/view/View;", "Lu23/i;", "thumbFetcherFactory", "Lrx3/b0;", "setThumbFetcherFactory", "", "data", "setThumbFetcherExtraData", "Lu23/a;", "info", "setTrackInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.FrameListView2 */
public final class FrameListView2 extends View {

    /* renamed from: d */
    public final String f163432d;

    /* renamed from: e */
    public final Paint f163433e;

    /* renamed from: f */
    public C65003a f163434f;

    /* renamed from: g */
    public LinkedList<Bitmap> f163435g;

    /* renamed from: h */
    public Bitmap f163436h;

    /* renamed from: i */
    public float f163437i;

    /* renamed from: j */
    public final Rect f163438j;

    /* renamed from: n */
    public final RectF f163439n;

    /* renamed from: o */
    public final Matrix f163440o;

    /* renamed from: p */
    public final Path f163441p;

    /* renamed from: q */
    public final RectF f163442q;

    /* renamed from: r */
    public final float f163443r;

    /* renamed from: s */
    public final float f163444s;

    /* renamed from: t */
    public C36777d f163445t;

    /* renamed from: u */
    public C65005i f163446u;

    /* renamed from: v */
    public Object f163447v;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.view.FrameListView2$setTrackInfo$2", mo125469f = "FrameListView2.kt", mo125470l = {113}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mv.ui.view.FrameListView2$a */
    public static final class C57076a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f163448d;

        /* renamed from: e */
        public /* synthetic */ Object f163449e;

        /* renamed from: f */
        public final /* synthetic */ FrameListView2 f163450f;

        /* renamed from: com.tencent.mm.plugin.mv.ui.view.FrameListView2$a$a */
        public static final class C57077a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FrameListView2 f163451d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57077a(FrameListView2 frameListView2) {
                super(2);
                this.f163451d = frameListView2;
            }

            public Object invoke(Object obj, Object obj2) {
                ((Number) obj).longValue();
                this.f163451d.f163436h = (Bitmap) obj2;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.mv.ui.view.FrameListView2$a$b */
        public static final class C57078b extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FrameListView2 f163452d;

            /* renamed from: e */
            public final /* synthetic */ C65003a f163453e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57078b(FrameListView2 frameListView2, C65003a aVar) {
                super(2);
                this.f163452d = frameListView2;
                this.f163453e = aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                Bitmap bitmap = (Bitmap) obj2;
                String str = this.f163452d.f163432d;
                StringBuilder sb = new StringBuilder();
                sb.append("setTrackInfo: ");
                sb.append(longValue);
                sb.append(", ");
                C36777d dVar = this.f163452d.f163445t;
                int i = 0;
                sb.append(dVar != null ? dVar.hashCode() : 0);
                Log.m105924i(str, sb.toString());
                C65003a aVar = this.f163453e;
                FrameListView2 frameListView2 = this.f163452d;
                for (T next : aVar.f187127g) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (((C65004e) next).f187134a == longValue && i >= 0 && i < frameListView2.f163435g.size()) {
                            frameListView2.f163435g.set(i, bitmap);
                            frameListView2.postInvalidate();
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.view.FrameListView2$setTrackInfo$2$1$4", mo125469f = "FrameListView2.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.mv.ui.view.FrameListView2$a$c */
        public static final class C57079c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FrameListView2 f163454d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57079c(FrameListView2 frameListView2, C15601d<? super C57079c> dVar) {
                super(2, dVar);
                this.f163454d = frameListView2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C57079c(this.f163454d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C57079c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f163454d.requestLayout();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57076a(FrameListView2 frameListView2, C15601d<? super C57076a> dVar) {
            super(2, dVar);
            this.f163450f = frameListView2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C57076a aVar = new C57076a(this.f163450f, dVar);
            aVar.f163449e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57076a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f163448d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f163449e;
                String str = this.f163450f.f163432d;
                Log.m105924i(str, n0Var.hashCode() + " setTrackInfo launch");
                FrameListView2 frameListView2 = this.f163450f;
                C65003a aVar2 = frameListView2.f163434f;
                if (aVar2 != null) {
                    String str2 = frameListView2.f163432d;
                    Log.m105924i(str2, n0Var.hashCode() + " setTrackInfo init thumb fetcher");
                    C36777d dVar = frameListView2.f163445t;
                    if (dVar != null) {
                        dVar.destroy();
                    }
                    C36777d a = frameListView2.f163446u.mo86877a(aVar2, frameListView2.f163447v);
                    frameListView2.f163445t = a;
                    if (a != null) {
                        a.mo58663C(aVar2.f187121a, aVar2.f187122b);
                    }
                    String str3 = frameListView2.f163432d;
                    Log.m105924i(str3, n0Var.hashCode() + " setTrackInfo finish init thumb fetcher, frames.size:" + aVar2.f187127g.size());
                    C36777d dVar2 = frameListView2.f163445t;
                    if (dVar2 != null) {
                        dVar2.mo58665b(C26236u.m33719b(new Long(0)), new C57077a(frameListView2));
                    }
                    C36777d dVar3 = frameListView2.f163445t;
                    if (dVar3 != null) {
                        LinkedList<C65004e> linkedList = aVar2.f187127g;
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                        for (C65004e eVar : linkedList) {
                            arrayList.add(new Long(eVar.f187134a));
                        }
                        dVar3.mo58665b(arrayList, new C57078b(frameListView2, aVar2));
                    }
                    String str4 = frameListView2.f163432d;
                    Log.m105924i(str4, n0Var.hashCode() + " setTrackInfo request layout");
                    if (!frameListView2.isInLayout() || aVar2.f187128h) {
                        C53896h0 h0Var = C53872d1.f151117a;
                        C53915k2 k2Var = C58901s.f168555a;
                        C57079c cVar = new C57079c(frameListView2, (C15601d<? super C57079c>) null);
                        this.f163448d = 1;
                        if (C53895h.m60469g(k2Var, cVar, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameListView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f163432d = "MicroMsg.FrameListView";
        Paint paint = new Paint();
        this.f163433e = paint;
        this.f163435g = new LinkedList<>();
        this.f163437i = 1.0f;
        this.f163438j = new Rect();
        this.f163439n = new RectF();
        this.f163440o = new Matrix();
        this.f163441p = new Path();
        this.f163442q = new RectF();
        this.f163443r = (float) C76577a.m92151b(context, 4);
        this.f163444s = (float) C76577a.m92151b(context, 4);
        this.f163446u = ((C65000f) C86312j.m106911c(C65000f.class)).mo89201rK();
        paint.setColor(-65536);
        paint.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        String str = this.f163432d;
        Log.m105924i(str, "onDraw, trackInfo:" + this.f163434f + ", thumbList.size:" + this.f163435g.size());
        canvas.save();
        canvas.clipPath(this.f163441p);
        C65003a aVar = this.f163434f;
        boolean z = true;
        if (aVar == null || !aVar.f187128h) {
            z = false;
        }
        if (z) {
            Bitmap bitmap = (Bitmap) C110818d0.m150917O(this.f163435g, 0);
            if (bitmap != null) {
                canvas.concat(this.f163440o);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f163433e);
            }
        } else {
            for (Bitmap bitmap2 : this.f163435g) {
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f163438j, this.f163439n, this.f163433e);
                } else {
                    Bitmap bitmap3 = this.f163436h;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, this.f163438j, this.f163439n, this.f163433e);
                    }
                }
                canvas.translate(this.f163439n.right, 0.0f);
            }
        }
        canvas.restore();
        Drawable background = getBackground();
        if (background != null) {
            RectF rectF = this.f163442q;
            background.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            background.draw(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        float f = (float) defaultSize;
        this.f163439n.bottom = f;
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        C65003a aVar = this.f163434f;
        if (aVar != null) {
            Rect rect = this.f163438j;
            int i3 = aVar.f187121a;
            rect.right = i3;
            int i4 = aVar.f187122b;
            rect.bottom = i4;
            float f2 = (1.0f * f) / ((float) i4);
            this.f163437i = f2;
            float f3 = f2 * ((float) i3);
            this.f163439n.right = f3;
            defaultSize2 = (int) (f3 * aVar.f187126f);
        }
        if (aVar != null && aVar.f187128h) {
            Matrix matrix = this.f163440o;
            Rect rect2 = this.f163438j;
            C87412m.m108594g(matrix, "<this>");
            RectF rectF = new RectF(0.0f, 0.0f, (float) rect2.right, (float) rect2.bottom);
            RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
            matrix.reset();
            float max = Math.max(rectF2.height() / rectF.height(), rectF2.width() / rectF.width());
            matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
            matrix.postScale(max, max);
            matrix.postTranslate(rectF2.centerX(), rectF2.centerY());
            defaultSize2 = defaultSize;
        }
        RectF rectF3 = this.f163442q;
        float f4 = this.f163444s;
        rectF3.left = f4;
        rectF3.right = ((float) defaultSize2) - f4;
        String str = this.f163432d;
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure: ");
        sb.append(false);
        sb.append(' ');
        sb.append(false);
        sb.append(", ");
        sb.append(defaultSize2);
        sb.append(' ');
        sb.append(defaultSize);
        sb.append(", thumbScale:");
        sb.append(this.f163437i);
        sb.append(", trackInfo.width:");
        C65003a aVar2 = this.f163434f;
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.f187121a) : null);
        sb.append(", thumbDrawRect.right:");
        sb.append(this.f163439n.right);
        Log.m105924i(str, sb.toString());
        this.f163442q.bottom = f;
        this.f163441p.reset();
        float f5 = this.f163443r;
        this.f163441p.addRoundRect(this.f163442q, new float[]{f5, f5, f5, f5, f5, f5, f5, f5}, Path.Direction.CW);
        setMeasuredDimension(defaultSize2, defaultSize);
    }

    public final void setThumbFetcherExtraData(Object obj) {
        this.f163447v = obj;
    }

    public final void setThumbFetcherFactory(C65005i iVar) {
        C87412m.m108594g(iVar, "thumbFetcherFactory");
        this.f163446u = iVar;
        Log.m105924i(this.f163432d, "clearThumb");
        this.f163435g.clear();
        this.f163436h = null;
        postInvalidate();
    }

    public final void setTrackInfo(C65003a aVar) {
        LinkedList<C65004e> linkedList;
        C87412m.m108594g(aVar, "info");
        this.f163434f = aVar;
        this.f163435g.clear();
        C65003a aVar2 = this.f163434f;
        if (!(aVar2 == null || (linkedList = aVar2.f187127g) == null)) {
            for (C65004e eVar : linkedList) {
                this.f163435g.add((Object) null);
            }
        }
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C57076a(this, (C15601d<? super C57076a>) null), 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FrameListView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
