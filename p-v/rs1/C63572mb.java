package rs1;

import a14.C0000n0;
import d14.C45252f;
import d14.C45253g;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import p145dx.C58451o;
import p145dx.C58457w;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.RingtoneSearchMainUIC$bindDataSource$1", mo125469f = "RingtoneSearchMainUIC.kt", mo125470l = {223}, mo125471m = "invokeSuspend")
/* renamed from: rs1.mb */
public final class C63572mb extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180274d;

    /* renamed from: e */
    public final /* synthetic */ C63625rb f180275e;

    /* renamed from: rs1.mb$a */
    public static final class C63573a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C63625rb f180276d;

        public C63573a(C63625rb rbVar) {
            this.f180276d = rbVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            r3 = r3.getData();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(java.lang.Object r24, wx3.C15601d r25) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Class<dx.w> r1 = p145dx.C58457w.class
                r2 = r24
                dx.o$a r2 = (p145dx.C58451o.C58452a) r2
                rs1.rb r3 = r0.f180276d
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r3.mo88467e3()
                r4 = 1
                r3.mo26580f(r4)
                int r3 = r2.f167434b
                r5 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r7 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                if (r3 == r4) goto L_0x02a7
                r8 = 2
                if (r3 == r8) goto L_0x0221
                r8 = 4
                if (r3 == r8) goto L_0x0216
                rs1.rb r3 = r0.f180276d
                r3.f180407r = r5
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r3 = r3.f180404o
                if (r3 == 0) goto L_0x003a
                java.util.List r3 = r3.getData()
                if (r3 == 0) goto L_0x003a
                int r3 = r3.size()
                goto L_0x003b
            L_0x003a:
                r3 = 0
            L_0x003b:
                java.util.List<pj2.d> r2 = r2.f167433a
                if (r2 == 0) goto L_0x009b
                rs1.rb r8 = r0.f180276d
                java.util.Iterator r2 = r2.iterator()
            L_0x0045:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x009b
                java.lang.Object r9 = r2.next()
                pj2.d r9 = (pj2.C62323d) r9
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r10 = r8.f180404o
                if (r10 == 0) goto L_0x008a
                java.util.List r10 = r10.getData()
                if (r10 == 0) goto L_0x008a
                boolean r11 = r10.isEmpty()
                if (r11 == 0) goto L_0x0062
                goto L_0x0085
            L_0x0062:
                java.util.Iterator r10 = r10.iterator()
            L_0x0066:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x0085
                java.lang.Object r11 = r10.next()
                pj2.d r11 = (pj2.C62323d) r11
                long r11 = r11.getItemId()
                long r13 = r9.getItemId()
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 != 0) goto L_0x0080
                r11 = 1
                goto L_0x0081
            L_0x0080:
                r11 = 0
            L_0x0081:
                if (r11 == 0) goto L_0x0066
                r10 = 0
                goto L_0x0086
            L_0x0085:
                r10 = 1
            L_0x0086:
                if (r10 != r4) goto L_0x008a
                r10 = 1
                goto L_0x008b
            L_0x008a:
                r10 = 0
            L_0x008b:
                if (r10 == 0) goto L_0x0045
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r10 = r8.f180404o
                if (r10 == 0) goto L_0x0045
                java.util.List r10 = r10.getData()
                if (r10 == 0) goto L_0x0045
                r10.add(r9)
                goto L_0x0045
            L_0x009b:
                rs1.rb r2 = r0.f180276d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f180404o
                if (r2 == 0) goto L_0x00af
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x00af
                boolean r2 = r2.isEmpty()
                if (r2 != r4) goto L_0x00af
                r2 = 1
                goto L_0x00b0
            L_0x00af:
                r2 = 0
            L_0x00b0:
                if (r2 == 0) goto L_0x0138
                rs1.rb r2 = r0.f180276d
                android.view.View r3 = r2.mo88465c3()
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r4.mo10233c(r7)
                java.lang.Object[] r9 = r4.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r11 = "showNoResultVIew"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r10 = "showNoResultVIew"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r2 = r2.mo88466d3()
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r6)
                java.lang.Object[] r16 = r3.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r18 = "showNoResultVIew"
                java.lang.String r19 = "()V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r2
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r17 = "showNoResultVIew"
                java.lang.String r18 = "()V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
                goto L_0x0346
            L_0x0138:
                rs1.rb r2 = r0.f180276d
                android.view.View r6 = r2.mo88465c3()
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r15.mo10233c(r7)
                java.lang.Object[] r9 = r15.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r11 = "showSearchResultView"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r8 = r6
                r4 = r15
                r15 = r16
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r6.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r10 = "showSearchResultView"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r2 = r2.mo88466d3()
                k20.a r4 = new k20.a
                r4.<init>()
                r4.mo10233c(r7)
                java.lang.Object[] r16 = r4.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r18 = "showSearchResultView"
                java.lang.String r19 = "()V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r2
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r2.setVisibility(r4)
                java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r17 = "showSearchResultView"
                java.lang.String r18 = "()V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
                rs1.rb r2 = r0.f180276d
                r2.getClass()
                di3.d r4 = di3.C86312j.m106911c(r1)
                dx.w r4 = (p145dx.C58457w) r4
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                dx.n r2 = r4.mo82784Bt(r2)
                boolean r2 = r2.mo80828T()
                if (r2 == 0) goto L_0x01f8
                if (r3 != 0) goto L_0x01f8
                rs1.rb r2 = r0.f180276d
                r4 = 1
                r2.f180408s = r4
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f180404o
                if (r2 == 0) goto L_0x01f0
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x01f0
                java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
                pj2.d r2 = (pj2.C62323d) r2
                goto L_0x01f1
            L_0x01f0:
                r2 = 0
            L_0x01f1:
                if (r2 != 0) goto L_0x01f4
                goto L_0x01f8
            L_0x01f4:
                r4 = 1
                r2.mo87404h(r4)
            L_0x01f8:
                rs1.rb r2 = r0.f180276d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f180404o
                if (r2 == 0) goto L_0x0208
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x0208
                int r5 = r2.size()
            L_0x0208:
                if (r5 <= r3) goto L_0x0346
                rs1.rb r2 = r0.f180276d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f180404o
                if (r2 == 0) goto L_0x0346
                int r5 = r5 - r3
                r2.notifyItemRangeInserted(r3, r5)
                goto L_0x0346
            L_0x0216:
                rs1.rb r2 = r0.f180276d
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r2 = r2.mo88467e3()
                r2.mo26600h()
                goto L_0x0346
            L_0x0221:
                rs1.rb r2 = r0.f180276d
                android.view.View r3 = r2.mo88465c3()
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r4.mo10233c(r6)
                java.lang.Object[] r9 = r4.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r11 = "showLoadingView"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r10 = "showLoadingView"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r2 = r2.mo88466d3()
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r7)
                java.lang.Object[] r16 = r3.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r18 = "showLoadingView"
                java.lang.String r19 = "()V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r2
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r17 = "showLoadingView"
                java.lang.String r18 = "()V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
                goto L_0x0346
            L_0x02a7:
                rs1.rb r2 = r0.f180276d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r3 = r2.f180404o
                if (r3 == 0) goto L_0x02b6
                java.util.List r3 = r3.getData()
                if (r3 == 0) goto L_0x02b6
                r3.clear()
            L_0x02b6:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r3 = r2.f180404o
                if (r3 == 0) goto L_0x02bd
                r3.notifyDataSetChanged()
            L_0x02bd:
                com.tencent.mm.view.refreshLayout.WxRefreshLayout r3 = r2.mo88467e3()
                r3.mo26642z(r5)
                android.view.View r3 = r2.mo88465c3()
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r4.mo10233c(r7)
                java.lang.Object[] r9 = r4.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r11 = "showInitView"
                java.lang.String r12 = "()V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r10 = "showInitView"
                java.lang.String r11 = "()V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r2 = r2.mo88466d3()
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r7)
                java.lang.Object[] r16 = r3.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r18 = "showInitView"
                java.lang.String r19 = "()V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r2
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r16 = "com/tencent/mm/plugin/finder/viewmodel/component/RingtoneSearchMainUIC"
                java.lang.String r17 = "showInitView"
                java.lang.String r18 = "()V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            L_0x0346:
                di3.d r1 = di3.C86312j.m106911c(r1)
                dx.w r1 = (p145dx.C58457w) r1
                rs1.rb r2 = r0.f180276d
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                dx.v r1 = r1.mo82796mh(r2)
                rs1.rb r2 = r0.f180276d
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r2.f180404o
                if (r2 == 0) goto L_0x0362
                java.util.List r2 = r2.getData()
                if (r2 != 0) goto L_0x0364
            L_0x0362:
                sx3.f0 r2 = sx3.C64186f0.f181907d
            L_0x0364:
                r1.mo75839K0(r2)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63572mb.C63573a.emit(java.lang.Object, wx3.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63572mb(C63625rb rbVar, C15601d<? super C63572mb> dVar) {
        super(2, dVar);
        this.f180275e = rbVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63572mb(this.f180275e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63572mb) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C45252f<C58451o.C58452a> W;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f180274d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58451o r1 = ((C58457w) C86312j.m106911c(C58457w.class)).mo82786Iv(this.f180275e.getActivity()).mo75819r1();
            if (!(r1 == null || (W = r1.mo83412W()) == null)) {
                C63573a aVar2 = new C63573a(this.f180275e);
                this.f180274d = 1;
                if (W.mo31880a(aVar2, this) == aVar) {
                    return aVar;
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
