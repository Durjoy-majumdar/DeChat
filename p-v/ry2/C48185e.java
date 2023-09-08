package ry2;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0125s;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import dj3.C45405a;
import gy3.C87412m;
import java.util.regex.Pattern;
import o40.C61926c;
import p739wi.C78597c;
import qy2.C47902u;
import rx3.C13604l;
import rz2.C48212k;
import uy2.C52657a;
import uy2.C52665g;
import xy2.C53477h;
import yy2.C53658a;
import yz2.C53700n2;
import z04.C112551y;

/* renamed from: ry2.e */
public final class C48185e implements C78597c.C78598b {

    /* renamed from: d */
    public final /* synthetic */ C52657a f129144d;

    /* renamed from: e */
    public final /* synthetic */ C48186f f129145e;

    /* renamed from: f */
    public final /* synthetic */ View f129146f;

    public C48185e(C52657a aVar, C48186f fVar, View view) {
        this.f129144d = aVar;
        this.f129145e = fVar;
        this.f129146f = view;
    }

    /* renamed from: J5 */
    public boolean mo72924J5() {
        Log.m105924i("MicroMsg.TextStatus.TextStatusConversationClickListener", "onChattingUIExit");
        C45405a aVar = new C45405a(this.f129146f);
        Pattern pattern = C61926c.f176038a;
        MMHandlerThread.postToMainThreadDelayed(aVar, 0);
        C39674e eVar = C39674e.f106452d;
        C53658a D = eVar.mo62238D();
        String str = this.f129144d.field_sessionId;
        C87412m.m108593f(str, "item.field_sessionId");
        D.mo74245K(str);
        FragmentActivity activity = this.f129145e.f129147d.getActivity();
        if (activity == null) {
            return false;
        }
        eVar.mo62241N0();
        ((C53700n2) C39818r.f106831a.mo62443b(activity).mo75002a(C53700n2.class)).mo74293i3(1);
        return false;
    }

    /* renamed from: h3 */
    public void mo72925h3() {
        String str;
        Log.m105924i("MicroMsg.TextStatus.TextStatusConversationClickListener", "onChattingUIEnter");
        C53477h hVar = (C53477h) C86312j.m106911c(C53477h.class);
        String str2 = this.f129144d.field_sessionId;
        hVar.getClass();
        if (!(str2 == null || C112551y.m153811k(str2))) {
            C48212k wx02 = hVar.wx0(str2);
            if (wx02 != null && ((str = wx02.field_nickname) == null || str.length() == 0)) {
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[checkContactExpired] isNeedGetContact=");
            sb.append(true);
            sb.append(" sessionId=");
            sb.append(str2);
            sb.append(" nickname=");
            String str3 = null;
            sb.append(wx02 != null ? wx02.field_nickname : null);
            sb.append(" avatar=");
            if (wx02 != null) {
                str3 = wx02.field_smallHeadImgUrl;
            }
            sb.append(str3);
            Log.m105924i("MicroMsg.TextStatus.TextStatusContactService", sb.toString());
            String str4 = C39674e.f106452d.mo62251j0().mo61999jo(str2).field_talker;
            if (str4 == null) {
                str4 = "";
            }
            Log.m105924i("MicroMsg.TextStatus.TextStatusContactService", "[checkContactExpired] talker=" + str4);
            C53477h.vx0(hVar, new C13604l(str2, str4), (C47902u.C36207b) null, (C0125s) null, false, 14, (Object) null);
        }
        C53658a D = C39674e.f106452d.mo62238D();
        String str5 = this.f129144d.field_sessionId;
        C87412m.m108593f(str5, "item.field_sessionId");
        D.mo74245K(str5);
        if (this.f129145e.f129147d.getActivity() != null) {
            C52657a aVar = this.f129144d;
            C52665g.C52666a aVar2 = C52665g.f147055f;
            String str6 = aVar.field_sessionId;
            C87412m.m108593f(str6, "item.field_sessionId");
            aVar2.mo73606c(str6, 53);
        }
    }
}
