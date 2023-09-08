package yn2;

import com.tencent.p014mm.autogen.events.ReturnSnsObjectDetailEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: yn2.a0 */
public class C16056a0 implements MTimerHandler.CallBack {
    public C16056a0(C102875b0 b0Var) {
    }

    public boolean onTimerExpired() {
        SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener$1");
        Log.m105924i("MicroMsg.GetSnsObjectDetailListener", "[onTimerExpired] ReturnSnsObjectDetailEvent but SnsObject null");
        ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent = new ReturnSnsObjectDetailEvent();
        returnSnsObjectDetailEvent.f9459d.f9460a = null;
        returnSnsObjectDetailEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener$1");
        return false;
    }
}
