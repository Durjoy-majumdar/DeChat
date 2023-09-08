package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84963i1;
import com.tencent.p014mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import pt0.C110246a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView */
public final class AppBrandNumberKeyboardView extends BaseNumberKeyboardView {

    /* renamed from: x */
    public int f311320x = 0;

    /* renamed from: y */
    public final SparseIntArray f311321y = new C104823a(this);

    /* renamed from: z */
    public InputConnection f311322z;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView$a */
    public class C104823a extends SparseIntArray {
        public C104823a(AppBrandNumberKeyboardView appBrandNumberKeyboardView) {
            put(1, C0966R.C0970id.tenpay_keyboard_1);
            put(2, C0966R.C0970id.tenpay_keyboard_2);
            put(3, C0966R.C0970id.tenpay_keyboard_3);
            put(4, C0966R.C0970id.tenpay_keyboard_4);
            put(5, C0966R.C0970id.tenpay_keyboard_5);
            put(6, C0966R.C0970id.tenpay_keyboard_6);
            put(7, C0966R.C0970id.tenpay_keyboard_7);
            put(8, C0966R.C0970id.tenpay_keyboard_8);
            put(9, C0966R.C0970id.tenpay_keyboard_9);
            put(0, C0966R.C0970id.tenpay_keyboard_0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView$b */
    public class C104824b implements View.OnClickListener {
        public C104824b() {
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (AppBrandNumberKeyboardView.this.f311322z == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String str2 = null;
            if (view.getId() == C0966R.C0970id.tenpay_keyboard_x) {
                int i = AppBrandNumberKeyboardView.this.f311320x;
                if (i == 1) {
                    str = "X";
                } else if (i != 2) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    str = ".";
                }
            } else {
                for (int i2 = 0; i2 < AppBrandNumberKeyboardView.this.f311321y.size(); i2++) {
                    if (view.getId() == AppBrandNumberKeyboardView.this.f311321y.valueAt(i2)) {
                        str2 = String.valueOf(AppBrandNumberKeyboardView.this.f311321y.keyAt(i2));
                    }
                }
                str = str2;
            }
            if (TextUtils.isEmpty(str)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            AppBrandNumberKeyboardView.this.f311322z.commitText(str, str.length());
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView$c */
    public class C104825c implements C104894l1 {
        public C104825c() {
        }

        /* renamed from: a */
        public void mo110045a() {
            Log.m105918d("MicroMsg.AppBrand.AppBrandNumberKeyboardView", "backspace onSingleTap");
            AppBrandNumberKeyboardView.m140491c(AppBrandNumberKeyboardView.this);
        }

        /* renamed from: b */
        public void mo110046b() {
            Log.m105918d("MicroMsg.AppBrand.AppBrandNumberKeyboardView", "backspace onRepeat");
            AppBrandNumberKeyboardView.m140491c(AppBrandNumberKeyboardView.this);
        }
    }

    public AppBrandNumberKeyboardView(Context context) {
        super(context);
        mo148705d();
    }

    /* renamed from: c */
    public static boolean m140491c(AppBrandNumberKeyboardView appBrandNumberKeyboardView) {
        InputConnection inputConnection = appBrandNumberKeyboardView.f311322z;
        if (inputConnection == null) {
            return false;
        }
        if (!TextUtils.isEmpty(inputConnection.getTextBeforeCursor(1, 0))) {
            appBrandNumberKeyboardView.f311322z.deleteSurroundingText(1, 0);
        } else {
            appBrandNumberKeyboardView.f311322z.sendKeyEvent(new KeyEvent(0, 67));
            appBrandNumberKeyboardView.f311322z.sendKeyEvent(new KeyEvent(1, 67));
        }
        return true;
    }

    /* renamed from: d */
    public final void mo148705d() {
        C104824b bVar = new C104824b();
        for (int i = 0; i < this.f311321y.size(); i++) {
            findViewById(this.f311321y.valueAt(i)).setOnClickListener(bVar);
        }
        findViewById(C0966R.C0970id.tenpay_keyboard_x).setOnClickListener(bVar);
        ((RepeatKeyTouchImageButton) findViewById(C0966R.C0970id.tenpay_keyboard_d)).setRepeatKeyTouchListener(new C104825c());
    }

    /* renamed from: e */
    public void mo148706e(C110246a aVar) {
        C84963i1 a;
        if (aVar != null) {
            boolean z = aVar instanceof View;
            if (z && (a = C84963i1.C84964a.m104748a(((View) aVar).getContext())) != null) {
                a.hideVKB();
            }
            if (aVar instanceof EditText) {
                EditText editText = (EditText) aVar;
                editText.setShowSoftInputOnFocus(false);
                C84975p1.m104767b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
            }
            if (z) {
                ((View) aVar).requestFocus();
            }
            this.f311322z = aVar.mo148821i();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setInputEditText((EditText) null);
    }

    public void setXMode(int i) {
        super.setXMode(i);
        this.f311320x = i;
    }

    public AppBrandNumberKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148705d();
    }
}
