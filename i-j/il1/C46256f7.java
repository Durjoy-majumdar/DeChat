package il1;

import android.content.Context;
import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import je1.C46546x0;
import nj3.C76912y0;
import p763ym.C79138l;
import pe3.C89349b;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C64789vy0;

/* renamed from: il1.f7 */
public final class C46256f7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<String> f124694d;

    /* renamed from: e */
    public final /* synthetic */ String f124695e;

    /* renamed from: f */
    public final /* synthetic */ C62660c f124696f;

    /* renamed from: g */
    public final /* synthetic */ boolean f124697g;

    /* renamed from: h */
    public final /* synthetic */ Context f124698h;

    /* renamed from: i */
    public final /* synthetic */ String f124699i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46256f7(C8479f0<String> f0Var, String str, C62660c cVar, boolean z, Context context, String str2) {
        super(0);
        this.f124694d = f0Var;
        this.f124695e = str;
        this.f124696f = cVar;
        this.f124697g = z;
        this.f124698h = context;
        this.f124699i = str2;
    }

    public Object invoke() {
        String str;
        boolean z;
        Class cls = C55001u.class;
        Class cls2 = C79138l.class;
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.extInfo = (String) this.f124694d.f27484d;
        WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = Build.SDK_INT;
        wXMediaMessage.messageExt = (String) this.f124694d.f27484d;
        C44561j UV = ((C79138l) C86312j.m106911c(cls2)).mo74003UV(this.f124695e, Integer.MAX_VALUE);
        StringBuilder sb = new StringBuilder();
        sb.append("jumpGame, openId:");
        sb.append(UV != null ? UV.field_openId : null);
        sb.append(", appInfo:");
        sb.append(UV == null);
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
        new C46546x0(((C55001u) this.f124696f.mo87696x0(cls)).f154416j, ((C55001u) this.f124696f.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) this.f124696f.mo87696x0(cls)).f154417n), ((C55001u) this.f124696f.mo87696x0(cls)).f154423t, 0).mo9225i();
        C64789vy0 vy02 = ((C54991o) this.f124696f.mo87696x0(C54991o.class)).f154294a4;
        Integer valueOf = vy02 != null ? Integer.valueOf(vy02.f186017i) : null;
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "jumpGame platformId:" + valueOf + ", passEmptyOpenId:" + this.f124697g);
        if ((valueOf != null && valueOf.intValue() == 1) || this.f124697g) {
            String str2 = UV.field_packageName;
            if (str2 == null) {
                str2 = "";
            }
            str = "Finder.FinderLiveVisitorGameTeamWidget";
            z = ((C79138l) C86312j.m106911c(cls2)).yw0(this.f124698h, str2, wXMediaMessage, this.f124695e, "", 2, C60386d7.f172191a, new Bundle());
        } else {
            z = ((C79138l) C86312j.m106911c(cls2)).mo74010gu(this.f124698h, this.f124695e, wXMediaMessage, 2, C60392e7.f172197a, new Bundle());
            str = "Finder.FinderLiveVisitorGameTeamWidget";
        }
        if (!z) {
            Log.m105928w(str, "launchAppByWeChat failed, request and toast");
            ((C79138l) C86312j.m106911c(cls2)).mo74004WW(this.f124695e, this.f124699i, (C79138l.C53540a) null);
            C76912y0.makeText(this.f124698h, (int) C0966R.string.dnr, 0).show();
        }
        return C13598b0.f38549a;
    }
}
