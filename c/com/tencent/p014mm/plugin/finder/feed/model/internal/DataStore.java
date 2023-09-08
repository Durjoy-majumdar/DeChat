package com.tencent.p014mm.plugin.finder.feed.model.internal;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import sx3.C110818d0;
import sx3.C64197v;

@Metadata(mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\r\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\u0004\b\u0001\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0005J \u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001e\"\u0004\b\u0001\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aJ\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020!J\u0015\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/DataStore;", "T", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "dataList", "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "getDataList", "()Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "setDataList", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;)V", "get", "index", "", "(I)Ljava/lang/Object;", "getDataListJustForAdapter", "getLast", "()Ljava/lang/Object;", "getLastItemOfType", "E", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getListInfo", "getListOfType", "", "getSize", "isEmpty", "", "safeGet", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.DataStore */
public class DataStore<T> {
    private String TAG = ("Finder." + getClass().getSimpleName() + "_@" + hashCode());
    private DataBuffer<T> dataList = new DataBuffer<>(new ArrayList());

    public final T get(int i) {
        return this.dataList.get(i);
    }

    public final DataBuffer<T> getDataList() {
        return this.dataList;
    }

    public final DataBuffer<T> getDataListJustForAdapter() {
        return this.dataList;
    }

    public final T getLast() {
        return C110818d0.m150925W(this.dataList);
    }

    public final <E> E getLastItemOfType(Class<E> cls) {
        E e;
        C87412m.m108594g(cls, "clazz");
        DataBuffer<T> dataBuffer = this.dataList;
        ListIterator<E> listIterator = dataBuffer.listIterator(dataBuffer.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                e = null;
                break;
            }
            e = listIterator.previous();
            if (cls.isInstance(e)) {
                break;
            }
        }
        if (e != null) {
            return e;
        }
        return null;
    }

    public final String getListInfo() {
        String str = "DataStore: info count: " + this.dataList.size();
        Log.m105924i(getTAG(), str);
        int i = 0;
        for (T next : this.dataList) {
            int i2 = i + 1;
            if (i >= 0) {
                Log.m105924i(getTAG(), "DataStore:index " + i + " obj:" + next);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return str;
    }

    public final <E> List<E> getListOfType(Class<E> cls) {
        C87412m.m108594g(cls, "clazz");
        ArrayList arrayList = new ArrayList();
        for (T next : this.dataList) {
            if (cls.isInstance(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final int getSize() {
        return this.dataList.size();
    }

    public String getTAG() {
        return this.TAG;
    }

    public final boolean isEmpty() {
        return this.dataList.isEmpty();
    }

    public final T safeGet(int i) {
        if (i < 0 || i >= this.dataList.size()) {
            return null;
        }
        return this.dataList.get(i);
    }

    public final void setDataList(DataBuffer<T> dataBuffer) {
        C87412m.m108594g(dataBuffer, "<set-?>");
        this.dataList = dataBuffer;
    }

    public void setTAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.TAG = str;
    }
}
