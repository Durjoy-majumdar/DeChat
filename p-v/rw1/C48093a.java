package rw1;

import bz1.C0394d;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import cz1.C7143c;
import cz1.C7144e;
import cz1.C7148f;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p196ln.C76705f;
import py1.C47621l3;
import rx3.C13598b0;
import sw1.C48484q;
import sx3.C36907w;
import wy1.C53224d;
import xy1.C53472h;

/* renamed from: rw1.a */
public final class C48093a {

    /* renamed from: a */
    public static final C48093a f128945a = new C48093a();

    /* renamed from: b */
    public static int f128946b = -1;

    /* renamed from: c */
    public static C47621l3 f128947c;

    /* renamed from: rw1.a$a */
    public static final class C13587a extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

        /* renamed from: d */
        public static final C13587a f38532d = new C13587a();

        public C13587a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            List list = (List) obj2;
            C87412m.m108594g(list, "list");
            if (booleanValue) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    C0394d dVar = ((C7143c) next).f25115F;
                    boolean z = false;
                    if (dVar != null && dVar.field_accountType == 2) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C7143c) it.next()).field_sessionId);
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ((C53472h) C86312j.m106911c(C53472h.class)).d50((String) it4.next());
                }
                Log.m105924i("GameAccountManager", "gamelog.account, manage, delete gamelife conversation size = " + arrayList2.size());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m53460a() {
        C48093a aVar = f128945a;
        GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
        GamePBCacheEvent.C40109a aVar2 = gamePBCacheEvent.f107561d;
        aVar2.f107562a = 3;
        aVar2.f107563b = "cache_my_chatroom";
        aVar2.f107564c = null;
        gamePBCacheEvent.publish();
        aVar.mo72835c();
        C42040b0 xi02 = ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
        xi02.getClass();
        xi02.execSQL("GameRawMessage", "update GameRawMessage set isHidden = 2 where isHidden = 0 and showType = 1");
        Log.m105924i("GameAccountManager", "gamelog.account, manage ,applyDelAccount");
    }

    /* renamed from: b */
    public static final void m53461b() {
        C48093a aVar = f128945a;
        GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
        GamePBCacheEvent.C40109a aVar2 = gamePBCacheEvent.f107561d;
        aVar2.f107562a = 3;
        aVar2.f107563b = "cache_my_chatroom";
        aVar2.f107564c = null;
        gamePBCacheEvent.publish();
        aVar.mo72835c();
        ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66011qq(1);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC, -1L);
        Log.m105924i("GameAccountManager", "gamelog.account, manage ,delAccount");
    }

    /* renamed from: c */
    public final void mo72835c() {
        C13587a aVar = C13587a.f38532d;
        C87412m.m108594g(aVar, "callback");
        List<C7143c> Xs = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70734Xs(0, Integer.MAX_VALUE);
        for (C7143c cVar : Xs) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(cVar.field_selfUserName);
        }
        C7144e.f25118a.mo8337b(Xs, new C7148f(aVar));
    }
}
