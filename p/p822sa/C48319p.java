package p822sa;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sa.p */
public class C48319p {

    /* renamed from: a */
    public C48323t f129377a;

    /* renamed from: b */
    public C48318o f129378b;

    /* renamed from: c */
    public C48309f f129379c;

    /* renamed from: d */
    public C48320q f129380d;

    /* renamed from: e */
    public ConcurrentHashMap<String, C48315l> f129381e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public ConcurrentHashMap<String, C48313j> f129382f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public ConcurrentHashMap<Integer, C48311h> f129383g = new ConcurrentHashMap<>();

    public C48319p(C48323t tVar) {
        new AtomicInteger(1);
        this.f129377a = tVar;
        this.f129378b = new C48318o(this);
        this.f129379c = new C48309f(this.f129377a);
        this.f129380d = new C48321r(this);
        this.f129377a.addJavascriptInterface(new C48322s(this.f129378b), "_luggageBridgeNative");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[SYNTHETIC, Splitter:B:24:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A[SYNTHETIC, Splitter:B:29:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73016a() {
        /*
            r10 = this;
            java.lang.String r0 = "injectJavascript: close error, %s"
            java.lang.String r1 = "LuggageBridge"
            r2 = 4096(0x1000, float:5.74E-42)
            char[] r2 = new char[r2]
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004e }
            sa.t r8 = r10.f129377a     // Catch:{ Exception -> 0x004e }
            android.content.Context r8 = r8.getContext()     // Catch:{ Exception -> 0x004e }
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ Exception -> 0x004e }
            java.lang.String r9 = "LuggageBridge.js"
            java.io.InputStream r8 = r8.open(r9)     // Catch:{ Exception -> 0x004e }
            r7.<init>(r8)     // Catch:{ Exception -> 0x004e }
        L_0x0025:
            r8 = -1
            int r9 = r7.read(r2)     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            if (r8 == r9) goto L_0x0030
            r3.write(r2, r6, r9)     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            goto L_0x0025
        L_0x0030:
            r7.close()     // Catch:{ Exception -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r5)
        L_0x003c:
            sa.t r0 = r10.f129377a
            java.lang.String r1 = r3.toString()
            r0.evaluateJavascript(r1, r4)
            return
        L_0x0046:
            r2 = move-exception
            r4 = r7
            goto L_0x0067
        L_0x0049:
            r2 = move-exception
            r4 = r7
            goto L_0x004f
        L_0x004c:
            r2 = move-exception
            goto L_0x0067
        L_0x004e:
            r2 = move-exception
        L_0x004f:
            java.lang.String r3 = "injectJavascript: read error, %s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x004c }
            r7[r6] = r2     // Catch:{ all -> 0x004c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r7)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0066
            r4.close()     // Catch:{ Exception -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)
        L_0x0066:
            return
        L_0x0067:
            if (r4 == 0) goto L_0x0075
            r4.close()     // Catch:{ Exception -> 0x006d }
            goto L_0x0075
        L_0x006d:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
        L_0x0075:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p822sa.C48319p.mo73016a():void");
    }
}
