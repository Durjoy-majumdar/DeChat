package wv1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bl3.C39818r;
import c00.C0406o;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C45253g;
import d14.C58057l;
import di3.C86312j;
import eb0.C31543z5;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import g83.C98093l;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.ResultKt;
import ob0.C47350c;
import org.json.JSONObject;
import p206nj.C117627q;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import rx3.C13598b0;
import te3.C49319eq0;
import te3.C49458fq0;
import u73.C101982p;
import u73.C101987v0;
import u73.C14134p0;
import uv1.C65479a;
import uv1.C65481c;
import wb2.C65946a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z73.C53759a;
import z73.C53761n;

/* renamed from: wv1.a */
public final class C66200a extends C98093l<C65479a> {

    /* renamed from: f */
    public final AppCompatActivity f190239f;

    /* renamed from: g */
    public long f190240g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchJSApi$getFTSHotData$1", mo125469f = "FTSHotSearchJSApi.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
    /* renamed from: wv1.a$b */
    public static final class C53198b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f148396d;

        /* renamed from: e */
        public final /* synthetic */ C47350c f148397e;

        /* renamed from: f */
        public final /* synthetic */ String f148398f;

        /* renamed from: g */
        public final /* synthetic */ LifecycleScope f148399g;

        /* renamed from: h */
        public final /* synthetic */ C66200a f148400h;

        /* renamed from: wv1.a$b$a */
        public static final class C53199a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ String f148401d;

            /* renamed from: e */
            public final /* synthetic */ LifecycleScope f148402e;

            /* renamed from: f */
            public final /* synthetic */ C66200a f148403f;

