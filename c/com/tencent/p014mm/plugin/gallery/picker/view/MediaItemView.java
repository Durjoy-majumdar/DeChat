package com.tencent.p014mm.plugin.gallery.picker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import jw1.C60925a;
import k60.C60979d;
import kotlin.Metadata;
import oj3.C62040b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001>B\u001b\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;B#\b\u0016\u0012\u0006\u00107\u001a\u000206\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010<\u001a\u00020\u0004¢\u0006\u0004\b:\u0010=J\b\u0010\u0005\u001a\u00020\u0004H&R(\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR2\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u001ej\b\u0012\u0004\u0012\u00028\u0000`\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006?"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView;", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;", "T", "Landroid/widget/FrameLayout;", "", "getLayoutId", "Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView$a;", "d", "Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView$a;", "getOnItemMediaSelectedListener", "()Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView$a;", "setOnItemMediaSelectedListener", "(Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView$a;)V", "onItemMediaSelectedListener", "Loj3/b;", "e", "Loj3/b;", "getHolder", "()Loj3/b;", "setHolder", "(Loj3/b;)V", "holder", "Ljava/util/HashSet;", "f", "Ljava/util/HashSet;", "getSelectedSet", "()Ljava/util/HashSet;", "setSelectedSet", "(Ljava/util/HashSet;)V", "selectedSet", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "getSelectedList", "()Ljava/util/ArrayList;", "setSelectedList", "(Ljava/util/ArrayList;)V", "selectedList", "Lk60/d;", "h", "Lk60/d;", "getLoader", "()Lk60/d;", "setLoader", "(Lk60/d;)V", "loader", "Ljw1/a;", "adapter", "Ljw1/a;", "getAdapter", "()Ljw1/a;", "setAdapter", "(Ljw1/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.MediaItemView */
public abstract class MediaItemView<T extends GalleryItem$MediaItem> extends FrameLayout {

    /* renamed from: d */
    public C56794a<?> f162778d;

    /* renamed from: e */
    public C62040b f162779e;

    /* renamed from: f */
    public HashSet<T> f162780f;

    /* renamed from: g */
    public ArrayList<T> f162781g;

    /* renamed from: h */
    public C60979d<T> f162782h;

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.MediaItemView$a */
    public interface C56794a<E> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C60925a getAdapter() {
        C87412m.m108603p("adapter");
        throw null;
    }

    public final C62040b getHolder() {
        C62040b bVar = this.f162779e;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("holder");
        throw null;
    }

    public abstract int getLayoutId();

    public final C60979d<T> getLoader() {
        C60979d<T> dVar = this.f162782h;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("loader");
        throw null;
    }

    public final C56794a<?> getOnItemMediaSelectedListener() {
        return this.f162778d;
    }

    public final ArrayList<T> getSelectedList() {
        ArrayList<T> arrayList = this.f162781g;
        if (arrayList != null) {
            return arrayList;
        }
        C87412m.m108603p("selectedList");
        throw null;
    }

    public final HashSet<T> getSelectedSet() {
        HashSet<T> hashSet = this.f162780f;
        if (hashSet != null) {
            return hashSet;
        }
        C87412m.m108603p("selectedSet");
        throw null;
    }

    public final void setAdapter(C60925a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
    }

    public final void setHolder(C62040b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.f162779e = bVar;
    }

    public final void setLoader(C60979d<T> dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f162782h = dVar;
    }

    public final void setOnItemMediaSelectedListener(C56794a<?> aVar) {
        this.f162778d = aVar;
    }

    public final void setSelectedList(ArrayList<T> arrayList) {
        C87412m.m108594g(arrayList, "<set-?>");
        this.f162781g = arrayList;
    }

    public final void setSelectedSet(HashSet<T> hashSet) {
        C87412m.m108594g(hashSet, "<set-?>");
        this.f162780f = hashSet;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
