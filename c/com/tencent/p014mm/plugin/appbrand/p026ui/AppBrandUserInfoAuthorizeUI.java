package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.C82136a;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.C82139c;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.TouchableLayout;
import fy3.C32227p;
import gt0.C87330d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import qo3.C89779i0;
import rx3.C13598b0;
import uo3.C78253a;
import vr0.C78471a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI */
public final class AppBrandUserInfoAuthorizeUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f246541p = 0;

    /* renamed from: d */
    public final List<C87330d0.C87331a> f246542d = new ArrayList();

    /* renamed from: e */
    public List<C87330d0.C87331a> f246543e;

    /* renamed from: f */
    public boolean f246544f;

    /* renamed from: g */
    public boolean f246545g;

    /* renamed from: h */
    public int f246546h;

    /* renamed from: i */
    public MMSwitchBtn f246547i;

    /* renamed from: j */
    public C89779i0 f246548j;

    /* renamed from: n */
    public C82139c f246549n;

    /* renamed from: o */
    public RecyclerView f246550o;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$c */
    public static final class C40539c implements C82139c.C82141b {

        /* renamed from: a */
        public final /* synthetic */ AppBrandUserInfoAuthorizeUI f108902a;

        /* renamed from: b */
        public final /* synthetic */ String f108903b;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$c$a */
        public static final class C40540a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C32227p<Activity, String, C13598b0> f108904d;

            /* renamed from: e */
            public final /* synthetic */ AppBrandUserInfoAuthorizeUI f108905e;

            /* renamed from: f */
            public final /* synthetic */ String f108906f;

            public C40540a(C32227p<? super Activity, ? super String, C13598b0> pVar, AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI, String str) {
                this.f108904d = pVar;
                this.f108905e = appBrandUserInfoAuthorizeUI;
                this.f108906f = str;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6$updateAddNewAvatarEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C32227p<Activity, String, C13598b0> pVar = this.f108904d;
                AppCompatActivity context = this.f108905e.getContext();
                C87412m.m108593f(context, "context");
                pVar.invoke(context, this.f108906f);
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6$updateAddNewAvatarEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C40539c(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI, String str) {
            this.f108902a = appBrandUserInfoAuthorizeUI;
            this.f108903b = str;
        }

        /* renamed from: a */
        public void mo63390a(boolean z, boolean z2, String str, String str2, C32227p<? super Activity, ? super String, C13598b0> pVar) {
            C87412m.m108594g(str, "limitWording");
            C87412m.m108594g(str2, "avatarWording");
            C87412m.m108594g(pVar, "goAddUserPage");
            TextView textView = (TextView) this.f108902a.findViewById(C0966R.C0970id.l2b);
            View findViewById = this.f108902a.findViewById(C0966R.C0970id.bw5);
            if (!z && !z2) {
                textView.setVisibility(8);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (!z) {
                textView.setVisibility(0);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                textView.setVisibility(8);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI$onCreate$6", "updateAddNewAvatarEntry", "(ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            findViewById.setOnClickListener(new C40540a(pVar, this.f108902a, this.f108903b));
        }

        /* renamed from: b */
        public void mo63391b(List<C87330d0.C87331a> list) {
            C87412m.m108594g(list, "items");
            AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI = this.f108902a;
            if (appBrandUserInfoAuthorizeUI.f246543e == null) {
                appBrandUserInfoAuthorizeUI.f246543e = new ArrayList(list);
            }
            ((ArrayList) this.f108902a.f246542d).clear();
            ((ArrayList) this.f108902a.f246542d).addAll(list);
            RecyclerView recyclerView = this.f108902a.f246550o;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C87412m.m108603p("userInfoList");
            throw null;
        }

        /* renamed from: c */
        public void mo63392c(C82139c.C82141b.C40453a aVar) {
            C87412m.m108594g(aVar, "action");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$a */
    public static final class C84464a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandUserInfoAuthorizeUI f246551d;

        public C84464a(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
            this.f246551d = appBrandUserInfoAuthorizeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f246551d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$b */
    public static final class C84465b implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ AppBrandUserInfoAuthorizeUI f246552a;

        public C84465b(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
            this.f246552a = appBrandUserInfoAuthorizeUI;
        }

        public final void onStatusChange(boolean z) {
            AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI = this.f246552a;
            int i = AppBrandUserInfoAuthorizeUI.f246541p;
            appBrandUserInfoAuthorizeUI.getClass();
            C84569o3 o3Var = new C84569o3(appBrandUserInfoAuthorizeUI);
            C84573p3 p3Var = new C84573p3(appBrandUserInfoAuthorizeUI, z);
            if (z || appBrandUserInfoAuthorizeUI.f246545g) {
                p3Var.invoke();
                return;
            }
            appBrandUserInfoAuthorizeUI.f246545g = true;
            C78471a.C78472a aVar = C78471a.f229885a;
            AppCompatActivity context = appBrandUserInfoAuthorizeUI.getContext();
            C87412m.m108593f(context, "context");
            aVar.mo108406a(context, new C2011l3(p3Var), new C2013m3(o3Var), new C2015n3(o3Var));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$d */
    public static final class C84466d implements C82136a {

        /* renamed from: a */
        public final /* synthetic */ AppBrandUserInfoAuthorizeUI f246553a;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$d$a */
        public static final class C84467a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C84467a f246554d = new C84467a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        public C84466d(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
            this.f246553a = appBrandUserInfoAuthorizeUI;
        }

        /* renamed from: a */
        public void mo114579a(boolean z) {
            C89779i0 i0Var = this.f246553a.f246548j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }

        public void onStart() {
            AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI = this.f246553a;
            if (appBrandUserInfoAuthorizeUI.f246548j == null) {
                appBrandUserInfoAuthorizeUI.f246548j = C76879j.m92722P(appBrandUserInfoAuthorizeUI.getContext(), this.f246553a.getString(C0966R.string.a3h), 3, this.f246553a.getString(C0966R.string.a8m), true, false, C84467a.f246554d);
            }
            C89779i0 i0Var = this.f246553a.f246548j;
            if (i0Var != null) {
                i0Var.show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$e */
    public static final class C84468e implements C87330d0.C87333c {

        /* renamed from: a */
        public final /* synthetic */ AppBrandUserInfoAuthorizeUI f246555a;

        public C84468e(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
            this.f246555a = appBrandUserInfoAuthorizeUI;
        }

        /* renamed from: a */
        public void mo114556a(View view, C87330d0.C87331a aVar, int i) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(aVar, "item");
            C82139c cVar = this.f246555a.f246549n;
            if (cVar != null) {
                int i2 = TouchableLayout.f24959d;
                cVar.mo114583c(view, i, TouchableLayout.f24959d, TouchableLayout.f24960e);
                return;
            }
            C87412m.m108603p("wxaUserInfoListOperationController");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI$f */
    public static final class C84469f implements C87330d0.C87332b {

        /* renamed from: a */
        public final /* synthetic */ AppBrandUserInfoAuthorizeUI f246556a;

        public C84469f(AppBrandUserInfoAuthorizeUI appBrandUserInfoAuthorizeUI) {
            this.f246556a = appBrandUserInfoAuthorizeUI;
        }

        /* renamed from: a */
        public void mo114555a(C87330d0.C87331a aVar) {
            C87412m.m108594g(aVar, "item");
            C82139c cVar = this.f246556a.f246549n;
            if (cVar != null) {
                cVar.f240939f.set(aVar.f253109h);
                this.f246556a.f246546h = aVar.f253109h;
                return;
            }
            C87412m.m108603p("wxaUserInfoListOperationController");
            throw null;
        }
    }

    /* renamed from: H7 */
    public final void mo117149H7(boolean z) {
        View findViewById = findViewById(C0966R.C0970id.l26);
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI", "showUserInfoPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI", "showUserInfoPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void finish() {
        boolean z;
        Intent intent = new Intent();
        List<C87330d0.C87331a> list = this.f246543e;
        boolean z2 = true;
        if (list != null && list.size() == ((ArrayList) this.f246542d).size()) {
            Iterator it = ((ArrayList) this.f246542d).iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                C87330d0.C87331a aVar = (C87330d0.C87331a) it.next();
                List<C87330d0.C87331a> list2 = this.f246543e;
                if (list2 != null) {
                    z = false;
                    for (C87330d0.C87331a aVar2 : list2) {
                        if (aVar.f253109h == aVar2.f253109h) {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        intent.putExtra("key_result_user_info_list_been_modified", z2);
        intent.putExtra("key_result_is_open", this.f246544f);
        intent.putExtra("key_result_selected_user_id", this.f246546h);
        setResult(-1, intent);
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6478fx;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C82139c cVar = this.f246549n;
        if (cVar != null) {
            C78253a aVar = cVar.f240942i;
            if (aVar != null) {
                aVar.mo108266a();
                return;
            }
            return;
        }
        C87412m.m108603p("wxaUserInfoListOperationController");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setBackBtn(new C84464a(this));
        setMMTitle((int) C0966R.string.a8p);
        Bundle extras = getIntent().getExtras();
        MMUserAvatarInfo mMUserAvatarInfo = extras != null ? (MMUserAvatarInfo) extras.getParcelable("key_user_info") : null;
        Bundle extras2 = getIntent().getExtras();
        String string = extras2 != null ? extras2.getString("key_app_id") : null;
        Bundle extras3 = getIntent().getExtras();
        Boolean valueOf = extras3 != null ? Boolean.valueOf(extras3.getBoolean("key_is_state_open")) : null;
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        this.f246544f = booleanValue;
        mo117149H7(booleanValue);
        if (mMUserAvatarInfo == null || string == null) {
            Log.m105924i("AppBrandUserInfoAuthorizeUI", "WxaUserInfoData or appId is null, finish activity");
            finish();
            return;
        }
        this.f246546h = mMUserAvatarInfo.f240914g;
        View findViewById = findViewById(C0966R.C0970id.gl4);
        MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById;
        mMSwitchBtn.setCheck(this.f246544f);
        mMSwitchBtn.setSwitchListener(new C84465b(this));
        C87412m.m108593f(findViewById, "this.findViewById<MMSwit…)\n            }\n        }");
        this.f246547i = (MMSwitchBtn) findViewById;
        ((TextView) findViewById(C0966R.C0970id.j2a)).setText(TextUtils.isEmpty(mMUserAvatarInfo.f240920p) ? getString(C0966R.string.a8s) : mMUserAvatarInfo.f240920p);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l1n);
        if (TextUtils.isEmpty(mMUserAvatarInfo.f240919o)) {
            String string2 = getString(C0966R.string.a8u);
            C87412m.m108593f(string2, "getString(R.string.appbr…rize_user_info_list_desc)");
            Object[] objArr = new Object[1];
            Bundle extras4 = getIntent().getExtras();
            String string3 = extras4 != null ? extras4.getString("key_nickname") : null;
            if (string3 == null) {
                string3 = "";
            }
            objArr[0] = string3;
            str = String.format(string2, Arrays.copyOf(objArr, 1));
            C87412m.m108593f(str, "format(format, *args)");
        } else {
            str = mMUserAvatarInfo.f240919o;
        }
        textView.setText(str);
        ((TextView) findViewById(C0966R.C0970id.fpb)).setText(TextUtils.isEmpty(mMUserAvatarInfo.f240921q) ? getString(C0966R.string.a8r) : mMUserAvatarInfo.f240921q);
        View findViewById2 = findViewById(C0966R.C0970id.f359472l24);
        ((RecyclerView) findViewById2).setNestedScrollingEnabled(false);
        C87412m.m108593f(findViewById2, "this.findViewById<Recycl…Enabled = false\n        }");
        this.f246550o = (RecyclerView) findViewById2;
        C82139c cVar = new C82139c(this, mMUserAvatarInfo, "", new C40539c(this, string));
        this.f246549n = cVar;
        cVar.f240941h = new C84466d(this);
        C87330d0 d0Var = new C87330d0(this.f246542d);
        RecyclerView recyclerView = this.f246550o;
        if (recyclerView != null) {
            recyclerView.setAdapter(d0Var);
            RecyclerView recyclerView2 = this.f246550o;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                RecyclerView recyclerView3 = this.f246550o;
                if (recyclerView3 != null) {
                    recyclerView3.setItemAnimator((RecyclerView.C16616j) null);
                    d0Var.f253101f = new C84468e(this);
                    d0Var.f253100e = new C84469f(this);
                    return;
                }
                C87412m.m108603p("userInfoList");
                throw null;
            }
            C87412m.m108603p("userInfoList");
            throw null;
        }
        C87412m.m108603p("userInfoList");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f246548j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
