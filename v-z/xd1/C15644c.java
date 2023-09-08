package xd1;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ShowPhoneMenuEvent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import od1.C11407i;
import org.json.JSONObject;
import pe3.C47465a;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C48713ah1;
import te3.C49712hj1;
import te3.C49982je3;
import te3.C50951qe3;
import te3.C51233se3;
import te3.m74;
import te3.z74;
import up1.C14368v;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: xd1.c */
public final class C15644c extends C11407i<C48713ah1> {

    /* renamed from: A */
    public C32227p<? super Float, ? super Float, C13598b0> f42280A;

    /* renamed from: B */
    public AppBarLayout f42281B;

    /* renamed from: C */
    public View f42282C;

    /* renamed from: D */
    public C14368v f42283D;

    /* renamed from: E */
    public ViewGroup f42284E;

    /* renamed from: F */
    public TextView f42285F;

    /* renamed from: G */
    public ViewGroup f42286G;

    /* renamed from: H */
    public final DecimalFormat f42287H = new DecimalFormat("0.##");

    /* renamed from: I */
    public int f42288I = 2;

    /* renamed from: J */
    public Rect f42289J = new Rect();

    /* renamed from: K */
    public Rect f42290K = new Rect();

    /* renamed from: g */
    public View f42291g;

    /* renamed from: h */
    public int f42292h;

    /* renamed from: i */
    public long f42293i;

    /* renamed from: j */
    public String f42294j = "";

    /* renamed from: n */
    public float f42295n;

    /* renamed from: o */
    public float f42296o;

    /* renamed from: p */
    public String f42297p = "";

    /* renamed from: q */
    public String f42298q = "";

    /* renamed from: r */
    public int f42299r;

    /* renamed from: s */
    public m74 f42300s;

    /* renamed from: t */
    public boolean f42301t;

    /* renamed from: u */
    public float f42302u;

    /* renamed from: v */
    public C32226l<? super Float, C13598b0> f42303v;

    /* renamed from: w */
    public C32224a<C13598b0> f42304w;

    /* renamed from: x */
    public Boolean f42305x;

    /* renamed from: y */
    public C32224a<Boolean> f42306y;

    /* renamed from: z */
    public C32224a<C13598b0> f42307z;

    /* renamed from: xd1.c$a */
    public static final class C15645a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f42308d;

        /* renamed from: e */
        public final /* synthetic */ String f42309e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15645a(C32226l<? super String, C13598b0> lVar, String str) {
            super(0);
            this.f42308d = lVar;
            this.f42309e = str;
        }

