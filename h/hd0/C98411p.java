package hd0;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.mmdata.rpt.PreloadVideoInfoStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30731d4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import i21.C98590g;
import ig3.C98688j;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p509eu.C97708g;
import p663qo.C101213l;
import u13.C101938c;

/* renamed from: hd0.p */
public class C98411p {

    /* renamed from: a */
    public boolean f288593a;

    /* renamed from: b */
    public long f288594b;

    /* renamed from: c */
    public String f288595c;

    /* renamed from: d */
    public String f288596d;

    /* renamed from: e */
    public String f288597e;

    /* renamed from: f */
    public String f288598f;

    /* renamed from: g */
    public C98127h f288599g;

    /* renamed from: h */
    public long f288600h;

    /* renamed from: i */
    public long f288601i;

    /* renamed from: j */
    public long f288602j;

    /* renamed from: k */
    public int f288603k;

    /* renamed from: l */
    public String f288604l;

    /* renamed from: m */
    public long f288605m;

    /* renamed from: n */
    public boolean f288606n;

    /* renamed from: o */
    public C98688j f288607o;

    /* renamed from: p */
    public int f288608p = 0;

    /* renamed from: q */
    public C98414c f288609q;

    /* renamed from: r */
    public C98124g.C98125a f288610r = new C98412a();

    /* renamed from: s */
    public C98124g.C98126b f288611s = new C98413b();

