package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.story.p108ui.layout.AvatarLayoutManager;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lw2.C76729b;
import lw2.C76734e;
import rx3.C13598b0;
import xv2.C79005m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104B\u001b\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b3\u00105J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R.\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R6\u0010(\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView;", "Landroid/widget/RelativeLayout;", "", "", "userList", "Lrx3/b0;", "setUserList", "value", "d", "Ljava/lang/String;", "getChatRoom", "()Ljava/lang/String;", "setChatRoom", "(Ljava/lang/String;)V", "chatRoom", "Lkotlin/Function0;", "u", "Lfy3/a;", "getOnClose", "()Lfy3/a;", "setOnClose", "(Lfy3/a;)V", "onClose", "v", "getOnMenu", "setOnMenu", "onMenu", "w", "getOnAllFav", "setOnAllFav", "onAllFav", "Lkotlin/Function2;", "Landroid/widget/CompoundButton;", "", "x", "Lfy3/p;", "getOnCheckedFav", "()Lfy3/p;", "setOnCheckedFav", "(Lfy3/p;)V", "onCheckedFav", "y", "getOnClickRangeIcon", "setOnClickRangeIcon", "onClickRangeIcon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView */
public final class GalleryVerticalControlView extends RelativeLayout {

    /* renamed from: d */
    public String f282021d;

    /* renamed from: e */
    public final ImageView f282022e;

    /* renamed from: f */
    public final ImageView f282023f;

    /* renamed from: g */
    public final ImageView f282024g;

    /* renamed from: h */
    public final RecyclerView f282025h;

    /* renamed from: i */
    public final FrameLayout f282026i;

    /* renamed from: j */
    public final ImageView f282027j;

    /* renamed from: n */
    public final View f282028n;

    /* renamed from: o */
    public final ImageView f282029o;

    /* renamed from: p */
    public final ImageView f282030p;

    /* renamed from: q */
    public final CheckBox f282031q;

    /* renamed from: r */
    public C79005m.C79006a f282032r;

    /* renamed from: s */
    public C76734e<?> f282033s;

    /* renamed from: t */
    public AvatarLayoutManager f282034t;

    /* renamed from: u */
    public C32224a<C13598b0> f282035u;

    /* renamed from: v */
    public C32224a<C13598b0> f282036v;

    /* renamed from: w */
    public C32224a<C13598b0> f282037w;

    /* renamed from: x */
    public C32227p<? super CompoundButton, ? super Boolean, C13598b0> f282038x;

    /* renamed from: y */
    public C32224a<C13598b0> f282039y;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$a */
    public static final class C96413a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GalleryVerticalControlView f282040d;

        public C96413a(GalleryVerticalControlView galleryVerticalControlView) {
            this.f282040d = galleryVerticalControlView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onClose = this.f282040d.getOnClose();
            if (onClose != null) {
                onClose.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$b */
    public static final class C96414b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GalleryVerticalControlView f282041d;

        public C96414b(GalleryVerticalControlView galleryVerticalControlView) {
            this.f282041d = galleryVerticalControlView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onMenu = this.f282041d.getOnMenu();
            if (onMenu != null) {
                onMenu.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$c */
    public static final class C96415c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GalleryVerticalControlView f282042d;

        public C96415c(GalleryVerticalControlView galleryVerticalControlView) {
            this.f282042d = galleryVerticalControlView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onAllFav = this.f282042d.getOnAllFav();
            if (onAllFav != null) {
                onAllFav.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$d */
    public static final class C96416d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ GalleryVerticalControlView f282043d;

        public C96416d(GalleryVerticalControlView galleryVerticalControlView) {
            this.f282043d = galleryVerticalControlView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onClickRangeIcon = this.f282043d.getOnClickRangeIcon();
            if (onClickRangeIcon != null) {
                onClickRangeIcon.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$e */
    public static final class C96417e extends C87413o implements C32227p<CompoundButton, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ GalleryVerticalControlView f282044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96417e(GalleryVerticalControlView galleryVerticalControlView) {
            super(2);
            this.f282044d = galleryVerticalControlView;
        }

        public Object invoke(Object obj, Object obj2) {
            CompoundButton compoundButton = (CompoundButton) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(compoundButton, "checkBox");
            C32227p<CompoundButton, Boolean, C13598b0> onCheckedFav = this.f282044d.getOnCheckedFav();
            if (onCheckedFav == null) {
                return null;
            }
            onCheckedFav.invoke(compoundButton, Boolean.valueOf(booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$f */
    public static final class C96418f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C32227p f282045a;

        public C96418f(C32227p pVar) {
            this.f282045a = pVar;
        }

        public final /* synthetic */ void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f282045a.invoke(compoundButton, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryVerticalControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        new C96417e(this);
        View.inflate(context, C0966R.C0971layout.c7l, this);
        View findViewById = findViewById(C0966R.C0970id.k6v);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_gallery_close)");
        ImageView imageView = (ImageView) findViewById;
        this.f282022e = imageView;
        View findViewById2 = findViewById(C0966R.C0970id.k7d);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_gallery_privacy)");
        this.f282023f = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k6t);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_gallery_avatar_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f282025h = recyclerView;
        View findViewById4 = findViewById(C0966R.C0970id.k6u);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_…vatar_recycler_container)");
        this.f282026i = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.k7_);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_gallery_menu)");
        ImageView imageView2 = (ImageView) findViewById5;
        this.f282027j = imageView2;
        View findViewById6 = findViewById(C0966R.C0970id.k7i);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_gallery_sns)");
        this.f282024g = (ImageView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.k6s);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_gallery_all_fav)");
        ImageView imageView3 = (ImageView) findViewById7;
        this.f282029o = imageView3;
        View findViewById8 = findViewById(C0966R.C0970id.k78);
        C87412m.m108593f(findViewById8, "findViewById(R.id.story_gallery_item_status_group)");
        this.f282028n = findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.k7h);
        C87412m.m108593f(findViewById9, "findViewById(R.id.story_gallery_select_fav)");
        CheckBox checkBox = (CheckBox) findViewById9;
        this.f282031q = checkBox;
        View findViewById10 = findViewById(C0966R.C0970id.k7e);
        C87412m.m108593f(findViewById10, "findViewById(R.id.story_gallery_range)");
        ImageView imageView4 = (ImageView) findViewById10;
        this.f282030p = imageView4;
        C96418f fVar = null;
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        imageView2.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_more, -1));
        imageView3.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_contents, -1));
        imageView.setOnClickListener(new C96413a(this));
        imageView2.setOnClickListener(new C96414b(this));
        imageView3.setOnClickListener(new C96415c(this));
        C32227p<? super CompoundButton, ? super Boolean, C13598b0> pVar = this.f282038x;
        checkBox.setOnCheckedChangeListener(pVar != null ? new C96418f(pVar) : fVar);
        imageView4.setOnClickListener(new C96416d(this));
    }

    /* renamed from: a */
    public final void mo134336a(boolean z) {
        if (z) {
            this.f282023f.setVisibility(0);
            this.f282023f.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_lock, getResources().getColor(C0966R.color.afj)));
            return;
        }
        this.f282023f.setVisibility(8);
    }

    public final String getChatRoom() {
        return this.f282021d;
    }

    public final C32224a<C13598b0> getOnAllFav() {
        return this.f282037w;
    }

    public final C32227p<CompoundButton, Boolean, C13598b0> getOnCheckedFav() {
        return this.f282038x;
    }

    public final C32224a<C13598b0> getOnClickRangeIcon() {
        return this.f282039y;
    }

    public final C32224a<C13598b0> getOnClose() {
        return this.f282035u;
    }

    public final C32224a<C13598b0> getOnMenu() {
        return this.f282036v;
    }

    public final void setChatRoom(String str) {
        this.f282021d = str;
        C76734e<?> eVar = this.f282033s;
        C76729b bVar = eVar instanceof C76729b ? (C76729b) eVar : null;
        if (bVar != null) {
            bVar.f224483e = str;
        }
    }

    public final void setOnAllFav(C32224a<C13598b0> aVar) {
        this.f282037w = aVar;
    }

    public final void setOnCheckedFav(C32227p<? super CompoundButton, ? super Boolean, C13598b0> pVar) {
        this.f282038x = pVar;
    }

    public final void setOnClickRangeIcon(C32224a<C13598b0> aVar) {
        this.f282039y = aVar;
    }

    public final void setOnClose(C32224a<C13598b0> aVar) {
        this.f282035u = aVar;
    }

    public final void setOnMenu(C32224a<C13598b0> aVar) {
        this.f282036v = aVar;
    }

    public final void setUserList(List<String> list) {
        C87412m.m108594g(list, "userList");
        C76734e<?> eVar = this.f282033s;
        if (eVar != null) {
            eVar.f224492d.clear();
            eVar.f224492d.add("");
            eVar.f224492d.addAll(list);
            eVar.f224492d.add("");
        }
        C76734e<?> eVar2 = this.f282033s;
        if (eVar2 != null) {
            eVar2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryVerticalControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
