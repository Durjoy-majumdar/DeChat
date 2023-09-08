package yz2;

import android.view.MenuItem;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusHistoryUI;

/* renamed from: yz2.g2 */
public final class C53676g2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusHistoryUI f150753d;

    public C53676g2(TextStatusHistoryUI textStatusHistoryUI) {
        this.f150753d = textStatusHistoryUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FragmentActivity activity = this.f150753d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}
