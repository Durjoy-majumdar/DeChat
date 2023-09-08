package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import f12.C7970a;
import i21.C98591h;
import ke3.C88144b;
import sf0.C77702q0;
import uj3.C78208e;
import zj3.C79348e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r6 */
public class C74196r6 extends C73684f2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.r6$a */
    public class C74197a implements C88144b.C76564c {
        public C74197a() {
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            if (i == 2002) {
                if (intent == null) {
                    Log.m105921e("MicroMsg.LocationClickListener", "[onActivityResult] null == data, requestCode:%s resultCode:%s", Integer.valueOf(i), Integer.valueOf(i2));
                } else if (intent.getBooleanExtra("kfavorite", false)) {
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124257k(doFavoriteEvent, intent);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264685j = C74196r6.this.f216339d.f193286j;
                    aVar.f264688m = 42;
                    doFavoriteEvent.publish();
                }
            }
        }
    }

    public C74196r6(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        if (WeChatBrands.Business.Entries.SessionLocation.checkAvailable(view.getContext())) {
            mo103228b((C74243t8) view.getTag());
        }
    }

    /* renamed from: b */
    public final void mo103228b(C74243t8 t8Var) {
        int t;
        C72963f4 f4Var = t8Var.f212238a;
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        String content = f4Var.getContent();
        boolean z = f4Var.mo108769t2() == 0;
        String t2 = z ? f4Var.mo108768t() : "";
        if (C72996z1.m85820U5(f4Var.mo108768t()) && z) {
            if (!((C79348e) this.f216339d.f193278b.mo102812a(C79348e.class)).mo70071q1() && (t = C75604z3.m90848t(content)) != -1) {
                t2 = content.substring(0, t).trim();
                content = content.substring(t + 1).trim();
            }
        }
        C72963f4.C72968e Tx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Tx0(content);
        if (!C77702q0.m93719b(t2) && C72996z1.m85820U5(t2)) {
            t2 = "";
        }
        LocationServerEvent locationServerEvent = new LocationServerEvent();
        LocationServerEvent.C67729a aVar = locationServerEvent.f193728d;
        aVar.f193730a = 1;
        aVar.f193733d = f4Var;
        locationServerEvent.publish();
        LocationServerEvent.C67730b bVar = locationServerEvent.f193729e;
        String str = bVar.f193734a;
        String str2 = bVar.f193735b;
        if (!C77702q0.m93719b(Tx0.f212708f) || Tx0.mo101030b()) {
            Intent intent = new Intent();
            intent.putExtra("kMsgId", f4Var.getMsgId());
            intent.putExtra("map_view_type", 1);
            intent.putExtra("map_indoor_support", 1);
            intent.putExtra("kwebmap_slat", Tx0.f212704b);
            intent.putExtra("kwebmap_lng", Tx0.f212705c);
            intent.putExtra("kwebmap_scale", Tx0.f212706d);
            intent.putExtra("kPoiName", Tx0.f212708f);
            intent.putExtra("kisUsername", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(t2));
            intent.putExtra("Kwebmap_locaion", str);
            C97625j3.m125812b().getClass();
            intent.putExtra("kimg_path", C7970a.m8127a());
            intent.putExtra("map_talker_name", f4Var.mo108768t());
            intent.putExtra("view_type_key", 0);
            intent.putExtra("kwebmap_from_to", true);
            intent.putExtra("kPoi_url", Tx0.f212713k);
            intent.putExtra("kPoiid", Tx0.f212714l);
            intent.putExtra("KIsFromPoiList", Tx0.f212715m);
            intent.putExtra("KPoiCategoryTips", Tx0.f212716n);
            intent.putExtra("kPoiBusinessHour", Tx0.f212717o);
            intent.putExtra("KPoiPhone", Tx0.f212718p);
            intent.putExtra("KPoiPriceTips", Tx0.f212719q);
            intent.putExtra("kBuildingID", Tx0.f212720r);
            intent.putExtra("kFloorName", Tx0.f212721s);
            String z2 = f4Var.mo108775z2();
            if (z2 == null) {
                z2 = "";
            }
            intent.putExtra("soso_street_view_url", z2);
            C115669n.INSTANCE.mo160131h(12809, 2, "");
            if (this.f216339d.mo91583x()) {
                intent.putExtra("type_tag", 2);
            } else {
                intent.putExtra("type_tag", 1);
            }
            C88144b.m109798p(this.f216339d.f193279c, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 2002, new C74197a());
            return;
        }
        Log.m105929w("MicroMsg.LocationClickListener", "invalid poi: %s, %s", Tx0.f212708f, Boolean.valueOf(Tx0.mo101030b()));
    }

    public C74196r6(C67391b bVar, int i, C72963f4 f4Var, View view) {
        super(bVar);
        if (i == 1) {
            mo103228b(new C74243t8(f4Var, bVar.mo91583x(), C78208e.C78209a.f229159a, (String) null, false));
        }
    }
}
