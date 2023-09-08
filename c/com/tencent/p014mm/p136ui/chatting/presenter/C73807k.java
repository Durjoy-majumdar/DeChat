package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.storage.C72963f4;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.presenter.k */
public class C73807k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DoFavoriteEvent f216605d;

    /* renamed from: e */
    public final /* synthetic */ List f216606e;

    /* renamed from: f */
    public final /* synthetic */ MediaHistoryGalleryPresenter f216607f;

    public C73807k(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter, DoFavoriteEvent doFavoriteEvent, List list) {
        this.f216607f = mediaHistoryGalleryPresenter;
        this.f216605d = doFavoriteEvent;
        this.f216606e = list;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        DoFavoriteEvent.C92474a aVar = this.f216605d.f264674d;
        if (aVar.f264678c != 14 || aVar.f264676a.f298618f.size() != 0) {
            this.f216607f.mo136067f(this.f216605d);
            MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = this.f216607f;
            List<C72963f4> list = this.f216606e;
            mediaHistoryGalleryPresenter.getClass();
            for (C72963f4 c : list) {
                C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, c, 0);
            }
        }
    }
}
