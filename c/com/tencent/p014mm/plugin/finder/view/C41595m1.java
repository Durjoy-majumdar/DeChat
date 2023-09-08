package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.finder.view.m1 */
public final class C41595m1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentFooter f111963d;

    public C41595m1(FinderCommentFooter finderCommentFooter) {
        this.f111963d = finderCommentFooter;
    }

    public final void run() {
        FinderCommentFooter finderCommentFooter = this.f111963d;
        int i = FinderCommentFooter.f162048Q;
        finderCommentFooter.getEditText().requestFocus();
        if (finderCommentFooter.getContext() instanceof MMActivity) {
            Context context = finderCommentFooter.getContext();
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.showVKB();
                return;
            }
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) finderCommentFooter.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(finderCommentFooter.getEditText(), 0);
        }
    }
}
