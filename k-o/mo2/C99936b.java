package mo2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import kg3.C76577a;
import qs2.C101253a;
import so2.C101677l;
import vr2.C102260r;

/* renamed from: mo2.b */
public class C99936b {

    /* renamed from: a */
    public int f292811a;

    /* renamed from: b */
    public Context f292812b;

    /* renamed from: c */
    public View f292813c;

    /* renamed from: d */
    public View f292814d;

    /* renamed from: e */
    public View f292815e;

    /* renamed from: f */
    public TextView f292816f;

    /* renamed from: g */
    public TextView f292817g;

    /* renamed from: h */
    public TextView f292818h;

    /* renamed from: i */
    public ImageView f292819i;

    /* renamed from: j */
    public FrameLayout f292820j;

    /* renamed from: k */
    public C101253a f292821k;

    /* renamed from: l */
    public View f292822l;

    /* renamed from: m */
    public TextView f292823m;

    /* renamed from: n */
    public View f292824n;

    /* renamed from: o */
    public TextView f292825o;

    /* renamed from: p */
    public ImageView f292826p;

    /* renamed from: q */
    public TextView f292827q;

    /* renamed from: r */
    public TextView f292828r;

    /* renamed from: s */
    public WeImageView f292829s;

    /* renamed from: t */
    public View f292830t;

    /* renamed from: u */
    public TextView f292831u;

    /* renamed from: v */
    public GradientDrawable f292832v;

    /* renamed from: w */
    public Drawable f292833w;

