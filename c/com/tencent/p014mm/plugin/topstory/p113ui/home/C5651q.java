package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.sdk.platformtools.Log;
import p609mp.C76803c;
import p609mp.C76805e;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.q */
public class C5651q implements C76805e.C76807b {

    /* renamed from: a */
    public final /* synthetic */ TopStorySettingVisibilityDetailUI f21613a;

    public C5651q(TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f21613a = topStorySettingVisibilityDetailUI;
    }

    /* renamed from: a */
    public boolean mo1069a(ViewGroup viewGroup, View view, int i) {
        C76803c cVar = this.f21613a.f21595d.f211662K;
        if (!(cVar != null ? ((C72741a) cVar).f211670g.mo108544a(i) : true)) {
            Log.m105918d("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onItemLongClick " + i);
        }
        return true;
    }
}
