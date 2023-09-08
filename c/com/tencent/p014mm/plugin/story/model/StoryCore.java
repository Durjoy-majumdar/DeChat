package com.tencent.p014mm.plugin.story.model;

import android.content.Context;
import android.graphics.Point;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.plugin.story.PluginStory;
import com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import cw2.C97386j;
import cw2.C97391o;
import cw2.C97395q;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ew2.C97758b;
import f40.C86709a0;
import fw2.C98059c;
import fw2.C98060d;
import gy3.C87412m;
import hw2.C98557b;
import java.util.HashMap;
import k60.C60979d;
import kotlin.Metadata;
import kw2.C34075d;
import kw2.C34077l;
import kw2.C99262a;
import kw2.C99265f;
import kw2.C99267h;
import kw2.C99269j;
import kw2.C99270n;
import o40.C61926c;
import xv2.C102775d;
import z04.C112550d0;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.story.model.StoryCore */
public final class StoryCore extends C86301e {

    /* renamed from: t */
    public static final C96337h f281736t = new C96337h();

    /* renamed from: u */
    public static final String f281737u = "MicroMsg.StoryCore";

    /* renamed from: v */
    public static final IListener<ExptChangeEvent> f281738v = new StoryCore$Companion$exptChangeListener$1(C40008f.f107254d);

    /* renamed from: w */
    public static long f281739w = -1;

    /* renamed from: d */
    public boolean f281740d;

    /* renamed from: e */
    public HashMap<Integer, C91753f.C66827b> f281741e = new HashMap<>();

    /* renamed from: f */
    public C99269j f281742f;

    /* renamed from: g */
    public C99265f f281743g;

    /* renamed from: h */
    public C34077l f281744h;

    /* renamed from: i */
    public C99262a f281745i;

    /* renamed from: j */
    public C99270n f281746j;

    /* renamed from: n */
    public C99267h f281747n;

    /* renamed from: o */
    public C98060d f281748o;

    /* renamed from: p */
    public C97395q f281749p;

    /* renamed from: q */
    public PluginStory.StorySynclistener f281750q = new PluginStory.StorySynclistener();

    /* renamed from: r */
    public ConfigChangedListener f281751r = new ConfigChangedListener();

