package er1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import rx3.C13604l;

/* renamed from: er1.r4 */
public final class C7866r4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f26469d;

    /* renamed from: e */
    public final /* synthetic */ C13604l<String, String> f26470e;

    public C7866r4(Activity activity, C13604l<String, String> lVar) {
        this.f26469d = activity;
        this.f26470e = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderUtilsCmdUtils$getCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Activity activity = this.f26469d;
        String str = (String) this.f26470e.f38556e;
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/utils/FinderUtilsCmdUtils$getCustomView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
