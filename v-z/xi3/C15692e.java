package xi3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.List;
import z04.C112550d0;

/* renamed from: xi3.e */
public final class C15692e extends MMBaseAccessibilityConfig {

    /* renamed from: xi3.e$a */
    public static final class C15693a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15692e f42387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15693a(C15692e eVar) {
            super(1);
            this.f42387d = eVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((TextView) view.findViewById(C0966R.C0970id.ko4)).getText().toString();
            View findViewById = view.findViewById(C0966R.C0970id.h7k);
            String string = this.f42387d.getString(C0966R.string.f7372ec);
            Object[] objArr = new Object[2];
            objArr[0] = obj2;
            objArr[1] = findViewById.getVisibility() == 0 ? this.f42387d.getString(C0966R.string.bvl) : "";
            String format = String.format(string, Arrays.copyOf(objArr, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: xi3.e$b */
    public static final class C15694b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C15694b f42388d = new C15694b();

        public C15694b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return Boolean.valueOf(((TextView) view.findViewById(C0966R.C0970id.ko4)).getText().toString().length() == 0);
        }
    }

    /* renamed from: xi3.e$c */
    public static final class C15695c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15692e f42389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15695c(C15692e eVar) {
            super(1);
            this.f42389d = eVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) ((ViewGroup) view).findViewById(C0966R.C0970id.b77)).getText();
            C87412m.m108593f(text, "it as ViewGroup).findVie…                    .text");
            List U = C112550d0.m153785U(text, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
            if (U.size() != 2) {
                return this.f42389d.getString(C0966R.string.me9);
            }
            String format = String.format(this.f42389d.getString(C0966R.string.me8), Arrays.copyOf(new Object[]{U.get(0), U.get(1)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: xi3.e$d */
    public static final class C15696d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15692e f42390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15696d(C15692e eVar) {
            super(1);
            this.f42390d = eVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) ((ViewGroup) view).findViewById(C0966R.C0970id.b77)).getText();
            C87412m.m108593f(text, "it as ViewGroup).findVie…                    .text");
            List U = C112550d0.m153785U(text, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
            if (U.size() != 2) {
                return this.f42390d.getString(C0966R.string.me9);
            }
            String format = String.format(this.f42390d.getString(C0966R.string.me8), Arrays.copyOf(new Object[]{U.get(0), U.get(1)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15692e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f6950t5).view(C0966R.C0970id.ib7).descFormat(C0966R.string.gwl).valueByView(C0966R.C0970id.b3g).valueByKey("quote_img");
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6921s_);
        root.view(C0966R.C0970id.b47).desc((int) C0966R.C0970id.kmm);
        root.view(C0966R.C0970id.fnk).desc((int) C0966R.string.a_r);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.f6934sm);
        root2.view(C0966R.C0970id.f6121xw).disable();
        root2.view(C0966R.C0970id.f6122xx).disable();
        root2.view(C0966R.C0970id.b47).disable();
        root2.view(C0966R.C0970id.f6124xz).desc((int) C0966R.string.b_r);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.f6883r5);
        root3.view(C0966R.C0970id.f6121xw).disable();
        root3.view(C0966R.C0970id.f6122xx).disable();
        root3.view(C0966R.C0970id.b47).disable();
        root3.view(C0966R.C0970id.f6124xz).desc((int) C0966R.string.b_r);
        root(C0966R.C0971layout.f6301b3).view(C0966R.C0970id.ko7).desc((C32226l<? super View, String>) new C15693a(this)).disable(C15694b.f42388d);
        root(C0966R.C0971layout.f6964tj).view(C0966R.C0970id.b47).desc((C32226l<? super View, String>) new C15695c(this));
        root(C0966R.C0971layout.f6915s4).view(C0966R.C0970id.b47).desc((C32226l<? super View, String>) new C15696d(this));
        root(C0966R.C0971layout.f6889ra).view(C0966R.C0970id.b47).descFormat(C0966R.string.m66).valueByView(C0966R.C0970id.b6g);
        root(C0966R.C0971layout.f6939sr).view(C0966R.C0970id.b47).descFormat(C0966R.string.m66).valueByView(C0966R.C0970id.b6g);
        root(C0966R.C0971layout.f6931sj).view(C0966R.C0970id.b47).desc((int) C0966R.C0970id.b3p);
        root(C0966R.C0971layout.f6880r2).view(C0966R.C0970id.b47).desc((int) C0966R.C0970id.b3p);
        root(C0966R.C0971layout.cue).view(C0966R.C0970id.jad).type(ViewType.Button).desc((int) C0966R.string.bfj);
        root(C0966R.C0970id.f6197hp).view(C0966R.C0970id.b46).clickAs(C0966R.C0970id.b7h);
    }
}
