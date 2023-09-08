package rj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import androidx.lifecycle.C39622i0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tav.core.AssetExtension;
import d03.C58010a;
import d14.C58050i1;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gk2.C59528a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j03.C60695a;
import j03.C60700d;
import j03.C60710e;
import java.io.File;
import o40.C61926c;
import p206nj.C11171e;
import p288a6.C53978d;
import p388v5.C22714a;
import pu0.C110248b;
import q13.C62579a;
import r13.C63356a;
import r13.C63357b;
import r13.C63358c;
import rx3.C13598b0;
import t13.C48532a;
import ve3.C65679e0;
import ve3.C65680f;
import ve3.C65686z0;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: rj2.c */
public final class C63451c extends C39622i0 {

    /* renamed from: d */
    public C0000n0 f179975d;

    /* renamed from: e */
    public final C58087u0<C63452a.C63453a> f179976e;

    /* renamed from: f */
    public final C58050i1<C63452a.C63453a> f179977f;

    /* renamed from: g */
    public C58087u0<C63452a.C63454b> f179978g;

    /* renamed from: h */
    public final C58050i1<C63452a.C63454b> f179979h;

    /* renamed from: i */
    public long f179980i;

    /* renamed from: j */
    public C60700d f179981j;

    /* renamed from: n */
    public C63357b f179982n;

    /* renamed from: o */
    public C66132f f179983o;

    /* renamed from: p */
    public C53973z1 f179984p;

    /* renamed from: q */
    public boolean f179985q;

    /* renamed from: r */
    public boolean f179986r;

    /* renamed from: s */
    public boolean f179987s;

    /* renamed from: rj2.c$a */
    public static abstract class C63452a {

        /* renamed from: rj2.c$a$a */
        public static final class C63453a extends C63452a {

            /* renamed from: a */
            public final long f179988a;

            /* renamed from: b */
            public final int f179989b;

            public C63453a(long j, int i) {
                super((C8480h) null);
                this.f179988a = j;
                this.f179989b = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C63453a)) {
                    return false;
                }
                C63453a aVar = (C63453a) obj;
                return this.f179988a == aVar.f179988a && this.f179989b == aVar.f179989b;
            }

            public int hashCode() {
                long j = this.f179988a;
                return (((int) (j ^ (j >>> 32))) * 31) + this.f179989b;
            }

