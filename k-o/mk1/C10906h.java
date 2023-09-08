package mk1;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import al1.C0081n;
import android.content.DialogInterface;
import android.content.Intent;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C7335d;
import di3.C86312j;
import er1.C7813i5;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import pt1.C35640b;
import q40.C12040d;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C49007cj0;
import te3.C49098d51;
import te3.C49680ha1;
import te3.C50373m93;
import te3.C50375ma1;
import te3.C50888py0;
import te3.C64273c21;
import te3.C64510l21;
import te3.C64848y91;
import te3.u94;
import tf0.C13883o1;
import tf0.C13887q1;
import wx3.C15601d;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mk1.h */
public final class C10906h {

    /* renamed from: a */
    public final MMFragmentActivity f32534a;

    /* renamed from: b */
    public int f32535b;

    /* renamed from: c */
    public long f32536c;

    /* renamed from: d */
    public final String f32537d;

    /* renamed from: e */
    public final int f32538e;

    /* renamed from: f */
    public boolean f32539f;

    /* renamed from: g */
    public final C7813i5 f32540g;

    /* renamed from: mk1.h$a */
    public static final class C10907a {

        /* renamed from: a */
        public final int f32541a;

        /* renamed from: b */
        public final String f32542b;

        /* renamed from: c */
        public final C49007cj0 f32543c;

