package hd0;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import bp3.C104160f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kj2.C117407d;
import p206nj.C76861g;
import p682rz.C101489t;
import te3.C101783gu2;
import te3.tc4;
import xb0.C102609h;
import zh3.C91753f;

/* renamed from: hd0.r0 */
public class C98429r0 {
    /* renamed from: A */
    public static void m127795A(String str, int i) {
        C98408n0 i2 = m127818i(str);
        if (i2 != null) {
            int i3 = i2.f288566m;
            if (i3 <= 0 || Math.abs(i3 - i) > 2) {
                i2.f288566m = i;
                i2.f288548P = 4096;
                Log.m105925i("MicroMsg.VideoLogic", "repair video duration ret %b, duration[%d, %d]", Boolean.valueOf(m127808N(i2)), Integer.valueOf(i3), Integer.valueOf(i));
            }
        }
    }

    /* renamed from: B */
    public static boolean m127796B(String str) {
        Log.m105924i("MicroMsg.VideoLogic", "resetMsgRecv fileName : " + str);
        C98408n0 n0Var = new C98408n0();
        n0Var.f288562i = 112;
        n0Var.f288564k = Util.nowSecond();
        n0Var.f288565l = Util.nowSecond();
        n0Var.f288554a = str;
        n0Var.f288548P = 3328;
        if (!m127808N(n0Var)) {
            return false;
        }
        C98398h0.Dx0().mo137787d();
        return true;
    }

    /* renamed from: C */
    public static boolean m127797C(String str) {
        C98408n0 i = m127818i(str);
        if (i == null) {
            return false;
        }
        Log.m105925i("MicroMsg.VideoLogic", "rsetMsgSend %s", str);
        C101783gu2 gu22 = i.f288538F;
        if (gu22 != null) {
            gu22.f298310f = 0;
            i.f288538F = gu22;
        }
        if (i.f288560g < i.f288561h) {
            i.f288562i = 103;
        } else {
            i.f288562i = 104;
        }
        i.f288563j = Util.nowSecond();
        i.f288564k = Util.nowSecond();
        i.f288565l = Util.nowSecond();
        i.f288548P = 536874752;
        if (!m127808N(i)) {
            return false;
        }
        C98398h0.Dx0().mo137787d();
        return true;
    }

