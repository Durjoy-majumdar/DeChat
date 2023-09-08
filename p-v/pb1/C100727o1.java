package pb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C101757at;
import te3.C101834rc0;
import te3.C48902bt;
import te3.C49046ct;

/* renamed from: pb1.o1 */
public class C100727o1 extends C117747y implements C1311n {

    /* renamed from: d */
    public int f295100d = 0;

    /* renamed from: e */
    public final C47350c f295101e;

    /* renamed from: f */
    public C11385n f295102f = null;

    /* renamed from: g */
    public C100755z f295103g;

    /* renamed from: h */
    public boolean f295104h = true;

    /* renamed from: i */
    public boolean f295105i = false;

    /* renamed from: j */
    public HashMap<C101834rc0, Boolean> f295106j = new HashMap<>();

    /* renamed from: n */
    public LinkedList<C100728a> f295107n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<C100728a> f295108o = new LinkedList<>();

    /* renamed from: pb1.o1$a */
    public class C100728a {

        /* renamed from: a */
        public C101834rc0 f295109a;

        /* renamed from: b */
        public C100755z f295110b;

        /* renamed from: c */
        public int f295111c;

        /* renamed from: d */
        public boolean f295112d;

        public C100728a(C100727o1 o1Var, C101834rc0 rc02, C100755z zVar, int i, boolean z) {
            this.f295109a = rc02;
            this.f295110b = zVar;
            this.f295111c = i;
            this.f295112d = z;
        }
    }

    public C100727o1(C100755z zVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48902bt();
        bVar.f127067b = new C49046ct();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkcdn";
        bVar.f127069d = 404;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA;
        bVar.f127071f = 1000000197;
        this.f295101e = bVar.mo72403a();
        this.f295103g = zVar;
        Iterator<C101834rc0> it = zVar.field_favProto.f298618f.iterator();
        while (it.hasNext()) {
            this.f295106j.put(it.next(), Boolean.FALSE);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f295102f = nVar;
        int i = 0;
        for (C101834rc0 rc02 : this.f295106j.keySet()) {
            if (!this.f295106j.get(rc02).booleanValue()) {
                i++;
            }
        }
        if (i == 0) {
            Log.m105920e("MicroMsg.Fav.NetSceneCheckCDN", "klem doScene data list null");
            this.f295100d = -100;
            return -100;
        }
        C48902bt btVar = (C48902bt) this.f295101e.f127055a.f127080a;
        btVar.f131297e.clear();
        LinkedList<C101834rc0> linkedList = this.f295103g.field_favProto.f298618f;
        int i2 = 0;
        int i3 = 0;
        while (i2 < linkedList.size()) {
            C101834rc0 rc03 = linkedList.get(i2);
            if (!this.f295106j.get(rc03).booleanValue()) {
                if (!rc03.f299283U0) {
                    C101757at atVar = new C101757at();
                    atVar.f297886g = (int) rc03.f299276R;
                    atVar.f297884e = rc03.f299266M;
                    atVar.f297885f = rc03.f299271P;
                    atVar.f297883d = i2 + "";
                    atVar.f297888i = rc03.f299274Q0;
                    atVar.f297887h = this.f295103g.field_sourceType;
                    atVar.f297889j = 0;
                    btVar.f131297e.add(atVar);
                    i3++;
                    Log.m105925i("MicroMsg.Fav.NetSceneCheckCDN", "check CDN, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", atVar.f297883d, atVar.f297888i, Integer.valueOf(atVar.f297887h), Integer.valueOf(atVar.f297886g), atVar.f297884e, atVar.f297885f);
                }
                if (!rc03.f299287W0) {
                    C101757at atVar2 = new C101757at();
                    atVar2.f297886g = (int) rc03.f299336x0;
                    atVar2.f297884e = rc03.f299288X;
                    atVar2.f297885f = rc03.f299292Z;
                    atVar2.f297888i = rc03.f299274Q0;
                    atVar2.f297887h = this.f295103g.field_sourceType;
                    atVar2.f297883d = i2 + "t";
                    atVar2.f297889j = 1;
                    btVar.f131297e.add(atVar2);
                    i3++;
                    Log.m105925i("MicroMsg.Fav.NetSceneCheckCDN", "check CDN thumb, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", atVar2.f297883d, atVar2.f297888i, Integer.valueOf(atVar2.f297887h), Integer.valueOf(atVar2.f297886g), atVar2.f297884e, atVar2.f297885f);
                }
                if (i3 >= 19) {
                    break;
                }
            }
            i2++;
        }
        Log.m105925i("MicroMsg.Fav.NetSceneCheckCDN", "doScene:  usedCount %d, dataSize %d, nextBegIndex %d", Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2 + 1));
        btVar.f131296d = i3;
        if (i3 == 0) {
            Log.m105928w("MicroMsg.Fav.NetSceneCheckCDN", "no more data, must not check cdn!");
            this.f295100d = -101;
            return -101;
        }
        return dispatch(gVar, this.f295101e, this);
    }

