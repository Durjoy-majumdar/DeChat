package w52;

import android.content.ContentValues;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C97625j3;
import hd0.C98410o0;
import junit.framework.Assert;
import kd0.C76550x;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p206nj.C76861g;
import p682rz.C101488s;
import p823sg.C90193h;
import pe3.C89349b;
import te3.C51018qv3;
import te3.C52023xu2;
import te3.C78009wu2;

/* renamed from: w52.i */
public class C78519i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f229996d;

    /* renamed from: e */
    public C47350c f229997e;

    /* renamed from: f */
    public C78517d f229998f;

    /* renamed from: g */
    public int f229999g;

    /* renamed from: h */
    public C76861g.C47263a f230000h = null;

    /* renamed from: i */
    public int f230001i = 0;

    /* renamed from: j */
    public boolean f230002j = false;

    public C78519i(C78517d dVar, boolean z, int i) {
        Class cls = C101488s.class;
        this.f229998f = dVar;
        this.f229999g = i;
        dVar.mo108471j(Util.nowMilliSecond());
        if (dVar.mo108466e() == 43) {
            dVar.mo108474m(104);
            dVar.mo108475n(C98410o0.m127731m(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(dVar.mo108464c())));
            dVar.mo108472k(C98410o0.m127731m(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(dVar.mo108464c())));
            this.f230001i = 2500;
            if (dVar.mo108469h() == 2) {
                this.f230001i = 2500;
            }
        } else if (dVar.mo108466e() == 34) {
            this.f230001i = 40;
            dVar.mo108474m(104);
            dVar.mo108472k(C76550x.m92055d(dVar.mo108464c()));
            dVar.mo108475n(0);
        } else {
            int i2 = 1;
            if (dVar.mo108466e() == 3) {
                this.f230001i = 40;
                if (i == 1) {
                    this.f230001i = 1250;
                } else {
                    i2 = 0;
                }
                dVar.mo108473l(i2);
                dVar.mo108474m(104);
                dVar.mo108475n(0);
                dVar.mo108472k((int) C86013q1.m106451l(C97625j3.m125812b().mo105890e() + dVar.mo108464c()));
            } else if (dVar.mo108466e() == 1) {
                this.f230001i = 1;
                dVar.mo108474m(104);
                dVar.mo108472k(dVar.mo108464c().getBytes().length);
                dVar.mo108475n(0);
            } else {
                Log.m105918d("MicroMsg.NetSceneMasSend", "error msgtype:" + dVar.mo108466e());
                Assert.assertTrue("error msgtype:" + dVar.mo108466e(), false);
            }
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new C78009wu2());
        bVar.mo72407e(new C52023xu2());
        bVar.mo72409g("/cgi-bin/micromsg-bin/masssend");
        bVar.mo72404b(193);
        bVar.mo72406d(84);
        bVar.mo72408f(1000000084);
        C47350c a = bVar.mo72403a();
        this.f229997e = a;
        C78009wu2 wu22 = (C78009wu2) a.mo72394a();
        wu22.f228359e = C90193h.m112878f(dVar.mo108467f().getBytes());
        wu22.f228371t = dVar.mo108468g();
        wu22.f228358d = dVar.mo108467f();
        dVar.mo108470i("" + Util.nowMilliSecond());
        wu22.f228360f = dVar.mo108463b();
        wu22.f228361g = dVar.mo108466e();
        wu22.f228362h = dVar.mo108465d();
        wu22.f228372u = z ? 1 : 0;
        wu22.f228373v = i;
        this.f230000h = new C76861g.C47263a();
    }

    public void cancel() {
        this.f230002j = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x04a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03ed A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r17, ob0.C11385n r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r0.f229996d = r1
            boolean r1 = r0.f230002j
            java.lang.String r2 = "MicroMsg.NetSceneMasSend"
            r3 = -1
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = "isCancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0016:
            int r1 = r0.f230001i
            r4 = 1
            int r1 = r1 - r4
            r0.f230001i = r1
            if (r1 >= 0) goto L_0x0027
            java.lang.String r1 = "MAX_SEND_TIMES"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0027:
            w52.d r1 = r0.f229998f
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "MasSendInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0034:
            java.lang.String r1 = r1.mo108467f()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "MasSendInfo.toList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0047:
            w52.d r1 = r0.f229998f
            int r5 = r1.f229982h
            if (r5 != 0) goto L_0x0056
            java.lang.String r1 = "getTolistCount is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0056:
            int r5 = r1.f229986l
            if (r5 > 0) goto L_0x0063
            java.lang.String r1 = "getDataLen is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0063:
            int r5 = r1.f229976b
            r6 = 103(0x67, float:1.44E-43)
            if (r5 != r6) goto L_0x0076
            int r7 = r1.f229988n
            if (r7 > 0) goto L_0x0076
            java.lang.String r1 = "getThumbTotalLen is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0076:
            if (r5 == r6) goto L_0x0098
            r7 = 104(0x68, float:1.46E-43)
            if (r5 == r7) goto L_0x0098
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "msg type :"
            r1.append(r4)
            w52.d r4 = r0.f229998f
            int r4 = r4.f229983i
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            return r3
        L_0x0098:
            ob0.c r5 = r0.f229997e
            ob0.c$c r5 = r5.f127055a
            pe3.a r5 = r5.f127080a
            te3.wu2 r5 = (te3.C78009wu2) r5
            int r7 = r1.f229983i
            r8 = 43
            java.lang.String r9 = "]  Error "
            java.lang.String r10 = "] read ret:"
            java.lang.String r11 = " readlen:"
            java.lang.String r12 = " newOff:"
            java.lang.String r13 = " netOff:"
            r14 = 8000(0x1f40, float:1.121E-41)
            r15 = 0
            if (r7 != r8) goto L_0x02a7
            java.lang.Class<rz.s> r4 = p682rz.C101488s.class
            java.lang.String r1 = r1.mo108464c()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r7 == 0) goto L_0x00c9
            java.lang.String r1 = "MasSendInfo.fileName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02a4
        L_0x00c9:
            te3.qv3 r7 = new te3.qv3
            r7.<init>()
            r5.f228363i = r7
            r5.f228364j = r15
            te3.qv3 r7 = new te3.qv3
            r7.<init>()
            r5.f228368q = r7
            r5.f228367p = r15
            r7 = 2
            r5.f228369r = r7
            w52.d r8 = r0.f229998f
            int r7 = r8.f229984j
            r5.f228362h = r7
            int r7 = r8.f229989o
            if (r7 <= 0) goto L_0x00ea
            r7 = 2
            goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            r5.f228370s = r7
            int r7 = r8.f229988n
            r5.f228366o = r7
            int r7 = r8.f229986l
            r5.f228365n = r7
            int r7 = r8.f229976b
            java.lang.String r8 = " OldtOff:"
            java.lang.String r3 = "] newOff:"
            if (r7 != r6) goto L_0x01bd
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.s r4 = (p682rz.C101488s) r4
            rz.t r4 = r4.Kj0()
            hd0.o0 r4 = (hd0.C98410o0) r4
            java.lang.String r4 = r4.mo137729r(r1)
            w52.d r6 = r0.f229998f
            int r6 = r6.f229987m
            hd0.o0$$c r4 = hd0.C98410o0.m127732t(r4, r6, r14)
            int r6 = r4.f223071d
            java.lang.String r7 = "doScene READ THUMB["
            if (r6 < 0) goto L_0x01a3
            int r6 = r4.f223069b
            if (r6 != 0) goto L_0x0121
            goto L_0x01a3
        L_0x0121:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r1)
            r6.append(r10)
            int r7 = r4.f223071d
            r6.append(r7)
            r6.append(r11)
            int r7 = r4.f223069b
            r6.append(r7)
            r6.append(r12)
            int r7 = r4.f223070c
            r6.append(r7)
            r6.append(r13)
            w52.d r7 = r0.f229998f
            int r7 = r7.f229987m
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
            int r6 = r4.f223070c
            w52.d r7 = r0.f229998f
            int r7 = r7.f229987m
            if (r6 >= r7) goto L_0x0188
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Err doScene READ THUMB["
            r5.append(r6)
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f223070c
            r5.append(r1)
            r5.append(r8)
            w52.d r1 = r0.f229998f
            int r1 = r1.f229987m
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02a3
        L_0x0188:
            int r1 = r4.f223069b
            byte[] r2 = new byte[r1]
            byte[] r3 = r4.f223068a
            java.lang.System.arraycopy(r3, r15, r2, r15, r1)
            w52.d r1 = r0.f229998f
            int r1 = r1.f229987m
            r5.f228367p = r1
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            r1.mo73350k(r2)
            r5.f228368q = r1
            goto L_0x0289
        L_0x01a3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02a3
        L_0x01bd:
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.s r4 = (p682rz.C101488s) r4
            rz.t r4 = r4.Kj0()
            hd0.o0 r4 = (hd0.C98410o0) r4
            java.lang.String r4 = r4.mo137728q(r1)
            w52.d r6 = r0.f229998f
            int r6 = r6.f229985k
            hd0.o0$$c r4 = hd0.C98410o0.m127732t(r4, r6, r14)
            int r6 = r4.f223071d
            java.lang.String r7 = "doScene READ VIDEO["
            if (r6 < 0) goto L_0x028b
            int r6 = r4.f223069b
            if (r6 != 0) goto L_0x01e1
            goto L_0x028b
        L_0x01e1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r1)
            r6.append(r10)
            int r7 = r4.f223071d
            r6.append(r7)
            r6.append(r11)
            int r7 = r4.f223069b
            r6.append(r7)
            r6.append(r12)
            int r7 = r4.f223070c
            r6.append(r7)
            r6.append(r13)
            w52.d r7 = r0.f229998f
            int r7 = r7.f229985k
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
            int r6 = r4.f223070c
            w52.d r7 = r0.f229998f
            int r7 = r7.f229985k
            java.lang.String r9 = "Err doScene READ VIDEO["
            if (r6 >= r7) goto L_0x0247
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f223070c
            r5.append(r1)
            r5.append(r8)
            w52.d r1 = r0.f229998f
            int r1 = r1.f229985k
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02a3
        L_0x0247:
            long r6 = (long) r6
            long r10 = hd0.C76152m.f223054l
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x026c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r1)
            java.lang.String r1 = "] maxsize:"
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02a3
        L_0x026c:
            int r1 = r4.f223069b
            byte[] r2 = new byte[r1]
            byte[] r3 = r4.f223068a
            java.lang.System.arraycopy(r3, r15, r2, r15, r1)
            w52.d r1 = r0.f229998f
            int r3 = r1.f229985k
            r5.f228364j = r3
            int r1 = r1.f229987m
            r5.f228367p = r1
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            r1.mo73350k(r2)
            r5.f228363i = r1
        L_0x0289:
            r3 = 0
            goto L_0x02a4
        L_0x028b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
        L_0x02a3:
            r3 = -1
        L_0x02a4:
            if (r3 == 0) goto L_0x04dc
            return r3
        L_0x02a7:
            r3 = 34
            if (r7 != r3) goto L_0x03ef
            r5.f228369r = r15
            r5.f228370s = r15
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            byte[] r3 = new byte[r15]
            r1.mo73350k(r3)
            r5.f228363i = r1
            r5.f228364j = r15
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            byte[] r3 = new byte[r15]
            r1.mo73350k(r3)
            r5.f228368q = r1
            r5.f228367p = r15
            r5.f228366o = r15
            w52.d r1 = r0.f229998f
            int r1 = r1.f229986l
            r5.f228365n = r1
            java.lang.Class<dn.t> r1 = p492dn.C75415t.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            dn.t r1 = (p492dn.C75415t) r1
            w52.d r3 = r0.f229998f
            java.lang.String r3 = r3.mo108464c()
            kd0.d r1 = r1.w20(r3)
            if (r1 != 0) goto L_0x02f2
            p206nj.C76861g.m92658a()
            java.lang.String r1 = "fileop is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
        L_0x02ef:
            r15 = -1
            goto L_0x03eb
        L_0x02f2:
            w52.d r3 = r0.f229998f
            int r3 = r3.f229985k
            kd0.j r3 = r1.mo106771d(r3, r14)
            if (r3 != 0) goto L_0x0305
            p206nj.C76861g.m92658a()
            java.lang.String r1 = "readRes is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            goto L_0x02ef
        L_0x0305:
            int r4 = r3.f173722d
            if (r4 >= 0) goto L_0x0349
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Err doScene READ file["
            r1.append(r4)
            w52.d r4 = r0.f229998f
            java.lang.String r4 = r4.mo108464c()
            r1.append(r4)
            r1.append(r10)
            int r4 = r3.f173722d
            r1.append(r4)
            r1.append(r11)
            int r4 = r3.f173720b
            r1.append(r4)
            r1.append(r12)
            int r3 = r3.f173721c
            r1.append(r3)
            r1.append(r13)
            w52.d r3 = r0.f229998f
            int r3 = r3.f229985k
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02ef
        L_0x0349:
            int r4 = r3.f173721c
            w52.d r6 = r0.f229998f
            int r7 = r6.f229985k
            if (r4 < r7) goto L_0x03aa
            r7 = 469000(0x72808, float:6.57209E-40)
            if (r4 < r7) goto L_0x0357
            goto L_0x03aa
        L_0x0357:
            int r4 = r6.f229986l
            if (r4 > 0) goto L_0x0386
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Err doScene READ datalen file["
            r1.append(r3)
            w52.d r3 = r0.f229998f
            java.lang.String r3 = r3.mo108464c()
            r1.append(r3)
            java.lang.String r3 = "] read totalLen:"
            r1.append(r3)
            w52.d r3 = r0.f229998f
            int r3 = r3.f229986l
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02ef
        L_0x0386:
            int r2 = r3.f173720b
            byte[] r4 = new byte[r2]
            byte[] r3 = r3.f173719a
            java.lang.System.arraycopy(r3, r15, r4, r15, r2)
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            r2.mo73350k(r4)
            r5.f228363i = r2
            w52.d r2 = r0.f229998f
            int r3 = r2.f229984j
            r5.f228362h = r3
            int r2 = r2.f229985k
            r5.f228364j = r2
            int r1 = r1.getFormat()
            r5.f228374w = r1
            goto L_0x03eb
        L_0x03aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Err doScene READ offseterror file["
            r1.append(r4)
            w52.d r4 = r0.f229998f
            java.lang.String r4 = r4.mo108464c()
            r1.append(r4)
            r1.append(r10)
            int r4 = r3.f173722d
            r1.append(r4)
            r1.append(r11)
            int r4 = r3.f173720b
            r1.append(r4)
            r1.append(r12)
            int r3 = r3.f173721c
            r1.append(r3)
            r1.append(r13)
            w52.d r3 = r0.f229998f
            int r3 = r3.f229985k
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x02ef
        L_0x03eb:
            if (r15 == 0) goto L_0x04dc
            r1 = -1
            return r1
        L_0x03ef:
            r3 = 3
            if (r7 != r3) goto L_0x04a8
            java.lang.String r1 = r1.mo108464c()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0407
            java.lang.String r1 = "getFilename is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
        L_0x0404:
            r15 = -1
            goto L_0x04a4
        L_0x0407:
            r5.f228369r = r15
            r5.f228370s = r15
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            byte[] r3 = new byte[r15]
            r1.mo73350k(r3)
            r5.f228363i = r1
            r5.f228364j = r15
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            byte[] r3 = new byte[r15]
            r1.mo73350k(r3)
            r5.f228368q = r1
            r5.f228367p = r15
            r5.f228366o = r15
            r5.f228362h = r15
            w52.d r1 = r0.f229998f
            int r3 = r1.f229988n
            r5.f228366o = r3
            int r1 = r1.f229986l
            r5.f228365n = r1
            int r1 = r0.f229999g
            r5.f228373v = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            eb0.c r3 = eb0.C97625j3.m125812b()
            r3.getClass()
            java.lang.String r3 = f12.C7970a.m8127a()
            r1.append(r3)
            w52.d r3 = r0.f229998f
            java.lang.String r3 = r3.mo108464c()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            w52.d r3 = r0.f229998f
            int r4 = r3.f229986l
            int r3 = r3.f229985k
            int r4 = r4 - r3
            if (r4 <= r14) goto L_0x0463
            goto L_0x0464
        L_0x0463:
            r14 = r4
        L_0x0464:
            byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r1, r3, r14)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r1)
            if (r3 == 0) goto L_0x0490
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "doScene READ data["
            r1.append(r3)
            w52.d r3 = r0.f229998f
            java.lang.String r3 = r3.mo108464c()
            r1.append(r3)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            p206nj.C76861g.m92658a()
            goto L_0x0404
        L_0x0490:
            w52.d r2 = r0.f229998f
            int r3 = r2.f229985k
            r5.f228364j = r3
            int r2 = r2.f229987m
            r5.f228367p = r2
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            r2.mo73350k(r1)
            r5.f228363i = r2
        L_0x04a4:
            if (r15 == 0) goto L_0x04dc
            r1 = -1
            return r1
        L_0x04a8:
            if (r7 != r4) goto L_0x04e5
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            w52.d r2 = r0.f229998f
            java.lang.String r2 = r2.mo108464c()
            byte[] r2 = r2.getBytes()
            r1.mo73350k(r2)
            r5.f228363i = r1
            w52.d r1 = r0.f229998f
            int r1 = r1.f229986l
            r5.f228365n = r1
            r5.f228362h = r15
            r5.f228364j = r15
            te3.qv3 r1 = new te3.qv3
            r1.<init>()
            byte[] r2 = new byte[r15]
            r1.mo73350k(r2)
            r5.f228368q = r1
            r5.f228367p = r15
            r5.f228366o = r15
            r5.f228369r = r15
            r5.f228370s = r15
        L_0x04dc:
            ob0.c r1 = r0.f229997e
            r2 = r17
            int r1 = r0.dispatch(r2, r1, r0)
            return r1
        L_0x04e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "error msgtype:"
            r1.append(r3)
            w52.d r3 = r0.f229998f
            int r3 = r3.f229983i
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            p206nj.C76861g.m92658a()
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w52.C78519i.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 193;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C51018qv3 qv32;
        C89349b bVar;
        C51018qv3 qv33;
        C89349b bVar2;
        Log.m105918d("MicroMsg.NetSceneMasSend", "onGYNetEnd  errtype:" + i2 + " errCode:" + i3);
        updateDispatchId(i);
        if (i2 == 0 && i3 == 0) {
            C78517d dVar = this.f229998f;
            if (dVar == null) {
                Log.m105920e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
                C76861g.m92658a();
                this.f229996d.onSceneEnd(i2, i3, str, this);
                return;
            }
            int i4 = dVar.f229976b;
            if (i4 == 104 || i4 == 103) {
                C47350c cVar = this.f229997e;
                C52023xu2 xu22 = (C52023xu2) cVar.f127056b.f127083a;
                C78009wu2 wu22 = (C78009wu2) cVar.f127055a.f127080a;
                if (wu22.f228366o > 0 && (qv33 = wu22.f228368q) != null && (bVar2 = qv33.f140574f) != null && !Util.isNullOrNil(bVar2.mo123703f()) && wu22.f228367p != xu22.f144976e - wu22.f228368q.f140572d) {
                    Log.m105920e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
                    C76861g.m92658a();
                    this.f229996d.onSceneEnd(3, -1, "doScene failed", this);
                } else if (wu22.f228365n <= 0 || (qv32 = wu22.f228363i) == null || (bVar = qv32.f140574f) == null || Util.isNullOrNil(bVar.mo123703f()) || wu22.f228364j == xu22.f144975d - wu22.f228363i.f140572d) {
                    this.f229998f.f229978d = Util.nowSecond();
                    C78517d dVar2 = this.f229998f;
                    int i5 = dVar2.f229976b;
                    if (i5 == 103) {
                        int i6 = wu22.f228367p + wu22.f228368q.f140572d;
                        dVar2.f229987m = i6;
                        if (i6 >= dVar2.f229988n) {
                            dVar2.f229976b = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
                        }
                    } else if (i5 == 104) {
                        int i7 = wu22.f228364j + wu22.f228363i.f140572d;
                        dVar2.f229985k = i7;
                        if (i7 >= dVar2.f229986l) {
                            if (dVar2.f229988n > 0) {
                                dVar2.f229976b = 103;
                            } else {
                                dVar2.f229976b = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
                            }
                        }
                    } else {
                        Log.m105920e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:" + i5);
                        C76861g.m92658a();
                        this.f229996d.onSceneEnd(3, -1, "doScene failed", this);
                        return;
                    }
                    if (dVar2.f229976b == 199) {
                        C78518e wx02 = C38023l.wx0();
                        C78517d dVar3 = this.f229998f;
                        wx02.getClass();
                        if (dVar3 != null) {
                            dVar3.f229993s = -1;
                            ContentValues contentValues = new ContentValues();
                            boolean z = true;
                            if ((dVar3.f229993s & 1) != 0) {
                                contentValues.put("clientid", dVar3.mo108463b());
                            }
                            if ((dVar3.f229993s & 2) != 0) {
                                contentValues.put("status", Integer.valueOf(dVar3.f229976b));
                            }
                            if ((dVar3.f229993s & 4) != 0) {
                                contentValues.put("createtime", Long.valueOf(dVar3.f229977c));
                            }
                            if ((dVar3.f229993s & 8) != 0) {
                                contentValues.put("lastmodifytime", Long.valueOf(dVar3.f229978d));
                            }
                            if ((dVar3.f229993s & 16) != 0) {
                                contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, dVar3.mo108464c());
                            }
                            String str2 = "";
                            if ((dVar3.f229993s & 32) != 0) {
                                String str3 = dVar3.f229980f;
                                if (str3 == null) {
                                    str3 = str2;
                                }
                                contentValues.put("thumbfilename", str3);
                            }
                            if ((dVar3.f229993s & 64) != 0) {
                                contentValues.put("tolist", dVar3.mo108467f());
                            }
                            if ((dVar3.f229993s & 128) != 0) {
                                contentValues.put("tolistcount", Integer.valueOf(dVar3.f229982h));
                            }
                            if ((dVar3.f229993s & 256) != 0) {
                                contentValues.put("msgtype", Integer.valueOf(dVar3.f229983i));
                            }
                            if ((dVar3.f229993s & 512) != 0) {
                                contentValues.put("mediatime", Integer.valueOf(dVar3.f229984j));
                            }
                            if ((dVar3.f229993s & 1024) != 0) {
                                contentValues.put("datanetoffset", Integer.valueOf(dVar3.f229985k));
                            }
                            if ((dVar3.f229993s & 2048) != 0) {
                                contentValues.put("datalen", Integer.valueOf(dVar3.f229986l));
                            }
                            if ((dVar3.f229993s & 4096) != 0) {
                                contentValues.put("thumbnetoffset", Integer.valueOf(dVar3.f229987m));
                            }
                            if ((dVar3.f229993s & 8192) != 0) {
                                contentValues.put("thumbtotallen", Integer.valueOf(dVar3.f229988n));
                            }
                            if ((dVar3.f229993s & 16384) != 0) {
                                contentValues.put("reserved1", Integer.valueOf(dVar3.f229989o));
                            }
                            if ((dVar3.f229993s & 32768) != 0) {
                                contentValues.put("reserved2", Integer.valueOf(dVar3.f229990p));
                            }
                            if ((dVar3.f229993s & 65536) != 0) {
                                String str4 = dVar3.f229991q;
                                if (str4 == null) {
                                    str4 = str2;
                                }
                                contentValues.put("reserved3", str4);
                            }
                            if ((dVar3.f229993s & 131072) != 0) {
                                String str5 = dVar3.f229992r;
                                if (str5 != null) {
                                    str2 = str5;
                                }
                                contentValues.put("reserved4", str2);
                            }
                            if (((int) wx02.f229995d.mo125627q("massendinfo", "clientid", contentValues, false)) != -1) {
                                if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j("masssendapp") != null) {
                                    z = false;
                                }
                                C72976h2 h2Var = new C72976h2();
                                h2Var.setUsername("masssendapp");
                                h2Var.mo108792M2(wx02.mo108478qq(dVar3));
                                h2Var.mo108793N2(dVar3.f229977c);
                                h2Var.mo108803Y2(0);
                                h2Var.mo108812g3(0);
                                h2Var.mo108807c3((String) null);
                                if (z) {
                                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69751W(h2Var);
                                } else {
                                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(h2Var, "masssendapp");
                                }
                                wx02.doNotify();
                            }
                        }
                        C76861g.C47263a aVar = this.f230000h;
                        long a = aVar != null ? aVar.mo72288a() : 0;
                        Log.m105918d("MicroMsg.NetSceneMasSend", "!!!FIN: useTime:" + a);
                        this.f229996d.onSceneEnd(i2, i3, str, this);
                    } else if (doScene(dispatcher(), this.f229996d) == -1) {
                        C76861g.m92658a();
                        this.f229996d.onSceneEnd(3, -1, "doScene failed", this);
                    }
                } else {
                    Log.m105920e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
                    C76861g.m92658a();
                    this.f229996d.onSceneEnd(3, -1, "doScene failed", this);
                }
            } else {
                Log.m105920e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + this.f229998f.f229976b);
                C76861g.m92658a();
                this.f229996d.onSceneEnd(i2, i3, str, this);
            }
        } else {
            Log.m105920e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + i2 + " errCode:" + i3);
            C76861g.m92658a();
            this.f229996d.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 2500;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
