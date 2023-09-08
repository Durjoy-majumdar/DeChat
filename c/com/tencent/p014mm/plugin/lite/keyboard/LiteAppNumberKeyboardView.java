package com.tencent.p014mm.plugin.lite.keyboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104894l1;
import com.tencent.p014mm.plugin.appbrand.widget.input.RepeatKeyTouchImageButton;
import com.tencent.p014mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView */
public final class LiteAppNumberKeyboardView extends BaseNumberKeyboardView {

    /* renamed from: x */
    public int f313497x = 0;

    /* renamed from: y */
    public final SparseIntArray f313498y = new C105443a(this);

    /* renamed from: z */
    public InputConnection f313499z;

    /* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView$b */
    public class C69115b implements View.OnClickListener {
        public C69115b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (LiteAppNumberKeyboardView.this.f313499z == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int i = view.getId() == C0966R.C0970id.tenpay_keyboard_0 ? 7 : view.getId() == C0966R.C0970id.tenpay_keyboard_1 ? 8 : view.getId() == C0966R.C0970id.tenpay_keyboard_2 ? 9 : view.getId() == C0966R.C0970id.tenpay_keyboard_3 ? 10 : view.getId() == C0966R.C0970id.tenpay_keyboard_4 ? 11 : view.getId() == C0966R.C0970id.tenpay_keyboard_5 ? 12 : view.getId() == C0966R.C0970id.tenpay_keyboard_6 ? 13 : view.getId() == C0966R.C0970id.tenpay_keyboard_7 ? 14 : view.getId() == C0966R.C0970id.tenpay_keyboard_8 ? 15 : view.getId() == C0966R.C0970id.tenpay_keyboard_9 ? 16 : (view.getId() == C0966R.C0970id.tenpay_keyboard_x && LiteAppNumberKeyboardView.this.f313497x == 2) ? 56 : 0;
            if (i != 0) {
                LiteAppNumberKeyboardView.this.f313499z.sendKeyEvent(new KeyEvent(0, i));
                LiteAppNumberKeyboardView.this.f313499z.sendKeyEvent(new KeyEvent(1, i));
            } else if (view.getId() == C0966R.C0970id.tenpay_keyboard_x) {
                LiteAppNumberKeyboardView liteAppNumberKeyboardView = LiteAppNumberKeyboardView.this;
                if (liteAppNumberKeyboardView.f313497x == 1) {
                    liteAppNumberKeyboardView.f313499z.sendKeyEvent(new KeyEvent(0, 0, 0, 52, 0, 64));
                    LiteAppNumberKeyboardView.this.f313499z.sendKeyEvent(new KeyEvent(0, 0, 1, 52, 0, 64));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView$a */
    public class C105443a extends SparseIntArray {
        public C105443a(LiteAppNumberKeyboardView liteAppNumberKeyboardView) {
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

    /* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView$c */
    public class C105444c implements C104894l1 {
        public C105444c() {
        }

        /* renamed from: a */
        public void mo110045a() {
            Log.m105918d("MicroMsg.LiteAppNumberKeyboardView", "backspace onSingleTap");
            LiteAppNumberKeyboardView.m141609c(LiteAppNumberKeyboardView.this);
        }

        /* renamed from: b */
        public void mo110046b() {
            Log.m105918d("MicroMsg.LiteAppNumberKeyboardView", "backspace onRepeat");
            LiteAppNumberKeyboardView.m141609c(LiteAppNumberKeyboardView.this);
        }
    }

    public LiteAppNumberKeyboardView(Context context) {
        super(context);
        mo150189d();
    }

    /* renamed from: c */
    public static boolean m141609c(LiteAppNumberKeyboardView liteAppNumberKeyboardView) {
        InputConnection inputConnection = liteAppNumberKeyboardView.f313499z;
        if (inputConnection == null) {
            return false;
        }
        if (!TextUtils.isEmpty(inputConnection.getTextBeforeCursor(1, 0))) {
            liteAppNumberKeyboardView.f313499z.deleteSurroundingText(1, 0);
        } else {
            liteAppNumberKeyboardView.f313499z.sendKeyEvent(new KeyEvent(0, 67));
            liteAppNumberKeyboardView.f313499z.sendKeyEvent(new KeyEvent(1, 67));
        }
        return true;
    }

    /* renamed from: d */
    public final void mo150189d() {
        C69115b bVar = new C69115b();
        for (int i = 0; i < this.f313498y.size(); i++) {
            findViewById(this.f313498y.valueAt(i)).setOnClickListener(bVar);
        }
        findViewById(C0966R.C0970id.tenpay_keyboard_x).setOnClickListener(bVar);
        ((RepeatKeyTouchImageButton) findViewById(C0966R.C0970id.tenpay_keyboard_d)).setRepeatKeyTouchListener(new C105444c());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setInputEditText((EditText) null);
    }

    public void setXMode(int i) {
        super.setXMode(i);
        this.f313497x = i;
    }

    public LiteAppNumberKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo150189d();
    }
}
