package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KCardNumberEditView;
import com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback;
import com.tencent.kinda.gen.KCardNumberEditViewOnTextEndEditingCallback;
import com.tencent.kinda.gen.KViewOnClickCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.android.wechat.TenpaySecureEditText;
import yq3.C79144b;

public class KindaCardNumberEditViewImpl extends MMKView<TenpaySecureEditText> implements KCardNumberEditView {
    /* access modifiers changed from: private */
    public TenpaySecureEditText cardNumberView = null;
    private DynamicColor hintColor = new DynamicColor(-1, 0);
    /* access modifiers changed from: private */
    public KCardNumberEditViewOnTextChangedCallback m_callback;
    private KCardNumberEditViewOnTextEndEditingCallback m_endEditingCallback;
    private DynamicColor normalColor = new DynamicColor(-1, 0);

    public void callbackKindaTextEndEditing() {
        KCardNumberEditViewOnTextEndEditingCallback kCardNumberEditViewOnTextEndEditingCallback = this.m_endEditingCallback;
        if (kCardNumberEditViewOnTextEndEditingCallback != null) {
            TenpaySecureEditText tenpaySecureEditText = this.cardNumberView;
            C79144b.m95773a().mo109091f();
            kCardNumberEditViewOnTextEndEditingCallback.onTextEndEditing(tenpaySecureEditText.getEncryptDataWithHash(false, true));
        }
    }

    public boolean getFocus() {
        return this.cardNumberView.isFocused();
    }

    public String getHint() {
        return this.cardNumberView.getHint().toString();
    }

    public DynamicColor getHintColor() {
        return this.hintColor;
    }

    public int getInputTextLength() {
        return this.cardNumberView.getInputLength();
    }

    public DynamicColor getTextColor() {
        return this.normalColor;
    }

    public String getValue() {
        TenpaySecureEditText tenpaySecureEditText = this.cardNumberView;
        C79144b.m95773a().mo109091f();
        return tenpaySecureEditText.getEncryptDataWithHash(false, true);
    }

    public boolean isBankCardNumber() {
        return this.cardNumberView.isBankcardNum();
    }

    public void setFocus(boolean z) {
        if (z && this.cardNumberView.isFocused()) {
            this.cardNumberView.clearFocus();
        }
        if (z) {
            this.cardNumberView.requestFocus();
            return;
        }
        this.cardNumberView.clearFocus();
        callbackKindaTextEndEditing();
    }

    public void setHint(String str) {
        this.cardNumberView.setHint(str);
    }

    public void setHintColor(DynamicColor dynamicColor) {
        if (ColorUtil.getColorByModeNoCompat(this.hintColor) != ColorUtil.getColorByMode(dynamicColor)) {
            this.hintColor = dynamicColor;
        }
        this.cardNumberView.setHintTextColor((int) ColorUtil.getColorByModeNoCompat(this.hintColor));
    }

    public void setOnTextChangedCallback(KCardNumberEditViewOnTextChangedCallback kCardNumberEditViewOnTextChangedCallback) {
        this.m_callback = kCardNumberEditViewOnTextChangedCallback;
    }

    public void setOnTextEndEditingCallback(KCardNumberEditViewOnTextEndEditingCallback kCardNumberEditViewOnTextEndEditingCallback) {
        this.m_endEditingCallback = kCardNumberEditViewOnTextEndEditingCallback;
    }

    public void setText(String str) {
        this.cardNumberView.setText(str);
        TenpaySecureEditText tenpaySecureEditText = this.cardNumberView;
        tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().toString().length());
        this.cardNumberView.clearFocus();
    }

    public void setTextColor(DynamicColor dynamicColor) {
        if (ColorUtil.getColorByModeNoCompat(this.normalColor) != ColorUtil.getColorByMode(dynamicColor)) {
            this.normalColor = dynamicColor;
        }
        this.cardNumberView.setTextColor((int) ColorUtil.getColorByModeNoCompat(this.normalColor));
    }

    public TenpaySecureEditText createView(Context context) {
        TenpaySecureEditText tenpaySecureEditText = new TenpaySecureEditText(context);
        this.cardNumberView = tenpaySecureEditText;
        tenpaySecureEditText.setIsBankcardFormat(true);
        this.cardNumberView.setBackground((Drawable) null);
        this.cardNumberView.setInputType(131072);
        this.cardNumberView.setSingleLine(false);
        this.cardNumberView.setTextSize(0, MMKViewUtil.dpToPx(context, MMKViewUtil.getScaleSize(context) * 17.0f));
        this.cardNumberView.setPadding(0, 0, C74942w4.m89784a(context, 4), 0);
        this.cardNumberView.setCursorStyle((int) C0966R.C0969drawable.a8h);
        this.cardNumberView.setregExFilterInput("[^0-9]");
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.cardNumberView.setClearBtnDrawableId(C67448R.raw.kinda_actionbar_icon_light_clear, 0, 16, 16);
        } else {
            this.cardNumberView.setClearBtnDrawableId(C67448R.raw.kinda_actionbar_icon_dark_clear, 0, 16, 16);
        }
        TenpaySecureEditText.setSalt(C75228t.m90271t());
        this.cardNumberView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(24)});
        this.cardNumberView.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (KindaCardNumberEditViewImpl.this.m_callback != null) {
                    KCardNumberEditViewOnTextChangedCallback access$000 = KindaCardNumberEditViewImpl.this.m_callback;
                    TenpaySecureEditText access$100 = KindaCardNumberEditViewImpl.this.cardNumberView;
                    C79144b.m95773a().mo109091f();
                    access$000.onTextChanged(access$100.getEncryptDataWithHash(false, true));
                }
            }
        });
        if (context instanceof BaseFrActivity) {
            ((BaseFrActivity) context).setEditFocusListener(this.cardNumberView, 0, false);
        }
        this.cardNumberView.setId(C67448R.C67449id.fg_);
        this.cardNumberView.setKindaEditTextCallBackListener(new TenpaySecureEditText.IKindaEditTextCallBackListener() {
            public void onCallBackKinda() {
                KViewOnClickCallback onClickCallback = KindaCardNumberEditViewImpl.this.getOnClickCallback();
                if (onClickCallback != null) {
                    onClickCallback.onClick(KindaCardNumberEditViewImpl.this);
                }
            }
        });
        return this.cardNumberView;
    }
}
