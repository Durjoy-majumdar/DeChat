package ge2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.performance.elf.ElfCallUpReceiver;
import com.tencent.p014mm.plugin.performance.elf.ElfCheckResponse;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ge2.a */
public class C32425a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f85994d;

    /* renamed from: e */
    public final /* synthetic */ ElfCheckResponse f85995e;

    public C32425a(ElfCheckResponse elfCheckResponse, Context context) {
        this.f85995e = elfCheckResponse;
        this.f85994d = context;
    }

    public void run() {
        Log.m105925i("MicroMsg.ElfCheckResponse", "call this response %s", this.f85995e.toString());
        Intent intent = new Intent(this.f85994d, ElfCallUpReceiver.class);
        intent.setAction(ElfCallUpReceiver.class.getName());
        Bundle bundle = this.f85995e.f81898o;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        this.f85994d.sendBroadcast(intent);
    }
}
