package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j53.C46421a;
import j53.C46422b;
import j53.C46423c;
import j53.C46424d;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;
import te3.uk4;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI */
public class WalletUniversalPayOrderUI extends WalletBaseUI {

    /* renamed from: s */
    public static final /* synthetic */ int f164713s = 0;

    /* renamed from: d */
    public DragSortListView f164714d;

    /* renamed from: e */
    public C57497c f164715e;

    /* renamed from: f */
    public ViewGroup f164716f;

    /* renamed from: g */
    public ViewGroup f164717g;

    /* renamed from: h */
    public TextView f164718h;

    /* renamed from: i */
    public TextView f164719i;

    /* renamed from: j */
    public TextView f164720j;

    /* renamed from: n */
    public MMSwitchBtn f164721n;

    /* renamed from: o */
    public TextView f164722o;

    /* renamed from: p */
    public TextView f164723p;

    /* renamed from: q */
    public Dialog f164724q;

    /* renamed from: r */
    public boolean f164725r = true;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI$a */
    public class C57495a implements DragSortListView.C85983j {
        public C57495a() {
        }

        /* renamed from: b */
        public void mo81248b(int i, int i2) {
            if (i == i2) {
                Log.m105919d("MicroMsg.WalletUniversalPayOrderUI", "no change: %s", Integer.valueOf(i));
                return;
            }
            WalletUniversalPayOrderUI walletUniversalPayOrderUI = WalletUniversalPayOrderUI.this;
            int i3 = WalletUniversalPayOrderUI.f164713s;
            walletUniversalPayOrderUI.getClass();
            Log.m105924i("MicroMsg.WalletUniversalPayOrderUI", "do update unipay order");
            walletUniversalPayOrderUI.f164724q = C76879j.m92723Q(walletUniversalPayOrderUI, walletUniversalPayOrderUI.getString(C0966R.string.f7961xj), walletUniversalPayOrderUI.getString(C0966R.string.l4f), false, false, new C57512p0(walletUniversalPayOrderUI));
            walletUniversalPayOrderUI.f164715e.mo81250a(i, i2);
            walletUniversalPayOrderUI.f164715e.notifyDataSetChanged();
            LinkedList linkedList = new LinkedList();
            List<uk4> list = walletUniversalPayOrderUI.f164715e.f164728e;
            if (list != null) {
                linkedList.addAll(list);
            }
            new C46424d(linkedList).mo9225i().mo123062e(new C57499g0(walletUniversalPayOrderUI, i2, i));
            C115669n.INSTANCE.mo160131h(16343, 10);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI$b */
    public class C57496b implements DragSortListView.C85984n {
        public C57496b(WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        }

        public void remove(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI$c */
    public static class C57497c extends BaseAdapter {

        /* renamed from: d */
        public Context f164727d;

        /* renamed from: e */
        public List<uk4> f164728e;

        public C57497c(Context context) {
            this.f164727d = context;
        }

        /* renamed from: a */
        public void mo81250a(int i, int i2) {
            Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "swipe: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
            this.f164728e.add(i2, this.f164728e.remove(i));
        }

        public int getCount() {
            List<uk4> list = this.f164728e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            List<uk4> list = this.f164728e;
            if (list == null) {
                return null;
            }
            return list.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(this.f164727d).inflate(C0966R.C0971layout.cej, viewGroup, false);
                view.setTag(new C57498d(view));
            }
            List<uk4> list = this.f164728e;
            uk4 uk4 = list == null ? null : list.get(i);
            C57498d dVar = (C57498d) view.getTag();
            dVar.f164730b.setImageBitmap((Bitmap) null);
            dVar.f164730b.mo100288c(uk4.f142917e, 0, 0, C0966R.C0969drawable.ayq);
            dVar.f164731c.setText(uk4.f142918f);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletUniversalPayOrderUI$d */
    public static class C57498d {

        /* renamed from: a */
        public View f164729a;

        /* renamed from: b */
        public CdnImageView f164730b;

        /* renamed from: c */
        public TextView f164731c;

        public C57498d(View view) {
            this.f164729a = view;
            this.f164730b = (CdnImageView) view.findViewById(C0966R.C0970id.lli);
            this.f164731c = (TextView) view.findViewById(C0966R.C0970id.llj);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.llh);
        }
    }

    /* renamed from: H7 */
    public static void m66255H7(WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        walletUniversalPayOrderUI.getClass();
        Log.m105924i("MicroMsg.WalletUniversalPayOrderUI", "do open unipay order");
        walletUniversalPayOrderUI.f164724q = C76879j.m92723Q(walletUniversalPayOrderUI, walletUniversalPayOrderUI.getString(C0966R.string.f7961xj), walletUniversalPayOrderUI.getString(C0966R.string.l4f), false, false, new C57508l0(walletUniversalPayOrderUI));
        new C46422b().mo9225i().mo123062e(new C57509m0(walletUniversalPayOrderUI));
    }

    /* renamed from: I7 */
    public static void m66256I7(WalletUniversalPayOrderUI walletUniversalPayOrderUI) {
        walletUniversalPayOrderUI.getClass();
        Log.m105924i("MicroMsg.WalletUniversalPayOrderUI", "do close unipay order");
        walletUniversalPayOrderUI.f164724q = C76879j.m92723Q(walletUniversalPayOrderUI, walletUniversalPayOrderUI.getString(C0966R.string.f7961xj), walletUniversalPayOrderUI.getString(C0966R.string.l4f), false, false, new C57510n0(walletUniversalPayOrderUI));
        new C46421a().mo9225i().mo123062e(new C57511o0(walletUniversalPayOrderUI));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cek;
    }

    public void initView() {
        this.f164714d = (DragSortListView) findViewById(C0966R.C0970id.llk);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0966R.C0971layout.cei, (ViewGroup) null, false);
        this.f164716f = viewGroup;
        this.f164718h = (TextView) viewGroup.findViewById(C0966R.C0970id.llg);
        this.f164719i = (TextView) this.f164716f.findViewById(C0966R.C0970id.llc);
        this.f164720j = (TextView) this.f164716f.findViewById(C0966R.C0970id.lle);
        this.f164721n = (MMSwitchBtn) this.f164716f.findViewById(C0966R.C0970id.lld);
        this.f164722o = (TextView) this.f164716f.findViewById(C0966R.C0970id.llf);
        this.f164714d.addHeaderView(this.f164716f, (Object) null, false);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this).inflate(C0966R.C0971layout.ceh, (ViewGroup) null, false);
        this.f164717g = viewGroup2;
        this.f164723p = (TextView) viewGroup2.findViewById(C0966R.C0970id.llb);
        this.f164714d.addFooterView(this.f164717g, (Object) null, false);
        C57497c cVar = new C57497c(this);
        this.f164715e = cVar;
        this.f164714d.setAdapter((ListAdapter) cVar);
        this.f164714d.setDropListener(new C57495a());
        this.f164714d.setRemoveListener(new C57496b(this));
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        initView();
        Log.m105924i("MicroMsg.WalletUniversalPayOrderUI", "do query uni pay order");
        this.f164724q = C76879j.m92723Q(this, getString(C0966R.string.f7961xj), getString(C0966R.string.l4f), false, false, new C57506j0(this));
        new C46423c().mo9225i().mo123062e(new C57507k0(this));
        C115669n.INSTANCE.mo160131h(16343, 1);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
