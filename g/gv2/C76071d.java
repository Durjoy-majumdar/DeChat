package gv2;

import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: gv2.d */
public class C76071d implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ AbsSnsUploadSayFooter f222930a;

    public C76071d(AbsSnsUploadSayFooter absSnsUploadSayFooter) {
        this.f222930a = absSnsUploadSayFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
        SnsMethodCalculate.markStartTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        SnsMethodCalculate.markEndTimeMs("performSend", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        try {
            AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f222930a;
            int i = AbsSnsUploadSayFooter.f206204t;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            C74974a aVar = absSnsUploadSayFooter.f206207h;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            aVar.mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsUpload.AbsSayFooter", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }

    /* renamed from: c */
    public void mo64628c() {
        SnsMethodCalculate.markStartTimeMs("del", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f222930a;
        int i = AbsSnsUploadSayFooter.f206204t;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        C74974a aVar = absSnsUploadSayFooter.f206207h;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        aVar.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
        AbsSnsUploadSayFooter absSnsUploadSayFooter2 = this.f222930a;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        C74974a aVar2 = absSnsUploadSayFooter2.f206207h;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        aVar2.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
        SnsMethodCalculate.markEndTimeMs("del", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
        SnsMethodCalculate.markEndTimeMs("onToSendTextEnable", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$4");
    }
}
