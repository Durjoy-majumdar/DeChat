package dt3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Parcel;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.util.AndroidUtilsLight;
import ct3.C86142f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: dt3.e */
public class C86401e extends C86142f {
    /* renamed from: b */
    public String mo120556b(Context context, IBinder iBinder) {
        Signature[] signatureArr;
        String packageName = context.getPackageName();
        String str = null;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (Throwable unused) {
            signatureArr = null;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            byte[] byteArray = signatureArr[0].toByteArray();
            try {
                MessageDigest instance = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1);
                if (instance != null) {
                    byte[] digest = instance.digest(byteArray);
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(Integer.toHexString((b & ExifInterface.MARKER) | 256).substring(1, 3));
                    }
                    str = sb.toString();
                }
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            obtain.writeString(packageName);
            obtain.writeString(str);
            obtain.writeString("OUID");
            iBinder.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public Intent mo120558d() {
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        return intent;
    }
}
