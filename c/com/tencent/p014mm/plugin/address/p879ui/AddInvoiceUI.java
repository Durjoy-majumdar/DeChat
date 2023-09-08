package com.tencent.p014mm.plugin.address.p879ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.address.p879ui.InvoiceEditView;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import fk0.C86910b;
import i12.C76255b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import te3.C48992ce2;
import te3.C52314zv3;
import xg0.C78803b;
import yg0.C79110a;
import zg0.C79328d;
import zg0.C79329k;

/* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI */
public class AddInvoiceUI extends MMActivity implements C11385n, InvoiceEditView.C68522d {

    /* renamed from: z */
    public static final /* synthetic */ int f196791z = 0;

    /* renamed from: d */
    public int f196792d = 0;

    /* renamed from: e */
    public Button f196793e = null;

    /* renamed from: f */
    public Button f196794f = null;

    /* renamed from: g */
    public TextView f196795g;

    /* renamed from: h */
    public TextView f196796h;

    /* renamed from: i */
    public InvoiceEditView f196797i;

    /* renamed from: j */
    public InvoiceEditView f196798j;

    /* renamed from: n */
    public InvoiceEditView f196799n;

    /* renamed from: o */
    public InvoiceEditView f196800o;

    /* renamed from: p */
    public InvoiceEditView f196801p;

    /* renamed from: q */
    public InvoiceEditView f196802q;

    /* renamed from: r */
    public InvoiceEditView f196803r;

    /* renamed from: s */
    public InvoiceEditView f196804s;

    /* renamed from: t */
    public C76255b f196805t = null;

    /* renamed from: u */
    public C76255b f196806u = new C76255b();

    /* renamed from: v */
    public Dialog f196807v = null;

    /* renamed from: w */
    public boolean f196808w = false;

    /* renamed from: x */
    public boolean f196809x = false;

    /* renamed from: y */
    public int f196810y = 0;

