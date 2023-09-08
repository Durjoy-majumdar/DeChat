package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import xc0.C78795g;

/* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoViewUI */
public class ContactRemarkInfoViewUI extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f218579s = 0;

    /* renamed from: d */
    public TextView f218580d;

    /* renamed from: e */
    public TextView f218581e;

    /* renamed from: f */
    public ImageView f218582f;

    /* renamed from: g */
    public View f218583g;

    /* renamed from: h */
    public View f218584h;

    /* renamed from: i */
    public C72996z1 f218585i;

    /* renamed from: j */
    public String f218586j;

    /* renamed from: n */
    public int f218587n;

    /* renamed from: o */
    public String f218588o;

    /* renamed from: p */
    public String f218589p;

    /* renamed from: q */
    public String f218590q;

    /* renamed from: r */
    public boolean f218591r = false;

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoViewUI$a */
    public class C74387a implements View.OnClickListener {
        public C74387a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!ContactRemarkInfoViewUI.this.f218591r) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent(ContactRemarkInfoViewUI.this, ContactRemarkImagePreviewUI.class);
            intent.putExtra("Contact_User", ContactRemarkInfoViewUI.this.f218586j);
            intent.putExtra("remark_image_path", C78795g.m95196e().mo108705b(ContactRemarkInfoViewUI.this.f218586j));
            intent.putExtra("view_only", true);
            ContactRemarkInfoViewUI contactRemarkInfoViewUI = ContactRemarkInfoViewUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ContactRemarkInfoViewUI contactRemarkInfoViewUI2 = contactRemarkInfoViewUI;
            C117292a.m165358d(contactRemarkInfoViewUI2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            contactRemarkInfoViewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(contactRemarkInfoViewUI2, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoViewUI$b */
    public class C74388b implements MenuItem.OnMenuItemClickListener {
        public C74388b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.setClass(ContactRemarkInfoViewUI.this.getContext(), ContactRemarkInfoModUI.class);
            intent.putExtra("Contact_Scene", ContactRemarkInfoViewUI.this.f218587n);
            intent.putExtra("Contact_User", ContactRemarkInfoViewUI.this.f218585i.getUsername());
            ContactRemarkInfoViewUI contactRemarkInfoViewUI = ContactRemarkInfoViewUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ContactRemarkInfoViewUI contactRemarkInfoViewUI2 = contactRemarkInfoViewUI;
            C117292a.m165358d(contactRemarkInfoViewUI2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            contactRemarkInfoViewUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(contactRemarkInfoViewUI2, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoViewUI$c */
    public class C74389c implements MenuItem.OnMenuItemClickListener {
        public C74389c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactRemarkInfoViewUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public void mo103367H7() {
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f218586j);
        this.f218585i = z1Var;
        this.f218588o = z1Var.mo62898f();
        C72996z1 z1Var2 = this.f218585i;
        this.f218589p = z1Var2.f149513S0;
        this.f218590q = z1Var2.f149515T0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7092y0;
    }

    public void initView() {
        this.f218580d = (TextView) findViewById(C0966R.C0970id.bof);
        this.f218581e = (TextView) findViewById(C0966R.C0970id.bob);
        this.f218582f = (ImageView) findViewById(C0966R.C0970id.il4);
        this.f218583g = findViewById(C0966R.C0970id.bqc);
        this.f218584h = findViewById(C0966R.C0970id.bqd);
        setMMTitle((int) C0966R.string.boe);
        this.f218582f.setOnClickListener(new C74387a());
        addTextOptionMenu(0, getString(C0966R.string.f7956xe), new C74388b());
        setBackBtn(new C74389c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f218587n = getIntent().getIntExtra("Contact_Scene", 9);
        String stringExtra = getIntent().getStringExtra("Contact_User");
        this.f218586j = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            finish();
            return;
        }
        mo103367H7();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        mo103367H7();
        this.f218580d.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, Util.nullAsNil(this.f218588o), this.f218580d.getTextSize()));
        if (!Util.isNullOrNil(this.f218589p)) {
            View view = this.f218583g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f218581e.setText(Util.nullAsNil(this.f218589p));
        } else {
            View view2 = this.f218583g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!Util.isNullOrNil(this.f218590q)) {
            View view4 = this.f218584h;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!C78795g.m95196e().mo108709g(this.f218586j)) {
                C78795g e = C78795g.m95196e();
                String str = this.f218586j;
                String str2 = this.f218590q;
                C74539p0 p0Var = new C74539p0(this);
                e.getClass();
                if (!Util.isNullOrNil(str2) && !e.mo108709g(str)) {
                    QueueWorkerThread queueWorkerThread = e.f230548a;
                    if (queueWorkerThread == null || queueWorkerThread.isDead()) {
                        e.f230548a = new QueueWorkerThread(1, "download-remark-img", 1);
                    }
                    e.f230548a.add(new C78795g.C78797b(str, str2, p0Var));
                    return;
                }
                return;
            }
            Bitmap h = C78795g.m95196e().mo108710h(this.f218586j);
            if (h != null) {
                this.f218582f.setImageBitmap(h);
                this.f218591r = true;
                return;
            }
            return;
        }
        View view6 = this.f218584h;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/ui/contact/ContactRemarkInfoViewUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
