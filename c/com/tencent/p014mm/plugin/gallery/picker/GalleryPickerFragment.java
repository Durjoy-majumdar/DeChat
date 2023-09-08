package com.tencent.p014mm.plugin.gallery.picker;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.C93970n;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.picker.manager.SpeedGirdLayoutManager;
import com.tencent.p014mm.plugin.gallery.picker.view.MMMediaCropLayout;
import com.tencent.p014mm.plugin.gallery.picker.view.MediaItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import iw1.C60638c;
import iw1.C9259a;
import iw1.C9260b;
import iw1.C9261d;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import lp3.C88643g;
import mw1.C61581a;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/GalleryPickerFragment;", "Landroidx/fragment/app/Fragment;", "", "Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView$a;", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment */
public final class GalleryPickerFragment extends HellAndroidXFragment implements MediaItemView.C56794a {

    /* renamed from: h */
    public static final /* synthetic */ int f162770h = 0;

    /* renamed from: d */
    public RecyclerView f162771d;

    /* renamed from: e */
    public MMMediaCropLayout f162772e;

    /* renamed from: f */
    public ImageView f162773f;

    /* renamed from: g */
    public boolean f162774g;

    /* renamed from: com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment$a */
    public static final class C56792a extends C87413o implements C32228q<Boolean, LinkedList<GalleryItem$MediaItem>, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GalleryPickerFragment f162775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56792a(GalleryPickerFragment galleryPickerFragment) {
            super(3);
            this.f162775d = galleryPickerFragment;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            LinkedList linkedList = (LinkedList) obj2;
            long longValue = ((Number) obj3).longValue();
            C87412m.m108594g(linkedList, "data");
            if (!booleanValue) {
                Log.m105928w("MicroMsg.GalleryPickerFragment", "[onActivityCreated] onLoad failure!");
            } else {
                List B0 = C110818d0.m150900B0(linkedList);
                Pattern pattern = C61926c.f176038a;
                C61926c.m72665J(C88643g.m110546d(), new C30063a(longValue, B0, this.f162775d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.GalleryPickerFragment$b */
    public static final class C56793b extends C87413o implements C32227p<LinkedList<GalleryItem$AlbumItem>, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GalleryPickerFragment f162776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56793b(GalleryPickerFragment galleryPickerFragment) {
            super(2);
            this.f162776d = galleryPickerFragment;
        }

        public Object invoke(Object obj, Object obj2) {
            LinkedList linkedList = (LinkedList) obj;
            long longValue = ((Number) obj2).longValue();
            C87412m.m108594g(linkedList, "data");
            Pattern pattern = C61926c.f176038a;
            C61926c.m72665J(C88643g.m110546d(), new C30064b(linkedList, longValue, this.f162776d));
            return C13598b0.f38549a;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C61581a.f175152a.getClass();
        C93970n nVar = new C93970n();
        C61581a.f175153b = nVar;
        nVar.mo128903I(3);
        C93970n nVar2 = C61581a.f175153b;
        C87412m.m108591d(nVar2);
        nVar2.mo128902C5(C61581a.f175154c);
        C93970n nVar3 = C61581a.f175153b;
        C87412m.m108591d(nVar3);
        nVar3.f271191a.add(C61581a.f175155d);
        C56792a aVar = new C56792a(this);
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        GalleryItem$AlbumItem galleryItem$AlbumItem = new GalleryItem$AlbumItem(C61581a.f175157f, 0);
        C61581a.C61583b bVar = C61581a.f175154c;
        bVar.f175162e = aVar;
        bVar.f175161d = currentTimeMillis;
        GalleryItem$AlbumItem galleryItem$AlbumItem2 = C61581a.f175156e;
        if (galleryItem$AlbumItem2 == null || !C87412m.m108589b(galleryItem$AlbumItem2.f271096d, galleryItem$AlbumItem.f271096d)) {
            z = true;
        }
        Log.m105924i("MicroMsg.PickerDataLoader", "[onLoad] ticket=" + currentTimeMillis + " isNeed=" + z);
        if (!z) {
            aVar.invoke(Boolean.FALSE, new LinkedList(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } else if (C87412m.m108589b(galleryItem$AlbumItem.f271096d, C61581a.f175157f)) {
            C93970n nVar4 = C61581a.f175153b;
            if (nVar4 != null) {
                nVar4.mo128909f("", 3, currentTimeMillis);
            }
        } else if (C87412m.m108589b(galleryItem$AlbumItem.f271096d, C61581a.f175158g)) {
            C93970n nVar5 = C61581a.f175153b;
            if (nVar5 != null) {
                nVar5.mo128909f("", 2, currentTimeMillis);
            }
        } else {
            C93970n nVar6 = C61581a.f175153b;
            if (nVar6 != null) {
                nVar6.mo128909f(galleryItem$AlbumItem.f271096d, galleryItem$AlbumItem.f271101i.getType(), currentTimeMillis);
            }
        }
        C61581a.f175156e = galleryItem$AlbumItem;
        C56793b bVar2 = new C56793b(this);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105924i("MicroMsg.PickerDataLoader", "[onLoadFolder] ticket=" + currentTimeMillis2);
        C61581a.C61582a aVar2 = C61581a.f175155d;
        aVar2.f175160e = bVar2;
        aVar2.f175159d = currentTimeMillis2;
        C93970n nVar7 = C61581a.f175153b;
        if (nVar7 != null) {
            nVar7.mo128908e();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.au5, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        View findViewById = inflate.findViewById(C0966R.C0970id.ehu);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.gallery_view)");
        this.f162771d = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f358955i22);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.preview_container)");
        MMMediaCropLayout mMMediaCropLayout = (MMMediaCropLayout) findViewById2;
        this.f162772e = mMMediaCropLayout;
        mMMediaCropLayout.getLayoutParams().height = (int) ((((float) getResources().getDisplayMetrics().widthPixels) * 3.5f) / 3.0f);
        mMMediaCropLayout.requestLayout();
        mMMediaCropLayout.setOnClickListener(new C9261d(this));
        View findViewById3 = inflate.findViewById(C0966R.C0970id.h39);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.multi_selected_icon)");
        ImageView imageView = (ImageView) findViewById3;
        this.f162773f = imageView;
        imageView.setBackground((Drawable) null);
        ImageView imageView2 = this.f162773f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C9260b(this));
            ImageView imageView3 = this.f162773f;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
                SpeedGirdLayoutManager speedGirdLayoutManager = new SpeedGirdLayoutManager(getContext(), 4);
                RecyclerView recyclerView = this.f162771d;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(speedGirdLayoutManager);
                    RecyclerView recyclerView2 = this.f162771d;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter((RecyclerView.C16613e) null);
                        RecyclerView recyclerView3 = this.f162771d;
                        if (recyclerView3 != null) {
                            recyclerView3.mo17085h0(new C9259a(this));
                            C60638c cVar = new C60638c();
                            RecyclerView recyclerView4 = this.f162771d;
                            if (recyclerView4 != null) {
                                recyclerView4.setItemAnimator(cVar);
                                RecyclerView recyclerView5 = this.f162771d;
                                if (recyclerView5 != null) {
                                    recyclerView5.setHasFixedSize(true);
                                    RecyclerView.C16623q qVar = new RecyclerView.C16623q();
                                    qVar.mo17336e(1, 80);
                                    qVar.mo17336e(2, 60);
                                    RecyclerView recyclerView6 = this.f162771d;
                                    if (recyclerView6 == null) {
                                        C87412m.m108603p("galleryView");
                                        throw null;
                                    }
                                    recyclerView6.setRecycledViewPool(qVar);
                                    speedGirdLayoutManager.setItemPrefetchEnabled(true);
                                    speedGirdLayoutManager.f44689u = 30;
                                    throw null;
                                }
                                C87412m.m108603p("galleryView");
                                throw null;
                            }
                            C87412m.m108603p("galleryView");
                            throw null;
                        }
                        C87412m.m108603p("galleryView");
                        throw null;
                    }
                    C87412m.m108603p("galleryView");
                    throw null;
                }
                C87412m.m108603p("galleryView");
                throw null;
            }
            C87412m.m108603p("multiSelectedIcon");
            throw null;
        }
        C87412m.m108603p("multiSelectedIcon");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C61581a.f175152a.getClass();
        C61581a.f175156e = null;
        C93970n nVar = C61581a.f175153b;
        if (nVar != null) {
            HashSet<C93964k.C93965a> hashSet = nVar.f271191a;
            if (hashSet != null) {
                hashSet.clear();
            }
            HashSet<C93964k.C93967c> hashSet2 = nVar.f271193c;
            if (hashSet2 != null) {
                hashSet2.clear();
            }
            HashSet<C93964k.C93966b> hashSet3 = nVar.f271194d;
            if (hashSet3 != null) {
                hashSet3.clear();
            }
        }
    }

    public void onPause() {
        super.onPause();
        MMMediaCropLayout mMMediaCropLayout = this.f162772e;
        if (mMMediaCropLayout != null) {
            mMMediaCropLayout.getVideoView().mo79614b();
        } else {
            C87412m.m108603p("previewContainer");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        MMMediaCropLayout mMMediaCropLayout = this.f162772e;
        if (mMMediaCropLayout != null) {
            mMMediaCropLayout.getVideoView().mo79617f();
        } else {
            C87412m.m108603p("previewContainer");
            throw null;
        }
    }
}
