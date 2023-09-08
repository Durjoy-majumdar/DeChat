package v52;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

/* renamed from: v52.a */
public final class C14408a extends MMBaseAccessibilityConfig {

    /* renamed from: v52.a$a */
    public static final class C14409a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C14409a f39996d = new C14409a();

        public C14409a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return ((TextView) view).getText().toString();
        }
    }

    /* renamed from: v52.a$b */
    public static final class C14410b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C14408a f39997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14410b(C14408a aVar) {
            super(1);
            this.f39997d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence text = ((TextView) view.findViewById(C0966R.C0970id.glt)).getText();
            CharSequence text2 = ((TextView) view.findViewById(C0966R.C0970id.gln)).getText();
            if (((ImageView) view.findViewById(C0966R.C0970id.hdt)).getVisibility() == 0) {
                return text + ',' + text2 + ',' + this.f39997d.getString(C0966R.string.kz5);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(',');
            sb.append(text2);
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14408a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.ba9);
        ViewSetter view = root.view(C0966R.C0970id.gtv);
        ViewType viewType = ViewType.Button;
        view.type(viewType).desc((int) C0966R.string.ku8);
        root.view(C0966R.C0970id.gtz).type(viewType).descFormat(C0966R.string.l9y).valueByView(C0966R.C0970id.f358746gu1).valueByView(C0966R.C0970id.lfm).valueByView(C0966R.C0970id.gua);
        root.focusFirst(C0966R.C0970id.gtv);
        root.disable(C0966R.C0970id.f358746gu1);
        root.disable(C0966R.C0970id.lfm);
        root.disable(C0966R.C0970id.gua);
        root.disable(C0966R.C0970id.lfl);
        root(C0966R.C0971layout.bgl).disable(C0966R.C0970id.gua);
        root(C0966R.C0971layout.b_z).view(C0966R.C0970id.glj).desc((C32226l<? super View, String>) C14409a.f39996d);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.ba6);
        root2.view(C0966R.C0970id.glr).type(viewType).desc((C32226l<? super View, String>) new C14410b(this));
        root2.disable(C0966R.C0970id.glq);
        root(C0966R.C0971layout.f6299b1).view(C0966R.C0970id.f5421eo).desc((int) C0966R.string.kzi);
    }
}
