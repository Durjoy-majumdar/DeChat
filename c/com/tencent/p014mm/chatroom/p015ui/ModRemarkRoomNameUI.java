package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p530fx.C45819c;
import p629ny.C76979h;
import p645pj.C77092c;
import qn3.C77382c;
import tl3.C78039a;
import xi3.C78844a;

/* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI */
public class ModRemarkRoomNameUI extends MMActivity implements C74965a.C74969d {

    /* renamed from: q */
    public static final /* synthetic */ int f10146q = 0;

    /* renamed from: d */
    public MMClearEditText f10147d;

    /* renamed from: e */
    public View f10148e;

    /* renamed from: f */
    public TextView f10149f;

    /* renamed from: g */
    public TextView f10150g;

    /* renamed from: h */
    public Button f10151h;

    /* renamed from: i */
    public TextView f10152i;

    /* renamed from: j */
    public ScrollView f10153j;

    /* renamed from: n */
    public InputPanelLinearLayout f10154n;

    /* renamed from: o */
    public String f10155o;

    /* renamed from: p */
    public int f10156p;

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$a */
    public class C1181a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f10157d;

        /* renamed from: e */
        public final /* synthetic */ TextView f10158e;

        public C1181a(CharSequence charSequence, TextView textView) {
            this.f10157d = charSequence;
            this.f10158e = textView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ModRemarkRoomNameUI.this.f10147d.setText(this.f10157d);
            MMClearEditText mMClearEditText = ModRemarkRoomNameUI.this.f10147d;
            mMClearEditText.setSelection(mMClearEditText.getText().length());
            this.f10158e.setVisibility(8);
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$b */
    public class C1182b implements View.OnClickListener {
        public C1182b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ModRemarkRoomNameUI.this.f10147d.mo101647a();
            View view2 = ModRemarkRoomNameUI.this.f10148e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$c */
    public class C1183c implements TextWatcher {
        public C1183c() {
        }

        public void afterTextChanged(Editable editable) {
            ModRemarkRoomNameUI modRemarkRoomNameUI = ModRemarkRoomNameUI.this;
            Button button = modRemarkRoomNameUI.f10151h;
            String trim = modRemarkRoomNameUI.f10147d.getText().toString().trim();
            String e = C77092c.m93043e();
            boolean z = false;
            if (!Util.isNullOrNil(e)) {
                if (trim.matches(".*[" + e + "].*")) {
                    String string = modRemarkRoomNameUI.getString(C0966R.string.frk, new Object[]{e});
                    if (Util.isNullOrNil(string)) {
                        modRemarkRoomNameUI.f10152i.setVisibility(8);
                    } else {
                        modRemarkRoomNameUI.f10152i.setVisibility(0);
                        modRemarkRoomNameUI.f10152i.setText(string);
                    }
                    button.setEnabled(z);
                }
            }
            if (Util.isNullOrNil("")) {
                modRemarkRoomNameUI.f10152i.setVisibility(8);
            } else {
                modRemarkRoomNameUI.f10152i.setVisibility(0);
                modRemarkRoomNameUI.f10152i.setText("");
            }
            z = true;
            button.setEnabled(z);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.length() > 0) {
                ModRemarkRoomNameUI.this.f10147d.setEllipsize((TextUtils.TruncateAt) null);
            } else {
                ModRemarkRoomNameUI.this.f10147d.setEllipsize(TextUtils.TruncateAt.END);
            }
            ModRemarkRoomNameUI modRemarkRoomNameUI = ModRemarkRoomNameUI.this;
            boolean z = charSequence.length() > 0;
            int i4 = ModRemarkRoomNameUI.f10146q;
            modRemarkRoomNameUI.mo1071H7(z);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$d */
    public class C1184d implements MenuItem.OnMenuItemClickListener {
        public C1184d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ModRemarkRoomNameUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$e */
    public class C1185e implements View.OnClickListener {
        public C1185e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ModRemarkRoomNameUI modRemarkRoomNameUI = ModRemarkRoomNameUI.this;
            Class cls = C45819c.class;
            int i = modRemarkRoomNameUI.f10156p;
            if (i == 1) {
                String escapeStringForUCC = Util.escapeStringForUCC(modRemarkRoomNameUI.f10147d.getText().toString().trim());
                C72940a m = ((C45819c) C86312j.m106911c(cls)).mo71192mK(modRemarkRoomNameUI.f10155o).mo71502m(modRemarkRoomNameUI.f10155o, escapeStringForUCC);
                m.f212615d = new C67963h1(modRemarkRoomNameUI, escapeStringForUCC, m);
                m.mo100867d(modRemarkRoomNameUI.getContext(), modRemarkRoomNameUI.getString(C0966R.string.a3h), modRemarkRoomNameUI.getString(C0966R.string.blb), false, false, (DialogInterface.OnCancelListener) null);
            } else if (i == 2) {
                String escapeStringForUCC2 = Util.escapeStringForUCC(modRemarkRoomNameUI.f10147d.getText().toString().trim());
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(modRemarkRoomNameUI.f10155o);
                C72940a q = ((C45819c) C86312j.m106911c(cls)).mo71192mK(modRemarkRoomNameUI.f10155o).mo71506q(modRemarkRoomNameUI.f10155o, escapeStringForUCC2);
                q.f212615d = new C67970j1(modRemarkRoomNameUI, z1Var, escapeStringForUCC2, q);
                if (Util.isNullOrNil(escapeStringForUCC2) || !escapeStringForUCC2.equals(z1Var.getNickname())) {
                    q.mo100867d(modRemarkRoomNameUI.getContext(), modRemarkRoomNameUI.getString(C0966R.string.a3h), modRemarkRoomNameUI.getString(C0966R.string.blb), false, false, (DialogInterface.OnCancelListener) null);
                } else {
                    C76879j.m92750u(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(C0966R.string.i5z), "", new C1216g1(modRemarkRoomNameUI, q), (DialogInterface.OnClickListener) null);
                }
            } else if (i == 3) {
                String escapeStringForUCC3 = Util.escapeStringForUCC(modRemarkRoomNameUI.f10147d.getText().toString().trim());
                C115669n.INSTANCE.idkeyStat(219, 4, 1, true);
                C72940a f = ((C45819c) C86312j.m106911c(cls)).mo71192mK(modRemarkRoomNameUI.f10155o).mo71495f(modRemarkRoomNameUI.f10155o, C75592q0.m90789s(), Util.nullAsNil(escapeStringForUCC3));
                f.f212615d = new C67967i1(modRemarkRoomNameUI, escapeStringForUCC3, f);
                f.mo100867d(modRemarkRoomNameUI, modRemarkRoomNameUI.getString(C0966R.string.a3h), modRemarkRoomNameUI.getString(C0966R.string.blb), false, false, (DialogInterface.OnCancelListener) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$f */
    public class C1186f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f10164d;

        public C1186f(int i) {
            this.f10164d = i;
        }

        public void run() {
            Log.m105925i("MicroMsg.RemarkRoomNameUI", "inputContainer.height: %d, screenHeight: %d", Integer.valueOf(ModRemarkRoomNameUI.this.f10154n.getHeight()), Integer.valueOf(this.f10164d));
            if (ModRemarkRoomNameUI.this.f10154n.getHeight() > this.f10164d) {
                ModRemarkRoomNameUI modRemarkRoomNameUI = ModRemarkRoomNameUI.this;
                modRemarkRoomNameUI.f10153j.scrollBy(0, modRemarkRoomNameUI.f10154n.getHeight() - this.f10164d);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI$g */
    public static class C1187g extends MMBaseAccessibilityConfig {
        public C1187g(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0971layout.bgj).view(C0966R.C0970id.f357906mc2).desc((int) C0966R.string.f7930wk).type(ViewType.Button);
        }
    }

    /* renamed from: H7 */
    public final void mo1071H7(boolean z) {
        if (this.f10148e != null) {
            if (!z || !C78844a.C15689b.f42385a.mo108842h(true)) {
                View view = this.f10148e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = this.f10148e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgj;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.RemarkRoomNameUI", "keyboard show %s, keyboardHeight %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10151h.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            layoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            this.f10151h.setLayoutParams(layoutParams);
            InputPanelLinearLayout inputPanelLinearLayout = this.f10154n;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f10154n.getPaddingTop(), this.f10154n.getPaddingRight(), i);
            int height = this.f10153j.getHeight();
            this.f10154n.requestLayout();
            this.f10154n.post(new C1186f(height));
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f10151h.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        layoutParams2.topMargin = 0;
        this.f10151h.setLayoutParams(layoutParams2);
        InputPanelLinearLayout inputPanelLinearLayout2 = this.f10154n;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f10154n.getPaddingTop(), this.f10154n.getPaddingRight(), 0);
        this.f10153j.scrollBy(0, 0);
    }

    public void initView() {
        View view;
        Class cls = C76979h.class;
        String str = "";
        setMMTitle(str);
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f10153j = (ScrollView) findViewById(C0966R.C0970id.j48);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.f7j);
        this.f10154n = inputPanelLinearLayout;
        inputPanelLinearLayout.mo104200a(this);
        this.f10147d = (MMClearEditText) findViewById(C0966R.C0970id.gy9);
        this.f10148e = findViewById(C0966R.C0970id.f357906mc2);
        this.f10149f = (TextView) findViewById(C0966R.C0970id.gya);
        this.f10150g = (TextView) findViewById(C0966R.C0970id.gy_);
        this.f10151h = (Button) findViewById(C0966R.C0970id.hfe);
        this.f10152i = (TextView) findViewById(C0966R.C0970id.ckx);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.b0v);
        View findViewById = findViewById(C0966R.C0970id.b19);
        this.f10156p = getIntent().getIntExtra("Key_Scenen", 0);
        this.f10155o = getIntent().getStringExtra("Key_Room_Id");
        boolean z = true;
        Log.m105925i("MicroMsg.RemarkRoomNameUI", "scene %d, roomId %s", Integer.valueOf(this.f10156p), this.f10155o);
        if (Util.isNullOrNil(this.f10155o)) {
            finish();
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f10155o);
        if (((int) z1Var.f108320R1) > 0) {
            C78039a.m94189a(imageView, z1Var.getUsername());
        }
        SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(this, Util.nullAsNil(z1Var.getNickname()));
        SpannableString T12 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(this, Util.nullAsNil(z1Var.mo73969n2()));
        Log.m105925i("MicroMsg.RemarkRoomNameUI", "roomName %s, remarkName %s", T1, T12);
        int i = this.f10156p;
        if (i == 1) {
            this.f10149f.setText(C0966R.string.i5k);
            this.f10150g.setText(C0966R.string.gvf);
            this.f10147d.setText(T1);
            if (Util.isNullOrNil((CharSequence) T1)) {
                this.f10147d.setHint(getString(C0966R.string.i6y));
            }
            getString(C0966R.string.i5t);
            getString(C0966R.string.i5v);
        } else if (i == 2) {
            this.f10149f.setText(C0966R.string.i8f);
            this.f10150g.setText(C0966R.string.gvg);
            this.f10147d.setText(T12);
            this.f10147d.setHint(C0966R.string.i8f);
            Object string = Util.isNullOrNil((CharSequence) T1) ? getString(C0966R.string.i6y) : T1;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) findViewById(C0966R.C0970id.b1_)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this, getString(C0966R.string.gve, new Object[]{string})));
            TextView textView = (TextView) findViewById(C0966R.C0970id.b1a);
            if (!Util.isNullOrNil((CharSequence) T1)) {
                textView.setOnClickListener(new C1181a(T1, textView));
            } else {
                textView.setVisibility(8);
            }
            getString(C0966R.string.iun);
        } else if (i != 3) {
            Log.m105929w("MicroMsg.RemarkRoomNameUI", "unknown scene %d, finish()", Integer.valueOf(i));
            finish();
        } else {
            this.f10149f.setText(C0966R.string.i7r);
            this.f10150g.setText(C0966R.string.gvd);
            MMClearEditText mMClearEditText = this.f10147d;
            C76979h hVar = (C76979h) C86312j.m106911c(cls);
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f10155o);
            if (Lo != null) {
                str = Lo.field_selfDisplayName;
            }
            if (Util.isNullOrNil(str)) {
                str = C75592q0.m90783m();
            }
            mMClearEditText.setText(hVar.mo107057T1(this, ((C76979h) C86312j.m106911c(cls)).mo107057T1(this, str)));
            getString(C0966R.string.i5u);
            getString(C0966R.string.i5s);
        }
        MMClearEditText mMClearEditText2 = this.f10147d;
        mMClearEditText2.setSelection(mMClearEditText2.getText().length());
        if (C78844a.C15689b.f42385a.mo108842h(true) && (view = this.f10148e) != null) {
            view.setOnClickListener(new C1182b());
            if (this.f10147d.getText().length() <= 0) {
                z = false;
            }
            mo1071H7(z);
        }
        this.f10147d.addTextChangedListener(new C1183c());
        if (this.f10156p == 2) {
            C77382c b = C77382c.m93286b(this.f10147d);
            b.f225611e = 0;
            b.f225610d = 32;
            b.f225607a = false;
            b.mo107499d((C77382c.C77383a) null);
        } else {
            C77382c b2 = C77382c.m93286b(this.f10147d);
            b2.f225611e = 0;
            b2.f225610d = 32;
            b2.f225607a = false;
            b2.mo107499d((C77382c.C77383a) null);
        }
        this.f10147d.requestFocus();
        setBackBtn(new C1184d());
        this.f10151h.setOnClickListener(new C1185e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10155o = getIntent().getStringExtra("RoomInfo_Id");
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C1187g.class);
    }
}
