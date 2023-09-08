package mx1;

import a14.C53895h;
import a14.C53934p0;
import androidx.lifecycle.C54208j0;
import ax1.C39646i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cx1.C45220b;
import cx1.C45221c;
import ex1.C45711d;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: mx1.l */
public final class C47136l implements C39646i {

    /* renamed from: a */
    public final /* synthetic */ C47127f f126650a;

    /* renamed from: b */
    public final /* synthetic */ String f126651b;

    /* renamed from: c */
    public final /* synthetic */ AdminInfo f126652c;

    public C47136l(C47127f fVar, String str, AdminInfo adminInfo) {
        this.f126650a = fVar;
        this.f126651b = str;
        this.f126652c = adminInfo;
    }

    /* renamed from: a */
    public void mo62215a(List<? extends C45711d> list) {
        List<? extends C45711d> list2 = list;
        C87412m.m108594g(list2, "users");
        C47127f fVar = this.f126650a;
        C45220b d3 = fVar.mo72234d3();
        Boolean bool = Boolean.TRUE;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C45711d dVar = (C45711d) next;
                arrayList.add(i == 0 ? new C45221c(new C13604l(Boolean.TRUE, MMApplicationContext.getContext().getString(C0966R.string.lux)), dVar.mo71200l2(), false, 1, 4, (C8480h) null) : new C45221c((C13604l) null, dVar.mo71200l2(), false, 1, 5, (C8480h) null));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        fVar.f126627d.postValue(C45220b.m50019a(d3, (List) null, new C13604l(bool, arrayList), (C13604l) null, (C13604l) null, 13, (Object) null));
    }

    /* renamed from: b */
    public void mo62216b(List<? extends C45711d> list) {
        C45221c cVar;
        List<? extends C45711d> list2 = list;
        C87412m.m108594g(list2, "users");
        C47127f fVar = this.f126650a;
        boolean b = C87412m.m108589b(this.f126651b, this.f126652c.owner_username);
        C45220b d3 = fVar.mo72234d3();
        Boolean bool = Boolean.TRUE;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C45711d dVar = (C45711d) next;
                if (i == 0) {
                    cVar = new C45221c(new C13604l(Boolean.TRUE, b ? MMApplicationContext.getContext().getString(C0966R.string.luv) : MMApplicationContext.getContext().getString(C0966R.string.luw)), dVar.mo71200l2(), false, 101, 4, (C8480h) null);
                } else {
                    cVar = new C45221c((C13604l) null, dVar.mo71200l2(), false, 101, 5, (C8480h) null);
                }
                arrayList.add(cVar);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        fVar.f126627d.postValue(C45220b.m50019a(d3, (List) null, (C13604l) null, new C13604l(bool, arrayList), (C13604l) null, 11, (Object) null));
    }

    /* renamed from: c */
    public void mo62217c() {
        C47127f fVar = this.f126650a;
        fVar.getClass();
        C53895h.m60466d(C54208j0.m60899a(fVar), (C66212f) fVar.f126634n.getValue(), (C53934p0) null, new C47134j(fVar, (C15601d<? super C47134j>) null), 2, (Object) null);
    }
}
