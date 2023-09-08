package r80;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import s80.C110777a;
import s80.C110779b;
import w80.C111742d;

/* renamed from: r80.c */
public final class C110514c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110505a f330483d;

    /* renamed from: e */
    public final /* synthetic */ boolean f330484e;

    /* renamed from: f */
    public final /* synthetic */ long f330485f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f330486g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f330487h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110514c(C110505a aVar, boolean z, long j, Bitmap bitmap, Bitmap bitmap2) {
        super(0);
        this.f330483d = aVar;
        this.f330484e = z;
        this.f330485f = j;
        this.f330486g = bitmap;
        this.f330487h = bitmap2;
    }

    public Object invoke() {
        if (!this.f330483d.f330458v) {
            Log.m105920e(this.f330483d.f330438b, "requestDraw not init now");
        } else if (!this.f330484e || this.f330483d.f330445i) {
            try {
                String str = this.f330483d.f330438b;
                Log.m105918d(str, "render pts:" + this.f330485f);
                long currentTicks = Util.currentTicks();
                C110777a aVar = this.f330483d.f330437a;
                if (aVar instanceof C110779b) {
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.media.render.MixRenderer");
                    ((C110779b) aVar).mo162337v(this.f330486g, this.f330487h);
                }
                String str2 = this.f330483d.f330438b;
                Log.m105918d(str2, "render cost " + Util.ticksToNow(currentTicks));
                long currentTicks2 = Util.currentTicks();
                C110505a aVar2 = this.f330483d;
                if (aVar2.f330443g != null) {
                    aVar2.mo161981j(this.f330485f);
                    C111742d.C65942b bVar = this.f330483d.f330441e;
                    if (bVar != null) {
                        C111742d.f334647a.mo163474t(bVar.f189591a, bVar.f189592b);
                    }
                    String str3 = this.f330483d.f330438b;
                    Log.m105918d(str3, "swap buffer cost " + Util.ticksToNow(currentTicks2));
                }
                C32226l<? super Boolean, C13598b0> lVar = this.f330483d.f330442f;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f330483d.f330438b, e, "", new Object[0]);
                C32226l<? super Boolean, C13598b0> lVar2 = this.f330483d.f330442f;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.FALSE);
                }
            }
        } else {
            Log.m105924i(this.f330483d.f330438b, "waitFistFrameAvailable and not firstFrameAvailable now, ignore");
            C32226l<? super Boolean, C13598b0> lVar3 = this.f330483d.f330442f;
            if (lVar3 != null) {
                lVar3.invoke(Boolean.TRUE);
            }
        }
        return C13598b0.f38549a;
    }
}
