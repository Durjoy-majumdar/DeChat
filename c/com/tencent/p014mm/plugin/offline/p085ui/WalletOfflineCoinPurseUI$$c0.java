package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import fy3.C32226l;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$c0 */
public class WalletOfflineCoinPurseUI$$c0 extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$c0$a */
    public class C69975a implements C32226l<View, String> {
        public C69975a() {
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            TextView textView = (TextView) WalletOfflineCoinPurseUI$$c0.this.findViewById(C0966R.C0970id.gl9);
            TextView textView2 = (TextView) WalletOfflineCoinPurseUI$$c0.this.findViewById(C0966R.C0970id.k9q);
            if (textView == null || textView2 == null) {
                return "";
            }
            return textView.getText().toString() + textView2.getText().toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$c0$b */
    public class C69976b implements C32226l<View, String> {
        public C69976b() {
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            TextView textView = (TextView) WalletOfflineCoinPurseUI$$c0.this.findViewById(C0966R.C0970id.ljr);
            TextView textView2 = (TextView) WalletOfflineCoinPurseUI$$c0.this.findViewById(C0966R.C0970id.ljq);
            StringBuilder sb = new StringBuilder();
            if (textView != null) {
                sb.append(textView.getText());
            }
            if (textView2 != null) {
                sb.append(textView2.getText());
            }
            return sb.toString();
        }
    }

    public WalletOfflineCoinPurseUI$$c0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    /* renamed from: c3 */
    public void mo96316c3() {
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.hl7);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0966R.C0970id.ljd);
        if (viewGroup != null && viewGroup2 != null) {
            if (viewGroup.isShown()) {
                viewGroup.setImportantForAccessibility(1);
                viewGroup2.setImportantForAccessibility(4);
                return;
            }
            viewGroup.setImportantForAccessibility(2);
            viewGroup2.setImportantForAccessibility(1);
        }
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.hlb);
        root.disable(C0966R.C0970id.hl9);
        focusFirst(C0966R.C0970id.lhe);
        focusOrder().next((int) C0966R.C0970id.lhe);
        root.view(C0966R.C0970id.lfi).desc((int) C0966R.string.la8).clickAs(C0966R.C0970id.lfj);
        root.view(C0966R.C0970id.ljc).type(ViewType.TextView);
        root.view(C0966R.C0970id.hlg).desc((int) C0966R.string.hen);
        root.view(C0966R.C0970id.kmi).desc((int) C0966R.string.kzo);
        root.view(C0966R.C0970id.f358860hh0).desc((int) C0966R.string.kzu);
        ViewSetter view = root.view(C0966R.C0970id.kew);
        ViewType viewType = ViewType.Button;
        view.type(viewType);
        root.view(C0966R.C0970id.krl).desc((C32226l<? super View, String>) new C69975a());
        root.view(C0966R.C0970id.lhg).desc((int) C0966R.string.he7).type(viewType);
        root.view(C0966R.C0970id.lhm).desc((int) C0966R.string.hpj).type(viewType);
        root.view(C0966R.C0970id.lhc).desc((int) C0966R.string.g4s).type(viewType);
        root.view(C0966R.C0970id.lhh).desc((int) C0966R.string.ggj).type(viewType);
        root.view(C0966R.C0970id.lhd).desc((int) C0966R.string.agw).type(viewType);
        root.view(C0966R.C0970id.ljp).desc((C32226l<? super View, String>) new C69976b()).type(viewType);
    }

    public void onResume() {
        super.onResume();
        mo96316c3();
    }
}
