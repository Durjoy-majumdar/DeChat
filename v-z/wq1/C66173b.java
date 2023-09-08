package wq1;

import android.net.Uri;
import android.os.Build;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import er1.C58741j5;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p707tz.C65000f;
import sx3.C110818d0;
import te3.C49631gz3;
import te3.C64237ap1;
import te3.C64270bz;
import te3.C64899zy;
import te3.hi4;
import up1.C65418l;
import wp1.C15585f;
import wp1.C66166c;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: wq1.b */
public final class C66173b {

    /* renamed from: a */
    public static final C66173b f190184a = new C66173b();

    /* renamed from: a */
    public final void mo90262a(FinderItem finderItem) {
        C87412m.m108594g(finderItem, "finderObj");
        Log.m105924i("Finder.FinderPostFileLogic", "moveFileToPost");
        C58741j5 j5Var = C58741j5.f168184a;
        C86013q1.m106461v(C58741j5.f168196m);
        if (!finderItem.isMvFeed()) {
            if (finderItem.getMediaExtList().size() != 1 || finderItem.getMediaExtList().get(0).f185235B == null) {
                mo90264c(finderItem);
            } else {
                mo90265d(finderItem);
            }
            finderItem.setMediaList(finderItem.getMediaList());
            if (finderItem.isLongVideo()) {
                finderItem.setMediaList(finderItem.getMediaList());
            }
            C15585f.f42211a.mo14345h(finderItem);
        }
    }

