package com.tencent.p014mm.storage;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.storage.RegionCodeDecoder */
public class RegionCodeDecoder {

    /* renamed from: c */
    public static RegionCodeDecoder f284116c;

    /* renamed from: d */
    public static final String f284117d = (C112760b.m154216X() + "MicroMsg/regioncode/");

    /* renamed from: a */
    public String f284118a = "";

    /* renamed from: b */
    public String f284119b = "";

    /* renamed from: com.tencent.mm.storage.RegionCodeDecoder$DecoderJni */
    public static class DecoderJni {
        public static native void buildFromFile(String str);

        public static native Region[] getCities(String str, String str2, String str3);

        public static native Region[] getCountries(String str);

        public static native String getLocName(String str);

        public static native Region[] getProvinces(String str, String str2);

        public static native void release();
    }

    /* renamed from: com.tencent.mm.storage.RegionCodeDecoder$Region */
    public static class Region {
        private String code;
        private String countryCode;
        private boolean hasChildren = false;
        private boolean isCity = false;
        private boolean isCountry = false;
        private boolean isProvince = false;
        private String name;
        private Region parent = null;

        public String getCode() {
            return this.code;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getName() {
            return this.name;
        }

        public Region getParent() {
            return this.parent;
        }

        public boolean hasChildren() {
            return this.hasChildren;
        }

        public boolean isCity() {
            return this.isCity;
        }

        public boolean isCountry() {
            return this.isCountry;
        }

        public boolean isProvince() {
            return this.isProvince;
        }

        public void setCity(boolean z) {
            this.isCity = z;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setCountry(boolean z) {
            this.isCountry = z;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setHasChildren(boolean z) {
            this.hasChildren = z;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setParent(Region region) {
            this.parent = region;
        }

        public void setProvince(boolean z) {
            this.isProvince = z;
        }
    }

    /* renamed from: k */
    public static synchronized RegionCodeDecoder m124563k() {
        RegionCodeDecoder regionCodeDecoder;
        synchronized (RegionCodeDecoder.class) {
            if (f284116c == null) {
                f284116c = new RegionCodeDecoder();
            }
            RegionCodeDecoder regionCodeDecoder2 = f284116c;
            regionCodeDecoder2.getClass();
            if (!LocaleUtil.getApplicationLanguage().equals(regionCodeDecoder2.f284118a)) {
                regionCodeDecoder2.mo135566a();
            }
            regionCodeDecoder = f284116c;
        }
        return regionCodeDecoder;
    }

    /* renamed from: q */
    public static final String m124564q(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!Util.isNullOrNil(str)) {
            stringBuffer.append(str);
            if (!Util.isNullOrNil(str2)) {
                stringBuffer.append('_');
                stringBuffer.append(str2);
                if (!Util.isNullOrNil(str3)) {
                    stringBuffer.append('_');
                    stringBuffer.append(str3);
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: r */
    public static final boolean m124565r(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return str.equalsIgnoreCase("cn");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e1, code lost:
        if ((com.tencent.p014mm.vfs.C86013q1.m106443d("assets:///regioncode/mmregioncode_en.txt", r6.mo119971i(), false) > 0) == false) goto L_0x0207;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0226  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135566a() {
        /*
            r14 = this;
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r1 = f284117d
            r0.<init>((java.lang.String) r1)
            boolean r1 = r0.mo119967g()
            if (r1 != 0) goto L_0x0013
            r0.mo119987x()
            r14.mo135567b(r0)
        L_0x0013:
            java.lang.String[] r1 = r0.mo119981s()
            if (r1 == 0) goto L_0x001c
            int r1 = r1.length
            if (r1 != 0) goto L_0x001f
        L_0x001c:
            r14.mo135567b(r0)
        L_0x001f:
            java.lang.String r1 = "zh_HK"
            java.lang.String r1 = r14.mo135568c(r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x00f7
            java.lang.String r1 = "MicroMsg.RegionCodeDecoder"
            java.lang.String r6 = "forward compatbility for not HK language support"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
            monitor-enter(r14)
            boolean r1 = r0.mo119967g()     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x0043
            java.lang.String[] r1 = r0.mo119981s()     // Catch:{ all -> 0x00f4 }
            goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            boolean r6 = r0.mo119967g()     // Catch:{ all -> 0x00f4 }
            if (r6 == 0) goto L_0x0052
            if (r1 == 0) goto L_0x0052
            int r1 = r1.length     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x0052
            monitor-exit(r14)
            goto L_0x00f7
        L_0x0052:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00e8 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r6 = "regioncode"
            java.lang.String[] r1 = r1.list(r6)     // Catch:{ Exception -> 0x00e8 }
            int r6 = r1.length     // Catch:{ Exception -> 0x00e8 }
            r7 = 0
        L_0x0063:
            if (r7 >= r6) goto L_0x00f2
            r8 = r1[r7]     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r9 = "zh_HK"
            boolean r9 = r8.endsWith(r9)     // Catch:{ Exception -> 0x00e8 }
            if (r9 != 0) goto L_0x0079
            java.lang.String r9 = "zh_TW"
            boolean r9 = r8.endsWith(r9)     // Catch:{ Exception -> 0x00e8 }
            if (r9 == 0) goto L_0x00e4
        L_0x0079:
            java.lang.String r9 = "MicroMsg.RegionCodeDecoder"
            java.lang.String r10 = "from:%s,  to:%s"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00e8 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
            r12.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r13 = "regioncode/"
            r12.append(r13)     // Catch:{ Exception -> 0x00e8 }
            r12.append(r8)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x00e8 }
            r11[r5] = r12     // Catch:{ Exception -> 0x00e8 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
            r12.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r13 = r0.mo119976n()     // Catch:{ Exception -> 0x00e8 }
            r12.append(r13)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r13 = "/"
            r12.append(r13)     // Catch:{ Exception -> 0x00e8 }
            r12.append(r8)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x00e8 }
            r11[r4] = r12     // Catch:{ Exception -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r11)     // Catch:{ Exception -> 0x00e8 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
            r9.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r10 = r0.mo119976n()     // Catch:{ Exception -> 0x00e8 }
            r9.append(r10)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r10 = "/"
            r9.append(r10)     // Catch:{ Exception -> 0x00e8 }
            r9.append(r8)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00e8 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8 }
            r10.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r11 = "assets:///regioncode/"
            r10.append(r11)     // Catch:{ Exception -> 0x00e8 }
            r10.append(r8)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x00e8 }
            com.tencent.p014mm.vfs.C86013q1.m106442c(r8, r9)     // Catch:{ Exception -> 0x00e8 }
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00e8 }
            r8.<init>((java.lang.String) r9)     // Catch:{ Exception -> 0x00e8 }
            r14.mo135569d(r8, r0)     // Catch:{ Exception -> 0x00e8 }
        L_0x00e4:
            int r7 = r7 + 1
            goto L_0x0063
        L_0x00e8:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.RegionCodeDecoder"
            java.lang.String r6 = ""
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r6, r7)     // Catch:{ all -> 0x00f4 }
        L_0x00f2:
            monitor-exit(r14)
            goto L_0x00f7
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00f7:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r14.f284118a = r0
            java.lang.String r0 = r14.mo135580p()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0120
            java.lang.String r0 = "MicroMsg.RegionCodeDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildMap error, no codeFile found, curLang: "
            r1.append(r2)
            java.lang.String r2 = r14.f284118a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0120:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = f284117d
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r0)
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.mo119971i()
            r7.append(r8)
            java.lang.String r8 = ".hash"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>((java.lang.String) r7)
            boolean r7 = r6.mo119967g()
            java.lang.String r8 = "MicroMsg.RegionCodeDecoder"
            if (r7 == 0) goto L_0x0189
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0169 }
            com.tencent.mm.vfs.t1 r9 = new com.tencent.mm.vfs.t1     // Catch:{ all -> 0x0169 }
            r9.<init>((com.tencent.p014mm.vfs.C86009m1) r6)     // Catch:{ all -> 0x0169 }
            r7.<init>(r9)     // Catch:{ all -> 0x0169 }
            java.lang.String r6 = r7.readLine()     // Catch:{ all -> 0x0167 }
            goto L_0x017c
        L_0x0167:
            r9 = move-exception
            goto L_0x016c
        L_0x0169:
            r7 = move-exception
            r9 = r7
            r7 = r3
        L_0x016c:
            java.lang.String r10 = "Failed to read saved hash from hash file: %s"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0182 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0182 }
            r11[r5] = r6     // Catch:{ all -> 0x0182 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r9, r10, r11)     // Catch:{ all -> 0x0182 }
            if (r7 == 0) goto L_0x0189
            r6 = r3
        L_0x017c:
            r7.close()     // Catch:{ all -> 0x0180 }
            goto L_0x018a
        L_0x0180:
            goto L_0x018a
        L_0x0182:
            r0 = move-exception
            if (r7 == 0) goto L_0x0188
            r7.close()     // Catch:{ all -> 0x0188 }
        L_0x0188:
            throw r0
        L_0x0189:
            r6 = r3
        L_0x018a:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 == 0) goto L_0x0192
            r6 = 0
            goto L_0x019a
        L_0x0192:
            java.lang.String r7 = r14.mo135579o(r1)
            boolean r6 = r6.equals(r7)
        L_0x019a:
            if (r6 != 0) goto L_0x0206
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "assets:///regioncode/"
            r6.append(r7)
            java.lang.String r7 = r1.getName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106443d(r6, r0, r5)
            r9 = 0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01bd
            r6 = 1
            goto L_0x01be
        L_0x01bd:
            r6 = 0
        L_0x01be:
            if (r6 != 0) goto L_0x01e4
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r7 = r1.mo119974l()
            java.lang.String r11 = "mmregioncode_en.txt"
            r6.<init>((com.tencent.p014mm.vfs.C86009m1) r7, (java.lang.String) r11)
            java.lang.String r7 = r6.mo119971i()
            java.lang.String r6 = r6.mo119971i()
            java.lang.String r11 = "assets:///regioncode/mmregioncode_en.txt"
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106443d(r11, r6, r5)
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x01e0
            r6 = 1
            goto L_0x01e1
        L_0x01e0:
            r6 = 0
        L_0x01e1:
            if (r6 != 0) goto L_0x01e5
            goto L_0x0207
        L_0x01e4:
            r7 = r0
        L_0x01e5:
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r7)
            com.tencent.mm.vfs.m1 r6 = r3.mo119974l()
            r14.mo135569d(r3, r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r1 = r1.getName()
            r6[r5] = r1
            java.lang.String r1 = r3.getName()
            r6[r4] = r1
            java.lang.String r1 = "Verifying codeFile: %s failed, after fallback, %s will be used."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r6)
            r3 = r7
            goto L_0x0207
        L_0x0206:
            r3 = r0
        L_0x0207:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x0226
            java.lang.String r0 = "MicroMsg.RegionCodeDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildMap error, no codeFile found after verify, curLang: "
            r1.append(r2)
            java.lang.String r2 = r14.f284118a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0226:
            java.lang.String r1 = r14.f284119b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x023d
            java.lang.String r1 = r14.f284119b
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x023d
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x023d
            return
        L_0x023d:
            java.lang.String r0 = "MicroMsg.RegionCodeDecoder"
            java.lang.String r1 = "buildMap, after verify, codeFile %s is used. curLang: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r7 = r6.getPath()
            if (r7 == 0) goto L_0x0267
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r5, r5)
            java.lang.String r8 = r6.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0267
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r7)
            android.net.Uri r6 = r6.build()
        L_0x0267:
            java.lang.String r6 = r6.getPath()
            java.lang.String r7 = "/"
            int r7 = r6.lastIndexOf(r7)
            if (r7 >= 0) goto L_0x0274
            goto L_0x0279
        L_0x0274:
            int r7 = r7 + r4
            java.lang.String r6 = r6.substring(r7)
        L_0x0279:
            r2[r5] = r6
            java.lang.String r5 = r14.f284118a
            r2[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)
            r14.f284119b = r3
            com.tencent.p014mm.storage.RegionCodeDecoder.DecoderJni.buildFromFile(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.RegionCodeDecoder.mo135566a():void");
    }

    /* renamed from: b */
    public final synchronized void mo135567b(C86009m1 m1Var) {
        String[] strArr = null;
        if (m1Var.mo119967g()) {
            strArr = m1Var.mo119981s();
        }
        if (!m1Var.mo119967g() || strArr == null || strArr.length == 0) {
            try {
                for (String str : MMApplicationContext.getContext().getAssets().list("regioncode")) {
                    Log.m105925i("MicroMsg.RegionCodeDecoder", "from:%s,  to:%s", "regioncode/" + str, m1Var.mo119976n() + "/" + str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(m1Var.mo119976n());
                    sb.append("/");
                    sb.append(str);
                    String sb4 = sb.toString();
                    C86013q1.m106442c("assets:///regioncode/" + str, sb4);
                    mo135569d(new C86009m1(sb4), m1Var);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.RegionCodeDecoder", e, "", new Object[0]);
            }
        } else {
            return;
        }
        return;
    }

    @Deprecated
    /* renamed from: c */
    public final String mo135568c(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return f284117d + "mmregioncode_" + str + ".txt";
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[SYNTHETIC, Splitter:B:19:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135569d(com.tencent.p014mm.vfs.C86009m1 r7, com.tencent.p014mm.vfs.C86009m1 r8) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r7.getName()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.RegionCodeDecoder"
            java.lang.String r4 = "Generating hash file for: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.getName()
            r4.append(r5)
            java.lang.String r5 = ".hash"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r8, (java.lang.String) r4)
            java.lang.String r8 = r6.mo135579o(r7)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r4 != 0) goto L_0x006d
            boolean r4 = r1.mo119967g()
            if (r4 != 0) goto L_0x0042
            com.tencent.mm.vfs.m1 r4 = r1.mo119974l()
            r4.mo119987x()
        L_0x0042:
            r4 = 0
            com.tencent.mm.vfs.u1 r5 = new com.tencent.mm.vfs.u1     // Catch:{ all -> 0x0052 }
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r1)     // Catch:{ all -> 0x0052 }
            r5.write(r8)     // Catch:{ all -> 0x004f }
            r5.close()     // Catch:{ all -> 0x006d }
            goto L_0x006d
        L_0x004f:
            r8 = move-exception
            r4 = r5
            goto L_0x0053
        L_0x0052:
            r8 = move-exception
        L_0x0053:
            java.lang.String r1 = "Failed to save hash file of %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0066 }
            r0[r3] = r7     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r1, r0)     // Catch:{ all -> 0x0066 }
            if (r4 == 0) goto L_0x006d
            r4.close()     // Catch:{ all -> 0x006d }
            goto L_0x006d
        L_0x0066:
            r7 = move-exception
            if (r4 == 0) goto L_0x006c
            r4.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r7
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.RegionCodeDecoder.mo135569d(com.tencent.mm.vfs.m1, com.tencent.mm.vfs.m1):void");
    }

    /* renamed from: e */
    public Region[] mo135570e(String str, String str2) {
        if (Util.isNullOrNil(this.f284119b) || Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return null;
        }
        return DecoderJni.getCities(this.f284119b, str, str2);
    }

    /* renamed from: f */
    public String mo135571f(String str, String str2, String str3) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
            return null;
        }
        return mo135576l(m124564q(str, str2, str3));
    }

    /* renamed from: g */
    public Region[] mo135572g() {
        if (Util.isNullOrNil(this.f284119b)) {
            return null;
        }
        return DecoderJni.getCountries(this.f284119b);
    }

    /* renamed from: h */
    public String mo135573h(String str, String str2, String str3) {
        String f = mo135571f(str, str2, str3);
        return Util.isNullOrNil(f) ? Util.nullAsNil(str3) : f;
    }

    /* renamed from: i */
    public String mo135574i(String str) {
        String l = mo135576l(str);
        return Util.isNullOrNil(l) ? Util.nullAsNil(str) : l;
    }

    /* renamed from: j */
    public String mo135575j(String str, String str2) {
        String m = mo135577m(str, str2);
        return Util.isNullOrNil(m) ? Util.nullAsNil(str2) : m;
    }

    /* renamed from: l */
    public final String mo135576l(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return DecoderJni.getLocName(str);
    }

    /* renamed from: m */
    public String mo135577m(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return null;
        }
        return mo135576l(m124564q(str, str2, (String) null));
    }

    /* renamed from: n */
    public Region[] mo135578n(String str) {
        if (Util.isNullOrNil(this.f284119b) || Util.isNullOrNil(str)) {
            return null;
        }
        return DecoderJni.getProvinces(this.f284119b, str);
    }

    /* renamed from: o */
    public final String mo135579o(C86009m1 m1Var) {
        String q = C86013q1.m106456q(m1Var.mo119976n());
        if (Util.isNullOrNil(q)) {
            Log.m105921e("MicroMsg.RegionCodeDecoder", "Failed to calculate hash for file %s", m1Var.getName());
            return null;
        }
        return MD5Util.getMD5String(q + "#" + m1Var.mo119979q() + "#" + C87203t.m108270f(true));
    }

    /* renamed from: p */
    public final String mo135580p() {
        String str = "mmregioncode_" + this.f284118a + ".txt";
        StringBuilder sb = new StringBuilder();
        sb.append("mmregioncode_");
        sb.append(this.f284118a.equalsIgnoreCase("zh_HK") ? "zh_TW" : this.f284118a);
        sb.append(".txt");
        String sb4 = sb.toString();
        String str2 = f284117d;
        Uri n = C116299g2.m163858n(str2);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
            return null;
        }
        Uri n2 = C116299g2.m163858n(str2 + str);
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
        if (!l3.mo177810a() ? false : l3.f348991a.mo119948x(l3.f348992b)) {
            return str;
        }
        if (this.f284118a.equalsIgnoreCase("zh_HK")) {
            Uri n3 = C116299g2.m163858n(str2 + sb4);
            String path3 = n3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!n3.getPath().equals(k3)) {
                    n3 = n3.buildUpon().path(k3).build();
                }
            }
            C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(n3, (C116281f0.C116288h) null);
            if (!l4.mo177810a() ? false : l4.f348991a.mo119948x(l4.f348992b)) {
                return sb4;
            }
        }
        Uri n4 = C116299g2.m163858n(str2 + "mmregioncode_en.txt");
        String path4 = n4.getPath();
        if (path4 != null) {
            String k4 = C116299g2.m163855k(path4, false, false);
            if (!n4.getPath().equals(k4)) {
                n4 = n4.buildUpon().path(k4).build();
            }
        }
        C116281f0.C116288h l5 = C116281f0.C116289i.f348994a.mo177799l(n4, (C116281f0.C116288h) null);
        if (l5.mo177810a()) {
            z = l5.f348991a.mo119948x(l5.f348992b);
        }
        if (z) {
            return "mmregioncode_en.txt";
        }
        return null;
    }
}
