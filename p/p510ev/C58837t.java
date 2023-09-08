package p510ev;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import gy3.C87412m;
import h81.C32735h;
import ke3.C88144b;
import ma2.C99812l0;
import ma2.C99814o0;
import p529fv.C59331r;
import p763ym.C79138l;
import qc0.C101106m;
import ra2.C101365a;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C64488kb1;
import te3.C64719t23;
import za2.C102984b;

@C86522b
/* renamed from: ev.t */
public class C58837t extends C86301e implements C59331r {
    /* renamed from: Fq */
    public void mo84021Fq(Context context, int i, String str) {
        int i2 = C99812l0.f292500a;
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&content_ID=%s", new Object[]{Integer.valueOf(i), str});
        Intent intent = new Intent();
        intent.putExtra("rawUrl", format);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: PC */
    public boolean mo84022PC() {
        int i = C99812l0.f292500a;
        return true;
    }

    /* renamed from: QS */
    public boolean mo84023QS() {
        int i = C99812l0.f292500a;
        return true;
    }

    /* renamed from: ZA */
    public void mo84024ZA(Context context, int i, String str, String str2) {
        int i2 = C99812l0.f292500a;
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&content_ID=%s&comment_ID=%s", new Object[]{Integer.valueOf(i), str, str2});
        Intent intent = new Intent();
        intent.putExtra("rawUrl", format);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    public String d40(C101106m mVar) {
        return C99812l0.m130300e(mVar);
    }

    public void hd0(C101106m mVar, C64488kb1 kb12, Activity activity, C64719t23 t232) {
        int i = C99812l0.f292500a;
        C115669n.INSTANCE.kvStat(10910, "3");
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141246U(kb12.f183904d);
        rc02.mo141236J(kb12.f183910j);
        rc02.mo141235I(kb12.f183912o);
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(27);
        rd02.mo141273f(Util.nowMilliSecond());
        if (((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(C99812l0.m130299d(mVar))) {
            rd02.mo141272d(C99812l0.m130299d(mVar));
        }
        rc02.mo141240O(mVar.f295966n);
        rc02.mo141241P(mVar.f295967o);
        rc02.mo141242Q(mVar.f295968p);
        C101365a jo = C99814o0.wx0().mo140855jo(C102984b.m136164a(mVar));
        if (!Util.isNullOrNil(jo.field_songHAlbumUrl)) {
            rc02.mo141267w(jo.field_songHAlbumUrl);
        } else {
            rc02.mo141267w(jo.field_songAlbumUrl);
        }
        rc02.mo141231E(true);
        String f = C99812l0.m130301f(mVar);
        if (C86013q1.m106450k(f)) {
            rc02.f299286W = f;
        } else {
            rc02.mo141232F(true);
        }
        rc02.mo141246U(mVar.f295962g);
        rc02.mo141265u(mVar.f295963h);
        rc02.mo141260p(29);
        rc02.mo141235I(mVar.f295976x);
        rc02.mo141236J(mVar.f295969q);
        C101841sc0 sc02 = new C101841sc0();
        if (t232 != null) {
            sc02.f299401C = t232;
        }
        rc02.f299296c1 = sc02;
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264679d = mVar.f295962g;
        aVar.f264680e = mVar.f295963h;
        aVar.f264676a = kd02;
        aVar.f264678c = 21;
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264684i = activity;
        aVar2.f264688m = 3;
        doFavoriteEvent.publish();
    }

    /* renamed from: kM */
    public boolean mo84027kM() {
        int i = C99812l0.f292500a;
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_type_flag, C104160f.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1;
    }

    /* renamed from: pv */
    public String mo84028pv(C101106m mVar) {
        return C99812l0.m130299d(mVar);
    }

    /* renamed from: q1 */
    public boolean mo84029q1(String str) {
        int i = C99812l0.f292500a;
        return C87412m.m108589b("wx5aa333606550dfd5", str);
    }

    /* renamed from: xB */
    public boolean mo84030xB(String str, String str2) {
        int i = C99812l0.f292500a;
        return !Util.isNullOrNil(str) || !Util.isNullOrNil(str2);
    }

    /* renamed from: zw */
    public String mo84031zw(C101106m mVar) {
        return C99812l0.m130301f(mVar);
    }
}
