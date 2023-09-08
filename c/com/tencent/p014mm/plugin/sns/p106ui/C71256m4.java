package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr2.C76634a;

/* renamed from: com.tencent.mm.plugin.sns.ui.m4 */
public class C71256m4 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ SnsCustomEditText f206201d;

    public C71256m4(SnsCustomEditText snsCustomEditText) {
        this.f206201d = snsCustomEditText;
    }

    public void afterTextChanged(Editable editable) {
        SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText$1");
        SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText$1");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText$1");
        if (charSequence != null) {
            SnsCustomEditText snsCustomEditText = this.f206201d;
            int length = charSequence.length();
            int i4 = SnsCustomEditText.f206131q2;
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
            snsCustomEditText.f206135p2 = length;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        }
        SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText$1");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText$1");
        try {
            SnsCustomEditText snsCustomEditText = this.f206201d;
            int i4 = SnsCustomEditText.f206131q2;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
            boolean z = snsCustomEditText.f206134o2;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
            if (z) {
                if (charSequence != null) {
                    if (charSequence.length() >= C76634a.f224255a) {
                        int length = charSequence.length();
                        SnsCustomEditText snsCustomEditText2 = this.f206201d;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                        int i5 = snsCustomEditText2.f206135p2;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                        if (length - i5 > C76634a.f224255a) {
                            SnsCustomEditText snsCustomEditText3 = this.f206201d;
                            int length2 = charSequence.length();
                            SnsCustomEditText snsCustomEditText4 = this.f206201d;
                            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                            int i6 = snsCustomEditText4.f206135p2;
                            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                            snsCustomEditText3.f206133n2 = length2 - i6;
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                        }
                    }
                }
                SnsCustomEditText snsCustomEditText5 = this.f206201d;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
                snsCustomEditText5.f206133n2 = 0;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsEditText", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText$1");
    }
}
