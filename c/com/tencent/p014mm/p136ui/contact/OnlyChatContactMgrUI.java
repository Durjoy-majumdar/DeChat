package com.tencent.p014mm.p136ui.contact;

import a22.C27740g;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberScrollBar;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72960e2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l31.C61212e;
import lc3.C10485b;
import nj3.C11184p0;
import nj3.C76879j;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import pc0.C11884l;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import qo3.C89779i0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI */
public class OnlyChatContactMgrUI extends MMActivity implements C74493g1, MStorageEx.IOnStorageChange, C11385n {

    /* renamed from: u */
    public static final /* synthetic */ int f24421u = 0;

    /* renamed from: d */
    public ListView f24422d;

    /* renamed from: e */
    public C6853n f24423e;

    /* renamed from: f */
    public TextView f24424f;

    /* renamed from: g */
    public ContactCountView f24425g;

    /* renamed from: h */
    public EditText f24426h;

    /* renamed from: i */
    public Button f24427i;

    /* renamed from: j */
    public Button f24428j;

    /* renamed from: n */
    public Button f24429n;

    /* renamed from: o */
    public C89779i0 f24430o;

    /* renamed from: p */
    public final int f24431p;

    /* renamed from: q */
    public final int f24432q;

    /* renamed from: r */
    public int f24433r;

    /* renamed from: s */
    public int f24434s;

    /* renamed from: t */
    public BatchSocialBlackLogStruct f24435t;

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$a */
    public class C6836a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ List f24436d;

        /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$a$a */
        public class C6837a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C11884l f24438d;

