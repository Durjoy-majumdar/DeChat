package com.tencent.p014mm.p136ui.contact;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C11385n;
import p011cm.C39989b;
import qn3.C77382c;
import tc2.C118418g;
import wd3.C78553c1;

/* renamed from: com.tencent.mm.ui.contact.SayHiEditUI */
public class SayHiEditUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public MMEditText f218723d;

    /* renamed from: e */
    public ProgressDialog f218724e = null;

    /* renamed from: com.tencent.mm.ui.contact.SayHiEditUI$a */
    public class C74408a implements TextView.OnEditorActionListener {
        public C74408a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (4 != i && 66 != keyEvent.getAction()) {
                return false;
            }
            SayHiEditUI.m88926H7(SayHiEditUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SayHiEditUI$b */
    public class C74409b implements MenuItem.OnMenuItemClickListener {
        public C74409b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SayHiEditUI.this.hideVKB();
            SayHiEditUI.m88926H7(SayHiEditUI.this);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SayHiEditUI$c */
    public class C74410c implements MenuItem.OnMenuItemClickListener {
        public C74410c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SayHiEditUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SayHiEditUI$d */
    public static class C74411d implements TextWatcher {

        /* renamed from: d */
        public boolean f218728d = false;

        public C74411d(C74408a aVar) {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f218728d) {
                this.f218728d = true;
                C118418g.INSTANCE.B10(3, 2, 10);
            }
        }
    }

    /* renamed from: H7 */
    public static void m88926H7(SayHiEditUI sayHiEditUI) {
        sayHiEditUI.getClass();
        C118418g.INSTANCE.B10(2, 1, 5);
        String stringExtra = sayHiEditUI.getIntent().getStringExtra("Contact_User");
        int intExtra = sayHiEditUI.getIntent().getIntExtra("Contact_Scene", 18);
        String stringExtra2 = sayHiEditUI.getIntent().getStringExtra("AntispamTicket");
        LinkedList linkedList = new LinkedList();
        linkedList.add(stringExtra);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(Integer.valueOf(intExtra));
        LinkedList linkedList3 = new LinkedList();
        if (!Util.isNullOrNil(stringExtra2)) {
            linkedList3.add(stringExtra2);
        }
        String trim = sayHiEditUI.f218723d.getText().toString().trim();
        if (trim.length() > 50) {
            trim = trim.substring(0, 50);
        }
        C78553c1 c1Var = new C78553c1(sayHiEditUI.getContext(), (C39989b.C39992e) null);
        c1Var.f230112q = trim;
        c1Var.mo108533i(linkedList, linkedList2);
        sayHiEditUI.f218724e = C76879j.m92723Q(sayHiEditUI.getContext(), sayHiEditUI.getString(C0966R.string.a3h), sayHiEditUI.getString(C0966R.string.ilx), true, true, new C74515j3(sayHiEditUI, c1Var));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.btz;
    }

    public void initView() {
        MMEditText mMEditText = (MMEditText) findViewById(C0966R.C0970id.j0w);
        this.f218723d = mMEditText;
        mMEditText.requestFocus();
        this.f218723d.addTextChangedListener(new C74411d((C74408a) null));
        this.f218723d.setOnEditorActionListener(new C74408a());
        C77382c b = C77382c.m93286b(this.f218723d);
        b.f225611e = 0;
        b.f225610d = 100;
        b.mo107499d((C77382c.C77383a) null);
        addTextOptionMenu(0, getString(C0966R.string.a2s), new C74409b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C74410c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(30, this);
        setMMTitle((int) C0966R.string.h5w);
        initView();
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(30, this);
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[Catch:{ Exception -> 0x00a5 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059 A[Catch:{ Exception -> 0x00a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r6, int r7, java.lang.String r8, ob0.C117747y r9) {
        /*
            r5 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "onSceneEnd: errType = "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = " errCode = "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r0 = " errMsg = "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "MicroMsg.SayHiEditUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            android.app.ProgressDialog r9 = r5.f218724e     // Catch:{ Exception -> 0x00a5 }
            r1 = 0
            if (r9 == 0) goto L_0x0030
            r9.dismiss()     // Catch:{ Exception -> 0x00a5 }
            r5.f218724e = r1     // Catch:{ Exception -> 0x00a5 }
        L_0x0030:
            r9 = -34
            r2 = -24
            r3 = 0
            r4 = 1
            if (r7 == r9) goto L_0x004b
            if (r7 == r2) goto L_0x004b
            r9 = -22
            if (r7 == r9) goto L_0x0040
            r9 = 0
            goto L_0x0056
        L_0x0040:
            r9 = 2131833443(0x7f113263, float:1.9299968E38)
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r5, (int) r9, (int) r3)     // Catch:{ Exception -> 0x00a5 }
            r9.show()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x0055
        L_0x004b:
            r9 = 2131833446(0x7f113266, float:1.9299974E38)
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r5, (int) r9, (int) r3)     // Catch:{ Exception -> 0x00a5 }
            r9.show()     // Catch:{ Exception -> 0x00a5 }
        L_0x0055:
            r9 = 1
        L_0x0056:
            if (r9 == 0) goto L_0x0059
            return
        L_0x0059:
            if (r6 != 0) goto L_0x006b
            if (r7 != 0) goto L_0x006b
            r6 = 2131824012(0x7f110d8c, float:1.928084E38)
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Exception -> 0x00a5 }
            nj3.C76879j.m92726T(r5, r6)     // Catch:{ Exception -> 0x00a5 }
            r5.finish()     // Catch:{ Exception -> 0x00a5 }
            return
        L_0x006b:
            r9 = 4
            if (r6 != r9) goto L_0x007e
            if (r7 != r2) goto L_0x007e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00a5 }
            if (r6 != 0) goto L_0x007e
            android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r5, (java.lang.CharSequence) r8, (int) r4)     // Catch:{ Exception -> 0x00a5 }
            r6.show()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00be
        L_0x007e:
            r6 = -101(0xffffffffffffff9b, float:NaN)
            if (r7 != r6) goto L_0x009a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00a5 }
            if (r6 != 0) goto L_0x009a
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Exception -> 0x00a5 }
            r7 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r7 = r5.getString(r7)     // Catch:{ Exception -> 0x00a5 }
            nj3.C76879j.m92754y(r5, r8, r6, r7, r1)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00be
        L_0x009a:
            r6 = 2131833444(0x7f113264, float:1.929997E38)
            android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r5, (int) r6, (int) r3)     // Catch:{ Exception -> 0x00a5 }
            r6.show()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00be
        L_0x00a5:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "exception in onSceneEnd : "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.SayHiEditUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
