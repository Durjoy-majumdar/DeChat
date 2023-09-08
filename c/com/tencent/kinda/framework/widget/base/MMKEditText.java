package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.ClearButtonMode;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.EditTextRestrictType;
import com.tencent.kinda.gen.KEditText;
import com.tencent.kinda.gen.KEditTextOnEditorActionCallback;
import com.tencent.kinda.gen.KEditTextOnFocusChangeCallback;
import com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback;
import com.tencent.kinda.gen.KEditTextOnTextChangedCallback;
import com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback;
import com.tencent.kinda.gen.KView;
import com.tencent.kinda.gen.KViewOnClickCallback;
import com.tencent.kinda.gen.KeyboardType;
import com.tencent.kinda.gen.TextAlign;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import com.tenpay.android.wechat.TenpaySecureEncrypt;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p206nj.C11171e;

public class MMKEditText extends MMKView<LinearLayout> implements KEditText {
    /* access modifiers changed from: private */
    public ClearButtonMode clearButtonMode = ClearButtonMode.WHILEEDITING;
    private String confirmButtonText;
    private DynamicColor cursorColor;
    private LinearLayout dummyFocusView = null;
    public TenpaySecureEditText editText;
    private float expandSize = 24.0f;
    private DynamicColor hintColor = new DynamicColor(0, 0);
    /* access modifiers changed from: private */
    public String hintText;
    private float hintTextSize;
    private boolean iconHadShow = false;
    /* access modifiers changed from: private */
    public WalletIconImageView iconImageView;
    private View.OnFocusChangeListener initialOnFocusChangeListener = null;
    /* access modifiers changed from: private */
    public KeyboardType keyboardType = KeyboardType.NORMAL;
    public BaseFrActivity mBaseFrActivity = null;
    /* access modifiers changed from: private */
    public String mFixedHeaderText = "";
    public KEditTextOnEditorActionCallback mKEditTextOnEditorActionCallback;
    public KEditTextOnFocusChangeCallback mKEditTextOnFocusChangeCallback;
    public KEditTextOnTextEndEditingCallback mKEditTextOnTextEndEditingCallback;
    /* access modifiers changed from: private */
    public int mMoneyRestrictionIntegerLimit = 10;
    private EditTextRestrictType mRestriceType;
    private int maxLength = -1;
    public KEditTextOnTextBeginChangeCallback onTextBeginChangeCallback;
    public KEditTextOnTextChangedCallback onTextChangedCallback;
    private boolean showFloatButton = false;
    /* access modifiers changed from: private */
    public boolean stayFocusWhenEnterClick = false;
    /* access modifiers changed from: private */
    public TextAlign textAlign;
    private DynamicColor textColor = new DynamicColor(0, 0);
    private String textFontName;
    private float textSize;
    private WcPayKeyboard wcPayKeyboard;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKEditText$11 */
    public static /* synthetic */ class C6761611 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$KeyboardType;
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0087 */
        static {
            /*
                com.tencent.kinda.gen.KeyboardType[] r0 = com.tencent.kinda.gen.KeyboardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$kinda$gen$KeyboardType = r0
                r1 = 1
                com.tencent.kinda.gen.KeyboardType r2 = com.tencent.kinda.gen.KeyboardType.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.kinda.gen.KeyboardType r3 = com.tencent.kinda.gen.KeyboardType.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.EMAIL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.PHONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.ID     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.CRETAIL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.DIGIT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = $SwitchMap$com$tencent$kinda$gen$KeyboardType     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tencent.kinda.gen.KeyboardType r4 = com.tencent.kinda.gen.KeyboardType.DIGIT_NOACTION     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.tencent.kinda.gen.TextAlign[] r3 = com.tencent.kinda.gen.TextAlign.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$tencent$kinda$gen$TextAlign = r3
                com.tencent.kinda.gen.TextAlign r4 = com.tencent.kinda.gen.TextAlign.LEFT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.tencent.kinda.gen.TextAlign r3 = com.tencent.kinda.gen.TextAlign.CENTER     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = $SwitchMap$com$tencent$kinda$gen$TextAlign     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.tencent.kinda.gen.TextAlign r1 = com.tencent.kinda.gen.TextAlign.RIGHT     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKEditText.C6761611.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void changeTextSizeIfNeed() {
        if (this.hintTextSize > 0.0f) {
            float f = 1.0f;
            if (this.editText.getText().length() == 0) {
                if (getSupportDynamicSize()) {
                    f = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
                }
                this.editText.setTextSize(1, this.hintTextSize * f);
            } else {
                if (getSupportDynamicSize()) {
                    f = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
                }
                this.editText.setTextSize(1, this.textSize * f);
            }
            notifyChanged();
        }
    }

    /* access modifiers changed from: private */
    public void setIconVisibility(int i) {
        this.iconImageView.setVisibility(i);
        if (!this.iconHadShow && i == 0) {
            WalletIconImageView walletIconImageView = this.iconImageView;
            float f = this.expandSize;
            MMKViewUtil.setExpandSize(walletIconImageView, f, f);
            this.iconHadShow = true;
        }
    }

    public void callBackKindaTextEndEditing() {
        KEditTextOnTextEndEditingCallback kEditTextOnTextEndEditingCallback = this.mKEditTextOnTextEndEditingCallback;
        if (kEditTextOnTextEndEditingCallback != null) {
            kEditTextOnTextEndEditingCallback.onTextEndEditing(this.editText.getText().toString());
        }
    }

    public void enableConfirmBtn(boolean z) {
        WcPayKeyboard wcPayKeyboard2 = this.wcPayKeyboard;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.mo104738c(z);
        }
    }

