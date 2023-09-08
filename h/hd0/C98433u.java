package hd0;

import bp3.C104160f;
import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import ig3.C98692n;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p682rz.C101484m;
import p753xp.C102704b;
import p867wp.C102479b;
import pc0.C77068x;
import te3.C52197z04;

/* renamed from: hd0.u */
public class C98433u extends C117747y implements C1311n, C101484m {

    /* renamed from: d */
    public C11385n f288675d;

    /* renamed from: e */
    public C47350c f288676e;

    /* renamed from: f */
    public String f288677f = null;

    /* renamed from: g */
    public int f288678g;

    /* renamed from: h */
    public String f288679h;

    /* renamed from: i */
    public C98121d f288680i;

    /* renamed from: j */
    public C92834j f288681j;

    /* renamed from: n */
    public String f288682n;

    /* renamed from: o */
    public C98408n0 f288683o;

    /* renamed from: p */
    public int f288684p;

    /* renamed from: q */
    public boolean f288685q;

    /* renamed from: r */
    public String f288686r;

    /* renamed from: s */
    public C98408n0 f288687s;

    /* renamed from: t */
    public C98121d f288688t;

    /* renamed from: u */
    public final C98124g.C98125a f288689u;

    public C98433u(String str, int i, C98121d dVar, C92834j jVar, boolean z) {
        boolean z2 = false;
        this.f288678g = 0;
        this.f288680i = null;
        this.f288681j = null;
        this.f288689u = new u$$b(this);
        Assert.assertTrue(str != null);
        Assert.assertTrue(jVar != null ? true : z2);
        this.f288677f = str;
        this.f288680i = dVar;
        this.f288681j = jVar;
        this.f288678g = i;
        this.f288685q = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r18, ob0.C11385n r19) {
        /*
            r17 = this;
            r6 = r17
            java.lang.String r0 = r6.f288677f
            hd0.n0 r0 = hd0.C98429r0.m127818i(r0)
            java.lang.String r7 = "MicroMsg.NetSceneUploadVideoOrigin"
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Get info Failed file:"
            r0.append(r1)
            java.lang.String r1 = r6.f288677f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.mm.modelimage.j r0 = r6.f288681j
            r1 = 3
            r2 = -1
            r0.mo127120a(r1, r2)
            return r2
        L_0x002a:
            r6.f288683o = r0
            r1 = r19
            r6.f288675d = r1
            boolean r1 = hd0.C98429r0.m127831v()
            r8 = 0
            if (r1 == 0) goto L_0x025e
            gi.d r1 = r6.f288680i
            if (r1 != 0) goto L_0x003d
            goto L_0x025e
        L_0x003d:
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.y04 r2 = new te3.y04
            r2.<init>()
            r1.f127066a = r2
            te3.z04 r2 = new te3.z04
            r2.<init>()
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/sendvideouploadmsg"
            r1.f127068c = r2
            r2 = 6828(0x1aac, float:9.568E-42)
            r1.f127069d = r2
            r2 = 39
            r1.f127070e = r2
            r2 = 1000000039(0x3b9aca27, float:0.0047238055)
            r1.f127071f = r2
            ob0.c r1 = r1.mo72403a()
            r6.f288676e = r1
            ob0.c$c r1 = r1.f127055a
            pe3.a r1 = r1.f127080a
            te3.y04 r1 = (te3.C101869y04) r1
            java.lang.String r2 = r6.f288677f
            r1.f299900d = r2
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r1.f299901e = r2
            gi.d r2 = r6.f288680i
            java.lang.String r3 = r2.field_toUser
            r1.f299902f = r3
            java.lang.String r3 = r2.field_fileId
            r1.f299903g = r3
            java.lang.String r3 = r2.field_aesKey
            r1.f299904h = r3
            int r2 = r2.field_thumbimgLength
            r1.f299905i = r2
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r3 = r6.f288677f
            java.lang.String r2 = r2.mo137729r(r3)
            android.graphics.BitmapFactory$Options r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r2)
            r4 = 1
            if (r3 == 0) goto L_0x00a3
            int r2 = r3.outWidth
            r1.f299907n = r2
            int r2 = r3.outHeight
            r1.f299906j = r2
            goto L_0x00ac
        L_0x00a3:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r8] = r2
            java.lang.String r2 = "cdntra getImageOptions for thumb failed path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r3)
        L_0x00ac:
            int r2 = r0.f288566m
            r1.f299908o = r2
            java.lang.String r2 = r6.f288677f
            hd0.n0 r2 = hd0.C98429r0.m127818i(r2)
            r3 = 0
            if (r2 == 0) goto L_0x00fe
            java.lang.String r5 = r2.f288542J
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00c4
            java.lang.String r2 = r2.f288542J
            goto L_0x00ff
        L_0x00c4:
            long r9 = r2.f288541I
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x00e9
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)     // Catch:{ all -> 0x00e7 }
            f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ all -> 0x00e7 }
            g62.l r5 = r5.mo96095LE()     // Catch:{ all -> 0x00e7 }
            long r9 = r2.f288541I     // Catch:{ all -> 0x00e7 }
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5     // Catch:{ all -> 0x00e7 }
            com.tencent.mm.storage.f4 r2 = r5.b00(r9)     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = r2.f230724G     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = eb0.C75569c4.m90685r(r2)     // Catch:{ all -> 0x00e7 }
            goto L_0x00ff
        L_0x00e7:
            goto L_0x00fe
        L_0x00e9:
            java.lang.String r2 = r2.mo137702f()
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106456q(r2)
            java.lang.Class<gw.k> r5 = p159gw.C98252k.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            gw.k r5 = (p159gw.C98252k) r5
            java.lang.String r2 = r5.pc0(r2)
            goto L_0x00ff
        L_0x00fe:
            r2 = r3
        L_0x00ff:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r9 = r6.f288678g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r8] = r9
            r5[r4] = r2
            java.lang.String r9 = "createVideoMsgSource preLoadLength: %s, forward uuid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r5)
            int r5 = r6.f288678g
            if (r5 <= 0) goto L_0x0183
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r9) goto L_0x011a
            goto L_0x0183
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "<msgsource>"
            r5.append(r9)
            java.lang.String r9 = "<videopreloadlen>"
            r5.append(r9)
            int r9 = r6.f288678g
            r5.append(r9)
            java.lang.String r9 = "</videopreloadlen>"
            r5.append(r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x016c
            java.lang.String r9 = "<"
            r5.append(r9)
            java.lang.String r10 = "sec_msg_node"
            r5.append(r10)
            java.lang.String r11 = ">"
            r5.append(r11)
            r5.append(r9)
            java.lang.String r9 = "uuid"
            r5.append(r9)
            r5.append(r11)
            r5.append(r2)
            java.lang.String r2 = "</"
            r5.append(r2)
            r5.append(r9)
            r5.append(r11)
            r5.append(r2)
            r5.append(r10)
            r5.append(r11)
        L_0x016c:
            java.lang.String r2 = "</msgsource>"
            r5.append(r2)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 354(0x162, double:1.75E-321)
            r12 = 35
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.String r2 = r5.toString()
            goto L_0x0192
        L_0x0183:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x018e
            java.lang.String r2 = eb0.C75569c4.m90679l()
            goto L_0x0192
        L_0x018e:
            java.lang.String r2 = eb0.C75569c4.m90680m(r2)
        L_0x0192:
            r1.f299909p = r2
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r5 = r6.f288677f
            java.lang.String r2 = r2.mo137728q(r5)
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106456q(r2)
            r1.f299910q = r2
            int r2 = r0.f288566m
            r1.f299912s = r2
            gi.d r2 = r6.f288680i
            java.lang.String r2 = r2.field_fileId
            r1.f299919z = r2
            java.lang.String r2 = r0.mo137705i()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01bd
            java.lang.String r2 = r0.mo137705i()
            goto L_0x01ce
        L_0x01bd:
            java.lang.String r2 = r0.f288543K
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01cc
            java.lang.String r2 = r0.f288543K
            java.lang.String r2 = com.tencent.p014mm.modelimage.C80999a.m98902b(r2)
            goto L_0x01ce
        L_0x01cc:
            java.lang.String r2 = ""
        L_0x01ce:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x0226
            java.lang.String r5 = r0.mo137705i()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x01ed
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r8] = r2
            java.lang.String r9 = "uploadVideo video.recvXml is empty and update: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r5)
            r0.f288575v = r2
            hd0.C98429r0.m127808N(r0)
        L_0x01ed:
            com.tencent.mm.modelimage.a r5 = com.tencent.p014mm.modelimage.C80999a.m98903c(r2)
            if (r5 == 0) goto L_0x020b
            java.lang.String r9 = r5.f237927a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x020b
            java.lang.String r9 = r5.f237927a
            r1.f299915v = r9
            java.lang.String r9 = r5.f237928b
            r1.f299918y = r9
            java.lang.String r9 = r5.f237930d
            r1.f299917x = r9
            java.lang.String r5 = r5.f237929c
            r1.f299916w = r5
        L_0x020b:
            java.lang.String r5 = r1.f299904h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0226
            java.lang.String r5 = "msg"
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r5, r3)
            if (r2 == 0) goto L_0x0226
            java.lang.String r3 = ".msg.videomsg.$cdnthumbaeskey"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.f299904h = r2
        L_0x0226:
            java.lang.String r2 = r0.f288546N
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x024a
            java.lang.String r2 = r0.f288546N
            hd0.n0 r2 = hd0.C98429r0.m127818i(r2)
            if (r2 == 0) goto L_0x024a
            hd0.o0 r3 = hd0.C98398h0.Bx0()
            java.lang.String r0 = r0.f288546N
            java.lang.String r0 = r3.mo137728q(r0)
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
            r1.f299913t = r0
            int r0 = r2.f288566m
            r1.f299914u = r0
        L_0x024a:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = r1.f299909p
            r0[r8] = r1
            java.lang.String r1 = "Req MsgSource %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r1, r0)
            ob0.c r0 = r6.f288676e
            r1 = r18
            int r0 = r6.dispatch(r1, r0, r6)
            return r0
        L_0x025e:
            r1 = 3
            r2 = 0
            r4 = 0
            java.lang.String r3 = ""
            r0 = r17
            r5 = r17
            r0.mo137766m1(r1, r2, r3, r4, r5)
            java.lang.String r0 = "do not send place holder cgi, just go video upload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98433u.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f288683o.f288567n, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return 6828;
    }

    /* renamed from: j1 */
    public final void mo137763j1(C98408n0 n0Var, C98121d dVar, C98121d dVar2) {
        C102479b bVar;
        C98408n0 i;
        C98408n0 n0Var2 = n0Var;
        C98121d dVar3 = dVar;
        C98121d dVar4 = dVar2;
        Class cls = C102704b.class;
        n0Var2.f288564k = Util.nowSecond();
        n0Var2.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        n0Var2.f288548P = 2098436;
        C98429r0.m127808N(n0Var);
        String str = n0Var2.f288546N;
        if (C98429r0.m127830u() && dVar4 != null && !Util.isNullOrNil(str) && (i = C98429r0.m127818i(str)) != null) {
            i.f288564k = Util.nowSecond();
            i.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
            i.f288548P = 1284;
            C98429r0.m127808N(i);
        }
        C98692n.f289404a.mo138102c(this.f288677f);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f288683o.f288567n);
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) != 1) {
            z = false;
        }
        this.f288675d.onSceneEnd(0, 0, "", this);
        if (!C98429r0.m127831v() || this.f288679h == null) {
            this.f288681j.mo127120a(0, 0);
        }
        C98121d dVar5 = this.f288688t;
        if (dVar5 != null) {
            mo137764k1(dVar5);
        } else {
            mo137764k1(dVar3);
        }
        if (z) {
            if (dVar3 != null) {
                String q = C98398h0.Bx0().mo137728q(this.f288677f);
                String r = C98398h0.Bx0().mo137729r(this.f288677f);
                if (C86013q1.m106450k(q)) {
                    if (Util.isNullOrNil(n0Var.mo137702f())) {
                        String q2 = C86013q1.m106456q(r);
                        bVar = ((C102704b) C86312j.m106911c(cls)).mo138751as(q, b002.getType(), dVar3.field_filemd5, (byte[]) null);
                        C102479b as = ((C102704b) C86312j.m106911c(cls)).mo138751as(r, b002.getType(), q2, (byte[]) null);
                        Log.m105924i("MicroMsg.NetSceneUploadVideoOrigin", "check video thumb dup, fileName = " + this.f288677f + " result = " + as.f301760a);
                    } else {
                        bVar = ((C102704b) C86312j.m106911c(cls)).mo138752mP(this.f288683o.mo137702f(), q, r, b002.getType(), this.f288683o.f288566m, C86013q1.m106456q(this.f288683o.mo137702f()));
                    }
                    Log.m105924i("MicroMsg.NetSceneUploadVideoOrigin", "check video dup, fileName = " + this.f288677f + " result = " + bVar.f301760a);
                }
            }
            if (dVar4 != null && !Util.isNullOrNil(str)) {
                String q3 = C98398h0.Bx0().mo137728q(str);
                if (C86013q1.m106450k(q3)) {
                    C102479b as4 = ((C102704b) C86312j.m106911c(cls)).mo138751as(q3, b002.getType(), dVar4.field_filemd5, (byte[]) null);
                    Log.m105924i("MicroMsg.NetSceneUploadVideoOrigin", "check video dup origin, fileName = " + this.f288677f + " result = " + as4.f301760a);
                }
            }
        }
    }

    /* renamed from: k1 */
    public final void mo137764k1(C98121d dVar) {
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f288683o.f288567n);
        C98394e0.vx0().yx0(dVar, C98398h0.Bx0().mo137728q(this.f288677f), !Util.isNullOrNil(this.f288683o.f288542J) ? this.f288683o.f288542J : C75569c4.m90685r(b002.f230724G), b002.mo108774y2());
    }

    /* renamed from: l1 */
    public final String mo137765l1() {
        return this.f288677f + "_" + hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02f9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02fa, code lost:
        r5 = null;
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x031d A[SYNTHETIC, Splitter:B:100:0x031d] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06b6 A[SYNTHETIC, Splitter:B:217:0x06b6] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x06bd A[SYNTHETIC, Splitter:B:221:0x06bd] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02ea A[SYNTHETIC, Splitter:B:79:0x02ea] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02f1 A[SYNTHETIC, Splitter:B:83:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:39:0x0225] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0316 A[SYNTHETIC, Splitter:B:96:0x0316] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137766m1(int r37, int r38, java.lang.String r39, te3.C52197z04 r40, ob0.C117747y r41) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            java.lang.String r7 = "null"
            java.lang.String r8 = ""
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            hd0.n0 r0 = r1.f288683o
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f288564k = r10
            if (r5 == 0) goto L_0x0027
            hd0.n0 r0 = r1.f288683o
            long r10 = r5.f145625d
            r0.f288556c = r10
            java.lang.String r0 = r5.f145626e
            r1.f288679h = r0
        L_0x0027:
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r11 = r36.mo137765l1()
            r12 = 0
            r0[r12] = r11
            hd0.n0 r11 = r1.f288683o
            long r13 = r11.f288556c
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r13 = 1
            r0[r13] = r11
            int r11 = sf0.C90188n0.f258951s
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14 = 2
            r0[r14] = r11
            java.lang.String r11 = "MicroMsg.NetSceneUploadVideoOrigin"
            java.lang.String r15 = "%s dkmsgid  set svrmsgid %d -> %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r15, r0)
            r0 = 10007(0x2717, float:1.4023E-41)
            int r15 = sf0.C90188n0.f258950r
            r16 = 0
            if (r0 != r15) goto L_0x0068
            int r0 = sf0.C90188n0.f258951s
            if (r0 == 0) goto L_0x0068
            hd0.n0 r15 = r1.f288683o
            r18 = r11
            long r10 = r15.f288556c
            int r19 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r19 == 0) goto L_0x006a
            long r10 = (long) r0
            r15.f288556c = r10
            sf0.C90188n0.f258951s = r12
            goto L_0x006a
        L_0x0068:
            r18 = r11
        L_0x006a:
            hd0.n0 r0 = r1.f288683o
            r10 = 1028(0x404, float:1.44E-42)
            r0.f288548P = r10
            hd0.C98429r0.m127808N(r0)
            if (r5 == 0) goto L_0x015e
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137707k()
            k40.a r11 = f40.C86709a0.m107533q(r9)
            f62.k0 r11 = (f62.C75700k0) r11
            com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r11.get(r0)
            if (r0 == 0) goto L_0x0096
            long r14 = r0.f108320R1
            int r15 = (int) r14
            if (r15 > 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            boolean r0 = r0.mo62916m3()
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            java.lang.String r14 = " toUser:"
            java.lang.String r15 = " file:"
            java.lang.String r11 = "ERR: finish video invaild MSGSVRID :"
            if (r0 != 0) goto L_0x00fe
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137707k()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85793A5(r0)
            if (r0 == 0) goto L_0x00ac
            goto L_0x00fe
        L_0x00ac:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r20 = r36.mo137765l1()
            r0[r12] = r20
            java.lang.String r13 = "%s not upload to biz"
            r12 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r0)
            hd0.n0 r0 = r1.f288683o
            r18 = r11
            long r10 = r0.f288556c
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0160
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r10 = r18
            r0.append(r10)
            hd0.n0 r10 = r1.f288683o
            long r10 = r10.f288556c
            r0.append(r10)
            r0.append(r15)
            java.lang.String r10 = r1.f288677f
            r0.append(r10)
            r0.append(r14)
            hd0.n0 r10 = r1.f288683o
            java.lang.String r10 = r10.mo137707k()
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.lang.String r0 = r1.f288677f
            hd0.C98429r0.m127799E(r0)
            com.tencent.mm.modelimage.j r0 = r1.f288681j
            r10 = -1
            r11 = 3
            r0.mo127120a(r11, r10)
            goto L_0x0160
        L_0x00fe:
            r10 = r11
            r12 = r18
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r18 = r36.mo137765l1()
            r19 = 0
            r0[r19] = r18
            hd0.n0 r11 = r1.f288683o
            java.lang.String r11 = r11.mo137707k()
            r18 = 1
            r0[r18] = r11
            java.lang.String r11 = "%s upload to biz :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r11, r0)
            hd0.n0 r0 = r1.f288683o
            r18 = r14
            long r13 = r0.f288556c
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0160
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            hd0.n0 r10 = r1.f288683o
            long r13 = r10.f288556c
            r0.append(r13)
            r0.append(r15)
            java.lang.String r10 = r1.f288677f
            r0.append(r10)
            r10 = r18
            r0.append(r10)
            hd0.n0 r10 = r1.f288683o
            java.lang.String r10 = r10.mo137707k()
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.lang.String r0 = r1.f288677f
            hd0.C98429r0.m127799E(r0)
            com.tencent.mm.modelimage.j r0 = r1.f288681j
            r10 = -1
            r11 = 3
            r0.mo127120a(r11, r10)
            goto L_0x0160
        L_0x015e:
            r12 = r18
        L_0x0160:
            hd0.n0 r0 = r1.f288683o
            long r10 = r0.f288563j
            java.lang.String r0 = r0.mo137707k()
            hd0.n0 r14 = r1.f288683o
            java.lang.String r14 = r14.mo137700d()
            java.lang.String r15 = "upvideo"
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r15, r10, r0, r14)
            r1.f288682n = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01c2
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r5 = r36.mo137765l1()
            r7 = 0
            r0[r7] = r5
            hd0.n0 r5 = r1.f288683o
            java.lang.String r5 = r5.mo137700d()
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = "%s cdntra genClientId failed not use cdn file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r5, r0)
            ig3.n r22 = ig3.C98692n.f289404a
            r23 = 0
            java.lang.String r0 = r1.f288677f
            r25 = 6
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            java.lang.String r5 = r1.f288686r
            if (r5 == 0) goto L_0x01ac
            r34 = 1
            goto L_0x01ae
        L_0x01ac:
            r34 = 0
        L_0x01ae:
            r35 = -1
            r24 = r0
            r22.mo138104e(r23, r24, r25, r26, r28, r30, r32, r34, r35)
            ob0.n r0 = r1.f288675d
            r0.onSceneEnd(r2, r3, r4, r6)
            com.tencent.mm.modelimage.j r0 = r1.f288681j
            r2 = -1
            r3 = 3
            r0.mo127120a(r3, r2)
            return
        L_0x01c2:
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r10 = r1.f288677f
            java.lang.String r10 = r0.mo137729r(r10)
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r14 = r1.f288677f
            java.lang.String r14 = r0.mo137728q(r14)
            gi.g r15 = new gi.g
            r15.<init>()
            java.lang.String r0 = "task_NetSceneUploadVideo_1"
            r15.f287660d = r0
            gi.g$a r0 = r1.f288689u
            r15.f287662f = r0
            java.lang.String r0 = r1.f288682n
            r15.field_mediaId = r0
            r15.field_fullpath = r14
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            r11.<init>((java.lang.String) r10)
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r0 = r11.mo119974l()
            r17 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r18 = r10
            java.lang.String r10 = "send"
            r7.append(r10)
            java.lang.String r10 = r11.getName()
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r13.<init>((com.tencent.p014mm.vfs.C86009m1) r0, (java.lang.String) r7)
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            long r22 = r11.mo119980r()
            java.lang.Long r7 = java.lang.Long.valueOf(r22)
            r10 = 0
            r0[r10] = r7
            java.lang.String r7 = "getSendThumbnailPath:origin file: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r7, r0)
            long r22 = r11.mo119980r()     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            r24 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e3
            boolean r0 = r13.mo119967g()     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = "dst file %s exist!"
            r10 = 1
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            java.lang.String r10 = r13.mo119971i()     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            r21 = 0
            r7[r21] = r10     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r0, r7)     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            r23 = r9
            r0 = 1
        L_0x0249:
            r5 = 0
            r7 = 0
            goto L_0x02e8
        L_0x024d:
            java.lang.String r0 = r11.mo119971i()     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r0)     // Catch:{ Exception -> 0x02fe, all -> 0x02f9 }
            java.lang.String r7 = "getSendThumbnailPath:options %s"
            r23 = r9
            r10 = 1
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            if (r0 != 0) goto L_0x0262
            r5 = r17
        L_0x0260:
            r10 = 0
            goto L_0x027e
        L_0x0262:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r10.<init>()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r10.append(r8)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            int r5 = r0.outWidth     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r10.append(r5)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            java.lang.String r5 = "-"
            r10.append(r5)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            int r5 = r0.outHeight     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r10.append(r5)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            goto L_0x0260
        L_0x027e:
            r9[r10] = r5     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r9)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r5 = 288(0x120, float:4.04E-43)
            if (r0 == 0) goto L_0x02bd
            int r7 = r0.outWidth     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            if (r7 > r5) goto L_0x028f
            int r0 = r0.outHeight     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            if (r0 <= r5) goto L_0x02bd
        L_0x028f:
            java.lang.String r24 = r11.mo119971i()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r25 = 288(0x120, float:4.04E-43)
            r26 = 288(0x120, float:4.04E-43)
            android.graphics.Bitmap$CompressFormat r27 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r28 = 60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r0.<init>()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            com.tencent.mm.vfs.m1 r5 = r13.mo119974l()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            java.lang.String r5 = r5.mo119971i()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r0.append(r5)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            java.lang.String r5 = "/"
            r0.append(r5)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            java.lang.String r29 = r0.toString()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            java.lang.String r30 = r13.getName()     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r24, (int) r25, (int) r26, (android.graphics.Bitmap.CompressFormat) r27, (int) r28, (java.lang.String) r29, (java.lang.String) r30)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            goto L_0x0249
        L_0x02bd:
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106422D(r11)     // Catch:{ Exception -> 0x02e1, all -> 0x02f9 }
            r0 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r7, r0, r5, r5)     // Catch:{ Exception -> 0x02de, all -> 0x02da }
            if (r0 == 0) goto L_0x02e6
            java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106426H(r13)     // Catch:{ Exception -> 0x02de, all -> 0x02da }
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02d8 }
            r10 = 60
            boolean r0 = r0.compress(r9, r10, r5)     // Catch:{ Exception -> 0x02d8 }
            goto L_0x02e8
        L_0x02d5:
            r0 = move-exception
            goto L_0x06b4
        L_0x02d8:
            r0 = move-exception
            goto L_0x0303
        L_0x02da:
            r0 = move-exception
            r5 = 0
            goto L_0x06b4
        L_0x02de:
            r0 = move-exception
            r5 = 0
            goto L_0x0303
        L_0x02e1:
            r0 = move-exception
            goto L_0x0301
        L_0x02e3:
            r23 = r9
            r7 = 0
        L_0x02e6:
            r0 = 0
            r5 = 0
        L_0x02e8:
            if (r7 == 0) goto L_0x02ef
            r7.close()     // Catch:{ IOException -> 0x02ee }
            goto L_0x02ef
        L_0x02ee:
        L_0x02ef:
            if (r5 == 0) goto L_0x02f6
            r5.close()     // Catch:{ IOException -> 0x02f5 }
            goto L_0x02f6
        L_0x02f5:
        L_0x02f6:
            r24 = r8
            goto L_0x0323
        L_0x02f9:
            r0 = move-exception
            r5 = 0
            r7 = 0
            goto L_0x06b4
        L_0x02fe:
            r0 = move-exception
            r23 = r9
        L_0x0301:
            r5 = 0
            r7 = 0
        L_0x0303:
            java.lang.String r9 = "exception: %s"
            r24 = r8
            r10 = 1
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ all -> 0x02d5 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x02d5 }
            r10 = 0
            r8[r10] = r0     // Catch:{ all -> 0x02d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r9, r8)     // Catch:{ all -> 0x02d5 }
            if (r7 == 0) goto L_0x031b
            r7.close()     // Catch:{ IOException -> 0x031a }
            goto L_0x031b
        L_0x031a:
        L_0x031b:
            if (r5 == 0) goto L_0x0322
            r5.close()     // Catch:{ IOException -> 0x0321 }
            goto L_0x0322
        L_0x0321:
        L_0x0322:
            r0 = 0
        L_0x0323:
            if (r0 == 0) goto L_0x034b
            r5 = 3
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r36.mo137765l1()
            r7 = 0
            r0[r7] = r5
            long r7 = r13.mo119980r()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = r13.mo119971i()
            r7 = 2
            r0[r7] = r5
            java.lang.String r7 = "%s compress success: length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r0)
            java.lang.String r10 = r13.mo119971i()
            goto L_0x036e
        L_0x034b:
            r7 = 3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r36.mo137765l1()
            r8 = 0
            r0[r8] = r7
            long r7 = r11.mo119980r()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            r0[r8] = r7
            java.lang.String r7 = r11.mo119971i()
            r5 = 2
            r0[r5] = r7
            java.lang.String r5 = "%s compress fail: origin length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r0)
            r10 = r18
        L_0x036e:
            r15.field_thumbpath = r10
            r5 = 4
            r15.field_fileType = r5
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137707k()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85812O4(r0)
            if (r0 == 0) goto L_0x0383
            r7 = 0
            r15.field_sendmsg_viacdn = r7
            goto L_0x0399
        L_0x0383:
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39150b(r14)
            if (r0 == 0) goto L_0x0399
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 106(0x6a, double:5.24E-322)
            r28 = 30
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
            r7 = 1
            r15.field_use_multithread = r7
        L_0x0399:
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137707k()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85812O4(r0)
            if (r0 != 0) goto L_0x03ab
            boolean r0 = r1.f288685q
            if (r0 == 0) goto L_0x03ab
            r0 = 1
            goto L_0x03ac
        L_0x03ab:
            r0 = 0
        L_0x03ac:
            r15.field_enable_hitcheck = r0
            xb0.h r0 = xb0.C102609h.Fx0()
            boolean r0 = r0.zx0(r14)
            r15.field_largesvideo = r0
            hd0.n0 r0 = r1.f288683o
            if (r0 == 0) goto L_0x03c5
            int r0 = r0.f288576w
            r7 = 3
            if (r7 != r0) goto L_0x03c6
            r8 = 1
            r15.field_smallVideoFlag = r8
            goto L_0x03c6
        L_0x03c5:
            r7 = 3
        L_0x03c6:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r36.mo137765l1()
            r8 = 0
            r0[r8] = r7
            hd0.n0 r7 = r1.f288683o
            te3.gu2 r7 = r7.f288538F
            if (r7 != 0) goto L_0x03d7
            r7 = 1
            goto L_0x03d8
        L_0x03d7:
            r7 = 0
        L_0x03d8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 1
            r0[r8] = r7
            java.lang.String r7 = r1.f288677f
            r8 = 2
            r0[r8] = r7
            java.lang.String r7 = "%s upload video MMSightExtInfo is null? %b %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r0)
            hd0.n0 r0 = r1.f288683o
            te3.gu2 r0 = r0.f288538F
            if (r0 == 0) goto L_0x0414
            boolean r0 = r0.f298309e
            if (r0 == 0) goto L_0x0414
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r36.mo137765l1()
            r8 = 0
            r0[r8] = r7
            java.lang.String r7 = "%s local capture video, mark use large video"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r0)
            xb0.h r0 = xb0.C102609h.Fx0()
            xb0.h r7 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r7 = r7.mo142236Xa()
            int r0 = r0.xx0(r7)
            r15.field_largesvideo = r0
        L_0x0414:
            hd0.n0 r0 = r1.f288683o
            hd0.e0 r25 = hd0.C98394e0.vx0()
            hd0.o0 r7 = hd0.C98398h0.Bx0()
            java.lang.String r8 = r1.f288677f
            java.lang.String r27 = r7.mo137728q(r8)
            java.lang.String r28 = r0.mo137707k()
            r31 = 2
            r32 = 2
            java.lang.String r26 = ""
            java.lang.String r29 = ""
            java.lang.String r30 = ""
            r25.wx0(r26, r27, r28, r29, r30, r31, r32)
            r7 = 3
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r36.mo137765l1()
            r8 = 0
            r0[r8] = r7
            hd0.n0 r7 = r1.f288683o
            java.lang.String r7 = r7.mo137700d()
            r8 = 1
            r0[r8] = r7
            hd0.n0 r7 = r1.f288683o
            te3.tc4 r7 = r7.f288535C
            if (r7 != 0) goto L_0x0451
            r7 = r17
            goto L_0x0453
        L_0x0451:
            java.lang.String r7 = r7.f299543j
        L_0x0453:
            r8 = 2
            r0[r8] = r7
            java.lang.String r7 = "%s checkAD file:%s adinfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r0)
            hd0.n0 r0 = r1.f288683o
            te3.tc4 r0 = r0.f288535C
            if (r0 == 0) goto L_0x046c
            java.lang.String r0 = r0.f299543j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x046c
            r7 = 1
            r15.field_advideoflag = r7
        L_0x046c:
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137707k()
            r15.field_talker = r0
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137707k()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            r15.field_chattype = r0
            r7 = 2
            r15.field_priority = r7
            r7 = 0
            r15.field_needStorage = r7
            r15.field_isStreamMedia = r7
            r8 = 1
            r15.field_trysafecdn = r8
            java.lang.String r0 = r15.field_thumbpath
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r0 = (int) r9
            r1.f288684p = r0
            r9 = 5242880(0x500000, float:7.34684E-39)
            if (r0 < r9) goto L_0x04e0
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r5 = r36.mo137765l1()
            r0[r7] = r5
            java.lang.String r5 = r15.field_thumbpath
            r0[r8] = r5
            int r5 = r1.f288684p
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 2
            r0[r7] = r5
            java.lang.String r5 = "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r5, r0)
            ig3.n r22 = ig3.C98692n.f289404a
            r23 = 0
            java.lang.String r0 = r1.f288677f
            r25 = 6
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            java.lang.String r5 = r1.f288686r
            if (r5 == 0) goto L_0x04ca
            r34 = 1
            goto L_0x04cc
        L_0x04ca:
            r34 = 0
        L_0x04cc:
            r35 = -1
            r24 = r0
            r22.mo138104e(r23, r24, r25, r26, r28, r30, r32, r34, r35)
            ob0.n r0 = r1.f288675d
            r0.onSceneEnd(r2, r3, r4, r6)
            com.tencent.mm.modelimage.j r0 = r1.f288681j
            r2 = -1
            r3 = 3
            r0.mo127120a(r3, r2)
            return
        L_0x04e0:
            hd0.n0 r0 = r1.f288683o
            java.lang.String r0 = r0.mo137705i()
            java.lang.String r7 = "msg"
            r8 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r7, r8)
            if (r0 == 0) goto L_0x0506
            java.lang.String r7 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r15.field_fileId = r7
            java.lang.String r7 = ".msg.videomsg.$aeskey"
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r15.field_aesKey = r0
            goto L_0x05b5
        L_0x0506:
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r36.mo137765l1()
            r9 = 0
            r0[r9] = r7
            java.lang.String r7 = "%s cdntra parse video recv xml failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r0)
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x05a5 }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x05a5 }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x05a5 }
            java.lang.String r7 = "UseVideoHash"
            java.lang.String r0 = r0.mo107405c(r7)     // Catch:{ Exception -> 0x05a5 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x05a5 }
            java.lang.String r7 = ","
            java.lang.String[] r0 = r0.split(r7)     // Catch:{ Exception -> 0x05a5 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x05a5 }
            f40.e r7 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x05a5 }
            int r7 = r7.mo121110g()     // Catch:{ Exception -> 0x05a5 }
            r9 = 100
            int r7 = p823sg.C101615j.m133462b(r7, r9)     // Catch:{ Exception -> 0x05a5 }
            if (r0 == 0) goto L_0x0553
            int r9 = r0.length     // Catch:{ Exception -> 0x05a5 }
            r10 = 1
            if (r9 < r10) goto L_0x0553
            r9 = 0
            r10 = r0[r9]     // Catch:{ Exception -> 0x05a5 }
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r9)     // Catch:{ Exception -> 0x05a5 }
            if (r10 < r7) goto L_0x0553
            r9 = 1
            goto L_0x0554
        L_0x0553:
            r9 = 0
        L_0x0554:
            if (r0 == 0) goto L_0x0566
            int r10 = r0.length     // Catch:{ Exception -> 0x05a5 }
            r11 = 2
            if (r10 < r11) goto L_0x0566
            r10 = 1
            r8 = r0[r10]     // Catch:{ Exception -> 0x05a5 }
            r10 = 0
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r10)     // Catch:{ Exception -> 0x05a5 }
            if (r8 < r7) goto L_0x0566
            r7 = 1
            goto L_0x0567
        L_0x0566:
            r7 = 0
        L_0x0567:
            if (r0 == 0) goto L_0x0574
            int r8 = r0.length     // Catch:{ Exception -> 0x05a5 }
            r10 = 3
            if (r8 < r10) goto L_0x0574
            r8 = 2
            r10 = r0[r8]     // Catch:{ Exception -> 0x05a5 }
            r8 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r8)     // Catch:{ Exception -> 0x05a5 }
        L_0x0574:
            boolean r8 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x05a5 }
            if (r8 == 0) goto L_0x057c
            r7 = 1
            r9 = 1
        L_0x057c:
            if (r9 == 0) goto L_0x058f
            hd0.o0 r8 = hd0.C98398h0.Bx0()     // Catch:{ Exception -> 0x05a5 }
            r9 = 2
            r0 = r0[r9]     // Catch:{ Exception -> 0x05a5 }
            r9 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r9)     // Catch:{ Exception -> 0x05a5 }
            java.lang.String[] r0 = r8.mo137721g(r14, r0)     // Catch:{ Exception -> 0x05a5 }
            goto L_0x0590
        L_0x058f:
            r0 = 0
        L_0x0590:
            if (r7 == 0) goto L_0x05b5
            if (r0 == 0) goto L_0x05b5
            int r7 = r0.length     // Catch:{ Exception -> 0x05a5 }
            r8 = 2
            if (r7 != r8) goto L_0x05b5
            r7 = 0
            r8 = r0[r7]     // Catch:{ Exception -> 0x05a5 }
            r15.field_fileId = r8     // Catch:{ Exception -> 0x05a5 }
            r7 = 1
            r0 = r0[r7]     // Catch:{ Exception -> 0x05a3 }
            r15.field_aesKey = r0     // Catch:{ Exception -> 0x05a5 }
            goto L_0x05b5
        L_0x05a3:
            r0 = move-exception
            goto L_0x05a7
        L_0x05a5:
            r0 = move-exception
            r7 = 1
        L_0x05a7:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r7 = 0
            r8[r7] = r0
            java.lang.String r0 = "Check use videohash :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r8)
        L_0x05b5:
            java.lang.String r0 = r15.field_aesKey
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x05c9
            java.lang.String r0 = r15.field_aesKey
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x05c6
            goto L_0x05c9
        L_0x05c6:
            r7 = r24
            goto L_0x05dd
        L_0x05c9:
            r7 = r24
            r15.field_aesKey = r7
            r15.field_fileId = r7
            java.lang.Class<qo.h> r0 = p663qo.C101211h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.h r0 = (p663qo.C101211h) r0
            java.lang.String r0 = r0.mo140293rN()
            r15.field_aesKey = r0
        L_0x05dd:
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r8 = r36.mo137765l1()
            r9 = 0
            r0[r9] = r8
            java.lang.String r8 = r15.field_mediaId
            r9 = 1
            r0[r9] = r8
            java.lang.String r8 = r15.field_fileId
            r9 = 2
            r0[r9] = r8
            java.lang.String r8 = r15.field_aesKey
            r9 = 3
            r0[r9] = r8
            boolean r8 = r1.f288685q
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0[r5] = r8
            r5 = 5
            int r8 = r15.field_largesvideo
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r5] = r8
            java.lang.String r5 = "%s summersafecdn check hit cache VideoHash :%s %s %s %b %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r0)
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.if0(r15)
            if (r0 != 0) goto L_0x0665
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r25 = 111(0x6f, double:5.5E-322)
            r27 = 226(0xe2, double:1.117E-321)
            r29 = 1
            r31 = 0
            r24.idkeyStat(r25, r27, r29, r31)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r36.mo137765l1()
            r8 = 0
            r0[r8] = r5
            java.lang.String r5 = "%s cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r5, r0)
            r1.f288682n = r7
            ig3.n r21 = ig3.C98692n.f289404a
            r22 = 0
            java.lang.String r0 = r1.f288677f
            r24 = 6
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            java.lang.String r5 = r1.f288686r
            if (r5 == 0) goto L_0x064f
            r33 = 1
            goto L_0x0651
        L_0x064f:
            r33 = 0
        L_0x0651:
            r34 = -1
            r23 = r0
            r21.mo138104e(r22, r23, r24, r25, r27, r29, r31, r33, r34)
            ob0.n r0 = r1.f288675d
            r0.onSceneEnd(r2, r3, r4, r6)
            com.tencent.mm.modelimage.j r0 = r1.f288681j
            r2 = -1
            r3 = 3
            r0.mo127120a(r3, r2)
            return
        L_0x0665:
            if (r40 == 0) goto L_0x0695
            k40.a r0 = f40.C86709a0.m107533q(r23)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            hd0.n0 r5 = r1.f288683o
            long r7 = r5.f288567n
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r7)
            hd0.n0 r5 = r1.f288683o
            long r7 = r5.f288556c
            r0.mo108745Y2(r7)
            k40.a r5 = f40.C86709a0.m107533q(r23)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            hd0.n0 r7 = r1.f288683o
            long r7 = r7.f288567n
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            r5.xy0(r7, r0)
        L_0x0695:
            hd0.n0 r0 = r1.f288683o
            int r5 = r0.f288573t
            r7 = 1
            if (r5 == r7) goto L_0x06ae
            r0.f288573t = r7
            r5 = 104(0x68, float:1.46E-43)
            r0.f288562i = r5
            java.lang.String r5 = r1.f288682n
            r0.f288555b = r5
            r5 = 524544(0x80100, float:7.35043E-40)
            r0.f288548P = r5
            hd0.C98429r0.m127808N(r0)
        L_0x06ae:
            ob0.n r0 = r1.f288675d
            r0.onSceneEnd(r2, r3, r4, r6)
            return
        L_0x06b4:
            if (r7 == 0) goto L_0x06bb
            r7.close()     // Catch:{ IOException -> 0x06ba }
            goto L_0x06bb
        L_0x06ba:
        L_0x06bb:
            if (r5 == 0) goto L_0x06c0
            r5.close()     // Catch:{ IOException -> 0x06c0 }
        L_0x06c0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98433u.mo137766m1(int, int, java.lang.String, te3.z04, ob0.y):void");
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra onGYNetEnd errtype[%d %d]", mo137765l1(), Integer.valueOf(i2), Integer.valueOf(i3));
        C52197z04 z042 = (C52197z04) ((C47350c) uVar).f127056b.f127083a;
        C98408n0 i6 = C98429r0.m127818i(this.f288677f);
        this.f288683o = i6;
        if (i6 == null) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd Get INFO FAILED :" + this.f288677f);
            C98692n.f289404a.mo138104e((String) null, this.f288677f, 5, 0, 0, 0, 0, this.f288686r != null, -1);
            this.f288675d.onSceneEnd(i4, i5, str2, this);
            this.f288681j.mo127120a(3, -1);
        } else if (i4 == 4 && i5 == 102) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOrigin", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i4 + " errCode:" + i5 + "  file:" + this.f288677f + " user:" + this.f288683o.mo137707k());
            C98692n.f289404a.mo138104e((String) null, this.f288677f, 4, 0, 0, 0, 0, this.f288686r != null, i3);
            this.f288675d.onSceneEnd(i4, i5, str2, this);
            this.f288681j.mo127120a(i4, i5);
        } else if (i4 == 4 && i5 == -22) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd BLACK  errtype:" + i4 + " errCode:" + i5 + "  file:" + this.f288677f + " user:" + this.f288683o.mo137707k());
            C98692n.f289404a.mo138104e((String) null, this.f288677f, 4, 0, 0, 0, 0, this.f288686r != null, i3);
            C98429r0.m127798D(this.f288677f);
            this.f288675d.onSceneEnd(i4, i5, str2, this);
            this.f288681j.mo127120a(i4, i5);
        } else if (i4 == 4 && i5 != 0) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd SERVER FAILED errtype:" + i4 + " errCode:" + i5 + "  file:" + this.f288677f + " user:" + this.f288683o.mo137707k());
            C98429r0.m127799E(this.f288677f);
            C98692n.f289404a.mo138104e((String) null, this.f288677f, 4, 0, 0, 0, 0, this.f288686r != null, i3);
            this.f288675d.onSceneEnd(i4, i5, str2, this);
            this.f288681j.mo127120a(i4, i5);
        } else if (i4 == 0 && i5 == 0) {
            mo137766m1(i2, i3, str, z042, this);
        } else {
            Log.m105920e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i4 + " errCode:" + i5 + "  file:" + this.f288677f + " user:" + this.f288683o.mo137707k());
            C98429r0.m127799E(this.f288677f);
            C98692n.f289404a.mo138104e((String) null, this.f288677f, 4, 0, 0, 0, 0, this.f288686r != null, i3);
            this.f288675d.onSceneEnd(i4, i5, str2, this);
            this.f288681j.mo127120a(i4, i5);
        }
    }

    public int securityLimitCount() {
        return 1;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C98429r0.m127799E(this.f288677f);
    }
}
