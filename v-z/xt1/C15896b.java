package xt1;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xt1.b */
public final class C15896b extends MMBaseAccessibilityConfig {

    /* renamed from: d */
    public String f42774d = "";

    /* renamed from: xt1.b$a */
    public static final class C15897a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C15896b f42775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15897a(C15896b bVar) {
            super(1);
            this.f42775d = bVar;
        }

        public Object invoke(Object obj) {
            boolean z;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String str = this.f42775d.f42774d;
            boolean z2 = view instanceof TextView;
            CharSequence charSequence = null;
            TextView textView = z2 ? (TextView) view : null;
            if (!C87412m.m108589b(str, String.valueOf(textView != null ? textView.getText() : null))) {
                C15896b bVar = this.f42775d;
                TextView textView2 = z2 ? (TextView) view : null;
                if (textView2 != null) {
                    charSequence = textView2.getText();
                }
                String valueOf = String.valueOf(charSequence);
                bVar.getClass();
                bVar.f42774d = valueOf;
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: xt1.b$b */
    public static final class C15898b extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C15896b f42776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15898b(C15896b bVar) {
            super(1);
            this.f42776d = bVar;
        }

        public Object invoke(Object obj) {
            boolean z;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String str = this.f42776d.f42774d;
            boolean z2 = view instanceof TextView;
            CharSequence charSequence = null;
            TextView textView = z2 ? (TextView) view : null;
            if (!C87412m.m108589b(str, String.valueOf(textView != null ? textView.getText() : null))) {
                C15896b bVar = this.f42776d;
                TextView textView2 = z2 ? (TextView) view : null;
                if (textView2 != null) {
                    charSequence = textView2.getText();
                }
                String valueOf = String.valueOf(charSequence);
                bVar.getClass();
                bVar.f42774d = valueOf;
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: xt1.b$c */
    public static final class C15899c extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C15899c f42777d = new C15899c();

        public C15899c() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence charSequence = null;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                charSequence = textView.getText();
            }
            return Boolean.valueOf(!(String.valueOf(charSequence).length() == 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15896b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.a5j).view(C0966R.C0970id.e_t).type(ViewType.Button).desc((int) C0966R.string.bfj);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.a5k);
        root.view(C0966R.C0970id.f358298ea1).talkOn(new C15897a(this));
        root.view(C0966R.C0970id.f358297ea0).talkOn(new C15898b(this));
        root(C0966R.C0971layout.a5l).view(C0966R.C0970id.cq4).talkOn(C15899c.f42777d);
    }
}
