package an2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.plugin.setting.p102ui.widget.FontSelectorView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import rx3.C13598b0;

/* renamed from: an2.b */
public final class C54144b extends MMBaseAccessibilityConfig {

    /* renamed from: an2.b$a */
    public static final class C54145a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ String f152071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54145a(String str) {
            super(1);
            this.f152071d = str;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            FontSelectorView fontSelectorView = view instanceof FontSelectorView ? (FontSelectorView) view : null;
            if (fontSelectorView == null) {
                return "";
            }
            String format = String.format(this.f152071d, Arrays.copyOf(new Object[]{Integer.valueOf(fontSelectorView.getSliderIndex() + 1)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: an2.b$b */
    public static final class C54146b extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C54146b f152072d = new C54146b();

        public C54146b() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            FontSelectorView fontSelectorView = view instanceof FontSelectorView ? (FontSelectorView) view : null;
            if (fontSelectorView != null) {
                fontSelectorView.setSliderIndex(fontSelectorView.getSliderIndex() - 1);
                fontSelectorView.requestLayout();
                view.announceForAccessibility(String.valueOf(fontSelectorView.getSliderIndex() + 1));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: an2.b$c */
    public static final class C54147c extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C54147c f152073d = new C54147c();

        public C54147c() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            FontSelectorView fontSelectorView = view instanceof FontSelectorView ? (FontSelectorView) view : null;
            if (fontSelectorView != null) {
                fontSelectorView.setSliderIndex(fontSelectorView.getSliderIndex() + 1);
                fontSelectorView.requestLayout();
                view.announceForAccessibility(String.valueOf(fontSelectorView.getSliderIndex() + 1));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54144b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        view(C0966R.C0971layout.bxd, C0966R.C0970id.ecw).type(ViewType.SeekBar).desc((C32226l<? super View, String>) new C54145a(getString(C0966R.string.io7))).onSeekBackward(C54146b.f152072d).onSeekForward(C54147c.f152073d);
    }
}
