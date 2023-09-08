package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72813n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.p1 */
public class C72819p1 extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C72826s1 f212214a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72819p1(C72826s1 s1Var, Looper looper) {
        super(looper);
        this.f212214a = s1Var;
    }

    public void handleMessage(Message message) {
        Bitmap bitmap;
        C72826s1 s1Var = this.f212214a;
        if (!((ChatFooter) s1Var.f212235l).mo100450s0()) {
            Log.m105928w("MicroMsg.RecentImageBubble", "[checkIfShow] is not support.");
            return;
        }
        ImageView imageView = s1Var.f212229f;
        if (imageView != null && s1Var.f212226c != null && (bitmap = s1Var.f212230g) != null && s1Var.f212231h != null && s1Var.f212232i != null && s1Var.f212233j != null) {
            imageView.setImageBitmap(bitmap);
            boolean z = s1Var.f212234k;
            int i = z ? 83 : 85;
            int i2 = z ? 0 : 10;
            C72813n1.C72814a aVar = s1Var.f212235l;
            int yFromBottom = aVar != null ? aVar.getYFromBottom() : s1Var.f212233j.getHeight();
            Rect rect = C85875k4.f250155a;
            int i3 = s1Var.f212234k ? 0 : i2 + rect.right;
            int i4 = yFromBottom + rect.bottom;
            Log.m105925i("MicroMsg.RecentImageBubble", "recent bubble navbar height %s %s", Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
            Context context = s1Var.f212224a;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && !((Activity) s1Var.f212224a).isDestroyed()) {
                try {
                    s1Var.f212231h.showAtLocation(s1Var.f212232i, i, i3, i4);
                } catch (NullPointerException e) {
                    Log.printErrStackTrace("MicroMsg.RecentImageBubble", e, "", new Object[0]);
                }
            }
            new MTimerHandler(new C72823r1(s1Var), false).startTimer(10000);
        }
    }
}
