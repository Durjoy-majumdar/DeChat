package js0;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import junit.framework.Assert;
import org.xwalk.core.XWalkEnvironment;
import p224ra.C12964b;

/* renamed from: js0.u */
public class C46574u {

    /* renamed from: js0.u$a */
    public interface C46575a extends C12964b {
        /* renamed from: I4 */
        String mo63272I4();

        String identity();
    }

    /* renamed from: a */
    public static <T extends C46575a> String m51897a(Context context, String str, T t) {
        String str2;
        boolean z = true;
        Assert.assertTrue("Luggage.UserAgentUtil, appendUserAgent fail, context is null, stack = " + Util.getStack(), context != null);
        if (t != null) {
            if (str == null) {
                str2 = t.identity();
            } else {
                str2 = str + t.identity();
            }
            str = str2 + t.mo63272I4();
        }
        StringBuilder sb = new StringBuilder();
        sb.append((str + " NetType/" + NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext())) + " Language/" + LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        sb.append(" ABI/");
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(strArr[i])) {
                break;
            } else {
                i++;
            }
        }
        sb.append(z ? "arm64" : "arm32");
        String sb4 = sb.toString();
        Log.m105924i("Luggage.UserAgentUtil", "appendUserAgent, uaStr = " + sb4);
        return sb4;
    }
}
