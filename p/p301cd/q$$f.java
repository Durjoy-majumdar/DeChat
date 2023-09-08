package p301cd;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import co0.C80127b;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86920e;
import fl0.C86921f;
import io0.C87779d;
import lo0.C88603c;
import lo0.C88605d;
import ml0.C21511u;
import org.json.JSONArray;
import org.json.JSONObject;
import p1068zc.C91660a;
import p830xc.C91165a;
import p830xc.C91167d;
import p954dd.C86224a;
import wq0.C91085v;
import zt3.C119157j;

/* renamed from: cd.q$$f */
public final /* synthetic */ class q$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234356d;

    /* renamed from: e */
    public final /* synthetic */ C91165a f234357e;

    public /* synthetic */ q$$f(C80005q qVar, C91165a aVar) {
        this.f234356d = qVar;
        this.f234357e = aVar;
    }

    public final void run() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        int length;
        C86224a aVar;
        C80005q qVar = this.f234356d;
        C91165a aVar2 = this.f234357e;
        qVar.getClass();
        String f = aVar2.mo62543f();
        if (!Util.isNullOrNil(f)) {
            JSONObject b = aVar2.mo62539b();
            Log.m105925i(qVar.mo110227w(), "*** handler(%s) handleJsApi(%s), data:%s", qVar.mo122122p(), f, b.toString());
            b.toString();
            if (f.contains("insert")) {
                qVar.mo110216F(5);
                qVar.f234325g.mo120976o(aVar2);
                Context context = aVar2.getContext();
                if (!(context instanceof Activity)) {
                    Log.m105928w("MicroMsg.SameLayer.LivePusherPluginHandler", "invokeInsertAfterRequestPermission, pageContext not activity");
                    aVar2.mo62552m("fail:internal error invalid android context", C86920e.f252314d);
                    C91085v.m114268c(aVar2.getAppId());
                } else {
                    qVar.f234337v = 0;
                    qVar.mo110225u((Activity) context, aVar2);
                }
            } else if (f.contains("update")) {
                qVar.mo110216F(6);
                qVar.f234325g.mo120974k(aVar2);
                if (qVar.f234327i == null) {
                    Log.m105924i(qVar.mo110227w(), "update, adapter is null");
                } else {
                    JSONObject b2 = aVar2.mo62539b();
                    qVar.mo110214D(aVar2, b2);
                    qVar.mo110213C(b2);
                    if (b2.has(V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
                        qVar.f234338w = b2.optInt(V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE, 0) != 0;
                    }
                    if (b2.has(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
                        qVar.f234340y = b2.optBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, false);
                    }
                    qVar.mo110212B(b2);
                    Bundle b3 = C91660a.m115196b(b2);
                    C86224a aVar3 = qVar.f234330o;
                    if (aVar3 != null) {
                        String b4 = ((C88603c) aVar3).mo123045b(aVar2, b3);
                        if (!Util.isNullOrNil(b4)) {
                            Log.m105925i(qVar.mo110227w(), "update fail, message:%s", b4);
                            aVar2.mo62552m("fail: can not update LivePusher to VOIP mode now", C86921f.f252331e);
                            ((C119157j) C119157j.f356862d).mo183895z(new q$$l(aVar2, b4));
                        }
                    }
                    C21511u e = ((C79998d0) qVar.f234327i).mo21073e(b3);
                    Log.m105925i(qVar.mo110227w(), "update, code:%d info:%s", Integer.valueOf(e.f60905a), e.f60906b);
                    aVar2.mo62547h(e.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, e.f60907c);
                    qVar.mo110222r(aVar2);
                    qVar.mo110223s(aVar2);
                    if (e.f60905a == 0 && (aVar = qVar.f234330o) != null) {
                        ((C88603c) aVar).mo123050g(qVar, qVar.f234331p, b3);
                        C86224a aVar4 = qVar.f234330o;
                        C91165a aVar5 = qVar.f234331p;
                        C88603c cVar = (C88603c) aVar4;
                        cVar.f255880a = b3.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, cVar.f255880a);
                        cVar.mo123044a();
                        C83127a d = cVar.mo123047d(aVar5);
                        if (d != null) {
                            d.mo115365d(C80127b.m97435a(aVar5), cVar.f255880a);
                        } else {
                            Log.m105918d("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "updateForBackgroundVOIPIfNeed, no state manager");
                        }
                    }
                }
            } else if (f.contains("operate")) {
                qVar.mo110216F(7);
                if (qVar.f234327i == null) {
                    Log.m105924i(qVar.mo110227w(), "operate, adapter is null");
                } else {
                    JSONObject b5 = aVar2.mo62539b();
                    String optString = b5.optString("type");
                    Log.m105925i(qVar.mo110227w(), "operate, type:%s", optString);
                    if (Util.isNullOrNil(optString)) {
                        aVar2.mo62552m("fail:missing operateType", C86920e.f252314d);
                    } else if (qVar.f234327i == null) {
                        aVar2.mo62551l(C86920e.f252314d);
                    } else if (optString.equals(AppBrandFileCleaner.f238098c)) {
                        ((C79998d0) qVar.f234327i).mo33719k(new C80008r(qVar, aVar2));
                        C21511u f2 = ((C79998d0) qVar.f234327i).mo21074f(AppBrandFileCleaner.f238098c, aVar2.mo62539b());
                        if (f2.f60905a != 0) {
                            aVar2.mo62547h(C86920e.f252314d, f2.f60907c);
                        }
                    } else if (optString.equals("snapshotView")) {
                        if (qVar.f234327i == null) {
                            Log.m105928w(qVar.mo110227w(), "operateSnapshotView, adapter is null");
                            aVar2.mo62551l(C86920e.f252314d);
                        } else {
                            Log.m105924i(qVar.mo110227w(), "takeScreenshot");
                            qVar.f234318H = aVar2;
                            C91167d.m114401b(qVar.f253973f, qVar.f253972e, qVar.f253971d);
                            Log.m105924i(qVar.mo110227w(), "operateSnapshotView, success");
                        }
                    } else if (optString.equalsIgnoreCase("exitPictureInPicture")) {
                        qVar.f234324N.mo125356b(aVar2);
                    } else if (optString.equals("playBGM")) {
                        C86224a aVar6 = qVar.f234330o;
                        if (aVar6 != null) {
                            C80009s sVar = new C80009s(qVar, b5);
                            C88603c cVar2 = (C88603c) aVar6;
                            if (aVar2 instanceof C81823b) {
                                C81823b bVar = (C81823b) aVar2;
                                JSONObject b6 = bVar.mo62539b();
                                String optString2 = b6.has("url") ? b6.optString("url") : null;
                                if (Util.isNullOrNil(optString2)) {
                                    Log.m105928w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "operatePlayBgm, url is nil");
                                    aVar2.mo62552m("fail:url is nil", C86920e.f252317g);
                                } else {
                                    C87779d.m109218e(bVar.mo62544g(), optString2, false, (String) null, new C88605d(cVar2, sVar, optString2));
                                }
                            }
                            aVar2.mo62551l(C86920e.f252311a);
                        } else {
                            aVar2.mo62551l(C86920e.f252314d);
                        }
                    } else {
                        if (!(optString.equalsIgnoreCase("applyFilter") || optString.equalsIgnoreCase("applySticker") || optString.equalsIgnoreCase("applyMakeup"))) {
                            C21511u f3 = ((C79998d0) qVar.f234327i).mo21074f(optString, b5);
                            Log.m105925i(qVar.mo110227w(), "operate, type:%s, error:[%s, %s]", optString, Integer.valueOf(f3.f60905a), f3.f60906b);
                            aVar2.mo62547h(f3.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, f3.f60907c);
                            if (optString.equalsIgnoreCase("stop") && f3.f60905a == 0) {
                                qVar.f234324N.mo125359k(aVar2);
                                C86224a aVar7 = qVar.f234330o;
                                if (aVar7 != null) {
                                    ((C88603c) aVar7).mo123049f(qVar, qVar.f234331p);
                                }
                            }
                        } else if (qVar.f234330o == null) {
                            Log.m105928w(qVar.mo110227w(), "convertResourcePathAndOperateLivePusher, customHandler is null");
                            aVar2.mo62551l(C86920e.f252314d);
                        } else if (!optString.equalsIgnoreCase("applyFilter")) {
                            Log.m105924i(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher");
                            if (optString.equalsIgnoreCase("applySticker")) {
                                JSONArray optJSONArray = b5.optJSONArray("stickers");
                                if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
                                    Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher, stickersJsonArr is empty");
                                    aVar2.mo62552m("fail:stickers is empty", C86920e.f252317g);
                                } else {
                                    q$$w q__w = new q$$w((C80010t) null);
                                    q__w.f234395a = length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        }
                                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                        if (optJSONObject == null) {
                                            Log.m105929w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1, stickerJsonObj(%d) is null", Integer.valueOf(i));
                                            aVar2.mo62552m("fail:stickers is illegal", C86920e.f252317g);
                                            break;
                                        }
                                        String optString3 = optJSONObject.optString("path", (String) null);
                                        if (Util.isNullOrNil(optString3)) {
                                            Log.m105925i(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher1, resourcePath(%d) is empty", Integer.valueOf(i));
                                            aVar2.mo62552m("fail:stickers is illegal", C86920e.f252317g);
                                            break;
                                        }
                                        JSONObject jSONObject = optJSONObject;
                                        int i2 = i;
                                        int i3 = i;
                                        JSONObject jSONObject2 = jSONObject;
                                        q$$w q__w2 = q__w;
                                        ((C88603c) qVar.f234330o).mo123046c(aVar2, optString3, optJSONObject.optString("md5", (String) null), true, new C80016z(qVar, i2, jSONObject2, aVar2, q__w2, b5));
                                        i = i3 + 1;
                                        q__w = q__w2;
                                        length = length;
                                        optJSONArray = optJSONArray;
                                    }
                                }
                            } else if (optString.equalsIgnoreCase("applyMakeup")) {
                                String optString4 = b5.optString("makeupType", (String) null);
                                if (Util.isNullOrNil(optString4)) {
                                    Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupTypeStr is empty");
                                    aVar2.mo62552m("fail:makeupType is empty", C86920e.f252317g);
                                } else {
                                    JSONObject optJSONObject2 = b5.optJSONObject("makeup");
                                    if (optJSONObject2 == null) {
                                        Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupJsonObj is null");
                                        aVar2.mo62552m("fail:makeup is null or undefined", C86920e.f252317g);
                                    } else if (optString4.equalsIgnoreCase("lipStick")) {
                                        C21511u f4 = ((C79998d0) qVar.f234327i).mo21074f("applyMakeup", b5);
                                        Log.m105925i(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher2, type:applyMakeup, error:[%s, %s]", Integer.valueOf(f4.f60905a), f4.f60906b);
                                        aVar2.mo62547h(f4.f60905a == 0 ? C86920e.f252311a : C86920e.f252314d, f4.f60907c);
                                    } else if (optString4.equalsIgnoreCase("eyeShadow")) {
                                        String optString5 = optJSONObject2.optString("path", (String) null);
                                        if (Util.isNullOrNil(optString5)) {
                                            Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher2, path is empty");
                                            aVar2.mo62552m("fail:path is empty", C86920e.f252317g);
                                        } else {
                                            String optString6 = optJSONObject2.optString("pathMd5", (String) null);
                                            String optString7 = optJSONObject2.optString("shimmerPosition", (String) null);
                                            if (!Util.isNullOrNil(optString7)) {
                                                strArr2 = new String[]{optString6, optJSONObject2.optString("shimmerPositionMD5", (String) null)};
                                                strArr3 = new String[]{optString5, optString7};
                                                strArr = new String[]{"path", "shimmerPosition"};
                                            } else {
                                                String[] strArr4 = {optString5};
                                                String[] strArr5 = {optString6};
                                                strArr = new String[]{"path"};
                                                strArr3 = strArr4;
                                                strArr2 = strArr5;
                                            }
                                            qVar.mo110224t(strArr3, strArr2, strArr, optJSONObject2, aVar2, b5);
                                        }
                                    } else if (optString4.equalsIgnoreCase("blusherStick") || optString4.equalsIgnoreCase("faceContour") || optString4.equalsIgnoreCase("eyeBrow")) {
                                        String optString8 = optJSONObject2.optString("path", (String) null);
                                        if (Util.isNullOrNil(optString8)) {
                                            Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher2, path is empty");
                                            aVar2.mo62552m("fail:path is empty", C86920e.f252317g);
                                        } else {
                                            qVar.mo110224t(new String[]{optString8}, new String[]{optJSONObject2.optString("pathMd5", (String) null)}, new String[]{"path"}, optJSONObject2, aVar2, b5);
                                        }
                                    } else {
                                        Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher2, makeupTypeStr is illegal");
                                        aVar2.mo62552m("fail:makeupType is illegal", C86920e.f252317g);
                                    }
                                }
                            } else {
                                Log.m105928w(qVar.mo110227w(), "convertResourcePathWorkaroundAndOperateLivePusher, type is illegal");
                                aVar2.mo62551l(C86920e.f252314d);
                            }
                        } else {
                            String optString9 = b5.optString("path", (String) null);
                            if (Util.isNullOrNil(optString9)) {
                                Log.m105924i(qVar.mo110227w(), "convertResourcePathAndOperateLivePusher, resourcePath is empty");
                            } else {
                                ((C88603c) qVar.f234330o).mo123046c(aVar2, optString9, b5.optString("md5", (String) null), optString.equalsIgnoreCase("applySticker"), new C80015y(qVar, b5, aVar2, optString));
                            }
                        }
                    }
                }
            } else if (f.contains("remove")) {
                qVar.mo110216F(8);
                qVar.mo110215E();
                aVar2.mo62551l(C86920e.f252311a);
                qVar.f234324N.mo125359k(aVar2);
            }
            if (qVar.f234330o != null) {
                JSONObject b7 = aVar2.mo62539b();
                if (b7 == null) {
                    Log.m105928w(qVar.mo110227w(), "handleAutoPlay, dataJsonObj is null");
                } else if (b7.has(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH)) {
                    ((C88603c) qVar.f234330o).f255887h = b7.optBoolean(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH, false);
                }
            }
            JSONObject b8 = aVar2.mo62539b();
            if (b8 == null) {
                Log.m105928w(qVar.mo110227w(), "handlePusherUrl, dataJsonObj is null");
            } else {
                qVar.f234321K = b8.optString(V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, qVar.f234321K);
            }
            qVar.f234324N.mo125358j(aVar2, qVar.f234321K);
        }
    }
}
