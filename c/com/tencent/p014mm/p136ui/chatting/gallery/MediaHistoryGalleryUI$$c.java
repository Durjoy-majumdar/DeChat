package com.tencent.p014mm.p136ui.chatting.gallery;

import android.os.Process;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.sdk.platformtools.Util;
import dk3.C97482c;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import uj3.C102039f;

/* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI$$c */
public class MediaHistoryGalleryUI$$c extends RecyclerView.C0130p {

    /* renamed from: d */
    public Runnable f284632d = new C97029a();

    /* renamed from: e */
    public final /* synthetic */ MediaHistoryGalleryUI f284633e;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI$$c$a */
    public class C97029a implements Runnable {
        public C97029a() {
        }

        public void run() {
            MediaHistoryGalleryUI$$c.this.f284633e.f284615g.startAnimation(AnimationUtils.loadAnimation(MediaHistoryGalleryUI$$c.this.f284633e.getContext(), C0966R.C0968anim.f2394bx));
            MediaHistoryGalleryUI$$c.this.f284633e.f284615g.setVisibility(8);
        }
    }

    public MediaHistoryGalleryUI$$c(MediaHistoryGalleryUI mediaHistoryGalleryUI) {
        this.f284633e = mediaHistoryGalleryUI;
    }

    /* renamed from: a */
    public void mo135872a(boolean z) {
        if (z) {
            this.f284633e.f284615g.removeCallbacks(this.f284632d);
            if (this.f284633e.f284615g.getVisibility() != 0) {
                this.f284633e.f284615g.clearAnimation();
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f284633e.getContext(), C0966R.C0968anim.f2393bw);
                this.f284633e.f284615g.setVisibility(0);
                this.f284633e.f284615g.startAnimation(loadAnimation);
                return;
            }
            return;
        }
        this.f284633e.f284615g.removeCallbacks(this.f284632d);
        this.f284633e.f284615g.postDelayed(this.f284632d, 256);
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C97482c cVar;
        C102039f fVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i) {
            mo135872a(true);
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcMediaGalleryScrollEnable(), this.f284633e.f284623r);
            this.f284633e.f284623r = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcMediaGalleryScrollEnable(), C40318k.m43492a().getHcMediaGalleryScrollDelay(), C40318k.m43492a().getHcMediaGalleryScrollCPU(), C40318k.m43492a().getHcMediaGalleryScrollIO(), C40318k.m43492a().getHcMediaGalleryScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcMediaGalleryScrollTimeout(), 703, C40318k.m43492a().getHcMediaGalleryScrollAction(), "MicroMsg.MediaHistoryGalleryUI");
        } else if (i == 0) {
            mo135872a(false);
        }
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).mo16957C() == 0) {
                MediaHistoryGalleryUI mediaHistoryGalleryUI = this.f284633e;
                if (!mediaHistoryGalleryUI.f284624s && (cVar = mediaHistoryGalleryUI.f284612d) != null && (fVar = mediaHistoryGalleryUI.f284613e) != null && !fVar.f300497j) {
                    cVar.mo136070k(false, -1);
                }
            }
            this.f284633e.f284624s = false;
            C20828a.m22825b().mo32525n(i);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        MediaHistoryGalleryUI mediaHistoryGalleryUI = this.f284633e;
        C102039f fVar = (C102039f) this.f284633e.f284612d.mo136069j();
        C102039f.C102042c F4 = fVar.mo141544F4(((LinearLayoutManager) mediaHistoryGalleryUI.f284612d.mo136065b(mediaHistoryGalleryUI)).mo16957C());
        if (F4 == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        this.f284633e.f284615g.setText(Util.nullAs(C74763a.m89510e().mo103936d(new Date(F4.f300507d), fVar.f300491d), ""));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
