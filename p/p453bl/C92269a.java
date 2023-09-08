package p453bl;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bl.a */
public final class C92269a extends C92273c {

    /* renamed from: p */
    public final String f264093p;

    /* renamed from: bl.a$a */
    public static final class C92270a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92269a f264094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92270a(C92269a aVar) {
            super(1);
            this.f264094d = aVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105918d("MicroMsg.EmojiCoverTask", "run: " + this.f264094d.f264093p + ", " + booleanValue);
            this.f264094d.mo126263f(booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92269a(EmojiInfo emojiInfo) {
        super(emojiInfo);
        C87412m.m108594g(emojiInfo, "emojiInfo");
        this.f264093p = emojiInfo.getMd5() + "_cover";
    }

    /* renamed from: e */
    public String mo126262e() {
        return this.f264093p;
    }

    /* renamed from: f */
    public void mo126263f(boolean z) {
        super.mo126263f(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (r5.getHeight() > 120) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (r5 == null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            r0 = 1
            r13.f264099h = r0
            zk.c r1 = new zk.c
            r1.<init>()
            com.tencent.mm.api.IEmojiInfo r2 = r13.f264097f
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.storage.emotion.EmojiInfo r2 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r2
            bl.a$a r3 = new bl.a$a
            r3.<init>(r13)
            xk.b r4 = p1089xk.C102688b.f303300a
            java.lang.String r5 = r2.getMd5()
            android.graphics.Bitmap r5 = r4.mo142498a(r5)
            r6 = 0
            if (r5 == 0) goto L_0x0026
            goto L_0x00b3
        L_0x0026:
            java.lang.String r7 = r2.field_groupId
            java.lang.String r8 = "17"
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 != 0) goto L_0x006e
            java.lang.String r7 = r2.getMd5()
            boolean r7 = u61.C101964h.m134229k(r7)
            if (r7 == 0) goto L_0x003b
            goto L_0x006e
        L_0x003b:
            java.lang.String r7 = r2.getCoverPath()
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r7 == 0) goto L_0x00a8
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r7 = 120(0x78, float:1.68E-43)
            r5.outWidth = r7
            r5.outHeight = r7
            java.lang.String r8 = r2.getCoverPath()
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r8, r5)
            if (r5 != 0) goto L_0x005b
            goto L_0x00b2
        L_0x005b:
            int r8 = r5.getWidth()
            if (r8 > r7) goto L_0x0067
            int r8 = r5.getHeight()
            if (r8 <= r7) goto L_0x00a8
        L_0x0067:
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r5, r7, r7, r6, r0)
            if (r5 != 0) goto L_0x00a8
            goto L_0x00b2
        L_0x006e:
            java.lang.String r7 = r2.getName()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x00a8
            java.lang.String r5 = "name"
            gy3.C87412m.m108593f(r7, r5)
            java.lang.String r5 = "."
            java.lang.String[] r8 = new java.lang.String[]{r5}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r5 = z04.C112550d0.m153785U(r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r9 = "drawable"
            int r5 = r7.getIdentifier(r5, r9, r8)
            android.graphics.Bitmap r5 = com.tencent.p014mm.graphics.MMBitmapFactory.m98736e(r7, r5)
        L_0x00a8:
            if (r5 == 0) goto L_0x00b2
            java.lang.String r6 = r2.getMd5()
            r4.mo142499b(r6, r5)
            goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            if (r0 == 0) goto L_0x00d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fetch: from cache "
            r0.append(r1)
            java.lang.String r1 = r2.getMd5()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.EmojiCoverFetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.invoke(r0)
            goto L_0x00f1
        L_0x00d5:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x00ee
            com.tencent.mm.api.IEmojiInfo$a r0 = r2.mo62647T1()
            com.tencent.mm.api.IEmojiInfo$a r4 = com.tencent.p014mm.api.IEmojiInfo.C40005a.STATUS_SUCCESS
            if (r0 != r4) goto L_0x00ee
            zk.g r0 = new zk.g
            zk.d r4 = new zk.d
            r4.<init>(r3, r1, r2)
            r0.<init>(r2, r4)
            goto L_0x00f1
        L_0x00ee:
            r1.mo142749a(r2, r3)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p453bl.C92269a.run():void");
    }
}
