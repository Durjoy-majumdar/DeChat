package u73;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import kj2.C117407d;

/* renamed from: u73.q0 */
public class C14136q0 {

    /* renamed from: a */
    public static final /* synthetic */ int f39567a = 0;

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static void m13469a(int i, String str, String str2, boolean z, String str3, int i2, String str4, boolean z2, String str5) {
        int i3 = i;
        if (i3 == 3 || i3 == 20 || i3 == 10000 || i3 == 103) {
            m13475g(300, i, str, str2, str5, 0, z, "", true, str3, str4, i2, z2);
        } else {
            m13475g(C1862l.CTRL_INDEX, i, str, str2, str5, 0, z, "", true, str3, str4, i2, z2);
        }
    }

    /* renamed from: b */
    public static int m13470b(int i) {
        return i != 21 ? i != 104 ? i != 201 ? C43471q.m46977a(0) : C43471q.f117492a : C43471q.m46977a(9) : C43471q.m46977a(1);
    }

    /* renamed from: c */
    public static String m13471c() {
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isConnected(context)) {
            Log.m105926v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, not connected");
            return "fail";
        }
        int netType = NetStatusUtil.getNetType(context);
        Log.m105926v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, type = " + netType);
        if (NetStatusUtil.is2G(context)) {
            Log.m105926v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 2g");
            return "2g";
        } else if (NetStatusUtil.is3G(context)) {
            Log.m105926v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 3g");
            return "3g";
        } else if (NetStatusUtil.is4G(context)) {
            Log.m105926v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, 4g");
            return "4g";
        } else if (!NetStatusUtil.isWifi(context)) {
            return "fail";
        } else {
            Log.m105926v("MicroMsg.WebSearch.WebSearchActionTracer", "getNetworkType, wifi");
            return "wifi";
        }
    }

    /* renamed from: d */
    public static void m13472d(int i, String str, String str2, boolean z, String str3, int i2, String str4, boolean z2, String str5) {
        int i3 = i;
        if (i3 == 3 || i3 == 20 || i3 == 10000 || i3 == 103) {
            m13475g(302, i, str, str2, str5, 0, z, "", true, str3, str4, i2, z2);
        }
    }

    /* renamed from: e */
    public static void m13473e(int i, String str, String str2, boolean z, String str3, int i2, String str4, boolean z2, String str5) {
        int i3 = i;
        if (i3 == 3 || i3 == 20 || i3 == 10000 || i3 == 103) {
            m13475g(301, i, str, str2, str5, 0, z, "", true, str3, str4, i2, z2);
        }
    }

    /* renamed from: f */
    public static void m13474f(int i, int i2, String str, String str2, String str3, int i3, boolean z, String str4, boolean z2, String str5, String str6, int i4) {
        m13475g(i, i2, str, str2, str3, i3, z, str4, z2, str5, str6, i4, false);
    }

    /* renamed from: g */
    public static void m13475g(int i, int i2, String str, String str2, String str3, int i3, boolean z, String str4, boolean z2, String str5, String str6, int i4, boolean z3) {
        int i5 = i;
        String str7 = str;
        String str8 = str2;
        String str9 = str4;
        String str10 = str5;
        int i6 = z2 ? 1 : 2;
        if (i5 == 1 || i5 == 10 || i5 == 12) {
            i6 = 0;
        }
        Object[] objArr = new Object[1];
        Object[] objArr2 = new Object[16];
        objArr2[0] = Integer.valueOf(i);
        objArr2[1] = Integer.valueOf(i2);
        String str11 = "";
        objArr2[2] = Util.nullAs(str7, str11);
        objArr2[3] = Util.nullAs(str8, str11);
        objArr2[4] = TextUtils.isEmpty(str3) ? str11 : str3;
        objArr2[5] = Integer.valueOf(i3);
        objArr2[6] = Integer.valueOf(z ? 1 : 0);
        objArr2[7] = Util.nullAs(str9, str11);
        objArr2[8] = Long.valueOf(System.currentTimeMillis());
        objArr2[9] = m13471c();
        objArr2[10] = Integer.valueOf(i6);
        objArr2[11] = Util.nullAs(str10, str11);
        objArr2[12] = TextUtils.isEmpty(str6) ? str11 : str6;
        objArr2[13] = Integer.valueOf(i4);
        objArr2[14] = Integer.valueOf(m13470b(i2));
        objArr2[15] = Integer.valueOf(z3 ? 1 : 0);
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < 15; i7++) {
            sb.append(String.valueOf(objArr2[i7]).replace(',', ' '));
            sb.append(',');
        }
        sb.append(String.valueOf(objArr2[15]));
        objArr[0] = sb.toString();
        Log.m105925i("MicroMsg.WebSearch.WebSearchActionTracer", "reporting 14904 %s ", objArr);
        C117407d dVar = C117407d.INSTANCE;
        Object[] objArr3 = new Object[16];
        objArr3[0] = Integer.valueOf(i);
        objArr3[1] = Integer.valueOf(i2);
        objArr3[2] = Util.nullAs(str7, str11);
        objArr3[3] = Util.nullAs(str8, str11);
        objArr3[4] = TextUtils.isEmpty(str3) ? str11 : str3;
        objArr3[5] = Integer.valueOf(i3);
        objArr3[6] = Integer.valueOf(z);
        objArr3[7] = Util.nullAs(str9, str11);
        objArr3[8] = Long.valueOf(System.currentTimeMillis());
        objArr3[9] = m13471c();
        objArr3[10] = Integer.valueOf(i6);
        objArr3[11] = Util.nullAs(str10, str11);
        if (!TextUtils.isEmpty(str6)) {
            str11 = str6;
        }
        objArr3[12] = str11;
        objArr3[13] = Integer.valueOf(i4);
        objArr3[14] = Integer.valueOf(m13470b(i2));
        objArr3[15] = Integer.valueOf(z3);
        dVar.mo160131h(14904, objArr3);
    }

    /* renamed from: h */
    public static void m13476h(int i, String str, String str2, boolean z, String str3, int i2) {
        m13474f(10, i, str, str2, "", 0, z, "", true, str3, "", i2);
    }
}
