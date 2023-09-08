package com.tencent.p014mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import cl0.C80047b;
import cl0.C80049e;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.C82359b;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import eb0.C86493v0;
import ht0.C87586a;
import ht0.C87587b;
import ht0.C87590e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import jk0.C87978d;
import org.json.JSONObject;
import p224ra.C89909e;
import sn0.C90249b;
import sn0.C90251c;
import sn0.C90266f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.a */
public class C82353a extends C87978d {
    private static final int CTRL_INDEX = 253;
    public static final String NAME = "insertImageView";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.a$a */
    public class C82354a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f241398d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241399e;

        public C82354a(C82353a aVar, C86493v0.C86495c cVar, C82520h hVar) {
            this.f241398d = cVar;
            this.f241399e = hVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.JsApiInsertImageView", "onClick");
            C82358e eVar = new C82358e((C82354a) null);
            HashMap hashMap = new HashMap();
            hashMap.put("data", this.f241398d.mo120959f("data", ""));
            eVar.mo115165o(hashMap);
            if ("webview".equals(this.f241398d.mo120959f("sendTo", (String) null))) {
                this.f241399e.mo109676w(eVar);
            } else {
                this.f241399e.mo109669n(eVar, (int[]) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.a$b */
    public class C82355b implements CoverViewContainer.C82351a {

        /* renamed from: a */
        public final /* synthetic */ C86493v0.C86495c f241400a;

        /* renamed from: b */
        public final /* synthetic */ C82520h f241401b;

        public C82355b(C82353a aVar, C86493v0.C86495c cVar, C82520h hVar) {
            this.f241400a = cVar;
            this.f241401b = hVar;
        }

        /* renamed from: a */
        public void mo114754a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
            C82359b.C82365f fVar = new C82359b.C82365f();
            HashMap hashMap = new HashMap();
            hashMap.put("data", str2);
            hashMap.put(IXWebBroadcastListener.STAGE_TAG, str);
            hashMap.put("drag", jSONObject);
            hashMap.put("target", jSONObject2);
            fVar.mo115165o(hashMap);
            Log.m105925i("MicroMsg.JsApiInsertImageView", "callback stage:%s, drag:%s, data:%s, target:%s", str, jSONObject, str2, jSONObject2);
            if ("webview".equals(this.f241400a.mo120959f("sendTo", (String) null))) {
                this.f241401b.mo109676w(fVar);
            } else {
                this.f241401b.mo109669n(fVar, (int[]) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.a$c */
    public class C82356c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f241402d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241403e;

        public C82356c(C82353a aVar, C86493v0.C86495c cVar, C82520h hVar) {
            this.f241402d = cVar;
            this.f241403e = hVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f241402d.mo120960g("clickable")) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C82358e eVar = new C82358e((C82354a) null);
            HashMap hashMap = new HashMap();
            hashMap.put("data", this.f241402d.mo120959f("data", ""));
            eVar.mo115165o(hashMap);
            eVar.mo115161k(this.f241403e);
            if ("webview".equals(this.f241402d.mo120959f("sendTo", (String) null))) {
                this.f241403e.mo109676w(eVar);
            } else {
                this.f241403e.mo109669n(eVar, (int[]) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.a$d */
    public class C82357d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f241404d;

        /* renamed from: e */
        public final /* synthetic */ C82520h f241405e;

        /* renamed from: f */
        public final /* synthetic */ int f241406f;

        public C82357d(C82353a aVar, C86493v0.C86495c cVar, C82520h hVar, int i) {
            this.f241404d = cVar;
            this.f241405e = hVar;
            this.f241406f = i;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            C80049e.m97328a(this.f241405e, view2, this.f241406f, motionEvent2, this.f241404d.mo120959f("data", ""), "webview".equals(this.f241404d.mo120959f("sendTo", (String) null)));
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.a$e */
    public static class C82358e extends C82919r2 {
        private static final int CTRL_INDEX = 256;
        private static final String NAME = "onImageViewClick";

        public C82358e(C82354a aVar) {
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        Class cls = C87587b.class;
        Context context = hVar.getContext();
        C87586a RN = C89909e.m112436a(cls) != null ? ((C87587b) C89909e.m112436a(cls)).mo115840RN(context) : null;
        if (RN == null) {
            Log.m105920e("MicroMsg.JsApiInsertImageView", "view is null, may not support IGifCoverViewFactory.");
            RN = new C87590e(context);
        }
        RN.setScaleType(ImageView.ScaleType.FIT_XY);
        return new CoverViewContainer(context, RN.getView());
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        boolean z;
        C82353a aVar;
        CoverViewContainer coverViewContainer;
        String str;
        boolean z2;
        C82520h hVar2 = hVar;
        int i2 = i;
        View view2 = view;
        JSONObject jSONObject2 = jSONObject;
        Log.m105919d("MicroMsg.JsApiInsertImageView", "onInsertView(viewId : %s, %s)", Integer.valueOf(i), jSONObject2);
        CoverViewContainer coverViewContainer2 = (CoverViewContainer) view2;
        C87586a aVar2 = (C87586a) coverViewContainer2.mo114736d(C87586a.class);
        if (aVar2 == null) {
            Log.m105929w("MicroMsg.JsApiInsertImageView", "onInsertView(viewId : %d) failed, targetView is null", Integer.valueOf(i));
            return;
        }
        boolean optBoolean = jSONObject2.optBoolean("clickable");
        boolean optBoolean2 = jSONObject2.optBoolean("gesture");
        boolean optBoolean3 = jSONObject2.optBoolean("draggable", false);
        boolean optBoolean4 = jSONObject2.optBoolean("transEvt");
        String optString = jSONObject2.optString("sendTo", "appservice");
        CoverViewContainer coverViewContainer3 = coverViewContainer2;
        String optString2 = jSONObject2.optString("data", "");
        String str2 = "MicroMsg.JsApiInsertImageView";
        JSONObject optJSONObject = jSONObject2.optJSONObject("style");
        boolean z3 = optBoolean3;
        String str3 = "appservice";
        boolean z4 = optBoolean2;
        C86493v0.C86495c a = hVar2.mo109649c(jSONObject2.optBoolean("independent", false)).mo86860a(i2, true);
        a.mo120962i("data", optString2);
        a.mo120962i("sendTo", optString);
        a.mo120962i("transEvt", Boolean.valueOf(optBoolean4));
        a.mo120962i("clickable", Boolean.valueOf(optBoolean));
        aVar2.setKeyValueSet(a);
        C90266f.m112997a(view2, optJSONObject);
        C90251c.m112985a(hVar2, i2, aVar2, jSONObject2, new C80047b(i2, a, hVar2));
        C90249b.m112984a(aVar2.getView(), jSONObject2);
        boolean optBoolean5 = jSONObject2.optBoolean("independent", false);
        int i3 = -1;
        if (optBoolean5) {
            int optInt = jSONObject2.optInt("parentId", 0);
            if (optInt != 0) {
                z2 = ((C83873p2) hVar2.mo109649c(optBoolean5)).mo116440r(optInt);
                i3 = ((C83873p2) hVar2.mo109649c(optBoolean5)).mo116435m(optInt);
                str = str3;
            } else {
                str = str3;
                z2 = false;
            }
            a.mo120964k("sendTo", str);
            z = z2;
        } else {
            z = false;
        }
        String str4 = str2;
        Log.m105925i(str4, "clickable:%b, gesture:%b, draggable:%b， independent:%b, isParentCanDrag:%b", Boolean.valueOf(optBoolean), Boolean.valueOf(z4), Boolean.valueOf(z3), Boolean.valueOf(optBoolean5), Boolean.valueOf(z));
        if (!optBoolean5 || (!z && !z3)) {
            aVar = this;
            Log.m105924i(str4, "targetView setOnClickListener");
            aVar2.getView().setOnClickListener(new C82356c(aVar, a, hVar2));
            aVar2.getView().setClickable(optBoolean);
        } else {
            Log.m105924i(str4, "CoverViewContainer setOnClickListener");
            if (optBoolean) {
                coverViewContainer = coverViewContainer3;
                coverViewContainer.f241375q = i2;
                coverViewContainer.f241376r = i3;
                coverViewContainer.setIsInterceptEvent(true);
                aVar = this;
                coverViewContainer.setOnCustomerClickListener(new C82354a(aVar, a, hVar2));
            } else {
                aVar = this;
                coverViewContainer = coverViewContainer3;
            }
            coverViewContainer.setDragEventCallback(new C82355b(aVar, a, hVar2));
        }
        Log.m105925i(str4, "clickable:%b, gesture:%b, draggable:%b", Boolean.valueOf(optBoolean), Boolean.valueOf(z4), Boolean.valueOf(z3));
        if (!optBoolean && z4 && !z3) {
            view2.setDuplicateParentStateEnabled(true);
            aVar2.getView().setDuplicateParentStateEnabled(true);
            aVar2.getView().setOnTouchListener(new C82357d(aVar, a, hVar2, i2));
        }
    }
}
