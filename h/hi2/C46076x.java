package hi2;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.security.MessageDigest;

/* renamed from: hi2.x */
public final class C46076x {

    /* renamed from: a */
    public static final C46076x f124226a = new C46076x();

    /* renamed from: a */
    public final String mo71516a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            C87412m.m108593f(hexString, "toHexString(0xFF and bArray[i].toInt())");
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            String upperCase = hexString.toUpperCase();
            C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase()");
            stringBuffer.append(upperCase);
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public final boolean mo71517b(Context context) {
        C87412m.m108594g(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.weishi", 64);
            if (packageInfo != null) {
                byte[] byteArray = packageInfo.signatures[0].toByteArray();
                MessageDigest instance = MessageDigest.getInstance("MD5");
                C87412m.m108591d(instance);
                instance.update(byteArray);
                if (Util.isEqual(mo71516a(instance.digest()), "2A281593D71DF33374E6124E9106DF08")) {
                    return true;
                }
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.WeSeeUtil", "checkWeishiInstalled Exception: %s", e.getMessage());
        }
        return false;
    }
}
