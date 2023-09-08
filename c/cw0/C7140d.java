package cw0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p003ay.C0235b;

/* renamed from: cw0.d */
public class C7140d implements C0235b.C0236a {

    /* renamed from: a */
    public final /* synthetic */ Context f25110a;

    public C7140d(Context context) {
        this.f25110a = context;
    }

    /* renamed from: a */
    public void mo270a(boolean z, String str, int i) {
        if (z) {
            this.f25110a.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("no_more_show_add_short_cut_dialog", true).commit();
        }
    }
}
