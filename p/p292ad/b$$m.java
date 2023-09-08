package p292ad;

import co0.C80127b;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82731k;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import jo0.C87995c;
import ml0.C21511u;
import p830xc.C91165a;
import p932bd.C79687a;

/* renamed from: ad.b$$m */
public final /* synthetic */ class b$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233128d;

    /* renamed from: e */
    public final /* synthetic */ int f233129e;

    public /* synthetic */ b$$m(C79502b bVar, int i) {
        this.f233128d = bVar;
        this.f233129e = i;
    }

    public final void run() {
        C79502b bVar = this.f233128d;
        int i = this.f233129e;
        Log.m105925i(bVar.mo109516v(), "*** handler(%s) handleWebViewBackground, type:%d", bVar.mo122122p(), Integer.valueOf(i));
        bVar.f233078D = true;
        Log.m105925i(bVar.mo109516v(), "handleWebViewBackground, type:%s, autoPauseIfNative:%s, autoPauseIfNavigate:%s, isRuntimeInBackground:%s, isPlayingWhenEnterBackground:%s", Integer.valueOf(i), Boolean.valueOf(bVar.f233108v), Boolean.valueOf(bVar.f233107u), Boolean.valueOf(bVar.f233077C), bVar.f233079E);
        Log.m105924i(bVar.mo109516v(), "handleWebViewBackground, abandonFocus");
        bVar.f233111y.mo115002L();
        C79687a aVar = bVar.f233100n;
        if (aVar != null) {
            if (((C87995c) aVar).mo122450e(bVar, bVar.f233101o, i)) {
                Log.m105924i(bVar.mo109516v(), "handleWebViewBackground, should intercept enter background, return");
                return;
            }
        }
        if (i == 4) {
            C79501a aVar2 = bVar.f233097h;
            if (aVar2 == null) {
                Log.m105928w(bVar.mo109516v(), "handleWebViewBackground, adapter is null 0");
            } else {
                ((C79513m) aVar2).mo14923c();
            }
        }
        C82732k0 RV = C82731k.f242051e.mo115008RV(bVar.f233107u, bVar.f233108v);
        Log.m105925i(bVar.mo109516v(), "handleWebViewBackground, autoPauseStrategy: %s", RV);
        C91165a aVar3 = bVar.f233101o;
        if (!RV.mo114992a(aVar3 == null ? null : aVar3.mo62544g(), C80127b.m97437c(i))) {
            AtomicBoolean atomicBoolean = bVar.f233079E;
            if (atomicBoolean == null || !atomicBoolean.get()) {
                Log.m105925i(bVar.mo109516v(), "handleWebViewBackground, live player not auto pause, ignore resume, type:%s", Integer.valueOf(i));
                C79501a aVar4 = bVar.f233097h;
                if (aVar4 != null && bVar.f233079E == null) {
                    bVar.f233079E = new AtomicBoolean(((C79513m) aVar4).isPlaying());
                    return;
                }
                return;
            }
            Log.m105925i(bVar.mo109516v(), "handleWebViewBackground, live player not auto pause, try resume, type:%s", Integer.valueOf(i));
            C79501a aVar5 = bVar.f233097h;
            if (aVar5 == null) {
                Log.m105928w(bVar.mo109516v(), "handleWebViewBackground, adapter is null 1");
            } else {
                ((C79513m) aVar5).mo14922b();
            }
        } else {
            C79501a aVar6 = bVar.f233097h;
            if (aVar6 != null && bVar.f233079E == null) {
                boolean isPlaying = ((C79513m) aVar6).isPlaying();
                bVar.f233079E = new AtomicBoolean(isPlaying);
                if (bVar.f233089P && 1 != i && bVar.mo109513s()) {
                    Log.m105924i(bVar.mo109516v(), "handleWebViewBackground runnable, background play audio is enabled, do not pause");
                } else if (bVar.f233082H.mo125355a(bVar.f233101o)) {
                    Log.m105924i(bVar.mo109516v(), "handleWebViewBackground runnable, i am pip player, do not pause");
                } else {
                    C21511u d = ((C79513m) bVar.f233097h).mo14924d();
                    if (isPlaying) {
                        bVar.mo109518x("stop", d);
                    }
                    Log.m105925i(bVar.mo109516v(), "handleWebViewBackground, isPlayingWhenEnterBackground:%s, code:%d info:%s", Boolean.valueOf(isPlaying), Integer.valueOf(d.f60905a), d.f60906b);
                }
            }
        }
    }
}
