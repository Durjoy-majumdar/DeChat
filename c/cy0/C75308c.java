package cy0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45825h;
import gw0.C76073b;
import gy3.C87412m;
import java.io.IOException;
import java.util.List;
import ke3.C88144b;
import p243tn.C14050a;
import p248ug.C102027b;
import s90.C77627f;
import s90.C77630j;
import s90.C77631m;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: cy0.c */
public final class C75308c {
    /* renamed from: a */
    public static final void m90328a(Context context, long j, long j2, int i, Bundle bundle) {
        String str;
        String str2;
        boolean z;
        int i2;
        C77630j jVar;
        Context context2 = context;
        long j3 = j2;
        Bundle bundle2 = bundle;
        Class cls = C45696d.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bundle2, "bundle");
        Intent intent = new Intent();
        intent.putExtra("biz_video_msg_id", j);
        intent.putExtra("biz_video_msg_svr_id", j3);
        intent.putExtra("KPublisherId", "msg_" + j3);
        intent.putExtra("biz_video_msg_index", i);
        intent.putExtra("biz_video_session_id", C19636w0.f55626c);
        intent.putExtras(bundle2);
        intent.putExtra("webpageTitle", bundle2.getString("webpageTitle"));
        C77631m mVar = new C77631m();
        mVar.f226305o = intent.getStringExtra("KPublisherId");
        mVar.f226299f = intent.getStringExtra("sns_local_id");
        long longExtra = intent.getLongExtra("biz_video_msg_id", -1);
        mVar.f226297d = longExtra;
        boolean z2 = false;
        if (longExtra > -1) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(mVar.f226297d);
            if (b002.mo100967F3() || b002.mo101020w3()) {
                mVar.f226298e = intent.getLongExtra("biz_video_msg_svr_id", 0);
                mVar.f226300g = intent.getIntExtra("biz_video_msg_index", 0);
                mVar.f226302i = b002.mo108768t();
                if (b002.mo100967F3() || !b002.mo101020w3()) {
                    C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(b002.getMsgId(), b002.getContent());
                    if (JZ == null || Util.isNullOrNil((List) JZ.f226295i)) {
                        Log.m105928w("MicroMsg.BizVideoUtil", "getBizReaderItem reader is null");
                    } else {
                        mVar.f226303j = JZ.f226292f;
                        mVar.f226304n = JZ.f226293g;
                        jVar = mVar.f226300g >= JZ.f226295i.size() ? JZ.f226295i.get(0) : JZ.f226295i.get(mVar.f226300g);
                        mVar.f226307q = jVar;
                        mVar.f226301h = b002.getType();
                    }
                } else {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                    if (u == null) {
                        Log.m105928w("MicroMsg.BizVideoUtil", "parse content fail");
                    } else {
                        jVar = new C77630j();
                        mVar.f226303j = u.f195634v;
                        mVar.f226304n = u.f195638w;
                        jVar.f226326e = u.f195586j;
                        jVar.f226325d = u.f195570f;
                        jVar.f226332n = u.f195574g;
                        jVar.f226330i = u.f195646y;
                        C68065f fVar = (C68065f) u.mo93555w(C68065f.class);
                        if (fVar == null) {
                            Log.m105928w("MicroMsg.BizVideoUtil", "piece content fail");
                        } else {
                            jVar.f226315G = fVar.f195425j;
                            jVar.f226329h = (long) fVar.f195418c;
                            jVar.f226333o = fVar.f195417b;
                            jVar.f226317I = fVar.f195423h;
                            jVar.f226335q = fVar.f195419d;
                            jVar.f226313E = fVar.f195420e;
                            jVar.f226314F = fVar.f195421f;
                            mVar.f226306p = fVar.f195424i;
                            mVar.f226307q = jVar;
                            mVar.f226301h = b002.getType();
                        }
                    }
                }
                jVar = null;
                mVar.f226307q = jVar;
                mVar.f226301h = b002.getType();
            }
        }
        try {
            if (C86709a0.m107531m().mo58407a().mo71804b() && (((i2 = mVar.f226307q.f226333o) == 5 || i2 == 8) && mVar.f226308r.size() == 0)) {
                mVar.f226308r.add(C14050a.m13405b(C102027b.m134386a(mVar.f226307q.f226330i, 4, true)));
            }
            intent.putExtra("biz_mp_msg_info", mVar.toByteArray());
            intent.putExtra("rawUrl", mVar.f226307q.f226326e);
        } catch (IOException e) {
            Log.m105921e("MicroMsg.MPMsgInfo", "writeToIntent %s", e.getMessage());
        }
        int i3 = bundle2.getInt("biz_video_scene", 10000);
        int i4 = bundle2.getInt(C74928u.C74929b.f220309a, 10000);
        String string = bundle2.getString("biz_video_autoplay_id", "");
        if (Util.isNullOrNil(mVar.f226307q.f226326e)) {
            Log.m105921e("MicroMsg.BizVideoUtil", "onVideoMsgClick url is null, %s", Util.getStack());
            return;
        }
        intent.putExtra("srcUsername", mVar.f226301h == 285212721 ? mVar.f226302i : mVar.f226303j);
        intent.putExtra("srcDisplayname", mVar.f226304n);
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        if (i3 == 90) {
            C45825h.f123727a.mo71296i(4, mVar.f226301h == 285212721 ? mVar.f226302i : mVar.f226303j, mVar.f226307q.f226326e);
        }
        String F2 = ((C45696d) C86709a0.m107533q(cls)).mo70959F2(mVar.f226307q.f226326e, i3, i4, currentTimeMillis);
        C87412m.m108593f(F2, "redirectUrl");
        C87412m.m108593f(string, "autoPlayId");
        int i5 = C19636w0.f55626c;
        if (C112550d0.m153801u(F2, "mp.weixin.qq.com", false) && (i5 > 0 || !Util.isNullOrNil(string))) {
            int E = C112550d0.m153769E(F2, "#", 0, false, 6, (Object) null);
            if (E > 0) {
                str = F2.substring(0, E);
                C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                str2 = F2.substring(E);
                C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
            } else {
                str2 = "";
                str = F2;
            }
            if (!C112550d0.m153801u(F2, "?", false)) {
                str = str + '?';
                z = true;
            } else {
                z = false;
            }
            if (!Util.isNullOrNil(string)) {
                str = str + "&autoplayid=" + string;
            }
            String str3 = str;
            if (z) {
                str3 = C112551y.m153816p(str3, "?&", "?", false, 4, (Object) null);
            }
            F2 = str3 + str2;
        }
        String str4 = F2;
        if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(i3)) {
            if (((C45696d) C86709a0.m107533q(cls)).Ms0(context, str4, mVar.f226307q.f226333o, true, i3, i4, intent)) {
                z2 = true;
            }
        }
        if (!z2) {
            intent.putExtra("rawUrl", str4);
            C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
