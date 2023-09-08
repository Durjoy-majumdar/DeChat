package com.tencent.p014mm.plugin.finder.replay.widget;

import a14.C0000n0;
import a14.C53965x0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import bp1.C54519d;
import com.tencent.p014mm.C0966R;
import cp1.C57950k;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import nj3.C76901s0;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C64662qp2;
import vo1.C65770a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&B\u001d\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0002J \u0010\u000e\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0018\u00010\fR\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u000bJ \u0010\u000f\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0018\u00010\fR\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u000bR!\u0010\u0015\u001a\f\u0012\b\u0012\u00060\fR\u00020\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/widget/FinderLiveReplaySeekbar;", "Landroid/widget/SeekBar;", "Landroid/view/View;", "contentView", "Lrx3/b0;", "setFragmentPreview", "", "Lte3/qp2;", "items", "setFragmentItems", "getFragmentView", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/finder/replay/widget/FinderLiveReplaySeekbar$a;", "callback", "setBreakpointClickCallback", "setBreakPointDoubleClickCallback", "", "u", "Ljava/util/List;", "getFragmentItems", "()Ljava/util/List;", "fragmentItems", "", "v", "Z", "isDragging", "()Z", "setDragging", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar */
public final class FinderLiveReplaySeekbar extends SeekBar {

    /* renamed from: d */
    public final String f160801d = "FinderLiveReplaySeekbar";

    /* renamed from: e */
    public float f160802e;

    /* renamed from: f */
    public float f160803f;

    /* renamed from: g */
    public long f160804g;

    /* renamed from: h */
    public boolean f160805h;

    /* renamed from: i */
    public C32226l<? super C56261a, C13598b0> f160806i;

    /* renamed from: j */
    public C32226l<? super C56261a, C13598b0> f160807j;

    /* renamed from: n */
    public C56261a f160808n;

    /* renamed from: o */
    public boolean f160809o;

    /* renamed from: p */
    public List<SeekBar.OnSeekBarChangeListener> f160810p = new ArrayList();

    /* renamed from: q */
    public C76901s0 f160811q;

    /* renamed from: r */
    public final Vibrator f160812r;

    /* renamed from: s */
    public int f160813s;

    /* renamed from: t */
    public C0000n0 f160814t;

    /* renamed from: u */
    public final List<C56261a> f160815u;

    /* renamed from: v */
    public boolean f160816v;

    /* renamed from: com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a */
    public final class C56261a {

        /* renamed from: a */
        public final FinderLiveReplaySeekbar f160817a;

        /* renamed from: b */
        public final C64662qp2 f160818b;

        /* renamed from: c */
        public final Drawable f160819c;

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplaySeekbar f160820d;

