package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hp3.C87581a;
import java.util.ArrayList;
import o40.C61926c;
import ob0.C89132b;
import p599lr.C61381b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C51860wo0;

/* renamed from: com.tencent.mm.plugin.finder.ui.m */
public final class C56400m<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderAlbumUI f161239a;

    /* renamed from: b */
    public final /* synthetic */ String f161240b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList<GalleryItem$MediaItem> f161241c;

    public C56400m(FinderAlbumUI finderAlbumUI, String str, ArrayList<GalleryItem$MediaItem> arrayList) {
        this.f161239a = finderAlbumUI;
        this.f161240b = str;
        this.f161241c = arrayList;
    }

    public Object call(Object obj) {
        String str;
        Class cls = C61381b.class;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null || cVar.f256793a != 0 || cVar.f256794b != 0 || !((C51860wo0) cVar.f256796d).f144169d) {
            Log.m105924i("Finder.AlbumUI", "cgi error, continue post");
            C61926c.m72668M(new C56398l(this.f161239a, this.f161241c));
        } else {
            Intent intent = new Intent();
            FinderAlbumUI finderAlbumUI = this.f161239a;
            if (finderAlbumUI.f161017C1) {
                intent.putExtras(finderAlbumUI.getIntent());
            }
            intent.putExtra("post_id", this.f161239a.f161020y1);
            intent.putExtra("postType", 4);
            intent.putExtra("postMediaList", C64197v.m75534c(this.f161240b));
            intent.putExtra("postTypeList", C64197v.m75534c(4));
            intent.putExtra("isLongVideoPost", false);
            C51860wo0 wo02 = (C51860wo0) cVar.f256796d;
            if (wo02 == null || (str = wo02.f144170e) == null) {
                str = "";
            }
            intent.putExtra("KEY_POST_MIAOJIAN_TONGKUAN_META", str);
            if (intent.getIntExtra("KEY_POST_FROM_APP_SOURCE", 0) == 0) {
                intent.putExtra("KEY_POST_FROM_APP_SOURCE", 4);
            }
            ((C61381b) C86312j.m106911c(cls)).Yp0().mo88196g(intent, this.f161239a.getIntent());
            FinderAlbumUI finderAlbumUI2 = this.f161239a;
            finderAlbumUI2.getClass();
            ((C61381b) C86312j.m106911c(cls)).Yp0().mo88189a(finderAlbumUI2, intent);
            Log.m105924i("Finder.AlbumUI", "miaojianTongkuanMeta " + ((C51860wo0) cVar.f256796d).f144170e);
        }
        return C13598b0.f38549a;
    }
}
