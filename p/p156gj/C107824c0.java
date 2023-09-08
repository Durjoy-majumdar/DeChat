package p156gj;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import java.util.Map;

/* renamed from: gj.c0 */
public class C107824c0 {

    /* renamed from: c */
    public static boolean f322783c;

    /* renamed from: a */
    public Map<String, String> f322784a = null;

    /* renamed from: b */
    public int f322785b = 0;

    /* renamed from: a */
    public void mo158237a(Map<String, String> map) {
        this.f322784a = map;
    }

    /* renamed from: b */
    public void mo158238b(int i) {
        this.f322785b = i;
        f322783c = true;
        SharedPreferences.Editor edit = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "system_config_prefs", 4).edit();
        edit.putInt("update_swip_back_status", i);
        edit.commit();
        Log.m105927v("MicroMsg.ManuFacturerInfo", "update mSwipBackStatus(%s)", Integer.valueOf(this.f322785b));
    }
}
