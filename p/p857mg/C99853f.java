package p857mg;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p278yh.C102862b;

/* renamed from: mg.f */
public final class C99853f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102862b f292598d;

    public C99853f(C102862b bVar) {
        this.f292598d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f292598d.mo142565a().getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            activity.onBackPressed();
        }
        C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
