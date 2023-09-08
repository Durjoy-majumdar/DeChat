package com.tencent.p014mm.plugin.label.p067ui;

import a22.C0008d;
import a22.C27740g;
import a22.C67001a;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import b22.C28250a;
import cm0.C28613b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.p136ui.base.MMTagPanelScrollView;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72955b2;
import d22.C45259e;
import d22.C75319a;
import e22.C75494a0;
import e22.C75495b0;
import e22.C75500d0;
import e22.C75501e0;
import e22.C75504f0;
import e22.C75506g0;
import e22.C75508h0;
import e22.C75522n;
import e22.C75533t;
import e22.C75538z;
import e22.C7590i0;
import eb0.C75592q0;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76905x;
import nj3.C76911y;
import ob0.C11385n;
import ob0.C117747y;
import p1136n3.C109678b;
import p206nj.C11171e;
import sf0.C77691f;
import te3.C48946c3;
import te3.C50422mm2;
import te3.ap4;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI */
public class ContactLabelUI extends ContactLabelBaseUI implements C11385n, C7020t0 {

    /* renamed from: L */
    public static final /* synthetic */ int f198639L = 0;

    /* renamed from: A */
    public ArrayList<String> f198640A = new ArrayList<>();

    /* renamed from: B */
    public HashSet<String> f198641B = new HashSet<>();

    /* renamed from: C */
    public ArrayList<String> f198642C = new ArrayList<>();

    /* renamed from: D */
    public ArrayList<String> f198643D = new ArrayList<>();

    /* renamed from: E */
    public boolean f198644E = false;

    /* renamed from: F */
    public HashSet<String> f198645F;

    /* renamed from: G */
    public HashSet<String> f198646G;

    /* renamed from: H */
    public HashSet<String> f198647H;

    /* renamed from: I */
    public boolean f198648I;

    /* renamed from: J */
    public boolean f198649J;

    /* renamed from: K */
    public ObjectAnimator f198650K;

    /* renamed from: e */
    public C76905x f198651e;

    /* renamed from: f */
    public KeyboardHeightProvider f198652f;

    /* renamed from: g */
    public boolean f198653g = false;

    /* renamed from: h */
    public boolean f198654h = false;

    /* renamed from: i */
    public MMTagPanelScrollView f198655i;

    /* renamed from: j */
    public MMLabelPanel f198656j;

    /* renamed from: n */
    public TextView f198657n;

    /* renamed from: o */
    public View f198658o;

    /* renamed from: p */
    public View f198659p;

    /* renamed from: q */
    public LinearLayout f198660q;

    /* renamed from: r */
    public MMLabelPanel f198661r;

    /* renamed from: s */
    public ListView f198662s;

    /* renamed from: t */
    public ScrollView f198663t;

    /* renamed from: u */
    public C75533t f198664u;

    /* renamed from: v */
    public String f198665v;

    /* renamed from: w */
    public String f198666w;

    /* renamed from: x */
    public ArrayList<String> f198667x;

    /* renamed from: y */
    public HashSet<String> f198668y = new HashSet<>();

