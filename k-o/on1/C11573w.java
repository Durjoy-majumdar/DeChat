package on1;

import android.content.Intent;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.C2819w0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import on1.C11537n;
import rx3.C13598b0;

/* renamed from: on1.w */
public final class C11573w implements C11537n.C11542e<C0740i2> {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<C0740i2> f33951a;

    /* renamed from: b */
    public final /* synthetic */ C11574x<C0740i2> f33952b;

    /* renamed from: c */
    public final /* synthetic */ int f33953c;

    /* renamed from: d */
    public final /* synthetic */ C2780c f33954d;

    /* renamed from: e */
    public final /* synthetic */ Intent f33955e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f33956f;

    public C11573w(ArrayList<C0740i2> arrayList, C11574x<C0740i2> xVar, int i, C2780c cVar, Intent intent, C32224a<C13598b0> aVar) {
        this.f33951a = arrayList;
        this.f33952b = xVar;
        this.f33953c = i;
        this.f33954d = cVar;
        this.f33955e = intent;
        this.f33956f = aVar;
    }

    /* renamed from: a */
    public void mo10502a(List<C0740i2> list) {
        C87412m.m108594g(list, "dataList");
        this.f33951a.addAll(list);
        this.f33952b.f33958b.mo2926b(new C2819w0(this.f33951a, this.f33952b.f33958b.f14102a, this.f33953c, this.f33954d), this.f33955e);
        C32224a<C13598b0> aVar = this.f33956f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
