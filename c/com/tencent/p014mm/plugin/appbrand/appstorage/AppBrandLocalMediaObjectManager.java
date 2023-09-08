package com.tencent.p014mm.plugin.appbrand.appstorage;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.utils.C84744h2;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import op3.C117882j;
import s24.C90124b;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager */
public final class AppBrandLocalMediaObjectManager {

    /* renamed from: a */
    public static String f238909a;

    /* renamed from: b */
    public static final Collection<C81399a> f238910b;

    /* renamed from: c */
    public static final AppBrandLocalMediaObject f238911c = new AppBrandLocalMediaObject() {
        public String toString() {
            return "AppBrandLocalMediaObject::Nil";
        }
    };

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager$a */
    public interface C81399a {
        /* renamed from: a */
        C117882j mo113679a(String str, String str2, String str3);

        /* renamed from: b */
        AppBrandLocalMediaObject mo113680b(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager$b */
    public static final class C81400b implements C81399a {
        public C81400b(C29337l lVar) {
        }

        /* renamed from: a */
        public C117882j mo113679a(String str, String str2, String str3) {
            String str4;
            String str5;
            if (Util.isNullOrNil(str3)) {
                String str6 = AppBrandLocalMediaObjectManager.f238909a;
                str3 = "unknown";
            }
            try {
                try {
                    str4 = Util.encodeHexString(new C84744h2().mo117466d(String.format(Locale.US, "%d|%s", new Object[]{Long.valueOf(AppBrandLocalMediaObjectManager.m99828a(str2)), str3}).getBytes(), str.getBytes()));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "attachMediaObject, enc exp = ", new Object[0]);
                    str4 = null;
                }
                if (Util.isNullOrNil(str4)) {
                    return null;
                }
                String str7 = "tmp_" + str4;
                String str8 = AppBrandLocalMediaObjectManager.m99832e(str) + str7;
                StringBuilder sb = new StringBuilder();
                sb.append("wxfile://");
                sb.append(str7);
                if (Util.isNullOrNil(str3)) {
                    str5 = "";
                } else {
                    str5 = '.' + str3;
                }
                sb.append(str5);
                String sb4 = sb.toString();
                Log.m105919d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, return localId = %s, filePath = %s", sb4, str8);
                return C117882j.m166285d(sb4, str8, str3);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, get crc exp = %s", Util.stackTraceToString(e2));
                return null;
            }
        }

        /* renamed from: b */
        public AppBrandLocalMediaObject mo113680b(String str, String str2) {
            String str3 = null;
            String str4 = "tmp_";
            if (!str2.startsWith("store_") && !str2.startsWith(str4)) {
                return null;
            }
            String c = C90124b.m112768c(str2);
            String replaceFirst = str2.replaceFirst("store_", "").replaceFirst(str4, "");
            if (!Util.isNullOrNil(c)) {
                replaceFirst = replaceFirst.replaceFirst('.' + c, "");
            }
            if (Util.isNullOrNil(replaceFirst)) {
                return AppBrandLocalMediaObjectManager.f238911c;
            }
            try {
                String str5 = AppBrandLocalMediaObjectManager.f238909a;
                byte[] b = new C84744h2().mo117464b(Util.decodeHexString(replaceFirst), str.getBytes());
                if (!Util.isNullOrNil(replaceFirst)) {
                    str3 = new String(b);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "retrieveMediaObject, decrypt exp ", new Object[0]);
            }
            if (Util.isNullOrNil(str3)) {
                Log.m105918d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, get empty decrypted string");
                return AppBrandLocalMediaObjectManager.f238911c;
            }
            String[] split = str3.split("\\|");
            if (split == null || split.length != 2) {
                return AppBrandLocalMediaObjectManager.f238911c;
            }
            if (str2.startsWith("store_")) {
                str4 = "store_";
            }
            String str6 = AppBrandLocalMediaObjectManager.m99832e(str) + str4 + replaceFirst;
            long j = Util.getLong(split[0], 0);
            String str7 = split[1];
            if (!str7.equalsIgnoreCase(c)) {
                return AppBrandLocalMediaObjectManager.f238911c;
            }
            try {
                long a = AppBrandLocalMediaObjectManager.m99828a(str6);
                if (j != a) {
                    Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s), appId(%s)", Long.valueOf(a), Long.valueOf(j), str2, str);
                    return AppBrandLocalMediaObjectManager.f238911c;
                }
                AppBrandLocalMediaObject appBrandLocalMediaObject = new AppBrandLocalMediaObject();
                appBrandLocalMediaObject.f238902d = "wxfile://" + str2;
                appBrandLocalMediaObject.f238903e = str6;
                appBrandLocalMediaObject.f238904f = MimeTypeUtil.getMimeTypeByFileExt(str7);
                appBrandLocalMediaObject.f238906h = str4.equalsIgnoreCase("store_");
                C86009m1 m1Var = new C86009m1(appBrandLocalMediaObject.f238903e);
                appBrandLocalMediaObject.f238908j = m1Var.mo119979q();
                appBrandLocalMediaObject.f238907i = m1Var.mo119980r();
                return appBrandLocalMediaObject;
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", Util.stackTraceToString(e2));
                return AppBrandLocalMediaObjectManager.f238911c;
            }
        }

