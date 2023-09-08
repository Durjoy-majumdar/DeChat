package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

public class ShareResPatchInfo {
    public ArrayList<String> addRes = new ArrayList<>();
    public String arscBaseCrc = null;
    public ArrayList<String> deleteRes = new ArrayList<>();
    public HashMap<String, LargeModeInfo> largeModMap = new HashMap<>();
    public ArrayList<String> largeModRes = new ArrayList<>();
    public ArrayList<String> modRes = new ArrayList<>();
    public HashSet<Pattern> patterns = new HashSet<>();
    public String resArscMd5 = null;
    public HashMap<String, File> storeRes = new HashMap<>();

    public static class LargeModeInfo {
        public long crc;
        public File file = null;
        public String md5 = null;
    }

    public static boolean checkFileInPattern(HashSet<Pattern> hashSet, String str) {
        if (hashSet.isEmpty()) {
            return false;
        }
        Iterator<Pattern> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = r2.resArscMd5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkResPatchInfo(com.tencent.tinker.loader.shareutil.ShareResPatchInfo r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r2 = r2.resArscMd5
            if (r2 == 0) goto L_0x0013
            int r2 = r2.length()
            r1 = 32
            if (r2 == r1) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 1
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareResPatchInfo.checkResPatchInfo(com.tencent.tinker.loader.shareutil.ShareResPatchInfo):boolean");
    }

    private static Pattern convertToPatternString(String str) {
        if (str.contains(".")) {
            str = str.replaceAll("\\.", "\\\\.");
        }
        if (str.contains("?")) {
            str = str.replaceAll("\\?", "\\.");
        }
        if (str.contains("*")) {
            str = str.replace("*", ".*");
        }
        return Pattern.compile(str);
    }

    public static void parseAllResPatchInfo(String str, ShareResPatchInfo shareResPatchInfo) {
        if (str != null && str.length() != 0) {
            String[] split = str.split("\n");
            int i = 0;
            while (i < split.length) {
                String str2 = split[i];
                if (str2 != null && str2.length() > 0) {
                    if (str2.startsWith(ShareConstants.RES_TITLE)) {
                        String[] split2 = str2.split(",", 3);
                        shareResPatchInfo.arscBaseCrc = split2[1];
                        shareResPatchInfo.resArscMd5 = split2[2];
                    } else if (str2.startsWith(ShareConstants.RES_PATTERN_TITLE)) {
                        for (int parseInt = Integer.parseInt(str2.split(XVFSFile.PATH_SEPARATOR, 2)[1]); parseInt > 0; parseInt--) {
                            i++;
                            shareResPatchInfo.patterns.add(convertToPatternString(split[i]));
                        }
                    } else if (str2.startsWith(ShareConstants.RES_ADD_TITLE)) {
                        for (int parseInt2 = Integer.parseInt(str2.split(XVFSFile.PATH_SEPARATOR, 2)[1]); parseInt2 > 0; parseInt2--) {
                            i++;
                            shareResPatchInfo.addRes.add(split[i]);
                        }
                    } else if (str2.startsWith(ShareConstants.RES_MOD_TITLE)) {
                        for (int parseInt3 = Integer.parseInt(str2.split(XVFSFile.PATH_SEPARATOR, 2)[1]); parseInt3 > 0; parseInt3--) {
                            i++;
                            shareResPatchInfo.modRes.add(split[i]);
                        }
                    } else if (str2.startsWith(ShareConstants.RES_LARGE_MOD_TITLE)) {
                        for (int parseInt4 = Integer.parseInt(str2.split(XVFSFile.PATH_SEPARATOR, 2)[1]); parseInt4 > 0; parseInt4--) {
                            i++;
                            String[] split3 = split[i].split(",", 3);
                            String str3 = split3[0];
                            LargeModeInfo largeModeInfo = new LargeModeInfo();
                            largeModeInfo.md5 = split3[1];
                            largeModeInfo.crc = Long.parseLong(split3[2]);
                            shareResPatchInfo.largeModRes.add(str3);
                            shareResPatchInfo.largeModMap.put(str3, largeModeInfo);
                        }
                    } else if (str2.startsWith(ShareConstants.RES_DEL_TITLE)) {
                        for (int parseInt5 = Integer.parseInt(str2.split(XVFSFile.PATH_SEPARATOR, 2)[1]); parseInt5 > 0; parseInt5--) {
                            i++;
                            shareResPatchInfo.deleteRes.add(split[i]);
                        }
                    } else if (str2.startsWith(ShareConstants.RES_STORE_TITLE)) {
                        for (int parseInt6 = Integer.parseInt(str2.split(XVFSFile.PATH_SEPARATOR, 2)[1]); parseInt6 > 0; parseInt6--) {
                            i++;
                            shareResPatchInfo.storeRes.put(split[i], (Object) null);
                        }
                    }
                }
                i++;
            }
        }
    }

    public static void parseResPatchInfoFirstLine(String str, ShareResPatchInfo shareResPatchInfo) {
        if (str != null && str.length() != 0) {
            String str2 = str.split("\n")[0];
            if (str2 == null || str2.length() <= 0) {
                throw new TinkerRuntimeException("res meta Corrupted:" + str);
            }
            String[] split = str2.split(",", 3);
            shareResPatchInfo.arscBaseCrc = split[1];
            shareResPatchInfo.resArscMd5 = split[2];
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("resArscMd5:" + this.resArscMd5 + "\n");
        stringBuffer.append("arscBaseCrc:" + this.arscBaseCrc + "\n");
        Iterator<Pattern> it = this.patterns.iterator();
        while (it.hasNext()) {
            stringBuffer.append(ShareConstants.RES_PATTERN_TITLE + it.next() + "\n");
        }
        Iterator<String> it4 = this.addRes.iterator();
        while (it4.hasNext()) {
            stringBuffer.append("addedSet:" + it4.next() + "\n");
        }
        Iterator<String> it5 = this.modRes.iterator();
        while (it5.hasNext()) {
            stringBuffer.append("modifiedSet:" + it5.next() + "\n");
        }
        Iterator<String> it6 = this.largeModRes.iterator();
        while (it6.hasNext()) {
            stringBuffer.append("largeModifiedSet:" + it6.next() + "\n");
        }
        Iterator<String> it7 = this.deleteRes.iterator();
        while (it7.hasNext()) {
            stringBuffer.append("deletedSet:" + it7.next() + "\n");
        }
        for (String str : this.storeRes.keySet()) {
            stringBuffer.append("storeSet:" + str + "\n");
        }
        return stringBuffer.toString();
    }
}
