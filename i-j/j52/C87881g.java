package j52;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import g52.C87160b;
import java.io.UnsupportedEncodingException;
import p206nj.C117627q;

/* renamed from: j52.g */
public final class C87881g {
    /* renamed from: a */
    public static void m109359a(String str, String str2, String str3, String str4, long j, long j2, int i, int i2, int i3, String str5, String str6) {
        String str7;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        C87160b.C87161a aVar = C87160b.C87161a.None;
        try {
            str7 = C117627q.m165909b(str11, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            Log.m105928w("MicroMsg.MagicBrush.Report.kv_27740", "kv_27740 report UnsupportedEncodingException");
            str7 = str11;
        }
        MMApplicationContext.getContext();
        C87160b.C87161a aVar2 = C87160b.C87161a.Unknown;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        if (activeNetworkInfo.getType() == 1) {
                            aVar2 = C87160b.C87161a.Wifi;
                        } else {
                            if (!(activeNetworkInfo.getSubtype() == 2 || activeNetworkInfo.getSubtype() == 1)) {
                                if (activeNetworkInfo.getSubtype() != 4) {
                                    if (activeNetworkInfo.getSubtype() >= 5 && activeNetworkInfo.getSubtype() < 13) {
                                        aVar2 = C87160b.C87161a.Mobile_3g;
                                    } else if (activeNetworkInfo.getSubtype() >= 13 && activeNetworkInfo.getSubtype() < 20) {
                                        aVar2 = C87160b.C87161a.Mobile_4g;
                                    } else if (activeNetworkInfo.getSubtype() >= 20) {
                                        aVar2 = C87160b.C87161a.Mobile_5g;
                                    }
                                }
                            }
                            aVar2 = C87160b.C87161a.Mobile_2g;
                        }
                    }
                }
                aVar2 = aVar;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MagicBrushNetworkUtil", e, "", new Object[0]);
        }
        String str14 = aVar2 != aVar ? aVar2.f252779d : "offline";
        C115669n.INSTANCE.mo160131h(27740, str8, str14, str9, str11, str10, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str12, str13);
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.MagicBrush.Report.kv_27740", "report kv_27740{" + "bizName='" + str8 + '\'' + ", networkType='" + str14 + '\'' + ", functionName='" + str9 + '\'' + ", url='" + str7 + '\'' + ", method='" + str10 + '\'' + ", sentsize=" + j + ", receivedsize=" + j2 + ", statusCode=" + i + ", result=" + i2 + ", costtime=" + i3 + ", dstPath=" + str12 + ", contentType=" + str13 + '}');
        }
    }
}
