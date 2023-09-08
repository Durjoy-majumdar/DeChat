package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.cedit.api.MMCustomEditText;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCustomEditText */
public class SnsCustomEditText extends MMCustomEditText {

    /* renamed from: q2 */
    public static final /* synthetic */ int f206131q2 = 0;

    /* renamed from: m2 */
    public Context f206132m2;

    /* renamed from: n2 */
    public int f206133n2 = 0;

    /* renamed from: o2 */
    public boolean f206134o2 = false;

    /* renamed from: p2 */
    public int f206135p2 = 0;

    public SnsCustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206132m2 = context;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        addTextChangedListener(new C71256m4(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
    }

    /* renamed from: b0 */
    public boolean mo97951b0(int i) {
        SnsMethodCalculate.markStartTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        if (i == 16908322) {
            this.f206134o2 = true;
        }
        boolean b0 = super.mo97951b0(i);
        SnsMethodCalculate.markEndTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        return b0;
    }

    public int getPasterLen() {
        SnsMethodCalculate.markStartTimeMs("getPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        int i = this.f206133n2;
        SnsMethodCalculate.markEndTimeMs("getPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        return i;
    }

    public void setPasterLen(int i) {
        SnsMethodCalculate.markStartTimeMs("setPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
        this.f206133n2 = i;
        SnsMethodCalculate.markEndTimeMs("setPasterLen", "com.tencent.mm.plugin.sns.ui.SnsCustomEditText");
    }
}
