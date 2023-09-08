package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TeenModeAuthStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import junit.framework.Assert;
import kotlin.Metadata;
import ky2.C10428a;
import ky2.C10432i;
import ky2.C10437m;
import ky2.C10439o;
import ly2.C10675k;
import my2.C11096c;
import my2.C11098e;
import nj3.C76879j;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t90.C13867d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lky2/o;", "<init>", "()V", "a", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI */
public final class AuthorizationDetailUI extends MMActivity implements C10439o {

    /* renamed from: t */
    public static final /* synthetic */ int f21369t = 0;

    /* renamed from: d */
    public final C13601g f21370d = C36568h.m40985a(new C5524c(this));

    /* renamed from: e */
    public final C13601g f21371e = C36568h.m40985a(new C5530i(this));

    /* renamed from: f */
    public final C13601g f21372f = C36568h.m40985a(new C5537o(this));

    /* renamed from: g */
    public final C13601g f21373g = C36568h.m40985a(new C5538p(this));

    /* renamed from: h */
    public final C13601g f21374h = C36568h.m40985a(new C5523b(this));

    /* renamed from: i */
    public final C13601g f21375i = C36568h.m40985a(new C5528g(this));

    /* renamed from: j */
    public final C13601g f21376j = C36568h.m40985a(new C5527f(this));

    /* renamed from: n */
    public final C13601g f21377n = C36568h.m40985a(new C5529h(this));

    /* renamed from: o */
    public final C13601g f21378o = C36568h.m40985a(new C5539q(this));

    /* renamed from: p */
    public final C13601g f21379p = C36568h.m40985a(new C5526e(this));

    /* renamed from: q */
    public final C13601g f21380q = C36568h.m40985a(new C5525d(this));

    /* renamed from: r */
    public final C13601g f21381r = C36568h.m40985a(new C5536n(this));

    /* renamed from: s */
    public final C5522a f21382s = new C5522a((C10437m) null, 1, (C8480h) null);

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a */
    public static final class C5522a extends C10428a.C10429a {

        /* renamed from: n */
        public C10437m f21383n;

        public C5522a(C10437m mVar, int i, C8480h hVar) {
            this.f21383n = (i & 1) != 0 ? null : mVar;
        }

        /* renamed from: b */
        public final C10437m mo6572b() {
            return this.f21383n;
        }

