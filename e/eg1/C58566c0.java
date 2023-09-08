package eg1;

import a14.C0000n0;
import al1.C54127h;
import android.util.Pair;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import p565ir.C60606n;
import rx3.C13598b0;
import sx3.C36907w;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$executeInsertHistories$1", mo125469f = "FinderLiveViewCallback.kt", mo125470l = {886, 887}, mo125471m = "invokeSuspend")
/* renamed from: eg1.c0 */
public final class C58566c0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f167643d;

    /* renamed from: e */
    public int f167644e;

    /* renamed from: f */
    public /* synthetic */ Object f167645f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveViewCallback f167646g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.FinderLiveViewCallback$executeInsertHistories$1$finallyList$1", mo125469f = "FinderLiveViewCallback.kt", mo125470l = {888}, mo125471m = "invokeSuspend")
    /* renamed from: eg1.c0$a */
    public static final class C58567a extends C91594j implements C32227p<C0000n0, C15601d<? super List<C54127h>>, Object> {

        /* renamed from: d */
        public int f167647d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveViewCallback f167648e;

        /* renamed from: f */
        public final /* synthetic */ List<C54127h> f167649f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58567a(FinderLiveViewCallback finderLiveViewCallback, List<C54127h> list, C15601d<? super C58567a> dVar) {
            super(2, dVar);
            this.f167648e = finderLiveViewCallback;
            this.f167649f = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C58567a(this.f167648e, this.f167649f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58567a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f167647d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinderLiveViewCallback finderLiveViewCallback = this.f167648e;
                List<C54127h> list = this.f167649f;
                this.f167647d = 1;
                finderLiveViewCallback.getClass();
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (C54127h hVar2 : list) {
                    Long l = new Long(hVar2.f151977d.f157075s);
                    String str = hVar2.f151977d.f157080x;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new Pair(l, str));
                }
                nVar.mo85085sN(arrayList, new C58568d0(hVar), finderLiveViewCallback.f159210d.getContext());
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("#executeInsertHistories statusResult=");
            StringBuilder sb4 = new StringBuilder("{");
            for (Number longValue : map.keySet()) {
                long longValue2 = longValue.longValue();
                sb4.append(longValue2);
                sb4.append("=");
                sb4.append(map.get(Long.valueOf(longValue2)));
                sb4.append(",");
            }
            sb4.append("}");
            String sb5 = sb4.toString();
            C87412m.m108593f(sb5, "mapAsString.toString()");
            sb.append(sb5);
            Log.m105924i("Finder.FinderLiveViewCallback", sb.toString());
            List<C54127h> list2 = this.f167649f;
            ArrayList arrayList2 = new ArrayList();
            for (C54127h next : list2) {
                Integer num = (Integer) map.get(Long.valueOf(next.f151977d.f157075s));
                if (num != null) {
                    if (!(num.intValue() != 2)) {
                        num = null;
                    }
                    if (num != null) {
                        num.intValue();
                        arrayList2.add(next);
                    }
                }
            }
            return arrayList2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58566c0(FinderLiveViewCallback finderLiveViewCallback, C15601d<? super C58566c0> dVar) {
        super(2, dVar);
        this.f167646g = finderLiveViewCallback;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C58566c0 c0Var = new C58566c0(this.f167646g, dVar);
        c0Var.f167645f = obj;
        return c0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C58566c0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f167644e
            r3 = 2
            r4 = 0
            java.lang.String r5 = "Finder.FinderLiveViewCallback"
            r6 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 == r6) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            java.lang.Object r1 = r0.f167645f
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r19)
            r3 = r19
            goto L_0x007f
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            java.lang.Object r2 = r0.f167643d
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r0.f167645f
            a14.n0 r7 = (a14.C0000n0) r7
            kotlin.ResultKt.throwOnFailure(r19)
            r17 = r7
            r7 = r2
            r2 = r17
            goto L_0x0068
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.f167645f
            a14.n0 r2 = (a14.C0000n0) r2
            al1.p r7 = al1.C54134p.f152045a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashMap<java.lang.Long, al1.h> r8 = al1.C54134p.f152046b
            java.util.Collection r8 = r8.values()
            r7.addAll(r8)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0059
            java.lang.String r1 = "#executeInsertHistories historiesLive is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0059:
            r8 = 1000(0x3e8, double:4.94E-321)
            r0.f167645f = r2
            r0.f167643d = r7
            r0.f167644e = r6
            java.lang.Object r8 = a14.C53965x0.m60607b(r8, r0)
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            a14.h0 r8 = a14.C53872d1.f151119c
            eg1.c0$a r9 = new eg1.c0$a
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r10 = r0.f167646g
            r9.<init>(r10, r7, r4)
            r0.f167645f = r2
            r0.f167643d = r4
            r0.f167644e = r3
            java.lang.Object r3 = a14.C53895h.m60469g(r8, r9, r0)
            if (r3 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r1 = r2
        L_0x007f:
            java.util.List r3 = (java.util.List) r3
            boolean r1 = a14.C53930o0.m60560g(r1)
            if (r1 != 0) goto L_0x008a
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x008a:
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r2 = r0.f167646g
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.f159210d
            android.content.Context r2 = r2.getContext()
            java.lang.String r7 = "rfLayout.context"
            gy3.C87412m.m108593f(r2, r7)
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<dk1.g> r2 = dk1.C58312g.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            dk1.g r1 = (dk1.C58312g) r1
            boolean r1 = r1.f166967e
            if (r1 == 0) goto L_0x00b1
            java.lang.String r1 = "#executeInsertHistories inSideBarStatus, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x00b1:
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r1 = r0.f167646g
            eg1.u r1 = r1.f159214h
            if (r1 == 0) goto L_0x0179
            al1.i r1 = r1.mo77493G0()
            if (r1 == 0) goto L_0x0179
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r2 = r0.f167646g
            java.lang.String r7 = "histories"
            gy3.C87412m.m108594g(r3, r7)
            java.util.ArrayList<al1.h> r7 = r1.f151990e
            java.util.List r7 = r1.mo74926d(r7, r3)
            java.util.ArrayList<al1.h> r8 = r1.f151990e
            r9 = 0
            r8.addAll(r9, r7)
            java.util.ArrayList<al1.h> r8 = r1.f151989d
            r8.clear()
            java.util.ArrayList<al1.h> r8 = r1.f151989d
            r8.addAll(r3)
            java.lang.String r8 = r1.f151986a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "#appendHistoriesLiveData histories="
            r10.append(r11)
            int r11 = r3.size()
            r10.append(r11)
            java.lang.String r11 = ", after filter size "
            r10.append(r11)
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r11 = r7.size()
            r10.append(r11)
            java.lang.String r11 = ", now liveDataList.size="
            r10.append(r11)
            java.util.ArrayList<al1.h> r11 = r1.f151990e
            int r11 = r11.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            int r7 = r7.size()
            r2.f159224u = r7
            if (r7 <= 0) goto L_0x0179
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r8 = r2.f159220q
            androidx.recyclerview.widget.RecyclerView$e r8 = r8.getAdapter()
            if (r8 == 0) goto L_0x0123
            r8.notifyItemRangeInserted(r9, r7)
        L_0x0123:
            java.util.ArrayList<al1.h> r1 = r1.f151990e
            int r1 = r1.size()
            r2.mo77516H0(r1, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#executeInsertHistories append "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " done"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            int r1 = r3.size()
            java.util.Iterator r2 = r3.iterator()
        L_0x014d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0179
            java.lang.Object r3 = r2.next()
            int r5 = r9 + 1
            if (r9 < 0) goto L_0x0175
            al1.h r3 = (al1.C54127h) r3
            java.lang.Class<ak1.w> r6 = ak1.C54116w.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            r10 = r6
            ak1.w r10 = (ak1.C54116w) r10
            ak1.f0$s r11 = ak1.C54067f0.C54082s.AppendToHistory
            com.tencent.mm.live.api.LiveConfig r3 = r3.f151977d
            long r12 = r3.f157064e
            long r14 = r3.f157075s
            int r16 = r1 - r9
            r10.jy0(r11, r12, r14, r16)
            r9 = r5
            goto L_0x014d
        L_0x0175:
            sx3.C64197v.m75542k()
            throw r4
        L_0x0179:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C58566c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
