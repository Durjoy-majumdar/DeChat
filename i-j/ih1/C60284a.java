package ih1;

import a14.C0000n0;
import a14.C53934p0;
import al1.C54130j;
import android.os.Bundle;
import c50.C54655b;
import cl1.C54949c0;
import cl1.C54963d0;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import d60.C58124b;
import fy3.C32227p;
import gh1.C8313a;
import gi1.C59463a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import n50.C61613a;
import n50.C61619b;
import n50.C61620c;
import n50.C61623d;
import nk1.C11207i;
import o40.C61926c;
import qj1.C63068w1;
import rx3.C13598b0;
import rx3.C13600d;
import sx3.C64197v;
import te3.C48742ao0;
import te3.C51887ww2;
import te3.C52005xq0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ih1.a */
public final class C60284a extends C8313a {

    /* renamed from: j */
    public Integer f171902j;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.mic.AnchorMicCloudController$onLiveStart$1", mo125469f = "AnchorMicCloudController.kt", mo125470l = {92}, mo125471m = "invokeSuspend")
    /* renamed from: ih1.a$a */
    public static final class C60285a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f171903d;

        /* renamed from: e */
        public final /* synthetic */ C60284a f171904e;

        /* renamed from: ih1.a$a$a */
        public static final class C60286a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C60284a f171905d;

            public C60286a(C60284a aVar) {
                this.f171905d = aVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                String str = (String) obj;
                Log.m105924i("AnchorMicCloudController", "liveMicAutoAcceptLiveData collect sessionId " + str);
                C63068w1 w1Var = (C63068w1) this.f171905d.mo9307d3(C63068w1.class);
                if (w1Var != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("PARAM_FINDER_LIVE_MIC_ID", str);
                    w1Var.f178987p.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_ANCHOR_ACCEPT, bundle);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60285a(C60284a aVar, C15601d<? super C60285a> dVar) {
            super(2, dVar);
            this.f171904e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60285a(this.f171904e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C60285a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f171903d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<String> u0Var = ((C54963d0) this.f171904e.business(C54963d0.class)).f154083z;
                C60286a aVar2 = new C60286a(this.f171904e);
                this.f171903d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60284a(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo85273m3(C54655b bVar, int i, String str) {
        if (bVar != null) {
            C61623d X = bVar.mo85680X();
            X.getClass();
            Log.m105925i("MicroMsg.LiveCoreVisitor", "onMicForceSelectUserId forceUserId:%s", str);
            X.f175247m = str;
            X.f175248n = i;
            C61613a aVar = X.f175245k;
            aVar.getClass();
            C87412m.m108594g(str, "forceUserId");
            aVar.f175207d = i;
            aVar.f175206c = str;
            X.mo86572o(false);
        }
    }

    /* renamed from: n3 */
    public final void mo85274n3(Bundle bundle, C54655b bVar) {
        String str;
        C61619b bVar2;
        if (bundle == null || (str = bundle.getString("PARAM_FINDER_LIVE_FORCE_USER_ID")) == null) {
            str = "";
        }
        int i = 0;
        int i2 = bundle != null ? bundle.getInt("PARAM_FINDER_LIVE_MIC_MODE") : 0;
        if (bundle != null) {
            bundle.getInt("PARAM_FINDER_LIVE_MIC_ANCHOR_POSITION");
        }
        String str2 = ((C55001u) business(C55001u.class)).f154419p.f182319n;
        if (str2 == null) {
            str2 = "";
        }
        for (T next : ((C54949c0) business(C54949c0.class)).f153996f) {
            int i3 = i + 1;
            T t = null;
            if (i >= 0) {
                C59463a aVar = (C59463a) next;
                ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
                C87412m.m108593f(arrayList, "getInstance().remoteUserConfigList");
                Iterator<C61619b> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar2 = null;
                        break;
                    }
                    bVar2 = it.next();
                    if (C87412m.m108589b(bVar2.f175221d, aVar.mo84561a())) {
                        break;
                    }
                }
                C61619b bVar3 = bVar2;
                if (bVar3 != null) {
                    bVar3.f175228n = aVar.f169895b.f169901e;
                }
                List<C54130j> list = ((C54963d0) business(C54963d0.class)).f154074q;
                C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                synchronized (list) {
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        T next2 = it4.next();
                        if (C87412m.m108589b(((C54130j) next2).f151997a, aVar.mo84561a())) {
                            t = next2;
                            break;
                        }
                    }
                }
                C54130j jVar = (C54130j) t;
                if (jVar != null) {
                    jVar.f152019w = aVar.f169895b.f169901e;
                }
                if (C87412m.m108589b(aVar.mo84561a(), str2)) {
                    C61620c cVar = C61620c.C61622b.f175234a;
                    int i4 = aVar.f169895b.f169901e;
                    int size = cVar.f175229a.size();
                    cVar.f175230b = i4;
                    cVar.f175231c = size;
                }
                i = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        mo85273m3(bVar, i2, str);
    }

    public void onLiveActivate() {
    }

    public void onLiveMsg(C48742ao0 ao02) {
        C51887ww2 ww22;
        super.onLiveMsg(ao02);
        if (this.f171902j == null && (ww22 = ((C54963d0) business(C54963d0.class)).f154048B) != null) {
            int i = (int) ww22.f144323d;
            int i2 = C61926c.m72696u(i, 32) ? 3 : C61926c.m72696u(i, 64) ? 4 : 1;
            this.f171902j = Integer.valueOf(i2);
            Log.m105924i("AnchorMicCloudController", "onLiveMsg first onMicModeChange currentMicMode: " + i2);
            C54655b b = FinderLiveService.f159376d.mo77626b();
            String str = ((C55001u) business(C55001u.class)).f154419p.f182319n;
            if (str == null) {
                str = "";
            }
            mo85273m3(b, i2, str);
        }
    }

    public void onLiveStart(C52005xq0 xq02) {
        super.onLiveStart(xq02);
        C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C60285a(this, (C15601d<? super C60285a>) null), 3, (Object) null);
    }
}
