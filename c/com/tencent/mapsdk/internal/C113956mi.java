package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.mi */
public final class C113956mi {

    /* renamed from: a */
    private static final String f340837a = "tencentmap";

    /* renamed from: b */
    private static final String f340838b = "/mapsdk_vector/";

    /* renamed from: c */
    private static String f340839c = null;

    /* renamed from: d */
    private static String f340840d = null;

    /* renamed from: e */
    private static String f340841e = "resourceVersion.dat";

    /* renamed from: a */
    private static InputStream m157945a(Context context, String str, String str2) {
        return m157952b(context, str + str2);
    }

    /* renamed from: b */
    public static final InputStream m157952b(Context context, String str) {
        AssetManager assets;
        if (context == null || (assets = context.getAssets()) == null) {
            return null;
        }
        try {
            return assets.open(str);
        } catch (IOException e) {
            String message = e.getMessage();
            if (C113889km.f340717a != null) {
                C113889km.f340717a.mo172317d("asset", message, e);
            } else {
                C113889km.m157551c("asset", message, e);
            }
            return null;
        }
    }

    /* renamed from: c */
    private static void m157956c(C113955mh mhVar, String str) {
        String str2;
        File file = new File(str, C0938ej.f2147b);
        String a = mhVar.mo172391a("indoormap_style_md5");
        String str3 = null;
        if (!TextUtils.isEmpty(a)) {
            C113889km.m157545b(C0949kl.f2236f, "校验文件:indoor_style.dat");
            try {
                str2 = C113903kv.m157738a(file);
            } catch (FileNotFoundException unused) {
                str2 = null;
            }
            if (!TextUtils.equals(str2, a)) {
                C113889km.m157545b(C0949kl.f2236f, "文件md5校验失败:" + str2 + "," + str2);
                file.delete();
                mhVar.mo172396a(new String[]{"indoormap_style_version", "indoormap_style_md5"});
            }
        }
        File file2 = new File(str, C0938ej.f2148c);
        String a2 = mhVar.mo172391a("indoormap_style_night_md5");
        if (!TextUtils.isEmpty(a2)) {
            C113889km.m157545b(C0949kl.f2236f, "校验文件:indoor_style_night.dat");
            try {
                str3 = C113903kv.m157738a(file2);
            } catch (FileNotFoundException unused2) {
            }
            if (!TextUtils.equals(str3, a2)) {
                C113889km.m157545b(C0949kl.f2236f, "文件md5校验失败:" + str3 + "," + a2);
                file2.delete();
                mhVar.mo172396a(new String[]{"indoormap_style_night_version", "indoormap_style_night_md5"});
            }
        }
    }

    /* renamed from: d */
    private static void m157957d(C113955mh mhVar, String str) {
        File file = new File(str, C0938ej.f2150e);
        String a = mhVar.mo172391a(C0939el.f2195y);
        if (!TextUtils.isEmpty(a)) {
            try {
                if (!TextUtils.equals(C113903kv.m157738a(file), a)) {
                    file.delete();
                    mhVar.mo172396a(new String[]{C0939el.f2189s, C0939el.f2195y});
                }
            } catch (FileNotFoundException e) {
                C113889km.m157547b("config error: ", (Throwable) e);
                mhVar.mo172396a(new String[]{C0939el.f2189s, C0939el.f2195y});
            }
        }
    }

