package com.tencent.p014mm.plugin.brandservice;

import android.content.Context;
import android.util.Base64;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C30766q;
import com.tencent.p014mm.storage.C30773r;
import com.tencent.p014mm.storage.C6710g0;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$g;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wechat.p326mm.biz.BizManager;
import com.tencent.wechat.p326mm.biz.BizProto;
import di3.C86312j;
import ex0.C20642c;
import ex0.C45696d;
import f40.C86709a0;
import fx0.C45821d;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.Map;
import jw0.C21290c;
import jw0.C9533e;
import nj3.C76879j;
import p007bo.C16813m;
import p227rn.C13089q;
import p243tn.C14050a;
import p399xu.C23114b;
import p493do.C86380f;
import p763ym.C79138l;
import p910lj.C76701a;
import q73.C35796c0;
import rb0.C48009v0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C118459qf;
import te3.mg4;
import te3.pg4;
import yc3.C38992a;
import z04.C112550d0;
import z04.C119027c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.brandservice.a */
public final class C18161a implements C38992a {

    /* renamed from: b */
    public static final C18162a f50161b = new C18162a((C8480h) null);

    /* renamed from: c */
    public static boolean f50162c = true;

    /* renamed from: a */
    public final C13601g f50163a = C36568h.m40985a(C18164b.f50165d);

    /* renamed from: com.tencent.mm.plugin.brandservice.a$a */
    public static final class C18162a {

        /* renamed from: com.tencent.mm.plugin.brandservice.a$a$a */
        public static final class C18163a implements Runnable {

            /* renamed from: d */
            public static final C18163a f50164d = new C18163a();

            public final void run() {
                ((C20642c) C86312j.m106911c(C20642c.class)).mo32321u0();
            }
        }

        public C18162a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo22770a() {
            LinkedList<pg4> linkedList = C29763t.m38870a().f184323d;
            pg4 first = linkedList != null ? linkedList.getFirst() : null;
            if (first != null) {
                String str = "export/xxx" + System.currentTimeMillis();
                C19428d dVar = C19428d.f54856a;
                C118459qf qfVar = new C118459qf();
                qfVar.f354270d = first.f354229d;
                qfVar.f354271e = str;
                qfVar.f354272f = 20;
                dVar.mo25159L(qfVar);
                dVar.mo25161N(first.f354229d, str);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success!", 1).show();
                C19636w0.m21161c();
            }
        }

