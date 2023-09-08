package ud1;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import od1.C11397c;
import te3.C51270sn1;

/* renamed from: ud1.b */
public final class C14156b extends C11397c<C51270sn1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14156b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: k3 */
    public void mo11406k3() {
    }

    /* renamed from: l3 */
    public void mo312l3(boolean z) {
        super.mo312l3(z);
        ViewGroup viewGroup = this.f33543i;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ImageView imageView = this.f33541g;
        if (imageView != null) {
            imageView.setBackgroundColor(getResources().getColor(C0966R.color.al9));
        }
    }
}
