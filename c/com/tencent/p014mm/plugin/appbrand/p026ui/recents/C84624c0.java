package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C68589r0;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.c0 */
public final class C84624c0 extends ArrayList<AppBrandRecentTaskInfo> {

    /* renamed from: d */
    public final ArrayList<AppBrandRecentTaskInfo> f246906d = new ArrayList<>(C68589r0.f197020a);

    /* renamed from: e */
    public final ArrayList<AppBrandRecentTaskInfo> f246907e = new ArrayList<>(10000);

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.c0$a */
    public class C84625a implements Iterator<AppBrandRecentTaskInfo> {
        public C84625a(C84624c0 c0Var) {
        }

        public boolean hasNext() {
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return null;
        }

        public void remove() {
        }
    }

    /* renamed from: m */
    public static void m104254m(int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex = " + i);
        } else if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex = " + i2);
        } else if (i > i2) {
            throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
        }
    }

    public boolean addAll(Collection<? extends AppBrandRecentTaskInfo> collection) {
        if (C84624c0.class.isInstance(collection)) {
            synchronized (this) {
                C84624c0 c0Var = (C84624c0) collection;
                this.f246906d.addAll(c0Var.f246906d);
                this.f246907e.addAll(c0Var.f246907e);
            }
            return true;
        }
        Assert.assertTrue("collection type mismatch!!", false);
        return false;
    }

    public synchronized void clear() {
        this.f246906d.clear();
        this.f246907e.clear();
    }

    /* renamed from: f */
    public synchronized C84624c0 clone() {
        C84624c0 c0Var;
        c0Var = new C84624c0();
        c0Var.f246906d.addAll(this.f246906d);
        c0Var.f246907e.addAll(this.f246907e);
        return c0Var;
    }

    /* renamed from: h */
    public synchronized AppBrandRecentTaskInfo get(int i) {
        if (i < this.f246906d.size()) {
            return this.f246906d.get(i);
        }
        return this.f246907e.get(i - this.f246906d.size());
    }

    public synchronized boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<AppBrandRecentTaskInfo> iterator() {
        Assert.assertTrue("Why you need this?? call @smoothieli fix it", false);
        return new C84625a(this);
    }

    /* renamed from: k */
    public synchronized AppBrandRecentTaskInfo remove(int i) {
        if (i < this.f246906d.size()) {
            return this.f246906d.remove(i);
        }
        return this.f246907e.remove(i - this.f246906d.size());
    }

    /* renamed from: l */
    public synchronized C84624c0 mo117332l(ArrayList<AppBrandRecentTaskInfo> arrayList, ArrayList<AppBrandRecentTaskInfo> arrayList2) {
        this.f246906d.clear();
        if (!Util.isNullOrNil((List) arrayList)) {
            this.f246906d.addAll(arrayList);
        }
        this.f246907e.clear();
        if (!Util.isNullOrNil((List) arrayList2)) {
            this.f246907e.addAll(arrayList2);
        }
        return this;
    }

    public synchronized int size() {
        return this.f246906d.size() + this.f246907e.size();
    }

    public synchronized List<AppBrandRecentTaskInfo> subList(int i, int i2) {
        m104254m(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(get(i));
            i++;
        }
        return arrayList;
    }
}
