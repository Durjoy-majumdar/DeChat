package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KMultiLineEditText;
import com.tencent.kinda.gen.KViewOnClickCallback;
import com.tencent.kinda.gen.TextAlign;
import com.tencent.kinda.gen.VoidBoolCallback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.android.wechat.TenpaySecureEditText;
import j20.C117292a;
import java.util.ArrayList;

public class MMKMultiLineEditText extends MMKView<LinearLayout> implements KMultiLineEditText {
    private LinearLayout dummyFocusView = null;
    public EditText editText;
    private VoidBoolCallback focusChangedCallback;
    private DynamicColor hintColor = new DynamicColor(0, 0);
    /* access modifiers changed from: private */
    public String hintText;
    private int maxLength = -1;
    /* access modifiers changed from: private */
    public TextAlign textAlign = TextAlign.LEFT;
    /* access modifiers changed from: private */
    public VoidStringCallback textChangedCallback;
    private DynamicColor textColor = new DynamicColor(-1, 0);
    private VoidCallback textEndEditingCallback;
    private String textFontName;
    private float textSize;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText$2 */
    public static /* synthetic */ class C676282 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.kinda.gen.TextAlign[] r0 = com.tencent.kinda.gen.TextAlign.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$TextAlign = r0
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKMultiLineEditText.C676282.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$1(View view, boolean z) {
        VoidBoolCallback voidBoolCallback = this.focusChangedCallback;
        if (voidBoolCallback != null) {
            voidBoolCallback.call(z);
        }
    }

