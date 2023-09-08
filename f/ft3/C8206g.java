package ft3;

import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.nio.charset.Charset;
import p823sg.C90193h;
import pe3.C89349b;
import z04.C112550d0;
import z04.C119027c;

/* renamed from: ft3.g */
public final class C8206g {

    /* renamed from: a */
    public static final C8206g f27135a = new C8206g();

    /* renamed from: a */
    public final boolean mo9260a(String str, String str2, String str3, boolean z) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C87412m.m108594g(str6, "tag");
        byte[] bArr5 = null;
        boolean z2 = false;
        if (str5 != null) {
            try {
                bArr = str5.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            } catch (Exception unused) {
            }
        } else {
            bArr = null;
        }
        C89349b a = C89349b.m111674a(bArr);
        a.mo123701d(16);
        byte[] f = a.mo123703f();
        StringBuffer stringBuffer = new StringBuffer(f.length);
        for (byte b : f) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        String f2 = C90193h.m112878f(stringBuffer.toString().getBytes());
        boolean z3 = Util.isNullOrNil(str) || C87412m.m108589b(str4, f2);
        if (!z3) {
            if (str4 != null) {
                try {
                    bArr2 = str4.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bArr2, "this as java.lang.String).getBytes(charset)");
                } catch (Exception unused2) {
                    z2 = z3;
                }
            } else {
                bArr2 = null;
            }
            byte[] decode = Base64.decode(bArr2, 0);
            C87412m.m108593f(decode, "decode(maybeDeviceId?.to…eArray(), Base64.DEFAULT)");
            Charset charset = C119027c.f356488a;
            String str7 = new String(decode, charset);
            if (str5 != null) {
                bArr3 = str5.getBytes(charset);
                C87412m.m108593f(bArr3, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr3 = null;
            }
            C89349b a2 = C89349b.m111674a(bArr3);
            a2.mo123701d(16);
            byte[] bArr6 = a2.f257327a;
            C87412m.m108593f(bArr6, "copyFrom(mmGuid?.toByteA…y()).setCLength(16).bytes");
            String str8 = new String(bArr6, charset);
            boolean z4 = Util.isNullOrNil(str7) || C87412m.m108589b(str7, str8);
            if (!z4) {
                try {
                    str8 = Base64.encodeToString(a.mo123703f(), 2);
                    C87412m.m108593f(str8, "encodeToString(deviceIdB…eArray(), Base64.NO_WRAP)");
                    if (!Util.isNullOrNil(str)) {
                        if (!C87412m.m108589b(str4, str8)) {
                            z4 = false;
                        }
                    }
                    z4 = true;
                } catch (Exception unused3) {
                    z2 = z4;
                }
            }
            if (!z4 && z && str4 != null) {
                if (str5 != null) {
                    bArr4 = str5.getBytes(charset);
                    C87412m.m108593f(bArr4, "this as java.lang.String).getBytes(charset)");
                } else {
                    bArr4 = null;
                }
                str8 = Base64.encodeToString(bArr4, 0);
                C87412m.m108593f(str8, "encodeToString(mmGuid?.t…eArray(), Base64.DEFAULT)");
                if (str.length() > 0) {
                    String substring = str4.substring(0, Math.max(0, str.length() - 10));
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (C112550d0.m153801u(str8, substring, false)) {
                        z4 = true;
                    }
                }
                z4 = false;
            }
            if (!z4) {
                if (str5 != null) {
                    bArr5 = str5.getBytes(charset);
                    C87412m.m108593f(bArr5, "this as java.lang.String).getBytes(charset)");
                }
                C89349b a3 = C89349b.m111674a(bArr5);
                a3.mo123701d(16);
                str8 = Util.encodeHexString(a3.f257327a);
                C87412m.m108593f(str8, "encodeHexString(ByteStri…()).setCLength(16).bytes)");
                if (!Util.isNullOrNil(str) && C87412m.m108589b(str4, str8)) {
                    z2 = true;
                }
            } else {
                z2 = z4;
            }
            Log.m105924i(str6, "checkDeviceID, deviceId[" + str4 + "], localDeviceId[" + str8 + "], ret: " + z2);
            return z2;
        }
        Log.m105924i(str6, "checkDeviceUUID, deviceUUId[" + str4 + "], localDeviceUUId[" + f2 + ']');
        return z3;
    }
}
