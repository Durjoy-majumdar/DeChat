package gx0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.bizui.widget.BizRecTagTextView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: gx0.b */
public final class C8465b extends MMBaseAccessibilityConfig {

    /* renamed from: gx0.b$a */
    public static final class C8466a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C8466a f27469d = new C8466a();

        public C8466a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            return str == null ? "" : str;
        }
    }

    /* renamed from: gx0.b$b */
    public static final class C8467b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C8467b f27470d = new C8467b();

        public C8467b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            return str == null ? "" : str;
        }
    }

    /* renamed from: gx0.b$c */
    public static final class C8468c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C8465b f27471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8468c(C8465b bVar) {
            super(1);
            this.f27471d = bVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((MMNeat7extView) view.findViewById(C0966R.C0970id.f357680b71)).mo154968a().toString();
            String obj3 = ((TextView) view.findViewById(C0966R.C0970id.hx8)).getText().toString();
            String obj4 = ((BizRecTagTextView) view.findViewById(C0966R.C0970id.f359015if1)).getText().toString();
            String obj5 = ((MMNeat7extView) view.findViewById(C0966R.C0970id.b6z)).mo154968a().toString();
            if (!Util.isNullOrNil(obj3)) {
                String string = this.f27471d.getContext().getResources().getString(C0966R.string.aqh);
                C87412m.m108593f(string, "context.resources.getStr…g.biz_timeline_rec_video)");
                String format = String.format(string, Arrays.copyOf(new Object[]{obj2, obj3, obj4, obj5}, 4));
                C87412m.m108593f(format, "format(format, *args)");
                return format;
            }
            String string2 = this.f27471d.getContext().getResources().getString(C0966R.string.aqi);
            C87412m.m108593f(string2, "context.resources.getStr…ne_rec_video_no_duration)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{obj2, obj4, obj5}, 3));
            C87412m.m108593f(format2, "format(format, *args)");
            return format2;
        }
    }

    /* renamed from: gx0.b$d */
    public static final class C8469d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C8465b f27472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8469d(C8465b bVar) {
            super(1);
            this.f27472d = bVar;
        }

        public Object invoke(Object obj) {
            Object obj2;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.kpm);
            String obj3 = ((MMNeat7extView) view.findViewById(C0966R.C0970id.jmk)).mo154968a().toString();
            if (C87412m.m108589b(mMNeat7extView.getTag(C0966R.C0970id.aak), Boolean.TRUE)) {
                String obj4 = mMNeat7extView.mo154968a().toString();
                Pattern compile = Pattern.compile("@@");
                C87412m.m108593f(compile, "compile(pattern)");
                C87412m.m108594g(obj4, "input");
                String replaceAll = compile.matcher(obj4).replaceAll("");
                C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                obj2 = replaceAll + 65292 + this.f27472d.getContext().getResources().getString(C0966R.string.f360195aq2);
            } else {
                obj2 = mMNeat7extView.mo154968a();
            }
            String obj5 = ((TextView) view.findViewById(C0966R.C0970id.efu)).getText().toString();
            String obj6 = ((TextView) view.findViewById(C0966R.C0970id.efv)).getText().toString();
            if (Util.isNullOrNil(obj5)) {
                obj5 = obj6;
            }
            return obj2 + 65292 + obj3 + 65292 + obj5 + 65292 + ((MMNeat7extView) view.findViewById(C0966R.C0970id.jmf)).mo154968a().toString();
        }
    }

    /* renamed from: gx0.b$e */
    public static final class C8470e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C8465b f27473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8470e(C8465b bVar) {
            super(1);
            this.f27473d = bVar;
        }

        public Object invoke(Object obj) {
            Object obj2;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.kp7);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.k_z);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.efu);
            if (C87412m.m108589b(mMNeat7extView.getTag(C0966R.C0970id.aak), Boolean.TRUE)) {
                CharSequence a = mMNeat7extView.mo154968a();
                C87412m.m108593f(a, "orgWords");
                Pattern compile = Pattern.compile("@@");
                C87412m.m108593f(compile, "compile(pattern)");
                String replaceAll = compile.matcher(a).replaceAll("");
                C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                obj2 = replaceAll + 65292 + this.f27473d.getContext().getResources().getString(C0966R.string.f360195aq2);
            } else {
                obj2 = mMNeat7extView.mo154968a();
            }
            return obj2 + ", " + textView.getText() + ", " + textView2.getText();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8465b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f6601je).view(C0966R.C0970id.adn).desc((int) C0966R.C0970id.adn);
        root(C0966R.C0970id.adc).view(C0966R.C0970id.adc).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.adk).valueByView(C0966R.C0970id.adf).disableChildren();
        root(C0966R.C0971layout.f6608jl).view(C0966R.C0970id.ae4).disable();
        root(C0966R.C0971layout.f6603jg).view(C0966R.C0970id.a27).disable();
        root(C0966R.C0970id.adu).view(C0966R.C0970id.kqz).desc((C32226l<? super View, String>) new C8469d(this)).disableChildren();
        root(C0966R.C0970id.aco).view(C0966R.C0970id.aco).desc((C32226l<? super View, String>) new C8470e(this)).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.b5u);
        root.view(C0966R.C0970id.b5u).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.aek).valueByView(C0966R.C0970id.efu);
        root.view(C0966R.C0970id.aek).disable();
        root(C0966R.C0970id.adw).view(C0966R.C0970id.b5w).descFormat(C0966R.string.aq6).valueByView(C0966R.C0970id.hx8).valueByView(C0966R.C0970id.kpm).valueByView(C0966R.C0970id.efu).valueByView(C0966R.C0970id.jmk).valueByView(C0966R.C0970id.efv).valueByView(C0966R.C0970id.jmf).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.adz);
        root2.view(C0966R.C0970id.b5y).descFormat(C0966R.string.aq5).valueByView(C0966R.C0970id.kpm).valueByView(C0966R.C0970id.hx8).valueByView(C0966R.C0970id.efu).valueByView(C0966R.C0970id.ady);
        root2.view(C0966R.C0970id.kpm).disable();
        root2.view(C0966R.C0970id.a8z).desc((int) C0966R.string.aq_).disableChildren();
        root(C0966R.C0970id.f358824mg0).view(C0966R.C0970id.mfz).desc((C32226l<? super View, String>) C8466a.f27469d).disableChildren();
        root(C0966R.C0970id.f358827mg3).view(C0966R.C0970id.f358826mg2).desc((C32226l<? super View, String>) C8467b.f27470d).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.f359016if2);
        root3.view(C0966R.C0970id.f359016if2).descFormat(C0966R.string.juq).valueByView(C0966R.C0970id.fey).valueByView(C0966R.C0970id.f359015if1).valueByView(C0966R.C0970id.if4).valueByView(C0966R.C0970id.f359017if3);
        root3.disable(C0966R.C0970id.fey);
        root3.disable(C0966R.C0970id.f359015if1);
        root3.disable(C0966R.C0970id.if4);
        root3.disable(C0966R.C0970id.f359017if3);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0971layout.f6633k_);
        root4.view(C0966R.C0970id.b6t).descFormat(C0966R.string.jup).valueByView(C0966R.C0970id.if7).valueByView(C0966R.C0970id.f359015if1).valueByView(C0966R.C0970id.b6z);
        root4.disable(C0966R.C0970id.f359015if1);
        root4.disable(C0966R.C0970id.if7);
        root4.disable(C0966R.C0970id.b6z);
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0971layout.f6635kb);
        root5.view(C0966R.C0970id.b6t).descFormat(C0966R.string.jup).valueByView(C0966R.C0970id.f357680b71).valueByView(C0966R.C0970id.f359015if1).valueByView(C0966R.C0970id.b6z);
        root5.disable(C0966R.C0970id.f359015if1);
        root5.disable(C0966R.C0970id.f357680b71);
        root5.disable(C0966R.C0970id.b6z);
        ViewSetter disableChildren = root(C0966R.C0971layout.f6628k5).view(C0966R.C0970id.bs4).descFormat(C0966R.string.jun).valueByView(C0966R.C0970id.kp7).disableChildren();
        ViewType viewType = ViewType.Button;
        disableChildren.type(viewType);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0971layout.f6624k1);
        root6.view(C0966R.C0970id.b6t).descFormat(C0966R.string.juq).valueByView(C0966R.C0970id.f357680b71).valueByView(C0966R.C0970id.b6v).valueByView(C0966R.C0970id.f359015if1).valueByView(C0966R.C0970id.b6z);
        root6.disable(C0966R.C0970id.f357680b71);
        root6.disable(C0966R.C0970id.b6v);
        root6.disable(C0966R.C0970id.f359015if1);
        root6.disable(C0966R.C0970id.b6z);
        root6.view(C0966R.C0970id.bes).desc((int) C0966R.string.aqf);
        MMBaseAccessibilityConfig.ConfigHelper root7 = root(C0966R.C0971layout.f6636kc);
        root7.view(C0966R.C0970id.b6t).desc((C32226l<? super View, String>) new C8468c(this));
        root7.disable(C0966R.C0970id.f357680b71);
        root7.disable(C0966R.C0970id.f359015if1);
        root7.disable(C0966R.C0970id.b6z);
        root7.view(C0966R.C0970id.bes).desc((int) C0966R.string.aqf);
        MMBaseAccessibilityConfig.ConfigHelper root8 = root(C0966R.C0971layout.f6627k4);
        root8.view(C0966R.C0970id.acr).descFormat(C0966R.string.jur).valueByView(C0966R.C0970id.f359410ks2).valueByView(C0966R.C0970id.kp7).valueByView(C0966R.C0970id.f6158yx).valueByView(C0966R.C0970id.f359015if1).valueByView(C0966R.C0970id.b6z);
        root8.disable(C0966R.C0970id.f359410ks2);
        root8.disable(C0966R.C0970id.kp7);
        root8.disable(C0966R.C0970id.f6158yx);
        root8.disable(C0966R.C0970id.f359015if1);
        root8.disable(C0966R.C0970id.b6z);
        root8.view(C0966R.C0970id.bes).desc((int) C0966R.string.aqf);
        MMBaseAccessibilityConfig.ConfigHelper root9 = root(C0966R.C0971layout.f6632k9);
        root9.view(C0966R.C0970id.b6t).descFormat(C0966R.string.juq).valueByView(C0966R.C0970id.f357680b71).valueByView(C0966R.C0970id.f6158yx).valueByView(C0966R.C0970id.f359015if1).valueByView(C0966R.C0970id.b6z);
        root9.disable(C0966R.C0970id.f357680b71);
        root9.disable(C0966R.C0970id.f6158yx);
        root9.disable(C0966R.C0970id.f359015if1);
        root9.disable(C0966R.C0970id.b6z);
        root9.view(C0966R.C0970id.bes).desc((int) C0966R.string.aqf);
        root(C0966R.C0971layout.f6618jv).view(C0966R.C0970id.bes).desc((int) C0966R.string.aqf);
        root(C0966R.C0970id.adx).view(C0966R.C0970id.b5w).descFormat(C0966R.string.aq7).valueByView(C0966R.C0970id.hx8).valueByView(C0966R.C0970id.kpm).valueByView(C0966R.C0970id.jmk).valueByView(C0966R.C0970id.jmf).disableChildren();
        root(C0966R.C0970id.adv).view(C0966R.C0970id.kqz).descFormat(C0966R.string.jup).valueByView(C0966R.C0970id.kpm).valueByView(C0966R.C0970id.jmk).valueByView(C0966R.C0970id.jmf).disableChildren();
        MMBaseAccessibilityConfig.ConfigHelper root10 = root(C0966R.C0971layout.f6654kw);
        root10.view(C0966R.C0970id.abq).descFormat(C0966R.string.jup).valueByView(C0966R.C0970id.hfq).valueByView(C0966R.C0970id.abr).valueByView(C0966R.C0970id.abe).disableChildren();
        root10.view(C0966R.C0970id.aba).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.abb).valueByView(C0966R.C0970id.abc).disableChildren();
        root(C0966R.C0971layout.f6620jx).view(C0966R.C0970id.aee).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.fey).valueByView(C0966R.C0970id.kki).type(viewType).disableChildren();
        root(C0966R.C0971layout.f6613jq).view(C0966R.C0970id.bs4).descFormat(C0966R.string.jup).valueByView(C0966R.C0970id.kp7).valueByView(C0966R.C0970id.k_z).valueByView(C0966R.C0970id.efu).type(viewType).disableChildren();
        root(C0966R.C0971layout.f6614jr).view(C0966R.C0970id.bs4).descFormat(C0966R.string.juo).valueByView(C0966R.C0970id.kp7).valueByView(C0966R.C0970id.k_z).disableChildren().type(viewType);
    }
}
