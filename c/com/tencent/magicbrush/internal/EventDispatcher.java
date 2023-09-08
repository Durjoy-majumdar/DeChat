package com.tencent.magicbrush.internal;

import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p416qd.C89598h;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0007¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/magicbrush/internal/EventDispatcher;", "", "", "exception", "stack", "", "contextId", "Lrx3/b0;", "onJSError", "output", "onConsole", "windowId", "onFirstFrameRendered", "virtualElementId", "type", "onScreenCanvasRenderingContextCreated", "lib-magicbrush-nano_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class EventDispatcher {

    /* renamed from: a */
    public final C80301a f235115a;

    /* renamed from: com.tencent.magicbrush.internal.EventDispatcher$a */
    public static final class C80310a extends C87413o implements C32226l<C80301a.C80304c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f235116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80310a(String str) {
            super(1);
            this.f235116d = str;
        }

        public Object invoke(Object obj) {
            C80301a.C80304c cVar = (C80301a.C80304c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            cVar.mo111583c(this.f235116d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.magicbrush.internal.EventDispatcher$b */
    public static final class C80311b extends C87413o implements C32226l<C80301a.C80302a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f235117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80311b(int i) {
            super(1);
            this.f235117d = i;
        }

        public Object invoke(Object obj) {
            C80301a.C80302a aVar = (C80301a.C80302a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            aVar.mo111581b(this.f235117d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.magicbrush.internal.EventDispatcher$c */
    public static final class C80312c extends C87413o implements C32226l<C80301a.C80304c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f235118d;

        /* renamed from: e */
        public final /* synthetic */ String f235119e;

        /* renamed from: f */
        public final /* synthetic */ int f235120f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80312c(String str, String str2, int i) {
            super(1);
            this.f235118d = str;
            this.f235119e = str2;
            this.f235120f = i;
        }

        public Object invoke(Object obj) {
            C80301a.C80304c cVar = (C80301a.C80304c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            cVar.mo111582a(this.f235118d, this.f235119e, this.f235120f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.magicbrush.internal.EventDispatcher$d */
    public static final class C80313d extends C87413o implements C32226l<MagicBrushView.C80326g, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f235121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80313d(int i) {
            super(1);
            this.f235121d = i;
        }

        public Object invoke(Object obj) {
            MagicBrushView.C80326g gVar = (MagicBrushView.C80326g) obj;
            C87412m.m108594g(gVar, LocaleUtil.ITALIAN);
            gVar.mo111661a(this.f235121d);
            return C13598b0.f38549a;
        }
    }

    public EventDispatcher(C80301a aVar) {
        C87412m.m108594g(aVar, "magicbrush");
        this.f235115a = aVar;
    }

    public final void onConsole(String str) {
        C87412m.m108594g(str, "output");
        try {
            this.f235115a.f235094j.mo125231c(new C80310a(str));
        } catch (Exception e) {
            C89598h.m112046c("MagicBrush", e, "dispatch event failed", new Object[0]);
        }
    }

    public final void onFirstFrameRendered(int i) {
        try {
            this.f235115a.f235095k.mo125231c(new C80311b(i));
        } catch (Exception e) {
            C89598h.m112046c("MagicBrush", e, "dispatch event failed", new Object[0]);
        }
    }

    public final void onJSError(String str, String str2, int i) {
        C87412m.m108594g(str, "exception");
        C87412m.m108594g(str2, "stack");
        try {
            this.f235115a.f235094j.mo125231c(new C80312c(str, str2, i));
        } catch (Exception e) {
            C89598h.m112046c("MagicBrush", e, "dispatch event failed", new Object[0]);
        }
    }

    public final void onScreenCanvasRenderingContextCreated(int i, int i2) {
        try {
            this.f235115a.f235096l.find(i).getRenderingContextListeners().mo125232d(new C80313d(i2));
        } catch (Exception e) {
            C89598h.m112044a("MagicBrush", "onScreenCanvasRenderingContextCreated error: " + e, new Object[0]);
        }
    }
}
