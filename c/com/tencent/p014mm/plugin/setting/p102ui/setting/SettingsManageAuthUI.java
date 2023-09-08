package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.setting.model.UserAuthItemParcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import te3.C51517ua2;
import te3.io4;
import te3.jo4;
import xm2.C53380i;
import xm2.C53384o;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI */
public class SettingsManageAuthUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ListView f116305d;

    /* renamed from: e */
    public View f116306e;

    /* renamed from: f */
    public C42961f f116307f;

    /* renamed from: g */
    public ProgressDialog f116308g;

    /* renamed from: h */
    public List<io4> f116309h = new ArrayList();

    /* renamed from: i */
    public boolean f116310i;

    /* renamed from: j */
    public byte[] f116311j;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$a */
    public class C42956a implements AbsListView.OnScrollListener {
        public C42956a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i + i2 == i3) {
                Log.m105924i("MicroMsg.SettingsManageAuthUI", "scroll to the end");
                byte[] bArr = SettingsManageAuthUI.this.f116311j;
                if (bArr != null) {
                    C86709a0.m107524d().mo123460f(new C53384o(bArr));
                    SettingsManageAuthUI.this.f116311j = null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$b */
    public class C42957b implements AdapterView.OnItemClickListener {
        public C42957b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            io4 a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            SettingsManageAuthUI settingsManageAuthUI = SettingsManageAuthUI.this;
            if (!settingsManageAuthUI.f116310i && (a = settingsManageAuthUI.f116307f.getItem(i)) != null) {
                Intent intent = new Intent(SettingsManageAuthUI.this, SettingsModifyUserAuthUI.class);
                UserAuthItemParcelable[] userAuthItemParcelableArr = (UserAuthItemParcelable[]) UserAuthItemParcelable.CREATOR.newArray(a.f135551g.size());
                for (int i2 = 0; i2 < a.f135551g.size(); i2++) {
                    jo4 jo4 = a.f135551g.get(i2);
                    UserAuthItemParcelable userAuthItemParcelable = new UserAuthItemParcelable();
                    userAuthItemParcelable.f116217d = jo4.f136231d;
                    userAuthItemParcelable.f116218e = jo4.f136232e;
                    userAuthItemParcelable.f116219f = jo4.f136233f;
                    userAuthItemParcelable.f116220g = jo4.f136234g;
                    userAuthItemParcelableArr[i2] = userAuthItemParcelable;
                }
                intent.putExtra("app_id", a.f135548d);
                intent.putExtra("app_name", a.f135549e);
                intent.putExtra("modify_scene", 1);
                intent.putParcelableArrayListExtra("app_auth_items", new ArrayList(Arrays.asList(userAuthItemParcelableArr)));
                SettingsManageAuthUI settingsManageAuthUI2 = SettingsManageAuthUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                SettingsManageAuthUI settingsManageAuthUI3 = settingsManageAuthUI2;
                C117292a.m165358d(settingsManageAuthUI3, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                settingsManageAuthUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(settingsManageAuthUI3, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$c */
    public class C42958c implements MenuItem.OnMenuItemClickListener {
        public C42958c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsManageAuthUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$d */
    public class C42959d implements MenuItem.OnMenuItemClickListener {
        public C42959d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != 700) {
                return true;
            }
            SettingsManageAuthUI settingsManageAuthUI = SettingsManageAuthUI.this;
            settingsManageAuthUI.f116310i = false;
            settingsManageAuthUI.f116307f.notifyDataSetChanged();
            SettingsManageAuthUI.this.mo67154H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$e */
    public class C42960e implements MenuItem.OnMenuItemClickListener {
        public C42960e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == 700) {
                SettingsManageAuthUI settingsManageAuthUI = SettingsManageAuthUI.this;
                settingsManageAuthUI.f116310i = true;
                settingsManageAuthUI.f116307f.notifyDataSetChanged();
                SettingsManageAuthUI.this.mo67154H7();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$f */
    public class C42961f extends BaseAdapter {

        /* renamed from: d */
        public List<io4> f116317d;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$f$a */
        public class C42962a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f116319d;

            /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$f$a$a */
            public class C42963a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C53380i f116321d;

                public C42963a(C42962a aVar, C53380i iVar) {
                    this.f116321d = iVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    C86709a0.m107524d().mo123458d(this.f116321d);
                }
            }

            public C42962a(int i) {
                this.f116319d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$AuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (C42961f.this.getItem(this.f116319d) != null) {
                    C53380i iVar = new C53380i(C42961f.this.getItem(this.f116319d).f135548d, 1);
                    ProgressDialog progressDialog = SettingsManageAuthUI.this.f116308g;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    C86709a0.m107524d().mo123460f(iVar);
                    SettingsManageAuthUI settingsManageAuthUI = SettingsManageAuthUI.this;
                    settingsManageAuthUI.f116308g = C76879j.m92723Q(settingsManageAuthUI, "", settingsManageAuthUI.getString(C0966R.string.a2w), false, true, new C42963a(this, iVar));
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI$AuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI$f$b */
        public class C42964b {

            /* renamed from: a */
            public TextView f116322a;

            /* renamed from: b */
            public TextView f116323b;

            /* renamed from: c */
            public TextView f116324c;

            /* renamed from: d */
            public Button f116325d;

            public C42964b(C42961f fVar, C42956a aVar) {
            }
        }

        public C42961f(C42956a aVar) {
        }

        /* renamed from: a */
        public io4 getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f116317d.get(i);
        }

        public int getCount() {
            List<io4> list = this.f116317d;
            if (list == null || list.isEmpty()) {
                return 0;
            }
            return this.f116317d.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C42964b bVar;
            if (view == null) {
                view = SettingsManageAuthUI.this.getLayoutInflater().inflate(C0966R.C0971layout.bx7, (ViewGroup) null);
                bVar = new C42964b(this, (C42956a) null);
                view.setTag(bVar);
            } else {
                bVar = (C42964b) view.getTag();
            }
            bVar.f116322a = (TextView) view.findViewById(C0966R.C0970id.je4);
            bVar.f116323b = (TextView) view.findViewById(C0966R.C0970id.je7);
            bVar.f116324c = (TextView) view.findViewById(C0966R.C0970id.f359172je1);
            Button button = (Button) view.findViewById(C0966R.C0970id.jdw);
            bVar.f116325d = button;
            button.setOnClickListener(new C42962a(i));
            if (SettingsManageAuthUI.this.f116310i) {
                bVar.f116325d.setVisibility(0);
            } else {
                bVar.f116325d.setVisibility(8);
            }
            if (getItem(i) != null) {
                bVar.f116322a.setText(getItem(i).f135549e);
                bVar.f116323b.setText(getItem(i).f135553i);
                TextView textView = bVar.f116324c;
                SettingsManageAuthUI settingsManageAuthUI = SettingsManageAuthUI.this;
                LinkedList<jo4> linkedList = getItem(i).f135551g;
                settingsManageAuthUI.getClass();
                StringBuilder sb = new StringBuilder();
                for (jo4 jo4 : linkedList) {
                    sb.append(jo4.f136232e);
                    sb.append(",");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                textView.setText(sb.toString());
            }
            return view;
        }
    }

    /* renamed from: H7 */
    public final void mo67154H7() {
        removeAllOptionMenu();
        if (((ArrayList) this.f116309h).isEmpty()) {
            View view = this.f116306e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f116306e;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f116310i) {
            addTextOptionMenu(700, getString(C0966R.string.f8014z_), new C42959d());
        } else {
            addTextOptionMenu(700, getString(C0966R.string.a08), new C42960e());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxg;
    }

    public void initView() {
        this.f116305d = (ListView) findViewById(C0966R.C0970id.a0m);
        this.f116306e = findViewById(C0966R.C0970id.a0l);
        C42961f fVar = new C42961f((C42956a) null);
        this.f116307f = fVar;
        this.f116305d.setAdapter(fVar);
        this.f116305d.setOnScrollListener(new C42956a());
        this.f116305d.setOnItemClickListener(new C42957b());
        mo67154H7();
        setMMTitle((int) C0966R.string.iqg);
        setBackBtn(new C42958c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(1146, this);
        C86709a0.m107524d().mo123470p(1127, this);
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(1146, this);
        C86709a0.m107524d().mo123455a(1127, this);
        C86709a0.m107524d().mo123460f(new C53384o((byte[]) null));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        Log.m105925i("MicroMsg.SettingsManageAuthUI", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f116308g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i != 0 || i2 != 0) {
            C76879j.m92726T(this, str);
        } else if (yVar.getType() == 1146) {
            C53384o oVar = (C53384o) yVar;
            this.f116311j = oVar.mo74032j1();
            if (oVar.f150213f != null) {
                z = true;
            }
            if (!z) {
                ((ArrayList) this.f116309h).clear();
            }
            List<io4> list = this.f116309h;
            C51517ua2 ua22 = oVar.f150212e;
            ((ArrayList) list).addAll(ua22 != null ? ua22.f142698e : Collections.emptyList());
            C42961f fVar = this.f116307f;
            fVar.f116317d = this.f116309h;
            fVar.notifyDataSetChanged();
            mo67154H7();
        } else if (yVar.getType() == 1127) {
            String str2 = ((C53380i) yVar).f150200e;
            if (!Util.isNullOrNil(str2)) {
                if (!((ArrayList) this.f116309h).isEmpty()) {
                    Iterator it = ((ArrayList) this.f116309h).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((io4) it.next()).f135548d.equals(str2)) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f116307f.notifyDataSetChanged();
            }
        }
    }
}
