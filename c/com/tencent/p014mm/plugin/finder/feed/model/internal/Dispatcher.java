package com.tencent.p014mm.plugin.finder.feed.model.internal;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import tf1.C13897e;
import tf1.C13900g;
import tf1.C13914m;
import zp3.C16389w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\nH&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/Dispatcher;", "Ltf1/m;", "T", "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataStore;", "Ltf1/e;", "createDataMerger", "Ltf1/g;", "dispatcher", "Lzp3/w;", "callback", "Lrx3/b0;", "register", "unregister", "onAlive", "onDead", "Ljava/util/LinkedList;", "viewCallbacks", "Ljava/util/LinkedList;", "merger", "Ltf1/e;", "getMerger", "()Ltf1/e;", "Ltf1/g;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher */
public abstract class Dispatcher<T extends C13914m> extends DataStore<T> {
    private final C13900g<T> dispatcher;
    private final C13897e<T> merger = createDataMerger();
    private final LinkedList<C16389w> viewCallbacks;

    public Dispatcher() {
        LinkedList<C16389w> linkedList = new LinkedList<>();
        this.viewCallbacks = linkedList;
        this.dispatcher = new C13900g<>(linkedList);
    }

    public abstract C13897e<T> createDataMerger();

    public final C13900g<T> dispatcher() {
        return this.dispatcher;
    }

    public final C13897e<T> getMerger() {
        return this.merger;
    }

    public abstract void onAlive();

    public abstract void onDead();

    public final void register(C16389w wVar) {
        C87412m.m108594g(wVar, "callback");
        this.viewCallbacks.add(wVar);
        String tag = getTAG();
        Log.m105924i(tag, "register callback " + wVar + " size:" + this.viewCallbacks.size());
        if (this.viewCallbacks.size() == 1) {
            onAlive();
        }
    }

    public final void unregister(C16389w wVar) {
        C87412m.m108594g(wVar, "callback");
        LinkedList<C16389w> linkedList = this.viewCallbacks;
        synchronized (linkedList) {
            for (C16389w wVar2 : linkedList) {
                if (C87412m.m108589b(wVar2, wVar)) {
                    this.viewCallbacks.remove(wVar2);
                }
            }
        }
        String tag = getTAG();
        Log.m105924i(tag, "unregister callback " + wVar + " size " + this.viewCallbacks.size() + " from " + Util.getStack() + '}');
        if (this.viewCallbacks.size() == 0) {
            onDead();
        }
    }
}