        public String toString() {
            return "V2MediaObjectInfoHandler";
        }
    }

    static {
        String C = C112760b.m154195C();
        if (!C.endsWith("/")) {
            C = C + "/";
        }
        f238909a = C + "wxafiles/";
        C86009m1 c = C86009m1.m106378c(MMApplicationContext.getContext().getExternalCacheDir());
        if (c == null) {
            c = C86009m1.m106378c(MMApplicationContext.getContext().getCacheDir());
        }
        m99834g(c.mo119971i());
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C81400b((C29337l) null));
        f238910b = Collections.unmodifiableCollection(linkedList);
    }

    /* renamed from: a */
    public static long m99828a(String str) {
        InputStream E = C86013q1.m106423E(str);
        CheckedInputStream checkedInputStream = new CheckedInputStream(E, new Adler32());
        do {
        } while (checkedInputStream.read(new byte[2048]) >= 0);
        long value = checkedInputStream.getChecksum().getValue();
        Util.qualityClose(checkedInputStream);
        Util.qualityClose(E);
        return value;
    }

    /* renamed from: b */
    public static AppBrandLocalMediaObject m99829b(String str, String str2, String str3, boolean z) {
        return m99830c(str, str2, AppBrandLocalMediaObject.class, str3, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[LOOP:0: B:10:0x0022->B:13:0x0032, LOOP_START, PHI: r2 
      PHI: (r2v2 op3.j) = (r2v1 op3.j), (r2v9 op3.j) binds: [B:9:0x001b, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d A[Catch:{ Exception -> 0x00be }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject> T m99830c(java.lang.String r7, java.lang.String r8, java.lang.Class<T> r9, java.lang.String r10, boolean r11) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 != 0) goto L_0x000f
            return r1
        L_0x000f:
            java.lang.String r0 = s24.C90124b.m112768c(r8)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r10 = r0
        L_0x001b:
            java.util.Collection<com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager$a> r0 = f238910b
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x0022:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0034
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager$a r2 = (com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.C81399a) r2
            op3.j r2 = r2.mo113679a(r7, r8, r10)
            if (r2 == 0) goto L_0x0022
        L_0x0034:
            java.lang.String r0 = "MicroMsg.AppBrand.LocalMediaObjectManager"
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00c7
            int r5 = r2.mo182597g()
            r6 = 2
            if (r5 >= r6) goto L_0x0043
            goto L_0x00c7
        L_0x0043:
            java.lang.Object r9 = r9.newInstance()     // Catch:{ Exception -> 0x00be }
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r9 = (com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject) r9     // Catch:{ Exception -> 0x00be }
            java.lang.Object r5 = r2.mo182596a(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00be }
            r9.f238902d = r5     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = com.tencent.p014mm.sdk.system.MimeTypeUtil.getMimeTypeByFileExt(r10)     // Catch:{ Exception -> 0x00be }
            r9.f238904f = r5     // Catch:{ Exception -> 0x00be }
            java.lang.Object r5 = r2.mo182596a(r4)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00be }
            r9.f238903e = r5     // Catch:{ Exception -> 0x00be }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x00be }
            if (r5 == 0) goto L_0x006b
            java.lang.String r7 = "attachCast appId %s, Null Or Nil fileFullPath"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ Exception -> 0x00be }
            return r1
        L_0x006b:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x00be }
            if (r5 == 0) goto L_0x0074
            java.lang.String r10 = "unknown"
        L_0x0074:
            r5 = 3
            java.lang.Object r2 = r2.mo182596a(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00be }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r10)     // Catch:{ Exception -> 0x00be }
            r9.f238905g = r10     // Catch:{ Exception -> 0x00be }
            java.lang.String r10 = r9.f238903e     // Catch:{ Exception -> 0x00be }
            if (r11 == 0) goto L_0x008d
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106463x(r8, r10)     // Catch:{ Exception -> 0x00be }
            if (r2 == 0) goto L_0x008d
        L_0x008b:
            r8 = 1
            goto L_0x009b
        L_0x008d:
            if (r11 != 0) goto L_0x009a
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r10, r3)     // Catch:{ Exception -> 0x00be }
            r5 = 0
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x009a
            goto L_0x008b
        L_0x009a:
            r8 = 0
        L_0x009b:
            if (r8 == 0) goto L_0x00c6
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00be }
            java.lang.String r10 = r9.f238903e     // Catch:{ Exception -> 0x00be }
            r8.<init>((java.lang.String) r10)     // Catch:{ Exception -> 0x00be }
            long r10 = r8.mo119980r()     // Catch:{ Exception -> 0x00be }
            r9.f238907i = r10     // Catch:{ Exception -> 0x00be }
            long r10 = r8.mo119979q()     // Catch:{ Exception -> 0x00be }
            r9.f238908j = r10     // Catch:{ Exception -> 0x00be }
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.i0> r10 = com.tencent.p014mm.plugin.appbrand.appstorage.C81417i0.class
            ra.d r10 = p224ra.C89909e.m112439d(r10, r4)     // Catch:{ Exception -> 0x00be }
            com.tencent.mm.plugin.appbrand.appstorage.i0 r10 = (com.tencent.p014mm.plugin.appbrand.appstorage.C81417i0) r10     // Catch:{ Exception -> 0x00be }
            if (r10 == 0) goto L_0x00bd
            r10.mo113734d(r7, r8)     // Catch:{ Exception -> 0x00be }
        L_0x00bd:
            return r9
        L_0x00be:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r9, r8)
        L_0x00c6:
            return r1
        L_0x00c7:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            if (r2 != 0) goto L_0x00cd
            r8 = -1
            goto L_0x00d1
        L_0x00cd:
            int r8 = r2.mo182597g()
        L_0x00d1:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r3] = r8
            java.lang.String r8 = "attachCast, no handler return correct info, attach.size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99830c(java.lang.String, java.lang.String, java.lang.Class, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject");
    }

    @Deprecated
    /* renamed from: d */
    public static AppBrandLocalMediaObject m99831d(String str, String str2) {
        if (Util.isNullOrNil(str2) || !str2.startsWith("wxfile://") || Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager", "getItemByLocalId, invalid args, localId(%s), appId(%s) ", str2, str);
            return null;
        }
        String substring = str2.substring(9);
        Iterator<C81399a> it = f238910b.iterator();
        AppBrandLocalMediaObject appBrandLocalMediaObject = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C81399a next = it.next();
            AppBrandLocalMediaObject b = next.mo113680b(str, substring);
            if (b != null) {
                Log.m105925i("MicroMsg.AppBrand.LocalMediaObjectManager", "getItemByLocalId, handled by %s, result = %s", next.toString(), b);
                appBrandLocalMediaObject = b;
                break;
            }
            appBrandLocalMediaObject = b;
        }
        if (f238911c == appBrandLocalMediaObject) {
            return null;
        }
        return appBrandLocalMediaObject;
    }

    /* renamed from: e */
    public static String m99832e(String str) {
        String f = m99833f(str);
        FilePathGenerator.checkMkdir(f);
        try {
            new C86009m1(f, FilePathGenerator.NO_MEDIA_FILENAME).mo119964e();
        } catch (Exception unused) {
        }
        return f;
    }

    /* renamed from: f */
    public static String m99833f(String str) {
        return f238909a + str + "/";
    }

    /* renamed from: g */
    public static void m99834g(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        f238909a = str + "wxafiles/";
    }

    public static String genMediaFilePath(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return null;
        }
        return m99832e(str) + str2;
    }
}
