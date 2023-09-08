package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import cd0.C28532c;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.plugin.record.p094ui.FavSubRecordDetailUI;
import com.tencent.p014mm.plugin.record.p094ui.RecordMsgDetailUI;
import com.tencent.p014mm.pluginsdk.model.C96786l0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di0.C86299o;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import he0.C46021h;
import he0.C46025n;
import he0.C59837i;
import ht1.C60200t1;
import ie0.C46223m;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import ky2.C10432i;
import le3.C10499a;
import n60.C100075f;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import p248ug.C52570c0;
import p606mm.C99933h;
import p763ym.C79138l;
import pb1.C100734q;
import qc0.C101093a;
import qc0.C101106m;
import qh0.C62619a;
import sg2.C101617b;
import te3.C101755ad0;
import te3.C101760bd0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C101871zc0;
import te3.C51195s3;
import te3.C64258bf0;
import te3.C64311db1;
import te3.C64581nk1;
import te3.C64609ok1;
import te3.C64659qk1;
import te3.C64730tk1;
import te3.C90431pc0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper */
public class OtherViewWrapper implements C94356i.C94363d {

    /* renamed from: a */
    public int f272788a = 0;

    /* renamed from: b */
    public C94356i.C94359c f272789b;

    /* renamed from: c */
    public MMHandler f272790c;

    /* renamed from: d */
    public boolean f272791d = false;

    /* renamed from: e */
    public String f272792e;

    /* renamed from: f */
    public String f272793f;

    /* renamed from: g */
    public int f272794g = -1;

    /* renamed from: h */
    public String f272795h = "";

    /* renamed from: i */
    public int f272796i = 0;

    /* renamed from: j */
    public C100075f.C100076a f272797j = new C100075f.C100076a();

    /* renamed from: k */
    public View.OnClickListener f272798k = new OtherViewWrapper$$b(this);

    /* renamed from: l */
    public View.OnClickListener f272799l = new OtherViewWrapper$$c(this);

    /* renamed from: m */
    public IListener f272800m;

    /* renamed from: n */
    public IListener f272801n;

