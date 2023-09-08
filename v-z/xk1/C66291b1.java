package xk1;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58777u0;
import f40.C86709a0;
import gy3.C8480h;
import j20.C117292a;
import je1.C60797c3;
import k20.C60958c;
import k20.C9556a;
import te3.C49712hj1;

/* renamed from: xk1.b1 */
public final class C66291b1 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C66352v0 f190832d;

    public C66291b1(C66352v0 v0Var) {
        this.f190832d = v0Var;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (3 == i || keyEvent.getAction() == 66) {
            C66352v0 v0Var = this.f190832d;
            v0Var.getClass();
            Log.m105924i("Finder.FinderGameLiveSearchUIC", "loadSearchData query:" + v0Var.f191002q);
            TextView textView2 = v0Var.f190999n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            View view = v0Var.f191000o;
            boolean z = false;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            v0Var.f191005t.clear();
            v0Var.f191003r = "";
            v0Var.f191004s = false;
            String str = v0Var.f191002q;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                C58777u0.f168283a.mo83838g(6, v0Var.f191002q);
                v0Var.f191001p = new C60797c3(v0Var.f191002q, v0Var.f191003r, 0, (C49712hj1) null, 12, (C8480h) null);
                C86709a0.m107524d().mo123460f(v0Var.f191001p);
                C86709a0.m107524d().mo123455a(4140, v0Var);
            }
            Util.hideVKB(this.f190832d.f190998j);
        }
        return true;
    }
}
