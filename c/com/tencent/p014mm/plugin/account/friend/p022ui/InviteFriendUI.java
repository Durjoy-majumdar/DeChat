package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.QMessageOperationEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.friend.p022ui.C104708c;
import com.tencent.p014mm.plugin.account.friend.p022ui.C104710d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import hg0.C46064t0;
import hg0.C46065v;
import hg0.C46067w;
import hg0.C76166a;
import hg0.C76168b;
import ig0.C108459j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import mg0.C76754b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p755xs.C102720b;
import p823sg.C77710q;
import p823sg.C90193h;
import p910lj.C76701a;
import qo3.C77407n;
import wc3.C15131b;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI */
public class InviteFriendUI extends MMActivity implements C10579k.C10580a {

    /* renamed from: d */
    public int f196594d;

    /* renamed from: e */
    public String f196595e;

    /* renamed from: f */
    public String f196596f;

    /* renamed from: g */
    public String f196597g;

    /* renamed from: h */
    public String f196598h;

    /* renamed from: i */
    public ImageView f196599i;

    /* renamed from: j */
    public Button f196600j;

    /* renamed from: n */
    public int f196601n;

    /* renamed from: o */
    public int f196602o;

    /* renamed from: p */
    public String f196603p = null;

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$b */
    public class C68420b implements View.OnClickListener {
        public C68420b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            QMessageOperationEvent qMessageOperationEvent = new QMessageOperationEvent();
            QMessageOperationEvent.C67762a aVar = qMessageOperationEvent.f193849d;
            aVar.f193851a = 0;
            aVar.f193852b = InviteFriendUI.this.f196595e + "@qqim";
            qMessageOperationEvent.f193849d.f193853c = InviteFriendUI.this.f196596f;
            qMessageOperationEvent.publish();
            qMessageOperationEvent.f193850e.getClass();
            InviteFriendUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$c */
    public class C68421c implements MenuItem.OnMenuItemClickListener {
        public C68421c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            InviteFriendUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$a */
    public class C68422a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$a$c */
        public class C68423c implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ HashMap f196607d;

            /* renamed from: e */
            public final /* synthetic */ Uri f196608e;

            /* renamed from: f */
            public final /* synthetic */ String f196609f;

