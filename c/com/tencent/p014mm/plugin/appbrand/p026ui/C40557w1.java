package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.profile.p088ui.WxaBindBizInfoUI;
import com.tencent.p014mm.protocal.protobuf.WxaRelateBrandInfo;
import com.tencent.p014mm.protocal.protobuf.WxaRelateBrandList;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.w1 */
public class C40557w1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WxaRelateBrandList f108946d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProfileUI f108947e;

    public C40557w1(AppBrandProfileUI appBrandProfileUI, WxaRelateBrandList wxaRelateBrandList) {
        this.f108947e = appBrandProfileUI;
        this.f108946d = wxaRelateBrandList;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f108946d.brand_info_list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<WxaRelateBrandInfo> it = this.f108946d.brand_info_list.iterator();
            while (it.hasNext()) {
                WxaRelateBrandInfo next = it.next();
                WxaAttributes.WxaEntryInfo wxaEntryInfo = new WxaAttributes.WxaEntryInfo();
                wxaEntryInfo.f108666d = next.username;
                wxaEntryInfo.f108667e = next.title;
                wxaEntryInfo.f108668f = next.desc;
                wxaEntryInfo.f108669g = next.icon_url;
                arrayList2.add(wxaEntryInfo);
            }
            Intent intent = new Intent(this.f108947e.getContext(), WxaBindBizInfoUI.class);
            intent.putExtra("register", this.f108946d.brand_register_title);
            intent.putParcelableArrayListExtra("wxa_entry_info_list", new ArrayList(arrayList2));
            AppCompatActivity context = this.f108947e.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$20", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$20", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            AppBrandProfileUI appBrandProfileUI = this.f108947e;
            int i = AppBrandProfileUI.f246424V;
            appBrandProfileUI.mo117090L7(3, 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
