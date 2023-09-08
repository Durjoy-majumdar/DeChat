package yf2;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.qqmail.p090ui.AttachDownloadPage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import p910lj.C76701a;
import yf2.C91444a;

/* renamed from: yf2.b */
public class C91446b extends C91444a {

    /* renamed from: c */
    public String f262173c;

    /* renamed from: d */
    public String f262174d;

    /* renamed from: e */
    public Bundle f262175e = null;

    /* renamed from: f */
    public C91444a.C91445a f262176f;

    /* renamed from: g */
    public int f262177g;

    public C91446b(String str, String str2, C91444a.C91445a aVar) {
        this.f262173c = str;
        this.f262174d = str2;
        this.f262176f = aVar;
    }

    /* renamed from: a */
    public Object mo57374a(Object[] objArr) {
        Bundle[] bundleArr = (Bundle[]) objArr;
        if (bundleArr.length > 0) {
            this.f262175e = bundleArr[0];
        }
        return mo125380g();
    }

    /* renamed from: c */
    public void mo57376c(Object obj) {
        Bundle bundle = (Bundle) obj;
        C91444a.C91445a aVar = this.f262176f;
        if (aVar != null) {
            AttachDownloadPage.C85374i iVar = (AttachDownloadPage.C85374i) aVar;
            if (bundle != null) {
                int i = bundle.getInt("result_http_code", -1);
                Log.m105925i("MicroMsg.AttachDownloadPage", "result http code %d", Integer.valueOf(i));
                if (i == 200) {
                    String str = AttachDownloadPage.this.f248748r;
                    C86013q1.m106435Q(str, AttachDownloadPage.this.mo118678J7() + ".temp", AttachDownloadPage.this.mo118678J7());
                    AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
                    attachDownloadPage.f248734A = 3;
                    C76701a.makeText((Context) attachDownloadPage, (CharSequence) AttachDownloadPage.this.getString(C0966R.string.c1n) + " : " + AttachDownloadPage.this.mo118680L7(false), 5000).show();
                    AttachDownloadPage.this.mo118682N7();
                    return;
                }
            }
            AttachDownloadPage attachDownloadPage2 = AttachDownloadPage.this;
            attachDownloadPage2.f248734A = 4;
            int i2 = attachDownloadPage2.f248736C;
            if (i2 < 5) {
                attachDownloadPage2.f248736C = i2 + 1;
                attachDownloadPage2.mo118677I7();
                return;
            }
            C76701a.makeText((Context) attachDownloadPage2, (int) C0966R.string.gl6, 0).show();
            AttachDownloadPage.this.mo118682N7();
        }
    }

