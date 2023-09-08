package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import c00.C92328i;
import com.tencent.p014mm.sdk.platformtools.Log;
import g83.C59390n;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$j */
public class e$$j implements C92328i {

    /* renamed from: a */
    public final /* synthetic */ C19391e f54739a;

    public e$$j(C19391e eVar) {
        this.f54739a = eVar;
    }

    /* renamed from: a */
    public void mo7501a(boolean z) {
        Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, dismiss.");
        this.f54739a.mo25057o("notifyHaoKanCommentPermission", false, true);
        C59390n.m69304a(2, 2, 2);
    }

    /* renamed from: b */
    public void mo7502b() {
        this.f54739a.mo25057o("notifyHaoKanCommentPermission", true, true);
        Log.m105924i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, onPosition.");
        C59390n.m69304a(1, 2, 2);
    }
}
