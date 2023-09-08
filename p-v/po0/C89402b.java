package po0;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.KeyEvent;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81974j3;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Formatter;
import java.util.Locale;
import jy3.C117370c;
import jy3.C88045a;
import ny3.C89104m;
import p224ra.C89909e;
import p830xc.C91165a;
import p975hd.C87476a;
import qo0.C89727c;
import qo0.C89730d;
import qo0.C89740f;
import qo0.C89750q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: po0.b */
public final class C89402b {

    /* renamed from: m */
    public static final C62411c f257404m = new C62411c((C8480h) null);

    /* renamed from: n */
    public static final /* synthetic */ C89104m<Object>[] f257405n;

    /* renamed from: a */
    public final C91165a f257406a;

    /* renamed from: b */
    public final C82381f f257407b;

    /* renamed from: c */
    public final C62412m f257408c;

    /* renamed from: d */
    public final C89727c f257409d;

    /* renamed from: e */
    public final C117370c f257410e = new C89406e(Boolean.TRUE, this);

    /* renamed from: f */
    public String f257411f;

    /* renamed from: g */
    public boolean f257412g;

    /* renamed from: h */
    public boolean f257413h;

    /* renamed from: i */
    public final C117370c f257414i;

    /* renamed from: j */
    public final C89409h f257415j;

    /* renamed from: k */
    public final C89411i f257416k;

    /* renamed from: l */
    public final C13601g f257417l;

    /* renamed from: po0.b$c */
    public static final class C62411c {
        public C62411c(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo87462a(int i) {
            StringBuilder sb = new StringBuilder();
            Formatter formatter = new Formatter(sb, Locale.getDefault());
            int i2 = i / 1000;
            sb.setLength(0);
            String formatter2 = formatter.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(i2 / 3600), Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60)}).toString();
            C87412m.m108593f(formatter2, "formatter.format(\"%02d:%…utes, seconds).toString()");
            return formatter2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo87463b(java.lang.String r8) {
            /*
                r7 = this;
                java.lang.String r8 = java.lang.String.valueOf(r8)
                java.lang.String r1 = "."
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r8
                int r0 = z04.C112550d0.m153772H(r0, r1, r2, r3, r4, r5)
                r6 = 0
                r1 = -1
                if (r0 == r1) goto L_0x0028
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                java.lang.String r1 = "."
                r0 = r8
                int r0 = z04.C112550d0.m153772H(r0, r1, r2, r3, r4, r5)
                java.lang.String r8 = r8.substring(r6, r0)
                java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r8, r0)
            L_0x0028:
                z04.k r0 = new z04.k
                java.lang.String r1 = ":"
                r0.<init>((java.lang.String) r1)
                java.util.List r0 = r0.mo90760e(r8, r6)
                boolean r1 = r0.isEmpty()
                r2 = 1
                if (r1 != 0) goto L_0x0063
                int r1 = r0.size()
                java.util.ListIterator r1 = r0.listIterator(r1)
            L_0x0042:
                boolean r3 = r1.hasPrevious()
                if (r3 == 0) goto L_0x0063
                java.lang.Object r3 = r1.previous()
                java.lang.String r3 = (java.lang.String) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0056
                r3 = 1
                goto L_0x0057
            L_0x0056:
                r3 = 0
            L_0x0057:
                if (r3 != 0) goto L_0x0042
                int r1 = r1.nextIndex()
                int r1 = r1 + r2
                java.util.List r0 = sx3.C110818d0.m150947s0(r0, r1)
                goto L_0x0065
            L_0x0063:
                sx3.f0 r0 = sx3.C64186f0.f181907d
            L_0x0065:
                java.lang.String[] r1 = new java.lang.String[r6]
                java.lang.Object[] r0 = r0.toArray(r1)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r0, r1)
                java.lang.String[] r0 = (java.lang.String[]) r0
                int r1 = r0.length
                r3 = 3
                if (r1 != r3) goto L_0x0078
                r1 = 1
                goto L_0x0079
            L_0x0078:
                r1 = 0
            L_0x0079:
                if (r1 == 0) goto L_0x00a0
                r8 = r0[r6]
                long r3 = java.lang.Long.parseLong(r8)
                r8 = 3600(0xe10, float:5.045E-42)
                long r5 = (long) r8
                long r3 = r3 * r5
                r8 = r0[r2]
                long r1 = java.lang.Long.parseLong(r8)
                r8 = 60
                long r5 = (long) r8
                long r1 = r1 * r5
                long r3 = r3 + r1
                r8 = 2
                r8 = r0[r8]
                long r0 = java.lang.Long.parseLong(r8)
                long r3 = r3 + r0
                r8 = 1000(0x3e8, float:1.401E-42)
                long r0 = (long) r8
                long r3 = r3 * r0
                return r3
            L_0x00a0:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Can't parse time string: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: po0.C89402b.C62411c.mo87463b(java.lang.String):long");
        }
    }

    /* renamed from: po0.b$a */
    public static final class C89403a implements C82531i.C82535d {

        /* renamed from: d */
        public final /* synthetic */ C89402b f257418d;

        public C89403a(C89402b bVar) {
            this.f257418d = bVar;
        }

        /* renamed from: c */
        public final void mo22090c() {
            C89402b bVar = this.f257418d;
            ((C88045a) bVar.f257410e).mo122487d(bVar, C89402b.f257405n[0], Boolean.TRUE);
        }
    }

    /* renamed from: po0.b$b */
    public static final class C89404b implements C82531i.C82533b {

        /* renamed from: d */
        public final /* synthetic */ C89402b f257419d;

        public C89404b(C89402b bVar) {
            this.f257419d = bVar;
        }

        /* renamed from: b */
        public final void mo22089b() {
            C89402b bVar = this.f257419d;
            ((C88045a) bVar.f257410e).mo122487d(bVar, C89402b.f257405n[0], Boolean.FALSE);
        }
    }

    /* renamed from: po0.b$d */
    public static final class C89405d extends C87413o implements C32224a<AudioManager> {

        /* renamed from: d */
        public static final C89405d f257420d = new C89405d();

        public C89405d() {
            super(0);
        }

        public Object invoke() {
            return (AudioManager) MMApplicationContext.getContext().getSystemService("audio");
        }
    }

    /* renamed from: po0.b$e */
    public static final class C89406e extends C88045a<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ C89402b f257421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89406e(Object obj, C89402b bVar) {
            super(obj);
            this.f257421b = bVar;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Boolean bool, Boolean bool2) {
            C87412m.m108594g(mVar, "property");
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool.booleanValue();
            Log.m105924i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "isForeground = " + booleanValue + ' ');
            if (booleanValue && !booleanValue2) {
                this.f257421b.mo123733b().mo124051h();
            }
            if (!booleanValue && !booleanValue2) {
                C89750q b = this.f257421b.mo123733b();
                if (b.f258105p.stopped()) {
                    b.f258104o = false;
                    b.f258105p.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            }
        }
    }

