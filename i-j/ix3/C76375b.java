package ix3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.tencent.xweb.file.XVFSFile;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: ix3.b */
public final class C76375b {

    /* renamed from: a */
    public static final /* synthetic */ int f223657a = 0;

    static {
        new C76376c();
    }

    /* renamed from: a */
    public static int m91799a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (r0.equals(r9) != false) goto L_0x0090;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m91800b(android.content.Context r9) {
        /*
            java.lang.String r0 = "sePayConf"
            java.lang.String r1 = "configs"
            java.lang.String r2 = com.unionpay.utils.UPUtils.m90294a(r9, r1)
            java.lang.String r3 = "mode"
            java.lang.String r3 = com.unionpay.utils.UPUtils.m90294a(r9, r3)
            java.lang.String r4 = "or"
            java.lang.String r9 = com.unionpay.utils.UPUtils.m90294a(r9, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r5 = 0
            r6 = 2
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x008f
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x008f
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L_0x008f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x008f }
            r4.<init>(r2)     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "sign"
            java.lang.String r2 = ix3.C76377f.m91807b(r4, r2)     // Catch:{ Exception -> 0x008f }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x003a }
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = r4.getString(r1)     // Catch:{ Exception -> 0x008f }
            byte[] r1 = android.util.Base64.decode(r1, r6)     // Catch:{ Exception -> 0x008f }
            r8.<init>(r1)     // Catch:{ Exception -> 0x008f }
            boolean r1 = r4.has(r0)     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x008f }
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch:{ Exception -> 0x008f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x008f }
            goto L_0x005d
        L_0x005c:
            r1 = r7
        L_0x005d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x008f }
            if (r0 == 0) goto L_0x0064
            r1 = r7
        L_0x0064:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r0.<init>()     // Catch:{ Exception -> 0x008f }
            r0.append(r8)     // Catch:{ Exception -> 0x008f }
            r0.append(r1)     // Catch:{ Exception -> 0x008f }
            r0.append(r9)     // Catch:{ Exception -> 0x008f }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x008f }
            java.lang.String r9 = com.unionpay.utils.UPUtils.m90295b(r9)     // Catch:{ Exception -> 0x008f }
            java.lang.String r9 = m91805g(r9)     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = com.unionpay.utils.UPUtils.forConfig(r3, r2)     // Catch:{ Exception -> 0x008f }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008f }
            if (r1 != 0) goto L_0x008f
            boolean r9 = r0.equals(r9)     // Catch:{ Exception -> 0x008f }
            if (r9 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r8 = r7
        L_0x0090:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Exception -> 0x00c5 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00c5 }
            int r0 = r9.length()
        L_0x0099:
            if (r5 >= r0) goto L_0x00c5
            java.lang.Object r1 = ix3.C76377f.m91806a(r9, r5)
            if (r1 == 0) goto L_0x00c2
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = "type"
            java.lang.String r2 = ix3.C76377f.m91807b(r1, r2)
            java.lang.String r3 = "app"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c2
            java.lang.String r9 = "ca"
            java.lang.String r9 = ix3.C76377f.m91807b(r1, r9)
            java.lang.String r0 = new java.lang.String
            byte[] r9 = android.util.Base64.decode(r9, r6)
            r0.<init>(r9)
            return r0
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x0099
        L_0x00c5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ix3.C76375b.m91800b(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[SYNTHETIC, Splitter:B:12:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0045 A[Catch:{ NoSuchAlgorithmException | CertificateEncodingException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0056  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m91801c(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            if (r3 == 0) goto L_0x000a
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x005d }
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            if (r3 == 0) goto L_0x0015
            r2 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch:{ NameNotFoundException -> 0x0014 }
            goto L_0x0016
        L_0x0014:
        L_0x0015:
            r3 = r1
        L_0x0016:
            if (r3 == 0) goto L_0x005d
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ Exception -> 0x005d }
            if (r3 == 0) goto L_0x005d
            int r4 = r3.length     // Catch:{ Exception -> 0x005d }
            if (r4 <= 0) goto L_0x005d
            r4 = 0
            r3 = r3[r4]     // Catch:{ Exception -> 0x005d }
            if (r3 == 0) goto L_0x005d
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x005d }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x005d }
            r4.<init>(r3)     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = "X509"
            java.security.cert.CertificateFactory r3 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch:{ CertificateException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            if (r3 == 0) goto L_0x003e
            java.security.cert.Certificate r3 = r3.generateCertificate(r4)     // Catch:{ CertificateException -> 0x003e }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ CertificateException -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r3 = r1
        L_0x003f:
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException | CertificateEncodingException -> 0x0053 }
            if (r3 == 0) goto L_0x0054
            byte[] r3 = r3.getEncoded()     // Catch:{ NoSuchAlgorithmException | CertificateEncodingException -> 0x0053 }
            byte[] r3 = r4.digest(r3)     // Catch:{ NoSuchAlgorithmException | CertificateEncodingException -> 0x0053 }
            java.lang.String r3 = m91803e(r3)     // Catch:{ NoSuchAlgorithmException | CertificateEncodingException -> 0x0053 }
            r1 = r3
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            if (r1 == 0) goto L_0x005d
            java.lang.String r3 = ":"
            java.lang.String r3 = r1.replaceAll(r3, r0)     // Catch:{ Exception -> 0x005d }
            return r3
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ix3.C76375b.m91801c(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static String m91802d(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: e */
    public static String m91803e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static boolean m91804f(Context context, String str) {
        PackageInfo packageInfo = null;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && !TextUtils.isEmpty(str)) {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
            } catch (Exception unused) {
            }
        }
        return packageInfo != null;
    }

    /* renamed from: g */
    public static String m91805g(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (byte b : str.getBytes()) {
            sb.append(charArray[(b & 240) >> 4]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString().trim();
    }
}
