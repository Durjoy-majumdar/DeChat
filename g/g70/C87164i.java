package g70;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h70.C87459d;
import i70.C87665a;
import i70.C87667c;
import i70.C87672e;
import i70.C87674f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import n70.C47167a;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: g70.i */
public final class C87164i {

    /* renamed from: a */
    public String f252785a;

    /* renamed from: b */
    public final String f252786b;

    /* renamed from: c */
    public final C87667c<?, ?>.a f252787c;

    /* renamed from: d */
    public String f252788d;

    /* renamed from: e */
    public HashSet<Integer> f252789e;

    /* renamed from: f */
    public int f252790f;

    /* renamed from: g */
    public int f252791g;

    /* renamed from: h */
    public C32224a<C13598b0> f252792h;

    /* renamed from: i */
    public C32224a<C13598b0> f252793i;

    /* renamed from: j */
    public boolean f252794j;

    /* renamed from: k */
    public MagicSclBrandReporter.PreloadScene f252795k;

    /* renamed from: l */
    public MagicSclViewContainer f252796l;

    /* renamed from: m */
    public boolean f252797m;

    /* renamed from: n */
    public boolean f252798n;

    /* renamed from: o */
    public boolean f252799o;

    /* renamed from: p */
    public int f252800p;

    /* renamed from: g70.i$a */
    public static final class C87165a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87164i f252801d;

        /* renamed from: e */
        public final /* synthetic */ MagicSclViewContainer f252802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87165a(C87164i iVar, MagicSclViewContainer magicSclViewContainer) {
            super(0);
            this.f252801d = iVar;
            this.f252802e = magicSclViewContainer;
        }

