package er1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelStartLive;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60200t1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ks3.C10408g;
import o40.C11348f;
import ob0.C89132b;
import org.json.JSONObject;
import ot1.C11767a;
import p763ym.C79138l;
import qg1.C62616r;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48757as1;
import te3.C50169kr1;
import te3.C50336m11;
import te3.C51006qs1;
import te3.C64508l11;
import te3.cg4;
import tf0.C13883o1;
import zc1.C66785b;

/* renamed from: er1.p3 */
public final class C58765p3 {

    /* renamed from: a */
    public static final C58765p3 f168247a = new C58765p3();

    /* renamed from: b */
    public static final List<Integer> f168248b = C64197v.m75537f(1, 2, 7, 8, 9, 10);

    /* renamed from: er1.p3$a */
    public static final class C58766a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ int f168249a;

        /* renamed from: b */
        public final /* synthetic */ String f168250b;

        public C58766a(int i, String str) {
            this.f168249a = i;
            this.f168250b = str;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            C58765p3.f168247a.mo83806e(this.f168249a, this.f168250b);
        }
    }

    /* renamed from: er1.p3$b */
    public static final class C58767b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Intent f168251a;

        /* renamed from: b */
        public final /* synthetic */ String f168252b;

        /* renamed from: c */
        public final /* synthetic */ int f168253c;

        /* renamed from: d */
        public final /* synthetic */ String f168254d;

        public C58767b(Intent intent, String str, int i, int i2, String str2) {
            this.f168251a = intent;
            this.f168252b = str;
            this.f168253c = i2;
            this.f168254d = str2;
        }

        public Object call(Object obj) {
            C51006qs1 qs12;
            String str;
            String str2;
            LinkedList<C51006qs1> linkedList;
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C50336m11 m112 = (C50336m11) cVar.f256796d;
                C48757as1 as12 = null;
                if (m112 == null || (linkedList = m112.f137744d) == null) {
                    qs12 = null;
                } else {
                    String str3 = this.f168252b;
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        C50169kr1 kr12 = ((C51006qs1) t).f140523e;
                        if (C87412m.m108589b(kr12 != null ? kr12.f137001d : null, str3)) {
                            break;
                        }
                    }
                    qs12 = (C51006qs1) t;
                }
                if (qs12 != null) {
                    as12 = qs12.f140525g;
                }
                if (as12 == null) {
                    C58765p3 p3Var = C58765p3.f168247a;
                    Log.m105928w("Finder.FinderThirdPartyGameLiveUtil", "detail null");
                } else {
                    C48757as1 as13 = qs12.f140525g;
                    String str4 = "";
                    if (as13 == null || (str = as13.f130749e) == null) {
                        str = str4;
                    }
                    if (!(as13 == null || (str2 = as13.f130748d) == null)) {
                        str4 = str2;
                    }
                    this.f168251a.putExtra("COVER_URL", str);
                    this.f168251a.putExtra("DESC", str4);
                    this.f168251a.putExtra("APPID", this.f168252b);
                    this.f168251a.putExtra("POST_FROM_SCENE", 0);
                    this.f168251a.putExtra("GameUserInfo", qs12.toByteArray());
                    if (this.f168253c != 0) {
                        cg4 cg4 = new cg4();
                        String str5 = this.f168252b;
                        int i = this.f168253c;
                        String str6 = this.f168254d;
                        cg4.f182476d = str5;
                        cg4.f182478f = i;
                        cg4.f182479g = str6;
                        this.f168251a.putExtra("KEY_FROM_THIRD_PARTY_SHARE", cg4.toByteArray());
                    }
                    this.f168251a.addFlags(536870912);
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13281h6(context, this.f168251a);
                }
                return C13598b0.f38549a;
            }
            C58765p3 p3Var2 = C58765p3.f168247a;
            Log.m105928w("Finder.FinderThirdPartyGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
            return Boolean.valueOf(C11767a.f34453a.mo11665g(cVar.f256793a, cVar.f256794b, ((C50336m11) cVar.f256796d).f137745e));
        }
    }

    /* renamed from: a */
    public final void mo83802a(JSONObject jSONObject, String str, Intent intent) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        Intent intent2 = intent;
        Class cls = C13883o1.class;
        boolean z = true;
        switch (jSONObject2.getInt("liveEntryScene")) {
            case 1:
                if (!C58739j4.f168176a.mo83679H()) {
                    int i = C10408g.f31631a;
                    intent2.putExtra("KEY_AUTH_MODE", 2);
                    intent2.putExtra("KEY_POST_LIVE_APPID", str2);
                    intent2.putExtra("KEY_POST_LIVE_JSON", jSONObject.toString());
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    ((C13883o1) C86312j.m106911c(cls)).mo13275Z3(context, intent2);
                    return;
                }
                mo83805d(jSONObject, str, intent);
                return;
            case 2:
                try {
                    C58782w0 w0Var = C58782w0.f168290a;
                    String string = jSONObject2.getString("ticket");
                    int i2 = jSONObject2.getInt(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY);
                    String string2 = jSONObject2.getString("gameUserId");
                    Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "jumpGameAuthUI platformId:" + i2 + ", appid:" + str2 + ", gameUserId:" + string2 + ", ticket:" + string);
                    cg4 cg4 = new cg4();
                    cg4.f182476d = str2 == null ? "" : str2;
                    cg4.f182477e = string;
                    cg4.f182478f = i2;
                    cg4.f182479g = string2;
                    intent2.putExtra("KEY_FROM_THIRD_PARTY_SHARE", cg4.toByteArray());
                    intent2.putExtra("KEY_TICKET", string);
                    intent2.putExtra("KEY_APPID", str2);
                    intent2.putExtra("KEY_FROM_SCAN", false);
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    ((C13883o1) C86312j.m106911c(cls)).mo13275Z3(context2, intent2);
                    return;
                } catch (Throwable unused) {
                    C11348f.C11349a.m11178b(C59319a.f169618b, "AUTH_ERROR_1", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                    if (str2 == null) {
                        str2 = "";
                    }
                    mo83806e(-1, str2);
                    return;
                }
            case 3:
                mo83804c(1, jSONObject2);
                return;
            case 4:
                mo83804c(0, jSONObject2);
                return;
            case 5:
                mo83804c(2, jSONObject2);
                return;
            case 6:
                mo83804c(0, jSONObject2);
                return;
            case 7:
                String string3 = jSONObject2.getString("liveObjectExportId");
                if (!(string3 == null || string3.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    mo83804c(3, jSONObject2);
                    return;
                }
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 3);
                mo83805d(jSONObject, str, intent);
                return;
            case 8:
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 4);
                mo83805d(jSONObject, str, intent);
                return;
            case 9:
                String string4 = jSONObject2.getString("liveObjectExportId");
                if (!(string4 == null || string4.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    mo83804c(5, jSONObject2);
                    return;
                }
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 5);
                mo83805d(jSONObject, str, intent);
                return;
            case 10:
                String string5 = jSONObject2.getString("liveObjectExportId");
                if (!(string5 == null || string5.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    mo83804c(6, jSONObject2);
                    return;
                }
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 6);
                mo83805d(jSONObject, str, intent);
                return;
            default:
                mo83803b(10001, "error entry scene", str2);
                return;
        }
    }

    /* renamed from: b */
    public final void mo83803b(int i, String str, String str2) {
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(str2, "appid");
        Log.m105920e("Finder.FinderThirdPartyGameLiveUtil", "fallback errMsg:" + str + ", appid:" + str2);
        C77426q qVar = new C77426q(MMApplicationContext.getContext());
        qVar.mo107606r(MMApplicationContext.getContext().getString(C0966R.string.f360577fp1));
        qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.f360576fp0));
        qVar.mo107589a(true);
        qVar.mo107602n(MMApplicationContext.getContext().getString(C0966R.string.a18));
        qVar.mo107600l(new C58766a(i, str2));
        qVar.mo107603o();
    }

    /* renamed from: c */
    public final void mo83804c(int i, JSONObject jSONObject) {
        Class cls = C60200t1.class;
        Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "jumpGameLiveUI action:" + i);
        String string = jSONObject.getString("liveObjectExportId");
        String R1 = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(11, 8, 65);
        ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83790h6(i, string, 0, C66785b.f191882e.mo90662O5(), R1, "");
    }

    /* renamed from: d */
    public final void mo83805d(JSONObject jSONObject, String str, Intent intent) {
        C87412m.m108594g(jSONObject, "json");
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(intent, "intent");
        String optString = jSONObject.optString("extraAntiInfo", "");
        int optInt = jSONObject.optInt(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, 0);
        String optString2 = jSONObject.optString("gameUserId");
        String str2 = optString2 == null ? "" : optString2;
        Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "jumpGamePostUI platformId:" + optInt + ", gameUserId:" + str2);
        C62616r rVar = new C62616r(str, 0, false);
        C64508l11 l112 = rVar.f177821t;
        l112.f184016j = 1;
        l112.f184015i = optString;
        l112.f184017n = optInt;
        l112.f184018o = str2;
        rVar.mo9225i().mo123420E(new C58767b(intent, str, 0, optInt, str2));
    }

    /* renamed from: e */
    public final void mo83806e(int i, String str) {
        C87412m.m108594g(str, "appid");
        Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "returnBack errCode:" + i + ", appid:" + str);
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str);
        Bundle bundle = new Bundle();
        WXChannelStartLive.Resp resp = new WXChannelStartLive.Resp();
        resp.errCode = i;
        resp.extMsg = "";
        if (appInfo == null) {
            Log.m105928w("Finder.FinderThirdPartyGameLiveUtil", "can not find app info");
            return;
        }
        resp.toBundle(bundle);
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = appInfo.field_packageName;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }
}
