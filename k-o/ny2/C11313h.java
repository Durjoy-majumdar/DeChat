package ny2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C7335d;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import java.util.Map;
import kg3.C76577a;
import ky2.C10428a;
import ky2.C10434j;
import p158gt.C98201k;
import p243tn.C14050a;
import p254vn.C14912b;
import t90.C13867d;
import z04.C112551y;

/* renamed from: ny2.h */
public class C11313h extends C10434j {

    /* renamed from: ny2.h$a */
    public static final class C11314a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f33267d;

        /* renamed from: e */
        public final /* synthetic */ String f33268e;

        /* renamed from: f */
        public final /* synthetic */ Context f33269f;

        public C11314a(boolean z, String str, Context context) {
            this.f33267d = z;
            this.f33268e = str;
            this.f33269f = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x006f, code lost:
            if (((ex0.C45696d) f40.C86709a0.m107533q(r7)).Ms0(r6.f33269f, r15, -1, true, 3, 10000, r0) != false) goto L_0x0074;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r17) {
            /*
                r16 = this;
                r6 = r16
                java.lang.Class<ex0.d> r7 = ex0.C45696d.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r17
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/teenmode/ui/BizAuthorizationFiller$initMsgItem$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r16
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                boolean r0 = r6.f33267d
                r1 = 0
                java.lang.String r2 = ".ui.tools.WebViewUI"
                java.lang.String r3 = "webview"
                r4 = 1
                java.lang.String r5 = "rawUrl"
                if (r0 == 0) goto L_0x007f
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r8 = 3
                r9 = 10000(0x2710, float:1.4013E-41)
                java.lang.Class<rn.n> r10 = p227rn.C101396n.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                rn.n r10 = (p227rn.C101396n) r10
                java.lang.String r11 = r6.f33268e
                long r12 = java.lang.System.currentTimeMillis()
                r14 = 1000(0x3e8, float:1.401E-42)
                long r14 = (long) r14
                long r12 = r12 / r14
                int r13 = (int) r12
                java.lang.String r15 = r10.mo140647F2(r11, r8, r9, r13)
                k40.a r9 = f40.C86709a0.m107533q(r7)
                ex0.d r9 = (ex0.C45696d) r9
                boolean r8 = r9.mo70957E5(r8)
                if (r8 == 0) goto L_0x0072
                k40.a r7 = f40.C86709a0.m107533q(r7)
                r8 = r7
                ex0.d r8 = (ex0.C45696d) r8
                android.content.Context r9 = r6.f33269f
                r11 = -1
                r12 = 1
                r13 = 3
                r14 = 10000(0x2710, float:1.4013E-41)
                r10 = r15
                r7 = r15
                r15 = r0
                boolean r8 = r8.Ms0(r9, r10, r11, r12, r13, r14, r15)
                if (r8 == 0) goto L_0x0073
                goto L_0x0074
            L_0x0072:
                r7 = r15
            L_0x0073:
                r4 = 0
            L_0x0074:
                if (r4 != 0) goto L_0x0093
                r0.putExtra(r5, r7)
                android.content.Context r4 = r6.f33269f
                ke3.C88144b.m109791i(r4, r3, r2, r0, r1)
                goto L_0x0093
            L_0x007f:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r7 = r6.f33268e
                r0.putExtra(r5, r7)
                java.lang.String r5 = "key_enable_teen_mode_check"
                r0.putExtra(r5, r4)
                android.content.Context r4 = r6.f33269f
                ke3.C88144b.m109791i(r4, r3, r2, r0, r1)
            L_0x0093:
                java.lang.String r0 = "com/tencent/mm/plugin/teenmode/ui/BizAuthorizationFiller$initMsgItem$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ny2.C11313h.C11314a.onClick(android.view.View):void");
        }
    }

    /* renamed from: B */
    public final void mo11346B(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar, boolean z) {
        Map<String, String> parseXml;
        String str;
        C68070l.C68072b u;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null) {
            C68070l.C68072b bVar2 = aVar.f31647a;
            C13867d dVar = bVar2 != null ? (C13867d) bVar2.mo93555w(C13867d.class) : null;
            if (dVar != null && (parseXml = XmlParser.parseXml(dVar.f39033e, "content", (String) null)) != null && (str = parseXml.get(".content")) != null && (u = C68070l.C68072b.m80422u(str, (String) null)) != null) {
                String str2 = u.f195570f;
                TextView textView = aVar.f31658l;
                boolean z2 = true;
                if (str2 == null || C112551y.m153811k(str2)) {
                    str2 = context.getString(z ? C0966R.string.a3x : C0966R.string.a3w);
                }
                textView.setText(str2);
                String str3 = u.f195646y;
                String str4 = u.f195586j;
                aVar.f31656j.setImageResource(C0966R.raw.app_attach_file_icon_webpage);
                aVar.f31656j.setScaleType(ImageView.ScaleType.CENTER_CROP);
                if (!(str3 == null || C112551y.m153811k(str3))) {
                    C20828a b = C20828a.m22825b();
                    ImageView imageView = aVar.f31656j;
                    C20937c.C20939b bVar3 = new C20937c.C20939b();
                    bVar3.f59359o = C0966R.raw.app_attach_file_icon_webpage;
                    bVar3.f59366v = true;
                    bVar3.f59346b = true;
                    bVar3.f59350f = C14050a.m13405b(str3);
                    bVar3.f59354j = 132;
                    bVar3.f59355k = 132;
                    b.mo32519h(str3, imageView, bVar3.mo32666a());
                } else if (!Util.isNullOrNil(aVar.f31648b)) {
                    aVar.f31656j.setImageBitmap(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(aVar.f31648b, C76577a.m92156g(context), false));
                }
                C7335d c = C86312j.m106911c(C14912b.class);
                C87412m.m108593f(c, "getService(IBizViewUtilsService::class.java)");
                ((C14912b) c).mo13965fb(aVar.f31656j, (float) C76577a.m92151b(context, 4), true, true);
                if (!aVar.mo10733a() && bVar != C10428a.C10430b.AUTHORIZED) {
                    z2 = false;
                }
                if (z2) {
                    if (z) {
                        ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(str4, -1, 3, new Object[0]);
                    }
                    aVar.f31655i.setOnClickListener(new C11314a(z, str4, context));
                    return;
                }
                aVar.f31655i.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    /* renamed from: D */
    public final void mo11347D(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null) {
            if (aVar.mo10733a()) {
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jvz));
                } else if (ordinal == 1) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361434jw0));
                } else if (ordinal == 2) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jvy));
                } else if (ordinal == 3) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jvx));
                }
            } else {
                int ordinal2 = bVar.ordinal();
                if (ordinal2 == 0) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361437jw3));
                } else if (ordinal2 == 1) {
                    aVar.f31654h.setText(context.getString(C0966R.string.jw4));
                } else if (ordinal2 == 2) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361436jw2));
                } else if (ordinal2 == 3) {
                    aVar.f31654h.setText(context.getString(C0966R.string.f361435jw1));
                }
            }
        }
    }

    /* renamed from: d */
    public String mo10175d(Context context) {
        C87412m.m108594g(context, "context");
        String string = context.getString(C0966R.string.lh9);
        C87412m.m108593f(string, "context.getString(com.te…ew_teen_mode_mp_biz_desc)");
        return string;
    }

    /* renamed from: q */
    public void mo10176q(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar) {
        Context context2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null) {
            LinearLayout linearLayout = aVar.f31655i;
            if (linearLayout == null || (context2 = linearLayout.getContext()) == null) {
                context2 = MMApplicationContext.getContext();
            }
            C87412m.m108593f(context2, "context");
            mo11347D(context2, bVar, aVar, true);
            mo11346B(context2, bVar, aVar, true);
        }
    }
}
