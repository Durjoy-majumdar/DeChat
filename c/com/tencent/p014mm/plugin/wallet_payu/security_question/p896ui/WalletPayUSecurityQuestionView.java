package com.tencent.p014mm.plugin.wallet_payu.security_question.p896ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.CustomFitTextView;
import tb3.C77881d;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView */
public class WalletPayUSecurityQuestionView extends LinearLayout {

    /* renamed from: d */
    public TextView f211191d;

    /* renamed from: e */
    public CustomFitTextView f211192e;

    /* renamed from: f */
    public Context f211193f;

    /* renamed from: g */
    public String f211194g;

    public WalletPayUSecurityQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        boolean z;
        String str;
        this.f211193f = context;
        String str2 = "";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226907a, -1, 0);
            int resourceId = obtainStyledAttributes.getResourceId(13, 0);
            String string = resourceId != 0 ? this.f211193f.getString(resourceId) : str2;
            int resourceId2 = obtainStyledAttributes.getResourceId(8, 0);
            str2 = resourceId2 != 0 ? this.f211193f.getString(resourceId2) : str2;
            boolean z2 = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            str = str2;
            z = z2;
            str2 = string;
        } else {
            str = str2;
            z = false;
        }
        View inflate = LayoutInflater.from(this.f211193f).inflate(C0966R.C0971layout.bmm, this, true);
        this.f211191d = (TextView) inflate.findViewById(C0966R.C0970id.kms);
        this.f211192e = (CustomFitTextView) inflate.findViewById(C0966R.C0970id.i0q);
        this.f211191d.setText(str2);
        CustomFitTextView customFitTextView = this.f211192e;
        customFitTextView.mo104016d(str, customFitTextView.f220008h, customFitTextView.f220011n, customFitTextView.f220009i, customFitTextView.getResources().getColor(C0966R.color.f3563xt));
        if (!z) {
            this.f211192e.setEnabled(false);
            this.f211192e.setFocusable(false);
            this.f211192e.setClickable(false);
            this.f211192e.setBackgroundResource(C0966R.C0969drawable.ayq);
            setBackgroundResource(C0966R.C0969drawable.bcr);
            return;
        }
        this.f211192e.setEnabled(false);
        this.f211192e.setTextColor(getResources().getColor(C0966R.color.aj4));
        this.f211192e.setFocusable(false);
        this.f211192e.setClickable(false);
        this.f211192e.setBackgroundResource(C0966R.C0969drawable.ayq);
        setBackgroundResource(C0966R.C0969drawable.f4855pa);
    }

    public String getCurrentQuestion() {
        return this.f211194g;
    }

    public void setQuestionText(String str) {
        this.f211194g = str;
        KeyListener keyListener = this.f211192e.getKeyListener();
        this.f211192e.setInputType(1);
        this.f211192e.setKeyListener((KeyListener) null);
        setValStr(str);
        this.f211192e.setKeyListener(keyListener);
    }

    public void setValStr(String str) {
        CustomFitTextView customFitTextView = this.f211192e;
        customFitTextView.mo104016d(str, 3, false, -1, customFitTextView.getCurrentTextColor());
    }

    public WalletPayUSecurityQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
