package com.tencent.p014mm.plugin.finder.presenter.contract.message;

import cm1.C55011a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import on1.C11545o;
import on1.C11575y;
import p749xh.C66276va;
import wp1.C66169h;
import wx3.C15601d;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageDbSource;", "Lon1/o;", "Lcm1/a;", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource */
public final class FinderMessageDbSource implements C11545o<C55011a> {

    /* renamed from: d */
    public int[] f160592d;

    /* renamed from: e */
    public final int f160593e;

    /* renamed from: f */
    public final String f160594f;

    /* renamed from: g */
    public C11545o.C11546a f160595g;

    /* renamed from: h */
    public long f160596h;

    /* renamed from: i */
    public int f160597i;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageDbSource$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    static {
        new Companion((C8480h) null);
    }

    public FinderMessageDbSource(int[] iArr, int i, String str, int i2, C8480h hVar) {
        str = (i2 & 4) != 0 ? C66785b.f191882e.mo90662O5() : str;
        C87412m.m108594g(iArr, "messageTypes");
        C87412m.m108594g(str, "username");
        this.f160592d = iArr;
        this.f160593e = i;
        this.f160594f = str;
        StringBuilder sb = new StringBuilder();
        for (int append : this.f160592d) {
            sb.append(append);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb);
        sb4.append('-');
        sb4.append(this.f160593e);
        this.f160595g = new C11545o.C11546a(sb4.toString());
    }

    /* renamed from: a */
    public void mo10079a() {
    }

    /* renamed from: b */
    public void mo10080b(Object obj) {
        C87412m.m108594g((C11575y) obj, "value");
    }

    /* renamed from: c */
    public Object mo11470c(C15601d<? super C11575y<C55011a>> dVar) {
        List<C66276va> b = C66169h.f190180a.mo90243b(this.f160596h, this.f160597i, this.f160592d, this.f160593e, this.f160594f);
        ArrayList arrayList = new ArrayList();
        for (C66276va i : b) {
            C55011a i2 = C66169h.f190180a.mo90250i(i);
            if (i2 != null) {
                arrayList.add(i2);
            }
        }
        Log.m105924i("Finder.FinderMessageDbSource", "load:" + arrayList.size());
        return new FinderMessageLoaderData(arrayList, false);
    }

    /* renamed from: f */
    public Object mo10083f(C15601d<? super C11575y<C55011a>> dVar) {
        return mo11470c(dVar);
    }

    /* renamed from: getKey  reason: collision with other method in class */
    public C11545o.C11546a m168876getKey() {
        return this.f160595g;
    }

    public Object getKey() {
        return this.f160595g;
    }
}
