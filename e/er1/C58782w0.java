package er1;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import ke3.C88144b;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONObject;
import p156gj.C87203t;
import p763ym.C39072t;
import qg1.C62616r;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48757as1;
import te3.C50169kr1;
import te3.C50336m11;
import te3.C51006qs1;
import te3.C64548ma0;
import te3.m44;
import tf0.C13883o1;
import z04.C112550d0;
import zc1.C66785b;

/* renamed from: er1.w0 */
public final class C58782w0 {

    /* renamed from: a */
    public static final C58782w0 f168290a = new C58782w0();

    /* renamed from: b */
    public static final List<Integer> f168291b = C64197v.m75537f(1, 2, 3, 4, 5, 7, 8, 9, 10);

    /* renamed from: er1.w0$a */
    public static final class C7906a extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ boolean f26564d;

        /* renamed from: e */
        public final /* synthetic */ Context f26565e;

        public C7906a(boolean z, Context context) {
            this.f26564d = z;
            this.f26565e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderGameLiveUtil$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            C58782w0 w0Var = C58782w0.f168290a;
            Log.m105924i("Finder.FinderGameLiveUtil", "license click");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f26564d ? "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_mini_game_agreement&lang=zh_CN" : "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement&lang=zh_CN");
            C88144b.m109791i(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/utils/FinderGameLiveUtil$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(this.f26565e.getResources().getColor(C0966R.color.f3400rk));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: er1.w0$b */
    public static final class C58783b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Intent f168292a;

        /* renamed from: b */
        public final /* synthetic */ String f168293b;

        /* renamed from: c */
        public final /* synthetic */ String f168294c;

        public C58783b(Intent intent, String str, String str2, int i) {
            this.f168292a = intent;
            this.f168293b = str;
            this.f168294c = str2;
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
                    String str3 = this.f168294c;
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
                    C58782w0 w0Var = C58782w0.f168290a;
                    Log.m105928w("Finder.FinderGameLiveUtil", "detail null");
                } else {
                    C48757as1 as13 = qs12.f140525g;
                    String str4 = "";
                    if (as13 == null || (str = as13.f130749e) == null) {
                        str = str4;
                    }
                    if (!(as13 == null || (str2 = as13.f130748d) == null)) {
                        str4 = str2;
                    }
                    this.f168292a.putExtra("COVER_URL", str);
                    this.f168292a.putExtra("DESC", str4);
                    this.f168292a.putExtra("TICKET", this.f168293b);
                    this.f168292a.putExtra("APPID", this.f168294c);
                    this.f168292a.putExtra("POST_FROM_SCENE", 0);
                    this.f168292a.putExtra("GameUserInfo", qs12.toByteArray());
                    this.f168292a.addFlags(536870912);
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13281h6(context, this.f168292a);
                }
            } else {
                C58782w0 w0Var2 = C58782w0.f168290a;
                Log.m105928w("Finder.FinderGameLiveUtil", "CgiFinderLiveGetUserGameConfig failed.");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo83842a(View view) {
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + C75044y4.m89994f(view.getContext()), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* renamed from: b */
    public final boolean mo83843b(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "packageName");
        try {
            return context.getPackageManager().getPackageInfo(str, 64) != null;
        } catch (Exception e) {
            Log.m105929w("Finder.FinderGameLiveUtil", "checkInstalled " + str + " Exception: %s", e.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo83844c(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "downloadUrl");
        Log.m105924i("Finder.FinderGameLiveUtil", "download SecondCut url " + str);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: d */
    public final void mo83845d(int i, String str, String str2, String str3) {
        C87412m.m108594g(str, "errMsg");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errCode", i);
        jSONObject.put("errmsg", str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "retJson.toString()");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            C61926c.m72668M(new C7920x0(jSONObject2));
        }
        ((C39072t) C86312j.m106911c(C39072t.class)).r10(str2 == null ? "" : str2, jSONObject.toString(), str3 == null ? "" : str3, -1, "");
    }

    /* renamed from: e */
    public final C64548ma0 mo83846e() {
        C64548ma0 ma02 = new C64548ma0();
        ma02.f184252f = C87203t.m108275k();
        ma02.f184250d = Build.BRAND;
        ma02.f184251e = Build.MANUFACTURER;
        ma02.f184253g = Build.VERSION.RELEASE;
        ma02.f184254h = Build.VERSION.INCREMENTAL;
        ma02.f184255i = Build.DISPLAY;
        return ma02;
    }

    /* renamed from: f */
    public final String mo83847f(boolean z, int i, String str, Context context, int i2) {
        C87412m.m108594g(str, "gameName");
        C87412m.m108594g(context, "context");
        if (z) {
            String string = i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? context.getString(C0966R.string.dcb, new Object[]{str}) : context.getString(C0966R.string.dcc, new Object[]{str}) : context.getString(C0966R.string.dca, new Object[]{str}) : context.getString(C0966R.string.dc_, new Object[]{str}) : context.getString(C0966R.string.dc9, new Object[]{str}) : context.getString(C0966R.string.dc8, new Object[]{str});
            C87412m.m108593f(string, "{\n            when (team…)\n            }\n        }");
            return string;
        }
        String string2 = i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? i != 8 ? context.getString(C0966R.string.daq, new Object[]{str}) : context.getString(C0966R.string.lts, new Object[]{str}) : context.getString(C0966R.string.dbv, new Object[]{str}) : context.getString(C0966R.string.dap, new Object[]{str}) : context.getString(C0966R.string.dao, new Object[]{str}) : context.getString(C0966R.string.dan, new Object[]{str}) : context.getString(C0966R.string.dam, new Object[]{str});
        C87412m.m108593f(string2, "when (teamMode) {\n      …, gameName)\n            }");
        String string3 = i2 == 1 ? context.getString(C0966R.string.n1j) : "";
        C87412m.m108593f(string3, "when (platomId) {\n      …          }\n            }");
        return string2 + string3;
    }

    /* renamed from: g */
    public final SpannableString mo83848g(Context context, int i, boolean z) {
        C87412m.m108594g(context, "context");
        String string = z ? context.getString(C0966R.string.le_) : context.getString(C0966R.string.le4);
        C87412m.m108593f(string, "if (isMiniGame) {\n      …eerror_license)\n        }");
        int i2 = 0;
        String string2 = context.getString(i, new Object[]{string});
        C87412m.m108593f(string2, "context.getString(strId, strForIndex)");
        int E = C112550d0.m153769E(string2, string, 0, false, 6, (Object) null);
        int length = string.length() + E;
        SpannableString spannableString = new SpannableString(string2);
        if (E <= 0 || length > string2.length()) {
            length = string2.length();
            Log.m105920e("Finder.FinderGameLiveUtil", "license text err,all string:" + string2 + ",license:" + string);
        } else {
            i2 = E;
        }
        spannableString.setSpan(new C7906a(z, context), i2, length, 33);
        return spannableString;
    }

    /* renamed from: h */
    public final String mo83849h(String str, int i) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        Pattern compile = Pattern.compile("[一-龥]");
        C87412m.m108593f(compile, "compile(pattern)");
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = i2 + 1;
            String substring = str.substring(i2, i5);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (compile.matcher(substring).matches()) {
                i4++;
            } else {
                i3++;
            }
            if ((i4 * 2) + i3 > i * 2) {
                StringBuilder sb = new StringBuilder();
                String substring2 = str.substring(0, i2);
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring2);
                sb.append("...");
                return sb.toString();
            }
            i2 = i5;
        }
        return str;
    }

