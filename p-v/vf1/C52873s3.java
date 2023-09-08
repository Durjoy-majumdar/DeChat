package vf1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveSelectRoomUI;
import java.util.ArrayList;

/* renamed from: vf1.s3 */
public final class C52873s3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSelectRoomUI f147672d;

    public C52873s3(FinderLiveSelectRoomUI finderLiveSelectRoomUI) {
        this.f147672d = finderLiveSelectRoomUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FinderLiveSelectRoomUI finderLiveSelectRoomUI = this.f147672d;
        int i = FinderLiveSelectRoomUI.f111552D;
        finderLiveSelectRoomUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(finderLiveSelectRoomUI.f111553C);
        Intent intent = new Intent();
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM", arrayList);
        finderLiveSelectRoomUI.setResult(-1, intent);
        finderLiveSelectRoomUI.finish();
        finderLiveSelectRoomUI.mo64527g8();
        finderLiveSelectRoomUI.mo103379N7().notifyDataSetChanged();
        return true;
    }
}
