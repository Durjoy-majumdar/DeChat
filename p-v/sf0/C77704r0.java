package sf0;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sf0.r0 */
public class C77704r0 {

    /* renamed from: sf0.r0$c */
    public static class C77705c {

        /* renamed from: a */
        public final String f226485a;

        /* renamed from: b */
        public final int f226486b;

        /* renamed from: c */
        public final String f226487c;

        public C77705c(String str, int i, String str2) {
            this.f226485a = str;
            this.f226486b = i;
            this.f226487c = str2;
        }
    }

    /* renamed from: sf0.r0$a */
    public static class C77706a {
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009e, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.YYBMarketVerify", r7, "", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a5, code lost:
            if (r2 == null) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ab, code lost:
            if (r2 != null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ad, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b0, code lost:
            throw r7;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0083 A[SYNTHETIC, Splitter:B:40:0x0083] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m93722a(android.content.Context r7, java.lang.String r8) {
            /*
                java.lang.String r0 = ""
                java.lang.String r1 = "MicroMsg.YYBMarketVerify"
                r2 = 0
                r3 = 0
                android.content.Context r8 = r7.createPackageContext(r8, r3)     // Catch:{ NameNotFoundException -> 0x000b }
                goto L_0x0012
            L_0x000b:
                r8 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r0, r4)
                r8 = r2
            L_0x0012:
                if (r8 != 0) goto L_0x0015
                return r3
            L_0x0015:
                android.content.res.AssetManager r4 = r8.getAssets()
                android.content.res.Resources r5 = new android.content.res.Resources
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                r5.<init>(r4, r7, r2)
                android.content.res.XmlResourceParser r2 = m93723b(r8, r4)     // Catch:{ IOException -> 0x0077 }
                if (r2 != 0) goto L_0x0032
                if (r2 == 0) goto L_0x0031
                r2.close()
            L_0x0031:
                return r3
            L_0x0032:
                int r7 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x0037 }
                goto L_0x003e
            L_0x0037:
                r7 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0077 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r8)     // Catch:{ IOException -> 0x0077 }
                r7 = 0
            L_0x003e:
                r8 = 1
                if (r7 == r8) goto L_0x00a7
                r4 = 2
                if (r7 == r4) goto L_0x0045
                goto L_0x008b
            L_0x0045:
                java.lang.String r4 = r2.getName()     // Catch:{ IOException -> 0x0077 }
                boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x0077 }
                if (r6 != 0) goto L_0x008b
                java.lang.String r6 = "manifest"
                boolean r4 = r4.equals(r6)     // Catch:{ IOException -> 0x0077 }
                if (r4 == 0) goto L_0x008b
                java.lang.String r7 = "versionCode"
                java.lang.String r4 = "http://schemas.android.com/apk/res/android"
                java.lang.String r7 = r2.getAttributeValue(r4, r7)     // Catch:{ IOException -> 0x0077 }
                if (r7 == 0) goto L_0x0079
                java.lang.String r4 = "@"
                boolean r4 = r7.startsWith(r4)     // Catch:{ IOException -> 0x0077 }
                if (r4 == 0) goto L_0x0079
                java.lang.String r8 = r7.substring(r8)     // Catch:{ NotFoundException | NumberFormatException -> 0x0079 }
                int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NotFoundException | NumberFormatException -> 0x0079 }
                java.lang.String r7 = r5.getString(r8)     // Catch:{ NotFoundException | NumberFormatException -> 0x0079 }
                goto L_0x0079
            L_0x0077:
                r7 = move-exception
                goto L_0x00a0
            L_0x0079:
                boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0077 }
                if (r8 == 0) goto L_0x0083
                r2.close()
                return r3
            L_0x0083:
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r3)     // Catch:{ IOException -> 0x0077 }
                r2.close()
                return r7
            L_0x008b:
                int r7 = r2.nextToken()     // Catch:{ XmlPullParserException -> 0x0097, IOException -> 0x0090 }
                goto L_0x003e
            L_0x0090:
                r8 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0077 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r0, r4)     // Catch:{ IOException -> 0x0077 }
                goto L_0x003e
            L_0x0097:
                r8 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0077 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r0, r4)     // Catch:{ IOException -> 0x0077 }
                goto L_0x003e
            L_0x009e:
                r7 = move-exception
                goto L_0x00ab
            L_0x00a0:
                java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x009e }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r8)     // Catch:{ all -> 0x009e }
                if (r2 == 0) goto L_0x00aa
            L_0x00a7:
                r2.close()
            L_0x00aa:
                return r3
            L_0x00ab:
                if (r2 == 0) goto L_0x00b0
                r2.close()
            L_0x00b0:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sf0.C77704r0.C77706a.m93722a(android.content.Context, java.lang.String):int");
        }

        /* renamed from: b */
        public static XmlResourceParser m93723b(Context context, AssetManager assetManager) {
            try {
                String str = (String) Context.class.getMethod("getPackageResourcePath", new Class[0]).invoke(context, new Object[0]);
                Method method = AssetManager.class.getMethod("getCookieName", new Class[]{Integer.TYPE});
                if (str == null && context.getPackageName().equals(Platform.ANDROID)) {
                    str = "/system/framework/framework-res.apk";
                }
                for (int i = 1; i < 20; i++) {
                    if (str != null) {
                        if (str.equals(method.invoke(assetManager, new Object[]{Integer.valueOf(i)}))) {
                            return assetManager.openXmlResourceParser(i, ShareConstants.RES_MANIFEST);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return assetManager.openXmlResourceParser(ShareConstants.RES_MANIFEST);
        }
    }

    /* renamed from: sf0.r0$b */
    public static class C77707b {
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x001b, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
            throw new java.lang.SecurityException("The apk file has unsigned res:" + r10.getName());
         */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x015c A[SYNTHETIC, Splitter:B:91:0x015c] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0169 A[SYNTHETIC, Splitter:B:96:0x0169] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m93724a(com.tencent.p014mm.vfs.C86009m1 r17) {
            /*
                java.lang.String r0 = "voken"
                java.lang.String r1 = "MicroMsg.YYBMarketVerify"
                java.lang.String r2 = ""
                r3 = 0
                r4 = 0
                java.util.jar.JarFile r5 = new java.util.jar.JarFile     // Catch:{ Exception -> 0x014f, all -> 0x014a }
                java.lang.String r6 = r17.mo119971i()     // Catch:{ Exception -> 0x014f, all -> 0x014a }
                r5.<init>(r6)     // Catch:{ Exception -> 0x014f, all -> 0x014a }
                r6 = 8192(0x2000, float:1.14794E-41)
                byte[] r7 = new byte[r6]     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
                java.util.Enumeration r8 = r5.entries()     // Catch:{ Exception -> 0x0146, all -> 0x0143 }
                r9 = r3
            L_0x001b:
                boolean r10 = r8.hasMoreElements()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r10 == 0) goto L_0x00cb
                java.lang.Object r10 = r8.nextElement()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.util.jar.JarEntry r10 = (java.util.jar.JarEntry) r10     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                boolean r11 = r10.isDirectory()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r11 != 0) goto L_0x001b
                java.lang.String r11 = r10.getName()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r12 = "META-INF/"
                boolean r11 = r11.startsWith(r12)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r11 == 0) goto L_0x003a
                goto L_0x001b
            L_0x003a:
                java.lang.String r11 = r10.getName()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r12 = "resources.arsc"
                boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r12 == 0) goto L_0x0048
                goto L_0x001b
            L_0x0048:
                java.lang.String r12 = "AndroidManifest.xml"
                boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r12 == 0) goto L_0x0051
                goto L_0x001b
            L_0x0051:
                long r12 = r10.getSize()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r14 = 5120(0x1400, double:2.5296E-320)
                int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r16 <= 0) goto L_0x005c
                goto L_0x001b
            L_0x005c:
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r14.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r15 = "name = "
                r14.append(r15)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r14.append(r11)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r11 = r14.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.io.InputStream r9 = r5.getInputStream(r10)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r11.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r14 = "get is cost "
                r11.append(r14)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                long r14 = r14 - r12
                r11.append(r14)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r9 == 0) goto L_0x009e
            L_0x0093:
                int r11 = r9.read(r7, r4, r6)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r12 = -1
                if (r11 == r12) goto L_0x009b
                goto L_0x0093
            L_0x009b:
                r9.close()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x009e:
                java.security.cert.Certificate[] r11 = r10.getCertificates()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r11 == 0) goto L_0x00b0
                int r12 = r11.length     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r12 == 0) goto L_0x00b0
                if (r3 != 0) goto L_0x001b
                r3 = r11[r4]     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r3 == 0) goto L_0x001b
                goto L_0x00cb
            L_0x00b0:
                java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r3.<init>()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r6 = "The apk file has unsigned res:"
                r3.append(r6)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r6 = r10.getName()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r3.append(r6)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r0.<init>(r3)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                throw r0     // Catch:{ Exception -> 0x0141, all -> 0x013f }
            L_0x00cb:
                if (r3 == 0) goto L_0x0126
                java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                byte[] r3 = r3.getEncoded()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r6 = r3.length     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r7 = r6 * 2
                char[] r7 = new char[r7]     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r8 = 0
            L_0x00d9:
                if (r8 >= r6) goto L_0x0102
                byte r10 = r3[r8]     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r11 = r10 >> 4
                r11 = r11 & 15
                int r12 = r8 * 2
                r13 = 10
                if (r11 < r13) goto L_0x00eb
                int r11 = r11 + 97
                int r11 = r11 - r13
                goto L_0x00ed
            L_0x00eb:
                int r11 = r11 + 48
            L_0x00ed:
                char r11 = (char) r11     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7[r12] = r11     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r10 = r10 & 15
                int r12 = r12 + 1
                if (r10 < r13) goto L_0x00fa
                int r10 = r10 + 97
                int r10 = r10 - r13
                goto L_0x00fc
            L_0x00fa:
                int r10 = r10 + 48
            L_0x00fc:
                char r10 = (char) r10     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                r7[r12] = r10     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                int r8 = r8 + 1
                goto L_0x00d9
            L_0x0102:
                r0.<init>(r7)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r0)     // Catch:{ Exception -> 0x0141, all -> 0x013f }
                if (r9 == 0) goto L_0x011a
                r9.close()     // Catch:{ IOException -> 0x0113 }
                goto L_0x011a
            L_0x0113:
                r0 = move-exception
                r6 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r2, r0)
            L_0x011a:
                r5.close()     // Catch:{ IOException -> 0x011e }
                goto L_0x0125
            L_0x011e:
                r0 = move-exception
                r5 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r0)
            L_0x0125:
                return r3
            L_0x0126:
                if (r9 == 0) goto L_0x0133
                r9.close()     // Catch:{ IOException -> 0x012c }
                goto L_0x0133
            L_0x012c:
                r0 = move-exception
                r3 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r2, r0)
            L_0x0133:
                r5.close()     // Catch:{ IOException -> 0x0137 }
                goto L_0x013e
            L_0x0137:
                r0 = move-exception
                r3 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r2, r0)
            L_0x013e:
                return r2
            L_0x013f:
                r0 = move-exception
                goto L_0x014d
            L_0x0141:
                r0 = move-exception
                goto L_0x0148
            L_0x0143:
                r0 = move-exception
                r9 = r3
                goto L_0x014d
            L_0x0146:
                r0 = move-exception
                r9 = r3
            L_0x0148:
                r3 = r5
                goto L_0x0151
            L_0x014a:
                r0 = move-exception
                r5 = r3
                r9 = r5
            L_0x014d:
                r3 = r0
                goto L_0x015a
            L_0x014f:
                r0 = move-exception
                r9 = r3
            L_0x0151:
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0157 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r5)     // Catch:{ all -> 0x0157 }
                throw r0     // Catch:{ all -> 0x0157 }
            L_0x0157:
                r0 = move-exception
                r5 = r3
                goto L_0x014d
            L_0x015a:
                if (r9 == 0) goto L_0x0167
                r9.close()     // Catch:{ IOException -> 0x0160 }
                goto L_0x0167
            L_0x0160:
                r0 = move-exception
                r6 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r6, r2, r0)
            L_0x0167:
                if (r5 == 0) goto L_0x0174
                r5.close()     // Catch:{ IOException -> 0x016d }
                goto L_0x0174
            L_0x016d:
                r0 = move-exception
                r5 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r0)
            L_0x0174:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: sf0.C77704r0.C77707b.m93724a(com.tencent.mm.vfs.m1):java.lang.String");
        }
    }

    /* renamed from: a */
    public static boolean m93721a(Context context, ArrayList<C77705c> arrayList, boolean z) {
        boolean z2;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        boolean z3 = false;
        if (!(arrayList == null || arrayList.size() == 0)) {
            Iterator<C77705c> it = arrayList.iterator();
            while (it.hasNext()) {
                C77705c next = it.next();
                if (!TextUtils.isEmpty(next.f226485a)) {
                    String str3 = next.f226485a;
                    ArrayList arrayList2 = new ArrayList();
                    String packageResourcePath = context.getPackageResourcePath();
                    String[] split = packageResourcePath.split("/");
                    if (split != null) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= split.length) {
                                str2 = "";
                                break;
                            } else if (split[i4].contains(context.getPackageName())) {
                                str2 = split[i4];
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            String replace = packageResourcePath.replace(str2, str3 + "-1");
                            if (new C86009m1(replace).mo119967g()) {
                                arrayList2.add(replace);
                            }
                            String replace2 = packageResourcePath.replace(str2, str3 + "-2");
                            if (new C86009m1(replace2).mo119967g()) {
                                arrayList2.add(replace2);
                            }
                        }
                    }
                    if (arrayList2.size() > 0) {
                        Iterator it4 = arrayList2.iterator();
                        int i5 = z3;
                        while (it4.hasNext()) {
                            C86009m1 m1Var = new C86009m1((String) it4.next());
                            if (m1Var.mo119967g()) {
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (z) {
                                        Signature[] signatureArr = context.getPackageManager().getPackageInfo(next.f226485a, 64).signatures;
                                        str = signatureArr.length >= 1 ? MD5Util.getMD5String(signatureArr[signatureArr.length - 1].toCharsString()) : "";
                                    } else {
                                        str = C77707b.m93724a(m1Var.mo119969h());
                                    }
                                    Object[] objArr = new Object[6];
                                    objArr[i5] = Boolean.valueOf(z);
                                    objArr[1] = next.f226485a;
                                    objArr[2] = next.f226487c;
                                    objArr[3] = str;
                                    objArr[4] = Boolean.valueOf(!TextUtils.isEmpty(str) && str.equalsIgnoreCase(next.f226487c));
                                    objArr[5] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                                    Log.m105925i("MicroMsg.YYBMarketVerify", "summertoken containLowerMarket usesSystemApi[%b], infopkg[%s], infoMD5[%s], sigMD5[%s], equal[%b], takes[%d]ms", objArr);
                                    if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase(next.f226487c)) {
                                        Context context2 = context;
                                    } else {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        if (z) {
                                            i3 = context.getPackageManager().getPackageInfo(next.f226485a, i5).versionCode;
                                            Context context3 = context;
                                        } else {
                                            try {
                                                i3 = C77706a.m93722a(context, next.f226485a);
                                            } catch (Exception e) {
                                                e = e;
                                                i2 = i5;
                                                Log.printErrStackTrace("MicroMsg.YYBMarketVerify", e, "", new Object[i2]);
                                                i = i2;
                                                i5 = i;
                                            }
                                        }
                                        Object[] objArr2 = new Object[6];
                                        objArr2[i5] = Boolean.valueOf(z);
                                        try {
                                            objArr2[1] = next.f226485a;
                                            objArr2[2] = Integer.valueOf(next.f226486b);
                                            objArr2[3] = Integer.valueOf(i3);
                                            objArr2[4] = Boolean.valueOf(i3 <= next.f226486b);
                                            objArr2[5] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                                            Log.m105925i("MicroMsg.YYBMarketVerify", "summertoken containLowerMarket usesSystemApi[%b], infopkg[%s], infovc[%d], versionCode[%d], less[%b], takes[%d]ms", objArr2);
                                            if (i3 <= next.f226486b) {
                                                return true;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            i2 = 0;
                                            Log.printErrStackTrace("MicroMsg.YYBMarketVerify", e, "", new Object[i2]);
                                            i = i2;
                                            i5 = i;
                                        }
                                    }
                                    i = 0;
                                } catch (Exception e3) {
                                    e = e3;
                                    Context context4 = context;
                                    i2 = i5;
                                    Log.printErrStackTrace("MicroMsg.YYBMarketVerify", e, "", new Object[i2]);
                                    i = i2;
                                    i5 = i;
                                }
                            } else {
                                Context context5 = context;
                                i = i5;
                            }
                            i5 = i;
                        }
                        z2 = i5;
                        continue;
                    } else {
                        z2 = z3;
                        continue;
                    }
                } else {
                    z2 = z3;
                }
                Context context6 = context;
                z3 = z2;
            }
            z3 = z3;
        }
        return z3;
    }
}
