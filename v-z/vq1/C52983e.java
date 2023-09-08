package vq1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import je1.C46535t;
import p749xh.C66261f3;
import te3.C49712hj1;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.e */
public final class C52983e extends C14961i {

    /* renamed from: c */
    public final FinderItem f147880c;

    /* renamed from: d */
    public final long f147881d;

    /* renamed from: e */
    public final String f147882e;

    /* renamed from: f */
    public final boolean f147883f;

    /* renamed from: g */
    public final int f147884g;

    /* renamed from: h */
    public final C49712hj1 f147885h;

    /* renamed from: i */
    public final int f147886i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52983e(FinderItem finderItem, long j, String str, boolean z, int i, C65866w.C14969b bVar, C49712hj1 hj12, int i2) {
        super(bVar);
        C87412m.m108594g(finderItem, C66261f3.COL_FINDEROBJECT);
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(hj12, "contextObj");
        this.f147880c = finderItem;
        this.f147881d = j;
        this.f147882e = str;
        this.f147883f = z;
        this.f147884g = i;
        this.f147885h = hj12;
        this.f147886i = i2;
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo14007a(aVar);
        new C46535t(this, this.f147885h).mo9225i().mo123420E(new C65852d(this, aVar));
    }

    /* renamed from: c */
    public String mo14008c() {
        return "id_" + this.f147881d + '_' + this.f147883f;
    }

    public String toString() {
        return "action_" + this.f147881d + '_' + this.f147883f + '_' + this.f147884g + '_' + this.f41018b;
    }
}
