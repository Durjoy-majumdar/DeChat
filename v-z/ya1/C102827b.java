package ya1;

import cd3.C39945b;
import com.tencent.p014mm.autogen.events.ExtNetSceneSendMsgEvent;
import com.tencent.p014mm.plugin.ext.key.AESUtil;
import com.tencent.p014mm.plugin.ext.provider.ExtControlProviderMsg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: ya1.b */
public class C102827b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72996z1 f303555d;

    /* renamed from: e */
    public final /* synthetic */ String[] f303556e;

    /* renamed from: f */
    public final /* synthetic */ C39945b f303557f;

    /* renamed from: g */
    public final /* synthetic */ ExtControlProviderMsg f303558g;

    /* renamed from: ya1.b$a */
    public class C102828a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ String f303559d;

        public C102828a(String str) {
            this.f303559d = str;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105919d("MicroMsg.ExtControlProviderMsg", "onSceneEnd errType=%s, errCode=%s", Integer.valueOf(i), Integer.valueOf(i2));
            if (yVar == null) {
                Log.m105920e("MicroMsg.ExtControlProviderMsg", "scene == null");
                C97625j3.m125815e().mo123470p(522, this);
                C102827b.this.f303558g.mo128176i(4);
                C102827b.this.f303557f.mo62559a();
                return;
            }
            if (yVar.getType() != 522) {
                C102827b.this.f303558g.mo128176i(0);
            } else if (i == 0 && i2 == 0) {
                Log.m105918d("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd ok, ");
                C102827b.this.f303558g.f269512o.addRow(new Object[]{this.f303559d, 1});
                C102827b.this.f303558g.mo128176i(0);
            } else {
                Log.m105920e("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd err, errType = " + i + ", errCode = " + i2);
                C102827b.this.f303558g.f269512o.addRow(new Object[]{this.f303559d, 2});
                C102827b.this.f303558g.mo128176i(4);
            }
            C102827b.this.f303557f.mo62559a();
            C97625j3.m125815e().mo123470p(522, this);
        }
    }

    public C102827b(ExtControlProviderMsg extControlProviderMsg, C72996z1 z1Var, String[] strArr, C39945b bVar) {
        this.f303558g = extControlProviderMsg;
        this.f303555d = z1Var;
        this.f303556e = strArr;
        this.f303557f = bVar;
    }

    public void run() {
        ExtNetSceneSendMsgEvent extNetSceneSendMsgEvent = new ExtNetSceneSendMsgEvent();
        extNetSceneSendMsgEvent.f264772d.f264774a = this.f303555d.getUsername();
        ExtNetSceneSendMsgEvent.C92498a aVar = extNetSceneSendMsgEvent.f264772d;
        aVar.f264775b = this.f303556e[1];
        aVar.f264776c = C45628s0.m50810y(this.f303555d.getUsername());
        extNetSceneSendMsgEvent.f264772d.getClass();
        if (!extNetSceneSendMsgEvent.publish()) {
            this.f303558g.mo128176i(4);
            this.f303557f.mo62559a();
            return;
        }
        ExtNetSceneSendMsgEvent.C92499b bVar = extNetSceneSendMsgEvent.f264773e;
        C117747y yVar = bVar.f264778b;
        try {
            C97625j3.m125815e().mo123455a(522, new C102828a(AESUtil.m105053b(bVar.f264777a)));
            C97625j3.m125815e().mo123460f(yVar);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ExtControlProviderMsg", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ExtControlProviderMsg", e, "", new Object[0]);
            this.f303558g.mo128176i(4);
            this.f303557f.mo62559a();
        }
    }
}
