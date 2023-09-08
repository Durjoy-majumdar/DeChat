package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.ui.widget.MMSpinnerDatePicker */
public class MMSpinnerDatePicker extends DatePicker implements DatePicker.OnDateChangedListener {

    /* renamed from: d */
    public NumberPicker f56476d;

    /* renamed from: e */
    public NumberPicker f56477e;

    /* renamed from: f */
    public NumberPicker f56478f;

    /* renamed from: g */
    public int f56479g = 0;

    /* renamed from: com.tencent.mm.ui.widget.MMSpinnerDatePicker$a */
    public interface C19844a {
        /* renamed from: a */
        void mo26378a(DatePicker datePicker, int i, int i2, int i3, int i4);
    }

    public MMSpinnerDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo26371a();
    }

    /* renamed from: a */
    public final void mo26371a() {
        setCalendarViewShown(false);
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("year", "id", Platform.ANDROID);
        int identifier2 = system.getIdentifier("month", "id", Platform.ANDROID);
        int identifier3 = system.getIdentifier("day", "id", Platform.ANDROID);
        this.f56476d = (NumberPicker) findViewById(identifier);
        this.f56477e = (NumberPicker) findViewById(identifier2);
        this.f56478f = (NumberPicker) findViewById(identifier3);
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.width = -1;
        childAt.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f56476d.getLayoutParams();
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams2.weight = 1.0f;
        this.f56476d.setLayoutParams(layoutParams2);
        this.f56477e.setLayoutParams(layoutParams2);
        this.f56478f.setLayoutParams(layoutParams2);
        setDescendantFocusability(393216);
        setPickerMode(2);
    }

    /* renamed from: b */
    public final void mo26372b(NumberPicker numberPicker, int i) {
        if (numberPicker != null) {
            EditText editText = (EditText) numberPicker.findViewById(Resources.getSystem().getIdentifier("numberpicker_input", "id", Platform.ANDROID));
            editText.setTextSize(0, getResources().getDimension(i));
            int textSize = (int) editText.getTextSize();
            try {
                Field declaredField = NumberPicker.class.getDeclaredField("mTextSize");
                declaredField.setAccessible(true);
                declaredField.set(numberPicker, Integer.valueOf(textSize));
                Field declaredField2 = NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
                declaredField2.setAccessible(true);
                Paint paint = (Paint) declaredField2.get(numberPicker);
                paint.setTextSize((float) textSize);
                declaredField2.set(numberPicker, paint);
            } catch (NoSuchFieldException e) {
                Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e, "", new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", e2, "", new Object[0]);
            }
        }
    }

    public int getPickerMode() {
        return this.f56479g;
    }

    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
    }

    public void setOnDateChangeListener(C19844a aVar) {
    }

    public void setPickerMode(int i) {
        this.f56479g = i;
        if (i == 0) {
            this.f56476d.setVisibility(0);
            this.f56477e.setVisibility(0);
            this.f56478f.setVisibility(0);
        } else if (i == 1) {
            this.f56476d.setVisibility(0);
            this.f56477e.setVisibility(0);
            this.f56478f.setVisibility(8);
        } else {
            this.f56476d.setVisibility(0);
            this.f56477e.setVisibility(8);
            this.f56478f.setVisibility(8);
        }
    }

    public void setTextSize(int i) {
        mo26372b(this.f56476d, i);
        mo26372b(this.f56477e, i);
        mo26372b(this.f56478f, i);
    }

    public MMSpinnerDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26371a();
    }
}
