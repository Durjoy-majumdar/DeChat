package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.fav.api.DelFavoriteData;
import com.tencent.p014mm.plugin.fav.api.DoFavoriteData;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.model.C96648g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44245d;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44251e;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44254f;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.WebSettings;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import e00.C45520t;
import ea3.C58536w;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i83.C46176a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import ky2.C10432i;
import lg3.C88494d;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import org.json.JSONArray;
import org.json.JSONObject;
import p170ic.C87687a;
import pb1.C47450f1;
import q20.C89449a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C52097yc0;
import w83.C15053a;
import wc3.C15133e0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0 */
public final class C44108o0 extends C15053a {

    /* renamed from: d */
    public static final C44108o0 f119483d;

    /* renamed from: e */
    public static final int f119484e;

    /* renamed from: f */
    public static final int f119485f = 345;

    /* renamed from: g */
    public static final String f119486g = "handleMPPageAction";

    /* renamed from: h */
    public static final boolean f119487h = true;

    /* renamed from: i */
    public static final C13601g f119488i = C36568h.m40985a(C6528e.f23683d);

    /* renamed from: j */
    public static final boolean f119489j = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_sns_can_share_url_exceprt, false);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/o0$c;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$c */
    public static final class C6526c implements C80883e<IPCVoid, IPCString> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                HashMap<Integer, String> k502 = ((C10432i) C86312j.m106911c(C10432i.class)).k50();
                if (!(k502 instanceof HashMap)) {
                    k502 = null;
                }
                JSONArray jSONArray = new JSONArray();
                if (k502 != null) {
                    for (Map.Entry next : k502.entrySet()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", (Integer) next.getKey());
                        jSONObject.put("wording", (String) next.getValue());
                        jSONArray.put(jSONObject);
                    }
                }
                if (gVar != null) {
                    gVar.mo894a(new IPCString(jSONArray.toString()));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiHandleMPPageAction", e, "GetAuthorizationShowType exception", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$d */
    public static final class C6527d implements C75018a.C75025e {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23681a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23682b;

        public C6527d(C13855j jVar, C13851h1 h1Var) {
            this.f23681a = jVar;
            this.f23682b = h1Var;
        }

        /* renamed from: a */
        public void mo6958a() {
        }

        public void onHide() {
            C13849g gVar = this.f23681a.f39001d;
            String str = this.f23682b.f38990c;
            gVar.mo10774a(str, this.f23682b.f38996i + ":ok", (Map<String, Object>) null);
        }

        public void onShow() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$e */
    public static final class C6528e extends C87413o implements C32224a<MMKVSlotManager> {

        /* renamed from: d */
        public static final C6528e f23683d = new C6528e();

        public C6528e() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("PrefechLocalData");
            C87412m.m108593f(mmkv, "getMMKV(\"PrefechLocalData\")");
            return new MMKVSlotManager(mmkv, 2592000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$f */
    public static final class C6529f implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23684d;

        public C6529f(C13855j jVar) {
            this.f23684d = jVar;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == C44108o0.f119484e) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("event", i2 != -1 ? i2 != 0 ? StateEvent.ProcessResult.FAILED : "canceled" : "success");
                Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts resultCode:" + i2 + " event:" + hashMap.get("event"));
                C13849g gVar = this.f23684d.f39001d;
                C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((C48590l) gVar).mo8701f("onShareEmbedExcerptEvent", hashMap);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$g */
    public static final class C6530g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23685d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<Pair<String, String>> f23686e;

        /* renamed from: f */
        public final /* synthetic */ C13851h1 f23687f;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$g$a */
        public static final class C6531a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ ArrayList<Pair<String, String>> f23688d;

            public C6531a(ArrayList<Pair<String, String>> arrayList) {
                this.f23688d = arrayList;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                int size = this.f23688d.size();
                for (int i = 0; i < size; i++) {
                    e0Var.mo107142f(i, (CharSequence) this.f23688d.get(i).second);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$g$b */
        public static final class C6532b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ ArrayList<Pair<String, String>> f23689d;

            /* renamed from: e */
            public final /* synthetic */ C13855j f23690e;

            /* renamed from: f */
            public final /* synthetic */ C13851h1 f23691f;

            public C6532b(ArrayList<Pair<String, String>> arrayList, C13855j jVar, C13851h1 h1Var) {
                this.f23689d = arrayList;
                this.f23690e = jVar;
                this.f23691f = h1Var;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (i >= this.f23689d.size()) {
                    C13849g gVar = this.f23690e.f39001d;
                    String str = this.f23691f.f38990c;
                    gVar.mo10774a(str, this.f23691f.f38996i + ":fail", (Map<String, Object>) null);
                    return;
                }
                String str2 = (String) this.f23689d.get(i).first;
                HashMap hashMap = new HashMap();
                C87412m.m108593f(str2, "menuId");
                hashMap.put("id", str2);
                C13849g gVar2 = this.f23690e.f39001d;
                String str3 = this.f23691f.f38990c;
                gVar2.mo10774a(str3, this.f23691f.f38996i + ":ok", hashMap);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$g$c */
        public static final class C6533c implements C77407n.C12924o {

            /* renamed from: a */
            public final /* synthetic */ C13855j f23692a;

            /* renamed from: b */
            public final /* synthetic */ C13851h1 f23693b;

            public C6533c(C13855j jVar, C13851h1 h1Var) {
                this.f23692a = jVar;
                this.f23693b = h1Var;
            }

            /* renamed from: a */
            public final void mo2362a() {
                C13849g gVar = this.f23692a.f39001d;
                String str = this.f23693b.f38990c;
                gVar.mo10774a(str, this.f23693b.f38996i + ":canceled", (Map<String, Object>) null);
            }
        }

        public C6530g(C13855j jVar, ArrayList<Pair<String, String>> arrayList, C13851h1 h1Var) {
            this.f23685d = jVar;
            this.f23686e = arrayList;
            this.f23687f = h1Var;
        }

        public final void run() {
            C77407n nVar = new C77407n(this.f23685d.f38998a, 1, false);
            ArrayList<Pair<String, String>> arrayList = this.f23686e;
            nVar.f225771i = new C6531a(arrayList);
            C13855j jVar = this.f23685d;
            C13851h1 h1Var = this.f23687f;
            nVar.f225782p = new C6532b(arrayList, jVar, h1Var);
            nVar.f225802y = new C6533c(jVar, h1Var);
            nVar.mo107573q();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/o0$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/fav/api/DelFavoriteData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$a */
    public static final class C44109a implements C80916r<DelFavoriteData, IPCInteger> {
        public Object invoke(Object obj) {
            DelFavoriteData delFavoriteData = (DelFavoriteData) obj;
            if (delFavoriteData == null) {
                return new IPCInteger(2);
            }
            String str = delFavoriteData.f111465d;
            if (str != null) {
                String str2 = delFavoriteData.f111466e;
                if (str2 != null) {
                    String str3 = delFavoriteData.f111467f;
                    if (str3 != null) {
                        String str4 = delFavoriteData.f111468g;
                        if (str4 != null) {
                            String str5 = delFavoriteData.f111469h;
                            if (str5 != null) {
                                String str6 = delFavoriteData.f111470i;
                                if (str6 != null) {
                                    String str7 = delFavoriteData.f111471j;
                                    if (str7 != null) {
                                        return new IPCInteger(C44108o0.f119483d.mo68733g(str, str2, str3, str4, str5, str6, str7));
                                    }
                                    C87412m.m108603p("jsUserName");
                                    throw null;
                                }
                                C87412m.m108603p("srcUserName");
                                throw null;
                            }
                            C87412m.m108603p("itemShowTypeStr");
                            throw null;
                        }
                        C87412m.m108603p("srcDisplayName");
                        throw null;
                    }
                    C87412m.m108603p("initUrl");
                    throw null;
                }
                C87412m.m108603p("pageKey");
                throw null;
            }
            C87412m.m108603p("excerptKeys");
            throw null;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/o0$b;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/fav/api/DoFavoriteData;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$b */
    public static final class C44110b implements C80916r<DoFavoriteData, Bundle> {
        public Object invoke(Object obj) {
            DoFavoriteData doFavoriteData = (DoFavoriteData) obj;
            if (doFavoriteData != null) {
                String str = doFavoriteData.f111472d;
                if (str != null) {
                    String str2 = doFavoriteData.f111473e;
                    if (str2 != null) {
                        String str3 = doFavoriteData.f111474f;
                        if (str3 != null) {
                            String str4 = doFavoriteData.f111475g;
                            if (str4 != null) {
                                String str5 = doFavoriteData.f111476h;
                                if (str5 != null) {
                                    String str6 = doFavoriteData.f111477i;
                                    if (str6 != null) {
                                        String str7 = doFavoriteData.f111478j;
                                        if (str7 != null) {
                                            String str8 = doFavoriteData.f111479n;
                                            if (str8 != null) {
                                                String str9 = doFavoriteData.f111480o;
                                                if (str9 != null) {
                                                    int i = C44108o0.f119483d.mo68735i(str, str2, str3, str4, str5, str6, str7, str8, str9);
                                                    C47450f1 f1Var = (C47450f1) C86312j.m106911c(C47450f1.class);
                                                    String str10 = doFavoriteData.f111476h;
                                                    if (str10 != null) {
                                                        long KO = f1Var.mo72467KO(str10);
                                                        Bundle bundle = new Bundle();
                                                        bundle.putInt("key_result_code", i);
                                                        bundle.putLong("key_result_id", KO);
                                                        return bundle;
                                                    }
                                                    C87412m.m108603p("pageKey");
                                                    throw null;
                                                }
                                                C87412m.m108603p("jsUserName");
                                                throw null;
                                            }
                                            C87412m.m108603p("srcUserName");
                                            throw null;
                                        }
                                        C87412m.m108603p("itemShowTypeStr");
                                        throw null;
                                    }
                                    C87412m.m108603p("displayName");
                                    throw null;
                                }
                                C87412m.m108603p("pageKey");
                                throw null;
                            }
                            C87412m.m108603p("initUrl");
                            throw null;
                        }
                        C87412m.m108603p("cover");
                        throw null;
                    }
                    C87412m.m108603p("excerptJson");
                    throw null;
                }
                C87412m.m108603p(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_result_code", 2);
            return bundle2;
        }
    }

    static {
        C44108o0 o0Var = new C44108o0();
        f119483d = o0Var;
        f119484e = C87687a.m109085a(o0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r29, t83.C13851h1 r30) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.lang.String r4 = "action"
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "MicroMsg.JsApiHandleMPPageAction"
            java.lang.String r5 = "handleMPPageAction action=%s"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r5 = 0
            if (r4 == 0) goto L_0x004b
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail action is empty"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            return r6
        L_0x004b:
            java.lang.String r4 = "holdGoBackAction"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0080
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r4 == 0) goto L_0x005e
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.f118453C = r6
            goto L_0x0065
        L_0x005e:
            java.lang.String r0 = "MicroMsg.JsApiHandleMPPageAction"
            java.lang.String r4 = "not in WebViewUI now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
        L_0x0065:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            return r6
        L_0x0080:
            java.lang.String r4 = "enterEmbedMpVideo"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            r7 = 0
            if (r4 == 0) goto L_0x0169
            boolean r0 = r28.mo68731e(r29, r30)
            if (r0 != 0) goto L_0x0091
            goto L_0x0168
        L_0x0091:
            s90.n r0 = r28.mo68737k(r29, r30)
            android.content.Context r4 = r2.f38998a
            boolean r8 = r4 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r8 == 0) goto L_0x014e
            boolean r8 = r4 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r8 == 0) goto L_0x00b0
            r8 = r4
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            com.tencent.mm.ui.widget.MMWebView r8 = r8.f118523f
            if (r8 == 0) goto L_0x00ab
            float r8 = r8.getMMDensity()
            goto L_0x00b4
        L_0x00ab:
            float r8 = lg3.C88494d.m110349f()
            goto L_0x00b4
        L_0x00b0:
            float r8 = lg3.C88494d.m110349f()
        L_0x00b4:
            android.content.Context r9 = r2.f38998a
            int r9 = com.tencent.p014mm.p136ui.C75044y4.m89989a(r9)
            android.content.Context r10 = r2.f38998a
            int r10 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r10)
            java.util.Map<java.lang.String, java.lang.Object> r11 = r3.f38983a
            java.lang.String r12 = "videoCurrTime"
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            com.tencent.p014mm.sdk.platformtools.Util.getFloat(r11, r7)
            java.util.Map<java.lang.String, java.lang.Object> r11 = r3.f38983a
            java.lang.String r12 = "playerX"
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            float r11 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r11, r7)
            float r11 = r11 * r8
            int r11 = (int) r11
            r0.f129344u = r11
            java.util.Map<java.lang.String, java.lang.Object> r11 = r3.f38983a
            java.lang.String r12 = "playerY"
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            float r11 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r11, r7)
            float r11 = r11 * r8
            float r9 = (float) r9
            float r11 = r11 + r9
            float r9 = (float) r10
            float r11 = r11 + r9
            int r9 = (int) r11
            r0.f129345v = r9
            java.util.Map<java.lang.String, java.lang.Object> r9 = r3.f38983a
            java.lang.String r10 = "playerWidth"
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            float r9 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r9, r7)
            float r9 = r9 * r8
            int r9 = (int) r9
            r0.f129346w = r9
            java.util.Map<java.lang.String, java.lang.Object> r9 = r3.f38983a
            java.lang.String r10 = "playerHeight"
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            float r7 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r9, r7)
            float r7 = r7 * r8
            int r7 = (int) r7
            r0.f129347x = r7
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r4
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView r4 = r4.mo68294m8()
            monitor-enter(r4)
            r4.f119371x = r0     // Catch:{ all -> 0x014b }
            boolean r0 = r0.f129343C     // Catch:{ all -> 0x014b }
            r4.f119338H = r0     // Catch:{ all -> 0x014b }
            r4.mo68672m()     // Catch:{ all -> 0x014b }
            boolean r0 = r4.f119350U     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x013f
            r4.mo68667h()     // Catch:{ all -> 0x014b }
        L_0x013f:
            java.lang.String r0 = r4.f119353d     // Catch:{ all -> 0x014b }
            java.lang.String r7 = "initData"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)     // Catch:{ all -> 0x014b }
            r4.mo68659e()     // Catch:{ all -> 0x014b }
            monitor-exit(r4)
            goto L_0x014e
        L_0x014b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x014e:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x0168:
            return r6
        L_0x0169:
            java.lang.String r4 = "shareEmbedMpVideo"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            r9 = 2
            if (r4 == 0) goto L_0x023c
            boolean r0 = r28.mo68731e(r29, r30)
            if (r0 != 0) goto L_0x017a
            goto L_0x023b
        L_0x017a:
            s90.n r0 = r28.mo68737k(r29, r30)
            android.content.Context r4 = r2.f38998a
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            java.lang.String r10 = "MicroMsg.JsApiHandleMPPageAction"
            if (r7 == 0) goto L_0x01d9
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r4, r7)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r4
            int r4 = r4.f118573w1
            r0.f129348y = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "shareEmbedMpVideo bizUsrName="
            r4.append(r7)
            java.lang.String r7 = r0.f133375p
            r4.append(r7)
            java.lang.String r7 = ", mpUrl="
            r4.append(r7)
            java.lang.String r7 = r0.f133366d
            r4.append(r7)
            java.lang.String r7 = ", videoUrl="
            r4.append(r7)
            java.lang.String r7 = r0.f133367e
            r4.append(r7)
            java.lang.String r7 = ", width="
            r4.append(r7)
            int r7 = r0.f133372j
            r4.append(r7)
            java.lang.String r7 = ", height="
            r4.append(r7)
            int r7 = r0.f133373n
            r4.append(r7)
            java.lang.String r7 = ", videoDuration="
            r4.append(r7)
            int r7 = r0.f133371i
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
        L_0x01d9:
            boolean r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.m49076i()
            if (r4 == 0) goto L_0x01e7
            com.tencent.mm.plugin.webview.ui.tools.media.v r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44089v.f119438a
            android.content.Context r7 = r2.f38998a
            r4.mo68719a(r7, r0, r9)
            goto L_0x0209
        L_0x01e7:
            android.content.Context r11 = r2.f38998a
            boolean r4 = r11 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r4 == 0) goto L_0x0204
            r4 = r11
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r4
            com.tencent.mm.plugin.webview.ui.tools.media.t r4 = r4.f118539k2
            r4.f119434a = r0
            com.tencent.mm.plugin.webview.ui.tools.media.p r10 = com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44080p.f119428a
            java.lang.String r12 = r0.f133370h
            java.lang.String r14 = r0.f133369g
            java.lang.String r15 = r0.f133366d
            r16 = 2
            java.lang.String r13 = ""
            r10.mo68714b(r11, r12, r13, r14, r15, r16)
            goto L_0x0209
        L_0x0204:
            java.lang.String r0 = "not in WebViewUI now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x0209:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 18589(0x489d, float:2.6049E-41)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r9 = 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r8] = r9
            r8 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r6] = r8
            r0.mo160131h(r4, r7)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x023b:
            return r6
        L_0x023c:
            java.lang.String r4 = "share"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x02fc
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            java.lang.String r5 = "extInfo"
            if (r4 == 0) goto L_0x02de
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r2)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.f38983a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putString(r5, r2)
            com.tencent.mm.plugin.webview.ui.tools.g1 r0 = r0.f118465H1
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
            if (r2 == 0) goto L_0x02d6
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
            d93.h r2 = r2.f118491T0
            if (r2 != 0) goto L_0x0276
            goto L_0x02d6
        L_0x0276:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
            d93.h r2 = r2.f118491T0
            com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r2.mo70860c()
            r3 = 21
            boolean r3 = r0.mo68568B(r2, r3, r6)
            if (r3 != 0) goto L_0x02a3
            r3 = 23
            boolean r3 = r0.mo68568B(r2, r3, r9)
            if (r3 != 0) goto L_0x02a3
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
            r3 = 2131840259(0x7f114d03, float:1.9313793E38)
            java.lang.String r0 = r0.getString(r3)
            nj3.C76879j.m92726T(r2, r0)
            goto L_0x02fb
        L_0x02a3:
            qo3.n r3 = new qo3.n
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r0.mo68388b()
            r3.<init>((android.content.Context) r4, (int) r6, (boolean) r8)
            com.tencent.mm.plugin.webview.ui.tools.m1 r4 = new com.tencent.mm.plugin.webview.ui.tools.m1
            r4.<init>(r0, r2)
            r3.f225771i = r4
            com.tencent.mm.plugin.webview.ui.tools.n1 r2 = new com.tencent.mm.plugin.webview.ui.tools.n1
            r2.<init>(r0)
            r3.f225782p = r2
            java.lang.String r2 = " "
            r3.mo107568m(r2, r6, r8)
            boolean r2 = r0.f119139l
            if (r2 != 0) goto L_0x02cf
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
            int r0 = r0.mo68268Z7()
            r2 = 16
            if (r0 != r2) goto L_0x02d0
        L_0x02cf:
            r8 = 1
        L_0x02d0:
            r3.f225779n1 = r8
            r3.mo107573q()
            goto L_0x02fb
        L_0x02d6:
            java.lang.String r0 = "MicroMsg.WebViewMenuHelper"
            java.lang.String r2 = "showShareMenu params failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x02fb
        L_0x02de:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putString(r5, r0)
            com.tencent.mm.plugin.webview.stub.m r0 = r29.mo13184d()
            if (r0 == 0) goto L_0x02fb
            r2 = 88
            r0.mo7031V5(r2, r3)
        L_0x02fb:
            return r6
        L_0x02fc:
            java.lang.String r4 = "showToast"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0341
            android.content.Context r0 = r2.f38998a
            boolean r2 = r0 instanceof h93.C46014b
            if (r2 == 0) goto L_0x0340
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView"
            gy3.C87412m.m108592e(r0, r2)
            h93.b r0 = (h93.C46014b) r0
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r5 = "wording"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r7)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f38983a
            java.lang.String r8 = "status"
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r8)
            gy3.C87412m.m108592e(r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            r2.putString(r5, r4)
            r2.putString(r8, r3)
            r0.mo68249P0(r2)
        L_0x0340:
            return r6
        L_0x0341:
            java.lang.String r4 = "writeCommentReply"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            r10 = 0
            if (r4 == 0) goto L_0x03a4
            android.content.Context r0 = r2.f38998a
            boolean r2 = r0 instanceof h93.C46014b
            if (r2 == 0) goto L_0x03a3
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView"
            gy3.C87412m.m108592e(r0, r2)
            h93.b r0 = (h93.C46014b) r0
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r5 = "comment_id"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r10)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "reply_content"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            gy3.C87412m.m108592e(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f38983a
            java.lang.String r11 = "personal_comment_id"
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r11)
            gy3.C87412m.m108592e(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r8)
            java.lang.String r5 = "commentTopicId"
            r2.putLong(r5, r9)
            r2.putString(r7, r4)
            r2.putInt(r11, r3)
            r0.mo68323z2(r2)
        L_0x03a3:
            return r6
        L_0x03a4:
            java.lang.String r4 = "writeComment"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x03ef
            android.content.Context r0 = r2.f38998a
            boolean r2 = r0 instanceof h93.C46014b
            if (r2 == 0) goto L_0x03ee
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView"
            gy3.C87412m.m108592e(r0, r2)
            h93.b r0 = (h93.C46014b) r0
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r5 = "style"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r7)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f38983a
            java.lang.String r8 = "comment_id"
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r8)
            gy3.C87412m.m108592e(r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r10)
            r2.putString(r5, r4)
            java.lang.String r3 = "commentTopicId"
            r2.putLong(r3, r7)
            r0.mo68281g7(r2)
        L_0x03ee:
            return r6
        L_0x03ef:
            java.lang.String r4 = "longPressEmbedMpVideo"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0435
            boolean r0 = r28.mo68731e(r29, r30)
            if (r0 != 0) goto L_0x03fe
            goto L_0x0434
        L_0x03fe:
            s90.n r0 = r28.mo68737k(r29, r30)
            android.content.Context r4 = r2.f38998a
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r7 == 0) goto L_0x0413
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r4, r7)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r4
            int r4 = r4.f118573w1
            r0.f129348y = r4
        L_0x0413:
            com.tencent.mm.plugin.webview.ui.tools.media.v r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44089v.f119438a
            android.content.Context r7 = r2.f38998a
            r4.mo68719a(r7, r0, r6)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x0434:
            return r6
        L_0x0435:
            java.lang.String r4 = "insertVideoNativeView"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x046a
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof h93.C46013a
            if (r4 == 0) goto L_0x044f
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IBizVideoPage"
            gy3.C87412m.m108592e(r0, r4)
            h93.a r0 = (h93.C46013a) r0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            r0.mo71429a(r4)
        L_0x044f:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            return r6
        L_0x046a:
            java.lang.String r4 = "wxConfig"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0577
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.lang.String r4 = "appid"
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "webComptList"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "wxConfig webComptList="
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = ", appId="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.JsApiHandleMPPageAction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x053a }
            r7.<init>(r4)     // Catch:{ Exception -> 0x053a }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a     // Catch:{ Exception -> 0x053a }
            java.lang.String r9 = "url"
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x053a }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x053a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x053a }
            if (r4 != 0) goto L_0x04db
            t83.g r0 = r2.f39001d     // Catch:{ Exception -> 0x053a }
            java.lang.String r4 = r3.f38990c     // Catch:{ Exception -> 0x053a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053a }
            r7.<init>()     // Catch:{ Exception -> 0x053a }
            java.lang.String r9 = r3.f38996i     // Catch:{ Exception -> 0x053a }
            r7.append(r9)     // Catch:{ Exception -> 0x053a }
            java.lang.String r9 = ":fail invalid params"
            r7.append(r9)     // Catch:{ Exception -> 0x053a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x053a }
            r0.mo10774a(r4, r7, r5)     // Catch:{ Exception -> 0x053a }
            goto L_0x0576
        L_0x04db:
            com.tencent.mm.plugin.webview.webcompt.t r9 = com.tencent.p014mm.plugin.webview.webcompt.C6609t.f23865a     // Catch:{ Exception -> 0x053a }
            java.util.LinkedList r7 = r9.mo7532b(r4, r7)     // Catch:{ Exception -> 0x053a }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)     // Catch:{ Exception -> 0x053a }
            if (r9 == 0) goto L_0x0502
            t83.g r0 = r2.f39001d     // Catch:{ Exception -> 0x053a }
            java.lang.String r4 = r3.f38990c     // Catch:{ Exception -> 0x053a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x053a }
            r7.<init>()     // Catch:{ Exception -> 0x053a }
            java.lang.String r9 = r3.f38996i     // Catch:{ Exception -> 0x053a }
            r7.append(r9)     // Catch:{ Exception -> 0x053a }
            java.lang.String r9 = ":fail webComptList is null"
            r7.append(r9)     // Catch:{ Exception -> 0x053a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x053a }
            r0.mo10774a(r4, r7, r5)     // Catch:{ Exception -> 0x053a }
            goto L_0x0576
        L_0x0502:
            t83.g r9 = r2.f39001d     // Catch:{ Exception -> 0x053a }
            java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler"
            gy3.C87412m.m108592e(r9, r10)     // Catch:{ Exception -> 0x053a }
            t83.l r9 = (t83.C48590l) r9     // Catch:{ Exception -> 0x053a }
            com.tencent.mm.plugin.webview.webcompt.z r9 = r9.mo73268z()     // Catch:{ Exception -> 0x053a }
            if (r9 == 0) goto L_0x051f
            java.lang.String r10 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r10)     // Catch:{ Exception -> 0x053a }
            java.lang.String r10 = "nullAs(appId, \"\")"
            gy3.C87412m.m108593f(r0, r10)     // Catch:{ Exception -> 0x053a }
            r9.mo69226b(r0, r4, r7)     // Catch:{ Exception -> 0x053a }
        L_0x051f:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x0576
        L_0x053a:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "wxConfig ex "
            r4.append(r7)
            java.lang.String r7 = r0.getMessage()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r4)
            t83.g r2 = r2.f39001d
            java.lang.String r4 = r3.f38990c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = r3.f38996i
            r7.append(r3)
            java.lang.String r3 = ":fail ex "
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = ".message"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r2.mo10774a(r4, r0, r5)
        L_0x0576:
            return r6
        L_0x0577:
            java.lang.String r4 = "getFuncFlag"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x05d6
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r4 != 0) goto L_0x05a0
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x05d5
        L_0x05a0:
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.tencent.mm.plugin.webview.ui.tools.g1 r0 = r0.f118465H1
            int r0 = r0.mo68589y()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "shareFuncFlag"
            r4.put(r5, r0)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.f38996i
            r5.append(r3)
            java.lang.String r3 = ":ok"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.mo10774a(r2, r3, r4)
        L_0x05d5:
            return r6
        L_0x05d6:
            java.lang.String r4 = "sendMPPageData"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x065c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r4 = "action"
            java.lang.String r7 = "sendMPPageData"
            r0.putString(r4, r7)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "data"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r9)
            java.lang.String r4 = (java.lang.String) r4
            r0.putString(r7, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "sendTo"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            gy3.C87412m.m108592e(r4, r9)
            java.lang.String r4 = (java.lang.String) r4
            r0.putString(r7, r4)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "webviewId"
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r4 = r4.containsKey(r7)
            if (r4 == 0) goto L_0x062e
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            gy3.C87412m.m108592e(r4, r9)
            java.lang.String r4 = (java.lang.String) r4
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r8)
        L_0x062e:
            r0.putInt(r7, r8)
            android.content.Context r4 = r2.f38998a
            boolean r7 = r4 instanceof h93.C46013a
            if (r7 == 0) goto L_0x0641
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IBizVideoPage"
            gy3.C87412m.m108592e(r4, r7)
            h93.a r4 = (h93.C46013a) r4
            r4.mo71430b(r0)
        L_0x0641:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            return r6
        L_0x065c:
            java.lang.String r4 = "hasActivity"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x06a0
            android.content.Context r0 = r2.f38998a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0685
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x069f
        L_0x0685:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x069f:
            return r6
        L_0x06a0:
            java.lang.String r4 = "showMenu"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x07ab
            java.lang.String r4 = "MicroMsg.JsApiHandleMPPageAction"
            android.content.Context r0 = r2.f38998a
            boolean r7 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            java.lang.String r9 = ":fail"
            if (r7 != 0) goto L_0x06cd
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x06ca:
            r2 = 1
            goto L_0x07aa
        L_0x06cd:
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r7)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r3.f38983a
            java.lang.String r12 = "menuItems"
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r12)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x06f0
            boolean r12 = z04.C112551y.m153811k(r7)
            if (r12 == 0) goto L_0x06ee
            goto L_0x06f0
        L_0x06ee:
            r12 = 0
            goto L_0x06f1
        L_0x06f0:
            r12 = 1
        L_0x06f1:
            if (r12 != 0) goto L_0x0741
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ Exception -> 0x0720 }
            r12.<init>(r7)     // Catch:{ Exception -> 0x0720 }
            int r7 = r12.length()     // Catch:{ Exception -> 0x0720 }
            r13 = 0
        L_0x06fd:
            if (r13 >= r7) goto L_0x0741
            java.lang.String r14 = r12.getString(r13)     // Catch:{ Exception -> 0x0720 }
            r15.add(r14)     // Catch:{ Exception -> 0x0720 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0720 }
            r6.<init>()     // Catch:{ Exception -> 0x0720 }
            java.lang.String r10 = "showMenu:"
            r6.append(r10)     // Catch:{ Exception -> 0x0720 }
            r6.append(r14)     // Catch:{ Exception -> 0x0720 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0720 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)     // Catch:{ Exception -> 0x0720 }
            int r13 = r13 + 1
            r6 = 1
            r10 = 0
            goto L_0x06fd
        L_0x0720:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r7, r6)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x06ca
        L_0x0741:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r6 = "forbidFlag"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            r6 = 0
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r6)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r6 = "style"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "dark"
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r4)
            int r18 = r0.mo68268Z7()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$c r4 = r0.mo68270a8()
            if (r4 == 0) goto L_0x0771
            boolean r8 = r4.f118698h
        L_0x0771:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "isCurrentMPPageDisableMenuHeader  disableMenuHeader:"
            r4.append(r6)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MicroMsg.WebViewUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            com.tencent.mm.plugin.webview.ui.tools.g1 r12 = r0.f118465H1
            r17 = r8
            r12.mo68576J(r13, r15, r16, r17, r18)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x06ca
        L_0x07aa:
            return r2
        L_0x07ab:
            java.lang.String r4 = "doFavorite"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x07e7
            t83.g r0 = r2.f39001d
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler"
            gy3.C87412m.m108592e(r0, r4)
            t83.l r0 = (t83.C48590l) r0
            java.lang.String r6 = "sendAppMessage"
            r0.mo73243l(r6, r8)
            t83.g r0 = r2.f39001d
            gy3.C87412m.m108592e(r0, r4)
            t83.l r0 = (t83.C48590l) r0
            r4 = 1
            r0.mo73213J(r5, r4)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = r3.f38996i
            r6.append(r3)
            java.lang.String r3 = ":ok"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r0.mo10774a(r2, r3, r5)
            return r4
        L_0x07e7:
            java.lang.String r4 = "showNavShadow"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            r6 = 2131316974(0x7f0950ee, float:1.8252445E38)
            if (r4 == 0) goto L_0x0924
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r4 != 0) goto L_0x0815
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x0812:
            r2 = 1
            goto L_0x0923
        L_0x0815:
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r9 = "color"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.Object> r9 = r3.f38983a
            java.lang.String r10 = "traceId"
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0838
            java.lang.String r9 = ""
        L_0x0838:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r3.f38983a
            java.lang.String r11 = "alpha"
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            float r10 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r10, r7)
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0907
            r7 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0854
            goto L_0x0907
        L_0x0854:
            int r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6908c(r4, r8)
            android.view.Window r7 = r0.getWindow()
            android.view.View r7 = r7.getDecorView()
            java.lang.String r11 = "ui.window.decorView"
            gy3.C87412m.m108593f(r7, r11)
            boolean r11 = r7 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x08eb
            android.view.View r11 = r7.findViewById(r6)
            if (r11 != 0) goto L_0x08eb
            android.view.View r11 = new android.view.View
            r11.<init>(r0)
            r11.setBackgroundColor(r4)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Float r4 = java.lang.Float.valueOf(r10)
            r0.mo10233c(r4)
            java.lang.Object[] r21 = r0.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction"
            java.lang.String r23 = "showNavShadow"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setAlpha"
            java.lang.String r27 = "(F)V"
            r20 = r11
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r0 = r0.mo10231a(r8)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r11.setAlpha(r0)
            java.lang.String r13 = "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction"
            java.lang.String r14 = "showNavShadow"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setAlpha"
            java.lang.String r18 = "(F)V"
            r12 = r11
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            r11.setId(r6)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.v0 r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.v0
            r0.<init>(r9, r2)
            r11.setOnClickListener(r0)
            kw0.a r0 = kw0.C46746a.f125826a
            com.tencent.mm.ui.widget.MMWebView r4 = r2.f39002e
            int r0 = r0.mo71976i(r7, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "showNavShadow shadowHeight="
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MicroMsg.JsApiHandleMPPageAction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r4.<init>(r6, r0)
            r7.addView(r11, r4)
        L_0x08eb:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x0812
        L_0x0907:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail alpha value is invalid"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x0812
        L_0x0923:
            return r2
        L_0x0924:
            java.lang.String r4 = "hideNavShadow"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x098d
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r4 != 0) goto L_0x094e
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x094c:
            r2 = 1
            goto L_0x098c
        L_0x094e:
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r4 = "ui.window.decorView"
            gy3.C87412m.m108593f(r0, r4)
            android.view.View r4 = r0.findViewById(r6)
            if (r4 == 0) goto L_0x0971
            boolean r6 = r0 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0971
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r4)
        L_0x0971:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x094c
        L_0x098c:
            return r2
        L_0x098d:
            java.lang.String r4 = "syncReadState"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0a26
            android.content.Context r0 = r2.f38998a
            boolean r4 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r4 != 0) goto L_0x09b7
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x09b5:
            r2 = 1
            goto L_0x0a25
        L_0x09b7:
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            gy3.C87412m.m108592e(r0, r4)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r6 = "state"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "handleMPPageAction syncReadState state="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.JsApiHandleMPPageAction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            y93.a r0 = r0.f118483Q1
            if (r0 == 0) goto L_0x0a0a
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r7[r8] = r9
            java.lang.String r9 = "MicroMsg.WebMultiTaskHelper"
            java.lang.String r10 = "sync Read State %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r7)
            r0.f150465w = r6
            if (r4 != 0) goto L_0x0a05
            r0.f150464v = r8
            r0.mo67897d()
            r0.mo74195s(r5)
            goto L_0x0a0a
        L_0x0a05:
            r0.f150464v = r6
            r0.mo160072I()
        L_0x0a0a:
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x09b5
        L_0x0a25:
            return r2
        L_0x0a26:
            java.lang.String r4 = "reportRecommend"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0a8d
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.lang.String r4 = "reportData"
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0a42
            boolean r4 = z04.C112551y.m153811k(r0)
            if (r4 == 0) goto L_0x0a43
        L_0x0a42:
            r8 = 1
        L_0x0a43:
            if (r8 == 0) goto L_0x0a60
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            goto L_0x0a8b
        L_0x0a60:
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.String r6 = "PROCESS_MAIN"
            gy3.C87412m.m108593f(r4, r6)
            com.tencent.mm.ipcinvoker.type.IPCString r6 = new com.tencent.mm.ipcinvoker.type.IPCString
            r6.<init>(r0)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.u0<InputType, ResultType> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C30607u0.f82422d
            com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r4, r6, r0, r5)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x0a8b:
            r2 = 1
            return r2
        L_0x0a8d:
            java.lang.String r4 = "getTeenModeTemporaryVisitInfo"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0b2e
            java.lang.Class<ug.c0> r0 = p248ug.C52570c0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ug.c0 r0 = (p248ug.C52570c0) r0
            if (r0 == 0) goto L_0x0aa4
            boolean r0 = r0.mo58182e()
            goto L_0x0aa5
        L_0x0aa4:
            r0 = 0
        L_0x0aa5:
            if (r0 != 0) goto L_0x0ad9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getTeenModeTemporaryVisitInfo isTeenMode = "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "MicroMsg.JsApiHandleMPPageAction"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":fail, not int teen mode now"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
        L_0x0ad7:
            r2 = 1
            goto L_0x0b2d
        L_0x0ad9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            e00.t r4 = r29.mo13183c()
            if (r4 == 0) goto L_0x0ae8
            java.lang.String r5 = r4.getCurrentUrl()
        L_0x0ae8:
            gy3.a0 r6 = new gy3.a0
            r6.<init>()
            java.lang.Class<ex0.d> r7 = ex0.C45696d.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            ex0.d r7 = (ex0.C45696d) r7
            if (r7 == 0) goto L_0x0b01
            boolean r5 = r7.mo70989eQ(r5)
            r7 = 1
            if (r5 != r7) goto L_0x0b02
            r19 = 1
            goto L_0x0b04
        L_0x0b01:
            r7 = 1
        L_0x0b02:
            r19 = 0
        L_0x0b04:
            if (r19 == 0) goto L_0x0b07
            goto L_0x0b0f
        L_0x0b07:
            if (r4 == 0) goto L_0x0b10
            boolean r4 = r4.mo67714e()
            if (r4 != r7) goto L_0x0b10
        L_0x0b0f:
            r8 = 1
        L_0x0b10:
            r6.f27482d = r8
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            java.lang.String r5 = "isValidVisitNoAccessPage"
            r0.put(r5, r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCVoid r5 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r5.<init>()
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0$c> r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44108o0.C6526c.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.t0 r8 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t0
            r8.<init>(r0, r6, r2, r3)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r4, r5, r7, r8)
            goto L_0x0ad7
        L_0x0b2d:
            return r2
        L_0x0b2e:
            java.lang.String r4 = "setLocalData"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            r6 = 58
            if (r4 == 0) goto L_0x0ba7
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.lang.String r4 = "url"
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "key"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.Object> r7 = r3.f38983a
            java.lang.String r8 = "data"
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            rx3.g r8 = f119488i
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r8 = (com.tencent.p014mm.sdk.platformtools.MMKVSlotManager) r8
            java.lang.Object r8 = r8.getSlotForWrite()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r1.mo68739m(r0)
            r9.append(r0)
            r9.append(r6)
            r9.append(r4)
            java.lang.String r0 = r9.toString()
            r8.encode((java.lang.String) r0, (java.lang.String) r7)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.f38996i
            r4.append(r3)
            java.lang.String r3 = ":ok"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.mo10774a(r2, r3, r5)
            r2 = 1
            return r2
        L_0x0ba7:
            java.lang.String r4 = "getLocalData"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0c1b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f38983a
            java.lang.String r4 = "url"
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f38983a
            java.lang.String r7 = "key"
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            rx3.g r7 = f119488i
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r7 = (com.tencent.p014mm.sdk.platformtools.MMKVSlotManager) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = r1.mo68739m(r0)
            r8.append(r0)
            r8.append(r6)
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMKVSlotManager.decodeString$default(r7, r0, r5, r9, r5)
            if (r0 != 0) goto L_0x0bf5
            java.lang.String r0 = ""
        L_0x0bf5:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "data"
            r4.put(r5, r0)
            t83.g r0 = r2.f39001d
            java.lang.String r2 = r3.f38990c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = r3.f38996i
            r5.append(r3)
            java.lang.String r3 = ":ok"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.mo10774a(r2, r3, r4)
            r4 = 1
            return r4
        L_0x0c1b:
            r4 = 1
            java.lang.String r5 = "reportByLeaveForMPGateway"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c28
            r28.mo68745s(r29, r30)
            return r4
        L_0x0c28:
            java.lang.String r5 = "getEnterTime"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c34
            r28.mo68738l(r29, r30)
            return r4
        L_0x0c34:
            java.lang.String r5 = "getNavigationBarHeight"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c40
            r28.mo68740n(r29, r30)
            return r4
        L_0x0c40:
            java.lang.String r5 = "kv"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c4c
            r28.mo68743q(r29, r30)
            return r4
        L_0x0c4c:
            java.lang.String r5 = "idKey"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c58
            r28.mo68742p(r29, r30)
            return r4
        L_0x0c58:
            java.lang.String r5 = "showActionSheet"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c64
            r28.mo68749w(r29, r30)
            return r4
        L_0x0c64:
            java.lang.String r5 = "disableContextMenu"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c70
            r28.mo68747u(r29, r30)
            return r4
        L_0x0c70:
            java.lang.String r5 = "getWebTransStatus"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c7c
            r28.mo68744r(r29, r30)
            return r4
        L_0x0c7c:
            java.lang.String r5 = "doFavoriteExcerpt"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c88
            r28.mo68734h(r29, r30)
            return r4
        L_0x0c88:
            java.lang.String r5 = "delFavoriteExcerpt"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0c95
            boolean r0 = r28.mo68732f(r29, r30)
            return r0
        L_0x0c95:
            java.lang.String r5 = "shareExcerpts"
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0ca1
            r28.mo68748v(r29, r30)
            return r4
        L_0x0ca1:
            java.lang.String r5 = "setClipboardData"
            boolean r0 = gy3.C87412m.m108589b(r5, r0)
            if (r0 == 0) goto L_0x0cad
            r28.mo68746t(r29, r30)
            return r4
        L_0x0cad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44108o0.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f119485f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f119486g;
    }

    /* renamed from: d */
    public boolean mo7507d() {
        return f119487h;
    }

    /* renamed from: e */
    public final boolean mo68731e(C13855j jVar, C13851h1 h1Var) {
        if (Util.isNullOrNil((String) h1Var.f38983a.get("mpUrl"))) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail, mpUrl is null", (Map<String, Object>) null);
            return false;
        } else if (Util.isNullOrNil((String) h1Var.f38983a.get("bizUsrName"))) {
            C13849g gVar2 = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar2.mo10774a(str2, h1Var.f38996i + ":fail, bizUsrName is null", (Map<String, Object>) null);
            return false;
        } else if (Util.isNullOrNil((String) h1Var.f38983a.get("videoUrl"))) {
            C13849g gVar3 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar3.mo10774a(str3, h1Var.f38996i + ":fail, videoUrl is null", (Map<String, Object>) null);
            return false;
        } else if (!Util.isNullOrNil((String) h1Var.f38983a.get("videoVid"))) {
            return true;
        } else {
            C13849g gVar4 = jVar.f39001d;
            String str4 = h1Var.f38990c;
            gVar4.mo10774a(str4, h1Var.f38996i + ":fail, videoVid is null", (Map<String, Object>) null);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo68732f(C13855j jVar, C13851h1 h1Var) {
        String str;
        String str2;
        Object obj = h1Var.f38983a.get("excerptKeys");
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj;
        Object obj2 = h1Var.f38983a.get("pageKey");
        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
        String str4 = (String) obj2;
        String str5 = (String) h1Var.f38983a.get("url");
        String str6 = (String) h1Var.f38983a.get("src_displayname");
        String str7 = (String) h1Var.f38983a.get("itemShowType");
        String str8 = (String) h1Var.f38983a.get("src_username");
        String str9 = (String) h1Var.f38983a.get("userName");
        String valueOf = String.valueOf(str5);
        if (Util.isNullOrNil(str5)) {
            C45520t c = jVar.mo13183c();
            if (c == null || (str2 = c.mo67734o()) == null) {
                Object obj3 = h1Var.f38983a.get("key_webview_init_url");
                C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) obj3;
            }
            str = str2;
        } else {
            str = valueOf;
        }
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (MMApplicationContext.isMainProcess()) {
            int g = mo68733g(str3, str4, str, str6, str7, str8, str9);
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] main process result = " + g);
            mo68741o(jVar, h1Var, g, -1);
            return true;
        }
        DelFavoriteData delFavoriteData = new DelFavoriteData();
        delFavoriteData.f111465d = str3;
        delFavoriteData.f111466e = str4;
        delFavoriteData.f111467f = str;
        if (str6 == null) {
            str6 = "";
        }
        delFavoriteData.f111468g = str6;
        if (str7 == null) {
            str7 = "";
        }
        delFavoriteData.f111469h = str7;
        if (str8 == null) {
            str8 = "";
        }
        delFavoriteData.f111470i = str8;
        if (str9 == null) {
            str9 = "";
        }
        delFavoriteData.f111471j = str9;
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, delFavoriteData, C44109a.class);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] tools process result = " + iPCInteger.f10313d);
        mo68741o(jVar, h1Var, iPCInteger.f10313d, -1);
        return true;
    }

    /* renamed from: g */
    public final int mo68733g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i;
        String str8;
        String str9 = str;
        String str10 = str2;
        Class cls = C47450f1.class;
        String valueOf = !Util.isNullOrNil(str6) ? String.valueOf(str6) : "";
        if (Util.isNullOrNil(valueOf)) {
            valueOf = String.valueOf(str7);
        }
        String str11 = valueOf;
        if (Util.isNullOrNil(str11)) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] userName is Nil return");
            return 2;
        }
        int i2 = Util.getInt(str5, -1);
        if (i2 == -1) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] itemShowType = -1, maybe error");
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[delFavoriteExcerpt] initUrl = ");
        String str12 = str3;
        sb.append(str12);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", sb.toString());
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] pageKey = " + str10);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] excerptKeys = " + str9);
        C101756ae0 en02 = ((C47450f1) C86312j.m106911c(cls)).en0(str10);
        if (en02 == null) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] favUrlItem == null, maybe error, return");
            return 2;
        }
        String str13 = en02.f297863d;
        LinkedList<C52097yc0> linkedList = en02.f297881y;
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        String str14 = en02.f297869j;
        String EV = ((C47450f1) C86312j.m106911c(cls)).mo72466EV(str9);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] excerptList.size = " + linkedList.size());
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] excerptKeyParse = " + EV);
        if (linkedList.size() == 0) {
            return 2;
        }
        int size = linkedList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i = -1;
                i3 = -1;
                break;
            }
            C52097yc0 yc02 = linkedList.get(i3);
            C87412m.m108593f(yc02, "excerptList[index]");
            C52097yc0 yc03 = yc02;
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] excerpt.key = " + yc03.f145225d);
            if (C87412m.m108589b(yc03.f145225d, EV)) {
                Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] remove excerpt index = " + i3);
                i = -1;
                break;
            }
            i3++;
        }
        if (i3 != i) {
            linkedList.remove(i3);
        }
        if (linkedList.size() != 0) {
            C52097yc0 yc04 = linkedList.get(linkedList.size() - 1);
            C87412m.m108593f(yc04, "excerptList[excerptList.size - 1]");
            String str15 = yc04.f145227f;
            C87412m.m108593f(str15, "lastExcerpt.url");
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] use lastExcerpt url");
            str12 = str15;
        }
        if (Util.isNullOrNil(str12)) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] url still is null or nil, return");
            return 2;
        }
        int size2 = linkedList.size();
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] excerptCount = " + size2);
        if (size2 != 0) {
            String Sh0 = ((C47450f1) C86312j.m106911c(cls)).Sh0(size2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Sh0);
            for (int size3 = linkedList.size() - 1; -1 < size3; size3--) {
                sb4.append(linkedList.get(size3).f145226e);
            }
            str8 = sb4.toString();
            C87412m.m108593f(str8, "descBuilder.toString()");
        } else {
            str8 = "";
        }
        if (str8.length() > 10001) {
            str8 = str8.substring(0, 10001);
            C87412m.m108593f(str8, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String str16 = str8;
        C87412m.m108593f(str13, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108593f(str14, "cover");
        return mo68736j(str12, str13, str16, str14, str2, linkedList, str4 == null ? "" : str4, str11, i2) ? 1 : 2;
    }

    /* renamed from: h */
    public final boolean mo68734h(C13855j jVar, C13851h1 h1Var) {
        Object obj = h1Var.f38983a.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = h1Var.f38983a.get("excerptList");
        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = h1Var.f38983a.get("cover");
        C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj3;
        Object obj4 = h1Var.f38983a.get("key_webview_init_url");
        C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.String");
        String str4 = (String) obj4;
        Object obj5 = h1Var.f38983a.get("pageKey");
        C87412m.m108592e(obj5, "null cannot be cast to non-null type kotlin.String");
        String str5 = (String) obj5;
        String str6 = (String) h1Var.f38983a.get("src_displayname");
        String str7 = (String) h1Var.f38983a.get("itemShowType");
        String str8 = (String) h1Var.f38983a.get("src_username");
        String str9 = (String) h1Var.f38983a.get("userName");
        if (MMApplicationContext.isMainProcess()) {
            int i = mo68735i(str, str2, str3, str4, str5, str6, str7, str8, str9);
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] main process result = " + i);
            mo68741o(jVar, h1Var, i, -1);
            return true;
        }
        DoFavoriteData doFavoriteData = new DoFavoriteData();
        doFavoriteData.f111472d = str;
        doFavoriteData.f111473e = str2;
        doFavoriteData.f111474f = str3;
        doFavoriteData.f111475g = str4;
        doFavoriteData.f111476h = str5;
        if (str6 == null) {
            str6 = "";
        }
        doFavoriteData.f111477i = str6;
        if (str7 == null) {
            str7 = "";
        }
        doFavoriteData.f111478j = str7;
        if (str8 == null) {
            str8 = "";
        }
        doFavoriteData.f111479n = str8;
        if (str9 == null) {
            str9 = "";
        }
        doFavoriteData.f111480o = str9;
        Bundle bundle = (Bundle) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, doFavoriteData, C44110b.class);
        if (bundle == null) {
            return true;
        }
        int i2 = bundle.getInt("key_result_code", 2);
        long j = bundle.getLong("key_result_id", -1);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] tools process result code = " + i2 + ", favId = " + j);
        mo68741o(jVar, h1Var, i2, j);
        return true;
    }

    /* renamed from: i */
    public final int mo68735i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        String str11 = str2;
        String str12 = str5;
        Class cls = C47450f1.class;
        String valueOf = !Util.isNullOrNil(str8) ? String.valueOf(str8) : "";
        if (Util.isNullOrNil(valueOf)) {
            valueOf = String.valueOf(str9);
        }
        String str13 = valueOf;
        if (Util.isNullOrNil(str13)) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] userName is Nil return");
            return 2;
        }
        int i = Util.getInt(str7, -1);
        if (i == -1) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] itemShowType = -1, maybe error");
            return 2;
        }
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] pageKey=" + str12 + ", excerptJson=" + str11);
        LinkedList<C52097yc0> wn = ((C47450f1) C86312j.m106911c(cls)).mo72471wn(str11);
        int size = wn.size();
        StringBuilder sb = new StringBuilder();
        sb.append(((C47450f1) C86312j.m106911c(cls)).Sh0(size));
        for (int size2 = wn.size() - 1; -1 < size2; size2 += -1) {
            C52097yc0 yc02 = wn.get(size2);
            C87412m.m108593f(yc02, "excerptList[index]");
            C52097yc0 yc03 = yc02;
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] key=" + yc03.f145225d + ", text=" + yc03.f145226e + ", url=" + yc03.f145227f);
            sb.append(yc03.f145226e);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "descBuilder.toString()");
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] desc = " + sb4);
        if (sb4.length() > 10001) {
            sb4 = sb4.substring(0, 10001);
            C87412m.m108593f(sb4, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String str14 = sb4;
        if (wn.size() != 0) {
            C52097yc0 yc04 = wn.get(wn.size() - 1);
            C87412m.m108593f(yc04, "excerptList[excerptList.size - 1]");
            String str15 = yc04.f145227f;
            C87412m.m108593f(str15, "lastExcerpt.url");
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] use lastExcerpt url");
            str10 = str15;
        } else {
            str10 = str4;
        }
        if (!mo68736j(str10, str, str14, str3, str5, wn, str6, str13, i)) {
            return 2;
        }
        return (wn.size() == 1 || ((C47450f1) C86312j.m106911c(cls)).en0(str12) == null) ? 3 : 1;
    }

    /* renamed from: j */
    public final boolean mo68736j(String str, String str2, String str3, String str4, String str5, LinkedList<C52097yc0> linkedList, String str6, String str7, int i) {
        if (C68065f.m80397f(i)) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] itemShowType isBizVideo = " + i);
            return false;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        doFavoriteEvent.f264674d.f264690o = true;
        C96648g.C6033a aVar = new C96648g.C6033a();
        aVar.f22303h = true;
        aVar.f22299d = str4;
        aVar.f22297b = str2;
        aVar.f22298c = str3;
        aVar.f22300e = "";
        aVar.f22301f = str5;
        aVar.f22302g = linkedList;
        aVar.f22296a = str;
        C101755ad0 ad02 = new C101755ad0();
        aVar.f22305j = ad02;
        ad02.f297848d = i;
        ad02.f297855n = str7;
        ad02.f297856o = String.valueOf(str6);
        C96648g.m124062a(doFavoriteEvent, aVar);
        doFavoriteEvent.f264674d.f264693r = false;
        doFavoriteEvent.publish();
        if (doFavoriteEvent.f264675e.f9046a == 0) {
            Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] do favorite success");
            return true;
        }
        Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] do favorite fail");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0176  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s90.C48300n mo68737k(t83.C13855j r24, t83.C13851h1 r25) {
        /*
            r23 = this;
            r1 = r25
            java.lang.String r2 = "MicroMsg.JsApiHandleMPPageAction"
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r3 = "mpUrl"
            java.lang.Object r0 = r0.get(r3)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r4 = "bizUsrName"
            java.lang.Object r0 = r0.get(r4)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r5 = "videoUrl"
            java.lang.Object r0 = r0.get(r5)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r6 = "videoTitle"
            java.lang.Object r0 = r0.get(r6)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r7 = "videoVid"
            java.lang.Object r0 = r0.get(r7)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r8 = "bizNickName"
            java.lang.Object r0 = r0.get(r8)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r9 = "videoThumbUrl"
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r0, r9)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r10 = "videoThumbData"
            java.lang.Object r0 = r0.get(r10)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r11 = "headImgUrl"
            java.lang.Object r0 = r0.get(r11)
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r11 = "videoDuration"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            r11 = 0
            float r14 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r0, r11)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r11 = "videoWidth"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            r13 = 0
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r13)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r11 = "videoHeight"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            int r17 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r13)
            r12 = 1
            if (r10 == 0) goto L_0x012c
            r11 = 2
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00db }
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r11 = r0
            r12 = r18
            r13 = r19
            r22 = r14
            r14 = r20
            r1 = r15
            r15 = r21
            java.util.List r0 = z04.C112550d0.m153785U(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00d7 }
            r10 = 1
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d5 }
            r11 = 2
            byte[] r0 = android.util.Base64.decode(r0, r11)     // Catch:{ Exception -> 0x00d3 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r0)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00f9
        L_0x00d3:
            r0 = move-exception
            goto L_0x00e0
        L_0x00d5:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d7:
            r0 = move-exception
            r10 = 1
        L_0x00d9:
            r11 = 2
            goto L_0x00e0
        L_0x00db:
            r0 = move-exception
            r22 = r14
            r1 = r15
            r10 = 1
        L_0x00e0:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "stringToBitmap fail "
            r12.append(r13)
            java.lang.String r0 = r0.getMessage()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = 0
        L_0x00f9:
            if (r0 == 0) goto L_0x0130
            boolean r12 = r0.isRecycled()
            if (r12 != 0) goto L_0x0130
            int r16 = r0.getWidth()
            int r17 = r0.getHeight()
            java.lang.String r12 = "MpShareVideoImage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12, r11)     // Catch:{ Exception -> 0x0123 }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0123 }
            r12.<init>()     // Catch:{ Exception -> 0x0123 }
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0123 }
            r14 = 100
            r0.compress(r13, r14, r12)     // Catch:{ Exception -> 0x0123 }
            byte[] r0 = r12.toByteArray()     // Catch:{ Exception -> 0x0123 }
            r11.encode((java.lang.String) r7, (byte[]) r0)     // Catch:{ Exception -> 0x0123 }
            goto L_0x0130
        L_0x0123:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x0130
        L_0x012c:
            r22 = r14
            r1 = r15
            r10 = 1
        L_0x0130:
            r0 = r16
            r2 = r17
            s90.n r11 = new s90.n
            r11.<init>()
            r11.f133375p = r4
            r11.f133376q = r8
            r11.f133366d = r3
            r11.f133367e = r5
            r11.f133368f = r7
            r11.f133369g = r6
            r11.f133370h = r9
            r11.f133372j = r0
            r11.f133373n = r2
            r2 = r22
            int r0 = (int) r2
            r11.f133371i = r0
            r11.f129342B = r1
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122309a
            r11.f133374o = r0
            r1 = r25
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f38983a
            java.lang.String r1 = "forbidForward"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 != r10) goto L_0x016b
            r13 = 1
            goto L_0x016c
        L_0x016b:
            r13 = 0
        L_0x016c:
            r11.f129343C = r13
            r1 = r24
            android.content.Context r0 = r1.f38998a
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            if (r1 == 0) goto L_0x019c
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "prePublishId"
            java.lang.String r1 = r1.getStringExtra(r2)
            r11.f133377r = r1
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "preChatName"
            java.lang.String r1 = r1.getStringExtra(r2)
            r11.f133378s = r1
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "preUsername"
            java.lang.String r0 = r0.getStringExtra(r1)
            r11.f133379t = r0
        L_0x019c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44108o0.mo68737k(t83.j, t83.h1):s90.n");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [e00.t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo68738l(t83.C13855j r9, t83.C13851h1 r10) {
        /*
            r8 = this;
            android.content.Context r0 = r9.f38998a
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0023
            t83.g r9 = r9.f39001d
            java.lang.String r0 = r10.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r10.f38996i
            r3.append(r10)
            java.lang.String r10 = ":fail"
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            r9.mo10774a(r0, r10, r2)
            return r1
        L_0x0023:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            e00.t r3 = r9.mo13183c()
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.webview.core.BaseWebViewController
            if (r4 == 0) goto L_0x0033
            com.tencent.mm.plugin.webview.core.BaseWebViewController r3 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r3
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            r4 = 0
            if (r3 == 0) goto L_0x003f
            ea3.u r3 = r3.f117543Q
            if (r3 == 0) goto L_0x003f
            long r6 = r3.f123352s
            goto L_0x0040
        L_0x003f:
            r6 = r4
        L_0x0040:
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "clickTimeMs"
            r0.put(r6, r3)
            e00.t r3 = r9.mo13183c()
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.webview.core.BaseWebViewController
            if (r6 == 0) goto L_0x0054
            r2 = r3
            com.tencent.mm.plugin.webview.core.BaseWebViewController r2 = (com.tencent.p014mm.plugin.webview.core.BaseWebViewController) r2
        L_0x0054:
            if (r2 == 0) goto L_0x005c
            ea3.u r2 = r2.f117543Q
            if (r2 == 0) goto L_0x005c
            long r4 = r2.f123355v
        L_0x005c:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = "enterTimeMs"
            r0.put(r3, r2)
            t83.g r9 = r9.f39001d
            java.lang.String r2 = r10.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = r10.f38996i
            r3.append(r10)
            java.lang.String r10 = ":ok"
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            r9.mo10774a(r2, r10, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44108o0.mo68738l(t83.j, t83.h1):boolean");
    }

    /* renamed from: m */
    public final String mo68739m(String str) {
        C87412m.m108594g(str, "<this>");
        try {
            String host = Uri.parse(str).getHost();
            return host == null ? "unknow" : host;
        } catch (Exception unused) {
            return "unknow";
        }
    }

    /* renamed from: n */
    public final boolean mo68740n(C13855j jVar, C13851h1 h1Var) {
        float f;
        Context context = jVar.f38998a;
        if (!(context instanceof WebViewUI)) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return true;
        }
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int c = C75044y4.m89991c((WebViewUI) context);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction navBarHeight=" + c);
        HashMap hashMap = new HashMap();
        float f2 = (float) c;
        Context context2 = jVar.f38998a;
        if (context2 instanceof WebViewUI) {
            MMWebView mMWebView = ((WebViewUI) context2).f118523f;
            f = mMWebView != null ? mMWebView.getMMDensity() : C88494d.m110349f();
        } else {
            f = C88494d.m110349f();
        }
        hashMap.put("height", Float.valueOf(f2 / f));
        C13849g gVar2 = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar2.mo10774a(str2, h1Var.f38996i + ":ok", hashMap);
        return true;
    }

    /* renamed from: o */
    public final void mo68741o(C13855j jVar, C13851h1 h1Var, int i, long j) {
        if (i == 1) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        }
        if (i == 2) {
            C13849g gVar2 = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar2.mo10774a(str2, h1Var.f38996i + ":fail", (Map<String, Object>) null);
        }
        if (i == 3) {
            C6527d dVar = new C6527d(jVar, h1Var);
            String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.ctz);
            Context context = jVar.f38998a;
            C87412m.m108593f(q, MimeTypes.BASE_TYPE_TEXT);
            ((C47450f1) C86312j.m106911c(C47450f1.class)).mo72470hW(context, q, dVar, j);
        }
    }

    /* renamed from: p */
    public final boolean mo68742p(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        long j = Util.getLong((String) h1Var.f38983a.get("id"), 0);
        long j2 = Util.getLong((String) h1Var.f38983a.get("key"), 0);
        long j3 = Util.getLong((String) h1Var.f38983a.get("value"), 0);
        if (j <= 0) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "idKey id can't be 0");
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return true;
        }
        Log.m105918d("MicroMsg.JsApiHandleMPPageAction", "idKey id=" + j + ", key=" + j2 + ", value=" + j3);
        C115669n.INSTANCE.mo175913w(j, j2, j3);
        C13849g gVar2 = jVar.f39001d;
        String str2 = h1Var.f38990c;
        StringBuilder sb = new StringBuilder();
        sb.append(h1Var.f38996i);
        sb.append(":ok");
        gVar2.mo10774a(str2, sb.toString(), (Map<String, Object>) null);
        return true;
    }

    /* renamed from: q */
    public final boolean mo68743q(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        int i = Util.getInt((String) h1Var.f38983a.get("id"), 0);
        if (i <= 0) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "kvStat id can't be 0");
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return true;
        }
        String str2 = (String) h1Var.f38983a.get("data");
        Log.m105918d("MicroMsg.JsApiHandleMPPageAction", "kvStat id=" + i + ", data=" + str2);
        C115669n.INSTANCE.kvStat(i, str2);
        C13849g gVar2 = jVar.f39001d;
        String str3 = h1Var.f38990c;
        gVar2.mo10774a(str3, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: r */
    public final boolean mo68744r(C13855j jVar, C13851h1 h1Var) {
        Context context = jVar.f38998a;
        if (!(context instanceof WebViewUI)) {
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail, is not WebviewUI", (Map<String, Object>) null);
            return true;
        }
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        C46176a0 value = ((WebViewUI) context).f118477N1.f118669f.f117508h.getValue();
        int i = value != null ? value.f124477d : 0;
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction current trans status  = " + i + '}');
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(i));
        C13849g gVar2 = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar2.mo10774a(str2, h1Var.f38996i + ":ok", hashMap);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo68745s(t83.C13855j r8, t83.C13851h1 r9) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f38983a
            java.lang.String r2 = "reportData"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x002c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = "data"
            java.lang.String r1 = r3.optString(r1, r0)     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "reportObject.optString(\"data\", \"\")"
            gy3.C87412m.m108593f(r1, r4)     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "music_data"
            java.lang.String r3 = r3.optString(r4, r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = "reportObject.optString(\"music_data\", \"\")"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x002a }
            r0 = r3
            goto L_0x003e
        L_0x002a:
            r3 = move-exception
            goto L_0x002e
        L_0x002c:
            r3 = move-exception
            r1 = r0
        L_0x002e:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            java.lang.String r3 = r3.getMessage()
            r4[r5] = r3
            java.lang.String r3 = "MicroMsg.JsApiHandleMPPageAction"
            java.lang.String r5 = "reportByLeaveForMPGateway, ex = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r5, r4)
        L_0x003e:
            ba3.a r3 = ba3.C39750a.f106644a
            boolean r4 = r3.mo62385a()
            if (r4 != 0) goto L_0x0047
            goto L_0x0067
        L_0x0047:
            java.lang.String r4 = "MicroMsg.MPVideoPreviewDataMgr"
            java.lang.String r5 = "reportByLeaveForMPGateway"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r9.f38983a
            java.lang.String r6 = "native_data"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x0064
            java.lang.String r3 = "reportByLeaveForMPGateway native_data null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x0067
        L_0x0064:
            r3.mo62387c(r5)
        L_0x0067:
            com.tencent.p014mm.plugin.webview.modeltools.C43764z.m47614a(r1)
            com.tencent.p014mm.plugin.webview.modeltools.C43764z.m47615b(r0)
            t83.g r8 = r8.f39001d
            java.lang.String r0 = r9.f38990c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = r9.f38996i
            r1.append(r9)
            java.lang.String r9 = ":ok"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r1 = 0
            r8.mo10774a(r0, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44108o0.mo68745s(t83.j, t83.h1):boolean");
    }

    /* renamed from: t */
    public final boolean mo68746t(C13855j jVar, C13851h1 h1Var) {
        Object obj = h1Var.f38983a.get(MimeTypes.BASE_TYPE_TEXT);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        ClipboardHelper.setText(jVar.f38998a, MimeTypes.BASE_TYPE_TEXT, str);
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: u */
    public final boolean mo68747u(C13855j jVar, C13851h1 h1Var) {
        WebSettings settings;
        int i = 0;
        if (Util.getBoolean((String) h1Var.f38983a.get("disable"), false)) {
            i = Integer.MAX_VALUE;
        }
        MMWebView mMWebView = jVar.f39002e;
        if (mMWebView == null || (settings = mMWebView.getSettings()) == null) {
            return true;
        }
        settings.setDisabledActionModeMenuItems(i);
        return true;
    }

    /* renamed from: v */
    public final boolean mo68748v(C13855j jVar, C13851h1 h1Var) {
        byte[] bArr;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        String str = (String) h1Var2.f38983a.get("imageData");
        String str2 = (String) h1Var2.f38983a.get("url");
        String n = str != null ? C112551y.m153814n(str, "data:image/png;base64,", "", false) : null;
        if (Util.isNullOrNil(n)) {
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts imageData nil");
            jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
            return true;
        }
        String str3 = C112760b.m154203K() + "/excerpts_image_" + System.currentTimeMillis();
        try {
            bArr = Base64.decode(n, 0);
        } catch (Exception e) {
            Exception exc = e;
            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts Base64.decode fail: " + exc.getLocalizedMessage());
            bArr = null;
        }
        if (!(bArr == null)) {
            if (!(bArr.length == 0)) {
                if (!C86013q1.m106450k(C112760b.m154203K())) {
                    C86013q1.m106461v(C112760b.m154203K());
                }
                C86013q1.m106438T(str3, bArr, 0, bArr.length);
                Log.m105926v("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts tmpPath:" + str3 + " size:" + bArr.length);
                Context context = jVar2.f38998a;
                if (context instanceof WebViewUI) {
                    if (f119489j) {
                        C77407n nVar = new C77407n(context, 0, false);
                        nVar.f225771i = new C6537p0(2147483646, jVar2, 2147483645);
                        Context context2 = jVar2.f38998a;
                        WebViewUI webViewUI = context2 instanceof WebViewUI ? (WebViewUI) context2 : null;
                        if (webViewUI == null) {
                            Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "webViewUI == null!");
                            jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail, webViewUI == null", (Map<String, Object>) null);
                        } else {
                            C43522y yVar = webViewUI.f118513b1;
                            C87412m.m108593f(yVar, "webViewUI.controller");
                            C58536w wVar = webViewUI.f118465H1.f119135h;
                            C87412m.m108593f(wVar, "webViewUI.menuHelper.recentForwardReporter");
                            C6549r0 r0Var = new C6549r0(str3, webViewUI, jVar2, str2);
                            C15133e0 Ct0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
                            C44245d dVar = r12;
                            C44245d dVar2 = new C44245d(Ct0, webViewUI, nVar, yVar, wVar, (View) null);
                            nVar.f225778n = dVar;
                            nVar.f225789s = new C44251e(Ct0, wVar, r0Var, yVar);
                            nVar.f225791t = new C44254f(Ct0, nVar);
                            C77407n nVar2 = nVar;
                            nVar2.f225782p = new C6556s0(2147483646, jVar, 2147483645, str3, str2, webViewUI);
                            nVar2.mo107573q();
                        }
                    } else {
                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        Intent intent = new Intent();
                        intent.putExtra("Retr_File_Name", str3);
                        intent.putExtra("Retr_Compress_Type", 1);
                        intent.putExtra("Retr_Msg_Type", 0);
                        intent.putExtra("Retr_show_success_tips", true);
                        intent.putExtra("img_source_url", str2);
                        C13598b0 b0Var = C13598b0.f38549a;
                        C88144b.m109803u((MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, f119484e, new C6529f(jVar2));
                    }
                    jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":ok", (Map<String, Object>) null);
                } else {
                    Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts context not activity");
                    jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                }
                return true;
            }
        }
        Log.m105920e("MicroMsg.JsApiHandleMPPageAction", "shareExcerpts image data buffer nil");
        jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: w */
    public final boolean mo68749w(C13855j jVar, C13851h1 h1Var) {
        Object obj = h1Var.f38983a.get("buttons");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            jVar.f39001d.mo10774a(h1Var.f38990c, "handleMPPageAction:fail params invalid", (Map<String, Object>) null);
            return true;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                arrayList.add(new Pair(optJSONObject.optString("id"), optJSONObject.optString("label")));
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C6530g(jVar, arrayList, h1Var));
        } catch (Exception unused) {
        }
        return true;
    }
}
