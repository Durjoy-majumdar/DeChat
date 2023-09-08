package com.tencent.p014mm.plugin.finder.gallery;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import zf1.C66795c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryTabView;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView$l;", "getItemDecoration", "Lzf1/c;", "e", "Lzf1/c;", "getPresenter", "()Lzf1/c;", "setPresenter", "(Lzf1/c;)V", "presenter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView */
public final class FinderGalleryTabView extends FrameLayout {

    /* renamed from: d */
    public final String f14998d = "Finder.FinderAlbumFilterView";

    /* renamed from: e */
    public C66795c f14999e;

    /* renamed from: f */
    public WxRecyclerView f15000f;

    /* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView$a */
    public static final class C3125a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            rect.left = dimension;
            rect.right = dimension;
            rect.bottom = dimension;
            rect.top = dimension;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r5 = r5.f43344d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3150a(int r5) {
        /*
            r4 = this;
            zf1.c r0 = r4.f14999e
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList<zf1.i> r0 = r0.f191902f
            if (r0 == 0) goto L_0x006c
            int r1 = r0.size()
            if (r1 <= r5) goto L_0x006c
            if (r5 < 0) goto L_0x006c
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r1.next()
            zf1.i r2 = (zf1.C16151i) r2
            r3 = 0
            r2.f43345e = r3
            goto L_0x0014
        L_0x0024:
            java.lang.Object r1 = sx3.C110818d0.m150917O(r0, r5)
            zf1.i r1 = (zf1.C16151i) r1
            if (r1 != 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r2 = 1
            r1.f43345e = r2
        L_0x0030:
            java.lang.String r1 = r4.f14998d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "select "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", title:"
            r2.append(r3)
            java.lang.Object r5 = sx3.C110818d0.m150917O(r0, r5)
            zf1.i r5 = (zf1.C16151i) r5
            if (r5 == 0) goto L_0x0054
            zf1.h r5 = r5.f43344d
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = r5.f43343b
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r4.f15000f
            if (r5 == 0) goto L_0x006c
            androidx.recyclerview.widget.RecyclerView$e r5 = r5.getAdapter()
            if (r5 == 0) goto L_0x006c
            r5.notifyDataSetChanged()
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.gallery.FinderGalleryTabView.mo3150a(int):void");
    }

    public final RecyclerView.C0129l getItemDecoration() {
        return new C3125a();
    }

    public final C66795c getPresenter() {
        return this.f14999e;
    }

    public final WxRecyclerView getRecyclerView() {
        return this.f15000f;
    }

    public final void setPresenter(C66795c cVar) {
        this.f14999e = cVar;
    }

    public final void setRecyclerView(WxRecyclerView wxRecyclerView) {
        this.f15000f = wxRecyclerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
