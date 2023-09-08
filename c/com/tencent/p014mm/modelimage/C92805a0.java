package com.tencent.p014mm.modelimage;

import a62.C27810b;
import bp3.C104160f;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C68104e;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelstat.C81033k;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f12.C97813c;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import junit.framework.Assert;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C47355o;
import ob0.y$$d;
import p1081gi.C98124g;
import p158gt.C98203p;
import p663qo.C63287k;
import p823sg.C90193h;
import te3.C49378f42;
import te3.C49514g42;
import te3.C51163rv3;
import tf3.C37075s;
import z51.C102975i;

/* renamed from: com.tencent.mm.modelimage.a0 */
public class C92805a0 extends C117747y implements C1311n, C98203p {

    /* renamed from: A */
    public boolean f267203A;

    /* renamed from: B */
    public int f267204B;

    /* renamed from: C */
    public String f267205C;

    /* renamed from: D */
    public int f267206D;

    /* renamed from: E */
    public int f267207E;

    /* renamed from: F */
    public C98124g.C98125a f267208F;

    /* renamed from: G */
    public final C55384i f267209G;

    /* renamed from: d */
    public String f267210d;

    /* renamed from: e */
    public final C47355o f267211e;

    /* renamed from: f */
    public C11385n f267212f;

    /* renamed from: g */
    public final C47350c f267213g;

    /* renamed from: h */
    public long f267214h;

    /* renamed from: i */
    public long f267215i;

    /* renamed from: j */
    public long f267216j;

    /* renamed from: n */
    public int f267217n;

    /* renamed from: o */
    public int f267218o;

    /* renamed from: p */
    public C81033k f267219p;

    /* renamed from: q */
    public final long f267220q;

    /* renamed from: r */
    public C72963f4 f267221r;

    /* renamed from: s */
    public String f267222s;

    /* renamed from: t */
    public long f267223t;

    /* renamed from: u */
    public int f267224u;

    /* renamed from: v */
    public boolean f267225v;

    /* renamed from: w */
    public String f267226w;

    /* renamed from: x */
    public String f267227x;

    /* renamed from: y */
    public int f267228y;

    /* renamed from: z */
    public int f267229z;

    public C92805a0(long j, long j2, int i, C47355o oVar) {
        this(j, j2, i, oVar, -1);
    }

