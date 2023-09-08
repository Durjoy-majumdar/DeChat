package com.tencent.p014mm.plugin.finder.gallery;

import ag1.C0040b;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import dq1.C7461a;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ve1.C14590p;
import ve1.C14632t2;
import ve1.C14648u3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig$buildItemCoverts$1 */
public final class FinderGalleryRingToneConfig$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderGalleryRingToneConfig this$0;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig$buildItemCoverts$1$a */
    public static final class C3122a extends C14648u3 {

        /* renamed from: s */
        public final /* synthetic */ FinderGalleryRingToneConfig f14996s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3122a(FinderGalleryRingToneConfig finderGalleryRingToneConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f14996s = finderGalleryRingToneConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            C0040b bVar = C0040b.f48a;
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            this.f14996s.getClass();
            bVar.mo46a(view, baseFinderFeed, true, false);
            View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.da7);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.i79);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById3 = oVar.f44854d.findViewById(C0966R.C0970id.i5a);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = findViewById3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig$buildItemCoverts$1$b */
    public static final class C3123b extends C14632t2 {

        /* renamed from: s */
        public final /* synthetic */ FinderGalleryRingToneConfig f14997s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3123b(FinderGalleryRingToneConfig finderGalleryRingToneConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f14997s = finderGalleryRingToneConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            C0040b bVar = C0040b.f48a;
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            this.f14997s.getClass();
            bVar.mo46a(view, baseFinderFeed, false, false);
            View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.da7);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.i79);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById3 = oVar.f44854d.findViewById(C0966R.C0970id.i5a);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view4 = findViewById3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/gallery/FinderGalleryRingToneConfig$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public FinderGalleryRingToneConfig$buildItemCoverts$1(FinderGalleryRingToneConfig finderGalleryRingToneConfig) {
        this.this$0 = finderGalleryRingToneConfig;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == 2) {
            return new C3123b(this.this$0);
        }
        if (i == 4 || i == 9) {
            return new C3122a(this.this$0);
        }
        C58784w3.f168295a.mo83916b("FinderStaggeredConfig", i);
        return new C14590p();
    }
}
