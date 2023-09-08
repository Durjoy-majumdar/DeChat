package com.tencent.p014mm.plugin.p064hp.net;

import a70.C79471a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p064hp.net.SimpleHttpLogic;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.IOException;
import te3.C90432q93;
import te3.C90435r93;
import te3.C90441u93;
import y02.C91363f;

/* renamed from: com.tencent.mm.plugin.hp.net.a */
public class C85235a {

    /* renamed from: a */
    public SimpleHttpLogic.Request f248327a;

    /* renamed from: b */
    public SimpleHttpLogic.TaskCallback f248328b = new C85237b();

    /* renamed from: c */
    public C85238c f248329c;

    /* renamed from: com.tencent.mm.plugin.hp.net.a$a */
    public class C85236a implements C85238c {
        public C85236a(C85235a aVar) {
        }

        /* renamed from: a */
        public void mo109572a(int i, TinkerSyncResponse tinkerSyncResponse) {
            Log.m105919d("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "error%d response:%s", Integer.valueOf(i), tinkerSyncResponse.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.hp.net.a$b */
    public class C85237b implements SimpleHttpLogic.TaskCallback {
        public C85237b() {
        }

        public void onCompleted(int i, int i2, byte[] bArr) {
            Log.m105925i("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "onCompleted errorType:%d errorCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 200) {
                try {
                    PByteArray pByteArray = new PByteArray();
                    boolean unpackResponse = SimpleHttpLogic.unpackResponse(bArr, pByteArray);
                    Log.m105920e("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "unpack result " + unpackResponse);
                    C90435r93 r932 = new C90435r93();
                    r932.parseFrom(pByteArray.value);
                    C90441u93 u932 = r932.f259789d;
                    if (u932 != null) {
                        C85235a.this.f248329c.mo109572a(0, new TinkerSyncResponse(u932));
                        return;
                    }
                    Log.m105921e("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "empty node. code:%d", Integer.valueOf(r932.f259794i));
                    C85235a.this.f248329c.mo109572a(-5, (TinkerSyncResponse) null);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", e, "debugMMTLSCheck", new Object[0]);
                    C85235a.this.f248329c.mo109572a(-2, (TinkerSyncResponse) null);
                }
            } else {
                C85235a.this.f248329c.mo109572a(-1, (TinkerSyncResponse) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.hp.net.a$c */
    public interface C85238c {
        /* renamed from: a */
        void mo109572a(int i, TinkerSyncResponse tinkerSyncResponse);
    }

    public C85235a(C90432q93 q932) {
        C85236a aVar = new C85236a(this);
        this.f248329c = aVar;
        if (q932 == null) {
            String str = C79471a.f233023k;
            Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "baseTinkerId = " + str);
            C90432q93 q933 = new C90432q93();
            q933.f259754d = str;
            q933.f259755e = C79471a.m96436a();
            q933.f259756f = C91363f.m114614b();
            q933.f259761n = 1;
            q932 = q933;
        }
        try {
            SimpleHttpLogic.Request request = new SimpleHttpLogic.Request();
            this.f248327a = request;
            request.cgi = "/cgi-bin/micromsg-bin/mmtlsprconfig";
            request.host = MMApplicationContext.getResources().getString(C0966R.string.fmf);
            PByteArray pByteArray = new PByteArray();
            boolean packRequest = SimpleHttpLogic.packRequest(q932.toByteArray(), pByteArray);
            Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "pack result " + packRequest);
            this.f248327a.body = pByteArray.value;
        } catch (IOException e) {
            this.f248327a = null;
            Log.printErrStackTrace("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", e, "mmtls request create failed.", new Object[0]);
        }
        Log.m105925i("MicroMsg.Tinker.NetSceneBaseMMTLSCheck", "prconfig %s", "baseId  :" + q932.f259754d + "\n" + "patchId :" + q932.f259755e + "\n");
    }
}
