package hd0;

import bp3.C104160f;
import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import h81.C32735h;
import ig3.C98692n;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98121d;
import p680ru.C101463g;
import p682rz.C101483l;
import p753xp.C102704b;
import p867wp.C102479b;
import pc0.C77068x;
import sf0.C90188n0;
import te3.xn4;

/* renamed from: hd0.t */
public class C98432t extends C117747y implements C1311n, C101483l {

    /* renamed from: d */
    public C11385n f288666d;

    /* renamed from: e */
    public C47350c f288667e;

    /* renamed from: f */
    public String f288668f = null;

    /* renamed from: g */
    public long f288669g;

    /* renamed from: h */
    public int f288670h;

    /* renamed from: i */
    public String f288671i;

    /* renamed from: j */
    public C98121d f288672j;

    /* renamed from: n */
    public C98121d f288673n;

    /* renamed from: o */
    public C92834j f288674o;

    public C98432t(String str, int i, C98121d dVar, C92834j jVar) {
        boolean z = false;
        this.f288670h = 0;
        this.f288672j = null;
        this.f288673n = null;
        this.f288674o = null;
        Assert.assertTrue(str != null);
        Assert.assertTrue(dVar != null);
        Assert.assertTrue(jVar != null ? true : z);
        this.f288668f = str;
        this.f288672j = dVar;
        this.f288674o = jVar;
        this.f288670h = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C98408n0 i = C98429r0.m127818i(this.f288668f);
        if (i == null) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "Get info Failed file:" + this.f288668f);
            this.f288674o.mo127120a(3, -1);
            return -1;
        }
        this.f288669g = i.f288567n;
        mo137759j1(i, nVar);
        return dispatch(gVar, this.f288667e, this);
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f288669g, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return 149;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x034b  */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.wn4 mo137759j1(hd0.C98408n0 r19, ob0.C11385n r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            r3 = r20
            r0.f288666d = r3
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            te3.wn4 r4 = new te3.wn4
            r4.<init>()
            r3.f127066a = r4
            te3.xn4 r4 = new te3.xn4
            r4.<init>()
            r3.f127067b = r4
            java.lang.String r4 = "/cgi-bin/micromsg-bin/uploadvideo"
            r3.f127068c = r4
            r4 = 149(0x95, float:2.09E-43)
            r3.f127069d = r4
            r4 = 39
            r3.f127070e = r4
            r4 = 1000000039(0x3b9aca27, float:0.0047238055)
            r3.f127071f = r4
            ob0.c r3 = r3.mo72403a()
            r0.f288667e = r3
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            te3.wn4 r3 = (te3.wn4) r3
            r4 = 0
            r3.f299777n = r4
            gi.d r5 = r0.f288672j
            long r5 = r5.field_fileLength
            int r6 = (int) r5
            r3.f299776j = r6
            te3.qv3 r5 = new te3.qv3
            r5.<init>()
            byte[] r6 = new byte[r4]
            r5.mo73350k(r6)
            r3.f299778o = r5
            r3.f299774h = r4
            gi.d r5 = r0.f288672j
            int r5 = r5.field_thumbimgLength
            r3.f299773g = r5
            te3.qv3 r5 = new te3.qv3
            r5.<init>()
            byte[] r6 = new byte[r4]
            r5.mo73350k(r6)
            r3.f299775i = r5
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r3.f299771e = r5
            gi.d r5 = r0.f288672j
            java.lang.String r5 = r5.field_toUser
            r3.f299772f = r5
            java.lang.String r5 = r0.f288668f
            r3.f299770d = r5
            int r5 = r1.f288572s
            r6 = 2
            r7 = 1
            if (r5 != r7) goto L_0x007c
            r3.f299783s = r6
        L_0x007c:
            int r5 = r1.f288576w
            r8 = 3
            if (r5 != r8) goto L_0x0083
            r3.f299783s = r8
        L_0x0083:
            int r5 = r1.f288566m
            r3.f299779p = r5
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.network.C114786m0.m161568a(r5)
            if (r5 == 0) goto L_0x0093
            r5 = 1
            goto L_0x0094
        L_0x0093:
            r5 = 2
        L_0x0094:
            r3.f299781q = r5
            r3.f299782r = r6
            gi.d r5 = r0.f288672j
            int r9 = r5.field_thumbimgLength
            r3.f299790y = r9
            java.lang.String r9 = r5.field_fileId
            r3.f299785u = r9
            r3.f299788x = r9
            r3.f299787w = r7
            boolean r5 = r5.mo137409b()
            r9 = 4
            r10 = 5
            java.lang.String r11 = "MicroMsg.NetSceneUploadVideoForCdn"
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x00ea
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.String r13 = r18.mo137762m1()
            r5[r4] = r13
            gi.d r13 = r0.f288672j
            boolean r13 = r13.field_upload_by_safecdn
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r5[r7] = r13
            gi.d r13 = r0.f288672j
            int r13 = r13.field_UploadHitCacheType
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r6] = r13
            gi.d r13 = r0.f288672j
            int r13 = r13.field_filecrc
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r8] = r13
            gi.d r13 = r0.f288672j
            java.lang.String r13 = r13.field_aesKey
            r5[r9] = r13
            java.lang.String r13 = "%s summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r5)
            r3.f299756P = r7
            r3.f299786v = r12
            r3.f299743B = r12
            goto L_0x00f2
        L_0x00ea:
            gi.d r5 = r0.f288672j
            java.lang.String r5 = r5.field_aesKey
            r3.f299786v = r5
            r3.f299743B = r5
        L_0x00f2:
            gi.d r5 = r0.f288672j
            java.lang.String r13 = r5.field_filemd5
            r3.f299746E = r13
            java.lang.String r13 = r5.field_mp4identifymd5
            r3.f299757Q = r13
            int r5 = r5.field_filecrc
            r3.f299759R = r5
            java.lang.Class<oo.h> r5 = p215oo.C77032h.class
            java.lang.String r13 = r0.f288668f
            hd0.n0 r13 = hd0.C98429r0.m127818i(r13)
            r14 = 0
            if (r13 == 0) goto L_0x0128
            long r9 = r13.f288541I
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0128
            java.lang.String r9 = r0.mo137760k1(r13)
            com.tencent.mm.storage.f4 r10 = new com.tencent.mm.storage.f4
            r10.<init>()
            r10.mo101012p4(r9)
            java.lang.String r9 = eb0.C75569c4.m90655A(r6)
            eb0.C75569c4.m90664J(r10, r9, r4)
            java.lang.String r9 = r10.f230724G
            goto L_0x012c
        L_0x0128:
            java.lang.String r9 = r0.mo137760k1(r13)
        L_0x012c:
            java.lang.Class<rz.s> r10 = p682rz.C101488s.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            rz.s r10 = (p682rz.C101488s) r10
            java.lang.String r10 = r10.kh0()
            if (r13 == 0) goto L_0x0179
            long r6 = r13.f288541I
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x0179
            r14 = -1
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x0179
            k40.a r6 = f40.C86709a0.m107533q(r2)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r14 = r13.f288567n
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r14)
            di3.d r7 = di3.C86312j.m106911c(r5)
            oo.h r7 = (p215oo.C77032h) r7
            long r14 = r13.f288541I
            r7.mo107359RF(r6, r14)
            di3.d r6 = di3.C86312j.m106911c(r5)
            oo.h r6 = (p215oo.C77032h) r6
            long r13 = r13.f288541I
            java.lang.String r9 = r6.mo107360SR(r9, r13)
            di3.d r5 = di3.C86312j.m106911c(r5)
            oo.h r5 = (p215oo.C77032h) r5
            r5.mo107357DR()
            goto L_0x01b6
        L_0x0179:
            if (r13 == 0) goto L_0x01b6
            boolean r6 = r10.isEmpty()
            if (r6 != 0) goto L_0x01b6
            k40.a r6 = f40.C86709a0.m107533q(r2)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            long r13 = r13.f288567n
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.b00(r13)
            pc0.f r7 = new pc0.f
            r7.<init>()
            r7.f295215c = r10
            di3.d r10 = di3.C86312j.m106911c(r5)
            oo.h r10 = (p215oo.C77032h) r10
            r10.mo107356AR(r6, r7)
            di3.d r6 = di3.C86312j.m106911c(r5)
            oo.h r6 = (p215oo.C77032h) r6
            java.lang.String r9 = r6.Yq0(r9, r7)
            di3.d r5 = di3.C86312j.m106911c(r5)
            oo.h r5 = (p215oo.C77032h) r5
            r5.mo107357DR()
        L_0x01b6:
            r3.f299784t = r9
            java.lang.String r5 = r1.f288536D
            r3.f299755N = r5
            java.lang.String r5 = r0.f288671i
            if (r5 == 0) goto L_0x01c6
            long r6 = r1.f288556c
            r3.f299780p0 = r6
            r3.f299769Z = r5
        L_0x01c6:
            gi.d r5 = r0.f288673n
            if (r5 == 0) goto L_0x01eb
            boolean r5 = r5.mo137409b()
            if (r5 == 0) goto L_0x01d6
            r5 = 1
            r3.f299762S0 = r5
            r3.f299758Q0 = r12
            goto L_0x01dc
        L_0x01d6:
            gi.d r5 = r0.f288673n
            java.lang.String r5 = r5.field_aesKey
            r3.f299758Q0 = r5
        L_0x01dc:
            gi.d r5 = r0.f288673n
            java.lang.String r6 = r5.field_filemd5
            r3.f299789x0 = r6
            java.lang.String r6 = r5.field_fileId
            r3.f299791y0 = r6
            long r5 = r5.field_fileLength
            int r6 = (int) r5
            r3.f299760R0 = r6
        L_0x01eb:
            java.lang.String r5 = r19.mo137705i()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x01fa
            java.lang.String r5 = r19.mo137705i()
            goto L_0x020a
        L_0x01fa:
            java.lang.String r5 = r1.f288543K
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0209
            java.lang.String r5 = r1.f288543K
            java.lang.String r5 = com.tencent.p014mm.modelimage.C80999a.m98902b(r5)
            goto L_0x020a
        L_0x0209:
            r5 = r12
        L_0x020a:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x0248
            java.lang.String r6 = r19.mo137705i()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x022a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r4] = r5
            java.lang.String r6 = "uploadVideo video.recvXml is empty and update: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r7)
            r1.f288575v = r5
            hd0.C98429r0.m127808N(r19)
        L_0x022a:
            com.tencent.mm.modelimage.a r5 = com.tencent.p014mm.modelimage.C80999a.m98903c(r5)
            if (r5 == 0) goto L_0x0248
            java.lang.String r6 = r5.f237927a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0248
            java.lang.String r6 = r5.f237927a
            r3.f299765V = r6
            java.lang.String r6 = r5.f237928b
            r3.f299768Y = r6
            java.lang.String r6 = r5.f237930d
            r3.f299767X = r6
            java.lang.String r5 = r5.f237929c
            r3.f299766W = r5
        L_0x0248:
            java.lang.Class<f62.s0> r5 = f62.C75707s0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            f62.s0 r5 = (f62.C75707s0) r5
            gi.d r6 = r0.f288672j
            java.lang.String r6 = r6.field_toUser
            boolean r5 = r5.mo96078pq(r6)
            if (r5 == 0) goto L_0x026e
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            gi.d r5 = r0.f288672j
            java.lang.String r5 = r5.field_toUser
            java.lang.String r2 = r2.mo69662L3(r5)
            r3.f299764U = r2
        L_0x026e:
            te3.tc4 r1 = r1.f288535C
            if (r1 == 0) goto L_0x02a7
            java.lang.String r2 = r1.f299537d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02a7
            java.lang.String r2 = r1.f299537d
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r12)
            r3.f299747F = r2
            int r2 = r1.f299538e
            r3.f299748G = r2
            java.lang.String r2 = r1.f299541h
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r12)
            r3.f299749H = r2
            java.lang.String r2 = r1.f299540g
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r12)
            r3.f299751J = r2
            java.lang.String r2 = r1.f299539f
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r12)
            r3.f299750I = r2
            java.lang.String r2 = r1.f299542i
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r12)
            r3.f299752K = r2
            goto L_0x02c1
        L_0x02a7:
            if (r1 == 0) goto L_0x02c1
            java.lang.String r2 = r1.f299540g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02c1
            java.lang.String r2 = r1.f299539f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02c1
            java.lang.String r2 = r1.f299540g
            r3.f299751J = r2
            java.lang.String r2 = r1.f299539f
            r3.f299750I = r2
        L_0x02c1:
            if (r1 == 0) goto L_0x02d3
            java.lang.String r2 = r1.f299543j
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r12)
            r3.f299754M = r2
            java.lang.String r1 = r1.f299544n
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r12)
            r3.f299753L = r1
        L_0x02d3:
            hd0.o0 r1 = hd0.C98398h0.Bx0()
            java.lang.String r2 = r0.f288668f
            java.lang.String r1 = r1.mo137729r(r2)
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r1)
            if (r2 == 0) goto L_0x02ec
            int r1 = r2.outWidth
            r3.f299742A = r1
            int r1 = r2.outHeight
            r3.f299792z = r1
            goto L_0x02f6
        L_0x02ec:
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r1
            java.lang.String r1 = "cdntra getImageOptions for thumb failed path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r1, r5)
        L_0x02f6:
            hd0.o0 r1 = hd0.C98398h0.Bx0()
            java.lang.String r2 = r0.f288668f
            java.lang.String r1 = r1.mo137728q(r2)
            hd0.e0 r2 = hd0.C98394e0.vx0()
            r2.getClass()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r5 == 0) goto L_0x030f
        L_0x030d:
            r1 = 0
            goto L_0x031b
        L_0x030f:
            java.util.HashMap<java.lang.String, hd0.e0$b> r2 = r2.f288469d
            java.lang.Object r1 = r2.get(r1)
            hd0.e0$b r1 = (hd0.C98394e0.C98396b) r1
            if (r1 == 0) goto L_0x030d
            int r1 = r1.f288482h
        L_0x031b:
            r2 = 8
            r5 = 7
            r6 = 6
            r7 = 1
            if (r1 == r7) goto L_0x034b
            r9 = 2
            if (r1 == r9) goto L_0x0345
            if (r1 == r8) goto L_0x033f
            if (r1 == r6) goto L_0x033f
            if (r1 == r5) goto L_0x0339
            if (r1 == r2) goto L_0x0333
            r3.f299761S = r4
            r3.f299763T = r4
        L_0x0331:
            r1 = 2
            goto L_0x0350
        L_0x0333:
            r3.f299761S = r7
            r1 = 5
            r3.f299763T = r1
            goto L_0x0331
        L_0x0339:
            r3.f299761S = r8
            r1 = 4
            r3.f299763T = r1
            goto L_0x0331
        L_0x033f:
            r1 = 2
            r3.f299761S = r1
            r3.f299763T = r8
            goto L_0x0350
        L_0x0345:
            r1 = 2
            r3.f299761S = r7
            r3.f299763T = r7
            goto L_0x0350
        L_0x034b:
            r1 = 2
            r3.f299761S = r7
            r3.f299763T = r1
        L_0x0350:
            r9 = 23
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = r18.mo137762m1()
            r9[r4] = r10
            java.lang.String r10 = r0.f288668f
            r9[r7] = r10
            gi.d r7 = r0.f288672j
            java.lang.String r10 = r7.field_toUser
            r9[r1] = r10
            java.lang.String r1 = r7.field_aesKey
            if (r1 != 0) goto L_0x036a
            r1 = -1
            goto L_0x036e
        L_0x036a:
            int r1 = r1.length()
        L_0x036e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r8] = r1
            gi.d r1 = r0.f288672j
            java.lang.String r7 = r1.field_fileId
            r8 = 4
            r9[r8] = r7
            int r1 = r1.field_thumbimgLength
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = 5
            r9[r7] = r1
            int r1 = r3.f299742A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r6] = r1
            int r1 = r3.f299792z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r5] = r1
            java.lang.String r1 = r3.f299743B
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
            r9[r2] = r1
            r1 = 9
            int r2 = r3.f299783s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 10
            java.lang.String r2 = r3.f299746E
            r9[r1] = r2
            r1 = 11
            int r2 = r3.f299756P
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 12
            int r2 = r3.f299759R
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 13
            java.lang.String r2 = r3.f299757Q
            r9[r1] = r2
            r1 = 14
            java.lang.String r2 = r3.f299786v
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r9[r1] = r2
            r1 = 15
            java.lang.String r2 = r3.f299747F
            r9[r1] = r2
            r1 = 16
            int r2 = r3.f299748G
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 17
            java.lang.String r2 = r3.f299749H
            r9[r1] = r2
            r1 = 18
            java.lang.String r2 = r3.f299752K
            r9[r1] = r2
            r1 = 19
            java.lang.String r2 = r3.f299784t
            r9[r1] = r2
            r1 = 20
            int r2 = r3.f299761S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 21
            int r2 = r3.f299763T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r1] = r2
            r1 = 22
            java.lang.String r2 = r3.f299765V
            r9[r1] = r2
            java.lang.String r1 = "%s summersafecdn cdntra doscene file:%s touser:%s aes:%d fileid:%s thumb:[%d %d %d], thumbaeskey [%s] funcFlag: %d, md5:%s HitMd5:%d CRC32:%d, VideoNewMd5:%s AESKey:%s stream %s streamtime: %d title %s thumburl %s msgSource[%s] msgForwardType[%d] Source[%d], appId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r9)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r3.f299784t
            r1[r4] = r2
            java.lang.String r2 = "Req MsgSource %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98432t.mo137759j1(hd0.n0, ob0.n):te3.wn4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cd  */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo137760k1(hd0.C98408n0 r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0045
            java.lang.String r0 = r10.f288542J
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x000d
            java.lang.String r10 = r10.f288542J
            goto L_0x0046
        L_0x000d:
            long r0 = r10.f288541I
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0030
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x0045 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ all -> 0x0045 }
            g62.l r0 = r0.mo96095LE()     // Catch:{ all -> 0x0045 }
            long r1 = r10.f288541I     // Catch:{ all -> 0x0045 }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ all -> 0x0045 }
            com.tencent.mm.storage.f4 r10 = r0.b00(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = r10.f230724G     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = eb0.C75569c4.m90685r(r10)     // Catch:{ all -> 0x0045 }
            goto L_0x0046
        L_0x0030:
            java.lang.String r10 = r10.mo137702f()
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
            java.lang.Class<gw.k> r0 = p159gw.C98252k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gw.k r0 = (p159gw.C98252k) r0
            java.lang.String r10 = r0.pc0(r10)
            goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r9.f288670h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 1
            r0[r1] = r10
            java.lang.String r1 = "MicroMsg.NetSceneUploadVideoForCdn"
            java.lang.String r2 = "createVideoMsgSource preLoadLength: %s, forward uuid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            int r0 = r9.f288670h
            if (r0 <= 0) goto L_0x00cd
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r1) goto L_0x0065
            goto L_0x00cd
        L_0x0065:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<msgsource>"
            r0.append(r1)
            java.lang.String r1 = "<videopreloadlen>"
            r0.append(r1)
            int r1 = r9.f288670h
            r0.append(r1)
            java.lang.String r1 = "</videopreloadlen>"
            r0.append(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r1 != 0) goto L_0x00b7
            java.lang.String r1 = "<"
            r0.append(r1)
            java.lang.String r2 = "sec_msg_node"
            r0.append(r2)
            java.lang.String r3 = ">"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "uuid"
            r0.append(r1)
            r0.append(r3)
            r0.append(r10)
            java.lang.String r10 = "</"
            r0.append(r10)
            r0.append(r1)
            r0.append(r3)
            r0.append(r10)
            r0.append(r2)
            r0.append(r3)
        L_0x00b7:
            java.lang.String r10 = "</msgsource>"
            r0.append(r10)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 354(0x162, double:1.75E-321)
            r4 = 35
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
            java.lang.String r10 = r0.toString()
            return r10
        L_0x00cd:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r10 = eb0.C75569c4.m90679l()
            return r10
        L_0x00d8:
            java.lang.String r10 = eb0.C75569c4.m90680m(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98432t.mo137760k1(hd0.n0):java.lang.String");
    }

    /* renamed from: l1 */
    public void mo137761l1(int i, int i2, int i3, String str, xn4 xn4, C117747y yVar) {
        int i4;
        C102479b bVar;
        C98408n0 i5;
        int i6;
        int i7 = i2;
        int i8 = i3;
        String str2 = str;
        xn4 xn42 = xn4;
        C117747y yVar2 = yVar;
        Class cls = C75700k0.class;
        Class cls2 = C102704b.class;
        if (xn42 != null && (i7 == 4 || (i7 == 0 && i8 == 0))) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(xn42.f144768n);
        }
        C98408n0 i9 = C98429r0.m127818i(this.f288668f);
        if (i9 == null) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd Get INFO FAILED :" + this.f288668f);
            int i15 = i3;
            C98692n.f289404a.mo138104e((String) null, this.f288668f, 5, 0, 0, 0, 0, false, i15);
            this.f288666d.onSceneEnd(i7, i15, str, yVar);
            this.f288674o.mo127120a(3, -1);
        } else if (i7 == 4 && i8 == 102) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i7 + " errCode:" + i8 + "  file:" + this.f288668f + " user:" + i9.mo137707k());
            int i16 = i3;
            C98692n.f289404a.mo138104e((String) null, this.f288668f, 10, 0, 0, 0, 0, false, i16);
            this.f288666d.onSceneEnd(i7, i16, str, yVar);
            this.f288674o.mo127120a(i7, i16);
        } else if (i7 == 4 && i8 == -22) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd BLACK  errtype:" + i7 + " errCode:" + i8 + "  file:" + this.f288668f + " user:" + i9.mo137707k());
            C98429r0.m127798D(this.f288668f);
            int i17 = i3;
            C98692n.f289404a.mo138104e((String) null, this.f288668f, 10, 0, 0, 0, 0, false, i17);
            this.f288666d.onSceneEnd(i7, i17, str, yVar);
            this.f288674o.mo127120a(i7, i17);
        } else if (i7 == 4 && i8 != 0) {
            Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd SERVER FAILED errtype:" + i7 + " errCode:" + i8 + "  file:" + this.f288668f + " user:" + i9.mo137707k());
            C98429r0.m127799E(this.f288668f);
            int i18 = i3;
            C98692n.f289404a.mo138104e((String) null, this.f288668f, 10, 0, 0, 0, 0, false, i18);
            this.f288666d.onSceneEnd(i7, i18, str, yVar);
            this.f288674o.mo127120a(i7, i18);
        } else if (i7 == 0 && i8 == 0) {
            i9.f288564k = Util.nowSecond();
            i9.f288556c = xn42.f144765h;
            Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "%s dkmsgid  set svrmsgid %d -> %d", mo137762m1(), Long.valueOf(i9.f288556c), Integer.valueOf(C90188n0.f258951s));
            if (!(10007 != C90188n0.f258950r || (i6 = C90188n0.f258951s) == 0 || i9.f288556c == 0)) {
                i9.f288556c = (long) i6;
                C90188n0.f258951s = 0;
            }
            i9.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
            i9.f288548P = 1284;
            if (this.f288672j.mo137409b()) {
                Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], old RecvXml[%s]", mo137762m1(), xn42.f144766i, i9.mo137705i());
                if (!Util.isNullOrNil(xn42.f144766i)) {
                    String str3 = ((((("<msg><videomsg aeskey=\"" + xn42.f144766i + "\" cdnthumbaeskey=\"" + xn42.f144766i + "\" cdnvideourl=\"" + this.f288672j.field_fileId + "\" ") + "cdnthumburl=\"" + this.f288672j.field_fileId + "\" ") + "length=\"" + this.f288672j.field_fileLength + "\" ") + "cdnthumblength=\"" + this.f288672j.field_thumbimgLength + "\"/>") + Util.nullAs(i9.f288543K, "")) + "</msg>";
                    Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "cdn callback new build cdnInfo:%s", str3);
                    i9.f288575v = str3;
                    boolean v = C98398h0.Bx0().mo137732v(C98398h0.Bx0().mo137728q(this.f288668f), this.f288672j.field_fileId, xn42.f144766i);
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf((v ? 1 : 2) + 900);
                    objArr[1] = Integer.valueOf(i9.f288559f);
                    nVar.mo160131h(12696, objArr);
                    Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn aeskey[%s], new RecvXml[%s], saveret[%b]", mo137762m1(), xn42.f144766i, i9.mo137705i(), Boolean.valueOf(v));
                } else {
                    Log.m105929w("MicroMsg.NetSceneUploadVideoForCdn", "%s summersafecdn need aeskey but ret null", mo137762m1());
                }
            }
            C98429r0.m127808N(i9);
            C98429r0.m127809O(i9);
            String str4 = i9.f288546N;
            if (C98429r0.m127830u() && this.f288673n != null && !Util.isNullOrNil(str4) && (i5 = C98429r0.m127818i(str4)) != null) {
                i5.f288564k = Util.nowSecond();
                i5.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
                i5.f288548P = 1284;
                C98429r0.m127808N(i5);
            }
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(i9.f288567n);
            C75569c4.m90666L(b002, xn42.f144767j, false);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
            ((C101463g) C86312j.m106911c(C101463g.class)).mo126782B1(b002);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(i9.mo137707k());
            if (((z1Var == null || ((int) z1Var.f108320R1) <= 0) ? false : z1Var.mo62916m3()) || C72996z1.m85793A5(i9.mo137707k())) {
                Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "%s upload to biz :%s", mo137762m1(), i9.mo137707k());
                if (i9.f288556c < 0) {
                    Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + i9.f288556c + " file:" + this.f288668f + " toUser:" + i9.mo137707k());
                    C98692n.f289404a.mo138104e((String) null, this.f288668f, 5, 0, 0, 0, 0, false, -1);
                    C98429r0.m127799E(this.f288668f);
                    this.f288674o.mo127120a(3, -1);
                }
            } else {
                Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "%s not upload to biz", mo137762m1());
                if (i9.f288556c <= 0) {
                    Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: finish video invaild MSGSVRID :" + i9.f288556c + " file:" + this.f288668f + " toUser:" + i9.mo137707k());
                    C98692n.f289404a.mo138104e((String) null, this.f288668f, 5, 0, 0, 0, 0, false, -1);
                    C98429r0.m127799E(this.f288668f);
                    this.f288674o.mo127120a(3, -1);
                }
            }
            C98692n.f289404a.mo138102c(this.f288668f);
            this.f288666d.onSceneEnd(i7, i3, str, yVar2);
            if (!C98429r0.m127831v() || this.f288671i == null) {
                i4 = 0;
                this.f288674o.mo127120a(0, 0);
            } else {
                i4 = 0;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, i4) == 1) {
                if (this.f288672j != null) {
                    String q = C98398h0.Bx0().mo137728q(this.f288668f);
                    String r = C98398h0.Bx0().mo137729r(this.f288668f);
                    if (C86013q1.m106450k(q)) {
                        if (Util.isNullOrNil(i9.mo137702f())) {
                            String q2 = C86013q1.m106456q(r);
                            bVar = ((C102704b) C86312j.m106911c(cls2)).mo138751as(q, b002.getType(), this.f288672j.field_filemd5, (byte[]) null);
                            C102479b as = ((C102704b) C86312j.m106911c(cls2)).mo138751as(r, b002.getType(), q2, (byte[]) null);
                            Log.m105924i("MicroMsg.NetSceneUploadVideoForCdn", "check video thumb dup, fileName = " + this.f288668f + " result = " + as.f301760a);
                        } else {
                            bVar = ((C102704b) C86312j.m106911c(cls2)).mo138752mP(i9.mo137702f(), q, r, b002.getType(), i9.f288566m, C86013q1.m106456q(i9.mo137702f()));
                        }
                        Log.m105924i("MicroMsg.NetSceneUploadVideoForCdn", "check video dup, fileName = " + this.f288668f + " result = " + bVar.f301760a);
                    }
                }
                if (this.f288673n != null && !Util.isNullOrNil(str4)) {
                    String q3 = C98398h0.Bx0().mo137728q(str4);
                    if (C86013q1.m106450k(q3)) {
                        C102479b as4 = ((C102704b) C86312j.m106911c(cls2)).mo138751as(q3, b002.getType(), this.f288673n.field_filemd5, (byte[]) null);
                        Log.m105924i("MicroMsg.NetSceneUploadVideoForCdn", "check video dup origin, fileName = " + this.f288668f + " result = " + as4.f301760a);
                    }
                }
            }
        } else {
            Log.m105920e("MicroMsg.NetSceneUploadVideoForCdn", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i7 + " errCode:" + i8 + "  file:" + this.f288668f + " user:" + i9.mo137707k());
            C98429r0.m127799E(this.f288668f);
            C98692n.f289404a.mo138104e((String) null, this.f288668f, 10, 0, 0, 0, 0, false, i3);
            int i19 = i3;
            this.f288666d.onSceneEnd(i7, i19, str, yVar);
            this.f288674o.mo127120a(i7, i19);
        }
    }

    /* renamed from: m1 */
    public final String mo137762m1() {
        return this.f288668f + "_" + hashCode();
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneUploadVideoForCdn", "%s cdntra onGYNetEnd errtype[%d %d]", mo137762m1(), Integer.valueOf(i2), Integer.valueOf(i3));
        mo137761l1(i, i2, i3, str, (xn4) ((C47350c) uVar).f127056b.f127083a, this);
    }

    public int securityLimitCount() {
        return 1;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C98429r0.m127799E(this.f288668f);
    }

    public C98432t(String str, String str2, int i, C98121d dVar, C92834j jVar) {
        boolean z = false;
        this.f288670h = 0;
        this.f288672j = null;
        this.f288673n = null;
        this.f288674o = null;
        Assert.assertTrue(str != null);
        Assert.assertTrue(dVar != null);
        Assert.assertTrue(jVar != null ? true : z);
        this.f288668f = str;
        this.f288672j = dVar;
        this.f288674o = jVar;
        this.f288670h = i;
        this.f288671i = str2;
    }

    public C98432t(String str, String str2, int i, C98121d dVar, C98121d dVar2, C92834j jVar) {
        boolean z = false;
        this.f288670h = 0;
        this.f288672j = null;
        this.f288673n = null;
        this.f288674o = null;
        Assert.assertTrue(str != null);
        Assert.assertTrue(dVar != null);
        Assert.assertTrue(jVar != null ? true : z);
        this.f288668f = str;
        this.f288672j = dVar;
        this.f288674o = jVar;
        this.f288670h = i;
        this.f288673n = dVar2;
        this.f288671i = str2;
    }
}
