package ro3;

import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ro3.n */
public final class C77562n implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226126d;

    public C77562n(C110588j jVar) {
        this.f226126d = jVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z = false;
        C85975v4.m106304a("SelectableEditTextHelper", "init() called with: view = " + view + ", i = " + i + ", keyEvent = " + keyEvent, new Object[0]);
        this.f226126d.getClass();
        if (this.f226126d.f330851z) {
            if (keyEvent != null && keyEvent.getAction() == 1) {
                z = true;
            }
            if (z) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        this.f226126d.mo148755a();
                        break;
                }
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
