package kh1;

import a14.C0000n0;
import a14.C53851a;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Bitmap;
import cj1.C54733a1;
import cl1.C54963d0;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import nk1.C11207i;
import qj1.C63118y3;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController$executeWork$1", mo125469f = "EventSubscribeController.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
/* renamed from: kh1.a */
public final class C10077a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f30846d;

    /* renamed from: e */
    public int f30847e;

    /* renamed from: f */
    public final /* synthetic */ EventSubscribeController f30848f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10077a(EventSubscribeController eventSubscribeController, C15601d<? super C10077a> dVar) {
        super(2, dVar);
        this.f30848f = eventSubscribeController;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10077a(this.f30848f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10077a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Integer num;
        Bitmap bitmap;
        Bitmap bitmap2;
        C63118y3 y3Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f30847e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C54733a1 a1Var = ((C54963d0) this.f30848f.business(C54963d0.class)).f154051E;
            Integer num2 = a1Var != null ? new Integer(a1Var.f153392e) : null;
            Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#executeWork battleStatus=" + num2);
            EventSubscribeController eventSubscribeController = this.f30848f;
            this.f30846d = num2;
            this.f30847e = 1;
            obj2 = EventSubscribeController.m3060m3(eventSubscribeController, this);
            if (obj2 == aVar) {
                return aVar;
            }
            num = num2;
        } else if (i == 1) {
            num = (Integer) this.f30846d;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap3 = (Bitmap) obj2;
        if (bitmap3 != null) {
            EventSubscribeController eventSubscribeController2 = this.f30848f;
            boolean z = false;
            if (num != null && num.intValue() == 2) {
                C3206b2 b2Var = eventSubscribeController2.f27261e;
                if (b2Var == null || (y3Var = (C63118y3) b2Var.getPlugin(C63118y3.class)) == null) {
                    bitmap2 = null;
                } else {
                    y3Var.f179113s.f172036a.setDrawingCacheEnabled(true);
                    y3Var.f179113s.f172036a.buildDrawingCache();
                    Bitmap drawingCache = y3Var.f179113s.f172036a.getDrawingCache();
                    bitmap2 = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    y3Var.f179113s.f172036a.setDrawingCacheEnabled(false);
                }
                Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#getPkFrame b=" + bitmap2);
                bitmap = bitmap2;
            } else {
                bitmap = null;
            }
            eventSubscribeController2.getClass();
            Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#callEntranceShow");
            C10086f fVar = (C10086f) eventSubscribeController2.controller(C10086f.class);
            if (fVar != null) {
                Log.m105924i("FinderLiveScreenShotShareEntranceController", "#showEntrance bitmap.width=" + bitmap3.getWidth() + " height=" + bitmap3.getHeight());
                C53973z1 z1Var = fVar.f30872s;
                if (z1Var != null && ((C53851a) z1Var).mo74466a()) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("FinderLiveScreenShotShareEntranceController", "#showEntrance clickJob?.isActive, return.");
                } else {
                    fVar.f30867n = null;
                    fVar.f30868o = null;
                    C53973z1 z1Var2 = fVar.f30871r;
                    if (z1Var2 != null) {
                        C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                    }
                    fVar.f30871r = C11207i.m11066b(fVar, (C66212f) null, (C53934p0) null, new C10089g(fVar, bitmap, (Bitmap) null, bitmap3, (C15601d<? super C10089g>) null), 3, (Object) null);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
