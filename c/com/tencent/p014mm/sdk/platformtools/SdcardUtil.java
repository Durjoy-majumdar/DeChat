package com.tencent.p014mm.sdk.platformtools;

import android.os.Environment;
import android.os.StatFs;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.platformtools.SdcardUtil */
public class SdcardUtil {
    public static final String ID_EMULATED_INTERNAL = "emulated";
    private static final String TAG = "MicroMsg.SdcardUtil";
    public static String[] excludeSpecialFileSystems = {"sysfs", "rootfs", "binfmt_misc", "anon_inodefs", "bdev", "proc", "cgroup", "tmpfs", "debugfs", "sockfs", "pipefs", "rpc_pipefs", "devpts", "ramfs", "fuseblk", "fusectl", "selinuxfs"};
    public static String[] excludeStorageMountDirs = {"/mnt/secure", "/mnt/asec", "/mnt/obb", "/dev/mapper", "/data/"};
    public static String[] includeDeviceNames = {"/dev/block/vold"};
    public static String[] includeStorageFileSystems = {"vfat", "exfat", "fuse", "sdcardfs"};

    /* renamed from: com.tencent.mm.sdk.platformtools.SdcardUtil$StatMountParse */
    public static class StatMountParse {
        private static final int DIFF_THRESHOLD = 4;
        public long availableBlocks;
        public long blockSize;
        public boolean canWrite;
        public String devName;
        public String fileSystem;
        public long freeBlocks;
        public String mountDir;
        public StatMountParse sharedStatMountParse;
        public long totalBlocks;

        public boolean equals(Object obj) {
            StatMountParse statMountParse = (StatMountParse) obj;
            if (this.blockSize != statMountParse.blockSize) {
                return false;
            }
            long j = this.totalBlocks - statMountParse.totalBlocks;
            long j2 = this.freeBlocks - statMountParse.freeBlocks;
            long j3 = this.availableBlocks - statMountParse.availableBlocks;
            return Math.abs(j - j2) <= 4 && Math.abs(j - j3) <= 4 && Math.abs(j2 - j3) <= 4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{DevName=");
            sb.append(this.devName);
            sb.append(", MountDir=");
            sb.append(this.mountDir);
            sb.append(", FileSystem=");
            sb.append(this.fileSystem);
            sb.append(", TotalBlocks=");
            sb.append(this.totalBlocks);
            sb.append(", FreeBlocks=");
            sb.append(this.freeBlocks);
            sb.append(", AvailableBlocks=");
            sb.append(this.availableBlocks);
            sb.append(", BlockSize=");
            sb.append(this.blockSize);
            sb.append(", Shared=");
            sb.append(this.sharedStatMountParse != null);
            sb.append("}");
            return sb.toString();
        }
    }

    private static void filterSpecialFileSystems(ArrayList<StatMountParse> arrayList) {
        int size = arrayList.size();
        List asList = Arrays.asList(excludeSpecialFileSystems);
        for (int i = size - 1; i >= 0; i--) {
            if (asList.contains(arrayList.get(i).fileSystem)) {
                arrayList.remove(i);
            }
        }
    }

