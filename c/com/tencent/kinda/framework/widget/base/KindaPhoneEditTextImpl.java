package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.kinda.gen.ClearButtonMode;
import com.tencent.kinda.gen.KPhoneEditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr3.C76042f;
import nj3.C76879j;

public class KindaPhoneEditTextImpl extends MMKEditText implements KPhoneEditText {
    private ClearButtonMode clearButtonMode = ClearButtonMode.WHILEEDITING;

    public ClearButtonMode getClearButtonMode() {
        return this.clearButtonMode;
    }

    public boolean getFocus() {
        return this.editText.isFocused();
    }

    public String getText() {
        Log.m105918d(MMKView.TAG, "KindaPhoneEditTextImpl getText ");
        Editable text = this.editText.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public void setFocus(boolean z) {
        if (z) {
            this.editText.requestFocus();
        } else {
            this.editText.clearFocus();
        }
    }

    public void setText(String str) {
        Log.m105918d(MMKView.TAG, "KindaPhoneEditTextImpl setText " + str);
        if (str != null && !getText().equals(str)) {
            this.editText.setText(str);
            if (str.contains("+")) {
                this.editText.setSelection(str.length());
            }
        }
    }

    public void showTip(String str, String str2) {
        BaseFrActivity baseFrActivity = this.mBaseFrActivity;
        String string = baseFrActivity.getResources().getString(C0966R.string.kpr);
        String string2 = baseFrActivity.getResources().getString(C0966R.string.ktq);
        C76042f fVar = new C76042f();
        View inflate = ((LayoutInflater) baseFrActivity.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f360061cg0, (ViewGroup) null);
        if (str2 != null && !str2.isEmpty()) {
            ((TextView) inflate.findViewById(C0966R.C0970id.knp)).setText(str2);
        }
        baseFrActivity.addDialog(C76879j.m92752w(baseFrActivity, string, string2, inflate, fVar));
    }

    public LinearLayout createView(Context context) {
        LinearLayout createView = super.createView(context);
        if (context instanceof BaseFrActivity) {
            setMaxLength(11);
            ((BaseFrActivity) context).setEditFocusListener(this.editText, 0, false);
        }
        ViewGroup.LayoutParams layoutParams = this.editText.getLayoutParams();
        layoutParams.height = -2;
        this.editText.setLayoutParams(layoutParams);
        return createView;
    }
}
