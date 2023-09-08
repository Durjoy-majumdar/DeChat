package ch0;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.address.p879ui.InvoiceQrcodeTextView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ch0.f */
public class C67365f implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ InvoiceQrcodeTextView f193224d;

    public C67365f(InvoiceQrcodeTextView invoiceQrcodeTextView) {
        this.f193224d = invoiceQrcodeTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f193224d.f196896s = (int) motionEvent.getRawX();
        this.f193224d.f196897t = (int) motionEvent.getRawY();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
