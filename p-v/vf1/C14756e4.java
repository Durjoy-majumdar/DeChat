package vf1;

import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderOriginalRequestUI;

/* renamed from: vf1.e4 */
public final class C14756e4 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FinderOriginalRequestUI f40730a;

    public C14756e4(FinderOriginalRequestUI finderOriginalRequestUI) {
        this.f40730a = finderOriginalRequestUI;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f40730a.mo3063N7().setClickable(z);
        this.f40730a.mo3063N7().setEnabled(z);
    }
}