    public void cancel() {
        if (!Util.isNullOrNil(this.f267222s) && C92779i0.Ex0() != null) {
            Log.m105918d(this.f267210d, "cancel recv task");
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_img_download_cdn_plc, C104160f.RepairerConfig_Global_NewImgCdnDownload_Int, 0) == 1 || mo127063k1()) {
                C68104e.f195751a.mo93612a(this.f267222s, new WeakReference(this.f267209G));
            } else {
                C92779i0.Ex0().mo126953i(this.f267222s);
            }
        }
        super.cancel();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f267212f = nVar;
        C49378f42 f422 = (C49378f42) this.f267213g.f127055a.f127080a;
        C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267216j));
        int i = 2;
        if (nP.f267374a == 0) {
            C115669n.INSTANCE.idkeyStat(111, 195, 1, false);
            Log.m105921e(this.f267210d, "doScene id:%d  img:%s", Long.valueOf(this.f267216j), nP);
            return -1;
        } else if (nP.f267388o != 0) {
            C115669n.INSTANCE.idkeyStat(111, 194, 1, false);
            Log.m105921e(this.f267210d, "doSceneError, id:%d, status:%d", Long.valueOf(nP.f267374a), Integer.valueOf(nP.f267388o));
            return -1;
        } else {
            String str = nP.f267378e;
            if (str == null || !str.startsWith("SERVERID://")) {
                this.f267226w = nP.f267378e;
                this.f267227x = C92837k0.Bx0().mo127174TY(this.f267226w, (String) null, "", true);
            } else {
                this.f267226w = C90193h.m112878f(nP.f267378e.getBytes());
                this.f267227x = ((C63287k) C86312j.m106911c(C63287k.class)).mo88183rC(this.f267226w);
            }
            Log.m105925i(this.f267210d, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", Long.valueOf(nP.f267374a), Integer.valueOf(this.f267218o), Integer.valueOf(nP.f267376c), Integer.valueOf(nP.f267377d), str, this.f267226w, this.f267227x);
            if (this.f267223t == 0) {
                this.f267223t = Util.nowMilliSecond();
                if (this.f267218o == 1) {
                    i = 1;
                }
                this.f267224u = i;
            }
            if (mo127062j1(nP, f422.f133284e.f141175d, f422.f133290n)) {
                Log.m105919d(this.f267210d, "cdntra this img use cdn : %s", this.f267222s);
                return 0;
            }
            Log.m105919d(this.f267210d, "cdntra this img NOT USE CDN: %s", this.f267222s);
            nP.mo127148s("");
            C92837k0.Bx0().Dx0(Long.valueOf(this.f267216j), nP);
            f422.f133287h = nP.f267376c;
            f422.f133288i = this.f267217n;
            f422.f133286g = nP.f267377d;
            C81033k kVar = this.f267219p;
            if (kVar != null) {
                if (kVar.f238023e == 0) {
                    kVar.f238020b = Util.nowMilliSecond();
                    kVar.f238025g = Util.currentTicks();
                }
                kVar.f238023e++;
            }
            return dispatch(gVar, this.f267213g, this);
        }
    }

    public int getType() {
        return 109;
    }

    /* renamed from: j1 */
    public final boolean mo127062j1(C92836k kVar, String str, long j) {
        String str2;
        String str3;
        C97813c cVar;
        C92836k kVar2 = kVar;
        if (Util.isNullOrNil(kVar2.f267393t)) {
            return false;
        }
        Map<String, String> parseXml = XmlParser.parseXml(kVar2.f267393t, "msg", (String) null);
        if (parseXml == null) {
            Log.m105921e(this.f267210d, "parse cdnInfo failed. [%s]", kVar2.f267393t);
            return false;
        }
        Log.m105925i(this.f267210d, "img cdn info %s", kVar2.f267393t);
        this.f267228y = 0;
        if (this.f267218o != 1) {
            str2 = parseXml.get(".msg.img.$cdnmidimgurl");
            this.f267228y = Util.getInt(parseXml.get(".msg.img.$length"), 0);
        } else {
            str2 = parseXml.get(".msg.img.$cdnbigimgurl");
            this.f267228y = Util.getInt(parseXml.get(".msg.img.$hdlength"), 0);
        }
        String str4 = str2;
        if (this.f267218o != 1) {
            str3 = parseXml.get(".msg.img.$tpurl");
            if (!Util.isNullOrNil(str3)) {
                this.f267228y = Util.getInt(parseXml.get(".msg.img.$tplength"), 0);
            }
        } else {
            str3 = parseXml.get(".msg.img.$tphdurl");
            if (!Util.isNullOrNil(str3)) {
                this.f267228y = Util.getInt(parseXml.get(".msg.img.$tphdlength"), 0);
            }
        }
        int i = Util.getInt(parseXml.get(".msg.img.$hevc_mid_size"), 0);
        if (this.f267228y <= 1 && i >= 0) {
            this.f267228y = i;
        }
        Log.m105919d(this.f267210d, "cdntra read xml  comptype:%d totallen:%d url:[%s] [%s]", Integer.valueOf(this.f267218o), Integer.valueOf(this.f267228y), str4, str3);
        if (!Util.isNullOrNil(str4) || !Util.isNullOrNil(str3)) {
            String str5 = parseXml.get(".msg.img.$aeskey");
            if (Util.isNullOrNil(str5)) {
                Log.m105920e(this.f267210d, "cdntra get aes key failed.");
                return false;
            }
            String t = this.f267221r.mo108768t();
            String b = C1297x.m1387b("downimg", (long) kVar2.f267386m, t, "" + this.f267221r.getMsgId());
            this.f267222s = b;
            if (Util.isNullOrNil(b)) {
                Log.m105929w(this.f267210d, "cdntra genClientId failed not use cdn imgLocalId:%d", Long.valueOf(this.f267216j));
                return false;
            }
            String str6 = parseXml.get(".msg.img.$md5");
            if (!mo127063k1() && Util.isNullOrNil(str3) && !Util.isNullOrNil(str6) && (Util.isNullOrNil(parseXml.get(".msg.img.$cdnbigimgurl")) || this.f267218o == 1)) {
                synchronized (C97813c.class) {
                    if (C97813c.f286943a == null) {
                        C97813c.f286943a = new C97813c();
                    }
                    cVar = C97813c.f286943a;
                }
                cVar.getClass();
                C86709a0.m107523b().mo121108c();
                String a = ((C27810b) C86312j.m106911c(C27810b.class)).mo55621A1().mo57627a(str6, this.f267228y);
                int l = (int) C86013q1.m106451l(a);
                int i2 = this.f267228y;
                int i3 = i2 - l;
                String str7 = this.f267210d;
                Object[] objArr = new Object[8];
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = str6;
                objArr[2] = parseXml.get(".msg.img.$cdnbigimgurl");
                objArr[3] = Boolean.valueOf(this.f267218o == 1);
                objArr[4] = Integer.valueOf(l);
                objArr[5] = a;
                objArr[6] = Integer.valueOf(i3);
                objArr[7] = this.f267227x;
                Log.m105925i(str7, "MediaCheckDuplicationStorage: totallen:%s md5:%s big:%s NOcompress:%s  dup(len:%d path:%s) diffLen:%d to:%s", objArr);
                if (Util.isNullOrNil(a)) {
                    this.f267206D = this.f267228y;
                } else if (i3 >= 0 && i3 <= 16) {
                    Log.m105925i(this.f267210d, "MediaCheckDuplicationStorage copy dup file now :%s -> %s [%b]", a, this.f267227x, Boolean.valueOf(!Util.isEqual(a, this.f267227x) && C86013q1.m106443d(a, this.f267227x, false) >= 0));
                    int i4 = this.f267228y;
                    mo127064l1(kVar, i4, i4, 0, (byte[]) null);
                    if (this.f267221r != null) {
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101123jo(new C75875l.C45886e(this.f267221r.mo108768t(), "update", this.f267221r, 0));
                    }
                    C115669n.INSTANCE.mo160131h(13267, str4, Long.valueOf(this.f267221r.mo108774y2()), str6, Long.valueOf(this.f267221r.getCreateTime() / 1000), this.f267221r.mo108768t(), 3, Integer.valueOf(l));
                    return true;
                }
            }
            this.f267205C = str6;
            boolean z = this.f267225v && ((C102975i) C86312j.m106911c(C102975i.class)).ln0();
            Log.m105925i(this.f267210d, "checkUseCdn: %s, %s", Boolean.valueOf(this.f267225v), Boolean.valueOf(z));
            C98124g gVar = new C98124g();
            if (z) {
                gVar.f287660d = "task_NetSceneGetMsgImg_1";
                gVar.field_mediaId = this.f267222s;
            } else {
                gVar.f287660d = "task_NetSceneGetMsgImg_2";
                gVar.field_mediaId = this.f267222s + "_hevc";
            }
            gVar.field_fullpath = this.f267227x;
            gVar.field_fileType = this.f267224u;
            gVar.field_totalLen = this.f267228y;
            gVar.field_aesKey = str5;
            gVar.field_fileId = str4;
            gVar.field_priority = 2;
            gVar.field_chattype = C72996z1.m85820U5(this.f267221r.mo108768t()) ? 1 : 0;
            gVar.f287648E = z ? 2 : 1;
            gVar.f287664h = this.f267207E;
            gVar.field_filemd5 = str6;
            if (!Util.isNullOrNil(str3)) {
                gVar.field_fileType = 19;
                gVar.field_authKey = parseXml.get(".msg.img.$tpauthkey");
                gVar.f287672s = str3;
                gVar.field_fileId = "";
            }
            String str8 = this.f267210d;
            HashSet<String> hashSet = C92779i0.Ex0().f266896t;
            Log.m105925i(str8, "cdnautostart %s %b", "image_" + this.f267221r.getMsgId(), Boolean.valueOf(hashSet.contains("image_" + this.f267221r.getMsgId())));
            HashSet<String> hashSet2 = C92779i0.Ex0().f266896t;
            if (hashSet2.contains("image_" + this.f267221r.getMsgId())) {
                HashSet<String> hashSet3 = C92779i0.Ex0().f266896t;
                hashSet3.remove("image_" + this.f267221r.getMsgId());
                gVar.field_autostart = true;
            } else if (gVar.f287664h != 0) {
                gVar.field_autostart = true;
            } else {
                gVar.field_autostart = false;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_img_download_cdn_plc, C104160f.RepairerConfig_Global_NewImgCdnDownload_Int, 0) == 1 || mo127063k1()) {
                if (C68104e.f195751a.mo93613b(gVar, new WeakReference(this.f267209G)) == null) {
                    C115669n.INSTANCE.idkeyStat(111, 196, 1, false);
                    Log.m105921e(this.f267210d, "addRecvTask failed :%s", this.f267222s);
                    this.f267222s = "";
                    return false;
                }
            } else {
                gVar.f287662f = this.f267208F;
                if (!C92779i0.Ex0().mo126951e(gVar, this.f267204B)) {
                    C115669n.INSTANCE.idkeyStat(111, 196, 1, false);
                    Log.m105921e(this.f267210d, "addRecvTask failed :%s", this.f267222s);
                    this.f267222s = "";
                    return false;
                }
            }
            Log.m105924i(this.f267210d, "add recv task");
            return true;
        }
        Log.m105920e(this.f267210d, "cdntra get cdnUrlfailed.");
        return false;
    }

    /* renamed from: k1 */
    public final boolean mo127063k1() {
        return C117731d.m166007c().mo182440a(new C37075s()) == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d1  */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo127064l1(com.tencent.p014mm.modelimage.C92836k r19, int r20, int r21, int r22, byte[] r23) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r22
            r3 = r23
            java.lang.Class<xp.b> r4 = p753xp.C102704b.class
            java.lang.Class<z51.i> r5 = z51.C102975i.class
            r19.mo127129F(r20)
            int r6 = r21 + r2
            r0.mo127126C(r6)
            r1.f267217n = r2
            if (r3 == 0) goto L_0x001d
            java.lang.String r2 = r1.f267227x
            com.tencent.p014mm.vfs.C86013q1.m106440a(r2, r3)
        L_0x001d:
            java.lang.String r2 = r1.f267210d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "onGYNetEnd : offset = "
            r3.append(r6)
            int r6 = r0.f267376c
            r3.append(r6)
            java.lang.String r6 = " totalLen = "
            r3.append(r6)
            int r6 = r0.f267377d
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r2 = r19.mo127146q()
            r3 = 2
            r6 = 1
            r7 = 0
            r10 = 3
            if (r2 == 0) goto L_0x01ae
            java.lang.String r2 = r1.f267227x
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.ImgUtil.identifyImgType((java.lang.String) r2)
            java.lang.String r11 = r1.f267227x
            boolean r11 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r11)
            java.lang.String r12 = r1.f267227x
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)
            java.lang.String r13 = r12.getPath()
            if (r13 == 0) goto L_0x007c
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r7, r7)
            java.lang.String r14 = r12.getPath()
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x007c
            android.net.Uri$Builder r12 = r12.buildUpon()
            android.net.Uri$Builder r12 = r12.path(r13)
            android.net.Uri r12 = r12.build()
        L_0x007c:
            java.lang.String r13 = r1.f267227x
            boolean r13 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((java.lang.String) r13)
            if (r13 == 0) goto L_0x0128
            java.lang.String r13 = r1.f267210d
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)
            r14[r7] = r15
            java.lang.String r15 = "hevc download is hevc %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
            java.lang.String r13 = r1.f267227x
            java.lang.String r13 = com.tencent.p014mm.vfs.C86013q1.m106448i(r13, r7)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r13 = "_temp"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            di3.d r14 = di3.C86312j.m106911c(r5)
            z51.i r14 = (z51.C102975i) r14
            java.lang.String r15 = r1.f267227x
            int r14 = r14.mo141694GF(r15, r13)
            java.lang.Class<h81.h> r15 = h81.C32735h.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            h81.h r15 = (h81.C32735h) r15
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_c2c_download_delete_hevc
            int r8 = r15.mo58779Qe(r8, r6)
            java.lang.String r15 = r1.f267210d
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            r9[r7] = r16
            r9[r6] = r13
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r9[r3] = r16
            java.lang.String r10 = "convert jpg: %s path %s, config %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r10, r9)
            if (r14 == 0) goto L_0x00df
            r11 = 0
            goto L_0x010d
        L_0x00df:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.ImgUtil.identifyImgType((java.lang.String) r13)
            if (r8 != r6) goto L_0x00eb
            java.lang.String r5 = r1.f267227x
            com.tencent.p014mm.vfs.C86013q1.m106463x(r13, r5)
            goto L_0x010d
        L_0x00eb:
            com.tencent.mm.modelimage.m r8 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r9 = r1.f267226w
            r10 = 0
            java.lang.String r8 = r8.mo127174TY(r9, r10, r2, r6)
            di3.d r5 = di3.C86312j.m106911c(r5)
            z51.i r5 = (z51.C102975i) r5
            java.lang.String r5 = r5.mo141702wt(r8)
            java.lang.String r8 = r1.f267227x
            com.tencent.p014mm.vfs.C86013q1.m106463x(r8, r5)
            java.lang.String r8 = r1.f267227x
            com.tencent.p014mm.vfs.C86013q1.m106463x(r13, r8)
            r0.mo127152w(r5)
        L_0x010d:
            if (r11 != 0) goto L_0x0128
            r1.f267225v = r7
            java.lang.String r2 = r1.f267227x
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
            ob0.c r2 = r1.f267213g
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            te3.f42 r2 = (te3.C49378f42) r2
            te3.rv3 r3 = r2.f133284e
            java.lang.String r3 = r3.f141175d
            long r4 = r2.f133290n
            r1.mo127062j1(r0, r3, r4)
            return r7
        L_0x0128:
            if (r11 == 0) goto L_0x0178
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = r1.f267226w
            r5.append(r8)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.modelimage.m r8 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r9 = r1.f267226w
            r10 = 0
            java.lang.String r8 = r8.mo127174TY(r9, r10, r2, r6)
            java.lang.String r9 = r1.f267210d
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r7] = r2
            java.lang.String r2 = r1.f267226w
            r11[r6] = r2
            java.lang.String r2 = r1.f267227x
            r11[r3] = r2
            r2 = 3
            r11[r2] = r8
            java.lang.String r2 = "sceneEndproc ext:%s tmp:%s tmpfull:%s full:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r11)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
            java.lang.String r2 = r1.f267227x
            com.tencent.p014mm.vfs.C86013q1.m106463x(r2, r8)
            r0.mo127147r(r5)
            java.lang.String r2 = com.tencent.p014mm.modelimage.C1299o.m1389a(r8)
            r0.f267385l = r2
            r0.f267369L = r6
            int r2 = r1.f267218o
            r0.mo127149t(r2)
            r2 = r8
            goto L_0x01af
        L_0x0178:
            int r2 = r1.f267218o
            if (r2 != r6) goto L_0x019a
            com.tencent.mm.modelimage.m r2 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r8 = r1.f267215i
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            com.tencent.mm.modelimage.k r2 = r2.mo127194nP(r5)
            r2.mo127151v(r7)
            com.tencent.mm.modelimage.m r5 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r8 = r1.f267215i
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.Dx0(r8, r2)
        L_0x019a:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r5 = 0
            com.tencent.mm.vfs.f0$h r2 = r2.mo177799l(r12, r5)
            boolean r5 = r2.mo177810a()
            if (r5 == 0) goto L_0x01ae
            com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            r5.mo119933c(r2)
        L_0x01ae:
            r2 = 0
        L_0x01af:
            com.tencent.mm.modelimage.m r5 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r8 = r1.f267216j
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            int r5 = r5.Dx0(r8, r0)
            java.lang.String r15 = ""
            if (r5 >= 0) goto L_0x01d1
            java.lang.String r0 = r1.f267210d
            java.lang.String r2 = "onGYNetEnd : update img fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            ob0.n r0 = r1.f267212f
            r2 = -1
            r3 = 3
            r0.onSceneEnd(r3, r2, r15, r1)
            return r7
        L_0x01d1:
            ob0.o r5 = r1.f267211e
            if (r5 == 0) goto L_0x01e1
            zt3.t r5 = zt3.C119157j.f356862d
            com.tencent.mm.modelimage.a0$$a r8 = new com.tencent.mm.modelimage.a0$$a
            r8.<init>(r1, r0)
            zt3.j r5 = (zt3.C119157j) r5
            r5.mo183895z(r8)
        L_0x01e1:
            java.lang.String r5 = r1.f267210d
            java.lang.Object[] r8 = new java.lang.Object[r3]
            boolean r9 = r19.mo127146q()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r7] = r9
            java.lang.String r9 = r1.f267222s
            r8[r6] = r9
            java.lang.String r9 = "cdntra check iscompleted :%b clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r8)
            boolean r5 = r19.mo127146q()
            if (r5 == 0) goto L_0x0365
            int r5 = r1.f267229z
            if (r5 <= 0) goto L_0x021b
            com.tencent.mm.modelimage.m r8 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r10 = r0.f267380g
            int r11 = r1.f267229z
            r12 = 1
            com.tencent.mm.storage.f4 r5 = r1.f267221r
            int r13 = r5.f230725H
            int r14 = r5.f230726I
            r5 = -1
            r9 = r2
            r17 = r15
            r15 = r5
            boolean r5 = r8.mo127169Ow(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x021e
        L_0x021b:
            r17 = r15
            r5 = 0
        L_0x021e:
            if (r5 == 0) goto L_0x023d
            r0.f267392s = r6
            r0.f267367J = r6
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            com.tencent.mm.storage.f4 r8 = r1.f267221r
            long r8 = r8.getMsgId()
            com.tencent.mm.storage.f4 r10 = r1.f267221r
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            r5.xy0(r8, r10)
        L_0x023d:
            com.tencent.mm.modelimage.m r5 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r8 = r1.f267216j
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.Dx0(r8, r0)
            java.lang.String r5 = r1.f267210d
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = r1.f267227x
            r9[r7] = r8
            r9[r6] = r2
            java.lang.String r8 = r0.f267378e
            r9[r3] = r8
            java.lang.String r8 = r1.f267205C
            r10 = 3
            r9[r10] = r8
            java.lang.String r8 = "cdntra ext:%s %s %s  MediaCheckDuplicationStorage md5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r9)
            com.tencent.mm.modelstat.k r5 = r1.f267219p
            if (r5 == 0) goto L_0x026d
            int r8 = r0.f267377d
            long r8 = (long) r8
            r5.mo112914a(r7, r8)
        L_0x026d:
            boolean r5 = r18.mo127063k1()
            if (r5 != 0) goto L_0x02b1
            java.lang.String r5 = r1.f267205C
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x02b1
            int r5 = r1.f267206D
            if (r5 <= 0) goto L_0x02b1
            java.lang.Class<f12.c> r5 = f12.C97813c.class
            monitor-enter(r5)
            f12.c r8 = f12.C97813c.f286943a     // Catch:{ all -> 0x02ae }
            if (r8 != 0) goto L_0x028d
            f12.c r8 = new f12.c     // Catch:{ all -> 0x02ae }
            r8.<init>()     // Catch:{ all -> 0x02ae }
            f12.C97813c.f286943a = r8     // Catch:{ all -> 0x02ae }
        L_0x028d:
            f12.c r8 = f12.C97813c.f286943a     // Catch:{ all -> 0x02ae }
            monitor-exit(r5)
            r8.getClass()
            f40.e r5 = f40.C86709a0.m107523b()
            r5.mo121108c()
            java.lang.Class<a62.b> r5 = a62.C27810b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            a62.b r5 = (a62.C27810b) r5
            com.tencent.mm.storage.d4 r5 = r5.mo55621A1()
            java.lang.String r8 = r1.f267205C
            int r9 = r1.f267206D
            r5.mo57629d(r8, r9, r2)
            goto L_0x02b1
        L_0x02ae:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x02b1:
            com.tencent.mm.modelimage.m r2 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r5 = r0.f267378e
            r8 = r17
            java.lang.String r2 = r2.mo127174TY(r5, r8, r8, r6)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x035f
            di3.d r5 = di3.C86312j.m106911c(r4)
            xp.b r5 = (p753xp.C102704b) r5
            com.tencent.mm.storage.f4 r9 = r1.f267221r
            int r9 = r9.getType()
            r10 = 0
            wp.b r5 = r5.mo138751as(r2, r9, r10, r10)
            java.lang.String r9 = r1.f267210d
            r15 = 5
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r10[r7] = r2
            int r11 = r5.f301760a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r6] = r11
            boolean r11 = r5.f301761b
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10[r3] = r11
            boolean r11 = r5.f301762c
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12 = 3
            r10[r12] = r11
            long r11 = r5.f301763d
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r11 = 4
            r10[r11] = r5
            java.lang.String r5 = "imageCheckDup %s ret:%s hitCache:%s copyResult:%s replaceResult:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r10)
            boolean r0 = r19.mo127145p()
            if (r0 != 0) goto L_0x035f
            r0 = r20
            long r13 = (long) r0
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x035f
            java.lang.String r0 = r1.f267205C
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x035f
            di3.d r0 = di3.C86312j.m106911c(r4)
            r9 = r0
            xp.b r9 = (p753xp.C102704b) r9
            com.tencent.mm.storage.f4 r0 = r1.f267221r
            int r11 = r0.getType()
            java.lang.String r12 = r1.f267205C
            r0 = 0
            r10 = r2
            r4 = 5
            r15 = r0
            wp.b r0 = r9.Xw0(r10, r11, r12, r13, r15)
            java.lang.String r5 = r1.f267210d
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r2
            int r2 = r0.f301760a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r6] = r2
            boolean r2 = r0.f301761b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r3] = r2
            boolean r2 = r0.f301762c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 3
            r4[r3] = r2
            long r2 = r0.f301763d
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 4
            r4[r2] = r0
            java.lang.String r0 = "imageCheckDup hevc %s ret:%s hitCache:%s copyResult:%s replaceResult:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r4)
        L_0x035f:
            ob0.n r0 = r1.f267212f
            r0.onSceneEnd(r7, r7, r8, r1)
            return r7
        L_0x0365:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92805a0.mo127064l1(com.tencent.mm.modelimage.k, int, int, int, byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r17, int r18, int r19, java.lang.String r20, com.tencent.p014mm.network.C114799u r21, byte[] r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = 0
            r4 = 3
            r5 = -1
            if (r1 != r4) goto L_0x0024
            if (r2 != r5) goto L_0x0024
            java.lang.String r6 = r0.f267222s
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0024
            java.lang.String r1 = r0.f267210d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r0.f267222s
            r2[r3] = r4
            java.lang.String r3 = "cdntra using cdn trans,  wait cdn service callback! clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r2)
            return
        L_0x0024:
            r6 = 4
            if (r1 != 0) goto L_0x00cf
            if (r2 == 0) goto L_0x002b
            goto L_0x00cf
        L_0x002b:
            r1 = r21
            ob0.c r1 = (ob0.C47350c) r1
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.g42 r1 = (te3.C49514g42) r1
            com.tencent.mm.modelimage.m r2 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r7 = r0.f267216j
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.tencent.mm.modelimage.k r2 = r2.mo127194nP(r7)
            int r7 = r1.f133845i
            if (r7 > 0) goto L_0x0050
            java.lang.String r3 = r0.f267210d
            java.lang.String r7 = "flood control, malformed data_len"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
        L_0x004e:
            r3 = -1
            goto L_0x0089
        L_0x0050:
            te3.qv3 r8 = r1.f133846j
            if (r8 == 0) goto L_0x0081
            int r8 = r8.f140572d
            if (r7 == r8) goto L_0x0059
            goto L_0x0081
        L_0x0059:
            int r8 = r1.f133844h
            if (r8 < 0) goto L_0x0079
            int r7 = r7 + r8
            int r9 = r1.f133843g
            if (r7 <= r9) goto L_0x0063
            goto L_0x0079
        L_0x0063:
            int r7 = r2.f267376c
            if (r8 == r7) goto L_0x006f
            java.lang.String r3 = r0.f267210d
            java.lang.String r7 = "flood control, malformed start_pos"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            goto L_0x004e
        L_0x006f:
            if (r9 > 0) goto L_0x0089
            java.lang.String r3 = r0.f267210d
            java.lang.String r7 = "flood control, malformed total_len"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            goto L_0x004e
        L_0x0079:
            java.lang.String r3 = r0.f267210d
            java.lang.String r7 = "flood control, malformed start pos"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            goto L_0x004e
        L_0x0081:
            java.lang.String r3 = r0.f267210d
            java.lang.String r7 = "flood control, malformed data is null or dataLen not match with data buf length"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            goto L_0x004e
        L_0x0089:
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x009f
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 111(0x6f, double:5.5E-322)
            r11 = 192(0xc0, double:9.5E-322)
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            ob0.n r1 = r0.f267212f
            r1.onSceneEnd(r6, r5, r7, r0)
            return
        L_0x009f:
            int r3 = r1.f133843g
            int r6 = r1.f133844h
            int r8 = r1.f133845i
            te3.qv3 r1 = r1.f133846j
            pe3.b r1 = r1.f140574f
            byte[] r1 = r1.f257327a
            r17 = r16
            r18 = r2
            r19 = r3
            r20 = r6
            r21 = r8
            r22 = r1
            boolean r1 = r17.mo127064l1(r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x00ce
            com.tencent.mm.network.g r1 = r16.dispatcher()
            ob0.n r2 = r0.f267212f
            int r1 = r0.doScene(r1, r2)
            if (r1 >= 0) goto L_0x00ce
            ob0.n r1 = r0.f267212f
            r1.onSceneEnd(r4, r5, r7, r0)
        L_0x00ce:
            return
        L_0x00cf:
            if (r1 != r6) goto L_0x00dd
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 111(0x6f, double:5.5E-322)
            r11 = 193(0xc1, double:9.54E-322)
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
        L_0x00dd:
            ob0.n r3 = r0.f267212f
            r4 = r20
            r3.onSceneEnd(r1, r2, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92805a0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return this.f267218o == 0 ? 100 : 1280;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public C92805a0(long j, long j2, int i, C47355o oVar, int i2) {
        this.f267210d = "MicroMsg.NetSceneGetMsgImg";
        this.f267215i = -1;
        this.f267219p = null;
        this.f267221r = null;
        this.f267222s = "";
        this.f267223t = 0;
        this.f267224u = 0;
        this.f267225v = true;
        this.f267226w = "";
        this.f267227x = "";
        this.f267228y = 0;
        this.f267229z = -1;
        this.f267203A = false;
        this.f267204B = -1;
        this.f267205C = null;
        this.f267206D = 0;
        this.f267207E = 0;
        this.f267208F = new a0$$c(this);
        this.f267209G = new a0$$d(this);
        Assert.assertTrue(j >= 0 && j2 >= 0 && oVar != null);
        this.f267211e = oVar;
        this.f267218o = i;
        this.f267214h = j;
        this.f267215i = j;
        this.f267216j = j;
        this.f267220q = j2;
        this.f267204B = i2;
        C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267216j));
        if (i == 1) {
            this.f267216j = (long) nP.mo127138i();
            nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267216j));
        }
        this.f267210d += "[" + this.f267216j + "]";
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new C49378f42());
        bVar.mo72407e(new C49514g42());
        bVar.mo72409g("/cgi-bin/micromsg-bin/getmsgimg");
        bVar.mo72404b(109);
        bVar.mo72406d(10);
        bVar.mo72408f(1000000010);
        C47350c a = bVar.mo72403a();
        this.f267213g = a;
        C49378f42 f422 = (C49378f42) a.mo72394a();
        this.f267221r = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j2);
        f422.f133287h = nP.mo127142m();
        f422.f133286g = nP.mo127144o();
        Log.m105919d(this.f267210d, "cdntra offset:%d total:%d stack:[%s]", Integer.valueOf(nP.mo127142m()), Integer.valueOf(nP.mo127144o()), Util.getStack());
        f422.f133290n = this.f267221r.mo108774y2();
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(this.f267221r.mo108768t());
        f422.f133284e = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.mo73357f((String) C86709a0.m107535s().mo121142i().mo119683d(2));
        f422.f133285f = rv33;
        f422.f133289j = i;
        if (nP.mo127142m() == 0) {
            this.f267219p = new C81033k(109, false, (long) nP.mo127144o());
        }
        this.f267217n = 8192;
        if (oVar != null) {
            MMHandlerThread.postToMainThread(new a0$$b(this, oVar, nP.mo127142m(), nP.mo127144o()));
        }
    }
}
