package com.tencent.p014mm.plugin.comm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.comm.f */
public final class C55591f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f158262d;

    /* renamed from: e */
    public final /* synthetic */ int f158263e;

    /* renamed from: f */
    public final /* synthetic */ int f158264f;

    /* renamed from: g */
    public final /* synthetic */ String f158265g;

    /* renamed from: h */
    public final /* synthetic */ Context f158266h;

    /* renamed from: i */
    public final /* synthetic */ View f158267i;

    /* renamed from: com.tencent.mm.plugin.comm.f$a */
    public static final class C55592a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f158268d;

        /* renamed from: e */
        public final /* synthetic */ BitmapDrawable f158269e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55592a(View view, BitmapDrawable bitmapDrawable) {
            super(0);
            this.f158268d = view;
            this.f158269e = bitmapDrawable;
        }

        public Object invoke() {
            this.f158268d.setBackground(this.f158269e);
            return C13598b0.f38549a;
        }
    }

    public C55591f(Bitmap bitmap, int i, int i2, String str, Context context, View view) {
        this.f158262d = bitmap;
        this.f158263e = i;
        this.f158264f = i2;
        this.f158265g = str;
        this.f158266h = context;
        this.f158267i = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ba, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.Mv.MusicMvUIUtil", "updateBlurBmBackground, fail, reason:" + r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "MicroMsg.Mv.MusicMvUIUtil"
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00b9 }
            r3 = 1106247680(0x41f00000, float:30.0)
            android.graphics.Bitmap r4 = r13.f158262d     // Catch:{ all -> 0x005c }
            gy3.C87412m.m108591d(r4)     // Catch:{ all -> 0x005c }
            int r4 = r4.getHeight()     // Catch:{ all -> 0x005c }
            android.graphics.Bitmap r5 = r13.f158262d     // Catch:{ all -> 0x005c }
            gy3.C87412m.m108591d(r5)     // Catch:{ all -> 0x005c }
            int r9 = r5.getWidth()     // Catch:{ all -> 0x005c }
            float r4 = (float) r4     // Catch:{ all -> 0x005c }
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            int r6 = r13.f158263e     // Catch:{ all -> 0x005c }
            float r6 = (float) r6     // Catch:{ all -> 0x005c }
            float r6 = r6 * r5
            int r7 = r13.f158264f     // Catch:{ all -> 0x005c }
            float r7 = (float) r7     // Catch:{ all -> 0x005c }
            float r6 = r6 / r7
            float r4 = r4 * r6
            int r10 = (int) r4     // Catch:{ all -> 0x005c }
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch:{ all -> 0x005c }
            r11.<init>()     // Catch:{ all -> 0x005c }
            int r4 = r13.f158263e     // Catch:{ all -> 0x005c }
            float r4 = (float) r4     // Catch:{ all -> 0x005c }
            float r4 = r4 * r5
            float r5 = (float) r10     // Catch:{ all -> 0x005c }
            float r4 = r4 / r5
            r5 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r5
            float r4 = r4 * r5
            r11.postScale(r4, r4)     // Catch:{ all -> 0x005c }
            android.graphics.Bitmap r6 = r13.f158262d     // Catch:{ all -> 0x005c }
            r7 = 0
            int r4 = r6.getHeight()     // Catch:{ all -> 0x005c }
            int r4 = r4 - r10
            int r8 = r4 / 2
            r12 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005c }
            tj3.i r5 = new tj3.i     // Catch:{ all -> 0x005c }
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x005c }
            r5.<init>(r6)     // Catch:{ all -> 0x005c }
            r5.mo162692b(r4, r3)     // Catch:{ all -> 0x005c }
            goto L_0x007d
        L_0x005c:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r5.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r6 = "setBlurBitmap error:"
            r5.append(r6)     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00b7 }
            r5.append(r4)     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ all -> 0x00b7 }
            android.graphics.Bitmap r4 = r13.f158262d     // Catch:{ all -> 0x00b7 }
            int r3 = (int) r3     // Catch:{ all -> 0x00b7 }
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r4, r3)     // Catch:{ all -> 0x00b7 }
        L_0x007d:
            if (r4 == 0) goto L_0x009d
            gc0.a r3 = gc0.C20828a.m22825b()     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r5 = r13.f158265g     // Catch:{ Exception -> 0x00b9 }
            r3.mo32526o(r5, r4)     // Catch:{ Exception -> 0x00b9 }
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch:{ Exception -> 0x00b9 }
            android.content.Context r5 = r13.f158266h     // Catch:{ Exception -> 0x00b9 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x00b9 }
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x00b9 }
            com.tencent.mm.plugin.comm.f$a r4 = new com.tencent.mm.plugin.comm.f$a     // Catch:{ Exception -> 0x00b9 }
            android.view.View r5 = r13.f158267i     // Catch:{ Exception -> 0x00b9 }
            r4.<init>(r5, r3)     // Catch:{ Exception -> 0x00b9 }
            o40.C61926c.m72668M(r4)     // Catch:{ Exception -> 0x00b9 }
        L_0x009d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9 }
            r3.<init>()     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r4 = "updateBlurBmBackground, after blur, cost:"
            r3.append(r4)     // Catch:{ Exception -> 0x00b9 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)     // Catch:{ Exception -> 0x00b9 }
            r3.append(r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00b9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00d3
        L_0x00b7:
            r1 = move-exception
            throw r1     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateBlurBmBackground, fail, reason:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.comm.C55591f.run():void");
    }
}
