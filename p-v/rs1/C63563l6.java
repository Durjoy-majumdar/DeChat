package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import kg3.C76577a;
import p447aw.C103918d;
import r50.C63372j;

/* renamed from: rs1.l6 */
public final class C63563l6 extends UIComponent {

    /* renamed from: d */
    public final AppCompatActivity f180260d;

    /* renamed from: e */
    public final C63564a f180261e = new C63564a(this);

    /* renamed from: rs1.l6$a */
    public static final class C63564a implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C63563l6 f180262d;

        public C63564a(C63563l6 l6Var) {
            this.f180262d = l6Var;
        }

        public void onAppBackground(String str) {
            Log.m105924i("FinderLiveNotificationUIC", "onAppBackground activity: " + str + " isCurActDestroy: " + this.f180262d.f180260d.isDestroyed());
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext()) && !this.f180262d.f180260d.isDestroyed()) {
                C63372j jVar = C63372j.f179760a;
                String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.g8z);
                C87412m.m108593f(q, "getString(MMApplicationC…g.live_notification_tip1)");
                String q2 = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f360959g90);
                C87412m.m108593f(q2, "getString(MMApplicationC…g.live_notification_tip2)");
                String q3 = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.g8z);
                C87412m.m108593f(q3, "getString(MMApplicationC…g.live_notification_tip1)");
                jVar.mo88278a(q, q2, q3, this.f180262d.f180260d.getClass().getName());
            }
        }

        public void onAppForeground(String str) {
            Log.m105924i("FinderLiveNotificationUIC", "onAppForeground activity:" + str);
            C63372j.f179760a.mo88279b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63563l6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "act");
        this.f180260d = appCompatActivity;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("FinderLiveNotificationUIC", "onCreate: ");
        AppForegroundDelegate.INSTANCE.mo174208a(this.f180261e);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("FinderLiveNotificationUIC", "onDestroy: ");
        AppForegroundDelegate.INSTANCE.mo174215k(this.f180261e);
    }
}
