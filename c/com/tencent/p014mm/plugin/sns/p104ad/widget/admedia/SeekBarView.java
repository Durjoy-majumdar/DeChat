package com.tencent.p014mm.plugin.sns.p104ad.widget.admedia;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000234B\u001d\b\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B%\b\u0016\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b.\u00102R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u001d\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/sns/ad/widget/appcompat/AdAppCompatTextView;", "d", "Lcom/tencent/mm/plugin/sns/ad/widget/appcompat/AdAppCompatTextView;", "getCurrentTimeText", "()Lcom/tencent/mm/plugin/sns/ad/widget/appcompat/AdAppCompatTextView;", "currentTimeText", "e", "getEndTimeText", "endTimeText", "Lcom/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$a;", "f", "Lcom/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$a;", "getPointView", "()Lcom/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$a;", "pointView", "Landroid/view/View;", "g", "Landroid/view/View;", "getPlayedProgressLine", "()Landroid/view/View;", "playedProgressLine", "h", "getUnplayedProgressLine", "unplayedProgressLine", "", "s", "Z", "isRefreshing", "()Z", "setRefreshing", "(Z)V", "", "value", "t", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView */
public final class SeekBarView extends RelativeLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f274193w = 0;

    /* renamed from: d */
    public final AdAppCompatTextView f274194d = new AdAppCompatTextView(getContext());

    /* renamed from: e */
    public final AdAppCompatTextView f274195e = new AdAppCompatTextView(getContext());

    /* renamed from: f */
    public final C71191a f274196f = new C71191a(getContext());

    /* renamed from: g */
    public final View f274197g = new View(getContext());

    /* renamed from: h */
    public final View f274198h = new View(getContext());

    /* renamed from: i */
    public C0000n0 f274199i;

    /* renamed from: j */
    public C32224a<Float> f274200j;

    /* renamed from: n */
    public float f274201n = 0.1f;

    /* renamed from: o */
    public C32226l<? super Float, String> f274202o;

    /* renamed from: p */
    public C32226l<? super Integer, Float> f274203p;

    /* renamed from: q */
    public int f274204q = 88;

    /* renamed from: r */
    public int f274205r;

    /* renamed from: s */
    public boolean f274206s;

    /* renamed from: t */
    public float f274207t;

    /* renamed from: u */
    public float f274208u;

    /* renamed from: v */
    public float f274209v;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$a */
    public static final class C71191a extends View {

        /* renamed from: d */
        public final Paint f206042d;

        public C71191a(Context context) {
            super(context);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAntiAlias(true);
            this.f206042d = paint;
        }

        public final Paint getP() {
            SnsMethodCalculate.markStartTimeMs("getP", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
            Paint paint = this.f206042d;
            SnsMethodCalculate.markEndTimeMs("getP", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
            return paint;
        }

        public void onDraw(Canvas canvas) {
            SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
            super.onDraw(canvas);
            if (canvas != null) {
                canvas.drawArc(0.0f, 0.0f, (float) getHeight(), (float) getHeight(), 0.0f, 360.0f, false, this.f206042d);
            }
            SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        }

        public final void setColor(int i) {
            SnsMethodCalculate.markStartTimeMs("setColor", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
            this.f206042d.setColor(i);
            SnsMethodCalculate.markEndTimeMs("setColor", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$b */
    public static final class C71192b extends ViewOutlineProvider {

        /* renamed from: a */
        public int f206043a;

        public C71192b(int i) {
            this.f206043a = i;
        }

        public void getOutline(View view, Outline outline) {
            SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$RoundCornerOutlineProvider");
            Rect rect = new Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
            if (outline != null) {
                outline.setRoundRect(rect, (float) this.f206043a);
            }
            SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$RoundCornerOutlineProvider");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c */
    public static final class C94728c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ SeekBarView f274210d;

        /* renamed from: e */
        public final /* synthetic */ int f274211e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94728c(SeekBarView seekBarView, int i) {
            super(0);
            this.f274210d = seekBarView;
            this.f274211e = i;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
            SeekBarView seekBarView = this.f274210d;
            int i = SeekBarView.f274193w;
            SnsMethodCalculate.markStartTimeMs("access$get_convertToXmlPx$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            C32226l<? super Integer, Float> lVar = seekBarView.f274203p;
            SnsMethodCalculate.markEndTimeMs("access$get_convertToXmlPx$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            Integer valueOf = Integer.valueOf((int) (lVar != null ? lVar.invoke(Integer.valueOf(this.f274211e)).floatValue() : 0.0f));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$convertToXmlPxInt$1");
            return valueOf;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1", mo125469f = "SeekBarView.kt", mo125470l = {202}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$d */
    public static final class C94729d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f274212d;

        /* renamed from: e */
        public final /* synthetic */ SeekBarView f274213e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94729d(SeekBarView seekBarView, C15601d<? super C94729d> dVar) {
            super(2, dVar);
            this.f274213e = seekBarView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            C94729d dVar2 = new C94729d(this.f274213e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            Object invokeSuspend = ((C94729d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f274212d;
            if (i == 0 || i == 1) {
                ResultKt.throwOnFailure(obj);
                do {
                    SeekBarView seekBarView = this.f274213e;
                    seekBarView.getClass();
                    SnsMethodCalculate.markStartTimeMs("isRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                    boolean z = seekBarView.f274206s;
                    SnsMethodCalculate.markEndTimeMs("isRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                    if (z) {
                        SeekBarView seekBarView2 = this.f274213e;
                        SnsMethodCalculate.markStartTimeMs("access$getProgressProvider$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                        C32224a<Float> aVar2 = seekBarView2.f274200j;
                        SnsMethodCalculate.markEndTimeMs("access$getProgressProvider$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                        if (aVar2 != null) {
                            this.f274213e.setProgress(aVar2.invoke().floatValue());
                        }
                    }
                    this.f274212d = 1;
                } while (C53965x0.m60607b(1000, this) != aVar);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
                return aVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            throw illegalStateException;
        }
    }

    public SeekBarView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C32224a<Integer> mo130419a(int i) {
        SnsMethodCalculate.markStartTimeMs("getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        C94728c cVar = new C94728c(this, i);
        SnsMethodCalculate.markEndTimeMs("getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo130420b(fy3.C32226l<? super java.lang.Integer, java.lang.Float> r24, int r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            java.lang.String r3 = "initView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "convertToXmlPx"
            gy3.C87412m.m108594g(r1, r5)
            r0.f274203p = r1
            r5 = 16
            r0.setGravity(r5)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274194d
            r6 = 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r1.invoke(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            r8 = 34
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r1.invoke(r8)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            int r9 = (int) r9
            r0.addView(r5, r7, r9)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274194d
            r5.setTextColor(r2)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274194d
            r7 = 1053609165(0x3ecccccd, float:0.4)
            r5.setAlpha(r7)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274194d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r9 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            r10 = 0
            if (r9 == 0) goto L_0x005b
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            goto L_0x005c
        L_0x005b:
            r5 = r10
        L_0x005c:
            r9 = 15
            if (r5 == 0) goto L_0x0063
            r5.addRule(r9)
        L_0x0063:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274194d
            r11 = 24
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r12 = r1.invoke(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            int r12 = (int) r12
            r13 = 1
            r14 = 0
            androidx.core.widget.C103733h.m138105b(r5, r13, r12, r13, r14)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274195e
            java.lang.Object r6 = r1.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            int r6 = (int) r6
            java.lang.Object r8 = r1.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r0.addView(r5, r6, r8)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274195e
            r5.setTextColor(r2)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274195e
            r5.setAlpha(r7)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274195e
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r6 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x00ad
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            goto L_0x00ae
        L_0x00ad:
            r5 = r10
        L_0x00ae:
            r6 = 11
            if (r5 == 0) goto L_0x00b5
            r5.addRule(r6)
        L_0x00b5:
            if (r5 == 0) goto L_0x00ba
            r5.addRule(r9)
        L_0x00ba:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r5 = r0.f274195e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            androidx.core.widget.C103733h.m138105b(r5, r13, r7, r13, r14)
            int r5 = r0.f274204q
            int r5 = r5 * 2
            int r5 = r25 - r5
            r0.f274205r = r5
            android.view.View r7 = r0.f274197g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r1.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (int) r5
            r8 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            java.lang.Object r12 = r1.invoke(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            int r12 = (int) r12
            r0.addView(r7, r5, r12)
            android.view.View r5 = r0.f274197g
            r5.setBackgroundColor(r2)
            android.view.View r5 = r0.f274197g
            r5.setClipToOutline(r13)
            android.view.View r5 = r0.f274197g
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$b r7 = new com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r1.invoke(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            int r12 = (int) r12
            r7.<init>(r12)
            r5.setOutlineProvider(r7)
            android.view.View r5 = r0.f274197g
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r7 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x012a
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            goto L_0x012b
        L_0x012a:
            r5 = r10
        L_0x012b:
            if (r5 != 0) goto L_0x012e
            goto L_0x0142
        L_0x012e:
            int r7 = r0.f274204q
            fy3.a r7 = r0.mo130419a(r7)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r7 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r7
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r5.leftMargin = r7
        L_0x0142:
            if (r5 == 0) goto L_0x0147
            r5.addRule(r9)
        L_0x0147:
            android.view.View r5 = r0.f274198h
            int r7 = r0.f274205r
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r1.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r0.addView(r5, r7, r8)
            android.view.View r5 = r0.f274198h
            r5.setClipToOutline(r13)
            android.view.View r5 = r0.f274198h
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$b r7 = new com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            java.lang.Object r8 = r1.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            int r8 = (int) r8
            r7.<init>(r8)
            r5.setOutlineProvider(r7)
            android.view.View r5 = r0.f274198h
            r5.setBackgroundColor(r2)
            android.view.View r5 = r0.f274198h
            r7 = 1056964608(0x3f000000, float:0.5)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8.mo10233c(r7)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView"
            java.lang.String r18 = "initView"
            java.lang.String r19 = "(Lkotlin/jvm/functions/Function1;II)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            r15 = r5
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r8.mo10231a(r14)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r5.setAlpha(r7)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView"
            java.lang.String r17 = "initView"
            java.lang.String r18 = "(Lkotlin/jvm/functions/Function1;II)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r5 = r0.f274198h
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r7 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            if (r7 == 0) goto L_0x01e0
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            goto L_0x01e1
        L_0x01e0:
            r5 = r10
        L_0x01e1:
            if (r5 == 0) goto L_0x01e6
            r5.addRule(r9)
        L_0x01e6:
            if (r5 == 0) goto L_0x01eb
            r5.addRule(r6)
        L_0x01eb:
            if (r5 != 0) goto L_0x01ee
            goto L_0x0202
        L_0x01ee:
            int r6 = r0.f274204q
            fy3.a r6 = r0.mo130419a(r6)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r6 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r6
            java.lang.Object r6 = r6.invoke()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.rightMargin = r6
        L_0x0202:
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$a r5 = r0.f274196f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Object r6 = r1.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            int r6 = (int) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r1.invoke(r7)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (int) r1
            r0.addView(r5, r6, r1)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$a r1 = r0.f274196f
            r1.setColor(r2)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$a r1 = r0.f274196f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x0237
            r10 = r1
            android.widget.RelativeLayout$LayoutParams r10 = (android.widget.RelativeLayout.LayoutParams) r10
        L_0x0237:
            if (r10 != 0) goto L_0x023a
            goto L_0x024e
        L_0x023a:
            int r1 = r0.f274204q
            fy3.a r1 = r0.mo130419a(r1)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r1 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r1
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r10.leftMargin = r1
        L_0x024e:
            if (r10 == 0) goto L_0x0253
            r10.addRule(r9)
        L_0x0253:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.mo130420b(fy3.l, int, int):void");
    }

    /* renamed from: c */
    public final void mo130421c(C32224a<Float> aVar, float f, C32226l<? super Float, String> lVar) {
        SnsMethodCalculate.markStartTimeMs("setProgressProvider", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        C87412m.m108594g(aVar, "provider");
        C87412m.m108594g(lVar, "progressToText");
        this.f274200j = aVar;
        this.f274201n = Math.max(f, 0.1f);
        this.f274202o = lVar;
        AdAppCompatTextView adAppCompatTextView = this.f274195e;
        String invoke = lVar.invoke(Float.valueOf(f));
        if (invoke == null) {
            invoke = "00:00";
        }
        adAppCompatTextView.setText(invoke);
        SnsMethodCalculate.markEndTimeMs("setProgressProvider", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public final AdAppCompatTextView getCurrentTimeText() {
        SnsMethodCalculate.markStartTimeMs("getCurrentTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        AdAppCompatTextView adAppCompatTextView = this.f274194d;
        SnsMethodCalculate.markEndTimeMs("getCurrentTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return adAppCompatTextView;
    }

    public final AdAppCompatTextView getEndTimeText() {
        SnsMethodCalculate.markStartTimeMs("getEndTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        AdAppCompatTextView adAppCompatTextView = this.f274195e;
        SnsMethodCalculate.markEndTimeMs("getEndTimeText", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return adAppCompatTextView;
    }

    public final View getPlayedProgressLine() {
        SnsMethodCalculate.markStartTimeMs("getPlayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        View view = this.f274197g;
        SnsMethodCalculate.markEndTimeMs("getPlayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return view;
    }

    public final C71191a getPointView() {
        SnsMethodCalculate.markStartTimeMs("getPointView", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        C71191a aVar = this.f274196f;
        SnsMethodCalculate.markEndTimeMs("getPointView", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return aVar;
    }

    public final float getProgress() {
        SnsMethodCalculate.markStartTimeMs("getProgress", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        float f = this.f274207t;
        SnsMethodCalculate.markEndTimeMs("getProgress", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return f;
    }

    public final View getUnplayedProgressLine() {
        SnsMethodCalculate.markStartTimeMs("getUnplayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        View view = this.f274198h;
        SnsMethodCalculate.markEndTimeMs("getUnplayedProgressLine", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        return view;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        super.onAttachedToWindow();
        C0000n0 n0Var = this.f274199i;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        C0000n0 b = C53930o0.m60555b();
        this.f274199i = b;
        C53895h.m60466d(b, (C66212f) null, (C53934p0) null, new C94729d(this, (C15601d<? super C94729d>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        super.onDetachedFromWindow();
        C0000n0 n0Var = this.f274199i;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setProgress(float r7) {
        /*
            r6 = this;
            java.lang.String r0 = "setProgress"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            float r7 = java.lang.Math.max(r7, r2)
            float r2 = r6.f274201n
            float r7 = java.lang.Math.min(r7, r2)
            r6.f274207t = r7
            android.view.View r7 = r6.f274197g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r2 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0023
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            goto L_0x0024
        L_0x0023:
            r7 = r3
        L_0x0024:
            android.view.View r2 = r6.f274198h
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r4 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x0031
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            goto L_0x0032
        L_0x0031:
            r2 = r3
        L_0x0032:
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$a r4 = r6.f274196f
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r5 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r5 == 0) goto L_0x003f
            r3 = r4
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
        L_0x003f:
            float r4 = r6.f274207t
            float r5 = r6.f274201n
            float r4 = r4 / r5
            if (r7 != 0) goto L_0x0047
            goto L_0x005f
        L_0x0047:
            int r5 = r6.f274205r
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = (int) r5
            fy3.a r5 = r6.mo130419a(r5)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r5 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r5
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r7.width = r5
        L_0x005f:
            if (r7 != 0) goto L_0x0062
            goto L_0x0076
        L_0x0062:
            int r5 = r6.f274204q
            fy3.a r5 = r6.mo130419a(r5)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r5 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r5
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r7.leftMargin = r5
        L_0x0076:
            if (r2 != 0) goto L_0x0079
            goto L_0x0094
        L_0x0079:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r4
            int r4 = r6.f274205r
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = (int) r5
            fy3.a r4 = r6.mo130419a(r4)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r4 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r4
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r2.width = r4
        L_0x0094:
            if (r3 != 0) goto L_0x0097
            goto L_0x00c5
        L_0x0097:
            if (r7 == 0) goto L_0x009c
            int r7 = r7.width
            goto L_0x009d
        L_0x009c:
            r7 = 0
        L_0x009d:
            int r2 = r6.f274204q
            fy3.a r2 = r6.mo130419a(r2)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r2 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r2
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r7 = r7 + r2
            r2 = 12
            fy3.a r2 = r6.mo130419a(r2)
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$c r2 = (com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.C94728c) r2
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r7 = r7 - r2
            r3.leftMargin = r7
        L_0x00c5:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r7 = r6.f274194d
            fy3.l<? super java.lang.Float, java.lang.String> r2 = r6.f274202o
            if (r2 == 0) goto L_0x00d9
            float r3 = r6.f274207t
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00db
        L_0x00d9:
            java.lang.String r2 = "00:00"
        L_0x00db:
            r7.setText(r2)
            android.view.View r7 = r6.f274197g
            r7.requestLayout()
            android.view.View r7 = r6.f274198h
            r7.requestLayout()
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$a r7 = r6.f274196f
            r7.requestLayout()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView.setProgress(float):void");
    }

    public final void setRefreshing(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        this.f274206s = z;
        SnsMethodCalculate.markEndTimeMs("setRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
    }

    public SeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeekBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
