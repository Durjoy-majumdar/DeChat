package d60;

import a60.C53979a;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d60.C58124b;
import e60.C58532b;
import eb0.C75592q0;
import gy3.C87412m;
import kg3.C76577a;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C47883u;
import qo3.C77426q;
import te3.C49242e7;
import z50.C53740h;

/* renamed from: d60.s1 */
public final class C58209s1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C58169j1 f166695d;

    /* renamed from: d60.s1$a */
    public static final class C58210a implements C47883u {

        /* renamed from: a */
        public static final C58210a f166696a = new C58210a();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: d60.s1$b */
    public static final class C58211b implements C47883u {

        /* renamed from: a */
        public static final C58211b f166697a = new C58211b();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    public C58209s1(C58169j1 j1Var) {
        this.f166695d = j1Var;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = true;
        yVar.setHasCallbackToQueue(true);
        C53740h hVar = (C53740h) yVar;
        C49242e7 e7Var = hVar.f150863e;
        String str2 = e7Var != null ? e7Var.f132750d : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = "[cgi]doApplyMic errType:" + i + " errCode:" + i2 + " errMsg:" + str + " micid:" + str2;
        C87412m.m108594g(str3, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str3);
        if (i2 != 0) {
            switch (i2) {
                case -100065:
                    C77426q qVar = new C77426q(this.f166695d.f166607g);
                    qVar.mo107606r(this.f166695d.f166607g.getResources().getString(C0966R.string.g7z));
                    qVar.mo107601m(C0966R.string.f8028zq);
                    qVar.mo107600l(C58210a.f166696a);
                    qVar.mo107603o();
                    this.f166695d.mo82942C0();
                    return;
                case -100064:
                    C77426q qVar2 = new C77426q(this.f166695d.f166607g);
                    qVar2.mo107606r(this.f166695d.f166607g.getResources().getString(C0966R.string.g7a));
                    qVar2.mo107601m(C0966R.string.f8028zq);
                    qVar2.mo107600l(C58211b.f166697a);
                    qVar2.mo107603o();
                    this.f166695d.mo82942C0();
                    return;
            }
        } else {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            C53979a aVar = RoomLiveService.f157185Q;
            aVar.getClass();
            aVar.f151235j = str2;
            C49242e7 e7Var2 = hVar.f150863e;
            if (e7Var2 != null) {
                if (!WeChatEnvironment.hasDebugger() || !MultiProcessMMKV.getSingleMMKV("tag_live_core").getBoolean("test_mmkv_live_face_verify", false)) {
                    z = false;
                }
                if (!z && e7Var2.f132751e) {
                    C58124b.C7172a.m7372a(this.f166695d.f166606f, C58124b.C58125b.LIVE_START_MIC_CGI, (Bundle) null, 2, (Object) null);
                    RoomLiveService.f157183O = System.currentTimeMillis();
                    RoomLiveService.f157186R = (long) RoomLiveService.f157197h.f133055i;
                    return;
                } else if (!Util.isNullOrNil(e7Var2.f132752f)) {
                    this.f166695d.mo82942C0();
                    RoomLiveService.C1270b bVar = RoomLiveService.f157210u;
                    String str4 = e7Var2.f132752f;
                    C87412m.m108593f(str4, "response.verify_url");
                    bVar.getClass();
                    bVar.f10323b = str4;
                    RoomLiveService.f157210u.f10324c = false;
                    this.f166695d.f166606f.statusChange(C58124b.C58125b.START_FACE_VERIFY, new Bundle());
                    return;
                }
            }
        }
        Context context = this.f166695d.f166607g;
        C76912y0.makeText(context, (CharSequence) C76577a.m92166q(context, C0966R.string.g9t), 0).show();
        this.f166695d.mo82942C0();
        RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
        String str5 = RoomLiveService.f157192c;
        long j = RoomLiveService.f157197h.f133050d;
        String str6 = RoomLiveService.f157199j;
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        C58532b.m67947c(str5, j, str6, 9, 2, s, RoomLiveService.f157197h.f133055i);
        Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markLinkMicFailed");
        C115669n.INSTANCE.mo175913w(1386, 15, 1);
    }
}
