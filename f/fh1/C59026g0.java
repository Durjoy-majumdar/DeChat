package fh1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.InteractiveGiftController$checkStartJob$1", mo125469f = "InteractiveGiftController.kt", mo125470l = {77, 89}, mo125471m = "invokeSuspend")
/* renamed from: fh1.g0 */
public final class C59026g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f168902d;

    /* renamed from: e */
    public int f168903e;

    /* renamed from: f */
    public int f168904f;

    /* renamed from: g */
    public /* synthetic */ Object f168905g;

    /* renamed from: h */
    public final /* synthetic */ C59014f0 f168906h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59026g0(C59014f0 f0Var, C15601d<? super C59026g0> dVar) {
        super(2, dVar);
        this.f168906h = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C59026g0 g0Var = new C59026g0(this.f168906h, dVar);
        g0Var.f168905g = obj;
        return g0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59026g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0118, code lost:
        r9.f168905g = r10;
        r9.f168902d = r11;
        r9.f168903e = r12;
        r9.f168904f = r8 ? 1 : 0;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderInteractiveGiftLoader", "loadInteractiveGift url:" + r0 + ", path:" + r11);
        r13 = new a14.C53921m(xx3.C66447b.m78392b(r9), r8);
        r13.mo74609p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014c, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r11) == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderInteractiveGiftLoader", "fileExist");
        r0 = kotlin.Result.Companion;
        r13.resumeWith(kotlin.Result.m168114constructorimpl(new fi1.C59092a.C59093a.C59095b(r11)));
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r15 = new p1081gi.C98123f();
        r15.f287660d = "task_FinderCdnDownloader";
        r4 = new java.net.URL(r0).getHost();
        r6 = com.tencent.p014mm.network.C81035d.m98965f(r4, r7, new java.util.ArrayList());
        r7 = com.tencent.p014mm.network.C81035d.m98965f(r4, r8, new java.util.ArrayList());
        r15.field_mediaId = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r0);
        r15.f287631R = r0;
        r15.f287633S = r4;
        r15.f287635U = r11;
        r15.f287638X = r6;
        r15.f287639Y = r7;
        r15.f287640Z = false;
        r6 = new java.lang.StringBuilder();
        r6.append("");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r6.append(com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion, false, 1, (java.lang.Object) null));
        r15.f287641p0 = r6.toString();
        r15.f287642x0 = "";
        r15.f287630Q0 = 150;
        r15.f287632R0 = 20201;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.FinderInteractiveGiftLoader", "attachGiftTaskInfo mediaId:" + r15.field_mediaId + " imageUrl:" + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e1, code lost:
        r8 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0398 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03af A[EDGE_INSN: B:116:0x03af->B:109:0x03af ?: BREAK  
    EDGE_INSN: B:117:0x03af->B:109:0x03af ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0118 A[EDGE_INSN: B:115:0x0118->B:42:0x0118 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0375  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r1.f168904f
            java.lang.String r3 = "fileExist"
            r4 = 2
            java.lang.String r5 = "Finder.FinderInteractiveGiftLoader"
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r8) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            int r2 = r1.f168903e
            java.lang.Object r9 = r1.f168902d
            fi1.a$a r9 = (fi1.C59092a.C59093a) r9
            java.lang.Object r10 = r1.f168905g
            a14.n0 r10 = (a14.C0000n0) r10
            kotlin.ResultKt.throwOnFailure(r24)
            r6 = r1
            r8 = 0
            r11 = 2
            r13 = 0
            r1 = r0
            r0 = r9
            r9 = 1
            goto L_0x0399
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0031:
            int r2 = r1.f168903e
            java.lang.Object r9 = r1.f168902d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.f168905g
            a14.n0 r10 = (a14.C0000n0) r10
            kotlin.ResultKt.throwOnFailure(r24)
            r6 = r1
            r4 = r9
            r7 = r10
            r8 = 0
            r1 = r0
            r0 = r24
            goto L_0x024f
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r24)
            java.lang.Object r2 = r1.f168905g
            a14.n0 r2 = (a14.C0000n0) r2
            r9 = r1
            r10 = r2
            r2 = r0
        L_0x0051:
            fh1.f0 r0 = r9.f168906h
            java.util.concurrent.ConcurrentLinkedQueue<fh1.f0$a> r0 = r0.f168849o
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x03af
            fh1.f0 r0 = r9.f168906h
            java.util.concurrent.ConcurrentLinkedQueue<fh1.f0$a> r0 = r0.f168849o
            java.lang.Object r0 = r0.poll()
            fh1.f0$a r0 = (fh1.C59014f0.C59015a) r0
            te3.p11 r11 = r0.f168853a
            if (r11 != 0) goto L_0x006c
            goto L_0x03af
        L_0x006c:
            int r12 = r0.f168854b
            java.lang.String r0 = r11.f139498A
            if (r0 == 0) goto L_0x007b
            int r13 = r0.length()
            if (r13 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r13 = 0
            goto L_0x007c
        L_0x007b:
            r13 = 1
        L_0x007c:
            if (r13 == 0) goto L_0x0099
            fh1.f0 r0 = r9.f168906h
            java.lang.String r0 = r0.f168847j
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = r11.f139507d
            r12.append(r11)
            java.lang.String r11 = " url is null"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            goto L_0x0051
        L_0x0099:
            java.lang.String r13 = fi1.C59092a.f169056a
            java.lang.String r13 = r11.f139498A
            java.lang.String r11 = r11.f139507d
            if (r13 == 0) goto L_0x00aa
            int r14 = r13.length()
            if (r14 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r14 = 0
            goto L_0x00ab
        L_0x00aa:
            r14 = 1
        L_0x00ab:
            if (r14 != 0) goto L_0x00eb
            if (r11 == 0) goto L_0x00b8
            int r14 = r11.length()
            if (r14 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r14 = 0
            goto L_0x00b9
        L_0x00b8:
            r14 = 1
        L_0x00b9:
            if (r14 == 0) goto L_0x00bc
            goto L_0x00eb
        L_0x00bc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = fi1.C59092a.f169056a
            r14.append(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r13 = 95
            r15.append(r13)
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r11)
            r14.append(r11)
            java.lang.String r11 = ".zip"
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            goto L_0x0108
        L_0x00eb:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "getInteractiveGiftPath invalid url:"
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = ", id:"
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)
            r11 = 0
        L_0x0108:
            if (r11 == 0) goto L_0x0113
            int r13 = r11.length()
            if (r13 != 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r13 = 0
            goto L_0x0114
        L_0x0113:
            r13 = 1
        L_0x0114:
            if (r13 == 0) goto L_0x0118
            goto L_0x0051
        L_0x0118:
            r9.f168905g = r10
            r9.f168902d = r11
            r9.f168903e = r12
            r9.f168904f = r8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "loadInteractiveGift url:"
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = ", path:"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            a14.m r13 = new a14.m
            wx3.d r14 = xx3.C66447b.m78392b(r9)
            r13.<init>(r14, r8)
            r13.mo74609p()
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r14 == 0) goto L_0x0162
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            fi1.a$a$b r0 = new fi1.a$a$b
            r0.<init>(r11)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r13.resumeWith(r0)
            r8 = 0
            goto L_0x0243
        L_0x0162:
            java.lang.String r14 = ""
            gi.f r15 = new gi.f     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.<init>()     // Catch:{ MalformedURLException -> 0x01e0 }
            java.lang.String r4 = "task_FinderCdnDownloader"
            r15.f287660d = r4     // Catch:{ MalformedURLException -> 0x01e0 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01e0 }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x01e0 }
            java.lang.String r4 = r4.getHost()     // Catch:{ MalformedURLException -> 0x01e0 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x01e0 }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x01e0 }
            int r6 = com.tencent.p014mm.network.C81035d.m98965f(r4, r7, r6)     // Catch:{ MalformedURLException -> 0x01e0 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x01e0 }
            r7.<init>()     // Catch:{ MalformedURLException -> 0x01e0 }
            int r7 = com.tencent.p014mm.network.C81035d.m98965f(r4, r8, r7)     // Catch:{ MalformedURLException -> 0x01e0 }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.field_mediaId = r8     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.f287631R = r0     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.f287633S = r4     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.f287635U = r11     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.f287638X = r6     // Catch:{ MalformedURLException -> 0x01e0 }
            r15.f287639Y = r7     // Catch:{ MalformedURLException -> 0x01e0 }
            r4 = 0
            r15.f287640Z = r4     // Catch:{ MalformedURLException -> 0x01e0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01e0 }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x01e0 }
            r6.append(r14)     // Catch:{ MalformedURLException -> 0x01e0 }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r7 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ MalformedURLException -> 0x01e0 }
            r1 = 1
            r8 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(r7, r4, r1, r8)     // Catch:{ MalformedURLException -> 0x01de }
            r6.append(r7)     // Catch:{ MalformedURLException -> 0x01de }
            java.lang.String r1 = r6.toString()     // Catch:{ MalformedURLException -> 0x01de }
            r15.f287641p0 = r1     // Catch:{ MalformedURLException -> 0x01de }
            r15.f287642x0 = r14     // Catch:{ MalformedURLException -> 0x01de }
            r1 = 150(0x96, float:2.1E-43)
            r15.f287630Q0 = r1     // Catch:{ MalformedURLException -> 0x01de }
            r1 = 20201(0x4ee9, float:2.8308E-41)
            r15.f287632R0 = r1     // Catch:{ MalformedURLException -> 0x01de }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01de }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x01de }
            java.lang.String r4 = "attachGiftTaskInfo mediaId:"
            r1.append(r4)     // Catch:{ MalformedURLException -> 0x01de }
            java.lang.String r4 = r15.field_mediaId     // Catch:{ MalformedURLException -> 0x01de }
            r1.append(r4)     // Catch:{ MalformedURLException -> 0x01de }
            java.lang.String r4 = " imageUrl:"
            r1.append(r4)     // Catch:{ MalformedURLException -> 0x01de }
            r1.append(r0)     // Catch:{ MalformedURLException -> 0x01de }
            java.lang.String r0 = r1.toString()     // Catch:{ MalformedURLException -> 0x01de }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ MalformedURLException -> 0x01de }
            goto L_0x01fd
        L_0x01de:
            r0 = move-exception
            goto L_0x01e2
        L_0x01e0:
            r0 = move-exception
            r8 = 0
        L_0x01e2:
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r14, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "attachGiftTaskInfo fail:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r15 = r8
        L_0x01fd:
            if (r15 != 0) goto L_0x0210
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            fi1.a$a$a r0 = new fi1.a$a$a
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.<init>(r1)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r13.resumeWith(r0)
            goto L_0x0243
        L_0x0210:
            fi1.b r0 = new fi1.b
            r0.<init>(r11, r13)
            r15.f287662f = r0
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.xf0(r15)
            if (r0 == 0) goto L_0x022e
            fi1.c r0 = new fi1.c
            r0.<init>(r15)
            r13.mo74599v(r0)
            goto L_0x0243
        L_0x022e:
            java.lang.String r0 = "addRecvTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            fi1.a$a$a r0 = new fi1.a$a$a
            r1 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r1)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r13.resumeWith(r0)
        L_0x0243:
            java.lang.Object r0 = r13.mo74608o()
            if (r0 != r2) goto L_0x024a
            return r2
        L_0x024a:
            r1 = r2
            r6 = r9
            r7 = r10
            r4 = r11
            r2 = r12
        L_0x024f:
            fi1.a$a r0 = (fi1.C59092a.C59093a) r0
            boolean r0 = r0 instanceof fi1.C59092a.C59093a.C59095b
            if (r0 == 0) goto L_0x03a2
            java.lang.String r0 = fi1.C59092a.f169056a
            r12 = 0
            r13 = 4
            r14 = 0
            java.lang.String r10 = ".zip"
            java.lang.String r11 = ""
            r9 = r4
            java.lang.String r0 = z04.C112551y.m153816p(r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "unzipFile path:"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = ", targetPath:"
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r10 = 10002(0x2712, float:1.4016E-41)
            if (r9 == 0) goto L_0x028c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x029f
        L_0x028c:
            int r4 = com.tencent.p014mm.vfs.C86013q1.m106436R(r4, r0)
            if (r4 >= 0) goto L_0x029f
            java.lang.String r0 = "unzip failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            fi1.a$a$a r0 = new fi1.a$a$a
            r0.<init>(r10)
            r13 = 0
            goto L_0x02f9
        L_0x029f:
            r4 = 0
            java.lang.Iterable r9 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r4)
            java.util.List r4 = com.tencent.p014mm.vfs.C116299g2.m163854j(r9)
            if (r4 == 0) goto L_0x02d3
            java.util.Iterator r4 = r4.iterator()
        L_0x02ae:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x02ce
            java.lang.Object r9 = r4.next()
            r11 = r9
            com.tencent.mm.vfs.b0 r11 = (com.tencent.p014mm.vfs.C86001b0) r11
            java.lang.String r11 = r11.f250472b
            java.lang.String r12 = "it.name"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.String r12 = "_"
            r13 = 0
            boolean r11 = z04.C112551y.m153819s(r11, r12, r13)
            r12 = 1
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x02ae
            goto L_0x02d0
        L_0x02ce:
            r13 = 0
            r9 = r8
        L_0x02d0:
            com.tencent.mm.vfs.b0 r9 = (com.tencent.p014mm.vfs.C86001b0) r9
            goto L_0x02d5
        L_0x02d3:
            r13 = 0
            r9 = r8
        L_0x02d5:
            if (r9 != 0) goto L_0x02dd
            fi1.a$a$a r0 = new fi1.a$a$a
            r0.<init>(r10)
            goto L_0x02f9
        L_0x02dd:
            fi1.a$a$b r4 = new fi1.a$a$b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r0 = 47
            r10.append(r0)
            java.lang.String r0 = r9.f250472b
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r4.<init>(r0)
            r0 = r4
        L_0x02f9:
            boolean r4 = r0 instanceof fi1.C59092a.C59093a.C59095b
            if (r4 == 0) goto L_0x039f
            fh1.f0 r4 = r6.f168906h
            java.lang.String r4 = r4.f168847j
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "hasInitGiftMakeUpSuitEffect:"
            r9.append(r10)
            fh1.f0 r10 = r6.f168906h
            boolean r10 = r10.f168851q
            r9.append(r10)
            java.lang.String r10 = ", "
            r9.append(r10)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r10.getClass()
            j50.a r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r11 == 0) goto L_0x032b
            int r11 = r11.hashCode()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            goto L_0x032c
        L_0x032b:
            r12 = r8
        L_0x032c:
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            fh1.f0 r4 = r6.f168906h
            boolean r9 = r4.f168851q
            if (r9 != 0) goto L_0x0375
            r9 = 1
            r4.f168851q = r9
            r10.getClass()
            j50.a r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r4 == 0) goto L_0x0376
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r11 = r4.hashCode()
            r10.append(r11)
            java.lang.String r11 = " attachGiftMakeUpSuitEffect"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.LiveCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            s50.k r10 = r4.f173031q
            ac3.p r4 = r4.f172991C
            r10.getClass()
            java.lang.String r11 = "effect"
            gy3.C87412m.m108594g(r4, r11)
            s50.g r11 = new s50.g
            r11.<init>(r10, r4)
            r10.mo148312q(r11)
            goto L_0x0376
        L_0x0375:
            r9 = 1
        L_0x0376:
            r10 = r7
        L_0x0377:
            if (r2 <= 0) goto L_0x039c
            fh1.f0 r4 = r6.f168906h
            r19 = r0
            fi1.a$a$b r19 = (fi1.C59092a.C59093a.C59095b) r19
            r20 = 5000(0x1388, double:2.4703E-320)
            r6.f168905g = r10
            r6.f168902d = r0
            r6.f168903e = r2
            r11 = 2
            r6.f168904f = r11
            r16 = r4
            r17 = r10
            r18 = r2
            r22 = r6
            java.lang.Object r4 = fh1.C59014f0.m68932m3(r16, r17, r18, r19, r20, r22)
            if (r4 != r1) goto L_0x0399
            return r1
        L_0x0399:
            int r2 = r2 + -1
            goto L_0x0377
        L_0x039c:
            r2 = r1
            r9 = r6
            goto L_0x03a8
        L_0x039f:
            r9 = 1
            r11 = 2
            goto L_0x03a5
        L_0x03a2:
            r9 = 1
            r11 = 2
            r13 = 0
        L_0x03a5:
            r2 = r1
            r9 = r6
            r10 = r7
        L_0x03a8:
            r4 = 2
            r7 = 0
            r8 = 1
            r1 = r23
            goto L_0x0051
        L_0x03af:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x03bb
            r0.mo85692k0()
        L_0x03bb:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59026g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