    /* renamed from: e */
    public void mo119142e(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        C91444a.C91445a aVar = this.f262176f;
        if (aVar != null) {
            int intValue = numArr[0].intValue();
            AttachDownloadPage.C85374i iVar = (AttachDownloadPage.C85374i) aVar;
            Log.m105918d("MicroMsg.AttachDownloadPage", "download progress : " + intValue);
            AttachDownloadPage attachDownloadPage = AttachDownloadPage.this;
            int i = AttachDownloadPage.f248733D;
            long l = C86013q1.m106451l(attachDownloadPage.mo118680L7(true));
            Log.m105918d("MicroMsg.AttachDownloadPage", "cur download size:" + l);
            attachDownloadPage.f248739f.setProgress((int) ((100 * l) / attachDownloadPage.f248755y));
            attachDownloadPage.f248742i.setText(attachDownloadPage.getString(C0966R.string.gl9, new Object[]{Util.getSizeKB(l), Util.getSizeKB(attachDownloadPage.f248755y)}));
            if (attachDownloadPage.f248734A != 1 || attachDownloadPage.f248735B == 0) {
                attachDownloadPage.f248742i.setVisibility(8);
            } else {
                attachDownloadPage.f248742i.setVisibility(0);
            }
            AttachDownloadPage.this.f248734A = 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v10, types: [java.util.zip.InflaterInputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014b A[Catch:{ Exception -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0153 A[Catch:{ Exception -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158 A[Catch:{ Exception -> 0x014f }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo125380g() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "result_http_code"
            java.lang.String r3 = "MicroMsg.MailHttpDownloadFileTask"
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r5 = 0
            r6 = 0
            r7 = 1
            java.lang.String r0 = r1.f262173c     // Catch:{ all -> 0x0146 }
            com.tencent.mm.network.b0 r8 = com.tencent.p014mm.network.C81035d.m98963d(r0, r6)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "User-Agent"
            java.lang.String r9 = yf2.C15998c.f43047a     // Catch:{ all -> 0x013e }
            r8.mo112921e(r0, r9)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "Accept-Charset"
            java.lang.String r9 = "utf-8"
            r8.mo112921e(r0, r9)     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "Accept-Encoding"
            java.lang.String r9 = "gzip, deflate"
            r8.mo112921e(r0, r9)     // Catch:{ all -> 0x013e }
            android.os.Bundle r0 = r1.f262175e     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0044
            java.lang.String r9 = "param_cookie"
            java.lang.String r0 = r0.getString(r9)     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "cookie %s"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            r10[r5] = r0     // Catch:{ all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r10)     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "Cookie"
            r8.mo112921e(r9, r0)     // Catch:{ all -> 0x013e }
        L_0x0044:
            r8.mo112926h()     // Catch:{ all -> 0x013e }
            int r0 = r8.mo112916a()     // Catch:{ all -> 0x013e }
            r4.putInt(r2, r0)     // Catch:{ all -> 0x013e }
            r9 = 200(0xc8, float:2.8E-43)
            r10 = 2
            if (r0 == r9) goto L_0x0090
            java.lang.String r9 = "https get response code = %d"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013e }
            r11[r5] = r12     // Catch:{ all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r9, r11)     // Catch:{ all -> 0x013e }
            r9 = 302(0x12e, float:4.23E-43)
            if (r0 != r9) goto L_0x0090
            int r0 = r1.f262177g     // Catch:{ all -> 0x013e }
            if (r0 >= r10) goto L_0x0086
            int r0 = r0 + r7
            r1.f262177g = r0     // Catch:{ all -> 0x013e }
            java.lang.String r0 = "location"
            java.lang.String r0 = r8.mo112922f(r0)     // Catch:{ all -> 0x013e }
            r1.f262173c = r0     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "redirect to url: %s"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x013e }
            r10[r5] = r0     // Catch:{ all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r10)     // Catch:{ all -> 0x013e }
            android.os.Bundle r0 = r17.mo125380g()     // Catch:{ all -> 0x013e }
            r8.disconnect()     // Catch:{ Exception -> 0x014f }
            return r0
        L_0x0086:
            java.lang.String r0 = "redirect exceed max count"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x013e }
            r8.disconnect()     // Catch:{ Exception -> 0x014f }
            return r4
        L_0x0090:
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r8.mo112922f(r0)     // Catch:{ all -> 0x013e }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "gzip"
            java.net.HttpURLConnection r11 = r8.f238032a     // Catch:{ all -> 0x013e }
            java.lang.String r11 = r11.getContentEncoding()     // Catch:{ all -> 0x013e }
            boolean r9 = r9.equalsIgnoreCase(r11)     // Catch:{ all -> 0x013e }
            if (r9 == 0) goto L_0x00b2
            java.util.zip.GZIPInputStream r9 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x013e }
            java.io.InputStream r11 = r8.getInputStream()     // Catch:{ all -> 0x013e }
            r9.<init>(r11)     // Catch:{ all -> 0x013e }
            goto L_0x00da
        L_0x00b2:
            java.lang.String r9 = "deflate"
            java.net.HttpURLConnection r11 = r8.f238032a     // Catch:{ all -> 0x013e }
            java.lang.String r11 = r11.getContentEncoding()     // Catch:{ all -> 0x013e }
            boolean r9 = r9.equalsIgnoreCase(r11)     // Catch:{ all -> 0x013e }
            if (r9 == 0) goto L_0x00d1
            java.util.zip.InflaterInputStream r9 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x013e }
            java.io.InputStream r11 = r8.getInputStream()     // Catch:{ all -> 0x013e }
            java.util.zip.Inflater r12 = new java.util.zip.Inflater     // Catch:{ all -> 0x013e }
            r12.<init>(r7)     // Catch:{ all -> 0x013e }
            r13 = 512(0x200, float:7.175E-43)
            r9.<init>(r11, r12, r13)     // Catch:{ all -> 0x013e }
            goto L_0x00da
        L_0x00d1:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x013e }
            java.io.InputStream r11 = r8.getInputStream()     // Catch:{ all -> 0x013e }
            r9.<init>(r11)     // Catch:{ all -> 0x013e }
        L_0x00da:
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x013a }
            java.lang.String r12 = r1.f262174d     // Catch:{ all -> 0x013a }
            java.io.OutputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106429K(r12, r5)     // Catch:{ all -> 0x013a }
            r11.<init>(r12)     // Catch:{ all -> 0x013a }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0115 }
            int r12 = r9.read(r6)     // Catch:{ all -> 0x0115 }
            int r13 = r12 + 0
        L_0x00ef:
            if (r12 <= 0) goto L_0x011d
            r11.write(r6, r5, r12)     // Catch:{ all -> 0x0115 }
            yf2.a$a r12 = r1.f262176f     // Catch:{ all -> 0x0115 }
            if (r12 == 0) goto L_0x0117
            if (r0 <= 0) goto L_0x0117
            java.lang.Integer[] r12 = new java.lang.Integer[r7]     // Catch:{ all -> 0x0115 }
            r14 = 1120403456(0x42c80000, float:100.0)
            float r15 = (float) r13     // Catch:{ all -> 0x0115 }
            float r15 = r15 * r14
            float r14 = (float) r0     // Catch:{ all -> 0x0115 }
            float r15 = r15 / r14
            int r14 = (int) r15     // Catch:{ all -> 0x0115 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0115 }
            r12[r5] = r14     // Catch:{ all -> 0x0115 }
            com.tencent.mm.sdk.platformtools.MMHandler r14 = r1.f249537b     // Catch:{ all -> 0x0115 }
            com.tencent.mm.pluginsdk.model.y0 r15 = new com.tencent.mm.pluginsdk.model.y0     // Catch:{ all -> 0x0115 }
            r15.<init>(r1, r12)     // Catch:{ all -> 0x0115 }
            r14.post(r15)     // Catch:{ all -> 0x0115 }
            goto L_0x0117
        L_0x0115:
            r0 = move-exception
            goto L_0x013c
        L_0x0117:
            int r12 = r9.read(r6)     // Catch:{ all -> 0x0115 }
            int r13 = r13 + r12
            goto L_0x00ef
        L_0x011d:
            java.lang.String r6 = "fileLength %d, totalRead %d"
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0115 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0115 }
            r10[r5] = r0     // Catch:{ all -> 0x0115 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0115 }
            r10[r7] = r0     // Catch:{ all -> 0x0115 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r10)     // Catch:{ all -> 0x0115 }
            r8.disconnect()     // Catch:{ Exception -> 0x014f }
            r9.close()     // Catch:{ Exception -> 0x014f }
            r11.close()     // Catch:{ Exception -> 0x014f }
            goto L_0x016d
        L_0x013a:
            r0 = move-exception
            r11 = r6
        L_0x013c:
            r6 = r9
            goto L_0x0140
        L_0x013e:
            r0 = move-exception
            r11 = r6
        L_0x0140:
            r16 = r8
            r8 = r6
            r6 = r16
            goto L_0x0149
        L_0x0146:
            r0 = move-exception
            r8 = r6
            r11 = r8
        L_0x0149:
            if (r6 == 0) goto L_0x0151
            r6.disconnect()     // Catch:{ Exception -> 0x014f }
            goto L_0x0151
        L_0x014f:
            r0 = move-exception
            goto L_0x015c
        L_0x0151:
            if (r8 == 0) goto L_0x0156
            r8.close()     // Catch:{ Exception -> 0x014f }
        L_0x0156:
            if (r11 == 0) goto L_0x015b
            r11.close()     // Catch:{ Exception -> 0x014f }
        L_0x015b:
            throw r0     // Catch:{ Exception -> 0x014f }
        L_0x015c:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r6[r5] = r0
            java.lang.String r0 = "http download file, exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r6)
            r0 = -1
            r4.putInt(r2, r0)
        L_0x016d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yf2.C91446b.mo125380g():android.os.Bundle");
    }
}
