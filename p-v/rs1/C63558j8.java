package rs1;

import android.os.Message;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import ej0.C58608e;
import ej0.C86525c;
import ej0.C86530d;
import gj0.C87227a;
import hj0.C87535e;
import o40.C61926c;
import rx3.C36570n;

/* renamed from: rs1.j8 */
public final class C63558j8 implements C87227a {

    /* renamed from: a */
    public final /* synthetic */ C56711j f180249a;

    /* renamed from: rs1.j8$a */
    public static final class C63559a implements C87227a {

        /* renamed from: a */
        public final /* synthetic */ C56711j f180250a;

        public C63559a(C56711j jVar) {
            this.f180250a = jVar;
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("play new fail ");
            sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
            Log.m105920e("FinderProjectionScreenUIC", sb.toString());
            Message obtainMessage = ((MMHandler) ((C36570n) this.f180250a.f162604v).getValue()).obtainMessage(7);
            obtainMessage.arg1 = eVar != null ? eVar.f253592c : 0;
            obtainMessage.sendToTarget();
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            Log.m105924i("FinderProjectionScreenUIC", "play new success");
            C86525c cVar = this.f180250a.f162605w;
            if (cVar != null) {
                cVar.f251386e.f167798a = C58608e.C58609a.Playing;
            }
            if (cVar != null) {
                cVar.mo121005f();
            }
            C86525c cVar2 = this.f180250a.f162605w;
            if (cVar2 != null) {
                cVar2.mo121006g();
            }
            C56711j jVar = this.f180250a;
            C86525c cVar3 = jVar.f162605w;
            if (cVar3 != null) {
                cVar3.f251389h = (C86530d) ((C36570n) jVar.f162585I).getValue();
            }
            C56711j jVar2 = this.f180250a;
            C61926c.m72668M(new C63565l8(jVar2.f162605w, jVar2));
            ((MTimerHandler) ((C36570n) this.f180250a.f162588L).getValue()).stopTimer();
        }
    }

    public C63558j8(C56711j jVar) {
        this.f180249a = jVar;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("set AVTransportURI fail ");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
        Log.m105920e("FinderProjectionScreenUIC", sb.toString());
        Message obtainMessage = ((MMHandler) ((C36570n) this.f180249a.f162604v).getValue()).obtainMessage(7);
        obtainMessage.arg1 = eVar != null ? eVar.f253592c : 0;
        obtainMessage.sendToTarget();
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C56711j jVar = this.f180249a;
        C86525c cVar = jVar.f162605w;
        if (cVar != null) {
            cVar.f251386e.f167798a = C58608e.C58609a.Transitioning;
        }
        jVar.getClass();
        C61926c.m72668M(new C63571m8(cVar, jVar));
        C56711j jVar2 = this.f180249a;
        C86525c cVar2 = jVar2.f162605w;
        if (cVar2 != null) {
            cVar2.mo121001c(new C63559a(jVar2));
        }
    }
}