        public C10907a(int i, String str, C49007cj0 cj02) {
            this.f32541a = i;
            this.f32542b = str;
            this.f32543c = cj02;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10907a)) {
                return false;
            }
            C10907a aVar = (C10907a) obj;
            return this.f32541a == aVar.f32541a && C87412m.m108589b(this.f32542b, aVar.f32542b) && C87412m.m108589b(this.f32543c, aVar.f32543c);
        }

        public int hashCode() {
            int i = this.f32541a * 31;
            String str = this.f32542b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            C49007cj0 cj02 = this.f32543c;
            if (cj02 != null) {
                i2 = cj02.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "LivePrepareInfo(errCode=" + this.f32541a + ", errMsg=" + this.f32542b + ", resp=" + this.f32543c + ')';
        }
    }

    /* renamed from: mk1.h$b */
    public static abstract class C10908b {

        /* renamed from: mk1.h$b$a */
        public static final class C10909a extends C10908b {

            /* renamed from: a */
            public final int f32544a;

            public C10909a(int i) {
                this.f32544a = i;
            }
        }

        /* renamed from: mk1.h$b$b */
        public static final class C10910b extends C10908b {

            /* renamed from: a */
            public final C50375ma1 f32545a;

            public C10910b(C50375ma1 ma12) {
                C87412m.m108594g(ma12, "resp");
                this.f32545a = ma12;
            }
        }

        /* renamed from: mk1.h$b$c */
        public static final class C10911c extends C10908b {
        }
    }

    /* renamed from: mk1.h$c */
    public static abstract class C10912c {

        /* renamed from: mk1.h$c$a */
        public static final class C10913a extends C10912c {

            /* renamed from: a */
            public final int f32546a;

            public C10913a(int i) {
                this.f32546a = i;
            }
        }

        /* renamed from: mk1.h$c$b */
        public static final class C10914b extends C10912c {

            /* renamed from: a */
            public final C49007cj0 f32547a;

            public C10914b(C49007cj0 cj02) {
                this.f32547a = cj02;
            }
        }

        /* renamed from: mk1.h$c$c */
        public static final class C10915c extends C10912c {

            /* renamed from: a */
            public final C10907a f32548a;

            public C10915c(C10907a aVar) {
                C87412m.m108594g(aVar, "livePrepareResp");
                this.f32548a = aVar;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.ui.livepost.FinderLivePostHelper$prepare$$inlined$fail$default$1", mo125469f = "FinderLivePostHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: mk1.h$d */
    public static final class C10916d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f32549d;

        /* renamed from: e */
        public final /* synthetic */ C10906h f32550e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f32551f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10916d(C0287e eVar, C15601d dVar, C10906h hVar, C8479f0 f0Var) {
            super(2, dVar);
            this.f32549d = eVar;
            this.f32550e = hVar;
            this.f32551f = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10916d(this.f32549d, dVar, this.f32550e, this.f32551f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10916d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            ResultKt.throwOnFailure(obj);
            C0280a aVar = (C0280a) ((C0281b) this.f32549d).f843b;
            String str2 = this.f32550e.f32537d;
            Log.m105924i(str2, "result error: " + aVar);
            C8479f0 f0Var = this.f32551f;
            C12040d dVar = aVar.f841a;
            if (dVar == null || (str = dVar.f35059g) == null) {
                str = "";
            }
            f0Var.f27484d = new C10907a(0, str, (C49007cj0) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.ui.livepost.FinderLivePostHelper$prepare$$inlined$success$default$1", mo125469f = "FinderLivePostHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: mk1.h$e */
    public static final class C10917e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f32552d;

        /* renamed from: e */
        public final /* synthetic */ C10906h f32553e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0 f32554f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10917e(C0287e eVar, C15601d dVar, C10906h hVar, C8479f0 f0Var) {
            super(2, dVar);
            this.f32552d = eVar;
            this.f32553e = hVar;
            this.f32554f = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10917e(this.f32552d, dVar, this.f32553e, this.f32554f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10917e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            ResultKt.throwOnFailure(obj);
            C49007cj0 cj02 = (C49007cj0) ((C0288f) this.f32552d).f855b;
            Log.m105924i(this.f32553e.f32537d, "result success");
            boolean z = false;
            String str2 = "";
            this.f32554f.f27484d = new C10907a(0, str2, cj02);
            C49098d51 d512 = cj02.f131755e;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_RECOMMEND_SWITCH_SETTING_BOOLEAN_SYNC;
            C49680ha1 ha12 = cj02.f131742E;
            i.mo119677K(aVar, Boolean.valueOf(ha12 != null ? ha12.f134527d : false));
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC;
            u94 u94 = cj02.f131743F;
            i2.mo119677K(aVar2, Boolean.valueOf(u94 != null ? u94.f142690f : false));
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13356qM(d512);
            C85801v1 i3 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC;
            C50888py0 py02 = cj02.f131745H;
            if (!(py02 == null || (str = py02.f140049e) == null)) {
                str2 = str;
            }
            i3.mo119677K(aVar3, str2);
            C85801v1 i4 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_HELP_AND_FEEDBACK_ENTRY_ENABLED_BOOLEAN_SYNC;
            C50888py0 py03 = cj02.f131745H;
            if (py03 != null) {
                z = py03.f140048d;
            }
            i4.mo119677K(aVar4, Boolean.valueOf(z));
            C85801v1 i5 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar5 = C72994y1.C72995a.USERINFO_SENSITIVE_WORDS_LIMIT_INT;
            C50373m93 m932 = cj02.f131748K;
            i5.mo119677K(aVar5, new Integer(m932 != null ? m932.f137920d : 500));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.ui.livepost.FinderLivePostHelper", mo125469f = "FinderLivePostHelper.kt", mo125470l = {106, 469, 476}, mo125471m = "prepare")
    /* renamed from: mk1.h$f */
    public static final class C10918f extends C66704d {

        /* renamed from: d */
        public Object f32555d;

        /* renamed from: e */
        public Object f32556e;

        /* renamed from: f */
        public Object f32557f;

        /* renamed from: g */
        public /* synthetic */ Object f32558g;

        /* renamed from: h */
        public final /* synthetic */ C10906h f32559h;

        /* renamed from: i */
        public int f32560i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10918f(C10906h hVar, C15601d<? super C10918f> dVar) {
            super(dVar);
            this.f32559h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32558g = obj;
            this.f32560i |= Integer.MIN_VALUE;
            return this.f32559h.mo11115d(this);
        }
    }

    /* renamed from: mk1.h$g */
    public static final class C10919g implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C53916l<C10912c> f32561d;

        public C10919g(C53916l<? super C10912c> lVar) {
            this.f32561d = lVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C53916l<C10912c> lVar = this.f32561d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(new C10912c.C10913a(10000)));
        }
    }

    /* renamed from: mk1.h$h */
    public static final class C10920h implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ C53916l<C10912c> f32562a;

        /* renamed from: b */
        public final /* synthetic */ int f32563b;

        public C10920h(C53916l<? super C10912c> lVar, int i) {
            this.f32562a = lVar;
            this.f32563b = i;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            C53916l<C10912c> lVar = this.f32562a;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(new C10912c.C10913a(this.f32563b)));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.ui.livepost.FinderLivePostHelper", mo125469f = "FinderLivePostHelper.kt", mo125470l = {131, 140, 147, 166, 175, 189, 208, 219, 236}, mo125471m = "startLiveCheck")
    /* renamed from: mk1.h$i */
    public static final class C10921i extends C66704d {

        /* renamed from: d */
        public Object f32564d;

        /* renamed from: e */
        public Object f32565e;

        /* renamed from: f */
        public /* synthetic */ Object f32566f;

        /* renamed from: g */
        public final /* synthetic */ C10906h f32567g;

        /* renamed from: h */
        public int f32568h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10921i(C10906h hVar, C15601d<? super C10921i> dVar) {
            super(dVar);
            this.f32567g = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f32566f = obj;
            this.f32568h |= Integer.MIN_VALUE;
            return this.f32567g.mo11118g((C10907a) null, this);
        }
    }

    public C10906h(MMFragmentActivity mMFragmentActivity, int i, long j, int i2, C8480h hVar) {
        i = (i2 & 2) != 0 ? 0 : i;
        j = (i2 & 4) != 0 ? System.currentTimeMillis() : j;
        C87412m.m108594g(mMFragmentActivity, "context");
        this.f32534a = mMFragmentActivity;
        this.f32535b = i;
        this.f32536c = j;
        this.f32537d = "Finder.FinderLivePostHelper";
        this.f32538e = 5000;
        this.f32539f = true;
        this.f32540g = C7813i5.C7814a.m7953a(C7813i5.f26336f, mMFragmentActivity, mMFragmentActivity.getResources().getString(C0966R.string.ett), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
    }

    /* renamed from: a */
    public final boolean mo11112a(C10907a aVar) {
        return (aVar != null && aVar.f32541a == 0) && aVar.f32543c != null;
    }

    /* renamed from: b */
    public final void mo11113b(C10907a aVar) {
        C64273c21 c212;
        C10907a aVar2 = aVar;
        C87412m.m108594g(aVar2, "livePrepareResp");
        C49007cj0 cj02 = aVar2.f32543c;
        Intent intent = null;
        FinderObject finderObject = cj02 != null ? cj02.f131759i : null;
        C49098d51 d512 = cj02 != null ? cj02.f131755e : null;
        if (finderObject == null || (c212 = finderObject.liveInfo) == null || c212.f182392d == 0) {
            return;
        }
        C64510l21 l212 = c212.f182360F;
        if (l212 != null) {
            intent = new Intent().putExtra("KEY_PARAMS_LAYER_SHOW_INFO", l212.toByteArray());
        }
        Intent intent2 = intent;
        C7335d c = C86312j.m106911c(C13883o1.class);
        C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
        C13883o1 o1Var = (C13883o1) c;
        MMFragmentActivity mMFragmentActivity = this.f32534a;
        long j = finderObject.f164794id;
        String str = finderObject.objectNonceId;
        if (str == null) {
            str = "";
        }
        C13883o1.C13884a.m13249a(o1Var, mMFragmentActivity, j, str, c212, (C0081n) null, d512, (String) null, (LinkedList) null, (C64848y91) null, (String) null, finderObject.sessionBuffer, (LinkedList) null, intent2, 3024, (Object) null);
    }

    /* renamed from: c */
    public final void mo11114c(Intent intent, C49007cj0 cj02, boolean z) {
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", this.f32535b);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", this.f32536c);
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13264Mw(this.f32534a, cj02, intent, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11115d(wx3.C15601d<? super mk1.C10906h.C10907a> r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof mk1.C10906h.C10918f
            if (r2 == 0) goto L_0x0017
            r2 = r1
            mk1.h$f r2 = (mk1.C10906h.C10918f) r2
            int r3 = r2.f32560i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f32560i = r3
            goto L_0x001c
        L_0x0017:
            mk1.h$f r2 = new mk1.h$f
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f32558g
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f32560i
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0060
            if (r4 == r7) goto L_0x0054
            if (r4 == r6) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r3 = r2.f32556e
            bi1.e r3 = (bi1.C0287e) r3
            java.lang.Object r2 = r2.f32555d
            gy3.f0 r2 = (gy3.C8479f0) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00e7
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            java.lang.Object r4 = r2.f32557f
            bi1.e r4 = (bi1.C0287e) r4
            java.lang.Object r6 = r2.f32556e
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r7 = r2.f32555d
            mk1.h r7 = (mk1.C10906h) r7
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00c4
        L_0x0054:
            java.lang.Object r4 = r2.f32556e
            gy3.f0 r4 = (gy3.C8479f0) r4
            java.lang.Object r7 = r2.f32555d
            mk1.h r7 = (mk1.C10906h) r7
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00a0
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r1)
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            dj1.t0 r4 = new dj1.t0
            je1.h2 r9 = je1.C46523h2.f125330a
            r10 = 5874(0x16f2, float:8.231E-42)
            te3.ig0 r10 = r9.mo71859a(r10)
            zc1.b r9 = zc1.C66785b.f191882e
            java.lang.String r11 = r9.mo90662O5()
            r12 = 0
            r13 = 0
            r15 = 0
            int r9 = r0.f32538e
            r18 = 0
            r20 = 0
            r21 = 88
            r22 = 0
            r17 = r9
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r20, r21, r22)
            r2.f32555d = r0
            r2.f32556e = r1
            r2.f32560i = r7
            java.lang.Object r4 = bi1.C0283d.m245c(r4, r8, r2, r7, r8)
            if (r4 != r3) goto L_0x009a
            return r3
        L_0x009a:
            r7 = r0
            r23 = r4
            r4 = r1
            r1 = r23
        L_0x00a0:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r9 = r1 instanceof bi1.C0288f
            if (r9 == 0) goto L_0x00c6
            wx3.f r9 = r1.f854a
            if (r9 != 0) goto L_0x00ae
            wx3.f r9 = r2.getContext()
        L_0x00ae:
            mk1.h$e r10 = new mk1.h$e
            r10.<init>(r1, r8, r7, r4)
            r2.f32555d = r7
            r2.f32556e = r4
            r2.f32557f = r1
            r2.f32560i = r6
            java.lang.Object r6 = a14.C53895h.m60469g(r9, r10, r2)
            if (r6 != r3) goto L_0x00c2
            return r3
        L_0x00c2:
            r6 = r4
            r4 = r1
        L_0x00c4:
            r1 = r4
            r4 = r6
        L_0x00c6:
            boolean r6 = r1 instanceof bi1.C0281b
            if (r6 == 0) goto L_0x00e8
            wx3.f r6 = r1.f854a
            if (r6 != 0) goto L_0x00d2
            wx3.f r6 = r2.getContext()
        L_0x00d2:
            mk1.h$d r9 = new mk1.h$d
            r9.<init>(r1, r8, r7, r4)
            r2.f32555d = r4
            r2.f32556e = r1
            r2.f32557f = r8
            r2.f32560i = r5
            java.lang.Object r1 = a14.C53895h.m60469g(r6, r9, r2)
            if (r1 != r3) goto L_0x00e6
            return r3
        L_0x00e6:
            r2 = r4
        L_0x00e7:
            r4 = r2
        L_0x00e8:
            T r1 = r4.f27484d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mk1.C10906h.mo11115d(wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public final Object mo11116e(C10907a aVar, C15601d<? super C10912c> dVar) {
        String str;
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        String str2 = aVar != null ? aVar.f32542b : null;
        if (str2 == null || str2.length() == 0) {
            str = this.f32534a.getResources().getString(C0966R.string.e2c);
        } else if (aVar == null || (str = aVar.f32542b) == null) {
            str = "";
        }
        C87412m.m108593f(str, "if (livePrepareResp?.err…rrMsg ?: \"\"\n            }");
        C77426q qVar = new C77426q(this.f32534a);
        qVar.mo107595g(str);
        qVar.mo107601m(C0966R.string.f8028zq);
        qVar.mo107589a(true);
        qVar.mo107593e(new C10919g(mVar));
        qVar.mo107603o();
        return mVar.mo74608o();
    }

    /* renamed from: f */
    public final Object mo11117f(int i, int i2, C15601d<? super C10912c> dVar) {
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        String str = this.f32537d;
        Log.m105924i(str, "showErrPage type:" + i + ", errCode:" + i2);
        Intent intent = new Intent();
        intent.putExtra("LIVE_HELP_TYPE", i);
        MMFragmentActivity mMFragmentActivity = this.f32534a;
        C35640b bVar = C35640b.f95284a;
        intent.setClass(mMFragmentActivity, (Class) ((C36570n) C35640b.f95294k).getValue());
        this.f32534a.startActivityForResult(intent).mo7677b(new C10920h(mVar, i2));
        return mVar.mo74608o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x027e, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x027f, code lost:
        r12 = r6.f32537d;
        r29 = r10;
        r10 = new java.lang.StringBuilder();
        r21 = "null cannot be cast to non-null type kotlin.Boolean";
        r10.append("precheckEnable haveShowPrecheckPage:");
        r10.append(r11);
        r10.append(",realnamePrecheckResult:");
        r10.append(r13);
        r10.append(", finderRealnamePrecheckResult:");
        r10.append(r14);
        r10.append(", agePrecheckResult:");
        r10.append(r15);
        r10.append(", otherPrecheckResult:");
        r10.append(r0);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10.toString());
        r10 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bb, code lost:
        if (r10 != false) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02bd, code lost:
        if (r1 != null) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c6, code lost:
        return new mk1.C10906h.C10912c.C10913a(10002);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c7, code lost:
        r0 = r2.f131756f;
        r4.f32564d = r6;
        r4.f32565e = r2;
        r4.f32568h = 5;
        r8 = new a14.C53921m(xx3.C66447b.m78392b(r4), 1);
        r8.mo74609p();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "showPrecheckPage userFlag:" + r0 + " spamRisk:" + r1 + ",stack:" + com.tencent.p014mm.sdk.platformtools.Util.getStack());
        ((ht1.C8777j5) di3.C86312j.m106911c(r3)).mo9599I3(5, r6.f32535b, r6.f32536c, sx3.C90363p0.m113143b(new rx3.C13604l("result", new java.lang.Integer(4))));
        r10 = new android.content.Intent();
        r10.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", r6.f32535b);
        r10.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", r6.f32536c);
        r10.putExtra("LIVE_HELP_TYPE", 11);
        r10.putExtra("PRECHECK_USERFLAG", r0);
        r10.putExtra("PRECHECK_SPAMRISK", r1.toByteArray());
        r0 = r6.f32534a;
        r1 = pt1.C35640b.f95284a;
        r10.setClass(r0, (java.lang.Class) ((rx3.C36570n) pt1.C35640b.f95294k).getValue());
        r6.f32534a.startActivityForResult(r10).mo7677b(new mk1.C10927l(r6, r8));
        r0 = r8.mo74608o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0375, code lost:
        if (r0 != r5) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0377, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0378, code lost:
        r1 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0380, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0382, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "#startLive precheck failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0390, code lost:
        return new mk1.C10906h.C10912c.C10913a(10002);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0391, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0392, code lost:
        r0 = f40.C86709a0.m107535s().mo121142i().mo119685f(com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        gy3.C87412m.m108592e(r0, r21);
        r0 = ((java.lang.Boolean) r0).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03b9, code lost:
        if (((java.lang.Boolean) gg1.C32444a.f86070J1.mo60266n()).booleanValue() == false) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03bb, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03bc, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "#startLive isVerify:" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03d2, code lost:
        if (r0 != false) goto L_0x0577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03d4, code lost:
        r4.f32564d = r6;
        r4.f32565e = r2;
        r4.f32568h = 6;
        r0 = new qg1.C12223h0();
        r1 = r6.f32534a;
        r0.mo85584j1(r1, r1.getResources().getString(com.tencent.p014mm.C0966R.string.ett), 1000);
        r0 = bi1.C0283d.m244b(r0, new mk1.C10926k(r0, r6), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03fb, code lost:
        if (r0 != r5) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03fd, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03fe, code lost:
        r1 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0400, code lost:
        r2 = (mk1.C10906h.C10908b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0404, code lost:
        if ((r2 instanceof mk1.C10906h.C10908b.C10909a) == false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0406, code lost:
        r2 = (mk1.C10906h.C10908b.C10909a) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x040d, code lost:
        if (r2.f32544a != -200010) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x040f, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0411, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0412, code lost:
        ((ht1.C8777j5) di3.C86312j.m106911c(r3)).mo9599I3(5, r6.f32535b, r6.f32536c, sx3.C90363p0.m113143b(new rx3.C13604l("result", new java.lang.Integer(r0))));
        r4.f32564d = null;
        r4.f32565e = null;
        r4.f32568h = 7;
        r0 = r2.f32544a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x043e, code lost:
        if (r0 == -200018) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0440, code lost:
        switch(r0) {
            case com.tencent.wechat.aff.ting.TingProto.MMListenErrCode.MMLISTEN_ERR_INVALID_BROADCAST_VALUE :int: goto L_0x0491;
            case -200011: goto L_0x0485;
            case com.tencent.wechat.aff.ting.TingProto.MMListenErrCode.MMLISTEN_ERR_INVALID_FEEDBUF_VALUE :int: goto L_0x046f;
            case -200009: goto L_0x0459;
            default: goto L_0x0443;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0443, code lost:
        r0 = r6.f32534a;
        nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r0.getResources().getString(com.tencent.p014mm.C0966R.string.dkm), 0).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0459, code lost:
        r0 = r6.f32534a;
        nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r0.getResources().getString(com.tencent.p014mm.C0966R.string.dg7), 0).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x046f, code lost:
        r0 = r6.f32534a;
        nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r0.getResources().getString(com.tencent.p014mm.C0966R.string.dfj), 0).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0485, code lost:
        r0 = r6.mo11117f(3, 10003, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x048b, code lost:
        r0 = new mk1.C10906h.C10912c.C10913a(10003);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0491, code lost:
        r0 = r6.mo11117f(2, 10003, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0496, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0497, code lost:
        if (r2 != r5) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0499, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x049a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x049d, code lost:
        if ((r2 instanceof mk1.C10906h.C10908b.C10910b) == false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x049f, code lost:
        r2 = (mk1.C10906h.C10908b.C10910b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04a9, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2.f32545a.f137924e) != false) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04ab, code lost:
        ((ht1.C8777j5) di3.C86312j.m106911c(r3)).mo9599I3(5, r6.f32535b, r6.f32536c, sx3.C90363p0.m113143b(new rx3.C13604l("result", new java.lang.Integer(4))));
        r0 = r2.f32545a.f137924e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cd, code lost:
        if (r0 != null) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04cf, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04d1, code lost:
        r4.f32564d = r6;
        r4.f32565e = r1;
        r4.f32568h = 8;
        r2 = new a14.C53921m(xx3.C66447b.m78392b(r4), 1);
        r2.mo74609p();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "gotoFaceVerify " + r0);
        r8 = new android.content.Intent();
        r8.putExtra("LIVE_HELP_TYPE", 1);
        r8.putExtra("FACE_VERIFY_URL", r0);
        r0 = r6.f32534a;
        r7 = pt1.C35640b.f95284a;
        r8.setClass(r0, (java.lang.Class) ((rx3.C36570n) pt1.C35640b.f95294k).getValue());
        r6.f32534a.startActivityForResult(r8).mo7677b(new mk1.C10925j(r6, r2));
        r2 = r2.mo74608o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x052d, code lost:
        if (r2 != r5) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x052f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0536, code lost:
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x053f, code lost:
        return new mk1.C10906h.C10912c.C10913a(10004);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0540, code lost:
        r0 = r6.f32534a;
        nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r0.getResources().getString(com.tencent.p014mm.C0966R.string.dz7), 0).show();
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6.f32537d, "prepareLive,realnameUrl is empty:" + r2.f32545a.f137924e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0576, code lost:
        return new mk1.C10906h.C10912c.C10913a(10004);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0577, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x057a, code lost:
        if (r6.f32539f == false) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x057c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "#startLivecheckLivePermission resp" + o40.C61937h.m72709h(r1));
        r4.f32564d = r6;
        r4.f32565e = r1;
        r4.f32568h = 9;
        r0 = p447aw.C103918d.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05b2, code lost:
        if (((p447aw.C103918d) di3.C86312j.m106911c(r0)).Gd0(r6.f32534a, "android.permission.CAMERA") != false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05b4, code lost:
        r2 = new a14.C53921m(xx3.C66447b.m78392b(r4), 1);
        r2.mo74609p();
        ((p447aw.C103918d) di3.C86312j.m106911c(r0)).Jg0(r6.f32534a, 16, new mk1.C10922i(r6, r2), new java.lang.String[]{"android.permission.CAMERA"}, "", "");
        r0 = r2.mo74608o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x05e1, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x05e3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x05e4, code lost:
        if (r2 != r5) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x05e6, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x05e7, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x05e8, code lost:
        r0 = ((java.lang.Boolean) r2).booleanValue();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4.f32537d, "check camera:" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0604, code lost:
        if (r0 != false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0606, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4.f32537d, "check camera stack:" + com.tencent.p014mm.sdk.platformtools.Util.getStack());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0627, code lost:
        return new mk1.C10906h.C10912c.C10913a(10005);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0628, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0629, code lost:
        r0 = r6.f32537d;
        r2 = new java.lang.StringBuilder();
        r2.append("full_tag_info:");
        r4 = r1.f131760j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0637, code lost:
        if (r4 == null) goto L_0x0643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0639, code lost:
        r5 = new java.lang.Integer(r4.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0643, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0644, code lost:
        r2.append(r5);
        r2.append(", visibility_file_list size:");
        r4 = r1.f131762o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x064e, code lost:
        if (r4 == null) goto L_0x065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0650, code lost:
        r11 = new java.lang.Integer(r4.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x065a, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x065b, code lost:
        r2.append(r11);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2.toString());
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "#startLive gotoLive");
        ((ht1.C8777j5) di3.C86312j.m106911c(r3)).mo9599I3(5, r6.f32535b, r6.f32536c, sx3.C90363p0.m113143b(new rx3.C13604l("result", new java.lang.Integer(1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x068f, code lost:
        return new mk1.C10906h.C10912c.C10914b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0690, code lost:
        ((ht1.C8777j5) di3.C86312j.m106911c(r3)).mo9599I3(5, r6.f32535b, r6.f32536c, sx3.C90363p0.m113143b(new rx3.C13604l("result", new java.lang.Integer(2))));
        r4.f32564d = null;
        r4.f32568h = 4;
        r2 = r6.mo11117f(2, 10001, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x06bb, code lost:
        if (r2 != r5) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x06bd, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x06be, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x06c5, code lost:
        return new mk1.C10906h.C10912c.C10913a(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e7, code lost:
        r1.f32540g.mo8913b();
        r6 = r1;
        r1 = (mk1.C10906h.C10907a) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        if (r6.mo11112a(r1) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "#startLive prepare failed");
        r4.f32564d = null;
        r4.f32568h = 3;
        r2 = r6.mo11116e(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0107, code lost:
        if (r2 != r5) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010b, code lost:
        if (r1 == null) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010d, code lost:
        r2 = r1.f32543c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        if (r2 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A != null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        r15 = r2.f131759i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        if (r15 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0120, code lost:
        r15 = r15.liveInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        if (r15 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r15.f182392d != 0) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012c, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012e, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (r10 != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0133, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0134, code lost:
        if (r10 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        r3 = r6.f32537d;
        r4 = new java.lang.StringBuilder();
        r4.append("#startLive continue live:");
        r2 = r2.f131759i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0144, code lost:
        if (r2 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        r2 = r2.liveInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        if (r2 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014a, code lost:
        r11 = new java.lang.Long(r2.f182392d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0152, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        r4.append(r11);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0162, code lost:
        return new mk1.C10906h.C10912c.C10915c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0163, code lost:
        r1 = r2.f131757g;
        r10 = !o40.C61926c.m72696u(r1, 1);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "live global enable:" + r10 + ",flag:" + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0188, code lost:
        if (r10 == false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018a, code lost:
        r1 = r2.f131756f;
        r10 = !o40.C61926c.m72696u(r1, 1);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "live private enable:" + r10 + ",flag:" + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ad, code lost:
        if (r10 != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b1, code lost:
        r1 = r2.f131767t;
        r10 = r2.f131756f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b5, code lost:
        if (r1 != null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "precheckEnable spamRisk is empty!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c0, code lost:
        ok1.C62042e.f176370a.getClass();
        r11 = er1.C58739j4.f168176a.mo83692U();
        r13 = gg1.C32444a.f86210w0.mo60266n().intValue();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("FinderLiveUtil", "canShowAnchorPrecheckEntrance isTest:" + r11 + ",configValue:" + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f5, code lost:
        if (r13 == 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f7, code lost:
        if (r13 == 1) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f9, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fb, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fc, code lost:
        if (r11 != false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fe, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "precheckEnable canShowPrecheckEntrance:false");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0208, code lost:
        if (r1.f131606f != 0) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020a, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020c, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6.f32537d, "precheckEnable showPage:" + r11 + " promt:" + r1.f131606f + " flag:" + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0235, code lost:
        if (r11 != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0237, code lost:
        r21 = "null cannot be cast to non-null type kotlin.Boolean";
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023c, code lost:
        r11 = f40.C86709a0.m107535s().mo121142i().mo119685f(com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        gy3.C87412m.m108592e(r11, "null cannot be cast to non-null type kotlin.Boolean");
        r11 = ((java.lang.Boolean) r11).booleanValue();
        r13 = !o40.C61926c.m72696u(r10, 4);
        r14 = !o40.C61926c.m72696u(r10, 32);
        r15 = !o40.C61926c.m72696u(r10, 8);
        r0 = !o40.C61926c.m72696u(r10, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0272, code lost:
        if (r13 == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0274, code lost:
        if (r14 == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0276, code lost:
        if (r15 == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0278, code lost:
        if (r11 == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027a, code lost:
        if (r0 == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027c, code lost:
        r10 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11118g(mk1.C10906h.C10907a r29, wx3.C15601d<? super mk1.C10906h.C10912c> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.Class<ht1.j5> r3 = ht1.C8777j5.class
            boolean r4 = r2 instanceof mk1.C10906h.C10921i
            if (r4 == 0) goto L_0x001b
            r4 = r2
            mk1.h$i r4 = (mk1.C10906h.C10921i) r4
            int r5 = r4.f32568h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f32568h = r5
            goto L_0x0020
        L_0x001b:
            mk1.h$i r4 = new mk1.h$i
            r4.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r4.f32566f
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f32568h
            java.lang.String r7 = "LIVE_HELP_TYPE"
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Boolean"
            java.lang.String r9 = "result"
            r13 = 3
            r15 = 2
            r11 = 0
            r12 = 1
            switch(r6) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0088;
                case 2: goto L_0x0080;
                case 3: goto L_0x007b;
                case 4: goto L_0x0076;
                case 5: goto L_0x0067;
                case 6: goto L_0x005a;
                case 7: goto L_0x0055;
                case 8: goto L_0x0048;
                case 9: goto L_0x003b;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            java.lang.Object r1 = r4.f32565e
            te3.cj0 r1 = (te3.C49007cj0) r1
            java.lang.Object r4 = r4.f32564d
            mk1.h r4 = (mk1.C10906h) r4
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x05e8
        L_0x0048:
            java.lang.Object r1 = r4.f32565e
            te3.cj0 r1 = (te3.C49007cj0) r1
            java.lang.Object r6 = r4.f32564d
            mk1.h r6 = (mk1.C10906h) r6
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0530
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x049a
        L_0x005a:
            java.lang.Object r1 = r4.f32565e
            te3.cj0 r1 = (te3.C49007cj0) r1
            java.lang.Object r6 = r4.f32564d
            mk1.h r6 = (mk1.C10906h) r6
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0400
        L_0x0067:
            java.lang.Object r1 = r4.f32565e
            te3.cj0 r1 = (te3.C49007cj0) r1
            java.lang.Object r6 = r4.f32564d
            mk1.h r6 = (mk1.C10906h) r6
            kotlin.ResultKt.throwOnFailure(r2)
            r21 = r8
            goto L_0x037a
        L_0x0076:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x06be
        L_0x007b:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x010a
        L_0x0080:
            java.lang.Object r1 = r4.f32564d
            mk1.h r1 = (mk1.C10906h) r1
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00e7
        L_0x0088:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00cc
        L_0x008c:
            kotlin.ResultKt.throwOnFailure(r2)
            ok1.e r2 = ok1.C62042e.f176370a
            r2.getClass()
            boolean r2 = ok1.C62042e.f176374e
            if (r2 != 0) goto L_0x00cd
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r2 == 0) goto L_0x00cd
            java.lang.String r2 = r0.f32537d
            java.lang.String r3 = "pad can't create live!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            mk1.h$a r2 = new mk1.h$a
            if (r1 == 0) goto L_0x00ac
            int r3 = r1.f32541a
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131828486(0x7f111f06, float:1.9289914E38)
            java.lang.String r6 = r6.getString(r7)
            if (r1 == 0) goto L_0x00c0
            te3.cj0 r11 = r1.f32543c
        L_0x00c0:
            r2.<init>(r3, r6, r11)
            r4.f32568h = r12
            java.lang.Object r2 = r0.mo11116e(r2, r4)
            if (r2 != r5) goto L_0x00cc
            return r5
        L_0x00cc:
            return r2
        L_0x00cd:
            if (r1 != 0) goto L_0x00f1
            java.lang.String r1 = r0.f32537d
            java.lang.String r2 = "#startLive prepare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            er1.i5 r1 = r0.f32540g
            r1.begin()
            r4.f32564d = r0
            r4.f32568h = r15
            java.lang.Object r2 = r0.mo11115d(r4)
            if (r2 != r5) goto L_0x00e6
            return r5
        L_0x00e6:
            r1 = r0
        L_0x00e7:
            mk1.h$a r2 = (mk1.C10906h.C10907a) r2
            er1.i5 r6 = r1.f32540g
            r6.mo8913b()
            r6 = r1
            r1 = r2
            goto L_0x00f2
        L_0x00f1:
            r6 = r0
        L_0x00f2:
            boolean r2 = r6.mo11112a(r1)
            if (r2 != 0) goto L_0x010b
            java.lang.String r2 = r6.f32537d
            java.lang.String r3 = "#startLive prepare failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r4.f32564d = r11
            r4.f32568h = r13
            java.lang.Object r2 = r6.mo11116e(r1, r4)
            if (r2 != r5) goto L_0x010a
            return r5
        L_0x010a:
            return r2
        L_0x010b:
            if (r1 == 0) goto L_0x06bf
            te3.cj0 r2 = r1.f32543c
            if (r2 != 0) goto L_0x0113
            goto L_0x06bf
        L_0x0113:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r17 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r17.getClass()
            fj1.b r17 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r17 != 0) goto L_0x0133
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r2.f131759i
            if (r15 == 0) goto L_0x0133
            te3.c21 r15 = r15.liveInfo
            if (r15 == 0) goto L_0x0133
            long r10 = r15.f182392d
            r18 = 0
            int r15 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r15 != 0) goto L_0x012e
            r10 = 1
            goto L_0x012f
        L_0x012e:
            r10 = 0
        L_0x012f:
            if (r10 != 0) goto L_0x0133
            r10 = 1
            goto L_0x0134
        L_0x0133:
            r10 = 0
        L_0x0134:
            if (r10 == 0) goto L_0x0163
            java.lang.String r3 = r6.f32537d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#startLive continue live:"
            r4.append(r5)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f131759i
            if (r2 == 0) goto L_0x0152
            te3.c21 r2 = r2.liveInfo
            if (r2 == 0) goto L_0x0152
            long r5 = r2.f182392d
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r5)
            goto L_0x0153
        L_0x0152:
            r11 = 0
        L_0x0153:
            r4.append(r11)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            mk1.h$c$c r2 = new mk1.h$c$c
            r2.<init>(r1)
            return r2
        L_0x0163:
            int r1 = r2.f131757g
            boolean r10 = o40.C61926c.m72696u(r1, r12)
            r10 = r10 ^ r12
            java.lang.String r11 = r6.f32537d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "live global enable:"
            r15.append(r13)
            r15.append(r10)
            java.lang.String r13 = ",flag:"
            r15.append(r13)
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            if (r10 == 0) goto L_0x0690
            int r1 = r2.f131756f
            boolean r10 = o40.C61926c.m72696u(r1, r12)
            r10 = r10 ^ r12
            java.lang.String r11 = r6.f32537d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r14 = "live private enable:"
            r15.append(r14)
            r15.append(r10)
            r15.append(r13)
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            if (r10 != 0) goto L_0x01b1
            goto L_0x0690
        L_0x01b1:
            te3.ca4 r1 = r2.f131767t
            int r10 = r2.f131756f
            if (r1 != 0) goto L_0x01c0
            java.lang.String r10 = r6.f32537d
            java.lang.String r11 = "precheckEnable spamRisk is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            goto L_0x0237
        L_0x01c0:
            ok1.e r11 = ok1.C62042e.f176370a
            r11.getClass()
            er1.j4 r11 = er1.C58739j4.f168176a
            boolean r11 = r11.mo83692U()
            pe1.c<java.lang.Integer> r13 = gg1.C32444a.f86210w0
            java.lang.Object r13 = r13.mo60266n()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "canShowAnchorPrecheckEntrance isTest:"
            r14.append(r15)
            r14.append(r11)
            java.lang.String r15 = ",configValue:"
            r14.append(r15)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "FinderLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            if (r13 == 0) goto L_0x01fb
            if (r13 == r12) goto L_0x01fc
            r11 = 0
            goto L_0x01fc
        L_0x01fb:
            r11 = 1
        L_0x01fc:
            if (r11 != 0) goto L_0x0206
            java.lang.String r10 = r6.f32537d
            java.lang.String r11 = "precheckEnable canShowPrecheckEntrance:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            goto L_0x0237
        L_0x0206:
            int r11 = r1.f131606f
            if (r11 != 0) goto L_0x020c
            r11 = 1
            goto L_0x020d
        L_0x020c:
            r11 = 0
        L_0x020d:
            java.lang.String r13 = r6.f32537d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "precheckEnable showPage:"
            r14.append(r15)
            r14.append(r11)
            java.lang.String r15 = " promt:"
            r14.append(r15)
            int r15 = r1.f131606f
            r14.append(r15)
            java.lang.String r15 = " flag:"
            r14.append(r15)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            if (r11 != 0) goto L_0x023c
        L_0x0237:
            r21 = r8
            r10 = 1
            goto L_0x02bb
        L_0x023c:
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.Object r11 = r11.mo119685f(r13, r14)
            gy3.C87412m.m108592e(r11, r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r13 = 4
            boolean r14 = o40.C61926c.m72696u(r10, r13)
            r13 = r14 ^ 1
            r14 = 32
            boolean r14 = o40.C61926c.m72696u(r10, r14)
            r14 = r14 ^ r12
            r15 = 8
            boolean r20 = o40.C61926c.m72696u(r10, r15)
            r15 = r20 ^ 1
            r0 = 16
            boolean r0 = o40.C61926c.m72696u(r10, r0)
            r0 = r0 ^ r12
            if (r13 == 0) goto L_0x027e
            if (r14 == 0) goto L_0x027e
            if (r15 == 0) goto L_0x027e
            if (r11 == 0) goto L_0x027e
            if (r0 == 0) goto L_0x027e
            r10 = 1
            goto L_0x027f
        L_0x027e:
            r10 = 0
        L_0x027f:
            java.lang.String r12 = r6.f32537d
            r29 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r21 = r8
            java.lang.String r8 = "precheckEnable haveShowPrecheckPage:"
            r10.append(r8)
            r10.append(r11)
            java.lang.String r8 = ",realnamePrecheckResult:"
            r10.append(r8)
            r10.append(r13)
            java.lang.String r8 = ", finderRealnamePrecheckResult:"
            r10.append(r8)
            r10.append(r14)
            java.lang.String r8 = ", agePrecheckResult:"
            r10.append(r8)
            r10.append(r15)
            java.lang.String r8 = ", otherPrecheckResult:"
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r10 = r29
        L_0x02bb:
            if (r10 != 0) goto L_0x0392
            if (r1 != 0) goto L_0x02c7
            mk1.h$c$a r0 = new mk1.h$c$a
            r1 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r1)
            return r0
        L_0x02c7:
            int r0 = r2.f131756f
            r4.f32564d = r6
            r4.f32565e = r2
            r8 = 5
            r4.f32568h = r8
            a14.m r8 = new a14.m
            wx3.d r10 = xx3.C66447b.m78392b(r4)
            r11 = 1
            r8.<init>(r10, r11)
            r8.mo74609p()
            java.lang.String r10 = r6.f32537d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "showPrecheckPage userFlag:"
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = " spamRisk:"
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = ",stack:"
            r11.append(r12)
            com.tencent.mm.sdk.platformtools.MMStack r12 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            di3.d r10 = di3.C86312j.m106911c(r3)
            r22 = r10
            ht1.j5 r22 = (ht1.C8777j5) r22
            r23 = 5
            int r10 = r6.f32535b
            long r11 = r6.f32536c
            java.lang.Integer r13 = new java.lang.Integer
            r14 = 4
            r13.<init>(r14)
            rx3.l r14 = new rx3.l
            r14.<init>(r9, r13)
            java.util.Map r27 = sx3.C90363p0.m113143b(r14)
            r24 = r10
            r25 = r11
            r22.mo9599I3(r23, r24, r25, r27)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            int r11 = r6.f32535b
            java.lang.String r12 = "KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE"
            r10.putExtra(r12, r11)
            long r11 = r6.f32536c
            java.lang.String r13 = "KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID"
            r10.putExtra(r13, r11)
            r11 = 11
            r10.putExtra(r7, r11)
            java.lang.String r11 = "PRECHECK_USERFLAG"
            r10.putExtra(r11, r0)
            byte[] r0 = r1.toByteArray()
            java.lang.String r1 = "PRECHECK_SPAMRISK"
            r10.putExtra(r1, r0)
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            pt1.b r1 = pt1.C35640b.f95284a
            rx3.g r1 = pt1.C35640b.f95294k
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Class r1 = (java.lang.Class) r1
            r10.setClass(r0, r1)
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            com.tencent.mm.ui.MMFragmentActivity$$d r0 = r0.startActivityForResult(r10)
            mk1.l r1 = new mk1.l
            r1.<init>(r6, r8)
            r0.mo7677b(r1)
            java.lang.Object r0 = r8.mo74608o()
            if (r0 != r5) goto L_0x0378
            return r5
        L_0x0378:
            r1 = r2
            r2 = r0
        L_0x037a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x0391
            java.lang.String r0 = r6.f32537d
            java.lang.String r1 = "#startLive precheck failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            mk1.h$c$a r0 = new mk1.h$c$a
            r1 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r1)
            return r0
        L_0x0391:
            r2 = r1
        L_0x0392:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r1, r8)
            r1 = r21
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            re1.a r1 = gg1.C32444a.f86070J1
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x03bc
            r0 = 1
        L_0x03bc:
            java.lang.String r1 = r6.f32537d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "#startLive isVerify:"
            r8.append(r10)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            if (r0 != 0) goto L_0x0577
            r4.f32564d = r6
            r4.f32565e = r2
            r0 = 6
            r4.f32568h = r0
            qg1.h0 r0 = new qg1.h0
            r0.<init>()
            com.tencent.mm.ui.MMFragmentActivity r1 = r6.f32534a
            android.content.res.Resources r8 = r1.getResources()
            r10 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r8 = r8.getString(r10)
            r10 = 1000(0x3e8, double:4.94E-321)
            r0.mo85584j1(r1, r8, r10)
            mk1.k r1 = new mk1.k
            r1.<init>(r0, r6)
            java.lang.Object r0 = bi1.C0283d.m244b(r0, r1, r4)
            if (r0 != r5) goto L_0x03fe
            return r5
        L_0x03fe:
            r1 = r2
            r2 = r0
        L_0x0400:
            mk1.h$b r2 = (mk1.C10906h.C10908b) r2
            boolean r0 = r2 instanceof mk1.C10906h.C10908b.C10909a
            if (r0 == 0) goto L_0x049b
            mk1.h$b$a r2 = (mk1.C10906h.C10908b.C10909a) r2
            int r0 = r2.f32544a
            r1 = -200010(0xfffffffffffcf2b6, float:NaN)
            if (r0 != r1) goto L_0x0411
            r0 = 3
            goto L_0x0412
        L_0x0411:
            r0 = 2
        L_0x0412:
            di3.d r1 = di3.C86312j.m106911c(r3)
            r10 = r1
            ht1.j5 r10 = (ht1.C8777j5) r10
            r11 = 5
            int r12 = r6.f32535b
            long r13 = r6.f32536c
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            rx3.l r0 = new rx3.l
            r0.<init>(r9, r1)
            java.util.Map r15 = sx3.C90363p0.m113143b(r0)
            r10.mo9599I3(r11, r12, r13, r15)
            r0 = 0
            r4.f32564d = r0
            r4.f32565e = r0
            r0 = 7
            r4.f32568h = r0
            int r0 = r2.f32544a
            r1 = -200018(0xfffffffffffcf2ae, float:NaN)
            r2 = 10003(0x2713, float:1.4017E-41)
            if (r0 == r1) goto L_0x0491
            switch(r0) {
                case -200012: goto L_0x0491;
                case -200011: goto L_0x0485;
                case -200010: goto L_0x046f;
                case -200009: goto L_0x0459;
                default: goto L_0x0443;
            }
        L_0x0443:
            r3 = 0
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            android.content.res.Resources r1 = r0.getResources()
            r4 = 2131827297(0x7f111a61, float:1.9287503E38)
            java.lang.String r1 = r1.getString(r4)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            goto L_0x048b
        L_0x0459:
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131827007(0x7f11193f, float:1.9286914E38)
            java.lang.String r1 = r1.getString(r3)
            r3 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            goto L_0x048b
        L_0x046f:
            r3 = 0
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            android.content.res.Resources r1 = r0.getResources()
            r4 = 2131826981(0x7f111925, float:1.9286862E38)
            java.lang.String r1 = r1.getString(r4)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            goto L_0x048b
        L_0x0485:
            r0 = 3
            java.lang.Object r0 = r6.mo11117f(r0, r2, r4)
            goto L_0x0496
        L_0x048b:
            mk1.h$c$a r0 = new mk1.h$c$a
            r0.<init>(r2)
            goto L_0x0496
        L_0x0491:
            r0 = 2
            java.lang.Object r0 = r6.mo11117f(r0, r2, r4)
        L_0x0496:
            r2 = r0
            if (r2 != r5) goto L_0x049a
            return r5
        L_0x049a:
            return r2
        L_0x049b:
            boolean r0 = r2 instanceof mk1.C10906h.C10908b.C10910b
            if (r0 == 0) goto L_0x0578
            mk1.h$b$b r2 = (mk1.C10906h.C10908b.C10910b) r2
            te3.ma1 r0 = r2.f32545a
            java.lang.String r0 = r0.f137924e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0540
            di3.d r0 = di3.C86312j.m106911c(r3)
            r10 = r0
            ht1.j5 r10 = (ht1.C8777j5) r10
            r11 = 5
            int r12 = r6.f32535b
            long r13 = r6.f32536c
            java.lang.Integer r0 = new java.lang.Integer
            r8 = 4
            r0.<init>(r8)
            rx3.l r8 = new rx3.l
            r8.<init>(r9, r0)
            java.util.Map r15 = sx3.C90363p0.m113143b(r8)
            r10.mo9599I3(r11, r12, r13, r15)
            te3.ma1 r0 = r2.f32545a
            java.lang.String r0 = r0.f137924e
            if (r0 != 0) goto L_0x04d1
            java.lang.String r0 = ""
        L_0x04d1:
            r4.f32564d = r6
            r4.f32565e = r1
            r2 = 8
            r4.f32568h = r2
            a14.m r2 = new a14.m
            wx3.d r8 = xx3.C66447b.m78392b(r4)
            r10 = 1
            r2.<init>(r8, r10)
            r2.mo74609p()
            java.lang.String r8 = r6.f32537d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "gotoFaceVerify "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            r10 = 1
            r8.putExtra(r7, r10)
            java.lang.String r7 = "FACE_VERIFY_URL"
            r8.putExtra(r7, r0)
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            pt1.b r7 = pt1.C35640b.f95284a
            rx3.g r7 = pt1.C35640b.f95294k
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
            r8.setClass(r0, r7)
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            com.tencent.mm.ui.MMFragmentActivity$$d r0 = r0.startActivityForResult(r8)
            mk1.j r7 = new mk1.j
            r7.<init>(r6, r2)
            r0.mo7677b(r7)
            java.lang.Object r2 = r2.mo74608o()
            if (r2 != r5) goto L_0x0530
            return r5
        L_0x0530:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x0578
            mk1.h$c$a r0 = new mk1.h$c$a
            r1 = 10004(0x2714, float:1.4019E-41)
            r0.<init>(r1)
            return r0
        L_0x0540:
            com.tencent.mm.ui.MMFragmentActivity r0 = r6.f32534a
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131828214(0x7f111df6, float:1.9289363E38)
            java.lang.String r1 = r1.getString(r3)
            r3 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            java.lang.String r0 = r6.f32537d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "prepareLive,realnameUrl is empty:"
            r1.append(r3)
            te3.ma1 r2 = r2.f32545a
            java.lang.String r2 = r2.f137924e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            mk1.h$c$a r0 = new mk1.h$c$a
            r1 = 10004(0x2714, float:1.4019E-41)
            r0.<init>(r1)
            return r0
        L_0x0577:
            r1 = r2
        L_0x0578:
            boolean r0 = r6.f32539f
            if (r0 == 0) goto L_0x0629
            java.lang.String r0 = r6.f32537d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "#startLivecheckLivePermission resp"
            r2.append(r7)
            org.json.JSONObject r7 = o40.C61937h.m72709h(r1)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r4.f32564d = r6
            r4.f32565e = r1
            r0 = 9
            r4.f32568h = r0
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r2 = di3.C86312j.m106911c(r0)
            aw.d r2 = (p447aw.C103918d) r2
            com.tencent.mm.ui.MMFragmentActivity r7 = r6.f32534a
            java.lang.String r8 = "android.permission.CAMERA"
            java.lang.String[] r10 = new java.lang.String[]{r8}
            boolean r2 = r2.Gd0(r7, r10)
            if (r2 != 0) goto L_0x05e1
            a14.m r2 = new a14.m
            wx3.d r4 = xx3.C66447b.m78392b(r4)
            r7 = 1
            r2.<init>(r4, r7)
            r2.mo74609p()
            di3.d r0 = di3.C86312j.m106911c(r0)
            r10 = r0
            aw.d r10 = (p447aw.C103918d) r10
            com.tencent.mm.ui.MMFragmentActivity r11 = r6.f32534a
            r12 = 16
            mk1.i r13 = new mk1.i
            r13.<init>(r6, r2)
            java.lang.String[] r14 = new java.lang.String[]{r8}
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            r10.Jg0(r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r2.mo74608o()
            goto L_0x05e3
        L_0x05e1:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x05e3:
            r2 = r0
            if (r2 != r5) goto L_0x05e7
            return r5
        L_0x05e7:
            r4 = r6
        L_0x05e8:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            java.lang.String r2 = r4.f32537d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "check camera:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            if (r0 != 0) goto L_0x0628
            java.lang.String r0 = r4.f32537d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "check camera stack:"
            r1.append(r2)
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            mk1.h$c$a r0 = new mk1.h$c$a
            r1 = 10005(0x2715, float:1.402E-41)
            r0.<init>(r1)
            return r0
        L_0x0628:
            r6 = r4
        L_0x0629:
            java.lang.String r0 = r6.f32537d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "full_tag_info:"
            r2.append(r4)
            java.util.LinkedList<te3.y91> r4 = r1.f131760j
            if (r4 == 0) goto L_0x0643
            int r4 = r4.size()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            goto L_0x0644
        L_0x0643:
            r5 = 0
        L_0x0644:
            r2.append(r5)
            java.lang.String r4 = ", visibility_file_list size:"
            r2.append(r4)
            java.util.LinkedList<te3.vv0> r4 = r1.f131762o
            if (r4 == 0) goto L_0x065a
            int r4 = r4.size()
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r4)
            goto L_0x065b
        L_0x065a:
            r11 = 0
        L_0x065b:
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = r6.f32537d
            java.lang.String r2 = "#startLive gotoLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            di3.d r0 = di3.C86312j.m106911c(r3)
            r10 = r0
            ht1.j5 r10 = (ht1.C8777j5) r10
            r11 = 5
            int r12 = r6.f32535b
            long r13 = r6.f32536c
            java.lang.Integer r0 = new java.lang.Integer
            r2 = 1
            r0.<init>(r2)
            rx3.l r2 = new rx3.l
            r2.<init>(r9, r0)
            java.util.Map r15 = sx3.C90363p0.m113143b(r2)
            r10.mo9599I3(r11, r12, r13, r15)
            mk1.h$c$b r0 = new mk1.h$c$b
            r0.<init>(r1)
            return r0
        L_0x0690:
            di3.d r0 = di3.C86312j.m106911c(r3)
            r10 = r0
            ht1.j5 r10 = (ht1.C8777j5) r10
            r11 = 5
            int r12 = r6.f32535b
            long r13 = r6.f32536c
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 2
            r0.<init>(r1)
            rx3.l r1 = new rx3.l
            r1.<init>(r9, r0)
            java.util.Map r15 = sx3.C90363p0.m113143b(r1)
            r10.mo9599I3(r11, r12, r13, r15)
            r0 = 10001(0x2711, float:1.4014E-41)
            r1 = 0
            r4.f32564d = r1
            r1 = 4
            r4.f32568h = r1
            r1 = 2
            java.lang.Object r2 = r6.mo11117f(r1, r0, r4)
            if (r2 != r5) goto L_0x06be
            return r5
        L_0x06be:
            return r2
        L_0x06bf:
            mk1.h$c$a r0 = new mk1.h$c$a
            r1 = -1
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mk1.C10906h.mo11118g(mk1.h$a, wx3.d):java.lang.Object");
    }
}
