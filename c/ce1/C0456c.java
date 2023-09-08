package ce1;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import od1.C11397c;
import te3.C51270sn1;

/* renamed from: ce1.c */
public final class C0456c extends C11397c<C51270sn1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0456c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        super.mo498c3(i, str);
        ImageView imageView = this.f33541g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ViewGroup viewGroup = this.f33543i;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
