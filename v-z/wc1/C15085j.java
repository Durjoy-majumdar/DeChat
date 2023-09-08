package wc1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;
import z04.C112551y;

/* renamed from: wc1.j */
public class C15085j extends C15641a {

    /* renamed from: wc1.j$a */
    public static final class C15086a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41218d;

        /* renamed from: e */
        public final /* synthetic */ Context f41219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15086a(C15085j jVar, Context context) {
            super(1);
            this.f41218d = jVar;
            this.f41219e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String str = null;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                str = textView.getText();
            }
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            int d3 = this.f41218d.mo14389d3(view, C0966R.C0970id.f358034d41);
            boolean z = true;
            if (d3 == 1) {
                str2 = ',' + this.f41219e.getString(C0966R.string.d1h);
            } else if (d3 == 2) {
                str2 = ',' + this.f41219e.getString(C0966R.string.d1e);
            }
            if (str2.length() <= 0) {
                z = false;
            }
            if (!z) {
                return str.toString();
            }
            return str + str2;
        }
    }

    /* renamed from: wc1.j$b */
    public static final class C15087b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41220d;

        /* renamed from: e */
        public final /* synthetic */ Context f41221e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15087b(C15085j jVar, Context context) {
            super(1);
            this.f41220d = jVar;
            this.f41221e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = this.f41220d.mo14390e3(view, C0966R.C0970id.d4z).toString();
            CharSequence e3 = this.f41220d.mo14390e3(view, C0966R.C0970id.d4x);
            CharSequence e35 = this.f41220d.mo14390e3(view, C0966R.C0970id.f358037d50);
            CharSequence e36 = this.f41220d.mo14390e3(view, C0966R.C0970id.d4y);
            String string = this.f41221e.getString(C0966R.string.e85, new Object[]{obj2, e3, e35, e36});
            C87412m.m108593f(string, "context.getString(com.te…c, seq, desc, src, price)");
            return string;
        }
    }

    /* renamed from: wc1.j$c */
    public static final class C15088c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41222d;

        /* renamed from: e */
        public final /* synthetic */ Context f41223e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15088c(C15085j jVar, Context context) {
            super(1);
            this.f41222d = jVar;
            this.f41223e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = this.f41222d.mo14390e3(view, C0966R.C0970id.d4v).toString();
            CharSequence e3 = this.f41222d.mo14390e3(view, C0966R.C0970id.d4t);
            CharSequence e35 = this.f41222d.mo14390e3(view, C0966R.C0970id.d4w);
            CharSequence e36 = this.f41222d.mo14390e3(view, C0966R.C0970id.d4u);
            String string = this.f41223e.getString(C0966R.string.f360690e73, new Object[]{obj2, e3, e35, e36});
            C87412m.m108593f(string, "context.getString(com.te…moting, desc, src, price)");
            return string;
        }
    }

    /* renamed from: wc1.j$d */
    public static final class C15089d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41224d;

        /* renamed from: e */
        public final /* synthetic */ Context f41225e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15089d(C15085j jVar, Context context) {
            super(1);
            this.f41224d = jVar;
            this.f41225e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            boolean c3 = this.f41224d.mo14388c3(view, C0966R.C0970id.d4m);
            CharSequence e3 = this.f41224d.mo14390e3(view, C0966R.C0970id.d4n);
            view.setClickable(c3);
            if (!c3) {
                return e3.toString();
            }
            String string = this.f41225e.getString(C0966R.string.dn4, new Object[]{e3});
            C87412m.m108593f(string, "{\n                    co…ontent)\n                }");
            return string;
        }
    }

    /* renamed from: wc1.j$e */
    public static final class C15090e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41226d;

        /* renamed from: e */
        public final /* synthetic */ Context f41227e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15090e(C15085j jVar, Context context) {
            super(1);
            this.f41226d = jVar;
            this.f41227e = context;
        }

        public Object invoke(Object obj) {
            boolean z;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f41226d.mo14389d3(view, C0966R.C0970id.d46);
            CharSequence e3 = this.f41226d.mo14390e3(view, C0966R.C0970id.f358035d42);
            CharSequence e35 = this.f41226d.mo14390e3(view, C0966R.C0970id.d45);
            CharSequence e36 = this.f41226d.mo14390e3(view, C0966R.C0970id.d48);
            if (!Util.isNullOrNil(e36)) {
                e36 = this.f41227e.getString(C0966R.string.e6_, new Object[]{e36});
                C87412m.m108593f(e36, "context.getString(com.te…reply_comment, toContact)");
            }
            CharSequence e37 = this.f41226d.mo14390e3(view, C0966R.C0970id.d44);
            CharSequence e38 = this.f41226d.mo14390e3(view, C0966R.C0970id.d47);
            this.f41226d.getClass();
            switch (d3) {
                case 10001:
                case 10006:
                case CdnLogic.kMediaTypeFavoriteBigFile /*10007*/:
                case 10008:
                case 10018:
                case 10019:
                case 20013:
                case 20019:
                case 20020:
                case 100000:
                case 100001:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                String string = this.f41227e.getString(C0966R.string.djk, new Object[]{e38, e37});
                C87412m.m108593f(string, "{\n                    co…ontent)\n                }");
                return string;
            }
            String string2 = this.f41227e.getString(C0966R.string.f360546nd3, new Object[]{e3, e35, e36, e37});
            C87412m.m108593f(string2, "{\n                    co…ontent)\n                }");
            return string2;
        }
    }

    /* renamed from: wc1.j$f */
    public static final class C15091f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ Context f41228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15091f(Context context) {
            super(1);
            this.f41228d = context;
        }

        public Object invoke(Object obj) {
            String str;
            CharSequence text;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            Context context = this.f41228d;
            String string = context.getString(C0966R.string.f360540di2);
            C87412m.m108593f(string, "context.getString(com.te…content_replacement_desc)");
            String string2 = context.getString(C0966R.string.f360700e92, new Object[]{C112551y.m153814n(str, "**", string, false)});
            C87412m.m108593f(string2, "context.getString(\n     …ntent_replacement_desc)))");
            return string2;
        }
    }

    /* renamed from: wc1.j$g */
    public static final class C15092g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41229d;

        /* renamed from: e */
        public final /* synthetic */ Context f41230e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15092g(C15085j jVar, Context context) {
            super(1);
            this.f41229d = jVar;
            this.f41230e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41229d.mo14390e3(view, C0966R.C0970id.d4k);
            CharSequence e35 = this.f41229d.mo14390e3(view, C0966R.C0970id.d4j);
            CharSequence e36 = this.f41229d.mo14390e3(view, C0966R.C0970id.d4i);
            int d3 = this.f41229d.mo14389d3(view, C0966R.C0970id.d4l);
            StringBuilder sb = new StringBuilder();
            if (!Util.isNullOrNil(e3)) {
                sb.append(this.f41230e.getString(C0966R.string.dya));
                sb.append(e3);
                sb.append(" ");
            }
            sb.append(e35);
            if (!Util.isNullOrNil(e36)) {
                sb.append(" ");
                sb.append(this.f41230e.getString(C0966R.string.dvi, new Object[]{e36}));
            }
            if (d3 > 0) {
                sb.append(" ");
                sb.append(this.f41230e.getString(C0966R.string.dvk, new Object[]{Integer.valueOf(d3)}));
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sb.toString()");
            return sb4;
        }
    }

    /* renamed from: wc1.j$h */
    public static final class C15093h extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15085j f41231d;

        /* renamed from: e */
        public final /* synthetic */ Context f41232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15093h(C15085j jVar, Context context) {
            super(1);
            this.f41231d = jVar;
            this.f41232e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = this.f41231d.mo14390e3(view, C0966R.C0970id.d4f).toString();
            CharSequence e3 = this.f41231d.mo14390e3(view, C0966R.C0970id.d4h);
            CharSequence e35 = this.f41231d.mo14390e3(view, C0966R.C0970id.d4g);
            CharSequence e36 = this.f41231d.mo14390e3(view, C0966R.C0970id.d4c);
            CharSequence e37 = this.f41231d.mo14390e3(view, C0966R.C0970id.d4d);
            CharSequence e38 = this.f41231d.mo14390e3(view, C0966R.C0970id.d4e);
            String string = this.f41232e.getString(C0966R.string.dsu, new Object[]{obj2, e3, e35, e36, e37, e38});
            C87412m.m108593f(string, "context.getString(com.te… attendedBtn, bottomDesc)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15085j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        Context context = MMApplicationContext.getContext();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.fzn);
        ViewSetter desc = root.view(C0966R.C0970id.fzi).desc((int) C0966R.string.e9h);
        ViewType viewType = ViewType.TextView;
        desc.type(viewType).disExpand();
        root.view(C0966R.C0970id.fzk).disExpand().desc((C32226l<? super View, String>) new C15086a(this, context));
        root(C0966R.C0970id.dtb).view(C0966R.C0970id.dtb).disableChildren().clickAs(C0966R.C0970id.dta).desc((int) C0966R.string.dx8);
        root(C0966R.C0970id.g0h).view(C0966R.C0970id.g0h).disableChildren().clickAs(C0966R.C0970id.g0d).desc((int) C0966R.string.djc);
        root(C0966R.C0970id.g0y).view(C0966R.C0970id.g0y).disableChildren().clickAs(C0966R.C0970id.g0x).desc((int) C0966R.string.dwn);
        root(C0966R.C0970id.ftd).view(C0966R.C0970id.fta).desc((C32226l<? super View, String>) new C15089d(this, context)).disableChildren().disExpand();
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.djp);
        root2.view(C0966R.C0970id.fsv).desc((C32226l<? super View, String>) new C15090e(this, context));
        root2.view(C0966R.C0970id.djo).disable().disExpand();
        root2.view(C0966R.C0970id.fsx).valueByView(C0966R.C0970id.fsy).disableChildren();
        root2.view(C0966R.C0970id.amo).desc((C32226l<? super View, String>) new C15091f(context));
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.fvw);
        root3.view(C0966R.C0970id.drl).desc((int) C0966R.string.djb);
        root3.view(C0966R.C0970id.drj).desc((int) C0966R.string.dvj);
        root3.view(C0966R.C0970id.dpb).desc((C32226l<? super View, String>) new C15092g(this, context));
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0970id.dqp);
        root4.view(C0966R.C0970id.dqo).desc((int) C0966R.string.dt9);
        root4.view(C0966R.C0970id.f357800bu0).disable();
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0970id.dqr);
        root5.view(C0966R.C0970id.be4).desc((int) C0966R.string.djb).type(viewType);
        root5.view(C0966R.C0970id.f6186zp).disExpand();
        root5.view(C0966R.C0970id.arc).desc((C32226l<? super View, String>) new C15093h(this, context));
        root(C0966R.C0970id.dsd).view(C0966R.C0970id.drx).desc((int) C0966R.string.djb);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0970id.dz7);
        root6.view(C0966R.C0970id.dyu).desc((int) C0966R.string.djb);
        root6.view(C0966R.C0970id.m2l).expand(12, 12, 12, 12);
        root6.view(C0966R.C0970id.dz8).expand(12, 12, 12, 12);
        root6.view(C0966R.C0970id.f358232dz3).expand(12, 12, 12, 12);
        MMBaseAccessibilityConfig.ConfigHelper root7 = root(C0966R.C0970id.f358229dz0);
        root7.view(C0966R.C0970id.f358229dz0).desc((C32226l<? super View, String>) new C15087b(this, context));
        root7.view(C0966R.C0970id.i3e).disable();
        root7.view(C0966R.C0970id.i39).disExpand();
        MMBaseAccessibilityConfig.ConfigHelper root8 = root(C0966R.C0971layout.f359756cx0);
        int a = C74942w4.m89784a(context, 8);
        root8.view(C0966R.C0970id.be4).desc((int) C0966R.string.djb).type(viewType).expand(a, a, a, a);
        root8.view(C0966R.C0970id.bev).desc((int) C0966R.string.djb).type(viewType);
        root8.view(C0966R.C0970id.dzf).desc((C32226l<? super View, String>) new C15088c(this, context));
        root8.view(C0966R.C0970id.i3e).disable();
        root(C0966R.C0971layout.f359881bc2).view(C0966R.C0970id.f1j).disable();
        root(C0966R.C0970id.ftd).view(C0966R.C0970id.djz).disable();
        root(C0966R.C0970id.dr8).view(C0966R.C0970id.gbv).desc((int) C0966R.string.dup);
        root(C0966R.C0970id.e1v).view(C0966R.C0970id.fv6).disable();
    }
}
