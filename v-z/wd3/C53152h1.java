package wd3;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p728vs.C52990d;
import p728vs.C52991e;
import p823sg.C77710q;
import qe3.C12212g;
import qo3.C89779i0;

/* renamed from: wd3.h1 */
public class C53152h1 implements C11385n {

    /* renamed from: d */
    public Context f148303d;

    /* renamed from: e */
    public String f148304e;

    /* renamed from: f */
    public C52991e f148305f;

    /* renamed from: g */
    public C89779i0 f148306g;

    /* renamed from: h */
    public MTimerHandler f148307h = new MTimerHandler(new C53153a(), false);

    /* renamed from: wd3.h1$a */
    public class C53153a implements MTimerHandler.CallBack {

        /* renamed from: wd3.h1$a$a */
        public class C53154a implements DialogInterface.OnCancelListener {
            public C53154a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d((C117747y) C53152h1.this.f148305f);
                C53152h1.this.f148306g = null;
            }
        }

        public C53153a() {
        }

        public boolean onTimerExpired() {
            C53152h1 h1Var = C53152h1.this;
            Context context = h1Var.f148303d;
            h1Var.f148306g = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), C53152h1.this.f148303d.getString(C0966R.string.a4d), false, true, new C53154a());
            return false;
        }
    }

    public C53152h1(Context context) {
        this.f148303d = context;
    }

    /* renamed from: a */
    public void mo73842a(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ViewQZone", "go fail, qqNum is null");
            return;
        }
        this.f148304e = str;
        String str2 = (String) C97625j3.m125812b().mo105906u().mo119684e(46, (Object) null);
        String nullAsNil = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(72, (Object) null));
        Log.m105925i("MicroMsg.ViewQZone", "get a2key:[%s], get new a2key:[%s]", str2, nullAsNil);
        if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(nullAsNil)) {
            C97625j3.m125815e().mo123455a(233, this);
            this.f148305f = ((C52990d) C86312j.m106911c(C52990d.class)).mo73574Lx(C77710q.m93739b(str), C12212g.m11775a());
            C97625j3.m125815e().mo123460f((C117747y) this.f148305f);
            this.f148307h.startTimer(3000);
            return;
        }
        mo73843b(str);
    }

    /* renamed from: b */
    public final void mo73843b(String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f148303d.getString(C0966R.string.bpq, new Object[]{str}));
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("neverGetA8Key", true);
        C88144b.m109791i(this.f148303d, "webview", ".ui.tools.ContactQZoneWebView", intent, (Bundle) null);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        this.f148307h.stopTimer();
        C89779i0 i0Var = this.f148306g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C97625j3.m125815e().mo123470p(233, this);
        if (i == 0 && i2 == 0) {
            C52991e eVar = (C52991e) yVar;
            String R = eVar.mo63062R();
            if (R == null || R.length() == 0) {
                mo73843b(this.f148304e);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", R);
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("geta8key_session_id", eVar.getCurrentSessionId());
            C88144b.m109791i(this.f148303d, "webview", ".ui.tools.ContactQZoneWebView", intent, (Bundle) null);
            return;
        }
        Log.m105920e("MicroMsg.ViewQZone", "getA8Key fail, errType = " + i + ", errCode = " + i2);
        mo73843b(this.f148304e);
    }
}
