package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import sp3.C110794b;
import sp3.C36777d;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64197v;
import u23.C111127k;
import u23.C65004e;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/EditFrameListView;", "Landroid/view/View;", "", "z", "I", "getMinWidth", "()I", "setMinWidth", "(I)V", "minWidth", "A", "getShowWidth", "setShowWidth", "showWidth", "B", "getTotalWidth", "setTotalWidth", "totalWidth", "C", "getFrameWidth", "setFrameWidth", "frameWidth", "D", "getTotalFrameWidth", "setTotalFrameWidth", "totalFrameWidth", "getValidWidth", "validWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView */
public final class EditFrameListView extends View {

    /* renamed from: A */
    public int f316826A;

    /* renamed from: B */
    public int f316827B;

    /* renamed from: C */
    public int f316828C;

    /* renamed from: D */
    public int f316829D;

    /* renamed from: d */
    public final Paint f316830d;

    /* renamed from: e */
    public C111127k f316831e;

    /* renamed from: f */
    public LinkedList<Bitmap> f316832f;

    /* renamed from: g */
    public Bitmap f316833g;

    /* renamed from: h */
    public float f316834h;

    /* renamed from: i */
    public final Rect f316835i;

    /* renamed from: j */
    public final RectF f316836j;

    /* renamed from: n */
    public boolean f316837n;

    /* renamed from: o */
    public boolean f316838o;

    /* renamed from: p */
    public boolean f316839p;

    /* renamed from: q */
    public boolean f316840q;

    /* renamed from: r */
    public final Path f316841r;

    /* renamed from: s */
    public final RectF f316842s;

    /* renamed from: t */
    public final float f316843t;

    /* renamed from: u */
    public final float f316844u;

    /* renamed from: v */
    public C36777d f316845v;

    /* renamed from: w */
    public final long f316846w;

    /* renamed from: x */
    public int f316847x;

    /* renamed from: y */
    public int f316848y;

    /* renamed from: z */
    public int f316849z;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView$setTrackInfo$2", mo125469f = "EditFrameListView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView$a */
    public static final class C106263a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f316850d;

        /* renamed from: e */
        public final /* synthetic */ EditFrameListView f316851e;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView$a$a */
        public static final class C106264a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ EditFrameListView f316852d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106264a(EditFrameListView editFrameListView) {
                super(2);
                this.f316852d = editFrameListView;
            }

