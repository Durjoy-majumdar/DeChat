package qj1;

import android.content.Context;
import bl3.C39818r;
import cl1.C39975j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fe1.C8014g;
import fy3.C32224a;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.Map;
import l31.C61212e;
import nj3.C76912y0;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: qj1.h9 */
public final class C62807h9 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f178279d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62807h9(C62949r8 r8Var) {
        super(0);
        this.f178279d = r8Var;
    }

    public Object invoke() {
        C62949r8 r8Var = this.f178279d;
        r8Var.getClass();
        long a = C31543z5.m39451a();
        if (a - r8Var.f178635P > C62949r8.f178618V || r8Var.f178640U) {
            r8Var.f178635P = a;
            Log.m105924i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: check permission and cache, currentTime:" + a);
            C62992t8 t8Var = new C62992t8(r8Var);
            C63048v8 v8Var = new C63048v8(r8Var);
            C63086w8 w8Var = new C63086w8(r8Var);
            C8014g gVar = (C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class);
            if (!gVar.mo9103H()) {
                t8Var.invoke();
            } else {
                C37521f.f99374d.getClass();
                if (C31543z5.m39451a() - gVar.mo9106t1() < ((long) C37521f.f99296U)) {
                    w8Var.invoke();
                } else {
                    v8Var.invoke();
                }
            }
            if (r8Var.f178636Q != null) {
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_room_fastcomment_event", r8Var.f178621A, (Map<String, Object>) null, 25561);
            }
        } else {
            Log.m105924i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: too fast, currentTime:" + a + ", lastPoiSendTime:" + r8Var.f178635P);
            Context context = r8Var.f178626F;
            C76912y0.m92767f(context, context.getString(C0966R.string.dp_));
        }
        if (((C39975j) this.f178279d.mo87696x0(C39975j.class)).mo62578e3()) {
            Log.m105924i("Finder.LiveInputPlugin", "inBox, keep show keyboard");
        } else {
            this.f178279d.mo87878h1(true);
        }
        return C13598b0.f38549a;
    }
}
