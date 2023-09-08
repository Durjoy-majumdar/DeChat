package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a14.C0000n0;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32227p;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import p196ln.C76708i;
import p200lx.C10660k0;
import rx3.C13598b0;
import sx3.C110823p;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUIC$dealLocalGenCore$2", mo125469f = "ColorfulSelfQRCodeUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.p */
public final class C5389p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C5380o f21069d;

    /* renamed from: e */
    public final /* synthetic */ String f21070e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5389p(C5380o oVar, String str, C15601d<? super C5389p> dVar) {
        super(2, dVar);
        this.f21069d = oVar;
        this.f21070e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C5389p(this.f21069d, this.f21070e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C5389p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C10660k0.class;
        ResultKt.throwOnFailure(obj);
        MultiProcessMMKV.getMMKV("LocalGenFinishSuccess").putBoolean("LocalGenFinishSuccess", false);
        this.f21069d.f21043q.put(new Integer(996), BitmapUtil.Bitmap2PngBytes(((C10660k0) C86312j.m106911c(cls)).mo10927yp(this.f21070e, 1)));
        this.f21069d.f21043q.put(new Integer(997), BitmapUtil.Bitmap2PngBytes(((C10660k0) C86312j.m106911c(cls)).mo10927yp(this.f21070e, 2)));
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f21069d.f21040n);
        if (N50 == null || N50.getWidth() <= 0 || N50.getHeight() <= 0 || N50.getByteCount() <= 0) {
            Log.m105920e("MicroMsg.Setting.ColorfulSelfQRCodeUIC", "headImage null");
            return C13598b0.f38549a;
        }
        int[] o002 = ((C10660k0) C86312j.m106911c(cls)).o00(N50);
        if (!(o002 != null && o002.length == 2)) {
            return C13598b0.f38549a;
        }
        List<C5380o.C5383c> list = C5380o.f21031C;
        list.get(3).f21060f = C110823p.m151002b0(o002);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("qrcode");
        List<Integer> list2 = list.get(3).f21060f;
        mmkv.putInt("color1", list2 != null ? list2.get(0).intValue() : 0);
        MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("qrcode");
        List<Integer> list3 = list.get(3).f21060f;
        mmkv2.putInt("color2", list3 != null ? list3.get(1).intValue() : 0);
        list.get(3).f21059e = o002.length;
        StringBuilder sb = new StringBuilder();
        sb.append("record dominatorColor, size:");
        sb.append(o002.length);
        sb.append(", color1:");
        List<Integer> list4 = list.get(3).f21060f;
        Integer num = null;
        sb.append(list4 != null ? list4.get(0) : null);
        sb.append(", color2:");
        List<Integer> list5 = list.get(3).f21060f;
        if (list5 != null) {
            num = list5.get(1);
        }
        sb.append(num);
        Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUIC", sb.toString());
        this.f21069d.f21043q.put(new Integer(995), BitmapUtil.Bitmap2PngBytes(BitmapUtil.createBitmapWithColor(BitmapUtil.decodeByteArray((byte[]) ((LinkedHashMap) this.f21069d.f21043q).get(new Integer(997))), o002[0], o002[1])));
        MultiProcessMMKV.getMMKV("LocalGenFinishSuccess").putBoolean("LocalGenFinishSuccess", true);
        return C13598b0.f38549a;
    }
}
