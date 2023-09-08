package com.tencent.p1102pb.common.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bs3.C104161b;
import lv3.C109435e;
import mv3.C109642a;
import zr3.C112682h;
import zr3.C112683i;

/* renamed from: com.tencent.pb.common.system.ConnectReceiver */
public class ConnectReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static C112682h f320041a;

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction() != null) {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        if (f320041a == null) {
                            f320041a = new C112682h();
                        }
                        boolean a = C112683i.m154066a();
                        boolean a2 = f320041a.mo164418a();
                        C109642a aVar = (C109642a) C109435e.m148612c("EventCenter");
                        if (a2 && aVar != null) {
                            if (a) {
                                aVar.mo160862a("GLOBAL_TOPIC_NETWORK_CHANGE", 21, 0, 0, (Object) null);
                            } else {
                                aVar.mo160862a("GLOBAL_TOPIC_NETWORK_CHANGE", 33, 0, 0, (Object) null);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C104161b.m138997f("ConnectReceiver", "onReceive", th);
            }
        }
    }
}
