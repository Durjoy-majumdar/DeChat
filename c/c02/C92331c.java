package c02;

import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import di3.C7335d;
import java.util.List;

/* renamed from: c02.c */
public interface C92331c extends C7335d {
    void A70(HandOff handOff);

    /* renamed from: Bn */
    void mo58349Bn(String str);

    void Cd0(String str);

    void Eq0(String str, String str2, String str3);

    /* renamed from: Fi */
    void mo58353Fi();

    void Gg0(HandOff handOff);

    /* renamed from: Hk */
    void mo58355Hk(HandOff handOff);

    void I10(HandOff handOff);

    /* renamed from: LH */
    boolean mo58357LH();

    void Ll0(BallInfo ballInfo);

    /* renamed from: Ls */
    void mo58359Ls(String str);

    void V70(List<? extends BallInfo> list);

    /* renamed from: Xv */
    void mo58361Xv(HandOff handOff);

    /* renamed from: bE */
    void mo58362bE(HandOff handOff);

    void co0(HandOff handOff);

    /* renamed from: cv */
    HandOff mo58364cv(String str);

    boolean f70(String str, C72683d dVar);

    /* renamed from: gP */
    boolean mo58366gP(BallInfo ballInfo, boolean z);

    /* renamed from: jO */
    HandOff mo58367jO();

    void k00(HandOff handOff);

    HandOff lt0(String str);

    void m50();

    void nd0(MultiTaskInfo multiTaskInfo);

    void oq0(String str);

    void pi0(List<? extends MultiTaskInfo> list);

    /* renamed from: qN */
    void mo58374qN(GetOnLineInfoInfoResult getOnLineInfoInfoResult);

    /* renamed from: rt */
    void mo58375rt(HandOff handOff);

    boolean sc0(String str, long j);

    /* renamed from: tt */
    void mo58377tt(HandOff handOff);

    /* renamed from: uG */
    void mo58378uG(MultiTaskInfo multiTaskInfo);

    void x20(String str, String str2, int i, String str3);

    void zw0(String str, String str2);
}
