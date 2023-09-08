package xu0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineComponent;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n20.C100039p;
import p196ln.C76707h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import vu0.C102292b;
import vu0.C102293d;
import vu0.C102297f;
import wu0.C102501a;

/* renamed from: xu0.i */
public final class C102736i extends PipelineComponent {

    /* renamed from: xu0.i$a */
    public static final class C102737a extends C87413o implements C32226l<PipelineState, C13598b0> {

        /* renamed from: d */
        public static final C102737a f303364d = new C102737a();

        public C102737a() {
            super(1);
        }

        public Object invoke(Object obj) {
            PipelineState pipelineState = (PipelineState) obj;
            C87412m.m108594g(pipelineState, "state");
            IStateAction action = pipelineState.getAction();
            if (action != null && (action instanceof C102292b)) {
                pipelineState.put("Avatar_ImgStatus", ((C102292b) action).f301271a);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102736i(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public void onCreate() {
        process(C102737a.f303364d);
    }

    public void onDestroy() {
        Class cls = C76707h.class;
        String stringOrInterrupt = state().getStringOrInterrupt("Avatar_Username");
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IAvatarImageL…atureService::class.java)");
        String A00 = ((C76707h) c).A00(stringOrInterrupt, 0.1f);
        C102297f fVar = (C102297f) state().get("Avatar_ImgStatus");
        Log.m105924i("MicroMsg.Avatar.AvatarNotifyBitmapPPC", "onDestroy notify " + A00 + ' ' + fVar);
        if (fVar != null && fVar != C102297f.NotExpired) {
            Bitmap W2 = ((C76707h) C86312j.m106911c(cls)).mo106988W2(A00);
            if (W2 == null) {
                W2 = ((C76707h) C86312j.m106911c(cls)).Vw0();
            }
            C13601g<HashMap<String, List<WeakReference<C102501a>>>> gVar = C102293d.f301273f;
            C13601g<HashMap<String, List<WeakReference<C102501a>>>> gVar2 = C102293d.f301273f;
            List list = (List) ((HashMap) ((C36570n) gVar2).getValue()).get(A00);
            if (list == null) {
                return;
            }
            if (list.isEmpty()) {
                ((HashMap) ((C36570n) gVar2).getValue()).remove(A00);
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C102501a aVar = (C102501a) ((WeakReference) it.next()).get();
                if (aVar == null) {
                    it.remove();
                } else {
                    Log.m105918d("MicroMsg.Avatar.AvatarBitmapDrawable", "onAvatarChange " + aVar.f301815e + ' ' + C100039p.m130707a(W2));
                    if (!C87412m.m108589b(aVar.f301822o, W2)) {
                        ((MMHandler) ((C36570n) aVar.f301823p).getValue()).removeCallbacks(aVar.f301824q);
                        ((MMHandler) ((C36570n) aVar.f301823p).getValue()).postAtFrontOfQueue(aVar.f301824q);
                    }
                }
            }
        }
    }
}
