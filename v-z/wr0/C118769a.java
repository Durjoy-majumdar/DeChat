package wr0;

import android.widget.Button;
import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardShowFrag;

/* renamed from: wr0.a */
public class C118769a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AppBrandIDCardShowFrag f355334a;

    public C118769a(AppBrandIDCardShowFrag appBrandIDCardShowFrag) {
        this.f355334a = appBrandIDCardShowFrag;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button button = this.f355334a.f345431o;
        if (button != null) {
            button.setEnabled(z);
        }
    }
}
