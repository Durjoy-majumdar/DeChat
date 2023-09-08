package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import p214om.C11502f;
import p227rn.C48053v;
import p248ug.C52558c;
import rb0.C47984k;
import te3.ey4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.d */
public class C40661d implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseBizContactListView f109247d;

    public C40661d(EnterpriseBizContactListView enterpriseBizContactListView) {
        this.f109247d = enterpriseBizContactListView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof EnterpriseBizContactListView.C40616g)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        EnterpriseBizContactListView.C40616g gVar = (EnterpriseBizContactListView.C40616g) tag;
        ey4 ey4 = gVar.f109111c;
        if (ey4 != null) {
            this.f109247d.f109090A.mo63524a(ey4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else if (Util.isNullOrNil(gVar.f109109a)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            boolean m = C47984k.m53339m(gVar.f109109a);
            boolean OE = ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(gVar.f109109a);
            C52558c b = C47984k.m53328b(gVar.f109109a);
            String B = b == null ? null : b.mo72807B();
            if (B == null) {
                B = "";
            }
            if (m) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", B);
                intent.putExtra("useJs", true);
                intent.putExtra("srcUsername", gVar.f109109a);
                intent.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent.addFlags(67108864);
                C88144b.m109791i(this.f109247d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                EnterpriseBizContactListView.m43852g(this.f109247d, b, 2);
                C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (OE) {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", gVar.f109109a);
                intent2.addFlags(67108864);
                intent2.putExtra("biz_chat_from_scene", 3);
                C88144b.m109801s(this.f109247d.getContext(), ".ui.bizchat.BizChatConversationUI", intent2, (Bundle) null);
            } else {
                Intent intent3 = new Intent();
                intent3.addFlags(67108864);
                intent3.putExtra("finish_direct", true);
                intent3.putExtra("Chat_User", gVar.f109109a);
                intent3.putExtra("chat_from_scene", 2);
                Context context = this.f109247d.getContext();
                Log.m105924i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent3, context);
                EnterpriseBizContactListView.m43852g(this.f109247d, b, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
