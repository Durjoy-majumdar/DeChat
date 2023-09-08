package yc2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import tc2.C118418g;

/* renamed from: yc2.p */
public class C118984p {

    /* renamed from: a */
    public static C118986b f356413a;

    /* renamed from: b */
    public static boolean f356414b;

    /* renamed from: yc2.p$b */
    public static class C118986b extends BroadcastReceiver {
        public C118986b(C118985a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C118984p.f356414b = intent.getExtras().getBoolean(C118418g.INSTANCE.Z10("3<<;14\"<<"));
            }
        }
    }
}
