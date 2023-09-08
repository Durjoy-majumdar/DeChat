package ub2;

import android.os.Process;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.FirstRowLayoutManager;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import hw1.C60218q;
import j20.C117292a;
import java.util.ArrayList;
import mb2.C61461c;

/* renamed from: ub2.g */
public final class C65285g extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187940d;

    /* renamed from: e */
    public final /* synthetic */ FirstRowLayoutManager f187941e;

    public C65285g(MusicMVCardChooseView musicMVCardChooseView, FirstRowLayoutManager firstRowLayoutManager) {
        this.f187940d = musicMVCardChooseView;
        this.f187941e = firstRowLayoutManager;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView2, "recyclerView");
        Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "scroll state[%d]", Integer.valueOf(i));
        if (1 == i2) {
            ((C56791j) C86312j.m106911c(C56791j.class)).l70();
        } else if (i2 == 0) {
            this.f187940d.f163474R = this.f187941e.mo16957C();
            this.f187940d.f163476S = this.f187941e.mo16959E();
            Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "cancelTask logic, firstVisibleItem: %s lastVisibleItem: %s.", Integer.valueOf(this.f187940d.f163474R), Integer.valueOf(this.f187940d.f163476S));
            C61461c cVar = this.f187940d.f163488f;
            if (cVar != null) {
                int G4 = cVar.mo86437G4();
                MusicMVCardChooseView musicMVCardChooseView = this.f187940d;
                ((C60218q) C86312j.m106911c(C60218q.class)).Wv0(C60218q.C60219a.IDLE, musicMVCardChooseView.f163474R, musicMVCardChooseView.f163476S, G4);
            }
        } else if (2 == i2) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), this.f187940d.f163478T);
            this.f187940d.f163478T = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), C40318k.m43492a().getHcAlbumScrollDelay(), C40318k.m43492a().getHcAlbumScrollCPU(), C40318k.m43492a().getHcAlbumScrollIO(), C40318k.m43492a().getHcAlbumScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcAlbumScrollTimeout(), 702, C40318k.m43492a().getHcAlbumScrollAction(), "MicroMsg.Mv.MusicMVCardChooseView");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        int C = this.f187941e.mo16957C();
        int E = this.f187941e.mo16959E();
        Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "pennqin, onScrolled, %s %s %s %s.", Integer.valueOf(C), Integer.valueOf(E), Integer.valueOf(this.f187940d.f163474R), Integer.valueOf(this.f187940d.f163476S));
        MusicMVCardChooseView musicMVCardChooseView = this.f187940d;
        if (!(musicMVCardChooseView.f163474R == C && musicMVCardChooseView.f163476S == E)) {
            musicMVCardChooseView.f163474R = C;
            musicMVCardChooseView.f163476S = E;
            ArrayList arrayList2 = new ArrayList();
            MusicMVCardChooseView musicMVCardChooseView2 = this.f187940d;
            int i3 = musicMVCardChooseView2.f163474R;
            int i4 = musicMVCardChooseView2.f163476S;
            if (i3 <= i4) {
                while (true) {
                    C61461c cVar = this.f187940d.f163488f;
                    GalleryItem$MediaItem F4 = cVar != null ? cVar.mo86436F4(i3) : null;
                    if (F4 != null && !Util.isNullOrNil(F4.mo80159e())) {
                        MusicMVCardChooseView musicMVCardChooseView3 = this.f187940d;
                        String e = F4.mo80159e();
                        musicMVCardChooseView3.getClass();
                        if (e != null) {
                            arrayList2.add(e + musicMVCardChooseView3.f163467K + "");
                        } else {
                            throw new NullPointerException("getDecodeTaskKey filePath is null!!!");
                        }
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "cancelTask, legalPaths size: %s.", Integer.valueOf(arrayList2.size()));
            ((C56791j) C86312j.m106911c(C56791j.class)).mo80187wg(arrayList2);
            if (i2 != 0) {
                this.f187940d.f163480U = i2 < 0 ? C60218q.C60219a.UP : C60218q.C60219a.DOWN;
                Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "onScrolled, dy: %s state: %s.", Integer.valueOf(i2), this.f187940d.f163480U);
                C61461c cVar2 = this.f187940d.f163488f;
                if (cVar2 != null) {
                    int G4 = cVar2.mo86437G4();
                    MusicMVCardChooseView musicMVCardChooseView4 = this.f187940d;
                    ((C60218q) C86312j.m106911c(C60218q.class)).Wv0(musicMVCardChooseView4.f163480U, musicMVCardChooseView4.f163474R, musicMVCardChooseView4.f163476S, G4);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
