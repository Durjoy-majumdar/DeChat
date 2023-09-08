package p621nn;

import com.tencent.p014mm.autogen.events.MsgSynchronizeStartEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import y72.C102823h;

/* renamed from: nn.g0 */
public class C34908g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgSynchronizeStartEvent f93742d;

    public C34908g0(C34910h0 h0Var, MsgSynchronizeStartEvent msgSynchronizeStartEvent) {
        this.f93742d = msgSynchronizeStartEvent;
    }

    public void run() {
        MsgSynchronizeStartEvent msgSynchronizeStartEvent = this.f93742d;
        Log.m105925i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent run userCloseMsgSync[%b]", Boolean.valueOf(msgSynchronizeStartEvent.f9331d.f9334c));
        MsgSynchronizeStartEvent.C1093a aVar = msgSynchronizeStartEvent.f9331d;
        if (aVar.f9334c) {
            C115669n.INSTANCE.idkeyStat(466, 13, 1, false);
            return;
        }
        byte[] bArr = aVar.f9332a;
        if (bArr == null) {
            Log.m105920e("MicroMsg.BackupCore", "msgsynchronize loginconfirmok key is null!");
            C115669n.INSTANCE.idkeyStat(466, 14, 1, false);
            return;
        }
        int i = aVar.f9333b;
        C102823h hVar = C102823h.f303546f;
        if (hVar == null) {
            C102823h.f303546f = new C102823h();
        } else {
            hVar.mo142551a();
            C102823h.f303546f = new C102823h();
        }
        C102823h hVar2 = C102823h.f303546f;
        String str = msgSynchronizeStartEvent.f9331d.f9335d;
        hVar2.f303548b = i;
        hVar2.mo142554d("afterLogin", "", bArr, str);
    }
}
