package com.tencent.p014mm.plugin.webview.model;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.opensdk.modelmsg.SendTdiAuth;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import gu3.C107917d;
import gy3.C87412m;
import hc0.C20937c;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p206nj.C11171e;
import p763ym.C79138l;
import pe3.C89349b;
import qo3.C77426q;
import te3.C48834bb2;
import te3.C48923bx3;
import te3.C49228e34;
import te3.C50407mi2;
import te3.C90407dx3;
import te3.C90442v43;
import te3.so4;
import te3.to4;
import te3.uo4;
import te3.wo4;
import u24.C90599h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.webview.model.c1 */
public class C85518c1 {

    /* renamed from: a */
    public Context f249201a;

    /* renamed from: b */
    public String f249202b;

    /* renamed from: c */
    public String f249203c;

    /* renamed from: d */
    public String f249204d;

    /* renamed from: e */
    public String f249205e;

    /* renamed from: f */
    public boolean f249206f;

    /* renamed from: g */
    public boolean f249207g;

    /* renamed from: h */
    public String f249208h;

    /* renamed from: i */
    public C89349b f249209i;

    public C85518c1(Context context, boolean z, String str, String str2) {
        this.f249201a = context;
        this.f249207g = z;
        this.f249202b = str;
        this.f249208h = str2;
    }

    /* renamed from: a */
    public static void m105528a(C90407dx3 dx32, LinkedList<String> linkedList) {
        if (m105534n("snsapi_userinfo", dx32.f259468d) != null) {
            linkedList.add("snsapi_userinfo");
        } else if (m105534n("snsapi_login", dx32.f259468d) != null) {
            linkedList.add("snsapi_login");
        } else {
            linkedList.add("group_sns_login");
        }
    }

    /* renamed from: b */
    public static Boolean m105529b(C90407dx3 dx32, boolean z) {
        LinkedList<C50407mi2> linkedList;
        C89349b bVar = dx32.f259465A;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(bVar != null && bVar.f257327a.length > 0);
        objArr[1] = Boolean.valueOf(dx32.f259466B);
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.SDKOauthUtil", "gameBuffer is not empty = %s, have gameCenter page = %s, isFromQRCodeScan = %s", objArr);
        if (bVar != null && bVar.f257327a.length > 0 && dx32.f259466B) {
            if (z) {
                return Boolean.FALSE;
            }
            C48834bb2 bb22 = new C48834bb2();
            try {
                bb22.parseFrom(bVar.mo123703f());
                LinkedList<so4> linkedList2 = bb22.f131036d;
                if (linkedList2 != null) {
                    if (!linkedList2.isEmpty()) {
                        uo4 uo4 = bb22.f131038f;
                        if (uo4 == null) {
                            Log.m105924i("MicroMsg.SDKOauthUtil", "interface config is null!");
                            return Boolean.FALSE;
                        }
                        to4 to4 = uo4.f142990e;
                        if (!(to4 == null || (linkedList = to4.f142315d) == null)) {
                            if (!linkedList.isEmpty()) {
                                wo4 wo4 = bb22.f131038f.f142989d;
                                if (wo4 != null && !Util.isNullOrNil(wo4.f144180f) && !Util.isNullOrNil(bb22.f131038f.f142989d.f144181g)) {
                                    if (!Util.isNullOrNil(bb22.f131038f.f142989d.f144179e)) {
                                        return Boolean.TRUE;
                                    }
                                }
                                Log.m105924i("MicroMsg.SDKOauthUtil", "interface_config title is not enough");
                                return Boolean.FALSE;
                            }
                        }
                        Log.m105924i("MicroMsg.SDKOauthUtil", "interface_config body is empty");
                        return Boolean.FALSE;
                    }
                }
                Log.m105924i("MicroMsg.SDKOauthUtil", "grant info list is empty!");
                return Boolean.FALSE;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SDKOauthUtil", "parse proto fail, %s", e.getMessage());
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: f */
    public static void m105530f(Activity activity) {
        Log.m105924i("MicroMsg.SDKOauthUtil", "delayFish activity: " + activity);
        activity.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        C119179t tVar = C119157j.f356862d;
        c1$$a c1__a = new c1$$a(activity);
        long j = C11171e.m11046c(28) ? 10 : 500;
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(c1__a, j, false);
    }

    /* renamed from: k */
    public static String m105531k(LinkedList<String> linkedList) {
        Iterator<String> it = linkedList.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + it.next() + ", ";
        }
        return str;
    }

    /* renamed from: l */
    public static String m105532l(int i, LinkedList<String> linkedList, int i2, C89349b bVar, Boolean bool) {
        StringBuilder sb = new StringBuilder("用户操作结果：");
        sb.append(i);
        sb.append("\n");
        sb.append("已授权选项：");
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", \n");
        }
        sb.append("用户头像id：");
        sb.append(i2);
        sb.append("\n");
        String str = "";
        if (bVar != null) {
            try {
                C49228e34 e342 = new C49228e34();
                e342.parseFrom(bVar.mo123703f());
                Iterator<so4> it4 = e342.f132666d.iterator();
                while (it4.hasNext()) {
                    so4 next = it4.next();
                    str = str + String.format("status_id: %s, status_value: %s\n", new Object[]{Integer.valueOf(next.f141658d), Integer.valueOf(next.f141659e)});
                }
                str = (str + "submit_value: " + e342.f132668f + "\n") + "isHaveGameCenterPage: " + bool + "\n";
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SDKOauthUtil", "parse proto fail, %s", e.getMessage());
            }
        }
        return sb + str;
    }

