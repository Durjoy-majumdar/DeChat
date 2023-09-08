package hd0;

import bp3.C104160f;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30731d4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.XWebFeature;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$c;
import ob0.y$$d;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p509eu.C31700d;
import p509eu.C97708g;
import p663qo.C101213l;
import p753xp.C102704b;
import p867wp.C102479b;
import te3.C51200s50;

/* renamed from: hd0.n */
public class C98404n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f288509d;

    /* renamed from: e */
    public C47350c f288510e;

    /* renamed from: f */
    public String f288511f;

    /* renamed from: g */
    public String f288512g;

    /* renamed from: h */
    public boolean f288513h;

    /* renamed from: i */
    public boolean f288514i;

    /* renamed from: j */
    public C98408n0 f288515j;

    /* renamed from: n */
    public C98127h f288516n;

    /* renamed from: o */
    public String f288517o;

    /* renamed from: p */
    public long f288518p;

    /* renamed from: q */
    public int f288519q;

    /* renamed from: r */
    public int f288520r;

    /* renamed from: s */
    public boolean f288521s;

    /* renamed from: t */
    public boolean f288522t;

    /* renamed from: u */
    public String f288523u;

    /* renamed from: v */
    public int f288524v;

    /* renamed from: w */
    public long f288525w;

    /* renamed from: x */
    public C98124g.C98125a f288526x;

    /* renamed from: y */
    public MTimerHandler f288527y;

    /* renamed from: hd0.n$a */
    public class C98405a implements C98124g.C98125a {
        public C98405a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            if (i2 == -21006) {
                Log.m105919d("MicroMsg.NetSceneDownloadVideo", "%s cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", C98404n.this.mo137696l1(), C98404n.this.f288517o);
                return 0;
            } else if (i2 != 0) {
                C98429r0.m127799E(C98404n.this.f288511f);
                C98404n nVar = C98404n.this;
                nVar.f288509d.onSceneEnd(3, i2, "", nVar);
                return 0;
            } else {
                C98404n nVar2 = C98404n.this;
                nVar2.f288515j = C98429r0.m127818i(nVar2.f288511f);
                C98404n nVar3 = C98404n.this;
                C98408n0 n0Var = nVar3.f288515j;
                if (n0Var == null || n0Var.f288562i == 113) {
                    int i3 = n0Var == null ? -1 : n0Var.f288562i;
                    Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s upload video info is null or has paused, status:%d", nVar3.mo137696l1(), Integer.valueOf(i3));
                    C98404n.this.mo137695k1();
                    C11385n nVar4 = C98404n.this.f288509d;
                    nVar4.onSceneEnd(3, i2, "upload video info is null or has paused, status" + i3, C98404n.this);
                    return 0;
                } else if (cVar2 != null) {
                    long j = cVar2.field_finishedLength;
                    if (j == ((long) nVar3.f288519q)) {
                        Log.m105918d("MicroMsg.NetSceneDownloadVideo", "cdntra ignore progress 100%");
                        return 0;
                    } else if (((long) n0Var.f288558e) <= j || nVar3.f288513h) {
                        int i4 = 1024;
                        n0Var.f288564k = Util.nowSecond();
                        C98408n0 n0Var2 = C98404n.this.f288515j;
                        long j2 = cVar2.field_finishedLength;
                        if (((long) n0Var2.f288558e) < j2) {
                            n0Var2.f288558e = (int) j2;
                            i4 = XWebFeature.INTERFACE_SHOW_HIDE;
                        }
                        n0Var2.f288548P = i4;
                        C98429r0.m127808N(n0Var2);
                        Log.m105919d("MicroMsg.NetSceneDownloadVideo", "%s cdntra progresscallback id:%s finish:%d total:%d", C98404n.this.mo137696l1(), C98404n.this.f288517o, Long.valueOf(cVar2.field_finishedLength), Long.valueOf(cVar2.field_toltalLength));
                        return 0;
                    } else {
                        Log.m105921e("MicroMsg.NetSceneDownloadVideo", "%s cdnEndProc error oldpos:%d newpos:%d", nVar3.mo137696l1(), Integer.valueOf(C98404n.this.f288515j.f288558e), Long.valueOf(cVar2.field_finishedLength));
                        C98429r0.m127799E(C98404n.this.f288511f);
                        C98404n nVar5 = C98404n.this;
                        nVar5.f288509d.onSceneEnd(3, i2, "", nVar5);
                        return 0;
                    }
                } else {
                    if (dVar2 != null) {
                        Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s cdntra sceneResult.retCode:%d useTime:%d ", nVar3.mo137696l1(), Integer.valueOf(dVar2.field_retCode), Long.valueOf(Util.nowMilliSecond() - C98404n.this.f288525w));
                        C98404n nVar6 = C98404n.this;
                        C98127h hVar = nVar6.f288516n;
                        nVar6.getClass();
                        if (hVar == null) {
                            Log.m105928w("MicroMsg.NetSceneDownloadVideo", "it had not task info or scene Result, don't report.");
                        } else if (hVar.field_smallVideoFlag == 1) {
                            Log.m105924i("MicroMsg.NetSceneDownloadVideo", "it download short video, don't report.");
                        } else {
                            Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s sceneResult.field_recvedBytes %d, time [%d, %d]", nVar6.mo137696l1(), Long.valueOf(dVar2.field_recvedBytes), Long.valueOf(dVar2.field_startTime), Long.valueOf(dVar2.field_endTime));
                            C98398h0.xx0().mo126992p((Object[]) null, dVar2, hVar, true);
                        }
                        if (dVar2.field_retCode != 0) {
                            C98429r0.m127799E(C98404n.this.f288511f);
                            if (C98404n.this.f288513h) {
                                C115669n.INSTANCE.idkeyStat(354, 13, 1, false);
                            }
                            if (C98404n.this.f288514i) {
                                C115669n.INSTANCE.idkeyStat(354, 252, 1, false);
                            }
                            C98404n nVar7 = C98404n.this;
                            nVar7.f288509d.onSceneEnd(3, dVar2.field_retCode, "", nVar7);
                        } else {
                            if (C98404n.this.f288513h) {
                                C115669n.INSTANCE.idkeyStat(354, 12, 1, false);
                            }
                            if (C98404n.this.f288514i) {
                                C115669n.INSTANCE.idkeyStat(354, 137, 1, false);
                            }
                            C98404n.this.mo137694j1((int) dVar2.field_fileLength);
                        }
                        C98384a.m127689a(C98404n.this.f288515j, 1);
                        C98404n.this.f288516n = null;
                    }
                    return 0;
                }
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* renamed from: hd0.n$b */
    public class C98406b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f288529d;

        /* renamed from: e */
        public final /* synthetic */ int f288530e;

        public C98406b(boolean z, int i) {
            this.f288529d = z;
            this.f288530e = i;
        }

        public void run() {
            boolean z;
            Map<String, String> parseXml = XmlParser.parseXml(C98404n.this.f288515j.mo137705i(), "msg", (String) null);
            if (parseXml != null) {
                C98398h0.Bx0().mo137732v(C98398h0.Bx0().mo137728q(C98404n.this.f288511f), parseXml.get(".msg.videomsg.$cdnvideourl"), parseXml.get(".msg.videomsg.$aeskey"));
            }
            if (this.f288529d) {
                z = C98429r0.m127806L(C98404n.this.f288511f, this.f288530e);
                C98404n nVar = C98404n.this;
                if (nVar.f288514i) {
                    C98429r0.m127800F(nVar.f288511f);
                    Log.m105924i("MicroMsg.NetSceneDownloadVideo", "sceneEndproc, isHadHevcLocalFile");
                }
            } else {
                C98404n nVar2 = C98404n.this;
                if (nVar2.f288514i) {
                    C98429r0.m127799E(nVar2.f288511f);
                    C115669n.INSTANCE.idkeyStat(354, 138, 1, false);
                    z = false;
                } else {
                    z = C98429r0.m127806L(nVar2.f288511f, this.f288530e);
                }
            }
            C98404n nVar3 = C98404n.this;
            C98404n nVar4 = C98404n.this;
            Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s ashutest::cdntra !FIN! file:%s svrid:%d human:%s user:%s updatedbsucc:%b  MediaCheckDuplicationStorage MD5:%s SIZE:%d renameFlag %b needRename %b", C98404n.this.mo137696l1(), nVar3.f288511f, Long.valueOf(nVar3.f288515j.f288556c), C98404n.this.f288515j.mo137701e(), C98404n.this.f288515j.mo137707k(), Boolean.valueOf(z), nVar4.f288523u, Integer.valueOf(nVar4.f288524v), Boolean.valueOf(this.f288529d), Boolean.valueOf(C98404n.this.f288522t));
            if (!Util.isNullOrNil(C98404n.this.f288523u) && C98404n.this.f288524v > 0) {
                C31700d A1 = ((C97708g) C86312j.m106911c(C97708g.class)).mo58053A1();
                C98404n nVar5 = C98404n.this;
                ((C30731d4) A1).mo57629d(nVar5.f288523u, nVar5.f288524v, C98398h0.Bx0().mo137728q(C98404n.this.f288511f));
            }
            C98408n0 n0Var = C98404n.this.f288515j;
            if (n0Var.f288576w == 3) {
                C115669n nVar6 = C115669n.INSTANCE;
                nVar6.idkeyStat(198, 38, (long) n0Var.f288559f, false);
                C115669n nVar7 = nVar6;
                nVar7.idkeyStat(198, 40, (long) C98404n.this.f288515j.f288566m, false);
                nVar7.idkeyStat(198, 41, 1, false);
                nVar6.idkeyStat(198, C72996z1.m85820U5(C98404n.this.f288515j.mo137707k()) ? 43 : 42, 1, false);
            } else {
                C115669n nVar8 = C115669n.INSTANCE;
                nVar8.idkeyStat(198, 31, (long) n0Var.f288559f, false);
                C115669n nVar9 = nVar8;
                nVar9.idkeyStat(198, 33, (long) C98404n.this.f288515j.f288566m, false);
                nVar9.idkeyStat(198, 34, 1, false);
                nVar8.idkeyStat(198, C72996z1.m85820U5(C98404n.this.f288515j.mo137707k()) ? 36 : 35, 1, false);
            }
            C98404n nVar10 = C98404n.this;
            nVar10.f288509d.onSceneEnd(0, 0, "", nVar10);
        }
    }

    /* renamed from: hd0.n$c */
    public class C98407c implements MTimerHandler.CallBack {
        public C98407c() {
        }

        public boolean onTimerExpired() {
            C98404n nVar = C98404n.this;
            if (nVar.doScene(nVar.dispatcher(), C98404n.this.f288509d) != -1) {
                return false;
            }
            C98404n nVar2 = C98404n.this;
            nVar2.f288509d.onSceneEnd(3, -1, "doScene failed", nVar2);
            return false;
        }
    }

    public C98404n(String str) {
        this(str, false);
    }

    public void cancel() {
        mo137695k1();
        super.cancel();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0538  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r35, ob0.C11385n r36) {
        /*
            r34 = this;
            r1 = r34
            r0 = r36
            r1.f288509d = r0
            java.lang.String r0 = r1.f288511f
            hd0.n0 r0 = hd0.C98429r0.m127818i(r0)
            r1.f288515j = r0
            r2 = -1
            java.lang.String r3 = "MicroMsg.NetSceneDownloadVideo"
            r4 = 0
            if (r0 != 0) goto L_0x0034
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "ERR: Get INFO FAILED :"
            r0.append(r5)
            java.lang.String r5 = r1.f288511f
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            int r0 = p206nj.C76861g.m92658a()
            int r4 = r4 - r0
            int r4 = r4 + -10000
            r1.f288520r = r4
            return r2
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            int r0 = r0.f288576w
        L_0x0038:
            long r5 = r1.f288518p
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f288518p = r5
            hd0.n0 r0 = r1.f288515j
            r0.getClass()
        L_0x004b:
            java.lang.Class<eu.g> r0 = p509eu.C97708g.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.Class<a11.b> r6 = a11.C39478b.class
            java.lang.Class<qo.l> r9 = p663qo.C101213l.class
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = r34.mo137696l1()
            r11[r4] = r12
            hd0.n0 r12 = r1.f288515j
            java.lang.String r12 = r12.mo137705i()
            r13 = 1
            r11[r13] = r12
            java.lang.String r12 = "%s parseVideoMsgXML content: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r12, r11)
            hd0.n0 r11 = r1.f288515j
            java.lang.String r11 = r11.mo137705i()
            r12 = 0
            java.lang.String r14 = "msg"
            java.util.Map r11 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r11, r14, r12)
            java.lang.String r12 = "%s cdntra parse video recv xml failed"
            java.lang.String r14 = ","
            if (r11 != 0) goto L_0x009b
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 111(0x6f, double:5.5E-322)
            r18 = 214(0xd6, double:1.057E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r5 = r34.mo137696l1()
            r0[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r12, r0)
        L_0x0096:
            r2 = r14
        L_0x0097:
            r0 = 0
            r4 = 2
            goto L_0x0602
        L_0x009b:
            java.lang.String r15 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r15 = r11.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r7 = ".msg.videomsg.$tpvideourl"
            java.lang.Object r7 = r11.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r8 == 0) goto L_0x00d0
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x00d0
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 111(0x6f, double:5.5E-322)
            r21 = 213(0xd5, double:1.05E-321)
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r5 = r34.mo137696l1()
            r0[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r12, r0)
            goto L_0x0096
        L_0x00d0:
            java.lang.String r8 = ".msg.videomsg.$aeskey"
            java.lang.Object r8 = r11.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r12 = ".msg.videomsg.$length"
            java.lang.Object r12 = r11.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r4)
            r1.f288519q = r12
            java.lang.String r12 = ".msg.videomsg.$fileparam"
            java.lang.Object r12 = r11.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            hd0.n0 r2 = r1.f288515j
            r19 = r14
            long r13 = r2.f288563j
            java.lang.String r2 = r2.mo137707k()
            hd0.n0 r4 = r1.f288515j
            java.lang.String r4 = r4.mo137700d()
            java.lang.String r10 = "downvideo"
            java.lang.String r2 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r10, r13, r2, r4)
            r1.f288517o = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0128
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r34.mo137696l1()
            r4 = 0
            r0[r4] = r2
            hd0.n0 r2 = r1.f288515j
            java.lang.String r2 = r2.mo137700d()
            r4 = 1
            r0[r4] = r2
            java.lang.String r2 = "%s cdntra genClientId failed not use cdn file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r0)
        L_0x0124:
            r2 = r19
            goto L_0x0097
        L_0x0128:
            boolean r2 = r1.f288513h
            if (r2 != 0) goto L_0x0154
            int r2 = r1.f288519q
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r2 >= r4) goto L_0x0154
            hd0.n0 r2 = r1.f288515j
            if (r2 == 0) goto L_0x0154
            int r2 = r2.f288539G
            if (r2 <= 0) goto L_0x0154
            r2 = 1
            r1.f288513h = r2
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r4 = r34.mo137696l1()
            r13 = 0
            r10[r13] = r4
            boolean r4 = r1.f288513h
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r10[r2] = r4
            java.lang.String r2 = "%s less 1M and had preload, reset isCompleteOnlineVideo [%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r10)
        L_0x0154:
            java.lang.String r2 = ".msg.videomsg.$md5"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            hd0.o0 r10 = hd0.C98398h0.Bx0()
            java.lang.String r13 = r1.f288511f
            java.lang.String r10 = r10.mo137728q(r13)
            r4.append(r10)
            java.lang.String r10 = ".tmp"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            gi.h r10 = new gi.h
            r10.<init>()
            r1.f288516n = r10
            java.lang.String r13 = "task_NetSceneDownloadVideo"
            r10.f287660d = r13
            hd0.n0 r13 = r1.f288515j
            java.lang.String r13 = r13.mo137700d()
            r10.f287683S = r13
            gi.h r10 = r1.f288516n
            r10.f287685T = r2
            int r13 = r1.f288519q
            r10.f287687U = r13
            r13 = 0
            r10.f287689V = r13
            hd0.n0 r13 = r1.f288515j
            java.lang.String r13 = r13.mo137701e()
            r10.f287693X = r13
            gi.h r10 = r1.f288516n
            hd0.n0 r13 = r1.f288515j
            java.lang.String r13 = r13.mo137707k()
            r10.f287691W = r13
            gi.h r10 = r1.f288516n
            hd0.n0 r13 = r1.f288515j
            java.lang.String r13 = r13.mo137707k()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r13 == 0) goto L_0x01c7
            di3.d r13 = di3.C86312j.m106911c(r6)
            a11.b r13 = (a11.C39478b) r13
            hd0.n0 r14 = r1.f288515j
            java.lang.String r14 = r14.mo137707k()
            int r13 = r13.mo62080p1(r14)
            goto L_0x01c8
        L_0x01c7:
            r13 = 0
        L_0x01c8:
            r10.f287695Y = r13
            gi.h r10 = r1.f288516n
            java.lang.String r13 = r1.f288517o
            r10.field_mediaId = r13
            r10.field_fullpath = r4
            r13 = 4
            r10.field_fileType = r13
            int r14 = r1.f288519q
            r10.field_totalLen = r14
            r10.field_aesKey = r8
            r10.field_fileId = r15
            r8 = 2
            r10.field_priority = r8
            gi.g$a r8 = r1.f288526x
            r10.f287662f = r8
            r10.field_wxmsgparam = r12
            hd0.n0 r8 = r1.f288515j
            java.lang.String r8 = r8.mo137707k()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            r10.field_chattype = r8
            gi.h r8 = r1.f288516n
            hd0.n0 r10 = r1.f288515j
            int r10 = r10.f288537E
            r8.f287697Z = r10
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r10 = ""
            if (r8 != 0) goto L_0x0216
            java.lang.String r8 = ".msg.videomsg.$tpauthkey"
            java.lang.Object r8 = r11.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            gi.h r11 = r1.f288516n
            r11.field_fileId = r10
            r12 = 19
            r11.field_fileType = r12
            r11.field_authKey = r8
            r11.f287672s = r7
        L_0x0216:
            k40.a r7 = f40.C86709a0.m107533q(r5)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.l r7 = r7.mo96095LE()
            hd0.n0 r8 = r1.f288515j
            java.lang.String r8 = r8.mo137707k()
            hd0.n0 r11 = r1.f288515j
            long r11 = r11.f288556c
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            com.tencent.mm.storage.f4 r7 = r7.h30(r8, r11)
            gi.h r8 = r1.f288516n
            long r11 = r7.getCreateTime()
            r8.f287707y0 = r11
            gi.h r8 = r1.f288516n
            long r11 = r7.mo108774y2()
            r8.f287680Q0 = r11
            java.lang.String r8 = r7.f230724G
            eb0.z3$$h r8 = eb0.C75604z3.m90851w(r8)
            gi.h r11 = r1.f288516n
            if (r8 == 0) goto L_0x024d
            int r12 = r8.f222114u
            goto L_0x024e
        L_0x024d:
            r12 = 0
        L_0x024e:
            r11.f287692W0 = r12
            hd0.n0 r11 = r1.f288515j
            java.lang.String r11 = r11.mo137707k()
            java.lang.String r12 = r7.mo108768t()
            boolean r11 = r11.equals(r12)
            r12 = 8
            if (r11 == 0) goto L_0x026d
            gi.h r11 = r1.f288516n
            if (r8 != 0) goto L_0x0268
            r8 = 0
            goto L_0x026b
        L_0x0268:
            int r8 = r8.f222113t
            int r8 = r8 / r12
        L_0x026b:
            r11.field_limitrate = r8
        L_0x026d:
            r8 = 3
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r14 = r34.mo137696l1()
            r20 = 0
            r11[r20] = r14
            gi.h r14 = r1.f288516n
            int r14 = r14.field_limitrate
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r18 = 1
            r11[r18] = r14
            hd0.n0 r14 = r1.f288515j
            java.lang.String r14 = r14.mo137700d()
            r21 = 2
            r11[r21] = r14
            java.lang.String r14 = "%s limitrate:%d file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r14, r11)
            di3.d r11 = di3.C86312j.m106911c(r9)
            qo.l r11 = (p663qo.C101213l) r11
            java.util.HashSet r11 = r11.mo140297CA()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r12 = "video_"
            r14.append(r12)
            hd0.n0 r13 = r1.f288515j
            r24 = r9
            long r8 = r13.f288567n
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x02e1
            di3.d r8 = di3.C86312j.m106911c(r24)
            qo.l r8 = (p663qo.C101213l) r8
            java.util.HashSet r8 = r8.mo140297CA()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r12)
            hd0.n0 r11 = r1.f288515j
            long r11 = r11.f288567n
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.remove(r9)
            gi.h r8 = r1.f288516n
            r9 = 1
            r8.field_autostart = r9
            goto L_0x02e7
        L_0x02e1:
            r9 = 1
            gi.h r8 = r1.f288516n
            r11 = 0
            r8.field_autostart = r11
        L_0x02e7:
            hd0.n0 r8 = r1.f288515j
            int r8 = r8.f288576w
            r11 = 3
            if (r11 != r8) goto L_0x02f2
            gi.h r8 = r1.f288516n
            r8.field_smallVideoFlag = r9
        L_0x02f2:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r8 != 0) goto L_0x0480
            boolean r8 = r1.f288513h
            if (r8 != 0) goto L_0x0480
            di3.d r8 = di3.C86312j.m106911c(r0)
            eu.g r8 = (p509eu.C97708g) r8
            eu.d r8 = r8.mo58053A1()
            int r12 = r1.f288519q
            com.tencent.mm.storage.d4 r8 = (com.tencent.p014mm.storage.C30731d4) r8
            java.lang.String r8 = r8.mo57627a(r2, r12)
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            int r13 = (int) r12
            int r12 = r1.f288519q
            int r12 = r12 - r13
            hd0.o0 r14 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r1.f288511f
            java.lang.String r9 = r14.mo137728q(r9)
            r26 = r12
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r12 = (int) r11
            if (r12 <= 0) goto L_0x03b4
            r14 = 1
            java.lang.Object[] r8 = new java.lang.Object[r14]
            java.lang.String r14 = r34.mo137696l1()
            r20 = 0
            r8[r20] = r14
            java.lang.String r14 = "%s already copy dup file, but download again, something error here."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r14, r8)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106447h(r9)
            di3.d r0 = di3.C86312j.m106911c(r0)
            eu.g r0 = (p509eu.C97708g) r0
            eu.d r0 = r0.mo58053A1()
            int r9 = r1.f288519q
            com.tencent.mm.storage.d4 r0 = (com.tencent.p014mm.storage.C30731d4) r0
            r0.getClass()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r14 != 0) goto L_0x037f
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f82653c
            r14 = 3
            java.lang.String[] r11 = new java.lang.String[r14]
            r14 = 0
            r11[r14] = r2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r10)
            java.lang.String r9 = r14.toString()
            r14 = 1
            r11[r14] = r9
            java.lang.String r9 = "100"
            r14 = 2
            r11[r14] = r9
            zh3.f r0 = (zh3.C91753f) r0
            java.lang.String r9 = "MediaDuplication"
            java.lang.String r14 = "md5=? AND size=? AND status!=?"
            int r0 = r0.delete(r9, r14, r11)
            goto L_0x0380
        L_0x037f:
            r0 = 0
        L_0x0380:
            java.lang.String r9 = r1.f288511f
            hd0.n0 r9 = hd0.C98429r0.m127818i(r9)
            r11 = 0
            r9.f288558e = r11
            r14 = 16
            r9.f288548P = r14
            hd0.C98429r0.m127808N(r9)
            r9 = 4
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.String r9 = r34.mo137696l1()
            r14[r11] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r11 = 1
            r14[r11] = r9
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9 = 2
            r14[r9] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = 3
            r14[r8] = r0
            java.lang.String r0 = "%s don't copy dup file, go to download now. target video len %d, delete file:%b,delete db: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r14)
            r8 = r10
        L_0x03b4:
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r9 = r34.mo137696l1()
            r11 = 0
            r0[r11] = r9
            int r9 = r1.f288519q
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11 = 1
            r0[r11] = r9
            r9 = 2
            r0[r9] = r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r11 = 3
            r0[r11] = r9
            r9 = 4
            r0[r9] = r8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r26)
            r11 = 5
            r0[r11] = r9
            r9 = 6
            r0[r9] = r4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r11 = 7
            r0[r11] = r9
            java.lang.String r9 = "%s MediaCheckDuplicationStorage: totallen:%s md5:%s  dup(len:%d path:%s) diffLen:%d to:%s target video len %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 != 0) goto L_0x047a
            if (r26 < 0) goto L_0x0480
            r12 = r26
            r0 = 16
            if (r12 > r0) goto L_0x0480
            r0 = 3
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r0 = r34.mo137696l1()
            r12 = 0
            r9[r12] = r0
            r12 = 1
            r9[r12] = r8
            r12 = 2
            r9[r12] = r4
            java.lang.String r0 = "%s MediaCheckDuplicationStorage copy dup file now :%s -> %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r9)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r8, r4)
            int r0 = r1.f288519q
            r1.mo137694j1(r0)
            k40.a r0 = f40.C86709a0.m107533q(r5)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            g62.l$e r4 = new g62.l$e
            java.lang.String r5 = r7.mo108768t()
            java.lang.String r8 = "update"
            r9 = 0
            r4.<init>(r5, r8, r7, r9)
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.mo101123jo(r4)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 13267(0x33d3, float:1.8591E-41)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r9] = r15
            hd0.n0 r7 = r1.f288515j
            long r7 = r7.f288556c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 1
            r5[r8] = r7
            r7 = 2
            r5[r7] = r2
            hd0.n0 r2 = r1.f288515j
            long r7 = r2.f288563j
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r7 = 3
            r5[r7] = r2
            hd0.n0 r2 = r1.f288515j
            java.lang.String r2 = r2.mo137707k()
            r8 = 4
            r5[r8] = r2
            hd0.n0 r2 = r1.f288515j
            int r2 = r2.f288576w
            if (r7 == r2) goto L_0x0465
            r2 = 43
            goto L_0x0467
        L_0x0465:
            r2 = 62
        L_0x0467:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 5
            r5[r7] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7 = 6
            r5[r7] = r2
            r0.mo160131h(r4, r5)
            r0 = 1
            goto L_0x0481
        L_0x047a:
            r1.f288523u = r2
            int r0 = r1.f288519q
            r1.f288524v = r0
        L_0x0480:
            r0 = 0
        L_0x0481:
            if (r0 != 0) goto L_0x0531
            gi.h r0 = r1.f288516n
            java.lang.String r0 = r0.field_mediaId
            r1.f288512g = r0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f288525w = r4
            hd0.n0 r0 = r1.f288515j
            int r0 = r0.f288540H
            r2 = 2
            if (r0 != r2) goto L_0x0498
            r0 = 1
            goto L_0x0499
        L_0x0498:
            r0 = 0
        L_0x0499:
            r1.f288514i = r0
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = r34.mo137696l1()
            r4 = 0
            r2[r4] = r0
            boolean r0 = r1.f288514i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4 = 1
            r2[r4] = r0
            boolean r0 = r1.f288513h
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4 = 2
            r2[r4] = r0
            java.lang.String r0 = "%s check use cdn isHadHevcLocalFile[%b] isCompleteOnlineVideo[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
            boolean r0 = r1.f288513h
            if (r0 != 0) goto L_0x0500
            di3.d r0 = di3.C86312j.m106911c(r24)
            qo.l r0 = (p663qo.C101213l) r0
            gi.h r2 = r1.f288516n
            boolean r0 = r0.xf0(r2)
            if (r0 != 0) goto L_0x04ee
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 111(0x6f, double:5.5E-322)
            r29 = 212(0xd4, double:1.047E-321)
            r31 = 1
            r33 = 0
            r26.idkeyStat(r27, r29, r31, r33)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r34.mo137696l1()
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "%s cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r0)
            r1.f288517o = r10
            goto L_0x0124
        L_0x04ee:
            boolean r0 = r1.f288514i
            if (r0 == 0) goto L_0x0531
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 354(0x162, double:1.75E-321)
            r29 = 135(0x87, double:6.67E-322)
            r31 = 1
            r33 = 0
            r26.idkeyStat(r27, r29, r31, r33)
            goto L_0x0531
        L_0x0500:
            r2 = 0
            r1.f288522t = r2
            gi.h r0 = r1.f288516n
            hd0.o0 r2 = hd0.C98398h0.Bx0()
            java.lang.String r4 = r1.f288511f
            java.lang.String r2 = r2.mo137728q(r4)
            r0.field_fullpath = r2
            boolean r0 = r1.f288514i
            if (r0 == 0) goto L_0x0527
            gi.h r0 = r1.f288516n
            r2 = 2
            r0.field_requestVideoFormat = r2
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 354(0x162, double:1.75E-321)
            r29 = 251(0xfb, double:1.24E-321)
            r31 = 1
            r33 = 0
            r26.idkeyStat(r27, r29, r31, r33)
        L_0x0527:
            com.tencent.mm.modelcdntran.e0 r0 = hd0.C98398h0.xx0()
            gi.h r2 = r1.f288516n
            r4 = 0
            r0.mo126981e(r2, r4)
        L_0x0531:
            hd0.n0 r0 = r1.f288515j
            int r2 = r0.f288573t
            r4 = 1
            if (r2 == r4) goto L_0x0541
            r0.f288573t = r4
            r2 = 524288(0x80000, float:7.34684E-40)
            r0.f288548P = r2
            hd0.C98429r0.m127808N(r0)
        L_0x0541:
            hd0.n0 r0 = r1.f288515j
            int r2 = r0.f288576w
            r4 = 3
            if (r4 == r2) goto L_0x05fe
            java.lang.String r2 = r0.mo137707k()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x05fe
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r0 == 0) goto L_0x0564
            di3.d r0 = di3.C86312j.m106911c(r6)
            a11.b r0 = (a11.C39478b) r0
            int r0 = r0.mo62080p1(r2)
            r4 = r0
            goto L_0x0565
        L_0x0564:
            r4 = 0
        L_0x0565:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x05ab }
            java.lang.String r5 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r5)     // Catch:{ Exception -> 0x05ab }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x05ab }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x05ab }
            int r5 = r0.getSubtype()     // Catch:{ Exception -> 0x05ab }
            int r0 = r0.getType()     // Catch:{ Exception -> 0x05ab }
            r6 = 1
            if (r0 != r6) goto L_0x0582
            r0 = 1
            goto L_0x05bc
        L_0x0582:
            r0 = 13
            if (r5 == r0) goto L_0x05a8
            r0 = 15
            if (r5 == r0) goto L_0x05a8
            r0 = 14
            if (r5 != r0) goto L_0x058f
            goto L_0x05a8
        L_0x058f:
            r0 = 3
            if (r5 == r0) goto L_0x05bc
            r6 = 4
            if (r5 == r6) goto L_0x05bc
            r6 = 5
            if (r5 == r6) goto L_0x05bc
            r6 = 6
            if (r5 == r6) goto L_0x05bc
            r6 = 12
            if (r5 != r6) goto L_0x05a0
            goto L_0x05bc
        L_0x05a0:
            r6 = 1
            if (r5 == r6) goto L_0x05a6
            r6 = 2
            if (r5 != r6) goto L_0x05bb
        L_0x05a6:
            r0 = 2
            goto L_0x05bc
        L_0x05a8:
            r6 = 4
            r0 = 4
            goto L_0x05bc
        L_0x05ab:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5 = 0
            r6[r5] = r0
            java.lang.String r0 = "getNetType : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r6)
        L_0x05bb:
            r0 = 0
        L_0x05bc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r2 = r19
            r5.append(r2)
            r5.append(r4)
            r5.append(r2)
            r5.append(r15)
            r5.append(r2)
            int r4 = r1.f288519q
            r5.append(r4)
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = r34.mo137696l1()
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r0
            java.lang.String r6 = "%s dk12024 report:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 12024(0x2ef8, float:1.6849E-41)
            r5.kvStat(r6, r0)
            goto L_0x0601
        L_0x05fe:
            r2 = r19
            r4 = 2
        L_0x0601:
            r0 = 1
        L_0x0602:
            if (r0 == 0) goto L_0x0612
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = r1.f288511f
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "cdntra use cdn return -1 for onGYNetEnd clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r0)
            return r4
        L_0x0612:
            r5 = 1
            hd0.n0 r0 = r1.f288515j
            int r0 = r0.f288562i
            r6 = 112(0x70, float:1.57E-43)
            java.lang.String r7 = " ["
            if (r0 == r6) goto L_0x0671
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "ERR: STATUS: "
            r0.append(r4)
            hd0.n0 r4 = r1.f288515j
            int r4 = r4.f288562i
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = r1.f288511f
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            long r4 = r4.f288556c
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            java.lang.String r4 = r4.mo137701e()
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r2 = r1.f288515j
            java.lang.String r2 = r2.mo137707k()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            int r0 = p206nj.C76861g.m92658a()
            r2 = 0
            int r4 = 0 - r0
            int r4 = r4 + -10000
            r1.f288520r = r4
            r2 = -1
            return r2
        L_0x0671:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "start doScene  ["
            r0.append(r6)
            java.lang.String r6 = r1.f288511f
            r0.append(r6)
            r0.append(r2)
            hd0.n0 r6 = r1.f288515j
            long r8 = r6.f288556c
            r0.append(r8)
            r0.append(r2)
            hd0.n0 r6 = r1.f288515j
            java.lang.String r6 = r6.mo137701e()
            r0.append(r6)
            r0.append(r2)
            hd0.n0 r6 = r1.f288515j
            java.lang.String r6 = r6.mo137707k()
            r0.append(r6)
            java.lang.String r6 = "]  filesize:"
            r0.append(r6)
            hd0.n0 r6 = r1.f288515j
            int r6 = r6.f288558e
            r0.append(r6)
            java.lang.String r6 = " file:"
            r0.append(r6)
            hd0.n0 r6 = r1.f288515j
            int r6 = r6.f288559f
            r0.append(r6)
            java.lang.String r6 = " netTimes:"
            r0.append(r6)
            hd0.n0 r6 = r1.f288515j
            int r6 = r6.f288568o
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            java.lang.String r0 = r1.f288511f
            boolean r0 = hd0.C98429r0.m127813d(r0)
            java.lang.String r6 = "] "
            if (r0 != 0) goto L_0x072f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "ERR: NET TIMES: "
            r0.append(r4)
            hd0.n0 r4 = r1.f288515j
            int r4 = r4.f288568o
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = r1.f288511f
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            long r4 = r4.f288556c
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            java.lang.String r4 = r4.mo137701e()
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r2 = r1.f288515j
            java.lang.String r2 = r2.mo137707k()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            java.lang.String r0 = r1.f288511f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            r2 = 0
            int r4 = 0 - r0
            int r4 = r4 + -10000
            r1.f288520r = r4
            r2 = -1
            return r2
        L_0x072f:
            hd0.n0 r0 = r1.f288515j
            long r8 = r0.f288556c
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0790
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "ERR: MSGSVRID: "
            r0.append(r4)
            hd0.n0 r4 = r1.f288515j
            long r4 = r4.f288556c
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = r1.f288511f
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            long r4 = r4.f288556c
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            java.lang.String r4 = r4.mo137701e()
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r2 = r1.f288515j
            java.lang.String r2 = r2.mo137707k()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            java.lang.String r0 = r1.f288511f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            r2 = 0
            int r4 = 0 - r0
            int r4 = r4 + -10000
            r1.f288520r = r4
            r2 = -1
            return r2
        L_0x0790:
            int r8 = r0.f288558e
            if (r8 < 0) goto L_0x07f1
            int r0 = r0.f288559f
            if (r0 <= r8) goto L_0x07f1
            if (r0 > 0) goto L_0x079b
            goto L_0x07f1
        L_0x079b:
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.s50 r2 = new te3.s50
            r2.<init>()
            r0.f127066a = r2
            te3.t50 r2 = new te3.t50
            r2.<init>()
            r0.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/downloadvideo"
            r0.f127068c = r2
            r2 = 150(0x96, float:2.1E-43)
            r0.f127069d = r2
            r2 = 40
            r0.f127070e = r2
            r2 = 1000000040(0x3b9aca28, float:0.004723806)
            r0.f127071f = r2
            ob0.c r0 = r0.mo72403a()
            r1.f288510e = r0
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.s50 r0 = (te3.C51200s50) r0
            hd0.n0 r2 = r1.f288515j
            long r6 = r2.f288556c
            r0.f141334i = r6
            int r3 = r2.f288558e
            r0.f141331f = r3
            int r2 = r2.f288559f
            r0.f141330e = r2
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.network.C114786m0.m161568a(r2)
            if (r2 == 0) goto L_0x07e5
            r10 = 1
            goto L_0x07e6
        L_0x07e5:
            r10 = 2
        L_0x07e6:
            r0.f141332g = r10
            ob0.c r0 = r1.f288510e
            r2 = r35
            int r0 = r1.dispatch(r2, r0, r1)
            return r0
        L_0x07f1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "ERR: fileSize:"
            r0.append(r4)
            hd0.n0 r4 = r1.f288515j
            int r4 = r4.f288558e
            r0.append(r4)
            java.lang.String r4 = " total:"
            r0.append(r4)
            hd0.n0 r4 = r1.f288515j
            int r4 = r4.f288559f
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = r1.f288511f
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            long r4 = r4.f288556c
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r4 = r1.f288515j
            java.lang.String r4 = r4.mo137701e()
            r0.append(r4)
            r0.append(r2)
            hd0.n0 r2 = r1.f288515j
            java.lang.String r2 = r2.mo137707k()
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            java.lang.String r0 = r1.f288511f
            hd0.C98429r0.m127799E(r0)
            int r0 = p206nj.C76861g.m92658a()
            r2 = 0
            int r4 = 0 - r0
            int r4 = r4 + -10000
            r1.f288520r = r4
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98404n.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 150;
    }

    /* renamed from: j1 */
    public final void mo137694j1(int i) {
        boolean z;
        C98408n0 i2;
        boolean z2 = true;
        if (this.f288522t) {
            z = C86013q1.m106463x(C98398h0.Bx0().mo137728q(this.f288511f) + ".tmp", C98398h0.Bx0().mo137728q(this.f288511f));
        } else {
            C86013q1.m106447h(C98398h0.Bx0().mo137728q(this.f288511f) + ".tmp");
            z = true;
        }
        String str = this.f288511f;
        Class cls = C102704b.class;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_retransmit_use_link_enable, C104160f.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) != 1) {
            z2 = false;
        }
        if (z2 && (i2 = C98429r0.m127818i(str)) != null) {
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(i2.mo137707k(), i2.f288556c);
            String q = C98398h0.Bx0().mo137728q(i2.mo137700d());
            String r = C98398h0.Bx0().mo137729r(i2.mo137700d());
            if (C86013q1.m106450k(q)) {
                C102479b as = ((C102704b) C86312j.m106911c(cls)).mo138751as(q, h302.getType(), C86013q1.m106456q(q), (byte[]) null);
                Log.m105924i("MicroMsg.NetSceneDownloadVideo", "check c2c video recv dup, ret = " + as.f301760a);
            }
            if (C86013q1.m106450k(r)) {
                C102479b as4 = ((C102704b) C86312j.m106911c(cls)).mo138751as(r, h302.getType(), C86013q1.m106456q(r), (byte[]) null);
                Log.m105924i("MicroMsg.NetSceneDownloadVideo", "check c2c video thumb recv dup, ret = " + as4.f301760a);
            }
        }
        C86709a0.m107525e().postToWorker(new C98406b(z, i));
    }

    /* renamed from: k1 */
    public final boolean mo137695k1() {
        boolean z = false;
        if (!Util.isNullOrNil(this.f288512g)) {
            if (this.f288513h) {
                Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s cancel online video task.", mo137696l1());
                C98398h0.xx0().mo126983g(this.f288512g, (Object[]) null);
            } else {
                Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s cancel offline video task.", mo137696l1());
                ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(this.f288512g);
            }
            z = true;
        }
        this.f288521s = true;
        return z;
    }

    /* renamed from: l1 */
    public final String mo137696l1() {
        return this.f288511f + "_" + hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x05c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r24, int r25, int r26, java.lang.String r27, com.tencent.p014mm.network.C114799u r28, byte[] r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            boolean r4 = r0.f288521s
            java.lang.String r5 = "] "
            java.lang.String r6 = "MicroMsg.NetSceneDownloadVideo"
            java.lang.String r7 = ","
            if (r4 == 0) goto L_0x0054
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "onGYNetEnd Call Stop by Service  ["
            r4.append(r8)
            java.lang.String r8 = r0.f288511f
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            long r8 = r8.f288556c
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            java.lang.String r8 = r8.mo137701e()
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r7 = r0.f288515j
            java.lang.String r7 = r7.mo137707k()
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0054:
            r4 = 3
            r8 = 1
            r9 = 0
            if (r1 != r4) goto L_0x0070
            r4 = -1
            if (r2 != r4) goto L_0x0070
            java.lang.String r4 = r0.f288517o
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0070
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r2 = r0.f288517o
            r1[r9] = r2
            java.lang.String r2 = "cdntra using cdn trans,  wait cdn service callback! clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r1)
            return
        L_0x0070:
            r4 = r28
            ob0.c r4 = (ob0.C47350c) r4
            ob0.c$d r10 = r4.f127056b
            pe3.a r10 = r10.f127083a
            te3.t50 r10 = (te3.C51345t50) r10
            ob0.c$c r4 = r4.f127055a
            pe3.a r4 = r4.f127080a
            te3.s50 r4 = (te3.C51200s50) r4
            java.lang.String r11 = r0.f288511f
            hd0.n0 r11 = hd0.C98429r0.m127818i(r11)
            r0.f288515j = r11
            if (r11 != 0) goto L_0x00af
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERR: onGYNetEnd Get INFO FAILED :"
            r4.append(r5)
            java.lang.String r5 = r0.f288511f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            int r4 = p206nj.C76861g.m92658a()
            int r9 = r9 - r4
            int r9 = r9 + -10000
            r0.f288520r = r9
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x00af:
            int r11 = r11.f288562i
            r12 = 113(0x71, float:1.58E-43)
            if (r11 != r12) goto L_0x00f7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "onGYNetEnd STATUS PAUSE ["
            r4.append(r8)
            java.lang.String r8 = r0.f288511f
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            long r8 = r8.f288556c
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            java.lang.String r8 = r8.mo137701e()
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r7 = r0.f288515j
            java.lang.String r7 = r7.mo137707k()
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x00f7:
            r13 = 112(0x70, float:1.57E-43)
            java.lang.String r14 = " ["
            if (r11 == r13) goto L_0x0148
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "ERR: onGYNetEnd STATUS ERR: status:"
            r4.append(r8)
            hd0.n0 r8 = r0.f288515j
            int r8 = r8.f288562i
            r4.append(r8)
            r4.append(r14)
            java.lang.String r8 = r0.f288511f
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            long r8 = r8.f288556c
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            java.lang.String r8 = r8.mo137701e()
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r7 = r0.f288515j
            java.lang.String r7 = r7.mo137707k()
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0148:
            r11 = 4
            java.lang.String r13 = " errCode:"
            if (r1 != r11) goto L_0x01ae
            if (r2 == 0) goto L_0x01ae
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 111(0x6f, double:5.5E-322)
            r18 = 208(0xd0, double:1.03E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "ERR: onGYNetEnd SERVER FAILED errtype:"
            r4.append(r8)
            r4.append(r1)
            r4.append(r13)
            r4.append(r2)
            r4.append(r14)
            java.lang.String r8 = r0.f288511f
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            long r8 = r8.f288556c
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            java.lang.String r8 = r8.mo137701e()
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r7 = r0.f288515j
            java.lang.String r7 = r7.mo137707k()
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x01ae:
            if (r1 != 0) goto L_0x0624
            if (r2 == 0) goto L_0x01b4
            goto L_0x0624
        L_0x01b4:
            te3.qv3 r11 = r10.f141961g
            pe3.b r11 = r11.f140574f
            byte[] r11 = r11.f257327a
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r11)
            if (r11 == 0) goto L_0x0206
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "ERR: onGYNetEnd Recv BUF ZERO length  ["
            r4.append(r8)
            java.lang.String r8 = r0.f288511f
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            long r8 = r8.f288556c
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r8 = r0.f288515j
            java.lang.String r8 = r8.mo137701e()
            r4.append(r8)
            r4.append(r7)
            hd0.n0 r7 = r0.f288515j
            java.lang.String r7 = r7.mo137707k()
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0206:
            int r11 = r10.f141960f
            int r12 = r4.f141331f
            java.lang.String r13 = " reqStartPos:"
            if (r11 == r12) goto L_0x0264
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ERR: onGYNetEnd OFFSET ERROR respStartPos:"
            r8.append(r9)
            int r9 = r10.f141960f
            r8.append(r9)
            r8.append(r13)
            int r4 = r4.f141331f
            r8.append(r4)
            r8.append(r14)
            java.lang.String r4 = r0.f288511f
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            long r9 = r4.f288556c
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137701e()
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137707k()
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x0264:
            int r12 = r10.f141959e
            int r15 = r4.f141330e
            java.lang.String r8 = "ERR: onGYNetEnd respTotal:"
            if (r12 == r15) goto L_0x02c2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            int r8 = r10.f141959e
            r9.append(r8)
            java.lang.String r8 = " reqTotal:"
            r9.append(r8)
            int r4 = r4.f141330e
            r9.append(r4)
            r9.append(r14)
            java.lang.String r4 = r0.f288511f
            r9.append(r4)
            r9.append(r7)
            hd0.n0 r4 = r0.f288515j
            long r10 = r4.f288556c
            r9.append(r10)
            r9.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137701e()
            r9.append(r4)
            r9.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137707k()
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x02c2:
            if (r15 >= r11) goto L_0x031a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            int r8 = r10.f141959e
            r9.append(r8)
            java.lang.String r8 = " respStartPos:"
            r9.append(r8)
            int r4 = r4.f141331f
            r9.append(r4)
            r9.append(r14)
            java.lang.String r4 = r0.f288511f
            r9.append(r4)
            r9.append(r7)
            hd0.n0 r4 = r0.f288515j
            long r10 = r4.f288556c
            r9.append(r10)
            r9.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137701e()
            r9.append(r4)
            r9.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137707k()
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x031a:
            long r11 = r10.f141962h
            r28 = r10
            long r9 = r4.f141334i
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x037e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ERR: onGYNetEnd respMsgId:"
            r8.append(r9)
            r10 = r28
            long r9 = r10.f141962h
            r8.append(r9)
            java.lang.String r9 = " reqMsgId:"
            r8.append(r9)
            long r9 = r4.f141334i
            r8.append(r9)
            r8.append(r14)
            java.lang.String r4 = r0.f288511f
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            long r9 = r4.f288556c
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137701e()
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137707k()
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x037e:
            r10 = r28
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onGYNetEnd respBuf:"
            r8.append(r9)
            te3.qv3 r9 = r10.f141961g
            int r9 = r9.f140572d
            r8.append(r9)
            r8.append(r13)
            int r9 = r4.f141331f
            r8.append(r9)
            java.lang.String r9 = " totallen:"
            r8.append(r9)
            int r9 = r4.f141330e
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = r0.f288511f
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r9 = r0.f288515j
            long r11 = r9.f288556c
            r8.append(r11)
            r8.append(r7)
            hd0.n0 r9 = r0.f288515j
            java.lang.String r9 = r9.mo137701e()
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r9 = r0.f288515j
            java.lang.String r9 = r9.mo137707k()
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r8)
            hd0.o0 r8 = hd0.C98398h0.Bx0()
            java.lang.String r9 = r0.f288511f
            java.lang.String r8 = r8.mo137728q(r9)
            int r4 = r4.f141331f
            te3.qv3 r9 = r10.f141961g
            pe3.b r9 = r9.f140574f
            byte[] r9 = r9.mo123703f()
            int r4 = hd0.C98410o0.m127733x(r8, r4, r9)
            if (r4 >= 0) goto L_0x043e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ERR: onGYNetEnd WRITEFILE RET:"
            r8.append(r9)
            r8.append(r4)
            r8.append(r14)
            java.lang.String r4 = r0.f288511f
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            long r9 = r4.f288556c
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137701e()
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137707k()
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x043e:
            hd0.n0 r8 = r0.f288515j
            int r8 = r8.f288559f
            if (r4 <= r8) goto L_0x049c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ERR: onGYNetEnd WRITEFILE newOffset:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = " totalLen:"
            r8.append(r4)
            hd0.n0 r4 = r0.f288515j
            int r4 = r4.f288559f
            r8.append(r4)
            r8.append(r14)
            java.lang.String r4 = r0.f288511f
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            long r9 = r4.f288556c
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137701e()
            r8.append(r4)
            r8.append(r7)
            hd0.n0 r4 = r0.f288515j
            java.lang.String r4 = r4.mo137707k()
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
            java.lang.String r4 = r0.f288511f
            hd0.C98429r0.m127799E(r4)
            ob0.n r4 = r0.f288509d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        L_0x049c:
            java.lang.String r8 = r0.f288511f
            hd0.n0 r9 = hd0.C98429r0.m127818i(r8)
            java.lang.String r10 = "MicroMsg.VideoLogic"
            if (r9 != 0) goto L_0x04cd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "ERR:"
            r9.append(r11)
            java.lang.String r11 = p206nj.C76861g.m92660c()
            r9.append(r11)
            java.lang.String r11 = " getinfo failed: "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r8)
            int r8 = p206nj.C76861g.m92658a()
        L_0x04ca:
            r1 = 0
            goto L_0x056e
        L_0x04cd:
            r9.f288558e = r4
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r9.f288564k = r11
            r11 = 1040(0x410, float:1.457E-42)
            r9.f288548P = r11
            int r11 = r9.f288559f
            java.lang.String r12 = " status:"
            java.lang.String r13 = " total:"
            java.lang.String r15 = " newsize:"
            if (r11 <= 0) goto L_0x0528
            if (r4 < r11) goto L_0x0528
            hd0.C98429r0.m127807M(r9)
            r11 = 199(0xc7, float:2.79E-43)
            r9.f288562i = r11
            int r11 = r9.f288548P
            r11 = r11 | 256(0x100, float:3.59E-43)
            r9.f288548P = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "END!!!  updateRecv  file:"
            r11.append(r1)
            r11.append(r8)
            r11.append(r15)
            r11.append(r4)
            r11.append(r13)
            int r1 = r9.f288559f
            r11.append(r1)
            r11.append(r12)
            int r1 = r9.f288562i
            r11.append(r1)
            java.lang.String r1 = " netTimes:"
            r11.append(r1)
            int r1 = r9.f288568o
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r1 = 1
            goto L_0x0529
        L_0x0528:
            r1 = 0
        L_0x0529:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r28 = r1
            java.lang.String r1 = "updateRecv "
            r11.append(r1)
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r11.append(r1)
            java.lang.String r1 = " file:"
            r11.append(r1)
            r11.append(r8)
            r11.append(r15)
            r11.append(r4)
            r11.append(r13)
            int r1 = r9.f288559f
            r11.append(r1)
            r11.append(r12)
            int r1 = r9.f288562i
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
            boolean r1 = hd0.C98429r0.m127808N(r9)
            if (r1 != 0) goto L_0x0570
            int r8 = p206nj.C76861g.m92658a()
            goto L_0x04ca
        L_0x056e:
            int r1 = r1 - r8
            goto L_0x0572
        L_0x0570:
            r1 = r28
        L_0x0572:
            if (r1 >= 0) goto L_0x05c5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ERR: onGYNetEnd updateAfterRecv Ret:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = " newOffset :"
            r8.append(r1)
            r8.append(r4)
            r8.append(r14)
            java.lang.String r1 = r0.f288511f
            r8.append(r1)
            r8.append(r7)
            hd0.n0 r1 = r0.f288515j
            long r9 = r1.f288556c
            r8.append(r9)
            r8.append(r7)
            hd0.n0 r1 = r0.f288515j
            java.lang.String r1 = r1.mo137701e()
            r8.append(r1)
            r8.append(r7)
            hd0.n0 r1 = r0.f288515j
            java.lang.String r1 = r1.mo137707k()
            r8.append(r1)
            r8.append(r5)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            ob0.n r1 = r0.f288509d
            r4 = r25
            r1.onSceneEnd(r4, r2, r3, r0)
            return
        L_0x05c5:
            r4 = r25
            r5 = 1
            if (r1 != r5) goto L_0x0612
            hd0.n0 r1 = r0.f288515j
            hd0.C98384a.m127689a(r1, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "!!!FIN ["
            r1.append(r5)
            java.lang.String r5 = r0.f288511f
            r1.append(r5)
            r1.append(r7)
            hd0.n0 r5 = r0.f288515j
            long r8 = r5.f288556c
            r1.append(r8)
            r1.append(r7)
            hd0.n0 r5 = r0.f288515j
            java.lang.String r5 = r5.mo137701e()
            r1.append(r5)
            r1.append(r7)
            hd0.n0 r5 = r0.f288515j
            java.lang.String r5 = r5.mo137707k()
            r1.append(r5)
            java.lang.String r5 = "]"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            ob0.n r1 = r0.f288509d
            r1.onSceneEnd(r4, r2, r3, r0)
            return
        L_0x0612:
            boolean r1 = r0.f288521s
            if (r1 == 0) goto L_0x061c
            ob0.n r1 = r0.f288509d
            r1.onSceneEnd(r4, r2, r3, r0)
            return
        L_0x061c:
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f288527y
            r2 = 0
            r1.startTimer(r2)
            return
        L_0x0624:
            r4 = r1
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 111(0x6f, double:5.5E-322)
            r18 = 207(0xcf, double:1.023E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "ERR: onGYNetEnd SERVER FAILED (SET PAUSE) errtype:"
            r1.append(r8)
            r1.append(r4)
            r1.append(r13)
            r1.append(r2)
            r1.append(r14)
            java.lang.String r8 = r0.f288511f
            r1.append(r8)
            r1.append(r7)
            hd0.n0 r8 = r0.f288515j
            long r8 = r8.f288556c
            r1.append(r8)
            r1.append(r7)
            hd0.n0 r8 = r0.f288515j
            java.lang.String r8 = r8.mo137701e()
            r1.append(r8)
            r1.append(r7)
            hd0.n0 r7 = r0.f288515j
            java.lang.String r7 = r7.mo137707k()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            hd0.n0 r1 = r0.f288515j
            r1.f288562i = r12
            hd0.C98429r0.m127808N(r1)
            ob0.n r1 = r0.f288509d
            r1.onSceneEnd(r4, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98404n.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 2500;
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
        C51200s50 s502 = (C51200s50) ((C47350c) uVar).f127055a.f127080a;
        if (s502.f141334i > 0 && (i = s502.f141331f) >= 0 && (i2 = s502.f141330e) > 0 && i2 > i) {
            return y$$d.EOk;
        }
        Log.m105920e("MicroMsg.NetSceneDownloadVideo", "ERR: SECURITY CHECK FAILED [" + this.f288511f + "," + this.f288515j.f288556c + "," + this.f288515j.mo137701e() + "," + this.f288515j.mo137707k() + "] ");
        C98429r0.m127799E(this.f288511f);
        return y$$d.EFailed;
    }

    public void setSecurityCheckError(y$$c y__c) {
        C115669n.INSTANCE.idkeyStat(111, 211, 1, false);
        C98429r0.m127799E(this.f288511f);
    }

    public C98404n(String str, boolean z) {
        this.f288515j = null;
        this.f288517o = "";
        this.f288518p = 0;
        this.f288519q = 0;
        this.f288520r = 0;
        this.f288521s = false;
        this.f288522t = true;
        this.f288523u = null;
        this.f288524v = 0;
        this.f288525w = 0;
        this.f288526x = new C98405a();
        this.f288527y = new MTimerHandler(new C98407c(), false);
        Assert.assertTrue(str != null);
        this.f288511f = str;
        this.f288513h = z;
        Log.m105925i("MicroMsg.NetSceneDownloadVideo", "%s NetSceneDownloadVideo:  file [%s] isCompleteOnlineVideo [%b]", mo137696l1(), str, Boolean.valueOf(z));
    }
}
