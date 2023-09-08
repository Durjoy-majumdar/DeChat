package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.profile.model.WxaRegisterInfo;
import com.tencent.p014mm.plugin.profile.p088ui.WxaBindWxaInfoUI;
import com.tencent.p014mm.protocal.protobuf.WxaRelateWeAppInfo;
import com.tencent.p014mm.protocal.protobuf.WxaRelateWeAppList;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import sx3.C36907w;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.y1 */
public class C40561y1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI.C40537i f108955d;

    /* renamed from: e */
    public final /* synthetic */ String f108956e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandProfileUI f108957f;

    public C40561y1(AppBrandProfileUI appBrandProfileUI, AppBrandProfileUI.C40537i iVar, String str) {
        this.f108957f = appBrandProfileUI;
        this.f108955d = iVar;
        this.f108956e = str;
    }

    public void onClick(View view) {
        LinkedList<WxaRelateWeAppInfo> linkedList;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList arrayList2 = new ArrayList();
        for (WxaRelateWeAppList next : this.f108955d.f108891a) {
            if (!(next == null || (linkedList = next.weapp_info_list) == null || linkedList.isEmpty())) {
                String str = next.weapp_register_title;
                C87412m.m108593f(str, "wxaRelateWeAppList.weapp_register_title");
                LinkedList<WxaRelateWeAppInfo> linkedList2 = next.weapp_info_list;
                C87412m.m108593f(linkedList2, "wxaRelateWeAppList.weapp_info_list");
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList2, 10));
                for (WxaRelateWeAppInfo wxaRelateWeAppInfo : linkedList2) {
                    C87412m.m108593f(wxaRelateWeAppInfo, LocaleUtil.ITALIAN);
                    WxaAttributes.WxaEntryInfo wxaEntryInfo = new WxaAttributes.WxaEntryInfo();
                    wxaEntryInfo.f108666d = wxaRelateWeAppInfo.username;
                    wxaEntryInfo.f108667e = wxaRelateWeAppInfo.title;
                    wxaEntryInfo.f108668f = wxaRelateWeAppInfo.desc;
                    wxaEntryInfo.f108669g = wxaRelateWeAppInfo.icon_url;
                    arrayList3.add(wxaEntryInfo);
                }
                arrayList2.add(new WxaRegisterInfo(str, arrayList3));
            }
        }
        Intent intent = new Intent(this.f108957f.getContext(), WxaBindWxaInfoUI.class);
        intent.putExtra("register", this.f108956e);
        intent.putParcelableArrayListExtra("wxa_register_info_list", arrayList2);
        AppCompatActivity context = this.f108957f.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        AppBrandProfileUI appBrandProfileUI = this.f108957f;
        int i = AppBrandProfileUI.f246424V;
        appBrandProfileUI.mo117090L7(23, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
