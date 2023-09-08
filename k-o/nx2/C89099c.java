package nx2;

import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import g70.C87164i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nx2.c */
public final class C89099c implements Runnable {

    /* renamed from: d */
    public static final C89099c f256761d = new C89099c();

    public final void run() {
        HashMap<String, C87164i> hashMap;
        C85486a aVar = C89096b.f256755b;
        if (!(aVar == null || (hashMap = aVar.f253921h) == null)) {
            for (Map.Entry next : hashMap.entrySet()) {
                MagicSclViewContainer magicSclViewContainer = ((C87164i) next.getValue()).f252796l;
                if (magicSclViewContainer != null) {
                    magicSclViewContainer.removeAllViews();
                }
                Log.m105918d("MicroMsg.SurfaceApp.MagicLiveCardMgr", "frameSetRoot id:" + ((C87164i) next.getValue()).f252786b + " removeAllViews!");
            }
        }
        C85486a aVar2 = C89096b.f256755b;
        if (aVar2 != null) {
            aVar2.mo118861j0();
        }
        C89096b.f256755b = null;
        Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp reset MagicLiveCardMgr");
    }
}