    public OtherViewWrapper(C94356i.C94359c cVar, MMHandler mMHandler) {
        C40008f fVar = C40008f.f107254d;
        this.f272800m = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                if (!(musicPlayerEvent instanceof MusicPlayerEvent)) {
                    return false;
                }
                int i = musicPlayerEvent.f9336d.f9337a;
                if (!(i == 0 || i == 1 || i == 2 || i == 3)) {
                    if (i == 4) {
                        Log.m105924i("MicroMsg.OtherViewWrapper", "musicPlayerListener error");
                        MMHandler mMHandler = OtherViewWrapper.this.f272790c;
                        mMHandler.sendMessageAtFrontOfQueue(mMHandler.obtainMessage(1));
                        OtherViewWrapper otherViewWrapper = OtherViewWrapper.this;
                        String string = MMApplicationContext.getContext().getString(C0966R.string.f361077h32);
                        otherViewWrapper.getClass();
                        C76912y0.m92767f(MMApplicationContext.getContext(), string);
                        return false;
                    } else if (i != 7) {
                        return false;
                    }
                }
                MMHandler mMHandler2 = OtherViewWrapper.this.f272790c;
                mMHandler2.sendMessageAtFrontOfQueue(mMHandler2.obtainMessage(1));
                return false;
            }
        };
        this.f272801n = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                Log.m105924i("MicroMsg.OtherViewWrapper", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.OtherViewWrapper", "musicCheckErrorListener, must has error.");
                    return false;
                }
                String string = !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : MMApplicationContext.getContext().getString(C0966R.string.f361077h32);
                OtherViewWrapper.this.getClass();
                C76912y0.m92767f(MMApplicationContext.getContext(), string);
                return false;
            }
        };
        this.f272789b = cVar;
        this.f272790c = mMHandler;
    }

    /* renamed from: c */
    public static void m119377c(OtherViewWrapper otherViewWrapper, View view, C101841sc0 sc02) {
        otherViewWrapper.getClass();
        if (view != null) {
            C101755ad0 ad02 = sc02.f299421w;
            if ((ad02 != null && ad02.f297848d >= 0) || sc02.f299422x != null) {
                int[] iArr = new int[2];
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationInWindow(iArr);
                C101755ad0 ad03 = sc02.f299421w;
                if (ad03 == null) {
                    ad03 = sc02.f299422x;
                }
                if (ad03 != null) {
                    C101760bd0 bd02 = new C101760bd0();
                    ad03.f297858q = bd02;
                    bd02.f297979d = iArr[0];
                    bd02.f297980e = iArr[1];
                    bd02.f297981f = width;
                    bd02.f297982g = height;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r2 = (r2 = r2.field_favProto).f298616d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m119378d(com.tencent.p014mm.plugin.record.p094ui.viewWrappers.OtherViewWrapper r23, android.content.Context r24, sg2.C101617b r25) {
        /*
            r1 = r24
            r0 = r25
            r23.getClass()
            te3.rc0 r2 = r0.f297464a
            java.lang.String r3 = "MicroMsg.OtherViewWrapper"
            if (r2 != 0) goto L_0x0018
            pb1.z r2 = r0.f297465b
            if (r2 != 0) goto L_0x0018
            java.lang.String r0 = "No valid data, null == recordData.dataItem && null == recordData.favItemInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x0201
        L_0x0018:
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            boolean r2 = r2.mo76822Vm()
            if (r2 != 0) goto L_0x0028
            goto L_0x0201
        L_0x0028:
            pb1.z r2 = r0.f297465b
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0039
            te3.kd0 r2 = r2.field_favProto
            if (r2 == 0) goto L_0x0039
            te3.rd0 r2 = r2.f298616d
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r2.f299362w
            goto L_0x003a
        L_0x0039:
            r2 = r4
        L_0x003a:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x004e
            te3.rc0 r5 = r0.f297464a
            if (r5 == 0) goto L_0x004e
            te3.sc0 r5 = r5.f299296c1
            if (r5 == 0) goto L_0x004e
            te3.tc0 r5 = r5.f299405d
            if (r5 == 0) goto L_0x004e
            java.lang.String r2 = r5.f299533w
        L_0x004e:
            r17 = r2
            te3.rc0 r2 = r0.f297464a
            if (r2 == 0) goto L_0x0201
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = pb1.C100734q.m131826Q(r2)
            r5.<init>((java.lang.String) r6)
            boolean r6 = r5.mo119967g()
            if (r6 != 0) goto L_0x0098
            java.lang.String r5 = r2.f299254G
            if (r5 != 0) goto L_0x0069
            r15 = r4
            goto L_0x009d
        L_0x0069:
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = pb1.C100734q.m131812C()
            r6.append(r7)
            java.lang.String r7 = r2.f299254G
            byte[] r7 = r7.getBytes()
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            boolean r6 = r5.mo119967g()
            if (r6 == 0) goto L_0x0096
            java.lang.String r5 = r5.mo119971i()
            goto L_0x009c
        L_0x0096:
            r5 = r4
            goto L_0x009c
        L_0x0098:
            java.lang.String r5 = r5.mo119971i()
        L_0x009c:
            r15 = r5
        L_0x009d:
            te3.sc0 r5 = r2.f299296c1
            if (r5 == 0) goto L_0x00a5
            te3.t23 r5 = r5.f299401C
            r13 = r5
            goto L_0x00a6
        L_0x00a5:
            r13 = 0
        L_0x00a6:
            java.lang.Class<pu.b> r5 = p652pu.C100910b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            pu.b r5 = (p652pu.C100910b) r5
            r6 = 0
            java.lang.String r8 = r2.f299297d
            java.lang.String r9 = r2.f299301f
            java.lang.String r10 = r2.f299242A
            java.lang.String r11 = r2.f299250E
            java.lang.String r12 = r2.f299246C
            java.lang.String r7 = r2.f299280T
            java.lang.String r16 = pb1.C100734q.m131809A()
            java.lang.String r14 = r2.f299280T
            qc0.o r19 = qc0.C62602o.m73561a(r14, r13)
            r14 = 0
            java.lang.String r20 = ""
            r21 = r7
            r7 = r14
            r14 = r13
            r13 = r21
            r22 = r14
            r14 = r16
            r16 = r20
            r18 = r19
            qc0.m r5 = r5.mo139948sL(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r6 = r2.f299251E1
            r5.f295976x = r6
            java.lang.String r6 = r2.f299255G1
            r5.f295969q = r6
            java.lang.String r6 = r2.f299280T
            r5.f295949J = r6
            r14 = r22
            if (r14 == 0) goto L_0x00ee
            java.lang.String r6 = r14.f185470r
            r5.f295954P = r6
        L_0x00ee:
            boolean r6 = pb1.C100734q.m131839b0(r2)
            if (r6 != 0) goto L_0x00fc
            java.lang.String r6 = " start play music"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            qc0.C101093a.m132488j(r5)
        L_0x00fc:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r6 = 6
            java.lang.String r7 = "key_scene"
            r5.putExtra(r7, r6)
            te3.rc0 r6 = r0.f297464a
            if (r6 == 0) goto L_0x01b0
            te3.sc0 r7 = r6.f299296c1
            if (r7 == 0) goto L_0x01b0
            te3.t23 r7 = r7.f299401C
            java.lang.String r8 = "key_mv_singer_name"
            if (r7 == 0) goto L_0x01a1
            java.lang.String r6 = r6.f299297d
            java.lang.String r9 = "key_mv_song_name"
            r5.putExtra(r9, r6)
            te3.rc0 r6 = r0.f297464a
            java.lang.String r6 = r6.f299255G1
            java.lang.String r9 = "key_mv_song_lyric"
            r5.putExtra(r9, r6)
            java.lang.String r6 = r7.f185470r
            java.lang.String r9 = "key_mv_song_mid"
            r5.putExtra(r9, r6)
            te3.rc0 r0 = r0.f297464a
            java.lang.String r0 = r0.f299251E1
            java.lang.String r6 = "key_mv_album_cover_url"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185459d
            java.lang.String r6 = "key_mv_feed_id"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185460e
            java.lang.String r6 = "key_mv_nonce_id"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185461f
            java.lang.String r6 = "key_mv_cover_url"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185462g
            java.lang.String r6 = "key_mv_poster"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185463h
            r5.putExtra(r8, r0)
            java.lang.String r0 = r7.f185464i
            java.lang.String r6 = "key_mv_album_name"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185466n
            java.lang.String r6 = "key_mv_music_genre"
            r5.putExtra(r6, r0)
            long r10 = r7.f185467o
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r6 = "key_mv_issue_date"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185468p
            java.lang.String r6 = "key_mv_identification"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185465j
            java.lang.String r6 = "key_mv_extra_info"
            r5.putExtra(r6, r0)
            int r0 = r7.f185469q
            java.lang.String r6 = "key_mv_music_duration"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185471s
            java.lang.String r6 = "key_mv_music_operation_url"
            r5.putExtra(r6, r0)
            java.lang.String r0 = r7.f185470r
            r5.putExtra(r9, r0)
        L_0x01a1:
            if (r7 == 0) goto L_0x01b0
            java.lang.String r0 = r7.f185463h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = r2.f299301f
            r5.putExtra(r8, r0)
        L_0x01b0:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            java.lang.Class<ox.b> r0 = p640ox.C77049b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ox.b r0 = (p640ox.C77049b) r0
            r2 = 7
            java.lang.Class<te3.w23> r6 = te3.C64793w23.class
            java.lang.String r7 = "MusicMvMainUI"
            pe3.a r0 = r0.mo72357nb(r1, r7, r2, r6)
            te3.w23 r0 = (te3.C64793w23) r0
            r2 = 16
            r0.f186033d = r2
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r2, r6)
            r0.f186034e = r2
            r2 = 84
            r0.f186035f = r2
            r2 = r23
            java.lang.String r2 = r2.f272792e
            r0.f186036g = r2
            java.lang.String r2 = "key_mv_report_data"
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x01f1 }
            r5.putExtra(r2, r0)     // Catch:{ IOException -> 0x01f1 }
            goto L_0x01f8
        L_0x01f1:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
        L_0x01f8:
            java.lang.String r0 = "mv"
            java.lang.String r2 = ".ui.MusicMvMainUI"
            r3 = 0
            ke3.C88144b.m109791i(r1, r0, r2, r5, r3)
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.viewWrappers.OtherViewWrapper.m119378d(com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper, android.content.Context, sg2.b):void");
    }

    /* renamed from: e */
    public static void m119379e(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        Intent intent = new Intent();
        if (Util.isNullOrNil(bVar.f297464a.f299242A)) {
            Log.m105929w("MicroMsg.OtherViewWrapper", "go to music[webpage], web url is null, use data url instead, dataid[%s]", bVar.f297464a.f299280T);
            intent.putExtra("rawUrl", bVar.f297464a.f299246C);
        } else {
            intent.putExtra("rawUrl", bVar.f297464a.f299242A);
        }
        if (bVar.f297468e == 1) {
            intent.putExtra("is_favorite_item", true);
            intent.putExtra("fav_local_id", bVar.f297465b.field_localId);
            intent.putExtra("key_detail_can_delete", false);
            Bundle a = C28532c.m38234a(C96786l0.class.getName());
            a.putInt("mm_rpt_fav_id", bVar.f297465b.field_id);
            intent.putExtra("mm_report_bundle", a);
            Log.m105919d("MicroMsg.OtherViewWrapper", "start music webview, fav id %d, fav local id %d, data id %s", Integer.valueOf(bVar.f297465b.field_id), Long.valueOf(bVar.f297465b.field_localId), bVar.f297464a.f299280T);
        }
        intent.putExtra("key_enable_teen_mode_check", true);
        C88144b.m109795m(context, "webview", ".ui.tools.WebViewUI", intent, 1);
    }

    /* renamed from: f */
    public static void m119380f(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        C101834rc0 rc02 = bVar.f297464a;
        C101841sc0 sc02 = rc02.f299296c1;
        if (sc02 == null || sc02.f299408g == null) {
            Log.m105929w("MicroMsg.OtherViewWrapper", "go to product error, get data proto item null, dataid[%s]", rc02.f299280T);
            C76879j.m92726T(context, context.getString(C0966R.string.cqc));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_Product_xml", bVar.f297464a.f299296c1.f299408g.f298517j);
        if (bVar.f297468e == 1) {
            intent.putExtra("key_is_favorite_item", true);
            intent.putExtra("key_favorite_local_id", bVar.f297465b.field_localId);
            intent.putExtra("key_can_delete_favorite_item", false);
            intent.putExtra("key_ProductUI_getProductInfoScene", 3);
        }
        C88144b.m109795m(context, "scanner", ".ui.ProductUI", intent, 1);
    }

    /* renamed from: g */
    public static void m119381g(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        C101834rc0 rc02 = bVar.f297464a;
        C101841sc0 sc02 = rc02.f299296c1;
        if (sc02 == null || sc02.f299408g == null) {
            Log.m105929w("MicroMsg.OtherViewWrapper", "go to mall product error, get data proto item null, dataid[%s]", rc02.f299280T);
            C76879j.m92726T(context, context.getString(C0966R.string.cqc));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_product_info", bVar.f297464a.f299296c1.f299408g.f298517j);
        if (bVar.f297468e == 1) {
            intent.putExtra("key_product_scene", 4);
        }
        C88144b.m109795m(context, "product", ".ui.MallProductUI", intent, 1);
    }

    /* renamed from: h */
    public static void m119382h(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        C101834rc0 rc02 = bVar.f297464a;
        C101841sc0 sc02 = rc02.f299296c1;
        if (sc02 == null || sc02.f299409h == null) {
            Log.m105929w("MicroMsg.OtherViewWrapper", "go to tv error, get data proto item null, dataid[%s]", rc02.f299280T);
            C76879j.m92726T(context, context.getString(C0966R.string.cqc));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("key_TV_getProductInfoScene", 3);
        intent.putExtra("key_TV_xml", bVar.f297464a.f299296c1.f299409h.f299624j);
        if (bVar.f297468e == 1) {
            intent.putExtra("key_is_favorite_item", true);
            intent.putExtra("key_favorite_local_id", bVar.f297465b.field_localId);
            intent.putExtra("key_can_delete_favorite_item", false);
        }
        C88144b.m109795m(context, "shake", ".ui.TVInfoUI", intent, 1);
    }

    /* renamed from: i */
    public static void m119383i(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        Class cls = C52570c0.class;
        Class cls2 = C10432i.class;
        C101834rc0 rc02 = bVar.f297464a;
        int i = 1;
        if (rc02.f299296c1 == null) {
            Log.m105929w("MicroMsg.OtherViewWrapper", "go to friend card error, get data proto item null, dataid[%s]", rc02.f299280T);
            C76879j.m92726T(context, context.getString(C0966R.string.cqc));
            return;
        }
        C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(rc02.f299301f);
        if (C45628s0.m50738C(Rv0.f212675a)) {
            if (WeChatBrands.Business.Entries.SessionOa.checkAvailable(context)) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(Rv0.f212675a);
                if (((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
                    int fd = ((C10432i) C86312j.m106911c(cls2)).mo10751fd();
                    boolean U5 = C72996z1.m85820U5(Rv0.f212675a);
                    if (fd == 0 && !z1Var.mo62927s3()) {
                        ((C10432i) C86312j.m106911c(cls2)).mo10755m4(context);
                        C52570c0 c0Var = (C52570c0) C86709a0.m107533q(cls);
                        if (U5) {
                            i = 2;
                        }
                        c0Var.n80(i, Rv0.f212675a, Rv0.f212676b);
                        return;
                    } else if (fd == 2) {
                        ((C10432i) C86312j.m106911c(cls2)).mo10755m4(context);
                        C52570c0 c0Var2 = (C52570c0) C86709a0.m107533q(cls);
                        if (U5) {
                            i = 2;
                        }
                        c0Var2.n80(i, Rv0.f212675a, Rv0.f212676b);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", Rv0.f212675a);
        intent.putExtra("Contact_Alias", Rv0.f212677c);
        intent.putExtra("Contact_Nick", Rv0.f212676b);
        intent.putExtra("Contact_QuanPin", Rv0.f212678d);
        intent.putExtra("Contact_PyInitial", Rv0.f212679e);
        intent.putExtra("Contact_Uin", Rv0.f212684j);
        intent.putExtra("Contact_Mobile_MD5", Rv0.f212682h);
        intent.putExtra("Contact_full_Mobile_MD5", Rv0.f212683i);
        intent.putExtra("Contact_QQNick", Rv0.mo101028e());
        intent.putExtra("User_From_Fmessage", false);
        intent.putExtra("Contact_Scene", Rv0.f212681g);
        intent.putExtra("Contact_FMessageCard", true);
        intent.putExtra("Contact_RemarkName", Rv0.f212686l);
        intent.putExtra("Contact_VUser_Info_Flag", Rv0.f212691q);
        intent.putExtra("Contact_VUser_Info", Rv0.f212692r);
        intent.putExtra("Contact_BrandIconURL", Rv0.f212693s);
        intent.putExtra("Contact_Province", Rv0.mo101027d());
        intent.putExtra("Contact_City", Rv0.mo101024a());
        intent.putExtra("Contact_Sex", Rv0.f212689o);
        intent.putExtra("Contact_Signature", Rv0.f212690p);
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_KSnsIFlag", 0);
        otherViewWrapper.mo129773v(context, intent);
        C88144b.m109795m(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
        C10499a.m10432a(Rv0.f212681g);
    }

    /* renamed from: j */
    public static void m119384j(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        C46223m Rm = ((C46021h) C86312j.m106911c(C46021h.class)).mo71455Rm(bVar.f297464a.f299301f);
        if (Rm == null) {
            Log.m105929w("MicroMsg.OtherViewWrapper", "go to kefu card error, desc: %s", bVar.f297464a.f299301f);
            C76879j.m92726T(context, context.getString(C0966R.string.cqc));
            return;
        }
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f108515d = context;
        openIMKefuStartConversationRequest.f108517f = 2;
        openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(2);
        openIMKefuStartConversationRequest.f108527s = true;
        openIMKefuStartConversationRequest.f108524p = true;
        openIMKefuStartConversationRequest.f108526r = true;
        openIMKefuStartConversationRequest.f108522n = true;
        openIMKefuStartConversationRequest.f108523o = context.getString(C0966R.string.hfd);
        C51195s3 s3Var = new C51195s3();
        openIMKefuStartConversationRequest.f108520i = s3Var;
        s3Var.f141287f = Rm.f124602g;
        s3Var.f141289h = Rm.f124596a;
        openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
        ((C59837i) C86312j.m106911c(C59837i.class)).mo71855jT(openIMKefuStartConversationRequest);
    }

    /* renamed from: k */
    public static void m119385k(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        otherViewWrapper.getClass();
        if (context != null) {
            int i = bVar.f297468e;
            if (i == 0) {
                if (bVar.f297464a.f299326s1 != null) {
                    Intent intent = new Intent(context, RecordMsgDetailUI.class);
                    intent.putExtra("message_id", bVar.f297466c);
                    intent.putExtra("record_xml", bVar.f297464a.f299326s1);
                    intent.putExtra("record_nest", true);
                    intent.putExtra("from_scene", otherViewWrapper.f272796i);
                    otherViewWrapper.mo129773v(context, intent);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecord", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecord", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (i == 1) {
                C101834rc0 rc02 = bVar.f297464a;
                if (rc02.f299326s1 != null && rc02.f299275Q1 != null && C100734q.m131843d0()) {
                    Intent intent2 = new Intent(context, FavSubRecordDetailUI.class);
                    intent2.putExtra("key_detail_info_id", bVar.f297465b.field_localId);
                    intent2.putExtra("from_scene", bVar.f297469f);
                    intent2.putExtra("record_xml", bVar.f297464a.f299326s1);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecord", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToRecord", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    /* renamed from: l */
    public static void m119386l(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        C101841sc0 sc02;
        C90431pc0 pc02;
        String str;
        Intent intent;
        otherViewWrapper.getClass();
        if (context != null && (sc02 = bVar.f297464a.f299296c1) != null && (pc02 = sc02.f299420v) != null) {
            int i = otherViewWrapper.f272794g;
            String str2 = otherViewWrapper.f272795h;
            C86299o oVar = new C86299o();
            oVar.f250939k = 1096;
            C101846tc0 tc02 = sc02.f299405d;
            if (tc02 != null) {
                oVar.f250940l = tc02.f299519f;
            }
            oVar.f250929a = pc02.f259741d;
            oVar.f250934f = pc02.f259746i;
            oVar.f250931c = pc02.f259743f;
            int i2 = -1;
            oVar.f250932d = -1;
            oVar.f250930b = pc02.f259742e;
            oVar.f250921J = i;
            if (i != -1 && !TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(oVar.f250940l)) {
                    oVar.f250940l += XVFSFile.PATH_SEPARATOR;
                }
                oVar.f250940l += i + XVFSFile.PATH_SEPARATOR + str2;
            }
            String str3 = null;
            if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
                str = null;
            } else {
                i2 = intent.getIntExtra("preChatTYPE", 2);
                str3 = intent.getStringExtra("preUsername");
                str = intent.getStringExtra("preChatName");
            }
            int i3 = i2 != 1 ? i2 != 2 ? i2 != 15 ? 0 : 5 : 2 : 1;
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f239396d = 6;
            appBrandLaunchReferrer.f239400h = pc02.f259751q;
            oVar.f250941m = i3;
            oVar.f250942n = String.format("%s:%s", new Object[]{str3, str});
            oVar.f250947s = appBrandLaunchReferrer;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        }
    }

    /* renamed from: m */
    public static void m119387m(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        OtherViewWrapper otherViewWrapper2 = otherViewWrapper;
        Context context2 = context;
        C101617b bVar2 = bVar;
        otherViewWrapper.getClass();
        Class cls = C99933h.class;
        if (context2 != null) {
            int i = bVar2.f297468e;
            if (i == 0) {
                if (bVar2.f297464a.f299326s1 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("message_id", bVar2.f297466c);
                    intent.putExtra("message_user_name", bVar2.f297471h);
                    intent.putExtra("record_xml", bVar2.f297464a.f299326s1);
                    intent.putExtra("record_nest", true);
                    intent.setClassName(context2, "com.tencent.mm.plugin.album.ui.AlbumGridUI");
                    intent.putExtra("album_enter_from_scene", 6);
                    intent.putExtra("record_data_id", bVar2.f297464a.f299280T);
                    otherViewWrapper2.mo129773v(context2, intent);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToAlbum", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToAlbum", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C62619a aVar2 = new C62619a();
                    aVar2.f177833h = 6;
                    ((C99933h) C86312j.m106911c(cls)).mo84399BM(18, "album_enter_from_scene", aVar2, new OtherViewWrapper$$a());
                }
            } else if (i == 1 && bVar2.f297464a.f299326s1 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("message_id", bVar2.f297466c);
                intent2.putExtra("message_user_name", bVar2.f297471h);
                intent2.putExtra("record_xml", bVar2.f297464a.f299326s1);
                intent2.putExtra("record_nest", true);
                intent2.setClassName(context2, "com.tencent.mm.plugin.album.ui.AlbumGridUI");
                intent2.putExtra("album_enter_from_scene", 5);
                otherViewWrapper2.mo129773v(context2, intent2);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent2);
                C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToAlbum", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "goToAlbum", "(Landroid/content/Context;Lcom/tencent/mm/plugin/record/ui/recordData/RecordData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C62619a aVar4 = new C62619a();
                aVar4.f177833h = 5;
                ((C99933h) C86312j.m106911c(cls)).mo84399BM(18, "album_enter_from_scene", aVar4, new OtherViewWrapper$$a());
            }
        }
    }

    /* renamed from: n */
    public static void m119388n(Context context, C72963f4 f4Var, C64730tk1 tk12) {
        C64258bf0 bf02;
        Class cls = C60200t1.class;
        Intent intent = new Intent();
        intent.putExtra("key_topic_title", tk12.f185603d);
        intent.putExtra("key_topic_type", tk12.f185604e);
        int i = tk12.f185604e;
        if (i == 4) {
            intent.putExtra("KEY_FOLLOW_ID", tk12.f185608i);
        } else if (i == 7 && (bf02 = tk12.f185609j) != null) {
            intent.putExtra("key_activity_name", bf02.f182281e);
            intent.putExtra("key_activity_id", C61926c.m72671P(tk12.f185609j.f182280d));
            intent.putExtra("key_nick_name", tk12.f185609j.f182282f);
            intent.putExtra("key_cover_url", tk12.f185605f);
            intent.putExtra("key_display_mask", tk12.f185609j.f182284h);
        }
        C64311db1 db12 = new C64311db1();
        C64609ok1 ok12 = tk12.f185607h;
        if (ok12 != null) {
            db12.f182666i = ok12.f184668d;
            db12.f182661d = ok12.f184669e;
            db12.f182662e = ok12.f184670f;
            try {
                intent.putExtra("key_topic_poi_location", db12.toByteArray());
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.OtherViewWrapper", "location toByteArray exception");
            }
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", f4Var.mo108768t());
        intent.putExtra("key_report_scene", C72996z1.m85820U5(f4Var.mo108768t()) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        int i2 = 22;
        if (tk12.f185604e == 7) {
            i2 = 59;
        }
        intent.putExtra("key_activity_profile_src_type", "3");
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(C72996z1.m85820U5(f4Var.mo108768t()) ? 3 : 2, 2, i2, intent);
        ((C60200t1) C86312j.m106911c(cls)).cl0(context, intent, 4);
    }

    /* renamed from: o */
    public static void m119389o(Context context, C72963f4 f4Var, C64730tk1 tk12) {
        Class cls = C60200t1.class;
        Intent intent = new Intent();
        intent.putExtra("key_topic_title", tk12.f185603d);
        intent.putExtra("key_topic_type", tk12.f185604e);
        if (tk12.f185604e == 4) {
            intent.putExtra("KEY_FOLLOW_ID", tk12.f185608i);
        }
        C64311db1 db12 = new C64311db1();
        C64609ok1 ok12 = tk12.f185607h;
        db12.f182666i = ok12.f184668d;
        db12.f182661d = ok12.f184669e;
        db12.f182662e = ok12.f184670f;
        try {
            intent.putExtra("key_topic_poi_location", db12.toByteArray());
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.OtherViewWrapper", "location toByteArray exception");
        }
        intent.putExtra("key_from_user", f4Var.mo108768t());
        intent.putExtra("key_report_scene", C72996z1.m85820U5(f4Var.mo108768t()) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        int i = tk12.f185604e;
        int i2 = 22;
        if (i != 1) {
            if (i == 2) {
                i2 = 26;
            } else if (i == 4) {
                i2 = 49;
            }
        }
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(C72996z1.m85820U5(f4Var.mo108768t()) ? 3 : 2, 2, i2, intent);
        ((C60200t1) C86312j.m106911c(cls)).yt0(context, intent);
    }

    /* renamed from: p */
    public static void m119390p(Context context, C72963f4 f4Var, C64659qk1 qk12) {
        Class cls = C60200t1.class;
        String content = f4Var.getContent();
        if ((content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null) != null && qk12 != null && !Util.isNullOrNil(qk12.f185045d)) {
            Intent intent = new Intent();
            int i = 2;
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                intent.putExtra("key_finder_teen_mode_scene", 2);
                intent.putExtra("report_scene", 2);
            } else {
                intent.putExtra("key_finder_teen_mode_scene", 1);
                intent.putExtra("report_scene", 1);
            }
            C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                i = 3;
            }
            t1Var.mo76842e7(i, 3, 32, intent);
            intent.putExtra("key_enter_profile_type", 4);
            intent.putExtra("key_from_comment_scene", 11);
            intent.putExtra("from_user", f4Var.mo108768t());
            intent.putExtra("finder_username", qk12.f185045d);
            intent.putExtra("key_finder_teen_mode_check", true);
            intent.putExtra("key_finder_teen_mode_user_name", qk12.f185046e);
            intent.putExtra("key_finder_teen_mode_user_id", qk12.f185045d);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
        }
    }

    /* renamed from: q */
    public static void m119391q(Context context, C72963f4 f4Var, C64581nk1 nk12) {
        Intent intent = new Intent();
        intent.putExtra("TITLE_WORDING", nk12.f184476e);
        int i = 1;
        intent.putExtra("AUTO_REFRESH", true);
        try {
            intent.putExtra("FINDER_SHARE_ALBUM", nk12.toByteArray());
        } catch (IOException unused) {
        }
        intent.putExtra("GET_REL_SCENE", 14);
        intent.putExtra("STREAM_CARD_BUFFER", nk12.f184480i.mo123703f());
        intent.putExtra("COMMENT_SCENE", 51);
        intent.putExtra("CARD_ID", C102236a0.m134706B0(nk12.f184475d));
        intent.putExtra("SHARED_USERNAME", f4Var.mo108768t());
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            i = 2;
        }
        intent.putExtra("FROM_SHARE_SCENE", i);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).dk0(context, intent);
    }

    /* renamed from: r */
    public static void m119392r(OtherViewWrapper otherViewWrapper, Context context, C101617b bVar) {
        C101871zc0 zc02;
        C101846tc0 tc02;
        otherViewWrapper.getClass();
        Class cls = C75339i.class;
        if (context != null) {
            C101841sc0 sc02 = bVar.f297464a.f299296c1;
            String str = null;
            if (sc02 != null) {
                zc02 = sc02.f299406e;
                tc02 = sc02.f299405d;
            } else {
                tc02 = null;
                zc02 = null;
            }
            if (tc02 != null) {
                str = !Util.isNullOrNil(tc02.f299525o) ? ((C75339i) C86312j.m106911c(cls)).getDisplayName(tc02.f299525o) : ((C75339i) C86312j.m106911c(cls)).getDisplayName(tc02.f299519f);
            }
            if (tc02 == null && bVar.f297468e == 1) {
                str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(bVar.f297465b.field_fromUser);
            }
            if (zc02 == null) {
                Log.m105929w("MicroMsg.OtherViewWrapper", "go to location error, locItem null, dataid[%s]", bVar.f297464a.f299280T);
                C76879j.m92726T(context, context.getString(C0966R.string.cqd));
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("kwebmap_slat", zc02.f299952f);
            intent.putExtra("kwebmap_lng", zc02.f299950d);
            intent.putExtra("kPoiName", zc02.f299958o);
            intent.putExtra("Kwebmap_locaion", zc02.f299956j);
            intent.putExtra("kPoiid", zc02.f299960q);
            intent.putExtra("KIsFromPoiList", zc02.f299944A);
            intent.putExtra("KPoiCategoryTips", zc02.f299962s);
            intent.putExtra("kPoiBusinessHour", zc02.f299964u);
            intent.putExtra("KPoiPhone", zc02.f299966w);
            intent.putExtra("KPoiPriceTips", zc02.f299968y);
            intent.putExtra("kBuildingID", zc02.f299946C);
            intent.putExtra("kFloorName", zc02.f299948E);
            int i = zc02.f299954h;
            if (i >= 0) {
                intent.putExtra("kwebmap_scale", i);
            }
            intent.putExtra("kisUsername", str);
            intent.putExtra("kwebmap_from_to", true);
            int i2 = bVar.f297468e;
            if (i2 == 1) {
                intent.putExtra("KFavLocSigleView", true);
                intent.putExtra("map_view_type", 2);
                intent.putExtra("kFavInfoLocalId", bVar.f297465b.field_localId);
                intent.putExtra("kFavCanDel", false);
                intent.putExtra("kFavCanRemark", false);
                C88144b.m109795m(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 1);
            } else if (i2 == 0) {
                intent.putExtra("map_view_type", 1);
                intent.putExtra("map_indoor_support", 1);
                C88144b.m109795m(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 1002);
            }
        }
    }

    /* renamed from: u */
    public static boolean m119393u(C101834rc0 rc02) {
        C101106m b = C101093a.m132480b();
        return b != null && b.f295959d == 6 && Util.nullAs(rc02.f299280T, "").equals(b.f295960e) && C101093a.m132481c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0837, code lost:
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0c13, code lost:
        r9.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0c18, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0449, code lost:
        if (pb1.C100734q.m131837a0() == false) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x044b, code lost:
        r3 = new k20.C9556a();
        r3.mo10233c(8);
        r16 = r15;
        j20.C117292a.m165358d(r16, r3.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r15.setVisibility(((java.lang.Integer) r3.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r16, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r3 = new k20.C9556a();
        r3.mo10233c(0);
        r16 = r1;
        j20.C117292a.m165358d(r16, r3.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1.setVisibility(((java.lang.Integer) r3.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r16, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x04c4, code lost:
        r3 = r2.f297464a;
        r6 = r3.f299296c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x04c8, code lost:
        if (r6 == null) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x04ca, code lost:
        r6 = r6.f299402D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x04cc, code lost:
        if (r6 == null) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x04ce, code lost:
        r4.setText(com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r3.f299297d));
        r4.setVisibility(0);
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x04e6, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6.f185605f) != false) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04e8, code lost:
        r3 = k60.C99101e.f290571b;
        r6 = r6.f185605f;
        r8 = r0.f272797j;
        r8.f293176b = true;
        r8.f293175a = true;
        r3.mo85957c(r6, r7, r8.mo139398a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x04fa, code lost:
        r12.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0503, code lost:
        if (pb1.C100734q.m131837a0() == false) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0505, code lost:
        r2 = new k20.C9556a();
        r2.mo10233c(8);
        r16 = r15;
        j20.C117292a.m165358d(r16, r2.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r15.setVisibility(((java.lang.Integer) r2.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r16, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r2 = new k20.C9556a();
        r2.mo10233c(0);
        r16 = r1;
        j20.C117292a.m165358d(r16, r2.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1.setVisibility(((java.lang.Integer) r2.mo10231a(0)).intValue());
        j20.C117292a.m165359e(r16, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper", "fillView", "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x057f, code lost:
        r1 = r2.f297464a;
        r2 = r1.f299296c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0583, code lost:
        if (r2 == null) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0585, code lost:
        r2 = r2.f299399A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0587, code lost:
        if (r2 == null) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0589, code lost:
        r4.setText(com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r1.f299297d));
        r4.setVisibility(0);
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x05a1, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2.f185047f) != false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x05a3, code lost:
        r1 = k60.C99101e.f290571b;
        r2 = r2.f185047f;
        r3 = r0.f272797j;
        r3.f293176b = true;
        r3.f293175a = true;
        r1.mo85957c(r2, r7, r3.mo139398a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x05b5, code lost:
        r12.setVisibility(8);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129755a(android.view.View r27, int r28, sg2.C101617b r29, java.lang.Object r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r29
            java.lang.Class<ln.f> r3 = p196ln.C76705f.class
            r4 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131314211(0x7f094623, float:1.824684E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131306160(0x7f0926b0, float:1.8230511E38)
            android.view.View r7 = r1.findViewById(r7)
            com.tencent.mm.ui.MMImageView r7 = (com.tencent.p014mm.p136ui.MMImageView) r7
            r8 = 2131311977(0x7f093d69, float:1.824231E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r9 = 2131296764(0x7f0901fc, float:1.8211454E38)
            android.view.View r9 = r1.findViewById(r9)
            com.tencent.mm.plugin.record.ui.view.RecordAlbumContainer r9 = (com.tencent.p014mm.plugin.record.p094ui.view.RecordAlbumContainer) r9
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.setVisibility(r10)
            r8.setVisibility(r10)
            r12 = 2131306218(0x7f0926ea, float:1.8230629E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r13 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r12.setVisibility(r13)
            r15 = 2131311985(0x7f093d71, float:1.8242326E38)
            android.view.View r15 = r1.findViewById(r15)
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r13.mo10233c(r11)
            java.lang.Object[] r17 = r13.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r13 = r13.mo10231a(r10)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r15.setVisibility(r13)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r15.setTag(r2)
            android.view.View$OnClickListener r13 = r0.f272798k
            r15.setOnClickListener(r13)
            r13 = 2131315951(0x7f094cef, float:1.825037E38)
            android.view.View r1 = r1.findViewById(r13)
            k20.a r13 = new k20.a
            r13.<init>()
            r13.mo10233c(r14)
            java.lang.Object[] r17 = r13.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r13 = r13.mo10231a(r10)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r1.setVisibility(r13)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r13 = 8
            r9.setVisibility(r13)
            com.tencent.mm.plugin.record.ui.i$c$a r13 = new com.tencent.mm.plugin.record.ui.i$c$a
            r13.<init>()
            int r10 = r2.f297468e
            r24 = r6
            if (r10 != 0) goto L_0x0100
            r25 = r7
            long r6 = r2.f297466c
            r13.f272732c = r6
            goto L_0x010b
        L_0x0100:
            r25 = r7
            r6 = 1
            if (r10 != r6) goto L_0x010b
            pb1.z r6 = r2.f297465b
            long r6 = r6.field_localId
            r13.f272732c = r6
        L_0x010b:
            r7 = r25
            r13.f272730a = r7
            te3.rc0 r6 = r2.f297464a
            r13.f272731b = r6
            int r10 = r0.f272788a
            r13.f272735f = r10
            r13.f272734e = r10
            int r10 = r6.f299258I
            r16 = r13
            java.lang.String r13 = ""
            r17 = r3
            java.lang.String r3 = "MicroMsg.OtherViewWrapper"
            r18 = r13
            r13 = 0
            switch(r10) {
                case 4: goto L_0x0b55;
                case 5: goto L_0x0a73;
                case 6: goto L_0x0a25;
                case 7: goto L_0x09e4;
                case 8: goto L_0x0992;
                case 9: goto L_0x0129;
                case 10: goto L_0x0938;
                case 11: goto L_0x08ef;
                case 12: goto L_0x0129;
                case 13: goto L_0x0129;
                case 14: goto L_0x0890;
                case 15: goto L_0x0b55;
                case 16: goto L_0x083b;
                case 17: goto L_0x0821;
                case 18: goto L_0x0129;
                case 19: goto L_0x07b2;
                case 20: goto L_0x0129;
                case 21: goto L_0x0129;
                case 22: goto L_0x06c7;
                case 23: goto L_0x05bc;
                case 24: goto L_0x0129;
                case 25: goto L_0x0129;
                case 26: goto L_0x04ff;
                case 27: goto L_0x0445;
                case 28: goto L_0x0366;
                case 29: goto L_0x09e4;
                case 30: goto L_0x02a9;
                case 31: goto L_0x025b;
                case 32: goto L_0x0129;
                case 33: goto L_0x0129;
                case 34: goto L_0x018e;
                case 35: goto L_0x0130;
                default: goto L_0x0129;
            }
        L_0x0129:
            k20.a r2 = new k20.a
            r2.<init>()
            goto L_0x0c19
        L_0x0130:
            long r1 = r2.f297466c
            java.lang.String r10 = r6.f299326s1
            if (r10 != 0) goto L_0x0144
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = r6.f299280T
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "album, get record info null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r1)
            goto L_0x0187
        L_0x0144:
            ig.m r3 = new ig.m
            r3.<init>()
            java.lang.String r6 = r6.f299326s1
            r3.mo141099d(r6)
            java.lang.Class<hg.d> r6 = p548hg.C98450d.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            hg.d r6 = (p548hg.C98450d) r6
            android.content.Context r10 = r4.getContext()
            java.lang.String r6 = r6.mo137796XO(r10, r3)
            r4.setText(r6)
            r4 = 8
            r5.setVisibility(r4)
            r4 = 0
            r8.setVisibility(r4)
            java.lang.String r4 = r0.f272792e
            java.lang.String r5 = "talker"
            gy3.C87412m.m108594g(r4, r5)
            tg2.a r5 = new tg2.a
            r5.<init>(r3, r4, r1)
            r9.setAlbumFiller(r5)
            java.util.List<ig.d> r1 = r3.f289375f
            int r1 = r1.size()
            r9.mo104368f(r1)
            r1 = 0
            r9.setVisibility(r1)
        L_0x0187:
            r1 = 8
            r7.setVisibility(r1)
            goto L_0x0837
        L_0x018e:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x020e
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r14)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0837
        L_0x020e:
            te3.rc0 r1 = r2.f297464a
            te3.sc0 r1 = r1.f299296c1
            if (r1 == 0) goto L_0x0254
            te3.xk1 r1 = r1.f299404F
            if (r1 == 0) goto L_0x0254
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131825788(0x7f11147c, float:1.9284442E38)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r6 = r1.f186328f
            r9 = 0
            r8[r9] = r6
            java.lang.String r2 = r2.getString(r3, r8)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4.setText(r2)
            r4.setVisibility(r9)
            r2 = 8
            r5.setVisibility(r2)
            java.lang.String r2 = r1.f186327e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0254
            k60.a r2 = k60.C99101e.f290571b
            java.lang.String r1 = r1.f186327e
            n60.f$a r3 = r0.f272797j
            r4 = 1
            r3.f293176b = r4
            r3.f293175a = r4
            n60.f r3 = r3.mo139398a()
            r2.mo85957c(r1, r7, r3)
        L_0x0254:
            r1 = 8
            r12.setVisibility(r1)
            goto L_0x0837
        L_0x025b:
            java.lang.Class<he0.h> r1 = he0.C46021h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            he0.h r1 = (he0.C46021h) r1
            java.lang.String r2 = r6.f299301f
            ie0.m r1 = r1.mo71455Rm(r2)
            if (r1 != 0) goto L_0x027a
            java.lang.String r1 = "fillOpenImKefuCardContent parse failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            r1 = r18
            r4.setText(r1)
            r5.setText(r1)
            goto L_0x0837
        L_0x027a:
            java.lang.String r2 = r1.mo71634a()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4.setText(r2)
            r2 = 0
            r4.setVisibility(r2)
            r2 = 8
            r5.setVisibility(r2)
            java.lang.String r1 = r1.f124596a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x029e
            r2 = 2131231871(0x7f08047f, float:1.8079835E38)
            r7.setImageResource(r2)
            goto L_0x0837
        L_0x029e:
            di3.d r2 = di3.C86312j.m106911c(r17)
            ln.f r2 = (p196ln.C76705f) r2
            r2.mo106849z(r7, r1)
            goto L_0x0837
        L_0x02a9:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x0329
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r14)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r15.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r11)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0445
        L_0x0329:
            te3.rc0 r3 = r2.f297464a
            te3.sc0 r6 = r3.f299296c1
            if (r6 == 0) goto L_0x035f
            te3.tk1 r6 = r6.f299403E
            if (r6 == 0) goto L_0x035f
            java.lang.String r3 = r3.f299297d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r4.setText(r3)
            r3 = 0
            r4.setVisibility(r3)
            r3 = 8
            r5.setVisibility(r3)
            java.lang.String r3 = r6.f185605f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x035f
            k60.a r3 = k60.C99101e.f290571b
            java.lang.String r6 = r6.f185605f
            n60.f$a r8 = r0.f272797j
            r9 = 1
            r8.f293176b = r9
            r8.f293175a = r9
            n60.f r8 = r8.mo139398a()
            r3.mo85957c(r6, r7, r8)
        L_0x035f:
            r3 = 8
            r12.setVisibility(r3)
            goto L_0x0445
        L_0x0366:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x03e6
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r14)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0837
        L_0x03e6:
            te3.rc0 r1 = r2.f297464a
            te3.sc0 r2 = r1.f299296c1
            if (r2 == 0) goto L_0x043e
            te3.nk1 r2 = r2.f299400B
            if (r2 == 0) goto L_0x043e
            java.lang.String r1 = r1.f299297d
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r4.setText(r1)
            r1 = 0
            r4.setVisibility(r1)
            r1 = 8
            r5.setVisibility(r1)
            java.util.LinkedList<java.lang.String> r1 = r2.f184478g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x043e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.util.LinkedList<java.lang.String> r3 = r2.f184478g
            java.lang.Object r3 = r3.getFirst()
            java.lang.String r3 = (java.lang.String) r3
            r1.<init>(r3)
            java.util.LinkedList<java.lang.String> r3 = r2.f184479h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x042a
            java.util.LinkedList<java.lang.String> r2 = r2.f184479h
            java.lang.Object r2 = r2.getFirst()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
        L_0x042a:
            k60.a r2 = k60.C99101e.f290571b
            java.lang.String r1 = r1.toString()
            n60.f$a r3 = r0.f272797j
            r4 = 1
            r3.f293176b = r4
            r3.f293175a = r4
            n60.f r3 = r3.mo139398a()
            r2.mo85957c(r1, r7, r3)
        L_0x043e:
            r1 = 8
            r12.setVisibility(r1)
            goto L_0x0837
        L_0x0445:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x04c4
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r14)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r15.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r11)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x04ff
        L_0x04c4:
            te3.rc0 r3 = r2.f297464a
            te3.sc0 r6 = r3.f299296c1
            if (r6 == 0) goto L_0x04fa
            te3.tk1 r6 = r6.f299402D
            if (r6 == 0) goto L_0x04fa
            java.lang.String r3 = r3.f299297d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r4.setText(r3)
            r3 = 0
            r4.setVisibility(r3)
            r3 = 8
            r5.setVisibility(r3)
            java.lang.String r3 = r6.f185605f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x04fa
            k60.a r3 = k60.C99101e.f290571b
            java.lang.String r6 = r6.f185605f
            n60.f$a r8 = r0.f272797j
            r9 = 1
            r8.f293176b = r9
            r8.f293175a = r9
            n60.f r8 = r8.mo139398a()
            r3.mo85957c(r6, r7, r8)
        L_0x04fa:
            r3 = 8
            r12.setVisibility(r3)
        L_0x04ff:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x057f
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r14)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0837
        L_0x057f:
            te3.rc0 r1 = r2.f297464a
            te3.sc0 r2 = r1.f299296c1
            if (r2 == 0) goto L_0x05b5
            te3.qk1 r2 = r2.f299399A
            if (r2 == 0) goto L_0x05b5
            java.lang.String r1 = r1.f299297d
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r4.setText(r1)
            r1 = 0
            r4.setVisibility(r1)
            r1 = 8
            r5.setVisibility(r1)
            java.lang.String r1 = r2.f185047f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x05b5
            k60.a r1 = k60.C99101e.f290571b
            java.lang.String r2 = r2.f185047f
            n60.f$a r3 = r0.f272797j
            r4 = 1
            r3.f293176b = r4
            r3.f293175a = r4
            n60.f r3 = r3.mo139398a()
            r1.mo85957c(r2, r7, r3)
        L_0x05b5:
            r1 = 8
            r12.setVisibility(r1)
            goto L_0x0837
        L_0x05bc:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x063c
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r14)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0837
        L_0x063c:
            te3.rc0 r1 = r2.f297464a
            java.lang.Class<ls3.g> r2 = ls3.C61397g.class
            te3.sc0 r1 = r1.f299296c1
            if (r1 == 0) goto L_0x06c0
            te3.p81 r1 = r1.f299424z
            if (r1 == 0) goto L_0x06c0
            java.lang.String r3 = r1.f184778d
            r8 = 0
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r8)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131825787(0x7f11147b, float:1.928444E38)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = r1.f184781g
            r10 = 0
            r9[r10] = r8
            java.lang.String r3 = r3.getString(r6, r9)
            di3.d r6 = di3.C86312j.m106911c(r2)
            ls3.g r6 = (ls3.C61397g) r6
            boolean r6 = r6.mo83476G0(r1)
            if (r6 != 0) goto L_0x0684
            di3.d r2 = di3.C86312j.m106911c(r2)
            r13 = r2
            ls3.g r13 = (ls3.C61397g) r13
            java.lang.String r14 = r1.f184779e
            r15 = 0
            r16 = 0
            boolean r2 = r13.Nj0(r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0682
            goto L_0x0684
        L_0x0682:
            r9 = 0
            goto L_0x0697
        L_0x0684:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131825786(0x7f11147a, float:1.9284438E38)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r6 = r1.f184781g
            r9 = 0
            r8[r9] = r6
            java.lang.String r3 = r2.getString(r3, r8)
        L_0x0697:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r4.setText(r2)
            r4.setVisibility(r9)
            r2 = 8
            r5.setVisibility(r2)
            java.lang.String r2 = r1.f184783i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x06c0
            k60.a r2 = k60.C99101e.f290571b
            java.lang.String r1 = r1.f184783i
            n60.f$a r3 = r0.f272797j
            r4 = 1
            r3.f293176b = r4
            r3.f293175a = r4
            n60.f r3 = r3.mo139398a()
            r2.mo85957c(r1, r7, r3)
        L_0x06c0:
            r1 = 8
            r12.setVisibility(r1)
            goto L_0x0837
        L_0x06c7:
            boolean r3 = pb1.C100734q.m131837a0()
            if (r3 == 0) goto L_0x0747
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r14)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0837
        L_0x0747:
            te3.rc0 r1 = r2.f297464a
            te3.sc0 r1 = r1.f299296c1
            if (r1 == 0) goto L_0x07ab
            te3.rk1 r1 = r1.f299423y
            if (r1 == 0) goto L_0x07ab
            java.lang.String r2 = r1.f185185f
            java.lang.String r3 = r1.f185198v
            if (r3 == 0) goto L_0x075f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x075f
            java.lang.String r2 = r1.f185198v
        L_0x075f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131825789(0x7f11147d, float:1.9284444E38)
            java.lang.String r2 = r2.getString(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r4.setText(r2)
            r2 = 0
            r4.setVisibility(r2)
            r3 = 8
            r5.setVisibility(r3)
            java.util.LinkedList<te3.pk1> r3 = r1.f185190n
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x07ab
            k60.a r3 = k60.C99101e.f290571b
            java.util.LinkedList<te3.pk1> r1 = r1.f185190n
            java.lang.Object r1 = r1.get(r2)
            te3.pk1 r1 = (te3.C64628pk1) r1
            java.lang.String r1 = r1.f184828f
            n60.f$a r2 = r0.f272797j
            r4 = 1
            r2.f293176b = r4
            r2.f293175a = r4
            n60.f r2 = r2.mo139398a()
            r3.mo85957c(r1, r7, r2)
        L_0x07ab:
            r3 = 8
            r12.setVisibility(r3)
            goto L_0x0837
        L_0x07b2:
            r1 = r18
            r3 = 8
            java.lang.String r6 = r6.f299297d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 == 0) goto L_0x07c2
            r4.setVisibility(r3)
            goto L_0x07c9
        L_0x07c2:
            r4.setText(r6)
            r3 = 0
            r4.setVisibility(r3)
        L_0x07c9:
            r3 = 19
            if (r3 != r10) goto L_0x07d9
            android.content.Context r1 = r5.getContext()
            r3 = 2131821085(0x7f11021d, float:1.9274903E38)
            java.lang.String r13 = r1.getString(r3)
            goto L_0x07da
        L_0x07d9:
            r13 = r1
        L_0x07da:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r1 == 0) goto L_0x07e6
            r1 = 8
            r5.setVisibility(r1)
            goto L_0x07ed
        L_0x07e6:
            r5.setText(r13)
            r1 = 0
            r5.setVisibility(r1)
        L_0x07ed:
            com.tencent.mm.plugin.record.ui.i$c$c r1 = new com.tencent.mm.plugin.record.ui.i$c$c
            r1.<init>()
            te3.rc0 r3 = r2.f297464a
            r1.f272740a = r3
            int r3 = r2.f297468e
            if (r3 != 0) goto L_0x07ff
            long r2 = r2.f297466c
            r1.f272741b = r2
            goto L_0x0808
        L_0x07ff:
            r4 = 1
            if (r3 != r4) goto L_0x0808
            pb1.z r2 = r2.f297465b
            long r2 = r2.field_localId
            r1.f272741b = r2
        L_0x0808:
            r8 = r16
            r2 = 2131230947(0x7f0800e3, float:1.8077961E38)
            r8.f272733d = r2
            com.tencent.mm.plugin.record.ui.i$c r2 = r0.f272789b
            android.graphics.Bitmap r1 = r2.mo129736b(r1)
            if (r1 == 0) goto L_0x081b
            r7.setImageBitmap(r1)
            goto L_0x0837
        L_0x081b:
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
            goto L_0x0837
        L_0x0821:
            java.lang.String r1 = r6.f299297d
            r4.setText(r1)
            r1 = 0
            r5.setVisibility(r1)
            java.lang.String r1 = r6.f299301f
            r5.setText(r1)
            r1 = 8
            r7.setVisibility(r1)
            r8.setVisibility(r1)
        L_0x0837:
            r9 = r24
            goto L_0x0c13
        L_0x083b:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            java.lang.String r2 = r6.f299301f
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4$b r1 = r1.Rv0(r2)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r4.getContext()
            java.lang.String r6 = r1.f212676b
            float r8 = r4.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r6, r8)
            r4.setText(r2)
            r2 = 8
            r5.setVisibility(r2)
            r2 = 2131825679(0x7f11140f, float:1.928422E38)
            r9 = r24
            r9.setText(r2)
            r2 = 0
            r9.setVisibility(r2)
            java.lang.String r1 = r1.f212675a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x0885
            r2 = 2131231871(0x7f08047f, float:1.8079835E38)
            r7.setImageResource(r2)
            goto L_0x0c13
        L_0x0885:
            di3.d r2 = di3.C86312j.m106911c(r17)
            ln.f r2 = (p196ln.C76705f) r2
            r2.mo106849z(r7, r1)
            goto L_0x0c13
        L_0x0890:
            r8 = r16
            r1 = r18
            r9 = r24
            te3.sc0 r2 = r6.f299296c1
            if (r2 == 0) goto L_0x08ca
            te3.ud0 r2 = r2.f299409h
            if (r2 != 0) goto L_0x089f
            goto L_0x08ca
        L_0x089f:
            java.lang.String r1 = r2.f299618d
            r4.setText(r1)
            java.lang.String r1 = r2.f299620f
            r5.setText(r1)
            te3.sc0 r1 = r6.f299296c1
            te3.tc0 r1 = r1.f299405d
            android.content.Context r2 = r9.getContext()
            java.lang.String r1 = r1.f299533w
            java.lang.String r1 = r0.mo129771s(r2, r1)
            android.content.Context r2 = r9.getContext()
            r3 = 2131825812(0x7f111494, float:1.928449E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r2)
            r9.setText(r1)
            goto L_0x08e1
        L_0x08ca:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = r6.f299280T
            r7 = 0
            r2[r7] = r6
            java.lang.String r6 = "tv, get data proto item null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r2)
            r4.setText(r1)
            r5.setText(r1)
            r9.setText(r1)
        L_0x08e1:
            r1 = 2131755112(0x7f100068, float:1.9141094E38)
            r8.f272733d = r1
            r8.f272731b = r13
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
            goto L_0x0c13
        L_0x08ef:
            r8 = r16
            r1 = r18
            r9 = r24
            te3.sc0 r2 = r6.f299296c1
            if (r2 != 0) goto L_0x0911
            r7 = 1
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r6 = r6.f299280T
            r7 = 0
            r2[r7] = r6
            java.lang.String r6 = "mall product, get data proto item null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r2)
            r4.setText(r1)
            r5.setText(r1)
            r9.setText(r1)
            goto L_0x092a
        L_0x0911:
            te3.jd0 r1 = r2.f299408g
            java.lang.String r2 = r1.f298511d
            r4.setText(r2)
            java.lang.String r1 = r1.f298513f
            r5.setText(r1)
            r1 = 0
            r4.setSingleLine(r1)
            r1 = 2
            r4.setMaxLines(r1)
            r1 = 8
            r9.setVisibility(r1)
        L_0x092a:
            r1 = 2131755112(0x7f100068, float:1.9141094E38)
            r8.f272733d = r1
            r8.f272731b = r13
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
            goto L_0x0c13
        L_0x0938:
            r8 = r16
            r1 = r18
            r9 = r24
            te3.sc0 r2 = r6.f299296c1
            if (r2 != 0) goto L_0x095a
            r7 = 1
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r6 = r6.f299280T
            r7 = 0
            r2[r7] = r6
            java.lang.String r6 = "product, get data proto item null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r2)
            r4.setText(r1)
            r5.setText(r1)
            r9.setText(r1)
            goto L_0x0986
        L_0x095a:
            te3.jd0 r1 = r2.f299408g
            java.lang.String r2 = r1.f298511d
            r4.setText(r2)
            java.lang.String r1 = r1.f298513f
            r5.setText(r1)
            te3.sc0 r1 = r6.f299296c1
            te3.tc0 r1 = r1.f299405d
            android.content.Context r2 = r9.getContext()
            java.lang.String r1 = r1.f299533w
            java.lang.String r1 = r0.mo129771s(r2, r1)
            android.content.Context r2 = r9.getContext()
            r3 = 2131825728(0x7f111440, float:1.928432E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r2)
            r9.setText(r1)
        L_0x0986:
            r1 = 2131755112(0x7f100068, float:1.9141094E38)
            r8.f272733d = r1
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
            goto L_0x0c13
        L_0x0992:
            r9 = r24
            java.lang.String r1 = r6.f299297d
            r4.setText(r1)
            r1 = 0
            r5.setVisibility(r1)
            long r3 = r6.f299276R
            float r1 = (float) r3
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getLengthStr(r1)
            r5.setText(r1)
            r1 = 8
            r9.setVisibility(r1)
            int r1 = r6.f299322q1
            r3 = 2
            if (r1 != r3) goto L_0x09d7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ">"
            r1.append(r3)
            java.lang.Class<pb1.j1> r3 = pb1.C100718j1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            pb1.j1 r3 = (pb1.C100718j1) r3
            r4 = 0
            int r3 = r3.mo128211cX(r4)
            r1.append(r3)
            java.lang.String r3 = "MB"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r5.setText(r1)
        L_0x09d7:
            te3.rc0 r1 = r2.f297464a
            java.lang.String r1 = r1.f299262K
            int r1 = wc3.C102430l.m135146a(r1)
            r7.setImageResource(r1)
            goto L_0x0c13
        L_0x09e4:
            r8 = r16
            r9 = r24
            java.lang.String r1 = r6.f299297d
            r4.setText(r1)
            te3.rc0 r1 = r2.f297464a
            java.lang.String r1 = r1.f299301f
            r5.setText(r1)
            r12.setTag(r2)
            android.view.View$OnClickListener r1 = r0.f272799l
            r12.setOnClickListener(r1)
            r1 = 2131234211(0x7f080da3, float:1.8084581E38)
            r12.setImageResource(r1)
            r1 = 0
            r12.setVisibility(r1)
            te3.rc0 r1 = r2.f297464a
            boolean r1 = m119393u(r1)
            if (r1 == 0) goto L_0x0a14
            r1 = 2131234209(0x7f080da1, float:1.8084577E38)
            r12.setImageResource(r1)
        L_0x0a14:
            r1 = 8
            r9.setVisibility(r1)
            r1 = 2131755090(0x7f100052, float:1.914105E38)
            r8.f272733d = r1
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
            goto L_0x0c13
        L_0x0a25:
            r1 = r18
            r9 = r24
            te3.sc0 r2 = r6.f299296c1
            r8 = 2131825698(0x7f111422, float:1.928426E38)
            if (r2 != 0) goto L_0x0a48
            r10 = 1
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r6 = r6.f299280T
            r10 = 0
            r2[r10] = r6
            java.lang.String r6 = "location, get data proto item null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r6, r2)
            r4.setText(r8)
            r5.setText(r1)
            r9.setText(r1)
            goto L_0x0a6b
        L_0x0a48:
            te3.zc0 r2 = r2.f299406e
            java.lang.String r3 = r2.f299958o
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0a5e
            java.lang.String r2 = r2.f299956j
            r4.setText(r2)
            r5.setText(r8)
            r9.setText(r1)
            goto L_0x0a6b
        L_0x0a5e:
            java.lang.String r1 = r2.f299958o
            r4.setText(r1)
            java.lang.String r1 = r2.f299956j
            r5.setText(r1)
            r9.setText(r8)
        L_0x0a6b:
            r1 = 2131755088(0x7f100050, float:1.9141045E38)
            r7.setImageResource(r1)
            goto L_0x0c13
        L_0x0a73:
            r8 = r16
            r1 = r18
            r9 = r24
            te3.sc0 r3 = r6.f299296c1
            if (r3 == 0) goto L_0x0a80
            te3.ae0 r3 = r3.f299407f
            goto L_0x0a81
        L_0x0a80:
            r3 = r13
        L_0x0a81:
            if (r3 == 0) goto L_0x0a86
            java.lang.String r7 = r3.f297863d
            goto L_0x0a87
        L_0x0a86:
            r7 = r1
        L_0x0a87:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r10 == 0) goto L_0x0a8f
            java.lang.String r7 = r6.f299297d
        L_0x0a8f:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r10 == 0) goto L_0x0a9b
            r10 = 8
            r4.setVisibility(r10)
            goto L_0x0aa4
        L_0x0a9b:
            r10 = 8
            r4.setText(r7)
            r7 = 0
            r4.setVisibility(r7)
        L_0x0aa4:
            r5.setVisibility(r10)
            if (r3 == 0) goto L_0x0ab0
            java.lang.String r3 = r3.f297867h
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getHost(r3)
            goto L_0x0ab1
        L_0x0ab0:
            r3 = r1
        L_0x0ab1:
            te3.sc0 r4 = r6.f299296c1
            if (r4 == 0) goto L_0x0ab8
            te3.tc0 r4 = r4.f299405d
            goto L_0x0ab9
        L_0x0ab8:
            r4 = r13
        L_0x0ab9:
            if (r4 == 0) goto L_0x0b1a
            java.lang.String r5 = r4.f299533w
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0ad3
            android.content.Context r3 = r9.getContext()
            java.lang.String r5 = r4.f299533w
            java.lang.String r3 = r0.mo129771s(r3, r5)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r1)
        L_0x0ad1:
            r3 = r1
            goto L_0x0b06
        L_0x0ad3:
            java.lang.String r5 = r4.f299513B
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0b06
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r5 = r5.mo105907v()
            java.lang.String r6 = r4.f299513B
            com.tencent.mm.storage.z1 r5 = r5.get(r6)
            if (r5 == 0) goto L_0x0afd
            java.lang.String r6 = r5.getUsername()
            java.lang.String r7 = r4.f299513B
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0af8
            goto L_0x0afd
        L_0x0af8:
            java.lang.String r1 = r5.mo62898f()
            goto L_0x0ad1
        L_0x0afd:
            eb0.w2 r5 = eb0.C31519v2.m39436a()
            java.lang.String r6 = r4.f299513B
            r5.mo55988e(r6, r1, r13)
        L_0x0b06:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x0b14
            java.lang.String r1 = r4.f299513B
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0b1a
        L_0x0b14:
            java.lang.String r1 = r4.f299535y
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getHost(r1)
        L_0x0b1a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x0b26
            r1 = 8
            r9.setVisibility(r1)
            goto L_0x0b2d
        L_0x0b26:
            r9.setText(r3)
            r1 = 0
            r9.setVisibility(r1)
        L_0x0b2d:
            r1 = 2131230947(0x7f0800e3, float:1.8077961E38)
            r8.f272733d = r1
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
            te3.rc0 r1 = r2.f297464a
            if (r1 == 0) goto L_0x0c13
            te3.sc0 r1 = r1.f299296c1
            if (r1 == 0) goto L_0x0c13
            te3.ad0 r1 = r1.f299421w
            if (r1 == 0) goto L_0x0c13
            int r1 = r1.f297848d
            r2 = 16
            if (r1 != r2) goto L_0x0c13
            r1 = 0
            r12.setVisibility(r1)
            r1 = 2131756957(0x7f10079d, float:1.9144836E38)
            r12.setImageResource(r1)
            goto L_0x0c13
        L_0x0b55:
            r8 = r16
            r9 = r24
            java.lang.String r1 = r6.f299297d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0b68
            r1 = 2131825817(0x7f111499, float:1.92845E38)
            r4.setText(r1)
            goto L_0x0b6d
        L_0x0b68:
            java.lang.String r1 = r6.f299297d
            r4.setText(r1)
        L_0x0b6d:
            int r1 = r6.f299338y
            if (r1 > 0) goto L_0x0b79
            r1 = 8
            r5.setVisibility(r1)
            r1 = 0
            r10 = 1
            goto L_0x0bbf
        L_0x0b79:
            r1 = 0
            r5.setVisibility(r1)
            android.content.Context r2 = r5.getContext()
            int r4 = r6.f299338y
            r7 = 2131825819(0x7f11149b, float:1.9284505E38)
            if (r4 > 0) goto L_0x0b92
            r10 = 1
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r1] = r11
            java.lang.String r2 = r2.getString(r7, r4)
            goto L_0x0bbc
        L_0x0b92:
            r10 = 1
            int r11 = r4 / 60
            int r4 = r4 % 60
            if (r11 != 0) goto L_0x0ba6
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11[r1] = r4
            java.lang.String r2 = r2.getString(r7, r11)
            goto L_0x0bbc
        L_0x0ba6:
            r7 = 2131825818(0x7f11149a, float:1.9284503E38)
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r1] = r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13[r10] = r4
            java.lang.String r2 = r2.getString(r7, r13)
        L_0x0bbc:
            r5.setText(r2)
        L_0x0bbf:
            te3.sc0 r2 = r6.f299296c1
            if (r2 != 0) goto L_0x0bd5
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r4 = r6.f299280T
            r2[r1] = r4
            java.lang.String r1 = "video, get data proto item null, dataid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r2)
            r1 = 8
            r9.setVisibility(r1)
            goto L_0x0bff
        L_0x0bd5:
            te3.tc0 r1 = r2.f299405d
            if (r1 == 0) goto L_0x0bff
            java.lang.String r2 = r1.f299533w
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0bff
            android.content.Context r2 = r9.getContext()
            java.lang.String r1 = r1.f299533w
            java.lang.String r1 = r0.mo129771s(r2, r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x0bf7
            r2 = 8
            r9.setVisibility(r2)
            goto L_0x0bff
        L_0x0bf7:
            r2 = 0
            r9.setVisibility(r2)
            r9.setText(r1)
            goto L_0x0c00
        L_0x0bff:
            r2 = 0
        L_0x0c00:
            r12.setVisibility(r2)
            r1 = 2131756957(0x7f10079d, float:1.9144836E38)
            r12.setImageResource(r1)
            r1 = 2131755116(0x7f10006c, float:1.9141102E38)
            r8.f272733d = r1
            com.tencent.mm.plugin.record.ui.i$c r1 = r0.f272789b
            r1.mo129737c(r8)
        L_0x0c13:
            r1 = 8
            r9.setVisibility(r1)
            return
        L_0x0c19:
            r2.mo10233c(r14)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r11)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r19 = "fillView"
            java.lang.String r20 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper"
            java.lang.String r18 = "fillView"
            java.lang.String r19 = "(Landroid/view/View;ILcom/tencent/mm/plugin/record/ui/recordData/RecordData;Ljava/lang/Object;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.viewWrappers.OtherViewWrapper.mo129755a(android.view.View, int, sg2.b, java.lang.Object):void");
    }

    /* renamed from: b */
    public View mo129756b(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.bqh, (ViewGroup) null);
        this.f272788a = C76577a.m92151b(context, 75);
        this.f272800m.alive();
        this.f272801n.alive();
        return inflate;
    }

    public void destroy() {
        Log.m105918d("MicroMsg.OtherViewWrapper", "do destroy");
        this.f272789b = null;
        this.f272790c = null;
        this.f272800m.dead();
        this.f272801n.dead();
        this.f272791d = false;
    }

    public void pause() {
    }

    /* renamed from: s */
    public String mo129771s(Context context, String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(context, str);
    }

    /* renamed from: t */
    public final void mo129772t(int i, Intent intent, C101834rc0 rc02, Context context, String str, String str2, boolean z) {
        intent.putExtra("key_detail_fav_path", str);
        intent.putExtra("key_detail_fav_thumb_path", str2);
        intent.putExtra("key_detail_fav_video_duration", rc02.f299338y);
        intent.putExtra("key_detail_statExtStr", rc02.f299311k1);
        intent.putExtra("key_detail_is_data_exist", z);
        intent.putExtra("key_detail_msg_uuid", rc02.f299259I1);
        C100734q.m131877u0(context, ".ui.detail.FavoriteVideoPlayUI", intent, 1, (Bundle) null);
    }

    /* renamed from: v */
    public final void mo129773v(Context context, Intent intent) {
        Intent intent2;
        if ((context instanceof Activity) && (intent2 = ((Activity) context).getIntent()) != null) {
            intent.putExtra("prePublishId", intent2.getStringExtra("prePublishId"));
            intent.putExtra("preUsername", intent2.getStringExtra("preUsername"));
            intent.putExtra("preChatName", intent2.getStringExtra("preChatName"));
            intent.putExtra("preChatTYPE", intent2.getIntExtra("preChatTYPE", 0));
        }
    }
}
