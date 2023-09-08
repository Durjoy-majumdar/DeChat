package nh1;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import org.libpag.PAGView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.f */
public final class C61737f implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f175451a;

    public C61737f(RelativeLayout relativeLayout, FinderLiveGiftTextView finderLiveGiftTextView, RelativeLayout relativeLayout2, PAGView pAGView) {
        this.f175451a = relativeLayout;
    }

    /* renamed from: a */
    public static C61737f m72430a(View view) {
        int i = C0966R.C0970id.bf9;
        FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) C10462b.m10395a(view, C0966R.C0970id.bf9);
        if (finderLiveGiftTextView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            PAGView pAGView = (PAGView) C10462b.m10395a(view, C0966R.C0970id.gbv);
            if (pAGView != null) {
                return new C61737f(relativeLayout, finderLiveGiftTextView, relativeLayout, pAGView);
            }
            i = C0966R.C0970id.gbv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
