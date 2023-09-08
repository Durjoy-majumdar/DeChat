package p253vi;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: vi.b */
public class C14872b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f40898d;

    public C14872b(C77407n nVar) {
        this.f40898d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/chatroom/util/ConvBoxTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f40898d.mo107572p();
        C117292a.m165361g(this, "com/tencent/mm/chatroom/util/ConvBoxTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
