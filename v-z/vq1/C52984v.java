package vq1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import je1.C46537u0;
import p749xh.C66261f3;
import te3.C49712hj1;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.v */
public final class C52984v extends C14961i {

    /* renamed from: c */
    public final FinderItem f147887c;

    /* renamed from: d */
    public final long f147888d;

    /* renamed from: e */
    public final String f147889e;

    /* renamed from: f */
    public final boolean f147890f;

    /* renamed from: g */
    public final boolean f147891g;

    /* renamed from: h */
    public final int f147892h;

    /* renamed from: i */
    public final int f147893i;

    /* renamed from: j */
    public final C49712hj1 f147894j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52984v(FinderItem finderItem, long j, String str, boolean z, boolean z2, int i, int i2, C65866w.C14969b bVar, C49712hj1 hj12) {
        super(bVar);
        C87412m.m108594g(finderItem, C66261f3.COL_FINDEROBJECT);
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(hj12, "contextObj");
        this.f147887c = finderItem;
        this.f147888d = j;
        this.f147889e = str;
        this.f147890f = z;
        this.f147891g = z2;
        this.f147892h = i;
        this.f147893i = i2;
        this.f147894j = hj12;
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo14007a(aVar);
        new C46537u0(this, this.f147894j).mo9225i().mo123420E(new C65865u(this, aVar));
    }

    /* renamed from: c */
    public String mo14008c() {
        return "id_" + this.f147888d + '_' + this.f147890f;
    }

    public String toString() {
        return "action_" + this.f147888d + '_' + this.f147890f + '_' + this.f147892h + '_' + this.f41018b;
    }
}
