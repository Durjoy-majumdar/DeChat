package qg2;

import android.net.Uri;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import i21.C98591h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C47355o;
import ob0.y$$d;
import p1081gi.C98120c;
import p663qo.C77384i;
import p753xp.C102704b;
import p763ym.C53537i;
import p763ym.C53543s;
import p867wp.C102479b;
import t90.C77878b;
import te3.C50783p50;
import te3.C64603o50;
import zt3.C119157j;

/* renamed from: qg2.p */
public class C77335p extends C117747y implements C1311n {

    /* renamed from: B */
    public static p$$d f225461B;

    /* renamed from: A */
    public C55384i f225462A;

    /* renamed from: d */
    public C47350c f225463d;

    /* renamed from: e */
    public C11385n f225464e;

    /* renamed from: f */
    public C47355o f225465f;

    /* renamed from: g */
    public C72683d f225466g;

    /* renamed from: h */
    public long f225467h;

    /* renamed from: i */
    public String f225468i;

    /* renamed from: j */
    public long f225469j;

    /* renamed from: n */
    public C72963f4 f225470n;

    /* renamed from: o */
    public String f225471o;

    /* renamed from: p */
    public long f225472p;

    /* renamed from: q */
    public String f225473q;

    /* renamed from: r */
    public int f225474r;

    /* renamed from: s */
    public int f225475s;

    /* renamed from: t */
    public boolean f225476t;

    /* renamed from: u */
    public boolean f225477u;

    /* renamed from: v */
    public int f225478v;

    /* renamed from: w */
    public long f225479w;

    /* renamed from: x */
    public int f225480x;

    /* renamed from: y */
    public boolean f225481y;

    /* renamed from: z */
    public C55384i f225482z;

    public C77335p(String str, C47355o oVar) {
        this(str, 0, oVar, 0);
    }

