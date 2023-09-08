package com.tencent.p014mm.modelavatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f12.C7970a;
import f40.C86709a0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p823sg.C90193h;
import p996kj.C88155a;
import q90.C101062d;
import vu0.C52992c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.modelavatar.u */
public class C68102u extends C86301e {

    /* renamed from: d */
    public C68098o f195745d;

    /* renamed from: e */
    public AvatarStorage f195746e;

    /* renamed from: f */
    public C68082g f195747f;

    /* renamed from: g */
    public C92724l f195748g;

    /* renamed from: h */
    public MTimerHandler f195749h = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C68103a(), false);

    /* renamed from: com.tencent.mm.modelavatar.u$a */
    public class C68103a implements MTimerHandler.CallBack {
        public C68103a() {
        }

        public boolean onTimerExpired() {
            if (!C86709a0.m107523b().mo121114l() || C68102u.wx0() == null) {
                Log.m105929w("MicroMsg.SubCoreAvatar", "upAssetsHandler onTimerExpired acc:%b astg:%s ", Boolean.valueOf(C86709a0.m107523b().mo121114l()), C68102u.wx0());
                return false;
            }
            if (((Boolean) C86709a0.m107535s().mo121142i().mo119684e(90113, Boolean.FALSE)).booleanValue()) {
                C68102u.this.getClass();
                try {
                    Context context = MMApplicationContext.getContext();
                    for (String str : ((ConcurrentHashMap) AvatarStorage.f195665d).keySet()) {
                        Map<String, Integer> map = AvatarStorage.f195665d;
                        int intValue = ((ConcurrentHashMap) map).containsKey(str) ? ((Integer) ((ConcurrentHashMap) map).get(str)).intValue() : 0;
                        if (intValue != 0) {
                            Log.m105919d("MicroMsg.SubCoreAvatar", "updateAssetsAvatar user:%s ", str);
                            C68102u.wx0().mo93570s(str, C88155a.decodeResource(context.getResources(), intValue, (BitmapFactory.Options) null));
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SubCoreAvatar", "exception:%s", Util.stackTraceToString(e));
                }
                C68102u.this.getClass();
                if (!Util.nullAs((Boolean) C86709a0.m107535s().mo121142i().mo119684e(59, (Object) null), false)) {
                    String s = C75592q0.m90789s();
                    if (!Util.isNullOrNil(s) && !C68102u.wx0().mo93565n(s, false)) {
                        Bitmap b = AvatarStorage.C68077d.m80463b(C7970a.m8127a() + "user_" + C90193h.m112878f(s.getBytes()) + ".png", s);
                        if (b != null && !b.isRecycled()) {
                            C68102u.wx0().mo93570s(s, b);
                        }
                    }
                }
                C86709a0.m107535s().mo121142i().mo119676J(90113, Boolean.FALSE);
            }
            return false;
        }

        public String toString() {
            return super.toString() + "|upAssetsHandler";
        }
    }

    public static C68082g vx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f195747f == null) {
            xx0().f195747f = new C68082g();
        }
        return xx0().f195747f;
    }

    public static AvatarStorage wx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f195746e == null) {
            xx0().f195746e = new AvatarStorage();
        }
        return xx0().f195746e;
    }

    public static C68102u xx0() {
        return (C68102u) C86312j.m106911c(C68102u.class);
    }

    public static C92724l yx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f195748g == null) {
            xx0().f195748g = new C92724l(C86709a0.m107535s().f251811i);
        }
        return xx0().f195748g;
    }

    public static C68098o zx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f195745d == null) {
            xx0().f195745d = new C68098o(C86709a0.m107535s().f251811i);
        }
        return xx0().f195745d;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        if (C86709a0.m107523b().f251754e.f222289a) {
            Log.m105918d("MicroMsg.SubCoreAvatar", "update all plugin avatars");
            C86709a0.m107535s().mo121142i().mo119676J(90113, Boolean.TRUE);
        }
        this.f195749h.startTimer(10000);
        C30650a.m39147b(new C52992c(), "//avatar");
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        this.f195749h.stopTimer();
        if (xx0().f195746e != null && AvatarStorage.f195666e == null) {
            AvatarStorage.f195666e = new C68079a(100);
        }
        C68082g gVar = xx0().f195747f;
        if (gVar != null) {
            C86709a0.m107524d().mo123470p(123, gVar);
        }
        C68098o oVar = xx0().f195745d;
        if (oVar != null) {
            ((C101062d) oVar.f195739e).clear();
        }
        C30650a.m39148c("//avatar");
    }
}
