package p988jj;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;
import java.util.Map;
import kj2.C117407d;
import org.json.JSONObject;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* renamed from: jj.a */
public final class C87968a {

    /* renamed from: jj.a$a */
    public static class C87969a {

        /* renamed from: jj.a$a$a */
        public static final class C87970a {
            /* renamed from: a */
            public static void m109467a(String str, Throwable th, Map<String, Object> map, String... strArr) {
                String str2;
                String a = C87968a.m109465a();
                String str3 = "";
                String replace = th == null ? str3 : Log.getStackTraceString(th).replace(10, ';').replace("\t", str3);
                String str4 = strArr.length >= 1 ? strArr[0] : str3;
                String str5 = strArr.length >= 2 ? strArr[1] : str3;
                String str6 = strArr.length >= 3 ? strArr[2] : str3;
                String str7 = strArr.length >= 4 ? strArr[3] : str3;
                if (strArr.length >= 5) {
                    str3 = strArr[4];
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("key5", str3);
                map.put("dev-fingerprint", Build.FINGERPRINT);
                try {
                    str2 = new JSONObject(map).toString().replace(",", ";");
                } catch (Exception e) {
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.CompatReporter", e, "json error", new Object[0]);
                    str2 = e.getMessage();
                }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.CompatReporter", "#reportCommon: " + str);
                C87969a.m109466a(1, 0, str, a, replace, str4, str5, str6, str7, str2);
            }
        }

        /* renamed from: a */
        public static void m109466a(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            C117407d.INSTANCE.mo160131h(23773, Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, str4, str5, str6, str7, str8, BuildInfo.REV);
        }
    }

    /* renamed from: a */
    public static String m109465a() {
        String processName = MMApplicationContext.getProcessName();
        return TextUtils.isEmpty(processName) ? "" : processName.contains(XVFSFile.PATH_SEPARATOR) ? processName.substring(processName.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1) : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
    }
}