    /* renamed from: j1 */
    public static void m93214j1(C77335p pVar, C92798v vVar) {
        C77335p pVar2 = pVar;
        C92798v vVar2 = vVar;
        Class cls = C53543s.class;
        Class cls2 = C75700k0.class;
        Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "CdnPLCJavaHelperDownloadListener %s %s %s", Long.valueOf(pVar2.f225469j), vVar2.f267130a, Integer.valueOf(vVar2.f267132c));
        int ordinal = vVar2.f267130a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    C72683d a = C77331b.m93197a(pVar2.f225468i, pVar2.f225469j);
                    if (a != null) {
                        pVar2.f225466g = a;
                    }
                    boolean x = C86013q1.m106463x(pVar2.f225473q, pVar2.f225466g.field_fileFullPath);
                    long l = C86013q1.m106451l(pVar2.f225466g.field_fileFullPath);
                    C72683d dVar = pVar2.f225466g;
                    dVar.field_status = 199;
                    dVar.field_offset = l;
                    dVar.field_totalLen = l;
                    ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(pVar2.f225466g, new String[0]);
                    Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "CdnPLCJavaHelperDownloadListener checkDupLocal success msgId:%s moveFileResult:%s finalPath:%s diskFileLength:%s", Long.valueOf(pVar2.f225469j), Boolean.valueOf(x), pVar2.f225466g.field_fileFullPath, Long.valueOf(l));
                    if (pVar2.f225465f != null) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C77338s(pVar2));
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(198, 45, pVar2.f225466g.field_totalLen, false);
                    nVar2.idkeyStat(198, 46, 1, false);
                    C72963f4 f4Var = pVar2.f225470n;
                    nVar.idkeyStat(198, C72996z1.m85820U5(f4Var == null ? "" : f4Var.mo108768t()) ? 48 : 47, 1, false);
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(pVar2.f225466g.field_msgInfoId);
                    if (b002.getStatus() == 5) {
                        b002.mo100991d(3);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(b002.getMsgId(), b002);
                    } else {
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).mo101123jo(new C75875l.C45886e(b002.mo108768t(), "update", b002, 0));
                    }
                    pVar2.mo107461k1(0, 0, "", pVar2);
                    return;
                } else if (ordinal != 3) {
                    if (ordinal == 7 || ordinal == 8) {
                        if (pVar.mo107464p1()) {
                            pVar2.mo107461k1(0, 0, "", pVar2);
                            return;
                        }
                        C77331b.m93200d(pVar2.f225466g.systemRowid);
                        pVar2.mo107461k1(3, -1, "", pVar2);
                        return;
                    } else if (ordinal != 11) {
                        return;
                    }
                } else if (vVar2.f267134e != null) {
                    C72683d a2 = C77331b.m93197a(pVar2.f225468i, pVar2.f225469j);
                    if (a2 != null) {
                        pVar2.f225466g = a2;
                    }
                    C72683d dVar2 = pVar2.f225466g;
                    C98120c cVar = vVar2.f267134e;
                    long j = cVar.field_finishedLength;
                    dVar2.field_offset = j;
                    dVar2.field_totalLen = cVar.field_toltalLength;
                    Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "CdnPLCJavaHelperDownloadListener progress %s/%s offset:%s", Long.valueOf(j), Long.valueOf(vVar2.f267134e.field_toltalLength), Long.valueOf(pVar2.f225466g.field_offset));
                    ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(pVar2.f225466g, new String[0]);
                    if (pVar2.f225465f != null) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C77336q(pVar2));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else if (vVar2.f267135f != null) {
                C72683d a3 = C77331b.m93197a(pVar2.f225468i, pVar2.f225469j);
                if (a3 != null) {
                    pVar2.f225466g = a3;
                }
                boolean x2 = C86013q1.m106463x(pVar2.f225473q, pVar2.f225466g.field_fileFullPath);
                long l2 = C86013q1.m106451l(pVar2.f225466g.field_fileFullPath);
                String str = "";
                Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "CdnPLCJavaHelperDownloadListener download success msgId:%s moveFileResult:%s finalPath:%s cdnFileLength:%s diskFileLength:%s", Long.valueOf(pVar2.f225469j), Boolean.valueOf(x2), pVar2.f225466g.field_fileFullPath, Long.valueOf(vVar2.f267135f.field_fileLength), Long.valueOf(l2));
                C72683d dVar3 = pVar2.f225466g;
                dVar3.field_status = 199;
                dVar3.field_offset = l2;
                dVar3.field_totalLen = l2;
                ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(pVar2.f225466g, new String[0]);
                if (pVar2.f225465f != null) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C77337r(pVar2));
                }
                C115669n nVar3 = C115669n.INSTANCE;
                C115669n nVar4 = nVar3;
                nVar4.idkeyStat(198, 45, pVar2.f225466g.field_totalLen, false);
                nVar4.idkeyStat(198, 46, 1, false);
                C72963f4 f4Var2 = pVar2.f225470n;
                nVar3.idkeyStat(198, C72996z1.m85820U5(f4Var2 == null ? str : f4Var2.mo108768t()) ? 48 : 47, 1, false);
                C72963f4 b003 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(pVar2.f225466g.field_msgInfoId);
                if (b003.getStatus() == 5) {
                    b003.mo100991d(3);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(b003.getMsgId(), b003);
                } else {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).mo101123jo(new C75875l.C45886e(b003.mo108768t(), "update", b003, 0));
                }
                pVar2.mo107461k1(0, 0, str, pVar2);
                return;
            } else {
                pVar2.mo107461k1(3, -1, "", pVar2);
                return;
            }
        }
        String str2 = "";
        if (pVar.mo107464p1()) {
            pVar2.mo107461k1(0, 0, str2, pVar2);
            return;
        }
        C77331b.m93200d(pVar2.f225466g.systemRowid);
        pVar2.mo107461k1(3, vVar2.f267132c, str2, pVar2);
    }

    /* renamed from: l1 */
    public static boolean m93215l1(C72963f4 f4Var, String str) {
        Class cls = C53543s.class;
        Class cls2 = C75700k0.class;
        if (f4Var == null) {
            Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish msgInfo is null");
            return false;
        }
        Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish msgId:%s, msgSvrId:%s", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.mo108774y2()));
        C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(f4Var.getMsgId());
        if (Yt == null) {
            return false;
        }
        String m1 = m93216m1(Yt.field_createTime, f4Var.mo108768t(), f4Var.getMsgId());
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        Uri n2 = C116299g2.m163858n(Yt.field_fileFullPath);
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
        if (l.mo177810a() && l2.mo177810a()) {
            try {
                l2.f348991a.mo119946t(l2.f348992b, l.f348991a, l.f348992b);
            } catch (IOException unused) {
            }
        }
        Yt.field_status = 199;
        Yt.field_offset = Yt.field_totalLen;
        Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "fileLanDownloadFinish mediaId:%s, updateRsult:%s", Util.nullAs(m1, ""), Boolean.valueOf(((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).update(Yt, new String[0])));
        C115669n nVar = C115669n.INSTANCE;
        C115669n nVar2 = nVar;
        nVar2.idkeyStat(198, 45, Yt.field_totalLen, false);
        nVar2.idkeyStat(198, 46, 1, false);
        nVar.idkeyStat(198, C72996z1.m85820U5(f4Var.mo108768t()) ? 48 : 47, 1, false);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(Yt.field_msgInfoId);
        if (b002.getStatus() == 5 || b002.f230742Z != 0) {
            b002.mo100991d(3);
            b002.mo108734N2(0);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(b002.getMsgId(), b002);
        } else {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).mo101123jo(new C75875l.C45886e(b002.mo108768t(), "update", b002, 0));
        }
        return true;
    }

    /* renamed from: m1 */
    public static String m93216m1(long j, String str, long j2) {
        return C1297x.m1387b("downattach", j, str, j2 + "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0319  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r18, ob0.C11385n r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Class<ym.s> r2 = p763ym.C53543s.class
            r3 = r19
            r0.f225464e = r3
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f225466g
            r4 = -1
            java.lang.String r5 = "MicroMsg.NetSceneDownloadAppAttach"
            if (r3 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " get info failed mediaId:"
            r1.append(r2)
            java.lang.String r2 = r0.f225468i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            return r4
        L_0x0037:
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            long r6 = r0.f225469j
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r6)
            r0.f225470n = r3
            long r6 = r3.getMsgId()
            long r8 = r0.f225469j
            r3 = 1
            r10 = 2
            r11 = 0
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0089
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " get msginfo failed mediaId:%s  msgId:%d"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r6 = r0.f225468i
            r2[r11] = r6
            long r6 = r0.f225469j
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2[r3] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r2)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            return r4
        L_0x0089:
            long r6 = r0.f225472p
            r8 = 0
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x009b
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f225472p = r6
            com.tencent.mm.pluginsdk.model.app.d r6 = r0.f225466g
            long r6 = r6.field_offset
        L_0x009b:
            long r6 = r0.f225479w
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x00cc
            ob0.c r2 = r0.f225463d
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            te3.o50 r2 = (te3.C64603o50) r2
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r2.f184623g = r3
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f225466g
            long r4 = r3.field_totalLen
            int r5 = (int) r4
            r2.f184624h = r5
            long r3 = r3.field_offset
            int r4 = (int) r3
            r2.f184625i = r4
            r2.f184626j = r11
            r3 = 40
            r2.f184629p = r3
            long r3 = r0.f225479w
            r2.f184631r = r3
            ob0.c r2 = r0.f225463d
            int r1 = r0.dispatch(r1, r2, r0)
            return r1
        L_0x00cc:
            com.tencent.mm.storage.f4 r6 = r0.f225470n
            java.lang.String r6 = r6.getContent()
            com.tencent.mm.storage.f4 r7 = r0.f225470n
            java.lang.String r7 = r7.mo108768t()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x010a
            com.tencent.mm.storage.f4 r7 = r0.f225470n
            java.lang.String r7 = r7.getContent()
            int r7 = eb0.C75604z3.m90848t(r7)
            if (r7 == r4) goto L_0x010a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.storage.f4 r12 = r0.f225470n
            java.lang.String r12 = r12.getContent()
            r6.append(r12)
            java.lang.String r12 = " "
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            int r7 = r7 + r10
            java.lang.String r6 = r6.substring(r7)
            java.lang.String r6 = r6.trim()
        L_0x010a:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r6)
            r7 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r7)
            r7 = 3
            if (r6 != 0) goto L_0x0125
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r12 = r0.f225468i
            r6[r11] = r12
            java.lang.String r12 = "summerbig checkUseCdn cdntra parse content xml failed: mediaId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r12, r6)
        L_0x0122:
            r8 = r5
            goto L_0x0308
        L_0x0125:
            r12 = 5
            java.lang.Object[] r13 = new java.lang.Object[r12]
            long r14 = r0.f225469j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r11] = r14
            com.tencent.mm.pluginsdk.model.app.d r14 = r0.f225466g
            long r14 = r14.field_totalLen
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r3] = r14
            com.tencent.mm.pluginsdk.model.app.d r14 = r0.f225466g
            java.lang.String r14 = r14.field_fileFullPath
            r13[r10] = r14
            java.lang.String r14 = r6.f195500J
            r13[r7] = r14
            java.lang.String r14 = r6.f195524R
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r14)
            r15 = 4
            r13[r15] = r14
            java.lang.String r14 = "summerbig cdntra checkUseCdn msgid:%d total:%d fullpath:%s fileid:%s aeskey:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r14, r13)
            java.lang.String r13 = r6.f195500J
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0163
            java.lang.String r13 = r6.f195650z
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x016b
        L_0x0163:
            java.lang.String r13 = r6.f195524R
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0188
        L_0x016b:
            java.lang.Object[] r12 = new java.lang.Object[r7]
            long r13 = r0.f225469j
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12[r11] = r13
            java.lang.String r13 = r6.f195500J
            r12[r3] = r13
            java.lang.String r6 = r6.f195524R
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r6)
            r12[r10] = r6
            java.lang.String r6 = "summerbig cdntra checkUseCdn msgId:%d Not use CDN  cdnAttachUrl:%s aes:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r12)
            goto L_0x0122
        L_0x0188:
            com.tencent.mm.pluginsdk.model.app.d r13 = r0.f225466g
            long r13 = r13.field_createTime
            com.tencent.mm.storage.f4 r8 = r0.f225470n
            java.lang.String r8 = r8.mo108768t()
            com.tencent.mm.storage.f4 r9 = r0.f225470n
            r16 = r5
            long r4 = r9.getMsgId()
            java.lang.String r4 = m93216m1(r13, r8, r4)
            r0.f225471o = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x01ba
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r5 = r0.f225467h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r11] = r5
            java.lang.String r5 = "summerbig cdntra genClientId failed not use cdn rowid:%d"
            r8 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r5, r4)
            goto L_0x0308
        L_0x01ba:
            r8 = r16
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f225466g
            java.lang.String r4 = r4.field_fileFullPath
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106458s(r4)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r4)
            java.lang.Class<qo.k> r4 = p663qo.C63287k.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            qo.k r4 = (p663qo.C63287k) r4
            java.lang.String r5 = r0.f225471o
            java.lang.String r4 = r4.mo88183rC(r5)
            r0.f225473q = r4
            gi.g r4 = new gi.g
            r4.<init>()
            java.lang.String r5 = "task_NetSceneDownloadAppAttach"
            r4.f287660d = r5
            java.lang.String r5 = r0.f225471o
            r4.field_mediaId = r5
            java.lang.String r5 = r0.f225473q
            r4.field_fullpath = r5
            int r5 = r6.f195626t
            r9 = 26214400(0x1900000, float:5.2897246E-38)
            if (r5 != 0) goto L_0x01f6
            int r5 = r6.f195594l
            if (r5 <= r9) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r5 = 5
            goto L_0x01f7
        L_0x01f6:
            r5 = 7
        L_0x01f7:
            r4.field_fileType = r5
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f225466g
            long r13 = r5.field_totalLen
            int r14 = (int) r13
            r4.field_totalLen = r14
            java.lang.String r13 = r6.f195524R
            r4.field_aesKey = r13
            java.lang.String r13 = r6.f195500J
            r4.field_fileId = r13
            java.lang.String r13 = r5.field_signature
            r4.field_svr_signature = r13
            java.lang.String r13 = r5.field_fakeAeskey
            r4.field_fake_bigfile_signature_aeskey = r13
            java.lang.String r5 = r5.field_fakeSignature
            r4.field_fake_bigfile_signature = r5
            r4.field_onlycheckexist = r11
            java.lang.String r5 = r6.f195622s
            r4.field_filemd5 = r5
            r4.field_priority = r10
            com.tencent.mm.storage.f4 r5 = r0.f225470n
            java.lang.String r5 = r5.mo108768t()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            r4.field_chattype = r5
            boolean r5 = com.tencent.p014mm.modelcdntran.C1297x.m1388c()
            if (r5 == 0) goto L_0x0238
            int r5 = r6.f195626t
            if (r5 != 0) goto L_0x0236
            int r5 = r6.f195594l
            if (r5 <= r9) goto L_0x0238
        L_0x0236:
            r5 = 1
            goto L_0x0239
        L_0x0238:
            r5 = 0
        L_0x0239:
            r4.field_use_multithread = r5
            int r5 = r0.f225480x
            r4.f287664h = r5
            if (r5 == 0) goto L_0x0243
            r5 = 1
            goto L_0x0244
        L_0x0243:
            r5 = 0
        L_0x0244:
            if (r5 == 0) goto L_0x0249
            r4.field_autostart = r3
            goto L_0x024b
        L_0x0249:
            r4.field_autostart = r11
        L_0x024b:
            java.lang.String r5 = r6.f195650z
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r9 = ""
            if (r5 != 0) goto L_0x0263
            r5 = 19
            r4.field_fileType = r5
            java.lang.String r5 = r6.f195472C
            r4.field_authKey = r5
            java.lang.String r5 = r6.f195650z
            r4.f287672s = r5
            r4.field_fileId = r9
        L_0x0263:
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]
            boolean r6 = r4.field_use_multithread
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r11] = r6
            int r6 = r4.field_fileType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = r4.field_fullpath
            r5[r10] = r6
            java.lang.String r6 = r4.field_aesKey
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r6)
            r5[r7] = r6
            java.lang.String r6 = r4.field_svr_signature
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r6)
            r5[r15] = r6
            java.lang.String r6 = r4.field_fake_bigfile_signature_aeskey
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r6)
            r5[r12] = r6
            java.lang.String r6 = r4.field_fake_bigfile_signature
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r6)
            r12 = 6
            r5[r12] = r6
            boolean r6 = r4.field_onlycheckexist
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r12 = 7
            r5[r12] = r6
            java.lang.String r6 = "summerbig checkUseCdn addRecvTask taskInfo field_use_multithread[%s], field_fileType[%d], fileFullPath[%s], aeskey[%s], signature[%s], faeskey[%s], fsignature[%s], onlycheckexist[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r5)
            java.lang.Class<qo.i> r5 = p663qo.C77384i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            qo.i r5 = (p663qo.C77384i) r5
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            com.tencent.mm.modelcdntran.i r12 = r0.f225462A
            r6.<init>(r12)
            gi.g r4 = r5.mo107504hs(r4, r6)
            if (r4 != 0) goto L_0x02c9
            java.lang.String r4 = "summerbig cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r4)
            r0.f225471o = r9
            goto L_0x0308
        L_0x02c9:
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f225466g
            int r5 = r4.field_isUseCdn
            if (r5 == r3) goto L_0x030a
            r4.field_isUseCdn = r3
            di3.d r4 = di3.C86312j.m106911c(r2)
            ym.s r4 = (p763ym.C53543s) r4
            ym.i r4 = r4.mo74024KZ()
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f225466g
            java.lang.String[] r6 = new java.lang.String[r11]
            com.tencent.mm.pluginsdk.model.app.e r4 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r4
            boolean r4 = r4.update(r5, r6)
            if (r4 != 0) goto L_0x030a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "summerbig checkUseCdn update info ret:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r4)
            int r4 = p206nj.C76861g.m92658a()
            int r4 = -10000 - r4
            r0.f225475s = r4
            r4 = -1
            r0.mo107461k1(r7, r4, r9, r0)
        L_0x0308:
            r4 = 0
            goto L_0x030b
        L_0x030a:
            r4 = 1
        L_0x030b:
            if (r4 == 0) goto L_0x0319
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r0.f225468i
            r1[r11] = r2
            java.lang.String r2 = "cdntra use cdn return -1 for onGYNetEnd mediaid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r2, r1)
            return r11
        L_0x0319:
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f225466g
            long r5 = r4.field_status
            r12 = 102(0x66, double:5.04E-322)
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x033e
            r5 = 101(0x65, double:5.0E-322)
            r4.field_status = r5
            boolean r4 = r0.f225476t
            if (r4 != 0) goto L_0x033e
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.s r2 = (p763ym.C53543s) r2
            ym.i r2 = r2.mo74024KZ()
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f225466g
            java.lang.String[] r5 = new java.lang.String[r11]
            com.tencent.mm.pluginsdk.model.app.e r2 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r2
            r2.update(r4, r5)
        L_0x033e:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r4 = r2.systemRowid
            r0.f225467h = r4
            java.lang.String r2 = r2.field_mediaSvrId
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0363
            long r4 = r0.f225479w
            r12 = 0
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0363
            java.lang.String r1 = "checkArgs : mediaId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r1 = -1
            return r1
        L_0x0363:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r4 = r2.field_totalLen
            r12 = 0
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0438
            r14 = 26214400(0x1900000, double:1.29516345E-316)
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0376
            goto L_0x0438
        L_0x0376:
            java.lang.String r2 = r2.field_fileFullPath
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0393
            long r4 = r0.f225479w
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0393
            java.lang.String r1 = "checkArgs : fileFullPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r1 = -1
            return r1
        L_0x0393:
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            java.lang.String r2 = r2.field_fileFullPath
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r2 = (int) r4
            boolean r4 = r0.f225481y
            if (r4 == 0) goto L_0x03a6
            int r2 = r2 + -6
            if (r2 <= 0) goto L_0x03a5
            goto L_0x03a6
        L_0x03a5:
            r2 = 0
        L_0x03a6:
            long r4 = (long) r2
            com.tencent.mm.pluginsdk.model.app.d r6 = r0.f225466g
            long r12 = r6.field_offset
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x03d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "checkArgs : fileFullPath is invalid, fileLength = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", info.field_offset = "
            r1.append(r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r2 = r2.field_offset
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r1 = -1
            return r1
        L_0x03d9:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r4 = r6.field_appId
            r2[r11] = r4
            java.lang.String r4 = r6.field_mediaSvrId
            r2[r3] = r4
            long r3 = r6.field_sdkVer
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r10] = r3
            java.lang.String r3 = "downing attach by non cdn, appId: %s,  mediaId: %s, sdkVer: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r2)
            ob0.c r2 = r0.f225463d
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            te3.o50 r2 = (te3.C64603o50) r2
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f225466g
            java.lang.String r4 = r3.field_appId
            r2.f184620d = r4
            java.lang.String r4 = r3.field_mediaSvrId
            r2.f184622f = r4
            long r3 = r3.field_sdkVer
            int r4 = (int) r3
            r2.f184621e = r4
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r2.f184623g = r3
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f225466g
            long r4 = r3.field_totalLen
            int r5 = (int) r4
            r2.f184624h = r5
            long r4 = r3.field_offset
            int r5 = (int) r4
            r2.f184625i = r5
            r2.f184626j = r11
            long r4 = r0.f225479w
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0425
            r2.f184631r = r4
        L_0x0425:
            int r4 = r0.f225474r
            if (r4 == 0) goto L_0x042c
            r2.f184629p = r4
            goto L_0x0431
        L_0x042c:
            long r3 = r3.field_type
            int r4 = (int) r3
            r2.f184629p = r4
        L_0x0431:
            ob0.c r2 = r0.f225463d
            int r1 = r0.dispatch(r1, r2, r0)
            return r1
        L_0x0438:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkArgs : totalLen is invalid, totalLen = "
            r1.append(r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r2 = r2.field_totalLen
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C77335p.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 221;
    }

    /* renamed from: k1 */
    public final void mo107461k1(int i, int i2, String str, C117747y yVar) {
        Class cls = C98591h.class;
        Class cls2 = C75700k0.class;
        if (this.f225464e != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new p$$b(this, i, i2, str, yVar));
            C72683d dVar = this.f225466g;
            if (dVar != null) {
                long j = dVar.field_msgInfoId;
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(j);
                if (i == 0 && i2 == 0) {
                    ((C98591h) C86312j.m106911c(cls)).mo137975se(this.f225480x != 0, String.valueOf(j), b002.mo108774y2(), true, false);
                    if (b002.mo101023z3() && this.f225465f == null) {
                        try {
                            C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                            if (u != null) {
                                long y2 = b002.mo108774y2();
                                C77878b bVar = (C77878b) u.mo93555w(C77878b.class);
                                if (bVar != null) {
                                    long j2 = bVar.f226901b;
                                    if (j2 != 0) {
                                        y2 = j2;
                                    }
                                }
                                Object[] objArr = new Object[13];
                                objArr[0] = u.f195500J;
                                objArr[1] = Integer.valueOf(u.f195626t == 1 ? 7 : 5);
                                objArr[2] = Integer.valueOf(u.f195594l);
                                objArr[3] = 0;
                                objArr[4] = Long.valueOf((C31543z5.m39453c() - b002.getCreateTime()) / 1000);
                                objArr[5] = Util.nullAsNil(u.f195602n).toLowerCase();
                                objArr[6] = b002.mo108768t();
                                objArr[7] = 1;
                                objArr[8] = "";
                                objArr[9] = Long.valueOf(y2);
                                objArr[10] = Long.valueOf(b002.getCreateTime());
                                objArr[11] = Long.valueOf(C31543z5.m39451a());
                                objArr[12] = 1;
                                String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
                                Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "reportKVStat 14665 %s", format);
                                C115669n.INSTANCE.kvStat(14665, format);
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.NetSceneDownloadAppAttach", "reportKVStat exception:%s", e.getMessage());
                        }
                    }
                    p$$d p__d = f225461B;
                    if (p__d != null) {
                        p__d.mo106627a(b002);
                    }
                    if (!Util.isNullOrNil(this.f225466g.field_fileFullPath)) {
                        C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(this.f225466g.field_fileFullPath, 6, (String) null, (byte[]) null);
                        Log.m105919d("MicroMsg.NetSceneDownloadAppAttach", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", this.f225466g.field_fileFullPath, Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                        return;
                    }
                    return;
                }
                if (this.f225480x != 0) {
                    this.f225466g.field_status = 102;
                    ((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).update(this.f225466g, new String[0]);
                    b002.mo108734N2(0);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(b002.getMsgId(), b002);
                    return;
                }
                ((C98591h) C86312j.m106911c(cls)).mo137975se(this.f225480x != 0, String.valueOf(j), b002.mo108774y2(), false, false);
            }
        }
    }

    /* renamed from: n1 */
    public String mo107462n1() {
        C72683d dVar = this.f225466g;
        return dVar == null ? "" : dVar.field_mediaSvrId;
    }

    /* renamed from: o1 */
    public void mo107463o1(p$$e p__e) {
        if (!this.f225476t) {
            this.f225482z = new p$$c(this, p__e);
            ((C77384i) C86312j.m106911c(C77384i.class)).Rl0(this.f225471o, new WeakReference(this.f225482z));
        }
        Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "summerbig pause listener[%s], info[%s], justSaveFile[%b], stack[%s]", p__e, this.f225466g, Boolean.valueOf(this.f225476t), Util.getStack());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0208, code lost:
        if ((r8.field_offset + ((long) r2.length)) == r8.field_totalLen) goto L_0x020a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r17, int r18, int r19, java.lang.String r20, com.tencent.p014mm.network.C114799u r21, byte[] r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onGYNetEnd : errType = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r6 = ", errCode = "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "MicroMsg.NetSceneDownloadAppAttach"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r4)
            r4 = 1
            r8 = -1
            r9 = 3
            r10 = 0
            if (r1 != r9) goto L_0x0043
            if (r2 != r8) goto L_0x0043
            java.lang.String r11 = r0.f225471o
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0043
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r0.f225471o
            r1[r10] = r2
            java.lang.String r2 = "cdntra using cdn trans,  wait cdn service callback! clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r1)
            return
        L_0x0043:
            if (r1 != 0) goto L_0x03dd
            if (r2 == 0) goto L_0x0049
            goto L_0x03dd
        L_0x0049:
            r1 = r21
            ob0.c r1 = (ob0.C47350c) r1
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.p50 r1 = (te3.C50783p50) r1
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            int r5 = r1.f139587g
            long r5 = (long) r5
            r2.field_totalLen = r5
            java.lang.String r5 = r1.f139585e
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0079
            java.lang.String r2 = r2.field_mediaSvrId
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0079
            java.lang.String r1 = "argument is not consistent"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r0.mo107461k1(r9, r8, r6, r0)
            return
        L_0x0079:
            int r2 = r1.f139588h
            long r11 = (long) r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r13 = r2.field_offset
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x00a7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "startPos, totalLen is incorrect startpos:"
            r2.append(r3)
            int r1 = r1.f139588h
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r0.mo107461k1(r9, r8, r6, r0)
            return
        L_0x00a7:
            int r5 = r1.f139589i
            long r11 = (long) r5
            long r11 = r11 + r13
            long r13 = r2.field_totalLen
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x00eb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "data buffer is incorrect datalen:"
            r2.append(r3)
            int r1 = r1.f139589i
            r2.append(r1)
            java.lang.String r1 = " off:"
            r2.append(r1)
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            long r3 = r1.field_offset
            r2.append(r3)
            java.lang.String r1 = " total?:"
            r2.append(r1)
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            long r3 = r1.field_totalLen
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r0.mo107461k1(r9, r8, r6, r0)
            return
        L_0x00eb:
            te3.qv3 r2 = r1.f139590j
            byte[] r2 = sf0.C48374j0.m53715d(r2)
            if (r2 == 0) goto L_0x03ca
            int r5 = r2.length
            if (r5 == 0) goto L_0x03ca
            int r5 = r2.length
            int r1 = r1.f139589i
            if (r5 == r1) goto L_0x00fd
            goto L_0x03ca
        L_0x00fd:
            java.lang.String r1 = r0.f225468i
            long r11 = r0.f225469j
            com.tencent.mm.pluginsdk.model.app.d r1 = qg2.C77331b.m93197a(r1, r11)
            if (r1 != 0) goto L_0x0124
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r2 = r2.field_msgInfoId
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r10] = r2
            java.lang.String r2 = "append to file failed, msg maybe revoked or deleted. msgId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r0.mo107461k1(r9, r8, r6, r0)
            return
        L_0x0124:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            boolean r11 = r0.f225477u
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r5[r10] = r11
            java.lang.String r11 = "dancy download big appmsg : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r5)
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f225466g
            long r11 = r5.field_offset
            long r13 = r5.field_totalLen
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x02d1
            boolean r5 = r0.f225477u
            if (r5 == 0) goto L_0x02d1
            k40.a r5 = f40.C86709a0.m107533q(r3)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            com.tencent.mm.pluginsdk.model.app.d r11 = r0.f225466g
            long r11 = r11.field_msgInfoId
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r11)
            java.lang.String r11 = "<?xml version="
            boolean r11 = r1.startsWith(r11)
            java.lang.String r12 = "<appmsg"
            if (r11 == 0) goto L_0x017b
            int r11 = r1.indexOf(r12)
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r13[r10] = r14
            java.lang.String r14 = "inclued: <?xml version=  index:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r13)
            if (r11 <= 0) goto L_0x017b
            java.lang.String r1 = r1.substring(r11)
        L_0x017b:
            boolean r11 = r1.startsWith(r12)
            r12 = 2
            java.lang.String r13 = "<msg>"
            java.lang.String r14 = "\n"
            if (r11 == 0) goto L_0x01d4
            java.lang.String r11 = r5.mo108768t()
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r11)
            if (r11 == 0) goto L_0x01cf
            java.lang.String r11 = r5.getContent()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x01f5
            java.lang.String r11 = r5.getContent()
            java.lang.String[] r11 = r11.split(r14, r12)
            r11 = r11[r10]
            java.lang.StringBuffer r15 = new java.lang.StringBuffer
            r15.<init>()
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            r15.append(r11)
            r15.append(r14)
            java.lang.String r11 = r15.toString()
            r8.field_fullXml = r11
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            com.tencent.mm.pluginsdk.model.app.d r11 = r0.f225466g
            java.lang.String r11 = r11.field_fullXml
            r8.append(r11)
            r8.append(r1)
            com.tencent.mm.pluginsdk.model.app.d r11 = r0.f225466g
            java.lang.String r8 = r8.toString()
            r11.field_fullXml = r8
            goto L_0x01f5
        L_0x01cf:
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            r8.field_fullXml = r1
            goto L_0x01f5
        L_0x01d4:
            java.lang.String r8 = r5.getContent()
            boolean r8 = r8.startsWith(r13)
            if (r8 != 0) goto L_0x01f5
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r11 = r5.getContent()
            r8.append(r11)
            r8.append(r1)
            com.tencent.mm.pluginsdk.model.app.d r11 = r0.f225466g
            java.lang.String r8 = r8.toString()
            r11.field_fullXml = r8
        L_0x01f5:
            java.lang.String r8 = "</appmsg>"
            boolean r8 = r1.endsWith(r8)
            if (r8 != 0) goto L_0x020a
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            long r9 = r8.field_offset
            int r15 = r2.length
            long r11 = (long) r15
            long r9 = r9 + r11
            long r11 = r8.field_totalLen
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x02b7
        L_0x020a:
            java.lang.String r8 = r5.mo108768t()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            java.lang.String r9 = "</msg>"
            if (r8 == 0) goto L_0x026a
            int r8 = r5.mo108769t2()
            if (r8 != 0) goto L_0x024f
            java.lang.String r8 = r5.getContent()
            r10 = 2
            java.lang.String[] r8 = r8.split(r14, r10)
            r10 = 0
            r12 = r8[r10]
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            r10.append(r12)
            r10.append(r14)
            r10.append(r13)
            int r12 = r8.length
            if (r12 <= r4) goto L_0x023c
            r8 = r8[r4]
            goto L_0x023d
        L_0x023c:
            r8 = r6
        L_0x023d:
            r10.append(r8)
            r10.append(r1)
            r10.append(r9)
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            java.lang.String r8 = r10.toString()
            r1.field_fullXml = r8
            goto L_0x0284
        L_0x024f:
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            com.tencent.mm.pluginsdk.model.app.d r10 = r0.f225466g
            java.lang.String r10 = r10.field_fullXml
            r8.append(r10)
            r8.append(r1)
            r8.append(r9)
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            java.lang.String r8 = r8.toString()
            r1.field_fullXml = r8
            goto L_0x0284
        L_0x026a:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r13)
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            java.lang.String r8 = r8.field_fullXml
            r1.append(r8)
            r1.append(r9)
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            java.lang.String r1 = r1.toString()
            r8.field_fullXml = r1
        L_0x0284:
            int r1 = r0.f225478v
            r8 = 19
            if (r1 == r8) goto L_0x028e
            r8 = 24
            if (r1 != r8) goto L_0x02a8
        L_0x028e:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            java.lang.String r8 = r5.mo108768t()
            int r9 = r5.mo108769t2()
            if (r9 != r4) goto L_0x029c
            r9 = 1
            goto L_0x029d
        L_0x029c:
            r9 = 0
        L_0x029d:
            com.tencent.mm.pluginsdk.model.app.d r10 = r0.f225466g
            java.lang.String r10 = r10.field_fullXml
            r12 = 2
            java.lang.String r8 = qg2.C101164q0.m132678d(r12, r8, r9, r10)
            r1.field_fullXml = r8
        L_0x02a8:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            java.lang.String r8 = r8.field_fullXml
            r9 = 0
            r1[r9] = r8
            java.lang.String r8 = "update final xml content: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r1)
        L_0x02b7:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            java.lang.String r1 = r1.field_fullXml
            r5.mo108732L2(r1)
            k40.a r1 = f40.C86709a0.m107533q(r3)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f225466g
            long r8 = r8.field_msgInfoId
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.xy0(r8, r5)
        L_0x02d1:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            java.lang.String r1 = r1.field_fileFullPath
            int r1 = com.tencent.p014mm.vfs.C86013q1.m106440a(r1, r2)
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f225466g
            java.lang.String r5 = r5.field_fileFullPath
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0307
            if (r1 == 0) goto L_0x0307
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "append to file failed:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r1 = -1
            r2 = 3
            r0.mo107461k1(r2, r1, r6, r0)
            return
        L_0x0307:
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f225466g
            long r8 = r5.field_offset
            int r2 = r2.length
            long r12 = (long) r2
            long r8 = r8 + r12
            r5.field_offset = r8
            long r12 = r5.field_totalLen
            r14 = 199(0xc7, double:9.83E-322)
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x031a
            r5.field_status = r14
        L_0x031a:
            ob0.o r2 = r0.f225465f
            if (r2 == 0) goto L_0x0325
            if (r2 == 0) goto L_0x0325
            int r5 = (int) r8
            int r8 = (int) r12
            r2.mo26221m(r5, r8, r0)
        L_0x0325:
            boolean r2 = r0.f225476t
            if (r2 == 0) goto L_0x032a
            goto L_0x0341
        L_0x032a:
            java.lang.Class<ym.s> r2 = p763ym.C53543s.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.s r2 = (p763ym.C53543s) r2
            ym.i r2 = r2.mo74024KZ()
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f225466g
            r5 = 0
            java.lang.String[] r8 = new java.lang.String[r5]
            com.tencent.mm.pluginsdk.model.app.e r2 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r2
            boolean r4 = r2.update(r4, r8)
        L_0x0341:
            if (r4 != 0) goto L_0x0366
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onGYNetEnd update info ret:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f225475s = r1
            r1 = -1
            r2 = 3
            r0.mo107461k1(r2, r1, r6, r0)
            return
        L_0x0366:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f225466g
            long r1 = r1.field_status
            int r4 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x03a2
            k40.a r1 = f40.C86709a0.m107533q(r3)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f225466g
            long r4 = r2.field_msgInfoId
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r4)
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            g62.l$e r3 = new g62.l$e
            java.lang.String r4 = r1.mo108768t()
            java.lang.String r5 = "update"
            r7 = 0
            r3.<init>(r4, r5, r1, r7)
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            r2.mo101123jo(r3)
            r0.mo107461k1(r7, r7, r6, r0)
            return
        L_0x03a2:
            r3 = 102(0x66, double:5.04E-322)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03b2
            r1 = -1
            r2 = 3
            r0.mo107461k1(r2, r1, r6, r0)
            r1 = -20102(0xffffffffffffb17a, float:NaN)
            r0.f225475s = r1
            return
        L_0x03b2:
            r1 = -1
            r2 = 3
            com.tencent.mm.network.g r3 = r16.dispatcher()
            ob0.n r4 = r0.f225464e
            int r3 = r0.doScene(r3, r4)
            if (r3 >= 0) goto L_0x03c9
            java.lang.String r3 = "onGYNetEnd : doScene fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
            r0.mo107461k1(r2, r1, r6, r0)
        L_0x03c9:
            return
        L_0x03ca:
            r1 = -1
            r2 = 3
            java.lang.String r3 = "data buffer is incorrect"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
            int r3 = p206nj.C76861g.m92658a()
            int r3 = -10000 - r3
            r0.f225475s = r3
            r0.mo107461k1(r2, r1, r6, r0)
            return
        L_0x03dd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r6)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
            int r3 = p206nj.C76861g.m92658a()
            int r3 = -10000 - r3
            r0.f225475s = r3
            r3 = r20
            r0.mo107461k1(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C77335p.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    /* renamed from: p1 */
    public final boolean mo107464p1() {
        String str;
        C53537i KZ = ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ();
        try {
            C72683d dVar = null;
            C68070l.C68072b u = C68070l.C68072b.m80422u(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f225466g.field_msgInfoId).getContent(), (String) null);
            String str2 = u.f195570f;
            String str3 = u.f195602n;
            String str4 = u.f195622s;
            long j = (long) u.f195594l;
            Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "tryRescueFileFromPreviousDownload title: " + str2 + ", ext: " + str3 + ", size: " + j);
            String s = C86013q1.m106458s(this.f225466g.field_fileFullPath);
            if (!str2.endsWith(str3)) {
                str2 = str2 + "." + str3;
            }
            for (int i = 0; i < 20; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(XVFSFile.SEPARATOR_CHAR);
                if (i == 0) {
                    str = "";
                } else {
                    str = i + "_";
                }
                sb.append(str);
                sb.append(str2);
                String sb4 = sb.toString();
                C86001b0 n = C86013q1.m106453n(sb4);
                if (n != null) {
                    if (n.f250473c == j) {
                        Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "Found same size file: " + sb4);
                        if (str4.equalsIgnoreCase(C86013q1.m106456q(sb4))) {
                            Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "Found same MD5 file: " + sb4);
                            C72684e eVar = (C72684e) KZ;
                            eVar.getClass();
                            C72683d dVar2 = new C72683d();
                            dVar2.field_fileFullPath = sb4;
                            if (eVar.get(dVar2, "fileFullPath")) {
                                dVar = dVar2;
                            }
                            if (dVar == null) {
                                Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "No occupied, possibly table miss.");
                                this.f225466g.field_fileFullPath = sb4;
                            } else {
                                Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "Occupied, copy " + sb4 + " -> " + this.f225466g.field_fileFullPath);
                                C86013q1.m106442c(sb4, this.f225466g.field_fileFullPath);
                            }
                            C72683d dVar3 = this.f225466g;
                            dVar3.field_totalLen = j;
                            dVar3.field_offset = j;
                            dVar3.field_status = 199;
                            ((C72684e) KZ).update(dVar3, new String[0]);
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneDownloadAppAttach", e, "tryRescueFileFromPreviousDownload failed.", new Object[0]);
        }
        Log.m105924i("MicroMsg.NetSceneDownloadAppAttach", "No same file found.");
        return false;
    }

    public int securityLimitCount() {
        return 400;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public C77335p(long j, String str, C47355o oVar) {
        this(str, j, oVar, 0);
        this.f225469j = j;
    }

    public C77335p(long j, long j2, int i, C47355o oVar, boolean z) {
        this.f225466g = null;
        this.f225467h = -1;
        this.f225468i = "";
        this.f225470n = null;
        this.f225471o = "";
        this.f225472p = 0;
        this.f225473q = "";
        this.f225474r = 0;
        this.f225475s = 0;
        this.f225476t = false;
        this.f225477u = false;
        this.f225480x = 0;
        this.f225481y = false;
        this.f225482z = null;
        this.f225462A = new p$$a(this);
        this.f225479w = j2;
        this.f225469j = j;
        C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100150Yt(j);
        this.f225466g = Yt;
        this.f225465f = oVar;
        this.f225477u = z;
        this.f225478v = i;
        if (Yt == null) {
            Log.m105921e("MicroMsg.NetSceneDownloadAppAttach", "big appMsg, info is null, msgid = , svrId" + j, Long.valueOf(j2));
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64603o50();
        bVar.f127067b = new C50783p50();
        bVar.f127068c = "/cgi-bin/micromsg-bin/downloadappattach";
        bVar.f127069d = 221;
        bVar.f127070e = 106;
        bVar.f127071f = 1000000106;
        this.f225463d = bVar.mo72403a();
    }

    public C77335p(C72683d dVar, boolean z) {
        this.f225467h = -1;
        this.f225468i = "";
        this.f225469j = 0;
        this.f225470n = null;
        this.f225471o = "";
        this.f225472p = 0;
        this.f225473q = "";
        this.f225474r = 0;
        this.f225475s = 0;
        this.f225477u = false;
        this.f225479w = 0;
        this.f225480x = 0;
        this.f225481y = false;
        this.f225482z = null;
        this.f225462A = new p$$a(this);
        this.f225466g = dVar;
        this.f225476t = z;
        this.f225468i = dVar.field_mediaId;
        this.f225465f = null;
        this.f225474r = 0;
        if (dVar == null) {
            Log.m105920e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + this.f225468i);
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64603o50();
        bVar.f127067b = new C50783p50();
        bVar.f127068c = "/cgi-bin/micromsg-bin/downloadappattach";
        bVar.f127069d = 221;
        bVar.f127070e = 106;
        bVar.f127071f = 1000000106;
        this.f225463d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach info fullpath[%s], justSaveFile[%b], stack[%s]", dVar.field_fileFullPath, Boolean.valueOf(z), Util.getStack());
    }

    public C77335p(String str, long j, C47355o oVar, int i) {
        Class cls = C53543s.class;
        this.f225466g = null;
        this.f225467h = -1;
        this.f225470n = null;
        this.f225471o = "";
        this.f225472p = 0;
        this.f225473q = "";
        this.f225475s = 0;
        this.f225476t = false;
        this.f225477u = false;
        this.f225479w = 0;
        this.f225480x = 0;
        this.f225481y = false;
        this.f225482z = null;
        this.f225462A = new p$$a(this);
        this.f225468i = str;
        this.f225469j = j;
        this.f225465f = oVar;
        this.f225474r = i;
        C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(j);
        this.f225466g = Yt;
        if (Yt == null) {
            this.f225466g = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100154qq(str);
        }
        if (this.f225466g == null) {
            Log.m105920e("MicroMsg.NetSceneDownloadAppAttach", "summerbig <init>, info is null, mediaId = " + str);
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64603o50();
        bVar.f127067b = new C50783p50();
        bVar.f127068c = "/cgi-bin/micromsg-bin/downloadappattach";
        bVar.f127069d = 221;
        bVar.f127070e = 106;
        bVar.f127071f = 1000000106;
        this.f225463d = bVar.mo72403a();
        C72683d dVar = this.f225466g;
        Log.m105919d("MicroMsg.NetSceneDownloadAppAttach", "summerbig NetSceneDownloadAppAttach , type[%d], info fullpath[%s], field_type[%d], signature[%s], stack[%s]", Integer.valueOf(i), dVar.field_fileFullPath, Long.valueOf(dVar.field_type), this.f225466g.field_signature, Util.getStack());
    }
}
