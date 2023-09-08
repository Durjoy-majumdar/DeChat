package i81;

import android.content.ContentResolver;
import android.provider.Settings;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117293c;

/* renamed from: i81.f */
public final class C87678f implements C117293c {

    /* renamed from: a */
    public String f253957a;

    /* renamed from: a */
    public Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        Log.m105918d("MicroMsg.SensitiveApiCallPatch", "otherSensitiveMethods. hook call " + str4 + " from " + str + '#' + str2);
        if (!C87412m.m108589b(str4, "getString")) {
            return null;
        }
        C87412m.m108591d(objArr);
        String str6 = objArr[1];
        C87412m.m108592e(str6, "null cannot be cast to non-null type kotlin.String");
        if (C87412m.m108589b(str6, "android_id")) {
            if (this.f253957a == null) {
                this.f253957a = Settings.Secure.getString(MMApplicationContext.getContext().getContentResolver(), "android_id");
            }
            return this.f253957a;
        }
        ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
        String str7 = objArr[1];
        C87412m.m108592e(str7, "null cannot be cast to non-null type kotlin.String");
        return Settings.Secure.getString(contentResolver, str7);
    }
}
