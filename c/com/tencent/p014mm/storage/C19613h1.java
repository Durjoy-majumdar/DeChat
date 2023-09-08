package com.tencent.p014mm.storage;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19467w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86312j;
import e00.C20484c0;
import eb0.C31519v2;
import eb0.C75597w2;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kj2.C117407d;
import ky3.C88334c;
import ky3.C88336d;
import rb0.C48009v0;
import sx3.C64197v;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.C22503jo3;
import te3.C22508lo3;
import te3.C22521pi1;
import te3.C22533wo3;
import te3.C64422hh;
import te3.C64522lg;
import te3.C64818wx2;
import te3.C64846y23;
import te3.me4;
import te3.ne4;
import te3.oe4;
import te3.re4;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.storage.h1 */
public final class C19613h1 {

    /* renamed from: a */
    public static final C88334c f55490a = C88336d.m110136a(Util.currentTicks());

    /* renamed from: a */
    public static final boolean m21028a(re4 re4) {
        C87412m.m108594g(re4, "<this>");
        String str = null;
        if (m21038k(re4.f64521j)) {
            C19625p0 Jx0 = C48009v0.Jx0();
            C22499hb0 hb02 = re4.f64523o;
            if (hb02 != null) {
                str = hb02.f63908j;
            }
            if (Jx0.mo25781CP(str) != null) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] duplicateCardId");
                C115669n.INSTANCE.idkeyStat(1130, 142, 1, false);
                return true;
            }
        } else {
            if (re4.f64521j == 1001) {
                C19625p0 Jx02 = C48009v0.Jx0();
                C22503jo3 jo32 = re4.f64525q;
                if (jo32 != null) {
                    str = jo32.f64075j;
                }
                if (Jx02.mo25781CP(str) != null) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] canvas duplicateCardId");
                    C115669n.INSTANCE.idkeyStat(1130, 143, 1, false);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final int m21029b(C19623o0 o0Var) {
        int i;
        C87412m.m108594g(o0Var, "<this>");
        boolean z = true;
        if (!o0Var.mo25754B2()) {
            if (o0Var.mo25758F2()) {
                re4 x2 = o0Var.mo25774x2();
                if (x2 == null || (i = x2.f64521j) == 0 || i == 3 || i == 5) {
                    return 1;
                }
                if (i == 1001) {
                    return 5;
                }
                switch (i) {
                    case 101:
                    case 102:
                    case 104:
                    case 105:
                        return 3;
                    case 103:
                        return 7;
                    default:
                        return 1;
                }
            } else if (o0Var.mo25753A2()) {
                return 4;
            } else {
                if (o0Var.mo25759G2()) {
                    C22508lo3 lo32 = o0Var.f55539x1;
                    if (lo32 == null || lo32.f64173f != 2002) {
                        z = false;
                    }
                    return z ? 10 : 9;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static final void m21030c(re4 re4, Map<String, String> map) {
        String str;
        C87412m.m108594g(re4, "wrapper");
        C87412m.m108594g(map, "values");
        C19611g1 g1Var = new C19611g1(re4, map);
        switch (re4.f64521j) {
            case 101:
                g1Var.invoke();
                return;
            case 102:
            case 103:
            case 104:
            case 105:
                g1Var.invoke();
                C22499hb0 hb02 = re4.f64523o;
                int i = 0;
                while (true) {
                    str = "";
                    if (i < 21) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(".sysmsg.BizAccountRecommend.NegativeFeedbackReason");
                        sb.append(i == 0 ? str : Integer.valueOf(i));
                        String str2 = map.get(sb.toString());
                        if (!Util.isNullOrNil(str2)) {
                            hb02.f63910o.add(str2);
                            i++;
                        }
                    }
                }
                hb02.f63911p = Util.getInt(map.get(".sysmsg.BizAccountRecommend.ShowNegativeFeedbackReason"), 0);
                String str3 = map.get(".sysmsg.BizAccountRecommend.AggregationUrl");
                if (str3 == null) {
                    str3 = str;
                }
                hb02.f63912q = str3;
                String str4 = map.get(".sysmsg.BizAccountRecommend.AggregationTitle");
                if (str4 != null) {
                    str = str4;
                }
                hb02.f63913r = str;
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public static final re4 m21031d(Map<String, String> map) {
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "values");
        String str = map2.get(".sysmsg.BizRecommendExpt.Title");
        int i = Util.getInt(map2.get(".sysmsg.BizRecommendExpt.Pos"), -1);
        int i2 = Util.getInt(map2.get(".sysmsg.BizRecommendExpt.Weight"), -1);
        long j = Util.getLong(map2.get(".sysmsg.BizRecommendExpt.RecID"), 0);
        int i3 = Util.getInt(map2.get(".sysmsg.BizRecommendExpt.RedDotFlag"), -1);
        String str2 = map2.get(".sysmsg.BizRecommendExpt.BusinessId");
        String str3 = map2.get(".sysmsg.BizRecommendExpt.CardID");
        String str4 = map2.get(".sysmsg.BizRecommendExpt.Data");
        String str5 = map2.get(".sysmsg.BizRecommendExpt.RecSummary");
        String str6 = map2.get(".sysmsg.BizRecommendExpt.AppId");
        String str7 = map2.get(".sysmsg.BizRecommendExpt.TemplatePathType");
        int i4 = Util.getInt(map2.get(".sysmsg.BizRecommendExpt.FailureBehavior"), 0);
        int i5 = Util.getInt(map2.get(".sysmsg.BizRecommendExpt.UseServerTime"), 0);
        String str8 = map2.get(".sysmsg.BizRecommendExpt.ExtraData");
        int i6 = i3;
        int i7 = Util.getInt(map2.get(".sysmsg.BizRecommendExpt.PackageVersion"), 0);
        if (i >= 0 || i2 >= 0) {
            re4 re4 = new re4();
            re4.f64517f = i;
            re4.f64518g = i2;
            re4.f64519h = j;
            String str9 = str8;
            C22503jo3 jo32 = new C22503jo3();
            jo32.f64069d = str;
            jo32.f64070e = i;
            jo32.f64071f = i2;
            jo32.f64072g = j;
            jo32.f64082t = i7;
            jo32.f64074i = str2;
            jo32.f64075j = str3;
            jo32.f64076n = str4;
            jo32.f64077o = str5;
            jo32.f64078p = str6;
            jo32.f64081s = str7;
            re4.f64525q = jo32;
            re4.f64530v = i4;
            re4.f64521j = 1001;
            re4.f64524p = i5;
            re4.f64527s = str9;
            re4.f64528t = i6;
            return re4;
        }
        Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] getFromCanvasXml pos = " + i + ", weight = " + i2);
        return null;
    }

    /* renamed from: e */
    public static final String[] m21032e(String str) {
        C87412m.m108594g(str, "<this>");
        String str2 = "";
        String[] strArr = {str2, str2};
        if (!Util.isNullOrNil(str)) {
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("mid");
                if (queryParameter == null) {
                    queryParameter = str2;
                }
                strArr[0] = queryParameter;
                String queryParameter2 = parse.getQueryParameter("idx");
                if (queryParameter2 != null) {
                    str2 = queryParameter2;
                }
                strArr[1] = str2;
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    /* renamed from: f */
    public static final LinkedList<C22493dh> m21033f(C19623o0 o0Var) {
        LinkedList<ne4> linkedList;
        re4 x2;
        C22499hb0 hb02;
        LinkedList<C22495eh> linkedList2;
        LinkedList<C22493dh> linkedList3;
        C87412m.m108594g(o0Var, "info");
        LinkedList<C22493dh> linkedList4 = new LinkedList<>();
        if (o0Var.mo25758F2() && o0Var.mo25774x2() != null) {
            int i = o0Var.mo25774x2().f64521j;
            if (i == 3 || i == 5 || i == 0) {
                me4 w2 = o0Var.mo25773w2();
                if (!(w2 == null || (linkedList = w2.f64242g) == null)) {
                    for (ne4 ne4 : linkedList) {
                        C22493dh dhVar = new C22493dh();
                        dhVar.f63755i = ne4.f64284g;
                        dhVar.f63751e = ne4.f64282e;
                        linkedList4.add(dhVar);
                    }
                }
            } else if (!(!m21038k(i) || (x2 = o0Var.mo25774x2()) == null || (hb02 = x2.f64523o) == null || (linkedList2 = hb02.f63905g) == null)) {
                for (C22495eh ehVar : linkedList2) {
                    if (!(ehVar == null || (linkedList3 = ehVar.f63800n) == null)) {
                        for (C22493dh add : linkedList3) {
                            linkedList4.add(add);
                        }
                    }
                }
            }
        }
        return linkedList4;
    }

    /* renamed from: g */
    public static final C19623o0 m21034g(Map<String, String> map, re4 re4, C19467w0 w0Var) {
        re4 re42 = re4;
        C19467w0 w0Var2 = w0Var;
        C87412m.m108594g(map, "values");
        C87412m.m108594g(re42, "wrapper");
        C87412m.m108594g(w0Var2, "insertRecCardExtData");
        String str = null;
        if (!m21043p(re42, (C19623o0) null)) {
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] insertCanvasCardImmediately illegal");
            C19641z0.f55645a.mo25867j(124);
            return null;
        } else if (!w0Var2.f55004d && re42.f64530v == 0) {
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] insertCanvasCardImmediately on ResortFail failureBehavior " + re42.f64530v);
            C19641z0.f55645a.mo25867j(123);
            return null;
        } else if (!m21039l(re42.f64525q.f64082t, true)) {
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] insertCanvasCardImmediately pkg version invalid");
            C19641z0.f55645a.mo25867j(124);
            return null;
        } else if (m21028a(re4)) {
            return null;
        } else {
            C19623o0 o0Var = new C19623o0();
            o0Var.field_msgId = C48009v0.Jx0().mo25782CZ();
            o0Var.field_msgSvrId = 0;
            o0Var.field_type = 620757041;
            o0Var.field_talker = "";
            o0Var.field_talkerId = 0;
            o0Var.mo183585l2(1);
            o0Var.field_status = 3;
            m21050w(o0Var, re42);
            C19619j0 j0Var = C19619j0.f55506a;
            C22503jo3 jo32 = re42.f64525q;
            if (!j0Var.mo25749a(map, re4, w0Var, o0Var, true, jo32.f64071f, jo32.f64070e)) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] insertCanvasCardImmediately fail");
                return null;
            }
            boolean v102 = C48009v0.Jx0().v10(o0Var, true);
            StringBuilder sb = new StringBuilder();
            sb.append("[TRACE_BIZRECCARD] insertCanvasCardImmediately result = ");
            sb.append(v102);
            sb.append(", title = ");
            sb.append(re42.f64525q.f64069d);
            sb.append(" groupId=");
            sb.append(o0Var.mo25767q2());
            sb.append(", pos = ");
            sb.append(re42.f64525q.f64070e);
            sb.append(" weight=");
            sb.append(re42.f64525q.f64071f);
            sb.append(',');
            sb.append(o0Var.mo25776z2());
            sb.append(" msgId=");
            sb.append(o0Var.field_msgId);
            sb.append(" isInTimeLine=");
            sb.append(w0Var2.f55002b);
            sb.append(", failureBehavior ");
            sb.append(re42.f64530v);
            sb.append(" cardId=");
            C22503jo3 jo33 = re42.f64525q;
            sb.append(jo33 != null ? jo33.f64075j : null);
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", sb.toString());
            if (v102) {
                C19627t tVar = C19627t.f55586a;
                if (C19627t.f55606u) {
                    ((C20484c0) C86312j.m106911c(C20484c0.class)).zb0();
                }
                tVar.mo25850x(o0Var);
                C19641z0.f55645a.mo25866i(0, (C64522lg) null, 0);
            }
            C117407d.INSTANCE.mo182089r(1454, 82, 1);
            C30798z zVar = C30798z.f82801a;
            int i = re42.f64517f;
            int i2 = re42.f64524p;
            int i3 = re42.f64521j;
            long j = re42.f64519h;
            C22503jo3 jo34 = re42.f64525q;
            String str2 = jo34 != null ? jo34.f64075j : null;
            C22499hb0 hb02 = re42.f64523o;
            if (hb02 != null) {
                str = hb02.f63909n;
            }
            C19623o0 o0Var2 = o0Var;
            zVar.mo57722a(o0Var, 1, i, i2, 5, i3, j, str2, str, re42.f64527s);
            return o0Var2;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ C19623o0 m21035h(Map map, re4 re4, C19467w0 w0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            w0Var = new C19467w0(0, false, (String) null, false, (String) null, 31, (C8480h) null);
        }
        return m21034g(map, re4, w0Var);
    }

    /* renamed from: i */
    public static final boolean m21036i(Map<String, String> map) {
        C87412m.m108594g(map, "values");
        return !Util.isNullOrNil(map.get(".sysmsg.BizRecommendExpt.Data"));
    }

    /* renamed from: j */
    public static final boolean m21037j(String str) {
        C87412m.m108594g(str, "userName");
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null && z1Var.mo62927s3()) {
            return true;
        }
        if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
            return false;
        }
        C31519v2.m39436a().mo55988e(str, "", (C75597w2.C31525a) null);
        return false;
    }

    /* renamed from: k */
    public static final boolean m21038k(int i) {
        return i == 101 || i == 102 || i == 103 || i == 104 || i == 105;
    }

    /* renamed from: l */
    public static final boolean m21039l(int i, boolean z) {
        int U2 = ((C45696d) C86709a0.m107533q(C45696d.class)).mo70977U2();
        boolean z2 = U2 >= i;
        if (z || !z2) {
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "isPkgVersionValid bizPkgVersion=" + U2 + ", packageVersion=" + i + " valid=" + z2);
        }
        return z2;
    }

    /* renamed from: m */
    public static final boolean m21040m(C22508lo3 lo32) {
        C87412m.m108594g(lo32, "<this>");
        C22533wo3 wo32 = lo32.f64172e.get(0);
        C87412m.m108593f(wo32, "this.RecommendItem[0]");
        if (!(wo32.f64695j == 0)) {
            C22533wo3 wo33 = lo32.f64172e.get(0);
            C87412m.m108593f(wo33, "this.RecommendItem[0]");
            return wo33.f64695j == 3;
        }
    }

    /* renamed from: n */
    public static final boolean m21041n(C22533wo3 wo32) {
        C87412m.m108594g(wo32, "<this>");
        return wo32.f64695j == 2;
    }

    /* renamed from: o */
    public static final boolean m21042o(re4 re4) {
        C87412m.m108594g(re4, "wrapper");
        int i = re4.f64521j;
        C64818wx2 wx22 = re4.f64532x;
        return i == 105 && (wx22 != null && wx22.f186234e == 1);
    }

    /* renamed from: p */
    public static final boolean m21043p(re4 re4, C19623o0 o0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C87412m.m108594g(re4, "wrapper");
        int i = re4.f64521j;
        if (i == 104) {
            C64846y23 y232 = re4.f64529u;
            if (y232 == null || y232.f186438d == 0) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD_NATIVE_FINDER] nativeFinderFeeds.sub_type == 0");
                return false;
            } else if (y232.f186439e.size() == 0) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD_NATIVE_FINDER] feedDataList.size == 0");
                return false;
            } else if (re4.f64523o.f63906h != 1) {
                return true;
            } else {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " bizLegal illegal");
                if (o0Var != null) {
                    C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
                }
                return false;
            }
        } else if (i == 1001) {
            C22503jo3 jo32 = re4.f64525q;
            if (jo32 == null) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] isTLRecCardWrapperLegal exptInfo = null");
                return false;
            } else if (Util.isNullOrNil(jo32.f64076n)) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] isTLRecCardWrapperLegal exptInfo.data = null");
                return false;
            } else if (!Util.isNullOrNil(re4.f64525q.f64078p) && !Util.isNullOrNil(re4.f64525q.f64081s)) {
                return true;
            } else {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] isTLRecCardWrapperLegal appid or path error, appId = " + re4.f64525q.f64078p + ", path = " + re4.f64525q.f64081s);
                return false;
            }
        } else {
            me4 me4 = re4.f64515d;
            if (me4 == null) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] isTLRecCardWrapperLegal recCard null");
                return false;
            } else if (me4.f64239d == null) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] isTLRecCardWrapperLegal CardTitle null");
                return false;
            } else if (me4.f64241f == null) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] isTLRecCardWrapperLegal AppMsgRecReason null");
                return false;
            } else {
                oe4 oe4 = me4.f64240e;
                if (oe4 == null) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] checkBizInfo null");
                    return false;
                } else if (oe4.f64334d == null) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] checkBizInfo UserName null");
                    return false;
                } else if (oe4.f64335e == null) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] checkBizInfo NickName null");
                    return false;
                } else if (oe4.f64337g == null) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] checkBizInfo RecReason null");
                    return false;
                } else if (Util.isNullOrNil((List) me4.f64242g)) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] AppMsg null");
                    return false;
                } else if (i != 5 || me4.f64242g.size() >= 2) {
                    switch (i) {
                        case 101:
                        case 102:
                        case 103:
                        case 105:
                            C22499hb0 hb02 = re4.f64523o;
                            if (hb02 == null || Util.isNullOrNil((List) hb02.f63905g) || re4.f64523o.f63905g.size() >= 3) {
                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " BizInfo size >= 3");
                                return false;
                            }
                            C22499hb0 hb03 = re4.f64523o;
                            if (hb03.f63906h == 1) {
                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " extraInfo flag = 1");
                                if (o0Var != null) {
                                    C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
                                }
                                return false;
                            }
                            int size = hb03.f63905g.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z = false;
                                } else if (re4.f64523o.f63905g.get(i2).f63793d != 1) {
                                    z = true;
                                } else {
                                    i2++;
                                }
                            }
                            if (!z) {
                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " bizLegal illegal");
                                if (o0Var != null) {
                                    C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
                                }
                                return false;
                            }
                            if (i == 101) {
                                int size2 = re4.f64523o.f63905g.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 < size2) {
                                        String str = re4.f64523o.f63905g.get(i3).f63794e;
                                        C87412m.m108593f(str, "wrapper.extraInfo.BizInfo[i].UserName");
                                        if (!m21037j(str)) {
                                            z4 = false;
                                        } else {
                                            i3++;
                                        }
                                    } else {
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " bizLegal contact");
                                    if (o0Var != null) {
                                        C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
                                    }
                                    return false;
                                }
                            }
                            if (m21042o(re4)) {
                                int size3 = re4.f64523o.f63905g.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size3) {
                                        String str2 = re4.f64523o.f63905g.get(i4).f63794e;
                                        C87412m.m108593f(str2, "wrapper.extraInfo.BizInfo[i].UserName");
                                        if (!m21037j(str2)) {
                                            z3 = false;
                                        } else {
                                            i4++;
                                        }
                                    } else {
                                        z3 = true;
                                    }
                                }
                                if (!z3) {
                                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " bizLegal bizFollowed = false");
                                    if (o0Var != null) {
                                        C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
                                    }
                                    return false;
                                }
                            }
                            int size4 = re4.f64523o.f63905g.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size4) {
                                    z2 = true;
                                } else if (Util.isNullOrNil((List) re4.f64523o.f63905g.get(i5).f63800n)) {
                                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " AppMsg null");
                                    return false;
                                } else if (re4.f64523o.f63905g.get(i5).f63800n.get(0).f63750d == 1) {
                                    z2 = false;
                                } else {
                                    i5++;
                                }
                            }
                            if (!z2) {
                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " AppMsg illegal");
                                return false;
                            }
                            LinkedList<C22493dh> linkedList = re4.f64523o.f63905g.get(0).f63800n;
                            C87412m.m108593f(linkedList, "wrapper.extraInfo.BizInfo[0].AppMsg");
                            boolean z5 = true;
                            for (C22493dh dhVar : linkedList) {
                                int i6 = dhVar.f63760q;
                                if (i6 == 8 || i6 == 7 || i6 == 6 || i6 == 10) {
                                    z5 = false;
                                }
                            }
                            if (!z5) {
                                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] style = " + i + " showTypeLegal illegal");
                                return false;
                            }
                            break;
                    }
                    return true;
                } else {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] AppMsg video size < 2");
                    return false;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012d A[RETURN] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m21044q(te3.C22508lo3 r10) {
        /*
            java.lang.String r0 = "recFeed"
            gy3.C87412m.m108594g(r10, r0)
            int r0 = r10.f64173f
            r1 = 0
            r2 = 1
            switch(r0) {
                case 2001: goto L_0x000e;
                case 2002: goto L_0x000e;
                case 2003: goto L_0x000e;
                case 2004: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            r3 = 0
            goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            java.lang.String r4 = "MicroMsg.BizTimeLineStorageLogicExKt"
            if (r3 != 0) goto L_0x002a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[TRACE_BIZRECFEED] not support style "
            r0.append(r2)
            int r10 = r10.f64173f
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r10)
            return r1
        L_0x002a:
            r3 = 2003(0x7d3, float:2.807E-42)
            r5 = 0
            if (r0 != r3) goto L_0x0043
            int r10 = r10.f64185u
            boolean r10 = m21039l(r10, r2)
            if (r10 != 0) goto L_0x003d
            java.lang.String r10 = "[TRACE_BIZRECFEED] canvas card pkg version invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r10)
            return r1
        L_0x003d:
            java.lang.String r10 = "[TRACE_BIZRECFEED] canvas just return true"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r10)
            return r2
        L_0x0043:
            java.util.LinkedList<te3.wo3> r0 = r10.f64172e
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r0 = 0
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r0 == 0) goto L_0x0059
            java.lang.String r10 = "[TRACE_BIZRECFEED] RecommendItem is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x0059:
            int r0 = r10.f64173f
            r3 = 2002(0x7d2, float:2.805E-42)
            if (r0 != r3) goto L_0x00a1
            java.lang.String r0 = r10.f64177j
            if (r0 == 0) goto L_0x006c
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r0 = 0
            goto L_0x006d
        L_0x006c:
            r0 = 1
        L_0x006d:
            if (r0 == 0) goto L_0x0075
            java.lang.String r10 = "[TRACE_BIZRECFEED] AggregationTitle is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x0075:
            java.lang.String r0 = r10.f64178n
            if (r0 == 0) goto L_0x0082
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r0 = 0
            goto L_0x0083
        L_0x0082:
            r0 = 1
        L_0x0083:
            if (r0 == 0) goto L_0x008b
            java.lang.String r10 = "[TRACE_BIZRECFEED] AggregationUrl is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x008b:
            java.lang.String r0 = r10.f64179o
            if (r0 == 0) goto L_0x0098
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r0 = 0
            goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            if (r0 == 0) goto L_0x00a1
            java.lang.String r10 = "[TRACE_BIZRECFEED] RecommendWording is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x00a1:
            int r0 = r10.f64173f
            r3 = 2004(0x7d4, float:2.808E-42)
            if (r0 != r3) goto L_0x012e
            java.util.LinkedList<te3.wo3> r0 = r10.f64172e
            java.lang.Object r0 = r0.getFirst()
            java.lang.String r3 = "recFeed.RecommendItem.first"
            gy3.C87412m.m108593f(r0, r3)
            te3.wo3 r0 = (te3.C22533wo3) r0
            te3.pd1 r3 = r0.f64699q
            if (r3 != 0) goto L_0x00be
            java.lang.String r0 = "BizTLRecFeedFinder: FinderInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0123
        L_0x00be:
            int r6 = r3.f184815d
            if (r6 != 0) goto L_0x00c8
            java.lang.String r0 = "BizTLRecFeedFinder: sub_type == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0123
        L_0x00c8:
            java.util.LinkedList<te3.pi1> r3 = r3.f184816e
            int r3 = r3.size()
            if (r3 != 0) goto L_0x00d6
            java.lang.String r0 = "BizTLRecFeedFinder: finder_feeds.size == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0123
        L_0x00d6:
            te3.pd1 r3 = r0.f64699q
            java.util.LinkedList<te3.pi1> r3 = r3.f184816e
            int r3 = r3.size()
            r6 = 2
            if (r3 >= r6) goto L_0x00ed
            te3.pd1 r3 = r0.f64699q
            int r3 = r3.f184815d
            if (r3 != r6) goto L_0x00ed
            java.lang.String r0 = "BizTLRecFeedFinder: dual finder, but feeds size < 2"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0123
        L_0x00ed:
            te3.pd1 r0 = r0.f64699q
            java.util.LinkedList<te3.pi1> r0 = r0.f184816e
            java.lang.String r3 = "recommendItemMsg.FinderInfo.finder_feeds"
            gy3.C87412m.m108593f(r0, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00fa:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0125
            java.lang.Object r3 = r0.next()
            te3.pi1 r3 = (te3.C22521pi1) r3
            java.lang.String r6 = r3.f64434q
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x011e
            java.lang.String r6 = r3.f64425e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x011e
            java.lang.String r3 = r3.f64435r
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00fa
        L_0x011e:
            java.lang.String r0 = "BizTLRecFeedFinder: feeds essential data lack!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x0123:
            r0 = 0
            goto L_0x012b
        L_0x0125:
            java.lang.String r0 = "BizTLRecFeedFinder: 2004 finder check ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 1
        L_0x012b:
            if (r0 == 0) goto L_0x012e
            return r2
        L_0x012e:
            java.util.LinkedList<te3.wo3> r10 = r10.f64172e
            java.lang.String r0 = "recFeed.RecommendItem"
            gy3.C87412m.m108593f(r10, r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x0139:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = r10.next()
            te3.wo3 r0 = (te3.C22533wo3) r0
            te3.bj2 r3 = r0.f64690e
            if (r3 == 0) goto L_0x014c
            java.lang.String r3 = r3.f63727d
            goto L_0x014d
        L_0x014c:
            r3 = r5
        L_0x014d:
            if (r3 == 0) goto L_0x0158
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0156
            goto L_0x0158
        L_0x0156:
            r3 = 0
            goto L_0x0159
        L_0x0158:
            r3 = 1
        L_0x0159:
            if (r3 == 0) goto L_0x0161
            java.lang.String r10 = "[TRACE_BIZRECFEED] Title is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x0161:
            te3.bj2 r3 = r0.f64690e
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = r3.f63729f
            goto L_0x0169
        L_0x0168:
            r3 = r5
        L_0x0169:
            if (r3 == 0) goto L_0x0174
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r3 = 0
            goto L_0x0175
        L_0x0174:
            r3 = 1
        L_0x0175:
            if (r3 == 0) goto L_0x017d
            java.lang.String r10 = "[TRACE_BIZRECFEED] ContentUrl is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x017d:
            te3.bj2 r3 = r0.f64690e
            if (r3 == 0) goto L_0x0184
            int r3 = r3.f63733j
            goto L_0x0185
        L_0x0184:
            r3 = -1
        L_0x0185:
            r6 = 46
            r7 = 5
            if (r3 == r7) goto L_0x01ac
            r8 = 8
            if (r3 == r8) goto L_0x01ac
            r8 = 10
            if (r3 == r8) goto L_0x01ac
            if (r3 == 0) goto L_0x01ac
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[TRACE_BIZRECFEED] ItemShowType is illegal, itemShowType="
            r10.append(r0)
            r10.append(r3)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x01ac:
            boolean r8 = m21041n(r0)
            if (r8 == 0) goto L_0x01e3
            te3.bj2 r8 = r0.f64690e
            if (r8 == 0) goto L_0x01bd
            te3.td3 r9 = r8.f63737q
            if (r9 == 0) goto L_0x01bd
            java.util.LinkedList<java.lang.String> r9 = r9.f142138e
            goto L_0x01be
        L_0x01bd:
            r9 = r5
        L_0x01be:
            if (r9 == 0) goto L_0x01cb
            te3.td3 r8 = r8.f63737q
            java.util.LinkedList<java.lang.String> r8 = r8.f142138e
            int r8 = r8.size()
            r9 = 3
            if (r8 >= r9) goto L_0x01e3
        L_0x01cb:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[TRACE_BIZRECFEED] showThreePic PictureInfo is illegal, itemShowType="
            r10.append(r0)
            r10.append(r3)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x01e3:
            te3.sd r3 = r0.f64689d
            if (r3 == 0) goto L_0x01ea
            java.lang.String r3 = r3.f185414e
            goto L_0x01eb
        L_0x01ea:
            r3 = r5
        L_0x01eb:
            if (r3 == 0) goto L_0x01f6
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r3 = 0
            goto L_0x01f7
        L_0x01f6:
            r3 = 1
        L_0x01f7:
            if (r3 == 0) goto L_0x01ff
            java.lang.String r10 = "[TRACE_BIZRECFEED] NickName is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x01ff:
            te3.bj2 r0 = r0.f64690e
            if (r0 == 0) goto L_0x0209
            int r3 = r0.f63733j
            if (r7 != r3) goto L_0x0209
            r3 = 1
            goto L_0x020a
        L_0x0209:
            r3 = 0
        L_0x020a:
            if (r3 == 0) goto L_0x021a
            if (r0 == 0) goto L_0x0211
            te3.mr4 r3 = r0.f63735o
            goto L_0x0212
        L_0x0211:
            r3 = r5
        L_0x0212:
            if (r3 != 0) goto L_0x021a
            java.lang.String r10 = "[TRACE_BIZRECFEED] VideoInfo is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x021a:
            if (r0 == 0) goto L_0x0223
            r3 = 7
            int r6 = r0.f63733j
            if (r3 != r6) goto L_0x0223
            r3 = 1
            goto L_0x0224
        L_0x0223:
            r3 = 0
        L_0x0224:
            if (r3 == 0) goto L_0x0139
            if (r0 == 0) goto L_0x022b
            te3.kt4 r0 = r0.f63736p
            goto L_0x022c
        L_0x022b:
            r0 = r5
        L_0x022c:
            if (r0 != 0) goto L_0x0139
            java.lang.String r10 = "[TRACE_BIZRECFEED] VoiceInfo is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            return r1
        L_0x0234:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19613h1.m21044q(te3.lo3):boolean");
    }

    /* renamed from: r */
    public static final C64846y23 m21045r(Map<String, String> map) {
        C87412m.m108594g(map, "values");
        C64846y23 y232 = new C64846y23();
        String str = map.get(".sysmsg.BizAccountRecommend.NativeFinderFeeds.sub_type");
        if (Util.isNullOrNil(str)) {
            return y232;
        }
        y232.f186438d = m21049v(str);
        y232.f186440f = map.get(".sysmsg.BizAccountRecommend.NativeFinderFeeds.from_session_id_info");
        int i = 0;
        while (i < 101) {
            String str2 = ".sysmsg.BizAccountRecommend.NativeFinderFeeds.finder_feeds" + (i == 0 ? "" : String.valueOf(i));
            C22521pi1 pi12 = new C22521pi1();
            String str3 = map.get(str2 + ".finder_object_nonce_id");
            pi12.f64437t = str3;
            if (!Util.isNullOrNil(str3)) {
                pi12.f64424d = map.get(str2 + ".headimg_url");
                pi12.f64425e = map.get(str2 + ".nick_name");
                pi12.f64426f = map.get(str2 + ".username");
                pi12.f64427g = map.get(str2 + ".mbizuin");
                pi12.f64428h = m21049v(map.get(str2 + ".mappmsgid"));
                pi12.f64429i = m21049v(map.get(str2 + ".midx"));
                pi12.f64430j = m21049v(map.get(str2 + ".is_recommend"));
                pi12.f64431n = map.get(str2 + ".finder_uin");
                pi12.f64432o = map.get(str2 + ".finder_encrypt_user_name");
                pi12.f64433p = map.get(str2 + ".title");
                pi12.f64434q = map.get(str2 + ".cover_img_url");
                String str4 = map.get(str2 + ".finder_object_id");
                pi12.f64435r = str4;
                if (Util.isNullOrNil(str4)) {
                    Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "parse end, finder_object_id is null ");
                } else {
                    pi12.f64436s = map.get(str2 + ".finder_export_id");
                    pi12.f64438u = m21049v(map.get(str2 + ".finder_media_type"));
                    pi12.f64439v = map.get(str2 + ".finder_export_username");
                    pi12.f64440w = m21049v(map.get(str2 + ".finder_duration"));
                    pi12.f64441x = map.get(str2 + ".primary_color");
                    pi12.f64442y = m21049v(map.get(str2 + ".finder_height"));
                    pi12.f64443z = m21049v(map.get(str2 + ".finder_width"));
                    pi12.f64406A = m21049v(map.get(str2 + ".finder_cover_height"));
                    pi12.f64407B = m21049v(map.get(str2 + ".finder_cover_width"));
                    pi12.f64408C = m21049v(map.get(str2 + ".finder_like_count"));
                    pi12.f64409D = m21049v(map.get(str2 + ".finder_comment_count"));
                    pi12.f64410E = m21049v(map.get(str2 + ".finder_create_time"));
                    pi12.f64411F = m21049v(map.get(str2 + ".show_finder"));
                    pi12.f64412G = m21049v(map.get(str2 + ".alignment"));
                    pi12.f64413H = map.get(str2 + ".recommend_reason");
                    pi12.f64414I = m21049v(map.get(str2 + ".recommend_send_time"));
                    pi12.f64415J = map.get(str2 + ".exp_type");
                    pi12.f64416K = map.get(str2 + ".report_info");
                    pi12.f64417L = m21049v(map.get(str2 + ".msg_rec_type"));
                    pi12.f64418M = m21049v(map.get(str2 + ".card_rec_type"));
                    pi12.f64419N = map.get(str2 + ".finder_session_buffer");
                    pi12.f64420P = map.get(str2 + ".rec_summary");
                    pi12.f64421Q = m21049v(map.get(str2 + ".has_redpacket_cover"));
                    y232.f186439e.add(pi12);
                }
            }
            i++;
        }
        return y232;
    }

    /* renamed from: s */
    public static final C64422hh m21046s(Map<String, String> map) {
        C87412m.m108594g(map, "values");
        C64422hh hhVar = new C64422hh();
        int i = Util.getInt(map.get(".sysmsg.BizAccountRecommend.RecycleAttr.CardType"), 0);
        hhVar.f183484d = i;
        if (i == 0) {
            hhVar.f183484d = Util.getInt(map.get(".sysmsg.BizRecommendExpt.RecycleAttr.CardType"), 0);
        }
        int i2 = Util.getInt(map.get(".sysmsg.BizAccountRecommend.RecycleAttr.Strategy"), 0);
        hhVar.f183485e = i2;
        if (i2 == 0) {
            hhVar.f183485e = Util.getInt(map.get(".sysmsg.BizRecommendExpt.RecycleAttr.Strategy"), 0);
        }
        return hhVar;
    }

    /* renamed from: t */
    public static final boolean m21047t() {
        if (!C19627t.f55586a.mo25840n()) {
            return false;
        }
        if (C86709a0.m107522a() && ((C45696d) C86709a0.m107533q(C45696d.class)).mo71012rU(1001)) {
            return true;
        }
        Log.m105925i("MicroMsg.BizTimeLineStorageLogicExKt", "[TRACE_BIZRECCARD] onBizRecommendExpt style = %s not support", 1001);
        return false;
    }

    /* renamed from: u */
    public static final void m21048u(re4 re4, int i, int i2) {
        C22499hb0 hb02;
        LinkedList<C22495eh> linkedList;
        C87412m.m108594g(re4, "wrapper");
        if (m21038k(re4.f64521j) && (hb02 = re4.f64523o) != null && (linkedList = hb02.f63905g) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = linkedList.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C22495eh) next).f63793d != 0) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            int i3 = 0;
            for (Object next2 : arrayList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C22495eh ehVar = (C22495eh) next2;
                    C22493dh dhVar = ehVar.f63800n.get(0);
                    if (dhVar != null && (dhVar.f63750d & 1) == 0) {
                        String str = dhVar.f63755i;
                        C87412m.m108593f(str, "it.ContentUrl");
                        String[] e = m21032e(str);
                        C115669n nVar = C115669n.INSTANCE;
                        C22499hb0 hb03 = re4.f64523o;
                        nVar.mo160131h(21461, ehVar.f63794e, e[0], e[1], Integer.valueOf(dhVar.f63760q), hb03.f63909n, hb03.f63908j, Integer.valueOf(i3), Long.valueOf(re4.f64519h), re4.f64523o.f63907i, Integer.valueOf(re4.f64521j), dhVar.f63748G, Integer.valueOf(re4.f64518g), Integer.valueOf(i), Integer.valueOf(re4.f64524p), Integer.valueOf(re4.f64517f), Integer.valueOf(i2));
                    }
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[Catch:{ NumberFormatException -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A[Catch:{ NumberFormatException -> 0x000d }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m21049v(java.lang.String r3) {
        /*
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x000f
            boolean r2 = z04.C112551y.m153811k(r3)     // Catch:{ NumberFormatException -> 0x000d }
            if (r2 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r2 = 0
            goto L_0x0010
        L_0x000d:
            r3 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = 1
        L_0x0010:
            if (r2 == 0) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x000d }
            goto L_0x001b
        L_0x0017:
            java.lang.Integer r3 = java.lang.Integer.decode(r3)     // Catch:{ NumberFormatException -> 0x000d }
        L_0x001b:
            java.lang.String r2 = "{\n        if (this.isNul…nteger.decode(this)\n    }"
            gy3.C87412m.m108593f(r3, r2)     // Catch:{ NumberFormatException -> 0x000d }
            int r1 = r3.intValue()     // Catch:{ NumberFormatException -> 0x000d }
            goto L_0x0035
        L_0x0026:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getMessage()
            r0[r1] = r3
            java.lang.String r3 = "MicroMsg.BizTimeLineStorageLogicExKt"
            java.lang.String r2 = "safeToInt fail %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r0)
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19613h1.m21049v(java.lang.String):int");
    }

    /* renamed from: w */
    public static final void m21050w(C19623o0 o0Var, re4 re4) {
        C87412m.m108594g(o0Var, "<this>");
        C87412m.m108594g(re4, "wrapper");
        o0Var.field_recommendCardId = "";
        String str = null;
        if (m21038k(re4.f64521j)) {
            C22499hb0 hb02 = re4.f64523o;
            if (hb02 != null) {
                str = hb02.f63908j;
            }
            o0Var.field_recommendCardId = str;
            return;
        }
        if (re4.f64521j == 1001) {
            C22503jo3 jo32 = re4.f64525q;
            if (jo32 != null) {
                str = jo32.f64075j;
            }
            o0Var.field_recommendCardId = str;
        }
    }

    /* renamed from: x */
    public static final void m21051x(int i) {
        String str;
        int i2 = i;
        String str2 = "card_id_" + System.currentTimeMillis();
        if (i2 == 1001) {
            String str3 = "<sysmsg type=\"BizRecommendExpt\">\n<BizRecommendExpt>\n<Title><![CDATA[猜你喜欢]]></Title>\n<Pos>1</Pos>\n<Weight>200</Weight>\n<RecID>1591189349</RecID>\n<RedDotFlag>1</RedDotFlag>\n<BusinessId>0</BusinessId>\n<PackageVersion>327166666</PackageVersion>\n<CardID><![CDATA[" + str2 + "]]></CardID>\n<Data><![CDATA[{\"Title\":\"猜你喜欢\",\"BizAccount\":[{\"Flag\":0,\"UserName\":\"gh_f05ff0331d78\",\"NickName\":\"" + ("中国国家地理" + (System.currentTimeMillis() % ((long) 10000))) + "\",\"RecommendReason\":\"\",\"Signature\":\"《深度参考》是中国高端精英读物，是您了解最新、最有深度、最有价值的时事财经资讯窗口，欢迎关注！\",\"BrandIconUrl\":\"http://mmbiz.qpic.cn/mmbiz/3lXPl12icGVZjPnbiaWdLbMQoNpTK6ZicaTFUk5jLfciaRVoukmISPd5DC6YHy5No4a4uy6k3PnIMIH00XJOVw0ibRw/0?wx_fmt=png\",\"AppMsgRecReason\":\"近期更新\",\"AppMsg\":[{\"Flag\":0,\"Title\":\"气温超过50°的极热之地，你敢去吗？\",\"Digest\":\"我是摘要测试测试\",\"ContentUrl\":\"https://mp.weixin.qq.com/s/oKmmWfX9G3Yfbmp5aDeyTQ\",\"CoverImgUrl\":\"http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg\",\"CoverImgUrl_1_1\":\"https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg\",\"CoverImgUrl_235_1\":\"\",\"ItemShowType\":0,\"VideoId\":\"\",\"VideoWidth\":0,\"VideoHeight\":0,\"VideoDuration\":180,\"CreateTime\":1593296809,\"NegativeFeedbackReason\":[\"内容质量低\",\"不看此公众号\"],\"ShowNegativeFeedbackReason\":0,\"RecommendReason\":\"\",\"VoicePlayUrl\":\"\",\"VoiceDuration\":0,\"RecRk\":1,\"RecInfo\":\"something\",\"AppMsgId\":2698324179,\"ItemIdx\":1,\"AuthorAppUin\":1014597342,\"CanReward\":0,\"CanPaid\":0},{\"Flag\":0,\"Title\":\"深度雄文，西部高原屏障对中华民族战略安全的重大意义！\",\"Digest\":\"深度参考长按右边的二维码关注2013年4月在中国的阿克塞欣的斗拉特别里奥地地区中印两国爆发“帐蓬对峙”，20\",\"ContentUrl\":\"http://mp.weixin.qq.com/s?__biz=MzAwNzY5Mzg1MQ==&mid=2698324092&idx=4&sn=015c49c8d05b56267366a2cce351c2ec&chksm=be5bbb08892c321e990026bce74c09ad13da8ec56896875358f4db0271222b09b146b95739b1#rd\",\"CoverImgUrl\":\"http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVY34GKxTibsNvqZEtEeIFYTRKFt0yr47GZY0AicB2iaU9Iuf7r374aNic2ZD8M2iaZibGkhXEicDwpViaSbiaA/0?wx_fmt=jpeg\",\"CoverImgUrl_1_1\":\"https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVY34GKxTibsNvqZEtEeIFYTRKFt0yr47GZY0AicB2iaU9Iuf7r374aNic2ZD8M2iaZibGkhXEicDwpViaSbiaA/0?wx_fmt=jpeg\",\"CoverImgUrl_235_1\":\"\",\"ItemShowType\":0,\"VideoId\":\"\",\"VideoWidth\":0,\"VideoHeight\":0,\"VideoDuration\":180,\"CreateTime\":1593211927,\"NegativeFeedbackReason\":[\"内容质量低\",\"不看此公众号\"],\"ShowNegativeFeedbackReason\":0,\"RecommendReason\":\"\",\"VoicePlayUrl\":\"\",\"VoiceDuration\":180,\"RecRk\":2,\"RecInfo\":\"great\",\"AppMsgId\":2698324092,\"ItemIdx\":4,\"AuthorAppUin\":1654122144,\"CanReward\":0,\"CanPaid\":0}],\"NegativeFeedbackReason\":[\"不看此公众号\",\"内容低质\",\"内容重复\",\"内容过时\",\"希望减少推荐\"],\"ShowNegativeFeedbackReason\":1,\"BizUin\":3007693851}],\"Pos\":1,\"Weight\":200,\"RecID\":10086,\"Style\":1001,\"Event\":\"hengqing\",\"RedDotFlag\":1,\"RecSummary\":\"深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！\",\"CardId\":\"cdd97abeab063a0e00cea86f805bb17c\",\"ExpType\":\"tools\"}]]></Data>\n<RecSummary><![CDATA[气温超过50°的极热之地，你敢去吗？]]></RecSummary>\n<AppId><![CDATA[wxf337cbaa27790d8e]]></AppId>\n<ExtraData><![CDATA[{\"type\":1,\"real_data\":\"{\\\"biz_info\\\":[{\\\"username\\\":\\\"gh_49f4cd2ce99b\\\",\\\"nickname\\\":\\\"皮皮浪老师\\\",\\\"appmsg_info\\\":[{\\\"url\\\":\\\"http:\\\\\\/\\\\\\/mp.weixin.qq.com\\\\\\/s?__biz=MzA4OTE5NzQ5MQ==&mid=2247483877&idx=1&sn=e693e539daef056fa051e66374e41b48&chksm=901fdf39a768562fe6aaaeed3dfc9909d781ea8c45862cc335ed527eafcdb51f4aca774f67c3#rd\\\",\\\"title\\\":\\\"皮皮浪的复盘讲解（二十二）——围空不要拆二\\\",\\\"rec_rk\\\":1,\\\"rec_info\\\":\\\"something\\\",\\\"item_show_type\\\":5}]}],\\\"style\\\":1001,\\\"event\\\":\\\"hengqing\\\",\\\"card_id\\\":\\\"33a95e9794780cc0f584220dbb9fcfe2\\\",\\\"exp_type\\\":\\\"tools\\\"}\"}]]></ExtraData>\n<TemplatePath><![CDATA[re.js]]></TemplatePath>\n<TemplatePathType><![CDATA[re]]></TemplatePathType>\n</BizRecommendExpt>\n</sysmsg>";
            int E = C112550d0.m153769E(str3, "<sysmsg", 0, false, 6, (Object) null);
            if (E != -1) {
                String substring = str3.substring(E);
                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                Map<String, String> parseXml = XmlParser.parseXml(substring, "sysmsg", (String) null);
                if (parseXml == null) {
                    Log.m105921e("MicroMsg.BizTimeLineStorageLogicExKt", "XmlParser values is null, msgContent %s", str3);
                    return;
                }
                re4 d = m21031d(parseXml);
                C87412m.m108591d(d);
                m21035h(parseXml, d, (C19467w0) null, 4, (Object) null);
            }
        } else if (i2 == 1002) {
            String str4 = "<sysmsg type=\"BizRecommendExpt\">\n<BizRecommendExpt>\n<Title><![CDATA[猜你喜欢]]></Title>\n<Pos>1</Pos>\n<Weight>200</Weight>\n<RecID>1591189349</RecID>\n<RedDotFlag>1</RedDotFlag>\n<BusinessId>0</BusinessId>\n<PackageVersion>327166666</PackageVersion>\n<CardID><![CDATA[" + str2 + "]]></CardID>\n<Data><![CDATA[{\"Title\":\"猜你喜欢\",\"BizAccount\":[{\"Flag\":0,\"UserName\":\"gh_f05ff0331d78\",\"NickName\":\"" + ("中国国家地理" + (System.currentTimeMillis() % ((long) 10000))) + "\",\"RecommendReason\":\"\",\"Signature\":\"《深度参考》是中国高端精英读物，是您了解最新、最有深度、最有价值的时事财经资讯窗口，欢迎关注！\",\"BrandIconUrl\":\"http://mmbiz.qpic.cn/mmbiz/3lXPl12icGVZjPnbiaWdLbMQoNpTK6ZicaTFUk5jLfciaRVoukmISPd5DC6YHy5No4a4uy6k3PnIMIH00XJOVw0ibRw/0?wx_fmt=png\",\"AppMsgRecReason\":\"近期更新\",\"AppMsg\":[{\"Flag\":0,\"Title\":\"气温超过50°的极热之地，你敢去吗？\",\"Digest\":\"我是摘要测试测试\",\"ContentUrl\":\"https://mp.weixin.qq.com/s/oKmmWfX9G3Yfbmp5aDeyTQ\",\"CoverImgUrl\":\"http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg\",\"CoverImgUrl_1_1\":\"https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg\",\"CoverImgUrl_235_1\":\"\",\"ItemShowType\":0,\"VideoId\":\"\",\"VideoWidth\":0,\"VideoHeight\":0,\"VideoDuration\":180,\"CreateTime\":1593296809,\"NegativeFeedbackReason\":[\"内容质量低\",\"不看此公众号\"],\"ShowNegativeFeedbackReason\":0,\"RecommendReason\":\"\",\"VoicePlayUrl\":\"\",\"VoiceDuration\":0,\"RecRk\":1,\"RecInfo\":\"something\",\"AppMsgId\":2698324179,\"ItemIdx\":1,\"AuthorAppUin\":1014597342,\"CanReward\":0,\"CanPaid\":0},{\"Flag\":0,\"Title\":\"深度雄文，西部高原屏障对中华民族战略安全的重大意义！\",\"Digest\":\"深度参考长按右边的二维码关注2013年4月在中国的阿克塞欣的斗拉特别里奥地地区中印两国爆发“帐蓬对峙”，20\",\"ContentUrl\":\"http://mp.weixin.qq.com/s?__biz=MzAwNzY5Mzg1MQ==&mid=2698324092&idx=4&sn=015c49c8d05b56267366a2cce351c2ec&chksm=be5bbb08892c321e990026bce74c09ad13da8ec56896875358f4db0271222b09b146b95739b1#rd\",\"CoverImgUrl\":\"http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVY34GKxTibsNvqZEtEeIFYTRKFt0yr47GZY0AicB2iaU9Iuf7r374aNic2ZD8M2iaZibGkhXEicDwpViaSbiaA/0?wx_fmt=jpeg\",\"CoverImgUrl_1_1\":\"https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVY34GKxTibsNvqZEtEeIFYTRKFt0yr47GZY0AicB2iaU9Iuf7r374aNic2ZD8M2iaZibGkhXEicDwpViaSbiaA/0?wx_fmt=jpeg\",\"CoverImgUrl_235_1\":\"\",\"ItemShowType\":0,\"VideoId\":\"\",\"VideoWidth\":0,\"VideoHeight\":0,\"VideoDuration\":180,\"CreateTime\":1593211927,\"NegativeFeedbackReason\":[\"内容质量低\",\"不看此公众号\"],\"ShowNegativeFeedbackReason\":0,\"RecommendReason\":\"\",\"VoicePlayUrl\":\"\",\"VoiceDuration\":180,\"RecRk\":2,\"RecInfo\":\"great\",\"AppMsgId\":2698324092,\"ItemIdx\":4,\"AuthorAppUin\":1654122144,\"CanReward\":0,\"CanPaid\":0}],\"NegativeFeedbackReason\":[\"不看此公众号\",\"内容低质\",\"内容重复\",\"内容过时\",\"希望减少推荐\"],\"ShowNegativeFeedbackReason\":1,\"BizUin\":3007693851}],\"Pos\":1,\"Weight\":200,\"RecID\":10086,\"Style\":1001,\"Event\":\"hengqing\",\"RedDotFlag\":1,\"RecSummary\":\"深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！\",\"CardId\":\"cdd97abeab063a0e00cea86f805bb17c\",\"ExpType\":\"tools\"}]]></Data>\n<RecSummary><![CDATA[气温超过50°的极热之地，你敢去吗？]]></RecSummary>\n<AppId><![CDATA[wxf337cbaa27790d8e]]></AppId>\n<ExtraData><![CDATA[{\"type\":1,\"real_data\":\"{\\\"biz_info\\\":[{\\\"username\\\":\\\"gh_49f4cd2ce99b\\\",\\\"nickname\\\":\\\"皮皮浪老师\\\",\\\"appmsg_info\\\":[{\\\"url\\\":\\\"http:\\\\\\/\\\\\\/mp.weixin.qq.com\\\\\\/s?__biz=MzA4OTE5NzQ5MQ==&mid=2247483877&idx=1&sn=e693e539daef056fa051e66374e41b48&chksm=901fdf39a768562fe6aaaeed3dfc9909d781ea8c45862cc335ed527eafcdb51f4aca774f67c3#rd\\\",\\\"title\\\":\\\"皮皮浪的复盘讲解（二十二）——围空不要拆二\\\",\\\"rec_rk\\\":1,\\\"rec_info\\\":\\\"something\\\",\\\"item_show_type\\\":5}]}],\\\"style\\\":1001,\\\"event\\\":\\\"hengqing\\\",\\\"card_id\\\":\\\"33a95e9794780cc0f584220dbb9fcfe2\\\",\\\"exp_type\\\":\\\"tools\\\"}\"}]]></ExtraData>\n<TemplatePath><![CDATA[re.js]]></TemplatePath>\n<TemplatePathType><![CDATA[re]]></TemplatePathType>\n<RecycleAttr><CardType>1</CardType><Strategy>1</Strategy></RecycleAttr>\n</BizRecommendExpt>\n</sysmsg>";
            int E2 = C112550d0.m153769E(str4, "<sysmsg", 0, false, 6, (Object) null);
            if (E2 != -1) {
                String substring2 = str4.substring(E2);
                C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
                Map<String, String> parseXml2 = XmlParser.parseXml(substring2, "sysmsg", (String) null);
                if (parseXml2 == null) {
                    Log.m105921e("MicroMsg.BizTimeLineStorageLogicExKt", "XmlParser values is null, msgContent %s", str4);
                    return;
                }
                re4 d2 = m21031d(parseXml2);
                C87412m.m108591d(d2);
                m21035h(parseXml2, d2, (C19467w0) null, 4, (Object) null);
            }
        } else if (i2 == 2001) {
            long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            String str5 = "<sysmsg type=\"BizRecommendExpt\"><BizRecommendExpt>\n<Title><![CDATA[旅行自媒体创业4年，我们从零开始的故事....#人人都是创作者 #我的旅行生活 @微信时刻 @微信创作者 ]]></Title>\n<Pos>2</Pos>\n<Weight>-1</Weight>\n<RecID>1639469558</RecID>\n<RedDotFlag>1</RedDotFlag>\n<BusinessId>2</BusinessId>\n<CardID><![CDATA[finder_rec_card_" + System.currentTimeMillis() + "_export/UzFfAgtgekIEAQAAAAAAXLMERz4qPwAAAAstQy6ubaLX4KHWvLEZgBPEyZMECBI_BIj9zNPgMItDO2sB6ukmHhSn80LkaIt7]]></CardID>\n<Data><![CDATA[{\"style\":1008,\"show_type\":2,\"rec_datas\":[{\"bizuin\":0,\"headimg_url\":\"http://wx.qlogo.cn/finderhead/ajNVdqHZLLD16d5F7KSWDhu0mLZ990XT3hBmptKFibq0tG3xugTAUPA/64\",\"nick_name\":\"牛肉夫妻出逃记\",\"username\":\"\",\"finder_uin\":\"\",\"finder_encrypt_user_name\":\"v2_060000231003b20faec8c6e6811fc3d6ca02ee30b07755b80bf2671109baf9515bc9214e9dc1@finder\",\"title\":\"旅行自媒体创业4年，我们从零开始的故事....#人人都是创作者 #我的旅行生活 @微信时刻 @微信创作者 \",\"cover_img_url\":\"http://wxapp.tc.qq.com/251/20304/stodownload?filekey=30250201010411300f020200fb0402535a040002030175ce040d00000004627466730000000132&storeid=261b7509600059835efe2c51b000000fb00004f50535a051618809625aa966&adaptivelytrans=0&bizid=1023&dotrans=0&hy=SZ&m=&scene=0&picformat=200\",\"finder_object_id\":\"13752720681011580957\",\"finder_export_id\":\"export/UzFfAgtgekIEAQAAAAAAXLMERz4qPwAAAAstQy6ubaLX4KHWvLEZgBPEyZMECBI_BIj9zNPgMItDO2sB6ukmHhSn80LkaIt7\",\"finder_object_nonce_id\":\"13202483152707429542\",\"finder_media_type\":4,\"finder_export_username\":\"export/UzFfAgtgekIEAQAAAAAAJcEnahSLRQAAAAstQy6ubaLX4KHWvLEZgBPElJg-DxE0eXJTzNvhHHrGUchzA9h5H3nVEoAE6A\",\"finder_duration\":86,\"finder_height\":1080,\"finder_width\":1920,\"finder_cover_height\":1080,\"finder_cover_width\":1920,\"finder_like_count\":16,\"finder_comment_count\":1,\"finder_create_time\":" + currentTimeMillis + ",\"show_finder\":1,\"alignment\":2,\"recommend_reason\":\"\",\"recommend_send_time\":" + currentTimeMillis + ",\"exp_type\":\"recommend_card_vedio_insert_vediofinder_strategy\"},{\"bizuin\":0,\"headimg_url\":\"http://wx.qlogo.cn/finderhead/PiajxSqBRaELialibQmJSwn26dBDbLpMmMBeFs20wrEU2qiaFszERYsbWw/64\",\"nick_name\":\"-肥猪猪的日常\",\"username\":\"\",\"finder_uin\":\"\",\"finder_encrypt_user_name\":\"v2_060000231003b20faec8cae38c10c0d3cc02e430b0774db52853161520a85769411f0b44d41b@finder\",\"title\":\"一次解锁两个口味提拉米苏，喜欢吃甜点的一定要做起来，简直是神仙美味！#提拉米苏@微信时刻\",\"cover_img_url\":\"http://wxapp.tc.qq.com/251/20304/stodownload?m=948baf0a10df722b305fcb8663b94e2b&filekey=30350201010421301f020200fb040253480410948baf0a10df722b305fcb8663b94e2b020303ccc3040d00000004627466730000000132&hy=SH&storeid=161b7602b000ab75d129ecef5000000fb00004f50534802e35b00b72c43ce5&dotrans=0&bizid=1023&adaptivelytrans=0&picformat=200\",\"finder_object_id\":\"13752622588133513262\",\"finder_export_id\":\"export/UzFfAgtgekIEAQAAAAAAFKo2pKMsugAAAAstQy6ubaLX4KHWvLEZgBPE-oMoQwFAEoj9zNPgMIukJe20L-aoYPEg-3KA3H3-\",\"finder_object_nonce_id\":\"17451324971833681560\",\"finder_media_type\":4,\"finder_export_username\":\"export/UzFfAgtgekIEAQAAAAAABe8JRvUlggAAAAstQy6ubaLX4KHWvLEZgBPEqIkZFx40eXJTzNvh4Pbe3n2BrRvS_cRW8y6j3A\",\"finder_duration\":56,\"finder_height\":1920,\"finder_width\":1080,\"finder_cover_height\":1920,\"finder_cover_width\":1080,\"finder_like_count\":2531,\"finder_comment_count\":48,\"finder_create_time\":" + currentTimeMillis + ",\"show_finder\":1,\"alignment\":2,\"recommend_reason\":\"\",\"recommend_send_time\":" + currentTimeMillis + ",\"exp_type\":\"recommend_card_vedio_insert_vediofinder_strategy\"}]}]]></Data>\n<RecSummary><![CDATA[牛肉夫妻出逃记:旅行自媒体创业4年，我们从零开始的故事....#人人都是创作者 #我的旅行生活 @微信时刻 @微信创作者 ]]></RecSummary>\n<TemplatePath><![CDATA[]]></TemplatePath>\n<AppId><![CDATA[wxf337cbaa27790d8e]]></AppId>\n<UseServerTime>1</UseServerTime>\n<ExtraData><![CDATA[{}]]></ExtraData>\n<TemplatePathType><![CDATA[re]]></TemplatePathType>\n<PackageVersion>127325850</PackageVersion>\n</BizRecommendExpt>";
            int E3 = C112550d0.m153769E(str5, "<sysmsg", 0, false, 6, (Object) null);
            if (E3 != -1) {
                String substring3 = str5.substring(E3);
                C87412m.m108593f(substring3, "this as java.lang.String).substring(startIndex)");
                Map<String, String> parseXml3 = XmlParser.parseXml(substring3, "sysmsg", (String) null);
                if (parseXml3 == null) {
                    Log.m105921e("MicroMsg.BizTimeLineStorageLogicExKt", "XmlParser values is null, msgContent %s", str5);
                    return;
                }
                re4 d3 = m21031d(parseXml3);
                C87412m.m108591d(d3);
                m21035h(parseXml3, d3, (C19467w0) null, 4, (Object) null);
            }
        } else {
            if (i2 == 1) {
                str = "<sysmsg type=\"BizRecommendNotify\">\n<BizAccountRecommend>\n<Title><![CDATA[猜你喜欢]]></Title>\n\n<BizAccount>\n<UserName><![CDATA[gh_f05ff0331d78]]></UserName>\n<NickName><![CDATA[深度参考]]></NickName>\n<HeadImgUrl><![CDATA[]]></HeadImgUrl>\n<RecommendReason><![CDATA[]]></RecommendReason>\n<Signature><![CDATA[《深度参考》是中国高端精英读物，是您了解最新、最有深度、最有价值的时事财经资讯窗口，欢迎关注！]]></Signature>\n<BrandIconUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz/3lXPl12icGVZjPnbiaWdLbMQoNpTK6ZicaTFUk5jLfciaRVoukmISPd5DC6YHy5No4a4uy6k3PnIMIH00XJOVw0ibRw/0?wx_fmt=png]]></BrandIconUrl>\n<AppMsgRecReason><![CDATA[]]></AppMsgRecReason>\n\n<AppMsg>\n<Title><![CDATA[深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzAwNzY5Mzg1MQ==&mid=2698324179&idx=1&sn=02fb8d7cbd9a4187266280edccc1c303&chksm=be5bbba7892c32b19e13202074ffb143c96ff4d1024939ce4c917cf740905e67444b11604b13#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>0</ItemShowType>\n<VideoId><![CDATA[]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>0</VideoDuration>\n<CreateTime>1593296809</CreateTime>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<VoicePlayUrl><![CDATA[]]></VoicePlayUrl>\n<VoiceDuration>0</VoiceDuration>\n<RecRk>1</RecRk>\n<RecommendReason><![CDATA[粤知一二]]></RecommendReason>\n<RecInfo><![CDATA[something]]></RecInfo>\n</AppMsg>\n\n<AppMsg>\n<Title><![CDATA[深度雄文，西部高原屏障对中华民族战略安全的重大意义！]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzAwNzY5Mzg1MQ==&mid=2698324092&idx=4&sn=015c49c8d05b56267366a2cce351c2ec&chksm=be5bbb08892c321e990026bce74c09ad13da8ec56896875358f4db0271222b09b146b95739b1#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVY34GKxTibsNvqZEtEeIFYTRKFt0yr47GZY0AicB2iaU9Iuf7r374aNic2ZD8M2iaZibGkhXEicDwpViaSbiaA/0?wx_fmt=jpeg]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVY34GKxTibsNvqZEtEeIFYTRKFt0yr47GZY0AicB2iaU9Iuf7r374aNic2ZD8M2iaZibGkhXEicDwpViaSbiaA/0?wx_fmt=jpeg]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>0</ItemShowType>\n<VideoId><![CDATA[]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>0</VideoDuration>\n<CreateTime>1593211927</CreateTime>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<VoicePlayUrl><![CDATA[]]></VoicePlayUrl>\n<VoiceDuration>0</VoiceDuration>\n<RecRk>2</RecRk>\n<RecommendReason><![CDATA[粤知一二]]></RecommendReason>\n<RecInfo><![CDATA[great]]></RecInfo>\n</AppMsg>\n\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccount>\n\n<Pos>1</Pos>\n<Weight>200</Weight>\n<RecID>10086</RecID>\n<Style>102</Style>\n<Event>hengqing</Event>\n<RedDotFlag>1</RedDotFlag>\n<RecSummary><![CDATA[深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！]]></RecSummary>\n<CardId><![CDATA[" + str2 + "]]></CardId>\n<ExpType><![CDATA[tools]]></ExpType>\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccountRecommend>\n</sysmsg>";
            } else if (i2 == 2) {
                str = "<sysmsg type=\"BizRecommendNotify\">\n<BizAccountRecommend>\n<Title><![CDATA[猜你喜欢]]></Title>\n\n<BizAccount>\n<UserName><![CDATA[gh_028c33dfd807]]></UserName>\n<NickName><![CDATA[粤知一二]]></NickName>\n<HeadImgUrl><![CDATA[]]></HeadImgUrl>\n<RecommendReason><![CDATA[]]></RecommendReason>\n<Signature><![CDATA[由广东综艺90后门面担当郭嘉峰主持，是一档有个性有深度，看了会上瘾的粤语脱口秀节目。每晚18：00准时更新。]]></Signature>\n<BrandIconUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_png/Y7rtYuVxk9TNiaA7iciav0aI5ZNxxxVybPXOoxocjzdu2REcv0bck59HFZ9jJTmHB6spYXlqibCfUia8E9997dLaoHw/0?wx_fmt=png]]></BrandIconUrl>\n<AppMsgRecReason><![CDATA[]]></AppMsgRecReason>\n\n<AppMsg>\n<Title><![CDATA[经常吃港式茶餐厅的你，点餐时一定都听过这些暗号！]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzI4MDU3Njk4MA==&mid=2247506230&idx=2&sn=80d0ead06f7d4446e42a89d57ee81699&chksm=ebb4cf8ddcc3469b4d62d4324bcec575812c28fea3d68af6e838f0a9a5bb79a8db7320fc7e70#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[https://vpic.video.qq.com/36675860/i0787zrbitj.png]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>5</ItemShowType>\n<VideoId><![CDATA[i0787zrbitj]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>245</VideoDuration>\n<CreateTime>1592751453</CreateTime>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<VoicePlayUrl><![CDATA[]]></VoicePlayUrl>\n<VoiceDuration>0</VoiceDuration>\n<RecRk>1</RecRk>\n<RecommendReason><![CDATA[粤知一二]]></RecommendReason>\n<RecInfo><![CDATA[something]]></RecInfo>\n</AppMsg>\n\n<AppMsg>\n<Title><![CDATA[教你一套坐公交车自救秘籍，你想要吗？]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzI4MDU3Njk4MA==&mid=2247494577&idx=1&sn=b0e489f3f5517b7942526aab7710052c&chksm=ebb4fd0adcc3741cc503f47ca2e1193af82db286d2baa438bb8d6209de9e192d8aaac5281d2a#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/Y7rtYuVxk9QHKGicgHASZibRp09iaGwSnnAN4cHzBvfupOIsibv78UfUGAJtcH1wT7wmAOicHib1k8a2FErDx7DFMNpg/0?wx_fmt=jpeg]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>5</ItemShowType>\n<VideoId><![CDATA[wxv_543960396546260993]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<RecommendReason><![CDATA[粤知一二]]></RecommendReason>\n<VideoDuration>314</VideoDuration>\n<CreateTime>1542015514</CreateTime>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<VoicePlayUrl><![CDATA[]]></VoicePlayUrl>\n<VoiceDuration>0</VoiceDuration>\n<RecRk>2</RecRk>\n<RecInfo><![CDATA[great]]></RecInfo>\n</AppMsg>\n\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccount>\n\n<Pos>1</Pos>\n<Weight>-1</Weight>\n<RecID>10086</RecID>\n<Style>102</Style>\n<Event>hengqing</Event>\n<RedDotFlag>1</RedDotFlag>\n<RecSummary><![CDATA[经常吃港式茶餐厅的你，点餐时一定都听过这些暗号！]]></RecSummary>\n<CardId><![CDATA[" + str2 + "]]></CardId>\n<ExpType><![CDATA[tools]]></ExpType>\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccountRecommend>\n</sysmsg>";
            } else if (i2 == 3) {
                str = "<sysmsg type=\"BizRecommendNotify\">\n<BizAccountRecommend>\n<Title><![CDATA[猜你喜欢]]></Title>\n\n<BizAccount>\n<UserName><![CDATA[gh_028c33dfd807]]></UserName>\n<NickName><![CDATA[粤知一二]]></NickName>\n<HeadImgUrl><![CDATA[]]></HeadImgUrl>\n<RecommendReason><![CDATA[]]></RecommendReason>\n<Signature><![CDATA[由广东综艺90后门面担当郭嘉峰主持，是一档有个性有深度，看了会上瘾的粤语脱口秀节目。每晚18：00准时更新。]]></Signature>\n<BrandIconUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_png/Y7rtYuVxk9TNiaA7iciav0aI5ZNxxxVybPXOoxocjzdu2REcv0bck59HFZ9jJTmHB6spYXlqibCfUia8E9997dLaoHw/0?wx_fmt=png]]></BrandIconUrl>\n<AppMsgRecReason><![CDATA[]]></AppMsgRecReason>\n\n<AppMsg>\n<Title><![CDATA[经常吃港式茶餐厅的你，点餐时一定都听过这些暗号！]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzI4MDU3Njk4MA==&mid=2247506230&idx=2&sn=80d0ead06f7d4446e42a89d57ee81699&chksm=ebb4cf8ddcc3469b4d62d4324bcec575812c28fea3d68af6e838f0a9a5bb79a8db7320fc7e70#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[https://vpic.video.qq.com/36675860/i0787zrbitj.png]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>5</ItemShowType>\n<VideoId><![CDATA[i0787zrbitj]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>245</VideoDuration>\n<CreateTime>1592751453</CreateTime>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<VoicePlayUrl><![CDATA[]]></VoicePlayUrl>\n<VoiceDuration>0</VoiceDuration>\n<RecRk>1</RecRk>\n<RecommendReason><![CDATA[粤知一二]]></RecommendReason>\n<RecInfo><![CDATA[something]]></RecInfo>\n</AppMsg>\n\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccount>\n\n<Pos>1</Pos>\n<Weight>200</Weight>\n<RecID>10086</RecID>\n<Style>102</Style>\n<Event>hengqing</Event>\n<RedDotFlag>1</RedDotFlag>\n<RecSummary><![CDATA[经常吃港式茶餐厅的你，点餐时一定都听过这些暗号！]]></RecSummary>\n<CardId><![CDATA[" + str2 + "]]></CardId>\n<ExpType><![CDATA[tools]]></ExpType>\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccountRecommend>\n</sysmsg>";
            } else if (i2 == 4) {
                str = "<sysmsg type=\"BizRecommendNotify\">\n<BizAccountRecommend>\n<Title><![CDATA[猜你喜欢]]></Title>\n\n<BizAccount>\n<UserName><![CDATA[gh_f05ff0331d78]]></UserName>\n<NickName><![CDATA[深度参考]]></NickName>\n<HeadImgUrl><![CDATA[]]></HeadImgUrl>\n<RecommendReason><![CDATA[]]></RecommendReason>\n<Signature><![CDATA[《深度参考》是中国高端精英读物，是您了解最新、最有深度、最有价值的时事财经资讯窗口，欢迎关注！]]></Signature>\n<BrandIconUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz/3lXPl12icGVZjPnbiaWdLbMQoNpTK6ZicaTFUk5jLfciaRVoukmISPd5DC6YHy5No4a4uy6k3PnIMIH00XJOVw0ibRw/0?wx_fmt=png]]></BrandIconUrl>\n<AppMsgRecReason><![CDATA[]]></AppMsgRecReason>\n\n<AppMsg>\n<Title><![CDATA[深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzAwNzY5Mzg1MQ==&mid=2698324179&idx=1&sn=02fb8d7cbd9a4187266280edccc1c303&chksm=be5bbba7892c32b19e13202074ffb143c96ff4d1024939ce4c917cf740905e67444b11604b13#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[https://mmbiz.qlogo.cn/mmbiz_jpg/3lXPl12icGVZIyj3SMeiaotBJ8r5qwgAicflnXdjFKicPd2jbfd0ibRpsUFo7m0oAenT7ReBddeeqmoicDBPcOVCaMNw/0?wx_fmt=jpeg]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>0</ItemShowType>\n<VideoId><![CDATA[]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>0</VideoDuration>\n<CreateTime>1593296809</CreateTime>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<VoicePlayUrl><![CDATA[]]></VoicePlayUrl>\n<VoiceDuration>0</VoiceDuration>\n<RecRk>1</RecRk>\n<RecInfo><![CDATA[something]]></RecInfo>\n</AppMsg>\n\n\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccount>\n\n<Pos>1</Pos>\n<Weight>200</Weight>\n<RecID>10086</RecID>\n<Style>101</Style>\n<Event>hengqing</Event>\n<RedDotFlag>1</RedDotFlag>\n<RecSummary><![CDATA[深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！]]></RecSummary>\n<CardId><![CDATA[" + str2 + "]]></CardId>\n<ExpType><![CDATA[tools]]></ExpType>\n<NegativeFeedbackReason><![CDATA[不看此公众号]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容低质]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容重复]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容过时]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccountRecommend>\n</sysmsg>";
            } else if (i2 != 5) {
                str = "";
            } else {
                str = "<sysmsg type=\"BizRecommendNotify\">\n<BizAccountRecommend>\n<Title><![CDATA[推荐公众号]]></Title>\n\n<BizAccount>\n<UserName><![CDATA[gh_240fbf8b33e4]]></UserName>\n<NickName><![CDATA[36氪]]></NickName>\n<HeadImgUrl><![CDATA[]]></HeadImgUrl>\n<RecommendReason><![CDATA[36氪是中国领先的新商业媒体，提供新锐深度的商业报道。我们强调趋势与价值，我们的slogan是：让一部分人先看到未来。]]></RecommendReason>\n<Signature><![CDATA[36氪是中国领先的新商业媒体，提供新锐深度的商业报道。我们强调趋势与价值，我们的slogan是：让一部分人先看到未来。]]></Signature>\n<BrandIconUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_png/QicyPhNHD5vYf0JyXiavcUmicQ7icOk55ygRlyOhCa9r132trMAiaYtqL0QzacfMLPolhsiaXGibWC0JskibLic02W6Mw1g/0?wx_fmt=png]]></BrandIconUrl>\n<AppMsgRecReason><![CDATA[]]></AppMsgRecReason>\n\n<AppMsg>\n<Title><![CDATA[8点1氪：微信回应或遭苹果下架；格力口罩昨日开售：KN95每只5.5元；美股史上第二次触发熔断]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MzI2NDk5NzA0Mw==&mid=2247569208&idx=1&sn=27b7704f80c8271dcad2e52ee63cdf01&chksm=eaa79ee4ddd017f21d63e7a780c1941812f847bf968b40b2d81329b4e9f5a4f70f4e6e814c79#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/QicyPhNHD5vbhqC2kPdlU3tQrCiakmhHStEcNCOLwrocic2Vvr0J3qPNiaKYEn2vYIsQbGFBYM5PSAF9NecOalcnFw/0?wx_fmt=jpeg]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[https://mmbiz.qlogo.cn/mmbiz_jpg/QicyPhNHD5vbhqC2kPdlU3tQrCiakmhHStkWNVPziaEt1aEVBPnYyrzlpAbEXicqQ8zRmNgDBfupiccdibuBpeCHpKeQ/0?wx_fmt=jpeg]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>0</ItemShowType>\n<VideoId><![CDATA[]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>0</VideoDuration>\n<CreateTime>1583799540</CreateTime>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n</AppMsg>\n\n\n<NegativeFeedbackReason><![CDATA[对A1不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[对A2不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[对此公众号不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccount>\n\n<BizAccount>\n<UserName><![CDATA[gh_363b924965e9]]></UserName>\n<NickName><![CDATA[人民日报]]></NickName>\n<HeadImgUrl><![CDATA[]]></HeadImgUrl>\n<RecommendReason><![CDATA[参与、沟通、记录时代。]]></RecommendReason>\n<Signature><![CDATA[参与、沟通、记录时代。]]></Signature>\n<BrandIconUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_png/xrFYciaHL08CtD0lEHt59N8SQicW1gI0WjYKCEpzgRCPFBlJGI1rIfRl4bFSTLoFnI4iaylWmJVqd8semEK1OGylg/0?wx_fmt=png]]></BrandIconUrl>\n<AppMsgRecReason><![CDATA[]]></AppMsgRecReason>\n\n<AppMsg>\n<Title><![CDATA[发请柬啦！我们邀请所有人，共同见证一场盛大的婚礼！]]></Title>\n<Digest><![CDATA[]]></Digest>\n<ContentUrl><![CDATA[http://mp.weixin.qq.com/s?__biz=MjM5MjAxNDM4MA==&mid=2666316160&idx=1&sn=54684fd350167a7f3bed5bde5ce9dc64&chksm=bdb4a8c38ac321d5852e261a2e31f038fd0e98ec66bee2920d88ee4cdf11979bdede1e0c908e#rd]]></ContentUrl>\n<CoverImgUrl><![CDATA[http://mmbiz.qpic.cn/mmbiz_jpg/xrFYciaHL08AD1ynAav39zdY1WvI5bbsyACCQygrAQqFY1EZiaRwHJYMD7v2x2LLBp0YsHwku3In19N5D3aYZx9A/0?wx_fmt=jpeg]]></CoverImgUrl>\n<CoverImgUrl_1_1><![CDATA[https://mmbiz.qlogo.cn/mmbiz_jpg/xrFYciaHL08AD1ynAav39zdY1WvI5bbsy1kWLuqdNxNVFWIUWBC0DTgnyAkt5cAicI2DyfkVZ14Bx5oemgWmiaphg/0?wx_fmt=jpeg]]></CoverImgUrl_1_1>\n<CoverImgUrl_235_1><![CDATA[]]></CoverImgUrl_235_1>\n<ItemShowType>0</ItemShowType>\n<VideoId><![CDATA[]]></VideoId>\n<VideoWidth>0</VideoWidth>\n<VideoHeight>0</VideoHeight>\n<VideoDuration>0</VideoDuration>\n<CreateTime>1589804841</CreateTime>\n\n<ShowNegativeFeedbackReason>0</ShowNegativeFeedbackReason>\n<RecInfo><![CDATA[something]]></RecInfo>\n</AppMsg>\n\n\n<NegativeFeedbackReason><![CDATA[对D不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[对此公众号不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccount>\n\n<Pos>1</Pos>\n<Weight>200</Weight>\n<RecID>1589808970</RecID>\n<Style>103</Style>\n<Event></Event>\n<RecSummary><![CDATA[深度长文：美“印太战略”注定失败，中国有能力应付美国极端选择！]]></RecSummary>\n<CardId><![CDATA[" + str2 + "]]></CardId>\n<AggregationUrl><![CDATA[http://wwww.baidu.com]]></AggregationUrl>\n<AggregationTitle><![CDATA[大家都在看的大事件 >]]></AggregationTitle>\n<NegativeFeedbackReason><![CDATA[对A1不感兴趣对A1不感兴趣对A1不感兴趣对A1不感兴趣对A1不感兴趣对A1不感兴趣对A1不感兴趣对A1不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[对A2不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[内容质量低]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[对此公众号不感兴趣]]></NegativeFeedbackReason>\n\n<NegativeFeedbackReason><![CDATA[希望减少推荐]]></NegativeFeedbackReason>\n\n<ShowNegativeFeedbackReason>1</ShowNegativeFeedbackReason>\n</BizAccountRecommend>\n</sysmsg>";
            }
            C19636w0.m21168j(str, (Map<String, String>) null);
        }
    }

    /* renamed from: y */
    public static final void m21052y(int i) {
        m21053z("finderbiztest_missed_case" + i + ".xml", false);
    }

    /* renamed from: z */
    public static final void m21053z(String str, boolean z) {
        String str2;
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        try {
            String str3 = C112760b.m154195C() + "biztest/biztestcase/" + str;
            if (!C86013q1.m106450k(str3)) {
                str3 = C112760b.m154195C() + "biztest/" + str;
            }
            str2 = C86013q1.m106432N(str3);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BizTimeLineStorageLogicExKt", "tryInterceptBridgeScriptRequest, failed, ", e);
            str2 = "";
        }
        if (!Util.isNullOrNil(str2)) {
            C87412m.m108591d(str2);
            String n = C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(str2, "\n", "", false), " ", "", false), "ahref", "a href", false);
            if (z) {
                n = C112551y.m153814n(n, "mend>0", "mend>1", false);
            }
            int i = 2;
            if (true && true) {
                i = 2 | 64;
            }
            Pattern compile = Pattern.compile("(?<=<CardId>).*(?=</CardId>)", i);
            C87412m.m108593f(compile, "compile(pattern, ensureUnicodeCase(option.value))");
            String str4 = "testCardId:" + f55490a.mo122717f();
            C87412m.m108594g(str4, "replacement");
            String replaceAll = compile.matcher(n).replaceAll(str4);
            C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            C19636w0.m21168j(replaceAll, (Map<String, String>) null);
        }
    }
}
