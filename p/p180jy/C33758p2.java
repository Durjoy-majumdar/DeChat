package p180jy;

import com.tencent.p014mm.autogen.events.StatusNotifyFunctionEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94886k0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import os2.C100421x;

/* renamed from: jy.p2 */
public class C33758p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StatusNotifyFunctionEvent f91294d;

    public C33758p2(C33762q2 q2Var, StatusNotifyFunctionEvent statusNotifyFunctionEvent) {
        this.f91294d = statusNotifyFunctionEvent;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener$1");
        int i = (int) this.f91294d.f79014d.f79017c;
        C100421x Tx0 = C94866e1.Tx0();
        Tx0.getClass();
        SnsMethodCalculate.markStartTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        String str = " update SnsComment set isRead = 1 where isRead = 0 and  createTime <= " + i;
        Log.m105924i("MicroMsg.SnsCommentStorage", "updateToread " + str);
        boolean execSQL = Tx0.f294191d.execSQL("SnsComment", str);
        SnsMethodCalculate.markEndTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Log.m105924i("MicroMsg.StatusNotifyFunctionListener", "update msg read " + execSQL);
        C94886k0.m120341j1();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.StatusNotifyFunctionListener$1");
    }
}
