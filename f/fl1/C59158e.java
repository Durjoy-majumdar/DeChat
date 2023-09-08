package fl1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54410e;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import dh1.C58264a;
import gy3.C87412m;
import vk1.C65760a;

/* renamed from: fl1.e */
public final class C59158e extends C58264a {

    /* renamed from: i */
    public final String f169183i = "FinderLiveAnchorEndUIC";

    /* renamed from: j */
    public FinderLiveAnchorAfterPlugin f169184j;

    /* renamed from: fl1.e$a */
    public static final class C59159a implements C54410e {
        public void callback(int i, Bundle bundle) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59158e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* renamed from: m */
    public void mo83044m(C65760a aVar) {
        C87412m.m108594g(aVar, "baseRouter");
        super.mo83044m(aVar);
        C65760a aVar2 = this.f166837f;
        if (aVar2 != null) {
            View findViewById = aVar2.findViewById(C0966R.C0970id.dan);
            C87412m.m108593f(findViewById, "it.findViewById(R.id.fin…ive_anchor_after_ui_root)");
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = new FinderLiveAnchorAfterPlugin((ViewGroup) findViewById, aVar2);
            this.f169184j = finderLiveAnchorAfterPlugin;
            finderLiveAnchorAfterPlugin.mo10792g(8);
        }
    }

    /* renamed from: n */
    public final void mo84366n() {
        C54655b bVar = this.f166839h;
        if (bVar != null) {
            bVar.mo85676R(new C59159a());
        }
    }
}