    private static void filterStatMountParseForStorage(ArrayList<StatMountParse> arrayList, boolean z) {
        boolean z2;
        int size = arrayList.size();
        List asList = Arrays.asList(includeStorageFileSystems);
        List<String> asList2 = Arrays.asList(excludeStorageMountDirs);
        List<String> asList3 = Arrays.asList(includeDeviceNames);
        int i = size - 1;
        while (true) {
            boolean z3 = false;
            if (i < 0) {
                break;
            }
            StatMountParse statMountParse = arrayList.get(i);
            if (!asList.contains(statMountParse.fileSystem)) {
                arrayList.remove(i);
                Log.m105918d(TAG, "Remove with filesystem mismatch: " + statMountParse.fileSystem);
            } else {
                boolean z4 = false;
                for (String startsWith : asList2) {
                    z4 |= statMountParse.mountDir.startsWith(startsWith);
                }
                if (z4) {
                    arrayList.remove(i);
                    Log.m105918d(TAG, "Remove with bad mount dir1: " + statMountParse.mountDir);
                } else if (statMountParse.fileSystem.equals("fuse") || statMountParse.fileSystem.equals("sdcardfs")) {
                    if (statMountParse.devName.startsWith("/data/")) {
                        arrayList.remove(i);
                        Log.m105918d(TAG, "Remove with bad mount dir2: " + statMountParse.devName);
                    }
                } else if (!statMountParse.fileSystem.equals("fuse") && !statMountParse.fileSystem.equals("sdcardfs")) {
                    for (String startsWith2 : asList3) {
                        z3 |= statMountParse.devName.startsWith(startsWith2);
                    }
                    if (!z3) {
                        arrayList.remove(i);
                        Log.m105918d(TAG, "Remove with bad device name: " + statMountParse.devName);
                    }
                }
            }
            i--;
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        int size2 = arrayList.size() - 1;
        while (true) {
            if (size2 < 0) {
                z2 = false;
                break;
            }
            StatMountParse statMountParse2 = arrayList.get(size2);
            if (statMountParse2.mountDir.equals(path)) {
                arrayList.remove(size2);
                arrayList.add(0, statMountParse2);
                z2 = true;
                break;
            }
            size2--;
        }
        if (!z2) {
            StatMountParse statMountParse3 = new StatMountParse();
            statMountParse3.mountDir = path;
            statMountParse3.fileSystem = "unknown";
            statMountParse3.devName = "unknown";
            arrayList.add(0, statMountParse3);
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            StatMountParse statMountParse4 = arrayList.get(size3);
            C86009m1 m1Var = new C86009m1(statMountParse4.mountDir);
            if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                Log.m105918d(TAG, "Directory verify failed: " + statMountParse4);
                arrayList.remove(size3);
            }
        }
        if (z) {
            for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                StatMountParse statMountParse5 = arrayList.get(size4);
                if (!testPermissionForStatMountParse(statMountParse5)) {
                    Log.m105918d(TAG, "Directory testPermissionForStatMountParse failed: " + statMountParse5);
                    arrayList.remove(size4);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (!arrayList.isEmpty()) {
            StatMountParse remove = arrayList.remove(0);
            for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
                StatMountParse statMountParse6 = arrayList.get(size5);
                if (remove.devName.equals(statMountParse6.devName)) {
                    arrayList.remove(size5);
                    Log.m105918d(TAG, "Duplicate with same DevName:" + remove.devName);
                    if (!remove.canWrite && statMountParse6.canWrite) {
                        Log.m105918d(TAG, "Keep the writable one, discard the unwritable one");
                        remove = statMountParse6;
                    }
                }
            }
            arrayList2.add(remove);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            statFsForStatMountParse((StatMountParse) it.next());
        }
        arrayList.clear();
        while (!arrayList2.isEmpty()) {
            StatMountParse statMountParse7 = (StatMountParse) arrayList2.remove(0);
            arrayList.add(statMountParse7);
            for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                StatMountParse statMountParse8 = (StatMountParse) arrayList2.get(size6);
                if (statMountParse7.equals(statMountParse8)) {
                    Log.m105918d(TAG, "Duplicate:" + statMountParse7.toString() + "---" + statMountParse8.toString());
                    arrayList2.remove(size6);
                }
            }
        }
    }

    public static long getAvailableExternalMemorySize() {
        Iterator<StatMountParse> it = getStoragesStatMountParse().iterator();
        long j = 0;
        while (it.hasNext()) {
            StatMountParse next = it.next();
            j += next.availableBlocks * next.blockSize;
        }
        return j;
    }

    public static long getAvailableExternalMemorySize2() {
        StatMountParse sdcardDirectoryStatMountParse = getSdcardDirectoryStatMountParse();
        return sdcardDirectoryStatMountParse.availableBlocks * sdcardDirectoryStatMountParse.blockSize;
    }

    public static long getAvailableInternalMemorySize() {
        StatMountParse dataDirectoryStatMountParse = getDataDirectoryStatMountParse();
        return dataDirectoryStatMountParse.availableBlocks * dataDirectoryStatMountParse.blockSize;
    }

