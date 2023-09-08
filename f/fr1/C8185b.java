package fr1;

import android.content.Context;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.newtips.NewTipPreference;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import gy3.C87412m;
import ht1.C60200t1;
import pj3.C47511g;
import rs1.C13442s8;
import te3.C50119ke1;
import te3.C64586nn1;

/* renamed from: fr1.b */
public final class C8185b implements C8195i, C8196j {

    /* renamed from: a */
    public final String f27084a;

    /* renamed from: b */
    public final C47511g f27085b;

    /* renamed from: c */
    public final Context f27086c;

    /* renamed from: d */
    public final String f27087d = "Finder.PosterCenterLiveIncomePref";

    /* renamed from: e */
    public C50119ke1 f27088e;

    /* renamed from: f */
    public String f27089f = "";

    /* renamed from: fr1.b$a */
    public static final class C8186a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C8185b f27090d;

        public C8186a(C8185b bVar) {
            this.f27090d = bVar;
        }

        public void onChanged(Object obj) {
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            Class cls = FinderCommonFeatureService.class;
            C8185b bVar = this.f27090d;
            Preference a = bVar.f27085b.mo72519a(bVar.f27084a);
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.newtips.NewTipPreference");
            boolean z = false;
            ((NewTipPreference) a).mo25956f(aVar != null ? aVar.f12908a : false);
            if (aVar != null && aVar.f12908a) {
                z = true;
            }
            if (z) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderLiveIncomeEntrance");
                C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveIncomeEntrance");
                if (R5 != null && G5 != null) {
                    String str = G5.field_ctrInfo.f144673h;
                    if (str == null) {
                        str = "";
                    }
                    if (!C87412m.m108589b(str, this.f27090d.f27089f)) {
                        C8185b bVar2 = this.f27090d;
                        bVar2.f27089f = str;
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8 f = C13442s8.f38060Q0.mo12873f(bVar2.f27086c);
                        C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                    }
                }
            }
        }
    }

    public C8185b(String str, C47511g gVar, Context context) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(gVar, "preferenceScreen");
        C87412m.m108594g(context, "context");
        this.f27084a = str;
        this.f27085b = gVar;
        this.f27086c = context;
    }

    /* renamed from: a */
    public void mo9233a() {
        Class cls = C60200t1.class;
        Class cls2 = FinderCommonFeatureService.class;
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("FinderLiveIncomeEntrance");
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("FinderLiveIncomeEntrance");
        if (!(R5 == null || G5 == null)) {
            C58413v0 v0Var = C58413v0.f167346a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f27086c);
            C58413v0.m67781i(v0Var, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, G5, R5, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
        }
        ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77239M5("FinderLiveIncomeEntrance");
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.ey0((C58417y0) c, this.f27086c, 0, false, 2, 9, false, 0, (String) null, (String) null, 384, (Object) null);
        ((C60200t1) C86312j.m106911c(cls)).Pb0(this.f27086c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9234b(boolean r10) {
        /*
            r9 = this;
            te3.ke1 r10 = r9.f27088e
            r0 = 1
            if (r10 != 0) goto L_0x000c
            pj3.g r10 = r9.f27085b
            java.lang.String r1 = r9.f27084a
            r10.mo72529n(r1, r0)
        L_0x000c:
            te3.ke1 r10 = r9.f27088e
            if (r10 == 0) goto L_0x00dd
            java.util.LinkedList<te3.zg3> r10 = r10.f136709z
            r1 = 0
            if (r10 == 0) goto L_0x0041
            java.util.Iterator r10 = r10.iterator()
        L_0x0019:
            boolean r2 = r10.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r10.next()
            r4 = r2
            te3.zg3 r4 = (te3.C52261zg3) r4
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f145918e
            if (r4 == 0) goto L_0x002d
            java.lang.String r3 = r4.username
        L_0x002d:
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0019
            r3 = r2
        L_0x003a:
            te3.zg3 r3 = (te3.C52261zg3) r3
            if (r3 == 0) goto L_0x0041
            int r10 = r3.f145924n
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            boolean r2 = o40.C61926c.m72696u(r10, r0)
            java.lang.Class<ky2.i> r3 = ky2.C10432i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ky2.i r3 = (ky2.C10432i) r3
            boolean r3 = r3.mo10750e()
            java.lang.Class<tf0.q1> r4 = tf0.C13887q1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            tf0.q1 r4 = (tf0.C13887q1) r4
            fe1.d$b r5 = fe1.C58961d.f168673a
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            fe1.q r5 = r5.mo84155b(r6)
            if (r5 == 0) goto L_0x006b
            long r5 = r5.field_liveSwitchFlag
            goto L_0x006d
        L_0x006b:
            r5 = 0
        L_0x006d:
            boolean r4 = r4.Zh0(r5)
            java.lang.String r5 = r9.f27087d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "initLiveIncomeCell FinderLive.entrance,xLab enable live:"
            r6.append(r7)
            gg1.a r7 = gg1.C32444a.f86121a
            boolean r8 = r7.mo58620a()
            r6.append(r8)
            java.lang.String r8 = ", server flag:"
            r6.append(r8)
            r6.append(r10)
            java.lang.String r10 = ", server enable live:"
            r6.append(r10)
            r6.append(r2)
            java.lang.String r10 = " rewardGainEnable:"
            r6.append(r10)
            r6.append(r4)
            java.lang.String r10 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            er1.w3 r10 = er1.C58784w3.f168295a
            boolean r10 = r10.mo83910X0()
            if (r10 != 0) goto L_0x00b5
            boolean r10 = r7.mo58620a()
            if (r10 != 0) goto L_0x00b5
            if (r2 == 0) goto L_0x00d6
        L_0x00b5:
            if (r4 == 0) goto L_0x00d6
            if (r3 != 0) goto L_0x00d6
            pj3.g r10 = r9.f27085b
            java.lang.String r0 = r9.f27084a
            r10.mo72529n(r0, r1)
            com.tencent.mm.plugin.finder.extension.reddot.n0 r10 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12955a
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r10 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12948E
            android.content.Context r0 = r9.f27086c
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            fr1.b$a r1 = new fr1.b$a
            r1.<init>(r9)
            o40.C61926c.m72695t(r10, r0, r1)
            goto L_0x00dd
        L_0x00d6:
            pj3.g r10 = r9.f27085b
            java.lang.String r1 = r9.f27084a
            r10.mo72529n(r1, r0)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fr1.C8185b.mo9234b(boolean):void");
    }

    /* renamed from: c */
    public String mo9235c() {
        return this.f27084a;
    }

    /* renamed from: d */
    public void mo9239d(C50119ke1 ke12) {
        C87412m.m108594g(ke12, "prepareResp");
        this.f27088e = ke12;
    }

    public void onCreate() {
        this.f27085b.mo72529n(this.f27084a, true);
    }

    public void onResume() {
    }

    public void onStop() {
    }
}
