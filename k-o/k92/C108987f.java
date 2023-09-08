package k92;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import k92.C108976d;
import l92.C109296d;
import zt3.C119157j;

/* renamed from: k92.f */
public final class C108987f implements C109296d {

    /* renamed from: a */
    public final /* synthetic */ C108976d f326453a;

    /* renamed from: k92.f$a */
    public static final class C108988a implements C108976d.C108977a {

        /* renamed from: a */
        public final /* synthetic */ C108976d f326454a;

        /* renamed from: b */
        public final /* synthetic */ boolean f326455b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f326456c;

        /* renamed from: d */
        public final /* synthetic */ int f326457d;

        /* renamed from: k92.f$a$a */
        public static final class C108989a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108976d f326458d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f326459e;

            public C108989a(C108976d dVar, Bitmap bitmap) {
                this.f326458d = dVar;
                this.f326459e = bitmap;
            }

            public final void run() {
                C108976d dVar = this.f326458d;
                dVar.mo160090r(dVar.mo160095Q(this.f326459e, dVar.mo160079b()), false);
            }
        }

        public C108988a(C108976d dVar, boolean z, Bitmap bitmap, int i) {
            this.f326454a = dVar;
            this.f326455b = z;
            this.f326456c = bitmap;
            this.f326457d = i;
        }

        public void proceed() {
            this.f326454a.mo67897d();
            C108976d dVar = this.f326454a;
            dVar.f326435q = dVar.mo160079b();
            if (this.f326455b) {
                C108976d dVar2 = this.f326454a;
                C108989a aVar = new C108989a(dVar2, this.f326456c);
                dVar2.getClass();
                ((C119157j) C119157j.f356862d).mo183871b(aVar, dVar2.f326421d);
                StringBuilder sb = new StringBuilder();
                sb.append("auto hideUIC,id:");
                MultiTaskInfo multiTaskInfo = this.f326454a.f326418a;
                sb.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
                Log.m105924i("MicroMsg.PageMultiTaskHelper", sb.toString());
                ((C105919k) C86312j.m106911c(C105919k.class)).mo151050r5(0, "MultiTaskForSnapshotMinusScreen", 1048576);
            } else {
                C108976d dVar3 = this.f326454a;
                dVar3.mo160090r(dVar3.mo160095Q(this.f326456c, dVar3.mo160079b()), this.f326457d == 4);
            }
            C107028a aVar2 = this.f326454a.f326423e;
            if (aVar2 != null) {
                aVar2.mo70834j(false);
            }
        }
    }

    public C108987f(C108976d dVar) {
        this.f326453a = dVar;
    }

    /* renamed from: a */
    public void mo90716a(Bitmap bitmap, boolean z, int i) {
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "swipeBack start, isSwipeBack:" + z + " ,way:" + i);
        C108976d dVar = this.f326453a;
        dVar.mo136900P(new C108988a(dVar, z, bitmap, i));
    }

    /* renamed from: b */
    public void mo90717b(int i) {
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "swipeBack animation cancel, way:" + i);
        C7335d c = C86312j.m106911c(C105919k.class);
        C87412m.m108593f(c, "getService(IPluginMultiTaskService::class.java)");
        C105919k.C105920a.m142391a((C105919k) c, 2, (String) null, 0, 6, (Object) null);
        C107028a aVar = this.f326453a.f326423e;
        if (aVar != null) {
            aVar.mo70835k();
        }
        C108976d dVar = this.f326453a;
        C107028a aVar2 = dVar.f326423e;
        Bitmap Q = dVar.mo160095Q(aVar2 != null ? aVar2.getBitmap() : null, this.f326453a.mo160079b());
        this.f326453a.mo160090r(Q, i == 4);
        C108976d dVar2 = this.f326453a;
        dVar2.mo74197w(Q, dVar2.f326438t);
        C108976d dVar3 = this.f326453a;
        C107028a aVar3 = dVar3.f326423e;
        if (aVar3 != null) {
            aVar3.mo67906e(true, dVar3);
        }
        C107028a aVar4 = this.f326453a.f326423e;
        if (aVar4 != null) {
            aVar4.mo70834j(true);
        }
    }

    /* renamed from: c */
    public void mo90718c(Bitmap bitmap, int i) {
        Log.m105924i("MicroMsg.PageMultiTaskHelper", "swipeBack animation end, way:" + i);
        C7335d c = C86312j.m106911c(C105919k.class);
        C87412m.m108593f(c, "getService(IPluginMultiTaskService::class.java)");
        C105919k.C105920a.m142391a((C105919k) c, 2, (String) null, 0, 6, (Object) null);
        C108976d dVar = this.f326453a;
        Bitmap Q = dVar.mo160095Q(bitmap, dVar.f326435q);
        C108976d dVar2 = this.f326453a;
        dVar2.mo74197w(Q, dVar2.f326438t);
        this.f326453a.mo160098W(Q, i == 4, false, false);
        C107028a aVar = this.f326453a.f326423e;
        if (aVar != null) {
            aVar.mo70834j(true);
        }
    }
}
