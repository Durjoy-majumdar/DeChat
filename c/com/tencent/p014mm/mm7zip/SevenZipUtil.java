package com.tencent.p014mm.mm7zip;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.mm7zip.SevenZipUtil */
public class SevenZipUtil {

    /* renamed from: com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback */
    public static class ExtractCallback implements IArchiveExtractCallback {
        private final String extractPath;
        private boolean hasFail = false;
        private final IInArchive inArchive;
        private List<String> paths = new ArrayList();

        public ExtractCallback(IInArchive iInArchive, String str) {
            this.inArchive = iInArchive;
            if (!str.endsWith("/") && !str.endsWith("\\")) {
                str = str + File.separator;
            }
            this.extractPath = str;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005c A[SYNTHETIC, Splitter:B:16:0x005c] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[SYNTHETIC, Splitter:B:22:0x0065] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ int lambda$getStream$0(int r5, byte[] r6) {
            /*
                r4 = this;
                com.tencent.mm.mm7zip.IInArchive r0 = r4.inArchive
                com.tencent.mm.mm7zip.PropID r1 = com.tencent.p014mm.mm7zip.PropID.PATH
                java.lang.String r5 = r0.getStringProperty(r5, r1)
                r0 = 0
                java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r2.<init>()     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.lang.String r3 = r4.extractPath     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r2.append(r3)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r2.append(r5)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r1.<init>(r5)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.util.List<java.lang.String> r5 = r4.paths     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                boolean r5 = r5.contains(r2)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                if (r5 != 0) goto L_0x0032
                java.lang.String r5 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                com.tencent.p014mm.mm7zip.util.FileOps.deleteFile(r5)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
            L_0x0032:
                java.util.List<java.lang.String> r5 = r4.paths     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r5.add(r2)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.lang.String r5 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r2 = 0
                com.tencent.p014mm.mm7zip.util.FileOps.makeSureExist(r5, r2)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r2 = 1
                r5.<init>(r1, r2)     // Catch:{ IOException -> 0x0063, all -> 0x0059 }
                r5.write(r6)     // Catch:{ IOException -> 0x0057, all -> 0x0053 }
                r5.flush()     // Catch:{ IOException -> 0x006b }
                r5.close()     // Catch:{ IOException -> 0x006b }
                goto L_0x006b
            L_0x0053:
                r6 = move-exception
                r0 = r5
                r5 = r6
                goto L_0x005a
            L_0x0057:
                r0 = r5
                goto L_0x0063
            L_0x0059:
                r5 = move-exception
            L_0x005a:
                if (r0 == 0) goto L_0x0062
                r0.flush()     // Catch:{ IOException -> 0x0062 }
                r0.close()     // Catch:{ IOException -> 0x0062 }
            L_0x0062:
                throw r5
            L_0x0063:
                if (r0 == 0) goto L_0x006b
                r0.flush()     // Catch:{ IOException -> 0x006b }
                r0.close()     // Catch:{ IOException -> 0x006b }
            L_0x006b:
                int r5 = r6.length
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.SevenZipUtil.ExtractCallback.lambda$getStream$0(int, byte[]):int");
        }

        public ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
            return new SevenZipUtil$ExtractCallback$$a(this, i);
        }

        public boolean hasFail() {
            return this.hasFail;
        }

        public void prepareOperation(ExtractAskMode extractAskMode) {
        }

        public void setCompleted(long j) {
        }

        public void setOperationResult(ExtractOperationResult extractOperationResult) {
            if (extractOperationResult != ExtractOperationResult.OK) {
                this.hasFail = true;
            }
        }

        public void setTotal(long j) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int extract(java.lang.String r10, java.lang.String r11) {
        /*
            boolean r0 = com.tencent.p014mm.mm7zip.util.FileOps.exists(r10)
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0060 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0060 }
            r3.<init>(r10)     // Catch:{ all -> 0x0060 }
            java.lang.String r10 = "r"
            r2.<init>(r3, r10)     // Catch:{ all -> 0x0060 }
            com.tencent.mm.mm7zip.impl.RandomAccessFileInStream r10 = new com.tencent.mm.mm7zip.impl.RandomAccessFileInStream     // Catch:{ all -> 0x005e }
            r10.<init>(r2)     // Catch:{ all -> 0x005e }
            com.tencent.mm.mm7zip.IInArchive r10 = com.tencent.p014mm.mm7zip.SevenZip.openInArchive(r0, r10)     // Catch:{ all -> 0x005e }
            com.tencent.mm.mm7zip.simple.ISimpleInArchive r3 = r10.getSimpleInterface()     // Catch:{ all -> 0x005b }
            com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem[] r3 = r3.getArchiveItems()     // Catch:{ all -> 0x005b }
            int r4 = r3.length     // Catch:{ all -> 0x005b }
            r5 = 0
            r6 = 0
        L_0x0029:
            if (r6 >= r4) goto L_0x0044
            r7 = r3[r6]     // Catch:{ all -> 0x005b }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x005b }
            java.lang.String r9 = r7.getPath()     // Catch:{ all -> 0x005b }
            r8.<init>(r11, r9)     // Catch:{ all -> 0x005b }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ all -> 0x005b }
            boolean r7 = r7.isFolder()     // Catch:{ all -> 0x005b }
            com.tencent.p014mm.mm7zip.util.FileOps.makeSureExist(r8, r7)     // Catch:{ all -> 0x005b }
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0044:
            com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback r3 = new com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback     // Catch:{ all -> 0x005b }
            r3.<init>(r10, r11)     // Catch:{ all -> 0x005b }
            r10.extract(r0, r5, r3)     // Catch:{ all -> 0x005b }
            boolean r11 = r3.hasFail()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r10.close()
            r2.close()
            return r1
        L_0x005b:
            r11 = move-exception
            r0 = r10
            goto L_0x0062
        L_0x005e:
            r11 = move-exception
            goto L_0x0062
        L_0x0060:
            r11 = move-exception
            r2 = r0
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.close()
        L_0x006c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.SevenZipUtil.extract(java.lang.String, java.lang.String):int");
    }
}
