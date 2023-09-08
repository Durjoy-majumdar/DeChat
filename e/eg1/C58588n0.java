package eg1;

import al1.C54130j;
import b50.C54407c;
import cl1.C39981t0;
import cl1.C54949c0;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di1.C7333c;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gg1.C32444a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc3.C34767b;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C110818d0;
import up1.C37521f;
import z04.C112551y;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: eg1.n0 */
public final class C58588n0 extends C86301e implements C54407c {
    public boolean B30() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86036B.mo60266n().intValue() == 1;
    }

    /* renamed from: GU */
    public boolean mo75192GU(String str) {
        C87412m.m108594g(str, DownloadInfo.UID);
        C54963d0 d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class);
        if (d0Var == null) {
            return false;
        }
        C54130j jVar = d0Var.f154073p;
        T t = null;
        if (C87412m.m108589b(jVar != null ? jVar.f151997a : null, str)) {
            C54130j jVar2 = d0Var.f154073p;
            if (jVar2 != null) {
                return jVar2.f152012p;
            }
            return false;
        }
        List<C54130j> list = d0Var.f154074q;
        C87412m.m108593f(list, "it.audienceLinkMicUserList");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C87412m.m108589b(((C54130j) next).f151997a, str)) {
                t = next;
                break;
            }
        }
        C54130j jVar3 = (C54130j) t;
        return jVar3 != null && jVar3.f152001e == 1;
    }

    /* renamed from: Gu */
    public int mo75193Gu() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86217y.mo60266n().intValue();
    }

    public boolean Ke0(String str) {
        int i;
        List<C54130j> list;
        T t;
        C87412m.m108594g(str, DownloadInfo.UID);
        C54963d0 d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class);
        if (!(d0Var == null || (list = d0Var.f154074q) == null)) {
            synchronized (list) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                        break;
                    }
                }
            }
            C54130j jVar = (C54130j) t;
            if (jVar != null) {
                i = jVar.f152018v;
                return C61926c.m72696u(i, 16);
            }
        }
        i = 0;
        return C61926c.m72696u(i, 16);
    }

    /* renamed from: L */
    public void mo75195L() {
        FinderLiveService.f159376d.getClass();
        C34767b.C34768c cVar = FinderLiveService.f159388r;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
    }

    /* renamed from: MH */
    public boolean mo75196MH() {
        C54949c0 c0Var = (C54949c0) FinderLiveService.f159376d.mo77630e(C54949c0.class);
        return c0Var != null && c0Var.mo75864e3();
    }

    /* renamed from: Q1 */
    public void mo75197Q1(String str, int i) {
        C54963d0 d0Var;
        String str2;
        T t;
        if (mo75202b5() && (d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class)) != null) {
            List<C54130j> l3 = d0Var.mo75929l3();
            C87412m.m108593f(l3, "it.allLinkMicUserList");
            Iterator<T> it = l3.iterator();
            while (true) {
                str2 = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                    break;
                }
            }
            if (t != null) {
                C54130j jVar = d0Var.f154073p;
                if (C87412m.m108589b(jVar != null ? jVar.f151997a : null, str)) {
                    C54130j jVar2 = d0Var.f154073p;
                    if (jVar2 != null && !jVar2.f152020x) {
                        return;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_REASON, i);
                C54130j jVar3 = d0Var.f154073p;
                if (jVar3 != null) {
                    str2 = jVar3.f151997a;
                }
                jSONObject.put("isPkAnchor", C87412m.m108589b(str2, str) ? 1 : 0);
                C13598b0 b0Var = C13598b0.f38549a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
                finderLiveErrorReportStruct.f155539e = 1005;
                finderLiveErrorReportStruct.mo76263s(n);
                Log.m105924i("FinderLiveMicReportUtil", "reportMicPv " + 1005 + " msg: " + n);
                finderLiveErrorReportStruct.mo86054n();
            }
        }
    }

    /* renamed from: R6 */
    public boolean mo75198R6() {
        C37521f.f99374d.getClass();
        return C37521f.f99304U7.mo60266n().intValue() == 1;
    }

    /* renamed from: R9 */
    public boolean mo75199R9() {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            return true;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99295T7.mo60266n().intValue() == 1;
    }

    public boolean W40() {
        C7333c<Boolean> cVar;
        C39981t0 t0Var = (C39981t0) FinderLiveService.f159376d.mo77630e(C39981t0.class);
        if (t0Var == null || (cVar = t0Var.f107198j) == null) {
            return false;
        }
        return C87412m.m108589b(cVar.getValue(), Boolean.TRUE);
    }

    /* renamed from: Xh */
    public boolean mo75201Xh() {
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        return C61926c.m72696u(oVar != null ? oVar.f154291a1 : 0, 524288);
    }

    /* renamed from: b5 */
    public boolean mo75202b5() {
        return C62042e.f176370a.mo87030O0();
    }

    /* renamed from: d2 */
    public void mo75203d2() {
        FinderLiveService.f159376d.mo77608K();
    }

    /* renamed from: eI */
    public boolean mo75204eI() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86209w.mo60266n().intValue() == 1;
    }

    /* renamed from: gB */
    public boolean mo75205gB() {
        C54963d0 d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class);
        if (d0Var != null) {
            return d0Var.mo75912T3();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r2 = (r2 = (r2 = r2.f154341n).objectDesc).liveDesc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getCoverUrl() {
        /*
            r5 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r2 = r1.mo77630e(r0)
            cl1.o r2 = (cl1.C54991o) r2
            if (r2 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
            if (r2 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x001b
            te3.px0 r2 = r2.liveDesc
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r2.f184911d
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0027
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0050
            androidx.lifecycle.i0 r0 = r1.mo77630e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x004f
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
            if (r0 == 0) goto L_0x004f
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x004f
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.url
            if (r0 != 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r0
            goto L_0x0050
        L_0x004f:
            r2 = r4
        L_0x0050:
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r4 = r2
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C58588n0.getCoverUrl():java.lang.String");
    }

    public boolean o60(String str) {
        T t;
        C87412m.m108594g(str, "userId");
        C54963d0 d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class);
        if (d0Var == null) {
            return false;
        }
        List<C54130j> list = d0Var.f154076s;
        C87412m.m108593f(list, "it.linkMicUserInfoList");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                break;
            }
        }
        C54130j jVar = (C54130j) t;
        return jVar != null && jVar.f152001e == 2;
    }

    public int rp0(String str) {
        C54963d0 d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class);
        if (d0Var == null) {
            return 0;
        }
        List<C54130j> list = d0Var.f154076s;
        C87412m.m108593f(list, "it.linkMicUserInfoList");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (C87412m.m108589b(((C54130j) next).f151997a, str)) {
                arrayList.add(next);
            }
        }
        C54130j jVar = (C54130j) C110818d0.m150917O(arrayList, 0);
        Integer valueOf = jVar != null ? Integer.valueOf(jVar.f152019w) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* renamed from: sU */
    public boolean mo75209sU() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86221z.mo60266n().intValue() == 1;
    }

    /* renamed from: y4 */
    public void mo75210y4(String str) {
        C54963d0 d0Var;
        T t;
        if (mo75202b5() && (d0Var = (C54963d0) FinderLiveService.f159376d.mo77630e(C54963d0.class)) != null) {
            C54130j jVar = d0Var.f154073p;
            String str2 = null;
            if (C87412m.m108589b(jVar != null ? jVar.f151997a : null, str)) {
                C54130j jVar2 = d0Var.f154073p;
                boolean z = true;
                if (jVar2 == null || !jVar2.f152020x) {
                    z = false;
                }
                if (z) {
                    if (true && true) {
                        str2 = "";
                    }
                    FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
                    finderLiveErrorReportStruct.f155539e = 1002;
                    finderLiveErrorReportStruct.mo76263s(str2);
                    Log.m105924i("FinderLiveMicReportUtil", "reportMicPv " + 1002 + " msg: " + str2);
                    finderLiveErrorReportStruct.mo86054n();
                    return;
                }
                return;
            }
            List<C54130j> list = d0Var.f154074q;
            C87412m.m108593f(list, "it.audienceLinkMicUserList");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                    break;
                }
            }
            if (t != null) {
                if (true && true) {
                    str2 = "";
                }
                FinderLiveErrorReportStruct finderLiveErrorReportStruct2 = new FinderLiveErrorReportStruct();
                finderLiveErrorReportStruct2.f155539e = 1004;
                finderLiveErrorReportStruct2.mo76263s(str2);
                Log.m105924i("FinderLiveMicReportUtil", "reportMicPv " + 1004 + " msg: " + str2);
                finderLiveErrorReportStruct2.mo86054n();
            }
        }
    }
}
