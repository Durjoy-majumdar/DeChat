package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C54018h;
import ad0.C54019i;
import ad0.C54020j;
import ad0.C54021k;
import ad0.C54022l;
import ad0.C54023m;
import ad0.C54024n;
import ad0.C54025o;
import ad0.C91998s;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.plugin.sns.statistics.C95007z;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import e00.C45519s0;
import eb0.C86493v0;
import ex0.C45696d;
import f40.C86709a0;
import g34.C116918i;
import ht1.C60167f1;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import kr2.C76634a;
import p158gt.C8451i;
import p159gw.C8462g;
import p214om.C11502f;
import te3.C101796jo2;
import te3.C101802kr2;
import te3.C101815ms1;
import te3.f94;
import te3.sc4;
import te3.w25;

/* renamed from: com.tencent.mm.plugin.sns.ui.g1 */
public class C95788g1 extends C96157q {

    /* renamed from: A */
    public String f279455A;

    /* renamed from: B */
    public boolean f279456B = false;

    /* renamed from: C */
    public boolean f279457C = false;

    /* renamed from: D */
    public WXMediaMessage f279458D = null;

    /* renamed from: E */
    public String f279459E = "";

    /* renamed from: F */
    public String f279460F;

    /* renamed from: G */
    public String f279461G;

    /* renamed from: H */
    public String f279462H;

    /* renamed from: I */
    public String f279463I;

    /* renamed from: J */
    public String f279464J;

    /* renamed from: K */
    public int f279465K = 0;

    /* renamed from: L */
    public C91998s f279466L = null;

    /* renamed from: M */
    public C91998s f279467M = null;

    /* renamed from: N */
    public int f279468N = 0;

    /* renamed from: O */
    public String f279469O = "";

    /* renamed from: P */
    public String f279470P = "";

    /* renamed from: Q */
    public int f279471Q;

    /* renamed from: R */
    public int f279472R;

    /* renamed from: S */
    public String f279473S;

    /* renamed from: T */
    public boolean f279474T;

    /* renamed from: U */
    public String f279475U;

    /* renamed from: V */
    public int f279476V;

    /* renamed from: W */
    public String f279477W;

    /* renamed from: X */
    public String f279478X = "";

    /* renamed from: Y */
    public String f279479Y = "";

    /* renamed from: Z */
    public String f279480Z = "";

    /* renamed from: a0 */
    public int f279481a0 = 0;

    /* renamed from: b0 */
    public String f279482b0 = "";

    /* renamed from: c */
    public final MMActivity f279483c;

    /* renamed from: c0 */
    public String f279484c0 = "";

    /* renamed from: d */
    public int f279485d = -1;

    /* renamed from: d0 */
    public String f279486d0 = "";

    /* renamed from: e */
    public int f279487e = -1;

    /* renamed from: e0 */
    public String f279488e0 = "";

    /* renamed from: f */
    public String f279489f = "";

    /* renamed from: f0 */
    public String f279490f0 = "";

    /* renamed from: g */
    public String f279491g = "";

    /* renamed from: g0 */
    public w25 f279492g0 = null;

    /* renamed from: h */
    public String f279493h = "";

    /* renamed from: h0 */
    public C54022l f279494h0;

    /* renamed from: i */
    public byte[] f279495i = null;

    /* renamed from: i0 */
    public C54024n f279496i0;

    /* renamed from: j */
    public boolean f279497j = false;

    /* renamed from: j0 */
    public C54018h f279498j0;

    /* renamed from: k */
    public Bitmap f279499k = null;

    /* renamed from: k0 */
    public C54021k f279500k0;

    /* renamed from: l */
    public String f279501l;

    /* renamed from: l0 */
    public C54020j f279502l0;

    /* renamed from: m */
    public String f279503m;

    /* renamed from: m0 */
    public C54019i f279504m0;

    /* renamed from: n */
    public int f279505n;

    /* renamed from: n0 */
    public C54025o f279506n0;

    /* renamed from: o */
    public String f279507o;

    /* renamed from: o0 */
    public C54023m f279508o0;

    /* renamed from: p */
    public String f279509p;

    /* renamed from: p0 */
    public String f279510p0;

    /* renamed from: q */
    public View f279511q = null;

    /* renamed from: q0 */
    public int f279512q0;

    /* renamed from: r */
    public CdnImageView f279513r = null;

    /* renamed from: r0 */
    public String f279514r0;

    /* renamed from: s */
    public TextView f279515s = null;

    /* renamed from: s0 */
    public String f279516s0;

    /* renamed from: t */
    public TextView f279517t = null;

    /* renamed from: t0 */
    public int f279518t0;

    /* renamed from: u */
    public boolean f279519u = false;

    /* renamed from: u0 */
    public int f279520u0;

    /* renamed from: v */
    public boolean f279521v = false;

    /* renamed from: v0 */
    public int f279522v0 = 1;

    /* renamed from: w */
    public boolean f279523w = false;

    /* renamed from: w0 */
    public String f279524w0 = "";

    /* renamed from: x */
    public boolean f279525x = false;

    /* renamed from: y */
    public boolean f279526y = false;

    /* renamed from: z */
    public String f279527z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.g1$a */
    public class C95789a implements View.OnClickListener {
        public C95789a() {
        }

