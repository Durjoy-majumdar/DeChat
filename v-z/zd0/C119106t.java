package zd0;

import android.view.View;
import ce0.C113319b;
import ce0.C54715a;
import ce0.C80017c;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.msgsubscription.voice.PlayVoiceData;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import zd0.C23466p;

/* renamed from: zd0.t */
public final class C119106t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23466p.C23482l f356668d;

    /* renamed from: e */
    public final /* synthetic */ C23466p f356669e;

    /* renamed from: zd0.t$a */
    public static final class C119107a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f356670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C119107a(long j) {
            super(0);
            this.f356670d = j;
        }

        public Object invoke() {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new PlayVoiceData(this.f356670d, "", 1), C80017c.class, C113319b.f339074d);
            return C13598b0.f38549a;
        }
    }

    public C119106t(C23466p.C23482l lVar, C23466p pVar) {
        this.f356668d = lVar;
        this.f356669e = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$addSingleVoiceTmpMode$acceptWithVoiceView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f356668d.f67377f;
        C87412m.m108594g(str, "url");
        long nanoTime = System.nanoTime();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new PlayVoiceData(nanoTime, str, 0), C80017c.class, C54715a.f153352d);
        this.f356669e.f67312I = new C119107a(nanoTime);
        C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$addSingleVoiceTmpMode$acceptWithVoiceView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
