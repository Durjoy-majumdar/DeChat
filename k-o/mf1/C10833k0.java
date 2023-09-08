package mf1;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60905o;
import mf1.C10846o0;
import pf1.C11917o0;
import pf1.C11918p;
import pf1.C11920q;
import rf1.C12982a;
import zp3.C23555k;

/* renamed from: mf1.k0 */
public final class C10833k0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C11920q f32348a;

    /* renamed from: b */
    public final /* synthetic */ FinderJumpInfo f32349b;

    /* renamed from: c */
    public final /* synthetic */ C12982a f32350c;

    /* renamed from: d */
    public final /* synthetic */ String f32351d;

    /* renamed from: e */
    public final /* synthetic */ C10846o0.C10847a f32352e;

    public C10833k0(C11920q qVar, FinderJumpInfo finderJumpInfo, C12982a aVar, String str, C10846o0.C10847a aVar2) {
        this.f32348a = qVar;
        this.f32349b = finderJumpInfo;
        this.f32350c = aVar;
        this.f32351d = str;
        this.f32352e = aVar2;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        C87412m.m108594g(view, "view");
        return this.f32352e.f32403e.getItemId();
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (j != -1 || j2 != -1) {
            C11918p pVar = this.f32348a.f34832f;
            boolean z2 = false;
            if (!(pVar != null && !pVar.mo11805a())) {
                String str = this.f32349b.wording;
                if (str == null || str.length() == 0) {
                    z2 = true;
                }
                if (z2 && !this.f32350c.mo11021i(this.f32348a)) {
                    Log.m105924i("Finder.BaseAdFeedJumperUIC", "[onViewExposed] isExposed=" + z + ", jumper info is invalid, feedId=" + this.f32351d);
                    return;
                }
            }
            C12982a aVar = this.f32350c;
            C60905o oVar = this.f32352e.f32402d;
            C11920q qVar = this.f32348a;
            aVar.getClass();
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(qVar, "infoEx");
            C11917o0 o0Var = aVar.f37020i;
            if (o0Var != null) {
                o0Var.mo11786e(z, oVar, view, qVar);
            }
        }
    }
}
