package vf1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$loadMoreData$1", mo125469f = "FinderLiveHistoryUI.kt", mo125470l = {137, 205, 212}, mo125471m = "invokeSuspend")
/* renamed from: vf1.t2 */
public final class C65727t2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f189084d;

    /* renamed from: e */
    public int f189085e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveHistoryUI f189086f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$loadMoreData$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveHistoryUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vf1.t2$a */
    public static final class C65728a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f189087d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveHistoryUI f189088e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65728a(C0287e eVar, C15601d dVar, FinderLiveHistoryUI finderLiveHistoryUI) {
            super(2, dVar);
            this.f189087d = eVar;
            this.f189088e = finderLiveHistoryUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65728a(this.f189087d, dVar, this.f189088e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65728a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveHistoryUI", "#loadMoreData fail cgiException=" + ((C0280a) ((C0281b) this.f189087d).f843b).f841a);
            FinderRefreshLayout finderRefreshLayout = this.f189088e.f158997s;
            if (finderRefreshLayout != null) {
                finderRefreshLayout.mo26580f(true);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI$loadMoreData$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveHistoryUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vf1.t2$b */
    public static final class C65729b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f189089d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveHistoryUI f189090e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65729b(C0287e eVar, C15601d dVar, FinderLiveHistoryUI finderLiveHistoryUI) {
            super(2, dVar);
            this.f189089d = eVar;
            this.f189090e = finderLiveHistoryUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65729b(this.f189089d, dVar, this.f189090e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65729b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C64528ln0 ln02 = (C64528ln0) ((C0288f) this.f189089d).f855b;
            StringBuilder sb = new StringBuilder();
            sb.append("#loadMoreData success total_count=");
            sb.append(ln02.f184126i);
            sb.append(" live_info.size=");
            LinkedList<C64499kq0> linkedList = ln02.f184121d;
            sb.append(linkedList != null ? new Integer(linkedList.size()) : null);
            sb.append(" continue_flag=");
            sb.append(ln02.f184123f);
            Log.m105924i("FinderLiveHistoryUI", sb.toString());
            List<C64499kq0> list = this.f189090e.f158996r;
            LinkedList<C64499kq0> linkedList2 = ln02.f184121d;
            C87412m.m108593f(linkedList2, "it.live_info");
            ((ArrayList) list).addAll(linkedList2);
            FinderLiveHistoryUI finderLiveHistoryUI = this.f189090e;
            FinderLiveHistoryUI.C55825a aVar = finderLiveHistoryUI.f158999u;
            if (aVar != null) {
                aVar.notifyItemRangeInserted(((ArrayList) finderLiveHistoryUI.f158996r).size() - ln02.f184121d.size(), ln02.f184121d.size());
            }
            FinderLiveHistoryUI finderLiveHistoryUI2 = this.f189090e;
            finderLiveHistoryUI2.f158995q = ln02.f184122e;
            if (ln02.f184123f == 1) {
                FinderRefreshLayout finderRefreshLayout = finderLiveHistoryUI2.f158997s;
                if (finderRefreshLayout != null) {
                    finderRefreshLayout.mo26580f(true);
                }
            } else {
                FinderRefreshLayout finderRefreshLayout2 = finderLiveHistoryUI2.f158997s;
                if (finderRefreshLayout2 != null) {
                    finderRefreshLayout2.mo26600h();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65727t2(FinderLiveHistoryUI finderLiveHistoryUI, C15601d<? super C65727t2> dVar) {
        super(2, dVar);
        this.f189086f = finderLiveHistoryUI;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65727t2(this.f189086f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65727t2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f189085e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r8.f189084d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a9
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.f189084d
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008b
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006a
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r9)
            te3.kn0 r9 = new te3.kn0
            r9.<init>()
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r1 = r8.f189086f
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r7 = r6.mo90662O5()
            r9.f183964e = r7
            java.lang.String r6 = r6.mo90662O5()
            r9.f183965f = r6
            je1.h2 r6 = je1.C46523h2.f125330a
            r7 = 9550(0x254e, float:1.3382E-41)
            te3.ig0 r6 = r6.mo71859a(r7)
            r9.f183963d = r6
            r9.f183970n = r5
            int r6 = r1.f158993o
            r9.f183967h = r6
            int r6 = r1.f158994p
            r9.f183966g = r6
            pe3.b r1 = r1.f158995q
            r9.f183968i = r1
            ob0.b r9 = r9.mo89035b()
            r8.f189085e = r5
            java.lang.Object r9 = bi1.C0283d.m245c(r9, r4, r8, r5, r4)
            if (r9 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r1 = r9
            bi1.e r1 = (bi1.C0287e) r1
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r9 = r8.f189086f
            boolean r5 = r1 instanceof bi1.C0288f
            if (r5 == 0) goto L_0x008b
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x007b
            wx3.f r5 = r8.getContext()
        L_0x007b:
            vf1.t2$b r6 = new vf1.t2$b
            r6.<init>(r1, r4, r9)
            r8.f189084d = r1
            r8.f189085e = r3
            java.lang.Object r9 = a14.C53895h.m60469g(r5, r6, r8)
            if (r9 != r0) goto L_0x008b
            return r0
        L_0x008b:
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r9 = r8.f189086f
            boolean r3 = r1 instanceof bi1.C0281b
            if (r3 == 0) goto L_0x00a9
            wx3.f r3 = r1.f854a
            if (r3 != 0) goto L_0x0099
            wx3.f r3 = r8.getContext()
        L_0x0099:
            vf1.t2$a r5 = new vf1.t2$a
            r5.<init>(r1, r4, r9)
            r8.f189084d = r1
            r8.f189085e = r2
            java.lang.Object r9 = a14.C53895h.m60469g(r3, r5, r8)
            if (r9 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vf1.C65727t2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
