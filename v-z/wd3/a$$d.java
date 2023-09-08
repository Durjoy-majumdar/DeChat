package wd3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.pq4;

public class a$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ pq4 f148294d;

    public a$$d(C78543a aVar, pq4 pq4) {
        this.f148294d = pq4;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/AddContact$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f148294d.f139907f.f140489g);
        C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/AddContact$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