            public C6837a(C6836a aVar, C11884l lVar) {
                this.f24438d = lVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107529k().f251779b.mo123458d(this.f24438d);
            }
        }

        public C6836a(List list) {
            this.f24436d = list;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C11884l lVar = new C11884l(this.f24436d, 8388608, 2, OnlyChatContactMgrUI.this.f24431p);
            C86709a0.m107529k().f251779b.mo123460f(lVar);
            OnlyChatContactMgrUI.this.f24435t.f9634e = (long) this.f24436d.size();
            OnlyChatContactMgrUI onlyChatContactMgrUI = OnlyChatContactMgrUI.this;
            onlyChatContactMgrUI.f24435t.f9637h = (long) onlyChatContactMgrUI.f24423e.mo7854s();
            BatchSocialBlackLogStruct batchSocialBlackLogStruct = OnlyChatContactMgrUI.this.f24435t;
            long currentTimeMillis = System.currentTimeMillis();
            OnlyChatContactMgrUI onlyChatContactMgrUI2 = OnlyChatContactMgrUI.this;
            batchSocialBlackLogStruct.f9642m = currentTimeMillis - onlyChatContactMgrUI2.f24435t.f9642m;
            onlyChatContactMgrUI2.f24430o = C76879j.m92723Q(onlyChatContactMgrUI2.getContext(), OnlyChatContactMgrUI.this.getString(C0966R.string.a3h), OnlyChatContactMgrUI.this.getString(C0966R.string.f7439ga), true, true, new C6837a(this, lVar));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$b */
    public class C6838b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C11884l f24439d;

        public C6838b(OnlyChatContactMgrUI onlyChatContactMgrUI, C11884l lVar) {
            this.f24439d = lVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(this.f24439d);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$c */
    public class C6839c implements C47883u {
        public C6839c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            OnlyChatContactMgrUI.this.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(OnlyChatContactMgrUI.this.getContext()));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(OnlyChatContactMgrUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$d */
    public class C6840d implements C47883u {
        public C6840d(OnlyChatContactMgrUI onlyChatContactMgrUI) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$e */
    public class C6841e implements View.OnClickListener {
        public C6841e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = OnlyChatContactMgrUI.this.f24422d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$1", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$1", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$f */
    public class C6842f implements AdapterView.OnItemClickListener {
        public C6842f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C75922b j2 = OnlyChatContactMgrUI.this.f24423e.getItem(i);
            if (j2 == null || !(j2 instanceof C75939h)) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            String str = ((C75939h) j2).f222602y;
            C6853n nVar = OnlyChatContactMgrUI.this.f24423e;
            if (nVar.f219057f) {
                if (((LinkedList) nVar.f24459r).contains(str)) {
                    ((LinkedList) nVar.f24459r).remove(str);
                } else {
                    ((LinkedList) nVar.f24459r).add(str);
                }
                nVar.notifyDataSetChanged();
                if (((LinkedList) OnlyChatContactMgrUI.this.f24423e.f24459r).size() > 0) {
                    Button button = OnlyChatContactMgrUI.this.f24429n;
                    button.setText(OnlyChatContactMgrUI.this.getString(C0966R.string.f7438g_) + "(" + ((LinkedList) OnlyChatContactMgrUI.this.f24423e.f24459r).size() + ")");
                    OnlyChatContactMgrUI.this.f24429n.setEnabled(true);
                } else {
                    OnlyChatContactMgrUI onlyChatContactMgrUI = OnlyChatContactMgrUI.this;
                    onlyChatContactMgrUI.f24429n.setText(onlyChatContactMgrUI.getString(C0966R.string.f7438g_));
                    OnlyChatContactMgrUI.this.f24429n.setEnabled(false);
                }
            } else if (C72996z1.m85841l5(str)) {
                Intent intent = new Intent(OnlyChatContactMgrUI.this.getContext(), AddressUI.class);
                intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                OnlyChatContactMgrUI onlyChatContactMgrUI2 = OnlyChatContactMgrUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                OnlyChatContactMgrUI onlyChatContactMgrUI3 = onlyChatContactMgrUI2;
                C117292a.m165358d(onlyChatContactMgrUI3, aVar.mo10232b(), "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                onlyChatContactMgrUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(onlyChatContactMgrUI3, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", str);
                intent2.putExtra("Contact_Scene", 3);
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                if (str != null && str.length() > 0) {
                    C88144b.m109791i(OnlyChatContactMgrUI.this.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$g */
    public class C6843g implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$g$a */
        public class C6844a implements View.OnCreateContextMenuListener {

            /* renamed from: d */
            public final /* synthetic */ int f24444d;

            public C6844a(C6843g gVar, int i) {
                this.f24444d = i;
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(this.f24444d, 0, 0, C0966R.string.bod);
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$g$b */
        public class C6845b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f24445d;

            public C6845b(String str) {
                this.f24445d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Intent intent = new Intent();
                intent.setClass(OnlyChatContactMgrUI.this.getContext(), ContactRemarkInfoModUI.class);
                intent.putExtra("Contact_User", this.f24445d);
                intent.putExtra("view_mode", true);
                AppCompatActivity context = OnlyChatContactMgrUI.this.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$3$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$3$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C6843g() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            C75922b j2 = OnlyChatContactMgrUI.this.f24423e.getItem(i);
            if (j2 != null && (j2 instanceof C75939h)) {
                String str = ((C75939h) j2).f222602y;
                OnlyChatContactMgrUI onlyChatContactMgrUI = OnlyChatContactMgrUI.this;
                if (!onlyChatContactMgrUI.f24423e.f219057f) {
                    C78253a aVar = new C78253a(onlyChatContactMgrUI.getContext());
                    C6844a aVar2 = new C6844a(this, i);
                    C6845b bVar = new C6845b(str);
                    OnlyChatContactMgrUI onlyChatContactMgrUI2 = OnlyChatContactMgrUI.this;
                    aVar.mo108272g(view, i, j, aVar2, bVar, onlyChatContactMgrUI2.f24433r, onlyChatContactMgrUI2.f24434s);
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$h */
    public class C6846h implements View.OnTouchListener {
        public C6846h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                OnlyChatContactMgrUI.this.hideVKB();
                OnlyChatContactMgrUI.this.f24433r = (int) motionEvent.getRawX();
                OnlyChatContactMgrUI.this.f24434s = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$i */
    public class C6847i implements VerticalScrollBar.C6756b {
        public C6847i() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            if ("↑".equals(str)) {
                OnlyChatContactMgrUI.this.f24422d.setSelection(0);
                return;
            }
            C6853n nVar = OnlyChatContactMgrUI.this.f24423e;
            int intValue = nVar.f24456o.get(str) == null ? -1 : nVar.f24456o.get(str).intValue();
            if (intValue != -1) {
                OnlyChatContactMgrUI.this.f24422d.setSelection(intValue);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$j */
    public class C6848j implements TextWatcher {

        /* renamed from: d */
        public MTimerHandler f24449d = new MTimerHandler(new C6849a(), false);

        /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$j$a */
        public class C6849a implements MTimerHandler.CallBack {
            public C6849a() {
            }

            public boolean onTimerExpired() {
                Log.m105918d("MicroMsg.OnlyChatContactMgrUI", "searchEvent onTimerExpired");
                String obj = OnlyChatContactMgrUI.this.f24426h.getText().toString();
                if (!Util.isNullOrNil(obj)) {
                    OnlyChatContactMgrUI.this.f24425g.setVisible(Util.isNullOrNil(obj));
                }
                C6853n nVar = OnlyChatContactMgrUI.this.f24423e;
                if (!nVar.f24458q.equalsIgnoreCase(obj)) {
                    nVar.f24458q = obj;
                }
                nVar.mo7853r();
                return false;
            }
        }

        public C6848j() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f24449d.stopTimer();
            this.f24449d.startTimer(500);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$k */
    public class C6850k implements View.OnClickListener {
        public C6850k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            OnlyChatContactMgrUI onlyChatContactMgrUI = OnlyChatContactMgrUI.this;
            int i = OnlyChatContactMgrUI.f24421u;
            onlyChatContactMgrUI.getClass();
            C77407n nVar = new C77407n((Context) onlyChatContactMgrUI, 1, true);
            nVar.f225771i = new C6889j2(onlyChatContactMgrUI);
            nVar.mo107568m(onlyChatContactMgrUI.getString(C0966R.string.f7442gd), 17, C76577a.m92151b(onlyChatContactMgrUI, 14));
            nVar.f225782p = new C6890k2(onlyChatContactMgrUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$l */
    public class C6851l implements View.OnClickListener {
        public C6851l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            OnlyChatContactMgrUI.this.f24435t = new BatchSocialBlackLogStruct();
            Intent intent = new Intent(OnlyChatContactMgrUI.this, SelectContactsFromRangeUI.class);
            intent.putExtra("intent_status_mgr", true);
            intent.putExtra("list_type", 16);
            intent.putExtra("filter_type", "@social.black.android");
            OnlyChatContactMgrUI.this.startActivityForResult(intent, 2);
            BatchSocialBlackLogStruct batchSocialBlackLogStruct = OnlyChatContactMgrUI.this.f24435t;
            batchSocialBlackLogStruct.f9633d = 5;
            batchSocialBlackLogStruct.f9642m = System.currentTimeMillis();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$m */
    public class C6852m implements MenuItem.OnMenuItemClickListener {
        public C6852m() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            OnlyChatContactMgrUI.this.hideVKB();
            OnlyChatContactMgrUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.OnlyChatContactMgrUI$n */
    public class C6853n extends C74526m1 {

        /* renamed from: n */
        public Cursor f24455n;

        /* renamed from: o */
        public HashMap<String, Integer> f24456o = new HashMap<>();

        /* renamed from: p */
        public SparseArray<String> f24457p = new SparseArray<>();

        /* renamed from: q */
        public String f24458q = "";

        /* renamed from: r */
        public List<String> f24459r = new LinkedList();

        public C6853n(C74493g1 g1Var) {
            super(g1Var, ContactBlackListHelper.m6942a(), true, false);
            mo7853r();
        }

        public int getCount() {
            int count = this.f24455n.getCount();
            SparseArray<String> sparseArray = this.f24457p;
            return count + (sparseArray == null ? 0 : sparseArray.size()) + 1;
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            if (i == 0) {
                String string = OnlyChatContactMgrUI.this.getString(C0966R.string.f7440gb);
                C75957r rVar = new C75957r(i);
                rVar.f222731x = string;
                return rVar;
            } else if (this.f24457p.indexOfKey(i) >= 0) {
                C75957r rVar2 = new C75957r(i);
                rVar2.f222731x = this.f24457p.get(i);
                return rVar2;
            } else {
                int i2 = i;
                int i3 = 1;
                while (i3 <= this.f24457p.size()) {
                    if (this.f24457p.indexOfKey(i2) >= 0) {
                        i3++;
                    }
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                }
                int i4 = i - i3;
                if (this.f24455n.moveToPosition(i4)) {
                    Log.m105919d("MicroMsg.OnlyChatContactMgrUI", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
                    C72996z1 z1Var = new C72996z1();
                    z1Var.convertFrom(this.f24455n);
                    C75939h hVar = new C75939h(i);
                    hVar.mo106181j(z1Var);
                    if (C72996z1.m85820U5(z1Var.getUsername())) {
                        hVar.f222608e = false;
                        hVar.f222611h = false;
                        hVar.f222610g = false;
                        hVar.f222680F = true;
                    } else {
                        hVar.f222608e = this.f219057f;
                        hVar.f222611h = this.f219058g;
                        hVar.f222680F = false;
                    }
                    return hVar;
                }
                Log.m105925i("MicroMsg.OnlyChatContactMgrUI", "create contact item error: position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
                return null;
            }
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Log.m105924i("MicroMsg.OnlyChatContactMgrUI", "finish!");
            Cursor cursor = this.f24455n;
            if (cursor != null) {
                cursor.close();
                this.f24455n = null;
            }
        }

        /* renamed from: q */
        public int mo7852q(String str) {
            HashMap<String, Integer> hashMap = this.f24456o;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return -1;
            }
            return this.f24456o.get(str).intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
        }

        /* renamed from: r */
        public void mo7853r() {
            Cursor cursor = this.f24455n;
            if (cursor != null) {
                cursor.close();
                this.f24455n = null;
            }
            this.f24456o.clear();
            this.f24457p.clear();
            C86709a0.m107528h();
            this.f24455n = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, this.f24458q, "@social.black.android", "", this.f219096j);
            String[] v = C45628s0.m50804v((String[]) null, "@social.black.android", "", this.f24458q, this.f219096j);
            int[] t = C45628s0.m50800t((String[]) null, "@social.black.android", "", this.f219096j, this.f24458q);
            if (!(v == null || t == null)) {
                int i = 1;
                for (int i2 = 0; i2 < v.length; i2++) {
                    if (i2 < t.length) {
                        this.f24456o.put(v[i2], Integer.valueOf(t[i2] + i));
                        this.f24457p.put(t[i2] + i, v[i2]);
                        i++;
                    }
                }
            }
            Log.m105925i("MicroMsg.OnlyChatContactMgrUI", "datacount:%d headerPosMap=%s", Integer.valueOf(this.f24455n.getCount()), this.f24456o.toString());
            mo103564g();
            notifyDataSetChanged();
        }

        /* renamed from: s */
        public int mo7854s() {
            Cursor cursor = this.f24455n;
            if (cursor != null) {
                return cursor.getCount();
            }
            return 0;
        }
    }

    public OnlyChatContactMgrUI() {
        Class cls = C10485b.class;
        this.f24431p = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30);
        this.f24432q = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMBatchModContactTypeMaxNumForClient", 30);
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return false;
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        return this.f24422d;
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.blu;
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringsToList;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == 3) {
                int intExtra = intent.getIntExtra("label_id", 0);
                C72960e2 vx02 = C27740g.vx0();
                ArrayList<String> bO = vx02.mo100951bO(intExtra + "");
                Intent intent2 = new Intent(this, SelectContactsFromRangeUI.class);
                intent2.putExtra("list_type", 1);
                intent2.putExtra("filter_type", "@all.contact.android");
                String[] strArr = new String[0];
                if (bO != null) {
                    strArr = (String[]) bO.toArray(strArr);
                }
                intent2.putExtra("already_select_contact", strArr);
                intent2.putExtra("max_limit_num", this.f24432q);
                startActivityForResult(intent2, 1);
                BatchSocialBlackLogStruct batchSocialBlackLogStruct = this.f24435t;
                batchSocialBlackLogStruct.f9641l = batchSocialBlackLogStruct.mo86045b("selecttagid", intExtra + "", true);
                BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = this.f24435t;
                C72960e2 vx03 = C27740g.vx0();
                batchSocialBlackLogStruct2.f9640k = batchSocialBlackLogStruct2.mo86045b("selecttagname", vx03.mo100943DN(intExtra + ""), true);
            } else if (i == 2) {
                ArrayList<String> stringsToList2 = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","));
                if (stringsToList2 != null && !stringsToList2.isEmpty()) {
                    C76879j.m92708B(this, getString(C0966R.string.f7437g9), "", getString(C0966R.string.f7438g_), getString(C0966R.string.f7926wf), new C6836a(stringsToList2), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
                }
            } else if (i == 1 && (stringsToList = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","))) != null && !stringsToList.isEmpty()) {
                C11884l lVar = new C11884l(stringsToList, 8388608, 1, this.f24431p);
                C86709a0.m107529k().f251779b.mo123460f(lVar);
                this.f24435t.f9634e = (long) stringsToList.size();
                this.f24435t.f9637h = (long) this.f24423e.mo7854s();
                this.f24435t.f9642m = System.currentTimeMillis() - this.f24435t.f9642m;
                this.f24430o = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f7435g7), true, true, new C6838b(this, lVar));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7430g2);
        this.f24422d = (ListView) findViewById(C0966R.C0970id.gri);
        setToTop(new C6841e());
        this.f24424f = (TextView) findViewById(C0966R.C0970id.cja);
        this.f24423e = new C6853n(this);
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("intent_status_mgr", false);
        if (booleanExtra) {
            this.f24423e.f219057f = true;
        }
        this.f24422d.setOnItemClickListener(new C6842f());
        this.f24422d.setOnItemLongClickListener(new C6843g());
        this.f24422d.setOnTouchListener(new C6846h());
        this.f24422d.setAdapter(this.f24423e);
        ListView listView = this.f24422d;
        ContactCountView contactCountView = new ContactCountView(this);
        this.f24425g = contactCountView;
        listView.addFooterView(contactCountView, (Object) null, false);
        this.f24425g.setFixedContactCount(this.f24423e.mo7854s());
        int i = 8;
        this.f24424f.setVisibility(this.f24423e.mo7854s() == 0 ? 0 : 8);
        ((SelectMemberScrollBar) findViewById(C0966R.C0970id.grk)).setOnScrollBarTouchListener(new C6847i());
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.j_b);
        this.f24426h = mMEditText;
        mMEditText.addTextChangedListener(new C6848j());
        this.f24427i = (Button) findViewById(C0966R.C0970id.f5585j3);
        this.f24428j = (Button) findViewById(C0966R.C0970id.f358490ff2);
        Button button = (Button) findViewById(C0966R.C0970id.c0a);
        this.f24429n = button;
        button.setEnabled(false);
        this.f24427i.setVisibility(booleanExtra ? 8 : 0);
        this.f24428j.setVisibility(booleanExtra ? 8 : 0);
        Button button2 = this.f24429n;
        if (booleanExtra) {
            i = 0;
        }
        button2.setVisibility(i);
        Button button3 = this.f24428j;
        if (this.f24423e.mo7854s() > 0) {
            z = true;
        }
        button3.setEnabled(z);
        this.f24427i.setOnClickListener(new C6850k());
        this.f24428j.setOnClickListener(new C6851l());
        setBackBtn(new C6852m());
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(3990, this);
        if (((ArrayList) C94866e1.ey0().mo11650Lo()).size() == 0) {
            GetSnsTagListEvent getSnsTagListEvent = new GetSnsTagListEvent();
            getSnsTagListEvent.f9308d.f9309a = 1;
            getSnsTagListEvent.publish();
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.OnlyChatContactMgrUI).mo86179qs(this, C76986a.ContactSocialBlackList);
    }

    public void onDestroy() {
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(3990, this);
        this.f24423e.mo7851i();
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        this.f24423e.mo7853r();
        int s = this.f24423e.mo7854s();
        this.f24425g.setFixedContactCount(s);
        boolean z = false;
        this.f24424f.setVisibility(s == 0 ? 0 : 8);
        Button button = this.f24428j;
        if (s > 0) {
            z = true;
        }
        button.setEnabled(z);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Log.m105924i("MicroMsg.OnlyChatContactMgrUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
        if (yVar instanceof C11884l) {
            C89779i0 i0Var = this.f24430o;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f24430o = null;
            }
            C11884l lVar = (C11884l) yVar;
            if (i == 0 && i2 == 0) {
                Toast.makeText(this, getString(lVar.f34724g == 1 ? C0966R.string.f7445gg : C0966R.string.f7448gj), 0).show();
                BatchSocialBlackLogStruct batchSocialBlackLogStruct = this.f24435t;
                batchSocialBlackLogStruct.f9635f = batchSocialBlackLogStruct.f9634e;
                batchSocialBlackLogStruct.f9636g = batchSocialBlackLogStruct.mo86045b("modifiedsucfriendlist", Util.listToString(lVar.f34722e, "#"), true);
                if (lVar.f34724g == 1) {
                    BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = this.f24435t;
                    batchSocialBlackLogStruct2.f9638i = batchSocialBlackLogStruct2.f9637h + ((long) ((LinkedList) lVar.f34722e).size());
                } else {
                    BatchSocialBlackLogStruct batchSocialBlackLogStruct3 = this.f24435t;
                    batchSocialBlackLogStruct3.f9638i = batchSocialBlackLogStruct3.f9637h - ((long) ((LinkedList) lVar.f34722e).size());
                }
                BatchSocialBlackLogStruct batchSocialBlackLogStruct4 = this.f24435t;
                batchSocialBlackLogStruct4.f9639j = 1;
                batchSocialBlackLogStruct4.f9643n = batchSocialBlackLogStruct4.mo86045b("sessionid", hashCode() + "", true);
                this.f24435t.mo86054n();
                return;
            }
            int i3 = C0966R.string.f7443ge;
            if (i2 == -3503) {
                C77426q qVar = new C77426q(this);
                qVar.mo107595g(Util.nullAs(yVar.getReqResp().getRespObj().getErrMsg(), getString(C0966R.string.f7443ge)));
                qVar.mo107589a(true);
                qVar.mo107598j(getString(C0966R.string.hn8));
                qVar.mo107601m(C0966R.string.hn9);
                qVar.mo107590b(new C6839c());
                qVar.mo107603o();
                return;
            }
            C77426q qVar2 = new C77426q(this);
            if (i2 == -3500) {
                str2 = getString(lVar.f34724g == 1 ? C0966R.string.f7444gf : C0966R.string.f7447gi, new Object[]{Integer.valueOf(lVar.f34728n - ((LinkedList) lVar.f34722e).size())});
            } else {
                str2 = yVar.getReqResp().getRespObj().getErrMsg();
                if (Util.isNullOrNil(str2)) {
                    if (lVar.f34724g != 1) {
                        i3 = C0966R.string.f7446gh;
                    }
                    str2 = getString(i3);
                }
            }
            qVar2.mo107595g(str2);
            qVar2.mo107601m(C0966R.string.a18);
            qVar2.mo107600l(new C6840d(this));
            qVar2.mo107603o();
        }
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        return ((LinkedList) this.f24423e.f24459r).contains(((C75939h) bVar).f222602y);
    }
}
