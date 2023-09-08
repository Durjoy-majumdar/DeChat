package yn2;

import com.tencent.p014mm.autogen.events.GetSnsObjectDetailEvent;
import com.tencent.p014mm.autogen.events.ReturnSnsObjectDetailEvent;
import com.tencent.p014mm.plugin.sns.model.C43036f0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import vr2.C65874b0;

/* renamed from: yn2.b0 */
public class C102875b0 extends IStaticListener<GetSnsObjectDetailEvent> implements C11385n {

    /* renamed from: d */
    public int f303674d;

    /* renamed from: e */
    public SnsObject f303675e;

    /* renamed from: f */
    public SnsInfo f303676f;

    /* renamed from: g */
    public MTimerHandler f303677g;

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        GetSnsObjectDetailEvent getSnsObjectDetailEvent = (GetSnsObjectDetailEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        boolean z = true;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.GetSnsObjectDetailListener", "GetSnsObjectDetailEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        } else if (!(getSnsObjectDetailEvent instanceof GetSnsObjectDetailEvent)) {
            Log.m105922f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        } else {
            this.f303674d = getSnsObjectDetailEvent.f9304d.f9306a;
            this.f303676f = C94866e1.Yx0().mo139800LL(this.f303674d);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f303674d);
            objArr[1] = Boolean.valueOf(this.f303676f == null);
            Log.m105925i("MicroMsg.GetSnsObjectDetailListener", "LocalId:%s mSnsInfo is null?[%b]", objArr);
            SnsObject f = C94897n1.m120368f(this.f303676f);
            this.f303675e = f;
            C65874b0.C65875a aVar = C65874b0.f189421a;
            SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupIconBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z2 = aVar.mo89926e(f) || aVar.mo89924c(f);
            SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupIconBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (!z2 || this.f303676f.field_snsId != 0) {
                Log.m105924i("MicroMsg.GetSnsObjectDetailListener", "[callback] local SnsObject not enable group, try request SnsObjectDetial");
                if (this.f303676f == null) {
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                } else {
                    C43036f0 f0Var = new C43036f0(this.f303676f.field_snsId);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(210, this);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(f0Var);
                    MTimerHandler mTimerHandler = new MTimerHandler(new C16056a0(this), false);
                    this.f303677g = mTimerHandler;
                    mTimerHandler.startTimer(10000);
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                    return z;
                }
            } else {
                getSnsObjectDetailEvent.f9305e.f9307a = this.f303675e;
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                return z;
            }
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        return z;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        Log.m105925i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f303677g.stopTimer();
        ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent = new ReturnSnsObjectDetailEvent();
        if (i == 0 && i2 == 0 && (yVar instanceof C43036f0)) {
            returnSnsObjectDetailEvent.f9459d.f9460a = C94866e1.Rx0().mo130957p(((C43036f0) yVar).mo67229k1());
            returnSnsObjectDetailEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
            return;
        }
        returnSnsObjectDetailEvent.f9459d.f9460a = null;
        returnSnsObjectDetailEvent.publish();
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
    }
}
