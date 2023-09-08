package com.tencent.p014mm.plugin.webview.model;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.webview.model.q1 */
public class C43725q1 {

    /* renamed from: a */
    public List<Integer> f118177a = new ArrayList();

    /* renamed from: b */
    public final Set<String> f118178b;

    /* renamed from: c */
    public String f118179c = null;

    public C43725q1(Context context) {
        new HashMap();
        this.f118178b = new HashSet();
    }

    /* renamed from: a */
    public void mo68025a(int i) {
        if (i <= 0 || i > 65535) {
            Log.m105921e("MicroMsg.WebViewResourceInterrupter", "err port = %d", Integer.valueOf(i));
        }
        if (!((ArrayList) this.f118177a).contains(Integer.valueOf(i))) {
            ((ArrayList) this.f118177a).add(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        if (r13 == false) goto L_0x012f;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0161 */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0196 A[Catch:{ all -> 0x01d4 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.xweb.WebResourceResponse mo68026b(java.lang.String r10, com.tencent.xweb.WebResourceRequest r11, boolean r12, com.tencent.p014mm.plugin.webview.stub.C43791l r13) {
        /*
            r9 = this;
            r10 = 0
            if (r11 == 0) goto L_0x000c
            android.net.Uri r11 = r11.getUrl()
            java.lang.String r11 = r11.toString()
            goto L_0x000d
        L_0x000c:
            r11 = r10
        L_0x000d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r1 = "MicroMsg.WebViewResourceInterrupter"
            if (r0 == 0) goto L_0x001c
            java.lang.String r11 = "url is null, return "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
            return r10
        L_0x001c:
            java.lang.String r0 = "weixin://resourceid/"
            boolean r0 = r11.startsWith(r0)
            java.lang.String r2 = "utf-8"
            java.lang.String r3 = "image/*"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.String r12 = "it is wechat resource is, should intercept"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            java.lang.String r11 = r13.mo68098J8(r11, r4)     // Catch:{ Exception -> 0x005e }
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r11)     // Catch:{ Exception -> 0x005e }
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x005e }
            r13.<init>()     // Catch:{ Exception -> 0x005e }
            int r11 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r11)     // Catch:{ Exception -> 0x005e }
            float r11 = (float) r11     // Catch:{ Exception -> 0x005e }
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r12, r11)     // Catch:{ Exception -> 0x005e }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x005e }
            r0 = 90
            r11.compress(r12, r0, r13)     // Catch:{ Exception -> 0x005e }
            com.tencent.xweb.WebResourceResponse r11 = new com.tencent.xweb.WebResourceResponse     // Catch:{ Exception -> 0x005e }
            java.io.ByteArrayInputStream r12 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x005e }
            byte[] r13 = r13.toByteArray()     // Catch:{ Exception -> 0x005e }
            r12.<init>(r13)     // Catch:{ Exception -> 0x005e }
            r11.<init>(r3, r2, r12)     // Catch:{ Exception -> 0x005e }
            return r11
        L_0x005e:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r11 = r11.getMessage()
            r12[r6] = r11
            java.lang.String r11 = "get webview jssdk resource failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r11, r12)
            return r10
        L_0x006d:
            if (r12 == 0) goto L_0x0148
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 != 0) goto L_0x012f
            boolean r12 = com.tencent.p014mm.plugin.webview.luggage.util.C6013c.m5892d(r11)
            if (r12 != 0) goto L_0x007d
            goto L_0x012f
        L_0x007d:
            java.lang.String r12 = r11.toLowerCase()
            java.lang.String r13 = "localhost"
            boolean r13 = r12.contains(r13)
            if (r13 != 0) goto L_0x00c2
            java.lang.String r13 = "127.0.0.1"
            boolean r13 = r12.contains(r13)
            if (r13 != 0) goto L_0x00c2
            java.lang.String r13 = "::1"
            boolean r13 = r12.contains(r13)
            if (r13 != 0) goto L_0x00c2
            android.net.Uri r13 = android.net.Uri.parse(r12)     // Catch:{ Exception -> 0x00be }
            java.lang.String r13 = r13.getHost()     // Catch:{ Exception -> 0x00be }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv4Address(r13)     // Catch:{ Exception -> 0x00be }
            if (r0 != 0) goto L_0x00ad
            boolean r13 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv6Address(r13)     // Catch:{ Exception -> 0x00be }
            if (r13 == 0) goto L_0x00bf
        L_0x00ad:
            java.lang.String r13 = r9.f118179c     // Catch:{ Exception -> 0x00be }
            if (r13 != 0) goto L_0x00b7
            java.lang.String r13 = p225rc.C89921j.m112462a()     // Catch:{ Exception -> 0x00be }
            r9.f118179c = r13     // Catch:{ Exception -> 0x00be }
        L_0x00b7:
            java.lang.String r13 = r9.f118179c     // Catch:{ Exception -> 0x00be }
            boolean r13 = r12.contains(r13)     // Catch:{ Exception -> 0x00be }
            goto L_0x00c0
        L_0x00be:
        L_0x00bf:
            r13 = 0
        L_0x00c0:
            if (r13 == 0) goto L_0x012f
        L_0x00c2:
            java.util.List<java.lang.Integer> r13 = r9.f118177a
            if (r13 == 0) goto L_0x0124
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0124
            java.util.List<java.lang.Integer> r13 = r9.f118177a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x00d6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "localhost:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0114
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "127.0.0.1:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            boolean r7 = r12.contains(r7)
            if (r7 == 0) goto L_0x00d6
        L_0x0114:
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r13[r6] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r13[r5] = r12
            java.lang.String r12 = "int white list : %s, port = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r13)
            goto L_0x012f
        L_0x0124:
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r6] = r12
            java.lang.String r12 = "not allowed to load local url : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r12, r13)
            r12 = 1
            goto L_0x0130
        L_0x012f:
            r12 = 0
        L_0x0130:
            if (r12 == 0) goto L_0x0148
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r6] = r11
            java.lang.String r11 = "local url, interrupt request : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105923f(r1, r11, r10)
            com.tencent.xweb.WebResourceResponse r10 = new com.tencent.xweb.WebResourceResponse
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream
            byte[] r12 = new byte[r6]
            r11.<init>(r12)
            r10.<init>(r3, r2, r11)
            return r10
        L_0x0148:
            boolean r12 = com.tencent.p014mm.plugin.webview.p128ui.tools.C30608t.m39142c()     // Catch:{ all -> 0x01d4 }
            if (r12 == 0) goto L_0x01d4
            java.lang.String r12 = ""
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d4 }
            r0 = 8
            r13.<init>(r0)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = "±¿¥®¨¨¸«¢°´®¬¦ö"
            java.lang.String r0 = ce2.C28545b.m38262a(r0)     // Catch:{ all -> 0x0161 }
            r13.append(r0)     // Catch:{ all -> 0x0161 }
        L_0x0161:
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01d4 }
            java.lang.String r12 = com.tencent.p014mm.plugin.webview.p128ui.tools.C30608t.m39140a(r13, r12)     // Catch:{ all -> 0x01d4 }
            android.net.Uri r13 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = r13.getHost()     // Catch:{ all -> 0x01d4 }
            if (r12 == 0) goto L_0x01d4
            if (r0 == 0) goto L_0x01d4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d4 }
            r2.<init>()     // Catch:{ all -> 0x01d4 }
            r2.append(r0)     // Catch:{ all -> 0x01d4 }
            tc2.g r0 = tc2.C118418g.INSTANCE     // Catch:{ all -> 0x01d4 }
            java.lang.String r3 = "\u0003&+21"
            java.lang.String r0 = r0.Z10(r3)     // Catch:{ all -> 0x01d4 }
            r2.append(r0)     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01d4 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)     // Catch:{ all -> 0x01d4 }
            boolean r12 = r12.equals(r0)     // Catch:{ all -> 0x01d4 }
            if (r12 == 0) goto L_0x01d4
            java.util.Set r12 = r13.getQueryParameterNames()     // Catch:{ all -> 0x01d4 }
            if (r12 == 0) goto L_0x01b5
            java.lang.Class<android.content.pm.ApplicationInfo> r13 = android.content.pm.ApplicationInfo.class
            java.lang.String r13 = r13.getSimpleName()     // Catch:{ all -> 0x01d4 }
            r0 = 3
            java.lang.String r13 = r13.substring(r4, r0)     // Catch:{ all -> 0x01d4 }
            boolean r12 = r12.contains(r13)     // Catch:{ all -> 0x01d4 }
            if (r12 == 0) goto L_0x01b5
            java.lang.String r12 = "[tomys] wv, something wicked this way comes."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)     // Catch:{ all -> 0x01d4 }
            com.tencent.p014mm.plugin.webview.p128ui.tools.C6599u.m6905b(r11)     // Catch:{ all -> 0x01d4 }
        L_0x01b5:
            boolean r12 = com.tencent.p014mm.plugin.webview.p128ui.tools.C30608t.m39141b()     // Catch:{ all -> 0x01d4 }
            if (r12 == 0) goto L_0x01d4
            java.lang.String r12 = "[tomys] wv, block is enabled."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)     // Catch:{ all -> 0x01d4 }
            com.tencent.p014mm.plugin.webview.p128ui.tools.C6599u.m6904a(r11)     // Catch:{ all -> 0x01d4 }
            com.tencent.xweb.WebResourceResponse r11 = new com.tencent.xweb.WebResourceResponse     // Catch:{ all -> 0x01d4 }
            java.lang.String r12 = "text/plain"
            java.lang.String r13 = "UTF-8"
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x01d4 }
            byte[] r1 = new byte[r6]     // Catch:{ all -> 0x01d4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01d4 }
            r11.<init>(r12, r13, r0)     // Catch:{ all -> 0x01d4 }
            return r11
        L_0x01d4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.model.C43725q1.mo68026b(java.lang.String, com.tencent.xweb.WebResourceRequest, boolean, com.tencent.mm.plugin.webview.stub.l):com.tencent.xweb.WebResourceResponse");
    }
}
