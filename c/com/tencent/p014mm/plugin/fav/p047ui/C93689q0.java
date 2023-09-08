package com.tencent.p014mm.plugin.fav.p047ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100745t;
import pb1.C100755z;
import te3.C101834rc0;
import te3.C101835rd0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.q0 */
public class C93689q0 {
    /* renamed from: a */
    public static C100755z m118389a(LinkedList<C101834rc0> linkedList, long j) {
        C100755z zVar;
        Class cls = C100718j1.class;
        if (j != -1) {
            zVar = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(j);
            if (zVar == null) {
                zVar = new C100755z();
                zVar.field_type = 18;
                zVar.field_sourceType = 6;
                String s = C75592q0.m90789s();
                C101835rd0 rd02 = new C101835rd0();
                rd02.mo141275k(s);
                rd02.mo141279o(s);
                rd02.mo141277m(zVar.field_sourceType);
                rd02.mo141273f(Util.nowMilliSecond());
                zVar.field_favProto.mo141219q(rd02);
                zVar.field_fromUser = rd02.f299348f;
                zVar.field_toUser = rd02.f299350h;
                zVar.field_favProto.mo141222t(1);
                zVar.field_favProto.mo141210d(127);
                zVar.field_edittime = Util.nowSecond();
                zVar.field_updateTime = Util.nowMilliSecond();
                zVar.field_favProto.mo141213k(zVar.field_edittime);
                zVar.field_favProto.f298616d.mo141273f(Util.nowMilliSecond());
                zVar.field_itemStatus = 9;
                zVar.field_localId = j;
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).insert(zVar);
            }
            zVar.field_favProto.f298618f.clear();
        } else {
            zVar = null;
        }
        if (zVar == null) {
            zVar = new C100755z();
            zVar.field_type = 18;
            zVar.field_sourceType = 6;
            m118393e(zVar);
            zVar.field_favProto.mo141222t(1);
            zVar.field_favProto.mo141210d(127);
        }
        zVar.field_edittime = Util.nowSecond();
        zVar.field_updateTime = Util.nowMilliSecond();
        zVar.field_favProto.mo141213k(zVar.field_edittime);
        zVar.field_favProto.f298616d.mo141273f(Util.nowMilliSecond());
        zVar.field_favProto.mo141211f(linkedList);
        return zVar;
    }

    /* renamed from: b */
    public static boolean m118390b(List<String> list) {
        if (!(list == null || list.size() == 0)) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                InputStream inputStream = null;
                try {
                    inputStream = C86013q1.m106423E(next);
                    if (inputStream != null) {
                        if (ImgUtil.isImgFile(next)) {
                            arrayList.add(next);
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    Util.qualityClose((Closeable) null);
                    throw th;
                }
                Util.qualityClose(inputStream);
            }
            list = arrayList;
        }
        if (list == null || list.size() == 0) {
            Log.m105920e("MicroMsg.FavPostLogic", "postImgs path null");
            return false;
        }
        C100755z zVar = new C100755z();
        zVar.field_type = 2;
        zVar.field_sourceType = 6;
        m118393e(zVar);
        for (String next2 : list) {
            C101834rc0 rc02 = new C101834rc0();
            rc02.f299284V = next2;
            String obj = rc02.toString();
            HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
            rc02.mo141257m(C100745t.m131892d(obj, 2));
            BitmapUtil.createThumbNail(next2, 150, 150, Bitmap.CompressFormat.JPEG, 90, C100734q.m131826Q(rc02), true);
            rc02.f299286W = C100734q.m131826Q(rc02);
            rc02.mo141260p(2);
            zVar.field_favProto.f298618f.add(rc02);
        }
        C93658i.m118346a(zVar);
        C115669n.INSTANCE.mo160131h(10648, 2, Integer.valueOf(list.size()));
        return true;
    }

    /* renamed from: c */
    public static boolean m118391c(String str, LinkedList<C101834rc0> linkedList, long j) {
        if (str.length() == 0) {
            Log.m105920e("MicroMsg.FavPostLogic", "postNote null");
            return false;
        }
        C93658i.m118346a(-1 == j ? m118389a(linkedList, j) : ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0151 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m118392d(com.tencent.p014mm.autogen.events.FavoriteOperationEvent r16) {
        /*
            r0 = r16
            java.lang.Class<pb1.j1> r1 = pb1.C100718j1.class
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            long r3 = r3.f264839e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            int r3 = r3.f264847m
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            java.lang.String r3 = r3.f264837c
            r6 = 2
            r2[r6] = r3
            java.lang.String r3 = "MicroMsg.FavPostLogic"
            java.lang.String r7 = "postNoteLogic localId:%s voiceType:%s desc:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r2)
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r2 = r0.f264833d
            int r7 = r2.f264847m
            r8 = -1
            if (r7 != r8) goto L_0x006a
            di3.d r1 = di3.C86312j.m106911c(r1)
            pb1.j1 r1 = (pb1.C100718j1) r1
            pb1.w0 r1 = r1.mo128199Jq()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r2 = r0.f264833d
            long r2 = r2.f264839e
            xb1.d r1 = (xb1.C102614d) r1
            pb1.z r1 = r1.mo142266Yt(r2)
            if (r1 == 0) goto L_0x0069
            te3.kd0 r2 = r1.field_favProto
            if (r2 == 0) goto L_0x0069
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            int r2 = r2.size()
            if (r2 <= r5) goto L_0x0069
            te3.kd0 r1 = r1.field_favProto
            java.util.LinkedList<te3.rc0> r1 = r1.f298618f
            java.lang.Object r1 = r1.get(r4)
            te3.rc0 r1 = (te3.C101834rc0) r1
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r0 = r0.f264834e
            java.lang.String r1 = r1.f299325s
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r0.f264863i = r1
        L_0x0069:
            return
        L_0x006a:
            r8 = -3
            java.lang.String r9 = "fav_note_xml"
            java.lang.String r10 = "fav_note_item_updatetime"
            java.lang.String r11 = "fav_note_item_status"
            r12 = 0
            java.lang.String r14 = "localId"
            if (r7 != r8) goto L_0x00d0
            long r4 = r2.f264839e
            int r15 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x00d0
            java.lang.String r2 = "handleCheckRestore() called"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            long r3 = r3.f264839e
            xb1.d r2 = (xb1.C102614d) r2
            pb1.z r2 = r2.mo142266Yt(r3)
            if (r2 == 0) goto L_0x00cf
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            android.content.Intent r3 = r3.f264841g
            int r4 = r2.field_itemStatus
            int r3 = r3.getIntExtra(r11, r4)
            r2.field_itemStatus = r3
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            android.content.Intent r3 = r3.f264841g
            long r4 = r2.field_updateTime
            long r3 = r3.getLongExtra(r10, r4)
            r2.field_updateTime = r3
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r0 = r0.f264833d
            android.content.Intent r0 = r0.f264841g
            java.lang.String r0 = r0.getStringExtra(r9)
            r2.mo140177D2(r0)
            di3.d r0 = di3.C86312j.m106911c(r1)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r1 = new java.lang.String[]{r14}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r2, r1)
        L_0x00cf:
            return
        L_0x00d0:
            r4 = -2
            if (r7 != r4) goto L_0x0152
            long r4 = r2.f264839e
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0152
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r4 = r0.f264833d
            long r4 = r4.f264839e
            xb1.d r2 = (xb1.C102614d) r2
            pb1.z r2 = r2.mo142266Yt(r4)
            if (r2 == 0) goto L_0x013f
            int r4 = r2.field_itemStatus
            r5 = 10
            if (r4 != r5) goto L_0x013f
            java.lang.String r4 = r2.field_xml
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x013f
            java.lang.String r4 = r2.field_xml
            r2.mo140177D2(r4)
            te3.kd0 r4 = r2.field_favProto
            if (r4 == 0) goto L_0x013f
            java.util.LinkedList<te3.rc0> r4 = r4.f298618f
            int r4 = r4.size()
            r5 = 1
            if (r4 <= r5) goto L_0x013f
            te3.kd0 r4 = r2.field_favProto
            java.util.LinkedList<te3.rc0> r4 = r4.f298618f
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            te3.rc0 r4 = (te3.C101834rc0) r4
            java.lang.String r5 = r4.f299325s
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x013f
            java.lang.String r4 = r4.f299329u
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x013f
            di3.d r4 = di3.C86312j.m106911c(r1)
            pb1.j1 r4 = (pb1.C100718j1) r4
            pb1.w0 r4 = r4.mo128199Jq()
            java.lang.String[] r5 = new java.lang.String[]{r14}
            xb1.d r4 = (xb1.C102614d) r4
            r4.update(r2, r5)
            r2 = 1
            goto L_0x0140
        L_0x013f:
            r2 = 0
        L_0x0140:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r7 = 0
            r5[r7] = r4
            java.lang.String r4 = "handleRepairResult:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            if (r2 == 0) goto L_0x0152
            return
        L_0x0152:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r4 = r0.f264833d
            long r6 = r4.f264839e
            int r15 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x018f
            java.lang.String r4 = r4.f264837c
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x018f
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r4 = r0.f264833d
            int r4 = r4.f264847m
            if (r4 <= 0) goto L_0x018f
            di3.d r4 = di3.C86312j.m106911c(r1)
            pb1.j1 r4 = (pb1.C100718j1) r4
            pb1.w0 r4 = r4.mo128199Jq()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r6 = r0.f264833d
            long r6 = r6.f264839e
            xb1.d r4 = (xb1.C102614d) r4
            pb1.z r4 = r4.mo142266Yt(r6)
            if (r4 == 0) goto L_0x018f
            java.lang.String r6 = pb1.C100755z.m131907w2(r4)
            r2.putExtra(r9, r6)
            long r6 = r4.field_updateTime
            r2.putExtra(r10, r6)
        L_0x018f:
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r4 = r0.f264833d
            te3.kd0 r6 = r4.f264838d
            java.util.LinkedList<te3.rc0> r6 = r6.f298618f
            long r9 = r4.f264839e
            pb1.z r4 = m118389a(r6, r9)
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r6 = r0.f264833d
            java.lang.String r6 = r6.f264837c
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0224
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r6 = r0.f264833d
            java.lang.String r6 = r6.f264837c
            r9 = 0
            r7[r9] = r6
            java.lang.String r6 = "handleAddNote() called with desc:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r7)
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            int r3 = r3.f264847m
            if (r3 <= 0) goto L_0x01cd
            int r3 = r4.field_itemStatus
            r2.putExtra(r11, r3)
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r0.f264833d
            r3.f264841g = r2
            te3.kd0 r2 = r4.field_favProto
            int r3 = r2.f298606E
            r6 = 1
            int r3 = r3 + r6
            r2.mo141222t(r3)
            goto L_0x01ce
        L_0x01cd:
            r6 = 1
        L_0x01ce:
            r4.field_itemStatus = r6
            pb1.C100734q.m131844e(r4)
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            java.lang.String[] r3 = new java.lang.String[]{r14}
            xb1.d r2 = (xb1.C102614d) r2
            r2.update(r4, r3)
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r2 = r0.f264833d
            java.lang.String r2 = r2.f264837c
            java.lang.String r3 = "fav_add_new_note"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0223
            te3.kd0 r2 = r4.field_favProto
            int r3 = r2.f298606E
            if (r3 == 0) goto L_0x01fe
            r6 = 1
            int r3 = r3 + r6
            r2.mo141222t(r3)
            goto L_0x0203
        L_0x01fe:
            r5 = 2
            int r3 = r3 + r5
            r2.mo141222t(r3)
        L_0x0203:
            di3.d r1 = di3.C86312j.m106911c(r1)
            pb1.j1 r1 = (pb1.C100718j1) r1
            pb1.w0 r1 = r1.mo128199Jq()
            java.lang.String[] r2 = new java.lang.String[]{r14}
            xb1.d r1 = (xb1.C102614d) r1
            r1.update(r4, r2)
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r0 = r0.f264833d
            java.lang.String r1 = r0.f264836b
            te3.kd0 r2 = r0.f264838d
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            long r3 = r0.f264839e
            m118391c(r1, r2, r3)
        L_0x0223:
            return
        L_0x0224:
            java.lang.String r0 = "handleUpdate() called"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            te3.kd0 r0 = r4.field_favProto
            int r2 = r0.f298606E
            if (r2 == 0) goto L_0x0235
            r3 = 1
            int r2 = r2 + r3
            r0.mo141222t(r2)
            goto L_0x023b
        L_0x0235:
            r3 = 1
            r5 = 2
            int r2 = r2 + r5
            r0.mo141222t(r2)
        L_0x023b:
            r4.field_itemStatus = r3
            pb1.C100734q.m131844e(r4)
            di3.d r0 = di3.C86312j.m106911c(r1)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r2 = new java.lang.String[]{r14}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r4, r2)
            di3.d r0 = di3.C86312j.m106911c(r1)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.o0 r0 = r0.C30()
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C93689q0.m118392d(com.tencent.mm.autogen.events.FavoriteOperationEvent):void");
    }

    /* renamed from: e */
    public static void m118393e(C100755z zVar) {
        String s = C75592q0.m90789s();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(s);
        rd02.mo141279o(s);
        rd02.mo141277m(zVar.field_sourceType);
        rd02.mo141273f(Util.nowMilliSecond());
        zVar.field_favProto.mo141219q(rd02);
        zVar.field_fromUser = rd02.f299348f;
        zVar.field_toUser = rd02.f299350h;
    }
}
