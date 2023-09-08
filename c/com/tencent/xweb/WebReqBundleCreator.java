package com.tencent.xweb;

public class WebReqBundleCreator {
    private final WebResourceRequest request;

    public WebReqBundleCreator(WebResourceRequest webResourceRequest) {
        this.request = webResourceRequest;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = r3.request.getRequestHeaders().get("Accept");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle getBundle() {
        /*
            r3 = this;
            com.tencent.xweb.WebResourceRequest r0 = r3.request
            r1 = 1
            if (r0 == 0) goto L_0x0039
            java.util.Map r0 = r0.getRequestHeaders()
            if (r0 == 0) goto L_0x0039
            com.tencent.xweb.WebResourceRequest r0 = r3.request
            boolean r0 = r0.isForMainFrame()
            if (r0 != 0) goto L_0x0039
            com.tencent.xweb.WebResourceRequest r0 = r3.request
            java.util.Map r0 = r0.getRequestHeaders()
            java.lang.String r2 = "Accept"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0039
            com.tencent.xweb.WebResourceRequest r0 = r3.request
            java.util.Map r0 = r0.getRequestHeaders()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = "text/html"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0047
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "resourceType"
            r0.putInt(r2, r1)
            return r0
        L_0x0047:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.WebReqBundleCreator.getBundle():android.os.Bundle");
    }
}
