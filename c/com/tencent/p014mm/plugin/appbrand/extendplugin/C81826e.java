package com.tencent.p014mm.plugin.appbrand.extendplugin;

import do0.C86384a;
import fo0.C87012a;
import io0.C87781e;
import jo0.C87995c;
import jo0.C87997d;
import lo0.C88603c;
import lo0.C88606e;
import no0.C89045b;
import p292ad.C79502b;
import p301cd.C80005q;
import p964fd.C86826e;
import p980id.C87696b;
import p980id.C87697c;
import po0.C89415e;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.e */
public class C81826e implements C87697c {

    /* renamed from: d */
    public static C81826e f240086d;

    public C87696b lj0(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1367751899:
                if (str.equals("camera")) {
                    c = 0;
                    break;
                }
                break;
            case -1367706280:
                if (str.equals("canvas")) {
                    c = 1;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 2;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c = 3;
                    break;
                }
                break;
            case 1693182669:
                if (str.equals("liveplayer")) {
                    c = 4;
                    break;
                }
                break;
            case 1702014259:
                if (str.equals("livepusher")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C86384a();
            case 1:
                return new C87012a();
            case 2:
                return new C89045b();
            case 3:
                C86826e eVar = new C86826e();
                eVar.mo121267B(new C89415e());
                return eVar;
            case 4:
                C79502b bVar = new C79502b();
                bVar.f233100n = new C87995c();
                bVar.f233099j = new C87997d();
                bVar.f233098i = new C87781e();
                ((C87995c) bVar.f233100n).f254602a = bVar;
                return bVar;
            case 5:
                C80005q qVar = new C80005q();
                qVar.f234330o = new C88603c();
                qVar.f234329n = new C88606e();
                qVar.f234328j = new C87781e();
                return qVar;
            default:
                return null;
        }
    }
}
