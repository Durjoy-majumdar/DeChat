package p557hx;

import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import p542gx.C32565b;

/* renamed from: hx.e */
public class C33111e extends IStaticListener<ExptChangeEvent> {
    public boolean callback(IEvent iEvent) {
        ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
        Class cls = C32735h.class;
        if (C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.RubbishBin", "[sunny]: evt chg!!!");
            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_rubbishbin_enable, false)) {
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_rubbishbin_exec_time, 0);
                String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_rubbishbin_exec_tag, "Default");
                int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_rubbishbin_exec_time_interval, 1);
                Log.m105925i("MicroMsg.RubbishBin", "[sunny]ec:%d,t:%s,itv:%d", Integer.valueOf(Qe), Y60, Integer.valueOf(Qe2));
                ((C32565b) C86312j.m106911c(C32565b.class)).c50(MMApplicationContext.getContext(), Qe, Qe2 * 1000, Y60);
            }
        }
        return false;
    }
}
