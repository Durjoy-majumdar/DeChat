package com.tencent.p014mm.p136ui.widget.picker;

import java.util.Calendar;
import java.util.Date;
import qf0.C22085f;

/* renamed from: com.tencent.mm.ui.widget.picker.c */
public class C7044c implements C22085f {

    /* renamed from: a */
    public final /* synthetic */ CustomTimePickerNew f24852a;

    public C7044c(CustomTimePickerNew customTimePickerNew) {
        this.f24852a = customTimePickerNew;
    }

    /* renamed from: a */
    public void mo1989a(Date date) {
        CustomTimePickerNew customTimePickerNew = this.f24852a;
        int i = CustomTimePickerNew.f24840r;
        customTimePickerNew.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        customTimePickerNew.f24850p = instance.get(11);
        customTimePickerNew.f24851q = instance.get(12);
    }
}