    public int getType() {
        return 404;
    }

    /* renamed from: j1 */
    public final boolean mo140161j1() {
        Iterator<C100728a> it = this.f295108o.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C100728a next = it.next();
            C100734q.m131831V(next.f295109a, next.f295110b, next.f295111c);
            z = true;
        }
        this.f295108o.clear();
        Iterator<C100728a> it4 = this.f295107n.iterator();
        while (it4.hasNext()) {
            C100728a next2 = it4.next();
            C100734q.m131830U(next2.f295109a, next2.f295110b, next2.f295111c, next2.f295112d);
            z = true;
        }
        this.f295107n.clear();
        Log.m105925i("MicroMsg.Fav.NetSceneCheckCDN", "insertAllCdnItem dataSize:%s thumbSize:%s needUpload:%s", Integer.valueOf(this.f295107n.size()), Integer.valueOf(this.f295108o.size()), Boolean.valueOf(z));
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x0404  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r28, int r29, int r30, java.lang.String r31, com.tencent.p014mm.network.C114799u r32, byte[] r33) {
        /*
            r27 = this;
            r6 = r27
            r7 = r29
            r0 = r30
            r8 = r31
            java.lang.Class<qo.h> r9 = p663qo.C101211h.class
            java.lang.Class<pb1.j1> r10 = pb1.C100718j1.class
            r11 = 5
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r12 = 0
            r1[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            r13 = 1
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            r14 = 2
            r1[r14] = r2
            int r2 = r6.f295100d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r15 = 3
            r1[r15] = r2
            r5 = 4
            r1[r5] = r8
            java.lang.String r4 = "MicroMsg.Fav.NetSceneCheckCDN"
            java.lang.String r2 = "netId %d errType %d errCode %d localErrCode %d errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            r3 = -101(0xffffffffffffff9b, float:NaN)
            r2 = -100
            r1 = 9
            if (r7 != 0) goto L_0x0045
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r11 = r0
            goto L_0x0080
        L_0x0045:
            if (r7 != r15) goto L_0x0079
            int r11 = r6.f295100d
            if (r11 != r2) goto L_0x0079
            java.lang.String r2 = "need not check cdn, add fav now"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            di3.d r2 = di3.C86312j.m106911c(r10)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            pb1.z r3 = r6.f295103g
            long r3 = r3.field_localId
            xb1.d r2 = (xb1.C102614d) r2
            r2.mo142272mL(r1, r3)
            di3.d r1 = di3.C86312j.m106911c(r10)
            pb1.j1 r1 = (pb1.C100718j1) r1
            pb1.e1 r1 = r1.th0()
            wb1.x r1 = (wb1.C102421x) r1
            r1.mo142000c()
            ob0.n r1 = r6.f295102f
            r1.onSceneEnd(r7, r0, r8, r6)
            return
        L_0x0079:
            if (r7 != r15) goto L_0x0663
            int r11 = r6.f295100d
            if (r11 != r3) goto L_0x0663
            r11 = 0
        L_0x0080:
            int r0 = r6.f295100d
            if (r0 == r3) goto L_0x0554
            if (r7 != 0) goto L_0x0554
            if (r11 != 0) goto L_0x0554
            r0 = r32
            ob0.c r0 = (ob0.C47350c) r0
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            te3.ct r0 = (te3.C49046ct) r0
            java.util.LinkedList<te3.qc0> r0 = r0.f131938e
            pb1.z r1 = r6.f295103g
            te3.kd0 r1 = r1.field_favProto
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            r5 = 0
        L_0x009b:
            int r2 = r0.size()
            if (r5 >= r2) goto L_0x04e5
            java.lang.Object r2 = r0.get(r5)
            te3.qc0 r2 = (te3.C101832qc0) r2
            r30 = r5
            java.lang.String r5 = r2.f299210d
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r18 == 0) goto L_0x00ba
            r16 = r30
            r24 = r0
            r14 = r1
            r13 = r4
        L_0x00b7:
            r3 = 0
            goto L_0x03a8
        L_0x00ba:
            java.lang.Object[] r3 = new java.lang.Object[r14]
            int r15 = r2.f299218o
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r3[r12] = r15
            r3[r13] = r5
            java.lang.String r15 = "klem OnGYNet status:%d, tmpId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r15, r3)
            int r3 = r2.f299218o
            java.lang.String r15 = "t"
            if (r3 != r13) goto L_0x02b6
            boolean r3 = r5.endsWith(r15)
            r14 = 6
            if (r3 != 0) goto L_0x0206
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r12)
            java.lang.Object r3 = r1.get(r3)
            te3.rc0 r3 = (te3.C101834rc0) r3
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.String r13 = r2.f299214h
            r14[r12] = r13
            java.lang.String r13 = r2.f299215i
            r21 = 1
            r14[r21] = r13
            java.lang.String r13 = r2.f299210d
            r20 = 2
            r14[r20] = r13
            java.lang.String r13 = r2.f299211e
            r19 = 3
            r14[r19] = r13
            int r13 = r2.f299213g
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r16 = 4
            r14[r16] = r13
            java.lang.String r13 = r2.f299212f
            r22 = 5
            r14[r22] = r13
            java.lang.String r13 = "klem OnGYNet cdn data exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r13, r14)
            java.lang.String r13 = r2.f299215i
            r3.mo141253f(r13)
            java.lang.String r13 = r2.f299214h
            r3.mo141254j(r13)
            java.lang.String r13 = r2.f299217n
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x0129
            java.lang.String r13 = r2.f299217n
            r3.mo141250Y(r13)
        L_0x0129:
            java.lang.String r13 = r3.f299266M
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x016e
            java.lang.String r13 = "klem OnGYNet cdn exist, local not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            java.lang.String r13 = r2.f299211e
            r3.mo141268x(r13)
            int r13 = r2.f299213g
            long r13 = (long) r13
            r3.mo141269y(r13)
            java.lang.String r13 = r2.f299212f
            r3.mo141270z(r13)
            pb1.o1$a r13 = new pb1.o1$a
            pb1.z r14 = r6.f295103g
            r22 = 1
            r23 = 0
            r24 = r0
            r0 = r13
            r25 = r1
            r1 = r27
            r12 = r2
            r2 = r3
            r26 = r3
            r3 = r14
            r14 = r4
            r4 = r22
            r16 = r30
            r30 = r5
            r7 = 4
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.LinkedList<pb1.o1$a> r0 = r6.f295107n
            r0.add(r13)
            goto L_0x017b
        L_0x016e:
            r16 = r30
            r24 = r0
            r25 = r1
            r12 = r2
            r26 = r3
            r14 = r4
            r30 = r5
            r7 = 4
        L_0x017b:
            java.lang.String r0 = r12.f299211e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = r12.f299211e
            r3 = r26
            java.lang.String r1 = r3.f299266M
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01aa
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r12.f299211e
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.f299266M
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "svrFullMd5 %s, localMd5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r1)
            java.lang.String r0 = r12.f299211e
            r3.mo141268x(r0)
            goto L_0x01aa
        L_0x01a8:
            r3 = r26
        L_0x01aa:
            java.lang.String r0 = r12.f299212f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r0 = r12.f299212f
            java.lang.String r1 = r3.f299271P
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d4
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r12.f299212f
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = r3.f299271P
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "svrHead256md5 %s, localHead256md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r1)
            java.lang.String r0 = r12.f299212f
            r3.mo141270z(r0)
        L_0x01d4:
            int r0 = r12.f299213g
            if (r0 <= 0) goto L_0x01fe
            long r1 = (long) r0
            long r4 = r3.f299276R
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x01fe
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r2[r1] = r0
            long r0 = r3.f299276R
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "svrFullSize %d, localFullSize %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r2)
            int r0 = r12.f299213g
            long r0 = (long) r0
            r3.mo141269y(r0)
        L_0x01fe:
            r5 = r30
            r13 = r14
            r4 = r25
            r14 = 5
            goto L_0x02bf
        L_0x0206:
            r16 = r30
            r24 = r0
            r25 = r1
            r12 = r2
            r13 = r4
            r30 = r5
            r7 = 4
            int r0 = r30.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            java.lang.String r0 = r5.substring(r2, r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            r4 = r25
            java.lang.Object r0 = r4.get(r0)
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r14 = r12.f299214h
            r3[r2] = r14
            java.lang.String r2 = r12.f299215i
            r3[r1] = r2
            java.lang.String r1 = r12.f299210d
            r2 = 2
            r3[r2] = r1
            java.lang.String r1 = r12.f299211e
            r2 = 3
            r3[r2] = r1
            int r1 = r12.f299213g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r7] = r1
            java.lang.String r1 = r12.f299212f
            r14 = 5
            r3[r14] = r1
            java.lang.String r1 = "klem OnGYNet cdn thumb exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r3)
            java.lang.String r1 = r12.f299215i
            r0.mo141255k(r1)
            java.lang.String r1 = r12.f299214h
            r0.mo141256l(r1)
            int r1 = r12.f299213g
            if (r1 <= 0) goto L_0x02bf
            long r1 = (long) r1
            r0.mo141243R(r1)
            java.lang.String r1 = r12.f299211e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x028b
            java.lang.String r1 = r12.f299211e
            java.lang.String r2 = r0.f299288X
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x028b
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r12.f299211e
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = r0.f299288X
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "svrThumbMd5 %s, localThumbMd5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r1, r2)
            java.lang.String r1 = r12.f299211e
            r0.mo141245T(r1)
        L_0x028b:
            java.lang.String r1 = r12.f299212f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x02bf
            java.lang.String r1 = r12.f299212f
            java.lang.String r2 = r0.f299292Z
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02bf
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r12.f299212f
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = r0.f299292Z
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "svrThumbHead256md5 %s, localThumbHead256md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r1, r2)
            java.lang.String r1 = r12.f299212f
            r0.mo141244S(r1)
            goto L_0x02bf
        L_0x02b6:
            r16 = r30
            r24 = r0
            r12 = r2
            r13 = r4
            r7 = 4
            r14 = 5
            r4 = r1
        L_0x02bf:
            boolean r0 = r5.endsWith(r15)
            if (r0 != 0) goto L_0x02d9
            r0 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r0)
            java.lang.Object r1 = r4.get(r1)
            te3.rc0 r1 = (te3.C101834rc0) r1
            java.util.HashMap<te3.rc0, java.lang.Boolean> r2 = r6.f295106j
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.put(r1, r3)
            r2 = 1
            goto L_0x02f5
        L_0x02d9:
            r0 = 0
            int r1 = r5.length()
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r1 = r5.substring(r0, r1)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r0)
            java.lang.Object r0 = r4.get(r1)
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.util.HashMap<te3.rc0, java.lang.Boolean> r1 = r6.f295106j
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.put(r0, r3)
        L_0x02f5:
            int r0 = r12.f299218o
            if (r0 == r2) goto L_0x03fb
            r1 = 2
            if (r0 == r1) goto L_0x03fb
            boolean r0 = r5.endsWith(r15)
            java.lang.String r1 = "local not exist cdn data key, generate %s"
            if (r0 != 0) goto L_0x0379
            r0 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r0)
            java.lang.Object r3 = r4.get(r3)
            te3.rc0 r3 = (te3.C101834rc0) r3
            java.lang.String r7 = r3.f299266M
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0327
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = r3.f299266M
            r1[r0] = r2
            java.lang.String r2 = "klem OnGYNet data cdn not exist, local not exist "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            r14 = r4
            goto L_0x00b7
        L_0x0327:
            r6.f295104h = r0
            java.lang.String r2 = r3.f299329u
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0347
            di3.d r2 = di3.C86312j.m106911c(r9)
            qo.h r2 = (p663qo.C101211h) r2
            java.lang.String r2 = r2.mo140293rN()
            r3.mo141253f(r2)
            r7 = 1
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r14[r0] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r14)
            goto L_0x0348
        L_0x0347:
            r7 = 1
        L_0x0348:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r3.f299266M
            r2[r0] = r1
            java.lang.String r0 = r3.f299329u
            r2[r7] = r0
            java.lang.String r0 = "klem OnGYNet cdn not exist, insert data md5:%s cdnkey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r2)
            pb1.o1$a r7 = new pb1.o1$a
            pb1.z r14 = r6.f295103g
            r17 = 0
            r18 = 0
            r0 = r7
            r1 = r27
            r2 = r3
            r3 = r14
            r14 = r4
            r4 = r17
            r32 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.LinkedList<pb1.o1$a> r0 = r6.f295107n
            r0.add(r7)
            r7 = r32
            goto L_0x03fd
        L_0x0379:
            r14 = r4
            r32 = r5
            int r0 = r32.length()
            r2 = 1
            int r0 = r0 - r2
            r7 = r32
            r3 = 0
            java.lang.String r0 = r7.substring(r3, r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            java.lang.Object r0 = r14.get(r0)
            r4 = r0
            te3.rc0 r4 = (te3.C101834rc0) r4
            java.lang.String r0 = r4.f299288X
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x03ad
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = r4.f299288X
            r0[r3] = r1
            java.lang.String r1 = "klem OnGYNet thumb cdn not exist, local not exist "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
        L_0x03a8:
            r17 = r9
        L_0x03aa:
            r2 = 3
            goto L_0x04d1
        L_0x03ad:
            r6.f295104h = r3
            java.lang.String r0 = r4.f299329u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x03cd
            di3.d r0 = di3.C86312j.m106911c(r9)
            qo.h r0 = (p663qo.C101211h) r0
            java.lang.String r0 = r0.mo140293rN()
            r4.mo141253f(r0)
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r5)
            goto L_0x03ce
        L_0x03cd:
            r2 = 1
        L_0x03ce:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r4.f299266M
            r1[r3] = r0
            java.lang.String r0 = r4.f299329u
            r1[r2] = r0
            java.lang.String r0 = "klem OnGYNet cdn not exist, insert thumb md5:%s cdnkey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r1)
            pb1.o1$a r5 = new pb1.o1$a
            pb1.z r3 = r6.f295103g
            r17 = 0
            r18 = 0
            r0 = r5
            r1 = r27
            r2 = r4
            r4 = r17
            r17 = r9
            r9 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.LinkedList<pb1.o1$a> r0 = r6.f295108o
            r0.add(r9)
            goto L_0x03ff
        L_0x03fb:
            r14 = r4
            r7 = r5
        L_0x03fd:
            r17 = r9
        L_0x03ff:
            int r0 = r12.f299218o
            r1 = 2
            if (r0 != r1) goto L_0x03aa
            r0 = 1
            r6.f295105i = r0
            boolean r2 = r7.endsWith(r15)
            if (r2 != 0) goto L_0x04ca
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r12.f299219p
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = r12.f299214h
            r3[r0] = r4
            java.lang.String r4 = r12.f299215i
            r3[r1] = r4
            java.lang.String r1 = "klem OnGYNet data cdn not exist svr upload, dataStatus:%d, CdnUrl:%s, CdnKey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r3)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r5)
            java.lang.Object r1 = r14.get(r1)
            te3.rc0 r1 = (te3.C101834rc0) r1
            int r3 = r12.f299219p
            r1.f299291Y0 = r3
            r1.f299293Z0 = r0
            java.lang.String r0 = r12.f299215i
            r1.mo141253f(r0)
            java.lang.String r0 = r12.f299214h
            r1.mo141254j(r0)
            java.lang.String r0 = r12.f299217n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x044e
            java.lang.String r0 = r12.f299217n
            r1.mo141250Y(r0)
        L_0x044e:
            java.lang.String r0 = r12.f299211e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0477
            java.lang.String r0 = r12.f299211e
            java.lang.String r3 = r1.f299266M
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0477
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = r12.f299211e
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = r1.f299266M
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = "SVR_UPLOADING::svrFullMd5 %s, localMd5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r0, r3)
            java.lang.String r0 = r12.f299211e
            r1.mo141268x(r0)
        L_0x0477:
            java.lang.String r0 = r12.f299212f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x04a0
            java.lang.String r0 = r12.f299212f
            java.lang.String r3 = r1.f299271P
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x04a0
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = r12.f299212f
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = r1.f299271P
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = "SVR_UPLOADING::svrHead256md5 %s, localHead256md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r0, r3)
            java.lang.String r0 = r12.f299212f
            r1.mo141270z(r0)
        L_0x04a0:
            int r0 = r12.f299213g
            if (r0 <= 0) goto L_0x04d1
            long r3 = (long) r0
            long r7 = r1.f299276R
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x04d1
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r4[r3] = r0
            long r7 = r1.f299276R
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r3 = 1
            r4[r3] = r0
            java.lang.String r0 = "SVR_UPLOADING::svrFullSize %d, localFullSize %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r0, r4)
            int r0 = r12.f299213g
            long r3 = (long) r0
            r1.mo141269y(r3)
            goto L_0x04d1
        L_0x04ca:
            r2 = 3
            java.lang.String r0 = "klem OnGYNet svr uploading thumb?! should not reach here!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x04d1:
            int r5 = r16 + 1
            r7 = r29
            r8 = r31
            r4 = r13
            r1 = r14
            r9 = r17
            r0 = r24
            r3 = -101(0xffffffffffffff9b, float:NaN)
            r12 = 0
            r13 = 1
            r14 = 2
            r15 = 3
            goto L_0x009b
        L_0x04e5:
            r24 = r0
            r14 = r1
            r13 = r4
            java.util.HashMap<te3.rc0, java.lang.Boolean> r0 = r6.f295106j
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x04f4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0511
            java.lang.Object r1 = r0.next()
            te3.rc0 r1 = (te3.C101834rc0) r1
            java.util.HashMap<te3.rc0, java.lang.Boolean> r3 = r6.f295106j
            java.lang.Object r1 = r3.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x04f4
            int r2 = r2 + 1
            goto L_0x04f4
        L_0x0511:
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r1 = r24.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r0[r3] = r1
            int r1 = r14.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "onGYSceneEnd:  resultCount %d, dataSize %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            if (r2 <= 0) goto L_0x0555
            com.tencent.mm.network.g r0 = r27.dispatcher()
            ob0.n r1 = r6.f295102f
            int r0 = r6.doScene(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "check cdn list not end, continues %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r2, r1)
            r1 = -100
            if (r0 == r1) goto L_0x0555
            r1 = -101(0xffffffffffffff9b, float:NaN)
            if (r0 != r1) goto L_0x0553
            goto L_0x0555
        L_0x0553:
            return
        L_0x0554:
            r13 = r4
        L_0x0555:
            boolean r0 = r6.f295105i
            java.lang.String r1 = "localId"
            if (r0 == 0) goto L_0x05aa
            java.lang.String r0 = "onGYNet waitServerUpload, send item now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            pb1.z r0 = r6.f295103g
            r2 = 12
            r0.field_itemStatus = r2
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            pb1.z r2 = r6.f295103g
            java.lang.String[] r1 = new java.lang.String[]{r1}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r2, r1)
            boolean r0 = r27.mo140161j1()
            if (r0 == 0) goto L_0x0591
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.l0 r0 = r0.mo128212cl()
            r0.run()
            goto L_0x05a0
        L_0x0591:
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.e1 r0 = r0.th0()
            wb1.x r0 = (wb1.C102421x) r0
            r0.mo142000c()
        L_0x05a0:
            ob0.n r0 = r6.f295102f
            r2 = r29
            r3 = r31
            r0.onSceneEnd(r2, r11, r3, r6)
            return
        L_0x05aa:
            r2 = r29
            r3 = r31
            r0 = 4
            boolean r4 = r6.f295104h
            r5 = 18
            if (r4 == 0) goto L_0x061f
            java.lang.String r0 = "onGYNet all data exist, start send item"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            pb1.z r0 = r6.f295103g
            int r4 = r0.field_id
            if (r4 <= 0) goto L_0x05ea
            r4 = 17
            r0.field_itemStatus = r4
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            pb1.z r4 = r6.f295103g
            java.lang.String[] r1 = new java.lang.String[]{r1}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r4, r1)
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.y0 r0 = r0.mo128203Ly()
            wb1.u r0 = (wb1.C102417u) r0
            r0.mo141993c()
            goto L_0x065d
        L_0x05ea:
            int r4 = r0.field_type
            if (r4 != r5) goto L_0x05f4
            te3.kd0 r0 = r0.field_favProto
            r4 = 1
            r0.mo141222t(r4)
        L_0x05f4:
            pb1.z r0 = r6.f295103g
            r4 = 9
            r0.field_itemStatus = r4
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            pb1.z r4 = r6.f295103g
            java.lang.String[] r1 = new java.lang.String[]{r1}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r4, r1)
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.e1 r0 = r0.th0()
            wb1.x r0 = (wb1.C102421x) r0
            r0.mo142000c()
            goto L_0x065d
        L_0x061f:
            r27.mo140161j1()
            pb1.z r4 = r6.f295103g
            int r7 = r4.field_id
            if (r7 <= 0) goto L_0x062d
            r0 = 15
            r4.field_itemStatus = r0
            goto L_0x063b
        L_0x062d:
            int r7 = r4.field_type
            if (r7 != r5) goto L_0x0637
            te3.kd0 r4 = r4.field_favProto
            r5 = 1
            r4.mo141222t(r5)
        L_0x0637:
            pb1.z r4 = r6.f295103g
            r4.field_itemStatus = r0
        L_0x063b:
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            pb1.z r4 = r6.f295103g
            java.lang.String[] r1 = new java.lang.String[]{r1}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r4, r1)
            di3.d r0 = di3.C86312j.m106911c(r10)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.l0 r0 = r0.mo128212cl()
            r0.run()
        L_0x065d:
            ob0.n r0 = r6.f295102f
            r0.onSceneEnd(r2, r11, r3, r6)
            return
        L_0x0663:
            r2 = r7
            r3 = r8
            ob0.n r1 = r6.f295102f
            r1.onSceneEnd(r2, r0, r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100727o1.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
