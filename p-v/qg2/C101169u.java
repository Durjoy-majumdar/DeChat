package qg2;

import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import di3.C86312j;
import pb1.C100718j1;
import pb1.C100755z;
import sg2.C101617b;
import xb1.C102614d;

/* renamed from: qg2.u */
public class C101169u {
    /* renamed from: a */
    public static C100755z m132684a(long j) {
        return ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
    }

    /* renamed from: b */
    public static String m132685b(C101617b bVar) {
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 2;
        aVar.f264840f = bVar.f297464a;
        favoriteOperationEvent.publish();
        return favoriteOperationEvent.f264834e.f264857c;
    }
}
