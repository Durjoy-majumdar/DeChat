package com.tencent.p014mm.modelavatar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import java.io.IOException;
import java.io.OutputStream;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;

/* renamed from: com.tencent.mm.modelavatar.q */
public class C92727q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f266863d;

    /* renamed from: e */
    public String f266864e;

    /* renamed from: f */
    public String f266865f;

    /* renamed from: g */
    public int f266866g;

    /* renamed from: h */
    public int f266867h;

    /* renamed from: i */
    public OutputStream f266868i = null;

    /* renamed from: j */
    public String f266869j;

    /* renamed from: n */
    public String f266870n;

    public C92727q(String str) {
        this.f266864e = str;
        if (C72996z1.m85811N4(str)) {
            this.f266864e = C72996z1.m85829Z5(str);
        }
        Log.m105924i("MicroMsg.NetSceneGetHDHeadImg", "init Headimage in_username:" + str + " out_username" + this.f266864e);
        this.f266866g = 480;
        this.f266867h = 480;
        this.f266865f = "jpg";
    }

    /* renamed from: k1 */
    public static void m116894k1(String str, String str2) {
        int i;
        AvatarStorage wx02 = C68102u.wx0();
        wx02.getClass();
        try {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
            int i2 = imageOptions.outWidth;
            int i3 = imageOptions.outHeight;
            int i4 = 156;
            if (i3 < i2) {
                i4 = (i2 * 156) / i3;
                i = 156;
            } else {
                i = (i3 * 156) / i2;
            }
            Log.m105919d("MicroMsg.AvatarStorage", "inJustDecodeBounds old [w:%d h:%d]  new [w:%d h:%d] corner:%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), 1);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inSampleSize = 1;
            wx02.mo93571t(str2, BitmapUtil.decodeFile(str, options), 156, 156, 1);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AvatarStorage", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public void cancel() {
        super.cancel();
        mo126949j1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r12, ob0.C11385n r13) {
        /*
            r11 = this;
            r11.f266863d = r13
            java.lang.String r13 = r11.f266864e
            r0 = -1
            java.lang.String r1 = "MicroMsg.NetSceneGetHDHeadImg"
            if (r13 == 0) goto L_0x01b5
            int r13 = r13.length()
            if (r13 != 0) goto L_0x0011
            goto L_0x01b5
        L_0x0011:
            java.lang.String r13 = r11.f266864e
            java.lang.String r2 = "@qqim"
            boolean r13 = r13.endsWith(r2)
            if (r13 == 0) goto L_0x0022
            java.lang.String r12 = "never try get qq user hd."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r0
        L_0x0022:
            com.tencent.mm.modelavatar.l r13 = com.tencent.p014mm.modelavatar.C68102u.yx0()
            com.tencent.mm.modelavatar.AvatarStorage r2 = com.tencent.p014mm.modelavatar.C68102u.wx0()
            java.lang.String r3 = r11.f266864e
            r4 = 1
            java.lang.String r2 = r2.mo93559h(r3, r4)
            r11.f266869j = r2
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0056
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "The HDAvatar of "
            r12.append(r13)
            java.lang.String r13 = r11.f266864e
            r12.append(r13)
            java.lang.String r13 = " is already exists"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return r3
        L_0x0056:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r11.f266869j
            r2.append(r5)
            java.lang.String r5 = ".tmp"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r11.f266870n = r2
            java.lang.String r2 = r11.f266864e
            com.tencent.mm.modelavatar.k r2 = r13.mo126947jo(r2)
            java.lang.String r5 = "hdheadimginfo"
            if (r2 != 0) goto L_0x009e
            java.lang.String r2 = r11.f266870n
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
            com.tencent.mm.modelavatar.k r2 = new com.tencent.mm.modelavatar.k
            r2.<init>()
            java.lang.String r6 = r11.f266864e
            r2.f266843a = r6
            java.lang.String r6 = r11.f266865f
            r2.f266846d = r6
            int r6 = r11.f266866g
            r2.f266844b = r6
            int r6 = r11.f266867h
            r2.f266845c = r6
            r2.f266854l = r0
            android.content.ContentValues r0 = r2.mo126946a()
            zh3.f r13 = r13.f266856d
            java.lang.String r6 = "username"
            r13.mo125627q(r5, r6, r0, r3)
            goto L_0x0108
        L_0x009e:
            java.lang.String r0 = r11.f266870n
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x00d2
            int r7 = r0.length()
            if (r7 != 0) goto L_0x00ab
            goto L_0x00d2
        L_0x00ab:
            java.lang.String r7 = r2.f266846d
            if (r7 != 0) goto L_0x00b0
            r7 = r6
        L_0x00b0:
            java.lang.String r8 = r11.f266865f
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00d2
            int r7 = r2.f266844b
            int r8 = r11.f266866g
            if (r7 != r8) goto L_0x00d2
            int r7 = r2.f266845c
            int r8 = r11.f266867h
            if (r7 == r8) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r0 = r2.f266848f
            long r9 = (long) r0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00d2
            r0 = 1
            goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = r11.f266870n
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            r2.f266847e = r3
            r2.f266848f = r3
            r2.f266849g = r3
            r2.f266850h = r6
            r2.f266851i = r6
            r2.f266852j = r3
            r2.f266853k = r3
            java.lang.String r0 = r11.f266864e
            r2.f266843a = r0
            java.lang.String r6 = r11.f266865f
            r2.f266846d = r6
            int r6 = r11.f266866g
            r2.f266844b = r6
            int r6 = r11.f266867h
            r2.f266845c = r6
            android.content.ContentValues r6 = r2.mo126946a()
            zh3.f r13 = r13.f266856d
            java.lang.String[] r7 = new java.lang.String[r4]
            r7[r3] = r0
            java.lang.String r0 = "username=?"
            r13.update(r5, r6, r0, r7)
        L_0x0108:
            ob0.c$b r13 = new ob0.c$b
            r13.<init>()
            te3.j12 r0 = new te3.j12
            r0.<init>()
            r13.f127066a = r0
            te3.k12 r0 = new te3.k12
            r0.<init>()
            r13.f127067b = r0
            java.lang.String r0 = "/cgi-bin/micromsg-bin/gethdheadimg"
            r13.f127068c = r0
            r0 = 158(0x9e, float:2.21E-43)
            r13.f127069d = r0
            r0 = 47
            r13.f127070e = r0
            r0 = 1000000047(0x3b9aca2f, float:0.004723809)
            r13.f127071f = r0
            ob0.c r13 = r13.mo72403a()
            ob0.c$c r0 = r13.f127055a
            pe3.a r0 = r0.f127080a
            te3.j12 r0 = (te3.C101790j12) r0
            java.lang.String r3 = r11.f266864e
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85811N4(r3)
            if (r3 != 0) goto L_0x0145
            java.lang.String r3 = r11.f266864e
            r0.f298443d = r3
            r0.f298449j = r4
            goto L_0x0172
        L_0x0145:
            java.lang.String r3 = r11.f266864e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r4.append(r5)
            java.lang.String r5 = "@bottle"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r3 = r3.equals(r4)
            r4 = 2
            if (r3 == 0) goto L_0x016c
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r0.f298443d = r3
            r0.f298449j = r4
            goto L_0x0172
        L_0x016c:
            java.lang.String r3 = r11.f266864e
            r0.f298443d = r3
            r0.f298449j = r4
        L_0x0172:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "inUser:"
            r3.append(r4)
            java.lang.String r4 = r11.f266864e
            r3.append(r4)
            java.lang.String r4 = " outUser:"
            r3.append(r4)
            java.lang.String r4 = r0.f298443d
            r3.append(r4)
            java.lang.String r4 = " outType:"
            r3.append(r4)
            int r4 = r0.f298449j
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            int r1 = r11.f266866g
            r0.f298444e = r1
            int r1 = r11.f266867h
            r0.f298445f = r1
            java.lang.String r1 = r11.f266865f
            r0.f298446g = r1
            int r1 = r2.f266847e
            r0.f298447h = r1
            int r1 = r2.f266848f
            r0.f298448i = r1
            int r12 = r11.dispatch(r12, r13, r11)
            return r12
        L_0x01b5:
            java.lang.String r12 = "username is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C92727q.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 158;
    }

    /* renamed from: j1 */
    public final void mo126949j1() {
        try {
            OutputStream outputStream = this.f266868i;
            if (outputStream != null) {
                outputStream.flush();
                this.f266868i.close();
                this.f266868i = null;
            }
        } catch (IOException e) {
            Log.m105921e("MicroMsg.NetSceneGetHDHeadImg", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r9, int r10, int r11, java.lang.String r12, com.tencent.p014mm.network.C114799u r13, byte[] r14) {
        /*
            r8 = this;
            r9 = r13
            ob0.c r9 = (ob0.C47350c) r9
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            te3.k12 r9 = (te3.C50066k12) r9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "errType:"
            r14.append(r0)
            r14.append(r10)
            java.lang.String r1 = " errCode:"
            r14.append(r1)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            java.lang.String r2 = "MicroMsg.NetSceneGetHDHeadImg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r14)
            r14 = 4
            if (r10 == r14) goto L_0x004d
            if (r11 == 0) goto L_0x004d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r10)
            r9.append(r1)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            ob0.n r9 = r8.f266863d
            r9.onSceneEnd(r10, r11, r12, r8)
            r8.mo126949j1()
            return
        L_0x004d:
            if (r10 == r14) goto L_0x0163
            r0 = 5
            if (r10 != r0) goto L_0x0054
            goto L_0x0163
        L_0x0054:
            qe3.w$e r13 = r13.getRespObj()
            int r13 = r13.getRetCode()
            r0 = -4
            r1 = 1
            r3 = 0
            if (r13 == r0) goto L_0x006c
            r0 = -54
            if (r13 == r0) goto L_0x006c
            r0 = -55
            if (r13 != r0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r13 = 0
            goto L_0x0082
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "retcode == "
            r0.append(r4)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            r13 = 1
        L_0x0082:
            if (r13 == 0) goto L_0x0092
            java.lang.String r9 = "handleCertainError"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            ob0.n r9 = r8.f266863d
            r9.onSceneEnd(r10, r11, r12, r8)
            r8.mo126949j1()
            return
        L_0x0092:
            te3.qv3 r13 = r9.f136506g
            r0 = -1
            if (r13 == 0) goto L_0x00be
            pe3.b r13 = r13.f140574f
            if (r13 == 0) goto L_0x00be
            byte[] r13 = r13.f257327a
            java.io.OutputStream r4 = r8.f266868i     // Catch:{ IOException -> 0x00b0 }
            if (r4 != 0) goto L_0x00a9
            java.lang.String r4 = r8.f266870n     // Catch:{ IOException -> 0x00b0 }
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r3)     // Catch:{ IOException -> 0x00b0 }
            r8.f266868i = r4     // Catch:{ IOException -> 0x00b0 }
        L_0x00a9:
            java.io.OutputStream r4 = r8.f266868i     // Catch:{ IOException -> 0x00b0 }
            r4.write(r13)     // Catch:{ IOException -> 0x00b0 }
            int r13 = r13.length
            goto L_0x00bf
        L_0x00b0:
            r13 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)
            r4[r3] = r13
            java.lang.String r13 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r13, r4)
        L_0x00be:
            r13 = -1
        L_0x00bf:
            if (r13 >= 0) goto L_0x00cf
            java.lang.String r9 = "appendBuf fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            ob0.n r9 = r8.f266863d
            r9.onSceneEnd(r10, r11, r12, r8)
            r8.mo126949j1()
            return
        L_0x00cf:
            com.tencent.mm.modelavatar.l r4 = com.tencent.p014mm.modelavatar.C68102u.yx0()
            java.lang.String r5 = r8.f266864e
            com.tencent.mm.modelavatar.k r5 = r4.mo126947jo(r5)
            if (r5 != 0) goto L_0x00e9
            java.lang.String r9 = "info == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            ob0.n r9 = r8.f266863d
            r9.onSceneEnd(r10, r11, r12, r8)
            r8.mo126949j1()
            return
        L_0x00e9:
            int r6 = r9.f136505f
            int r6 = r6 + r13
            r5.f266848f = r6
            int r9 = r9.f136504e
            r5.f266847e = r9
            java.lang.String r9 = r8.f266864e
            android.content.ContentValues r13 = r5.mo126946a()
            zh3.f r4 = r4.f266856d
            java.lang.String[] r6 = new java.lang.String[r1]
            r6[r3] = r9
            java.lang.String r9 = "hdheadimginfo"
            java.lang.String r7 = "username=?"
            r4.update(r9, r13, r7, r6)
            int r9 = r5.f266848f
            int r13 = r5.f266847e
            if (r9 < r13) goto L_0x010e
            r9 = 1
            goto L_0x010f
        L_0x010e:
            r9 = 0
        L_0x010f:
            if (r9 != 0) goto L_0x014c
            java.lang.Object[] r9 = new java.lang.Object[r14]
            int r10 = r8.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r3] = r10
            java.lang.String r10 = r8.f266864e
            r9[r1] = r10
            r10 = 2
            int r11 = r5.f266848f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            int r10 = r5.f266847e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 3
            r9[r11] = r10
            java.lang.String r10 = "%d doScene again info[%s %d %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r9)
            com.tencent.mm.network.g r9 = r8.dispatcher()
            ob0.n r10 = r8.f266863d
            int r9 = r8.doScene(r9, r10)
            if (r9 >= 0) goto L_0x014b
            ob0.n r9 = r8.f266863d
            java.lang.String r10 = ""
            r9.onSceneEnd(r11, r0, r10, r8)
        L_0x014b:
            return
        L_0x014c:
            java.lang.String r9 = r8.f266870n
            java.lang.String r13 = r8.f266869j
            com.tencent.p014mm.vfs.C86013q1.m106463x(r9, r13)
            java.lang.String r9 = r8.f266869j
            java.lang.String r13 = r8.f266864e
            m116894k1(r9, r13)
            r8.mo126949j1()
            ob0.n r9 = r8.f266863d
            r9.onSceneEnd(r10, r11, r12, r8)
            return
        L_0x0163:
            ob0.n r9 = r8.f266863d
            r9.onSceneEnd(r10, r11, r12, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "ErrType:"
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            r8.mo126949j1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C92727q.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        String str = this.f266864e;
        return (str == null || str.length() == 0) ? y$$d.EFailed : y$$d.EOk;
    }
}
