package com.tencent.mars.smc;

import java.util.ArrayList;
import java.util.LinkedList;
import pe3.C89349b;
import re3.C48021k;
import re3.C48022l;
import re3.C63390a;
import re3.C63391b;
import re3.C63392c;
import re3.C63393d;
import re3.C63394e;
import re3.C63395f;
import re3.C63396g;
import re3.C63397h;
import re3.C63398i;
import re3.C63399j;
import re3.C63400m;
import re3.C63401n;
import re3.C63402o;
import te3.C64330dw;
import te3.C64349ew;
import te3.C64377fw;
import te3.C64469jh2;
import te3.C64492kh2;
import te3.C64610ol2;
import te3.C64765v33;
import te3.C64787vx1;
import te3.C64817wx1;
import te3.rc4;

public class SmcProtoBufUtil {
    private static C63402o fillStrategyTable(LinkedList<rc4> linkedList) {
        C63402o oVar = new C63402o();
        for (int i = 0; i < linkedList.size(); i++) {
            rc4 rc4 = linkedList.get(i);
            C63400m mVar = new C63400m();
            mVar.f179874d = rc4.f185149d;
            mVar.f179875e = rc4.f185150e;
            for (int i2 = 0; i2 < rc4.f185151f.size(); i2++) {
                C64765v33 v332 = rc4.f185151f.get(i2);
                C63401n nVar = new C63401n();
                nVar.f179877d = v332.f185820d;
                nVar.f179878e = v332.f185823g;
                nVar.f179879f = v332.f185821e;
                nVar.f179880g = v332.f185822f;
                nVar.f179881h = v332.f185824h;
                nVar.f179882i = v332.f185825i;
                nVar.f179883j = v332.f185826j;
                nVar.f179884n = v332.f185827n;
                mVar.f179876f.add(nVar);
            }
            oVar.f179885d.add(mVar);
        }
        return oVar;
    }

    public static C64787vx1 toMMGetStrategyReq() {
        C64787vx1 vx12 = new C64787vx1();
        ArrayList<Integer> strategyVersions = SmcLogic.getStrategyVersions();
        if (strategyVersions.size() != 6) {
            return null;
        }
        vx12.f186001d = strategyVersions.get(0).intValue();
        vx12.f186002e = strategyVersions.get(1).intValue();
        vx12.f186003f = strategyVersions.get(2).intValue();
        vx12.f186005h = strategyVersions.get(3).intValue();
        vx12.f186006i = strategyVersions.get(4).intValue();
        vx12.f186007j = strategyVersions.get(5).intValue();
        return vx12;
    }

    public static C64349ew toMMReportIdkeyReq(C63396g gVar) {
        C64349ew ewVar = new C64349ew();
        ewVar.f183033d = gVar.f179847d;
        ewVar.f183034e = gVar.f179848e;
        ewVar.f183035f = 0;
        for (int i = 0; i < gVar.f179849f.size(); i++) {
            C63391b bVar = gVar.f179849f.get(i);
            C64330dw dwVar = new C64330dw();
            dwVar.f182865d = bVar.f179812d;
            dwVar.f182867f = bVar.f179813e;
            dwVar.f182868g = bVar.f179815g;
            for (int i2 = 0; i2 < bVar.f179814f.size(); i2++) {
                C63390a aVar = bVar.f179814f.get(i2);
                C64610ol2 ol22 = new C64610ol2();
                ol22.f184671d = aVar.f179809d;
                ol22.f184674g = 0;
                ol22.f184673f = 0;
                ol22.f184675h = aVar.f179811f;
                ol22.f184672e = C89349b.m111674a(Integer.toString(aVar.f179810e).getBytes());
                dwVar.f182869h.add(ol22);
            }
            ewVar.f183036g.add(dwVar);
        }
        return ewVar;
    }

