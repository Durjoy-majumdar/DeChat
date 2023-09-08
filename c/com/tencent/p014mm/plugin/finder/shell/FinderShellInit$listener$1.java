package com.tencent.p014mm.plugin.finder.shell;

import android.content.Intent;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ShellExecEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.FileReaderHelper;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/shell/FinderShellInit$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ShellExecEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1 */
public final class FinderShellInit$listener$1 extends IListener<ShellExecEvent> {
    public FinderShellInit$listener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        String str;
        ShellExecEvent shellExecEvent = (ShellExecEvent) iEvent;
        C87412m.m108594g(shellExecEvent, "event");
        if (!WeChatEnvironment.hasDebugger() || !C87412m.m108589b(shellExecEvent.f78980d.f78982b, "wechat.shell.FINDER_SHELL")) {
            return true;
        }
        String stringExtra = shellExecEvent.f78980d.f78981a.getStringExtra(FileReaderHelper.OPEN_FILE_FROM_CMD);
        Log.m105924i("Finder.Shell", "get cmd " + stringExtra);
        HashMap<String, C32226l<Intent, C13598b0>> hashMap = FinderShellInit.f81258a;
        if (stringExtra != null) {
            Locale locale = Locale.getDefault();
            C87412m.m108593f(locale, "getDefault()");
            str = stringExtra.toLowerCase(locale);
            C87412m.m108593f(str, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str = null;
        }
        C32226l lVar = hashMap.get(str);
        if (lVar == null) {
            return true;
        }
        Intent intent = shellExecEvent.f78980d.f78981a;
        C87412m.m108593f(intent, "event.data.intent");
        lVar.invoke(intent);
        return true;
    }
}
