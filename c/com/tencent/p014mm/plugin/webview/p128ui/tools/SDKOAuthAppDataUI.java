package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.webview.model.C85518c1;
import com.tencent.p014mm.plugin.webview.model.C85522l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import ea3.C7608b;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import md2.C34549c;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pe3.C89349b;
import qo3.C89779i0;
import te3.C48834bb2;
import te3.C49154dj2;
import te3.C49228e34;
import te3.C50407mi2;
import te3.C52121yi2;
import te3.C90407dx3;
import te3.so4;
import te3.uo4;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI */
public class SDKOAuthAppDataUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public int f118345A;

    /* renamed from: B */
    public String f118346B;

    /* renamed from: C */
    public String f118347C;

    /* renamed from: d */
    public C85518c1 f118348d;

    /* renamed from: e */
    public C90407dx3 f118349e;

    /* renamed from: f */
    public C43803d f118350f;

    /* renamed from: g */
    public String f118351g;

    /* renamed from: h */
    public String f118352h;

    /* renamed from: i */
    public String f118353i;

    /* renamed from: j */
    public long f118354j;

    /* renamed from: n */
    public int f118355n;

    /* renamed from: o */
    public int f118356o = 2;

    /* renamed from: p */
    public C89779i0 f118357p;

    /* renamed from: q */
    public SendAuth.Options f118358q;

    /* renamed from: r */
    public C44392x f118359r;

    /* renamed from: s */
    public LinkedList<so4> f118360s;

    /* renamed from: t */
    public C89349b f118361t;

    /* renamed from: u */
    public uo4 f118362u;

    /* renamed from: v */
    public LinkedList<String> f118363v;

    /* renamed from: w */
    public boolean f118364w = false;

    /* renamed from: x */
    public String f118365x;

    /* renamed from: y */
    public String f118366y;

    /* renamed from: z */
    public int f118367z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI$a */
    public class C43800a implements View.OnClickListener {
        public C43800a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthAppDataUI sDKOAuthAppDataUI = SDKOAuthAppDataUI.this;
            bVar.mo8744a(sDKOAuthAppDataUI.f118351g, sDKOAuthAppDataUI.f118354j, 0, sDKOAuthAppDataUI.f118356o, 5, 1, 0);
            SDKOAuthAppDataUI sDKOAuthAppDataUI2 = SDKOAuthAppDataUI.this;
            sDKOAuthAppDataUI2.f118348d.mo118910c(-2, sDKOAuthAppDataUI2.f118358q, sDKOAuthAppDataUI2.f118365x, sDKOAuthAppDataUI2.f118367z, sDKOAuthAppDataUI2.f118364w);
            SDKOAuthAppDataUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI$b */
    public class C43801b implements View.OnClickListener {
        public C43801b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthAppDataUI sDKOAuthAppDataUI = SDKOAuthAppDataUI.this;
            bVar.mo8744a(sDKOAuthAppDataUI.f118351g, sDKOAuthAppDataUI.f118354j, 1, sDKOAuthAppDataUI.f118356o, 5, 1, 0);
            SDKOAuthAppDataUI.m47778H7(SDKOAuthAppDataUI.this, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI$c */
    public class C43802c implements View.OnClickListener {
        public C43802c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7608b bVar = C7608b.INSTANCE;
            SDKOAuthAppDataUI sDKOAuthAppDataUI = SDKOAuthAppDataUI.this;
            bVar.mo8744a(sDKOAuthAppDataUI.f118351g, sDKOAuthAppDataUI.f118354j, 0, sDKOAuthAppDataUI.f118356o, 5, 1, 0);
            SDKOAuthAppDataUI.m47778H7(SDKOAuthAppDataUI.this, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI$d */
    public class C43803d extends RecyclerView.C16613e<C43805e> {

        /* renamed from: d */
        public LinkedList<C50407mi2> f118371d;

        /* renamed from: e */
        public LinkedList<C50407mi2> f118372e;

        /* renamed from: f */
        public Context f118373f;

        /* renamed from: g */
        public C49228e34 f118374g;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI$d$a */
        public class C43804a implements C0120a0<Integer> {
            public C43804a(SDKOAuthAppDataUI sDKOAuthAppDataUI) {
            }

            public void onChanged(Object obj) {
                C43803d dVar = C43803d.this;
                C50407mi2 mi22 = dVar.f118371d.get(SDKOAuthAppDataUI.this.f118359r.f120332i);
                C43803d dVar2 = C43803d.this;
                so4 so4 = dVar2.f118374g.f132666d.get(SDKOAuthAppDataUI.this.f118359r.f120332i);
                so4.f141658d = mi22.f138046d;
                so4.f141659e = mi22.f138050h.get(((Integer) obj).intValue()).f132366d;
                C43803d.this.f118372e = new LinkedList<>();
                Iterator<C50407mi2> it = C43803d.this.f118371d.iterator();
                while (it.hasNext()) {
                    C50407mi2 next = it.next();
                    C43803d dVar3 = C43803d.this;
                    dVar3.getClass();
                    LinkedList<C52121yi2> linkedList = next.f138049g;
                    Iterator<so4> it4 = dVar3.f118374g.f132666d.iterator();
                    boolean z = false;
                    int i = 0;
                    while (it4.hasNext()) {
                        so4 next2 = it4.next();
                        Iterator<C52121yi2> it5 = linkedList.iterator();
                        while (it5.hasNext()) {
                            C52121yi2 next3 = it5.next();
                            if (next2.f141658d == next3.f145311d && next2.f141659e == next3.f145312e) {
                                i++;
                            }
                        }
                    }
                    if (i == linkedList.size() && i > 0) {
                        z = true;
                    }
                    if (!z) {
                        C43803d.this.f118372e.add(next);
                    }
                }
                C43803d.this.notifyDataSetChanged();
                SDKOAuthAppDataUI.this.mo68183I7();
            }
        }

        public C43803d(Context context, LinkedList<C50407mi2> linkedList, C90407dx3 dx32) {
            LayoutInflater.from(context);
            this.f118371d = linkedList;
            this.f118372e = linkedList;
            this.f118373f = context;
            C49228e34 e342 = new C49228e34();
            this.f118374g = e342;
            e342.f132667e = SDKOAuthAppDataUI.this.f118361t;
            LinkedList<so4> linkedList2 = SDKOAuthAppDataUI.this.f118360s;
            e342.f132666d = linkedList2;
            SDKOAuthAppDataUI.this.f118359r = new C44392x(this.f118373f, SDKOAuthAppDataUI.this.f118362u.f142990e.f142315d, linkedList2);
            View inflate = View.inflate(this.f118373f, C0966R.C0971layout.buy, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.j4h);
            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            textView.getPaint().setStrokeWidth(0.8f);
            C44392x xVar = SDKOAuthAppDataUI.this.f118359r;
            xVar.f120324a.mo140673s(inflate);
            xVar.f120328e = inflate;
            SDKOAuthAppDataUI.this.f118359r.f120331h.observe((MMActivity) this.f118373f, new C43804a(SDKOAuthAppDataUI.this));
        }

        public int getItemCount() {
            return this.f118372e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C43805e eVar = (C43805e) zVar;
            C50407mi2 mi22 = this.f118372e.get(i);
            eVar.f118377A.setText(mi22.f138047e);
            if (!Util.isNullOrNil(mi22.f138048f)) {
                eVar.f118379C.setText(mi22.f138048f);
            } else {
                eVar.f118379C.setVisibility(8);
            }
            eVar.f118380z.setOnClickListener(new C44401z(this, i));
            for (int i2 = 0; i2 < this.f118372e.get(i).f138050h.size(); i2++) {
                int i3 = this.f118374g.f132666d.get(i).f141659e;
                C49154dj2 dj22 = this.f118372e.get(i).f138050h.get(i2);
                if (dj22.f132366d == i3) {
                    eVar.f118378B.setText(dj22.f132367e);
                    return;
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            SDKOAuthAppDataUI sDKOAuthAppDataUI = SDKOAuthAppDataUI.this;
            return new C43805e(sDKOAuthAppDataUI, C85868k2.m106137b(sDKOAuthAppDataUI.getContext()).inflate(C0966R.C0971layout.f359961bv1, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI$e */
    public class C43805e extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f118377A;

        /* renamed from: B */
        public TextView f118378B;

        /* renamed from: C */
        public TextView f118379C;

        /* renamed from: z */
        public View f118380z;

        public C43805e(SDKOAuthAppDataUI sDKOAuthAppDataUI, View view) {
            super(view);
            this.f118380z = view;
            this.f118377A = (TextView) view.findViewById(C0966R.C0970id.j2d);
            this.f118378B = (TextView) view.findViewById(C0966R.C0970id.j2e);
            this.f118379C = (TextView) view.findViewById(C0966R.C0970id.j2c);
        }
    }

    /* renamed from: H7 */
    public static void m47778H7(SDKOAuthAppDataUI sDKOAuthAppDataUI, boolean z) {
        SDKOAuthAppDataUI sDKOAuthAppDataUI2 = sDKOAuthAppDataUI;
        sDKOAuthAppDataUI.getClass();
        Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "accept go  MPGdprPolicyUtil.checkPolicy");
        if (z) {
            sDKOAuthAppDataUI2.f118350f.f118374g.f132668f = 1;
        } else {
            sDKOAuthAppDataUI2.f118350f.f118374g.f132668f = 2;
        }
        boolean z2 = sDKOAuthAppDataUI2.f118349e.f259476o;
        try {
            C89349b bVar = new C89349b(sDKOAuthAppDataUI2.f118350f.f118374g.toByteArray());
            C89779i0 i0Var = sDKOAuthAppDataUI2.f118357p;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            sDKOAuthAppDataUI2.f118357p = C76879j.m92723Q(sDKOAuthAppDataUI, (String) null, sDKOAuthAppDataUI2.getString(C0966R.string.a4d), true, true, new C44398y(sDKOAuthAppDataUI2));
            Log.m105925i("MicroMsg.SDKOAuthAppDataUI", "auth result: %s", C85518c1.m105532l(1, sDKOAuthAppDataUI2.f118363v, sDKOAuthAppDataUI2.f118355n, bVar, Boolean.valueOf(z2)));
            C89349b bVar2 = bVar;
            sDKOAuthAppDataUI2.f118348d.mo118915i(1, sDKOAuthAppDataUI2.f118363v, sDKOAuthAppDataUI2.f118355n, sDKOAuthAppDataUI2.f118365x, sDKOAuthAppDataUI2.f118367z, bVar2, Boolean.valueOf(z2), sDKOAuthAppDataUI2.f118364w);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SDKOAuthAppDataUI", "ByteString create failed");
        }
    }

    /* renamed from: I7 */
    public final void mo68183I7() {
        MMNeat7extView mMNeat7extView = (MMNeat7extView) findViewById(C0966R.C0970id.a09);
        mMNeat7extView.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107081qu(getContext(), this.f118362u.f142991f.f143606d, (int) mMNeat7extView.getTextSize()));
        mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(mMNeat7extView.getContext())));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bv5;
    }

    public final void init() {
        Intent intent = getIntent();
        this.f118363v = new LinkedList<>(intent.getStringArrayListExtra("has_selected_scope"));
        this.f118351g = intent.getStringExtra("0");
        this.f118352h = intent.getStringExtra("1");
        try {
            this.f118349e = (C90407dx3) new C90407dx3().parseFrom(intent.getByteArrayExtra("2"));
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SDKOAuthAppDataUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f118353i = intent.getStringExtra(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        this.f118348d = new C85518c1(this, this.f118351g, this.f118352h, this.f118353i, intent.getStringExtra("7"));
        this.f118355n = intent.getIntExtra("3", -1);
        this.f118364w = intent.getBooleanExtra("auth_isoption1", false);
        this.f118365x = intent.getStringExtra("key_open_sdk_token");
        this.f118366y = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f118367z = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f118345A = intent.getIntExtra("key_open_sdk_version", 0);
        Log.m105925i("MicroMsg.SDKOAuthAppDataUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f118366y, Integer.valueOf(this.f118367z), Integer.valueOf(this.f118345A));
        C90407dx3 dx32 = this.f118349e;
        this.f118346B = dx32.f259470f;
        this.f118347C = dx32.f259469e;
        Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            SendAuth.Options options = new SendAuth.Options();
            this.f118358q = options;
            options.fromBundle(bundleExtra);
            Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "options.callbackClassName: " + this.f118358q.callbackClassName + "  options.callbackFlags: " + this.f118358q.callbackFlags);
        } else {
            Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "SendAuth.options, bundle is null");
        }
        C89349b bVar = this.f118349e.f259465A;
        if (bVar != null && bVar.f257327a.length > 0) {
            C48834bb2 bb22 = new C48834bb2();
            try {
                bb22.parseFrom(bVar.mo123703f());
                this.f118360s = bb22.f131036d;
                this.f118361t = bb22.f131037e;
                this.f118362u = bb22.f131038f;
            } catch (IOException unused2) {
                Log.m105920e("MicroMsg.SDKOAuthAppDataUI", "GetUserGrantInfoBuffer parseFrom byteArray failed");
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        ((TextView) findViewById(C0966R.C0970id.fmi)).setOnClickListener(new C43800a());
        TextView textView = (TextView) findViewById(C0966R.C0970id.hb_);
        textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(0.8f);
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59359o = C0966R.raw.native_oauth_default_head_img;
        bVar2.f59365u = getResources().getDimension(C0966R.dimen.f357059am2);
        bVar2.f59364t = true;
        bVar2.f59346b = true;
        bVar2.f59351g = C34549c.m40385a();
        C20828a.m22825b().mo32519h(this.f118362u.f142989d.f144178d, (ImageView) findViewById(C0966R.C0970id.hb6), bVar2.mo32666a());
        textView.setText(this.f118362u.f142989d.f144179e);
        ((TextView) findViewById(C0966R.C0970id.hba)).setText(this.f118362u.f142989d.f144180f);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.a08);
        textView2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        textView2.getPaint().setStrokeWidth(0.8f);
        textView2.setText(this.f118362u.f142989d.f144181g);
        this.f118350f = new C43803d(getContext(), this.f118362u.f142990e.f142315d, this.f118349e);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.a0e);
        recyclerView.setAdapter(this.f118350f);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.mo16974W(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        mo68183I7();
        this.f118354j = System.currentTimeMillis();
        ((Button) findViewById(C0966R.C0970id.g5p)).setOnClickListener(new C43801b());
        ((Button) findViewById(C0966R.C0970id.g5t)).setOnClickListener(new C43802c());
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "onCreate");
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1346, this);
        C86709a0.m107524d().mo123455a(1137, this);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f118357p;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107524d().mo123470p(1346, this);
        C86709a0.m107524d().mo123470p(1137, this);
        Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "onDestroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C7608b.INSTANCE.mo8744a(this.f118351g, this.f118354j, 0, this.f118356o, 5, 1, 0);
        this.f118348d.mo118910c(-2, this.f118358q, this.f118365x, this.f118367z, this.f118364w);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "onPause");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SDKOAuthAppDataUI", "onResume");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(i == 0 && i2 == 0)) {
            C7608b.INSTANCE.mo8744a(this.f118351g, this.f118354j, 2, this.f118356o, 5, 1, i2);
        }
        C89779i0 i0Var = this.f118357p;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (yVar instanceof C85522l0) {
            this.f118348d.mo118919r(this, this.f118365x, this.f118345A, this.f118366y, this.f118367z, this.f118346B, this.f118347C, i, i2, str, yVar, this.f118358q, this.f118364w);
        }
    }
}
