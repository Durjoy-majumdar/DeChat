package q92;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;

/* renamed from: q92.a */
public final class C47789a extends MMBaseAccessibilityConfig {

    /* renamed from: q92.a$a */
    public static final class C47790a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C47789a f128327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47790a(C47789a aVar) {
            super(1);
            this.f128327d = aVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((TextView) view.findViewById(C0966R.C0970id.h3n)).getText().toString();
            String obj3 = ((TextView) view.findViewById(C0966R.C0970id.h3p)).getText().toString();
            Object tag = view.getTag(C0966R.C0970id.h5e);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            String format = String.format(this.f128327d.getString(C0966R.string.h1i), Arrays.copyOf(new Object[]{this.f128327d.mo72567c3(num != null ? num.intValue() : 0), obj3, obj2}, 3));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: q92.a$b */
    public static final class C47791b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C47789a f128328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47791b(C47789a aVar) {
            super(1);
            this.f128328d = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Integer} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9) {
            /*
                r8 = this;
                android.view.View r9 = (android.view.View) r9
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r9, r0)
                android.view.ViewParent r0 = r9.getParent()
                android.view.ViewParent r0 = r0.getParent()
                boolean r1 = r0 instanceof android.view.View
                r2 = 0
                if (r1 == 0) goto L_0x0017
                android.view.View r0 = (android.view.View) r0
                goto L_0x0018
            L_0x0017:
                r0 = r2
            L_0x0018:
                if (r0 == 0) goto L_0x002a
                r1 = 2131309666(0x7f093462, float:1.8237622E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                if (r0 == 0) goto L_0x002a
                java.lang.CharSequence r0 = r0.getText()
                goto L_0x002b
            L_0x002a:
                r0 = r2
            L_0x002b:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                android.view.ViewParent r1 = r9.getParent()
                android.view.ViewParent r1 = r1.getParent()
                boolean r3 = r1 instanceof android.view.View
                if (r3 == 0) goto L_0x003e
                android.view.View r1 = (android.view.View) r1
                goto L_0x003f
            L_0x003e:
                r1 = r2
            L_0x003f:
                if (r1 == 0) goto L_0x0051
                r3 = 2131309668(0x7f093464, float:1.8237626E38)
                android.view.View r1 = r1.findViewById(r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r1 == 0) goto L_0x0051
                java.lang.CharSequence r1 = r1.getText()
                goto L_0x0052
            L_0x0051:
                r1 = r2
            L_0x0052:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3 = 2131309741(0x7f0934ad, float:1.8237774E38)
                java.lang.Object r9 = r9.getTag(r3)
                boolean r3 = r9 instanceof java.lang.Integer
                if (r3 == 0) goto L_0x0064
                r2 = r9
                java.lang.Integer r2 = (java.lang.Integer) r2
            L_0x0064:
                r9 = 0
                if (r2 == 0) goto L_0x006c
                int r2 = r2.intValue()
                goto L_0x006d
            L_0x006c:
                r2 = 0
            L_0x006d:
                q92.a r3 = r8.f128328d
                r4 = 2131833271(0x7f1131b7, float:1.929962E38)
                java.lang.String r3 = r3.getString(r4)
                r4 = 4
                java.lang.Object[] r5 = new java.lang.Object[r4]
                q92.a r6 = r8.f128328d
                r7 = 2131823850(0x7f110cea, float:1.9280511E38)
                java.lang.String r6 = r6.getString(r7)
                r5[r9] = r6
                r9 = 1
                q92.a r6 = r8.f128328d
                java.lang.String r2 = r6.mo72567c3(r2)
                r5[r9] = r2
                r9 = 2
                r5[r9] = r1
                r9 = 3
                r5[r9] = r0
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r5, r4)
                java.lang.String r9 = java.lang.String.format(r3, r9)
                java.lang.String r0 = "format(format, *args)"
                gy3.C87412m.m108593f(r9, r0)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q92.C47789a.C47791b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47789a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final String mo72567c3(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 8 ? i != 22 ? "" : getString(C0966R.string.gsl) : getString(C0966R.string.gsk) : getString(C0966R.string.gsm) : getString(C0966R.string.gsd) : getString(C0966R.string.gsh) : getString(C0966R.string.gsm) : getString(C0966R.string.gsc);
    }

    public void initConfig() {
        root(C0966R.C0971layout.bi9).view(C0966R.C0970id.h5l).desc((int) C0966R.string.h1k);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.bbn);
        root.view(C0966R.C0970id.fa8).desc((C32226l<? super View, String>) new C47790a(this));
        root.view(C0966R.C0970id.h3j).desc((C32226l<? super View, String>) new C47791b(this));
    }
}
