package eb3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Iterator;
import org.json.JSONObject;
import p92.C117994a;
import p92.C117997g;

/* renamed from: eb3.d */
public final class C97639d extends C117997g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97639d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: xa3.r} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0292  */
    /* renamed from: L1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36001L1(android.view.View r25, com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo r26, te3.C110959d13 r27, java.lang.Object r28) {
        /*
            r24 = this;
            r1 = r26
            r0 = r27
            java.lang.Class<pb1.j1> r2 = pb1.C100718j1.class
            java.lang.String r3 = "MicroMsg.NoteMultiTaskUIC"
            java.lang.String r4 = "info"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "animateData"
            gy3.C87412m.m108594g(r0, r4)
            te3.ry r4 = new te3.ry
            r4.<init>()
            r4.f141210d = r0
            r5 = 0
            if (r25 == 0) goto L_0x003d
            java.lang.Class<ox.b> r0 = p640ox.C77049b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ox.b r0 = (p640ox.C77049b) r0
            android.content.Context r6 = r25.getContext()
            java.lang.String r7 = "view.context"
            gy3.C87412m.m108593f(r6, r7)
            r7 = 5
            pe3.a r0 = r0.mo72346DT(r6, r7)
            te3.i13 r0 = (te3.C110964i13) r0
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.f332057d
            goto L_0x003b
        L_0x003a:
            r0 = r5
        L_0x003b:
            r4.f141211e = r0
        L_0x003d:
            te3.f43 r0 = new te3.f43
            r0.<init>()
            byte[] r6 = r1.field_data     // Catch:{ Exception -> 0x0328 }
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0328 }
            int r6 = r0.f183078d
            java.lang.String r0 = r0.f183079e
            java.lang.String r7 = "showShare"
            r8 = 1
            r9 = 2
            java.lang.String r10 = "key_multi_task_common_info"
            r11 = 0
            if (r6 == r8) goto L_0x01c0
            if (r6 == r9) goto L_0x0162
            r1 = 3
            if (r6 == r1) goto L_0x005f
        L_0x005b:
            r12 = r24
            goto L_0x0306
        L_0x005f:
            java.lang.String r2 = "click WNNoteBanner"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            xa3.r r2 = new xa3.r     // Catch:{ Exception -> 0x00b8 }
            r2.<init>()     // Catch:{ Exception -> 0x00b8 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b8 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topIsOpenFromSession"
            boolean r0 = r6.getBoolean(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302105d = r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topLocalId"
            long r12 = r6.getLong(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302106e = r12     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topMsgId"
            long r12 = r6.getLong(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302107f = r12     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "isChatRoom"
            boolean r0 = r6.getBoolean(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302108g = r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topTitle"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302109h = r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topNoteXml"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302110i = r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topLastPosition"
            int r0 = r6.getInt(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302111j = r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "topLastOffset"
            int r0 = r6.getInt(r0)     // Catch:{ Exception -> 0x00b8 }
            r2.f302112n = r0     // Catch:{ Exception -> 0x00b8 }
            r5 = r2
            goto L_0x00c1
        L_0x00b8:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r6 = "parseWNNoteKeepTopItem"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r2)
        L_0x00c1:
            if (r5 != 0) goto L_0x00c9
            java.lang.String r0 = "WNNoteKeepTopItem data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return
        L_0x00c9:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            byte[] r0 = r4.toByteArray()
            r12.putByteArray(r10, r0)
            boolean r0 = r5.f302105d
            r2 = 8
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "isOpenFromSession: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            wa3.n r4 = new wa3.n
            r4.<init>()
            java.lang.String r0 = va3.C102166c.m134611F0(r5)
            r4.f301476p = r0
            r4.f301477q = r1
            wa3.f r0 = r4.f301472i
            boolean r3 = r5.f302108g
            if (r3 == 0) goto L_0x00f5
            r9 = 3
        L_0x00f5:
            r0.f301480b = r9
            i00.b r0 = wa3.C102364c.vx0()
            r0.X00(r4)
            te3.md0 r11 = new te3.md0
            r11.<init>()
            r11.f298813d = r2
            java.lang.String r0 = r5.f302110i
            long r1 = r5.f302107f
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            r7 = 1
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r9 = r5.f302111j
            int r10 = r5.f302112n
            r5 = r0
            r4.mo141964q(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x005b
        L_0x011c:
            java.lang.String r0 = "isOpenFromSession: false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            wa3.j r13 = new wa3.j
            r13.<init>()
            java.lang.String r0 = va3.C102166c.m134611F0(r5)
            r13.f301476p = r0
            r13.f301477q = r1
            wa3.f r0 = r13.f301472i
            r0.f301480b = r8
            i00.b r0 = wa3.C102364c.vx0()
            r0.X00(r13)
            te3.md0 r0 = new te3.md0
            r0.<init>()
            r0.f298813d = r2
            byte[] r23 = r12.getByteArray(r10)
            long r14 = r5.f302106e
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = r5.f302110i
            java.lang.Boolean r18 = java.lang.Boolean.TRUE
            int r2 = r5.f302111j
            int r3 = r5.f302112n
            r22 = 0
            r17 = r1
            r19 = r2
            r20 = r3
            r21 = r0
            r13.mo141959s(r14, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x005b
        L_0x0162:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0195 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0195 }
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a r0 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent$a     // Catch:{ Exception -> 0x0195 }
            r0.<init>()     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = "msgId"
            long r8 = r1.getLong(r2)     // Catch:{ Exception -> 0x0195 }
            r0.f193797a = r8     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = "noteXmlStr"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x0195 }
            r0.f193798b = r2     // Catch:{ Exception -> 0x0195 }
            boolean r2 = r1.getBoolean(r7)     // Catch:{ Exception -> 0x0195 }
            r0.f193800d = r2     // Catch:{ Exception -> 0x0195 }
            java.lang.String r2 = "scene"
            int r1 = r1.getInt(r2)     // Catch:{ Exception -> 0x0195 }
            r0.f193801e = r1     // Catch:{ Exception -> 0x0195 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0195 }
            r0.f193799c = r1     // Catch:{ Exception -> 0x0195 }
            r5 = r0
            goto L_0x019e
        L_0x0195:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = "parseOpenNoteFromSessionEventData"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
        L_0x019e:
            if (r5 != 0) goto L_0x01a6
            java.lang.String r0 = "OpenNoteFromSessionEvent data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return
        L_0x01a6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r5.f193802f = r0
            byte[] r1 = r4.toByteArray()
            r0.putByteArray(r10, r1)
            com.tencent.mm.autogen.events.OpenNoteFromSessionEvent r0 = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent
            r0.<init>()
            r0.f193796d = r5
            r0.publish()
            goto L_0x005b
        L_0x01c0:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x027f }
            r6.<init>(r0)     // Catch:{ Exception -> 0x027f }
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a r0 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent$a     // Catch:{ Exception -> 0x027f }
            r0.<init>()     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "type"
            int r8 = r6.getInt(r8)     // Catch:{ Exception -> 0x027f }
            r0.f264944a = r8     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "editorId"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ Exception -> 0x027f }
            r0.f264945b = r8     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "field_localId"
            long r12 = r6.getLong(r8)     // Catch:{ Exception -> 0x027f }
            r0.field_localId = r12     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "insertJsonData"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ Exception -> 0x027f }
            r0.f264948e = r8     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "exportJsonData"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ Exception -> 0x027f }
            r0.f264949f = r8     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "isInsert"
            boolean r8 = r6.getBoolean(r8)     // Catch:{ Exception -> 0x027f }
            r0.f264950g = r8     // Catch:{ Exception -> 0x027f }
            java.lang.String r8 = "bundleData"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ Exception -> 0x027f }
            java.lang.String r12 = ""
            boolean r12 = gy3.C87412m.m108589b(r8, r12)     // Catch:{ Exception -> 0x027f }
            if (r12 == 0) goto L_0x020f
            r0.f264951h = r5     // Catch:{ Exception -> 0x027f }
            r12 = r24
            goto L_0x021c
        L_0x020f:
            java.lang.String r12 = "bd"
            gy3.C87412m.m108593f(r8, r12)     // Catch:{ Exception -> 0x027f }
            r12 = r24
            android.os.Bundle r8 = r12.mo136901l3(r8)     // Catch:{ Exception -> 0x027d }
            r0.f264951h = r8     // Catch:{ Exception -> 0x027d }
        L_0x021c:
            java.lang.String r8 = "itemType"
            int r8 = r6.getInt(r8)     // Catch:{ Exception -> 0x027d }
            r0.f264952i = r8     // Catch:{ Exception -> 0x027d }
            java.lang.String r8 = "path"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ Exception -> 0x027d }
            r0.f264953j = r8     // Catch:{ Exception -> 0x027d }
            java.lang.String r8 = "intdata"
            int r8 = r6.getInt(r8)     // Catch:{ Exception -> 0x027d }
            r0.f264954k = r8     // Catch:{ Exception -> 0x027d }
            boolean r7 = r6.getBoolean(r7)     // Catch:{ Exception -> 0x027d }
            r0.f264955l = r7     // Catch:{ Exception -> 0x027d }
            te3.kd0 r7 = new te3.kd0     // Catch:{ Exception -> 0x027d }
            r7.<init>()     // Catch:{ Exception -> 0x027d }
            r0.field_favProto = r7     // Catch:{ Exception -> 0x027d }
            java.lang.String r7 = "field_favProto"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ Exception -> 0x027d }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x027d }
            if (r8 != 0) goto L_0x0258
            te3.kd0 r8 = r0.field_favProto     // Catch:{ Exception -> 0x027d }
            byte[] r7 = android.util.Base64.decode(r7, r11)     // Catch:{ Exception -> 0x027d }
            r8.parseFrom(r7)     // Catch:{ Exception -> 0x027d }
        L_0x0258:
            te3.md0 r7 = new te3.md0     // Catch:{ Exception -> 0x027d }
            r7.<init>()     // Catch:{ Exception -> 0x027d }
            r0.f264956m = r7     // Catch:{ Exception -> 0x027d }
            java.lang.String r7 = "reportInfo"
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x027d }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x027d }
            if (r7 != 0) goto L_0x0275
            te3.md0 r7 = r0.f264956m     // Catch:{ Exception -> 0x027d }
            byte[] r6 = android.util.Base64.decode(r6, r11)     // Catch:{ Exception -> 0x027d }
            r7.parseFrom(r6)     // Catch:{ Exception -> 0x027d }
        L_0x0275:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x027d }
            r0.f264947d = r6     // Catch:{ Exception -> 0x027d }
            r5 = r0
            goto L_0x028a
        L_0x027d:
            r0 = move-exception
            goto L_0x0282
        L_0x027f:
            r0 = move-exception
            r12 = r24
        L_0x0282:
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r7 = "parse NotifyWNNoteOperationEvent"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r7, r6)
        L_0x028a:
            if (r5 != 0) goto L_0x0292
            java.lang.String r0 = "NotifyWNNoteOperationEvent data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return
        L_0x0292:
            android.os.Bundle r0 = r5.f264951h
            if (r0 == 0) goto L_0x029d
            byte[] r4 = r4.toByteArray()
            r0.putByteArray(r10, r4)
        L_0x029d:
            int r0 = r5.f264944a
            r4 = 9
            if (r0 != r4) goto L_0x02e8
            di3.d r0 = di3.C86312j.m106911c(r2)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r6 = r5.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            pb1.z r0 = r0.mo142266Yt(r6)
            if (r0 == 0) goto L_0x02e8
            java.lang.String r4 = r0.field_xml
            r5.f264945b = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            te3.kd0 r6 = r0.field_favProto
            te3.cd0 r6 = r6.f298608G
            java.lang.String r7 = "favItemInfo.field_favProto.getNoteInfo()"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r7 = r6.f227115d
            java.lang.String r8 = "noteauthor"
            r4.putString(r8, r7)
            java.lang.String r6 = r6.f227116e
            java.lang.String r7 = "noteeditor"
            r4.putString(r7, r6)
            long r6 = r0.field_updateTime
            java.lang.String r8 = "edittime"
            r4.putLong(r8, r6)
            r5.f264951h = r4
            te3.kd0 r0 = r0.field_favProto
            r5.field_favProto = r0
            r5.f264944a = r9
        L_0x02e8:
            com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent r0 = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent
            r0.<init>()
            di3.d r2 = di3.C86312j.m106911c(r2)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            long r6 = r5.field_localId
            xb1.d r2 = (xb1.C102614d) r2
            pb1.z r2 = r2.mo142266Yt(r6)
            if (r2 == 0) goto L_0x0307
            r0.f264942d = r5
            r0.publish()
        L_0x0306:
            return
        L_0x0307:
            java.lang.String r0 = "favItemInfo id deleted"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131833624(0x7f113318, float:1.9300335E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r2, (int) r11)
            r0.show()
            java.lang.Class<com.tencent.mm.plugin.multitask.j> r0 = com.tencent.p014mm.plugin.multitask.C105918j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitask.j r0 = (com.tencent.p014mm.plugin.multitask.C105918j) r0
            java.lang.String r1 = r1.field_id
            r0.mo151020Ub(r1)
            return
        L_0x0328:
            r0 = move-exception
            r12 = r24
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb3.C97639d.mo36001L1(android.view.View, com.tencent.mm.plugin.multitask.model.MultiTaskInfo, te3.d13, java.lang.Object):void");
    }

    /* renamed from: d3 */
    public void mo62143d3(Object obj) {
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return i == 3;
    }

    /* renamed from: l3 */
    public final Bundle mo136901l3(String str) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                C87412m.m108592e(next, "null cannot be cast to non-null type kotlin.String");
                String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NoteMultiTaskUIC", e, "jsonToBundle", new Object[0]);
            return null;
        }
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_MULTI_SCENE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97639d(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
