package mo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import dp1.C7435f2;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: mo1.g0 */
public final class C11002g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f32715d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileHeaderUIC f32716e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f32717f;

    public C11002g0(String str, FinderProfileHeaderUIC finderProfileHeaderUIC, JSONObject jSONObject) {
        this.f32715d = str;
        this.f32716e = finderProfileHeaderUIC;
        this.f32717f = jSONObject;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLuckMoneyCoverLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f32715d);
        C49712hj1 hj12 = null;
        C88144b.m109791i(this.f32716e.getActivity(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f32716e.getContext());
        if (f != null) {
            hj12 = f.mo12861q3();
        }
        f2Var.mo8577a(hj12, "get_red_cover_panel", 1, this.f32717f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLuckMoneyCoverLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
