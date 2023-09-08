package go3;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: go3.t */
public class C20836t extends DatePickerDialog {

    /* renamed from: d */
    public boolean f58849d = true;

    /* renamed from: e */
    public int f58850e = 1;

    /* renamed from: go3.t$a */
    public class C20837a {
        public C20837a(C20836t tVar) {
        }

        /* renamed from: a */
        public NumberPicker mo32537a(ViewGroup viewGroup) {
            NumberPicker a;
            if (viewGroup == null) {
                return null;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof NumberPicker) {
                    NumberPicker numberPicker = (NumberPicker) childAt;
                    if (numberPicker.getMaxValue() >= 28 && numberPicker.getMaxValue() <= 31) {
                        return numberPicker;
                    }
                }
                if ((childAt instanceof ViewGroup) && (a = mo32537a((ViewGroup) childAt)) != null) {
                    return a;
                }
            }
            return null;
        }
    }

    public C20836t(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3, long j) {
        super(context, onDateSetListener, i, i2, i3);
    }

    /* renamed from: a */
    public final void mo32534a(int i, int i2, int i3) {
        if (this.f58850e > 1) {
            setTitle(getContext().getString(C0966R.string.f0t, new Object[]{Integer.valueOf(i), Integer.valueOf(i2 + 1)}));
        }
    }

    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        super.onDateChanged(datePicker, i, i2, i3);
        mo32534a(i, i2, i3);
    }

    public void show() {
        super.show();
        if (this.f58849d) {
            NumberPicker a = new C20837a(this).mo32537a((ViewGroup) getWindow().getDecorView());
            if (a != null && this.f58850e > 1) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                NumberPicker numberPicker = a;
                C117292a.m165358d(numberPicker, aVar.mo10232b(), "com/tencent/mm/ui/widget/MMDatePickerDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(numberPicker, "com/tencent/mm/ui/widget/MMDatePickerDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo32534a(getDatePicker().getYear(), getDatePicker().getMonth(), getDatePicker().getDayOfMonth());
        }
        this.f58849d = false;
    }

    public C20836t(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4, long j) {
        super(context, i, onDateSetListener, i2, i3, i4);
    }
}
