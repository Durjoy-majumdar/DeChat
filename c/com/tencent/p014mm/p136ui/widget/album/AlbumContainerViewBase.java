package com.tencent.p014mm.p136ui.widget.album;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import sx3.C64197v;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b \u0010#J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR'\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0015j\b\u0012\u0004\u0012\u00020\u0003`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/album/AlbumContainerViewBase;", "Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;", "", "Landroid/view/View;", "getFilterItemViews", "", "g", "I", "getGap", "()I", "setGap", "(I)V", "gap", "h", "getAlbumWidth", "setAlbumWidth", "albumWidth", "i", "getAlbumHeight", "setAlbumHeight", "albumHeight", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "j", "Ljava/util/ArrayList;", "getItemViews", "()Ljava/util/ArrayList;", "itemViews", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.album.AlbumContainerViewBase */
public class AlbumContainerViewBase extends RoundedCornerFrameLayout {

    /* renamed from: g */
    public int f220504g = C76577a.m92151b(getContext(), 1);

    /* renamed from: h */
    public int f220505h;

    /* renamed from: i */
    public int f220506i;

    /* renamed from: j */
    public final ArrayList<View> f220507j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(Context context, int i, int i2) {
        super(context);
        C87412m.m108594g(context, "context");
        int b = C76577a.m92151b(getContext(), 144);
        this.f220505h = b;
        this.f220506i = b;
        this.f220507j = new ArrayList<>();
        this.f220505h = i;
        this.f220506i = i;
        this.f220504g = i2;
        mo94649c();
    }

    /* renamed from: c */
    public void mo94649c() {
    }

    /* renamed from: d */
    public void mo94178d(long j, String str, String str2, boolean z, boolean z2) {
    }

    /* renamed from: e */
    public List<Pair<View, String>> mo94179e(long j) {
        LinkedList linkedList = new LinkedList();
        int i = 0;
        for (T next : getFilterItemViews()) {
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) next;
                String transitionName = view.getTransitionName();
                if (!(transitionName == null || C112551y.m153811k(transitionName))) {
                    linkedList.add(Pair.create(view, view.getTransitionName()));
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return linkedList;
    }

    public final int getAlbumHeight() {
        return this.f220506i;
    }

    public final int getAlbumWidth() {
        return this.f220505h;
    }

    public List<View> getFilterItemViews() {
        ArrayList<View> arrayList = this.f220507j;
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            if (!(((View) next).getVisibility() == 8)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final int getGap() {
        return this.f220504g;
    }

    public final ArrayList<View> getItemViews() {
        return this.f220507j;
    }

    public final void setAlbumHeight(int i) {
        this.f220506i = i;
    }

    public final void setAlbumWidth(int i) {
        this.f220505h = i;
    }

    public final void setGap(int i) {
        this.f220504g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        int b = C76577a.m92151b(getContext(), 144);
        this.f220505h = b;
        this.f220506i = b;
        this.f220507j = new ArrayList<>();
        mo94649c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        int b = C76577a.m92151b(getContext(), 144);
        this.f220505h = b;
        this.f220506i = b;
        this.f220507j = new ArrayList<>();
        mo94649c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlbumContainerViewBase(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C87412m.m108594g(context, "context");
        int b = C76577a.m92151b(getContext(), 144);
        this.f220505h = b;
        this.f220506i = b;
        this.f220507j = new ArrayList<>();
        mo94649c();
    }
}
