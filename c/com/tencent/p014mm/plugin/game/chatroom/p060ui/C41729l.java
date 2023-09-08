package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41730m;
import cx1.C45220b;
import cx1.C45221c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kx1.C46791c;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.l */
public final class C41729l {

    /* renamed from: a */
    public static final C41729l f112309a = new C41729l();

    /* renamed from: a */
    public static final void m45220a(C41729l lVar, C45220b bVar, C41730m mVar, boolean z) {
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (!bVar.f122544a.isEmpty()) {
            arrayList.addAll(bVar.f122544a);
        }
        if (((Boolean) bVar.f122545b.f38555d).booleanValue()) {
            arrayList.addAll((Collection) bVar.f122545b.f38556e);
        }
        if (((Boolean) bVar.f122546c.f38555d).booleanValue()) {
            arrayList.addAll((Collection) bVar.f122546c.f38556e);
        }
        if (((Boolean) bVar.f122547d.f38555d).booleanValue()) {
            arrayList.addAll((Collection) bVar.f122547d.f38556e);
        }
        if (z) {
            mVar.getClass();
            List<C45221c> a = C46791c.f125914a.mo72013a(arrayList);
            C54248l.m60949a(new C41730m.C41731a(mVar.f112313g, a), true).mo75046b(mVar);
            ((ArrayList) mVar.f112313g).clear();
            ((ArrayList) mVar.f112313g).addAll(a);
            return;
        }
        mVar.mo65447t3(arrayList);
    }
}
