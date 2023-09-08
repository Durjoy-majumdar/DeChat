package ck2;

import a14.C0000n0;
import bl3.C39818r;
import d14.C45252f;
import d14.C45253g;
import d14.C58100z0;
import fy3.C32227p;
import kotlin.ResultKt;
import p145dx.C58451o;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneSelectMainUIC$bindDataSource$1", mo125469f = "RingtoneSelectMainUIC.kt", mo125470l = {210}, mo125471m = "invokeSuspend")
/* renamed from: ck2.g0 */
public final class C54895g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f153869d;

    /* renamed from: e */
    public final /* synthetic */ C54898h0 f153870e;

    /* renamed from: ck2.g0$a */
    public static final class C54896a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C54898h0 f153871d;

        public C54896a(C54898h0 h0Var) {
            this.f153871d = h0Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: pj2.d} */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0097, code lost:
            r2 = r2.getData();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00df A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r21, wx3.C15601d r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                dx.o$a r1 = (p145dx.C58451o.C58452a) r1
                ck2.h0 r2 = r0.f153871d
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r2.mo75833d3()
                r3 = 1
                r2.mo26580f(r3)
                ck2.h0 r2 = r0.f153871d
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r2.mo75833d3()
                r2.mo26604l(r3)
                int r2 = r1.f167434b
                java.lang.String r4 = "<get-statusContainer>(...)"
                r5 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r7 = 4
                r8 = 8
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                if (r2 != r7) goto L_0x0088
                ck2.h0 r1 = r0.f153871d
                rx3.g r2 = r1.f153879f
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                gy3.C87412m.m108593f(r2, r4)
                android.view.View r2 = (android.view.View) r2
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r3.mo10233c(r9)
                java.lang.Object[] r11 = r3.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r13 = "showFooterView"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r12 = "showFooterView"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r1.mo75834e3()
                r2.setVisibility(r5)
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r1.mo75833d3()
                r1.mo26600h()
                goto L_0x037b
            L_0x0088:
                if (r2 != r3) goto L_0x0091
                ck2.h0 r1 = r0.f153871d
                r1.mo75836g3()
                goto L_0x037b
            L_0x0091:
                ck2.h0 r2 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f153885o
                if (r2 == 0) goto L_0x00a2
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x00a2
                int r2 = r2.size()
                goto L_0x00a3
            L_0x00a2:
                r2 = 0
            L_0x00a3:
                ck2.h0 r7 = r0.f153871d
                boolean r10 = r7.f153889s
                r11 = 0
                if (r10 == 0) goto L_0x00d0
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r7 = r7.f153885o
                if (r7 == 0) goto L_0x00b7
                java.util.List r7 = r7.getData()
                if (r7 == 0) goto L_0x00b7
                r7.clear()
            L_0x00b7:
                ck2.h0 r7 = r0.f153871d
                r7.f153888r = r11
                bl3.r r10 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r7 = r7.getActivity()
                bl3.r$a r7 = r10.mo62444c(r7)
                java.lang.Class<ck2.d0> r10 = ck2.C54883d0.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r10)
                ck2.d0 r7 = (ck2.C54883d0) r7
                r7.mo75823T2()
            L_0x00d0:
                ck2.h0 r7 = r0.f153871d
                r7.f153889s = r5
                r7.f153890t = r5
                java.util.List<pj2.d> r1 = r1.f167433a
                if (r1 == 0) goto L_0x0137
                java.util.Iterator r1 = r1.iterator()
                r10 = 0
            L_0x00df:
                boolean r12 = r1.hasNext()
                if (r12 == 0) goto L_0x0138
                java.lang.Object r12 = r1.next()
                pj2.d r12 = (pj2.C62323d) r12
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r13 = r7.f153885o
                if (r13 == 0) goto L_0x0124
                java.util.List r13 = r13.getData()
                if (r13 == 0) goto L_0x0124
                boolean r14 = r13.isEmpty()
                if (r14 == 0) goto L_0x00fc
                goto L_0x011f
            L_0x00fc:
                java.util.Iterator r13 = r13.iterator()
            L_0x0100:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x011f
                java.lang.Object r14 = r13.next()
                pj2.d r14 = (pj2.C62323d) r14
                long r14 = r14.getItemId()
                long r16 = r12.getItemId()
                int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r18 != 0) goto L_0x011a
                r14 = 1
                goto L_0x011b
            L_0x011a:
                r14 = 0
            L_0x011b:
                if (r14 == 0) goto L_0x0100
                r13 = 0
                goto L_0x0120
            L_0x011f:
                r13 = 1
            L_0x0120:
                if (r13 != r3) goto L_0x0124
                r13 = 1
                goto L_0x0125
            L_0x0124:
                r13 = 0
            L_0x0125:
                if (r13 == 0) goto L_0x00df
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r13 = r7.f153885o
                if (r13 == 0) goto L_0x0134
                java.util.List r13 = r13.getData()
                if (r13 == 0) goto L_0x0134
                r13.add(r12)
            L_0x0134:
                int r10 = r10 + 1
                goto L_0x00df
            L_0x0137:
                r10 = 0
            L_0x0138:
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153885o
                if (r1 == 0) goto L_0x014c
                java.util.List r1 = r1.getData()
                if (r1 == 0) goto L_0x014c
                boolean r1 = r1.isEmpty()
                if (r1 != r3) goto L_0x014c
                r1 = 1
                goto L_0x014d
            L_0x014c:
                r1 = 0
            L_0x014d:
                if (r1 == 0) goto L_0x02d0
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r1.mo75834e3()
                r2.setVisibility(r8)
                rx3.g r2 = r1.f153882i
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                java.lang.String r3 = "<get-emptyTipView>(...)"
                gy3.C87412m.m108593f(r2, r3)
                android.view.View r2 = (android.view.View) r2
                rx3.g r7 = r1.f153879f
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                gy3.C87412m.m108593f(r7, r4)
                r4 = r7
                android.view.View r4 = (android.view.View) r4
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r6)
                java.lang.Object[] r11 = r7.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r13 = "showStatusView"
                java.lang.String r14 = "(Landroid/view/View;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r4
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r7 = r7.mo10231a(r5)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r12 = "showStatusView"
                java.lang.String r13 = "(Landroid/view/View;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                rx3.g r4 = r1.f153880g
                rx3.n r4 = (rx3.C36570n) r4
                java.lang.Object r4 = r4.getValue()
                java.lang.String r7 = "<get-progressView>(...)"
                gy3.C87412m.m108593f(r4, r7)
                android.view.View r4 = (android.view.View) r4
                k20.a r7 = new k20.a
                r7.<init>()
                r7.mo10233c(r9)
                java.lang.Object[] r11 = r7.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r13 = "showStatusView"
                java.lang.String r14 = "(Landroid/view/View;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r4
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r7 = r7.mo10231a(r5)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r12 = "showStatusView"
                java.lang.String r13 = "(Landroid/view/View;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                rx3.g r4 = r1.f153881h
                rx3.n r4 = (rx3.C36570n) r4
                java.lang.Object r4 = r4.getValue()
                java.lang.String r7 = "<get-retryTipView>(...)"
                gy3.C87412m.m108593f(r4, r7)
                android.view.View r4 = (android.view.View) r4
                k20.a r7 = new k20.a
                r7.<init>()
                r7.mo10233c(r9)
                java.lang.Object[] r11 = r7.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r13 = "showStatusView"
                java.lang.String r14 = "(Landroid/view/View;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r4
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r7 = r7.mo10231a(r5)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r4.setVisibility(r7)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r12 = "showStatusView"
                java.lang.String r13 = "(Landroid/view/View;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                rx3.g r1 = r1.f153882i
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                gy3.C87412m.m108593f(r1, r3)
                android.view.View r1 = (android.view.View) r1
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r9)
                java.lang.Object[] r11 = r3.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r13 = "showStatusView"
                java.lang.String r14 = "(Landroid/view/View;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r1
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r12 = "showStatusView"
                java.lang.String r13 = "(Landroid/view/View;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                k20.a r1 = new k20.a
                r1.<init>()
                r1.mo10233c(r6)
                java.lang.Object[] r11 = r1.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r13 = "showStatusView"
                java.lang.String r14 = "(Landroid/view/View;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r1 = r1.mo10231a(r5)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r2.setVisibility(r1)
                java.lang.String r11 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r12 = "showStatusView"
                java.lang.String r13 = "(Landroid/view/View;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x037b
            L_0x02d0:
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerView r6 = r1.mo75834e3()
                r6.setVisibility(r5)
                rx3.g r1 = r1.f153879f
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                gy3.C87412m.m108593f(r1, r4)
                android.view.View r1 = (android.view.View) r1
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r4.mo10233c(r9)
                java.lang.Object[] r13 = r4.mo10232b()
                java.lang.String r14 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r15 = "showSearchResultView"
                java.lang.String r16 = "()V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r12 = r1
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r1.setVisibility(r4)
                java.lang.String r13 = "com/tencent/mm/plugin/ringtone/uic/RingtoneSelectMainUIC"
                java.lang.String r14 = "showSearchResultView"
                java.lang.String r15 = "()V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                if (r2 != 0) goto L_0x0372
                ck2.h0 r1 = r0.f153871d
                boolean r1 = r1.mo75835f3()
                if (r1 == 0) goto L_0x0368
                ck2.h0 r1 = r0.f153871d
                r1.f153891u = r3
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r1 = r1.mo75833d3()
                mq3.a r1 = r1.getCommonConfig()
                r1.f126542d = r3
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153885o
                if (r1 == 0) goto L_0x034f
                java.util.List r1 = r1.getData()
                if (r1 == 0) goto L_0x034f
                java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
                r11 = r1
                pj2.d r11 = (pj2.C62323d) r11
            L_0x034f:
                if (r11 != 0) goto L_0x0352
                goto L_0x0355
            L_0x0352:
                r11.mo87404h(r3)
            L_0x0355:
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r1.f153885o
                if (r2 == 0) goto L_0x0368
                pj2.n r1 = r1.f153884n
                int r1 = r1.hashCode()
                long r3 = (long) r1
                r5 = 0
                r6 = 2
                r7 = 0
                jq3.C60898l.m71332k6(r2, r3, r5, r6, r7)
            L_0x0368:
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153885o
                if (r1 == 0) goto L_0x037b
                r1.notifyDataSetChanged()
                goto L_0x037b
            L_0x0372:
                ck2.h0 r1 = r0.f153871d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r1.f153885o
                if (r1 == 0) goto L_0x037b
                r1.notifyItemRangeInserted(r2, r10)
            L_0x037b:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ck2.C54895g0.C54896a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54895g0(C54898h0 h0Var, C15601d<? super C54895g0> dVar) {
        super(2, dVar);
        this.f153870e = h0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54895g0(this.f153870e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54895g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f153869d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<C58451o.C58452a> fVar = ((C54873a) C39818r.f106831a.mo62444c(this.f153870e.getActivity()).mo75002a(C54873a.class)).f153804d.f177169e;
            C54896a aVar2 = new C54896a(this.f153870e);
            this.f153869d = 1;
            C58100z0 z0Var = (C58100z0) fVar;
            z0Var.getClass();
            if (C58100z0.m67238l(z0Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
