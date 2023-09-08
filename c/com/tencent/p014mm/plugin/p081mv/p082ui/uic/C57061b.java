package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import ac2.C39535k;
import ac2.C91988j;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvAlbumPreviewRecyclerUIC;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import kb2.C60995i;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.b */
public final class C57061b implements C0120a0<C91988j<C60995i>> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163399d;

    /* renamed from: e */
    public final /* synthetic */ IStateAction f163400e;

    public C57061b(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC, IStateAction iStateAction) {
        this.f163399d = musicMvAlbumPreviewRecyclerUIC;
        this.f163400e = iStateAction;
    }

    public void onChanged(Object obj) {
        LiveData<C91988j<T>> liveData;
        C91988j jVar = (C91988j) obj;
        if ((jVar != null ? jVar.f263327a : null) == C39535k.UIRefresh) {
            this.f163399d.getRecyclerView().post(new C57059a(this.f163399d, this.f163400e));
            MusicMvAlbumPreviewRecyclerUIC.MvPreviewLiveList mvPreviewLiveList = this.f163399d.f163226i;
            if (mvPreviewLiveList != null && (liveData = mvPreviewLiveList.f272358t) != null) {
                liveData.removeObserver(this);
            }
        }
    }
}
