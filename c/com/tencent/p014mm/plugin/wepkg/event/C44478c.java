package com.tencent.p014mm.plugin.wepkg.event;

import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.plugin.wepkg.event.ForceUpdateNotify;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.mm.plugin.wepkg.event.c */
public class C44478c {

    /* renamed from: a */
    public static ConcurrentLinkedQueue<WeakReference<C44476a>> f120606a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.tencent.mm.plugin.wepkg.event.c$a */
    public class C44479a implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C44480b f120607d;

        public C44479a(C44480b bVar) {
            this.f120607d = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            C44480b bVar = this.f120607d;
            if (bVar != null) {
                ((ForceUpdateNotify.C44475a) bVar).getClass();
                ((HashSet) ForceUpdateNotify.f120603e).clear();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.event.c$b */
    public interface C44480b {
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.event.c$c */
    public static class C44481c implements C80883e {
        private C44481c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Iterator<WeakReference<C44476a>> it = C44478c.f120606a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                if (next.get() != null) {
                    ((C44476a) next.get()).notify(obj);
                }
            }
            gVar.mo894a(null);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m48834a(T t, C44480b bVar) {
        if (MMApplicationContext.isMainProcess()) {
            Iterator<WeakReference<C44476a>> it = f120606a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                if (next.get() != null) {
                    ((C44476a) next.get()).notify(t);
                }
            }
        }
        ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(t, C44481c.class, new C44479a(bVar));
    }

    /* renamed from: b */
    public static void m48835b(C44476a aVar) {
        Iterator<WeakReference<C44476a>> it = f120606a.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == aVar) {
                f120606a.remove(next);
            }
        }
    }
}
