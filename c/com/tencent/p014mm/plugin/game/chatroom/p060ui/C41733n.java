package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.view.View;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41730m;
import com.tencent.p014mm.plugin.game.chatroom.view.C41790a0;
import cx1.C45221c;
import cx1.C45223e;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.n */
public final class C41733n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45221c f112318d;

    /* renamed from: e */
    public final /* synthetic */ C41734o f112319e;

    /* renamed from: f */
    public final /* synthetic */ C41730m.C41732b f112320f;

    public C41733n(C45221c cVar, C41734o oVar, C41730m.C41732b bVar) {
        this.f112318d = cVar;
        this.f112319e = oVar;
        this.f112320f = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/MentionUserViewHolder$setData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C40308d.C40309a aVar = C40308d.f108375a;
        C45221c cVar = this.f112318d;
        long j = (long) cVar.f122551d;
        C41734o oVar = this.f112319e;
        aVar.mo62995e(j, 2, oVar.f112322B, oVar.f112323C, cVar.f122549b.f122555a);
        C41730m.C41732b bVar = this.f112320f;
        if (bVar != null) {
            C45223e eVar = this.f112318d.f122549b;
            String str = eVar.f122555a;
            String str2 = eVar.f122556b;
            C41790a0 a0Var = (C41790a0) bVar;
            C101218e0 e0Var = a0Var.f112640a.f112466K;
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            a0Var.f112640a.mo65490d(str, str2, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionUserViewHolder$setData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
