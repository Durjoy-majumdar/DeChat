package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import nj3.C11184p0;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.s0 */
public class C96214s0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f281159d;

    /* renamed from: e */
    public final /* synthetic */ C101804kv2 f281160e;

    /* renamed from: f */
    public final /* synthetic */ GalleryTitleManager f281161f;

    public C96214s0(GalleryTitleManager galleryTitleManager, SnsInfo snsInfo, C101804kv2 kv22, int i) {
        this.f281161f = galleryTitleManager;
        this.f281159d = snsInfo;
        this.f281160e = kv22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "onMMMenuItemSelected"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager r3 = r0.f281161f
            com.tencent.mm.plugin.sns.ui.FlipView$$n r3 = com.tencent.p014mm.plugin.sns.p106ui.GalleryTitleManager.m121500e(r3)
            if (r3 == 0) goto L_0x001b
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager r3 = r0.f281161f
            com.tencent.mm.plugin.sns.ui.FlipView$$n r3 = com.tencent.p014mm.plugin.sns.p106ui.GalleryTitleManager.m121500e(r3)
            r3.mo132169a()
        L_0x001b:
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager r3 = r0.f281161f
            int r4 = r22.getItemId()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f281159d
            te3.kv2 r6 = r0.f281160e
            java.lang.String r7 = "access$700"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.GalleryTitleManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r3.getClass()
            java.lang.String r9 = "doSheetListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "showAlert "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.GalleryTitleManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            java.lang.String r10 = ""
            r12 = 1
            r13 = -1
            if (r4 == r13) goto L_0x03fd
            r15 = 1000(0x3e8, float:1.401E-42)
            r13 = 2
            if (r4 == r15) goto L_0x03a8
            r15 = 15
            r14 = 4
            switch(r4) {
                case 1002: goto L_0x0205;
                case 1003: goto L_0x016c;
                case 1004: goto L_0x010d;
                case 1005: goto L_0x00d0;
                case 1006: goto L_0x0061;
                default: goto L_0x005c;
            }
        L_0x005c:
            switch(r4) {
                case 1008: goto L_0x0358;
                case 1009: goto L_0x033c;
                case 1010: goto L_0x02e5;
                case 1011: goto L_0x02b9;
                case 1012: goto L_0x0277;
                case 1013: goto L_0x0205;
                case 1014: goto L_0x0205;
                case 1015: goto L_0x01ea;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0430
        L_0x0061:
            if (r5 == 0) goto L_0x0430
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r5.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            if (r4 != 0) goto L_0x006d
            goto L_0x0430
        L_0x006d:
            java.lang.String r4 = "favorite"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            int r10 = r5.field_type
            if (r10 != r12) goto L_0x008e
            com.tencent.mm.autogen.events.DoFavoriteEvent r10 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r10.<init>()
            java.lang.String r6 = r6.f298689d
            et2.C97707a.m126003a(r10, r5, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r10.f264674d
            android.content.Context r3 = r3.f276837d
            android.app.Activity r3 = (android.app.Activity) r3
            r5.f264684i = r3
            r5.f264688m = r15
            r10.publish()
            goto L_0x00cb
        L_0x008e:
            boolean r6 = r5.isAd()
            r10 = 16
            if (r6 != 0) goto L_0x00b6
            java.lang.String r3 = r5.getLocalid()
            java.lang.String r5 = "favVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            com.tencent.mm.autogen.events.SnsVideoMenuEvent r6 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent
            r6.<init>()
            com.tencent.mm.autogen.events.SnsVideoMenuEvent$a r11 = r6.f265214d
            r11.f265215a = r13
            r11.f265216b = r10
            r10 = 0
            r11.f265217c = r10
            r11.f265218d = r3
            r6.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x00cb
        L_0x00b6:
            com.tencent.mm.autogen.events.DoFavoriteEvent r6 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r6.<init>()
            et2.C97707a.m126006d(r6, r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r6.f264674d
            android.content.Context r3 = r3.f276837d
            android.app.Activity r3 = (android.app.Activity) r3
            r5.f264684i = r3
            r5.f264688m = r10
            r6.publish()
        L_0x00cb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x00d0:
            java.lang.String r4 = "dealWithSetOpen"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            com.tencent.mm.plugin.sns.model.g0 r6 = new com.tencent.mm.plugin.sns.model.g0
            long r10 = r5.field_snsId
            r5 = 3
            r6.<init>((long) r10, (int) r5)
            f40.C86709a0.m107528h()
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r5.mo123460f(r6)
            android.content.Context r10 = r3.f276837d
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r11 = r10.getString(r5)
            android.content.Context r5 = r3.f276837d
            r12 = 2131837126(0x7f1140c6, float:1.9307438E38)
            java.lang.String r12 = r5.getString(r12)
            r13 = 1
            r14 = 1
            com.tencent.mm.plugin.sns.ui.x0 r15 = new com.tencent.mm.plugin.sns.ui.x0
            r15.<init>(r3, r6)
            qo3.i0 r5 = nj3.C76879j.m92723Q(r10, r11, r12, r13, r14, r15)
            r3.f276839f = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x010d:
            long r4 = r5.field_snsId
            java.lang.String r6 = "dealWithExposeSns"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            os2.e0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r10.mo139806SE(r4)
            r13 = 0
            int r11 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0167
            if (r10 != 0) goto L_0x0125
            goto L_0x0167
        L_0x0125:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            java.lang.String r10 = r10.getUserName()
            java.lang.String r13 = "k_username"
            r11.putExtra(r13, r10)
            java.lang.String r10 = "k_expose_msg_id"
            r11.putExtra(r10, r4)
            java.lang.String r4 = "showShare"
            r5 = 0
            r11.putExtra(r4, r5)
            java.lang.String r4 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r12 = 33
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r5] = r12
            java.lang.String r4 = java.lang.String.format(r4, r10)
            java.lang.String r5 = "rawUrl"
            r11.putExtra(r5, r4)
            android.content.Context r3 = r3.f276837d
            java.lang.String r4 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            r10 = 0
            ke3.C88144b.m109791i(r3, r4, r5, r11, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            goto L_0x0430
        L_0x0167:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            goto L_0x0430
        L_0x016c:
            if (r5 == 0) goto L_0x0430
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r5.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            if (r4 != 0) goto L_0x0178
            goto L_0x0430
        L_0x0178:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r5.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            int r4 = r4.f298424e
            if (r4 != r12) goto L_0x01cb
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r6)
            java.lang.String r5 = "dealWithShareImg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r10 = "Retr_File_Name"
            r6.putExtra(r10, r4)
            java.lang.String r10 = "Retr_Compress_Type"
            r11 = 0
            r6.putExtra(r10, r11)
            java.lang.String r10 = "Retr_Msg_Type"
            r6.putExtra(r10, r11)
            com.tencent.mm.sendtowework.ImgData r10 = new com.tencent.mm.sendtowework.ImgData
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r11)
            r10.<init>(r4)
            java.lang.String r4 = "Select_Data_Send_To_WeWork"
            r6.putExtra(r4, r10)
            java.lang.String r4 = "content_type_forward_to_wework"
            r6.putExtra(r4, r13)
            java.lang.Class<om.f> r4 = p214om.C11502f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            om.f r4 = (p214om.C11502f) r4
            wc3.z r4 = r4.mo11462yM()
            android.content.Context r3 = r3.f276837d
            com.tencent.mm.app.r1 r4 = (com.tencent.p014mm.app.C67654r1) r4
            r4.mo93184q(r6, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x0430
        L_0x01cb:
            java.lang.String r3 = r5.getLocalid()
            java.lang.String r4 = "sendVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            com.tencent.mm.autogen.events.SnsVideoMenuEvent r5 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent
            r5.<init>()
            com.tencent.mm.autogen.events.SnsVideoMenuEvent$a r6 = r5.f265214d
            r6.f265215a = r12
            r6.f265219e = r13
            r6.f265218d = r3
            r5.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x01ea:
            java.lang.String r4 = "dealWithEditGroup"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            android.content.Context r3 = r3.f276837d
            int r6 = r5.localid
            com.tencent.p014mm.plugin.sns.p106ui.NewSnsLabelUI.m121602Z7(r3, r6, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r3 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            java.lang.String r4 = vr2.C102236a0.m134728W(r5)
            r5 = 3
            r3.mo131351L(r5, r12, r4)
            goto L_0x0430
        L_0x0205:
            if (r5 == 0) goto L_0x0430
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r5.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            if (r4 != 0) goto L_0x0211
            goto L_0x0430
        L_0x0211:
            int r4 = r5.field_type
            if (r4 == r15) goto L_0x0259
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r6)
            int r5 = vr2.C102236a0.m134709D(r4)
            if (r5 != r14) goto L_0x0252
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r6)
            r5.append(r10)
            java.lang.String r10 = "_tmp"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106458s(r5)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r10)
            java.lang.Class<z51.i> r10 = z51.C102975i.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            z51.i r10 = (z51.C102975i) r10
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r6)
            r10.mo141694GF(r4, r5)
            android.content.Context r3 = r3.f276837d
            com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1.m124461a(r5, r3)
            goto L_0x0430
        L_0x0252:
            android.content.Context r3 = r3.f276837d
            com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1.m124461a(r4, r3)
            goto L_0x0430
        L_0x0259:
            java.lang.String r3 = r5.getLocalid()
            java.lang.String r4 = "saveVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            com.tencent.mm.autogen.events.SnsVideoMenuEvent r5 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent
            r5.<init>()
            com.tencent.mm.autogen.events.SnsVideoMenuEvent$a r6 = r5.f265214d
            r10 = 3
            r6.f265215a = r10
            r6.f265218d = r3
            r5.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x0277:
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r6)
            java.lang.String r5 = "gotoPhotoEditUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r6 == 0) goto L_0x02b4
            java.lang.String r6 = "gotoPhotoEditUI: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119432b(r4, r10)
            android.os.Bundle r6 = r4.f272912M
            java.lang.String r10 = "key_edit_enable_emoji_search"
            r6.putBoolean(r10, r12)
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r6 = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo
            r6.<init>()
            r10 = -1
            r6.f272940d = r10
            r4.f272908I = r6
            hh2.a r13 = hh2.C8532a.f27585a
            android.content.Context r14 = r3.f276837d
            r15 = 0
            r16 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r17 = -1
            r19 = 1
            r20 = 2
            r18 = r4
            r13.mo9446e(r14, r15, r16, r17, r18, r19, r20)
        L_0x02b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x0430
        L_0x02b9:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r4 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            android.content.Context r6 = r3.f276837d
            boolean r4 = r4.checkAvailable(r6)
            if (r4 != 0) goto L_0x02c5
            goto L_0x0430
        L_0x02c5:
            com.tencent.mm.autogen.events.SnsOCRImageEvent r4 = new com.tencent.mm.autogen.events.SnsOCRImageEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SnsOCRImageEvent$a r6 = r4.f265173d
            int r10 = r3.f276851u
            int r10 = vr2.C102236a0.m134724S(r10)
            r6.f265174a = r10
            com.tencent.mm.autogen.events.SnsOCRImageEvent$a r6 = r4.f265173d
            java.lang.String r3 = r3.f276845o
            r6.f265175b = r3
            java.lang.String r3 = r5.getUserName()
            r6.f265176c = r3
            r4.publish()
            goto L_0x0430
        L_0x02e5:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r5.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            int r4 = r4.f298424e
            if (r4 != r12) goto L_0x0430
            u73.r r4 = new u73.r
            r4.<init>()
            android.content.Context r5 = r3.f276837d
            r4.f300283b = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r11 = r6.f298689d
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r10, r11)
            r5.append(r10)
            java.lang.String r10 = vr2.C102236a0.m134717L(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r4.f300288g = r5
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r3.f276844n
            java.lang.String r10 = r5.field_userName
            r4.f300287f = r10
            long r10 = r5.field_snsId
            java.lang.String r5 = vr2.C102236a0.m134765q0(r10)
            r4.f300286e = r5
            r4.f300289h = r6
            int r3 = r3.f276851u
            int r3 = vr2.C102236a0.m134715J(r3)
            r4.f300285d = r3
            java.lang.Class<u73.n> r3 = u73.C101980n.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            u73.n r3 = (u73.C101980n) r3
            r3.mo134683D6(r4)
            goto L_0x0430
        L_0x033c:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r4 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            android.content.Context r5 = r3.f276837d
            boolean r4 = r4.checkAvailable(r5)
            if (r4 != 0) goto L_0x0348
            goto L_0x0430
        L_0x0348:
            com.tencent.mm.autogen.events.SnsTranslateImageEvent r4 = new com.tencent.mm.autogen.events.SnsTranslateImageEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SnsTranslateImageEvent$a r5 = r4.f265206d
            java.lang.String r3 = r3.f276845o
            r5.f265207a = r3
            r4.publish()
            goto L_0x0430
        L_0x0358:
            java.lang.String r4 = "sendData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            if (r5 != 0) goto L_0x036a
            java.lang.String r3 = "error beacause info null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x036a:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            int r11 = r5.field_type
            if (r11 != r12) goto L_0x038b
            java.lang.String r11 = r6.f298689d
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r6)
            android.content.Context r13 = r3.f276837d
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.p106ui.FlipView.m121477k(r6, r13)
            java.lang.String r13 = "sns_send_data_ui_image_path"
            r10.putExtra(r13, r6)
            java.lang.String r6 = "sns_send_data_ui_image_media_id"
            r10.putExtra(r6, r11)
        L_0x038b:
            java.lang.String r6 = "sns_send_data_ui_activity"
            r10.putExtra(r6, r12)
            java.lang.String r5 = r5.getLocalid()
            java.lang.String r6 = "sns_local_id"
            r10.putExtra(r6, r5)
            android.content.Context r3 = r3.f276837d
            java.lang.String r5 = ".ui.chatting.ChattingSendDataToDeviceUI"
            r6 = 0
            ke3.C88144b.m109801s(r3, r5, r10, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x03a8:
            java.lang.String r4 = "dealWithSetPrivated"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            boolean r6 = r5.isWaitPost()
            if (r6 != 0) goto L_0x03f0
            boolean r6 = r5.isDieItem()
            if (r6 == 0) goto L_0x03ba
            goto L_0x03f0
        L_0x03ba:
            com.tencent.mm.plugin.sns.model.g0 r6 = new com.tencent.mm.plugin.sns.model.g0
            long r10 = r5.field_snsId
            r6.<init>((long) r10, (int) r13)
            f40.C86709a0.m107528h()
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r5.mo123460f(r6)
            android.content.Context r10 = r3.f276837d
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r11 = r10.getString(r5)
            android.content.Context r5 = r3.f276837d
            r12 = 2131837126(0x7f1140c6, float:1.9307438E38)
            java.lang.String r12 = r5.getString(r12)
            r13 = 1
            r14 = 1
            com.tencent.mm.plugin.sns.ui.w0 r15 = new com.tencent.mm.plugin.sns.ui.w0
            r15.<init>(r3, r6)
            qo3.i0 r5 = nj3.C76879j.m92723Q(r10, r11, r12, r13, r14, r15)
            r3.f276839f = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x03f0:
            os2.e0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r5 = r5.localid
            r3.mo139814bD(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x0430
        L_0x03fd:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r5.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            int r4 = r4.size()
            if (r4 <= r12) goto L_0x041e
            android.content.Context r4 = r3.f276837d
            r6 = 2131837086(0x7f11409e, float:1.9307357E38)
            java.lang.String r6 = r4.getString(r6)
            com.tencent.mm.plugin.sns.ui.u0 r11 = new com.tencent.mm.plugin.sns.ui.u0
            r11.<init>(r3, r5)
            r12 = 0
            nj3.C76879j.m92750u(r4, r6, r10, r11, r12)
            goto L_0x0430
        L_0x041e:
            r12 = 0
            android.content.Context r4 = r3.f276837d
            r6 = 2131837084(0x7f11409c, float:1.9307353E38)
            java.lang.String r6 = r4.getString(r6)
            com.tencent.mm.plugin.sns.ui.v0 r11 = new com.tencent.mm.plugin.sns.ui.v0
            r11.<init>(r3, r5)
            nj3.C76879j.m92750u(r4, r6, r10, r11, r12)
        L_0x0430:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96214s0.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
