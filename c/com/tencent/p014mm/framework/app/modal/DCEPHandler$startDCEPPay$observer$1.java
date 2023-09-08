package com.tencent.p014mm.framework.app.modal;

import android.app.Activity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import q10.C77298b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/framework/app/modal/DCEPHandler$startDCEPPay$observer$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onActivityResume", "onActivityPause", "onActivityDestroy", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1 */
public final class DCEPHandler$startDCEPPay$observer$1 implements C0124r {

    /* renamed from: d */
    public boolean f195324d = true;

    /* renamed from: e */
    public final Runnable f195325e;

    /* renamed from: f */
    public final /* synthetic */ String f195326f;

    /* renamed from: g */
    public final /* synthetic */ Activity f195327g;

    /* renamed from: com.tencent.mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1$a */
    public static final class C68052a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f195328d;

        /* renamed from: e */
        public final /* synthetic */ Activity f195329e;

        /* renamed from: f */
        public final /* synthetic */ DCEPHandler$startDCEPPay$observer$1 f195330f;

        public C68052a(String str, Activity activity, DCEPHandler$startDCEPPay$observer$1 dCEPHandler$startDCEPPay$observer$1) {
            this.f195328d = str;
            this.f195329e = activity;
            this.f195330f = dCEPHandler$startDCEPPay$observer$1;
        }

        public final void run() {
            VoidITransmitKvDataCallback remove = C77298b.f225412a.remove(this.f195328d);
            if (remove != null) {
                Activity activity = this.f195329e;
                DCEPHandler$startDCEPPay$observer$1 dCEPHandler$startDCEPPay$observer$1 = this.f195330f;
                Log.m105924i("MicroMsg.DCEPHandler", "callback from resume");
                ITransmitKvData create = ITransmitKvData.create();
                create.putString("procSts", "0001");
                create.putInt("ret_scene", 2);
                remove.call(create);
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) activity).getLifecycle().removeObserver(dCEPHandler$startDCEPPay$observer$1);
            }
        }
    }

    public DCEPHandler$startDCEPPay$observer$1(String str, Activity activity) {
        this.f195326f = str;
        this.f195327g = activity;
        this.f195325e = new C68052a(str, activity, this);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onActivityDestroy() {
        Log.m105918d("MicroMsg.DCEPHandler", "on destroy");
        VoidITransmitKvDataCallback remove = C77298b.f225412a.remove(this.f195326f);
        if (remove != null) {
            Log.m105924i("MicroMsg.DCEPHandler", "callback from destroy");
            ITransmitKvData create = ITransmitKvData.create();
            create.putString("procSts", "0001");
            create.putInt("ret_scene", 2);
            remove.call(create);
        }
        Activity activity = this.f195327g;
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((MMFragmentActivity) activity).getLifecycle().removeObserver(this);
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onActivityPause() {
        Log.m105924i("MicroMsg.DCEPHandler", "on pause");
        C61926c.m72698w(this.f195325e);
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onActivityResume() {
        Log.m105924i("MicroMsg.DCEPHandler", "on resume " + this.f195324d);
        if (!((UIPageFragmentActivity) this.f195327g).isFinishing()) {
            if (this.f195324d) {
                this.f195324d = false;
            } else {
                C61926c.m72667L(500, this.f195325e);
            }
        }
    }
}