    public static StatMountParse getDataDirectoryStatMountParse() {
        StatMountParse statMountParse;
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        String absolutePath = Environment.getDataDirectory().getAbsolutePath();
        Iterator<StatMountParse> it = parseProcMounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                statMountParse = null;
                break;
            }
            statMountParse = it.next();
            if (statMountParse.mountDir.equals(absolutePath)) {
                break;
            }
        }
        if (statMountParse == null) {
            statMountParse = new StatMountParse();
            statMountParse.mountDir = absolutePath;
            statMountParse.devName = "Unknown";
            statMountParse.fileSystem = "Unknown";
        }
        statFsForStatMountParse(statMountParse);
        return statMountParse;
    }

    public static StatMountParse getDataStatMountParse() {
        StatMountParse dataDirectoryStatMountParse = getDataDirectoryStatMountParse();
        postProcess(dataDirectoryStatMountParse, getWritableStatMountParseForStorage());
        return dataDirectoryStatMountParse;
    }

    public static String getFileSystem(String str) {
        String str2 = "";
        if (Util.isNullOrNil(str)) {
            return str2;
        }
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        if (parseProcMounts != null) {
            Iterator<StatMountParse> it = parseProcMounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StatMountParse next = it.next();
                if (str.equals(next.mountDir)) {
                    str2 = next.fileSystem;
                    break;
                }
            }
        }
        Log.m105925i(TAG, "getFileSystem[%s] is [%s]", str, str2);
        if (!Util.isNullOrNil(str2) || !str.contains(ID_EMULATED_INTERNAL)) {
            return str2;
        }
        String substring = str.substring(str.lastIndexOf(47) + 1);
        int i = Util.getInt(substring, -1);
        Log.m105925i(TAG, "getFileSystem multiuser uid[%s][%d]", substring, Integer.valueOf(i));
        if (i == -1) {
            return str2;
        }
        String substring2 = str.substring(0, (str.length() - substring.length()) - 1);
        if (Util.isNullOrNil(substring2)) {
            return str2;
        }
        Iterator<StatMountParse> it4 = parseProcMounts.iterator();
        while (it4.hasNext()) {
            StatMountParse next2 = it4.next();
            if (substring2.equals(next2.mountDir)) {
                String str3 = next2.fileSystem;
                Log.m105925i(TAG, "getFileSystem[%s] fix[%s] is [%s]", str, substring2, str3);
                return str3;
            }
        }
        return str2;
    }

    private static StatMountParse getSdcardDirectoryStatMountParse() {
        StatMountParse statMountParse;
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        Iterator<StatMountParse> it = parseProcMounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                statMountParse = null;
                break;
            }
            statMountParse = it.next();
            if (statMountParse.mountDir.equals(absolutePath)) {
                break;
            }
        }
        if (statMountParse == null) {
            statMountParse = new StatMountParse();
            statMountParse.mountDir = absolutePath;
            statMountParse.devName = "Unknown";
            statMountParse.fileSystem = "Unknown";
        }
        statFsForStatMountParse(statMountParse);
        return statMountParse;
    }

    public static ArrayList<StatMountParse> getStatMountParseExcludeSpecialFileSystems() {
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        filterSpecialFileSystems(parseProcMounts);
        return parseProcMounts;
    }

    public static ArrayList<String> getStorageDirectories() {
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        filterStatMountParseForStorage(parseProcMounts, false);
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<StatMountParse> it = parseProcMounts.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mountDir);
        }
        return arrayList;
    }

    public static ArrayList<StatMountParse> getStoragesStatMountParse() {
        StatMountParse dataDirectoryStatMountParse = getDataDirectoryStatMountParse();
        ArrayList<StatMountParse> writableStatMountParseForStorage = getWritableStatMountParseForStorage();
        postProcess(dataDirectoryStatMountParse, writableStatMountParseForStorage);
        return writableStatMountParseForStorage;
    }

    public static long getTotalExternalMemorySize() {
        Iterator<StatMountParse> it = getStoragesStatMountParse().iterator();
        long j = 0;
        while (it.hasNext()) {
            StatMountParse next = it.next();
            j += next.totalBlocks * next.blockSize;
        }
        return j;
    }

    public static long getTotalInternalMemorySize() {
        StatMountParse dataDirectoryStatMountParse = getDataDirectoryStatMountParse();
        return dataDirectoryStatMountParse.totalBlocks * dataDirectoryStatMountParse.blockSize;
    }

    public static ArrayList<StatMountParse> getWritableStatMountParseForStorage() {
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        filterStatMountParseForStorage(parseProcMounts, true);
        return parseProcMounts;
    }

    public static ArrayList<String> getWritableStorageDirectories() {
        ArrayList<StatMountParse> writableStatMountParseForStorage = getWritableStatMountParseForStorage();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<StatMountParse> it = writableStatMountParseForStorage.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mountDir);
        }
        return arrayList;
    }

    public static boolean hasUnRemovableStorage() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<StatMountParse> parseProcMounts = parseProcMounts();
        String absolutePath = Environment.getDataDirectory().getAbsolutePath();
        String absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
        Iterator<StatMountParse> it = parseProcMounts.iterator();
        StatMountParse statMountParse = null;
        StatMountParse statMountParse2 = null;
        while (it.hasNext()) {
            StatMountParse next = it.next();
            if (statMountParse == null && next.mountDir.equals(absolutePath)) {
                statMountParse = next;
                if (statMountParse2 != null) {
                    break;
                }
            } else if (statMountParse2 == null && next.mountDir.equals(absolutePath2)) {
                statMountParse2 = next;
                if (statMountParse != null) {
                    break;
                }
            }
        }
        if (statMountParse != null && statMountParse2 == null && !Util.isNullOrNil(absolutePath2) && absolutePath2.contains(ID_EMULATED_INTERNAL)) {
            String substring = absolutePath2.substring(absolutePath2.lastIndexOf(47) + 1);
            int i = Util.getInt(substring, -1);
            Log.m105925i(TAG, "hasUnRemovableStorage multiuser uid[%s][%d]", substring, Integer.valueOf(i));
            if (i != -1) {
                String substring2 = absolutePath2.substring(0, (absolutePath2.length() - substring.length()) - 1);
                if (!Util.isNullOrNil(substring2)) {
                    Iterator<StatMountParse> it4 = parseProcMounts.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        StatMountParse next2 = it4.next();
                        if (next2.mountDir.equals(substring2)) {
                            statMountParse2 = next2;
                            break;
                        }
                    }
                }
            }
        }
        if (!(statMountParse == null || statMountParse2 == null)) {
            statFsForStatMountParse(statMountParse);
            statFsForStatMountParse(statMountParse2);
            Log.m105919d(TAG, "hasUnRemovableStorage stats dataStatMountParse[%s] storageStatMountParse[%s]", statMountParse, statMountParse2);
            if (statMountParse2.fileSystem.equals("fuse") || statMountParse2.fileSystem.equals("sdcardfs") || statMountParse2.fileSystem.equals("esdfs")) {
                long j = statMountParse.totalBlocks;
                long j2 = statMountParse2.totalBlocks;
                if (j >= j2 && j2 > 0) {
                    long j3 = statMountParse.blockSize;
                    long j4 = statMountParse2.blockSize;
                    if (j3 >= j4 && j4 > 0 && statMountParse.availableBlocks >= statMountParse2.availableBlocks) {
                        z = true;
                        Log.m105925i(TAG, "hasUnRemovableStorage ret[%b], take[%d]ms", Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        return z;
                    }
                }
            }
        }
        z = false;
        Log.m105925i(TAG, "hasUnRemovableStorage ret[%b], take[%d]ms", Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[SYNTHETIC, Splitter:B:25:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085 A[SYNTHETIC, Splitter:B:33:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.tencent.p014mm.sdk.platformtools.SdcardUtil.StatMountParse> parseProcMounts() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.SdcardUtil"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            r4 = 0
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            com.tencent.mm.vfs.t1 r7 = new com.tencent.mm.vfs.t1     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            java.lang.String r8 = "/proc/mounts"
            r7.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
        L_0x0018:
            java.lang.String r5 = r6.readLine()     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x0057
            java.lang.String r7 = "\\s+"
            java.lang.String[] r7 = r5.split(r7)     // Catch:{ Exception -> 0x0062 }
            if (r7 == 0) goto L_0x0041
            int r8 = r7.length     // Catch:{ Exception -> 0x0062 }
            r9 = 3
            if (r8 >= r9) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            com.tencent.mm.sdk.platformtools.SdcardUtil$StatMountParse r5 = new com.tencent.mm.sdk.platformtools.SdcardUtil$StatMountParse     // Catch:{ Exception -> 0x0062 }
            r5.<init>()     // Catch:{ Exception -> 0x0062 }
            r8 = r7[r4]     // Catch:{ Exception -> 0x0062 }
            r5.devName = r8     // Catch:{ Exception -> 0x0062 }
            r8 = r7[r3]     // Catch:{ Exception -> 0x0062 }
            r5.mountDir = r8     // Catch:{ Exception -> 0x0062 }
            r8 = 2
            r7 = r7[r8]     // Catch:{ Exception -> 0x0062 }
            r5.fileSystem = r7     // Catch:{ Exception -> 0x0062 }
            r2.add(r5)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0018
        L_0x0041:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0062 }
            r7.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r8 = "splite failed for line: "
            r7.append(r8)     // Catch:{ Exception -> 0x0062 }
            r7.append(r5)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0062 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0018
        L_0x0057:
            r6.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x0080
        L_0x005b:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r0, r4)
            goto L_0x0080
        L_0x0062:
            r5 = move-exception
            goto L_0x006a
        L_0x0064:
            r2 = move-exception
            goto L_0x0083
        L_0x0066:
            r6 = move-exception
            r10 = r6
            r6 = r5
            r5 = r10
        L_0x006a:
            java.lang.String r7 = "parseProcMounts"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0081 }
            r3[r4] = r5     // Catch:{ all -> 0x0081 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r7, r3)     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x0080
            r6.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x0080
        L_0x007a:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r0, r4)
        L_0x0080:
            return r2
        L_0x0081:
            r2 = move-exception
            r5 = r6
        L_0x0083:
            if (r5 == 0) goto L_0x008f
            r5.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008f
        L_0x0089:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r0, r4)
        L_0x008f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.SdcardUtil.parseProcMounts():java.util.ArrayList");
    }

    private static void postProcess(StatMountParse statMountParse, ArrayList<StatMountParse> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StatMountParse statMountParse2 = arrayList.get(size);
            if (statMountParse2.equals(statMountParse)) {
                statMountParse.sharedStatMountParse = statMountParse2;
                arrayList.remove(size);
            }
        }
    }

    public static void statFsForStatMountParse(StatMountParse statMountParse) {
        try {
            StatFs statFs = new StatFs(statMountParse.mountDir);
            statMountParse.blockSize = (long) statFs.getBlockSize();
            statMountParse.availableBlocks = (long) statFs.getAvailableBlocks();
            statMountParse.totalBlocks = (long) statFs.getBlockCount();
            statMountParse.freeBlocks = (long) statFs.getFreeBlocks();
        } catch (IllegalArgumentException e) {
            Log.m105921e(TAG, "statFsForStatMountParse", e);
        }
    }

    private static boolean testPermissionForStatMountParse(StatMountParse statMountParse) {
        C86009m1 m1Var = new C86009m1(statMountParse.mountDir, "test_writable");
        boolean z = false;
        OutputStream outputStream = null;
        try {
            m1Var.mo119964e();
            OutputStream H = C86013q1.m106426H(m1Var);
            H.write(APMidasPayAPI.ENV_TEST.getBytes());
            H.flush();
            H.close();
            boolean f = m1Var.mo119966f();
            try {
                H.close();
            } catch (IOException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
            z = f;
        } catch (IOException e2) {
            Log.m105920e(TAG, "createNewFile: " + e2.getMessage() + " dir: " + statMountParse.mountDir);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace(TAG, e3, "", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace(TAG, e4, "", new Object[0]);
                }
            }
            throw th;
        }
        statMountParse.canWrite = z;
        return z;
    }
}
