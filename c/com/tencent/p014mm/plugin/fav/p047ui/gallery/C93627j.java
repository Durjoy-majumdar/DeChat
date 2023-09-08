package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.os.Process;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.j */
public class C93627j extends RecyclerView.C0130p {

    /* renamed from: d */
    public Runnable f270352d = new C93628a();

    /* renamed from: e */
    public final /* synthetic */ C93629k f270353e;

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.j$a */
    public class C93628a implements Runnable {
        public C93628a() {
        }

        public void run() {
            C93627j.this.f270353e.f270359e.startAnimation(AnimationUtils.loadAnimation(C93627j.this.f270353e.f270368n, C0966R.C0968anim.f2394bx));
            C93627j.this.f270353e.f270359e.setVisibility(8);
        }
    }

    public C93627j(C93629k kVar) {
        this.f270353e = kVar;
    }

    /* renamed from: a */
    public void mo128541a(boolean z) {
        if (z) {
            this.f270353e.f270359e.removeCallbacks(this.f270352d);
            if (this.f270353e.f270359e.getVisibility() != 0) {
                this.f270353e.f270359e.clearAnimation();
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f270353e.f270368n, C0966R.C0968anim.f2393bw);
                this.f270353e.f270359e.setVisibility(0);
                this.f270353e.f270359e.startAnimation(loadAnimation);
                return;
            }
            return;
        }
        this.f270353e.f270359e.removeCallbacks(this.f270352d);
        this.f270353e.f270359e.postDelayed(this.f270352d, 256);
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i) {
            mo128541a(true);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcMediaGalleryScrollEnable(), this.f270353e.f270366l);
            this.f270353e.f270366l = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcMediaGalleryScrollEnable(), C40318k.m43492a().getHcMediaGalleryScrollDelay(), C40318k.m43492a().getHcMediaGalleryScrollCPU(), C40318k.m43492a().getHcMediaGalleryScrollIO(), C40318k.m43492a().getHcMediaGalleryScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcMediaGalleryScrollTimeout(), 703, C40318k.m43492a().getHcMediaGalleryScrollAction(), "MicroMsg.MediaHistoryGalleryUI");
        } else if (i == 0) {
            mo128541a(false);
        }
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).mo16957C() == 0) {
                C93629k kVar = this.f270353e;
                if (!kVar.f270367m) {
                    kVar.f270355a.mo128572k(false, -1);
                }
            }
            this.f270353e.f270367m = false;
            C20828a.m22825b().mo32525n(i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C93629k kVar = this.f270353e;
        C93642n nVar = (C93642n) this.f270353e.f270355a.mo128571j();
        C93642n.C93647f G4 = nVar.mo128565G4(((LinearLayoutManager) kVar.f270355a.mo128569b(kVar.f270368n)).mo16957C());
        if (G4 == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        this.f270353e.f270359e.setText(Util.nullAs(C74763a.m89510e().mo103936d(new Date(G4.f270413c), nVar.f270393d), ""));
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
