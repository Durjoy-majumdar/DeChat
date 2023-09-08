package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsAdInteractionEvent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.interactionlabel.SnsAdInteractionLabelView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import jp2.C98963o;
import jq2.C99012y;
import k20.C60958c;
import k20.C9556a;
import ps2.C100880k;
import up2.C102064e;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.m8 */
public class C96071m8 {

    /* renamed from: a */
    public LinearLayout f280517a;

    /* renamed from: b */
    public TextView f280518b;

    /* renamed from: c */
    public View f280519c;

    /* renamed from: d */
    public TextView f280520d;

    /* renamed from: e */
    public ImageView f280521e;

    /* renamed from: f */
    public ImageView f280522f;

    /* renamed from: g */
    public View f280523g;

    /* renamed from: h */
    public View f280524h;

    /* renamed from: i */
    public View f280525i;

    /* renamed from: j */
    public ADXml f280526j;

    /* renamed from: k */
    public ADInfo f280527k;

    /* renamed from: l */
    public String f280528l = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());

    /* renamed from: m */
    public ViewStub f280529m;

    /* renamed from: n */
    public RoundedCornerFrameLayout f280530n;

    /* renamed from: o */
    public C99012y f280531o;

    /* renamed from: p */
    public ViewStub f280532p;

    /* renamed from: q */
    public SnsAdInteractionLabelView f280533q;

    /* renamed from: r */
    public C102064e.C102069c f280534r;

    /* renamed from: s */
    public int f280535s;

    /* renamed from: t */
    public C98963o f280536t;

    /* renamed from: u */
    public SnsInfo f280537u;

    /* renamed from: com.tencent.mm.plugin.sns.ui.m8$a */
    public class C96072a implements C100880k.C100881a {
        public C96072a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
            if (Util.isNullOrNil(str)) {
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
                return;
            }
            Drawable createFromPath = Drawable.createFromPath(str);
            if (createFromPath != null) {
                C96071m8 m8Var = C96071m8.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
                ImageView imageView = m8Var.f280521e;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
                imageView.setImageDrawable(createFromPath);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$1");
        }
    }

    public C96071m8(View view, C98963o oVar, int i, C102064e.C102069c cVar) {
        this.f280525i = view;
        this.f280535s = i;
        this.f280534r = cVar;
        this.f280536t = oVar;
        Log.m105924i("MicroMsg.TimeLineAdView", "adView init lan " + this.f280528l);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f280518b = (TextView) this.f280525i.findViewById(C0966R.C0970id.f5538hs);
        this.f280520d = (TextView) this.f280525i.findViewById(C0966R.C0970id.f5545hz);
        this.f280521e = (ImageView) this.f280525i.findViewById(C0966R.C0970id.f5544hy);
        this.f280522f = (ImageView) this.f280525i.findViewById(C0966R.C0970id.f5542hw);
        this.f280519c = this.f280525i.findViewById(C0966R.C0970id.f5543hx);
        this.f280523g = this.f280525i.findViewById(C0966R.C0970id.f5539ht);
        this.f280524h = this.f280525i.findViewById(C0966R.C0970id.f5541hv);
        this.f280517a = (LinearLayout) this.f280525i.findViewById(C0966R.C0970id.f5537hr);
        this.f280529m = (ViewStub) this.f280525i.findViewById(C0966R.C0970id.jr7);
        this.f280532p = (ViewStub) this.f280525i.findViewById(C0966R.C0970id.f359234jq0);
        SnsMethodCalculate.markStartTimeMs("initAdTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f280518b.setText(" " + this.f280525i.getResources().getString(C0966R.string.jac) + " ");
        SnsMethodCalculate.markEndTimeMs("initAdTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x051b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133602a(com.tencent.p014mm.plugin.sns.storage.SnsInfo r34, com.tencent.p014mm.plugin.sns.storage.ADXml r35, com.tencent.p014mm.plugin.sns.storage.ADInfo r36) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            r3 = r35
            r0 = r36
            java.lang.String r4 = "initData"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.TimeLineAdView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r1.f280527k = r0
            r1.f280526j = r3
            java.lang.String r6 = "zh_HK"
            java.lang.String r7 = "zh_TW"
            java.lang.String r8 = "zh_CN"
            java.lang.String r9 = ""
            if (r3 == 0) goto L_0x0042
            java.lang.String r10 = r1.f280528l
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L_0x002b
            java.lang.String r10 = r3.adActionLinkTitle_cn
            goto L_0x0043
        L_0x002b:
            java.lang.String r10 = r1.f280528l
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x003f
            java.lang.String r10 = r1.f280528l
            boolean r10 = r6.equals(r10)
            if (r10 == 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            java.lang.String r10 = r3.adActionLinkTitle_en
            goto L_0x0043
        L_0x003f:
            java.lang.String r10 = r3.adActionLinkTitle_tw
            goto L_0x0043
        L_0x0042:
            r10 = r9
        L_0x0043:
            if (r3 == 0) goto L_0x004d
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x004d
            java.lang.String r10 = r3.adActionLinkName
        L_0x004d:
            android.widget.TextView r11 = r1.f280520d
            android.content.Context r13 = r11.getContext()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x0060
            r10 = 2131836836(0x7f113fa4, float:1.930685E38)
            java.lang.String r10 = r13.getString(r10)
        L_0x0060:
            android.widget.TextView r11 = r1.f280520d
            r11.setText(r10)
            android.widget.ImageView r10 = r1.f280522f
            r10.setTag(r9)
            android.widget.ImageView r9 = r1.f280522f
            int r9 = r9.getVisibility()
            r10 = 4
            if (r9 != 0) goto L_0x0078
            android.widget.ImageView r9 = r1.f280522f
            r9.setVisibility(r10)
        L_0x0078:
            r9 = 2131755050(0x7f10002a, float:1.9140968E38)
            r11 = 2131755049(0x7f100029, float:1.9140966E38)
            if (r0 == 0) goto L_0x00aa
            boolean r12 = r36.isWeapp()
            if (r12 == 0) goto L_0x00aa
            boolean r12 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r12 == 0) goto L_0x0092
            android.widget.ImageView r11 = r1.f280521e
            r11.setImageResource(r9)
            goto L_0x0097
        L_0x0092:
            android.widget.ImageView r9 = r1.f280521e
            r9.setImageResource(r11)
        L_0x0097:
            if (r3 == 0) goto L_0x0177
            boolean r9 = r35.isNormalAd()
            if (r9 == 0) goto L_0x0177
            com.tencent.mm.plugin.sns.storage.ADInfo$b r9 = r0.actionExtWeApp
            java.lang.String r9 = r9.f275645a
            android.widget.ImageView r11 = r1.f280522f
            lo2.C88617x.m110484b(r9, r11, r0)
            goto L_0x0177
        L_0x00aa:
            boolean r12 = lo2.C99542h0.m129910h(r35, r36)
            r15 = 2131755048(0x7f100028, float:1.9140964E38)
            r10 = 2131755047(0x7f100027, float:1.9140962E38)
            if (r12 == 0) goto L_0x00ca
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r9 == 0) goto L_0x00c3
            android.widget.ImageView r9 = r1.f280521e
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x00c3:
            android.widget.ImageView r9 = r1.f280521e
            r9.setImageResource(r15)
            goto L_0x0177
        L_0x00ca:
            if (r3 == 0) goto L_0x0160
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r15 = r3.adActionLinkClickInfo
            if (r15 == 0) goto L_0x0160
            java.lang.String r15 = "isTagJumpToFinder"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r14 = r3.adActionLinkClickInfo
            if (r14 == 0) goto L_0x00ec
            int r12 = r14.f273641b
            r11 = 14
            if (r12 != r11) goto L_0x00ec
            java.lang.String r11 = r14.finderUsername
            boolean r11 = p1035sf.C90183c.m112859g(r11)
            if (r11 != 0) goto L_0x00ec
            r11 = 1
            goto L_0x00ed
        L_0x00ec:
            r11 = 0
        L_0x00ed:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
            if (r11 != 0) goto L_0x0148
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r3.adActionLinkClickInfo
            boolean r11 = lo2.C99542h0.m129911i(r11)
            if (r11 != 0) goto L_0x0148
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r3.adActionLinkClickInfo
            java.lang.String r12 = "isFinderAdLiveRoom"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            if (r11 == 0) goto L_0x010c
            int r11 = r11.f273641b
            r14 = 10
            if (r11 != r14) goto L_0x010c
            r11 = 1
            goto L_0x010d
        L_0x010c:
            r11 = 0
        L_0x010d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            if (r11 == 0) goto L_0x0113
            goto L_0x0148
        L_0x0113:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = r3.adActionLinkClickInfo
            boolean r10 = r10.mo130140a()
            if (r10 == 0) goto L_0x0130
            boolean r10 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r10 == 0) goto L_0x0127
            android.widget.ImageView r10 = r1.f280521e
            r10.setImageResource(r9)
            goto L_0x0177
        L_0x0127:
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755049(0x7f100029, float:1.9140966E38)
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x0130:
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r9 == 0) goto L_0x013f
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755051(0x7f10002b, float:1.914097E38)
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x013f:
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755052(0x7f10002c, float:1.9140972E38)
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x0148:
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r9 == 0) goto L_0x0157
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755047(0x7f100027, float:1.9140962E38)
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x0157:
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755048(0x7f100028, float:1.9140964E38)
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x0160:
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r9 == 0) goto L_0x016f
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755051(0x7f10002b, float:1.914097E38)
            r9.setImageResource(r10)
            goto L_0x0177
        L_0x016f:
            android.widget.ImageView r9 = r1.f280521e
            r10 = 2131755052(0x7f10002c, float:1.9140972E38)
            r9.setImageResource(r10)
        L_0x0177:
            java.lang.String r9 = r3.adActionLinkIcon
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0195
            java.lang.String r9 = r3.adActionLinkIcon
            r20 = 0
            r21 = 41
            r22 = 0
            com.tencent.mm.plugin.sns.ui.m8$a r10 = new com.tencent.mm.plugin.sns.ui.m8$a
            r10.<init>()
            java.lang.String r18 = "adId"
            r19 = r9
            r23 = r10
            ps2.C100891r.m132207b(r18, r19, r20, r21, r22, r23)
        L_0x0195:
            r9 = 8
            if (r0 == 0) goto L_0x01e8
            java.lang.String r0 = r0.adActionPOIName
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01e8
            android.view.View r0 = r1.f280524h
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.mo10233c(r12)
            java.lang.Object[] r19 = r10.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/TimeLineAdView"
            java.lang.String r21 = "initData"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml;Lcom/tencent/mm/plugin/sns/storage/ADInfo;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = 0
            java.lang.Object r10 = r10.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0.setVisibility(r10)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/TimeLineAdView"
            java.lang.String r20 = "initData"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml;Lcom/tencent/mm/plugin/sns/storage/ADInfo;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r11 = 0
            goto L_0x022c
        L_0x01e8:
            android.view.View r0 = r1.f280524h
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10.mo10233c(r11)
            java.lang.Object[] r26 = r10.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/TimeLineAdView"
            java.lang.String r28 = "initData"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml;Lcom/tencent/mm/plugin/sns/storage/ADInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r11 = 0
            java.lang.Object r10 = r10.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0.setVisibility(r10)
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ui/TimeLineAdView"
            java.lang.String r27 = "initData"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml;Lcom/tencent/mm/plugin/sns/storage/ADInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x022c:
            java.lang.String r0 = r1.f280528l
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0237
            java.lang.String r0 = r3.expandOutsideTitle_cn
            goto L_0x024d
        L_0x0237:
            java.lang.String r0 = r1.f280528l
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x024b
            java.lang.String r0 = r1.f280528l
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0248
            goto L_0x024b
        L_0x0248:
            java.lang.String r0 = r3.expandOutsideTitle_en
            goto L_0x024d
        L_0x024b:
            java.lang.String r0 = r3.expandOutsideTitle_tw
        L_0x024d:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x0258
            android.widget.TextView r6 = r1.f280518b
            r6.setText(r0)
        L_0x0258:
            co2.s r0 = r3.adTagBtnInfo
            if (r0 == 0) goto L_0x0418
            java.lang.String r6 = "isValid"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.adxml.AdTagButtonInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.lang.String r8 = r0.f264589e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x027f
            java.lang.String r8 = r0.f264587c
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x027f
            java.lang.String r8 = r0.f264585a
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x027d
            goto L_0x027f
        L_0x027d:
            r8 = 0
            goto L_0x0280
        L_0x027f:
            r8 = 1
        L_0x0280:
            if (r8 == 0) goto L_0x028c
            int r8 = r0.f264598n
            if (r8 <= 0) goto L_0x028c
            int r0 = r0.f264597m
            if (r0 <= 0) goto L_0x028c
            r0 = 1
            goto L_0x028d
        L_0x028c:
            r0 = 0
        L_0x028d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r0 == 0) goto L_0x0418
            android.view.ViewStub r0 = r1.f280529m
            if (r0 == 0) goto L_0x0418
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r6 = r1.f280530n
            if (r6 != 0) goto L_0x02b7
            android.view.View r0 = r0.inflate()
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r0
            r1.f280530n = r0
            jq2.y r6 = new jq2.y
            int r14 = r1.f280535s
            jp2.o r15 = r1.f280536t
            up2.e$c r7 = r1.f280534r
            r12 = r6
            r8 = 0
            r10 = 1
            r16 = r0
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            r1.f280531o = r6
            goto L_0x02b9
        L_0x02b7:
            r8 = 0
            r10 = 1
        L_0x02b9:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r1.f280530n
            r0.setVisibility(r8)
            jq2.y r6 = r1.f280531o
            co2.s r0 = r3.adTagBtnInfo
            r6.getClass()
            java.lang.String r7 = "init"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r11)
            r6.f290286g = r0
            r6.f290288i = r2
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r0.f264599o
            if (r0 == 0) goto L_0x02d9
            up2.e r12 = r6.f290287h
            r12.mo141559h(r0, r2)
        L_0x02d9:
            java.lang.String r12 = "refreshUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r0 == 0) goto L_0x0329
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264586b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02fe
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264586b
            android.widget.ImageView r13 = r6.f290283d
            rq2.C63489a.m74826a(r0, r13)
            android.widget.ImageView r0 = r6.f290283d
            r0.setVisibility(r8)
            goto L_0x0304
        L_0x02fe:
            android.widget.ImageView r0 = r6.f290283d
            r13 = 4
            r0.setVisibility(r13)
        L_0x0304:
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264588d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x031d
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264588d
            android.widget.ImageView r13 = r6.f290284e
            rq2.C63489a.m74826a(r0, r13)
            android.widget.ImageView r0 = r6.f290284e
            r0.setVisibility(r8)
            goto L_0x0322
        L_0x031d:
            android.widget.ImageView r0 = r6.f290284e
            r0.setVisibility(r9)
        L_0x0322:
            co2.s r0 = r6.f290286g
            float r13 = r0.f264593i
            java.lang.String r0 = r0.f264591g
            goto L_0x036c
        L_0x0329:
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264585a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0342
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264585a
            android.widget.ImageView r13 = r6.f290283d
            rq2.C63489a.m74826a(r0, r13)
            android.widget.ImageView r0 = r6.f290283d
            r0.setVisibility(r8)
            goto L_0x0348
        L_0x0342:
            android.widget.ImageView r0 = r6.f290283d
            r13 = 4
            r0.setVisibility(r13)
        L_0x0348:
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264587c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0361
            co2.s r0 = r6.f290286g
            java.lang.String r0 = r0.f264587c
            android.widget.ImageView r13 = r6.f290284e
            rq2.C63489a.m74826a(r0, r13)
            android.widget.ImageView r0 = r6.f290284e
            r0.setVisibility(r8)
            goto L_0x0366
        L_0x0361:
            android.widget.ImageView r0 = r6.f290284e
            r0.setVisibility(r9)
        L_0x0366:
            co2.s r0 = r6.f290286g
            float r13 = r0.f264592h
            java.lang.String r0 = r0.f264590f
        L_0x036c:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r14 = r6.f290282c
            co2.s r15 = r6.f290286g
            float r15 = r15.f264594j
            r14.setRadius(r15)
            co2.s r14 = r6.f290286g
            java.lang.String r14 = r14.f264589e
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x03f7
            android.widget.TextView r14 = r6.f290285f
            co2.s r15 = r6.f290286g
            java.lang.String r15 = r15.f264589e
            r14.setText(r15)
            android.widget.TextView r14 = r6.f290285f
            r14.setAlpha(r13)
            android.content.Context r13 = r6.f290280a
            r14 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r13 = kg3.C76577a.m92153d(r13, r14)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x03b0
            int r13 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x03a2 }
            r15 = 1
            goto L_0x03b1
        L_0x03a2:
            r0 = move-exception
            r14 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r8] = r14
            java.lang.String r14 = "TimelineTagBtnHelper"
            java.lang.String r15 = "refreshUI parse color error"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r15, r0)
        L_0x03b0:
            r15 = 0
        L_0x03b1:
            android.widget.TextView r0 = r6.f290285f
            r0.setTextColor(r13)
            if (r15 != 0) goto L_0x03bf
            android.widget.TextView r0 = r6.f290285f
            r13 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r13)
        L_0x03bf:
            android.widget.ImageView r0 = r6.f290284e
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03dc
            android.content.Context r0 = r6.f290280a
            r13 = 2131167193(0x7f0707d9, float:1.7948653E38)
            int r0 = kg3.C76577a.m92157h(r0, r13)
            android.content.Context r13 = r6.f290280a
            r14 = 2131167192(0x7f0707d8, float:1.794865E38)
            int r13 = kg3.C76577a.m92157h(r13, r14)
            int r14 = r0 + r13
            goto L_0x03dd
        L_0x03dc:
            r14 = 0
        L_0x03dd:
            android.widget.TextView r0 = r6.f290285f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            co2.s r13 = r6.f290286g
            int r13 = r13.f264597m
            int r13 = r13 - r14
            r0.width = r13
            android.widget.TextView r13 = r6.f290285f
            r13.setLayoutParams(r0)
            android.widget.TextView r0 = r6.f290285f
            r0.setVisibility(r8)
            goto L_0x03fc
        L_0x03f7:
            android.widget.TextView r0 = r6.f290285f
            r0.setVisibility(r9)
        L_0x03fc:
            android.widget.ImageView r0 = r6.f290283d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            co2.s r13 = r6.f290286g
            int r14 = r13.f264597m
            r0.width = r14
            int r13 = r13.f264598n
            r0.height = r13
            android.widget.ImageView r6 = r6.f290283d
            r6.setLayoutParams(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r11)
            goto L_0x0421
        L_0x0418:
            r8 = 0
            r10 = 1
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r1.f280530n
            if (r0 == 0) goto L_0x0421
            r0.setVisibility(r9)
        L_0x0421:
            ar2.a r0 = r3.adInteractionLabelInfo
            if (r0 == 0) goto L_0x0517
            android.view.ViewStub r0 = r1.f280532p
            if (r0 == 0) goto L_0x0517
            if (r2 == 0) goto L_0x0517
            java.lang.String r0 = "isMagicWindowUseAd"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.data.SnsAdUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106197n0()
            if (r7 == 0) goto L_0x0441
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r7 == 0) goto L_0x0441
            r15 = 1
            goto L_0x0442
        L_0x0441:
            r15 = 0
        L_0x0442:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            if (r15 != 0) goto L_0x0517
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView r0 = r1.f280533q
            if (r0 != 0) goto L_0x0455
            android.view.ViewStub r0 = r1.f280532p
            android.view.View r0 = r0.inflate()
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView r0 = (com.tencent.p014mm.plugin.sns.p104ad.widget.interactionlabel.SnsAdInteractionLabelView) r0
            r1.f280533q = r0
        L_0x0455:
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView r6 = r1.f280533q
            if (r6 == 0) goto L_0x0521
            ar2.a r3 = r3.adInteractionLabelInfo
            long r10 = r2.field_snsId
            int r0 = r1.f280535s
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "initData, info="
            r12.append(r13)
            int r13 = r3.hashCode()
            r12.append(r13)
            java.lang.String r13 = ", snsId="
            r12.append(r13)
            java.lang.String r13 = vr2.C102236a0.m134765q0(r10)
            r12.append(r13)
            java.lang.String r13 = ", curSnsId="
            r12.append(r13)
            long r13 = r6.f274414o
            java.lang.String r13 = vr2.C102236a0.m134765q0(r13)
            r12.append(r13)
            java.lang.String r13 = ", source="
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "SnsAdInteractionLabelView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            r6.f274417r = r0
            long r14 = r6.f274414o
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x04b7
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x04b7
            java.lang.String r0 = "initData, same snsId"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
            goto L_0x050e
        L_0x04b7:
            r6.f274414o = r10
            android.widget.TextView r0 = r6.f274407e
            java.lang.String r10 = r3.f152459a
            r0.setText(r10)
            java.lang.String r0 = r3.f152460b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04ed
            java.lang.String r0 = r3.f152460b     // Catch:{ all -> 0x04d4 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x04d4 }
            android.widget.TextView r10 = r6.f274407e     // Catch:{ all -> 0x04d4 }
            r10.setTextColor(r0)     // Catch:{ all -> 0x04d4 }
            goto L_0x04ed
        L_0x04d4:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "initData exp="
            r10.append(r11)
            java.lang.String r0 = r0.toString()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x04ed:
            java.util.ArrayList<java.lang.String> r0 = r6.f274411i
            r0.clear()
            java.util.ArrayList<java.lang.String> r0 = r6.f274411i
            java.util.ArrayList<java.lang.String> r3 = r3.f152461c
            r0.addAll(r3)
            android.content.Context r0 = r6.getContext()
            boolean r0 = vr2.C102260r.m134843L(r0)
            if (r0 == 0) goto L_0x0508
            android.view.ViewGroup r0 = r6.f274408f
            r0.setVisibility(r9)
        L_0x0508:
            r6.mo130541d()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
        L_0x050e:
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView r0 = r1.f280533q
            r0.setVisibility(r8)
            r1.mo133604c(r8, r2)
            goto L_0x0521
        L_0x0517:
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView r0 = r1.f280533q
            if (r0 == 0) goto L_0x051e
            r0.setVisibility(r9)
        L_0x051e:
            r1.mo133604c(r9, r2)
        L_0x0521:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96071m8.mo133602a(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.plugin.sns.storage.ADInfo):void");
    }

    /* renamed from: b */
    public boolean mo133603b() {
        SnsMethodCalculate.markStartTimeMs("isAdInfoLinkTvVisible", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (this.f280519c.getVisibility() == 0) {
            SnsMethodCalculate.markEndTimeMs("isAdInfoLinkTvVisible", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isAdInfoLinkTvVisible", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        return false;
    }

    /* renamed from: c */
    public void mo133604c(int i, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("sendLabelViewVisibilityEvent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (snsInfo != null) {
            try {
                if (snsInfo.isShakeAd()) {
                    if (!C102260r.m134840I(this.f280537u, snsInfo)) {
                        SnsAdInteractionEvent snsAdInteractionEvent = new SnsAdInteractionEvent();
                        SnsAdInteractionEvent.C92568a aVar = snsAdInteractionEvent.f265118d;
                        aVar.f265119a = i;
                        aVar.f265120b = snsInfo.field_snsId;
                        snsAdInteractionEvent.publish();
                        Log.m105924i("MicroMsg.TimeLineAdView", "sendVisibilityEvent, interactionLabelView visibility is " + i + ", interactionLabelView snsId is " + C102236a0.m134765q0(snsAdInteractionEvent.f265118d.f265120b));
                        this.f280537u = snsInfo;
                    }
                    SnsMethodCalculate.markEndTimeMs("sendLabelViewVisibilityEvent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
                    return;
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.TimeLineAdView", "sendLabelViewVisibilityEvent exp is " + th);
            }
        }
        SnsMethodCalculate.markEndTimeMs("sendLabelViewVisibilityEvent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    /* renamed from: d */
    public void mo133605d(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("setAdTitleTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f280519c.setTag(obj);
        this.f280518b.setTag(obj2);
        View view = this.f280523g;
        if (view != null) {
            view.setTag(obj2);
        }
        LinearLayout linearLayout = this.f280517a;
        if (linearLayout != null) {
            linearLayout.setTag(obj2);
        }
        SnsMethodCalculate.markEndTimeMs("setAdTitleTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    /* renamed from: e */
    public void mo133606e(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f280519c.setOnClickListener(onClickListener);
        this.f280518b.setOnClickListener(onClickListener2);
        View view = this.f280523g;
        if (view != null) {
            view.setOnClickListener(onClickListener2);
        }
        LinearLayout linearLayout = this.f280517a;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener2);
        }
        SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    /* renamed from: f */
    public void mo133607f(int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        ADXml aDXml = this.f280526j;
        if (aDXml == null || aDXml.adActionLinkHidden != 1) {
            View view = this.f280519c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f280519c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f280518b.setVisibility(i2);
        View view5 = this.f280523g;
        if (view5 != null) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        LinearLayout linearLayout = this.f280517a;
        if (linearLayout != null) {
            linearLayout.setVisibility(i2);
        }
        ADInfo aDInfo = this.f280527k;
        if (aDInfo == null || Util.isNullOrNil(aDInfo.adActionPOIName)) {
            View view6 = this.f280524h;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view8 = this.f280524h;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(Integer.valueOf(i));
            View view9 = view8;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }
}
