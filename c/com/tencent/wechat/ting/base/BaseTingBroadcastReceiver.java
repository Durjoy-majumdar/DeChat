package com.tencent.wechat.ting.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mars.ilink.xlog.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/wechat/ting/base/BaseTingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public abstract class BaseTingBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public abstract void mo8236a();

    /* renamed from: b */
    public abstract void mo8237b();

    /* renamed from: c */
    public abstract void mo8238c();

    /* renamed from: d */
    public abstract void mo8239d();

    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        int intExtra = intent.getIntExtra("com.tencent.mm.ting.ActionCode", 0);
        Log.m160928i("MicroMsg.BaseTingBroadcastReceiver", "onReceive:" + intExtra);
        if (intExtra == 1) {
            mo8238c();
        } else if (intExtra == 2) {
            mo8237b();
        } else if (intExtra == 3) {
            mo8236a();
        } else if (intExtra == 4) {
            mo8239d();
        }
    }
}
