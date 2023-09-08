package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C19797j4;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomTimePicker */
public class CustomTimePicker extends TimePicker {

    /* renamed from: d */
    public NumberPicker f56592d;

    /* renamed from: e */
    public NumberPicker f56593e;

    /* renamed from: f */
    public int f56594f = -1;

    /* renamed from: g */
    public int f56595g = -1;

    /* renamed from: h */
    public int f56596h = -1;

    /* renamed from: i */
    public int f56597i = -1;

    /* renamed from: com.tencent.mm.ui.widget.picker.CustomTimePicker$a */
    public class C19864a implements NumberPicker.OnValueChangeListener {
        public C19864a() {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            NumberPicker numberPicker2;
            NumberPicker numberPicker3;
            CustomTimePicker customTimePicker = CustomTimePicker.this;
            int i3 = customTimePicker.f56594f;
            boolean z = true;
            if (i3 >= 0 && i3 <= 23) {
                int i4 = customTimePicker.f56595g;
                if (!(!(i4 >= 0 && i4 <= 59) || (numberPicker3 = customTimePicker.f56592d) == null || customTimePicker.f56593e == null)) {
                    if (numberPicker3.getValue() == customTimePicker.f56594f) {
                        customTimePicker.f56593e.setMinValue(customTimePicker.f56595g);
                    } else {
                        customTimePicker.f56593e.setMinValue(0);
                    }
                }
            }
            int i5 = customTimePicker.f56596h;
            if (i5 < 0 || i5 > 23) {
                z = false;
            }
            if (z && (numberPicker2 = customTimePicker.f56592d) != null && customTimePicker.f56593e != null) {
                if (numberPicker2.getValue() == customTimePicker.f56596h) {
                    customTimePicker.f56593e.setMaxValue(customTimePicker.f56597i);
                } else {
                    customTimePicker.f56593e.setMaxValue(59);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.picker.CustomTimePicker$b */
    public class C19865b implements NumberPicker.OnValueChangeListener {
        public C19865b(CustomTimePicker customTimePicker) {
        }

        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        }
    }

    public CustomTimePicker(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p), attributeSet);
        mo26482a();
    }

    /* renamed from: a */
    public final void mo26482a() {
        setIs24HourView(Boolean.TRUE);
        this.f56592d = mo26483b("mHourSpinner");
        this.f56593e = mo26483b("mMinuteSpinner");
        C19879s.m21609d(this.f56592d);
        C19879s.m21609d(this.f56593e);
        Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.alv);
        C19879s.m21608c(this.f56592d, drawable);
        C19879s.m21608c(this.f56593e, drawable);
        NumberPicker numberPicker = this.f56592d;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(new C19864a());
        }
        NumberPicker numberPicker2 = this.f56593e;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(new C19865b(this));
        }
        C19879s.m21610e(this.f56592d);
        C19879s.m21610e(this.f56593e);
    }

    /* renamed from: b */
    public final NumberPicker mo26483b(String str) {
        try {
            Object a = new C19797j4(this, "mDelegate", (String) null).mo26271a();
            if (a != null) {
                return (NumberPicker) new C19797j4(a, str, (String) null).mo26271a();
            }
            return null;
        } catch (NoSuchFieldException e) {
            C85975v4.m106307d("CustomTimePicker", e, "super_getNumberPickerApi21 NoSuchFieldException", new Object[0]);
            return null;
        } catch (IllegalAccessException e2) {
            C85975v4.m106307d("CustomTimePicker", e2, "super_getNumberPickerApi21 IllegalAccessException", new Object[0]);
            return null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19879s.m21606a(this.f56592d);
        C19879s.m21606a(this.f56593e);
    }

    public CustomTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26482a();
    }
}
