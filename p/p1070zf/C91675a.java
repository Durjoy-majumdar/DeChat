package p1070zf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c30.C104289g;
import com.tencent.p014mm.adplayable.jsapi.MagicPlayableContainer;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C85278l0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import d42.C86195z;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jk0.C87978d;
import li0.C88508b;
import li0.C88509c;
import o40.C61926c;
import org.json.JSONObject;
import p000ag.C27884e;
import p000ag.C27886f;
import p000ag.C39564h;
import p000ag.C79533b;
import p000ag.C79538i;
import q52.C62582g;

/* renamed from: zf.a */
public final class C91675a extends C87978d<C82520h> {
    public static final int CTRL_INDEX = 1194;
    public static final String NAME = "insertMiniProgramPlayableView";

    /* renamed from: zf.a$a */
    public static final class C91676a implements C88509c.C88512b {

        /* renamed from: d */
        public static final C91676a f262671d = new C91676a();

        /* renamed from: zf.a$a$a */
        public /* synthetic */ class C91677a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f262672a;

            static {
                int[] iArr = new int[C88508b.values().length];
                iArr[1] = 1;
                iArr[0] = 2;
                iArr[3] = 3;
                f262672a = iArr;
            }
        }

        /* renamed from: b */
        public final void mo113102b(String str, C88508b bVar) {
            Log.m105924i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onRunningStateChanged appId:" + str + " state:" + bVar);
            int i = bVar == null ? -1 : C91677a.f262672a[bVar.ordinal()];
            if (i == 1) {
                Log.m105924i("MagicPlayableMgr", "pausePlayableService");
                C79538i iVar = C79533b.f233185a;
                if (iVar != null) {
                    Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "pause");
                    if (!iVar.f233196e) {
                        C86195z<C79538i> zVar = iVar.f233192a;
                        if (zVar != null) {
                            zVar.pause();
                        } else {
                            C87412m.m108603p("magicBrush");
                            throw null;
                        }
                    }
                }
            } else if (i == 2) {
                Log.m105924i("MagicPlayableMgr", "resume");
                C79538i iVar2 = C79533b.f233185a;
                if (iVar2 != null) {
                    Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "resume");
                    C86195z<C79538i> zVar2 = iVar2.f233192a;
                    if (zVar2 != null) {
                        zVar2.resume();
                    } else {
                        C87412m.m108603p("magicBrush");
                        throw null;
                    }
                }
            } else if (i == 3) {
                Log.m105924i("MagicPlayableMgr", "releasePlayableService");
                C79538i iVar3 = C79533b.f233185a;
                if (iVar3 != null) {
                    Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "cleanup");
                    C61926c.m72668M(new C39564h(iVar3));
                    C86195z<C79538i> zVar3 = iVar3.f233192a;
                    if (zVar3 != null) {
                        zVar3.destroy();
                        C62582g gVar = iVar3.f233197f;
                        if (gVar != null) {
                            gVar.mo87640d();
                        }
                        C27884e.f77039a.mo55660a().clearAll();
                        return;
                    }
                    C87412m.m108603p("magicBrush");
                    throw null;
                }
            }
        }
    }

    /* renamed from: zf.a$b */
    public static final class C91678b implements C79533b.C79534a {

        /* renamed from: a */
        public final /* synthetic */ C91675a f262673a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f262674b;

        public C91678b(C91675a aVar, C82520h hVar) {
            this.f262673a = aVar;
            this.f262674b = hVar;
        }

        /* renamed from: a */
        public void mo109573a(int i, String str) {
            C87412m.m108594g(str, "status");
            String J = this.f262673a.mo125551J(i, str);
            Log.m105924i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "playableService callback result:" + J);
            C82520h hVar = this.f262674b;
            C87412m.m108592e(hVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageView");
            C81925i2 O0 = ((C83780d1) hVar).mo116160O0();
            C91679b bVar = new C91679b();
            bVar.f242407f = J;
            O0.getClass();
            bVar.mo115161k(O0);
            bVar.mo115158h();
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.optInt("viewId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        C87412m.m108594g(hVar, "component");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "inflateView");
        Context context = hVar.getContext();
        Context context2 = hVar.getContext();
        C87412m.m108593f(context2, "component.context");
        return new CoverViewContainer(context, (View) new MagicPlayableContainer(context2, (AttributeSet) null, 0, 6, (C8480h) null));
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C87412m.m108594g(hVar, "component");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView viewId:" + i);
        MagicPlayableContainer magicPlayableContainer = (MagicPlayableContainer) ((CoverViewContainer) view).mo114736d(MagicPlayableContainer.class);
        if (magicPlayableContainer == null) {
            Log.m105920e("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onInsertView playableContainerView fail");
            String J = mo125551J(2, "");
            C81925i2 O0 = ((C83780d1) hVar).mo116160O0();
            C91679b bVar = new C91679b();
            bVar.f242407f = J;
            O0.getClass();
            bVar.mo115161k(O0);
            bVar.mo115158h();
            return;
        }
        C91678b bVar2 = new C91678b(this, hVar);
        Log.m105924i("MagicPlayableMgr", "startPlayableService");
        C79538i iVar = new C79538i();
        C79533b.f233185a = iVar;
        iVar.f233195d = bVar2;
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "setContainerView");
        iVar.f233193b = magicPlayableContainer;
        Context context = magicPlayableContainer.getContext();
        C87412m.m108593f(context, "containerView.context");
        MagicPlayableContainer magicPlayableContainer2 = new MagicPlayableContainer(context, (AttributeSet) null, 0, 6, (C8480h) null);
        iVar.f233194c = magicPlayableContainer2;
        FrameLayout frameLayout = iVar.f233193b;
        if (frameLayout != null) {
            magicPlayableContainer2.setLayoutParams(frameLayout.getLayoutParams());
            FrameLayout frameLayout2 = iVar.f233193b;
            if (frameLayout2 != null) {
                FrameLayout frameLayout3 = iVar.f233194c;
                if (frameLayout3 != null) {
                    frameLayout2.addView(frameLayout3);
                    T t = C79533b.f233185a;
                    if (t != null) {
                        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", IXWebBroadcastListener.STAGE_START);
                        C30172a0 a0Var = (C30172a0) C86312j.m106911c(C30172a0.class);
                        FrameLayout frameLayout4 = t.f233193b;
                        if (frameLayout4 != null) {
                            Context context2 = frameLayout4.getContext();
                            C87412m.m108593f(context2, "playableContainerView.context");
                            C62582g t7 = a0Var.mo57195t7(context2);
                            FrameLayout frameLayout5 = t.f233193b;
                            if (frameLayout5 != null) {
                                t7.mo87639c(frameLayout5);
                                C86195z<C79538i> mI = ((C85278l0) C86312j.m106911c(C85278l0.class)).mo57202mI(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_PLAYABLE);
                                mI.mo120607r(t);
                                MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
                                mBBuildConfig.f248378q = t;
                                mBBuildConfig.f248375n = t;
                                mBBuildConfig.f248377p = t7;
                                mBBuildConfig.mo118367a(t.f233198g);
                                mI.mo120604m(mBBuildConfig);
                                Log.m105918d("MicroMsg.AppBrand.MagicPlayableService", "MagicBrush setUp");
                                t.f233192a = mI;
                                t.f233197f = t7;
                                C27886f fVar = C27886f.f77042a;
                                String valueOf = String.valueOf(t.hashCode());
                                synchronized (fVar) {
                                    C87412m.m108594g(valueOf, "sessionId");
                                    C27886f.C27887a aVar = new C27886f.C27887a(0, 0, 3, (C8480h) null);
                                    aVar.f77044a = System.currentTimeMillis();
                                    C27886f.f77043b.put(valueOf, aVar);
                                    Log.m105924i("MagicPlayableReporter", "markInitTime sessionId:" + valueOf + " initTime:" + aVar.f77044a);
                                    C7335d c = C86312j.m106911c(IMagicBrushMonitor.class);
                                    C87412m.m108593f(c, "getService(IMagicBrushMonitor::class.java)");
                                    IMagicBrushMonitor.C85281a.m105254b((IMagicBrushMonitor) c, valueOf, "MagicPlayable", IMagicBrushMonitor.PerformanceScene.Start, 0, (List) null, (JSONObject) null, 48, (Object) null);
                                }
                                return;
                            }
                            C87412m.m108603p("playableContainerView");
                            throw null;
                        }
                        C87412m.m108603p("playableContainerView");
                        throw null;
                    }
                    return;
                }
                C87412m.m108603p("playableCanvasView");
                throw null;
            }
            C87412m.m108603p("playableContainerView");
            throw null;
        }
        C87412m.m108603p("playableContainerView");
        throw null;
    }

    /* renamed from: J */
    public final String mo125551J(int i, String str) {
        C87412m.m108594g(str, "status");
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(i));
        hashMap.put("status", str);
        String gVar = new C104289g((Map) hashMap).toString();
        C87412m.m108593f(gVar, "JSONObject(map).toString()");
        return gVar;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "invoke");
        String optString = jSONObject.optString("appId");
        String optString2 = jSONObject.optString("moduleName");
        boolean z = false;
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                int optInt = jSONObject.optInt("versionType");
                Log.m105924i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "appId:" + optString + " moduleName:" + optString2 + " versionType:" + optInt);
                C87412m.m108593f(optString, "appId");
                C87412m.m108593f(optString2, "moduleName");
                C27884e eVar = C27884e.f77039a;
                Log.m105924i("MagicPlayablePkgRecordMgr", "setWxaPkgInfo appId:" + optString + " moduleName:" + optString2 + " versionType:" + optInt + '!');
                eVar.mo55660a().encode("AppID", optString);
                eVar.mo55660a().encode("ModuleName", optString2);
                eVar.mo55660a().encode("VersionType", optInt);
                C29315z2 b = eVar.mo55661b();
                if (b != null && C86013q1.m106450k(b.field_pkgPath)) {
                    z = true;
                }
                if (!z) {
                    fVar.mo109647a(i, C82863k.m101618a(this, 2, "fail:insert view failed pkg not exist", (Map<String, ? extends Object>) null));
                    return;
                }
                ((C81879g) fVar).getRuntime().f238113K.mo122978a(C91676a.f262671d);
                mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
                return;
            }
        }
        fVar.mo109647a(i, C82863k.m101618a(this, 1, "fail:insert view failed appId or moduleName null!", (Map<String, ? extends Object>) null));
    }
}
