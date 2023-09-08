package com.tencent.p014mm.plugin.finder.playlist;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8808v4;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B#\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/playlist/FinderPlayListDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "z", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "getFeedObj", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "setFeedObj", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "feedObj", "", "A", "Z", "getUseCache", "()Z", "setUseCache", "(Z)V", "useCache", "", "B", "I", "getScene", "()I", "setScene", "(I)V", "scene", "C", "getPosition", "setPosition", "position", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer */
public final class FinderPlayListDrawer extends RecyclerViewDrawer {

    /* renamed from: D */
    public static final /* synthetic */ int f15858D = 0;

    /* renamed from: A */
    public boolean f15859A = (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e());

    /* renamed from: B */
    public int f15860B = -1;

    /* renamed from: C */
    public int f15861C = -1;

    /* renamed from: z */
    public FinderItem f15862z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPlayListDrawer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public final FinderItem getFeedObj() {
        return this.f15862z;
    }

    public final int getPosition() {
        return this.f15861C;
    }

    public final int getScene() {
        return this.f15860B;
    }

    public final boolean getUseCache() {
        return this.f15859A;
    }

    public final void setFeedObj(FinderItem finderItem) {
        this.f15862z = finderItem;
    }

    public final void setPosition(int i) {
        this.f15861C = i;
    }

    public final void setScene(int i) {
        this.f15860B = i;
    }

    public final void setUseCache(boolean z) {
        this.f15859A = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPlayListDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPlayListDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
