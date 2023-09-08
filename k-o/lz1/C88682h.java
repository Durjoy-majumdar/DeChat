package lz1;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Parcelable;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C8480h;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* renamed from: lz1.h */
public class C88682h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88687n f256031d;

    /* renamed from: e */
    public final /* synthetic */ C88672e f256032e;

    /* renamed from: lz1.h$a */
    public class C88683a implements C1256g<GameLiveCommonService.IPCLiveControlData> {
        public C88683a() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            GameLiveCommonService.IPCLiveControlData iPCLiveControlData = (GameLiveCommonService.IPCLiveControlData) obj;
            try {
                C88682h.this.f256032e.f255989e.close();
                C88682h.this.f256032e.f255992h.close();
                C88682h.this.f256032e.f255992h = new LocalServerSocket(C88682h.this.f256032e.f256005x);
                LocalSocket accept = C88682h.this.f256032e.f255992h.accept();
                Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "vira: retry got client");
                C88672e eVar = C88682h.this.f256032e;
                if (eVar.f255990f == null) {
                    Log.m105928w("MicroMsg.GameLiveAppbrandAudioMgrService", "handle is null!");
                    return;
                }
                eVar.f255989e = new ObjectOutputStream(accept.getOutputStream());
                C88682h.this.f256032e.xx0();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.GameLiveAppbrandAudioMgrService", e, "io exception again", new Object[0]);
            }
        }
    }

    public C88682h(C88672e eVar, C88687n nVar) {
        this.f256032e = eVar;
        this.f256031d = nVar;
    }

    public void run() {
        ObjectOutputStream objectOutputStream = this.f256032e.f255989e;
        if (objectOutputStream != null) {
            try {
                objectOutputStream.writeUnshared(this.f256031d);
                this.f256032e.f255989e.reset();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.GameLiveAppbrandAudioMgrService", e, "io exception, try reconnect", new Object[0]);
                this.f256032e.wx0();
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionAudioReconnect, (String) null, 0, (Parcelable) null, 14, (C8480h) null), GameLiveCommonService.C80854b.class, new C88683a());
            }
        }
    }
}
