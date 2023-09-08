package com.tencent.p014mm.p136ui.contact.privacy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberScrollBar;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.ContactCountView;
import com.tencent.p014mm.p136ui.contact.ContactRemarkInfoModUI;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import hl3.C8604c;
import hl3.C8606e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C11184p0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C77407n;
import qo3.C89779i0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase */
public abstract class ContactMgrUIBase extends MMActivity implements C74493g1, MStorageEx.IOnStorageChange, C11385n {

    /* renamed from: E */
    public static final /* synthetic */ int f24539E = 0;

    /* renamed from: A */
    public boolean f24540A;

    /* renamed from: B */
    public Handler f24541B;

    /* renamed from: C */
    public Runnable f24542C;

    /* renamed from: D */
    public C8606e f24543D;

    /* renamed from: d */
    public List<String> f24544d = new ArrayList();

    /* renamed from: e */
    public List<String> f24545e = new ArrayList();

    /* renamed from: f */
    public ListView f24546f;

    /* renamed from: g */
    public C6915k f24547g;

    /* renamed from: h */
    public TextView f24548h;

    /* renamed from: i */
    public TextView f24549i;

    /* renamed from: j */
    public View f24550j;

    /* renamed from: n */
    public ContactCountView f24551n;

    /* renamed from: o */
    public EditText f24552o;

    /* renamed from: p */
    public Button f24553p;

    /* renamed from: q */
    public Button f24554q;

    /* renamed from: r */
    public Button f24555r;

    /* renamed from: s */
    public String f24556s;

    /* renamed from: t */
    public int f24557t;

    /* renamed from: u */
    public C89779i0 f24558u = null;

    /* renamed from: v */
    public final int f24559v;

    /* renamed from: w */
    public final int f24560w;

    /* renamed from: x */
    public int f24561x;

    /* renamed from: y */
    public int f24562y;

    /* renamed from: z */
    public boolean f24563z;

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$a */
    public class C6902a implements MenuItem.OnMenuItemClickListener {
        public C6902a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactMgrUIBase.this.hideVKB();
            ContactMgrUIBase.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$b */
    public class C6903b implements Runnable {
        public C6903b() {
        }

