package com.tenpay.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TenpayKeyboardView extends LinearLayout {
    private static final int NUM_KEY_COUNT = 10;
    private static final int TOTAL_KEY_COUNT = 12;
    private ImageView deleteImage;
    private View[] hSplitLines = new View[3];
    /* access modifiers changed from: private */
    public TenpaySecureInputView inputView;
    /* access modifiers changed from: private */
    public int[] keyCodes = new int[12];
    private View keyDel;
    private View.OnClickListener keyListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (TenpayKeyboardView.this.inputView != null) {
                view.getId();
                int id = view.getId();
                int i = 0;
                for (int i2 = 0; i2 < 12; i2++) {
                    if (id == TenpayKeyboardView.this.keyResIds[i2]) {
                        i = TenpayKeyboardView.this.keyCodes[i2];
                    }
                }
                TenpayKeyboardView.this.inputView.dispatchKeyEvent(new KeyEvent(0, i));
                TenpayKeyboardView.this.inputView.dispatchKeyEvent(new KeyEvent(1, i));
            }
        }
    };
    /* access modifiers changed from: private */
    public int[] keyResIds = new int[12];
    private TextView keyX;
    private TextView[] numKeys = new TextView[10];
    private View[] vSplitLines = new View[6];

    public TenpayKeyboardView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View inflate = LayoutInflater.from(context).inflate(context.getResources().getIdentifier("tenpay_sc_keyboard", "layout", context.getPackageName()), this, true);
        char[] charArray = "0123456789".toCharArray();
        for (int i = 0; i < 10; i++) {
            int[] iArr = this.keyResIds;
            iArr[i] = getId("tenpay_sc_keyboard_" + charArray[i]);
            this.numKeys[i] = (TextView) inflate.findViewById(this.keyResIds[i]);
            this.numKeys[i].setOnClickListener(this.keyListener);
        }
        this.keyResIds[10] = getId("tenpay_sc_keyboard_x");
        TextView textView = (TextView) inflate.findViewById(this.keyResIds[10]);
        this.keyX = textView;
        textView.setOnClickListener(this.keyListener);
        this.keyResIds[11] = getId("tenpay_sc_keyboard_del");
        View findViewById = inflate.findViewById(this.keyResIds[11]);
        this.keyDel = findViewById;
        findViewById.setOnClickListener(this.keyListener);
        this.deleteImage = (ImageView) inflate.findViewById(getId("tenpay_sc_keyboard_del_icon"));
        int i2 = 0;
        while (i2 < this.vSplitLines.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("tenpay_sc_keyboard_split_v");
            int i3 = i2 + 1;
            sb.append(i3);
            this.vSplitLines[i2] = inflate.findViewById(getId(sb.toString()));
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < this.hSplitLines.length) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("tenpay_sc_keyboard_split_h");
            int i5 = i4 + 1;
            sb4.append(i5);
            this.hSplitLines[i4] = inflate.findViewById(getId(sb4.toString()));
            i4 = i5;
        }
        for (int i6 = 0; i6 <= 9; i6++) {
            this.keyCodes[i6] = i6 + 7;
        }
        int[] iArr2 = this.keyCodes;
        iArr2[10] = 52;
        iArr2[11] = 67;
    }

    public void bindInputView(TenpaySecureInputView tenpaySecureInputView) {
        this.inputView = tenpaySecureInputView;
    }

    public int getDrawableId(String str) {
        return getContext().getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    public int getId(String str) {
        return getContext().getResources().getIdentifier(str, "id", getContext().getPackageName());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDeleteBackground(Drawable drawable) {
        this.keyDel.setBackground(drawable);
    }

    public void setDeleteBackgroundColor(int i) {
        this.keyDel.setBackgroundColor(i);
    }

    public void setDeleteImage(Drawable drawable) {
        this.deleteImage.setImageDrawable(drawable);
    }

    public void setExtendBackground(Drawable drawable) {
        this.keyX.setBackground(drawable);
    }

    public void setExtendBackgroundColor(int i) {
        this.keyX.setBackgroundColor(i);
    }

    public void setExtendChar(Character ch) {
        if (ch == null) {
            this.keyX.setText("");
            this.keyCodes[10] = 0;
            return;
        }
        this.keyX.setText(ch.toString());
        if (ch.equals('.')) {
            this.keyCodes[10] = 56;
        } else if (ch.equals('X') || ch.equals('x')) {
            this.keyCodes[10] = 52;
        }
    }

    public void setLineColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            View[] viewArr = this.vSplitLines;
            if (i3 >= viewArr.length) {
                break;
            }
            viewArr[i3].setBackgroundColor(i);
            i3++;
        }
        while (true) {
            View[] viewArr2 = this.hSplitLines;
            if (i2 < viewArr2.length) {
                viewArr2[i2].setBackgroundColor(i);
                i2++;
            } else {
                return;
            }
        }
    }

    public void setLineWidth(float f) {
        int i = 0;
        int i2 = 0;
        while (true) {
            View[] viewArr = this.vSplitLines;
            if (i2 >= viewArr.length) {
                break;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewArr[i2].getLayoutParams();
            layoutParams.width = (int) (0.5f + f);
            this.vSplitLines[i2].setLayoutParams(layoutParams);
            i2++;
        }
        while (true) {
            View[] viewArr2 = this.hSplitLines;
            if (i < viewArr2.length) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewArr2[i].getLayoutParams();
                layoutParams2.height = (int) (f + 0.5f);
                this.hSplitLines[i].setLayoutParams(layoutParams2);
                i++;
            } else {
                return;
            }
        }
    }

    public void setNumberBackground(Drawable drawable) {
        for (int i = 0; i < 10; i++) {
            this.numKeys[i].setBackground(drawable);
        }
    }

    public void setNumberBackgroundColor(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            this.numKeys[i2].setBackgroundColor(i);
        }
    }

    public void setTextColor(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            this.numKeys[i2].setTextColor(i);
            this.keyX.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        for (int i = 0; i < 10; i++) {
            this.numKeys[i].setTextSize(f);
            this.keyX.setTextSize(f);
        }
    }

    public TenpayKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }
}
