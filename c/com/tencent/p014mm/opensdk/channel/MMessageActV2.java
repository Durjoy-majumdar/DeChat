package com.tencent.p014mm.opensdk.channel;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.p014mm.opensdk.channel.p943a.C81053a;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.utils.C81058b;
import com.tencent.p014mm.opensdk.utils.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.opensdk.channel.MMessageActV2 */
public class MMessageActV2 {
    public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
    public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    private static final String TAG = "MicroMsg.SDK.MMessageAct";
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.opensdk.channel.MMessageActV2$Args */
    public static class Args {
        public static final int INVALID_FLAGS = -1;
        public Bundle bundle;
        public String content;
        public int flags = -1;
        public int launchMode = 2;
        public String targetClassName;
        public String targetPkgName;
        public String token;

        public String toString() {
            return "targetPkgName:" + this.targetPkgName + ", targetClassName:" + this.targetClassName + ", content:" + this.content + ", flags:" + this.flags + ", bundle:" + this.bundle;
        }
    }

    public static boolean send(Context context, Args args) {
        String str;
        if (context == null || args == null) {
            str = "send fail, invalid argument";
        } else if (C81058b.m99052b(args.targetPkgName)) {
            str = "send fail, invalid targetPkgName, targetPkgName = " + args.targetPkgName;
        } else {
            if (C81058b.m99052b(args.targetClassName)) {
                args.targetClassName = args.targetPkgName + DEFAULT_ENTRY_CLASS_NAME;
            }
            Log.m99045i(TAG, "send, targetPkgName = " + args.targetPkgName + ", targetClassName = " + args.targetClassName + ", launchMode = " + args.launchMode);
            Intent intent = new Intent();
            intent.setClassName(args.targetPkgName, args.targetClassName);
            Bundle bundle = args.bundle;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, args.content);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C81053a.m99037a(args.content, (int) Build.SDK_INT, packageName));
            intent.putExtra(ConstantsAPI.TOKEN, args.token);
            int i = args.flags;
            if (i == -1) {
                intent.addFlags(268435456).addFlags(134217728);
            } else {
                intent.setFlags(i);
            }
            try {
                if (Build.VERSION.SDK_INT < 29 || args.launchMode != 2) {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/opensdk/channel/MMessageActV2", "send", "(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/opensdk/channel/MMessageActV2", "send", "(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    sendUsingPendingIntent(context, intent);
                }
                Log.m99043d(TAG, "send mm message, intent=" + intent);
                return true;
            } catch (Exception e) {
                str = "send fail, ex = " + e.getMessage();
            }
        }
        Log.m99044e(TAG, str);
        return false;
    }

    private static void sendUsingPendingIntent(Context context, Intent intent) {
        try {
            Log.m99045i(TAG, "sendUsingPendingIntent");
            (Build.VERSION.SDK_INT >= 23 ? PendingIntent.getActivity(context, 3, intent, 201326592) : PendingIntent.getActivity(context, 3, intent, 134217728)).send(context, 4, (Intent) null, new PendingIntent.OnFinished() {
                public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
                    Log.m99045i(MMessageActV2.TAG, "sendUsingPendingIntent onSendFinished resultCode: " + i + ", resultData: " + str);
                }
            }, (Handler) null);
        } catch (Exception e) {
            Log.m99044e(TAG, "sendUsingPendingIntent fail, ex = " + e.getMessage());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/opensdk/channel/MMessageActV2", "sendUsingPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/opensdk/channel/MMessageActV2", "sendUsingPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
