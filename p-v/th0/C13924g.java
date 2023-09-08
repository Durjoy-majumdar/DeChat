package th0;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import gy3.C87412m;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: th0.g */
public final class C13924g implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ String f39126a;

    /* renamed from: b */
    public final /* synthetic */ Activity f39127b;

    public C13924g(String str, Activity activity) {
        this.f39126a = str;
        this.f39127b = activity;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        Log.m105925i("MicroMsg.AlbumUtil", "save video now video path %s out path %s", this.f39126a, str2);
        Activity activity = this.f39127b;
        C76701a.makeText((Context) activity, (CharSequence) activity.getResources().getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        AndroidMediaUtil.refreshMediaScanner(str2, this.f39127b);
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        Log.m105925i("MicroMsg.AlbumUtil", "save video now video path %s out path %s", this.f39126a, str2);
        Activity activity = this.f39127b;
        C76701a.makeText((Context) activity, (CharSequence) activity.getResources().getString(C0966R.string.kag), 1).show();
    }
}
