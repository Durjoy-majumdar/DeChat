package bf3;

import a70.C79471a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p064hp.net.C85235a;
import com.tencent.p014mm.plugin.p064hp.net.SimpleHttpLogic;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.IOException;
import te3.C90432q93;
import te3.C90435r93;
import te3.C90441u93;

/* renamed from: bf3.a */
public class C79697a {

    /* renamed from: a */
    public SimpleHttpLogic.Request f233602a;

    /* renamed from: b */
    public SimpleHttpLogic.TaskCallback f233603b = new C79699b();

    /* renamed from: c */
    public C85235a.C85238c f233604c;

    /* renamed from: bf3.a$a */
    public class C79698a implements C85235a.C85238c {
        public C79698a(C79697a aVar) {
        }

        /* renamed from: a */
        public void mo109572a(int i, TinkerSyncResponse tinkerSyncResponse) {
            Log.m105919d("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "error%d response:%s", Integer.valueOf(i), tinkerSyncResponse.toString());
        }
    }

    /* renamed from: bf3.a$b */
    public class C79699b implements SimpleHttpLogic.TaskCallback {
        public C79699b() {
        }

        public void onCompleted(int i, int i2, byte[] bArr) {
            Log.m105925i("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "onCompleted errorType:%d errorCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 200) {
                try {
                    PByteArray pByteArray = new PByteArray();
                    boolean unpackResponse = SimpleHttpLogic.unpackResponse(bArr, pByteArray);
                    Log.m105920e("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "unpack result " + unpackResponse);
                    C90435r93 r932 = new C90435r93();
                    r932.parseFrom(pByteArray.value);
                    C90441u93 u932 = r932.f259789d;
                    if (u932 != null) {
                        C79697a.this.f233604c.mo109572a(0, new TinkerSyncResponse(u932));
                        return;
                    }
                    Log.m105921e("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "empty node. code:%d", Integer.valueOf(r932.f259794i));
                    C79697a.this.f233604c.mo109572a(-5, (TinkerSyncResponse) null);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", e, "debugMMTLSCheck", new Object[0]);
                    C79697a.this.f233604c.mo109572a(-2, (TinkerSyncResponse) null);
                }
            } else {
                C79697a.this.f233604c.mo109572a(-1, (TinkerSyncResponse) null);
            }
        }
    }

    public C79697a(C90432q93 q932) {
        C79698a aVar = new C79698a(this);
        this.f233604c = aVar;
        if (q932 == null) {
            String str = C79471a.f233023k;
            Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "baseTinkerId = " + str);
            C90432q93 q933 = new C90432q93();
            q933.f259754d = str;
            q933.f259755e = C79471a.m96436a();
            q933.f259756f = C79700b.m96818b();
            q933.f259761n = 1;
            q932 = q933;
        }
        try {
            SimpleHttpLogic.Request request = new SimpleHttpLogic.Request();
            this.f233602a = request;
            request.cgi = "/cgi-bin/micromsg-bin/mmtlsprconfig";
            request.host = MMApplicationContext.getResources().getString(C0966R.string.fmf);
            PByteArray pByteArray = new PByteArray();
            boolean packRequest = SimpleHttpLogic.packRequest(q932.toByteArray(), pByteArray);
            Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "pack result " + packRequest);
            this.f233602a.body = pByteArray.value;
        } catch (IOException e) {
            this.f233602a = null;
            Log.printErrStackTrace("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", e, "mmtls request create failed.", new Object[0]);
        }
        Log.m105925i("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "prconfig %s", "baseId  :" + q932.f259754d + "\n" + "patchId :" + q932.f259755e + "\n");
    }
}