    /* renamed from: z */
    public HashSet<String> f198669z = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI$c */
    public class C4757c implements View.OnClickListener {
        public C4757c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(ContactLabelUI.this, ContactLabelManagerUI.class);
            intent.putExtra("last_page_source_type", 1);
            intent.putExtra("key_label_click_source", 1);
            intent.putExtra("label_edit_mode", true);
            ContactLabelUI.this.startActivityForResult(intent, 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI$e */
    public class C4758e implements ValueAnimator.AnimatorUpdateListener {
        public C4758e(ContactLabelUI contactLabelUI) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105925i("MicroMsg.Label.ContactLabelUI", "onAnimationUpdate %s", Float.valueOf(((Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI$a */
    public class C69086a implements MenuItem.OnMenuItemClickListener {
        public C69086a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelUI.this.onBackPressed();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI$b */
    public class C69087b implements MenuItem.OnMenuItemClickListener {
        public C69087b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelUI contactLabelUI = ContactLabelUI.this;
            if (contactLabelUI.f198653g) {
                Iterator<String> it = contactLabelUI.f198669z.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (!ContactLabelUI.this.f198642C.contains(it.next())) {
                        z = true;
                    }
                }
                if (!Util.isNullOrNil(ContactLabelUI.this.f198656j.getEdittextText())) {
                    z = true;
                }
                if (z) {
                    ContactLabelUI.m81395K7(ContactLabelUI.this);
                } else {
                    ContactLabelUI.this.finish();
                }
            } else {
                ContactLabelUI.m81395K7(contactLabelUI);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI$d */
    public class C69088d implements MMLabelPanel.C69108a {
        public C69088d() {
        }

        /* renamed from: a */
        public void mo95163a(MMTagPanel.C73208l lVar) {
            ContactLabelUI contactLabelUI = ContactLabelUI.this;
            String string = contactLabelUI.getResources().getString(C0966R.string.g2e);
            String string2 = ContactLabelUI.this.getResources().getString(C0966R.string.g2a);
            int i = ContactLabelUI.f198639L;
            contactLabelUI.getClass();
            KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(contactLabelUI);
            contactLabelUI.f198652f = keyboardHeightProvider;
            keyboardHeightProvider.f220015b = contactLabelUI;
            keyboardHeightProvider.mo104022e();
            C76905x xVar = new C76905x(contactLabelUI, false);
            contactLabelUI.f198651e = xVar;
            xVar.mo140679y(48);
            contactLabelUI.f198651e.mo140665l(new C75504f0(contactLabelUI));
            C76905x xVar2 = contactLabelUI.f198651e;
            xVar2.f224756L.setText(string);
            xVar2.f224757M.setHint(string2);
            xVar2.f224758N.setOnClickListener(new C76911y(xVar2, new C75506g0(contactLabelUI)));
            contactLabelUI.f198651e.mo140655A();
            contactLabelUI.f198651e.f224757M.postDelayed(new C75508h0(contactLabelUI), 100);
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI$f */
    public enum C69089f {
        Normal,
        Search
    }

    public ContactLabelUI() {
        new HashSet();
        this.f198645F = new HashSet<>();
        this.f198646G = new HashSet<>();
        this.f198647H = new HashSet<>();
        this.f198648I = true;
        this.f198649J = false;
        this.f198650K = null;
    }

    /* renamed from: I7 */
    public static void m81393I7(ContactLabelUI contactLabelUI, String str) {
        ArrayList<String> arrayList = contactLabelUI.f198667x;
        if (arrayList != null && arrayList.contains(str)) {
            contactLabelUI.f198668y.add(str);
        }
        ArrayList<String> arrayList2 = contactLabelUI.f198640A;
        if (arrayList2 != null && arrayList2.contains(str)) {
            contactLabelUI.f198640A.remove(str);
        }
        HashSet<String> hashSet = contactLabelUI.f198669z;
        if (hashSet != null && hashSet.contains(str)) {
            contactLabelUI.f198669z.remove(str);
        }
        if (contactLabelUI.mo95156M7()) {
            contactLabelUI.enableOptionMenu(true);
        }
    }

    /* renamed from: J7 */
    public static void m81394J7(ContactLabelUI contactLabelUI) {
        MMLabelPanel mMLabelPanel = contactLabelUI.f198656j;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo101800f();
        }
        Intent intent = new Intent();
        if (contactLabelUI.mo95156M7()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        ArrayList<String> stringArrayListExtra = contactLabelUI.getIntent().getStringArrayListExtra("label_str_list");
        ArrayList<String> TE = C27740g.vx0().mo100947TE();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TE.contains(next)) {
                arrayList.add(next);
            }
        }
        stringArrayListExtra.removeAll(arrayList);
        intent.putExtra("result_label_id_list", stringArrayListExtra);
        intent.putExtra("contact_search_label_new_list", new ArrayList());
        intent.putExtra("contact_search_label_add_list", new ArrayList());
        intent.putExtra("contact_select_label_add_list", new ArrayList());
        intent.putExtra("contact_select_label_new_list", new ArrayList());
        contactLabelUI.setResult(-1, intent);
        super.finish();
    }

    /* renamed from: K7 */
    public static void m81395K7(ContactLabelUI contactLabelUI) {
        contactLabelUI.getClass();
        Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[save]");
        if (contactLabelUI.f198656j == null) {
            Log.m105928w("MicroMsg.Label.ContactLabelUI", "save fail. input view is null.");
            return;
        }
        contactLabelUI.mo95085H7(contactLabelUI.getString(C0966R.string.g2h));
        if (contactLabelUI.f198644E) {
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger]");
            MMLabelPanel mMLabelPanel = contactLabelUI.f198656j;
            if (mMLabelPanel != null) {
                String editText = mMLabelPanel.getEditText();
                if (!Util.isNullOrNil(editText)) {
                    contactLabelUI.f198656j.mo95185d(editText, true);
                    contactLabelUI.f198656j.mo101801g();
                    contactLabelUI.mo95155L7(editText, contactLabelUI.f198644E);
                }
            }
            HashSet<String> hashSet = contactLabelUI.f198669z;
            if (hashSet != null && hashSet.size() > 0) {
                Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger] save local");
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = contactLabelUI.f198669z.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!contactLabelUI.f198641B.contains(next)) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < size; i++) {
                        C72955b2 b2Var = new C72955b2();
                        String str = (String) arrayList.get(i);
                        b2Var.field_isTemporary = true;
                        b2Var.field_labelName = str;
                        b2Var.field_labelPYFull = C77691f.m93686a(str);
                        b2Var.field_labelPYShort = C77691f.m93687b(str);
                        int i2 = -((int) System.nanoTime());
                        b2Var.field_labelID = i2;
                        Log.m105925i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger]field_labelID:%s field_labelName:%s", Integer.valueOf(i2), b2Var.field_labelName);
                        arrayList2.add(b2Var);
                    }
                    C27740g.vx0().mo100956nP(arrayList2);
                }
            }
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveStranger]");
            C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(contactLabelUI.f198665v);
            MMLabelPanel mMLabelPanel2 = contactLabelUI.f198656j;
            if (mMLabelPanel2 != null) {
                String i3 = ((C67001a) C28250a.m38138a()).mo90971i(mMLabelPanel2.getTagList());
                if (!Util.isNullOrNil(i3)) {
                    Lo.field_contactLabels = i3;
                    if (Util.isNullOrNil(Lo.field_encryptUsername)) {
                        Lo.field_encryptUsername = contactLabelUI.f198665v;
                    }
                    ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                } else {
                    Lo.field_contactLabels = "";
                    ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                }
            }
            contactLabelUI.mo95159P7();
            return;
        }
        Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabel]");
        MMLabelPanel mMLabelPanel3 = contactLabelUI.f198656j;
        if (mMLabelPanel3 != null) {
            String editText2 = mMLabelPanel3.getEditText();
            if (!Util.isNullOrNil(editText2)) {
                String trim = editText2.trim();
                contactLabelUI.f198656j.mo95185d(trim, true);
                contactLabelUI.f198656j.mo101801g();
                contactLabelUI.mo95155L7(trim, contactLabelUI.f198644E);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        HashSet<String> hashSet2 = contactLabelUI.f198669z;
        if (hashSet2 != null) {
            Iterator<String> it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (!contactLabelUI.f198641B.contains(next2)) {
                    arrayList3.add(next2);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveLable] doScene");
            C97625j3.m125815e().mo123460f(new C75319a((List<String>) arrayList3));
            if (contactLabelUI.f198642C == null || contactLabelUI.f198669z.isEmpty()) {
                C115669n.INSTANCE.mo160131h(11347, 0, 0);
                return;
            }
            C115669n.INSTANCE.mo160131h(11347, 0, 1);
            return;
        }
        HashSet<String> hashSet3 = contactLabelUI.f198669z;
        if (hashSet3 != null && !hashSet3.isEmpty()) {
            if (contactLabelUI.f198642C == null || contactLabelUI.f198669z.isEmpty()) {
                C115669n.INSTANCE.mo160131h(11347, 0, 0);
            } else {
                C115669n.INSTANCE.mo160131h(11347, 0, 1);
            }
        }
        Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveLable] doSaveContact");
        contactLabelUI.mo95158O7();
    }

    /* renamed from: L7 */
    public final void mo95155L7(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Label.ContactLabelUI", "tag is empty");
            return;
        }
        String trim = str.trim();
        if (Util.isNullOrNil(trim)) {
            Log.m105928w("MicroMsg.Label.ContactLabelUI", "new tag is empty");
            return;
        }
        C72955b2 mI = C27740g.vx0().mo100954mI(trim);
        if (z) {
            ArrayList<String> arrayList = this.f198642C;
            if (arrayList == null || !arrayList.contains(trim) || mI == null) {
                this.f198669z.add(trim);
            }
        } else {
            ArrayList<String> arrayList2 = this.f198642C;
            if (arrayList2 == null || !arrayList2.contains(trim) || (mI != null && mI.field_isTemporary)) {
                this.f198669z.add(trim);
            }
        }
        ArrayList<String> arrayList3 = this.f198640A;
        if (arrayList3 != null && !arrayList3.contains(trim)) {
            this.f198640A.add(trim);
        }
        HashSet<String> hashSet = this.f198668y;
        if (hashSet != null && hashSet.contains(trim)) {
            this.f198668y.remove(trim);
        }
        if (mo95156M7()) {
            enableOptionMenu(true);
        }
    }

