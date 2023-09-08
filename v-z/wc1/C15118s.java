package wc1;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

/* renamed from: wc1.s */
public final class C15118s extends C15641a {

    /* renamed from: wc1.s$a */
    public static final class C15119a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15118s f41251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15119a(C15118s sVar) {
            super(1);
            this.f41251d = sVar;
        }

        public Object invoke(Object obj) {
            String str;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41251d.mo14390e3(view, C0966R.C0970id.d58);
            int d3 = this.f41251d.mo14389d3(view, C0966R.C0970id.d3t);
            int d35 = this.f41251d.mo14389d3(view, C0966R.C0970id.d3i);
            Activity context = this.f41251d.getContext();
            C87412m.m108594g(context, "context");
            if (d35 == 1) {
                str = context.getString(C0966R.string.d1i);
                C87412m.m108593f(str, "{\n                 conte…personal2)\n             }");
            } else if (d35 != 2) {
                str = "";
            } else {
                str = context.getString(C0966R.string.d1f);
                C87412m.m108593f(str, "{\n                 conte…terprise2)\n             }");
            }
            String string = this.f41251d.getContext().getString(C0966R.string.cxl, new Object[]{e3, str, Integer.valueOf(d3)});
            C87412m.m108593f(string, "context.getString(com.te…name, authText, fanCount)");
            return string;
        }
    }

    /* renamed from: wc1.s$b */
    public static final class C15120b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15118s f41252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15120b(C15118s sVar) {
            super(1);
            this.f41252d = sVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f41252d.mo14389d3(view, C0966R.C0970id.d55);
            if (d3 > 0) {
                String string = this.f41252d.getContext().getString(C0966R.string.eei, new Object[]{Integer.valueOf(d3)});
                C87412m.m108593f(string, "{\n                    co…gCount)\n                }");
                return string;
            }
            String string2 = this.f41252d.getContext().getString(C0966R.string.ed4);
            C87412m.m108593f(string2, "{\n                    co…g_desc)\n                }");
            return string2;
        }
    }

    /* renamed from: wc1.s$c */
    public static final class C15121c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15118s f41253d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15121c(C15118s sVar) {
            super(1);
            this.f41253d = sVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f41253d.mo14389d3(view, C0966R.C0970id.d55);
            if (d3 > 0) {
                String string = this.f41253d.getContext().getString(C0966R.string.eei, new Object[]{Integer.valueOf(d3)});
                C87412m.m108593f(string, "{\n                      …nt)\n                    }");
                return string;
            }
            String string2 = this.f41253d.getContext().getString(C0966R.string.d35);
            C87412m.m108593f(string2, "{\n                      …sc)\n                    }");
            return string2;
        }
    }

    /* renamed from: wc1.s$d */
    public static final class C15122d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15118s f41254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15122d(C15118s sVar) {
            super(1);
            this.f41254d = sVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f41254d.mo14389d3(view, C0966R.C0970id.f358033d40);
            return this.f41254d.getContext().getString(C0966R.string.ee9) + d3;
        }
    }

    /* renamed from: wc1.s$e */
    public static final class C15123e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15118s f41255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15123e(C15118s sVar) {
            super(1);
            this.f41255d = sVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f41255d.mo14389d3(view, C0966R.C0970id.d5g);
            return this.f41255d.getContext().getString(C0966R.string.d8g) + d3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15118s(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.f359095it3).view(C0966R.C0970id.f359095it3).disable();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.jb5);
        root.view(C0966R.C0970id.d5k).desc((C32226l<? super View, String>) new C15119a(this));
        root.view(C0966R.C0970id.f358782h21).desc((C32226l<? super View, String>) new C15120b(this));
        root.view(C0966R.C0970id.jb7).desc((C32226l<? super View, String>) new C15121c(this));
        root(C0966R.C0970id.fep).view(C0966R.C0970id.fep).desc((C32226l<? super View, String>) new C15122d(this));
        root(C0966R.C0970id.fen).view(C0966R.C0970id.fen).desc((C32226l<? super View, String>) new C15123e(this));
    }
}
