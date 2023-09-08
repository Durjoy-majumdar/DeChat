package com.tenpay.ndk;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import java.security.MessageDigest;

public class CertUtil {
    public static final String TAG = "CertUtil";
    private static CertUtil instance;
    private String cert_dir;
    private String cert_id = null;
    private byte[] certid_buf = null;
    private byte[] cipher_buf = null;
    private byte[] csr_buf = null;
    private String deskey = null;
    private EventListener eventListener = null;
    private String iccid = null;
    private String imei = null;
    private String imsi = null;
    private String login_ip = null;
    private Context mContext = null;
    private String mac = null;
    private String plain_buf = null;
    private byte[] plain_buf2 = null;
    private String priv_dir;
    private String publ_dir;
    private String qq_id = null;
    private byte[] sig_buf = null;
    private String sig_raw_buf = null;
    private String sm4Key = null;
    private String softid = null;
    private String svr_cert = null;
    private String token = null;
    private byte[] token_buf = null;
    private String token_dir;
    private int token_len = 0;
    private int useSM4 = 0;

    public interface EventListener {
        String getUniqueID();

        void onEvent(int i, String str);
    }

    private CertUtil() {
    }

    private void checkDir(String str) {
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        } else if (!m1Var.mo119977o()) {
            m1Var.mo119966f();
            m1Var.mo119987x();
        }
    }

    private boolean create_dir(String str) {
        try {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                return true;
            }
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (!l2.mo177810a()) {
                return false;
            }
            return l2.f348991a.mo119937g(l2.f348992b);
        } catch (Exception unused) {
            return false;
        }
    }

    private native byte[] decrypt(byte[] bArr, byte[] bArr2);

    private boolean del_all_files(String str) {
        C86009m1 m1Var;
        C86009m1 m1Var2 = new C86009m1(str);
        if (!m1Var2.mo119967g() || !m1Var2.mo119977o()) {
            return false;
        }
        String[] s = m1Var2.mo119981s();
        boolean z = false;
        for (int i = 0; i < s.length; i++) {
            if (str.endsWith("/")) {
                m1Var = new C86009m1(str + s[i]);
            } else {
                m1Var = new C86009m1(str + "/" + s[i]);
            }
            if (m1Var.mo119978p()) {
                m1Var.mo119966f();
            } else if (m1Var.mo119977o()) {
                del_all_files(str + "/" + s[i]);
                del_dir(str + "/" + s[i], true);
                z = true;
            }
        }
        return z;
    }

    private void del_dir(String str, boolean z) {
        try {
            del_all_files(str);
            if (z) {
                Uri n = C116299g2.m163858n(str.toString());
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a()) {
                    l.f348991a.mo119933c(l.f348992b);
                }
            }
        } catch (Exception unused) {
        }
    }

    private native boolean encrypt();

    private native long expireTime();

    private native boolean genCertApplyCsr();

    private native boolean genCertApplyCsrNew(int i);

    private native boolean genQrcode();

    private String getCertDir() {
        return this.mContext.getFilesDir().getParentFile().getAbsolutePath() + "/cert";
    }

    private native boolean getCertid();

    public static CertUtil getInstance() {
        if (instance == null) {
            synchronized (CertUtil.class) {
                instance = new CertUtil();
            }
        }
        return instance;
    }

    private native boolean getToken();

    private native int getTokenCount();

    private String hexdigest(String str) {
        if (str == null) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            MessageDigest instance2 = MessageDigest.getInstance("MD5");
            instance2.update(str.getBytes());
            byte[] digest = instance2.digest();
            char[] cArr2 = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    private native boolean importCert();

    private native boolean isCertExist();

    private boolean isNotEmptyDir(String str) {
        C86009m1 m1Var = new C86009m1(str);
        return m1Var.mo119967g() && m1Var.mo119977o() && m1Var.mo119984u() != null;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private boolean isValidDir(String str) {
        C86009m1 m1Var = new C86009m1(str);
        return m1Var.mo119967g() && m1Var.mo119977o();
    }

    private void onNativeEvent(int i, String str) {
        EventListener eventListener2 = this.eventListener;
        if (eventListener2 != null) {
            eventListener2.onEvent(i, str);
        }
    }

    private void setAndCheckDir(String str) {
        String certDir = getCertDir();
        StringBuilder sb = new StringBuilder();
        sb.append(certDir);
        sb.append("/");
        sb.append(hexdigest(str + this.imei));
        String sb4 = sb.toString();
        this.cert_dir = sb4 + "/cert";
        this.priv_dir = sb4 + "/priv";
        this.publ_dir = sb4 + "/publ";
        this.token_dir = sb4 + "/auth";
        checkDir(certDir);
        checkDir(this.token_dir);
    }

    private void setDir(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCertDir());
        sb.append("/");
        sb.append(hexdigest(str + this.imei));
        String sb4 = sb.toString();
        this.cert_dir = sb4 + "/cert";
        this.priv_dir = sb4 + "/priv";
        this.publ_dir = sb4 + "/publ";
        this.token_dir = sb4 + "/auth";
    }

    private native boolean setToken();

    private native boolean usrSig(byte[] bArr);

    public synchronized void clearAllCert() {
        del_dir(getCertDir(), true);
    }

    public synchronized void clearCert(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getCertDir());
        sb.append("/");
        sb.append(hexdigest(str + this.imei));
        del_dir(sb.toString(), true);
    }

    public synchronized void clearToken(String str) {
        if (!isNullOrEmpty(str)) {
            setDir(str);
            del_dir(this.token_dir, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String decrypt(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isNullOrEmpty(r5)     // Catch:{ all -> 0x0062 }
            r1 = 0
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4.isNullOrEmpty(r6)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0060
        L_0x000f:
            r4.setAndCheckDir(r5)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r4.cert_dir     // Catch:{ all -> 0x0062 }
            boolean r0 = r4.isNotEmptyDir(r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r4.publ_dir     // Catch:{ all -> 0x0062 }
            boolean r0 = r4.isNotEmptyDir(r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r4.priv_dir     // Catch:{ all -> 0x0062 }
            boolean r0 = r4.isNotEmptyDir(r0)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002b
            goto L_0x005e
        L_0x002b:
            byte[] r0 = r6.getBytes()     // Catch:{ all -> 0x0062 }
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0050
            int r3 = r0.length     // Catch:{ all -> 0x0062 }
            if (r3 != 0) goto L_0x003a
            goto L_0x0050
        L_0x003a:
            r4.cert_id = r5     // Catch:{ all -> 0x0062 }
            r4.cipher_buf = r1     // Catch:{ all -> 0x0062 }
            byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x0062 }
            byte[] r5 = r4.decrypt((byte[]) r5, (byte[]) r0)     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x004a
            monitor-exit(r4)
            return r1
        L_0x004a:
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ all -> 0x0062 }
            monitor-exit(r4)
            return r5
        L_0x0050:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "base64 decode data fail, %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0062 }
            r3[r2] = r6     // Catch:{ all -> 0x0062 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r3)     // Catch:{ all -> 0x0062 }
            monitor-exit(r4)
            return r1
        L_0x005e:
            monitor-exit(r4)
            return r1
        L_0x0060:
            monitor-exit(r4)
            return r1
        L_0x0062:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.decrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String encrypt(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isNullOrEmpty(r3)     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 != 0) goto L_0x004a
            boolean r0 = r2.isNullOrEmpty(r4)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x000f
            goto L_0x004a
        L_0x000f:
            r2.setAndCheckDir(r3)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r2.cert_dir     // Catch:{ all -> 0x004c }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r2.publ_dir     // Catch:{ all -> 0x004c }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r2.priv_dir     // Catch:{ all -> 0x004c }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            r2.cert_id = r3     // Catch:{ all -> 0x004c }
            r2.plain_buf = r4     // Catch:{ all -> 0x004c }
            r2.cipher_buf = r1     // Catch:{ all -> 0x004c }
            boolean r3 = r2.encrypt()     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0046
            byte[] r3 = r2.cipher_buf     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0046
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "UTF-8"
            r4.<init>(r3, r0)     // Catch:{ Exception -> 0x0044 }
            r1 = r4
            goto L_0x0046
        L_0x0044:
            monitor-exit(r2)
            return r1
        L_0x0046:
            monitor-exit(r2)
            return r1
        L_0x0048:
            monitor-exit(r2)
            return r1
        L_0x004a:
            monitor-exit(r2)
            return r1
        L_0x004c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public native byte[] encryptWithPubkey(byte[] bArr, byte[] bArr2, boolean z);

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized byte[] genQrcode(java.lang.String r3, byte[] r4, java.lang.String r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isNullOrEmpty(r3)     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 != 0) goto L_0x0047
            boolean r0 = r2.isNullOrEmpty(r5)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0047
            int r0 = r4.length     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0014
            goto L_0x0047
        L_0x0014:
            r2.setAndCheckDir(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r2.cert_dir     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.publ_dir     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.priv_dir     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0030
            goto L_0x0045
        L_0x0030:
            r2.cert_id = r3     // Catch:{ all -> 0x0049 }
            r2.plain_buf2 = r4     // Catch:{ all -> 0x0049 }
            r2.cipher_buf = r1     // Catch:{ all -> 0x0049 }
            r2.token = r5     // Catch:{ all -> 0x0049 }
            boolean r3 = r2.genQrcode()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0043
            byte[] r3 = r2.cipher_buf     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0043
            r1 = r3
        L_0x0043:
            monitor-exit(r2)
            return r1
        L_0x0045:
            monitor-exit(r2)
            return r1
        L_0x0047:
            monitor-exit(r2)
            return r1
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.genQrcode(java.lang.String, byte[], java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String genUserSig(java.lang.String r3, byte[] r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isNullOrEmpty(r3)     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0047
            int r0 = r4.length     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0047
        L_0x000e:
            r2.setAndCheckDir(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r2.cert_dir     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.publ_dir     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.priv_dir     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            r2.cert_id = r3     // Catch:{ all -> 0x0049 }
            r2.sig_buf = r1     // Catch:{ all -> 0x0049 }
            boolean r3 = r2.usrSig(r4)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0043
            byte[] r3 = r2.sig_buf     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = "UTF-8"
            r4.<init>(r3, r0)     // Catch:{ Exception -> 0x0041 }
            r1 = r4
            goto L_0x0043
        L_0x0041:
            monitor-exit(r2)
            return r1
        L_0x0043:
            monitor-exit(r2)
            return r1
        L_0x0045:
            monitor-exit(r2)
            return r1
        L_0x0047:
            monitor-exit(r2)
            return r1
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.genUserSig(java.lang.String, byte[]):java.lang.String");
    }

    public synchronized String getCertApplyCSR(String str) {
        String str2;
        byte[] bArr;
        this.qq_id = str;
        str2 = null;
        this.csr_buf = null;
        if (genCertApplyCsr() && (bArr = this.csr_buf) != null) {
            try {
                str2 = new String(bArr, "ASCII");
            } catch (Exception unused) {
                return null;
            }
        }
        return str2;
    }

    public native int getLastError();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0037, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getToken(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isNullOrEmpty(r4)     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            r3.setAndCheckDir(r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r3.token_dir     // Catch:{ all -> 0x0038 }
            boolean r0 = r3.isNotEmptyDir(r0)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r3)
            return r1
        L_0x0017:
            r3.cert_id = r4     // Catch:{ all -> 0x0038 }
            int r4 = r3.getTokenCount()     // Catch:{ all -> 0x0038 }
            if (r4 > 0) goto L_0x0021
            monitor-exit(r3)
            return r1
        L_0x0021:
            boolean r4 = r3.getToken()     // Catch:{ all -> 0x0038 }
            if (r4 == 0) goto L_0x0036
            byte[] r4 = r3.token_buf     // Catch:{ all -> 0x0038 }
            if (r4 == 0) goto L_0x0036
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0034 }
            java.lang.String r2 = "UTF-8"
            r0.<init>(r4, r2)     // Catch:{ Exception -> 0x0034 }
            r1 = r0
            goto L_0x0036
        L_0x0034:
            monitor-exit(r3)
            return r1
        L_0x0036:
            monitor-exit(r3)
            return r1
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.getToken(java.lang.String):java.lang.String");
    }

    public synchronized int getTokenCount(String str) {
        if (isNullOrEmpty(str)) {
            return 0;
        }
        setDir(str);
        this.cert_id = str;
        return getTokenCount();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean importCert(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r4.length()     // Catch:{ all -> 0x0032 }
            if (r0 > 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x000a:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0017 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0017 }
            java.lang.String r1 = "ASCII"
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x0017 }
            r2.svr_cert = r0     // Catch:{ Exception -> 0x0017 }
        L_0x0017:
            r2.clearCert(r3)     // Catch:{ all -> 0x0032 }
            r2.setAndCheckDir(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r2.cert_dir     // Catch:{ all -> 0x0032 }
            r2.create_dir(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r2.priv_dir     // Catch:{ all -> 0x0032 }
            r2.create_dir(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = r2.publ_dir     // Catch:{ all -> 0x0032 }
            r2.create_dir(r3)     // Catch:{ all -> 0x0032 }
            boolean r3 = r2.importCert()     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)
            return r3
        L_0x0032:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.importCert(java.lang.String, java.lang.String):boolean");
    }

    public void init(Context context, EventListener eventListener2) {
        this.eventListener = eventListener2;
        this.mContext = context.getApplicationContext();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!BuildInfo.IS_FLAVOR_RED) {
            this.deskey = eventListener2.getUniqueID();
        } else {
            try {
                String str = TAG;
                Log.m105919d(str, "READ_PHONE_STATE.getSubscriberId, %s", Util.getStack());
                this.imsi = (String) C117292a.m165363i(telephonyManager, "com/tenpay/ndk/CertUtil", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;Lcom/tenpay/ndk/CertUtil$EventListener;)V", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
                Log.m105919d(str, "READ_PHONE_STATE.getSimSerialNumber", Util.getStack());
                this.iccid = telephonyManager.getSimSerialNumber();
                Log.m105919d(str, "READ_PHONE_STATE.getDeviceId, %s", Util.getStack());
                this.imei = (String) C117292a.m165363i(telephonyManager, "com/tenpay/ndk/CertUtil", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;Lcom/tenpay/ndk/CertUtil$EventListener;)V", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;");
                this.softid = Settings.System.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused) {
            }
            String uniqueID = eventListener2.getUniqueID();
            this.deskey = uniqueID;
            Log.m105919d(TAG, "init deskey %s imei: %s", uniqueID, this.imei);
        }
        this.imei = this.deskey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isCertExist(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isNullOrEmpty(r3)     // Catch:{ all -> 0x002f }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            r2.setDir(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r2.cert_dir     // Catch:{ all -> 0x002f }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r2.publ_dir     // Catch:{ all -> 0x002f }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r2.priv_dir     // Catch:{ all -> 0x002f }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            r2.cert_id = r3     // Catch:{ all -> 0x002f }
            boolean r3 = r2.isCertExist()     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return r3
        L_0x002d:
            monitor-exit(r2)
            return r1
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.isCertExist(java.lang.String):boolean");
    }

    public void setEventListener(EventListener eventListener2) {
        this.eventListener = eventListener2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean setTokens(java.lang.String r4, java.lang.String r5, boolean r6, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isNullOrEmpty(r4)     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 != 0) goto L_0x004b
            boolean r0 = r3.isNullOrEmpty(r5)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x000f
            goto L_0x004b
        L_0x000f:
            if (r6 == 0) goto L_0x001d
            if (r7 == 0) goto L_0x001b
            int r0 = r7.length()     // Catch:{ all -> 0x004d }
            r2 = 16
            if (r0 == r2) goto L_0x001d
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            r3.setAndCheckDir(r4)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r3.cert_dir     // Catch:{ all -> 0x004d }
            boolean r0 = r3.isValidDir(r0)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x002a
            monitor-exit(r3)
            return r1
        L_0x002a:
            java.lang.String r0 = r3.token_dir     // Catch:{ all -> 0x004d }
            boolean r0 = r3.isValidDir(r0)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0034
            monitor-exit(r3)
            return r1
        L_0x0034:
            if (r6 == 0) goto L_0x0037
            r1 = 1
        L_0x0037:
            r3.useSM4 = r1     // Catch:{ all -> 0x004d }
            r3.sm4Key = r7     // Catch:{ all -> 0x004d }
            r3.cert_id = r4     // Catch:{ all -> 0x004d }
            r3.token = r5     // Catch:{ all -> 0x004d }
            int r4 = r5.length()     // Catch:{ all -> 0x004d }
            r3.token_len = r4     // Catch:{ all -> 0x004d }
            boolean r4 = r3.setToken()     // Catch:{ all -> 0x004d }
            monitor-exit(r3)
            return r4
        L_0x004b:
            monitor-exit(r3)
            return r1
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.setTokens(java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    public synchronized String getCertApplyCSR(String str, int i) {
        String str2;
        byte[] bArr;
        this.qq_id = str;
        str2 = null;
        this.csr_buf = null;
        if (genCertApplyCsrNew(i) && (bArr = this.csr_buf) != null) {
            try {
                str2 = new String(bArr, "ASCII");
            } catch (Exception unused) {
                return null;
            }
        }
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0060, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String genUserSig(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isNullOrEmpty(r3)     // Catch:{ all -> 0x0063 }
            r1 = 0
            if (r0 != 0) goto L_0x0061
            boolean r0 = r2.isNullOrEmpty(r4)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0061
        L_0x000f:
            r2.setAndCheckDir(r3)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r2.cert_dir     // Catch:{ all -> 0x0063 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r2.publ_dir     // Catch:{ all -> 0x0063 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r2.priv_dir     // Catch:{ all -> 0x0063 }
            boolean r0 = r2.isNotEmptyDir(r0)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x002b
            goto L_0x005f
        L_0x002b:
            if (r3 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x005d
            int r0 = r3.length()     // Catch:{ all -> 0x0063 }
            if (r0 <= 0) goto L_0x005d
            int r0 = r4.length()     // Catch:{ all -> 0x0063 }
            if (r0 > 0) goto L_0x003c
            goto L_0x005d
        L_0x003c:
            r2.cert_id = r3     // Catch:{ all -> 0x0063 }
            r2.sig_raw_buf = r4     // Catch:{ all -> 0x0063 }
            r2.sig_buf = r1     // Catch:{ all -> 0x0063 }
            byte[] r3 = r4.getBytes()     // Catch:{ all -> 0x0063 }
            boolean r3 = r2.usrSig(r3)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x005b
            byte[] r3 = r2.sig_buf     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x005b
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = "UTF-8"
            r4.<init>(r3, r0)     // Catch:{ Exception -> 0x0059 }
            r1 = r4
            goto L_0x005b
        L_0x0059:
            monitor-exit(r2)
            return r1
        L_0x005b:
            monitor-exit(r2)
            return r1
        L_0x005d:
            monitor-exit(r2)
            return r1
        L_0x005f:
            monitor-exit(r2)
            return r1
        L_0x0061:
            monitor-exit(r2)
            return r1
        L_0x0063:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.CertUtil.genUserSig(java.lang.String, java.lang.String):java.lang.String");
    }
}
