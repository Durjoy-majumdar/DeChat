package zi3;

import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.p136ui.anim.RepairerSharedElementDemo2;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zi3.g */
public final class C53791g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RepairerSharedElementDemo2 f150962d;

    public C53791g(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
        this.f150962d = repairerSharedElementDemo2;
    }

    public final void onClick(View view) {
        CharSequence text;
        String obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$loadBtns$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Button button = view instanceof Button ? (Button) view : null;
        this.f150962d.mo81983K7((button == null || (text = button.getText()) == null || (obj = text.toString()) == null) ? 1 : Integer.parseInt(obj));
        C117292a.m165361g(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$loadBtns$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
