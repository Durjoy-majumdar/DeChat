package p164hp;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import rx3.C13605o;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.feature.checkresupdate.superdownloader.WrapCore$getResourceFromUrl$2", mo125469f = "WrapCore.kt", mo125470l = {110, 458, 113, 118, 133, 133}, mo125471m = "invokeSuspend")
/* renamed from: hp.h */
public final class C108254h extends C91594j implements C32227p<C0000n0, C15601d<? super C13605o<? extends Boolean, ? extends String, ? extends String>>, Object> {

    /* renamed from: d */
    public Object f324124d;

    /* renamed from: e */
    public Object f324125e;

    /* renamed from: f */
    public Object f324126f;

    /* renamed from: g */
    public Object f324127g;

    /* renamed from: h */
    public Object f324128h;

    /* renamed from: i */
    public int f324129i;

    /* renamed from: j */
    public boolean f324130j;

    /* renamed from: n */
    public int f324131n;

    /* renamed from: o */
    public final /* synthetic */ C20992d f324132o;

    /* renamed from: p */
    public final /* synthetic */ String f324133p;

    /* renamed from: q */
    public final /* synthetic */ int f324134q;

    /* renamed from: r */
    public final /* synthetic */ String f324135r;

    /* renamed from: s */
    public final /* synthetic */ boolean f324136s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108254h(C20992d dVar, String str, int i, String str2, boolean z, C15601d<? super C108254h> dVar2) {
        super(2, dVar2);
        this.f324132o = dVar;
        this.f324133p = str;
        this.f324134q = i;
        this.f324135r = str2;
        this.f324136s = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108254h(this.f324132o, this.f324133p, this.f324134q, this.f324135r, this.f324136s, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108254h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r8 = (p164hp.C20992d.C20994a) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Download.SuperDownloaderWrapCore", "#getResourceFromUrl " + r1.f324134q + " get lock. ref=" + r8.f59447c);
        r0 = r8.f59446b;
        r9 = r1.f324132o;
        r10 = r1.f324133p;
        r11 = r1.f324135r;
        r12 = r1.f324134q;
        r13 = r1.f324136s;
        r1.f324124d = r8;
        r1.f324125e = r0;
        r1.f324126f = r9;
        r1.f324127g = r10;
        r1.f324128h = r11;
        r1.f324129i = r12;
        r1.f324130j = r13;
        r1.f324131n = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        if (r0.mo85908b((java.lang.Object) null, r1) != r2) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0107, code lost:
        r16 = r12;
        r12 = r0;
        r0 = r13;
        r13 = r8;
        r8 = r16;
        r17 = r10;
        r10 = r9;
        r9 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0113, code lost:
        if (r11 != null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0115, code lost:
        r11 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1.f324124d = r13;
        r1.f324125e = r12;
        r1.f324126f = r10;
        r1.f324127g = r9;
        r1.f324128h = null;
        r1.f324129i = r8;
        r1.f324130j = r0;
        r1.f324131n = 3;
        r11 = p164hp.C20992d.m23173a(r10, r9, r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
        if (r11 != r2) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        r16 = r8;
        r8 = r0;
        r0 = r16;
        r17 = r10;
        r10 = r9;
        r9 = r12;
        r12 = r13;
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11 = (rx3.C13604l) r11;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Download.SuperDownloaderWrapCore", "#getResourceFromUrl " + r0 + " downloadResult=" + ((java.lang.Boolean) r11.f38555d).booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0166, code lost:
        if (((java.lang.Boolean) r11.f38555d).booleanValue() == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0168, code lost:
        if (r8 == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016a, code lost:
        r4 = p164hp.C20992d.f59436d + com.tencent.xweb.file.XVFSFile.SEPARATOR_CHAR + com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r10);
        r1.f324124d = r12;
        r1.f324125e = r9;
        r1.f324126f = r11;
        r1.f324127g = r4;
        r1.f324129i = r0;
        r1.f324131n = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0199, code lost:
        if (p164hp.C20992d.m23176d(r13, (java.lang.String) r11.f38556e, r4, r1) != r2) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x019c, code lost:
        r8 = r11;
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Download.SuperDownloaderWrapCore", "#getResourceFromUrl " + r0 + " unzip done");
        r0 = new rx3.C13605o(java.lang.Boolean.TRUE, r8.f38556e, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01be, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r0 = new rx3.C13605o(java.lang.Boolean.TRUE, r11.f38556e, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cc, code lost:
        r0 = new rx3.C13605o(java.lang.Boolean.FALSE, "", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r9.mo85909c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d6, code lost:
        if (r12 == null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d8, code lost:
        r4 = r1.f324132o;
        r1.f324124d = r12;
        r1.f324125e = r0;
        r1.f324126f = null;
        r1.f324127g = null;
        r1.f324131n = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e9, code lost:
        if (p164hp.C20992d.m23174b(r4, r12, r1) != r2) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01eb, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ec, code lost:
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ed, code lost:
        r12 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ee, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("#getResourceFromUrl ");
        r2.append(r1.f324134q);
        r2.append(" release lock. ref=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fe, code lost:
        if (r12 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0200, code lost:
        r7 = new java.lang.Integer(r12.f59447c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0207, code lost:
        r2.append(r7);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Download.SuperDownloaderWrapCore", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0211, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0212, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0213, code lost:
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0215, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0218, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0219, code lost:
        r9 = r12;
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0222, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0228, code lost:
        r4 = r1.f324132o;
        r1.f324124d = r8;
        r1.f324125e = r0;
        r1.f324126f = null;
        r1.f324127g = null;
        r1.f324128h = null;
        r1.f324131n = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023b, code lost:
        if (p164hp.C20992d.m23174b(r4, r8, r1) == r2) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023e, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023f, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0252, code lost:
        r7 = new java.lang.Integer(r8.f59447c);
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r1.f324131n
            java.lang.String r3 = " release lock. ref="
            java.lang.String r4 = ""
            java.lang.String r5 = "#getResourceFromUrl "
            java.lang.String r6 = "Download.SuperDownloaderWrapCore"
            r7 = 0
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x009a;
                case 2: goto L_0x0073;
                case 3: goto L_0x004b;
                case 4: goto L_0x0034;
                case 5: goto L_0x0027;
                case 6: goto L_0x001a;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001a:
            java.lang.Object r0 = r1.f324125e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r2 = r1.f324124d
            hp.d$a r2 = (p164hp.C20992d.C20994a) r2
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x023f
        L_0x0027:
            java.lang.Object r0 = r1.f324125e
            rx3.o r0 = (rx3.C13605o) r0
            java.lang.Object r2 = r1.f324124d
            hp.d$a r2 = (p164hp.C20992d.C20994a) r2
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x01ed
        L_0x0034:
            int r0 = r1.f324129i
            java.lang.Object r4 = r1.f324127g
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r1.f324126f
            rx3.l r8 = (rx3.C13604l) r8
            java.lang.Object r9 = r1.f324125e
            k14.c r9 = (k14.C99088c) r9
            java.lang.Object r10 = r1.f324124d
            hp.d$a r10 = (p164hp.C20992d.C20994a) r10
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x01c0 }
            goto L_0x019e
        L_0x004b:
            boolean r0 = r1.f324130j
            int r8 = r1.f324129i
            java.lang.Object r9 = r1.f324127g
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.f324126f
            hp.d r10 = (p164hp.C20992d) r10
            java.lang.Object r11 = r1.f324125e
            k14.c r11 = (k14.C99088c) r11
            java.lang.Object r12 = r1.f324124d
            hp.d$a r12 = (p164hp.C20992d.C20994a) r12
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x006e }
            r13 = r10
            r10 = r9
            r9 = r11
            r11 = r19
            r16 = r8
            r8 = r0
            r0 = r16
            goto L_0x013a
        L_0x006e:
            r0 = move-exception
            r9 = r11
        L_0x0070:
            r10 = r12
            goto L_0x021b
        L_0x0073:
            boolean r0 = r1.f324130j
            int r8 = r1.f324129i
            java.lang.Object r9 = r1.f324128h
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.f324127g
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.f324126f
            hp.d r11 = (p164hp.C20992d) r11
            java.lang.Object r12 = r1.f324125e
            k14.c r12 = (k14.C99088c) r12
            java.lang.Object r13 = r1.f324124d
            hp.d$a r13 = (p164hp.C20992d.C20994a) r13
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0096 }
            r16 = r11
            r11 = r9
            r9 = r10
            r10 = r16
            goto L_0x0113
        L_0x0096:
            r0 = move-exception
            r8 = r13
            goto L_0x0226
        L_0x009a:
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0224 }
            r0 = r19
            goto L_0x00c2
        L_0x00a0:
            kotlin.ResultKt.throwOnFailure(r19)
            hp.d r0 = r1.f324132o     // Catch:{ all -> 0x0224 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0224 }
            r8.<init>()     // Catch:{ all -> 0x0224 }
            java.lang.String r9 = "url_"
            r8.append(r9)     // Catch:{ all -> 0x0224 }
            java.lang.String r9 = r1.f324133p     // Catch:{ all -> 0x0224 }
            r8.append(r9)     // Catch:{ all -> 0x0224 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0224 }
            r9 = 1
            r1.f324131n = r9     // Catch:{ all -> 0x0224 }
            java.lang.Object r0 = p164hp.C20992d.m23175c(r0, r8, r1)     // Catch:{ all -> 0x0224 }
            if (r0 != r2) goto L_0x00c2
            return r2
        L_0x00c2:
            r8 = r0
            hp.d$a r8 = (p164hp.C20992d.C20994a) r8     // Catch:{ all -> 0x0224 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0222 }
            r0.<init>()     // Catch:{ all -> 0x0222 }
            r0.append(r5)     // Catch:{ all -> 0x0222 }
            int r9 = r1.f324134q     // Catch:{ all -> 0x0222 }
            r0.append(r9)     // Catch:{ all -> 0x0222 }
            java.lang.String r9 = " get lock. ref="
            r0.append(r9)     // Catch:{ all -> 0x0222 }
            int r9 = r8.f59447c     // Catch:{ all -> 0x0222 }
            r0.append(r9)     // Catch:{ all -> 0x0222 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0222 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x0222 }
            k14.c r0 = r8.f59446b     // Catch:{ all -> 0x0222 }
            hp.d r9 = r1.f324132o     // Catch:{ all -> 0x0222 }
            java.lang.String r10 = r1.f324133p     // Catch:{ all -> 0x0222 }
            java.lang.String r11 = r1.f324135r     // Catch:{ all -> 0x0222 }
            int r12 = r1.f324134q     // Catch:{ all -> 0x0222 }
            boolean r13 = r1.f324136s     // Catch:{ all -> 0x0222 }
            r1.f324124d = r8     // Catch:{ all -> 0x0222 }
            r1.f324125e = r0     // Catch:{ all -> 0x0222 }
            r1.f324126f = r9     // Catch:{ all -> 0x0222 }
            r1.f324127g = r10     // Catch:{ all -> 0x0222 }
            r1.f324128h = r11     // Catch:{ all -> 0x0222 }
            r1.f324129i = r12     // Catch:{ all -> 0x0222 }
            r1.f324130j = r13     // Catch:{ all -> 0x0222 }
            r14 = 2
            r1.f324131n = r14     // Catch:{ all -> 0x0222 }
            java.lang.Object r14 = r0.mo85908b(r7, r1)     // Catch:{ all -> 0x0222 }
            if (r14 != r2) goto L_0x0107
            return r2
        L_0x0107:
            r16 = r12
            r12 = r0
            r0 = r13
            r13 = r8
            r8 = r16
            r17 = r10
            r10 = r9
            r9 = r17
        L_0x0113:
            if (r11 != 0) goto L_0x0116
            r11 = r4
        L_0x0116:
            r1.f324124d = r13     // Catch:{ all -> 0x0218 }
            r1.f324125e = r12     // Catch:{ all -> 0x0218 }
            r1.f324126f = r10     // Catch:{ all -> 0x0218 }
            r1.f324127g = r9     // Catch:{ all -> 0x0218 }
            r1.f324128h = r7     // Catch:{ all -> 0x0218 }
            r1.f324129i = r8     // Catch:{ all -> 0x0218 }
            r1.f324130j = r0     // Catch:{ all -> 0x0218 }
            r14 = 3
            r1.f324131n = r14     // Catch:{ all -> 0x0218 }
            java.lang.Object r11 = p164hp.C20992d.m23173a(r10, r9, r11, r1)     // Catch:{ all -> 0x0218 }
            if (r11 != r2) goto L_0x012e
            return r2
        L_0x012e:
            r16 = r8
            r8 = r0
            r0 = r16
            r17 = r10
            r10 = r9
            r9 = r12
            r12 = r13
            r13 = r17
        L_0x013a:
            rx3.l r11 = (rx3.C13604l) r11     // Catch:{ all -> 0x0215 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0215 }
            r14.<init>()     // Catch:{ all -> 0x0215 }
            r14.append(r5)     // Catch:{ all -> 0x0215 }
            r14.append(r0)     // Catch:{ all -> 0x0215 }
            java.lang.String r15 = " downloadResult="
            r14.append(r15)     // Catch:{ all -> 0x0215 }
            A r15 = r11.f38555d     // Catch:{ all -> 0x0215 }
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x0215 }
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x0215 }
            r14.append(r15)     // Catch:{ all -> 0x0215 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0215 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r14)     // Catch:{ all -> 0x0215 }
            A r14 = r11.f38555d     // Catch:{ all -> 0x0215 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0215 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0215 }
            if (r14 == 0) goto L_0x01cc
            if (r8 == 0) goto L_0x01c2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0215 }
            r4.<init>()     // Catch:{ all -> 0x0215 }
            java.lang.String r8 = p164hp.C20992d.f59436d     // Catch:{ all -> 0x0215 }
            r4.append(r8)     // Catch:{ all -> 0x0215 }
            r8 = 47
            r4.append(r8)     // Catch:{ all -> 0x0215 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r10)     // Catch:{ all -> 0x0215 }
            r4.append(r8)     // Catch:{ all -> 0x0215 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0215 }
            B r8 = r11.f38556e     // Catch:{ all -> 0x0215 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0215 }
            r1.f324124d = r12     // Catch:{ all -> 0x0215 }
            r1.f324125e = r9     // Catch:{ all -> 0x0215 }
            r1.f324126f = r11     // Catch:{ all -> 0x0215 }
            r1.f324127g = r4     // Catch:{ all -> 0x0215 }
            r1.f324129i = r0     // Catch:{ all -> 0x0215 }
            r10 = 4
            r1.f324131n = r10     // Catch:{ all -> 0x0215 }
            java.lang.Object r8 = p164hp.C20992d.m23176d(r13, r8, r4, r1)     // Catch:{ all -> 0x0215 }
            if (r8 != r2) goto L_0x019c
            return r2
        L_0x019c:
            r8 = r11
            r10 = r12
        L_0x019e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c0 }
            r11.<init>()     // Catch:{ all -> 0x01c0 }
            r11.append(r5)     // Catch:{ all -> 0x01c0 }
            r11.append(r0)     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = " unzip done"
            r11.append(r0)     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x01c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x01c0 }
            rx3.o r0 = new rx3.o     // Catch:{ all -> 0x01c0 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01c0 }
            B r8 = r8.f38556e     // Catch:{ all -> 0x01c0 }
            r0.<init>(r11, r8, r4)     // Catch:{ all -> 0x01c0 }
            r12 = r10
            goto L_0x01d3
        L_0x01c0:
            r0 = move-exception
            goto L_0x021b
        L_0x01c2:
            rx3.o r0 = new rx3.o     // Catch:{ all -> 0x0215 }
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0215 }
            B r10 = r11.f38556e     // Catch:{ all -> 0x0215 }
            r0.<init>(r8, r10, r4)     // Catch:{ all -> 0x0215 }
            goto L_0x01d3
        L_0x01cc:
            rx3.o r0 = new rx3.o     // Catch:{ all -> 0x0215 }
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0215 }
            r0.<init>(r8, r4, r4)     // Catch:{ all -> 0x0215 }
        L_0x01d3:
            r9.mo85909c(r7)     // Catch:{ all -> 0x0212 }
            if (r12 == 0) goto L_0x01ee
            hp.d r4 = r1.f324132o
            r1.f324124d = r12
            r1.f324125e = r0
            r1.f324126f = r7
            r1.f324127g = r7
            r8 = 5
            r1.f324131n = r8
            java.lang.Object r4 = p164hp.C20992d.m23174b(r4, r12, r1)
            if (r4 != r2) goto L_0x01ec
            return r2
        L_0x01ec:
            r2 = r12
        L_0x01ed:
            r12 = r2
        L_0x01ee:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            int r4 = r1.f324134q
            r2.append(r4)
            r2.append(r3)
            if (r12 == 0) goto L_0x0207
            int r3 = r12.f59447c
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
        L_0x0207:
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            return r0
        L_0x0212:
            r0 = move-exception
            r8 = r12
            goto L_0x0226
        L_0x0215:
            r0 = move-exception
            goto L_0x0070
        L_0x0218:
            r0 = move-exception
            r9 = r12
            r10 = r13
        L_0x021b:
            r9.mo85909c(r7)     // Catch:{ all -> 0x021f }
            throw r0     // Catch:{ all -> 0x021f }
        L_0x021f:
            r0 = move-exception
            r8 = r10
            goto L_0x0226
        L_0x0222:
            r0 = move-exception
            goto L_0x0226
        L_0x0224:
            r0 = move-exception
            r8 = r7
        L_0x0226:
            if (r8 == 0) goto L_0x0240
            hp.d r4 = r1.f324132o
            r1.f324124d = r8
            r1.f324125e = r0
            r1.f324126f = r7
            r1.f324127g = r7
            r1.f324128h = r7
            r9 = 6
            r1.f324131n = r9
            java.lang.Object r4 = p164hp.C20992d.m23174b(r4, r8, r1)
            if (r4 != r2) goto L_0x023e
            return r2
        L_0x023e:
            r2 = r8
        L_0x023f:
            r8 = r2
        L_0x0240:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            int r4 = r1.f324134q
            r2.append(r4)
            r2.append(r3)
            if (r8 == 0) goto L_0x0259
            int r3 = r8.f59447c
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
        L_0x0259:
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164hp.C108254h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
