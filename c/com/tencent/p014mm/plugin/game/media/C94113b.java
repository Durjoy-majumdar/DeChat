package com.tencent.p014mm.plugin.game.media;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.game.media.GameLocalGalleryView;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import p143ds.C97526j;
import sw1.C101703s;

/* renamed from: com.tencent.mm.plugin.game.media.b */
public class C94113b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GalleryItem$MediaItem f271799d;

    /* renamed from: e */
    public final /* synthetic */ GameLocalGalleryView.C94092f f271800e;

    public C94113b(GameLocalGalleryView.C94092f fVar, GalleryItem$MediaItem galleryItem$MediaItem) {
        this.f271800e = fVar;
        this.f271799d = galleryItem$MediaItem;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f271799d.getType() != 2) {
            GameLocalGalleryView.C94092f fVar = this.f271800e;
            int type = this.f271799d.getType();
            fVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator<GalleryItem$MediaItem> it = fVar.f271711d.iterator();
            while (it.hasNext()) {
                GalleryItem$MediaItem next = it.next();
                if (next.getType() == type) {
                    arrayList2.add(next);
                }
            }
            ((C97526j) C86312j.m106911c(C97526j.class)).mo136637Yq(arrayList2);
            Intent intent = new Intent();
            intent.setClassName(this.f271800e.f271713f, "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
            intent.putStringArrayListExtra("preview_image_list", this.f271800e.mo129150F4());
            intent.putParcelableArrayListExtra("preview_media_item_list", this.f271800e.f271712e);
            intent.putExtra("preview_all", true);
            intent.putExtra("preview_position", arrayList2.indexOf(this.f271799d));
            intent.putExtra("send_raw_img", false);
            intent.putExtra("max_select_count", this.f271800e.f271715h);
            Context context = this.f271800e.f271713f;
            int i = GameLocalGalleryView.f271697q;
            C88144b.m109795m(context, "gallery", ".ui.ImagePreviewUI", intent, 63802);
        } else if (this.f271800e.f271712e.size() != 0) {
            C76879j.m92726T(GameLocalGalleryView.this.getContext(), C76577a.m92166q(GameLocalGalleryView.this.getContext(), C0966R.string.f5h));
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            Bundle bundle = new Bundle();
            bundle.putBoolean("game_straight_to_publish", GameLocalGalleryView.this.f271705n);
            GameLocalGalleryView.C94092f fVar2 = this.f271800e;
            Context context2 = fVar2.f271713f;
            String str = this.f271799d.f162747d;
            int i2 = GameLocalGalleryView.f271697q;
            ((C101703s) C86312j.m106911c(C101703s.class)).ow0(context2, str, 25690, bundle, GameLocalGalleryView.this.f271706o);
            GameLocalGalleryView.this.mo129144c(2, 2, (Map) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
