package com.tencent.p014mm.plugin.fav;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f62.C31922b1;
import java.util.Map;
import ob0.C35136m;
import pb1.C100695a0;

/* renamed from: com.tencent.mm.plugin.fav.c */
public class C93396c implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Log.m105925i("MicroMsg.Fav.FavNewXmlConsumer", "consumeNewXml subtype: %s values: %s", str, map.toString());
        str.getClass();
        if (str.equals("resendfavitem")) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent.f264833d;
            aVar2.f264835a = 39;
            aVar2.f264851q = map.get(".sysmsg.favitem.favid");
            favoriteOperationEvent.f264833d.f264852r = map.get(".sysmsg.favitem.dataidlist");
            favoriteOperationEvent.asyncPublish(Looper.getMainLooper());
            C100695a0.m131727b(0);
            return null;
        } else if (!str.equals("uploadfavitem")) {
            return null;
        } else {
            FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar3 = favoriteOperationEvent2.f264833d;
            aVar3.f264835a = 38;
            aVar3.f264851q = map.get(".sysmsg.favids");
            favoriteOperationEvent2.asyncPublish(Looper.getMainLooper());
            C100695a0.m131727b(1);
            return null;
        }
    }
}
