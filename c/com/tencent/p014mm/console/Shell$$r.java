package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.FileReaderHelper;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$r */
public class Shell$$r implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String str = "<cmd><diagnostic><MemoryHook enable='" + Shell.m38415a(intent.getStringExtra("enable"), "0") + "' source='push' process='all' duration='" + Shell.m38415a(intent.getStringExtra("duration"), "1") + "' hook='" + Shell.m38415a(intent.getStringExtra("hook"), ".*com\\.tencent\\.mm.*\\.so$") + "' ignore='" + Shell.m38415a(intent.getStringExtra("ignore"), "") + "' stack='" + Shell.m38415a(intent.getStringExtra("stack"), "0") + "' min='" + Shell.m38415a(intent.getStringExtra("min"), "0") + "' max='" + Shell.m38415a(intent.getStringExtra("max"), "0") + "' force='" + Shell.m38415a(intent.getStringExtra(FileReaderHelper.OPEN_FILE_FROM_FORCE), "0") + "' sampling='" + Shell.m38415a(intent.getStringExtra("sampling"), "1") + "' extreme='" + Shell.m38415a(intent.getStringExtra("extreme"), "0") + "' mmap='" + Shell.m38415a(intent.getStringExtra("mmap"), "0") + "'/></diagnostic></cmd>";
            C28544a.INSTANCE.mo56047c(str);
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 0).show();
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
