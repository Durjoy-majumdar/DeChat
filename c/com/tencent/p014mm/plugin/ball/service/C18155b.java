package com.tencent.p014mm.plugin.ball.service;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import xv0.C38856d;

/* renamed from: com.tencent.mm.plugin.ball.service.b */
public final class C18155b implements C38856d {

    /* renamed from: c */
    public static final C13601g<C18155b> f50152c = C36568h.m40986b(C13602i.SYNCHRONIZED, C18156a.f50155d);

    /* renamed from: a */
    public volatile C18158c f50153a;

    /* renamed from: b */
    public Boolean f50154b;

    /* renamed from: com.tencent.mm.plugin.ball.service.b$a */
    public static final class C18156a extends C87413o implements C32224a<C18155b> {

        /* renamed from: d */
        public static final C18156a f50155d = new C18156a();

        public C18156a() {
            super(0);
        }

        public Object invoke() {
            return new C18155b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.b$b */
    public static final class C18157b {
        public C18157b(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.b$c */
    public static final class C18158c {

        /* renamed from: a */
        public final int f50156a;

        /* renamed from: b */
        public final boolean f50157b;

        /* renamed from: c */
        public final boolean f50158c;

        /* renamed from: d */
        public final long f50159d;

        public C18158c(int i, boolean z, boolean z2, long j) {
            this.f50156a = i;
            this.f50157b = z;
            this.f50158c = z2;
            this.f50159d = j;
        }
    }

    static {
        new C18157b((C8480h) null);
    }

    /* renamed from: a */
    public void mo22761a(int i, boolean z, boolean z2) {
        Log.m105919d("MicroMsg.FloatBallReportService", "alvinluo markExitPage pageType: %d, hasFloatBall: %b, isSupportMessageBall: %b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2));
        this.f50153a = new C18158c(i, z, z2, System.currentTimeMillis());
    }

    /* renamed from: b */
    public void mo22762b(long j, int i) {
        if (this.f50154b == null) {
            this.f50154b = Boolean.TRUE;
        }
        if (!C87412m.m108589b(this.f50154b, Boolean.FALSE)) {
            if (this.f50153a == null) {
                C115669n.INSTANCE.mo160131h(20041, -1, 0, 0);
                return;
            }
            try {
                C18158c cVar = this.f50153a;
                C87412m.m108591d(cVar);
                long j2 = j - cVar.f50159d;
                C18158c cVar2 = this.f50153a;
                C87412m.m108591d(cVar2);
                if (cVar2.f50157b) {
                    i = 4;
                } else {
                    C18158c cVar3 = this.f50153a;
                    C87412m.m108591d(cVar3);
                    if (!cVar3.f50158c) {
                        i = 3;
                    }
                }
                C18158c cVar4 = this.f50153a;
                C87412m.m108591d(cVar4);
                Log.m105919d("MicroMsg.FloatBallReportService", "alvinluo onEnterChattingFromNotification type: %d, addMessageBallResult: %d, timeDiff: %d", Integer.valueOf(cVar4.f50156a), Integer.valueOf(i), Long.valueOf(j2));
                C115669n nVar = C115669n.INSTANCE;
                C18158c cVar5 = this.f50153a;
                C87412m.m108591d(cVar5);
                nVar.mo160131h(20041, 0, Integer.valueOf(i), Long.valueOf(j2), Integer.valueOf(cVar5.f50156a));
                this.f50153a = null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FloatBallReportService", e, "onEnterChattingFromNotification exception", new Object[0]);
                this.f50153a = null;
            }
        }
    }

    /* renamed from: f */
    public void mo22763f(boolean z) {
        Log.m105925i("MicroMsg.FloatBallReportService", "alvinluo markWechatForeground %b", Boolean.valueOf(z));
        if (!z) {
            this.f50153a = null;
        }
    }
}
