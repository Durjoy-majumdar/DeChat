package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import eb0.C45628s0;
import eb0.C97625j3;
import eo3.C75635b;
import eo3.C75645e;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import te3.C51043r10;
import te3.C77961kx3;

/* renamed from: com.tencent.mm.ui.contact.t2 */
public class C74566t2 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMAddressUI.OpenIMAddressUIFragment f219179d;

    public C74566t2(OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f219179d = openIMAddressUIFragment;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        String str2;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("onItemClick ");
        sb.append(i2);
        C75635b bVar = this.f219179d.f218697g;
        Object obj = bVar;
        if (bVar != null) {
            obj = Boolean.valueOf(bVar.f222213x);
        }
        sb.append(obj);
        Log.m105924i("MicroMsg.OpenIMAddressUI", sb.toString());
        int headerViewsCount = i2 - this.f219179d.f218695e.getHeaderViewsCount();
        OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f219179d;
        C75635b bVar2 = openIMAddressUIFragment.f218697g;
        if (bVar2 == null || !bVar2.f222213x) {
            String str3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            C44655f fVar = (C44655f) openIMAddressUIFragment.f218696f.getItem(headerViewsCount);
            if (fVar != null) {
                String d = fVar.mo69642d();
                OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment2 = this.f219179d;
                openIMAddressUIFragment2.getClass();
                if (d != null && d.length() > 0) {
                    if (C72996z1.m85841l5(d)) {
                        Log.m105921e("MicroMsg.OpenIMAddressUI", "error, 4.5 do not contain this contact %s", d);
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("Contact_User", d);
                        if (C45628s0.m50743H(d)) {
                            intent.putExtra("Is_group_card", true);
                        }
                        if (d.length() > 0) {
                            C74584x.m89302e(intent, d);
                            C88144b.m109791i(openIMAddressUIFragment2.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str3);
            return;
        }
        boolean n = bVar2.mo7996n(headerViewsCount);
        boolean u = this.f219179d.f218697g.mo105986u(headerViewsCount);
        Log.m105924i("MicroMsg.OpenIMAddressUI", "onItemClick " + u);
        if (u) {
            C75635b bVar3 = this.f219179d.f218697g;
            bVar3.getClass();
            bVar3.mo105988x(new C75645e(bVar3, ""));
            str = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
        } else if (n) {
            C77961kx3 t = this.f219179d.f218697g.mo105985t(headerViewsCount);
            String str4 = t.f227763d.f141175d;
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str4);
            if (z1Var.mo62927s3()) {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", str4);
                intent2.putExtra("Contact_Scene", 3);
                if (str4 != null && str4.length() > 0) {
                    if (z1Var.mo62916m3()) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.kvStat(10298, str4 + "," + 3);
                    }
                    C74584x.m89302e(intent2, str4);
                    C88144b.m109791i(this.f219179d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                }
                str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            } else {
                Intent intent3 = new Intent();
                intent3.putExtra("Contact_User", t.f227763d.f141175d);
                intent3.putExtra("Contact_Alias", t.f227776t);
                intent3.putExtra("Contact_Nick", t.f227764e.f141175d);
                intent3.putExtra("Contact_Signature", t.f227771o);
                intent3.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(t.f227756A, t.f227769j, t.f227770n));
                intent3.putExtra("Contact_Sex", t.f227767h);
                intent3.putExtra("Contact_VUser_Info", t.f227774r);
                intent3.putExtra("Contact_VUser_Info_Flag", t.f227773q);
                intent3.putExtra("Contact_KWeibo_flag", t.f227778v);
                intent3.putExtra("Contact_KWeibo", t.f227775s);
                intent3.putExtra("Contact_KWeiboNick", t.f227777u);
                intent3.putExtra("Contact_KSnsIFlag", t.f227782z.f130392d);
                str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                intent3.putExtra("Contact_KSnsBgId", t.f227782z.f130394f);
                intent3.putExtra("Contact_KSnsBgUrl", t.f227782z.f130393e);
                C51043r10 r102 = t.f227758C;
                if (r102 != null) {
                    try {
                        intent3.putExtra("Contact_customInfo", r102.toByteArray());
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.OpenIMAddressUI", e, "", new Object[0]);
                    }
                }
                if ((t.f227773q & 8) > 0) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.kvStat(10298, str4 + "," + 3);
                }
                C88144b.m109791i(this.f219179d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
            }
            str = str2;
        } else {
            String str5 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            C72996z1 s = this.f219179d.f218697g.getItem(headerViewsCount);
            if (s == null) {
                Log.m105921e("MicroMsg.OpenIMAddressUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", Integer.valueOf(this.f219179d.f218697g.getCount()), Integer.valueOf(headerViewsCount));
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str5);
                return;
            }
            str = str5;
            String username = s.getUsername();
            if (C72996z1.m85841l5(username)) {
                Intent intent4 = new Intent(this.f219179d.getContext(), OpenIMAddressUI.class);
                intent4.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment3 = this.f219179d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent4);
                OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment4 = openIMAddressUIFragment3;
                C117292a.m165358d(openIMAddressUIFragment4, aVar.mo10232b(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                openIMAddressUIFragment3.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(openIMAddressUIFragment4, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
                return;
            }
            Intent intent5 = new Intent();
            intent5.putExtra("Contact_User", username);
            intent5.putExtra("Contact_Scene", 3);
            if (username != null && username.length() > 0) {
                C88144b.m109791i(this.f219179d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent5, (Bundle) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", str);
    }
}
