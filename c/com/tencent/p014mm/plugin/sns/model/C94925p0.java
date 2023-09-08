package com.tencent.p014mm.plugin.sns.model;

import android.graphics.BitmapFactory;
import android.util.Pair;
import as2.C28125b;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsErrorCommonReportStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C94994j;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import os2.C100406i0;
import os2.C100408j0;
import p1081gi.C98118a;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import te3.C101821nv2;
import te3.C51018qv3;
import te3.C64376fv2;
import te3.t64;
import te3.x84;
import te3.y84;

/* renamed from: com.tencent.mm.plugin.sns.model.p0 */
public class C94925p0 extends C117747y implements C1311n {

    /* renamed from: z */
    public static int f275099z;

    /* renamed from: d */
    public int f275100d = 8192;

    /* renamed from: e */
    public C47350c f275101e;

    /* renamed from: f */
    public int f275102f;

    /* renamed from: g */
    public int f275103g;

    /* renamed from: h */
    public String f275104h;

    /* renamed from: i */
    public String f275105i;

    /* renamed from: j */
    public x84 f275106j;

    /* renamed from: n */
    public int f275107n;

    /* renamed from: o */
    public String f275108o;

    /* renamed from: p */
    public C11385n f275109p;

    /* renamed from: q */
    public String f275110q;

    /* renamed from: r */
    public boolean f275111r;

    /* renamed from: s */
    public boolean f275112s;

    /* renamed from: t */
    public boolean f275113t;

    /* renamed from: u */
    public long f275114u;

    /* renamed from: v */
    public long f275115v;

    /* renamed from: w */
    public int f275116w;

    /* renamed from: x */
    public int f275117x;

    /* renamed from: y */
    public C98124g.C98125a f275118y;

    /* renamed from: com.tencent.mm.plugin.sns.model.p0$a */
    public class C94926a implements C98124g.C98125a {

        /* renamed from: com.tencent.mm.plugin.sns.model.p0$a$a */
        public class C94927a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C94925p0 f275120d;

            /* renamed from: e */
            public final /* synthetic */ String f275121e;

            /* renamed from: f */
            public final /* synthetic */ String f275122f;

            public C94927a(C94926a aVar, C94925p0 p0Var, String str, String str2) {
                this.f275120d = p0Var;
                this.f275121e = str;
                this.f275122f = str2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1$1");
                C94843b1 Rx0 = C94866e1.Rx0();
                C94925p0 p0Var = this.f275120d;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                int i = p0Var.f275107n;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                Rx0.mo130958q(i, this.f275120d.hashCode());
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(this.f275120d);
                SnsErrorCommonReportStruct snsErrorCommonReportStruct = new SnsErrorCommonReportStruct();
                snsErrorCommonReportStruct.f266010d = 1;
                snsErrorCommonReportStruct.f266011e = snsErrorCommonReportStruct.mo86045b("StringParam1", this.f275121e, true);
                snsErrorCommonReportStruct.f266012f = snsErrorCommonReportStruct.mo86045b("StringParam2", this.f275122f, true);
                snsErrorCommonReportStruct.mo86054n();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1$1");
            }
        }

