package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import c00.C92328i;
import com.tencent.p014mm.sdk.platformtools.Log;
import g83.C59390n;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$i */
public class e$$i implements C92328i {

    /* renamed from: a */
    public final /* synthetic */ C19391e f54738a;

    public e$$i(C19391e eVar) {
        this.f54738a = eVar;
    }

    /* renamed from: a */
    public void mo7501a(boolean z) {
        Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, dismiss");
        this.f54738a.mo25057o("notifyHaoKanPermission", false, true);
        C59390n.m69304a(2, 1, 2);
    }

    /* renamed from: b */
    public void mo7502b() {
        Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission onPosition");
        this.f54738a.mo25057o("notifyHaoKanPermission", true, true);
        C59390n.m69304a(1, 1, 2);
    }
}