            public C68423c(HashMap hashMap, Uri uri, String str) {
                this.f196607d = hashMap;
                this.f196608e = uri;
                this.f196609f = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str = menuItem.getTitle() + "";
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(((ResolveInfo) this.f196607d.get(str)).activityInfo.packageName, ((ResolveInfo) this.f196607d.get(str)).activityInfo.name));
                intent.setAction("android.intent.action.SENDTO");
                intent.setData(this.f196608e);
                intent.putExtra("sms_body", this.f196609f);
                InviteFriendUI inviteFriendUI = InviteFriendUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                InviteFriendUI inviteFriendUI2 = inviteFriendUI;
                C117292a.m165358d(inviteFriendUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                inviteFriendUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(inviteFriendUI2, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$a$a */
        public class C68424a implements C47268j0 {

            /* renamed from: a */
            public final /* synthetic */ HashMap f196611a;

            /* renamed from: b */
            public final /* synthetic */ PackageManager f196612b;

            public C68424a(C68422a aVar, HashMap hashMap, PackageManager packageManager) {
                this.f196611a = hashMap;
                this.f196612b = packageManager;
            }

            /* renamed from: a */
            public void mo7130a(TextView textView, MenuItem menuItem) {
                CharSequence loadLabel = ((ResolveInfo) this.f196611a.get(menuItem.getTitle() + "")).loadLabel(this.f196612b);
                if (loadLabel != null) {
                    textView.setText(loadLabel.toString());
                } else {
                    textView.setText("");
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$a$b */
        public class C68425b implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ HashMap f196613d;

            public C68425b(C68422a aVar, HashMap hashMap) {
                this.f196613d = hashMap;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                for (String add : this.f196613d.keySet()) {
                    e0Var.add((CharSequence) add);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$a$d */
        public class C68426d implements C104708c.C104709a {
            public C68426d() {
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.friend.ui.InviteFriendUI$a$e */
        public class C68427e implements C104710d.C104712b {
            public C68427e() {
            }
        }

        public C68422a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            InviteFriendUI inviteFriendUI = InviteFriendUI.this;
            int i = inviteFriendUI.f196594d;
            if (i == 0) {
                int[] iArr = {C77710q.m93739b(inviteFriendUI.f196595e)};
                C104708c cVar = new C104708c(InviteFriendUI.this, new C68426d());
                C86709a0.m107524d().mo123455a(116, cVar);
                C46064t0 t0Var = new C46064t0(iArr);
                C86709a0.m107524d().mo123460f(t0Var);
                Context context = cVar.f310950d;
                cVar.f310952f = C76879j.m92723Q(context, context.getString(C0966R.string.fsb), cVar.f310950d.getString(C0966R.string.fs_), true, true, new C104706a(cVar, t0Var));
            } else if (i == 1) {
                String str = (String) C86709a0.m107535s().mo121142i().mo119684e(42, "");
                if (str == null || str.length() == 0) {
                    str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
                }
                String string = InviteFriendUI.this.getString(C0966R.string.fs7, new Object[]{str});
                Uri parse = Uri.parse("smsto:" + InviteFriendUI.this.f196595e);
                Intent intent = new Intent("android.intent.action.SENDTO", parse);
                intent.putExtra("sms_body", string);
                PackageManager packageManager = InviteFriendUI.this.getPackageManager();
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                HashMap hashMap = new HashMap();
                if (queryIntentActivities != null) {
                    for (ResolveInfo next : queryIntentActivities) {
                        if (!next.activityInfo.packageName.equals("com.whatsapp")) {
                            hashMap.put(next.activityInfo.name, next);
                        }
                    }
                }
                if (hashMap.size() == 1) {
                    Iterator it = hashMap.keySet().iterator();
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName(((ResolveInfo) hashMap.get(str2)).activityInfo.packageName, ((ResolveInfo) hashMap.get(str2)).activityInfo.name));
                        intent2.setAction("android.intent.action.SENDTO");
                        intent2.setData(parse);
                        intent2.putExtra("sms_body", string);
                        InviteFriendUI inviteFriendUI2 = InviteFriendUI.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent2);
                        InviteFriendUI inviteFriendUI3 = inviteFriendUI2;
                        C117292a.m165358d(inviteFriendUI3, aVar.mo10232b(), "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        inviteFriendUI2.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(inviteFriendUI3, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        InviteFriendUI.m80743H7(InviteFriendUI.this);
                    }
                } else if (hashMap.size() > 1) {
                    InviteFriendUI inviteFriendUI4 = InviteFriendUI.this;
                    LayoutInflater.from(inviteFriendUI4);
                    C77407n nVar = new C77407n((Context) inviteFriendUI4, 1, false);
                    ArrayList arrayList2 = new ArrayList();
                    new ArrayList();
                    C68424a aVar2 = new C68424a(this, hashMap, packageManager);
                    C68425b bVar = new C68425b(this, hashMap);
                    C68423c cVar2 = new C68423c(hashMap, parse, string);
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        C76875f0 f0Var = (C76875f0) ((MenuItem) it4.next());
                        f0Var.f224728w = null;
                        f0Var.f224729x = null;
                    }
                    arrayList2.clear();
                    C76874e0 e0Var = new C76874e0(inviteFriendUI4);
                    bVar.onCreateMMMenu(e0Var);
                    if (e0Var.mo107176v()) {
                        Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                    } else {
                        nVar.f225771i = bVar;
                        nVar.f225782p = cVar2;
                        nVar.f225761d = null;
                        nVar.f225725D = aVar2;
                        nVar.mo107573q();
                    }
                    InviteFriendUI.m80743H7(InviteFriendUI.this);
                } else {
                    C76701a.makeText((Context) InviteFriendUI.this, (int) C0966R.string.ik8, 1).show();
                }
            } else if (i == 2) {
                C104710d dVar = new C104710d(inviteFriendUI, new C68427e());
                String str3 = inviteFriendUI.f196597g;
                String str4 = inviteFriendUI.f196595e;
                C86709a0.m107524d().mo123455a(489, dVar);
                Cursor qq = ((C46067w) ((C76754b) C86312j.m106911c(C76754b.class)).mo105746fv()).mo71486qq(str3);
                if (qq == null || qq.getCount() <= 1) {
                    dVar.mo148364a(str4);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    qq.moveToFirst();
                    int count = qq.getCount();
                    for (int i2 = 0; i2 < count; i2++) {
                        C46065v vVar = new C46065v();
                        vVar.convertFrom(qq);
                        arrayList3.add(vVar.field_googlegmail);
                        arrayList4.add(Integer.valueOf(i2));
                        arrayList5.add(vVar);
                        qq.moveToNext();
                    }
                    arrayList4.add(-1);
                    Context context2 = dVar.f310953d;
                    C76879j.m92731b(context2, context2.getResources().getString(C0966R.string.fdm), arrayList3, arrayList4, (String) null, dVar.f310953d.getResources().getString(C0966R.string.f7926wf), true, new C108459j(dVar, arrayList5), (DialogInterface.OnCancelListener) null);
                }
                if (qq != null) {
                    qq.close();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m80743H7(InviteFriendUI inviteFriendUI) {
        int i = inviteFriendUI.f196601n;
        if (i > 0 && inviteFriendUI.f196602o > 0) {
            C115669n.INSTANCE.mo160131h(10991, Integer.valueOf(i), 7, Integer.valueOf(inviteFriendUI.f196602o));
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        Class cls = C76708i.class;
        String str2 = this.f196595e;
        if (str2 != null && !str2.equals("")) {
            long kw02 = ((C76708i) C86312j.m106911c(cls)).kw0(str);
            if (kw02 > 0) {
                String str3 = this.f196595e;
                if (str3.equals("" + kw02) && this.f196594d == 0) {
                    this.f196599i.setImageBitmap(((C76708i) C86312j.m106911c(cls)).N50(str));
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b1t;
    }

    public void initView() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Class cls = C76708i.class;
        Class cls2 = C76706g.class;
        this.f196599i = (ImageView) findViewById(C0966R.C0970id.f8v);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358460f90);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.f358462f92);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.f358461f91);
        this.f196600j = (Button) findViewById(C0966R.C0970id.f8y);
        Button button = (Button) findViewById(C0966R.C0970id.f358463f93);
        textView.setText(this.f196596f);
        textView3.setText(getString(C0966R.string.frp, new Object[]{this.f196596f}));
        Bitmap bitmap3 = null;
        if (this.f196594d == 1) {
            this.f196599i.setBackgroundDrawable(C76577a.m92158i(this, C0966R.raw.default_mobile_avatar));
            textView2.setText(getString(C0966R.string.f7981y9) + this.f196595e);
            String f = C90193h.m112878f(this.f196595e.getBytes());
            if (!C86709a0.m107535s().mo121147n()) {
                bitmap2 = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93560i(MMApplicationContext.getContext());
            } else {
                C76166a b = ((C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50()).mo106402b(f);
                if (b != null) {
                    String str = b.f223115c;
                    if (str == null) {
                        str = "";
                    }
                    bitmap2 = C15131b.m14238b(str, this, false);
                } else {
                    bitmap2 = null;
                }
            }
            if (bitmap2 != null) {
                this.f196599i.setImageBitmap(bitmap2);
            } else {
                this.f196599i.setImageDrawable(C76577a.m92158i(this, C0966R.raw.default_mobile_avatar));
            }
        }
        if (this.f196594d == 0) {
            this.f196599i.setBackgroundDrawable(C76577a.m92158i(this, C0966R.raw.default_qq_avatar));
            textView2.setText(getString(C0966R.string.f7986ye) + this.f196595e);
            long b2 = (long) C77710q.m93739b(this.f196595e);
            if (b2 != 0) {
                bitmap3 = ((C76708i) C86312j.m106911c(cls)).mo106821HB(b2);
            }
            if (bitmap3 == null) {
                this.f196599i.setImageDrawable(C76577a.m92158i(this, C0966R.raw.default_qq_avatar));
            } else {
                this.f196599i.setImageBitmap(bitmap3);
            }
            button.setVisibility(0);
        }
        if (this.f196594d == 2) {
            this.f196600j.setText(C0966R.string.fdn);
            this.f196599i.setBackgroundDrawable(C76577a.m92158i(this, C0966R.C0969drawable.bfc));
            textView2.setText(getString(C0966R.string.f7971xx) + this.f196595e);
            if (!C86709a0.m107535s().mo121147n()) {
                bitmap = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls2)).mo106826RE()).mo93560i(MMApplicationContext.getContext());
            } else {
                bitmap = ((C76708i) C86312j.m106911c(cls)).mo106844mR(this.f196597g);
            }
            if (bitmap != null) {
                this.f196599i.setImageBitmap(bitmap);
            } else {
                this.f196599i.setImageDrawable(C76577a.m92158i(this, C0966R.C0969drawable.bfc));
            }
            if (TextUtils.isEmpty(this.f196596f)) {
                textView.setText(Util.subStringEmail(this.f196595e));
                textView3.setText(getString(C0966R.string.frp, new Object[]{Util.subStringEmail(this.f196595e)}));
            }
        }
        if (this.f196594d == 3) {
            this.f196600j.setText(C0966R.string.fro);
            C102720b bVar = (C102720b) C86312j.m106911c(C102720b.class);
            String str2 = this.f196603p;
            Bitmap N6 = bVar.mo142104N6(bVar.mo142106PK(str2, str2, 0, 0));
            if (N6 != null) {
                this.f196599i.setImageBitmap(N6);
            } else {
                this.f196599i.setImageResource(C0966R.raw.default_avatar);
            }
            button.setVisibility(8);
        }
        this.f196600j.setOnClickListener(new C68422a());
        button.setOnClickListener(new C68420b());
        setBackBtn(new C68421c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.frr);
        Intent intent = getIntent();
        this.f196594d = intent.getIntExtra("friend_type", -1);
        this.f196596f = intent.getStringExtra("friend_nick");
        this.f196595e = intent.getStringExtra("friend_num");
        this.f196597g = intent.getStringExtra("friend_googleID");
        this.f196598h = intent.getStringExtra("friend_googleItemID");
        this.f196595e = Util.nullAsNil(this.f196595e);
        intent.getStringExtra("friend_linkedInID");
        this.f196603p = intent.getStringExtra("friend_linkedInPicUrl");
        initView();
        this.f196601n = intent.getIntExtra("search_kvstat_scene", 0);
        this.f196602o = intent.getIntExtra("search_kvstat_position", 0);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).f195667a.remove(this);
    }

    public void onResume() {
        super.onResume();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93556a(this);
    }
}
