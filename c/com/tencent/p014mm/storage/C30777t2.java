package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30781v2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h81.C32735h;
import ky2.C10432i;
import p008bq.C28396w0;
import tc0.C77885p;
import te3.C64266br1;

@C86522b(creator = C30781v2.C30782a.class)
/* renamed from: com.tencent.mm.storage.t2 */
public final class C30777t2 extends C86301e implements C28396w0 {

    /* renamed from: d */
    public static final C30777t2 f82756d = new C30777t2();

    public final void Ax0() {
        Log.m105924i("MicroMsg.EmojiPrivacy", "setPrivacyPolicyHasShown");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_PRIVACY_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
        C75592q0.m90769Q(Long.valueOf(C75592q0.m90781k() | 1048576));
    }

    public final void Bx0(boolean z) {
        Log.m105924i("MicroMsg.EmojiPrivacy", "setUserAcceptation: agreed=" + z);
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 85;
        br12.f182325e = z ? 1 : 2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        long k = C75592q0.m90781k();
        C75592q0.m90769Q(Long.valueOf(z ? 14680064 | k : -14680065 & k));
    }

    public final boolean Cx0() {
        return vx0() && (C75592q0.m90781k() & 1048576) == 0 && !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_EMOJI_PRIVACY_DIALOG_BOOLEAN_SYNC, false);
    }

    /* renamed from: Xe */
    public boolean mo55937Xe() {
        return vx0() && (C75592q0.m90781k() & 8388608) != 0;
    }

    public final boolean vx0() {
        Object e;
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_emoticon_privacy_setting, false) || ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e() || (e = C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null)) == null) {
            return false;
        }
        String str = (String) e;
        return !Util.isNullOrNil(str) && str.toUpperCase().equals("CN");
    }

    public final boolean wx0() {
        return vx0() && (C75592q0.m90781k() & 4194304) != 0;
    }

    public final boolean xx0() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_emoticon_privacy_setting, false) && !Cx0()) {
            return vx0() && (C75592q0.m90781k() & 2097152) != 0;
        }
        return true;
    }

    public final void yx0(boolean z) {
        Log.m105924i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromPersonalizedEnabled: enabled=" + z);
        long k = C75592q0.m90781k();
        C75592q0.m90769Q(Long.valueOf(z ? k | 8388608 : k & -8388609));
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 88;
        br12.f182325e = z ? 1 : 2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
    }

    public final void zx0(boolean z) {
        Log.m105924i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromSavedEnabled: enabled=" + z);
        long k = C75592q0.m90781k();
        C75592q0.m90769Q(Long.valueOf(z ? k | 4194304 : k & -4194305));
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 87;
        br12.f182325e = z ? 1 : 2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        C30764p2.f82718j.mo57680g();
    }
}
