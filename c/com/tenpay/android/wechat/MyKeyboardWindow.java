package com.tenpay.android.wechat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.accessibility.core.provider.TypeModifier;
import j20.C117292a;
import java.util.ArrayList;

public class MyKeyboardWindow extends LinearLayout {
    public static final int X_MODE_CHARACTER = 1;
    public static final int X_MODE_DOT = 2;
    public static final int X_MODE_NONE = 0;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mInputEditText;
    private TextView mKey0;
    private TextView mKey1;
    private TextView mKey2;
    private TextView mKey3;
    private TextView mKey4;
    private TextView mKey5;
    private TextView mKey6;
    private TextView mKey7;
    private TextView mKey8;
    private TextView mKey9;
    private RelativeLayout mKeyD;
    private TextView mKeyX;
    private OnTouchListener mOnTouchListener;
    /* access modifiers changed from: private */
    public int mXMode = 0;

    public interface OnTouchListener {
        boolean onTouch(View view, MotionEvent motionEvent);
    }

    public MyKeyboardWindow(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context.getApplicationContext();
        TenpayTTSUtil.init(context);
        View inflate = LayoutInflater.from(context).inflate(this.mContext.getResources().getIdentifier("tenpay_number_keyboard", "layout", this.mContext.getPackageName()), this, true);
        this.mKey1 = (TextView) inflate.findViewById(getId("tenpay_keyboard_1"));
        this.mKey2 = (TextView) inflate.findViewById(getId("tenpay_keyboard_2"));
        this.mKey3 = (TextView) inflate.findViewById(getId("tenpay_keyboard_3"));
        this.mKey4 = (TextView) inflate.findViewById(getId("tenpay_keyboard_4"));
        this.mKey5 = (TextView) inflate.findViewById(getId("tenpay_keyboard_5"));
        this.mKey6 = (TextView) inflate.findViewById(getId("tenpay_keyboard_6"));
        this.mKey7 = (TextView) inflate.findViewById(getId("tenpay_keyboard_7"));
        this.mKey8 = (TextView) inflate.findViewById(getId("tenpay_keyboard_8"));
        this.mKey9 = (TextView) inflate.findViewById(getId("tenpay_keyboard_9"));
        this.mKeyX = (TextView) inflate.findViewById(getId("tenpay_keyboard_x"));
        this.mKey0 = (TextView) inflate.findViewById(getId("tenpay_keyboard_0"));
        this.mKeyD = (RelativeLayout) inflate.findViewById(getId("tenpay_keyboard_d"));
        setInnerAccessibility((View.AccessibilityDelegate) null);
        C752481 r5 = new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tenpay/android/wechat/MyKeyboardWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (MyKeyboardWindow.this.mInputEditText == null) {
                    C117292a.m165361g(this, "com/tenpay/android/wechat/MyKeyboardWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else if (view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_x")) {
                    int access$100 = MyKeyboardWindow.this.mXMode;
                    if (access$100 == 1) {
                        MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 59));
                        MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 52));
                        MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(1, 59));
                    } else if (access$100 == 2) {
                        MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 56));
                    }
                    C117292a.m165361g(this, "com/tenpay/android/wechat/MyKeyboardWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    int i = view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_1") ? 8 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_2") ? 9 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_3") ? 10 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_4") ? 11 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_5") ? 12 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_6") ? 13 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_7") ? 14 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_8") ? 15 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_9") ? 16 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_0") ? 7 : view.getId() == MyKeyboardWindow.this.getId("tenpay_keyboard_d") ? 67 : 0;
                    MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, i));
                    MyKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(1, i));
                    C117292a.m165361g(this, "com/tenpay/android/wechat/MyKeyboardWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        };
        this.mKey1.setOnClickListener(r5);
        this.mKey2.setOnClickListener(r5);
        this.mKey3.setOnClickListener(r5);
        this.mKey4.setOnClickListener(r5);
        this.mKey5.setOnClickListener(r5);
        this.mKey6.setOnClickListener(r5);
        this.mKey7.setOnClickListener(r5);
        this.mKey8.setOnClickListener(r5);
        this.mKey9.setOnClickListener(r5);
        this.mKeyX.setOnClickListener(r5);
        this.mKey0.setOnClickListener(r5);
        this.mKeyD.setOnClickListener(r5);
    }

    private void setInnerAccessibility(View.AccessibilityDelegate accessibilityDelegate) {
        MyKeyboardAccessibilityDelegateWrap myKeyboardAccessibilityDelegateWrap = accessibilityDelegate != null ? new MyKeyboardAccessibilityDelegateWrap(accessibilityDelegate) : new MyKeyboardAccessibilityDelegateWrap();
        myKeyboardAccessibilityDelegateWrap.setViewTypeName(TypeModifier.BUTTON_CLASS);
        this.mKeyD.setAccessibilityDelegate(myKeyboardAccessibilityDelegateWrap);
    }

    private void setKeyXText(CharSequence charSequence) {
        this.mKeyX.setText(charSequence);
        this.mKeyX.setContentDescription(charSequence.toString().toLowerCase());
        if (TextUtils.isEmpty(charSequence)) {
            this.mKeyX.setImportantForAccessibility(2);
        } else {
            this.mKeyX.setImportantForAccessibility(1);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            OnTouchListener onTouchListener = this.mOnTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDrawableId(String str) {
        return this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName());
    }

    public int getId(String str) {
        return this.mContext.getResources().getIdentifier(str, "id", this.mContext.getPackageName());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TenpayTTSUtil.destroy();
    }

    public void resetSecureAccessibility() {
        this.mKey0.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey1.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey2.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey3.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey4.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey5.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey6.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey7.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey8.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKey9.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKeyX.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        this.mKeyD.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        setInnerAccessibility((View.AccessibilityDelegate) null);
    }

    public void setInputEditText(EditText editText) {
        if (editText != null) {
            this.mInputEditText = editText;
            int imeOptions = editText.getImeOptions();
            CharSequence imeActionLabel = this.mInputEditText.getImeActionLabel();
            if (!TextUtils.isEmpty(imeActionLabel)) {
                setKeyXText(imeActionLabel);
            }
            if (imeOptions == 1) {
                this.mXMode = 0;
                if (TextUtils.isEmpty(imeActionLabel)) {
                    setKeyXText("");
                }
            }
        }
    }

    public void setKeyboardDisabled(boolean z) {
        this.mKey0.setClickable(!z);
        this.mKey1.setClickable(!z);
        this.mKey2.setClickable(!z);
        this.mKey3.setClickable(!z);
        this.mKey4.setClickable(!z);
        this.mKey5.setClickable(!z);
        this.mKey6.setClickable(!z);
        this.mKey7.setClickable(!z);
        this.mKey8.setClickable(!z);
        this.mKey9.setClickable(!z);
        this.mKeyX.setClickable(!z);
        this.mKeyD.setClickable(!z);
        float f = 0.1f;
        this.mKey0.setAlpha(z ? 0.1f : 1.0f);
        this.mKey1.setAlpha(z ? 0.1f : 1.0f);
        this.mKey2.setAlpha(z ? 0.1f : 1.0f);
        this.mKey3.setAlpha(z ? 0.1f : 1.0f);
        this.mKey4.setAlpha(z ? 0.1f : 1.0f);
        this.mKey5.setAlpha(z ? 0.1f : 1.0f);
        this.mKey6.setAlpha(z ? 0.1f : 1.0f);
        this.mKey7.setAlpha(z ? 0.1f : 1.0f);
        this.mKey8.setAlpha(z ? 0.1f : 1.0f);
        this.mKey9.setAlpha(z ? 0.1f : 1.0f);
        this.mKeyX.setAlpha(z ? 0.1f : 1.0f);
        RelativeLayout relativeLayout = this.mKeyD;
        if (!z) {
            f = 1.0f;
        }
        relativeLayout.setAlpha(f);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.mOnTouchListener = onTouchListener;
    }

    public void setSecureAccessibility(View.AccessibilityDelegate accessibilityDelegate) {
        this.mKey0.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey1.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey2.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey3.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey4.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey5.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey6.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey7.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey8.setAccessibilityDelegate(accessibilityDelegate);
        this.mKey9.setAccessibilityDelegate(accessibilityDelegate);
        this.mKeyX.setAccessibilityDelegate(accessibilityDelegate);
        this.mKeyD.setAccessibilityDelegate(accessibilityDelegate);
        setInnerAccessibility(accessibilityDelegate);
    }

    public void setXMode(int i) {
        this.mXMode = i;
        if (i == 0) {
            setKeyXText("");
        } else if (i == 1) {
            setKeyXText("X");
        } else if (i != 2) {
            this.mXMode = 0;
        } else {
            setKeyXText(".");
        }
    }

    public MyKeyboardWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
