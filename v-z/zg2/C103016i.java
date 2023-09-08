package zg2;

import ai2.C92012f;
import ai2.C92013g;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64339ea;

/* renamed from: zg2.i */
public final class C103016i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f303972d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f303973e;

    /* renamed from: f */
    public final /* synthetic */ C64339ea f303974f;

    public C103016i(Context context, ViewGroup viewGroup, C64339ea eaVar) {
        this.f303972d = context;
        this.f303973e = viewGroup;
        this.f303974f = eaVar;
    }

    public final void run() {
        C103020m mVar = C103020m.f303985a;
        Context context = this.f303972d;
        ViewGroup viewGroup = this.f303973e;
        C64339ea eaVar = this.f303974f;
        C87412m.m108593f(eaVar, LocaleUtil.ITALIAN);
        C92012f fVar = new C92012f(eaVar);
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the emoji item view");
        C92013g gVar = new C92013g(context);
        viewGroup.addView(gVar, new RelativeLayout.LayoutParams(-1, -1));
        gVar.f263455y = true;
        gVar.setViewMatrix(fVar.f263447h);
        gVar.setEmojiInfo(fVar.f263446g);
        gVar.resume();
    }
}
