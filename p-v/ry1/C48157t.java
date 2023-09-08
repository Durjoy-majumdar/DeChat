package ry1;

import com.tencent.p014mm.plugin.game.p061ui.GameDetailRankLikeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;

/* renamed from: ry1.t */
public class C48157t implements l0$$e {
    public C48157t(GameDetailRankLikeView gameDetailRankLikeView) {
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            return 0;
        }
        Log.m105921e("MicroMsg.GameDetailRankLikeView", "CGI return is not OK. (%d, %d)(%s)", Integer.valueOf(i), Integer.valueOf(i2), str);
        return 0;
    }
}
