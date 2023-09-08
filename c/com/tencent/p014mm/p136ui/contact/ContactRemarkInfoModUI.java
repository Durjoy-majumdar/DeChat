package com.tencent.p014mm.p136ui.contact;

import a14.C53934p0;
import a22.C27740g;
import a22.C67001a;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b22.C28250a;
import cm0.C28613b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.contact.C1234b;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileEditPhoneNumberView;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C75375u;
import dg0.C75398e;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f12.C7970a;
import fw0.C75804d;
import g62.C32330n;
import gy3.C87412m;
import hg0.C76166a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p1136n3.C109678b;
import p140cw.C7138g;
import p629ny.C76979h;
import p823sg.C90193h;
import qn3.C77382c;
import qo3.C77407n;
import sf0.C77702q0;
import so3.C77751a;
import tc0.C77885p;
import te3.C48662a4;
import te3.C49072d00;
import te3.C49630gz2;
import te3.C50467my2;
import te3.C50527nd3;
import te3.C50665od3;
import te3.C51712vn;
import te3.C64812wq3;
import wx3.C15601d;
import xc0.C53320a;
import xc0.C78785c;
import xc0.C78786d;
import xc0.C78789e;
import xc0.C78795g;
import xi3.C15697f;
import xi3.C78844a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI */
public class ContactRemarkInfoModUI extends MMActivity implements C11385n, C7020t0 {

    /* renamed from: o1 */
    public static final /* synthetic */ int f218496o1 = 0;

    /* renamed from: A */
    public int f218497A;

    /* renamed from: B */
    public String f218498B;

    /* renamed from: C */
    public int f218499C = 0;

    /* renamed from: D */
    public LinkedList<C48662a4> f218500D = new LinkedList<>();

    /* renamed from: E */
    public LinkedList<C51712vn> f218501E = new LinkedList<>();

    /* renamed from: F */
    public String f218502F;

    /* renamed from: G */
    public String f218503G;

    /* renamed from: H */
    public String f218504H;

    /* renamed from: I */
    public String f218505I;

    /* renamed from: J */
    public ArrayList<String> f218506J = new ArrayList<>();

    /* renamed from: K */
    public ArrayList<String> f218507K = new ArrayList<>();

    /* renamed from: L */
    public boolean f218508L = true;

    /* renamed from: M */
    public ArrayList<String> f218509M = new ArrayList<>();

    /* renamed from: N */
    public ArrayList<String> f218510N = new ArrayList<>();

    /* renamed from: P */
    public int f218511P = 0;

    /* renamed from: Q */
    public ArrayList<C64812wq3> f218512Q = new ArrayList<>();

    /* renamed from: Q0 */
    public List<String> f218513Q0 = new ArrayList();

    /* renamed from: R */
    public boolean f218514R = false;

    /* renamed from: R0 */
    public List<String> f218515R0 = new ArrayList();

    /* renamed from: S */
    public boolean f218516S = false;

    /* renamed from: S0 */
    public HashSet<String> f218517S0 = new HashSet<>();

    /* renamed from: T */
    public boolean f218518T = false;

    /* renamed from: T0 */
    public HashSet<String> f218519T0 = new HashSet<>();

    /* renamed from: U */
    public boolean f218520U = false;

    /* renamed from: U0 */
    public boolean f218521U0;

    /* renamed from: V */
    public ArrayList<String> f218522V = new ArrayList<>();

    /* renamed from: V0 */
    public long f218523V0;

    /* renamed from: W */
    public LifecycleScope f218524W = new LifecycleScope("remark", this, 1);

    /* renamed from: W0 */
    public int f218525W0;

    /* renamed from: X */
    public LifecycleScope f218526X = new LifecycleScope("remark_upload", this, 1);

    /* renamed from: X0 */
    public int f218527X0;

    /* renamed from: Y */
    public C74385o f218528Y = new C74385o((C6820c) null);

    /* renamed from: Y0 */
    public int f218529Y0 = 0;

    /* renamed from: Z */
    public TextView f218530Z;

    /* renamed from: Z0 */
    public HashSet<String> f218531Z0 = new HashSet<>();

    /* renamed from: a1 */
    public HashSet<String> f218532a1 = new HashSet<>();

    /* renamed from: b1 */
    public HashSet<String> f218533b1 = new HashSet<>();

    /* renamed from: c1 */
    public HashSet<String> f218534c1 = new HashSet<>();

    /* renamed from: d */
    public MMClearEditText f218535d;

    /* renamed from: d1 */
    public HashSet<String> f218536d1 = new HashSet<>();

    /* renamed from: e */
    public View f218537e;

    /* renamed from: e1 */
    public ProfileEditPhoneNumberView f218538e1;

    /* renamed from: f */
    public TextView f218539f;

    /* renamed from: f1 */
    public View f218540f1;

    /* renamed from: g */
    public MMEditText f218541g;

    /* renamed from: g1 */
    public String f218542g1;

    /* renamed from: h */
    public TextView f218543h;

    /* renamed from: h1 */
    public String f218544h1;

    /* renamed from: i */
    public TextView f218545i;

    /* renamed from: i1 */
    public TextWatcher f218546i1 = new C6820c();

    /* renamed from: j */
    public ProgressDialog f218547j;

    /* renamed from: j1 */
    public C74386p f218548j1 = new C74386p((C6820c) null);

    /* renamed from: k1 */
    public ObjectAnimator f218549k1 = null;

    /* renamed from: l1 */
    public MStorageEx.IOnStorageChange f218550l1 = new C74382h();

    /* renamed from: m1 */
    public boolean f218551m1 = true;

    /* renamed from: n */
    public ScrollView f218552n;

    /* renamed from: n1 */
    public boolean f218553n1 = false;

    /* renamed from: o */
    public LinearLayout f218554o;

    /* renamed from: p */
    public TextView f218555p;

    /* renamed from: p0 */
    public LinearLayout f218556p0;

    /* renamed from: q */
    public KeyboardHeightProvider f218557q;

    /* renamed from: r */
    public ImageView f218558r;

    /* renamed from: s */
    public ImageView f218559s;

    /* renamed from: t */
    public ImageView f218560t;

    /* renamed from: u */
    public TextView f218561u;

    /* renamed from: v */
    public View f218562v;

    /* renamed from: w */
    public ProgressDialog f218563w;

    /* renamed from: x */
    public View f218564x;

    /* renamed from: x0 */
    public String f218565x0;

    /* renamed from: y */
    public C72996z1 f218566y;

    /* renamed from: y0 */
    public List<String> f218567y0 = new ArrayList();

    /* renamed from: z */
    public String f218568z;

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$b */
    public class C6819b implements View.OnClickListener {
        public C6819b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactRemarkInfoModUI.this.f218535d.mo101647a();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$c */
    public class C6820c implements TextWatcher {
        public C6820c() {
        }

