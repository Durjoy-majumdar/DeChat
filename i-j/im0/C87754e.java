package im0;

import android.widget.RelativeLayout;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gt0.C87325b;
import js0.C88020k;
import org.json.JSONObject;
import p225rc.C89923l;

/* renamed from: im0.e */
public final class C87754e extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 104;
    private static final String NAME = "showModal";

    /* renamed from: im0.e$a */
    public class C87755a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81925i2 f254047d;

        /* renamed from: e */
        public final /* synthetic */ int f254048e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f254049f;

        public C87755a(C81925i2 i2Var, int i, JSONObject jSONObject) {
            this.f254047d = i2Var;
            this.f254048e = i;
            this.f254049f = jSONObject;
        }

        public void run() {
            Log.m105925i("MicroMsg.JsApiShowModal", "invoke after runtime initialized appId[%s] callbackId[%d]", this.f254047d.getAppId(), Integer.valueOf(this.f254048e));
            C87754e.this.mo1505u(this.f254047d, this.f254049f, this.f254048e);
        }
    }

    /* renamed from: im0.e$b */
    public class C87756b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81925i2 f254051d;

        /* renamed from: e */
        public final /* synthetic */ C83780d1 f254052e;

        /* renamed from: f */
        public final /* synthetic */ String f254053f;

        /* renamed from: g */
        public final /* synthetic */ String f254054g;

        /* renamed from: h */
        public final /* synthetic */ boolean f254055h;

        /* renamed from: i */
        public final /* synthetic */ String f254056i;

        /* renamed from: j */
        public final /* synthetic */ int f254057j;

        /* renamed from: n */
        public final /* synthetic */ boolean f254058n;

        /* renamed from: o */
        public final /* synthetic */ String f254059o;

        /* renamed from: p */
        public final /* synthetic */ int f254060p;

        /* renamed from: q */
        public final /* synthetic */ int f254061q;

        /* renamed from: r */
        public final /* synthetic */ JSONObject f254062r;

        public C87756b(C81925i2 i2Var, C83780d1 d1Var, String str, String str2, boolean z, String str3, int i, boolean z2, String str4, int i2, int i3, JSONObject jSONObject) {
            this.f254051d = i2Var;
            this.f254052e = d1Var;
            this.f254053f = str;
            this.f254054g = str2;
            this.f254055h = z;
            this.f254056i = str3;
            this.f254057j = i;
            this.f254058n = z2;
            this.f254059o = str4;
            this.f254060p = i2;
            this.f254061q = i3;
            this.f254062r = jSONObject;
        }

        /* JADX WARNING: type inference failed for: r1v19, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                com.tencent.mm.plugin.appbrand.i2 r0 = r6.f254051d
                boolean r0 = r0.isRunning()
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                com.tencent.mm.plugin.appbrand.page.d1 r0 = r6.f254052e
                com.tencent.mm.plugin.appbrand.page.i3 r0 = r0.f244557I
                com.tencent.mm.plugin.appbrand.page.c3 r1 = com.tencent.p014mm.plugin.appbrand.page.C1943c3.MODAL
                r0.mo111230d(r1)
                gt0.b r0 = new gt0.b
                com.tencent.mm.plugin.appbrand.i2 r1 = r6.f254051d
                android.content.Context r1 = r1.getContext()
                r0.<init>(r1)
                java.lang.String r1 = r6.f254053f
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x003c
                java.lang.String r1 = r6.f254054g
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x0037
                boolean r1 = r6.f254055h
                if (r1 != 0) goto L_0x0037
                java.lang.String r1 = r6.f254053f
                r0.mo107533r(r1)
                goto L_0x003c
            L_0x0037:
                java.lang.String r1 = r6.f254053f
                r0.setTitle((java.lang.CharSequence) r1)
            L_0x003c:
                java.lang.String r1 = r6.f254054g
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x004d
                boolean r1 = r6.f254055h
                if (r1 != 0) goto L_0x004d
                java.lang.String r1 = r6.f254054g
                r0.mo107533r(r1)
            L_0x004d:
                java.lang.String r1 = r6.f254056i
                im0.e$b$$b r2 = new im0.e$b$$b
                r2.<init>(r6, r0)
                r3 = 1
                r0.mo107542x(r1, r3, r2)
                boolean r1 = r6.f254058n
                r2 = 0
                if (r1 == 0) goto L_0x0067
                java.lang.String r1 = r6.f254059o
                im0.e$b$$c r3 = new im0.e$b$$c
                r3.<init>(r6)
                r0.mo107539t(r1, r2, r3)
            L_0x0067:
                im0.e$b$$d r1 = new im0.e$b$$d
                r1.<init>(r6)
                r0.setOnCancelListener(r1)
                int r1 = r6.f254060p
                r0.mo107543y(r1)
                boolean r1 = r6.f254058n
                if (r1 == 0) goto L_0x007d
                int r1 = r6.f254061q
                r0.mo107540u(r1)
            L_0x007d:
                boolean r1 = r6.f254055h
                r3 = 0
                if (r1 == 0) goto L_0x00cf
                android.widget.EditText r1 = r0.f225701r
                r1.setVisibility(r2)
                java.lang.String r1 = r6.f254054g
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x009c
                java.lang.String r1 = r6.f254054g
                android.widget.EditText r4 = r0.f225701r
                r4.setVisibility(r2)
                android.widget.EditText r4 = r0.f225701r
                r4.setText(r1)
                goto L_0x00b5
            L_0x009c:
                org.json.JSONObject r1 = r6.f254062r
                java.lang.String r4 = "placeholderText"
                java.lang.String r1 = r1.optString(r4)
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r4 != 0) goto L_0x00b5
                android.widget.EditText r4 = r0.f225701r
                r4.setVisibility(r2)
                android.widget.EditText r4 = r0.f225701r
                r4.setHint(r1)
            L_0x00b5:
                com.tencent.mm.plugin.appbrand.page.d1 r1 = r6.f254052e
                android.view.ViewGroup r1 = r1.f244552D
                com.tencent.mm.plugin.appbrand.widget.input.l0 r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C85004y.m104826e(r1)
                im0.e$c r4 = new im0.e$c
                com.tencent.mm.plugin.appbrand.i2 r5 = r6.f254051d
                r4.<init>(r0, r5, r3)
                r1.mo117844a(r4)
                im0.e$b$$e r5 = new im0.e$b$$e
                r5.<init>(r6, r1, r4)
                r0.setOnDismissListener(r5)
            L_0x00cf:
                com.tencent.mm.plugin.appbrand.i2 r1 = r6.f254051d
                com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r1.getRuntime()
                gt0.k r1 = r1.f238156u
                r1.mo121778b(r0)
                boolean r1 = r6.f254055h
                if (r1 == 0) goto L_0x011c
                android.widget.EditText r1 = r0.f225701r
                r1.requestFocus()
                com.tencent.mm.plugin.appbrand.page.d1 r1 = r6.f254052e
                android.content.Context r1 = r1.getContext()
                boolean r4 = r1 instanceof android.app.Activity
                if (r4 == 0) goto L_0x00f0
                r3 = r1
                android.app.Activity r3 = (android.app.Activity) r3
            L_0x00f0:
                if (r3 != 0) goto L_0x00f3
                goto L_0x0110
            L_0x00f3:
                java.lang.String r1 = "input_method"
                java.lang.Object r1 = r3.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                if (r1 != 0) goto L_0x00fe
                goto L_0x0110
            L_0x00fe:
                android.view.View r3 = r3.getCurrentFocus()
                if (r3 != 0) goto L_0x0105
                goto L_0x0110
            L_0x0105:
                android.os.IBinder r3 = r3.getWindowToken()
                if (r3 != 0) goto L_0x010c
                goto L_0x0110
            L_0x010c:
                r3 = 2
                r1.toggleSoftInput(r2, r3)
            L_0x0110:
                com.tencent.mm.plugin.appbrand.i2 r1 = r6.f254051d
                im0.e$b$$a r2 = new im0.e$b$$a
                r2.<init>(r0)
                r3 = 500(0x1f4, double:2.47E-321)
                r1.mo109670o(r2, r3)
            L_0x011c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: im0.C87754e.C87756b.run():void");
        }
    }

    /* renamed from: im0.e$c */
    public static final class C87757c implements C84967l0.C84970c {

        /* renamed from: d */
        public final C87325b f254064d;

        /* renamed from: e */
        public final C81925i2 f254065e;

        /* renamed from: f */
        public int f254066f;

        /* renamed from: g */
        public boolean f254067g = false;

        /* renamed from: h */
        public int f254068h = -1;

        public C87757c(C87325b bVar, C81925i2 i2Var, C87755a aVar) {
            this.f254064d = bVar;
            this.f254065e = i2Var;
        }

        /* renamed from: a */
        public final void mo122156a(boolean z, int i) {
            int i2 = 0;
            if (!z) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f254064d.getContentView().getLayoutParams();
                layoutParams.addRule(14);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
                layoutParams.bottomMargin = 0;
                this.f254064d.getContentView().setLayoutParams(layoutParams);
            } else if (i > 0) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f254064d.getContentView().getLayoutParams();
                layoutParams2.removeRule(13);
                layoutParams2.addRule(12);
                layoutParams2.addRule(14);
                int i3 = this.f254068h;
                if (i3 <= 0) {
                    C83780d1 l0 = this.f254065e.mo114341l0();
                    if (l0 == null) {
                        i3 = this.f254068h;
                    } else {
                        int i4 = C84752i2.m104413a(l0)[1];
                        C79774c.C79776b navigationBar = l0.f244577X.getNavigationBar();
                        if (navigationBar != null) {
                            i2 = navigationBar.f233794a;
                        }
                        int height = ((((i4 + i) - l0.f244554F.getHeight()) - i2) - this.f254064d.getContentView().getHeight()) / 2;
                        this.f254068h = height;
                        if (height <= i) {
                            this.f254068h = i + 12;
                        }
                        i3 = this.f254068h;
                    }
                }
                layoutParams2.bottomMargin = i3;
                this.f254064d.getContentView().setLayoutParams(layoutParams2);
            }
        }

        /* renamed from: d */
        public void mo117850d(boolean z) {
            Log.m105919d("MicroMsg.JsApiShowModal", "onKeyboardStateChanged shown:%b, keyboardHeight:%d", Boolean.valueOf(z), Integer.valueOf(this.f254066f));
            if (z != this.f254067g) {
                this.f254067g = z;
                mo122156a(z, this.f254066f);
            }
        }

        /* renamed from: e */
        public void mo117851e(int i) {
            Log.m105919d("MicroMsg.JsApiShowModal", "refreshHeight height:%d", Integer.valueOf(i));
            if (this.f254066f != i && this.f254067g) {
                mo122156a(true, i);
            }
            this.f254066f = i;
        }

        public int getHeight() {
            return this.f254066f;
        }
    }

    /* renamed from: w */
    public void mo1505u(C81925i2 i2Var, JSONObject jSONObject, int i) {
        int i2;
        int i3;
        C81925i2 i2Var2 = i2Var;
        JSONObject jSONObject2 = jSONObject;
        int i4 = i;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 != null) {
            String optString = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            String optString2 = jSONObject2.optString("confirmText", i2Var.getContext().getString(C0966R.string.gky));
            String optString3 = jSONObject2.optString("cancelText", i2Var.getContext().getString(C0966R.string.gkw));
            boolean optBoolean = jSONObject2.optBoolean("showCancel", true);
            boolean optBoolean2 = jSONObject2.optBoolean("editable", false);
            if (C89923l.f258408a.mo117499e(i2Var.getAppId())) {
                String optString4 = jSONObject2.optString("confirmColorDark", "");
                i3 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3154h3);
                try {
                    i3 = C88020k.m109562m(optString4);
                } catch (Exception unused) {
                }
                String optString5 = jSONObject2.optString("cancelColorDark", "");
                i2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3133gi);
                try {
                    i2 = C88020k.m109562m(optString5);
                } catch (Exception unused2) {
                }
            } else {
                String optString6 = jSONObject2.optString("confirmColor", "");
                int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3154h3);
                try {
                    color = C88020k.m109562m(optString6);
                } catch (Exception unused3) {
                }
                String optString7 = jSONObject2.optString("cancelColor", "");
                i2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3133gi);
                i2 = C88020k.m109562m(optString7);
            }
            String optString8 = jSONObject2.optString("content");
            Log.m105925i("MicroMsg.JsApiShowModal", "showModal appId[%s] title[%s] content[%s]", i2Var.getAppId(), optString, optString8);
            C87756b bVar = r0;
            C87756b bVar2 = new C87756b(i2Var, l0, optString, optString8, optBoolean2, optString2, i, optBoolean, optString3, i3, i2, jSONObject);
            i2Var2.mo109673t(bVar);
        } else if (i2Var.getRuntime() == null || i2Var.getRuntime().mo113064k0() || i2Var.getRuntime().f238116N) {
            Log.m105929w("MicroMsg.JsApiShowModal", "invoke failed with appId[%s] callbackId[%d], current page view is null.", i2Var.getAppId(), Integer.valueOf(i));
            i2Var2.mo109647a(i4, mo115109j("fail:page don't exist"));
        } else {
            Log.m105929w("MicroMsg.JsApiShowModal", "invoke with appId[%s] callbackId[%d] runtime !initialized, retry", i2Var.getAppId(), Integer.valueOf(i));
            i2Var.getRuntime().mo113020N0(new C87755a(i2Var2, i4, jSONObject2));
        }
    }
}
