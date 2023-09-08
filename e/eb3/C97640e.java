package eb3;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import gy3.C87412m;
import wx2.C66204d;

/* renamed from: eb3.e */
public final class C97640e implements C66204d.C38350a {
    /* renamed from: D1 */
    public void mo61631D1(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: xa3.r} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61632Q0(com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "MicroMsg.NoteMultiTaskHelper"
            java.lang.String r2 = "multiTaskInfo"
            gy3.C87412m.m108594g(r0, r2)
            te3.f43 r2 = new te3.f43
            r2.<init>()
            byte[] r0 = r0.field_data     // Catch:{ Exception -> 0x02ff }
            r2.parseFrom(r0)     // Catch:{ Exception -> 0x02ff }
            te3.ry r3 = new te3.ry
            r3.<init>()
            r4 = 1
            r3.f141212f = r4
            int r0 = r2.f183078d
            java.lang.String r2 = r2.f183079e
            java.lang.String r5 = "showShare"
            r6 = 2
            java.lang.String r7 = "key_multi_task_common_info"
            r8 = 0
            r9 = 0
            if (r0 == r4) goto L_0x0191
            if (r0 == r6) goto L_0x0133
            r5 = 3
            if (r0 == r5) goto L_0x0032
            goto L_0x02fe
        L_0x0032:
            java.lang.String r0 = "click WNNoteBanner"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            xa3.r r0 = new xa3.r     // Catch:{ Exception -> 0x008b }
            r0.<init>()     // Catch:{ Exception -> 0x008b }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x008b }
            r10.<init>(r2)     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topIsOpenFromSession"
            boolean r2 = r10.getBoolean(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302105d = r2     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topLocalId"
            long r11 = r10.getLong(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302106e = r11     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topMsgId"
            long r11 = r10.getLong(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302107f = r11     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "isChatRoom"
            boolean r2 = r10.getBoolean(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302108g = r2     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topTitle"
            java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302109h = r2     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topNoteXml"
            java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302110i = r2     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topLastPosition"
            int r2 = r10.getInt(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302111j = r2     // Catch:{ Exception -> 0x008b }
            java.lang.String r2 = "topLastOffset"
            int r2 = r10.getInt(r2)     // Catch:{ Exception -> 0x008b }
            r0.f302112n = r2     // Catch:{ Exception -> 0x008b }
            r8 = r0
            goto L_0x0094
        L_0x008b:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r9 = "parseWNNoteKeepTopItem"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r9, r2)
        L_0x0094:
            if (r8 != 0) goto L_0x009c
            java.lang.String r0 = "WNNoteKeepTopItem data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        L_0x009c:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            byte[] r0 = r3.toByteArray()
            r10.putByteArray(r7, r0)
            boolean r0 = r8.f302105d
            r2 = 8
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "isOpenFromSession: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            wa3.n r0 = new wa3.n
            r0.<init>()
            java.lang.String r1 = va3.C102166c.m134611F0(r8)
            r0.f301476p = r1
            r0.f301477q = r5
            wa3.f r1 = r0.f301472i
            boolean r3 = r8.f302108g
            if (r3 == 0) goto L_0x00c8
            r6 = 3
        L_0x00c8:
            r1.f301480b = r6
            i00.b r1 = wa3.C102364c.vx0()
            r1.X00(r0)
            te3.md0 r9 = new te3.md0
            r9.<init>()
            r9.f298813d = r2
            java.lang.String r3 = r8.f302110i
            long r1 = r8.f302107f
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r5 = 1
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r7 = r8.f302111j
            int r8 = r8.f302112n
            r2 = r0
            r2.mo141964q(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02fe
        L_0x00ef:
            java.lang.String r0 = "isOpenFromSession: false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            wa3.j r11 = new wa3.j
            r11.<init>()
            java.lang.String r0 = va3.C102166c.m134611F0(r8)
            r11.f301476p = r0
            r11.f301477q = r5
            wa3.f r0 = r11.f301472i
            r0.f301480b = r4
            i00.b r0 = wa3.C102364c.vx0()
            r0.X00(r11)
            te3.md0 r0 = new te3.md0
            r0.<init>()
            r0.f298813d = r2
            byte[] r21 = r10.getByteArray(r7)
            long r12 = r8.f302106e
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r15 = r8.f302110i
            java.lang.Boolean r16 = java.lang.Boolean.TRUE
            int r1 = r8.f302111j
            int r2 = r8.f302112n
            r20 = 0
            r17 = r1
            r18 = r2
            r19 = r0
            r11.mo141959s(r12, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x02fe
        L_0x0133:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0166 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0166 }
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a r2 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a     // Catch:{ Exception -> 0x0166 }
            r2.<init>()     // Catch:{ Exception -> 0x0166 }
            java.lang.String r4 = "msgId"
            long r10 = r0.getLong(r4)     // Catch:{ Exception -> 0x0166 }
            r2.f193797a = r10     // Catch:{ Exception -> 0x0166 }
            java.lang.String r4 = "noteXmlStr"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0166 }
            r2.f193798b = r4     // Catch:{ Exception -> 0x0166 }
            boolean r4 = r0.getBoolean(r5)     // Catch:{ Exception -> 0x0166 }
            r2.f193800d = r4     // Catch:{ Exception -> 0x0166 }
            java.lang.String r4 = "scene"
            int r0 = r0.getInt(r4)     // Catch:{ Exception -> 0x0166 }
            r2.f193801e = r0     // Catch:{ Exception -> 0x0166 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0166 }
            r2.f193799c = r0     // Catch:{ Exception -> 0x0166 }
            r8 = r2
            goto L_0x016f
        L_0x0166:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r4 = "parseOpenNoteFromSessionEventData"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r2)
        L_0x016f:
            if (r8 != 0) goto L_0x0177
            java.lang.String r0 = "OpenNoteFromSessionEvent data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        L_0x0177:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r8.f193802f = r0
            byte[] r1 = r3.toByteArray()
            r0.putByteArray(r7, r1)
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent r0 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent
            r0.<init>()
            r0.f193796d = r8
            r0.publish()
            goto L_0x02fe
        L_0x0191:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x027e }
            r4.<init>(r2)     // Catch:{ Exception -> 0x027e }
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a r2 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a     // Catch:{ Exception -> 0x027e }
            r2.<init>()     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "type"
            int r0 = r4.getInt(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264944a = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "editorId"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264945b = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "field_localId"
            long r10 = r4.getLong(r0)     // Catch:{ Exception -> 0x027e }
            r2.field_localId = r10     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "insertJsonData"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264948e = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "exportJsonData"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264949f = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "isInsert"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264950g = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "bundleData"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            java.lang.String r10 = ""
            boolean r10 = gy3.C87412m.m108589b(r0, r10)     // Catch:{ Exception -> 0x027e }
            if (r10 == 0) goto L_0x01de
            r2.f264951h = r8     // Catch:{ Exception -> 0x027e }
            goto L_0x021d
        L_0x01de:
            java.lang.String r10 = "bd"
            gy3.C87412m.m108593f(r0, r10)     // Catch:{ Exception -> 0x027e }
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ Exception -> 0x027e }
            r10.<init>()     // Catch:{ Exception -> 0x027e }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0211 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0211 }
            java.util.Iterator r0 = r11.keys()     // Catch:{ Exception -> 0x0211 }
            java.lang.String r12 = "jsonObject.keys()"
            gy3.C87412m.m108593f(r0, r12)     // Catch:{ Exception -> 0x0211 }
        L_0x01f7:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0211 }
            if (r12 == 0) goto L_0x021b
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0211 }
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r12, r13)     // Catch:{ Exception -> 0x0211 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0211 }
            java.lang.String r13 = r11.getString(r12)     // Catch:{ Exception -> 0x0211 }
            r10.putString(r12, r13)     // Catch:{ Exception -> 0x0211 }
            goto L_0x01f7
        L_0x0211:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x027e }
            java.lang.String r11 = "jsonToBundle"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r11, r10)     // Catch:{ Exception -> 0x027e }
            r10 = r8
        L_0x021b:
            r2.f264951h = r10     // Catch:{ Exception -> 0x027e }
        L_0x021d:
            java.lang.String r0 = "itemType"
            int r0 = r4.getInt(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264952i = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "path"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264953j = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "intdata"
            int r0 = r4.getInt(r0)     // Catch:{ Exception -> 0x027e }
            r2.f264954k = r0     // Catch:{ Exception -> 0x027e }
            boolean r0 = r4.getBoolean(r5)     // Catch:{ Exception -> 0x027e }
            r2.f264955l = r0     // Catch:{ Exception -> 0x027e }
            te3.kd0 r0 = new te3.kd0     // Catch:{ Exception -> 0x027e }
            r0.<init>()     // Catch:{ Exception -> 0x027e }
            r2.field_favProto = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "field_favProto"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x027e }
            if (r5 != 0) goto L_0x0259
            te3.kd0 r5 = r2.field_favProto     // Catch:{ Exception -> 0x027e }
            byte[] r0 = android.util.Base64.decode(r0, r9)     // Catch:{ Exception -> 0x027e }
            r5.parseFrom(r0)     // Catch:{ Exception -> 0x027e }
        L_0x0259:
            te3.md0 r0 = new te3.md0     // Catch:{ Exception -> 0x027e }
            r0.<init>()     // Catch:{ Exception -> 0x027e }
            r2.f264956m = r0     // Catch:{ Exception -> 0x027e }
            java.lang.String r0 = "reportInfo"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x027e }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x027e }
            if (r4 != 0) goto L_0x0276
            te3.md0 r4 = r2.f264956m     // Catch:{ Exception -> 0x027e }
            byte[] r0 = android.util.Base64.decode(r0, r9)     // Catch:{ Exception -> 0x027e }
            r4.parseFrom(r0)     // Catch:{ Exception -> 0x027e }
        L_0x0276:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x027e }
            r2.f264947d = r0     // Catch:{ Exception -> 0x027e }
            r8 = r2
            goto L_0x0287
        L_0x027e:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r4 = "parse NotifyWNNoteOperationEvent"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r2)
        L_0x0287:
            if (r8 != 0) goto L_0x028f
            java.lang.String r0 = "NotifyWNNoteOperationEvent data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        L_0x028f:
            android.os.Bundle r0 = r8.f264951h     // Catch:{ Exception -> 0x0299 }
            byte[] r1 = r3.toByteArray()     // Catch:{ Exception -> 0x0299 }
            r0.putByteArray(r7, r1)     // Catch:{ Exception -> 0x0299 }
            goto L_0x02a4
        L_0x0299:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = "MicroMsg.WebMultiTaskHelper"
            java.lang.String r3 = "onTaskBarItemClicked"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x02a4:
            int r0 = r8.f264944a
            r1 = 9
            if (r0 != r1) goto L_0x02f4
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r1 = r8.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            pb1.z r0 = r0.mo142266Yt(r1)
            java.lang.String r1 = "getService(IPluginFav::c…calId(data.field_localId)"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = r0.field_xml
            r8.f264945b = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            te3.kd0 r2 = r0.field_favProto
            te3.cd0 r2 = r2.f298608G
            java.lang.String r3 = "favItemInfo.field_favProto.getNoteInfo()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = r2.f227115d
            java.lang.String r4 = "noteauthor"
            r1.putString(r4, r3)
            java.lang.String r2 = r2.f227116e
            java.lang.String r3 = "noteeditor"
            r1.putString(r3, r2)
            long r2 = r0.field_updateTime
            java.lang.String r4 = "edittime"
            r1.putLong(r4, r2)
            r8.f264951h = r1
            te3.kd0 r0 = r0.field_favProto
            r8.field_favProto = r0
            r8.f264944a = r6
        L_0x02f4:
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent r0 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent
            r0.<init>()
            r0.f264942d = r8
            r0.publish()
        L_0x02fe:
            return
        L_0x02ff:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb3.C97640e.mo61632Q0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo):void");
    }

    /* renamed from: m1 */
    public void mo61633m1(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
    }
}
