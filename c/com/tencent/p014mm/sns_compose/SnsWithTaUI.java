package com.tencent.p014mm.sns_compose;

import a14.C53896h0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.MMComposeActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sns_compose.page.C57589s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import k21.C60960c;
import kh3.C109009b;
import kotlin.Metadata;
import mh3.C109626a;
import oh3.C110041b;
import oh3.C110050i;
import p1105d5.C106988a;
import p1105d5.C106989b;
import p1105d5.C106994f;
import p1152s5.C110740c;
import p175j0.C108504h;
import p415q0.C110261c;
import p632o5.C109950b;
import p632o5.C109951c;
import p643p5.C110166b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sns_compose/SnsWithTaUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "sns-compose_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sns_compose.SnsWithTaUI */
public final class SnsWithTaUI extends MMComposeActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f318528g = 0;

    /* renamed from: d */
    public int f318529d;

    /* renamed from: e */
    public final long f318530e = System.currentTimeMillis();

    /* renamed from: f */
    public final C13601g f318531f = C36568h.m40985a(new C106600c(this));

    /* renamed from: com.tencent.mm.sns_compose.SnsWithTaUI$a */
    public static final class C106598a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsWithTaUI f318532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106598a(SnsWithTaUI snsWithTaUI) {
            super(2);
            this.f318532d = snsWithTaUI;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C109009b.m147987a(C110261c.m149878b(hVar, 2099685198, true, new C106601a(this.f318532d)), hVar, 6);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.SnsWithTaUI$b */
    public static final class C106599b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsWithTaUI f318533d;

        public C106599b(SnsWithTaUI snsWithTaUI) {
            this.f318533d = snsWithTaUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f318533d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.SnsWithTaUI$c */
    public static final class C106600c extends C87413o implements C32224a<C57589s> {

        /* renamed from: d */
        public final /* synthetic */ SnsWithTaUI f318534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106600c(SnsWithTaUI snsWithTaUI) {
            super(0);
            this.f318534d = snsWithTaUI;
        }

        public Object invoke() {
            return (C57589s) C39818r.f106831a.mo62444c(this.f318534d).mo75002a(C57589s.class);
        }
    }

    public int getLayoutId() {
        return 1;
    }

    public View getLayoutView() {
        MMComposeView mMComposeView = new MMComposeView(this, (AttributeSet) null, 2, (C8480h) null);
        mMComposeView.setContent(C110261c.m149879c(880148175, true, new C106598a(this)));
        return mMComposeView;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C57589s sVar = (C57589s) ((C36570n) this.f318531f).getValue();
        sVar.getClass();
        sVar.f164904d = new LifecycleScope("compose_playVideo", this, 0, 4, (C8480h) null);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        if (!C110041b.f329303a) {
            C110041b.f329303a = true;
            C106994f.C106995a aVar = new C106994f.C106995a(context);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            C87412m.m108594g(config, "bitmapConfig");
            C109951c a = C109951c.m149462a(aVar.f320264b, (C53896h0) null, (C110740c) null, (C110166b) null, config, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C109950b) null, (C109950b) null, (C109950b) null, 4087, (Object) null);
            aVar.f320264b = a;
            aVar.f320264b = C109951c.m149462a(a, (C53896h0) null, (C110740c) null, (C110166b) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, C109950b.ENABLED, (C109950b) null, (C109950b) null, 3583, (Object) null);
            C106989b.C106990a aVar2 = new C106989b.C106990a();
            aVar2.mo157424a(new C110050i(), Uri.class);
            ((ArrayList) aVar2.f320259d).add(new C109626a(context));
            aVar.f320265c = aVar2.mo157426c();
            C106994f a2 = aVar.mo157446a();
            synchronized (C106988a.class) {
                try {
                    C106988a.f320251b = a2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        this.f318529d = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
        C60960c.C60961a aVar3 = C60960c.f173618a;
        String e = C24560g0.m30725a(MomentsTogetherHistoryBrowsingStruct.class).mo51262e();
        C87412m.m108591d(e);
        aVar3.mo85925i("MomentsTogetherHistoryBrowsing", e);
        aVar3.mo85926j("MomentsTogetherHistoryBrowsing", "ifRedDot", Integer.valueOf(getIntent().getIntExtra("has_dot", 0)));
        aVar3.mo85926j("MomentsTogetherHistoryBrowsing", FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(this.f318529d));
        aVar3.mo85926j("MomentsTogetherHistoryBrowsing", "withFriendFeedTime", Long.valueOf(System.currentTimeMillis()));
        aVar3.mo85926j("MomentsTogetherHistoryBrowsing", "pageOwnerUsername", "");
        setBackBtn(new C106599b(this));
    }

    public void onDestroy() {
        super.onDestroy();
        long currentTimeMillis = System.currentTimeMillis() - this.f318530e;
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85926j("MomentsTogetherHistoryBrowsing", "withFriendFeedTime", Long.valueOf(currentTimeMillis));
        aVar.mo85926j("MomentsTogetherHistoryBrowsing", "ownerSetting", 0);
        aVar.mo85926j("SnsUserBehaviourInfo", "withFriendsStayTime", Long.valueOf(currentTimeMillis));
        C60960c.C60961a.m71444b(aVar, "MomentsTogetherHistoryBrowsing", false, false, 6, (Object) null);
    }
}
