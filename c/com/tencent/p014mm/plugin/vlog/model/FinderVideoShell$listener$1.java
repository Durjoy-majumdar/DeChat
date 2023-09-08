package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ShellExecEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/vlog/model/FinderVideoShell$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ShellExecEvent;", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.model.FinderVideoShell$listener$1 */
public final class FinderVideoShell$listener$1 extends IListener<ShellExecEvent> {
    public FinderVideoShell$listener$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0101 A[Catch:{ Exception -> 0x01a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r15) {
        /*
            r14 = this;
            com.tencent.mm.autogen.events.ShellExecEvent r15 = (com.tencent.p014mm.autogen.events.ShellExecEvent) r15
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r15, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r1 = 1
            if (r0 == 0) goto L_0x01c3
            com.tencent.mm.autogen.events.ShellExecEvent$a r0 = r15.f78980d
            java.lang.String r0 = r0.f78982b
            java.lang.String r2 = "wechat.shell.FINDER_VIDEO_TEST"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x01c3
            com.tencent.mm.plugin.vlog.model.FinderVideoShell r0 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82198a
            com.tencent.mm.autogen.events.ShellExecEvent$a r15 = r15.f78980d
            android.content.Intent r15 = r15.f78981a
            java.lang.String r2 = "event.data.intent"
            gy3.C87412m.m108593f(r15, r2)
            java.lang.String r2 = "config_path"
            java.lang.String r2 = r15.getStringExtra(r2)
            java.lang.String r3 = "target_video_path"
            java.lang.String r3 = r15.getStringExtra(r3)
            java.lang.String r4 = "report_data_path"
            java.lang.String r15 = r15.getStringExtra(r4)
            gy3.C87412m.m108591d(r15)
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82200c = r15
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r15 == 0) goto L_0x01c3
            r15 = 0
            if (r3 == 0) goto L_0x004f
            int r4 = r3.length()
            if (r4 != 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r4 = 0
            goto L_0x0050
        L_0x004f:
            r4 = 1
        L_0x0050:
            if (r4 != 0) goto L_0x01c3
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106432N(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "receive test config in path:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", config:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "MicroMsg.FinderVideoShell"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            java.lang.String r2 = "config"
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = "wh"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x01a0 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.Class<rz.q> r4 = p682rz.C36594q.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x01a0 }
            rz.q r4 = (p682rz.C36594q) r4     // Catch:{ Exception -> 0x01a0 }
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.mo60737c6()     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "getService(IVideoControl…ava).finderAlbumVideoPara"
            gy3.C87412m.m108593f(r4, r7)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "abr"
            int r8 = r4.f267173n     // Catch:{ Exception -> 0x01a0 }
            int r8 = r8 / 1000
            int r7 = r6.optInt(r7, r8)     // Catch:{ Exception -> 0x01a0 }
            int r7 = r7 * 1000
            r4.f267173n = r7     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "prof"
            int r7 = r6.optInt(r7, r15)     // Catch:{ Exception -> 0x01a0 }
            r4.f267176q = r7     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "preset"
            int r7 = r6.optInt(r7, r15)     // Catch:{ Exception -> 0x01a0 }
            r4.f267177r = r7     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "audioChannelCount"
            int r8 = r4.f267175p     // Catch:{ Exception -> 0x01a0 }
            int r7 = r6.optInt(r7, r8)     // Catch:{ Exception -> 0x01a0 }
            r4.f267175p = r7     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "audioSampleRate"
            int r8 = r4.f267174o     // Catch:{ Exception -> 0x01a0 }
            int r7 = r6.optInt(r7, r8)     // Catch:{ Exception -> 0x01a0 }
            r4.f267174o = r7     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "conf"
            org.json.JSONArray r7 = r6.optJSONArray(r7)     // Catch:{ Exception -> 0x01a0 }
            if (r7 == 0) goto L_0x012f
            int r8 = r7.length()     // Catch:{ Exception -> 0x01a0 }
            if (r8 <= 0) goto L_0x012f
            org.json.JSONObject r7 = r7.getJSONObject(r15)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r8 = r7.optString(r2)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r9 = "fps"
            int r10 = r4.f267168f     // Catch:{ Exception -> 0x01a0 }
            int r9 = r7.optInt(r9, r10)     // Catch:{ Exception -> 0x01a0 }
            r4.f267168f = r9     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r9 = "vbr"
            int r10 = r4.f267169g     // Catch:{ Exception -> 0x01a0 }
            int r10 = r10 / 1000
            int r7 = r7.optInt(r9, r10)     // Catch:{ Exception -> 0x01a0 }
            int r7 = r7 * 1000
            r4.f267169g = r7     // Catch:{ Exception -> 0x01a0 }
            if (r8 == 0) goto L_0x00fe
            int r7 = r8.length()     // Catch:{ Exception -> 0x01a0 }
            if (r7 != 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r7 = 0
            goto L_0x00ff
        L_0x00fe:
            r7 = 1
        L_0x00ff:
            if (r7 != 0) goto L_0x012f
            gy3.C87412m.m108593f(r8, r2)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = "x"
            java.lang.String[] r9 = new java.lang.String[]{r2}     // Catch:{ Exception -> 0x01a0 }
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = z04.C112550d0.m153785U(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object r7 = r2.get(r15)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01a0 }
            int r8 = r4.f267166d     // Catch:{ Exception -> 0x01a0 }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x01a0 }
            r4.f267166d = r7     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01a0 }
            int r7 = r4.f267167e     // Catch:{ Exception -> 0x01a0 }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r7)     // Catch:{ Exception -> 0x01a0 }
            r4.f267167e = r2     // Catch:{ Exception -> 0x01a0 }
        L_0x012f:
            java.lang.String r2 = "intval"
            int r2 = r6.optInt(r2, r15)     // Catch:{ Exception -> 0x01a0 }
            if (r2 <= 0) goto L_0x013c
            int r7 = r4.f267168f     // Catch:{ Exception -> 0x01a0 }
            int r2 = r2 / r7
            r4.f267172j = r2     // Catch:{ Exception -> 0x01a0 }
        L_0x013c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a0 }
            r2.<init>()     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r7 = "parseTestConfig finish, final config:"
            r2.append(r7)     // Catch:{ Exception -> 0x01a0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82201d = r4     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = "use_tavkit_remux"
            int r2 = r6.optInt(r2, r15)     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82202e = r2     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = "hevc_encode"
            int r2 = r6.optInt(r2, r15)     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82215r = r2     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = "soft_encode_fallback"
            int r2 = r6.optInt(r2, r15)     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82216s = r2     // Catch:{ Exception -> 0x01a0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a0 }
            r2.<init>()     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r4 = "config use useTavkitRemux:"
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            int r4 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82202e     // Catch:{ Exception -> 0x01a0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r4 = ", reportDataPath:"
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r4 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82200c     // Catch:{ Exception -> 0x01a0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r4 = ", hevcEncodeOption:"
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            int r4 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82215r     // Catch:{ Exception -> 0x01a0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r4 = ", enableSoftEncodeFallback:"
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            int r4 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82216s     // Catch:{ Exception -> 0x01a0 }
            r2.append(r4)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01a8
        L_0x01a0:
            r2 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r4 = "parse config error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r4, r15)
        L_0x01a8:
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82199b = r3
            r0.mo57454b()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "config target video path:"
            r15.append(r0)
            java.lang.String r0 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82199b
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r15)
        L_0x01c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.FinderVideoShell$listener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
