package kd0;

import a70.C112760b;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.autogen.events.VoiceMsgDownloadFinishEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C116314o;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import fw0.C87107w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kj2.C117407d;
import ob0.C35136m;
import ob0.C77002r;
import p206nj.C76861g;
import p876cj.C67380a;

/* renamed from: kd0.z */
public final class C76552z {

    /* renamed from: a */
    public static final HashMap<String, WeakReference<C77002r>> f224074a = new HashMap<>();

    /* renamed from: b */
    public static volatile HashMap<String, Integer> f224075b = new HashMap<>();

    /* renamed from: c */
    public static volatile HashMap<String, Integer> f224076c = new HashMap<>();

    /* renamed from: d */
    public static volatile HashMap<String, Integer> f224077d = new HashMap<>();

    /* renamed from: a */
    public static boolean m92063a(String str) {
        if (str == null) {
            return false;
        }
        C76551y o = m92077o(str);
        if (o == null) {
            Log.m105918d("MicroMsg.VoiceLogic", "cancel null download : " + str);
            return true;
        }
        Log.m105918d("MicroMsg.VoiceLogic", "cancel download : " + str + " SvrlId:" + o.f224054e);
        if (o.f224054e != 0) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101087SE(o.f224052c, o.f224054e);
        }
        return m92069g(str);
    }

    /* renamed from: b */
    public static boolean m92064b(String str) {
        if (str == null) {
            return false;
        }
        C76551y o = m92077o(str);
        if (o == null) {
            Log.m105924i("MicroMsg.VoiceLogic", "cancel null record : " + str);
            return true;
        }
        Log.m105924i("MicroMsg.VoiceLogic", "cancel record : " + str + " LocalId:" + o.f224062m);
        if (o.f224062m != 0) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101125kD(o.f224062m);
        }
        return m92069g(str);
    }

    /* renamed from: c */
    public static boolean m92065c(String str) {
        int i;
        C76551y o = m92077o(str);
        if (o == null) {
            return true;
        }
        C86009m1 m1Var = new C86009m1(m92075m(str));
        C76537d dVar = null;
        try {
            dVar = m92073k(str);
            if (dVar != null) {
                if ((dVar instanceof C76534a) && Math.abs(m1Var.mo119980r() - ((long) o.f224057h)) == 6) {
                    Log.m105925i("MicroMsg.VoiceLogic", "maybe amr, ignore for the moment. %d %d", Long.valueOf(m1Var.mo119980r()), Integer.valueOf(o.f224057h));
                    try {
                        dVar.mo106769b();
                    } catch (Throwable unused) {
                    }
                    return true;
                }
            }
            long r = m1Var.mo119980r();
            int i2 = o.f224057h;
            if (r != ((long) i2)) {
                Log.m105921e("MicroMsg.VoiceLogic", "checkChecksum fail. %d, %d", Long.valueOf(m1Var.mo119980r()), Integer.valueOf(o.f224057h));
                if (dVar != null) {
                    try {
                        dVar.mo106769b();
                    } catch (Throwable unused2) {
                    }
                }
                return false;
            }
            C60998j d = dVar.mo106771d(0, i2);
            if (d.f173722d != 0 || (i = o.f224070u) == 0 || i == m92070h(i & 255, d.f173719a, 0, d.f173720b)) {
                try {
                    dVar.mo106769b();
                } catch (Throwable unused3) {
                }
                return true;
            }
            Log.m105921e("MicroMsg.VoiceLogic", "checkChecksum fail2. %d", Integer.valueOf(o.f224070u));
            try {
                dVar.mo106769b();
            } catch (Throwable unused4) {
            }
            return false;
        } catch (Throwable unused5) {
        }
        throw th;
    }

    /* renamed from: d */
    public static boolean m92066d(String str) {
        C76551y o;
        int i;
        if (str == null || (o = m92077o(str)) == null || (i = o.f224064o) >= 250) {
            return false;
        }
        o.f224064o = i + 1;
        o.f224050a = 8192;
        return m92088z(o);
    }

    /* renamed from: e */
    public static void m92067e(String str) {
        C76541g0 yx02 = C76546u.yx0();
        yx02.getClass();
        String m = m92075m(str);
        int b = C76550x.m92053b(str);
        if (b == 0) {
            C76534a aVar = (C76534a) ((HashMap) yx02.f224035e).get(m);
            if (aVar != null) {
                aVar.mo106769b();
                ((HashMap) yx02.f224035e).remove(m);
            }
        } else if (b == 1) {
            C76545t tVar = (C76545t) ((HashMap) yx02.f224036f).get(m);
            if (tVar != null) {
                tVar.mo106769b();
                ((HashMap) yx02.f224036f).remove(m);
            }
        } else if (b != 2) {
            C76534a aVar2 = (C76534a) ((HashMap) yx02.f224035e).get(m);
            if (aVar2 != null) {
                aVar2.mo106769b();
                ((HashMap) yx02.f224035e).remove(m);
            }
        } else {
            C76544n nVar = (C76544n) ((HashMap) yx02.f224037g).get(m);
            if (nVar != null) {
                nVar.mo106769b();
                ((HashMap) yx02.f224037g).remove(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0133, code lost:
        if (r5 == r22) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0386  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m92068f(kd0.C76551y r33, boolean r34, int r35, java.lang.String r36, java.lang.String r37, ob0.C35136m.C35137a r38) {
        /*
            r0 = r33
            r1 = r37
            r2 = r38
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r3)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.l r4 = r4.mo96095LE()
            long r5 = r0.f224054e
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            boolean r4 = r4.py0(r5)
            r5 = -1
            r7 = 0
            r8 = 1
            java.lang.String r9 = "MicroMsg.VoiceLogic"
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r1 = new java.lang.Object[r8]
            long r2 = r0.f224054e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r7] = r2
            java.lang.String r2 = "[oneliang] msg svrid:%s,it is in delete msg list,may be revoke msg come first,msg info insert last,so no need to add msg info and delete voice info"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r1)
            java.lang.String r1 = r0.f224051b
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0047
            kd0.g0 r1 = kd0.C76546u.yx0()
            java.lang.String r0 = r0.f224051b
            r1.mo106784c(r0)
            goto L_0x004c
        L_0x0047:
            java.lang.String r0 = "[oneliang] the length of voice info file name is zero"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x004c:
            return r5
        L_0x004d:
            k40.a r4 = f40.C86709a0.m107533q(r3)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.l r4 = r4.mo96095LE()
            java.lang.String r10 = r0.f224052c
            long r11 = r0.f224054e
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            com.tencent.mm.storage.f4 r4 = r4.h30(r10, r11)
            long r10 = r4.mo108774y2()
            long r12 = r0.f224054e
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x009f
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            long r10 = r0.f224054e
            r4.mo108745Y2(r10)
            java.lang.String r10 = r0.f224051b
            r4.mo108739S2(r10)
            java.lang.String r10 = r0.f224052c
            long r11 = r0.f224059j
            long r10 = eb0.C75604z3.m90841m(r10, r11)
            r4.mo108733M2(r10)
            java.lang.String r10 = r0.f224052c
            r4.mo108749c3(r10)
            java.lang.String r10 = r0.f224063n
            boolean r10 = eb0.C75592q0.m90764L(r10)
            r4.mo108740T2(r10)
            r10 = 34
            r4.setType(r10)
            int r10 = r0.f224073x
            r4.mo101007n4(r10)
            r10 = 1
            goto L_0x00a0
        L_0x009f:
            r10 = 0
        L_0x00a0:
            if (r34 == 0) goto L_0x00aa
            int r11 = r4.f230723F
            r11 = r11 & -8193(0xffffffffffffdfff, float:NaN)
            r4.mo108743W2(r11)
            goto L_0x00b1
        L_0x00aa:
            int r11 = r4.f230723F
            r11 = r11 | 8192(0x2000, float:1.14794E-41)
            r4.mo108743W2(r11)
        L_0x00b1:
            r11 = r36
            r4.f230722E = r11
            r4.f230755r = r8
            r11 = r35
            r4.mo100991d(r11)
            if (r2 != 0) goto L_0x03a6
            int r2 = r0.f224067r
            if (r2 == 0) goto L_0x037a
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r12[r7] = r13
            java.lang.String r13 = "summerbadcr createMsgInfo flag has set[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r13, r12)
            r4.mo108735O2(r2)
            long r12 = r4.getMsgId()
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x037a
            int r12 = r4.mo108769t2()
            if (r12 != 0) goto L_0x037a
            r12 = r2 & 2
            if (r12 == 0) goto L_0x037a
            java.lang.String r12 = r4.mo108768t()
            long r5 = r0.f224059j
            long r18 = r4.mo108772w2()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r20
            if (r12 == 0) goto L_0x0127
            k40.a r13 = f40.C86709a0.m107533q(r3)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.l r13 = r13.mo96095LE()
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.Ex0(r12)
            if (r13 == 0) goto L_0x010e
            long r16 = r13.getCreateTime()
            goto L_0x0110
        L_0x010e:
            r16 = r14
        L_0x0110:
            k40.a r13 = f40.C86709a0.m107533q(r3)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.l r13 = r13.mo96095LE()
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            long r22 = r13.yu0(r12)
            r31 = r16
            r16 = r22
            r22 = r31
            goto L_0x012b
        L_0x0127:
            r22 = r14
            r16 = -1
        L_0x012b:
            r24 = 1
            int r13 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r13 != 0) goto L_0x0136
            int r3 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0141
            goto L_0x014f
        L_0x0136:
            java.lang.String r11 = "MicroMsg.MsgInfoStorageLogic"
            r8 = 3
            if (r13 >= 0) goto L_0x034d
            int r13 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x014b
            long r5 = r5 - r24
        L_0x0141:
            r28 = r2
            r29 = r4
            r27 = r9
            r26 = r10
            goto L_0x0374
        L_0x014b:
            int r13 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r13 != 0) goto L_0x0152
        L_0x014f:
            long r5 = r5 + r24
            goto L_0x0141
        L_0x0152:
            int r16 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0141
            if (r13 <= 0) goto L_0x0159
            goto L_0x0141
        L_0x0159:
            k40.a r13 = f40.C86709a0.m107533q(r3)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.l r13 = r13.mo96095LE()
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.mo101061CZ(r12, r5)
            long r16 = r13.mo108772w2()
            int r22 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r22 == 0) goto L_0x0141
            long r16 = r13.mo108772w2()
            int r22 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r22 == 0) goto L_0x0141
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]
            long r16 = r13.mo108772w2()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r15[r7] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r18)
            r17 = 1
            r15[r17] = r16
            long r16 = r13.getCreateTime()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r17 = 2
            r15[r17] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r5)
            r15[r8] = r16
            java.lang.String r14 = "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d] need fix serverMillTime[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r15)
            long r14 = r13.mo108772w2()
            java.lang.String r8 = ""
            java.lang.String r7 = " Order By "
            r26 = r10
            java.lang.String r10 = " and not ( type = 10000 and isSend != 2 ) "
            java.lang.String r1 = "createTime"
            r27 = r9
            java.lang.String r9 = " AND "
            r28 = r2
            java.lang.String r2 = " Where "
            java.lang.String r0 = "Select * From "
            int r16 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x023b
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            long r14 = r5 - r20
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r3.getClass()
            r29 = r4
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            r30 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = r3.hy0(r12)
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = r3.iy0(r12)
            r11.append(r0)
            r11.append(r9)
            r11.append(r1)
            java.lang.String r0 = " > ?"
            r11.append(r0)
            r11.append(r10)
            r11.append(r7)
            r11.append(r1)
            java.lang.String r0 = " ASC Limit 1;"
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            zh3.f r1 = r3.f212775p
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r7 = 0
            r3[r7] = r2
            r2 = 2
            android.database.Cursor r0 = r1.rawQuery(r0, r3, r2)
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L_0x0237
            r4.convertFrom(r0)
        L_0x0237:
            r0.close()
            goto L_0x02b3
        L_0x023b:
            r29 = r4
            r30 = r11
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            long r14 = r5 + r20
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r3.getClass()
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = r3.hy0(r12)
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = r3.iy0(r12)
            r11.append(r0)
            r11.append(r9)
            r11.append(r1)
            java.lang.String r0 = " < ?"
            r11.append(r0)
            r11.append(r10)
            r11.append(r7)
            r11.append(r1)
            java.lang.String r0 = " Desc Limit 1;"
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            zh3.f r1 = r3.f212775p
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r7 = 0
            r3[r7] = r2
            r2 = 2
            android.database.Cursor r0 = r1.rawQuery(r0, r3, r2)
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L_0x02b0
            r4.convertFrom(r0)
        L_0x02b0:
            r0.close()
        L_0x02b3:
            long r0 = r4.mo108772w2()
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x031d
            long r0 = r4.mo108772w2()
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x031d
            long r0 = r4.mo108772w2()
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            long r0 = r4.getCreateTime()
            if (r2 >= 0) goto L_0x02d4
            long r0 = r0 + r24
            goto L_0x02d6
        L_0x02d4:
            long r0 = r0 - r24
        L_0x02d6:
            r5 = r0
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r13.mo108772w2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r4.mo108772w2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            r2 = 2
            r0[r2] = r1
            long r1 = r13.getCreateTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            long r1 = r4.getCreateTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            r1 = 5
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0[r1] = r2
            java.lang.String r1 = "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d, %d] need fix serverMillTime[%d, %d, %d] done"
            r3 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            goto L_0x0374
        L_0x031d:
            r3 = r30
            r2 = 4
            java.lang.Object[] r0 = new java.lang.Object[r2]
            long r1 = r13.mo108772w2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            r2 = 1
            r0[r2] = r1
            long r1 = r13.getCreateTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = "summerbadcr fixRecvGetMsgCreateTime seq[%d, %d] no need fix serverMillTime[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            goto L_0x0374
        L_0x034d:
            r28 = r2
            r29 = r4
            r27 = r9
            r26 = r10
            r3 = r11
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r2 = 0
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            r2 = 1
            r0[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "summerbadcr fixRecvMsgCreateTime first > last [%d > %d], ret serverMillTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r0)
        L_0x0374:
            r4 = r29
            r4.mo108733M2(r5)
            goto L_0x0380
        L_0x037a:
            r28 = r2
            r27 = r9
            r26 = r10
        L_0x0380:
            r0 = r33
            int r1 = r0.f224068s
            if (r1 == 0) goto L_0x038a
            long r1 = (long) r1
            r4.mo108744X2(r1)
        L_0x038a:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r3 = 0
            r2[r3] = r1
            int r1 = r0.f224068s
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r2[r5] = r1
            java.lang.String r1 = "summerbadcr insert voice addMsgInfo is null but flag[%d], msgSeq[%d]"
            r6 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r2)
            goto L_0x03ae
        L_0x03a6:
            r6 = r9
            r26 = r10
            r3 = 0
            r5 = 1
            eb0.C75604z3.m90842n(r4, r2)
        L_0x03ae:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r2 = r37
            r1[r3] = r2
            java.lang.String r3 = "summerbadcr create voice msg info, msgSource : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r37)
            r3 = 0
            if (r1 != 0) goto L_0x03d1
            r4.mo101012p4(r2)
            eb0.z3$$h r1 = eb0.C75604z3.m90851w(r37)
            if (r1 != 0) goto L_0x03cc
            r1 = r3
            goto L_0x03ce
        L_0x03cc:
            java.lang.String r1 = r1.f222099f
        L_0x03ce:
            r4.mo108731K2(r1)
        L_0x03d1:
            if (r34 != 0) goto L_0x03e5
            java.lang.String r1 = r0.f224063n
            int r2 = r0.f224061l
            r5 = 0
            int r2 = java.lang.Math.max(r2, r5)
            long r2 = (long) r2
            java.lang.String r1 = kd0.C76549w.m92049c(r1, r2, r5)
            r4.mo108732L2(r1)
            goto L_0x043c
        L_0x03e5:
            r5 = 0
            java.lang.String r1 = r0.f224063n
            int r7 = r0.f224061l
            long r7 = (long) r7
            java.lang.String r1 = kd0.C76549w.m92049c(r1, r7, r5)
            r4.mo108732L2(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r37)
            if (r1 != 0) goto L_0x043c
            r4.mo101012p4(r2)
            eb0.z3$$h r1 = eb0.C75604z3.m90851w(r37)
            if (r1 != 0) goto L_0x0402
            goto L_0x0404
        L_0x0402:
            java.lang.String r3 = r1.f222099f
        L_0x0404:
            r4.mo108731K2(r3)
            eb0.z3$$h r1 = eb0.C75604z3.m90851w(r37)
            if (r1 == 0) goto L_0x043c
            java.lang.String r2 = r1.f222099f
            r4.mo108731K2(r2)
            int r2 = r1.f222100g
            r4.f230739W = r2
            r2 = 1
            r4.f230755r = r2
            java.lang.String r3 = r1.f222098e
            r4.mo108730J2(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f222098e
            r5 = 0
            r3[r5] = r2
            java.lang.String r2 = "bizClientMsgId = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)
            java.lang.String r2 = r1.f222103j
            if (r2 == 0) goto L_0x043c
            com.tencent.mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent r2 = new com.tencent.mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent
            r2.<init>()
            com.tencent.mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent$a r3 = r2.f193721d
            r3.f193722a = r4
            r3.f193723b = r1
            r2.publish()
        L_0x043c:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = r4.mo108774y2()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            long r7 = r4.mo108772w2()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r5 = 1
            r1[r5] = r2
            java.lang.String r2 = "summerbadcr parseVoiceMsg svrId[%d], msgseq[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            if (r26 == 0) goto L_0x0462
            long r1 = eb0.C75604z3.m90852x(r4)
            goto L_0x0469
        L_0x0462:
            eb0.C75604z3.m90828C(r4)
            long r1 = r4.getMsgId()
        L_0x0469:
            if (r34 == 0) goto L_0x048e
            com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent r5 = new com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent
            r5.<init>()
            com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent$a r6 = r5.f194004d
            long r7 = r4.getMsgId()
            r6.f194005a = r7
            com.tencent.mm.autogen.events.VoiceMsgDownloadFinishEvent$a r4 = r5.f194004d
            r6 = 1
            r4.f194006b = r6
            int r0 = r0.f224071v
            r0 = r0 & r6
            if (r0 == 0) goto L_0x0484
            r7 = 1
            goto L_0x0485
        L_0x0484:
            r7 = 0
        L_0x0485:
            r4.f194007c = r7
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.asyncPublish((android.os.Looper) r0)
        L_0x048e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C76552z.m92068f(kd0.y, boolean, int, java.lang.String, java.lang.String, ob0.m$a):long");
    }

    /* renamed from: g */
    public static boolean m92069g(String str) {
        Log.m105924i("MicroMsg.VoiceLogic", "deleteRecordFile() called with: fileName = [" + str + "]");
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C76546u.yx0().mo106784c(str);
        m92067e(str);
        String m = m92075m(str);
        if (Util.isNullOrNil(m)) {
            return false;
        }
        Uri n = C116299g2.m163858n(m);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        return l.mo177810a() && l.f348991a.mo119933c(l.f348992b);
    }

    /* renamed from: h */
    public static int m92070h(int i, byte[] bArr, int i2, int i3) {
        byte b;
        if (!(bArr == null || bArr.length == 0)) {
            if (i == 0) {
                i = bArr.hashCode() & 255;
                b = i;
            } else {
                b = i & ExifInterface.MARKER;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                i += (bArr[i2 + i4] & b) * 256;
            }
        }
        return i;
    }

    /* renamed from: i */
    public static String m92071i(String str, String str2) {
        String SQ = C76541g0.m92032SQ(C75592q0.m90789s(), str2);
        C76551y yVar = new C76551y();
        yVar.f224051b = SQ;
        yVar.f224052c = str;
        yVar.f224059j = System.currentTimeMillis() / 1000;
        yVar.f224053d = SQ;
        yVar.f224060k = System.currentTimeMillis() / 1000;
        yVar.f224058i = 1;
        yVar.f224063n = C75592q0.m90789s();
        yVar.f224050a = -1;
        if (!C76546u.yx0().mo106783Yt(yVar)) {
            return null;
        }
        Log.m105924i("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
        return SQ;
    }

    /* renamed from: j */
    public static String m92072j(String str, boolean z) {
        C76861g.C47263a aVar = new C76861g.C47263a();
        String genPath = FilePathGenerator.genPath(VFSStrategy.m163776d("voice2") + "/", "msg_", str, ".amr", 2, z);
        Log.m105924i("MicroMsg.VoiceLogic", "getAmrFullPath cost: " + aVar.mo72288a() + " " + genPath + "beCreate: " + z);
        if (Util.isNullOrNil(genPath)) {
            return null;
        }
        if (z) {
            return genPath;
        }
        Uri n = C116299g2.m163858n(genPath);
        String path = n.getPath();
        boolean z2 = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            return genPath;
        }
        for (String str2 : VFSStrategy.m163777e()) {
            String genPath2 = FilePathGenerator.genPath(C112760b.m154195C() + str2 + "/voice2/", "msg_", str, ".amr", 2, false);
            if (C86013q1.m106450k(genPath2)) {
                C86013q1.m106463x(genPath2, genPath);
                C116314o.m163919e(1);
                Log.m105928w("MicroMsg.VoiceLogic", "Found wrong moving file: " + genPath2);
                return genPath;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(VFSStrategy.m163776d("voice") + "/");
        sb.append(str);
        String sb4 = sb.toString();
        Uri n2 = C116299g2.m163858n(sb4 + ".amr");
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l2 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
        if (!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) {
            C86013q1.m106463x(sb4 + ".amr", genPath);
        } else {
            Uri n3 = C116299g2.m163858n(sb4);
            String path3 = n3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!n3.getPath().equals(k3)) {
                    n3 = n3.buildUpon().path(k3).build();
                }
            }
            C116281f0.C116288h l3 = f0Var.mo177799l(n3, (C116281f0.C116288h) null);
            if (l3.mo177810a()) {
                z2 = l3.f348991a.mo119948x(l3.f348992b);
            }
            if (z2) {
                C86013q1.m106463x(sb4, genPath);
            }
        }
        return genPath;
    }

    /* renamed from: k */
    public static C76537d m92073k(String str) {
        C76541g0 yx02 = C76546u.yx0();
        yx02.getClass();
        String m = m92075m(str);
        int b = C76550x.m92053b(str);
        if (b == 0) {
            if (((HashMap) yx02.f224035e).get(m) == null) {
                ((HashMap) yx02.f224035e).put(m, new C76534a(m));
            }
            return (C76537d) ((HashMap) yx02.f224035e).get(m);
        } else if (b == 1) {
            if (((HashMap) yx02.f224036f).get(m) == null) {
                ((HashMap) yx02.f224036f).put(m, new C76545t(m));
            }
            return (C76537d) ((HashMap) yx02.f224036f).get(m);
        } else if (b != 2) {
            if (((HashMap) yx02.f224035e).get(m) == null) {
                ((HashMap) yx02.f224035e).put(m, new C76534a(m));
            }
            return (C76537d) ((HashMap) yx02.f224035e).get(m);
        } else {
            if (((HashMap) yx02.f224037g).get(m) == null) {
                ((HashMap) yx02.f224037g).put(m, new C76544n(m));
            }
            return (C76537d) ((HashMap) yx02.f224037g).get(m);
        }
    }

    /* renamed from: l */
    public static C76537d m92074l(String str, String str2) {
        C76541g0 yx02 = C76546u.yx0();
        yx02.getClass();
        String m = m92075m(str2);
        int i = Util.getInt(str, -1);
        if (i == 1) {
            if (((HashMap) yx02.f224036f).get(m) == null) {
                ((HashMap) yx02.f224036f).put(m, new C76545t(m));
            }
            return (C76537d) ((HashMap) yx02.f224036f).get(m);
        } else if (i != 4) {
            if (((HashMap) yx02.f224035e).get(m) == null) {
                ((HashMap) yx02.f224035e).put(m, new C76534a(m));
            }
            return (C76537d) ((HashMap) yx02.f224035e).get(m);
        } else {
            if (((HashMap) yx02.f224037g).get(m) == null) {
                ((HashMap) yx02.f224037g).put(m, new C76544n(m));
            }
            return (C76537d) ((HashMap) yx02.f224037g).get(m);
        }
    }

    /* renamed from: m */
    public static String m92075m(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return m92072j(str, false);
    }

    /* renamed from: n */
    public static String m92076n(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return m92072j(str, z);
    }

    /* renamed from: o */
    public static C76551y m92077o(String str) {
        return C76546u.yx0().mo106785jo(str);
    }

    /* renamed from: p */
    public static List<C76551y> m92078p() {
        C76541g0 yx02 = C76546u.yx0();
        yx02.getClass();
        ArrayList arrayList = null;
        Cursor rawQuery = yx02.f224034d.rawQuery("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt FROM voiceinfo WHERE Status<97 and User!=\"_USER_FOR_THROWBOTTLE_\"   order by CreateTime", (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            ArrayList arrayList2 = new ArrayList();
            do {
                C76551y yVar = new C76551y();
                yVar.mo106794a(rawQuery);
                arrayList2.add(yVar);
                i++;
            } while (rawQuery.moveToNext());
            arrayList = arrayList2;
        }
        Log.m105918d("MicroMsg.VoiceStorage", "getUnfinishInfo resCount:" + i);
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: q */
    public static boolean m92079q(C72963f4 f4Var) {
        if (f4Var == null || !f4Var.mo100995g4()) {
            return false;
        }
        String content = f4Var.getContent();
        try {
            int i = 1;
            if (content.endsWith("\n")) {
                content = content.substring(0, content.length() - 1);
            }
            String[] split = content.split(XVFSFile.PATH_SEPARATOR);
            if (split.length != 4 || !C72996z1.m85811N4(split[0])) {
                i = 0;
            }
            if (split.length > i) {
                String str = split[i];
            }
            int i2 = i + 1;
            if (split.length > i2) {
                Util.getLong(split[i2], 0);
            }
            int i3 = i + 2;
            if (split.length > i3) {
                return split[i3].equals("1");
            }
            return false;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
            return false;
        }
    }

    /* renamed from: r */
    public static boolean m92080r(C72963f4 f4Var) {
        long j;
        if (f4Var == null || !f4Var.mo100995g4() || f4Var.mo108769t2() == 1) {
            return false;
        }
        String content = f4Var.getContent();
        try {
            if (content.endsWith("\n")) {
                content = content.substring(0, content.length() - 1);
            }
            String[] split = content.split(XVFSFile.PATH_SEPARATOR);
            int i = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
            if (split.length > i) {
                String str = split[i];
            }
            int i2 = i + 1;
            j = split.length > i2 ? Util.getLong(split[i2], 0) : 0;
            int i3 = i + 2;
            if (split.length > i3) {
                split[i3].equals("1");
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
            j = 0;
        }
        return j == 0;
    }

    /* renamed from: s */
    public static boolean m92081s(String str) {
        if (str == null) {
            return false;
        }
        Log.m105918d("MicroMsg.VoiceLogic", "Mark Canceled fileName[" + str + "]");
        C76551y o = m92077o(str);
        if (o == null) {
            return false;
        }
        o.f224058i = 8;
        o.f224057h = C76550x.m92055d(str);
        o.f224050a = 96;
        return m92088z(o);
    }

    /* renamed from: t */
    public static void m92082t(C72963f4 f4Var) {
        Class cls = C75700k0.class;
        if (f4Var != null && f4Var.mo100995g4()) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(f4Var.getMsgId());
            if (b002.getMsgId() == f4Var.getMsgId()) {
                String str = null;
                String content = b002.getContent();
                long j = 0;
                boolean z = false;
                try {
                    if (content.endsWith("\n")) {
                        content = content.substring(0, content.length() - 1);
                    }
                    String[] split = content.split(XVFSFile.PATH_SEPARATOR);
                    int i = (split.length != 4 || !C72996z1.m85811N4(split[0])) ? 0 : 1;
                    if (split.length > i) {
                        str = split[i];
                    }
                    int i2 = i + 1;
                    long j2 = split.length > i2 ? Util.getLong(split[i2], 0) : 0;
                    int i3 = i + 2;
                    if (split.length > i3) {
                        z = split[i3].equals("1");
                    }
                    j = j2;
                } catch (Exception unused) {
                    if (0 == 0) {
                        str = "";
                    }
                    Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
                }
                if (!z) {
                    f4Var.mo108732L2(str + XVFSFile.PATH_SEPARATOR + j + XVFSFile.PATH_SEPARATOR + 1 + XVFSFile.PATH_SEPARATOR + "\n");
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r7.startsWith(r2) != false) goto L_0x0023;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m92083u(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = ""
            goto L_0x002f
        L_0x0011:
            java.lang.String r0 = "amr_"
            boolean r2 = r7.startsWith(r0)
            if (r2 == 0) goto L_0x001a
            goto L_0x002f
        L_0x001a:
            java.lang.String r2 = "spx_"
            boolean r3 = r7.startsWith(r2)
            if (r3 == 0) goto L_0x0025
        L_0x0023:
            r0 = r2
            goto L_0x002f
        L_0x0025:
            java.lang.String r2 = "silk_"
            boolean r3 = r7.startsWith(r2)
            if (r3 == 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            java.lang.String r6 = m92071i(r6, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 == 0) goto L_0x003a
            return r1
        L_0x003a:
            java.lang.String r7 = m92075m(r7)
            java.lang.String r0 = m92075m(r6)
            r2 = 0
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r0, r2)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x004e
            return r1
        L_0x004e:
            r7 = 1
            m92085w(r6, r8, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C76552z.m92083u(java.lang.String, java.lang.String, int):java.lang.String");
    }

    /* renamed from: v */
    public static boolean m92084v(String str) {
        Class cls = C75700k0.class;
        C115669n.INSTANCE.idkeyStat(111, 234, 1, false);
        boolean z = false;
        if (str == null) {
            return false;
        }
        C76551y o = m92077o(str);
        if (o == null) {
            Log.m105920e("MicroMsg.VoiceLogic", "Set error failed file:" + str);
            return false;
        }
        o.f224058i = 98;
        o.f224060k = System.currentTimeMillis() / 1000;
        o.f224050a = C0947jz.f2205e;
        boolean z2 = m92088z(o);
        Log.m105924i("MicroMsg.VoiceLogic", "setError file:" + str + " msgid:" + o.f224062m + " old stat:" + o.f224058i);
        if (o.f224062m == 0 || Util.isNullOrNil(o.f224052c)) {
            Log.m105920e("MicroMsg.VoiceLogic", "setError failed msg id:" + o.f224062m + " user:" + o.f224052c);
            return z2;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(o.f224062m);
        C117407d.INSTANCE.idkeyStat(111, 33, 1, true);
        b002.setMsgId(o.f224062m);
        b002.mo100991d(5);
        b002.mo108749c3(o.f224052c);
        b002.mo108732L2(C76549w.m92049c(o.f224063n, (long) Math.max(o.f224061l, 0), true));
        b002.mo108743W2(b002.f230723F & -8193);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
        VoiceMsgDownloadFinishEvent voiceMsgDownloadFinishEvent = new VoiceMsgDownloadFinishEvent();
        voiceMsgDownloadFinishEvent.f194004d.f194005a = b002.getMsgId();
        VoiceMsgDownloadFinishEvent.C67814a aVar = voiceMsgDownloadFinishEvent.f194004d;
        aVar.f194006b = false;
        if ((o.f224071v & 1) != 0) {
            z = true;
        }
        aVar.f194007c = z;
        voiceMsgDownloadFinishEvent.asyncPublish(Looper.getMainLooper());
        return z2;
    }

    /* renamed from: w */
    public static boolean m92085w(String str, int i, int i2) {
        if (str == null) {
            return false;
        }
        Log.m105918d("MicroMsg.VoiceLogic", "StopRecord fileName[" + str + "], fullPath[" + m92075m(str) + "]");
        C76551y o = m92077o(str);
        if (o == null) {
            return false;
        }
        int i3 = o.f224058i;
        if (!(i3 == 97 || i3 == 98)) {
            o.f224058i = 3;
        }
        int d = C76550x.m92055d(str);
        o.f224057h = d;
        if (d <= 0) {
            m92084v(str);
            return false;
        }
        o.f224060k = System.currentTimeMillis() / 1000;
        o.f224061l = i;
        o.f224050a = 3424;
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108749c3(o.f224052c);
        f4Var.setType(34);
        f4Var.mo108740T2(1);
        f4Var.mo108739S2(str);
        int i4 = o.f224058i;
        if (i4 == 97) {
            f4Var.mo100991d(2);
            f4Var.mo108732L2(C76549w.m92049c(o.f224063n, (long) o.f224061l, false));
        } else if (i4 == 98) {
            f4Var.mo100991d(5);
            f4Var.mo108732L2(C76549w.m92049c(o.f224063n, -1, true));
        } else {
            f4Var.mo100991d(1);
            f4Var.mo108732L2(C76549w.m92049c(o.f224063n, (long) o.f224061l, false));
        }
        f4Var.mo108733M2(C75604z3.m90843o(o.f224052c));
        f4Var.mo101007n4(i2);
        ((C87107w.C75813c) C67380a.C67381a.f193260a).mo106108c(f4Var);
        o.f224062m = C75604z3.m90852x(f4Var);
        boolean z = m92088z(o);
        HashMap<String, WeakReference<C77002r>> hashMap = f224074a;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        return z;
    }

    /* renamed from: x */
    public static int m92086x(String str, int i, C35136m.C35137a aVar) {
        C76551y o;
        if (str == null || (o = m92077o(str)) == null) {
            return -1;
        }
        o.f224056g = i;
        o.f224060k = System.currentTimeMillis() / 1000;
        o.f224050a = 272;
        int i2 = o.f224057h;
        int i3 = 0;
        if (i2 > 0 && i >= i2) {
            m92087y(o, aVar);
            o.f224058i = 99;
            o.f224071v = 0;
            o.f224050a = o.f224050a | 64 | 1048576;
            Log.m105924i("MicroMsg.VoiceLogic", "END!!! updateRecv  file:" + str + " newsize:" + i + " total:" + o.f224057h + " status:" + o.f224058i + " netTimes:" + o.f224064o);
            i3 = 1;
            m92067e(str);
        }
        Log.m105924i("MicroMsg.VoiceLogic", "updateRecv file:" + str + " newsize:" + i + " total:" + o.f224057h + " status:" + o.f224058i);
        if (!m92088z(o)) {
            return -3;
        }
        return i3;
    }

    /* renamed from: y */
    public static boolean m92087y(C76551y yVar, C35136m.C35137a aVar) {
        try {
            yVar.f224062m = (long) ((int) m92068f(yVar, true, 3, "", yVar.f224066q, aVar));
            yVar.f224050a |= 2048;
            return m92088z(yVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.VoiceLogic", "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: z */
    public static boolean m92088z(C76551y yVar) {
        if (yVar == null || yVar.f224050a == -1) {
            return false;
        }
        return C76546u.yx0().mo106782Ow(yVar.f224051b, yVar);
    }
}
