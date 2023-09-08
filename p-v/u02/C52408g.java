package u02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C39736t0;
import b63.C67188h0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72420r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: u02.g */
public class C52408g implements C32226l<C39736t0.C39738b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HoneyPayCardManagerUI f146486d;

    public C52408g(HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f146486d = honeyPayCardManagerUI;
    }

    public Object invoke(Object obj) {
        ArrayList<Bankcard> arrayList;
        C39736t0.C39738b bVar = (C39736t0.C39738b) obj;
        this.f146486d.hideLoading();
        if (bVar == null || !bVar.f106625g) {
            Log.m105928w(this.f146486d.f114712d, "bind query fail, use default bankcardList");
            arrayList = C67188h0.m79466a(false);
        } else {
            arrayList = bVar.f106619a;
            Bankcard bankcard = bVar.f106621c;
            if (bankcard != null) {
                arrayList.add(0, bankcard);
            }
            Bankcard bankcard2 = bVar.f106620b;
            if (bankcard2 != null) {
                arrayList.add(0, bankcard2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Bankcard next : arrayList) {
            if (!next.mo99392r2()) {
                arrayList2.add(next);
            } else {
                Log.m105925i(this.f146486d.f114712d, "remove honey card %s", next.field_bindSerial);
            }
        }
        AppCompatActivity context = this.f146486d.getContext();
        HoneyPayCardManagerUI honeyPayCardManagerUI = this.f146486d;
        Bankcard bankcard3 = honeyPayCardManagerUI.f114751G;
        String string = honeyPayCardManagerUI.getString(C0966R.string.fkp);
        String string2 = this.f146486d.getString(C0966R.string.fko);
        C52407f fVar = new C52407f(this, arrayList2);
        C77407n nVar = new C77407n((Context) context, 2, true);
        C72420r rVar = r4;
        C77407n nVar2 = nVar;
        C72420r rVar2 = new C72420r(arrayList2, context, new HashMap(), nVar, false, false, "");
        nVar2.f225771i = rVar;
        nVar2.f225782p = fVar;
        nVar2.f225781o1 = true;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cdj, (ViewGroup) null);
        if (!Util.isNullOrNil(string)) {
            ((TextView) inflate.findViewById(C0966R.C0970id.a8_)).setText(string);
        }
        if (!Util.isNullOrNil(string2)) {
            ((TextView) inflate.findViewById(C0966R.C0970id.a89)).setText(string2);
        } else {
            View findViewById = inflate.findViewById(C0966R.C0970id.a89);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardBottomSheetHelper", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardBottomSheetHelper", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        nVar2.mo107569n(inflate, false);
        if (bankcard3 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                if (((Bankcard) arrayList2.get(i)).field_bindSerial.equals(bankcard3.field_bindSerial)) {
                    nVar2.f225786q1 = i;
                }
            }
        }
        nVar2.mo107573q();
        this.f146486d.f114764U = null;
        return null;
    }
}
