package g63;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: g63.d */
public class C8236d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f27160d;

    /* renamed from: e */
    public final /* synthetic */ LinearLayout f27161e;

    /* renamed from: f */
    public final /* synthetic */ TextView f27162f;

    /* renamed from: g */
    public final /* synthetic */ TextView f27163g;

    public C8236d(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f27160d = linearLayout;
        this.f27161e = linearLayout2;
        this.f27162f = textView;
        this.f27163g = textView2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f27160d.setVisibility(0);
        this.f27161e.setVisibility(8);
        this.f27162f.setText("");
        this.f27163g.setText("");
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
