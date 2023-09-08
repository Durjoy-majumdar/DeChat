package p637ou;

import android.text.TextUtils;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import p529fv.C98043l;
import p652pu.C100910b;
import qc0.C101106m;
import qc0.C101107p;
import qc0.C62602o;
import qc0.C89588n;
import te3.C64719t23;

@C86522b
/* renamed from: ou.b */
public class C100461b extends C86301e implements C100910b {
    public C101106m Au0(String str, TimeLineObject timeLineObject, int i, C62602o oVar) {
        return C101107p.m132495c(str, timeLineObject, i, oVar);
    }

    /* renamed from: If */
    public C101106m mo139945If(C68070l.C68072b bVar, int i, String str, String str2, String str3, String str4, C62602o oVar) {
        if (bVar == null) {
            return null;
        }
        C101106m mVar = new C101106m();
        mVar.f295959d = i;
        mVar.f295960e = str;
        mVar.f295961f = 0.0f;
        mVar.f295964i = "";
        mVar.f295965j = str2;
        mVar.f295970r = str4;
        C72916m mVar2 = (C72916m) bVar.mo93555w(C72916m.class);
        if (mVar2 == null || TextUtils.isEmpty(mVar2.f212520c)) {
            mVar.f295969q = null;
        } else {
            mVar.f295969q = mVar2.f212520c;
            mVar.f295976x = mVar2.f212519b;
        }
        if (mVar2 == null || Util.isNullOrNil(mVar2.f212525h)) {
            mVar.f295963h = bVar.f195574g;
        } else {
            mVar.f295963h = mVar2.f212525h;
        }
        mVar.f295962g = bVar.f195570f;
        mVar.f295968p = bVar.f195586j;
        mVar.f295967o = !Util.isNullOrNil(bVar.f195533U) ? bVar.f195533U : bVar.f195590k;
        mVar.f295966n = bVar.f195530T;
        mVar.f295972t = bVar.f195562d;
        mVar.f295952M = ((C98043l) C86312j.m106911c(C98043l.class)).mo58311iJ();
        C101107p.m132496d(mVar, oVar);
        return mVar;
    }

    public C101106m K40(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return C89588n.m112021a(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public C101106m Qn0(String str, TimeLineObject timeLineObject, int i) {
        return C101107p.m132495c(str, timeLineObject, i, (C62602o) null);
    }

    /* renamed from: sL */
    public C101106m mo139948sL(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, C62602o oVar) {
        return C101107p.m132494b(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, oVar);
    }

    /* renamed from: vQ */
    public C62602o mo139949vQ(String str, C64719t23 t232) {
        return C62602o.m73561a(str, t232);
    }

    /* renamed from: z5 */
    public void mo139950z5(C101106m mVar, C62602o oVar) {
        C101107p.m132496d(mVar, oVar);
    }
}
