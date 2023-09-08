package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.libmmwebrtc.MMWebRTCBinding;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83090m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jk0.C87978d;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IRenderer;
import org.webrtc.PerformanceStatistics;
import org.webrtc.RendererCommon;
import org.webrtc.VideoSink;
import p1044ub.C90630c;
import p284zb.C91635f;
import p284zb.C91640i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c */
public class C83069c extends C87978d<C90630c> {
    public static final int CTRL_INDEX = 1117;
    public static final String NAME = "insertWebRTCRendererView";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$c */
    public enum C55534c {
        Surface,
        Texture
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$a */
    public final class C83070a extends FrameLayout implements C83068b {

        /* renamed from: d */
        public VideoSink f242823d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83070a(C83069c cVar, Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: a */
        public VideoSink mo115316a() {
            return this.f242823d;
        }

        public final VideoSink getVideoSink() {
            return this.f242823d;
        }

        public final void setVideoSink(VideoSink videoSink) {
            this.f242823d = videoSink;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$b */
    public static final class C83071b extends C82919r2 {
        public static final int CTRL_INDEX = 1120;
        public static final String NAME = "onWebRTCLoadedMetaData";
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$d */
    public static final class C83072d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f242824d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f242825e;

        /* renamed from: f */
        public final /* synthetic */ C90630c f242826f;

        public C83072d(View view, JSONObject jSONObject, C90630c cVar) {
            this.f242824d = view;
            this.f242825e = jSONObject;
            this.f242826f = cVar;
        }

        public final void run() {
            C83090m.C83091a aVar;
            View view = this.f242824d;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.IWebRTCVideoSinkProvider");
            VideoSink a = ((C83068b) view).mo115316a();
            if (a != null) {
                aVar = C83090m.f242865a.mo115333a(this.f242825e, a, this.f242826f, C83090m.C83092b.AddOrUpdate);
                Log.m105924i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: webrtc update webrtc video sink with errcode " + aVar);
            } else {
                aVar = null;
            }
            Log.m105924i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: webrtc add result is " + aVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$e */
    public static final class C83073e implements RendererCommon.RendererEvents {

        /* renamed from: d */
        public final /* synthetic */ C83069c f242827d;

        /* renamed from: e */
        public final /* synthetic */ C90630c f242828e;

        /* renamed from: f */
        public final /* synthetic */ int f242829f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$e$a */
        public static final class C83074a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C90630c f242830d;

            /* renamed from: e */
            public final /* synthetic */ PerformanceStatistics f242831e;

            public C83074a(C90630c cVar, PerformanceStatistics performanceStatistics) {
                this.f242830d = cVar;
                this.f242831e = performanceStatistics;
            }

            public final void run() {
                MMWebRTCBinding mMWebRTCBinding;
                C91640i<? extends C91635f> iVar = this.f242830d.mo116160O0().f262593H;
                synchronized (iVar) {
                    mMWebRTCBinding = iVar.f262601g;
                }
                if (mMWebRTCBinding != null) {
                    mMWebRTCBinding.onRenderStats(this.f242831e);
                }
            }
        }

        public C83073e(C83069c cVar, C90630c cVar2, int i) {
            this.f242827d = cVar;
            this.f242828e = cVar2;
            this.f242829f = i;
        }

        public void onFirstFrameRendered() {
            this.f242827d.mo115319K(this.f242828e, this.f242829f);
        }

        public void onFrameResolutionChanged(int i, int i2, int i3) {
            Log.m105924i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: onFrameResolutionChanged " + i + " * " + i2);
        }

        public void onRenderStats(PerformanceStatistics performanceStatistics) {
            C83165i jsRuntime;
            C83181q qVar;
            C87412m.m108594g(performanceStatistics, "performanceStatistics");
            Log.m105924i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: current render stats: " + performanceStatistics);
            C91635f D1 = this.f242828e.mo116160O0();
            if (D1 != null && (jsRuntime = D1.getJsRuntime()) != null && (qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class)) != null) {
                qVar.post(new C83074a(this.f242828e, performanceStatistics));
            }
        }
    }

    /* renamed from: A */
    public Boolean mo115317A(JSONObject jSONObject) {
        Boolean bool = null;
        if (jSONObject != null) {
            try {
                bool = Boolean.valueOf(jSONObject.getBoolean("underGameView"));
            } catch (JSONException unused) {
            }
        }
        Log.m105924i("MicroMsg.JsApiInsertWebRTCRendererView", "getUnderView " + bool);
        return bool;
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        C90630c cVar = (C90630c) hVar;
        if (cVar == null) {
            return null;
        }
        Context context = cVar.getContext();
        C87412m.m108593f(context, "component.context");
        C83070a aVar = new C83070a(this, context);
        aVar.setBackgroundColor(-1);
        return aVar;
    }

    /* renamed from: J */
    public C55534c mo115318J() {
        return C55534c.Texture;
    }

    /* renamed from: K */
    public void mo115319K(C90630c cVar, int i) {
        C87412m.m108594g(cVar, "component");
        Log.m105924i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: on first frame rendered " + i);
        C83071b bVar = new C83071b();
        bVar.mo115161k(cVar.mo116160O0());
        bVar.mo115164n("viewId", Integer.valueOf(i));
        bVar.mo115158h();
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [org.webrtc.TextureViewRenderer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22378H(p1044ub.C90630c r6, int r7, android.view.View r8, org.json.JSONObject r9) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hy: try insert webrtc view "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.JsApiInsertWebRTCRendererView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r6 == 0) goto L_0x008e
            r0 = 0
            int[] r1 = org.webrtc.EglBase.CONFIG_PLAIN
            org.webrtc.EglBase r0 = org.webrtc.EglBase.EglBaseStatic.create(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$c r2 = r5.mo115318J()
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x003c
            r3 = 1
            if (r2 != r3) goto L_0x0036
            org.webrtc.TextureViewRenderer r2 = new org.webrtc.TextureViewRenderer
            android.content.Context r3 = r6.getContext()
            r2.<init>(r3)
            goto L_0x0045
        L_0x0036:
            rx3.j r6 = new rx3.j
            r6.<init>()
            throw r6
        L_0x003c:
            org.webrtc.SurfaceViewRenderer r2 = new org.webrtc.SurfaceViewRenderer
            android.content.Context r3 = r6.getContext()
            r2.<init>(r3)
        L_0x0045:
            gy3.C87412m.m108591d(r0)
            org.webrtc.EglBase$Context r0 = r0.getEglBaseContext()
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$e r3 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$e
            r3.<init>(r5, r6, r7)
            org.webrtc.GlRectDrawer r4 = new org.webrtc.GlRectDrawer
            r4.<init>()
            r2.init(r0, r3, r1, r4)
            r5.mo115321M(r6, r2, r7)
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiInsertWebRTCRendererView.HolderView"
            gy3.C87412m.m108592e(r8, r7)
            r7 = r8
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$a r7 = (com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83069c.C83070a) r7
            r7.setVideoSink(r2)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r7.addView(r2, r0)
            zb.f r7 = r6.mo116160O0()
            if (r7 == 0) goto L_0x008e
            com.tencent.mm.plugin.appbrand.jsruntime.i r7 = r7.getJsRuntime()
            if (r7 == 0) goto L_0x008e
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.q> r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r7 = r7.mo63321n0(r0)
            com.tencent.mm.plugin.appbrand.jsruntime.q r7 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q) r7
            if (r7 == 0) goto L_0x008e
            com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$d r0 = new com.tencent.mm.plugin.appbrand.jsapi.webrtc.c$d
            r0.<init>(r8, r9, r6)
            r7.post(r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83069c.mo22378H(ub.c, int, android.view.View, org.json.JSONObject):void");
    }

    /* renamed from: M */
    public void mo115321M(C90630c cVar, IRenderer iRenderer, int i) {
        C87412m.m108594g(iRenderer, "renderView");
    }

    /* renamed from: w */
    public void mo115322w(C82381f fVar, JSONObject jSONObject) {
        C87412m.m108594g(fVar, "component");
        ((C90630c) fVar).mo116160O0().f262593H.mo122607I0();
    }
}
