package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

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
import com.tencent.p014mm.plugin.vlog.model.C106193d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import u23.C101958b;
import u23.C65003a;
import u23.C65004e;
import u23.C65005i;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/FrameListView;", "Landroid/view/View;", "Lu23/i;", "thumbFetcherFactory", "Lrx3/b0;", "setThumbFetcherFactory", "", "data", "setThumbFetcherExtraData", "Lu23/a;", "info", "setTrackInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.FrameListView */
public final class FrameListView extends View {

    /* renamed from: d */
    public final String f316855d;

    /* renamed from: e */
    public final Paint f316856e;

    /* renamed from: f */
    public C65003a f316857f;

    /* renamed from: g */
    public LinkedList<Bitmap> f316858g;

    /* renamed from: h */
    public Bitmap f316859h;

    /* renamed from: i */
    public float f316860i;

    /* renamed from: j */
    public final Rect f316861j;

    /* renamed from: n */
    public final RectF f316862n;

    /* renamed from: o */
    public final Matrix f316863o;

    /* renamed from: p */
    public boolean f316864p;

    /* renamed from: q */
    public boolean f316865q;

    /* renamed from: r */
    public boolean f316866r;

    /* renamed from: s */
    public boolean f316867s;

    /* renamed from: t */
    public final Path f316868t;

    /* renamed from: u */
    public final RectF f316869u;

    /* renamed from: v */
    public final float f316870v;

    /* renamed from: w */
    public final float f316871w;

    /* renamed from: x */
    public C36777d f316872x;

    /* renamed from: y */
    public C65005i f316873y;

    /* renamed from: z */
    public Object f316874z;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.thumb.FrameListView$setTrackInfo$2", mo125469f = "FrameListView.kt", mo125470l = {109}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.FrameListView$a */
    public static final class C106266a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f316875d;

        /* renamed from: e */
        public /* synthetic */ Object f316876e;

        /* renamed from: f */
        public final /* synthetic */ FrameListView f316877f;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.FrameListView$a$a */
        public static final class C106267a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FrameListView f316878d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106267a(FrameListView frameListView) {
                super(2);
                this.f316878d = frameListView;
            }

