package vd0;

import android.app.Activity;
import android.content.Intent;
import be0.C16789g;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.p017ui.AppBrandAuthorizeSubscribeMsgDetailUI;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import rx3.C13598b0;
import sd0.C22355a;
import sd0.C22357b;
import vd0.C22736b;
import zd0.C119100f;
import zd0.C119108z;

/* renamed from: vd0.d */
public final class C22739d extends C22735a {

    /* renamed from: b */
    public final int f65426b = 1;

    /* renamed from: c */
    public Activity f65427c;

    /* renamed from: d */
    public SubscribeMsgSettingData f65428d;

    /* renamed from: e */
    public boolean f65429e;

    /* renamed from: vd0.d$a */
    public static final class C22740a implements C119108z.C119110b {

        /* renamed from: a */
        public final /* synthetic */ C22739d f65430a;

        /* renamed from: b */
        public final /* synthetic */ MMActivity f65431b;

        public C22740a(C22739d dVar, MMActivity mMActivity) {
            this.f65430a = dVar;
            this.f65431b = mMActivity;
        }

        /* renamed from: a */
        public boolean mo35840a(SubscribeMsgTmpItem subscribeMsgTmpItem) {
            C87412m.m108594g(subscribeMsgTmpItem, "item");
            this.f65430a.getClass();
            return subscribeMsgTmpItem.f49025j == 1;
        }

        /* renamed from: b */
        public void mo35841b(SubscribeMsgTmpItem subscribeMsgTmpItem, int i) {
            C87412m.m108594g(subscribeMsgTmpItem, "item");
            C22739d dVar = this.f65430a;
            MMActivity mMActivity = this.f65431b;
            dVar.getClass();
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            mMActivity.mmSetOnActivityResultCallback(new C22742e(dVar, i));
            Intent intent = new Intent(mMActivity, AppBrandAuthorizeSubscribeMsgDetailUI.class);
            intent.putExtra("key_data", subscribeMsgTmpItem);
            boolean z = true;
            if (subscribeMsgTmpItem.f49025j != 1) {
                z = false;
            }
            intent.putExtra("key_status_subscribed", z);
            C88144b.m109802t(mMActivity, "com.tencent.mm.msgsubscription.ui.AppBrandAuthorizeSubscribeMsgDetailUI", intent, dVar.f65426b);
        }
    }

    /* renamed from: vd0.d$b */
    public static final class C22741b extends C87413o implements C32226l<SubscribeMsgSettingData, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22739d f65432d;

        /* renamed from: e */
        public final /* synthetic */ C22736b.C22737a f65433e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22741b(C22739d dVar, C22736b.C22737a aVar) {
            super(1);
            this.f65432d = dVar;
            this.f65433e = aVar;
        }

        public Object invoke(Object obj) {
            SubscribeMsgSettingData subscribeMsgSettingData = (SubscribeMsgSettingData) obj;
            this.f65432d.f65428d = subscribeMsgSettingData;
            C22736b.C22737a aVar = this.f65433e;
            if (subscribeMsgSettingData == null) {
                aVar.mo35838a();
            } else {
                aVar.mo35839b(subscribeMsgSettingData);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo35609a(String str, C22736b.C22737a aVar) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(aVar, "l");
        Activity activity = this.f65427c;
        if (activity != null) {
            SubscribeMsgSettingData subscribeMsgSettingData = (SubscribeMsgSettingData) activity.getIntent().getParcelableExtra("key_biz_data");
            this.f65428d = subscribeMsgSettingData;
            if (subscribeMsgSettingData == null) {
                C16789g gVar = new C16789g(str, new C22741b(this, aVar));
                C22357b bVar = new C22357b(str, 3);
                bVar.f63381f = gVar;
                bVar.mo35487b(C22355a.f63371a);
                return;
            }
            aVar.mo35839b(subscribeMsgSettingData);
            return;
        }
        C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        throw null;
    }

    /* renamed from: b */
    public void mo35610b(boolean z) {
        this.f65429e = true;
        SubscribeMsgSettingData subscribeMsgSettingData = this.f65428d;
        if (subscribeMsgSettingData != null) {
            subscribeMsgSettingData.f49051e = z;
        }
    }

    /* renamed from: c */
    public C119100f<?> mo35611c(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C119108z(mMActivity, new C22740a(this, mMActivity));
    }

    /* renamed from: d */
    public void mo35612d(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f65427c = activity;
    }

    /* renamed from: g */
    public void mo35615g(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (this.f65429e && this.f65428d != null) {
            Intent intent = new Intent();
            intent.putExtra("key_biz_data", this.f65428d);
            activity.setResult(-1, intent);
        }
    }
}
