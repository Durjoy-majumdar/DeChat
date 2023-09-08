package al1;

import cl1.C54991o;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58708d1;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import p749xh.C66261f3;
import te3.C48924by0;
import te3.C49098d51;
import te3.C52153yq0;
import te3.C64254b81;
import te3.C64273c21;
import tf1.C13914m;

/* renamed from: al1.h */
public final class C54127h implements C13914m {

    /* renamed from: n */
    public static final C54128a f151976n = new C54128a((C8480h) null);

    /* renamed from: d */
    public LiveConfig f151977d;

    /* renamed from: e */
    public C45795b f151978e;

    /* renamed from: f */
    public LiveRoomControllerStore f151979f;

    /* renamed from: g */
    public C49098d51 f151980g;

    /* renamed from: h */
    public C52153yq0 f151981h;

    /* renamed from: i */
    public boolean f151982i;

    /* renamed from: j */
    public boolean f151983j;

    /* renamed from: al1.h$a */
    public static final class C54128a {
        public C54128a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C64273c21 mo74921a(C54127h hVar) {
            C48924by0 by02;
            C87412m.m108594g(hVar, "liveData");
            C64273c21 c212 = new C64273c21();
            LiveConfig liveConfig = hVar.f151977d;
            c212.f182392d = liveConfig.f157064e;
            c212.f182395g = liveConfig.f157072p;
            C64254b81 b812 = new C64254b81();
            LiveConfig liveConfig2 = hVar.f151977d;
            b812.f182228d = liveConfig2.f157073q;
            c212.f182401p = b812;
            c212.f182364J = liveConfig2.f157061T;
            c212.f182384X = liveConfig2.f157056N;
            C87412m.m108594g(liveConfig2, "<this>");
            if (liveConfig2.f157057P != 0) {
                by02 = new C48924by0();
                by02.f131380d = liveConfig2.f157057P;
                by02.f131381e = liveConfig2.f157058Q;
                by02.f131382f = liveConfig2.f157059R;
                by02.f131383g = liveConfig2.f157060S;
            } else {
                by02 = null;
            }
            c212.f182402p0 = by02;
            return c212;
        }

        /* renamed from: b */
        public final FinderObject mo74922b(C54127h hVar) {
            C87412m.m108594g(hVar, "liveData");
            FinderObject finderObject = new FinderObject();
            finderObject.liveInfo = C54127h.f151976n.mo74921a(hVar);
            LiveConfig liveConfig = hVar.f151977d;
            finderObject.objectNonceId = liveConfig.f157080x;
            finderObject.f164794id = liveConfig.f157075s;
            finderObject.username = liveConfig.f157069j;
            FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
            finderObjectDesc.description = hVar.f151977d.f157076t;
            LinkedList<FinderMedia> linkedList = new LinkedList<>();
            FinderMedia finderMedia = new FinderMedia();
            finderMedia.thumbUrl = hVar.f151977d.f157068i;
            linkedList.add(finderMedia);
            finderObjectDesc.media = linkedList;
            finderObject.objectDesc = finderObjectDesc;
            LiveConfig liveConfig2 = hVar.f151977d;
            finderObject.sessionBuffer = liveConfig2.f157046D;
            finderObject.nickname = liveConfig2.f157053K;
            return finderObject;
        }
    }

    public C54127h(LiveConfig liveConfig) {
        C87412m.m108594g(liveConfig, "liveConfig");
        C45795b bVar = new C45795b("from LiveData");
        this.f151978e = bVar;
        this.f151979f = new LiveRoomControllerStore(bVar);
        this.f151977d = liveConfig;
    }

    /* renamed from: a */
    public final LiveRoomControllerStore mo74917a() {
        return this.f151979f;
    }

    /* renamed from: b */
    public final String mo74918b() {
        return hashCode() + "_config(haveExposed:" + this.f151982i + "): " + this.f151977d.mo76369b() + " LiveBuContext: " + ((C54991o) this.f151978e.mo71262a(C54991o.class)).mo75987V3();
    }

    /* renamed from: c */
    public final String mo74919c() {
        return "nickName:" + this.f151977d.f157053K + ",havePlay:" + this.f151982i + ",liveId:" + this.f151977d.f157064e + ",objectId:" + this.f151977d.f157075s + "!\n";
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (!(mVar instanceof C54127h)) {
            return -1;
        }
        LiveConfig liveConfig = ((C54127h) mVar).f151977d;
        long j = liveConfig.f157064e;
        LiveConfig liveConfig2 = this.f151977d;
        if (j != liveConfig2.f157064e && liveConfig.f157075s != liveConfig2.f157075s) {
            return -1;
        }
        if (!C58739j4.f168176a.mo83692U()) {
            return 0;
        }
        Log.m105924i("Finder.Loader", "compare feed obj:" + mVar + " is same with this:" + this);
        return 0;
    }

    public String toString() {
        try {
            return mo74918b();
        } catch (Exception e) {
            return e.toString();
        }
    }

    public C54127h(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        C45795b bVar = new C45795b("from LiveData");
        this.f151978e = bVar;
        this.f151979f = new LiveRoomControllerStore(bVar);
        this.f151977d = C58708d1.m68188b(C58708d1.f168058a, finderObject, 0, false, 6, (Object) null);
    }
}
