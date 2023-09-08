package u02;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import nj3.C11184p0;
import q02.C47746j;
import te3.C49546gd3;

/* renamed from: u02.f */
public class C52407f implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ List f146484d;

    /* renamed from: e */
    public final /* synthetic */ C52408g f146485e;

    public C52407f(C52408g gVar, List list) {
        this.f146485e = gVar;
        this.f146484d = list;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        this.f146485e.f146486d.f114751G = (Bankcard) this.f146484d.get(i);
        HoneyPayCardManagerUI honeyPayCardManagerUI = this.f146485e.f146486d;
        String str = honeyPayCardManagerUI.f114712d;
        Bankcard bankcard = honeyPayCardManagerUI.f114751G;
        Log.m105925i(str, "select bankcard: %s, %s", bankcard.field_bindSerial, bankcard.field_bankcardTypeName);
        HoneyPayCardManagerUI honeyPayCardManagerUI2 = this.f146485e.f146486d;
        honeyPayCardManagerUI2.f114753I = honeyPayCardManagerUI2.f114752H;
        C49546gd3 gd32 = new C49546gd3();
        HoneyPayCardManagerUI honeyPayCardManagerUI3 = this.f146485e.f146486d;
        Bankcard bankcard2 = honeyPayCardManagerUI3.f114751G;
        gd32.f133975d = bankcard2.field_desc;
        gd32.f133977f = bankcard2.field_bankcardType;
        gd32.f133978g = bankcard2.field_bindSerial;
        gd32.f133979h = bankcard2.field_bankcardTail;
        honeyPayCardManagerUI3.f114752H = gd32;
        honeyPayCardManagerUI3.mo66503L7();
        HoneyPayCardManagerUI honeyPayCardManagerUI4 = this.f146485e.f146486d;
        Log.m105924i(honeyPayCardManagerUI4.f114712d, "do modify pay way");
        C47746j jVar = new C47746j(honeyPayCardManagerUI4.f114752H, honeyPayCardManagerUI4.f114757M, honeyPayCardManagerUI4.f114756L);
        jVar.mo104821m1(honeyPayCardManagerUI4);
        honeyPayCardManagerUI4.doSceneProgress(jVar, false);
    }
}
