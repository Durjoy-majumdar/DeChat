package eg1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostPendingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ik1.C33345k;
import j20.C117292a;
import java.util.ArrayList;
import js3.C60921b;
import k20.C9556a;
import ky2.C10432i;
import ls3.C34356e;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tf0.C64916p1;

@C86522b
/* renamed from: eg1.f */
public final class C31582f extends C86301e implements C34356e {

    /* renamed from: d */
    public final String f84401d = "Finder.FinderChatroomLiveFeatureService";

    /* renamed from: e */
    public boolean f84402e;

    /* renamed from: f */
    public final C13601g f84403f = C36568h.m40985a(C31583a.f84404d);

    /* renamed from: eg1.f$a */
    public static final class C31583a extends C87413o implements C32224a<C33345k> {

        /* renamed from: d */
        public static final C31583a f84404d = new C31583a();

        public C31583a() {
            super(0);
        }

        public Object invoke() {
            C33345k.C33346a aVar = C33345k.f90386f;
            aVar.getClass();
            C86709a0.m107523b().mo121108c();
            synchronized (aVar) {
                if (C33345k.f90391n == null) {
                    aVar.mo59090a();
                }
            }
            return C33345k.f90391n;
        }
    }

    /* renamed from: eg1.f$b */
    public static final class C31584b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C31582f f84405d;

        /* renamed from: e */
        public final /* synthetic */ String f84406e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31584b(C31582f fVar, String str) {
            super(0);
            this.f84405d = fVar;
            this.f84406e = str;
        }

        public Object invoke() {
            String str = this.f84405d.f84401d;
            Log.m105924i(str, "tryGetTipsBarStorage chatroomId:" + this.f84406e);
            C33345k kVar = (C33345k) ((C36570n) this.f84405d.f84403f).getValue();
            if (kVar != null) {
                kVar.mo59089qq(this.f84406e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: QX */
    public boolean mo58235QX() {
        C62042e.f176370a.getClass();
        boolean z = !C62042e.f176374e && C85875k4.m106210y();
        String str = this.f84401d;
        Log.m105924i(str, "hideChatroomLive is pad:" + z);
        Class cls = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        boolean z2 = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        String str2 = this.f84401d;
        Log.m105924i(str2, "[supportChatroomLive] show:" + sF + " isTeenModeAndNothing:" + z2);
        return !(sF && !z2) || z;
    }

    /* renamed from: XA */
    public C60921b mo58236XA() {
        return (C33345k) ((C36570n) this.f84403f).getValue();
    }

    /* renamed from: ij */
    public void mo58237ij(Context context, String str, int i, long j) {
        Context context2 = context;
        String str2 = str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str2, "chatroomId");
        if (!this.f84402e) {
            boolean z = FinderLivePostPendingUI.f14540p;
            if (!FinderLivePostPendingUI.f14540p) {
                this.f84402e = true;
                Intent intent = new Intent();
                intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i);
                intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", j);
                intent.putExtra("ENTER_SCENE", 2);
                intent.putExtra("KEY_FROM_CHAT_ROOM_ID", str2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                C13598b0 b0Var = C13598b0.f38549a;
                intent.putExtra("KEY_WHITE_ROOM_LIST", arrayList);
                intent.putExtra("KEY_WHITE_LIST_MODE", 2);
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1.C64917a.m76443j((C64916p1) c, context, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
                intent.setClass(context, FinderLivePostPendingUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/FinderChatroomLiveFeatureService", "startChatroomLive", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/finder/live/FinderChatroomLiveFeatureService", "startChatroomLive", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f84402e = false;
                return;
            }
        }
        String str3 = this.f84401d;
        StringBuilder sb = new StringBuilder();
        sb.append("startChatroomLive startingLive:");
        sb.append(this.f84402e);
        sb.append(", isPendingPost:");
        boolean z2 = FinderLivePostPendingUI.f14540p;
        sb.append(FinderLivePostPendingUI.f14540p);
        Log.m105924i(str3, sb.toString());
    }

    /* renamed from: sn */
    public C60921b mo58238sn(String str) {
        C87412m.m108594g(str, "chatroomId");
        C33345k.f90386f.getClass();
        if (C33345k.f90391n != null) {
            return (C33345k) ((C36570n) this.f84403f).getValue();
        }
        C61926c.m72693r(new C31584b(this, str));
        return null;
    }
}