    /* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI$a */
    public class C68511a implements View.OnTouchListener {
        public C68511a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/AddInvoiceUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            } else if (motionEvent.getAction() != 1) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                if (!AddInvoiceUI.this.f196794f.isActivated()) {
                    AddInvoiceUI.this.f196794f.setActivated(true);
                }
                if (AddInvoiceUI.this.f196794f.isActivated()) {
                    AddInvoiceUI.this.f196793e.setActivated(false);
                    AddInvoiceUI.this.f196806u.f223379e = "0";
                }
                AddInvoiceUI.this.mo94067H7();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI$b */
    public class C68512b implements View.OnTouchListener {
        public C68512b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            } else if (motionEvent.getAction() != 1) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                if (!AddInvoiceUI.this.f196793e.isActivated()) {
                    AddInvoiceUI.this.f196793e.setActivated(true);
                }
                if (AddInvoiceUI.this.f196793e.isActivated()) {
                    AddInvoiceUI.this.f196794f.setActivated(false);
                    AddInvoiceUI.this.f196806u.f223379e = "1";
                }
                AddInvoiceUI.this.mo94067H7();
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI$c */
    public class C68513c implements MenuItem.OnMenuItemClickListener {
        public C68513c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AddInvoiceUI addInvoiceUI = AddInvoiceUI.this;
            int i = AddInvoiceUI.f196791z;
            addInvoiceUI.mo94068I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI$d */
    public class C68514d implements MenuItem.OnMenuItemClickListener {
        public C68514d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C76255b bVar;
            String str;
            if (AddInvoiceUI.this.f196792d == 0) {
                C115669n.INSTANCE.mo160131h(14199, 3);
            } else {
                C115669n.INSTANCE.mo160131h(14199, 4);
            }
            Button button = AddInvoiceUI.this.f196794f;
            if (button == null || !button.isActivated() || AddInvoiceUI.this.f196798j.getText().length() != 0) {
                Button button2 = AddInvoiceUI.this.f196793e;
                if (button2 == null || !button2.isActivated() || AddInvoiceUI.this.f196799n.getText().length() != 0) {
                    AddInvoiceUI addInvoiceUI = AddInvoiceUI.this;
                    if (addInvoiceUI.f196792d != 0 && addInvoiceUI.f196799n.getText().length() == 0 && AddInvoiceUI.this.f196798j.getText().length() == 0) {
                        AddInvoiceUI.this.mo94070K7();
                        return false;
                    } else if (AddInvoiceUI.this.f196800o.getText().length() > 100) {
                        AddInvoiceUI addInvoiceUI2 = AddInvoiceUI.this;
                        C76879j.m92713G(addInvoiceUI2, addInvoiceUI2.getString(C0966R.string.fsp), addInvoiceUI2.getString(C0966R.string.a3h), false, (DialogInterface.OnClickListener) null);
                        return false;
                    } else if (!AddInvoiceUI.this.mo94067H7()) {
                        Button button3 = AddInvoiceUI.this.f196794f;
                        if ((button3 != null && button3.isActivated()) || !((bVar = AddInvoiceUI.this.f196805t) == null || (str = bVar.f223379e) == null || !str.equals("0"))) {
                            if (!AddInvoiceUI.this.f196802q.mo94100b()) {
                                AddInvoiceUI addInvoiceUI3 = AddInvoiceUI.this;
                                C76879j.m92713G(addInvoiceUI3, addInvoiceUI3.getString(C0966R.string.f360903ft0), addInvoiceUI3.getString(C0966R.string.a3h), false, (DialogInterface.OnClickListener) null);
                            }
                            if (!AddInvoiceUI.this.f196804s.mo94100b()) {
                                AddInvoiceUI addInvoiceUI4 = AddInvoiceUI.this;
                                C76879j.m92713G(addInvoiceUI4, addInvoiceUI4.getString(C0966R.string.fsm), addInvoiceUI4.getString(C0966R.string.a3h), false, (DialogInterface.OnClickListener) null);
                            }
                        }
                        return true;
                    } else {
                        if (AddInvoiceUI.this.f196794f.isActivated()) {
                            AddInvoiceUI.this.f196806u.f223379e = "0";
                        } else if (AddInvoiceUI.this.f196793e.isActivated()) {
                            AddInvoiceUI.this.f196806u.f223379e = "1";
                        }
                        AddInvoiceUI addInvoiceUI5 = AddInvoiceUI.this;
                        C76255b bVar2 = addInvoiceUI5.f196805t;
                        if (bVar2 != null) {
                            addInvoiceUI5.f196806u.f223379e = bVar2.f223379e;
                        }
                        addInvoiceUI5.f196806u.f223380f = addInvoiceUI5.f196798j.getText();
                        AddInvoiceUI addInvoiceUI6 = AddInvoiceUI.this;
                        addInvoiceUI6.f196806u.f223381g = addInvoiceUI6.f196799n.getText();
                        AddInvoiceUI addInvoiceUI7 = AddInvoiceUI.this;
                        addInvoiceUI7.f196806u.f223382h = addInvoiceUI7.f196800o.getText();
                        AddInvoiceUI addInvoiceUI8 = AddInvoiceUI.this;
                        C76255b bVar3 = addInvoiceUI8.f196806u;
                        bVar3.f223378d = addInvoiceUI8.f196792d;
                        bVar3.f223386o = addInvoiceUI8.f196802q.getText();
                        AddInvoiceUI addInvoiceUI9 = AddInvoiceUI.this;
                        addInvoiceUI9.f196806u.f223384j = addInvoiceUI9.f196803r.getText();
                        AddInvoiceUI addInvoiceUI10 = AddInvoiceUI.this;
                        addInvoiceUI10.f196806u.f223383i = addInvoiceUI10.f196804s.getText();
                        AddInvoiceUI addInvoiceUI11 = AddInvoiceUI.this;
                        addInvoiceUI11.f196806u.f223389r = addInvoiceUI11.f196801p.getText();
                        AddInvoiceUI addInvoiceUI12 = AddInvoiceUI.this;
                        C97625j3.m125815e().mo123460f(new C79329k(addInvoiceUI12.f196806u));
                        C97625j3.m125815e().mo123455a(C86910b.CTRL_INDEX, addInvoiceUI12);
                        if (addInvoiceUI12.f196792d != 0) {
                            Log.m105924i("MicroMsg.AddInvoiceUI", "modify save invoice " + addInvoiceUI12.f196806u.toString());
                            addInvoiceUI12.f196807v = C76879j.m92723Q(addInvoiceUI12, "", "", true, true, (DialogInterface.OnCancelListener) null);
                        } else {
                            addInvoiceUI12.f196807v = C76879j.m92723Q(addInvoiceUI12, "", "", true, true, (DialogInterface.OnCancelListener) null);
                        }
                        return true;
                    }
                } else {
                    AddInvoiceUI.this.mo94070K7();
                    return false;
                }
            } else {
                AddInvoiceUI.this.mo94070K7();
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.AddInvoiceUI$e */
    public class C68515e implements DialogInterface.OnClickListener {
        public C68515e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AddInvoiceUI.this.setResult(0);
            AddInvoiceUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final boolean mo94067H7() {
        C76255b bVar;
        C76255b bVar2;
        Button button;
        String str;
        String str2;
        Button button2 = this.f196794f;
        boolean z = false;
        boolean z2 = true;
        if ((button2 == null || !button2.isActivated()) && ((bVar = this.f196805t) == null || (str2 = bVar.f223379e) == null || !str2.equals("0"))) {
            Button button3 = this.f196793e;
            if ((button3 == null || !button3.isActivated()) && ((bVar2 = this.f196805t) == null || (str = bVar2.f223379e) == null || !str.equals("1"))) {
                this.f196800o.setVisibility(0);
                this.f196801p.setVisibility(0);
                this.f196802q.setVisibility(0);
                this.f196803r.setVisibility(0);
                this.f196804s.setVisibility(0);
                this.f196799n.setVisibility(8);
                this.f196798j.setVisibility(0);
                this.f196799n.setVisibility(8);
                Button button4 = this.f196793e;
                if (button4 != null && !button4.isActivated() && (button = this.f196794f) != null && !button.isActivated()) {
                    z2 = false;
                }
                if (!this.f196798j.mo94100b()) {
                    z2 = false;
                }
                if (!this.f196800o.mo94100b()) {
                    z2 = false;
                }
                if (!this.f196801p.mo94100b()) {
                    z2 = false;
                }
                if (!this.f196802q.mo94100b()) {
                    z2 = false;
                }
                if (!this.f196803r.mo94100b()) {
                    z2 = false;
                }
                if (!this.f196804s.mo94100b()) {
                    return false;
                }
            } else {
                this.f196800o.setVisibility(8);
                this.f196801p.setVisibility(8);
                this.f196802q.setVisibility(8);
                this.f196803r.setVisibility(8);
                this.f196804s.setVisibility(8);
                this.f196798j.setVisibility(8);
                this.f196799n.setVisibility(0);
                if (!this.f196793e.isActivated() && !this.f196805t.f223379e.equals("1")) {
                    z2 = false;
                }
                if (!this.f196799n.mo94100b()) {
                    if (this.f196799n.getText().length() > 100) {
                        mo94069J7(getString(C0966R.string.fta), 100);
                    }
                    z2 = false;
                }
                Button button5 = this.f196793e;
                if (button5 == null || !button5.isActivated() || this.f196799n.getText().length() != 0) {
                    z = z2;
                }
                enableOptionMenu(z);
                return z;
            }
        } else {
            this.f196800o.setVisibility(0);
            this.f196801p.setVisibility(0);
            this.f196802q.setVisibility(0);
            this.f196803r.setVisibility(0);
            this.f196804s.setVisibility(0);
            this.f196798j.setVisibility(0);
            this.f196799n.setVisibility(8);
            if (!this.f196794f.isActivated() && !this.f196805t.f223379e.equals("0")) {
                z2 = false;
            }
            if (!this.f196798j.mo94100b()) {
                if (this.f196798j.getText().length() > 100) {
                    mo94069J7(getString(C0966R.string.fta), 100);
                }
                z2 = false;
            }
            Button button6 = this.f196794f;
            if (button6 != null && button6.isActivated() && this.f196798j.getText().length() == 0) {
                z2 = false;
            }
            enableOptionMenu(z2);
            if (this.f196800o.mo94100b()) {
                TextView textView = this.f196795g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (this.f196800o.getText().length() > 0) {
                ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.l9g);
                if (viewStub != null) {
                    viewStub.inflate();
                    this.f196795g = (TextView) findViewById(C0966R.C0970id.l9f);
                }
                TextView textView2 = this.f196795g;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            if (!this.f196801p.mo94100b()) {
                if (this.f196801p.getText().length() > 100) {
                    mo94069J7(getString(C0966R.string.fsq), 100);
                }
                z2 = false;
            }
            if (!this.f196802q.mo94100b()) {
                if (this.f196802q.getText().length() > 100) {
                    mo94069J7(getString(C0966R.string.f360904ft1), 100);
                }
                z2 = false;
            }
            if (!this.f196803r.mo94100b()) {
                if (this.f196803r.getText().length() > 100) {
                    mo94069J7(getString(C0966R.string.fsj), 100);
                }
                z2 = false;
            }
            if (!this.f196804s.mo94100b()) {
                if (this.f196804s.getText().length() <= 48) {
                    return false;
                }
                mo94069J7(getString(C0966R.string.fsl), 39);
                return false;
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = r12.f196806u.f223379e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r12.f196806u.f223379e;
     */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94068I7() {
        /*
            r12 = this;
            int r0 = r12.f196792d
            java.lang.String r1 = ""
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0026
            i12.b r0 = r12.f196805t
            if (r0 == 0) goto L_0x0026
            i12.b r0 = r12.f196806u
            java.lang.String r0 = r0.f223379e
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0026
            i12.b r0 = r12.f196806u
            java.lang.String r0 = r0.f223379e
            i12.b r4 = r12.f196805t
            java.lang.String r4 = r4.f223379e
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0036
        L_0x0026:
            int r0 = r12.f196792d
            if (r0 != 0) goto L_0x0038
            i12.b r0 = r12.f196806u
            java.lang.String r0 = r0.f223379e
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            android.widget.Button r1 = r12.f196793e
            if (r1 == 0) goto L_0x0054
            android.widget.Button r4 = r12.f196794f
            if (r4 == 0) goto L_0x0054
            boolean r1 = r1.isActivated()
            if (r1 != 0) goto L_0x0054
            android.widget.Button r1 = r12.f196794f
            boolean r1 = r1.isActivated()
            if (r1 != 0) goto L_0x0054
            i12.b r1 = r12.f196805t
            if (r1 != 0) goto L_0x0054
            r0 = 1
        L_0x0054:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196798j
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x005d
            r0 = 1
        L_0x005d:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196799n
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x0066
            r0 = 1
        L_0x0066:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196800o
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x006f
            r0 = 1
        L_0x006f:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196801p
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x0078
            r0 = 1
        L_0x0078:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196802q
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x0081
            r0 = 1
        L_0x0081:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196803r
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x008a
            r0 = 1
        L_0x008a:
            com.tencent.mm.plugin.address.ui.InvoiceEditView r1 = r12.f196804s
            boolean r1 = r1.mo94101c()
            if (r1 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r3 = r0
        L_0x0094:
            if (r3 == 0) goto L_0x00c5
            r5 = 0
            androidx.appcompat.app.AppCompatActivity r0 = r12.getContext()
            r1 = 2131831495(0x7f112ac7, float:1.9296017E38)
            java.lang.String r6 = r0.getString(r1)
            androidx.appcompat.app.AppCompatActivity r0 = r12.getContext()
            r1 = 2131831494(0x7f112ac6, float:1.9296015E38)
            java.lang.String r8 = r0.getString(r1)
            androidx.appcompat.app.AppCompatActivity r0 = r12.getContext()
            r1 = 2131831493(0x7f112ac5, float:1.9296013E38)
            java.lang.String r9 = r0.getString(r1)
            com.tencent.mm.plugin.address.ui.AddInvoiceUI$e r10 = new com.tencent.mm.plugin.address.ui.AddInvoiceUI$e
            r10.<init>()
            r11 = 0
            java.lang.String r7 = ""
            r4 = r12
            nj3.C76879j.m92717K(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00cb
        L_0x00c5:
            r12.setResult(r2)
            r12.finish()
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.address.p879ui.AddInvoiceUI.mo94068I7():void");
    }

    /* renamed from: J7 */
    public void mo94069J7(String str, int i) {
        C76879j.m92713G(this, getString(C0966R.string.fso, new Object[]{str, Integer.valueOf(i)}), getString(C0966R.string.a3h), false, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: K7 */
    public void mo94070K7() {
        C76879j.m92713G(this, getString(C0966R.string.ftb), getString(C0966R.string.a3h), false, (DialogInterface.OnClickListener) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bbr;
    }

    public void initView() {
        C76255b bVar;
        String str;
        String str2;
        Button button;
        this.f196810y = 0;
        MMScrollView mMScrollView = (MMScrollView) findViewById(C0966R.C0970id.f_0);
        if (mMScrollView != null) {
            mMScrollView.mo94158a(mMScrollView, mMScrollView);
        }
        Button button2 = (Button) findViewById(C0966R.C0970id.f9r);
        this.f196793e = button2;
        if (button2 != null) {
            button2.setVisibility(0);
        }
        Button button3 = (Button) findViewById(C0966R.C0970id.f9p);
        this.f196794f = button3;
        if (button3 != null) {
            button3.setVisibility(0);
        }
        if (this.f196792d == 0 && (button = this.f196794f) != null) {
            button.setActivated(true);
        }
        Button button4 = this.f196794f;
        if (button4 != null) {
            button4.setOnTouchListener(new C68511a());
        }
        Button button5 = this.f196793e;
        if (button5 != null) {
            button5.setOnTouchListener(new C68512b());
        }
        this.f196797i = (InvoiceEditView) findViewById(C0966R.C0970id.f_3);
        this.f196798j = (InvoiceEditView) findViewById(C0966R.C0970id.f_2);
        this.f196799n = (InvoiceEditView) findViewById(C0966R.C0970id.f9s);
        this.f196800o = (InvoiceEditView) findViewById(C0966R.C0970id.f_1);
        this.f196801p = (InvoiceEditView) findViewById(C0966R.C0970id.f9o);
        this.f196802q = (InvoiceEditView) findViewById(C0966R.C0970id.f9t);
        this.f196803r = (InvoiceEditView) findViewById(C0966R.C0970id.f9l);
        this.f196804s = (InvoiceEditView) findViewById(C0966R.C0970id.f9m);
        InvoiceEditView invoiceEditView = this.f196800o;
        invoiceEditView.f196841d = true;
        invoiceEditView.f196858x = true;
        invoiceEditView.setOnInputValidChangeListener(this);
        this.f196797i.setOnInputValidChangeListener(this);
        this.f196798j.setOnInputValidChangeListener(this);
        this.f196799n.setOnInputValidChangeListener(this);
        this.f196801p.setOnInputValidChangeListener(this);
        this.f196802q.setOnInputValidChangeListener(this);
        this.f196803r.setOnInputValidChangeListener(this);
        this.f196804s.setOnInputValidChangeListener(this);
        if (this.f196792d != 0) {
            ((TextView) findViewById(C0966R.C0970id.kms)).setVisibility(8);
            this.f196796h = (TextView) findViewById(C0966R.C0970id.kzj);
            C79110a wx02 = C78803b.wx0();
            int i = this.f196792d;
            Iterator<C76255b> it = wx02.f232271a.f223377d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.f223378d == i) {
                    break;
                }
            }
            this.f196805t = bVar;
            if (bVar == null || (str2 = bVar.f223379e) == null || !str2.equals("0")) {
                C76255b bVar2 = this.f196805t;
                if (!(bVar2 == null || (str = bVar2.f223379e) == null || !str.equals("1"))) {
                    this.f196796h.setText(getString(C0966R.string.fsz));
                }
            } else {
                this.f196796h.setText(getString(C0966R.string.fst));
            }
            this.f196796h.setVisibility(0);
            this.f196794f.setVisibility(8);
            this.f196793e.setVisibility(8);
            C76255b bVar3 = this.f196805t;
            if (bVar3 != null) {
                this.f196797i.setValStr(bVar3.f223379e);
                this.f196798j.setValStr(this.f196805t.f223380f);
                this.f196799n.setValStr(this.f196805t.f223381g);
                this.f196800o.setValStr(this.f196805t.f223382h);
                this.f196801p.setValStr(this.f196805t.f223389r);
                this.f196802q.setValStr(this.f196805t.f223386o);
                this.f196803r.setValStr(this.f196805t.f223384j);
                this.f196804s.setValStr(this.f196805t.f223383i);
            }
        }
        if (this.f196809x || this.f196808w) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.fef);
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.fef);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setBackBtn(new C68513c());
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C68514d(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(false);
        mo94067H7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 3 && i2 != -1) {
                Log.m105924i("MicroMsg.AddInvoiceUI", "MallRecharge pay result : cancel");
            }
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra("karea_result");
            if (!Util.isNullOrNil(stringExtra)) {
                Log.m105918d("MicroMsg.AddInvoiceUI", "AREA_RESULT:" + stringExtra);
                this.f196802q.setValStr(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("kpost_code");
            if (!Util.isNullOrNil(stringExtra2)) {
                Log.m105918d("MicroMsg.AddInvoiceUI", "post:" + stringExtra2);
                this.f196802q.setValStr(stringExtra2);
            }
            intent.getStringExtra("kwcode");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f196808w = intent.getBooleanExtra("launch_from_webview", false);
        this.f196809x = intent.getBooleanExtra("launch_from_invoicelist_webview", false);
        C97625j3.m125815e().mo123455a(C40475h.CTRL_INDEX, this);
        Log.m105918d("MicroMsg.AddInvoiceUI", "index Oncreate");
        this.f196806u = new C76255b();
        int intExtra = getIntent().getIntExtra("invoice_id", 0);
        this.f196792d = intExtra;
        if (intExtra == 0) {
            setMMTitle((int) C0966R.string.ipz);
        } else {
            setMMTitle((int) C0966R.string.iud);
        }
        initView();
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(C86910b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123470p(C40475h.CTRL_INDEX, this);
        getWindow().setSoftInputMode(3);
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        mo94068I7();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        LinkedList<C48992ce2> linkedList;
        Log.m105924i("MicroMsg.AddInvoiceUI", "errType " + i + ",errCode " + i2 + ",errMsg " + str);
        Dialog dialog = this.f196807v;
        if (dialog != null) {
            dialog.dismiss();
        }
        Intent intent = null;
        if (i != 0 || i2 != 0) {
            C76879j.m92713G(this, getString(C0966R.string.ft5), getString(C0966R.string.a3h), false, (DialogInterface.OnClickListener) null);
        } else if (yVar.getType() == 1180) {
            C52314zv3 zv32 = ((C79329k) yVar).f232895f;
            if (!(zv32 == null || (linkedList = zv32.f146243d) == null || linkedList.size() <= 0 || zv32.f146243d.get(0) == null)) {
                this.f196810y = zv32.f146243d.get(0).f131678e;
            }
            C97625j3.m125815e().mo123470p(C86910b.CTRL_INDEX, this);
            C97625j3.m125815e().mo123460f(new C79328d());
        } else if (yVar.getType() == 1191) {
            C97625j3.m125815e().mo123470p(C40475h.CTRL_INDEX, this);
            if (this.f196808w) {
                Log.m105924i("MicroMsg.AddInvoiceUI", "isLaunchFromWebview true...");
                C76255b bVar = this.f196806u;
                if (bVar == null) {
                    Log.m105920e("MicroMsg.InvoiceUtil", "invoiceObj == null");
                } else {
                    intent = new Intent();
                    intent.putExtra("type", bVar.f223379e);
                    String str2 = bVar.f223379e;
                    if (str2 == null || !str2.equals("1")) {
                        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f223380f);
                        intent.putExtra("tax_number", bVar.f223382h);
                        intent.putExtra("company_address", bVar.f223389r);
                        intent.putExtra("telephone", bVar.f223386o);
                        intent.putExtra("bank_name", bVar.f223384j);
                        intent.putExtra("bank_account", bVar.f223383i);
                    } else {
                        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f223381g);
                    }
                }
                setResult(-1, intent);
                finish();
                return;
            }
            if (this.f196792d == 0 && this.f196810y != 0) {
                Intent intent2 = new Intent();
                intent2.setClass(this, QrcodeInvoiceUI.class);
                intent2.putExtra("invoice_id", this.f196810y);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/address/ui/AddInvoiceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f196810y = 0;
            }
            finish();
        }
    }
}
