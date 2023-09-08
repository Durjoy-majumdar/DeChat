package vt0;

import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2;
import java.util.Calendar;
import java.util.Date;
import qf0.C22085f;

/* renamed from: vt0.d */
public class C22782d implements C22085f {

    /* renamed from: a */
    public final /* synthetic */ AppBrandDatePickerV2 f65508a;

    public C22782d(AppBrandDatePickerV2 appBrandDatePickerV2) {
        this.f65508a = appBrandDatePickerV2;
    }

    /* renamed from: a */
    public void mo1989a(Date date) {
        AppBrandDatePickerV2 appBrandDatePickerV2 = this.f65508a;
        appBrandDatePickerV2.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        appBrandDatePickerV2.f49943i = instance.get(1);
        appBrandDatePickerV2.f49944j = instance.get(2) + 1;
        appBrandDatePickerV2.f49945n = instance.get(5);
    }
}
