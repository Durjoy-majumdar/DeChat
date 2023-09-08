package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50630o32;
import te3.C51043r10;
import te3.C64326ds2;
import te3.C64568n32;
import te3.C64868yx2;
import te3.C77924es2;
import te3.a94;

/* renamed from: hg0.n0 */
public class C76173n0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f223166d;

    /* renamed from: e */
    public C11385n f223167e = null;

    /* renamed from: f */
    public List<String> f223168f;

    /* renamed from: g */
    public List<String> f223169g;

    public C76173n0() {
        mo106409j1();
        C64568n32 n322 = (C64568n32) this.f223166d.f127055a.f127080a;
        n322.f184424e = "";
        n322.f184428i = null;
        n322.f184427h = 0;
        n322.f184426g = null;
        n322.f184425f = 0;
        n322.f184423d = 0;
        n322.f184429j = 1;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        List<String> list;
        this.f223167e = nVar;
        C64568n32 n322 = (C64568n32) this.f223166d.f127055a.f127080a;
        if (n322.f184423d == 2) {
            List<String> list2 = this.f223168f;
            if ((list2 == null || list2.size() == 0) && ((list = this.f223169g) == null || list.size() == 0)) {
                Log.m105920e("MicroMsg.NetSceneGetMFriend", "doScene failed, mobile list and email list empty.");
                return -1;
            }
            List<String> list3 = this.f223168f;
            if (list3 != null && list3.size() > 0) {
                Log.m105919d("MicroMsg.NetSceneGetMFriend", "doScene get mobile list size:%d", Integer.valueOf(this.f223168f.size()));
                LinkedList<C64868yx2> linkedList = new LinkedList<>();
                for (String str : this.f223168f) {
                    C64868yx2 yx22 = new C64868yx2();
                    yx22.f186609d = str;
                    linkedList.add(yx22);
                }
                n322.f184426g = linkedList;
                n322.f184425f = linkedList.size();
            }
            List<String> list4 = this.f223169g;
            if (list4 != null && list4.size() > 0) {
                Log.m105919d("MicroMsg.NetSceneGetMFriend", "doScene get email list size:%d", Integer.valueOf(this.f223169g.size()));
                LinkedList<C64326ds2> linkedList2 = new LinkedList<>();
                for (String str2 : this.f223169g) {
                    C64326ds2 ds22 = new C64326ds2();
                    ds22.f182848d = str2;
                    linkedList2.add(ds22);
                }
                n322.f184428i = linkedList2;
                n322.f184427h = linkedList2.size();
            }
        }
        return dispatch(gVar, this.f223166d, this);
    }

    public int getType() {
        return 32;
    }

    /* renamed from: j1 */
    public final void mo106409j1() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64568n32();
        bVar.f127067b = new C50630o32();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getmfriend";
        bVar.f127069d = TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f223166d = bVar.mo72403a();
    }

    /* renamed from: k1 */
    public final void mo106410k1(C76166a aVar, C77924es2 es22) {
        aVar.f223133u = es22.f227304f;
        aVar.f223134v = es22.f227305g;
        aVar.f223135w = es22.f227306h;
        aVar.f223136x = es22.f227307i;
        aVar.f223137y = es22.f227308j;
        aVar.f223138z = es22.f227309n;
        aVar.f223098A = es22.f227310o;
        aVar.f223099B = es22.f227312q;
        aVar.f223101D = es22.f227314s;
        aVar.f223100C = es22.f227313r;
        aVar.f223102E = es22.f227316u;
        aVar.f223103F = es22.f227317v;
        a94 a94 = es22.f227315t;
        if (a94 != null) {
            aVar.f223104G = a94.f130392d;
            aVar.f223105H = a94.f130393e;
            aVar.f223106I = a94.f130394f;
        }
        C51043r10 r102 = es22.f227318w;
        if (r102 != null) {
            aVar.f223107J = r102.f140656d;
            aVar.f223108K = r102.f140657e;
            aVar.f223109L = r102.f140658f;
            aVar.f223110M = r102.f140659g;
        }
    }

    /* renamed from: l1 */
    public void mo106411l1() {
        C64568n32 n322 = (C64568n32) this.f223166d.f127055a.f127080a;
        n322.f184424e = (String) C86709a0.m107535s().mo121142i().mo119684e(65828, (Object) null);
        n322.f184423d = 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x031e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r19, int r20, int r21, java.lang.String r22, com.tencent.p014mm.network.C114799u r23, byte[] r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            java.lang.Class<ln.i> r5 = p196ln.C76708i.class
            java.lang.Class<mg0.b> r6 = mg0.C76754b.class
            ob0.c r7 = r0.f223166d
            pe3.a r7 = r7.mo72395b()
            te3.o32 r7 = (te3.C50630o32) r7
            ob0.c r8 = r0.f223166d
            pe3.a r8 = r8.mo72394a()
            te3.n32 r8 = (te3.C64568n32) r8
            r9 = 4
            if (r1 != r9) goto L_0x0035
            r9 = -68
            if (r2 != r9) goto L_0x0035
            ob0.n r3 = r0.f223167e
            te3.ja r4 = r7.getBaseResponse()
            te3.rv3 r4 = r4.f135956e
            java.lang.String r4 = r4.mo73355b()
            r3.onSceneEnd(r1, r2, r4, r0)
            return
        L_0x0035:
            java.lang.String r9 = " errCode:"
            java.lang.String r10 = "onGYNetEnd  errType:"
            java.lang.String r11 = "MicroMsg.NetSceneGetMFriend"
            if (r1 != 0) goto L_0x0367
            if (r2 == 0) goto L_0x0041
            goto L_0x0367
        L_0x0041:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r12.append(r1)
            r12.append(r9)
            r12.append(r2)
            java.lang.String r9 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r9)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            r10 = 65828(0x10124, float:9.2245E-41)
            java.lang.Object r9 = r9.mo119683d(r10)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            int r12 = r8.f184423d
            r13 = 1
            if (r12 != r13) goto L_0x009f
            java.lang.String r12 = r7.f138930f
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x009f
            java.lang.String r12 = r7.f138930f
            boolean r9 = r12.equals(r9)
            if (r9 != 0) goto L_0x009f
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            java.lang.String r12 = r7.f138930f
            r9.mo119676J(r10, r12)
            di3.d r9 = di3.C86312j.m106911c(r6)
            mg0.b r9 = (mg0.C76754b) r9
            com.tencent.mm.sdk.storage.MStorage r9 = r9.mo105752yf()
            hg0.p r9 = (hg0.C76175p) r9
            r9.mo106431jo()
        L_0x009f:
            java.util.LinkedList<te3.es2> r9 = r7.f138929e
            if (r9 != 0) goto L_0x00a9
            java.lang.String r1 = "onGYNetEnd  friendlist null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            return
        L_0x00a9:
            java.lang.Object[] r10 = new java.lang.Object[r13]
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 0
            r10[r12] = r9
            java.lang.String r9 = "onGYNetEnd friend list size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r10)
            f40.o r9 = f40.C86709a0.m107535s()
            zh3.f r9 = r9.mo121143j()
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            long r14 = r10.getId()
            long r9 = r9.beginTransaction(r14)
            r14 = 0
        L_0x00d0:
            java.util.LinkedList<te3.es2> r15 = r7.f138929e
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x034c
            java.util.LinkedList<te3.es2> r15 = r7.f138929e
            java.lang.Object r15 = r15.get(r14)
            te3.es2 r15 = (te3.C77924es2) r15
            if (r15 != 0) goto L_0x00ee
            java.lang.String r15 = "Err getFriendList null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r15)
            r24 = r7
        L_0x00e9:
            r16 = r9
        L_0x00eb:
            r9 = 1
            goto L_0x033c
        L_0x00ee:
            di3.d r16 = di3.C86312j.m106911c(r6)
            mg0.b r16 = (mg0.C76754b) r16
            com.tencent.mm.sdk.storage.MStorageEx r16 = r16.R50()
            r12 = r16
            hg0.b r12 = (hg0.C76168b) r12
            java.lang.String r13 = r15.f227304f
            hg0.a r12 = r12.mo106402b(r13)
            if (r12 != 0) goto L_0x0118
            int r13 = r8.f184423d
            r24 = r7
            r7 = 1
            if (r13 == r7) goto L_0x011a
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r7 = r15.f227304f
            r13 = 0
            r12[r13] = r7
            java.lang.String r7 = "Err MD5 %s not found in AddrUploadStg, md5: "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r12)
            goto L_0x00e9
        L_0x0118:
            r24 = r7
        L_0x011a:
            r13 = 0
            java.lang.Class<km.b> r7 = p586km.C46733b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            km.b r7 = (p586km.C46733b) r7
            java.lang.String r13 = r15.f227302d
            r1 = 10
            java.lang.String r2 = r15.f227321z
            r7.zi0(r13, r1, r2)
            hg0.o r1 = new hg0.o
            r1.<init>()
            int r2 = r8.f184423d
            r7 = 1
            if (r2 != r7) goto L_0x01b2
            te3.jb0 r2 = r15.f227311p
            if (r2 != 0) goto L_0x0140
            java.lang.String r1 = "ERR: facebook friend return null info"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            goto L_0x00e9
        L_0x0140:
            long r2 = r2.f135976d
            r1.mo106418g(r2)
            te3.jb0 r2 = r15.f227311p
            int r2 = r2.f135978f
            r1.mo106419h(r2)
            di3.d r2 = di3.C86312j.m106911c(r5)
            ln.i r2 = (p196ln.C76708i) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = ""
            r3.append(r7)
            te3.jb0 r7 = r15.f227311p
            r16 = r9
            long r9 = r7.f135976d
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.g40(r3)
            te3.jb0 r2 = r15.f227311p
            java.lang.String r2 = r2.f135977e
            r1.mo106420i(r2)
            java.lang.String r2 = r15.f227310o
            r1.mo106416e(r2)
            java.lang.String r2 = r15.f227307i
            r1.mo106417f(r2)
            java.lang.String r2 = r15.f227306h
            r1.mo106425n(r2)
            java.lang.String r2 = r15.f227308j
            r1.mo106427p(r2)
            int r2 = r15.f227309n
            r1.mo106424m(r2)
            int r2 = r15.f227305g
            r1.mo106426o(r2)
            java.lang.String r2 = r15.f227303e
            r1.mo106421j(r2)
            te3.jb0 r2 = r15.f227311p
            java.lang.String r2 = r2.f135977e
            java.lang.String r2 = sf0.C77691f.m93687b(r2)
            r1.mo106422k(r2)
            te3.jb0 r2 = r15.f227311p
            java.lang.String r2 = r2.f135977e
            java.lang.String r2 = sf0.C77691f.m93686a(r2)
            r1.mo106423l(r2)
            java.lang.String r2 = r15.f227302d
            r1.mo106429r(r2)
            goto L_0x01c4
        L_0x01b2:
            r16 = r9
            java.lang.String r2 = r15.f227302d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x01c4
            java.lang.String r1 = "username null for mobile"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)
            goto L_0x00eb
        L_0x01c4:
            hg0.r r2 = new hg0.r
            r2.<init>()
            java.lang.String r3 = r15.f227302d
            r2.mo106451g(r3)
            java.lang.String r3 = r15.f227306h
            r2.mo106448d(r3)
            java.lang.String r3 = r15.f227307i
            r2.mo106446b(r3)
            java.lang.String r3 = r15.f227308j
            r2.mo106450f(r3)
            int r3 = r15.f227305g
            r2.mo106449e(r3)
            int r3 = r15.f227309n
            r2.mo106447c(r3)
            java.lang.String r3 = r15.f227302d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r7 = 0
            if (r3 != 0) goto L_0x0239
            k40.a r3 = f40.C86709a0.m107533q(r4)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.lang.String r9 = r15.f227302d
            com.tencent.mm.storage.z1 r3 = r3.get(r9)
            if (r3 == 0) goto L_0x0239
            java.lang.String r9 = r15.f227302d
            java.lang.String r10 = r3.getUsername()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0239
            java.lang.String r7 = r15.f227310o
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0238
            java.lang.String r7 = r15.f227310o
            java.lang.String r9 = r3.mo62913l2()
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0238
            java.lang.String r7 = r15.f227310o
            r3.mo62857I2(r7)
            k40.a r7 = f40.C86709a0.m107533q(r4)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            java.lang.String r9 = r3.getUsername()
            r7.mo69719p3(r9, r3)
        L_0x0238:
            r7 = r3
        L_0x0239:
            java.lang.String r3 = r15.f227302d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0255
            int r3 = r8.f184423d
            r7 = 1
            if (r3 != r7) goto L_0x0248
            r3 = 1
            goto L_0x0249
        L_0x0248:
            r3 = 0
        L_0x0249:
            java.lang.String r7 = "mobile friend never go here"
            junit.framework.Assert.assertTrue(r7, r3)
            r3 = 102(0x66, float:1.43E-43)
            r1.mo106428q(r3)
            goto L_0x0319
        L_0x0255:
            r3 = 3
            r9 = -1
            if (r7 == 0) goto L_0x02a1
            boolean r7 = r7.mo62927s3()
            if (r7 != 0) goto L_0x0260
            goto L_0x02a1
        L_0x0260:
            r7 = 101(0x65, float:1.42E-43)
            r1.mo106428q(r7)
            if (r12 == 0) goto L_0x0319
            r7 = 2
            r12.mo106395o(r7)
            java.lang.String r7 = r15.f227302d
            r12.mo106396p(r7)
            java.lang.String r7 = r15.f227303e
            r12.mo106391k(r7)
            int r7 = r12.mo106382a()
            r12.mo106394n(r7)
            r0.mo106410k1(r12, r15)
            r12.mo106390j(r9)
            di3.d r7 = di3.C86312j.m106911c(r6)
            mg0.b r7 = (mg0.C76754b) r7
            com.tencent.mm.sdk.storage.MStorageEx r7 = r7.R50()
            hg0.b r7 = (hg0.C76168b) r7
            java.lang.String r9 = r12.mo106385e()
            r7.mo106403d(r9, r12)
            di3.d r7 = di3.C86312j.m106911c(r5)
            ln.i r7 = (p196ln.C76708i) r7
            java.lang.String r9 = r15.f227302d
            r7.mo106848yE(r9, r3)
            goto L_0x0319
        L_0x02a1:
            r7 = 100
            r1.mo106428q(r7)
            if (r12 == 0) goto L_0x0319
            r7 = 1
            r12.mo106395o(r7)
            java.lang.String r7 = r15.f227302d
            r12.mo106396p(r7)
            java.lang.String r7 = r15.f227303e
            r12.mo106391k(r7)
            te3.jb0 r7 = r15.f227311p
            java.lang.String r7 = r7.f135977e
            java.lang.String r7 = sf0.C77691f.m93687b(r7)
            r12.mo106392l(r7)
            te3.jb0 r7 = r15.f227311p
            java.lang.String r7 = r7.f135977e
            java.lang.String r7 = sf0.C77691f.m93686a(r7)
            r12.mo106393m(r7)
            int r7 = r12.mo106382a()
            r12.mo106394n(r7)
            r0.mo106410k1(r12, r15)
            r12.mo106390j(r9)
            di3.d r7 = di3.C86312j.m106911c(r6)
            mg0.b r7 = (mg0.C76754b) r7
            com.tencent.mm.sdk.storage.MStorageEx r7 = r7.R50()
            hg0.b r7 = (hg0.C76168b) r7
            java.lang.String r9 = r12.mo106385e()
            r7.mo106403d(r9, r12)
            com.tencent.mm.modelavatar.n r7 = new com.tencent.mm.modelavatar.n
            r7.<init>()
            java.lang.String r9 = r15.f227302d
            r7.mo93606o(r9)
            java.lang.String r9 = r15.f227319x
            r7.mo93599h(r9)
            java.lang.String r9 = r15.f227320y
            r7.mo93605n(r9)
            r9 = 1
            r7.mo93601j(r9)
            r7.mo93602k(r3)
            java.lang.Class<ln.g> r3 = p196ln.C76706g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.g r3 = (p196ln.C76706g) r3
            ln.n r3 = r3.mo106832eg()
            com.tencent.mm.modelavatar.o r3 = (com.tencent.p014mm.modelavatar.C68098o) r3
            r3.mo93608Yt(r7)
            goto L_0x031a
        L_0x0319:
            r9 = 1
        L_0x031a:
            int r3 = r8.f184423d
            if (r3 != r9) goto L_0x032d
            di3.d r3 = di3.C86312j.m106911c(r6)
            mg0.b r3 = (mg0.C76754b) r3
            com.tencent.mm.sdk.storage.MStorage r3 = r3.mo105752yf()
            hg0.p r3 = (hg0.C76175p) r3
            r3.mo106430Lo(r1)
        L_0x032d:
            di3.d r1 = di3.C86312j.m106911c(r6)
            mg0.b r1 = (mg0.C76754b) r1
            com.tencent.mm.sdk.storage.MStorage r1 = r1.mo105737Pt()
            hg0.s r1 = (hg0.C76185s) r1
            r1.mo106452jo(r2)
        L_0x033c:
            int r14 = r14 + 1
            r1 = r20
            r2 = r21
            r3 = r22
            r7 = r24
            r9 = r16
            r12 = 0
            r13 = 1
            goto L_0x00d0
        L_0x034c:
            r16 = r9
            f40.o r1 = f40.C86709a0.m107535s()
            zh3.f r1 = r1.mo121143j()
            r2 = r16
            r1.endTransaction(r2)
            ob0.n r1 = r0.f223167e
            r2 = r20
            r3 = r21
            r4 = r22
            r1.onSceneEnd(r2, r3, r4, r0)
            return
        L_0x0367:
            r4 = r3
            r3 = r2
            r2 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r1.append(r9)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            ob0.n r1 = r0.f223167e
            r1.onSceneEnd(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.C76173n0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public C76173n0(List<String> list, List<String> list2) {
        mo106409j1();
        if ((list != null && list.size() != 0) || (list2 != null && list2.size() != 0)) {
            this.f223168f = list;
            this.f223169g = list2;
            C64568n32 n322 = (C64568n32) this.f223166d.f127055a.f127080a;
            n322.f184424e = "";
            n322.f184423d = 2;
            n322.f184429j = 1;
        }
    }
}
