package com.tencent.p014mm.plugin.webwx.p129ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.modelsimple.C40361k0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webwx.p129ui.C72632c;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import e62.C75554c;
import eb0.C31461f3;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import fy3.C32224a;
import g62.C32330n;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ol0.C117815j0;
import p910lj.C76701a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tc0.C77885p;
import te3.C64266br1;
import yl0.C91496m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webwx/ui/LoginDeviceListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "Leb0/f3;", "Lcom/tencent/mm/plugin/webwx/ui/c$a;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI */
public class LoginDeviceListUI extends MMActivity implements C11385n, C31461f3, C72632c.C72633a {

    /* renamed from: d */
    public boolean f211292d;

    /* renamed from: e */
    public int f211293e;

    /* renamed from: f */
    public final C13601g f211294f = C36568h.m40985a(new C30624a(this));

    /* renamed from: g */
    public ProgressDialog f211295g;

    /* renamed from: h */
    public final ArrayList<C75554c.C75555b> f211296h = new ArrayList<>();

    /* renamed from: i */
    public final LoginDeviceListUI$iUpdateExtDeviceListener$1 f211297i;

    /* renamed from: j */
    public final IListener<?> f211298j;

    /* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$a */
    public static final class C30624a extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ LoginDeviceListUI f82445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30624a(LoginDeviceListUI loginDeviceListUI) {
            super(0);
            this.f82445d = loginDeviceListUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f82445d.findViewById(C0966R.C0970id.f358631g62);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$b */
    public static final class C30625b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ LoginDeviceListUI f82446d;

        public C30625b(LoginDeviceListUI loginDeviceListUI) {
            this.f82446d = loginDeviceListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f82446d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$c */
    public static final class C72629c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f211299d;

        /* renamed from: e */
        public final /* synthetic */ int f211300e;

        /* renamed from: f */
        public final /* synthetic */ LoginDeviceListUI f211301f;

        /* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$c$a */
        public static final class C72630a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C40361k0 f211302d;

            /* renamed from: e */
            public final /* synthetic */ LoginDeviceListUI f211303e;

            public C72630a(C40361k0 k0Var, LoginDeviceListUI loginDeviceListUI) {
                this.f211302d = k0Var;
                this.f211303e = loginDeviceListUI;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123458d(this.f211302d);
                ProgressDialog progressDialog = this.f211303e.f211295g;
                if (progressDialog != null) {
                    progressDialog.cancel();
                }
            }
        }

        public C72629c(int i, int i2, LoginDeviceListUI loginDeviceListUI) {
            this.f211299d = i;
            this.f211300e = i2;
            this.f211301f = loginDeviceListUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C40361k0 k0Var = new C40361k0(1, this.f211299d, this.f211300e);
            C97625j3.m125815e().mo123460f(k0Var);
            LoginDeviceListUI loginDeviceListUI = this.f211301f;
            loginDeviceListUI.f211295g = C76879j.m92723Q(loginDeviceListUI.getContext(), this.f211301f.getString(C0966R.string.a3h), this.f211301f.getString(C0966R.string.a4d), true, true, new C72630a(k0Var, this.f211301f));
        }
    }

    public LoginDeviceListUI() {
        C40008f fVar = C40008f.f107254d;
        this.f211297i = new LoginDeviceListUI$iUpdateExtDeviceListener$1(this, fVar);
        this.f211298j = new LoginDeviceListUI$statusNotifyFunctionListener$1(this, fVar);
    }

    /* renamed from: H2 */
    public void mo100068H2() {
        this.f211292d = true;
    }

    /* renamed from: H7 */
    public final RecyclerView mo100069H7() {
        Object value = ((C36570n) this.f211294f).getValue();
        C87412m.m108593f(value, "<get-deviceContainerRv>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: U6 */
    public void mo100070U6(int i, int i2, String str) {
        C87412m.m108594g(str, "exitConfirm");
        if (this.f211293e == C75554c.f221953h) {
            C76879j.m92707A(getContext(), str, getString(C0966R.string.a3h), getString(C0966R.string.li5), getString(C0966R.string.f7926wf), new C72629c(i, i2, this), (DialogInterface.OnClickListener) null);
            return;
        }
        finish();
    }

    /* renamed from: Z0 */
    public void mo100071Z0(int i) {
        RecyclerView.C16613e adapter = mo100069H7().getAdapter();
        C72631b bVar = adapter instanceof C72631b ? (C72631b) adapter : null;
        if (bVar != null) {
            Log.m105924i("MicroMsg.LoginDeviceAdapter", "setSelection:" + i + ", oriSelection:" + bVar.f211305e);
            if (bVar.f211305e != i) {
                bVar.f211305e = i;
                bVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        if (!C97625j3.m125812b().mo105884J()) {
            finish();
        } else if (C75554c.m90590m1()) {
            Log.m105918d("MicroMsg.LoginDeviceListUI", "extDevice remote lock");
            notifyDataSetChanged();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b8d;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.gcr);
        setBackBtn(new C30625b(this), C0966R.raw.actionbar_icon_close_black);
        hideActionbarLine();
        this.f211296h.addAll(C75554c.m90589l1());
        RecyclerView H7 = mo100069H7();
        ArrayList<C75554c.C75555b> arrayList = this.f211296h;
        H7.setAdapter(new C72631b(arrayList, arrayList.size() == 1 ? 0 : -1, this));
        WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.mo16974W(1);
        mo100069H7().setLayoutManager(wxLinearLayoutManager);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MULTI_DEVICE_NEW_EDUCATION_SHOWN_BOOLEAN_SYNC;
        if (!i.mo119686g(aVar, false)) {
            ((TextView) findViewById(C0966R.C0970id.jme)).setVisibility(0);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
        }
    }

    public void notifyDataSetChanged() {
        RecyclerView.C16613e adapter = mo100069H7().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f211293e = getIntent().getIntExtra("intent.key.online_version", 0);
        }
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        C97625j3.m125815e().mo123455a(281, this);
        C97625j3.m125815e().mo123455a(C91496m.CTRL_INDEX, this);
        C97625j3.m125815e().mo123455a(C117815j0.CTRL_INDEX, this);
        this.f211297i.alive();
        C97625j3.m125812b().mo105886a(this);
        this.f211298j.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
        C97625j3.m125815e().mo123470p(281, this);
        C97625j3.m125815e().mo123470p(C91496m.CTRL_INDEX, this);
        C97625j3.m125815e().mo123470p(C117815j0.CTRL_INDEX, this);
        C97625j3.m125812b().mo105885K(this);
        this.f211297i.dead();
        this.f211298j.dead();
    }

    public void onPause() {
        super.onPause();
        if (this.f211292d && C97625j3.m125811a()) {
            C64266br1 br12 = new C64266br1();
            br12.f182324d = 27;
            br12.f182325e = C75592q0.m90765M() ? 1 : 2;
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(23, br12));
            this.f211292d = false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        ProgressDialog progressDialog = this.f211295g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f211295g = null;
        if (yVar.getType() == 281) {
            if (!(i == 0 && i2 == 0)) {
                C76701a.makeText((Context) this, (int) C0966R.string.li6, 1).show();
            }
            finish();
        } else if (yVar.getType() == 526) {
            this.f211296h.clear();
            this.f211296h.addAll(C75554c.m90589l1());
            notifyDataSetChanged();
        }
    }

    /* renamed from: q */
    public void mo100073q() {
        finish();
    }
}
