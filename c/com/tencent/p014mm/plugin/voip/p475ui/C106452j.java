package com.tencent.p014mm.plugin.voip.p475ui;

import android.graphics.Point;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.video.NewMovableVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.voip.ui.j */
public class C106452j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewVoipVideoFragment f317986d;

    public C106452j(NewVoipVideoFragment newVoipVideoFragment) {
        this.f317986d = newVoipVideoFragment;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "steve: mGlSmallVideoView clicked!");
        Util.currentTicks();
        NewVoipVideoFragment newVoipVideoFragment = this.f317986d;
        newVoipVideoFragment.f317832b1 = !newVoipVideoFragment.f317832b1;
        newVoipVideoFragment.f317931v.get().mo152480n();
        NewVoipVideoFragment newVoipVideoFragment2 = this.f317986d;
        Point j0 = newVoipVideoFragment2.mo152895j0(!newVoipVideoFragment2.f317832b1);
        NewMovableVideoView newMovableVideoView = this.f317986d.f317807L;
        if (newMovableVideoView != null) {
            newMovableVideoView.mo153098e(j0.x, j0.y);
        }
        C115669n.INSTANCE.mo160131h(11079, 3);
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