        public Object invoke() {
            C87164i iVar = this.f252801d;
            C87667c<?, ?>.a aVar = iVar.f252787c;
            ViewGroup.LayoutParams layoutParams = null;
            if (aVar != null) {
                C87672e eVar = aVar.f253932g.f253920g;
                String str = iVar.f252786b;
                eVar.getClass();
                C87412m.m108594g(str, "frameSetId");
                Collection<C87672e.C87673a> values = eVar.f253937a.values();
                C87412m.m108593f(values, "canvasMap.values");
                ArrayList arrayList = new ArrayList();
                for (T next : values) {
                    if (C87412m.m108589b(((C87672e.C87673a) next).f253939b, str)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    View view = ((C87672e.C87673a) it.next()).f253944g;
                    if (view != null) {
                        arrayList2.add(view);
                    }
                }
                MagicSclViewContainer magicSclViewContainer = this.f252802e;
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    View view2 = (View) it4.next();
                    ViewParent parent = view2.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    if (magicSclViewContainer != null) {
                        magicSclViewContainer.addView(view2, view2.getLayoutParams());
                    }
                }
            }
            MagicSclViewContainer magicSclViewContainer2 = this.f252802e;
            ViewParent parent2 = magicSclViewContainer2 != null ? magicSclViewContainer2.getParent() : null;
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(this.f252801d.f252794j);
            }
            MagicSclViewContainer magicSclViewContainer3 = this.f252802e;
            if (magicSclViewContainer3 != null) {
                layoutParams = magicSclViewContainer3.getLayoutParams();
            }
            int i = this.f252801d.f252790f;
            if (i > 0 && layoutParams != null) {
                layoutParams.width = C47167a.m52445b(Integer.valueOf(i));
            }
            int i2 = this.f252801d.f252791g;
            if (i2 > 0 && layoutParams != null) {
                layoutParams.height = C47167a.m52445b(Integer.valueOf(i2));
            }
            MagicSclViewContainer magicSclViewContainer4 = this.f252802e;
            if (magicSclViewContainer4 != null) {
                magicSclViewContainer4.setLayoutParams(layoutParams);
            }
            return C13598b0.f38549a;
        }
    }

    public C87164i(String str, String str2, C87667c<?, ?>.a aVar, String str3, HashSet<Integer> hashSet, String str4, int i, int i2, int i3, C8480h hVar) {
        aVar = (i3 & 4) != 0 ? null : aVar;
        hashSet = (i3 & 16) != 0 ? new HashSet<>() : hashSet;
        if ((i3 & 32) != 0) {
            str4 = MMApplicationContext.getProcessName();
            C87412m.m108593f(str4, "getProcessName()");
        }
        i = (i3 & 64) != 0 ? 0 : i;
        i2 = (i3 & 128) != 0 ? 0 : i2;
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "id");
        C87412m.m108594g(str3, "bizName");
        C87412m.m108594g(hashSet, "canvasIds");
        C87412m.m108594g(str4, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        this.f252785a = str;
        this.f252786b = str2;
        this.f252787c = aVar;
        this.f252788d = str3;
        this.f252789e = hashSet;
        this.f252790f = i;
        this.f252791g = i2;
        this.f252794j = true;
        this.f252795k = MagicSclBrandReporter.PreloadScene.NoPreload;
    }

    /* renamed from: a */
    public final void mo121597a() {
        if (!this.f252799o && this.f252797m) {
            this.f252799o = true;
            C87667c<?, ?>.a aVar = this.f252787c;
            if (aVar != null) {
                String p0 = aVar.f253932g.mo122096p0();
                Log.m105924i(p0, "attach frameSet#" + this.f252786b);
                C87667c<ViewType, T> cVar = aVar.f253932g;
                cVar.getClass();
                C87674f fVar = cVar.f253916c;
                fVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f253926a);
                jSONObject.put("frameSetRootId", aVar.f253930e);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("frameSetId", this.f252786b);
                jSONObject2.put("viewId", this.f252800p);
                jSONObject2.put("frameSetName", this.f252785a);
                jSONArray.put(jSONObject2);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("frameSets", jSONArray);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
                fVar.mo122111a("surface:frameSet:attach", jSONObject3);
                Log.m105918d("MagicSclEventHandler", "onAttach frameSetId:" + this.f252786b);
            }
        }
    }

    /* renamed from: b */
    public final void mo121598b() {
        C87667c<?, ?>.a aVar = this.f252787c;
        if (aVar != null) {
            String p0 = aVar.f253932g.mo122096p0();
            Log.m105924i(p0, "FrameSetRoot#" + aVar.f253930e + " bind: " + this);
            C87164i ye02 = ((C87459d) C86312j.m106911c(C87459d.class)).ye0(this);
            C87667c<ViewType, T> cVar = aVar.f253932g;
            if (ye02.f252790f > 0 && ye02.f252791g > 0) {
                String p05 = cVar.mo122096p0();
                Log.m105924i(p05, "frameSet layout, notify size now: " + ye02);
                C87665a aVar2 = cVar.f253924k;
                if (aVar2 != null) {
                    aVar2.mo121196l(ye02);
                }
            }
            cVar.f253921h.put(ye02.f252786b, ye02);
            if (!aVar.f253931f.containsKey(ye02.f252786b)) {
                String p06 = cVar.mo122096p0();
                Log.m105924i(p06, "onBind " + ye02);
                aVar.f253931f.put(ye02.f252786b, ye02);
                cVar.mo118864r0(aVar, ye02, "");
                ye02.f252797m = true;
                return;
            }
            String p07 = cVar.mo122096p0();
            Log.m105924i(p07, ye02 + " already bound!");
        }
    }

    /* renamed from: c */
    public final void mo121599c() {
        if (this.f252799o && this.f252797m) {
            this.f252799o = false;
            C87667c<?, ?>.a aVar = this.f252787c;
            if (aVar != null) {
                String p0 = aVar.f253932g.mo122096p0();
                Log.m105924i(p0, "detach frameSet#" + this.f252786b);
                C87667c<ViewType, T> cVar = aVar.f253932g;
                cVar.getClass();
                C87674f fVar = cVar.f253916c;
                fVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f253926a);
                jSONObject.put("frameSetRootId", aVar.f253930e);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("frameSetId", this.f252786b);
                jSONObject2.put("viewId", this.f252800p);
                jSONObject2.put("frameSetName", this.f252785a);
                jSONArray.put(jSONObject2);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("frameSets", jSONArray);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
                fVar.mo122111a("surface:frameSet:detach", jSONObject3);
                Log.m105918d("MagicSclEventHandler", "onDetach frameSetId:" + this.f252786b);
            }
        }
    }

    /* renamed from: d */
    public final void mo121600d() {
        C87667c<?, ?>.a aVar = this.f252787c;
        if (aVar != null) {
            String p0 = aVar.f253932g.mo122096p0();
            Log.m105924i(p0, "FrameSetRoot#" + aVar.f253930e + " init: " + this.f252786b);
            C87164i ye02 = ((C87459d) C86312j.m106911c(C87459d.class)).ye0(this);
            C87667c<ViewType, T> cVar = aVar.f253932g;
            if (!ye02.f252798n) {
                cVar.f253921h.put(ye02.f252786b, ye02);
                ye02.f252798n = true;
                cVar.mo121540v0(aVar, ye02);
            }
        }
    }

    /* renamed from: e */
    public final void mo121601e() {
        C87667c<?, ?>.a aVar;
        if (this.f252797m && (aVar = this.f252787c) != null) {
            aVar.mo122104g(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C87164i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.MagicSclFrameSet");
        return C87412m.m108589b(this.f252786b, ((C87164i) obj).f252786b);
    }

    /* renamed from: f */
    public final void mo121603f(MagicSclViewContainer magicSclViewContainer) {
        MagicSclViewContainer magicSclViewContainer2 = this.f252796l;
        if (C87412m.m108589b(magicSclViewContainer, magicSclViewContainer2)) {
            mo121601e();
            return;
        }
        Log.m105924i("MicroMsg.MagicSclFrameSet", "setViewContainer " + magicSclViewContainer + " for " + this + ' ');
        this.f252796l = magicSclViewContainer;
        if (this.f252797m) {
            if (magicSclViewContainer2 != null) {
                magicSclViewContainer2.mo76547d();
            }
            C61926c.m72668M(new C87165a(this, magicSclViewContainer));
            mo121601e();
        }
    }

    /* renamed from: g */
    public final void mo121604g() {
        if (this.f252797m) {
            C87667c<?, ?>.a aVar = this.f252787c;
            if (aVar != null) {
                String p0 = aVar.f253932g.mo122096p0();
                Log.m105924i(p0, "FrameSetRoot#" + aVar.f253930e + " unbind: " + this);
                aVar.f253932g.f253921h.remove(this.f252786b);
                aVar.f253931f.remove(this.f252786b);
                ((C87459d) C86312j.m106911c(C87459d.class)).ij0(this);
                C87667c<ViewType, T> cVar = aVar.f253932g;
                cVar.getClass();
                C87674f fVar = cVar.f253916c;
                fVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("frameSetRootId", aVar.f253930e);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("frameSetId", this.f252786b);
                jSONObject2.put("viewId", this.f252800p);
                jSONObject2.put("frameSetName", this.f252785a);
                jSONArray.put(jSONObject2);
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("frameSets", jSONArray);
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …  })\n        }.toString()");
                fVar.mo122111a("surface:frameSet:destroyed", jSONObject3);
                C87667c<ViewType, T> cVar2 = aVar.f253932g;
                int i = this.f252800p;
                cVar2.getClass();
                Log.m105924i("MBDynamicBizContext", "removeCustomView,viewId:" + i);
                cVar2.f251224a.mo120838b(i);
            }
            MagicSclViewContainer magicSclViewContainer = this.f252796l;
            if (magicSclViewContainer != null) {
                magicSclViewContainer.mo76547d();
            }
            this.f252792h = null;
            this.f252793i = null;
            this.f252797m = false;
        }
    }

    public int hashCode() {
        return this.f252786b.hashCode();
    }

    public String toString() {
        return "MagicSclFrameSet(" + super.hashCode() + " name='" + this.f252785a + "', bizName='" + this.f252788d + "', id='" + this.f252786b + "', canvasIds=" + C8240k.m8315a(this.f252789e) + ", contaienr=" + this.f252796l + ", isClipChildren=" + this.f252794j + ", size=" + this.f252790f + 'x' + this.f252791g + " sizeChanged=" + false + ", root=" + this.f252787c + ", pScene=" + this.f252795k + ')';
    }
}