        public C94926a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            boolean z2;
            int i2 = i;
            C98121d dVar2 = dVar;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
            if (i2 == -21005) {
                Log.m105919d("MicroMsg.NetSceneSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", C94925p0.this.f275110q, Integer.valueOf(i), cVar, dVar2);
                C94925p0 p0Var = C94925p0.this;
                p0Var.f275109p.onSceneEnd(3, -1, "doScene failed", p0Var);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
                return 0;
            } else if (dVar2 != null && dVar2.field_retCode == 0) {
                Log.m105925i("MicroMsg.NetSceneSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", C94925p0.this.f275110q, Integer.valueOf(i), cVar, dVar2);
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                int i3 = C94925p0.f275099z;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                if (i3 < 5) {
                    C94928p2 gy02 = C94866e1.gy0();
                    String str2 = dVar2.field_fileUrl;
                    gy02.getClass();
                    SnsMethodCalculate.markStartTimeMs("checkUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
                    Iterator<Pair<String, String>> it = gy02.mo131196g().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next().first).equals(str2)) {
                                SnsMethodCalculate.markEndTimeMs("checkUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
                                z2 = true;
                                break;
                            }
                        } else {
                            SnsMethodCalculate.markEndTimeMs("checkUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        Log.m105921e("MicroMsg.NetSceneSnsUpload", "url error get another url. url:%s", dVar2.field_fileUrl);
                        SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        C94925p0.f275099z++;
                        SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        C94925p0 p0Var2 = C94925p0.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        int i4 = p0Var2.f275107n;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        C94925p0 p0Var3 = C94925p0.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        String str3 = p0Var3.f275108o;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        C94925p0 p0Var4 = C94925p0.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        boolean z3 = p0Var4.f275113t;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        C94925p0 p0Var5 = C94925p0.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        int i5 = p0Var5.f275117x;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        C94925p0 p0Var6 = new C94925p0(i4, str3, z3, i5);
                        String str4 = dVar2.field_fileUrl;
                        C94866e1.gy0().getClass();
                        SnsMethodCalculate.markStartTimeMs("getRecentUploadUrlString", "com.tencent.mm.plugin.sns.model.UploadManager");
                        String string = MultiProcessMMKV.getMMKV("SnsMMKV").getString("SnsMMKVUploadUrl", "");
                        SnsMethodCalculate.markEndTimeMs("getRecentUploadUrlString", "com.tencent.mm.plugin.sns.model.UploadManager");
                        C94866e1.my0().post(new C94927a(this, p0Var6, str4, string));
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
                        return 0;
                    }
                }
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                C94925p0.f275099z = 0;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                C94928p2 gy03 = C94866e1.gy0();
                String str5 = dVar2.field_fileUrl;
                gy03.getClass();
                SnsMethodCalculate.markStartTimeMs("insertRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
                if (gy03.mo131196g().size() >= 10) {
                    do {
                        gy03.mo131196g().removeFirst();
                    } while (gy03.mo131196g().size() >= 10);
                }
                gy03.mo131196g().addLast(new Pair(str5, Long.toString(System.currentTimeMillis())));
                MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVUploadUrl", Util.linkedListPairToString(gy03.mo131196g(), " "));
                SnsMethodCalculate.markEndTimeMs("insertRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
                C94925p0.this.mo131187m1(dVar2.field_fileUrl, 1, dVar2.field_thumbUrl, 1, "upload_" + C94925p0.this.f275110q, dVar2.field_filemd5);
                StringBuilder sb = new StringBuilder();
                sb.append("uploadsns cdndone pass: ");
                long currentTimeMillis = System.currentTimeMillis();
                C94925p0 p0Var7 = C94925p0.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                long j = p0Var7.f275114u;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                sb.append(currentTimeMillis - j);
                sb.append(" ");
                sb.append(dVar2.field_filemd5);
                Log.m105924i("MicroMsg.NetSceneSnsUpload", sb.toString());
                C94925p0 p0Var8 = C94925p0.this;
                p0Var8.f275109p.onSceneEnd(0, 0, "doScene", p0Var8);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
                return 0;
            } else if (dVar2 != null && dVar2.field_retCode != 0) {
                Log.m105925i("MicroMsg.NetSceneSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", C94925p0.this.f275110q, Integer.valueOf(i), cVar, dVar2);
                C94925p0 p0Var9 = C94925p0.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                int i6 = p0Var9.f275117x;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                if (i6 == 21) {
                    int i7 = dVar2.field_retCode;
                    if (i7 <= -10000 && i7 > -20000) {
                        C28125b.m38099a(10);
                    } else if (i7 <= -20000 && i7 >= -22000) {
                        C28125b.m38099a(11);
                    } else if (i7 > -5103000 || i7 < -5103087) {
                        C28125b.m38099a(15);
                    } else {
                        C28125b.m38099a(9);
                    }
                }
                C94925p0 p0Var10 = C94925p0.this;
                int i8 = dVar2.field_retCode;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                p0Var10.getClass();
                SnsMethodCalculate.markStartTimeMs("processError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                int i9 = 0;
                while (true) {
                    int[] iArr = C98118a.f287606a;
                    if (i9 >= 6) {
                        p0Var10.mo131185k1();
                        SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        break;
                    } else if (i8 == iArr[i9]) {
                        p0Var10.mo131186l1(0);
                        SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                        break;
                    } else {
                        i9++;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                C94925p0 p0Var11 = C94925p0.this;
                p0Var11.f275109p.onSceneEnd(3, -1, "doScene failed", p0Var11);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
                return 0;
            } else if (i2 != 0) {
                Log.m105925i("MicroMsg.NetSceneSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", C94925p0.this.f275110q, Integer.valueOf(i), cVar, dVar2);
                C94925p0 p0Var12 = C94925p0.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                p0Var12.mo131186l1(0);
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                C94925p0 p0Var13 = C94925p0.this;
                p0Var13.f275109p.onSceneEnd(3, -1, "doScene failed", p0Var13);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
                return 0;
            } else {
                Log.m105919d("MicroMsg.NetSceneSnsUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", C94925p0.this.f275110q, Integer.valueOf(i), cVar, dVar2);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
            SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
            SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x02d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94925p0(int r11, java.lang.String r12, boolean r13, int r14) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 8192(0x2000, float:1.14794E-41)
            r10.f275100d = r0
            r0 = 0
            r10.f275102f = r0
            java.lang.String r1 = ""
            r10.f275104h = r1
            r10.f275105i = r1
            r10.f275107n = r0
            r10.f275108o = r1
            r10.f275110q = r1
            r10.f275111r = r0
            r10.f275112s = r0
            r10.f275113t = r0
            r2 = 0
            r10.f275114u = r2
            r10.f275115v = r2
            r10.f275116w = r0
            r10.f275117x = r0
            com.tencent.mm.plugin.sns.model.p0$a r4 = new com.tencent.mm.plugin.sns.model.p0$a
            r4.<init>()
            r10.f275118y = r4
            long r4 = java.lang.System.currentTimeMillis()
            r10.f275114u = r4
            r10.f275107n = r11
            r10.f275108o = r12
            r10.f275117x = r14
            ob0.c$b r12 = new ob0.c$b
            r12.<init>()
            te3.x84 r14 = new te3.x84
            r14.<init>()
            r12.f127066a = r14
            te3.y84 r14 = new te3.y84
            r14.<init>()
            r12.f127067b = r14
            java.lang.String r14 = "/cgi-bin/micromsg-bin/mmsnsupload"
            r12.f127068c = r14
            r14 = 207(0xcf, float:2.9E-43)
            r12.f127069d = r14
            r14 = 95
            r12.f127070e = r14
            r14 = 1000000095(0x3b9aca5f, float:0.0047238315)
            r12.f127071f = r14
            ob0.c r12 = r12.mo72403a()
            r10.f275101e = r12
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            te3.x84 r12 = (te3.x84) r12
            r10.f275106j = r12
            os2.j0 r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            long r4 = (long) r11
            os2.i0 r12 = r12.mo139867LL(r4)
            r10.f275113t = r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "start snsupload netscene localId "
            r14.append(r4)
            r14.append(r11)
            java.lang.String r4 = "  offset "
            r14.append(r4)
            int r4 = r12.mo139850d()
            r14.append(r4)
            java.lang.String r4 = " path "
            r14.append(r4)
            java.lang.String r4 = r12.mo139851e()
            r14.append(r4)
            java.lang.String r4 = " totallen "
            r14.append(r4)
            int r4 = r12.mo139852f()
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            java.lang.String r4 = "MicroMsg.NetSceneSnsUpload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            com.tencent.p014mm.plugin.sns.statistics.C95003w.m120755c(r11)
            r11 = 1
            if (r13 != 0) goto L_0x00c1
            te3.x84 r13 = r10.f275106j
            r13.f299873t = r11
            java.lang.String r13 = "this is single upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
        L_0x00c1:
            te3.nv2 r13 = new te3.nv2     // Catch:{ Exception -> 0x02e2 }
            r13.<init>()     // Catch:{ Exception -> 0x02e2 }
            byte[] r14 = r12.mo139854h()     // Catch:{ Exception -> 0x02e2 }
            pe3.a r13 = r13.parseFrom(r14)     // Catch:{ Exception -> 0x02e2 }
            te3.nv2 r13 = (te3.C101821nv2) r13     // Catch:{ Exception -> 0x02e2 }
            java.lang.String r14 = r12.mo139851e()
            java.lang.String r14 = vr2.C102236a0.m134733a0(r14)
            r10.f275105i = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r6 = r12.mo139851e()
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r5, r6)
            r14.append(r5)
            java.lang.String r5 = r10.f275105i
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            r10.f275104h = r14
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r14)
            int r14 = (int) r5
            r10.f275103g = r14
            java.lang.String r14 = r10.f275104h
            java.lang.String r5 = "isLongPic"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r7 = 2
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x012b }
            r8.<init>()     // Catch:{ Exception -> 0x012b }
            r8.inJustDecodeBounds = r11     // Catch:{ Exception -> 0x012b }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r14, r8)     // Catch:{ Exception -> 0x012b }
            int r14 = r8.outWidth     // Catch:{ Exception -> 0x012b }
            int r8 = r8.outHeight     // Catch:{ Exception -> 0x012b }
            int r9 = r14 * 2
            if (r8 >= r9) goto L_0x0126
            int r8 = r8 * 2
            if (r14 < r8) goto L_0x0122
            goto L_0x0126
        L_0x0122:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x0135
        L_0x0126:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r14 = 1
            goto L_0x0136
        L_0x012b:
            java.lang.String r14 = "MicroMsg.SnsUtil"
            java.lang.String r8 = "get error setImageExtInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x0135:
            r14 = 0
        L_0x0136:
            r10.f275111r = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "totallen "
            r14.append(r5)
            int r5 = r10.f275103g
            r14.append(r5)
            java.lang.String r5 = " isLongPic: "
            r14.append(r5)
            boolean r5 = r10.f275111r
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            java.lang.String r14 = r13.f298922p
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r5 == 0) goto L_0x0197
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            byte[] r14 = r14.getBytes()
            java.lang.String r14 = p823sg.C90193h.m112878f(r14)
            r13.f298922p = r14
            byte[] r5 = r13.toByteArray()     // Catch:{ Exception -> 0x0191 }
            r12.mo139858l(r5)     // Catch:{ Exception -> 0x0191 }
            os2.j0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()     // Catch:{ Exception -> 0x0191 }
            int r6 = r12.mo139849c()     // Catch:{ Exception -> 0x0191 }
            r5.r50(r6, r12)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0197
        L_0x0191:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r5, r1, r6)
        L_0x0197:
            te3.x84 r5 = r10.f275106j
            int r6 = r10.f275103g
            r5.f299863g = r6
            int r6 = r12.mo139850d()
            r5.f299861e = r6
            te3.x84 r5 = r10.f275106j
            r5.f299865i = r14
            r10.f275110q = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "filter style "
            r14.append(r5)
            int r5 = r13.f298913d
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r14)
            te3.x84 r14 = r10.f275106j
            int r5 = r13.f298913d
            r14.f299866j = r5
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "syncWeibo "
            r14.append(r5)
            int r5 = r13.f298914e
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r14)
            te3.x84 r14 = r10.f275106j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r13.f298921o
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r14.f299868o = r1
            te3.x84 r14 = r10.f275106j
            int r1 = r13.f298914e
            r14.f299867n = r1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "request upload type "
            r14.append(r1)
            int r1 = r12.mo139853g()
            r14.append(r1)
            java.lang.String r1 = " md5: "
            r14.append(r1)
            java.lang.String r1 = r13.f298929w
            r14.append(r1)
            java.lang.String r1 = " appid "
            r14.append(r1)
            java.lang.String r1 = r13.f298930x
            r14.append(r1)
            java.lang.String r1 = " contenttype "
            r14.append(r1)
            int r1 = r13.f298931y
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            te3.x84 r14 = r10.f275106j
            int r12 = r12.mo139853g()
            r14.f299860d = r12
            te3.ek4 r12 = new te3.ek4
            r12.<init>()
            java.lang.String r14 = r13.f298923q
            r12.f182993d = r14
            java.lang.String r14 = r13.f298924r
            r12.f182994e = r14
            te3.x84 r14 = r10.f275106j
            r14.f299871r = r12
            java.lang.String r12 = r13.f298929w
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0255
            te3.x84 r12 = r10.f275106j
            java.lang.String r14 = r13.f298929w
            r12.f299874u = r14
        L_0x0255:
            java.lang.String r12 = r13.f298930x
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0263
            te3.x84 r12 = r10.f275106j
            java.lang.String r14 = r13.f298930x
            r12.f299872s = r14
        L_0x0263:
            te3.x84 r12 = r10.f275106j
            int r13 = r13.f298931y
            r12.f299875v = r13
            boolean r13 = sf0.C90188n0.f258936d
            if (r13 == 0) goto L_0x026f
            r12.f299860d = r0
        L_0x026f:
            long r12 = r10.f275115v
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x027f
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r10.f275115v = r12
            r12 = 20201(0x4ee9, float:2.8308E-41)
            r10.f275116w = r12
        L_0x027f:
            te3.x84 r12 = r10.f275106j
            java.lang.Class<qo.l> r13 = p663qo.C101213l.class
            java.lang.String r14 = "isUserCdn"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r1)
            di3.d r2 = di3.C86312j.m106911c(r13)
            qo.l r2 = (p663qo.C101213l) r2
            r3 = 32
            boolean r2 = r2.dm0(r3)
            if (r2 != 0) goto L_0x02b4
            java.lang.Object[] r12 = new java.lang.Object[r11]
            di3.d r13 = di3.C86312j.m106911c(r13)
            qo.l r13 = (p663qo.C101213l) r13
            boolean r13 = r13.dm0(r3)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12[r0] = r13
            java.lang.String r13 = "cdntra not use cdn flag:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r13, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r1)
            goto L_0x02d3
        L_0x02b4:
            int r13 = sf0.C90188n0.f258909C
            if (r13 != r7) goto L_0x02bc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r1)
            goto L_0x02d3
        L_0x02bc:
            java.lang.String r12 = r12.f299865i
            r10.f275110q = r12
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x02cf
            java.lang.String r12 = "cdntra genClientId failed not use cdn"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r1)
            goto L_0x02d3
        L_0x02cf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r1)
            r0 = 1
        L_0x02d3:
            if (r0 == 0) goto L_0x02d8
            r10.f275112s = r11
            return
        L_0x02d8:
            boolean r11 = r10.mo131188n1()
            if (r11 != 0) goto L_0x02e1
            r10.mo131185k1()
        L_0x02e1:
            return
        L_0x02e2:
            java.lang.String r11 = "parseFrom MediaUploadInfo error in NetSceneSnsUpload"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94925p0.<init>(int, java.lang.String, boolean, int):void");
    }

    public void cancel() {
        SnsMethodCalculate.markStartTimeMs("cancel", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        super.cancel();
        if (this.f275112s && !Util.isNullOrNil(this.f275110q)) {
            Log.m105924i("MicroMsg.NetSceneSnsUpload", "cancel by cdn " + this.f275110q);
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(this.f275110q);
        }
        SnsMethodCalculate.markEndTimeMs("cancel", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        this.f275109p = nVar;
        if (this.f275112s) {
            x84 x84 = this.f275106j;
            Class cls = C101213l.class;
            SnsMethodCalculate.markStartTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            String str = x84.f299865i;
            this.f275110q = str;
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.NetSceneSnsUpload", "cdntra genClientId failed not use cdn");
                SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else {
                C98124g gVar2 = new C98124g();
                gVar2.f287660d = "task_NetSceneSnsUpload_1";
                gVar2.f287662f = this.f275118y;
                gVar2.field_mediaId = this.f275110q;
                gVar2.field_fullpath = this.f275104h;
                gVar2.field_thumbpath = "";
                gVar2.field_fileType = this.f275116w;
                gVar2.field_talker = "";
                gVar2.field_priority = 2;
                gVar2.field_needStorage = true;
                gVar2.field_isStreamMedia = false;
                if (C100408j0.m131390gY()) {
                    gVar2.field_appType = this.f275113t ? 114 : 113;
                } else {
                    int i = 108;
                    if (C100408j0.m131385TY()) {
                        if (!this.f275113t) {
                            i = 107;
                        }
                        gVar2.field_appType = i;
                    } else if (C100408j0.m131381NQ()) {
                        if (!this.f275113t) {
                            i = 107;
                        }
                        gVar2.field_appType = i;
                    } else if (((C101213l) C86312j.m106911c(cls)).dm0(64)) {
                        gVar2.field_appType = this.f275113t ? 104 : 103;
                    } else {
                        gVar2.field_appType = this.f275113t ? 101 : 100;
                    }
                }
                gVar2.field_bzScene = 1;
                if (!((C101213l) C86312j.m106911c(cls)).if0(gVar2)) {
                    Log.m105921e("MicroMsg.NetSceneSnsUpload", "cdntra addSendTask failed. clientid:%s", this.f275110q);
                    this.f275110q = "";
                    SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                } else {
                    SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                }
            }
            SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return 0;
        }
        int dispatch = dispatch(gVar, this.f275101e, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return 207;
    }

    /* renamed from: j1 */
    public int mo131184j1() {
        SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        int i = this.f275107n;
        SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return i;
    }

    /* renamed from: k1 */
    public final void mo131185k1() {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) this.f275107n);
        LL.mo139855i(0);
        try {
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
            nv22.f298922p = "";
            LL.mo139858l(nv22.toByteArray());
            C94866e1.ay0().r50(this.f275107n, LL);
            C94866e1.Rx0().mo130965x(this.f275107n);
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.NetSceneSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        }
    }

    /* renamed from: l1 */
    public final void mo131186l1(int i) {
        SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) this.f275107n);
        try {
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
            nv22.f298920n = 1;
            nv22.f298925s = i;
            LL.mo139858l(nv22.toByteArray());
        } catch (Exception unused) {
        }
        C94866e1.Rx0().mo130965x(this.f275107n);
        C94866e1.ay0().r50(this.f275107n, LL);
        SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    /* renamed from: m1 */
    public boolean mo131187m1(String str, int i, String str2, int i2, String str3, String str4) {
        C101821nv2 nv22;
        int queryQuality;
        String str5 = str;
        int i3 = i;
        String str6 = str3;
        SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) mo131184j1());
        Log.m105924i("MicroMsg.NetSceneSnsUpload", "upload ok " + str5 + "  " + str6 + "  " + i3 + " thumbUrl: " + str2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(this.f275104h, options);
        String str7 = options.outMimeType;
        String lowerCase = str7 != null ? str7.toLowerCase() : "";
        int i4 = -1;
        if ((lowerCase.endsWith("jpg") || lowerCase.endsWith("jpeg")) && (queryQuality = MMNativeJpeg.queryQuality(this.f275104h)) != 0) {
            i4 = queryQuality;
        }
        long l = C86013q1.m106451l(this.f275104h);
        String str8 = options.outMimeType;
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        Map<String, C94994j.C94996b> map = C94994j.f275602a;
        String str9 = "onPostScene";
        String str10 = "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload";
        SnsMethodCalculate.markStartTimeMs("reportImgUploadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        String str11 = "MicroMsg.NetSceneSnsUpload";
        String str12 = "";
        try {
            C94994j.C94997c cVar = new C94994j.C94997c((C94994j.C94995a) null);
            String b = C94994j.m120748b(str);
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.f275613a = b;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.f275614b = str8;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.f275615c = i5;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.f275616d = i6;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.f275617e = i4;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            cVar.f275618f = l;
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            String a = C94994j.C94997c.m120752a(cVar);
            Log.m105924i("MicroMsg.SnsImgStats", "report up: " + a);
            C115669n.INSTANCE.kvStat(13512, a);
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("reportImgUploadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        LL.mo139856j(str6);
        try {
            nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
        } catch (Exception unused2) {
            nv22 = null;
        }
        if (nv22 == null) {
            nv22 = new C101821nv2();
        }
        C64376fv2 fv22 = new C64376fv2();
        fv22.f183229e = i3;
        fv22.f183228d = str5;
        nv22.f298916g = fv22;
        nv22.f298920n = 0;
        nv22.f298929w = str4;
        if (!Util.isNullOrNil(str2)) {
            C64376fv2 fv23 = new C64376fv2();
            fv23.f183229e = i2;
            fv23.f183228d = str2;
            nv22.f298918i.add(fv23);
        }
        try {
            LL.mo139858l(nv22.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace(str11, e, str12, new Object[0]);
        }
        LL.mo139859m();
        C94866e1.ay0().r50(mo131184j1(), LL);
        C94866e1.Rx0().mo130965x(this.f275107n);
        if (C94866e1.gy0() != null) {
            C94866e1.gy0().mo131192c();
        }
        SnsMethodCalculate.markEndTimeMs(str9, str10);
        return true;
    }

    /* renamed from: n1 */
    public final boolean mo131188n1() {
        SnsMethodCalculate.markStartTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) mo131184j1());
        int f = LL.mo139852f() - LL.mo139850d();
        int i = this.f275100d;
        if (f > i) {
            f = i;
        }
        int d = LL.mo139850d();
        this.f275102f = d;
        byte[] O = C86013q1.m106433O(this.f275104h, d, f);
        if (O == null || O.length <= 0) {
            SnsMethodCalculate.markEndTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return false;
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(O);
        x84 x84 = this.f275106j;
        x84.f299864h = qv32;
        x84.f299861e = this.f275102f;
        SnsMethodCalculate.markEndTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return true;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        Log.m105924i("MicroMsg.NetSceneSnsUpload", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str2);
        y84 y84 = (y84) ((C47350c) uVar).f127056b.f127083a;
        if (i4 == 4) {
            mo131186l1(i5);
            if (this.f275117x == 21) {
                C28125b.m38099a(12);
            }
            this.f275109p.onSceneEnd(i4, i5, str2, this);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        } else if (i4 == 0 && i5 == 0) {
            C100406i0 LL = C94866e1.ay0().mo139867LL((long) mo131184j1());
            int i6 = y84.f145177d;
            if (i6 < 0 || (i6 > LL.mo139852f() && LL.mo139852f() > 0)) {
                mo131185k1();
                if (i4 == 3) {
                    C28125b.m38099a(14);
                }
                SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else if (y84.f145177d < LL.mo139850d()) {
                mo131185k1();
                if (i4 == 3) {
                    C28125b.m38099a(14);
                }
                SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else {
                Log.m105924i("MicroMsg.NetSceneSnsUpload", " bufferUrl: " + y84.f145180g.f141997d + " bufferUrlType: " + y84.f145180g.f141998e + "  id:" + y84.f145183j + " thumb Count: " + y84.f145181h + "  type " + y84.f145184n + " startPos : " + y84.f145177d);
                LL.mo139855i(y84.f145177d);
                C94866e1.ay0().r50(mo131184j1(), LL);
                SnsMethodCalculate.markStartTimeMs("isUploadCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
                boolean z = LL.mo139850d() == LL.mo139852f() && LL.mo139852f() != 0;
                SnsMethodCalculate.markEndTimeMs("isUploadCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
                if (z) {
                    Log.m105924i("MicroMsg.NetSceneSnsUpload", "uploadsns done pass: " + (System.currentTimeMillis() - this.f275114u));
                    if (y84.f145182i.size() == 0 || y84.f145182i.size() <= 0) {
                        t64 t64 = y84.f145180g;
                        String str3 = t64.f141997d;
                        int i7 = t64.f141998e;
                        mo131187m1(str3, i7, "", 0, y84.f145183j + "", this.f275106j.f299874u);
                    } else {
                        t64 t642 = y84.f145180g;
                        String str4 = t642.f141997d;
                        int i8 = t642.f141998e;
                        String str5 = y84.f145182i.get(0).f141997d;
                        int i9 = y84.f145182i.get(0).f141998e;
                        mo131187m1(str4, i8, str5, i9, y84.f145183j + "", this.f275106j.f299874u);
                    }
                    this.f275109p.onSceneEnd(i4, i5, str2, this);
                } else if (mo131188n1() && doScene(dispatcher(), this.f275109p) < 0) {
                    this.f275109p.onSceneEnd(3, -1, "doScene failed", this);
                }
                SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            }
        } else {
            mo131185k1();
            if (this.f275117x == 21) {
                C28125b.m38099a(13);
            }
            this.f275109p.onSceneEnd(i4, i5, str2, this);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        }
    }

    public int securityLimitCount() {
        SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        if (this.f275111r) {
            SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return 675;
        }
        SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return 100;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        y$$d y__d = y$$d.EOk;
        SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return y__d;
    }
}
