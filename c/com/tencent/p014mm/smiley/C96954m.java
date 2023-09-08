package com.tencent.p014mm.smiley;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53935p1;
import a14.C53939q1;
import a14.y2$$a;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ja3.C60786a;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import k14.C60942d;
import k14.C99088c;
import my3.C61595o;
import rx3.C13598b0;
import sx3.C36904l0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.smiley.m */
public final class C96954m {

    /* renamed from: a */
    public static final C96954m f284033a = new C96954m();

    /* renamed from: b */
    public static C53935p1 f284034b;

    /* renamed from: c */
    public static C0000n0 f284035c;

    /* renamed from: d */
    public static final C99088c f284036d = new C60942d(true);

    /* renamed from: e */
    public static C60786a f284037e;

    /* renamed from: f */
    public static C96955a f284038f = new C96955a(0, 0, 0, 0, 0, 0, 0, 127, (C8480h) null);

    /* renamed from: g */
    public static boolean f284039g = true;

    /* renamed from: com.tencent.mm.smiley.m$a */
    public static final class C96955a {

        /* renamed from: a */
        public long f284040a;

        /* renamed from: b */
        public long f284041b;

        /* renamed from: c */
        public int f284042c;

        /* renamed from: d */
        public long f284043d;

        /* renamed from: e */
        public long f284044e;

        /* renamed from: f */
        public long f284045f;

        /* renamed from: g */
        public long f284046g;

        public C96955a() {
            this(0, 0, 0, 0, 0, 0, 0, 127, (C8480h) null);
        }

