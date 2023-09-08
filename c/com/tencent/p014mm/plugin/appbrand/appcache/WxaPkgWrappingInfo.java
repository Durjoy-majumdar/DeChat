package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.tencent.p014mm.plugin.appbrand.appstorage.MD5JNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo */
public final class WxaPkgWrappingInfo extends ModulePkgInfo implements Iterable<ModulePkgInfo> {
    public static final Parcelable.Creator<WxaPkgWrappingInfo> CREATOR = new C81223b();

    /* renamed from: d */
    public int f238585d;

    /* renamed from: e */
    public long f238586e;
    @Deprecated

    /* renamed from: f */
    public boolean f238587f;

    /* renamed from: g */
    public final LinkedList<ModulePkgInfo> f238588g;

    /* renamed from: h */
    public volatile transient Map<String, String> f238589h;

    /* renamed from: i */
    public WxaRuntimeModulePluginListMap f238590i;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo$a */
    public class C81222a implements Iterator<ModulePkgInfo> {

        /* renamed from: d */
        public boolean f238591d = false;

        /* renamed from: e */
        public Iterator<ModulePkgInfo> f238592e = null;

        public C81222a() {
        }

        public boolean hasNext() {
            if (!this.f238591d) {
                return true;
            }
            if (this.f238592e == null) {
                this.f238592e = WxaPkgWrappingInfo.this.f238588g.iterator();
            }
            return this.f238592e.hasNext();
        }

        public Object next() {
            if (this.f238591d) {
                return this.f238592e.next();
            }
            this.f238591d = true;
            return WxaPkgWrappingInfo.this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo$b */
    public class C81223b implements Parcelable.Creator<WxaPkgWrappingInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaPkgWrappingInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaPkgWrappingInfo[i];
        }
    }

    public WxaPkgWrappingInfo() {
        this.f238588g = new LinkedList<>();
        this.f238590i = null;
        this.name = ModulePkgInfo.MAIN_MODULE_NAME;
        this.independent = true;
    }

