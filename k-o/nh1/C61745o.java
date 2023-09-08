package nh1;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import org.libpag.PAGView;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: nh1.o */
public final class C61745o implements C10461a {

    /* renamed from: a */
    public final RelativeLayout f175511a;

    public C61745o(RelativeLayout relativeLayout, FinderRandomAnimTextView finderRandomAnimTextView, FinderLiveGiftTextView finderLiveGiftTextView, PAGView pAGView, RelativeLayout relativeLayout2) {
        this.f175511a = relativeLayout;
    }

    /* renamed from: a */
    public static C61745o m72431a(View view) {
        int i = C0966R.C0970id.nug;
        FinderRandomAnimTextView finderRandomAnimTextView = (FinderRandomAnimTextView) C10462b.m10395a(view, C0966R.C0970id.nug);
        if (finderRandomAnimTextView != null) {
            i = C0966R.C0970id.dm4;
            FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) C10462b.m10395a(view, C0966R.C0970id.dm4);
            if (finderLiveGiftTextView != null) {
                i = C0966R.C0970id.dm9;
                PAGView pAGView = (PAGView) C10462b.m10395a(view, C0966R.C0970id.dm9);
                if (pAGView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new C61745o(relativeLayout, finderRandomAnimTextView, finderLiveGiftTextView, pAGView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
