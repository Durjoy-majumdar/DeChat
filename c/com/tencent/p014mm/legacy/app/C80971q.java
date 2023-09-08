package com.tencent.p014mm.legacy.app;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.splash.C85781g;
import com.tencent.xweb.internal.ConstValue;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.tencent.mm.legacy.app.q */
public class C80971q implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ WeChatSplashStartup f237826a;

    public C80971q(WeChatSplashStartup weChatSplashStartup) {
        this.f237826a = weChatSplashStartup;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        ArrayList<long[]> arrayList = C85781g.f249840r.f249868a;
        Iterator<long[]> it = arrayList.iterator();
        while (it.hasNext()) {
            long[] next = it.next();
            Log.m105925i("MicroMsg.WeChatSplashStartup", "splash %s, %s, %s", Long.valueOf(next[0]), Long.valueOf(next[1]), Long.valueOf(next[2]));
            C115669n.INSTANCE.idkeyStat(next[0], next[1], next[2], false);
        }
        ArrayList<String> arrayList2 = C85781g.f249840r.f249869b;
        HashMap hashMap = new HashMap();
        hashMap.put(ConstValue.INIT_CONFIG_KEY_PROCESSNAME, this.f237826a.f237802b);
        Iterator<String> it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            String next2 = it4.next();
            Log.m105925i("MicroMsg.WeChatSplashStartup", "splash message %s", next2);
            C115669n.INSTANCE.mo160135k("NewSplash", next2, hashMap);
        }
        Log.m105925i("MicroMsg.WeChatSplashStartup", "report splash info %s %s", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
        return null;
    }
}
