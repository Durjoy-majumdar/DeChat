package yn2;

import com.tencent.p014mm.autogen.events.GetSnsTimeLineObjectEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: yn2.f0 */
public class C102878f0 extends IStaticListener<GetSnsTimeLineObjectEvent> {

    /* renamed from: d */
    public String f303678d;

    /* renamed from: e */
    public SnsInfo f303679e;

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        GetSnsTimeLineObjectEvent getSnsTimeLineObjectEvent = (GetSnsTimeLineObjectEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        boolean z = true;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.GetSnsObjectDetailListener", "GetSnsTimeLineObjectEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        } else if (!(getSnsTimeLineObjectEvent instanceof GetSnsTimeLineObjectEvent)) {
            Log.m105922f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        } else {
            this.f303678d = getSnsTimeLineObjectEvent.f264897d.f264899a;
            SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f303678d);
            this.f303679e = DN;
            Object[] objArr = new Object[2];
            objArr[0] = this.f303678d;
            objArr[1] = Boolean.valueOf(DN == null);
            Log.m105925i("MicroMsg.GetSnsObjectDetailListener", "mLoaclId:%s mSnsInfo is null?[%b]", objArr);
            SnsInfo snsInfo = this.f303679e;
            if (snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
            } else {
                TimeLineObject timeLine = snsInfo.getTimeLine();
                if (timeLine != null) {
                    getSnsTimeLineObjectEvent.f264898e.f264900a = timeLine;
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
                    return z;
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
            }
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        return z;
    }
}
