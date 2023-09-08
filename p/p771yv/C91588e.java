package p771yv;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.feature.performance.C80864q;
import com.tencent.p014mm.plugin.battery.BackgroundActivationsListener;
import com.tencent.p014mm.plugin.performance.elf.MainProcessChecker;
import com.tencent.p014mm.plugin.performance.watchdogs.C85341m;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import ge2.C32426b;
import p918s2.C77604h;

/* renamed from: yv.e */
public class C91588e implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        boolean z = false;
        C32426b.m39718a(MainProcessChecker.class).mo118556j(false);
        MemoryWatchDog.f248575A.mo118587m(false);
        C85341m.f248689g.f248690d = false;
        if (C80864q.f237693g != null) {
            C80864q.f237693g.onAppBackground(str);
        }
        Context context = MMApplicationContext.getContext();
        if (WeChatEnvironment.hasDebugger()) {
            try {
                z = C77604h.m93589b(context).contains(context.getPackageName());
            } catch (Exception unused) {
            }
            if (z) {
                try {
                    context.startService(new Intent(context, BackgroundActivationsListener.class));
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void onAppForeground(String str) {
        boolean z;
        C32426b.m39718a(MainProcessChecker.class).mo118556j(true);
        MemoryWatchDog.f248575A.mo118587m(true);
        C85341m.f248689g.f248690d = true;
        if (C80864q.f237693g != null) {
            C80864q.f237693g.onAppForeground(str);
        }
        Context context = MMApplicationContext.getContext();
        if (WeChatEnvironment.hasDebugger()) {
            try {
                z = C77604h.m93589b(context).contains(context.getPackageName());
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                try {
                    context.stopService(new Intent(context, BackgroundActivationsListener.class));
                } catch (Exception unused2) {
                }
            }
        }
    }
}
