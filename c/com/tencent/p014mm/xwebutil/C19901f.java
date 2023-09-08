package com.tencent.p014mm.xwebutil;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.xwebutil.f */
public class C19901f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f56730d;

    public C19901f(String str) {
        this.f56730d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            if (!C19905j.m21650b(this.f56730d)) {
                Log.m105920e("XFilesAudioPlayerLogic", "playBtn onClick, sCurrentParams invalid");
                C117292a.m165361g(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ITPPlayer iTPPlayer = C19905j.f56734a.f56748h;
            if (iTPPlayer == null) {
                Log.m105920e("XFilesAudioPlayerLogic", "playBtn onClick, tpPlayer invalid");
                C117292a.m165361g(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (iTPPlayer.getCurrentState() == 5) {
                Log.m105924i("XFilesAudioPlayerLogic", "playBtn onClick, try pause");
                iTPPlayer.pause();
            } else {
                Log.m105924i("XFilesAudioPlayerLogic", "playBtn onClick, try start");
                C19909k kVar = C19905j.f56734a;
                C19905j.m21653e(iTPPlayer, kVar.f56744d, kVar.f56745e, kVar.f56749i, kVar.f56747g, -1);
            }
            C117292a.m165361g(this, "com/tencent/mm/xwebutil/XWebAudioPlayerLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } catch (Throwable th) {
            Log.m105920e("XFilesAudioPlayerLogic", "playBtn pause or start error: " + th.getMessage());
            C19905j.m21652d("playBtn pause or start error ", th);
        }
    }
}
