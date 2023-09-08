package l42;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.magicbrush.C85278l0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.IXWebBroadcastListener;
import d42.C86183k;
import d42.C86193x;
import d42.C86195z;
import di3.C86312j;
import e42.C7594e;
import e42.C86430i;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashSet;
import n42.C11117b;
import n42.C88903a;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C110826x0;

/* renamed from: l42.b */
public class C88381b extends C7594e implements C86193x, C86183k {

    /* renamed from: a */
    public final HashSet<C86430i<C88381b>> f255369a = C110826x0.m151014b(new C11117b(), new C88903a());

    /* renamed from: b */
    public C86195z<C88381b> f255370b;

    /* renamed from: c */
    public ViewGroup f255371c;

    /* renamed from: d */
    public Activity f255372d;

    /* renamed from: B */
    public void mo109582B(int i, View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MagicBrushDemoLogic", "onCanvasViewDestroy canvasId:" + i);
        ViewGroup viewGroup = this.f255371c;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        } else {
            C87412m.m108603p("containerView");
            throw null;
        }
    }

    /* renamed from: R */
    public void mo109583R(int i, View view, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "view");
        Log.m105918d("MagicBrushDemoLogic", "onCanvasViewLayout canvasId:" + i + " left:" + i2 + " top:" + i3 + " width:" + i4 + " height:" + i5);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i4;
        marginLayoutParams.height = i5;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.leftMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        Log.m105920e("MagicBrushDemoLogic", "onJSException msg:" + str2);
    }

    /* renamed from: Z */
    public void mo109585Z(int i, View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MagicBrushDemoLogic", "onCanvasViewCreated canvasId:" + i);
        ViewGroup viewGroup = this.f255371c;
        if (viewGroup != null) {
            viewGroup.addView(view);
        } else {
            C87412m.m108603p("containerView");
            throw null;
        }
    }

    /* renamed from: a0 */
    public void mo109586a0() {
        Log.m105920e("MagicBrushDemoLogic", "onConnException");
    }

    /* renamed from: b */
    public void mo109587b() {
        Log.m105924i("MagicBrushDemoLogic", "onMainScriptInjected");
        C86195z<C88381b> zVar = this.f255370b;
        if (zVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", 300);
            jSONObject.put("height", 200);
            jSONObject.put("top", 200);
            jSONObject.put("left", 0);
            C13598b0 b0Var = C13598b0.f38549a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …, 0)\n        }.toString()");
            zVar.mo120601d("createCanvas", jSONObject2);
            C86195z<C88381b> zVar2 = this.f255370b;
            if (zVar2 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", 300);
                jSONObject3.put("height", 200);
                jSONObject3.put("top", TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                jSONObject3.put("left", 100);
                String jSONObject4 = jSONObject3.toString();
                C87412m.m108593f(jSONObject4, "JSONObject().apply {\n   …100)\n        }.toString()");
                zVar2.mo120601d("createCanvas", jSONObject4);
                return;
            }
            C87412m.m108603p("magicBrush");
            throw null;
        }
        C87412m.m108603p("magicBrush");
        throw null;
    }

    /* renamed from: c */
    public void mo109588c(int i, boolean z) {
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        Log.m105918d("MagicBrushDemoLogic", "onDestroy");
    }

    /* renamed from: e0 */
    public Activity mo8720e0() {
        Activity activity = this.f255372d;
        if (activity != null) {
            return activity;
        }
        C87412m.m108603p("activityContext");
        throw null;
    }

    /* renamed from: f0 */
    public void mo122783f0() {
        C86195z<C88381b> zVar = this.f255370b;
        if (zVar != null) {
            zVar.destroy();
            ViewGroup viewGroup = this.f255371c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            } else {
                C87412m.m108603p("containerView");
                throw null;
            }
        } else {
            C87412m.m108603p("magicBrush");
            throw null;
        }
    }

    /* renamed from: g0 */
    public final void mo122784g0(Activity activity) {
        C87412m.m108594g(activity, "context");
        Log.m105924i("MagicBrushDemoLogic", IXWebBroadcastListener.STAGE_START);
        this.f255372d = activity;
        if (this instanceof C88382c) {
            Log.m105924i("MagicBrushDemoLogic", "publicServiceLogic");
        } else {
            Log.m105924i("MagicBrushDemoLogic", "magicBrushLogic");
        }
        C86195z<C88381b> mI = ((C85278l0) C86312j.m106911c(C85278l0.class)).mo57202mI(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRUSH_DEMO);
        mI.mo120607r(this);
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248375n = this;
        mBBuildConfig.mo118367a(this.f255369a);
        mI.mo120604m(mBBuildConfig);
        Log.m105924i("MagicBrushDemoLogic", "MagicBrush setUp");
        this.f255370b = mI;
    }

    /* renamed from: n */
    public void mo109590n() {
    }

    public void onCreated() {
        Log.m105924i("MagicBrushDemoLogic", "onCreated");
        C86195z<C88381b> zVar = this.f255370b;
        if (zVar != null) {
            zVar.start();
        } else {
            C87412m.m108603p("magicBrush");
            throw null;
        }
    }

    public void onPause() {
        Log.m105918d("MagicBrushDemoLogic", "onPause");
    }

    public void onResume() {
        Log.m105918d("MagicBrushDemoLogic", "onResume");
    }
}
