package com.tencent.p014mm.plugin.webcanvas;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import o40.C61926c;
import q73.C22078m;
import q73.C89538a;
import q73.C89543a0;
import q73.C89545c;
import q73.C89547f;
import q73.C89562n;
import q73.C89567w;
import rx3.C13598b0;
import s73.C90150b;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webcanvas/WebCanvasView;", "Landroid/widget/FrameLayout;", "Lq73/m;", "", "e", "Ljava/lang/String;", "getCanvasId", "()Ljava/lang/String;", "setCanvasId", "(Ljava/lang/String;)V", "canvasId", "Lq73/f;", "getJsEngine", "()Lq73/f;", "jsEngine", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webcanvas.WebCanvasView */
public abstract class WebCanvasView extends FrameLayout implements C22078m {

    /* renamed from: d */
    public final String f249174d;

    /* renamed from: e */
    public String f249175e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public final String getCanvasId() {
        return this.f249175e;
    }

    public abstract C89547f getJsEngine();

    public void onAttachedToWindow() {
        String str = this.f249174d;
        Log.m105924i(str, "onAttachedToWindow#" + this.f249175e);
        Context context = getContext();
        C89562n nVar = context instanceof C89562n ? (C89562n) context : null;
        if (nVar != null) {
            nVar.mo22788n5(this);
        }
        super.onAttachedToWindow();
    }

    public void onDestroy() {
        if (!C112551y.m153811k(this.f249175e)) {
            C89547f jsEngine = getJsEngine();
            String str = this.f249175e;
            jsEngine.getClass();
            C87412m.m108594g(str, "canvasId");
            String str2 = jsEngine.f257695B;
            Log.m105924i(str2, "stop #" + str);
            C89547f.m111944P1(jsEngine, "stop", str, (ValueCallback) null, 4, (Object) null);
        }
        getJsEngine().mo118085N1();
        Log.m105924i(this.f249174d, "onDestroy");
    }

    public void onPause() {
        if (!C112551y.m153811k(this.f249175e)) {
            C89547f jsEngine = getJsEngine();
            String str = this.f249175e;
            jsEngine.getClass();
            C87412m.m108594g(str, "canvasId");
            String str2 = jsEngine.f257695B;
            Log.m105924i(str2, "pause #" + str);
            C89547f.m111944P1(jsEngine, "pause", str, (ValueCallback) null, 4, (Object) null);
            C89567w.m111982T1(jsEngine.mo118087S1(), str, (ValueCallback) null, 2, (Object) null);
            jsEngine.mo118087S1().getClass();
            if (!C87412m.m108589b(jsEngine.f257705L, "pause")) {
                jsEngine.f257705L = "pause";
                C89567w.m111982T1(jsEngine.mo118087S1(), jsEngine.f257704K, (ValueCallback) null, 2, (Object) null);
                C89567w S1 = jsEngine.mo118087S1();
                String str3 = jsEngine.f257704K;
                S1.getClass();
                C87412m.m108594g(str3, "canvasId");
            }
        }
    }

    public void onResume() {
        MagicBrushView g;
        C90150b.C90151b bVar;
        if (!C112551y.m153811k(this.f249175e)) {
            C89547f jsEngine = getJsEngine();
            String str = this.f249175e;
            jsEngine.getClass();
            C87412m.m108594g(str, "canvasId");
            long now = MMSlotKt.now();
            String str2 = jsEngine.f257695B;
            Log.m105924i(str2, "resume #" + str + ", " + now);
            C90150b bVar2 = jsEngine.f257700G;
            int hashCode = str.hashCode();
            bVar2.getClass();
            if (!bVar2.f258842h.containsKey(Integer.valueOf(hashCode))) {
                ConcurrentHashMap<Integer, C90150b.C13629a> concurrentHashMap = bVar2.f258842h;
                Integer valueOf = Integer.valueOf(hashCode);
                C90150b.C13629a aVar = new C90150b.C13629a(System.currentTimeMillis(), hashCode, str);
                C90150b.C90151b bVar3 = bVar2.f258841g.get(str);
                if (bVar3 != null) {
                    Boolean.valueOf(bVar3.f258849c).booleanValue();
                }
                concurrentHashMap.put(valueOf, aVar);
            }
            if (!(bVar2.f258842h.get(Integer.valueOf(hashCode)) == null || (bVar = bVar2.f258841g.get(str)) == null)) {
                Boolean.valueOf(bVar.f258849c).booleanValue();
            }
            C89547f.m111944P1(jsEngine, "resume", str, (ValueCallback) null, 4, (Object) null);
            C89567w S1 = jsEngine.mo118087S1();
            synchronized (S1) {
                if (S1.f257762L) {
                    S1.f257762L = false;
                    S1.resume();
                    if (!S1.f257763M) {
                        S1.f257763M = true;
                        C61926c.m72668M(new C89543a0(S1));
                    }
                    Log.m105924i(S1.f257756F, "renderJsEngine resume");
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            jsEngine.mo118087S1().mo123886U1(now, str, (ValueCallback<String>) null);
            C89567w S12 = jsEngine.mo118087S1();
            S12.getClass();
            C89567w.m111980P1(S12, "resume", str, (ValueCallback) null, 4, (Object) null);
            if (!C87412m.m108589b(jsEngine.f257705L, "resume")) {
                jsEngine.f257705L = "resume";
                jsEngine.mo118087S1().mo123886U1(now, jsEngine.f257704K, (ValueCallback<String>) null);
                C89567w S13 = jsEngine.mo118087S1();
                String str3 = jsEngine.f257704K;
                S13.getClass();
                C87412m.m108594g(str3, "canvasId");
                C89567w.m111980P1(S13, "resume", str3, (ValueCallback) null, 4, (Object) null);
            }
            C89538a Q1 = jsEngine.mo118087S1().mo123884Q1(str);
            if (Q1 != null && (g = Q1.mo123840g()) != null) {
                C89538a.m111916a(g, Q1);
                g.post(new C89545c(g, Q1));
            }
        }
    }

    public final void setCanvasId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f249175e = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f249174d = "MicroMsg.WebCanvasView:" + hashCode();
        this.f249175e = "";
    }
}
