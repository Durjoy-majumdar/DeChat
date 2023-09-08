package vf1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveSelectRoomForLuckMoneyUI;
import java.util.ArrayList;

/* renamed from: vf1.q3 */
public final class C52871q3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveSelectRoomForLuckMoneyUI f147670d;

    public C52871q3(FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI) {
        this.f147670d = finderLiveSelectRoomForLuckMoneyUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FinderLiveSelectRoomForLuckMoneyUI finderLiveSelectRoomForLuckMoneyUI = this.f147670d;
        int i = FinderLiveSelectRoomForLuckMoneyUI.f111548F;
        finderLiveSelectRoomForLuckMoneyUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(finderLiveSelectRoomForLuckMoneyUI.f111550D);
        Intent intent = new Intent();
        intent.putStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", arrayList);
        finderLiveSelectRoomForLuckMoneyUI.setResult(-1, intent);
        finderLiveSelectRoomForLuckMoneyUI.finish();
        finderLiveSelectRoomForLuckMoneyUI.mo64525g8();
        finderLiveSelectRoomForLuckMoneyUI.mo103379N7().notifyDataSetChanged();
        return true;
    }
}
