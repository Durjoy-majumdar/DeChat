package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import eo3.C75635b;
import eo3.C75645e;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import p773yy.C79168k;
import te3.C51043r10;
import te3.C77961kx3;

/* renamed from: com.tencent.mm.ui.contact.d */
public class C74472d implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddressUI.AddressUIFragment f218996d;

    public C74472d(AddressUI.AddressUIFragment addressUIFragment) {
        this.f218996d = addressUIFragment;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("onItemClick ");
        sb.append(i2);
        C75635b bVar = this.f218996d.f218437r;
        Object obj = bVar;
        if (bVar != null) {
            obj = Boolean.valueOf(bVar.f222213x);
        }
        sb.append(obj);
        Log.m105924i("MicroMsg.AddressUI", sb.toString());
        String str2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
        String str3 = "onItemClick";
        if (i2 == 0 && !"@biz.contact".equals(this.f218996d.f218438s)) {
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", str3, str2);
        } else if (i2 < this.f218996d.f218434o.getHeaderViewsCount()) {
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", str3, str2);
        } else {
            int headerViewsCount = i2 - this.f218996d.f218434o.getHeaderViewsCount();
            AddressUI.AddressUIFragment addressUIFragment = this.f218996d;
            C75635b bVar2 = addressUIFragment.f218437r;
            if (bVar2 == null || !bVar2.f222213x) {
                C44655f fVar = (C44655f) addressUIFragment.f218436q.getItem(headerViewsCount);
                if (fVar != null) {
                    String d = fVar.mo69642d();
                    Activity context = this.f218996d.getContext();
                    if (d != null && d.length() > 0 && ((!C72996z1.m85843n5(d) && !C72996z1.m85844o5(d)) || WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(context))) {
                        if (C72996z1.m85841l5(d)) {
                            Log.m105921e("MicroMsg.AddressUI", "error, 4.5 do not contain this contact %s", d);
                        } else {
                            Intent intent = new Intent();
                            intent.putExtra("Contact_User", d);
                            if (C45628s0.m50743H(d)) {
                                intent.putExtra("Is_group_card", true);
                            }
                            if (d.length() > 0) {
                                C74584x.m89302e(intent, d);
                                intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                                C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                                ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(d, 10);
                            }
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", str3, str2);
                return;
            }
            boolean n = bVar2.mo7996n(headerViewsCount);
            boolean u = this.f218996d.f218437r.mo105986u(headerViewsCount);
            Log.m105924i("MicroMsg.AddressUI", "onItemClick " + u);
            if (u) {
                C75635b bVar3 = this.f218996d.f218437r;
                bVar3.getClass();
                bVar3.mo105988x(new C75645e(bVar3, ""));
            } else if (n) {
                C77961kx3 t = this.f218996d.f218437r.mo105985t(headerViewsCount);
                String str4 = t.f227763d.f141175d;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str4);
                String str5 = str2;
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
                        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                        C88144b.m109791i(this.f218996d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                    str = str3;
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
                    str = str3;
                    intent3.putExtra("Contact_KSnsBgId", t.f227782z.f130394f);
                    intent3.putExtra("Contact_KSnsBgUrl", t.f227782z.f130393e);
                    C51043r10 r102 = t.f227758C;
                    if (r102 != null) {
                        try {
                            intent3.putExtra("Contact_customInfo", r102.toByteArray());
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.AddressUI", e, "", new Object[0]);
                        }
                    }
                    if ((t.f227773q & 8) > 0) {
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.kvStat(10298, str4 + "," + 3);
                    }
                    intent3.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                    C88144b.m109791i(this.f218996d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                }
                str3 = str;
                str2 = str5;
            } else {
                String str6 = str2;
                String str7 = str3;
                C72996z1 s = this.f218996d.f218437r.getItem(headerViewsCount);
                if (s == null) {
                    Log.m105921e("MicroMsg.AddressUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", Integer.valueOf(this.f218996d.f218437r.getCount()), Integer.valueOf(headerViewsCount));
                    C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", str7, str6);
                    return;
                }
                str3 = str7;
                str2 = str6;
                String username = s.getUsername();
                if (C72996z1.m85841l5(username)) {
                    Intent intent4 = new Intent(this.f218996d.getContext(), AddressUI.class);
                    intent4.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                    AddressUI.AddressUIFragment addressUIFragment2 = this.f218996d;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent4);
                    AddressUI.AddressUIFragment addressUIFragment3 = addressUIFragment2;
                    C117292a.m165358d(addressUIFragment3, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    addressUIFragment2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(addressUIFragment3, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", str3, str2);
                    return;
                }
                Intent intent5 = new Intent();
                intent5.putExtra("Contact_User", username);
                intent5.putExtra("Contact_Scene", 3);
                intent5.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                if (username != null && username.length() > 0) {
                    C88144b.m109791i(this.f218996d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent5, (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$12", "android/widget/AdapterView$OnItemClickListener", str3, str2);
        }
    }
}
