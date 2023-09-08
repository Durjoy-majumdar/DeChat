package zd0;

import android.content.DialogInterface;
import ce0.C54715a;
import ce0.C80017c;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.msgsubscription.p017ui.AppBrandAuthorizeSubscribeMsgDetailUI;
import com.tencent.p014mm.msgsubscription.voice.PlayVoiceData;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zd0.d */
public class C119098d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeSubscribeMsgDetailUI f356654d;

    public C119098d(AppBrandAuthorizeSubscribeMsgDetailUI appBrandAuthorizeSubscribeMsgDetailUI) {
        this.f356654d = appBrandAuthorizeSubscribeMsgDetailUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AppBrandAuthorizeSubscribeMsgDetailUI appBrandAuthorizeSubscribeMsgDetailUI = this.f356654d;
        AtomicLong atomicLong = appBrandAuthorizeSubscribeMsgDetailUI.f344114p;
        String str = appBrandAuthorizeSubscribeMsgDetailUI.f344106e.f49034v;
        C87412m.m108594g(str, "url");
        long nanoTime = System.nanoTime();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new PlayVoiceData(nanoTime, str, 0), C80017c.class, C54715a.f153352d);
        atomicLong.set(nanoTime);
    }
}
