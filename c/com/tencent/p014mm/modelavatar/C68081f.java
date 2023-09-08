package com.tencent.p014mm.modelavatar;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import java.nio.charset.StandardCharsets;
import p196ln.C76707h;
import p823sg.C90193h;
import te3.C50052jy2;

/* renamed from: com.tencent.mm.modelavatar.f */
public final class C68081f {
    /* renamed from: a */
    public static Bitmap m80466a(String str) {
        return m80467b(str, false, -1, (C68080d) null);
    }

    /* renamed from: b */
    public static Bitmap m80467b(String str, boolean z, int i, C68080d dVar) {
        if (Util.isNullOrNil(str) || !C86709a0.m107523b().mo121114l()) {
            return null;
        }
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        if (C45628s0.m50742G(str)) {
            str = "weixin";
        }
        return C68102u.vx0().mo93579f(str, z, i, dVar);
    }

    /* renamed from: c */
    public static String m80468c(String str, boolean z, boolean z2) {
        if (Util.isNullOrNil(str) || !C86709a0.m107523b().mo121114l()) {
            return null;
        }
        return C72996z1.m85811N4(str) ? C68102u.wx0().mo93559h(C72996z1.m85829Z5(str), z) : C68102u.wx0().mo93559h(str, z);
    }

    /* renamed from: d */
    public static String m80469d(C68097n nVar, int i) {
        if (i == 1) {
            if (Util.isNullOrNil(nVar.mo93594c())) {
                return "hd_avatar_no_url";
            }
            return "hd_" + C90193h.m112878f(nVar.mo93594c().getBytes(StandardCharsets.UTF_8));
        } else if (Util.isNullOrNil(nVar.mo93597f())) {
            return "small_avatar_no_url";
        } else {
            return "small_" + C90193h.m112878f(nVar.mo93597f().getBytes(StandardCharsets.UTF_8));
        }
    }

    /* renamed from: e */
    public static C68097n m80470e(String str, C50052jy2 jy22, C72996z1 z1Var) {
        Class cls = C32735h.class;
        C68097n nVar = new C68097n();
        nVar.f195736i = -1;
        nVar.f195728a = str;
        nVar.f195731d = jy22.f136409U;
        nVar.f195732e = jy22.f136407T;
        Log.m105925i("MicroMsg.AvatarLogic", "dkhurl contact %s b[%s] s[%s], ImgFlag:%s", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f(), Integer.valueOf(jy22.f136443o));
        nVar.f195733f = jy22.f136388C != 0 ? 1 : 0;
        int i = jy22.f136443o;
        if (i == 2) {
            nVar.f195729b = 3;
            m80474i(str, nVar);
        } else {
            if (i == 3 || i == 4) {
                nVar.f195729b = i;
            }
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_img_update_flag_no_modify_sw, 1) == 1) {
                C68097n Lo = C68102u.zx0().mo93607Lo(str);
                if (Lo != null) {
                    Log.m105925i("MicroMsg.AvatarLogic", "oldImgFlag smallurl:%s bigUrl:%s", Lo.mo93597f(), Lo.mo93594c());
                    if (!Util.isEqual(Lo.mo93597f(), jy22.f136409U) || !Util.isEqual(Lo.mo93594c(), jy22.f136407T)) {
                        m80474i(str, nVar);
                    }
                } else {
                    Log.m105925i("MicroMsg.AvatarLogic", "ImgFlag Not Exist %s", str);
                    if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_avatar_not_found_img_flag_update_flag, 1) == 1) {
                        m80474i(str, nVar);
                    }
                }
            }
        }
        return nVar;
    }

    /* renamed from: f */
    public static boolean m80471f(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C68097n Lo = C68102u.zx0().mo93607Lo(str);
        if (Lo != null && str.equals(Lo.mo93598g()) && i == Lo.f195729b) {
            return true;
        }
        if (Lo == null) {
            Lo = new C68097n();
        }
        Lo.f195728a = str;
        Lo.f195729b = i;
        Lo.f195736i = 3;
        return C68102u.zx0().mo93608Yt(Lo);
    }

    /* renamed from: g */
    public static boolean m80472g(String str) {
        if (str == null) {
            Log.m105928w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
            return false;
        } else if (!str.endsWith("@t.qq.com")) {
            Log.m105928w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
            return false;
        } else {
            C68097n nVar = new C68097n();
            nVar.f195728a = str;
            nVar.f195729b = 3;
            nVar.f195736i = 3;
            return C68102u.zx0().mo93608Yt(nVar);
        }
    }

    /* renamed from: h */
    public static boolean m80473h(String str) {
        if (str == null) {
            Log.m105928w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
            return false;
        } else if (!str.endsWith("@qqim")) {
            Log.m105928w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
            return false;
        } else {
            C68097n nVar = new C68097n();
            nVar.f195728a = str;
            nVar.f195729b = 3;
            nVar.f195736i = 3;
            return C68102u.zx0().mo93608Yt(nVar);
        }
    }

    /* renamed from: i */
    public static void m80474i(String str, C68097n nVar) {
        if (!Util.isNullOrNil(str) && !C75592q0.m90789s().equals(str)) {
            C68102u.vx0().mo93583j(str, nVar);
            C68102u.zx0().mo93608Yt(nVar);
            ((C76707h) C86312j.m106911c(C76707h.class)).mo106989WS(str);
        }
    }
}
