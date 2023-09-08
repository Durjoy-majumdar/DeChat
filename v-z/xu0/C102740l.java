package xu0;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineComponent;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xu0.l */
public final class C102740l extends PipelineComponent {

    /* renamed from: xu0.l$a */
    public static final class C102741a extends C87413o implements C32226l<PipelineState, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C102740l f303365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102741a(C102740l lVar) {
            super(1);
            this.f303365d = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x01eb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r15) {
            /*
                r14 = this;
                com.tencent.mm.sdk.pipeline.PipelineState r15 = (com.tencent.p014mm.sdk.pipeline.PipelineState) r15
                java.lang.String r0 = "state"
                gy3.C87412m.m108594g(r15, r0)
                xu0.l r0 = r14.f303365d
                com.tencent.mm.sdk.statecenter.IStateAction r15 = r15.getAction()
                if (r15 == 0) goto L_0x021e
                boolean r1 = r15 instanceof wb0.C102383c
                if (r1 == 0) goto L_0x021e
                wb0.c r15 = (wb0.C102383c) r15
                byte[] r1 = r15.f301544c
                if (r1 == 0) goto L_0x021e
                com.tencent.mm.sdk.pipeline.PipelineState r1 = r0.state()
                java.lang.String r2 = "Avatar_Username"
                java.lang.String r1 = r1.getStringOrInterrupt(r2)
                com.tencent.mm.sdk.pipeline.PipelineState r2 = r0.state()
                java.lang.String r3 = "Common_TempFolder"
                java.lang.Object r2 = r2.getOrInterrupt(r3)
                com.tencent.mm.vfs.m1 r2 = (com.tencent.p014mm.vfs.C86009m1) r2
                com.tencent.mm.sdk.pipeline.PipelineState r0 = r0.state()
                java.lang.String r3 = "Avatar_ImgFlag"
                java.lang.Object r0 = r0.get(r3)
                com.tencent.mm.modelavatar.n r0 = (com.tencent.p014mm.modelavatar.C68097n) r0
                if (r0 == 0) goto L_0x021e
                com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
                r4 = 0
                java.lang.String r0 = com.tencent.p014mm.modelavatar.C68081f.m80469d(r0, r4)
                r3.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r0)
                java.lang.String r0 = r3.mo119971i()
                java.lang.String r2 = "VFSFile(tempFolder, Avat…imgFlag, 0)).absolutePath"
                gy3.C87412m.m108593f(r0, r2)
                java.lang.String r15 = r15.f301543b
                java.lang.Class<ln.h> r2 = p196ln.C76707h.class
                java.lang.String r3 = "username"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "hdHeadPath"
                gy3.C87412m.m108594g(r15, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "updateSmallAvatar "
                r3.append(r5)
                r3.append(r1)
                r5 = 32
                r3.append(r5)
                r3.append(r15)
                r3.append(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r6 = "MicroMsg.Avatar.HdAvatarUpdateSmallFilePPC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                android.graphics.BitmapFactory$Options r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r15)
                int r7 = r3.outWidth
                int r3 = r3.outHeight
                if (r7 == 0) goto L_0x0201
                if (r3 != 0) goto L_0x0093
                goto L_0x0201
            L_0x0093:
                r8 = 156(0x9c, float:2.19E-43)
                if (r3 >= r7) goto L_0x009e
                int r9 = r7 * 156
                int r9 = r9 / r3
                r8 = r9
                r9 = 156(0x9c, float:2.19E-43)
                goto L_0x00a1
            L_0x009e:
                int r9 = r3 * 156
                int r9 = r9 / r7
            L_0x00a1:
                r10 = 5
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r10[r4] = r7
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r7 = 1
                r10[r7] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
                r11 = 2
                r10[r11] = r3
                r3 = 3
                java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
                r10[r3] = r12
                r3 = 4
                java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
                r10[r3] = r12
                java.lang.String r3 = "inJustDecodeBounds old [w:%d h:%d]  new [w:%d h:%d] corner:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r10)
                android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
                r3.<init>()
                android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
                r3.inPreferredConfig = r10
                r3.inSampleSize = r7
                android.graphics.Bitmap r15 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r15, r3)
                r3 = 0
                if (r15 != 0) goto L_0x00de
                goto L_0x0118
            L_0x00de:
                int r10 = r15.getWidth()
                if (r10 != r8) goto L_0x00eb
                int r10 = r15.getHeight()
                if (r10 != r9) goto L_0x00eb
                goto L_0x0119
            L_0x00eb:
                int r10 = r15.getWidth()     // Catch:{ OutOfMemoryError -> 0x010e }
                int r12 = r15.getHeight()     // Catch:{ OutOfMemoryError -> 0x010e }
                if (r10 == r12) goto L_0x0109
                if (r10 <= r12) goto L_0x00fe
                int r10 = r10 - r12
                int r10 = r10 / r11
                android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r15, r10, r4, r12, r12)     // Catch:{ OutOfMemoryError -> 0x010e }
                goto L_0x0104
            L_0x00fe:
                int r12 = r12 - r10
                int r12 = r12 / r11
                android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r15, r4, r12, r10, r10)     // Catch:{ OutOfMemoryError -> 0x010e }
            L_0x0104:
                android.graphics.Bitmap r15 = android.graphics.Bitmap.createScaledBitmap(r15, r8, r9, r7)     // Catch:{ OutOfMemoryError -> 0x010e }
                goto L_0x0119
            L_0x0109:
                android.graphics.Bitmap r15 = android.graphics.Bitmap.createScaledBitmap(r15, r8, r9, r7)     // Catch:{ OutOfMemoryError -> 0x010e }
                goto L_0x0119
            L_0x010e:
                java.lang.Object[] r15 = new java.lang.Object[r7]
                r15[r4] = r1
                java.lang.String r8 = "kevin updateAvatar fail %s "
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r15)
            L_0x0118:
                r15 = r3
            L_0x0119:
                if (r15 == 0) goto L_0x01e9
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r3 == 0) goto L_0x0124
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            L_0x0124:
                com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
                r3.<init>((java.lang.String) r0)
                com.tencent.mm.vfs.m1 r3 = r3.mo119974l()
                if (r3 == 0) goto L_0x018c
                com.tencent.mm.vfs.m1[] r3 = r3.mo119984u()
                if (r3 == 0) goto L_0x018c
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                int r9 = r3.length
                r10 = 0
            L_0x013c:
                if (r10 >= r9) goto L_0x0159
                r11 = r3[r10]
                java.lang.String r12 = r11.getName()
                java.lang.String r13 = "it.name"
                gy3.C87412m.m108593f(r12, r13)
                java.lang.String r13 = "small_"
                boolean r12 = z04.C112551y.m153819s(r12, r13, r4)
                if (r12 == 0) goto L_0x0156
                r8.add(r11)
            L_0x0156:
                int r10 = r10 + 1
                goto L_0x013c
            L_0x0159:
                java.util.Iterator r3 = r8.iterator()
            L_0x015d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x018c
                java.lang.Object r4 = r3.next()
                com.tencent.mm.vfs.m1 r4 = (com.tencent.p014mm.vfs.C86009m1) r4
                boolean r8 = r4.mo119966f()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "delete other small avatar file "
                r9.append(r10)
                java.lang.String r4 = r4.mo119971i()
                r9.append(r4)
                r9.append(r5)
                r9.append(r8)
                java.lang.String r4 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
                goto L_0x015d
            L_0x018c:
                xu0.m r3 = new xu0.m
                r3.<init>(r15, r1)
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageWriteOutputStream((java.lang.String) r0, (com.tencent.p014mm.sdk.platformtools.BitmapUtil.ImageWriteOSCallback) r3)
                int r3 = r15.getWidth()
                float r3 = (float) r3
                r4 = 1036831949(0x3dcccccd, float:0.1)
                float r3 = r3 * r4
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r15, r7, r3)
                di3.d r7 = di3.C86312j.m106911c(r2)
                java.lang.String r8 = "getService(IAvatarImageL…atureService::class.java)"
                gy3.C87412m.m108593f(r7, r8)
                ln.h r7 = (p196ln.C76707h) r7
                java.lang.String r4 = r7.A00(r1, r4)
                di3.d r2 = di3.C86312j.m106911c(r2)
                ln.h r2 = (p196ln.C76707h) r2
                java.lang.String r7 = "roundCornerBitmap"
                gy3.C87412m.m108593f(r3, r7)
                r2.mo106984CO(r4, r3)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "update to cache "
                r2.append(r3)
                r2.append(r4)
                r2.append(r5)
                java.lang.String r15 = n20.C100039p.m130707a(r15)
                r2.append(r15)
                java.lang.String r15 = " path:"
                r2.append(r15)
                r2.append(r0)
                java.lang.String r15 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x01e9:
                if (r3 != 0) goto L_0x021e
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "small bitmap is null "
                r15.append(r0)
                r15.append(r1)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
                goto L_0x021e
            L_0x0201:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "return inWidth:"
                r15.append(r0)
                r15.append(r7)
                java.lang.String r0 = " inHeight:"
                r15.append(r0)
                r15.append(r3)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            L_0x021e:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: xu0.C102740l.C102741a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102740l(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public void onCreate() {
        process(new C102741a(this));
    }
}
