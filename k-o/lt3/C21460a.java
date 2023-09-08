package lt3;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import org.json.JSONException;
import org.json.JSONObject;
import ot3.C117897l;
import ot3.C21881e;
import ot3.C21885g;
import ot3.C21886i;
import ot3.C21889m;
import ot3.C47400b;
import pt3.C110247f;
import pt3.C22004a;
import pt3.C22005b;
import pt3.C22006c;
import pt3.C22007d;

/* renamed from: lt3.a */
public class C21460a implements C47400b {

    /* renamed from: b */
    public static C110247f f60757b;

    /* renamed from: c */
    public static C22005b f60758c;

    static {
        C21881e.m25084c("Soter.SoterCore", "soter: SoterCore is call static block to init SoterCore IMPL", new Object[0]);
        C22005b f = m24272f();
        f60758c = f;
        boolean z = true;
        Object[] objArr = new Object[1];
        if (f != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        C21881e.m25084c("Soter.SoterCore", "soter: SoterCore is call static block to init SoterCore IMPL, IMPL is null[%b]", objArr);
    }

    /* renamed from: a */
    public static C21889m m24267a(byte[] bArr) {
        C21889m mVar = null;
        if (bArr == null || bArr.length <= 0) {
            C21881e.m25083b("Soter.SoterCore", "origin is null or nil. abort", new Object[0]);
            return null;
        } else if (bArr.length < 4) {
            C21881e.m25083b("Soter.SoterCore", "soter: length not correct 1", new Object[0]);
            return null;
        } else {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i += (bArr2[i2] & ExifInterface.MARKER) << (i2 * 8);
            }
            C21881e.m25082a("Soter", "parsed raw length: " + i, new Object[0]);
            if (i > 1048576) {
                C21881e.m25083b("Soter.SoterCore", "soter: too large signature result!", new Object[0]);
                return null;
            }
            byte[] bArr3 = new byte[i];
            int i3 = i + 4;
            if (bArr.length <= i3) {
                C21881e.m25083b("Soter.SoterCore", "soter: length not correct 2", new Object[0]);
                return null;
            }
            System.arraycopy(bArr, 4, bArr3, 0, i);
            String str = new String(bArr3);
            try {
                JSONObject jSONObject = new JSONObject(str);
                C21889m mVar2 = new C21889m();
                mVar2.f61899j = str;
                mVar2.f61890a = jSONObject.optString(ShareConstants.DEXMODE_RAW);
                mVar2.f61891b = jSONObject.optString("fid");
                mVar2.f61892c = jSONObject.optLong("counter");
                mVar2.f61893d = jSONObject.optString("tee_n");
                mVar2.f61894e = jSONObject.optString("tee_v");
                mVar2.f61895f = jSONObject.optString("fp_n");
                mVar2.f61896g = jSONObject.optString("fp_v");
                mVar2.f61897h = jSONObject.optString("cpu_id");
                mVar2.f61898i = jSONObject.optInt("rsa_pss_saltlen", 20);
                mVar = mVar2;
            } catch (JSONException e) {
                C21881e.m25083b("Soter.SoterSignatureResult", "soter: convert from json failed." + e.toString(), new Object[0]);
            }
            int length = bArr.length - i3;
            C21881e.m25082a("Soter.SoterCore", "soter: signature length: " + length, new Object[0]);
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr, i3, bArr4, 0, length);
            if (mVar != null) {
                mVar.f61900k = Base64.encodeToString(bArr4, 2);
            }
            return mVar;
        }
    }

    /* renamed from: b */
    public static String m24268b() {
        StringBuilder sb = new StringBuilder();
        sb.append("<deviceinfo>");
        sb.append("<MANUFACTURER name=\"");
        sb.append(Build.MANUFACTURER);
        sb.append("\">");
        sb.append("<MODEL name=\"");
        sb.append(Build.MODEL);
        sb.append("\">");
        sb.append("<VERSION_RELEASE name=\"");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\">");
        sb.append("<VERSION_INCREMENTAL name=\"");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append("\">");
        sb.append("<DISPLAY name=\"");
        sb.append(Build.DISPLAY);
        sb.append("\">");
        sb.append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
        C21881e.m25082a("Soter.SoterCore", "soter: getFingerprint  " + sb.toString(), new Object[0]);
        return sb.toString();
    }

    /* renamed from: c */
    public static C117897l m24269c() {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35098d();
        }
        C21881e.m25083b("Soter.SoterCore", "soter: getAppGlobalSecureKeyModel IMPL is null, not support soter", new Object[0]);
        return null;
    }

    /* renamed from: d */
    public static Signature m24270d(String str) {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35102e(str);
        }
        C21881e.m25083b("Soter.SoterCore", "soter: getAuthInitAndSign IMPL is null, not support soter", new Object[0]);
        return null;
    }

    /* renamed from: e */
    public static C117897l m24271e(String str) {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35103f(str);
        }
        C21881e.m25083b("Soter.SoterCore", "soter: getAuthKeyModel IMPL is null, not support soter", new Object[0]);
        return null;
    }

    /* renamed from: f */
    public static C22005b m24272f() {
        Provider[] providers;
        C22006c.m25378v();
        if (C21886i.f61888a.mo34912a() || (providers = Security.getProviders()) == null) {
            return null;
        }
        for (Provider name : providers) {
            String name2 = name.getName();
            if (name2 != null && name2.startsWith("SoterKeyStore")) {
                return name2.split("\\.").length > 1 ? new C22004a(name2) : new C22006c(name2);
            }
        }
        return null;
    }

    /* renamed from: g */
    public static int m24273g() {
        C22005b bVar = f60758c;
        if (bVar == null) {
            return 0;
        }
        if (bVar instanceof C22007d) {
            C21881e.m25082a("Soter.SoterCore", "getSoterCoreType is TREBLE", new Object[0]);
            return 1;
        }
        C21881e.m25082a("Soter.SoterCore", "getSoterCoreType is not TREBLE", new Object[0]);
        return 0;
    }

    /* renamed from: h */
    public static boolean m24274h() {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35104g();
        }
        C21881e.m25083b("Soter.SoterCore", "soter: hasAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
        return false;
    }

    /* renamed from: i */
    public static boolean m24275i(String str) {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35105h(str);
        }
        C21881e.m25083b("Soter.SoterCore", "soter: hasAuthKey IMPL is null, not support soter", new Object[0]);
        return false;
    }

    /* renamed from: j */
    public static boolean m24276j() {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35108k();
        }
        C21881e.m25083b("Soter.SoterCore", "soter: isAppGlobalSecureKeyValid IMPL is null, not support soter", new Object[0]);
        return false;
    }

    /* renamed from: k */
    public static boolean m24277k(Context context, int i) {
        return !BiometricManagerCompat.from(context, Integer.valueOf(i)).isCurrentFailTimeAvailable() && !BiometricManagerCompat.from(context, Integer.valueOf(i)).isCurrentTweenTimeAvailable(context);
    }

    /* renamed from: l */
    public static boolean m24278l() {
        C22005b bVar = f60758c;
        if (bVar == null) {
            C21881e.m25083b("Soter.SoterCore", "soter: isNativeSupportSoter IMPL is null, not support soter", new Object[0]);
            return false;
        }
        boolean m = bVar.mo35110m();
        C21881e.m25083b("Soter.SoterCore", "soter: isNativeSupportSoter return[" + m + "]", new Object[0]);
        return m;
    }

    /* renamed from: m */
    public static boolean m24279m(Context context, int i) {
        boolean isHardwareDetected = BiometricManagerCompat.from(context, Integer.valueOf(i)).isHardwareDetected();
        C21881e.m25083b("Soter.SoterCore", "soter: isSupportBiometric type[" + i + "] return[" + isHardwareDetected + "]", new Object[0]);
        return isHardwareDetected;
    }

    @Deprecated
    /* renamed from: n */
    public static boolean m24280n(Context context) {
        boolean isHardwareDetected = BiometricManagerCompat.from(context, 1).isHardwareDetected();
        C21881e.m25083b("Soter.SoterCore", "soter: isSupportFingerprint return[" + isHardwareDetected + "]", new Object[0]);
        return isHardwareDetected;
    }

    @Deprecated
    /* renamed from: o */
    public static boolean m24281o(Context context) {
        return BiometricManagerCompat.from(context, 1).hasEnrolledBiometric();
    }

    /* renamed from: p */
    public static boolean m24282p() {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35111n();
        }
        C21881e.m25083b("Soter.SoterCore", "soter: isTrebleServiceConnected IMPL is null, not support soter", new Object[0]);
        return false;
    }

    /* renamed from: q */
    public static C21885g m24283q() {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35112o();
        }
        C21881e.m25083b("Soter.SoterCore", "soter: removeAppGlobalSecureKey IMPL is null, not support soter", new Object[0]);
        return new C21885g(2);
    }

    /* renamed from: r */
    public static C21885g m24284r(String str, boolean z) {
        C22005b bVar = f60758c;
        if (bVar != null) {
            return bVar.mo35113p(str, z);
        }
        C21881e.m25083b("Soter.SoterCore", "soter: removeAuthKey IMPL is null, not support soter", new Object[0]);
        return new C21885g(2);
    }
}