    public String encryptWith3Des() {
        return new TenpaySecureEncrypt().desedeVerifyCode(this.editText.getText().toString(), Long.toString(C31543z5.m39451a() / 1000));
    }

    public ClearButtonMode getClearButtonMode() {
        return this.clearButtonMode;
    }

    public String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public DynamicColor getCursorColor() {
        return this.cursorColor;
    }

    public TenpaySecureEditText getEditText() {
        return this.editText;
    }

    public boolean getEnabled() {
        return this.editText.isEnabled();
    }

    public String getFixedHeaderText() {
        return this.mFixedHeaderText;
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

    public float getHintTextSize() {
        return this.hintTextSize;
    }

    public boolean getIsSingleLine() {
        return this.editText.getMaxLines() == 1;
    }

    public KeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public int getMoneyRestrictionIntegerLimit() {
        return this.mMoneyRestrictionIntegerLimit;
    }

    public EditTextRestrictType getRestrictType() {
        return this.mRestriceType;
    }

    public int getSelection() {
        return this.editText.getSelectionStart();
    }

    public boolean getShowFloatButton() {
        return this.showFloatButton;
    }

    public boolean getStayFocusWhenEnter() {
        return this.stayFocusWhenEnterClick;
    }

    public String getText() {
        Log.m105918d(MMKView.TAG, "MMKLabelView getText ");
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

    public DynamicColor getTintColor() {
        return null;
    }

    public void invokeInitialOnFocusChangeListener(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.initialOnFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    public void setClearButtonMode(ClearButtonMode clearButtonMode2) {
        this.clearButtonMode = clearButtonMode2;
        if (clearButtonMode2 == ClearButtonMode.NEVER) {
            setIconVisibility(8);
        } else if (clearButtonMode2 != ClearButtonMode.WHILEEDITING && clearButtonMode2 != ClearButtonMode.UNLESSEDITING) {
            if (clearButtonMode2 == ClearButtonMode.ALWAYS) {
                setIconVisibility(0);
            } else {
                setIconVisibility(4);
            }
        }
    }

    public void setConfirmButtonText(String str) {
        this.confirmButtonText = str;
    }

    public void setCursorColor(DynamicColor dynamicColor) {
        this.cursorColor = dynamicColor;
        if (C11171e.m11046c(29)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setSize(C76577a.m92150a(this.mContext, 1.5f), -1);
            gradientDrawable.setColor((int) ColorUtil.getColorByModeNoCompat(dynamicColor));
            this.editText.setCursorStyle((Drawable) gradientDrawable);
        } else if ((dynamicColor == null || dynamicColor.getNormalColor() != 4294951680L) && dynamicColor.getNormalColor() != 4290481664L) {
            Log.m105928w(MMKView.TAG, "can't set cursor color on low version");
        } else {
            this.editText.setCursorStyle((int) C0966R.C0969drawable.a9i);
        }
    }

    public void setEnabled(boolean z) {
        this.editText.setEnabled(z);
    }

    public void setFixedHeaderText(String str) {
        this.mFixedHeaderText = str;
        this.editText.setFixedHeaderText(str);
    }

    public void setFocus(boolean z) {
        if (z) {
            if (this.editText.hasFocus()) {
                this.editText.clearFocus();
            }
            this.editText.postDelayed(new Runnable() {
                public void run() {
                    MMKEditText.this.editText.requestFocus();
                    if (MMKEditText.this.keyboardType != KeyboardType.ID && MMKEditText.this.keyboardType != KeyboardType.CRETAIL && MMKEditText.this.keyboardType != KeyboardType.DIGIT && MMKEditText.this.keyboardType != KeyboardType.DIGIT_NOACTION) {
                        ((InputMethodManager) MMKEditText.this.mContext.getSystemService("input_method")).showSoftInput(MMKEditText.this.editText, 0);
                    }
                }
            }, 50);
        } else if (this.editText.hasFocus()) {
            this.editText.clearFocus();
            if (this.keyboardType == KeyboardType.NORMAL) {
                callBackKindaTextEndEditing();
            }
            KeyboardType keyboardType2 = this.keyboardType;
            if (keyboardType2 != KeyboardType.ID && keyboardType2 != KeyboardType.CRETAIL && keyboardType2 != KeyboardType.DIGIT && keyboardType2 != KeyboardType.DIGIT_NOACTION) {
                ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(this.editText.getWindowToken(), 0);
            }
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

    public void setHintTextSize(float f) {
        this.hintTextSize = f;
        changeTextSizeIfNeed();
    }

    public void setIsSingleLine(boolean z) {
        if (z) {
            this.editText.setMaxLines(1);
        } else {
            this.editText.setMaxLines(2);
        }
    }

    public void setKeyboardType(KeyboardType keyboardType2) {
        this.keyboardType = keyboardType2;
        switch (C6761611.$SwitchMap$com$tencent$kinda$gen$KeyboardType[keyboardType2.ordinal()]) {
            case 1:
                this.editText.setInputType(0);
                return;
            case 2:
                this.editText.setInputType(2);
                return;
            case 3:
                this.editText.setInputType(128);
                return;
            case 4:
                this.editText.setInputType(32);
                return;
            case 5:
                this.editText.setInputType(3);
                return;
            case 6:
            case 7:
                BaseFrActivity baseFrActivity = this.mBaseFrActivity;
                if (baseFrActivity != null) {
                    baseFrActivity.setEditFocusListener(this.editText, 1, false);
                    this.mBaseFrActivity.setTenpayKBStateListener(new C75217h() {
                        public void onVisibleStateChange(boolean z) {
                            if (!z && MMKEditText.this.editText.isFocused()) {
                                MMKEditText.this.editText.clearFocus();
                            }
                        }
                    });
                    return;
                }
                return;
            case 8:
            case 9:
                this.editText.setImeOptions(6);
                this.editText.setKeyListener(new NumberKeyListener() {
                    public char[] getAcceptedChars() {
                        return (MMKEditText.this.mFixedHeaderText + "01234567890.").toCharArray();
                    }

                    public int getInputType() {
                        return 532482;
                    }
                });
                String str = this.confirmButtonText;
                if (TextUtils.isEmpty(str)) {
                    str = MMApplicationContext.getContext().getString(C0966R.string.a18);
                }
                if (this.keyboardType == KeyboardType.DIGIT_NOACTION) {
                    str = "";
                }
                BaseFrActivity baseFrActivity2 = this.mBaseFrActivity;
                this.wcPayKeyboard = KindaWcKeyboardHelpr.bind((UIPageFragmentActivity) baseFrActivity2, this, str, baseFrActivity2.mTenpayKBStateCallBackListener);
                this.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        Log.m105919d("MMKEditText", "on eidtor action: %s", keyEvent);
                        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                            if (!MMKEditText.this.stayFocusWhenEnterClick) {
                                MMKEditText.this.editText.clearFocus();
                            }
                            KEditTextOnEditorActionCallback kEditTextOnEditorActionCallback = MMKEditText.this.mKEditTextOnEditorActionCallback;
                            if (kEditTextOnEditorActionCallback != null) {
                                kEditTextOnEditorActionCallback.onEditorAction(com.tencent.kinda.gen.KeyEvent.ENTER);
                            }
                        }
                        return true;
                    }
                });
                return;
            default:
                return;
        }
    }

    public void setMaxLength(int i) {
        if (i >= 0) {
            this.maxLength = i;
            this.editText.setFilters(new InputFilter[]{new MMKEditTextLengthFilter(i)});
        }
    }

    public void setMoneyRestrictionIntegerLimit(int i) {
        this.mMoneyRestrictionIntegerLimit = i;
    }

    public void setNeedForceDismissFloatButton() {
    }

    public void setOnEditorActionCallback(KEditTextOnEditorActionCallback kEditTextOnEditorActionCallback) {
        this.mKEditTextOnEditorActionCallback = kEditTextOnEditorActionCallback;
    }

    public void setOnFocusChangeCallback(KEditTextOnFocusChangeCallback kEditTextOnFocusChangeCallback) {
        this.mKEditTextOnFocusChangeCallback = kEditTextOnFocusChangeCallback;
    }

    public void setOnTextBeginChangeCallback(KEditTextOnTextBeginChangeCallback kEditTextOnTextBeginChangeCallback) {
        this.onTextBeginChangeCallback = kEditTextOnTextBeginChangeCallback;
    }

    public void setOnTextChangedCallback(KEditTextOnTextChangedCallback kEditTextOnTextChangedCallback) {
        this.onTextChangedCallback = kEditTextOnTextChangedCallback;
    }

    public void setOnTextEndEditingCallback(KEditTextOnTextEndEditingCallback kEditTextOnTextEndEditingCallback) {
        this.mKEditTextOnTextEndEditingCallback = kEditTextOnTextEndEditingCallback;
    }

    public void setRestrictType(EditTextRestrictType editTextRestrictType) {
        this.mRestriceType = editTextRestrictType;
        if (editTextRestrictType == EditTextRestrictType.MONEY) {
            this.editText.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable editable) {
                    MMKEditText.this.editText.removeTextChangedListener(this);
                    if (editable.toString().startsWith(".")) {
                        editable.insert(0, "0");
                    }
                    String obj = editable.toString();
                    int indexOf = obj.indexOf(".");
                    int length = obj.length();
                    int access$900 = MMKEditText.this.mMoneyRestrictionIntegerLimit;
                    if (indexOf < 0 || length - indexOf <= 3) {
                        int i = access$900 + 2;
                        if (indexOf > i) {
                            WalletFormView.m90178g(MMKEditText.this.editText, obj, i, indexOf);
                        } else if (indexOf == -1 && length > access$900) {
                            WalletFormView.m90178g(MMKEditText.this.editText, obj, access$900, length);
                        } else if (!MMKEditText.this.editText.isMoneyAmount()) {
                            WalletFormView.m90178g(MMKEditText.this.editText, obj, obj.length() - 1, obj.length());
                        } else if (obj.length() > 1 && obj.startsWith("0") && indexOf == -1) {
                            WalletFormView.m90178g(MMKEditText.this.editText, obj, 0, 1);
                        }
                    } else {
                        WalletFormView.m90178g(MMKEditText.this.editText, obj, indexOf + 3, length);
                    }
                    MMKEditText.this.editText.addTextChangedListener(this);
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
        }
    }

    public void setSelection(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.editText;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
    }

    public void setShowFloatButton(boolean z) {
        BaseFragment baseFragment;
        this.showFloatButton = z;
        BaseFrActivity baseFrActivity = this.mBaseFrActivity;
        if (baseFrActivity != null && (baseFragment = baseFrActivity.topShowFragment()) != null) {
            baseFragment.showSingleActionStWcKbWhenHide = z;
        }
    }

    public void setStayFocusWhenEnter(boolean z) {
        this.stayFocusWhenEnterClick = z;
    }

    public void setText(String str) {
        Log.m105918d(MMKView.TAG, "MMKLabelView setText " + str);
        if (str != null && !getText().equals(str)) {
            this.editText.setText(str);
            TenpaySecureEditText tenpaySecureEditText = this.editText;
            tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        }
    }

    public void setTextAlign(TextAlign textAlign2) {
        TenpaySecureEditText tenpaySecureEditText;
        if (textAlign2 != null) {
            this.textAlign = textAlign2;
            int i = C6761611.$SwitchMap$com$tencent$kinda$gen$TextAlign[textAlign2.ordinal()];
            if (i == 1) {
                ((LinearLayout) getView()).setGravity(3);
            } else if (i == 2) {
                ((LinearLayout) getView()).setGravity(1);
            } else if (i == 3 && (tenpaySecureEditText = this.editText) != null) {
                tenpaySecureEditText.setGravity(8388613);
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

    public void setTintColor(DynamicColor dynamicColor) {
    }

    public void setViewId(String str) {
        super.setViewId(str);
        if (this.iconImageView != null) {
            Context context = this.mContext;
            MMKViewUtil.setId4KindaImplView(context, str + "_btn", this.iconImageView);
        }
    }

    public void setVisibleClearIcon(boolean z) {
        if (!z || this.editText.getText().length() <= 0) {
            setIconVisibility(4);
        } else {
            setIconVisibility(0);
        }
    }

    public void setupToolBarView(KView kView) {
        if (this.wcPayKeyboard != null && kView != null) {
            this.wcPayKeyboard.setToolBarContent(((MMKView) kView).getView());
        }
    }

    public LinearLayout createView(Context context) {
        BaseFragment baseFragment;
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
        this.editText.setMaxLines(2);
        this.editText.setBackground((Drawable) null);
        this.editText.setTextSize(1, MMKViewUtil.getScaleSize(context) * 17.0f);
        this.editText.setTag(this);
        this.editText.setCursorStyle((int) C0966R.C0969drawable.a8h);
        this.editText.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        linearLayout.addView(this.editText, layoutParams2);
        WalletIconImageView walletIconImageView = new WalletIconImageView(context);
        this.iconImageView = walletIconImageView;
        int color = context.getResources().getColor(C0966R.color.f3107fh);
        walletIconImageView.f212566u = C0966R.raw.icons_filled_close2;
        walletIconImageView.f212567v = color;
        this.iconImageView.setToClearState(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKEditText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (MMKEditText.this.iconImageView.getVisibility() == 0) {
                    MMKEditText.this.editText.setText("");
                }
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/MMKEditText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        setIconVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C74942w4.m89784a(context, 16), C74942w4.m89784a(context, 16));
        layoutParams3.setMargins(16, 0, C74942w4.m89784a(context, 4), 0);
        linearLayout.addView(this.iconImageView, layoutParams3);
        linearLayout.post(new Runnable() {
            public void run() {
                if (MMKEditText.this.clearButtonMode != ClearButtonMode.NEVER) {
                    MMKEditText.this.setIconVisibility(4);
                    MMKEditText.this.notifyChanged();
                }
            }
        });
        if (context instanceof BaseFrActivity) {
            this.mBaseFrActivity = (BaseFrActivity) context;
        }
        this.editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                TenpaySecureEditText tenpaySecureEditText;
                TenpaySecureEditText tenpaySecureEditText2;
                TextAlign access$300 = MMKEditText.this.textAlign;
                TextAlign textAlign = TextAlign.RIGHT;
                if (access$300 == textAlign && (tenpaySecureEditText2 = MMKEditText.this.editText) != null) {
                    tenpaySecureEditText2.setTextDirection(3);
                }
                KEditTextOnTextChangedCallback kEditTextOnTextChangedCallback = MMKEditText.this.onTextChangedCallback;
                if (!(kEditTextOnTextChangedCallback == null || editable == null)) {
                    kEditTextOnTextChangedCallback.onTextChanged(editable.toString());
                }
                if (editable == null || TextUtils.isEmpty(editable.toString())) {
                    MMKEditText mMKEditText = MMKEditText.this;
                    mMKEditText.editText.setHint(mMKEditText.hintText);
                    if (MMKEditText.this.textAlign == textAlign && (tenpaySecureEditText = MMKEditText.this.editText) != null) {
                        tenpaySecureEditText.setTextDirection(4);
                    }
                } else {
                    MMKEditText.this.editText.setHint("");
                }
                MMKEditText.this.changeTextSizeIfNeed();
                MMKEditText.this.notifyChanged();
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                KEditTextOnTextBeginChangeCallback kEditTextOnTextBeginChangeCallback = MMKEditText.this.onTextBeginChangeCallback;
                if (kEditTextOnTextBeginChangeCallback != null && charSequence != null) {
                    kEditTextOnTextBeginChangeCallback.onTextBeginChange(charSequence.toString());
                }
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (MMKEditText.this.clearButtonMode == ClearButtonMode.NEVER) {
                    MMKEditText.this.setIconVisibility(8);
                } else if (charSequence == null || charSequence.length() <= 0 || MMKEditText.this.clearButtonMode != ClearButtonMode.WHILEEDITING || !MMKEditText.this.editText.hasFocus()) {
                    MMKEditText.this.setIconVisibility(4);
                } else {
                    MMKEditText.this.setIconVisibility(0);
                }
            }
        });
        C676194 r1 = new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                boolean z2 = MMKEditText.this.clearButtonMode == ClearButtonMode.WHILEEDITING || MMKEditText.this.clearButtonMode == ClearButtonMode.ALWAYS || MMKEditText.this.clearButtonMode == ClearButtonMode.UNLESSEDITING;
                if (z && MMKEditText.this.editText.getText().length() > 0 && z2) {
                    MMKEditText.this.setIconVisibility(0);
                } else if (MMKEditText.this.clearButtonMode == ClearButtonMode.NEVER) {
                    MMKEditText.this.setIconVisibility(8);
                } else {
                    MMKEditText.this.setIconVisibility(4);
                }
                KEditTextOnFocusChangeCallback kEditTextOnFocusChangeCallback = MMKEditText.this.mKEditTextOnFocusChangeCallback;
                if (kEditTextOnFocusChangeCallback != null) {
                    kEditTextOnFocusChangeCallback.onFocusChange(z);
                }
            }
        };
        this.initialOnFocusChangeListener = r1;
        this.editText.setOnFocusChangeListener(r1);
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.editText.setHintTextColor(context.getResources().getColor(C0966R.color.f3563xt));
            this.editText.setTextColor(context.getResources().getColor(C0966R.color.a7f));
        }
        this.editText.setOnTouchListener(new View.OnTouchListener() {
            private byte _hellAccFlag_;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/MMKEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (MMKEditText.this.editText.isFocused()) {
                    C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else if (motionEvent.getAction() == 0) {
                    KViewOnClickCallback onClickCallback = MMKEditText.this.getOnClickCallback();
                    if (onClickCallback != null) {
                        onClickCallback.onClick(MMKEditText.this);
                        C117292a.m165362h(true, this, "com/tencent/kinda/framework/widget/base/MMKEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                    C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                } else {
                    C117292a.m165362h(false, this, "com/tencent/kinda/framework/widget/base/MMKEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            }
        });
        this.editText.setId(C67448R.C67449id.fgd);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        BaseFrActivity baseFrActivity = this.mBaseFrActivity;
        if (!(baseFrActivity == null || (baseFragment = baseFrActivity.topShowFragment()) == null)) {
            baseFragment.showSingleActionStWcKbWhenHide = this.showFloatButton;
        }
        return linearLayout;
    }
}