    /* renamed from: i */
    public final void mo83850i(JSONObject jSONObject, Intent intent, m44 m44, String str) {
        String string = jSONObject.getString("ticket");
        intent.putExtra("KEY_POST_FROM_SHARE", m44.toByteArray());
        intent.putExtra("KEY_TICKET", string);
        intent.putExtra("KEY_APPID", str);
        intent.putExtra("KEY_FROM_SCAN", false);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13275Z3(context, intent);
    }

    /* renamed from: j */
    public final void mo83851j(int i, JSONObject jSONObject, String str, Intent intent) {
        Class cls = C60200t1.class;
        Log.m105924i("Finder.FinderGameLiveUtil", "jumpGameLiveUI action:" + i);
        String string = jSONObject.getString("liveObjectExportId");
        String R1 = ((C60200t1) C86312j.m106911c(cls)).mo76802R1(11, 8, 65);
        ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83790h6(i, string, 0, C66785b.f191882e.mo90662O5(), R1, "");
    }

    /* renamed from: k */
    public final void mo83852k(JSONObject jSONObject, String str, Intent intent) {
        new C62616r(str, 0, false).mo9225i().mo123420E(new C58783b(intent, jSONObject.optString("ticket", ""), str, 0));
    }

    /* renamed from: l */
    public final int mo83853l(int i) {
        if (i != 1) {
            if (i != 20009) {
                if (i == 20036) {
                    return 1;
                }
                if (!(i == 20001 || i == 20002)) {
                    if (i != 20013) {
                        if (i == 20014) {
                            return 11;
                        }
                        if (i == 20019) {
                            return 13;
                        }
                        if (i == 20020) {
                            return 14;
                        }
                        switch (i) {
                            case 10005:
                                return 3;
                            case 10006:
                            case CdnLogic.kMediaTypeFavoriteBigFile /*10007*/:
                                return 6;
                            case 10008:
                                return 7;
                            default:
                                switch (i) {
                                    case 100000:
                                        return 1;
                                    case 100001:
                                        return 16;
                                    default:
                                        return 0;
                                }
                        }
                    }
                }
            }
            return 10;
        }
        return 2;
    }
}