    /* renamed from: m */
    public static boolean m105533m(C90407dx3 dx32) {
        LinkedList linkedList = new LinkedList(dx32.f259468d);
        Iterator<C90442v43> it = dx32.f259468d.iterator();
        while (true) {
            boolean z = true;
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            C90442v43 next = it.next();
            if (next != null) {
                if (!"snsapi_friend".equals(next.f259862d) && !"snsapi_wxaapp_info".equals(next.f259862d)) {
                    z = false;
                }
                z2 = z;
            }
            if (z2 || m105535p(next)) {
                linkedList.remove(next);
            }
        }
        return linkedList.size() != 0;
    }

    /* renamed from: n */
    public static C90442v43 m105534n(String str, LinkedList<C90442v43> linkedList) {
        Iterator<C90442v43> it = linkedList.iterator();
        while (it.hasNext()) {
            C90442v43 next = it.next();
            if (str.equals(next.f259862d)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m105535p(C90442v43 v432) {
        if (v432 == null) {
            return false;
        }
        return "snsapi_userinfo".equals(v432.f259862d) || "snsapi_login".equals(v432.f259862d) || "group_sns_login".equals(v432.f259862d);
    }

    /* renamed from: c */
    public void mo118910c(int i, SendAuth.Options options, String str, int i2, boolean z) {
        Log.m105924i("MicroMsg.SDKOauthUtil", "dealWithCancel");
        if (this.f249207g) {
            C86709a0.m107524d().mo123460f(new C43719j0(2, this.f249208h, (LinkedList<String>) null, 0));
            ((MMActivity) this.f249201a).finish();
            return;
        }
        String j = mo118916j(this.f249202b);
        C86709a0.m107524d().mo123460f(new C85522l0(2, this.f249202b, this.f249205e, j, (LinkedList<String>) null, 0, this.f249203c, this.f249209i, str, i2, z));
        SendAuth.Resp resp = new SendAuth.Resp();
        resp.transaction = this.f249204d;
        resp.errCode = i;
        resp.lang = "zh_CN";
        resp.country = "";
        if (Util.isNullOrNil(resp.state)) {
            resp.state = this.f249205e;
        }
        mo118913g(j, resp, options);
        ((MMActivity) this.f249201a).finish();
    }

    /* renamed from: d */
    public void mo118911d(C85517b1 b1Var, String str, SendAuth.Options options) {
        SendTdiAuth.Resp resp;
        String d = b1Var.mo68038d();
        Log.m105925i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback url : %s", d);
        String j = mo118916j(this.f249202b);
        if (Util.isNullOrNil(j)) {
            Log.m105920e("MicroMsg.SDKOauthUtil", "dealWithLoginCallback pkg nil");
            return;
        }
        boolean equals = str.trim().equals("snsapi_wxaapp_info");
        if (b1Var.mo68035a() == null || b1Var.mo68035a().f257327a.length <= 0) {
            resp = new SendAuth.Resp();
        } else {
            SendTdiAuth.Resp resp2 = new SendTdiAuth.Resp(Bundle.EMPTY);
            resp2.tdiAuthBuffer = b1Var.mo68035a().mo123703f();
            resp = resp2;
        }
        resp.transaction = this.f249204d;
        resp.lang = "zh_CN";
        resp.country = "";
        String str2 = null;
        Uri parse = !Util.isNullOrNil(d) ? Uri.parse(d) : null;
        if (parse != null) {
            str2 = parse.getQueryParameter("code");
            resp.state = parse.getQueryParameter("state");
            resp.errStr = parse.getQueryParameter(TPReportKeys.PlayerStep.PLAYER_REASON);
        } else {
            resp.state = this.f249205e;
        }
        if (Util.isNullOrNil(str2) && !equals) {
            resp.errCode = -1;
        } else if (Util.nullAsNil(str2).toLowerCase().equals("authdeny")) {
            resp.errCode = -4;
        } else {
            resp.errCode = 0;
            if (!equals) {
                resp.code = str2;
            } else {
                resp.authResult = true;
            }
        }
        if (!equals) {
            resp.url = d;
        }
        Log.m105925i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback, pkg:%s code:%s errCode:%d state:%s", j, resp.code, Integer.valueOf(resp.errCode), resp.state);
        mo118913g(j, resp, options);
        ((MMActivity) this.f249201a).finish();
    }

    /* renamed from: e */
    public void mo118912e(Context context, C85517b1 b1Var, String str, int i, String str2, int i2, String str3, String str4, String str5, SendAuth.Options options, boolean z) {
        Context context2 = context;
        String str6 = str3;
        String str7 = str4;
        if (!b1Var.mo68036b() || Util.isNullOrNil(b1Var.mo68037c())) {
            C85517b1 b1Var2 = b1Var;
            mo118911d(b1Var, str5, options);
            C72688j0.m85015a(i, str2, str, 1, C72691t1.C72692a.m85046a(i2), 1);
            return;
        }
        String c = b1Var.mo68037c();
        Log.m105924i("MicroMsg.SDKOauthUtil", "showUserConfirmDialog  message:" + c + " iconUrl:" + str6 + "  appName:" + str7);
        if (context2 != null && (context2 instanceof Activity)) {
            Activity activity = (Activity) context2;
            if (activity.isFinishing() || activity.isDestroyed()) {
                Log.m105920e("MicroMsg.SDKOauthUtil", "showUserConfirmDialog  activity is Destroy " + context);
                C72688j0.m85015a(i, str2, str, 1, C72691t1.C72692a.m85046a(i2), 2);
            }
        }
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cnu, (ViewGroup) null);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.native_oauth_default_head_img;
        bVar.f59365u = context.getResources().getDimension(C0966R.dimen.f357059am2);
        bVar.f59364t = true;
        C20828a.m22825b().mo32519h(str6, (ImageView) inflate.findViewById(C0966R.C0970id.f358476fd0), bVar.mo32666a());
        ((TextView) inflate.findViewById(C0966R.C0970id.kvf)).setText(str7);
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(c);
        qVar.mo107592d(inflate);
        qVar.mo107602n(context.getString(C0966R.string.a18));
        qVar.mo107598j(context.getString(C0966R.string.f7926wf));
        qVar.mo107600l(new C85520e1(this, b1Var, str5, options, i, str2, str, i2));
        qVar.mo107597i(new C85519d1(this, options, str, i2, z, i, str2));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            qVar.mo107603o();
        } else {
            C107917d<C107917d.C87398b> b = C107917d.m146213b();
            b.f323124b = C107917d.f323121j;
            b.mo158345f(new C85521f1(this, qVar)).mo158346g();
        }
        C72688j0.m85015a(i, str2, str, 1, C72691t1.C72692a.m85046a(i2), 2);
    }

    /* renamed from: g */
    public final void mo118913g(String str, SendAuth.Resp resp, SendAuth.Options options) {
        if (this.f249206f) {
            Log.m105924i("MicroMsg.SDKOauthUtil", "doCallback has callback");
        } else if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.SDKOauthUtil", "doCallback pkg is empty");
        } else {
            this.f249206f = true;
            Bundle bundle = new Bundle();
            resp.toBundle(bundle);
            C72688j0.m85021g(bundle);
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = str;
            args.bundle = bundle;
            if (options != null && !Util.isNullOrNil(options.callbackClassName)) {
                Log.m105924i("MicroMsg.SDKOauthUtil", "doCallback options.callbackClassName:" + options.callbackClassName);
                args.targetClassName = options.callbackClassName;
                args.flags = options.callbackFlags;
            }
            Log.m105924i("MicroMsg.SDKOauthUtil", "doCallback pkg:" + str);
            MMessageActV2.send(this.f249201a, args);
        }
    }

