package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.story.p108ui.layout.IndicatorLayoutManager;
import gw2.C98266k;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lw2.C10658a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "Landroid/widget/FrameLayout;", "", "position", "Lrx3/b0;", "setSelection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView */
public final class GalleryHorizontalControlView extends FrameLayout {

    /* renamed from: d */
    public final ArrayList<C98266k> f21289d;

    /* renamed from: e */
    public final RecyclerView f21290e;

    /* renamed from: f */
    public final C10658a f21291f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryHorizontalControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f21289d = new ArrayList<>();
        View.inflate(context, C0966R.C0971layout.c6q, this);
        View findViewById = findViewById(C0966R.C0970id.k6y);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_gallery_control_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f21290e = recyclerView;
        recyclerView.setLayoutManager(new IndicatorLayoutManager(context, 0, false));
        C10658a aVar = new C10658a();
        this.f21291f = aVar;
        recyclerView.setAdapter(aVar);
        recyclerView.setFocusable(false);
        recyclerView.setVisibility(8);
        setPadding(0, 0, 0, C75044y4.m89991c(context));
    }

    /* renamed from: a */
    public final void mo6520a(List<C98266k> list) {
        C87412m.m108594g(list, "items");
        this.f21289d.clear();
        this.f21289d.addAll(list);
        C10658a aVar = this.f21291f;
        ArrayList<C98266k> arrayList = this.f21289d;
        aVar.getClass();
        C87412m.m108594g(arrayList, "items");
        aVar.f32078e.clear();
        aVar.f32078e.addAll(arrayList);
        this.f21291f.notifyDataSetChanged();
        if (this.f21289d.size() <= 1) {
            this.f21290e.setVisibility(8);
        } else {
            this.f21290e.setVisibility(0);
        }
    }

    public final void setSelection(int i) {
        C10658a aVar = this.f21291f;
        int i2 = aVar.f32077d;
        if (i2 != i) {
            aVar.notifyItemChanged(i2);
            aVar.f32077d = i;
            aVar.notifyItemChanged(i);
        }
        RecyclerView recyclerView = this.f21290e;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView", "setSelection", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryHorizontalControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
