package ed3;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: ed3.a */
public class C7635a {
    /* renamed from: a */
    public static String m7763a(String str, HashMap<String, String> hashMap) {
        String str2 = hashMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        Log.m105920e("MicroMsg.MallManager", "getWapPayKey key: " + str + " value is empty");
        return "";
    }
}
