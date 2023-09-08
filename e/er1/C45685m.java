package er1;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import java.security.MessageDigest;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;

/* renamed from: er1.m */
public final class C45685m {

    /* renamed from: a */
    public static final C45685m f123489a = new C45685m();

    /* renamed from: a */
    public final String mo71186a(byte[] bArr) {
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
    public final boolean mo71187b(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "packageName");
        C87412m.m108594g(str2, "publicKey");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                byte[] byteArray = packageInfo.signatures[0].toByteArray();
                MessageDigest instance = MessageDigest.getInstance("MD5");
                C87412m.m108591d(instance);
                instance.update(byteArray);
                if (Util.isEqual(mo71186a(instance.digest()), str2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            Log.m105929w("Finder.CheckDownloadUtil", "checkInstalled " + str + " Exception: %s", e.getMessage());
        }
        return false;
    }

    /* renamed from: c */
    public final void mo71188c(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "downloadUrl");
        C87412m.m108594g(str2, "appId");
        Log.m105924i("Finder.CheckDownloadUtil", "download SecondCut url " + str);
        if (str2.equals("wxa5e0de08d96cc09d")) {
            C10770c cVar = new C10770c(context);
            cVar.f32244b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
        }
    }
}
