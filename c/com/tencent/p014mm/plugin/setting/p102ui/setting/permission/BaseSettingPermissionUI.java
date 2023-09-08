package com.tencent.p014mm.plugin.setting.p102ui.setting.permission;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import en2.C7767a;
import en2.C7768b;
import en2.C7769c;
import gy3.C87412m;
import in3.C87771d;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C88989a;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lin3/d$b;", "mStatusBarHeightCallback", "Lin3/d$b;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI */
public abstract class BaseSettingPermissionUI extends MMActivity {
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: H7 */
    public abstract int mo6369H7();

    /* renamed from: I7 */
    public abstract int mo6370I7();

    /* renamed from: J7 */
    public abstract int mo6371J7();

    public int getLayoutId() {
        return C0966R.C0971layout.cm7;
    }

    public void onCreate(Bundle bundle) {
        ScrollView scrollView;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(getResources().getColor(C0966R.color.f2929c));
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        setMMTitle("");
        View findViewById = findViewById(C0966R.C0970id.a2w);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C7769c(this));
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.knx);
        if (textView != null) {
            textView.setText(getString(mo6371J7()));
        }
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.knx)).getPaint(), 0.8f);
        ((FrameLayout) findViewById(C0966R.C0970id.kof)).setPadding(0, C75044y4.m89994f(getContext()), 0, 0);
        ((ScrollView) findViewById(C0966R.C0970id.j4b)).addView(C85868k2.m106137b(this).inflate(mo6369H7(), (ViewGroup) null));
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.mgm);
        if (textView2 != null) {
            textView2.setText(getString(mo6371J7()));
        }
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.mgm)).getPaint(), 0.8f);
        supportLightStatusBar();
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.m6t);
        if (textView3 != null) {
            textView3.setGravity(17);
            String string = getString(mo6370I7());
            C87412m.m108593f(string, "getString(getPermissionDesc())");
            String string2 = getString(C0966R.string.lxa);
            C87412m.m108593f(string2, "getString(R.string.setti…rlay_desc_default_suffix)");
            String string3 = getString(C0966R.string.lxb);
            C87412m.m108593f(string3, "getString(R.string.setti…c_default_suffix_replace)");
            String str = string + string2;
            int E = C112550d0.m153769E(str, string3, 0, false, 6, (Object) null);
            int length = string3.length() + E;
            if (E <= 0 || length >= str.length()) {
                textView3.setText(str);
            } else {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new C7767a(this), E, length, 33);
                textView3.setText(spannableString);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (scrollView = (ScrollView) findViewById(C0966R.C0970id.j4b)) != null) {
            scrollView.setOnScrollChangeListener(new C7768b(C76577a.m92151b(getContext(), 64), (TextView) findViewById(C0966R.C0970id.knx)));
        }
    }
}
