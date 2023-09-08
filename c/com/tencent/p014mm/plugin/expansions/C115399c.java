package com.tencent.p014mm.plugin.expansions;

import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.expansions.ExpansionsGlobal$CP;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.plugin.expansions.c */
public class C115399c implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ IBinder f345904d;

    /* renamed from: e */
    public final /* synthetic */ Integer f345905e;

    public C115399c(ExpansionsGlobal$CP.C115396a aVar, IBinder iBinder, Integer num) {
        this.f345904d = iBinder;
        this.f345905e = num;
    }

    public Object call() {
        try {
            new Messenger(this.f345904d).send(Message.obtain((Handler) null, this.f345905e.intValue()));
        } catch (RemoteException e) {
            Log.m105928w("MicroMsg.exp.ExpansionsGlobal", "send message error: " + e.getMessage());
        }
        return null;
    }
}
