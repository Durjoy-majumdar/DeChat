package vq1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import te3.C49712hj1;
import u60.C65222f;
import up1.C37521f;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import vp1.C65834e;
import vq1.C65866w;

/* renamed from: vq1.g */
public final class C65854g {

    /* renamed from: e */
    public static final C65854g f189373e = new C65854g();

    /* renamed from: a */
    public C65222f<C65856h> f189374a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finder_action_fav_post_quene"));

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C14961i> f189375b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public final ConcurrentHashMap<Long, C52983e> f189376c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final Runnable f189377d = new C65855a(this);

    /* renamed from: vq1.g$a */
    public static final class C65855a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65854g f189378d;

        public C65855a(C65854g gVar) {
            this.f189378d = gVar;
        }

        public final void run() {
            this.f189378d.mo89895e();
        }
    }

    /* renamed from: a */
    public static void m77575a(C65854g gVar, FinderItem finderItem, boolean z, int i, C65866w.C14969b bVar, C49712hj1 hj12, int i2, int i3, Object obj) {
        C65854g gVar2 = gVar;
        FinderItem finderItem2 = finderItem;
        C65866w.C14969b bVar2 = (i3 & 8) != 0 ? null : bVar;
        int i4 = (i3 & 32) != 0 ? 0 : i2;
        gVar.getClass();
        C87412m.m108594g(finderItem, "feed");
        C49712hj1 hj13 = hj12;
        C87412m.m108594g(hj13, "contextObj");
        StringBuilder sb = new StringBuilder();
        sb.append("dolike ");
        sb.append(finderItem.getUserName());
        sb.append(' ');
        boolean z2 = z;
        sb.append(z2);
        Log.m105924i("Finder.FavActionMgr", sb.toString());
        long j = finderItem2.field_id;
        C52983e eVar = new C52983e(finderItem, j, finderItem.getObjectNonceId(), z2, i, bVar2, hj13, i4);
        gVar2.f189376c.put(Long.valueOf(j), eVar);
        gVar2.f189374a.mo89349c(new C65856h(eVar), new C65853f(gVar, eVar));
    }

    /* renamed from: b */
    public final int mo89892b(FinderObject finderObject) {
        FinderItem e;
        FinderObject feedObject;
        C87412m.m108594g(finderObject, "f");
        if (finderObject.f164794id == 0) {
            return finderObject.likeCount;
        }
        C37521f.f99374d.getClass();
        boolean z = false;
        if (!(!(C37521f.f99511s4.mo60266n().intValue() == 1) || (e = C65834e.f189316a.mo89871e(finderObject.f164794id)) == null || (feedObject = e.getFeedObject()) == null)) {
            finderObject = feedObject;
        }
        if (finderObject.favFlag == 1) {
            z = true;
        }
        C52983e eVar = this.f189376c.get(Long.valueOf(finderObject.f164794id));
        boolean z2 = eVar != null ? eVar.f147883f : z;
        return (!z || z == z2) ? (z || z == z2) ? finderObject.favCount : finderObject.favCount + 1 : finderObject.favCount - 1;
    }

    /* renamed from: c */
    public final boolean mo89893c(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feed");
        long j = finderObject.f164794id;
        boolean z = false;
        if (j == 0) {
            return finderObject.favFlag == 1;
        }
        if (finderObject.favFlag == 1) {
            z = true;
        }
        C52983e eVar = this.f189376c.get(Long.valueOf(j));
        if (eVar != null) {
            z = eVar.f147883f;
        }
        if (BuildInfo.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("isLike test ");
            sb.append(finderObject.f164794id);
            sb.append(" isLike:");
            C52983e eVar2 = this.f189376c.get(Long.valueOf(finderObject.f164794id));
            sb.append(eVar2 != null ? Boolean.valueOf(eVar2.f147883f) : null);
            sb.append(" favFlag:");
            sb.append(finderObject.favFlag);
            sb.append(" result:");
            sb.append(z);
            Log.m105924i("Finder.FavActionMgr", sb.toString());
        }
        return z;
    }

    /* renamed from: d */
    public final void mo89894d(C52983e eVar) {
        C87412m.m108594g(eVar, "action");
        C52983e eVar2 = this.f189376c.get(Long.valueOf(eVar.f147881d));
        if (eVar2 != null) {
            if (BuildInfo.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeLikeCache ");
                sb.append(eVar);
                sb.append(" result ");
                sb.append(eVar.f41018b >= eVar2.f41018b);
                Log.m105924i("Finder.FavActionMgr", sb.toString());
            }
            if (eVar.f41018b >= eVar2.f41018b) {
                this.f189376c.remove(Long.valueOf(eVar.f147881d));
            }
        }
    }

    /* renamed from: e */
    public final void mo89895e() {
        if (this.f189375b.size() > 0) {
            C14961i poll = this.f189375b.poll();
            boolean b = poll.mo14011b();
            Log.m105924i("Finder.FavActionMgr", "tryNext isValid:" + b + " action:" + poll + " size:" + this.f189375b.size());
            if (!b) {
                mo89895e();
            } else {
                this.f189374a.mo89349c(new C65856h(poll), new C65853f(this, poll));
            }
        }
    }
}
