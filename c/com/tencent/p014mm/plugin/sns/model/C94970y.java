package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1795c0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.e64;
import te3.f64;
import te3.g84;
import te3.h64;
import te3.m64;
import te3.n64;
import te3.w64;

/* renamed from: com.tencent.mm.plugin.sns.model.y */
public class C94970y extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f275316d;

    /* renamed from: e */
    public String f275317e;

    /* renamed from: f */
    public int f275318f;

    /* renamed from: g */
    public n64 f275319g;

    /* renamed from: h */
    public C11385n f275320h;

    /* renamed from: i */
    public SnsInfo f275321i;

    /* renamed from: j */
    public SnsObject f275322j;

    /* renamed from: n */
    public int f275323n = 0;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94970y(te3.n64 r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f275323n = r0
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.e64 r2 = new te3.e64
            r2.<init>()
            r1.f127066a = r2
            te3.f64 r2 = new te3.f64
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/mmsnsadcomment"
            r1.f127068c = r2
            r2 = 682(0x2aa, float:9.56E-43)
            r1.f127069d = r2
            r1.f127070e = r0
            r1.f127071f = r0
            ob0.c r1 = r1.mo72403a()
            r9.f275316d = r1
            ob0.c$c r1 = r1.f127055a
            pe3.a r1 = r1.f127080a
            te3.e64 r1 = (te3.e64) r1
            r1.f132736d = r10
            te3.m64 r2 = r10.f298899f
            int r2 = r2.f298777h
            r9.f275318f = r2
            r9.f275319g = r10
            r1.f132737e = r11
            r1.f132741i = r13
            r9.f275317e = r11
            long r2 = r10.f298897d
            java.lang.String r11 = "parseStatSnsAdInfo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            os2.j r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r5 = r5.mo139864jo(r2)
            r6 = 1
            java.lang.String r7 = "parseStatSnsAdInfo snsInfo null, snsId %d"
            java.lang.String r8 = "SnsAdExtUtil"
            if (r5 == 0) goto L_0x0077
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r5.getTimeLine()
            if (r5 == 0) goto L_0x006b
            java.lang.String r0 = r5.statExtStr
            te3.cb4 r0 = com.tencent.p014mm.modelstat.C92859v.m117129g(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            goto L_0x0086
        L_0x006b:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5[r0] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r7, r5)
            goto L_0x0082
        L_0x0077:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5[r0] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r7, r5)
        L_0x0082:
            r0 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
        L_0x0086:
            if (r0 == 0) goto L_0x0096
            java.lang.String r11 = com.tencent.p014mm.modelstat.C92859v.m117128f(r0)
            te3.rv3 r11 = sf0.C48374j0.m53720i(r11)
            r1.f132740h = r11
            int r11 = r0.f298025g
            r1.f132739g = r11
        L_0x0096:
            java.lang.String r11 = ""
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r11)
            te3.rv3 r11 = sf0.C48374j0.m53720i(r11)
            r1.f132738f = r11
            boolean r11 = lo2.C99569s.m129964f()
            if (r11 == 0) goto L_0x00b5
            r11 = 6
            boolean r11 = xb0.C102609h.m135510UY(r11)
            r1.f132742j = r11
            boolean r11 = com.tencent.p014mm.modelimage.C92856r0.m117121g()
            r1.f132743n = r11
        L_0x00b5:
            r9.f275323n = r13
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.m64 r0 = r10.f298899f
            java.lang.String r0 = r0.f298773d
            r11.append(r0)
            java.lang.String r0 = " "
            r11.append(r0)
            te3.m64 r0 = r10.f298899f
            java.lang.String r0 = r0.f298774e
            r11.append(r0)
            java.lang.String r0 = " type "
            r11.append(r0)
            te3.m64 r10 = r10.f298899f
            int r10 = r10.f298777h
            r11.append(r10)
            java.lang.String r10 = " aduxinfo "
            r11.append(r10)
            r11.append(r12)
            java.lang.String r10 = ", SnsStat="
            r11.append(r10)
            te3.rv3 r10 = r1.f132740h
            r11.append(r10)
            java.lang.String r10 = ", source="
            r11.append(r10)
            int r10 = r1.f132739g
            r11.append(r10)
            java.lang.String r10 = ", scene="
            r11.append(r10)
            r11.append(r13)
            java.lang.String r10 = ", supportH265 = "
            r11.append(r10)
            int r10 = r1.f132742j
            r11.append(r10)
            java.lang.String r10 = ", supportWebP = "
            r11.append(r10)
            int r10 = r1.f132743n
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "MicroMsg.NetSceneSnsAdComment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94970y.<init>(te3.n64, java.lang.String, java.lang.String, int):void");
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        this.f275320h = nVar;
        int dispatch = dispatch(gVar, this.f275316d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        return C1795c0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsObject snsObject;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        Log.m105918d("MicroMsg.NetSceneSnsAdComment", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            C94866e1.Rx0().mo130961t(this.f275319g.f298897d, this.f275318f, this.f275317e);
            SnsMethodCalculate.markStartTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            m64 m64 = this.f275319g.f298899f;
            int i4 = m64.f298777h;
            int i5 = 2;
            int i6 = 1;
            if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 8 || i4 == 16) {
                w64 w64 = new w64();
                w64.f299708i = m64.f298779j;
                w64.f299706g = m64.f298777h;
                w64.f299705f = m64.f298778i;
                w64.f299703d = m64.f298773d;
                w64.f299704e = m64.f298775f;
                w64.f299707h = m64.f298780n;
                w64.f299716t = m64.f298787u;
                try {
                    C47350c cVar = this.f275316d;
                    f64 f64 = (f64) cVar.f127056b.f127083a;
                    int i7 = ((e64) cVar.f127055a.f127080a).f132739g;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            synchronized (C94833a.f274740a) {
                                h64 h64 = f64.f133319d;
                                snsObject = h64.f134464d;
                                boolean z2 = C94833a.m120155h() == 1;
                                String str2 = "";
                                if (z2) {
                                    z = C94833a.m120172y(h64);
                                    if (z) {
                                        String g = C48374j0.m53718g(h64.f134467g);
                                        if (g == null) {
                                            g = "";
                                        }
                                        str2 = g;
                                        C115669n.INSTANCE.mo175911u(1802, 2);
                                    } else {
                                        C115669n.INSTANCE.mo175911u(1802, 3);
                                    }
                                } else {
                                    z = false;
                                }
                                if (!z2) {
                                    i5 = 0;
                                }
                                if (!z2 || z) {
                                    i6 = i5;
                                }
                                Log.m105924i("MicroMsg.NetSceneSnsAdComment", "adDynamic, graySwitch=" + z2 + ", isValid=" + z + ", replaceMode=" + i6 + ", dynamicAdInfoStr=" + str2);
                                SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                                C94833a.m120165r(h64, str2, i6, false);
                                SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                            }
                            this.f275322j = snsObject;
                            Log.m105918d("MicroMsg.NetSceneSnsAdComment", "snsComment:" + snsObject.toString() + " " + snsObject.LikeUserList.size() + " " + snsObject.CommentUserList.size());
                            SnsMethodCalculate.markEndTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                        }
                    }
                    g84 g84 = f64.f133320e;
                    snsObject = g84.f133930d;
                    Object obj = C94833a.f274740a;
                    SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    h64 d = C94833a.m120151d(g84);
                    SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    SnsMethodCalculate.markStartTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    C94833a.m120165r(d, "", 0, false);
                    SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    SnsMethodCalculate.markEndTimeMs("replaceObj", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
                    this.f275322j = snsObject;
                    Log.m105918d("MicroMsg.NetSceneSnsAdComment", "snsComment:" + snsObject.toString() + " " + snsObject.LikeUserList.size() + " " + snsObject.CommentUserList.size());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneSnsAdComment", e, "", new Object[0]);
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                    throw th;
                }
                SnsMethodCalculate.markEndTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            } else {
                SnsMethodCalculate.markEndTimeMs("mergeToDb", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            }
            C94866e1.Rx0().mo130950e();
        } else if (i2 == 4) {
            C94866e1.Rx0().mo130961t(this.f275319g.f298897d, this.f275318f, this.f275317e);
        }
        this.f275320h.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
    }
}
