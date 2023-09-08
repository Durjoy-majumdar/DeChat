package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import te3.C101761bt2;
import te3.C101764ch2;
import te3.C101766ct2;
import te3.C64454it2;
import z71.C39321d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.exdevice.model.d */
public final class C93356d {

    /* renamed from: a */
    public long f269400a;

    /* renamed from: b */
    public int f269401b = 100;

    /* renamed from: c */
    public String f269402c;

    /* renamed from: d */
    public Integer f269403d;

    /* renamed from: e */
    public int f269404e;

    /* renamed from: f */
    public ConcurrentHashMap<String, C93366l1> f269405f;

    /* renamed from: g */
    public C101766ct2 f269406g;

    /* renamed from: h */
    public boolean f269407h;

    /* renamed from: i */
    public boolean f269408i;

    /* renamed from: j */
    public ConcurrentHashMap<String, C98124g> f269409j;

    /* renamed from: k */
    public C11385n f269410k;

    /* renamed from: l */
    public C11385n f269411l;

    /* renamed from: m */
    public C98124g.C98125a f269412m;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.d$a */
    public static final class C93357a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C93356d f269413d;

        /* renamed from: com.tencent.mm.plugin.exdevice.model.d$a$a */
        public static final class C93358a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C93356d f269414d;

            public C93358a(C93356d dVar) {
                this.f269414d = dVar;
            }

