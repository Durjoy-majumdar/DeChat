package com.tencent.p014mm.plugin.wallet_core.utils;

import android.view.View;
import b63.C67183e;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.c */
public class C72495c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f210890d;

    /* renamed from: e */
    public final /* synthetic */ C67183e f210891e;

    /* renamed from: f */
    public final /* synthetic */ BankcardLogoHelper.C72484c f210892f;

    public C72495c(BankcardLogoHelper bankcardLogoHelper, View view, C67183e eVar, BankcardLogoHelper.C72484c cVar) {
        this.f210890d = view;
        this.f210891e = eVar;
        this.f210892f = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.graphics.drawable.NinePatchDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            java.lang.Class<xs.b> r0 = p755xs.C102720b.class
            android.view.View r1 = r14.f210890d
            r1.invalidate()
            b63.e r1 = r14.f210891e
            java.lang.String r1 = r1.f192876b
            java.lang.String r2 = g63.C75883h.f222537a
            boolean r2 = r2.equals(r1)
            r3 = -1
            if (r2 != 0) goto L_0x0089
            java.lang.String r2 = g63.C75883h.f222538b
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x001e
            goto L_0x0089
        L_0x001e:
            java.lang.String r2 = g63.C75883h.f222545i
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = g63.C75883h.f222546j
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x002f
            goto L_0x0085
        L_0x002f:
            java.lang.String r2 = g63.C75883h.f222543g
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = g63.C75883h.f222544h
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0040
            goto L_0x0081
        L_0x0040:
            java.lang.String r2 = g63.C75883h.f222547k
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = g63.C75883h.f222548l
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0051
            goto L_0x007d
        L_0x0051:
            java.lang.String r2 = g63.C75883h.f222539c
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0079
            java.lang.String r2 = g63.C75883h.f222540d
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0062
            goto L_0x0079
        L_0x0062:
            java.lang.String r2 = g63.C75883h.f222541e
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0075
            java.lang.String r2 = g63.C75883h.f222542f
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r1 = -1
            goto L_0x008c
        L_0x0075:
            r1 = 2131235580(0x7f0812fc, float:1.8087358E38)
            goto L_0x008c
        L_0x0079:
            r1 = 2131235575(0x7f0812f7, float:1.8087348E38)
            goto L_0x008c
        L_0x007d:
            r1 = 2131235574(0x7f0812f6, float:1.8087346E38)
            goto L_0x008c
        L_0x0081:
            r1 = 2131235570(0x7f0812f2, float:1.8087338E38)
            goto L_0x008c
        L_0x0085:
            r1 = 2131235568(0x7f0812f0, float:1.8087334E38)
            goto L_0x008c
        L_0x0089:
            r1 = 2131235564(0x7f0812ec, float:1.8087326E38)
        L_0x008c:
            r2 = 1
            java.lang.String r4 = "MicroMsg.BankcardLogoHelper"
            r5 = 0
            if (r1 == r3) goto L_0x00cf
            android.view.View r0 = r14.f210890d
            r0.setBackgroundResource(r1)
            android.view.View r0 = r14.f210890d
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            int r1 = r0.getWidth()
            int r1 = r1 / 2
            int r3 = r0.getHeight()
            int r3 = r3 / 2
            int r0 = r0.getPixel(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r5] = r2
            java.lang.String r2 = "local bg color: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r1)
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$c r1 = r14.f210892f
            java.lang.ref.WeakReference<android.widget.TextView> r1 = r1.f210851h
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0192
            r1.setTextColor(r0)
            goto L_0x0192
        L_0x00cf:
            b63.e r1 = r14.f210891e
            java.lang.String r1 = r1.f192876b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0187
            g63.j r1 = new g63.j
            b63.e r3 = r14.f210891e
            java.lang.String r3 = r3.f192876b
            r1.<init>(r3)
            di3.d r3 = di3.C86312j.m106911c(r0)
            xs.b r3 = (p755xs.C102720b) r3
            android.graphics.Bitmap r3 = r3.mo142104N6(r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            xs.b r0 = (p755xs.C102720b) r0
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$c r6 = r14.f210892f
            r0.Lu0(r6)
            if (r3 == 0) goto L_0x010e
            byte[] r0 = r3.getNinePatchChunk()     // Catch:{ Exception -> 0x010d }
            if (r0 == 0) goto L_0x0105
            boolean r0 = android.graphics.NinePatch.isNinePatchChunk(r0)     // Catch:{ Exception -> 0x010d }
            if (r0 != 0) goto L_0x010e
        L_0x0105:
            java.lang.String r0 = r1.mo94827k()     // Catch:{ Exception -> 0x010d }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x010d }
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            if (r3 == 0) goto L_0x0192
            android.view.View r0 = r14.f210890d
            android.content.Context r1 = r0.getContext()
            r12 = 0
            byte[] r9 = r3.getNinePatchChunk()     // Catch:{ Exception -> 0x0146 }
            boolean r6 = android.graphics.NinePatch.isNinePatchChunk(r9)     // Catch:{ Exception -> 0x0146 }
            if (r6 == 0) goto L_0x013f
            android.graphics.drawable.NinePatchDrawable r13 = new android.graphics.drawable.NinePatchDrawable     // Catch:{ Exception -> 0x0146 }
            android.content.res.Resources r7 = r1.getResources()     // Catch:{ Exception -> 0x0146 }
            android.graphics.Rect r10 = new android.graphics.Rect     // Catch:{ Exception -> 0x0146 }
            r10.<init>()     // Catch:{ Exception -> 0x0146 }
            r11 = 0
            r6 = r13
            r8 = r3
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0146 }
            int r1 = r3.getWidth()     // Catch:{ Exception -> 0x0146 }
            int r6 = r3.getHeight()     // Catch:{ Exception -> 0x0146 }
            r13.setBounds(r5, r5, r1, r6)     // Catch:{ Exception -> 0x0146 }
            r12 = r13
            goto L_0x0157
        L_0x013f:
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable     // Catch:{ Exception -> 0x0146 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0146 }
            r12 = r1
            goto L_0x0157
        L_0x0146:
            r1 = move-exception
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "MicroMsg.BankcardListAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r1, r8, r6)
        L_0x0157:
            r0.setBackgroundDrawable(r12)
            int r0 = r3.getWidth()
            int r0 = r0 / 2
            int r1 = r3.getHeight()
            int r1 = r1 / 2
            int r0 = r3.getPixel(r0, r1)
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$c r1 = r14.f210892f
            java.lang.ref.WeakReference<android.widget.TextView> r1 = r1.f210851h
            java.lang.Object r1 = r1.get()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0192
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2[r5] = r3
            java.lang.String r3 = "server bg color: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r3, r2)
            r1.setTextColor(r0)
            goto L_0x0192
        L_0x0187:
            b63.e r0 = r14.f210891e
            int r0 = r0.f192879e
            if (r0 <= 0) goto L_0x0192
            android.view.View r1 = r14.f210890d
            r1.setBackgroundResource(r0)
        L_0x0192:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.utils.C72495c.run():void");
    }
}
