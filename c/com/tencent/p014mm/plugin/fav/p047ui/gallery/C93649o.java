package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.o */
public interface C93649o extends C93620a<C93650p> {
    /* renamed from: a */
    RecyclerView.C0129l mo128568a(Context context);

    /* renamed from: b */
    <T extends RecyclerView.LayoutManager> T mo128569b(Context context);

    /* renamed from: i */
    void mo128570i();

    /* renamed from: j */
    <T extends RecyclerView.C16613e> T mo128571j();

    /* renamed from: k */
    void mo128572k(boolean z, int i);

    /* renamed from: l */
    void mo128573l();

    /* renamed from: m */
    boolean mo128574m();

    /* renamed from: n */
    void mo128575n(int i);

    /* renamed from: o */
    void mo128576o(C93642n.C93646d dVar);

    void onResume();

    /* renamed from: p */
    RecyclerView.C16613e mo128578p(FavoriteImageServer favoriteImageServer);
}