        public void run() {
            ContactMgrUIBase.this.f24547g.mo7853r();
            ContactMgrUIBase.this.mo7908W7();
            ContactMgrUIBase.this.mo7915S7();
            ContactMgrUIBase.this.mo7918V7();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$c */
    public class C6904c implements View.OnClickListener {
        public C6904c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = ContactMgrUIBase.this.f24546f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$2", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$2", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$d */
    public class C6905d implements AdapterView.OnItemClickListener {
        public C6905d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            AdapterView<?> adapterView2 = adapterView;
            arrayList.add(adapterView);
            View view2 = view;
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ContactMgrUIBase.this.mo7906N7(adapterView, view, i, j);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$e */
    public class C6906e implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$e$a */
        public class C6907a implements View.OnCreateContextMenuListener {

            /* renamed from: d */
            public final /* synthetic */ int f24569d;

            public C6907a(C6906e eVar, int i) {
                this.f24569d = i;
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(this.f24569d, 0, 0, C0966R.string.bod);
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$e$b */
        public class C6908b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f24570d;

            public C6908b(String str) {
                this.f24570d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Intent intent = new Intent();
                intent.setClass(ContactMgrUIBase.this.getContext(), ContactRemarkInfoModUI.class);
                intent.putExtra("Contact_User", this.f24570d);
                intent.putExtra("view_mode", true);
                AppCompatActivity context = ContactMgrUIBase.this.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$4$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$4$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C6906e() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            C75922b j2 = ContactMgrUIBase.this.f24547g.getItem(i);
            if (j2 != null && (j2 instanceof C75939h)) {
                String str = ((C75939h) j2).f222602y;
                ContactMgrUIBase contactMgrUIBase = ContactMgrUIBase.this;
                if (!contactMgrUIBase.f24547g.f219057f) {
                    C78253a aVar = new C78253a(contactMgrUIBase.getContext());
                    C6907a aVar2 = new C6907a(this, i);
                    C6908b bVar = new C6908b(str);
                    ContactMgrUIBase contactMgrUIBase2 = ContactMgrUIBase.this;
                    aVar.mo108272g(view, i, j, aVar2, bVar, contactMgrUIBase2.f24561x, contactMgrUIBase2.f24562y);
                }
                ContactMgrUIBase.this.mo7905M7(adapterView, view, i, j);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$f */
    public class C6909f implements View.OnTouchListener {
        public C6909f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                ContactMgrUIBase.this.hideVKB();
                ContactMgrUIBase.this.f24561x = (int) motionEvent.getRawX();
                ContactMgrUIBase.this.f24562y = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$g */
    public class C6910g implements VerticalScrollBar.C6756b {
        public C6910g() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            if ("↑".equals(str)) {
                ContactMgrUIBase.this.f24546f.setSelection(0);
                return;
            }
            C6915k kVar = ContactMgrUIBase.this.f24547g;
            int intValue = kVar.f24580o.get(str) == null ? -1 : kVar.f24580o.get(str).intValue();
            if (intValue != -1) {
                ContactMgrUIBase.this.f24546f.setSelection(intValue);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$h */
    public class C6911h implements TextWatcher {

        /* renamed from: d */
        public MTimerHandler f24574d = new MTimerHandler(new C6912a(), false);

        /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$h$a */
        public class C6912a implements MTimerHandler.CallBack {
            public C6912a() {
            }

            public boolean onTimerExpired() {
                Log.m105918d("MicroMsg.ContactMgrUIBase", "searchEvent onTimerExpired");
                String obj = ContactMgrUIBase.this.f24552o.getText().toString();
                if (!Util.isNullOrNil(obj)) {
                    ContactMgrUIBase.this.f24551n.setVisible(Util.isNullOrNil(obj));
                }
                C6915k kVar = ContactMgrUIBase.this.f24547g;
                if (!kVar.f24582q.equalsIgnoreCase(obj)) {
                    kVar.f24582q = obj;
                }
                kVar.mo7853r();
                return false;
            }
        }

        public C6911h() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f24574d.stopTimer();
            this.f24574d.startTimer(500);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$i */
    public class C6913i implements View.OnClickListener {
        public C6913i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactMgrUIBase contactMgrUIBase = ContactMgrUIBase.this;
            int i = ContactMgrUIBase.f24539E;
            contactMgrUIBase.getClass();
            C77407n nVar = new C77407n((Context) contactMgrUIBase, 1, true);
            nVar.f225771i = new C8604c(contactMgrUIBase);
            nVar.mo107568m(contactMgrUIBase.getString(C0966R.string.hmd), 17, C76577a.m92151b(contactMgrUIBase, 14));
            nVar.f225782p = new C6931a(contactMgrUIBase);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$j */
    public class C6914j implements View.OnClickListener {
        public C6914j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactMgrUIBase.this.mo7903K7();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$k */
    public abstract class C6915k extends C74526m1 {

        /* renamed from: n */
        public Cursor f24579n;

        /* renamed from: o */
        public HashMap<String, Integer> f24580o = new HashMap<>();

        /* renamed from: p */
        public SparseArray<String> f24581p = new SparseArray<>();

        /* renamed from: q */
        public String f24582q = "";

        /* renamed from: r */
        public List<String> f24583r = new LinkedList();

        public C6915k(ContactMgrUIBase contactMgrUIBase, C74493g1 g1Var) {
            super(g1Var, ContactBlackListHelper.m6942a(), true, false);
            new ArrayList();
            new ArrayList();
        }

        public int getCount() {
            Cursor cursor = this.f24579n;
            int i = 0;
            int count = cursor == null ? 0 : cursor.getCount();
            SparseArray<String> sparseArray = this.f24581p;
            if (sparseArray != null) {
                i = sparseArray.size();
            }
            return count + i + (Util.isNullOrNil("") ^ true ? 1 : 0);
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            if ((!Util.isNullOrNil("")) && i == 0) {
                return mo7932s(i, "");
            }
            if (this.f24581p.indexOfKey(i) >= 0) {
                return mo7932s(i, this.f24581p.get(i));
            }
            int i2 = !Util.isNullOrNil("");
            int i3 = i;
            while (i2 <= this.f24581p.size()) {
                if (this.f24581p.indexOfKey(i3) >= 0) {
                    i2++;
                }
                i3--;
                if (i3 < 0) {
                    break;
                }
            }
            int i4 = i - i2;
            if (this.f24579n.moveToPosition(i4)) {
                Log.m105919d("MicroMsg.ContactMgrUIBase", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(this.f24579n);
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
            Log.m105925i("MicroMsg.ContactMgrUIBase", "create contact item error: position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
            return null;
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Log.m105924i("MicroMsg.ContactMgrUIBase", "finish!");
            Cursor cursor = this.f24579n;
            if (cursor != null) {
                cursor.close();
                this.f24579n = null;
            }
        }

        /* renamed from: q */
        public int mo7852q(String str) {
            HashMap<String, Integer> hashMap = this.f24580o;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return -1;
            }
            return this.f24580o.get(str).intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
        }

        /* renamed from: r */
        public void mo7853r() {
            Cursor cursor = this.f24579n;
            if (cursor != null) {
                cursor.close();
                this.f24579n = null;
            }
            this.f24580o.clear();
            this.f24581p.clear();
            C86709a0.m107528h();
            this.f24579n = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, this.f24582q, mo7911v(), "", this.f219096j);
            String[] v = C45628s0.m50804v((String[]) null, mo7911v(), "", this.f24582q, this.f219096j);
            int[] t = C45628s0.m50800t((String[]) null, mo7911v(), "", this.f219096j, this.f24582q);
            if (!(v == null || t == null)) {
                boolean z = !Util.isNullOrNil("");
                for (int i = 0; i < v.length; i++) {
                    if (i < t.length) {
                        this.f24580o.put(v[i], Integer.valueOf(t[i] + ((int) z)));
                        this.f24581p.put(t[i] + z, v[i]);
                        z++;
                    }
                }
            }
            Log.m105925i("MicroMsg.ContactMgrUIBase", "datacount:%d headerPosMap=%s, getdat: %s, this.query: %s.", Integer.valueOf(this.f24579n.getCount()), this.f24580o.toString(), mo7911v(), this.f24582q);
            mo103564g();
            notifyDataSetChanged();
        }

        /* renamed from: s */
        public C75922b mo7932s(int i, String str) {
            C75957r rVar = new C75957r(i);
            rVar.f222731x = str;
            return rVar;
        }

        /* renamed from: t */
        public void mo7933t(String str) {
            if (((LinkedList) this.f24583r).contains(str)) {
                ((LinkedList) this.f24583r).remove(str);
            } else {
                ((LinkedList) this.f24583r).add(str);
            }
            notifyDataSetChanged();
        }

        /* renamed from: u */
        public int mo7934u() {
            Cursor cursor = this.f24579n;
            if (cursor != null) {
                return cursor.getCount();
            }
            return 0;
        }

        /* renamed from: v */
        public abstract String mo7911v();
    }

    public ContactMgrUIBase() {
        Class cls = C10485b.class;
        this.f24559v = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30);
        this.f24560w = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("MMBatchModContactTypeMaxNumForClient", 30);
        this.f24541B = new Handler(Looper.getMainLooper());
        this.f24542C = new C6903b();
        this.f24543D = new C8606e(this);
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return false;
    }

    /* renamed from: H7 */
    public abstract C6915k mo7900H7(C74493g1 g1Var);

    /* renamed from: I7 */
    public CharSequence mo7901I7() {
        return getResources().getString(C0966R.string.hmg);
    }

    /* renamed from: J7 */
    public abstract void mo7902J7();

    /* renamed from: K7 */
    public abstract void mo7903K7();

    /* renamed from: L7 */
    public void mo7904L7(Intent intent, Context context) {
    }

    /* renamed from: M7 */
    public abstract boolean mo7905M7(AdapterView<?> adapterView, View view, int i, long j);

    /* renamed from: N7 */
    public abstract void mo7906N7(AdapterView<?> adapterView, View view, int i, long j);

    /* renamed from: O7 */
    public void mo7907O7(Intent intent, Context context) {
    }

    /* renamed from: P7 */
    public void mo7912P7(Intent intent) {
        intent.putExtra("already_select_contact", (String[]) this.f24544d.toArray(new String[0]));
        intent.putExtra("privacy_del_tips", this.f24556s);
        intent.putExtra("privacy_source_type", this.f24547g.mo7911v());
    }

    /* renamed from: Q7 */
    public void mo7913Q7() {
        if (this.f24563z) {
            this.f24563z = false;
            Toast.makeText(this, getString(C0966R.string.hme), 0).show();
        }
        if (this.f24540A) {
            this.f24540A = false;
            Toast.makeText(this, getString(C0966R.string.hmf), 0).show();
        }
    }

    /* renamed from: R7 */
    public void mo7914R7() {
        if (this.f24563z) {
            this.f24563z = false;
            Toast.makeText(this, getString(C0966R.string.f7445gg), 0).show();
        }
        if (this.f24540A) {
            this.f24540A = false;
            Toast.makeText(this, getString(C0966R.string.f7448gj), 0).show();
        }
    }

    /* renamed from: S7 */
    public void mo7915S7() {
        this.f24551n.setFixedContactCount(this.f24547g.mo7934u());
        boolean z = false;
        this.f24548h.setVisibility(this.f24547g.mo7934u() == 0 ? 0 : 8);
        Button button = this.f24554q;
        if (this.f24547g.mo7934u() > 0) {
            z = true;
        }
        button.setEnabled(z);
    }

    /* renamed from: T7 */
    public synchronized void mo7916T7() {
        this.f24541B.removeCallbacksAndMessages((Object) null);
        this.f24541B.post(this.f24542C);
    }

    /* renamed from: U7 */
    public synchronized void mo7917U7() {
        this.f24541B.removeCallbacksAndMessages((Object) null);
        this.f24541B.postDelayed(this.f24542C, 350);
    }

    /* renamed from: V7 */
    public void mo7918V7() {
    }

    /* renamed from: W7 */
    public void mo7908W7() {
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        return this.f24546f;
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnp;
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r9 != 6) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r9 != 6) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 != r0) goto L_0x0114
            if (r10 != 0) goto L_0x000a
            goto L_0x0114
        L_0x000a:
            f40.j r9 = f40.C86709a0.m107531m()
            j40.a r9 = r9.mo58407a()
            j40.b r9 = (j40.C87829b) r9
            boolean r9 = r9.mo71804b()
            r1 = 6
            r2 = 4
            r3 = 1
            r4 = 0
            if (r9 == 0) goto L_0x002f
            ob0.b0 r9 = f40.C86709a0.m107524d()
            int r9 = r9.mo123467m()
            if (r9 == r2) goto L_0x002d
            if (r9 != r1) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r9 = 0
            goto L_0x0041
        L_0x002d:
            r9 = 1
            goto L_0x0041
        L_0x002f:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r9)
            if (r9 == 0) goto L_0x003b
            r9 = 6
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r9 == r2) goto L_0x002d
            if (r9 != r1) goto L_0x002b
            goto L_0x002d
        L_0x0041:
            if (r9 != 0) goto L_0x004e
            r8 = 2131838097(0x7f114491, float:1.9309408E38)
            android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r7, (int) r8, (int) r4)
            r8.show()
            return
        L_0x004e:
            r9 = 2
            if (r8 != r9) goto L_0x0055
            r7.mo7907O7(r10, r7)
            return
        L_0x0055:
            r1 = 3
            if (r8 == r3) goto L_0x005e
            if (r8 == r1) goto L_0x005e
            if (r8 != r2) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            return
        L_0x005e:
            r7.mo7904L7(r10, r7)
            if (r8 != r3) goto L_0x0114
            int r8 = r7.f24557t
            if (r8 > 0) goto L_0x0070
            java.lang.String r8 = "show_all_select_contact_count"
            int r8 = r10.getIntExtra(r8, r4)
            r7.f24557t = r8
        L_0x0070:
            com.tencent.mm.autogen.mmdata.rpt.ContactsAuthorityManageOperateLogStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.ContactsAuthorityManageOperateLogStruct
            r8.<init>()
            com.tencent.mm.ui.contact.privacy.ContactMgrUIBase$k r5 = r7.f24547g
            java.lang.String r5 = r5.mo7911v()
            java.lang.String r6 = "@sns.black.android"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0085
            r2 = 2
            goto L_0x00c1
        L_0x0085:
            java.lang.String r6 = "@sns.unlike.android"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x008f
            r2 = 2
            goto L_0x00b5
        L_0x008f:
            java.lang.String r6 = "@werun.black.android"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x009a
            r3 = 5
        L_0x0098:
            r0 = 0
            goto L_0x00ce
        L_0x009a:
            java.lang.String r6 = "@tophistory.black.android"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00a3
            goto L_0x00c1
        L_0x00a3:
            java.lang.String r6 = "@tophistory.unlike.android"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00ac
            goto L_0x00b5
        L_0x00ac:
            java.lang.String r2 = "@finder.block.his.liked.android"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x00b8
            r2 = 3
        L_0x00b5:
            r3 = r2
            r0 = 2
            goto L_0x00ce
        L_0x00b8:
            java.lang.String r9 = "@finder.block.my.liked.android"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x00c4
            r2 = 3
        L_0x00c1:
            r3 = r2
            r0 = 1
            goto L_0x00ce
        L_0x00c4:
            java.lang.String r9 = "@social.black.android"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x00cd
            goto L_0x0098
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            r1 = 1
            r8.f9654d = r1
            long r3 = (long) r3
            r8.f9655e = r3
            long r3 = (long) r0
            r8.f9656f = r3
            r8.f9657g = r1
            r0 = 0
            r8.f9658h = r0
            int r9 = r7.f24557t
            java.util.List<java.lang.String> r0 = r7.f24544d
            int r0 = r0.size()
            int r9 = r9 - r0
            long r0 = (long) r9
            r8.f9659i = r0
            java.lang.String r9 = "Select_Contact"
            java.lang.String r9 = r10.getStringExtra(r9)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x0109
            java.lang.String r10 = ","
            java.lang.String[] r9 = r9.split(r10)
            java.util.ArrayList r9 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r9)
            if (r9 == 0) goto L_0x0109
            int r9 = r9.size()
            long r9 = (long) r9
            r8.f9661k = r9
        L_0x0109:
            int r9 = r7.f24557t
            long r9 = (long) r9
            r8.f9660j = r9
            r8.mo86054n()
            u73.C22613h1.m26490p(r8)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(mo7901I7());
        this.f24546f = (ListView) findViewById(C0966R.C0970id.gri);
        setToTop(new C6904c());
        this.f24548h = (TextView) findViewById(C0966R.C0970id.cja);
        this.f24549i = (TextView) findViewById(C0966R.C0970id.f357564ai3);
        this.f24547g = mo7900H7(this);
        this.f24550j = findViewById(C0966R.C0970id.j67);
        String stringExtra = getIntent().getStringExtra("intent_status_show_bottom_tips");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f24549i.setText(stringExtra);
            this.f24549i.setVisibility(0);
        } else {
            this.f24549i.setVisibility(8);
        }
        this.f24546f.setOnItemClickListener(new C6905d());
        this.f24546f.setOnItemLongClickListener(new C6906e());
        this.f24546f.setOnTouchListener(new C6909f());
        this.f24546f.setAdapter(this.f24547g);
        ListView listView = this.f24546f;
        ContactCountView contactCountView = new ContactCountView(this);
        this.f24551n = contactCountView;
        listView.addFooterView(contactCountView, (Object) null, false);
        this.f24551n.setVisible(false);
        ((SelectMemberScrollBar) findViewById(C0966R.C0970id.grk)).setOnScrollBarTouchListener(new C6910g());
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.j_b);
        this.f24552o = mMEditText;
        mMEditText.addTextChangedListener(new C6911h());
        View view = this.f24550j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/contact/privacy/ContactMgrUIBase", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f24553p = (Button) findViewById(C0966R.C0970id.f5585j3);
        this.f24554q = (Button) findViewById(C0966R.C0970id.f358490ff2);
        Button button = (Button) findViewById(C0966R.C0970id.c0a);
        this.f24555r = button;
        button.setEnabled(false);
        this.f24553p.setVisibility(0);
        this.f24554q.setVisibility(0);
        this.f24555r.setVisibility(8);
        this.f24553p.setOnClickListener(new C6913i());
        this.f24554q.setOnClickListener(new C6914j());
        setBackBtn(new C6902a());
        mo7915S7();
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(3990, this);
    }

    public void onDestroy() {
        this.f24543D.mo9468c();
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(3990, this);
        this.f24547g.mo7851i();
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.ContactMgrUIBase", "onNotifyChange: event = " + i + " stg = " + mStorageEx + " obj = " + obj);
        if (i == 4) {
            mo7917U7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ContactMgrUIBase", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + ", scene type = " + yVar.getType());
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        return ((LinkedList) this.f24547g.f24583r).contains(((C75939h) bVar).f222602y);
    }
}
