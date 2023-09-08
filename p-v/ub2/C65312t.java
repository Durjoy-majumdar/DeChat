package ub2;

import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.FTSSearchNoActionBarView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ub2.t */
public final class C65312t implements TabLayout.C104470c<TabLayout.C55061f> {

    /* renamed from: a */
    public final /* synthetic */ MusicMVCardChooseView f187983a;

    public C65312t(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187983a = musicMVCardChooseView;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        if (fVar != null) {
            TabLayout tabLayout = this.f187983a.f163486d;
            TextView textView = null;
            View childAt = tabLayout != null ? tabLayout.getChildAt(0) : null;
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            View childAt2 = viewGroup != null ? viewGroup.getChildAt(fVar.f154604e) : null;
            ViewGroup viewGroup2 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            KeyEvent.Callback childAt3 = viewGroup2 != null ? viewGroup2.getChildAt(1) : null;
            if (childAt3 instanceof TextView) {
                textView = (TextView) childAt3;
            }
            if (textView != null) {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        FTSEditTextView ftsEditText;
        FTSEditTextView ftsEditText2;
        if (fVar != null) {
            MusicMVCardChooseView musicMVCardChooseView = this.f187983a;
            TabLayout tabLayout = musicMVCardChooseView.f163486d;
            TextView textView = null;
            View childAt = tabLayout != null ? tabLayout.getChildAt(0) : null;
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            View childAt2 = viewGroup != null ? viewGroup.getChildAt(fVar.f154604e) : null;
            ViewGroup viewGroup2 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            KeyEvent.Callback childAt3 = viewGroup2 != null ? viewGroup2.getChildAt(1) : null;
            if (childAt3 instanceof TextView) {
                textView = (TextView) childAt3;
            }
            if (textView != null) {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
            }
            int i = fVar.f154604e;
            Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "setCurrentPage:" + i);
            if (i == -1) {
                i = 0;
            }
            FTSSearchNoActionBarView fTSSearchNoActionBarView = musicMVCardChooseView.f163494o;
            if (!(fTSSearchNoActionBarView == null || (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) == null)) {
                ftsEditText2.mo70335c();
            }
            FTSSearchNoActionBarView fTSSearchNoActionBarView2 = musicMVCardChooseView.f163494o;
            if (!(fTSSearchNoActionBarView2 == null || (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) == null)) {
                ftsEditText.mo70339g();
            }
            if (i == 0) {
                RecyclerView recyclerView = musicMVCardChooseView.f163487e;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                RelativeLayout relativeLayout = musicMVCardChooseView.f163490h;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            } else if (i == 1) {
                RecyclerView recyclerView2 = musicMVCardChooseView.f163487e;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(4);
                }
                RelativeLayout relativeLayout2 = musicMVCardChooseView.f163490h;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
            }
            musicMVCardChooseView.mo80522m();
        }
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
    }
}
