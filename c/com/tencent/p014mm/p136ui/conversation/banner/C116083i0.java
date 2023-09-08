package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NetworkDiagnoseResultEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.i0 */
public class C116083i0 extends C78802b {

    /* renamed from: F */
    public static final String f348362F = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmm) + "/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s");

    /* renamed from: A */
    public boolean f348363A;

    /* renamed from: B */
    public String f348364B;

    /* renamed from: C */
    public MTimerHandler f348365C;

    /* renamed from: D */
    public IListener<NetworkDiagnoseResultEvent> f348366D;

    /* renamed from: E */
    public View f348367E = null;

    /* renamed from: h */
    public TextView f348368h;

    /* renamed from: i */
    public TextView f348369i;

    /* renamed from: j */
    public TextView f348370j;

    /* renamed from: n */
    public TextView f348371n;

    /* renamed from: o */
    public TextView f348372o;

    /* renamed from: p */
    public ImageView f348373p;

    /* renamed from: q */
    public ImageView f348374q;

    /* renamed from: r */
    public ImageView f348375r;

    /* renamed from: s */
    public ImageView f348376s;

    /* renamed from: t */
    public ProgressBar f348377t;

    /* renamed from: u */
    public String f348378u;

    /* renamed from: v */
    public boolean f348379v = false;

    /* renamed from: w */
    public int f348380w = 0;

    /* renamed from: x */
    public int f348381x;

    /* renamed from: y */
    public boolean f348382y;

    /* renamed from: z */
    public boolean f348383z;

    /* renamed from: com.tencent.mm.ui.conversation.banner.i0$a */
    public class C116084a implements View.OnClickListener {
        public C116084a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C116083i0 i0Var = C116083i0.this;
            String str = C116083i0.f348362F;
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, i0Var.f230570g.get().getString(C0966R.string.f360087a11));
            intent.putExtra("rawUrl", C116083i0.this.f230570g.get().getString(C0966R.string.h75));
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("showShare", false);
            C88144b.m109791i(C116083i0.this.f230570g.get(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.banner.i0$b */
    public class C116085b implements View.OnClickListener {
        public C116085b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C116083i0 i0Var = C116083i0.this;
            C116083i0.m163373h(i0Var, i0Var.f348380w);
            C116083i0 i0Var2 = C116083i0.this;
            i0Var2.f348380w = 1;
            if (i0Var2.f348366D == null) {
                i0Var2.getClass();
                NetWarnBanner$1 netWarnBanner$1 = new NetWarnBanner$1(i0Var2, C40008f.f107254d);
                i0Var2.f348366D = netWarnBanner$1;
                netWarnBanner$1.alive();
            }
            C116083i0 i0Var3 = C116083i0.this;
            if (i0Var3.f348365C == null) {
                i0Var3.getClass();
                MTimerHandler mTimerHandler = new MTimerHandler(new C116082h0(i0Var3), true);
                i0Var3.f348365C = mTimerHandler;
                mTimerHandler.startTimer(1000);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.banner.i0$c */
    public class C116086c implements View.OnClickListener {
        public C116086c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C116083i0 i0Var = C116083i0.this;
            String str = C116083i0.f348362F;
            if (!Util.jump(i0Var.f230570g.get(), C116083i0.this.f348378u)) {
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, C116083i0.this.f230570g.get().getString(C0966R.string.h7a));
                intent.putExtra("rawUrl", C116083i0.this.f230570g.get().getString(C0966R.string.h75));
                intent.putExtra("showShare", false);
                C88144b.m109791i(C116083i0.this.f230570g.get(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C116083i0(Context context) {
        super(context);
        mo177394i();
    }

    /* renamed from: h */
    public static void m163373h(C116083i0 i0Var, int i) {
        i0Var.getClass();
        Intent intent = new Intent();
        intent.putExtra("diagnose_state", i);
        intent.putExtra("diagnose_percent", i0Var.f348381x);
        intent.putExtra("diagnose_kvInfo", i0Var.f348364B);
        Log.m105925i("MicroMsg.NetWarnView", "put state: %d, process: %d, kv: %s", Integer.valueOf(i), Integer.valueOf(i0Var.f348381x), i0Var.f348364B);
        C88144b.m109791i(i0Var.f230570g.get(), "traceroute", ".ui.NetworkDiagnoseAllInOneUI", intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo7968a() {
        MTimerHandler mTimerHandler = this.f348365C;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f348365C = null;
        }
        IListener<NetworkDiagnoseResultEvent> iListener = this.f348366D;
        if (iListener != null) {
            iListener.dead();
        }
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.bkj;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x023c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7970e() {
        /*
            r15 = this;
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            int r0 = r0.mo123467m()
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            java.lang.String r1 = r1.mo123465k()
            java.lang.String r2 = f348362F
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "0x"
            r5.append(r6)
            int r6 = qe3.C89625d.f257841g
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = p156gj.C87200o.f252868a
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r8 = 2
            r4[r8] = r5
            r5 = 3
            r4[r5] = r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r9 = 4
            r4[r9] = r1
            java.lang.String r1 = java.lang.String.format(r2, r4)
            r15.f348378u = r1
            r15.mo177394i()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r6] = r2
            java.lang.String r2 = "MicroMsg.NetWarnView"
            java.lang.String r4 = "update st:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            r1 = 8
            if (r0 == 0) goto L_0x0111
            if (r0 == r3) goto L_0x00d6
            if (r0 == r8) goto L_0x0088
            if (r0 == r5) goto L_0x006a
            r0 = 0
            goto L_0x0138
        L_0x006a:
            android.widget.TextView r0 = r15.f348368h
            r2 = 2131833490(0x7f113292, float:1.9300064E38)
            r0.setText(r2)
            android.widget.TextView r0 = r15.f348369i
            r0.setVisibility(r1)
            android.widget.TextView r0 = r15.f348371n
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r15.f348377t
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r15.f348373p
            r0.setVisibility(r6)
            goto L_0x0137
        L_0x0088:
            int r0 = r15.f348380w
            if (r0 != r7) goto L_0x00af
            android.widget.TextView r0 = r15.f348368h
            java.lang.ref.WeakReference<android.content.Context> r2 = r15.f230570g
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131833493(0x7f113295, float:1.930007E38)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            int r5 = r15.f348381x
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r6] = r5
            java.lang.String r2 = r2.getString(r3, r4)
            r0.setText(r2)
            goto L_0x00b7
        L_0x00af:
            android.widget.TextView r0 = r15.f348368h
            r2 = 2131833492(0x7f113294, float:1.9300068E38)
            r0.setText(r2)
        L_0x00b7:
            android.widget.TextView r0 = r15.f348369i
            r0.setVisibility(r1)
            android.widget.TextView r0 = r15.f348371n
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r15.f348377t
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r15.f348373p
            r0.setVisibility(r6)
            android.view.View r0 = r15.f348367E
            com.tencent.mm.ui.conversation.banner.i0$b r2 = new com.tencent.mm.ui.conversation.banner.i0$b
            r2.<init>()
            r0.setOnClickListener(r2)
            goto L_0x0137
        L_0x00d6:
            android.widget.TextView r0 = r15.f348368h
            r2 = 2131833495(0x7f113297, float:1.9300074E38)
            r0.setText(r2)
            android.widget.TextView r0 = r15.f348369i
            java.lang.ref.WeakReference<android.content.Context> r2 = r15.f230570g
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            r3 = 2131833496(0x7f113298, float:1.9300076E38)
            java.lang.String r2 = r2.getString(r3)
            r0.setText(r2)
            android.widget.TextView r0 = r15.f348369i
            r0.setVisibility(r6)
            android.widget.TextView r0 = r15.f348371n
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r15.f348377t
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r15.f348373p
            r0.setVisibility(r6)
            android.view.View r0 = r15.f348367E
            com.tencent.mm.ui.conversation.banner.i0$c r2 = new com.tencent.mm.ui.conversation.banner.i0$c
            r2.<init>()
            r0.setOnClickListener(r2)
            goto L_0x0137
        L_0x0111:
            android.widget.TextView r0 = r15.f348368h
            r2 = 2131821610(0x7f11042a, float:1.9275968E38)
            r0.setText(r2)
            android.widget.TextView r0 = r15.f348369i
            r0.setVisibility(r1)
            android.widget.TextView r0 = r15.f348371n
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r15.f348377t
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r15.f348373p
            r0.setVisibility(r6)
            android.view.View r0 = r15.f348367E
            com.tencent.mm.ui.conversation.banner.i0$a r2 = new com.tencent.mm.ui.conversation.banner.i0$a
            r2.<init>()
            r0.setOnClickListener(r2)
        L_0x0137:
            r0 = 1
        L_0x0138:
            java.lang.ref.WeakReference<android.content.Context> r2 = r15.f230570g
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099710(0x7f06003e, float:1.781178E38)
            r2.getColor(r3)
            if (r0 == 0) goto L_0x01e2
            android.widget.TextView r2 = r15.f348370j
            r2.setVisibility(r1)
            android.widget.TextView r2 = r15.f348368h
            r2.setVisibility(r6)
            android.view.View r2 = r15.f348367E
            r3 = 2131235305(0x7f0811e9, float:1.80868E38)
            r2.setBackgroundResource(r3)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            android.widget.ImageView r3 = r15.f348373p
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r2.<init>(r3)
            java.lang.ref.WeakReference<android.content.Context> r3 = r15.f230570g
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            r4 = 28
            int r3 = kg3.C76577a.m92151b(r3, r4)
            java.lang.ref.WeakReference<android.content.Context> r4 = r15.f230570g
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            r5 = 24
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r2.setMargins(r3, r6, r4, r6)
            android.widget.ImageView r3 = r15.f348373p
            r3.setLayoutParams(r2)
            android.widget.ImageView r2 = r15.f348373p
            java.lang.Object r2 = r2.getTag()
            r3 = 2131756021(0x7f1003f5, float:1.9142938E38)
            if (r2 != 0) goto L_0x0199
            goto L_0x01a1
        L_0x0199:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x01a3
        L_0x01a1:
            r2 = 1
            goto L_0x01a4
        L_0x01a3:
            r2 = 0
        L_0x01a4:
            if (r2 == 0) goto L_0x01d3
            android.widget.ImageView r2 = r15.f348373p
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.setTag(r4)
            android.widget.ImageView r2 = r15.f348373p
            java.lang.ref.WeakReference<android.content.Context> r4 = r15.f230570g
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            java.lang.ref.WeakReference<android.content.Context> r5 = r15.f230570g
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            android.content.res.Resources r5 = r5.getResources()
            r8 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r5 = r5.getColor(r8)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r3, r5)
            r2.setImageDrawable(r3)
        L_0x01d3:
            android.widget.ImageView r2 = r15.f348375r
            r2.setVisibility(r1)
            android.widget.ImageView r2 = r15.f348376s
            r2.setVisibility(r1)
            android.widget.TextView r2 = r15.f348372o
            r2.setVisibility(r1)
        L_0x01e2:
            if (r0 != 0) goto L_0x01eb
            android.widget.ImageView r2 = r15.f348374q
            r2.setVisibility(r1)
            boolean r2 = sf0.C90188n0.f258933a
        L_0x01eb:
            android.widget.ImageView r2 = r15.f348376s
            java.lang.Object r2 = r2.getTag()
            r3 = 2131755333(0x7f100145, float:1.9141542E38)
            if (r2 != 0) goto L_0x01f7
            goto L_0x01ff
        L_0x01f7:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x0201
        L_0x01ff:
            r2 = 1
            goto L_0x0202
        L_0x0201:
            r2 = 0
        L_0x0202:
            if (r2 == 0) goto L_0x0212
            android.widget.ImageView r2 = r15.f348376s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.setTag(r4)
            android.widget.ImageView r2 = r15.f348376s
            r2.setImageResource(r3)
        L_0x0212:
            android.widget.ImageView r2 = r15.f348374q
            java.lang.Object r2 = r2.getTag()
            if (r2 != 0) goto L_0x021b
            goto L_0x0225
        L_0x021b:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r3) goto L_0x0224
            goto L_0x0225
        L_0x0224:
            r7 = 0
        L_0x0225:
            if (r7 == 0) goto L_0x0238
            android.widget.ImageView r2 = r15.f348374q
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setTag(r3)
            android.widget.ImageView r2 = r15.f348374q
            r3 = 2131231359(0x7f08027f, float:1.8078797E38)
            r2.setImageResource(r3)
        L_0x0238:
            android.view.View r2 = r15.f348367E
            if (r0 == 0) goto L_0x023d
            r1 = 0
        L_0x023d:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo10233c(r1)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/conversation/banner/NetWarnBanner"
            java.lang.String r10 = "refreshAndReturnIsVisible"
            java.lang.String r11 = "()Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r3.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r8 = "com/tencent/mm/ui/conversation/banner/NetWarnBanner"
            java.lang.String r9 = "refreshAndReturnIsVisible"
            java.lang.String r10 = "()Z"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.banner.C116083i0.mo7970e():boolean");
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f348367E;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: i */
    public void mo177394i() {
        View view;
        if (!this.f348379v && (view = this.f230569f) != null) {
            this.f348367E = view.findViewById(C0966R.C0970id.f358877hl0);
            this.f348368h = (TextView) this.f230569f.findViewById(C0966R.C0970id.hkv);
            this.f348369i = (TextView) this.f230569f.findViewById(C0966R.C0970id.hkw);
            this.f348370j = (TextView) this.f230569f.findViewById(C0966R.C0970id.hkx);
            this.f348371n = (TextView) this.f230569f.findViewById(C0966R.C0970id.hku);
            this.f348377t = (ProgressBar) this.f230569f.findViewById(C0966R.C0970id.hkz);
            this.f348373p = (ImageView) this.f230569f.findViewById(C0966R.C0970id.hky);
            this.f348374q = (ImageView) this.f230569f.findViewById(C0966R.C0970id.bem);
            this.f348375r = (ImageView) this.f230569f.findViewById(C0966R.C0970id.eeb);
            this.f348376s = (ImageView) this.f230569f.findViewById(C0966R.C0970id.jlh);
            this.f348372o = (TextView) this.f230569f.findViewById(C0966R.C0970id.cj6);
            this.f348374q.setVisibility(8);
            this.f348379v = true;
        }
    }
}
