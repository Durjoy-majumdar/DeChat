package com.tencent.p014mm.p136ui.chatting.half;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.chatting.C57667a4;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import kotlin.Metadata;
import yb2.C79062b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/ui/chatting/half/HalfScreenChattingStarter$msgReceiver$1", "Landroid/content/BroadcastReceiver;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.half.HalfScreenChattingStarter$msgReceiver$1 */
public final class HalfScreenChattingStarter$msgReceiver$1 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Context context2;
        Intent intent2 = intent;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent2, "intent");
        String processName = MMApplicationContext.getProcessName();
        boolean isMainProcess = MMApplicationContext.isMainProcess();
        boolean isForeground = AppUIForegroundOwner.INSTANCE.isForeground();
        ProcessUIResumedStateOwner processUIResumedStateOwner = ProcessUIResumedStateOwner.INSTANCE;
        boolean isForeground2 = processUIResumedStateOwner.isForeground();
        Log.m105919d("HalfScreenChattingStarter", "onReceiveMsg() intent = [" + intent2 + "] process:%s main:%s appForeground:%s processResume:%s", processName, Boolean.valueOf(isMainProcess), Boolean.valueOf(isForeground), Boolean.valueOf(isForeground2));
        Intent intent3 = (Intent) intent2.getParcelableExtra("extraData");
        if (processUIResumedStateOwner.isForeground()) {
            BroadcastReceiver broadcastReceiver = HalfScreenChattingStarter.f82854a;
            if (intent3 == null) {
                Log.m105920e("HalfScreenChattingStarter", "startHalfScreenAct err extraData is null");
                return;
            }
            intent3.setExtrasClassLoader(HalfScreenChattingStarter.class.getClassLoader());
            String stringExtra = intent3.getStringExtra("Chat_User");
            if (C87412m.m108589b(MMApplicationContext.isMainProcess() ? ((MMNotification) C97625j3.m125816f()).f194715b : "", stringExtra)) {
                Log.m105928w("HalfScreenChattingStarter", "curTalker is same, do nothing");
                return;
            }
            AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
            appForegroundDelegate.getClass();
            WeakReference<Activity> g = AppForegroundDelegate.m161224g();
            if (g == null || (context2 = g.get()) == null) {
                WeakReference<Activity> f = appForegroundDelegate.mo174212f();
                context2 = f != null ? f.get() : null;
            }
            C87412m.m108593f(context2, "INSTANCE.topContext");
            Intent intent4 = new Intent();
            intent4.putExtra("finish_direct", true);
            intent4.putExtra("KIsHalfScreen", true);
            intent4.putExtras(intent3);
            if (C72996z1.m85846q5(stringExtra)) {
                intent4.setClass(context2, OpenImKefuServiceChattingUI.class);
                C79062b.m95631b(intent4, C57667a4.class);
            } else {
                intent4.setClassName(context2, "com.tencent.mm.ui.chatting.BizHalfScreenChattingUI");
            }
            intent4.addFlags(67108864);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent4);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/half/HalfScreenChattingStarter", "startHalfScreenAct", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/ui/chatting/half/HalfScreenChattingStarter", "startHalfScreenAct", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
