package com.tencent.xweb.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PatchFileConfigParser {
    private static final String ADD_FLAG = "ADD:";
    private static final int ADD_TYPE = 1;
    private static final int APK_FILE_TYPE = 1;
    private static final String DEL_FLAG = "DEL:";
    private static final int DEL_TYPE = 3;
    private static final int EXTRACTED_FILE_TYPE = 2;
    private static final String MOD_FLAG = "MOD:";
    private static final int MOD_TYPE = 2;
    private static final String PATCH_SUFFIX = ".patch";
    public static final String TAG = "PatchFileConfigParser";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.tencent.xweb.util.PatchFileConfig> getPatchFileConfigList(int r14) {
        /*
            java.lang.String r0 = "PatchFileConfigParser"
            r1 = 0
            java.lang.String r14 = com.tencent.xweb.util.XWebFileUtil.getPatchConfig(r14)     // Catch:{ all -> 0x00cd }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00cd }
            r2.<init>(r14)     // Catch:{ all -> 0x00cd }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ all -> 0x00cd }
            r14.<init>(r2)     // Catch:{ all -> 0x00cd }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ca }
            r2.<init>(r14)     // Catch:{ all -> 0x00ca }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x00c7 }
            r3.<init>(r2)     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00c5 }
            r4.<init>()     // Catch:{ all -> 0x00c5 }
        L_0x0020:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x00bb
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x002d
            goto L_0x0020
        L_0x002d:
            java.lang.String r6 = "ADD:"
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x00c5 }
            r7 = 0
            r8 = 1
            r9 = 4
            r10 = 2
            if (r6 == 0) goto L_0x003f
            java.lang.String r5 = r5.substring(r9)     // Catch:{ all -> 0x00c5 }
            r6 = 1
            goto L_0x005c
        L_0x003f:
            java.lang.String r6 = "MOD:"
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x004d
            java.lang.String r5 = r5.substring(r9)     // Catch:{ all -> 0x00c5 }
            r6 = 2
            goto L_0x005c
        L_0x004d:
            java.lang.String r6 = "DEL:"
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x00c5 }
            if (r6 == 0) goto L_0x005b
            java.lang.String r5 = r5.substring(r9)     // Catch:{ all -> 0x00c5 }
            r6 = 3
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            java.lang.String r9 = ","
            java.lang.String[] r5 = r5.split(r9)     // Catch:{ all -> 0x00c5 }
            int r9 = r5.length     // Catch:{ all -> 0x00c5 }
        L_0x0063:
            if (r7 >= r9) goto L_0x0020
            r11 = r5[r7]     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x00b8
            boolean r12 = r11.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r12 == 0) goto L_0x0070
            goto L_0x00b8
        L_0x0070:
            com.tencent.xweb.util.PatchFileConfig r12 = new com.tencent.xweb.util.PatchFileConfig     // Catch:{ all -> 0x00c5 }
            r12.<init>()     // Catch:{ all -> 0x00c5 }
            r12.originalFileName = r11     // Catch:{ all -> 0x00c5 }
            r12.type = r6     // Catch:{ all -> 0x00c5 }
            if (r6 != r10) goto L_0x0090
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r11.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = r12.originalFileName     // Catch:{ all -> 0x00c5 }
            r11.append(r13)     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = ".patch"
            r11.append(r13)     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00c5 }
            r12.patchFileName = r11     // Catch:{ all -> 0x00c5 }
        L_0x0090:
            if (r6 != r10) goto L_0x009f
            java.lang.String r11 = r12.originalFileName     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = "base.apk"
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x00c5 }
            if (r11 == 0) goto L_0x009f
            r12.originalFileType = r8     // Catch:{ all -> 0x00c5 }
            goto L_0x00a1
        L_0x009f:
            r12.originalFileType = r10     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r11.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = "getPatchFileConfigList config:"
            r11.append(r13)     // Catch:{ all -> 0x00c5 }
            r11.append(r12)     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00c5 }
            com.tencent.xweb.util.XWebLog.m21908d(r0, r11)     // Catch:{ all -> 0x00c5 }
            r4.add(r12)     // Catch:{ all -> 0x00c5 }
        L_0x00b8:
            int r7 = r7 + 1
            goto L_0x0063
        L_0x00bb:
            com.tencent.xweb.util.FileUtils.tryClose(r14)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r4
        L_0x00c5:
            r4 = move-exception
            goto L_0x00d1
        L_0x00c7:
            r4 = move-exception
            r3 = r1
            goto L_0x00d1
        L_0x00ca:
            r4 = move-exception
            r2 = r1
            goto L_0x00d0
        L_0x00cd:
            r4 = move-exception
            r14 = r1
            r2 = r14
        L_0x00d0:
            r3 = r2
        L_0x00d1:
            java.lang.String r5 = "getPatchFileConfigList error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r5, r4)     // Catch:{ all -> 0x00e0 }
            com.tencent.xweb.util.FileUtils.tryClose(r14)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r1
        L_0x00e0:
            r0 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r14)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.PatchFileConfigParser.getPatchFileConfigList(int):java.util.ArrayList");
    }

    public static ArrayList<PatchFileConfig> getPatchList(int i, int i2) {
        if (i2 == 1) {
            return getPatchFileConfigList(i);
        }
        if (i2 == 2) {
            return getPatchXmlConfigList(i);
        }
        XWebLog.m21909e(TAG, "getPatchList, error, unknown patchType");
        return null;
    }

    public static ArrayList<PatchFileConfig> getPatchXmlConfigList(int i) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(XWebFileUtil.getPatchXml(i)));
            try {
                Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream).getDocumentElement();
                if (documentElement == null) {
                    XWebLog.addInitializeLog(TAG, "parse xml failed, patch.xml is corrupted");
                    FileUtils.tryClose(fileInputStream);
                    return null;
                }
                NodeList elementsByTagName = documentElement.getElementsByTagName("file");
                if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
                    FileUtils.tryClose(fileInputStream);
                    return null;
                }
                ArrayList<PatchFileConfig> arrayList = new ArrayList<>();
                for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                    PatchFileConfig patchFileConfig = new PatchFileConfig();
                    Element element = (Element) elementsByTagName.item(i2);
                    if (element.getAttribute("algorithm").equals("bsdiff")) {
                        patchFileConfig.patchAlgorithmType = 1;
                    } else if (element.getAttribute("algorithm").equals("hdiff")) {
                        patchFileConfig.patchAlgorithmType = 2;
                    }
                    int i3 = element.getAttribute("type").equals("add") ? 1 : element.getAttribute("type").equals("mod") ? 2 : element.getAttribute("type").equals("del") ? 3 : 0;
                    patchFileConfig.type = i3;
                    patchFileConfig.originalFileName = element.getAttribute("originalFileName");
                    if (i3 == 2) {
                        patchFileConfig.patchFileName = patchFileConfig.originalFileName + PATCH_SUFFIX;
                    }
                    if (i3 != 2 || !patchFileConfig.originalFileName.equals(XWebFileUtil.XWALK_CORE_APK_NAME)) {
                        patchFileConfig.originalFileType = 2;
                    } else {
                        patchFileConfig.originalFileType = 1;
                    }
                    XWebLog.m21908d(TAG, "getPatchXmlConfigList config:" + patchFileConfig);
                    arrayList.add(patchFileConfig);
                }
                FileUtils.tryClose(fileInputStream);
                return arrayList;
            } catch (Throwable th) {
                th = th;
                try {
                    XWebLog.m21910e(TAG, "getPatchXmlConfigList error", th);
                    return null;
                } finally {
                    FileUtils.tryClose(fileInputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            XWebLog.m21910e(TAG, "getPatchXmlConfigList error", th);
            return null;
        }
    }
}
