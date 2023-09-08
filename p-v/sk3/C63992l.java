package sk3;

import a14.C0000n0;
import android.database.Cursor;
import android.widget.ProgressBar;
import bl3.C39818r;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C57593a4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import fk3.C59136a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.ResultKt;
import o40.C61926c;
import p157gk.C59479c;
import rk3.C63462a;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$getToIdentifyData$2", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: sk3.l */
public final class C63992l extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends ArrayList<QueryImageData>, ? extends ArrayList<QueryImageData>>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C63995m f181412d;

    /* renamed from: e */
    public final /* synthetic */ boolean f181413e;

    /* renamed from: sk3.l$a */
    public static final class C63993a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63995m f181414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63993a(C63995m mVar) {
            super(0);
            this.f181414d = mVar;
        }

        public Object invoke() {
            C63462a aVar = C63462a.f180011a;
            Log.m105924i("MicroMsg.FTSMultiReporter", "setImageIsAllIdentified: " + C63462a.f180022l);
            C63462a.f180022l = true;
            C39818r rVar = C39818r.f106831a;
            ((C64024v) rVar.mo62444c(this.f181414d.getActivity()).mo75002a(C64024v.class)).mo88784j3(C59479c.STOP);
            C64009r0 r0Var = (C64009r0) rVar.mo62444c(this.f181414d.getActivity()).mo75002a(C64009r0.class);
            r0Var.getClass();
            Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone");
            if (!r0Var.f181473w) {
                Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone >> when done is no query");
                ProgressBar progressBar = r0Var.f181463j;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63992l(C63995m mVar, boolean z, C15601d<? super C63992l> dVar) {
        super(2, dVar);
        this.f181412d = mVar;
        this.f181413e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63992l(this.f181412d, this.f181413e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63992l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        new ArrayList();
        C59136a aVar = C59136a.f169139a;
        long d = aVar.mo84349d(this.f181412d.f181428f);
        boolean z = this.f181413e;
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> timestamp: " + d);
        boolean z2 = true;
        if (d != -1) {
            Cursor cx02 = ((C72972g4) C97625j3.m125812b().mo105911z()).cx0(this.f181412d.f181428f, d);
            C87412m.m108593f(cx02, "getAccStg().messageStg.g…(conversation, timeStamp)");
            ArrayList<QueryImageData> c = aVar.mo84348c(cx02, false);
            int size = c.size();
            Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> latestSize: " + size + ", " + z);
            if (size > 0 && !z) {
                this.f181412d.mo88769l3();
                z = true;
            }
            long e = aVar.mo84350e(this.f181412d.f181428f);
            Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldest timeStamp: " + e);
            if (!(e == -1 || e == d)) {
                Cursor vx02 = ((C72972g4) C97625j3.m125812b().mo105911z()).vx0(this.f181412d.f181428f, e, 50);
                C87412m.m108593f(vx02, "getAccStg().messageStg.g…rsation, oldestStamp, 50)");
                ArrayList<QueryImageData> c2 = aVar.mo84348c(vx02, false);
                int size2 = c2.size();
                Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldestSize: " + size2 + ", " + z);
                c.addAll(c2);
                if (size2 > 0 && !z) {
                    this.f181412d.mo88769l3();
                    ArrayList<QueryImageData> d2 = C57593a4.f164912a.mo81939d(this.f181412d.f181428f, "0");
                    int size3 = d2.size();
                    Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size3 + ", " + z2);
                    if (size3 > 0 && !z2) {
                        this.f181412d.mo88769l3();
                    }
                    if (c.isEmpty() && d2.isEmpty()) {
                        Log.m105924i("MicroMsg.FTSMultiImageUIC", "show image done when get data");
                        C61926c.m72668M(new C63993a(this.f181412d));
                    }
                    return new C13604l(c, d2);
                }
            }
            z2 = z;
            ArrayList<QueryImageData> d25 = C57593a4.f164912a.mo81939d(this.f181412d.f181428f, "0");
            int size32 = d25.size();
            Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size32 + ", " + z2);
            this.f181412d.mo88769l3();
            Log.m105924i("MicroMsg.FTSMultiImageUIC", "show image done when get data");
            C61926c.m72668M(new C63993a(this.f181412d));
            return new C13604l(c, d25);
        }
        Cursor Sx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Sx0(this.f181412d.f181428f, 500);
        C87412m.m108593f(Sx0, "getAccStg().messageStg.g…tImage(conversation, 500)");
        ArrayList<QueryImageData> c3 = aVar.mo84348c(Sx0, true);
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> imageDataListResult: " + c3.size() + ", " + z);
        if (!z && (!c3.isEmpty())) {
            this.f181412d.mo88769l3();
        }
        return new C13604l(c3, new ArrayList());
    }
}
