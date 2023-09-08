package gv2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: gv2.b */
public class C76070b implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AbsSnsUploadSayFooter f222929d;

    public C76070b(AbsSnsUploadSayFooter absSnsUploadSayFooter) {
        this.f222929d = absSnsUploadSayFooter;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f222929d;
        int i = AbsSnsUploadSayFooter.f206204t;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        absSnsUploadSayFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        if (absSnsUploadSayFooter.f206206g.getVisibility() == 8) {
            Log.m105924i("MicroMsg.SnsUpload.AbsSayFooter", "toggleSmileyPanel: showSmileyPanel");
            absSnsUploadSayFooter.mo97986h();
            absSnsUploadSayFooter.f206205f.hideVKB();
            absSnsUploadSayFooter.f206207h.mo104256m();
            absSnsUploadSayFooter.f206208i.setImageResource(absSnsUploadSayFooter.f206215s);
            absSnsUploadSayFooter.f206208i.setContentDescription(absSnsUploadSayFooter.f206205f.getString(C0966R.string.mii));
        } else {
            Log.m105924i("MicroMsg.SnsUpload.AbsSayFooter", "toggleSmileyPanel: hideSmileyPanel");
            absSnsUploadSayFooter.f206207h.mo104256m();
            absSnsUploadSayFooter.f206205f.showVKB();
            SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            absSnsUploadSayFooter.f206212p = false;
            absSnsUploadSayFooter.f206206g.mo100196h();
            absSnsUploadSayFooter.getInputPanelHelper().f220486m = new a$$a(absSnsUploadSayFooter);
            SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            absSnsUploadSayFooter.f206208i.setImageResource(absSnsUploadSayFooter.f206214r);
            absSnsUploadSayFooter.f206208i.setContentDescription(absSnsUploadSayFooter.f206205f.getString(C0966R.string.mig));
        }
        SnsMethodCalculate.markEndTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        return null;
    }
}