            public Object invoke(Object obj, Object obj2) {
                ((Number) obj).longValue();
                this.f316878d.f316859h = (Bitmap) obj2;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.FrameListView$a$b */
        public static final class C106268b extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FrameListView f316879d;

            /* renamed from: e */
            public final /* synthetic */ C65003a f316880e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106268b(FrameListView frameListView, C65003a aVar) {
                super(2);
                this.f316879d = frameListView;
                this.f316880e = aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                Bitmap bitmap = (Bitmap) obj2;
                String str = this.f316879d.f316855d;
                StringBuilder sb = new StringBuilder();
                sb.append("setTrackInfo: ");
                sb.append(longValue);
                sb.append(", ");
                C36777d dVar = this.f316879d.f316872x;
                int i = 0;
                sb.append(dVar != null ? dVar.hashCode() : 0);
                Log.m105924i(str, sb.toString());
                C65003a aVar = this.f316880e;
                FrameListView frameListView = this.f316879d;
                for (T next : aVar.f187127g) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (((C65004e) next).f187134a == longValue && i >= 0 && i < frameListView.f316858g.size()) {
                            frameListView.f316858g.set(i, bitmap);
                            frameListView.postInvalidate();
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

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.thumb.FrameListView$setTrackInfo$2$1$4", mo125469f = "FrameListView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.FrameListView$a$c */
        public static final class C106269c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FrameListView f316881d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106269c(FrameListView frameListView, C15601d<? super C106269c> dVar) {
                super(2, dVar);
                this.f316881d = frameListView;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106269c(this.f316881d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106269c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f316881d.requestLayout();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106266a(FrameListView frameListView, C15601d<? super C106266a> dVar) {
            super(2, dVar);
            this.f316877f = frameListView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C106266a aVar = new C106266a(this.f316877f, dVar);
            aVar.f316876e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106266a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f316875d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f316876e;
                String str = this.f316877f.f316855d;
                Log.m105924i(str, n0Var.hashCode() + " setTrackInfo launch");
                FrameListView frameListView = this.f316877f;
                C65003a aVar2 = frameListView.f316857f;
                if (aVar2 != null) {
                    String str2 = frameListView.f316855d;
                    Log.m105924i(str2, n0Var.hashCode() + " setTrackInfo init thumb fetcher");
                    C36777d dVar = frameListView.f316872x;
                    if (dVar != null) {
                        dVar.destroy();
                    }
                    C36777d a = frameListView.f316873y.mo86877a(aVar2, frameListView.f316874z);
                    frameListView.f316872x = a;
                    if (a != null) {
                        a.mo58663C(aVar2.f187121a, aVar2.f187122b);
                    }
                    String str3 = frameListView.f316855d;
                    Log.m105924i(str3, n0Var.hashCode() + " setTrackInfo finish init thumb fetcher, frames.size:" + aVar2.f187127g.size());
                    C36777d dVar2 = frameListView.f316872x;
                    if (dVar2 != null) {
                        dVar2.mo58665b(C26236u.m33719b(new Long(0)), new C106267a(frameListView));
                    }
                    C36777d dVar3 = frameListView.f316872x;
                    if (dVar3 != null) {
                        LinkedList<C65004e> linkedList = aVar2.f187127g;
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                        for (C65004e eVar : linkedList) {
                            arrayList.add(new Long(eVar.f187134a));
                        }
                        dVar3.mo58665b(arrayList, new C106268b(frameListView, aVar2));
                    }
                    String str4 = frameListView.f316855d;
                    Log.m105924i(str4, n0Var.hashCode() + " setTrackInfo request layout");
                    if (!frameListView.isInLayout() || aVar2.f187128h) {
                        C53896h0 h0Var = C53872d1.f151117a;
                        C53915k2 k2Var = C58901s.f168555a;
                        C106269c cVar = new C106269c(frameListView, (C15601d<? super C106269c>) null);
                        this.f316875d = 1;
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
    public FrameListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316855d = "MicroMsg.FrameListView";
        Paint paint = new Paint();
        this.f316856e = paint;
        this.f316858g = new LinkedList<>();
        this.f316860i = 1.0f;
        this.f316861j = new Rect();
        this.f316862n = new RectF();
        this.f316863o = new Matrix();
        this.f316868t = new Path();
        this.f316869u = new RectF();
        this.f316870v = (float) C76577a.m92151b(context, 4);
        this.f316871w = (float) C76577a.m92151b(context, 4);
        this.f316873y = new C101958b();
        paint.setColor(-65536);
        paint.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        String str = this.f316855d;
        Log.m105924i(str, "onDraw, trackInfo:" + this.f316857f + ", thumbList.size:" + this.f316858g.size());
        canvas.save();
        canvas.clipPath(this.f316868t);
        C65003a aVar = this.f316857f;
        boolean z = true;
        if (aVar == null || !aVar.f187128h) {
            z = false;
        }
        if (z) {
            Bitmap bitmap = (Bitmap) C110818d0.m150917O(this.f316858g, 0);
            if (bitmap != null) {
                canvas.concat(this.f316863o);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f316856e);
            }
        } else {
            for (Bitmap bitmap2 : this.f316858g) {
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f316861j, this.f316862n, this.f316856e);
                } else {
                    Bitmap bitmap3 = this.f316859h;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, this.f316861j, this.f316862n, this.f316856e);
                    }
                }
                canvas.translate(this.f316862n.right, 0.0f);
            }
        }
        canvas.restore();
        Drawable background = getBackground();
        if (background != null) {
            RectF rectF = this.f316869u;
            background.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            background.draw(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        float f = (float) defaultSize;
        this.f316862n.bottom = f;
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        C65003a aVar = this.f316857f;
        if (aVar != null) {
            Rect rect = this.f316861j;
            int i3 = aVar.f187121a;
            rect.right = i3;
            int i4 = aVar.f187122b;
            rect.bottom = i4;
            float f2 = (1.0f * f) / ((float) i4);
            this.f316860i = f2;
            float f3 = f2 * ((float) i3);
            this.f316862n.right = f3;
            defaultSize2 = (int) (f3 * aVar.f187126f);
        }
        float f4 = 0.0f;
        if (aVar != null && aVar.f187128h) {
            Matrix matrix = this.f316863o;
            Rect rect2 = this.f316861j;
            C87412m.m108594g(matrix, "<this>");
            C106193d0.m142870b(matrix, new RectF(0.0f, 0.0f, (float) rect2.right, (float) rect2.bottom), new RectF(0.0f, 0.0f, f, f));
            defaultSize2 = defaultSize;
        }
        if (this.f316864p) {
            this.f316869u.left = 0.0f;
        } else {
            this.f316869u.left = this.f316871w;
        }
        if (this.f316865q) {
            this.f316869u.right = (float) defaultSize2;
        } else {
            this.f316869u.right = ((float) defaultSize2) - this.f316871w;
        }
        String str = this.f316855d;
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure: ");
        sb.append(this.f316864p);
        sb.append(' ');
        sb.append(this.f316865q);
        sb.append(", ");
        sb.append(defaultSize2);
        sb.append(' ');
        sb.append(defaultSize);
        sb.append(", thumbScale:");
        sb.append(this.f316860i);
        sb.append(", trackInfo.width:");
        C65003a aVar2 = this.f316857f;
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.f187121a) : null);
        sb.append(", thumbDrawRect.right:");
        sb.append(this.f316862n.right);
        Log.m105924i(str, sb.toString());
        this.f316869u.bottom = f;
        this.f316868t.reset();
        float f5 = this.f316866r ? 0.0f : this.f316870v;
        if (!this.f316867s) {
            f4 = this.f316870v;
        }
        this.f316868t.addRoundRect(this.f316869u, new float[]{f5, f5, f4, f4, f4, f4, f5, f5}, Path.Direction.CW);
        setMeasuredDimension(defaultSize2, defaultSize);
    }

    public final void setThumbFetcherExtraData(Object obj) {
        this.f316874z = obj;
    }

    public final void setThumbFetcherFactory(C65005i iVar) {
        C87412m.m108594g(iVar, "thumbFetcherFactory");
        this.f316873y = iVar;
        Log.m105924i(this.f316855d, "clearThumb");
        this.f316858g.clear();
        this.f316859h = null;
        postInvalidate();
    }

    public final void setTrackInfo(C65003a aVar) {
        LinkedList<C65004e> linkedList;
        C87412m.m108594g(aVar, "info");
        this.f316857f = aVar;
        this.f316858g.clear();
        C65003a aVar2 = this.f316857f;
        if (!(aVar2 == null || (linkedList = aVar2.f187127g) == null)) {
            for (C65004e eVar : linkedList) {
                this.f316858g.add((Object) null);
            }
        }
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C106266a(this, (C15601d<? super C106266a>) null), 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FrameListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