    /* renamed from: hd0.p$a */
    public class C98412a implements C98124g.C98125a {
        public C98412a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            if (i != 0) {
                Log.m105929w("MicroMsg.NetScenePreloadVideoFake", "%d preload video error startRet[%d]", Integer.valueOf(C98411p.this.hashCode()), Integer.valueOf(i));
                C98411p pVar = C98411p.this;
                C98414c cVar2 = pVar.f288609q;
                if (cVar2 != null) {
                    cVar2.mo131025a(pVar, false, 0, 0);
                }
            }
            if (cVar != null) {
                Log.m105919d("MicroMsg.NetScenePreloadVideoFake", "%d preload video[%d %d] mediaId[%s]", Integer.valueOf(C98411p.this.hashCode()), Long.valueOf(cVar.field_finishedLength), Long.valueOf(cVar.field_toltalLength), str);
            }
            if (dVar != null) {
                Log.m105925i("MicroMsg.NetScenePreloadVideoFake", "%d preload video error [%d]", Integer.valueOf(C98411p.this.hashCode()), Integer.valueOf(dVar.field_retCode));
                if (dVar.field_retCode != 0) {
                    C98411p pVar2 = C98411p.this;
                    C98414c cVar3 = pVar2.f288609q;
                    if (cVar3 != null) {
                        cVar3.mo131025a(pVar2, false, 0, 0);
                    }
                } else {
                    Log.m105925i("MicroMsg.NetScenePreloadVideoFake", "%d preload video download all video file", Integer.valueOf(C98411p.this.hashCode()));
                    C98411p pVar3 = C98411p.this;
                    pVar3.mo137739f(pVar3.f288597e, (int) dVar.field_fileLength, pVar3.f288598f);
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: hd0.p$b */
    public class C98413b implements C98124g.C98126b {
        public C98413b() {
        }

        /* renamed from: b */
        public void mo31987b(String str, C98121d dVar) {
            C98121d dVar2 = dVar;
            boolean z = false;
            if (dVar2 == null) {
                Log.m105929w("MicroMsg.NetScenePreloadVideoFake", "%s onPreload completed but sceneResult is null", Integer.valueOf(C98411p.this.hashCode()));
                C98411p pVar = C98411p.this;
                C98414c cVar = pVar.f288609q;
                if (cVar != null) {
                    cVar.mo131025a(pVar, false, 0, 0);
                    return;
                }
                return;
            }
            int i = (int) dVar2.field_recvedBytes;
            int i2 = (int) dVar2.field_fileLength;
            Log.m105925i("MicroMsg.NetScenePreloadVideoFake", "%d onPreload Completed [%s] videoInfoName[%s] [%d, %d] videoFormat[%d]", Integer.valueOf(C98411p.this.hashCode()), str, C98411p.this.f288597e, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(dVar2.field_videoFormat));
            if (i > 0 && i2 > 0) {
                C98411p pVar2 = C98411p.this;
                pVar2.f288602j = (long) pVar2.mo137740g(pVar2.f288597e, i, true);
            }
            C98411p pVar3 = C98411p.this;
            C98414c cVar2 = pVar3.f288609q;
            if (cVar2 != null) {
                if (i > 0 && i2 > 0) {
                    z = true;
                }
                cVar2.mo131025a(pVar3, z, i, i2);
            }
            C98411p.this.f288601i = Util.nowSecond();
            C98411p.this.mo137737d(dVar.mo137408a(), dVar2);
            C98411p pVar4 = C98411p.this;
            if (pVar4.f288593a) {
                C98688j jVar = pVar4.f288607o;
                if (jVar != null) {
                    C87412m.m108594g(jVar, "preloadData");
                    ((C98590g) C86312j.m106911c(C98590g.class)).bq0(3, jVar.f289389a, jVar.f289390b, 0, jVar.f289392d, jVar.f289393e, jVar.f289397i);
                }
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(354, 142, 1, false);
                if (C98411p.this.f288603k == 1) {
                    nVar.idkeyStat(354, 123, 1, false);
                } else {
                    nVar.idkeyStat(354, 124, 1, false);
                }
                nVar.idkeyStat(354, (long) (dVar2.field_videoFormat + 240), 1, false);
                return;
            }
            C115669n.INSTANCE.idkeyStat(354, 143, 1, false);
        }
    }

    /* renamed from: hd0.p$c */
    public interface C98414c {
        /* renamed from: a */
        void mo131025a(C98411p pVar, boolean z, int i, int i2);
    }

    public C98411p(long j) {
        this.f288594b = j;
        this.f288593a = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0304  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo137734a() {
        /*
            r38 = this;
            r0 = r38
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r38.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            long r5 = r0.f288594b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.NetScenePreloadVideoFake"
            java.lang.String r6 = "%d preload begin msgId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            boolean r2 = r0.f288593a
            if (r2 == 0) goto L_0x024a
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            long r8 = r0.f288594b
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r8)
            java.lang.String r8 = r2.f230724G
            eb0.z3$$h r8 = eb0.C75604z3.m90851w(r8)
            r9 = 0
            if (r8 == 0) goto L_0x01f3
            int r10 = r8.f222114u
            if (r10 > 0) goto L_0x0047
            goto L_0x01f3
        L_0x0047:
            java.lang.String r10 = r2.mo108765s2()
            hd0.n0 r11 = hd0.C98429r0.m127818i(r10)
            if (r11 != 0) goto L_0x0053
            goto L_0x0206
        L_0x0053:
            java.lang.String r12 = r11.mo137705i()
            java.lang.String r13 = "msg"
            java.util.Map r12 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r13, r9)
            java.lang.String r13 = "cdntra parse video recv xml failed"
            if (r12 != 0) goto L_0x0067
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r13)
            goto L_0x0206
        L_0x0067:
            java.lang.String r14 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r14 = r12.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 == 0) goto L_0x007a
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r13)
            goto L_0x0206
        L_0x007a:
            java.lang.String r13 = r11.mo137705i()
            java.lang.String r15 = "msgSource"
            gy3.C87412m.m108594g(r13, r15)
            java.lang.String r15 = "msgsource"
            java.util.Map r13 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r13, r15, r9)
            ig3.j r15 = new ig3.j
            r37 = r15
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 2047(0x7ff, float:2.868E-42)
            r36 = 0
            r15.<init>(r16, r18, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36)
            if (r13 == 0) goto L_0x0109
            java.lang.String r15 = ".msgsource.imgmsg_pd.$cdnmidimgurl_size"
            java.lang.Object r15 = r13.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            r6 = 0
            r19 = r10
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r15, r6)
            r15 = r37
            r15.f289391c = r9
            java.lang.String r9 = ".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri"
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)
            r15.f289392d = r9
            java.lang.String r9 = ".msgsource.imgmsg_pd.$cdnmidimgurl_pd"
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)
            r15.f289393e = r9
            java.lang.String r9 = ".msgsource.imgmsg_pd.$cdnbigimgurl_size"
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)
            r15.f289394f = r9
            java.lang.String r9 = ".msgsource.imgmsg_pd.$cdnbigimgurl_pd_pri"
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)
            r15.f289395g = r9
            java.lang.String r9 = ".msgsource.imgmsg_pd.$cdnbigimgurl_pd"
            java.lang.Object r9 = r13.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)
            r15.f289396h = r6
            goto L_0x010d
        L_0x0109:
            r19 = r10
            r15 = r37
        L_0x010d:
            r0.f288607o = r15
            long r6 = r2.mo108774y2()
            r15.f289389a = r6
            ig3.j r6 = r0.f288607o
            java.lang.String r7 = r2.mo101010p2()
            r6.getClass()
            java.lang.String r9 = "<set-?>"
            gy3.C87412m.m108594g(r7, r9)
            r6.f289390b = r7
            ig3.j r6 = r0.f288607o
            long r9 = r2.getCreateTime()
            r6.f289397i = r9
            java.lang.String r2 = ".msg.videomsg.$length"
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)
            java.lang.String r6 = ".msg.videomsg.$md5"
            java.lang.Object r6 = r12.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ".msg.videomsg.$newmd5"
            java.lang.Object r7 = r12.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = ".msg.videomsg.$aeskey"
            java.lang.Object r9 = r12.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = ".msg.videomsg.$fileparam"
            java.lang.Object r10 = r12.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            long r12 = r11.f288563j
            java.lang.String r15 = r11.mo137707k()
            java.lang.String r1 = r11.mo137700d()
            java.lang.String r4 = "downvideo"
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r12, r15, r1)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x017f
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = r11.mo137700d()
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "cdntra genClientId failed not use cdn file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r1)
            goto L_0x0205
        L_0x017f:
            hd0.o0 r4 = hd0.C98398h0.Bx0()
            r12 = r19
            java.lang.String r4 = r4.mo137728q(r12)
            gi.h r13 = new gi.h
            r13.<init>()
            java.lang.String r15 = "task_NetScenePreloadVideoFake"
            r13.f287660d = r15
            r13.f287683S = r12
            r13.f287685T = r6
            r13.f287687U = r2
            r6 = 2
            r13.f287689V = r6
            java.lang.String r6 = r11.mo137701e()
            r13.f287693X = r6
            java.lang.String r6 = r11.mo137707k()
            r13.f287691W = r6
            java.lang.String r6 = r11.mo137707k()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
            if (r6 == 0) goto L_0x01c3
            java.lang.Class<a11.b> r6 = a11.C39478b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            a11.b r6 = (a11.C39478b) r6
            java.lang.String r12 = r11.mo137707k()
            int r6 = r6.mo62080p1(r12)
            goto L_0x01c4
        L_0x01c3:
            r6 = 0
        L_0x01c4:
            r13.f287695Y = r6
            r13.field_mediaId = r1
            r13.field_fullpath = r4
            r1 = 4
            r13.field_fileType = r1
            r13.field_totalLen = r2
            r13.field_aesKey = r9
            r13.field_fileId = r14
            r1 = 2
            r13.field_priority = r1
            r13.field_wxmsgparam = r10
            java.lang.String r2 = r11.mo137707k()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            r13.field_chattype = r2
            r2 = 0
            r13.field_autostart = r2
            int r4 = xb0.C102609h.wx0(r1, r11)
            r13.field_requestVideoFormat = r4
            int r1 = r8.f222114u
            r13.field_preloadRatio = r1
            r13.f287690V0 = r7
            r9 = r13
            goto L_0x0206
        L_0x01f3:
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r4 = r38.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r2 = "%d msgsource is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r1)
        L_0x0205:
            r9 = 0
        L_0x0206:
            if (r9 == 0) goto L_0x0243
            java.lang.String r1 = r9.f287691W
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 == 0) goto L_0x0212
            r1 = 2
            goto L_0x0213
        L_0x0212:
            r1 = 1
        L_0x0213:
            r0.f288603k = r1
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 354(0x162, double:1.75E-321)
            r25 = 140(0x8c, double:6.9E-322)
            r27 = 1
            r29 = 0
            r22 = r1
            r22.idkeyStat(r23, r25, r27, r29)
            int r2 = r0.f288603k
            if (r2 != r5) goto L_0x0236
            r23 = 354(0x162, double:1.75E-321)
            r25 = 121(0x79, double:6.0E-322)
            r27 = 1
            r29 = 0
            r22 = r1
            r22.idkeyStat(r23, r25, r27, r29)
            goto L_0x0243
        L_0x0236:
            r23 = 354(0x162, double:1.75E-321)
            r25 = 122(0x7a, double:6.03E-322)
            r27 = 1
            r29 = 0
            r22 = r1
            r22.idkeyStat(r23, r25, r27, r29)
        L_0x0243:
            gi.h r1 = r0.f288599g
            if (r1 != 0) goto L_0x0262
            r0.f288599g = r9
            goto L_0x0262
        L_0x024a:
            boolean r1 = r0.f288606n
            if (r1 == 0) goto L_0x0250
            r1 = 4
            goto L_0x0251
        L_0x0250:
            r1 = 3
        L_0x0251:
            r0.f288603k = r1
            gi.h r9 = r0.f288599g
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 354(0x162, double:1.75E-321)
            r25 = 141(0x8d, double:6.97E-322)
            r27 = 1
            r29 = 0
            r22.idkeyStat(r23, r25, r27, r29)
        L_0x0262:
            if (r9 != 0) goto L_0x0277
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r2 = r38.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "%d preload task is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r1)
            return r4
        L_0x0277:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ONLINE_VIDEO_INT
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.mo119685f(r2, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 2
            if (r1 != r2) goto L_0x0299
            java.lang.String r1 = "command set do not check media duplication."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x02ee
        L_0x0299:
            int r1 = r9.f287655L
            r2 = 4
            if (r1 != r2) goto L_0x02a0
            r1 = 1
            goto L_0x02a1
        L_0x02a0:
            r1 = 0
        L_0x02a1:
            if (r1 == 0) goto L_0x02a4
            goto L_0x02ee
        L_0x02a4:
            java.lang.String r1 = r9.f287685T
            int r2 = r9.f287687U
            java.lang.Class<eu.g> r4 = p509eu.C97708g.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            eu.g r4 = (p509eu.C97708g) r4
            eu.d r4 = r4.mo58053A1()
            com.tencent.mm.storage.d4 r4 = (com.tencent.p014mm.storage.C30731d4) r4
            java.lang.String r4 = r4.mo57627a(r1, r2)
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            int r7 = (int) r6
            int r6 = r2 - r7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 != 0) goto L_0x02ee
            if (r6 < 0) goto L_0x02ee
            r7 = 16
            if (r6 > r7) goto L_0x02ee
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r6[r8] = r7
            r6[r5] = r1
            r7 = 2
            r6[r7] = r4
            java.lang.String r7 = "it had download this video[%d, %s, %s]."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            java.lang.String r6 = r9.field_fullpath
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r6)
            java.lang.String r4 = r9.f287683S
            r0.mo137739f(r4, r2, r1)
            r1 = 1
            goto L_0x02ef
        L_0x02ee:
            r1 = 0
        L_0x02ef:
            if (r1 == 0) goto L_0x0304
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r2 = r38.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "%d it already had video file"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            return r4
        L_0x0304:
            gi.g$b r1 = r0.f288611s
            r9.f287656M = r1
            gi.g$a r1 = r0.f288610r
            r9.f287662f = r1
            r1 = 2
            r9.f287654K = r1
            java.lang.String r2 = r9.f287685T
            r0.f288598f = r2
            java.lang.String r2 = r9.field_mediaId
            r0.f288596d = r2
            java.lang.String r2 = r9.f287683S
            r0.f288597e = r2
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f288600h = r6
            java.lang.String r2 = r9.f287690V0
            r0.f288604l = r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r38.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            r1[r5] = r9
            java.lang.String r2 = "%d send to cdn service task[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            java.lang.Class<qo.l> r1 = p663qo.C101213l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qo.l r1 = (p663qo.C101213l) r1
            r1.xf0(r9)
            ig3.j r1 = r0.f288607o
            if (r1 == 0) goto L_0x0368
            java.lang.Class<i21.g> r2 = i21.C98590g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r6 = r2
            i21.g r6 = (i21.C98590g) r6
            long r9 = r1.f289389a
            java.lang.String r11 = r1.f289390b
            r12 = 0
            long r14 = r1.f289392d
            long r2 = r1.f289393e
            long r7 = r1.f289397i
            r16 = 3
            r18 = r7
            r7 = r16
            r16 = r2
            r6.mo137961JT(r7, r9, r11, r12, r14, r16, r18)
        L_0x0368:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98411p.mo137734a():boolean");
    }

    /* renamed from: b */
    public int mo137735b(C98414c cVar) {
        this.f288609q = cVar;
        try {
            if (mo137734a()) {
                return 0;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetScenePreloadVideoFake", e, "", new Object[0]);
        }
        this.f288609q = null;
        return -1;
    }

    /* renamed from: c */
    public String mo137736c() {
        if (!this.f288593a) {
            return this.f288595c;
        }
        return this.f288594b + "";
    }

    /* renamed from: d */
    public final void mo137737d(String str, C98121d dVar) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f288600h);
        stringBuffer.append(",");
        stringBuffer.append(this.f288601i);
        stringBuffer.append(",");
        stringBuffer.append(this.f288602j);
        stringBuffer.append(",");
        stringBuffer.append(this.f288604l);
        stringBuffer.append(",");
        stringBuffer.append(this.f288603k);
        stringBuffer.append(",");
        try {
            i = (int) ((this.f288602j / 1024) / (this.f288601i - this.f288600h));
        } catch (Exception unused) {
            i = 0;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(this.f288599g.f287693X);
        stringBuffer.append(",");
        stringBuffer.append(this.f288599g.f287691W);
        stringBuffer.append(",");
        stringBuffer.append(this.f288599g.f287695Y);
        stringBuffer.append(",");
        stringBuffer.append(this.f288599g.field_fileId);
        stringBuffer.append(",");
        stringBuffer.append(this.f288599g.f287705p0);
        stringBuffer.append(",");
        stringBuffer.append(C101938c.m134167a(this.f288599g.f287682R0));
        stringBuffer.append(dVar.f287611c);
        CdnLogic.SNSVideoProfile sNSVideoProfile = dVar.f287622n;
        stringBuffer.append(sNSVideoProfile != null ? sNSVideoProfile.experimentalGroupID : 0);
        String stringBuffer2 = stringBuffer.toString();
        Log.m105919d("MicroMsg.NetScenePreloadVideoFake", "%d rpt content[%s]", Integer.valueOf(hashCode()), stringBuffer2);
        new PreloadVideoInfoStruct(stringBuffer2).mo86054n();
    }

    /* renamed from: e */
    public void mo137738e() {
        Log.m105925i("MicroMsg.NetScenePreloadVideoFake", "%d stop preload video[%s]", Integer.valueOf(hashCode()), this.f288596d);
        if (!Util.isNullOrNil(this.f288596d)) {
            C98121d dVar = new C98121d();
            ((C101213l) C86312j.m106911c(C101213l.class)).mo140299Lh(this.f288596d, dVar);
            this.f288601i = Util.nowSecond();
            this.f288602j = (long) mo137740g(this.f288597e, (int) dVar.field_recvedBytes, false);
            mo137737d(dVar.mo137408a(), dVar);
        }
        this.f288609q = null;
    }

    /* renamed from: f */
    public final void mo137739f(String str, int i, String str2) {
        Log.m105925i("MicroMsg.NetScenePreloadVideoFake", "%d update finish video [%s] [%d] [%s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), str2);
        if (C98429r0.m127818i(str) != null) {
            C98429r0.m127806L(str, i);
            if (!Util.isNullOrNil(str2)) {
                String q = C98398h0.Bx0().mo137728q(str);
                if (Util.isNullOrNil(str2) || i <= 0 || Util.isNullOrNil(q) || !C86013q1.m106450k(q)) {
                    Log.m105929w("MicroMsg.NetScenePreloadVideoFake", "insert media duplication but args is error.[%d, %s, %s]", Integer.valueOf(i), str2, q);
                    return;
                }
                ((C30731d4) ((C97708g) C86312j.m106911c(C97708g.class)).mo58053A1()).mo57629d(str2, i, q);
            }
        }
    }

    /* renamed from: g */
    public final int mo137740g(String str, int i, boolean z) {
        C98408n0 i2 = C98429r0.m127818i(str);
        if (i2 == null) {
            return i;
        }
        int i3 = i2.f288539G;
        if (z) {
            i2.f288539G = i;
        } else {
            i2.f288539G = i3 + i;
        }
        Log.m105925i("MicroMsg.NetScenePreloadVideoFake", "update video info[%s] preload[%d %d %d] isFinish[%b] ", str, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2.f288539G), Boolean.valueOf(z));
        i2.f288564k = Util.nowSecond();
        i2.f288548P = 1025;
        C98429r0.m127808N(i2);
        if (z) {
            i -= i3;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public C98411p(C98127h hVar, String str) {
        this.f288599g = hVar;
        this.f288595c = str;
        this.f288593a = false;
    }
}
