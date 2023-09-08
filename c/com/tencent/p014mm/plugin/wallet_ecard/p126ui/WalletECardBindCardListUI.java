package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import di3.C86312j;
import ie3.C76324c;
import j63.C46448h;
import j63.C76397d;
import java.util.ArrayList;
import java.util.List;
import k63.C76500a;
import nj3.C76879j;
import ob0.C117747y;
import p1162x2.C112019a;
import te3.C50277lk3;
import te3.C77990r9;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI */
public class WalletECardBindCardListUI extends WalletECardBaseUI {

    /* renamed from: o */
    public static final /* synthetic */ int f210939o = 0;

    /* renamed from: d */
    public ListView f210940d;

    /* renamed from: e */
    public TextView f210941e;

    /* renamed from: f */
    public List<C77990r9> f210942f = new ArrayList();

    /* renamed from: g */
    public C72523e f210943g;

    /* renamed from: h */
    public int f210944h;

    /* renamed from: i */
    public boolean f210945i = true;

    /* renamed from: j */
    public C79148e.C79149a f210946j = new C72520b();

    /* renamed from: n */
    public IListener<KindaBindCardEvent> f210947n = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Log.m105924i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent bindCard Succ");
                    C77990r9 r9Var = new C77990r9();
                    KindaBindCardEvent.C67721a aVar2 = kindaBindCardEvent.f193698d;
                    r9Var.f228155e = aVar2.f193703e;
                    String str = aVar2.f193701c;
                    r9Var.f228159i = str;
                    r9Var.f228157g = aVar2.f193704f;
                    if (!Util.isNullOrNil(str) && !Util.isNullOrNil(r9Var.f228155e) && !Util.isNullOrNil(r9Var.f228157g)) {
                        WalletECardBindCardListUI.this.getNetController().mo91271d(r9Var);
                    }
                    WalletECardBindCardListUI walletECardBindCardListUI = WalletECardBindCardListUI.this;
                    int i = WalletECardBindCardListUI.f210939o;
                    walletECardBindCardListUI.mo99918I7();
                } else {
                    Log.m105924i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent bindCard Cancel");
                }
                WalletECardBindCardListUI.this.f210945i = false;
            }
            WalletECardBindCardListUI.this.f210947n.dead();
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$a */
    public class C72519a implements AdapterView.OnItemClickListener {
        public C72519a() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                r9 = 1
                java.lang.Object[] r11 = new java.lang.Object[r9]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
                r0 = 0
                r11[r0] = r12
                java.lang.String r12 = "MicroMsg.WalletECardBindCardListUI"
                java.lang.String r1 = "position: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r11)
                android.widget.Adapter r11 = r8.getAdapter()
                int r11 = r11.getItemViewType(r10)
                com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI r1 = com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardBindCardListUI.this
                com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$e r1 = r1.f210943g
                java.util.Objects.requireNonNull(r1)
                java.lang.String r1 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r4 = "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardBindCardListUI$1"
                if (r11 != r9) goto L_0x006d
                java.lang.Object[] r8 = new java.lang.Object[r9]
                com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI r9 = com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardBindCardListUI.this
                int r9 = r9.f210944h
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8[r0] = r9
                java.lang.String r9 = "click add item: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r9, r8)
                com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI r8 = com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardBindCardListUI.this
                r8.mo99917H7()
                goto L_0x008f
            L_0x006d:
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                te3.r9 r8 = (te3.C77990r9) r8
                if (r8 != 0) goto L_0x0082
                java.lang.String r8 = "empty item"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r8)
                j20.C117292a.m165361g(r7, r4, r3, r2, r1)
                return
            L_0x0082:
                com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI r10 = com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardBindCardListUI.this
                cr3.g r10 = r10.getNetController()
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r0] = r8
                r10.mo91271d(r9)
            L_0x008f:
                j20.C117292a.m165361g(r7, r4, r3, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardBindCardListUI.C72519a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$b */
    public class C72520b implements C79148e.C79149a {
        public C72520b() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105925i("MicroMsg.WalletECardBindCardListUI", "bind card end, resultCode: %s, feedbackData: %s", Integer.valueOf(i), bundle);
            if (i == -1) {
                BindCardOrder bindCardOrder = (BindCardOrder) bundle.getParcelable("key_bindcard_value_result");
                if (bindCardOrder != null) {
                    C77990r9 r9Var = new C77990r9();
                    r9Var.f228155e = bundle.getString("key_bind_card_type");
                    r9Var.f228159i = bindCardOrder.f209475n;
                    r9Var.f228157g = bundle.getString("key_mobile");
                    if (!Util.isNullOrNil(r9Var.f228159i) && !Util.isNullOrNil(r9Var.f228155e) && !Util.isNullOrNil(r9Var.f228157g)) {
                        WalletECardBindCardListUI.this.getNetController().mo91271d(r9Var);
                        return null;
                    }
                }
                WalletECardBindCardListUI walletECardBindCardListUI = WalletECardBindCardListUI.this;
                int i2 = WalletECardBindCardListUI.f210939o;
                walletECardBindCardListUI.mo99918I7();
            }
            WalletECardBindCardListUI.this.f210945i = false;
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$c */
    public class C72521c {

        /* renamed from: a */
        public TextView f210951a;

        public C72521c(WalletECardBindCardListUI walletECardBindCardListUI, View view) {
            this.f210951a = (TextView) view.findViewById(C0966R.C0970id.cal);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.cak);
            Drawable g = C112019a.m152749g(imageView.getDrawable());
            g.setTintList(ColorStateList.valueOf(MMApplicationContext.getResources().getColor(C0966R.color.a1d)));
            imageView.setImageDrawable(g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$d */
    public interface C72522d {
        /* renamed from: a */
        void mo99920a(View view, C77990r9 r9Var);
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$e */
    public class C72523e extends BaseAdapter {
        public C72523e(C72519a aVar) {
        }

        public int getCount() {
            return ((ArrayList) WalletECardBindCardListUI.this.f210942f).size() + 1;
        }

        public Object getItem(int i) {
            if (i < ((ArrayList) WalletECardBindCardListUI.this.f210942f).size()) {
                return ((ArrayList) WalletECardBindCardListUI.this.f210942f).get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return i >= ((ArrayList) WalletECardBindCardListUI.this.f210942f).size() ? 1 : 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (getItemViewType(i) == 1) {
                if (view == null) {
                    view = LayoutInflater.from(WalletECardBindCardListUI.this.getContext()).inflate(C0966R.C0971layout.f359642a03, viewGroup, false);
                    view.setTag(new C72521c(WalletECardBindCardListUI.this, view));
                }
                ((C72521c) view.getTag()).f210951a.setText(C0966R.string.c2o);
            } else {
                if (view == null) {
                    view = LayoutInflater.from(WalletECardBindCardListUI.this.getContext()).inflate(C0966R.C0971layout.f359641a02, viewGroup, false);
                    view.setTag(new C72524f(view));
                }
                ((C72522d) view.getTag()).mo99920a(view, (C77990r9) getItem(i));
            }
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }

        public boolean isEnabled(int i) {
            C77990r9 r9Var = (C77990r9) getItem(i);
            return r9Var != null ? !r9Var.f228161n : super.isEnabled(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI$f */
    public class C72524f implements C72522d {

        /* renamed from: a */
        public CdnImageView f210953a;

        /* renamed from: b */
        public TextView f210954b;

        /* renamed from: c */
        public TextView f210955c;

        public C72524f(View view) {
            this.f210953a = (CdnImageView) view.findViewById(C0966R.C0970id.a7v);
            this.f210954b = (TextView) view.findViewById(C0966R.C0970id.a7y);
            this.f210955c = (TextView) view.findViewById(C0966R.C0970id.a7x);
        }

        /* renamed from: a */
        public void mo99920a(View view, C77990r9 r9Var) {
            if (r9Var != null) {
                this.f210953a.setRoundCorner(true);
                this.f210953a.setUrl(r9Var.f228160j);
                this.f210954b.setText(String.format("%s %s(%s)", new Object[]{r9Var.f228154d, r9Var.f228156f, r9Var.f228158h}));
                if (!Util.isNullOrNil(r9Var.f228162o)) {
                    this.f210955c.setText(String.format("%s，%s", new Object[]{r9Var.f228157g, r9Var.f228162o}));
                } else {
                    this.f210955c.setText(String.format("%s", new Object[]{r9Var.f228157g}));
                }
                if (r9Var.f228161n) {
                    Log.m105925i("MicroMsg.WalletECardBindCardListUI", "disable card: %s", r9Var.f228154d);
                    view.setEnabled(false);
                    this.f210954b.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(C0966R.color.a18));
                    this.f210955c.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(C0966R.color.a18));
                    return;
                }
                view.setEnabled(true);
                this.f210954b.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(C0966R.color.a7f));
                this.f210955c.setTextColor(WalletECardBindCardListUI.this.getResources().getColor(C0966R.color.a7b));
            }
        }
    }

    /* renamed from: H7 */
    public void mo99917H7() {
        Bundle bundle = new Bundle();
        if (this.f210944h == 3) {
            bundle.putInt("key_bind_scene", 18);
        } else {
            bundle.putInt("key_bind_scene", 19);
        }
        boolean z = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putString("key_pwd1", getInput().getString("key_pwd1"));
        Log.m105925i("MicroMsg.WalletECardBindCardListUI", "start bind card, scene: %s", Integer.valueOf(this.f210944h));
        if (C79144b.m95773a().mo109087b()) {
            this.f210947n.alive();
            Log.m105918d("MicroMsg.WalletECardBindCardListUI", "startKindaBindCard:true");
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(this, bundle);
        } else {
            Log.m105918d("MicroMsg.WalletECardBindCardListUI", "startKindaBindCard:false");
            z = false;
        }
        if (!z) {
            C79143a.m95771j(this, C76500a.class, bundle, this.f210946j);
        }
    }

    /* renamed from: I7 */
    public final void mo99918I7() {
        Log.m105924i("MicroMsg.WalletECardBindCardListUI", "load Data");
        doSceneForceProgress(new C46448h("WEB_DEBIT", this.f210944h));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359639a00;
    }

    public void initView() {
        this.f210940d = (ListView) findViewById(C0966R.C0970id.a7w);
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.f359640a01, this.f210940d, false);
        this.f210941e = (TextView) inflate.findViewById(C0966R.C0970id.cam);
        this.f210940d.addHeaderView(inflate, (Object) null, false);
        C72523e eVar = new C72523e((C72519a) null);
        this.f210943g = eVar;
        this.f210940d.setAdapter(eVar);
        this.f210940d.setOnItemClickListener(new C72519a());
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        this.mNetSceneMgr.mo105624c(1988);
        int i = getInput().getInt("key_open_scene", 2);
        this.f210944h = i;
        Log.m105925i("MicroMsg.WalletECardBindCardListUI", "openScene: %d", Integer.valueOf(i));
        setMMTitle("");
        initView();
        this.f210945i = true;
        mo99918I7();
    }

    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.mo105630i(1988);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C46448h)) {
            return false;
        }
        C46448h hVar = (C46448h) yVar;
        if (i == 0 && i2 == 0) {
            if (!Util.isNullOrNil(hVar.f125126f.f137494f)) {
                this.f210941e.setText(hVar.f125126f.f137494f);
            }
            C50277lk3 lk32 = hVar.f125126f;
            if (lk32.f137492d == 0) {
                Log.m105925i("MicroMsg.WalletECardBindCardListUI", "banklist: %s", Integer.valueOf(lk32.f137495g.size()));
                Log.m105919d("MicroMsg.WalletECardBindCardListUI", "true name: %s", hVar.f125126f.f137497i);
                getInput().putString("key_true_name", hVar.f125126f.f137497i);
                if (hVar.f125126f.f137495g.size() == 0) {
                    Log.m105925i("MicroMsg.WalletECardBindCardListUI", "no bind card, isGotoBindCardAfterNoBindCard: %s", Boolean.valueOf(this.f210945i));
                    if (this.f210945i) {
                        mo99917H7();
                    }
                } else {
                    ((ArrayList) this.f210942f).clear();
                    ((ArrayList) this.f210942f).addAll(hVar.f125126f.f137495g);
                    this.f210943g.notifyDataSetChanged();
                }
            } else if (!C76397d.m91817c(this, lk32.f137496h)) {
                C76879j.m92712F(getContext(), C76397d.m91815a(getContext(), hVar.f125126f.f137493e, str), "", false);
            }
        } else {
            Log.m105929w("MicroMsg.WalletECardBindCardListUI", "net error: %s", hVar);
            C76879j.m92712F(getContext(), C76397d.m91815a(getContext(), str), "", false);
        }
        return true;
    }
}
