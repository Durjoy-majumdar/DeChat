package com.tencent.p014mm.plugin.finder.live.view;

import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.live.view.j0 */
public final class C56071j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveExtendReadingEditView f159899d;

    /* renamed from: e */
    public final /* synthetic */ InputMethodManager f159900e;

    public C56071j0(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView, InputMethodManager inputMethodManager) {
        this.f159899d = finderLiveExtendReadingEditView;
        this.f159900e = inputMethodManager;
    }

    public final void run() {
        FinderLiveExtendReadingEditView finderLiveExtendReadingEditView = this.f159899d;
        MMEditText mMEditText = finderLiveExtendReadingEditView.f159714h;
        if (mMEditText != null) {
            mMEditText.requestFocus();
            MMEditText mMEditText2 = finderLiveExtendReadingEditView.f159714h;
            if (mMEditText2 != null) {
                mMEditText2.requestFocusFromTouch();
                InputMethodManager inputMethodManager = this.f159900e;
                if (inputMethodManager != null) {
                    MMEditText mMEditText3 = this.f159899d.f159714h;
                    if (mMEditText3 != null) {
                        inputMethodManager.showSoftInput(mMEditText3, 2);
                    } else {
                        C87412m.m108603p("urlEditText");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("urlEditText");
                throw null;
            }
        } else {
            C87412m.m108603p("urlEditText");
            throw null;
        }
    }
}
