package p517fa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.kinda.framework.boot.KindaApp;
import com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl;
import com.tencent.kinda.framework.module.impl.KindaThirdPayService;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KCacheService;
import com.tencent.kinda.gen.KThirdPayService;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.framework.app.ThirdPayCallbackActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C24564k0;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import k20.C9556a;
import p533ga.C32359d;
import p533ga.C75894f;
import q10.C77298b;
import rx3.C13598b0;

@C86522b
/* renamed from: fa.g */
public final class C75732g extends C86301e implements C75894f, C32359d {
    public KCacheService Qu0() {
        return new KindaCacheServiceImpl();
    }

    public KThirdPayService cs0() {
        return new KindaThirdPayService();
    }

    /* renamed from: kX */
    public void mo58582kX(Context context, Intent intent) {
        C13598b0 b0Var;
        Activity activity;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        HashMap<String, VoidITransmitKvDataCallback> hashMap = C77298b.f225412a;
        Uri data = intent.getData();
        Log.m105924i("MicroMsg.DCEPHandler", "process callback: " + data);
        if (data != null) {
            String queryParameter = data.getQueryParameter("orderNo");
            String queryParameter2 = data.getQueryParameter("procSts");
            Log.m105924i("MicroMsg.DCEPHandler", "move appbrand task to front");
            WeakReference<Activity> weakReference = C77298b.f225413b;
            if (!(weakReference == null || (activity = weakReference.get()) == null)) {
                Intent intent2 = new Intent(activity, ThirdPayCallbackActivity.class);
                intent2.addFlags(536870912);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/framework/app/modal/DCEPHandler", "processCallback", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/framework/app/modal/DCEPHandler", "processCallback", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            ITransmitKvData create = ITransmitKvData.create();
            create.putString("orderNo", queryParameter);
            create.putString("procSts", queryParameter2);
            create.putInt("ret_scene", 1);
            VoidITransmitKvDataCallback voidITransmitKvDataCallback = (VoidITransmitKvDataCallback) C24564k0.m30739c(C77298b.f225412a).remove(queryParameter);
            if (voidITransmitKvDataCallback != null) {
                voidITransmitKvDataCallback.call(create);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w("MicroMsg.DCEPHandler", "can't find callback, use notify");
                create.putString("notifyType", "processDCEPCallback");
                KindaApp.instance().notifyAllUseCases(create);
            }
        }
    }
}
