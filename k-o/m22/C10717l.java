package m22;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.json.JSONObject;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lm22/l;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: m22.l */
public final class C10717l extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Context context;
        String str2;
        Log.m105924i("LiteAppJsApiShareFinderShop", "invoke appId:" + str + ",data:" + jSONObject);
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        if (g == null || (context = g.get()) == null) {
            WeakReference<Activity> f = AppForegroundDelegate.INSTANCE.mo174212f();
            context = f != null ? f.get() : null;
        }
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        C87412m.m108593f(context, "context");
        Intent intent = new Intent();
        if (jSONObject == null || (str2 = jSONObject.toString()) == null) {
            str2 = "";
        }
        intent.putExtra("KEY_SHOP_WINDOW", str2);
        C13598b0 b0Var = C13598b0.f38549a;
        t1Var.mo76805Rl(context, intent);
    }
}
