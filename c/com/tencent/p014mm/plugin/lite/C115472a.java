package com.tencent.p014mm.plugin.lite;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.google.android.gms.common.Scopes;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.ext.p313ui.C114718c;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiWriteCommData;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82334j;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55513k;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C42491c0;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C42493h;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C42495n;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C42498w;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4776a;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4778a0;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4779b;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4780b0;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4781c;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4782d;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4783d0;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4784e;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4785f;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4786g;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4787i;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4788j;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4789k;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4790l;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4793q;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4794r;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4795s;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4796t;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4801u;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4802v;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4803x;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4804y;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C4805z;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C56836m;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C56838o;
import com.tencent.p014mm.plugin.lite.jsapi.comms.C56840p;
import com.tencent.p014mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState;
import com.tencent.p014mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV;
import com.tencent.p014mm.plugin.lite.jsapi.module.LiteAppDebugPannelModule;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.lite.logic.C115501v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import di3.C7335d;
import di3.C86312j;
import dl0.C86342c;
import gy3.C8480h;
import gy3.C87412m;
import j22.C9272a;
import j22.C9274b;
import j22.C9275c;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k22.C88075g;
import l22.C10457e;
import m22.C10702a;
import m22.C10704b;
import m22.C10706c;
import m22.C10707d;
import m22.C10709e;
import m22.C10711f;
import m22.C10712g;
import m22.C10713h;
import m22.C10714i;
import m22.C10715j;
import m22.C10716k;
import m22.C10717l;
import n22.C11112a;
import n22.C11113b;
import n22.C11114c;
import n22.C11115d;
import n22.C11116e;
import o22.C11344a;
import o22.C61921b;
import org.json.JSONObject;
import p1005ma.C88717a;
import p1005ma.C88718b;
import p1197ja.C117308a;
import p193la.C10479a;
import p244tt.C118512d;
import p979ia.C117147b;
import p979ia.C87682a;
import sx3.C26236u;
import tw3.C118552d;
import uw3.C118630c;
import ww3.C118789a;
import yx1.C53635c;
import z04.C112550d0;
import z04.C119027c;
import z51.C119061h;

/* renamed from: com.tencent.mm.plugin.lite.a */
public final class C115472a {

    /* renamed from: a */
    public static final C115473a f346202a = new C115473a((C8480h) null);

    /* renamed from: b */
    public static boolean f346203b;

    /* renamed from: c */
    public static boolean f346204c;

    /* renamed from: d */
    public static Map<String, String> f346205d = new HashMap();

    /* renamed from: com.tencent.mm.plugin.lite.a$a */
    public static final class C115473a {

        /* renamed from: com.tencent.mm.plugin.lite.a$a$a */
        public static final class C115474a implements C88717a {
            /* renamed from: d */
            public void mo123151d(String str, String str2, Object... objArr) {
                C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_FORMAT);
                C87412m.m108594g(objArr, "objects");
                if (!(objArr.length == 0)) {
                    Log.m105918d(str, String.format(str2, Arrays.copyOf(objArr, objArr.length)));
                } else {
                    Log.m105918d(str, str2);
                }
            }

            /* renamed from: e */
            public void mo123152e(String str, String str2, Object... objArr) {
                C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_FORMAT);
                C87412m.m108594g(objArr, "objects");
                if (!(objArr.length == 0)) {
                    Log.m105920e(str, String.format(str2, Arrays.copyOf(objArr, objArr.length)));
                } else {
                    Log.m105920e(str, str2);
                }
            }