            public final void run() {
                for (String next : this.f269414d.f269405f.keySet()) {
                    Log.m105924i("ExDeviceSendIotLogic", "start send pending " + next);
                    C93365i.m117894k(next, "send_data_failed");
                }
                this.f269414d.f269405f.clear();
            }
        }

        /* renamed from: com.tencent.mm.plugin.exdevice.model.d$a$b */
        public static final class C93359b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C93356d f269415d;

            public C93359b(C93356d dVar) {
                this.f269415d = dVar;
            }

            public final void run() {
                for (String next : this.f269415d.f269405f.keySet()) {
                    Log.m105924i("ExDeviceSendIotLogic", "start send pending " + next);
                    C93366l1 l1Var = this.f269415d.f269405f.get(next);
                    if (l1Var != null) {
                        C93356d dVar = this.f269415d;
                        dVar.mo128147a(dVar.f269406g, l1Var, dVar.f269411l);
                    }
                }
                this.f269415d.f269405f.clear();
            }
        }

        public C93357a(C93356d dVar) {
            this.f269413d = dVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            Log.m105919d("ExDeviceSendIotLogic", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", this.f269413d.f269402c, Integer.valueOf(i), cVar, dVar);
            if (i != 0) {
                try {
                    C93356d dVar2 = this.f269413d;
                    dVar2.f269407h = false;
                    ((C119157j) C119157j.f356862d).mo183876g(new C93358a(dVar2), "ExDeviceSendIotLogic");
                    return 0;
                } catch (Exception e) {
                    Log.m105921e("ExDeviceSendIotLogic", "cdnCallback Exception %s", e);
                }
            } else {
                if (cVar != null) {
                    int i2 = (int) ((((float) cVar.field_finishedLength) / ((float) cVar.field_toltalLength)) * ((float) 100));
                    Log.m105919d("ExDeviceSendIotLogic", "sent to cloud progress %d", Integer.valueOf(i2));
                    if (i2 >= 100) {
                        i2 = 99;
                    }
                    for (String j : this.f269413d.f269405f.keySet()) {
                        C93365i.m117893j(j, i2);
                    }
                }
                if (dVar != null) {
                    C101766ct2 ct22 = new C101766ct2();
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f269413d.f269400a);
                    C39321d dVar3 = new C39321d();
                    dVar3.field_fileid = dVar.field_fileId;
                    dVar3.field_fileUrl = dVar.field_fileUrl;
                    dVar3.field_fileThumbUrl = dVar.field_thumbUrl;
                    dVar3.field_aeskey = dVar.field_aesKey;
                    dVar3.field_msgid = this.f269413d.f269400a;
                    dVar3.field_md5 = dVar.field_filemd5;
                    dVar3.field_size = (int) dVar.field_fileLength;
                    dVar3.field_talker = b002.mo108768t();
                    if (this.f269413d.f269403d == null) {
                        Log.m105920e("ExDeviceSendIotLogic", "no cdn type");
                    }
                    Integer num = this.f269413d.f269403d;
                    if (num != null) {
                        dVar3.field_cdnType = num.intValue();
                        Log.m105918d("ExDeviceSendIotLogic", "fields length: " + C39321d.f105714D.fields.length);
                        C41166r1.Dx0().replace(dVar3);
                        C98124g gVar = this.f269413d.f269409j.get(str);
                        C93365i.m117885b(ct22, gVar, this.f269413d.f269400a);
                        Log.m105924i("ExDeviceSendIotLogic", "cdn uploaded md5 " + dVar.field_filemd5 + " size " + dVar.field_fileLength);
                        C101761bt2 bt22 = ct22.f298053h;
                        if (bt22 != null) {
                            C101764ch2 ch22 = bt22.f297992p;
                            Log.m105924i("ExDeviceSendIotLogic", "deviceMsg.fileMsg key:" + ch22.f298030f + ", nonce: " + ch22.f298031g + ", tag: " + ch22.f298032h);
                        }
                        String str2 = null;
                        C86013q1.m106447h(gVar != null ? gVar.field_fullpath : null);
                        if (gVar != null) {
                            str2 = gVar.field_thumbpath;
                        }
                        C86013q1.m106447h(str2);
                        C93356d dVar4 = this.f269413d;
                        dVar4.f269406g = ct22;
                        dVar4.f269404e = 2;
                        dVar4.f269407h = false;
                        ((C119157j) C119157j.f356862d).mo183876g(new C93359b(dVar4), "ExDeviceSendIotLogic");
                    }
                    return 0;
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
            Log.m105924i("ExDeviceSendIotLogic", "getCdnAuthInfo mediaId = " + str);
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            Log.m105924i("ExDeviceSendIotLogic", "decodePrepareResponse ");
            return bArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.d$b */
    public static final class C93360b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C93356d f269416d;

        public C93360b(C93356d dVar) {
            this.f269416d = dVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            yVar.setHasCallbackToQueue(true);
            Log.m105925i("ExDeviceSendIotLogic", "cdnMsg, onSceneEnd, errType(%d) errCode(%d) errMsg(%s). release %b", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(this.f269416d.f269408i));
            C55637h1 h1Var = (C55637h1) yVar;
            if (i == 0 && i2 == 0) {
                Log.m105924i("ExDeviceSendIotLogic", "navigate_to_miniprogram: " + h1Var.mo77150j1().f186127d);
                if (h1Var.mo77150j1().f186127d) {
                    C64454it2 it22 = h1Var.mo77150j1().f186128e;
                    String str2 = it22.f183737e;
                    String str3 = it22.f183738f;
                    int i3 = it22.f183739g;
                    String str4 = it22.f183736d;
                    Log.m105924i("ExDeviceSendIotLogic", "mfr appid: " + str2 + ", path: " + str3 + ", env: " + i3 + ", args:" + str4);
                    if (h1Var.mo77150j1().f186129f == null || C87412m.m108589b(h1Var.mo77150j1().f186129f.f183839d, "")) {
                        C93365i.m117896m(h1Var.f158350f.f269424d, "send_data_sucess", (byte[]) null, it22.toByteArray());
                    } else {
                        C93365i.m117896m(h1Var.f158350f.f269424d, "send_data_sucess", h1Var.mo77150j1().f186129f.toByteArray(), it22.toByteArray());
                    }
                } else if (h1Var.mo77150j1().f186129f == null || C87412m.m108589b(h1Var.mo77150j1().f186129f.f183839d, "")) {
                    C93365i.m117894k(h1Var.f158350f.f269424d, "send_data_sucess");
                } else {
                    C93365i.m117895l(h1Var.f158350f.f269424d, "send_data_sucess", h1Var.mo77150j1().f186129f.toByteArray());
                }
            } else {
                Log.m105921e("ExDeviceSendIotLogic", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (!this.f269416d.f269408i) {
                    if (i2 == -125) {
                        if (h1Var.mo77150j1().f186129f == null || C87412m.m108589b(h1Var.mo77150j1().f186129f.f183839d, "")) {
                            C93365i.m117894k(h1Var.f158350f.f269424d, "send_data_failed");
                        } else {
                            C93365i.m117895l(h1Var.f158350f.f269424d, "send_data_failed", h1Var.mo77150j1().f186129f.toByteArray());
                        }
                    } else if (h1Var.mo77150j1().f186129f == null || C87412m.m108589b(h1Var.mo77150j1().f186129f.f183839d, "")) {
                        C93365i.m117894k(h1Var.f158350f.f269424d, "send_data_failed");
                    } else {
                        C93365i.m117895l(h1Var.f158350f.f269424d, "send_data_failed", h1Var.mo77150j1().f186129f.toByteArray());
                    }
                    C41166r1.Dx0().mo62018jo(this.f269416d.f269400a);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.d$c */
    public static final class C93361c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C93356d f269417d;

        public C93361c(C93356d dVar) {
            this.f269417d = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0151, code lost:
            if (r8.booleanValue() != false) goto L_0x0153;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
            /*
                r7 = this;
                r0 = 1
                r11.setHasCallbackToQueue(r0)
                r1 = 4
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                r3 = 0
                r1[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
                r1[r0] = r2
                r0 = 2
                r1[r0] = r10
                com.tencent.mm.plugin.exdevice.model.d r10 = r7.f269417d
                boolean r10 = r10.f269408i
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r0 = 3
                r1[r0] = r10
                java.lang.String r10 = "ExDeviceSendIotLogic"
                java.lang.String r0 = "normalMsg, onSceneEnd, errType(%d) errCode(%d) errMsg(%s). release %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)
                com.tencent.mm.plugin.exdevice.model.d r0 = r7.f269417d
                boolean r0 = r0.f269408i
                if (r0 == 0) goto L_0x0031
                return
            L_0x0031:
                com.tencent.mm.plugin.exdevice.model.h1 r11 = (com.tencent.p014mm.plugin.exdevice.model.C55637h1) r11
                java.lang.String r0 = ""
                if (r8 != 0) goto L_0x0109
                if (r9 == 0) goto L_0x003b
                goto L_0x0109
            L_0x003b:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "navigate_to_miniprogram: "
                r8.append(r9)
                te3.wi4 r9 = r11.mo77150j1()
                boolean r9 = r9.f186127d
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
                te3.wi4 r8 = r11.mo77150j1()
                boolean r8 = r8.f186127d
                java.lang.String r9 = "send_data_sucess"
                if (r8 == 0) goto L_0x00d7
                te3.wi4 r8 = r11.mo77150j1()
                te3.it2 r8 = r8.f186128e
                java.lang.String r1 = r8.f183737e
                java.lang.String r2 = r8.f183738f
                int r3 = r8.f183739g
                java.lang.String r4 = r8.f183736d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "mfr appid: "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = ", path: "
                r5.append(r1)
                r5.append(r2)
                java.lang.String r1 = ", env: "
                r5.append(r1)
                r5.append(r3)
                java.lang.String r1 = ", args:"
                r5.append(r1)
                r5.append(r4)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
                te3.wi4 r10 = r11.mo77150j1()
                te3.jt2 r10 = r10.f186129f
                if (r10 == 0) goto L_0x00c9
                te3.wi4 r10 = r11.mo77150j1()
                te3.jt2 r10 = r10.f186129f
                java.lang.String r10 = r10.f183839d
                boolean r10 = gy3.C87412m.m108589b(r10, r0)
                if (r10 != 0) goto L_0x00c9
                com.tencent.mm.plugin.exdevice.model.l1 r10 = r11.f158350f
                java.lang.String r10 = r10.f269424d
                te3.wi4 r11 = r11.mo77150j1()
                te3.jt2 r11 = r11.f186129f
                byte[] r11 = r11.toByteArray()
                byte[] r8 = r8.toByteArray()
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117896m(r10, r9, r11, r8)
                goto L_0x01ee
            L_0x00c9:
                com.tencent.mm.plugin.exdevice.model.l1 r10 = r11.f158350f
                java.lang.String r10 = r10.f269424d
                r11 = 0
                byte[] r8 = r8.toByteArray()
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117896m(r10, r9, r11, r8)
                goto L_0x01ee
            L_0x00d7:
                te3.wi4 r8 = r11.mo77150j1()
                te3.jt2 r8 = r8.f186129f
                if (r8 == 0) goto L_0x0100
                te3.wi4 r8 = r11.mo77150j1()
                te3.jt2 r8 = r8.f186129f
                java.lang.String r8 = r8.f183839d
                boolean r8 = gy3.C87412m.m108589b(r8, r0)
                if (r8 != 0) goto L_0x0100
                com.tencent.mm.plugin.exdevice.model.l1 r8 = r11.f158350f
                java.lang.String r8 = r8.f269424d
                te3.wi4 r10 = r11.mo77150j1()
                te3.jt2 r10 = r10.f186129f
                byte[] r10 = r10.toByteArray()
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117895l(r8, r9, r10)
                goto L_0x01ee
            L_0x0100:
                com.tencent.mm.plugin.exdevice.model.l1 r8 = r11.f158350f
                java.lang.String r8 = r8.f269424d
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r8, r9)
                goto L_0x01ee
            L_0x0109:
                java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                k40.a r8 = f40.C86709a0.m107533q(r8)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.l r8 = r8.mo96095LE()
                com.tencent.mm.plugin.exdevice.model.d r1 = r7.f269417d
                long r1 = r1.f269400a
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                com.tencent.mm.storage.f4 r8 = r8.b00(r1)
                r1 = -125(0xffffffffffffff83, float:NaN)
                if (r9 != r1) goto L_0x016e
                java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117890g(r8)
                java.lang.String r2 = "isImg(msgInfo)"
                gy3.C87412m.m108593f(r1, r2)
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0153
                java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117889f(r8)
                java.lang.String r2 = "isFile(msgInfo)"
                gy3.C87412m.m108593f(r1, r2)
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x0153
                java.lang.Boolean r8 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117892i(r8)
                java.lang.String r1 = "isVideo(msgInfo)"
                gy3.C87412m.m108593f(r8, r1)
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x016e
            L_0x0153:
                com.tencent.mm.plugin.exdevice.model.d r8 = r7.f269417d
                com.tencent.mm.plugin.exdevice.model.l1 r9 = r11.f158350f
                java.lang.String r11 = "sudScene.deviceInfo"
                gy3.C87412m.m108593f(r9, r11)
                r8.getClass()
                zt3.t r11 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.exdevice.model.e r0 = new com.tencent.mm.plugin.exdevice.model.e
                r0.<init>(r8, r9)
                zt3.j r11 = (zt3.C119157j) r11
                r11.mo183876g(r0, r10)
                goto L_0x01ee
            L_0x016e:
                r8 = -61402(0xffffffffffff1026, float:NaN)
                if (r9 != r8) goto L_0x01b1
                te3.wi4 r8 = r11.mo77150j1()
                te3.jt2 r8 = r8.f186129f
                java.lang.String r9 = "send_data_too_large"
                if (r8 == 0) goto L_0x019e
                te3.wi4 r8 = r11.mo77150j1()
                te3.jt2 r8 = r8.f186129f
                java.lang.String r8 = r8.f183839d
                boolean r8 = gy3.C87412m.m108589b(r8, r0)
                if (r8 != 0) goto L_0x019e
                com.tencent.mm.plugin.exdevice.model.l1 r8 = r11.f158350f
                java.lang.String r8 = r8.f269424d
                te3.wi4 r10 = r11.mo77150j1()
                te3.jt2 r10 = r10.f186129f
                byte[] r10 = r10.toByteArray()
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117895l(r8, r9, r10)
                goto L_0x01a5
            L_0x019e:
                com.tencent.mm.plugin.exdevice.model.l1 r8 = r11.f158350f
                java.lang.String r8 = r8.f269424d
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r8, r9)
            L_0x01a5:
                z71.e r8 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Dx0()
                com.tencent.mm.plugin.exdevice.model.d r9 = r7.f269417d
                long r9 = r9.f269400a
                r8.mo62018jo(r9)
                goto L_0x01ee
            L_0x01b1:
                te3.wi4 r8 = r11.mo77150j1()
                te3.jt2 r8 = r8.f186129f
                java.lang.String r9 = "send_data_failed"
                if (r8 == 0) goto L_0x01dc
                te3.wi4 r8 = r11.mo77150j1()
                te3.jt2 r8 = r8.f186129f
                java.lang.String r8 = r8.f183839d
                boolean r8 = gy3.C87412m.m108589b(r8, r0)
                if (r8 != 0) goto L_0x01dc
                com.tencent.mm.plugin.exdevice.model.l1 r8 = r11.f158350f
                java.lang.String r8 = r8.f269424d
                te3.wi4 r10 = r11.mo77150j1()
                te3.jt2 r10 = r10.f186129f
                byte[] r10 = r10.toByteArray()
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117895l(r8, r9, r10)
                goto L_0x01e3
            L_0x01dc:
                com.tencent.mm.plugin.exdevice.model.l1 r8 = r11.f158350f
                java.lang.String r8 = r8.f269424d
                com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r8, r9)
            L_0x01e3:
                z71.e r8 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Dx0()
                com.tencent.mm.plugin.exdevice.model.d r9 = r7.f269417d
                long r9 = r9.f269400a
                r8.mo62018jo(r9)
            L_0x01ee:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93356d.C93361c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    public C93356d(long j) {
        this.f269400a = j;
        Log.m105924i("ExDeviceSendIotLogic", "create");
        this.f269401b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMIotSendMsgFileSizeLimit", this.f269401b) * 1024 * 1024;
        Log.m105924i("ExDeviceSendIotLogic", "EX_DEVICE_MAX_SUPPORT_FILE_SIZE " + this.f269401b);
        this.f269405f = new ConcurrentHashMap<>();
        this.f269409j = new ConcurrentHashMap<>();
        this.f269410k = new C93361c(this);
        this.f269411l = new C93360b(this);
        this.f269412m = new C93357a(this);
    }

    /* renamed from: a */
    public final void mo128147a(C101766ct2 ct22, C93366l1 l1Var, C11385n nVar) {
        C87412m.m108594g(l1Var, "deviceInfo");
        C87412m.m108594g(nVar, "callback");
        if (ct22 == null) {
            Log.m105928w("ExDeviceSendIotLogic", "deviceMsg null");
            return;
        }
        C114770g gVar = C86709a0.m107524d().f256809d;
        if (gVar == null) {
            Log.m105928w("ExDeviceSendIotLogic", "dispatcher null");
        } else {
            new C55637h1(ct22, l1Var).doScene(gVar, nVar);
        }
    }
}
