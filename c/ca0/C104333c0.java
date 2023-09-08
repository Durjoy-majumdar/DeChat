package ca0;

import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24665d;
import p175j0.C33489x1;
import p175j0.C60686v;
import p267x.C111897d1;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103138e;
import p435a0.C103141f;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p436a1.C103274x;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p544h2.C108014f;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: ca0.c0 */
public final class C104333c0 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MJMusicInfo f308846d;

    /* renamed from: e */
    public final /* synthetic */ long f308847e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104333c0(MJMusicInfo mJMusicInfo, long j) {
        super(2);
        this.f308846d = mJMusicInfo;
        this.f308847e = j;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            int i = C111294a.f333218a;
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            int i2 = C65503j.f188489K0;
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            float f = (float) 8;
            C65503j e = C103166l0.m136521e(aVar, ((float) 1.5d) * f, 0.0f, 2, (Object) null);
            MJMusicInfo mJMusicInfo = this.f308846d;
            long j = this.f308847e;
            hVar.mo51557H(693286680);
            C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, hVar, 48);
            hVar.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) hVar.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) hVar.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) hVar.mo51598m(vVar3);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(e);
            if (hVar.mo51543A() instanceof C24665d) {
                hVar.mo51615v();
                if (hVar.mo51621y()) {
                    hVar.mo51612t(aVar2);
                } else {
                    hVar.mo51579c();
                }
                hVar.mo51561L();
                C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                C108508o2.m147049a(hVar, a, pVar);
                C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                C108508o2.m147049a(hVar, dVar, pVar2);
                C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                C108508o2.m147049a(hVar, oVar, pVar3);
                C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                C108508o2.m147049a(hVar, i2Var, pVar4);
                hVar.mo51590i();
                MJMusicInfo mJMusicInfo2 = mJMusicInfo;
                C32227p<C110269a, C108322d, C13598b0> pVar5 = pVar2;
                ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                hVar.mo51557H(2058660585);
                hVar.mo51557H(-678309503);
                C32227p<C110269a, C108322d, C13598b0> pVar6 = pVar5;
                C32227p<C110269a, C33183o, C13598b0> pVar7 = pVar3;
                C32227p<C110269a, C103633i2, C13598b0> pVar8 = pVar4;
                long j2 = j;
                C32227p<C110269a, C109895y, C13598b0> pVar9 = pVar;
                C60686v vVar4 = vVar;
                C32224a<C110269a> aVar3 = aVar2;
                C111897d1.m152617a(C110954a.m151256d(C0966R.raw.icons_filled_music, hVar, 0), (String) null, C103214y0.m136594j(aVar, ((float) 2.5d) * f), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar, JsApiAddDownloadTaskStraight.CTRL_INDEX, 120);
                float f2 = ((float) 1) * f;
                C65503j e2 = C103166l0.m136521e(aVar, f2, 0.0f, 2, (Object) null);
                hVar.mo51557H(733328855);
                C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
                hVar.mo51557H(-1323940314);
                C108322d dVar2 = (C108322d) hVar.mo51598m(vVar4);
                C33183o oVar2 = (C33183o) hVar.mo51598m(vVar2);
                C103633i2 i2Var2 = (C103633i2) hVar.mo51598m(vVar3);
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a3 = C109863q.m149330a(e2);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar3);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C108508o2.m147049a(hVar, c, pVar9);
                    C108508o2.m147049a(hVar, dVar2, pVar6);
                    C108508o2.m147049a(hVar, oVar2, pVar7);
                    C108508o2.m147049a(hVar, i2Var2, pVar8);
                    hVar.mo51590i();
                    ((C35747b) a3).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-2137368960);
                    String songName = mJMusicInfo2.getSongName();
                    if (songName == null) {
                        songName = "";
                    }
                    long F = ((C108322d) hVar.mo51598m(vVar4)).mo143031F((float) 15);
                    long j3 = ((C104344e0) hVar.mo51598m(C104353p.f308980a)).f308946e;
                    C65503j l = C103214y0.m136596l(aVar, ((float) 13) * f);
                    C111294a aVar4 = C111294a.C111295a.f333222d;
                    C87412m.m108594g(l, "<this>");
                    C65503j i0 = l.mo74972i0(new C103138e(aVar4, false, C103612c1.f306063a));
                    C108504h hVar2 = hVar;
                    C104335e.m139318a(songName, true, j2, i0, true, j3, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, 0, 0, 0, false, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, 1597488, 0, 262016);
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51610s();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    C65503j.C65504a aVar5 = aVar;
                    C111897d1.m152617a(C110954a.m151256d(C0966R.raw.arrow_right, hVar2, 0), "music_icon", C103214y0.m136595k(aVar5, ((float) 0.5d) * f, f2), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar2, JsApiAddDownloadTaskStraight.CTRL_INDEX, 120);
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                    hVar2.mo51610s();
                    hVar2.mo51565P();
                    hVar2.mo51565P();
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
