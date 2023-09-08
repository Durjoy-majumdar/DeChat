package fd3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fd3.C97867h;
import xc3.C102616b;
import zt3.C119157j;

/* renamed from: fd3.d */
public class C97860d implements C97872k, C102616b {

    /* renamed from: a */
    public C97858a f287053a;

    /* renamed from: b */
    public C97867h f287054b;

    /* renamed from: c */
    public int f287055c;

    /* renamed from: d */
    public String f287056d;

    /* renamed from: e */
    public String f287057e;

    /* renamed from: f */
    public String f287058f;

    /* renamed from: g */
    public String f287059g;

    /* renamed from: h */
    public String f287060h;

    /* renamed from: i */
    public String f287061i;

    /* renamed from: j */
    public boolean f287062j = false;

    /* renamed from: k */
    public boolean f287063k = false;

    /* renamed from: fd3.d$a */
    public class C97861a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C97867h f287064d;

        public C97861a(C97867h hVar) {
            this.f287064d = hVar;
        }

        public void run() {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1431, 0);
            int i = this.f287064d.f287083b;
            if (i == 1) {
                nVar.mo175911u(1431, 3);
            } else if (i == 2) {
                nVar.mo175911u(1431, 6);
            } else if (i == 3) {
                nVar.mo175911u(1431, 9);
            }
            C97860d dVar = C97860d.this;
            C97867h hVar = this.f287064d;
            dVar.f287054b = hVar;
            hVar.f287090i = Util.nowMilliSecond();
            C97860d.this.mo137194g(3);
        }

        public String toString() {
            return super.toString() + "|addUploadTask";
        }
    }

    /* renamed from: a */
    public void mo137188a(boolean z) {
        this.f287063k = z;
    }

    /* renamed from: b */
    public boolean mo137189b(C97867h hVar) {
        if (hVar == null) {
            Log.m105920e("MicroMsg.CGIParallelUploadMgr", "summersafecdn addSendTask task info is null");
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C97861a(hVar), "MicroMsg.ParallelUpload.ThreadName");
        return true;
    }

    /* renamed from: c */
    public void mo137190c() {
        Log.m105924i("MicroMsg.CGIParallelUploadMgr", "quitVideoSendThread");
        C97858a aVar = this.f287053a;
        if (aVar != null) {
            aVar.mo137185c();
        }
    }

    /* renamed from: d */
    public final void mo137191d(String str, long j, String str2) {
        C97858a aVar = new C97858a(this);
        aVar.f287040a = str;
        aVar.f287041b = j;
        aVar.f287043d = 5;
        aVar.f287042c = this.f287054b.f287083b;
        aVar.f287049j = this.f287060h;
        aVar.f287050k = str2;
        this.f287053a = aVar;
        aVar.mo137184b();
    }

    /* renamed from: e */
    public final void mo137192e(int i, String str) {
        this.f287054b.f287091j = Util.nowMilliSecond();
        C115669n nVar = C115669n.INSTANCE;
        C97867h hVar = this.f287054b;
        nVar.mo160128e(20470, true, true, false, Integer.valueOf(this.f287054b.f287083b), Long.valueOf(this.f287054b.f287092k), Long.valueOf(hVar.f287091j - hVar.f287090i), Integer.valueOf(i), Long.valueOf(this.f287054b.f287093l));
        nVar.mo175911u(1431, 2);
        int i2 = this.f287054b.f287083b;
        if (i2 == 1) {
            nVar.mo175911u(1431, 5);
        } else if (i2 == 2) {
            nVar.mo175911u(1431, 8);
        } else if (i2 == 3) {
            nVar.mo175911u(1431, 11);
            if (this.f287054b.f287092k > 26214400) {
                nVar.mo175911u(1431, 14);
            }
        }
        C97867h.C97868a aVar = this.f287054b.f287084c;
        if (aVar != null) {
            aVar.mo127086a(i, str);
        }
    }

    /* renamed from: f */
    public void mo137193f(C97859b bVar, String str, int i) {
        if (bVar.f287043d == 2 && i == -100003 && this.f287062j) {
            this.f287062j = false;
            mo137194g(2);
            return;
        }
        mo137192e(i, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0226  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137194g(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "why has not big image, filePath:%s"
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.CGIParallelUploadMgr"
            r5 = 0
            r6 = 1
            if (r1 == r6) goto L_0x0253
            r7 = 0
            r8 = 2
            if (r1 == r8) goto L_0x0179
            r8 = 5
            r9 = 3
            if (r1 == r9) goto L_0x0114
            r9 = 4
            if (r1 == r9) goto L_0x00b1
            if (r1 == r8) goto L_0x001e
            goto L_0x02bb
        L_0x001e:
            java.lang.String r1 = "start upload file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x009e
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x0039
            goto L_0x009e
        L_0x0039:
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            fd3.h r2 = r0.f287054b
            long r2 = r2.f287089h
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r2)
            java.lang.String r1 = r1.getContent()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r7)
            com.tencent.mm.modelcdntran.u r2 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            r2.getClass()
            java.lang.String r2 = com.tencent.mars.cdn.CdnLogic.createAeskey()
            r0.f287061i = r2
            if (r1 == 0) goto L_0x0076
            java.lang.String r2 = r1.f195524R
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0076
            java.lang.String r1 = r1.f195524R
            r0.f287061i = r1
        L_0x0076:
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            int r3 = (int) r2
            long r2 = (long) r3
            fd3.h r4 = r0.f287054b
            long r5 = r4.f287092k
            long r5 = r5 + r2
            r4.f287092k = r5
            r4 = 26214400(0x1900000, double:1.29516345E-316)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1431(0x597, float:2.005E-42)
            r6 = 12
            r4.mo175911u(r5, r6)
        L_0x0097:
            java.lang.String r4 = r0.f287061i
            r0.mo137191d(r1, r2, r4)
            goto L_0x02bb
        L_0x009e:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            fd3.h r6 = r0.f287054b
            java.lang.String r6 = r6.f287085d
            r1[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            r1 = -40005(0xffffffffffff63bb, float:NaN)
            r0.mo137192e(r1, r3)
            goto L_0x02bb
        L_0x00b1:
            java.lang.String r1 = "start upload video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0101
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x00cc
            goto L_0x0101
        L_0x00cc:
            fd3.a r1 = new fd3.a
            r1.<init>(r0)
            fd3.h r2 = r0.f287054b
            java.lang.String r2 = r2.f287085d
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r3 = (int) r2
            fd3.h r2 = r0.f287054b
            long r4 = r2.f287092k
            long r6 = (long) r3
            long r4 = r4 + r6
            r2.f287092k = r4
            java.lang.String r3 = r2.f287085d
            r1.f287040a = r3
            r1.f287041b = r6
            r1.f287043d = r9
            int r2 = r2.f287083b
            r1.f287042c = r2
            java.lang.String r2 = r0.f287056d
            r1.f287044e = r2
            java.lang.String r2 = r0.f287057e
            r1.f287045f = r2
            boolean r2 = r0.f287063k
            r1.f287052m = r2
            r0.f287053a = r1
            r1.mo137184b()
            goto L_0x02bb
        L_0x0101:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            fd3.h r6 = r0.f287054b
            java.lang.String r6 = r6.f287085d
            r1[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            r1 = -40004(0xffffffffffff63bc, float:NaN)
            r0.mo137192e(r1, r3)
            goto L_0x02bb
        L_0x0114:
            java.lang.String r1 = "start upload thumb image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287086e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0156
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287086e
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x012f
            goto L_0x0156
        L_0x012f:
            fd3.a r1 = new fd3.a
            r1.<init>(r0)
            r1.f287043d = r9
            fd3.h r2 = r0.f287054b
            int r3 = r2.f287083b
            r1.f287042c = r3
            java.lang.String r2 = r2.f287086e
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            fd3.h r4 = r0.f287054b
            java.lang.String r5 = r4.f287086e
            r1.f287040a = r5
            r1.f287041b = r2
            long r5 = r4.f287092k
            long r5 = r5 + r2
            r4.f287092k = r5
            r0.f287053a = r1
            r1.mo137184b()
            goto L_0x02bb
        L_0x0156:
            fd3.h r1 = r0.f287054b
            int r2 = r1.f287082a
            if (r2 == r8) goto L_0x0174
            boolean r7 = r0.f287063k
            if (r7 != 0) goto L_0x0174
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r1 = r1.f287085d
            r2[r5] = r1
            java.lang.String r1 = "why has not thumb, filePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r2)
            r1 = -40001(0xffffffffffff63bf, float:NaN)
            r0.mo137192e(r1, r3)
            goto L_0x02bb
        L_0x0174:
            r0.mo137194g(r2)
            goto L_0x02bb
        L_0x0179:
            java.lang.String r1 = "start upload middle image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287087f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x023e
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287087f
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x0195
            goto L_0x023e
        L_0x0195:
            fd3.a r1 = new fd3.a
            r1.<init>(r0)
            fd3.h r2 = r0.f287054b
            java.lang.String r2 = r2.f287087f
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            fd3.h r9 = r0.f287054b
            java.lang.String r10 = r9.f287087f
            r1.f287040a = r10
            r1.f287041b = r2
            r1.f287043d = r8
            int r11 = r9.f287083b
            r1.f287042c = r11
            java.lang.String r11 = r0.f287056d
            r1.f287044e = r11
            java.lang.String r11 = r0.f287057e
            r1.f287045f = r11
            r0.f287055c = r5
            boolean r11 = r0.f287062j
            if (r11 == 0) goto L_0x0228
            java.lang.String r9 = r9.f287088g
            java.lang.Class<z51.i> r11 = z51.C102975i.class
            di3.d r12 = di3.C86312j.m106911c(r11)
            z51.i r12 = (z51.C102975i) r12
            boolean r12 = r12.hq0()
            if (r12 != 0) goto L_0x01cf
            goto L_0x020d
        L_0x01cf:
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x020d
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x01ed
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 944(0x3b0, float:1.323E-42)
            r14 = 9
            r12.mo175911u(r13, r14)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r9)
        L_0x01ed:
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r12 != 0) goto L_0x01f6
            com.tencent.p014mm.vfs.C86013q1.m106444e(r9)
        L_0x01f6:
            di3.d r11 = di3.C86312j.m106911c(r11)
            z51.i r11 = (z51.C102975i) r11
            int r11 = r11.mo141699lT(r10, r9)
            if (r11 != 0) goto L_0x0204
            r4 = 1
            goto L_0x020e
        L_0x0204:
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r5] = r10
            java.lang.String r10 = "file to hevc failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r11)
        L_0x020d:
            r4 = 0
        L_0x020e:
            if (r4 == 0) goto L_0x0211
            r7 = r9
        L_0x0211:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r4 != 0) goto L_0x0226
            fd3.h r2 = r0.f287054b
            java.lang.String r2 = r2.f287087f
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            r1.f287040a = r7
            r1.f287041b = r2
            r0.f287055c = r6
            goto L_0x0228
        L_0x0226:
            r0.f287062j = r5
        L_0x0228:
            fd3.h r4 = r0.f287054b
            long r5 = r4.f287092k
            long r5 = r5 + r2
            r4.f287092k = r5
            int r2 = r4.f287082a
            if (r2 != r8) goto L_0x0237
            int r2 = r0.f287055c
            r1.f287048i = r2
        L_0x0237:
            r0.f287053a = r1
            r1.mo137184b()
            goto L_0x02bb
        L_0x023e:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            fd3.h r2 = r0.f287054b
            java.lang.String r2 = r2.f287085d
            r1[r5] = r2
            java.lang.String r2 = "why has not middle image, filePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            r1 = -40002(0xffffffffffff63be, float:NaN)
            r0.mo137192e(r1, r3)
            goto L_0x02bb
        L_0x0253:
            java.lang.String r1 = "start upload big image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x02aa
            fd3.h r1 = r0.f287054b
            java.lang.String r1 = r1.f287085d
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 != 0) goto L_0x026e
            goto L_0x02aa
        L_0x026e:
            fd3.a r1 = new fd3.a
            r1.<init>(r0)
            fd3.h r2 = r0.f287054b
            java.lang.String r2 = r2.f287085d
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r3 = (int) r2
            fd3.h r2 = r0.f287054b
            long r4 = r2.f287092k
            long r7 = (long) r3
            long r4 = r4 + r7
            r2.f287092k = r4
            java.lang.String r3 = r2.f287085d
            r1.f287040a = r3
            r1.f287041b = r7
            r1.f287043d = r6
            int r2 = r2.f287083b
            r1.f287042c = r2
            java.lang.String r2 = r0.f287056d
            r1.f287044e = r2
            java.lang.String r2 = r0.f287057e
            r1.f287045f = r2
            java.lang.String r2 = r0.f287058f
            r1.f287046g = r2
            java.lang.String r2 = r0.f287059g
            r1.f287047h = r2
            int r2 = r0.f287055c
            r1.f287048i = r2
            r0.f287053a = r1
            r1.mo137184b()
            goto L_0x02bb
        L_0x02aa:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            fd3.h r6 = r0.f287054b
            java.lang.String r6 = r6.f287085d
            r1[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            r1 = -40003(0xffffffffffff63bd, float:NaN)
            r0.mo137192e(r1, r3)
        L_0x02bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fd3.C97860d.mo137194g(int):void");
    }
}
