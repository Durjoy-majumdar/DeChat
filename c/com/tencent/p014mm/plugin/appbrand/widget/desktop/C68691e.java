package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import dt0.C75449i;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.e */
public interface C68691e {

    /* renamed from: o0 */
    public static final int f197339o0 = C76577a.m92151b(MMApplicationContext.getContext(), 100);

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.e$b */
    public interface C68693b {
        /* renamed from: Q */
        void mo94379Q(int i, C68692a aVar, boolean z, boolean z2);

        /* renamed from: R */
        void mo94380R(int i, boolean z, boolean z2, String str);

        /* renamed from: T */
        void mo94381T(LocalUsageInfo localUsageInfo, boolean z, boolean z2, boolean z3);

        /* renamed from: Y */
        void mo94382Y();

        /* renamed from: a0 */
        void mo94383a0(int i);

        /* renamed from: b */
        void mo94384b(LocalUsageInfo localUsageInfo, int i, int i2);

        /* renamed from: k */
        void mo94385k(boolean z, LocalUsageInfo localUsageInfo, int i, boolean z2, int i2);

        /* renamed from: q */
        void mo94386q(boolean z);

        /* renamed from: t */
        void mo94387t(boolean z, int i);
    }

    /* renamed from: A */
    boolean mo94482A();

    /* renamed from: X */
    void mo94411X(boolean z);

    /* renamed from: a */
    void mo94412a(C75449i iVar);

    C75449i getViewModel();

    /* renamed from: r */
    void mo94418r();

    void setCallback(C68693b bVar);

    /* renamed from: y */
    void mo94420y();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.e$a */
    public static class C68692a {

        /* renamed from: a */
        public LocalUsageInfo f197340a;

        /* renamed from: b */
        public int f197341b;

        public C68692a(int i) {
            this.f197341b = i;
        }

        /* renamed from: a */
        public boolean mo94483a(C68692a aVar) {
            LocalUsageInfo localUsageInfo = this.f197340a;
            if (localUsageInfo == null || aVar.f197340a == null || Util.isNullOrNil(localUsageInfo.f239040d) || Util.isNullOrNil(aVar.f197340a.f239040d)) {
                return false;
            }
            LocalUsageInfo localUsageInfo2 = aVar.f197340a;
            LocalUsageInfo localUsageInfo3 = this.f197340a;
            localUsageInfo2.getClass();
            return localUsageInfo3 != null && !Util.isNullOrNil(localUsageInfo3.f239040d) && localUsageInfo3.f239040d.equals(localUsageInfo2.f239040d) && localUsageInfo3.f239042f == localUsageInfo2.f239042f;
        }

        public C68692a(LocalUsageInfo localUsageInfo, int i) {
            this.f197340a = localUsageInfo;
            this.f197341b = i;
        }

        public C68692a(C68692a aVar) {
            this.f197340a = aVar.f197340a;
            this.f197341b = aVar.f197341b;
        }
    }
}
