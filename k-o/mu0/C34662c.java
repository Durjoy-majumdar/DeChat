package mu0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: mu0.c */
public class C34662c extends C86301e {
    public void onAccountInitialized(Context context) {
        Class cls = C32735h.class;
        super.onAccountInitialized(context);
        long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_playsound_rate_control_time, -1);
        long He2 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_playsound_evict_rate_control_time, -1);
        PlaySoundNew.INSTANCE.setRateControlParam(((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_playsound_rate_control_enable, true), He, He2);
    }
}
