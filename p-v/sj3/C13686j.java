package sj3;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;

/* renamed from: sj3.j */
public class C13686j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatFavUI f38734d;

    public C13686j(BizChatFavUI bizChatFavUI) {
        this.f38734d = bizChatFavUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f38734d.finish();
        return true;
    }
}