    /* renamed from: g */
    public static C99936b m130556g(Context context, ViewGroup viewGroup, int i) {
        SnsMethodCalculate.markStartTimeMs("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        View inflate = i == 1 ? LayoutInflater.from(context).inflate(C0966R.C0971layout.c19, viewGroup, false) : i == 2 ? LayoutInflater.from(context).inflate(C0966R.C0971layout.c1_, viewGroup, false) : null;
        if (inflate != null) {
            C99936b bVar = new C99936b();
            SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            bVar.f292812b = context;
            bVar.f292811a = i;
            bVar.f292813c = inflate;
            bVar.f292815e = inflate.findViewById(C0966R.C0970id.br8);
            bVar.f292814d = inflate.findViewById(C0966R.C0970id.jfd);
            bVar.f292816f = (TextView) inflate.findViewById(C0966R.C0970id.evm);
            bVar.f292817g = (TextView) inflate.findViewById(C0966R.C0970id.kpo);
            bVar.f292818h = (TextView) inflate.findViewById(C0966R.C0970id.c2j);
            bVar.f292819i = (ImageView) inflate.findViewById(C0966R.C0970id.ett);
            bVar.f292820j = (FrameLayout) inflate.findViewById(C0966R.C0970id.olw);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f357579al0);
            bVar.f292823m = textView;
            if (i == 1) {
                bVar.f292822l = textView;
            } else {
                bVar.f292822l = inflate.findViewById(C0966R.C0970id.alv);
            }
            bVar.f292824n = inflate.findViewById(C0966R.C0970id.f359160jc2);
            bVar.f292825o = (TextView) inflate.findViewById(C0966R.C0970id.f359161jc3);
            bVar.f292826p = (ImageView) inflate.findViewById(C0966R.C0970id.f359159jc1);
            bVar.f292827q = (TextView) inflate.findViewById(C0966R.C0970id.jc4);
            bVar.f292831u = (TextView) inflate.findViewById(C0966R.C0970id.bzs);
            bVar.f292829s = (WeImageView) inflate.findViewById(C0966R.C0970id.f98);
            bVar.f292828r = (TextView) inflate.findViewById(C0966R.C0970id.f9_);
            bVar.f292830t = inflate.findViewById(C0966R.C0970id.f99);
            try {
                int w = C102260r.m134883w();
                Log.m105924i("HBCardViewWrapper", "fontSizeIndx=" + w);
                if (C102260r.m134883w() > 1) {
                    Log.m105924i("HBCardViewWrapper", "adapter old mode");
                    bVar.mo139275a(i);
                    bVar.mo139276b();
                } else {
                    Log.m105924i("HBCardViewWrapper", "adapter normal mode");
                }
            } catch (Throwable th) {
                Log.m105920e("HBCardViewWrapper", "adapter oldMode exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            SnsMethodCalculate.markEndTimeMs("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return bVar;
        }
        SnsMethodCalculate.markEndTimeMs("inflateCard", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        return null;
    }

    /* renamed from: a */
    public void mo139275a(int i) {
        SnsMethodCalculate.markStartTimeMs("adapterFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        mo139286m(this.f292816f, C0966R.dimen.ano);
        if (i == 1) {
            mo139286m(this.f292817g, C0966R.dimen.anq);
            mo139286m(this.f292818h, C0966R.dimen.ann);
            mo139286m(this.f292828r, C0966R.dimen.ann);
        } else {
            mo139286m(this.f292825o, C0966R.dimen.ano);
            mo139286m(this.f292827q, C0966R.dimen.ano);
            mo139286m(this.f292831u, C0966R.dimen.anm);
            mo139286m(this.f292817g, C0966R.dimen.ano);
            mo139286m(this.f292818h, C0966R.dimen.ann);
        }
        mo139286m(this.f292823m, C0966R.dimen.ano);
        SnsMethodCalculate.markEndTimeMs("adapterFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: b */
    public void mo139276b() {
        SnsMethodCalculate.markStartTimeMs("adapterLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        mo139287n(this.f292819i, 110, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD);
        mo139287n(this.f292820j, 150, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD);
        mo139287n(this.f292822l, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, 40);
        int i = this.f292811a;
        if (i == 1) {
            mo139288o(this.f292816f, 45);
            mo139288o(this.f292817g, 20);
            mo139288o(this.f292818h, 8);
            mo139288o(this.f292819i, 30);
            mo139288o(this.f292820j, 30);
            mo139288o(this.f292822l, 30);
            mo139288o(this.f292830t, 24);
        } else if (i == 2) {
            mo139288o(this.f292816f, 50);
            mo139288o(this.f292824n, 50);
            mo139288o(this.f292813c.findViewById(C0966R.C0970id.etu), 40);
            mo139287n(this.f292813c.findViewById(C0966R.C0970id.bzr), 150, 18);
            mo139287n(this.f292831u, 118, 27);
            mo139288o(this.f292817g, 22);
            mo139288o(this.f292818h, 10);
            mo139288o(this.f292822l, 20);
        }
        SnsMethodCalculate.markEndTimeMs("adapterLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: c */
    public void mo139277c() {
        SnsMethodCalculate.markStartTimeMs("cardAppeared", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        Log.m105918d("AdLandingHBCardComponent.HBCardViewWrapper", "card cardAppeared, uiType=" + this.f292811a + ", root.visibility=" + this.f292813c.getVisibility() + ", videoComp=" + this.f292821k);
        C101253a aVar = this.f292821k;
        if (aVar != null) {
            aVar.mo130145A();
        }
        SnsMethodCalculate.markEndTimeMs("cardAppeared", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: d */
    public void mo139278d() {
        SnsMethodCalculate.markStartTimeMs("cardWillAppear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        Log.m105918d("AdLandingHBCardComponent.HBCardViewWrapper", "card cardWillAppear, uiType=" + this.f292811a + ", root.visibility=" + this.f292813c.getVisibility() + ", videoComp=" + this.f292821k);
        C101253a aVar = this.f292821k;
        if (aVar != null) {
            aVar.mo124360B();
        }
        SnsMethodCalculate.markEndTimeMs("cardWillAppear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: e */
    public void mo139279e() {
        SnsMethodCalculate.markStartTimeMs("cardWillDestroy", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        Log.m105918d("AdLandingHBCardComponent.HBCardViewWrapper", "card cardWillDestroy, uiType=" + this.f292811a + ", root.visibility=" + this.f292813c.getVisibility() + ", videoComp=" + this.f292821k);
        C101253a aVar = this.f292821k;
        if (aVar != null) {
            aVar.mo67235C();
        }
        SnsMethodCalculate.markEndTimeMs("cardWillDestroy", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: f */
    public void mo139280f() {
        SnsMethodCalculate.markStartTimeMs("cardWillDisappear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        Log.m105918d("AdLandingHBCardComponent.HBCardViewWrapper", "card cardWillDisappear, uiType=" + this.f292811a + ", root.visibility=" + this.f292813c.getVisibility() + ", videoComp=" + this.f292821k);
        C101253a aVar = this.f292821k;
        if (aVar != null) {
            aVar.mo124361D();
        }
        SnsMethodCalculate.markEndTimeMs("cardWillDisappear", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: h */
    public void mo139281h(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setBtnEnabled", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (z) {
            this.f292832v.setAlpha(255);
            this.f292822l.setBackground(this.f292832v);
            this.f292822l.setEnabled(true);
        } else {
            this.f292832v.setAlpha(153);
            this.f292822l.setBackground(this.f292832v);
            this.f292822l.setEnabled(false);
        }
        SnsMethodCalculate.markEndTimeMs("setBtnEnabled", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: i */
    public void mo139282i(int i) {
        TextView textView;
        Drawable drawable;
        SnsMethodCalculate.markStartTimeMs("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (this.f292811a != 2 || (textView = this.f292823m) == null) {
            SnsMethodCalculate.markEndTimeMs("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        if (i != 0 || (drawable = this.f292833w) == null) {
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f292823m.setCompoundDrawablePadding(0);
        } else {
            textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f292823m.setCompoundDrawablePadding(C76577a.m92151b(this.f292812b, 8));
        }
        SnsMethodCalculate.markEndTimeMs("setBtnIconVisibility", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: j */
    public void mo139283j(String str) {
        SnsMethodCalculate.markStartTimeMs("setBtnText", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f292823m.setText(str);
        SnsMethodCalculate.markEndTimeMs("setBtnText", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: k */
    public void mo139284k(C101677l.C101678a aVar) {
        SnsMethodCalculate.markStartTimeMs("setCardInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        this.f292816f.setText(aVar.f297645a);
        this.f292818h.setText(aVar.f297646b);
        mo139283j(aVar.f297648d);
        mo139281h(true);
        this.f292813c.setRotation(0.0f);
        TextView textView = this.f292831u;
        if (textView != null) {
            textView.setText(aVar.f297647c);
        }
        SnsMethodCalculate.markEndTimeMs("setCardInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0113 A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0123 A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0145 A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b7  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139285l(so2.C101677l r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "AdLandingHBCardComponent.HBCardViewWrapper"
            java.lang.String r4 = "HBCardViewWrapper"
            java.lang.String r5 = "setCommonInfo"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            android.widget.TextView r0 = r1.f292817g
            java.lang.String r7 = r2.f297634C
            r0.setText(r7)
            r7 = 2
            java.lang.String r0 = r2.f297640I     // Catch:{ Exception -> 0x0049 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0049 }
            r8 = 2131756448(0x7f1005a0, float:1.9143804E38)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = r2.f297640I     // Catch:{ Exception -> 0x0049 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0049 }
            android.widget.TextView r9 = r1.f292823m     // Catch:{ Exception -> 0x0049 }
            r9.setTextColor(r0)     // Catch:{ Exception -> 0x0049 }
            int r9 = r1.f292811a     // Catch:{ Exception -> 0x0049 }
            if (r9 != r7) goto L_0x0060
            android.content.Context r9 = r1.f292812b     // Catch:{ Exception -> 0x0049 }
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r9, r8, r0)     // Catch:{ Exception -> 0x0049 }
            r1.f292833w = r0     // Catch:{ Exception -> 0x0049 }
            goto L_0x0060
        L_0x003b:
            int r0 = r1.f292811a     // Catch:{ Exception -> 0x0049 }
            if (r0 != r7) goto L_0x0060
            android.content.Context r0 = r1.f292812b     // Catch:{ Exception -> 0x0049 }
            r9 = -1
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r8, r9)     // Catch:{ Exception -> 0x0049 }
            r1.f292833w = r0     // Catch:{ Exception -> 0x0049 }
            goto L_0x0060
        L_0x0049:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "parse btnTxtColor exp, color="
            r0.append(r8)
            java.lang.String r8 = r2.f297640I
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0060:
            android.graphics.drawable.Drawable r0 = r1.f292833w
            r8 = 0
            if (r0 == 0) goto L_0x0072
            android.content.Context r0 = r1.f292812b
            r9 = 16
            int r0 = kg3.C76577a.m92151b(r0, r9)
            android.graphics.drawable.Drawable r9 = r1.f292833w
            r9.setBounds(r8, r8, r0, r0)
        L_0x0072:
            java.lang.String r9 = r2.f297641J
            float r0 = r2.f297642K
            java.lang.String r10 = "createBgDrawable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            r11.setShape(r8)     // Catch:{ all -> 0x008e }
            r11.setCornerRadius(r0)     // Catch:{ all -> 0x008e }
            int r0 = android.graphics.Color.parseColor(r9)     // Catch:{ all -> 0x008e }
            r11.setColor(r0)     // Catch:{ all -> 0x008e }
            goto L_0x00af
        L_0x008e:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "createBgDrawable exp="
            r12.append(r13)
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r0 = ", bgColor="
            r12.append(r0)
            r12.append(r9)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x00af:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            r1.f292832v = r11
            int r0 = r2.f296504j
            r9 = 8
            if (r0 != 0) goto L_0x00cd
            android.widget.ImageView r0 = r1.f292819i
            r0.setVisibility(r8)
            android.widget.FrameLayout r0 = r1.f292820j
            r0.setVisibility(r9)
            java.lang.String r0 = r2.f297632A
            android.widget.ImageView r3 = r1.f292819i
            rq2.C101419f.m133080c(r0, r3)
            goto L_0x01b3
        L_0x00cd:
            r10 = 1
            if (r0 != r10) goto L_0x01b3
            android.widget.ImageView r0 = r1.f292819i
            r0.setVisibility(r9)
            android.widget.FrameLayout r0 = r1.f292820j
            r0.setVisibility(r8)
            qs2.f r0 = r2.f297633B
            if (r0 == 0) goto L_0x01b3
            android.content.Context r9 = r1.f292812b
            android.widget.FrameLayout r10 = r1.f292820j
            java.lang.String r11 = "initVideoComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r6)
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0177 }
            r13.<init>(r8, r8)     // Catch:{ all -> 0x0177 }
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()     // Catch:{ all -> 0x0177 }
            float r15 = r0.f296507m     // Catch:{ all -> 0x0177 }
            r16 = 0
            int r17 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x0100
            float r12 = r0.f296508n     // Catch:{ all -> 0x0177 }
            int r16 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r16 <= 0) goto L_0x0100
            float r15 = r15 / r12
            goto L_0x0103
        L_0x0100:
            r15 = 1058316415(0x3f14a07f, float:0.580574)
        L_0x0103:
            int r12 = r14.width     // Catch:{ all -> 0x0177 }
            float r8 = (float) r12     // Catch:{ all -> 0x0177 }
            r18 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r18
            int r14 = r14.height     // Catch:{ all -> 0x0177 }
            float r7 = (float) r14     // Catch:{ all -> 0x0177 }
            float r19 = r8 / r7
            int r19 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r19 >= 0) goto L_0x0123
            float r15 = r15 * r7
            int r7 = (int) r15     // Catch:{ all -> 0x0177 }
            int r12 = r12 - r7
            r8 = 2
            int r12 = r12 / r8
            r13.width = r7     // Catch:{ all -> 0x0177 }
            r13.height = r14     // Catch:{ all -> 0x0177 }
            r13.leftMargin = r12     // Catch:{ all -> 0x0177 }
            r7 = 3
            r13.gravity = r7     // Catch:{ all -> 0x0177 }
            goto L_0x0132
        L_0x0123:
            float r8 = r8 / r15
            int r7 = (int) r8     // Catch:{ all -> 0x0177 }
            int r14 = r14 - r7
            r8 = 2
            int r14 = r14 / r8
            r13.width = r12     // Catch:{ all -> 0x0177 }
            r13.height = r7     // Catch:{ all -> 0x0177 }
            r13.topMargin = r14     // Catch:{ all -> 0x0177 }
            r7 = 48
            r13.gravity = r7     // Catch:{ all -> 0x0177 }
        L_0x0132:
            int r7 = r13.width     // Catch:{ all -> 0x0177 }
            float r7 = (float) r7     // Catch:{ all -> 0x0177 }
            r0.f296507m = r7     // Catch:{ all -> 0x0177 }
            int r7 = r13.height     // Catch:{ all -> 0x0177 }
            float r7 = (float) r7     // Catch:{ all -> 0x0177 }
            r0.f296508n = r7     // Catch:{ all -> 0x0177 }
            r7 = 0
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r0 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r9, r0, r10, r7)     // Catch:{ all -> 0x0177 }
            boolean r7 = r0 instanceof qs2.C101253a     // Catch:{ all -> 0x0177 }
            if (r7 == 0) goto L_0x0175
            r10.removeAllViews()     // Catch:{ all -> 0x0177 }
            android.view.View r7 = r0.mo131855p()     // Catch:{ all -> 0x0177 }
            r10.addView(r7, r13)     // Catch:{ all -> 0x0177 }
            boolean r7 = r0 instanceof com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l     // Catch:{ all -> 0x0177 }
            if (r7 == 0) goto L_0x016b
            r7 = r0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.l r7 = (com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l) r7     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "delRootBackground"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)     // Catch:{ all -> 0x0177 }
            android.view.View r7 = r7.f273914z     // Catch:{ all -> 0x0177 }
            if (r7 == 0) goto L_0x0166
            r10 = 0
            r7.setBackground(r10)     // Catch:{ all -> 0x0173 }
            goto L_0x0167
        L_0x0166:
            r10 = 0
        L_0x0167:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)     // Catch:{ all -> 0x0173 }
            goto L_0x016c
        L_0x016b:
            r10 = 0
        L_0x016c:
            qs2.a r0 = (qs2.C101253a) r0     // Catch:{ all -> 0x0173 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r6)
            r12 = r0
            goto L_0x0191
        L_0x0173:
            r0 = move-exception
            goto L_0x0179
        L_0x0175:
            r10 = 0
            goto L_0x018d
        L_0x0177:
            r0 = move-exception
            r10 = 0
        L_0x0179:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "initVideoComponent, exp="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x018d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r6)
            r12 = r10
        L_0x0191:
            r1.f292821k = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "initVideoComponent, uiType="
            r0.append(r7)
            int r7 = r1.f292811a
            r0.append(r7)
            java.lang.String r7 = ", videoComp="
            r0.append(r7)
            qs2.a r7 = r1.f292821k
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
        L_0x01b3:
            android.widget.TextView r0 = r1.f292828r
            if (r0 == 0) goto L_0x01ef
            java.lang.String r3 = r2.f297635D
            r0.setText(r3)
            java.lang.String r0 = r2.f297636E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = r2.f297636E     // Catch:{ Exception -> 0x01d5 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x01d5 }
            android.widget.TextView r2 = r1.f292828r     // Catch:{ Exception -> 0x01d5 }
            r2.setTextColor(r0)     // Catch:{ Exception -> 0x01d5 }
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f292829s     // Catch:{ Exception -> 0x01d5 }
            r2.setIconColor(r0)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01ef
        L_0x01d5:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setData, parseColor exp="
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x01ef:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mo2.C99936b.mo139285l(so2.l):void");
    }

    /* renamed from: m */
    public void mo139286m(TextView textView, int i) {
        SnsMethodCalculate.markStartTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (textView == null) {
            SnsMethodCalculate.markEndTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        textView.setTextSize(0, (float) C76577a.m92155f(this.f292812b, i));
        SnsMethodCalculate.markEndTimeMs("setLimitedScaleFontSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: n */
    public final void mo139287n(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        int n = C102260r.m134874n(i);
        int n2 = C102260r.m134874n(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams.width == n && layoutParams.height == n2)) {
            layoutParams.width = n;
            layoutParams.height = n2;
            view.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setViewLayoutSize", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }

    /* renamed from: o */
    public final void mo139288o(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
            return;
        }
        int n = C102260r.m134874n(i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.topMargin != n) {
                marginLayoutParams.topMargin = n;
                view.setLayoutParams(layoutParams);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setViewMarginTop", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardViewWrapper");
    }
}
