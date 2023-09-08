package vf1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveHistoryUI;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64499kq0;
import te3.C64528ln0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$refreshData$1", mo125469f = "FinderLiveHistoryUI.kt", mo125470l = {100, 205, 212}, mo125471m = "invokeSuspend")
/* renamed from: vf1.u2 */
public final class C65730u2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f189091d;

    /* renamed from: e */
    public int f189092e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveHistoryUI f189093f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$refreshData$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveHistoryUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vf1.u2$a */
    public static final class C65731a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f189094d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveHistoryUI f189095e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65731a(C0287e eVar, C15601d dVar, FinderLiveHistoryUI finderLiveHistoryUI) {
            super(2, dVar);
            this.f189094d = eVar;
            this.f189095e = finderLiveHistoryUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65731a(this.f189094d, dVar, this.f189095e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65731a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveHistoryUI", "#refreshData fail cgiException=" + ((C0280a) ((C0281b) this.f189094d).f843b).f841a);
            FinderRefreshLayout finderRefreshLayout = this.f189095e.f158997s;
            if (finderRefreshLayout != null) {
                finderRefreshLayout.mo26604l(true);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$refreshData$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveHistoryUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vf1.u2$b */
    public static final class C65732b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f189096d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveHistoryUI f189097e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65732b(C0287e eVar, C15601d dVar, FinderLiveHistoryUI finderLiveHistoryUI) {
            super(2, dVar);
            this.f189096d = eVar;
            this.f189097e = finderLiveHistoryUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65732b(this.f189096d, dVar, this.f189097e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65732b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C64528ln0 ln02 = (C64528ln0) ((C0288f) this.f189096d).f855b;
            StringBuilder sb = new StringBuilder();
            sb.append("#refreshData success total_count=");
            sb.append(ln02.f184126i);
            sb.append(" live_info.size=");
            LinkedList<C64499kq0> linkedList = ln02.f184121d;
            sb.append(linkedList != null ? new Integer(linkedList.size()) : null);
            sb.append(" continue_flag=");
            sb.append(ln02.f184123f);
            Log.m105924i("FinderLiveHistoryUI", sb.toString());
            FinderLiveHistoryUI finderLiveHistoryUI = this.f189097e;
            finderLiveHistoryUI.setMMTitle(this.f189097e.getResources().getString(C0966R.string.mo7) + '(' + ln02.f184126i + ')');
            ((ArrayList) this.f189097e.f158996r).clear();
            List<C64499kq0> list = this.f189097e.f158996r;
            LinkedList<C64499kq0> linkedList2 = ln02.f184121d;
            C87412m.m108593f(linkedList2, "it.live_info");
            ((ArrayList) list).addAll(linkedList2);
            FinderLiveHistoryUI finderLiveHistoryUI2 = this.f189097e;
            finderLiveHistoryUI2.f158995q = ln02.f184122e;
            FinderLiveHistoryUI.C55825a aVar = finderLiveHistoryUI2.f158999u;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
            if (ln02.f184123f == 1) {
                FinderRefreshLayout finderRefreshLayout = this.f189097e.f158997s;
                if (finderRefreshLayout != null) {
                    finderRefreshLayout.mo26604l(true);
                }
            } else {
                FinderRefreshLayout finderRefreshLayout2 = this.f189097e.f158997s;
                if (finderRefreshLayout2 != null) {
                    finderRefreshLayout2.mo26605m();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65730u2(FinderLiveHistoryUI finderLiveHistoryUI, C15601d<? super C65730u2> dVar) {
        super(2, dVar);
        this.f189093f = finderLiveHistoryUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65730u2(this.f189093f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65730u2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f189092e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r8.f189091d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a7
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.f189091d
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0089
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0068
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r9)
            te3.kn0 r9 = new te3.kn0
            r9.<init>()
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r1 = r8.f189093f
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r7 = r6.mo90662O5()
            r9.f183964e = r7
            java.lang.String r6 = r6.mo90662O5()
            r9.f183965f = r6
            je1.h2 r6 = je1.C46523h2.f125330a
            r7 = 9550(0x254e, float:1.3382E-41)
            te3.ig0 r6 = r6.mo71859a(r7)
            r9.f183963d = r6
            r9.f183970n = r4
            int r6 = r1.f158993o
            r9.f183967h = r6
            int r1 = r1.f158994p
            r9.f183966g = r1
            r9.f183968i = r5
            ob0.b r9 = r9.mo89035b()
            r8.f189092e = r4
            java.lang.Object r9 = bi1.C0283d.m245c(r9, r5, r8, r4, r5)
            if (r9 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r1 = r9
            bi1.e r1 = (bi1.C0287e) r1
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r9 = r8.f189093f
            boolean r4 = r1 instanceof bi1.C0288f
            if (r4 == 0) goto L_0x0089
            wx3.f r4 = r1.f854a
            if (r4 != 0) goto L_0x0079
            wx3.f r4 = r8.getContext()
        L_0x0079:
            vf1.u2$b r6 = new vf1.u2$b
            r6.<init>(r1, r5, r9)
            r8.f189091d = r1
            r8.f189092e = r3
            java.lang.Object r9 = a14.C53895h.m60469g(r4, r6, r8)
            if (r9 != r0) goto L_0x0089
            return r0
        L_0x0089:
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r9 = r8.f189093f
            boolean r3 = r1 instanceof bi1.C0281b
            if (r3 == 0) goto L_0x00a7
            wx3.f r3 = r1.f854a
            if (r3 != 0) goto L_0x0097
            wx3.f r3 = r8.getContext()
        L_0x0097:
            vf1.u2$a r4 = new vf1.u2$a
            r4.<init>(r1, r5, r9)
            r8.f189091d = r1
            r8.f189092e = r2
            java.lang.Object r9 = a14.C53895h.m60469g(r3, r4, r8)
            if (r9 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C65730u2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
