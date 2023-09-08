package com.tenpay.wphk;

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

public class HkWxKeyboardWindow extends LinearLayout {
    public static final int X_MODE_CHARACTER = 1;
    public static final int X_MODE_DOT = 2;
    public static final int X_MODE_NONE = 0;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mInputEditText;
    private RelativeLayout mKeyD;
    private TextView[] mKeys = new TextView[11];
    private OnTouchListener mOnTouchListener;
    /* access modifiers changed from: private */
    public int mXMode = 0;

    public interface OnTouchListener {
        boolean onTouch(View view, MotionEvent motionEvent);
    }

    public HkWxKeyboardWindow(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context.getApplicationContext();
        TenpayTTSUtil.init(context);
        View inflate = LayoutInflater.from(context).inflate(this.mContext.getResources().getIdentifier("tenpay_number_keyboard", "layout", this.mContext.getPackageName()), this, true);
        this.mKeys[1] = (TextView) inflate.findViewById(getId("tenpay_keyboard_1"));
        this.mKeys[2] = (TextView) inflate.findViewById(getId("tenpay_keyboard_2"));
        this.mKeys[3] = (TextView) inflate.findViewById(getId("tenpay_keyboard_3"));
        this.mKeys[4] = (TextView) inflate.findViewById(getId("tenpay_keyboard_4"));
        this.mKeys[5] = (TextView) inflate.findViewById(getId("tenpay_keyboard_5"));
        this.mKeys[6] = (TextView) inflate.findViewById(getId("tenpay_keyboard_6"));
        this.mKeys[7] = (TextView) inflate.findViewById(getId("tenpay_keyboard_7"));
        this.mKeys[8] = (TextView) inflate.findViewById(getId("tenpay_keyboard_8"));
        this.mKeys[9] = (TextView) inflate.findViewById(getId("tenpay_keyboard_9"));
        this.mKeys[10] = (TextView) inflate.findViewById(getId("tenpay_keyboard_x"));
        int i = 0;
        this.mKeys[0] = (TextView) inflate.findViewById(getId("tenpay_keyboard_0"));
        this.mKeyD = (RelativeLayout) inflate.findViewById(getId("tenpay_keyboard_d"));
        C752701 r7 = new View.OnClickListener() {
            public void onClick(View view) {
                if (HkWxKeyboardWindow.this.mInputEditText != null) {
                    if (view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_x")) {
                        int access$100 = HkWxKeyboardWindow.this.mXMode;
                        if (access$100 == 1) {
                            HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 59));
                            HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 52));
                            HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(1, 59));
                        } else if (access$100 == 2) {
                            HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, 56));
                        }
                    } else {
                        int i = view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_1") ? 8 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_2") ? 9 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_3") ? 10 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_4") ? 11 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_5") ? 12 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_6") ? 13 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_7") ? 14 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_8") ? 15 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_9") ? 16 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_0") ? 7 : view.getId() == HkWxKeyboardWindow.this.getId("tenpay_keyboard_d") ? 67 : 0;
                        HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(0, i));
                        HkWxKeyboardWindow.this.mInputEditText.dispatchKeyEvent(new KeyEvent(1, i));
                    }
                }
            }
        };
        for (int i2 = 0; i2 <= 9; i2++) {
            this.mKeys[i2].setContentDescription(String.valueOf(i2));
        }
        this.mKeys[10].setContentDescription("字母X");
        this.mKeyD.setContentDescription("删除");
        while (true) {
            TextView[] textViewArr = this.mKeys;
            if (i < textViewArr.length) {
                textViewArr[i].setOnClickListener(r7);
                i++;
            } else {
                this.mKeyD.setOnClickListener(r7);
                return;
            }
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
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.mKeys;
            if (i < textViewArr.length) {
                textViewArr[i].setAccessibilityDelegate((View.AccessibilityDelegate) null);
                i++;
            } else {
                this.mKeyD.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                return;
            }
        }
    }

    public void setInputEditText(EditText editText) {
        if (editText != null) {
            this.mInputEditText = editText;
            int imeOptions = editText.getImeOptions();
            CharSequence imeActionLabel = this.mInputEditText.getImeActionLabel();
            if (!TextUtils.isEmpty(imeActionLabel)) {
                this.mKeys[10].setText(imeActionLabel);
            }
            if (imeOptions == 1) {
                this.mXMode = 0;
                if (TextUtils.isEmpty(imeActionLabel)) {
                    this.mKeys[10].setText("");
                }
            }
        }
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.mOnTouchListener = onTouchListener;
    }

    public void setSecureAccessibility(View.AccessibilityDelegate accessibilityDelegate) {
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.mKeys;
            if (i < textViewArr.length) {
                textViewArr[i].setAccessibilityDelegate(accessibilityDelegate);
                i++;
            } else {
                this.mKeyD.setAccessibilityDelegate(accessibilityDelegate);
                return;
            }
        }
    }

    public void setXMode(int i) {
        this.mXMode = i;
        TextView textView = this.mKeys[10];
        if (i == 0) {
            textView.setText("");
            textView.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom_new"));
        } else if (i == 1) {
            textView.setText("X");
            textView.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom_new"));
        } else if (i != 2) {
            this.mXMode = 0;
        } else {
            textView.setText(".");
            textView.setBackgroundResource(getDrawableId("tenpay_keybtn_bottom_new"));
        }
    }

    public HkWxKeyboardWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
