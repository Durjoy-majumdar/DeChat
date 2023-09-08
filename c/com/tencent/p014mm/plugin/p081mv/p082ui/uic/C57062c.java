package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import ac2.C39535k;
import ac2.C91988j;
import android.widget.Button;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvAlbumPreviewSelectedUIC;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kb2.C60995i;
import sx3.C64197v;
import zb2.C103009m;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.c */
public final class C57062c<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ MusicMvAlbumPreviewSelectedUIC f163401d;

    public C57062c(MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC) {
        this.f163401d = musicMvAlbumPreviewSelectedUIC;
    }

    public void onChanged(Object obj) {
        MusicMvAlbumPreviewSelectedUIC musicMvAlbumPreviewSelectedUIC;
        MusicMvAlbumPreviewSelectedUIC.MvPreviewLiveList mvPreviewLiveList;
        ArrayList<T> arrayList;
        if (((C91988j) obj).f263327a == C39535k.UIRefresh && (mvPreviewLiveList = musicMvAlbumPreviewSelectedUIC.f163248g) != null && (arrayList = mvPreviewLiveList.f272353o) != null) {
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (((C60995i) next).f173716i) {
                        C103009m<C60995i> mVar = musicMvAlbumPreviewSelectedUIC.f163249h;
                        int c6 = i + (mVar != null ? mVar.mo85796c6() : 0);
                        WxRecyclerView c3 = MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(c6));
                        WxRecyclerView wxRecyclerView = c3;
                        C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$1$1$2", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        c3.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$1$1$2", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                MusicMvAlbumPreviewSelectedUIC.m65703c3(musicMvAlbumPreviewSelectedUIC).setVisibility(0);
                musicMvAlbumPreviewSelectedUIC.mo80444d3().setEnabled(true);
                Button d3 = musicMvAlbumPreviewSelectedUIC.mo80444d3();
                d3.setText(musicMvAlbumPreviewSelectedUIC.getActivity().getString(C0966R.string.f360089a13) + '(' + arrayList.size() + ')');
                return;
            }
            MusicMvAlbumPreviewSelectedUIC.m65703c3((musicMvAlbumPreviewSelectedUIC = this.f163401d)).setVisibility(8);
            musicMvAlbumPreviewSelectedUIC.mo80444d3().setEnabled(false);
            musicMvAlbumPreviewSelectedUIC.mo80444d3().setText(musicMvAlbumPreviewSelectedUIC.getActivity().getString(C0966R.string.f360089a13));
        }
    }
}
