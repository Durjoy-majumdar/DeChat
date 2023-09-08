package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import eb0.C75592q0;
import eb0.C86493v0;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11184p0;
import nj3.C76879j;
import p910lj.C76701a;
import q12.C12029d;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.c1 */
public class C4676c1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19647d;

    public C4676c1(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19647d = iPCallShareCouponCardUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f19647d;
        int itemId = menuItem.getItemId();
        int i2 = IPCallShareCouponCardUI.f19552F;
        String str2 = iPCallShareCouponCardUI.f19577z + " " + iPCallShareCouponCardUI.f19555C + String.format("&rt=%s", new Object[]{Integer.valueOf(itemId)});
        switch (itemId) {
            case 0:
                Log.m105925i("MicroMsg.IPCallShareCouponCardUI", "onShare2Friends>title:%s,onShare2Friends>url:%s,onShare2Friends>desc:%s,onShare2Friends>imgPath:%s", iPCallShareCouponCardUI.f19575x, iPCallShareCouponCardUI.f19576y + String.format("&rt=%s", new Object[]{Integer.valueOf(itemId)}), iPCallShareCouponCardUI.f19573v, iPCallShareCouponCardUI.f19574w);
                C12029d dVar = iPCallShareCouponCardUI.f19571t;
                dVar.f35026c = (long) 0;
                dVar.mo11891b();
                C115669n.INSTANCE.idkeyStat(257, 20, 1, true);
                Intent intent = new Intent();
                intent.putExtra("Select_Conv_Type", TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION);
                intent.putExtra("select_is_ret", true);
                C88144b.m109802t(iPCallShareCouponCardUI, ".ui.transmit.SelectConversationUI", intent, 1);
                break;
            case 1:
                String str3 = iPCallShareCouponCardUI.f19575x;
                String str4 = iPCallShareCouponCardUI.f19576y + String.format("&rt=%s", new Object[]{Integer.valueOf(itemId)});
                String str5 = iPCallShareCouponCardUI.f19573v;
                String str6 = iPCallShareCouponCardUI.f19574w;
                Log.m105925i("MicroMsg.IPCallShareCouponCardUI", "onShareSnsEvent>title:%s,onShareSnsEvent>url:%s,onShareSnsEvent>content:%s,onShareSnsEvent>content:%s", str3, str4, str5, str6);
                C12029d dVar2 = iPCallShareCouponCardUI.f19571t;
                dVar2.f35026c = (long) 1;
                dVar2.mo11891b();
                C115669n.INSTANCE.idkeyStat(257, 21, 1, true);
                Intent intent2 = new Intent();
                intent2.putExtra("Ksnsupload_type", 1);
                intent2.putExtra("need_result", false);
                intent2.putExtra("Ksnsupload_title", Util.nullAs(str3, ""));
                intent2.putExtra("Ksnsupload_imgurl", str6);
                intent2.putExtra("Ksnsupload_link", str4);
                String a = C86493v0.m107223a(WeChatBrands.Business.GROUP_WECHAT_OUT);
                C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", WeChatBrands.Business.GROUP_WECHAT_OUT);
                intent2.putExtra("reportSessionId", a);
                C88144b.m109795m(iPCallShareCouponCardUI, "sns", ".ui.SnsUploadUI", intent2, 1);
                break;
            case 2:
                String str7 = "MicroMsg.IPCallShareCouponCardUI";
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.putExtra("sms_body", str2);
                intent3.setType("vnd.android-dir/mms-sms");
                if (!Util.isIntentAvailable(iPCallShareCouponCardUI, intent3, true)) {
                    C76701a.makeText((Context) iPCallShareCouponCardUI, (int) C0966R.string.ik8, 1).show();
                    break;
                } else {
                    try {
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent3);
                        C117292a.m165358d(iPCallShareCouponCardUI, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        iPCallShareCouponCardUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    } catch (ActivityNotFoundException e) {
                        Log.m105920e(str7, "ActivityNotFoundException:" + e);
                        C76701a.makeText((Context) iPCallShareCouponCardUI, (int) C0966R.string.ik8, 1).show();
                        break;
                    } catch (Exception e2) {
                        Log.printErrStackTrace(str7, e2, "", new Object[0]);
                        break;
                    }
                }
            case 3:
                Intent intent4 = new Intent("android.intent.action.SEND");
                intent4.putExtra("android.intent.extra.SUBJECT", String.format(iPCallShareCouponCardUI.getString(C0966R.string.fx5), new Object[]{C75592q0.m90783m()}));
                intent4.putExtra("android.intent.extra.TEXT", str2);
                intent4.setType("plain/text");
                Intent createChooser = Intent.createChooser(intent4, iPCallShareCouponCardUI.getString(C0966R.string.frv));
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(createChooser);
                IPCallShareCouponCardUI iPCallShareCouponCardUI2 = iPCallShareCouponCardUI;
                C117292a.m165358d(iPCallShareCouponCardUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                iPCallShareCouponCardUI.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(iPCallShareCouponCardUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 4:
                String str8 = "MicroMsg.IPCallShareCouponCardUI";
                try {
                    Intent intent5 = new Intent();
                    intent5.setAction("android.intent.action.SEND");
                    intent5.putExtra("android.intent.extra.TEXT", str2);
                    intent5.setType("text/plain");
                    intent5.setPackage("com.whatsapp");
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent5);
                    C117292a.m165358d(iPCallShareCouponCardUI, aVar3.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    iPCallShareCouponCardUI.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
                } catch (Exception e3) {
                    Log.m105920e(str8, "go whatsapp error" + e3.getMessage());
                    break;
                }
            case 5:
                if (!(iPCallShareCouponCardUI.f19565n.f354643b != null)) {
                    C76879j.m92743n(iPCallShareCouponCardUI.getContext(), C0966R.string.j19, C0966R.string.a3h, new C4679f1(iPCallShareCouponCardUI), new C4721u0(iPCallShareCouponCardUI));
                    break;
                } else {
                    iPCallShareCouponCardUI.mo5554I7(16, str2, iPCallShareCouponCardUI.getString(C0966R.string.frx));
                    break;
                }
            case 6:
                if (!C75592q0.m90792v()) {
                    C76879j.m92743n(iPCallShareCouponCardUI.getContext(), C0966R.string.f361298is2, C0966R.string.a3h, new C4723v0(iPCallShareCouponCardUI), new C4726w0(iPCallShareCouponCardUI));
                    break;
                } else {
                    iPCallShareCouponCardUI.mo5554I7(8, str2, iPCallShareCouponCardUI.getString(C0966R.string.frs));
                    break;
                }
            case 7:
                try {
                    Intent intent6 = new Intent();
                    intent6.setAction("android.intent.action.SEND");
                    intent6.putExtra("android.intent.extra.TEXT", str2);
                    intent6.setType("text/plain");
                    intent6.setPackage("com.facebook.orca");
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(intent6);
                    str = "MicroMsg.IPCallShareCouponCardUI";
                    try {
                        C117292a.m165358d(iPCallShareCouponCardUI, aVar4.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        iPCallShareCouponCardUI.startActivity((Intent) aVar4.mo10231a(0));
                        C117292a.m165359e(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str = "MicroMsg.IPCallShareCouponCardUI";
                    Log.m105920e(str, "go facebook msger error" + e.getMessage());
                    C115669n.INSTANCE.mo160131h(13340, -1, 1, Integer.valueOf(itemId), -1, -1);
                }
            case 8:
                ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, str2);
                C76701a.makeText((Context) iPCallShareCouponCardUI, (int) C0966R.string.fv7, 0).show();
                break;
        }
        C115669n.INSTANCE.mo160131h(13340, -1, 1, Integer.valueOf(itemId), -1, -1);
    }
}
