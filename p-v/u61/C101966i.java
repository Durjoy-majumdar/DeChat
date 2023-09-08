package u61;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: u61.i */
public class C101966i {

    /* renamed from: a */
    public String f300172a;

    /* renamed from: b */
    public boolean f300173b;

    public C101966i(int i) {
    }

    /* renamed from: a */
    public void mo141488a(Activity activity) {
        Log.m105918d("MicroMsg.emoji.UseSmileyTool", "jacks sendToFriend emoji");
        Intent intent = new Intent();
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        C88144b.m109802t(activity, ".ui.transmit.SelectConversationUI", intent, 2003);
        activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
    }
}