            public C53199a(String str, LifecycleScope lifecycleScope, C66200a aVar) {
                this.f148401d = str;
                this.f148402e = lifecycleScope;
                this.f148403f = aVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                String str;
                C47445a aVar = (C47445a) obj;
                if (aVar.f128348a == C47798b.OnEnd) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getFTSHotData SceneEnd: ");
                    sb.append(aVar.f128349b);
                    sb.append(' ');
                    sb.append(aVar.f128350c);
                    sb.append(' ');
                    sb.append(aVar.f128351d);
                    sb.append(' ');
                    C49458fq0 fq02 = (C49458fq0) aVar.f128353f;
                    sb.append(fq02 != null ? fq02.f133635d : null);
                    Log.m105924i("MicroMsg.FTS.FTSHotSearchJSApi", sb.toString());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ret", aVar.f128350c);
                    jSONObject.put("errMsg", aVar.f128351d);
                    jSONObject.put("requestId", this.f148401d);
                    if (aVar.f128349b == 0 && aVar.f128350c == 0) {
                        C49458fq0 fq03 = (C49458fq0) aVar.f128353f;
                        if (fq03 == null || (str = fq03.f133635d) == null) {
                            str = "{}";
                        }
                        jSONObject.put("json", str);
                    }
                    LifecycleScope lifecycleScope = this.f148402e;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C53201b(this.f148403f, jSONObject, (C15601d<? super C53201b>) null), 2, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53198b(C47350c cVar, String str, LifecycleScope lifecycleScope, C66200a aVar, C15601d<? super C53198b> dVar) {
            super(2, dVar);
            this.f148397e = cVar;
            this.f148398f = str;
            this.f148399g = lifecycleScope;
            this.f148400h = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C53198b(this.f148397e, this.f148398f, this.f148399g, this.f148400h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C53198b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f148396d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C47446b.C47447a aVar2 = C47446b.f127269a;
                C47350c cVar = this.f148397e;
                C87412m.m108593f(cVar, "commReqResp");
                C45252f a = aVar2.mo72464a(cVar);
                C53199a aVar3 = new C53199a(this.f148398f, this.f148399g, this.f148400h);
                this.f148396d = 1;
                if (((C58057l) a).mo31880a(aVar3, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchJSApi$onActivityStateChanged$1", mo125469f = "FTSHotSearchJSApi.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wv1.a$c */
    public static final class C53200c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C66200a f148404d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f148405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53200c(C66200a aVar, JSONObject jSONObject, C15601d<? super C53200c> dVar) {
            super(2, dVar);
            this.f148404d = aVar;
            this.f148405e = jSONObject;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C53200c(this.f148404d, this.f148405e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C53200c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            BaseWebSearchWebView webView;
            ResultKt.throwOnFailure(obj);
            C53759a aVar = this.f148404d.f150904a;
            if (!(aVar == null || (webView = aVar.getWebView()) == null)) {
                JSONObject jSONObject = this.f148405e;
                C53761n nVar = C53761n.f150905a;
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "returnObj.toString()");
                nVar.mo74349a(webView, "onActivityStateChanged", jSONObject2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wv1.a$a */
    public static final class C66201a extends C87413o implements C32226l<C65479a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66200a f190241d;

        /* renamed from: e */
        public final /* synthetic */ C66202c f190242e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66201a(C66200a aVar, C66202c cVar) {
            super(1);
            this.f190241d = aVar;
            this.f190242e = cVar;
        }

        public Object invoke(Object obj) {
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, "state");
            C66200a aVar2 = this.f190241d;
            C66202c cVar = this.f190242e;
            IStateAction action = aVar.getAction();
            if (action != null && (action instanceof C65481c)) {
                int b = ((C65481c) action).f188434a / C60641c.m70921b(C76577a.m92156g(aVar2.f190239f));
                WebSearchWebView a = cVar.getWebView();
                if (a != null) {
                    C53761n nVar = C53761n.f150905a;
                    JSONObject e = aVar2.mo74341e();
                    e.put("height", b);
                    C13598b0 b0Var = C13598b0.f38549a;
                    String jSONObject = e.toString();
                    C87412m.m108593f(jSONObject, "returnSuccess().also {\n …             }.toString()");
                    nVar.mo74349a(a, "onGetKeyboardHeight", jSONObject);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66200a(AppCompatActivity appCompatActivity, C66202c cVar) {
        super(cVar);
        UIStateCenter stateCenter;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(cVar, "uiComponent");
        this.f190239f = appCompatActivity;
        if ((appCompatActivity instanceof BaseMvvmActivity) && (stateCenter = ((BaseMvvmActivity) appCompatActivity).getStateCenter()) != null) {
            stateCenter.observe((C0125s) appCompatActivity, new C66201a(this, cVar));
        }
    }

    @JavascriptInterface
    public final void getFTSHotData(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.m105924i("MicroMsg.FTS.FTSHotSearchJSApi", "getFTSHotData params:" + str);
            C49319eq0 eq02 = new C49319eq0();
            String optString = jSONObject.optString("requestId", "");
            eq02.f133074d = jSONObject.optString("json", "");
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 6289;
            bVar.f127068c = "/cgi-bin/micromsg-bin/finderglobalsearchpage";
            bVar.f127066a = eq02;
            bVar.f127067b = new C49458fq0();
            C47350c a = bVar.mo72403a();
            LifecycleScope c3 = ((C65946a) C39818r.f106831a.mo62444c(this.f190239f).mo75002a(C65946a.class)).mo89983c3();
            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C53198b(a, optString, c3, this, (C15601d<? super C53198b>) null), 1, (Object) null);
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public final String getWebConfig(String str) {
        try {
            JSONObject p4 = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4(new JSONObject(str).optString("key"));
            JSONObject e = mo74341e();
            e.put("configStr", p4.toString());
            String jSONObject = e.toString();
            C87412m.m108593f(jSONObject, "returnObject.toString()");
            return jSONObject;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.FTS.FTSHotSearchJSApi", e2, "getWebConfig", new Object[0]);
            String jSONObject2 = mo74340d().toString();
            C87412m.m108593f(jSONObject2, "returnFail().toString()");
            return jSONObject2;
        }
    }

    @JavascriptInterface
    public String openBizProfile(String str) {
        try {
            String optString = new JSONObject(str).optString("username");
            Intent intent = new Intent();
            intent.putExtra("Chat_User", optString);
            intent.putExtra("finish_direct", true);
            intent.putExtra("specific_chat_from_scene", 3);
            intent.putExtra("preChatTYPE", 9);
            intent.putExtra("chat_from_scene", 5);
            C53759a aVar = this.f150904a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchUIComponent");
            C88144b.m109801s(((C66202c) aVar).f190243d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            String jSONObject = mo74341e().toString();
            C87412m.m108593f(jSONObject, "returnSuccess().toString()");
            return jSONObject;
        } catch (Exception unused) {
            String jSONObject2 = mo74340d().toString();
            C87412m.m108593f(jSONObject2, "returnFail().toString()");
            return jSONObject2;
        }
    }

    @JavascriptInterface
    public final String openSearchWebView(String str) {
        String str2;
        try {
            Log.m105925i("MicroMsg.FTS.FTSHotSearchJSApi", "openSearchWebView %s", String.valueOf(str));
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type", 0);
            String optString = jSONObject.optString("tagId", "");
            String optString2 = jSONObject.optString("sessionId", "");
            String str3 = optString;
            int optInt2 = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            String optString3 = jSONObject.optString(SearchIntents.EXTRA_QUERY);
            String str4 = "subSessionId";
            String optString4 = jSONObject.optString("searchId", "");
            String str5 = "sessionId";
            String optString5 = jSONObject.optString("extParams", "");
            String str6 = optString2;
            String str7 = "1".equals(jSONObject.optString("isHomePage", "")) ? "1" : "0";
            Object obj = "isHomePage";
            String optString6 = jSONObject.optString("isSug", "1");
            Object obj2 = "isSug";
            String str8 = "searchPlaceHolder";
            String optString7 = jSONObject.optString("searchPlaceHolder", "");
            int optInt3 = jSONObject.optInt("ftsNeedHideKeyBoard", 0);
            Intent intent = new Intent();
            String str9 = "";
            JSONObject jSONObject2 = jSONObject;
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("key_load_js_without_delay", true);
            intent.putExtra("ftsQuery", optString3);
            intent.putExtra("ftsType", optInt);
            intent.putExtra("ftsbizscene", optInt2);
            intent.putExtra("need_show_query_first", true);
            Map<String, String> b = C101987v0.m134268b(optInt2, "1".equals(str7), optInt, optString5);
            if (Util.isNullOrNil(optString3)) {
                str2 = str9;
            } else {
                try {
                    str2 = Util.nullAsNil(C117627q.m165908a(optString3));
                } catch (Exception unused) {
                    str2 = str9;
                }
                C87412m.m108593f(str2, "try {\n            Util.n…\n            \"\"\n        }");
            }
            HashMap hashMap = (HashMap) b;
            hashMap.put(SearchIntents.EXTRA_QUERY, str2);
            hashMap.put("searchId", optString4);
            hashMap.put(obj, str7);
            hashMap.put(obj2, optString6);
            if (!TextUtils.isEmpty(str6)) {
                String str10 = str5;
                String str11 = str6;
                hashMap.put(str10, str11);
                intent.putExtra(str10, str11);
            }
            boolean z = (optInt3 == 1 || optInt3 == 2) && optInt3 == 1;
            String str12 = str4;
            String optString8 = jSONObject2.optString(str12, str9);
            hashMap.put(str12, optString8);
            intent.putExtra(str12, optString8);
            intent.putExtra("rawUrl", C101987v0.m134270d(b, 0));
            intent.putExtra("ftsQuery", optString3);
            intent.putExtra("tabId", str3);
            intent.putExtra("key_load_js_without_delay", true);
            intent.putExtra("key_search_icon_and_hint_fix_default", true);
            intent.putExtra("ftsInitToSearch", true);
            intent.putExtra("hideSearchInput", false);
            intent.putExtra("ftsneedkeyboard", z);
            intent.putExtra(str8, optString7);
            intent.putExtra("key_preload_biz", 4);
            C88144b.m109805w(MMApplicationContext.getContext(), intent);
            String jSONObject3 = mo74341e().toString();
            C87412m.m108593f(jSONObject3, "returnSuccess().toString()");
            return jSONObject3;
        } catch (Exception unused2) {
            String jSONObject4 = mo74340d().toString();
            C87412m.m108593f(jSONObject4, "returnFail().toString()");
            return jSONObject4;
        }
    }

    /* renamed from: r */
    public final void mo90295r(String str, String str2) {
        C87412m.m108594g(str, "state");
        C87412m.m108594g(str2, "extData");
        Log.m105925i("MicroMsg.FTS.FTSHotSearchJSApi", "onActivityStateChanged, state %s, extData %s", str, str2);
        C53759a aVar = this.f150904a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.hotsearch.webview.FTSHotSearchUIComponent");
        LifecycleScope c3 = ((C65946a) C39818r.f106831a.mo62443b(((C66202c) aVar).f190243d).mo75002a(C65946a.class)).mo89983c3();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", str);
        jSONObject.put("extData", str2);
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(c3, C58901s.f168555a, (C53934p0) null, new C53200c(this, jSONObject, (C15601d<? super C53200c>) null), 2, (Object) null);
    }

    @JavascriptInterface
    public final String startWebSearch(String str) {
        if (C31543z5.m39453c() - this.f190240g < 1500) {
            String jSONObject = mo74340d().toString();
            C87412m.m108593f(jSONObject, "returnFail().toString()");
            return jSONObject;
        }
        this.f190240g = C31543z5.m39453c();
        boolean z = true;
        try {
            Log.m105925i("MicroMsg.FTS.FTSHotSearchJSApi", "startWebSearch %s", String.valueOf(str));
            JSONObject jSONObject2 = new JSONObject(str);
            int optInt = jSONObject2.optInt("type", 0);
            String optString = jSONObject2.optString("sessionId", "");
            int optInt2 = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            String optString2 = jSONObject2.optString(SearchIntents.EXTRA_QUERY);
            String optString3 = jSONObject2.optString("extParams", "");
            String optString4 = jSONObject2.optString("searchPlaceHolder", "");
            int optInt3 = jSONObject2.optInt("ftsNeedHideKeyBoard", 0);
            C14134p0 p0Var = new C14134p0();
            p0Var.f39563t = URLDecoder.decode(optString3, "UTF-8");
            p0Var.f39544a = MMApplicationContext.getContext();
            p0Var.f39545b = optInt2;
            p0Var.f39547d = optString2;
            p0Var.f39546c = optInt;
            p0Var.f39548e = optString;
            p0Var.f39549f = true;
            p0Var.f39551h = true;
            p0Var.f39552i = false;
            if (optInt3 == 1 || optInt3 == 2) {
                if (optInt3 != 1) {
                    z = false;
                }
                p0Var.f39565v = z;
            }
            p0Var.f39560q = false;
            p0Var.f39554k = C76577a.m92153d(MMApplicationContext.getContext(), C0966R.color.al6);
            p0Var.f39555l = false;
            p0Var.f39564u = optString4;
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
            String jSONObject3 = mo74341e().toString();
            C87412m.m108593f(jSONObject3, "returnSuccess().toString()");
            return jSONObject3;
        } catch (Exception unused) {
            String jSONObject4 = mo74340d().toString();
            C87412m.m108593f(jSONObject4, "returnFail().toString()");
            return jSONObject4;
        }
    }
}
