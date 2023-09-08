package p729vt;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import b60.C28259d;
import b60.C28260e;
import b60.C54427b;
import b60.C54428c;
import c50.C54655b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Random;
import kotlin.ResultKt;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p50.C62197e;
import p744wt.C66190c;
import rx3.C13598b0;
import te3.C49317ep2;
import te3.C64587no2;
import w40.C65927a;
import w50.C65929d;
import w50.C65932f;
import w50.C65933h;
import wx3.C15601d;
import wx3.C66212f;
import x40.C66234a;
import xx3.C15911a;
import y50.C66519j0;
import y50.C66527o;
import yx3.C91590f;
import yx3.C91594j;
import z50.C16103b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: vt.c */
public final class C65877c extends C86301e implements C66190c {

    /* renamed from: d */
    public final HashMap<Long, Integer> f189423d = new HashMap<>();

    @C91590f(mo125468c = "com.tencent.mm.feature.live.LiveLogicFeatureService$onAccountInitialized$1", mo125469f = "LiveLogicFeatureService.kt", mo125470l = {54}, mo125471m = "invokeSuspend")
    /* renamed from: vt.c$a */
    public static final class C65878a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189424d;

        /* renamed from: vt.c$a$a */
        public static final class C65879a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C65879a f189425d = new C65879a();

            public C65879a() {
                super(0);
            }

