package com.tencent.p014mm.plugin.account.security.p023ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.plugin.account.security.p023ui.SafeDeviceListPreference;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.tav.player.PlayerThread;
import di3.C86312j;
import f40.C86709a0;
import ft3.C8206g;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import nj3.C76879j;
import o31.C11345b;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87203t;
import p214om.C11502f;
import p629ny.C76979h;
import pj3.C47511g;
import rg0.C12998c;
import rg0.C12999d;
import rg0.C13000e;
import rg0.C13003h;
import ug0.C14185e;
import ug0.d$$a;

/* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI */
public class MySafeDeviceListUI extends MMPreference implements MStorage.IOnStorageChange, C11385n {

    /* renamed from: u */
    public static final /* synthetic */ int f10593u = 0;

    /* renamed from: d */
    public C47511g f10594d;

    /* renamed from: e */
    public int f10595e = -2;

    /* renamed from: f */
    public List<SafeDeviceListPreference> f10596f;

    /* renamed from: g */
    public C1393h f10597g;

    /* renamed from: h */
    public List<C13000e> f10598h;

    /* renamed from: i */
    public final List<C13000e> f10599i = new ArrayList();

    /* renamed from: j */
    public final List<C13000e> f10600j = new ArrayList();

    /* renamed from: n */
    public ProgressDialog f10601n = null;

    /* renamed from: o */
    public int f10602o = 0;

    /* renamed from: p */
    public int f10603p = 0;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f10604q = new C1386a();

    /* renamed from: r */
    public MMHandler f10605r = new C1387b();

    /* renamed from: s */
    public final MMHandler f10606s = new MMHandler(Looper.getMainLooper());

