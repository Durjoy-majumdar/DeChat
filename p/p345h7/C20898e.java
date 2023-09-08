package p345h7;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p333e8.C20541m;
import p345h7.C20923v;

/* renamed from: h7.e */
public final class C20898e implements C20923v.C20926c {

    /* renamed from: a */
    public final int f59078a;

    /* renamed from: b */
    public final List<Format> f59079b;

    public C20898e(int i, List<Format> list) {
        this.f59078a = i;
        if (!mo32618d(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.m16647h((String) null, MimeTypes.APPLICATION_CEA608, 0, (String) null, (DrmInitData) null));
        }
        this.f59079b = list;
    }

    /* renamed from: a */
    public C20923v mo32615a(int i, C20923v.C20925b bVar) {
        if (i == 2) {
            return new C20913o(new C20902i());
        }
        if (i == 3 || i == 4) {
            return new C20913o(new C20911m(bVar.f59274a));
        }
        if (i != 15) {
            if (i == 21) {
                return new C20913o(new C20910l());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C20913o(new C20908k(mo32617c(bVar)));
                }
                if (i == 89) {
                    return new C20913o(new C20900g(bVar.f59275b));
                }
                if (i != 138) {
                    if (i != 129) {
                        if (i != 130) {
                            if (i != 134) {
                                if (i != 135) {
                                    return null;
                                }
                            } else if (mo32618d(16)) {
                                return null;
                            } else {
                                return new C20917r(new C20919t());
                            }
                        }
                    }
                    return new C20913o(new C20895b(bVar.f59274a));
                }
                return new C20913o(new C20899f(bVar.f59274a));
            } else if (mo32618d(4)) {
                return null;
            } else {
                return new C20913o(new C20904j(mo32617c(bVar), mo32618d(1), mo32618d(8)));
            }
        } else if (mo32618d(2)) {
            return null;
        } else {
            return new C20913o(new C20897d(false, bVar.f59274a));
        }
    }

    /* renamed from: b */
    public SparseArray<C20923v> mo32616b() {
        return new SparseArray<>();
    }

    /* renamed from: c */
    public final C20918s mo32617c(C20923v.C20925b bVar) {
        ArrayList arrayList;
        int i;
        String str;
        if (mo32618d(32)) {
            return new C20918s(this.f59079b);
        }
        C20541m mVar = new C20541m(bVar.f59276c);
        List<Format> list = this.f59079b;
        while (mVar.f57811c - mVar.f57810b > 0) {
            int n = mVar.mo32103n();
            int n2 = mVar.f57810b + mVar.mo32103n();
            if (n == 134) {
                ArrayList arrayList2 = new ArrayList();
                int n3 = mVar.mo32103n() & 31;
                for (int i2 = 0; i2 < n3; i2++) {
                    String l = mVar.mo32101l(3);
                    int n4 = mVar.mo32103n();
                    if ((n4 & 128) != 0) {
                        i = n4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    arrayList2.add(Format.m16648i((String) null, str, (String) null, -1, 0, l, i, (DrmInitData) null, MAlarmHandler.NEXT_FIRE_INTERVAL, Collections.emptyList()));
                    mVar.mo32114y(2);
                }
                arrayList = arrayList2;
            } else {
                arrayList = list;
            }
            mVar.mo32113x(n2);
            list = arrayList;
        }
        return new C20918s(list);
    }

    /* renamed from: d */
    public final boolean mo32618d(int i) {
        return (i & this.f59078a) != 0;
    }
}
