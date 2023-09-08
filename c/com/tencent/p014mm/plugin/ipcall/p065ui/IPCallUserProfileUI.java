package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76875f0;
import p196ln.C76708i;
import p447aw.C103918d;
import p629ny.C76979h;
import q12.C12029d;
import qo3.C77407n;
import s12.C13612c;
import s12.C13614k;
import s12.C13615l;
import t12.C110899d;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI */
public class IPCallUserProfileUI extends MMActivity {

    /* renamed from: B */
    public static final /* synthetic */ int f19615B = 0;

    /* renamed from: A */
    public C12029d f19616A = new C12029d();

    /* renamed from: d */
    public ImageView f19617d;

    /* renamed from: e */
    public TextView f19618e;

    /* renamed from: f */
    public TextView f19619f;

    /* renamed from: g */
    public LinearLayout f19620g;

    /* renamed from: h */
    public LinearLayout f19621h;

    /* renamed from: i */
    public TextView f19622i;

    /* renamed from: j */
    public TextView f19623j;

    /* renamed from: n */
    public TextView f19624n;

    /* renamed from: o */
    public TextView f19625o;

    /* renamed from: p */
    public TextView f19626p;

    /* renamed from: q */
    public Button f19627q;

    /* renamed from: r */
    public String f19628r;

    /* renamed from: s */
    public String f19629s;

    /* renamed from: t */
    public String f19630t;

    /* renamed from: u */
    public String f19631u;

    /* renamed from: v */
    public Bitmap f19632v;

    /* renamed from: w */
    public boolean f19633w;

    /* renamed from: x */
    public boolean f19634x = false;

    /* renamed from: y */
    public Cursor f19635y = null;