    /* renamed from: po0.b$f */
    public static final class C89407f extends C88045a<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ C89402b f257422b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89407f(Object obj, C89402b bVar) {
            super(obj);
            this.f257422b = bVar;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, Boolean bool, Boolean bool2) {
            C87412m.m108594g(mVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (booleanValue) {
                C89402b bVar = this.f257422b;
                if (((Boolean) ((C88045a) bVar.f257410e).mo122486c(bVar, C89402b.f257405n[0])).booleanValue()) {
                    C89402b bVar2 = this.f257422b;
                    AppBrandRuntime a = bVar2.mo123732a();
                    if (a != null) {
                        a.mo113057h(25, -1, bVar2.f257415j);
                    }
                    AppBrandRuntime a2 = bVar2.mo123732a();
                    if (a2 != null) {
                        a2.mo113057h(24, -1, bVar2.f257416k);
                    }
                    C89402b bVar3 = this.f257422b;
                    bVar3.getClass();
                    MMApplicationContext.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bVar3.f257408c);
                    return;
                }
            }
            C89402b bVar4 = this.f257422b;
            AppBrandRuntime a3 = bVar4.mo123732a();
            if (a3 != null) {
                a3.mo113016K0(bVar4.f257415j);
            }
            AppBrandRuntime a4 = bVar4.mo123732a();
            if (a4 != null) {
                a4.mo113016K0(bVar4.f257416k);
            }
            C89402b bVar5 = this.f257422b;
            bVar5.getClass();
            MMApplicationContext.getContext().getContentResolver().unregisterContentObserver(bVar5.f257408c);
        }
    }

    /* renamed from: po0.b$g */
    public static final class C89408g extends C87413o implements C32224a<C89750q> {

        /* renamed from: d */
        public final /* synthetic */ C89402b f257423d;

        /* renamed from: e */
        public final /* synthetic */ C87476a f257424e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89408g(C89402b bVar, C87476a aVar) {
            super(0);
            this.f257423d = bVar;
            this.f257424e = aVar;
        }

        public Object invoke() {
            C89402b bVar = this.f257423d;
            return new C89750q(bVar.f257406a, this.f257424e, bVar);
        }
    }

    /* renamed from: po0.b$h */
    public static final class C89409h extends C81974j3 {

        /* renamed from: c */
        public final /* synthetic */ C89402b f257425c;

        /* renamed from: po0.b$h$a */
        public static final class C89410a extends C87413o implements C32226l<C89740f<Integer>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89402b f257426d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89410a(C89402b bVar) {
                super(1);
                this.f257426d = bVar;
            }

            public Object invoke(Object obj) {
                C89740f fVar = (C89740f) obj;
                C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
                Log.m105924i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume now:" + fVar.f258050a);
                C89402b bVar = this.f257426d;
                C62411c cVar = C89402b.f257404m;
                C89750q b = bVar.mo123733b();
                T t = fVar.f258050a;
                C87412m.m108591d(t);
                b.mo124050g(((Number) t).intValue() - 1);
                return C13598b0.f38549a;
            }
        }

        public C89409h(C89402b bVar) {
            this.f257425c = bVar;
        }

        /* renamed from: a */
        public boolean mo107509a(KeyEvent keyEvent) {
            C87412m.m108594g(keyEvent, "event");
            Log.m105924i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume down");
            this.f257425c.mo123733b().mo124046c(new C89410a(this.f257425c));
            return true;
        }
    }

    /* renamed from: po0.b$i */
    public static final class C89411i extends C81974j3 {

        /* renamed from: c */
        public final /* synthetic */ C89402b f257427c;

        /* renamed from: po0.b$i$a */
        public static final class C89412a extends C87413o implements C32226l<C89740f<Integer>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89402b f257428d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89412a(C89402b bVar) {
                super(1);
                this.f257428d = bVar;
            }

            public Object invoke(Object obj) {
                C89740f fVar = (C89740f) obj;
                C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
                Log.m105924i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume now:" + fVar.f258050a);
                C89402b bVar = this.f257428d;
                C62411c cVar = C89402b.f257404m;
                C89750q b = bVar.mo123733b();
                T t = fVar.f258050a;
                C87412m.m108591d(t);
                b.mo124050g(((Number) t).intValue() + 1);
                return C13598b0.f38549a;
            }
        }

        public C89411i(C89402b bVar) {
            this.f257427c = bVar;
        }

        /* renamed from: a */
        public boolean mo107509a(KeyEvent keyEvent) {
            C87412m.m108594g(keyEvent, "event");
            Log.m105924i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume up");
            this.f257427c.mo123733b().mo124046c(new C89412a(this.f257427c));
            return true;
        }
    }

    static {
        Class<C89402b> cls = C89402b.class;
        f257405n = new C89104m[]{C24560g0.m30726b(new C24570s(cls, "isForeground", "isForeground()Z", 0)), C24560g0.m30726b(new C24570s(cls, "isCastMediaPresent", "isCastMediaPresent()Z", 0))};
    }

    public C89402b(C87476a aVar, C91165a aVar2) {
        C83780d1 pageView;
        C87412m.m108594g(aVar, "eventHandler");
        C87412m.m108594g(aVar2, "invokeContext");
        this.f257406a = aVar2;
        C82381f g = aVar2.mo62544g();
        C87412m.m108593f(g, "invokeContext.component");
        this.f257407b = g;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        String str = null;
        this.f257408c = new C62412m(context, (Handler) null);
        C36568h.m40985a(C89405d.f257420d);
        C89727c cVar = (C89727c) C89909e.m112436a(C89727c.class);
        this.f257409d = cVar;
        AppBrandRuntime a = C89730d.m112186a(aVar2);
        if (cVar != null) {
            String str2 = a.f238147j;
            C87412m.m108593f(str2, "appBrandRuntime.appId");
            cVar.setAppId(str2);
            C83849m0 Z = a.mo113042Z();
            if (!(Z == null || (pageView = Z.getPageView()) == null)) {
                str = pageView.mo116162Q0();
            }
            cVar.wl0(str == null ? "" : str);
        }
        if (g instanceof C82520h) {
            ((C82520h) g).mo114868y(new C89403a(this));
            ((C82520h) g).mo114864j(new C89404b(this));
        }
        this.f257411f = "";
        this.f257414i = new C89407f(Boolean.FALSE, this);
        this.f257415j = new C89409h(this);
        this.f257416k = new C89411i(this);
        this.f257417l = C36568h.m40985a(new C89408g(this, aVar));
    }

    /* renamed from: a */
    public final AppBrandRuntime mo123732a() {
        C91165a aVar = this.f257406a;
        if (aVar instanceof C81823b) {
            C82381f g = ((C81823b) aVar).mo62544g();
            if (g == null) {
                return null;
            }
            if (g instanceof C81879g) {
                return ((C81879g) g).getRuntime();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final C89750q mo123733b() {
        return (C89750q) ((C36570n) this.f257417l).getValue();
    }

    /* renamed from: c */
    public final void mo123734c(boolean z) {
        ((C88045a) this.f257414i).mo122487d(this, f257405n[1], Boolean.valueOf(z));
    }
}