            /* renamed from: i */
            public void mo123153i(String str, String str2, Object... objArr) {
                C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_FORMAT);
                C87412m.m108594g(objArr, "objects");
                if (!(objArr.length == 0)) {
                    Log.m105924i(str, String.format(str2, Arrays.copyOf(objArr, objArr.length)));
                } else {
                    Log.m105924i(str, str2);
                }
            }

            /* renamed from: v */
            public void mo123154v(String str, String str2, Object... objArr) {
                C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_FORMAT);
                C87412m.m108594g(objArr, "objects");
                if (!(objArr.length == 0)) {
                    Log.m105926v(str, String.format(str2, Arrays.copyOf(objArr, objArr.length)));
                } else {
                    Log.m105926v(str, str2);
                }
            }

            /* renamed from: w */
            public void mo123155w(String str, String str2, Object... objArr) {
                C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_FORMAT);
                C87412m.m108594g(objArr, "objects");
                if (!(objArr.length == 0)) {
                    Log.m105928w(str, String.format(str2, Arrays.copyOf(objArr, objArr.length)));
                } else {
                    Log.m105928w(str, str2);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.lite.a$a$b */
        public static final class C115475b implements C114718c.C114720b {
        }

        public C115473a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo175445a(String str) {
            String[] strArr = {"flutter-view.runtime.js", "meta.json", "store.runtime.js", "flutter-view.base.js", "starter.js", "store.base.js", "VueForFlutterPage.framework.js", "Vue3ForFlutterPage.framework.js", "VuexForStore.framework.js"};
            int i = 0;
            while (i < 9) {
                try {
                    String str2 = strArr[i];
                    C86009m1 m1Var = new C86009m1(str + XVFSFile.SEPARATOR_CHAR + str2);
                    if (m1Var.mo119967g()) {
                        m1Var.mo119966f();
                    }
                    InputStream open = MMApplicationContext.getContext().getAssets().open(str2);
                    C87412m.m108593f(open, "getContext().assets.open(fileName)");
                    OutputStream H = C86013q1.m106426H(m1Var);
                    C87412m.m108593f(H, "openWrite(dstLibFile)");
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        H.write(bArr, 0, read);
                    }
                    open.close();
                    H.close();
                    i++;
                } catch (Exception e) {
                    C115473a aVar = C115472a.f346202a;
                    Log.printErrStackTrace("MicroMsg.LiteAppProcessProfileInit", e, "", new Object[0]);
                    return -1;
                }
            }
            return 0;
        }

        /* renamed from: b */
        public final WxaLiteAppStartReport mo175446b(int i, WxaLiteAppStartReport wxaLiteAppStartReport) {
            C10457e eVar;
            int i2 = i;
            WxaLiteAppStartReport wxaLiteAppStartReport2 = wxaLiteAppStartReport;
            C87412m.m108594g(wxaLiteAppStartReport2, "reportLiteApp");
            C115473a aVar = C115472a.f346202a;
            Log.m105924i("MicroMsg.LiteAppProcessProfileInit", "doInit");
            wxaLiteAppStartReport2.f339264g = true;
            if (!C115472a.f346203b) {
                C115478f.initLib();
                if (!C115472a.f346204c) {
                    mo175448d(wxaLiteAppStartReport2);
                }
                Log.m105918d("MicroMsg.LiteAppProcessProfileInit", "start init lvcpp");
                LiteAppCenter.registerModule("wxalitec8a16f9bf80f65dffb97cdf7760c1142", "debugPannel", LiteAppDebugPannelModule.class);
                LiteAppCenter.addJsApi("triggerTestEvent", (Class<? extends C10479a>) C4805z.class);
                LiteAppCenter.addJsApi("login", (Class<? extends C10479a>) C42495n.class);
                LiteAppCenter.addJsApi("session", (Class<? extends C10479a>) C42498w.class);
                LiteAppCenter.addJsApi("startWebView", (Class<? extends C10479a>) C4804y.class);
                LiteAppCenter.addJsApi("openUserProfile", (Class<? extends C10479a>) C61921b.class);
                LiteAppCenter.addJsApi("doGoToRecVideoList", (Class<? extends C10479a>) C11344a.class);
                LiteAppCenter.addJsApi(C82801g.NAME, (Class<? extends C10479a>) C56836m.class);
                LiteAppCenter.addJsApi("sendAppMessage", (Class<? extends C10479a>) C4802v.class);
                LiteAppCenter.addJsApi("webSendAppMessage", (Class<? extends C10479a>) C4778a0.class);
                LiteAppCenter.addJsApi(C82980n.NAME, (Class<? extends C10479a>) C4803x.class);
                LiteAppCenter.addJsApi("webShareTimeline", (Class<? extends C10479a>) C4780b0.class);
                LiteAppCenter.addJsApi("openFinderView", (Class<? extends C10479a>) C10715j.class);
                LiteAppCenter.addJsApi(Scopes.PROFILE, (Class<? extends C10479a>) C4796t.class);
                LiteAppCenter.addJsApi("addContact", (Class<? extends C10479a>) C4776a.class);
                LiteAppCenter.addJsApi("preloadMiniProgramContacts", (Class<? extends C10479a>) C9274b.class);
                LiteAppCenter.addJsApi("preloadMiniProgramEnv", (Class<? extends C10479a>) C9275c.class);
                LiteAppCenter.addJsApi(JsApiWriteCommData.NAME, (Class<? extends C10479a>) C4783d0.class);
                LiteAppCenter.addJsApi("batchAddCard", (Class<? extends C10479a>) C4779b.class);
                LiteAppCenter.addJsApi("calRqt", (Class<? extends C10479a>) C4781c.class);
                LiteAppCenter.addJsApi("jumpToBizProfile", (Class<? extends C10479a>) C4790l.class);
                LiteAppCenter.addJsApi("openFinderTopicView", (Class<? extends C10479a>) C10714i.class);
                LiteAppCenter.addJsApi("openFinderPostView", (Class<? extends C10479a>) C10709e.class);
                LiteAppCenter.addJsApi("getFinderLivePreviewUrl", (Class<? extends C10479a>) C10704b.class);
                LiteAppCenter.addJsApi("openFinderCreateAcctView", (Class<? extends C10479a>) C10707d.class);
                LiteAppCenter.addJsApi("openChannelsActivity", (Class<? extends C10479a>) C10706c.class);
                LiteAppCenter.addJsApi(C55511i.NAME, (Class<? extends C10479a>) C10711f.class);
                LiteAppCenter.addJsApi("openFinderSearchView", (Class<? extends C10479a>) C10712g.class);
                LiteAppCenter.addJsApi("openFinderTimeLineView", (Class<? extends C10479a>) C10713h.class);
                LiteAppCenter.addJsApi("prerenderMiniProgram", (Class<? extends C10479a>) C9272a.class);
                LiteAppCenter.addJsApi("verifiyWXPassword", (Class<? extends C10479a>) C10716k.class);
                LiteAppCenter.addJsApi("webTransfer", (Class<? extends C10479a>) C42491c0.class);
                LiteAppCenter.addJsApi("downloadGameVideo", (Class<? extends C10479a>) C11113b.class);
                LiteAppCenter.addJsApi("getFinderLivePreviewMicCover", (Class<? extends C10479a>) C10702a.class);
                LiteAppCenter.addJsApi("wxalite5d5719b5b15738e645a321789ebccb5d", "getUin", C4789k.class);
                LiteAppCenter.addJsApi("startGameLifeConversation", (Class<? extends C10479a>) C11116e.class);
                LiteAppCenter.addJsApi("openGameLifeChatroom", (Class<? extends C10479a>) C11114c.class);
                LiteAppCenter.addJsApi("quitGameLifeChatroom", (Class<? extends C10479a>) C11115d.class);
                LiteAppCenter.addJsApi("chatRoomAtMember", (Class<? extends C10479a>) C11112a.class);
                LiteAppCenter.addJsApi("getAccountInfo", (Class<? extends C10479a>) C4787i.class);
                LiteAppCenter.addJsApi("setBackgroundAudioStateMV", (Class<? extends C10479a>) LiteAppJsApiSetBackgroundAudioStateMV.class);
                LiteAppCenter.addJsApi(JsApiGetBackgroundAudioState.NAME, (Class<? extends C10479a>) LiteAppJsApiGetBackgroundAudioState.class);
                LiteAppCenter.addJsApi("extTransfer", (Class<? extends C10479a>) C42493h.class);
                LiteAppCenter.addJsApi(C82334j.NAME, (Class<? extends C10479a>) C4786g.class);
                LiteAppCenter.addJsApi(C55513k.NAME, (Class<? extends C10479a>) C10717l.class);
                LiteAppCenter.addJsApi("postDataToMiniProgram", (Class<? extends C10479a>) C4793q.class);
                LiteAppCenter.addJsApi("closeWindow", (Class<? extends C10479a>) C4784e.class);
                LiteAppCenter.addJsApi(JsApiNavigateToMiniProgramForFinderProductShare.NAME, (Class<? extends C10479a>) C56838o.class);
                LiteAppCenter.addJsApi("getMsgProofItems", (Class<? extends C10479a>) C4788j.class);
                LiteAppCenter.addJsApi(C86342c.NAME, (Class<? extends C10479a>) C56840p.class);
                LiteAppCenter.addJsApi("doExposePreparation", (Class<? extends C10479a>) C4785f.class);
                LiteAppCenter.addJsApi("chooseChatRoomMember", (Class<? extends C10479a>) C4782d.class);
                LiteAppCenter.addJsApi("privateGetContext", (Class<? extends C10479a>) C4795s.class);
                LiteAppCenter.addJsApi("selectBank", (Class<? extends C10479a>) C4801u.class);
                LiteAppCenter.addJsApi(((C53635c) C86312j.m106911c(C53635c.class)).Wc0());
                LiteAppCenter.addJsApi("preDownloadLiteApp", (Class<? extends C10479a>) C4794r.class);
                LiteAppCenter.addJsApi(C88075g.m109660a().f254732c.f254728a);
                synchronized (C10457e.class) {
                    if (C10457e.f31688d == null) {
                        C10457e.f31688d = new C10457e();
                    }
                    eVar = C10457e.f31688d;
                }
                LiteAppCenter.addJsApi((Map<String, Class>) eVar.f31689a.f31686a);
                boolean z = C85875k4.m106211z();
                LiteAppCenter.setWxaLiteAppCallback(new C115478f());
                LiteAppCenter.isInitialized = true;
                LiteAppCenter.updateDarkMode(z);
                LiteAppCenter.fontScaleFollowSystem = false;
                ((C118512d) C86312j.m106911c(C118512d.class)).mo183009V6();
                Context context = MMApplicationContext.getContext();
                Point h = C85875k4.m106184h(context);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int h2 = C75044y4.m89996h(context);
                int c = C75044y4.m89991c(context);
                int i3 = displayMetrics.densityDpi;
                int i4 = h.x;
                int i5 = h.y;
                float f = displayMetrics.density;
                float f2 = ((float) 48) * f;
                LiteAppCenter.mDisplayMetrics = displayMetrics;
                Log.m105925i("MicroMsg.LiteAppProcessProfileInit", "SetDisplayParams w=%d h=%d screen=%d,%d, density=%f dpi=%d, statusBar=%d actionBarHeight:%f, navigationBarHeight:%d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(h.x), Integer.valueOf(h.y), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(h2), Float.valueOf(f2), Integer.valueOf(c));
                int i6 = i3;
                float f3 = ((float) i4) / f;
                LiteAppCenter.setDisplayParams(0, f3, ((float) i5) / f, ((float) h.x) / f, ((float) h.y) / f, i6, f, f2 / f, ((float) h2) / f, ((float) c) / f);
                wxaLiteAppStartReport2.f339278x = System.currentTimeMillis();
                mo175449e();
                mo175447c();
                wxaLiteAppStartReport2.f339279y = System.currentTimeMillis() - wxaLiteAppStartReport2.f339278x;
                Log.m105924i("MicroMsg.LiteAppProcessProfileInit", "end init lvcpp");
                C115472a.f346203b = true;
                C115669n.INSTANCE.mo175911u(1404, i2);
                wxaLiteAppStartReport2.f339277w = false;
                wxaLiteAppStartReport2.f339274t = false;
                wxaLiteAppStartReport2.f339265h = false;
                return wxaLiteAppStartReport2;
            }
            wxaLiteAppStartReport2.f339277w = true;
            wxaLiteAppStartReport2.f339274t = true;
            if (i2 == 0) {
                C115669n.INSTANCE.mo175911u(1404, 1);
            } else if (i2 == 2) {
                C115669n.INSTANCE.mo175911u(1404, 3);
            }
            wxaLiteAppStartReport2.f339265h = true;
            return wxaLiteAppStartReport2;
        }

        /* renamed from: c */
        public final void mo175447c() {
            WxaLiteAppBaselibInfo h = C115492q.m162360g().mo175470h();
            if (h == null) {
                C115473a aVar = C115472a.f346202a;
                Log.m105920e("MicroMsg.LiteAppProcessProfileInit", "latestLiteAppBaselibInfo is null!");
            } else if ("debug".equalsIgnoreCase(h.f339286i)) {
                C115473a aVar2 = C115472a.f346202a;
                Log.m105924i("MicroMsg.LiteAppProcessProfileInit", "preload base lib using rdm version");
                LiteAppCenter.setPath(C86013q1.m106448i(h.f339285h, false), LiteAppCenter.FRAMEWORK_TYPE_VUE);
            } else {
                String str = h.f339285h;
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C115473a aVar3 = C115472a.f346202a;
                    Log.m105920e("MicroMsg.LiteAppProcessProfileInit", "baselibFile not exists!");
                    return;
                }
                LiteAppCenter.setPath(C86013q1.m106448i(str, false), LiteAppCenter.FRAMEWORK_TYPE_VUE);
            }
        }

        /* renamed from: d */
        public final void mo175448d(WxaLiteAppStartReport wxaLiteAppStartReport) {
            C87412m.m108594g(wxaLiteAppStartReport, "reportLiteApp");
            C115473a aVar = C115472a.f346202a;
            Log.m105924i("MicroMsg.LiteAppProcessProfileInit", "setupLiteApp");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C117147b.C117148a aVar2 = new C117147b.C117148a(context, "liteApp");
            aVar2.f350988f = false;
            C88718b.f256076a = new C115474a();
            wxaLiteAppStartReport.f339275u = System.currentTimeMillis();
            C7335d c = C86312j.m106911c(C119061h.class);
            C87412m.m108593f(c, "getService<IEmojiResPath…viderService::class.java)");
            C119061h hVar = (C119061h) c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SystemEmojiResPath", hVar.G70());
            jSONObject.put("QQSmileyDirPath", hVar.mo141692gU());
            jSONObject.put("NewSmileyDirPath", hVar.mo141689MP());
            jSONObject.put("EmojiPanelConfigPath", hVar.mo141693jF());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("initParams", jSONObject);
            String jSONObject3 = jSONObject2.toString();
            C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …\n            }.toString()");
            aVar2.f350989g = C26236u.m33719b(jSONObject3);
            C117147b.f350980a = aVar2;
            Context context2 = aVar2.f350983a;
            C87412m.m108594g(context2, "<set-?>");
            C117147b.f350981b = context2;
            C117147b.C117148a aVar3 = C117147b.f350980a;
            if (aVar3 != null) {
                String packageName = aVar3.f350983a.getPackageName();
                C87412m.m108593f(packageName, "this.config.mAppContext.packageName");
                C117147b.f350982c = packageName;
                C117147b.C117148a aVar4 = C117147b.f350980a;
                if (aVar4 != null) {
                    C118552d.C118553a aVar5 = new C118552d.C118553a(aVar4.f350983a);
                    C117308a aVar6 = new C117308a();
                    if (!aVar5.f354810c.contains(aVar6)) {
                        aVar5.f354810c.add(aVar6);
                    }
                    C118630c cVar = new C118630c();
                    if (!aVar5.f354810c.contains(cVar)) {
                        aVar5.f354810c.add(cVar);
                    }
                    aVar5.f354808a = aVar4.f350984b;
                    aVar5.f354812e.addAll(aVar4.f350987e);
                    aVar5.f354811d = new C87682a();
                    C117147b.C117148a aVar7 = C117147b.f350980a;
                    if (aVar7 != null) {
                        Boolean valueOf = Boolean.valueOf(aVar7.f350988f);
                        if (C117147b.f350980a != null) {
                            aVar5.f354809b = aVar4.f350985c;
                            aVar5.f354814g = aVar4.f350989g;
                            C118552d dVar = aVar4.f350986d;
                            dVar.f354797a = aVar5;
                            C118789a.C118791b bVar = aVar5.f354811d;
                            if (bVar != null) {
                                C118789a.f355421a = bVar;
                            }
                            if (valueOf.booleanValue()) {
                                dVar.mo183269i();
                            }
                            wxaLiteAppStartReport.f339276v = System.currentTimeMillis() - wxaLiteAppStartReport.f339275u;
                            C114718c.f343913a = new C115475b();
                            C115472a.f346204c = true;
                            return;
                        }
                        C87412m.m108603p("config");
                        throw null;
                    }
                    C87412m.m108603p("config");
                    throw null;
                }
                C87412m.m108603p("config");
                throw null;
            }
            C87412m.m108603p("config");
            throw null;
        }

        /* renamed from: e */
        public final void mo175449e() {
            LiteAppCenter.initLib();
            WxaLiteAppBaselibInfo h = C115492q.m162360g().mo175470h();
            InputStream open = MMApplicationContext.getContext().getAssets().open("meta.json");
            C87412m.m108593f(open, "getContext().assets.open(kMetaFile)");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            String str = new String(bArr, C119027c.f356488a);
            open.close();
            String baseLibVersionByString = LiteAppCenter.getBaseLibVersionByString(str);
            C87412m.m108593f(baseLibVersionByString, "assetsVersion");
            boolean z = false;
            String substring = baseLibVersionByString.substring(0, C112550d0.m153768D(baseLibVersionByString, '.', 0, false, 6, (Object) null));
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (h == null) {
                String a = C115501v.m162389a(substring, (String) null, (String) null);
                C87412m.m108593f(a, "getLiteAppBaselibPath(as…MajorVersion, null, null)");
                Uri n = C116299g2.m163858n(a);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a()) {
                    z = l.f348991a.mo119948x(l.f348992b);
                }
                if (!z) {
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                if (mo175445a(a) == 0) {
                    WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = new WxaLiteAppBaselibInfo();
                    wxaLiteAppBaselibInfo.f339281d = substring;
                    wxaLiteAppBaselibInfo.f339285h = a;
                    C115492q.m162360g().mo175481s(wxaLiteAppBaselibInfo);
                    C115473a aVar = C115472a.f346202a;
                    Log.m105924i("MicroMsg.LiteAppProcessProfileInit", "preload base lib use asset, path:" + a);
                    return;
                }
                C115473a aVar2 = C115472a.f346202a;
                Log.m105920e("MicroMsg.LiteAppProcessProfileInit", "copyLibs fail!");
            } else if (LiteAppCenter.versionGreater(baseLibVersionByString, LiteAppCenter.getBaseLibVersionByPath(C86013q1.m106448i(h.f339285h, false)))) {
                String a2 = C115501v.m162389a(substring, (String) null, (String) null);
                C87412m.m108593f(a2, "getLiteAppBaselibPath(as…MajorVersion, null, null)");
                Uri n2 = C116299g2.m163858n(a2);
                String path2 = n2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                if (l3.mo177810a()) {
                    z = l3.f348991a.mo119948x(l3.f348992b);
                }
                if (!z) {
                    C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(n2, l3);
                    if (l4.mo177810a()) {
                        l4.f348991a.mo119937g(l4.f348992b);
                    }
                }
                if (mo175445a(a2) == 0) {
                    WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo2 = new WxaLiteAppBaselibInfo();
                    wxaLiteAppBaselibInfo2.f339281d = substring;
                    wxaLiteAppBaselibInfo2.f339285h = a2;
                    C115492q.m162360g().mo175481s(wxaLiteAppBaselibInfo2);
                    C115473a aVar3 = C115472a.f346202a;
                    Log.m105924i("MicroMsg.LiteAppProcessProfileInit", "preload base lib use asset, path:" + a2);
                    return;
                }
                C115473a aVar4 = C115472a.f346202a;
                Log.m105920e("MicroMsg.LiteAppProcessProfileInit", "copyLibs fail!");
            }
        }
    }
}