    /* renamed from: s */
    public volatile C91753f f281752s;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/model/StoryCore$ConfigChangedListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DynamicConfigUpdatedEvent;", "<init>", "(Lcom/tencent/mm/plugin/story/model/StoryCore;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$ConfigChangedListener */
    public final class ConfigChangedListener extends IListener<DynamicConfigUpdatedEvent> {
        public ConfigChangedListener() {
            super(C40008f.f107254d);
        }

        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((DynamicConfigUpdatedEvent) iEvent, "event");
            Log.m105924i(StoryCore.f281737u, "dynamicCfg changed, will loadConfig.");
            StoryCore.this.getClass();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$e */
    public static final class C30475e implements C91753f.C66827b {

        /* renamed from: a */
        public static final C30475e f82136a = new C30475e();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C34075d.f91948d;
            return C34075d.f91948d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$f */
    public static final class C30476f implements C91753f.C66827b {

        /* renamed from: a */
        public static final C30476f f82137a = new C30476f();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C34077l.f91950e;
            return C34077l.f91950e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$a */
    public static final class C96332a implements C91753f.C66827b {

        /* renamed from: a */
        public static final C96332a f281753a = new C96332a();

        /* renamed from: a */
        public final String[] mo6410a() {
            C99269j.C10425a aVar = C99269j.f291079j;
            return C99269j.f291088v;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$b */
    public static final class C96333b implements C91753f.C66827b {

        /* renamed from: a */
        public static final C96333b f281754a = new C96333b();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C99265f.f291060i;
            return C99265f.f291060i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$c */
    public static final class C96334c implements C91753f.C66827b {

        /* renamed from: a */
        public static final C96334c f281755a = new C96334c();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C99262a.f291052e;
            return C99262a.f291052e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$d */
    public static final class C96335d implements C91753f.C66827b {

        /* renamed from: a */
        public static final C96335d f281756a = new C96335d();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C99270n.f291095e;
            return C99270n.f291095e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$g */
    public static final class C96336g implements C91753f.C66827b {

        /* renamed from: a */
        public static final C96336g f281757a = new C96336g();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C99267h.f291070e;
            return C99267h.f291070e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.StoryCore$h */
    public static final class C96337h {
        /* renamed from: a */
        public final String mo134183a() {
            String YT = ((C102775d) C86312j.m106911c(C102775d.class)).mo134169YT();
            C87412m.m108593f(YT, "getService(IPluginStory:…s.java).accStoryCachePath");
            return YT;
        }

        /* renamed from: b */
        public final String mo134184b() {
            String rA = ((C102775d) C86312j.m106911c(C102775d.class)).mo134174rA();
            C87412m.m108593f(rA, "getService(IPluginStory::class.java).accStoryPath");
            return rA;
        }

        /* renamed from: c */
        public final StoryCore mo134185c() {
            StoryCore storyCore = (StoryCore) C86312j.m106911c(StoryCore.class);
            C87412m.m108593f(storyCore, "theCore");
            return storyCore;
        }

        /* renamed from: d */
        public final C91753f mo134186d() {
            StoryCore c = mo134185c();
            C91753f fVar = c.f281752s;
            if (fVar == null) {
                synchronized (this) {
                    StoryCore.vx0(c);
                    fVar = c.f281752s;
                }
            }
            C87412m.m108591d(fVar);
            return fVar;
        }

        /* renamed from: e */
        public final String mo134187e() {
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            if (str == null) {
                String str2 = StoryCore.f281737u;
                Log.m105924i(str2, "error getSelfName " + Util.getStack());
            }
            return str == null ? "" : str;
        }

        /* renamed from: f */
        public final C99262a mo134188f() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281745i == null) {
                mo134185c().f281745i = new C99262a(mo134186d());
            }
            C99262a aVar = mo134185c().f281745i;
            C87412m.m108591d(aVar);
            return aVar;
        }

        /* renamed from: g */
        public final C99265f mo134189g() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281743g == null) {
                mo134185c().f281743g = new C99265f(mo134186d());
            }
            C99265f fVar = mo134185c().f281743g;
            C87412m.m108591d(fVar);
            return fVar;
        }

        /* renamed from: h */
        public final C99267h mo134190h() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281747n == null) {
                mo134185c().f281747n = new C99267h(mo134186d());
            }
            C99267h hVar = mo134185c().f281747n;
            C87412m.m108591d(hVar);
            return hVar;
        }

        /* renamed from: i */
        public final C99269j mo134191i() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281742f == null) {
                mo134185c().f281742f = new C99269j(mo134186d());
            }
            C99269j jVar = mo134185c().f281742f;
            C87412m.m108591d(jVar);
            return jVar;
        }

        /* renamed from: j */
        public final C97395q mo134192j() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281749p == null) {
                mo134185c().f281749p = new C97395q();
            }
            C97395q qVar = mo134185c().f281749p;
            C87412m.m108591d(qVar);
            return qVar;
        }

        /* renamed from: k */
        public final C99270n mo134193k() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281746j == null) {
                mo134185c().f281746j = new C99270n(mo134186d());
            }
            C99270n nVar = mo134185c().f281746j;
            C87412m.m108591d(nVar);
            return nVar;
        }

        /* renamed from: l */
        public final MMHandler mo134194l() {
            MMHandler workerHandler = C86709a0.m107525e().getWorkerHandler();
            C87412m.m108593f(workerHandler, "getPizzaWorkerThread().workerHandler");
            return workerHandler;
        }

        /* renamed from: m */
        public final C60979d<C98059c> mo134195m() {
            C86709a0.m107523b().mo121108c();
            if (mo134185c().f281748o == null) {
                mo134185c().f281748o = new C98060d();
            }
            C98060d dVar = mo134185c().f281748o;
            C87412m.m108591d(dVar);
            return dVar.f287508a;
        }
    }

    static {
        new Point();
    }

    public StoryCore() {
        this.f281741e.put(541145475, C96332a.f281753a);
        this.f281741e.put(391276095, C96333b.f281754a);
        this.f281741e.put(-2097386107, C96334c.f281755a);
        this.f281741e.put(1540233546, C96335d.f281756a);
        this.f281741e.put(-860939664, C30475e.f82136a);
        this.f281741e.put(917584926, C30476f.f82137a);
        this.f281741e.put(2106223442, C96336g.f281757a);
    }

    public static final void vx0(StoryCore storyCore) {
        if (storyCore.f281752s == null) {
            storyCore.f281752s = new C91753f();
            String str = C86709a0.m107535s().f251807e + "StoryMicroMsg.db";
            C91753f fVar = storyCore.f281752s;
            C87412m.m108591d(fVar);
            if (!fVar.mo125626p(str, storyCore.f281741e, true, true)) {
                String str2 = f281737u;
                Log.m105924i(str2, "removeDirtyDB.");
                String str3 = C86709a0.m107535s().f251807e;
                C87412m.m108593f(str3, "storage().cachePath");
                Iterable<C86001b0> t = C86013q1.m106459t(str3, false);
                if (t == null) {
                    Log.m105920e(str2, "removeDirtyDB files null");
                    return;
                }
                for (C86001b0 next : t) {
                    if (!next.f250476f) {
                        String str4 = next.f250472b;
                        C87412m.m108593f(str4, "fe.name");
                        if (C112550d0.m153801u(str4, "StoryMicroMsg", false)) {
                            Log.m105925i(f281737u, "removeDirtyDB will delete:%s", next.f250471a);
                            next.mo119954a();
                        }
                    }
                }
            }
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        if (!this.f281740d) {
            this.f281740d = true;
            Class cls = C102775d.class;
            C86013q1.m106461v(((C102775d) C86312j.m106911c(cls)).mo134174rA());
            C86013q1.m106461v(((C102775d) C86312j.m106911c(cls)).mo134165Sf());
            this.f281750q.alive();
            C30650a.m39147b(new C97386j(), "//story");
            C96337h hVar = f281736t;
            C99265f g = hVar.mo134189g();
            g.add(g);
            C97758b bVar = C97758b.f286820d;
            String str = C97758b.f286821e;
            if (C86013q1.m106450k(str)) {
                String str2 = C97758b.f286822f;
                if (!C86013q1.m106450k(str2)) {
                    C86013q1.m106463x(str, str2);
                }
            }
            boolean z = false;
            byte[] O = C86013q1.m106433O(C97758b.f286822f, 0, -1);
            if (O != null) {
                if (O.length == 0) {
                    z = true;
                }
                if (true ^ z) {
                    C97758b.f286825i.parseFrom(O);
                }
            }
            C86709a0.m107529k().f251779b.mo123455a(C82855e.CTRL_INDEX, bVar);
            C86709a0.m107529k().f251779b.mo123455a(764, bVar);
            bVar.mo137098m();
            ContactSyncFetcher contactSyncFetcher = ContactSyncFetcher.f281758d;
            Log.m105924i("MicroMsg.ContactSyncFetcher", "init: ");
            hVar.mo134189g().add(contactSyncFetcher);
            hVar.mo134191i().add(contactSyncFetcher);
            C61926c.m72666K(1000, C98557b.f289013d);
            ContactSyncFetcher.f281766o.alive();
            bVar.mo137087a(ContactSyncFetcher.f281767p);
            f281738v.alive();
            C97391o oVar = C97391o.f285892a;
            oVar.getClass();
            C97391o.f285893b = "";
            C86013q1.m106461v(oVar.mo136648a() + "coming/");
            C86013q1.m106461v(oVar.mo136648a() + "pic/");
            C86013q1.m106461v(oVar.mo136648a() + "video/");
            this.f281751r.alive();
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        this.f281750q.dead();
        this.f281751r.dead();
        C30650a.m39148c("//story");
        C96337h hVar = f281736t;
        C99265f g = hVar.mo134189g();
        g.remove(g);
        C97758b bVar = C97758b.f286820d;
        C86013q1.m106437S(C97758b.f286822f, C97758b.f286825i.toByteArray());
        C86709a0.m107529k().f251779b.mo123470p(C82855e.CTRL_INDEX, bVar);
        C86709a0.m107529k().f251779b.mo123470p(764, bVar);
        ContactSyncFetcher contactSyncFetcher = ContactSyncFetcher.f281758d;
        Log.m105924i("MicroMsg.ContactSyncFetcher", "destroy: ");
        hVar.mo134189g().remove(contactSyncFetcher);
        hVar.mo134191i().remove(contactSyncFetcher);
        ContactSyncFetcher.f281765n.clear();
        ContactSyncFetcher.f281766o.dead();
        bVar.mo137095j(ContactSyncFetcher.f281767p);
        f281738v.dead();
    }
}
