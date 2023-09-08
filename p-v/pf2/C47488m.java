package pf2;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import p565ir.C60606n;
import sj3.C63941p;
import te3.C51713vn0;
import te3.C52257zg;
import te3.C64273c21;

/* renamed from: pf2.m */
public final class C47488m implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C47489n f127388a;

    /* renamed from: b */
    public final /* synthetic */ C52257zg f127389b;

    /* renamed from: c */
    public final /* synthetic */ TextView f127390c;

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOnliveWidget f127391d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveOnliveWidget f127392e;

    /* renamed from: f */
    public final /* synthetic */ TextView f127393f;

    public C47488m(C47489n nVar, C52257zg zgVar, TextView textView, FinderLiveOnliveWidget finderLiveOnliveWidget, FinderLiveOnliveWidget finderLiveOnliveWidget2, TextView textView2) {
        this.f127388a = nVar;
        this.f127389b = zgVar;
        this.f127390c = textView;
        this.f127391d = finderLiveOnliveWidget;
        this.f127392e = finderLiveOnliveWidget2;
        this.f127393f = textView2;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        if (j == 0) {
            Log.m105924i(this.f127388a.f127394A, "query fail, liveId = 0");
        }
        if (!this.f127389b.f145868f.equals(this.f127390c.getTag(C0966R.C0970id.mxm))) {
            Log.m105924i(this.f127388a.f127394A, "recycled");
            return;
        }
        if (obj != null && (obj instanceof C51713vn0)) {
            C51713vn0 vn02 = (C51713vn0) obj;
            if (vn02.f143572d != null) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).Ks0(this.f127389b.f145868f, vn02.f143572d);
                C63941p pVar = C63941p.f181254a;
                C64273c21 c212 = vn02.f143572d;
                FinderLiveOnliveWidget finderLiveOnliveWidget = this.f127391d;
                C87412m.m108593f(finderLiveOnliveWidget, "liveOnIcon");
                FinderLiveOnliveWidget finderLiveOnliveWidget2 = this.f127392e;
                C87412m.m108593f(finderLiveOnliveWidget2, "liveEndIcon");
                pVar.mo88711i(c212, finderLiveOnliveWidget, finderLiveOnliveWidget2);
            }
        }
        String str = "";
        if (obj != null && (obj instanceof C51713vn0)) {
            C51713vn0 vn03 = (C51713vn0) obj;
            if (!Util.isNullOrNil(vn03.f143575g)) {
                str = vn03.f143575g;
                C87412m.m108591d(str);
            }
        }
        this.f127393f.setText(str);
    }
}
