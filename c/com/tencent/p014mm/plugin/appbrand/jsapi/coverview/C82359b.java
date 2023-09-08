package com.tencent.p014mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import cl0.C80049e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.widget.C84931f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import eb0.C86493v0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import jk0.C87978d;
import org.json.JSONObject;
import sn0.C90249b;
import sn0.C90251c;
import sn0.C90266f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b */
public class C82359b extends C87978d {
    private static final int CTRL_INDEX = 253;
    public static final String NAME = "insertTextView";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b$a */
    public class C82360a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f241407d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241408e;

        public C82360a(C82359b bVar, C86493v0.C86495c cVar, C82520h hVar) {
            this.f241407d = cVar;
            this.f241408e = hVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.JsApiInsertTextView", "onClick");
            C82364e eVar = new C82364e((C82360a) null);
            HashMap hashMap = new HashMap();
            hashMap.put("data", this.f241407d.mo120959f("data", ""));
            eVar.mo115165o(hashMap);
            if ("webview".equals(this.f241407d.mo120959f("sendTo", (String) null))) {
                this.f241408e.mo109676w(eVar);
            } else {
                this.f241408e.mo109669n(eVar, (int[]) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b$b */
    public class C82361b implements CoverViewContainer.C82351a {

        /* renamed from: a */
        public final /* synthetic */ C86493v0.C86495c f241409a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f241410b;

        public C82361b(C82359b bVar, C86493v0.C86495c cVar, C82520h hVar) {
            this.f241409a = cVar;
            this.f241410b = hVar;
        }

        /* renamed from: a */
        public void mo114754a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
            C82365f fVar = new C82365f();
            HashMap hashMap = new HashMap();
            hashMap.put("data", str2);
            hashMap.put(IXWebBroadcastListener.STAGE_TAG, str);
            hashMap.put("drag", jSONObject);
            hashMap.put("target", jSONObject2);
            fVar.mo115165o(hashMap);
            Log.m105925i("MicroMsg.JsApiInsertTextView", "callback stage:%s, drag:%s, data:%s， target:%s", str, jSONObject, str2, jSONObject2);
            if ("webview".equals(this.f241409a.mo120959f("sendTo", (String) null))) {
                this.f241410b.mo109676w(fVar);
            } else {
                this.f241410b.mo109669n(fVar, (int[]) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b$c */
    public class C82362c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f241411d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241412e;

        public C82362c(C82359b bVar, C86493v0.C86495c cVar, C82520h hVar) {
            this.f241411d = cVar;
            this.f241412e = hVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f241411d.mo120960g("clickable")) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("MicroMsg.JsApiInsertTextView", "onClick");
            C82364e eVar = new C82364e((C82360a) null);
            HashMap hashMap = new HashMap();
            hashMap.put("data", this.f241411d.mo120959f("data", ""));
            eVar.mo115165o(hashMap);
            if ("webview".equals(this.f241411d.mo120959f("sendTo", (String) null))) {
                this.f241412e.mo109676w(eVar);
            } else {
                this.f241412e.mo109669n(eVar, (int[]) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b$d */
    public class C82363d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f241413d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241414e;

        /* renamed from: f */
        public final /* synthetic */ int f241415f;

        public C82363d(C82359b bVar, C86493v0.C86495c cVar, C82520h hVar, int i) {
            this.f241413d = cVar;
            this.f241414e = hVar;
            this.f241415f = i;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            C80049e.m97328a(this.f241414e, view2, this.f241415f, motionEvent2, this.f241413d.mo120959f("data", ""), "webview".equals(this.f241413d.mo120959f("sendTo", (String) null)));
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b$e */
    public static class C82364e extends C82919r2 {
        private static final int CTRL_INDEX = 256;
        private static final String NAME = "onTextViewClick";

        public C82364e(C82360a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.b$f */
    public static class C82365f extends C82919r2 {
        private static final int CTRL_INDEX = 840;
        private static final String NAME = "onTextViewDrag";
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        Context context = hVar.getContext();
        return new CoverViewContainer(context, (View) new C84931f(context));
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        boolean z;
        C84931f fVar;
        C82359b bVar;
        CoverViewContainer coverViewContainer;
        int optInt;
        C82520h hVar2 = hVar;
        int i2 = i;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        Log.m105919d("MicroMsg.JsApiInsertTextView", "onInsertView(viewId : %s, %s)", Integer.valueOf(i), jSONObject2);
        CoverViewContainer coverViewContainer2 = (CoverViewContainer) view2;
        C84931f fVar2 = (C84931f) coverViewContainer2.mo114736d(C84931f.class);
        if (fVar2 == null) {
            Log.m105929w("MicroMsg.JsApiInsertTextView", "onInsertView(viewId : %d) failed, targetView is null", Integer.valueOf(i));
            return;
        }
        boolean optBoolean = jSONObject2.optBoolean("clickable");
        boolean optBoolean2 = jSONObject2.optBoolean("transEvt");
        boolean optBoolean3 = jSONObject2.optBoolean("gesture");
        boolean optBoolean4 = jSONObject2.optBoolean("draggable", false);
        String optString = jSONObject2.optString("sendTo", "appservice");
        CoverViewContainer coverViewContainer3 = coverViewContainer2;
        String optString2 = jSONObject2.optString("data", "");
        String str = "MicroMsg.JsApiInsertTextView";
        C90251c.m112986b(fVar2, jSONObject2.optJSONObject("label"));
        C90249b.m112984a(fVar2, jSONObject2);
        C90266f.m112997a(view2, jSONObject2.optJSONObject("style"));
        C84931f fVar3 = fVar2;
        C86493v0.C86495c a = hVar2.mo109649c(jSONObject2.optBoolean("independent", false)).mo86860a(i2, true);
        a.mo120962i("data", optString2);
        a.mo120962i("sendTo", optString);
        a.mo120962i("transEvt", Boolean.valueOf(optBoolean2));
        a.mo120962i("clickable", Boolean.valueOf(optBoolean));
        boolean optBoolean5 = jSONObject2.optBoolean("independent", false);
        int i3 = -1;
        if (!optBoolean5 || (optInt = jSONObject2.optInt("parentId", 0)) == 0) {
            z = false;
        } else {
            z = ((C83873p2) hVar2.mo109649c(optBoolean5)).mo116440r(optInt);
            i3 = ((C83873p2) hVar2.mo109649c(optBoolean5)).mo116435m(optInt);
        }
        String str2 = str;
        Log.m105925i(str2, "clickable:%b, gesture:%b, draggable:%b， independent:%b, isParentCanDrag:%b", Boolean.valueOf(optBoolean), Boolean.valueOf(optBoolean3), Boolean.valueOf(optBoolean4), Boolean.valueOf(optBoolean5), Boolean.valueOf(z));
        if (!optBoolean5 || (!z && !optBoolean4)) {
            bVar = this;
            Log.m105924i(str2, "targetView setOnClickListener");
            fVar = fVar3;
            fVar.setOnClickListener(new C82362c(bVar, a, hVar2));
            fVar.setClickable(optBoolean);
        } else {
            Log.m105924i(str2, "CoverViewContainer setOnClickListener");
            if (optBoolean) {
                coverViewContainer = coverViewContainer3;
                coverViewContainer.f241375q = i2;
                coverViewContainer.f241376r = i3;
                coverViewContainer.setIsInterceptEvent(true);
                bVar = this;
                coverViewContainer.setOnCustomerClickListener(new C82360a(bVar, a, hVar2));
            } else {
                bVar = this;
                coverViewContainer = coverViewContainer3;
            }
            coverViewContainer.setDragEventCallback(new C82361b(bVar, a, hVar2));
            fVar = fVar3;
        }
        if (!optBoolean && optBoolean3 && !optBoolean4) {
            view.setDuplicateParentStateEnabled(true);
            fVar.setDuplicateParentStateEnabled(true);
            fVar.setOnTouchListener(new C82363d(bVar, a, hVar2, i2));
        }
    }
}
