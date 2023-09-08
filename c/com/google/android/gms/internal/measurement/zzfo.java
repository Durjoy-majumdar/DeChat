package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

final class zzfo implements Runnable {
    private final String packageName;
    private final URL url;
    private final byte[] zzajl;
    private final zzfm zzajm;
    private final Map<String, String> zzajn;
    private final /* synthetic */ zzfk zzajo;

    public zzfo(zzfk zzfk, String str, URL url2, byte[] bArr, Map<String, String> map, zzfm zzfm) {
        this.zzajo = zzfk;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url2);
        Preconditions.checkNotNull(zzfm);
        this.url = url2;
        this.zzajl = bArr;
        this.zzajm = zzfm;
        this.packageName = str;
        this.zzajn = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd A[SYNTHETIC, Splitter:B:46:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108 A[SYNTHETIC, Splitter:B:59:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.internal.measurement.zzfk r1 = r13.zzajo
            r1.zzfs()
            r1 = 0
            r2 = 0
            com.google.android.gms.internal.measurement.zzfk r3 = r13.zzajo     // Catch:{ IOException -> 0x0101, all -> 0x00c6 }
            java.net.URL r4 = r13.url     // Catch:{ IOException -> 0x0101, all -> 0x00c6 }
            java.net.HttpURLConnection r3 = r3.zzb((java.net.URL) r4)     // Catch:{ IOException -> 0x0101, all -> 0x00c6 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.zzajn     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            if (r4 == 0) goto L_0x0039
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
        L_0x001d:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            goto L_0x001d
        L_0x0039:
            byte[] r4 = r13.zzajl     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            if (r4 == 0) goto L_0x0086
            com.google.android.gms.internal.measurement.zzfk r4 = r13.zzajo     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            com.google.android.gms.internal.measurement.zzka r4 = r4.zzgb()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            byte[] r5 = r13.zzajl     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            byte[] r4 = r4.zza((byte[]) r5)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            com.google.android.gms.internal.measurement.zzfk r5 = r13.zzajo     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            com.google.android.gms.internal.measurement.zzfg r5 = r5.zzge()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzit()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            r5.zzg(r6, r7)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            int r5 = r4.length     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            r3.connect()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            r5.write(r4)     // Catch:{ IOException -> 0x0080, all -> 0x007a }
            r5.close()     // Catch:{ IOException -> 0x0080, all -> 0x007a }
            goto L_0x0086
        L_0x007a:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r1 = r5
            goto L_0x00ca
        L_0x0080:
            r4 = move-exception
            r10 = r1
            r8 = r4
            r1 = r5
            goto L_0x0105
        L_0x0086:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c3, all -> 0x00c0 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00bb, all -> 0x00b6 }
            com.google.android.gms.internal.measurement.zzfk r2 = r13.zzajo     // Catch:{ IOException -> 0x00b2, all -> 0x00ad }
            byte[] r10 = com.google.android.gms.internal.measurement.zzfk.zzb((java.net.HttpURLConnection) r3)     // Catch:{ IOException -> 0x00b2, all -> 0x00ad }
            r3.disconnect()
            com.google.android.gms.internal.measurement.zzfk r0 = r13.zzajo
            com.google.android.gms.internal.measurement.zzgg r0 = r0.zzgd()
            com.google.android.gms.internal.measurement.zzfn r1 = new com.google.android.gms.internal.measurement.zzfn
            java.lang.String r6 = r13.packageName
            com.google.android.gms.internal.measurement.zzfm r7 = r13.zzajm
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00a9:
            r0.zzc((java.lang.Runnable) r1)
            return
        L_0x00ad:
            r4 = move-exception
            r2 = r4
            r7 = r8
            r10 = r11
            goto L_0x00cb
        L_0x00b2:
            r4 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x00be
        L_0x00b6:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r7 = r8
            goto L_0x00cb
        L_0x00bb:
            r4 = move-exception
            r10 = r1
            r7 = r8
        L_0x00be:
            r8 = r4
            goto L_0x0106
        L_0x00c0:
            r4 = move-exception
            r10 = r1
            goto L_0x00c9
        L_0x00c3:
            r4 = move-exception
            r10 = r1
            goto L_0x0104
        L_0x00c6:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x00c9:
            r2 = r4
        L_0x00ca:
            r7 = 0
        L_0x00cb:
            if (r1 == 0) goto L_0x00e5
            r1.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00e5
        L_0x00d1:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfk r4 = r13.zzajo
            com.google.android.gms.internal.measurement.zzfg r4 = r4.zzge()
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()
            java.lang.String r5 = r13.packageName
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzfg.zzbm(r5)
            r4.zze(r0, r5, r1)
        L_0x00e5:
            if (r3 == 0) goto L_0x00ea
            r3.disconnect()
        L_0x00ea:
            com.google.android.gms.internal.measurement.zzfk r0 = r13.zzajo
            com.google.android.gms.internal.measurement.zzgg r0 = r0.zzgd()
            com.google.android.gms.internal.measurement.zzfn r1 = new com.google.android.gms.internal.measurement.zzfn
            java.lang.String r5 = r13.packageName
            com.google.android.gms.internal.measurement.zzfm r6 = r13.zzajm
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.zzc((java.lang.Runnable) r1)
            throw r2
        L_0x0101:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x0104:
            r8 = r4
        L_0x0105:
            r7 = 0
        L_0x0106:
            if (r1 == 0) goto L_0x0120
            r1.close()     // Catch:{ IOException -> 0x010c }
            goto L_0x0120
        L_0x010c:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfk r2 = r13.zzajo
            com.google.android.gms.internal.measurement.zzfg r2 = r2.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()
            java.lang.String r4 = r13.packageName
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r4)
            r2.zze(r0, r4, r1)
        L_0x0120:
            if (r3 == 0) goto L_0x0125
            r3.disconnect()
        L_0x0125:
            com.google.android.gms.internal.measurement.zzfk r0 = r13.zzajo
            com.google.android.gms.internal.measurement.zzgg r0 = r0.zzgd()
            com.google.android.gms.internal.measurement.zzfn r1 = new com.google.android.gms.internal.measurement.zzfn
            java.lang.String r5 = r13.packageName
            com.google.android.gms.internal.measurement.zzfm r6 = r13.zzajm
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfo.run():void");
    }
}
