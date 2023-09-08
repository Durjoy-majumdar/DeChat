package j13;

import android.view.View;
import android.widget.ImageView;
import j13.C76381b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: j13.a */
public class C76380a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76381b.C76383b f223659d;

    /* renamed from: e */
    public final /* synthetic */ int f223660e;

    /* renamed from: f */
    public final /* synthetic */ C76381b f223661f;

    public C76380a(C76381b bVar, C76381b.C76383b bVar2, int i) {
        this.f223661f = bVar;
        this.f223659d = bVar2;
        this.f223660e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/adapter/LanguageChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageView imageView = this.f223661f.f223664f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f223659d.f223667A.setVisibility(0);
        C76381b bVar = this.f223661f;
        bVar.f223664f = this.f223659d.f223667A;
        bVar.f223663e = this.f223660e;
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/adapter/LanguageChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
