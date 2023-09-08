package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.ClearButtonMode;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KSecureEditText;
import com.tencent.kinda.gen.KSecureEditTextOnTextChangedCallback;
import com.tencent.kinda.gen.KeyboardType;
import com.tencent.kinda.gen.SecureCtrlEncryptType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.android.wechat.TenpaySecureEditText;
import j20.C117292a;
import java.util.ArrayList;
import yq3.C79144b;

public class KindaSecureEditTextImpl extends MMKView<LinearLayout> implements KSecureEditText {
    /* access modifiers changed from: private */
    public ClearButtonMode clearButtonMode = ClearButtonMode.WHILEEDITING;
    private String defaultValue;
    /* access modifiers changed from: private */
    public TenpaySecureEditText editText;
    private SecureCtrlEncryptType encryptType = SecureCtrlEncryptType.TYPE3DES;
    private float expandSize = 24.0f;
    private boolean iconHadShow = false;
    /* access modifiers changed from: private */
    public WalletIconImageView iconImageView;
    private BaseFrActivity mContext;
    private KeyboardType mKeyboardType;
    private int m_maxLength = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public KSecureEditTextOnTextChangedCallback onTextChangedCallback;

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

    private void setregExFilterInput(KeyboardType keyboardType) {
        if (keyboardType == KeyboardType.ID || keyboardType == KeyboardType.CRETAIL) {
            this.editText.setregExFilterInput("[^a-zA-Z0-9]");
        } else if (keyboardType == KeyboardType.NUMBER) {
            this.editText.setregExFilterInput("[^0-9]");
        }
    }

    public ClearButtonMode getClearButtonMode() {
        return this.clearButtonMode;
    }

    public String getDefaultValue() {
        return !Util.isNullOrNil(this.defaultValue) ? this.defaultValue : "";
    }

    public boolean getEnabled() {
        return this.editText.isEnabled();
    }

    public SecureCtrlEncryptType getEncryptType() {
        return this.encryptType;
    }

    public boolean getFocus() {
        return this.editText.isFocused();
    }

    public String getHint() {
        return this.editText.getHint().toString();
    }

    public boolean getIsCommonText() {
        return this.editText.getEditState() == TenpaySecureEditText.EditState.COMMON_TEXT;
    }

    public KeyboardType getKeyboardType() {
        return this.mKeyboardType;
    }

    public int getMaxLength() {
        return this.m_maxLength;
    }

    public String getText() {
        if (this.encryptType != SecureCtrlEncryptType.TYPERSAWITHOUTHASH) {
            return this.editText.get3DesEncrptData();
        }
        TenpaySecureEditText tenpaySecureEditText = this.editText;
        C79144b.m95773a().mo109091f();
        return tenpaySecureEditText.getEncryptDataWithHash(false, true);
    }

    public DynamicColor getTextColor() {
        return new DynamicColor((long) this.editText.getCurrentTextColor(), 0);
    }

    public DynamicColor getTintColor() {
        return null;
    }

