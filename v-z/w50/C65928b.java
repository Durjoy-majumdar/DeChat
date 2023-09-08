package w50;

import android.graphics.Point;
import android.os.Bundle;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.rtmp.TXLiveConstants;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import kg3.C76577a;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64890zp2;
import z04.C112550d0;

/* renamed from: w50.b */
public final class C65928b {

    /* renamed from: a */
    public static final C65928b f189533a = new C65928b();

    /* renamed from: b */
    public static final C13601g f189534b = C36568h.m40985a(C38012a.f100508d);

    /* renamed from: w50.b$a */
    public static final class C38012a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C38012a f100508d = new C38012a();

        public C38012a() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_finder_live_audio_decoder_switch, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: c */
    public static final String m77657c(C64890zp2 zp22, String str) {
        C87412m.m108594g(str, "url");
        if (zp22 != null && zp22.f186798S > 0) {
            String str2 = zp22.f186799T;
            boolean z = false;
            if (!(str2 == null || str2.length() == 0)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ProviderConstants.API_PATH, "setEncryptionParams");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", str);
                jSONObject2.put("encMode", zp22.f186798S);
                String str3 = zp22.f186800U;
                if (str3 == null || str3.length() == 0) {
                    z = true;
                }
                if (!z) {
                    jSONObject2.put("encIV", zp22.f186800U);
                }
                jSONObject2.put("encKey", zp22.f186799T);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("params", jSONObject2);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "{\n            JSONObject…   }.toString()\n        }");
                return jSONObject3;
            }
        }
        Log.m105920e("Finder.LiveCoreUtil", "genDecryptionParams error!");
        return "";
    }

    /* renamed from: a */
    public final Point mo89963a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            Log.m105924i("Finder.LiveCoreUtil", "calcFloatBallSize invalid, width:" + i + ", height:" + i2);
            return new Point(mo89965d(88), mo89965d(132));
        }
        float f = ((float) i) / ((float) i2);
        Log.m105924i("Finder.LiveCoreUtil", "calcFloatBallSize width:" + i + ", height:" + i2 + ", rate:" + f);
        return f >= 1.5f ? new Point(mo89965d(132), mo89965d(88)) : f >= 0.6666667f ? new Point(mo89965d(108), mo89965d(108)) : new Point(mo89965d(88), mo89965d(132));
    }

    /* renamed from: b */
    public final Point mo89964b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            Log.m105924i("Finder.LiveCoreUtil", "calcSquarePanelSize invalid, width:" + i + ", height:" + i2);
            return new Point(mo89965d(64), mo89965d(96));
        }
        float f = ((float) i) / ((float) i2);
        return f >= 1.5f ? new Point(mo89965d(96), mo89965d(64)) : f >= 0.6666667f ? new Point(mo89965d(80), mo89965d(80)) : new Point(mo89965d(64), mo89965d(96));
    }

    /* renamed from: d */
    public final int mo89965d(int i) {
        return C76577a.m92151b(MMApplicationContext.getContext(), i);
    }

    /* renamed from: e */
    public final String mo89966e(String str) {
        int i;
        boolean z = true;
        if (str == null || str.length() == 0) {
            return null;
        }
        int E = C112550d0.m153769E(str, "?", 0, false, 6, (Object) null);
        if (E != -1) {
            str = str.substring(0, E);
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        int H = C112550d0.m153772H(str, "/", 0, false, 6, (Object) null);
        int length = str.length();
        if (H != -1 && (i = H + 1) <= length) {
            str = str.substring(i);
            C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
        }
        if (str.length() == 0) {
            return null;
        }
        int E2 = C112550d0.m153769E(str, ".", 0, false, 6, (Object) null);
        if (E2 != -1) {
            str = str.substring(0, E2);
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (str.length() != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    public final boolean mo89967f() {
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG;
    }

    /* renamed from: f */
    public final boolean mo89968f(int i, Bundle bundle) {
        if (i != 2103) {
            return false;
        }
        String string = bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION) : null;
        if (string == null || !C112550d0.m153801u(string, "1001", false) || !C112550d0.m153801u(string, "java.io.FileNotFoundException", false)) {
            return false;
        }
        return true;
    }
}
