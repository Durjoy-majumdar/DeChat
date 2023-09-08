package sh0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.album.p838ui.AlbumGalleryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p278yh.C66642a;
import rx3.C36570n;

/* renamed from: sh0.a */
public final class C63890a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f181101d;

    /* renamed from: e */
    public final /* synthetic */ AlbumGalleryUI f181102e;

    public C63890a(View view, AlbumGalleryUI albumGalleryUI) {
        this.f181101d = view;
        this.f181102e = albumGalleryUI;
    }

    public void onGlobalLayout() {
        this.f181101d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean d = C75044y4.m89992d(this.f181102e.getContext());
        int c = C75044y4.m89991c(this.f181102e.getContext());
        Log.m105925i("MicroMsg.AlbumGalleryUI", "%d handleUI album gallery ui isNavBarVisibility %b navBarHeight %d", Integer.valueOf(hashCode()), Boolean.valueOf(d), Integer.valueOf(c));
        if (d) {
            AlbumGalleryUI albumGalleryUI = this.f181102e;
            int i = AlbumGalleryUI.f157907e;
            ViewGroup.LayoutParams layoutParams = ((C66642a) ((C36570n) albumGalleryUI.f157908d).getValue()).mo90691d().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = c + this.f181102e.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            ((C66642a) ((C36570n) this.f181102e.f157908d).getValue()).mo90691d().setLayoutParams(layoutParams2);
        }
    }
}
