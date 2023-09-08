package p742wr;

import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;

/* renamed from: wr.d */
public class C38283d extends IStaticListener<CoreAccountInitializationNotifiedEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls = PluginFTS.class;
        if (!(((CoreAccountInitializationNotifiedEvent) iEvent) instanceof CoreAccountInitializationNotifiedEvent)) {
            return false;
        }
        ((PluginFTS) C86312j.m106911c(cls)).f270761g = true;
        Log.m105924i("MicroMsg.FTS.PluginFTS", "All account post reset");
        ((PluginFTS) C86312j.m106911c(cls)).Cx0();
        return false;
    }
}
