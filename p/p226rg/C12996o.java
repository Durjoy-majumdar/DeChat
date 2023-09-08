package p226rg;

import android.view.View;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rg.o */
public final class C12996o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AlbumPreviewUIC f37054d;

    public C12996o(AlbumPreviewUIC albumPreviewUIC) {
        this.f37054d = albumPreviewUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f37054d.getActivity().onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
