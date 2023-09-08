package uj1;

import com.tencent.p014mm.plugin.finder.live.view.FinderLiveExtendReadingEditView;
import dh1.C7329b;
import fj1.C45795b;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import pe3.C89349b;
import rp1.C63486a;
import rx3.C13598b0;
import te3.C51575uo1;
import te3.C64424hi3;
import te3.C64699s51;
import te3.C64722t51;
import te3.C64795w51;

/* renamed from: uj1.d */
public final class C65396d extends C87413o implements C32228q<Integer, String, C51575uo1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65374a f188202d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65396d(C65374a aVar) {
        super(3);
        this.f188202d = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int intValue = ((Number) obj).intValue();
        String str6 = (String) obj2;
        C51575uo1 uo12 = (C51575uo1) obj3;
        C87412m.m108594g(str6, "uri");
        int i = FinderLiveExtendReadingEditView.f159709s;
        String str7 = "";
        if (intValue == 1) {
            C63486a aVar = this.f188202d.f188163e;
            if (aVar != null) {
                C64699s51 s512 = new C64699s51();
                s512.f185341d = 2;
                C64722t51 t512 = new C64722t51();
                if (uo12 == null || (str3 = uo12.f142981g) == null) {
                    str3 = str7;
                }
                t512.f185503f = str3;
                t512.f185504g = str6;
                if (uo12 == null || (str4 = uo12.f142978d) == null) {
                    str4 = str7;
                }
                t512.f185501d = str4;
                if (!(uo12 == null || (str5 = uo12.f142980f) == null)) {
                    str7 = str5;
                }
                t512.f185505h = str7;
                s512.f185343f = new C89349b(t512.toByteArray());
                C63486a.C63487a.m74824a(aVar, s512, (Boolean) null, 2, (Object) null);
                C63486a aVar2 = this.f188202d.f188163e;
                if (aVar2 != null) {
                    C45795b S2 = aVar2.mo87856S2();
                    if (S2 != null) {
                        C7329b.m7473b(C7329b.f25441a, S2, 3, 2, str6, 0, 16, (Object) null);
                    }
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else if (intValue == 2) {
            C63486a aVar3 = this.f188202d.f188163e;
            if (aVar3 != null) {
                C64699s51 s513 = new C64699s51();
                s513.f185341d = 7;
                C64795w51 w512 = new C64795w51();
                LinkedList<C64424hi3> linkedList = new LinkedList<>();
                C64424hi3 hi32 = new C64424hi3();
                hi32.f183501f = str6;
                if (uo12 == null || (str = uo12.f142981g) == null) {
                    str = str7;
                }
                hi32.f183500e = str;
                if (!(uo12 == null || (str2 = uo12.f142978d) == null)) {
                    str7 = str2;
                }
                hi32.f183499d = str7;
                linkedList.add(hi32);
                w512.f186059d = linkedList;
                s513.f185343f = new C89349b(w512.toByteArray());
                C63486a.C63487a.m74824a(aVar3, s513, (Boolean) null, 2, (Object) null);
                C63486a aVar4 = this.f188202d.f188163e;
                if (aVar4 != null) {
                    C45795b S22 = aVar4.mo87856S2();
                    if (S22 != null) {
                        C7329b.m7473b(C7329b.f25441a, S22, 3, 4, str6, 0, 16, (Object) null);
                    }
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
