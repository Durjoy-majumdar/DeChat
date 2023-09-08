package com.tencent.p014mm.modelsimple;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.modelsimple.NetSceneGetDisasterInfo$1;
import com.tencent.p014mm.plugin.account.p024ui.DisasterUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.modelsimple.u */
public class C55392u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NetSceneGetDisasterInfo$1.C553881 f157762d;

    public C55392u(NetSceneGetDisasterInfo$1.C553881 r1) {
        this.f157762d = r1;
    }

    public void run() {
        Log.m105925i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony[%b]", Boolean.valueOf(MMApplicationContext.isAppHasInit()));
        Intent intent = new Intent();
        intent.putExtra("key_disaster_content", r1);
        intent.putExtra("key_disaster_url", r0);
        intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/modelsimple/NetSceneGetDisasterInfo$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/modelsimple/NetSceneGetDisasterInfo$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
