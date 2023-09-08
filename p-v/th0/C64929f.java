package th0;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import gy3.C87412m;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: th0.f */
public final class C64929f implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ Activity f186963a;

    public C64929f(Activity activity) {
        this.f186963a = activity;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        Activity activity = this.f186963a;
        C76701a.makeText((Context) activity, (CharSequence) activity.getResources().getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getToastSysCameraPath()}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        Activity activity = this.f186963a;
        C76701a.makeText((Context) activity, (CharSequence) activity.getResources().getString(C0966R.string.cr4), 1).show();
    }
}
