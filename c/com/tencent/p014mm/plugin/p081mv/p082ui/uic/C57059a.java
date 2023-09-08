package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qb2.C62599b;
import rx3.C36570n;
import te3.C64525lh3;
import ub2.C65257a;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.a */
public final class C57059a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163396d;

    /* renamed from: e */
    public final /* synthetic */ IStateAction f163397e;

    /* renamed from: com.tencent.mm.plugin.mv.ui.uic.a$a */
    public static final class C57060a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewRecyclerUIC f163398d;

        public C57060a(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC) {
            this.f163398d = musicMvAlbumPreviewRecyclerUIC;
        }

        public final void run() {
            ((C65257a) ((C36570n) this.f163398d.f163223f).getValue()).mo89392n();
        }
    }

    public C57059a(MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC, IStateAction iStateAction) {
        this.f163396d = musicMvAlbumPreviewRecyclerUIC;
        this.f163397e = iStateAction;
    }

    public final void run() {
        MusicMvAlbumPreviewRecyclerUIC musicMvAlbumPreviewRecyclerUIC = this.f163396d;
        C64525lh3 lh32 = ((C62599b) this.f163397e).f177786a;
        String str = lh32.f184108f;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = lh32.f184109g;
        if (str3 != null) {
            str2 = str3;
        }
        int c3 = MusicMvAlbumPreviewRecyclerUIC.m65698c3(musicMvAlbumPreviewRecyclerUIC, lh32, str, str2);
        WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) ((C36570n) this.f163396d.f163222e).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(c3));
        WxLinearLayoutManager wxLinearLayoutManager2 = wxLinearLayoutManager;
        C117292a.m165358d(wxLinearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$2$1$3$onChanged$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        wxLinearLayoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$2$1$3$onChanged$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f163396d.getRecyclerView().post(new C57060a(this.f163396d));
    }
}
