package com.tencent.p014mm.p136ui;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.s */
public class C85927s {

    /* renamed from: a */
    public static C85928a f250292a;

    /* renamed from: b */
    public static HashMap<Integer, Long> f250293b = new HashMap<>();

    /* renamed from: c */
    public static int f250294c = 1100;

    /* renamed from: d */
    public static int f250295d = 2000;

    /* renamed from: e */
    public static long f250296e = 0;

    /* renamed from: com.tencent.mm.ui.s$a */
    public interface C85928a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.mm.ui.s$b */
    public @interface C85929b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (java.lang.Class.forName(r0.getComponent().getClassName()).getAnnotation(com.tencent.p014mm.p136ui.C85927s.C85929b.class) != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r8 = java.lang.System.currentTimeMillis();
        r0 = new java.lang.StringBuilder();
        r0.append(r18.toString());
        r0.append(",");
        r4 = r1.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r6 >= r4) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0.append(r1[r6]);
        r0.append(",");
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r4 = r2.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r6 >= r4) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r0.append(r2[r6]);
        r0.append(",");
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r0 = r0.toString();
        r2 = java.lang.Integer.valueOf(r0.hashCode());
        r4 = f250293b.get(r2);
        r6 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r19 == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r4 == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if ((r6.longValue() - r4.longValue()) > ((long) f250295d)) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        r10 = r18.getClass().toString().split("\\.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r10.length <= 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        r10 = r10[r10.length - 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        if (r1[0].getComponent() == null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        r1 = r1[0].getComponent().getClassName().split("\\.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r1.length <= 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r1 = r1[r1.length - 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        r1 = "None";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        ((fw0.C87107w.C87109b) f250292a).getClass();
        kj2.C117407d.INSTANCE.mo160131h(14976, java.lang.Long.valueOf(r6.longValue() - r4.longValue()), r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012a, code lost:
        if ((r6.longValue() - r4.longValue()) > ((long) f250294c)) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012c, code lost:
        f250293b.put(r2, r6);
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.CheckReduplicatedAcitiv", "starting the same activity in %sms, [k:%s, v:%s], curr: %s", java.lang.Integer.valueOf(f250294c), r0, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0155, code lost:
        if (f250293b.size() <= 100) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
        if (f250296e == 0) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016b, code lost:
        if ((java.lang.System.currentTimeMillis() - f250296e) <= ((long) f250294c)) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        f250293b.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0172, code lost:
        f250293b.put(r2, r6);
        f250296e = java.lang.System.currentTimeMillis();
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.CheckReduplicatedAcitiv", "check reduplicated cost %sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0192, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m106240a(android.content.Context r18, boolean r19, android.content.Intent[] r20, java.lang.Object... r21) {
        /*
            r1 = r20
            r2 = r21
            java.lang.Class<com.tencent.mm.ui.s> r3 = com.tencent.p014mm.p136ui.C85927s.class
            monitor-enter(r3)
            int r4 = r1.length     // Catch:{ all -> 0x0193 }
            r5 = 0
            r6 = 0
        L_0x000a:
            r7 = 1
            if (r6 >= r4) goto L_0x0050
            r0 = r1[r6]     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x0048
            android.content.ComponentName r8 = r0.getComponent()     // Catch:{ Exception -> 0x003b }
            if (r8 == 0) goto L_0x0048
            android.content.ComponentName r8 = r0.getComponent()     // Catch:{ Exception -> 0x003b }
            java.lang.String r8 = r8.getClassName()     // Catch:{ Exception -> 0x003b }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x003b }
            if (r8 == 0) goto L_0x0026
            goto L_0x0048
        L_0x0026:
            android.content.ComponentName r0 = r0.getComponent()     // Catch:{ Exception -> 0x003b }
            java.lang.String r0 = r0.getClassName()     // Catch:{ Exception -> 0x003b }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x003b }
            java.lang.Class<com.tencent.mm.ui.s$b> r8 = com.tencent.p014mm.p136ui.C85927s.C85929b.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r8)     // Catch:{ Exception -> 0x003b }
            if (r0 == 0) goto L_0x0048
            goto L_0x0049
        L_0x003b:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0193 }
            r7[r5] = r0     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "MicroMsg.CheckReduplicatedAcitiv"
            java.lang.String r8 = "skipReduplicateCheck exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r7)     // Catch:{ all -> 0x0193 }
        L_0x0048:
            r7 = 0
        L_0x0049:
            if (r7 == 0) goto L_0x004d
            monitor-exit(r3)
            return r5
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x000a
        L_0x0050:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
            r0.<init>()     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = r18.toString()     // Catch:{ all -> 0x0193 }
            r0.append(r4)     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = ","
            r0.append(r4)     // Catch:{ all -> 0x0193 }
            int r4 = r1.length     // Catch:{ all -> 0x0193 }
            r6 = 0
        L_0x0067:
            if (r6 >= r4) goto L_0x0076
            r10 = r1[r6]     // Catch:{ all -> 0x0193 }
            r0.append(r10)     // Catch:{ all -> 0x0193 }
            java.lang.String r10 = ","
            r0.append(r10)     // Catch:{ all -> 0x0193 }
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0076:
            int r4 = r2.length     // Catch:{ all -> 0x0193 }
            r6 = 0
        L_0x0078:
            if (r6 >= r4) goto L_0x0087
            r10 = r2[r6]     // Catch:{ all -> 0x0193 }
            r0.append(r10)     // Catch:{ all -> 0x0193 }
            java.lang.String r10 = ","
            r0.append(r10)     // Catch:{ all -> 0x0193 }
            int r6 = r6 + 1
            goto L_0x0078
        L_0x0087:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0193 }
            int r2 = r0.hashCode()     // Catch:{ all -> 0x0193 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0193 }
            java.util.HashMap<java.lang.Integer, java.lang.Long> r4 = f250293b     // Catch:{ all -> 0x0193 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0193 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0193 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0193 }
            if (r19 == 0) goto L_0x014d
            if (r4 == 0) goto L_0x014d
            long r10 = r6.longValue()     // Catch:{ all -> 0x0193 }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0193 }
            long r10 = r10 - r12
            int r12 = f250295d     // Catch:{ all -> 0x0193 }
            long r12 = (long) r12     // Catch:{ all -> 0x0193 }
            r14 = 3
            int r16 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r16 > 0) goto L_0x011c
            java.lang.Class r10 = r18.getClass()     // Catch:{ all -> 0x0193 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "\\."
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ all -> 0x0193 }
            int r11 = r10.length     // Catch:{ all -> 0x0193 }
            if (r11 <= 0) goto L_0x00cf
            int r11 = r10.length     // Catch:{ all -> 0x0193 }
            int r11 = r11 + -1
            r10 = r10[r11]     // Catch:{ all -> 0x0193 }
            goto L_0x00d1
        L_0x00cf:
            java.lang.String r10 = ""
        L_0x00d1:
            r11 = r1[r5]     // Catch:{ all -> 0x0193 }
            android.content.ComponentName r11 = r11.getComponent()     // Catch:{ all -> 0x0193 }
            if (r11 == 0) goto L_0x00f5
            r1 = r1[r5]     // Catch:{ all -> 0x0193 }
            android.content.ComponentName r1 = r1.getComponent()     // Catch:{ all -> 0x0193 }
            java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0193 }
            java.lang.String r11 = "\\."
            java.lang.String[] r1 = r1.split(r11)     // Catch:{ all -> 0x0193 }
            int r11 = r1.length     // Catch:{ all -> 0x0193 }
            if (r11 <= 0) goto L_0x00f2
            int r11 = r1.length     // Catch:{ all -> 0x0193 }
            int r11 = r11 + -1
            r1 = r1[r11]     // Catch:{ all -> 0x0193 }
            goto L_0x00f7
        L_0x00f2:
            java.lang.String r1 = ""
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r1 = "None"
        L_0x00f7:
            com.tencent.mm.ui.s$a r11 = f250292a     // Catch:{ all -> 0x0193 }
            long r12 = r6.longValue()     // Catch:{ all -> 0x0193 }
            long r16 = r4.longValue()     // Catch:{ all -> 0x0193 }
            long r12 = r12 - r16
            fw0.w$b r11 = (fw0.C87107w.C87109b) r11     // Catch:{ all -> 0x0193 }
            r11.getClass()     // Catch:{ all -> 0x0193 }
            kj2.d r11 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0193 }
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x0193 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0193 }
            r15[r5] = r12     // Catch:{ all -> 0x0193 }
            r15[r7] = r10     // Catch:{ all -> 0x0193 }
            r10 = 2
            r15[r10] = r1     // Catch:{ all -> 0x0193 }
            r1 = 14976(0x3a80, float:2.0986E-41)
            r11.mo160131h(r1, r15)     // Catch:{ all -> 0x0193 }
        L_0x011c:
            long r10 = r6.longValue()     // Catch:{ all -> 0x0193 }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0193 }
            long r10 = r10 - r12
            int r1 = f250294c     // Catch:{ all -> 0x0193 }
            long r12 = (long) r1     // Catch:{ all -> 0x0193 }
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x014d
            java.util.HashMap<java.lang.Integer, java.lang.Long> r1 = f250293b     // Catch:{ all -> 0x0193 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0193 }
            java.lang.String r1 = "MicroMsg.CheckReduplicatedAcitiv"
            java.lang.String r2 = "starting the same activity in %sms, [k:%s, v:%s], curr: %s"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0193 }
            int r9 = f250294c     // Catch:{ all -> 0x0193 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0193 }
            r8[r5] = r9     // Catch:{ all -> 0x0193 }
            r8[r7] = r0     // Catch:{ all -> 0x0193 }
            r0 = 2
            r8[r0] = r4     // Catch:{ all -> 0x0193 }
            r8[r14] = r6     // Catch:{ all -> 0x0193 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r8)     // Catch:{ all -> 0x0193 }
            monitor-exit(r3)
            return r7
        L_0x014d:
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = f250293b     // Catch:{ all -> 0x0193 }
            int r0 = r0.size()     // Catch:{ all -> 0x0193 }
            r1 = 100
            if (r0 <= r1) goto L_0x0172
            long r0 = f250296e     // Catch:{ all -> 0x0193 }
            r10 = 0
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0172
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            long r10 = f250296e     // Catch:{ all -> 0x0193 }
            long r0 = r0 - r10
            int r4 = f250294c     // Catch:{ all -> 0x0193 }
            long r10 = (long) r4     // Catch:{ all -> 0x0193 }
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0172
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = f250293b     // Catch:{ all -> 0x0193 }
            r0.clear()     // Catch:{ all -> 0x0193 }
        L_0x0172:
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = f250293b     // Catch:{ all -> 0x0193 }
            r0.put(r2, r6)     // Catch:{ all -> 0x0193 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            f250296e = r0     // Catch:{ all -> 0x0193 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0193 }
            long r0 = r0 - r8
            java.lang.String r2 = "MicroMsg.CheckReduplicatedAcitiv"
            java.lang.String r4 = "check reduplicated cost %sms"
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x0193 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0193 }
            r6[r5] = r0     // Catch:{ all -> 0x0193 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ all -> 0x0193 }
            monitor-exit(r3)
            return r5
        L_0x0193:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85927s.m106240a(android.content.Context, boolean, android.content.Intent[], java.lang.Object[]):boolean");
    }
}
