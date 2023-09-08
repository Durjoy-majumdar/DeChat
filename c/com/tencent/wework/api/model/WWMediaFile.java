package com.tencent.wework.api.model;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.tencent.wework.api.model.WWMediaMessage;

public class WWMediaFile extends WWMediaMessage.WWMediaObject {

    /* renamed from: f */
    public int f285807f = 104857600;

    /* renamed from: g */
    public String f285808g;

    /* renamed from: h */
    public String f285809h;

    /* renamed from: i */
    public String f285810i;

    /* renamed from: a */
    public void mo136615a(Intent intent, String str) {
        String str2 = this.f285808g;
        if (str2 != null && str2.startsWith("content")) {
            if (intent.getClipData() == null) {
                intent.setClipData(new ClipData("", new String[]{"*/*"}, new ClipData.Item(Uri.parse(this.f285808g))));
            } else {
                intent.getClipData().addItem(new ClipData.Item(Uri.parse(this.f285808g)));
            }
            intent.addFlags(1);
            this.f285810i = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136616b() {
        /*
            r4 = this;
            boolean r0 = super.mo136616b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r4.f285808g
            if (r0 == 0) goto L_0x0036
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r4.f285808g
            if (r0 == 0) goto L_0x0034
            int r2 = r0.length()
            if (r2 == 0) goto L_0x002e
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            long r2 = r2.length()
            int r0 = (int) r2
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            int r2 = r4.f285807f
            if (r0 <= r2) goto L_0x0034
            return r1
        L_0x0034:
            r0 = 1
            return r0
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaFile.mo136616b():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        if (r0 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r0 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[SYNTHETIC, Splitter:B:29:0x00a3] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo136619f(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "_wwfileobject_fileData"
            r8.putByteArray(r1, r0)
            java.lang.String r0 = r7.f285808g
            java.lang.String r1 = "_wwfileobject_filePath"
            r8.putString(r1, r0)
            java.lang.String r0 = r7.f285809h
            java.lang.String r1 = "_wwfileobject_fileName"
            r8.putString(r1, r0)
            java.lang.String r0 = r7.f285808g
            java.lang.String r1 = "content"
            r2 = 0
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0025
            r7.f285810i = r2
            goto L_0x00af
        L_0x0025:
            android.content.Context r0 = r7.f285800a
            java.lang.String r3 = r7.f285801b
            java.lang.String r4 = r7.f285808g
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x009a }
            r5.<init>(r4)     // Catch:{ all -> 0x009a }
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch:{ all -> 0x009a }
            r6.<init>()     // Catch:{ all -> 0x009a }
            android.net.Uri$Builder r1 = r6.scheme(r1)     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r6.<init>()     // Catch:{ all -> 0x009a }
            r6.append(r3)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = ".wwapi"
            r6.append(r3)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x009a }
            android.net.Uri$Builder r1 = r1.authority(r3)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "file"
            android.net.Uri$Builder r1 = r1.appendPath(r3)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "name"
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x009a }
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r6)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = "filepath"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r4)     // Catch:{ all -> 0x009a }
            android.net.Uri r1 = r1.build()     // Catch:{ all -> 0x009a }
            r1.toString()     // Catch:{ all -> 0x009a }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x009a }
            java.io.OutputStream r0 = r0.openOutputStream(r1)     // Catch:{ all -> 0x009a }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0096 }
            r1.<init>(r5)     // Catch:{ all -> 0x0096 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0094 }
        L_0x007d:
            int r4 = r1.read(r3)     // Catch:{ all -> 0x0094 }
            if (r4 <= 0) goto L_0x0088
            r6 = 0
            r0.write(r3, r6, r4)     // Catch:{ all -> 0x0094 }
            goto L_0x007d
        L_0x0088:
            java.lang.String r2 = r5.getName()     // Catch:{ all -> 0x0094 }
            r1.close()     // Catch:{ all -> 0x0090 }
            goto L_0x0091
        L_0x0090:
        L_0x0091:
            if (r0 == 0) goto L_0x00ad
            goto L_0x00aa
        L_0x0094:
            r3 = move-exception
            goto L_0x009e
        L_0x0096:
            r1 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x009e
        L_0x009a:
            r0 = move-exception
            r3 = r0
            r0 = r2
            r1 = r0
        L_0x009e:
            r3.toString()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x00a8
            r1.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00a8
        L_0x00a7:
        L_0x00a8:
            if (r0 == 0) goto L_0x00ad
        L_0x00aa:
            r0.close()     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r7.f285810i = r2
        L_0x00af:
            java.lang.String r0 = r7.f285810i
            java.lang.String r1 = "_wwfileobject_fileId"
            r8.putString(r1, r0)
            super.mo136619f(r8)
            return
        L_0x00ba:
            r8 = move-exception
            if (r1 == 0) goto L_0x00c2
            r1.close()     // Catch:{ all -> 0x00c1 }
            goto L_0x00c2
        L_0x00c1:
        L_0x00c2:
            if (r0 == 0) goto L_0x00c7
            r0.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaFile.mo136619f(android.os.Bundle):void");
    }
}