    /* renamed from: z */
    public boolean f19636z = false;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI$a */
    public class C4668a implements View.OnClickListener {
        public C4668a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(IPCallUserProfileUI.this, IPCallAllRecordUI.class);
            if (!Util.isNullOrNil(IPCallUserProfileUI.this.f19630t)) {
                intent.putExtra("IPCallAllRecordUI_contactId", IPCallUserProfileUI.this.f19630t);
            } else if (!Util.isNullOrNil(IPCallUserProfileUI.this.f19631u)) {
                intent.putExtra("IPCallAllRecordUI_phoneNumber", IPCallUserProfileUI.this.f19631u);
            }
            intent.putExtra("IPCallAllRecordUI_isSinglePhoneNumber", IPCallUserProfileUI.this.f19634x);
            IPCallUserProfileUI iPCallUserProfileUI = IPCallUserProfileUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            IPCallUserProfileUI iPCallUserProfileUI2 = iPCallUserProfileUI;
            C117292a.m165358d(iPCallUserProfileUI2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallUserProfileUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(iPCallUserProfileUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI$b */
    public class C4669b implements MenuItem.OnMenuItemClickListener {
        public C4669b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallUserProfileUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI$c */
    public class C4670c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f19639d;

        public C4670c(String str) {
            this.f19639d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            IPCallUserProfileUI.m4932H7(IPCallUserProfileUI.this, this.f19639d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI$d */
    public class C4671d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f19641d;

        public C4671d(TextView textView) {
            this.f19641d = textView;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            IPCallUserProfileUI iPCallUserProfileUI = IPCallUserProfileUI.this;
            TextView textView = this.f19641d;
            int i = IPCallUserProfileUI.f19615B;
            iPCallUserProfileUI.getClass();
            LayoutInflater.from(iPCallUserProfileUI);
            C77407n nVar = new C77407n((Context) iPCallUserProfileUI, 1, false);
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            C4727w1 w1Var = new C4727w1(iPCallUserProfileUI);
            C4731x1 x1Var = new C4731x1(iPCallUserProfileUI, textView);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList2.clear();
            C76874e0 e0Var = new C76874e0(iPCallUserProfileUI);
            w1Var.onCreateMMMenu(e0Var);
            if (e0Var.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = w1Var;
                nVar.f225782p = x1Var;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m4932H7(IPCallUserProfileUI iPCallUserProfileUI, String str) {
        iPCallUserProfileUI.getClass();
        if (C110899d.m151189c(iPCallUserProfileUI)) {
            Intent intent = new Intent(iPCallUserProfileUI, IPCallDialUI.class);
            if (iPCallUserProfileUI.f19636z) {
                intent.putExtra("IPCallTalkUI_dialScene", 4);
                C115669n.INSTANCE.mo160131h(12059, 0, 0, 0, 0, 4);
            } else {
                intent.putExtra("IPCallTalkUI_dialScene", 2);
                C115669n.INSTANCE.mo160131h(12059, 0, 0, 0, 0, 2);
            }
            intent.putExtra("IPCallTalkUI_contactId", iPCallUserProfileUI.f19630t);
            intent.putExtra("IPCallTalkUI_nickname", iPCallUserProfileUI.f19628r);
            intent.putExtra("IPCallTalkUI_phoneNumber", C110899d.m151196j(str));
            intent.putExtra("IPCallTalkUI_toWechatUsername", iPCallUserProfileUI.f19629s);
            iPCallUserProfileUI.startActivityForResult(intent, 1001);
            iPCallUserProfileUI.f19633w = true;
        }
    }

    /* renamed from: I7 */
    public final void mo5562I7() {
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.bor, this.f19621h, false);
        this.f19621h.addView(inflate);
        inflate.setOnClickListener(new C4668a());
    }

    /* renamed from: J7 */
    public final void mo5563J7(String str, int i, boolean z) {
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.boo, this.f19620g, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.fp9);
        if (!z) {
            linearLayout.setBackgroundDrawable((Drawable) null);
        } else {
            linearLayout.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.bcr));
        }
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.hvq);
        textView.setText(C13818a.m13108d(C110899d.m151196j(str)));
        ((TextView) inflate.findViewById(C0966R.C0970id.hvr)).setText(C13818a.m13119o(i));
        inflate.setClickable(true);
        inflate.setOnClickListener(new C4670c(str));
        inflate.setOnLongClickListener(new C4671d(textView));
        this.f19620g.addView(inflate);
    }

    /* renamed from: K7 */
    public final void mo5564K7(C13614k kVar, boolean z, int i) {
        if (kVar != null) {
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.boq, this.f19621h, false);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.i6g);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.i6j);
            ((TextView) inflate.findViewById(C0966R.C0970id.i6i)).setText(C13818a.m13108d(kVar.field_phonenumber));
            long j = kVar.field_duration;
            if (j > 0) {
                textView2.setText(C110899d.m151187a(j));
            } else {
                textView2.setText(C110899d.m151195i(kVar.field_status));
            }
            textView.setText(C110899d.m151188b(kVar.field_calltime));
            if (z) {
                inflate.setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.amr));
                int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.ajy);
                inflate.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            if (1 == i) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
                layoutParams.height = C76577a.m92157h(getContext(), C0966R.dimen.aj5);
                inflate.setLayoutParams(layoutParams);
            }
            this.f19621h.addView(inflate);
        }
    }

    /* renamed from: L7 */
    public final void mo5565L7() {
        Cursor cursor;
        C13612c qq;
        if (!this.f19636z) {
            this.f19621h.setVisibility(8);
            this.f19625o.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f19630t)) {
            String str = this.f19630t;
            cursor = null;
            if (!Util.isNullOrNil(str) && (qq = C105385g.vx0().mo13010qq(str)) != null) {
                long j = qq.systemRowid;
                if (j != -1) {
                    ISQLiteDatabase iSQLiteDatabase = C105385g.Cx0().f38583d;
                    String[] strArr = C13615l.f38582f;
                    cursor = iSQLiteDatabase.query("IPCallRecord", strArr, "addressId=?", new String[]{j + ""}, (String) null, (String) null, "calltime desc limit 4");
                }
            }
        } else {
            cursor = C105385g.Cx0().f38583d.query("IPCallRecord", C13615l.f38582f, "phonenumber=?", new String[]{this.f19631u}, (String) null, (String) null, "calltime desc limit 4");
        }
        if (cursor == null || cursor.getCount() <= 0) {
            this.f19621h.setVisibility(8);
            this.f19625o.setVisibility(8);
            return;
        }
        try {
            if (cursor.moveToFirst()) {
                int i = 0;
                while (true) {
                    if (cursor.isAfterLast()) {
                        break;
                    }
                    C13614k kVar = new C13614k();
                    kVar.convertFrom(cursor);
                    i++;
                    boolean z = i >= 3;
                    mo5564K7(kVar, z, cursor.getCount());
                    if (z) {
                        break;
                    }
                    cursor.moveToNext();
                }
                if (i <= 0) {
                    this.f19621h.setVisibility(8);
                } else if (cursor.getCount() >= 4) {
                    mo5562I7();
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallUserProfileUI", "initRecordList, error: %s", e.getMessage());
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
        cursor.close();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2c;
    }

    public final void init() {
        setMMTitle((int) C0966R.string.fuv);
        this.f19617d = (ImageView) findViewById(C0966R.C0970id.a27);
        this.f19618e = (TextView) findViewById(C0966R.C0970id.kbk);
        this.f19619f = (TextView) findViewById(C0966R.C0970id.f359581lo0);
        this.f19620g = (LinearLayout) findViewById(C0966R.C0970id.i67);
        this.f19622i = (TextView) findViewById(C0966R.C0970id.i66);
        this.f19624n = (TextView) findViewById(C0966R.C0970id.i65);
        this.f19623j = (TextView) findViewById(C0966R.C0970id.i64);
        this.f19621h = (LinearLayout) findViewById(C0966R.C0970id.i6h);
        this.f19625o = (TextView) findViewById(C0966R.C0970id.iia);
        this.f19626p = (TextView) findViewById(C0966R.C0970id.f94);
        this.f19627q = (Button) findViewById(C0966R.C0970id.i59);
        this.f19630t = getIntent().getStringExtra("IPCallProfileUI_contactid");
        this.f19628r = getIntent().getStringExtra("IPCallProfileUI_systemUsername");
        this.f19629s = getIntent().getStringExtra("IPCallProfileUI_wechatUsername");
        this.f19631u = getIntent().getStringExtra("IPCallProfileUI_phonenumber");
        this.f19636z = getIntent().getBooleanExtra("IPCallProfileUI_isNeedShowRecord", false);
        if (!Util.isNullOrNil(this.f19630t)) {
            Bitmap e = C13818a.m13109e(this, this.f19630t, false);
            this.f19632v = e;
            if (e != null) {
                this.f19617d.setImageBitmap(e);
            }
        }
        if (this.f19632v == null && !Util.isNullOrNil(this.f19629s)) {
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f19629s);
            this.f19632v = N50;
            if (N50 != null) {
                this.f19617d.setImageBitmap(N50);
            }
        }
        if (!Util.isNullOrNil(this.f19628r)) {
            this.f19618e.setText(this.f19628r);
        } else if (!Util.isNullOrNil(this.f19631u)) {
            this.f19618e.setText(C13818a.m13108d(this.f19631u));
        }
        if (Util.isNullOrNil(this.f19629s) || this.f19629s.endsWith("@stranger")) {
            this.f19619f.setVisibility(8);
        } else {
            this.f19619f.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.fuw, new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f19629s)})));
        }
        if (!Util.isNullOrNil(this.f19630t)) {
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(this, "android.permission.READ_CONTACTS")) {
                Log.m105920e("MicroMsg.IPCallUserProfileUI", "no contact permission");
                return;
            }
            Cursor query = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id=?", new String[]{this.f19630t}, (String) null);
            this.f19635y = query;
            this.f19634x = query.getCount() <= 1;
        }
        mo5565L7();
        this.f19624n.setVisibility(8);
        this.f19623j.setVisibility(8);
        this.f19622i.setVisibility(8);
        this.f19627q.setVisibility(8);
        this.f19626p.setVisibility(8);
        if (!Util.isNullOrNil(this.f19629s) && !Util.isNullOrNil(this.f19628r)) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f19629s);
            if (z1Var != null && !z1Var.mo62927s3()) {
                this.f19627q.setOnClickListener(new C4734y1(this));
                this.f19627q.setText(C0966R.string.fuo);
                this.f19627q.setVisibility(0);
            }
        } else if (!Util.isNullOrNil(this.f19630t) && !Util.isNullOrNil(this.f19628r)) {
            this.f19627q.setOnClickListener(new C4739z1(this));
            this.f19627q.setText(C0966R.string.fut);
        } else if (!Util.isNullOrNil(this.f19631u)) {
            this.f19623j.setVisibility(0);
            this.f19624n.setVisibility(0);
            Context context = MMApplicationContext.getContext();
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("phone", "10086");
            if (Util.isIntentAvailable(context, intent, false)) {
                this.f19622i.setVisibility(0);
            }
            this.f19622i.setOnClickListener(new C4673a2(this));
            this.f19623j.setOnClickListener(new C4675b2(this));
            this.f19624n.setOnClickListener(new C4724v1(this));
            this.f19627q.setOnClickListener(new C4739z1(this));
            this.f19627q.setText(C0966R.string.fut);
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = this.f19635y;
        if (cursor == null || cursor.getCount() <= 0) {
            this.f19620g.setVisibility(8);
            return;
        }
        try {
            if (this.f19635y.moveToFirst()) {
                int i = 0;
                while (!this.f19635y.isAfterLast()) {
                    i++;
                    Cursor cursor2 = this.f19635y;
                    String string = cursor2.getString(cursor2.getColumnIndex("data1"));
                    Cursor cursor3 = this.f19635y;
                    int i2 = cursor3.getInt(cursor3.getColumnIndex("data2"));
                    if (!arrayList.contains(string)) {
                        arrayList.add(string);
                        if (i == this.f19635y.getCount()) {
                            mo5563J7(string, i2, false);
                        } else {
                            mo5563J7(string, i2, true);
                        }
                    }
                    this.f19635y.moveToNext();
                }
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.IPCallUserProfileUI", "initPhoneNumberList error: %s", e2.getMessage());
        } catch (Throwable th) {
            this.f19635y.close();
            throw th;
        }
        this.f19635y.close();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(12061, 0, 1, 0, 0, 0, 0);
        setBackBtn(new C4669b());
        init();
    }

    public void onResume() {
        super.onResume();
        if (this.f19633w) {
            this.f19633w = false;
            this.f19621h.removeAllViews();
            mo5565L7();
        }
    }
}
