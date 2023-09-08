package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import ky2.C10432i;
import ky2.C10437m;
import ly2.C10671a;
import ly2.C10672b;
import my2.C11098e;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wd3.C15153w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI */
public final class AuthorizationRequestUI extends MMActivity {

    /* renamed from: d */
    public final C13601g f21404d = C36568h.m40985a(new C5549h(this));

    /* renamed from: e */
    public final C13601g f21405e = C36568h.m40985a(new C5540a(this));

    /* renamed from: f */
    public final C13601g f21406f = C36568h.m40985a(new C5542c(this));

    /* renamed from: g */
    public final C13601g f21407g = C36568h.m40985a(new C5541b(this));

    /* renamed from: h */
    public boolean f21408h;

    /* renamed from: i */
    public boolean f21409i;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$a */
    public static final class C5540a extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5540a(AuthorizationRequestUI authorizationRequestUI) {
            super(0);
            this.f21410d = authorizationRequestUI;
        }

        public Object invoke() {
            return (RelativeLayout) this.f21410d.findViewById(C0966R.C0970id.a15);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$b */
    public static final class C5541b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5541b(AuthorizationRequestUI authorizationRequestUI) {
            super(0);
            this.f21411d = authorizationRequestUI;
        }

        public Object invoke() {
            return (TextView) this.f21411d.findViewById(C0966R.C0970id.f358474fc2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$c */
    public static final class C5542c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5542c(AuthorizationRequestUI authorizationRequestUI) {
            super(0);
            this.f21412d = authorizationRequestUI;
        }

        public Object invoke() {
            return (LinearLayout) this.f21412d.findViewById(C0966R.C0970id.gto);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$d */
    public static final class C5543d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21413d;

        public C5543d(AuthorizationRequestUI authorizationRequestUI) {
            this.f21413d = authorizationRequestUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21413d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$e */
    public static final class C5544e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21414d;

        public C5544e(AuthorizationRequestUI authorizationRequestUI) {
            this.f21414d = authorizationRequestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C10432i) C86312j.m106911c(C10432i.class)).Wg0(this.f21414d, 101);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$f */
    public static final class C5545f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f21415d;

        /* renamed from: e */
        public final /* synthetic */ AuthorizationRequestUI f21416e;

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$f$a */
        public static final class C5546a implements C15153w0 {

            /* renamed from: a */
            public final /* synthetic */ AuthorizationRequestUI f21417a;

            /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$f$a$a */
            public static final class C5547a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ AuthorizationRequestUI f21418d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C5547a(AuthorizationRequestUI authorizationRequestUI) {
                    super(0);
                    this.f21418d = authorizationRequestUI;
                }

                public Object invoke() {
                    this.f21418d.finish();
                    return C13598b0.f38549a;
                }
            }

            public C5546a(AuthorizationRequestUI authorizationRequestUI) {
                this.f21417a = authorizationRequestUI;
            }

            /* renamed from: a */
            public final void mo5557a(boolean z) {
                if (z) {
                    C61926c.m72666K(200, new C5547a(this.f21417a));
                }
            }
        }

        public C5545f(RelativeLayout relativeLayout, AuthorizationRequestUI authorizationRequestUI) {
            this.f21415d = relativeLayout;
            this.f21416e = authorizationRequestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C10432i) C86312j.m106911c(C10432i.class)).Ql0(this.f21415d.getContext(), this.f21416e.getIntent().getIntExtra("intent_extra_type", 0), this.f21416e.getIntent().getStringExtra("intent_extra_key"), this.f21416e.getIntent().getStringExtra("intent_extra_title"), this.f21416e.getIntent().getStringExtra("intent_extra_digest"), this.f21416e.getIntent().getStringExtra("intent_extra_content"), (byte[]) null, new C5546a(this.f21416e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$g */
    public static final class C5548g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21419d;

        public C5548g(AuthorizationRequestUI authorizationRequestUI) {
            this.f21419d = authorizationRequestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f21419d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI$h */
    public static final class C5549h extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AuthorizationRequestUI f21420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5549h(AuthorizationRequestUI authorizationRequestUI) {
            super(0);
            this.f21420d = authorizationRequestUI;
        }

        public Object invoke() {
            return (RelativeLayout) this.f21420d.findViewById(C0966R.C0970id.l44);
        }
    }

    /* renamed from: H7 */
    public final void mo6577H7() {
        if (!this.f21408h) {
            this.f21408h = true;
            int intExtra = getIntent().getIntExtra("intent_extra_type", Integer.MAX_VALUE);
            String stringExtra = getIntent().getStringExtra("intent_extra_key");
            boolean z = ((C10432i) C86312j.m106911c(C10432i.class)).mo10738JD(intExtra, stringExtra) && this.f21409i;
            C13601g gVar = C10672b.f32092a;
            if (stringExtra != null) {
                String str = intExtra + '#' + stringExtra;
                C13601g gVar2 = C10672b.f32092a;
                C10432i.C10433a aVar = (C10432i.C10433a) ((Map) ((C36570n) gVar2).getValue()).get(str);
                if (aVar != null) {
                    Log.m105924i("MicroMsg.AuthorizationReqCallbackMgr", "callback bizType:" + intExtra + " bizKey:" + stringExtra + " canGoOn:" + z);
                    C61926c.m72657B("AuthorizationReqCallbackMgr", true, new C10671a(aVar, intExtra, stringExtra, z));
                    C10432i.C10433a aVar2 = (C10432i.C10433a) ((Map) ((C36570n) gVar2).getValue()).remove(str);
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8j;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls = C10432i.class;
        if (i == 101 && i2 == -1) {
            C10437m mVar = new C10437m();
            mVar.field_businessType = getIntent().getIntExtra("intent_extra_type", Integer.MAX_VALUE);
            mVar.field_businessKey = getIntent().getStringExtra("intent_extra_key");
            C72996z1 BD = ((C10432i) C86312j.m106911c(cls)).mo10736BD();
            mVar.field_guardianUserName = BD != null ? BD.getUsername() : null;
            mVar.field_wardUserName = C75592q0.m90789s();
            mVar.field_time = C31543z5.m39453c();
            C11098e.f32878a.mo11232a().replace(mVar);
            ((C10432i) C86312j.m106911c(cls)).I40();
            this.f21409i = true;
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C5543d(this));
        if (getIntent().getBooleanExtra("intent_extra_can_auth", true)) {
            ((LinearLayout) ((C36570n) this.f21406f).getValue()).setVisibility(0);
            ((TextView) ((C36570n) this.f21407g).getValue()).setVisibility(0);
        } else {
            ((LinearLayout) ((C36570n) this.f21406f).getValue()).setVisibility(8);
            ((TextView) ((C36570n) this.f21407g).getValue()).setVisibility(8);
        }
        ((RelativeLayout) ((C36570n) this.f21404d).getValue()).setOnClickListener(new C5544e(this));
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10736BD() != null) {
            RelativeLayout relativeLayout = (RelativeLayout) ((C36570n) this.f21405e).getValue();
            relativeLayout.setOnClickListener(new C5545f(relativeLayout, this));
            relativeLayout.setVisibility(0);
        }
        ((Button) findViewById(C0966R.C0970id.bec)).setOnClickListener(new C5548g(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.AuthorizationRequestUI", "onDestroy hadCallback:" + this.f21408h);
        mo6577H7();
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.AuthorizationRequestUI", "onStop isFinishing:" + isFinishing());
        if (isFinishing()) {
            mo6577H7();
        }
    }
}