    public static C64349ew toMMReportKvReq(C63398i iVar) {
        C64349ew ewVar = new C64349ew();
        ewVar.f183033d = iVar.f179859d;
        ewVar.f183034e = iVar.f179860e;
        ewVar.f183035f = iVar.f179861f;
        for (int i = 0; i < iVar.f179862g.size(); i++) {
            C63394e eVar = iVar.f179862g.get(i);
            C64330dw dwVar = new C64330dw();
            dwVar.f182865d = eVar.f179828d;
            dwVar.f182867f = eVar.f179829e;
            dwVar.f182868g = eVar.f179830f;
            dwVar.f182866e = eVar.f179834j;
            dwVar.f182870i = eVar.f179832h;
            dwVar.f182871j = eVar.f179833i;
            dwVar.f182872n = eVar.f179835n;
            dwVar.f182873o = eVar.f179836o;
            dwVar.f182874p = eVar.f179837p;
            for (int i2 = 0; i2 < eVar.f179831g.size(); i2++) {
                C63393d dVar = eVar.f179831g.get(i2);
                C64610ol2 ol22 = new C64610ol2();
                ol22.f184671d = dVar.f179823d;
                ol22.f184672e = dVar.f179824e;
                ol22.f184673f = dVar.f179825f;
                ol22.f184674g = dVar.f179826g;
                ol22.f184675h = dVar.f179827h;
                dwVar.f182869h.add(ol22);
            }
            ewVar.f183036g.add(dwVar);
        }
        return ewVar;
    }

    public static C64469jh2 toMMSelfMonitor(C48021k kVar) {
        C64469jh2 jh22 = new C64469jh2();
        jh22.f183794d = kVar.f128805d;
        for (int i = 0; i < kVar.f128806e.size(); i++) {
            C64492kh2 kh22 = new C64492kh2();
            C48022l lVar = kVar.f128806e.get(i);
            kh22.f183934d = lVar.f128807d;
            kh22.f183935e = lVar.f128808e;
            kh22.f183936f = lVar.f128809f;
            kh22.f183937g = lVar.f128810g;
            kh22.f183938h = lVar.f128811h;
            kh22.f183939i = lVar.f128812i;
            kh22.f183940j = lVar.f128813j;
            kh22.f183941n = lVar.f128814n;
            jh22.f183795e.add(kh22);
        }
        return jh22;
    }

    public static C63392c toSmcIdkeyStrategyResp(C64817wx1 wx12) {
        C63392c cVar = new C63392c();
        cVar.f179816d = wx12.f186216d;
        cVar.f179817e = wx12.f186217e;
        cVar.f179818f = wx12.f186218f;
        cVar.f179821i = wx12.f186223n;
        cVar.f179822j = wx12.f186225p;
        cVar.f179819g = fillStrategyTable(wx12.f186220h);
        cVar.f179820h = fillStrategyTable(wx12.f186221i);
        return cVar;
    }

    public static C63395f toSmcKVStrategyResp(C64817wx1 wx12) {
        C63395f fVar = new C63395f();
        fVar.f179838d = wx12.f186216d;
        fVar.f179839e = wx12.f186226q;
        fVar.f179840f = wx12.f186227r;
        fVar.f179841g = wx12.f186228s;
        fVar.f179845n = wx12.f186223n;
        fVar.f179846o = wx12.f186225p;
        fVar.f179842h = fillStrategyTable(wx12.f186229t);
        fVar.f179843i = fillStrategyTable(wx12.f186230u);
        fVar.f179844j = fillStrategyTable(wx12.f186231v);
        return fVar;
    }

    public static C63397h toSmcReportIdkeyResp(C64377fw fwVar) {
        C63397h hVar = new C63397h();
        hVar.f179851d = fwVar.f183230d;
        hVar.f179852e = fwVar.f183231e;
        hVar.f179853f = fwVar.f183232f;
        hVar.f179856i = fwVar.f183237n;
        hVar.f179857j = fwVar.f183238o;
        hVar.f179858n = fwVar.f183239p;
        hVar.f179854g = fillStrategyTable(fwVar.f183234h);
        hVar.f179855h = fillStrategyTable(fwVar.f183235i);
        return hVar;
    }

    public static C63399j toSmcReportKvResp(C64377fw fwVar) {
        C63399j jVar = new C63399j();
        jVar.f179864d = fwVar.f183230d;
        jVar.f179865e = fwVar.f183231e;
        jVar.f179866f = fwVar.f183232f;
        jVar.f179867g = fwVar.f183233g;
        jVar.f179871n = fwVar.f183237n;
        jVar.f179872o = fwVar.f183238o;
        jVar.f179873p = fwVar.f183239p;
        jVar.f179868h = fillStrategyTable(fwVar.f183234h);
        jVar.f179869i = fillStrategyTable(fwVar.f183235i);
        jVar.f179870j = fillStrategyTable(fwVar.f183236j);
        return jVar;
    }
}
