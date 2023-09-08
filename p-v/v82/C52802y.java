package v82;

import android.view.View;
import c92.C39929d;
import c92.C39930e;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.y */
public class C52802y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52800x f147517d;

    public C52802y(C52800x xVar) {
        this.f147517d = xVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MeetingLinkFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.MeetingLinkFooter", "meeting footer has been click and run it");
        C39929d.m42712j(this.f147517d.f147508a, "list");
        C39930e.m42720c(C39929d.m42711i(), 1, 0, 0, 0, 0, 0, 0, 0, "", 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MeetingLinkFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