    /* renamed from: b */
    public final void mo90263b(C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        Log.m105924i("Finder.FinderPostFileLogic", "moveFileToPost draft");
        C86013q1.m106461v(C58741j5.f168196m);
        if (!(lVar.field_objectType == 2)) {
            FinderItem l2 = lVar.mo89514l2();
            if (l2.getMediaExtList().size() != 1 || l2.getMediaExtList().get(0).f185235B == null) {
                mo90264c(l2);
            } else {
                mo90265d(l2);
            }
            l2.setMediaList(l2.getMediaList());
            if (l2.isLongVideo()) {
                l2.setMediaList(l2.getMediaList());
            }
            C66166c.f190172a.mo90231b(lVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02d2, code lost:
        if (r4.outHeight > 0) goto L_0x02d6;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90264c(com.tencent.p014mm.plugin.finder.storage.FinderItem r35) {
        /*
            r34 = this;
            up1.y r7 = up1.C27696y.RAW_IMAGE
            java.lang.String r0 = "finderObj"
            r8 = r35
            gy3.C87412m.m108594g(r8, r0)
            java.util.LinkedList r0 = r35.getMediaList()
            java.util.Iterator r9 = r0.iterator()
            r10 = 0
            r0 = 0
        L_0x0013:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x038e
            java.lang.Object r1 = r9.next()
            int r11 = r0 + 1
            if (r0 < 0) goto L_0x0389
            r6 = r1
            te3.rq2 r6 = (te3.C64689rq2) r6
            java.lang.String r0 = r6.f185266d
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            java.lang.String r1 = r6.f185267e
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            java.lang.String r3 = r6.f185283w
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            java.lang.String r4 = r6.f185239F
            boolean r21 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            java.lang.String r4 = r6.f185266d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            java.lang.String r5 = r6.f185266d
            if (r5 == 0) goto L_0x004d
            java.lang.String r12 = er1.C58741j5.f168196m
            boolean r5 = z04.C112551y.m153819s(r5, r12, r10)
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            java.lang.String r12 = r6.f185267e
            if (r12 == 0) goto L_0x0059
            java.lang.String r13 = er1.C58741j5.f168196m
            boolean r12 = z04.C112551y.m153819s(r12, r13, r10)
            goto L_0x005a
        L_0x0059:
            r12 = 0
        L_0x005a:
            java.lang.String r13 = r6.f185283w
            if (r13 == 0) goto L_0x0067
            java.lang.String r14 = er1.C58741j5.f168196m
            boolean r13 = z04.C112551y.m153819s(r13, r14, r10)
            r22 = r13
            goto L_0x0069
        L_0x0067:
            r22 = 0
        L_0x0069:
            java.lang.String r13 = r6.f185239F
            if (r13 == 0) goto L_0x0076
            java.lang.String r14 = er1.C58741j5.f168196m
            boolean r13 = z04.C112551y.m153819s(r13, r14, r10)
            r23 = r13
            goto L_0x0078
        L_0x0076:
            r23 = 0
        L_0x0078:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "moveFileToPost, mediaId: "
            r13.append(r14)
            r13.append(r4)
            java.lang.String r4 = ", fileExist:"
            r13.append(r4)
            r13.append(r0)
            java.lang.String r4 = ", thumbExist:"
            r13.append(r4)
            r13.append(r1)
            java.lang.String r4 = ", before url: "
            r13.append(r4)
            java.lang.String r4 = r6.f185266d
            r13.append(r4)
            java.lang.String r4 = ", "
            r13.append(r4)
            java.lang.String r14 = r6.f185267e
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = r6.f185283w
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = "Finder.FinderPostFileLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            if (r0 != 0) goto L_0x00c6
            if (r1 == 0) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            r26 = r9
            r33 = r11
            r2 = 0
            goto L_0x0380
        L_0x00c6:
            int r13 = r6.f185268f
            java.lang.String r14 = "copyImageThumbFromTmpToPost exist, copy"
            java.lang.String r2 = "copyImageThumbFromTmpToPost not exist, generate"
            java.lang.String r10 = "finder.FinderPostFileManager"
            r24 = r4
            java.lang.String r4 = ", thumbPostPath:"
            java.lang.String r8 = ", thumbOriginPath:"
            java.lang.String r25 = ""
            r26 = r9
            r9 = 2
            if (r13 == r9) goto L_0x024d
            r9 = 4
            if (r13 == r9) goto L_0x00e8
            r3 = 7
            if (r13 == r3) goto L_0x024d
            r33 = r11
            r9 = r15
            r11 = r24
            goto L_0x0249
        L_0x00e8:
            if (r0 == 0) goto L_0x0182
            if (r1 == 0) goto L_0x0182
            if (r12 != 0) goto L_0x0182
            java.lang.String r1 = "moveFileToPost Video thumb"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            java.lang.String r1 = r6.f185267e
            uq1.e r27 = uq1.C65433e.f188292a
            java.lang.String r12 = r6.f185266d
            if (r12 != 0) goto L_0x00fd
            r12 = r25
        L_0x00fd:
            if (r1 != 0) goto L_0x0101
            r1 = r25
        L_0x0101:
            er1.j5 r13 = er1.C58741j5.f168184a
            java.lang.String r13 = r13.mo83735i(r12)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r33 = r11
            java.lang.String r11 = "copyVideoThumbFileToPost, videoFilePath:"
            r9.append(r11)
            r9.append(r12)
            r9.append(r8)
            r9.append(r1)
            r9.append(r4)
            r9.append(r13)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            uq1.m r4 = uq1.C65449m.f188332a
            boolean r8 = r4.mo89565d(r1)
            if (r8 == 0) goto L_0x0138
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r13)
            goto L_0x0179
        L_0x0138:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r1 = 4
            android.graphics.Point r1 = r4.mo89569i(r12, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "genVideoThumbFileTmp videoFilePath:"
            r2.append(r4)
            r2.append(r12)
            java.lang.String r4 = ", targetWidth:"
            r2.append(r4)
            int r4 = r1.x
            r2.append(r4)
            java.lang.String r4 = ", targetHeight:"
            r2.append(r4)
            int r4 = r1.y
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            int r2 = r1.x
            int r1 = r1.y
            r31 = 0
            r28 = r12
            r29 = r2
            r30 = r1
            r32 = r13
            r27.mo89554e(r28, r29, r30, r31, r32)
        L_0x0179:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r1 == 0) goto L_0x0184
            r6.f185267e = r13
            goto L_0x0184
        L_0x0182:
            r33 = r11
        L_0x0184:
            if (r0 == 0) goto L_0x01f1
            if (r5 != 0) goto L_0x01f1
            java.lang.String r0 = "moveFileToPost Video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            pl1.r0 r0 = new pl1.r0
            up1.y r14 = up1.C27696y.V99_VIDEO
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 56
            r20 = 0
            java.lang.String r1 = "xV99"
            r12 = r0
            r13 = r6
            r9 = r15
            r15 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            er1.j5 r1 = er1.C58741j5.f168184a
            long r4 = r35.getCreateTime()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r1.mo83734h(r0, r2)
            java.lang.String r1 = r6.f185266d
            r2 = 0
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106443d(r1, r0, r2)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x01dc
            java.lang.String r1 = r6.f185266d
            r6.f185250Q0 = r1
            r6.f185266d = r0
            if (r0 != 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r25 = r0
        L_0x01cb:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r25)
            r6.f185275p = r0
            er1.w3 r0 = er1.C58784w3.f168295a
            java.lang.String r1 = r6.f185267e
            java.lang.String r0 = r0.mo83984z1(r1)
            r6.f185285x0 = r0
            goto L_0x01f2
        L_0x01dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "copy Video failed, copyRet:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x01f2
        L_0x01f1:
            r9 = r15
        L_0x01f2:
            if (r3 == 0) goto L_0x021e
            if (r22 != 0) goto L_0x021e
            java.lang.String r0 = "moveFileToPost Cover"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            pl1.o0 r8 = new pl1.o0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r1 = r6
            r2 = r7
            r11 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            er1.j5 r0 = er1.C58741j5.f168184a
            long r1 = r35.getCreateTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.mo83732f(r8, r1)
            java.lang.String r1 = r6.f185283w
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)
            r6.f185283w = r0
            goto L_0x0220
        L_0x021e:
            r11 = r24
        L_0x0220:
            if (r21 == 0) goto L_0x0249
            if (r23 != 0) goto L_0x0249
            java.lang.String r0 = "moveFileToPost fullThumb"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            pl1.o0 r8 = new pl1.o0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            er1.j5 r0 = er1.C58741j5.f168184a
            long r1 = r35.getCreateTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.mo83732f(r8, r1)
            java.lang.String r1 = r6.f185239F
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r0)
            r6.f185239F = r0
        L_0x0249:
            r12 = r6
            r2 = 0
            goto L_0x0350
        L_0x024d:
            r33 = r11
            r9 = r15
            r11 = r24
            if (r0 == 0) goto L_0x02f0
            if (r1 == 0) goto L_0x02f0
            if (r12 != 0) goto L_0x02f0
            java.lang.String r1 = "moveFileToPost Image thumb"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            uq1.e r1 = uq1.C65433e.f188292a
            java.lang.String r3 = r6.f185266d
            if (r3 != 0) goto L_0x0265
            r3 = r25
        L_0x0265:
            java.lang.String r12 = r6.f185267e
            if (r12 != 0) goto L_0x026b
            r12 = r25
        L_0x026b:
            er1.j5 r13 = er1.C58741j5.f168184a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = er1.C58741j5.f168196m
            r13.append(r15)
            java.lang.String r15 = "image_"
            r13.append(r15)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r13.append(r15)
            r15 = 95
            r13.append(r15)
            r17 = r5
            r15 = r6
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106452m(r3)
            r13.append(r5)
            java.lang.String r5 = "_thumb"
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "copyImageThumbFromTmpToPost, imagePath:"
            r6.append(r13)
            r6.append(r3)
            r6.append(r8)
            r6.append(r12)
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            r6 = 1
            if (r4 == 0) goto L_0x02d5
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r4.inJustDecodeBounds = r6
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r12, r4)
            int r8 = r4.outWidth
            if (r8 <= 0) goto L_0x02d5
            int r4 = r4.outHeight
            if (r4 <= 0) goto L_0x02d5
            goto L_0x02d6
        L_0x02d5:
            r6 = 0
        L_0x02d6:
            if (r6 == 0) goto L_0x02df
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
            com.tencent.p014mm.vfs.C86013q1.m106442c(r12, r5)
            goto L_0x02e6
        L_0x02df:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r2 = 0
            r1.mo89553b(r3, r5, r2)
        L_0x02e6:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            r6 = r15
            if (r1 == 0) goto L_0x02f2
            r6.f185267e = r5
            goto L_0x02f2
        L_0x02f0:
            r17 = r5
        L_0x02f2:
            if (r0 == 0) goto L_0x0249
            if (r17 != 0) goto L_0x0249
            java.lang.String r0 = "moveFileToPost Image"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            pl1.b0 r8 = new pl1.b0
            r3 = 0
            r4 = 0
            r5 = 12
            r10 = 0
            r0 = r8
            r1 = r6
            r2 = r7
            r12 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            er1.j5 r0 = er1.C58741j5.f168184a
            long r1 = r35.getCreateTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.mo83730d(r8, r1)
            java.lang.String r1 = r12.f185266d
            r2 = 0
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106443d(r1, r0, r2)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x033c
            java.lang.String r1 = r12.f185266d
            r12.f185250Q0 = r1
            r12.f185266d = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
            r12.f185275p = r0
            er1.w3 r0 = er1.C58784w3.f168295a
            java.lang.String r1 = r12.f185267e
            java.lang.String r0 = r0.mo83984z1(r1)
            r12.f185285x0 = r0
            goto L_0x0350
        L_0x033c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "copy Image failed, copyRet:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x0350:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveFileToPost, after mediaId: "
            r0.append(r1)
            java.lang.String r1 = r12.f185275p
            r0.append(r1)
            java.lang.String r1 = ", url: "
            r0.append(r1)
            java.lang.String r1 = r12.f185266d
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = r12.f185267e
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = r12.f185283w
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x0380:
            r8 = r35
            r9 = r26
            r0 = r33
            r10 = 0
            goto L_0x0013
        L_0x0389:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wq1.C66173b.mo90264c(com.tencent.mm.plugin.finder.storage.FinderItem):void");
    }

    /* renamed from: d */
    public final void mo90265d(FinderItem finderItem) {
        LinkedList<String> linkedList;
        C64237ap1 ap12;
        Uri imageExternalUri;
        LinkedList<hi4> linkedList2;
        T t;
        Class cls = C65000f.class;
        C87412m.m108594g(finderItem, "finderObj");
        C64899zy zyVar = finderItem.getMediaExtList().get(0).f185235B;
        if (!(zyVar == null || (linkedList2 = zyVar.f186899d) == null)) {
            for (hi4 hi4 : linkedList2) {
                if (C86013q1.m106450k(hi4.f183504d)) {
                    String str = hi4.f183504d;
                    C87412m.m108593f(str, "it.path");
                    C58741j5 j5Var = C58741j5.f168184a;
                    if (!C112551y.m153819s(str, C58741j5.f168196m, false)) {
                        String e = j5Var.mo83731e(MD5Util.getMD5String(hi4.f183504d) + hi4.hashCode());
                        String str2 = hi4.f183504d;
                        Uri videoExternalUri = ScopedStorageUtil.Imports.getVideoExternalUri(MMApplicationContext.getContext(), str2);
                        if (videoExternalUri == null) {
                            videoExternalUri = ScopedStorageUtil.Imports.getImageExternalUri(MMApplicationContext.getContext(), str2);
                        }
                        if (videoExternalUri != null) {
                            str2 = videoExternalUri.toString();
                        }
                        C86013q1.m106442c(str2, e);
                        Log.m105924i("Finder.FinderPostFileLogic", "copy " + hi4.f183504d + " to " + e + "  real:" + C86013q1.m106448i(e, false) + ",result:" + C86013q1.m106450k(e));
                        if (C86013q1.m106450k(e)) {
                            if (hi4.f183516s == 1) {
                                ((C65000f) C86312j.m106911c(cls)).Oo0(hi4.f183504d);
                            }
                            LinkedList<C64270bz> linkedList3 = zyVar.f186910r;
                            C87412m.m108593f(linkedList3, "compositionInfo.trackLabelInfoList");
                            Iterator<T> it = linkedList3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (C87412m.m108589b(((C64270bz) t).f182337d, hi4.f183504d)) {
                                    break;
                                }
                            }
                            C64270bz bzVar = (C64270bz) t;
                            if (bzVar != null) {
                                bzVar.f182337d = e;
                            }
                            hi4.f183504d = e;
                            finderItem.getMediaExtList().get(0).f185250Q0 = str2;
                        }
                    }
                }
            }
        }
        String str3 = finderItem.getMediaExtList().get(0).f185267e;
        if (C86013q1.m106450k(str3) && str3 != null) {
            C58741j5 j5Var2 = C58741j5.f168184a;
            if (!C112551y.m153819s(str3, C58741j5.f168196m, false)) {
                String e2 = j5Var2.mo83731e(MD5Util.getMD5String(str3) + str3.hashCode());
                Uri imageExternalUri2 = ScopedStorageUtil.Imports.getImageExternalUri(MMApplicationContext.getContext(), str3);
                String uri = imageExternalUri2 != null ? imageExternalUri2.toString() : str3;
                C87412m.m108593f(uri, "thumbPath.let { orgSrcPa… orgSrcPath\n            }");
                C86013q1.m106442c(uri, e2);
                Log.m105924i("Finder.FinderPostFileLogic", "copy thumb" + str3 + " to " + e2 + "  real:" + C86013q1.m106448i(e2, false) + ",result:" + C86013q1.m106450k(e2));
                if (C86013q1.m106450k(e2)) {
                    ((C65000f) C86312j.m106911c(cls)).Oo0(str3);
                    finderItem.getMediaExtList().get(0).f185267e = e2;
                }
            }
        }
        String str4 = finderItem.getMediaExtList().get(0).f185239F;
        if (C86013q1.m106450k(str4) && str4 != null) {
            C58741j5 j5Var3 = C58741j5.f168184a;
            if (!C112551y.m153819s(str4, C58741j5.f168196m, false)) {
                String e3 = j5Var3.mo83731e(MD5Util.getMD5String(str4) + str4.hashCode());
                C86013q1.m106442c((Build.VERSION.SDK_INT < 30 || (imageExternalUri = ScopedStorageUtil.Imports.getImageExternalUri(MMApplicationContext.getContext(), str4)) == null) ? str4 : imageExternalUri.toString(), e3);
                Log.m105924i("Finder.FinderPostFileLogic", "copy fullThumbPath" + str4 + " to " + e3 + "  real:" + C86013q1.m106448i(e3, false) + ",result:" + C86013q1.m106450k(e3));
                if (C86013q1.m106450k(e3)) {
                    finderItem.getMediaExtList().get(0).f185239F = e3;
                }
            }
        }
        FinderObjectDesc finderObjectDesc = finderItem.getFeedObject().objectDesc;
        C49631gz3 gz32 = (finderObjectDesc == null || (ap12 = finderObjectDesc.video_tmpl_info) == null) ? null : ap12.f182122n;
        if (gz32 != null && (linkedList = gz32.f134371d) != null && linkedList.size() > 0) {
            C58741j5 j5Var4 = C58741j5.f168184a;
            String str5 = C58741j5.f168196m + "templateScy/";
            C86013q1.m106461v(str5);
            String first = linkedList.getFirst();
            C87412m.m108593f(first, "it.first");
            List U = C112550d0.m153785U(first, new String[]{"/"}, false, 0, 6, (Object) null);
            if (U.size() > 2) {
                String str6 = str5 + ((String) U.get(U.size() - 2));
                C86013q1.m106461v(str6);
                LinkedList linkedList4 = new LinkedList();
                for (String str7 : linkedList) {
                    C87412m.m108593f(str7, "path");
                    List U2 = C112550d0.m153785U(str7, new String[]{"/"}, false, 0, 6, (Object) null);
                    String str8 = str6 + XVFSFile.SEPARATOR_CHAR + ((String) C110818d0.m150923U(U2));
                    Log.m105924i("Finder.FinderPostFileLogic", "copy:" + str7 + " to:" + str8 + " result:" + C86013q1.m106443d(str7, str8, false));
                    linkedList4.add(str8);
                }
                linkedList.clear();
                linkedList.addAll(linkedList4);
            }
        }
    }
}
