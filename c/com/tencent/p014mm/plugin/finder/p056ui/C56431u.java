package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;
import qo1.C63291f;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.finder.ui.u */
public final class C56431u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumUI f161293d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f161294e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<GalleryItem$MediaItem> f161295f;

    public C56431u(FinderAlbumUI finderAlbumUI, C12925w wVar, ArrayList<GalleryItem$MediaItem> arrayList) {
        this.f161293d = finderAlbumUI;
        this.f161294e = wVar;
        this.f161295f = arrayList;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        Class cls = C63291f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderAlbumUI finderAlbumUI = this.f161293d;
        int i = FinderAlbumUI.f161014F1;
        finderAlbumUI.getClass();
        boolean z = System.currentTimeMillis() - finderAlbumUI.f161015A1 < 1000;
        finderAlbumUI.f161015A1 = System.currentTimeMillis();
        if (z) {
            Log.m105924i("Finder.AlbumUI", "onSendItemClick: short video btn hit double click check");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f161293d.f161016B1 = true;
        this.f161294e.mo5085n();
        this.f161293d.mo79066g8(this.f161295f);
        FinderAlbumUI finderAlbumUI2 = this.f161293d;
        FinderFeedReportObject Dc = ((C63291f) C86312j.m106911c(cls)).mo83237Dc();
        String str3 = (Dc == null || (str2 = Dc.clickId) == null) ? "" : str2;
        FinderFeedReportObject Dc2 = ((C63291f) C86312j.m106911c(cls)).mo83237Dc();
        finderAlbumUI2.mo79073o8(str3, (Dc2 == null || (str = Dc2.postId) == null) ? "" : str, 2, C31543z5.m39453c() / 1000, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