        /* renamed from: b */
        public final void mo22771b() {
            if (!C18161a.f50162c) {
                Log.m105928w("MicroMsg.BizProcessorCommand", "should not autoReboot now.");
                return;
            }
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success! WeChat will kill self in 1 second...", 1).show();
            C119179t tVar = C119157j.f356862d;
            C18163a aVar = C18163a.f50164d;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 1000, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.a$b */
    public static final class C18164b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C18164b f50165d = new C18164b();

        public C18164b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.a$c */
    public static final class C18165c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f50166d;

        /* renamed from: com.tencent.mm.plugin.brandservice.a$c$a */
        public static final class C18166a implements Runnable {

            /* renamed from: d */
            public static final C18166a f50167d = new C18166a();

            public final void run() {
                C76879j.m92726T(MMApplicationContext.getContext(), "Get appInfo success!");
            }
        }

        public C18165c(String str) {
            this.f50166d = str;
        }

        public final void run() {
            if (((C79138l) C86312j.m106911c(C79138l.class)).mo74001TT(this.f50166d, true) != null) {
                MMHandlerThread.postToMainThread(C18166a.f50167d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.a$d */
    public static final class C18167d implements Runnable {

        /* renamed from: d */
        public static final C18167d f50168d = new C18167d();

        public final void run() {
            C86013q1.m106445f(C14050a.m13404a());
        }
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        LinkedList<pg4> linkedList;
        String[] strArr2 = strArr;
        boolean z = false;
        if (strArr2 != null && C87412m.m108589b("//biz", strArr2[0])) {
            if (C87412m.m108589b("openrectimeline", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineOpenStatus", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                return true;
            } else if (C87412m.m108589b("openfluttertimeline", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineOpenFlutter", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                f50161b.mo22771b();
                return true;
            } else if (C87412m.m108589b("openflutterAfftimeline", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineUserAff", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                f50161b.mo22771b();
                return true;
            } else if (C87412m.m108589b("recFeed", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineRecFeedStatus", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                return true;
            } else if (C87412m.m108589b("finderLive", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineFinderLiveStatus", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                return true;
            } else if (C87412m.m108589b("biztlbold", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineTitleBold", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                f50161b.mo22771b();
                return true;
            } else if (C87412m.m108589b("showbottomnav", strArr2[1]) && strArr2.length > 2) {
                MultiProcessMMKV.getMMKV("WebViewUIShowBottom").encode("WebViewUIShowBottomNav", Util.getInt(strArr2[2], -1));
                return true;
            } else if (C87412m.m108589b("adautotest", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineAdOpen", Util.getInt(strArr2[2], -1));
                mo22769b().encode("BizTimeLineAdTestMode", Util.getInt(strArr2[3], -1));
                mo22769b().encode("BizAdInsertPos", Util.getInt(strArr2[4], -1));
                f50161b.mo22771b();
                return true;
            } else if (C87412m.m108589b("autoreboot", strArr2[1]) && strArr2.length > 2) {
                if (Util.getInt(strArr2[2], -1) == 1) {
                    z = true;
                }
                f50162c = z;
                return true;
            } else if (C87412m.m108589b("deleteolddata", strArr2[1]) && strArr2.length > 2) {
                mo22769b().encode("BizTimeLineDeleteOldData", Util.getInt(strArr2[2], -1));
                mo22769b().apply();
                return true;
            } else if (!C87412m.m108589b("addRecCard", strArr2[1]) || strArr2.length <= 2) {
                Map<String, String> map = null;
                if (C87412m.m108589b("addPayAlbum", strArr2[1]) && strArr2.length > 2) {
                    byte[] decode = Base64.decode(strArr2[2], 2);
                    C87412m.m108593f(decode, "decode(args[2], Base64.NO_WRAP)");
                    String str2 = new String(decode, C119027c.f356488a);
                    int E = C112550d0.m153769E(str2, "<sysmsg", 0, false, 6, (Object) null);
                    if (E != -1) {
                        String substring = str2.substring(E);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        map = XmlParser.parseXml(substring, "sysmsg", (String) null);
                        if (map == null) {
                            Log.m105921e("//biz", "XmlParser values is null, msgContent %s", str2);
                            return true;
                        }
                    }
                    C21290c.f60147a.mo33269b(map, str2);
                    return true;
                } else if (C87412m.m108589b("paySuccess", strArr2[1]) && strArr2.length > 2) {
                    byte[] decode2 = Base64.decode(strArr2[2], 2);
                    C87412m.m108593f(decode2, "decode(args[2], Base64.NO_WRAP)");
                    Map<String, String> parseXml = XmlParser.parseXml(new String(decode2, C119027c.f356488a), "sysmsg", (String) null);
                    C45821d dVar = C45821d.f123719a;
                    C87412m.m108593f(parseXml, "values");
                    dVar.mo71285c(parseXml);
                    return true;
                } else if (C87412m.m108589b("profileCrash", strArr2[1]) && strArr2.length > 2) {
                    MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("ProfileCrashCheck");
                    singleMMKV.encode("testCrash", Util.getInt(strArr2[2], 1));
                    singleMMKV.apply();
                    return true;
                } else if (C87412m.m108589b("updateAppInfo", strArr2[1]) && strArr2.length > 2) {
                    String str3 = strArr2[2];
                    if (Util.isNullOrNil(str3)) {
                        return true;
                    }
                    ((C119157j) C119157j.f356862d).mo183876g(new C18165c(str3), "GetAppInfoASyncThread");
                    return true;
                } else if (C87412m.m108589b("resortbizmsgcheck", strArr2[1]) && strArr2.length > 2) {
                    int i = Util.getInt(strArr2[2], 1);
                    mo22769b().encode("BizTimeLineReSortMsgCheck", i);
                    mo22769b().apply();
                    BizManager c = C16813m.f45424a.mo17857c();
                    if (i != 1) {
                        z = true;
                    }
                    c.ignoreResortNextReqTimeCheck(z ? 1 : 0);
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("recycleCardCheck", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineRecycleCardCheck", Util.getInt(strArr2[2], 1));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("updateCard", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineUpdateCard", Util.getInt(strArr2[2], 1));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("showdigest", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineShowDigest", Util.getInt(strArr2[2], -1));
                    mo22769b().apply();
                    return true;
                } else if (C87412m.m108589b("oftenread", strArr2[1]) && strArr2.length > 2) {
                    if (Util.getInt(strArr2[2], -1) == 0) {
                        z = true;
                    }
                    C9533e.f29717e = z;
                    return true;
                } else if (C87412m.m108589b("videochannel", strArr2[1]) && strArr2.length > 2) {
                    if (Util.getInt(strArr2[2], -1) == 0) {
                        z = true;
                    }
                    C9533e.f29718f = z;
                    return true;
                } else if (C87412m.m108589b("sl", strArr2[1]) && strArr2.length > 2) {
                    MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("bizCommand");
                    mmkv.encode("sameLayerOpen", Util.getInt(strArr2[2], -1));
                    mmkv.apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("resortbizmsgtest", strArr2[1]) && strArr2.length > 2) {
                    C6710g0.f24121b = Util.getInt(strArr2[2], -1);
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("adtest", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineAdTestMode", Util.getInt(strArr2[2], 0));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("setadquata", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineHardcodeAdQuota", Util.getInt(strArr2[2], 0));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("setclientadquata", strArr2[1]) && strArr2.length > 2) {
                    C19627t.f55586a.mo25823E(Util.getInt(strArr2[2], 0));
                    return true;
                } else if (C87412m.m108589b("setadexposecount", strArr2[1]) && strArr2.length > 2) {
                    int i2 = Util.getInt(strArr2[2], 0);
                    C30766q vx02 = C48009v0.vx0();
                    vx02.getClass();
                    ((C119157j) C119157j.f356862d).mo183875f(new C30773r(vx02, i2));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("forbidDeleteCanvasFromJS", strArr2[1]) && strArr2.length > 2) {
                    MultiProcessMMKV b = mo22769b();
                    if (Util.getInt(strArr2[2], 0) == 1) {
                        z = true;
                    }
                    b.encode("forbidDeleteCanvasFromJS", z);
                    mo22769b().apply();
                    return true;
                } else if (C87412m.m108589b("testAdCrashEnv", strArr2[1]) && strArr2.length > 2) {
                    MultiProcessMMKV b2 = mo22769b();
                    if (Util.getInt(strArr2[2], 0) == 1) {
                        z = true;
                    }
                    b2.encode("testAdCrashEnv", z);
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("clearTestAdCrash", strArr2[1])) {
                    C9533e eVar = C9533e.f29713a;
                    ((MultiProcessMMKV) ((MMKVSlotManager) ((C36570n) C9533e.f29716d).getValue()).getSlotForWrite()).clear();
                    return true;
                } else if (C87412m.m108589b("adtestext", strArr2[1]) && strArr2.length > 2) {
                    MultiProcessMMKV singleMMKV2 = MultiProcessMMKV.getSingleMMKV("brandService");
                    singleMMKV2.encode("BizTimeLineAdTestExtInfo", strArr2[2]);
                    singleMMKV2.apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("adtestaction", strArr2[1]) && strArr2.length > 2) {
                    ((C45696d) C86709a0.m107533q(C45696d.class)).mo70968P2("wxa06c02b5c00ff39b", (String) null, "adTestExtAction", "data:" + strArr2[2]);
                    return true;
                } else if (C87412m.m108589b("ad", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineAdOpen", Util.getInt(strArr2[2], 0));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("adprefetch", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineAdPrefetcherOpen", Util.getInt(strArr2[2], 0));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("adInsertPos", strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizAdInsertPos", Util.getInt(strArr2[2], 3));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("clearad", strArr2[1])) {
                    C19627t tVar = C19627t.f55586a;
                    tVar.mo25832f().encode(tVar.mo25825G("biz_ad_card_data"), "");
                    C19625p0 Jx0 = C48009v0.Jx0();
                    Jx0.getClass();
                    String format = String.format("DELETE FROM %s WHERE type = %d", new Object[]{"BizTimeLineInfo", 637534257});
                    Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "deleteExposedAdMsgByType ret:%b, sql=%s", Boolean.valueOf(Jx0.f55550d.execSQL("BizTimeLineInfo", format)), format);
                    p0$$f p0__f = new p0$$f();
                    p0__f.f55562a = p0$$g.DELETE;
                    Jx0.mo25805jo(p0__f);
                    C19627t.f55595j = null;
                    C19627t.f55574B = true;
                    return true;
                } else if (C87412m.m108589b("setAdInsertType", strArr2[1])) {
                    C19627t tVar2 = C19627t.f55586a;
                    int i3 = Util.getInt(strArr2[2], 0);
                    Log.m105924i("MicroMsg.BizCardLogic", "setAdInsertType " + i3);
                    C19627t.f55580H = i3;
                    return true;
                } else if (C87412m.m108589b("clearadexposetime", strArr2[1])) {
                    MultiProcessMMKV.getSingleMMKV("biz_timeline_ad").encode("BizLastExposeAdTime", 0);
                    return true;
                } else if (C87412m.m108589b("clearadexposecount", strArr2[1])) {
                    C48009v0.vx0().mo57688Lo();
                    return true;
                } else if (C87412m.m108589b("clearpkg", strArr2[1])) {
                    C35796c0.f95588a.mo60402c(true);
                    return true;
                } else if (C87412m.m108589b("adpreview", strArr2[1]) && strArr2.length > 2) {
                    MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("WebCanvasStorage");
                    mmkv2.encode("BizTimeLineAdPkgPreviewMode", Util.getInt(strArr2[2], 0));
                    mmkv2.apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b(APMidasPayAPI.ENV_TEST, strArr2[1]) && strArr2.length > 2) {
                    mo22769b().encode("BizTimeLineTestMode", Util.getInt(strArr2[2], 0));
                    mo22769b().apply();
                    f50161b.mo22771b();
                    return true;
                } else if (C87412m.m108589b("checkfinderreddot", strArr2[1])) {
                    C19428d dVar2 = C19428d.f54856a;
                    dVar2.mo25168b();
                    mg4 a = C29763t.m38870a();
                    if (!(a == null || (linkedList = a.f184323d) == null)) {
                        dVar2.mo25148A(linkedList);
                    }
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success!", 1).show();
                    return true;
                } else if (C87412m.m108589b("addfinderreddot", strArr2[1])) {
                    f50161b.mo22770a();
                    return true;
                } else if (C87412m.m108589b("mockInsertAdCanvas", strArr2[1])) {
                    C16813m.f45424a.mo17856b().mockInsertCanvas(1, "frameSetName-" + System.currentTimeMillis(), "frameSetData-" + System.currentTimeMillis());
                    return true;
                } else if (C87412m.m108589b("setAdRequestInfo", strArr2[1])) {
                    C16813m.f45424a.mo17856b().setAdRequestInfo("adFetchControl-" + System.currentTimeMillis(), "adFetchInfo-" + System.currentTimeMillis());
                    return true;
                } else if (C87412m.m108589b("getAllDynamicCardInfo", strArr2[1])) {
                    BizProto.DynamicCardInfoList allDynamicCardInfo = C16813m.f45424a.mo17856b().getAllDynamicCardInfo(1);
                    Log.m105924i("MicroMsg.BizProcessorCommand", "getAllDynamicCardInfo size = " + allDynamicCardInfo.getListCount());
                    return true;
                } else if (C87412m.m108589b("videofetchdebug", strArr2[1])) {
                    C9533e.f29725m = true;
                    Log.m105924i("MicroMsg.BizProcessorCommand", "mpManifestPath=" + ((String) ((C36570n) C9533e.f29724l).getValue()));
                    return true;
                } else if (C87412m.m108589b("clearsubscribemsg", strArr2[1])) {
                    ((C23114b) C86312j.m106911c(C23114b.class)).mo36105n2();
                    return true;
                } else if (C87412m.m108589b("clearimg", strArr2[1])) {
                    ((C119157j) C119157j.f356862d).mo183875f(C18167d.f50168d);
                    return true;
                } else if (C87412m.m108589b("timel", strArr2[1])) {
                    C19613h1.m21051x(Integer.parseInt(strArr2[2]));
                    return true;
                } else if (C87412m.m108589b("gamejs", strArr2[1]) && strArr2.length > 2) {
                    if (C87412m.m108589b(strArr2[2], "null")) {
                        mo22769b().remove("GameCenterJsPath").apply();
                    } else {
                        mo22769b().encode("GameCenterJsPath", strArr2[2]);
                        mo22769b().apply();
                    }
                    return true;
                } else if (C87412m.m108589b("mbad", strArr2[1]) && C87412m.m108589b("mock", strArr2[2])) {
                    ((C13089q) C86312j.m106911c(C13089q.class)).ce0(1, "mock_ad_card_pic_" + System.currentTimeMillis(), "{\"isMock\":true,\"ad_desc\":\"\",\"ad_height\":0,\"ad_posid\":\"4031112715115510\",\"ad_token\":\"0034a231174155d717b9648aeb6ace913e8a9dd2c769f22549e4bb5aeaaeccc178adc1f843c6612ce1009620378f6b64\",\"ad_width\":0,\"aid\":\"379120646\",\"apurl\":\"http://ad.wx.com:12638/cgi-bin/exposure?viewid=AQOhQ%2FjtcpZ4OIAHJbKj1yeMDtOV%2F%2Fi9%2B2OzcUqzEAar8IMDi%2FXOzpehZxJW2%2B7sW6QWuBx7tcaCF6uGxLwEETBg0%2FzSilHuBjNuQ2vzgyMfnKCsTGCHo2Cl22tEH5ps979sKkr25LENWUmtrMnorDifV0Cqv8pSJNrlcV3FXJnjcWcMGp3UgIso0GedV7E6TVoTErws9kLgOEMFDkJVXbRTbiD5Uotb6t6tSqYeijLW027LV7nYaSQEgwQpDC54qI9CKNctloKHiQLE7YlPpmTt4ynMMU5CWAb2SccwvbKu1Gsd5tbbvPFXh2cLltrx6FqABESJQcENncPpY5wYMCPwQKGYs3SZWYO25XOGTJ4R3DjM4%2FS%2FPvIVwhD1BXzp5mgqLM28I4h%2FCUh%2B9FKDUJGCaAWeDfhLV64SM5pXESgt86X2EDUN97G9IuxPLX6a2wzD%2FAdSfgLf6Fxjyfs5aoy6xjFdMKnGEO3S03k52hDoF8MCJG5dPdfmwOiGeE8%2FmCOhCDymFeUIW6v80ZVWxiF0hfzDI6bkUgow02fP0L5D3X87KUzchV3CTYhEmrAIxdmmTTOPkRB96tsxxaNuwtOs3EgGFDE3oXjJpwT%2BRHcKy5LLP1LoGL1WfNbPC5x0wriD0B9gGD6T3yK2U%2Fxsfbfrsan2ihv7jNyMeVQhS%2BqanEgknhhoInq%2FYnublI6PZoYLo7tjFU0l4MGmv7bt3hBuba%2Bh5J0Iq8rFM5I3HsTyPHc9PcMpTIxN6K3RpGR1WJjOtUewxpk1fMEDUqIyAERYLiFvSMk32FxzfdmcHrcjBn6XcJymGzEgw4CdN6skKLsdI%2F7odU%2FFcpB8UWIkNoLsv4WWvqcCgLS0zqXCVhPA5I35G5le1h41mAon%2F4BfWnPfJDQfTvz4s0BqzSvBZVfg6Y81Xuqo0gHWhQIEC5VFWBE8%2BbcUA%2BvG6Y4%2Bs4tOUE5zCh2LcUsqntzWlHTXozqHvEqinpzclEdERLgNz9SBwBaoNzWjBRn9wIDDlXJ3xADxzf5Zb8ojWhIvAEGgVnOzxFLI4Ki4BNa2azGrc3Tjjm9Fprc5HoQGbK5lBTelpbP0zQtlnhXwL%2F9LryXh9kcJpnG2GcEk2SmbRDvY%2Fcg1QqgH56qP8O2hLCGH1Paim1cIJZ6iCkZSUx5edaFUsNvl1TvocsnUfoXExapWJAL8uAei8OcWtx3UF3la7MiuCDW%2BEi4jhIhc5S4ZsyyPvPQFiPp%2BKm2HSGiJlzsDvoLvrmOMnaYRlELOAEJGoMIwgIeFsyXZoYVDPWH9PUU9DNdWeWzFvRx4RV9hFhfkuQkNsjdtkEMNvUn%2BUBTO0fhZG70MtOSZ1gNBeSrDfQlR1vrBbYa61nJipKl79JZKy4JTLWk8fHQ5W4uoa0eaj4qO7DPuMsxSZVzBoUKLIGkCppJNGcHDDsum5Wp9TkofI2844h2ZKH3ylbNeq77U5X5iI7KOc7csa%2BSxEaMzkWW%2BEwaSdr8wXxAyRQ8pV8lE5o76YIFjUC3Q1tljehMfBUd1Ybd2mAldtnR2gAGc1X35Juv%2BjOQ6Pa71TJzTF8KlURENI9E22G7UiSGf4b0Tm0koB%2FNIzyIzzek0gJaDnTNYAUcLYxuJRr%2F8%2F1Q7NYJEYNywk%2F4Db3bccF%2B7JjGTfADPx96QpypKeccJJgd%2BmEYAx2oD2nmMpCCQ69yHKqxkZ4MFFWs3Z3Et7rauSmI7zbsz5PyKSW8GbusBlz7FH2DRIKOVGmJSFFRZDHp2x5nRbEV1Ynh3tjct2DG7V6lYCIwhQ0Bt3nM%2BbuR5njNBsD2w2GmcGYi%2FEKEZZjH4hqSyao0RTK9msEDNFCJRD7KejKaOoM6hVa3dtnhw1nPF0nh78B9XKMvgqteuK77jRt3QrTEAweK7apaf%2BzNduJWQy6GJzENNAuqc%2B0WtXmA4fwlgBTVddVNftiNupNvWk78TgNwUT8fVp8SZa1t91JNpA3750XCtwTwjm1X%2B7go0usrrqu%2Bl1dQqpS6CxZYffqQBPtcooskJdxwYhOkQHE3qeTRFSBI8YNQs11AF6kbyBhKSeOZhEIGLvetxt8H7jBUKjya3py9QaKSHy8fI6iF8NSpustvmyiF3StboswdtiVHEq5B505XV88FAo0ZN0EHLGem0l6Q4%2F%2FSanYgVUIfGbZXIBo7u0QzFL19zoR6CpNiszLBJYCs%3D&is_use_unify_report=1\",\"biz_appid\":\"wx69618ae091cf2c76\",\"biz_info\":{\"biz_uin\":3094043316,\"head_img\":\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM6ZJ2vDpsGQf7L1Y69AHjiaVxiblHibrC984BxIeII705dvA/0\",\"nick_name\":\"快乐测试123\",\"signature\":\"品香堂夜勤病栋美妆头条旗下TV直播平台，美妆行业领先的视频直播平台，开启行业移动互联营销新模式 ！新品发布直播、年度庆典直播、招商论坛直播、培训活动直播等，打造从未有过的营销 体验！直播：15920578029\",\"user_name\":\"gh_1e80bb81a1d2\"},\"biz_timeline_ad_data\":{\"ad_pos\":2,\"frame_set_name\":\"ad_card379120646_wx0t7hhsygquwwc200_127\"},\"button_action\":\"{\\\"button_text\\\":\\\"进入小游戏\\\",\\\"jump_type\\\":6,\\\"jump_url\\\":\\\"?weixinadkey=c1ebee9aa88f7344b19fb871bbbb22c5e50e98e6a169d24871bdc0b4c3db7be01d8e0595bd7a536ad28a30118cff1b8f&wx_aid=379120646&wx_traceid=wx0t7hhsygquwwc200&gdt_vid=wx0t7hhsygquwwc200&weixinadinfo=379120646.wx0t7hhsygquwwc200.0.1\\\",\\\"text_type\\\":0}\",\"crt_exp_info\":\"\",\"crt_exp_tid\":0,\"crt_info\":\"[{\\\"image_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/141/20204/snscosdownload/SH/reserved/5fcedc77000a731d00000000a96845090000008d00004eec?m=f62b33bbbc08ab1419528b808f0ab6a3&ck=f62b33bbbc08ab1419528b808f0ab6a3\\\",\\\"thumb_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/141/20204/snscosdownload/SH/reserved/5fcedc77000a731d00000000a96845090000008d00004eec?m=f62b33bbbc08ab1419528b808f0ab6a3&ck=f62b33bbbc08ab1419528b808f0ab6a3\\\",\\\"height\\\":540,\\\"width\\\":960,\\\"size\\\":48069,\\\"image_md5\\\":\\\"f62b33bbbc08ab1419528b808f0ab6a3\\\",\\\"materialId\\\":\\\"268403379\\\",\\\"card_info\\\":{\\\"head_desc_type\\\":2,\\\"description\\\":\\\"好友在玩标签\\\",\\\"mp_tag_type\\\":1,\\\"pure_color_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=a20c345085306b175090c34f3b509315&filekey=3033020101041f301d02016d040253480410a20c345085306b175090c34f3b50931502023b6f040d00000004627466730000000131&hy=SH&storeid=32303230313230383134343133353030303962633530313336666664393335353037396430393030303030303664&bizid=1023\\\",\\\"material_blur_url\\\":\\\"http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=d5c43c43de30506fa463c69319c1ae3f&filekey=30340201010420301e02016d040253480410d5c43c43de30506fa463c69319c1ae3f020303c010040d00000004627466730000000131&hy=SH&storeid=32303230313230383134343133353030306131353739313336666664393335353037396430393030303030303664&bizid=1023\\\",\\\"thumb\\\":\\\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5BibVJ1hOJwLPzQwGkCzgpXxjBB9xASIFNgDv3jop87hA/0\\\",\\\"title\\\":\\\"最强弹一弹\\\"}}]\",\"crt_size\":\"998\",\"dest_type\":6,\"ext_back_comm\":\"{\\\"pctr\\\":0.019999999553,\\\"uid\\\":\\\"95918\\\",\\\"check_ad_info\\\":\\\"{\\\\\\\"ecpm\\\\\\\":4859.99951171875}\\\",\\\"ad_template_info\\\":\\\"{\\\\\\\"type\\\\\\\":\\\\\\\"root\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adRoot\\\\\\\",\\\\\\\"tplConfig\\\\\\\":{\\\\\\\"tlBizMbPkgVersion\\\\\\\":\\\\\\\"0.0.1\\\\\\\"},\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"viewableArea\\\\\\\":0.5,\\\\\\\"flattenLayer\\\\\\\":true},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"paddingLeft\\\\\\\":8,\\\\\\\"paddingRight\\\\\\\":8,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"body\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\"}}},\\\\\\\"events\\\\\\\":{}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"popup\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"feedbackPopup\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"mask\\\\\\\":true,\\\\\\\"maskColor\\\\\\\":\\\\\\\"#000000\\\\\\\",\\\\\\\"maskOpacity\\\\\\\":0.2,\\\\\\\"popupWidth\\\\\\\":300,\\\\\\\"popupHeight\\\\\\\":239,\\\\\\\"popupLeftExpr\\\\\\\":\\\\\\\"#add(#get(#getVar('popupInfo'), 'left'), 8)\\\\\\\",\\\\\\\"popupTopExpr\\\\\\\":\\\\\\\"#add(#get(#getVar('popupInfo'), 'top'), #get(#getVar('popupInfo'), 'height'))\\\\\\\"}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"feedbackDialog\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"feedbackDialog\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1}}]},{\\\\\\\"type\\\\\\\":\\\\\\\"feedback\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adFeedback\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":3,\\\\\\\"data\\\\\\\":{\\\\\\\"_bubbleEvent\\\\\\\":false,\\\\\\\"feedbackIconExpr\\\\\\\":\\\\\\\"$const.darkMode ? 'resources\\\\/arrow_down_dark.png' : 'resources\\\\/arrow_down.png'\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"padding\\\\\\\":\\\\\\\"8 0\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\"}},\\\\\\\"feedbackIcon\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":16,\\\\\\\"height\\\\\\\":8,\\\\\\\"marginLeft\\\\\\\":0},\\\\\\\"darkStyle\\\\\\\":{\\\\\\\"width\\\\\\\":16,\\\\\\\"height\\\\\\\":8,\\\\\\\"marginLeft\\\\\\\":0}},\\\\\\\"feedbackTagContainer\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"height\\\\\\\":22,\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#e5e5e5\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\",\\\\\\\"paddingLeft\\\\\\\":8,\\\\\\\"paddingRight\\\\\\\":2,\\\\\\\"paddingTop\\\\\\\":1},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#1C1C1C\\\\\\\"}},\\\\\\\"feedbackTag\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"height\\\\\\\":16,\\\\\\\"lineHeight\\\\\\\":16,\\\\\\\"fontSize\\\\\\\":12,\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.5)\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.5)\\\\\\\"}}},\\\\\\\"lifecycle\\\\\\\":{\\\\\\\"onInit\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"getBoundingClientRect\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"id\\\\\\\":\\\\\\\"$$\\\\\\\",\\\\\\\"eventName\\\\\\\":\\\\\\\"rectReceive\\\\\\\"}}]},\\\\\\\"events\\\\\\\":{\\\\\\\"rectReceive\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"setExprVar\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"key\\\\\\\":\\\\\\\"popupInfo\\\\\\\",\\\\\\\"valueExpr\\\\\\\":\\\\\\\"$args.rect\\\\\\\"}}],\\\\\\\"dislikeReasonTap\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"triggerEvent\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"eventName\\\\\\\":\\\\\\\"videodislike\\\\\\\"}}],\\\\\\\"tagTap\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"showPopup\\\\\\\",\\\\\\\"targetid\\\\\\\":\\\\\\\"feedbackPopup\\\\\\\"}]}}},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"main_ad_container\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_useMask\\\\\\\":true,\\\\\\\"_maskStyle\\\\\\\":{\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}}}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"main_img_container\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"borderTopLeftRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"borderTopRightRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.05)\\\\\\\"}}}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adImage\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":3,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.05)\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":0,\\\\\\\"paddingBottomExpr\\\\\\\":\\\\\\\"$ad.crt_size == 998 || $ad.crt_size == 538 ? '56.25%' : '34.792%'\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.05)\\\\\\\"}},\\\\\\\"img\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":\\\\\\\"auto\\\\\\\",\\\\\\\"position\\\\\\\":\\\\\\\"absolute\\\\\\\",\\\\\\\"top\\\\\\\":0,\\\\\\\"left\\\\\\\":0}}},\\\\\\\"data\\\\\\\":{\\\\\\\"useBgMode\\\\\\\":false,\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"$ad.crt_size != 538\\\\\\\",\\\\\\\"usePredownload\\\\\\\":true},\\\\\\\"events\\\\\\\":{}}},{\\\\\\\"type\\\\\\\":\\\\\\\"video\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"main_video\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"position\\\\\\\":\\\\\\\"relative\\\\\\\",\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.05)\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":0,\\\\\\\"paddingBottomExpr\\\\\\\":\\\\\\\"$ad.crt_size == 998 || $ad.crt_size == 538 ? '56.25%' : '34.792%'\\\\\\\"}}},\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"$ad.crt_size == 538\\\\\\\",\\\\\\\"muted\\\\\\\":true,\\\\\\\"loop\\\\\\\":true,\\\\\\\"isShowProgress\\\\\\\":false,\\\\\\\"useImagePoster\\\\\\\":true},\\\\\\\"events\\\\\\\":{}}}]},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adBar\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"boxSizing\\\\\\\":\\\\\\\"border-box\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"height\\\\\\\":64,\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#fff\\\\\\\",\\\\\\\"paddingLeft\\\\\\\":12,\\\\\\\"paddingRight\\\\\\\":12,\\\\\\\"borderBottomLeftRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"borderBottomRightRadius\\\\\\\":\\\\\\\"8px\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#1C1C1C\\\\\\\"}}},\\\\\\\"data\\\\\\\":{},\\\\\\\"events\\\\\\\":{}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"avatarInfo\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"flex\\\\\\\":\\\\\\\"1 1 auto\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}}},\\\\\\\"data\\\\\\\":{},\\\\\\\"events\\\\\\\":{}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adIcon\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type) ? 'true' : $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 1\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"flex\\\\\\\":\\\\\\\"0 0 auto\\\\\\\",\\\\\\\"width\\\\\\\":40,\\\\\\\"height\\\\\\\":40,\\\\\\\"marginRight\\\\\\\":8}},\\\\\\\"img\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"borderRadiusExpr\\\\\\\":\\\\\\\"$ad.product_type == 12 || $ad.product_type == 19 ? 2 : 20\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"layoutText\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":3,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"flex\\\\\\\":\\\\\\\"1 1 auto\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}}}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"adTitle\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type) ? 'true' : $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 1\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.8)\\\\\\\",\\\\\\\"fontSize\\\\\\\":17,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"height\\\\\\\":22,\\\\\\\"lineHeight\\\\\\\":22},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textDesc\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 2\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.description\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.8)\\\\\\\",\\\\\\\"fontSize\\\\\\\":17,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"height\\\\\\\":22,\\\\\\\"lineHeight\\\\\\\":22},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textSnsTitle\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 4 && $ad.hint_txt\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.hint_txt\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"column\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.8)\\\\\\\",\\\\\\\"fontSize\\\\\\\":17,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"height\\\\\\\":22,\\\\\\\"lineHeight\\\\\\\":22},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textSnsDesc\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 4 && $ad.ad_desc\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.ad_desc\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"column\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"marginTop\\\\\\\":2,\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.3)\\\\\\\",\\\\\\\"height\\\\\\\":18,\\\\\\\"lineHeight\\\\\\\":18,\\\\\\\"fontSize\\\\\\\":14,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.3)\\\\\\\"}}},\\\\\\\"events\\\\\\\":{}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"textSnsNormalDesc\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.head_desc_type == 3\\\\\\\",\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.ad_desc\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"column\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.3)\\\\\\\",\\\\\\\"lineHeight\\\\\\\":18,\\\\\\\"fontSize\\\\\\\":14,\\\\\\\"marginTop\\\\\\\":0,\\\\\\\"height\\\\\\\":36,\\\\\\\"wordWrap\\\\\\\":\\\\\\\"normal\\\\\\\",\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"normal\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":2,\\\\\\\"wordBreak\\\\\\\":\\\\\\\"break-all\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.3)\\\\\\\"}}}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"tagText\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":4,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type != 7\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"none\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"flex-start\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"marginTop\\\\\\\":2,\\\\\\\"color\\\\\\\":\\\\\\\"rgba(0, 0, 0, 0.3)\\\\\\\",\\\\\\\"height\\\\\\\":18,\\\\\\\"lineHeight\\\\\\\":18,\\\\\\\"fontSize\\\\\\\":14,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"wordWrap\\\\\\\":\\\\\\\"normal\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.3)\\\\\\\"}}},\\\\\\\"events\\\\\\\":{}}},{\\\\\\\"type\\\\\\\":\\\\\\\"layout\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"poiInfo\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"_isShowExpr\\\\\\\":\\\\\\\"#no(#no($ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type)) && $ad.crtInfo && $ad.crtInfo.0 && $ad.crtInfo.0.card_info && $ad.crtInfo.0.card_info.mp_tag_type && $ad.crtInfo.0.card_info.mp_tag_type == 7 && $ad.poi.poi_name\\\\\\\",\\\\\\\"_bubbleEvent\\\\\\\":false,\\\\\\\"_useMask\\\\\\\":true,\\\\\\\"_maskStyle\\\\\\\":{\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\"}},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"marginTop\\\\\\\":2,\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\"}}},\\\\\\\"events\\\\\\\":{\\\\\\\"tap\\\\\\\":[{\\\\\\\"action\\\\\\\":\\\\\\\"emitCustomMessage\\\\\\\",\\\\\\\"value\\\\\\\":{\\\\\\\"message\\\\\\\":\\\\\\\"poiLand\\\\\\\",\\\\\\\"args\\\\\\\":{}}}]}},\\\\\\\"children\\\\\\\":[{\\\\\\\"type\\\\\\\":\\\\\\\"image\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"poiImage\\\\\\\",\\\\\\\"style\\\\\\\":{},\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"marginRight\\\\\\\":2,\\\\\\\"width\\\\\\\":10,\\\\\\\"height\\\\\\\":12}}},\\\\\\\"data\\\\\\\":{\\\\\\\"imgUrl\\\\\\\":\\\\\\\"resources\\\\/poi.png\\\\\\\"}}},{\\\\\\\"type\\\\\\\":\\\\\\\"text\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"poiText\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"baseType\\\\\\\":1,\\\\\\\"data\\\\\\\":{\\\\\\\"textExpr\\\\\\\":\\\\\\\"$ad.poi.poi_name\\\\\\\"},\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"width\\\\\\\":\\\\\\\"100%\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"}},\\\\\\\"text\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"block\\\\\\\",\\\\\\\"marginTop\\\\\\\":0,\\\\\\\"color\\\\\\\":\\\\\\\"#5F749E\\\\\\\",\\\\\\\"height\\\\\\\":16,\\\\\\\"lineHeight\\\\\\\":16,\\\\\\\"fontSize\\\\\\\":12,\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"WxLineClamp\\\\\\\":1,\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{}}},\\\\\\\"events\\\\\\\":{}}}]}]}]},{\\\\\\\"type\\\\\\\":\\\\\\\"button\\\\\\\",\\\\\\\"id\\\\\\\":\\\\\\\"land_button\\\\\\\",\\\\\\\"options\\\\\\\":{\\\\\\\"innerStyles\\\\\\\":{\\\\\\\"container\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"display\\\\\\\":\\\\\\\"flex\\\\\\\",\\\\\\\"marginLeft\\\\\\\":\\\\\\\"12px\\\\\\\",\\\\\\\"flex\\\\\\\":\\\\\\\"0 0 auto\\\\\\\",\\\\\\\"height\\\\\\\":32,\\\\\\\"lineHeight\\\\\\\":32,\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#f2f2f2\\\\\\\",\\\\\\\"flexDirection\\\\\\\":\\\\\\\"row\\\\\\\",\\\\\\\"alignItems\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"justifyContent\\\\\\\":\\\\\\\"space-between\\\\\\\",\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"padding\\\\\\\":0,\\\\\\\"displayExpr\\\\\\\":\\\\\\\"$ad.product_type == 23 ? 'flex' : 'none'\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundColor\\\\\\\":\\\\\\\"#323232\\\\\\\"}},\\\\\\\"buttonText\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"textAlign\\\\\\\":\\\\\\\"center\\\\\\\",\\\\\\\"verticalAlign\\\\\\\":\\\\\\\"middle\\\\\\\",\\\\\\\"marginExpr\\\\\\\":\\\\\\\"$ad.button_action.jump_type == 6 ? '0 12 0 0' : '0 12'\\\\\\\",\\\\\\\"height\\\\\\\":32,\\\\\\\"lineHeight\\\\\\\":32,\\\\\\\"fontSize\\\\\\\":15,\\\\\\\"fontWeight\\\\\\\":500,\\\\\\\"color\\\\\\\":\\\\\\\"#06AD56\\\\\\\",\\\\\\\"overflow\\\\\\\":\\\\\\\"hidden\\\\\\\",\\\\\\\"whiteSpace\\\\\\\":\\\\\\\"nowrap\\\\\\\",\\\\\\\"textOverflow\\\\\\\":\\\\\\\"ellipsis\\\\\\\",\\\\\\\"wordWrap\\\\\\\":\\\\\\\"normal\\\\\\\"},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"color\\\\\\\":\\\\\\\"rgba(255, 255, 255, 0.8)\\\\\\\"}},\\\\\\\"buttonIcon\\\\\\\":{\\\\\\\"style\\\\\\\":{\\\\\\\"backgroundImage\\\\\\\":\\\\\\\"resources\\\\/weapp.png\\\\\\\",\\\\\\\"marginLeft\\\\\\\":12,\\\\\\\"width\\\\\\\":12.1,\\\\\\\"height\\\\\\\":11},\\\\\\\"darkModeStyle\\\\\\\":{\\\\\\\"backgroundImage\\\\\\\":\\\\\\\"resources\\\\/weapp_dark.png\\\\\\\"}}},\\\\\\\"baseType\\\\\\\":2,\\\\\\\"data\\\\\\\":{\\\\\\\"isHandleDownload\\\\\\\":false,\\\\\\\"isShowIconExpr\\\\\\\":\\\\\\\"$ad.button_action.jump_type == 6 ? $const.true : $const.false\\\\\\\",\\\\\\\"_useMask\\\\\\\":true,\\\\\\\"_maskStyle\\\\\\\":{\\\\\\\"borderRadius\\\\\\\":\\\\\\\"4px\\\\\\\"}},\\\\\\\"events\\\\\\\":{}}}]}]}]}\\\",\\\"live_video_mode\\\":0,\\\"live_video_sub_mode\\\":0,\\\"ams_second_industry_id\\\":21474841490,\\\"antifraud_popup\\\":false,\\\"is_from_snsadinfo\\\":0,\\\"ad_special_strategy_type\\\":0}\",\"ext_info\":\"{\\\"gh_id\\\":\\\"gh_9cc128a6adbf\\\"}\",\"flow_exp_info\":\"[{\\\"exp_para\\\":[{\\\"name\\\":\\\"widget_gray_batchload_app\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":\\\"widget_gray_minigame_dialog\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":\\\"widget_gray_video_download_v2\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":\\\"widget_gray_videodownload\\\",\\\"value\\\":\\\"0\\\"},{\\\"name\\\":94804,\\\"value\\\":\\\"5\\\"},{\\\"name\\\":94822,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":95071,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":103124,\\\"value\\\":\\\"0\\\"},{\\\"name\\\":104692,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":104860,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":105786,\\\"value\\\":\\\"0.01\\\"}]},{\\\"exp_para\\\":[{\\\"name\\\":94794,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":94805,\\\"value\\\":\\\"0\\\"},{\\\"name\\\":95489,\\\"value\\\":\\\"12\\\"},{\\\"name\\\":100036,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":100332,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":105490,\\\"value\\\":\\\"112002\\\"},{\\\"name\\\":111832,\\\"value\\\":\\\"1\\\"},{\\\"name\\\":111664,\\\"value\\\":\\\"1\\\"}]}]\\n\",\"game_ghid\":\"gh_9cc128a6adbf\",\"game_info\":{\"biz_uin\":3847021493,\"head_img\":\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5BibVJ1hOJwLPzQwGkCzgpXxjBB9xASIFNgDv3jop87hA/0\",\"nick_name\":\"最强弹一弹\",\"user_name\":\"gh_9cc128a6adbf\"},\"group_id\":\"wx0t7hhsygquwwc200\",\"hint_txt\":\"创意-20201208_1\",\"image_url\":\"http://wxsnsdythumb.wxs.qq.com/141/20204/snscosdownload/SH/reserved/5fcedc77000a731d00000000a96845090000008d00004eec?m=f62b33bbbc08ab1419528b808f0ab6a3&ck=f62b33bbbc08ab1419528b808f0ab6a3\",\"is_cpm\":0,\"logo\":\"\",\"material_height\":388,\"material_type\":0,\"material_width\":690,\"path_type\":\"ad\",\"pos_type\":15,\"product_type\":46,\"pt\":2,\"reranking_ext_info\":\"{\\\"tid\\\":379121128,\\\"material_hash\\\":\\\"CM-nnacFEAA\\\"}\",\"rl\":\"http://ad.wx.com:12638/cgi-bin/click?viewid=AQOhQ%2FjtcpZ4OIAHJbKj1yeMDtOV%2F%2Fi9%2B2OzcUqzEAar8IMDi%2FXOzpehZxJW2%2B7sW6QWuBx7tcaCF6uGxLwEETBg0%2FzSilHuBjNuQ2vzgyMfnKCsTGCHo2Cl22tEH5ps979sKkr25LENWUmtrMnorDifV0Cqv8pSJNrlcV3FXJnjcWcMGp3UgIso0GedV7E6TVoTErws9kLgOEMFDkJVXbRTbiD5Uotb6t6tSqYeijLW027LV7nYaSQEgwQpDC54qI9CKNctloKHiQLE7YlPpmTt4ynMMU5CWAb2SccwvbKu1Gsd5tbbvPFXh2cLltrx6FqABESJQcENncPpY5wYMCPwQKGYs3SZWYO25XOGTJ4R3DjM4%2FS%2FPvIVwhD1BXzp5mgqLM28I4h%2FCUh%2B9FKDUJGCaAWeDfhLV64SM5pXESgt86X2EDUN97G9IuxPLX6a2wzD%2FAdSfgLf6Fxjyfs5aoy6xjFdMKnGEO3S03k52hDoF8MCJG5dPdfmwOiGeE8%2FmCOhCDymFeUIW6v80ZVWxiF0hfzDI6bkUgow02fP0L5D3X87KUzchV3CTYhEmrAIxdmmTTOPkRB96tsxxaNuwtOs3EgGFDE3oXjJpwT%2BRHcKy5LLP1LoGL1WfNbPC5x0wriD0B9gGD6T3yK2U%2Fxsfbfrsan2ihv7jNyMeVQhS%2BqanEgknhhoInq%2FYnublI6PZoYLo7tjFU0l4MGmv7bt3hBuba%2Bh5J0Iq8rFM5I3HsTyPHc9PcMpTIxN6K3RpGR1WJjOtUewxpk1fMEDUqIyAERYLiFvSMk32FxzfdmcHrcjBn6XcJymGzEgw4CdN6skKLsdI%2F7odU%2FFcpB8UWIkNoLsv4WWvqcCgLS0zqXCVhPA5I35G5le1h41mAon%2F4BfWnPfJDQfTvz4s0BqzSvBZVfg6Y81Xuqo0gHWhQIEC5VFWBE8%2BbcUA%2BvG6Y4%2Bs4tOUE5zCh2LcUsqntzWlHTXozqHvEqinpzclEdERLgNz9SBwBaoNzWjBRn9wIDDlXJ3xADxzf5Zb8ojWhIvAEGgVnOzxFLI4Ki4BNa2azGrc3Tjjm9Fprc5HoQGbK5lBTelpbP0zQtlnhXwL%2F9LryXh9kcJpnG2GcEk2SmbRDvY%2Fcg1QqgH56qP8O2hLCGH1Paim1cIJZ6iCkZSUx5edaFUsNvl1TvocsnUfoXExapWJAL8uAei8OcWtx3UF3la7MiuCDW%2BEi4jhIhc5S4ZsyyPvPQFiPp%2BKm2HSGiJlzsDvoLvrmOMnaYRlELOAEJGoMIwgIeFsyXZoYVDPWH9PUU9DNdWeWzFvRx4RV9hFhfkuQkNsjdtkEMNvUn%2BUBTO0fhZG70MtOSZ1gNBeSrDfQlR1vrBbYa61nJipKl79JZKy4JTLWk8fHQ5W4uoa0eaj4qO7DPuMsxSZVzBoUKLIGkCppJNGcHDDsum5Wp9TkofI2844h2ZKH3ylbNeq77U5X5iI7KOc7csa%2BSxEaMzkWW%2BEwaSdr8wXxAyRQ8pV8lE5o76YIFjUC3Q1tljehMfBUd1Ybd2mAldtnR2gAGc1X35Juv%2BjOQ6Pa71TJzTF8KlURENI9E22G7UiSGf4b0Tm0koB%2FNIzyIzzek0gJaDnTNYAUcLYxuJRr%2F8%2F1Q7NYJEYNywk%2F4Db3bccF%2B7JjGTfADPx96QpypKeccJJgd%2BmEYAx2oD2nmMpCCQ69yHKqxkZ4MFFWs3Z3Et7rauSmI7zbsz5PyKSW8GbusBlz7FH2DRIKOVGmJSFFRZDHp2x5nRbEV1Ynh3tjct2DG7V6lYCIwhQ0Bt3nM%2BbuR5njNBsD2w2GmcGYi%2FEKEZZjH4hqSyao0RTK9msEDNFCJRD7KejKaOoM6hVa3dtnhw1nPF0nh78B9XKMvgqteuK77jRt3QrTEAweK7apaf%2BzNduJWQy6GJzENNAuqc%2B0WtXmA4fwlgBTVddVNftiNupNvWk78TgNwUT8fVp8SZa1t91JNpA3750XCtwTwjm1X%2B7go0usrrqu%2Bl1dQqpS6CxZYffqQBPtcooskJdxwYhOkQHE3qeTRFSBI8YNQs11AF6kbyBhKSeOZhEIGLvetxt8H7jBUKjya3py9QaKSHy8fI6iF8NSpustvmyiF3StboswdtiVHEq5B505XV88FAo0ZN0EHLGem0l6Q4%2F%2FSanYgVUIfGbZXIBo7u0QzFL19zoR6CpNiszLBJYCs%3D&is_use_unify_report=1\",\"ticket\":\"\",\"traceid\":\"wx0t7hhsygquwwc200\",\"type\":\"0\",\"url\":\"?weixinadkey=0dcd25b2a0fdc6658b6226bebe9fc46004a69eac4387ee4b2c12357297e48652771255ee0161a5367dd583373b58ffbd&wx_aid=379120646&wx_traceid=wx0t7hhsygquwwc200&gdt_vid=wx0t7hhsygquwwc200&weixinadinfo=379120646.wx0t7hhsygquwwc200.0.1\",\"use_new_protocol\":2,\"uxinfo\":\"379120646|wx0t7hhsygquwwc200|346005421|0|1670934671|0|2|4031112715115510||AgKuZBrXr8o4DzI1MEfacSPmBLKAQlyM3+qjT0xwwab5ghwnx9QBxoClWYSVQVPPWsk=|379121128|21|0|oDdoCtwy1X__LCl4WZwlYfFYnHFY\",\"watermark_text\":\"小游戏推广\",\"watermark_type\":0,\"weapp_info\":{\"appid\":\"wxbe77d50ac82c441d\",\"head_img\":\"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5BibVJ1hOJwLPzQwGkCzgpXxjBB9xASIFNgDv3jop87hA/0\",\"nick_name\":\"最强弹一弹\",\"original_id\":\"gh_9cc128a6adbf\"}}\n");
                    return true;
                } else if (C87412m.m108589b("mbad", strArr2[1]) && strArr2.length > 2) {
                    String str4 = strArr2[2];
                    if (str4 != null) {
                        if (str4.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            ((C86380f) C86312j.m106911c(C86380f.class)).Pq0(strArr2[2]);
                        }
                    }
                    return true;
                }
            } else {
                byte[] decode3 = Base64.decode(strArr2[2], 2);
                C87412m.m108593f(decode3, "decode(args[2], Base64.NO_WRAP)");
                C19636w0.m21175q(new String(decode3, C119027c.f356488a));
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo22769b() {
        return (MultiProcessMMKV) ((C36570n) this.f50163a).getValue();
    }
}
