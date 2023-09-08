package p857mg;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import p858ng.C61704k;
import p858ng.C61710l;
import p858ng.C61730x;

/* renamed from: mg.e */
public final class C61475e implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f174803d;

    public C61475e(C60905o oVar) {
        this.f174803d = oVar;
    }

    public final boolean onLongClick(View view) {
        UIStateCenter<C61710l> c3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Context context = this.f174803d.f44854d.getContext();
        C87412m.m108593f(context, "holder.itemView.context");
        C61704k kVar = context instanceof AppCompatActivity ? (C61704k) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C61704k.class) : null;
        if (!(kVar == null || (c3 = kVar.mo86624c3()) == null)) {
            c3.dispatch(new C61730x(20));
        }
        C117292a.m165362h(true, this, "com/tencent/mm/album/ui/gallery/item/AlbumGalleryImageItemConvert$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
