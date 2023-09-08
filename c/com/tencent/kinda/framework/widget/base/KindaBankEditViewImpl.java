package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.FontStyle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KBankEditView;
import com.tencent.kinda.gen.KBankEditViewOnSeletBankCallback;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BankEditSelectedEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import yq3.C79145c;

public class KindaBankEditViewImpl extends MMKView<EditText> implements KBankEditView {
    public String TAG = "KindaBank.KindaBankEditViewImpl";
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public IListener<BankEditSelectedEvent> bankEditSelectedEventIListener = new IListener<BankEditSelectedEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1230036023;
        }

        public boolean callback(BankEditSelectedEvent bankEditSelectedEvent) {
            String str;
            if (KindaWrapBankEditActivity.FLAG_ACTIVITY_CLOSE.equals(bankEditSelectedEvent.f193483d.f193484a)) {
                KindaBankEditViewImpl.this.bankEditSelectedEventIListener.dead();
                return false;
            } else if (KindaWrapBankEditActivity.FLAG_ACTIVITY_BACK.equals(bankEditSelectedEvent.f193483d.f193484a)) {
                KindaBankEditViewImpl.this.mCallBack.onSeletBank("", "");
                return false;
            } else {
                if (!Util.isNullOrNil(KindaBankEditViewImpl.this.mBankTypeLiskBuffer)) {
                    str = bankEditSelectedEvent.f193483d.f193484a + " " + bankEditSelectedEvent.f193483d.f193486c;
                } else {
                    str = bankEditSelectedEvent.f193483d.f193484a;
                }
                KindaBankEditViewImpl.this.mEditText.setText(str);
                if (KindaBankEditViewImpl.this.mCallBack == null) {
                    return false;
                }
                String unused = KindaBankEditViewImpl.this.mBankType = bankEditSelectedEvent.f193483d.f193485b;
                KindaBankEditViewImpl.this.mCallBack.onSeletBank(str, KindaBankEditViewImpl.this.mBankType);
                return false;
            }
        }
    };
    private FontStyle fontStyle = FontStyle.REGULAR;
    private byte[] mBankLiskBuffer;
    /* access modifiers changed from: private */
    public String mBankType;
    /* access modifiers changed from: private */
    public byte[] mBankTypeLiskBuffer;
    /* access modifiers changed from: private */
    public KBankEditViewOnSeletBankCallback mCallBack;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mEditText;
    private byte[] mMajorBankLiskBuffer;
    private DynamicColor normalColor = new DynamicColor(-1, 0);

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public FontStyle getFontStyle() {
        return this.fontStyle;
    }

    public String getSelectedBankType() {
        return this.mBankType;
    }

    public DynamicColor getTextColor() {
        return this.normalColor;
    }

    public float getTextSize() {
        return this.mEditText.getTextSize();
    }

    public void openBankSelectView() {
        setFocus(true);
    }

    public void setData(ITransmitKvData iTransmitKvData) {
        this.mBankLiskBuffer = iTransmitKvData.getBinary("bank_list");
        this.mBankTypeLiskBuffer = iTransmitKvData.getBinary("bank_type_list");
        this.mMajorBankLiskBuffer = iTransmitKvData.getBinary("major_bank_list");
    }

    public void setFocus(boolean z) {
        if (z) {
            this.bankEditSelectedEventIListener.alive();
            Context context = this.mContext;
            if (context instanceof BaseFrActivity) {
                ((BaseFrActivity) context).hideTenpayKB();
            }
            Intent intent = new Intent(this.mContext, KindaWrapBankEditActivity.class);
            intent.putExtra("bank_list", this.mBankLiskBuffer);
            intent.putExtra("bank_type_list", this.mBankTypeLiskBuffer);
            intent.putExtra("major_bank_list", this.mMajorBankLiskBuffer);
            Context context2 = this.mContext;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/KindaBankEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/kinda/framework/widget/base/KindaBankEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void setFontStyle(FontStyle fontStyle2) {
        this.fontStyle = fontStyle2;
        if (fontStyle2 == FontStyle.BOLD) {
            this.mEditText.setTypeface((Typeface) null, 1);
        } else {
            this.mEditText.setTypeface((Typeface) null, 0);
        }
    }

    public void setOnSeletBankCallback(KBankEditViewOnSeletBankCallback kBankEditViewOnSeletBankCallback) {
        this.mCallBack = kBankEditViewOnSeletBankCallback;
    }

    public void setSelected(String str) {
        this.mEditText.setText(str);
    }

    public void setTextColor(DynamicColor dynamicColor) {
        if (ColorUtil.getColorByModeNoCompat(this.normalColor) != ColorUtil.getColorByMode(dynamicColor)) {
            this.normalColor = dynamicColor;
        }
        this.mEditText.setTextColor((int) ColorUtil.getColorByModeNoCompat(this.normalColor));
    }

    public void setTextSize(float f) {
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(MMApplicationContext.getContext(), f * MMKViewUtil.getScaleSize(MMApplicationContext.getContext())));
    }

    public EditText createView(Context context) {
        EditText editText = new EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setHint(C0966R.string.l3i);
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(context, MMKViewUtil.getScaleSize(context) * 17.0f));
        EditText editText2 = this.mEditText;
        editText2.setPadding(0, editText2.getHeight() / 2, 0, this.mEditText.getHeight() / 2);
        this.mEditText.setGravity(16);
        this.mEditText.setInputType(131072);
        this.mEditText.setSingleLine(false);
        C79145c cVar = new C79145c();
        cVar.setViewType(TraitsType.BUTTON);
        this.mEditText.setAccessibilityDelegate(cVar);
        if (ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            this.mEditText.setHintTextColor(context.getResources().getColor(C0966R.color.f3563xt));
            this.mEditText.setTextColor(context.getResources().getColor(C0966R.color.a7f));
        }
        this.mContext = context;
        String str = this.TAG;
        Log.m105924i(str, "BankEditSelected callback，注册监听，当前线程：" + Thread.currentThread().getId());
        return this.mEditText;
    }
}
