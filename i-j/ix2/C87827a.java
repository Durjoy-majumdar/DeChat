package ix2;

import a70.C112760b;
import android.content.res.AssetManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import cy3.C86147a;
import gy3.C8480h;
import gy3.C87412m;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: ix2.a */
public final class C87827a {

    /* renamed from: a */
    public static final C87828a f254266a = new C87828a((C8480h) null);

    /* renamed from: ix2.a$a */
    public static final class C87828a {
        public C87828a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo122280a(String str) {
            String str2;
            C87412m.m108594g(str, "appId");
            AssetManager assets = MMApplicationContext.getContext().getAssets();
            try {
                if (C87412m.m108589b(str, "wx2f3fb5db9f226462")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("jsapi");
                    String str3 = File.separator;
                    sb.append(str3);
                    sb.append("surface");
                    sb.append(str3);
                    sb.append("wx2f3fb5db9f226462.wspkg");
                    str2 = sb.toString();
                } else if (C87412m.m108589b(str, "wxe208ce76dfa39515")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("jsapi");
                    String str4 = File.separator;
                    sb4.append(str4);
                    sb4.append("surface");
                    sb4.append(str4);
                    sb4.append("app");
                    sb4.append(str4);
                    sb4.append("wxe208ce76dfa39515.wspkg");
                    str2 = sb4.toString();
                } else {
                    str2 = "";
                }
                InputStream open = assets.open(str2);
                String mD5String = MD5Util.getMD5String(C86147a.m106661c(open));
                C87412m.m108593f(mD5String, "getMD5String(inputStream.readBytes())");
                Util.qualityClose(open);
                return mD5String;
            } catch (Exception e) {
                Log.printErrStackTrace("MagicLiveCardFileUtil", e, e.getMessage(), new Object[0]);
                Util.qualityClose((Closeable) null);
                return "";
            } catch (Throwable th) {
                Util.qualityClose((Closeable) null);
                throw th;
            }
        }

        /* renamed from: b */
        public final String mo122281b(String str) {
            C87412m.m108594g(str, "appId");
            String str2 = C112760b.m154195C() + "surface/";
            String str3 = str2 + "app/";
            switch (str.hashCode()) {
                case -1811583232:
                    if (!str.equals("wx2f3fb5db9f226462")) {
                        return "";
                    }
                    return str2 + str + ".wspkg";
                case -702916869:
                    if (!str.equals("wx9e221f7828fa7482")) {
                        return "";
                    }
                    return str3 + str + ".wspkg";
                case 190545547:
                    if (!str.equals("wxe208ce76dfa39515")) {
                        return "";
                    }
                    return str3 + str + ".wspkg";
                case 1502683169:
                    if (!str.equals("wx4edd479d258d7f25")) {
                        return "";
                    }
                    return str2 + "basic.wspkg";
                default:
                    return "";
            }
        }
    }
}
