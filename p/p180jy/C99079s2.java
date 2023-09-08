package p180jy;

import com.tencent.p014mm.autogen.events.TranslateMessageResultEvent;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: jy.s2 */
public class C99079s2 extends IStaticListener<TranslateMessageResultEvent> {
    public boolean callback(IEvent iEvent) {
        C94965w1.C94966a aVar;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        TranslateMessageResultEvent translateMessageResultEvent = (TranslateMessageResultEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        if (translateMessageResultEvent instanceof TranslateMessageResultEvent) {
            TranslateMessageResultEvent.C92608a aVar2 = translateMessageResultEvent.f265243d;
            String str = aVar2.f265247d;
            int i = aVar2.f265248e;
            HashMap<String, C94965w1.C94967b> hashMap = C94965w1.f275297a;
            SnsMethodCalculate.markStartTimeMs("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            Iterator<C94965w1.C94966a> it = C94965w1.f275298b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    SnsMethodCalculate.markEndTimeMs("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    break;
                }
                aVar = it.next();
                if (aVar.f275302d == i && !Util.isNullOrNil(str) && !Util.isNullOrNil(aVar.f275299a) && str.equals(aVar.f275299a)) {
                    SnsMethodCalculate.markEndTimeMs("getTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    break;
                }
            }
            if (aVar != null) {
                TranslateMessageResultEvent.C92608a aVar3 = translateMessageResultEvent.f265243d;
                String str2 = aVar3.f265246c;
                aVar.f275300b = str2;
                aVar.f275301c = aVar3.f265250g;
                int i2 = 1;
                Log.m105925i("MicroMsg.TranslateMessageResultEventListener", "finish translate, id:%s, type: %d, success: %b", aVar.f275299a, Integer.valueOf(i), Boolean.valueOf(!Util.isNullOrNil(str2)));
                if (i != 2) {
                    i2 = i != 3 ? -1 : 2;
                }
                if (i2 != -1) {
                    C94965w1.m120627h(str, i2, aVar.f275300b, aVar.f275301c);
                    C94965w1.f275298b.remove(aVar);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.TranslateMessageResultEventListener");
        return false;
    }
}
