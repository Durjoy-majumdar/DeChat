package p1093bh;

import android.graphics.Canvas;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import me3.C109612c;
import p520fi.C107548f;

/* renamed from: bh.l */
public final class C104103l extends C104085b<C107548f> {

    /* renamed from: o */
    public final String f307981o = "MicroMsg.FilterArtist";

    /* renamed from: k */
    public C104084a mo145700k() {
        return C104084a.FILTER;
    }

    /* renamed from: q */
    public void mo145706q() {
        super.mo145706q();
        C107548f fVar = (C107548f) mo145692c();
        if (fVar != null) {
            fVar.f321779g = ((C109612c) this.f307884a).f328163f;
        }
    }

    /* renamed from: s */
    public void mo145708s(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        C107548f fVar = (C107548f) mo145692c();
        if (fVar != null) {
            fVar.mo157980i(canvas, false);
        }
        Log.m105924i(this.f307981o, "lxl artist onDeadDraw");
    }

    /* renamed from: v */
    public void mo145711v(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        C107548f fVar = (C107548f) mo145692c();
        if (fVar != null) {
            fVar.mo157980i(canvas, false);
        }
        Log.m105924i(this.f307981o, "lxl artist draw");
    }

    /* renamed from: y */
    public void mo145714y() {
    }
}
