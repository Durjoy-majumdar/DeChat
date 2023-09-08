package com.tencent.p014mm.plugin.finder.feed.model.internal;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001eB\u0019\b\u0016\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tJ\u0016\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "T", "Ljava/util/ArrayList;", "", "index", "get", "(I)Ljava/lang/Object;", "Lrx3/b0;", "clearBuffer", "", "getBuffer", "", "elements", "", "setBuffer", "element", "contains", "(Ljava/lang/Object;)Z", "buffer", "Ljava/util/List;", "getTotalSize", "()I", "totalSize", "getOffset", "offset", "<init>", "(Ljava/util/ArrayList;)V", "t", "(Ljava/lang/Object;Ljava/util/ArrayList;)V", "Companion", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer */
public final class DataBuffer<T> extends ArrayList<T> {
    public static final C2802a Companion = new C2802a((C8480h) null);
    public static final String TAG = "DataBuffer";
    private final List<T> buffer;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer$a */
    public static final class C2802a {
        public C2802a(C8480h hVar) {
        }
    }

    public DataBuffer(ArrayList<T> arrayList) {
        C87412m.m108594g(arrayList, "buffer");
        this.buffer = arrayList;
    }

    public final void clearBuffer() {
        this.buffer.clear();
    }

    public boolean contains(Object obj) {
        return super.contains(obj) || this.buffer.contains(obj);
    }

    public T get(int i) {
        return i < size() ? super.get(i) : this.buffer.get((i - size()) + getOffset());
    }

    public final List<T> getBuffer() {
        return this.buffer;
    }

    public final int getOffset() {
        Object W = C110818d0.m150925W(this);
        if (W != null) {
            return this.buffer.indexOf(W) + 1;
        }
        return 0;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final int getTotalSize() {
        return size() + (this.buffer.size() - getOffset());
    }

    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final boolean setBuffer(Collection<? extends T> collection) {
        clearBuffer();
        if (collection == null) {
            return false;
        }
        Log.m105924i(TAG, "[addAllBuffer] " + collection.size());
        return this.buffer.addAll(collection);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataBuffer(ArrayList arrayList, int i, C8480h hVar) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }

    public DataBuffer(T t, ArrayList<T> arrayList) {
        C87412m.m108594g(arrayList, "buffer");
        this.buffer = arrayList;
        add(t);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataBuffer(Object obj, ArrayList arrayList, int i, C8480h hVar) {
        this(obj, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
