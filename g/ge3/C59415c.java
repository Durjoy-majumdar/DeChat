package ge3;

import android.os.Process;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fe3.C58970b;
import gy3.C87412m;
import hw1.C60218q;
import hw1.C98554s;
import j20.C117292a;
import java.util.ArrayList;
import qw1.C101316l;

/* renamed from: ge3.c */
public final class C59415c extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ C59409a f169819d;

    /* renamed from: e */
    public final /* synthetic */ GridLayoutManager f169820e;

    public C59415c(C59409a aVar, GridLayoutManager gridLayoutManager) {
        this.f169819d = aVar;
        this.f169820e = gridLayoutManager;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView2, "recyclerView");
        Log.m105919d("FS.AlbumFileUIC", "scroll state[%d]", Integer.valueOf(i));
        if (1 == i2) {
            C93958f.m118747g().mo128874b();
        } else if (i2 == 0) {
            this.f169819d.f169802u = this.f169820e.mo16957C();
            this.f169819d.f169803v = this.f169820e.mo16959E();
            Log.m105919d("FS.AlbumFileUIC", "cancelTask logic, firstVisibleItem: %s lastVisibleItem: %s.", Integer.valueOf(this.f169819d.f169802u), Integer.valueOf(this.f169819d.f169803v));
            C58970b bVar = this.f169819d.f169797p;
            if (bVar != null) {
                int u5 = bVar.mo84201u5();
                C59409a aVar = this.f169819d;
                C98554s sVar = C98554s.f289007d;
                C98554s.f289007d.mo137928b(C60218q.C60219a.IDLE, aVar.f169802u, aVar.f169803v, u5);
            }
        } else if (2 == i2) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), this.f169819d.f169804w);
            this.f169819d.f169804w = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcAlbumScrollEnable(), C40318k.m43492a().getHcAlbumScrollDelay(), C40318k.m43492a().getHcAlbumScrollCPU(), C40318k.m43492a().getHcAlbumScrollIO(), C40318k.m43492a().getHcAlbumScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcAlbumScrollTimeout(), 702, C40318k.m43492a().getHcAlbumScrollAction(), "FS.AlbumFileUIC");
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        int C = this.f169820e.mo16957C();
        int E = this.f169820e.mo16959E();
        Log.m105919d("FS.AlbumFileUIC", "pennqin, onScrolled, %s %s %s %s.", Integer.valueOf(C), Integer.valueOf(E), Integer.valueOf(this.f169819d.f169802u), Integer.valueOf(this.f169819d.f169803v));
        C59409a aVar = this.f169819d;
        if (!(aVar.f169802u == C && aVar.f169803v == E)) {
            aVar.f169802u = C;
            aVar.f169803v = E;
            ArrayList arrayList2 = new ArrayList();
            C59409a aVar2 = this.f169819d;
            int i3 = aVar2.f169802u;
            int i4 = aVar2.f169803v;
            if (i3 <= i4) {
                while (true) {
                    C58970b bVar = this.f169819d.f169797p;
                    GalleryItem$MediaItem g5 = bVar != null ? bVar.mo84200g5(i3) : null;
                    if (g5 != null && !Util.isNullOrNil(g5.mo80159e())) {
                        arrayList2.add(C101316l.m132905d(g5.mo80159e(), (C93974o.C93980f) null, -1));
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            Log.m105919d("FS.AlbumFileUIC", "cancelTask, legalPaths size: %s.", Integer.valueOf(arrayList2.size()));
            C93958f.m118747g().mo128875c(arrayList2);
            if (i2 != 0) {
                this.f169819d.f169801t = i2 < 0 ? C60218q.C60219a.UP : C60218q.C60219a.DOWN;
                Log.m105919d("FS.AlbumFileUIC", "onScrolled, dy: %s state: %s.", Integer.valueOf(i2), this.f169819d.f169801t);
                C58970b bVar2 = this.f169819d.f169797p;
                if (bVar2 != null) {
                    int u5 = bVar2.mo84201u5();
                    C59409a aVar3 = this.f169819d;
                    C98554s sVar = C98554s.f289007d;
                    C98554s.f289007d.mo137928b(aVar3.f169801t, aVar3.f169802u, aVar3.f169803v, u5);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
