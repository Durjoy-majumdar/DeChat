package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.j0 */
public final class C6182j0 extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.j0$a */
    public static final class C6183a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C6182j0 f22652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6183a(C6182j0 j0Var) {
            super(1);
            this.f22652d = j0Var;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.a2d);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.a1y);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.a2g);
            String str = "";
            CharSequence text = textView.getVisibility() == 0 ? textView.getText() : str;
            CharSequence text2 = textView2.getVisibility() == 0 ? textView2.getText() : str;
            if (imageView.getVisibility() == 0) {
                str = this.f22652d.getContext().getResources().getString(C0966R.string.ik7);
            }
            C87412m.m108593f(str, "if (avatarStateIcon.visi….selected_Imgbtn) else \"\"");
            return text + 65292 + text2 + 65292 + str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6182j0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0971layout.f6532hf).view(C0966R.C0970id.a26).desc((C32226l<? super View, String>) new C6183a(this));
    }
}
