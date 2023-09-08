package com.tencent.p014mm.msgsubscription.p017ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86737h0;
import fy3.C32224a;
import gt0.C87362k;
import gt0.C87370k0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import qo3.C77398g;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ud0.C22624a;
import zd0.C23466p;
import zd0.C23495y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C88989a(7)
/* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI */
public final class SubscribeMsgRequestProxyUI extends MMActivity {

    /* renamed from: v */
    public static final /* synthetic */ int f49065v = 0;

    /* renamed from: d */
    public C87370k0 f49066d;

    /* renamed from: e */
    public C87362k f49067e;

    /* renamed from: f */
    public C89779i0 f49068f;

    /* renamed from: g */
    public C22624a.C22626b f49069g;

    /* renamed from: h */
    public int f49070h;

    /* renamed from: i */
    public final C13601g f49071i = C36568h.m40985a(new C17818g(this));

    /* renamed from: j */
    public final C13601g f49072j = C36568h.m40985a(new C17814c(this));

    /* renamed from: n */
    public final C13601g f49073n = C36568h.m40985a(new C17813b(this));

    /* renamed from: o */
    public final C13601g f49074o = C36568h.m40985a(new C17812a(this));

    /* renamed from: p */
    public final C13601g f49075p = C36568h.m40985a(new C17821j(this));

    /* renamed from: q */
    public final C13601g f49076q = C36568h.m40985a(new C17820i(this));

    /* renamed from: r */
    public final C13601g f49077r = C36568h.m40985a(new C17815d(this));

    /* renamed from: s */
    public final C13601g f49078s = C36568h.m40985a(new C17817f(this));

    /* renamed from: t */
    public final C13601g f49079t = C36568h.m40985a(new C17816e(this));

