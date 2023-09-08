package a30;

import a30.C112744a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.internal.ConstValue;

/* renamed from: a30.b */
public class C112750b extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        String action = intent.getAction();
        if (!Util.isNullOrNil(action) && (intExtra = intent.getIntExtra("pid", 0)) != 0) {
            String stringExtra = intent.getStringExtra(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
            if (!Util.isNullOrNil(stringExtra) && stringExtra.equals(Util.getProcessNameByPid(MMApplicationContext.getContext(), intExtra))) {
                String stringExtra2 = intent.getStringExtra("traceMsg");
                long longExtra = intent.getLongExtra("tick", 0);
                if ("com.tencent.mm.ACTION.note_tracemsg_lock".equals(action)) {
                    C112744a.C112748c.m154186b(stringExtra, stringExtra2, longExtra);
                } else if ("com.tencent.mm.ACTION.note_tracemsg_unlock".equals(action)) {
                    C112744a.C112748c.m154187c(stringExtra, stringExtra2, longExtra);
                }
            }
        }
    }
}
