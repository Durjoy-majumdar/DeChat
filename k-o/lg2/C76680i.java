package lg2;

import android.view.View;
import com.tencent.p014mm.plugin.recharge.p093ui.form.InstantAutoCompleteTextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lg2.i */
public class C76680i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ InstantAutoCompleteTextView f224369d;

    public C76680i(C76681j jVar, InstantAutoCompleteTextView instantAutoCompleteTextView) {
        this.f224369d = instantAutoCompleteTextView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f224369d.requestFocus();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