    /* renamed from: u */
    public final C17819h f49080u = new C17819h(this);

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$a */
    public static final class C17812a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17812a(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49081d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f49081d.getIntent().getIntExtra("key_action", -1));
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$b */
    public static final class C17813b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17813b(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49082d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f49082d.getIntent().getStringExtra("key_biz_app_id");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$c */
    public static final class C17814c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17814c(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49083d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f49083d.getIntent().getStringExtra("key_biz_username");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$d */
    public static final class C17815d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17815d(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49084d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f49084d.getIntent().getStringExtra("key_extra_content");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$e */
    public static final class C17816e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17816e(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49085d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f49085d.getIntent().getStringExtra("key_extra_info");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$f */
    public static final class C17817f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17817f(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49086d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f49086d.getIntent().getBooleanExtra("key_need_result", false));
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$g */
    public static final class C17818g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17818g(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49087d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f49087d.getIntent().getIntExtra("key_scene", -1));
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$h */
    public static final class C17819h implements C22624a.C22625a {

        /* renamed from: a */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49088a;

        public C17819h(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            this.f49088a = subscribeMsgRequestProxyUI;
        }

        /* renamed from: a */
        public void mo21981a() {
            Log.m105924i("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo subscribeMsgRequest onDismissDialog");
            this.f49088a.getClass();
        }

        /* renamed from: b */
        public void mo21982b(boolean z, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(subscribeMsgRequestResult, "result");
            SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f49088a;
            int i = SubscribeMsgRequestProxyUI.f49065v;
            Log.m105925i("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo onGetSubscribeListSuccess bizUsername: %s, %d, showDialog: %b", subscribeMsgRequestProxyUI.mo21978K7(), Integer.valueOf(subscribeMsgRequestResult.f49004h.size()), Boolean.valueOf(z));
            C89779i0 i0Var = this.f49088a.f49068f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI2 = this.f49088a;
            subscribeMsgRequestProxyUI2.f49070h = C22624a.m26494b(subscribeMsgRequestProxyUI2.f49070h);
            if (this.f49088a.mo21977J7() == 1 || !z) {
                SubscribeMsgRequestProxyUI.m18199I7(this.f49088a, 0, "", false, (Bundle) null, 12, (Object) null);
            }
        }

        /* renamed from: c */
        public void mo21983c(SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(subscribeMsgRequestResult, "result");
            SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f49088a;
            int i = SubscribeMsgRequestProxyUI.f49065v;
            Log.m105925i("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo onSubscribeMsgSuccess bizUsername: %s, %d", subscribeMsgRequestProxyUI.mo21978K7(), Integer.valueOf(subscribeMsgRequestResult.f49004h.size()));
            SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI2 = this.f49088a;
            subscribeMsgRequestProxyUI2.f49070h = C22624a.m26494b(subscribeMsgRequestProxyUI2.f49070h);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("key_result_data", subscribeMsgRequestResult.f49004h);
            bundle.putString("key_result_ext_data", subscribeMsgRequestResult.f49018y);
            SubscribeMsgRequestProxyUI.m18199I7(this.f49088a, 0, "", false, bundle, 4, (Object) null);
        }

        /* renamed from: d */
        public void mo21984d() {
            C89779i0 i0Var = this.f49088a.f49068f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }

        /* renamed from: e */
        public void mo21985e(int i, int i2, String str) {
            C87412m.m108594g(str, "errMsg");
            SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f49088a;
            int i3 = SubscribeMsgRequestProxyUI.f49065v;
            Log.m105921e("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo subscribeMsgRequest onError bizUsername: %s, action: %d, errCode: %d, errMsg: %s", subscribeMsgRequestProxyUI.mo21978K7(), Integer.valueOf(i), Integer.valueOf(i2), str);
            C89779i0 i0Var = this.f49088a.f49068f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            SubscribeMsgRequestProxyUI.m18199I7(this.f49088a, i2, str, true, (Bundle) null, 8, (Object) null);
        }

        /* renamed from: f */
        public void mo21986f(C87370k0 k0Var, C87362k kVar) {
            Log.m105924i("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo subscribeMsgRequest onShowDialog");
            SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI = this.f49088a;
            subscribeMsgRequestProxyUI.f49066d = k0Var;
            subscribeMsgRequestProxyUI.f49067e = kVar;
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$i */
    public static final class C17820i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17820i(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49089d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f49089d.getIntent().getStringExtra("key_subscribe_url");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI$j */
    public static final class C17821j extends C87413o implements C32224a<ArrayList<String>> {

        /* renamed from: d */
        public final /* synthetic */ SubscribeMsgRequestProxyUI f49090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17821j(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI) {
            super(0);
            this.f49090d = subscribeMsgRequestProxyUI;
        }

        public Object invoke() {
            ArrayList<String> stringArrayListExtra = this.f49090d.getIntent().getStringArrayListExtra("key_template_id_list");
            C87412m.m108591d(stringArrayListExtra);
            return stringArrayListExtra;
        }
    }

    /* renamed from: I7 */
    public static void m18199I7(SubscribeMsgRequestProxyUI subscribeMsgRequestProxyUI, int i, String str, boolean z, Bundle bundle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        Log.m105927v("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo finishUIWithResult needResult: %b", Boolean.valueOf(((Boolean) ((C36570n) subscribeMsgRequestProxyUI.f49078s).getValue()).booleanValue()));
        if (((Boolean) ((C36570n) subscribeMsgRequestProxyUI.f49078s).getValue()).booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("key_result_err_code", i);
            intent.putExtra("key_result_err_msg", str);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            subscribeMsgRequestProxyUI.setResult(-1, intent);
            C89779i0 i0Var = subscribeMsgRequestProxyUI.f49068f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (z) {
                subscribeMsgRequestProxyUI.getContentView().postDelayed(new C23495y(subscribeMsgRequestProxyUI), 300);
            } else {
                super.finish();
            }
        } else {
            C89779i0 i0Var2 = subscribeMsgRequestProxyUI.f49068f;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            if (z) {
                subscribeMsgRequestProxyUI.getContentView().postDelayed(new C23495y(subscribeMsgRequestProxyUI), 300);
            } else {
                super.finish();
            }
        }
    }

    /* renamed from: J7 */
    public final int mo21977J7() {
        return ((Number) ((C36570n) this.f49074o).getValue()).intValue();
    }

    /* renamed from: K7 */
    public final String mo21978K7() {
        return (String) ((C36570n) this.f49072j).getValue();
    }

    /* renamed from: L7 */
    public final int mo21979L7() {
        return ((Number) ((C36570n) this.f49071i).getValue()).intValue();
    }

    /* renamed from: M7 */
    public final void mo21980M7(boolean z) {
        m18199I7(this, 10005, "user cancel", z, (Bundle) null, 8, (Object) null);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        boolean z = true;
        Log.m105927v("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo onBackPressed currentAction: %d", Integer.valueOf(this.f49070h));
        int i = this.f49070h;
        C22624a aVar = C22624a.f65076a;
        if (i == 3 || i == 1) {
            C89779i0 i0Var = this.f49068f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C22624a.f65076a.mo35749a(this.f49069g);
            mo21980M7(false);
            return;
        }
        if (i == 2) {
            C87362k kVar = this.f49067e;
            if (kVar == null || !kVar.mo121782e()) {
                z = false;
            }
            if (!z) {
                C22624a.f65076a.mo35749a(this.f49069g);
                mo21980M7(false);
                return;
            }
            return;
        }
        C22624a.f65076a.mo35749a(this.f49069g);
        mo21980M7(false);
    }

    public void onCreate(Bundle bundle) {
        C22624a.C22626b bVar;
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f49068f = C76879j.m92723Q(this, "", getResources().getString(C0966R.string.gap), false, false, (DialogInterface.OnCancelListener) null);
        boolean z = false;
        if (mo21979L7() == 1) {
            bVar = new C22624a.C22626b(new WeakReference(getContext()), mo21977J7(), mo21978K7(), (String) ((C36570n) this.f49073n).getValue(), (String) ((C36570n) this.f49076q).getValue(), (String) ((C36570n) this.f49077r).getValue(), (String) ((C36570n) this.f49079t).getValue(), this.f49080u);
        } else if (mo21979L7() == 2) {
            WeakReference weakReference = new WeakReference(getContext());
            int J7 = mo21977J7();
            String str = (String) ((C36570n) this.f49073n).getValue();
            Object value = ((C36570n) this.f49075p).getValue();
            C87412m.m108593f(value, "<get-templateIds>(...)");
            String str2 = (String) ((C36570n) this.f49079t).getValue();
            C17819h hVar = this.f49080u;
            C87412m.m108594g(str, "bizAppId");
            C87412m.m108594g(str2, "extInfo");
            bVar = new C22624a.C22626b(weakReference, J7, "", str, "", "", str2, hVar);
            bVar.f65087j.clear();
            bVar.f65087j.addAll((ArrayList) value);
            Log.m105927v("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo initSubscribeMsgRequestTask templateId size: %s", Integer.valueOf(bVar.f65087j.size()));
        } else {
            Log.m105924i("MicroMsg.SubscribeMsgRequestProxyUI", "alvinluo requestSubscribeMessage scene invalid: " + mo21979L7());
            bVar = null;
        }
        this.f49069g = bVar;
        if (bVar != null) {
            bVar.f65095r = mo21979L7();
            int J72 = mo21977J7();
            C22624a aVar = C22624a.f65076a;
            if (J72 == 3 || J72 == 1) {
                bVar.mo35752c();
            } else {
                if (mo21977J7() == 2) {
                    z = true;
                }
                if (z) {
                    bVar.mo35752c();
                }
            }
        }
        this.f49070h = mo21977J7();
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f49068f;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C22624a.C22626b bVar = this.f49069g;
        if (bVar != null) {
            Log.m105924i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo release");
            C77398g gVar = bVar.f65088k;
            if (gVar != null) {
                gVar.dismiss();
            }
            C23466p pVar = bVar.f65089l;
            if (pVar != null) {
                pVar.dismiss();
            }
        }
    }

    public void onResume() {
        super.onResume();
        getWindow().setStatusBarColor(getResources().getColor(C0966R.color.ahf));
        setNavigationbarColor(getResources().getColor(C0966R.color.f2928b));
    }
}
