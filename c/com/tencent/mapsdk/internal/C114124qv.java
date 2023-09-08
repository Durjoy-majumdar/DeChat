package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mapsdk.internal.qv */
public final class C114124qv {

    /* renamed from: c */
    private static final String f341607c = "https://confinfo.map.qq.com/confinfo?";

    /* renamed from: a */
    public Context f341608a;

    /* renamed from: b */
    public WeakReference<C114126a> f341609b;

    /* renamed from: com.tencent.mapsdk.internal.qv$a */
    public interface C114126a {
        /* renamed from: c */
        void mo172743c();
    }

    /* renamed from: com.tencent.mapsdk.internal.qv$b */
    public class C114127b extends AsyncTask<Context, Void, Void> {
        private C114127b() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(android.content.Context... r9) {
            /*
                r8 = this;
                int r0 = com.tencent.mapsdk.internal.C114121qs.m159235a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "https://confinfo.map.qq.com/confinfo?"
                r1.append(r2)
                java.lang.String r2 = "apiKey="
                r1.append(r2)
                r2 = 0
                if (r9 == 0) goto L_0x0026
                int r3 = r9.length
                if (r3 <= 0) goto L_0x0026
                r9 = r9[r2]
                android.content.Context r9 = r9.getApplicationContext()
                java.lang.String r9 = com.tencent.mapsdk.internal.C114124qv.m159248a((android.content.Context) r9)
                r1.append(r9)
            L_0x0026:
                com.tencent.map.tools.net.NetManager r9 = com.tencent.map.tools.net.NetManager.getInstance()
                com.tencent.map.tools.net.NetRequest$NetRequestBuilder r9 = r9.builder()
                java.lang.String r1 = r1.toString()
                com.tencent.map.tools.net.NetRequest$NetRequestBuilder r9 = r9.url(r1)
                r1 = 3000(0xbb8, float:4.204E-42)
                com.tencent.map.tools.net.NetRequest$NetRequestBuilder r9 = r9.timeOut(r1)
                com.tencent.map.tools.net.NetResponse r9 = r9.doStream()
                r1 = 1
                r3 = 0
                java.io.InputStream r4 = r9.dataStream     // Catch:{ all -> 0x00ba }
                byte[] r5 = com.tencent.mapsdk.internal.C113886kg.m157522b((java.io.InputStream) r4)     // Catch:{ all -> 0x00bb }
                if (r5 == 0) goto L_0x0090
                int r6 = r5.length     // Catch:{ all -> 0x00bb }
                if (r6 != 0) goto L_0x004e
                goto L_0x0090
            L_0x004e:
                java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00bb }
                r6.<init>(r5)     // Catch:{ all -> 0x00bb }
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00bb }
                r5.<init>(r6)     // Catch:{ all -> 0x00bb }
                java.lang.String r6 = "error"
                r7 = -1
                int r6 = r5.optInt(r6, r7)     // Catch:{ all -> 0x00bb }
                if (r6 != 0) goto L_0x006f
                java.lang.String r6 = "info"
                org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x00bb }
                if (r5 == 0) goto L_0x006f
                java.lang.String r6 = "scenic"
                int r0 = r5.optInt(r6, r0)     // Catch:{ all -> 0x00bb }
            L_0x006f:
                if (r4 == 0) goto L_0x0074
                com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r4)
            L_0x0074:
                java.io.InputStream r9 = r9.dataStream
                com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r9)
                int r9 = com.tencent.mapsdk.internal.C114121qs.m159235a()
                if (r0 == r9) goto L_0x0080
                r2 = 1
            L_0x0080:
                if (r2 == 0) goto L_0x00e6
                com.tencent.mapsdk.internal.qv r9 = com.tencent.mapsdk.internal.C114124qv.this
                android.content.Context r9 = r9.f341608a
                if (r9 == 0) goto L_0x00e6
                com.tencent.mapsdk.internal.C114121qs.m159237a(r9, r0)
                com.tencent.mapsdk.internal.qv r9 = com.tencent.mapsdk.internal.C114124qv.this
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qv$a> r9 = r9.f341609b
                goto L_0x00dd
            L_0x0090:
                if (r4 == 0) goto L_0x0095
                com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r4)
            L_0x0095:
                java.io.InputStream r9 = r9.dataStream
                com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r9)
                int r9 = com.tencent.mapsdk.internal.C114121qs.m159235a()
                if (r0 == r9) goto L_0x00a1
                r2 = 1
            L_0x00a1:
                if (r2 == 0) goto L_0x00b9
                com.tencent.mapsdk.internal.qv r9 = com.tencent.mapsdk.internal.C114124qv.this
                android.content.Context r9 = r9.f341608a
                if (r9 == 0) goto L_0x00b9
                com.tencent.mapsdk.internal.C114121qs.m159237a(r9, r0)
                com.tencent.mapsdk.internal.qv r9 = com.tencent.mapsdk.internal.C114124qv.this
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qv$a> r9 = r9.f341609b
                java.lang.Object r9 = r9.get()
                com.tencent.mapsdk.internal.qv$a r9 = (com.tencent.mapsdk.internal.C114124qv.C114126a) r9
                r9.mo172743c()
            L_0x00b9:
                return r3
            L_0x00ba:
                r4 = r3
            L_0x00bb:
                if (r4 == 0) goto L_0x00c0
                com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r4)
            L_0x00c0:
                if (r9 == 0) goto L_0x00c7
                java.io.InputStream r9 = r9.dataStream
                com.tencent.mapsdk.internal.C113886kg.m157515a((java.io.Closeable) r9)
            L_0x00c7:
                int r9 = com.tencent.mapsdk.internal.C114121qs.m159235a()
                if (r0 == r9) goto L_0x00ce
                r2 = 1
            L_0x00ce:
                if (r2 == 0) goto L_0x00e6
                com.tencent.mapsdk.internal.qv r9 = com.tencent.mapsdk.internal.C114124qv.this
                android.content.Context r9 = r9.f341608a
                if (r9 == 0) goto L_0x00e6
                com.tencent.mapsdk.internal.C114121qs.m159237a(r9, r0)
                com.tencent.mapsdk.internal.qv r9 = com.tencent.mapsdk.internal.C114124qv.this
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qv$a> r9 = r9.f341609b
            L_0x00dd:
                java.lang.Object r9 = r9.get()
                com.tencent.mapsdk.internal.qv$a r9 = (com.tencent.mapsdk.internal.C114124qv.C114126a) r9
                r9.mo172743c()
            L_0x00e6:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114124qv.C114127b.doInBackground(android.content.Context[]):java.lang.Void");
        }

        public /* synthetic */ C114127b(C114124qv qvVar, byte b) {
            this();
        }
    }

