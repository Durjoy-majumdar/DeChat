package com.tencent.p014mm.plugin.game.p061ui.message;

import android.database.Cursor;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import di3.C86312j;
import java.util.LinkedList;
import sw1.C48484q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.m */
public class C42357m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InteractiveMsgMRecycleView f114576d;

    public C42357m(InteractiveMsgMRecycleView interactiveMsgMRecycleView) {
        this.f114576d = interactiveMsgMRecycleView;
    }

    public void run() {
        Class cls = C48484q.class;
        InteractiveMsgMRecycleView.C42326c cVar = this.f114576d.f114491E1;
        cVar.getClass();
        cVar.f114503d = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(1);
        Cursor bF = ((C48484q) C86312j.m106911c(cls)).xi0().mo66005bF(1, 0, this.f114576d.f114491E1.getItemCount());
        InteractiveMsgMRecycleView.C42326c cVar2 = this.f114576d.f114491E1;
        cVar2.getClass();
        if (bF != null) {
            LinkedList linkedList = new LinkedList();
            if (bF.moveToFirst()) {
                do {
                    C42119w wVar = new C42119w();
                    wVar.convertFrom(bF);
                    linkedList.add(wVar);
                } while (bF.moveToNext());
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C42363q(cVar2, linkedList));
        }
        if (bF == null || bF.getCount() == 0) {
            this.f114576d.getClass();
        } else {
            bF.close();
        }
    }
}
