package ma2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import ke3.C88144b;
import te3.C64793w23;
import vv0.C65884b;

/* renamed from: ma2.q */
public final class C61451q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99815p f174758d;

    public C61451q(C99815p pVar) {
        this.f174758d = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/music/model/GlobalMusicPlayerFloatBallHelper$initMusicFloatBallView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C99815p pVar = this.f174758d;
        pVar.getClass();
        C64793w23 w232 = new C64793w23();
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        w232.f186034e = uuid;
        w232.f186033d = 4;
        Intent I0 = pVar.mo139171I0();
        I0.putExtra("key_mv_report_data", w232.toByteArray());
        I0.putExtra("key_music_stop_or_complete", C99808k.f292498h);
        I0.putExtra("markTryListen", pVar.f292509u);
        I0.addFlags(268435456);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C65884b.m77630b(context, I0, true);
        C88144b.m109791i(MMApplicationContext.getContext(), "mv", ".ui.MusicMvMainUI", I0, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/music/model/GlobalMusicPlayerFloatBallHelper$initMusicFloatBallView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
