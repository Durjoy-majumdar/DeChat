package com.tencent.p014mm.p136ui.chatting.view;

import android.widget.NumberPicker;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Calendar;

/* renamed from: com.tencent.mm.ui.chatting.view.i */
public class C57699i implements NumberPicker.OnValueChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C57702l f165139a;

    public C57699i(C57702l lVar) {
        this.f165139a = lVar;
    }

    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        Log.m105919d("MicroMsg.MMRemindDatePicker", "[onValueChange] oldVal:%s newVal:%s", Integer.valueOf(i), Integer.valueOf(i2));
        C57702l lVar = this.f165139a;
        lVar.f165143b.setOptionsArray(lVar.mo82066a(i2));
        int i3 = Calendar.getInstance().get(11);
        if (i2 == 0) {
            this.f165139a.f165143b.setValue(0);
        } else {
            this.f165139a.f165143b.setValue(i3);
        }
    }
}
