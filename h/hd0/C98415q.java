package hd0;

import bp3.C104160f;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C75700k0;
import fd3.C97867h;
import h81.C32735h;
import ic3.C27512d;
import ig3.C98692n;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p206nj.C76861g;
import p494dp.C97505b;
import p663qo.C101213l;
import p682rz.C101482k;
import p753xp.C102704b;
import p867wp.C102479b;
import pc0.C77068x;
import te3.wn4;
import uf0.C102015b;
import uf0.C102016c;

/* renamed from: hd0.q */
public class C98415q extends C117747y implements C1311n, C101482k {

    /* renamed from: A */
    public C98124g.C98125a f288614A = new q$$e(this);

    /* renamed from: B */
    public int f288615B = 0;

    /* renamed from: C */
    public MTimerHandler f288616C = new MTimerHandler(new q$$f(this), true);

    /* renamed from: d */
    public C11385n f288617d;

    /* renamed from: e */
    public C47350c f288618e;

    /* renamed from: f */
    public String f288619f;

    /* renamed from: g */
    public String f288620g = "";

    /* renamed from: h */
    public final int f288621h;

    /* renamed from: i */
    public int f288622i = 0;

    /* renamed from: j */
    public boolean f288623j = false;

    /* renamed from: n */
    public C98408n0 f288624n;

    /* renamed from: o */
    public boolean f288625o = false;

    /* renamed from: p */
    public C76861g.C47263a f288626p = null;

    /* renamed from: q */
    public boolean f288627q = true;

    /* renamed from: r */
    public String f288628r = "";

    /* renamed from: s */
    public long f288629s = 0;

    /* renamed from: t */
    public int f288630t = 4;

    /* renamed from: u */
    public boolean f288631u = false;

    /* renamed from: v */
    public boolean f288632v = false;

    /* renamed from: w */
    public int f288633w = 0;

    /* renamed from: x */
    public C97867h.C97868a f288634x = new q$$b(this);

    /* renamed from: y */
    public C98124g.C98125a f288635y = new q$$c(this);

    /* renamed from: z */
    public C97867h.C97868a f288636z = new q$$d(this);

    public C98415q(String str) {
        Assert.assertTrue(str != null);
        Log.m105918d("MicroMsg.NetSceneUploadVideo", "NetSceneUploadVideo:  file:" + str);
        this.f288619f = str;
        C98408n0 i = C98429r0.m127818i(str);
        this.f288624n = i;
        if (i != null) {
            this.f288621h = 2500;
        } else {
            this.f288621h = 0;
        }
        this.f288626p = new C76861g.C47263a();
        C98408n0 n0Var = this.f288624n;
        if (n0Var != null && 3 == n0Var.mo137709m()) {
            this.f288630t = 6;
        }
        Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s NetSceneUploadVideo:  videoType:[%d]", mo137749p1(), Integer.valueOf(this.f288630t));
    }

    /* renamed from: j1 */
    public static void m127767j1(C98415q qVar, C98121d dVar) {
        C98408n0 n0Var = qVar.f288624n;
        if (n0Var == null) {
            Log.m105928w("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, video info is null !");
        } else if (dVar == null) {
            Log.m105928w("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, cdn result is null !");
        } else {
            C27512d dVar2 = new C27512d();
            dVar2.mo141099d(n0Var.mo137705i());
            if (Util.isNullOrNil(dVar2.f76250f) && !dVar.mo137409b()) {
                String str = dVar.field_aesKey;
                dVar2.f76250f = str;
                dVar2.f76252h = str;
                String str2 = dVar.field_fileId;
                dVar2.f76251g = str2;
                dVar2.f76253i = str2;
                n0Var.f288575v = dVar2.mo141118z();
                n0Var.f288548P = 2097152;
                C98429r0.m127808N(n0Var);
                Log.m105924i("MicroMsg.NetSceneUploadVideo", "do check before md5 check, aeskey = " + dVar.field_aesKey);
            }
            if (!dVar.mo137409b() || !Util.isNullOrNil(dVar.field_aesKey)) {
                qVar.mo137747n1(n0Var, dVar);
                return;
            }
            Log.m105924i("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, upload by cdn hit md5, do md5 check");
            ((C97505b) C86312j.m106911c(C97505b.class)).mo136779zN(dVar.field_fileId, dVar.field_filemd5, dVar.field_mp4identifymd5, dVar.field_filecrc, new q$$a(qVar, dVar2, n0Var, dVar));
        }
    }

    /* renamed from: A0 */
    public String mo137741A0() {
        C98408n0 n0Var = this.f288624n;
        return n0Var == null ? "" : n0Var.mo137705i();
    }

    /* renamed from: a */
    public String mo137742a() {
        return this.f288619f;
    }