    /* renamed from: t */
    public final Runnable f10607t = new C1391f();

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$a */
    public class C1386a implements MenuItem.OnMenuItemClickListener {
        public C1386a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MySafeDeviceListUI mySafeDeviceListUI = MySafeDeviceListUI.this;
            List<SafeDeviceListPreference> list = mySafeDeviceListUI.f10596f;
            if (list != null && ((LinkedList) list).size() > 0) {
                mySafeDeviceListUI.f10595e = ~mySafeDeviceListUI.f10595e;
                for (SafeDeviceListPreference next : mySafeDeviceListUI.f10596f) {
                    next.f10617L = mySafeDeviceListUI.f10595e;
                    next.mo1362I();
                }
                mySafeDeviceListUI.f10594d.notifyDataSetChanged();
            }
            if (mySafeDeviceListUI.f10595e == 1) {
                mySafeDeviceListUI.addTextOptionMenu(0, mySafeDeviceListUI.getString(C0966R.string.f8014z_), mySafeDeviceListUI.f10604q);
            } else {
                mySafeDeviceListUI.addTextOptionMenu(0, mySafeDeviceListUI.getString(C0966R.string.i_z), mySafeDeviceListUI.f10604q);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$b */
    public class C1387b extends MMHandler {
        public C1387b() {
        }

        public void handleMessage(Message message) {
            MySafeDeviceListUI.this.f10594d.notifyDataSetChanged();
            super.handleMessage(message);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$c */
    public class C1388c implements MenuItem.OnMenuItemClickListener {
        public C1388c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MySafeDeviceListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$d */
    public class C1389d implements Comparator<C13000e> {
        public C1389d(MySafeDeviceListUI mySafeDeviceListUI) {
        }

        public int compare(Object obj, Object obj2) {
            long j = ((C13000e) obj).field_createtime;
            long j2 = ((C13000e) obj2).field_createtime;
            if (j - j2 > 0) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$e */
    public class C1390e implements View.OnLayoutChangeListener {
        public C1390e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            MySafeDeviceListUI mySafeDeviceListUI = MySafeDeviceListUI.this;
            int i9 = MySafeDeviceListUI.f10593u;
            mySafeDeviceListUI.f10606s.removeCallbacks(mySafeDeviceListUI.f10607t);
            mySafeDeviceListUI.f10606s.post(mySafeDeviceListUI.f10607t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$f */
    public class C1391f implements Runnable {
        public C1391f() {
        }

        public void run() {
            View findViewById = MySafeDeviceListUI.this.getListView().findViewById(C0966R.C0970id.oig);
            if (findViewById == null) {
                findViewById = MySafeDeviceListUI.this.getListView().findViewById(C0966R.C0970id.oij);
            }
            if (findViewById != null) {
                Rect rect = new Rect();
                findViewById.getHitRect(rect);
                MySafeDeviceListUI mySafeDeviceListUI = MySafeDeviceListUI.this;
                if (mySafeDeviceListUI.f10603p == 0) {
                    mySafeDeviceListUI.f10603p = mySafeDeviceListUI.f10602o;
                }
                int max = Math.max(mySafeDeviceListUI.f10602o, (mySafeDeviceListUI.getListView().getHeight() - rect.bottom) + MySafeDeviceListUI.this.f10603p);
                Log.m105924i("MicroMsg.MySafeDeviceListUI", "marginTop:" + max + " minTopPadding:" + MySafeDeviceListUI.this.f10602o + " getListView().getHeight():" + MySafeDeviceListUI.this.getListView().getHeight() + " out.bottom:" + rect.bottom + " curTopPadding:" + MySafeDeviceListUI.this.f10603p);
                findViewById.setPadding(0, max, 0, findViewById.getPaddingBottom());
                MySafeDeviceListUI mySafeDeviceListUI2 = MySafeDeviceListUI.this;
                if (mySafeDeviceListUI2.f10603p != max) {
                    mySafeDeviceListUI2.f10603p = max;
                    mySafeDeviceListUI2.getListView().requestLayout();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$g */
    public class C1392g implements Runnable {
        public C1392g() {
        }

        public void run() {
            MySafeDeviceListUI mySafeDeviceListUI = MySafeDeviceListUI.this;
            int i = MySafeDeviceListUI.f10593u;
            mySafeDeviceListUI.mo1350I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI$h */
    public class C1393h implements SafeDeviceListPreference.C1395b, SafeDeviceListPreference.C1396c {
        public C1393h(C1386a aVar) {
        }
    }

    /* renamed from: H7 */
    public final void mo1349H7(C13000e eVar, SimpleDateFormat simpleDateFormat) {
        SafeDeviceListPreference safeDeviceListPreference = new SafeDeviceListPreference(this, (AttributeSet) null);
        safeDeviceListPreference.mo26273A("mysafedevice_" + eVar.field_uid);
        safeDeviceListPreference.mo69924H(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, eVar.field_name));
        if (!eVar.field_online) {
            safeDeviceListPreference.mo7741E(C72715f.m85112e(getContext(), eVar.field_createtime * 1000, false));
        }
        C1393h hVar = this.f10597g;
        safeDeviceListPreference.f10622R = hVar;
        safeDeviceListPreference.f10623S = hVar;
        safeDeviceListPreference.f10616K = eVar;
        this.f10594d.mo72524h(safeDeviceListPreference, -1);
        if (!C8206g.f27135a.mo9260a(eVar.field_uid, C87203t.m108273i(), "MySafeDeviceListUI", false)) {
            ((LinkedList) this.f10596f).add(safeDeviceListPreference);
        }
    }

    /* renamed from: I7 */
    public final void mo1350I7() {
        ((LinkedList) this.f10596f).clear();
        this.f10598h = C13003h.vx0().mo12524jo();
        ((ArrayList) this.f10599i).clear();
        ((ArrayList) this.f10600j).clear();
        Collections.sort(this.f10598h, new C1389d(this));
        for (C13000e next : this.f10598h) {
            if (next.field_online) {
                if (C8206g.f27135a.mo9260a(next.field_uid, C87203t.m108273i(), "MySafeDeviceListUI", false)) {
                    ((ArrayList) this.f10599i).add(0, next);
                } else {
                    ((ArrayList) this.f10599i).add(next);
                }
            } else if (C8206g.f27135a.mo9260a(next.field_uid, C87203t.m108273i(), "MySafeDeviceListUI", false)) {
                ((ArrayList) this.f10599i).add(0, next);
            } else {
                ((ArrayList) this.f10600j).add(next);
            }
        }
        this.f10594d.removeAll();
        this.f10594d.mo72520b(C0966R.xml.f8937bt);
        if (((LinkedList) this.f10598h).size() == 0) {
            this.f10594d.mo72531o("my_safe_device_list_tip");
            this.f10594d.mo72531o("my_online_device_list_tip");
            this.f10594d.mo72531o("my_offline_device_list_tip");
            showOptionMenu(false);
            return;
        }
        if (this.f10595e == 1) {
            addTextOptionMenu(0, getString(C0966R.string.i_z), this.f10604q);
            this.f10595e = ~this.f10595e;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        if (((ArrayList) this.f10599i).size() > 0) {
            PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(getContext(), (AttributeSet) null);
            preferenceTitleCategory.mo69924H(getContext().getString(C0966R.string.nfu));
            this.f10594d.mo72527k(preferenceTitleCategory);
        }
        Iterator it = ((ArrayList) this.f10599i).iterator();
        while (it.hasNext()) {
            mo1349H7((C13000e) it.next(), simpleDateFormat);
        }
        if (((ArrayList) this.f10600j).size() > 0) {
            PreferenceTitleCategory preferenceTitleCategory2 = new PreferenceTitleCategory(getContext(), (AttributeSet) null);
            preferenceTitleCategory2.mo69924H(getContext().getString(C0966R.string.nft));
            this.f10594d.mo72527k(preferenceTitleCategory2);
        }
        Iterator it4 = ((ArrayList) this.f10600j).iterator();
        while (it4.hasNext()) {
            mo1349H7((C13000e) it4.next(), simpleDateFormat);
        }
        showOptionMenu(true);
        this.f10606s.removeCallbacks(this.f10607t);
        this.f10606s.post(this.f10607t);
        getListView().addOnLayoutChangeListener(new C1390e());
    }

    public View getFooterView() {
        TextView textView = (TextView) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_r, (ViewGroup) getListView().getParent(), false).findViewById(C0966R.C0970id.oij);
        this.f10602o = textView.getPaddingTop();
        textView.setText(String.format("<a href='%s'>%s</a>", new Object[]{getString(C0966R.string.nfq), getString(C0966R.string.nfi)}));
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(textView, 1);
        return textView;
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        setBackBtn(new C1388c());
        this.f10594d = getPreferenceScreen();
        this.f10596f = new LinkedList();
        this.f10597g = new C1393h((C1386a) null);
        addTextOptionMenu(0, getString(C0966R.string.i_z), this.f10604q);
        setMMTitle((int) C0966R.string.itm);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(PlayerThread.ACTION_QUIT, this);
        C86709a0.m107524d().mo123455a(361, this);
        C13003h.vx0().add(this);
        initView();
        C12998c cVar = new C12998c();
        C86709a0.m107524d().mo123460f(cVar);
        this.f10601n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.nbk), true, true, new C14185e(this, cVar));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.MySafeDeviceListUI).mo86136FZ(this, getClass().getSimpleName()).mo86148No(this, 4, 28198);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(PlayerThread.ACTION_QUIT, this);
        C86709a0.m107524d().mo123470p(361, this);
        C13003h.vx0().remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105924i("MicroMsg.MySafeDeviceListUI", "notify " + str);
        this.f10605r.post(new C1392g());
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.MySafeDeviceListUI", "null key");
            return false;
        } else if (!str.startsWith("mysafedevice_")) {
            return true;
        } else {
            C13000e eVar = ((SafeDeviceListPreference) preference).f10616K;
            Intent intent = new Intent(getContext(), MySafeDeviceDetailUI.class);
            intent.putExtra("INTENT_Device_Uid", eVar.field_uid);
            intent.putExtra("INTENT_Device_Name", eVar.field_name);
            intent.putExtra("INTENT_Device_Type", eVar.field_devicetype);
            intent.putExtra("INTENT_Device_LastActiveTime", eVar.field_createtime);
            intent.putExtra("INTENT_Device_IsOnline", eVar.field_online);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI", "startDeviceDetail", "(Lcom/tencent/mm/plugin/account/security/model/SafeDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceListUI", "startDeviceDetail", "(Lcom/tencent/mm/plugin/account/security/model/SafeDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.f10605r.postDelayed(new d$$a(this), 200);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.MySafeDeviceListUI", "errorCode %d, errorMsg %s, scene %s", Integer.valueOf(i2), str, yVar);
        ProgressDialog progressDialog = this.f10601n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f10601n.dismiss();
            this.f10601n = null;
        }
        if (yVar.getType() != 361) {
            return;
        }
        if (i == 0 && i2 == 0) {
            C13003h.vx0().update(((C12999d) yVar).f37061f, new String[0]);
            C76879j.m92726T(this, C76577a.m92166q(this, C0966R.string.ia5));
            return;
        }
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str);
    }
}
