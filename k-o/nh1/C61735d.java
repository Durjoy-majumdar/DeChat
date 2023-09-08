package nh1;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import org.libpag.PAGView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.d */
public final class C61735d implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f175449a;

    public C61735d(RelativeLayout relativeLayout, ImageView imageView, FinderLiveGiftTextView finderLiveGiftTextView, RelativeLayout relativeLayout2, PAGView pAGView) {
        this.f175449a = relativeLayout;
    }

    /* renamed from: a */
    public static C61735d m72428a(View view) {
        int i = C0966R.C0970id.a8r;
        ImageView imageView = (ImageView) C10462b.m10395a(view, C0966R.C0970id.a8r);
        if (imageView != null) {
            i = C0966R.C0970id.bf9;
            FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) C10462b.m10395a(view, C0966R.C0970id.bf9);
            if (finderLiveGiftTextView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C0966R.C0970id.gbv;
                PAGView pAGView = (PAGView) C10462b.m10395a(view, C0966R.C0970id.gbv);
                if (pAGView != null) {
                    return new C61735d(relativeLayout, imageView, finderLiveGiftTextView, relativeLayout, pAGView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
