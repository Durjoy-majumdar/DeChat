package com.tencent.liteav.videobase.utils;

import java.util.LinkedList;

/* renamed from: com.tencent.liteav.videobase.utils.c */
public final class C17244c {

    /* renamed from: a */
    private final LinkedList<Runnable> f46615a = new LinkedList<>();

    /* renamed from: a */
    public final void mo20221a(Runnable runnable) {
        synchronized (this.f46615a) {
            this.f46615a.add(runnable);
        }
    }

    /* renamed from: a */
    public final void mo20220a() {
        LinkedList linkedList;
        synchronized (this.f46615a) {
            if (!this.f46615a.isEmpty()) {
                linkedList = new LinkedList(this.f46615a);
                this.f46615a.clear();
            } else {
                linkedList = null;
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((Runnable) linkedList.removeFirst()).run();
        }
    }
}
