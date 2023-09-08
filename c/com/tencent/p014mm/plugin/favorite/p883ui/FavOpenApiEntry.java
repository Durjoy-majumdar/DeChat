package com.tencent.p014mm.plugin.favorite.p883ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVipInfo;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.base.stub.C68748c;
import com.tencent.p014mm.plugin.fav.p047ui.C93658i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C88989a;
import p272xq.C102712e;
import p823sg.C90193h;
import pb1.C100734q;
import pb1.C100745t;
import pb1.C100755z;
import qc0.C101093a;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C64719t23;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry */
public class FavOpenApiEntry extends MMActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f248191o = 0;

    /* renamed from: d */
    public Intent f248192d;

    /* renamed from: e */
    public Bundle f248193e;

    /* renamed from: f */
    public String f248194f;

    /* renamed from: g */
    public String f248195g;

    /* renamed from: h */
    public SendMessageToWX.Req f248196h;

    /* renamed from: i */
    public String f248197i;

    /* renamed from: j */
    public int f248198j = 0;

    /* renamed from: n */
    public MTimerHandler f248199n = new MTimerHandler(new C68936a(), true);

    /* renamed from: com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a */
    public class C68936a implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a$a */
        public class C68937a implements C68748c.C68750b {
            public C68937a() {
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cc, code lost:
                if (wd3.C78575u.m94944m(r1.mController, r2.title, r2.thumbData, r2.description, r1.f248195g, false, r1.f248197i, new sc1.C90169a(r1, r2)) != null) goto L_0x0237;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x01f7, code lost:
                if (wd3.C78575u.m94946o(r1.mController, r2.description, r1.f248194f.equals("wx4310bbd51be7d979") ? "" : r1.f248195g, false, r1.f248197i, new sc1.C90169a(r1, r2)) != null) goto L_0x0237;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo94586a(boolean r31) {
                /*
                    r30 = this;
                    r0 = r30
                    r1 = r31
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a r2 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.C68936a.this
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry r2 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.this
                    boolean r2 = r2.isFinishing()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "onCheckEnd, isPass = "
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r4 = ", isFinishing = "
                    r3.append(r4)
                    r3.append(r2)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "MicroMsg.FavOpenApiEntry"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                    r3 = 0
                    r5 = 1
                    if (r1 == 0) goto L_0x0243
                    if (r2 != 0) goto L_0x0243
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a r1 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.C68936a.this
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry r1 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.this
                    com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r2 = r1.f248196h
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage r2 = r2.message
                    r1.getClass()
                    if (r2 != 0) goto L_0x0044
                    java.lang.String r1 = "deal fail, WXMediaMessage is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                    goto L_0x0262
                L_0x0044:
                    int r6 = r2.getType()
                    r7 = 76
                    if (r6 == r7) goto L_0x01fa
                    switch(r6) {
                        case 1: goto L_0x01c4;
                        case 2: goto L_0x015c;
                        case 3: goto L_0x0110;
                        case 4: goto L_0x00d0;
                        case 5: goto L_0x00a7;
                        case 6: goto L_0x0066;
                        case 7: goto L_0x0238;
                        case 8: goto L_0x0238;
                        default: goto L_0x004f;
                    }
                L_0x004f:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "unknown type = "
                    r2.append(r5)
                    r2.append(r6)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
                    goto L_0x0238
                L_0x0066:
                    byte[] r9 = r2.thumbData
                    if (r9 == 0) goto L_0x0084
                    int r3 = r9.length
                    if (r3 <= 0) goto L_0x0084
                    com.tencent.mm.ui.MMActivityController r8 = r1.mController
                    java.lang.String r10 = r2.title
                    java.lang.String r11 = r2.description
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    java.lang.String r15 = r1.f248197i
                    sc1.a r3 = new sc1.a
                    r3.<init>(r1, r2)
                    r16 = r3
                    wd3.C78575u.m94953v(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    goto L_0x0237
                L_0x0084:
                    com.tencent.mm.ui.MMActivityController r3 = r1.mController
                    r17 = 2131755084(0x7f10004c, float:1.9141037E38)
                    java.lang.String r6 = r2.title
                    java.lang.String r7 = r2.description
                    r20 = 0
                    r21 = 0
                    java.lang.String r8 = r1.f248197i
                    sc1.a r9 = new sc1.a
                    r9.<init>(r1, r2)
                    r16 = r3
                    r18 = r6
                    r19 = r7
                    r22 = r8
                    r23 = r9
                    wd3.C78575u.m94951t(r16, r17, r18, r19, r20, r21, r22, r23)
                    goto L_0x0237
                L_0x00a7:
                    com.tencent.mm.ui.MMActivityController r6 = r1.mController
                    java.lang.String r7 = r2.title
                    byte[] r8 = r2.thumbData
                    java.lang.String r9 = r2.description
                    java.lang.String r10 = r1.f248195g
                    java.lang.String r11 = r1.f248197i
                    sc1.a r12 = new sc1.a
                    r12.<init>(r1, r2)
                    r27 = 0
                    r22 = r6
                    r23 = r7
                    r24 = r8
                    r25 = r9
                    r26 = r10
                    r28 = r11
                    r29 = r12
                    qo3.g r2 = wd3.C78575u.m94944m(r22, r23, r24, r25, r26, r27, r28, r29)
                    if (r2 == 0) goto L_0x0238
                    goto L_0x0237
                L_0x00d0:
                    byte[] r7 = r2.thumbData
                    if (r7 == 0) goto L_0x00ed
                    int r3 = r7.length
                    if (r3 <= 0) goto L_0x00ed
                    com.tencent.mm.ui.MMActivityController r6 = r1.mController
                    java.lang.String r8 = r2.title
                    java.lang.String r9 = r2.description
                    java.lang.String r10 = r1.f248195g
                    r11 = 0
                    r12 = 1
                    java.lang.String r13 = r1.f248197i
                    sc1.a r14 = new sc1.a
                    r14.<init>(r1, r2)
                    wd3.C78575u.m94953v(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    goto L_0x0237
                L_0x00ed:
                    com.tencent.mm.ui.MMActivityController r15 = r1.mController
                    r16 = 2131755116(0x7f10006c, float:1.9141102E38)
                    java.lang.String r3 = r2.title
                    java.lang.String r6 = r2.description
                    java.lang.String r7 = r1.f248195g
                    r20 = 0
                    java.lang.String r8 = r1.f248197i
                    sc1.a r9 = new sc1.a
                    r9.<init>(r1, r2)
                    r17 = r3
                    r18 = r6
                    r19 = r7
                    r21 = r8
                    r22 = r9
                    wd3.C78575u.m94951t(r15, r16, r17, r18, r19, r20, r21, r22)
                    goto L_0x0237
                L_0x0110:
                    byte[] r3 = r2.thumbData
                    if (r3 == 0) goto L_0x013d
                    int r6 = r3.length
                    if (r6 <= 0) goto L_0x013d
                    com.tencent.mm.ui.MMActivityController r6 = r1.mController
                    java.lang.String r7 = r2.title
                    java.lang.String r8 = r2.description
                    java.lang.String r9 = r1.f248195g
                    r26 = 0
                    r27 = 2
                    java.lang.String r10 = r1.f248197i
                    sc1.a r11 = new sc1.a
                    r11.<init>(r1, r2)
                    r21 = r6
                    r22 = r3
                    r23 = r7
                    r24 = r8
                    r25 = r9
                    r28 = r10
                    r29 = r11
                    wd3.C78575u.m94953v(r21, r22, r23, r24, r25, r26, r27, r28, r29)
                    goto L_0x0237
                L_0x013d:
                    com.tencent.mm.ui.MMActivityController r12 = r1.mController
                    r13 = 2131755090(0x7f100052, float:1.914105E38)
                    java.lang.String r14 = r2.title
                    java.lang.String r15 = r2.description
                    java.lang.String r3 = r1.f248195g
                    r17 = 0
                    java.lang.String r6 = r1.f248197i
                    sc1.a r7 = new sc1.a
                    r7.<init>(r1, r2)
                    r16 = r3
                    r18 = r6
                    r19 = r7
                    wd3.C78575u.m94951t(r12, r13, r14, r15, r16, r17, r18, r19)
                    goto L_0x0237
                L_0x015c:
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r6 = r2.mediaObject
                    com.tencent.mm.opensdk.modelmsg.WXImageObject r6 = (com.tencent.p014mm.opensdk.modelmsg.WXImageObject) r6
                    byte[] r7 = r6.imageData
                    if (r7 != 0) goto L_0x016e
                    java.lang.String r6 = r6.imagePath
                    boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
                    if (r6 != 0) goto L_0x016e
                    goto L_0x0238
                L_0x016e:
                    byte[] r8 = r2.thumbData
                    if (r8 == 0) goto L_0x0186
                    int r6 = r8.length
                    if (r6 <= 0) goto L_0x0186
                    com.tencent.mm.ui.MMActivityController r7 = r1.mController
                    java.lang.String r9 = r1.f248195g
                    r10 = 0
                    java.lang.String r11 = r1.f248197i
                    sc1.a r12 = new sc1.a
                    r12.<init>(r1, r2)
                    qo3.g r2 = wd3.C78575u.m94949r(r7, r8, r9, r10, r11, r12)
                    goto L_0x01ba
                L_0x0186:
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r6 = r2.mediaObject
                    com.tencent.mm.opensdk.modelmsg.WXImageObject r6 = (com.tencent.p014mm.opensdk.modelmsg.WXImageObject) r6
                    byte[] r8 = r6.imageData
                    if (r8 == 0) goto L_0x01a2
                    int r7 = r8.length
                    if (r7 <= 0) goto L_0x01a2
                    com.tencent.mm.ui.MMActivityController r7 = r1.mController
                    java.lang.String r9 = r1.f248195g
                    r10 = 0
                    java.lang.String r11 = r1.f248197i
                    sc1.a r12 = new sc1.a
                    r12.<init>(r1, r2)
                    qo3.g r2 = wd3.C78575u.m94949r(r7, r8, r9, r10, r11, r12)
                    goto L_0x01ba
                L_0x01a2:
                    com.tencent.mm.ui.MMActivityController r7 = r1.mController
                    java.lang.String r8 = r6.imagePath
                    java.lang.String r9 = r1.f248195g
                    r10 = 0
                    java.lang.String r11 = r1.f248197i
                    sc1.a r12 = new sc1.a
                    r12.<init>(r1, r2)
                    r6 = r7
                    r7 = r8
                    r8 = r9
                    r9 = r10
                    r10 = r11
                    r11 = r12
                    qo3.g r2 = wd3.C78575u.m94948q(r6, r7, r8, r9, r10, r11)
                L_0x01ba:
                    if (r2 != 0) goto L_0x0237
                    java.lang.String r2 = "showImgDialog fail, invalid argument"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
                    goto L_0x0238
                L_0x01c4:
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r6 = r2.mediaObject
                    com.tencent.mm.opensdk.modelmsg.WXTextObject r6 = (com.tencent.p014mm.opensdk.modelmsg.WXTextObject) r6
                    java.lang.String r6 = r6.text
                    boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                    if (r6 == 0) goto L_0x01d6
                    java.lang.String r2 = "dealText null!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
                    goto L_0x0238
                L_0x01d6:
                    java.lang.String r6 = r1.f248194f
                    java.lang.String r7 = "wx4310bbd51be7d979"
                    boolean r6 = r6.equals(r7)
                    if (r6 == 0) goto L_0x01e4
                    java.lang.String r6 = ""
                    goto L_0x01e6
                L_0x01e4:
                    java.lang.String r6 = r1.f248195g
                L_0x01e6:
                    r9 = r6
                    com.tencent.mm.ui.MMActivityController r7 = r1.mController
                    java.lang.String r8 = r2.description
                    r10 = 0
                    java.lang.String r11 = r1.f248197i
                    sc1.a r12 = new sc1.a
                    r12.<init>(r1, r2)
                    qo3.g r2 = wd3.C78575u.m94946o(r7, r8, r9, r10, r11, r12)
                    if (r2 == 0) goto L_0x0238
                    goto L_0x0237
                L_0x01fa:
                    byte[] r7 = r2.thumbData
                    if (r7 == 0) goto L_0x0216
                    int r3 = r7.length
                    if (r3 <= 0) goto L_0x0216
                    com.tencent.mm.ui.MMActivityController r6 = r1.mController
                    java.lang.String r8 = r2.title
                    java.lang.String r9 = r2.description
                    java.lang.String r10 = r1.f248195g
                    r11 = 0
                    r12 = 2
                    java.lang.String r13 = r1.f248197i
                    sc1.a r14 = new sc1.a
                    r14.<init>(r1, r2)
                    wd3.C78575u.m94953v(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                    goto L_0x0237
                L_0x0216:
                    com.tencent.mm.ui.MMActivityController r15 = r1.mController
                    r16 = 2131755090(0x7f100052, float:1.914105E38)
                    java.lang.String r3 = r2.title
                    java.lang.String r6 = r2.description
                    java.lang.String r7 = r1.f248195g
                    r20 = 0
                    java.lang.String r8 = r1.f248197i
                    sc1.a r9 = new sc1.a
                    r9.<init>(r1, r2)
                    r17 = r3
                    r18 = r6
                    r19 = r7
                    r21 = r8
                    r22 = r9
                    wd3.C78575u.m94951t(r15, r16, r17, r18, r19, r20, r21, r22)
                L_0x0237:
                    r3 = 1
                L_0x0238:
                    if (r3 != 0) goto L_0x0262
                    java.lang.String r2 = "deal fail, result is false finish()"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
                    r1.finish()
                    goto L_0x0262
                L_0x0243:
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a r1 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.C68936a.this
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry r1 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.this
                    android.content.Intent r1 = r1.getIntent()
                    android.os.Bundle r1 = r1.getExtras()
                    r2 = -3
                    com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r1 = com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84995a(r1, r2)
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a r2 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.C68936a.this
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry r2 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.this
                    com.tencent.p014mm.pluginsdk.model.app.ReportUtil.m84997c(r2, r1, r5, r3)
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry$a r1 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.C68936a.this
                    com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry r1 = com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.this
                    r1.finish()
                L_0x0262:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry.C68936a.C68937a.mo94586a(boolean):void");
            }
        }

        public C68936a() {
        }

        public boolean onTimerExpired() {
            if (FavOpenApiEntry.this.getWindow() == null || FavOpenApiEntry.this.getWindow().getDecorView() == null || FavOpenApiEntry.this.getWindow().getDecorView().getWindowToken() == null) {
                FavOpenApiEntry favOpenApiEntry = FavOpenApiEntry.this;
                int i = favOpenApiEntry.f248198j;
                if (i >= 10) {
                    return false;
                }
                favOpenApiEntry.f248198j = i + 1;
                return true;
            }
            FavOpenApiEntry favOpenApiEntry2 = FavOpenApiEntry.this;
            new C68748c(favOpenApiEntry2, favOpenApiEntry2.f248194f, favOpenApiEntry2.f248196h.openId, new C68937a()).mo94584a();
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo118222H7(WXMediaMessage wXMediaMessage, String str) {
        WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) wXMediaMessage.mediaObject;
        C100755z zVar = new C100755z();
        zVar.field_type = 21;
        mo118224J7(wXMediaMessage, zVar);
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141246U(wXMediaMessage.title);
        rc02.mo141265u(wXMediaMessage.description);
        mo118225K7(wXMediaMessage, rc02, zVar.field_type);
        rc02.mo141231E(true);
        rc02.mo141260p(zVar.field_type);
        rc02.mo141242Q(wXMusicVideoObject.musicUrl);
        rc02.mo141240O(wXMusicVideoObject.musicDataUrl);
        rc02.mo141235I(str);
        rc02.mo141236J(wXMusicVideoObject.songLyric);
        C64719t23 t232 = new C64719t23();
        t232.f185463h = wXMusicVideoObject.singerName;
        t232.f185464i = wXMusicVideoObject.albumName;
        t232.f185466n = wXMusicVideoObject.musicGenre;
        t232.f185467o = wXMusicVideoObject.issueDate;
        t232.f185468p = wXMusicVideoObject.identification;
        t232.f185469q = wXMusicVideoObject.duration;
        t232.f185471s = wXMusicVideoObject.musicOperationUrl;
        t232.f185465j = wXMediaMessage.messageExt;
        WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
        t232.f185470r = wXMusicVipInfo != null ? C101093a.m132484f(wXMusicVipInfo.musicId) : "";
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = wXMusicVideoObject.singerName;
        if (wXMusicVideoObject.musicVipInfo != null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.FavOpenApiEntry", "share music mv to fav, singerName:%s, musicVipInfo is valid:%b", objArr);
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299401C = t232;
        rc02.f299296c1 = sc02;
        zVar.field_favProto.f298618f.add(rc02);
        mo118226L7(zVar, wXMediaMessage);
        C93658i.m118346a(zVar);
    }

    /* renamed from: I7 */
    public final C101834rc0 mo118223I7(WXMediaMessage wXMediaMessage, String str, byte[] bArr, int i) {
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141246U(wXMediaMessage.title);
        rc02.mo141265u(wXMediaMessage.description);
        rc02.mo141260p(i);
        if (str != null) {
            rc02.f299284V = str;
            rc02.mo141261q(C86013q1.m106454o(str));
        } else {
            String f = C90193h.m112878f(bArr);
            if (bArr.length >= 256) {
                rc02.mo141270z(f);
            } else {
                byte[] bArr2 = new byte[256];
                System.arraycopy(bArr, 0, bArr2, 0, 256);
                rc02.mo141270z(C90193h.m112878f(bArr2));
            }
            rc02.mo141268x(f);
            rc02.mo141269y((long) bArr.length);
            String obj = rc02.toString();
            HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
            rc02.mo141257m(C100745t.m131892d(obj, i));
            C86013q1.m106440a(((C102712e) C86312j.m106911c(C102712e.class)).mo142091L2(rc02), bArr);
        }
        mo118225K7(wXMediaMessage, rc02, i);
        return rc02;
    }

    /* renamed from: J7 */
    public final void mo118224J7(WXMediaMessage wXMediaMessage, C100755z zVar) {
        zVar.field_sourceType = 4;
        zVar.field_favProto.mo141220r(wXMediaMessage.title);
        zVar.field_favProto.mo141212j(wXMediaMessage.description);
    }

    /* renamed from: K7 */
    public final void mo118225K7(WXMediaMessage wXMediaMessage, C101834rc0 rc02, int i) {
        byte[] bArr = wXMediaMessage.thumbData;
        if (bArr != null) {
            String f = C90193h.m112878f(bArr);
            rc02.mo141245T(f);
            byte[] bArr2 = wXMediaMessage.thumbData;
            if (bArr2.length >= 256) {
                rc02.mo141244S(f);
            } else {
                byte[] bArr3 = new byte[256];
                System.arraycopy(bArr2, 0, bArr3, 0, 256);
                rc02.mo141244S(C90193h.m112878f(bArr3));
            }
            if (Util.isNullOrNil(rc02.f299280T)) {
                String obj = rc02.toString();
                HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                rc02.mo141257m(C100745t.m131892d(obj, i));
            }
            rc02.mo141243R((long) wXMediaMessage.thumbData.length);
            C86013q1.m106440a(C100734q.m131826Q(rc02), wXMediaMessage.thumbData);
            return;
        }
        rc02.mo141232F(true);
    }

    /* renamed from: L7 */
    public final void mo118226L7(C100755z zVar, WXMediaMessage wXMediaMessage) {
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141272d(this.f248194f);
        rd02.mo141277m(4);
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        zVar.field_fromUser = rd02.f299348f;
        zVar.field_toUser = rd02.f299350h;
        zVar.field_favProto.mo141219q(rd02);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        getWindow().addFlags(67108864);
        if (this.f248192d == null) {
            this.f248192d = getIntent();
        }
        Bundle extras = this.f248192d.getExtras();
        this.f248193e = extras;
        String string = extras.getString("SendAppMessageWrapper_AppId");
        this.f248194f = string;
        if (string == null) {
            this.f248194f = Uri.parse(this.f248193e.getString(ConstantsAPI.CONTENT)).getQueryParameter("appid");
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req(this.f248193e);
        this.f248196h = req;
        if (req.scene != 2) {
            Log.m105920e("MicroMsg.FavOpenApiEntry", "scene not WXSceneFavorite!");
            finish();
            return;
        }
        this.f248197i = getString(C0966R.string.cmx);
        this.f248195g = getString(C0966R.string.bje, new Object[]{C100734q.m131876u(this, this.f248194f)});
        this.f248199n.startTimer(100);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f248192d = intent;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