        public void onClick(View view) {
            View view2 = view;
            Class cls = C45696d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
            C95788g1 g1Var = C95788g1.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LinkWidget");
            String str = g1Var.f279490f0;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.LinkWidget");
            if (Util.isNullOrNil(str)) {
                C95788g1 g1Var2 = C95788g1.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                boolean z = g1Var2.f279523w;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                if (!z) {
                    C95788g1 g1Var3 = C95788g1.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                    boolean z2 = g1Var3.f279525x;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                    if (!z2) {
                        C95788g1 g1Var4 = C95788g1.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                        boolean z3 = g1Var4.f279526y;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                        if (!z3) {
                            C86493v0 d = C86493v0.m107224d();
                            C95788g1 g1Var5 = C95788g1.this;
                            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                            String str2 = g1Var5.f279464J;
                            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.LinkWidget");
                            C86493v0.C86495c c = d.mo120947c(str2, true);
                            if (c.mo120954a("_DATA_CENTER_ITEM_SHOW_TYPE")) {
                                int e = c.mo120958e("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                                int e2 = c.mo120958e("_DATA_SHOW_NATIVE_PAGE", -1);
                                if (e == 5 && e == 16 && e2 == 1 && C95788g1.m122648k(C95788g1.this).getIntent().getBundleExtra("BizVideoDetailUIExtras") != null) {
                                    Log.m105924i("MicroMsg.LinkWidget", "goto native video");
                                    Intent intent = new Intent();
                                    intent.putExtras(C95788g1.m122648k(C95788g1.this).getIntent().getBundleExtra("BizVideoDetailUIExtras"));
                                    View findViewById = view2.findViewById(C0966R.C0970id.f4p);
                                    if (findViewById != null) {
                                        int width = findViewById.getWidth();
                                        int height = findViewById.getHeight();
                                        int[] iArr = new int[2];
                                        findViewById.getLocationInWindow(iArr);
                                        intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                                    }
                                    intent.addFlags(268435456);
                                    C88144b.m109791i(MMApplicationContext.getContext(), "brandservice", ".ui.timeline.video.BizVideoDetailUI", intent, (Bundle) null);
                                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
                                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                    return;
                                } else if (((C45519s0) C86312j.m106911c(C45519s0.class)).Ok0()) {
                                    Intent intent2 = new Intent();
                                    if (!((C45696d) C86709a0.m107533q(cls)).Ms0(C95788g1.m122648k(C95788g1.this), ((C45696d) C86709a0.m107533q(cls)).mo70959F2(C95788g1.m122649l(C95788g1.this), 2, 10000, (int) (System.currentTimeMillis() / 1000)), e, true, 2, 10000, intent2)) {
                                        intent2.putExtra("rawUrl", C95788g1.m122649l(C95788g1.this));
                                        C88144b.m109791i(C95788g1.m122648k(C95788g1.this), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                                    }
                                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
                                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                    return;
                                }
                            }
                            Log.m105924i("MicroMsg.LinkWidget", "adlink url " + C95788g1.m122649l(C95788g1.this));
                            Intent intent3 = new Intent();
                            intent3.putExtra("rawUrl", C95788g1.m122649l(C95788g1.this));
                            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent3, C95788g1.m122648k(C95788g1.this));
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
                            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LinkWidget$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LinkWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C95788g1(MMActivity mMActivity) {
        this.f279483c = mMActivity;
    }

    /* renamed from: k */
    public static /* synthetic */ MMActivity m122648k(C95788g1 g1Var) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        MMActivity mMActivity = g1Var.f279483c;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return mMActivity;
    }

    /* renamed from: l */
    public static /* synthetic */ String m122649l(C95788g1 g1Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        String str = g1Var.f279489f;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0175  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo132124a() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            java.lang.String r2 = "initView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.LinkWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.ui.MMActivity r4 = r0.f279483c
            android.view.LayoutInflater r4 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r4)
            r5 = 2131498085(0x7f0c1465, float:1.8619781E38)
            r6 = 0
            android.view.View r4 = r4.inflate(r5, r6)
            r0.f279511q = r4
            java.lang.String r4 = r0.f279489f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x002d
            android.view.View r4 = r0.f279511q
            com.tencent.mm.plugin.sns.ui.g1$a r5 = new com.tencent.mm.plugin.sns.ui.g1$a
            r5.<init>()
            r4.setOnClickListener(r5)
        L_0x002d:
            android.view.View r4 = r0.f279511q
            r5 = 2131306309(0x7f092745, float:1.8230813E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r4
            r0.f279513r = r4
            android.view.View r4 = r0.f279511q
            r5 = 2131315436(0x7f094aec, float:1.8249325E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f279515s = r4
            android.view.View r4 = r0.f279511q
            r5 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0.f279517t = r4
            boolean r4 = r0.f279519u
            r5 = 8
            r6 = 2131314316(0x7f09468c, float:1.8247054E38)
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L_0x00cd
            boolean r4 = r0.f279521v
            if (r4 != 0) goto L_0x00cd
            java.lang.String r4 = "isTopStory"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            te3.w25 r9 = r0.f279492g0
            if (r9 == 0) goto L_0x0077
            java.lang.String r9 = r9.f259899d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0077
            r9 = 1
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r9 != 0) goto L_0x00cd
            int r4 = r0.f279476V
            if (r4 == r7) goto L_0x00cd
            int r4 = r0.f279518t0
            if (r4 == 0) goto L_0x0086
            goto L_0x00cd
        L_0x0086:
            android.view.View r4 = r0.f279511q
            android.view.View r4 = r4.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r9)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/LinkWidget"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r4
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/LinkWidget"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0113
        L_0x00cd:
            android.view.View r4 = r0.f279511q
            android.view.View r4 = r4.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r9)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/LinkWidget"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r4
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/LinkWidget"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0113:
            eb0.v0 r4 = eb0.C86493v0.m107224d()
            java.lang.String r6 = r0.f279464J
            eb0.v0$c r4 = r4.mo120947c(r6, r7)
            if (r4 == 0) goto L_0x013e
            r6 = -1
            java.lang.String r9 = "_DATA_CENTER_IS_PAY_SUBSCRIBE"
            int r4 = r4.mo120958e(r9, r6)
            if (r7 != r4) goto L_0x013e
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131833058(0x7f1130e2, float:1.9299187E38)
            java.lang.String r4 = r4.getString(r5)
            android.widget.TextView r5 = r0.f279517t
            r5.setText(r4)
            android.widget.TextView r4 = r0.f279517t
            r4.setVisibility(r8)
            goto L_0x0143
        L_0x013e:
            android.widget.TextView r4 = r0.f279517t
            r4.setVisibility(r5)
        L_0x0143:
            java.lang.String r4 = r0.f279491g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r11 = 32
            r12 = 24
            r13 = 22
            r14 = 18
            r15 = 23
            r5 = 17
            if (r4 != 0) goto L_0x0175
            android.widget.TextView r1 = r0.f279515s
            java.lang.String r4 = r0.f279491g
            r1.setText(r4)
            android.widget.TextView r1 = r0.f279517t
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x016d
            android.widget.TextView r1 = r0.f279515s
            r1.setMaxLines(r7)
            goto L_0x047f
        L_0x016d:
            android.widget.TextView r1 = r0.f279515s
            r4 = 2
            r1.setMaxLines(r4)
            goto L_0x047f
        L_0x0175:
            int r4 = r0.f279468N
            r6 = 2131837137(0x7f1140d1, float:1.930746E38)
            java.lang.String r9 = ": "
            if (r4 != r5) goto L_0x0215
            ad0.l r5 = r0.f279494h0
            if (r5 == 0) goto L_0x0215
            te3.rk1 r4 = r5.f151291a
            java.lang.String r4 = vr2.C102236a0.m134703A(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x01b3
            ad0.l r4 = r0.f279494h0
            te3.rk1 r4 = r4.f151291a
            java.lang.String r4 = r4.f185187h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01b3
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            ad0.l r6 = r0.f279494h0
            te3.rk1 r6 = r6.f151291a
            java.lang.String r6 = r6.f185187h
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x01b3:
            ad0.l r4 = r0.f279494h0
            te3.rk1 r4 = r4.f151291a
            java.lang.String r4 = r4.f185187h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01f2
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ad0.l r10 = r0.f279494h0
            te3.rk1 r10 = r10.f151291a
            java.lang.String r10 = vr2.C102236a0.m134703A(r10)
            r6.append(r10)
            r6.append(r9)
            ad0.l r9 = r0.f279494h0
            te3.rk1 r9 = r9.f151291a
            java.lang.String r9 = r9.f185187h
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x01f2:
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            java.lang.Object[] r9 = new java.lang.Object[r7]
            ad0.l r10 = r0.f279494h0
            te3.rk1 r10 = r10.f151291a
            java.lang.String r10 = vr2.C102236a0.m134703A(r10)
            r9[r8] = r10
            java.lang.String r6 = r5.getString(r6, r9)
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x0215:
            if (r4 != r15) goto L_0x02a8
            ad0.o r5 = r0.f279506n0
            if (r5 == 0) goto L_0x02a8
            te3.fw2 r4 = r5.f151294a
            java.lang.String r4 = r4.f183243f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x024a
            ad0.o r4 = r0.f279506n0
            te3.fw2 r4 = r4.f151294a
            java.lang.String r4 = r4.f183245h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x024a
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            ad0.o r6 = r0.f279506n0
            te3.fw2 r6 = r6.f151294a
            java.lang.String r6 = r6.f183245h
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x024a:
            ad0.o r4 = r0.f279506n0
            te3.fw2 r4 = r4.f151294a
            java.lang.String r4 = r4.f183245h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0287
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ad0.o r10 = r0.f279506n0
            te3.fw2 r10 = r10.f151294a
            java.lang.String r10 = r10.f183243f
            r6.append(r10)
            r6.append(r9)
            ad0.o r9 = r0.f279506n0
            te3.fw2 r9 = r9.f151294a
            java.lang.String r9 = r9.f183245h
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x0287:
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            java.lang.Object[] r9 = new java.lang.Object[r7]
            ad0.o r10 = r0.f279506n0
            te3.fw2 r10 = r10.f151294a
            java.lang.String r10 = r10.f183243f
            r9[r8] = r10
            java.lang.String r6 = r5.getString(r6, r9)
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x02a8:
            r5 = 2131821537(0x7f1103e1, float:1.927582E38)
            if (r4 == r14) goto L_0x02af
            if (r4 != r13) goto L_0x02fe
        L_0x02af:
            ad0.n r6 = r0.f279496i0
            if (r6 == 0) goto L_0x02fe
            com.tencent.mm.ui.MMActivity r4 = r0.f279483c
            java.lang.String r4 = r4.getString(r5)
            ad0.n r5 = r0.f279496i0
            te3.tk1 r5 = r5.f151293a
            if (r5 == 0) goto L_0x02eb
            int r4 = r5.f185604e
            if (r4 != r7) goto L_0x02d9
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131837140(0x7f1140d4, float:1.9307467E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            ad0.n r9 = r0.f279496i0
            te3.tk1 r9 = r9.f151293a
            java.lang.String r9 = r9.f185603d
            r6[r8] = r9
            java.lang.String r4 = r4.getString(r5, r6)
            goto L_0x02db
        L_0x02d9:
            java.lang.String r4 = r5.f185603d
        L_0x02db:
            android.widget.TextView r5 = r0.f279517t
            r5.setVisibility(r8)
            android.widget.TextView r5 = r0.f279517t
            ad0.n r6 = r0.f279496i0
            te3.tk1 r6 = r6.f151293a
            java.lang.String r6 = r6.f185606g
            r5.setText(r6)
        L_0x02eb:
            android.widget.TextView r5 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r6 = r0.f279483c
            android.text.SpannableString r1 = r1.mo107057T1(r6, r4)
            r5.setText(r1)
            goto L_0x047f
        L_0x02fe:
            if (r4 != r12) goto L_0x0343
            ad0.h r6 = r0.f279498j0
            if (r6 == 0) goto L_0x0343
            com.tencent.mm.ui.MMActivity r4 = r0.f279483c
            java.lang.String r4 = r4.getString(r5)
            ad0.h r5 = r0.f279498j0
            te3.tk1 r5 = r5.f151287a
            if (r5 == 0) goto L_0x0330
            te3.bf0 r6 = r5.f185609j
            if (r6 == 0) goto L_0x0330
            int r4 = r5.f185604e
            r9 = 7
            if (r4 != r9) goto L_0x031e
            java.lang.String r4 = com.tencent.p014mm.modelstat.C92859v.m117125c(r6)
            goto L_0x0320
        L_0x031e:
            java.lang.String r4 = r5.f185603d
        L_0x0320:
            android.widget.TextView r5 = r0.f279517t
            r5.setVisibility(r8)
            android.widget.TextView r5 = r0.f279517t
            ad0.h r6 = r0.f279498j0
            te3.tk1 r6 = r6.f151287a
            java.lang.String r6 = r6.f185606g
            r5.setText(r6)
        L_0x0330:
            android.widget.TextView r5 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r6 = r0.f279483c
            android.text.SpannableString r1 = r1.mo107057T1(r6, r4)
            r5.setText(r1)
            goto L_0x047f
        L_0x0343:
            if (r4 != r11) goto L_0x037a
            ad0.k r6 = r0.f279500k0
            if (r6 == 0) goto L_0x037a
            com.tencent.mm.ui.MMActivity r4 = r0.f279483c
            java.lang.String r4 = r4.getString(r5)
            ad0.k r5 = r0.f279500k0
            te3.tk1 r5 = r5.f151290a
            if (r5 == 0) goto L_0x0367
            java.lang.String r4 = r5.f185603d
            android.widget.TextView r5 = r0.f279517t
            r5.setVisibility(r8)
            android.widget.TextView r5 = r0.f279517t
            ad0.k r6 = r0.f279500k0
            te3.tk1 r6 = r6.f151290a
            java.lang.String r6 = r6.f185606g
            r5.setText(r6)
        L_0x0367:
            android.widget.TextView r5 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r6 = r0.f279483c
            android.text.SpannableString r1 = r1.mo107057T1(r6, r4)
            r5.setText(r1)
            goto L_0x047f
        L_0x037a:
            r5 = 20
            if (r4 != r5) goto L_0x0399
            ad0.i r5 = r0.f279504m0
            if (r5 == 0) goto L_0x0399
            te3.nk1 r4 = r5.f151288a
            java.lang.String r4 = r4.f184476e
            android.widget.TextView r5 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r6 = r0.f279483c
            android.text.SpannableString r1 = r1.mo107057T1(r6, r4)
            r5.setText(r1)
            goto L_0x047f
        L_0x0399:
            r5 = 21
            if (r4 == r5) goto L_0x03a1
            r5 = 30
            if (r4 != r5) goto L_0x0441
        L_0x03a1:
            ad0.j r5 = r0.f279502l0
            if (r5 == 0) goto L_0x0441
            te3.p81 r4 = r5.mo74686c()
            java.lang.String r4 = r4.f184781g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x03da
            ad0.j r4 = r0.f279502l0
            te3.p81 r4 = r4.mo74686c()
            java.lang.String r4 = r4.f184782h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x03da
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            ad0.j r6 = r0.f279502l0
            te3.p81 r6 = r6.mo74686c()
            java.lang.String r6 = r6.f184782h
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x03da:
            ad0.j r4 = r0.f279502l0
            te3.p81 r4 = r4.mo74686c()
            java.lang.String r4 = r4.f184782h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x041c
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ad0.j r10 = r0.f279502l0
            te3.p81 r10 = r10.mo74686c()
            java.lang.String r10 = r10.f184781g
            r6.append(r10)
            r6.append(r9)
            ad0.j r9 = r0.f279502l0
            te3.p81 r9 = r9.mo74686c()
            java.lang.String r9 = r9.f184782h
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x041c:
            android.widget.TextView r4 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r5 = r0.f279483c
            r6 = 2131837139(0x7f1140d3, float:1.9307465E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            ad0.j r10 = r0.f279502l0
            te3.p81 r10 = r10.mo74686c()
            java.lang.String r10 = r10.f184781g
            r9[r8] = r10
            java.lang.String r6 = r5.getString(r6, r9)
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r4.setText(r1)
            goto L_0x047f
        L_0x0441:
            r5 = 29
            if (r4 != r5) goto L_0x0474
            ad0.m r4 = r0.f279508o0
            if (r4 == 0) goto L_0x0474
            te3.sk1 r4 = r4.f151292a
            if (r4 == 0) goto L_0x0460
            java.lang.String r4 = r4.f185424f
            android.widget.TextView r5 = r0.f279517t
            r5.setVisibility(r8)
            android.widget.TextView r5 = r0.f279517t
            ad0.m r6 = r0.f279508o0
            te3.sk1 r6 = r6.f151292a
            java.lang.String r6 = r6.f185429n
            r5.setText(r6)
            goto L_0x0462
        L_0x0460:
            java.lang.String r4 = ""
        L_0x0462:
            android.widget.TextView r5 = r0.f279515s
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r6 = r0.f279483c
            android.text.SpannableString r1 = r1.mo107057T1(r6, r4)
            r5.setText(r1)
            goto L_0x047f
        L_0x0474:
            android.widget.TextView r1 = r0.f279515s
            java.lang.String r4 = r0.f279489f
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122253o(r4)
            r1.setText(r4)
        L_0x047f:
            java.lang.String r1 = r0.f279493h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0495
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            java.lang.String r4 = r0.f279493h
            r1.setUrl(r4)
            goto L_0x06ad
        L_0x0495:
            byte[] r1 = r0.f279495i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r1)
            if (r1 != 0) goto L_0x04b3
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            byte[] r1 = r0.f279495i
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r1)
            r0.f279499k = r1
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = r0.f279513r
            r4.setImageBitmap(r1)
            r0.f279497j = r7
            goto L_0x06ad
        L_0x04b3:
            java.lang.String r1 = r0.f279490f0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x04ca
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r4 = 2131756754(0x7f1006d2, float:1.9144424E38)
            r1.setImageResource(r4)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x04ca:
            int r1 = r0.f279468N
            r4 = 17
            if (r1 != r4) goto L_0x050c
            ad0.l r1 = r0.f279494h0
            if (r1 == 0) goto L_0x0505
            te3.rk1 r1 = r1.f151291a
            java.util.LinkedList<te3.pk1> r1 = r1.f185190n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0505
            ad0.l r1 = r0.f279494h0
            te3.rk1 r1 = r1.f151291a
            java.util.LinkedList<te3.pk1> r1 = r1.f185190n
            java.lang.Object r1 = r1.get(r8)
            te3.pk1 r1 = (te3.C64628pk1) r1
            java.lang.String r1 = r1.f184828f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0505
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.l r4 = r0.f279494h0
            te3.rk1 r4 = r4.f151291a
            java.util.LinkedList<te3.pk1> r4 = r4.f185190n
            java.lang.Object r4 = r4.get(r8)
            te3.pk1 r4 = (te3.C64628pk1) r4
            java.lang.String r4 = r4.f184828f
            r1.setUrl(r4)
        L_0x0505:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x050c:
            if (r1 != r15) goto L_0x0572
            ad0.o r1 = r0.f279506n0
            if (r1 == 0) goto L_0x056b
            te3.fw2 r1 = r1.f151294a
            java.util.LinkedList<te3.ew2> r1 = r1.f183247j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x056b
            ad0.o r1 = r0.f279506n0
            te3.fw2 r1 = r1.f151294a
            java.util.LinkedList<te3.ew2> r1 = r1.f183247j
            java.lang.Object r1 = r1.get(r8)
            te3.ew2 r1 = (te3.C64350ew2) r1
            java.lang.String r1 = r1.f183043h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0544
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.o r4 = r0.f279506n0
            te3.fw2 r4 = r4.f151294a
            java.util.LinkedList<te3.ew2> r4 = r4.f183247j
            java.lang.Object r4 = r4.get(r8)
            te3.ew2 r4 = (te3.C64350ew2) r4
            java.lang.String r4 = r4.f183043h
            r1.setUrl(r4)
            goto L_0x056b
        L_0x0544:
            ad0.o r1 = r0.f279506n0
            te3.fw2 r1 = r1.f151294a
            java.util.LinkedList<te3.ew2> r1 = r1.f183247j
            java.lang.Object r1 = r1.get(r8)
            te3.ew2 r1 = (te3.C64350ew2) r1
            java.lang.String r1 = r1.f183040e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x056b
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.o r4 = r0.f279506n0
            te3.fw2 r4 = r4.f151294a
            java.util.LinkedList<te3.ew2> r4 = r4.f183247j
            java.lang.Object r4 = r4.get(r8)
            te3.ew2 r4 = (te3.C64350ew2) r4
            java.lang.String r4 = r4.f183040e
            r1.setUrl(r4)
        L_0x056b:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x0572:
            if (r1 == r14) goto L_0x0699
            if (r1 != r13) goto L_0x0578
            goto L_0x0699
        L_0x0578:
            if (r1 != r12) goto L_0x05ad
            ad0.h r1 = r0.f279498j0
            if (r1 == 0) goto L_0x05a6
            te3.tk1 r1 = r1.f151287a
            if (r1 == 0) goto L_0x05a6
            java.lang.String r1 = r1.f185605f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0596
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.h r4 = r0.f279498j0
            te3.tk1 r4 = r4.f151287a
            java.lang.String r4 = r4.f185605f
            r1.setUrl(r4)
            goto L_0x05a6
        L_0x0596:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            android.content.Context r4 = r1.getContext()
            r5 = 2131755877(0x7f100365, float:1.9142646E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r5)
            r1.setImageDrawable(r4)
        L_0x05a6:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x05ad:
            if (r1 != r11) goto L_0x05e2
            ad0.k r1 = r0.f279500k0
            if (r1 == 0) goto L_0x05db
            te3.tk1 r1 = r1.f151290a
            if (r1 == 0) goto L_0x05db
            java.lang.String r1 = r1.f185605f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x05cb
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.k r4 = r0.f279500k0
            te3.tk1 r4 = r4.f151290a
            java.lang.String r4 = r4.f185605f
            r1.setUrl(r4)
            goto L_0x05db
        L_0x05cb:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            android.content.Context r4 = r1.getContext()
            r5 = 2131234159(0x7f080d6f, float:1.8084476E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r5)
            r1.setImageDrawable(r4)
        L_0x05db:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x05e2:
            r4 = 20
            if (r1 != r4) goto L_0x061b
            ad0.i r1 = r0.f279504m0
            if (r1 == 0) goto L_0x0614
            te3.nk1 r1 = r1.f151288a
            java.util.LinkedList<java.lang.String> r1 = r1.f184478g
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            ad0.i r4 = r0.f279504m0
            te3.nk1 r4 = r4.f151288a
            java.util.LinkedList<java.lang.String> r4 = r4.f184479h
            java.lang.Object r4 = r4.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = r0.f279513r
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
            r5.setUrl(r1)
        L_0x0614:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x061b:
            r4 = 21
            if (r1 == r4) goto L_0x0668
            r4 = 30
            if (r1 != r4) goto L_0x0624
            goto L_0x0668
        L_0x0624:
            r4 = 29
            if (r1 != r4) goto L_0x065a
            ad0.m r1 = r0.f279508o0
            if (r1 == 0) goto L_0x0654
            te3.sk1 r1 = r1.f151292a
            if (r1 == 0) goto L_0x0654
            java.lang.String r1 = r1.f185427i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0644
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.m r4 = r0.f279508o0
            te3.sk1 r4 = r4.f151292a
            java.lang.String r4 = r4.f185427i
            r1.setUrl(r4)
            goto L_0x0654
        L_0x0644:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            android.content.Context r4 = r1.getContext()
            r5 = 2131756337(0x7f100531, float:1.9143579E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r5)
            r1.setImageDrawable(r4)
        L_0x0654:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x065a:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r4 = 2131755119(0x7f10006f, float:1.9141108E38)
            r1.setImageResource(r4)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x0668:
            ad0.j r1 = r0.f279502l0
            if (r1 == 0) goto L_0x0693
            te3.p81 r1 = r1.mo74686c()
            java.lang.String r1 = r1.f184783i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0693
            ad0.j r1 = r0.f279502l0
            te3.p81 r1 = r1.mo74686c()
            java.lang.String r1 = r1.f184783i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0693
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            ad0.j r4 = r0.f279502l0
            te3.p81 r4 = r4.mo74686c()
            java.lang.String r4 = r4.f184783i
            r1.setUrl(r4)
        L_0x0693:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
            goto L_0x06ad
        L_0x0699:
            ad0.n r1 = r0.f279496i0
            if (r1 == 0) goto L_0x06a8
            te3.tk1 r1 = r1.f151293a
            if (r1 == 0) goto L_0x06a8
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = r0.f279513r
            java.lang.String r1 = r1.f185605f
            r4.setUrl(r1)
        L_0x06a8:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            r1.setVisibility(r8)
        L_0x06ad:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r0.f279513r
            com.tencent.mm.ui.MMActivity r4 = r0.f279483c
            vr2.C102236a0.m134779x0(r1, r4)
            android.view.View r1 = r0.f279511q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95788g1.mo132124a():android.view.View");
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        Map<String, String> parseXml2;
        Map<String, String> parseXml3;
        Map<String, String> parseXml4;
        Map<String, String> parseXml5;
        Map<String, String> parseXml6;
        Map<String, String> parseXml7;
        Map<String, String> parseXml8;
        WXMediaMessage wXMediaMessage;
        WXMediaMessage.IMediaObject iMediaObject;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        this.f279466L = C91998s.m115551f(this.f279483c.getIntent());
        this.f279468N = this.f279483c.getIntent().getIntExtra("Ksnsupload_type", 0);
        this.f279481a0 = this.f279483c.getIntent().getIntExtra("KSnsStreamVideoTotalTime", 0);
        this.f279482b0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("KSnsStreamVideoWroding"), "");
        this.f279484c0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("KSnsStreamVideoWebUrl"), "");
        this.f279486d0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("KSnsStreamVideoAduxInfo"), "");
        this.f279488e0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("KSnsStreamVideoPublishId"), "");
        this.f279485d = this.f279483c.getIntent().getIntExtra("Ksnsupload_width", -1);
        this.f279487e = this.f279483c.getIntent().getIntExtra("Ksnsupload_height", -1);
        this.f279505n = this.f279483c.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f279509p = Util.nullAs(this.f279483c.getIntent().getStringExtra("key_snsad_statextstr"), "");
        this.f279489f = Util.nullAs(this.f279483c.getIntent().getStringExtra("Ksnsupload_link"), "");
        this.f279491g = Util.nullAs(this.f279483c.getIntent().getStringExtra("Ksnsupload_title"), "");
        this.f279493h = Util.nullAs(this.f279483c.getIntent().getStringExtra("Ksnsupload_imgurl"), "");
        this.f279495i = this.f279483c.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
        String stringExtra = this.f279483c.getIntent().getStringExtra("KsnsUpload_imgPath");
        if (this.f279495i == null && !Util.isNullOrNil(stringExtra)) {
            this.f279495i = C86013q1.m106433O(stringExtra, 0, -1);
        }
        if (this.f279495i == null && (wXMediaMessage = this.f279458D) != null && (iMediaObject = wXMediaMessage.mediaObject) != null && (iMediaObject instanceof WXImageObject)) {
            this.f279495i = ((WXImageObject) iMediaObject).imageData;
        }
        this.f279519u = this.f279483c.getIntent().getBooleanExtra("ksnsis_video", false);
        this.f279521v = this.f279483c.getIntent().getBooleanExtra("ksnsis_music", false);
        this.f279523w = this.f279483c.getIntent().getBooleanExtra("ksnsis_appbrand", false);
        this.f279525x = this.f279483c.getIntent().getBooleanExtra("ksnsis_liteapp", false);
        this.f279526y = this.f279483c.getIntent().getBooleanExtra("ksnsis_gamesharecard", false);
        this.f279501l = Util.nullAs(this.f279483c.getIntent().getStringExtra("src_username"), "");
        this.f279503m = Util.nullAs(this.f279483c.getIntent().getStringExtra("src_displayname"), "");
        this.f279527z = Util.nullAs(this.f279483c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f279455A = Util.nullAs(this.f279483c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f279456B = this.f279483c.getIntent().getBooleanExtra("KThrid_app", false);
        this.f279457C = this.f279483c.getIntent().getBooleanExtra("KSnsAction", false);
        this.f279460F = Util.nullAs(this.f279483c.getIntent().getStringExtra("ShareUrlOriginal"), "");
        this.f279461G = Util.nullAs(this.f279483c.getIntent().getStringExtra("ShareUrlOpen"), "");
        this.f279462H = Util.nullAs(this.f279483c.getIntent().getStringExtra("JsAppId"), "");
        this.f279463I = Util.nullAs(this.f279483c.getIntent().getStringExtra("KPublisherId"), "");
        this.f279464J = Util.nullAs(this.f279483c.getIntent().getStringExtra("reportSessionId"), "");
        this.f279465K = this.f279483c.getIntent().getIntExtra("Ksnsupload_contentattribute", 0);
        this.f279490f0 = this.f279483c.getIntent().getStringExtra("fav_note_xml");
        this.f279469O = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_BrandUsername"), "");
        this.f279470P = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_BrandPath"), "");
        this.f279471Q = this.f279483c.getIntent().getIntExtra("KsnsUpload_BrandVersion", 0);
        this.f279472R = this.f279483c.getIntent().getIntExtra("KsnsUpload_BrandVersionType", 0);
        this.f279473S = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_BrandShareActionId"), "");
        this.f279474T = this.f279483c.getIntent().getBooleanExtra("KsnsUpload_isGame", false);
        this.f279475U = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_MessageExtraData"), "");
        this.f279476V = this.f279483c.getIntent().getIntExtra("KsnsUpload_SubType", 0);
        this.f279477W = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_PreloadResouces"), "");
        this.f279526y = this.f279483c.getIntent().getBooleanExtra("ksnsis_gamesharecard", false);
        this.f279510p0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("ksnsUpload_gameShareLiteAppBizData"), "");
        this.f279512q0 = this.f279483c.getIntent().getIntExtra("ksnsUpload_gameShareLiteAppPriority", 0);
        this.f279514r0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("ksnsUpload_gameShareData"), "");
        this.f279516s0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("ksnsUpload_gameShareId"), "");
        this.f279518t0 = this.f279483c.getIntent().getIntExtra("ksnsUpload_gameShareIsVideo", 0);
        this.f279520u0 = this.f279483c.getIntent().getIntExtra("ksnsUpload_gameShareDuration", 0);
        if (this.f279525x || this.f279526y) {
            this.f279478X = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_LiteAppId"), "");
            this.f279479Y = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_LiteAppPath"), "");
            this.f279480Z = Util.nullAs(this.f279483c.getIntent().getStringExtra("KsnsUpload_LiteAppQuery"), "");
        }
        String nullAs = Util.nullAs(this.f279483c.getIntent().getStringExtra("KlinkThumb_url"), "");
        this.f279507o = nullAs;
        if (nullAs.startsWith("http://mmsns.qpic.cn") || this.f279507o.startsWith("https://mmsns.qpic.cn")) {
            String str = this.f279507o;
            this.f279493h = str;
            this.f279495i = null;
            Log.m105925i("MicroMsg.LinkWidget", "get thumb url %s", str);
        }
        Bundle bundleExtra = this.f279483c.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f279458D = new SendMessageToWX.Req(bundleExtra).message;
            if (Util.isNullOrNil(this.f279491g)) {
                this.f279491g = this.f279458D.title;
            }
            if (Util.isNullOrNil(this.f279459E)) {
                this.f279459E = this.f279458D.description;
            }
            if (Util.isNullOrNil(this.f279495i)) {
                this.f279495i = this.f279458D.thumbData;
            }
        }
        byte[] byteArrayExtra = this.f279483c.getIntent().getByteArrayExtra("KWebSearchInfo");
        if (byteArrayExtra != null) {
            w25 w25 = new w25();
            this.f279492g0 = w25;
            try {
                w25.parseFrom(byteArrayExtra);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.LinkWidget", e, "parse web search info failed", new Object[0]);
                this.f279492g0 = null;
            }
        }
        String stringExtra2 = this.f279483c.getIntent().getStringExtra("KSnsStrId");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(Util.nullAs(this.f279483c.getIntent().getStringExtra("KSnsLocalId"), ""));
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f279467M = C91998s.m115550d(706);
            System.currentTimeMillis();
            C91998s sVar = this.f279467M;
            int i = sVar.f263363e;
            if (DN != null) {
                DN.isAd();
                sVar.getClass();
                DN.getUxinfo();
            }
            C95007z.f275640b.mo131396a(this.f279467M);
        }
        if (this.f279483c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f279522v0 = 1;
        } else {
            this.f279522v0 = 0;
        }
        this.f279524w0 = Util.nullAs(this.f279483c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        String stringExtra3 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_object_xml");
        if (!Util.isNullOrNil(stringExtra3) && (parseXml8 = XmlParser.parseXml(stringExtra3, "finderFeed", (String) null)) != null) {
            C54022l lVar = new C54022l();
            this.f279494h0 = lVar;
            lVar.f151291a = C60167f1.m70151i("", parseXml8);
        }
        String stringExtra4 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_topic_xml");
        if (!Util.isNullOrNil(stringExtra4) && (parseXml7 = XmlParser.parseXml(stringExtra4, "finderTopic", (String) null)) != null) {
            C54024n nVar = new C54024n();
            this.f279496i0 = nVar;
            nVar.f151293a = C60167f1.m70155m("", parseXml7);
        }
        String stringExtra5 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_activity_xml");
        if (!Util.isNullOrNil(stringExtra5) && (parseXml6 = XmlParser.parseXml(stringExtra5, "finderTopic", (String) null)) != null) {
            C54018h hVar = new C54018h();
            this.f279498j0 = hVar;
            hVar.f151287a = C60167f1.m70155m("", parseXml6);
        }
        String stringExtra6 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_music_topic_xml");
        if (!Util.isNullOrNil(stringExtra6) && (parseXml5 = XmlParser.parseXml(stringExtra6, "finderTopic", (String) null)) != null) {
            C54021k kVar = new C54021k();
            this.f279500k0 = kVar;
            kVar.f151290a = C60167f1.m70155m("", parseXml5);
        }
        String stringExtra7 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_album_xml");
        if (!Util.isNullOrNil(stringExtra7) && (parseXml4 = XmlParser.parseXml(stringExtra7, "finderColumn", (String) null)) != null) {
            C54019i iVar = new C54019i();
            this.f279504m0 = iVar;
            iVar.f151288a = C60167f1.m70152j("", parseXml4);
        }
        String stringExtra8 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_live_xml");
        if (!Util.isNullOrNil(stringExtra8) && (parseXml3 = XmlParser.parseXml(stringExtra8, "finderLive", (String) null)) != null) {
            C54020j jVar = new C54020j();
            this.f279502l0 = jVar;
            jVar.mo74688e("", parseXml3);
        }
        if (!Util.isNullOrNil(this.f279483c.getIntent().getStringExtra("ksnsupload_mega_video_object_xml")) && (parseXml2 = XmlParser.parseXml(stringExtra3, "finderMegaVideo", (String) null)) != null) {
            C54025o oVar = new C54025o();
            this.f279506n0 = oVar;
            oVar.f151294a = C60167f1.m70158p("", parseXml2);
        }
        String stringExtra9 = this.f279483c.getIntent().getStringExtra("ksnsupload_finder_poi_xml");
        if (!Util.isNullOrNil(stringExtra9) && (parseXml = XmlParser.parseXml(stringExtra9, "finder", (String) null)) != null) {
            C54023m mVar = new C54023m();
            this.f279508o0 = mVar;
            mVar.f151292a = C60167f1.m70154l(".finder.detail", parseXml);
        }
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.LinkWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        C94945s2 s2Var;
        WXMediaMessage wXMediaMessage;
        boolean z2;
        Bitmap bitmap;
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        if (this.f279521v) {
            s2Var = new C94945s2(4, this.f279483c);
        } else if (this.f279519u) {
            s2Var = new C94945s2(5, this.f279483c);
        } else if (this.f279523w) {
            s2Var = new C94945s2(30, this.f279483c);
            String str3 = this.f279469O;
            SnsMethodCalculate.markStartTimeMs("setAppBrandUsername", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298070d = str3;
            SnsMethodCalculate.markEndTimeMs("setAppBrandUsername", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            String str4 = this.f279470P;
            SnsMethodCalculate.markStartTimeMs("setAppBrandPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298071e = str4;
            SnsMethodCalculate.markEndTimeMs("setAppBrandPath", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            int i6 = this.f279471Q;
            SnsMethodCalculate.markStartTimeMs("setAppBrandVersion", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298072f = i6;
            SnsMethodCalculate.markEndTimeMs("setAppBrandVersion", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            int i7 = this.f279472R;
            SnsMethodCalculate.markStartTimeMs("setAppBrandVersionType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298073g = i7;
            SnsMethodCalculate.markEndTimeMs("setAppBrandVersionType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            String str5 = this.f279473S;
            SnsMethodCalculate.markStartTimeMs("setAppBrandShareActionId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298074h = str5;
            SnsMethodCalculate.markEndTimeMs("setAppBrandShareActionId", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            boolean z3 = this.f279474T;
            SnsMethodCalculate.markStartTimeMs("setAppBrandIsGame", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298075i = z3 ? 1 : 0;
            SnsMethodCalculate.markEndTimeMs("setAppBrandIsGame", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            String str6 = this.f279475U;
            SnsMethodCalculate.markStartTimeMs("setAppBrandMessageExtraData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298076j = str6;
            SnsMethodCalculate.markEndTimeMs("setAppBrandMessageExtraData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            int i8 = this.f279476V;
            SnsMethodCalculate.markStartTimeMs("setAppBrandSubType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298077n = i8;
            SnsMethodCalculate.markEndTimeMs("setAppBrandSubType", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            String str7 = this.f279477W;
            SnsMethodCalculate.markStartTimeMs("setAppBrandPreloadResources", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.weappInfo.f298078o = str7;
            SnsMethodCalculate.markEndTimeMs("setAppBrandPreloadResources", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        } else if (this.f279525x) {
            s2Var = new C94945s2(41, this.f279483c);
            C101796jo2 jo22 = new C101796jo2();
            jo22.f298552d = this.f279478X;
            jo22.f298553e = this.f279479Y;
            jo22.f298554f = this.f279480Z;
            SnsMethodCalculate.markStartTimeMs("setLiteAppInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var.f275199f.liteappInfo = jo22;
            SnsMethodCalculate.markEndTimeMs("setLiteAppInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        } else {
            int i9 = this.f279468N;
            if (i9 == 11) {
                s2Var = new C94945s2(18, this.f279483c);
                sc4 sc4 = new sc4();
                sc4.f299427f = this.f279482b0;
                sc4.f299429h = this.f279491g;
                sc4.f299425d = this.f279489f;
                sc4.f299428g = this.f279484c0;
                sc4.f299426e = this.f279481a0;
                sc4.f299430i = this.f279493h;
                sc4.f299431j = this.f279486d0;
                sc4.f299432n = this.f279488e0;
                SnsMethodCalculate.markStartTimeMs("setSteramVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                s2Var.f275199f.streamvideo = sc4;
                SnsMethodCalculate.markEndTimeMs("setSteramVideo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else if (i9 == 15) {
                s2Var = new C94945s2(26, this.f279483c);
                String str8 = this.f279490f0;
                SnsMethodCalculate.markStartTimeMs("setObjNoteLinkXml", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                s2Var.f275199f.ContentObj.f298429j = str8;
                SnsMethodCalculate.markEndTimeMs("setObjNoteLinkXml", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else if (i9 == 16 && this.f279492g0 != null) {
                s2Var = new C94945s2(3, this.f279483c);
                w25 w25 = this.f279492g0;
                SnsMethodCalculate.markStartTimeMs("setWebSearchInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                if (w25 != null) {
                    s2Var.f275205l = w25;
                }
                SnsMethodCalculate.markEndTimeMs("setWebSearchInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else if (i9 == 17) {
                s2Var = new C94945s2(28, this.f279483c);
                C54022l lVar = this.f279494h0;
                if (lVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setShareFinderObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298431o = lVar.f151291a;
                    SnsMethodCalculate.markEndTimeMs("setShareFinderObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 23) {
                s2Var = new C94945s2(36, this.f279483c);
                C54025o oVar = this.f279506n0;
                if (oVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298436t = oVar.f151294a;
                    SnsMethodCalculate.markEndTimeMs("setMegaVideoShareObject", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 18) {
                s2Var = new C94945s2(29, this.f279483c);
                C54024n nVar = this.f279496i0;
                if (nVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setShareFinderTopic", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298432p = nVar.f151293a;
                    SnsMethodCalculate.markEndTimeMs("setShareFinderTopic", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 22) {
                s2Var = new C94945s2(37, this.f279483c);
                C54024n nVar2 = this.f279496i0;
                if (nVar2 != null) {
                    SnsMethodCalculate.markStartTimeMs("setShareFinderTopic", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298432p = nVar2.f151293a;
                    SnsMethodCalculate.markEndTimeMs("setShareFinderTopic", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 24) {
                s2Var = new C94945s2(39, this.f279483c);
                C54018h hVar = this.f279498j0;
                if (hVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setShareActivity", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298438v = hVar.f151287a;
                    SnsMethodCalculate.markEndTimeMs("setShareActivity", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 20) {
                s2Var = new C94945s2(38, this.f279483c);
                C54019i iVar3 = this.f279504m0;
                if (iVar3 != null) {
                    SnsMethodCalculate.markStartTimeMs("setShareFinderAlbum", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298434r = iVar3.f151288a;
                    SnsMethodCalculate.markEndTimeMs("setShareFinderAlbum", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 21) {
                s2Var = new C94945s2(34, this.f279483c);
                C54020j jVar = this.f279502l0;
                if (jVar != null) {
                    s2Var.mo131233G(jVar);
                }
            } else if (i9 == 30) {
                s2Var = new C94945s2(45, this.f279483c);
                C54020j jVar2 = this.f279502l0;
                if (jVar2 != null) {
                    s2Var.mo131233G(jVar2);
                }
            } else if (i9 == 27) {
                s2Var = new C94945s2(43, this.f279483c);
                C54020j jVar3 = this.f279502l0;
                if (jVar3 != null) {
                    s2Var.mo131233G(jVar3);
                }
            } else if (i9 == 29) {
                s2Var = new C94945s2(44, this.f279483c);
                C54023m mVar = this.f279508o0;
                if (mVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setSharePoi", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298440x = mVar.f151292a;
                    SnsMethodCalculate.markEndTimeMs("setSharePoi", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 32) {
                s2Var = new C94945s2(46, this.f279483c);
                C54021k kVar = this.f279500k0;
                if (kVar != null) {
                    SnsMethodCalculate.markStartTimeMs("setShareMusicTopic", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    s2Var.f275199f.ContentObj.f298442z = kVar.f151290a;
                    SnsMethodCalculate.markEndTimeMs("setShareMusicTopic", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                }
            } else if (i9 == 34) {
                s2Var = new C94945s2(101, this.f279483c);
                C101796jo2 jo23 = new C101796jo2();
                jo23.f298552d = this.f279478X;
                jo23.f298553e = this.f279479Y;
                jo23.f298554f = this.f279480Z;
                SnsMethodCalculate.markStartTimeMs("setLiteAppInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                s2Var.f275199f.liteappInfo = jo23;
                SnsMethodCalculate.markEndTimeMs("setLiteAppInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                C101815ms1 ms12 = new C101815ms1();
                ms12.f298871h = this.f279510p0;
                ms12.f298872i = this.f279512q0;
                ms12.f298868e = this.f279516s0;
                ms12.f298867d = this.f279514r0;
                ms12.f298869f = this.f279518t0;
                ms12.f298870g = this.f279520u0;
                SnsMethodCalculate.markStartTimeMs("setGameShareCardInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                s2Var.f275199f.gameShareCardObject = ms12;
                SnsMethodCalculate.markEndTimeMs("setGameShareCardInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            } else {
                s2Var = new C94945s2(3, this.f279483c);
            }
        }
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            s2Var.mo131261r(1, 4);
        }
        if (this.f279495i == null && (bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(this.f279493h)) != null && !bitmap.isRecycled()) {
            Bitmap extractThumbNail = BitmapUtil.extractThumbNail(bitmap, 150, 150, false, false);
            Log.m105925i("MicroMsg.LinkWidget", "create bitmap %d %d", Integer.valueOf(extractThumbNail.getHeight()), Integer.valueOf(extractThumbNail.getWidth()));
            this.f279495i = BitmapUtil.Bitmap2Bytes(extractThumbNail);
        }
        s2Var.mo131267x(this.f279491g);
        s2Var.mo131266w(this.f279489f);
        s2Var.mo131268y(this.f279489f);
        s2Var.mo131260q(str);
        s2Var.mo131266w(Util.nullAs(this.f279483c.getIntent().getStringExtra("ksnsupload_link_desc"), ""));
        if (this.f279468N == 15) {
            s2Var.mo131266w(Util.nullAs(this.f279483c.getIntent().getStringExtra("fav_note_link_description"), ""));
        }
        if (this.f279521v) {
            byte[] bArr = this.f279495i;
            String str9 = this.f279489f;
            s2Var.mo131249f(bArr, str9, str9, str9, 3, "", "", "", "", "");
        } else if (this.f279519u) {
            WXVideoObject wXVideoObject = null;
            WXMediaMessage wXMediaMessage2 = this.f279458D;
            if (wXMediaMessage2 != null) {
                wXVideoObject = (WXVideoObject) wXMediaMessage2.mediaObject;
            }
            byte[] bArr2 = this.f279495i;
            String str10 = this.f279489f;
            s2Var.mo131249f(bArr2, str10, wXVideoObject == null ? str10 : Util.nullAs(wXVideoObject.videoLowBandUrl, str10), wXVideoObject == null ? this.f279489f : Util.nullAs(wXVideoObject.videoUrl, this.f279489f), 4, Util.nullAs(this.f279491g, ""), Util.nullAs(this.f279459E, ""), "", "", "");
        } else if (!Util.isNullOrNil(this.f279507o)) {
            s2Var.mo131245b(this.f279507o, "", "", this.f279485d, this.f279487e);
        } else {
            byte[] bArr3 = this.f279495i;
            if (bArr3 != null) {
                if (this.f279523w) {
                    SnsMethodCalculate.markStartTimeMs("isPngThumbData", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
                    if (bArr3.length < 4) {
                        SnsMethodCalculate.markEndTimeMs("isPngThumbData", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
                        z2 = false;
                    } else {
                        byte[] bArr4 = {-119, 80, 78, 71};
                        int i15 = 0;
                        z2 = true;
                        for (int i16 = 4; i15 < i16; i16 = 4) {
                            if (bArr3[i15] != bArr4[i15]) {
                                z2 = false;
                            }
                            i15++;
                        }
                        SnsMethodCalculate.markEndTimeMs("isPngThumbData", "com.tencent.mm.plugin.sns.ui.AppBrandPng2JpegHelper");
                    }
                    if (z2) {
                        Log.m105924i("MicroMsg.LinkWidget", "isPngThumbData");
                        byte[] a = C43106i.m46718a(this.f279495i);
                        if (a != null && a.length > 0) {
                            Log.m105924i("MicroMsg.LinkWidget", "use covert data");
                            this.f279495i = C43106i.m46718a(a);
                        }
                    }
                }
                s2Var.mo131247d(this.f279495i, "", "");
            }
        }
        s2Var.mo131269z(this.f279522v0, this.f279524w0);
        s2Var.mo131234H(this.f279505n);
        s2Var.mo131237K(this.f279501l);
        s2Var.mo131236J(this.f279503m);
        String str11 = this.f279509p;
        SnsMethodCalculate.markStartTimeMs("setStatExtStr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        s2Var.f275199f.statExtStr = Util.nullAsNil(str11);
        Log.m105925i("MicroMsg.UploadPackHelper", "setStatExtStr:%s", str11);
        SnsMethodCalculate.markEndTimeMs("setStatExtStr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        s2Var.mo131262s(linkedList);
        s2Var.mo131228B(i);
        if (z) {
            s2Var.mo131264u(1);
        } else {
            s2Var.mo131264u(0);
        }
        s2Var.mo131263t(list2);
        LinkedList linkedList2 = new LinkedList();
        if (list != null) {
            new LinkedList();
            List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
            for (String next : list) {
                if (gt != null && !gt.contains(next)) {
                    f94 f94 = new f94();
                    f94.f298255d = next;
                    linkedList2.add(f94);
                }
            }
        }
        if (iVar2 != null) {
            s2Var.mo131241O(iVar2.f350347d, iVar2.f350348e);
        }
        s2Var.mo131243Q(linkedList2);
        if (!Util.isNullOrNil(this.f279527z)) {
            s2Var.mo131231E(this.f279527z);
        }
        if (!Util.isNullOrNil(this.f279455A)) {
            s2Var.mo131230D(Util.nullAs(this.f279455A, ""));
        }
        if (this.f279456B) {
            s2Var.mo131234H(5);
        }
        s2Var.mo131265v(kr22);
        if (this.f279457C && (wXMediaMessage = this.f279458D) != null) {
            s2Var.mo131238L(wXMediaMessage.mediaTagName);
            String str12 = this.f279527z;
            WXMediaMessage wXMediaMessage3 = this.f279458D;
            s2Var.mo131240N(str12, wXMediaMessage3.messageExt, wXMediaMessage3.messageAction);
        }
        s2Var.mo131259p(str2);
        s2Var.mo131235I(this.f279460F, this.f279461G, this.f279462H, i4, i5);
        s2Var.mo131229C(this.f279463I);
        s2Var.mo131232F(this.f279464J);
        int i17 = this.f279465K;
        SnsMethodCalculate.markStartTimeMs("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        s2Var.f275199f.contentattr = i17;
        SnsMethodCalculate.markEndTimeMs("setContentattr", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        mo133779j(s2Var);
        int i18 = s2Var.mo131252i();
        C91998s sVar = this.f279466L;
        if (sVar != null) {
            sVar.mo125840a(i18);
            C95006y.f275639b.mo131398c(this.f279466L);
        }
        C91998s sVar2 = this.f279467M;
        if (sVar2 != null) {
            sVar2.mo125840a(i18);
            C95007z.f275640b.mo131398c(this.f279467M);
            this.f279467M.getClass();
        }
        C94866e1.gy0().mo131192c();
        this.f279483c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        Bitmap bitmap = this.f279499k;
        if (bitmap != null && !bitmap.isRecycled() && this.f279497j) {
            this.f279499k.recycle();
        }
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.LinkWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.LinkWidget");
        return false;
    }
}
