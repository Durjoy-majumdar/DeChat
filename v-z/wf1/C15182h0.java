package wf1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: wf1.h0 */
public final class C15182h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41341d;

    public C15182h0(C15193l lVar) {
        this.f41341d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15193l lVar = this.f41341d;
        lVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://findeross.weixin.qq.com/cgi-bin/mmfindernodelivecrmwebbroker-bin/helper-center/pages/fbArCvD434eSWLSf");
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(lVar.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
