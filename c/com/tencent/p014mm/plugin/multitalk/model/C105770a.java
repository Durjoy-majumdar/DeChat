package com.tencent.p014mm.plugin.multitalk.model;

import android.content.Context;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c92.C104327a;
import c92.C104328f;
import c92.C104331h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import m82.C109548c;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import v82.C111418b0;
import v82.C111424d;
import v82.C111433e;
import v82.C111445f;
import v82.C111468k;
import x82.C112087d;
import x82.C112113q;
import z82.C112612a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitalk.model.a */
public final class C105770a implements C105810k, View.OnClickListener {

    /* renamed from: d */
    public RecyclerView f314540d;

    /* renamed from: e */
    public FrameLayout f314541e;

    /* renamed from: f */
    public RelativeLayout f314542f;

    /* renamed from: g */
    public C105789c f314543g;

    /* renamed from: h */
    public C111433e f314544h;

    /* renamed from: i */
    public C111424d f314545i;

    /* renamed from: j */
    public ArrayMap<String, Integer> f314546j = new ArrayMap<>();

    /* renamed from: n */
    public C105814l f314547n;

    /* renamed from: o */
    public String f314548o = "";

    /* renamed from: p */
    public boolean f314549p;

    /* renamed from: q */
    public final boolean f314550q = C104331h.m139315h();

    /* renamed from: r */
    public C105857z0 f314551r;

    /* renamed from: s */
    public final C32226l<String, C13598b0> f314552s;

    /* renamed from: t */
    public final C32226l<String, C13598b0> f314553t;

    /* renamed from: u */
    public final C32226l<String, C13598b0> f314554u;

    /* renamed from: v */
    public final C32226l<String, C13598b0> f314555v;

    /* renamed from: w */
    public final C32226l<String, C13598b0> f314556w;

    /* renamed from: x */
    public final Map<Integer, C32226l<String, C13598b0>> f314557x;

    /* renamed from: y */
    public boolean f314558y;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$a */
    public final class C105771a implements C105814l {

        /* renamed from: com.tencent.mm.plugin.multitalk.model.a$a$a */
        public static final class C105772a extends C87413o implements C32226l<C111433e, C13598b0> {

            /* renamed from: d */
            public static final C105772a f314560d = new C105772a();

            public C105772a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C111433e eVar = (C111433e) obj;
                C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
                int i = C111433e.f333603W;
                eVar.mo163114z(true);
                eVar.mo163113y();
                return C13598b0.f38549a;
            }
        }

        public C105771a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo150712a(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = "wxUserName"
                gy3.C87412m.m108594g(r7, r0)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.mm.plugin.multitalk.model.b0 r0 = r0.mo150671n()
                if (r0 == 0) goto L_0x0013
                r0.mo150728j(r7)
            L_0x0013:
                com.tencent.mm.plugin.multitalk.model.a$a$a r0 = com.tencent.p014mm.plugin.multitalk.model.C105770a.C105771a.C105772a.f314560d
                com.tencent.mm.plugin.multitalk.model.a r1 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                v82.e r1 = r1.mo150704f(r7)
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0032
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r4 = r1.f333625z
                if (r4 == 0) goto L_0x0028
                boolean r4 = r4.mo150935j()
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r4 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r1 = r2
            L_0x002d:
                if (r1 == 0) goto L_0x0032
                r0.invoke(r1)
            L_0x0032:
                com.tencent.mm.plugin.multitalk.model.a r1 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                v82.e r1 = r1.f314544h
                r4 = 1
                if (r1 == 0) goto L_0x0061
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r5 = r1.f333625z
                if (r5 == 0) goto L_0x0042
                java.lang.String r5 = r5.getUsername()
                goto L_0x0043
            L_0x0042:
                r5 = r2
            L_0x0043:
                boolean r5 = gy3.C87412m.m108589b(r5, r7)
                if (r5 == 0) goto L_0x0057
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r5 = r1.f333625z
                if (r5 == 0) goto L_0x0052
                boolean r5 = r5.mo150935j()
                goto L_0x0053
            L_0x0052:
                r5 = 0
            L_0x0053:
                if (r5 == 0) goto L_0x0057
                r5 = 1
                goto L_0x0058
            L_0x0057:
                r5 = 0
            L_0x0058:
                if (r5 == 0) goto L_0x005b
                goto L_0x005c
            L_0x005b:
                r1 = r2
            L_0x005c:
                if (r1 == 0) goto L_0x0061
                r0.invoke(r1)
            L_0x0061:
                com.tencent.mm.plugin.multitalk.model.a r0 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                v82.e r0 = r0.f314544h
                if (r0 == 0) goto L_0x0092
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x0070
                java.lang.String r1 = r1.getUsername()
                goto L_0x0071
            L_0x0070:
                r1 = r2
            L_0x0071:
                boolean r7 = gy3.C87412m.m108589b(r1, r7)
                if (r7 == 0) goto L_0x0085
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r7 = r0.f333625z
                if (r7 == 0) goto L_0x0080
                boolean r7 = r7.mo150935j()
                goto L_0x0081
            L_0x0080:
                r7 = 0
            L_0x0081:
                if (r7 == 0) goto L_0x0085
                r7 = 1
                goto L_0x0086
            L_0x0085:
                r7 = 0
            L_0x0086:
                if (r7 == 0) goto L_0x0089
                r2 = r0
            L_0x0089:
                if (r2 == 0) goto L_0x0092
                com.tencent.mm.plugin.multitalk.model.a r7 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                r2.mo163109D(r3, r3)
                r7.f314549p = r4
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.C105771a.mo150712a(java.lang.String):void");
        }

