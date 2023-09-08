package o12;

import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import t12.C13818a;

/* renamed from: o12.h */
public class C11325h extends IStaticListener<CheckLanguageChangeEvent> {
    public boolean callback(IEvent iEvent) {
        CheckLanguageChangeEvent checkLanguageChangeEvent = (CheckLanguageChangeEvent) iEvent;
        Log.m105918d("UpdateLanguageEventListener", "change language");
        C13818a.m13116l();
        return false;
    }
}
