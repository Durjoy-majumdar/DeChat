package com.tencent.p014mm.plugin.downloader.intentservice;

import android.app.IntentService;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.p014mm.C0966R;
import p918s2.C90116e;

/* renamed from: com.tencent.mm.plugin.downloader.intentservice.DownloadFileService */
public class DownloadFileService extends IntentService {

    /* renamed from: d */
    public ResultReceiver f110058d;

    /* renamed from: e */
    public int f110059e;

    /* renamed from: f */
    public int f110060f;

    static {
        Class<DownloadFileService> cls = DownloadFileService.class;
    }

    public DownloadFileService() {
        super("com.tencent.mm.plugin.downloader.intentservice.DownloadFileService");
    }

    /* renamed from: a */
    public final void mo63910a(int i) {
        Bundle bundle = new Bundle();
        int i2 = (int) ((((long) this.f110059e) * 100) / ((long) i));
        if (i2 > this.f110060f) {
            bundle.putInt("progress", i2);
            this.f110058d.send(4657, bundle);
            this.f110060f = i2;
        }
    }

    public void onCreate() {
        super.onCreate();
        C90116e.C90121c cVar = new C90116e.C90121c(this, "reminder_channel_id");
        cVar.mo124383h("Something Download");
        cVar.mo124382g("Download in progress");
        cVar.f258814z.icon = C0966R.C0969drawable.icon;
        startForeground(4657, cVar.mo124378b());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.tencent.mm.vfs.f0$h, java.io.InputStream] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0149 A[SYNTHETIC, Splitter:B:54:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0151 A[Catch:{ IOException -> 0x014d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0165 A[SYNTHETIC, Splitter:B:66:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016d A[Catch:{ IOException -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0181 A[SYNTHETIC, Splitter:B:78:0x0181] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0189 A[Catch:{ IOException -> 0x0185 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019c A[SYNTHETIC, Splitter:B:89:0x019c] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a4 A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x0142=Splitter:B:51:0x0142, B:75:0x017a=Splitter:B:75:0x017a, B:63:0x015e=Splitter:B:63:0x015e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r11) {
        /*
            r10 = this;
            android.os.Bundle r0 = r11.getExtras()
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "receiver"
            android.os.Parcelable r11 = r11.getParcelableExtra(r1)
            android.os.ResultReceiver r11 = (android.os.ResultReceiver) r11
            r10.f110058d = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            r11.append(r1)
            java.lang.String r1 = "/Download"
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r1 = r11.getPath()
            r2 = 0
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163855k(r1, r2, r2)
            java.lang.String r3 = r11.getPath()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0054
            android.net.Uri$Builder r11 = r11.buildUpon()
            android.net.Uri$Builder r11 = r11.path(r1)
            android.net.Uri r11 = r11.build()
        L_0x0054:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r3 = 0
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r11, r3)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x0063
            r4 = 0
            goto L_0x006b
        L_0x0063:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            java.lang.String r5 = r1.f348992b
            boolean r4 = r4.mo119948x(r5)
        L_0x006b:
            if (r4 != 0) goto L_0x0081
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r4.mo177799l(r11, r1)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x007a
            goto L_0x0081
        L_0x007a:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            r4.mo119937g(r1)
        L_0x0081:
            java.lang.String r1 = "file11.apk"
            if (r11 != 0) goto L_0x008f
            android.net.Uri$Builder r11 = new android.net.Uri$Builder
            r11.<init>()
            android.net.Uri$Builder r11 = r11.path(r1)
            goto L_0x0096
        L_0x008f:
            android.net.Uri$Builder r11 = r11.buildUpon()
            r11.appendPath(r1)
        L_0x0096:
            android.net.Uri r1 = r11.build()
            java.lang.String r4 = r1.getPath()
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r2, r2)
            java.lang.String r5 = r1.getPath()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x00b6
            android.net.Uri$Builder r11 = r11.path(r4)
            android.net.Uri r1 = r11.build()
        L_0x00b6:
            java.lang.String r11 = ""
            java.lang.String r4 = "DownloadFileService"
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x01b1 }
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r1, r3)     // Catch:{ FileNotFoundException -> 0x01b1 }
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106425G(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x01b1 }
            java.net.URL r5 = new java.net.URL     // Catch:{ ProtocolException -> 0x0177, MalformedURLException -> 0x015b, IOException -> 0x013f, all -> 0x013b }
            r5.<init>(r0)     // Catch:{ ProtocolException -> 0x0177, MalformedURLException -> 0x015b, IOException -> 0x013f, all -> 0x013b }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ ProtocolException -> 0x0177, MalformedURLException -> 0x015b, IOException -> 0x013f, all -> 0x013b }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ ProtocolException -> 0x0177, MalformedURLException -> 0x015b, IOException -> 0x013f, all -> 0x013b }
            java.lang.String r5 = "GET"
            r0.setRequestMethod(r5)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r5)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r5 = 3000(0xbb8, float:4.204E-42)
            r0.setConnectTimeout(r5)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            java.lang.String r5 = "Content-Length"
            java.lang.String r5 = r0.getHeaderField(r5)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            int r6 = r0.getResponseCode()     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x010b
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r6]     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
        L_0x00f8:
            int r7 = r3.read(r6)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r8 = -1
            if (r7 == r8) goto L_0x011f
            r1.write(r6, r2, r7)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            int r8 = r10.f110059e     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            int r8 = r8 + r7
            r10.f110059e = r8     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r10.mo63910a(r5)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            goto L_0x00f8
        L_0x010b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r5.<init>()     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            java.lang.String r7 = "Server return code:"
            r5.append(r7)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            r5.append(r6)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            java.lang.String r5 = r5.toString()     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)     // Catch:{ ProtocolException -> 0x0139, MalformedURLException -> 0x0137, IOException -> 0x0135 }
        L_0x011f:
            if (r1 == 0) goto L_0x0127
            r1.close()     // Catch:{ IOException -> 0x0125 }
            goto L_0x0127
        L_0x0125:
            r1 = move-exception
            goto L_0x012e
        L_0x0127:
            if (r3 == 0) goto L_0x0192
            r3.close()     // Catch:{ IOException -> 0x0125 }
            goto L_0x0192
        L_0x012e:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r11, r2)
            goto L_0x0192
        L_0x0135:
            r5 = move-exception
            goto L_0x0142
        L_0x0137:
            r5 = move-exception
            goto L_0x015e
        L_0x0139:
            r5 = move-exception
            goto L_0x017a
        L_0x013b:
            r0 = move-exception
            r5 = r3
            goto L_0x019a
        L_0x013f:
            r0 = move-exception
            r5 = r0
            r0 = r3
        L_0x0142:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r5, r11, r6)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x014f
            r1.close()     // Catch:{ IOException -> 0x014d }
            goto L_0x014f
        L_0x014d:
            r1 = move-exception
            goto L_0x0155
        L_0x014f:
            if (r3 == 0) goto L_0x0192
            r3.close()     // Catch:{ IOException -> 0x014d }
            goto L_0x0192
        L_0x0155:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r11, r2)
            goto L_0x0192
        L_0x015b:
            r0 = move-exception
            r5 = r0
            r0 = r3
        L_0x015e:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r5, r11, r6)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x016b
            r1.close()     // Catch:{ IOException -> 0x0169 }
            goto L_0x016b
        L_0x0169:
            r1 = move-exception
            goto L_0x0171
        L_0x016b:
            if (r3 == 0) goto L_0x0192
            r3.close()     // Catch:{ IOException -> 0x0169 }
            goto L_0x0192
        L_0x0171:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r11, r2)
            goto L_0x0192
        L_0x0177:
            r0 = move-exception
            r5 = r0
            r0 = r3
        L_0x017a:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r5, r11, r6)     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x0187
            r1.close()     // Catch:{ IOException -> 0x0185 }
            goto L_0x0187
        L_0x0185:
            r1 = move-exception
            goto L_0x018d
        L_0x0187:
            if (r3 == 0) goto L_0x0192
            r3.close()     // Catch:{ IOException -> 0x0185 }
            goto L_0x0192
        L_0x018d:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r11, r2)
        L_0x0192:
            r0.disconnect()
            goto L_0x01bc
        L_0x0196:
            r5 = move-exception
            r9 = r5
            r5 = r0
            r0 = r9
        L_0x019a:
            if (r1 == 0) goto L_0x01a2
            r1.close()     // Catch:{ IOException -> 0x01a0 }
            goto L_0x01a2
        L_0x01a0:
            r1 = move-exception
            goto L_0x01a8
        L_0x01a2:
            if (r3 == 0) goto L_0x01ad
            r3.close()     // Catch:{ IOException -> 0x01a0 }
            goto L_0x01ad
        L_0x01a8:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r11, r2)
        L_0x01ad:
            r5.disconnect()
            throw r0
        L_0x01b1:
            r0 = move-exception
            java.lang.String r1 = "can not fond output folder"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r11, r1)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader.intentservice.DownloadFileService.onHandleIntent(android.content.Intent):void");
    }
}
