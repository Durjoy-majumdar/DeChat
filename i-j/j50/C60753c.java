package j50;

import a14.C0000n0;
import android.os.Bundle;
import b50.C54410e;
import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import w50.C15044g;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C119027c;
import z40.C66733d;

@C91590f(mo125468c = "com.tencent.mm.live.core.core.trtc.AbsLiveTRTCCore$handleSeiMessage$1", mo125469f = "AbsLiveTRTCCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: j50.c */
public final class C60753c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ int f173064d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f173065e;

    /* renamed from: f */
    public final /* synthetic */ C60735a f173066f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60753c(int i, byte[] bArr, C60735a aVar, C15601d<? super C60753c> dVar) {
        super(2, dVar);
        this.f173064d = i;
        this.f173065e = bArr;
        this.f173066f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60753c(this.f173064d, this.f173065e, this.f173066f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60753c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        C104289g m;
        ResultKt.throwOnFailure(obj);
        if (!(this.f173064d == 0 || (bArr = this.f173065e) == null)) {
            boolean z = true;
            if (!(bArr.length == 0)) {
                C8479f0 f0Var = new C8479f0();
                T str = new String(this.f173065e, C119027c.f356488a);
                f0Var.f27484d = str;
                int H = C112550d0.m153772H((CharSequence) str, "\\0", 0, false, 6, (Object) null);
                if (H != -1 && H == ((String) f0Var.f27484d).length() - 2) {
                    T substring = ((String) f0Var.f27484d).substring(0, H);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    f0Var.f27484d = substring;
                }
                C15044g gVar = C15044g.f41178a;
                StringBuilder sb = new StringBuilder();
                sb.append("handleSeiMessage seiMode:");
                sb.append(this.f173064d);
                sb.append(" anchorId:");
                sb.append(this.f173066f.f172989A.f166260g);
                sb.append(" isMicIntercom: ");
                C66733d dVar = C66733d.f191763a;
                sb.append(dVar.mo90766c());
                sb.append(" seiMessage:");
                sb.append((String) f0Var.f27484d);
                gVar.mo14069a("handleSeiMessage", 2, "MicroMsg.LiveCore", sb.toString());
                this.f173066f.getClass();
                String str2 = null;
                if (C112550d0.m153803w((String) f0Var.f27484d, "TencentStreamSEI", false, 2, (Object) null)) {
                    return C13598b0.f38549a;
                }
                try {
                    C104289g gVar2 = new C104289g((String) f0Var.f27484d);
                    this.f173066f.f173005Q0 = (String) f0Var.f27484d;
                    int optInt = gVar2.optInt("wxT");
                    if (optInt != 0) {
                        if (!Util.isNullOrNil(gVar2.optString("d"))) {
                            if (C61926c.m72696u(optInt, 8) && (m = gVar2.optJSONObject("d")) != null) {
                                C60735a aVar = this.f173066f;
                                long optLong = m.optLong("anchorT");
                                Bundle bundle = new Bundle();
                                bundle.putString("live_cdn_sei_msg", gVar2.optString("d"));
                                bundle.putLong("live_cdn_sei_msg_time", optLong);
                                C54410e eVar = aVar.f173038x;
                                if (eVar != null) {
                                    eVar.callback(29, bundle);
                                }
                            }
                            if (C61926c.m72696u(optInt, 32)) {
                                String optString = gVar2.optString("d");
                                C87412m.m108593f(optString, LocaleUtil.ITALIAN);
                                if (optString.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    str2 = optString;
                                }
                                if (str2 != null) {
                                    C60735a.m71077M(this.f173066f, str2);
                                }
                            }
                            if (C61926c.m72696u(this.f173064d, 4) && C61926c.m72696u(optInt, 4)) {
                                Bundle bundle2 = new Bundle();
                                C60735a aVar2 = this.f173066f;
                                bundle2.putString("live_cdn_sei_msg", gVar2.optString("d"));
                                C54410e eVar2 = aVar2.f173038x;
                                if (eVar2 != null) {
                                    eVar2.callback(18, bundle2);
                                }
                            } else if (C61926c.m72696u(this.f173064d, 16) && C61926c.m72696u(optInt, 16)) {
                                if (dVar.mo90766c()) {
                                    Bundle bundle3 = new Bundle();
                                    C60735a aVar3 = this.f173066f;
                                    bundle3.putString("live_link_mic_info_in_anchor_sei_msg_mt", gVar2.optString("mt"));
                                    bundle3.putString("live_cdn_sei_msg", gVar2.optString("d"));
                                    C54410e eVar3 = aVar3.f173038x;
                                    if (eVar3 != null) {
                                        eVar3.callback(28, bundle3);
                                    }
                                } else {
                                    Bundle bundle4 = new Bundle();
                                    C60735a aVar4 = this.f173066f;
                                    C60735a.m71078N(aVar4, 16, gVar2.optString("d"));
                                    bundle4.putString("live_cdn_sei_msg", gVar2.optString("d"));
                                    bundle4.putString("live_link_mic_info_in_anchor_sei_msg", gVar2.optString("m"));
                                    C54410e eVar4 = aVar4.f173038x;
                                    if (eVar4 != null) {
                                        eVar4.callback(20, bundle4);
                                    }
                                }
                            }
                            return C13598b0.f38549a;
                        }
                    }
                    if (C61926c.m72696u(this.f173064d, 1) && C112550d0.m153803w((CharSequence) f0Var.f27484d, "sgame", false, 2, (Object) null)) {
                        C60735a.m71078N(this.f173066f, 1, (String) f0Var.f27484d);
                    }
                    if (C61926c.m72696u(this.f173064d, 2) && C112550d0.m153803w((CharSequence) f0Var.f27484d, "subtitle", false, 2, (Object) null) && gVar2.optInt("wxT") == 2) {
                        Bundle bundle5 = new Bundle();
                        C60735a aVar5 = this.f173066f;
                        bundle5.putString("live_cdn_sei_msg", (String) f0Var.f27484d);
                        C54410e eVar5 = aVar5.f173038x;
                        if (eVar5 != null) {
                            eVar5.callback(21, bundle5);
                        }
                    }
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.LiveCore", "handleSeiMessage Exception:" + e.getMessage() + " seiMessage:" + ((String) f0Var.f27484d));
                }
                return C13598b0.f38549a;
            }
        }
        Log.m105924i("MicroMsg.LiveCore", "skip handleSeiMessage seiMode " + this.f173064d + " seiData: " + this.f173065e);
        return C13598b0.f38549a;
    }
}
