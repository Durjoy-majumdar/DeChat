package x22;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.location.p069ui.PoiHeaderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: x22.f */
public class C15624f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PoiHeaderView f42252d;

    public C15624f(PoiHeaderView poiHeaderView) {
        this.f42252d = poiHeaderView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/PoiHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        String str = Util.isNullOrNil(this.f42252d.f19879g) ? this.f42252d.f19878f : this.f42252d.f19879g;
        Log.m105919d("MicroMsg.PoiHeaderView", "click url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        C88144b.m109801s(this.f42252d.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/PoiHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
