package com.tencent.p014mm.plugin.finder.extension.reddot;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58413v0;
import dp1.C58417y0;
import eb0.C31543z5;
import eb0.C75592q0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.d0 */
public final class C55710d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f158569d;

    /* renamed from: e */
    public final /* synthetic */ long f158570e;

    /* renamed from: f */
    public final /* synthetic */ FinderRedDotExpiredHandler f158571f;

    /* renamed from: g */
    public final /* synthetic */ String f158572g;

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.d0$a */
    public static final class C55711a extends C87413o implements C32226l<C55718s0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ HashSet<C55718s0> f158573d;

        /* renamed from: e */
        public final /* synthetic */ FinderRedDotExpiredHandler f158574e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<C55718s0> f158575f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55711a(HashSet<C55718s0> hashSet, FinderRedDotExpiredHandler finderRedDotExpiredHandler, LinkedList<C55718s0> linkedList) {
            super(1);
            this.f158573d = hashSet;
            this.f158574e = finderRedDotExpiredHandler;
            this.f158575f = linkedList;
        }

        public Object invoke(Object obj) {
            C64586nn1 o2;
            C55718s0 s0Var = (C55718s0) obj;
            C87412m.m108594g(s0Var, LocaleUtil.ITALIAN);
            boolean contains = this.f158573d.contains(s0Var);
            if (contains) {
                if (s0Var.mo77306m2("FinderEntrance") && (o2 = s0Var.mo77308o2("FinderEntrance")) != null) {
                    C58413v0.m67782j(C58413v0.f167346a, s0Var, o2, 7, 0, (String) null, (String) null, 56, (Object) null);
                }
                this.f158574e.f158519d.mo77265f(s0Var.field_ctrInfo, "Expired");
                this.f158575f.add(s0Var);
            }
            return Boolean.valueOf(contains);
        }
    }

    public C55710d0(String str, long j, FinderRedDotExpiredHandler finderRedDotExpiredHandler, String str2) {
        this.f158569d = str;
        this.f158570e = j;
        this.f158571f = finderRedDotExpiredHandler;
        this.f158572g = str2;
    }

    public final void run() {
        Log.m105924i("Finder.RedDotExpiredHandler", "[checkExpired] source=" + this.f158569d + " delayed=" + this.f158570e);
        HashSet hashSet = new HashSet();
        Set<C55718s0> q = this.f158571f.f158519d.mo77277q();
        String str = this.f158572g;
        String str2 = this.f158569d;
        Iterator it = ((HashSet) q).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            C55718s0 s0Var = (C55718s0) it.next();
            long j = s0Var.field_expiredTime;
            if (j <= 0 || (j * 1000) + s0Var.field_time > C31543z5.m39453c()) {
                z = false;
            }
            if (z && !Util.isNullOrNil(str)) {
                z = s0Var.mo77306m2(str);
            }
            if (z) {
                hashSet.add(s0Var);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                int i = s0Var.field_ctrInfo.f144670e;
                String str3 = s0Var.field_tipsId;
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                String str5 = s0Var.field_revokeId;
                if (str5 != null) {
                    str4 = str5;
                }
                y0Var.Ox0(i, str3, str4, 2);
                Log.m105928w("Finder.RedDotExpiredHandler", "[checkExpired] source=" + str2 + " ctrlInfo has expired! " + s0Var.field_ctrInfo.f144670e);
            }
        }
        if (!hashSet.isEmpty()) {
            LinkedList<C55718s0> linkedList = new LinkedList<>();
            FinderRedDotExpiredHandler finderRedDotExpiredHandler = this.f158571f;
            FinderRedDotManager finderRedDotManager = finderRedDotExpiredHandler.f158519d;
            C55711a aVar = new C55711a(hashSet, finderRedDotExpiredHandler, linkedList);
            String h = C75592q0.m90778h();
            C87412m.m108593f(h, "getDefaultFinderUsername()");
            finderRedDotManager.mo77259c(Integer.MIN_VALUE, h, aVar);
            for (C55718s0 s0Var2 : linkedList) {
                Log.m105928w("Finder.RedDotExpiredHandler", "[checkExpired] onRedDotRevoke " + s0Var2);
                C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class);
                C87412m.m108593f(a, "UICProvider.of(FinderCom…bPreloadCore::class.java)");
                ((FinderStreamTabPreloadCore) a).mo78462l3(s0Var2, false);
            }
        }
    }
}