    /* renamed from: D */
    public static boolean m127798D(String str) {
        Class cls = C75700k0.class;
        C98408n0 i = m127818i(str);
        if (i == null || i.f288567n == 0) {
            return false;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(i.f288567n);
        int type = b002.getType();
        Log.m105925i("MicroMsg.VideoLogic", "ashutest::setBlack, msg type %d", Integer.valueOf(type));
        if (43 != type && 62 != type) {
            return false;
        }
        b002.mo108732L2(C32829l0.m39827b(i.mo137701e(), (long) i.f288566m, false));
        b002.mo100991d(2);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(i.f288567n, b002);
        i.f288562i = WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA;
        i.f288564k = Util.nowSecond();
        i.f288548P = 1280;
        Log.m105918d("MicroMsg.VideoLogic", "[oneliang][setBlack]");
        return m127808N(i);
    }

    /* renamed from: E */
    public static boolean m127799E(String str) {
        Class cls = C75700k0.class;
        C115669n.INSTANCE.idkeyStat(111, 218, 1, false);
        Log.m105929w("MicroMsg.VideoLogic", "setError file:%s stack:[%s]", str, Util.getStack());
        ((HashMap) C98398h0.Dx0().f288759o).remove(str);
        if (str == null) {
            return false;
        }
        C98408n0 i = m127818i(str);
        if (i == null) {
            Log.m105920e("MicroMsg.VideoLogic", "Set error failed file:" + str);
            return false;
        }
        i.f288562i = 198;
        i.f288564k = System.currentTimeMillis() / 1000;
        i.f288548P = 1280;
        C101783gu2 gu22 = i.f288538F;
        gu22.f298310f = 0;
        i.f288538F = gu22;
        boolean N = m127808N(i);
        Log.m105918d("MicroMsg.VideoLogic", "setError file:" + str + " msgid:" + i.f288567n + " old stat:" + i.f288562i);
        if (i.f288567n == 0) {
            return N;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(i.f288567n);
        int type = b002.getType();
        Log.m105925i("MicroMsg.VideoLogic", "set error, msg type %d", Integer.valueOf(type));
        if (43 != type && 62 != type) {
            return N;
        }
        C117407d.INSTANCE.idkeyStat(111, 32, 1, true);
        b002.mo108749c3(i.mo137707k());
        b002.mo108732L2(C32829l0.m39827b(i.mo137701e(), -1, true));
        Log.m105918d("MicroMsg.VideoLogic", "[oneliang][setError]");
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
        return N;
    }

    /* renamed from: F */
    public static boolean m127800F(String str) {
        C98408n0 i = m127818i(str);
        if (i == null) {
            return false;
        }
        i.f288540H = 2;
        i.f288548P = 2;
        boolean w = C98398h0.Bx0().mo137733w(i);
        Log.m105924i("MicroMsg.VideoLogic", "set hevc video format ret: " + w + " status: " + i.f288562i);
        return w;
    }

    /* renamed from: G */
    public static boolean m127801G(String str) {
        C98408n0 i = m127818i(str);
        if (i == null) {
            return false;
        }
        i.f288540H = 2;
        i.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        i.f288565l = Util.nowSecond();
        i.f288564k = Util.nowSecond();
        i.f288537E = 19;
        i.f288548P = 268438786;
        boolean w = C98398h0.Bx0().mo137733w(i);
        Log.m105924i("MicroMsg.VideoLogic", "set hevc video Completion ret: " + w + " status: " + i.f288562i);
        return w;
    }

    /* renamed from: H */
    public static void m127802H(String str, int i) {
        C98408n0 i2 = m127818i(str);
        if (i2 != null) {
            if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(i2.f288567n).mo100983V3()) {
                Log.m105924i("MicroMsg.VideoLogic", "jump mp video");
                return;
            }
            i2.f288562i = 122;
            i2.f288565l = Util.nowSecond();
            i2.f288564k = Util.nowSecond();
            i2.f288537E = i;
            i2.f288548P = 268438784;
            boolean w = C98398h0.Bx0().mo137733w(i2);
            Log.m105924i("MicroMsg.VideoLogic", "set online video Completion ret: " + w + " status: " + i2.f288562i);
        }
    }

    /* renamed from: I */
    public static int m127803I(String str) {
        C98408n0 i = m127818i(str);
        if (i == null) {
            Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            return 0 - C76861g.m92658a();
        }
        int i2 = i.f288562i;
        if (i2 == 111 || i2 == 113 || i2 == 121 || i2 == 122 || i2 == 123) {
            int i3 = 256;
            boolean z = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(i.f288567n).mo100983V3();
            Log.m105925i("MicroMsg.VideoLogic", " is mp video :%b", Boolean.valueOf(z));
            if (!m127810a() || z) {
                Log.m105928w("MicroMsg.VideoLogic", "start complete online video, but can not stream video now!");
                i.f288562i = 112;
                i.f288558e = 0;
                i3 = 272;
            } else {
                i.f288562i = 122;
            }
            i.f288565l = Util.nowSecond();
            i.f288564k = Util.nowSecond();
            i.f288548P = i3 | 2048 | 1024;
            if (!m127808N(i)) {
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " update failed: " + str);
                return 0 - C76861g.m92658a();
            }
            C98398h0.Dx0().mo137786c();
            C98398h0.Dx0().mo137787d();
            return 0;
        }
        Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + i.f288562i);
        return 0 - C76861g.m92658a();
    }

    /* renamed from: J */
    public static int m127804J(String str) {
        C98408n0 i = m127818i(str);
        if (i == null) {
            Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            return 0 - C76861g.m92658a();
        }
        int i2 = i.f288562i;
        if (i2 == 111 || i2 == 113 || i2 == 121 || i2 == 122 || i2 == 123) {
            i.f288562i = 112;
            i.f288565l = Util.nowSecond();
            i.f288564k = Util.nowSecond();
            i.f288548P = 3328;
            if (!m127808N(i)) {
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " update failed: " + str);
                return 0 - C76861g.m92658a();
            }
            C98398h0.Dx0().mo137786c();
            C98398h0.Dx0().mo137787d();
            return 0;
        }
        Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + i.f288562i);
        return 0 - C76861g.m92658a();
    }

    /* renamed from: K */
    public static int m127805K(String str) {
        C98408n0 i = m127818i(str);
        if (i == null) {
            Log.m105920e("MicroMsg.VideoLogic", "SENDERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            String q = C98398h0.Bx0().mo137728q(str);
            String r = C98398h0.Bx0().mo137729r(str);
            C86013q1.m106447h(q);
            C86013q1.m106447h(r);
            Log.m105924i("MicroMsg.VideoLogic", "startSend, video info is null, need delete file, videoPath = " + q + " thumb path = " + r);
            return 0 - C76861g.m92658a();
        }
        int i2 = i.f288562i;
        if (i2 == 102 || i2 == 105) {
            if (i2 == 102) {
                i.f288562i = 103;
            } else if (i.f288561h == i.f288560g) {
                i.f288562i = 104;
            } else {
                i.f288562i = 103;
            }
            Log.m105924i("MicroMsg.VideoLogic", C76861g.m92660c() + "startSend file:" + str + " status:[" + i2 + "->" + i.f288562i + "]");
            i.f288565l = Util.nowSecond();
            i.f288564k = Util.nowSecond();
            i.f288548P = 3328;
            if (!m127808N(i)) {
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " update failed: " + str);
                return 0 - C76861g.m92658a();
            }
            C98398h0.Dx0().mo137787d();
            return 0;
        }
        Log.m105920e("MicroMsg.VideoLogic", "SENDERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + i.f288562i);
        return 0 - C76861g.m92658a();
    }

    /* renamed from: L */
    public static boolean m127806L(String str, int i) {
        C98408n0 i2 = m127818i(str);
        int i3 = 0;
        if (i2 == null) {
            Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            return false;
        }
        if (i != i2.f288559f) {
            Log.m105929w("MicroMsg.VideoLogic", "download video finish, but file size is not equals db size[%d, %d]", Integer.valueOf(i), Integer.valueOf(i2.f288559f));
            i2.f288559f = i;
            i3 = 32;
        }
        i2.f288558e = i;
        i2.f288564k = Util.nowSecond();
        m127807M(i2);
        i2.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        i2.f288548P = i3 | 1296;
        boolean N = m127808N(i2);
        Log.m105924i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + str + " newsize:" + i + " total:" + i2.f288559f + " status:" + i2.f288562i + " netTimes:" + i2.f288568o + " update ret: " + N);
        return N;
    }

    /* renamed from: M */
    public static boolean m127807M(C98408n0 n0Var) {
        Class cls = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(n0Var.f288567n);
        int type = b002.getType();
        Log.m105925i("MicroMsg.VideoLogic", "ashutest::update read fin msg info, msg type %d", Integer.valueOf(type));
        if (43 != type && 62 != type) {
            return false;
        }
        b002.mo108745Y2(n0Var.f288556c);
        b002.mo108732L2(C32829l0.m39827b(n0Var.mo137701e(), (long) n0Var.f288566m, false));
        b002.mo108749c3(n0Var.mo137707k());
        Log.m105918d("MicroMsg.VideoLogic", "set msg content :" + b002.getContent());
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(n0Var.f288556c, b002);
        Log.m105919d("MicroMsg.VideoLogic", "[oneliang][updateReadFinMsgInfo], msgId:%d", Long.valueOf(b002.getMsgId()));
        if (b002.mo100989b4()) {
            Log.m105925i("MicroMsg.VideoLogic", "on receive sight, sightFileSize %d bytes", Integer.valueOf(n0Var.f288559f));
        }
        return true;
    }

    /* renamed from: N */
    public static boolean m127808N(C98408n0 n0Var) {
        if (n0Var == null) {
            return false;
        }
        if ((n0Var.mo137700d() == null || n0Var.mo137700d().length() <= 0) && n0Var.f288548P == -1) {
            return false;
        }
        return C98398h0.Bx0().mo137733w(n0Var);
    }

    /* renamed from: O */
    public static void m127809O(C98408n0 n0Var) {
        Class cls = C75700k0.class;
        if (n0Var == null) {
            Log.m105920e("MicroMsg.VideoLogic", "video info is null");
            return;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(n0Var.f288567n);
        int type = b002.getType();
        Log.m105925i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMsgInfo, msg type %d", Integer.valueOf(type));
        if (43 == type || 62 == type) {
            b002.mo108740T2(1);
            b002.mo108749c3(n0Var.mo137707k());
            b002.mo108745Y2(n0Var.f288556c);
            b002.mo100991d(2);
            b002.mo108732L2(C32829l0.m39827b(n0Var.mo137701e(), (long) n0Var.f288566m, false));
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(n0Var.f288567n, b002);
            Log.m105919d("MicroMsg.VideoLogic", "[oneliang][updateWriteFinMsgInfo], msgId:%d", Long.valueOf(b002.getMsgId()));
        }
    }

    /* renamed from: a */
    public static boolean m127810a() {
        C102609h.Fx0();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ONLINE_VIDEO_INT, -1)).intValue();
        boolean Am = C102609h.m135509Am();
        boolean z = intValue != 0 && Am;
        Log.m105925i("MicroMsg.SubCoreVideoControl", "check can c2c online play video [%b] mmvideoplayer[%b] opcode[%d] abTestFlag[%d]", Boolean.valueOf(z), Boolean.valueOf(Am), Integer.valueOf(intValue), 1);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r8 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.VideoPlayHistoryStorage", "getPlayDuration ret : " + r0 + " starttime : " + r3.value + " playduration : " + r4.value);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        if (r0 == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.secondsToNow((long) r3.value) >= 300) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
        r0 = r4.value;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        if (r0 < 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r0 < (r20 - 1)) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.VideoLogic", "check last play duration result[%d] startTime[%d] filename[%s] cost %d", java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r3.value), r21, java.lang.Long.valueOf(com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        if (r8 != null) goto L_0x0071;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m127811b(int r20, java.lang.String r21) {
        /*
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            hd0.y0 r0 = hd0.C98398h0.Cx0()
            r0.getClass()
            java.lang.String r5 = "playduration"
            java.lang.String r6 = "starttime"
            java.lang.String r7 = "MicroMsg.VideoPlayHistoryStorage"
            r8 = 0
            r9 = 1
            r10 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f288747a     // Catch:{ Exception -> 0x0066 }
            java.lang.String r12 = "VideoPlayHistory"
            java.lang.String[] r13 = new java.lang.String[]{r6, r5}     // Catch:{ Exception -> 0x0066 }
            java.lang.String r14 = "filename=?"
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ Exception -> 0x0066 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r21)     // Catch:{ Exception -> 0x0066 }
            r15[r10] = r11     // Catch:{ Exception -> 0x0066 }
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            r19 = 2
            r11 = r0
            zh3.f r11 = (zh3.C91753f) r11     // Catch:{ Exception -> 0x0066 }
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0066 }
            if (r8 == 0) goto L_0x005f
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x0066 }
            if (r0 == 0) goto L_0x005f
            int r0 = r8.getColumnIndex(r6)     // Catch:{ Exception -> 0x0066 }
            int r0 = r8.getInt(r0)     // Catch:{ Exception -> 0x0066 }
            r3.value = r0     // Catch:{ Exception -> 0x0066 }
            int r0 = r8.getColumnIndex(r5)     // Catch:{ Exception -> 0x0066 }
            int r0 = r8.getInt(r0)     // Catch:{ Exception -> 0x0066 }
            r4.value = r0     // Catch:{ Exception -> 0x0066 }
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r8 == 0) goto L_0x0074
            goto L_0x0071
        L_0x0063:
            r0 = move-exception
            goto L_0x00dd
        L_0x0066:
            r0 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ all -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r5, r6)     // Catch:{ all -> 0x0063 }
            r0 = 0
            if (r8 == 0) goto L_0x0074
        L_0x0071:
            r8.close()
        L_0x0074:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getPlayDuration ret : "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " starttime : "
            r5.append(r6)
            int r6 = r3.value
            r5.append(r6)
            java.lang.String r6 = " playduration : "
            r5.append(r6)
            int r6 = r4.value
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            if (r0 == 0) goto L_0x00ae
            int r0 = r3.value
            long r5 = (long) r0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
            r7 = 300(0x12c, double:1.48E-321)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            int r0 = r4.value
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 < 0) goto L_0x00b5
            int r4 = r20 + -1
            if (r0 < r4) goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r10] = r5
            int r3 = r3.value
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r9] = r3
            r3 = 2
            r4[r3] = r21
            r3 = 3
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r3] = r1
            java.lang.String r1 = "MicroMsg.VideoLogic"
            java.lang.String r2 = "check last play duration result[%d] startTime[%d] filename[%s] cost %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r4)
            return r0
        L_0x00dd:
            if (r8 == 0) goto L_0x00e2
            r8.close()
        L_0x00e2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98429r0.m127811b(int, java.lang.String):int");
    }

    /* renamed from: c */
    public static boolean m127812c(String str) {
        String str2 = str;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.VideoLogic", "check short video was replaced, but filename is null.");
            return false;
        }
        Log.m105918d("MicroMsg.VideoLogic", "checkShortVideoWasReplaced filename: " + str2);
        C98408n0 i = m127818i(str);
        if (i != null && i.f288562i == 199) {
            int i2 = i.f288559f;
            int l = (int) C86013q1.m106451l(C98398h0.Bx0().mo137728q(str2));
            Log.m105919d("MicroMsg.VideoLogic", "it short video file size[%d] infoLen[%d]", Integer.valueOf(l), Integer.valueOf(i2));
            if (l > 0 && Math.abs(l - i2) > 16) {
                Log.m105929w("MicroMsg.VideoLogic", "it error short video can not retransmit. file size[%d], video info size[%d]", Integer.valueOf(l), Integer.valueOf(i2));
                String d = i.mo137700d();
                Class cls = C75700k0.class;
                C115669n.INSTANCE.idkeyStat(111, 217, 1, false);
                C98408n0 i3 = m127818i(d);
                if (i3 != null) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(i3.f288567n);
                    int type = b002.getType();
                    Log.m105925i("MicroMsg.VideoLogic", "ashutest::setBroken, msg type %d", Integer.valueOf(type));
                    if (43 == type || 62 == type) {
                        b002.mo108732L2(C32829l0.m39827b(i3.mo137701e(), (long) i3.f288566m, false));
                        b002.mo100991d(2);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(i3.f288567n, b002);
                        i3.f288562i = 196;
                        i3.f288564k = Util.nowSecond();
                        i3.f288548P = 1280;
                        Log.m105918d("MicroMsg.VideoLogic", "[oneliang][setBroken]");
                        m127808N(i3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m127813d(String str) {
        C98408n0 i;
        int i2;
        if (str == null || (i = m127818i(str)) == null || (i2 = i.f288568o) >= 2500) {
            return false;
        }
        i.f288568o = i2 + 1;
        i.f288548P = 16384;
        return m127808N(i);
    }

    /* renamed from: e */
    public static String m127814e(long j, int i) {
        return j + "_" + i;
    }

    /* renamed from: f */
    public static void m127815f(String str) {
        if (!Util.isNullOrNil(str)) {
            C98408n0 i = m127818i(str);
            String str2 = i != null ? i.f288546N : null;
            C98410o0 Bx0 = C98398h0.Bx0();
            C91753f fVar = Bx0.f288587a;
            String a = o0$$e.m127753a(str);
            boolean z = true;
            if (fVar.delete(a, "filename= ?", new String[]{"" + str}) > 0) {
                Bx0.f288588b.event(new C101489t.C77595a.C77596a(str, C101489t.C77595a.C77598b.DELETE, C101489t.C77595a.C77597c.NORMAL, 1, -1));
                Bx0.f288588b.doNotify();
            } else {
                z = false;
            }
            if (z) {
                try {
                    Uri n = C116299g2.m163858n(C98398h0.Bx0().mo137729r(str));
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (l.mo177810a()) {
                        boolean c = l.f348991a.mo119933c(l.f348992b);
                    }
                    Uri n2 = C116299g2.m163858n(C98398h0.Bx0().mo137728q(str));
                    String path2 = n2.getPath();
                    if (path2 != null) {
                        String k2 = C116299g2.m163855k(path2, false, false);
                        if (!n2.getPath().equals(k2)) {
                            n2 = n2.buildUpon().path(k2).build();
                        }
                    }
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                    if (l2.mo177810a()) {
                        boolean c2 = l2.f348991a.mo119933c(l2.f348992b);
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.VideoLogic", "ERR: Delete file Failed" + C76861g.m92660c() + " file:" + str + " msg:" + e.getMessage());
                }
                if (!Util.isNullOrNil(str2)) {
                    m127815f(str2);
                }
            }
        }
    }

    /* renamed from: g */
    public static void m127816g(String str) {
        if (!Util.isNullOrNil(str)) {
            boolean z = true;
            if (((C91753f) C98398h0.Cx0().f288747a).delete("VideoPlayHistory", "filename= ?", new String[]{str}) <= 0) {
                z = false;
            }
            Log.m105918d("MicroMsg.VideoLogic", "delete video play history ret : " + z + " filename : " + str);
        }
    }

    /* renamed from: h */
    public static int m127817h(C98408n0 n0Var) {
        if (n0Var.f288559f == 0) {
            return 0;
        }
        Log.m105918d("MicroMsg.VideoLogic", "cdntra getDownloadProgress :" + n0Var.f288558e + " " + n0Var.f288559f);
        return (int) ((((long) n0Var.f288558e) * 100) / ((long) n0Var.f288559f));
    }

    /* renamed from: i */
    public static C98408n0 m127818i(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return C98398h0.Bx0().mo137720f(str);
    }

    /* renamed from: j */
    public static C98408n0 m127819j(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return m127820k(str, str2);
        }
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C98408n0 i = m127818i(str);
        if (i != null) {
            return i;
        }
        ArrayList<C98408n0> p = m127825p(str2);
        if (p == null) {
            return null;
        }
        Iterator<C98408n0> it = p.iterator();
        while (it.hasNext()) {
            C98408n0 next = it.next();
            String str4 = next.f288533A;
            if (str4 != null && str4.toLowerCase().contains(str3.toLowerCase())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static C98408n0 m127820k(String str, String str2) {
        C98408n0 n0Var;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            return m127818i(str);
        }
        C98410o0 Bx0 = C98398h0.Bx0();
        Bx0.getClass();
        try {
            Cursor rawQuery = Bx0.f288587a.rawQuery(C98410o0.m127729k(o0$$e.m127753a(str)) + " where (" + o0$$e.m127753a(str) + "." + FFmpegMetadataRetriever.METADATA_KEY_FILENAME + " = '" + Util.escapeSqlValue("" + str) + "' OR " + o0$$e.m127753a(str) + "." + "media_id" + " = '" + Util.escapeSqlValue(str2) + "')", (String[]) null, 2);
            if (rawQuery == null) {
                return null;
            }
            if (rawQuery.moveToFirst()) {
                n0Var = new C98408n0();
                n0Var.mo137698a(rawQuery);
            } else {
                n0Var = null;
            }
            rawQuery.close();
            return n0Var;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoInfoStorage", e, "getByFileName error[%s]", e.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r6 == null) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m127821l(java.lang.String r10, com.tencent.p014mm.pointers.PInt r11, com.tencent.p014mm.pointers.PInt r12) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r1 = "MicroMsg.VideoLogic"
            r2 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r10 = "get media info but path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r10)
            return r2
        L_0x000f:
            r0 = 2
            r3 = 3
            r4 = 1
            java.lang.String r5 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(r10)     // Catch:{ JSONException -> 0x005a }
            if (r5 != 0) goto L_0x0019
            return r2
        L_0x0019:
            java.lang.String r6 = "videoInfo: %s"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ JSONException -> 0x005a }
            r7[r2] = r5     // Catch:{ JSONException -> 0x005a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r7)     // Catch:{ JSONException -> 0x005a }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005a }
            r6.<init>(r5)     // Catch:{ JSONException -> 0x005a }
            java.lang.String r5 = "videoDuration"
            int r5 = r6.getInt(r5)     // Catch:{ JSONException -> 0x005a }
            long r7 = (long) r5     // Catch:{ JSONException -> 0x005a }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r7)     // Catch:{ JSONException -> 0x005a }
            r11.value = r5     // Catch:{ JSONException -> 0x005a }
            java.lang.String r5 = "videoBitrate"
            int r5 = r6.getInt(r5)     // Catch:{ JSONException -> 0x005a }
            int r5 = r5 / 1000
            r12.value = r5     // Catch:{ JSONException -> 0x005a }
            java.lang.String r6 = "mp4v2 video bitrate %d kbps duration %d path %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x005a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x005a }
            r7[r2] = r5     // Catch:{ JSONException -> 0x005a }
            int r5 = r11.value     // Catch:{ JSONException -> 0x005a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x005a }
            r7[r4] = r5     // Catch:{ JSONException -> 0x005a }
            r7[r0] = r10     // Catch:{ JSONException -> 0x005a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r7)     // Catch:{ JSONException -> 0x005a }
            return r4
        L_0x005a:
            r5 = 0
            oj.c r6 = new oj.c     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
            r6.<init>()     // Catch:{ Exception -> 0x008a, all -> 0x0088 }
            r6.setDataSource(r10)     // Catch:{ Exception -> 0x0086 }
            r5 = 9
            java.lang.String r5 = r6.extractMetadata(r5)     // Catch:{ Exception -> 0x0086 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)     // Catch:{ Exception -> 0x0086 }
            long r7 = (long) r5     // Catch:{ Exception -> 0x0086 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r7)     // Catch:{ Exception -> 0x0086 }
            r11.value = r5     // Catch:{ Exception -> 0x0086 }
            r5 = 20
            java.lang.String r5 = r6.extractMetadata(r5)     // Catch:{ Exception -> 0x0086 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)     // Catch:{ Exception -> 0x0086 }
            int r5 = r5 / 1000
            r12.value = r5     // Catch:{ Exception -> 0x0086 }
            goto L_0x0099
        L_0x0083:
            r10 = move-exception
            r5 = r6
            goto L_0x00b7
        L_0x0086:
            r5 = move-exception
            goto L_0x008e
        L_0x0088:
            r10 = move-exception
            goto L_0x00b7
        L_0x008a:
            r6 = move-exception
            r9 = r6
            r6 = r5
            r5 = r9
        L_0x008e:
            java.lang.String r7 = "get video bitrate error. path %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0083 }
            r8[r2] = r10     // Catch:{ all -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r7, r8)     // Catch:{ all -> 0x0083 }
            if (r6 == 0) goto L_0x009c
        L_0x0099:
            r6.release()
        L_0x009c:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r12 = r12.value
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3[r2] = r12
            int r11 = r11.value
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r4] = r11
            r3[r0] = r10
            java.lang.String r10 = "retriever video bitrate %d kbps duration %d path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r10, r3)
            return r4
        L_0x00b7:
            if (r5 == 0) goto L_0x00bc
            r5.release()
        L_0x00bc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98429r0.m127821l(java.lang.String, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt):boolean");
    }

    /* renamed from: m */
    public static int m127822m(C98408n0 n0Var) {
        long j;
        long j2;
        C98408n0 i;
        if (n0Var.f288559f == 0) {
            return 0;
        }
        if (Util.isNullOrNil(n0Var.f288546N) || (i = m127818i(n0Var.f288546N)) == null) {
            j2 = 0;
            j = 0;
        } else {
            j2 = (long) i.f288558e;
            j = (long) i.f288559f;
        }
        if (j == 0) {
            return 0;
        }
        Log.m105918d("MicroMsg.VideoLogic", "cdntra getDownloadProgress :" + n0Var.f288558e + " " + n0Var.f288559f);
        return (int) ((j2 * 100) / j);
    }

    /* renamed from: n */
    public static int m127823n(C98408n0 n0Var) {
        long j;
        C98408n0 i;
        if (n0Var.f288559f == 0) {
            return 0;
        }
        long j2 = 0;
        if (!m127830u() || Util.isNullOrNil(n0Var.f288546N) || (i = m127818i(n0Var.f288546N)) == null) {
            j = 0;
        } else {
            j2 = (long) i.f288557d;
            j = (long) i.f288559f;
        }
        Log.m105918d("MicroMsg.VideoLogic", "cdntra getUploadProgress :" + n0Var.f288557d + " " + n0Var.f288559f + " origin offset = " + j2 + " origin total len = " + j);
        return (int) (((((long) n0Var.f288557d) * 100) + (j2 * 100)) / (((long) n0Var.f288559f) + j));
    }

    /* renamed from: o */
    public static int m127824o(C98408n0 n0Var) {
        if (n0Var.f288559f == 0) {
            return 0;
        }
        Log.m105918d("MicroMsg.VideoLogic", "cdntra getUploadProgress :" + n0Var.f288557d + " " + n0Var.f288559f);
        return (int) ((((long) n0Var.f288557d) * 100) / ((long) n0Var.f288559f));
    }

    /* renamed from: p */
    public static ArrayList<C98408n0> m127825p(String str) {
        ArrayList<C98408n0> arrayList;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C98410o0 Bx0 = C98398h0.Bx0();
        Bx0.getClass();
        ArrayList arrayList2 = (ArrayList) C98410o0.f288586c.get(str);
        if (arrayList2 != null) {
            arrayList = new ArrayList<>(arrayList2);
        } else {
            try {
                Cursor rawQuery = Bx0.f288587a.rawQuery(C98410o0.m127729k("videoinfo2") + " where (" + "videoinfo2" + "." + "media_id" + " = '" + Util.escapeSqlValue(str) + "')", (String[]) null, 2);
                if (rawQuery == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        C98408n0 n0Var = new C98408n0();
                        n0Var.mo137698a(rawQuery);
                        arrayList3.add(n0Var);
                    }
                    C98410o0.f288586c.put(str, arrayList3);
                    rawQuery.close();
                    arrayList = new ArrayList<>(arrayList3);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoInfoStorage", e, "getByFileName error[%s]", e.toString());
            }
        }
        if (arrayList == null) {
            Log.m105920e("MicroMsg.VideoLogic", "getVideoInfoByMediaId return null");
            return null;
        }
        Collections.sort(arrayList, new r0$$a());
        return arrayList;
    }

    /* renamed from: q */
    public static boolean m127826q(String str, String str2, int i, String str3, String str4, int i2, String str5, int i3, tc4 tc4, String str6, long j, String str7, String str8) {
        return m127828s(str, str2, i, str3, str4, i2, str5, i3, tc4, str6, j, str7, str8, false, -1);
    }

    /* renamed from: r */
    public static boolean m127827r(String str, String str2, int i, String str3, String str4, int i2, String str5, int i3, tc4 tc4, String str6, long j, String str7, String str8, boolean z) {
        return m127828s(str, str2, i, str3, str4, i2, str5, i3, tc4, str6, j, str7, str8, z, -1);
    }

    /* renamed from: s */
    public static boolean m127828s(String str, String str2, int i, String str3, String str4, int i2, String str5, int i3, tc4 tc4, String str6, long j, String str7, String str8, boolean z, long j2) {
        int i4 = i3;
        long j3 = j;
        long j4 = j2;
        C98408n0 n0Var = new C98408n0();
        n0Var.f288554a = str;
        n0Var.f288566m = i;
        n0Var.f288570q = str3;
        n0Var.f288571r = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        n0Var.f288563j = Util.nowSecond();
        n0Var.f288564k = Util.nowSecond();
        n0Var.f288575v = str5;
        n0Var.f288574u = str4;
        n0Var.f288535C = tc4;
        n0Var.f288536D = str6;
        n0Var.f288541I = j3;
        n0Var.f288549Q = true;
        n0Var.f288542J = str7;
        n0Var.f288550R = true;
        n0Var.f288543K = Util.nullAs(str8, "");
        n0Var.f288551S = true;
        if (!Util.isNullOrNil(str2)) {
            n0Var.f288546N = str2;
            n0Var.f288552T = true;
        }
        if (!Util.isNullOrNil(str4)) {
            n0Var.f288572s = 1;
        }
        if (i2 > 0) {
            n0Var.f288572s = 1;
        }
        if (62 == i4) {
            n0Var.f288576w = 3;
        } else if (i2 > 0) {
            n0Var.f288576w = 2;
        } else {
            n0Var.f288576w = 1;
        }
        int m = C98410o0.m127731m(C98398h0.Bx0().mo137728q(str));
        if (m <= 0) {
            Log.m105920e("MicroMsg.VideoLogic", "get Video size failed :" + str);
            return false;
        }
        n0Var.f288559f = m;
        String r = C98398h0.Bx0().mo137729r(str);
        int m2 = C98410o0.m127731m(r);
        if (m2 > 0 || z) {
            n0Var.f288561h = m2;
            Log.m105924i("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + n0Var.f288561h + " videosize:" + n0Var.f288559f + " msgType:" + i4 + " forwardMsgId: " + j3);
            n0Var.f288562i = 102;
            if (!z && j4 == -1) {
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108749c3(n0Var.mo137707k());
                f4Var.setType(i4);
                f4Var.mo108740T2(1);
                f4Var.mo108739S2(str);
                f4Var.mo100991d(1);
                f4Var.mo108733M2(C75604z3.m90843o(n0Var.mo137707k()));
                n0Var.f288567n = (long) ((int) C75604z3.m90852x(f4Var));
            }
            if (j4 != -1) {
                n0Var.f288567n = j4;
                n0Var.f288576w = 4;
            }
            return C98398h0.Bx0().mo137730s(n0Var);
        }
        Log.m105920e("MicroMsg.VideoLogic", "get Thumb size failed :" + r + " size:" + m2);
        return false;
    }

    /* renamed from: t */
    public static boolean m127829t(String str, int i, String str2, String str3, int i2, long j) {
        C98408n0 n0Var = new C98408n0();
        n0Var.f288554a = str;
        n0Var.f288566m = i;
        n0Var.f288570q = str2;
        n0Var.f288571r = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        n0Var.f288563j = Util.nowSecond();
        n0Var.f288564k = Util.nowSecond();
        n0Var.f288575v = str3;
        n0Var.f288541I = j;
        n0Var.f288549Q = true;
        if (62 == i2) {
            n0Var.f288576w = 3;
        } else {
            n0Var.f288576w = 1;
        }
        n0Var.f288559f = C98410o0.m127731m(C98398h0.Bx0().mo137728q(str));
        n0Var.f288561h = C98410o0.m127731m(C98398h0.Bx0().mo137729r(str));
        Log.m105924i("MicroMsg.VideoLogic", "init record file:" + str + " thumbsize:" + n0Var.f288561h + " videosize:" + n0Var.f288559f + " msgType:" + i2 + " forwardMsgId: " + j);
        n0Var.f288562i = 102;
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108749c3(n0Var.mo137707k());
        f4Var.setType(i2);
        f4Var.mo108740T2(1);
        f4Var.mo108739S2(str);
        f4Var.mo100991d(1);
        f4Var.mo108733M2(C75604z3.m90843o(n0Var.mo137707k()));
        n0Var.f288567n = (long) ((int) C75604z3.m90852x(f4Var));
        return C98398h0.Bx0().mo137730s(n0Var);
    }

    /* renamed from: u */
    public static boolean m127830u() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_send_origin_video_enable, C104160f.RepairerConfig_Mv_SendOriginVideo_Int, 0) == 1;
    }

    /* renamed from: v */
    public static boolean m127831v() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_send_video_placeholder_enable, C104160f.RepairerConfig_Mv_SendOVideoPlaceHolder_Int, 0) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r8 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r8 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
        if (r8 > 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012c, code lost:
        if (r8 > 0) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m127832w(java.lang.String r19, int r20, boolean r21) {
        /*
            r1 = r19
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            java.lang.String r2 = "MicroMsg.VideoLogic"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0017
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r1
            java.lang.String r1 = "noteVideoPlayHistory error filename[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r1, r0)
            return
        L_0x0017:
            if (r20 >= 0) goto L_0x001b
            r0 = 0
            goto L_0x001d
        L_0x001b:
            r0 = r20
        L_0x001d:
            int r5 = r0 / 1000
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            hd0.y0 r0 = hd0.C98398h0.Cx0()
            r0.getClass()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            java.lang.String r9 = "filename"
            java.lang.String r10 = "MicroMsg.VideoPlayHistoryStorage"
            if (r8 == 0) goto L_0x0036
        L_0x0034:
            r0 = 0
            goto L_0x0077
        L_0x0036:
            r8 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f288747a     // Catch:{ Exception -> 0x0069 }
            java.lang.String r12 = "VideoPlayHistory"
            java.lang.String[] r13 = new java.lang.String[]{r9}     // Catch:{ Exception -> 0x0069 }
            java.lang.String r14 = "filename=?"
            java.lang.String[] r15 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0069 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r19)     // Catch:{ Exception -> 0x0069 }
            r15[r3] = r11     // Catch:{ Exception -> 0x0069 }
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            r11 = r0
            zh3.f r11 = (zh3.C91753f) r11     // Catch:{ Exception -> 0x0069 }
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0069 }
            if (r8 == 0) goto L_0x0063
            boolean r0 = r8.moveToFirst()     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0063
            r8.close()
            r0 = 1
            goto L_0x0077
        L_0x0063:
            if (r8 == 0) goto L_0x0034
            goto L_0x0073
        L_0x0066:
            r0 = move-exception
            goto L_0x015a
        L_0x0069:
            r0 = move-exception
            java.lang.String r11 = ""
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r11, r12)     // Catch:{ all -> 0x0066 }
            if (r8 == 0) goto L_0x0034
        L_0x0073:
            r8.close()
            goto L_0x0034
        L_0x0077:
            java.lang.String r8 = "VideoPlayHistory"
            java.lang.String r13 = "playduration"
            java.lang.String r14 = "starttime"
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x00dd
            hd0.y0 r0 = hd0.C98398h0.Cx0()
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r11 = r17 / r15
            int r12 = (int) r11
            r0.getClass()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r11 == 0) goto L_0x0098
            goto L_0x00db
        L_0x0098:
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            r11.put(r9, r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.put(r14, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11.put(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            java.lang.String r13 = "downloadway"
            r11.put(r13, r12)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f288747a
            zh3.f r0 = (zh3.C91753f) r0
            long r8 = r0.mo125627q(r8, r9, r11, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "insert video play history ret : "
            r0.append(r11)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
        L_0x00d9:
            r0 = 1
            goto L_0x012f
        L_0x00db:
            r0 = 0
            goto L_0x012f
        L_0x00dd:
            hd0.y0 r0 = hd0.C98398h0.Cx0()
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r11 = r11 / r15
            int r9 = (int) r11
            r0.getClass()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r11 == 0) goto L_0x00f1
            goto L_0x00db
        L_0x00f1:
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.put(r14, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r11.put(r13, r9)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f288747a
            java.lang.String[] r9 = new java.lang.String[r4]
            r9[r3] = r1
            zh3.f r0 = (zh3.C91753f) r0
            java.lang.String r12 = "filename=?"
            int r0 = r0.update(r8, r11, r12, r9)
            long r8 = (long) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "update video play history ret : "
            r0.append(r11)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            goto L_0x00d9
        L_0x012f:
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8[r3] = r0
            r8[r4] = r1
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r8[r0] = r1
            r0 = 3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            r8[r0] = r1
            r0 = 4
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r8[r0] = r1
            java.lang.String r0 = "noteVideoPlayHistory ret %b filename %s playDuration %d isOnlinePlay %b cost %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r8)
            return
        L_0x015a:
            if (r8 == 0) goto L_0x015f
            r8.close()
        L_0x015f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98429r0.m127832w(java.lang.String, int, boolean):void");
    }

    /* renamed from: x */
    public static int m127833x(long j, String str, int i) {
        if (Util.isNullOrNil(str)) {
            return i;
        }
        try {
            String[] split = str.split("_");
            if (split != null) {
                if (split.length == 2) {
                    if (Util.getLong(split[0], 0) == j) {
                        return Util.getInt(split[1], 0);
                    }
                    return i;
                }
            }
            return i;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.VideoLogic", "parseEnterVideoOpTips error: " + e.toString());
        }
    }

    /* renamed from: y */
    public static int m127834y(String str) {
        int a;
        C98408n0 i = m127818i(str);
        if (i == null) {
            Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            a = C76861g.m92658a();
        } else {
            int i2 = i.f288562i;
            if (i2 == 112 || i2 == 120 || i2 == 122 || i2 == 123) {
                i.f288562i = 113;
                i.f288564k = Util.nowSecond();
                i.f288548P = 1280;
                if (m127808N(i)) {
                    return 0;
                }
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " update failed: " + str);
                a = C76861g.m92658a();
            } else {
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + i.f288562i);
                a = C76861g.m92658a();
            }
        }
        return 0 - a;
    }

    /* renamed from: z */
    public static int m127835z(String str) {
        int a;
        C98408n0 i = m127818i(str);
        if (i == null) {
            Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            a = C76861g.m92658a();
        } else {
            int i2 = i.f288562i;
            if (i2 == 104 || i2 == 103) {
                i.f288562i = 105;
                i.f288564k = Util.nowSecond();
                i.f288548P = 1280;
                if (m127808N(i)) {
                    return 0;
                }
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " update failed: " + str);
                a = C76861g.m92658a();
            } else {
                Log.m105920e("MicroMsg.VideoLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + i.f288562i);
                a = C76861g.m92658a();
            }
        }
        return 0 - a;
    }
}