    /* renamed from: f */
    public static String m99521f(C86009m1 m1Var) {
        String str;
        InputStream D;
        try {
            MD5JNILoadGuard.ensureNativeLibrariesLoaded();
            String[] strArr = new String[1];
            if (-101 != MD5JNI.getMD5String(C86013q1.m106448i(m1Var.mo119971i(), false), strArr)) {
                str = strArr[0];
                if (TextUtils.isEmpty(str)) {
                    try {
                        D = C86013q1.m106422D(m1Var);
                        str = C90193h.m112874b(D, 16384);
                        if (D != null) {
                            D.close();
                        }
                    } catch (IOException e) {
                        Log.printErrStackTrace("Luggage.WXA.WxaPkgWrappingInfo", e, "getFileMD5 by java io", new Object[0]);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                return str;
            }
            throw new IOException("MD5_ERR_FILE_OPEN");
        } catch (UnsatisfiedLinkError e2) {
            Log.printErrStackTrace("Luggage.WXA.WxaPkgWrappingInfo", e2, "getFileMD5 by jni", new Object[0]);
            str = null;
        }
        throw th;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public String mo113447h(String str, String str2) {
        String str3;
        if (ModulePkgInfo.MAIN_MODULE_NAME.equals(str2)) {
            return str2;
        }
        synchronized (this.f238588g) {
            if (this.f238589h == null) {
                mo113449m(str);
            }
            str3 = (String) ((ArrayMap) this.f238589h).get(str2);
            if (TextUtils.isEmpty(str3)) {
                str3 = str2;
            }
        }
        Log.m105925i("Luggage.WXA.WxaPkgWrappingInfo", "getModuleNameForURLFetch appId:%s, retrace module %s -> %s", str, str2, str3);
        return str3;
    }

    public boolean isAssignable(ModulePkgInfo modulePkgInfo) {
        return modulePkgInfo instanceof WxaPkgWrappingInfo ? super.isAssignable(modulePkgInfo) && this.pkgVersion == modulePkgInfo.pkgVersion : super.isAssignable(modulePkgInfo);
    }

    public Iterator<ModulePkgInfo> iterator() {
        return new C81222a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113449m(java.lang.String r11) {
        /*
            r10 = this;
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> r0 = r10.f238588g
            monitor-enter(r0)
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> r1 = r10.f238588g     // Catch:{ all -> 0x0085 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x0083
            java.util.Map<java.lang.String, java.lang.String> r1 = r10.f238589h     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0083
        L_0x0010:
            android.util.ArrayMap r1 = new android.util.ArrayMap     // Catch:{ all -> 0x0085 }
            r1.<init>()     // Catch:{ all -> 0x0085 }
            r10.f238589h = r1     // Catch:{ all -> 0x0085 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> r1 = r10.f238588g     // Catch:{ all -> 0x0085 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
        L_0x001d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r2 = (com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo) r2     // Catch:{ all -> 0x0085 }
            int r6 = r10.pkgVersion     // Catch:{ all -> 0x0085 }
            r2.pkgVersion = r6     // Catch:{ all -> 0x0085 }
            java.lang.String r6 = r2.name     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "__APP__"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99868b(r6, r5)     // Catch:{ all -> 0x0085 }
        L_0x003f:
            java.lang.String r7 = r2.name     // Catch:{ all -> 0x0085 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x0085 }
            if (r7 == 0) goto L_0x0048
            goto L_0x001d
        L_0x0048:
            java.lang.String r7 = "Luggage.WXA.WxaPkgWrappingInfo"
            java.lang.String r8 = "setupModuleEnv, appId:%s, module mapped %s -> %s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0085 }
            r9[r5] = r11     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r2.name     // Catch:{ all -> 0x0085 }
            r9[r3] = r5     // Catch:{ all -> 0x0085 }
            r9[r4] = r6     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x0085 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.f238589h     // Catch:{ all -> 0x0085 }
            java.lang.String r4 = r2.name     // Catch:{ all -> 0x0085 }
            android.util.ArrayMap r3 = (android.util.ArrayMap) r3     // Catch:{ all -> 0x0085 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0085 }
            r2.name = r6     // Catch:{ all -> 0x0085 }
            goto L_0x001d
        L_0x0067:
            java.lang.String r1 = "Luggage.WXA.WxaPkgWrappingInfo"
            java.lang.String r2 = "setupModuleEnv, appId:%s, NameMap.size:%d"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0085 }
            r4[r5] = r11     // Catch:{ all -> 0x0085 }
            java.util.Map<java.lang.String, java.lang.String> r11 = r10.f238589h     // Catch:{ all -> 0x0085 }
            android.util.ArrayMap r11 = (android.util.ArrayMap) r11     // Catch:{ all -> 0x0085 }
            int r11 = r11.size()     // Catch:{ all -> 0x0085 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0085 }
            r4[r3] = r11     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ all -> 0x0085 }
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            return
        L_0x0083:
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            return
        L_0x0085:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.mo113449m(java.lang.String):void");
    }

    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.f238585d = parcel.readInt();
        this.pkgVersion = parcel.readInt();
        this.f238586e = parcel.readLong();
        this.f238587f = parcel.readByte() != 0;
        parcel.readTypedList(this.f238588g, ModulePkgInfo.CREATOR);
        this.f238590i = (WxaRuntimeModulePluginListMap) parcel.readParcelable(WxaRuntimeModulePluginListMap.class.getClassLoader());
    }

    public String toString() {
        return "WxaPkgWrappingInfo{pkgDebugType=" + this.f238585d + ", pkgVersion=" + this.pkgVersion + ", pkgCreateTime=" + this.f238586e + ", localPkg=" + this.f238587f + ", md5='" + this.md5 + '\'' + ", pkgPath='" + this.pkgPath + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f238585d);
        parcel.writeInt(this.pkgVersion);
        parcel.writeLong(this.f238586e);
        parcel.writeByte(this.f238587f ? (byte) 1 : 0);
        parcel.writeTypedList(this.f238588g);
        parcel.writeParcelable(this.f238590i, 0);
    }

    public WxaPkgWrappingInfo(Parcel parcel) {
        this();
        readFromParcel(parcel);
    }
}
