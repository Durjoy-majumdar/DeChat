package ly1;

import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.plugin.game.media.GameGalleryFragment;
import java.util.ArrayList;

/* renamed from: ly1.q */
public class C46911q extends C112968x {

    /* renamed from: i */
    public ArrayList<GameGalleryFragment> f126136i;

    public C46911q(FragmentManager fragmentManager, ArrayList<GameGalleryFragment> arrayList) {
        super(fragmentManager, 0);
        this.f126136i = arrayList;
    }

    public int getCount() {
        return this.f126136i.size();
    }

    public Fragment getItem(int i) {
        ArrayList<GameGalleryFragment> arrayList = this.f126136i;
        return arrayList.get(i % arrayList.size());
    }
}
