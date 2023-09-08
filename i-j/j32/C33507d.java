package j32;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.receive.WxaLuckyMoneyReceiveUI;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

@C86522b
/* renamed from: j32.d */
public class C33507d extends C86301e implements C33506c {
    /* renamed from: B8 */
    public void mo59176B8(Activity activity, String str, String str2, int i) {
        Intent putExtra = new Intent(activity, WxaLuckyMoneyReceiveUI.class).putExtra("appId", str2).putExtra("sendId", str);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(putExtra);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/IWxaLuckyMoneyImpl", "launchReceiveLuckyMoney", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: Ty */
    public void mo59177Ty(Activity activity, String str, int i, String str2, int i2) {
        Intent putExtra = new Intent(activity, WxaLuckyMoneyPrepareUI.class).putExtra("appId", str).putExtra("defaultWishingWord", str2).putExtra("range", i);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(putExtra);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/IWxaLuckyMoneyImpl", "launchPrepareLuckyMoney", "(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
