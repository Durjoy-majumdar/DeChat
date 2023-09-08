package e00;

import android.content.Intent;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.webview.core.C43519u;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import d93.C45310h;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: e00.t */
public interface C45520t {

    /* renamed from: e00.t$a */
    public static final class C45521a {
        /* renamed from: a */
        public static /* synthetic */ void m50512a(C45520t tVar, String str, Map map, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                tVar.mo67754x(str, map, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUrl");
        }
    }

    /* renamed from: e00.t$c */
    public static final class C45523c {

        /* renamed from: a */
        public final C13601g f123186a;

        /* renamed from: b */
        public final C13601g f123187b;

        /* renamed from: c */
        public final C13601g f123188c;

        /* renamed from: e00.t$c$a */
        public static final class C45524a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ Intent f123189d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45524a(Intent intent) {
                super(0);
                this.f123189d = intent;
            }

            public Object invoke() {
                return Boolean.valueOf(this.f123189d.getBooleanExtra("useJs", true));
            }
        }

        /* renamed from: e00.t$c$b */
        public static final class C45525b extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ Intent f123190d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45525b(Intent intent) {
                super(0);
                this.f123190d = intent;
            }

            public Object invoke() {
                return Boolean.valueOf(this.f123190d.getBooleanExtra("usePlugin", true));
            }
        }

        /* renamed from: e00.t$c$c */
        public static final class C45526c extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ Intent f123191d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45526c(Intent intent) {
                super(0);
                this.f123191d = intent;
            }

            public Object invoke() {
                return Boolean.valueOf(this.f123191d.getBooleanExtra("vertical_scroll", true));
            }
        }

        /* renamed from: e00.t$c$d */
        public static final class C45527d extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public final /* synthetic */ Intent f123192d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45527d(Intent intent) {
                super(0);
                this.f123192d = intent;
            }

            public Object invoke() {
                return Boolean.valueOf(this.f123192d.getBooleanExtra(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, true));
            }
        }

        public C45523c(Intent intent) {
            C87412m.m108594g(intent, "intent");
            C36568h.m40985a(new C45525b(intent));
            this.f123186a = C36568h.m40985a(new C45527d(intent));
            this.f123187b = C36568h.m40985a(new C45524a(intent));
            this.f123188c = C36568h.m40985a(new C45526c(intent));
        }
    }

    /* renamed from: E */
    C45310h mo67669E();

    /* renamed from: F */
    void mo67671F(C43519u uVar);

    /* renamed from: G */
    boolean mo67673G();

    /* renamed from: H */
    void mo67675H(float f);

    /* renamed from: I */
    void mo67677I(Intent intent);

    /* renamed from: S */
    String mo67694S(String str);

    /* renamed from: e */
    boolean mo67714e();

    /* renamed from: e3 */
    String mo67716e3();

    /* renamed from: g */
    int mo67719g();

    String getCurrentUrl();

    Object getWebViewPluginClientProxy();

    /* renamed from: h */
    void mo67723h(C43519u uVar);

    /* renamed from: i */
    void mo67725i(float f);

    void init();

    /* renamed from: m */
    C43791l mo67731m();

    /* renamed from: n */
    void mo67733n(String str);

    /* renamed from: n0 */
    String mo63683n0();

    /* renamed from: o */
    String mo67734o();

    void onDestroy();

    /* renamed from: p */
    void mo67741p(C43558z zVar);

    /* renamed from: q */
    C7580y mo67743q();

    void reload();

    /* renamed from: s */
    void mo67747s(float f);

    /* renamed from: x */
    void mo67754x(String str, Map<String, String> map, boolean z);

    /* renamed from: y */
    void mo67756y(C43558z zVar);

    /* renamed from: z */
    int mo67758z();

    /* renamed from: e00.t$b */
    public static final class C45522b {

        /* renamed from: a */
        public final C45523c f123179a;

        /* renamed from: b */
        public final boolean f123180b;

        /* renamed from: c */
        public final boolean f123181c;

        /* renamed from: d */
        public final boolean f123182d;

        /* renamed from: e */
        public final boolean f123183e;

        /* renamed from: f */
        public int f123184f;

        /* renamed from: g */
        public final boolean f123185g;

        public C45522b(C45523c cVar, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
            C87412m.m108594g(cVar, "webView");
            this.f123179a = cVar;
            this.f123180b = z;
            this.f123181c = z2;
            this.f123182d = z3;
            this.f123183e = z4;
            this.f123184f = i;
            this.f123185g = z5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C45522b(e00.C45520t.C45523c r9, boolean r10, boolean r11, boolean r12, boolean r13, int r14, boolean r15, int r16, gy3.C8480h r17) {
            /*
                r8 = this;
                r0 = r16 & 1
                if (r0 == 0) goto L_0x000f
                e00.t$c r0 = new e00.t$c
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                r0.<init>(r1)
                goto L_0x0010
            L_0x000f:
                r0 = r9
            L_0x0010:
                r1 = r16 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0017
                r1 = 0
                goto L_0x0018
            L_0x0017:
                r1 = r10
            L_0x0018:
                r3 = r16 & 4
                r4 = 1
                if (r3 == 0) goto L_0x001f
                r3 = 1
                goto L_0x0020
            L_0x001f:
                r3 = r11
            L_0x0020:
                r5 = r16 & 8
                if (r5 == 0) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r4 = r12
            L_0x0026:
                r5 = r16 & 16
                if (r5 == 0) goto L_0x002c
                r5 = 0
                goto L_0x002d
            L_0x002c:
                r5 = r13
            L_0x002d:
                r6 = r16 & 32
                if (r6 == 0) goto L_0x0033
                r6 = 0
                goto L_0x0034
            L_0x0033:
                r6 = r14
            L_0x0034:
                r7 = r16 & 64
                if (r7 == 0) goto L_0x0039
                goto L_0x003a
            L_0x0039:
                r2 = r15
            L_0x003a:
                r9 = r8
                r10 = r0
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r16 = r2
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e00.C45520t.C45522b.<init>(e00.t$c, boolean, boolean, boolean, boolean, int, boolean, int, gy3.h):void");
        }
    }
}
