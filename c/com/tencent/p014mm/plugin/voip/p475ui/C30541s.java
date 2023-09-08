package com.tencent.p014mm.plugin.voip.p475ui;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.wxmm.v2encoder;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.voip.ui.s */
public final class C30541s extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C30540n> f82280d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30541s(ArrayList<C30540n> arrayList) {
        super(1);
        this.f82280d = arrayList;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        ArrayList<C30540n> arrayList = this.f82280d;
        byte[] decode = Base64.decode(str, 0);
        C87412m.m108593f(decode, "decode(it, Base64.DEFAULT)");
        arrayList.add(new C30540n(decode[2], decode[3], decode[4], decode[5], decode[6], decode[7], (((byte) (decode[8] & Byte.MAX_VALUE)) << 0) | (((byte) (decode[9] & Byte.MAX_VALUE)) << 8) | (((byte) (decode[10] & Byte.MAX_VALUE)) << v2encoder.enumCODEC_vcodec2) | (((byte) (decode[11] & Byte.MAX_VALUE)) << 24)));
        return C13598b0.f38549a;
    }
}