        public Object invoke() {
            this.f42308d.invoke(this.f42309e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xd1.c$b */
    public static final class C15646b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f42310d;

        /* renamed from: e */
        public final /* synthetic */ String f42311e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15646b(C32226l<? super String, C13598b0> lVar, String str) {
            super(0);
            this.f42310d = lVar;
            this.f42311e = str;
        }

        public Object invoke() {
            C32226l<String, C13598b0> lVar = this.f42310d;
            String str = this.f42311e;
            if (str == null) {
                str = "";
            }
            lVar.invoke(str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xd1.c$c */
    public static final class C15647c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15644c f42312d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15647c(C15644c cVar) {
            super(1);
            this.f42312d = cVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "phone");
            Bundle bundle = new Bundle();
            ShowPhoneMenuEvent showPhoneMenuEvent = new ShowPhoneMenuEvent();
            showPhoneMenuEvent.f9506d.f9507a = this.f42312d.getContext();
            ShowPhoneMenuEvent.C1136a aVar = showPhoneMenuEvent.f9506d;
            aVar.f9508b = str;
            aVar.f9510d = bundle;
            showPhoneMenuEvent.publish();
            C15644c cVar = this.f42312d;
            cVar.getClass();
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0 y0Var = (C58417y0) c;
            FinderPoiFeedUI.C3005a aVar2 = FinderPoiFeedUI.C3005a.ACTION_CLICK_PHONE;
            long j = cVar.f42293i;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(cVar.getActivity());
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            m74 m74 = cVar.f42300s;
            String str2 = m74 != null ? m74.f184224i : null;
            String str3 = cVar.f42294j;
            String stringExtra = cVar.getActivity().getIntent().getStringExtra("key_sns_feed_id");
            if (stringExtra == null) {
                stringExtra = C75592q0.m90789s();
            }
            C58417y0.Dy0(y0Var, aVar2, j, q3, str2, str3, stringExtra, 0, 64, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xd1.c$d */
    public static final class C15648d extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f42313d;

        /* renamed from: e */
        public final /* synthetic */ TextView f42314e;

        public C15648d(C32224a<C13598b0> aVar, TextView textView) {
            this.f42313d = aVar;
            this.f42314e = textView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$setClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            this.f42313d.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$setClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(this.f42314e.getContext().getResources().getColor(C0966R.color.Link_100));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15644c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: m3 */
    public static /* synthetic */ void m14648m3(C15644c cVar, TextView textView, String str, Integer num, C32224a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        cVar.mo14392l3(textView, str, num, aVar);
    }

    /* renamed from: e3 */
    public void mo514e3() {
        super.mo514e3();
        m74 m74 = new m74();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_location");
        if (byteArrayExtra != null) {
            try {
                m74.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f42300s = m74;
            this.f42301t = getIntent().getBooleanExtra("key_drawer_mode", false);
        }
        m74 = null;
        this.f42300s = m74;
        this.f42301t = getIntent().getBooleanExtra("key_drawer_mode", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0504, code lost:
        if (((r3 == null || (r3 = r3.f184224i) == null || !z04.C112551y.m153819s(r3, "UgcPoiEx_", false)) ? false : true) == false) goto L_0x0506;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f8  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo314f3() {
        /*
            r20 = this;
            r7 = r20
            super.mo314f3()
            android.widget.FrameLayout r0 = r7.f33565e
            r7.f42291g = r0
            r0 = 2131297226(0x7f0903ca, float:1.821239E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r7.f42281B = r0
            boolean r0 = r7.f42301t
            if (r0 == 0) goto L_0x05a0
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r1 = "key_from_type"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            boolean r1 = r0 instanceof ht1.C98522w3.C8810a
            if (r1 == 0) goto L_0x0029
            ht1.w3$a r0 = (ht1.C98522w3.C8810a) r0
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            te3.m74 r1 = r7.f42300s
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r1.f184224i
            if (r1 == 0) goto L_0x005c
            ht1.w3$a r2 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_MAP
            if (r0 == r2) goto L_0x005c
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            r2.getClass()
            f40.e r3 = f40.C86709a0.m107523b()
            r3.mo121108c()
            up1.w r3 = r2.f157780G
            if (r3 != 0) goto L_0x0055
            up1.w r3 = new up1.w
            zh3.f r4 = r2.mo76790Np()
            r3.<init>(r4)
        L_0x0055:
            r2.f157780G = r3
            up1.v r1 = r3.mo13670jo(r1)
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r7.f42283D = r1
            ht1.w3$a r1 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER
            r9 = 0
            r10 = 1
            if (r0 == r1) goto L_0x0069
            ht1.w3$a r1 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS
            if (r0 != r1) goto L_0x0077
        L_0x0069:
            te3.m74 r0 = r7.f42300s
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r0.f184224i
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            up1.v r1 = r7.f42283D
            if (r1 == 0) goto L_0x0092
            fy3.p<? super java.lang.Float, ? super java.lang.Float, rx3.b0> r0 = r7.f42280A
            if (r0 == 0) goto L_0x0091
            float r2 = r1.field_latitude
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r1 = r1.field_longitude
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.invoke(r2, r1)
        L_0x0091:
            r0 = 1
        L_0x0092:
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            r2 = 2131311230(0x7f093a7e, float:1.8240794E38)
            android.view.View r1 = r1.findViewById(r2)
            r7.f42282C = r1
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            r2 = 2131311231(0x7f093a7f, float:1.8240796E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r7.f42286G = r1
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            r2 = 2131314900(0x7f0948d4, float:1.8248238E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r7.f42284E = r1
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            r2 = 2131310020(0x7f0935c4, float:1.823834E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.f42285F = r1
            java.lang.Boolean r1 = r7.f42305x
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            r11 = 8
            if (r1 == 0) goto L_0x00eb
            if (r0 == 0) goto L_0x00eb
            android.view.ViewGroup r1 = r7.f42284E
            if (r1 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r1.setVisibility(r9)
        L_0x00e2:
            android.widget.TextView r1 = r7.f42285F
            if (r1 != 0) goto L_0x00e7
            goto L_0x00fb
        L_0x00e7:
            r1.setVisibility(r9)
            goto L_0x00fb
        L_0x00eb:
            android.view.ViewGroup r1 = r7.f42284E
            if (r1 != 0) goto L_0x00f0
            goto L_0x00f3
        L_0x00f0:
            r1.setVisibility(r11)
        L_0x00f3:
            android.widget.TextView r1 = r7.f42285F
            if (r1 != 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            r1.setVisibility(r11)
        L_0x00fb:
            if (r0 == 0) goto L_0x0106
            android.view.ViewGroup r0 = r7.f42286G
            if (r0 != 0) goto L_0x0102
            goto L_0x010e
        L_0x0102:
            r0.setVisibility(r9)
            goto L_0x010e
        L_0x0106:
            android.view.ViewGroup r0 = r7.f42286G
            if (r0 != 0) goto L_0x010b
            goto L_0x010e
        L_0x010b:
            r0.setVisibility(r11)
        L_0x010e:
            androidx.appcompat.app.AppCompatActivity r0 = r20.getActivity()
            r1 = 2131311235(0x7f093a83, float:1.8240805E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            r2 = 2131311232(0x7f093a80, float:1.8240798E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131314826(0x7f09488a, float:1.8248088E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.view.View r3 = r7.f42291g
            if (r3 == 0) goto L_0x013f
            r4 = 2131311084(0x7f0939ec, float:1.8240498E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L_0x0140
        L_0x013f:
            r3 = 0
        L_0x0140:
            if (r3 != 0) goto L_0x0143
            goto L_0x0146
        L_0x0143:
            r3.setVisibility(r11)
        L_0x0146:
            android.view.View r3 = r7.f42291g
            if (r3 == 0) goto L_0x0154
            r4 = 2131312586(0x7f093fca, float:1.8243545E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            if (r3 != 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            r3.setVisibility(r11)
        L_0x015b:
            android.view.View r3 = r7.f42291g
            if (r3 == 0) goto L_0x0169
            r4 = 2131311085(0x7f0939ed, float:1.82405E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L_0x016a
        L_0x0169:
            r3 = 0
        L_0x016a:
            if (r3 != 0) goto L_0x016d
            goto L_0x0170
        L_0x016d:
            r3.setVisibility(r11)
        L_0x0170:
            android.view.View r3 = r7.f42282C
            if (r3 != 0) goto L_0x0175
            goto L_0x01b5
        L_0x0175:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r5)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC"
            java.lang.String r15 = "initDrawerHeader"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r3
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC"
            java.lang.String r14 = "initDrawerHeader"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x01b5:
            te3.m74 r3 = r7.f42300s
            if (r3 == 0) goto L_0x01bc
            java.lang.String r3 = r3.f184222g
            goto L_0x01bd
        L_0x01bc:
            r3 = 0
        L_0x01bd:
            r0.setText(r3)
            android.text.TextPaint r3 = r0.getPaint()
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r3, r4)
            android.view.ViewGroup r3 = r7.f42286G
            if (r3 == 0) goto L_0x01d6
            xd1.d r4 = new xd1.d
            r4.<init>(r7)
            r3.setOnClickListener(r4)
        L_0x01d6:
            android.view.ViewGroup r3 = r7.f42284E
            if (r3 == 0) goto L_0x01e2
            xd1.e r4 = new xd1.e
            r4.<init>(r7)
            r3.setOnClickListener(r4)
        L_0x01e2:
            te3.m74 r3 = r7.f42300s
            if (r3 == 0) goto L_0x01e9
            java.lang.String r3 = r3.f184223h
            goto L_0x01ea
        L_0x01e9:
            r3 = 0
        L_0x01ea:
            if (r3 == 0) goto L_0x01f5
            int r3 = r3.length()
            if (r3 != 0) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r3 = 0
            goto L_0x01f6
        L_0x01f5:
            r3 = 1
        L_0x01f6:
            if (r3 == 0) goto L_0x01ff
            if (r1 != 0) goto L_0x01fb
            goto L_0x0213
        L_0x01fb:
            r1.setVisibility(r11)
            goto L_0x0213
        L_0x01ff:
            if (r1 != 0) goto L_0x0202
            goto L_0x0205
        L_0x0202:
            r1.setVisibility(r9)
        L_0x0205:
            if (r1 != 0) goto L_0x0208
            goto L_0x0213
        L_0x0208:
            te3.m74 r3 = r7.f42300s
            if (r3 == 0) goto L_0x020f
            java.lang.String r3 = r3.f184223h
            goto L_0x0210
        L_0x020f:
            r3 = 0
        L_0x0210:
            r1.setText(r3)
        L_0x0213:
            te3.m74 r3 = r7.f42300s
            java.lang.String r12 = "UgcPoiEx_"
            if (r3 == 0) goto L_0x0225
            java.lang.String r3 = r3.f184224i
            if (r3 == 0) goto L_0x0225
            boolean r3 = z04.C112551y.m153819s(r3, r12, r9)
            if (r3 != r10) goto L_0x0225
            r3 = 1
            goto L_0x0226
        L_0x0225:
            r3 = 0
        L_0x0226:
            if (r3 == 0) goto L_0x0290
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            r4 = 2131311234(0x7f093a82, float:1.8240803E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setVisibility(r9)
            android.app.Activity r4 = r20.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131756327(0x7f100527, float:1.9143558E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r5 = 2131100168(0x7f060208, float:1.781271E38)
            int r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getColor(r5)
            com.tencent.p014mm.p136ui.C74933u4.m89769f(r4, r5)
            float r5 = r3.getTextSize()
            int r5 = (int) r5
            float r6 = r3.getTextSize()
            int r6 = (int) r6
            r4.setBounds(r9, r9, r5, r6)
            go3.c r5 = new go3.c
            r5.<init>(r4, r10)
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "@ "
            r6.append(r13)
            android.app.Activity r13 = r20.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131829432(0x7f1122b8, float:1.9291833E38)
            java.lang.String r13 = r13.getString(r14)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            r6 = 33
            r4.setSpan(r5, r9, r10, r6)
            r3.setText(r4)
        L_0x0290:
            android.view.View r3 = r7.f42282C
            if (r3 == 0) goto L_0x029c
            xd1.f r4 = new xd1.f
            r4.<init>(r7, r1, r0)
            r3.setOnLongClickListener(r4)
        L_0x029c:
            android.view.View r0 = r7.f42282C
            if (r0 == 0) goto L_0x02ae
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x02ae
            xd1.g r1 = new xd1.g
            r1.<init>(r7)
            r0.addOnGlobalLayoutListener(r1)
        L_0x02ae:
            if (r2 == 0) goto L_0x02be
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            if (r0 == 0) goto L_0x02be
            xd1.h r1 = new xd1.h
            r1.<init>(r7, r2)
            r0.addOnGlobalLayoutListener(r1)
        L_0x02be:
            android.view.View r0 = r7.f42291g
            if (r0 != 0) goto L_0x02c3
            goto L_0x02c6
        L_0x02c3:
            r0.setMinimumHeight(r9)
        L_0x02c6:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x02d4
            r1 = 2131307893(0x7f092d75, float:1.8234026E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            goto L_0x02d5
        L_0x02d4:
            r0 = 0
        L_0x02d5:
            android.view.View r1 = r7.f42291g
            if (r1 == 0) goto L_0x02e3
            r3 = 2131311078(0x7f0939e6, float:1.8240486E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            goto L_0x02e4
        L_0x02e3:
            r1 = 0
        L_0x02e4:
            if (r1 != 0) goto L_0x02e7
            goto L_0x02ea
        L_0x02e7:
            r1.setVisibility(r11)
        L_0x02ea:
            if (r0 != 0) goto L_0x02ed
            goto L_0x02f0
        L_0x02ed:
            r0.setVisibility(r9)
        L_0x02f0:
            if (r0 == 0) goto L_0x031d
            android.app.Activity r1 = r20.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r1 = r1.getDimension(r3)
            int r1 = (int) r1
            int r3 = r0.getTop()
            android.app.Activity r4 = r20.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165289(0x7f070069, float:1.794479E38)
            float r4 = r4.getDimension(r5)
            int r4 = (int) r4
            int r5 = r0.getBottom()
            r0.setPadding(r1, r3, r4, r5)
        L_0x031d:
            if (r2 == 0) goto L_0x0324
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            goto L_0x0325
        L_0x0324:
            r0 = 0
        L_0x0325:
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
            if (r0 != 0) goto L_0x032a
            goto L_0x032d
        L_0x032a:
            r1 = 3
            r0.f193396a = r1
        L_0x032d:
            if (r2 != 0) goto L_0x0330
            goto L_0x0333
        L_0x0330:
            r2.setLayoutParams(r0)
        L_0x0333:
            if (r2 == 0) goto L_0x0342
            android.app.Activity r0 = r20.getContext()
            r1 = 1098907648(0x41800000, float:16.0)
            int r0 = zp3.C79406f.m96347a(r0, r1)
            r2.setPadding(r9, r0, r9, r9)
        L_0x0342:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x0351
            r1 = 2131311079(0x7f0939e7, float:1.8240488E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13 = r0
            goto L_0x0352
        L_0x0351:
            r13 = 0
        L_0x0352:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x0361
            r1 = 2131311083(0x7f0939eb, float:1.8240496E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14 = r0
            goto L_0x0362
        L_0x0361:
            r14 = 0
        L_0x0362:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x0371
            r1 = 2131307913(0x7f092d89, float:1.8234067E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r15 = r0
            goto L_0x0372
        L_0x0371:
            r15 = 0
        L_0x0372:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x0381
            r1 = 2131311065(0x7f0939d9, float:1.824046E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6 = r0
            goto L_0x0382
        L_0x0381:
            r6 = 0
        L_0x0382:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x0391
            r1 = 2131311082(0x7f0939ea, float:1.8240494E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5 = r0
            goto L_0x0392
        L_0x0391:
            r5 = 0
        L_0x0392:
            android.view.View r0 = r7.f42291g
            if (r0 == 0) goto L_0x03a0
            r1 = 2131305925(0x7f0925c5, float:1.8230035E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x03a1
        L_0x03a0:
            r0 = 0
        L_0x03a1:
            if (r0 != 0) goto L_0x03a4
            goto L_0x03a7
        L_0x03a4:
            r0.setVisibility(r9)
        L_0x03a7:
            r16 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r13 == 0) goto L_0x03b3
            int r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getColor(r16)
            r13.setTextColor(r0)
        L_0x03b3:
            if (r6 == 0) goto L_0x03bc
            int r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getColor(r16)
            r6.setTextColor(r0)
        L_0x03bc:
            up1.v r0 = r7.f42283D
            if (r0 == 0) goto L_0x03c4
            java.lang.String r0 = r0.field_businessHour
            if (r0 != 0) goto L_0x03cc
        L_0x03c4:
            te3.m74 r0 = r7.f42300s
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = r0.f184237y
            goto L_0x03cc
        L_0x03cb:
            r0 = 0
        L_0x03cc:
            if (r0 == 0) goto L_0x03d8
            java.lang.String r1 = "\n"
            java.lang.String r2 = " "
            java.lang.String r0 = z04.C112551y.m153814n(r0, r1, r2, r9)
            r2 = r0
            goto L_0x03d9
        L_0x03d8:
            r2 = 0
        L_0x03d9:
            r0 = 2131829436(0x7f1122bc, float:1.9291841E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r17 = 8
            r18 = 0
            r0 = r20
            r1 = r13
            r8 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            m14648m3(r0, r1, r2, r3, r4, r5, r6)
            up1.v r0 = r7.f42283D
            if (r0 == 0) goto L_0x03fa
            java.lang.String r0 = r0.field_phoneNumber
            if (r0 != 0) goto L_0x0402
        L_0x03fa:
            te3.m74 r0 = r7.f42300s
            if (r0 == 0) goto L_0x0401
            java.lang.String r0 = r0.f184238z
            goto L_0x0402
        L_0x0401:
            r0 = 0
        L_0x0402:
            int r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getColor(r16)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.mo14391k3(r14, r15, r0, r1)
            up1.v r0 = r7.f42283D
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = r0.field_priceTips
            goto L_0x0415
        L_0x0414:
            r0 = 0
        L_0x0415:
            if (r0 != 0) goto L_0x043a
            te3.m74 r1 = r7.f42300s
            if (r1 == 0) goto L_0x0422
            float r1 = r1.f184218A
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0423
        L_0x0422:
            r1 = 0
        L_0x0423:
            r2 = 0
            boolean r1 = gy3.C87412m.m108588a(r1, r2)
            if (r1 != 0) goto L_0x043a
            java.text.DecimalFormat r0 = r7.f42287H
            te3.m74 r1 = r7.f42300s
            if (r1 == 0) goto L_0x0434
            float r1 = r1.f184218A
            double r1 = (double) r1
            goto L_0x0436
        L_0x0434:
            r1 = 0
        L_0x0436:
            java.lang.String r0 = r0.format(r1)
        L_0x043a:
            r2 = r0
            if (r2 == 0) goto L_0x0452
            r0 = 2131829438(0x7f1122be, float:1.9291845E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r20
            r1 = r17
            m14648m3(r0, r1, r2, r3, r4, r5, r6)
            r0 = r17
            goto L_0x045a
        L_0x0452:
            r0 = r17
            if (r0 != 0) goto L_0x0457
            goto L_0x045a
        L_0x0457:
            r0.setVisibility(r11)
        L_0x045a:
            te3.m74 r1 = r7.f42300s
            if (r1 == 0) goto L_0x0464
            boolean r1 = r1.f184235w
            if (r1 != r10) goto L_0x0464
            r1 = 1
            goto L_0x0465
        L_0x0464:
            r1 = 0
        L_0x0465:
            if (r1 != 0) goto L_0x047f
            if (r13 != 0) goto L_0x046a
            goto L_0x046d
        L_0x046a:
            r13.setVisibility(r11)
        L_0x046d:
            if (r14 != 0) goto L_0x0470
            goto L_0x0473
        L_0x0470:
            r14.setVisibility(r11)
        L_0x0473:
            if (r15 != 0) goto L_0x0476
            goto L_0x0479
        L_0x0476:
            r15.setVisibility(r11)
        L_0x0479:
            if (r0 != 0) goto L_0x047c
            goto L_0x047f
        L_0x047c:
            r0.setVisibility(r11)
        L_0x047f:
            if (r8 != 0) goto L_0x0482
            goto L_0x0485
        L_0x0482:
            r8.setVisibility(r11)
        L_0x0485:
            com.google.android.material.appbar.AppBarLayout r0 = r7.f42281B
            if (r0 == 0) goto L_0x0491
            xd1.i r1 = new xd1.i
            r1.<init>(r7)
            r0.mo146159a(r1)
        L_0x0491:
            com.google.android.material.appbar.AppBarLayout r0 = r7.f42281B
            if (r0 == 0) goto L_0x049a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x049b
        L_0x049a:
            r0 = 0
        L_0x049b:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            gy3.C87412m.m108592e(r0, r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C103717e) r0
            com.google.android.material.appbar.AppBarLayout$Behavior r1 = new com.google.android.material.appbar.AppBarLayout$Behavior
            r1.<init>()
            xd1.j r2 = new xd1.j
            r2.<init>()
            r1.f309061w = r2
            r0.mo144938b(r1)
            com.google.android.material.appbar.AppBarLayout r1 = r7.f42281B
            if (r1 != 0) goto L_0x04b6
            goto L_0x04b9
        L_0x04b6:
            r1.setLayoutParams(r0)
        L_0x04b9:
            android.app.Activity r0 = r20.getContext()
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            te3.m74 r3 = r7.f42300s
            if (r3 == 0) goto L_0x04d1
            java.lang.String r3 = r3.f184224i
            if (r3 != 0) goto L_0x04d3
        L_0x04d1:
            java.lang.String r3 = ""
        L_0x04d3:
            java.lang.String r4 = "poiid"
            r2.put(r4, r3)
            android.content.Intent r3 = r20.getIntent()
            java.lang.String r4 = "key_biz_source"
            int r3 = r3.getIntExtra(r4, r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "poi_biz_source"
            r2.put(r4, r3)
            te3.m74 r3 = r7.f42300s
            if (r3 == 0) goto L_0x04f2
            java.lang.String r8 = r3.f184224i
            goto L_0x04f3
        L_0x04f2:
            r8 = 0
        L_0x04f3:
            if (r8 == 0) goto L_0x0506
            if (r3 == 0) goto L_0x0503
            java.lang.String r3 = r3.f184224i
            if (r3 == 0) goto L_0x0503
            boolean r3 = z04.C112551y.m153819s(r3, r12, r9)
            if (r3 != r10) goto L_0x0503
            r3 = 1
            goto L_0x0504
        L_0x0503:
            r3 = 0
        L_0x0504:
            if (r3 != 0) goto L_0x0507
        L_0x0506:
            r9 = 1
        L_0x0507:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.String r4 = "is_official_poi"
            r2.put(r4, r3)
            java.lang.String r3 = "com.tencent.map"
            android.content.pm.PackageInfo r0 = js0.C9512b.m9207a(r0, r3)
            if (r0 == 0) goto L_0x0519
            goto L_0x051a
        L_0x0519:
            r10 = 2
        L_0x051a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.String r3 = "qqmap_installed"
            r2.put(r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r1)
            l31.e r0 = (l31.C61212e) r0
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            l31.e r0 = r0.mo86163dt(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            o31.b r4 = o31.C11345b.FinderNewPoiUI
            l31.e r0 = r0.mo86178qr(r3, r4)
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            java.lang.String r4 = "FinderNewPoiUI"
            l31.e r0 = r0.mo86136FZ(r3, r4)
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            l31.e r0 = r0.mo86146Mp(r3, r2)
            androidx.appcompat.app.AppCompatActivity r3 = r20.getActivity()
            r4 = 4
            r5 = 27051(0x69ab, float:3.7907E-41)
            r0.mo86148No(r3, r4, r5)
            di3.d r0 = di3.C86312j.m106911c(r1)
            l31.e r0 = (l31.C61212e) r0
            android.view.ViewGroup r3 = r7.f42284E
            java.lang.String r4 = "take_taxi_button"
            l31.e r0 = r0.o30(r3, r4)
            android.view.ViewGroup r3 = r7.f42284E
            l31.e r0 = r0.mo86146Mp(r3, r2)
            android.view.ViewGroup r3 = r7.f42284E
            l31.e r0 = r0.mo86148No(r3, r11, r5)
            android.view.ViewGroup r3 = r7.f42284E
            xd1.n r4 = new xd1.n
            r4.<init>(r7)
            r0.E60(r3, r4)
            di3.d r0 = di3.C86312j.m106911c(r1)
            l31.e r0 = (l31.C61212e) r0
            android.view.ViewGroup r1 = r7.f42286G
            java.lang.String r3 = "navigation_button"
            l31.e r0 = r0.o30(r1, r3)
            android.view.ViewGroup r1 = r7.f42286G
            l31.e r0 = r0.mo86146Mp(r1, r2)
            android.view.ViewGroup r1 = r7.f42286G
            l31.e r0 = r0.mo86148No(r1, r11, r5)
            android.view.ViewGroup r1 = r7.f42286G
            xd1.o r2 = new xd1.o
            r2.<init>(r7)
            r0.E60(r1, r2)
        L_0x05a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15644c.mo314f3():void");
    }

    /* renamed from: g3 */
    public void mo492g3(C47465a aVar) {
        z74 z74;
        C50951qe3 qe32;
        C49982je3 je32;
        C51233se3 se32;
        C13598b0 b0Var;
        C48713ah1 ah12 = (C48713ah1) aVar;
        super.mo492g3(ah12);
        if (!(ah12 == null || (z74 = ah12.f130516g) == null || (qe32 = z74.f145743d) == null || (je32 = qe32.f140264d) == null || (se32 = je32.f136054f) == null)) {
            C32224a<C13598b0> aVar2 = this.f42307z;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            if (C87412m.m108589b(this.f42305x, Boolean.TRUE)) {
                ViewGroup viewGroup = this.f42284E;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                TextView textView = this.f42285F;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            ViewGroup viewGroup2 = this.f42286G;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            C32227p<? super Float, ? super Float, C13598b0> pVar = this.f42280A;
            if (pVar != null) {
                pVar.invoke(Float.valueOf(se32.f141463e), Float.valueOf(se32.f141462d));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                return;
            }
        }
        C32224a<C13598b0> aVar3 = this.f42307z;
        if (aVar3 != null) {
            aVar3.invoke();
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: i3 */
    public void mo515i3(C47465a aVar) {
        C48713ah1 ah12 = (C48713ah1) aVar;
        super.mo515i3(ah12);
        this.f42293i = (ah12 != null ? ah12.f130520n : 0) > 0 ? 1 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0534  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo315j3() {
        /*
            r39 = this;
            r8 = r39
            od1.C11405h.C11406a.m11254b(r39)
            boolean r0 = r8.f42301t
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0018
            te3.m74 r0 = r8.f42300s
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.f184235w
            if (r0 != r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x05b6
        L_0x0018:
            T r0 = r8.f33564d
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x05b6
            te3.z74 r0 = r0.f130516g
            if (r0 == 0) goto L_0x05b6
            te3.qe3 r11 = r0.f145743d
            if (r11 == 0) goto L_0x05b6
            android.view.View r0 = r8.f42291g
            if (r0 == 0) goto L_0x0034
            r1 = 2131307893(0x7f092d75, float:1.8234026E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r0.setVisibility(r10)
        L_0x003b:
            android.view.View r0 = r8.f42291g
            if (r0 == 0) goto L_0x0049
            r1 = 2131311084(0x7f0939ec, float:1.8240498E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0059
            r2 = 2131311085(0x7f0939ed, float:1.82405E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13 = r1
            goto L_0x005a
        L_0x0059:
            r13 = 0
        L_0x005a:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0069
            r2 = 2131311064(0x7f0939d8, float:1.8240458E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14 = r1
            goto L_0x006a
        L_0x0069:
            r14 = 0
        L_0x006a:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0079
            r2 = 2131311078(0x7f0939e6, float:1.8240486E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r15 = r1
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0087
            r2 = 2131311077(0x7f0939e5, float:1.8240484E38)
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
        L_0x0087:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0096
            r2 = 2131311079(0x7f0939e7, float:1.8240488E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7 = r1
            goto L_0x0097
        L_0x0096:
            r7 = 0
        L_0x0097:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x00a6
            r2 = 2131311083(0x7f0939eb, float:1.8240496E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6 = r1
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x00b6
            r2 = 2131307913(0x7f092d89, float:1.8234067E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r5 = r1
            goto L_0x00b7
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x00c6
            r2 = 2131311065(0x7f0939d9, float:1.824046E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4 = r1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x00d6
            r2 = 2131311082(0x7f0939ea, float:1.8240494E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = r1
            goto L_0x00d7
        L_0x00d6:
            r3 = 0
        L_0x00d7:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x00e6
            r2 = 2131311086(0x7f0939ee, float:1.8240502E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r1
            goto L_0x00e7
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x00f4
            r12 = 2131301075(0x7f0912d3, float:1.8220198E38)
            android.view.View r1 = r1.findViewById(r12)
            r12 = r1
            goto L_0x00f5
        L_0x00f4:
            r12 = 0
        L_0x00f5:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0104
            r10 = 2131316145(0x7f094db1, float:1.8250763E38)
            android.view.View r1 = r1.findViewById(r10)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10 = r1
            goto L_0x0105
        L_0x0104:
            r10 = 0
        L_0x0105:
            android.view.View r1 = r8.f42291g
            if (r1 == 0) goto L_0x0114
            r9 = 2131297776(0x7f0905f0, float:1.8213506E38)
            android.view.View r1 = r1.findViewById(r9)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r9 = r1
            goto L_0x0115
        L_0x0114:
            r9 = 0
        L_0x0115:
            android.view.View r1 = r8.f42291g
            r16 = r2
            if (r1 == 0) goto L_0x0126
            r2 = 2131306739(0x7f0928f3, float:1.8231686E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = r1
            goto L_0x0127
        L_0x0126:
            r2 = 0
        L_0x0127:
            android.view.View r1 = r8.f42291g
            r17 = r2
            if (r1 == 0) goto L_0x0138
            r2 = 2131315724(0x7f094c0c, float:1.824991E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r1
            goto L_0x0139
        L_0x0138:
            r2 = 0
        L_0x0139:
            android.view.View r1 = r8.f42291g
            r18 = r2
            if (r1 == 0) goto L_0x014a
            r2 = 2131306738(0x7f0928f2, float:1.8231684E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = r1
            goto L_0x014b
        L_0x014a:
            r2 = 0
        L_0x014b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r19 = r1
            T r1 = r8.f33564d
            te3.ah1 r1 = (te3.C48713ah1) r1
            if (r1 == 0) goto L_0x017d
            te3.z74 r1 = r1.f130516g
            if (r1 == 0) goto L_0x017d
            int r1 = r1.f145744e
            r8.f42292h = r1
            r20 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r21 = r3
            java.lang.String r3 = "refreshHeader poiSourceFlag:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0181
        L_0x017d:
            r20 = r2
            r21 = r3
        L_0x0181:
            te3.je3 r1 = r11.f140264d
            if (r1 == 0) goto L_0x0193
            te3.se3 r2 = r1.f136054f
            if (r2 == 0) goto L_0x0193
            float r3 = r2.f141463e
            r8.f42295n = r3
            float r2 = r2.f141462d
            r8.f42296o = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0193:
            boolean r2 = r8.f42301t
            if (r2 != 0) goto L_0x01d9
            if (r1 == 0) goto L_0x019d
            java.lang.String r1 = r1.f136053e
            r3 = r1
            goto L_0x019e
        L_0x019d:
            r3 = 0
        L_0x019e:
            r22 = 0
            r23 = 0
            r24 = 12
            r25 = 0
            r2 = r19
            r1 = r39
            r33 = r2
            r35 = r16
            r31 = r17
            r32 = r18
            r34 = r20
            r2 = r0
            r36 = r21
            r16 = r4
            r4 = r22
            r37 = r5
            r5 = r23
            r38 = r6
            r6 = r24
            r17 = r7
            r7 = r25
            m14648m3(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x01d1
            android.text.TextPaint r0 = r0.getPaint()
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r1)
            goto L_0x01ed
        L_0x01d9:
            r37 = r5
            r38 = r6
            r35 = r16
            r31 = r17
            r32 = r18
            r33 = r19
            r34 = r20
            r36 = r21
            r16 = r4
            r17 = r7
        L_0x01ed:
            java.lang.String r0 = "Name="
            r7 = r33
            r7.append(r0)
            te3.je3 r0 = r11.f140264d
            if (r0 == 0) goto L_0x01fb
            java.lang.String r0 = r0.f136053e
            goto L_0x01fc
        L_0x01fb:
            r0 = 0
        L_0x01fc:
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0201
            r0 = r6
        L_0x0201:
            r7.append(r0)
            te3.je3 r0 = r11.f140264d
            if (r0 == 0) goto L_0x020b
            java.lang.String r1 = r0.f136053e
            goto L_0x020c
        L_0x020b:
            r1 = 0
        L_0x020c:
            if (r1 != 0) goto L_0x020f
            r1 = r6
        L_0x020f:
            r8.f42298q = r1
            T r1 = r8.f33564d
            te3.ah1 r1 = (te3.C48713ah1) r1
            if (r1 == 0) goto L_0x021e
            int r1 = r1.f130519j
            r2 = 1
            if (r1 != r2) goto L_0x021e
            r1 = 1
            goto L_0x021f
        L_0x021e:
            r1 = 0
        L_0x021f:
            r5 = 8
            if (r1 != 0) goto L_0x03ff
            boolean r1 = r8.f42301t
            if (r1 != 0) goto L_0x0246
            if (r0 == 0) goto L_0x022d
            java.lang.String r0 = r0.f136057i
            r3 = r0
            goto L_0x022e
        L_0x022d:
            r3 = 0
        L_0x022e:
            r4 = 0
            r0 = 0
            r18 = 12
            r19 = 0
            r1 = r39
            r2 = r13
            r13 = 8
            r5 = r0
            r13 = r6
            r6 = r18
            r33 = r10
            r10 = r7
            r7 = r19
            m14648m3(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x024a
        L_0x0246:
            r13 = r6
            r33 = r10
            r10 = r7
        L_0x024a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.f42292h
            r2 = 4
            if (r1 == r2) goto L_0x0284
            te3.je3 r1 = r11.f140264d
            if (r1 == 0) goto L_0x025b
            java.lang.String r1 = r1.f136060o
            goto L_0x025c
        L_0x025b:
            r1 = 0
        L_0x025c:
            if (r1 != 0) goto L_0x0260
            r6 = r13
            goto L_0x0261
        L_0x0260:
            r6 = r1
        L_0x0261:
            r0.append(r6)
            te3.je3 r1 = r11.f140264d
            if (r1 == 0) goto L_0x026b
            java.lang.String r1 = r1.f136061p
            goto L_0x026c
        L_0x026b:
            r1 = 0
        L_0x026c:
            if (r1 != 0) goto L_0x0270
            r6 = r13
            goto L_0x0271
        L_0x0270:
            r6 = r1
        L_0x0271:
            r0.append(r6)
            te3.je3 r1 = r11.f140264d
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = r1.f136062q
            goto L_0x027c
        L_0x027b:
            r1 = 0
        L_0x027c:
            if (r1 != 0) goto L_0x0280
            r6 = r13
            goto L_0x0281
        L_0x0280:
            r6 = r1
        L_0x0281:
            r0.append(r6)
        L_0x0284:
            te3.je3 r1 = r11.f140264d
            if (r1 == 0) goto L_0x028b
            java.lang.String r1 = r1.f136063r
            goto L_0x028c
        L_0x028b:
            r1 = 0
        L_0x028c:
            if (r1 != 0) goto L_0x0290
            r6 = r13
            goto L_0x0291
        L_0x0290:
            r6 = r1
        L_0x0291:
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "sb.toString()"
            gy3.C87412m.m108593f(r1, r0)
            te3.m74 r0 = new te3.m74
            r0.<init>()
            android.content.Intent r2 = r39.getIntent()
            java.lang.String r3 = "key_location"
            byte[] r2 = r2.getByteArrayExtra(r3)
            if (r2 != 0) goto L_0x02b0
            goto L_0x02c2
        L_0x02b0:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x02b4 }
            goto L_0x02c3
        L_0x02b4:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r13, r0)
        L_0x02c2:
            r0 = 0
        L_0x02c3:
            xd1.m r2 = new xd1.m
            r2.<init>(r0, r8)
            boolean r0 = r8.f42301t
            if (r0 != 0) goto L_0x0363
            T r0 = r8.f33564d
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x02d9
            int r0 = r0.f130525s
            r3 = 1
            if (r0 != r3) goto L_0x02d9
            r0 = 1
            goto L_0x02da
        L_0x02d9:
            r0 = 0
        L_0x02da:
            if (r0 == 0) goto L_0x0316
            if (r14 != 0) goto L_0x02df
            goto L_0x02e3
        L_0x02df:
            r1 = 0
            r14.setVisibility(r1)
        L_0x02e3:
            if (r14 == 0) goto L_0x02eb
            r1 = 0
            r14.setOnClickListener(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02eb:
            if (r14 != 0) goto L_0x02ee
            goto L_0x02f5
        L_0x02ee:
            te3.je3 r0 = r11.f140264d
            java.lang.String r0 = r0.f136056h
            r14.setText(r0)
        L_0x02f5:
            if (r14 == 0) goto L_0x030b
            android.app.Activity r0 = r39.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099674(0x7f06001a, float:1.7811708E38)
            int r0 = r0.getColor(r1)
            r14.setTextColor(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x030b:
            if (r15 != 0) goto L_0x0310
            r7 = 8
            goto L_0x0353
        L_0x0310:
            r7 = 8
            r15.setVisibility(r7)
            goto L_0x0353
        L_0x0316:
            r7 = 8
            if (r14 == 0) goto L_0x032e
            android.app.Activity r0 = r39.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131101252(0x7f060644, float:1.7814908E38)
            int r0 = r0.getColor(r3)
            r14.setTextColor(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x032e:
            r0 = 2131829434(0x7f1122ba, float:1.9291837E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.mo14392l3(r14, r1, r0, r2)
            if (r15 != 0) goto L_0x033b
            goto L_0x0347
        L_0x033b:
            if (r14 == 0) goto L_0x0342
            int r5 = r14.getVisibility()
            goto L_0x0344
        L_0x0342:
            r5 = 8
        L_0x0344:
            r15.setVisibility(r5)
        L_0x0347:
            if (r15 == 0) goto L_0x0353
            xd1.k r0 = new xd1.k
            r0.<init>(r2)
            r15.setOnClickListener(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0353:
            te3.je3 r0 = r11.f140264d
            if (r0 == 0) goto L_0x035a
            java.lang.String r0 = r0.f136056h
            goto L_0x035b
        L_0x035a:
            r0 = 0
        L_0x035b:
            if (r0 != 0) goto L_0x035f
            r6 = r13
            goto L_0x0360
        L_0x035f:
            r6 = r0
        L_0x0360:
            r8.f42297p = r6
            goto L_0x0365
        L_0x0363:
            r7 = 8
        L_0x0365:
            r0 = 124(0x7c, float:1.74E-43)
            r10.append(r0)
            java.lang.String r1 = "Nation="
            r10.append(r1)
            te3.je3 r1 = r11.f140264d
            if (r1 == 0) goto L_0x0376
            java.lang.String r1 = r1.f136065t
            goto L_0x0377
        L_0x0376:
            r1 = 0
        L_0x0377:
            if (r1 != 0) goto L_0x037b
            r6 = r13
            goto L_0x037c
        L_0x037b:
            r6 = r1
        L_0x037c:
            r10.append(r6)
            r10.append(r0)
            java.lang.String r0 = "Province="
            r10.append(r0)
            te3.je3 r0 = r11.f140264d
            if (r0 == 0) goto L_0x038e
            java.lang.String r0 = r0.f136060o
            goto L_0x038f
        L_0x038e:
            r0 = 0
        L_0x038f:
            if (r0 != 0) goto L_0x0393
            r6 = r13
            goto L_0x0394
        L_0x0393:
            r6 = r0
        L_0x0394:
            r10.append(r6)
            te3.ke3 r0 = r11.f140271n
            if (r0 == 0) goto L_0x03aa
            java.lang.String r0 = r0.f136719d
            if (r0 == 0) goto L_0x03aa
            java.lang.String r1 = "\n"
            java.lang.String r2 = " "
            r3 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r1, r2, r3)
            r3 = r0
            goto L_0x03ab
        L_0x03aa:
            r3 = 0
        L_0x03ab:
            r0 = 2131829436(0x7f1122bc, float:1.9291841E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r6 = 8
            r0 = 0
            r1 = r39
            r2 = r17
            r14 = 8
            r7 = r0
            m14648m3(r1, r2, r3, r4, r5, r6, r7)
            te3.te3 r0 = r11.f140265e
            if (r0 == 0) goto L_0x03cb
            java.lang.String r0 = r0.f142173j
            r1 = r37
            r2 = r38
            goto L_0x03d0
        L_0x03cb:
            r1 = r37
            r2 = r38
            r0 = 0
        L_0x03d0:
            r3 = 0
            r8.mo14391k3(r2, r1, r0, r3)
            te3.te3 r0 = r11.f140265e
            r1 = 0
            if (r0 == 0) goto L_0x03dc
            float r2 = r0.f142168e
            goto L_0x03dd
        L_0x03dc:
            r2 = 0
        L_0x03dd:
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x03e9
            if (r0 == 0) goto L_0x03e7
            java.lang.String r0 = r0.f142181u
            r3 = r0
            goto L_0x03ea
        L_0x03e7:
            r3 = 0
            goto L_0x03ea
        L_0x03e9:
            r3 = r13
        L_0x03ea:
            r0 = 2131829438(0x7f1122be, float:1.9291845E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r39
            r2 = r16
            m14648m3(r1, r2, r3, r4, r5, r6, r7)
            r1 = 8
            goto L_0x0437
        L_0x03ff:
            r33 = r10
            r2 = r38
            r1 = 8
            r10 = r7
            if (r13 != 0) goto L_0x0409
            goto L_0x040c
        L_0x0409:
            r13.setVisibility(r1)
        L_0x040c:
            android.view.View r0 = r8.f42291g
            if (r0 == 0) goto L_0x041a
            r3 = 2131312586(0x7f093fca, float:1.8243545E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            goto L_0x041b
        L_0x041a:
            r0 = 0
        L_0x041b:
            if (r0 != 0) goto L_0x041e
            goto L_0x0421
        L_0x041e:
            r0.setVisibility(r1)
        L_0x0421:
            r3 = r17
            if (r3 != 0) goto L_0x0426
            goto L_0x0429
        L_0x0426:
            r3.setVisibility(r1)
        L_0x0429:
            if (r2 != 0) goto L_0x042c
            goto L_0x042f
        L_0x042c:
            r2.setVisibility(r1)
        L_0x042f:
            r2 = r16
            if (r2 != 0) goto L_0x0434
            goto L_0x0437
        L_0x0434:
            r2.setVisibility(r1)
        L_0x0437:
            java.lang.String r0 = r10.toString()
            java.lang.String r2 = "sbReport.toString()"
            gy3.C87412m.m108593f(r0, r2)
            r8.f42294j = r0
            T r0 = r8.f33564d
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = r0.f130518i
            goto L_0x044d
        L_0x044c:
            r0 = 0
        L_0x044d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x045d
            r2 = r36
            if (r2 != 0) goto L_0x0458
        L_0x0457:
            goto L_0x045b
        L_0x0458:
            r2.setVisibility(r1)
        L_0x045b:
            r3 = 0
            goto L_0x0476
        L_0x045d:
            r2 = r36
            if (r2 != 0) goto L_0x0462
            goto L_0x046f
        L_0x0462:
            T r0 = r8.f33564d
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = r0.f130518i
            goto L_0x046c
        L_0x046b:
            r0 = 0
        L_0x046c:
            r2.setText(r0)
        L_0x046f:
            if (r2 != 0) goto L_0x0472
            goto L_0x0457
        L_0x0472:
            r3 = 0
            r2.setVisibility(r3)
        L_0x0476:
            if (r9 != 0) goto L_0x047a
            goto L_0x0522
        L_0x047a:
            T r0 = r8.f33564d
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x051d
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f130517h
            if (r0 == 0) goto L_0x051d
            r2 = 3
            r4 = 0
            fe1.q r0 = fe1.C58960c.m68834f(r0, r4, r3, r2, r4)
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            r4 = r31
            if (r4 == 0) goto L_0x04c0
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r6 = r5.mo62446e(r3)
            bl3.c r6 = r6.mo62447c(r2)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11872i2()
            pl1.f r7 = new pl1.f
            java.lang.String r10 = r0.getAvatarUrl()
            r11 = 2
            r13 = 0
            r7.<init>(r10, r13, r11, r13)
            pl1.e0$a r10 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r3 = r5.mo62446e(r3)
            bl3.c r2 = r3.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r10)
            r6.mo85957c(r7, r4, r2)
        L_0x04c0:
            r2 = r32
            if (r2 != 0) goto L_0x04c5
            goto L_0x04dc
        L_0x04c5:
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.app.Activity r4 = r39.getContext()
            java.lang.String r5 = r0.getNickname()
            android.text.SpannableString r3 = r3.mo107057T1(r4, r5)
            r2.setText(r3)
        L_0x04dc:
            r2 = r34
            if (r2 != 0) goto L_0x04e1
            goto L_0x0500
        L_0x04e1:
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = r0.field_authInfo
            if (r3 == 0) goto L_0x04fb
            er1.w3 r24 = er1.C58784w3.f168295a
            r27 = 0
            r4 = 0
            te3.cg r28 = fe1.C58960c.m68830b(r0, r4)
            r29 = 4
            r30 = 0
            r25 = r2
            r26 = r3
            er1.C58784w3.m68429F1(r24, r25, r26, r27, r28, r29, r30)
            r3 = 0
            goto L_0x04fd
        L_0x04fb:
            r3 = 8
        L_0x04fd:
            r2.setVisibility(r3)
        L_0x0500:
            xd1.l r2 = new xd1.l
            r2.<init>(r0, r8)
            r9.setOnClickListener(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = r8.f42298q
            java.lang.String r0 = r0.getUsername()
            r3 = 0
            r8.mo14393n3(r3, r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int r5 = r0.intValue()
            goto L_0x051f
        L_0x051d:
            r5 = 8
        L_0x051f:
            r9.setVisibility(r5)
        L_0x0522:
            T r0 = r8.f33564d
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x052b
            int r0 = r0.f130520n
            goto L_0x052c
        L_0x052b:
            r0 = 0
        L_0x052c:
            r8.f42299r = r0
            r2 = r35
            if (r2 != 0) goto L_0x0534
            goto L_0x05b4
        L_0x0534:
            if (r0 <= 0) goto L_0x05ab
            r0 = 1
            r8.f42293i = r0
            if (r12 != 0) goto L_0x053d
            goto L_0x0580
        L_0x053d:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r3)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC"
            java.lang.String r19 = "refreshHeader"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r12
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC"
            java.lang.String r18 = "refreshHeader"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0580:
            if (r33 != 0) goto L_0x0586
            r1 = r33
            r3 = 0
            goto L_0x058c
        L_0x0586:
            r1 = r33
            r3 = 0
            r1.setVisibility(r3)
        L_0x058c:
            int r0 = r8.f42299r
            long r4 = (long) r0
            java.lang.String r0 = er1.C7878t0.m8035d(r4)
            if (r1 != 0) goto L_0x0596
            goto L_0x05a9
        L_0x0596:
            android.app.Activity r4 = r39.getContext()
            r5 = 2131829441(0x7f1122c1, float:1.9291851E38)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            java.lang.String r0 = r4.getString(r5, r6)
            r1.setText(r0)
        L_0x05a9:
            r10 = 0
            goto L_0x05b1
        L_0x05ab:
            r3 = 0
            r8.f42293i = r3
            r10 = 8
        L_0x05b1:
            r2.setVisibility(r10)
        L_0x05b4:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15644c.mo315j3():void");
    }

    /* renamed from: k3 */
    public final void mo14391k3(TextView textView, LinearLayout linearLayout, String str, Integer num) {
        List<String> T = str != null ? C112550d0.m153784T(str, new char[]{';'}, false, 0, 6, (Object) null) : null;
        C15647c cVar = new C15647c(this);
        if (!(num == null || textView == null)) {
            textView.setTextColor(num.intValue());
        }
        if ((T != null ? T.size() : 0) > 1) {
            if (textView != null) {
                textView.setText(getContext().getString(C0966R.string.ehf, new Object[]{""}));
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            if (T != null) {
                for (String str2 : T) {
                    TextView textView2 = new TextView(getContext());
                    textView2.setText(str2);
                    if (textView != null) {
                        textView2.setLayoutParams(textView.getLayoutParams());
                    }
                    if (num != null) {
                        textView2.setTextColor(num.intValue());
                    }
                    if (linearLayout != null) {
                        linearLayout.addView(textView2);
                    }
                    mo14394o3(textView2, str2, str2, new C15645a(cVar, str2));
                }
                return;
            }
            return;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        mo14392l3(textView, str, Integer.valueOf(C0966R.string.ehf), new C15646b(cVar, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6 = r6.intValue();
     */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14392l3(android.widget.TextView r4, java.lang.String r5, java.lang.Integer r6, fy3.C32224a<rx3.C13598b0> r7) {
        /*
            r3 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            r5 = 8
            r4.setVisibility(r5)
        L_0x000e:
            return
        L_0x000f:
            r0 = 0
            if (r4 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r4.setVisibility(r0)
        L_0x0016:
            if (r4 != 0) goto L_0x0019
            goto L_0x0033
        L_0x0019:
            if (r6 == 0) goto L_0x002f
            int r6 = r6.intValue()
            android.app.Activity r1 = r3.getContext()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r5
            java.lang.String r6 = r1.getString(r6, r2)
            if (r6 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r6 = r5
        L_0x0030:
            r4.setText(r6)
        L_0x0033:
            if (r7 == 0) goto L_0x0044
            if (r4 == 0) goto L_0x0044
            if (r5 == 0) goto L_0x0044
            java.lang.CharSequence r6 = r4.getText()
            java.lang.String r6 = r6.toString()
            r3.mo14394o3(r4, r6, r5, r7)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15644c.mo14392l3(android.widget.TextView, java.lang.String, java.lang.Integer, fy3.a):void");
    }

    /* renamed from: n3 */
    public final void mo14393n3(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("poi_name", str);
        jSONObject.put("finderusername", str2);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        y0Var.Cx0(i, "poi_channelaccount", n, f != null ? f.mo12861q3() : null);
    }

    /* renamed from: o3 */
    public final void mo14394o3(TextView textView, String str, String str2, C32224a<C13598b0> aVar) {
        int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + E;
        if (E <= 0 || length > str.length()) {
            E = 0;
            length = str.length();
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C15648d(aVar, textView), E, length, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }
}
