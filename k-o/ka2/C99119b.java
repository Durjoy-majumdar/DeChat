package ka2;

import android.content.Context;
import android.net.Uri;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URL;
import ka2.C99111a;
import la2.C99357e;
import p295b8.C16765c;
import p295b8.C16772f;
import p300c8.C16875m;
import p300c8.C79952o;
import p300c8.C79954q;
import p333e8.C20551y;
import p380r7.C22210h;
import p396x6.C22995c;
import p396x6.C22996d;
import p396x6.C23023u;
import qc0.C101106m;
import za2.C102987e;

/* renamed from: ka2.b */
public class C99119b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99111a f290631d;

    public C99119b(C99111a aVar) {
        this.f290631d = aVar;
    }

    public void run() {
        URL url;
        C99111a aVar = this.f290631d;
        aVar.getClass();
        Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "initPlayer");
        String d = C102987e.m136176d(Util.isNullOrNil(aVar.f290615q.f295966n) ? aVar.f290615q.f295968p : aVar.f290615q.f295966n, aVar.f290615q.f295967o, NetStatusUtil.isWifi(MMApplicationContext.getContext()), new PBool());
        aVar.f290624z = d;
        Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "mSrc:%s", d);
        Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "field_songWifiUrl:%s", aVar.f290615q.f295966n);
        try {
            url = new URL(aVar.f290624z);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", e, "initPlayer", new Object[0]);
            Log.m105920e("MicroMsg.Music.ExoMusicPlayer", "new URL exception:" + e.getMessage());
            url = null;
        }
        if (url == null) {
            Log.m105920e("MicroMsg.Music.ExoMusicPlayer", "initPlayer url is null");
            aVar.mo141024o(aVar.f290615q, 500);
            C101106m mVar = aVar.f290615q;
            C99357e eVar = aVar.f297305g;
            if (eVar != null) {
                eVar.mo138799S(mVar, -4005, -43);
                return;
            }
            return;
        }
        C23023u uVar = aVar.f290619u;
        if (uVar != null && (aVar.f290618t != 3 || uVar.mo36263b())) {
            Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "stop it first!");
            aVar.f290618t = 3;
            aVar.f290619u.mo36262a(false);
            aVar.f290619u.stop();
        }
        C99111a.C99118g gVar = aVar.f290607G;
        gVar.getClass();
        gVar.f290630a = new int[]{1, 1, 1, 1};
        aVar.f290604D = C20551y.m22319i(MMApplicationContext.getContext(), "wechat");
        Uri parse = Uri.parse(aVar.f290624z);
        if (aVar.f290619u == null) {
            aVar.f290621w = new C16875m(aVar.f290612L, aVar);
            aVar.f290620v = new C16765c((C16772f.C16773a) null);
            aVar.f290619u = new C23023u(new C22996d(MMApplicationContext.getContext()), aVar.f290620v, new C22995c());
        }
        if (aVar.f290622x == null) {
            Context context = MMApplicationContext.getContext();
            C16875m mVar2 = aVar.f290621w;
            aVar.f290622x = new C79952o(context, mVar2, new C79954q(aVar.f290604D, mVar2));
        }
        try {
            aVar.f290606F = false;
            aVar.f290623y = new C22210h(parse, aVar.f290622x, aVar.f290612L, aVar.f290610J);
            aVar.f290619u.mo36323h(aVar.f290608H);
            aVar.f290619u.f66196f.add(aVar);
            aVar.f290619u.f66202l = aVar.f290609I;
            C101106m mVar3 = aVar.f290615q;
            if (mVar3 != null) {
                aVar.mo138490I((float) mVar3.f295950K);
                aVar.mo138491J(aVar.f290615q.f295951L);
            }
            aVar.f290618t = 0;
            if (aVar.f290602B == 0) {
                Log.m105924i("MicroMsg.Music.ExoMusicPlayer", "startTime is 0, play it when ready!");
                aVar.f290619u.mo36262a(true);
            } else {
                aVar.f290619u.mo36262a(false);
            }
            aVar.f290619u.mo36325j(aVar.f290623y);
            aVar.f290617s = true;
            aVar.f290612L.sendEmptyMessageDelayed(100, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.Music.ExoMusicPlayer", "initPlayer exception:" + e2.getMessage());
            Log.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", e2, "initPlayer", new Object[0]);
            aVar.mo141024o(aVar.f290615q, 501);
            C101106m mVar4 = aVar.f290615q;
            C99357e eVar2 = aVar.f297305g;
            if (eVar2 != null) {
                eVar2.mo138799S(mVar4, -4005, -41);
            }
        }
    }
}
