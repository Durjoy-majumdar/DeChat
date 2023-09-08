package com.tencent.p014mm.plugin.voip.widget;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import di3.C86312j;
import eb0.C75592q0;
import l33.C109246a;
import l33.C109247e;
import p196ln.C76705f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView$$a */
public final /* synthetic */ class NewVideoTalkingSmallView$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewVideoTalkingSmallView f318194d;

    public /* synthetic */ NewVideoTalkingSmallView$$a(NewVideoTalkingSmallView newVideoTalkingSmallView) {
        this.f318194d = newVideoTalkingSmallView;
    }

    public final void run() {
        NewVideoTalkingSmallView newVideoTalkingSmallView = this.f318194d;
        newVideoTalkingSmallView.getClass();
        Class cls = C76705f.class;
        C109246a aVar = C109247e.xx0().f317333b;
        Bitmap loadBitmap = ((C76705f) C86312j.m106911c(cls)).mo106829VT().loadBitmap(C75592q0.m90789s());
        newVideoTalkingSmallView.f318168B = loadBitmap;
        if (loadBitmap == null) {
            newVideoTalkingSmallView.f318168B = ((C76705f) C86312j.m106911c(cls)).mo106829VT().mo10728qq();
        }
        if (aVar != null) {
            newVideoTalkingSmallView.f318169C = ((C76705f) C86312j.m106911c(cls)).mo106829VT().loadBitmap(aVar.mo152445S());
        }
        if (newVideoTalkingSmallView.f318169C == null) {
            newVideoTalkingSmallView.f318169C = ((C76705f) C86312j.m106911c(cls)).mo106829VT().mo10728qq();
        }
        Bitmap bitmap = newVideoTalkingSmallView.f318168B;
        if (bitmap != null) {
            newVideoTalkingSmallView.f318170D = BitmapUtil.fastblur(bitmap, 30);
        }
        Bitmap bitmap2 = newVideoTalkingSmallView.f318169C;
        if (bitmap2 != null) {
            newVideoTalkingSmallView.f318171E = BitmapUtil.fastblur(bitmap2, 30);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new NewVideoTalkingSmallView$$b(newVideoTalkingSmallView));
    }
}
