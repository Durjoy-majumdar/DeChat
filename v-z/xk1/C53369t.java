package xk1;

import android.content.Context;
import android.os.Bundle;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import ob0.C89132b;
import p763ym.C79138l;
import rx3.C13598b0;
import te3.C50169kr1;
import te3.C52120yi0;
import te3.cg4;
import z04.C112551y;

/* renamed from: xk1.t */
public final class C53369t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f150182d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<C52120yi0> f150183e;

    /* renamed from: f */
    public final /* synthetic */ C66355w f150184f;

    /* renamed from: g */
    public final /* synthetic */ String f150185g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53369t(C45795b bVar, C89132b.C89134c<C52120yi0> cVar, C66355w wVar, String str) {
        super(0);
        this.f150182d = bVar;
        this.f150183e = cVar;
        this.f150184f = wVar;
        this.f150185g = str;
    }

    public Object invoke() {
        boolean z;
        String str;
        ((C54991o) this.f150182d.mo71262a(C54991o.class)).mo75959F4(((C52120yi0) this.f150183e.f256796d).f145310h);
        C66355w wVar = this.f150184f;
        String str2 = this.f150185g;
        Class cls = C79138l.class;
        String str3 = wVar.f191025d;
        StringBuilder sb = new StringBuilder();
        sb.append("jumpGame ");
        C50169kr1 kr12 = wVar.f191042x;
        sb.append(kr12 != null ? kr12.f137005h : null);
        sb.append(", ");
        C50169kr1 kr13 = wVar.f191042x;
        sb.append(kr13 != null ? kr13.f137001d : null);
        sb.append(", ");
        sb.append(str2);
        Log.m105924i(str3, sb.toString());
        String n = C112551y.m153814n(C112551y.m153814n(str2, "=", "%3d", false), "&", "%26", false);
        String str4 = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_" + n;
        cg4 cg4 = wVar.f191043y;
        if (!(cg4 == null || (str = cg4.f182480h) == null)) {
            str4 = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_AuthCode_" + str + "_Start_" + n;
        }
        Log.m105924i(wVar.f191025d, "jumpGame buff:" + str4);
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = Build.SDK_INT;
        wXMediaMessage.messageExt = str4;
        C44561j UV = ((C79138l) C86312j.m106911c(cls)).mo74003UV(wVar.f191039u, Integer.MAX_VALUE);
        String str5 = wVar.f191025d;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("jumpGame, openId:");
        sb4.append(UV != null ? UV.field_openId : null);
        sb4.append(", appInfo:");
        boolean z2 = true;
        sb4.append(UV == null);
        Log.m105924i(str5, sb4.toString());
        C66313h0 h0Var = new C66313h0(wVar);
        cg4 cg42 = wVar.f191043y;
        if (cg42 == null || cg42.f182478f != 1) {
            z2 = false;
        }
        if (z2 || wVar.f191018E) {
            String str6 = UV.field_packageName;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = str6;
            Log.m105924i(wVar.f191025d, "jumpGame without openId, pkg:" + str7);
            z = ((C79138l) C86312j.m106911c(cls)).yw0(wVar.getContext(), str7, wXMediaMessage, wVar.f191039u, "", 2, h0Var, new Bundle());
        } else {
            z = ((C79138l) C86312j.m106911c(cls)).mo74010gu(wVar.getContext(), wVar.f191039u, wXMediaMessage, 2, h0Var, new Bundle());
        }
        if (!z) {
            Log.m105928w(wVar.f191025d, "launchAppByWeChat failed, request and toast");
            C79138l lVar = (C79138l) C86312j.m106911c(cls);
            String str8 = wVar.f191039u;
            C50169kr1 kr14 = wVar.f191042x;
            lVar.mo74004WW(str8, kr14 != null ? kr14.f137005h : null, (C79138l.C53540a) null);
            C76912y0.makeText((Context) wVar.getContext(), (int) C0966R.string.dnr, 0).show();
        }
        return C13598b0.f38549a;
    }
}
