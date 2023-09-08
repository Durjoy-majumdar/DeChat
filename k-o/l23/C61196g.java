package l23;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lh2.C99417a;
import oj3.C62036a;
import oj3.C62040b;
import ow1.C100562c0;
import p851es.C58800a;
import qh2.C101198e;
import qw1.C101316l;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: l23.g */
public final class C61196g extends C99417a {

    /* renamed from: f */
    public final RecyclerView f174215f;

    /* renamed from: g */
    public final ArrayList<GalleryItem$MediaItem> f174216g;

    /* renamed from: h */
    public C61197a f174217h;

    /* renamed from: i */
    public long f174218i;

    /* renamed from: j */
    public C32227p<? super Integer, ? super Integer, C13598b0> f174219j;

    /* renamed from: l23.g$a */
    public final class C61197a extends C62036a<GalleryItem$MediaItem, C61201c> {
        public C61197a() {
            setHasStableIds(true);
        }

        /* renamed from: G4 */
        public void onBindViewHolder(C62040b bVar, int i) {
            C87412m.m108594g(bVar, "viewWrapper");
            super.onBindViewHolder(bVar, i);
            C61201c cVar = (C61201c) bVar.f176366G;
            GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) mo86983F4(i);
            C100562c0.m131591b(cVar.getImageView(), galleryItem$MediaItem.getType(), galleryItem$MediaItem.mo80159e(), galleryItem$MediaItem.f162747d, galleryItem$MediaItem.f162751h, -1, (C58800a) null, galleryItem$MediaItem.f162752i);
            boolean z = true;
            cVar.setSelected(galleryItem$MediaItem.f162751h == C61196g.this.f174218i);
            if (galleryItem$MediaItem.f162751h != C61196g.this.f174218i) {
                z = false;
            }
            cVar.setFocusable(z);
        }

        /* renamed from: O4 */
        public void onBindViewHolder(C62040b bVar, int i, List<Object> list) {
            C87412m.m108594g(bVar, "holder");
            C87412m.m108594g(list, "payloads");
            if (list.isEmpty()) {
                onBindViewHolder(bVar, i);
            }
        }