    public C114124qv(Context context, C114126a aVar) {
        this.f341608a = context;
        this.f341609b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private void m159249a() {
        new C114127b(this, (byte) 0).execute(new Context[]{this.f341608a});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.optJSONObject("info");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m159246a(java.lang.String r2, int r3) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            java.lang.String r2 = "error"
            r1 = -1
            int r2 = r0.optInt(r2, r1)
            if (r2 != 0) goto L_0x001c
            java.lang.String r2 = "info"
            org.json.JSONObject r2 = r0.optJSONObject(r2)
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "scenic"
            int r3 = r2.optInt(r0, r3)
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114124qv.m159246a(java.lang.String, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.optJSONObject("info");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int m159250b(java.lang.String r2, int r3) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            java.lang.String r2 = "error"
            r1 = -1
            int r2 = r0.optInt(r2, r1)
            if (r2 != 0) goto L_0x001c
            java.lang.String r2 = "info"
            org.json.JSONObject r2 = r0.optJSONObject(r2)
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "scenic"
            int r3 = r2.optInt(r0, r3)
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114124qv.m159250b(java.lang.String, int):int");
    }

    /* renamed from: a */
    public static String m159248a(Context context) {
        Bundle bundle;
        if (context == null) {
            return "";
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return "";
        }
        return bundle.getString("TencentMapSDK");
    }
}
