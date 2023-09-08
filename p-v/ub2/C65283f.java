package ub2;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabSearchFragment;

/* renamed from: ub2.f */
public final class C65283f implements MusicMvTabFragment.C57116b {

    /* renamed from: a */
    public final /* synthetic */ MusicMVCardChooseView f187938a;

    public C65283f(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187938a = musicMVCardChooseView;
    }

    /* renamed from: a */
    public void mo80635a(int i, int i2) {
        if (i != 4) {
            return;
        }
        if (i2 > 0) {
            TextView textView = this.f187938a.f163497q;
            if (textView != null) {
                textView.setVisibility(8);
            }
            LinearLayout linearLayout = this.f187938a.f163498r;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            MusicMvTabSearchFragment musicMvTabSearchFragment = this.f187938a.f163495p;
            if (musicMvTabSearchFragment != null) {
                musicMvTabSearchFragment.setResultView(0);
                return;
            }
            return;
        }
        TextView textView2 = this.f187938a.f163497q;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f187938a.f163498r;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        MusicMvTabSearchFragment musicMvTabSearchFragment2 = this.f187938a.f163495p;
        if (musicMvTabSearchFragment2 != null) {
            musicMvTabSearchFragment2.setResultView(8);
        }
    }
}
