package com.tencent.p014mm.plugin.voip.widget;

/* renamed from: com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$$c */
public class NewVideoTalkingSmallView$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewVideoTalkingSmallView f318196d;

    public NewVideoTalkingSmallView$$c(NewVideoTalkingSmallView newVideoTalkingSmallView) {
        this.f318196d = newVideoTalkingSmallView;
    }

    public void run() {
        NewVideoTalkingSmallView newVideoTalkingSmallView = this.f318196d;
        if (!newVideoTalkingSmallView.f318184r && newVideoTalkingSmallView.f318191y) {
            newVideoTalkingSmallView.f318184r = true;
            newVideoTalkingSmallView.f318191y = false;
            newVideoTalkingSmallView.f318178i.setVisibility(0);
            newVideoTalkingSmallView.f318178i.mo153116a(true);
            newVideoTalkingSmallView.f318179j.mo153116a(false);
            newVideoTalkingSmallView.f318179j.animate().alpha(0.0f).setDuration(500).setListener(new C106509b(newVideoTalkingSmallView)).start();
        }
    }
}
