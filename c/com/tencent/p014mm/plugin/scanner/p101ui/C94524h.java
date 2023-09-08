package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.plugin.scanner.model.C94481y;
import com.tencent.p014mm.plugin.scanner.p101ui.ProductUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p272xq.C102712e;
import p272xq.C15878h;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101835rd0;
import vl2.C102216y;

/* renamed from: com.tencent.mm.plugin.scanner.ui.h */
public class C94524h implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ ProductUI f273344a;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.h$a */
    public class C94525a implements C76879j.C76888o {
        public C94525a() {
        }

        /* renamed from: a */
        public void mo5759a(int i, int i2) {
            if (i2 != -1) {
                Log.m105918d("MicroMsg.scanner.ProductUI", "do del cancel");
                return;
            }
            DeleteFavoriteEvent deleteFavoriteEvent = new DeleteFavoriteEvent();
            deleteFavoriteEvent.f264667d.f264669a = C94524h.this.f273344a.getIntent().getLongExtra("key_favorite_local_id", -1);
            deleteFavoriteEvent.f264667d.f264670b = 10;
            deleteFavoriteEvent.publish();
            Log.m105919d("MicroMsg.scanner.ProductUI", "do del fav product, local id %d, result %B", Long.valueOf(deleteFavoriteEvent.f264667d.f264669a), Boolean.valueOf(deleteFavoriteEvent.f264668e.f264671a));
            if (deleteFavoriteEvent.f264668e.f264671a) {
                C94524h.this.f273344a.finish();
            }
        }
    }

    public C94524h(ProductUI productUI) {
        this.f273344a = productUI;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        int i3 = i2;
        ProductUI productUI = this.f273344a;
        C102216y.C102217a aVar = productUI.f273242q;
        if (aVar != null) {
            if (i3 == -1) {
                C76879j.m92732c(productUI.getContext(), this.f273344a.getContext().getString(C0966R.string.f7946x3), (List<String>) null, (List<Integer>) null, this.f273344a.getContext().getString(C0966R.string.f7944x1), new C94525a());
            } else if (i3 == 0) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(11446, aVar.field_productid, 2);
                if (this.f273344a.f273246u == 3) {
                    ((C15878h) C86312j.m106911c(C15878h.class)).mo14530mG(this.f273344a.getIntent().getLongExtra("key_favorite_local_id", -1), 1, 0);
                    nVar.mo160131h(10651, 10, 0, 0);
                }
                Intent intent = new Intent();
                intent.putExtra("KContentObjDesc", this.f273344a.f273242q.field_subtitle);
                intent.putExtra("Ksnsupload_title", this.f273344a.f273242q.field_title);
                intent.putExtra("Ksnsupload_link", this.f273344a.f273242q.field_shareurl);
                ProductUI productUI2 = this.f273344a;
                intent.putExtra("Ksnsupload_appname", C102216y.m134692b(productUI2, productUI2.f273242q.field_type));
                intent.putExtra("Ksnsupload_appid", C94481y.m119504a(this.f273344a.f273242q.field_functionType));
                intent.putExtra("Ksnsupload_imgurl", this.f273344a.f273242q.field_thumburl);
                Log.m105924i("MicroMsg.scanner.ProductUI", "product.field_thumburl : " + this.f273344a.f273242q.field_thumburl);
                ProductUI.C71012o oVar = this.f273344a.f273250y;
                if (oVar != null) {
                    intent.putExtra("KsnsUpload_imgPath", oVar.mo94827k());
                } else {
                    Log.m105920e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
                }
                intent.putExtra("Ksnsupload_type", 3);
                intent.putExtra("KUploadProduct_UserData", C102216y.m134691a(this.f273344a.f273242q));
                intent.putExtra("KUploadProduct_subType", this.f273344a.f273242q.field_type);
                String a = C86493v0.m107223a("scan_product");
                C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "scan_product");
                intent.putExtra("reportSessionId", a);
                C88144b.m109791i(this.f273344a, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
            } else if (i3 == 1) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(11446, aVar.field_productid, 1);
                String c = C94481y.m119506c(this.f273344a.getContext(), this.f273344a.f273242q);
                Intent intent2 = new Intent();
                intent2.putExtra("Retr_Msg_content", c);
                intent2.putExtra("Retr_Msg_Type", 2);
                ProductUI.C71012o oVar2 = this.f273344a.f273250y;
                if (oVar2 != null) {
                    intent2.putExtra("Retr_Msg_thumb_path", oVar2.mo94827k());
                } else {
                    Log.m105920e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
                }
                intent2.putExtra("Retr_go_to_chattingUI", false);
                intent2.putExtra("Retr_show_success_tips", true);
                ((C67654r1) C5176w.m5203a()).mo93184q(intent2, this.f273344a);
                if (this.f273344a.f273246u == 3) {
                    nVar2.mo160131h(10651, 10, 1, 0);
                }
            } else if (i3 == 2) {
                C115669n.INSTANCE.mo160131h(11446, aVar.field_productid, 3);
                ProductUI productUI3 = this.f273344a;
                if (productUI3.f273242q == null) {
                    Log.m105928w("MicroMsg.scanner.ProductUI", "do favorite, but product is null");
                    return;
                }
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                C101801kd0 kd02 = new C101801kd0();
                C101835rd0 rd02 = new C101835rd0();
                C101793jd0 jd02 = new C101793jd0();
                rd02.mo141275k(C75592q0.m90789s());
                rd02.mo141279o(C75592q0.m90789s());
                rd02.mo141277m(8);
                rd02.mo141273f(Util.nowMilliSecond());
                rd02.mo141272d(C94481y.m119504a(productUI3.f273242q.field_functionType));
                jd02.mo141207o(productUI3.f273242q.field_title);
                jd02.mo141204l(productUI3.f273242q.field_subtitle);
                jd02.mo141208p(productUI3.f273242q.field_type);
                jd02.mo141205m(C102216y.m134691a(productUI3.f273242q));
                jd02.mo141206n(productUI3.f273242q.field_thumburl);
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                C102216y.C102217a aVar3 = productUI3.f273242q;
                aVar2.f264679d = aVar3.field_title;
                aVar2.f264680e = aVar3.field_subtitle;
                aVar2.f264676a = kd02;
                aVar2.f264678c = 10;
                kd02.mo141219q(rd02);
                kd02.mo141218p(jd02);
                DoFavoriteEvent.C92474a aVar4 = doFavoriteEvent.f264674d;
                aVar4.f264688m = 11;
                aVar4.f264684i = productUI3;
                doFavoriteEvent.publish();
            } else if (i3 == 3) {
                Intent intent3 = new Intent();
                intent3.putExtra("key_fav_scene", 2);
                intent3.putExtra("key_fav_item_id", this.f273344a.getIntent().getLongExtra("key_favorite_local_id", -1));
                ((C102712e) C86312j.m106911c(C102712e.class)).F20(this.f273344a.getContext(), ".ui.FavTagEditUI", intent3);
            } else if (i3 == 4) {
                Intent intent4 = new Intent();
                intent4.putExtra("rawUrl", this.f273344a.f273242q.field_exposeurl);
                C88144b.m109791i(this.f273344a.getContext(), "webview", ".ui.tools.WebViewUI", intent4, (Bundle) null);
            }
        }
    }
}
