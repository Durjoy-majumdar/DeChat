package vg2;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: vg2.a */
public final class C52907a extends MMBaseAccessibilityConfig {

    /* renamed from: vg2.a$a */
    public static final class C52908a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C52908a f147742d = new C52908a();

        public C52908a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null && childAt.getContentDescription() != null && childAt.getVisibility() == 0) {
                        return childAt.getContentDescription().toString();
                    }
                }
            }
            return "";
        }
    }

    /* renamed from: vg2.a$b */
    public static final class C52909b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C52907a f147743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52909b(C52907a aVar) {
            super(1);
            this.f147743d = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                android.view.View r5 = (android.view.View) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                r0 = 2131302581(0x7f0918b5, float:1.8223252E38)
                java.lang.Object r0 = r5.getTag(r0)
                boolean r1 = r0 instanceof java.lang.Integer
                r2 = 0
                if (r1 == 0) goto L_0x0016
                java.lang.Integer r0 = (java.lang.Integer) r0
                goto L_0x0017
            L_0x0016:
                r0 = r2
            L_0x0017:
                r1 = 0
                if (r0 == 0) goto L_0x001f
                int r0 = r0.intValue()
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                r3 = 2131302526(0x7f09187e, float:1.822314E38)
                java.lang.Object r5 = r5.getTag(r3)
                boolean r3 = r5 instanceof java.lang.Boolean
                if (r3 == 0) goto L_0x002e
                r2 = r5
                java.lang.Boolean r2 = (java.lang.Boolean) r2
            L_0x002e:
                if (r2 == 0) goto L_0x0035
                boolean r5 = r2.booleanValue()
                goto L_0x0036
            L_0x0035:
                r5 = 0
            L_0x0036:
                if (r5 == 0) goto L_0x0055
                vg2.a r5 = r4.f147743d
                android.app.Activity r5 = r5.getContext()
                r2 = 2131829739(0x7f1123eb, float:1.9292456E38)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r1] = r0
                java.lang.String r5 = r5.getString(r2, r3)
                java.lang.String r0 = "{\n                      …me)\n                    }"
                gy3.C87412m.m108593f(r5, r0)
                goto L_0x0068
            L_0x0055:
                vg2.a r5 = r4.f147743d
                android.app.Activity r5 = r5.getContext()
                r0 = 2131829937(0x7f1124b1, float:1.9292857E38)
                java.lang.String r5 = r5.getString(r0)
                java.lang.String r0 = "{\n                      …rd)\n                    }"
                gy3.C87412m.m108593f(r5, r0)
            L_0x0068:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: vg2.C52907a.C52909b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vg2.a$c */
    public static final class C52910c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C52907a f147744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52910c(C52907a aVar) {
            super(1);
            this.f147744d = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                android.view.View r6 = (android.view.View) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                r0 = 2131314488(0x7f094738, float:1.8247402E38)
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1 = 0
                if (r0 == 0) goto L_0x0018
                java.lang.CharSequence r0 = r0.getText()
                goto L_0x0019
            L_0x0018:
                r0 = r1
            L_0x0019:
                if (r0 != 0) goto L_0x001d
                java.lang.String r0 = ""
            L_0x001d:
                r2 = 2131302576(0x7f0918b0, float:1.8223242E38)
                java.lang.Object r6 = r6.getTag(r2)
                boolean r2 = r6 instanceof java.lang.Boolean
                if (r2 == 0) goto L_0x002b
                r1 = r6
                java.lang.Boolean r1 = (java.lang.Boolean) r1
            L_0x002b:
                r6 = 0
                if (r1 == 0) goto L_0x0033
                boolean r1 = r1.booleanValue()
                goto L_0x0034
            L_0x0033:
                r1 = 0
            L_0x0034:
                java.lang.String r2 = "{\n                      …le)\n                    }"
                r3 = 1
                if (r1 == 0) goto L_0x004f
                vg2.a r1 = r5.f147744d
                android.app.Activity r1 = r1.getContext()
                r4 = 2131829822(0x7f11243e, float:1.9292624E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r6 = r1.getString(r4, r3)
                gy3.C87412m.m108593f(r6, r2)
                goto L_0x0063
            L_0x004f:
                vg2.a r1 = r5.f147744d
                android.app.Activity r1 = r1.getContext()
                r4 = 2131830060(0x7f11252c, float:1.9293107E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r6 = r1.getString(r4, r3)
                gy3.C87412m.m108593f(r6, r2)
            L_0x0063:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vg2.C52907a.C52910c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vg2.a$d */
    public static final class C52911d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C52907a f147745d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52911d(C52907a aVar) {
            super(1);
            this.f147745d = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                android.view.View r6 = (android.view.View) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                r0 = 2131314491(0x7f09473b, float:1.8247409E38)
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1 = 0
                if (r0 == 0) goto L_0x0018
                java.lang.CharSequence r0 = r0.getText()
                goto L_0x0019
            L_0x0018:
                r0 = r1
            L_0x0019:
                if (r0 != 0) goto L_0x001d
                java.lang.String r0 = ""
            L_0x001d:
                r2 = 2131302576(0x7f0918b0, float:1.8223242E38)
                java.lang.Object r6 = r6.getTag(r2)
                boolean r2 = r6 instanceof java.lang.Boolean
                if (r2 == 0) goto L_0x002b
                r1 = r6
                java.lang.Boolean r1 = (java.lang.Boolean) r1
            L_0x002b:
                r6 = 0
                if (r1 == 0) goto L_0x0033
                boolean r1 = r1.booleanValue()
                goto L_0x0034
            L_0x0033:
                r1 = 0
            L_0x0034:
                java.lang.String r2 = "{\n                      …le)\n                    }"
                r3 = 1
                if (r1 == 0) goto L_0x004f
                vg2.a r1 = r5.f147745d
                android.app.Activity r1 = r1.getContext()
                r4 = 2131829822(0x7f11243e, float:1.9292624E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r6 = r1.getString(r4, r3)
                gy3.C87412m.m108593f(r6, r2)
                goto L_0x0063
            L_0x004f:
                vg2.a r1 = r5.f147745d
                android.app.Activity r1 = r1.getContext()
                r4 = 2131830060(0x7f11252c, float:1.9293107E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r6 = r1.getString(r4, r3)
                gy3.C87412m.m108593f(r6, r2)
            L_0x0063:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vg2.C52907a.C52911d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vg2.a$e */
    public static final class C52912e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C52907a f147746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52912e(C52907a aVar) {
            super(1);
            this.f147746d = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                android.view.View r6 = (android.view.View) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                r0 = 2131314485(0x7f094735, float:1.8247396E38)
                android.view.View r0 = r6.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1 = 0
                if (r0 == 0) goto L_0x0018
                java.lang.CharSequence r0 = r0.getText()
                goto L_0x0019
            L_0x0018:
                r0 = r1
            L_0x0019:
                if (r0 != 0) goto L_0x001d
                java.lang.String r0 = ""
            L_0x001d:
                r2 = 2131302576(0x7f0918b0, float:1.8223242E38)
                java.lang.Object r6 = r6.getTag(r2)
                boolean r2 = r6 instanceof java.lang.Boolean
                if (r2 == 0) goto L_0x002b
                r1 = r6
                java.lang.Boolean r1 = (java.lang.Boolean) r1
            L_0x002b:
                r6 = 0
                if (r1 == 0) goto L_0x0033
                boolean r1 = r1.booleanValue()
                goto L_0x0034
            L_0x0033:
                r1 = 0
            L_0x0034:
                java.lang.String r2 = "{\n                      …le)\n                    }"
                r3 = 1
                if (r1 == 0) goto L_0x004f
                vg2.a r1 = r5.f147746d
                android.app.Activity r1 = r1.getContext()
                r4 = 2131829822(0x7f11243e, float:1.9292624E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r6 = r1.getString(r4, r3)
                gy3.C87412m.m108593f(r6, r2)
                goto L_0x0063
            L_0x004f:
                vg2.a r1 = r5.f147746d
                android.app.Activity r1 = r1.getContext()
                r4 = 2131830060(0x7f11252c, float:1.9293107E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r6 = r1.getString(r4, r3)
                gy3.C87412m.m108593f(r6, r2)
            L_0x0063:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vg2.C52907a.C52912e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vg2.a$f */
    public static final class C52913f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C52907a f147747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52913f(C52907a aVar) {
            super(1);
            this.f147747d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag(C0966R.C0970id.d3q);
            Object obj2 = tag instanceof CharSequence ? (CharSequence) tag : null;
            if (obj2 == null) {
                obj2 = "";
            }
            String string = this.f147747d.getContext().getString(C0966R.string.d1b, new Object[]{obj2});
            C87412m.m108593f(string, "context.getString(R.stri…_audio_result_desc, desc)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52907a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.e6e);
        root.view(C0966R.C0970id.bed).desc((int) C0966R.C0970id.bex).clickAs(C0966R.C0970id.bex).disableChildren();
        root.view(C0966R.C0970id.bex).disable();
        root.view(C0966R.C0970id.itm).desc((C32226l<? super View, String>) C52908a.f147742d).disableChildren();
        root.view(C0966R.C0970id.c1k).desc((int) C0966R.string.d6i).disableChildren();
        root.view(C0966R.C0970id.ih_).desc((C32226l<? super View, String>) new C52909b(this));
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.k36);
        root2.view(C0966R.C0970id.k55).desc((C32226l<? super View, String>) new C52910c(this));
        root2.view(C0966R.C0970id.k58).desc((C32226l<? super View, String>) new C52911d(this));
        root2.view(C0966R.C0970id.f359306k52).desc((C32226l<? super View, String>) new C52912e(this));
        root2.view(C0966R.C0970id.k7k).desc((int) C0966R.string.d1a);
        root(C0966R.C0970id.k5p).view(C0966R.C0970id.k7r).desc((C32226l<? super View, String>) new C52913f(this));
    }
}
