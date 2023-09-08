package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;

/* renamed from: eb0.h */
public class C31469h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f84191d;

    public C31469h(C75579g gVar, C72963f4 f4Var) {
        this.f84191d = f4Var;
    }

    public void run() {
        int ih = ((C31478i2) C86312j.m106911c(C31478i2.class)).mo58194ih(this.f84191d.getType());
        Log.m105925i("MicroMsg.BigBallSysCmdMsgConsumer", "[deleteLocalFile] id:%s type:%s serverType:%s", Long.valueOf(this.f84191d.getMsgId()), Integer.valueOf(this.f84191d.getType()), Integer.valueOf(ih));
        if (ih == 3 || ih == 34 || ih == 49 || ih == 62 || ih == 268435505 || ih == 43 || ih == 44) {
            C75604z3.m90833e(this.f84191d, true);
        }
    }
}
