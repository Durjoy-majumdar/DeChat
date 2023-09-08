package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: eb0.l */
public class C31487l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f84214d;

    public C31487l(C31489m mVar, C72963f4 f4Var) {
        this.f84214d = f4Var;
    }

    public void run() {
        Log.m105925i("MicroMsg.BizChatSysCmdMsgConsumerHandleRevokeMsg", "[deleteLocalFile] id:%s type:%s", Long.valueOf(this.f84214d.getMsgId()), Integer.valueOf(this.f84214d.getType()));
        int type = this.f84214d.getType();
        if (type == 3 || type == 34 || type == 49 || type == 62 || type == 268435505 || type == 43 || type == 44) {
            C75604z3.m90833e(this.f84214d, true);
        }
    }
}
