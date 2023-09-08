package p357lo;

import a14.C0000n0;
import com.tencent.p014mm.feature.brandservice.flutter.model.FlutterBizPlugin;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.BizPigeon;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C118459qf;
import te3.C118474vf;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@C91590f(mo125468c = "com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$doGetBizFinderLives$1", mo125469f = "FlutterBizPlugin.kt", mo125470l = {635}, mo125471m = "invokeSuspend")
/* renamed from: lo.b */
public final class C21450b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f60727d;

    /* renamed from: e */
    public final /* synthetic */ FlutterBizPlugin f60728e;

    /* renamed from: f */
    public final /* synthetic */ int f60729f;

    /* renamed from: g */
    public final /* synthetic */ List<String> f60730g;

    /* renamed from: h */
    public final /* synthetic */ boolean f60731h;

    /* renamed from: lo.b$a */
    public static final class C21451a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FlutterBizPlugin f60732d;

        /* renamed from: e */
        public final /* synthetic */ int f60733e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<C118459qf> f60734f;

        /* renamed from: g */
        public final /* synthetic */ boolean f60735g;

        /* renamed from: lo.b$a$a */
        public static final class C21452a<T> implements BizPigeon.BizCallbackApi.Reply {

            /* renamed from: a */
            public static final C21452a<T> f60736a = new C21452a<>();

            public /* bridge */ /* synthetic */ void reply(Object obj) {
                Void voidR = (Void) obj;
            }
        }

        public C21451a(FlutterBizPlugin flutterBizPlugin, int i, LinkedList<C118459qf> linkedList, boolean z) {
            this.f60732d = flutterBizPlugin;
            this.f60733e = i;
            this.f60734f = linkedList;
            this.f60735g = z;
        }

        public final void run() {
            BizPigeon.BizCallbackApi bizCallbackApi = this.f60732d.f48843d;
            if (bizCallbackApi != null) {
                Long valueOf = Long.valueOf((long) this.f60733e);
                List<C118459qf> p = C19428d.f54856a.mo25181p(this.f60734f, this.f60735g);
                FlutterBizPlugin flutterBizPlugin = this.f60732d;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(p, 10));
                for (C118459qf b : p) {
                    arrayList.add(flutterBizPlugin.mo21311b(b));
                }
                bizCallbackApi.onBizFinderLiveInfoUpdate(valueOf, arrayList, C21452a.f60736a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21450b(FlutterBizPlugin flutterBizPlugin, int i, List<String> list, boolean z, C15601d<? super C21450b> dVar) {
        super(2, dVar);
        this.f60728e = flutterBizPlugin;
        this.f60729f = i;
        this.f60730g = list;
        this.f60731h = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C21450b(this.f60728e, this.f60729f, this.f60730g, this.f60731h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C21450b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f60727d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlutterBizPlugin flutterBizPlugin = this.f60728e;
            if (flutterBizPlugin.f48851o) {
                return C13598b0.f38549a;
            }
            flutterBizPlugin.f48851o = true;
            C19428d dVar = C19428d.f54856a;
            dVar.mo25176k().encode("live_bar_list_last_refresh_time", System.currentTimeMillis());
            int i2 = this.f60729f;
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f60730g);
            C13598b0 b0Var = C13598b0.f38549a;
            this.f60727d = 1;
            obj = dVar.mo25171e(i2, linkedList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C118474vf vfVar = (C118474vf) obj;
        LinkedList<C118459qf> linkedList2 = null;
        if (vfVar != null) {
            int i3 = this.f60729f;
            C19428d dVar2 = C19428d.f54856a;
            dVar2.mo25163P(i3, vfVar.f354497g);
            dVar2.mo25162O(i3, vfVar.f354498h);
            dVar2.mo25164Q(vfVar);
        } else {
            vfVar = null;
        }
        String unused = this.f60728e.getClass();
        Log.m105918d("MicroMsg.FlutterBizPlugin", "doGetBizFinderLives scene=" + this.f60729f);
        FlutterBizPlugin flutterBizPlugin2 = this.f60728e;
        flutterBizPlugin2.f48851o = false;
        if (vfVar != null) {
            linkedList2 = vfVar.f354494d;
        }
        if (linkedList2 == null) {
            return C13598b0.f38549a;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C21451a(flutterBizPlugin2, this.f60729f, linkedList2, this.f60731h));
        return C13598b0.f38549a;
    }
}
