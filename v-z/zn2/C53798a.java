package zn2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: zn2.a */
public final class C53798a extends MMBaseAccessibilityConfig {

    /* renamed from: zn2.a$a */
    public static final class C53799a extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C53799a f150968d = new C53799a();

        public C53799a() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
            View view = (View) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            if (view.getTag(C0966R.C0970id.f5699m7) != null) {
                view.setTag(C0966R.C0970id.f5699m7, (Object) null);
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
            return valueOf;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53798a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility");
        root(C0966R.C0971layout.c2k).view(C0966R.C0970id.f5699m7).talkOn(C0966R.string.jgv, C53799a.f150968d);
        SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility");
    }
}
