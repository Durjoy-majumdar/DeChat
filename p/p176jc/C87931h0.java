package p176jc;

import a14.C0000n0;
import android.view.ViewGroup;
import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.skyline.SkylineRuntime;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import lu3.C109426i;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineView$release$1", mo125469f = "SkylineView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: jc.h0 */
public final class C87931h0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f254484d;

    /* renamed from: jc.h0$a */
    public static final class C87932a implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ SkylineView f254485d;

        public C87932a(SkylineView skylineView) {
            this.f254485d = skylineView;
        }

        public String getKey() {
            return "";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            SkylineView skylineView = this.f254485d;
            SkylineRuntime skylineRuntime = skylineView.f235005e;
            if (skylineRuntime == null) {
                return;
            }
            if (skylineRuntime != null) {
                skylineRuntime.destroyWindow(skylineView.f235004d);
            } else {
                C87412m.m108603p("mSkylineRuntime");
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87931h0(SkylineView skylineView, C15601d<? super C87931h0> dVar) {
        super(2, dVar);
        this.f254484d = skylineView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C87931h0(this.f254484d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C87931h0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        SkylineView skylineView = this.f254484d;
        skylineView.getClass();
        skylineView.mo111447u(new C87945z(skylineView));
        C87929h hVar = this.f254484d.f235007g;
        if (hVar != null) {
            if (hVar != null) {
                hVar.mo122397c();
            } else {
                C87412m.m108603p("mFlutterViewWrapper");
                throw null;
            }
        }
        ViewGroup viewGroup = this.f254484d.f235006f;
        if (viewGroup != null) {
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            } else {
                C87412m.m108603p("mContentView");
                throw null;
            }
        }
        SkylineView skylineView2 = this.f254484d;
        if (MMHandlerThread.isMainThread()) {
            SkylineRuntime skylineRuntime = skylineView2.f235005e;
            if (skylineRuntime != null) {
                if (skylineRuntime != null) {
                    skylineRuntime.destroyWindow(skylineView2.f235004d);
                } else {
                    C87412m.m108603p("mSkylineRuntime");
                    throw null;
                }
            }
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C87932a(skylineView2));
        }
        return C13598b0.f38549a;
    }
}
