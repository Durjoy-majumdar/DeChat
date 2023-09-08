package com.tencent.p014mm.plugin.sns.p106ui;

import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$h */
public class FlipView$$h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f276825d;

    /* renamed from: e */
    public final /* synthetic */ String f276826e;

    /* renamed from: f */
    public final /* synthetic */ String f276827f;

    /* renamed from: g */
    public final /* synthetic */ FlipView f276828g;

    public FlipView$$h(FlipView flipView, String str, String str2, String str3) {
        this.f276828g = flipView;
        this.f276825d = str;
        this.f276826e = str2;
        this.f276827f = str3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "onMMMenuItemSelected"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.FlipView$5"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.FlipView r3 = r0.f276828g
            java.lang.String r4 = r0.f276825d
            java.lang.String r5 = r0.f276826e
            java.lang.String r6 = r0.f276827f
            int r7 = com.tencent.p014mm.plugin.sns.p106ui.FlipView.f276772S
            java.lang.String r7 = "access$1200"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.FlipView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r3.getClass()
            java.lang.String r9 = "onMenuItemSelected"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            com.tencent.mm.plugin.sns.ui.FlipView$$n r10 = r3.f276775C
            if (r10 == 0) goto L_0x002b
            r10.mo132169a()
        L_0x002b:
            os2.e0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r10.mo139798DN(r4)
            if (r10 != 0) goto L_0x0041
            java.lang.String r3 = "MicroMsg.FlipView"
            java.lang.String r4 = "error beacause info null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x03cf
        L_0x0041:
            int r11 = r17.getItemId()
            r12 = 0
            r14 = 15
            r15 = 1
            r13 = 0
            switch(r11) {
                case 1002: goto L_0x035b;
                case 1003: goto L_0x029f;
                case 1004: goto L_0x023d;
                case 1005: goto L_0x004d;
                case 1006: goto L_0x014c;
                case 1007: goto L_0x004d;
                case 1008: goto L_0x00fe;
                case 1009: goto L_0x00bc;
                case 1010: goto L_0x0080;
                case 1011: goto L_0x0054;
                case 1012: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x03cc
        L_0x004f:
            r3.mo132150l(r5)
            goto L_0x03cc
        L_0x0054:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r4 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            android.content.Context r5 = r3.getContext()
            boolean r4 = r4.checkAvailable(r5)
            if (r4 != 0) goto L_0x0062
            goto L_0x03cc
        L_0x0062:
            com.tencent.mm.autogen.events.SnsOCRImageEvent r4 = new com.tencent.mm.autogen.events.SnsOCRImageEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SnsOCRImageEvent$a r5 = r4.f265173d
            int r3 = r3.f276774B
            int r3 = vr2.C102236a0.m134724S(r3)
            r5.f265174a = r3
            com.tencent.mm.autogen.events.SnsOCRImageEvent$a r3 = r4.f265173d
            r3.f265175b = r6
            java.lang.String r5 = r10.getUserName()
            r3.f265176c = r5
            r4.publish()
            goto L_0x03cc
        L_0x0080:
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r6.mo139798DN(r4)
            u73.r r6 = new u73.r
            r6.<init>()
            android.content.Context r10 = r3.f276797n
            r6.f300283b = r10
            r6.f300288g = r5
            java.lang.String r4 = r4.field_userName
            r6.f300287f = r4
            long r4 = r3.getSnsId()
            java.lang.String r4 = vr2.C102236a0.m134765q0(r4)
            r6.f300286e = r4
            int r4 = r3.f276774B
            int r4 = vr2.C102236a0.m134715J(r4)
            r6.f300285d = r4
            te3.kv2 r3 = r3.getCntMedia()
            r6.f300289h = r3
            java.lang.Class<u73.n> r3 = u73.C101980n.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            u73.n r3 = (u73.C101980n) r3
            r3.mo134683D6(r6)
            goto L_0x03cc
        L_0x00bc:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r4 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            android.content.Context r5 = r3.getContext()
            boolean r4 = r4.checkAvailable(r5)
            if (r4 != 0) goto L_0x00ca
            goto L_0x03cc
        L_0x00ca:
            com.tencent.mm.autogen.events.SnsTranslateImageEvent r4 = new com.tencent.mm.autogen.events.SnsTranslateImageEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SnsTranslateImageEvent$a r5 = r4.f265206d
            r5.f265207a = r6
            r4.publish()
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct
            r4.<init>()
            r5 = 3
            r4.f265619e = r5
            boolean r5 = r3.mo132152n()
            if (r5 == 0) goto L_0x00ea
            r5 = 6
            r4.f265620f = r5
            goto L_0x00ee
        L_0x00ea:
            r5 = 7
            r4.f265620f = r5
        L_0x00ee:
            te3.kv2 r3 = r3.getCntMedia()
            if (r3 == 0) goto L_0x00f9
            java.lang.String r3 = r3.f298692g
            r4.mo126621t(r3)
        L_0x00f9:
            r4.mo86054n()
            goto L_0x03cc
        L_0x00fe:
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r10.getTimeLine()
            te3.j00 r6 = r6.ContentObj
            java.util.LinkedList<te3.kv2> r6 = r6.f298427h
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0111
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x03cf
        L_0x0111:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            int r10 = r10.field_type
            if (r10 != r15) goto L_0x0137
            android.content.Context r10 = r3.f276797n
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.p106ui.FlipView.m121477k(r5, r10)
            if (r5 != 0) goto L_0x0127
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x03cf
        L_0x0127:
            java.lang.String r10 = "sns_send_data_ui_image_path"
            r6.putExtra(r10, r5)
            java.lang.String r5 = r3.getSelectedMediaId()
            java.lang.String r10 = "sns_send_data_ui_image_media_id"
            r6.putExtra(r10, r5)
        L_0x0137:
            java.lang.String r5 = "sns_send_data_ui_activity"
            r6.putExtra(r5, r15)
            java.lang.String r5 = "sns_local_id"
            r6.putExtra(r5, r4)
            android.content.Context r3 = r3.f276797n
            java.lang.String r4 = ".ui.chatting.ChattingSendDataToDeviceUI"
            ke3.C88144b.m109801s(r3, r4, r6, r12)
            goto L_0x03cc
        L_0x014c:
            int r5 = r10.field_type
            if (r5 == r14) goto L_0x01dc
            com.tencent.mm.autogen.events.DoFavoriteEvent r5 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r5.<init>()
            java.lang.String r11 = "fillEventInfoImg"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.transmit.GetFavDataSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r13 = "MicroMsg.Sns.GetFavDataSource"
            if (r6 == 0) goto L_0x019e
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r14 == 0) goto L_0x0167
            goto L_0x019e
        L_0x0167:
            boolean r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r14 == 0) goto L_0x017d
            java.lang.String r4 = "fill favorite event fail, sns core is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r4)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r4 = r5.f264674d
            r6 = 2131825675(0x7f11140b, float:1.9284213E38)
            r4.f264687l = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x01ad
        L_0x017d:
            os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r14.mo139798DN(r4)
            if (r4 != 0) goto L_0x0197
            java.lang.String r4 = "fill favorite event fail, snsInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r4)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r4 = r5.f264674d
            r6 = 2131825658(0x7f1113fa, float:1.9284178E38)
            r4.f264687l = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x01ad
        L_0x0197:
            et2.C97707a.m126003a(r5, r4, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x01ad
        L_0x019e:
            java.lang.String r4 = "fill favorite event fail, event is null or snsId error or position errro"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r4)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r4 = r5.f264674d
            r6 = 2131825657(0x7f1113f9, float:1.9284176E38)
            r4.f264687l = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
        L_0x01ad:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r4 = r5.f264674d
            r6 = 13
            r4.f264688m = r6
            android.content.Context r6 = r3.f276797n
            android.app.Activity r6 = (android.app.Activity) r6
            r4.f264684i = r6
            r5.publish()
            boolean r3 = r3.mo132152n()
            if (r3 == 0) goto L_0x03cc
            com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent r3 = new com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent
            r3.<init>()
            com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent$a r4 = r3.f265135d
            java.lang.String r5 = vr2.C102236a0.m134728W(r10)
            r4.f265136a = r5
            com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent$a r4 = r3.f265135d
            java.lang.String r5 = r10.getLocalid()
            r4.f265137b = r5
            r3.publish()
            goto L_0x03cc
        L_0x01dc:
            boolean r4 = r10.isAd()
            r5 = 14
            if (r4 != 0) goto L_0x0208
            boolean r4 = r3.mo132152n()
            java.lang.String r6 = r10.getLocalid()
            java.lang.String r11 = "favVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r8)
            com.tencent.mm.autogen.events.SnsVideoMenuEvent r12 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent
            r12.<init>()
            com.tencent.mm.autogen.events.SnsVideoMenuEvent$a r13 = r12.f265214d
            r14 = 2
            r13.f265215a = r14
            r13.f265216b = r5
            r13.f265217c = r4
            r13.f265218d = r6
            r12.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r8)
            goto L_0x021d
        L_0x0208:
            com.tencent.mm.autogen.events.DoFavoriteEvent r4 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r4.<init>()
            et2.C97707a.m126006d(r4, r10)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r4.f264674d
            r6.f264688m = r5
            android.content.Context r5 = r3.f276797n
            android.app.Activity r5 = (android.app.Activity) r5
            r6.f264684i = r5
            r4.publish()
        L_0x021d:
            boolean r3 = r3.mo132152n()
            if (r3 == 0) goto L_0x03cc
            com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent r3 = new com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent
            r3.<init>()
            com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent$a r4 = r3.f265135d
            java.lang.String r5 = vr2.C102236a0.m134728W(r10)
            r4.f265136a = r5
            com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent$a r4 = r3.f265135d
            java.lang.String r5 = r10.getLocalid()
            r4.f265137b = r5
            r3.publish()
            goto L_0x03cc
        L_0x023d:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            long r5 = r3.getSnsId()
            java.lang.String r10 = "k_expose_msg_id"
            r4.putExtra(r10, r5)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            long r10 = r3.getSnsId()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.mo139806SE(r10)
            if (r5 != 0) goto L_0x025d
            java.lang.String r5 = ""
            goto L_0x025f
        L_0x025d:
            java.lang.String r5 = r5.field_userName
        L_0x025f:
            java.lang.String r6 = "k_username"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "showShare"
            r4.putExtra(r5, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.p136ui.C74928u.C45092d.f122306a
            r5.append(r6)
            r10 = 33
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r11 = "rawUrl"
            r4.putExtra(r11, r5)
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5[r13] = r10
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r4.putExtra(r11, r5)
            android.content.Context r3 = r3.f276797n
            java.lang.String r5 = "webview"
            java.lang.String r6 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r3, r5, r6, r4, r12)
            goto L_0x03cc
        L_0x029f:
            int r11 = r10.field_type
            if (r11 == r14) goto L_0x0328
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            com.tencent.mm.sendtowework.ImgData r11 = new com.tencent.mm.sendtowework.ImgData
            java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r13)
            r11.<init>(r12)
            java.lang.String r12 = "Select_Data_Send_To_WeWork"
            r6.putExtra(r12, r11)
            java.lang.String r11 = "content_type_forward_to_wework"
            r12 = 2
            r6.putExtra(r11, r12)
            java.lang.String r11 = "Retr_File_Name"
            r6.putExtra(r11, r5)
            java.lang.String r5 = "Retr_Compress_Type"
            r6.putExtra(r5, r13)
            java.lang.String r5 = "Retr_Msg_Type"
            r6.putExtra(r5, r13)
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r10.getTimeLine()
            if (r5 == 0) goto L_0x02e4
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r10.getTimeLine()
            boolean r5 = r5.isExcerpt
            if (r5 == 0) goto L_0x02e4
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r10.getTimeLine()
            java.lang.String r5 = r5.snsExcerptUrl
            java.lang.String r11 = "img_source_url"
            r6.putExtra(r11, r5)
        L_0x02e4:
            boolean r5 = r3.mo132152n()
            java.lang.String r11 = "Retr_FromMainTimeline"
            r6.putExtra(r11, r5)
            java.lang.String r5 = vr2.C102236a0.m134728W(r10)
            java.lang.String r11 = "Retr_KSnsId"
            r6.putExtra(r11, r5)
            java.lang.String r5 = "scene_from"
            r6.putExtra(r5, r14)
            java.lang.String r5 = "msg_forward_sns_obj_id"
            r6.putExtra(r5, r4)
            java.lang.Class<oo.h> r4 = p215oo.C77032h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            oo.h r4 = (p215oo.C77032h) r4
            r5 = 5
            r4.setScene(r5)
            java.lang.Class<om.f> r4 = p214om.C11502f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            om.f r4 = (p214om.C11502f) r4
            wc3.z r4 = r4.mo11462yM()
            android.content.Context r3 = r3.f276797n
            com.tencent.mm.app.r1 r4 = (com.tencent.p014mm.app.C67654r1) r4
            r4.mo93184q(r6, r3)
            com.tencent.mm.plugin.sns.model.k2 r3 = com.tencent.p014mm.plugin.sns.model.C94891k2.f274975a
            r3.mo131070c(r10, r15)
            goto L_0x03cc
        L_0x0328:
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r3, r6)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r10.getTimeLine()
            te3.j00 r3 = r3.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            java.lang.Object r3 = r3.get(r13)
            te3.kv2 r3 = (te3.C101804kv2) r3
            vr2.C102236a0.m134729X(r3)
            java.lang.String r3 = "sendVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            com.tencent.mm.autogen.events.SnsVideoMenuEvent r5 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent
            r5.<init>()
            com.tencent.mm.autogen.events.SnsVideoMenuEvent$a r6 = r5.f265214d
            r6.f265215a = r15
            r10 = 2
            r6.f265219e = r10
            r6.f265218d = r4
            r5.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
            goto L_0x03cc
        L_0x035b:
            int r6 = r10.field_type
            if (r6 == r14) goto L_0x03b4
            int r4 = vr2.C102236a0.m134709D(r5)
            r6 = 4
            if (r4 != r6) goto L_0x0397
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r13)
            r4.append(r6)
            java.lang.String r6 = "_tmp"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106458s(r4)
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)
            java.lang.Class<z51.i> r6 = z51.C102975i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            z51.i r6 = (z51.C102975i) r6
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r13)
            r6.mo141694GF(r5, r4)
            android.content.Context r5 = r3.f276797n
            com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1.m124461a(r4, r5)
            goto L_0x039c
        L_0x0397:
            android.content.Context r4 = r3.f276797n
            com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1.m124461a(r5, r4)
        L_0x039c:
            java.lang.String r4 = "reportExportAsync"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r8)
            zt3.t r5 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.m0 r6 = new com.tencent.mm.plugin.sns.ui.m0
            r6.<init>(r3)
            zt3.j r5 = (zt3.C119157j) r5
            java.lang.String r3 = "SnsImgExportReport"
            r5.mo183876g(r6, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r8)
            goto L_0x03cc
        L_0x03b4:
            java.lang.String r3 = "saveVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            com.tencent.mm.autogen.events.SnsVideoMenuEvent r5 = new com.tencent.mm.autogen.events.SnsVideoMenuEvent
            r5.<init>()
            com.tencent.mm.autogen.events.SnsVideoMenuEvent$a r6 = r5.f265214d
            r10 = 3
            r6.f265215a = r10
            r6.f265218d = r4
            r5.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
        L_0x03cc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
        L_0x03cf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.FlipView$$h.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