    /* renamed from: M7 */
    public final boolean mo95156M7() {
        if (this.f198656j == null) {
            return false;
        }
        ArrayList<String> arrayList = this.f198667x;
        if (arrayList == null || arrayList.size() <= 0) {
            return this.f198656j.getTagList() != null && this.f198656j.getTagList().size() > 0;
        }
        if (this.f198656j.getTagList() == null && this.f198656j.getTagList().size() <= 0) {
            return true;
        }
        ArrayList<String> tagList = this.f198656j.getTagList();
        Collections.sort(this.f198667x);
        Collections.sort(tagList);
        return !this.f198667x.equals(tagList);
    }

    /* renamed from: N7 */
    public final void mo95157N7(HashSet<String> hashSet, ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!arrayList.contains(next)) {
                arrayList2.add(next);
            }
        }
        hashSet.removeAll(arrayList2);
    }

    /* renamed from: O7 */
    public final void mo95158O7() {
        Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
        if (this.f198656j != null) {
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact] doScene");
            ArrayList<String> tagList = this.f198656j.getTagList();
            String d = (tagList == null || tagList.size() <= 0) ? "" : C0008d.m3d(C27740g.vx0().mo100955mL(tagList));
            LinkedList linkedList = new LinkedList();
            ap4 ap4 = new ap4();
            ap4.f130718e = d;
            ap4.f130717d = this.f198665v;
            linkedList.add(ap4);
            C97625j3.m125815e().mo123460f(new C45259e(linkedList));
            HashSet<String> hashSet = this.f198669z;
            int size = hashSet != null ? hashSet.size() : 0;
            ArrayList<String> arrayList = this.f198667x;
            int size2 = arrayList != null ? arrayList.size() : 0;
            HashSet<String> hashSet2 = this.f198668y;
            int size3 = ((this.f198656j.getTagList().size() + (hashSet2 != null ? hashSet2.size() : 0)) - size2) - size;
            if (size > 0 || size3 > 0) {
                Log.m105919d("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", Integer.valueOf(size), Integer.valueOf(size3));
                C115669n.INSTANCE.mo160131h(11220, C75592q0.m90789s(), Integer.valueOf(size), Integer.valueOf(size3), 0, 0);
            }
            if (size > 0) {
                C115669n.INSTANCE.mo160131h(16097, 2, 1, 1);
            }
        }
    }

    /* renamed from: P7 */
    public final void mo95159P7() {
        hideLoading();
        this.f198669z.clear();
        this.f198668y.clear();
        finish();
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        View view;
        Log.m105925i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged, height:%s", Integer.valueOf(i));
        if (C11171e.m11046c(30)) {
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged: return");
            return;
        }
        ObjectAnimator objectAnimator = this.f198650K;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f198650K.cancel();
        }
        C76905x xVar = this.f198651e;
        if (xVar == null || (view = xVar.f296384g) == null || view.getParent() == null) {
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged, mAddLebalTipsDialog: isNull");
            return;
        }
        View view2 = null;
        if (this.f198651e.f296384g.getParent() instanceof View) {
            view2 = (View) this.f198651e.f296384g.getParent();
        }
        if (view2 != null) {
            if (i > 0) {
                if (view2.getTranslationY() != 0.0f) {
                    view2.setTranslationY(0.0f);
                }
                this.f198650K = ObjectAnimator.ofFloat(view2, "translationY", new float[]{0.0f, (float) (-i)});
            } else {
                this.f198650K = ObjectAnimator.ofFloat(view2, "translationY", new float[]{view2.getTranslationY(), 0.0f});
            }
            this.f198650K.setDuration(200);
            this.f198650K.setInterpolator(new C109678b());
            this.f198650K.addUpdateListener(new C4758e(this));
            this.f198650K.start();
        }
    }

    /* renamed from: Q7 */
    public final void mo95160Q7(C69089f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            this.f198662s.setVisibility(8);
            View view = this.f198658o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198663t.setVisibility(0);
            this.f198657n.setVisibility(8);
        } else if (ordinal == 1) {
            this.f198663t.setVisibility(8);
            this.f198662s.setVisibility(0);
            View view2 = this.f198658o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198657n.setVisibility(8);
        } else if (ordinal == 2) {
            this.f198662s.setVisibility(8);
            this.f198663t.setVisibility(8);
            View view4 = this.f198658o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198657n.setVisibility(0);
            this.f198657n.setText(C0966R.string.g2d);
        } else if (ordinal == 3) {
            this.f198662s.setVisibility(8);
            this.f198663t.setVisibility(8);
            View view6 = this.f198658o;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198657n.setVisibility(0);
            this.f198657n.setText(C0966R.string.g2d);
        }
    }

    public void finish() {
        MMLabelPanel mMLabelPanel = this.f198656j;
        if (mMLabelPanel != null) {
            mMLabelPanel.mo101800f();
        }
        Intent intent = new Intent();
        if (mo95156M7()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        intent.putExtra("result_label_id_list", this.f198656j.getSelectTagList());
        ArrayList<String> selectTagList = this.f198656j.getSelectTagList();
        ArrayList<String> selectTagList2 = this.f198661r.getSelectTagList();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = selectTagList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!selectTagList2.contains(next)) {
                arrayList.add(next);
            }
        }
        if (getIntent().getStringArrayExtra("contact_search_label_new_list") != null) {
            for (String add : getIntent().getStringArrayExtra("contact_search_label_new_list")) {
                arrayList.add(add);
            }
        }
        intent.putExtra("contact_search_label_new_list", arrayList);
        ArrayList<String> TE = C27740g.vx0().mo100947TE();
        ArrayList arrayList2 = new ArrayList();
        mo95157N7(this.f198645F, TE);
        arrayList2.addAll(this.f198645F);
        intent.putExtra("contact_search_label_add_list", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        mo95157N7(this.f198647H, TE);
        arrayList3.addAll(this.f198647H);
        intent.putExtra("contact_select_label_add_list", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        mo95157N7(this.f198646G, TE);
        arrayList4.addAll(this.f198646G);
        intent.putExtra("contact_select_label_new_list", arrayList4);
        setResult(-1, intent);
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7087xv;
    }

    public final void init() {
        ArrayList<String> arrayList;
        this.f198666w = getIntent().getStringExtra("label_id_list");
        this.f198667x = getIntent().getStringArrayListExtra("label_str_list");
        this.f198665v = getIntent().getStringExtra("label_username");
        this.f198644E = getIntent().getBooleanExtra("is_stranger", false);
        this.f198653g = getIntent().getBooleanExtra("save_label_to_contact_on_prepage", false);
        this.f198664u = new C75533t(this);
        initView();
        if (!Util.isNullOrNil(this.f198666w) && (arrayList = this.f198667x) != null && arrayList.size() > 0) {
            MMLabelPanel mMLabelPanel = this.f198656j;
            ArrayList<String> arrayList2 = this.f198667x;
            mMLabelPanel.mo95190q(arrayList2, arrayList2);
        }
        if (this.f198644E) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("label_str_list");
            this.f198656j.mo95190q(stringArrayListExtra, stringArrayListExtra);
        }
        this.f198643D = C27740g.vx0().mo100947TE();
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.f7387et));
        setBackBtn(new C69086a());
        addTextOptionMenu(0, getString(this.f198653g ? C0966R.string.a18 : C0966R.string.a2n), new C69087b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        MMTagPanelScrollView mMTagPanelScrollView = (MMTagPanelScrollView) findViewById(C0966R.C0970id.fh7);
        this.f198655i = mMTagPanelScrollView;
        mMTagPanelScrollView.setMaxLine(3);
        this.f198656j = (MMLabelPanel) findViewById(C0966R.C0970id.fh6);
        this.f198657n = (TextView) findViewById(C0966R.C0970id.fh9);
        this.f198655i.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        this.f198658o = findViewById(C0966R.C0970id.fh5);
        View findViewById = findViewById(C0966R.C0970id.fh4);
        this.f198659p = findViewById;
        findViewById.setBackgroundDrawable((Drawable) null);
        ((TextView) this.f198659p.findViewById(16908310)).setText(C0966R.string.g2g);
        LinearLayout linearLayout = (LinearLayout) this.f198659p.findViewById(C0966R.C0970id.f357893cb2);
        this.f198660q = linearLayout;
        linearLayout.setVisibility(0);
        this.f198660q.setOnClickListener(new C4757c());
        MMLabelPanel mMLabelPanel = (MMLabelPanel) findViewById(C0966R.C0970id.f358498fh2);
        this.f198661r = mMLabelPanel;
        mMLabelPanel.setNeedNewLebal(true);
        MMLabelPanel mMLabelPanel2 = this.f198661r;
        int a = C76577a.m92150a(mMLabelPanel2.f198736J, 12.0f);
        int a2 = C76577a.m92150a(mMLabelPanel2.f198736J, 5.0f);
        int a3 = C76577a.m92150a(mMLabelPanel2.f198736J, 12.0f);
        int a4 = C76577a.m92150a(mMLabelPanel2.f198736J, 6.0f);
        MMEditText mMEditText = mMLabelPanel2.f214919E;
        if (mMEditText != null) {
            mMEditText.setPadding(a, a2, a3, a4);
        }
        this.f198661r.setClickNewLebalCallBack(new C69088d());
        this.f198662s = (ListView) findViewById(C0966R.C0970id.fh8);
        ScrollView scrollView = (ScrollView) findViewById(C0966R.C0970id.fhb);
        this.f198663t = scrollView;
        if (scrollView != null) {
            scrollView.setOnTouchListener(new C7590i0(this));
        }
        MMLabelPanel mMLabelPanel3 = this.f198656j;
        mMLabelPanel3.f214929p = true;
        mMLabelPanel3.mo101809k(true);
        this.f198656j.setEdittextMaxSize(36);
        this.f198656j.setCallBack(new C75538z(this));
        if (getIntent().getStringArrayExtra("contact_search_label_add_list") != null) {
            for (String add : getIntent().getStringArrayExtra("contact_search_label_add_list")) {
                this.f198645F.add(add);
            }
        }
        if (getIntent().getStringArrayExtra("contact_select_label_add_list") != null) {
            for (String add2 : getIntent().getStringArrayExtra("contact_select_label_add_list")) {
                this.f198647H.add(add2);
            }
        }
        if (getIntent().getStringArrayExtra("contact_select_label_new_list") != null) {
            for (String add3 : getIntent().getStringArrayExtra("contact_select_label_new_list")) {
                this.f198646G.add(add3);
            }
        }
        this.f198661r.mo101809k(false);
        this.f198661r.setNeedNewLebal(true);
        this.f198661r.setCallBack(new C75494a0(this));
        this.f198662s.setAdapter(this.f198664u);
        this.f198662s.setOnItemClickListener(new C75495b0(this));
        enableOptionMenu(false);
    }

    public void onBackPressed() {
        if (mo95156M7()) {
            C76879j.m92707A(this, getString(C0966R.string.ian), "", getString(C0966R.string.att), getString(C0966R.string.atw), new C75500d0(this), new C75501e0(this));
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Label.ContactLabelUI", e, "", new Object[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
        C115669n.INSTANCE.mo160131h(16097, 1, 0, 1);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123470p(638, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f198652f;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123455a(638, this);
        MMHandlerThread.postToMainThread(new C69092c(this));
        KeyboardHeightProvider keyboardHeightProvider = this.f198652f;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        int type = yVar.getType();
        if (type != 635) {
            if (type != 638) {
                Log.m105928w("MicroMsg.Label.ContactLabelUI", "unknow type.");
            } else if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.");
                mo95159P7();
            } else {
                hideLoading();
                C76879j.m92749t(this, getString(C0966R.string.f7383ep), "", new C75522n(this));
            }
        } else if (i != 0 || i2 != 0) {
            hideLoading();
            C76879j.m92749t(this, getString(C0966R.string.f7383ep), "", new C75522n(this));
        } else if (this.f198654h && (yVar instanceof C75319a)) {
            this.f198654h = false;
            hideLoading();
            LinkedList<C50422mm2> linkedList = ((C48946c3) ((C75319a) yVar).f221473d.f127056b.f127083a).f131475e;
            if (linkedList != null && linkedList.size() > 0) {
                for (int i3 = 0; i3 < linkedList.size(); i3++) {
                    if (linkedList.get(i3) == null) {
                        Log.m105918d("MicroMsg.Label.ContactLabelUI", "tag1 is null.");
                    } else {
                        String str2 = linkedList.get(i3).f138105d;
                        Log.m105919d("MicroMsg.Label.ContactLabelUI", "tag:%s", str2 + "");
                        if (Util.isNullOrNil(str2)) {
                            Log.m105918d("MicroMsg.Label.ContactLabelUI", "tag is null.");
                            return;
                        }
                        MMLabelPanel mMLabelPanel = this.f198656j;
                        mMLabelPanel.mo95196v(str2, true, mMLabelPanel.getChildCount() - 1);
                        MMLabelPanel mMLabelPanel2 = this.f198661r;
                        mMLabelPanel2.mo95196v(str2, true, mMLabelPanel2.getChildCount() - 1);
                        mo95155L7(str2, this.f198644E);
                        this.f198646G.add(str2);
                        this.f198641B.add(str2);
                        this.f198643D.add(str2);
                    }
                }
            }
        } else if (!this.f198653g) {
            Log.m105924i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.asd");
            mo95158O7();
        } else {
            mo95159P7();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f198652f;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
