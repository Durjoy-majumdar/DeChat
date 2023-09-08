package nj3;

import android.content.Intent;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;

/* renamed from: nj3.g1 */
public class C34861g1 {

    /* renamed from: a */
    public static int f93647a = -1;

    /* renamed from: a */
    public static void m40517a(boolean z, Intent intent) {
        boolean z2 = f93647a != z;
        f93647a = z ? 1 : 0;
        if (!z2) {
            Log.m105928w("MicroMsg.UIStatusUtil", "isRealSend = false,just return!");
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        intent.setAction(z ? "com.tencent.mm.ui.ACTION_ACTIVE" : "com.tencent.mm.ui.ACTION_DEACTIVE");
        intent.putExtra(MMApplicationContext.INTENT_PROCESS_NAME, MMApplicationContext.getProcessName());
        intent.putExtra("process_id", Process.myPid());
        intent.putExtra("process_is_mm", MMApplicationContext.isMMProcess());
        MMApplicationContext.getContext().sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
    }
}
