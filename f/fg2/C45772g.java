package fg2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import ke3.C88144b;

/* renamed from: fg2.g */
public final class C45772g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f123669d;

    public C45772g(RadarMemberView radarMemberView) {
        this.f123669d = radarMemberView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C72996z1 z1Var = this.f123669d.f203313u;
        intent.putExtra("k_username", z1Var != null ? z1Var.getUsername() : null);
        intent.putExtra("showShare", false);
        String str = C74928u.C45092d.f122306a;
        C87412m.m108593f(str, "KExposeH5Url");
        String format = String.format(str, Arrays.copyOf(new Object[]{38}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        intent.putExtra("rawUrl", format);
        C88144b.m109791i(this.f123669d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