            public Object invoke(Object obj, Object obj2) {
                ((Number) obj).longValue();
                this.f316852d.f316833g = (Bitmap) obj2;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView$a$b */
        public static final class C106265b extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ EditFrameListView f316853d;

            /* renamed from: e */
            public final /* synthetic */ C111127k f316854e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106265b(EditFrameListView editFrameListView, C111127k kVar) {
                super(2);
                this.f316853d = editFrameListView;
                this.f316854e = kVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                Bitmap bitmap = (Bitmap) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append("setTrackInfo: ");
                sb.append(longValue);
                sb.append(", ");
                C36777d dVar = this.f316853d.f316845v;
                int i = 0;
                sb.append(dVar != null ? dVar.hashCode() : 0);
                Log.m105924i("MicroMsg.EditFrameListView", sb.toString());
                C111127k kVar = this.f316854e;
                EditFrameListView editFrameListView = this.f316853d;
                for (T next : kVar.f187127g) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (((C65004e) next).f187134a == longValue && i >= 0 && i < editFrameListView.f316832f.size()) {
                            editFrameListView.f316832f.set(i, bitmap);
                            editFrameListView.postInvalidate();
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106263a(EditFrameListView editFrameListView, C15601d<? super C106263a> dVar) {
            super(2, dVar);
            this.f316851e = editFrameListView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C106263a aVar = new C106263a(this.f316851e, dVar);
            aVar.f316850d = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106263a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f316850d;
            Log.m105924i("MicroMsg.EditFrameListView", n0Var.hashCode() + " setTrackInfo launch");
            EditFrameListView editFrameListView = this.f316851e;
            C111127k kVar = editFrameListView.f316831e;
            if (kVar != null) {
                Log.m105924i("MicroMsg.EditFrameListView", n0Var.hashCode() + " setTrackInfo init thumb fetcher");
                C36777d dVar = editFrameListView.f316845v;
                if (dVar != null) {
                    dVar.destroy();
                }
                C110794b a = C110794b.f331445i.mo162358a(kVar.f332732n.f316501l);
                editFrameListView.f316845v = a;
                a.mo58663C(kVar.f187121a, kVar.f187122b);
                Log.m105924i("MicroMsg.EditFrameListView", n0Var.hashCode() + " setTrackInfo finish init thumb fetcher, frames.size:" + kVar.f187127g.size());
                C36777d dVar2 = editFrameListView.f316845v;
                if (dVar2 != null) {
                    dVar2.mo58665b(C26236u.m33719b(new Long(0)), new C106264a(editFrameListView));
                }
                C36777d dVar3 = editFrameListView.f316845v;
                if (dVar3 != null) {
                    LinkedList<C65004e> linkedList = kVar.f187127g;
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (C65004e eVar : linkedList) {
                        arrayList.add(new Long(eVar.f187134a));
                    }
                    dVar3.mo58665b(arrayList, new C106265b(editFrameListView, kVar));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFrameListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f316830d = paint;
        this.f316832f = new LinkedList<>();
        this.f316834h = 1.0f;
        this.f316835i = new Rect();
        this.f316836j = new RectF();
        this.f316841r = new Path();
        this.f316842s = new RectF();
        this.f316843t = (float) C76577a.m92151b(context, 4);
        this.f316844u = (float) C76577a.m92151b(context, 4);
        this.f316846w = 3000;
        paint.setColor(-65536);
        paint.setAntiAlias(true);
    }

    /* renamed from: a */
    public final void mo152307a(C111127k kVar, int i, boolean z, boolean z2) {
        float f;
        long d;
        LinkedList<C65004e> linkedList;
        C87412m.m108594g(kVar, "info");
        this.f316831e = kVar;
        this.f316832f.clear();
        C111127k kVar2 = this.f316831e;
        if (!(kVar2 == null || (linkedList = kVar2.f187127g) == null)) {
            for (C65004e eVar : linkedList) {
                this.f316832f.add((Object) null);
            }
        }
        Rect rect = this.f316835i;
        int i2 = kVar.f187121a;
        rect.right = i2;
        int i3 = kVar.f187122b;
        rect.bottom = i3;
        float f2 = (float) i;
        float f3 = (1.0f * f2) / ((float) i3);
        this.f316834h = f3;
        RectF rectF = this.f316836j;
        rectF.bottom = f2;
        float f4 = f3 * ((float) i2);
        rectF.right = f4;
        this.f316829D = (int) (f4 * kVar.f187126f);
        float d2 = ((float) this.f316846w) / ((float) kVar.mo88221d());
        int i4 = this.f316829D;
        this.f316849z = (int) (d2 * ((float) i4));
        if (kVar.f187133m) {
            f = ((float) i4) * ((float) kVar.f187125e);
            d = kVar.mo88221d();
        } else if (kVar.f187132l) {
            f = ((float) i4) * ((float) (kVar.mo88221d() - kVar.f187124d));
            d = kVar.mo88221d();
        } else {
            f = ((float) i4) * ((float) (kVar.f187125e - kVar.f187124d));
            d = kVar.mo88221d();
        }
        this.f316828C = (int) (f / ((float) d));
        this.f316847x = z ? C76577a.m92151b(getContext(), 8) : C76577a.m92151b(getContext(), 4);
        int b = z2 ? C76577a.m92151b(getContext(), 8) : C76577a.m92151b(getContext(), 4);
        this.f316848y = b;
        int i5 = this.f316828C;
        int i6 = this.f316847x;
        this.f316826A = i5 + i6 + b;
        this.f316827B = this.f316829D + i6 + b;
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C106263a(this, (C15601d<? super C106263a>) null), 2, (Object) null);
    }

    public final int getFrameWidth() {
        return this.f316828C;
    }

    public final int getMinWidth() {
        return this.f316849z;
    }

    public final int getShowWidth() {
        return this.f316826A;
    }

    public final int getTotalFrameWidth() {
        return this.f316829D;
    }

    public final int getTotalWidth() {
        return this.f316827B;
    }

    public final int getValidWidth() {
        C111127k kVar = this.f316831e;
        C87412m.m108591d(kVar);
        float f = ((float) this.f316829D) * ((float) (kVar.f187125e - kVar.f187124d));
        C111127k kVar2 = this.f316831e;
        C87412m.m108591d(kVar2);
        return ((int) (f / ((float) kVar2.mo88221d()))) + this.f316847x + this.f316848y;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        Log.m105924i("MicroMsg.EditFrameListView", "onDraw: " + this + ", width:" + getWidth() + ", showWidth:" + this.f316826A + ", track:" + this.f316831e);
        canvas.translate((float) this.f316847x, 0.0f);
        canvas.save();
        canvas.clipPath(this.f316841r);
        C111127k kVar = this.f316831e;
        if (kVar != null && !kVar.f187133m) {
            canvas.translate(((-((float) kVar.f187124d)) / ((float) kVar.mo88221d())) * ((float) this.f316829D), 0.0f);
        }
        for (Bitmap bitmap : this.f316832f) {
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.f316835i, this.f316836j, this.f316830d);
            } else {
                Bitmap bitmap2 = this.f316833g;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f316835i, this.f316836j, this.f316830d);
                }
            }
            canvas.translate(this.f316836j.right, 0.0f);
        }
        canvas.restore();
        Drawable background = getBackground();
        if (background != null) {
            RectF rectF = this.f316842s;
            background.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            background.draw(canvas);
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        float f = 0.0f;
        if (this.f316837n) {
            this.f316842s.left = 0.0f;
        } else {
            this.f316842s.left = this.f316844u;
        }
        if (this.f316838o) {
            this.f316842s.right = (float) this.f316828C;
        } else {
            this.f316842s.right = ((float) this.f316828C) - this.f316844u;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onMeasure: ");
        sb.append(this.f316837n);
        sb.append(' ');
        sb.append(this.f316838o);
        sb.append(", ");
        sb.append(getWidth());
        sb.append(' ');
        sb.append(defaultSize);
        sb.append(", thumbScale:");
        sb.append(this.f316834h);
        sb.append(", trackInfo.width:");
        C111127k kVar = this.f316831e;
        sb.append(kVar != null ? Integer.valueOf(kVar.f187121a) : null);
        sb.append(", thumbDrawRect.right:");
        sb.append(this.f316836j.right);
        Log.m105924i("MicroMsg.EditFrameListView", sb.toString());
        this.f316842s.bottom = (float) defaultSize;
        this.f316841r.reset();
        float f2 = this.f316839p ? 0.0f : this.f316843t;
        if (!this.f316840q) {
            f = this.f316843t;
        }
        this.f316841r.addRoundRect(this.f316842s, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
        super.onMeasure(i, i2);
    }

    public final void setFrameWidth(int i) {
        this.f316828C = i;
    }

    public final void setMinWidth(int i) {
        this.f316849z = i;
    }

    public final void setShowWidth(int i) {
        this.f316826A = i;
    }

    public final void setTotalFrameWidth(int i) {
        this.f316829D = i;
    }

    public final void setTotalWidth(int i) {
        this.f316827B = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditFrameListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
