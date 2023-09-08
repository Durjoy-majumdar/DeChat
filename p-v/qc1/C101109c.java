package qc1;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import pb1.C100752x0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: qc1.c */
public class C101109c extends C86301e implements C100752x0 {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113 A[SYNTHETIC, Splitter:B:30:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0506  */
    /* renamed from: DJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo140172DJ(android.content.Context r32, pb1.C100755z r33, te3.C101811md0 r34) {
        /*
            r31 = this;
            r7 = r32
            r1 = r33
            r0 = r34
            java.lang.Class<pu.b> r2 = p652pu.C100910b.class
            java.lang.Class<xq.e> r3 = p272xq.C102712e.class
            java.lang.String r4 = "MicroMsg.FavItemLogic"
            r10 = 1
            if (r7 != 0) goto L_0x0016
            java.lang.String r0 = "Context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0610
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r0 = "Fav item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0610
        L_0x001f:
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            long r8 = r1.field_localId
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 0
            r6[r9] = r8
            int r8 = r1.field_type
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r10] = r8
            java.lang.String r8 = "Handler favItemInfo id %d, type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r6)
            java.lang.Class<pb1.z0> r6 = pb1.C100759z0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            pb1.z0 r6 = (pb1.C100759z0) r6
            long r11 = r1.field_localId
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r6.mo61499ni(r8)
            int r6 = r1.field_type
            java.lang.String r8 = "key_scene"
            java.lang.String r11 = " start play music"
            java.lang.String r12 = "The music is playing, stop music"
            java.lang.String r13 = ""
            java.lang.String r14 = "key_can_delete_favorite_item"
            java.lang.String r15 = "key_favorite_local_id"
            java.lang.String r9 = "key_is_favorite_item"
            java.lang.String r10 = "start product ui, fav id %d, fav local id %d"
            java.lang.String r5 = "key_detail_create_time"
            r16 = r13
            switch(r6) {
                case -2: goto L_0x0605;
                case -1: goto L_0x0068;
                case 0: goto L_0x0068;
                case 1: goto L_0x05b9;
                case 2: goto L_0x05b5;
                case 3: goto L_0x0591;
                case 4: goto L_0x058c;
                case 5: goto L_0x0586;
                case 6: goto L_0x052a;
                case 7: goto L_0x045e;
                case 8: goto L_0x0458;
                case 9: goto L_0x0068;
                case 10: goto L_0x0412;
                case 11: goto L_0x03d7;
                case 12: goto L_0x038e;
                case 13: goto L_0x0068;
                case 14: goto L_0x0388;
                case 15: goto L_0x038e;
                case 16: goto L_0x035c;
                case 17: goto L_0x027f;
                case 18: goto L_0x0279;
                case 19: goto L_0x0068;
                case 20: goto L_0x0068;
                case 21: goto L_0x0095;
                case 22: goto L_0x0068;
                case 23: goto L_0x0079;
                default: goto L_0x0068;
            }
        L_0x0068:
            r1 = 0
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r0[r1] = r3
            java.lang.String r1 = "Do not match any type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
            goto L_0x0611
        L_0x0079:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            qc1.C101110e.m132509l(r1, r0, r2)
            java.lang.String r0 = r0.f298816g
            java.lang.String r1 = "FavoriteAlbumDetailUI"
            pb1.C100699c0.m131740b(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            xq.e r0 = (p272xq.C102712e) r0
            java.lang.String r1 = ".ui.detail.FavoriteAlbumDetailUI"
            r0.F20(r7, r1, r2)
            goto L_0x0610
        L_0x0095:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionMusic
            boolean r0 = r0.checkAvailable(r7)
            if (r0 != 0) goto L_0x009f
            goto L_0x02a3
        L_0x009f:
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            boolean r0 = r0.mo76822Vm()
            if (r0 != 0) goto L_0x00af
            goto L_0x02a3
        L_0x00af:
            te3.kd0 r0 = r1.field_favProto
            te3.rd0 r3 = r0.f298616d
            te3.rc0 r5 = pb1.C100734q.m131813D(r33)
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = pb1.C100734q.m131826Q(r5)
            r0.<init>((java.lang.String) r6)
            boolean r6 = r0.mo119967g()
            if (r6 != 0) goto L_0x00fb
            java.lang.String r0 = r5.f299254G
            if (r0 != 0) goto L_0x00cb
            goto L_0x00f8
        L_0x00cb:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = pb1.C100734q.m131812C()
            r6.append(r9)
            java.lang.String r9 = r5.f299254G
            byte[] r9 = r9.getBytes()
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.<init>((java.lang.String) r6)
            boolean r6 = r0.mo119967g()
            if (r6 == 0) goto L_0x00f8
            java.lang.String r0 = r0.mo119971i()
            goto L_0x00ff
        L_0x00f8:
            r27 = r16
            goto L_0x0101
        L_0x00fb:
            java.lang.String r0 = r0.mo119971i()
        L_0x00ff:
            r27 = r0
        L_0x0101:
            if (r5 == 0) goto L_0x010b
            te3.sc0 r0 = r5.f299296c1
            if (r0 == 0) goto L_0x010b
            te3.t23 r0 = r0.f299401C
            r6 = r0
            goto L_0x010c
        L_0x010b:
            r6 = 0
        L_0x010c:
            te3.t23 r9 = new te3.t23
            r9.<init>()
            if (r6 == 0) goto L_0x0135
            byte[] r0 = r6.toByteArray()     // Catch:{ IOException -> 0x011b }
            r9.parseFrom(r0)     // Catch:{ IOException -> 0x011b }
            goto L_0x0135
        L_0x011b:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "message:"
            r10.append(r14)
            java.lang.String r0 = r0.getMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0135:
            di3.d r0 = di3.C86312j.m106911c(r2)
            r17 = r0
            pu.b r17 = (p652pu.C100910b) r17
            r18 = 6
            java.lang.String r0 = r5.f299297d
            java.lang.String r2 = r5.f299301f
            java.lang.String r10 = r5.f299242A
            java.lang.String r14 = r5.f299250E
            java.lang.String r15 = r5.f299246C
            java.lang.String r13 = r5.f299280T
            java.lang.String r26 = pb1.C100734q.m131809A()
            java.lang.String r3 = r3.f299362w
            java.lang.String r7 = r5.f299280T
            qc0.o r30 = qc0.C62602o.m73561a(r7, r9)
            r19 = 0
            java.lang.String r28 = ""
            r20 = r0
            r21 = r2
            r22 = r10
            r23 = r14
            r24 = r15
            r25 = r13
            r29 = r3
            qc0.m r0 = r17.mo139948sL(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r2 = r5.f299251E1
            r0.f295976x = r2
            java.lang.String r2 = r5.f299255G1
            r0.f295969q = r2
            java.lang.String r2 = r5.f299280T
            r0.f295949J = r2
            if (r6 == 0) goto L_0x017f
            java.lang.String r2 = r6.f185470r
            r0.f295954P = r2
        L_0x017f:
            boolean r2 = pb1.C100734q.m131839b0(r5)
            if (r2 != 0) goto L_0x018c
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            qc0.C101093a.m132488j(r0)
            goto L_0x018f
        L_0x018c:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
        L_0x018f:
            long r1 = r1.field_localId
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f295944E = r1
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 2
            r0.putExtra(r8, r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)
            if (r6 == 0) goto L_0x0233
            java.lang.String r1 = r6.f185459d
            java.lang.String r2 = "key_mv_feed_id"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185460e
            java.lang.String r2 = "key_mv_nonce_id"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185461f
            java.lang.String r2 = "key_mv_cover_url"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185462g
            java.lang.String r2 = "key_mv_poster"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r5.f299297d
            java.lang.String r2 = "key_mv_song_name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r5.f299255G1
            java.lang.String r2 = "key_mv_song_lyric"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r5.f299251E1
            java.lang.String r2 = "key_mv_album_cover_url"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185463h
            java.lang.String r2 = "key_mv_singer_name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185464i
            java.lang.String r2 = "key_mv_album_name"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185466n
            java.lang.String r2 = "key_mv_music_genre"
            r0.putExtra(r2, r1)
            long r1 = r6.f185467o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "key_mv_issue_date"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185468p
            java.lang.String r2 = "key_mv_identification"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185465j
            java.lang.String r2 = "key_mv_extra_info"
            r0.putExtra(r2, r1)
            int r1 = r6.f185469q
            java.lang.String r2 = "key_mv_music_duration"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185472t
            java.lang.String r2 = "key_mv_thumb_path"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185471s
            java.lang.String r2 = "key_mv_music_operation_url"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f185470r
            java.lang.String r2 = "key_mv_song_mid"
            r0.putExtra(r2, r1)
        L_0x0233:
            java.lang.Class<ox.b> r1 = p640ox.C77049b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ox.b r1 = (p640ox.C77049b) r1
            r2 = 7
            java.lang.Class<te3.w23> r3 = te3.C64793w23.class
            java.lang.String r4 = "MusicMvMainUI"
            r7 = r32
            pe3.a r1 = r1.mo72357nb(r7, r4, r2, r3)
            te3.w23 r1 = (te3.C64793w23) r1
            r2 = 9
            r1.f186033d = r2
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r2, r3)
            r1.f186034e = r2
            r2 = 84
            r1.f186035f = r2
            java.lang.String r2 = r5.f299280T
            r1.f186036g = r2
            java.lang.String r2 = "key_mv_report_data"
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x026e }
            r0.putExtra(r2, r1)     // Catch:{ IOException -> 0x026e }
        L_0x026e:
            java.lang.String r1 = "mv"
            java.lang.String r2 = ".ui.MusicMvMainUI"
            r3 = 0
            ke3.C88144b.m109791i(r7, r1, r2, r0, r3)
            goto L_0x0610
        L_0x0279:
            r2 = 1
            qc1.C101110e.m132505h(r7, r1, r2, r0)
            goto L_0x0611
        L_0x027f:
            te3.rc0 r1 = pb1.C100734q.m131813D(r33)
            java.lang.String r1 = r1.f299301f
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4$b r1 = r2.Rv0(r1)
            java.lang.String r2 = r1.f212675a
            boolean r2 = eb0.C45628s0.m50738C(r2)
            if (r2 == 0) goto L_0x02a5
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionOa
            boolean r2 = r2.checkAvailable(r7)
            if (r2 != 0) goto L_0x02a5
        L_0x02a3:
            goto L_0x0610
        L_0x02a5:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = r1.f212675a
            java.lang.String r4 = "Contact_User"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212677c
            java.lang.String r4 = "Contact_Alias"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212676b
            java.lang.String r4 = "Contact_Nick"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212678d
            java.lang.String r4 = "Contact_QuanPin"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212679e
            java.lang.String r4 = "Contact_PyInitial"
            r2.putExtra(r4, r3)
            long r3 = r1.f212684j
            java.lang.String r5 = "Contact_Uin"
            r2.putExtra(r5, r3)
            java.lang.String r3 = r1.f212682h
            java.lang.String r4 = "Contact_Mobile_MD5"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212683i
            java.lang.String r4 = "Contact_full_Mobile_MD5"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.mo101028e()
            java.lang.String r4 = "Contact_QQNick"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "User_From_Fmessage"
            r4 = 0
            r2.putExtra(r3, r4)
            int r3 = r1.f212681g
            java.lang.String r4 = "Contact_Scene"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "Contact_FMessageCard"
            r4 = 1
            r2.putExtra(r3, r4)
            java.lang.String r3 = r1.f212686l
            java.lang.String r4 = "Contact_RemarkName"
            r2.putExtra(r4, r3)
            int r3 = r1.f212691q
            java.lang.String r4 = "Contact_VUser_Info_Flag"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212692r
            java.lang.String r4 = "Contact_VUser_Info"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212693s
            java.lang.String r4 = "Contact_BrandIconURL"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.mo101027d()
            java.lang.String r4 = "Contact_Province"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.mo101024a()
            java.lang.String r4 = "Contact_City"
            r2.putExtra(r4, r3)
            int r3 = r1.f212689o
            java.lang.String r4 = "Contact_Sex"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.f212690p
            java.lang.String r4 = "Contact_Signature"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "Contact_ShowUserName"
            r4 = 0
            r2.putExtra(r3, r4)
            java.lang.String r3 = "Contact_KSnsIFlag"
            r2.putExtra(r3, r4)
            java.lang.String r0 = r0.f298816g
            java.lang.String r3 = "ContactInfoUI"
            pb1.C100699c0.m131740b(r3, r0)
            java.lang.String r0 = "profile"
            java.lang.String r3 = ".ui.ContactInfoUI"
            r4 = 0
            ke3.C88144b.m109791i(r7, r0, r3, r2, r4)
            int r0 = r1.f212681g
            le3.C10499a.m10432a(r0)
            goto L_0x0610
        L_0x035c:
            te3.rc0 r2 = pb1.C100734q.m131813D(r33)
            if (r2 == 0) goto L_0x0383
            te3.uc0 r3 = r2.f299306h1
            if (r3 == 0) goto L_0x0383
            java.lang.String r3 = r3.f299610d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0378
            te3.uc0 r2 = r2.f299306h1
            java.lang.String r2 = r2.f299613g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0383
        L_0x0378:
            java.lang.String r2 = "it is ad sight."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            qc1.C101110e.m132503f(r32, r33, r34)
            goto L_0x0610
        L_0x0383:
            qc1.C101110e.m132504g(r32, r33, r34)
            goto L_0x0610
        L_0x0388:
            r2 = 1
            qc1.C101110e.m132502e(r7, r1, r2, r0)
            goto L_0x0611
        L_0x038e:
            r2 = 1
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r3 = r1.field_id
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r0[r5] = r3
            long r5 = r1.field_localId
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r2] = r3
            java.lang.String r3 = "start tv ui, fav id %d, fav local id %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r3, r0)
            long r3 = r1.field_localId
            te3.kd0 r0 = r1.field_favProto
            te3.ud0 r0 = r0.f298604C
            java.lang.String r0 = r0.f299624j
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r5 = "key_TV_getProductInfoScene"
            r6 = 3
            r1.putExtra(r5, r6)
            r1.putExtra(r9, r2)
            r1.putExtra(r15, r3)
            java.lang.String r3 = "key_TV_xml"
            r1.putExtra(r3, r0)
            r1.putExtra(r14, r2)
            java.lang.String r0 = "shake"
            java.lang.String r3 = ".ui.TVInfoUI"
            r4 = 0
            ke3.C88144b.m109791i(r7, r0, r3, r1, r4)
            goto L_0x0611
        L_0x03d7:
            r2 = 1
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r3 = r1.field_id
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r0[r5] = r3
            long r5 = r1.field_localId
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r10, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r2 = 4
            java.lang.String r3 = "key_product_scene"
            r0.putExtra(r3, r2)
            te3.kd0 r1 = r1.field_favProto
            te3.jd0 r1 = r1.f298634y
            java.lang.String r1 = r1.f298517j
            java.lang.String r2 = "key_product_info"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "product"
            java.lang.String r2 = ".ui.MallProductUI"
            r3 = 0
            ke3.C88144b.m109791i(r7, r1, r2, r0, r3)
            goto L_0x0610
        L_0x0412:
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r2 = r1.field_id
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            long r2 = r1.field_localId
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r10, r0)
            long r4 = r1.field_localId
            te3.kd0 r0 = r1.field_favProto
            te3.jd0 r0 = r0.f298634y
            java.lang.String r0 = r0.f298517j
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r9, r3)
            r1.putExtra(r15, r4)
            java.lang.String r2 = "key_Product_xml"
            r1.putExtra(r2, r0)
            r1.putExtra(r14, r3)
            java.lang.String r0 = "key_ProductUI_getProductInfoScene"
            r2 = 3
            r1.putExtra(r0, r2)
            java.lang.String r0 = "scanner"
            java.lang.String r2 = ".ui.ProductUI"
            r4 = 0
            ke3.C88144b.m109791i(r7, r0, r2, r1, r4)
            goto L_0x0610
        L_0x0458:
            r3 = 1
            qc1.C101110e.m132500c(r7, r1, r3, r0)
            goto L_0x0610
        L_0x045e:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionMusic
            boolean r0 = r0.checkAvailable(r7)
            if (r0 != 0) goto L_0x0468
            goto L_0x02a3
        L_0x0468:
            te3.kd0 r0 = r1.field_favProto
            te3.rd0 r0 = r0.f298616d
            te3.rc0 r3 = pb1.C100734q.m131813D(r33)
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = pb1.C100734q.m131826Q(r3)
            r5.<init>((java.lang.String) r6)
            boolean r6 = r5.mo119967g()
            if (r6 != 0) goto L_0x04b4
            java.lang.String r5 = r3.f299254G
            if (r5 != 0) goto L_0x0484
            goto L_0x04b1
        L_0x0484:
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = pb1.C100734q.m131812C()
            r6.append(r9)
            java.lang.String r9 = r3.f299254G
            byte[] r9 = r9.getBytes()
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            boolean r6 = r5.mo119967g()
            if (r6 == 0) goto L_0x04b1
            java.lang.String r5 = r5.mo119971i()
            goto L_0x04b8
        L_0x04b1:
            r27 = r16
            goto L_0x04bb
        L_0x04b4:
            java.lang.String r5 = r5.mo119971i()
        L_0x04b8:
            r13 = r5
            r27 = r13
        L_0x04bb:
            di3.d r2 = di3.C86312j.m106911c(r2)
            r17 = r2
            pu.b r17 = (p652pu.C100910b) r17
            r18 = 6
            r19 = 0
            java.lang.String r2 = r3.f299297d
            java.lang.String r5 = r3.f299301f
            java.lang.String r6 = r3.f299242A
            java.lang.String r9 = r3.f299250E
            java.lang.String r10 = r3.f299246C
            java.lang.String r13 = r3.f299280T
            java.lang.String r26 = pb1.C100734q.m131809A()
            java.lang.String r0 = r0.f299362w
            java.lang.String r28 = ""
            r20 = r2
            r21 = r5
            r22 = r6
            r23 = r9
            r24 = r10
            r25 = r13
            r29 = r0
            qc0.m r0 = r17.K40(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r2 = r3.f299251E1
            r0.f295976x = r2
            java.lang.String r2 = r3.f299255G1
            r0.f295969q = r2
            java.lang.String r2 = r3.f299280T
            r0.f295949J = r2
            boolean r2 = pb1.C100734q.m131839b0(r3)
            if (r2 != 0) goto L_0x0506
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            qc0.C101093a.m132488j(r0)
            goto L_0x0509
        L_0x0506:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
        L_0x0509:
            long r1 = r1.field_localId
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f295944E = r1
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 2
            r0.putExtra(r8, r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)
            java.lang.String r1 = "music"
            java.lang.String r2 = ".ui.MusicMainUI"
            r3 = 0
            ke3.C88144b.m109791i(r7, r1, r2, r0, r3)
            goto L_0x0610
        L_0x052a:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionLocation
            boolean r2 = r2.checkAvailable(r7)
            if (r2 != 0) goto L_0x0534
            goto L_0x02a3
        L_0x0534:
            java.lang.Class<d62.i> r2 = d62.C75339i.class
            te3.kd0 r3 = r1.field_favProto
            te3.zc0 r4 = r3.f298620h
            java.lang.String r5 = r3.f298624o
            te3.rd0 r3 = r3.f298616d
            if (r3 == 0) goto L_0x0555
            java.lang.String r6 = r3.f299354o
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0555
            di3.d r2 = di3.C86312j.m106911c(r2)
            d62.i r2 = (d62.C75339i) r2
            java.lang.String r3 = r3.f299354o
            java.lang.String r2 = r2.getDisplayName(r3)
            goto L_0x0561
        L_0x0555:
            di3.d r2 = di3.C86312j.m106911c(r2)
            d62.i r2 = (d62.C75339i) r2
            java.lang.String r3 = r1.field_fromUser
            java.lang.String r2 = r2.getDisplayName(r3)
        L_0x0561:
            r6 = r2
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            te3.yd0 r2 = r1.field_tagProto
            java.util.LinkedList<java.lang.String> r2 = r2.f186495e
            if (r2 == 0) goto L_0x0570
            r8.addAll(r2)
        L_0x0570:
            java.lang.String r0 = r0.f298816g
            java.lang.String r2 = "RedirectUI"
            pb1.C100699c0.m131740b(r2, r0)
            long r1 = r1.field_localId
            r0 = 1
            r9 = 1
            r3 = r4
            r4 = r6
            r6 = r8
            r7 = r32
            r8 = r0
            pb1.C100734q.m131879v0(r1, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0610
        L_0x0586:
            r2 = 1
            qc1.C101110e.m132506i(r7, r1, r2, r0)
            goto L_0x0611
        L_0x058c:
            qc1.C101110e.m132504g(r32, r33, r34)
            goto L_0x0610
        L_0x0591:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            qc1.C101110e.m132509l(r1, r0, r2)
            te3.kd0 r1 = r1.field_favProto
            te3.rd0 r1 = r1.f298616d
            long r8 = r1.f299356q
            r2.putExtra(r5, r8)
            java.lang.String r0 = r0.f298816g
            java.lang.String r1 = "FavoriteVoiceDetailUI"
            pb1.C100699c0.m131740b(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            xq.e r0 = (p272xq.C102712e) r0
            java.lang.String r1 = ".ui.detail.FavoriteVoiceDetailUI"
            r0.F20(r7, r1, r2)
            goto L_0x0610
        L_0x05b5:
            qc1.C101110e.m132501d(r32, r33, r34)
            goto L_0x0610
        L_0x05b9:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            te3.kd0 r4 = r1.field_favProto
            java.lang.String r4 = r4.f298628s
            java.lang.String r6 = "key_detail_text"
            r2.putExtra(r6, r4)
            long r8 = r1.field_localId
            java.lang.String r4 = "key_detail_info_id"
            r2.putExtra(r4, r8)
            boolean r4 = r33.mo140184m2()
            java.lang.String r6 = "key_detail_can_share_to_friend"
            r2.putExtra(r6, r4)
            long r8 = r1.field_updateTime
            java.lang.String r4 = "key_detail_time"
            r2.putExtra(r4, r8)
            long r8 = r1.field_sourceCreateTime
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x05ec
            long r8 = r1.field_updateTime
        L_0x05ec:
            r2.putExtra(r5, r8)
            qc1.C101110e.m132510m(r0, r2)
            java.lang.String r0 = r0.f298816g
            java.lang.String r1 = "FavoriteTextDetailUI"
            pb1.C100699c0.m131740b(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r3)
            xq.e r0 = (p272xq.C102712e) r0
            java.lang.String r1 = ".ui.detail.FavoriteTextDetailUI"
            r0.F20(r7, r1, r2)
            goto L_0x0610
        L_0x0605:
            r0 = 2131825813(0x7f111495, float:1.9284493E38)
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r7, (int) r0, (int) r1)
            r0.show()
        L_0x0610:
            r2 = 1
        L_0x0611:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qc1.C101109c.mo140172DJ(android.content.Context, pb1.z, te3.md0):boolean");
    }
}
