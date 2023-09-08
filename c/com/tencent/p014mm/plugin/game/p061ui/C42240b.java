package com.tencent.p014mm.plugin.game.p061ui;

import com.tencent.p014mm.plugin.game.p061ui.GameDetailRankLikedUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import py1.C47602i5;
import py1.C47634n2;

/* renamed from: com.tencent.mm.plugin.game.ui.b */
public class C42240b implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ GameDetailRankLikedUI f114177d;

    public C42240b(GameDetailRankLikedUI gameDetailRankLikedUI) {
        this.f114177d = gameDetailRankLikedUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            GameDetailRankLikedUI.C42167b bVar = this.f114177d.f113743e;
            LinkedList<C47602i5> linkedList = ((C47634n2) cVar.f127056b.f127083a).f127887d;
            if (linkedList == null) {
                bVar.getClass();
            } else {
                ((LinkedList) bVar.f113747e).clear();
                ((LinkedList) bVar.f113747e).addAll(linkedList);
                bVar.notifyDataSetChanged();
            }
            this.f114177d.f113744f.dismiss();
            return 0;
        }
        int i3 = GameDetailRankLikedUI.f113741g;
        Log.m105921e("MicroMsgGameDetailRankLikedUI", "CGI return is not OK. (%d, %d)(%s)", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f114177d.finish();
        return 0;
    }
}
