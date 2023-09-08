package com.tencent.p014mm.plugin.performance.watchdogs;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.b */
public class C85325b implements Runnable {

    /* renamed from: p */
    public static final C85325b f248606p = new C85325b();

    /* renamed from: q */
    public static final Set<String> f248607q;

    /* renamed from: d */
    public boolean f248608d;

    /* renamed from: e */
    public boolean f248609e;

    /* renamed from: f */
    public boolean f248610f;

    /* renamed from: g */
    public int f248611g;

    /* renamed from: h */
    public int f248612h;

    /* renamed from: i */
    public final Map<String, Map<String, Integer>> f248613i = new HashMap();

    /* renamed from: j */
    public final Map<String, Integer> f248614j = new HashMap();

    /* renamed from: n */
    public int f248615n = 1024;

    /* renamed from: o */
    public boolean f248616o;

    static {
        HashSet hashSet = new HashSet();
        f248607q = hashSet;
        hashSet.add("anon_inode:sync_file");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[Catch:{ Exception -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5 A[Catch:{ Exception -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo118615a() {
        /*
            r25 = this;
            r1 = r25
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 0
            r1.f248611g = r4
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r8 = android.os.Process.myPid()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            java.lang.String r8 = "/proc/%s/fd"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r0.<init>((java.lang.String) r7)
            boolean r7 = r0.mo119967g()
            java.lang.String r8 = "MicroMsg.FDWatchDog"
            if (r7 != 0) goto L_0x0048
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 1031(0x407, double:5.094E-321)
            r12 = 255(0xff, double:1.26E-321)
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r0 = r0.mo119976n()
            r2[r4] = r0
            java.lang.String r0 = "file not exists: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r2)
            return r4
        L_0x0048:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r7 = r1.f248613i
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.clear()
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r1.f248614j
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.clear()
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()     // Catch:{ Exception -> 0x0161 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "reading empty dir"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x0161 }
            return r4
        L_0x0063:
            int r7 = r0.length     // Catch:{ Exception -> 0x0161 }
            r9 = 896(0x380, float:1.256E-42)
            if (r7 >= r9) goto L_0x0077
            java.lang.String r0 = "skip parsing fd: fd count = %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x015d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x015d }
            r6[r4] = r9     // Catch:{ Exception -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r6)     // Catch:{ Exception -> 0x015d }
            return r7
        L_0x0077:
            int r9 = r0.length     // Catch:{ Exception -> 0x015d }
            r10 = 0
        L_0x0079:
            if (r10 >= r9) goto L_0x0159
            r11 = r0[r10]     // Catch:{ Exception -> 0x015d }
            java.lang.String r11 = r11.mo119971i()     // Catch:{ Exception -> 0x015d }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x015d }
            r12.<init>(r11)     // Catch:{ Exception -> 0x015d }
            java.lang.String r12 = r12.getCanonicalPath()     // Catch:{ Exception -> 0x015d }
            boolean r13 = r11.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x015d }
            if (r13 != 0) goto L_0x0099
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x015d }
            if (r13 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r11 = r12
            goto L_0x00bf
        L_0x0099:
            boolean r12 = com.tencent.matrix.p469fd.FDDumpBridge.f78626a     // Catch:{ Exception -> 0x015d }
            if (r12 != 0) goto L_0x009f
            r12 = r11
            goto L_0x00a3
        L_0x009f:
            java.lang.String r12 = com.tencent.matrix.p469fd.FDDumpBridge.getFdPathNameNative(r11)     // Catch:{ Exception -> 0x015d }
        L_0x00a3:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x015d }
            if (r13 == 0) goto L_0x0097
            java.lang.String r12 = "file name is empty %s"
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x015d }
            r13[r4] = r11     // Catch:{ Exception -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r12, r13)     // Catch:{ Exception -> 0x015d }
            kj2.d r14 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x015d }
            r15 = 1031(0x407, double:5.094E-321)
            r17 = 252(0xfc, double:1.245E-321)
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)     // Catch:{ Exception -> 0x015d }
        L_0x00bf:
            boolean r12 = r1.mo118616b(r11)     // Catch:{ Exception -> 0x015d }
            if (r12 == 0) goto L_0x00d5
            java.lang.String r12 = "ignore %s"
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x015d }
            r13[r4] = r11     // Catch:{ Exception -> 0x015d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r13)     // Catch:{ Exception -> 0x015d }
            int r11 = r1.f248611g     // Catch:{ Exception -> 0x015d }
            int r11 = r11 + r5
            r1.f248611g = r11     // Catch:{ Exception -> 0x015d }
            goto L_0x0154
        L_0x00d5:
            com.tencent.mm.plugin.performance.watchdogs.b$$d[] r12 = com.tencent.p014mm.plugin.performance.watchdogs.b$$d.values()     // Catch:{ Exception -> 0x015d }
            int r13 = r12.length     // Catch:{ Exception -> 0x015d }
            r14 = 0
        L_0x00db:
            if (r14 >= r13) goto L_0x0154
            r15 = r12[r14]     // Catch:{ Exception -> 0x015d }
            java.lang.String r4 = r15.f248642d     // Catch:{ Exception -> 0x015d }
            boolean r4 = r11.matches(r4)     // Catch:{ Exception -> 0x015d }
            if (r4 == 0) goto L_0x0150
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r4 = r1.f248613i     // Catch:{ Exception -> 0x015d }
            java.lang.String r12 = r15.name()     // Catch:{ Exception -> 0x015d }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x015d }
            java.lang.Object r4 = r4.get(r12)     // Catch:{ Exception -> 0x015d }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x015d }
            if (r4 != 0) goto L_0x0107
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x015d }
            r4.<init>()     // Catch:{ Exception -> 0x015d }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r12 = r1.f248613i     // Catch:{ Exception -> 0x015d }
            java.lang.String r13 = r15.name()     // Catch:{ Exception -> 0x015d }
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ Exception -> 0x015d }
            r12.put(r13, r4)     // Catch:{ Exception -> 0x015d }
        L_0x0107:
            java.lang.Object r12 = r4.get(r11)     // Catch:{ Exception -> 0x015d }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ Exception -> 0x015d }
            if (r12 != 0) goto L_0x0113
            r4.put(r11, r6)     // Catch:{ Exception -> 0x015d }
            goto L_0x011f
        L_0x0113:
            int r12 = r12.intValue()     // Catch:{ Exception -> 0x015d }
            int r12 = r12 + r5
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x015d }
            r4.put(r11, r12)     // Catch:{ Exception -> 0x015d }
        L_0x011f:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.f248614j     // Catch:{ Exception -> 0x015d }
            java.lang.String r11 = r15.name()     // Catch:{ Exception -> 0x015d }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x015d }
            java.lang.Object r4 = r4.get(r11)     // Catch:{ Exception -> 0x015d }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x015d }
            if (r4 != 0) goto L_0x013b
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.f248614j     // Catch:{ Exception -> 0x015d }
            java.lang.String r11 = r15.name()     // Catch:{ Exception -> 0x015d }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x015d }
            r4.put(r11, r6)     // Catch:{ Exception -> 0x015d }
            goto L_0x0154
        L_0x013b:
            java.util.Map<java.lang.String, java.lang.Integer> r11 = r1.f248614j     // Catch:{ Exception -> 0x015d }
            java.lang.String r12 = r15.name()     // Catch:{ Exception -> 0x015d }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x015d }
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x015d }
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ Exception -> 0x015d }
            r11.put(r12, r4)     // Catch:{ Exception -> 0x015d }
            goto L_0x0154
        L_0x0150:
            int r14 = r14 + 1
            r4 = 0
            goto L_0x00db
        L_0x0154:
            int r10 = r10 + 1
            r4 = 0
            goto L_0x0079
        L_0x0159:
            int r0 = r1.f248611g
            int r7 = r7 - r0
            goto L_0x0179
        L_0x015d:
            r0 = move-exception
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            goto L_0x01b1
        L_0x0161:
            r0 = move-exception
            r7 = 0
        L_0x0163:
            kj2.d r17 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x015f }
            r18 = 1031(0x407, double:5.094E-321)
            r20 = 254(0xfe, double:1.255E-321)
            r22 = 1
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)     // Catch:{ all -> 0x015f }
            java.lang.String r4 = ""
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x015f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r9)     // Catch:{ all -> 0x015f }
            goto L_0x0159
        L_0x0179:
            if (r7 > 0) goto L_0x018d
            java.lang.String r0 = "fd dump error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            kj2.d r17 = kj2.C117407d.INSTANCE
            r18 = 1031(0x407, double:5.094E-321)
            r20 = 253(0xfd, double:1.25E-321)
            r22 = 1
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)
        L_0x018d:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r3 = 0
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r0[r5] = r2
            r2 = 2
            int r3 = r1.f248611g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "dump cost: %d, FDCount = %d, mIgnoredCount = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r0)
            return r7
        L_0x01b1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.C85325b.mo118615a():int");
    }

    /* renamed from: b */
    public final boolean mo118616b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator it = ((HashSet) f248607q).iterator();
        while (it.hasNext()) {
            if (str.matches((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo118617c() {
        ArrayList arrayList = new ArrayList(((HashMap) this.f248614j).entrySet());
        Collections.sort(arrayList, new b$$b(this));
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Log.m105921e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD SOS: type = %s, count = %s", entry.getKey(), entry.getValue());
            Map map = (Map) ((HashMap) this.f248613i).get(entry.getKey());
            if (map != null) {
                ArrayList arrayList2 = new ArrayList(map.entrySet());
                Collections.sort(arrayList2, new b$$c(this));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Log.m105921e("MicroMsg.FDWatchDog", "-> [%s] %s", entry2.getValue(), entry2.getKey());
                    int i2 = i + 1;
                    if (i < 40) {
                        sb.append("[");
                        sb.append(entry2.getValue());
                        sb.append("]");
                        sb.append((String) entry2.getKey());
                        sb.append(";");
                    }
                    i = i2;
                }
            }
        }
        String sb4 = sb.toString();
        Log.m105921e("MicroMsg.FDWatchDog", "top path is %s", sb4);
        return sb4;
    }

    /* renamed from: d */
    public final int mo118618d(b$$d b__d) {
        Integer num = (Integer) ((HashMap) this.f248614j).get(b__d.name());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void run() {
        int i = MMApplicationContext.isMainProcess() ? 100 : MMApplicationContext.isToolsProcess() ? 120 : MMApplicationContext.isAppBrandProcess() ? 140 : MMApplicationContext.isPushProcess() ? 150 : 0;
        int a = mo118615a();
        if (a <= 256 && a - this.f248612h > 32) {
            C117407d.INSTANCE.idkeyStat(1031, (long) (i - 2), 1, false);
            this.f248612h = Math.max(a, this.f248612h);
        } else if (256 < a && a <= 512 && !this.f248608d) {
            C117407d.INSTANCE.idkeyStat(1031, (long) (i - 1), 1, false);
            this.f248608d = true;
        } else if (512 < a && a <= 768 && !this.f248609e) {
            C117407d.INSTANCE.idkeyStat(1031, (long) i, 1, false);
            this.f248609e = true;
        } else if (768 < a && a <= 896 && !this.f248610f) {
            C117407d.INSTANCE.idkeyStat(1031, (long) (i + 1), 1, false);
            this.f248610f = true;
        } else if (a > 896) {
            C117407d.INSTANCE.idkeyStat(1031, (long) (i + 2), 1, false);
            Log.m105921e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD SOS: total count = %d", Integer.valueOf(a));
        }
        if (((double) a) > ((double) this.f248615n) * 0.9d && !this.f248616o) {
            Log.m105921e("MicroMsg.FDWatchDog", ">>>>>>>>>>>> FD SOS: total count = %d", Integer.valueOf(a));
            this.f248616o = true;
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1031, (long) (i + 4), 1, false);
            dVar.mo160131h(17899, Integer.valueOf(a), Long.valueOf(System.currentTimeMillis()), MMApplicationContext.getProcessName(), Integer.valueOf(mo118618d(b$$d.FD_TYPE_ANNON_INODE_EVENT)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_ANNON_INODE_DMABUF)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_SOCKET)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DATA_MM_FILES_MMKV)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DATA_MM_FILES_KVCOMM)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DATA_MM_FILES_XLOG)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DATA_MM_FILES_OTHERS)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DATA_MM_MICRO_MSG)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DATA_MM_OTHERS)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_EXT_AC_VOICE)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_EXT_AC_VIDEO)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_EXT_AC_ATTACHMENT)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_EXT_AC_IMAGE)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_EXT_AC_OTHERS)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_EXT_OTHERS)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_SYSTEM_FRAMEWORK)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DEV_ASHMEM)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PATH_DEV_OTHERS)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_OTHERS)), mo118617c(), Integer.valueOf(this.f248611g), Integer.valueOf(mo118618d(b$$d.FD_TYPE_ANNON_INODE_GRALLOC)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_PIPE)), Integer.valueOf(mo118618d(b$$d.FD_TYPE_ANNON_INODE_MALITL)), 1, Integer.valueOf(this.f248615n), Integer.valueOf(mo118618d(b$$d.FD_TYPE_RAW_PATH)));
        }
        ((C119157j) C119157j.f356862d).mo183878i(this, 1800000);
    }
}
