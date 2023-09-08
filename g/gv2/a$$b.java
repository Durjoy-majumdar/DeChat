package gv2;

import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;

public final /* synthetic */ class a$$b implements C74965a.C74968c {

    /* renamed from: a */
    public final /* synthetic */ AbsSnsUploadSayFooter f222928a;

    public /* synthetic */ a$$b(AbsSnsUploadSayFooter absSnsUploadSayFooter) {
        this.f222928a = absSnsUploadSayFooter;
    }

    /* renamed from: a */
    public final void mo104367a(boolean z) {
        AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f222928a;
        int i = AbsSnsUploadSayFooter.f206204t;
        absSnsUploadSayFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$showSmileyPanel$1", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (!z) {
            absSnsUploadSayFooter.f206206g.setVisibility(0);
        }
        absSnsUploadSayFooter.getInputPanelHelper().f220486m = null;
        SnsMethodCalculate.markEndTimeMs("lambda$showSmileyPanel$1", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
    }
}
