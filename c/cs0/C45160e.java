package cs0;

import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.v75;

/* renamed from: cs0.e */
public final class C45160e implements C0120a0<v75> {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f122447d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandUserInfoRevokePage f122448e;

    /* renamed from: f */
    public final /* synthetic */ C45181m f122449f;

    /* renamed from: g */
    public final /* synthetic */ LinearLayoutManager f122450g;

    public C45160e(RecyclerView recyclerView, AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, C45181m mVar, LinearLayoutManager linearLayoutManager) {
        this.f122447d = recyclerView;
        this.f122448e = appBrandUserInfoRevokePage;
        this.f122449f = mVar;
        this.f122450g = linearLayoutManager;
    }

    public void onChanged(Object obj) {
        Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#initContentArea");
        if (!C45152a0.f122426a.mo70660e((v75) obj)) {
            Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#initContentArea, rawUsageInfo is null or invalid");
            return;
        }
        this.f122447d.post(new C45158d(this.f122449f, this.f122450g));
        this.f122448e.mo63404K().f122461f.removeObserver(this);
    }
}
