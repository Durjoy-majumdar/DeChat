package gn1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.cache.MCacheItem;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gn1.C75991a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import ke3.C88144b;
import kr0.C76630x0;
import ln1.C21448d;
import p227rn.C48053v;
import p601lv.C76726b;
import p749xh.C53349s0;
import te3.C51043r10;
import te3.C78019ym2;
import z04.C112551y;
import z51.C79305f;

/* renamed from: gn1.f */
public final class C75996f implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f222851d;

    public C75996f(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222851d = nearbyPersonV1UIC;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$initContentView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        NearbyPersonV1UIC nearbyPersonV1UIC = this.f222851d;
        nearbyPersonV1UIC.getClass();
        Class cls = C76726b.class;
        int i3 = ((((C76726b) C86312j.m106911c(cls)).mo106908ei() || ((C76726b) C86312j.m106911c(cls)).mo106905Mb()) && nearbyPersonV1UIC.f198099i != null) ? i2 - 1 : i2;
        if (nearbyPersonV1UIC.f198102o) {
            i3--;
        }
        if (i3 >= 0 && i3 < nearbyPersonV1UIC.f198103p.size()) {
            C78019ym2 ym22 = nearbyPersonV1UIC.f198103p.get(i3);
            if (ym22.f228628j == 10000) {
                C75991a.C75992a aVar = (C75991a.C75992a) ((HashMap) nearbyPersonV1UIC.f222832f).get(ym22.f228622d);
                if (aVar != null) {
                    aVar.f222844l |= 1;
                    int i4 = aVar.f222840h;
                    if (i4 == 1) {
                        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                        appBrandStatObject.f245533f = 1134;
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(nearbyPersonV1UIC.getActivity(), aVar.f222841i, "", 0, 0, "", appBrandStatObject);
                    } else if (i4 == 2) {
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", aVar.f222841i);
                        intent.putExtra("geta8key_scene", 25);
                        intent.putExtra("stastic_scene", 12);
                        C88144b.m109791i(nearbyPersonV1UIC.getActivity(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    }
                } else {
                    throw new IllegalStateException("invalid type".toString());
                }
            } else {
                String str = ym22.f228622d;
                if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).mo62927s3()) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", str);
                    intent2.putExtra("Contact_Scene", 18);
                    intent2.putExtra("Sns_from_Scene", 18);
                    intent2.putExtra("lbs_ticket", ym22.f228619C);
                    intent2.putExtra("Contact_IsLbsGotoChatting", true);
                    if (str != null) {
                        if (str.length() > 0) {
                            SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                            SetLocalQQMobileEvent.C1133a aVar2 = setLocalQQMobileEvent.f9501d;
                            aVar2.f9503a = intent2;
                            aVar2.f9504b = str;
                            setLocalQQMobileEvent.publish();
                            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                            intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
                            ((C76726b) C86312j.m106911c(cls)).V00(intent2, nearbyPersonV1UIC.getActivity());
                        }
                    }
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("Contact_User", ym22.f228622d);
                    intent3.putExtra("Contact_Alias", ym22.f228633r);
                    intent3.putExtra("Contact_Nick", ym22.f228623e);
                    intent3.putExtra("Contact_Distance", ym22.f228627i);
                    intent3.putExtra("Contact_Signature", ym22.f228626h);
                    intent3.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(ym22.f228639x, ym22.f228624f, ym22.f228625g));
                    intent3.putExtra("Contact_Sex", ym22.f228628j);
                    intent3.putExtra("Contact_IsLBSFriend", true);
                    intent3.putExtra("Contact_Scene", 18);
                    intent3.putExtra("Contact_VUser_Info", ym22.f228631p);
                    intent3.putExtra("Contact_VUser_Info_Flag", ym22.f228630o);
                    intent3.putExtra("Contact_KWeibo_flag", ym22.f228636u);
                    intent3.putExtra("Contact_KWeibo", ym22.f228634s);
                    intent3.putExtra("Contact_KWeiboNick", ym22.f228635t);
                    intent3.putExtra("Contact_KSnsIFlag", ym22.f228638w.f130392d);
                    intent3.putExtra("Contact_KSnsBgId", ym22.f228638w.f130394f);
                    intent3.putExtra("Contact_KSnsBgUrl", ym22.f228638w.f130393e);
                    intent3.putExtra("lbs_ticket", ym22.f228619C);
                    intent3.putExtra("Contact_IsLbsGotoChatting", true);
                    if (ym22.f228617A != null) {
                        C53349s0 gE = ((C48053v) C86312j.m106911c(C48053v.class)).mo72616gE();
                        gE.field_brandList = ym22.f228617A;
                        C51043r10 r102 = ym22.f228618B;
                        gE.field_brandFlag = r102.f140656d;
                        gE.field_brandIconURL = r102.f140659g;
                        gE.field_extInfo = r102.f140657e;
                        gE.field_brandInfo = r102.f140658f;
                        intent3.putExtra("KBrandInfo_item", new MCacheItem((IAutoDBItem) gE));
                    }
                    intent3.putExtra("Sns_from_Scene", 18);
                    intent3.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                    intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 501);
                    ((C76726b) C86312j.m106911c(cls)).V00(intent3, nearbyPersonV1UIC.getActivity());
                }
                C21448d dVar = C21448d.f60723a;
                boolean g3 = nearbyPersonV1UIC.mo94859g3(ym22);
                int i5 = nearbyPersonV1UIC.f198105r;
                boolean z = (ym22.f228621E & 1) > 0;
                String str2 = ym22.f228622d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = ym22.f228627i;
                String str4 = str3 == null ? "" : str3;
                String str5 = ym22.f228639x;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = ym22.f228625g;
                if (str6 == null) {
                    str6 = "";
                }
                long j2 = g3 ? 1 : 0;
                long j3 = i5 != 1 ? i5 != 3 ? i5 != 4 ? 0 : 1 : 2 : 3;
                long j4 = z ? 1 : 0;
                String str7 = ym22.f228626h;
                C21448d.m24264c(dVar, str2, str5, str6, str4, j2, 2, j3, j4, (str7 == null || !(C112551y.m153811k(str7) ^ true)) ? 0 : 1, ((C79305f) C86312j.m106911c(C79305f.class)).mo109309L3(ym22.f228623e) ? 1 : 0, ((long) i2) + 1, (long) ym22.f228628j, 0, 4096, (Object) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$initContentView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