    public void cancel() {
        Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s stop %s", mo137749p1(), this.f288628r);
        if (!Util.isNullOrNil(this.f288628r)) {
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(this.f288628r);
        }
        this.f288623j = true;
        super.cancel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: type inference failed for: r10v52, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r10v53 */
    /* JADX WARNING: type inference failed for: r10v59 */
    /* JADX WARNING: type inference failed for: r10v60 */
    /* JADX WARNING: type inference failed for: r10v61 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f4, code lost:
        if (r8 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0793 A[SYNTHETIC, Splitter:B:175:0x0793] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0249  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r23, ob0.C11385n r24) {
        /*
            r22 = this;
            r1 = r22
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            r0 = r24
            r1.f288617d = r0
            java.lang.String r0 = r1.f288619f
            hd0.n0 r0 = hd0.C98429r0.m127818i(r0)
            r1.f288624n = r0
            r3 = -1
            r4 = 2
            r5 = 1
            java.lang.String r6 = "MicroMsg.NetSceneUploadVideo"
            r7 = 0
            if (r0 == 0) goto L_0x0797
            int r0 = r0.f288562i
            r8 = 104(0x68, float:1.46E-43)
            r9 = 103(0x67, float:1.44E-43)
            if (r0 == r8) goto L_0x0024
            if (r0 == r9) goto L_0x0024
            goto L_0x0797
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "doscene file:"
            r0.append(r8)
            java.lang.String r8 = r1.f288619f
            r0.append(r8)
            java.lang.String r8 = " stat:"
            r0.append(r8)
            hd0.n0 r8 = r1.f288624n
            int r8 = r8.f288562i
            r0.append(r8)
            java.lang.String r8 = " ["
            r0.append(r8)
            hd0.n0 r8 = r1.f288624n
            int r8 = r8.f288560g
            r0.append(r8)
            java.lang.String r8 = ","
            r0.append(r8)
            hd0.n0 r10 = r1.f288624n
            int r10 = r10.f288561h
            r0.append(r10)
            java.lang.String r10 = "] ["
            r0.append(r10)
            hd0.n0 r10 = r1.f288624n
            int r10 = r10.f288557d
            r0.append(r10)
            r0.append(r8)
            hd0.n0 r8 = r1.f288624n
            int r8 = r8.f288559f
            r0.append(r8)
            java.lang.String r8 = "]  netTimes:"
            r0.append(r8)
            hd0.n0 r8 = r1.f288624n
            int r8 = r8.f288568o
            r0.append(r8)
            java.lang.String r8 = " times:"
            r0.append(r8)
            int r8 = r1.f288615B
            int r10 = r8 + 1
            r1.f288615B = r10
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            long r10 = r1.f288629s
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00a1
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f288629s = r10
            hd0.n0 r0 = r1.f288624n
            r0.getClass()
        L_0x00a1:
            hd0.o0 r0 = hd0.C98398h0.Bx0()
            java.lang.String r8 = r1.f288619f
            java.lang.String r0 = r0.mo137728q(r8)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r10 = 0
            if (r8 != 0) goto L_0x00b4
        L_0x00b2:
            r0 = 0
            goto L_0x00fa
        L_0x00b4:
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00e0 }
            r0 = 32
            byte[] r11 = new byte[r0]     // Catch:{ Exception -> 0x00de }
            r8.read(r11, r7, r0)     // Catch:{ Exception -> 0x00de }
            java.lang.String r0 = hd0.C98403m0.m127701a(r11)     // Catch:{ Exception -> 0x00de }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x00de }
            if (r11 != 0) goto L_0x00f6
            java.lang.String r0 = r0.toUpperCase()     // Catch:{ Exception -> 0x00de }
            java.lang.String r11 = "68766331"
            boolean r0 = r0.contains(r11)     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00f6
            r8.close()     // Catch:{ IOException -> 0x00d8 }
        L_0x00d8:
            r0 = 1
            goto L_0x00fa
        L_0x00da:
            r0 = move-exception
            r10 = r8
            goto L_0x0791
        L_0x00de:
            r0 = move-exception
            goto L_0x00e5
        L_0x00e0:
            r0 = move-exception
            goto L_0x0791
        L_0x00e3:
            r0 = move-exception
            r8 = r10
        L_0x00e5:
            java.lang.String r11 = "MicroMsg.VideoFile"
            java.lang.String r14 = "exception:%s"
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ all -> 0x00da }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x00da }
            r15[r7] = r0     // Catch:{ all -> 0x00da }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r15)     // Catch:{ all -> 0x00da }
            if (r8 == 0) goto L_0x00b2
        L_0x00f6:
            r8.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b2
        L_0x00fa:
            if (r0 == 0) goto L_0x011e
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r8 = r22.mo137749p1()
            r0[r7] = r8
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137705i()
            r0[r5] = r8
            java.lang.String r8 = "%s it is mm h265 video xml[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r8, r0)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 354(0x162, double:1.75E-321)
            r17 = 139(0x8b, double:6.87E-322)
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
        L_0x011e:
            boolean r0 = r22.mo137745l1()
            if (r0 == 0) goto L_0x0130
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r1.f288619f
            r0[r7] = r2
            java.lang.String r2 = "cdntra use cdn return -1 for onGYNetEnd clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r0)
            return r7
        L_0x0130:
            java.lang.Class<xc3.c> r0 = xc3.C102617c.class
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            boolean r8 = eb0.C45628s0.m50751P(r8)
            r11 = 4
            r14 = 3
            if (r8 == 0) goto L_0x0158
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r8 = r22.mo137749p1()
            r0[r7] = r8
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            r0[r5] = r8
            java.lang.String r8 = "%s cdntra not use parallel-upload user:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r8, r0)
        L_0x0155:
            r0 = 0
            goto L_0x023b
        L_0x0158:
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_parallel_upload_video_android
            int r8 = r8.mo58779Qe(r15, r7)
            if (r5 != r8) goto L_0x016a
            r8 = 1
            goto L_0x016b
        L_0x016a:
            r8 = 0
        L_0x016b:
            if (r8 != 0) goto L_0x0173
            java.lang.String r0 = "NOT ALLOW USE PARALLEL UPLOAD VIDEO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0155
        L_0x0173:
            boolean r8 = hd0.C98429r0.m127831v()
            if (r8 != 0) goto L_0x017a
            goto L_0x0198
        L_0x017a:
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85809L5(r8)
            if (r8 != 0) goto L_0x019a
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85807K5(r8)
            if (r8 != 0) goto L_0x019a
            java.lang.String r8 = "is not c2c scene, do not go thumbFirst process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
        L_0x0198:
            r8 = 0
            goto L_0x01cb
        L_0x019a:
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            java.lang.String r15 = r1.f288619f
            java.lang.String r8 = r8.mo137729r(r15)
            java.lang.String r8 = r1.mo137746m1(r8)
            fd3.h r15 = new fd3.h
            r15.<init>()
            hd0.n0 r9 = r1.f288624n
            long r12 = r9.f288567n
            r15.f287089h = r12
            fd3.h$a r9 = r1.f288634x
            r15.f287084c = r9
            r15.f287083b = r4
            r15.f287082a = r14
            r15.f287086e = r8
            di3.d r8 = di3.C86312j.m106911c(r0)
            xc3.c r8 = (xc3.C102617c) r8
            xc3.b r8 = r8.L50()
            r8.mo137189b(r15)
            r8 = 1
        L_0x01cb:
            if (r8 == 0) goto L_0x01cf
        L_0x01cd:
            r0 = 1
            goto L_0x023b
        L_0x01cf:
            boolean r8 = hd0.C98429r0.m127830u()
            if (r8 != 0) goto L_0x01d7
            r8 = 0
            goto L_0x01ef
        L_0x01d7:
            ob0.b0 r8 = f40.C86709a0.m107524d()
            hd0.v r9 = new hd0.v
            java.lang.String r12 = r1.f288619f
            int r13 = r22.mo137744k1()
            hd0.r r15 = new hd0.r
            r15.<init>(r1)
            r9.<init>(r12, r13, r10, r15)
            r8.mo123460f(r9)
            r8 = 1
        L_0x01ef:
            if (r8 == 0) goto L_0x01f2
            goto L_0x01cd
        L_0x01f2:
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r1.f288619f
            java.lang.String r8 = r8.mo137729r(r9)
            hd0.o0 r9 = hd0.C98398h0.Bx0()
            java.lang.String r12 = r1.f288619f
            java.lang.String r9 = r9.mo137728q(r12)
            java.lang.String r8 = r1.mo137746m1(r8)
            fd3.h r12 = new fd3.h
            r12.<init>()
            hd0.n0 r13 = r1.f288624n
            long r14 = r13.f288567n
            r12.f287089h = r14
            fd3.h$a r13 = r1.f288636z
            r12.f287084c = r13
            r12.f287083b = r4
            r12.f287082a = r11
            r12.f287086e = r8
            r12.f287085d = r9
            di3.d r0 = di3.C86312j.m106911c(r0)
            xc3.c r0 = (xc3.C102617c) r0
            xc3.b r0 = r0.L50()
            r0.mo137189b(r12)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r8 = r1.f288619f
            r0[r7] = r8
            java.lang.String r8 = "use ParallelUploader, filename:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r0)
            goto L_0x01cd
        L_0x023b:
            if (r0 == 0) goto L_0x0249
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r1.f288619f
            r0[r7] = r2
            java.lang.String r2 = "cdntra use parallel-upload return -1 for onGYNetEnd clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r0)
            return r7
        L_0x0249:
            hd0.n0 r0 = r1.f288624n
            int r8 = r0.f288572s
            if (r8 != r5) goto L_0x0252
            r1.f288625o = r5
            goto L_0x02b1
        L_0x0252:
            long r8 = r0.f288563j
            r12 = 600(0x258, double:2.964E-321)
            long r8 = r8 + r12
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0284
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "create time check error:"
            r0.append(r2)
            java.lang.String r2 = r1.f288619f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x0284:
            java.lang.String r0 = r1.f288619f
            boolean r0 = hd0.C98429r0.m127813d(r0)
            if (r0 != 0) goto L_0x02b1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkVoiceNetTimes Failed file:"
            r0.append(r2)
            java.lang.String r2 = r1.f288619f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x02b1:
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.wn4 r8 = new te3.wn4
            r8.<init>()
            r0.f127066a = r8
            te3.xn4 r8 = new te3.xn4
            r8.<init>()
            r0.f127067b = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/uploadvideo"
            r0.f127068c = r8
            r8 = 149(0x95, float:2.09E-43)
            r0.f127069d = r8
            r8 = 39
            r0.f127070e = r8
            r8 = 1000000039(0x3b9aca27, float:0.0047238055)
            r0.f127071f = r8
            ob0.c r0 = r0.mo72403a()
            r1.f288618e = r0
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.wn4 r0 = (te3.wn4) r0
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            java.lang.String r9 = ""
            java.lang.Object r8 = r8.mo119684e(r4, r9)
            java.lang.String r8 = (java.lang.String) r8
            r0.f299771e = r8
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            r0.f299772f = r8
            java.lang.String r8 = r1.f288619f
            r0.f299770d = r8
            boolean r8 = r1.f288625o
            if (r8 == 0) goto L_0x0305
            r0.f299783s = r4
        L_0x0305:
            hd0.n0 r8 = r1.f288624n
            int r12 = r8.f288576w
            r13 = 3
            if (r12 != r13) goto L_0x030e
            r0.f299783s = r13
        L_0x030e:
            int r12 = r8.f288566m
            r0.f299779p = r12
            int r12 = r8.f288561h
            r0.f299773g = r12
            int r8 = r8.f288559f
            r0.f299776j = r8
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r8 = com.tencent.p014mm.network.C114786m0.m161568a(r8)
            if (r8 == 0) goto L_0x0326
            r8 = 1
            goto L_0x0327
        L_0x0326:
            r8 = 2
        L_0x0327:
            r0.f299781q = r8
            r0.f299782r = r4
            r0.f299777n = r7
            te3.qv3 r8 = new te3.qv3
            r8.<init>()
            byte[] r12 = new byte[r7]
            r8.mo73350k(r12)
            r0.f299778o = r8
            te3.qv3 r8 = new te3.qv3
            r8.<init>()
            byte[] r12 = new byte[r7]
            r8.mo73350k(r12)
            r0.f299775i = r8
            java.lang.String r8 = r1.f288620g
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x035e
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            java.lang.String r12 = r1.f288619f
            java.lang.String r8 = r8.mo137728q(r12)
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106456q(r8)
            r1.f288620g = r8
            goto L_0x0360
        L_0x035e:
            java.lang.String r8 = r1.f288620g
        L_0x0360:
            r0.f299746E = r8
            java.lang.Class<oo.h> r8 = p215oo.C77032h.class
            hd0.n0 r12 = r1.f288624n
            java.lang.String r12 = r12.f288542J
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0377
            hd0.n0 r10 = r1.f288624n
            java.lang.String r10 = r10.f288542J
            java.lang.String r10 = eb0.C75569c4.m90680m(r10)
            goto L_0x03c4
        L_0x0377:
            hd0.n0 r12 = r1.f288624n
            long r13 = r12.f288541I
            r15 = 0
            int r19 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r19 == 0) goto L_0x03ac
            k40.a r12 = f40.C86709a0.m107533q(r2)     // Catch:{ all -> 0x03aa }
            f62.k0 r12 = (f62.C75700k0) r12     // Catch:{ all -> 0x03aa }
            g62.l r12 = r12.mo96095LE()     // Catch:{ all -> 0x03aa }
            hd0.n0 r13 = r1.f288624n     // Catch:{ all -> 0x03aa }
            long r13 = r13.f288541I     // Catch:{ all -> 0x03aa }
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12     // Catch:{ all -> 0x03aa }
            com.tencent.mm.storage.f4 r12 = r12.b00(r13)     // Catch:{ all -> 0x03aa }
            java.lang.String r12 = r12.f230724G     // Catch:{ all -> 0x03aa }
            java.lang.String r12 = eb0.C75569c4.m90685r(r12)     // Catch:{ all -> 0x03aa }
            java.lang.String r10 = eb0.C75569c4.m90680m(r12)     // Catch:{ all -> 0x03aa }
            java.lang.String r12 = "alnode"
            java.lang.String r13 = eb0.C75569c4.m90655A(r4)     // Catch:{ all -> 0x03aa }
            java.lang.String r10 = eb0.C75569c4.m90669b(r10, r12, r13)     // Catch:{ all -> 0x03aa }
            goto L_0x03c4
        L_0x03aa:
            goto L_0x03c4
        L_0x03ac:
            java.lang.String r10 = r12.mo137702f()
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
            java.lang.Class<gw.k> r12 = p159gw.C98252k.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            gw.k r12 = (p159gw.C98252k) r12
            java.lang.String r10 = r12.pc0(r10)
            java.lang.String r10 = eb0.C75569c4.m90680m(r10)
        L_0x03c4:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r12 == 0) goto L_0x03ce
            java.lang.String r10 = eb0.C75569c4.m90679l()
        L_0x03ce:
            hd0.n0 r12 = r1.f288624n
            long r12 = r12.f288541I
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0407
            k40.a r12 = f40.C86709a0.m107533q(r2)
            f62.k0 r12 = (f62.C75700k0) r12
            g62.l r12 = r12.mo96095LE()
            hd0.n0 r13 = r1.f288624n
            long r13 = r13.f288567n
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            com.tencent.mm.storage.f4 r12 = r12.b00(r13)
            di3.d r13 = di3.C86312j.m106911c(r8)
            oo.h r13 = (p215oo.C77032h) r13
            hd0.n0 r14 = r1.f288624n
            long r14 = r14.f288541I
            r13.mo107359RF(r12, r14)
            di3.d r8 = di3.C86312j.m106911c(r8)
            oo.h r8 = (p215oo.C77032h) r8
            hd0.n0 r12 = r1.f288624n
            long r12 = r12.f288541I
            java.lang.String r10 = r8.mo107360SR(r10, r12)
        L_0x0407:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "video msg source is %s"
            r8.append(r12)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            r0.f299784t = r10
            hd0.n0 r8 = r1.f288624n
            java.lang.String r10 = r8.f288536D
            r0.f299755N = r10
            te3.tc4 r8 = r8.f288535C
            if (r8 == 0) goto L_0x045d
            java.lang.String r10 = r8.f299537d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x045d
            java.lang.String r10 = r8.f299537d
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            r0.f299747F = r10
            int r10 = r8.f299538e
            r0.f299748G = r10
            java.lang.String r10 = r8.f299541h
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            r0.f299749H = r10
            java.lang.String r10 = r8.f299540g
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            r0.f299751J = r10
            java.lang.String r10 = r8.f299539f
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            r0.f299750I = r10
            java.lang.String r10 = r8.f299542i
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            r0.f299752K = r10
            goto L_0x0477
        L_0x045d:
            if (r8 == 0) goto L_0x0477
            java.lang.String r10 = r8.f299540g
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0477
            java.lang.String r10 = r8.f299539f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0477
            java.lang.String r10 = r8.f299540g
            r0.f299751J = r10
            java.lang.String r10 = r8.f299539f
            r0.f299750I = r10
        L_0x0477:
            java.lang.Class<f62.s0> r10 = f62.C75707s0.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            f62.s0 r10 = (f62.C75707s0) r10
            hd0.n0 r12 = r1.f288624n
            java.lang.String r12 = r12.mo137707k()
            boolean r10 = r10.mo96078pq(r12)
            if (r10 == 0) goto L_0x04a1
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            hd0.n0 r10 = r1.f288624n
            java.lang.String r10 = r10.mo137707k()
            java.lang.String r2 = r2.mo69662L3(r10)
            r0.f299764U = r2
        L_0x04a1:
            if (r8 == 0) goto L_0x04b3
            java.lang.String r2 = r8.f299543j
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r9)
            r0.f299754M = r2
            java.lang.String r2 = r8.f299544n
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r9)
            r0.f299753L = r2
        L_0x04b3:
            hd0.n0 r2 = r1.f288624n
            java.lang.String r2 = r2.mo137705i()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x04c6
            hd0.n0 r2 = r1.f288624n
            java.lang.String r9 = r2.mo137705i()
            goto L_0x04d8
        L_0x04c6:
            hd0.n0 r2 = r1.f288624n
            java.lang.String r2 = r2.f288543K
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x04d8
            hd0.n0 r2 = r1.f288624n
            java.lang.String r2 = r2.f288543K
            java.lang.String r9 = com.tencent.p014mm.modelimage.C80999a.m98902b(r2)
        L_0x04d8:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 != 0) goto L_0x0519
            hd0.n0 r2 = r1.f288624n
            java.lang.String r2 = r2.mo137705i()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x04fb
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r7] = r9
            java.lang.String r8 = "uploadVideo video.recvXml is empty and update: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r2)
            hd0.n0 r2 = r1.f288624n
            r2.f288575v = r9
            hd0.C98429r0.m127808N(r2)
        L_0x04fb:
            com.tencent.mm.modelimage.a r2 = com.tencent.p014mm.modelimage.C80999a.m98903c(r9)
            if (r2 == 0) goto L_0x0519
            java.lang.String r8 = r2.f237927a
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0519
            java.lang.String r8 = r2.f237927a
            r0.f299765V = r8
            java.lang.String r8 = r2.f237928b
            r0.f299768Y = r8
            java.lang.String r8 = r2.f237930d
            r0.f299767X = r8
            java.lang.String r2 = r2.f237929c
            r0.f299766W = r2
        L_0x0519:
            r2 = 10
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r8 = r0.f299779p
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r7] = r8
            int r8 = r0.f299774h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r5] = r8
            int r5 = r0.f299776j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r4] = r5
            int r4 = r0.f299783s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r2[r5] = r4
            java.lang.String r4 = r0.f299746E
            r2[r11] = r4
            r4 = 5
            java.lang.String r5 = r0.f299747F
            r2[r4] = r5
            r4 = 6
            int r5 = r0.f299748G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r4] = r5
            r4 = 7
            java.lang.String r5 = r0.f299749H
            r2[r4] = r5
            r4 = 8
            java.lang.String r5 = r0.f299752K
            r2[r4] = r5
            r4 = 9
            java.lang.String r5 = r0.f299765V
            r2[r4] = r5
            java.lang.String r4 = "upload video: play length %d, thumb totalLen %d, video totalLen %d, funcFlag %d, videoMd5: %s stream %s streamtime: %d title %s thumburl %s appId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r4, r2)
            hd0.n0 r2 = r1.f288624n
            int r2 = r2.f288562i
            java.lang.String r4 = " netOff:"
            java.lang.String r5 = " newOff:"
            java.lang.String r8 = " readlen:"
            java.lang.String r9 = "] read ret:"
            java.lang.String r10 = "]  Error "
            r11 = 32000(0x7d00, float:4.4842E-41)
            r12 = 103(0x67, float:1.44E-43)
            if (r2 != r12) goto L_0x0660
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r12 = r1.f288619f
            java.lang.String r2 = r2.mo137729r(r12)
            hd0.n0 r12 = r1.f288624n
            int r12 = r12.f288560g
            hd0.o0$$c r2 = hd0.C98410o0.m127732t(r2, r12, r11)
            int r11 = r2.f223071d
            java.lang.String r12 = "doScene READ THUMB["
            if (r11 < 0) goto L_0x062d
            int r11 = r2.f223069b
            if (r11 != 0) goto L_0x0599
            goto L_0x062d
        L_0x0599:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            java.lang.String r11 = r1.f288619f
            r10.append(r11)
            r10.append(r9)
            int r9 = r2.f223071d
            r10.append(r9)
            r10.append(r8)
            int r8 = r2.f223069b
            r10.append(r8)
            r10.append(r5)
            int r5 = r2.f223070c
            r10.append(r5)
            r10.append(r4)
            hd0.n0 r4 = r1.f288624n
            int r4 = r4.f288560g
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            int r4 = r2.f223070c
            hd0.n0 r5 = r1.f288624n
            int r5 = r5.f288560g
            if (r4 >= r5) goto L_0x0612
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Err doScene READ THUMB["
            r0.append(r4)
            java.lang.String r4 = r1.f288619f
            r0.append(r4)
            java.lang.String r4 = "] newOff:"
            r0.append(r4)
            int r2 = r2.f223070c
            r0.append(r2)
            java.lang.String r2 = " OldtOff:"
            r0.append(r2)
            hd0.n0 r2 = r1.f288624n
            int r2 = r2.f288560g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x0612:
            int r3 = r2.f223069b
            byte[] r4 = new byte[r3]
            byte[] r2 = r2.f223068a
            java.lang.System.arraycopy(r2, r7, r4, r7, r3)
            hd0.n0 r2 = r1.f288624n
            int r2 = r2.f288560g
            r0.f299774h = r2
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            r2.mo73350k(r4)
            r0.f299775i = r2
            goto L_0x0755
        L_0x062d:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 111(0x6f, double:5.5E-322)
            r16 = 225(0xe1, double:1.11E-321)
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r2 = r1.f288619f
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x0660:
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r12 = r1.f288619f
            java.lang.String r2 = r2.mo137728q(r12)
            hd0.n0 r12 = r1.f288624n
            int r12 = r12.f288557d
            hd0.o0$$c r2 = hd0.C98410o0.m127732t(r2, r12, r11)
            int r11 = r2.f223071d
            java.lang.String r12 = "doScene READ VIDEO["
            if (r11 < 0) goto L_0x075e
            int r11 = r2.f223069b
            if (r11 != 0) goto L_0x067e
            goto L_0x075e
        L_0x067e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            java.lang.String r11 = r1.f288619f
            r10.append(r11)
            r10.append(r9)
            int r9 = r2.f223071d
            r10.append(r9)
            r10.append(r8)
            int r8 = r2.f223069b
            r10.append(r8)
            r10.append(r5)
            int r5 = r2.f223070c
            r10.append(r5)
            r10.append(r4)
            hd0.n0 r4 = r1.f288624n
            int r4 = r4.f288557d
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            int r4 = r2.f223070c
            hd0.n0 r5 = r1.f288624n
            int r5 = r5.f288557d
            if (r4 >= r5) goto L_0x06f7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Err doScene READ VIDEO["
            r0.append(r4)
            java.lang.String r4 = r1.f288619f
            r0.append(r4)
            java.lang.String r4 = "] newOff:"
            r0.append(r4)
            int r2 = r2.f223070c
            r0.append(r2)
            java.lang.String r2 = " OldtOff:"
            r0.append(r2)
            hd0.n0 r2 = r1.f288624n
            int r2 = r2.f288557d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x06f7:
            long r4 = (long) r4
            long r8 = hd0.C76152m.f223054l
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0738
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 111(0x6f, double:5.5E-322)
            r14 = 222(0xde, double:1.097E-321)
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Err doScene READ VIDEO["
            r0.append(r2)
            java.lang.String r2 = r1.f288619f
            r0.append(r2)
            java.lang.String r2 = "] maxsize:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x0738:
            int r3 = r2.f223069b
            byte[] r4 = new byte[r3]
            byte[] r2 = r2.f223068a
            java.lang.System.arraycopy(r2, r7, r4, r7, r3)
            hd0.n0 r2 = r1.f288624n
            int r3 = r2.f288557d
            r0.f299777n = r3
            int r2 = r2.f288560g
            r0.f299774h = r2
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            r2.mo73350k(r4)
            r0.f299778o = r2
        L_0x0755:
            ob0.c r0 = r1.f288618e
            r2 = r23
            int r0 = r1.dispatch(r2, r0, r1)
            return r0
        L_0x075e:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 111(0x6f, double:5.5E-322)
            r16 = 224(0xe0, double:1.107E-321)
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            java.lang.String r0 = r1.f288619f
            hd0.C98429r0.m127799E(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r2 = r1.f288619f
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        L_0x0791:
            if (r10 == 0) goto L_0x0796
            r10.close()     // Catch:{ IOException -> 0x0796 }
        L_0x0796:
            throw r0
        L_0x0797:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = r22.mo137749p1()
            r0[r7] = r2
            java.lang.String r2 = r1.f288619f
            r0[r5] = r2
            java.lang.String r2 = "%s Get info Failed file:"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r0)
            int r0 = p206nj.C76861g.m92658a()
            int r0 = r0 + 10000
            int r7 = r7 - r0
            r1.f288622i = r7
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98415q.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f288624n.f288567n, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public long getReturnTimeout() {
        return 1800000;
    }

    public int getType() {
        return 149;
    }

    public C98408n0 getVideoInfo() {
        return this.f288624n;
    }

    /* renamed from: k1 */
    public final int mo137744k1() {
        int i;
        int i2;
        String q = C98398h0.Bx0().mo137728q(this.f288624n.mo137700d());
        if (!C102016c.m134339a(q)) {
            Log.m105929w("MicroMsg.NetSceneUploadVideo", "%s check preload length but it not mp4.", mo137749p1());
            return 0;
        }
        C102015b bVar = new C102015b();
        long a = bVar.mo141510a(q);
        long j = bVar.f300397a;
        if (a < 131072 && a > 0 && (i2 = this.f288624n.f288566m) > 5) {
            long j2 = bVar.f300398b;
            if (j2 > 0 && j > 0) {
                i = ((int) j) + ((int) ((j2 * 5) / ((long) i2)));
                if (i <= 131072) {
                    i += 131072;
                }
                Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", mo137749p1(), Integer.valueOf(i), Long.valueOf(a), Long.valueOf(j), Integer.valueOf(this.f288624n.f288566m), Long.valueOf(bVar.f300398b));
                return i;
            }
        }
        i = 0;
        Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", mo137749p1(), Integer.valueOf(i), Long.valueOf(a), Long.valueOf(j), Integer.valueOf(this.f288624n.f288566m), Long.valueOf(bVar.f300398b));
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018f  */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo137745l1() {
        /*
            r26 = this;
            r1 = r26
            java.lang.Class<qo.l> r2 = p663qo.C101213l.class
            hd0.n0 r0 = r1.f288624n
            java.lang.String r0 = r0.mo137707k()
            boolean r3 = eb0.C45628s0.m50751P(r0)
            java.lang.String r4 = "MicroMsg.NetSceneUploadVideo"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = r26.mo137749p1()
            r2[r7] = r3
            r2[r6] = r0
            java.lang.String r0 = "%s cdntra not use cdn user:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r2)
            return r7
        L_0x0025:
            boolean r3 = fd3.C32025c.m39609a()
            if (r3 != 0) goto L_0x0032
            java.lang.String r0 = "isAllow2UseCdnWithXLab = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return r7
        L_0x0032:
            di3.d r3 = di3.C86312j.m106911c(r2)
            qo.l r3 = (p663qo.C101213l) r3
            boolean r3 = r3.dm0(r5)
            r8 = 3
            if (r3 != 0) goto L_0x006d
            hd0.n0 r3 = r1.f288624n
            int r3 = r3.f288573t
            if (r3 == r6) goto L_0x006d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r26.mo137749p1()
            r0[r7] = r3
            di3.d r2 = di3.C86312j.m106911c(r2)
            qo.l r2 = (p663qo.C101213l) r2
            boolean r2 = r2.dm0(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0[r6] = r2
            hd0.n0 r2 = r1.f288624n
            int r2 = r2.f288573t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "%s cdntra not use cdn flag:%b getCdnInfo:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r0)
            return r7
        L_0x006d:
            boolean r3 = hd0.C98429r0.m127831v()
            java.lang.String r9 = ".msg.videomsg.$aeskey"
            java.lang.String r10 = ".msg.videomsg.$cdnvideourl"
            java.lang.String r11 = "msg"
            java.lang.String r12 = "%s cdntra genClientId failed not use cdn file:%s"
            java.lang.String r13 = ""
            java.lang.String r14 = "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
            if (r3 != 0) goto L_0x0084
        L_0x0080:
            r8 = r9
        L_0x0081:
            r3 = 0
            goto L_0x0186
        L_0x0084:
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137707k()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85809L5(r3)
            if (r3 != 0) goto L_0x00a3
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137707k()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85807K5(r3)
            if (r3 != 0) goto L_0x00a3
            java.lang.String r3 = "is not c2c scene, do not go thumbFirst process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x0080
        L_0x00a3:
            hd0.n0 r3 = r1.f288624n
            r17 = r9
            long r8 = r3.f288563j
            java.lang.String r3 = r3.mo137707k()
            hd0.n0 r15 = r1.f288624n
            java.lang.String r15 = r15.mo137700d()
            java.lang.String r6 = "upimgthumb"
            java.lang.String r3 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r6, r8, r3, r15)
            r1.f288628r = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00d9
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r6 = r26.mo137749p1()
            r3[r7] = r6
            hd0.n0 r6 = r1.f288624n
            java.lang.String r6 = r6.mo137700d()
            r8 = 1
            r3[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r12, r3)
        L_0x00d6:
            r8 = r17
            goto L_0x0081
        L_0x00d9:
            hd0.o0 r3 = hd0.C98398h0.Bx0()
            java.lang.String r6 = r1.f288619f
            java.lang.String r3 = r3.mo137729r(r6)
            gi.g r6 = new gi.g
            r6.<init>()
            java.lang.String r8 = "task_NetSceneUploadVideo_2"
            r6.f287660d = r8
            gi.g$a r8 = r1.f288635y
            r6.f287662f = r8
            java.lang.String r8 = r1.f288628r
            r6.field_mediaId = r8
            r6.field_fullpath = r3
            java.lang.String r3 = r1.mo137746m1(r3)
            r6.field_thumbpath = r3
            r3 = 3
            r6.field_fileType = r3
            r6.field_enable_hitcheck = r7
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137707k()
            r6.field_talker = r3
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137707k()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85807K5(r3)
            r6.field_chattype = r3
            r6.field_priority = r5
            r6.field_needStorage = r7
            r6.field_isStreamMedia = r7
            r3 = 1
            r6.field_trysafecdn = r3
            java.lang.String r8 = r6.field_thumbpath
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            int r9 = (int) r8
            r8 = 5242880(0x500000, float:7.34684E-39)
            if (r9 < r8) goto L_0x0141
            r8 = 3
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r8 = r26.mo137749p1()
            r15[r7] = r8
            java.lang.String r6 = r6.field_thumbpath
            r15[r3] = r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r15[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r14, r15)
            goto L_0x00d6
        L_0x0141:
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137705i()
            r8 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r11, r8)
            if (r3 == 0) goto L_0x0161
            java.lang.Object r8 = r3.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            r6.field_fileId = r8
            r8 = r17
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            r6.field_aesKey = r3
            goto L_0x0163
        L_0x0161:
            r8 = r17
        L_0x0163:
            java.lang.String r3 = r6.field_aesKey
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0173
            java.lang.String r3 = r6.field_aesKey
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0177
        L_0x0173:
            r6.field_aesKey = r13
            r6.field_fileId = r13
        L_0x0177:
            di3.d r3 = di3.C86312j.m106911c(r2)
            qo.l r3 = (p663qo.C101213l) r3
            boolean r3 = r3.if0(r6)
            if (r3 != 0) goto L_0x0185
            goto L_0x0081
        L_0x0185:
            r3 = 1
        L_0x0186:
            if (r3 == 0) goto L_0x018f
            java.lang.String r0 = "go place holder video process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x018d:
            r2 = 1
            return r2
        L_0x018f:
            boolean r3 = hd0.C98429r0.m127830u()
            if (r3 != 0) goto L_0x0198
            r17 = r8
            goto L_0x020c
        L_0x0198:
            hd0.o0 r3 = hd0.C98398h0.Bx0()
            java.lang.String r6 = r1.f288619f
            java.lang.String r3 = r3.mo137729r(r6)
            java.lang.String r3 = r1.mo137746m1(r3)
            long r18 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            r17 = r8
            r6 = 5242880(0x500000, float:7.34684E-39)
            long r7 = (long) r6
            int r6 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x01cb
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = r26.mo137749p1()
            r8 = 0
            r7[r8] = r6
            r6 = 1
            r7[r6] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r7[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r14, r7)
        L_0x01c9:
            r7 = 0
            goto L_0x020c
        L_0x01cb:
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137707k()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85809L5(r3)
            if (r3 != 0) goto L_0x01ea
            hd0.n0 r3 = r1.f288624n
            java.lang.String r3 = r3.mo137707k()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85807K5(r3)
            if (r3 != 0) goto L_0x01ea
            java.lang.String r3 = "is not c2c scene, do not go origin video process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x01c9
        L_0x01ea:
            com.tencent.mm.modelimage.q0 r3 = com.tencent.p014mm.modelimage.C92855q0.m117113f()
            java.lang.String r6 = r1.f288619f
            r3.f267460C = r6
            r6 = 0
            r3.f267461D = r6
            boolean r6 = r1.f288627q
            r3.f267466I = r6
            hd0.s r6 = new hd0.s
            r6.<init>(r1)
            r3.f267463F = r6
            r6 = 20
            r3.f295194h = r6
            pc0.a0$b r3 = r3.mo140195a()
            r3.mo123694a()
            r7 = 1
        L_0x020c:
            if (r7 == 0) goto L_0x0215
            java.lang.String r0 = "go origin video process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x018d
        L_0x0215:
            hd0.n0 r3 = r1.f288624n
            long r6 = r3.f288563j
            java.lang.String r3 = r3.mo137700d()
            java.lang.String r8 = "upvideo"
            java.lang.String r3 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r8, r6, r0, r3)
            r1.f288628r = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0242
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r26.mo137749p1()
            r3 = 0
            r0[r3] = r2
            hd0.n0 r2 = r1.f288624n
            java.lang.String r2 = r2.mo137700d()
            r5 = 1
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r12, r0)
            return r3
        L_0x0242:
            hd0.o0 r3 = hd0.C98398h0.Bx0()
            java.lang.String r6 = r1.f288619f
            java.lang.String r3 = r3.mo137729r(r6)
            hd0.o0 r6 = hd0.C98398h0.Bx0()
            java.lang.String r7 = r1.f288619f
            java.lang.String r6 = r6.mo137728q(r7)
            gi.g r7 = new gi.g
            r7.<init>()
            java.lang.String r8 = "task_NetSceneUploadVideo_1"
            r7.f287660d = r8
            gi.g$a r8 = r1.f288614A
            r7.f287662f = r8
            java.lang.String r8 = r1.f288628r
            r7.field_mediaId = r8
            r7.field_fullpath = r6
            java.lang.String r3 = r1.mo137746m1(r3)
            r7.field_thumbpath = r3
            r3 = 4
            r7.field_fileType = r3
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85812O4(r8)
            if (r8 == 0) goto L_0x0283
            r8 = 0
            r7.field_sendmsg_viacdn = r8
            goto L_0x0299
        L_0x0283:
            boolean r8 = com.tencent.p014mm.pluginsdk.model.C30680l1.m39150b(r6)
            if (r8 == 0) goto L_0x0299
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 106(0x6a, double:5.24E-322)
            r21 = 30
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            r8 = 1
            r7.field_use_multithread = r8
        L_0x0299:
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137707k()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85812O4(r8)
            if (r8 != 0) goto L_0x02ab
            boolean r8 = r1.f288627q
            if (r8 == 0) goto L_0x02ab
            r8 = 1
            goto L_0x02ac
        L_0x02ab:
            r8 = 0
        L_0x02ac:
            r7.field_enable_hitcheck = r8
            xb0.h r8 = xb0.C102609h.Fx0()
            boolean r8 = r8.zx0(r6)
            r7.field_largesvideo = r8
            hd0.n0 r8 = r1.f288624n
            if (r8 == 0) goto L_0x02c5
            int r8 = r8.f288576w
            r12 = 3
            if (r12 != r8) goto L_0x02c6
            r8 = 1
            r7.field_smallVideoFlag = r8
            goto L_0x02c6
        L_0x02c5:
            r12 = 3
        L_0x02c6:
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.String r12 = r26.mo137749p1()
            r9 = 0
            r8[r9] = r12
            hd0.n0 r12 = r1.f288624n
            te3.gu2 r12 = r12.f288538F
            if (r12 != 0) goto L_0x02d7
            r12 = 1
            goto L_0x02d8
        L_0x02d7:
            r12 = 0
        L_0x02d8:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r15 = 1
            r8[r15] = r12
            java.lang.String r12 = r1.f288619f
            r8[r5] = r12
            java.lang.String r12 = "%s upload video MMSightExtInfo is null? %b %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r8)
            hd0.n0 r8 = r1.f288624n
            te3.gu2 r8 = r8.f288538F
            if (r8 == 0) goto L_0x0313
            boolean r8 = r8.f298309e
            if (r8 == 0) goto L_0x0313
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r8 = r26.mo137749p1()
            r9 = 0
            r12[r9] = r8
            java.lang.String r8 = "%s local capture video, mark use large video"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r12)
            xb0.h r8 = xb0.C102609h.Fx0()
            xb0.h r12 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r12 = r12.mo142236Xa()
            int r8 = r8.xx0(r12)
            r7.field_largesvideo = r8
        L_0x0313:
            hd0.e0 r18 = hd0.C98394e0.vx0()
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            java.lang.String r12 = r1.f288619f
            java.lang.String r20 = r8.mo137728q(r12)
            hd0.n0 r8 = r1.f288624n
            java.lang.String r21 = r8.mo137707k()
            r24 = 2
            r25 = 2
            java.lang.String r19 = ""
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            r18.wx0(r19, r20, r21, r22, r23, r24, r25)
            r8 = 3
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r8 = r26.mo137749p1()
            r9 = 0
            r12[r9] = r8
            hd0.n0 r8 = r1.f288624n
            java.lang.String r8 = r8.mo137700d()
            r15 = 1
            r12[r15] = r8
            hd0.n0 r8 = r1.f288624n
            te3.tc4 r8 = r8.f288535C
            if (r8 != 0) goto L_0x0351
            java.lang.String r8 = "null"
            goto L_0x0353
        L_0x0351:
            java.lang.String r8 = r8.f299543j
        L_0x0353:
            r12[r5] = r8
            java.lang.String r8 = "%s checkAD file:%s adinfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r12)
            hd0.n0 r8 = r1.f288624n
            te3.tc4 r8 = r8.f288535C
            if (r8 == 0) goto L_0x036b
            java.lang.String r8 = r8.f299543j
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x036b
            r8 = 1
            r7.field_advideoflag = r8
        L_0x036b:
            r7.field_talker = r0
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            r7.field_chattype = r0
            r7.field_priority = r5
            r8 = 0
            r7.field_needStorage = r8
            r7.field_isStreamMedia = r8
            r9 = 1
            r7.field_trysafecdn = r9
            java.lang.String r0 = r7.field_fullpath
            com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            java.lang.String r0 = r7.field_thumbpath
            r12 = r4
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r0 = (int) r3
            r1.f288633w = r0
            r3 = 5242880(0x500000, float:7.34684E-39)
            if (r0 < r3) goto L_0x03aa
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = r26.mo137749p1()
            r0[r8] = r2
            java.lang.String r2 = r7.field_thumbpath
            r3 = 1
            r0[r3] = r2
            int r2 = r1.f288633w
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r14, r0)
            return r8
        L_0x03aa:
            hd0.n0 r0 = r1.f288624n
            java.lang.String r0 = r0.mo137705i()
            r3 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r11, r3)
            r4 = 5
            r8 = 6
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r3 = r0.get(r10)
            java.lang.String r3 = (java.lang.String) r3
            r7.field_fileId = r3
            r3 = r17
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r7.field_aesKey = r0
            r10 = 1
            r1.f288632v = r10
            goto L_0x04c9
        L_0x03d0:
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r10 = r26.mo137749p1()
            r9 = 0
            r0[r9] = r10
            java.lang.String r10 = "%s cdntra parse video recv xml failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r0)
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x04b9 }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x04b9 }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r10 = "UseVideoHash"
            java.lang.String r0 = r0.mo107405c(r10)     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r10 = ","
            java.lang.String[] r10 = r0.split(r10)     // Catch:{ Exception -> 0x04b9 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x04b9 }
            f40.e r11 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x04b9 }
            int r11 = r11.mo121110g()     // Catch:{ Exception -> 0x04b9 }
            r14 = 100
            int r11 = p823sg.C101615j.m133462b(r11, r14)     // Catch:{ Exception -> 0x04b9 }
            if (r10 == 0) goto L_0x041d
            int r14 = r10.length     // Catch:{ Exception -> 0x04b9 }
            r3 = 1
            if (r14 < r3) goto L_0x041d
            r3 = 0
            r9 = r10[r3]     // Catch:{ Exception -> 0x04b9 }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r3)     // Catch:{ Exception -> 0x04b9 }
            if (r14 < r11) goto L_0x041d
            r3 = 1
            goto L_0x041e
        L_0x041d:
            r3 = 0
        L_0x041e:
            if (r10 == 0) goto L_0x0430
            int r14 = r10.length     // Catch:{ Exception -> 0x04b9 }
            if (r14 < r5) goto L_0x0430
            r14 = 1
            r9 = r10[r14]     // Catch:{ Exception -> 0x04b9 }
            r14 = 0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r14)     // Catch:{ Exception -> 0x04b9 }
            r14 = r9
            if (r14 < r11) goto L_0x0430
            r14 = 1
            goto L_0x0431
        L_0x0430:
            r14 = 0
        L_0x0431:
            if (r10 == 0) goto L_0x0443
            int r9 = r10.length     // Catch:{ Exception -> 0x04b9 }
            r15 = 3
            if (r9 < r15) goto L_0x0443
            r9 = r10[r5]     // Catch:{ Exception -> 0x04b9 }
            r15 = 0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r15)     // Catch:{ Exception -> 0x04b9 }
            r15 = r9
            if (r15 < r11) goto L_0x0443
            r11 = 1
            goto L_0x0444
        L_0x0443:
            r11 = 0
        L_0x0444:
            boolean r15 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x04b9 }
            if (r15 == 0) goto L_0x044d
            r3 = 1
            r11 = 1
            r14 = 1
        L_0x044d:
            if (r3 == 0) goto L_0x045f
            hd0.o0 r15 = hd0.C98398h0.Bx0()     // Catch:{ Exception -> 0x04b9 }
            r10 = r10[r5]     // Catch:{ Exception -> 0x04b9 }
            r9 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r9)     // Catch:{ Exception -> 0x04b9 }
            java.lang.String[] r15 = r15.mo137721g(r6, r10)     // Catch:{ Exception -> 0x04b9 }
            goto L_0x0460
        L_0x045f:
            r15 = 0
        L_0x0460:
            if (r14 == 0) goto L_0x0473
            if (r15 == 0) goto L_0x0473
            int r6 = r15.length     // Catch:{ Exception -> 0x04b9 }
            if (r6 != r5) goto L_0x0473
            r6 = 0
            r10 = r15[r6]     // Catch:{ Exception -> 0x04b9 }
            r7.field_fileId = r10     // Catch:{ Exception -> 0x04b9 }
            r6 = 1
            r10 = r15[r6]     // Catch:{ Exception -> 0x04b9 }
            r7.field_aesKey = r10     // Catch:{ Exception -> 0x04b9 }
            r1.f288631u = r6     // Catch:{ Exception -> 0x04b9 }
        L_0x0473:
            java.lang.String r6 = "%s CheckUseVideoHash debug:%s str:%s [%s,%s,%s] hasHash:%s [%s,%s]"
            r10 = 9
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x04b9 }
            java.lang.String r15 = r26.mo137749p1()     // Catch:{ Exception -> 0x04b9 }
            r9 = 0
            r10[r9] = r15     // Catch:{ Exception -> 0x04b9 }
            boolean r15 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x04b9 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch:{ Exception -> 0x04b9 }
            r16 = 1
            r10[r16] = r15     // Catch:{ Exception -> 0x04b9 }
            r10[r5] = r0     // Catch:{ Exception -> 0x04b9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x04b9 }
            r3 = 3
            r10[r3] = r0     // Catch:{ Exception -> 0x04b9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ Exception -> 0x04b9 }
            r3 = 4
            r10[r3] = r0     // Catch:{ Exception -> 0x04b9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x04b9 }
            r10[r4] = r0     // Catch:{ Exception -> 0x04b9 }
            boolean r0 = r1.f288631u     // Catch:{ Exception -> 0x04b9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x04b9 }
            r10[r8] = r0     // Catch:{ Exception -> 0x04b9 }
            r0 = 7
            java.lang.String r3 = r7.field_fileId     // Catch:{ Exception -> 0x04b9 }
            r10[r0] = r3     // Catch:{ Exception -> 0x04b9 }
            r0 = 8
            java.lang.String r3 = r7.field_aesKey     // Catch:{ Exception -> 0x04b9 }
            r10[r0] = r3     // Catch:{ Exception -> 0x04b9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r10)     // Catch:{ Exception -> 0x04b9 }
            goto L_0x04c9
        L_0x04b9:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r3 = 0
            r6[r3] = r0
            java.lang.String r0 = "Check use videohash :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r6)
        L_0x04c9:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 12696(0x3198, float:1.7791E-41)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            boolean r10 = r1.f288631u
            if (r10 == 0) goto L_0x04d5
            r10 = 1
            goto L_0x04dc
        L_0x04d5:
            boolean r10 = r1.f288632v
            if (r10 == 0) goto L_0x04db
            r10 = 2
            goto L_0x04dc
        L_0x04db:
            r10 = 0
        L_0x04dc:
            int r10 = r10 + 700
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9 = 0
            r6[r9] = r10
            hd0.n0 r10 = r1.f288624n
            int r10 = r10.f288559f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r6[r11] = r10
            r0.mo160131h(r3, r6)
            java.lang.String r3 = r7.field_aesKey
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0503
            java.lang.String r3 = r7.field_aesKey
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0515
        L_0x0503:
            r7.field_aesKey = r13
            r7.field_fileId = r13
            java.lang.Class<qo.h> r3 = p663qo.C101211h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            qo.h r3 = (p663qo.C101211h) r3
            java.lang.String r3 = r3.mo140293rN()
            r7.field_aesKey = r3
        L_0x0515:
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r6 = r26.mo137749p1()
            r8 = 0
            r3[r8] = r6
            java.lang.String r6 = r7.field_mediaId
            r8 = 1
            r3[r8] = r6
            java.lang.String r6 = r7.field_fileId
            r3[r5] = r6
            java.lang.String r5 = r7.field_aesKey
            r6 = 3
            r3[r6] = r5
            boolean r5 = r1.f288627q
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 4
            r3[r6] = r5
            int r5 = r7.field_largesvideo
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r4 = "%s summersafecdn check hit cache VideoHash :%s %s %s %b %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            di3.d r2 = di3.C86312j.m106911c(r2)
            qo.l r2 = (p663qo.C101213l) r2
            boolean r2 = r2.if0(r7)
            if (r2 != 0) goto L_0x056d
            r19 = 111(0x6f, double:5.5E-322)
            r21 = 226(0xe2, double:1.117E-321)
            r23 = 1
            r25 = 0
            r18 = r0
            r18.idkeyStat(r19, r21, r23, r25)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r26.mo137749p1()
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "%s cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r0)
            r1.f288628r = r13
            return r3
        L_0x056d:
            hd0.n0 r0 = r1.f288624n
            int r2 = r0.f288573t
            r3 = 1
            if (r2 == r3) goto L_0x0586
            r0.f288573t = r3
            r2 = 104(0x68, float:1.46E-43)
            r0.f288562i = r2
            java.lang.String r2 = r1.f288628r
            r0.f288555b = r2
            r2 = 524544(0x80100, float:7.35043E-40)
            r0.f288548P = r2
            hd0.C98429r0.m127808N(r0)
        L_0x0586:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98415q.mo137745l1():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7 A[SYNTHETIC, Splitter:B:33:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe A[SYNTHETIC, Splitter:B:37:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0118 A[SYNTHETIC, Splitter:B:48:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011f A[SYNTHETIC, Splitter:B:52:0x011f] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016c A[SYNTHETIC, Splitter:B:64:0x016c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0173 A[SYNTHETIC, Splitter:B:68:0x0173] */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo137746m1(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r17
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r1)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r0 = r2.mo119974l()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "send"
            r4.append(r5)
            java.lang.String r5 = r2.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>((com.tencent.p014mm.vfs.C86009m1) r0, (java.lang.String) r4)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            long r5 = r2.mo119980r()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "MicroMsg.NetSceneUploadVideo"
            java.lang.String r7 = "getSendThumbnailPath:origin file: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r0)
            r7 = 0
            long r8 = r2.mo119980r()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f3
            boolean r0 = r3.mo119967g()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "dst file %s exist!"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r9 = r3.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8[r6] = r9     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r8)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8 = r7
            r0 = 1
            goto L_0x00f5
        L_0x005e:
            java.lang.String r0 = r2.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r0)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r8 = "getSendThumbnailPath:options %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r10 = "null"
            goto L_0x008d
        L_0x0070:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10.<init>()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r11 = ""
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            int r11 = r0.outWidth     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r11 = "-"
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            int r11 = r0.outHeight     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10.append(r11)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
        L_0x008d:
            r9[r6] = r10     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r9)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8 = 288(0x120, float:4.04E-43)
            if (r0 == 0) goto L_0x00cd
            int r9 = r0.outWidth     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r9 > r8) goto L_0x009e
            int r0 = r0.outHeight     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            if (r0 <= r8) goto L_0x00cd
        L_0x009e:
            java.lang.String r9 = r2.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r10 = 288(0x120, float:4.04E-43)
            r11 = 288(0x120, float:4.04E-43)
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r13 = 60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r0.<init>()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            com.tencent.mm.vfs.m1 r8 = r3.mo119974l()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r8 = r8.mo119971i()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r0.append(r8)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r8 = "/"
            r0.append(r8)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r14 = r0.toString()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            java.lang.String r15 = r3.getName()     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r9, (int) r10, (int) r11, (android.graphics.Bitmap.CompressFormat) r12, (int) r13, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r8 = r7
            goto L_0x00f5
        L_0x00cd:
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106422D(r2)     // Catch:{ Exception -> 0x0107, all -> 0x0104 }
            r0 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r9, r0, r8, r8)     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            if (r0 == 0) goto L_0x00e7
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r3)     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            r10 = 60
            boolean r0 = r0.compress(r8, r10, r7)     // Catch:{ Exception -> 0x00ef, all -> 0x00ea }
            r8 = r7
            r7 = r9
            goto L_0x00f5
        L_0x00e7:
            r8 = r7
            r7 = r9
            goto L_0x00f4
        L_0x00ea:
            r0 = move-exception
            r8 = r7
            r7 = r9
            goto L_0x016a
        L_0x00ef:
            r0 = move-exception
            r8 = r7
            r7 = r9
            goto L_0x0109
        L_0x00f3:
            r8 = r7
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r7 == 0) goto L_0x00fc
            r7.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            if (r8 == 0) goto L_0x0125
            r8.close()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0125
        L_0x0102:
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r8 = r7
            goto L_0x016a
        L_0x0107:
            r0 = move-exception
            r8 = r7
        L_0x0109:
            java.lang.String r9 = "exception: %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0169 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0169 }
            r10[r6] = r0     // Catch:{ all -> 0x0169 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r9, r10)     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x011d
            r7.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            if (r8 == 0) goto L_0x0124
            r8.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0124
        L_0x0123:
        L_0x0124:
            r0 = 0
        L_0x0125:
            r7 = 2
            r8 = 3
            if (r0 == 0) goto L_0x014b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = r16.mo137749p1()
            r0[r6] = r1
            long r1 = r3.mo119980r()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = r3.mo119971i()
            r0[r7] = r1
            java.lang.String r1 = "%s compress success: length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            java.lang.String r0 = r3.mo119971i()
            return r0
        L_0x014b:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r16.mo137749p1()
            r0[r6] = r3
            long r8 = r2.mo119980r()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r0[r4] = r3
            java.lang.String r2 = r2.mo119971i()
            r0[r7] = r2
            java.lang.String r2 = "%s compress fail: origin length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            return r1
        L_0x0169:
            r0 = move-exception
        L_0x016a:
            if (r7 == 0) goto L_0x0171
            r7.close()     // Catch:{ IOException -> 0x0170 }
            goto L_0x0171
        L_0x0170:
        L_0x0171:
            if (r8 == 0) goto L_0x0176
            r8.close()     // Catch:{ IOException -> 0x0176 }
        L_0x0176:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98415q.mo137746m1(java.lang.String):java.lang.String");
    }

    /* renamed from: n1 */
    public final void mo137747n1(C98408n0 n0Var, C98121d dVar) {
        C102479b bVar;
        Class cls = C102704b.class;
        n0Var.f288564k = Util.nowSecond();
        n0Var.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        n0Var.f288548P = 2098436;
        C98429r0.m127808N(n0Var);
        C98692n.f289404a.mo138102c(this.f288619f);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f288624n.f288567n);
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) != 1) {
            z = false;
        }
        this.f288617d.onSceneEnd(0, 0, "", this);
        mo137748o1(dVar);
        if (z && dVar != null) {
            String q = C98398h0.Bx0().mo137728q(this.f288619f);
            String r = C98398h0.Bx0().mo137729r(this.f288619f);
            if (C86013q1.m106450k(q)) {
                if (Util.isNullOrNil(n0Var.mo137702f())) {
                    String q2 = C86013q1.m106456q(r);
                    bVar = ((C102704b) C86312j.m106911c(cls)).mo138751as(q, b002.getType(), dVar.field_filemd5, (byte[]) null);
                    C102479b as = ((C102704b) C86312j.m106911c(cls)).mo138751as(r, b002.getType(), q2, (byte[]) null);
                    Log.m105924i("MicroMsg.NetSceneUploadVideo", "check video thumb dup, fileName = " + this.f288619f + " result = " + as.f301760a);
                } else {
                    bVar = ((C102704b) C86312j.m106911c(cls)).mo138752mP(this.f288624n.mo137702f(), q, r, b002.getType(), this.f288624n.f288566m, C86013q1.m106456q(this.f288624n.mo137702f()));
                }
                Log.m105924i("MicroMsg.NetSceneUploadVideo", "check video dup, fileName = " + this.f288619f + " result = " + bVar.f301760a);
            }
        }
    }

    /* renamed from: o1 */
    public final void mo137748o1(C98121d dVar) {
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f288624n.f288567n);
        C98394e0.vx0().yx0(dVar, C98398h0.Bx0().mo137728q(this.f288619f), !Util.isNullOrNil(this.f288624n.f288542J) ? this.f288624n.f288542J : C75569c4.m90685r(b002.f230724G), b002.mo108774y2());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03ab, code lost:
        r4 = ((f62.C75700k0) f40.C86709a0.m107533q(r4)).mo96097Ni().get(r0.f288624n.mo137707k());
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0363  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r24, int r25, int r26, java.lang.String r27, com.tencent.p014mm.network.C114799u r28, byte[] r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "cdntra onGYNetEnd errtype:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = " errcode:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " useCdnTransClientId:"
            r5.append(r6)
            java.lang.String r6 = r0.f288628r
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.NetSceneUploadVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.lang.Class<oo.h> r5 = p215oo.C77032h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            oo.h r5 = (p215oo.C77032h) r5
            r5.mo107357DR()
            boolean r5 = r0.f288623j
            java.lang.String r7 = " user:"
            if (r5 == 0) goto L_0x006c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onGYNetEnd Call Stop by Service   file:"
            r4.append(r5)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x006c:
            r5 = r28
            ob0.c r5 = (ob0.C47350c) r5
            ob0.c$d r8 = r5.f127056b
            pe3.a r8 = r8.f127083a
            te3.xn4 r8 = (te3.xn4) r8
            ob0.c$c r5 = r5.f127055a
            pe3.a r5 = r5.f127080a
            te3.wn4 r5 = (te3.wn4) r5
            r9 = 4
            if (r8 == 0) goto L_0x0092
            if (r1 == r9) goto L_0x0085
            if (r1 != 0) goto L_0x0092
            if (r2 != 0) goto L_0x0092
        L_0x0085:
            java.lang.Class<f62.s0> r10 = f62.C75707s0.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            f62.s0 r10 = (f62.C75707s0) r10
            int r11 = r8.f144768n
            r10.mo96077Vq(r11)
        L_0x0092:
            r10 = 3
            r11 = 1
            r12 = 0
            if (r1 != r10) goto L_0x00ae
            r10 = -1
            if (r2 != r10) goto L_0x00ae
            java.lang.String r10 = r0.f288628r
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x00ae
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = r0.f288628r
            r1[r12] = r2
            java.lang.String r2 = "cdntra using cdn trans,  wait cdn service callback! clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r1)
            return
        L_0x00ae:
            java.lang.String r10 = r0.f288619f
            hd0.n0 r10 = hd0.C98429r0.m127818i(r10)
            r0.f288624n = r10
            if (r10 != 0) goto L_0x00dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERR: onGYNetEnd Get INFO FAILED :"
            r4.append(r5)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            int r4 = p206nj.C76861g.m92658a()
            int r12 = r12 - r4
            int r12 = r12 + -10000
            r0.f288622i = r12
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x00dd:
            int r10 = r10.f288562i
            r13 = 105(0x69, float:1.47E-43)
            java.lang.String r14 = "] "
            java.lang.String r15 = ","
            if (r10 != r13) goto L_0x0129
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onGYNetEnd STATUS PAUSE ["
            r4.append(r5)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r15)
            hd0.n0 r5 = r0.f288624n
            long r7 = r5.f288556c
            r4.append(r7)
            r4.append(r15)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137701e()
            r4.append(r5)
            r4.append(r15)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0129:
            r13 = 103(0x67, float:1.44E-43)
            r11 = 104(0x68, float:1.46E-43)
            if (r10 == r11) goto L_0x017e
            if (r10 == r13) goto L_0x017e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERR: onGYNetEnd STATUS ERR: status:"
            r4.append(r5)
            hd0.n0 r5 = r0.f288624n
            int r5 = r5.f288562i
            r4.append(r5)
            java.lang.String r5 = " ["
            r4.append(r5)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r15)
            hd0.n0 r5 = r0.f288624n
            long r7 = r5.f288556c
            r4.append(r7)
            r4.append(r15)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137701e()
            r4.append(r5)
            r4.append(r15)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x017e:
            java.lang.String r10 = "  file:"
            java.lang.String r14 = " errCode:"
            if (r1 != r9) goto L_0x01c1
            r11 = -22
            if (r2 != r11) goto L_0x01c1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERR: onGYNetEnd BLACK  errtype:"
            r4.append(r5)
            r4.append(r1)
            r4.append(r14)
            r4.append(r2)
            r4.append(r10)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127798D(r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x01c1:
            if (r1 != r9) goto L_0x020b
            if (r2 == 0) goto L_0x020b
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 111(0x6f, double:5.5E-322)
            r18 = 220(0xdc, double:1.087E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERR: onGYNetEnd SERVER FAILED errtype:"
            r4.append(r5)
            r4.append(r1)
            r4.append(r14)
            r4.append(r2)
            r4.append(r10)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x020b:
            if (r1 != 0) goto L_0x052f
            if (r2 == 0) goto L_0x0211
            goto L_0x052f
        L_0x0211:
            te3.qv3 r9 = r5.f299775i
            pe3.b r9 = r9.f140574f
            byte[] r9 = r9.f257327a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r9)
            java.lang.String r10 = "] file:"
            java.lang.String r11 = "onGYNetEnd Err Thumb Pos:["
            if (r9 != 0) goto L_0x026e
            int r9 = r5.f299774h
            int r14 = r8.f144763f
            te3.qv3 r13 = r5.f299775i
            int r13 = r13.f140572d
            int r14 = r14 - r13
            if (r9 == r14) goto L_0x026e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            int r9 = r5.f299774h
            r4.append(r9)
            r4.append(r15)
            te3.qv3 r9 = r5.f299775i
            int r9 = r9.f140572d
            r4.append(r9)
            r4.append(r15)
            int r8 = r8.f144763f
            r4.append(r8)
            r4.append(r10)
            java.lang.String r8 = r0.f288619f
            r4.append(r8)
            r4.append(r7)
            java.lang.String r5 = r5.f299772f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x026e:
            te3.qv3 r9 = r5.f299778o
            pe3.b r9 = r9.f140574f
            byte[] r9 = r9.f257327a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r9)
            if (r9 != 0) goto L_0x02c6
            int r9 = r5.f299777n
            int r13 = r8.f144764g
            te3.qv3 r14 = r5.f299778o
            int r14 = r14.f140572d
            int r13 = r13 - r14
            if (r9 == r13) goto L_0x02c6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            int r9 = r5.f299777n
            r4.append(r9)
            r4.append(r15)
            te3.qv3 r9 = r5.f299778o
            int r9 = r9.f140572d
            r4.append(r9)
            r4.append(r15)
            int r8 = r8.f144764g
            r4.append(r8)
            r4.append(r10)
            java.lang.String r8 = r0.f288619f
            r4.append(r8)
            r4.append(r7)
            java.lang.String r5 = r5.f299772f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x02c6:
            hd0.n0 r9 = r0.f288624n
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r9.f288564k = r10
            hd0.n0 r9 = r0.f288624n
            long r10 = r8.f144765h
            r9.f288556c = r10
            r13 = 1028(0x404, float:1.44E-42)
            r9.f288548P = r13
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9[r12] = r10
            int r10 = sf0.C90188n0.f258951s
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 1
            r9[r11] = r10
            java.lang.String r10 = "dkmsgid  set svrmsgid %d -> %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r10, r9)
            r9 = 10007(0x2717, float:1.4023E-41)
            int r10 = sf0.C90188n0.f258950r
            if (r9 != r10) goto L_0x0309
            int r9 = sf0.C90188n0.f258951s
            if (r9 == 0) goto L_0x0309
            hd0.n0 r10 = r0.f288624n
            long r12 = r10.f288556c
            r14 = 0
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x0309
            long r12 = (long) r9
            r10.f288556c = r12
            r9 = 0
            sf0.C90188n0.f258951s = r9
        L_0x0309:
            hd0.n0 r9 = r0.f288624n
            int r10 = r9.f288562i
            java.lang.String r12 = " file:"
            r13 = 103(0x67, float:1.44E-43)
            if (r10 != r13) goto L_0x032f
            int r7 = r5.f299774h
            te3.qv3 r5 = r5.f299775i
            int r5 = r5.f140572d
            int r7 = r7 + r5
            r9.f288560g = r7
            int r5 = r9.f288548P
            r5 = r5 | 64
            r9.f288548P = r5
            int r10 = r9.f288561h
            if (r7 < r10) goto L_0x0353
            r7 = 104(0x68, float:1.46E-43)
            r9.f288562i = r7
            r5 = r5 | 256(0x100, float:3.59E-43)
            r9.f288548P = r5
            goto L_0x0353
        L_0x032f:
            r13 = 104(0x68, float:1.46E-43)
            if (r10 != r13) goto L_0x04ff
            int r7 = r5.f299777n
            te3.qv3 r5 = r5.f299778o
            int r5 = r5.f140572d
            int r7 = r7 + r5
            r9.f288557d = r7
            int r5 = r9.f288548P
            r5 = r5 | 8
            r9.f288548P = r5
            int r10 = r9.f288559f
            if (r7 < r10) goto L_0x0353
            r7 = 199(0xc7, float:2.79E-43)
            r9.f288562i = r7
            r5 = r5 | 256(0x100, float:3.59E-43)
            r9.f288548P = r5
            hd0.C98429r0.m127809O(r9)
            r5 = 1
            goto L_0x0354
        L_0x0353:
            r5 = 0
        L_0x0354:
            hd0.n0 r7 = r0.f288624n
            hd0.C98429r0.m127808N(r7)
            boolean r7 = r0.f288623j
            if (r7 == 0) goto L_0x0363
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0363:
            if (r5 != 0) goto L_0x036d
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f288616C
            r2 = 10
            r1.startTimer(r2)
            return
        L_0x036d:
            k40.a r5 = f40.C86709a0.m107533q(r4)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            hd0.n0 r7 = r0.f288624n
            long r9 = r7.f288567n
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r9)
            java.lang.String r7 = r8.f144767j
            r8 = 0
            eb0.C75569c4.m90666L(r5, r7, r8)
            k40.a r7 = f40.C86709a0.m107533q(r4)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.l r7 = r7.mo96095LE()
            long r8 = r5.getMsgId()
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            r7.xy0(r8, r5)
            java.lang.Class<ru.g> r7 = p680ru.C101463g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ru.g r7 = (p680ru.C101463g) r7
            r7.mo126782B1(r5)
            hd0.n0 r5 = r0.f288624n
            if (r5 != 0) goto L_0x03ab
        L_0x03a9:
            r4 = 0
            goto L_0x03cb
        L_0x03ab:
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            com.tencent.mm.storage.z1 r4 = r4.get(r5)
            if (r4 == 0) goto L_0x03a9
            long r7 = r4.f108320R1
            int r5 = (int) r7
            if (r5 > 0) goto L_0x03c7
            goto L_0x03a9
        L_0x03c7:
            boolean r4 = r4.mo62916m3()
        L_0x03cb:
            java.lang.String r5 = "ERR: finish video invaild MSGSVRID :"
            java.lang.String r7 = " toUser:"
            if (r4 != 0) goto L_0x0420
            hd0.n0 r4 = r0.f288624n
            java.lang.String r4 = r4.mo137707k()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85793A5(r4)
            if (r4 == 0) goto L_0x03de
            goto L_0x0420
        L_0x03de:
            java.lang.String r4 = "not upload to biz"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            hd0.n0 r4 = r0.f288624n
            long r8 = r4.f288556c
            r13 = 0
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x041d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            hd0.n0 r5 = r0.f288624n
            long r8 = r5.f288556c
            r4.append(r8)
            r4.append(r12)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127799E(r4)
        L_0x041d:
            r13 = 0
            goto L_0x046b
        L_0x0420:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            hd0.n0 r8 = r0.f288624n
            java.lang.String r8 = r8.mo137707k()
            r9 = 0
            r4[r9] = r8
            java.lang.String r8 = "upload to biz :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r4)
            hd0.n0 r4 = r0.f288624n
            long r8 = r4.f288556c
            r13 = 0
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x046b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            hd0.n0 r5 = r0.f288624n
            long r8 = r5.f288556c
            r4.append(r8)
            r4.append(r12)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127799E(r4)
        L_0x046b:
            nj.g$a r4 = r0.f288626p
            if (r4 == 0) goto L_0x0473
            long r13 = r4.mo72288a()
        L_0x0473:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "!!!FIN: file:"
            r4.append(r5)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r5 = " msgsvrid:"
            r4.append(r5)
            hd0.n0 r5 = r0.f288624n
            long r7 = r5.f288556c
            r4.append(r7)
            java.lang.String r5 = " thumbsize:"
            r4.append(r5)
            hd0.n0 r5 = r0.f288624n
            int r5 = r5.f288561h
            r4.append(r5)
            java.lang.String r5 = " videosize:"
            r4.append(r5)
            hd0.n0 r5 = r0.f288624n
            int r5 = r5.f288559f
            r4.append(r5)
            java.lang.String r5 = " useTime:"
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "FinishLogForTime file:"
            r4.append(r7)
            java.lang.String r7 = r0.f288619f
            r4.append(r7)
            java.lang.String r7 = " packSize:"
            r4.append(r7)
            r7 = 32000(0x7d00, float:4.4842E-41)
            r4.append(r7)
            java.lang.String r7 = " filesize:"
            r4.append(r7)
            hd0.n0 r7 = r0.f288624n
            int r7 = r7.f288559f
            r4.append(r7)
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            hd0.n0 r4 = r0.f288624n
            r5 = 0
            hd0.C98384a.m127689a(r4, r5)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x04ff:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "onGYNetEnd ERROR STATUS:"
            r4.append(r8)
            r4.append(r10)
            r4.append(r12)
            java.lang.String r8 = r0.f288619f
            r4.append(r8)
            r4.append(r7)
            java.lang.String r5 = r5.f299772f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288619f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x052f:
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 111(0x6f, double:5.5E-322)
            r18 = 219(0xdb, double:1.08E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:"
            r4.append(r5)
            r4.append(r1)
            r4.append(r14)
            r4.append(r2)
            r4.append(r10)
            java.lang.String r5 = r0.f288619f
            r4.append(r5)
            r4.append(r7)
            hd0.n0 r5 = r0.f288624n
            java.lang.String r5 = r5.mo137707k()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            ob0.n r4 = r0.f288617d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98415q.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    /* renamed from: p1 */
    public final String mo137749p1() {
        return this.f288619f + "_" + hashCode();
    }

    public int securityLimitCount() {
        return this.f288621h;
    }

    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            C115669n.INSTANCE.idkeyStat(111, 210, 1, false);
        }
        return securityLimitCountReach;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        int i;
        int i2;
        int i3;
        int i4;
        wn4 wn4 = (wn4) ((C47350c) uVar).f127055a.f127080a;
        if (!Util.isNullOrNil(wn4.f299770d) && wn4.f299782r > 0 && !Util.isNullOrNil(wn4.f299771e) && !Util.isNullOrNil(wn4.f299772f) && wn4.f299781q > 0 && (i = wn4.f299774h) <= (i2 = wn4.f299773g) && i >= 0 && (i3 = wn4.f299777n) <= (i4 = wn4.f299776j) && i3 >= 0 && ((i3 != i4 || i != i2) && i2 > 0 && i4 > 0 && (wn4.f299778o.f140572d > 0 || wn4.f299775i.f140572d > 0))) {
            return y$$d.EOk;
        }
        Log.m105920e("MicroMsg.NetSceneUploadVideo", "ERR: Security Check Failed file:" + this.f288619f + " user:" + wn4.f299772f);
        return y$$d.EFailed;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C115669n.INSTANCE.idkeyStat(111, 221, 1, false);
        C98429r0.m127799E(this.f288619f);
    }
}
