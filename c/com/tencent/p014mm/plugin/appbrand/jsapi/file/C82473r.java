package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.r */
public final class C82473r extends C82268c {
    private static final int CTRL_INDEX = 278;
    private static final String NAME = "getFileInfo";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.r$a */
    public class C82474a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241537d;

        /* renamed from: e */
        public final /* synthetic */ String f241538e;

        /* renamed from: f */
        public final /* synthetic */ int f241539f;

        /* renamed from: g */
        public final /* synthetic */ String f241540g;

        public C82474a(C82381f fVar, String str, int i, String str2) {
            this.f241537d = fVar;
            this.f241538e = str;
            this.f241539f = i;
            this.f241540g = str2;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ba */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r10.f241537d
                boolean r0 = r0.isRunning()
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r10.f241537d
                com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r0.getFileSystem()
                java.lang.String r1 = r10.f241538e
                com.tencent.mm.vfs.m1 r0 = r0.getAbsoluteFile(r1)
                if (r0 != 0) goto L_0x0027
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r10.f241537d
                int r1 = r10.f241539f
                com.tencent.mm.plugin.appbrand.jsapi.file.r r2 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82473r.this
                java.lang.String r3 = "fail:file doesn't exist"
                java.lang.String r2 = r2.mo115109j(r3)
                r0.mo109647a(r1, r2)
                return
            L_0x0027:
                com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
                java.lang.String r0 = r0.mo119971i()
                r1.<init>((java.lang.String) r0)
                java.lang.String r0 = r10.f241540g
                r0.getClass()
                java.lang.String r2 = "md5"
                boolean r2 = r0.equals(r2)
                java.lang.String r3 = ""
                if (r2 != 0) goto L_0x00dd
                java.lang.String r2 = "sha1"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x004a
                goto L_0x00e5
            L_0x004a:
                java.lang.String r0 = r1.mo119971i()
                android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
                r2 = 0
                java.lang.String r4 = r0.getPath()
                r5 = 0
                if (r4 == 0) goto L_0x0074
                java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r5, r5)
                java.lang.String r6 = r0.getPath()
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L_0x0074
                android.net.Uri$Builder r0 = r0.buildUpon()
                android.net.Uri$Builder r0 = r0.path(r4)
                android.net.Uri r0 = r0.build()
            L_0x0074:
                java.lang.String r4 = "Exception on closing MD5 input stream"
                java.lang.String r6 = "MicroMsg.JsApiGetFileInfo"
                r7 = 1
                java.lang.String r8 = "SHA1"
                java.security.MessageDigest r8 = java.security.MessageDigest.getInstance(r8)     // Catch:{ NoSuchAlgorithmException -> 0x00d2 }
                com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x00c7 }
                com.tencent.mm.vfs.f0$h r2 = r9.mo177799l(r0, r2)     // Catch:{ FileNotFoundException -> 0x00c7 }
                java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106421C(r0, r2)     // Catch:{ FileNotFoundException -> 0x00c7 }
                r2 = 8192(0x2000, float:1.14794E-41)
                byte[] r2 = new byte[r2]
            L_0x008d:
                int r9 = r0.read(r2)     // Catch:{ IOException -> 0x00ba, all -> 0x00ac }
                if (r9 <= 0) goto L_0x0097
                r8.update(r2, r5, r9)     // Catch:{ IOException -> 0x00ba, all -> 0x00ac }
                goto L_0x008d
            L_0x0097:
                byte[] r2 = r8.digest()     // Catch:{ IOException -> 0x00ba, all -> 0x00ac }
                java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82473r.m101235w(r2)     // Catch:{ IOException -> 0x00ba, all -> 0x00ac }
                r0.close()     // Catch:{ IOException -> 0x00a3 }
                goto L_0x00e5
            L_0x00a3:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r2)
                goto L_0x00e5
            L_0x00ac:
                r1 = move-exception
                r0.close()     // Catch:{ IOException -> 0x00b1 }
                goto L_0x00b9
            L_0x00b1:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r2)
            L_0x00b9:
                throw r1
            L_0x00ba:
                r0.close()     // Catch:{ IOException -> 0x00be }
                goto L_0x00e5
            L_0x00be:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r2)
                goto L_0x00e5
            L_0x00c7:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r5] = r0
                java.lang.String r0 = "Exception while getting FileInputStream"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
                goto L_0x00e5
            L_0x00d2:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r2[r5] = r0
                java.lang.String r0 = "Exception while getting Digest"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
                goto L_0x00e5
            L_0x00dd:
                java.lang.String r0 = r1.mo119971i()
                java.lang.String r3 = p823sg.C90193h.m112876d(r0)
            L_0x00e5:
                java.util.HashMap r0 = new java.util.HashMap
                r2 = 2
                r0.<init>(r2)
                long r1 = r1.mo119980r()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.String r2 = "size"
                r0.put(r2, r1)
                java.lang.String r1 = "digest"
                r0.put(r1, r3)
                com.tencent.mm.plugin.appbrand.jsapi.f r1 = r10.f241537d
                int r2 = r10.f241539f
                com.tencent.mm.plugin.appbrand.jsapi.file.r r3 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82473r.this
                java.lang.String r4 = "ok"
                java.lang.String r0 = r3.mo115112m(r4, r0)
                r1.mo109647a(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82473r.C82474a.run():void");
        }
    }

    /* renamed from: w */
    public static final String m101235w(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toLowerCase());
        }
        return stringBuffer.toString();
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        String str = !"sha1".equalsIgnoreCase(jSONObject.optString("digestAlgorithm", "md5")) ? "md5" : "sha1";
        if (Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            C82421e.f241505h.execute(new C82474a(fVar, optString, i, str));
        }
    }
}
