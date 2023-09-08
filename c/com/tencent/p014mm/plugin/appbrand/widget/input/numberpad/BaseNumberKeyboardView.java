package com.tencent.p014mm.plugin.appbrand.widget.input.numberpad;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView */
public class BaseNumberKeyboardView extends LinearLayout {

    /* renamed from: d */
    public Context f311488d;

    /* renamed from: e */
    public int f311489e = 0;

    /* renamed from: f */
    public Button f311490f;

    /* renamed from: g */
    public Button f311491g;

    /* renamed from: h */
    public Button f311492h;

    /* renamed from: i */
    public Button f311493i;

    /* renamed from: j */
    public Button f311494j;

    /* renamed from: n */
    public Button f311495n;

    /* renamed from: o */
    public Button f311496o;

    /* renamed from: p */
    public Button f311497p;

    /* renamed from: q */
    public Button f311498q;

    /* renamed from: r */
    public Button f311499r;

    /* renamed from: s */
    public Button f311500s;

    /* renamed from: t */
    public ImageButton f311501t;

    /* renamed from: u */
    public EditText f311502u;

    /* renamed from: v */
    public View f311503v;

    /* renamed from: w */
    public boolean f311504w;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView$a */
    public class C104903a implements View.OnClickListener {
        public C104903a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (BaseNumberKeyboardView.this.f311502u == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (view.getId() == C0966R.C0970id.tenpay_keyboard_x) {
                BaseNumberKeyboardView baseNumberKeyboardView = BaseNumberKeyboardView.this;
                int i = baseNumberKeyboardView.f311489e;
                if (i == 1) {
                    baseNumberKeyboardView.f311502u.dispatchKeyEvent(new KeyEvent(0, 59));
                    BaseNumberKeyboardView.this.f311502u.dispatchKeyEvent(new KeyEvent(0, 52));
                    BaseNumberKeyboardView.this.f311502u.dispatchKeyEvent(new KeyEvent(1, 59));
                } else if (i == 2) {
                    baseNumberKeyboardView.f311502u.dispatchKeyEvent(new KeyEvent(0, 56));
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                int i2 = view.getId() == C0966R.C0970id.tenpay_keyboard_1 ? 8 : view.getId() == C0966R.C0970id.tenpay_keyboard_2 ? 9 : view.getId() == C0966R.C0970id.tenpay_keyboard_3 ? 10 : view.getId() == C0966R.C0970id.tenpay_keyboard_4 ? 11 : view.getId() == C0966R.C0970id.tenpay_keyboard_5 ? 12 : view.getId() == C0966R.C0970id.tenpay_keyboard_6 ? 13 : view.getId() == C0966R.C0970id.tenpay_keyboard_7 ? 14 : view.getId() == C0966R.C0970id.tenpay_keyboard_8 ? 15 : view.getId() == C0966R.C0970id.tenpay_keyboard_9 ? 16 : view.getId() == C0966R.C0970id.tenpay_keyboard_0 ? 7 : view.getId() == C0966R.C0970id.tenpay_keyboard_d ? 67 : 0;
                BaseNumberKeyboardView.this.f311502u.dispatchKeyEvent(new KeyEvent(0, i2));
                BaseNumberKeyboardView.this.f311502u.dispatchKeyEvent(new KeyEvent(1, i2));
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    public BaseNumberKeyboardView(Context context) {
        super(context);
        mo148878b(context);
    }

    /* renamed from: a */
    public void mo148877a() {
        this.f311504w = true;
        this.f311490f.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311490f.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311491g.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311491g.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311492h.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311492h.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311493i.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311493i.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311494j.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311494j.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311495n.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311495n.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311496o.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311496o.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311497p.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311497p.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311498q.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311498q.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311499r.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311499r.setBackgroundResource(C0966R.C0969drawable.aws);
        this.f311500s.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f311500s.setBackgroundResource(C0966R.C0969drawable.f4487dz);
        this.f311501t.setBackgroundResource(C0966R.C0969drawable.aws);
        this.f311503v.findViewById(C0966R.C0970id.iwq).setBackgroundResource(C0966R.color.BW_BG_100);
        this.f311503v.findViewById(C0966R.C0970id.c7q).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7v).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7w).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7x).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7y).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7z).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.f357875c80).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.f357876c81).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.f357877c82).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7r).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7s).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7t).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
        this.f311503v.findViewById(C0966R.C0970id.c7u).setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_1);
    }

    /* renamed from: b */
    public final void mo148878b(Context context) {
        this.f311488d = context.getApplicationContext();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6514gx, this, true);
        this.f311503v = inflate;
        this.f311490f = (Button) inflate.findViewById(C0966R.C0970id.tenpay_keyboard_1);
        this.f311491g = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_2);
        this.f311492h = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_3);
        this.f311493i = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_4);
        this.f311494j = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_5);
        this.f311495n = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_6);
        this.f311496o = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_7);
        this.f311497p = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_8);
        this.f311498q = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_9);
        this.f311499r = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_x);
        this.f311500s = (Button) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_0);
        this.f311501t = (ImageButton) this.f311503v.findViewById(C0966R.C0970id.tenpay_keyboard_d);
        C104903a aVar = new C104903a();
        this.f311490f.setContentDescription("1");
        this.f311491g.setContentDescription("2");
        this.f311492h.setContentDescription("3");
        this.f311493i.setContentDescription(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        this.f311494j.setContentDescription(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
        this.f311495n.setContentDescription(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
        this.f311496o.setContentDescription("7");
        this.f311497p.setContentDescription("8");
        this.f311498q.setContentDescription("9");
        this.f311500s.setContentDescription("0");
        this.f311499r.setContentDescription("字母X");
        this.f311501t.setContentDescription("删除");
        this.f311490f.setOnClickListener(aVar);
        this.f311491g.setOnClickListener(aVar);
        this.f311492h.setOnClickListener(aVar);
        this.f311493i.setOnClickListener(aVar);
        this.f311494j.setOnClickListener(aVar);
        this.f311495n.setOnClickListener(aVar);
        this.f311496o.setOnClickListener(aVar);
        this.f311497p.setOnClickListener(aVar);
        this.f311498q.setOnClickListener(aVar);
        this.f311499r.setOnClickListener(aVar);
        this.f311500s.setOnClickListener(aVar);
        this.f311501t.setOnClickListener(aVar);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setInputEditText(EditText editText) {
        if (editText != null) {
            this.f311502u = editText;
            int imeOptions = editText.getImeOptions();
            CharSequence imeActionLabel = this.f311502u.getImeActionLabel();
            if (!TextUtils.isEmpty(imeActionLabel)) {
                this.f311499r.setText(imeActionLabel);
            }
            if (imeOptions == 1) {
                this.f311489e = 0;
                if (TextUtils.isEmpty(imeActionLabel)) {
                    this.f311499r.setText("");
                }
            }
        }
    }

    public void setSecureAccessibility(View.AccessibilityDelegate accessibilityDelegate) {
        this.f311500s.setAccessibilityDelegate(accessibilityDelegate);
        this.f311490f.setAccessibilityDelegate(accessibilityDelegate);
        this.f311491g.setAccessibilityDelegate(accessibilityDelegate);
        this.f311492h.setAccessibilityDelegate(accessibilityDelegate);
        this.f311493i.setAccessibilityDelegate(accessibilityDelegate);
        this.f311494j.setAccessibilityDelegate(accessibilityDelegate);
        this.f311495n.setAccessibilityDelegate(accessibilityDelegate);
        this.f311496o.setAccessibilityDelegate(accessibilityDelegate);
        this.f311497p.setAccessibilityDelegate(accessibilityDelegate);
        this.f311498q.setAccessibilityDelegate(accessibilityDelegate);
        this.f311499r.setAccessibilityDelegate(accessibilityDelegate);
        this.f311501t.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setXMode(int i) {
        this.f311489e = i;
        if (i == 0) {
            this.f311499r.setText("");
            if (this.f311504w) {
                this.f311499r.setBackgroundResource(C0966R.color.f3102fb);
            } else {
                this.f311499r.setBackgroundResource(C0966R.color.f3099f9);
            }
        } else if (i == 1) {
            this.f311499r.setText("X");
            if (this.f311504w) {
                this.f311499r.setBackgroundResource(C0966R.C0969drawable.aws);
            } else {
                this.f311499r.setBackgroundResource(C0966R.C0969drawable.awr);
            }
        } else if (i != 2) {
            this.f311489e = 0;
        } else {
            this.f311499r.setText(".");
            if (this.f311504w) {
                this.f311499r.setBackgroundResource(C0966R.C0969drawable.aws);
            } else {
                this.f311499r.setBackgroundResource(C0966R.C0969drawable.awr);
            }
        }
    }

    public BaseNumberKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo148878b(context);
    }
}
