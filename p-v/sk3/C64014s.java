package sk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53934p0;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f14.C58901s;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import lv1.C99681n;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAllResultUIC$dealMatchInfoToResultBeanToNotify$1", mo125469f = "FTSMultiItemAllResultUIC.kt", mo125470l = {330}, mo125471m = "invokeSuspend")
/* renamed from: sk3.s */
public final class C64014s extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181478d;

    /* renamed from: e */
    public /* synthetic */ Object f181479e;

    /* renamed from: f */
    public final /* synthetic */ C64024v f181480f;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemAllResultUIC$dealMatchInfoToResultBeanToNotify$1$2", mo125469f = "FTSMultiItemAllResultUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.s$a */
    public static final class C64015a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64024v f181481d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C72963f4> f181482e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<C72963f4> f181483f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<C72963f4> f181484g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<C72963f4> f181485h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList<C72963f4> f181486i;

        /* renamed from: j */
        public final /* synthetic */ ArrayList<C72963f4> f181487j;

        /* renamed from: n */
        public final /* synthetic */ ArrayList<Long> f181488n;

        /* renamed from: o */
        public final /* synthetic */ ArrayList<Long> f181489o;

        /* renamed from: p */
        public final /* synthetic */ ArrayList<Long> f181490p;

        /* renamed from: q */
        public final /* synthetic */ ArrayList<Long> f181491q;

        /* renamed from: r */
        public final /* synthetic */ ArrayList<Long> f181492r;

        /* renamed from: s */
        public final /* synthetic */ ArrayList<Long> f181493s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64015a(C64024v vVar, ArrayList<C72963f4> arrayList, ArrayList<C72963f4> arrayList2, ArrayList<C72963f4> arrayList3, ArrayList<C72963f4> arrayList4, ArrayList<C72963f4> arrayList5, ArrayList<C72963f4> arrayList6, ArrayList<Long> arrayList7, ArrayList<Long> arrayList8, ArrayList<Long> arrayList9, ArrayList<Long> arrayList10, ArrayList<Long> arrayList11, ArrayList<Long> arrayList12, C15601d<? super C64015a> dVar) {
            super(2, dVar);
            this.f181481d = vVar;
            this.f181482e = arrayList;
            this.f181483f = arrayList2;
            this.f181484g = arrayList3;
            this.f181485h = arrayList4;
            this.f181486i = arrayList5;
            this.f181487j = arrayList6;
            this.f181488n = arrayList7;
            this.f181489o = arrayList8;
            this.f181490p = arrayList9;
            this.f181491q = arrayList10;
            this.f181492r = arrayList11;
            this.f181493s = arrayList12;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64015a(this.f181481d, this.f181482e, this.f181483f, this.f181484g, this.f181485h, this.f181486i, this.f181487j, this.f181488n, this.f181489o, this.f181490p, this.f181491q, this.f181492r, this.f181493s, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64015a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C39818r rVar = C39818r.f106831a;
            C64034y yVar = (C64034y) rVar.mo62444c(this.f181481d.getActivity()).mo75002a(C64034y.class);
            ArrayList<C72963f4> arrayList = this.f181482e;
            yVar.getClass();
            C87412m.m108594g(arrayList, "matchInfoList");
            Log.m105924i("MicroMsg.FTSMultiItemFileUIC", "updateMatchInfo >> " + arrayList.size());
            yVar.f181422n = C0317e.launch$default(yVar, (C66212f) null, (C53934p0) null, new C64037z(yVar, arrayList, (C15601d<? super C64037z>) null), 3, (Object) null);
            C63971c0 c0Var = (C63971c0) rVar.mo62444c(this.f181481d.getActivity()).mo75002a(C63971c0.class);
            ArrayList<C72963f4> arrayList2 = this.f181483f;
            c0Var.getClass();
            C87412m.m108594g(arrayList2, "matchInfoList");
            Log.m105924i("MicroMsg.FTSMultiItemMusicUIC", "updateMatchInfo: " + arrayList2.size());
            c0Var.f181422n = C0317e.launch$default(c0Var, (C66212f) null, (C53934p0) null, new C63974d0(c0Var, arrayList2, (C15601d<? super C63974d0>) null), 3, (Object) null);
            C77723g0 g0Var = (C77723g0) rVar.mo62444c(this.f181481d.getActivity()).mo75002a(C77723g0.class);
            ArrayList<C72963f4> arrayList3 = this.f181484g;
            g0Var.getClass();
            C87412m.m108594g(arrayList3, "matchInfoList");
            Log.m105924i("MicroMsg. FTSMultiItemUrlUIC", "updateMatchInfo >> " + arrayList3.size());
            g0Var.f181422n = C0317e.launch$default(g0Var, (C66212f) null, (C53934p0) null, new C63982h0(g0Var, arrayList3, (C15601d<? super C63982h0>) null), 3, (Object) null);
            C64028w wVar = (C64028w) rVar.mo62444c(this.f181481d.getActivity()).mo75002a(C64028w.class);
            ArrayList<C72963f4> arrayList4 = this.f181485h;
            wVar.getClass();
            C87412m.m108594g(arrayList4, "matchInfoList");
            Log.m105924i("FTSMultiItemAppBrandUIC", "updateMatchInfo >> " + arrayList4.size());
            wVar.f181422n = C0317e.launch$default(wVar, (C66212f) null, (C53934p0) null, new C64032x(wVar, arrayList4, (C15601d<? super C64032x>) null), 3, (Object) null);
            C63979f0 f0Var = (C63979f0) rVar.mo62444c(this.f181481d.getActivity()).mo75002a(C63979f0.class);
            ArrayList<C72963f4> arrayList5 = this.f181486i;
            f0Var.getClass();
            C87412m.m108594g(arrayList5, "matchInfoList");
            Log.m105924i("MicroMsg.FTSMultiItemPayUIC", "updateMatchInfo >> " + arrayList5.size());
            f0Var.f181422n = C0317e.launch$default(f0Var, (C66212f) null, (C53934p0) null, new C63976e0(f0Var, arrayList5, (C15601d<? super C63976e0>) null), 3, (Object) null);
            C63970b0 b0Var = (C63970b0) rVar.mo62444c(this.f181481d.getActivity()).mo75002a(C63970b0.class);
            ArrayList<C72963f4> arrayList6 = this.f181487j;
            b0Var.getClass();
            C87412m.m108594g(arrayList6, "matchInfoList");
            Log.m105924i("MicroMsg.FTSMultiItemFinderFeedUIC", "updateMatchInfo >> " + arrayList6.size());
            b0Var.f181422n = C0317e.launch$default(b0Var, (C66212f) null, (C53934p0) null, new C63967a0(arrayList6, b0Var, (C15601d<? super C63967a0>) null), 3, (Object) null);
            this.f181481d.f181513G.put(new Integer(2), this.f181488n);
            this.f181481d.f181513G.put(new Integer(5), this.f181489o);
            this.f181481d.f181513G.put(new Integer(3), this.f181490p);
            this.f181481d.f181513G.put(new Integer(6), this.f181491q);
            this.f181481d.f181513G.put(new Integer(4), this.f181492r);
            this.f181481d.f181513G.put(new Integer(0), this.f181493s);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64014s(C64024v vVar, C15601d<? super C64014s> dVar) {
        super(2, dVar);
        this.f181480f = vVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C64014s sVar = new C64014s(this.f181480f, dVar);
        sVar.f181479e = obj;
        return sVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64014s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        Class cls;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C68070l.C68072b bVar;
        Class cls2 = C63979f0.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f181478d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f181479e;
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList7 = new ArrayList(this.f181480f.f181519i);
            String str2 = "MicroMsg.FTSMultiItemAllResultUIC";
            Log.m105924i(str2, "dealMatchInfoToResultBeanToNotify >> itemSize: " + this.f181480f.f181520j.size() + ", matchInfoSize: " + arrayList7.size());
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            C15911a aVar2 = aVar;
            ArrayList arrayList16 = new ArrayList();
            long j = currentTimeMillis;
            ArrayList arrayList17 = new ArrayList();
            ArrayList arrayList18 = new ArrayList();
            ArrayList arrayList19 = arrayList13;
            ArrayList arrayList20 = new ArrayList();
            ArrayList arrayList21 = new ArrayList();
            C64024v vVar = this.f181480f;
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                Iterator it4 = it;
                C99681n nVar = (C99681n) it.next();
                if (!C53930o0.m60560g(n0Var)) {
                    Log.m105924i(str2, "dealMatchInfoToResultBean >> job is cancel");
                    return C13598b0.f38549a;
                }
                C0000n0 n0Var2 = n0Var;
                Object obj2 = nVar.f292161o;
                boolean z = false;
                if (obj2 instanceof Integer) {
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    i = ((Integer) obj2).intValue();
                } else {
                    i = 0;
                }
                if (i == 1) {
                    arrayList5 = arrayList12;
                    str = str2;
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(nVar.f292150d);
                    switch (nVar.f292149c) {
                        case 41:
                            arrayList14.add(new Long(b002.getMsgId()));
                            break;
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 52:
                        case 53:
                            bVar = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                            break;
                    }
                    bVar = null;
                    if (bVar != null) {
                        C39818r rVar = C39818r.f106831a;
                        arrayList2 = arrayList14;
                        int i3 = bVar.f195582i;
                        ((C64034y) rVar.mo62444c(vVar.getActivity()).mo75002a(C64034y.class)).getClass();
                        if (i3 == 6) {
                            arrayList8.add(b002);
                            arrayList = arrayList8;
                            arrayList15.add(new Long(b002.getMsgId()));
                        } else {
                            arrayList = arrayList8;
                        }
                        int i4 = bVar.f195582i;
                        ((C63971c0) rVar.mo62444c(vVar.getActivity()).mo75002a(C63971c0.class)).getClass();
                        if (i4 == 3 || i4 == 76) {
                            arrayList9.add(b002);
                            arrayList16.add(new Long(b002.getMsgId()));
                        }
                        if (((C77723g0) rVar.mo62444c(vVar.getActivity()).mo75002a(C77723g0.class)).mo107868j3(bVar.f195582i)) {
                            arrayList10.add(b002);
                            arrayList17.add(new Long(b002.getMsgId()));
                        }
                        int i5 = bVar.f195582i;
                        ((C64028w) rVar.mo62444c(vVar.getActivity()).mo75002a(C64028w.class)).getClass();
                        if (36 == i5 || 33 == i5) {
                            arrayList11.add(b002);
                            arrayList18.add(new Long(b002.getMsgId()));
                        }
                        if (((C63979f0) rVar.mo62444c(vVar.getActivity()).mo75002a(cls2)).mo88754m3(b002.getType()) || ((C63979f0) rVar.mo62444c(vVar.getActivity()).mo75002a(cls2)).mo88754m3(Util.safeParseInt(bVar.f195604n1))) {
                            arrayList5.add(b002);
                            arrayList3 = arrayList20;
                            arrayList3.add(new Long(b002.getMsgId()));
                        } else {
                            arrayList3 = arrayList20;
                        }
                        int i6 = bVar.f195582i;
                        ((C63970b0) rVar.mo62444c(vVar.getActivity()).mo75002a(C63970b0.class)).getClass();
                        if (i6 == 51) {
                            z = true;
                        }
                        if (z) {
                            arrayList4 = arrayList19;
                            arrayList4.add(b002);
                            cls = cls2;
                            Long l = new Long(b002.getMsgId());
                            arrayList6 = arrayList21;
                            arrayList6.add(l);
                        } else {
                            arrayList4 = arrayList19;
                            cls = cls2;
                        }
                    } else {
                        arrayList4 = arrayList19;
                        cls = cls2;
                        arrayList2 = arrayList14;
                        arrayList = arrayList8;
                        arrayList3 = arrayList20;
                    }
                    arrayList6 = arrayList21;
                } else {
                    arrayList4 = arrayList19;
                    arrayList5 = arrayList12;
                    str = str2;
                    arrayList2 = arrayList14;
                    arrayList = arrayList8;
                    arrayList3 = arrayList20;
                    arrayList6 = arrayList21;
                    cls = cls2;
                }
                arrayList21 = arrayList6;
                arrayList19 = arrayList4;
                cls2 = cls;
                arrayList20 = arrayList3;
                it = it4;
                str2 = str;
                arrayList14 = arrayList2;
                arrayList8 = arrayList;
                arrayList12 = arrayList5;
                n0Var = n0Var2;
            }
            ArrayList arrayList22 = arrayList8;
            Log.m105924i(str2, "dealMatchInfoToResultBeanToNotify >> cost " + (System.currentTimeMillis() - j));
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C64015a aVar3 = new C64015a(this.f181480f, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList19, arrayList15, arrayList20, arrayList17, arrayList18, arrayList16, arrayList14, (C15601d<? super C64015a>) null);
            this.f181478d = 1;
            C15911a aVar4 = aVar2;
            if (C53895h.m60469g(k2Var, aVar3, this) == aVar4) {
                return aVar4;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
