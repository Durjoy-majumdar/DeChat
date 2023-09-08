package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.KeyEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.z5 */
public class C71264z5 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ SnsSightUploadSayFooter f206228a;

    public C71264z5(SnsSightUploadSayFooter snsSightUploadSayFooter) {
        this.f206228a = snsSightUploadSayFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
        SnsMethodCalculate.markStartTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        SnsMethodCalculate.markEndTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        try {
            SnsSightUploadSayFooter.m83657e(this.f206228a).mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsSightUploadSayFooter", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }

    /* renamed from: c */
    public void mo64628c() {
        SnsMethodCalculate.markStartTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        SnsSightUploadSayFooter.m83657e(this.f206228a).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
        SnsSightUploadSayFooter.m83657e(this.f206228a).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
        SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
        SnsMethodCalculate.markEndTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$5");
    }
}
