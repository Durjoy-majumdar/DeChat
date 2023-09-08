package on1;

import cm1.C0740i2;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import pe3.C89349b;
import rx3.C36570n;

/* renamed from: on1.a */
public class C11507a<T extends C0740i2> extends C11575y<T> {

    /* renamed from: d */
    public final boolean f33806d;

    /* renamed from: e */
    public final C89349b f33807e;

    /* renamed from: f */
    public int f33808f;

    /* renamed from: g */
    public int f33809g;

    /* renamed from: h */
    public String f33810h;

    /* renamed from: i */
    public int f33811i;

    /* renamed from: j */
    public RefreshLoadMoreLayout.C7080c<Object> f33812j;

    public C11507a() {
        this((List) null, false, (C89349b) null, false, 15, (C8480h) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11507a(java.util.List r1, boolean r2, pe3.C89349b r3, boolean r4, int r5, gy3.C8480h r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0009
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0009:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000e
            r2 = 1
        L_0x000e:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0013
            r3 = 0
        L_0x0013:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            r4 = 0
        L_0x0018:
            java.lang.String r5 = "feeds"
            gy3.C87412m.m108594g(r1, r5)
            r0.<init>(r1, r4)
            r0.f33806d = r2
            r0.f33807e = r3
            java.lang.String r1 = ""
            r0.f33810h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11507a.<init>(java.util.List, boolean, pe3.b, boolean, int, gy3.h):void");
    }

    /* renamed from: a */
    public RefreshLoadMoreLayout.C7080c<Object> mo11463a() {
        RefreshLoadMoreLayout.C7080c<Object> cVar = this.f33812j;
        C87412m.m108591d(cVar);
        return cVar;
    }

    /* renamed from: b */
    public void mo11464b(List<T> list) {
        C87412m.m108594g(list, "dataList");
        ((C11512c) ((C36570n) this.f33961c).getValue()).mo11474a(list, this.f33959a);
        boolean z = this.f33806d;
        RefreshLoadMoreLayout.C7080c<Object> cVar = new RefreshLoadMoreLayout.C7080c<>(z ^ true ? 1 : 0);
        cVar.f24951f = this.f33811i > 0;
        if (!z) {
            cVar.f24952g = this.f33959a.isEmpty();
            cVar.f24953h = this.f33959a.size();
        }
        this.f33812j = cVar;
    }
}