            public Object invoke() {
                return Boolean.FALSE;
            }
        }

        public C65878a(C15601d<? super C65878a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65878a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C65878a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189424d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65933h hVar = C65933h.f189544a;
                C65933h.C65934a aVar2 = C65933h.C65934a.PluginLive;
                C65879a aVar3 = C65879a.f189425d;
                this.f189424d = 1;
                if (hVar.mo89974d(aVar2, false, aVar3, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vt.c$b */
    public static final class C65880b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ long f189426d;

        /* renamed from: e */
        public final /* synthetic */ C65877c f189427e;

        /* renamed from: f */
        public final /* synthetic */ C65927a f189428f;

        /* renamed from: vt.c$b$a */
        public static final class C65881a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f189429d;

            /* renamed from: e */
            public final /* synthetic */ int f189430e;

            /* renamed from: f */
            public final /* synthetic */ C117747y f189431f;

            /* renamed from: g */
            public final /* synthetic */ long f189432g;

            /* renamed from: h */
            public final /* synthetic */ C65877c f189433h;

            /* renamed from: i */
            public final /* synthetic */ C65927a f189434i;

            /* renamed from: vt.c$b$a$a */
            public static final class C65882a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C65927a f189435d;

                /* renamed from: e */
                public final /* synthetic */ long f189436e;

                /* renamed from: f */
                public final /* synthetic */ C8478d0 f189437f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65882a(C65927a aVar, long j, C8478d0 d0Var) {
                    super(0);
                    this.f189435d = aVar;
                    this.f189436e = j;
                    this.f189437f = d0Var;
                }

                public Object invoke() {
                    C65927a aVar = this.f189435d;
                    if (aVar != null) {
                        aVar.mo82214a(this.f189436e, this.f189437f.f27483d);
                    }
                    return C13598b0.f38549a;
                }
            }

            public C65881a(int i, int i2, C117747y yVar, long j, C65877c cVar, C65927a aVar) {
                this.f189429d = i;
                this.f189430e = i2;
                this.f189431f = yVar;
                this.f189432g = j;
                this.f189433h = cVar;
                this.f189434i = aVar;
            }

            public final void run() {
                C8478d0 d0Var = new C8478d0();
                if (this.f189429d == 0 && this.f189430e == 0) {
                    C117747y yVar = this.f189431f;
                    C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.live.model.cgi.NetSceneGetLiveInfo");
                    C49317ep2 j1 = ((C16103b) yVar).mo14699j1();
                    boolean z = false;
                    if (j1 != null && j1.f133053g == 0) {
                        z = true;
                    }
                    if (!z) {
                        d0Var.f27483d = 1;
                        C28260e.m38144jo().mo55889d(this.f189432g);
                    }
                    this.f189433h.f189423d.put(Long.valueOf(this.f189432g), Integer.valueOf(d0Var.f27483d));
                }
                C61926c.m72668M(new C65882a(this.f189434i, this.f189432g, d0Var));
            }
        }

        public C65880b(long j, C65877c cVar, C65927a aVar) {
            this.f189426d = j;
            this.f189427e = cVar;
            this.f189428f = aVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            yVar.setHasCallbackToQueue(true);
            C119157j jVar = (C119157j) C119157j.f356862d;
            jVar.mo183875f(new C65881a(i, i2, yVar, this.f189426d, this.f189427e, this.f189428f));
        }
    }

    /* renamed from: F */
    public boolean mo89931F() {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (RoomLiveService.f157197h.f133050d != 0) {
            RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
            if (!dVar.f157224a && !dVar.f157226c) {
                if (C54655b.f153178f1 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: JA */
    public void mo89932JA(long j, String str, C65927a aVar) {
        C87412m.m108594g(str, "roomId");
        Integer num = this.f189423d.get(Long.valueOf(j));
        if (num == null || num.intValue() != 1) {
            if (C86709a0.m107524d().f256809d != null) {
                new C16103b(j, str, true).doScene(C86709a0.m107524d().f256809d, new C65880b(j, this, aVar));
            } else if (aVar != null) {
                aVar.mo82214a(j, 0);
            }
        } else if (aVar != null) {
            aVar.mo82214a(j, num.intValue());
        }
    }

    /* renamed from: L5 */
    public boolean mo89933L5() {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (RoomLiveService.f157197h.f133050d != 0) {
            RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
            if (!dVar.f157224a && !dVar.f157226c) {
                if (C62197e.f176819i1 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: OG */
    public C66234a mo89934OG() {
        return C66527o.f191369a;
    }

    public C54427b o40() {
        return C28260e.m38144jo();
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C65878a((C15601d<? super C65878a>) null), 3, (Object) null);
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        if (MMApplicationContext.isMainProcess()) {
            C65929d dVar = C65929d.f189535a;
            C61926c.m72658C((String) null, C65932f.f189543d, 1, (Object) null);
        }
    }

    public void ud0(Context context) {
        boolean z = false;
        Log.printInfoStack("MicroMsg.LiveLogicFeatureService", "forceStopCurLive", new Object[0]);
        if (C54655b.f153178f1 != null) {
            C66519j0.f191358d.mo90597a(false);
            C54428c cVar = C54428c.f152656a;
            Log.m105924i("MicroMsg.LiveAnchorStorage", "liveAnchorInfo cleanCache");
            C64587no2 no22 = new C64587no2();
            no22.f184522d = 0;
            no22.f184523e = "";
            no22.f184524f = -1;
            no22.f184525g = "";
            no22.f184526h = 0;
            no22.f184527i = "";
            byte[] byteArray = no22.toByteArray();
            C86013q1.m106437S(C54428c.f152657b + C54428c.f152658c, byteArray);
            if (C54655b.f153178f1 == null) {
                C54655b.f153178f1 = new C54655b();
            }
            C87412m.m108591d(C54655b.f153178f1);
        } else {
            if (C62197e.f176819i1 != null) {
                z = true;
            }
            if (z) {
                if (C62197e.f176819i1 == null) {
                    C62197e.f176819i1 = new C62197e();
                }
                C87412m.m108591d(C62197e.f176819i1);
            }
        }
        RoomLiveService.f157190a.mo76444b();
    }

    /* renamed from: zB */
    public void mo89937zB(String str) {
        C87412m.m108594g(str, "currentTalker");
        C28259d dVar = new C28259d();
        dVar.field_hostRoomId = str;
        Random random = new Random();
        dVar.field_liveId = ((Long) Integer.valueOf(random.nextInt())).longValue();
        dVar.field_liveName = Integer.toString(random.nextInt(23546));
        dVar.field_thumbUrl = "";
        dVar.field_anchorUsername = C75592q0.m90789s();
        dVar.field_isSender = false;
        dVar.field_timeStamp = System.currentTimeMillis();
        C28260e jo = C28260e.m38144jo();
        jo.insert(dVar);
        C54427b.C28258a aVar = jo.f77821e;
        if (aVar != null) {
            ((C57833e1.C57834a) aVar).mo82259a(dVar.field_hostRoomId);
        }
    }

    public long zt0() {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        return RoomLiveService.f157197h.f133050d;
    }
}