        public C56261a(FinderLiveReplaySeekbar finderLiveReplaySeekbar, FinderLiveReplaySeekbar finderLiveReplaySeekbar2, C64662qp2 qp22) {
            C87412m.m108594g(finderLiveReplaySeekbar2, "seekbar");
            C87412m.m108594g(qp22, "wonderfulFragment");
            this.f160820d = finderLiveReplaySeekbar;
            this.f160817a = finderLiveReplaySeekbar2;
            this.f160818b = qp22;
            Drawable drawable = finderLiveReplaySeekbar.getContext().getDrawable(finderLiveReplaySeekbar2.getContext().getResources().getConfiguration().orientation == 2 ? C0966R.C0969drawable.cpu : C0966R.C0969drawable.cpv);
            C87412m.m108591d(drawable);
            this.f160819c = drawable;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$onTouchEvent$1", mo125469f = "FinderLiveReplaySeekbar.kt", mo125470l = {195}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$b */
    public static final class C56262b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f160821d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveReplaySeekbar f160822e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56262b(FinderLiveReplaySeekbar finderLiveReplaySeekbar, C15601d<? super C56262b> dVar) {
            super(2, dVar);
            this.f160822e = finderLiveReplaySeekbar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56262b(this.f160822e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56262b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f160821d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f160821d = 1;
                if (C53965x0.m60607b((long) ViewConfiguration.getDoubleTapTimeout(), this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f160822e;
            C32226l<? super C56261a, C13598b0> lVar = finderLiveReplaySeekbar.f160806i;
            if (lVar != null) {
                lVar.invoke(finderLiveReplaySeekbar.f160808n);
            }
            this.f160822e.f160808n = null;
            return C13598b0.f38549a;
        }
    }

    public FinderLiveReplaySeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object systemService = getContext().getSystemService("vibrator");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f160812r = (Vibrator) systemService;
        this.f160815u = new ArrayList();
        setOnSeekBarChangeListener(new C57950k(this));
    }

    public final List<C56261a> getFragmentItems() {
        return this.f160815u;
    }

    public final View getFragmentView() {
        C76901s0 s0Var = this.f160811q;
        if (s0Var != null) {
            return s0Var.getContentView();
        }
        return null;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        for (C56261a aVar : this.f160815u) {
            aVar.getClass();
            C45795b bVar = C65770a0.f189184r.mo89819a().f189189c;
            int i3 = bVar != null ? ((C54519d) bVar.mo71262a(C54519d.class)).mo75375i3() : -1;
            int paddingLeft = (int) ((((float) aVar.f160820d.getPaddingLeft()) + ((((float) aVar.f160818b.f185060d) / ((float) i3)) * ((float) ((aVar.f160817a.getWidth() - aVar.f160817a.getPaddingLeft()) - aVar.f160817a.getPaddingRight())))) - ((float) (aVar.f160819c.getIntrinsicWidth() / 2)));
            if (aVar.f160818b.f185060d <= i3) {
                int paddingTop = (int) ((((float) aVar.f160820d.getPaddingTop()) + (((float) aVar.f160817a.getHeight()) / 2.0f)) - (((float) aVar.f160819c.getIntrinsicHeight()) / 2.0f));
                Drawable drawable = aVar.f160819c;
                drawable.setBounds(paddingLeft, paddingTop, drawable.getIntrinsicWidth() + paddingLeft, aVar.f160819c.getIntrinsicHeight() + paddingTop);
                aVar.f160819c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 != 3) goto L_0x012b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r14, r0)
            int r0 = r14.getActionMasked()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00bb
            if (r0 == r3) goto L_0x005b
            r4 = 2
            if (r0 == r4) goto L_0x0018
            r4 = 3
            if (r0 == r4) goto L_0x005b
            goto L_0x012b
        L_0x0018:
            float r0 = r14.getX()
            float r5 = r14.getY()
            float r6 = r13.f160802e
            float r7 = r13.f160803f
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledTouchSlop()
            float r0 = r0 - r6
            double r9 = (double) r0
            double r11 = (double) r4
            double r9 = java.lang.Math.pow(r9, r11)
            float r0 = (float) r9
            float r5 = r5 - r7
            double r4 = (double) r5
            double r4 = java.lang.Math.pow(r4, r11)
            float r4 = (float) r4
            float r0 = r0 + r4
            double r4 = (double) r0
            double r4 = java.lang.Math.sqrt(r4)
            float r0 = (float) r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = (float) r8
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            r1 = 1
        L_0x0050:
            r13.f160805h = r1
            if (r1 != 0) goto L_0x0055
            return r3
        L_0x0055:
            r13.f160816v = r3
            r13.f160808n = r2
            goto L_0x012b
        L_0x005b:
            r13.f160816v = r1
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a r0 = r13.f160808n
            if (r0 == 0) goto L_0x012b
            boolean r0 = r13.f160805h
            if (r0 != 0) goto L_0x012b
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r13.f160804g
            long r4 = r4 - r6
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x012b
            boolean r14 = r13.f160809o
            if (r14 == 0) goto L_0x00a4
            fy3.l<? super com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a, rx3.b0> r14 = r13.f160807j
            if (r14 == 0) goto L_0x0082
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a r0 = r13.f160808n
            r14.invoke(r0)
        L_0x0082:
            r13.f160809o = r1
            r13.f160808n = r2
            java.lang.Class<ht1.j5> r14 = ht1.C8777j5.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ht1.j5 r14 = (ht1.C8777j5) r14
            ak1.e0 r0 = ak1.C0047e0.f58a
            org.json.JSONObject r0 = ak1.C0047e0.m34b(r0, r2, r3, r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveChargeAndReplayRepor…CommonParams().toString()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = "watch_live_point_double_click"
            r14.hg0(r1, r0)
            goto L_0x00ba
        L_0x00a4:
            a14.h0 r14 = a14.C53872d1.f151117a
            a14.k2 r14 = f14.C58901s.f168555a
            a14.n0 r4 = a14.C53930o0.m60554a(r14)
            r13.f160814t = r4
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$b r7 = new com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$b
            r7.<init>(r13, r2)
            r8 = 3
            r9 = 0
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
        L_0x00ba:
            return r3
        L_0x00bb:
            float r0 = r14.getX()
            r13.f160802e = r0
            float r0 = r14.getY()
            r13.f160803f = r0
            long r4 = java.lang.System.currentTimeMillis()
            r13.f160804g = r4
            r13.f160805h = r1
            float r0 = r14.getX()
            int r0 = (int) r0
            float r1 = r14.getY()
            int r1 = (int) r1
            java.util.List<com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a> r4 = r13.f160815u
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00e1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0114
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a r5 = (com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar.C56261a) r5
            android.graphics.drawable.Drawable r6 = r5.f160819c
            android.graphics.Rect r6 = r6.getBounds()
            java.lang.String r7 = "point.bounds"
            gy3.C87412m.m108593f(r6, r7)
            android.graphics.Rect r7 = new android.graphics.Rect
            int r8 = r6.left
            int r8 = r8 + -30
            int r9 = r6.top
            int r9 = r9 + -30
            int r10 = r6.right
            int r10 = r10 + 30
            int r6 = r6.bottom
            int r6 = r6 + 30
            r7.<init>(r8, r9, r10, r6)
            boolean r6 = r7.contains(r0, r1)
            if (r6 == 0) goto L_0x00e1
            goto L_0x0115
        L_0x0114:
            r5 = r2
        L_0x0115:
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a r0 = r13.f160808n
            if (r0 == 0) goto L_0x0129
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 == 0) goto L_0x0129
            a14.n0 r0 = r13.f160814t
            if (r0 == 0) goto L_0x0126
            a14.C53930o0.m60556c(r0, r2)
        L_0x0126:
            r13.f160809o = r3
            goto L_0x012b
        L_0x0129:
            r13.f160808n = r5
        L_0x012b:
            boolean r14 = super.onTouchEvent(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBreakPointDoubleClickCallback(C32226l<? super C56261a, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.f160807j = lVar;
    }

    public final void setBreakpointClickCallback(C32226l<? super C56261a, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        this.f160806i = lVar;
    }

    public final void setDragging(boolean z) {
        this.f160816v = z;
    }

    public final void setFragmentItems(List<? extends C64662qp2> list) {
        C87412m.m108594g(list, "items");
        ((ArrayList) this.f160815u).clear();
        List<C56261a> list2 = this.f160815u;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C64662qp2 aVar : list) {
            arrayList.add(new C56261a(this, this, aVar));
        }
        ((ArrayList) list2).addAll(arrayList);
        invalidate();
    }

    public final void setFragmentPreview(View view) {
        C87412m.m108594g(view, "contentView");
        C76901s0 s0Var = new C76901s0(view, -2, -2);
        s0Var.setOutsideTouchable(true);
        s0Var.setFocusable(true);
        this.f160811q = s0Var;
    }

    public FinderLiveReplaySeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object systemService = getContext().getSystemService("vibrator");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f160812r = (Vibrator) systemService;
        this.f160815u = new ArrayList();
        setOnSeekBarChangeListener(new C57950k(this));
    }
}
