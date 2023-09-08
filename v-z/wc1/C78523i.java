package wc1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: wc1.i */
public final class C78523i extends C15085j {

    /* renamed from: wc1.i$a */
    public static final class C78524a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78523i f230008d;

        /* renamed from: e */
        public final /* synthetic */ Context f230009e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78524a(C78523i iVar, Context context) {
            super(1);
            this.f230008d = iVar;
            this.f230009e = context;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f230008d.mo14390e3(view, C0966R.C0970id.f358038d51);
            String string = this.f230009e.getString(C0966R.string.e99, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…ask_banner_desc, wording)");
            return string;
        }
    }

    /* renamed from: wc1.i$b */
    public static final class C78525b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78523i f230010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78525b(C78523i iVar) {
            super(1);
            this.f230010d = iVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return this.f230010d.mo14390e3(view, C0966R.C0970id.f358036d43).toString();
        }
    }

    /* renamed from: wc1.i$c */
    public static final class C78526c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ Context f230011d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78526c(Context context) {
            super(1);
            this.f230011d = context;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f230011d.getString(C0966R.string.di8, new Object[]{1});
            C87412m.m108593f(string, "context.getString(com.te…_beauty_powerful_desc, 1)");
            return string;
        }
    }

    /* renamed from: wc1.i$d */
    public static final class C78527d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ Context f230012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78527d(Context context) {
            super(1);
            this.f230012d = context;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f230012d.getString(C0966R.string.di8, new Object[]{2});
            C87412m.m108593f(string, "context.getString(com.te…_beauty_powerful_desc, 2)");
            return string;
        }
    }

    /* renamed from: wc1.i$e */
    public static final class C78528e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ Context f230013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78528e(Context context) {
            super(1);
            this.f230013d = context;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            String string = this.f230013d.getString(C0966R.string.di8, new Object[]{3});
            C87412m.m108593f(string, "context.getString(com.te…_beauty_powerful_desc, 3)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78523i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        super.initConfig();
        Context context = MMApplicationContext.getContext();
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.das);
        root.view(C0966R.C0970id.jjn).desc((int) C0966R.string.f360691e80);
        root.view(C0966R.C0970id.db_).desc((int) C0966R.string.dqm);
        root.view(C0966R.C0970id.g7p).desc((int) C0966R.string.dtg);
        root.view(C0966R.C0970id.dh5).desc((int) C0966R.string.di7);
        root.view(C0966R.C0970id.h6c).desc((int) C0966R.string.dyj);
        root.view(C0966R.C0970id.dcd).desc((int) C0966R.string.duq);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.dvx);
        root2.view(C0966R.C0970id.dwg).desc((int) C0966R.string.djb);
        ViewSetter desc = root2.view(C0966R.C0970id.dvu).desc((int) C0966R.string.dng);
        ViewType viewType = ViewType.TextView;
        desc.type(viewType);
        root2.view(C0966R.C0970id.dwi).desc((int) C0966R.string.dy7).type(viewType);
        root2.view(C0966R.C0970id.e07).desc((C32226l<? super View, String>) new C78524a(this, context)).expand(12, 12, 12, 12).type(viewType);
        root2.view(C0966R.C0970id.dvp).desc((int) C0966R.string.e2a);
        root2.view(C0966R.C0970id.dvw).desc((int) C0966R.string.e2b).disableChildren();
        root2.view(C0966R.C0970id.f358233e00).expand(12, 4, 12, 4).descFormat(C0966R.string.f360667e30).valueByView(C0966R.C0970id.f358234e01).type(viewType);
        root2.view(C0966R.C0970id.f358240e12).expand(12, 4, 12, 4);
        root2.view(C0966R.C0970id.dr6).expand(12, 4, 12, 4);
        root2.view(C0966R.C0970id.i0b).expand(12, 4, 12, 4);
        ViewSetter view = root2.view(C0966R.C0970id.dgm);
        ViewType viewType2 = ViewType.Button;
        view.type(viewType2).desc((C32226l<? super View, String>) new C78525b(this));
        root2.view(C0966R.C0970id.dvv).desc((int) C0966R.string.e2g);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.dih);
        root3.view(C0966R.C0970id.di6).descFormat(C0966R.string.dn4).valueByView(C0966R.C0970id.di8).disableChildren();
        root3.view(C0966R.C0970id.di9).descFormat(C0966R.string.dn4).valueByView(C0966R.C0970id.dia).disableChildren();
        root3.view(C0966R.C0970id.dib).descFormat(C0966R.string.dn4).valueByView(C0966R.C0970id.did).disableChildren();
        root3.view(C0966R.C0970id.die).descFormat(C0966R.string.dn4).valueByView(C0966R.C0970id.dig).disableChildren();
        root3.view(C0966R.C0970id.n9e).descFormat(C0966R.string.e0l).valueByView(C0966R.C0970id.n9f).disableChildren();
        focusOrder().next((int) C0966R.C0970id.di6).next((int) C0966R.C0970id.di9).next((int) C0966R.C0970id.dib).next((int) C0966R.C0970id.die).next((int) C0966R.C0970id.n9e);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0970id.dh7);
        root4.view(C0966R.C0970id.dh7).disable();
        root4.view(C0966R.C0970id.dhm).desc((C32226l<? super View, String>) new C78526c(context));
        root4.view(C0966R.C0970id.dhn).desc((C32226l<? super View, String>) new C78527d(context));
        root4.view(C0966R.C0970id.dho).desc((C32226l<? super View, String>) new C78528e(context));
        root4.view(C0966R.C0970id.dfy).desc((int) C0966R.string.e6h).type(viewType2);
        root4.view(C0966R.C0970id.f358107dg2).disable();
        root(C0966R.C0970id.frf).view(C0966R.C0970id.frf).disableChildren().clickAs(C0966R.C0970id.g0d).desc((int) C0966R.string.djc);
        MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0970id.dcb);
        root5.view(C0966R.C0970id.e0b).desc((int) C0966R.string.dgt);
        root5.view(C0966R.C0970id.e0e).desc((int) C0966R.string.dfm);
        root5.view(C0966R.C0970id.dbm).desc((int) C0966R.string.djb);
        root5.view(C0966R.C0970id.dbr).descFormat(C0966R.string.dn4).valueByView(C0966R.C0970id.dbs).disableChildren();
        focusOrder().next((int) C0966R.C0970id.dbr).next((int) C0966R.C0970id.dc5);
        MMBaseAccessibilityConfig.ConfigHelper root6 = root(C0966R.C0970id.f358092dd0);
        root6.view(C0966R.C0970id.dtm).desc((int) C0966R.string.dgx);
        root6.view(C0966R.C0970id.lds).desc((int) C0966R.string.dym);
        root6.view(C0966R.C0970id.grr).desc((int) C0966R.string.dyk).type(viewType);
        root6.view(C0966R.C0970id.f5578iw).desc((int) C0966R.string.dyh).type(viewType);
        root(C0966R.C0970id.djp).view(C0966R.C0970id.dcw).desc((int) C0966R.string.dyn);
    }
}