        /* renamed from: g5 */
        public View mo13137g5(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            C61196g gVar = C61196g.this;
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "parent.context");
            return new C61201c(gVar, context);
        }

        public long getItemId(int i) {
            return ((GalleryItem$MediaItem) mo86983F4(i)).f162751h;
        }
    }

    /* renamed from: l23.g$b */
    public final class C61198b extends C16665p.C16673d {

        /* renamed from: d */
        public final C62036a<GalleryItem$MediaItem, C61201c> f174221d;

        /* renamed from: e */
        public int f174222e = -1;

        /* renamed from: f */
        public int f174223f = -1;

        /* renamed from: g */
        public final /* synthetic */ C61196g f174224g;

        /* renamed from: l23.g$b$a */
        public static final class C61199a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ RecyclerView.C16631z f174225a;

            /* renamed from: b */
            public final /* synthetic */ C61198b f174226b;

            /* renamed from: c */
            public final /* synthetic */ C61196g f174227c;

            public C61199a(RecyclerView.C16631z zVar, C61198b bVar, C61196g gVar) {
                this.f174225a = zVar;
                this.f174226b = bVar;
                this.f174227c = gVar;
            }

            public void onAnimationEnd(Animation animation) {
                C87412m.m108594g(animation, "animation");
                this.f174225a.f44854d.setTag((Object) null);
                Log.m105918d("MicroMsg.EditFooterRecyclerPlugin", "finally change from=" + this.f174226b.f174222e + " to=" + this.f174226b.f174223f);
                C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f174227c.f174219j;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(this.f174226b.f174222e), Integer.valueOf(this.f174226b.f174223f));
                }
            }

            public void onAnimationRepeat(Animation animation) {
                C87412m.m108594g(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                C87412m.m108594g(animation, "animation");
                this.f174225a.f44854d.setTag(new Object());
            }
        }

        /* renamed from: l23.g$b$b */
        public static final class C61200b implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ RecyclerView.C16631z f174228a;

            /* renamed from: b */
            public final /* synthetic */ int f174229b;

            /* renamed from: c */
            public final /* synthetic */ C61198b f174230c;

            public C61200b(RecyclerView.C16631z zVar, int i, C61198b bVar) {
                this.f174228a = zVar;
                this.f174229b = i;
                this.f174230c = bVar;
            }

            public void onAnimationEnd(Animation animation) {
                C87412m.m108594g(animation, "animation");
                this.f174228a.f44854d.setTag((Object) null);
            }

            public void onAnimationRepeat(Animation animation) {
                C87412m.m108594g(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                C87412m.m108594g(animation, "animation");
                this.f174228a.f44854d.setTag(new Object());
                if (this.f174229b == 2) {
                    this.f174230c.f174223f = this.f174228a.mo17363j();
                    C61198b bVar = this.f174230c;
                    bVar.f174222e = bVar.f174223f;
                    bVar.getClass();
                    bVar.getClass();
                }
            }
        }

        public C61198b(C61196g gVar, C62036a<GalleryItem$MediaItem, C61201c> aVar) {
            C87412m.m108594g(aVar, "adapter");
            this.f174224g = gVar;
            this.f174221d = aVar;
        }

        /* renamed from: a */
        public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            super.mo17547a(recyclerView, zVar);
            Animation loadAnimation = AnimationUtils.loadAnimation(recyclerView.getContext(), C0966R.C0968anim.f2450dc);
            loadAnimation.setAnimationListener(new C61199a(zVar, this, this.f174224g));
            zVar.f44854d.startAnimation(loadAnimation);
        }

        /* renamed from: b */
        public float mo17548b(RecyclerView.C16631z zVar) {
            C87412m.m108594g(zVar, "viewHolder");
            return 0.295858f;
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            return C16665p.C16673d.m16132g(51, 0);
        }

        /* renamed from: e */
        public boolean mo17551e() {
            return false;
        }

        /* renamed from: f */
        public boolean mo17552f() {
            return true;
        }

        /* renamed from: h */
        public void mo17553h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16631z zVar, float f, float f2, int i, boolean z) {
            C87412m.m108594g(canvas, "c");
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            super.mo17553h(canvas, recyclerView, zVar, f / 1.3f, f2 / 1.3f, i, z);
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            C87412m.m108594g(zVar2, "target");
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            Log.m105918d("MicroMsg.EditFooterRecyclerPlugin", "[onMove] from=" + j + " to=" + j2);
            C101316l.m132916o(this.f174224g.f174216g, j, j2);
            this.f174221d.notifyItemMoved(j, j2);
            this.f174223f = j2;
            return true;
        }

        /* renamed from: j */
        public void mo17555j(RecyclerView.C16631z zVar, int i) {
            if (zVar != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(zVar.f44854d.getContext(), C0966R.C0968anim.f2451dd);
                loadAnimation.setAnimationListener(new C61200b(zVar, i, this));
                zVar.f44854d.startAnimation(loadAnimation);
            }
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
        }
    }

    /* renamed from: l23.g$c */
    public final class C61201c extends FrameLayout {

        /* renamed from: d */
        public final ImageView f174231d;

        /* renamed from: e */
        public final View f174232e;

        /* renamed from: f */
        public final View f174233f;

        /* renamed from: g */
        public final int f174234g;

        /* renamed from: h */
        public final int f174235h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61201c(C61196g gVar, Context context) {
            super(context);
            C87412m.m108594g(context, "context");
            int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7w);
            ImageView imageView = new ImageView(getContext());
            this.f174231d = imageView;
            View view = new View(getContext());
            this.f174232e = view;
            View view2 = new View(getContext());
            this.f174233f = view2;
            int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            this.f174234g = dimension;
            int dimension2 = (int) getContext().getResources().getDimension(C0966R.dimen.f3758d_);
            this.f174235h = dimension2;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            int i = (dimension * 2) + dimension2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimension2, dimension2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dimension2, dimension2);
            layoutParams2.gravity = 17;
            layoutParams.gravity = 17;
            layoutParams3.gravity = 17;
            view2.setBackgroundColor(color);
            addView(view2, layoutParams);
            addView(imageView, layoutParams3);
            view.setBackgroundColor(getContext().getResources().getColor(C0966R.color.al6));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.5f));
            View view3 = view;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "<init>", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin;Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "<init>", "(Lcom/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin;Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
            layoutParams4.gravity = 17;
            setLayoutParams(layoutParams4);
        }

        public final View getFocusedView() {
            return this.f174233f;
        }

        public final ImageView getImageView() {
            return this.f174231d;
        }

        public final View getMaskView() {
            return this.f174232e;
        }

        public final int getPadding() {
            return this.f174234g;
        }

        public final int getSize() {
            return this.f174235h;
        }

        public void setFocusable(boolean z) {
            super.setFocusable(z);
            if (z) {
                View view = this.f174233f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = this.f174233f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void setSelected(boolean z) {
            super.setSelected(z);
            if (z) {
                View view = this.f174232e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = this.f174232e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/vlog/ui/plugin/EditFooterRecyclerPlugin$PreviewItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61196g(RecyclerView recyclerView, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(recyclerView, "recycler");
        C87412m.m108594g(eVar, "status");
        this.f174215f = recyclerView;
        ArrayList<GalleryItem$MediaItem> arrayList = new ArrayList<>();
        this.f174216g = arrayList;
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.mo16974W(0);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new C54234f());
        recyclerView.mo17085h0(new C61202h(this));
        C61197a aVar = new C61197a();
        this.f174217h = aVar;
        aVar.f176359d = arrayList;
        aVar.notifyDataSetChanged();
        C61197a aVar2 = this.f174217h;
        if (aVar2 != null) {
            new C16665p(new C61198b(this, aVar2)).mo17527j(recyclerView);
            C61197a aVar3 = this.f174217h;
            if (aVar3 != null) {
                recyclerView.setAdapter(aVar3);
                C61197a aVar4 = this.f174217h;
                if (aVar4 != null) {
                    aVar4.f176360e = new C61204i(this);
                    recyclerView.setVisibility(0);
                    return;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("adapter");
            throw null;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public void onDetach() {
        C61197a aVar = this.f174217h;
        if (aVar != null) {
            int size = aVar.f176359d.size();
            aVar.f176359d.clear();
            aVar.notifyItemRangeRemoved(0, size);
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public void setVisibility(int i) {
        this.f174215f.setVisibility(i);
    }

    /* renamed from: x */
    public final int mo86110x() {
        int i = 0;
        for (T next : this.f174216g) {
            int i2 = i + 1;
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (((GalleryItem$MediaItem) next).f162751h == this.f174218i) {
                return i;
            } else {
                i = i2;
            }
        }
        return 0;
    }

    /* renamed from: y */
    public final void mo86111y(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f174216g.size()) {
            z = true;
        }
        if (z) {
            GalleryItem$MediaItem galleryItem$MediaItem = this.f174216g.get(i);
            this.f174218i = galleryItem$MediaItem.f162751h;
            Bundle bundle = new Bundle();
            bundle.putParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE", galleryItem$MediaItem);
            this.f291492d.mo14585p(C101198e.C101199b.EDIT_VLOG_MULTI_IMAGE_SELECT, bundle);
        }
    }

    /* renamed from: z */
    public final void mo86112z(ArrayList<GalleryItem$MediaItem> arrayList) {
        C87412m.m108594g(arrayList, "list");
        Log.m105924i("MicroMsg.EditFooterRecyclerPlugin", "updateList = " + arrayList.size());
        this.f174216g.clear();
        this.f174216g.addAll(arrayList);
        C61197a aVar = this.f174217h;
        if (aVar != null) {
            ArrayList<GalleryItem$MediaItem> arrayList2 = this.f174216g;
            if (arrayList2 != null) {
                aVar.f176359d = arrayList2;
                aVar.notifyDataSetChanged();
            }
            C61197a aVar2 = this.f174217h;
            if (aVar2 != null) {
                aVar2.notifyDataSetChanged();
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }
}
