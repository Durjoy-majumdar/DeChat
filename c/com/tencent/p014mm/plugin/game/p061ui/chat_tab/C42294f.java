package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameHotMsgView;
import cz1.C7143c;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import xy1.C15912f;
import xy1.C15913g;
import xy1.C53472h;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.f */
public class C42294f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameHotMsgView.C42256d f114369d;

    /* renamed from: e */
    public final /* synthetic */ int f114370e;

    /* renamed from: f */
    public final /* synthetic */ GameHotMsgView.C42254c.C42255a f114371f;

    public C42294f(GameHotMsgView.C42254c.C42255a aVar, GameHotMsgView.C42256d dVar, int i) {
        this.f114371f = aVar;
        this.f114369d = dVar;
        this.f114370e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$GameHotMsgAdapter$HotMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C53472h) C86312j.m106911c(C53472h.class)).K10(GameHotMsgView.this.f114220C1, this.f114369d.f114240e);
        C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(this.f114369d.f114240e.field_selfUserName);
        C7143c cVar = this.f114369d.f114240e;
        if (!(cVar.f25115F == null || X3 == null)) {
            C40306c.C40307a aVar = C40306c.f108374a;
            int i = this.f114370e + 1;
            int i2 = GameHotMsgView.C42254c.this.f114229d;
            String str = cVar.field_sessionId;
            long D0 = (long) X3.mo422D0();
            C7143c cVar2 = this.f114369d.f114240e;
            String str2 = cVar2.field_selfUserName;
            long j = (long) cVar2.f25115F.field_accountType;
            String str3 = cVar2.field_talker;
            long l2 = cVar2.mo8333l2();
            GameHotMsgView gameHotMsgView = GameHotMsgView.this;
            long j2 = gameHotMsgView.f114221D1;
            if (j2 <= 0) {
                j2 = gameHotMsgView.f114222E1;
            }
            aVar.mo62989f(i, 2, i2, str, D0, str2, j, str3, l2, (long) ((int) j2), (String) null, Integer.valueOf(this.f114369d.f114240e.field_unReadCount));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$GameHotMsgAdapter$HotMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
