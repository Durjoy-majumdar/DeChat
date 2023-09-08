package com.tencent.p014mm.plugin.gamelive.playgame;

import android.view.View;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.a$$d */
public final /* synthetic */ class a$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C85232a f248318d;

    public /* synthetic */ a$$d(C85232a aVar) {
        this.f248318d = aVar;
    }

    public final void onClick(View view) {
        C85232a aVar = this.f248318d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
        aVar.f248315p = true;
        aVar.f248300a.mo5085n();
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionPlayGameCgi, (String) null, 0, aVar.f248311l), GameLiveCommonService.C80854b.class, new a$$g(aVar));
        C117292a.m165361g(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
