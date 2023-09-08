package pp1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import cj1.C54789l6;
import cj1.C54804r0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C60169f4;
import j20.C117292a;
import java.net.URLDecoder;
import java.util.ArrayList;
import jq3.C60905o;
import np1.C61881v;
import org.json.JSONObject;
import rx3.C13598b0;
import t91.C64208c;
import te3.C50019jp1;
import te3.C64426ho2;
import te3.C64498ko2;
import te3.t44;
import tf0.C64916p1;
import wi0.C91003z;

/* renamed from: pp1.k */
public final class C62486k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62461j f177524d;

    public C62486k(C62461j jVar) {
        this.f177524d = jVar;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C64426ho2 ho22;
        Class cls = C54991o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58739j4 j4Var = C58739j4.f168176a;
        if (j4Var.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionShopWindowClick, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (JSONObject) null, 504, (Object) null);
        t44 t44 = ((C54979h1) this.f177524d.f177481f.mo71262a(C54979h1.class)).f154117I;
        if (t44 != null) {
            C62461j jVar = this.f177524d;
            C61881v vVar = C61881v.f175961a;
            C50019jp1 jp12 = t44.f185487f;
            if (jp12 == null || (str5 = jp12.f136237d) == null) {
                str5 = "";
            }
            if (jp12 == null || (str6 = jp12.f136238e) == null) {
                str6 = "";
            }
            long j = ((C55001u) jVar.f177481f.mo71262a(C55001u.class)).f154420q.f182392d;
            String str7 = ((C54991o) jVar.f177481f.mo71262a(cls)).f154345o;
            String str8 = "";
            String str9 = "(Landroid/view/View;)V";
            String str10 = "onClick";
            String valueOf = String.valueOf(((C54991o) jVar.f177481f.mo71262a(cls)).f154325i1);
            String str11 = ((C54991o) jVar.f177481f.mo71262a(cls)).f154318g2;
            String str12 = ((C54991o) jVar.f177481f.mo71262a(cls)).f154199F1;
            String str13 = str12 == null ? str8 : str12;
            String str14 = "android/view/View$OnClickListener";
            C87412m.m108594g(str7, "anchorUserName");
            C87412m.m108594g(valueOf, "sessionId");
            C87412m.m108594g(str11, "requestId");
            String obj = Util.getUuidRandom().toString();
            String str15 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
            C86299o oVar = new C86299o();
            oVar.f250930b = str5;
            oVar.f250934f = str6;
            oVar.f250937i = new C54789l6();
            oVar.f250939k = 1177;
            oVar.f250940l = "shop_window" + XVFSFile.PATH_SEPARATOR_CHAR + j + XVFSFile.PATH_SEPARATOR_CHAR + str7 + "::" + valueOf + XVFSFile.PATH_SEPARATOR_CHAR + obj + XVFSFile.PATH_SEPARATOR_CHAR + str11 + XVFSFile.PATH_SEPARATOR_CHAR + str13;
            oVar.f250931c = j4Var.mo83673A();
            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            String str16 = oVar.f250940l;
            C87412m.m108593f(str16, "sceneNote");
            f0Var.getClass();
            f0Var.f151475s = str16;
            C64208c.C64209a aVar = C64208c.f181951a;
            C87412m.m108594g(obj, "<set-?>");
            C64208c.f181967q = obj;
            String str17 = oVar.f250930b;
            C87412m.m108593f(str17, "bundle.appId");
            ((C60169f4) C86312j.m106911c(C60169f4.class)).uv0(3, str17, obj, 1177, valueOf, "shop_window", str11);
            vVar.mo86813e(oVar);
            C91003z zVar = C91003z.POPUP;
            oVar.f250923L = zVar;
            oVar.f250924M = zVar;
            int i = t44.f185486e;
            if (i == 0) {
                C54804r0 r0Var = C54804r0.f153631a;
                Context context = jVar.f177480e.getContext();
                C87412m.m108593f(context, "root.context");
                r0Var.mo75766h(context, jVar.f177481f, oVar, true, (ValueCallback<String>) null);
            } else if (i == 1) {
                C7335d c2 = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
                C64916p1 p1Var = (C64916p1) c2;
                Context context2 = jVar.f177480e.getContext();
                C87412m.m108593f(context2, "root.context");
                FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                finderJumpInfo.jumpinfo_type = 6;
                C64498ko2 ko22 = t44.f185488g;
                String str18 = null;
                if (ko22 != null) {
                    ho22 = new C64426ho2();
                    ho22.f183521d = ko22.f183971d;
                    ho22.f183522e = ko22.f183972e;
                    ho22.f183523f = URLDecoder.decode(ko22.f183973f, "UTF-8");
                } else {
                    ho22 = null;
                }
                finderJumpInfo.lite_app_info = ho22;
                MiniAppInfo miniAppInfo = new MiniAppInfo();
                miniAppInfo.app_id = oVar.f250930b;
                miniAppInfo.path = oVar.f250934f;
                C50019jp1 jp13 = t44.f185487f;
                if (jp13 != null) {
                    str18 = jp13.f136239f;
                }
                miniAppInfo.appusername = str18;
                miniAppInfo.version_type = j4Var.mo83673A();
                finderJumpInfo.mini_app_info = miniAppInfo;
                C13598b0 b0Var = C13598b0.f38549a;
                C64916p1.C64917a.m76438e(p1Var, context2, finderJumpInfo, oVar, 0, (C60905o) null, 24, (Object) null);
            }
            str2 = str14;
            str4 = str9;
            str3 = str10;
            str = str15;
        } else {
            str4 = "(Landroid/view/View;)V";
            str3 = "onClick";
            str2 = "android/view/View$OnClickListener";
            str = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
        }
        C117292a.m165361g(this, str, str2, str3, str4);
    }
}