    public boolean isCardFromatValid(int i) {
        return this.editText.isAreaIDCardNum(i);
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

    public void setDefaultValue(String str) {
        this.defaultValue = str;
        this.editText.setText(str);
    }

    public void setEnabled(boolean z) {
        this.editText.setEnabled(z);
    }

    public void setEncryptType(SecureCtrlEncryptType secureCtrlEncryptType) {
        this.encryptType = secureCtrlEncryptType;
    }

    public void setFocus(boolean z) {
        if (z) {
            this.editText.requestFocus();
        } else {
            this.editText.clearFocus();
        }
    }

    public void setHint(String str) {
        this.editText.setHint(str);
    }

    public void setIsCommonText(boolean z) {
        this.editText.setIsCommonTextFormat(z);
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.mKeyboardType = keyboardType;
        if (keyboardType == KeyboardType.ID || keyboardType == KeyboardType.CRETAIL) {
            this.mContext.setEditFocusListener(this.editText, 1, false);
        } else if (keyboardType == KeyboardType.NORMAL) {
            this.mContext.setEditFocusListener(this.editText, 0, true);
        }
        setregExFilterInput(keyboardType);
    }

    public void setMaxLength(int i) {
        this.m_maxLength = i;
        this.editText.setFilters(new InputFilter[]{new C45078p0(i, C45078p0.C45079a.MODE_CHINESE_AS_2)});
    }

    public void setOnTextChangedCallback(KSecureEditTextOnTextChangedCallback kSecureEditTextOnTextChangedCallback) {
        this.onTextChangedCallback = kSecureEditTextOnTextChangedCallback;
    }

    public void setText(String str) {
        this.editText.setText(str);
    }

    public void setTextColor(DynamicColor dynamicColor) {
        this.editText.setTextColor((int) ColorUtil.getColorByMode(dynamicColor));
    }

    public void setTextSize(float f) {
        if (f > 0.0f) {
            float f2 = 1.0f;
            if (getSupportDynamicSize()) {
                f2 = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
            }
            this.editText.setTextSize(1, f * f2);
            notifyChanged();
        }
    }

    public void setTintColor(DynamicColor dynamicColor) {
    }

    public void setViewId(String str) {
        super.setViewId(str);
        if (this.iconImageView != null) {
            BaseFrActivity baseFrActivity = this.mContext;
            MMKViewUtil.setId4KindaImplView(baseFrActivity, str + "_btn", this.iconImageView);
        }
    }

    public void setVisibleClearIcon(boolean z) {
        if (z) {
            setIconVisibility(0);
        } else {
            setIconVisibility(4);
        }
    }

    public LinearLayout createView(Context context) {
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        TenpaySecureEditText tenpaySecureEditText = new TenpaySecureEditText(context);
        this.editText = tenpaySecureEditText;
        tenpaySecureEditText.setSingleLine(true);
        this.editText.setBackground((Drawable) null);
        this.editText.setTextSize(1, MMKViewUtil.getScaleSize(context) * 17.0f);
        TenpaySecureEditText.setSalt(C75228t.m90271t());
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setCursorStyle((int) C0966R.C0969drawable.a8h);
        if (this.m_maxLength != Integer.MAX_VALUE) {
            this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.m_maxLength)});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.editText, layoutParams);
        linearLayout.post(new Runnable() {
            public void run() {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) KindaSecureEditTextImpl.this.editText.getLayoutParams();
                layoutParams.height = linearLayout.getHeight();
                KindaSecureEditTextImpl.this.editText.setLayoutParams(layoutParams);
            }
        });
        if (context instanceof BaseFrActivity) {
            BaseFrActivity baseFrActivity = (BaseFrActivity) context;
            this.mContext = baseFrActivity;
            baseFrActivity.setEditFocusListener(this.editText, 0, false);
            this.editText.setTag(this);
        }
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.editText.setHintTextColor(context.getResources().getColor(C0966R.color.f3563xt));
            this.editText.setTextColor(context.getResources().getColor(C0966R.color.a7f));
        }
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
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/KindaSecureEditTextImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (KindaSecureEditTextImpl.this.iconImageView.getVisibility() == 0) {
                    KindaSecureEditTextImpl.this.editText.setText("");
                }
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/KindaSecureEditTextImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        setIconVisibility(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C74942w4.m89784a(context, 16), C74942w4.m89784a(context, 16));
        layoutParams2.setMargins(0, 0, C74942w4.m89784a(context, 4), 0);
        linearLayout.addView(this.iconImageView, layoutParams2);
        this.editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                if (KindaSecureEditTextImpl.this.onTextChangedCallback != null && editable != null) {
                    KindaSecureEditTextImpl.this.onTextChangedCallback.onTextChanged(editable.toString());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (KindaSecureEditTextImpl.this.clearButtonMode != ClearButtonMode.NEVER) {
                    if (charSequence.length() <= 0 || KindaSecureEditTextImpl.this.clearButtonMode != ClearButtonMode.WHILEEDITING) {
                        KindaSecureEditTextImpl.this.setIconVisibility(4);
                    } else {
                        KindaSecureEditTextImpl.this.setIconVisibility(0);
                    }
                }
            }
        });
        return linearLayout;
    }
}
