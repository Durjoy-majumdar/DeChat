package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.autogen.mmdata.rpt.BizBrandTLCardRecycleReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19620m0;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p151er.C58676k;
import pe3.C47465a;
import rb0.C48009v0;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C36907w;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.C22521pi1;
import te3.C48950c33;
import te3.C49141dg;
import te3.C49456fp3;
import te3.C50286ln;
import te3.C50392mf;
import te3.C50532nf;
import te3.C50671of;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t */
public final class C18355t {

    /* renamed from: a */
    public static boolean f50835a = true;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t$a */
    public static final class C18356a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C47350c f50836d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t$a$a */
        public static final class C18357a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C50671of f50837d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18357a(C50671of ofVar) {
                super(0);
                this.f50837d = ofVar;
            }

            public Object invoke() {
                C19620m0 m0Var = C19620m0.f55507a;
                LinkedList<C49456fp3> linkedList = this.f50837d.f139126d;
                C87412m.m108593f(linkedList, "resp.list");
                m0Var.mo25751b(linkedList, C19620m0.C19621a.RECYCLE_CARD_SCENE_FEEDBACK, false, new HashSet());
                return C13598b0.f38549a;
            }
        }

        public C18356a(C47350c cVar) {
            this.f50836d = cVar;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C87412m.m108594g(cVar, "<anonymous parameter 3>");
            C87412m.m108594g(yVar, "<anonymous parameter 4>");
            C50671of ofVar = (C50671of) this.f50836d.f127056b.f127083a;
            if (ofVar == null) {
                return 0;
            }
            C19620m0 m0Var = C19620m0.f55507a;
            ((MultiProcessMMKV) ((C36570n) C19620m0.f55509c).getValue()).encode("RecycleCardMaxMsgCount", ofVar.f139127e);
            C61926c.m72657B("MicroMsg.BizRecycleCardLogic", true, new C18357a(ofVar));
            return 0;
        }
    }

    /* renamed from: a */
    public static final void m18922a(int i, int i2, re4 re4, List<String> list, List<String> list2, C19623o0 o0Var) {
        int i3 = i2;
        re4 re42 = re4;
        List<String> list3 = list;
        List<String> list4 = list2;
        C87412m.m108594g(re42, "wrapper");
        C87412m.m108594g(o0Var, "bizInfo");
        switch (re42.f64521j) {
            case 101:
            case 102:
            case 103:
                C22499hb0 hb02 = re42.f64523o;
                if (hb02 != null && !Util.isNullOrNil((List) hb02.f63905g)) {
                    C13598b0 b0Var = C13598b0.f38549a;
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new C50532nf();
                    bVar.f127067b = new C50671of();
                    bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizfeedback";
                    bVar.f127069d = 4898;
                    C47350c a = bVar.mo72403a();
                    C47465a aVar = a.f127055a.f127080a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizFeedbackReq");
                    C50532nf nfVar = (C50532nf) aVar;
                    nfVar.f138568e = i;
                    LinkedList<C49141dg> linkedList = new LinkedList<>();
                    LinkedList<C22495eh> linkedList2 = re42.f64523o.f63905g;
                    C87412m.m108593f(linkedList2, "wrapper.extraInfo.BizInfo");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (C22495eh ehVar : linkedList2) {
                        C49141dg dgVar = new C49141dg();
                        dgVar.f132299d = ehVar.f63794e;
                        LinkedList<String> linkedList3 = new LinkedList<>();
                        LinkedList<C22493dh> linkedList4 = ehVar.f63800n;
                        C87412m.m108593f(linkedList4, "it.AppMsg");
                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList4, 10));
                        for (C22493dh dhVar : linkedList4) {
                            arrayList2.add(dhVar.f63755i);
                        }
                        linkedList3.addAll(arrayList2);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        dgVar.f132300e = linkedList3;
                        dgVar.f132301f = ehVar.f63795f;
                        arrayList.add(dgVar);
                        C19623o0 o0Var2 = o0Var;
                    }
                    linkedList.addAll(arrayList);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                    nfVar.f138567d = linkedList;
                    nfVar.f138569f = re42.f64521j;
                    String str = re42.f64522n;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    nfVar.f138570g = str;
                    nfVar.f138571h = re42.f64519h;
                    C22499hb0 hb03 = re42.f64523o;
                    String str3 = hb03.f63908j;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    nfVar.f138572i = str3;
                    String str4 = hb03.f63909n;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    nfVar.f138576p = str2;
                    nfVar.f138577q = re42.f64527s;
                    nfVar.f138578r = m18923b(o0Var);
                    C19620m0.f55507a.mo25752d(11);
                    Log.m105924i("MicroMsg.BizTLRecCardUtil", "doBizFeedbackReq recycleCardList size = " + nfVar.f138578r.size());
                    if (i3 == 1) {
                        C50392mf mfVar = new C50392mf();
                        mfVar.f137978e = re42.f64523o.f63905g.get(0).f63794e;
                        if (!Util.isNullOrNil((List) list2)) {
                            LinkedList<C48950c33> linkedList5 = new LinkedList<>();
                            C87412m.m108591d(list2);
                            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list4, 10));
                            for (String str5 : list2) {
                                C48950c33 c332 = new C48950c33();
                                c332.f131481d = str5;
                                C13598b0 b0Var4 = C13598b0.f38549a;
                                arrayList3.add(c332);
                            }
                            linkedList5.addAll(arrayList3);
                            C13598b0 b0Var5 = C13598b0.f38549a;
                            mfVar.f137977d = linkedList5;
                        }
                        if (!Util.isNullOrNil((List) list)) {
                            LinkedList<C48950c33> linkedList6 = new LinkedList<>();
                            C87412m.m108591d(list);
                            ArrayList arrayList4 = new ArrayList(C36907w.m41090l(list3, 10));
                            for (String str6 : list) {
                                C48950c33 c333 = new C48950c33();
                                c333.f131481d = str6;
                                C13598b0 b0Var6 = C13598b0.f38549a;
                                arrayList4.add(c333);
                            }
                            linkedList6.addAll(arrayList4);
                            C13598b0 b0Var7 = C13598b0.f38549a;
                            mfVar.f137979f = linkedList6;
                        }
                        nfVar.f138574n = mfVar;
                    } else if (i3 == 3) {
                        if (re42.f64521j == 102) {
                            C50286ln lnVar = new C50286ln();
                            if (!Util.isNullOrNil((List) list2)) {
                                LinkedList<C48950c33> linkedList7 = new LinkedList<>();
                                C87412m.m108591d(list2);
                                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(list4, 10));
                                for (String str7 : list2) {
                                    C48950c33 c334 = new C48950c33();
                                    c334.f131481d = str7;
                                    C13598b0 b0Var8 = C13598b0.f38549a;
                                    arrayList5.add(c334);
                                }
                                linkedList7.addAll(arrayList5);
                                C13598b0 b0Var9 = C13598b0.f38549a;
                                lnVar.f137521d = linkedList7;
                            }
                            if (!Util.isNullOrNil((List) list)) {
                                LinkedList<C48950c33> linkedList8 = new LinkedList<>();
                                C87412m.m108591d(list);
                                ArrayList arrayList6 = new ArrayList(C36907w.m41090l(list3, 10));
                                for (String str8 : list) {
                                    C48950c33 c335 = new C48950c33();
                                    c335.f131481d = str8;
                                    C13598b0 b0Var10 = C13598b0.f38549a;
                                    arrayList6.add(c335);
                                }
                                linkedList8.addAll(arrayList6);
                                C13598b0 b0Var11 = C13598b0.f38549a;
                                lnVar.f137523f = linkedList8;
                            }
                            nfVar.f138573j = lnVar;
                        } else {
                            C50286ln lnVar2 = new C50286ln();
                            lnVar2.f137522e = 1;
                            nfVar.f138573j = lnVar2;
                        }
                    }
                    C89144l0.m111429e(a, new C18356a(a), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static final LinkedList<C49456fp3> m18923b(C19623o0 o0Var) {
        C19620m0 m0Var = C19620m0.f55507a;
        int decodeInt = ((MultiProcessMMKV) ((C36570n) C19620m0.f55509c).getValue()).decodeInt("RecycleCardMaxMsgCount", 10);
        if (decodeInt < 2) {
            decodeInt = 2;
        }
        if (decodeInt > 50) {
            decodeInt = 50;
        }
        List<C19623o0> bO = C48009v0.Jx0().mo25799bO(620757041, decodeInt);
        LinkedList<C49456fp3> linkedList = new LinkedList<>();
        ArrayList arrayList = new ArrayList();
        for (T next : bO) {
            if (o0Var == null || ((C19623o0) next).field_msgId != o0Var.field_msgId) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19623o0 o0Var2 = (C19623o0) it.next();
            C49456fp3 fp32 = new C49456fp3();
            re4 x2 = o0Var2.mo25774x2();
            fp32.f133623d = x2 != null ? x2.f64527s : null;
            long j = o0Var2.field_msgId;
            fp32.f133624e = j;
            fp32.f133627h = String.valueOf(j);
            linkedList.add(fp32);
        }
        return linkedList;
    }

    /* renamed from: c */
    public static final boolean m18924c(int i) {
        if (!(i == 0 || i == 3 || i == 5 || i == 1001)) {
            switch (i) {
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m18925d(C22521pi1 pi12) {
        boolean z;
        boolean z2;
        boolean z3;
        C87412m.m108594g(pi12, "finderRecommendData");
        if (pi12.f64411F == 1) {
            if (!Util.isNullOrNil(pi12.f64432o)) {
                String str = pi12.f64432o;
                C87412m.m108593f(str, "finderRecommendData.finder_encrypt_user_name");
                if ((!((C58676k) C86312j.m106911c(C58676k.class)).Ha0(str)) || pi12.f64430j == 2) {
                    z3 = false;
                    z2 = z3;
                    z = false;
                }
            }
            z3 = true;
            z2 = z3;
            z = false;
        } else {
            z = Util.isNullOrNil(pi12.f64426f) || (!((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(pi12.f64426f).mo62927s3() && pi12.f64430j != 2);
            z2 = false;
        }
        return !z && !z2;
    }

    /* renamed from: e */
    public static final void m18926e(C22521pi1 pi12, int i) {
        C87412m.m108594g(pi12, "finderRecommendData");
        BizBrandTLCardRecycleReportStruct bizBrandTLCardRecycleReportStruct = new BizBrandTLCardRecycleReportStruct();
        long j = 1;
        bizBrandTLCardRecycleReportStruct.f48188d = 1;
        bizBrandTLCardRecycleReportStruct.f48189e = 104;
        bizBrandTLCardRecycleReportStruct.f48190f = bizBrandTLCardRecycleReportStruct.mo86045b("FinderId", pi12.f64431n, true);
        bizBrandTLCardRecycleReportStruct.f48191g = bizBrandTLCardRecycleReportStruct.mo86045b("FeedId", pi12.f64435r, true);
        if (pi12.f64412G == 1) {
            j = 0;
        }
        bizBrandTLCardRecycleReportStruct.f48192h = j;
        bizBrandTLCardRecycleReportStruct.f48193i = (long) pi12.f64411F;
        bizBrandTLCardRecycleReportStruct.f48194j = bizBrandTLCardRecycleReportStruct.mo86045b("SessionId", String.valueOf(i), true);
        bizBrandTLCardRecycleReportStruct.mo86054n();
    }

    /* renamed from: f */
    public static final void m18927f(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        o0Var.mo25762J2(o0Var.f55530o1);
        C48009v0.Jx0().P50(o0Var, false);
    }
}
