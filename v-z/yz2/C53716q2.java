package yz2;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: yz2.q2 */
public final class C53716q2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53700n2 f150823d;

    public C53716q2(C53700n2 n2Var) {
        this.f150823d = n2Var;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AppCompatActivity activity = this.f150823d.getActivity();
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity == null) {
            return true;
        }
        mMActivity.onBackPressed();
        return true;
    }
}