        /* renamed from: c */
        public final void mo6573c(C10437m mVar) {
            this.f21383n = mVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$b */
    public static final class C5523b extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5523b(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21384d = authorizationDetailUI;
        }

        public Object invoke() {
            return (Button) this.f21384d.findViewById(C0966R.C0970id.a0v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$c */
    public static final class C5524c extends C87413o implements C32224a<C68070l.C68072b> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5524c(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21385d = authorizationDetailUI;
        }

        public Object invoke() {
            return C68070l.C68072b.m80422u(this.f21385d.getIntent().getStringExtra("intent_extra_msg_content"), (String) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$d */
    public static final class C5525d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5525d(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21386d = authorizationDetailUI;
        }

        public Object invoke() {
            return (TextView) this.f21386d.findViewById(C0966R.C0970id.a0w);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$e */
    public static final class C5526e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5526e(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21387d = authorizationDetailUI;
        }

        public Object invoke() {
            return this.f21387d.findViewById(C0966R.C0970id.f359477l33);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$f */
    public static final class C5527f extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5527f(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21388d = authorizationDetailUI;
        }

        public Object invoke() {
            return (LinearLayout) this.f21388d.findViewById(C0966R.C0970id.f357472a10);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$g */
    public static final class C5528g extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5528g(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21389d = authorizationDetailUI;
        }

        public Object invoke() {
            return (Button) this.f21389d.findViewById(C0966R.C0970id.a0y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$h */
    public static final class C5529h extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5529h(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21390d = authorizationDetailUI;
        }

        public Object invoke() {
            return (WeImageView) this.f21390d.findViewById(C0966R.C0970id.a0z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$i */
    public static final class C5530i extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5530i(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21391d = authorizationDetailUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f21391d.getIntent().getLongExtra("intent_extra_msg_svrid", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$j */
    public static final class C5531j implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21392d;

        public C5531j(AuthorizationDetailUI authorizationDetailUI) {
            this.f21392d = authorizationDetailUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21392d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$k */
    public static final class C5532k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21393d;

        /* renamed from: e */
        public final /* synthetic */ String f21394e;

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$k$a */
        public static final class C5533a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C89779i0 f21395a;

            /* renamed from: b */
            public final /* synthetic */ C13867d f21396b;

            /* renamed from: c */
            public final /* synthetic */ AuthorizationDetailUI f21397c;

            public C5533a(C89779i0 i0Var, C13867d dVar, AuthorizationDetailUI authorizationDetailUI) {
                this.f21395a = i0Var;
                this.f21396b = dVar;
                this.f21397c = authorizationDetailUI;
            }

            public Object call(Object obj) {
                Map<String, String> parseXml;
                String str;
                C68070l.C68072b u;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                this.f21395a.dismiss();
                if (cVar.f256794b == 0 && cVar.f256793a == 0) {
                    C13867d dVar = this.f21396b;
                    if (!(dVar.f39032d != 3 || (parseXml = XmlParser.parseXml(dVar.f39033e, "content", (String) null)) == null || (str = parseXml.get(".content")) == null || (u = C68070l.C68072b.m80422u(str, (String) null)) == null)) {
                        TeenModeAuthStruct teenModeAuthStruct = new TeenModeAuthStruct();
                        teenModeAuthStruct.f10061d = 2;
                        teenModeAuthStruct.f10062e = 2;
                        teenModeAuthStruct.f10063f = 3;
                        AuthorizationDetailUI authorizationDetailUI = this.f21397c;
                        int i = AuthorizationDetailUI.f21369t;
                        teenModeAuthStruct.f10064g = teenModeAuthStruct.mo86045b("requestID", String.valueOf(authorizationDetailUI.mo6570I7()), true);
                        teenModeAuthStruct.f10065h = teenModeAuthStruct.mo86045b("requestResource", u.f195586j, true);
                        teenModeAuthStruct.mo86054n();
                    }
                } else {
                    AuthorizationDetailUI authorizationDetailUI2 = this.f21397c;
                    String str2 = cVar.f256795c;
                    int i2 = AuthorizationDetailUI.f21369t;
                    TextView textView = (TextView) authorizationDetailUI2.findViewById(C0966R.C0970id.ckx);
                    textView.setVisibility(0);
                    if (str2 == null) {
                        str2 = authorizationDetailUI2.getString(C0966R.string.f7965xp);
                        C87412m.m108593f(str2, "getString(com.tencent.mm….app_err_server_busy_tip)");
                    }
                    textView.setText(str2);
                }
                return C13598b0.f38549a;
            }
        }

        public C5532k(AuthorizationDetailUI authorizationDetailUI, String str) {
            this.f21393d = authorizationDetailUI;
            this.f21394e = str;
        }

        public final void onClick(View view) {
            C89059e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AuthorizationDetailUI authorizationDetailUI = this.f21393d;
            C89779i0 Q = C76879j.m92723Q(authorizationDetailUI, "", authorizationDetailUI.getContext().getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null);
            AuthorizationDetailUI authorizationDetailUI2 = this.f21393d;
            int i = AuthorizationDetailUI.f21369t;
            ((TextView) authorizationDetailUI2.findViewById(C0966R.C0970id.ckx)).setVisibility(8);
            String str = this.f21394e;
            if (str != null) {
                AuthorizationDetailUI authorizationDetailUI3 = this.f21393d;
                C13867d dVar = (C13867d) authorizationDetailUI3.mo6569H7().mo93555w(C13867d.class);
                int i2 = dVar.f39032d;
                String str2 = dVar.f39031c;
                if (str2 == null) {
                    str2 = "";
                }
                C89059e i3 = new C10675k(str, i2, str2, authorizationDetailUI3.mo6570I7()).mo9225i();
                i3.mo11397F(authorizationDetailUI3);
                eVar = i3.mo123062e(new C5533a(Q, dVar, authorizationDetailUI3));
            } else {
                eVar = null;
            }
            if (eVar == null) {
                Q.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$l */
    public static final class C5534l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21398d;

        public C5534l(AuthorizationDetailUI authorizationDetailUI) {
            this.f21398d = authorizationDetailUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f21398d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$m */
    public static final class C5535m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5535m(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21399d = authorizationDetailUI;
        }

        public Object invoke() {
            AuthorizationDetailUI authorizationDetailUI = this.f21399d;
            int i = AuthorizationDetailUI.f21369t;
            authorizationDetailUI.mo6571J7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$n */
    public static final class C5536n extends C87413o implements C32224a<C10428a> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5536n(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21400d = authorizationDetailUI;
        }

        public Object invoke() {
            AuthorizationDetailUI authorizationDetailUI = this.f21400d;
            int i = AuthorizationDetailUI.f21369t;
            return ((C10432i) C86312j.m106911c(C10432i.class)).mo10753jE(((C13867d) authorizationDetailUI.mo6569H7().mo93555w(C13867d.class)).f39032d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$o */
    public static final class C5537o extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5537o(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21401d = authorizationDetailUI;
        }

        public Object invoke() {
            return (WeImageView) this.f21401d.findViewById(C0966R.C0970id.a16);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$p */
    public static final class C5538p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5538p(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21402d = authorizationDetailUI;
        }

        public Object invoke() {
            return (TextView) this.f21402d.findViewById(C0966R.C0970id.a17);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$q */
    public static final class C5539q extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationDetailUI f21403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5539q(AuthorizationDetailUI authorizationDetailUI) {
            super(0);
            this.f21403d = authorizationDetailUI;
        }

        public Object invoke() {
            return this.f21403d.findViewById(C0966R.C0970id.f359478l34);
        }
    }

    /* renamed from: H7 */
    public final C68070l.C68072b mo6569H7() {
        return (C68070l.C68072b) ((C36570n) this.f21370d).getValue();
    }

    /* renamed from: I7 */
    public final long mo6570I7() {
        return ((Number) ((C36570n) this.f21371e).getValue()).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e8, code lost:
        if (r1 == false) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x038e  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6571J7() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<ky2.i> r1 = ky2.C10432i.class
            ky2.a$b r2 = ky2.C10428a.C10430b.BEFORE_AGREE
            ky2.a$b r3 = ky2.C10428a.C10430b.AUTH_EXPIRED
            ky2.a$b r4 = ky2.C10428a.C10430b.AUTHORIZED
            ky2.a$b r5 = ky2.C10428a.C10430b.REQUEST_INVALID
            di3.d r6 = di3.C86312j.m106911c(r1)
            ky2.i r6 = (ky2.C10432i) r6
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r7 = r0.f21382s
            my2.a r7 = r7.f31650d
            int r7 = r7.field_businessType
            ky2.b r6 = r6.mo10761ts(r7)
            long r7 = eb0.C31543z5.m39451a()
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r9 = r0.f21382s
            long r9 = r9.f31649c
            boolean r7 = r6.mo10735q(r9, r7)
            r8 = 0
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 1
            if (r7 != 0) goto L_0x008a
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r5 = r0.f21382s
            ky2.m r5 = r5.f21383n
            if (r5 == 0) goto L_0x0045
            long r6 = r5.field_time
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r6 != r12) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            if (r6 == 0) goto L_0x006b
            if (r5 == 0) goto L_0x0064
            di3.d r1 = di3.C86312j.m106911c(r1)
            ky2.i r1 = (ky2.C10432i) r1
            int r6 = r5.field_businessType
            ky2.b r1 = r1.mo10761ts(r6)
            long r5 = r5.field_time
            long r13 = eb0.C31543z5.m39451a()
            boolean r1 = r1.mo10734d(r5, r13)
            if (r1 != r12) goto L_0x0064
            r1 = 1
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r1 == 0) goto L_0x006b
            r16 = r11
            goto L_0x00d2
        L_0x006b:
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r1 = r0.f21382s
            ky2.m r1 = r1.f21383n
            if (r1 == 0) goto L_0x007e
            long r5 = r1.field_time
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            if (r1 != r12) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            if (r1 == 0) goto L_0x0085
            r16 = r11
            goto L_0x00ea
        L_0x0085:
            r5 = r2
        L_0x0086:
            r16 = r11
            goto L_0x00eb
        L_0x008a:
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r7 = r0.f21382s
            ky2.m r13 = r7.f21383n
            if (r13 == 0) goto L_0x009d
            long r13 = r13.field_time
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x0098
            r13 = 1
            goto L_0x0099
        L_0x0098:
            r13 = 0
        L_0x0099:
            if (r13 != r12) goto L_0x009d
            r13 = 1
            goto L_0x009e
        L_0x009d:
            r13 = 0
        L_0x009e:
            if (r13 == 0) goto L_0x0086
            long r13 = r7.f31649c
            my2.a r7 = r7.f31650d
            r16 = r11
            long r10 = r7.field_time
            boolean r6 = r6.mo10735q(r13, r10)
            if (r6 == 0) goto L_0x00af
            goto L_0x00eb
        L_0x00af:
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r6 = r0.f21382s
            ky2.m r6 = r6.f21383n
            if (r6 == 0) goto L_0x00cf
            di3.d r1 = di3.C86312j.m106911c(r1)
            ky2.i r1 = (ky2.C10432i) r1
            int r7 = r6.field_businessType
            ky2.b r1 = r1.mo10761ts(r7)
            long r6 = r6.field_time
            long r10 = eb0.C31543z5.m39451a()
            boolean r1 = r1.mo10734d(r6, r10)
            if (r1 != r12) goto L_0x00cf
            r1 = 1
            goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            if (r1 == 0) goto L_0x00d4
        L_0x00d2:
            r5 = r3
            goto L_0x00eb
        L_0x00d4:
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r1 = r0.f21382s
            ky2.m r1 = r1.f21383n
            if (r1 == 0) goto L_0x00e7
            long r6 = r1.field_time
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e2
            r1 = 1
            goto L_0x00e3
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            if (r1 != r12) goto L_0x00e7
            r1 = 1
            goto L_0x00e8
        L_0x00e7:
            r1 = 0
        L_0x00e8:
            if (r1 == 0) goto L_0x00eb
        L_0x00ea:
            r5 = r4
        L_0x00eb:
            int r1 = r5.ordinal()
            r6 = 3
            r7 = 2
            if (r1 == r12) goto L_0x011c
            r8 = 2131101823(0x7f06087f, float:1.7816067E38)
            if (r1 == r7) goto L_0x010b
            if (r1 == r6) goto L_0x010b
            rx3.g r1 = r0.f21372f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r9 = 2131756473(0x7f1005b9, float:1.9143855E38)
            r1.mo104518r(r9, r8)
            goto L_0x012f
        L_0x010b:
            rx3.g r1 = r0.f21372f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r9 = 2131756011(0x7f1003eb, float:1.9142917E38)
            r1.mo104518r(r9, r8)
            goto L_0x012f
        L_0x011c:
            rx3.g r1 = r0.f21372f
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r8 = 2131756021(0x7f1003f5, float:1.9142938E38)
            r9 = 2131101269(0x7f060655, float:1.7814943E38)
            r1.mo104518r(r8, r9)
        L_0x012f:
            rx3.g r1 = r0.f21373g
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r8 = r5.ordinal()
            if (r8 == 0) goto L_0x0163
            if (r8 == r7) goto L_0x014b
            if (r8 == r6) goto L_0x014b
            r6 = 2131837713(0x7f114311, float:1.9308629E38)
            java.lang.String r6 = r0.getString(r6)
            goto L_0x0191
        L_0x014b:
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r6 = r0.f21382s
            boolean r6 = r6.mo10733a()
            if (r6 == 0) goto L_0x015b
            r6 = 2131837709(0x7f11430d, float:1.930862E38)
            java.lang.String r6 = r0.getString(r6)
            goto L_0x0191
        L_0x015b:
            r6 = 2131837710(0x7f11430e, float:1.9308623E38)
            java.lang.String r6 = r0.getString(r6)
            goto L_0x0191
        L_0x0163:
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r6 = r0.f21382s
            boolean r6 = r6.mo10733a()
            if (r6 == 0) goto L_0x018a
            r6 = 2131837711(0x7f11430f, float:1.9308625E38)
            java.lang.Object[] r7 = new java.lang.Object[r12]
            rx3.g r8 = r0.f21381r
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            ky2.a r8 = (ky2.C10428a) r8
            androidx.appcompat.app.AppCompatActivity r9 = r17.getContext()
            java.lang.String r8 = r8.mo10175d(r9)
            r9 = 0
            r7[r9] = r8
            java.lang.String r6 = r0.getString(r6, r7)
            goto L_0x0191
        L_0x018a:
            r6 = 2131837712(0x7f114310, float:1.9308627E38)
            java.lang.String r6 = r0.getString(r6)
        L_0x0191:
            r1.setText(r6)
            rx3.g r1 = r0.f21381r
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            ky2.a r1 = (ky2.C10428a) r1
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r6 = r0.f21382s
            r1.mo10176q(r0, r5, r6)
            r1 = 8
            if (r5 != r2) goto L_0x01cb
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r2 = r0.f21382s
            boolean r2 = r2.mo10733a()
            if (r2 == 0) goto L_0x01cb
            rx3.g r2 = r0.f21374h
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.Button r2 = (android.widget.Button) r2
            r6 = 0
            r2.setVisibility(r6)
            rx3.g r2 = r0.f21375i
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.Button r2 = (android.widget.Button) r2
            r2.setVisibility(r1)
            goto L_0x01e6
        L_0x01cb:
            rx3.g r2 = r0.f21374h
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.Button r2 = (android.widget.Button) r2
            r2.setVisibility(r1)
            rx3.g r2 = r0.f21375i
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.Button r2 = (android.widget.Button) r2
            r6 = 0
            r2.setVisibility(r6)
        L_0x01e6:
            if (r5 == r4) goto L_0x02b9
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r2 = r0.f21382s
            boolean r2 = r2.mo10733a()
            if (r2 != 0) goto L_0x02b9
            rx3.g r2 = r0.f21377n
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r2.setVisibility(r1)
            rx3.g r2 = r0.f21378o
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r14 = r16
            r4.mo10233c(r14)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r9 = "updateView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r8 = "updateView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r2
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            rx3.g r2 = r0.f21379p
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r14)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r9 = "updateView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r8 = "updateView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r2
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            rx3.g r2 = r0.f21376j
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r4 = 0
            r2.setBackground(r4)
            rx3.g r2 = r0.f21376j
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.content.res.Resources r4 = r17.getResources()
            r6 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r4 = r4.getColor(r6)
            r2.setBackgroundColor(r4)
            goto L_0x0375
        L_0x02b9:
            rx3.g r2 = r0.f21377n
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r4 = 0
            r2.setVisibility(r4)
            rx3.g r2 = r0.f21378o
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r9 = "updateView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r8 = "updateView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r2
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            rx3.g r2 = r0.f21379p
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r9 = "updateView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI"
            java.lang.String r8 = "updateView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r2
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            rx3.g r2 = r0.f21376j
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r4 = 2131235199(0x7f08117f, float:1.8086585E38)
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            r2.setBackground(r4)
        L_0x0375:
            if (r5 != r3) goto L_0x038e
            com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI$a r2 = r0.f21382s
            boolean r2 = r2.mo10733a()
            if (r2 == 0) goto L_0x038e
            rx3.g r1 = r0.f21380q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x039b
        L_0x038e:
            rx3.g r2 = r0.f21380q
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setVisibility(r1)
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.teenmode.p111ui.AuthorizationDetailUI.mo6571J7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8k;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getBooleanExtra("intent_extra_need_anim", false)) {
            overridePendingTransition(0, 0);
        }
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C5531j(this));
        C75592q0.m90789s();
        String stringExtra = getIntent().getStringExtra("intent_extra_guardian_username");
        String stringExtra2 = getIntent().getStringExtra("intent_extra_ward_username");
        this.f21382s.f31648b = getIntent().getStringExtra("intent_extra_cdn_img_path");
        Assert.assertNotNull(stringExtra);
        Assert.assertNotNull(stringExtra2);
        ((Button) ((C36570n) this.f21374h).getValue()).setOnClickListener(new C5532k(this, stringExtra2));
        ((Button) ((C36570n) this.f21375i).getValue()).setOnClickListener(new C5534l(this));
        this.f21382s.f31653g = (TextView) findViewById(C0966R.C0970id.a17);
        this.f21382s.f31654h = (TextView) findViewById(C0966R.C0970id.a0x);
        this.f21382s.f31655i = (LinearLayout) findViewById(C0966R.C0970id.f357473a11);
        this.f21382s.f31656j = (ImageView) findViewById(C0966R.C0970id.f357475a13);
        this.f21382s.f31657k = (ImageView) findViewById(C0966R.C0970id.f357474a12);
        this.f21382s.f31658l = (TextView) findViewById(C0966R.C0970id.f357476a14);
        this.f21382s.f31659m = (WeImageView) findViewById(C0966R.C0970id.a0z);
        C13867d dVar = (C13867d) mo6569H7().mo93555w(C13867d.class);
        this.f21382s.f31647a = mo6569H7();
        this.f21382s.f31649c = getIntent().getLongExtra("intent_extra_request_time", 0);
        C5522a aVar = this.f21382s;
        C11096c a = C11098e.f32878a.mo11232a();
        int g = dVar.mo13200g();
        String f = dVar.mo13199f();
        C87412m.m108591d(f);
        aVar.mo6573c(a.mo11231jo(g, f, mo6570I7()));
        C5522a aVar2 = this.f21382s;
        aVar2.f31650d = aVar2.mo6572b();
        C5522a aVar3 = this.f21382s;
        aVar3.f31651e = stringExtra;
        aVar3.f31652f = stringExtra2;
        mo6571J7();
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10739MV(this);
    }

    public void onDataChanged() {
        C13867d dVar = (C13867d) mo6569H7().mo93555w(C13867d.class);
        C5522a aVar = this.f21382s;
        C11096c a = C11098e.f32878a.mo11232a();
        int i = dVar.f39032d;
        String str = dVar.f39031c;
        C87412m.m108591d(str);
        aVar.f21383n = a.mo11231jo(i, str, mo6570I7());
        C5522a aVar2 = this.f21382s;
        aVar2.f31650d = aVar2.f21383n;
        C61926c.m72668M(new C5535m(this));
    }

    public void onDestroy() {
        ((C10428a) ((C36570n) this.f21381r).getValue()).getClass();
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(this);
        super.onDestroy();
    }
}