        public C96955a(long j, long j2, int i, long j3, long j4, long j5, long j6, int i2, C8480h hVar) {
            long j7 = 0;
            long j8 = (i2 & 1) != 0 ? 0 : j;
            long j9 = (i2 & 2) != 0 ? 0 : j2;
            int i3 = (i2 & 4) != 0 ? 0 : i;
            long j15 = (i2 & 8) != 0 ? 0 : j3;
            long j16 = (i2 & 16) != 0 ? 0 : j4;
            long j17 = (i2 & 32) != 0 ? 0 : j5;
            j7 = (i2 & 64) == 0 ? j6 : j7;
            this.f284040a = j8;
            this.f284041b = j9;
            this.f284042c = i3;
            this.f284043d = j15;
            this.f284044e = j16;
            this.f284045f = j17;
            this.f284046g = j7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C96955a)) {
                return false;
            }
            C96955a aVar = (C96955a) obj;
            return this.f284040a == aVar.f284040a && this.f284041b == aVar.f284041b && this.f284042c == aVar.f284042c && this.f284043d == aVar.f284043d && this.f284044e == aVar.f284044e && this.f284045f == aVar.f284045f && this.f284046g == aVar.f284046g;
        }

        public int hashCode() {
            long j = this.f284040a;
            long j2 = this.f284041b;
            long j3 = this.f284043d;
            long j4 = this.f284044e;
            long j5 = this.f284045f;
            long j6 = this.f284046g;
            return (((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f284042c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public String toString() {
            return "CostStatistics(totalMs=" + this.f284040a + ", frameCount=" + this.f284041b + ", fileCount=" + this.f284042c + ", maxReadMs=" + this.f284043d + ", maxDecodeMs=" + this.f284044e + ", maxConvertMs=" + this.f284045f + ", maxOcrMs=" + this.f284046g + ')';
        }
    }

    /* renamed from: com.tencent.mm.smiley.m$b */
    public static final class C96956b {

        /* renamed from: a */
        public final ByteBuffer f284047a;

        /* renamed from: b */
        public final int f284048b;

        /* renamed from: c */
        public final int f284049c;

        public C96956b(ByteBuffer byteBuffer, int i, int i2) {
            C87412m.m108594g(byteBuffer, "buffer");
            this.f284047a = byteBuffer;
            this.f284048b = i;
            this.f284049c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C96956b)) {
                return false;
            }
            C96956b bVar = (C96956b) obj;
            return C87412m.m108589b(this.f284047a, bVar.f284047a) && this.f284048b == bVar.f284048b && this.f284049c == bVar.f284049c;
        }

        public int hashCode() {
            return (((this.f284047a.hashCode() * 31) + this.f284048b) * 31) + this.f284049c;
        }

        public String toString() {
            return "ImageBuffer(buffer=" + this.f284047a + ", width=" + this.f284048b + ", height=" + this.f284049c + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.smiley.EmojiOcrService$start$2", mo125469f = "EmojiOcrService.kt", mo125470l = {250}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.smiley.m$c */
    public static final class C96957c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f284050d;

        /* renamed from: e */
        public Object f284051e;

        /* renamed from: f */
        public Object f284052f;

        /* renamed from: g */
        public Object f284053g;

        /* renamed from: h */
        public Object f284054h;

        /* renamed from: i */
        public int f284055i;

        /* renamed from: j */
        public final /* synthetic */ boolean f284056j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96957c(boolean z, C15601d<? super C96957c> dVar) {
            super(2, dVar);
            this.f284056j = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C96957c(this.f284056j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C96957c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.tencent.mm.storage.emotion.EmojiInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: k14.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0185 A[Catch:{ all -> 0x0190 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f284055i
                r2 = 0
                java.lang.String r3 = "MicroMsg.EmojiOcrService"
                r4 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 != r4) goto L_0x0026
                java.lang.Object r1 = r12.f284054h
                k14.c r1 = (k14.C99088c) r1
                java.lang.Object r5 = r12.f284053g
                com.tencent.mm.storage.emotion.EmojiInfo r5 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r5
                java.lang.Object r6 = r12.f284052f
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r12.f284051e
                com.tencent.mm.autogen.mmdata.rpt.EmoticonClientLocalOcrResultStruct r7 = (com.tencent.p014mm.autogen.mmdata.rpt.EmoticonClientLocalOcrResultStruct) r7
                java.lang.Object r8 = r12.f284050d
                gy3.d0 r8 = (gy3.C8478d0) r8
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r12
                goto L_0x0178
            L_0x0026:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r13)
                com.tencent.mm.smiley.m r13 = com.tencent.p014mm.smiley.C96954m.f284033a
                ja3.a r13 = new ja3.a
                r13.<init>()
                boolean r1 = r13.mo85719b()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "init ocr result :"
                r5.append(r6)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                if (r1 != 0) goto L_0x0055
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            L_0x0055:
                com.tencent.p014mm.smiley.C96954m.f284037e = r13
                com.tencent.mm.storage.w2 r13 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.g r13 = r13.mo57717d()
                java.util.List r13 = r13.mo142036DN(r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r5 = r13.iterator()
            L_0x006c:
                boolean r6 = r5.hasNext()
                r7 = 0
                if (r6 == 0) goto L_0x0099
                java.lang.Object r6 = r5.next()
                r8 = r6
                com.tencent.mm.storage.emotion.EmojiInfo r8 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r8
                boolean r9 = r8.mo62633C1()
                if (r9 == 0) goto L_0x0093
                java.lang.String r8 = r8.mo62640K1()
                if (r8 == 0) goto L_0x008f
                int r8 = r8.length()
                if (r8 != 0) goto L_0x008d
                goto L_0x008f
            L_0x008d:
                r8 = 0
                goto L_0x0090
            L_0x008f:
                r8 = 1
            L_0x0090:
                if (r8 != 0) goto L_0x0093
                r7 = 1
            L_0x0093:
                if (r7 == 0) goto L_0x006c
                r1.add(r6)
                goto L_0x006c
            L_0x0099:
                boolean r5 = r12.f284056j
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r8 = r1.iterator()
            L_0x00a4:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00c1
                java.lang.Object r9 = r8.next()
                r10 = r9
                com.tencent.mm.storage.emotion.EmojiInfo r10 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r10
                if (r5 != 0) goto L_0x00ba
                java.lang.String r10 = r10.field_meanings
                if (r10 != 0) goto L_0x00b8
                goto L_0x00ba
            L_0x00b8:
                r10 = 0
                goto L_0x00bb
            L_0x00ba:
                r10 = 1
            L_0x00bb:
                if (r10 == 0) goto L_0x00a4
                r6.add(r9)
                goto L_0x00a4
            L_0x00c1:
                gy3.d0 r5 = new gy3.d0
                r5.<init>()
                boolean r8 = r12.f284056j
                if (r8 == 0) goto L_0x00cb
                goto L_0x00fa
            L_0x00cb:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r9 = r1.iterator()
            L_0x00d4:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x00f6
                java.lang.Object r10 = r9.next()
                r11 = r10
                com.tencent.mm.storage.emotion.EmojiInfo r11 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r11
                java.lang.String r11 = r11.field_meanings
                if (r11 == 0) goto L_0x00ee
                int r11 = r11.length()
                if (r11 != 0) goto L_0x00ec
                goto L_0x00ee
            L_0x00ec:
                r11 = 0
                goto L_0x00ef
            L_0x00ee:
                r11 = 1
            L_0x00ef:
                r11 = r11 ^ r4
                if (r11 == 0) goto L_0x00d4
                r8.add(r10)
                goto L_0x00d4
            L_0x00f6:
                int r7 = r8.size()
            L_0x00fa:
                r5.f27483d = r7
                boolean r7 = r6.isEmpty()
                if (r7 == 0) goto L_0x010f
                java.lang.String r13 = "No emojis to recognize, exited"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
                com.tencent.mm.smiley.m r13 = com.tencent.p014mm.smiley.C96954m.f284033a
                r13.mo135540d()
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            L_0x010f:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "emoji queue is ready: "
                r7.append(r8)
                int r8 = r6.size()
                r7.append(r8)
                java.lang.String r8 = " / "
                r7.append(r8)
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                int r8 = r13.size()
                r7.append(r8)
                java.lang.String r8 = " emoji(s) are pending to be recognized"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                com.tencent.mm.autogen.mmdata.rpt.EmoticonClientLocalOcrResultStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.EmoticonClientLocalOcrResultStruct
                r7.<init>()
                int r13 = r13.size()
                long r8 = (long) r13
                r7.f265447d = r8
                int r13 = r1.size()
                long r8 = (long) r13
                r7.f265448e = r8
                java.util.Iterator r13 = r6.iterator()
                r6 = r13
                r8 = r5
                r13 = r12
            L_0x0154:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0195
                java.lang.Object r1 = r6.next()
                r5 = r1
                com.tencent.mm.storage.emotion.EmojiInfo r5 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r5
                k14.c r1 = com.tencent.p014mm.smiley.C96954m.f284036d
                r13.f284050d = r8
                r13.f284051e = r7
                r13.f284052f = r6
                r13.f284053g = r5
                r13.f284054h = r1
                r13.f284055i = r4
                k14.d r1 = (k14.C60942d) r1
                java.lang.Object r9 = r1.mo85908b(r2, r13)
                if (r9 != r0) goto L_0x0178
                return r0
            L_0x0178:
                com.tencent.mm.smiley.m r9 = com.tencent.p014mm.smiley.C96954m.f284033a     // Catch:{ all -> 0x0190 }
                java.lang.String r10 = "emoji"
                gy3.C87412m.m108593f(r5, r10)     // Catch:{ all -> 0x0190 }
                boolean r5 = com.tencent.p014mm.smiley.C96954m.m124532a(r9, r5)     // Catch:{ all -> 0x0190 }
                if (r5 == 0) goto L_0x018a
                int r5 = r8.f27483d     // Catch:{ all -> 0x0190 }
                int r5 = r5 + r4
                r8.f27483d = r5     // Catch:{ all -> 0x0190 }
            L_0x018a:
                rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0190 }
                r1.mo85909c(r2)
                goto L_0x0154
            L_0x0190:
                r13 = move-exception
                r1.mo85909c(r2)
                throw r13
            L_0x0195:
                int r13 = r8.f27483d
                long r0 = (long) r13
                r7.f265449f = r0
                r7.mo86054n()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "done, statistics: "
                r13.append(r0)
                com.tencent.mm.smiley.m$a r0 = com.tencent.p014mm.smiley.C96954m.f284038f
                r13.append(r0)
                java.lang.String r0 = ", report: "
                r13.append(r0)
                java.lang.String r0 = r7.mo1006q()
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
                com.tencent.mm.storage.p2 r13 = com.tencent.p014mm.storage.C30764p2.f82718j
                r13.mo57680g()
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96954m.C96957c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        C0000n0 a = C53930o0.m60554a(C53872d1.f151117a);
        C53930o0.m60556c(a, (CancellationException) null);
        f284035c = a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc A[Catch:{ all -> 0x0172, all -> 0x016d, all -> 0x0168, all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[Catch:{ all -> 0x0172, all -> 0x016d, all -> 0x0168, all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1 A[Catch:{ all -> 0x0172, all -> 0x016d, all -> 0x0168, all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce A[Catch:{ all -> 0x0172, all -> 0x016d, all -> 0x0168, all -> 0x01a9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m124532a(com.tencent.p014mm.smiley.C96954m r21, com.tencent.p014mm.storage.emotion.EmojiInfo r22) {
        /*
            r0 = r22
            r21.getClass()
            java.lang.String r1 = r22.mo62640K1()
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.emoji.decode.MMGIFJNIFactory$Companion r4 = com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.Companion     // Catch:{ all -> 0x01ae }
            tk.d r4 = r4.getDecoder((com.tencent.p014mm.storage.emotion.EmojiInfo) r0)     // Catch:{ all -> 0x01ae }
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            ja3.a r2 = f284037e
            java.lang.String r3 = "MicroMsg.EmojiOcrService"
            if (r2 != 0) goto L_0x0026
            java.lang.String r0 = "Unexpected recognizer"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r7 = 0
            goto L_0x01a8
        L_0x0026:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 91
            r8.append(r9)
            java.lang.String r10 = r22.getMd5()
            r8.append(r10)
            java.lang.String r10 = "] create decoder in "
            r8.append(r10)
            r8.append(r5)
            java.lang.String r10 = "ms for "
            r8.append(r10)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            com.tencent.mm.smiley.m$a r1 = f284038f
            long r10 = r1.f284043d
            long r10 = java.lang.Math.max(r5, r10)
            r1.f284043d = r10
            long r10 = r1.f284040a
            long r10 = r10 + r5
            r1.f284040a = r10
            int r5 = r1.f284042c
            r6 = 1
            int r5 = r5 + r6
            r1.f284042c = r5
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r1 = r4.mo35635e()     // Catch:{ all -> 0x01a9 }
            r5 = 0
        L_0x006e:
            if (r5 >= r1) goto L_0x0177
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            r4.mo35631b()     // Catch:{ all -> 0x0172 }
            android.graphics.Bitmap r8 = r4.getFrame()     // Catch:{ all -> 0x0172 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            long r13 = r13 - r11
            int r11 = r5 % 5
            if (r11 == 0) goto L_0x008a
            r15 = r1
            r7 = r2
            r2 = 91
            goto L_0x015f
        L_0x008a:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            com.tencent.mm.smiley.m r15 = f284033a     // Catch:{ all -> 0x016d }
            com.tencent.mm.smiley.m$b r8 = r15.mo135538b(r8)     // Catch:{ all -> 0x016d }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            long r11 = r15 - r11
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            java.nio.ByteBuffer r7 = r8.f284047a     // Catch:{ all -> 0x0168 }
            int r9 = r8.f284048b     // Catch:{ all -> 0x0168 }
            int r8 = r8.f284049c     // Catch:{ all -> 0x0168 }
            java.lang.String r7 = r2.mo85718a(r7, r9, r8)     // Catch:{ all -> 0x0168 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            long r8 = r8 - r15
            if (r7 == 0) goto L_0x00b8
            int r15 = r7.length()     // Catch:{ all -> 0x01a9 }
            if (r15 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r15 = 0
            goto L_0x00b9
        L_0x00b8:
            r15 = 1
        L_0x00b9:
            r15 = r15 ^ r6
            if (r15 == 0) goto L_0x00be
            r15 = r7
            goto L_0x00bf
        L_0x00be:
            r15 = 0
        L_0x00bf:
            if (r15 == 0) goto L_0x00c4
            r10.add(r15)     // Catch:{ all -> 0x01a9 }
        L_0x00c4:
            com.tencent.mm.smiley.m$a r15 = f284038f     // Catch:{ all -> 0x01a9 }
            r16 = r7
            long r6 = r15.f284046g     // Catch:{ all -> 0x01a9 }
            int r15 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x00e7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a9 }
            r6.<init>()     // Catch:{ all -> 0x01a9 }
            java.lang.String r7 = "new longest cost emoji: "
            r6.append(r7)     // Catch:{ all -> 0x01a9 }
            java.lang.String r7 = r22.getMd5()     // Catch:{ all -> 0x01a9 }
            r6.append(r7)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r6)     // Catch:{ all -> 0x01a9 }
        L_0x00e7:
            com.tencent.mm.smiley.m$a r6 = f284038f     // Catch:{ all -> 0x01a9 }
            r15 = r1
            r7 = r2
            long r1 = r6.f284040a     // Catch:{ all -> 0x01a9 }
            long r19 = r13 + r11
            long r19 = r19 + r8
            long r1 = r1 + r19
            r6.f284040a = r1     // Catch:{ all -> 0x01a9 }
            long r1 = r6.f284044e     // Catch:{ all -> 0x01a9 }
            long r1 = java.lang.Math.max(r13, r1)     // Catch:{ all -> 0x01a9 }
            r6.f284044e = r1     // Catch:{ all -> 0x01a9 }
            long r1 = r6.f284045f     // Catch:{ all -> 0x01a9 }
            long r1 = java.lang.Math.max(r11, r1)     // Catch:{ all -> 0x01a9 }
            r6.f284045f = r1     // Catch:{ all -> 0x01a9 }
            long r1 = r6.f284046g     // Catch:{ all -> 0x01a9 }
            long r1 = java.lang.Math.max(r8, r1)     // Catch:{ all -> 0x01a9 }
            r6.f284046g = r1     // Catch:{ all -> 0x01a9 }
            long r1 = r6.f284041b     // Catch:{ all -> 0x01a9 }
            r19 = 1
            long r1 = r1 + r19
            r6.f284041b = r1     // Catch:{ all -> 0x01a9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a9 }
            r1.<init>()     // Catch:{ all -> 0x01a9 }
            r2 = 91
            r1.append(r2)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = r22.getMd5()     // Catch:{ all -> 0x01a9 }
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "][#"
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            r1.append(r5)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "] recognize result: "
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            r6 = r16
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = ", decode: "
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            r1.append(r13)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "ms, convert: "
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            r1.append(r11)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "ms, ocr: "
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            r1.append(r8)     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "ms"
            r1.append(r6)     // Catch:{ all -> 0x01a9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)     // Catch:{ all -> 0x01a9 }
        L_0x015f:
            int r5 = r5 + 1
            r2 = r7
            r1 = r15
            r6 = 1
            r9 = 91
            goto L_0x006e
        L_0x0168:
            r0 = move-exception
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            throw r0     // Catch:{ all -> 0x01a9 }
        L_0x016d:
            r0 = move-exception
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            throw r0     // Catch:{ all -> 0x01a9 }
        L_0x0172:
            r0 = move-exception
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01a9 }
            throw r0     // Catch:{ all -> 0x01a9 }
        L_0x0177:
            r4.destroy()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r11 = ","
            java.lang.String r1 = sx3.C110818d0.m150921S(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.field_meanings = r1
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r1 = r1.mo57717d()
            r1.X90(r0)
            java.lang.String r0 = r0.field_meanings
            if (r0 == 0) goto L_0x01a5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a2
            goto L_0x01a5
        L_0x01a2:
            r0 = 1
            r7 = 0
            goto L_0x01a7
        L_0x01a5:
            r0 = 1
            r7 = 1
        L_0x01a7:
            r7 = r7 ^ r0
        L_0x01a8:
            return r7
        L_0x01a9:
            r0 = move-exception
            r4.destroy()
            throw r0
        L_0x01ae:
            r0 = move-exception
            java.lang.System.currentTimeMillis()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96954m.m124532a(com.tencent.mm.smiley.m, com.tencent.mm.storage.emotion.EmojiInfo):boolean");
    }

    /* renamed from: b */
    public final C96956b mo135538b(Bitmap bitmap) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i = length * 3;
        byte[] bArr = new byte[i];
        Iterator it = C61595o.m72301i(0, length).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            int i2 = a * 3;
            int i3 = a * 4;
            bArr[i2] = array[i3];
            bArr[i2 + 1] = array[i3 + 1];
            bArr[i2 + 2] = array[i3 + 2];
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.put(bArr);
        return new C96956b(allocateDirect, bitmap.getWidth(), bitmap.getHeight());
    }

    /* renamed from: c */
    public final void mo135539c(boolean z) {
        if (f284037e != null) {
            Log.m105928w("MicroMsg.EmojiOcrService", "already started!");
            return;
        }
        Log.m105924i("MicroMsg.EmojiOcrService", "start: " + z);
        C96955a aVar = f284038f;
        aVar.f284044e = 0;
        aVar.f284045f = 0;
        aVar.f284046g = 0;
        aVar.f284040a = 0;
        aVar.f284041b = 0;
        aVar.f284042c = 0;
        aVar.f284043d = 0;
        C53939q1 q1Var = new C53939q1(Executors.newScheduledThreadPool(1, new y2$$a(1, "emoji-ocr", new AtomicInteger())));
        C0000n0 a = C53930o0.m60554a(q1Var);
        f284035c = a;
        f284034b = q1Var;
        C53895h.m60466d(a, (C66212f) null, (C53934p0) null, new C96957c(z, (C15601d<? super C96957c>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public final void mo135540d() {
        Log.m105924i("MicroMsg.EmojiOcrService", "stop");
        C53935p1 p1Var = f284034b;
        if (p1Var != null) {
            p1Var.close();
        }
        f284034b = null;
        C53930o0.m60558e(f284035c, (CancellationException) null, 1, (Object) null);
        C60786a aVar = f284037e;
        if (aVar != null) {
            aVar.mo85720c();
        }
        f284037e = null;
    }
}
