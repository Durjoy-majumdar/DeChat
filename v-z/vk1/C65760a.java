package vk1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import c50.C54655b;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import fl1.C59158e;
import fl1.C59161f;
import fl1.C59244y2;
import gy3.C87412m;

/* renamed from: vk1.a */
public abstract class C65760a extends C56032b {

    /* renamed from: d */
    public C59244y2 f189164d;

    /* renamed from: e */
    public C59161f f189165e;

    /* renamed from: f */
    public C59158e f189166f;

    /* renamed from: g */
    public C54655b f189167g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65760a(Context context, Fragment fragment, AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        C87412m.m108594g(context, "context");
        MMFinderUI mMFinderUI = (MMFinderUI) context;
        this.f189164d = new C59244y2(mMFinderUI);
        this.f189165e = new C59161f(mMFinderUI);
        this.f189166f = new C59158e(mMFinderUI);
    }

    public final C54655b getLiveCore() {
        return this.f189167g;
    }

    public final C59158e getLiveEndUIC() {
        return this.f189166f;
    }

    public final C59244y2 getLivePrepareUIC() {
        return this.f189164d;
    }

    public abstract /* synthetic */ int getLiveRole();

    public final C59161f getLiveStartUIC() {
        return this.f189165e;
    }

    public final C59161f getStartUIC() {
        return this.f189165e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r2 = r2.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void prepareToStart(boolean r9) {
        /*
            r8 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            fl1.f r1 = r8.f189165e
            if (r9 == 0) goto L_0x00ef
            java.lang.Class<cl1.h1> r9 = cl1.C54979h1.class
            vk1.a r2 = r1.f166837f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0012
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r2, r4, r5, r3)
        L_0x0012:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r6 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            r2.putBoolean(r6, r5)
            vk1.a r6 = r1.f166837f
            if (r6 == 0) goto L_0x0025
            d60.b$b r7 = d60.C58124b.C58125b.START_LIVE
            r6.statusChange(r7, r2)
        L_0x0025:
            c50.b r2 = r1.f166839h
            if (r2 == 0) goto L_0x0033
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0033
            boolean r2 = r2.f166264k
            if (r2 != r5) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0052
            qj1.i3 r2 = r1.f169230n
            if (r2 == 0) goto L_0x0052
            androidx.lifecycle.i0 r6 = r2.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            int r6 = r6.f154369t3
            if (r6 != 0) goto L_0x0045
            goto L_0x0052
        L_0x0045:
            qj1.ee r7 = r2.f178296u
            r7.mo87768h(r6)
            qj1.ee r6 = r2.f178296u
            r6.mo87766f()
            r2.mo87796b1(r5)
        L_0x0052:
            qj1.i3 r2 = r1.f169230n
            if (r2 == 0) goto L_0x0066
            com.tencent.mm.live.core.view.LivePreviewView r2 = r2.f178293r
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout r2 = r2.getRenderRatioLayout()
            if (r2 == 0) goto L_0x0066
            fl1.c2 r6 = new fl1.c2
            r6.<init>(r1)
            r2.post(r6)
        L_0x0066:
            qj1.y3 r2 = r1.f169202Q0
            if (r2 == 0) goto L_0x006d
            r2.mo88047d1()
        L_0x006d:
            r6 = 200(0xc8, double:9.9E-322)
            fl1.d2 r2 = new fl1.d2
            r2.<init>(r1)
            o40.C61926c.m72666K(r6, r2)
            androidx.lifecycle.i0 r2 = r1.mo83051g(r9)
            cl1.h1 r2 = (cl1.C54979h1) r2
            fj1.b r6 = r1.f166851d
            androidx.lifecycle.i0 r9 = r6.mo71262a(r9)
            cl1.h1 r9 = (cl1.C54979h1) r9
            cm1.i2 r9 = r9.f154147v
            boolean r6 = r9 instanceof tf0.C64919s1
            if (r6 == 0) goto L_0x008e
            tf0.s1 r9 = (tf0.C64919s1) r9
            goto L_0x008f
        L_0x008e:
            r9 = r3
        L_0x008f:
            if (r9 == 0) goto L_0x0096
            long r6 = r9.mo13074d()
            goto L_0x0098
        L_0x0096:
            r6 = 0
        L_0x0098:
            r2.f154148w = r6
            vk1.a r9 = r1.f166837f
            if (r9 == 0) goto L_0x00a5
            ok1.e r2 = ok1.C62042e.f176370a
            fj1.b r6 = r1.f166851d
            r2.mo87124v1(r6, r9)
        L_0x00a5:
            java.lang.Class<yg1.e> r9 = yg1.C66636e.class
            androidx.lifecycle.i0 r9 = r1.mo83051g(r9)
            yg1.e r9 = (yg1.C66636e) r9
            r9.mo90686c3()
            re1.a r9 = gg1.C32444a.f86224z2
            java.lang.Object r9 = r9.mo60266n()
            r2 = r9
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != r5) goto L_0x00c0
            r4 = 1
        L_0x00c0:
            if (r4 == 0) goto L_0x00c3
            r3 = r9
        L_0x00c3:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x00f2
            r3.booleanValue()
            androidx.lifecycle.i0 r9 = r1.mo83051g(r0)
            cl1.o r9 = (cl1.C54991o) r9
            te3.s41 r0 = new te3.s41
            r0.<init>()
            r1 = 2
            r0.f185335d = r1
            java.lang.String r1 = "这是测试文案，不是后台下发文案"
            r0.f185338g = r1
            java.lang.String r1 = "test"
            r0.f185339h = r1
            java.lang.String r1 = "https://mmocgame.qpic.cn/wechatgame/491KtdHdGbZZKy8RFvcVaMzw5iaVfLYgISDoOef2mFL0y7cQECIzia9bZ5FUcA1fS3/0"
            r0.f185340i = r1
            cl1.s r1 = new cl1.s
            r1.<init>(r9, r0)
            o40.C61926c.m72668M(r1)
            goto L_0x00f2
        L_0x00ef:
            r1.mo84367A()
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk1.C65760a.prepareToStart(boolean):void");
    }

    public final void setLiveCore(C54655b bVar) {
        this.f189167g = bVar;
    }

    public final void setLiveEndUIC(C59158e eVar) {
        C87412m.m108594g(eVar, "<set-?>");
        this.f189166f = eVar;
    }

    public final void setLivePrepareUIC(C59244y2 y2Var) {
        C87412m.m108594g(y2Var, "<set-?>");
        this.f189164d = y2Var;
    }

    public final void setLiveStartUIC(C59161f fVar) {
        C87412m.m108594g(fVar, "<set-?>");
        this.f189165e = fVar;
    }
}
