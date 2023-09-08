package com.tencent.p014mm.plugin.game.commlib.util;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.plugin.game.commlib.util.C41862c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import mp3.C88824h;
import q20.C89449a;
import rx3.C13598b0;
import ug3.C90661f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.d */
public class C41864d {

    /* renamed from: a */
    public static volatile MMHandler f112810a;

    /* renamed from: b */
    public static final Object f112811b = new Object();

    /* renamed from: c */
    public static final Set<String> f112812c = new HashSet();

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.d$a */
    public class C41865a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object f112813d;

        public C41865a(Object obj) {
            this.f112813d = obj;
        }

        public void run() {
            Bundle bundle = new Bundle();
            bundle.putInt("action_id", 1);
            bundle.putString("action_param", this.f112813d.getClass().getName());
            C80907o.m98783f(MMApplicationContext.getApplicationId(), bundle, C41869e.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.d$b */
    public class C41866b implements Callable<Bundle> {
        public Object call() {
            Bundle bundle = new Bundle();
            bundle.putInt("action_id", 3);
            return (Bundle) C80907o.m98783f(MMApplicationContext.getApplicationId(), bundle, C41869e.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.d$c */
    public class C41867c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object f112814d;

        public C41867c(Object obj) {
            this.f112814d = obj;
        }

        public void run() {
            Bundle bundle = new Bundle();
            bundle.putInt("action_id", 2);
            bundle.putString("action_param", this.f112814d.getClass().getName());
            C80907o.m98783f(MMApplicationContext.getApplicationId(), bundle, C41869e.class);
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.commlib.util.d$d */
    public static class C41868d implements C80883e<Bundle, Bundle> {
        private C41868d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("action_id");
            if (i == 1) {
                ((HashSet) C41864d.f112812c).add(bundle.getString("action_param"));
            } else if (i == 2) {
                ((HashSet) C41864d.f112812c).remove(bundle.getString("action_param"));
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.commlib.util.d$e */
    public static class C41869e implements C80916r<Bundle, Bundle> {
        private C41869e() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("action_id");
            if (i == 1) {
                C41862c.f112806c.mo65644a();
                ((HashSet) C41864d.f112812c).add(bundle.getString("action_param"));
                String[] split = bundle.getString("action_param").split("\\.");
                if (split.length > 0) {
                    Log.m105925i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onCreate", split[split.length - 1]);
                }
            } else if (i == 2) {
                C41862c.f112806c.mo65645b();
                ((HashSet) C41864d.f112812c).remove(bundle.getString("action_param"));
                String[] split2 = bundle.getString("action_param").split("\\.");
                if (split2.length > 0) {
                    Log.m105925i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onDestroy", split2[split2.length - 1]);
                }
            }
            Bundle bundle2 = new Bundle();
            C41862c.C41863a aVar = C41862c.f112806c;
            bundle2.putString("session_id", aVar.mo65644a().f112808a);
            bundle2.putLong("client_timestamp", aVar.mo65644a().f112809b);
            return bundle2;
        }
    }

    static {
        new HashSet();
    }

    /* renamed from: a */
    public static void m45384a(Object obj) {
        if (MMApplicationContext.isMainProcess()) {
            C41862c.f112806c.mo65644a();
            ((HashSet) f112812c).add(obj.getClass().getName());
            String[] split = obj.getClass().getName().split("\\.");
            if (split.length > 0) {
                Log.m105925i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onCreate", split[split.length - 1]);
                return;
            }
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C41865a(obj), "GameSession");
    }

    /* renamed from: b */
    public static Bundle m45385b() {
        if (MMApplicationContext.isMainProcess()) {
            Bundle bundle = new Bundle();
            C41862c.C41863a aVar = C41862c.f112806c;
            bundle.putString("session_id", aVar.mo65644a().f112808a);
            bundle.putLong("client_timestamp", aVar.mo65644a().f112809b);
            return bundle;
        }
        C119179t tVar = C119157j.f356862d;
        C41866b bVar = new C41866b();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        try {
            Bundle bundle2 = (Bundle) jVar.mo183881l(bVar, 0, "GameSession").get();
            return bundle2 == null ? new Bundle() : bundle2;
        } catch (InterruptedException | ExecutionException unused) {
            return new Bundle();
        }
    }

    /* renamed from: c */
    public static MMHandler m45386c() {
        if (f112810a == null) {
            synchronized (f112811b) {
                if (f112810a == null) {
                    f112810a = new MMHandler("GameCommLib#WorkThread");
                    C88824h.m110908b("GameCommLib#WorkThread", new C90661f("GameCommLib#WorkThread"));
                }
            }
        }
        return f112810a;
    }

    /* renamed from: d */
    public static boolean m45387d(Context context, String str) {
        return ((HashSet) f112812c).contains(str);
    }

    /* renamed from: e */
    public static void m45388e(Object obj) {
        if (MMApplicationContext.isMainProcess()) {
            C41862c.f112806c.mo65645b();
            ((HashSet) f112812c).remove(obj.getClass().getName());
            String[] split = obj.getClass().getName().split("\\.");
            if (split.length > 0) {
                Log.m105925i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onDestroy", split[split.length - 1]);
                return;
            }
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C41867c(obj), "GameSession");
    }

    /* renamed from: f */
    public static void m45389f() {
        if (C41862c.f112807d == null) {
            synchronized (C41862c.class) {
                if (C41862c.f112807d == null) {
                    C41862c.f112807d = new C41862c();
                    return;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C41862c cVar = C41862c.f112807d;
        if (cVar != null) {
            cVar.f112809b = System.currentTimeMillis();
        } else {
            C87412m.m108603p("instance");
            throw null;
        }
    }
}
