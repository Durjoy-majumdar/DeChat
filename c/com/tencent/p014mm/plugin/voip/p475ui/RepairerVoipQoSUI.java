package com.tencent.p014mm.plugin.voip.p475ui;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.json.JSONUtils;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import org.json.JSONArray;
import qo3.C77390c0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/ui/RepairerVoipQoSUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI */
public final class RepairerVoipQoSUI extends MMSecDataActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f207464j = 0;

    /* renamed from: d */
    public final C13601g f207465d = C36568h.m40985a(new C71580a(this));

    /* renamed from: e */
    public final C13601g f207466e = C36568h.m40985a(new C71581b(this));

    /* renamed from: f */
    public final C13601g f207467f = C36568h.m40985a(C30536f.f82263d);

    /* renamed from: g */
    public final C13601g f207468g = C36568h.m40985a(new C71585g(this));

    /* renamed from: h */
    public final C13601g f207469h = C36568h.m40985a(new C71584e(this));

    /* renamed from: i */
    public final C13601g f207470i = C36568h.m40985a(new C71582c(this));

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$f */
    public static final class C30536f extends C87413o implements C32224a<ArrayList<C30540n>> {

        /* renamed from: d */
        public static final C30536f f82263d = new C30536f();

        public C30536f() {
            super(0);
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            try {
                JSONUtils.forEach(new JSONArray(C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_VOIP_QOS_CUSTOM_STRING, "")), new C30541s(arrayList));
            } catch (Exception unused) {
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$a */
    public static final class C71580a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipQoSUI f207471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71580a(RepairerVoipQoSUI repairerVoipQoSUI) {
            super(0);
            this.f207471d = repairerVoipQoSUI;
        }

        public Object invoke() {
            return this.f207471d.findViewById(C0966R.C0970id.al9);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$b */
    public static final class C71581b extends C87413o implements C32224a<C71587m> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipQoSUI f207472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71581b(RepairerVoipQoSUI repairerVoipQoSUI) {
            super(0);
            this.f207472d = repairerVoipQoSUI;
        }

        public Object invoke() {
            return new C71587m(this.f207472d, new C71600q(this.f207472d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$c */
    public static final class C71582c extends C87413o implements C32224a<C16665p> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipQoSUI f207473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71582c(RepairerVoipQoSUI repairerVoipQoSUI) {
            super(0);
            this.f207473d = repairerVoipQoSUI;
        }

        public Object invoke() {
            return new C16665p(new C71601r(this.f207473d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$d */
    public static final class C71583d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipQoSUI f207474d;

        public C71583d(RepairerVoipQoSUI repairerVoipQoSUI) {
            this.f207474d = repairerVoipQoSUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/RepairerVoipQoSUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C77390c0) ((C36570n) this.f207474d.f207466e).getValue()).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/RepairerVoipQoSUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$e */
    public static final class C71584e extends C87413o implements C32224a<WxRecyclerAdapter<C30540n>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipQoSUI f207475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71584e(RepairerVoipQoSUI repairerVoipQoSUI) {
            super(0);
            this.f207475d = repairerVoipQoSUI;
        }

        public Object invoke() {
            RepairerVoipQoSUI$paramsAdapter$2$1 repairerVoipQoSUI$paramsAdapter$2$1 = new RepairerVoipQoSUI$paramsAdapter$2$1(this.f207475d);
            RepairerVoipQoSUI repairerVoipQoSUI = this.f207475d;
            int i = RepairerVoipQoSUI.f207464j;
            return new WxRecyclerAdapter(repairerVoipQoSUI$paramsAdapter$2$1, repairerVoipQoSUI.mo98755H7(), false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.RepairerVoipQoSUI$g */
    public static final class C71585g extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerVoipQoSUI f207476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71585g(RepairerVoipQoSUI repairerVoipQoSUI) {
            super(0);
            this.f207476d = repairerVoipQoSUI;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f207476d.findViewById(C0966R.C0970id.mug);
        }
    }

    /* renamed from: H7 */
    public final ArrayList<C30540n> mo98755H7() {
        return (ArrayList) ((C36570n) this.f207467f).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cty;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
            }
        }
        if (!z && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_local_wechat_repair_entrance_flag_and, 0) == 0) {
            finish();
        }
        setMMTitle("配置自定义编码序列");
        Object value = ((C36570n) this.f207468g).getValue();
        C87412m.m108593f(value, "<get-paramsRecycler>(...)");
        ((WxRecyclerView) value).setLayoutManager(new LinearLayoutManager(this));
        Object value2 = ((C36570n) this.f207468g).getValue();
        C87412m.m108593f(value2, "<get-paramsRecycler>(...)");
        ((WxRecyclerView) value2).setAdapter((WxRecyclerAdapter) ((C36570n) this.f207469h).getValue());
        Object value3 = ((C36570n) this.f207468g).getValue();
        C87412m.m108593f(value3, "<get-paramsRecycler>(...)");
        ((C16665p) ((C36570n) this.f207470i).getValue()).mo17527j((WxRecyclerView) value3);
        Object value4 = ((C36570n) this.f207465d).getValue();
        C87412m.m108593f(value4, "<get-addBtn>(...)");
        ((View) value4).setOnClickListener(new C71583d(this));
    }

    public void onDestroy() {
        super.onDestroy();
        JSONArray jSONArray = new JSONArray();
        for (C30540n a : mo98755H7()) {
            jSONArray.put(Base64.encodeToString(a.mo57468a(), 0));
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "JSONArray().apply {\n    …   }\n        }.toString()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_QOS_CUSTOM_STRING, jSONArray2);
    }
}