        /* renamed from: b */
        public void mo150713b(String str) {
            C87412m.m108594g(str, "wxUserName");
            C105783b0 n = C105851w0.zx0().mo150671n();
            if (n != null) {
                n.mo150729k();
            }
            C111433e f = C105770a.this.mo150704f(str);
            C111433e eVar = null;
            boolean z = false;
            if (f != null) {
                MultitalkFrameView multitalkFrameView = f.f333625z;
                if (!(multitalkFrameView != null ? multitalkFrameView.mo150935j() : false)) {
                    f = null;
                }
                if (f != null) {
                    f.mo163109D(true, false);
                }
            }
            C111433e eVar2 = C105770a.this.f314544h;
            if (eVar2 != null) {
                MultitalkFrameView multitalkFrameView2 = eVar2.f333625z;
                if (C87412m.m108589b(multitalkFrameView2 != null ? multitalkFrameView2.getUsername() : null, str)) {
                    MultitalkFrameView multitalkFrameView3 = eVar2.f333625z;
                    if (multitalkFrameView3 != null ? multitalkFrameView3.mo150935j() : false) {
                        z = true;
                    }
                }
                if (z) {
                    eVar = eVar2;
                }
                if (eVar != null) {
                    eVar.mo163109D(true, true);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
            r0 = r0.f333625z;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo150714c(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "wxUserName"
                gy3.C87412m.m108594g(r3, r0)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.mm.plugin.multitalk.model.b0 r0 = r0.mo150671n()
                if (r0 == 0) goto L_0x0013
                r0.mo150728j(r3)
            L_0x0013:
                com.tencent.mm.plugin.multitalk.model.a r0 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                r1 = 3
                r0.mo150710l(r3, r1)
                com.tencent.mm.plugin.multitalk.model.a r0 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                v82.e r0 = r0.f314544h
                if (r0 == 0) goto L_0x0028
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x0028
                java.lang.String r0 = r0.getUsername()
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                boolean r0 = gy3.C87412m.m108589b(r0, r3)
                if (r0 == 0) goto L_0x0035
                com.tencent.mm.plugin.multitalk.model.a r0 = com.tencent.p014mm.plugin.multitalk.model.C105770a.this
                r1 = 4
                r0.mo150710l(r3, r1)
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.C105771a.mo150714c(java.lang.String):void");
        }

        /* renamed from: d */
        public void mo150715d(String str) {
            C87412m.m108594g(str, "wxUserName");
            C105783b0 n = C105851w0.zx0().mo150671n();
            if (n != null) {
                n.mo150729k();
            }
            C105770a.this.mo150710l(str, 0);
        }

        /* renamed from: e */
        public void mo150716e(String str) {
            C87412m.m108594g(str, "wxUserName");
            C105783b0 n = C105851w0.zx0().mo150671n();
            if (n != null) {
                n.mo150728j(str);
            }
            C105770a.this.mo150710l(str, 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$b */
    public static final class C105773b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105770a f314561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105773b(C105770a aVar) {
            super(1);
            this.f314561d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r0 = "wxUserName"
                gy3.C87412m.m108594g(r8, r0)
                com.tencent.mm.plugin.multitalk.model.a r0 = r7.f314561d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r0 = r0.f314546j
                java.lang.Object r0 = r0.get(r8)
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1 = 0
                if (r0 == 0) goto L_0x0150
                com.tencent.mm.plugin.multitalk.model.a r2 = r7.f314561d
                int r0 = r0.intValue()
                java.lang.String r3 = "AvatarViewManager"
                if (r0 == 0) goto L_0x011b
                r4 = 1
                if (r0 == r4) goto L_0x010d
                r5 = 2
                if (r0 == r5) goto L_0x00e6
                r5 = 3
                r6 = 8
                if (r0 == r5) goto L_0x00c6
                r5 = 4
                if (r0 == r5) goto L_0x0034
                java.lang.String r0 = "to avatar unreachable branch"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                goto L_0x0150
            L_0x0034:
                v82.e r0 = r2.mo150704f(r8)
                r3 = 0
                if (r0 == 0) goto L_0x005b
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r5 = r0.f333625z
                if (r5 == 0) goto L_0x0044
                boolean r5 = r5.mo150935j()
                goto L_0x0045
            L_0x0044:
                r5 = 0
            L_0x0045:
                if (r5 == 0) goto L_0x0048
                goto L_0x0049
            L_0x0048:
                r0 = r3
            L_0x0049:
                if (r0 == 0) goto L_0x005b
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r5 = r0.f333625z
                if (r5 == 0) goto L_0x0052
                r5.mo150921c()
            L_0x0052:
                r0.mo163111F(r6)
                r0.mo163114z(r4)
                r0.mo163113y()
            L_0x005b:
                v82.e r0 = r2.f314544h
                if (r0 == 0) goto L_0x00bb
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r0.f333625z
                if (r2 == 0) goto L_0x0068
                java.lang.String r2 = r2.getUsername()
                goto L_0x0069
            L_0x0068:
                r2 = r3
            L_0x0069:
                boolean r2 = gy3.C87412m.m108589b(r2, r8)
                if (r2 == 0) goto L_0x007d
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r0.f333625z
                if (r2 == 0) goto L_0x0078
                boolean r2 = r2.mo150935j()
                goto L_0x0079
            L_0x0078:
                r2 = 0
            L_0x0079:
                if (r2 == 0) goto L_0x007d
                r2 = 1
                goto L_0x007e
            L_0x007d:
                r2 = 0
            L_0x007e:
                if (r2 == 0) goto L_0x0081
                r3 = r0
            L_0x0081:
                if (r3 == 0) goto L_0x00bb
                r0 = 2131833237(0x7f113195, float:1.929955E38)
                android.widget.TextView r2 = new android.widget.TextView
                android.view.View r5 = r3.f44854d
                android.content.Context r5 = r5.getContext()
                r2.<init>(r5)
                android.view.View r5 = r3.f44854d
                android.content.res.Resources r5 = r5.getResources()
                r6 = 2131099940(0x7f060124, float:1.7812247E38)
                int r5 = r5.getColor(r6)
                r2.setTextColor(r5)
                r2.setText(r0)
                android.view.View r0 = r3.f44854d
                android.content.Context r0 = r0.getContext()
                r5 = 17
                int r0 = kg3.C76577a.m92151b(r0, r5)
                float r0 = (float) r0
                r2.setTextSize(r1, r0)
                r3.mo163113y()
                r0 = -2
                r3.mo163108C(r2, r0, r0, r4)
            L_0x00bb:
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                java.lang.String r2 = ""
                r0.mo150653b0(r2, r4)
                goto L_0x0150
            L_0x00c6:
                v82.e r0 = r2.mo150704f(r8)
                if (r0 == 0) goto L_0x0150
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r0.f333625z
                if (r3 == 0) goto L_0x00d3
                r3.mo150921c()
            L_0x00d3:
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                r3.mo150636M(r8)
                v82.e r2 = r2.mo150704f(r8)
                if (r2 == 0) goto L_0x00e2
                r2.f333624V = r1
            L_0x00e2:
                r0.mo163111F(r6)
                goto L_0x0150
            L_0x00e6:
                com.tencent.mm.plugin.multitalk.model.z0 r0 = r2.mo150706h()
                r0.mo150844h(r1, r8)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                r0.mo150636M(r8)
                v82.e r0 = r2.mo150704f(r8)
                if (r0 == 0) goto L_0x00fc
                r0.f333624V = r1
            L_0x00fc:
                com.tencent.p014mm.plugin.multitalk.model.C105770a.m142075d(r2)
                v82.e r0 = r2.mo150704f(r8)
                if (r0 == 0) goto L_0x0150
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x0150
                r0.mo150921c()
                goto L_0x0150
            L_0x010d:
                v82.e r0 = r2.mo150704f(r8)
                if (r0 == 0) goto L_0x0150
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x0150
                r0.mo150921c()
                goto L_0x0150
            L_0x011b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "trans "
                r0.append(r4)
                r0.append(r8)
                java.lang.String r4 = " state from avatar to avatar big"
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                v82.e r0 = r2.mo150704f(r8)
                if (r0 == 0) goto L_0x0141
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x0141
                r0.mo150921c()
            L_0x0141:
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                r0.mo150636M(r8)
                v82.e r0 = r2.mo150704f(r8)
                if (r0 == 0) goto L_0x0150
                r0.f333624V = r1
            L_0x0150:
                com.tencent.mm.plugin.multitalk.model.a r0 = r7.f314561d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r0 = r0.f314546j
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.put(r8, r1)
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.C105773b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$c */
    public static final class C105774c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105770a f314562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105774c(C105770a aVar) {
            super(1);
            this.f314562d = aVar;
        }

        public Object invoke(Object obj) {
            String str;
            MultitalkFrameView multitalkFrameView;
            MultitalkFrameView.C105887a currentSnapShot;
            MultitalkFrameView multitalkFrameView2;
            String str2 = (String) obj;
            C87412m.m108594g(str2, "wxUserName");
            Integer num = this.f314562d.f314546j.get(str2);
            Object obj2 = null;
            if (num != null) {
                C105770a aVar = this.f314562d;
                int intValue = num.intValue();
                if (intValue == 3) {
                    C111433e f = aVar.mo150704f(str2);
                    if (!(f == null || (multitalkFrameView2 = f.f333625z) == null)) {
                        multitalkFrameView2.mo150921c();
                    }
                    aVar.f314546j.put(str2, 4);
                    aVar.mo150706h().mo150844h(2, str2);
                    C105783b0 n = C105851w0.zx0().mo150671n();
                    if (n != null) {
                        C105782b bVar = new C105782b(aVar);
                        C109548c cVar = n.mo150723e().f325401j;
                        cVar.getClass();
                        cVar.f327916f.put(str2, bVar);
                    }
                    C104328f.f308805a.mo146025b(4, 2);
                    C104328f.f308826v.mo479b();
                    C105789c cVar2 = aVar.f314543g;
                    if (cVar2 != null) {
                        C105895a aVar2 = (C105895a) cVar2;
                        Boolean bool = Boolean.TRUE;
                        aVar2.mo150973w(bool);
                        aVar2.mo150964o();
                        CollapseView collapseView = aVar2.f315030I;
                        if (collapseView != null && aVar2.f315034M) {
                            collapseView.f314960f.setTag(bool);
                            collapseView.mo150907a(collapseView.f314963i);
                            collapseView.f314960f.animate().setDuration(collapseView.f314959e).rotation((float) 270);
                            collapseView.f314970s.setTag(bool);
                            ImageButton imageButton = collapseView.f314970s;
                            C111468k kVar = new C111468k(collapseView, imageButton, C111418b0.f333554o - C111418b0.f333550k);
                            kVar.setDuration(collapseView.f314959e);
                            imageButton.startAnimation(kVar);
                        }
                    }
                    C111433e f2 = aVar.mo150704f(str2);
                    if (f2 != null) {
                        f2.f333624V = true;
                        C112087d dVar = f2.f333622T;
                        if (dVar != null) {
                            dVar.mo163790b();
                        }
                    }
                    FrameLayout frameLayout = aVar.f314541e;
                    if (frameLayout != null) {
                        obj2 = frameLayout.getLayoutParams();
                    }
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) obj2;
                    C105789c cVar3 = aVar.f314543g;
                    layoutParams.topMargin = cVar3 != null ? C85875k4.m106198o(((C105895a) cVar3).f315047d) : 0;
                    FrameLayout frameLayout2 = aVar.f314541e;
                    if (frameLayout2 != null) {
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                    FrameLayout frameLayout3 = aVar.f314541e;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(0);
                    }
                    RecyclerView recyclerView = aVar.f314540d;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                    C111433e eVar = aVar.f314544h;
                    if (eVar != null) {
                        eVar.mo163113y();
                        aVar.f314549p = true;
                        MultitalkFrameView multitalkFrameView3 = eVar.f333625z;
                        if (multitalkFrameView3 != null) {
                            multitalkFrameView3.mo150925g(str2, C104331h.m139311c(str2));
                            multitalkFrameView3.mo150923e();
                            C111433e f3 = aVar.mo150704f(str2);
                            if (f3 != null) {
                                MultitalkFrameView multitalkFrameView4 = f3.f333625z;
                                if (!(multitalkFrameView4 == null || (currentSnapShot = multitalkFrameView4.getCurrentSnapShot()) == null)) {
                                    multitalkFrameView3.mo150933h(currentSnapShot);
                                }
                                if (f3.f333621S == 2) {
                                    C111433e eVar2 = aVar.f314544h;
                                    if (eVar2 != null) {
                                        eVar2.mo163114z(true);
                                    }
                                    C111433e eVar3 = aVar.f314544h;
                                    if (eVar3 != null) {
                                        eVar3.mo163109D(true, true);
                                    }
                                }
                            }
                        }
                        eVar.mo163109D(false, true);
                    }
                    RelativeLayout relativeLayout = aVar.f314542f;
                    if (relativeLayout != null) {
                        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                        layoutParams3.width = -1;
                        layoutParams3.height = -1;
                        layoutParams3.leftMargin = 0;
                        layoutParams3.rightMargin = 0;
                        relativeLayout.setLayoutParams(layoutParams3);
                        relativeLayout.setVisibility(0);
                        C105789c cVar4 = aVar.f314543g;
                        if (cVar4 != null) {
                            C104331h hVar = C104331h.f308841a;
                            Context context = relativeLayout.getContext();
                            C87412m.m108593f(context, "context");
                            C111433e eVar4 = aVar.f314544h;
                            if (eVar4 == null || (multitalkFrameView = eVar4.f333625z) == null || (str = multitalkFrameView.getNickName()) == null) {
                                str = "";
                            }
                            ((C105895a) cVar4).mo150968r(hVar.mo146035f(context, str), false);
                        }
                    }
                    if (!C87412m.m108589b(str2, C75592q0.m90772b())) {
                        C105851w0.zx0().mo150653b0(str2, false);
                    }
                    C105783b0 n2 = C105851w0.zx0().mo150671n();
                    if (n2 != null) {
                        n2.mo150726h(str2);
                    }
                    String str3 = C105851w0.zx0().f314506t.f320042d;
                } else if (intValue != 4) {
                    Log.m105920e("AvatarViewManager", "unable to trans from " + num.intValue() + " to ScreenCastBig");
                } else {
                    Log.m105924i("AvatarViewManager", "trans state from screen cast big to screen cast big");
                }
                obj2 = C13598b0.f38549a;
            }
            if (obj2 == null) {
                Log.m105920e("AvatarViewManager", "unable trans state to screen cast big");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$d */
    public static final class C105775d extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105770a f314563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105775d(C105770a aVar) {
            super(1);
            this.f314563d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:88:0x014f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r0 = "wxUserName"
                gy3.C87412m.m108594g(r9, r0)
                com.tencent.mm.plugin.multitalk.model.a r0 = r8.f314563d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r0 = r0.f314546j
                java.lang.Object r0 = r0.get(r9)
                com.tencent.mm.plugin.multitalk.model.a r1 = r8.f314563d
                java.lang.Integer r0 = (java.lang.Integer) r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r9)
                java.lang.String r3 = " dispatchToScreenCastSmallEvent is "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r5 = "AvatarViewManager"
                com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r2, r4)
                r2 = 3
                r4 = 1
                if (r0 != 0) goto L_0x0035
                goto L_0x0057
            L_0x0035:
                int r6 = r0.intValue()
                if (r6 != 0) goto L_0x0057
                java.lang.String r0 = r1.f314548o
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0045
                r1.f314548o = r9
            L_0x0045:
                v82.e r0 = r1.mo150704f(r9)
                if (r0 == 0) goto L_0x0132
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x0052
                r1.mo150923e()
            L_0x0052:
                r0.mo163111F(r3)
                goto L_0x0132
            L_0x0057:
                r6 = 4
                if (r0 != 0) goto L_0x005b
                goto L_0x007d
            L_0x005b:
                int r7 = r0.intValue()
                if (r7 != r6) goto L_0x007d
                v82.e r0 = r1.mo150704f(r9)
                if (r0 == 0) goto L_0x0071
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r5 = r0.f333625z
                if (r5 == 0) goto L_0x006e
                r5.mo150923e()
            L_0x006e:
                r0.mo163111F(r3)
            L_0x0071:
                com.tencent.mm.plugin.multitalk.model.z0 r0 = r1.mo150706h()
                r0.mo150844h(r3, r9)
                r1.mo150707i()
                goto L_0x0132
            L_0x007d:
                if (r0 != 0) goto L_0x0080
                goto L_0x00c3
            L_0x0080:
                int r6 = r0.intValue()
                if (r6 != r2) goto L_0x00c3
                android.widget.RelativeLayout r0 = r1.f314542f
                if (r0 == 0) goto L_0x0092
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0092
                r0 = 1
                goto L_0x0093
            L_0x0092:
                r0 = 0
            L_0x0093:
                if (r0 == 0) goto L_0x00ac
                v82.e r0 = r1.f314544h
                if (r0 == 0) goto L_0x00a2
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x00a2
                java.lang.String r0 = r0.getUsername()
                goto L_0x00a3
            L_0x00a2:
                r0 = 0
            L_0x00a3:
                boolean r0 = gy3.C87412m.m108589b(r0, r9)
                if (r0 == 0) goto L_0x00ac
                r1.mo150707i()
            L_0x00ac:
                v82.e r0 = r1.mo150704f(r9)
                if (r0 == 0) goto L_0x00bc
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x00b9
                r1.mo150923e()
            L_0x00b9:
                r0.mo163111F(r3)
            L_0x00bc:
                java.lang.String r0 = "trans state from screen cast small to screen cast small"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                goto L_0x0132
            L_0x00c3:
                if (r0 != 0) goto L_0x00c6
                goto L_0x00e7
            L_0x00c6:
                int r6 = r0.intValue()
                if (r6 != r4) goto L_0x00e7
                java.lang.String r0 = r1.f314548o
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00d6
                r1.f314548o = r9
            L_0x00d6:
                v82.e r0 = r1.mo150704f(r9)
                if (r0 == 0) goto L_0x0132
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x00e3
                r1.mo150923e()
            L_0x00e3:
                r0.mo163111F(r3)
                goto L_0x0132
            L_0x00e7:
                r6 = 2
                if (r0 != 0) goto L_0x00eb
                goto L_0x0116
            L_0x00eb:
                int r7 = r0.intValue()
                if (r7 != r6) goto L_0x0116
                com.tencent.mm.plugin.multitalk.model.z0 r0 = r1.mo150706h()
                r0.mo150844h(r3, r9)
                com.tencent.p014mm.plugin.multitalk.model.C105770a.m142075d(r1)
                java.lang.String r0 = r1.f314548o
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0105
                r1.f314548o = r9
            L_0x0105:
                v82.e r0 = r1.mo150704f(r9)
                if (r0 == 0) goto L_0x0132
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x0112
                r1.mo150923e()
            L_0x0112:
                r0.mo163111F(r3)
                goto L_0x0132
            L_0x0116:
                if (r0 != 0) goto L_0x0134
                java.lang.String r0 = r1.f314548o
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0122
                r1.f314548o = r9
            L_0x0122:
                v82.e r0 = r1.mo150704f(r9)
                if (r0 == 0) goto L_0x0132
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x012f
                r1.mo150923e()
            L_0x012f:
                r0.mo163111F(r3)
            L_0x0132:
                r3 = 1
                goto L_0x014d
            L_0x0134:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "error to trans state from "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r0 = " to SCREEN CAST SMALL"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            L_0x014d:
                if (r3 == 0) goto L_0x015a
                com.tencent.mm.plugin.multitalk.model.a r0 = r8.f314563d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r0 = r0.f314546j
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.put(r9, r1)
            L_0x015a:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.C105775d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$e */
    public static final class C105776e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105770a f314564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105776e(C105770a aVar) {
            super(1);
            this.f314564d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:136:0x0319  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x033d  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x0360  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0179  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "wxUserName"
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.plugin.multitalk.model.a r2 = r0.f314564d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r2 = r2.f314546j
                java.lang.Object r2 = r2.get(r1)
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.String r4 = "AvatarViewManager"
                if (r2 == 0) goto L_0x035c
                com.tencent.mm.plugin.multitalk.model.a r5 = r0.f314564d
                int r6 = r2.intValue()
                r7 = 1
                if (r6 == 0) goto L_0x034b
                r8 = 2
                if (r6 == r7) goto L_0x0052
                if (r6 == r8) goto L_0x0049
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "unable to trans from "
                r1.append(r3)
                int r2 = r2.intValue()
                r1.append(r2)
                java.lang.String r2 = " to VideoBig"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x035a
            L_0x0049:
                java.lang.String r1 = "trans state from video big to video big"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x035a
            L_0x0052:
                v82.e r2 = r5.mo150704f(r1)
                if (r2 == 0) goto L_0x005f
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r2.f333625z
                if (r2 == 0) goto L_0x005f
                r2.mo150921c()
            L_0x005f:
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r2 = r5.f314546j
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
                r2.put(r1, r6)
                c92.f r2 = c92.C104328f.f308805a
                c92.f$a r2 = c92.C104328f.f308827w
                r2.mo479b()
                androidx.recyclerview.widget.RecyclerView r2 = r5.f314540d
                r6 = 8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                if (r2 != 0) goto L_0x007a
                goto L_0x007d
            L_0x007a:
                r2.setVisibility(r6)
            L_0x007d:
                android.widget.FrameLayout r2 = r5.f314541e
                r9 = 0
                if (r2 != 0) goto L_0x0083
                goto L_0x0086
            L_0x0083:
                r2.setVisibility(r9)
            L_0x0086:
                com.tencent.mm.plugin.multitalk.model.c r2 = r5.f314543g
                if (r2 == 0) goto L_0x008f
                com.tencent.mm.plugin.multitalk.ui.widget.a r2 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a) r2
                int r2 = r2.f315024C
                goto L_0x0090
            L_0x008f:
                r2 = 0
            L_0x0090:
                android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
                r11 = -2
                r10.<init>(r11, r11)
                r10.width = r2
                r10.height = r2
                r10.leftMargin = r9
                r10.topMargin = r9
                android.widget.RelativeLayout r2 = r5.f314542f
                if (r2 != 0) goto L_0x00a3
                goto L_0x00a6
            L_0x00a3:
                r2.setLayoutParams(r10)
            L_0x00a6:
                int r2 = c92.C104331h.m139311c(r1)
                java.lang.String r10 = eb0.C75592q0.m90789s()
                boolean r10 = gy3.C87412m.m108589b(r1, r10)
                if (r10 != 0) goto L_0x00cd
                java.lang.Object[] r10 = new java.lang.Object[r7]
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                r10[r9] = r11
                java.lang.String r11 = "click member id: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r10)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r10 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                r10.mo150651a0(r1)
                c92.a r10 = c92.C104327a.f308804a
                r10.mo146023b(r7, r2)
            L_0x00cd:
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.pb.talkroom.sdk.MultiTalkGroup r2 = r2.f314506t
                r10 = 10
                if (r2 == 0) goto L_0x010f
                java.util.List<com.tencent.pb.talkroom.sdk.MultiTalkGroupMember> r2 = r2.f320047i
                if (r2 == 0) goto L_0x010f
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00e4:
                boolean r12 = r2.hasNext()
                if (r12 == 0) goto L_0x0108
                java.lang.Object r12 = r2.next()
                r13 = r12
                com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r13 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r13
                int r14 = r13.f320050f
                if (r14 == r10) goto L_0x00f7
                if (r14 != r7) goto L_0x0101
            L_0x00f7:
                java.lang.String r13 = r13.f320048d
                boolean r13 = gy3.C87412m.m108589b(r13, r1)
                if (r13 == 0) goto L_0x0101
                r13 = 1
                goto L_0x0102
            L_0x0101:
                r13 = 0
            L_0x0102:
                if (r13 == 0) goto L_0x00e4
                r11.add(r12)
                goto L_0x00e4
            L_0x0108:
                java.lang.Object r2 = sx3.C110818d0.m150914L(r11)
                com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r2 = (com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember) r2
                goto L_0x0110
            L_0x010f:
                r2 = 0
            L_0x0110:
                java.util.HashSet r11 = new java.util.HashSet
                r11.<init>()
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r12 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                java.util.HashSet<java.lang.String> r12 = r12.f314503q
                r11.addAll(r12)
                v82.e r12 = r5.f314544h
                if (r12 == 0) goto L_0x014b
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r13 = r12.f333625z
                if (r13 == 0) goto L_0x012d
                int r14 = c92.C104331h.m139311c(r1)
                r13.mo150925g(r1, r14)
            L_0x012d:
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r13 = r12.f333625z
                if (r13 == 0) goto L_0x0134
                r13.mo150924f()
            L_0x0134:
                v82.e r13 = r5.mo150704f(r1)
                if (r13 == 0) goto L_0x014b
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r13 = r13.f333625z
                if (r13 == 0) goto L_0x014b
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView$a r13 = r13.getCurrentSnapShot()
                if (r13 == 0) goto L_0x014b
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r12 = r12.f333625z
                if (r12 == 0) goto L_0x014b
                r12.mo150933h(r13)
            L_0x014b:
                com.tencent.mm.plugin.multitalk.model.c r12 = r5.f314543g
                if (r12 == 0) goto L_0x0154
                com.tencent.mm.plugin.multitalk.ui.widget.a r12 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a) r12
                r12.mo150955f(r7)
            L_0x0154:
                android.widget.RelativeLayout r12 = r5.f314542f
                if (r12 != 0) goto L_0x0159
                goto L_0x015c
            L_0x0159:
                r12.setVisibility(r9)
            L_0x015c:
                com.tencent.mm.plugin.multitalk.model.c r12 = r5.f314543g
                if (r12 == 0) goto L_0x0174
                com.tencent.mm.plugin.multitalk.ui.widget.a r12 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a) r12
                com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r13 = r12.f315047d
                boolean r13 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r13)
                if (r13 != 0) goto L_0x0172
                com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r12 = r12.f315047d
                boolean r12 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r12)
                if (r12 == 0) goto L_0x0174
            L_0x0172:
                r12 = 1
                goto L_0x0175
            L_0x0174:
                r12 = 0
            L_0x0175:
                v82.e r13 = r5.f314544h
                if (r13 == 0) goto L_0x0315
                java.lang.String r14 = "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable"
                if (r2 == 0) goto L_0x02a7
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r15 = r13.f333625z
                gy3.C87412m.m108591d(r15)
                java.lang.String r3 = r2.f320048d
                java.lang.String r7 = "member.usrName"
                gy3.C87412m.m108593f(r3, r7)
                java.lang.String r7 = r2.f320048d
                int r7 = c92.C104331h.m139311c(r7)
                r15.mo150925g(r3, r7)
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r13.f333625z
                gy3.C87412m.m108591d(r3)
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r7 = r13.f333625z
                gy3.C87412m.m108591d(r7)
                int r7 = r7.getIndex()
                r3.setPosition(r7)
                int r3 = r2.f320050f
                if (r3 == r10) goto L_0x0224
                android.view.View r3 = r13.f333604A
                gy3.C87412m.m108591d(r3)
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r6.mo10233c(r7)
                java.lang.Object[] r17 = r6.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/multitalk/model/AvatarViewManager"
                java.lang.String r19 = "setBigAvatarUserState"
                java.lang.String r20 = "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroupMember;ZLjava/util/HashSet;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r3
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r6 = r6.mo10231a(r9)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r17 = "com/tencent/mm/plugin/multitalk/model/AvatarViewManager"
                java.lang.String r18 = "setBigAvatarUserState"
                java.lang.String r19 = "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroupMember;ZLjava/util/HashSet;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                android.widget.ImageView r3 = r13.f333608E
                if (r3 == 0) goto L_0x01f4
                android.graphics.drawable.Drawable r3 = r3.getBackground()
                goto L_0x01f5
            L_0x01f4:
                r3 = 0
            L_0x01f5:
                if (r3 == 0) goto L_0x028a
                android.widget.ImageView r3 = r13.f333608E
                if (r3 != 0) goto L_0x01fc
                goto L_0x01ff
            L_0x01fc:
                r3.setVisibility(r9)
            L_0x01ff:
                android.widget.ImageView r3 = r13.f333608E
                if (r3 == 0) goto L_0x0208
                android.graphics.drawable.Drawable r3 = r3.getBackground()
                goto L_0x0209
            L_0x0208:
                r3 = 0
            L_0x0209:
                gy3.C87412m.m108592e(r3, r14)
                android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
                r3.stop()
                android.widget.ImageView r3 = r13.f333608E
                if (r3 == 0) goto L_0x021a
                android.graphics.drawable.Drawable r3 = r3.getBackground()
                goto L_0x021b
            L_0x021a:
                r3 = 0
            L_0x021b:
                gy3.C87412m.m108592e(r3, r14)
                android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
                r3.start()
                goto L_0x028a
            L_0x0224:
                android.view.View r3 = r13.f333604A
                gy3.C87412m.m108591d(r3)
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                r7.mo10233c(r8)
                java.lang.Object[] r17 = r7.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/multitalk/model/AvatarViewManager"
                java.lang.String r19 = "setBigAvatarUserState"
                java.lang.String r20 = "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroupMember;ZLjava/util/HashSet;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r3
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r7 = r7.mo10231a(r9)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r3.setVisibility(r7)
                java.lang.String r17 = "com/tencent/mm/plugin/multitalk/model/AvatarViewManager"
                java.lang.String r18 = "setBigAvatarUserState"
                java.lang.String r19 = "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroupMember;ZLjava/util/HashSet;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                android.widget.ImageView r3 = r13.f333608E
                if (r3 == 0) goto L_0x026d
                android.graphics.drawable.Drawable r3 = r3.getBackground()
                goto L_0x026e
            L_0x026d:
                r3 = 0
            L_0x026e:
                if (r3 == 0) goto L_0x0282
                android.widget.ImageView r3 = r13.f333608E
                if (r3 == 0) goto L_0x0279
                android.graphics.drawable.Drawable r3 = r3.getBackground()
                goto L_0x027a
            L_0x0279:
                r3 = 0
            L_0x027a:
                gy3.C87412m.m108592e(r3, r14)
                android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
                r3.stop()
            L_0x0282:
                android.widget.ImageView r3 = r13.f333608E
                if (r3 != 0) goto L_0x0287
                goto L_0x028a
            L_0x0287:
                r3.setVisibility(r6)
            L_0x028a:
                java.lang.String r2 = r2.f320048d
                boolean r2 = r11.contains(r2)
                if (r2 == 0) goto L_0x029e
                if (r12 != 0) goto L_0x029e
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r13.f333625z
                gy3.C87412m.m108591d(r2)
                r2.mo150924f()
                goto L_0x0315
            L_0x029e:
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r13.f333625z
                gy3.C87412m.m108591d(r2)
                r2.mo150921c()
                goto L_0x0315
            L_0x02a7:
                android.view.View r2 = r13.f333604A
                gy3.C87412m.m108591d(r2)
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                r3.mo10233c(r8)
                java.lang.Object[] r17 = r3.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/multitalk/model/AvatarViewManager"
                java.lang.String r19 = "setBigAvatarUserState"
                java.lang.String r20 = "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroupMember;ZLjava/util/HashSet;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r2
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r3 = r3.mo10231a(r9)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r17 = "com/tencent/mm/plugin/multitalk/model/AvatarViewManager"
                java.lang.String r18 = "setBigAvatarUserState"
                java.lang.String r19 = "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroupMember;ZLjava/util/HashSet;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                android.widget.ImageView r2 = r13.f333608E
                if (r2 == 0) goto L_0x02f0
                android.graphics.drawable.Drawable r2 = r2.getBackground()
                goto L_0x02f1
            L_0x02f0:
                r2 = 0
            L_0x02f1:
                if (r2 == 0) goto L_0x0305
                android.widget.ImageView r2 = r13.f333608E
                if (r2 == 0) goto L_0x02fc
                android.graphics.drawable.Drawable r3 = r2.getBackground()
                goto L_0x02fd
            L_0x02fc:
                r3 = 0
            L_0x02fd:
                gy3.C87412m.m108592e(r3, r14)
                android.graphics.drawable.AnimationDrawable r3 = (android.graphics.drawable.AnimationDrawable) r3
                r3.stop()
            L_0x0305:
                android.widget.ImageView r2 = r13.f333608E
                if (r2 != 0) goto L_0x030a
                goto L_0x030d
            L_0x030a:
                r2.setVisibility(r6)
            L_0x030d:
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r2 = r13.f333625z
                gy3.C87412m.m108591d(r2)
                r2.mo150922d()
            L_0x0315:
                com.tencent.mm.plugin.multitalk.model.c r2 = r5.f314543g
                if (r2 == 0) goto L_0x032e
                v82.e r3 = r5.f314544h
                if (r3 == 0) goto L_0x0327
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r3 = r3.f333625z
                if (r3 == 0) goto L_0x0327
                java.lang.String r3 = r3.getNickName()
                if (r3 != 0) goto L_0x0329
            L_0x0327:
                java.lang.String r3 = ""
            L_0x0329:
                com.tencent.mm.plugin.multitalk.ui.widget.a r2 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a) r2
                r2.mo150968r(r3, r9)
            L_0x032e:
                r2 = 9
                com.tencent.p014mm.plugin.multitalk.model.C105853x.m142230a(r2)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.mm.plugin.multitalk.model.b0 r2 = r2.mo150671n()
                if (r2 == 0) goto L_0x0340
                r2.mo150726h(r1)
            L_0x0340:
                com.tencent.mm.plugin.multitalk.model.z0 r2 = r5.mo150706h()
                r3 = 1
                r2.mo150844h(r3, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x035a
            L_0x034b:
                r3 = 1
                v82.e r1 = r5.mo150704f(r1)
                if (r1 == 0) goto L_0x035c
                int r2 = v82.C111433e.f333603W
                r2 = 0
                r1.mo163112G(r2, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x035a:
                r3 = r1
                goto L_0x035e
            L_0x035c:
                r2 = 0
                r3 = r2
            L_0x035e:
                if (r3 != 0) goto L_0x0365
                java.lang.String r1 = "unable trans state to video big"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            L_0x0365:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.C105776e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$f */
    public static final class C105777f extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105770a f314565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105777f(C105770a aVar) {
            super(1);
            this.f314565d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x00c4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r0 = "wxUserName"
                gy3.C87412m.m108594g(r7, r0)
                com.tencent.mm.plugin.multitalk.model.a r0 = r6.f314565d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r0 = r0.f314546j
                java.lang.Object r0 = r0.get(r7)
                com.tencent.mm.plugin.multitalk.model.a r1 = r6.f314565d
                java.lang.Integer r0 = (java.lang.Integer) r0
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L_0x0019
                goto L_0x002e
            L_0x0019:
                int r4 = r0.intValue()
                if (r4 != 0) goto L_0x002e
                v82.e r0 = r1.mo150704f(r7)
                if (r0 == 0) goto L_0x00a7
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x00a7
                r0.mo150924f()
                goto L_0x00a7
            L_0x002e:
                r4 = 2
                if (r0 != 0) goto L_0x0032
                goto L_0x005d
            L_0x0032:
                int r5 = r0.intValue()
                if (r5 != r4) goto L_0x005d
                com.tencent.mm.plugin.multitalk.model.z0 r0 = r1.mo150706h()
                r0.mo150844h(r2, r7)
                v82.e r0 = r1.mo150704f(r7)
                if (r0 == 0) goto L_0x004c
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x004c
                r0.mo150924f()
            L_0x004c:
                com.tencent.p014mm.plugin.multitalk.model.C105770a.m142075d(r1)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.mm.plugin.multitalk.model.b0 r0 = r0.mo150671n()
                if (r0 == 0) goto L_0x00a7
                r0.mo150726h(r7)
                goto L_0x00a7
            L_0x005d:
                r4 = 3
                if (r0 != 0) goto L_0x0061
                goto L_0x007a
            L_0x0061:
                int r5 = r0.intValue()
                if (r5 != r4) goto L_0x007a
                v82.e r0 = r1.mo150704f(r7)
                if (r0 == 0) goto L_0x00a7
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r1 = r0.f333625z
                if (r1 == 0) goto L_0x0074
                r1.mo150924f()
            L_0x0074:
                r1 = 8
                r0.mo163111F(r1)
                goto L_0x00a7
            L_0x007a:
                java.lang.String r4 = "AvatarViewManager"
                if (r0 != 0) goto L_0x007f
                goto L_0x0098
            L_0x007f:
                int r5 = r0.intValue()
                if (r5 != r3) goto L_0x0098
                v82.e r0 = r1.mo150704f(r7)
                if (r0 == 0) goto L_0x0092
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x0092
                r0.mo150924f()
            L_0x0092:
                java.lang.String r0 = "from small to small"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x00a7
            L_0x0098:
                if (r0 != 0) goto L_0x00a9
                v82.e r0 = r1.mo150704f(r7)
                if (r0 == 0) goto L_0x00a7
                com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
                if (r0 == 0) goto L_0x00a7
                r0.mo150924f()
            L_0x00a7:
                r2 = 1
                goto L_0x00c2
            L_0x00a9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "error to trans state from "
                r0.append(r5)
                r0.append(r1)
                java.lang.String r1 = " to VIDEO SMALL"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            L_0x00c2:
                if (r2 == 0) goto L_0x00cf
                com.tencent.mm.plugin.multitalk.model.a r0 = r6.f314565d
                android.util.ArrayMap<java.lang.String, java.lang.Integer> r0 = r0.f314546j
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0.put(r7, r1)
            L_0x00cf:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.C105777f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$g */
    public static final class C105778g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f314566d;

        /* renamed from: e */
        public final /* synthetic */ C111433e f314567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105778g(int i, C111433e eVar) {
            super(0);
            this.f314566d = i;
            this.f314567e = eVar;
        }

        public Object invoke() {
            int i = this.f314566d;
            boolean z = i == 1 || i == 3;
            C111433e eVar = this.f314567e;
            if (z != eVar.f333617N) {
                eVar.f333617N = z;
                boolean z2 = !z;
                if (eVar.f333621S == -1) {
                    Object systemService = eVar.f44854d.getContext().getSystemService("layout_inflater");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(C0966R.C0971layout.bhn, eVar.f333616M, false);
                    C87412m.m108593f(inflate, "getLayoutInflater().infl…fo, avatarOverlay, false)");
                    if (!z2) {
                        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.h4o);
                        if (imageView != null) {
                            imageView.setBackgroundResource(C0966R.C0969drawable.ba8);
                        }
                        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.h4p);
                        if (textView != null) {
                            textView.setText(C0966R.string.h0l);
                        }
                        inflate.setRotation(90.0f);
                    }
                    eVar.f333621S = 4;
                    eVar.mo163108C(inflate, eVar.f44854d.getResources().getDimensionPixelSize(C0966R.dimen.f3718c_), eVar.f44854d.getResources().getDimensionPixelSize(C0966R.dimen.f3718c_), false);
                    ((C119157j) C119157j.f356862d).mo183878i(new C111445f(eVar), (long) 3000);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.a$h */
    public static final class C105779h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105770a f314568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105779h(C105770a aVar) {
            super(0);
            this.f314568d = aVar;
        }

        public Object invoke() {
            C111433e eVar;
            MultitalkFrameView multitalkFrameView;
            C111433e eVar2 = this.f314568d.f314544h;
            boolean z = true;
            if (eVar2 == null || (multitalkFrameView = eVar2.f333625z) == null || !multitalkFrameView.mo150935j()) {
                z = false;
            }
            if (z && (eVar = this.f314568d.f314544h) != null) {
                eVar.mo163114z(false);
            }
            this.f314568d.f314549p = false;
            return C13598b0.f38549a;
        }
    }

    public C105770a() {
        C105857z0 q = C105851w0.zx0().mo150676q();
        C87412m.m108593f(q, "getMultiTalkManager().videoDataMuxer");
        this.f314551r = q;
        C105773b bVar = new C105773b(this);
        this.f314552s = bVar;
        C105777f fVar = new C105777f(this);
        this.f314553t = fVar;
        C105776e eVar = new C105776e(this);
        this.f314554u = eVar;
        C105775d dVar = new C105775d(this);
        this.f314555v = dVar;
        C105774c cVar = new C105774c(this);
        this.f314556w = cVar;
        this.f314557x = C90364q0.m113147f(new C13604l(0, bVar), new C13604l(1, fVar), new C13604l(2, eVar), new C13604l(3, dVar), new C13604l(4, cVar));
        this.f314558y = true;
    }

    /* renamed from: d */
    public static final void m142075d(C105770a aVar) {
        MultitalkFrameView multitalkFrameView;
        aVar.getClass();
        C104328f fVar = C104328f.f308805a;
        C104328f.f308827w.mo478a();
        FrameLayout frameLayout = aVar.f314541e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = aVar.f314540d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        C105789c cVar = aVar.f314543g;
        String str = null;
        if (cVar != null) {
            C105895a aVar2 = (C105895a) cVar;
            aVar2.mo150968r("", true);
            aVar2.mo150962m();
        }
        C111433e eVar = aVar.f314544h;
        if (eVar != null && (multitalkFrameView = eVar.f333625z) != null) {
            String username = multitalkFrameView.getUsername();
            if (username != null) {
                if (true ^ C87412m.m108589b(username, C75592q0.m90789s())) {
                    str = username;
                }
                if (str != null) {
                    Log.m105918d("AvatarViewManager", "steve: unsubscribe big video!");
                    C105851w0.zx0().mo150651a0("");
                    C104327a.f308804a.mo146023b(false, -1);
                }
            }
            multitalkFrameView.mo150922d();
        }
    }

    /* renamed from: a */
    public C105808j mo150700a(int i) {
        C111433e eVar = this.f314544h;
        if (eVar == null) {
            return null;
        }
        boolean z = false;
        if (1 <= i && i < 6) {
            z = true;
        }
        if (z) {
            C61926c.m72668M(new C105778g(i, eVar));
        }
        return eVar.f333625z;
    }

    /* renamed from: b */
    public C105808j mo150701b(String str) {
        C87412m.m108594g(str, "wxUserName");
        C111433e f = mo150704f(str);
        if (f == null) {
            return null;
        }
        if (!(f.mo17363j() >= 0)) {
            f = null;
        }
        if (f != null) {
            return f.f333625z;
        }
        return null;
    }

    /* renamed from: c */
    public void mo150702c() {
        if (!this.f314549p) {
            C111433e eVar = this.f314544h;
            boolean z = true;
            if (eVar == null || eVar.f333621S != 1) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        C61926c.m72668M(new C105779h(this));
    }

    /* renamed from: e */
    public final void mo150703e() {
        C111433e eVar;
        MultitalkFrameView multitalkFrameView;
        String username;
        FrameLayout frameLayout = this.f314541e;
        boolean z = false;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            z = true;
        }
        if (z && (eVar = this.f314544h) != null && (multitalkFrameView = eVar.f333625z) != null && (username = multitalkFrameView.getUsername()) != null) {
            int a = C105851w0.zx0().mo150672o().mo150748a(username);
            if (a == 100 || a == 104) {
                mo150707i();
            } else {
                mo150710l(username, 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r4 = r4.f320414a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v82.C111433e mo150704f(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "wxUserName"
            gy3.C87412m.m108594g(r6, r0)
            v82.d r0 = r5.f314545i
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.util.concurrent.CopyOnWriteArrayList<d82.a> r2 = r0.f333577e
            java.util.Iterator r2 = r2.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            r4 = r3
            d82.a r4 = (d82.C107025a) r4
            if (r4 == 0) goto L_0x0027
            com.tencent.pb.talkroom.sdk.MultiTalkGroupMember r4 = r4.f320414a
            if (r4 == 0) goto L_0x0027
            java.lang.String r4 = r4.f320048d
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x0011
            goto L_0x0030
        L_0x002f:
            r3 = r1
        L_0x0030:
            d82.a r3 = (d82.C107025a) r3
            if (r3 == 0) goto L_0x0037
            int r6 = r3.f320416c
            goto L_0x0038
        L_0x0037:
            r6 = -1
        L_0x0038:
            int r0 = r0.f333583n
            int r6 = r6 + r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.f314540d
            if (r0 == 0) goto L_0x0044
            android.view.View r6 = r0.getChildAt(r6)
            goto L_0x0045
        L_0x0044:
            r6 = r1
        L_0x0045:
            if (r6 == 0) goto L_0x0058
            androidx.recyclerview.widget.RecyclerView r0 = r5.f314540d
            if (r0 == 0) goto L_0x0050
            androidx.recyclerview.widget.RecyclerView$z r6 = r0.mo17031P0(r6)
            goto L_0x0051
        L_0x0050:
            r6 = r1
        L_0x0051:
            boolean r0 = r6 instanceof v82.C111433e
            if (r0 == 0) goto L_0x0058
            v82.e r6 = (v82.C111433e) r6
            r1 = r6
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.mo150704f(java.lang.String):v82.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = (r0 = r0.f333625z).getUsername();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo150705g() {
        /*
            r1 = this;
            v82.e r0 = r1.f314544h
            if (r0 == 0) goto L_0x000e
            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView r0 = r0.f333625z
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getUsername()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.mo150705g():java.lang.String");
    }

    /* renamed from: h */
    public final C105857z0 mo150706h() {
        C105857z0 q = C105851w0.zx0().mo150676q();
        C87412m.m108593f(q, "getMultiTalkManager().videoDataMuxer");
        this.f314551r = q;
        ArrayList<C105810k> arrayList = q.f314837a;
        boolean z = true;
        if (arrayList == null || !arrayList.contains(this)) {
            z = false;
        }
        if (!z) {
            this.f314551r.mo150842f(this);
        }
        return this.f314551r;
    }

    /* renamed from: i */
    public final void mo150707i() {
        C104328f fVar = C104328f.f308805a;
        C104328f.f308826v.mo478a();
        RecyclerView recyclerView = this.f314540d;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        C105789c cVar = this.f314543g;
        if (cVar != null) {
            C105895a aVar = (C105895a) cVar;
            aVar.mo150973w(Boolean.FALSE);
            aVar.mo150970t(C105851w0.zx0().f314506t, false);
        }
        C105789c cVar2 = this.f314543g;
        if (cVar2 != null) {
            ((C105895a) cVar2).mo150968r("", true);
        }
        C111433e eVar = this.f314544h;
        if (eVar != null) {
            MultitalkFrameView multitalkFrameView = eVar.f333625z;
            if (multitalkFrameView != null) {
                multitalkFrameView.mo150922d();
            }
            eVar.mo163114z(true);
            eVar.mo163113y();
        }
        FrameLayout frameLayout = this.f314541e;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            C105789c cVar3 = this.f314543g;
            if (cVar3 != null) {
                C105895a aVar2 = (C105895a) cVar3;
                layoutParams2.topMargin = aVar2.f315025D - aVar2.f315024C;
            }
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setVisibility(8);
        }
        C105789c cVar4 = this.f314543g;
        if (cVar4 != null) {
            ((C105895a) cVar4).mo150956g();
        }
        C105789c cVar5 = this.f314543g;
        if (cVar5 != null) {
            ((C105895a) cVar5).mo150969s();
        }
        this.f314558y = true;
        C105851w0.zx0().mo150653b0("", true);
    }

    /* renamed from: j */
    public final boolean mo150708j() {
        MultitalkFrameView multitalkFrameView;
        FrameLayout frameLayout = this.f314541e;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            C111433e eVar = this.f314544h;
            if ((eVar == null || (multitalkFrameView = eVar.f333625z) == null) ? false : multitalkFrameView.mo150935j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo150709k(RecyclerView recyclerView, FrameLayout frameLayout, MultiTalkMainUI multiTalkMainUI, C105789c cVar) {
        C87412m.m108594g(recyclerView, "talkingAvatarContainer");
        C87412m.m108594g(frameLayout, "talkingBigAvatarLayout");
        C87412m.m108594g(multiTalkMainUI, "mainUI");
        C87412m.m108594g(cVar, "uiCallback");
        if (!this.f314550q) {
            this.f314543g = cVar;
            this.f314540d = recyclerView;
            this.f314541e = frameLayout;
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.ui.widget.AvatarLayoutAdapter");
            this.f314545i = (C111424d) adapter;
            View inflate = LayoutInflater.from(multiTalkMainUI).inflate(C0966R.C0971layout.b_w, frameLayout, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            C111433e eVar = new C111433e(relativeLayout);
            MultitalkFrameView multitalkFrameView = (MultitalkFrameView) relativeLayout.findViewById(C0966R.C0970id.kft);
            eVar.f333625z = multitalkFrameView;
            if (multitalkFrameView != null) {
                multitalkFrameView.setIndex(0);
            }
            MultitalkFrameView multitalkFrameView2 = eVar.f333625z;
            if (multitalkFrameView2 != null) {
                multitalkFrameView2.setOnClickListener(this);
            }
            eVar.f333604A = relativeLayout.findViewById(C0966R.C0970id.goy);
            View findViewById = relativeLayout.findViewById(C0966R.C0970id.laa);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            eVar.f333605B = (ImageView) findViewById;
            View findViewById2 = relativeLayout.findViewById(C0966R.C0970id.h5c);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            eVar.f333606C = (ImageView) findViewById2;
            View findViewById3 = relativeLayout.findViewById(C0966R.C0970id.kay);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById3;
            View findViewById4 = relativeLayout.findViewById(C0966R.C0970id.g3d);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            eVar.f333608E = (ImageView) findViewById4;
            relativeLayout.setTag(eVar);
            this.f314542f = relativeLayout;
            Object tag = relativeLayout.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.ui.widget.AvatarLayoutHolder");
            this.f314544h = (C111433e) tag;
            frameLayout.addView(this.f314542f);
            RelativeLayout relativeLayout2 = this.f314542f;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            frameLayout.setVisibility(8);
            this.f314547n = new C105771a();
            C105851w0.zx0().mo150672o().f314611a = this.f314547n;
            mo150706h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo150710l(java.lang.String r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "wxUserName"
            gy3.C87412m.m108594g(r8, r0)     // Catch:{ all -> 0x005e }
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ all -> 0x005e }
            com.tencent.mm.plugin.multitalk.model.g0 r0 = r0.mo150672o()     // Catch:{ all -> 0x005e }
            int r0 = r0.mo150748a(r8)     // Catch:{ all -> 0x005e }
            r1 = 102(0x66, float:1.43E-43)
            r2 = 1
            if (r9 != r2) goto L_0x0021
            r3 = 101(0x65, float:1.42E-43)
            if (r0 == r3) goto L_0x001f
            if (r0 == r1) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r3 = 3
            goto L_0x0022
        L_0x0021:
            r3 = r9
        L_0x0022:
            java.lang.String r4 = "AvatarViewManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r5.<init>()     // Catch:{ all -> 0x005e }
            r5.append(r8)     // Catch:{ all -> 0x005e }
            java.lang.String r6 = " to state "
            r5.append(r6)     // Catch:{ all -> 0x005e }
            r5.append(r3)     // Catch:{ all -> 0x005e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005e }
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x005e }
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r4, r5, r6)     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.Integer, fy3.l<java.lang.String, rx3.b0>> r4 = r7.f314557x     // Catch:{ all -> 0x005e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x005e }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x005e }
            fy3.l r3 = (fy3.C32226l) r3     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x004f
            r3.invoke(r8)     // Catch:{ all -> 0x005e }
        L_0x004f:
            if (r9 != r2) goto L_0x005c
            if (r0 != r1) goto L_0x005c
            com.tencent.mm.plugin.multitalk.model.l r9 = r7.f314547n     // Catch:{ all -> 0x005e }
            if (r9 == 0) goto L_0x005c
            com.tencent.mm.plugin.multitalk.model.a$a r9 = (com.tencent.p014mm.plugin.multitalk.model.C105770a.C105771a) r9     // Catch:{ all -> 0x005e }
            r9.mo150713b(r8)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r7)
            return
        L_0x005e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105770a.mo150710l(java.lang.String, int):void");
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = false;
        if (mo150708j()) {
            if (this.f314558y) {
                C105789c cVar = this.f314543g;
                if (cVar != null) {
                    C105895a aVar = (C105895a) cVar;
                    if (aVar.f315035N) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation2.setDuration(150);
                        alphaAnimation.setDuration(150);
                        aVar.f315035N = false;
                        aVar.f315054n.setAnimation(alphaAnimation2);
                        View view3 = aVar.f315054n;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(4);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        aVar.f315048e.setAnimation(alphaAnimation2);
                        View view5 = aVar.f315048e;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(4);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        aVar.f315030I.setAnimation(alphaAnimation);
                        aVar.f315030I.setVisibility(4);
                        View view7 = aVar.f315062v;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(4);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view9 = aVar.f315063w;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(8);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "hideScreenCastPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f314558y = false;
            } else {
                C105789c cVar2 = this.f314543g;
                if (cVar2 != null) {
                    ((C105895a) cVar2).mo150969s();
                }
                this.f314558y = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView");
        MultitalkFrameView multitalkFrameView = (MultitalkFrameView) view2;
        if (multitalkFrameView.getUsername() == null) {
            Log.m105920e("AvatarViewManager", "videoview get null username");
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        FrameLayout frameLayout = this.f314541e;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            z = true;
        }
        if (!z) {
            if (multitalkFrameView.mo150935j()) {
                mo150710l(multitalkFrameView.getUsername(), 4);
                C105853x.f314829g++;
                C105789c cVar3 = this.f314543g;
                if (cVar3 != null) {
                    C105895a aVar6 = (C105895a) cVar3;
                    C112612a aVar7 = new C112612a(aVar6.f315047d);
                    aVar6.f315040T = aVar7;
                    RelativeLayout relativeLayout = aVar6.f315039S;
                    C87412m.m108594g(relativeLayout, "rootView");
                    relativeLayout.removeAllViews();
                    C112113q qVar = aVar7.f337244f;
                    if (qVar != null) {
                        qVar.mo163845e(relativeLayout);
                    }
                }
            } else {
                mo150710l(multitalkFrameView.getUsername(), 2);
                C105789c cVar4 = this.f314543g;
                if (cVar4 != null) {
                    ((C105895a) cVar4).mo150956g();
                }
            }
        } else if (multitalkFrameView.mo150935j()) {
            mo150710l(multitalkFrameView.getUsername(), 3);
            C105789c cVar5 = this.f314543g;
            if (cVar5 != null) {
                ((C105895a) cVar5).mo150956g();
            }
        } else {
            mo150710l(multitalkFrameView.getUsername(), 1);
            C105789c cVar6 = this.f314543g;
            if (cVar6 != null) {
                ((C105895a) cVar6).mo150956g();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/model/AvatarViewManager", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