        public void afterTextChanged(Editable editable) {
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            int i = ContactRemarkInfoModUI.f218496o1;
            contactRemarkInfoModUI.mo103344O7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$f */
    public class C6821f implements ValueAnimator.AnimatorUpdateListener {
        public C6821f(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "onAnimationUpdate %s", Float.valueOf(((Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$j */
    public class C6822j implements C77382c.C77383a {
        public C6822j(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        }

        /* renamed from: L0 */
        public void mo4083L0(String str) {
        }

        /* renamed from: L3 */
        public void mo4084L3(String str) {
        }

        /* renamed from: P4 */
        public void mo4086P4(String str) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$k */
    public class C6823k implements View.OnClickListener {
        public C6823k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            contactRemarkInfoModUI.f218514R = true;
            ContactRemarkInfoModUI.m88830H7(contactRemarkInfoModUI, false, view.getId());
            ContactRemarkInfoModUI.this.f218535d.performClick();
            ContactRemarkInfoModUI.this.f218535d.requestFocus();
            ContactRemarkInfoModUI.this.showVKB();
            ContactRemarkInfoModUI.this.mo103344O7();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$l */
    public class C6824l implements View.OnClickListener {
        public C6824l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            contactRemarkInfoModUI.f218516S = true;
            contactRemarkInfoModUI.mo103342M7(false, view.getId());
            ContactRemarkInfoModUI.this.f218541g.performClick();
            ContactRemarkInfoModUI.this.f218541g.requestFocus();
            ContactRemarkInfoModUI.this.showVKB();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$m */
    public class C6825m implements View.OnClickListener {
        public C6825m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            int i = ContactRemarkInfoModUI.f218496o1;
            C77407n nVar = new C77407n((Context) contactRemarkInfoModUI.getContext(), 1, true);
            nVar.f225771i = new C6886i0(contactRemarkInfoModUI);
            nVar.f225782p = new C6888j0(contactRemarkInfoModUI);
            nVar.mo107573q();
            ContactRemarkInfoModUI.this.mo103345P7();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$q */
    public class C6826q extends ClickableSpan {

        /* renamed from: d */
        public String f24385d;

        public C6826q(String str) {
            this.f24385d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MiroMsg.ContactRemarkInfoModUI", "oncreate WriteRemarkSpan");
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            contactRemarkInfoModUI.f218514R = true;
            contactRemarkInfoModUI.f218516S = true;
            contactRemarkInfoModUI.mo103342M7(true, -1);
            ContactRemarkInfoModUI.m88830H7(ContactRemarkInfoModUI.this, true, -1);
            MMClearEditText mMClearEditText = ContactRemarkInfoModUI.this.f218535d;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            ContactRemarkInfoModUI contactRemarkInfoModUI2 = ContactRemarkInfoModUI.this;
            String str = this.f24385d;
            int i = C77702q0.f226484a;
            if (str == null) {
                str = "";
            }
            mMClearEditText.setText(hVar.yp0(contactRemarkInfoModUI2, str, contactRemarkInfoModUI2.f218535d.getTextSize()));
            MMClearEditText mMClearEditText2 = ContactRemarkInfoModUI.this.f218535d;
            mMClearEditText2.setSelection(mMClearEditText2.getText().length());
            View view2 = ContactRemarkInfoModUI.this.f218562v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ContactRemarkInfoModUI.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$a */
    public class C74378a implements MenuItem.OnMenuItemClickListener {
        public C74378a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            int i = ContactRemarkInfoModUI.f218496o1;
            contactRemarkInfoModUI.mo103350U7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$d */
    public class C74379d implements DialogInterface.OnClickListener {
        public C74379d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ContactRemarkInfoModUI.this.mo103348S7(1);
            ContactRemarkInfoModUI.m88831I7(ContactRemarkInfoModUI.this);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$e */
    public class C74380e implements DialogInterface.OnClickListener {
        public C74380e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ContactRemarkInfoModUI.this.mo103348S7(2);
            ContactRemarkInfoModUI.this.mo103347R7();
            ContactRemarkInfoModUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$g */
    public class C74381g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f218572d;

        public C74381g(long j) {
            this.f218572d = j;
        }

        public void run() {
            RemarkTagOperateLogStruct remarkTagOperateLogStruct = new RemarkTagOperateLogStruct();
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            List<String> list = contactRemarkInfoModUI.f218515R0;
            remarkTagOperateLogStruct.f194329d = remarkTagOperateLogStruct.mo86045b("friendUsername", contactRemarkInfoModUI.f218568z, true);
            long j = 0;
            remarkTagOperateLogStruct.f194330e = ContactRemarkInfoModUI.this.f218521U0 ? 1 : 0;
            ArrayList<String> arrayList = (ArrayList) list;
            Iterator it = arrayList.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                if (ContactRemarkInfoModUI.this.f218532a1.contains((String) it.next())) {
                    i2++;
                }
            }
            remarkTagOperateLogStruct.f194332g = (long) i2;
            for (String contains : arrayList) {
                if (ContactRemarkInfoModUI.this.f218533b1.contains(contains)) {
                    j++;
                }
            }
            remarkTagOperateLogStruct.f194334i = j;
            int i3 = 0;
            for (String contains2 : arrayList) {
                if (ContactRemarkInfoModUI.this.f218536d1.contains(contains2)) {
                    i3++;
                }
            }
            remarkTagOperateLogStruct.f194333h = (long) i3;
            int i4 = 0;
            for (String contains3 : arrayList) {
                if (ContactRemarkInfoModUI.this.f218534c1.contains(contains3)) {
                    i4++;
                }
            }
            remarkTagOperateLogStruct.f194331f = (long) i4;
            long currentTimeMillis = System.currentTimeMillis();
            ContactRemarkInfoModUI contactRemarkInfoModUI2 = ContactRemarkInfoModUI.this;
            long j2 = j;
            remarkTagOperateLogStruct.f194338m = currentTimeMillis - contactRemarkInfoModUI2.f218523V0;
            remarkTagOperateLogStruct.f194339n = (long) contactRemarkInfoModUI2.f218525W0;
            remarkTagOperateLogStruct.f194340o = this.f218572d;
            remarkTagOperateLogStruct.f194335j = (long) contactRemarkInfoModUI2.f218527X0;
            int intExtra = contactRemarkInfoModUI2.getIntent().getIntExtra("key_label_click_source", 0);
            if (intExtra > 0) {
                remarkTagOperateLogStruct.f194343r = 22;
            }
            int i5 = 0;
            for (String contains4 : arrayList) {
                if (!ContactRemarkInfoModUI.this.f218513Q0.contains(contains4)) {
                    i5++;
                }
            }
            for (String contains5 : ContactRemarkInfoModUI.this.f218513Q0) {
                if (!arrayList.contains(contains5)) {
                    i++;
                }
            }
            remarkTagOperateLogStruct.f194341p = 1;
            String trim = ContactRemarkInfoModUI.this.f218535d.getText().toString().trim();
            if (trim == null) {
                trim = "";
            }
            if (C77702q0.m93719b(ContactRemarkInfoModUI.this.f218504H)) {
                ContactRemarkInfoModUI contactRemarkInfoModUI3 = ContactRemarkInfoModUI.this;
                if (!contactRemarkInfoModUI3.f218514R) {
                    contactRemarkInfoModUI3.f218529Y0 = 3;
                } else if (!C77702q0.m93719b(contactRemarkInfoModUI3.f218503G)) {
                    if (ContactRemarkInfoModUI.this.f218503G.equals(trim)) {
                        ContactRemarkInfoModUI.this.f218529Y0 = 1;
                    } else if (Util.isNullOrNil(trim)) {
                        ContactRemarkInfoModUI.this.f218529Y0 = 3;
                    } else {
                        ContactRemarkInfoModUI.this.f218529Y0 = 2;
                    }
                } else if (trim.equals(ContactRemarkInfoModUI.this.f218503G)) {
                    ContactRemarkInfoModUI.this.f218529Y0 = 3;
                } else {
                    ContactRemarkInfoModUI.this.f218529Y0 = 2;
                }
            } else if (ContactRemarkInfoModUI.this.f218504H.equals(trim)) {
                ContactRemarkInfoModUI.this.f218529Y0 = 3;
            } else {
                ContactRemarkInfoModUI.this.f218529Y0 = 2;
            }
            remarkTagOperateLogStruct.f194342q = (long) ContactRemarkInfoModUI.this.f218529Y0;
            remarkTagOperateLogStruct.f194337l = (long) i5;
            remarkTagOperateLogStruct.f194336k = (long) i;
            remarkTagOperateLogStruct.mo86054n();
            Log.m105924i("MiroMsg.ContactRemarkInfoModUI", "22865 setAddedLabelCnt = " + i5 + ",setRemovedLabelCnt = " + i + ",source = " + intExtra + ",oriLabelCnt = " + ContactRemarkInfoModUI.this.f218527X0 + ",opResult = " + this.f218572d + ",totalLabelCnt = " + ContactRemarkInfoModUI.this.f218525W0 + ",selectNewLabelCnt = " + i4 + ",selectAddLabelCnt = " + i3 + ",addRemarkType = " + ContactRemarkInfoModUI.this.f218529Y0 + ",scene= " + 1 + ",newLebalCountBySearch = " + i2 + ",searchAddLabelCnt = " + j2);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$h */
    public class C74382h implements MStorageEx.IOnStorageChange {
        public C74382h() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            Log.m105918d("MiroMsg.ContactRemarkInfoModUI", "cpan onNotifyChange");
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            int i2 = ContactRemarkInfoModUI.f218496o1;
            contactRemarkInfoModUI.mo103355Z7();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$i */
    public class C74383i implements ProfileEditPhoneNumberView.C72736c {
        public C74383i() {
        }

        /* renamed from: a */
        public void mo103361a() {
            View view = ContactRemarkInfoModUI.this.f218538e1.f211635i;
            if (!(view != null && view.getVisibility() == 0)) {
                View view2 = ContactRemarkInfoModUI.this.f218540f1;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$4", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$4", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view4 = ContactRemarkInfoModUI.this.f218540f1;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$4", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$4", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ContactRemarkInfoModUI.this.mo103344O7();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$n */
    public class C74384n implements MenuItem.OnMenuItemClickListener {
        public C74384n() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactRemarkInfoModUI.m88831I7(ContactRemarkInfoModUI.this);
            ContactRemarkInfoModUI.this.hideVKB();
            ContactRemarkInfoModUI.this.mo103348S7(1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$o */
    public class C74385o implements View.OnClickListener {
        public C74385o(C6820c cVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            int i = ContactRemarkInfoModUI.f218496o1;
            contactRemarkInfoModUI.getClass();
            Intent intent = new Intent();
            List<String> list = contactRemarkInfoModUI.f218515R0;
            if (list != null) {
                intent.putStringArrayListExtra("label_str_list", (ArrayList) list);
            }
            String str = "";
            int i2 = 0;
            while (i2 < ((ArrayList) contactRemarkInfoModUI.f218515R0).size()) {
                String str2 = (String) ((ArrayList) contactRemarkInfoModUI.f218515R0).get(i2);
                if (!C77702q0.m93719b(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(C27740g.vx0().mo100944LL(str2));
                    sb.append(i2 < ((ArrayList) contactRemarkInfoModUI.f218515R0).size() - 1 ? "," : "");
                    str = sb.toString();
                }
                i2++;
            }
            contactRemarkInfoModUI.f218521U0 = true;
            intent.putStringArrayListExtra("contact_net_label_list", (ArrayList) contactRemarkInfoModUI.f218513Q0);
            intent.putExtra("save_label_to_contact_on_prepage", false);
            intent.putExtra("label_id_list", str);
            intent.putExtra("label_username", contactRemarkInfoModUI.f218568z);
            intent.putExtra("contact_search_label_new_list", contactRemarkInfoModUI.f218532a1);
            intent.putExtra("contact_search_label_add_list", contactRemarkInfoModUI.f218533b1);
            intent.putExtra("contact_select_label_add_list", contactRemarkInfoModUI.f218536d1);
            intent.putExtra("contact_select_label_new_list", contactRemarkInfoModUI.f218534c1);
            C88144b.m109795m(contactRemarkInfoModUI, "label", ".ui.ContactLabelUI", intent, 600);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$p */
    public class C74386p implements TextWatcher {
        public C74386p(C6820c cVar) {
        }

        public void afterTextChanged(Editable editable) {
            int c;
            C45078p0.m49923b(400, editable.toString());
            ContactRemarkInfoModUI.this.f218541g.removeTextChangedListener(this);
            String obj = editable.toString();
            if (!Util.isNullOrNil(obj)) {
                int f = C45078p0.m49927f(obj);
                C45078p0.m49925d(400, obj);
                if (f > 400 && (c = C45078p0.m49924c(400, obj)) > 0 && c < 400 && c < obj.length()) {
                    ContactRemarkInfoModUI.this.f218541g.setText(obj.substring(0, c + 1));
                    MMEditText mMEditText = ContactRemarkInfoModUI.this.f218541g;
                    mMEditText.setSelection(mMEditText.getText().length());
                    C74804o4.m89546a();
                }
            }
            ContactRemarkInfoModUI.this.f218541g.addTextChangedListener(this);
            ContactRemarkInfoModUI.this.mo103344O7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: H7 */
    public static void m88830H7(ContactRemarkInfoModUI contactRemarkInfoModUI, boolean z, int i) {
        ContactRemarkInfoModUI contactRemarkInfoModUI2 = contactRemarkInfoModUI;
        if (contactRemarkInfoModUI2.f218514R) {
            contactRemarkInfoModUI2.f218543h.setVisibility(8);
            contactRemarkInfoModUI2.f218535d.setVisibility(0);
            if (C78844a.C15689b.f42385a.mo108842h(true)) {
                View view = contactRemarkInfoModUI2.f218537e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForRemarkName", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForRemarkName", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = contactRemarkInfoModUI2.f218537e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForRemarkName", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForRemarkName", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        contactRemarkInfoModUI2.f218543h.setVisibility(0);
        contactRemarkInfoModUI2.f218535d.setVisibility(8);
        View view5 = contactRemarkInfoModUI2.f218537e;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForRemarkName", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForRemarkName", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I7 */
    public static void m88831I7(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        ArrayList<String> arrayList;
        C76166a a;
        contactRemarkInfoModUI.f218551m1 = true;
        C77382c b = C77382c.m93286b(contactRemarkInfoModUI.f218535d);
        int i = 0;
        b.f225611e = 0;
        b.f225610d = 32;
        b.mo107499d(new C74492g0(contactRemarkInfoModUI));
        C77382c b2 = C77382c.m93286b(contactRemarkInfoModUI.f218541g);
        b2.f225611e = 0;
        b2.f225610d = 400;
        b2.mo107499d(new C74497h0(contactRemarkInfoModUI));
        if (contactRemarkInfoModUI.f218551m1) {
            boolean X7 = contactRemarkInfoModUI.mo103353X7();
            if (!X7) {
                contactRemarkInfoModUI.f218547j = C76879j.m92723Q(contactRemarkInfoModUI, contactRemarkInfoModUI.getString(C0966R.string.a3h), contactRemarkInfoModUI.getResources().getString(C0966R.string.g1m), true, true, new C6894n0(contactRemarkInfoModUI));
            }
            Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "[dealModRemarkDesc] :%s", contactRemarkInfoModUI.f218568z);
            if (contactRemarkInfoModUI.mo103352W7()) {
                String obj = contactRemarkInfoModUI.f218541g.getText().toString();
                contactRemarkInfoModUI.f218505I = obj;
                C50467my2 my22 = new C50467my2();
                my22.f138287d = contactRemarkInfoModUI.f218568z;
                my22.f138288e = obj;
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(54, my22));
            }
            String obj2 = contactRemarkInfoModUI.f218535d.getText().toString();
            Log.m105924i("MiroMsg.ContactRemarkInfoModUI", "Set New RemarkName : " + obj2 + ", Report kvStat, addContactScene = " + contactRemarkInfoModUI.f218497A);
            C115669n.INSTANCE.mo160131h(10448, Integer.valueOf(contactRemarkInfoModUI.f218497A));
            int source = contactRemarkInfoModUI.f218566y.getSource();
            if ((source == 10 || source == 11 || source == 13) && (a = C75398e.vx0().mo106401a(contactRemarkInfoModUI.f218566y.getUsername())) != null && !C77702q0.m93719b(a.mo106388h())) {
                if (C77702q0.m93719b(obj2)) {
                    a.f223129q |= 1;
                } else {
                    a.f223129q &= -2;
                }
                C75398e.vx0().mo106403d(a.mo106385e(), a);
            }
            C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(contactRemarkInfoModUI.f218566y.getUsername());
            if ((Lo == null || C77702q0.m93719b(Lo.field_encryptUsername)) && !C77702q0.m93719b(contactRemarkInfoModUI.f218566y.mo73978v2())) {
                Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(contactRemarkInfoModUI.f218566y.mo73978v2());
            }
            if (Lo != null && !C77702q0.m93719b(Lo.field_encryptUsername)) {
                ((C44651a5) C97625j3.m125812b().mo105880F()).mo69631jo(Lo.field_encryptUsername);
            }
            if (!contactRemarkInfoModUI.mo103354Y7(false)) {
                Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "remarkNameChanged", Boolean.valueOf(contactRemarkInfoModUI.mo103354Y7(false)));
            } else {
                contactRemarkInfoModUI.f218502F = obj2;
                Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "usernamne %s operationSetRemark %s", contactRemarkInfoModUI.f218566y.getUsername(), obj2);
                C45628s0.m50781j0(contactRemarkInfoModUI.f218566y, obj2);
            }
            if (contactRemarkInfoModUI.f218553n1) {
                C49630gz2 gz22 = new C49630gz2();
                gz22.f134369d = contactRemarkInfoModUI.f218568z;
                C50665od3 od32 = new C50665od3();
                od32.f139099e = new LinkedList<>();
                ArrayList<String> phoneNumberList = contactRemarkInfoModUI.f218538e1.getPhoneNumberList();
                ArrayList arrayList2 = new ArrayList();
                if (phoneNumberList != null) {
                    Iterator<String> it = phoneNumberList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (C75804d.m91049c(next)) {
                            C50527nd3 nd32 = new C50527nd3();
                            nd32.f138544d = next;
                            od32.f139099e.add(nd32);
                            arrayList2.add(next);
                        }
                    }
                }
                od32.f139098d = arrayList2.size();
                gz22.f134370e = od32;
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(60, gz22));
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(contactRemarkInfoModUI.f218568z);
                if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                    String a2 = C1233a.m1354a(arrayList2);
                    Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "[dealModPhoneNumberList] username:%s %s", contactRemarkInfoModUI.f218568z, a2);
                    contactRemarkInfoModUI.f218566y.mo62891a4(a2);
                    C72996z1 z1Var2 = contactRemarkInfoModUI.f218566y;
                    if (z1Var2 != null) {
                        z1Var2.f149534e1 = 1;
                        z1Var2.f149550u = true;
                    }
                    C97625j3.m125812b().mo105907v().mo69668Q3(contactRemarkInfoModUI.f218566y);
                }
            }
            String str = contactRemarkInfoModUI.f218502F;
            String str2 = contactRemarkInfoModUI.f218505I;
            String a3 = C1234b.m1358a(contactRemarkInfoModUI.f218506J);
            Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "[saveRemarkInfo] :%s :%s", contactRemarkInfoModUI.f218568z, str);
            C72996z1 z1Var3 = C97625j3.m125812b().mo105907v().get(contactRemarkInfoModUI.f218568z);
            if (z1Var3 == null || ((int) z1Var3.f108320R1) <= 0 || !z1Var3.mo62927s3()) {
                Log.m105920e("MiroMsg.ContactRemarkInfoModUI", "[saveRemarkInfo] is error!");
            } else {
                contactRemarkInfoModUI.f218566y.mo62860K2(str);
                contactRemarkInfoModUI.f218566y.mo62895d4(str2);
                contactRemarkInfoModUI.f218566y.mo62897e4(a3);
                contactRemarkInfoModUI.f218566y.getClass();
                C97625j3.m125812b().mo105907v().mo69719p3(contactRemarkInfoModUI.f218568z, contactRemarkInfoModUI.f218566y);
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(str2 == null);
                if (str2 != null) {
                    i = str2.length();
                }
                objArr[1] = Integer.valueOf(i);
                objArr[2] = str2 == null ? "" : Util.secPrint(str2);
                Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "remarkDesc (%s, %s, %s)", objArr);
                new UpdateSearchIndexAtOnceEvent().publish();
            }
            if (X7) {
                contactRemarkInfoModUI.f218563w = C76879j.m92723Q(contactRemarkInfoModUI, contactRemarkInfoModUI.getString(C0966R.string.a3h), contactRemarkInfoModUI.getString(C0966R.string.blc), true, false, (DialogInterface.OnCancelListener) null);
                if (!contactRemarkInfoModUI.f218508L || (arrayList = contactRemarkInfoModUI.f218506J) == null || arrayList.size() <= 0) {
                    C97625j3.m125815e().mo123460f(new C53320a(contactRemarkInfoModUI.f218568z, contactRemarkInfoModUI.f218501E));
                    return;
                }
                contactRemarkInfoModUI.f218507K.addAll(contactRemarkInfoModUI.f218506J);
                C74524m0 m0Var = new C74524m0(contactRemarkInfoModUI);
                contactRemarkInfoModUI.getClass();
                C78789e.f230535a.mo108703b(contactRemarkInfoModUI.f218507K, contactRemarkInfoModUI.f218526X, m0Var);
                return;
            }
            contactRemarkInfoModUI.finish();
        }
    }

    /* renamed from: J7 */
    public static void m88832J7(ContactRemarkInfoModUI contactRemarkInfoModUI, int i) {
        contactRemarkInfoModUI.mo103345P7();
        contactRemarkInfoModUI.f218510N.clear();
        contactRemarkInfoModUI.f218510N.addAll(contactRemarkInfoModUI.f218509M);
        contactRemarkInfoModUI.f218510N.addAll(contactRemarkInfoModUI.f218506J);
        Intent intent = new Intent(contactRemarkInfoModUI, ContactRemarkImagePreviewUI.class);
        intent.putExtra("Contact_User", contactRemarkInfoModUI.f218568z);
        intent.putExtra("remark_image_path", contactRemarkInfoModUI.f218510N);
        intent.putExtra("view_temp_remark_image", false);
        intent.putExtra("selected_item", i);
        intent.putExtra("view_only", false);
        contactRemarkInfoModUI.startActivityForResult(intent, 400);
    }

    /* renamed from: K7 */
    public static void m88833K7(ContactRemarkInfoModUI contactRemarkInfoModUI, int i) {
        contactRemarkInfoModUI.f218511P--;
        ArrayList<String> arrayList = contactRemarkInfoModUI.f218509M;
        int size = arrayList != null ? arrayList.size() : 0;
        ArrayList<String> arrayList2 = contactRemarkInfoModUI.f218506J;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        if (i < size) {
            C86013q1.m106447h(contactRemarkInfoModUI.f218509M.get(i));
            contactRemarkInfoModUI.f218509M.remove(i);
            if (contactRemarkInfoModUI.f218501E.size() > i) {
                contactRemarkInfoModUI.f218501E.remove(i);
            }
            if (contactRemarkInfoModUI.f218507K.size() > i) {
                contactRemarkInfoModUI.f218507K.remove(i);
            }
            contactRemarkInfoModUI.f218520U = true;
        } else {
            int i2 = i - size;
            if (i2 < size2) {
                contactRemarkInfoModUI.f218506J.remove(i2);
            }
        }
        contactRemarkInfoModUI.f218512Q.remove(i);
        if (i == 0) {
            contactRemarkInfoModUI.f218558r.setVisibility(8);
        } else if (i == 1) {
            contactRemarkInfoModUI.f218559s.setVisibility(8);
        } else if (i == 2) {
            contactRemarkInfoModUI.f218560t.setVisibility(8);
        }
        contactRemarkInfoModUI.f218554o.setVisibility(0);
        contactRemarkInfoModUI.f218555p.setVisibility(8);
        ArrayList<String> arrayList3 = contactRemarkInfoModUI.f218509M;
        if (arrayList3 != null) {
            size = arrayList3.size();
        }
        contactRemarkInfoModUI.mo103351V7(contactRemarkInfoModUI.f218509M, 0);
        contactRemarkInfoModUI.mo103351V7(contactRemarkInfoModUI.f218506J, size);
        contactRemarkInfoModUI.mo103344O7();
    }

    /* renamed from: L7 */
    public final void mo103341L7(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MiroMsg.ContactRemarkInfoModUI", "tag is empty");
            return;
        }
        String trim = str.trim();
        if (Util.isNullOrNil(trim)) {
            Log.m105928w("MiroMsg.ContactRemarkInfoModUI", "new tag is empty");
            return;
        }
        C72955b2 mI = C27740g.vx0().mo100954mI(trim);
        List<String> list = this.f218567y0;
        if (list == null || !list.contains(trim) || (mI != null && mI.field_isTemporary)) {
            this.f218519T0.add(trim);
        }
        HashSet<String> hashSet = this.f218517S0;
        if (hashSet != null && hashSet.contains(trim)) {
            this.f218517S0.remove(trim);
        }
    }

    /* renamed from: M7 */
    public final void mo103342M7(boolean z, int i) {
        if (!this.f218516S) {
            this.f218545i.setVisibility(0);
            View view = this.f218564x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (z && C77702q0.m93719b(this.f218505I)) {
            this.f218545i.setVisibility(0);
            View view3 = this.f218564x;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i == C0966R.C0970id.bob) {
            this.f218545i.setVisibility(8);
            View view5 = this.f218564x;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: N7 */
    public final boolean mo103343N7(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r0.f211633g == null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103344O7() {
        /*
            r7 = this;
            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView r0 = r7.f218538e1
            java.util.ArrayList r1 = r0.getPhoneNumberList()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003f
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0011
            goto L_0x003f
        L_0x0011:
            java.lang.String[] r4 = r0.f211633g
            if (r4 != 0) goto L_0x0016
            goto L_0x0045
        L_0x0016:
            int r4 = r1.size()
            java.lang.String[] r5 = r0.f211633g
            int r5 = r5.length
            if (r4 == r5) goto L_0x0020
            goto L_0x0045
        L_0x0020:
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x0025:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0043
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String[] r6 = r0.f211633g
            r6 = r6[r4]
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0025
        L_0x003f:
            java.lang.String[] r0 = r0.f211633g
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r0 = 0
            goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            r7.f218553n1 = r0
            boolean r0 = r7.mo103352W7()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r7.mo103353X7()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r7.mo103354Y7(r3)
            if (r0 != 0) goto L_0x0063
            boolean r0 = r7.f218553n1
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            r7.enableOptionMenu(r3)
            goto L_0x0066
        L_0x0063:
            r7.enableOptionMenu(r2)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.ContactRemarkInfoModUI.mo103344O7():void");
    }

    /* renamed from: P7 */
    public final void mo103345P7() {
        this.f218539f.setFocusableInTouchMode(true);
        this.f218539f.requestFocus();
        this.f218535d.clearFocus();
        this.f218541g.clearFocus();
        this.f218538e1.clearFocus();
        hideVKB();
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "onKeyboardHeightChanged, height:%s", Integer.valueOf(i));
        ObjectAnimator objectAnimator = this.f218549k1;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f218549k1.cancel();
        }
        ScrollView scrollView = this.f218552n;
        Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "container:%s", scrollView);
        if (scrollView != null) {
            ScrollView scrollView2 = this.f218552n;
            if (scrollView == scrollView2) {
                ArrayList arrayList = (ArrayList) mo103349T7(scrollView2);
                Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "onKeyboardHeightChanged, editTexts:%s", Integer.valueOf(arrayList.size()));
                if (!arrayList.isEmpty()) {
                    int[] iArr = new int[2];
                    ((EditText) arrayList.get(arrayList.size() - 1)).getLocationOnScreen(iArr);
                    i = iArr[1] - (C77751a.m93806a(getContext())[1] - i);
                } else {
                    return;
                }
            }
            Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "onKeyboardHeightChanged, translateHeigth:%s", Integer.valueOf(i));
            if (i > 0) {
                if (scrollView.getTranslationY() != 0.0f) {
                    scrollView.setTranslationY(0.0f);
                }
                this.f218549k1 = ObjectAnimator.ofFloat(scrollView, "translationY", new float[]{0.0f, (float) (-i)});
            } else {
                this.f218549k1 = ObjectAnimator.ofFloat(scrollView, "translationY", new float[]{scrollView.getTranslationY(), 0.0f});
            }
            this.f218549k1.setDuration(200);
            this.f218549k1.setInterpolator(new C109678b());
            this.f218549k1.addUpdateListener(new C6821f(this));
            this.f218549k1.start();
        }
    }

    /* renamed from: Q7 */
    public final String mo103346Q7(String str, int i) {
        if (!C86013q1.m106450k(str)) {
            return null;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        String c = C78795g.m95196e().mo108706c(this.f218568z, i);
        if (!BitmapUtil.createThumbNail(str, 1080, 1080, Bitmap.CompressFormat.JPEG, 80, c)) {
            Log.m105920e("MiroMsg.ContactRemarkInfoModUI", "createThumbNail big pic fail");
            return null;
        } else if (exifOrientation == 0 || BitmapUtil.rotate(c, exifOrientation, Bitmap.CompressFormat.JPEG, 80, c)) {
            return c;
        } else {
            Log.m105920e("MiroMsg.ContactRemarkInfoModUI", "rotate big pic fail");
            return null;
        }
    }

    /* renamed from: R7 */
    public final void mo103347R7() {
        Iterable<C86001b0> t;
        String a = C78795g.m95196e().mo108704a(this.f218568z);
        C86009m1 m1Var = new C86009m1(a);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (t = C86013q1.m106459t(a, true)) != null) {
            for (C86001b0 next : t) {
                if (next != null && !this.f218522V.contains(next.f250472b)) {
                    next.mo119954a();
                }
            }
        }
    }

    /* renamed from: S7 */
    public void mo103348S7(long j) {
        ((C119157j) C119157j.f356862d).mo183875f(new C74381g(j));
    }

    /* renamed from: T7 */
    public final List<EditText> mo103349T7(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof EditText) {
                    EditText editText = (EditText) childAt;
                    if (editText.isFocused()) {
                        arrayList.add(editText);
                    }
                }
                arrayList.addAll(mo103349T7(childAt));
            }
        }
        return arrayList;
    }

    /* renamed from: U7 */
    public final void mo103350U7() {
        boolean X7 = mo103353X7();
        boolean Y7 = mo103354Y7(true);
        boolean W7 = mo103352W7();
        if (X7 || Y7 || W7) {
            C76879j.m92707A(this, getString(C0966R.string.f360302bq2), (String) null, getString(C0966R.string.bq4), getString(C0966R.string.f360303bq3), new C74379d(), new C74380e());
            return;
        }
        mo103348S7(2);
        hideVKB();
        finish();
    }

    /* renamed from: V7 */
    public final void mo103351V7(ArrayList<String> arrayList, int i) {
        Bitmap decodeFile;
        this.f218555p.setVisibility(8);
        this.f218554o.setVisibility(0);
        if (arrayList != null && arrayList.size() != 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                float g = C76577a.m92156g(this);
                if (new C86009m1(next).mo119967g() && (decodeFile = BackwardSupportUtil.BitmapFactory.decodeFile(next, g)) != null) {
                    if (i == 0) {
                        this.f218511P = 1;
                        this.f218558r.setVisibility(0);
                        this.f218558r.setImageBitmap(decodeFile);
                        this.f218559s.setVisibility(8);
                        this.f218560t.setVisibility(8);
                    } else if (i == 1) {
                        this.f218511P = 2;
                        this.f218559s.setVisibility(0);
                        this.f218559s.setImageBitmap(decodeFile);
                        this.f218560t.setVisibility(8);
                    } else if (i == 2) {
                        this.f218511P = 3;
                        this.f218560t.setVisibility(0);
                        this.f218560t.setImageBitmap(decodeFile);
                        this.f218554o.setVisibility(8);
                        this.f218555p.setVisibility(0);
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: W7 */
    public final boolean mo103352W7() {
        String obj = this.f218541g.getText().toString();
        String str = this.f218505I;
        return (str == null || !str.equals(obj)) && (!C77702q0.m93719b(this.f218505I) || !C77702q0.m93719b(obj));
    }

    /* renamed from: X7 */
    public final boolean mo103353X7() {
        ArrayList<String> arrayList = this.f218506J;
        return (arrayList != null && arrayList.size() > 0) || this.f218520U;
    }

    /* renamed from: Y7 */
    public final boolean mo103354Y7(boolean z) {
        if (C77702q0.m93719b(this.f218502F)) {
            return this.f218514R;
        }
        String obj = this.f218535d.getText().toString();
        if (!z) {
            String str = this.f218502F;
            if (str == null || !str.equals(obj)) {
                return !C77702q0.m93719b(this.f218502F) || !C77702q0.m93719b(obj);
            }
            return false;
        }
        String str2 = this.f218502F;
        if ((str2 == null || !str2.equals(obj)) && (!C77702q0.m93719b(this.f218502F) || !C77702q0.m93719b(obj))) {
            return obj == null || !obj.equals(this.f218566y.getNickname());
        }
        return false;
    }

    /* renamed from: Z7 */
    public final void mo103355Z7() {
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f218568z);
        this.f218566y = z1Var;
        this.f218565x0 = z1Var.mo73974r2();
        this.f218513Q0 = ((C67001a) C28250a.m38138a()).mo90972j(this.f218565x0);
        this.f218567y0.clear();
        List<String> list = this.f218513Q0;
        if (list != null) {
            this.f218567y0.addAll(list);
        } else {
            this.f218567y0 = new ArrayList();
            this.f218513Q0 = new ArrayList();
        }
        List d = ((C67001a) C28250a.m38138a()).mo90966d();
        if (d != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) d;
                if (i >= arrayList.size()) {
                    break;
                }
                if (!this.f218567y0.contains(arrayList.get(i))) {
                    this.f218567y0.add((String) arrayList.get(i));
                }
                i++;
            }
        }
        ((ArrayList) this.f218515R0).clear();
        ((ArrayList) this.f218515R0).addAll(this.f218513Q0);
        for (String L7 : this.f218513Q0) {
            mo103341L7(L7);
        }
        this.f218525W0 = ((ArrayList) d).size();
        this.f218527X0 = this.f218513Q0.size();
        this.f218531Z0.addAll(this.f218513Q0);
        mo103356a8(this.f218513Q0);
    }

    /* renamed from: a8 */
    public final void mo103356a8(List<String> list) {
        if (list == null || list.size() == 0) {
            this.f218530Z.setText("");
            return;
        }
        int i = 0;
        String str = "";
        while (i < list.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(list.get(i));
            sb.append(i < list.size() + -1 ? "，" : "");
            str = sb.toString();
            i++;
        }
        this.f218530Z.setText(str);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7091xz;
    }

    public void initView() {
        boolean z;
        Class cls = C76979h.class;
        this.f218539f = (TextView) findViewById(C0966R.C0970id.bo6);
        this.f218543h = (TextView) findViewById(C0966R.C0970id.bof);
        this.f218545i = (TextView) findViewById(C0966R.C0970id.bob);
        this.f218552n = (ScrollView) findViewById(C0966R.C0970id.j4b);
        this.f218554o = (LinearLayout) findViewById(C0966R.C0970id.boc);
        this.f218555p = (TextView) findViewById(C0966R.C0970id.oep);
        this.f218535d = (MMClearEditText) findViewById(C0966R.C0970id.bo5);
        this.f218537e = findViewById(C0966R.C0970id.bdj);
        this.f218541g = (MMEditText) findViewById(C0966R.C0970id.bo4);
        this.f218558r = (ImageView) findViewById(C0966R.C0970id.oem);
        this.f218559s = (ImageView) findViewById(C0966R.C0970id.oeo);
        this.f218560t = (ImageView) findViewById(C0966R.C0970id.oen);
        C75044y4.m89990b(getContext());
        int i = C75044y4.m89990b(getContext()).x;
        if (i > 0) {
            int dimensionPixelSize = (i - getResources().getDimensionPixelSize(C0966R.dimen.f3761db)) / 3;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f218558r.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            this.f218558r.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f218559s.getLayoutParams();
            layoutParams2.width = dimensionPixelSize;
            layoutParams2.height = dimensionPixelSize;
            this.f218559s.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f218560t.getLayoutParams();
            layoutParams3.width = dimensionPixelSize;
            layoutParams3.height = dimensionPixelSize;
            this.f218560t.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f218554o.getLayoutParams();
            layoutParams4.width = dimensionPixelSize;
            layoutParams4.height = dimensionPixelSize;
            this.f218554o.setLayoutParams(layoutParams4);
        }
        this.f218564x = findViewById(C0966R.C0970id.f357776bo3);
        this.f218540f1 = findViewById(C0966R.C0970id.gpk);
        ProfileEditPhoneNumberView profileEditPhoneNumberView = (ProfileEditPhoneNumberView) findViewById(C0966R.C0970id.gxq);
        this.f218538e1 = profileEditPhoneNumberView;
        C72996z1 z1Var = this.f218566y;
        profileEditPhoneNumberView.f24012d = z1Var;
        if (this.f218544h1 == null && z1Var != null) {
            String str = z1Var.f149525Y0;
            this.f218544h1 = str;
            Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "is null phone, mContactPhoneNumberList: %s, mContactPhoneNumberByMD5: %s, ", str, this.f218542g1);
        }
        ProfileEditPhoneNumberView profileEditPhoneNumberView2 = this.f218538e1;
        String str2 = this.f218542g1;
        String str3 = this.f218544h1;
        profileEditPhoneNumberView2.f211631e = str2;
        profileEditPhoneNumberView2.f211632f = str3;
        profileEditPhoneNumberView2.mo100277e();
        ProfileEditPhoneNumberView profileEditPhoneNumberView3 = this.f218538e1;
        profileEditPhoneNumberView3.f211636j = new C74383i();
        View view = profileEditPhoneNumberView3.f211635i;
        if (!(view != null && view.getVisibility() == 0)) {
            View view2 = this.f218540f1;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view4 = this.f218540f1;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f218556p0 = (LinearLayout) findViewById(C0966R.C0970id.f357774bo1);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357773bo0);
        this.f218530Z = textView;
        textView.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f6151yq);
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_arrow, C76577a.m92153d(getContext(), C0966R.color.BW_70)));
        }
        this.f218556p0.setOnClickListener(this.f218528Y);
        String str4 = "";
        setMMTitle(str4);
        if (!C77702q0.m93719b(this.f218502F)) {
            MMClearEditText mMClearEditText = this.f218535d;
            C76979h hVar = (C76979h) C86312j.m106911c(cls);
            String str5 = this.f218502F;
            if (str5 == null) {
                str5 = str4;
            }
            mMClearEditText.setText(hVar.yp0(this, str5, this.f218535d.getTextSize()));
            TextView textView2 = this.f218543h;
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls);
            String str6 = this.f218502F;
            if (str6 == null) {
                str6 = str4;
            }
            textView2.setText(hVar2.yp0(this, str6, this.f218543h.getTextSize()));
        } else {
            MMClearEditText mMClearEditText2 = this.f218535d;
            C76979h hVar3 = (C76979h) C86312j.m106911c(cls);
            String j3 = this.f218566y.mo62909j3();
            if (j3 == null) {
                j3 = str4;
            }
            mMClearEditText2.setText(hVar3.yp0(this, j3, this.f218535d.getTextSize()));
            TextView textView3 = this.f218543h;
            C76979h hVar4 = (C76979h) C86312j.m106911c(cls);
            String j35 = this.f218566y.mo62909j3();
            if (j35 == null) {
                j35 = str4;
            }
            textView3.setHint(hVar4.yp0(this, j35, this.f218535d.getTextSize()));
        }
        if (this.f218535d.getText() != null) {
            this.f218503G = this.f218535d.getText().toString();
        }
        this.f218504H = this.f218502F;
        MMClearEditText mMClearEditText3 = this.f218535d;
        mMClearEditText3.setSelection(mMClearEditText3.getText().length());
        C76979h hVar5 = (C76979h) C86312j.m106911c(cls);
        String str7 = this.f218505I;
        if (str7 == null) {
            str7 = str4;
        }
        this.f218541g.setText(hVar5.yp0(this, str7, this.f218545i.getTextSize()));
        MMEditText mMEditText = this.f218541g;
        mMEditText.setSelection(mMEditText.getText().length());
        if (!C77702q0.m93719b(this.f218505I)) {
            TextView textView4 = this.f218545i;
            C76979h hVar6 = (C76979h) C86312j.m106911c(cls);
            String str8 = this.f218505I;
            if (str8 == null) {
                str8 = str4;
            }
            textView4.setText(hVar6.yp0(this, str8, this.f218545i.getTextSize()));
            this.f218545i.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0));
        }
        C77382c b = C77382c.m93286b(this.f218535d);
        b.f225611e = 0;
        b.f225610d = 32;
        b.mo107499d(new C6822j(this));
        this.f218543h.setOnClickListener(new C6823k());
        this.f218545i.setOnClickListener(new C6824l());
        this.f218535d.addTextChangedListener(this.f218546i1);
        this.f218541g.addTextChangedListener(this.f218548j1);
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 < this.f218499C && this.f218500D != null) {
                String d = C78795g.m95196e().mo108707d(this.f218568z, this.f218500D.get(i2).f130298d);
                Uri n = C116299g2.m163858n(d);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    this.f218509M.add(d);
                    if (i2 < this.f218512Q.size()) {
                        this.f218512Q.get(i2).f186188f = d;
                    }
                    if (i2 == 0 && this.f218500D.get(i2).f130299e == null) {
                        this.f218507K.add(d);
                        this.f218501E.remove(i2);
                    }
                } else {
                    C48662a4 a4Var = this.f218500D.get(i2);
                    C74520l0 l0Var = new C74520l0(this);
                    String str9 = this.f218568z;
                    LifecycleScope lifecycleScope = this.f218524W;
                    C87412m.m108594g(str9, "username");
                    C87412m.m108594g(a4Var, "cdnInfo");
                    C87412m.m108594g(lifecycleScope, "scope");
                    C78786d.f230534b = l0Var;
                    LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C78785c(str9, a4Var, i2, (C15601d<? super C78785c>) null), 1, (Object) null);
                }
            }
        }
        mo103351V7(this.f218509M, 0);
        this.f218558r.setOnClickListener(new C74456a0(this));
        this.f218559s.setOnClickListener(new C74465b0(this));
        this.f218560t.setOnClickListener(new C74468c0(this));
        this.f218558r.setOnLongClickListener(new C74473d0(this));
        this.f218559s.setOnLongClickListener(new C74478e0(this));
        this.f218560t.setOnLongClickListener(new C74486f0(this));
        this.f218554o.setOnClickListener(new C6825m());
        C76166a a = C75398e.vx0().mo106401a(this.f218566y.getUsername());
        if (a == null || C77702q0.m93719b(a.mo106388h()) || a.mo106388h().equals(this.f218535d.getText().toString())) {
            z = false;
        } else {
            this.f218561u = (TextView) findViewById(C0966R.C0970id.f358763gy0);
            View findViewById = findViewById(C0966R.C0970id.gxr);
            this.f218562v = findViewById;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = findViewById;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView5 = this.f218561u;
            String string = getString(C0966R.string.bqs, new Object[]{a.mo106388h()});
            if (string == null) {
                string = str4;
            }
            textView5.setText(string);
            C75375u uVar = new C75375u(getString(C0966R.string.ll_));
            uVar.mo105705b(new C6826q(a.mo106388h()), 0, uVar.length(), 17);
            this.f218561u.append(" ");
            this.f218561u.append(uVar);
            this.f218561u.setMovementMethod(LinkMovementMethod.getInstance());
            z = true;
        }
        if (!z && this.f218497A == 14 && !C77702q0.m93719b(this.f218498B) && !this.f218498B.equals(this.f218535d.getText().toString())) {
            this.f218561u = (TextView) findViewById(C0966R.C0970id.f358763gy0);
            View findViewById2 = findViewById(C0966R.C0970id.gxr);
            this.f218562v = findViewById2;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view7 = findViewById2;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "iniChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "iniChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView6 = this.f218561u;
            C76979h hVar7 = (C76979h) C86312j.m106911c(cls);
            String string2 = getString(C0966R.string.bqr, new Object[]{this.f218498B});
            if (string2 != null) {
                str4 = string2;
            }
            textView6.setText(hVar7.yp0(this, str4, this.f218561u.getTextSize()));
            C75375u uVar2 = new C75375u(getString(C0966R.string.ll_));
            uVar2.mo105705b(new C6826q(this.f218498B), 0, uVar2.length(), 17);
            this.f218561u.append(" ");
            this.f218561u.append(uVar2);
            this.f218561u.setMovementMethod(LinkMovementMethod.getInstance());
        }
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C74384n(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C74378a());
        if (C77702q0.m93719b(this.f218502F)) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        if (!this.f218518T) {
            Log.m105924i("MiroMsg.ContactRemarkInfoModUI", "oncreate initWithViewMode");
            this.f218516S = true;
            mo103342M7(true, -1);
        }
        mo103345P7();
        View view8 = this.f218537e;
        if (view8 != null) {
            view8.setOnClickListener(new C6819b());
        }
    }

    public boolean isHideVKBWhenScroll() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 0;
        Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 100) {
            Context applicationContext = getApplicationContext();
            C97625j3.m125812b().getClass();
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(applicationContext, intent, C7970a.m8127a());
            if (g6 != null) {
                String Q7 = mo103346Q7(g6, this.f218506J.size());
                this.f218506J.add(Q7);
                C64812wq3 wq32 = new C64812wq3();
                wq32.f186188f = Q7;
                wq32.f186189g = true;
                this.f218512Q.add(wq32);
                ArrayList<String> arrayList = this.f218509M;
                if (arrayList != null && arrayList.size() > 0) {
                    i3 = this.f218509M.size();
                }
                mo103351V7(this.f218506J, i3);
                mo103344O7();
            }
        } else if (i != 200) {
            if (i != 400) {
                if (i == 600) {
                    if (intent == null) {
                        Log.m105920e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
                        return;
                    }
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
                    List<String> d = ((C67001a) C28250a.m38138a()).mo90966d();
                    if (mo103343N7(stringArrayListExtra, this.f218515R0) || mo103343N7(d, this.f218567y0)) {
                        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                        if (stringArrayListExtra2 != null) {
                            this.f218532a1.addAll(stringArrayListExtra2);
                        }
                        ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                        if (stringArrayListExtra3 != null) {
                            this.f218533b1.addAll(stringArrayListExtra3);
                        }
                        ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                        if (stringArrayListExtra4 != null) {
                            this.f218536d1.addAll(stringArrayListExtra4);
                        }
                        ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                        if (stringArrayListExtra5 != null) {
                            this.f218534c1.addAll(stringArrayListExtra5);
                        }
                        Iterator<String> it = stringArrayListExtra.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (!((ArrayList) this.f218515R0).contains(next)) {
                                mo103341L7(next);
                            }
                        }
                        Iterator it4 = ((ArrayList) this.f218515R0).iterator();
                        while (it4.hasNext()) {
                            String str = (String) it4.next();
                            if (!stringArrayListExtra.contains(str)) {
                                List<String> list = this.f218513Q0;
                                if (list != null && list.contains(str)) {
                                    this.f218517S0.add(str);
                                }
                                HashSet<String> hashSet = this.f218519T0;
                                if (hashSet != null && hashSet.contains(str)) {
                                    this.f218519T0.remove(str);
                                }
                            }
                        }
                        if (this.f218567y0 == null) {
                            this.f218567y0 = new ArrayList();
                        }
                        this.f218567y0 = d;
                        Iterator<String> it5 = stringArrayListExtra.iterator();
                        while (it5.hasNext()) {
                            String next2 = it5.next();
                            if (this.f218567y0.contains(next2)) {
                                this.f218567y0.remove(next2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(this.f218567y0);
                        this.f218567y0.clear();
                        this.f218567y0.addAll(stringArrayListExtra);
                        this.f218567y0.addAll(arrayList2);
                        ((ArrayList) this.f218515R0).clear();
                        ((ArrayList) this.f218515R0).addAll(stringArrayListExtra);
                        mo103356a8(this.f218515R0);
                        if (mo103354Y7(true) || mo103352W7() || mo103353X7() || intent.getBooleanExtra("hasLableChange", false)) {
                            enableOptionMenu(true);
                        } else {
                            enableOptionMenu(false);
                        }
                    }
                }
            } else if (intent == null) {
                Log.m105920e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
            } else if (intent.getBooleanExtra("response_delete", false)) {
                ArrayList<String> stringArrayListExtra6 = intent.getStringArrayListExtra("remark_image_path");
                if (stringArrayListExtra6 == null || stringArrayListExtra6.size() == 0) {
                    this.f218511P = 0;
                    this.f218558r.setVisibility(8);
                    this.f218559s.setVisibility(8);
                    this.f218560t.setVisibility(8);
                    this.f218520U = true;
                }
                mo103351V7(stringArrayListExtra6, 0);
                this.f218501E.clear();
                this.f218509M.clear();
                this.f218506J.clear();
                while (i3 < this.f218512Q.size()) {
                    C64812wq3 wq33 = this.f218512Q.get(i3);
                    if (stringArrayListExtra6.contains(wq33.f186188f)) {
                        if (wq33.f186189g || C77702q0.m93719b(wq33.f186187e)) {
                            this.f218506J.add(wq33.f186188f);
                        } else {
                            this.f218509M.add(wq33.f186188f);
                            C51712vn vnVar = new C51712vn();
                            vnVar.f143570d = wq33.f186186d;
                            vnVar.f143571e = wq33.f186187e;
                            this.f218501E.add(vnVar);
                        }
                    }
                    i3++;
                }
                mo103344O7();
            }
        } else if (intent == null) {
            Log.m105920e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
        } else {
            Iterator<String> it6 = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it6.hasNext()) {
                String Q72 = mo103346Q7(it6.next(), this.f218506J.size());
                this.f218506J.add(Q72);
                C64812wq3 wq34 = new C64812wq3();
                wq34.f186188f = Q72;
                wq34.f186189g = true;
                this.f218512Q.add(wq34);
            }
            ArrayList<String> arrayList3 = this.f218509M;
            if (arrayList3 != null && arrayList3.size() > 0) {
                i3 = this.f218509M.size();
            }
            mo103351V7(this.f218506J, i3);
            mo103344O7();
        }
    }

    public void onCreate(Bundle bundle) {
        MMClearEditText mMClearEditText;
        String str;
        super.onCreate(bundle);
        C97625j3.m125815e().mo123455a(575, this);
        C97625j3.m125815e().mo123455a(576, this);
        C97625j3.m125815e().mo123455a(638, this);
        this.f218497A = getIntent().getIntExtra("Contact_Scene", 9);
        this.f218498B = getIntent().getStringExtra("Contact_RoomNickname");
        this.f218518T = getIntent().getBooleanExtra("view_mode", false);
        getIntent().getStringExtra("contact_auto_app_phone_from_chatting");
        this.f218542g1 = getIntent().getStringExtra("contact_phone_number_by_md5");
        this.f218544h1 = getIntent().getStringExtra("contact_phone_number_list");
        String stringExtra = getIntent().getStringExtra("Contact_User");
        this.f218568z = stringExtra;
        if (C77702q0.m93719b(stringExtra)) {
            finish();
            return;
        }
        this.f218523V0 = System.currentTimeMillis();
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f218568z);
        this.f218566y = z1Var;
        this.f218502F = z1Var.mo73969n2();
        C72996z1 z1Var2 = this.f218566y;
        this.f218505I = z1Var2.f149513S0;
        z1Var2.getClass();
        this.f218565x0 = this.f218566y.mo73974r2();
        this.f218513Q0 = ((C67001a) C28250a.m38138a()).mo90972j(this.f218565x0);
        ((ArrayList) this.f218515R0).clear();
        List<String> list = this.f218513Q0;
        if (list != null) {
            ((ArrayList) this.f218515R0).addAll(list);
        } else {
            this.f218513Q0 = new ArrayList();
        }
        C72996z1 z1Var3 = this.f218566y;
        boolean z = true;
        if (z1Var3 != null) {
            C49072d00 q2 = z1Var3.mo73973q2();
            if (q2 != null) {
                LinkedList<C48662a4> linkedList = q2.f132050d;
                this.f218500D = linkedList;
                if (linkedList != null) {
                    this.f218499C = linkedList.size();
                    this.f218522V.clear();
                    Iterator<C48662a4> it = this.f218500D.iterator();
                    while (it.hasNext()) {
                        C48662a4 next = it.next();
                        C51712vn vnVar = new C51712vn();
                        vnVar.f143570d = next.f130298d;
                        vnVar.f143571e = next.f130299e;
                        this.f218501E.add(vnVar);
                        C64812wq3 wq32 = new C64812wq3();
                        wq32.f186186d = next.f130298d;
                        wq32.f186187e = next.f130299e;
                        this.f218512Q.add(wq32);
                        ArrayList<String> arrayList = this.f218522V;
                        C78795g e = C78795g.m95196e();
                        String str2 = this.f218568z;
                        String str3 = next.f130298d;
                        e.getClass();
                        if (Util.isNullOrNil(str2)) {
                            str = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("remark_");
                            sb.append(C90193h.m112878f((str2 + "ZnVjaw==").getBytes()));
                            sb.append("_" + C90193h.m112878f(str3.getBytes()));
                            sb.append(".png");
                            str = sb.toString();
                        }
                        arrayList.add(str);
                    }
                }
            } else {
                C45628s0.m50761Z(this.f218566y, true);
            }
            mo103347R7();
        }
        initView();
        mo103344O7();
        C72996z1 z1Var4 = this.f218566y;
        if (z1Var4 == null || !C72996z1.m85843n5(z1Var4.getUsername())) {
            z = false;
        }
        if (z && (mMClearEditText = this.f218535d) != null) {
            ViewGroup viewGroup = (ViewGroup) mMClearEditText.getParent().getParent();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            int childCount = viewGroup2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup2.getChildAt(i);
                if (childAt != viewGroup) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        mo103355Z7();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        this.mController.mo177105z0(getResources().getColor(C0966R.color.al6));
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f218557q = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(638, this);
        C97625j3.m125815e().mo123470p(575, this);
        C97625j3.m125815e().mo123470p(576, this);
        this.f218535d.removeTextChangedListener(this.f218546i1);
        this.f218541g.removeTextChangedListener(this.f218548j1);
        KeyboardHeightProvider keyboardHeightProvider = this.f218557q;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        LifecycleScope lifecycleScope = this.f218524W;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
        LifecycleScope lifecycleScope2 = this.f218526X;
        if (lifecycleScope2 != null) {
            lifecycleScope2.onDestroy();
        }
        C78789e.f230536b = null;
        C78786d.f230534b = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        mo103350U7();
        return true;
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        C97625j3.m125812b().mo105907v().remove(this.f218550l1);
        KeyboardHeightProvider keyboardHeightProvider = this.f218557q;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        C97625j3.m125812b().mo105907v().add(this.f218550l1);
        KeyboardHeightProvider keyboardHeightProvider = this.f218557q;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ArrayList<String> arrayList;
        Log.m105924i("MiroMsg.ContactRemarkInfoModUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f218563w;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f218563w = null;
        }
        ProgressDialog progressDialog2 = this.f218547j;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f218547j.dismiss();
        }
        if (i != 0 || i2 != 0) {
            C76879j.m92748s(this, getString(C0966R.string.f7965xp), (String) null);
        } else if (yVar.getType() == 575) {
            if (!((i != 0 && i2 != 0) || (arrayList = this.f218506J) == null || arrayList.size() == 0)) {
                int i3 = 0;
                ArrayList<String> arrayList2 = this.f218509M;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    i3 = this.f218509M.size();
                }
                Iterator<String> it = this.f218506J.iterator();
                while (it.hasNext()) {
                    String d = C78795g.m95196e().mo108707d(this.f218568z, this.f218501E.get(i3).f143570d);
                    C86013q1.m106442c(it.next(), d);
                    this.f218509M.add(d);
                    i3++;
                }
            }
            finish();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f218557q;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15697f.class);
    }
}
