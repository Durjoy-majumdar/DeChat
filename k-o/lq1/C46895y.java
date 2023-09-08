package lq1;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;

/* renamed from: lq1.y */
public final class C46895y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ UniCommentFooter f126101d;

    public C46895y(UniCommentFooter uniCommentFooter) {
        this.f126101d = uniCommentFooter;
    }

    public final void run() {
        UniCommentFooter uniCommentFooter = this.f126101d;
        int i = UniCommentFooter.f161411J;
        uniCommentFooter.getEditText().requestFocus();
        if (uniCommentFooter.getContext() instanceof MMActivity) {
            Context context = uniCommentFooter.getContext();
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.showVKB();
                return;
            }
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) uniCommentFooter.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(uniCommentFooter.getEditText(), 0);
        }
    }
}
