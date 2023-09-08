package com.tencent.p014mm.hardcoder;

import com.tencent.p014mm.hardcoder.C17766b;
import com.tencent.p014mm.hardcoder.C17774h;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.mm.hardcoder.c */
public class C17771c implements Runnable {

    /* renamed from: d */
    public Queue<Object> f48935d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public Thread f48936e = null;

    /* renamed from: com.tencent.mm.hardcoder.c$a */
    public static class C17772a {

        /* renamed from: a */
        public final long f48937a;

        /* renamed from: b */
        public final List<C17766b.C17769c> f48938b;

        /* renamed from: c */
        public final int f48939c;

        /* renamed from: d */
        public final int f48940d;

        /* renamed from: e */
        public final int f48941e;

        /* renamed from: f */
        public final int[] f48942f;

        public C17772a(long j, List<C17766b.C17769c> list, int i, int i2, int i3, int[] iArr) {
            this.f48937a = j;
            this.f48938b = list;
            this.f48939c = i;
            this.f48940d = i2;
            this.f48941e = i3;
            this.f48942f = iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x02a1 A[SYNTHETIC, Splitter:B:138:0x02a1] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02bf A[SYNTHETIC, Splitter:B:143:0x02bf] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02f9 A[SYNTHETIC, Splitter:B:155:0x02f9] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0317 A[SYNTHETIC, Splitter:B:160:0x0317] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0339 A[SYNTHETIC, Splitter:B:169:0x0339] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0357 A[SYNTHETIC, Splitter:B:174:0x0357] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019c A[SYNTHETIC, Splitter:B:79:0x019c] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ba A[SYNTHETIC, Splitter:B:84:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0201 A[Catch:{ Exception -> 0x0284, all -> 0x027e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21754a(long r19, java.util.List<com.tencent.p014mm.hardcoder.C17766b.C17769c> r21, int r22, int r23, int r24, int[] r25) {
        /*
            r18 = this;
            r1 = r19
            r3 = r22
            r4 = r24
            r5 = r25
            java.lang.String r6 = "Hardcoder.HardCoderUtil"
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r7 = java.lang.Long.valueOf(r19)
            r8 = 0
            r0[r8] = r7
            int r7 = r21.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r0[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r22)
            r9 = 2
            r0[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r24)
            r9 = 3
            r0[r9] = r7
            java.lang.String r7 = "forgives, time:%s, size:%s, cpu:%s, io:%s"
            java.lang.String r0 = java.lang.String.format(r7, r0)
            java.lang.String r7 = "Hardcoder.HardCoderReporter"
            com.tencent.p014mm.hardcoder.C17774h.m18164a(r7, r0)
            r7 = 0
        L_0x0039:
            int r0 = r21.size()
            if (r7 >= r0) goto L_0x0374
            r9 = r21
            java.lang.Object r0 = r9.get(r7)
            r10 = r0
            com.tencent.mm.hardcoder.b$c r10 = (com.tencent.p014mm.hardcoder.C17766b.C17769c) r10
            boolean r0 = r10.mo21752b()
            if (r0 != 0) goto L_0x0050
            goto L_0x02f0
        L_0x0050:
            long r11 = r10.f48928q
            long r11 = r1 - r11
            r10.f48928q = r1
            r13 = -1
            r0 = -2
            if (r3 == r13) goto L_0x0074
            if (r3 != r0) goto L_0x0068
            int[] r14 = r10.f48929r
            int r15 = r10.f48926o
            r0 = r14[r15]
            long r8 = (long) r0
            long r8 = r8 + r11
            int r0 = (int) r8
            r14[r15] = r0
            goto L_0x007f
        L_0x0068:
            r10.f48926o = r3
            int[] r0 = r10.f48929r
            r8 = r0[r3]
            long r8 = (long) r8
            long r8 = r8 + r11
            int r9 = (int) r8
            r0[r3] = r9
            goto L_0x007f
        L_0x0074:
            r10.f48926o = r8
            int[] r0 = r10.f48929r
            r9 = r0[r8]
            long r14 = (long) r9
            long r14 = r14 + r11
            int r9 = (int) r14
            r0[r8] = r9
        L_0x007f:
            if (r4 == r13) goto L_0x009c
            r0 = -2
            if (r4 != r0) goto L_0x0090
            int[] r0 = r10.f48930s
            int r8 = r10.f48927p
            r9 = r0[r8]
            long r14 = (long) r9
            long r14 = r14 + r11
            int r9 = (int) r14
            r0[r8] = r9
            goto L_0x00a8
        L_0x0090:
            r10.f48927p = r4
            int[] r0 = r10.f48930s
            r8 = r0[r4]
            long r8 = (long) r8
            long r8 = r8 + r11
            int r9 = (int) r8
            r0[r4] = r9
            goto L_0x00a8
        L_0x009c:
            r8 = 0
            r10.f48927p = r8
            int[] r0 = r10.f48930s
            r9 = r0[r8]
            long r14 = (long) r9
            long r14 = r14 + r11
            int r9 = (int) r14
            r0[r8] = r9
        L_0x00a8:
            if (r5 == 0) goto L_0x00af
            int r0 = r5.length
            if (r0 <= 0) goto L_0x00af
            r10.f48931t = r5
        L_0x00af:
            boolean r0 = r10.mo21752b()
            if (r0 == 0) goto L_0x00bb
            int[] r0 = r10.f48918g
            r8 = 0
            r0 = r0[r8]
            goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            java.lang.String r8 = "getThreadCoreId bufferedReader close exception:"
            java.lang.String r9 = "getThreadCoreId fileReader close exception:"
            java.io.FileReader r12 = new java.io.FileReader     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r14.<init>()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r15 = "/proc/"
            r14.append(r15)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            int r15 = android.os.Process.myPid()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r14.append(r15)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r15 = "/task/"
            r14.append(r15)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r14.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r0 = "/stat"
            r14.append(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.lang.String r0 = r14.toString()     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x017f, all -> 0x0179 }
            java.io.BufferedReader r14 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0177, all -> 0x0172 }
            r14.<init>(r12)     // Catch:{ Exception -> 0x0177, all -> 0x0172 }
            java.lang.String r0 = r14.readLine()     // Catch:{ Exception -> 0x0147 }
            if (r0 != 0) goto L_0x011b
            r12.close()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x010e
        L_0x00f6:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = r12.getMessage()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x010e:
            r14.close()     // Catch:{ Exception -> 0x0113 }
            goto L_0x01d7
        L_0x0113:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            goto L_0x01c5
        L_0x011b:
            java.lang.String r15 = " "
            java.lang.String[] r0 = r0.split(r15)     // Catch:{ Exception -> 0x0147 }
            r15 = 38
            r0 = r0[r15]     // Catch:{ Exception -> 0x0147 }
            if (r0 == 0) goto L_0x0149
            int r15 = r0.length()     // Catch:{ NumberFormatException -> 0x0138 }
            if (r15 > 0) goto L_0x012e
            goto L_0x0149
        L_0x012e:
            java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch:{ NumberFormatException -> 0x0138 }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x0138 }
            r13 = r0
            goto L_0x014a
        L_0x0138:
            r0 = move-exception
            r15 = 0
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0147 }
            java.lang.String r15 = "getInt"
            com.tencent.mm.hardcoder.h$a r13 = com.tencent.p014mm.hardcoder.C17774h.f48943a     // Catch:{ Exception -> 0x0147 }
            if (r13 != 0) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            r13.printErrStackTrace(r6, r0, r15, r11)     // Catch:{ Exception -> 0x0147 }
            goto L_0x0149
        L_0x0147:
            r0 = move-exception
            goto L_0x0182
        L_0x0149:
            r13 = 0
        L_0x014a:
            r12.close()     // Catch:{ Exception -> 0x014e }
            goto L_0x0166
        L_0x014e:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = r11.getMessage()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x0166:
            r14.close()     // Catch:{ Exception -> 0x016b }
            goto L_0x01d8
        L_0x016b:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            goto L_0x01c5
        L_0x0172:
            r0 = move-exception
            r11 = r12
            r14 = 0
            goto L_0x0336
        L_0x0177:
            r0 = move-exception
            goto L_0x0181
        L_0x0179:
            r0 = move-exception
            r1 = r0
            r11 = 0
            r14 = 0
            goto L_0x0337
        L_0x017f:
            r0 = move-exception
            r12 = 0
        L_0x0181:
            r14 = 0
        L_0x0182:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0334 }
            r11.<init>()     // Catch:{ all -> 0x0334 }
            java.lang.String r13 = "getThreadCoreId exception:"
            r11.append(r13)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0334 }
            r11.append(r0)     // Catch:{ all -> 0x0334 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0334 }
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)     // Catch:{ all -> 0x0334 }
            if (r12 == 0) goto L_0x01b8
            r12.close()     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01b8
        L_0x01a0:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = r11.getMessage()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x01b8:
            if (r14 == 0) goto L_0x01d7
            r14.close()     // Catch:{ Exception -> 0x01be }
            goto L_0x01d7
        L_0x01be:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r13 = -1
        L_0x01c5:
            r9.append(r8)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
            goto L_0x01d8
        L_0x01d7:
            r13 = -1
        L_0x01d8:
            java.lang.String r8 = "getCpuFreqByCoreId fileReader close exception:"
            java.lang.String r9 = "getCpuFreqByCoreId bufferedReader close exception:"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            r14.<init>()     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            java.lang.String r15 = "/sys/devices/system/cpu/cpu"
            r14.append(r15)     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            r14.append(r13)     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            java.lang.String r13 = "/cpufreq/scaling_cur_freq"
            r14.append(r13)     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            java.lang.String r13 = r14.toString()     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            r0.<init>(r13)     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            boolean r13 = r0.exists()     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            if (r13 != 0) goto L_0x0201
        L_0x01fd:
            r14 = -1
            goto L_0x02de
        L_0x0201:
            java.io.FileReader r13 = new java.io.FileReader     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            r13.<init>(r0)     // Catch:{ Exception -> 0x0284, all -> 0x027e }
            java.io.BufferedReader r14 = new java.io.BufferedReader     // Catch:{ Exception -> 0x027b, all -> 0x0276 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x027b, all -> 0x0276 }
            java.lang.String r0 = r14.readLine()     // Catch:{ Exception -> 0x0230, all -> 0x0270 }
            if (r0 == 0) goto L_0x0232
            int r15 = r0.length()     // Catch:{ NumberFormatException -> 0x0221 }
            if (r15 > 0) goto L_0x0218
            goto L_0x0232
        L_0x0218:
            java.lang.Long r0 = java.lang.Long.decode(r0)     // Catch:{ NumberFormatException -> 0x0221 }
            long r16 = r0.longValue()     // Catch:{ NumberFormatException -> 0x0221 }
            goto L_0x0234
        L_0x0221:
            r0 = move-exception
            r15 = 0
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0230, all -> 0x0270 }
            java.lang.String r12 = "getLong"
            com.tencent.mm.hardcoder.h$a r15 = com.tencent.p014mm.hardcoder.C17774h.f48943a     // Catch:{ Exception -> 0x0230, all -> 0x0270 }
            if (r15 != 0) goto L_0x022c
            goto L_0x0232
        L_0x022c:
            r15.printErrStackTrace(r6, r0, r12, r11)     // Catch:{ Exception -> 0x0230, all -> 0x0270 }
            goto L_0x0232
        L_0x0230:
            r0 = move-exception
            goto L_0x0274
        L_0x0232:
            r16 = 0
        L_0x0234:
            r14.close()     // Catch:{ Exception -> 0x0238 }
            goto L_0x0250
        L_0x0238:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = r11.getMessage()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x0250:
            r13.close()     // Catch:{ Exception -> 0x0254 }
            goto L_0x026c
        L_0x0254:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = r9.getMessage()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x026c:
            r14 = r16
            goto L_0x02de
        L_0x0270:
            r0 = move-exception
            r11 = r14
            goto L_0x02f6
        L_0x0274:
            r11 = r14
            goto L_0x0287
        L_0x0276:
            r0 = move-exception
            r1 = r0
            r11 = 0
            goto L_0x02f7
        L_0x027b:
            r0 = move-exception
            r11 = 0
            goto L_0x0287
        L_0x027e:
            r0 = move-exception
            r1 = r0
            r11 = 0
            r13 = 0
            goto L_0x02f7
        L_0x0284:
            r0 = move-exception
            r11 = 0
            r13 = 0
        L_0x0287:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f5 }
            r12.<init>()     // Catch:{ all -> 0x02f5 }
            java.lang.String r14 = "getCpuFreqByCoreId exception:"
            r12.append(r14)     // Catch:{ all -> 0x02f5 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02f5 }
            r12.append(r0)     // Catch:{ all -> 0x02f5 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x02f5 }
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)     // Catch:{ all -> 0x02f5 }
            if (r11 == 0) goto L_0x02bd
            r11.close()     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02bd
        L_0x02a5:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = r11.getMessage()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x02bd:
            if (r13 == 0) goto L_0x01fd
            r13.close()     // Catch:{ Exception -> 0x02c4 }
            goto L_0x01fd
        L_0x02c4:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = r9.getMessage()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
            goto L_0x01fd
        L_0x02de:
            long r8 = r10.f48932u
            r11 = 0
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x02e8
            r10.f48932u = r14
        L_0x02e8:
            long r8 = r10.f48932u
            long r8 = r8 + r14
            r11 = 2
            long r8 = r8 / r11
            r10.f48932u = r8
        L_0x02f0:
            int r7 = r7 + 1
            r8 = 0
            goto L_0x0039
        L_0x02f5:
            r0 = move-exception
        L_0x02f6:
            r1 = r0
        L_0x02f7:
            if (r11 == 0) goto L_0x0315
            r11.close()     // Catch:{ Exception -> 0x02fd }
            goto L_0x0315
        L_0x02fd:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x0315:
            if (r13 == 0) goto L_0x0333
            r13.close()     // Catch:{ Exception -> 0x031b }
            goto L_0x0333
        L_0x031b:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x0333:
            throw r1
        L_0x0334:
            r0 = move-exception
            r11 = r12
        L_0x0336:
            r1 = r0
        L_0x0337:
            if (r11 == 0) goto L_0x0355
            r11.close()     // Catch:{ Exception -> 0x033d }
            goto L_0x0355
        L_0x033d:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x0355:
            if (r14 == 0) goto L_0x0373
            r14.close()     // Catch:{ Exception -> 0x035b }
            goto L_0x0373
        L_0x035b:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.hardcoder.C17774h.m18165b(r6, r0)
        L_0x0373:
            throw r1
        L_0x0374:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.hardcoder.C17771c.mo21754a(long, java.util.List, int, int, int, int[]):void");
    }

    public void finalize() {
        super.finalize();
        this.f48935d.clear();
    }

    public void run() {
        C17774h.m18166c("Hardcoder.HCPerfStatThread", "HCPerfStatThread start to run.");
        if (Thread.currentThread() == null) {
            C17774h.m18165b("Hardcoder.HCPerfStatThread", "run error, current thread is null!");
            return;
        }
        while (Thread.currentThread() != null && !Thread.currentThread().isInterrupted()) {
            try {
                if (!((ConcurrentLinkedQueue) this.f48935d).isEmpty()) {
                    Object poll = ((ConcurrentLinkedQueue) this.f48935d).poll();
                    if (poll instanceof C17772a) {
                        C17772a aVar = (C17772a) poll;
                        mo21754a(aVar.f48937a, aVar.f48938b, aVar.f48939c, aVar.f48940d, aVar.f48941e, aVar.f48942f);
                    } else if (poll instanceof C17766b.C17769c) {
                        C17776i.m18170a((C17766b.C17769c) poll);
                    }
                } else {
                    synchronized (this) {
                        while (((ConcurrentLinkedQueue) this.f48935d).isEmpty()) {
                            wait();
                        }
                    }
                }
            } catch (InterruptedException e) {
                C17774h.m18165b("Hardcoder.HCPerfStatThread", "Performance status thread need to interrupt:" + e.getMessage());
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e2) {
                Object[] objArr = new Object[0];
                C17774h.C17775a aVar2 = C17774h.f48943a;
                if (aVar2 != null) {
                    aVar2.printErrStackTrace("Hardcoder.HCPerfStatThread", e2, "run exception:", objArr);
                }
            }
        }
    }
}
