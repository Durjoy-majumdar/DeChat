package lv0;

import java.util.Map;
import yu0.C102908a;

/* renamed from: lv0.a */
public class C99648a extends C102908a {

    /* renamed from: c */
    public static C99648a f292056c;

    /* renamed from: b */
    public Map<String, C99649a> f292057b = null;

    public C99648a() {
        mo139026c();
    }

    /* renamed from: b */
    public void mo17656b() {
        f292056c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9 A[SYNTHETIC, Splitter:B:53:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be A[Catch:{ Exception -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9 A[SYNTHETIC, Splitter:B:63:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de A[Catch:{ Exception -> 0x00e1 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139026c() {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.BakOldEmojiCovertMap"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r10.f292057b = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.AssetManager r1 = r1.getAssets()
            r2 = 0
            r3 = 0
            java.lang.String r4 = "emojiconf"
            java.io.InputStream r1 = r1.open(r4)     // Catch:{ IOException -> 0x00ad, all -> 0x00aa }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a8 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r6 = "utf-8"
            r5.<init>(r1, r6)     // Catch:{ IOException -> 0x00a8 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00a8 }
            r2 = 0
        L_0x0027:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r5 == 0) goto L_0x0095
            java.lang.String r6 = "icon_"
            boolean r5 = r5.contains(r6)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r5 == 0) goto L_0x0027
            lv0.a$a r5 = new lv0.a$a     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r5.<init>()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
        L_0x003a:
            java.lang.String r6 = r4.readLine()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r6 == 0) goto L_0x0092
            java.lang.String r7 = "img"
            boolean r7 = r6.contains(r7)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r7 == 0) goto L_0x0049
            goto L_0x0092
        L_0x0049:
            java.lang.String r7 = "="
            int r7 = r6.indexOf(r7)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            int r7 = r7 + 1
            int r8 = r6.length()     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r7 < r8) goto L_0x0058
            goto L_0x0092
        L_0x0058:
            java.lang.String r7 = r6.substring(r7)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            java.lang.String r8 = "iphone"
            boolean r8 = r6.startsWith(r8)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r8 == 0) goto L_0x0068
            r5.f292059b = r7     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x008a
        L_0x0068:
            java.lang.String r8 = "android"
            boolean r8 = r6.startsWith(r8)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r8 == 0) goto L_0x0073
            r5.f292058a = r7     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x008a
        L_0x0073:
            java.lang.String r8 = "s60v3"
            boolean r8 = r6.startsWith(r8)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r8 == 0) goto L_0x007f
            r5.f292060c = r7     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x008a
        L_0x007f:
            java.lang.String r8 = "s60v5"
            boolean r6 = r6.startsWith(r8)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            if (r6 == 0) goto L_0x008a
            r5.f292061d = r7     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
        L_0x008a:
            java.util.Map<java.lang.String, lv0.a$a> r6 = r10.f292057b     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            java.lang.String r7 = r5.f292058a     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            r6.put(r7, r5)     // Catch:{ IOException -> 0x00a1, all -> 0x009e }
            goto L_0x003a
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x0027
        L_0x0095:
            r4.close()     // Catch:{ Exception -> 0x00c2 }
            if (r1 == 0) goto L_0x00c2
            r1.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00c2
        L_0x009e:
            r0 = move-exception
            r2 = r4
            goto L_0x00d7
        L_0x00a1:
            r5 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L_0x00b0
        L_0x00a6:
            r0 = move-exception
            goto L_0x00d7
        L_0x00a8:
            r5 = move-exception
            goto L_0x00af
        L_0x00aa:
            r0 = move-exception
            r1 = r2
            goto L_0x00d7
        L_0x00ad:
            r5 = move-exception
            r1 = r2
        L_0x00af:
            r4 = 0
        L_0x00b0:
            java.lang.String r6 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r6, r3)     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x00bc
            r2.close()     // Catch:{ Exception -> 0x00c1 }
        L_0x00bc:
            if (r1 == 0) goto L_0x00c1
            r1.close()     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            r2 = r4
        L_0x00c2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "id "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            return
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
            r2.close()     // Catch:{ Exception -> 0x00e1 }
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            r1.close()     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lv0.C99648a.mo139026c():void");
    }

    /* renamed from: lv0.a$a */
    public static class C99649a {

        /* renamed from: a */
        public String f292058a;

        /* renamed from: b */
        public String f292059b;

        /* renamed from: c */
        public String f292060c;

        /* renamed from: d */
        public String f292061d;

        public C99649a() {
            this.f292058a = "";
            this.f292059b = "";
            this.f292060c = "";
            this.f292061d = "";
        }

        public String toString() {
            return this.f292058a + " " + this.f292059b + " " + this.f292060c + " " + this.f292061d;
        }

        public C99649a(String str, String str2, String str3, String str4) {
            this.f292058a = str;
            this.f292059b = str2;
            this.f292060c = str3;
            this.f292061d = str4;
        }
    }
}
