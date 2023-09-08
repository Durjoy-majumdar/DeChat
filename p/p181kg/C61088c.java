package p181kg;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a;
import jq3.C60897k;
import jq3.C9493c;

/* renamed from: kg.c */
public final class C61088c implements C60897k<C61089d> {

    /* renamed from: a */
    public final /* synthetic */ C55068a f173950a;

    public C61088c(C55068a aVar) {
        this.f173950a = aVar;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C61089d) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C61089d) cVar, i);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.app.Activity] */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2041c(android.view.View r20, jq3.C9493c r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r7 = r20
            r8 = r21
            kg.d r8 = (p181kg.C61089d) r8
            java.lang.Class<gj3.h> r1 = gj3.C59474h.class
            java.lang.String r2 = "itemView"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r8, r2)
            int r2 = r8.mo75c()
            r3 = -1
            if (r2 == r3) goto L_0x02a0
            int r2 = r8.mo75c()
            r4 = -2
            if (r2 != r4) goto L_0x0024
            goto L_0x02a0
        L_0x0024:
            boolean r2 = r8.f173954g
            if (r2 == 0) goto L_0x0034
            r1 = 2131296786(0x7f090212, float:1.8211499E38)
            android.view.View r1 = r7.findViewById(r1)
            r1.performClick()
            goto L_0x02a0
        L_0x0034:
            ig.d r2 = r8.f173953f
            com.tencent.mm.storage.f4 r4 = r8.f173951d
            java.lang.String r5 = "MicroMsg.AlbumUtil"
            r6 = 2
            if (r4 != 0) goto L_0x0044
            java.lang.String r2 = "msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x0105
        L_0x0044:
            long r11 = eb0.C31543z5.m39451a()
            long r13 = r4.getCreateTime()
            long r15 = r11 - r13
            ph0.a r3 = ph0.C100792a.f295260a
            java.lang.String r3 = r3.mo140233d(r2, r4)
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            java.lang.String r9 = "MsgCommonMediaExpiredInterval"
            r10 = 432000(0x69780, float:6.05361E-40)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "getImgVideoExpireIntervalTime, albumDataItem is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            k40.a r2 = f40.C86709a0.m107533q(r4)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            int r2 = r2.mo107404b(r9, r10)
            goto L_0x00d6
        L_0x0071:
            int r10 = r2.mo55274P()
            if (r10 == r6) goto L_0x00be
            r7 = 4
            if (r10 == r7) goto L_0x00a5
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r2 = r2.mo55274P()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r7[r10] = r2
            com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r10 = 1
            r7[r10] = r2
            java.lang.String r2 = "getImgVideoExpireIntervalTime, is nothing type = %s, stack = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r7)
            k40.a r2 = f40.C86709a0.m107533q(r4)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            r7 = 432000(0x69780, float:6.05361E-40)
            int r2 = r2.mo107404b(r9, r7)
            goto L_0x00d6
        L_0x00a5:
            r7 = 432000(0x69780, float:6.05361E-40)
            java.lang.String r2 = "getImgVideoExpireIntervalTime, isVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            k40.a r2 = f40.C86709a0.m107533q(r4)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r4 = "MsgCommonVideoExpiredInterval"
            int r2 = r2.mo107404b(r4, r7)
            goto L_0x00d6
        L_0x00be:
            r7 = 432000(0x69780, float:6.05361E-40)
            java.lang.String r2 = "getImgVideoExpireIntervalTime, isImage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            k40.a r2 = f40.C86709a0.m107533q(r4)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r4 = "MsgCommonImgExpiredInterval"
            int r2 = r2.mo107404b(r4, r7)
        L_0x00d6:
            long r9 = (long) r2
            r17 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r17
            int r2 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0105
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x00eb
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r2 != 0) goto L_0x0105
        L_0x00eb:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r7 = 0
            r2[r7] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r7 = 1
            r2[r7] = r4
            r2[r6] = r3
            java.lang.String r3 = "cur time: %s, msg time: %s, path: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            r2 = 1
            goto L_0x0106
        L_0x0105:
            r2 = 0
        L_0x0106:
            r7 = 0
            if (r2 == 0) goto L_0x0175
            java.lang.String r1 = "MicroMsg.AlbumGalleryAdapter"
            java.lang.String r2 = "msg is expired"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.content.Context r1 = r20.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x011b
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x011c
        L_0x011b:
            r1 = r7
        L_0x011c:
            ig.d r2 = r8.f173953f
            if (r2 == 0) goto L_0x0128
            int r2 = r2.mo55274P()
            if (r2 != r6) goto L_0x0128
            r9 = 1
            goto L_0x0129
        L_0x0128:
            r9 = 0
        L_0x0129:
            if (r9 == 0) goto L_0x0141
            android.content.Context r2 = r20.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0136
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0137
        L_0x0136:
            r2 = r7
        L_0x0137:
            if (r2 == 0) goto L_0x0157
            r3 = 2131820900(0x7f110164, float:1.9274528E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0158
        L_0x0141:
            android.content.Context r2 = r20.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x014c
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x014d
        L_0x014c:
            r2 = r7
        L_0x014d:
            if (r2 == 0) goto L_0x0157
            r3 = 2131820908(0x7f11016c, float:1.9274544E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0158
        L_0x0157:
            r2 = r7
        L_0x0158:
            android.content.Context r3 = r20.getContext()
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto L_0x0163
            android.app.Activity r3 = (android.app.Activity) r3
            goto L_0x0164
        L_0x0163:
            r3 = r7
        L_0x0164:
            if (r3 == 0) goto L_0x016d
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r7 = r3.getString(r4)
        L_0x016d:
            kg.b r3 = p181kg.C61087b.f173949d
            r4 = 0
            nj3.C76879j.m92713G(r1, r2, r7, r4, r3)
            goto L_0x02a0
        L_0x0175:
            android.content.Context r2 = r20.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x018a
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r2 = r3.mo62443b(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r1)
            gj3.h r2 = (gj3.C59474h) r2
            goto L_0x018b
        L_0x018a:
            r2 = r7
        L_0x018b:
            if (r2 == 0) goto L_0x0194
            boolean r2 = r2.f169948f
            r10 = 1
            if (r2 != r10) goto L_0x0195
            r2 = 1
            goto L_0x0196
        L_0x0194:
            r10 = 1
        L_0x0195:
            r2 = 0
        L_0x0196:
            if (r2 == 0) goto L_0x019a
            goto L_0x02a0
        L_0x019a:
            com.tencent.mm.storage.f4 r2 = r8.f173951d
            boolean r2 = th0.C101888l.m134034e(r2)
            if (r2 == 0) goto L_0x01ab
            com.tencent.mm.storage.f4 r2 = r8.f173951d
            if (r2 == 0) goto L_0x01ab
            java.lang.String r2 = r2.mo108768t()
            goto L_0x01ac
        L_0x01ab:
            r2 = r7
        L_0x01ac:
            com.tencent.mm.album.ui.c2c.gallery.a r3 = r0.f173950a
            java.util.List r3 = r3.getData()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x01bb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01d8
            java.lang.Object r5 = r3.next()
            r6 = r5
            kg.d r6 = (p181kg.C61089d) r6
            int r6 = r6.mo75c()
            r9 = -1
            if (r6 != r9) goto L_0x01d1
            r6 = 1
            goto L_0x01d2
        L_0x01d1:
            r6 = 0
        L_0x01d2:
            if (r6 == 0) goto L_0x01bb
            r4.add(r5)
            goto L_0x01bb
        L_0x01d8:
            int r3 = r4.size()
            int r16 = r22 - r3
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            com.tencent.mm.storage.f4 r3 = r8.f173951d
            if (r3 == 0) goto L_0x01f0
            long r3 = r3.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x01f1
        L_0x01f0:
            r3 = r7
        L_0x01f1:
            java.lang.String r4 = "img_gallery_msg_id"
            r9.putExtra(r4, r3)
            com.tencent.mm.storage.f4 r3 = r8.f173951d
            if (r3 == 0) goto L_0x0203
            long r3 = r3.mo108774y2()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0204
        L_0x0203:
            r3 = r7
        L_0x0204:
            java.lang.String r4 = "img_gallery_msg_svr_id"
            r9.putExtra(r4, r3)
            com.tencent.mm.storage.f4 r3 = r8.f173951d
            if (r3 == 0) goto L_0x0212
            java.lang.String r3 = r3.mo108768t()
            goto L_0x0213
        L_0x0212:
            r3 = r7
        L_0x0213:
            java.lang.String r4 = "img_gallery_talker"
            r9.putExtra(r4, r3)
            java.lang.String r3 = "img_gallery_chatroom_name"
            r9.putExtra(r3, r2)
            if (r16 >= 0) goto L_0x0222
            r2 = r22
            goto L_0x0224
        L_0x0222:
            r2 = r16
        L_0x0224:
            java.lang.String r3 = "album_enter_position_from_list_page"
            r9.putExtra(r3, r2)
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r20.getContext()
            java.lang.String r4 = "itemView.context"
            gy3.C87412m.m108593f(r3, r4)
            bl3.r$a r2 = r2.mo62443b(r3)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            gj3.h r1 = (gj3.C59474h) r1
            gj3.f r1 = r1.f169947e
            com.tencent.mm.album.ui.c2c.gallery.a r2 = r0.f173950a
            gj3.a r3 = r2.f154627I
            r4 = 0
            r5 = 4
            r6 = 0
            r2 = r20
            android.os.Bundle r1 = gj3.C59473f.m69397a(r1, r2, r3, r4, r5, r6)
            android.content.Context r2 = r20.getContext()
            java.lang.String r3 = "album"
            java.lang.String r4 = "com.tencent.mm.plugin.album.ui.AlbumGalleryUI"
            ke3.C88144b.m109791i(r2, r3, r4, r9, r1)
            android.content.Context r1 = r20.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0263
            r7 = r1
            android.app.Activity r7 = (android.app.Activity) r7
        L_0x0263:
            if (r7 == 0) goto L_0x0269
            r1 = 0
            r7.overridePendingTransition(r1, r1)
        L_0x0269:
            com.tencent.mm.album.ui.c2c.gallery.a r1 = r0.f173950a
            com.tencent.mm.storage.f4 r12 = r1.f154625G
            th0.l r2 = th0.C101888l.f300029a
            ig.g r1 = r1.f154626H
            java.util.List r1 = r2.mo141354c(r1)
            int r13 = r1.size()
            com.tencent.mm.album.ui.c2c.gallery.a r1 = r0.f173950a
            ig.g r1 = r1.f154626H
            java.util.List r1 = r2.mo141355d(r1)
            int r14 = r1.size()
            r10 = 11
            ig.d r15 = r8.f173953f
            java.lang.Class<mm.h> r1 = p606mm.C99933h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            mm.h r1 = (p606mm.C99933h) r1
            java.lang.Class<qh0.a> r2 = qh0.C62619a.class
            jg.a r3 = new jg.a
            r9 = r3
            r9.<init>(r10, r12, r13, r14, r15, r16)
            r4 = 18
            java.lang.String r5 = "album_enter_from_scene"
            r1.mo84406lr(r4, r5, r2, r3)
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p181kg.C61088c.mo2041c(android.view.View, jq3.c, int):void");
    }
}
