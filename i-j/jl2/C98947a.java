package jl2;

import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.plugin.scanner.model.C115671l1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;

/* renamed from: jl2.a */
public class C98947a extends IStaticListener<CancelScanTranslationEvent> {
    public boolean callback(IEvent iEvent) {
        CancelScanTranslationEvent cancelScanTranslationEvent = (CancelScanTranslationEvent) iEvent;
        Class cls = C115674p.class;
        HashMap<Integer, C115671l1> hashMap = ((C115674p) C86312j.m106911c(cls)).f347031n;
        HashMap<Integer, OCRTranslateReportStruct> hashMap2 = ((C115674p) C86312j.m106911c(cls)).f347032o;
        HashMap<Integer, Long> hashMap3 = ((C115674p) C86312j.m106911c(cls)).f347033p;
        CancelScanTranslationEvent.C92467a aVar = cancelScanTranslationEvent.f264645d;
        if (aVar.f264646a != 1 || !hashMap.containsKey(Integer.valueOf(aVar.f264647b))) {
            return false;
        }
        Log.m105925i("CancelTranslationListener", "cancel translate sessionId %d", Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b));
        hashMap.remove(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b));
        if (hashMap2.containsKey(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b)) && hashMap3.containsKey(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b))) {
            hashMap2.get(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b)).f343790f = 2;
            hashMap2.get(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b)).f343793i = System.currentTimeMillis() - hashMap3.get(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b)).longValue();
            hashMap2.get(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b)).mo86054n();
            hashMap2.remove(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b));
            hashMap3.remove(Integer.valueOf(cancelScanTranslationEvent.f264645d.f264647b));
            Log.m105925i("CancelTranslationListener", "translationReports size %d, translationUpload size %d", Integer.valueOf(hashMap2.size()), Integer.valueOf(hashMap3.size()));
        }
        return true;
    }
}
