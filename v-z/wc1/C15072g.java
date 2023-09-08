package wc1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

@C113200q(initialMode = 2)
/* renamed from: wc1.g */
public final class C15072g extends C15641a implements C15128y {

    /* renamed from: wc1.g$a */
    public static final class C15073a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41204d;

        /* renamed from: e */
        public final /* synthetic */ Context f41205e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15073a(C15072g gVar, Context context) {
            super(1);
            this.f41204d = gVar;
            this.f41205e = context;
        }

        public Object invoke(Object obj) {
            String str;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41204d.mo14390e3(view, C0966R.C0970id.d58);
            int d3 = this.f41204d.mo14389d3(view, C0966R.C0970id.d3i);
            int d35 = this.f41204d.mo14389d3(view, C0966R.C0970id.d3t);
            if (d3 == 1) {
                str = ',' + this.f41205e.getString(C0966R.string.d1h);
            } else if (d3 != 2) {
                str = "";
            } else {
                str = ',' + this.f41205e.getString(C0966R.string.d1e);
            }
            String string = this.f41205e.getString(C0966R.string.eti, new Object[]{e3, str, Integer.valueOf(d35)});
            C87412m.m108593f(string, "context.getString(\n     …ContentDesc, followCount)");
            return string;
        }
    }

    /* renamed from: wc1.g$b */
    public static final class C15074b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ Context f41206d;

        /* renamed from: e */
        public final /* synthetic */ C15072g f41207e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15074b(Context context, C15072g gVar) {
            super(1);
            this.f41206d = context;
            this.f41207e = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String string = this.f41206d.getString(C0966R.string.d1p);
            C87412m.m108593f(string, "context.getString(R.stri…der_awesome_ground_title)");
            if (!this.f41207e.mo14388c3(view, C0966R.C0970id.f358032nl0)) {
                return string;
            }
            return string + this.f41206d.getString(C0966R.string.de8);
        }
    }

    /* renamed from: wc1.g$c */
    public static final class C15075c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15075c(C15072g gVar) {
            super(1);
            this.f41208d = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41208d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f41208d.mo14390e3(view, C0966R.C0970id.d3o);
            CharSequence e36 = this.f41208d.mo14390e3(view, C0966R.C0970id.d3p);
            StringBuilder sb = new StringBuilder();
            sb.append(e3);
            sb.append(e35);
            sb.append(e36);
            return sb.toString();
        }
    }

    /* renamed from: wc1.g$d */
    public static final class C15076d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41209d;

        /* renamed from: e */
        public final /* synthetic */ Context f41210e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15076d(C15072g gVar, Context context) {
            super(1);
            this.f41209d = gVar;
            this.f41210e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41209d.mo14390e3(view, C0966R.C0970id.f358033d40);
            String string = this.f41209d.mo14388c3(view, C0966R.C0970id.d3w) ? this.f41210e.getString(C0966R.string.fol) : "";
            C87412m.m108593f(string, "if (isLike) {\n          …     \"\"\n                }");
            return 36190 + e3 + ", " + string;
        }
    }

    /* renamed from: wc1.g$e */
    public static final class C15077e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15077e(C15072g gVar) {
            super(1);
            this.f41211d = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41211d.mo14390e3(view, C0966R.C0970id.d3u);
            return "转发" + e3;
        }
    }

    /* renamed from: wc1.g$f */
    public static final class C15078f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15078f(C15072g gVar) {
            super(1);
            this.f41212d = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41212d.mo14390e3(view, C0966R.C0970id.d3m);
            return "评论" + e3;
        }
    }

    /* renamed from: wc1.g$g */
    public static final class C15079g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15079g(C15072g gVar) {
            super(1);
            this.f41213d = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41213d.mo14390e3(view, C0966R.C0970id.d5g);
            return "星标" + e3;
        }
    }

    /* renamed from: wc1.g$h */
    public static final class C15080h extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C15080h f41214d = new C15080h();

        public C15080h() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return view instanceof MMNeat7extView ? ((MMNeat7extView) view).mo154968a().toString() : "";
        }
    }

    /* renamed from: wc1.g$i */
    public static final class C15081i extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15081i(C15072g gVar) {
            super(1);
            this.f41215d = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return this.f41215d.mo14390e3(view, C0966R.C0970id.lzw).toString();
        }
    }

    /* renamed from: wc1.g$j */
    public static final class C15082j extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15072g f41216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15082j(C15072g gVar) {
            super(1);
            this.f41216d = gVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return this.f41216d.mo14390e3(view, C0966R.C0970id.lzs).toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15072g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        Context context = MMApplicationContext.getContext();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.cy9);
        root.view(C0966R.C0970id.cym).clickAs(C0966R.C0970id.a27).disableChildren().desc((C32226l<? super View, String>) new C15073a(this, context));
        root.view(C0966R.C0970id.bh6).disable();
        root(C0966R.C0970id.ieh).view(C0966R.C0970id.iei).desc((C32226l<? super View, String>) new C15075c(this));
        root(C0966R.C0970id.edb).view(C0966R.C0970id.a2s).desc((C32226l<? super View, String>) new C15076d(this, context));
        root(C0966R.C0970id.edb).view(C0966R.C0970id.ji4).desc((C32226l<? super View, String>) new C15077e(this));
        root(C0966R.C0970id.edb).view(C0966R.C0970id.bjq).desc((C32226l<? super View, String>) new C15078f(this));
        root(C0966R.C0970id.edb).view(C0966R.C0970id.k07).desc((C32226l<? super View, String>) new C15079g(this));
        root(C0966R.C0970id.bsh).view(C0966R.C0970id.ki5).desc((C32226l<? super View, String>) C15080h.f41214d);
        root(C0966R.C0970id.egp).view(C0966R.C0970id.kbp).desc((int) C0966R.string.ec8);
        root(C0966R.C0970id.d9o).view(C0966R.C0970id.d9w).desc((C32226l<? super View, String>) new C15081i(this));
        root(C0966R.C0970id.d9o).view(C0966R.C0970id.lzp).desc((C32226l<? super View, String>) new C15082j(this));
        root(C0966R.C0970id.e6u).view(C0966R.C0970id.ms_).expand(8, 6, 16, 6);
        root(C0966R.C0970id.e6u).view(C0966R.C0970id.a2r).desc((C32226l<? super View, String>) new C15074b(context, this));
        root(C0966R.C0970id.f358728gq1).view(C0966R.C0970id.eah).desc((int) C0966R.string.egs);
    }
}
