package com.tencent.p014mm.plugin.fts.p059ui;

import ad0.C0033t;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kv1.C99252h;
import lv1.C21461d;
import lv1.C99681n;
import p1035sf.C90183c;
import pv1.C22019b;
import xv1.C78997u;
import zv1.C23591a;
import zv1.C23592b;

/* renamed from: com.tencent.mm.plugin.fts.ui.b0 */
public class C18843b0 {

    /* renamed from: a */
    public static final /* synthetic */ int f52842a = 0;

    static {
        new AtomicBoolean(false);
        new AtomicInteger(0);
    }

    /* renamed from: a */
    public static final int m19714a(int i, int i2, boolean z) {
        if (z) {
            return 15;
        }
        if (i == 131072) {
            if (i2 == 11) {
                return 8;
            }
            switch (i2) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                default:
                    switch (i2) {
                        case 15:
                            return 16;
                        case 16:
                            return 10;
                        case 17:
                        case 18:
                            return 9;
                        default:
                            return 0;
                    }
            }
        } else if (i == 131075) {
            if (i2 == 1) {
                return 12;
            }
            if (i2 == 2) {
                return 13;
            }
            if (i2 == 3) {
                return 14;
            }
            if (i2 == 5) {
                return 12;
            }
            if (i2 == 6) {
                return 13;
            }
            if (i2 == 7) {
                return 14;
            }
            switch (i2) {
                case 29:
                case 30:
                case 31:
                case 32:
                    break;
                default:
                    switch (i2) {
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                            break;
                        default:
                            return 0;
                    }
            }
            return 11;
        } else if (i == 131081) {
            return 19;
        } else {
            return i == 65536 ? 17 : 0;
        }
    }

    /* renamed from: b */
    public static int m19715b(int i) {
        switch (i) {
            case 29:
                return 1;
            case 30:
                return 2;
            case 31:
                return 3;
            case 32:
                return 4;
            case 34:
                return 5;
            case 35:
            case 36:
                return 6;
            case 37:
                return 16;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    public static void m19716c(C22019b bVar, C23591a aVar) {
        int i;
        String str;
        int i2;
        C22019b bVar2 = bVar;
        C23591a aVar2 = aVar;
        int i3 = bVar2.f62331i;
        String str2 = bVar2.f62333k;
        int a = m19714a(bVar2.f62334l, bVar2.f62335m, bVar.mo35138j());
        int i4 = bVar2.f62323a;
        if (i4 == 9) {
            C0033t tVar = new C0033t();
            String k = bVar.mo35139k();
            if (k != null) {
                k = k.replaceAll(",", " ");
            }
            tVar.mo32a("20KeyWordId", k + ",");
            tVar.mo32a("21ViewType", "2,");
            tVar.mo32a("22OpType", "2,");
            tVar.mo32a("23ResultCount", ",");
            tVar.mo32a("24ClickPos", bVar2.f62332j + ",");
            tVar.mo32a("25ClickAppUserName", bVar2.f62336n + ",");
            Log.m105925i("MicroMsg.FTS.FTSReportLogic", "report oreh LocalSearchWeApp(13963), %s", tVar.mo34c());
            C115669n.INSTANCE.mo160131h(13963, tVar);
            i = 19;
        } else if (i4 == 10) {
            i = 20;
        } else if (i4 == 13) {
            i = 21;
        } else if (i4 != 17) {
            switch (i4) {
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 10;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 11;
                    break;
                case 6:
                    i = 12;
                    break;
                default:
                    return;
            }
        } else {
            i = 31;
        }
        if (bVar2 instanceof C78997u) {
            C78997u uVar = (C78997u) bVar2;
            boolean K = C45628s0.m50746K(uVar.f231976q);
            C99681n nVar = uVar.f231975p;
            long j = nVar.f292152f / 1000;
            long j2 = nVar.f292150d;
            C72976h2 j3 = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(uVar.f231977r);
            if (j3 != null) {
                i2 = j3.mo108786G2();
            } else {
                Log.m105928w("MicroMsg.FTS.FTSReportLogic", "11310 conv null");
                i2 = 0;
            }
            str = String.format("%s,%s,%s,%s,%s,%s", new Object[]{Long.valueOf(j), 0, Long.valueOf(j2), Integer.valueOf(K ? 1 : 0), Integer.valueOf(i2), 0});
        } else {
            str = "0,0,0,0,0,0";
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = aVar2.f67691a;
        long j5 = currentTimeMillis - j4;
        if (j5 < 0 || j4 == 0) {
            j5 = 0;
        }
        String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(bVar2.f62330h), Integer.valueOf(i), Integer.valueOf(i3), Util.nullAs(str2, ""), 0L, Integer.valueOf(a), Integer.valueOf(bVar.mo35135g()), Integer.valueOf(m19715b(bVar.mo35133e())), bVar.mo35132d(), Long.valueOf(j5), Integer.valueOf(aVar2.f67692b), str, "", "", "", "", "", "", "", "", "", Long.valueOf(C99252h.f291030c), Long.valueOf(aVar2.f67693c)});
        Log.m105919d("MicroMsg.FTS.FTSReportLogic", "report detail page click 11310: %s", format);
        C115669n.INSTANCE.kvStat(11310, format);
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04ae  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19717d(pv1.C22019b r23, zv1.C23592b r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            int r3 = r0.f62331i
            int r4 = r0.f62332j
            java.lang.String r5 = r0.f62333k
            java.lang.String r6 = r23.mo35132d()
            int r7 = r0.f62334l
            int r8 = r0.f62335m
            boolean r9 = r23.mo35138j()
            int r7 = m19714a(r7, r8, r9)
            int r8 = r0.f62329g
            r15 = 9
            r16 = 19
            r17 = 5
            r18 = 10
            r9 = -8
            r20 = 31
            r10 = 2
            r11 = 3
            r12 = 4
            r13 = 1
            java.lang.String r14 = "$"
            if (r8 != r9) goto L_0x0064
            int r8 = r0.f62323a
            if (r8 == r13) goto L_0x004f
            if (r8 == r10) goto L_0x004e
            if (r8 == r11) goto L_0x004b
            if (r8 == r12) goto L_0x0049
            if (r8 == r15) goto L_0x0046
            r11 = 17
            if (r8 == r11) goto L_0x0043
            r11 = 0
            goto L_0x004f
        L_0x0043:
            r11 = 31
            goto L_0x004f
        L_0x0046:
            r11 = 19
            goto L_0x004f
        L_0x0049:
            r11 = 5
            goto L_0x004f
        L_0x004b:
            r11 = 10
            goto L_0x004f
        L_0x004e:
            r11 = 4
        L_0x004f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r14)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r9 = 2
            goto L_0x016c
        L_0x0064:
            int r11 = r0.f62323a
            switch(r11) {
                case 1: goto L_0x016b;
                case 2: goto L_0x0169;
                case 3: goto L_0x0166;
                case 4: goto L_0x0164;
                case 5: goto L_0x0161;
                case 6: goto L_0x015e;
                case 7: goto L_0x015b;
                case 8: goto L_0x010f;
                case 9: goto L_0x008a;
                case 10: goto L_0x0084;
                case 11: goto L_0x0069;
                case 12: goto L_0x007e;
                case 13: goto L_0x007a;
                case 14: goto L_0x006e;
                case 15: goto L_0x0069;
                case 16: goto L_0x0069;
                case 17: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            return
        L_0x006a:
            r9 = 31
            goto L_0x016c
        L_0x006e:
            int r8 = r0.f62334l
            if (r8 != r10) goto L_0x0076
            r9 = 26
            goto L_0x016c
        L_0x0076:
            r9 = 25
            goto L_0x016c
        L_0x007a:
            r9 = 21
            goto L_0x016c
        L_0x007e:
            r8 = 22
            r9 = 22
            goto L_0x016c
        L_0x0084:
            r8 = 20
            r9 = 20
            goto L_0x016c
        L_0x008a:
            ad0.t r8 = new ad0.t
            r8.<init>()
            java.lang.String r11 = r23.mo35139k()
            java.lang.String r12 = ","
            if (r11 == 0) goto L_0x009d
            java.lang.String r15 = " "
            java.lang.String r11 = r11.replaceAll(r12, r15)
        L_0x009d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r12)
            java.lang.String r11 = r15.toString()
            java.lang.String r15 = "20KeyWordId"
            r8.mo32a(r15, r11)
            java.lang.String r11 = "21ViewType"
            java.lang.String r15 = "1,"
            r8.mo32a(r11, r15)
            java.lang.String r11 = "22OpType"
            java.lang.String r15 = "2,"
            r8.mo32a(r11, r15)
            java.lang.String r11 = "23ResultCount"
            r8.mo32a(r11, r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r15 = r0.f62332j
            r11.append(r15)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r15 = "24ClickPos"
            r8.mo32a(r15, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = r0.f62336n
            r11.append(r15)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "25ClickAppUserName"
            r8.mo32a(r12, r11)
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.String r12 = r8.mo34c()
            r15 = 0
            r11[r15] = r12
            java.lang.String r12 = "MicroMsg.FTS.FTSReportLogic"
            java.lang.String r9 = "report oreh LocalSearchWeApp(13963), %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r11)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 13963(0x368b, float:1.9566E-41)
            java.lang.Object[] r12 = new java.lang.Object[r13]
            r12[r15] = r8
            r9.mo160131h(r11, r12)
            r9 = 19
            goto L_0x016c
        L_0x010f:
            r9 = -5
            if (r8 != r9) goto L_0x0115
            r9 = 16
            goto L_0x0158
        L_0x0115:
            r9 = -3
            if (r8 != r9) goto L_0x011a
            r9 = 4
            goto L_0x0158
        L_0x011a:
            r9 = -4
            if (r8 != r9) goto L_0x011f
            r9 = 3
            goto L_0x0158
        L_0x011f:
            r9 = -1
            if (r8 != r9) goto L_0x0125
            r9 = 12
            goto L_0x0158
        L_0x0125:
            r9 = -2
            if (r8 != r9) goto L_0x012b
            r9 = 11
            goto L_0x0158
        L_0x012b:
            r9 = -15
            if (r8 != r9) goto L_0x0132
            r9 = 21
            goto L_0x0158
        L_0x0132:
            r9 = -6
            if (r8 != r9) goto L_0x0138
            r9 = 10
            goto L_0x0158
        L_0x0138:
            r9 = -13
            if (r8 != r9) goto L_0x013f
            r9 = 19
            goto L_0x0158
        L_0x013f:
            r9 = -7
            if (r8 != r9) goto L_0x0144
            r9 = 5
            goto L_0x0158
        L_0x0144:
            r9 = -23
            if (r8 != r9) goto L_0x014b
            r9 = 31
            goto L_0x0158
        L_0x014b:
            r9 = -20
            if (r8 != r9) goto L_0x015a
            int r8 = r0.f62334l
            if (r8 != r10) goto L_0x0156
            r9 = 26
            goto L_0x0158
        L_0x0156:
            r9 = 25
        L_0x0158:
            r8 = 2
            goto L_0x016d
        L_0x015a:
            return
        L_0x015b:
            r9 = 9
            goto L_0x016c
        L_0x015e:
            r9 = 12
            goto L_0x016c
        L_0x0161:
            r9 = 11
            goto L_0x016c
        L_0x0164:
            r9 = 5
            goto L_0x016c
        L_0x0166:
            r9 = 10
            goto L_0x016c
        L_0x0169:
            r9 = 4
            goto L_0x016c
        L_0x016b:
            r9 = 3
        L_0x016c:
            r8 = 1
        L_0x016d:
            long r11 = java.lang.System.currentTimeMillis()
            r16 = r14
            long r13 = r1.f67706c
            long r11 = r11 - r13
            r18 = r6
            r17 = r7
            r6 = 0
            int r19 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r19 < 0) goto L_0x0184
            int r19 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r19 != 0) goto L_0x0185
        L_0x0184:
            r11 = r6
        L_0x0185:
            java.lang.String r13 = r1.f67728y
            java.lang.String r14 = r23.mo35139k()
            boolean r13 = r13.equals(r14)
            r14 = 1
            r13 = r13 ^ r14
            com.tencent.mm.autogen.mmdata.rpt.UniverSearchStruct r14 = new com.tencent.mm.autogen.mmdata.rpt.UniverSearchStruct
            r14.<init>()
            int r15 = r0.f62330h
            r21 = r11
            long r10 = (long) r15
            r14.f48610d = r10
            long r9 = (long) r9
            r14.f48612e = r9
            long r9 = (long) r3
            r14.f48614f = r9
            long r8 = (long) r8
            r14.f48616g = r8
            long r3 = (long) r4
            r14.f48618h = r3
            java.lang.String r3 = ""
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r3)
            java.lang.String r5 = "SearchId"
            r8 = 1
            java.lang.String r4 = r14.mo86045b(r5, r4, r8)
            r14.f48620i = r4
            r14.f48622j = r6
            r4 = r17
            long r4 = (long) r4
            r14.f48624k = r4
            r14.f48625l = r6
            int r4 = r23.mo35135g()
            long r4 = (long) r4
            r14.f48626m = r4
            int r4 = r23.mo35133e()
            int r4 = m19715b(r4)
            long r4 = (long) r4
            r14.f48627n = r4
            r4 = r18
            r14.mo21196s(r4)
            r11 = r21
            r14.f48629p = r11
            int r4 = r1.f67708e
            long r4 = (long) r4
            r14.f48630q = r4
            int r4 = r1.f67709f
            long r4 = (long) r4
            r14.f48631r = r4
            int r4 = r1.f67711h
            long r4 = (long) r4
            r14.f48632s = r4
            int r4 = r1.f67715l
            long r4 = (long) r4
            r14.f48633t = r4
            int r4 = r1.f67717n
            long r4 = (long) r4
            r14.f48634u = r4
            int r4 = r1.f67718o
            long r4 = (long) r4
            r14.f48635v = r4
            r14.f48636w = r6
            int r4 = r1.f67719p
            long r4 = (long) r4
            r14.f48637x = r4
            int r4 = r1.f67720q
            long r4 = (long) r4
            r14.f48638y = r4
            long r4 = kv1.C99252h.f291030c
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "UniSearchId"
            r8 = 1
            java.lang.String r4 = r14.mo86045b(r5, r4, r8)
            r14.f48639z = r4
            java.lang.String r4 = r23.mo35139k()
            java.lang.String r5 = "Query"
            java.lang.String r4 = r14.mo86045b(r5, r4, r8)
            r14.f48581A = r4
            r14.f48582B = r6
            r14.f48583C = r6
            int r4 = r1.f67727x
            r5 = 2
            r1.f67727x = r5
            long r4 = (long) r4
            r14.f48584D = r4
            java.lang.String r4 = "HasSHowType"
            r5 = 1
            java.lang.String r4 = r14.mo86045b(r4, r3, r5)
            r14.f48585E = r4
            java.lang.String r4 = "VoiceInfo"
            java.lang.String r4 = r14.mo86045b(r4, r3, r5)
            r14.f48586F = r4
            java.lang.String r4 = "SessionId"
            java.lang.String r4 = r14.mo86045b(r4, r3, r5)
            r14.f48587G = r4
            r4 = 1
            r14.f48588H = r4
            if (r13 == 0) goto L_0x024e
            r8 = r4
            goto L_0x024f
        L_0x024e:
            r8 = r6
        L_0x024f:
            r14.f48589I = r8
            r14.f48590J = r6
            r14.f48591K = r6
            r14.f48592L = r6
            r14.f48593M = r6
            r14.f48594N = r6
            r14.f48595O = r6
            r14.f48596P = r6
            java.lang.String r8 = "GroupId"
            r9 = 1
            java.lang.String r8 = r14.mo86045b(r8, r3, r9)
            r14.f48597Q = r8
            java.lang.String r8 = "MatchStr"
            java.lang.String r10 = r14.mo86045b(r8, r3, r9)
            r14.f48598R = r10
            java.lang.String r10 = "MyRecentMsgCount"
            java.lang.String r10 = r14.mo86045b(r10, r3, r9)
            r14.f48599S = r10
            java.lang.String r10 = "MyRecentSearchCount"
            java.lang.String r10 = r14.mo86045b(r10, r3, r9)
            r14.f48600T = r10
            java.lang.String r10 = "MyRecentSearchDays"
            java.lang.String r10 = r14.mo86045b(r10, r3, r9)
            r14.f48601U = r10
            r14.f48602V = r6
            java.lang.String r10 = "TophitsCount"
            java.lang.String r10 = r14.mo86045b(r10, r3, r9)
            r14.f48603W = r10
            java.lang.String r10 = "TrainScore"
            java.lang.String r10 = r14.mo86045b(r10, r3, r9)
            r14.f48604X = r10
            long r9 = kv1.C99252h.f291030c
            r14.f48605Y = r9
            long r9 = kv1.C99252h.f291031d
            r14.f48606Z = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            long r10 = kv1.C99252h.f291030c
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "NewSessionIdStr"
            r11 = 1
            java.lang.String r9 = r14.mo86045b(r10, r9, r11)
            r14.f48617g0 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            long r12 = kv1.C99252h.f291031d
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "NewSearchIdStr"
            java.lang.String r9 = r14.mo86045b(r10, r9, r11)
            r14.f48619h0 = r9
            java.lang.String r9 = "strDocId"
            java.lang.String r9 = r14.mo86045b(r9, r3, r11)
            r14.f48607a0 = r9
            java.lang.String r9 = r23.mo35130b()
            java.lang.String r10 = "ClickedAppId"
            java.lang.String r9 = r14.mo86045b(r10, r9, r11)
            r14.f48608b0 = r9
            java.lang.String r9 = r23.mo35131c()
            java.lang.String r10 = "ClickedFinder"
            java.lang.String r9 = r14.mo86045b(r10, r9, r11)
            r14.f48609c0 = r9
            int r9 = r1.f67713j
            long r9 = (long) r9
            r14.f48611d0 = r9
            r14.f48613e0 = r6
            boolean r9 = r0 instanceof xv1.C78997u
            r10 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r12 = "4$"
            java.lang.String r13 = "ClickUsername"
            if (r9 == 0) goto L_0x0375
            r3 = r0
            xv1.u r3 = (xv1.C78997u) r3
            com.tencent.mm.storage.z1 r9 = r3.f231976q
            boolean r9 = eb0.C45628s0.m50746K(r9)
            if (r9 == 0) goto L_0x0313
            r6 = r4
        L_0x0313:
            r14.f48593M = r6
            lv1.n r4 = r3.f231975p
            long r5 = r4.f292152f
            long r5 = r5 / r10
            r14.f48590J = r5
            long r4 = r4.f292150d
            r14.f48592L = r4
            java.lang.CharSequence r4 = r3.f231978s
            if (r4 == 0) goto L_0x0349
            int r5 = r0.f62329g
            r6 = -8
            if (r5 != r6) goto L_0x0342
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.CharSequence r5 = r3.f231978s
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r14.mo21196s(r4)
            goto L_0x0349
        L_0x0342:
            java.lang.String r4 = r4.toString()
            r14.mo21196s(r4)
        L_0x0349:
            java.lang.CharSequence r4 = r3.f231980u
            if (r4 == 0) goto L_0x0358
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String r4 = r14.mo86045b(r8, r4, r5)
            r14.f48598R = r4
        L_0x0358:
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            java.lang.String r3 = r3.f231977r
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r3)
            if (r2 == 0) goto L_0x0477
            int r2 = r2.mo108786G2()
            long r2 = (long) r2
            r14.f48594N = r2
            goto L_0x0477
        L_0x0375:
            boolean r9 = r0 instanceof xv1.C79000v
            java.lang.String r4 = "3$"
            if (r9 == 0) goto L_0x03e6
            r3 = r0
            xv1.v r3 = (xv1.C79000v) r3
            com.tencent.mm.storage.z1 r5 = r3.f231944q
            boolean r5 = eb0.C45628s0.m50746K(r5)
            if (r5 == 0) goto L_0x0388
            r6 = 1
        L_0x0388:
            r14.f48593M = r6
            lv1.n r5 = r3.f231943p
            long r5 = r5.f292152f
            long r5 = r5 / r10
            r14.f48590J = r5
            java.lang.CharSequence r5 = r3.f231946s
            if (r5 == 0) goto L_0x03ba
            int r6 = r0.f62329g
            r7 = -8
            if (r6 != r7) goto L_0x03b3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.CharSequence r4 = r3.f231946s
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r14.mo21196s(r4)
            goto L_0x03ba
        L_0x03b3:
            java.lang.String r4 = r5.toString()
            r14.mo21196s(r4)
        L_0x03ba:
            java.lang.CharSequence r4 = r3.f231947t
            if (r4 == 0) goto L_0x03c9
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.String r4 = r14.mo86045b(r8, r4, r5)
            r14.f48598R = r4
        L_0x03c9:
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
            java.lang.String r3 = r3.f231945r
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r3)
            if (r2 == 0) goto L_0x0477
            int r2 = r2.mo108786G2()
            long r2 = (long) r2
            r14.f48594N = r2
            goto L_0x0477
        L_0x03e6:
            boolean r2 = r0 instanceof ex0.C20643e
            if (r2 == 0) goto L_0x0400
            r2 = r0
            ex0.e r2 = (ex0.C20643e) r2
            java.lang.String r3 = r2.getUserName()
            r4 = 1
            java.lang.String r3 = r14.mo86045b(r13, r3, r4)
            r14.f48615f0 = r3
            java.lang.String r2 = r2.getUserName()
            r1.f67697D = r2
            goto L_0x0477
        L_0x0400:
            boolean r2 = r0 instanceof xv1.C102758m
            if (r2 == 0) goto L_0x0477
            r2 = r0
            xv1.m r2 = (xv1.C102758m) r2
            java.lang.String r5 = r2.f303428r
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            if (r5 == 0) goto L_0x0428
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.CharSequence r5 = r2.f303429s
            java.lang.String r5 = r5.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r14.mo21196s(r4)
            goto L_0x0440
        L_0x0428:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.CharSequence r4 = r2.f303429s
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r14.mo21196s(r4)
        L_0x0440:
            int r4 = r2.f303427q
            r5 = 1
            if (r4 <= r5) goto L_0x0448
            java.lang.String r3 = "0$"
            goto L_0x045e
        L_0x0448:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            int r3 = r2.f62335m
            r4.append(r3)
            r3 = r16
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L_0x045e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.CharSequence r2 = r2.f303430t
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3 = 1
            java.lang.String r2 = r14.mo86045b(r8, r2, r3)
            r14.f48598R = r2
            goto L_0x0478
        L_0x0477:
            r3 = 1
        L_0x0478:
            java.lang.String r2 = r23.mo35131c()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0492
            java.lang.String r2 = r23.mo35131c()
            java.lang.String r2 = r14.mo86045b(r13, r2, r3)
            r14.f48615f0 = r2
            java.lang.String r2 = r23.mo35131c()
            r1.f67697D = r2
        L_0x0492:
            java.lang.String r2 = r23.mo35137i()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x04ae
            java.lang.String r2 = r23.mo35137i()
            r3 = 1
            java.lang.String r2 = r14.mo86045b(r13, r2, r3)
            r14.f48615f0 = r2
            java.lang.String r0 = r23.mo35137i()
            r1.f67697D = r0
            goto L_0x04af
        L_0x04ae:
            r3 = 1
        L_0x04af:
            java.lang.String r0 = kv1.C99252h.m129297b()
            java.lang.String r1 = "FtsTimeToken"
            java.lang.String r0 = r14.mo86045b(r1, r0, r3)
            r14.f48621i0 = r0
            long r0 = eb0.C31543z5.m39453c()
            r14.f48623j0 = r0
            r14.mo86054n()
            r14.mo86056r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.p059ui.C18843b0.m19717d(pv1.b, zv1.b):void");
    }

    /* renamed from: e */
    public static final void m19718e(boolean z) {
        Log.m105927v("MicroMsg.FTS.FTSReportLogic", "reportFTSCreateChatroom: %d %d", 13970, Integer.valueOf(z ? 1 : 0));
        C115669n.INSTANCE.mo160131h(13970, Integer.valueOf(z));
    }

    /* renamed from: f */
    public static void m19719f(C23592b bVar) {
        String str = bVar.f67704a;
        if (!TextUtils.isEmpty(str)) {
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%s", new Object[]{str, 3, 1, Integer.valueOf(bVar.f67707d), Integer.valueOf(bVar.f67711h), Integer.valueOf(bVar.f67720q), 0, 0, Long.valueOf(C99252h.f291030c), Integer.valueOf(bVar.f67709f), Integer.valueOf(bVar.f67715l), 0, Long.valueOf(System.currentTimeMillis()), 0, Long.valueOf(C99252h.f291030c)});
            Log.m105925i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", 16050, format);
            C115669n.INSTANCE.kvStat(16050, format);
        }
    }

    /* renamed from: g */
    public static void m19720g(int i, long j) {
        Log.m105927v("MicroMsg.FTS.FTSReportLogic", "reportIDKey: type=%d time=%d", Integer.valueOf(i), Long.valueOf(j));
        if (i == 0 || i == 3 || i == 6 || i == 9 || i == 12) {
            IDKey iDKey = new IDKey();
            iDKey.SetID(79);
            iDKey.SetKey(i + 1);
            iDKey.SetValue((long) ((int) j));
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(79);
            iDKey2.SetKey(i + 2);
            iDKey2.SetValue(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160124a(arrayList, false);
        }
    }

    /* renamed from: h */
    public static void m19721h(C23592b bVar) {
        String str;
        int i;
        int i2;
        C23592b bVar2 = bVar;
        if (!Util.isNullOrNil(bVar2.f67704a)) {
            char c = 0;
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wanet_search, 0);
            long j = bVar2.f67706c - bVar2.f67705b;
            if (j < 0) {
                j = 0;
            }
            Object[] objArr = new Object[18];
            objArr[0] = Long.valueOf(bVar2.f67729z);
            objArr[1] = Long.valueOf(C99252h.f291030c);
            objArr[2] = bVar2.f67704a;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = ((ArrayList) bVar2.f67703J).iterator();
            while (it.hasNext()) {
                C21461d dVar = (C21461d) it.next();
                Object[] objArr2 = new Object[7];
                objArr2[c] = Integer.valueOf(bVar2.mo37069c(dVar.f60760b));
                objArr2[1] = Integer.valueOf(dVar.f60759a);
                objArr2[2] = Integer.valueOf(dVar.f60761c);
                long j2 = j;
                objArr2[3] = Long.valueOf(dVar.f60763e);
                objArr2[4] = Long.valueOf(dVar.f60764f);
                objArr2[5] = Integer.valueOf(dVar.f60762d);
                objArr2[6] = dVar.f60765g;
                Log.m105919d("MicroMsg.FTS.FTSSearchStaticsObj", "sakitest, pos:%s, index:%s, type:%s, exposeTime:%s, searchTime:%s, subItemType:%s, docId:%s", objArr2);
                if (!(dVar.f60761c == 0 || dVar.f60760b == Integer.MAX_VALUE)) {
                    if (dVar.f60765g.startsWith("SOSRelevant:") || dVar.f60765g.startsWith("SOSItemRelevant:")) {
                        int c2 = bVar2.mo37069c(dVar.f60760b) + dVar.f60759a;
                        if (dVar.f60760b == 0) {
                            c2++;
                        }
                        if (dVar.f60765g.startsWith("SOSRelevant:") && (bVar2.f67722s > 0 || bVar2.f67723t > 0)) {
                            c2++;
                        }
                        stringBuffer.append(c2);
                    } else {
                        stringBuffer.append(bVar2.mo37069c(dVar.f60760b));
                    }
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60761c);
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60763e);
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60764f);
                    stringBuffer.append("#");
                    if (!C90183c.m112859g(dVar.f60768j) && ((i = dVar.f60761c) == 31 || (i2 = dVar.f60766h) == 31 || i == 19 || i2 == 19 || i == 5 || i2 == 5 || i == 2)) {
                        stringBuffer.append(dVar.f60768j);
                    }
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60769k);
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60770l);
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60759a);
                    stringBuffer.append("#");
                    stringBuffer.append(dVar.f60762d);
                    stringBuffer.append("|");
                }
                j = j2;
                c = 0;
            }
            long j3 = j;
            Log.m105924i("MicroMsg.FTS.FTSSearchStaticsObj", "sakitest, " + stringBuffer.toString());
            objArr[3] = stringBuffer.toString();
            objArr[4] = Integer.valueOf(bVar2.f67694A ? 2 : 1);
            objArr[5] = Integer.valueOf(bVar2.f67695B > 0 ? 1 : 0);
            StringBuffer stringBuffer2 = new StringBuffer();
            Iterator it4 = ((ArrayList) bVar2.f67696C).iterator();
            while (it4.hasNext()) {
                stringBuffer2.append(((Integer) it4.next()).intValue());
                stringBuffer2.append("#");
            }
            objArr[6] = stringBuffer2.toString();
            StringBuffer stringBuffer3 = new StringBuffer();
            if (bVar2.f67707d > 0) {
                stringBuffer3.append(2);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67707d);
                stringBuffer3.append("|");
            }
            if (bVar2.f67708e > 0) {
                stringBuffer3.append(3);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67708e);
                stringBuffer3.append("|");
            }
            if (bVar2.f67709f > 0) {
                stringBuffer3.append(4);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67709f);
                stringBuffer3.append("|");
            }
            if (bVar2.f67710g > 0) {
                stringBuffer3.append(20);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67710g);
                stringBuffer3.append("|");
            }
            if (bVar2.f67711h > 0) {
                stringBuffer3.append(5);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67711h);
                stringBuffer3.append("|");
            }
            if (bVar2.f67715l > 0) {
                stringBuffer3.append(11);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67715l);
                stringBuffer3.append("|");
            }
            if (bVar2.f67716m > 0) {
                stringBuffer3.append(22);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67716m);
                stringBuffer3.append("|");
            }
            if (bVar2.f67717n > 0) {
                stringBuffer3.append(10);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67717n);
                stringBuffer3.append("|");
            }
            if (bVar2.f67720q > 0) {
                stringBuffer3.append(19);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67720q);
                stringBuffer3.append("|");
            }
            if (bVar2.f67718o > 0) {
                stringBuffer3.append(12);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67718o);
                stringBuffer3.append("|");
            }
            if (bVar2.f67713j > 0) {
                stringBuffer3.append(31);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67713j);
                stringBuffer3.append("|");
            }
            if (bVar2.f67725v > 0) {
                stringBuffer3.append(23);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67725v);
                stringBuffer3.append("|");
            }
            if (bVar2.f67724u > 0) {
                stringBuffer3.append(32);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67724u);
                stringBuffer3.append("|");
            }
            if (bVar2.f67722s > 0) {
                stringBuffer3.append(8);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67722s);
                stringBuffer3.append("|");
            }
            if (bVar2.f67723t > 0) {
                stringBuffer3.append(9);
                stringBuffer3.append("#");
                stringBuffer3.append(bVar2.f67723t);
                stringBuffer3.append("|");
            }
            objArr[7] = stringBuffer3.toString();
            objArr[8] = Long.valueOf(j3);
            objArr[9] = Integer.valueOf(Qe);
            objArr[10] = Integer.valueOf(bVar2.f67727x);
            StringBuffer stringBuffer4 = new StringBuffer();
            Iterator it5 = ((ArrayList) bVar2.f67703J).iterator();
            while (it5.hasNext()) {
                C21461d dVar2 = (C21461d) it5.next();
                if (!(dVar2.f60761c == 0 || dVar2.f60766h == 0)) {
                    stringBuffer4.append(dVar2.f60760b);
                    stringBuffer4.append("#");
                    stringBuffer4.append(dVar2.f60761c);
                    stringBuffer4.append("#");
                    stringBuffer4.append(dVar2.f60766h);
                    stringBuffer4.append("|");
                }
            }
            objArr[11] = stringBuffer4.toString();
            Iterator it6 = ((ArrayList) bVar2.f67703J).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    str = "";
                    break;
                }
                C21461d dVar3 = (C21461d) it6.next();
                if (dVar3.f60761c == 27) {
                    str = dVar3.f60767i;
                    break;
                }
            }
            objArr[12] = str;
            objArr[13] = "";
            objArr[14] = 0;
            objArr[15] = "" + bVar2.f67729z;
            objArr[16] = "" + C99252h.f291030c;
            objArr[17] = "" + System.currentTimeMillis();
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
            Log.m105925i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", 17510, format);
            C115669n.INSTANCE.kvStat(17510, format);
        }
    }

    /* renamed from: i */
    public static void m19722i(String str, boolean z, int i, int i2) {
        m19723j(str, z, i, i2, new C23592b());
    }

    /* renamed from: j */
    public static void m19723j(String str, boolean z, int i, int i2, C23592b bVar) {
        String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%s,%s", new Object[]{str, Integer.valueOf(z ? 3 : i > 0 ? 2 : 1), Integer.valueOf((i2 == -15 || i2 == -5 || i2 == -4 || i2 == -3 || i2 == -2 || i2 == -1) ? 2 : i2 != 0 ? 0 : 1), Integer.valueOf(bVar.f67707d), Integer.valueOf(bVar.f67711h), Integer.valueOf(bVar.f67720q), 0, 0, Long.valueOf(C99252h.f291030c), Integer.valueOf(bVar.f67709f), Integer.valueOf(bVar.f67715l), 0, Long.valueOf(System.currentTimeMillis()), 0, Long.valueOf(C99252h.f291030c), Long.valueOf(bVar.f67729z)});
        Log.m105925i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", 11062, format);
        C115669n.INSTANCE.kvStat(11062, format);
    }

    /* renamed from: k */
    public static final void m19724k(String str, int i, int i2, int i3, C23592b bVar, int i4, String str2, String str3, String str4, int i5) {
        String str5 = str;
        C23592b bVar2 = bVar;
        long currentTimeMillis = System.currentTimeMillis();
        long j = bVar2.f67706c;
        long j2 = currentTimeMillis - j;
        if (j2 < 0 || j == 0) {
            j2 = 0;
        }
        int i6 = bVar2.f67727x;
        bVar2.f67727x = 2;
        String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), "", "", 0, 0, 0, 0, str2, Long.valueOf(j2), Integer.valueOf(bVar2.f67708e), Integer.valueOf(bVar2.f67709f), Integer.valueOf(bVar2.f67711h), Integer.valueOf(bVar2.f67715l), Integer.valueOf(bVar2.f67717n), Integer.valueOf(bVar2.f67718o), 0, Integer.valueOf(bVar2.f67719p), Integer.valueOf(bVar2.f67720q), Long.valueOf(C99252h.f291030c), str5, 0, 0, Integer.valueOf(i6), "", "", "", 1, Integer.valueOf(bVar2.f67728y.equals(str) ^ true ? 1 : 0), "0,0,0,0,0,0", "", "", "", "", "", "", "", "", "", Long.valueOf(C99252h.f291030c), Long.valueOf(bVar2.f67729z), str3, str4, "", 0});
        Log.m105919d("MicroMsg.FTS.FTSReportLogic", "10991 reportPardusResultClick click: %d, %s", 10991, format);
        C115669n.INSTANCE.kvStat(10991, format);
    }
}
