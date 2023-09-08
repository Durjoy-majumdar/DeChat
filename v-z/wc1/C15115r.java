package wc1;

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

/* renamed from: wc1.r */
public final class C15115r extends C15641a {

    /* renamed from: wc1.r$a */
    public static final class C15116a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15115r f41249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15116a(C15115r rVar) {
            super(1);
            this.f41249d = rVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41249d.mo14390e3(view, C0966R.C0970id.d3o);
            String string = this.f41249d.getContext().getString(C0966R.string.en7, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…story_item_desc, content)");
            return string;
        }
    }

    /* renamed from: wc1.r$b */
    public static final class C15117b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15115r f41250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15117b(C15115r rVar) {
            super(1);
            this.f41250d = rVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41250d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f41250d.mo14390e3(view, C0966R.C0970id.f358033d40);
            CharSequence e36 = this.f41250d.mo14390e3(view, C0966R.C0970id.d3o);
            int d3 = this.f41250d.mo14389d3(view, C0966R.C0970id.d3i);
            int d35 = this.f41250d.mo14389d3(view, C0966R.C0970id.f358039d52);
            C15064b bVar = C15064b.f41199a;
            CharSequence b = bVar.mo14077b(this.f41250d.getContext(), d3);
            CharSequence d = bVar.mo14079d(this.f41250d.getContext(), d35);
            if (((String) d).length() == 0) {
                return "";
            }
            String string = this.f41250d.getContext().getString(C0966R.string.f360454cy3);
            C87412m.m108593f(string, "context.getString(com.te…tring.finder_action_like)");
            String string2 = this.f41250d.getContext().getString(C0966R.string.emw, new Object[]{e3, d, b, string, e35, e36});
            C87412m.m108593f(string2, "context.getString(com.te… action, likeCount, desc)");
            return string2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15115r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.e6s).view(C0966R.C0970id.ber).desc((int) C0966R.string.d3e);
        root(C0966R.C0970id.e6s).view(C0966R.C0970id.e6s).desc((C32226l<? super View, String>) new C15116a(this));
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.h0a);
        root.view(C0966R.C0970id.h0a).desc((int) C0966R.string.esc);
        root.view(C0966R.C0970id.f358769gz2).desc((int) C0966R.string.ecl);
        root(C0966R.C0970id.e3_).view(C0966R.C0970id.e3_).desc((C32226l<? super View, String>) new C15117b(this)).disableChildren();
        focusFirst(C0966R.C0970id.h0a);
        focusOrder().next((int) C0966R.C0970id.h0a).next((int) C0966R.C0970id.f358769gz2).next((int) C0966R.C0970id.ewk).next((int) C0966R.C0970id.k_t);
    }
}
