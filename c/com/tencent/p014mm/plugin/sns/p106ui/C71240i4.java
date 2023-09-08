package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.KeyEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.i4 */
public class C71240i4 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ SnsCommentFooter f206183a;

    public C71240i4(SnsCommentFooter snsCommentFooter) {
        this.f206183a = snsCommentFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
        SnsMethodCalculate.markStartTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        SnsMethodCalculate.markEndTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        try {
            SnsCommentFooter.m122046g(this.f206183a).mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsCommentFooter", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    /* renamed from: c */
    public void mo64628c() {
        SnsMethodCalculate.markStartTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        if (SnsCommentFooter.m122046g(this.f206183a) != null) {
            if (SnsCommentFooter.m122046g(this.f206183a).getInputConnection() == null) {
                SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
                return;
            } else {
                SnsCommentFooter.m122046g(this.f206183a).getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
                SnsCommentFooter.m122046g(this.f206183a).getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
            }
        }
        SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
        this.f206183a.setToSendTextColor(z);
        SnsMethodCalculate.markEndTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$9");
    }
}
