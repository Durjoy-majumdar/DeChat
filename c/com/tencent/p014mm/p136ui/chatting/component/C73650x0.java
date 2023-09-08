package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.storage.C72963f4;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.component.x0 */
public class C73650x0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ List f216252d;

    /* renamed from: e */
    public final /* synthetic */ DoFavoriteEvent f216253e;

    /* renamed from: f */
    public final /* synthetic */ C73588r0 f216254f;

    public C73650x0(C73588r0 r0Var, List list, DoFavoriteEvent doFavoriteEvent) {
        this.f216254f = r0Var;
        this.f216252d = list;
        this.f216253e = doFavoriteEvent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        for (C72963f4 f4Var : this.f216252d) {
            if (!f4Var.mo101022y3() && !f4Var.mo100973L3()) {
                DoFavoriteEvent.C92474a aVar = this.f216253e.f264674d;
                if (aVar.f264678c == 14 && aVar.f264676a.f298618f.size() == 0) {
                    this.f216254f.f216101d.mo102686y3();
                    return;
                }
                this.f216254f.mo102575b(this.f216253e);
                for (C72963f4 c : this.f216254f.f216101d.mo102683n0()) {
                    C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, c, 0);
                }
                return;
            }
        }
    }
}
