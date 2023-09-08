package pb1;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import f40.C86709a0;
import lc3.C10485b;
import te3.C101834rc0;

/* renamed from: pb1.e0 */
public class C100703e0 implements C11883v0 {

    /* renamed from: a */
    public boolean f295052a = true;

    /* renamed from: b */
    public boolean f295053b = true;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r5 != 23) goto L_0x010e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo140132a(pb1.C100755z r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.FavSendFilter"
            r1 = 0
            if (r8 != 0) goto L_0x000b
            java.lang.String r8 = "canBeForwardWithMsg err0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
            return r1
        L_0x000b:
            int r2 = r8.field_itemStatus
            r3 = 1
            if (r2 <= 0) goto L_0x0026
            boolean r2 = pb1.C100734q.m131841c0(r8)
            if (r2 != 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r8 = r8.field_itemStatus
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r1] = r8
            java.lang.String r8 = "canBeForwardWithMsg err1 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r2)
            return r1
        L_0x0026:
            java.lang.Class<pb1.j1> r2 = pb1.C100718j1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            long r4 = r8.field_localId
            xb1.d r2 = (xb1.C102614d) r2
            pb1.z r2 = r2.mo142266Yt(r4)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            te3.rc0 r5 = pb1.C100734q.m131813D(r8)
            java.lang.String r5 = pb1.C100734q.m131880w(r5)
            r4.<init>((java.lang.String) r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[canBeForwardWithMsg] info.getType = "
            r5.append(r6)
            int r6 = r8.field_type
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            int r5 = r8.field_type
            r6 = 2
            if (r5 == r6) goto L_0x0107
            r6 = 4
            if (r5 == r6) goto L_0x00f4
            r6 = 8
            if (r5 == r6) goto L_0x0107
            r6 = 14
            if (r5 == r6) goto L_0x00a0
            r6 = 16
            if (r5 == r6) goto L_0x007b
            r4 = 18
            if (r5 == r4) goto L_0x00a0
            r4 = 23
            if (r5 == r4) goto L_0x00a0
            goto L_0x010e
        L_0x007b:
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r5 = "SIGHTCannotTransmitForFav"
            java.lang.String r2 = r2.mo107405c(r5)
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            if (r2 == 0) goto L_0x0099
            java.lang.String r8 = "can not retransmit short video"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r8)
            return r1
        L_0x0099:
            boolean r2 = r4.mo119967g()
            if (r2 != 0) goto L_0x010e
            return r3
        L_0x00a0:
            int r4 = r8.field_id
            if (r4 > 0) goto L_0x00ac
            if (r2 == 0) goto L_0x00ac
            java.lang.String r8 = "canBeForwardWithMsg err2"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
            return r1
        L_0x00ac:
            te3.kd0 r2 = r8.field_favProto
            if (r2 == 0) goto L_0x00e8
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            int r2 = r2.size()
            if (r2 > r3) goto L_0x00b9
            goto L_0x00e8
        L_0x00b9:
            te3.kd0 r2 = r8.field_favProto
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            java.util.Iterator r2 = r2.iterator()
        L_0x00c1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x010e
            java.lang.Object r4 = r2.next()
            te3.rc0 r4 = (te3.C101834rc0) r4
            java.lang.String r5 = r4.f299325s
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00c1
            java.lang.String r5 = r4.f299329u
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00c1
            java.lang.String r4 = pb1.C100734q.m131880w(r4)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 != 0) goto L_0x00c1
            return r3
        L_0x00e8:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            te3.kd0 r8 = r8.field_favProto
            r2[r1] = r8
            java.lang.String r8 = "canBeForwardWithMsg err3 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r2)
            return r1
        L_0x00f4:
            te3.rc0 r2 = pb1.C100734q.m131813D(r8)
            java.lang.String r2 = r2.f299242A
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x010e
            boolean r2 = r4.mo119967g()
            if (r2 != 0) goto L_0x010e
            return r3
        L_0x0107:
            boolean r2 = r4.mo119967g()
            if (r2 != 0) goto L_0x010e
            return r3
        L_0x010e:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r8 = r8.field_type
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r1] = r8
            java.lang.String r8 = "canBeForwardWithMsg() err4:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100703e0.mo140132a(pb1.z):boolean");
    }

    /* renamed from: b */
    public boolean mo140133b(C101834rc0 rc02) {
        if (rc02 == null) {
            return true;
        }
        Log.m105924i("MicroMsg.FavSendFilter", "filter [FavDataItem] dataType = " + rc02.f299258I);
        int i = rc02.f299258I;
        boolean z = false;
        if (i != 2) {
            if (i == 3) {
                return true;
            }
            if (i != 4) {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 15) {
                            if (i != 29) {
                                return false;
                            }
                        } else if (Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SIGHTCannotTransmitForFav")) != 0) {
                            Log.m105928w("MicroMsg.FavSendFilter", "can not retransmit short video");
                            return true;
                        } else {
                            Uri n = C116299g2.m163858n(C100734q.m131880w(rc02));
                            String path = n.getPath();
                            if (path != null) {
                                String k = C116299g2.m163855k(path, false, false);
                                if (!n.getPath().equals(k)) {
                                    n = n.buildUpon().path(k).build();
                                }
                            }
                            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                            return !(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b));
                        }
                    }
                }
                return Util.isNullOrNil(rc02.f299242A) && Util.isNullOrNil(rc02.f299246C) && Util.isNullOrNil(rc02.f299250E) && Util.isNullOrNil(rc02.f299250E);
            }
            Uri n2 = C116299g2.m163858n(C100734q.m131880w(rc02));
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) {
                return false;
            }
            return Util.isNullOrNil(rc02.f299242A);
        }
        Uri n3 = C116299g2.m163858n(C100734q.m131880w(rc02));
        String path3 = n3.getPath();
        if (path3 != null) {
            String k3 = C116299g2.m163855k(path3, false, false);
            if (!n3.getPath().equals(k3)) {
                n3 = n3.buildUpon().path(k3).build();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[filter Data] IMG & FILE, dataFile path = ");
        sb.append(C100734q.m131880w(rc02));
        sb.append(", exists = ");
        C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n3, (C116281f0.C116288h) null);
        sb.append(!l3.mo177810a() ? false : l3.f348991a.mo119948x(l3.f348992b));
        Log.m105924i("MicroMsg.FavSendFilter", sb.toString());
        C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(n3, l3);
        if (l4.mo177810a()) {
            z = l4.f348991a.mo119948x(l4.f348992b);
        }
        return !z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0100, code lost:
        if (r3 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0111, code lost:
        if (r3 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r3.close();
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b A[SYNTHETIC, Splitter:B:51:0x010b] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo140134c(p272xq.C102713f r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            r2 = 1
            if (r20 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r3 = pb1.C100734q.f295126a
            te3.kd0 r3 = r20.mo140188w0()
            java.lang.String r4 = "MicroMsg.Fav.FavApiLogic"
            r5 = 2
            r6 = 0
            if (r3 != 0) goto L_0x001a
            java.lang.String r3 = "[checkIsFavIncludeIllegal] favProto = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x005b
        L_0x001a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "[checkIsFavIncludeIllegal] itemInfo.localId = "
            r3.append(r7)
            long r7 = r20.getLocalId()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            te3.kd0 r3 = r20.mo140188w0()
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x005b
            java.lang.Object r7 = r3.next()
            te3.rc0 r7 = (te3.C101834rc0) r7
            int r7 = r7.f299322q1
            if (r7 != r5) goto L_0x0052
            java.lang.String r3 = "[checkIsFavIncludeIllegal] FavDataIllegal_FileSizeExceed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x0059
        L_0x0052:
            if (r7 != r2) goto L_0x003c
            java.lang.String r3 = "[checkIsFavIncludeIllegal] FavDataIllegal_MsgExpired"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
        L_0x0059:
            r3 = 1
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 == 0) goto L_0x005f
            return r2
        L_0x005f:
            int r3 = r20.getType()
            r4 = 3
            r7 = 4
            r8 = 0
            java.lang.String r9 = "MicroMsg.FavSendFilter"
            switch(r3) {
                case 1: goto L_0x0398;
                case 2: goto L_0x0361;
                case 3: goto L_0x0356;
                case 4: goto L_0x02f0;
                case 5: goto L_0x02b5;
                case 6: goto L_0x02aa;
                case 7: goto L_0x0283;
                case 8: goto L_0x0361;
                case 9: goto L_0x006b;
                case 10: goto L_0x0270;
                case 11: goto L_0x025d;
                case 12: goto L_0x006b;
                case 13: goto L_0x006b;
                case 14: goto L_0x0146;
                case 15: goto L_0x0133;
                case 16: goto L_0x0085;
                case 17: goto L_0x006b;
                case 18: goto L_0x0146;
                case 19: goto L_0x006c;
                case 20: goto L_0x006b;
                case 21: goto L_0x0283;
                default: goto L_0x006b;
            }
        L_0x006b:
            return r6
        L_0x006c:
            boolean r0 = r1.f295053b
            if (r0 == 0) goto L_0x0084
            te3.kd0 r0 = r20.mo140188w0()
            te3.pc0 r0 = r0.f298610I
            if (r0 != 0) goto L_0x0079
            return r2
        L_0x0079:
            int r3 = r0.f259745h
            if (r3 == r4) goto L_0x0083
            int r0 = r0.f259749o
            if (r0 == 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r2 = 0
        L_0x0083:
            return r2
        L_0x0084:
            return r6
        L_0x0085:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r3 = "SIGHTCannotTransmitForFav"
            java.lang.String r0 = r0.mo107405c(r3)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "can not retransmit short video"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            return r2
        L_0x00a3:
            te3.rc0 r0 = pb1.C100734q.m131813D(r20)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            java.lang.String r10 = pb1.C100734q.m131880w(r0)
            r3.<init>((java.lang.String) r10)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            int r11 = r20.getId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r6] = r11
            long r11 = r20.getLocalId()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r2] = r11
            java.lang.String r11 = r3.mo119971i()
            r10[r5] = r11
            boolean r11 = r3.mo119967g()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10[r4] = r11
            java.lang.String r11 = "type size, favid %d, localid %d, path %s, exist %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            boolean r10 = r3.mo119967g()
            if (r10 == 0) goto L_0x0132
            long r10 = r3.mo119980r()
            long r12 = r0.f299276R
            long r14 = r12 - r10
            long r14 = java.lang.Math.abs(r14)
            r16 = 16
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0131
            android.net.Uri r3 = r3.f250486d     // Catch:{ IOException -> 0x010f, all -> 0x0108 }
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106421C(r3, r8)     // Catch:{ IOException -> 0x010f, all -> 0x0108 }
            r14 = 4096(0x1000, float:5.74E-42)
            java.lang.String r8 = p823sg.C90193h.m112874b(r3, r14)     // Catch:{ IOException -> 0x0106, all -> 0x0103 }
            if (r3 == 0) goto L_0x0116
            goto L_0x0113
        L_0x0103:
            r0 = move-exception
            r8 = r3
            goto L_0x0109
        L_0x0106:
            goto L_0x0111
        L_0x0108:
            r0 = move-exception
        L_0x0109:
            if (r8 == 0) goto L_0x010e
            r8.close()     // Catch:{ IOException -> 0x010e }
        L_0x010e:
            throw r0
        L_0x010f:
            r3 = r8
        L_0x0111:
            if (r3 == 0) goto L_0x0116
        L_0x0113:
            r3.close()     // Catch:{ IOException -> 0x0116 }
        L_0x0116:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r3[r6] = r7
            r3[r2] = r8
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r3[r5] = r6
            java.lang.String r0 = r0.f299266M
            r3[r4] = r0
            java.lang.String r0 = "it can not retransmit short video because of file was replaced. file[%d, %s], data[%d, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r0, r3)
            return r2
        L_0x0131:
            return r6
        L_0x0132:
            return r2
        L_0x0133:
            te3.kd0 r0 = r20.mo140188w0()
            te3.ud0 r0 = r0.f298604C
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = r0.f299624j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r2 = 0
        L_0x0145:
            return r2
        L_0x0146:
            di3.d r3 = di3.C86312j.m106911c(r0)
            pb1.j1 r3 = (pb1.C100718j1) r3
            pb1.w0 r3 = r3.mo128199Jq()
            if (r3 != 0) goto L_0x0153
            goto L_0x0167
        L_0x0153:
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r3 = r20.getLocalId()
            xb1.d r0 = (xb1.C102614d) r0
            pb1.z r8 = r0.mo142266Yt(r3)
        L_0x0167:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[filter FAV_ITEM_TYPE_NOTE] info.localId = "
            r0.append(r3)
            long r3 = r20.getLocalId()
            r0.append(r3)
            java.lang.String r3 = ", localItemInfo == null ? ="
            r0.append(r3)
            if (r8 != 0) goto L_0x0181
            r3 = 1
            goto L_0x0182
        L_0x0181:
            r3 = 0
        L_0x0182:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            int r0 = r20.getId()
            if (r0 > 0) goto L_0x0195
            if (r8 == 0) goto L_0x0195
            return r2
        L_0x0195:
            int r0 = r20.getType()
            r3 = 18
            if (r0 != r3) goto L_0x01f9
            te3.kd0 r0 = r20.mo140188w0()
            if (r0 == 0) goto L_0x01af
            te3.kd0 r0 = r20.mo140188w0()
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            int r0 = r0.size()
            if (r0 > r2) goto L_0x01f9
        L_0x01af:
            te3.kd0 r0 = r20.mo140188w0()
            if (r0 != 0) goto L_0x01ce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[filter FAV_ITEM_TYPE_NOTE] favProto = null, info.localId = "
            r0.append(r3)
            long r3 = r20.getLocalId()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x01f8
        L_0x01ce:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[filter FAV_ITEM_TYPE_NOTE] favProto.data size = "
            r0.append(r3)
            te3.kd0 r3 = r20.mo140188w0()
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r3 = ", info.localId = "
            r0.append(r3)
            long r3 = r20.getLocalId()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x01f8:
            return r2
        L_0x01f9:
            int r0 = r20.getType()
            if (r0 != r3) goto L_0x022d
            te3.kd0 r0 = r20.mo140188w0()
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            java.lang.Object r0 = r0.get(r6)
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.lang.String r0 = r0.f299325s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0227
            te3.kd0 r0 = r20.mo140188w0()
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            java.lang.Object r0 = r0.get(r6)
            te3.rc0 r0 = (te3.C101834rc0) r0
            java.lang.String r0 = r0.f299329u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x022d
        L_0x0227:
            java.lang.String r0 = "[filter FAV_ITEM_TYPE_NOTE] dataList[0] DataUrl || CdnDataKey empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return r2
        L_0x022d:
            te3.kd0 r0 = r20.mo140188w0()
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            java.util.Iterator r0 = r0.iterator()
        L_0x0237:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x025c
            java.lang.Object r3 = r0.next()
            te3.rc0 r3 = (te3.C101834rc0) r3
            int r4 = r3.f299258I
            if (r4 == r5) goto L_0x0251
            r8 = 8
            if (r4 == r8) goto L_0x0251
            r8 = 15
            if (r4 == r8) goto L_0x0251
            if (r4 != r7) goto L_0x0237
        L_0x0251:
            java.lang.String r3 = pb1.C100734q.m131880w(r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 != 0) goto L_0x0237
            return r2
        L_0x025c:
            return r6
        L_0x025d:
            te3.kd0 r0 = r20.mo140188w0()
            te3.jd0 r0 = r0.f298634y
            if (r0 == 0) goto L_0x026f
            java.lang.String r0 = r0.f298517j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x026e
            goto L_0x026f
        L_0x026e:
            r2 = 0
        L_0x026f:
            return r2
        L_0x0270:
            te3.kd0 r0 = r20.mo140188w0()
            te3.jd0 r0 = r0.f298634y
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = r0.f298517j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0281
            goto L_0x0282
        L_0x0281:
            r2 = 0
        L_0x0282:
            return r2
        L_0x0283:
            te3.rc0 r0 = pb1.C100734q.m131813D(r20)
            java.lang.String r3 = r0.f299242A
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x02a8
            java.lang.String r3 = r0.f299246C
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x02a8
            java.lang.String r3 = r0.f299250E
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x02a8
            java.lang.String r0 = r0.f299250E
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x02a8
            goto L_0x02a9
        L_0x02a8:
            r2 = 0
        L_0x02a9:
            return r2
        L_0x02aa:
            te3.kd0 r0 = r20.mo140188w0()
            te3.zc0 r0 = r0.f298620h
            if (r0 != 0) goto L_0x02b3
            goto L_0x02b4
        L_0x02b3:
            r2 = 0
        L_0x02b4:
            return r2
        L_0x02b5:
            te3.kd0 r0 = r20.mo140188w0()
            te3.rd0 r0 = r0.f298616d
            te3.kd0 r3 = r20.mo140188w0()
            te3.ae0 r3 = r3.f298622j
            if (r3 == 0) goto L_0x02cb
            int r4 = r3.f297879w
            if (r4 != r2) goto L_0x02c8
            r6 = 1
        L_0x02c8:
            if (r6 == 0) goto L_0x02cb
            return r2
        L_0x02cb:
            if (r3 == 0) goto L_0x02cf
            java.lang.String r8 = r3.f297867h
        L_0x02cf:
            if (r0 == 0) goto L_0x02d9
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r2 == 0) goto L_0x02d9
            java.lang.String r8 = r0.f299364y
        L_0x02d9:
            boolean r0 = r20.mo140191z()
            if (r0 == 0) goto L_0x02eb
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 == 0) goto L_0x02eb
            te3.rc0 r0 = pb1.C100734q.m131813D(r20)
            java.lang.String r8 = r0.f299242A
        L_0x02eb:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            return r0
        L_0x02f0:
            te3.rc0 r0 = pb1.C100734q.m131813D(r20)
            java.lang.String r2 = pb1.C100734q.m131880w(r0)
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r3 = r2.getPath()
            if (r3 == 0) goto L_0x031c
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r6, r6)
            java.lang.String r4 = r2.getPath()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x031c
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x031c:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r8)
            boolean r3 = r2.mo177810a()
            if (r3 != 0) goto L_0x032a
            r2 = 0
            goto L_0x0332
        L_0x032a:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r3.mo119948x(r2)
        L_0x0332:
            if (r2 == 0) goto L_0x0335
            return r6
        L_0x0335:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[FAV_ITEM_TYPE_VIDEO] webUrl is null ? "
            r2.append(r3)
            java.lang.String r3 = r0.f299242A
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            java.lang.String r0 = r0.f299242A
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            return r0
        L_0x0356:
            boolean r0 = r1.f295052a
            if (r0 == 0) goto L_0x0360
            java.lang.String r0 = "[FAV_ITEM_TYPE_VOICE] canFilterVoice = true, back"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            return r2
        L_0x0360:
            return r6
        L_0x0361:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            te3.rc0 r3 = pb1.C100734q.m131813D(r20)
            java.lang.String r3 = pb1.C100734q.m131880w(r3)
            r0.<init>((java.lang.String) r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[filter FAV_ITEM_TYPE_FILE] dataFile path = "
            r3.append(r4)
            java.lang.String r4 = r0.mo119971i()
            r3.append(r4)
            java.lang.String r4 = ", dataFile.exists() = "
            r3.append(r4)
            boolean r4 = r0.mo119967g()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r3)
            boolean r0 = r0.mo119967g()
            r0 = r0 ^ r2
            return r0
        L_0x0398:
            te3.kd0 r0 = r20.mo140188w0()
            java.lang.String r0 = r0.f298628s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.C100703e0.mo140134c(xq.f):boolean");
    }
}
