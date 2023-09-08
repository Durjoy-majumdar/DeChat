package td1;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import rd1.C12972a;

/* renamed from: td1.a */
public final class C13872a extends C12972a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13872a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        mo12503b();
    }

    /* renamed from: a */
    public void mo12502a(int i, String str) {
        TextView textView = this.f36998d;
        if (textView != null) {
            if (str == null) {
                str = this.f36995a.getResources().getString(C0966R.string.fzi);
            }
            textView.setText(str);
        }
        TextView textView2 = this.f36999e;
        if (textView2 != null) {
            textView2.setText(this.f36995a.getResources().getString(C0966R.string.fzj));
        }
        Button button = this.f36996b;
        if (button != null) {
            button.setTextColor(this.f36995a.getResources().getColor(C0966R.color.Brand_BG_100));
        }
    }
}
