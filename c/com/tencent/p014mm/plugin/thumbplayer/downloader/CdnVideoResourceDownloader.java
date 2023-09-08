package com.tencent.p014mm.plugin.thumbplayer.downloader;

import a14.C53916l;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f03.C97785g;
import f03.C97787h;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hd0.C98398h0;
import hd0.C98403m0;
import hd0.C98429r0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import l03.C99276a;
import rx3.C13598b0;
import uf0.C102022j;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader */
public final class CdnVideoResourceDownloader implements C97787h {

    /* renamed from: u */
    public static final boolean f282435u = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_c2c_video_cdn_diff_enable, true);

    /* renamed from: a */
    public final C97785g f282436a;

    /* renamed from: b */
    public final String f282437b = ("MicroMsg.CdnVideoResourceDownloader@" + hashCode());

    /* renamed from: c */
    public C53916l<? super CdnLogic.VideoInfo> f282438c;

    /* renamed from: d */
    public C53916l<? super Boolean> f282439d;

    /* renamed from: e */
    public volatile boolean f282440e;

    /* renamed from: f */
    public int f282441f;

    /* renamed from: g */
    public volatile boolean f282442g;

    /* renamed from: h */
    public float f282443h;

    /* renamed from: i */
    public C102022j f282444i = new C102022j();

    /* renamed from: j */
    public C97787h.C97791d f282445j;

    /* renamed from: k */
    public final HashSet<String> f282446k = new HashSet<>();

    /* renamed from: l */
    public final Object f282447l = new Object();

    /* renamed from: m */
    public long f282448m;

    /* renamed from: n */
    public final long[] f282449n = new long[2];

    /* renamed from: o */
    public Long f282450o;

    /* renamed from: p */
    public final AtomicBoolean f282451p = new AtomicBoolean(false);

    /* renamed from: q */
    public final HashSet<C99276a> f282452q = new HashSet<>();

    /* renamed from: r */
    public Long f282453r;

    /* renamed from: s */
    public boolean f282454s;

    /* renamed from: t */
    public final CdnVideoResourceDownloader$videoEventListener$1 f282455t = new CdnVideoResourceDownloader$videoEventListener$1(this, C40008f.f107254d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader", mo125469f = "CdnVideoResourceDownloader.kt", mo125470l = {425}, mo125471m = "awaitFinished")
    /* renamed from: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$a */
    public static final class C96523a extends C66704d {

        /* renamed from: d */
        public Object f282456d;

        /* renamed from: e */
        public /* synthetic */ Object f282457e;

        /* renamed from: f */
        public final /* synthetic */ CdnVideoResourceDownloader f282458f;

        /* renamed from: g */
        public int f282459g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96523a(CdnVideoResourceDownloader cdnVideoResourceDownloader, C15601d<? super C96523a> dVar) {
            super(dVar);
            this.f282458f = cdnVideoResourceDownloader;
        }

        public final Object invokeSuspend(Object obj) {
            this.f282457e = obj;
            this.f282459g |= Integer.MIN_VALUE;
            return this.f282458f.mo134530c(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$b */
    public static final class C96524b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CdnVideoResourceDownloader f282460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96524b(CdnVideoResourceDownloader cdnVideoResourceDownloader) {
            super(1);
            this.f282460d = cdnVideoResourceDownloader;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f282460d.f282439d = null;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader", mo125469f = "CdnVideoResourceDownloader.kt", mo125470l = {425}, mo125471m = "awaitMoovReady")
    /* renamed from: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$c */
    public static final class C96525c extends C66704d {

        /* renamed from: d */
        public Object f282461d;

        /* renamed from: e */
        public /* synthetic */ Object f282462e;

        /* renamed from: f */
        public final /* synthetic */ CdnVideoResourceDownloader f282463f;

        /* renamed from: g */
        public int f282464g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96525c(CdnVideoResourceDownloader cdnVideoResourceDownloader, C15601d<? super C96525c> dVar) {
            super(dVar);
            this.f282463f = cdnVideoResourceDownloader;
        }

        public final Object invokeSuspend(Object obj) {
            this.f282462e = obj;
            this.f282464g |= Integer.MIN_VALUE;
            return this.f282463f.mo134539k(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$d */
    public static final class C96526d extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CdnVideoResourceDownloader f282465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96526d(CdnVideoResourceDownloader cdnVideoResourceDownloader) {
            super(1);
            this.f282465d = cdnVideoResourceDownloader;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f282465d.f282438c = null;
            return C13598b0.f38549a;
        }
    }

    public CdnVideoResourceDownloader(C97785g gVar) {
        C87412m.m108594g(gVar, "task");
        this.f282436a = gVar;
    }

    /* renamed from: l */
    public static final void m123813l(CdnVideoResourceDownloader cdnVideoResourceDownloader, int i, long j) {
        Throwable th;
        String str = cdnVideoResourceDownloader.f282437b;
        Log.m105924i(str, "onFinish: ret=" + i + ", mediaId=" + cdnVideoResourceDownloader.getMediaId() + ", file length=" + j);
        boolean z = true;
        cdnVideoResourceDownloader.f282440e = true;
        cdnVideoResourceDownloader.f282441f = i;
        cdnVideoResourceDownloader.f282451p.set(false);
        cdnVideoResourceDownloader.f282436a.mo126303a();
        cdnVideoResourceDownloader.mo134541n();
        if (i == 0) {
            Long l = cdnVideoResourceDownloader.f282450o;
            if (l == null || j != l.longValue()) {
                String str2 = cdnVideoResourceDownloader.f282437b;
                Log.m105924i(str2, "onFinish, svrLength != completeLength, svrLength = " + cdnVideoResourceDownloader.f282450o + " completeLength = " + j + ", fix svrLength");
                cdnVideoResourceDownloader.f282450o = Long.valueOf(j);
            }
            if (!cdnVideoResourceDownloader.f282442g) {
                Iterator<C99276a> it = cdnVideoResourceDownloader.f282452q.iterator();
                while (it.hasNext()) {
                    it.next().mo135891r();
                }
                C53916l<? super CdnLogic.VideoInfo> lVar = cdnVideoResourceDownloader.f282438c;
                if (lVar != null) {
                    lVar.resumeWith(Result.m168114constructorimpl((Object) null));
                }
                cdnVideoResourceDownloader.f282438c = null;
            }
            C53916l<? super Boolean> lVar2 = cdnVideoResourceDownloader.f282439d;
            if (lVar2 != null) {
                Result.Companion companion = Result.Companion;
                if (i != 0) {
                    z = false;
                }
                lVar2.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
            }
            cdnVideoResourceDownloader.f282439d = null;
            Iterator<C99276a> it4 = cdnVideoResourceDownloader.f282452q.iterator();
            while (it4.hasNext()) {
                it4.next().mo135892s();
            }
        } else {
            if (i == -5103087 || i == -5103059) {
                th = new C97787h.C97789b(i);
            } else if (i == -10012 || i == -10011) {
                th = new C97787h.C97790c(i);
            } else {
                th = new C97787h.C97788a(i, "Unable to download file: code=" + i);
            }
            if (!cdnVideoResourceDownloader.f282442g) {
                C53916l<? super CdnLogic.VideoInfo> lVar3 = cdnVideoResourceDownloader.f282438c;
                if (lVar3 != null) {
                    Result.Companion companion2 = Result.Companion;
                    lVar3.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
                }
                cdnVideoResourceDownloader.f282438c = null;
            }
            C53916l<? super Boolean> lVar4 = cdnVideoResourceDownloader.f282439d;
            if (lVar4 != null) {
                Result.Companion companion3 = Result.Companion;
                lVar4.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
            }
            cdnVideoResourceDownloader.f282439d = null;
            Iterator<C99276a> it5 = cdnVideoResourceDownloader.f282452q.iterator();
            while (it5.hasNext()) {
                it5.next().mo135886i(i);
            }
            cdnVideoResourceDownloader.f282436a.stop();
            C97787h.C97791d dVar = cdnVideoResourceDownloader.f282445j;
            if (dVar != null) {
                dVar.mo135909f(cdnVideoResourceDownloader.f282436a.mo126309g());
            }
        }
        C97787h.C97791d dVar2 = cdnVideoResourceDownloader.f282445j;
        if (dVar2 != null) {
            dVar2.mo135908e(cdnVideoResourceDownloader.f282436a.mo126309g(), i);
        }
    }

    /* renamed from: a */
    public long mo134528a() {
        Long l = this.f282450o;
        return l != null ? l.longValue() : this.f282436a.getLength();
    }

    /* renamed from: b */
    public boolean mo134529b() {
        return this.f282454s && this.f282436a.mo126304b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo134530c(wx3.C15601d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader.C96523a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$a r0 = (com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader.C96523a) r0
            int r1 = r0.f282459g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f282459g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$a r0 = new com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f282457e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f282459g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f282456d
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r0 = (com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r4.f282440e
            if (r5 == 0) goto L_0x0045
            int r5 = r4.f282441f
            if (r5 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x0045:
            r0.f282456d = r4
            r0.f282459g = r3
            a14.m r5 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r5.<init>(r0, r3)
            r5.mo74609p()
            r4.f282439d = r5
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$b r0 = new com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$b
            r0.<init>(r4)
            r5.mo74599v(r0)
            java.lang.Object r5 = r5.mo74608o()
            if (r5 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r0 = r4
        L_0x0067:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1 = 0
            r0.f282439d = r1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader.mo134530c(wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public float mo134531d() {
        return this.f282443h;
    }

    /* renamed from: e */
    public void mo134532e() {
        Log.m105924i(this.f282437b, "request all");
        synchronized (this.f282447l) {
            this.f282446k.add("0_-1");
        }
        C98398h0.xx0().mo126990n(getMediaId(), 0, -1, 0);
        for (C99276a p : this.f282452q) {
            p.mo135890p();
        }
    }

    /* renamed from: f */
    public long mo134533f() {
        return this.f282448m;
    }

    /* renamed from: g */
    public boolean mo134534g() {
        this.f282436a.mo126303a();
        return (this.f282440e && this.f282441f == 0) || this.f282436a.isFinished();
    }

    public String getMediaId() {
        return this.f282436a.getMediaId();
    }

    /* renamed from: h */
    public boolean mo134536h(long j, long j2) {
        if (this.f282451p.get()) {
            return false;
        }
        synchronized (this.f282447l) {
            if (this.f282446k.contains("0_-1")) {
                return false;
            }
            HashSet<String> hashSet = this.f282446k;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('_');
            sb.append(j2);
            if (!hashSet.add(sb.toString())) {
                return false;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            String str = this.f282437b;
            Log.m105924i(str, "request(" + j + ", " + j2 + "), mediaId=" + getMediaId());
            C98398h0.xx0().mo126990n(getMediaId(), (int) j, (int) j2, 0);
            this.f282451p.set(true);
            return true;
        }
    }

    /* renamed from: i */
    public long mo134537i(long j, long j2) {
        if (mo134534g()) {
            return j2;
        }
        CdnLogic.queryContinuousSize(getMediaId(), j, this.f282449n);
        return Math.min(this.f282449n[0], j2);
    }

    /* renamed from: j */
    public String mo134538j() {
        return this.f282436a.mo126312h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo134539k(wx3.C15601d<? super com.tencent.mars.cdn.CdnLogic.VideoInfo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader.C96525c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$c r0 = (com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader.C96525c) r0
            int r1 = r0.f282464g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f282464g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$c r0 = new com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f282462e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f282464g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.f282461d
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r0 = (com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005e
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.f282442g
            if (r6 == 0) goto L_0x003c
            return r3
        L_0x003c:
            r0.f282461d = r5
            r0.f282464g = r4
            a14.m r6 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r6.<init>(r0, r4)
            r6.mo74609p()
            r5.f282438c = r6
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$d r0 = new com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$d
            r0.<init>(r5)
            r6.mo74599v(r0)
            java.lang.Object r6 = r6.mo74608o()
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r5
        L_0x005e:
            com.tencent.mars.cdn.CdnLogic$VideoInfo r6 = (com.tencent.mars.cdn.CdnLogic.VideoInfo) r6
            r0.f282438c = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader.mo134539k(wx3.d):java.lang.Object");
    }

    /* renamed from: m */
    public void mo134540m(C99276a aVar) {
        C87412m.m108594g(aVar, "reporter");
        this.f282452q.add(aVar);
    }

    /* renamed from: n */
    public final void mo134541n() {
        if (C98403m0.m127702b(this.f282436a.mo126312h())) {
            String str = this.f282437b;
            Log.m105924i(str, "download finish and is hevc need complete " + this.f282436a.mo126307e() + " , mediaId=" + getMediaId());
            if (C98429r0.m127801G(this.f282436a.mo126307e())) {
                for (C99276a l : this.f282452q) {
                    l.mo135887l();
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo134542o(long j, long j2, CdnLogic.VideoInfo videoInfo) {
        String str = this.f282437b;
        Log.m105924i(str, "onMoovReady: offset=" + j + ", length=" + j2 + ", mediaId=" + getMediaId());
        boolean z = true;
        this.f282442g = true;
        C53916l<? super CdnLogic.VideoInfo> lVar = this.f282438c;
        if (lVar != null) {
            lVar.resumeWith(Result.m168114constructorimpl(videoInfo));
        }
        this.f282438c = null;
        for (C99276a o : this.f282452q) {
            o.mo135889o(j, j2);
        }
        String h = this.f282436a.mo126312h();
        if (!(h == null || h.length() == 0)) {
            z = false;
        }
        if (z || !C86013q1.m106450k(h)) {
            String str2 = this.f282437b;
            Log.m105928w(str2, "onMoovReady but file is invalid, seems it has been deleted: path=" + h + ", filename=" + this.f282436a.mo126307e());
            for (C99276a x : this.f282452q) {
                x.mo135895x();
            }
        } else if (this.f282444i.mo89446a(h, j)) {
            C97787h.C97791d dVar = this.f282445j;
            if (dVar != null) {
                dVar.mo135904a(this.f282436a.mo126309g(), j, j2);
            }
            for (C99276a t : this.f282452q) {
                t.mo135893t();
            }
        } else {
            for (C99276a x2 : this.f282452q) {
                x2.mo135895x();
            }
            C98398h0.xx0().mo126990n(getMediaId(), 0, -1, 0);
            C98429r0.m127802H(this.f282436a.mo126307e(), 15);
        }
    }

    /* renamed from: p */
    public final void mo134543p(long j, long j2) {
        Long l;
        if (f282435u) {
            l = Long.valueOf((Math.abs(this.f282436a.getLength() - j2) > 16 || this.f282436a.getLength() >= j2) ? j2 : this.f282436a.getLength());
        } else {
            l = Long.valueOf((this.f282436a.getLength() <= 0 || this.f282436a.getLength() == j2) ? j2 : this.f282436a.getLength());
        }
        this.f282450o = l;
        this.f282443h = (((float) j) * 100.0f) / ((float) j2);
        String str = this.f282437b;
        Log.m105924i(str, this.f282436a.getMediaId() + " onProgress: " + j + " / " + j2 + " (" + this.f282443h + "%)");
        C97787h.C97791d dVar = this.f282445j;
        if (dVar != null) {
            dVar.mo135905b(this.f282436a.mo126309g(), j, j2);
        }
        for (C99276a m : this.f282452q) {
            m.mo135888m(j);
        }
    }

    public boolean start() {
        String str = this.f282437b;
        Log.m105924i(str, "start(), mediaId=" + getMediaId());
        if (!this.f282436a.start()) {
            Log.m105928w(this.f282437b, "task is not started successfully");
            return false;
        }
        this.f282454s = true;
        this.f282455t.alive();
        String str2 = this.f282437b;
        Log.m105924i(str2, "Start download online video " + getMediaId() + '-' + this.f282436a.mo126307e());
        for (C99276a b : this.f282452q) {
            b.mo135882b();
        }
        C97785g.C97786a c = this.f282436a.mo126305c();
        if (c != null) {
            Log.m105924i(this.f282437b, "task is already in progress");
            long j = c.f286876d;
            if (j > 0) {
                mo134542o(c.f286875c, j, (CdnLogic.VideoInfo) null);
            }
            long j2 = c.f286874b;
            if (j2 > 0) {
                mo134543p(c.f286873a, j2);
            }
        }
        return true;
    }

    public void stop() {
        if (!this.f282454s) {
            Log.m105928w(this.f282437b, "downloader hasn't been started, ignore call");
            return;
        }
        Log.m105924i(this.f282437b, "stop()");
        for (C99276a u : this.f282452q) {
            u.mo135894u();
        }
        String str = this.f282437b;
        Log.m105924i(str, "reset(), mediaId=" + getMediaId());
        synchronized (this.f282447l) {
            this.f282446k.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (EventCenter.instance.hadListened(this.f282455t)) {
            this.f282455t.dead();
        }
        boolean z = false;
        this.f282451p.set(false);
        C53916l<? super CdnLogic.VideoInfo> lVar = this.f282438c;
        if (lVar != null) {
            C53916l.C53917a.m60514a(lVar, (Throwable) null, 1, (Object) null);
        }
        this.f282438c = null;
        C53916l<? super Boolean> lVar2 = this.f282439d;
        if (lVar2 != null) {
            C53916l.C53917a.m60514a(lVar2, (Throwable) null, 1, (Object) null);
        }
        this.f282439d = null;
        String mediaId = getMediaId();
        if (mediaId == null || mediaId.length() == 0) {
            z = true;
        }
        if (!z) {
            if (this.f282440e) {
                mo134541n();
            }
            if (this.f282443h >= ((float) this.f282436a.mo126306d()) && !this.f282440e) {
                this.f282436a.mo126308f();
                for (C99276a h : this.f282452q) {
                    h.mo135885h();
                }
                String str2 = this.f282437b;
                Log.m105924i(str2, "start complete video, downloaded (" + this.f282443h + ") more than config (" + this.f282436a.mo126306d() + ").");
            }
            this.f282436a.stop();
        }
    }

    public String toString() {
        return "CdnVideoResourceDownloader: mediaId=" + getMediaId() + ", savedPath=" + mo134538j() + ", moovReady=" + this.f282442g + ", finished=" + this.f282440e + ", totalLength=" + mo134528a() + ", started=" + this.f282454s + ", hashCode=" + hashCode();
    }
}
