package yz2;

import android.view.MenuItem;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI;

/* renamed from: yz2.u */
public final class C53722u implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ StatusAlbumUI f150834d;

    public C53722u(StatusAlbumUI statusAlbumUI) {
        this.f150834d = statusAlbumUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FragmentActivity activity = this.f150834d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}
