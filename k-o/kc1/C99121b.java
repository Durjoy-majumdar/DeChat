package kc1;

import com.tencent.p014mm.autogen.events.FavImageServiceEvent;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import pb1.C100755z;

/* renamed from: kc1.b */
public class C99121b extends IStaticListener<FavImageServiceEvent> {

    /* renamed from: d */
    public LruCache<Long, C100755z> f290632d = new LruCache<>(10);

    /* renamed from: e */
    public FavoriteImageServer f290633e;

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.tencent.mm.autogen.events.FavImageServiceEvent r1 = (com.tencent.p014mm.autogen.events.FavImageServiceEvent) r1
            java.lang.Class<pb1.j1> r2 = pb1.C100718j1.class
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r3 = r1.f264809d
            long r4 = r3.f264813c
            java.lang.String r6 = "MicroMsg.FavImageServiceListener"
            r7 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0086
            boolean r3 = r3.f264822l
            if (r3 == 0) goto L_0x003f
            di3.d r2 = di3.C86312j.m106911c(r2)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r3 = r1.f264809d
            long r3 = r3.f264813c
            xb1.d r2 = (xb1.C102614d) r2
            pb1.z r2 = r2.mo142266Yt(r3)
            if (r2 == 0) goto L_0x0082
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, pb1.z> r3 = r0.f290632d
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r4 = r1.f264809d
            long r4 = r4.f264813c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r4, r2)
            goto L_0x0082
        L_0x003f:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, pb1.z> r3 = r0.f290632d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            pb1.z r3 = (pb1.C100755z) r3
            java.lang.Object[] r4 = new java.lang.Object[r9]
            if (r3 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r11] = r5
            java.lang.String r5 = "get item from cache itemInfo is null? %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r4)
            if (r3 != 0) goto L_0x0084
            di3.d r2 = di3.C86312j.m106911c(r2)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r3 = r1.f264809d
            long r3 = r3.f264813c
            xb1.d r2 = (xb1.C102614d) r2
            pb1.z r2 = r2.mo142266Yt(r3)
            if (r2 == 0) goto L_0x0082
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, pb1.z> r3 = r0.f290632d
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r4 = r1.f264809d
            long r4 = r4.f264813c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r4, r2)
        L_0x0082:
            r15 = r2
            goto L_0x0087
        L_0x0084:
            r15 = r3
            goto L_0x0087
        L_0x0086:
            r15 = r10
        L_0x0087:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r4 = r1.f264809d
            int r4 = r4.f264811a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r11] = r4
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r4 = r1.f264809d
            long r4 = r4.f264813c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r9] = r4
            java.lang.String r4 = "image serivce callback type %d, localId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r4, r3)
            r3 = 4
            r4 = 3
            if (r15 != 0) goto L_0x00b1
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r5 = r1.f264809d
            int r5 = r5.f264811a
            if (r5 == r4) goto L_0x00b1
            if (r5 == r3) goto L_0x00b1
            goto L_0x0265
        L_0x00b1:
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r5 = r1.f264809d
            int r7 = r5.f264811a
            if (r7 == 0) goto L_0x025b
            if (r7 == r9) goto L_0x023d
            if (r7 == r2) goto L_0x00ec
            if (r7 == r4) goto L_0x00d1
            if (r7 == r3) goto L_0x00c1
            goto L_0x0265
        L_0x00c1:
            java.lang.String r1 = "destroy image server"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r1 = r0.f290633e
            if (r1 == 0) goto L_0x0265
            r1.mo128332f()
            r0.f290633e = r10
            goto L_0x0265
        L_0x00d1:
            java.lang.String r2 = "create image server"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r2 = r0.f290633e
            if (r2 == 0) goto L_0x00dd
            r2.mo128332f()
        L_0x00dd:
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r2 = new com.tencent.mm.plugin.fav.ui.FavoriteImageServer
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r1 = r1.f264809d
            android.content.Context r1 = r1.f264819i
            r3 = 16
            r2.<init>(r1, r3)
            r0.f290633e = r2
            goto L_0x0265
        L_0x00ec:
            java.lang.Object[] r7 = new java.lang.Object[r9]
            boolean r5 = r5.f264820j
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7[r11] = r5
            java.lang.String r5 = "get img from Cache %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r7)
            com.tencent.mm.autogen.events.FavImageServiceEvent$a r5 = r1.f264809d
            boolean r6 = r5.f264820j
            r7 = 2131234286(0x7f080dee, float:1.8084733E38)
            if (r6 == 0) goto L_0x012a
            com.tencent.mm.autogen.events.FavImageServiceEvent$b r1 = r1.f264810e
            te3.rc0 r2 = r5.f264812b
            java.util.Map<java.lang.String, nj.g$a> r3 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.f269874e
            boolean r3 = p206nj.C88955f.m111058b()
            if (r3 != 0) goto L_0x011d
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeResource(r2, r7)
            goto L_0x0126
        L_0x011d:
            java.lang.String r3 = r2.f299280T
            if (r3 != 0) goto L_0x0122
            goto L_0x0126
        L_0x0122:
            android.graphics.Bitmap r10 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.m118079h(r2, r11, r9)
        L_0x0126:
            r1.f264823a = r10
            goto L_0x0265
        L_0x012a:
            com.tencent.mm.autogen.events.FavImageServiceEvent$b r1 = r1.f264810e
            te3.rc0 r6 = r5.f264812b
            int r5 = r5.f264814d
            java.util.Map<java.lang.String, nj.g$a> r8 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.f269874e
            boolean r8 = p206nj.C88955f.m111058b()
            if (r8 != 0) goto L_0x0146
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeResource(r2, r7)
            goto L_0x023a
        L_0x0146:
            java.lang.String r7 = r6.f299280T
            if (r7 != 0) goto L_0x014c
            goto L_0x023a
        L_0x014c:
            java.lang.String r7 = pb1.C100734q.m131880w(r6)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            java.lang.String r12 = "MicroMsg.FavoriteImageServer"
            if (r8 != 0) goto L_0x0165
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = r6.f299280T
            r2[r11] = r3
            java.lang.String r3 = "getBitmap file not exist %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r3, r2)
            goto L_0x0217
        L_0x0165:
            sg.g<java.lang.String, android.graphics.Bitmap> r8 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.f269875f
            o90.b r8 = (o90.C100301b) r8
            java.lang.Object r8 = r8.get(r7)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x017d
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r11] = r7
            java.lang.String r3 = "get bm from cache %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r3, r2)
            r10 = r8
            goto L_0x0226
        L_0x017d:
            java.lang.String r8 = "get from cache fail, try to decode from file"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r8)
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r8.inJustDecodeBounds = r9
            android.graphics.Bitmap r13 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r7, r8)
            if (r13 == 0) goto L_0x019b
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r14[r11] = r13
            java.lang.String r10 = "bitmap recycle %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r10, r14)
            r13.recycle()
        L_0x019b:
            int r10 = r8.outWidth
            int r13 = r8.outHeight
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            r14[r11] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r14[r9] = r16
            java.lang.String r4 = "width: %s, height: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r4, r14)
            if (r10 <= r5) goto L_0x01be
            int r4 = r8.outHeight
            int r4 = r4 * r5
            int r10 = r8.outWidth
            int r13 = r4 / r10
            goto L_0x01bf
        L_0x01be:
            r5 = r10
        L_0x01bf:
            int r4 = java.lang.Math.max(r9, r5)
            int r5 = java.lang.Math.max(r9, r13)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r10 = r8.outWidth
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r3[r11] = r10
            int r8 = r8.outHeight
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r3[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r8 = 3
            r3[r8] = r2
            java.lang.String r2 = "fit long picture, beg %d*%d, after %d*%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r2, r3)
            int r2 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r7)
            r3 = 90
            if (r2 == r3) goto L_0x01fd
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x01f8
            goto L_0x01fd
        L_0x01f8:
            r19 = r5
            r5 = r4
            r4 = r19
        L_0x01fd:
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r7, r4, r5, r11)
            if (r3 != 0) goto L_0x0219
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getSuitableBmp fail, temBmp is null, filePath = "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
        L_0x0217:
            r10 = 0
            goto L_0x0226
        L_0x0219:
            float r2 = (float) r2
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r3, r2)
            sg.g<java.lang.String, android.graphics.Bitmap> r3 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.f269875f
            o90.b r3 = (o90.C100301b) r3
            r3.put(r7, r2)
            r10 = r2
        L_0x0226:
            if (r10 != 0) goto L_0x023a
            java.lang.String r2 = pb1.C100734q.m131880w(r6)
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$f r4 = new com.tencent.mm.plugin.fav.ui.FavoriteImageServer$$f
            r4.<init>(r11, r2, r15, r6)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r2 = "FavImageServer"
            r3.mo183876g(r4, r2)
        L_0x023a:
            r1.f264823a = r10
            goto L_0x0265
        L_0x023d:
            com.tencent.mm.plugin.fav.ui.FavoriteImageServer r12 = r0.f290633e
            if (r12 != 0) goto L_0x0247
            java.lang.String r1 = "imageServer is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            goto L_0x0265
        L_0x0247:
            android.widget.ImageView r13 = r5.f264815e
            te3.rc0 r14 = r5.f264812b
            int r1 = r5.f264816f
            int r2 = r5.f264817g
            int r3 = r5.f264818h
            r16 = r1
            r17 = r2
            r18 = r3
            r12.mo128328a(r13, r14, r15, r16, r17, r18)
            goto L_0x0265
        L_0x025b:
            com.tencent.mm.autogen.events.FavImageServiceEvent$b r1 = r1.f264810e
            te3.rc0 r2 = r5.f264812b
            android.graphics.Bitmap r2 = com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.m118080i(r2, r15)
            r1.f264823a = r2
        L_0x0265:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kc1.C99121b.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