            public String toString() {
                return "onNewState(id=" + this.f179988a + ", uiState=" + this.f179989b + ')';
            }
        }

        /* renamed from: rj2.c$a$b */
        public static final class C63454b extends C63452a {

            /* renamed from: a */
            public final long f179990a;

            /* renamed from: b */
            public final C66132f f179991b;

            /* renamed from: c */
            public final int f179992c;

            public C63454b(long j, C66132f fVar, int i) {
                super((C8480h) null);
                this.f179990a = j;
                this.f179991b = fVar;
                this.f179992c = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C63454b)) {
                    return false;
                }
                C63454b bVar = (C63454b) obj;
                return this.f179990a == bVar.f179990a && C87412m.m108589b(this.f179991b, bVar.f179991b) && this.f179992c == bVar.f179992c;
            }

            public int hashCode() {
                long j = this.f179990a;
                int i = ((int) (j ^ (j >>> 32))) * 31;
                C66132f fVar = this.f179991b;
                return ((i + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.f179992c;
            }

            public String toString() {
                return "onPlay(id=" + this.f179990a + ", desc=" + this.f179991b + ", state=" + this.f179992c + ')';
            }
        }

        public C63452a(C8480h hVar) {
        }
    }

    /* renamed from: rj2.c$b */
    public static final class C63455b extends C87413o implements C32226l<C60695a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63451c f179993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63455b(C63451c cVar) {
            super(1);
            this.f179993d = cVar;
        }

        public Object invoke(Object obj) {
            C22714a aVar;
            C87412m.m108594g((C60695a) obj, LocaleUtil.ITALIAN);
            C63451c cVar = this.f179993d;
            ((C58052j1) cVar.f179976e).setValue(new C63452a.C63453a(cVar.f179980i, 3));
            ((C58052j1) this.f179993d.f179978g).setValue(new C63452a.C63454b(0, (C66132f) null, 3));
            C63357b bVar = this.f179993d.f179982n;
            if (!(bVar == null || (aVar = bVar.f179726a) == null)) {
                C53978d dVar = aVar.f65297b;
                if (dVar != null) {
                    dVar.pause();
                }
                C53978d dVar2 = aVar.f65297b;
                if (dVar2 != null) {
                    dVar2.mo37104c();
                }
                C53978d dVar3 = aVar.f65297b;
                if (dVar3 != null) {
                    dVar3.release();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj2.c$c */
    public static final class C63456c extends C87413o implements C32226l<C60700d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63451c f179994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63456c(C63451c cVar) {
            super(1);
            this.f179994d = cVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60700d) obj, LocaleUtil.ITALIAN);
            C63451c cVar = this.f179994d;
            ((C58052j1) cVar.f179976e).setValue(new C63452a.C63453a(cVar.f179980i, 2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj2.c$d */
    public static final class C63457d extends C87413o implements C32227p<String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66132f f179995d;

        /* renamed from: e */
        public final /* synthetic */ C63451c f179996e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63457d(C66132f fVar, C63451c cVar) {
            super(2);
            this.f179995d = fVar;
            this.f179996e = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            if (((Number) obj2).intValue() != 0 && this.f179995d.f190077C) {
                Log.m105920e("MicroMsg.RingtonePlayerFlow", "onPlayMusicError, try switch to video!");
                C66132f fVar = this.f179995d;
                C58010a aVar = fVar.f190078a;
                if (aVar != null) {
                    aVar.f165946r = null;
                }
                fVar.mo90182m(false);
                this.f179996e.mo88320g3();
                this.f179996e.mo88317d3(this.f179995d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj2.c$e */
    public static final class C63458e implements C62579a {

        /* renamed from: a */
        public final /* synthetic */ C63451c f179997a;

        public C63458e(C63451c cVar) {
            this.f179997a = cVar;
        }

        public final int getCurrentPosition() {
            C60700d dVar = this.f179997a.f179981j;
            if (dVar != null) {
                return (int) dVar.getCurrentPositionMs();
            }
            return 0;
        }
    }

    public C63451c(C0000n0 n0Var) {
        C87412m.m108594g(n0Var, "lifeCycleScope");
        this.f179975d = n0Var;
        C58087u0<C63452a.C63453a> a = C58056k1.m67214a(new C63452a.C63453a(0, 3));
        this.f179976e = a;
        this.f179977f = a;
        C58087u0<C63452a.C63454b> a2 = C58056k1.m67214a(new C63452a.C63454b(0, (C66132f) null, 1));
        this.f179978g = a2;
        this.f179979h = a2;
    }

    /* renamed from: c3 */
    public final void mo88316c3() {
        C22714a aVar;
        C60700d dVar = this.f179981j;
        if (dVar != null) {
            try {
                dVar.mo85609g();
                C60700d dVar2 = this.f179981j;
                if (dVar2 != null) {
                    C60695a.C60696a.m71001d(dVar2, (C32224a) null, 1, (Object) null);
                }
                C60700d dVar3 = this.f179981j;
                if (dVar3 != null) {
                    dVar3.stopAsync();
                }
                C63357b bVar = this.f179982n;
                if (!(bVar == null || (aVar = bVar.f179726a) == null)) {
                    C53978d dVar4 = aVar.f65297b;
                    if (dVar4 != null) {
                        dVar4.pause();
                    }
                    C53978d dVar5 = aVar.f65297b;
                    if (dVar5 != null) {
                        dVar5.mo37104c();
                    }
                    C53978d dVar6 = aVar.f65297b;
                    if (dVar6 != null) {
                        dVar6.release();
                    }
                }
                C60700d dVar7 = this.f179981j;
                if (dVar7 != null) {
                    dVar7.recycle();
                }
                this.f179981j = null;
                Log.m105924i("MicroMsg.RingtonePlayerFlow", "Player destroyed");
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f179981j = null;
                throw th;
            }
            this.f179981j = null;
        }
    }

    /* renamed from: d3 */
    public final void mo88317d3(C66132f fVar) {
        C87412m.m108594g(fVar, "tpMediaInfo");
        Log.m105924i("MicroMsg.RingtonePlayerFlow", "initPlayer is " + fVar.mo90183n());
        this.f179983o = fVar;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f179981j = new C60700d(context);
        C58010a aVar = fVar.f190078a;
        boolean z = true;
        if (aVar != null) {
            Log.m105924i("MicroMsg.RingtonePlayerFlow", "setMediaInfo to play " + C66132f.f190074D.mo90185b(aVar) + ", ringWithLoop:" + this.f179986r);
            C60700d dVar = this.f179981j;
            if (dVar != null) {
                dVar.setMediaInfo(aVar);
            }
            C60700d dVar2 = this.f179981j;
            if (dVar2 != null) {
                dVar2.setLoop(this.f179986r);
            }
            C60700d dVar3 = this.f179981j;
            if (dVar3 != null) {
                dVar3.f172880k = true;
            }
            if (dVar3 != null) {
                dVar3.f172869F = fVar.f190079b;
            }
            if (dVar3 != null) {
                dVar3.mo85603a(fVar.f190079b, fVar.f190080c);
            }
        }
        C60700d dVar4 = this.f179981j;
        if (dVar4 != null) {
            dVar4.f172886q = new C63455b(this);
        }
        C60700d dVar5 = this.f179981j;
        if (dVar5 != null) {
            dVar5.f172883n = new C63456c(this);
            if (dVar5.isPlaying()) {
                C61926c.m72668M(new C60710e(dVar5));
            }
        }
        C60700d dVar6 = this.f179981j;
        C22714a aVar2 = null;
        C60700d.C60701a aVar3 = dVar6 != null ? dVar6.f172876g : null;
        if (aVar3 != null) {
            aVar3.f172902j = new C63457d(fVar, this);
        }
        if (this.f179985q) {
            this.f179982n = new C63357b();
        }
        C66132f fVar2 = this.f179983o;
        if ((fVar2 != null ? fVar2.mo90178i().f170149a : null) == null) {
            C65686z0 z0Var = new C65686z0();
            C65680f fVar3 = new C65680f();
            fVar3.f188983d = fVar.f190092o;
            fVar3.f188984e = fVar.f190093p;
            z0Var.f189029f = fVar3;
            C65679e0 e0Var = new C65679e0();
            e0Var.f188982d = fVar.f190094q;
            z0Var.f189028e = e0Var;
            C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c), (C66212f) null, (C53934p0) null, new C48532a(z0Var, (C15601d<? super C48532a>) null), 3, (Object) null);
        }
        C66132f fVar4 = this.f179983o;
        if (fVar4 != null) {
            C59528a i = fVar4.mo90178i();
            C63357b bVar = this.f179982n;
            boolean z2 = false;
            if (bVar != null) {
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                C63458e eVar = new C63458e(this);
                String a = C110248b.f329777h.mo161656a();
                if (C87412m.m108589b(a, "vibrate") || C87412m.m108589b(a, "normal")) {
                    if (C11171e.m11046c(26)) {
                        if (C63358c.m74699a() ? false : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ringtone_preview_can_vibrate, true)) {
                            String str = i.f170149a;
                            String str2 = i.f170150b;
                            if (!(str == null || str2 == null)) {
                                C22714a a2 = C22714a.m26598a(context2);
                                if (a2 != null) {
                                    File file = new File(C63358c.m74701e(str, str2, false));
                                    C63356a aVar4 = new C63356a(eVar);
                                    C53978d dVar7 = a2.f65297b;
                                    if (dVar7 != null) {
                                        dVar7.mo37105d(file, 255, 50, aVar4);
                                    }
                                    C53978d dVar8 = a2.f65297b;
                                    if (dVar8 != null) {
                                        dVar8.prepare();
                                    }
                                    C53978d dVar9 = a2.f65297b;
                                    if (dVar9 != null) {
                                        dVar9.mo37103b(true);
                                    }
                                    C53978d dVar10 = a2.f65297b;
                                    if (dVar10 != null) {
                                        dVar10.start();
                                    }
                                    aVar2 = a2;
                                }
                                bVar.f179726a = aVar2;
                            }
                            z2 = z;
                        }
                    }
                    z = false;
                    z2 = z;
                } else {
                    Log.m105920e("MicroMsg.VibratePlayer", "forbidden vibrate cause system setting no vibrate");
                }
            }
            this.f179987s = z2;
        }
        Log.m105924i("MicroMsg.RingtonePlayerFlow", AssetExtension.SCENE_PLAY);
        try {
            C60700d dVar11 = this.f179981j;
            if (dVar11 != null) {
                C60695a.C60696a.m70999b(dVar11, 0, false, (C32226l) null, 6, (Object) null);
            }
            C60700d dVar12 = this.f179981j;
            if (dVar12 != null) {
                dVar12.mo85619m();
            }
        } catch (Exception unused) {
            mo88316c3();
        }
    }

    /* renamed from: e3 */
    public final void mo88318e3(C66132f fVar, long j, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append("requestPlayFlow, id:");
        sb.append(j);
        sb.append(", play:");
        sb.append(z);
        sb.append(", withVibrate:");
        sb.append(z2);
        sb.append(", info:");
        sb.append(fVar != null ? fVar.f190078a : null);
        Log.m105924i("MicroMsg.RingtonePlayerFlow", sb.toString());
        this.f179985q = z2;
        this.f179986r = z3;
        ((C58052j1) this.f179978g).setValue(new C63452a.C63454b(j, fVar, z ? 2 : 3));
    }

    /* renamed from: f3 */
    public final void mo88319f3() {
        Log.m105924i("MicroMsg.RingtonePlayerFlow", "requestStopPlay");
        mo88320g3();
        ((C58052j1) this.f179978g).setValue(new C63452a.C63454b(0, (C66132f) null, 3));
    }

    /* renamed from: g3 */
    public final void mo88320g3() {
        C22714a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("stop play sync id is");
        sb.append(this.f179980i);
        sb.append(" and ");
        C66132f fVar = this.f179983o;
        sb.append(fVar != null ? fVar.mo90183n() : null);
        Log.m105924i("MicroMsg.RingtonePlayerFlow", sb.toString());
        C60700d dVar = this.f179981j;
        if (dVar != null) {
            dVar.f172883n = null;
            boolean isPlaying = dVar.isPlaying();
        }
        C60700d dVar2 = this.f179981j;
        if (dVar2 != null) {
            dVar2.f172886q = null;
        }
        if (dVar2 != null) {
            dVar2.f172887r = null;
            if (dVar2.f172867D.f171744k != 1000) {
            }
        }
        C63357b bVar = this.f179982n;
        if (!(bVar == null || (aVar = bVar.f179726a) == null)) {
            C53978d dVar3 = aVar.f65297b;
            if (dVar3 != null) {
                dVar3.pause();
            }
            C53978d dVar4 = aVar.f65297b;
            if (dVar4 != null) {
                dVar4.mo37104c();
            }
            C53978d dVar5 = aVar.f65297b;
            if (dVar5 != null) {
                dVar5.release();
            }
        }
        C60700d dVar6 = this.f179981j;
        if (dVar6 != null) {
            dVar6.mo85609g();
        }
        C60700d dVar7 = this.f179981j;
        if (dVar7 != null) {
            C60695a.C60696a.m71001d(dVar7, (C32224a) null, 1, (Object) null);
        }
        C60700d dVar8 = this.f179981j;
        if (dVar8 != null) {
            dVar8.stop();
        }
        C60700d dVar9 = this.f179981j;
        if (dVar9 != null) {
            dVar9.recycle();
        }
    }
}
