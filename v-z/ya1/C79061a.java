package ya1;

import android.database.MatrixCursor;
import cd3.C39945b;
import com.tencent.p014mm.autogen.events.ExtRecordEvent;
import com.tencent.p014mm.autogen.events.ExtVoiceFileNameToMsgIdEvent;
import com.tencent.p014mm.plugin.ext.key.AESUtil;
import com.tencent.p014mm.plugin.ext.provider.ExtControlProviderMsg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import ra1.C47958b;

/* renamed from: ya1.a */
public class C79061a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f232164d;

    /* renamed from: e */
    public final /* synthetic */ long f232165e;

    /* renamed from: f */
    public final /* synthetic */ C39945b f232166f;

    /* renamed from: g */
    public final /* synthetic */ String[] f232167g;

    /* renamed from: h */
    public final /* synthetic */ ExtControlProviderMsg f232168h;

    public C79061a(ExtControlProviderMsg extControlProviderMsg, int i, long j, C39945b bVar, String[] strArr) {
        this.f232168h = extControlProviderMsg;
        this.f232164d = i;
        this.f232165e = j;
        this.f232166f = bVar;
        this.f232167g = strArr;
    }

    public void run() {
        int i = this.f232164d;
        if (i == 1) {
            C47958b xx02 = C47958b.xx0();
            long j = this.f232165e;
            xx02.getClass();
            C72996z1 e4 = (!C97625j3.m125811a() || j <= 0) ? null : C97625j3.m125812b().mo105907v().mo69694e4(j);
            if (e4 == null || ((int) e4.f108320R1) <= 0) {
                this.f232168h.mo128176i(3);
                this.f232166f.mo62559a();
                return;
            }
            ExtRecordEvent extRecordEvent = new ExtRecordEvent();
            ExtRecordEvent.C67682a aVar = extRecordEvent.f193555d;
            aVar.f193557a = 1;
            aVar.f193558b = e4.getUsername();
            if (!extRecordEvent.publish()) {
                this.f232168h.mo128176i(4);
                this.f232166f.mo62559a();
                return;
            }
            this.f232168h.f269512o = new MatrixCursor(ExtControlProviderMsg.f269508w);
            if (((int) e4.f108320R1) <= 0 || !extRecordEvent.f193556e.f193559a) {
                this.f232168h.f269512o.addRow(new Object[]{this.f232167g[1], 2, "0"});
                this.f232168h.mo128176i(3);
            } else {
                this.f232168h.f269512o.addRow(new Object[]{this.f232167g[1], 1, "0"});
                this.f232168h.mo128176i(0);
            }
            Log.m105919d("MicroMsg.ExtControlProviderMsg", "start record, ret=[%s], fileName=[%s]", Boolean.valueOf(extRecordEvent.f193556e.f193559a), extRecordEvent.f193556e.f193560b);
        } else if (i == 2) {
            ExtRecordEvent extRecordEvent2 = new ExtRecordEvent();
            extRecordEvent2.f193555d.f193557a = 2;
            if (!extRecordEvent2.publish()) {
                this.f232168h.mo128176i(4);
                this.f232166f.mo62559a();
                return;
            }
            String str = extRecordEvent2.f193556e.f193560b;
            this.f232168h.f269512o = new MatrixCursor(ExtControlProviderMsg.f269508w);
            ExtVoiceFileNameToMsgIdEvent extVoiceFileNameToMsgIdEvent = new ExtVoiceFileNameToMsgIdEvent();
            extVoiceFileNameToMsgIdEvent.f193572d.f193574a = str;
            if (!extVoiceFileNameToMsgIdEvent.publish()) {
                this.f232168h.mo128176i(4);
                this.f232168h.f269512o.close();
                this.f232166f.mo62559a();
                return;
            }
            Log.m105919d("MicroMsg.ExtControlProviderMsg", "stop record, msgId=[%s]", Long.valueOf(extVoiceFileNameToMsgIdEvent.f193573e.f193575a));
            long j2 = extVoiceFileNameToMsgIdEvent.f193573e.f193575a;
            if (j2 > 0) {
                try {
                    if (!extRecordEvent2.f193556e.f193559a) {
                        this.f232168h.f269512o.addRow(new Object[]{this.f232167g[1], 4, AESUtil.m105053b(j2)});
                        this.f232168h.mo128176i(4);
                    } else if (MMApplicationContext.getContext() == null || !NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                        this.f232168h.f269512o.addRow(new Object[]{this.f232167g[1], 6, AESUtil.m105053b(j2)});
                        this.f232168h.mo128176i(4);
                    } else {
                        this.f232168h.f269512o.addRow(new Object[]{this.f232167g[1], 1, AESUtil.m105053b(j2)});
                        this.f232168h.mo128176i(0);
                    }
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.ExtControlProviderMsg", e.getMessage());
                    Log.printErrStackTrace("MicroMsg.ExtControlProviderMsg", e, "", new Object[0]);
                    this.f232168h.mo128176i(4);
                }
            } else {
                this.f232168h.mo128176i(3);
            }
        }
        this.f232166f.mo62559a();
    }
}
