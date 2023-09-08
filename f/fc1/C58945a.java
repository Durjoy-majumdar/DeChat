package fc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: fc1.a */
public final class C58945a extends MMBaseAccessibilityConfig {

    /* renamed from: d */
    public boolean f168655d;

    /* renamed from: fc1.a$a */
    public static final class C58946a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58946a(C58945a aVar) {
            super(1);
            this.f168656d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            if (!C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_dark_add))) {
                return "";
            }
            String string = this.f168656d.getContext().getResources().getString(C0966R.string.cm8);
            C87412m.m108593f(string, "{\n                      …av)\n                    }");
            return string;
        }
    }

    /* renamed from: fc1.a$b */
    public static final class C58947b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58947b(C58945a aVar) {
            super(1);
            this.f168657d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            if (!C87412m.m108589b(view.getTag(C0966R.C0970id.ke7), Integer.valueOf(C0966R.raw.actionbar_icon_dark_add))) {
                return "";
            }
            String string = this.f168657d.getContext().getResources().getString(C0966R.string.cm8);
            C87412m.m108593f(string, "{\n                      …av)\n                    }");
            return string;
        }
    }

    /* renamed from: fc1.a$c */
    public static final class C58948c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58948c(C58945a aVar) {
            super(1);
            this.f168658d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168658d.getContext().getString(C0966R.string.crs);
            C87412m.m108593f(string, "context.getString(R.string.favorite_sub_title_url)");
            return string;
        }
    }

    /* renamed from: fc1.a$d */
    public static final class C58949d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58949d(C58945a aVar) {
            super(1);
            this.f168659d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168659d.getContext().getString(C0966R.string.crl);
            C87412m.m108593f(string, "context.getString(R.stri…_sub_title_imageandvideo)");
            return string;
        }
    }

    /* renamed from: fc1.a$e */
    public static final class C58950e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58950e(C58945a aVar) {
            super(1);
            this.f168660d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168660d.getContext().getString(C0966R.string.cru);
            C87412m.m108593f(string, "context.getString(R.stri…favorite_sub_title_voice)");
            return string;
        }
    }

    /* renamed from: fc1.a$f */
    public static final class C58951f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58951f(C58945a aVar) {
            super(1);
            this.f168661d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168661d.getContext().getString(C0966R.string.crn);
            C87412m.m108593f(string, "context.getString(R.stri…favorite_sub_title_music)");
            return string;
        }
    }

    /* renamed from: fc1.a$g */
    public static final class C58952g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58952g(C58945a aVar) {
            super(1);
            this.f168662d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            C58945a aVar = this.f168662d;
            if (aVar.f168655d) {
                String string = aVar.getContext().getString(C0966R.string.n6o);
                C87412m.m108593f(string, "{\n                      …er)\n                    }");
                return string;
            }
            String string2 = aVar.getContext().getString(C0966R.string.crm);
            C87412m.m108593f(string2, "{\n                      …on)\n                    }");
            return string2;
        }
    }

    /* renamed from: fc1.a$h */
    public static final class C58953h extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58953h(C58945a aVar) {
            super(1);
            this.f168663d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168663d.getContext().getString(C0966R.string.crg);
            C87412m.m108593f(string, "context.getString(R.stri….favorite_sub_title_file)");
            return string;
        }
    }

    /* renamed from: fc1.a$i */
    public static final class C58954i extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58954i(C58945a aVar) {
            super(1);
            this.f168664d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168664d.getContext().getString(C0966R.string.crq);
            C87412m.m108593f(string, "context.getString(R.stri…avorite_sub_title_record)");
            return string;
        }
    }

    /* renamed from: fc1.a$j */
    public static final class C58955j extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58955j(C58945a aVar) {
            super(1);
            this.f168665d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168665d.getContext().getString(C0966R.string.cro);
            C87412m.m108593f(string, "context.getString(R.stri….favorite_sub_title_note)");
            return string;
        }
    }

    /* renamed from: fc1.a$k */
    public static final class C58956k extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C58945a f168666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58956k(C58945a aVar) {
            super(1);
            this.f168666d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f168666d.getContext().getString(C0966R.string.crp);
            C87412m.m108593f(string, "context.getString(R.stri…_sub_title_recently_used)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58945a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        ViewSetter view = view(C0966R.C0970id.f5421eo, C0966R.C0970id.f5421eo);
        ViewType viewType = ViewType.Button;
        view.type(viewType).desc((C32226l<? super View, String>) new C58946a(this));
        root(C0966R.C0971layout.f6304b6);
        view(C0966R.C0970id.f5421eo, C0966R.C0970id.f5421eo).type(viewType).desc((C32226l<? super View, String>) new C58947b(this));
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.kre);
        root.view(C0966R.C0970id.cwm).desc((C32226l<? super View, String>) new C58948c(this)).type(viewType);
        root.view(C0966R.C0970id.cwg).desc((C32226l<? super View, String>) new C58949d(this)).type(viewType);
        root.view(C0966R.C0970id.cwn).desc((C32226l<? super View, String>) new C58950e(this)).type(viewType);
        root.view(C0966R.C0970id.cwi).desc((C32226l<? super View, String>) new C58951f(this)).type(viewType);
        root.view(C0966R.C0970id.eef).desc((C32226l<? super View, String>) new C58952g(this)).type(viewType);
        root.view(C0966R.C0970id.cwf).desc((C32226l<? super View, String>) new C58953h(this)).type(viewType);
        root.view(C0966R.C0970id.cwl).desc((C32226l<? super View, String>) new C58954i(this)).type(viewType);
        root.view(C0966R.C0970id.cwj).desc((C32226l<? super View, String>) new C58955j(this)).type(viewType);
        root.view(C0966R.C0970id.cwk).desc((C32226l<? super View, String>) new C58956k(this)).type(viewType);
    }
}
