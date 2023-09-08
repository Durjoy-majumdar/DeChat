package com.tencent.p014mm.plugin.expt.shell;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ShellExecEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/expt/shell/ExptServiceShell$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ShellExecEvent;", "plugin-expt_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.expt.shell.ExptServiceShell$listener$1 */
public final class ExptServiceShell$listener$1 extends IListener<ShellExecEvent> {
    public ExptServiceShell$listener$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb A[Catch:{ Exception -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r10) {
        /*
            r9 = this;
            com.tencent.mm.autogen.events.ShellExecEvent r10 = (com.tencent.p014mm.autogen.events.ShellExecEvent) r10
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r1 = 1
            if (r0 == 0) goto L_0x0187
            com.tencent.mm.autogen.events.ShellExecEvent$a r0 = r10.f78980d
            java.lang.String r0 = r0.f78982b
            java.lang.String r2 = "wechat.shell.EXPT_TEST"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x0187
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.tencent.p014mm.plugin.expt.shell.ExptServiceShell.f81005a
            com.tencent.mm.autogen.events.ShellExecEvent$a r10 = r10.f78980d
            android.content.Intent r10 = r10.f78981a
            java.lang.String r0 = "event.data.intent"
            gy3.C87412m.m108593f(r10, r0)
            java.lang.String r0 = "action"
            r2 = 0
            int r0 = r10.getIntExtra(r0, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "receive intent action:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.ExptServiceShell"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            if (r0 == r1) goto L_0x005f
            r10 = 2
            if (r0 == r10) goto L_0x0051
            java.lang.String r10 = "unknown action"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
            goto L_0x0187
        L_0x0051:
            java.util.HashMap<java.lang.String, java.lang.String> r10 = com.tencent.p014mm.plugin.expt.shell.ExptServiceShell.f81005a
            r10.clear()
            ma1.a r10 = ma1.C117543a.Cx0()
            r10.Lx0(r1)
            goto L_0x0187
        L_0x005f:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = com.tencent.p014mm.plugin.expt.shell.ExptServiceShell.f81005a
            r0.clear()
            java.lang.String r0 = "config_path"
            java.lang.String r10 = r10.getStringExtra(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "configPath:"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106432N(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "receive config:"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x00f4 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00f4 }
            int r10 = r0.length()     // Catch:{ Exception -> 0x00f4 }
            r3 = 0
        L_0x00a7:
            if (r3 >= r10) goto L_0x00fd
            org.json.JSONObject r5 = r0.getJSONObject(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r6 = "ExptKey"
            java.lang.String r6 = r5.optString(r6)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r7 = "ExptVal"
            java.lang.String r5 = r5.optString(r7)     // Catch:{ Exception -> 0x00f4 }
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = ""
        L_0x00bd:
            if (r6 == 0) goto L_0x00c8
            int r7 = r6.length()     // Catch:{ Exception -> 0x00f4 }
            if (r7 != 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r7 = 0
            goto L_0x00c9
        L_0x00c8:
            r7 = 1
        L_0x00c9:
            if (r7 != 0) goto L_0x00f1
            java.util.HashMap<java.lang.String, java.lang.String> r7 = com.tencent.p014mm.plugin.expt.shell.ExptServiceShell.f81005a     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r8 = "key"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ Exception -> 0x00f4 }
            r7.put(r6, r5)     // Catch:{ Exception -> 0x00f4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f4 }
            r7.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r8 = "dispatch key:"
            r7.append(r8)     // Catch:{ Exception -> 0x00f4 }
            r7.append(r6)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r6 = " value:"
            r7.append(r6)     // Catch:{ Exception -> 0x00f4 }
            r7.append(r5)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ Exception -> 0x00f4 }
        L_0x00f1:
            int r3 = r3 + 1
            goto L_0x00a7
        L_0x00f4:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "parse config json error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r10, r3, r0)
        L_0x00fd:
            java.util.HashMap<java.lang.String, java.lang.String> r10 = com.tencent.p014mm.plugin.expt.shell.ExptServiceShell.f81005a
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0187
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r3 = 207(0xcf, float:2.9E-43)
            java.lang.String r4 = "ExptId"
            r0.put(r4, r3)
            r3 = 1883(0x75b, float:2.639E-42)
            java.lang.String r4 = "GroupId"
            r0.put(r4, r3)
            java.lang.String r3 = "ExptSequence"
            r0.put(r3, r1)
            java.lang.String r3 = "Priority"
            r0.put(r3, r1)
            java.lang.String r3 = "NeedReport"
            r0.put(r3, r2)
            java.lang.String r3 = "StartTime"
            r0.put(r3, r2)
            java.lang.String r3 = "EndTime"
            r0.put(r3, r2)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013e:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0177
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.Object r6 = r4.getKey()
            java.lang.String r7 = "Key"
            r5.put(r7, r6)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.nio.charset.Charset r6 = z04.C119027c.f356488a
            byte[] r4 = r4.getBytes(r6)
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r4, r6)
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r2)
            java.lang.String r6 = "Val"
            r5.put(r6, r4)
            r3.put(r5)
            goto L_0x013e
        L_0x0177:
            java.lang.String r10 = "Args"
            r0.put(r10, r3)
            ma1.a r10 = ma1.C117543a.Cx0()
            java.lang.String r0 = r0.toString()
            r10.Fx0(r0)
        L_0x0187:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.shell.ExptServiceShell$listener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
