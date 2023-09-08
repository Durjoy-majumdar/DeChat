package yr2;

import com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102236a0;

/* renamed from: yr2.b */
public class C102904b implements C94853e.C94862i {
    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
        Log.m105925i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "[%s][media:%s]onImageFinish isOk=%s", "[image-flow]", str, Boolean.valueOf(z));
        SnsImageDownloadedEvent snsImageDownloadedEvent = new SnsImageDownloadedEvent();
        SnsImageDownloadedEvent.C1139a aVar = snsImageDownloadedEvent.f9515d;
        aVar.f9516a = 5;
        aVar.f9518c = str;
        String e = C94938q1.m120518e(C94866e1.m120262YO(), str);
        SnsImageDownloadedEvent.C1139a aVar2 = snsImageDownloadedEvent.f9515d;
        aVar2.f9519d = e + C102236a0.m134718M(str);
        snsImageDownloadedEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
        Log.m105925i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "[%s][media:%s]onThumbFinish ", "[image-flow]", str);
        SnsImageDownloadedEvent snsImageDownloadedEvent = new SnsImageDownloadedEvent();
        SnsImageDownloadedEvent.C1139a aVar = snsImageDownloadedEvent.f9515d;
        aVar.f9516a = 2;
        aVar.f9518c = str;
        String e = C94938q1.m120518e(C94866e1.m120262YO(), str);
        SnsImageDownloadedEvent.C1139a aVar2 = snsImageDownloadedEvent.f9515d;
        aVar2.f9519d = e + C102236a0.m134730Y(str);
        snsImageDownloadedEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogic");
    }
}
