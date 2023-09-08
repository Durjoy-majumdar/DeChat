package a70;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: a70.c */
public class C0014c {

    /* renamed from: b */
    public static C0014c f14b = new C0014c((SharedPreferences) null);

    /* renamed from: a */
    public final SharedPreferences f15a;

    public C0014c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            this.f15a = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        } else {
            this.f15a = sharedPreferences;
        }
    }

    /* renamed from: a */
    public String mo19a(String str, String str2) {
        return this.f15a.getString(str, str2);
    }
}
