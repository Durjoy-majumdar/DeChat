package ow2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.GalleryRecyclerView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o40.C61926c;

/* renamed from: ow2.g */
public final class C100591g {

    /* renamed from: a */
    public final StoryGalleryView f294729a;

    /* renamed from: b */
    public final GalleryRecyclerView f294730b;

    /* renamed from: c */
    public final C62184j f294731c;

    /* renamed from: d */
    public boolean f294732d;

    /* renamed from: e */
    public final C100594c f294733e;

    /* renamed from: f */
    public final Runnable f294734f;

    /* renamed from: g */
    public View f294735g;

    /* renamed from: ow2.g$a */
    public static final class C100592a implements Runnable {

        /* renamed from: d */
        public static final C100592a f294736d = new C100592a();

        public final void run() {
        }
    }

    /* renamed from: ow2.g$b */
    public static final class C100593b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100591g f294737d;

        public C100593b(C100591g gVar) {
            this.f294737d = gVar;
        }

        public final void run() {
            int b = C76577a.m92151b(this.f294737d.f294729a.getContext(), 112);
            View inflate = LayoutInflater.from(this.f294737d.f294729a.getContext()).inflate(C0966R.C0971layout.c7g, this.f294737d.f294729a, false);
            this.f294737d.f294735g = inflate;
            View findViewById = inflate.findViewById(C0966R.C0970id.k8t);
            C87412m.m108593f(findViewById, "layout.findViewById(R.id…tory_scroll_up_hint_icon)");
            ((ImageView) findViewById).setImageDrawable(C74933u4.m89768e(this.f294737d.f294729a.getContext(), C0966R.raw.close_icon_nor, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b);
            layoutParams.addRule(12, 1);
            this.f294737d.f294729a.addView(inflate, layoutParams);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view = inflate;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.animate().alpha(1.0f).start();
            this.f294737d.f294730b.mo17122s1(0, b, (Interpolator) null);
            this.f294737d.f294732d = true;
        }
    }

    /* renamed from: ow2.g$c */
    public static final class C100594c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C100591g f294738d;

        public C100594c(C100591g gVar) {
            this.f294738d = gVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            if (!this.f294738d.f294732d && i2 > 0) {
                Log.m105924i("MicroMsg.GalleryScrollUpCheck", "onScrolled " + i2);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC, Boolean.TRUE);
                C100591g gVar = this.f294738d;
                gVar.getClass();
                C61926c.m72668M(new C100595h(gVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C100591g(StoryGalleryView storyGalleryView, GalleryRecyclerView galleryRecyclerView, C62184j jVar) {
        C87412m.m108594g(storyGalleryView, "gallery");
        C87412m.m108594g(galleryRecyclerView, "recyclerView");
        C87412m.m108594g(jVar, "pageScrollHelper");
        this.f294729a = storyGalleryView;
        this.f294730b = galleryRecyclerView;
        this.f294731c = jVar;
        C100594c cVar = new C100594c(this);
        this.f294733e = cVar;
        if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC, false)) {
            this.f294734f = C100592a.f294736d;
            jVar.mo75025b(galleryRecyclerView);
            return;
        }
        C100593b bVar = new C100593b(this);
        this.f294734f = bVar;
        MMHandlerThread.postToMainThreadDelayed(bVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        galleryRecyclerView.mo17043c(cVar);
    }
}
