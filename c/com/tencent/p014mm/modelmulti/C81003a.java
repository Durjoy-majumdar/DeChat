package com.tencent.p014mm.modelmulti;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;

/* renamed from: com.tencent.mm.modelmulti.a */
public final class C81003a {

    /* renamed from: a */
    public Boolean f237933a = null;

    /* renamed from: com.tencent.mm.modelmulti.a$a */
    public class C81004a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C81005b f237934a;

        /* renamed from: b */
        public final /* synthetic */ boolean f237935b;

        public C81004a(C81005b bVar, boolean z) {
            this.f237934a = bVar;
            this.f237935b = z;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent == null ? "" : intent.getAction();
            Log.m105925i("MicroMsg.ScreenState", "ScreenReceiver action [%s] ", action);
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                C81003a.this.f237933a = Boolean.FALSE;
            } else {
                C81003a.this.f237933a = Boolean.TRUE;
            }
            C81005b bVar = this.f237934a;
            if (bVar != null) {
                bVar.mo112882a(C81003a.this.f237933a.booleanValue());
            }
            if (this.f237935b) {
                context.unregisterReceiver(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelmulti.a$b */
    public interface C81005b {
        /* renamed from: a */
        void mo112882a(boolean z);
    }

    public C81003a(Context context, C81005b bVar, boolean z) {
        Context context2 = context;
        Boolean bool = null;
        try {
            Boolean bool2 = (Boolean) PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager) context2.getSystemService("power"), new Object[0]);
            Log.m105925i("MicroMsg.ScreenState", "reflectScreenOn: byReflect:%s isScreenOn:%s", bool2, this.f237933a);
            bool = bool2;
        } catch (Exception e) {
            C117407d.INSTANCE.idkeyStat((long) 99, 154, 1, false);
            Log.m105921e("MicroMsg.ScreenState", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", this.f237933a, Util.stackTraceToString(e));
        }
        this.f237933a = bool;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context2.registerReceiver(new C81004a(bVar, z), intentFilter);
    }
}
