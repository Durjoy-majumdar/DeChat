package com.tencent.p014mm.p136ui.widget.picker;

import com.tencent.p014mm.p136ui.C85975v4;
import java.util.Calendar;
import java.util.Date;
import qf0.C22085f;

/* renamed from: com.tencent.mm.ui.widget.picker.b */
public class C19876b implements C22085f {

    /* renamed from: a */
    public final /* synthetic */ CustomDatePickerNew f56629a;

    public C19876b(CustomDatePickerNew customDatePickerNew) {
        this.f56629a = customDatePickerNew;
    }

    /* renamed from: a */
    public void mo1989a(Date date) {
        CustomDatePickerNew customDatePickerNew = this.f56629a;
        int i = CustomDatePickerNew.f56570v;
        customDatePickerNew.getClass();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        customDatePickerNew.f56576i = instance.get(1);
        customDatePickerNew.f56577j = instance.get(2) + 1;
        customDatePickerNew.f56578n = instance.get(5);
        C85975v4.m106306c("pvTime", "onTimeSelect", new Object[0]);
    }
}
