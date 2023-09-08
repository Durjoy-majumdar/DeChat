package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$c */
public class FTSVoiceInputLayoutImpl$$c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FTSVoiceInputLayoutImpl f52883d;

    public FTSVoiceInputLayoutImpl$$c(FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl) {
        this.f52883d = fTSVoiceInputLayoutImpl;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = this.f52883d;
                if (fTSVoiceInputLayoutImpl.f52877u) {
                    fTSVoiceInputLayoutImpl.f52877u = false;
                } else {
                    Log.m105919d("MicroMsg.FTSVoiceInputLayoutImpl", "btn onTouch ACTION_UP currentState %s longClickDown %s", Integer.valueOf(fTSVoiceInputLayoutImpl.f52892f), Boolean.valueOf(this.f52883d.f52876t));
                    FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl2 = this.f52883d;
                    if (fTSVoiceInputLayoutImpl2.f52876t) {
                        fTSVoiceInputLayoutImpl2.mo23846l(true, false);
                        FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl3 = this.f52883d;
                        fTSVoiceInputLayoutImpl3.f52876t = false;
                        fTSVoiceInputLayoutImpl3.f52878v = 0;
                    } else {
                        fTSVoiceInputLayoutImpl2.mo23846l(false, true);
                    }
                    FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl4 = this.f52883d;
                    fTSVoiceInputLayoutImpl4.getClass();
                    MMHandlerThread.postToMainThreadDelayed(new C18878d(fTSVoiceInputLayoutImpl4), 100);
                    ((FTSVoiceInputLayoutImpl$$h) this.f52883d.f52890d).mo23858h();
                }
            }
        } else if (!NetStatusUtil.isConnected(this.f52883d.getContext())) {
            FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl5 = this.f52883d;
            fTSVoiceInputLayoutImpl5.f52877u = true;
            fTSVoiceInputLayoutImpl5.f52890d.mo23870c(12, 0, 0);
        } else {
            FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl6 = this.f52883d;
            fTSVoiceInputLayoutImpl6.f52877u = false;
            fTSVoiceInputLayoutImpl6.f52876t = false;
            fTSVoiceInputLayoutImpl6.f52878v = Util.currentTicks();
            ((FTSVoiceInputLayoutImpl$$h) this.f52883d.f52890d).mo23859i();
            Log.m105919d("MicroMsg.FTSVoiceInputLayoutImpl", "btn onTouch ACTION_DOWN currentState %s longClickStartTime %s", Integer.valueOf(this.f52883d.f52892f), Long.valueOf(this.f52883d.f52878v));
            C68992b bVar = this.f52883d.f52875s;
            Log.m105919d("MicroMsg.FTSVoiceInputDrawable", "readyPressState %s", Integer.valueOf(bVar.f198253n));
            bVar.f198253n = 6;
            bVar.invalidateSelf();
            this.f52883d.mo23846l(false, false);
            this.f52883d.f52874r.setVisibility(8);
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fts/ui/widget/FTSVoiceInputLayoutImpl$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
