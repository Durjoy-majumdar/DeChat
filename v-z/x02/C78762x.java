package x02;

import android.content.DialogInterface;
import com.tencent.p014mm.autogen.events.GlobalAlertEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import se3.C77683a;
import se3.C77684b;

/* renamed from: x02.x */
public class C78762x {

    /* renamed from: x02.x$a */
    public class C78763a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f230493d;

        /* renamed from: e */
        public final /* synthetic */ String f230494e;

        /* renamed from: f */
        public final /* synthetic */ String f230495f;

        /* renamed from: g */
        public final /* synthetic */ String f230496g;

        /* renamed from: h */
        public final /* synthetic */ DialogInterface.OnClickListener f230497h;

        /* renamed from: i */
        public final /* synthetic */ DialogInterface.OnClickListener f230498i;

        public C78763a(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
            this.f230493d = str;
            this.f230494e = str2;
            this.f230495f = str3;
            this.f230496g = str4;
            this.f230497h = onClickListener;
            this.f230498i = onClickListener2;
        }

        public void run() {
            GlobalAlertEvent globalAlertEvent = new GlobalAlertEvent();
            C77684b bVar = new C77684b();
            bVar.f226456e = this.f230493d;
            bVar.f226457f = this.f230494e;
            bVar.f226458g = new LinkedList<>();
            C77683a aVar = new C77683a();
            aVar.f226453f = this.f230495f;
            bVar.f226458g.add(aVar);
            C77683a aVar2 = new C77683a();
            aVar2.f226453f = this.f230496g;
            bVar.f226458g.add(aVar2);
            GlobalAlertEvent.C67717a aVar3 = globalAlertEvent.f193674d;
            aVar3.f193678d = 1;
            aVar3.f193675a = bVar;
            aVar3.f193676b = this.f230497h;
            aVar3.f193677c = this.f230498i;
            globalAlertEvent.publish();
        }
    }

    /* renamed from: a */
    public static void m95149a(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "msg is null");
            return;
        }
        Log.m105924i("MicroMsg.Tinker.TinkerBootsUpdateDialogUI", "try to show dialog");
        MMHandlerThread.postToMainThread(new C78763a(str, str2, str3, str4, onClickListener, onClickListener2));
    }
}