    /* access modifiers changed from: private */
    public boolean lambda$createView$2(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKMultiLineEditText", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.editText.isFocused()) {
            C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKMultiLineEditText", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        } else if (motionEvent.getAction() == 0) {
            KViewOnClickCallback onClickCallback = getOnClickCallback();
            if (onClickCallback != null) {
                onClickCallback.onClick(this);
                C117292a.m165362h(true, this, "com/tencent/kinda/framework/widget/base/MMKMultiLineEditText", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKMultiLineEditText", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        } else {
            C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKMultiLineEditText", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setFocus$0() {
        this.editText.requestFocus();
        ((InputMethodManager) this.mContext.getSystemService("input_method")).showSoftInput(this.editText, 0);
    }

    public boolean getEnabled() {
        return this.editText.isEnabled();
    }

    public boolean getFocus() {
        return this.editText.isFocused();
    }

    public String getHint() {
        CharSequence hint = this.editText.getHint();
        if (hint != null) {
            return hint.toString();
        }
        String str = this.hintText;
        if (str != null) {
            return str;
        }
        return null;
    }

    public DynamicColor getHintColor() {
        return this.hintColor;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public String getText() {
        Log.m105918d(MMKView.TAG, "MMKMultiLineEditText getText ");
        Editable text = this.editText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public TextAlign getTextAlign() {
        return this.textAlign;
    }

    public DynamicColor getTextColor() {
        return this.textColor;
    }

    public String getTextFont() {
        return this.textFontName;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setEnabled(boolean z) {
        this.editText.setEnabled(z);
    }

    public void setFocus(boolean z) {
        if (z) {
            if (this.editText.hasFocus()) {
                this.editText.clearFocus();
            }
            this.editText.postDelayed(new MMKMultiLineEditText$$a(this), 50);
        } else if (this.editText.hasFocus()) {
            this.editText.clearFocus();
            VoidCallback voidCallback = this.textEndEditingCallback;
            if (voidCallback != null) {
                voidCallback.call();
            }
            ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.editText.getWindowToken(), 0);
        }
    }

    public void setHint(String str) {
        this.hintText = str;
        this.editText.setHint(str);
        notifyChanged();
    }

    public void setHintColor(DynamicColor dynamicColor) {
        this.hintColor = dynamicColor;
        this.editText.setHintTextColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor)));
    }

    public void setMaxLength(int i) {
        if (i >= 0) {
            this.maxLength = i;
            this.editText.setFilters(new InputFilter[]{new MMKEditTextLengthFilter(i)});
        }
    }

    public void setOnFocusChangedImpl(VoidBoolCallback voidBoolCallback) {
        this.focusChangedCallback = voidBoolCallback;
    }

    public void setOnTextChangedImpl(VoidStringCallback voidStringCallback) {
        this.textChangedCallback = voidStringCallback;
    }

    public void setOnTextEndEditingImpl(VoidCallback voidCallback) {
        this.textEndEditingCallback = voidCallback;
    }

    public void setText(String str) {
        Log.m105918d(MMKView.TAG, "MMKMultiLineEditText setText " + str);
        if (str != null && !getText().equals(str)) {
            this.editText.setText(str);
            EditText editText2 = this.editText;
            editText2.setSelection(editText2.getText().length());
        }
    }

    public void setTextAlign(TextAlign textAlign2) {
        EditText editText2;
        if (textAlign2 != null) {
            this.textAlign = textAlign2;
            int i = C676282.$SwitchMap$com$tencent$kinda$gen$TextAlign[textAlign2.ordinal()];
            if (i == 1) {
                ((LinearLayout) getView()).setGravity(8388611);
            } else if (i == 2) {
                ((LinearLayout) getView()).setGravity(1);
            } else if (i == 3 && (editText2 = this.editText) != null) {
                editText2.setGravity(8388613);
            }
            notifyChanged();
        }
    }

    public void setTextColor(DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        this.editText.setTextColor(MMKViewUtil.argbColor(ColorUtil.getColorByMode(dynamicColor)));
    }

    public void setTextFont(String str) {
        if (!Util.isNullOrNil(str)) {
            int i = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : str.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : str.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : str.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : str.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : str.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
            if (i != -1) {
                try {
                    this.editText.setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), C75228t.m90273v(i)));
                    notifyChanged();
                } catch (Exception e) {
                    Log.m105921e(MMKView.TAG, "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                    this.editText.setTypeface((Typeface) null, 0);
                }
                this.textFontName = str;
            }
        }
    }

    public void setTextSize(float f) {
        if (f > 0.0f) {
            float f2 = 1.0f;
            if (getSupportDynamicSize()) {
                f2 = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
            }
            float f3 = f * f2;
            this.textSize = f3;
            this.editText.setTextSize(1, f3);
            notifyChanged();
        }
    }

    public LinearLayout createView(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        this.dummyFocusView = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        this.dummyFocusView.setFocusable(true);
        this.dummyFocusView.setFocusableInTouchMode(true);
        linearLayout.addView(this.dummyFocusView, layoutParams);
        TenpaySecureEditText tenpaySecureEditText = new TenpaySecureEditText(context);
        this.editText = tenpaySecureEditText;
        tenpaySecureEditText.setSingleLine(false);
        this.editText.setMaxLines(20);
        this.editText.setBackground((Drawable) null);
        this.editText.setTextSize(1, MMKViewUtil.getScaleSize(context) * 17.0f);
        this.editText.setTag(this);
        this.editText.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.editText, layoutParams2);
        this.editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                EditText editText;
                EditText editText2;
                TextAlign access$000 = MMKMultiLineEditText.this.textAlign;
                TextAlign textAlign = TextAlign.RIGHT;
                if (access$000 == textAlign && (editText2 = MMKMultiLineEditText.this.editText) != null) {
                    editText2.setTextDirection(3);
                }
                if (!(MMKMultiLineEditText.this.textChangedCallback == null || editable == null)) {
                    MMKMultiLineEditText.this.textChangedCallback.call(editable.toString());
                }
                if (editable == null || TextUtils.isEmpty(editable.toString())) {
                    MMKMultiLineEditText mMKMultiLineEditText = MMKMultiLineEditText.this;
                    EditText editText3 = mMKMultiLineEditText.editText;
                    if (editText3 != null) {
                        editText3.setHint(mMKMultiLineEditText.hintText);
                    }
                    if (MMKMultiLineEditText.this.textAlign == textAlign && (editText = MMKMultiLineEditText.this.editText) != null) {
                        editText.setTextDirection(4);
                    }
                } else {
                    MMKMultiLineEditText.this.editText.setHint("");
                }
                MMKMultiLineEditText.this.notifyChanged();
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.editText.setOnFocusChangeListener(new MMKMultiLineEditText$$b(this));
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.editText.setHintTextColor(context.getResources().getColor(C0966R.color.f3563xt));
            this.editText.setTextColor(context.getResources().getColor(C0966R.color.a7f));
        }
        this.editText.setOnTouchListener(new MMKMultiLineEditText$$c(this));
        this.editText.setId(C67448R.C67449id.fgd);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        return linearLayout;
    }
}
