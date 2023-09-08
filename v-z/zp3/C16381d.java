package zp3;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.view.CheckBoxLicenseView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zp3.d */
public class C16381d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f43782d;

    public C16381d(CheckBoxLicenseView checkBoxLicenseView, CheckBox checkBox) {
        this.f43782d = checkBox;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/CheckBoxLicenseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43782d.performClick();
        C117292a.m165361g(this, "com/tencent/mm/view/CheckBoxLicenseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
