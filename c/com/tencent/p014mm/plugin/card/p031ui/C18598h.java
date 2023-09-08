package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dz0.C20483c;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import hz0.C46153l0;
import hz0.C46156r;
import hz0.C76251l;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p755xs.C102720b;
import pz0.C47716a;
import qo3.C77407n;
import wz0.C53246b;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.ui.h */
public class C18598h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardDetailUIContoller f51939d;

    /* renamed from: com.tencent.mm.plugin.card.ui.h$a */
    public class C18599a implements C11182m0 {
        public C18599a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            for (int i = 0; i < C18598h.this.f51939d.f51789S.size(); i++) {
                if ("menu_func_delete".equals(C18598h.this.f51939d.f51787Q.get(Integer.valueOf(i)))) {
                    e0Var.mo107140d(i, C18598h.this.f51939d.f51797e.getResources().getColor(C0966R.color.f2966ao), C18598h.this.f51939d.f51789S.get(i));
                } else {
                    e0Var.mo107142f(i, C18598h.this.f51939d.f51789S.get(i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.h$b */
    public class C18600b implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.card.ui.h$b$a */
        public class C18601a extends C53248d.C53257i {
            public C18601a() {
            }

            /* renamed from: b */
            public void mo23409b(String str) {
                CardDetailUIContoller.C18581j jVar = C18598h.this.f51939d.f51790T;
                if (jVar != null) {
                    CardDetailUI cardDetailUI = CardDetailUI.this;
                    int i = CardDetailUI.f51728S;
                    cardDetailUI.getClass();
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(cardDetailUI.f51749g);
                    cardDetailUI.mo23351Q7(true);
                    C86709a0.m107529k().f251779b.mo123460f(new C46156r(linkedList));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.h$b$b */
        public class C18602b extends C53248d.C53257i {
            public C18602b() {
            }

            /* renamed from: b */
            public void mo23409b(String str) {
                CardDetailUIContoller.C18581j jVar = C18598h.this.f51939d.f51790T;
                if (jVar != null) {
                    C86709a0.m107529k().f251779b.mo123460f(new C47716a(CardDetailUI.this.f51749g));
                }
            }
        }

        public C18600b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str = C18598h.this.f51939d.f51787Q.get(Integer.valueOf(menuItem.getItemId()));
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("menu_func_share_friend")) {
                    CardDetailUIContoller cardDetailUIContoller = C18598h.this.f51939d;
                    C53246b.m59669a(cardDetailUIContoller.f51797e, 1, cardDetailUIContoller);
                    cardDetailUIContoller.f51797e.mmSetOnActivityResultCallback(cardDetailUIContoller);
                    C115669n nVar = C115669n.INSTANCE;
                    CardDetailUIContoller cardDetailUIContoller2 = C18598h.this.f51939d;
                    nVar.mo160131h(11324, "BrandContactView", Integer.valueOf(C18598h.this.f51939d.f51776E.mo23264L0().f64141i), C18598h.this.f51939d.f51776E.mo23270R0(), C18598h.this.f51939d.f51776E.getCardId(), 0, Integer.valueOf(C18598h.this.f51939d.f51791U.f51823b), cardDetailUIContoller2.f51791U.f51825d, Integer.valueOf(cardDetailUIContoller2.f51776E.mo23277X0() ? 1 : 0), "");
                    nVar.mo160131h(11582, "OperShareFriend", 1, Integer.valueOf(C18598h.this.f51939d.f51776E.mo23264L0().f64141i), C18598h.this.f51939d.f51776E.mo23270R0(), C18598h.this.f51939d.f51776E.getCardId(), C18598h.this.f51939d.f51780I);
                } else if (str.equals("menu_func_gift")) {
                    CardDetailUIContoller cardDetailUIContoller3 = C18598h.this.f51939d;
                    C53246b.m59669a(cardDetailUIContoller3.f51797e, 0, cardDetailUIContoller3);
                    cardDetailUIContoller3.f51797e.mmSetOnActivityResultCallback(cardDetailUIContoller3);
                } else if (str.equals("menu_func_delete")) {
                    String string = C18598h.this.f51939d.f51776E.mo23291o() ? C18598h.this.f51939d.f51797e.getString(C0966R.string.awr) : "";
                    CardDetailUIContoller cardDetailUIContoller4 = C18598h.this.f51939d;
                    C53248d.m59682b(cardDetailUIContoller4.f51797e, cardDetailUIContoller4.f51791U.f51824c, string, new C18601a());
                    C115669n.INSTANCE.mo160131h(11582, "OperDelete", 1, Integer.valueOf(C18598h.this.f51939d.f51776E.mo23264L0().f64141i), C18598h.this.f51939d.f51776E.mo23270R0(), C18598h.this.f51939d.f51776E.getCardId(), "");
                } else if (str.equals("menu_func_service")) {
                    if (!TextUtils.isEmpty(C18598h.this.f51939d.f51776E.mo23264L0().f64139g)) {
                        CardDetailUIContoller cardDetailUIContoller5 = C18598h.this.f51939d;
                        C53246b.m59680l(cardDetailUIContoller5.f51797e, cardDetailUIContoller5.f51776E.mo23264L0().f64139g);
                        C46153l0.Jx0().mo71409a(C18598h.this.f51939d.f51776E.getCardId(), C18598h.this.f51939d.f51776E.mo23270R0(), 1);
                    }
                    C115669n.INSTANCE.mo160131h(11582, "OperService", 1, Integer.valueOf(C18598h.this.f51939d.f51776E.mo23264L0().f64141i), C18598h.this.f51939d.f51776E.mo23270R0(), C18598h.this.f51939d.f51776E.getCardId(), C18598h.this.f51939d.f51791U.f51825d);
                } else if (str.equals("menu_func_report")) {
                    if (!TextUtils.isEmpty(C18598h.this.f51939d.f51776E.mo23263J0().f63955t)) {
                        CardDetailUIContoller cardDetailUIContoller6 = C18598h.this.f51939d;
                        C53246b.m59679k(cardDetailUIContoller6.f51797e, cardDetailUIContoller6.f51776E.mo23263J0().f63955t, C18598h.this.f51939d.mo23369j(C0966R.string.b0g));
                    }
                    C115669n.INSTANCE.mo160131h(11582, "OperReport", 1, Integer.valueOf(C18598h.this.f51939d.f51776E.mo23264L0().f64141i), C18598h.this.f51939d.f51776E.mo23270R0(), C18598h.this.f51939d.f51776E.getCardId(), "");
                } else if (str.equals("menu_func_share_timeline")) {
                    ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C76251l(C18598h.this.f51939d.f51776E.mo23264L0().f64137e));
                    CardDetailUIContoller cardDetailUIContoller7 = C18598h.this.f51939d;
                    MMActivity mMActivity = cardDetailUIContoller7.f51797e;
                    C20483c cVar = cardDetailUIContoller7.f51776E;
                    CardDetailUIContoller.C18575g gVar = cardDetailUIContoller7.f51791U;
                    String str2 = gVar.f51824c;
                    String str3 = gVar.f51827f;
                    Intent intent = new Intent();
                    intent.putExtra("Ksnsupload_link", cVar.mo23264L0().f64103A);
                    intent.putExtra("KContentObjDesc", cVar.mo23264L0().f64142j);
                    intent.putExtra("Ksnsupload_title", cVar.mo23264L0().f64143n);
                    if (TextUtils.isEmpty(str3)) {
                        intent.putExtra("KUploadProduct_UserData", str2 + "#");
                    } else {
                        intent.putExtra("KUploadProduct_UserData", str2 + "#" + str3);
                    }
                    intent.putExtra("Ksnsupload_imgurl", cVar.mo23264L0().f64137e);
                    if (!TextUtils.isEmpty(cVar.mo23264L0().f64137e)) {
                        intent.putExtra("KsnsUpload_imgPath", new C76251l(cVar.mo23264L0().f64137e).mo94827k());
                    }
                    Log.m105918d("MicroMsg.CardActivityHelper", "doShareTimeLine KSnsUploadImgPath:" + intent.getStringExtra("KsnsUpload_imgPath"));
                    intent.putExtra("src_username", C75592q0.m90789s());
                    intent.putExtra("src_displayname", C75592q0.m90783m());
                    intent.putExtra("Ksnsupload_appid", cVar.mo23264L0().f64138f);
                    intent.putExtra("Ksnsupload_appname", cVar.mo23264L0().f64139g);
                    intent.putExtra("Ksnsupload_type", 7);
                    String a = C86493v0.m107223a("card_package");
                    C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "card_package");
                    intent.putExtra("reportSessionId", a);
                    C88144b.m109792j(mMActivity, "sns", ".ui.SnsUploadUI", intent, false);
                    C115669n.INSTANCE.mo160131h(11582, "OperShareTimeLine", 1, Integer.valueOf(C18598h.this.f51939d.f51776E.mo23264L0().f64141i), C18598h.this.f51939d.f51776E.mo23270R0(), C18598h.this.f51939d.f51776E.getCardId(), C18598h.this.f51939d.f51791U.f51825d);
                } else if (str.equals("menu_func_delete_share_card")) {
                    CardDetailUIContoller cardDetailUIContoller8 = C18598h.this.f51939d;
                    C53248d.m59682b(cardDetailUIContoller8.f51797e, cardDetailUIContoller8.f51791U.f51824c, "", new C18602b());
                } else {
                    CardDetailUIContoller.C18574f fVar = C18598h.this.f51939d.f51788R.get(str);
                    if (!Util.isNullOrNil(fVar.f51820b)) {
                        C53246b.m59674f(fVar.f51820b, fVar.f51821c, 0);
                    } else if (!Util.isNullOrNil(fVar.f51819a)) {
                        C53246b.m59678j(C18598h.this.f51939d.f51797e, fVar.f51819a, 0);
                    }
                }
            }
        }
    }

    public C18598h(CardDetailUIContoller cardDetailUIContoller) {
        this.f51939d = cardDetailUIContoller;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.f51939d.f51776E == null) {
            Log.m105920e("MicroMsg.CardDetailUIContoller", "mCardInfo is null, err");
            return false;
        }
        C115669n.INSTANCE.mo160131h(11582, "CardDetailUiMenu", 1, Integer.valueOf(this.f51939d.f51776E.mo23264L0().f64141i), this.f51939d.f51776E.mo23270R0(), this.f51939d.f51776E.getCardId(), this.f51939d.f51791U.f51825d);
        C77407n nVar = new C77407n((Context) this.f51939d.f51797e, 1, false);
        nVar.f225771i = new C18599a();
        nVar.f225782p = new C18600b();
        nVar.mo107573q();
        return true;
    }
}
