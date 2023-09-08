package com.tencent.p014mm.p136ui.widget.picker;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.p014mm.p136ui.C19797j4;
import com.tencent.p014mm.p136ui.C85975v4;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.ui.widget.picker.s */
public class C19879s {
    /* renamed from: a */
    public static void m21606a(NumberPicker numberPicker) {
        if (numberPicker != null) {
            try {
                EditText editText = (EditText) new C19797j4(numberPicker, "mInputText", (String) null).mo26271a();
                if (editText != null) {
                    editText.setFilters(new InputFilter[0]);
                }
            } catch (IllegalAccessException e) {
                C85975v4.m106307d("NumberPickerUtil", e, "fixDefaultValueDisplaying IllegalAccessException", new Object[0]);
            } catch (NoSuchFieldException e2) {
                C85975v4.m106307d("NumberPickerUtil", e2, "fixDefaultValueDisplaying NoSuchFieldException", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static EditText m21607b(NumberPicker numberPicker) {
        if (numberPicker == null) {
            return null;
        }
        try {
            return (EditText) new C19797j4(numberPicker, "mInputText", (String) null).mo26271a();
        } catch (IllegalAccessException e) {
            C85975v4.m106307d("NumberPickerUtil", e, "getInputText IllegalAccessException", new Object[0]);
            return null;
        } catch (NoSuchFieldException e2) {
            C85975v4.m106307d("NumberPickerUtil", e2, "getInputText NoSuchFieldException", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static void m21608c(NumberPicker numberPicker, Drawable drawable) {
        if (numberPicker != null) {
            try {
                C19797j4 j4Var = new C19797j4(numberPicker, "mSelectionDivider", (String) null);
                j4Var.mo26272b();
                Field field = j4Var.f56329d;
                if (field != null) {
                    field.set(j4Var.f56326a, drawable);
                    return;
                }
                throw new NoSuchFieldException();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m21609d(NumberPicker numberPicker) {
        if (numberPicker != null) {
            numberPicker.setDescendantFocusability(393216);
        }
    }

    /* renamed from: e */
    public static void m21610e(NumberPicker numberPicker) {
        if (numberPicker != null) {
            try {
                Runnable runnable = (Runnable) new C19797j4(numberPicker, "mSetSelectionCommand", (String) null).mo26271a();
                if (runnable != null) {
                    numberPicker.removeCallbacks(runnable);
                }
            } catch (IllegalAccessException e) {
                C85975v4.m106307d("NumberPickerUtil", e, "removePendingSetSelectionCommand IllegalAccessException", new Object[0]);
            } catch (NoSuchFieldException e2) {
                C85975v4.m106307d("NumberPickerUtil", e2, "removePendingSetSelectionCommand NoSuchFieldException", new Object[0]);
            }
        }
    }

    /* renamed from: f */
    public static void m21611f(NumberPicker numberPicker, int i) {
        int childCount = numberPicker.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = numberPicker.getChildAt(i2);
            if (childAt instanceof EditText) {
                Paint paint = null;
                try {
                    paint = (Paint) new C19797j4(numberPicker, "mSelectorWheelPaint", (String) null).mo26271a();
                } catch (IllegalAccessException e) {
                    C85975v4.m106307d("NumberPickerUtil", e, "getSelectorWheelPaint IllegalAccessException", new Object[0]);
                } catch (NoSuchFieldException e2) {
                    C85975v4.m106307d("NumberPickerUtil", e2, "getSelectorWheelPaint NoSuchFieldException", new Object[0]);
                }
                if (paint != null) {
                    paint.setColor(i);
                }
                ((EditText) childAt).setTextColor(i);
                numberPicker.invalidate();
            }
        }
    }
}
