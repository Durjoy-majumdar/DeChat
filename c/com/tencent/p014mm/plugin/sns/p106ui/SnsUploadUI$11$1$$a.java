package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.Toast;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$11$1$$a */
public final /* synthetic */ class SnsUploadUI$11$1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadUI.C9567811.C956791 f278979d;

    /* renamed from: e */
    public final /* synthetic */ Toast f278980e;

    public /* synthetic */ SnsUploadUI$11$1$$a(SnsUploadUI.C9567811.C956791 r1, Toast toast) {
        this.f278979d = r1;
        this.f278980e = toast;
    }

    /* JADX WARNING: Removed duplicated region for block: B:248:0x0915  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0931  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r1 = r35
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$11$1 r0 = r1.f278979d
            android.widget.Toast r2 = r1.f278980e
            r0.getClass()
            java.lang.String r3 = "lambda$doWhenOK$0"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI$11$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            if (r2 == 0) goto L_0x0016
            r2.cancel()
        L_0x0016:
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$11 r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.C9567811.this
            com.tencent.mm.plugin.sns.ui.SnsUploadUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.f278903Q0
            java.lang.String r5 = "access$2000"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r2.getClass()
            java.lang.String r7 = "handlePostCore"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            r8 = 3
            r2.f278939p0 = r8
            java.lang.String r0 = "regHellBizId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HellBizIdEvent> r9 = r2.f278950y0
            r9.alive()
            java.lang.Class<h81.i> r9 = h81.C59774i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            h81.i r9 = (h81.C59774i) r9
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x005b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r2.hashCode()
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r9.mo84755tA(r11)
        L_0x005b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r0 = r2.f278938p
            r0.getClass()
            java.lang.String r9 = "saveSyncFlagStatus"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)
            int r0 = r0.getSyncFlag()
            f40.C86709a0.m107528h()
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13 = 68404(0x10b34, float:9.5854E-41)
            r12.mo119676J(r13, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            com.tencent.mm.ui.widget.cedit.api.a r0 = r2.f278931f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r2.f278933h = r0
            ks2.z r0 = r2.mo133078P7()
            com.tencent.mm.ui.widget.cedit.api.a r9 = r2.f278931f
            android.text.Layout r9 = r9.getLayout()
            r0.mo138556d(r9)
            r9 = 1
            r0.mo138555c(r9, r9)
            java.lang.String r0 = r2.f278933h
            com.tencent.mm.ui.widget.cedit.api.a r11 = r2.f278931f
            java.lang.CharSequence r11 = r11.getPasterContent()
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            java.lang.String r11 = "MicroMsg.SnsUploadUI"
            r12 = 0
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "paste clip board to send"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            com.tencent.mm.ui.widget.cedit.api.a r13 = r2.f278931f
            boolean r13 = r13.getSimilarPasteChange()
            com.tencent.mm.ui.widget.cedit.api.a r14 = r2.f278931f
            java.lang.String r14 = r14.getSimilarPasteSeqStr()
            com.tencent.mm.ui.widget.cedit.api.a r15 = r2.f278931f
            android.text.Editable r15 = r15.getText()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.ClipboardHelper.isCopyFromWX(r15)
            com.tencent.mm.ui.widget.cedit.api.a r8 = r2.f278931f
            r8.mo104453p()
            if (r0 == 0) goto L_0x00e3
            if (r15 == 0) goto L_0x00df
            r0 = 4
            goto L_0x00e1
        L_0x00df:
            r0 = 8
        L_0x00e1:
            r0 = r0 | r12
            goto L_0x00e4
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            if (r13 == 0) goto L_0x00ee
            if (r15 == 0) goto L_0x00eb
            r13 = 16
            goto L_0x00ed
        L_0x00eb:
            r13 = 32
        L_0x00ed:
            r0 = r0 | r13
        L_0x00ee:
            java.util.HashMap<java.lang.Integer, ns2.a$a> r13 = ns2.C100157a.f293382a
            java.lang.String r13 = "saveState"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)
            java.util.HashMap<java.lang.Integer, ns2.a$a> r8 = ns2.C100157a.f293382a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            ns2.a$a r9 = new ns2.a$a
            r9.<init>(r0, r14)
            r8.put(r12, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)
            com.tencent.mm.plugin.sns.statistics.x r0 = com.tencent.p014mm.plugin.sns.statistics.C95005x.f275632a
            r8 = 3
            r0.mo131407b(r8)
            com.tencent.mm.ui.widget.cedit.api.a r0 = r2.f278931f
            int r0 = r0.getPasterLen()
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r8 = r2.f278938p
            int r8 = r8.getPrivated()
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r9 = r2.f278938p
            int r9 = r9.getSyncFlag()
            boolean r12 = r2.f278908E
            r13 = -1
            if (r12 == 0) goto L_0x013e
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            com.tencent.mm.ui.widget.cedit.api.a r14 = r2.f278931f
            android.text.Editable r14 = r14.getText()
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "sns_upload_desc"
            r12.putExtra(r15, r14)
            r2.setResult(r13, r12)
        L_0x013e:
            com.tencent.mm.plugin.sns.ui.f1 r12 = r2.f278944u
            boolean r14 = r12 instanceof com.tencent.p014mm.plugin.sns.p106ui.C95754d2
            if (r14 == 0) goto L_0x015d
            com.tencent.mm.plugin.sns.ui.d2 r12 = (com.tencent.p014mm.plugin.sns.p106ui.C95754d2) r12
            com.tencent.mm.plugin.sns.ui.LocationWidget r14 = r2.f278935j
            te3.kr2 r14 = r14.getCurLocation()
            r12.getClass()
            java.lang.String r15 = "setCurLoction"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r13)
            r12.f279309A = r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r13)
            goto L_0x0166
        L_0x015d:
            boolean r12 = r12 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96310x1
            if (r12 == 0) goto L_0x0166
            com.tencent.mm.ui.widget.cedit.api.a r12 = r2.f278931f
            r12.setText(r10)
        L_0x0166:
            r12 = 1
            r2.f278910G = r12
            com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt
            r12.<init>()
            com.tencent.mm.plugin.sns.ui.f1 r13 = r2.f278944u
            boolean r14 = r13 instanceof com.tencent.p014mm.plugin.sns.p106ui.C95711a
            if (r14 == 0) goto L_0x01f2
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r14 = "param_is_privated"
            r13.putInt(r14, r8)
            java.lang.String r8 = r2.f278933h
            java.lang.String r14 = "param_description"
            r13.putString(r14, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            com.tencent.mm.plugin.sns.ui.AtContactWidget r14 = r2.f278934i
            java.util.List r14 = r14.getAtList()
            r8.<init>(r14)
            java.lang.String r14 = "param_with_list"
            r13.putStringArrayList(r14, r8)
            java.lang.String r8 = "param_paste_len"
            r13.putInt(r8, r0)
            java.lang.String r0 = "param_localtion"
            com.tencent.mm.plugin.sns.ui.LocationWidget r8 = r2.f278935j     // Catch:{ IOException -> 0x01af }
            te3.kr2 r8 = r8.getLocation()     // Catch:{ IOException -> 0x01af }
            byte[] r8 = r8.toByteArray()     // Catch:{ IOException -> 0x01af }
            r13.putByteArray(r0, r8)     // Catch:{ IOException -> 0x01af }
            goto L_0x01b9
        L_0x01af:
            r0 = move-exception
            r8 = 0
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.String r8 = "parse location error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r8, r14)
        L_0x01b9:
            boolean r0 = r2.f278907D
            java.lang.String r8 = "param_is_black_group"
            r13.putBoolean(r8, r0)
            java.util.ArrayList<java.lang.String> r0 = r2.f278904A
            java.lang.String r8 = "param_group_user"
            r13.putStringArrayList(r8, r0)
            int r0 = r2.f278905B
            java.lang.String r8 = "param_contact_tag_count"
            r13.putInt(r8, r0)
            int r0 = r2.f278906C
            java.lang.String r8 = "param_temp_user_count"
            r13.putInt(r8, r0)
            com.tencent.mm.plugin.sns.ui.f1 r0 = r2.f278944u
            com.tencent.mm.plugin.sns.ui.a r0 = (com.tencent.p014mm.plugin.sns.p106ui.C95711a) r0
            int r0 = r0.mo133156k()
            r12.value = r0
            com.tencent.mm.plugin.sns.ui.f1 r0 = r2.f278944u
            com.tencent.mm.plugin.sns.ui.a r0 = (com.tencent.p014mm.plugin.sns.p106ui.C95711a) r0
            r0.mo133155j(r13)
            r32 = r3
            r33 = r4
            r34 = r5
            goto L_0x02ad
        L_0x01f2:
            boolean r14 = r13 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96157q
            if (r14 == 0) goto L_0x0257
            com.tencent.mm.plugin.sns.ui.q r13 = (com.tencent.p014mm.plugin.sns.p106ui.C96157q) r13
            java.util.ArrayList<java.lang.String> r14 = r2.f278951z
            r13.getClass()
            java.lang.String r15 = "setSelectLabelIds"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.BaseWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r1)
            if (r14 == 0) goto L_0x0214
            boolean r17 = r14.isEmpty()
            if (r17 == 0) goto L_0x020e
            goto L_0x0214
        L_0x020e:
            r13.f280903a = r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r1)
            goto L_0x0217
        L_0x0214:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r1)
        L_0x0217:
            com.tencent.mm.plugin.sns.ui.f1 r13 = r2.f278944u
            com.tencent.mm.plugin.sns.ui.q r13 = (com.tencent.p014mm.plugin.sns.p106ui.C96157q) r13
            com.tencent.mm.plugin.sns.ui.BaseRangeWidget r14 = r2.f278936n
            int r14 = r14.getLabelRange()
            r13.getClass()
            java.lang.String r15 = "setupLabelVisibility"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r1)
            r32 = r3
            java.util.ArrayList<java.lang.String> r3 = r13.f280903a
            int r3 = r3.size()
            r33 = r4
            if (r14 == 0) goto L_0x0253
            r4 = 1
            if (r14 == r4) goto L_0x0253
            if (r3 != 0) goto L_0x023c
            goto L_0x0253
        L_0x023c:
            r3 = 2
            if (r14 != r3) goto L_0x0246
            int r3 = r13.f280904b
            r3 = r3 | 512(0x200, float:7.175E-43)
            r13.f280904b = r3
            goto L_0x024f
        L_0x0246:
            r3 = 3
            if (r14 != r3) goto L_0x024f
            int r3 = r13.f280904b
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r13.f280904b = r3
        L_0x024f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r1)
            goto L_0x025b
        L_0x0253:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r1)
            goto L_0x025b
        L_0x0257:
            r32 = r3
            r33 = r4
        L_0x025b:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.util.ArrayList<java.lang.String> r1 = r2.f278904A
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "before widget commit mContactNameList count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r3)
            com.tencent.mm.plugin.sns.ui.f1 r1 = r2.f278944u
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r3 = r2.f278938p
            g34.i r20 = r3.getTwitterAccessToken()
            java.lang.String r3 = r2.f278933h
            com.tencent.mm.plugin.sns.ui.AtContactWidget r4 = r2.f278934i
            java.util.List r22 = r4.getAtList()
            com.tencent.mm.plugin.sns.ui.LocationWidget r4 = r2.f278935j
            te3.kr2 r23 = r4.getLocation()
            r24 = 0
            boolean r4 = r2.f278907D
            java.util.ArrayList<java.lang.String> r13 = r2.f278904A
            java.lang.String r14 = r2.f278911H
            int r15 = r2.f278905B
            r34 = r5
            int r5 = r2.f278906C
            r17 = r1
            r18 = r8
            r19 = r9
            r21 = r3
            r25 = r0
            r26 = r4
            r27 = r13
            r28 = r12
            r29 = r14
            r30 = r15
            r31 = r5
            r17.mo132127e(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x02ad:
            java.lang.String r1 = "saveRangeCache"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
            java.lang.String r0 = r2.f278947x
            java.lang.String r3 = ","
            java.util.List r0 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r0, r3)
            java.lang.String r4 = r2.f278945v
            java.util.List r4 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r4, r3)
            java.lang.String r5 = r2.f278949y
            java.util.List r5 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r5, r3)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            java.lang.String r15 = ";"
            if (r14 != 0) goto L_0x034b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x02e2:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x0332
            java.lang.Object r17 = r4.next()
            r18 = r4
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4
            r17 = r7
            ms2.p r7 = new ms2.p
            r7.<init>()
            b22.b r19 = b22.C28250a.m38138a()
            r20 = r10
            r10 = r19
            a22.a r10 = (a22.C67001a) r10
            java.lang.String r4 = r10.mo90968f(r4)
            boolean r10 = r13.contains(r4)
            if (r10 != 0) goto L_0x032b
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r10 == 0) goto L_0x0314
            goto L_0x032b
        L_0x0314:
            if (r4 != 0) goto L_0x0319
            r10 = r20
            goto L_0x031a
        L_0x0319:
            r10 = r4
        L_0x031a:
            r7.f175150d = r10
            r10 = 1
            r7.f175151e = r10
            r8.add(r7)
            r13.add(r4)
            r14.append(r4)
            r14.append(r15)
        L_0x032b:
            r7 = r17
            r4 = r18
            r10 = r20
            goto L_0x02e2
        L_0x0332:
            r17 = r7
            r20 = r10
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r4 = r2.f278945v
            r10 = 0
            r7[r10] = r4
            java.lang.String r4 = r14.toString()
            r10 = 1
            r7[r10] = r4
            java.lang.String r4 = "[saveRangeCache] mLabelNameList:%s  idList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r4, r7)
            goto L_0x034f
        L_0x034b:
            r17 = r7
            r20 = r10
        L_0x034f:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r4 != 0) goto L_0x0376
            r4 = 0
        L_0x0356:
            int r7 = r5.size()
            if (r4 >= r7) goto L_0x0376
            java.lang.Object r7 = r5.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            ms2.p r10 = new ms2.p
            r10.<init>()
            if (r7 != 0) goto L_0x036b
            r7 = r20
        L_0x036b:
            r10.f175150d = r7
            r7 = 2
            r10.f175151e = r7
            r8.add(r10)
            int r4 = r4 + 1
            goto L_0x0356
        L_0x0376:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r4 != 0) goto L_0x039e
            java.util.Iterator r0 = r0.iterator()
        L_0x0380:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x039e
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            ms2.p r5 = new ms2.p
            r5.<init>()
            if (r4 != 0) goto L_0x0395
            r4 = r20
        L_0x0395:
            r5.f175150d = r4
            r4 = 0
            r5.f175151e = r4
            r8.add(r5)
            goto L_0x0380
        L_0x039e:
            java.util.ArrayList<java.lang.String> r0 = r2.f278951z
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x03e7
            java.util.ArrayList<java.lang.String> r0 = r2.f278951z
            java.util.Iterator r0 = r0.iterator()
        L_0x03ac:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x03d6
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r13.contains(r4)
            if (r5 != 0) goto L_0x03ac
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x03c5
            goto L_0x03ac
        L_0x03c5:
            ms2.p r5 = new ms2.p
            r5.<init>()
            r5.f175150d = r4
            r7 = 1
            r5.f175151e = r7
            r8.add(r5)
            r13.add(r4)
            goto L_0x03ac
        L_0x03d6:
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.util.ArrayList<java.lang.String> r4 = r2.f278951z
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r4, r3)
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "[saveRangeCache] labelIdList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
        L_0x03e7:
            com.tencent.mm.plugin.sns.model.p2 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            boolean r4 = r2.f278907D
            r0.getClass()
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r8)
            if (r7 == 0) goto L_0x0400
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            goto L_0x0531
        L_0x0400:
            ms2.o r7 = r0.f275129e
            r7.f175149f = r4
            java.util.LinkedList<ms2.p> r4 = r7.f175147d
            r4.clear()
            ms2.o r4 = r0.f275129e
            java.util.LinkedList<ms2.p> r4 = r4.f175147d
            r4.addAll(r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            ms2.o r7 = r0.f275129e
            java.util.LinkedList<ms2.p> r7 = r7.f175148e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
            if (r7 == 0) goto L_0x0438
            java.util.Iterator r7 = r8.iterator()
        L_0x0423:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0474
            java.lang.Object r8 = r7.next()
            ms2.p r8 = (ms2.C61579p) r8
            int r13 = r8.f175151e
            r14 = 2
            if (r13 != r14) goto L_0x0423
            r4.add(r8)
            goto L_0x0423
        L_0x0438:
            java.util.Iterator r7 = r8.iterator()
        L_0x043c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0474
            java.lang.Object r8 = r7.next()
            ms2.p r8 = (ms2.C61579p) r8
            int r13 = r8.f175151e
            r14 = 2
            if (r13 != r14) goto L_0x043c
            ms2.o r13 = r0.f275129e
            java.util.LinkedList<ms2.p> r13 = r13.f175148e
            java.util.Iterator r13 = r13.iterator()
        L_0x0455:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x046d
            java.lang.Object r14 = r13.next()
            ms2.p r14 = (ms2.C61579p) r14
            java.lang.String r14 = r14.f175150d
            java.lang.String r10 = r8.f175150d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r10)
            if (r10 == 0) goto L_0x0455
            r10 = 1
            goto L_0x046e
        L_0x046d:
            r10 = 0
        L_0x046e:
            if (r10 != 0) goto L_0x043c
            r4.add(r8)
            goto L_0x043c
        L_0x0474:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r7 != 0) goto L_0x0482
            ms2.o r7 = r0.f275129e
            java.util.LinkedList<ms2.p> r7 = r7.f175148e
            r8 = 0
            r7.addAll(r8, r4)
        L_0x0482:
            ms2.o r4 = r0.f275129e
            java.util.LinkedList<ms2.p> r4 = r4.f175148e
            int r4 = r4.size()
            r7 = 5
            if (r4 <= r7) goto L_0x04ac
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            ms2.o r8 = r0.f275129e
            java.util.LinkedList<ms2.p> r8 = r8.f175148e
            r4.addAll(r8)
            ms2.o r8 = r0.f275129e
            java.util.LinkedList<ms2.p> r8 = r8.f175148e
            r8.clear()
            ms2.o r8 = r0.f275129e
            java.util.LinkedList<ms2.p> r8 = r8.f175148e
            r10 = 0
            java.util.List r4 = r4.subList(r10, r7)
            r8.addAll(r4)
        L_0x04ac:
            ms2.o r0 = r0.f275129e     // Catch:{ IOException -> 0x04bb }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x04bb }
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94928p2.f275124h     // Catch:{ IOException -> 0x04bb }
            int r7 = r0.length     // Catch:{ IOException -> 0x04bb }
            r8 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r4, r0, r8, r7)     // Catch:{ IOException -> 0x04bb }
            r8 = 0
            goto L_0x04db
        L_0x04bb:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "listToFile failed: "
            r4.append(r7)
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94928p2.f275124h
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r13 = "MicroMsg.UploadManager"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r4, r10)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
        L_0x04db:
            java.lang.String r0 = "enableNewLabelRangeControl"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC
            int r7 = r7.mo119689j(r10, r8)
            if (r7 == 0) goto L_0x0518
            java.lang.String r10 = "MicroMsg.SnsLabelRangeConfig"
            r13 = 2
            if (r7 == r13) goto L_0x0507
            boolean r7 = mt2.C47101a.f126572a
            if (r7 == 0) goto L_0x0502
            java.lang.String r7 = "enableNewLabelRangeControl false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            mt2.C47101a.f126572a = r8
        L_0x0502:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r7 = 0
            goto L_0x051d
        L_0x0507:
            boolean r7 = mt2.C47101a.f126572a
            if (r7 != 0) goto L_0x0513
            java.lang.String r7 = "enableNewLabelRangeControl true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            r7 = 1
            mt2.C47101a.f126572a = r7
        L_0x0513:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r7 = 1
            goto L_0x051d
        L_0x0518:
            boolean r7 = mt2.C47101a.f126572a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x051d:
            if (r7 == 0) goto L_0x052e
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_UPLOAD_USED_NEW_GROUP_BOOLEAN_SYNC
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0.mo119677K(r4, r7)
        L_0x052e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
        L_0x0531:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            com.tencent.mm.plugin.sns.ui.LocationWidget r0 = r2.f278935j
            te3.kr2 r0 = r0.getLocation()
            com.tencent.mm.plugin.sns.ui.AtContactWidget r1 = r2.f278934i
            java.util.List r1 = r1.getAtList()
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r4 = r2.f278938p
            int r4 = r4.getPrivated()
            r5 = 1
            if (r4 != r5) goto L_0x054b
            r4 = 1
            goto L_0x054c
        L_0x054b:
            r4 = 0
        L_0x054c:
            boolean r5 = r2.f278907D
            java.util.ArrayList<java.lang.String> r7 = r2.f278904A
            java.lang.String r8 = r2.f278933h
            com.tencent.mm.plugin.sns.statistics.w$a r10 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            java.lang.String r10 = "clickSendButton"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            com.tencent.mm.plugin.sns.statistics.w$a r14 = new com.tencent.mm.plugin.sns.statistics.w$a
            r14.<init>()
            com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a = r14
            r19 = r11
            r21 = r12
            long r11 = java.lang.System.currentTimeMillis()
            r14.f275628b = r11
            com.tencent.mm.plugin.sns.statistics.w$a r11 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r11 = r11.f275627a
            r14 = r8
            r12 = r9
            r8 = 1
            r11.f266194i = r8
            r11 = 2
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r9 = r0.f298649f
            java.lang.String r11 = "getValidString"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            boolean r24 = android.text.TextUtils.isEmpty(r9)
            if (r24 == 0) goto L_0x058c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            r9 = r20
            goto L_0x058f
        L_0x058c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
        L_0x058f:
            r16 = 0
            r8[r16] = r9
            java.lang.String r0 = r0.f298650g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 == 0) goto L_0x05a4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            r0 = r20
            goto L_0x05a7
        L_0x05a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
        L_0x05a7:
            r9 = 1
            r8[r9] = r0
            java.lang.String r0 = "city:%s poi:%s"
            java.lang.String r0 = java.lang.String.format(r0, r8)
            com.tencent.mm.plugin.sns.statistics.w$a r8 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r8 = r8.f275627a
            java.lang.String r0 = r0.replaceAll(r3, r15)
            java.lang.String r11 = "Address"
            java.lang.String r0 = r8.mo86045b(r11, r0, r9)
            r8.f266205t = r0
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r0 = r0.f275627a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.Iterator r9 = r1.iterator()
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x05e6
        L_0x05d3:
            java.lang.Object r11 = r9.next()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r8.append(r11)
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x05e6
            r8.append(r15)
            goto L_0x05d3
        L_0x05e6:
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "RemindSbStr"
            r11 = 1
            java.lang.String r8 = r0.mo86045b(r9, r8, r11)
            r0.f266207v = r8
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r0 = r0.f275627a
            int r1 = r1.size()
            r0.f266206u = r1
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r0 = r0.f275627a
            if (r4 == 0) goto L_0x0605
            r1 = 2
            goto L_0x0606
        L_0x0605:
            r1 = 1
        L_0x0606:
            r0.f266208w = r1
            if (r5 == 0) goto L_0x0644
            int r1 = r7.size()
            r0.f266211z = r1
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r0 = r0.f275627a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r7.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0636
        L_0x0623:
            java.lang.Object r5 = r4.next()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.append(r5)
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0636
            r1.append(r15)
            goto L_0x0623
        L_0x0636:
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "InvisiblePartStr"
            r5 = 1
            java.lang.String r1 = r0.mo86045b(r4, r1, r5)
            r0.f266186A = r1
            goto L_0x067d
        L_0x0644:
            int r1 = r7.size()
            r0.f266209x = r1
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r0 = r0.f275627a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r7.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0670
        L_0x065d:
            java.lang.Object r5 = r4.next()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.append(r5)
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0670
            r1.append(r15)
            goto L_0x065d
        L_0x0670:
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "VisiblePartStr"
            r5 = 1
            java.lang.String r1 = r0.mo86045b(r4, r1, r5)
            r0.f266210y = r1
        L_0x067d:
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct r0 = r0.f275627a
            r0.f266187B = r12
            java.lang.String r1 = "encryptContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
            if (r14 == 0) goto L_0x06ce
            boolean r4 = android.text.TextUtils.isEmpty(r14)
            if (r4 == 0) goto L_0x0691
            goto L_0x06ce
        L_0x0691:
            int r4 = r14.length()
            r5 = 2
            if (r4 > r5) goto L_0x069d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r8 = r14
            goto L_0x06d3
        L_0x069d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            char r7 = r14.charAt(r5)
            r4.append(r7)
            java.lang.String r5 = "*"
            r4.append(r5)
            int r7 = r14.length()
            r4.append(r7)
            r4.append(r5)
            int r5 = r14.length()
            r7 = -1
            int r5 = r5 + r7
            char r5 = r14.charAt(r5)
            r4.append(r5)
            java.lang.String r8 = r4.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            goto L_0x06d3
        L_0x06ce:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r8 = r20
        L_0x06d3:
            java.lang.String r1 = "EncryptContent"
            r4 = 1
            java.lang.String r1 = r0.mo86045b(r1, r8, r4)
            r0.f266188C = r1
            com.tencent.mm.plugin.sns.statistics.w$a r0 = com.tencent.p014mm.plugin.sns.statistics.C95003w.f275626a
            com.tencent.p014mm.plugin.sns.statistics.C95003w.m120754b(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 13303(0x33f7, float:1.8641E-41)
            r4 = 5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            long r7 = r2.f278943t
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r7 = 0
            r5[r7] = r4
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r7 = 1
            r5[r7] = r4
            boolean r4 = r2.f278942s
            r4 = r4 ^ r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r5[r7] = r4
            r4 = r21
            int r7 = r4.value
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 3
            r5[r8] = r7
            r7 = 4
            r5[r7] = r20
            r0.mo160131h(r1, r5)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            long r7 = r2.f278943t
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r7 = 0
            r1[r7] = r5
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r7 = 1
            r1[r7] = r5
            boolean r5 = r2.f278942s
            r5 = r5 ^ r7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 2
            r1[r7] = r5
            int r4 = r4.value
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r1[r5] = r4
            java.lang.String r4 = "reprot timelinePostAction(13303), %d, %d, %d, %d"
            r5 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r1)
            r1 = 10910(0x2a9e, float:1.5288E-41)
            java.lang.String r4 = "1"
            r0.kvStat(r1, r4)
            java.lang.String r1 = r2.f278945v
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x079b
            boolean r1 = r2.f278907D
            r4 = 11455(0x2cbf, float:1.6052E-41)
            if (r1 == 0) goto L_0x077e
            r1 = 4
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r7 = 0
            r5[r7] = r20
            java.lang.String r8 = r2.f278945v
            r9 = 1
            r5[r9] = r8
            r8 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r11 = 2
            r5[r11] = r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 3
            r5[r10] = r8
            r0.mo160131h(r4, r5)
            goto L_0x079b
        L_0x077e:
            r1 = 4
            r7 = 0
            r8 = -1
            r9 = 1
            r10 = 3
            r11 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r1 = r2.f278945v
            r5[r7] = r1
            r5[r9] = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r5[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r5[r10] = r1
            r0.mo160131h(r4, r5)
        L_0x079b:
            boolean r1 = r2.f278909F
            if (r1 == 0) goto L_0x07b7
            hy.o0$a r1 = new hy.o0$a
            r1.<init>()
            r4 = 0
            r1.f223351g = r4
            r4 = 1
            r1.f223345a = r4
            java.lang.Class<hy.o0> r4 = p166hy.C98567o0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            hy.o0 r4 = (p166hy.C98567o0) r4
            r5 = 0
            r7 = 3
            r4.yb0(r2, r5, r7, r1)
        L_0x07b7:
            android.content.Intent r1 = r2.getIntent()
            java.lang.String r4 = "MicroMsg.SnsShareReportUtil"
            java.lang.String r5 = "UTF-8"
            java.lang.String r7 = "snsShareReport"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsShareReportUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = "Ksnsupload_timeline"
            android.os.Bundle r9 = r1.getBundleExtra(r9)
            if (r9 != 0) goto L_0x07d3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x0801
        L_0x07d3:
            java.lang.String r10 = "Ksnsupload_appid"
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r1, r10)
            java.lang.String r11 = "Ksnsupload_appname"
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r1, r11)
            java.lang.String r12 = "Ksnsupload_open_sdk_version"
            r13 = 0
            int r12 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getIntExtra(r1, r12, r13)
            java.lang.String r14 = "KThrid_app"
            boolean r14 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r1, r14, r13)
            java.lang.String r15 = "Ksnsupload_app_is_game"
            boolean r1 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r1, r15, r13)
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r13 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            r13.<init>()
            r13.fromBundle(r9)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r13.message
            if (r9 != 0) goto L_0x0807
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x0801:
            r21 = r2
            r19 = r6
            goto L_0x08fe
        L_0x0807:
            java.lang.String r13 = com.tencent.p014mm.pluginsdk.p133ui.tools.C85646a.m105756b(r9)     // Catch:{ UnsupportedEncodingException -> 0x08ef }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)     // Catch:{ UnsupportedEncodingException -> 0x08ef }
            java.lang.String r13 = p206nj.C117627q.m165909b(r13, r5)     // Catch:{ UnsupportedEncodingException -> 0x08ef }
            java.lang.String r15 = com.tencent.p014mm.pluginsdk.p133ui.tools.C85646a.m105755a(r9)     // Catch:{ UnsupportedEncodingException -> 0x08ef }
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)     // Catch:{ UnsupportedEncodingException -> 0x08ef }
            java.lang.String r15 = p206nj.C117627q.m165909b(r15, r5)     // Catch:{ UnsupportedEncodingException -> 0x08ef }
            r19 = r6
            java.lang.String r6 = r9.title     // Catch:{ UnsupportedEncodingException -> 0x08ea }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ UnsupportedEncodingException -> 0x08ea }
            java.lang.String r6 = p206nj.C117627q.m165909b(r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x08ea }
            r21 = r2
            java.lang.String r2 = r9.description     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            java.lang.String r2 = p206nj.C117627q.m165909b(r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r10)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08ec }
            r24 = r7
            int r7 = r9.getType()     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r7 = 2
            r5.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            if (r14 == 0) goto L_0x086b
            r7 = 1
            goto L_0x086c
        L_0x086b:
            r7 = 2
        L_0x086c:
            r5.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            java.lang.String r7 = ",,"
            r5.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            java.lang.String r3 = r5.toString()     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r3 = 16492(0x406c, float:2.311E-41)
            r5 = 15
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r12 = 0
            r5[r12] = r7     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r7 = 1
            r5[r7] = r10     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r7 = 2
            r5[r7] = r11     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r7 = 3
            r5[r7] = r1     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            int r1 = r9.getType()     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r7 = 4
            r5[r7] = r1     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r9 = 5
            r5[r9] = r7     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r7 = 6
            if (r14 == 0) goto L_0x08c1
            r1 = 1
        L_0x08c1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r5[r7] = r1     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 7
            r5[r1] = r20     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 8
            r5[r1] = r6     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 9
            r5[r1] = r2     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 10
            r5[r1] = r13     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 11
            r5[r1] = r20     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 12
            r5[r1] = r20     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 13
            r5[r1] = r20     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r1 = 14
            r5[r1] = r15     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            r0.mo160131h(r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x08f4 }
            goto L_0x08f9
        L_0x08ea:
            r21 = r2
        L_0x08ec:
            r24 = r7
            goto L_0x08f4
        L_0x08ef:
            r21 = r2
            r19 = r6
            goto L_0x08ec
        L_0x08f4:
            java.lang.String r0 = "URLEncoder.encode Error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x08f9:
            r0 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
        L_0x08fe:
            com.tencent.mm.autogen.events.SnsUploadPostDoneEvent r0 = new com.tencent.mm.autogen.events.SnsUploadPostDoneEvent
            r0.<init>()
            r0.publish()
            r1 = r21
            r2 = 1
            r1.mo133082U7(r2)
            r1.mo133083V7()
            boolean r0 = r1.f278920R
            java.lang.String r2 = "Sessionid"
            if (r0 == 0) goto L_0x0931
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131390w()
            r3 = 1
            r0.f266438j = r3
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131390w()
            java.lang.String r1 = vr2.C102236a0.m134754l()
            r3 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f266436h = r1
            goto L_0x094e
        L_0x0931:
            r3 = 1
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131390w()
            java.lang.String r4 = r1.f278912I
            java.lang.String r4 = r0.mo86045b(r2, r4, r3)
            r0.f266436h = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131346G()
            java.lang.String r1 = r1.f278912I
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f266436h = r1
        L_0x094e:
            vr2.C102236a0.m134756m()
            r2 = r17
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r2 = r34
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r1 = r32
            r2 = r33
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI$11$1$$a.run():void");
    }
}
