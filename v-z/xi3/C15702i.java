package xi3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.List;
import z04.C112550d0;

/* renamed from: xi3.i */
public final class C15702i extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.i$a */
    public static final class C15703a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15702i f42393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15703a(C15702i iVar) {
            super(1);
            this.f42393d = iVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((TextView) view.findViewById(C0966R.C0970id.ko4)).getText().toString();
            View findViewById = view.findViewById(C0966R.C0970id.h7k);
            String string = this.f42393d.getString(C0966R.string.f7372ec);
            Object[] objArr = new Object[2];
            objArr[0] = obj2;
            objArr[1] = findViewById.getVisibility() == 0 ? this.f42393d.getString(C0966R.string.bvl) : "";
            String format = String.format(string, Arrays.copyOf(objArr, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: xi3.i$b */
    public static final class C15704b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15702i f42394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15704b(C15702i iVar) {
            super(1);
            this.f42394d = iVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) ((ViewGroup) view).findViewById(C0966R.C0970id.b77)).getText();
            C87412m.m108593f(text, "it as ViewGroup).findVie…                    .text");
            List U = C112550d0.m153785U(text, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
            if (U.size() != 2) {
                return this.f42394d.getString(C0966R.string.me9);
            }
            String format = String.format(this.f42394d.getString(C0966R.string.me8), Arrays.copyOf(new Object[]{U.get(0), U.get(1)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: xi3.i$c */
    public static final class C15705c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15702i f42395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15705c(C15702i iVar) {
            super(1);
            this.f42395d = iVar;
        }

        public Object invoke(Object obj) {
            String str;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.hg4)).getText().toString();
            String obj3 = ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.fhs)).getText().toString();
            String obj4 = ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.l0s)).getText().toString();
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.kmv);
            View findViewById = view.findViewById(C0966R.C0970id.f358441f52);
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            boolean b = C87412m.m108589b(((View) parent).getTag(C0966R.C0970id.bt7), Boolean.TRUE);
            String string = this.f42395d.getString(C0966R.string.bvf);
            Object[] objArr = new Object[6];
            objArr[0] = obj2;
            String str2 = "";
            if (textView.getVisibility() != 0 || textView.getText().toString().compareTo("0") <= 0) {
                str = str2;
            } else {
                str = String.format(this.f42395d.getString(C0966R.string.bvn), Arrays.copyOf(new Object[]{textView.getText()}, 1));
                C87412m.m108593f(str, "format(format, *args)");
            }
            objArr[1] = str;
            objArr[2] = obj3;
            objArr[3] = obj4;
            objArr[4] = findViewById.getVisibility() == 0 ? this.f42395d.getString(C0966R.string.bvl) : str2;
            if (b) {
                str2 = this.f42395d.getString(C0966R.string.bvm);
            }
            objArr[5] = str2;
            String format = String.format(string, Arrays.copyOf(objArr, 6));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: xi3.i$d */
    public static final class C15706d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15702i f42396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15706d(C15702i iVar) {
            super(1);
            this.f42396d = iVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) ((ViewGroup) view).findViewById(C0966R.C0970id.b77)).getText();
            C87412m.m108593f(text, "it as ViewGroup).findVie…                    .text");
            List U = C112550d0.m153785U(text, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
            if (U.size() != 2) {
                return this.f42396d.getString(C0966R.string.me9);
            }
            String format = String.format(this.f42396d.getString(C0966R.string.me8), Arrays.copyOf(new Object[]{U.get(0), U.get(1)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: xi3.i$e */
    public static final class C15707e extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C15707e f42397d = new C15707e();

        public C15707e() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(view.getTag(C0966R.C0970id.f358507fj2), Boolean.TRUE));
        }
    }

    /* renamed from: xi3.i$f */
    public static final class C15708f extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C15708f f42398d = new C15708f();

        public C15708f() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return Boolean.valueOf(!C87412m.m108589b(view.getTag(C0966R.C0970id.f358507fj2), Boolean.TRUE));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15702i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bgp);
        root.view(C0966R.C0970id.eu7).desc((int) C0966R.string.gvz);
        root.view(C0966R.C0970id.a27).disable();
        root(C0966R.C0971layout.f359637cl0).view(C0966R.C0970id.btg).desc((C32226l<? super View, String>) new C15705c(this));
        root(C0966R.C0970id.f358508fj3).view(C0966R.C0970id.kd_).checkOn(C15707e.f42397d, C15708f.f42398d);
        root(C0966R.C0970id.gla).view(C0966R.C0970id.b7f).disable();
        root(C0966R.C0970id.gla).focusOrder();
        root(C0966R.C0970id.f5383do).view(C0966R.C0970id.f5471g1).desc((int) C0966R.string.gyb);
        root(C0966R.C0971layout.f6977tw).view(C0966R.C0970id.b45).descFormat(C0966R.string.f360247b60).valueByView(C0966R.C0970id.f5588j6);
        root(C0966R.C0971layout.f6976tv).view(C0966R.C0970id.b1k).descFormat(C0966R.string.f7376eh).valueByView(C0966R.C0970id.f5588j6);
        ViewSetter view = root(C0966R.C0971layout.b7e).view(C0966R.C0970id.fz8);
        ViewType viewType = ViewType.Button;
        view.type(viewType).desc((int) C0966R.string.f0u);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.b7g);
        root2.view(C0966R.C0970id.fz4).descFormat(C0966R.string.f360964ga3).valueByView(C0966R.C0970id.fz_).valueByView(C0966R.C0970id.f358591fz2);
        root2.view(C0966R.C0970id.fz5).type(viewType).desc((int) C0966R.string.bfj);
        root(C0966R.C0971layout.cue).view(C0966R.C0970id.jad).type(viewType).desc((int) C0966R.string.bfj);
        root(C0966R.C0971layout.c86).view(C0966R.C0970id.ald).type(viewType).desc((int) C0966R.string.f0u);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.f6983u2);
        root3.view(C0966R.C0970id.j89).descFormat(C0966R.string.ii8).valueByView(C0966R.C0970id.b8j);
        root3.view(C0966R.C0970id.b8i).type(viewType).desc((int) C0966R.string.bbg);
        root3.view(C0966R.C0970id.b8h).type(viewType).desc((int) C0966R.string.bfj);
        root(C0966R.C0971layout.f6950t5).view(C0966R.C0970id.ib7).descFormat(C0966R.string.gwl).valueByView(C0966R.C0970id.b3g).valueByKey("quote_img");
        root(C0966R.C0971layout.f6900ro).view(C0966R.C0970id.ib7).descFormat(C0966R.string.gwl).valueByView(C0966R.C0970id.b3g).valueByKey("quote_img");
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0971layout.f6921s_);
        root4.view(C0966R.C0970id.b47).desc((int) C0966R.C0970id.kmm);
        root4.view(C0966R.C0970id.fnk).desc((int) C0966R.string.a_r);
        root(C0966R.C0971layout.f6301b3).view(C0966R.C0970id.ko7).disableChildren().desc((C32226l<? super View, String>) new C15703a(this));
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0971layout.f6934sm);
        root5.view(C0966R.C0970id.f6121xw).disable();
        root5.view(C0966R.C0970id.f6122xx).disable();
        root5.view(C0966R.C0970id.b47).disable();
        root5.view(C0966R.C0970id.f6124xz).desc((int) C0966R.string.b_r);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0971layout.f6883r5);
        root6.view(C0966R.C0970id.f6121xw).disable();
        root6.view(C0966R.C0970id.f6122xx).disable();
        root6.view(C0966R.C0970id.b47).disable();
        root6.view(C0966R.C0970id.f6124xz).desc((int) C0966R.string.b_r);
        root(C0966R.C0971layout.f6964tj).view(C0966R.C0970id.b47).desc((C32226l<? super View, String>) new C15704b(this));
        root(C0966R.C0971layout.f6915s4).view(C0966R.C0970id.b47).desc((C32226l<? super View, String>) new C15706d(this));
        root(C0966R.C0971layout.f6889ra).view(C0966R.C0970id.b47).descFormat(C0966R.string.m66).valueByView(C0966R.C0970id.b6g);
        root(C0966R.C0971layout.f6939sr).view(C0966R.C0970id.b47).descFormat(C0966R.string.m66).valueByView(C0966R.C0970id.b6g);
        root(C0966R.C0971layout.f6931sj).view(C0966R.C0970id.b47).desc((int) C0966R.C0970id.b3p);
        root(C0966R.C0971layout.f6880r2).view(C0966R.C0970id.b47).desc((int) C0966R.C0970id.b3p);
        root(C0966R.C0970id.f6197hp).view(C0966R.C0970id.b46).clickAs(C0966R.C0970id.b7h);
    }
}
