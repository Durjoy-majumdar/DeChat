package xk1;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLiveAuthUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58765p3;
import er1.C58782w0;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import nr3.C89059e;
import o40.C11348f;
import ob0.C89132b;
import p763ym.C39072t;
import qg1.C62616r;
import rx3.C13598b0;
import te3.C64408gz0;
import te3.C64508l11;
import te3.C64638pv3;
import te3.cg4;
import te3.m44;

/* renamed from: xk1.d */
public final class C66295d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ boolean f190837a;

    /* renamed from: b */
    public final /* synthetic */ C66309g f190838b;

    public C66295d(boolean z, C66309g gVar) {
        this.f190837a = z;
        this.f190838b = gVar;
    }

    public Object call(Object obj) {
        C64638pv3 pv32;
        String str;
        String str2;
        String str3;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = 0;
        String str4 = null;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C64408gz0 gz02 = (C64408gz0) cVar.f256796d;
            if (!Util.isNullOrNil(gz02 != null ? gz02.f183380d : null)) {
                String str5 = "";
                if (this.f190837a) {
                    C66309g gVar = this.f190838b;
                    C64408gz0 gz03 = (C64408gz0) cVar.f256796d;
                    String str6 = gz03 != null ? gz03.f183380d : null;
                    if (str6 == null) {
                        str6 = str5;
                    }
                    gVar.getClass();
                    gVar.f190892f = str6;
                    C64408gz0 gz04 = (C64408gz0) cVar.f256796d;
                    if (gz04 == null || (str2 = gz04.f183383g) == null) {
                        str2 = str5;
                    }
                    C66309g gVar2 = this.f190838b;
                    cg4 cg4 = gVar2.f190896j;
                    if (cg4 != null) {
                        cg4.f182480h = str2;
                    }
                    String str7 = gVar2.f190890d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("thirdAppInfo authCode:");
                    cg4 cg42 = this.f190838b.f190896j;
                    sb.append(cg42 != null ? cg42.f182480h : null);
                    Log.m105924i(str7, sb.toString());
                    String str8 = this.f190838b.f190890d;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("thirdAppInfo platformId:");
                    cg4 cg43 = this.f190838b.f190896j;
                    sb4.append(cg43 != null ? Integer.valueOf(cg43.f182478f) : null);
                    sb4.append(", gameUserId:");
                    cg4 cg44 = this.f190838b.f190896j;
                    if (cg44 != null) {
                        str4 = cg44.f182479g;
                    }
                    sb4.append(str4);
                    Log.m105924i(str8, sb4.toString());
                    boolean z = this.f190838b.f190894h;
                    C62616r rVar = new C62616r(this.f190838b.f190892f, z ? 1 : 0, false, 4, (C8480h) null);
                    C66309g gVar3 = this.f190838b;
                    C64508l11 l112 = rVar.f177821t;
                    l112.f184015i = str2;
                    cg4 cg45 = gVar3.f190896j;
                    if (cg45 != null) {
                        i = cg45.f182478f;
                    }
                    l112.f184017n = i;
                    if (!(cg45 == null || (str3 = cg45.f182479g) == null)) {
                        str5 = str3;
                    }
                    l112.f184018o = str5;
                    if (cg45 != null) {
                        l112.f184016j = 1;
                    }
                    rVar.mo85582k(gVar3.getActivity(), this.f190838b.getResources().getString(C0966R.string.ett), 500);
                    C89059e i2 = rVar.mo9225i();
                    AppCompatActivity activity = this.f190838b.getActivity();
                    C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI");
                    i2.mo11397F((FinderGameLiveAuthUI) activity);
                    i2.mo123420E(new C66292c(this.f190838b, z ? 1 : 0));
                    return i2;
                }
                C66309g gVar4 = this.f190838b;
                if (!gVar4.f190894h) {
                    if (gVar4.f190895i != null) {
                        C39072t tVar = (C39072t) C86312j.m106911c(C39072t.class);
                        C66309g gVar5 = this.f190838b;
                        m44 m44 = gVar5.f190895i;
                        String str9 = (m44 == null || (pv32 = m44.f184201e) == null || (str = pv32.f184892d) == null) ? str5 : str;
                        String str10 = gVar5.f190892f;
                        tVar.r10(str9, "", str10 == null ? str5 : str10, -1, "");
                    } else {
                        cg4 cg46 = gVar4.f190896j;
                        if (cg46 != null) {
                            str4 = cg46.f182476d;
                        }
                        if (str4 != null) {
                            C11348f.C11349a.m11178b(C59319a.f169618b, "AUTH_ERROR_2", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                            C58765p3.f168247a.mo83806e(-2, str4);
                        }
                    }
                }
                this.f190838b.getActivity().finish();
                return C13598b0.f38549a;
            }
        }
        C66309g gVar6 = this.f190838b;
        int i3 = cVar.f256794b;
        String str11 = cVar.f256795c;
        C64408gz0 gz05 = (C64408gz0) cVar.f256796d;
        String str12 = gVar6.f190890d;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("dealError ");
        sb5.append(i3);
        sb5.append(", appid:");
        if (gz05 != null) {
            str4 = gz05.f183380d;
        }
        sb5.append(str4);
        Log.m105924i(str12, sb5.toString());
        C39622i0 a = C39818r.f106831a.mo62443b(gVar6.getContext()).mo75002a(C15716b.class);
        C87412m.m108593f(a, "UICProvider.of(context).…ameFinishUIC::class.java)");
        C15716b bVar = (C15716b) a;
        switch (i3) {
            case -200118:
                String string = gVar6.getResources().getString(C0966R.string.f361632le0);
                C87412m.m108593f(string, "resources.getString(R.st…elive_authfailpage_title)");
                if (str11 == null) {
                    str11 = gVar6.getResources().getString(C0966R.string.ldz);
                    C87412m.m108593f(str11, "resources.getString(R.st…ve_authfailpage_subtitle)");
                }
                bVar.mo14439e3(false, string, str11);
                break;
            case -200096:
                String string2 = gVar6.getResources().getString(C0966R.string.ldy);
                C87412m.m108593f(string2, "resources.getString(R.st…thfailpage_scanfailtitle)");
                String string3 = gVar6.getResources().getString(C0966R.string.ldx);
                C87412m.m108593f(string3, "resources.getString(R.st…ailpage_scanfailsubtitle)");
                bVar.mo14439e3(false, string2, string3);
                break;
            case -200095:
                String string4 = gVar6.getResources().getString(C0966R.string.ldw);
                C87412m.m108593f(string4, "resources.getString(R.st…_authfailpage_retrytitle)");
                String string5 = gVar6.getResources().getString(C0966R.string.ldv);
                C87412m.m108593f(string5, "resources.getString(R.st…thfailpage_retrysubtitle)");
                bVar.mo14439e3(false, string4, string5);
                break;
            case -200093:
                String string6 = gVar6.getResources().getString(C0966R.string.g7i);
                C87412m.m108593f(string6, "resources.getString(R.st…ortitlelabel_generalinfo)");
                String spannableString = C58782w0.f168290a.mo83848g(gVar6.getContext(), C0966R.string.le6, false).toString();
                C87412m.m108593f(spannableString, "FinderGameLiveUtil.getLi…iGame = false).toString()");
                bVar.mo14439e3(false, string6, spannableString);
                break;
            case -200091:
                String string7 = gVar6.getResources().getString(C0966R.string.ldt);
                C87412m.m108593f(string7, "resources.getString(R.st…hfailalreadyinlive_title)");
                String string8 = gVar6.getResources().getString(C0966R.string.ldz);
                C87412m.m108593f(string8, "resources.getString(R.st…ve_authfailpage_subtitle)");
                bVar.mo14439e3(false, string7, string8);
                break;
            case -200035:
                String string9 = gVar6.getResources().getString(C0966R.string.ldu);
                C87412m.m108593f(string9, "resources.getString(R.st…authfailexpirepage_title)");
                String string10 = gVar6.getResources().getString(C0966R.string.ldz);
                C87412m.m108593f(string10, "resources.getString(R.st…ve_authfailpage_subtitle)");
                bVar.mo14439e3(false, string9, string10);
                break;
            default:
                String string11 = gVar6.getResources().getString(C0966R.string.f361632le0);
                C87412m.m108593f(string11, "resources.getString(R.st…elive_authfailpage_title)");
                String string12 = gVar6.getResources().getString(C0966R.string.ldz);
                C87412m.m108593f(string12, "resources.getString(R.st…ve_authfailpage_subtitle)");
                bVar.mo14439e3(false, string11, string12);
                break;
        }
        gVar6.mo90427d3();
        bVar.mo14440f3();
        if (i3 == -200093) {
            View findViewById = bVar.mo14437c3().findViewById(C0966R.C0970id.e9u);
            C87412m.m108593f(findViewById, "root.findViewById(R.id.finish_desc_tv)");
            ((TextView) findViewById).setText(C58782w0.f168290a.mo83848g(gVar6.getContext(), C0966R.string.le6, false));
        }
        return C13598b0.f38549a;
    }
}
