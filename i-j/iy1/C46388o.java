package iy1;

import android.view.MenuItem;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import nj3.C11184p0;

/* renamed from: iy1.o */
public final class C46388o implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124985d;

    public C46388o(PostCommentDialogUI postCommentDialogUI) {
        this.f124985d = postCommentDialogUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1001) {
            PostCommentDialogUI postCommentDialogUI = this.f124985d;
            postCommentDialogUI.f113155u = null;
            postCommentDialogUI.mo65912R7((IEmojiInfo) null);
        }
    }
}
