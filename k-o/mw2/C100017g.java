package mw2;

import android.view.MenuItem;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.plugin.story.p108ui.album.StoryAlbumUI;

/* renamed from: mw2.g */
public final class C100017g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ StoryAlbumUI f293034d;

    public C100017g(StoryAlbumUI storyAlbumUI) {
        this.f293034d = storyAlbumUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FragmentActivity activity = this.f293034d.getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }
}
