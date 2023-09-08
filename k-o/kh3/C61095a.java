package kh3;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f03.C97785g;
import fy3.C32226l;
import gy3.C87412m;
import i21.C60242i;
import k21.C60960c;
import lh3.C34280b;
import lh3.C61284d;
import rx3.C13598b0;
import te3.C101804kv2;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: kh3.a */
public final class C61095a implements C61284d {

    /* renamed from: a */
    public static final C61095a f173960a = new C61095a();

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.PlatformOp", mo125469f = "PlatformOp.kt", mo125470l = {101}, mo125471m = "getPage")
    /* renamed from: kh3.a$a */
    public static final class C61096a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f173961d;

        /* renamed from: e */
        public final /* synthetic */ C61095a f173962e;

        /* renamed from: f */
        public int f173963f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61096a(C61095a aVar, C15601d<? super C61096a> dVar) {
            super(dVar);
            this.f173962e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f173961d = obj;
            this.f173963f |= Integer.MIN_VALUE;
            return this.f173962e.mo86020i(0, 0, this);
        }
    }

    /* renamed from: a */
    public void mo86010a(Context context, C0000n0 n0Var, String str, int i, int i2, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(str, TPReportKeys.Common.COMMON_SEQ);
        C87412m.m108594g(lVar, "cb");
    }

    /* renamed from: b */
    public boolean mo86011b() {
        return false;
    }

    /* renamed from: c */
    public String mo86012c() {
        return "";
    }

    /* renamed from: d */
    public void mo86013d(Context context, int i, boolean z, C34280b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "data");
        Log.m105924i("PlatformOp", "imagePreview() called with: context = " + context + ", localId = " + i);
        C60960c.f173618a.mo85927k("MomentsTogetherHistoryBrowsing", "withFriendGalleryCount", Integer.valueOf(i), C60242i.UNREPEAT);
    }

    /* renamed from: e */
    public String mo86014e(int i, C101804kv2 kv22) {
        C87412m.m108594g(kv22, "media");
        return null;
    }

    /* renamed from: f */
    public String mo86015f() {
        return "";
    }

    /* renamed from: g */
    public String mo86016g(Context context, int i) {
        C87412m.m108594g(context, "context");
        Log.m105924i("PlatformOp", "getDisplayTime() called with: context = " + context + ", createTime = " + i);
        return "";
    }

    public String getDisplayName(String str) {
        C87412m.m108594g(str, "userName");
        Log.m105924i("PlatformOp", "getDisplayName() called with: userName = " + str);
        return "";
    }

    public String getUsername() {
        return "";
    }

    /* renamed from: h */
    public int mo86019h() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86020i(long r5, int r7, wx3.C15601d<? super lh3.C61285f<lh3.C34282e<lh3.C99474g>>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof kh3.C61095a.C61096a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kh3.a$a r0 = (kh3.C61095a.C61096a) r0
            int r1 = r0.f173963f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f173963f = r1
            goto L_0x0018
        L_0x0013:
            kh3.a$a r0 = new kh3.a$a
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f173961d
            int r0 = r0.f173963f
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r8)
            lh3.f r8 = (lh3.C61285f) r8
            if (r8 != 0) goto L_0x0058
            goto L_0x0052
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "getPage() called with: feedId = "
            r8.append(r0)
            r8.append(r5)
            java.lang.String r5 = ", pageSize = "
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            java.lang.String r6 = "PlatformOp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x0052:
            lh3.f$a r8 = new lh3.f$a
            r5 = 0
            r8.<init>(r5, r1, r5)
        L_0x0058:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kh3.C61095a.mo86020i(long, int, wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public void mo86021j(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "snsId");
        Log.m105924i("PlatformOp", "showDetailUI() called with: context = " + context + ", snsId = " + str);
        C60960c.f173618a.mo85927k("MomentsTogetherHistoryBrowsing", "withFriendDetailCount", str, C60242i.UNREPEAT);
    }

    /* renamed from: k */
    public Object mo86022k(C101804kv2 kv22, boolean z, C15601d<? super Bitmap> dVar) {
        Log.m105924i("PlatformOp", "getSnsMediaBitmap() called with: mediaId = " + kv22.f298689d + ", thumb = " + z);
        return null;
    }

    /* renamed from: l */
    public Object mo86023l(String str, String str2, boolean z, C15601d<? super String> dVar) {
        return null;
    }

    /* renamed from: m */
    public void mo86024m(Context context, String str, int i, int i2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "username");
    }

    /* renamed from: n */
    public Object mo86025n(String str, C15601d<? super Bitmap> dVar) {
        Log.m105924i("PlatformOp", "getAvatarBitmap() called with: userName = " + str);
        return null;
    }

    /* renamed from: o */
    public String mo86026o() {
        return "";
    }

    /* renamed from: p */
    public long mo86027p(String str) {
        C87412m.m108594g(str, "snsId");
        return 0;
    }

    /* renamed from: q */
    public boolean mo86028q() {
        return false;
    }

    /* renamed from: r */
    public C97785g mo86029r(int i, C101804kv2 kv22, int i2) {
        C87412m.m108594g(kv22, "media");
        C87412m.m108591d((Object) null);
        return null;
    }
}
