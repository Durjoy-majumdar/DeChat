package vf1;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import gy3.C87412m;

/* renamed from: vf1.p2 */
public final class C14809p2 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f40797d;

    public C14809p2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f40797d = finderLiveDelManagerUI;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 != i) {
            return false;
        }
        MMEditText mMEditText = this.f40797d.f158987e;
        if (mMEditText != null) {
            mMEditText.clearFocus();
        }
        Object systemService = this.f40797d.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        MMEditText mMEditText2 = this.f40797d.f158987e;
        inputMethodManager.hideSoftInputFromWindow(mMEditText2 != null ? mMEditText2.getWindowToken() : null, 0);
        return true;
    }
}