    /* renamed from: a */
    public static void m157947a(Context context, C113955mh mhVar, String str, String str2) {
        InputStream inputStream;
        File file = new File(str, str2);
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = C113886kg.m157521b(C113959ml.m157965a(context, (TencentMapOptions) null).mo172404b((String) null) + str2);
            if (inputStream == null) {
                try {
                    if (f340839c != null) {
                        if (!file.exists() || m157951a(context, mhVar, f340839c, str2, true)) {
                            inputStream = m157952b(context, f340839c + str2);
                        }
                    } else if (f340840d != null && (!file.exists() || m157951a(context, mhVar, f340840d, str2, false))) {
                        inputStream = C113886kg.m157521b(f340840d + str2);
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    C113886kg.m157515a((Closeable) fileOutputStream);
                    C113886kg.m157515a((Closeable) inputStream);
                    throw th;
                }
            }
            if (inputStream == null) {
                String e = C113959ml.m157965a(context, (TencentMapOptions) null).mo172408e();
                if (!file.exists() || m157951a(context, mhVar, e, str2, false)) {
                    inputStream = C113886kg.m157521b(e + str2);
                }
            }
            if (inputStream == null && (!file.exists() || m157951a(context, mhVar, C113798hb.f340496d, str2, true))) {
                inputStream = m157944a(context, str2);
            }
            if (inputStream != null) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    C113886kg.m157513a(inputStream, (OutputStream) fileOutputStream2);
                    C113886kg.m157515a((Closeable) fileOutputStream2);
                } catch (IOException unused2) {
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th4) {
                    fileOutputStream = fileOutputStream2;
                    th = th4;
                    C113886kg.m157515a((Closeable) fileOutputStream);
                    C113886kg.m157515a((Closeable) inputStream);
                    throw th;
                }
                C113886kg.m157515a((Closeable) inputStream);
            }
        } catch (IOException unused3) {
            inputStream = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            C113886kg.m157515a((Closeable) fileOutputStream);
            C113886kg.m157515a((Closeable) inputStream);
            throw th;
        }
        C113886kg.m157515a((Closeable) fileOutputStream);
        C113886kg.m157515a((Closeable) inputStream);
    }

    /* renamed from: b */
    private static boolean m157955b(C113955mh mhVar, String str) {
        File file = new File(str, C0938ej.f2146a);
        String a = mhVar.mo172391a(C0939el.f2190t);
        if (!file.exists() && TextUtils.isEmpty(a)) {
            return true;
        }
        try {
            if (TextUtils.equals(C113903kv.m157738a(file), a)) {
                return true;
            }
            file.delete();
            mhVar.mo172392a();
            return false;
        } catch (FileNotFoundException unused) {
            mhVar.mo172392a();
            return false;
        }
    }

    /* renamed from: b */
    private static void m157954b(String str) {
        if (str != null && str.trim().length() != 0) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
            f340840d = str;
        }
    }

    /* renamed from: b */
    public static String m157953b() {
        return f340840d;
    }

    /* renamed from: a */
    public static void m157948a(C113955mh mhVar, String str) {
        String str2;
        if (m157955b(mhVar, str)) {
            File file = new File(str, C0938ej.f2147b);
            String a = mhVar.mo172391a("indoormap_style_md5");
            String str3 = null;
            if (!TextUtils.isEmpty(a)) {
                C113889km.m157545b(C0949kl.f2236f, "校验文件:indoor_style.dat");
                try {
                    str2 = C113903kv.m157738a(file);
                } catch (FileNotFoundException unused) {
                    str2 = null;
                }
                if (!TextUtils.equals(str2, a)) {
                    C113889km.m157545b(C0949kl.f2236f, "文件md5校验失败:" + str2 + "," + str2);
                    file.delete();
                    mhVar.mo172396a(new String[]{"indoormap_style_version", "indoormap_style_md5"});
                }
            }
            File file2 = new File(str, C0938ej.f2148c);
            String a2 = mhVar.mo172391a("indoormap_style_night_md5");
            if (!TextUtils.isEmpty(a2)) {
                C113889km.m157545b(C0949kl.f2236f, "校验文件:indoor_style_night.dat");
                try {
                    str3 = C113903kv.m157738a(file2);
                } catch (FileNotFoundException unused2) {
                }
                if (!TextUtils.equals(str3, a2)) {
                    C113889km.m157545b(C0949kl.f2236f, "文件md5校验失败:" + str3 + "," + a2);
                    file2.delete();
                    mhVar.mo172396a(new String[]{"indoormap_style_night_version", "indoormap_style_night_md5"});
                }
            }
            File file3 = new File(str, C0938ej.f2150e);
            String a3 = mhVar.mo172391a(C0939el.f2195y);
            if (!TextUtils.isEmpty(a3)) {
                try {
                    if (!TextUtils.equals(C113903kv.m157738a(file3), a3)) {
                        file3.delete();
                        mhVar.mo172396a(new String[]{C0939el.f2189s, C0939el.f2195y});
                    }
                } catch (FileNotFoundException e) {
                    C113889km.m157547b("config error: ", (Throwable) e);
                    mhVar.mo172396a(new String[]{C0939el.f2189s, C0939el.f2195y});
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m157951a(Context context, C113955mh mhVar, String str, String str2, boolean z) {
        String str3;
        InputStream inputStream;
        if (mhVar != null && !(mhVar instanceof C113957mj)) {
            String str4 = C0938ej.f2154i;
            InputStream inputStream2 = null;
            if (str2.startsWith(str4)) {
                str3 = C0939el.f2171a;
            } else if (str2.startsWith(C0938ej.f2155j)) {
                str3 = C0939el.f2174d;
                str4 = C0938ej.f2155j;
            } else if (str2.startsWith("poi_icon")) {
                str3 = C0939el.f2173c;
                str4 = "poi_icon";
            } else {
                str3 = null;
                str4 = null;
            }
            if (str4 == null) {
                return false;
            }
            int b = mhVar.mo172397b(str3);
            String str5 = str + f340841e;
            if (z) {
                try {
                    inputStream = m157952b(context, str5);
                } catch (Exception unused) {
                    C113886kg.m157515a((Closeable) inputStream2);
                } catch (Throwable th) {
                    C113886kg.m157515a((Closeable) inputStream2);
                    throw th;
                }
            } else {
                inputStream = C113886kg.m157521b(str5);
            }
            inputStream2 = inputStream;
            if (inputStream2 == null) {
                C113886kg.m157515a((Closeable) inputStream2);
                return false;
            }
            byte[] b2 = C113886kg.m157522b(inputStream2);
            if (b2 == null) {
                C113886kg.m157515a((Closeable) inputStream2);
                return false;
            }
            int optInt = new JSONObject(new String(b2)).optInt(str4, -1);
            if (optInt == -1) {
                C113886kg.m157515a((Closeable) inputStream2);
                return false;
            } else if (optInt > b) {
                mhVar.mo172396a(new String[]{str3});
                C113886kg.m157515a((Closeable) inputStream2);
                return true;
            } else {
                C113886kg.m157515a((Closeable) inputStream2);
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m157950a(String str) {
        if (str != null && str.trim().length() != 0) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
            f340839c = str;
        }
    }

    /* renamed from: a */
    public static String m157946a() {
        return f340839c;
    }

    /* renamed from: a */
    public static void m157949a(TencentMapOptions tencentMapOptions) {
        String customLocalPath;
        if (tencentMapOptions == null) {
            return;
        }
        if (tencentMapOptions.getCustomAssetsPath() != null) {
            String customAssetsPath = tencentMapOptions.getCustomAssetsPath();
            if (customAssetsPath != null && customAssetsPath.trim().length() != 0) {
                String str = File.separator;
                if (!customAssetsPath.endsWith(str)) {
                    customAssetsPath = customAssetsPath + str;
                }
                f340839c = customAssetsPath;
            }
        } else if (tencentMapOptions.getCustomLocalPath() != null && (customLocalPath = tencentMapOptions.getCustomLocalPath()) != null && customLocalPath.trim().length() != 0) {
            String str2 = File.separator;
            if (!customLocalPath.endsWith(str2)) {
                customLocalPath = customLocalPath + str2;
            }
            f340840d = customLocalPath;
        }
    }

    /* renamed from: a */
    public static final InputStream m157944a(Context context, String str) {
        return m157952b(context, C113798hb.f340496d + str);
    }
}
