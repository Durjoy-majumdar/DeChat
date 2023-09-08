package va3;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import xv0.C38857m;

/* renamed from: va3.d */
public class C102167d extends C38857m {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: xa3.r} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58338G1(com.tencent.p014mm.plugin.ball.model.BallInfo r14) {
        /*
            r13 = this;
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            if (r14 == 0) goto L_0x0267
            android.os.Bundle r1 = r14.f311678C
            if (r1 == 0) goto L_0x0267
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r14
            java.lang.String r4 = "MicroMsg.Fav.NoteFloatBallHelper"
            java.lang.String r5 = "handleBallInfoClicked, openNote ballInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            android.os.Bundle r2 = r14.f311678C
            java.lang.String r5 = "eventData"
            java.lang.String r2 = r2.getString(r5)
            android.os.Bundle r5 = r14.f311678C
            java.lang.String r6 = "eventType"
            int r5 = r5.getInt(r6)
            java.lang.String r6 = "showShare"
            r7 = 2
            r8 = 0
            if (r5 == r1) goto L_0x00f4
            if (r5 == r7) goto L_0x00a3
            r14 = 3
            if (r5 == r14) goto L_0x0033
            goto L_0x0267
        L_0x0033:
            java.lang.String r14 = "click WNNoteBanner"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            xa3.r r14 = new xa3.r     // Catch:{ Exception -> 0x008c }
            r14.<init>()     // Catch:{ Exception -> 0x008c }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
            r0.<init>(r2)     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topIsOpenFromSession"
            boolean r1 = r0.getBoolean(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302105d = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topLocalId"
            long r1 = r0.getLong(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302106e = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topMsgId"
            long r1 = r0.getLong(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302107f = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "isChatRoom"
            boolean r1 = r0.getBoolean(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302108g = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topTitle"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302109h = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topNoteXml"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302110i = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topLastPosition"
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302111j = r1     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "topLastOffset"
            int r0 = r0.getInt(r1)     // Catch:{ Exception -> 0x008c }
            r14.f302112n = r0     // Catch:{ Exception -> 0x008c }
            r8 = r14
            goto L_0x0095
        L_0x008c:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "parseWNNoteKeepTopItem"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r14, r1, r0)
        L_0x0095:
            if (r8 != 0) goto L_0x009e
            java.lang.String r14 = "WNNoteKeepTopItem data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r14)
            goto L_0x0267
        L_0x009e:
            va3.C102166c.m134610E0(r8)
            goto L_0x0267
        L_0x00a3:
            c30.g r14 = new c30.g     // Catch:{ Exception -> 0x00d6 }
            r14.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x00d6 }
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a r0 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a     // Catch:{ Exception -> 0x00d6 }
            r0.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r1 = "msgId"
            long r1 = r14.getLong(r1)     // Catch:{ Exception -> 0x00d6 }
            r0.f193797a = r1     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r1 = "noteXmlStr"
            java.lang.String r1 = r14.getString(r1)     // Catch:{ Exception -> 0x00d6 }
            r0.f193798b = r1     // Catch:{ Exception -> 0x00d6 }
            boolean r1 = r14.getBoolean(r6)     // Catch:{ Exception -> 0x00d6 }
            r0.f193800d = r1     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r1 = "scene"
            int r14 = r14.getInt(r1)     // Catch:{ Exception -> 0x00d6 }
            r0.f193801e = r14     // Catch:{ Exception -> 0x00d6 }
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00d6 }
            r0.f193799c = r14     // Catch:{ Exception -> 0x00d6 }
            r8 = r0
            goto L_0x00df
        L_0x00d6:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "parseOpenNoteFromSessionEventData"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r14, r1, r0)
        L_0x00df:
            if (r8 != 0) goto L_0x00e8
            java.lang.String r14 = "OpenNoteFromSessionEvent data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r14)
            goto L_0x0267
        L_0x00e8:
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent r14 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent
            r14.<init>()
            r14.f193796d = r8
            r14.publish()
            goto L_0x0267
        L_0x00f4:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d0 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01d0 }
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a r2 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a     // Catch:{ Exception -> 0x01d0 }
            r2.<init>()     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "type"
            int r5 = r1.getInt(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264944a = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "editorId"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264945b = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "field_localId"
            long r9 = r1.getLong(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.field_localId = r9     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "insertJsonData"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264948e = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "exportJsonData"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264949f = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "isInsert"
            boolean r5 = r1.getBoolean(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264950g = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "bundleData"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r9 = ""
            boolean r9 = r5.equals(r9)     // Catch:{ Exception -> 0x01d0 }
            if (r9 == 0) goto L_0x0141
            r2.f264951h = r8     // Catch:{ Exception -> 0x01d0 }
            goto L_0x016f
        L_0x0141:
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ Exception -> 0x01d0 }
            r9.<init>()     // Catch:{ Exception -> 0x01d0 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0163 }
            r10.<init>(r5)     // Catch:{ Exception -> 0x0163 }
            java.util.Iterator r5 = r10.keys()     // Catch:{ Exception -> 0x0163 }
        L_0x014f:
            boolean r11 = r5.hasNext()     // Catch:{ Exception -> 0x0163 }
            if (r11 == 0) goto L_0x016d
            java.lang.Object r11 = r5.next()     // Catch:{ Exception -> 0x0163 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0163 }
            java.lang.String r12 = r10.getString(r11)     // Catch:{ Exception -> 0x0163 }
            r9.putString(r11, r12)     // Catch:{ Exception -> 0x0163 }
            goto L_0x014f
        L_0x0163:
            r5 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r10 = "jsonToBundle"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r5, r10, r9)     // Catch:{ Exception -> 0x01d0 }
            r9 = r8
        L_0x016d:
            r2.f264951h = r9     // Catch:{ Exception -> 0x01d0 }
        L_0x016f:
            java.lang.String r5 = "itemType"
            int r5 = r1.getInt(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264952i = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "path"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264953j = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "intdata"
            int r5 = r1.getInt(r5)     // Catch:{ Exception -> 0x01d0 }
            r2.f264954k = r5     // Catch:{ Exception -> 0x01d0 }
            boolean r5 = r1.getBoolean(r6)     // Catch:{ Exception -> 0x01d0 }
            r2.f264955l = r5     // Catch:{ Exception -> 0x01d0 }
            te3.kd0 r5 = new te3.kd0     // Catch:{ Exception -> 0x01d0 }
            r5.<init>()     // Catch:{ Exception -> 0x01d0 }
            r2.field_favProto = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "field_favProto"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x01d0 }
            if (r6 != 0) goto L_0x01ab
            te3.kd0 r6 = r2.field_favProto     // Catch:{ Exception -> 0x01d0 }
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch:{ Exception -> 0x01d0 }
            r6.parseFrom(r5)     // Catch:{ Exception -> 0x01d0 }
        L_0x01ab:
            te3.md0 r5 = new te3.md0     // Catch:{ Exception -> 0x01d0 }
            r5.<init>()     // Catch:{ Exception -> 0x01d0 }
            r2.f264956m = r5     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r5 = "reportInfo"
            java.lang.String r1 = r1.getString(r5)     // Catch:{ Exception -> 0x01d0 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x01d0 }
            if (r5 != 0) goto L_0x01c8
            te3.md0 r5 = r2.f264956m     // Catch:{ Exception -> 0x01d0 }
            byte[] r1 = android.util.Base64.decode(r1, r3)     // Catch:{ Exception -> 0x01d0 }
            r5.parseFrom(r1)     // Catch:{ Exception -> 0x01d0 }
        L_0x01c8:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01d0 }
            r2.f264947d = r1     // Catch:{ Exception -> 0x01d0 }
            r8 = r2
            goto L_0x01d9
        L_0x01d0:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r5 = "parse NotifyWNNoteOperationEvent"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r2)
        L_0x01d9:
            if (r8 != 0) goto L_0x01e2
            java.lang.String r14 = "NotifyWNNoteOperationEvent data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r14)
            goto L_0x0267
        L_0x01e2:
            int r1 = r8.f264944a
            r2 = 9
            if (r1 != r2) goto L_0x022b
            di3.d r1 = di3.C86312j.m106911c(r0)
            pb1.j1 r1 = (pb1.C100718j1) r1
            pb1.w0 r1 = r1.mo128199Jq()
            long r4 = r8.field_localId
            xb1.d r1 = (xb1.C102614d) r1
            pb1.z r1 = r1.mo142266Yt(r4)
            if (r1 != 0) goto L_0x01fd
            goto L_0x022b
        L_0x01fd:
            java.lang.String r2 = r1.field_xml
            r8.f264945b = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            te3.kd0 r4 = r1.field_favProto
            te3.cd0 r4 = r4.f298608G
            if (r4 == 0) goto L_0x021c
            java.lang.String r5 = r4.f227115d
            java.lang.String r6 = "noteauthor"
            r2.putString(r6, r5)
            java.lang.String r4 = r4.f227116e
            java.lang.String r5 = "noteeditor"
            r2.putString(r5, r4)
        L_0x021c:
            long r4 = r1.field_updateTime
            java.lang.String r6 = "edittime"
            r2.putLong(r6, r4)
            r8.f264951h = r2
            te3.kd0 r1 = r1.field_favProto
            r8.field_favProto = r1
            r8.f264944a = r7
        L_0x022b:
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent r1 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent
            r1.<init>()
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r4 = r8.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            pb1.z r0 = r0.mo142266Yt(r4)
            if (r0 != 0) goto L_0x0262
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131833624(0x7f113318, float:1.9300335E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r1, (int) r3)
            r0.show()
            java.lang.Class<pn.e> r0 = p646pn.C110234e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            r0.mo149108Z(r14)
            goto L_0x0267
        L_0x0262:
            r1.f264942d = r8
            r1.publish()
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va3.C102167d.mo58338G1(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    /* renamed from: H */
    public void mo58339H(BallInfo ballInfo) {
    }

    /* renamed from: c2 */
    public void mo58340c2(BallInfo ballInfo) {
    }
}
