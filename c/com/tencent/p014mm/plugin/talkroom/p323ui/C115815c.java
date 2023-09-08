package com.tencent.p014mm.plugin.talkroom.p323ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.c */
public class C115815c implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomUI.C115813i f347451d;

    public C115815c(TalkRoomUI talkRoomUI, TalkRoomUI.C115813i iVar) {
        this.f347451d = iVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        TalkRoomUI.C115813i iVar = this.f347451d;
        iVar.getClass();
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            iVar.f347447a = motionEvent.getX();
            iVar.f347448b = motionEvent.getY();
            iVar.f347449c = Util.currentTicks();
        } else {
            if (action == 1 || action == 3) {
                float abs = Math.abs(motionEvent.getX() - iVar.f347447a);
                float y = iVar.f347448b - motionEvent.getY();
                if (y >= 100.0f && y / abs > 2.0f && y / ((float) Util.ticksToNow(iVar.f347449c)) > 0.6f) {
                    ((C115814b) iVar).f347450d.onBackPressed();
                }
            }
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
