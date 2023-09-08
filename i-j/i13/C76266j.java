package i13;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import i13.C8840a;
import md0.C99847f;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: i13.j */
public final class C76266j implements C8840a.C8841a {

    /* renamed from: a */
    public final /* synthetic */ C76259g f223453a;

    public C76266j(C76259g gVar) {
        this.f223453a = gVar;
    }

    /* renamed from: a */
    public void mo9689a(int i) {
        C8840a aVar = this.f223453a.f223405J;
        if (aVar != null) {
            aVar.dismiss();
        }
        C76259g gVar = this.f223453a;
        gVar.f223409N.edit().putInt(gVar.f223408M, i).apply();
        C76259g gVar2 = this.f223453a;
        if (i != gVar2.f223437x) {
            if (NetStatusUtil.isConnected(gVar2.getContext())) {
                C76259g gVar3 = this.f223453a;
                gVar3.f223423h = false;
                gVar3.f223410P = false;
                C71562c cVar = gVar3.f223421f;
                cVar.f207376k = gVar3.f223422g;
                cVar.f207379n = 0;
                cVar.f207380o = 0;
                cVar.f207381p = 0;
                cVar.f207384s = 0;
                cVar.f207385t = 0;
                cVar.f207386u = 0;
                gVar3.mo106511L();
                MMHandler mMHandler = gVar3.f223407L;
                if (mMHandler != null) {
                    mMHandler.sendEmptyMessageDelayed(5000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
                MTimerHandler mTimerHandler = gVar3.f223403H;
                if (mTimerHandler != null) {
                    mTimerHandler.startTimer(500);
                }
                gVar3.f223437x = i;
                long nanoTime = System.nanoTime() & Util.MAX_32BIT_VALUE;
                if (nanoTime < 0) {
                    nanoTime = Math.abs(nanoTime);
                }
                C99847f fVar = new C99847f(String.valueOf(nanoTime));
                C99847f fVar2 = gVar3.f223439y;
                if (fVar2 != null) {
                    fVar2.mo139201a(fVar);
                }
                C71561b bVar = new C71561b(fVar, i, new C76256a0(gVar3));
                gVar3.f223436w = bVar;
                bVar.mo98689c();
                return;
            }
            Context context = this.f223453a.getContext();
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = this.f223453a.getContext().getResources().getString(C0966R.string.f360087a11);
            aVar2.f225663t = this.f223453a.getContext().getResources().getString(C0966R.string.h7l);
            aVar2.f225638U = this.f223453a.getContext().getResources().getColor(C0966R.color.Link_100);
            C77398g gVar4 = new C77398g(context, C0966R.style.a66);
            gVar4.mo107525e(aVar2);
            gVar4.show();
        }
    }
}
