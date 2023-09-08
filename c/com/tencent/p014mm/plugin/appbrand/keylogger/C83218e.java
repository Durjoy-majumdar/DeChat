package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.e */
public class C83218e implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ KeyStepAnalyserActivity f243064a;

    public C83218e(KeyStepAnalyserActivity keyStepAnalyserActivity) {
        this.f243064a = keyStepAnalyserActivity;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        KeyStepAnalyserActivity keyStepAnalyserActivity = this.f243064a;
        keyStepAnalyserActivity.f243019j = i;
        keyStepAnalyserActivity.f243020n = i2;
        keyStepAnalyserActivity.f243021o = i3;
        instance.set(i, i2, i3);
        this.f243064a.mo115448E7(instance.getTimeInMillis());
    }
}
