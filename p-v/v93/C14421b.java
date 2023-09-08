package v93;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import z04.C112551y;

/* renamed from: v93.b */
public final class C14421b extends C14419a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14421b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public int mo13711g3() {
        return C0966R.C0971layout.d_3;
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        String stringExtra = getIntent().getStringExtra("ftsQuery");
        if (stringExtra != null && !C112551y.m153811k(stringExtra)) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.evd);
            if (textView != null) {
                textView.setText(stringExtra);
                C85875k4.m106191k0(textView.getPaint());
            }
            View findViewById = findViewById(C0966R.C0970id.oei);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUICForMore", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUICForMore", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
