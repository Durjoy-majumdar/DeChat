package nh1;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import org.libpag.PAGView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.q */
public final class C61747q implements C10461a {

    /* renamed from: a */
    public final ConstraintLayout f175521a;

    public C61747q(ConstraintLayout constraintLayout, FinderRandomAnimTextView finderRandomAnimTextView, FinderLiveGiftTextView finderLiveGiftTextView, PAGView pAGView, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.f175521a = constraintLayout;
    }

    /* renamed from: a */
    public static C61747q m72432a(View view) {
        int i = C0966R.C0970id.nug;
        FinderRandomAnimTextView finderRandomAnimTextView = (FinderRandomAnimTextView) C10462b.m10395a(view, C0966R.C0970id.nug);
        if (finderRandomAnimTextView != null) {
            i = C0966R.C0970id.dm4;
            FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) C10462b.m10395a(view, C0966R.C0970id.dm4);
            if (finderLiveGiftTextView != null) {
                i = C0966R.C0970id.dm9;
                PAGView pAGView = (PAGView) C10462b.m10395a(view, C0966R.C0970id.dm9);
                if (pAGView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C0966R.C0970id.kib;
                    FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(view, C0966R.C0970id.kib);
                    if (frameLayout != null) {
                        return new C61747q(constraintLayout, finderRandomAnimTextView, finderLiveGiftTextView, pAGView, constraintLayout, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
