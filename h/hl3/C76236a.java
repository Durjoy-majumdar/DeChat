package hl3;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.contact.privacy.CommonSelectChatRoomUI;

/* renamed from: hl3.a */
public class C76236a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CommonSelectChatRoomUI f223332d;

    public C76236a(CommonSelectChatRoomUI commonSelectChatRoomUI) {
        this.f223332d = commonSelectChatRoomUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f223332d.finish();
        return false;
    }
}
