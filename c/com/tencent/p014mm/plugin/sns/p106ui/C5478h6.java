package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.sdk.platformtools.Log;
import p609mp.C76803c;
import p609mp.C76805e;

/* renamed from: com.tencent.mm.plugin.sns.ui.h6 */
public class C5478h6 implements C76805e.C76807b {

    /* renamed from: a */
    public final /* synthetic */ SnsTagDetailUI f21240a;

    public C5478h6(SnsTagDetailUI snsTagDetailUI) {
        this.f21240a = snsTagDetailUI;
    }

    /* renamed from: a */
    public boolean mo1069a(ViewGroup viewGroup, View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$4");
        C76803c cVar = this.f21240a.f21200f.f211662K;
        if (!(cVar != null ? ((C72741a) cVar).f211670g.mo108544a(i) : true)) {
            Log.m105918d("MicroMsg.SnsTagDetailUI", "onItemLongClick " + i);
        }
        SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$4");
        return true;
    }
}
