package vk1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gl1.C59547g;
import gl1.C59559k;
import gl1.C59572m2;
import gy3.C87412m;
import j50.C60735a;

/* renamed from: vk1.b */
public abstract class C65761b extends C56032b {

    /* renamed from: d */
    public C59572m2 f189168d;

    /* renamed from: e */
    public C59559k f189169e;

    /* renamed from: f */
    public C59547g f189170f;

    /* renamed from: g */
    public C60735a f189171g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65761b(Context context, Fragment fragment, AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        C87412m.m108594g(context, "context");
        MMFinderUI mMFinderUI = (MMFinderUI) context;
        this.f189168d = new C59572m2(mMFinderUI);
        this.f189169e = new C59559k(mMFinderUI);
        this.f189170f = new C59547g(mMFinderUI);
    }

    public final C60735a getLiveCore() {
        return this.f189171g;
    }

    public final C59547g getLiveEndUIC() {
        return this.f189170f;
    }

    public final C59572m2 getLivePrepareUIC() {
        return this.f189168d;
    }

    public abstract /* synthetic */ int getLiveRole();

    public final C59559k getLiveStartUIC() {
        return this.f189169e;
    }

    public final C59559k getStartUIC() {
        return this.f189169e;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [cm1.i2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void prepareToStart(boolean r7) {
        /*
            r6 = this;
            gl1.k r0 = r6.f189169e
            if (r7 == 0) goto L_0x0066
            java.lang.Class<cl1.h1> r7 = cl1.C54979h1.class
            vk1.b r1 = r0.f166842f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0010
            r4 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r1, r4, r3, r2)
        L_0x0010:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r4 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            r1.putBoolean(r4, r3)
            vk1.b r4 = r0.f166842f
            if (r4 == 0) goto L_0x0023
            d60.b$b r5 = d60.C58124b.C58125b.START_LIVE
            r4.statusChange(r5, r1)
        L_0x0023:
            r0.mo84606l(r3)
            androidx.lifecycle.i0 r1 = r0.mo83051g(r7)
            cl1.h1 r1 = (cl1.C54979h1) r1
            fj1.b r3 = r0.f166851d
            androidx.lifecycle.i0 r7 = r3.mo71262a(r7)
            cl1.h1 r7 = (cl1.C54979h1) r7
            cm1.i2 r7 = r7.f154147v
            boolean r3 = r7 instanceof tf0.C64919s1
            if (r3 == 0) goto L_0x003d
            r2 = r7
            tf0.s1 r2 = (tf0.C64919s1) r2
        L_0x003d:
            if (r2 == 0) goto L_0x0044
            long r2 = r2.mo13074d()
            goto L_0x0046
        L_0x0044:
            r2 = 0
        L_0x0046:
            r1.f154148w = r2
            vk1.b r7 = r0.f166842f
            if (r7 == 0) goto L_0x0053
            ok1.e r1 = ok1.C62042e.f176370a
            fj1.b r2 = r0.f166851d
            r1.mo87124v1(r2, r7)
        L_0x0053:
            qj1.y3 r7 = r0.f170234a1
            if (r7 == 0) goto L_0x005a
            r7.mo88047d1()
        L_0x005a:
            java.lang.Class<yg1.e> r7 = yg1.C66636e.class
            androidx.lifecycle.i0 r7 = r0.mo83051g(r7)
            yg1.e r7 = (yg1.C66636e) r7
            r7.mo90686c3()
            goto L_0x0069
        L_0x0066:
            r0.mo84608n()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk1.C65761b.prepareToStart(boolean):void");
    }

    public final void setLiveCore(C60735a aVar) {
        this.f189171g = aVar;
    }

    public final void setLiveEndUIC(C59547g gVar) {
        C87412m.m108594g(gVar, "<set-?>");
        this.f189170f = gVar;
    }

    public final void setLivePrepareUIC(C59572m2 m2Var) {
        C87412m.m108594g(m2Var, "<set-?>");
        this.f189168d = m2Var;
    }

    public final void setLiveStartUIC(C59559k kVar) {
        C87412m.m108594g(kVar, "<set-?>");
        this.f189169e = kVar;
    }
}
