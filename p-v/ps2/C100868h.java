package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ps2.C100871j;

/* renamed from: ps2.h */
public class C100868h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C100869i f295402d;

    public C100868h(C100869i iVar) {
        this.f295402d = iVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$2");
        ((C100871j.C100879e) C100869i.m132168a(this.f295402d)).mo140347a();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$2");
    }
}