    /* renamed from: h */
    public void mo118914h(int i, LinkedList<String> linkedList, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < linkedList.size(); i3++) {
            sb.append(linkedList.get(i3));
            sb.append(",");
        }
        Log.m105925i("MicroMsg.SDKOauthUtil", "doQRCodeOauthAuthorizeConfirm selectedScopes: %s", sb.toString());
        C86709a0.m107524d().mo123460f(new C43719j0(i, str, linkedList, i2));
    }

    /* renamed from: i */
    public void mo118915i(int i, LinkedList<String> linkedList, int i2, String str, int i3, C89349b bVar, Boolean bool, boolean z) {
        LinkedList<String> linkedList2 = linkedList;
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < linkedList.size(); i4++) {
            sb.append(linkedList2.get(i4));
            sb.append(",");
        }
        Log.m105925i("MicroMsg.SDKOauthUtil", "doSDKOauthAuthorizeConfirm selectedScopes: %s, isOption1:%b", sb.toString(), Boolean.valueOf(z));
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            C76912y0.makeText(this.f249201a, (CharSequence) m105532l(i, linkedList2, i2, bVar, bool), 1).show();
        } else {
            int i5 = i;
            int i6 = i2;
            C89349b bVar2 = bVar;
            Boolean bool2 = bool;
        }
        String str2 = this.f249202b;
        C86709a0.m107524d().mo123460f(new C85522l0(i, str2, this.f249205e, mo118916j(str2), linkedList, i2, this.f249203c, this.f249209i, str, i3, bVar, bool, z));
    }

    /* renamed from: j */
    public final String mo118916j(String str) {
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str, false);
        if (GW != null) {
            return GW.field_packageName;
        }
        Log.m105929w("MicroMsg.SDKOauthUtil", "dealWithCancel getAppInfo null; appid: %s", str);
        return null;
    }

    /* renamed from: o */
    public final boolean mo118917o(int i) {
        if (i == 1 || i == 2 || i == 7 || i == 8) {
            Log.m105920e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, errType = " + i);
            return false;
        } else if (NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            return true;
        } else {
            Log.m105920e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, not connected");
            return false;
        }
    }

    /* renamed from: q */
    public void mo118918q(int i, int i2, String str, C117747y yVar, SendAuth.Options options) {
        Log.m105925i("MicroMsg.SDKOauthUtil", "onQRCodeOauthAuthorizeConfirmEnd errType:%d errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            ((MMActivity) this.f249201a).finish();
        } else if (!mo118917o(i)) {
            mo118920s(this.f249201a.getString(C0966R.string.lif), options);
        } else {
            mo118920s(str, options);
        }
    }

    /* renamed from: r */
    public void mo118919r(Context context, String str, int i, String str2, int i2, String str3, String str4, int i3, int i4, String str5, C117747y yVar, SendAuth.Options options, boolean z) {
        int i5 = i3;
        SendAuth.Options options2 = options;
        Log.m105925i("MicroMsg.SDKOauthUtil", "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d", Integer.valueOf(i3), Integer.valueOf(i4));
        if (i5 == 0 && i4 == 0) {
            C85522l0 l0Var = (C85522l0) yVar;
            C48923bx3 bx32 = (C48923bx3) l0Var.f249229d.f127056b.f127083a;
            String e = C90599h.m113512e(new LinkedList(l0Var.f249232g), ",");
            C87412m.m108594g(bx32, "resp");
            mo118912e(context, new C43735z0(bx32), str, i, str2, i2, str3, str4, e, options, z);
        } else if (!mo118917o(i5)) {
            mo118920s(this.f249201a.getString(C0966R.string.lif), options2);
        } else {
            mo118920s(str5, options2);
        }
    }

    /* renamed from: s */
    public final void mo118920s(String str, SendAuth.Options options) {
        Context context = this.f249201a;
        C76879j.m92749t(context, str, context.getString(C0966R.string.lie), new c1$$b(this, str, options));
    }

    public C85518c1(Context context, String str, String str2, String str3, String str4) {
        this.f249207g = false;
        this.f249201a = context;
        this.f249202b = str;
        this.f249204d = str2;
        this.f249205e = str3;
        this.f249206f = false;
        this.f249203c = str4;
    }
}
