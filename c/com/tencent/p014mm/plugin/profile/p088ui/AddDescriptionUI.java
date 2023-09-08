package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C1234b;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f12.C7970a;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import li2.C10531a;
import nj3.C76879j;
import p140cw.C7138g;
import p256vw.C15014e;
import p256vw.C15016h;
import qn3.C77382c;
import qo3.C77407n;
import sf0.C77702q0;
import tc0.C77885p;
import te3.C50467my2;
import xc0.C78795g;

/* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI */
public class AddDescriptionUI extends MMActivity implements C7020t0 {

    /* renamed from: E */
    public static final /* synthetic */ int f202484E = 0;

    /* renamed from: A */
    public String f202485A;

    /* renamed from: B */
    public int[] f202486B = new int[3];

    /* renamed from: C */
    public C70146g f202487C = new C70146g((C4937c) null);

    /* renamed from: D */
    public boolean f202488D = true;

    /* renamed from: d */
    public LinearLayout f202489d;

    /* renamed from: e */
    public MMEditText f202490e;

    /* renamed from: f */
    public TextView f202491f;

    /* renamed from: g */
    public View f202492g;

    /* renamed from: h */
    public ImageView f202493h;

    /* renamed from: i */
    public ImageView f202494i;

    /* renamed from: j */
    public ImageView f202495j;

    /* renamed from: n */
    public View f202496n;

    /* renamed from: o */
    public TextView f202497o;

    /* renamed from: p */
    public TextView f202498p;

    /* renamed from: q */
    public int f202499q = 0;

    /* renamed from: r */
    public boolean f202500r = false;

    /* renamed from: s */
    public String f202501s;

    /* renamed from: t */
    public String f202502t;

    /* renamed from: u */
    public ArrayList<String> f202503u = new ArrayList<>();

    /* renamed from: v */
    public ArrayList<String> f202504v = new ArrayList<>();

    /* renamed from: w */
    public ArrayList<String> f202505w = new ArrayList<>();

    /* renamed from: x */
    public C72996z1 f202506x;

    /* renamed from: y */
    public C44673z4 f202507y;

    /* renamed from: z */
    public String f202508z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$a */
    public class C4936a implements DialogInterface.OnClickListener {
        public C4936a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AddDescriptionUI.m82637I7(AddDescriptionUI.this, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$c */
    public class C4937c implements View.OnClickListener {
        public C4937c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AddDescriptionUI addDescriptionUI = AddDescriptionUI.this;
            addDescriptionUI.f202500r = true;
            int id = view.getId();
            if (!addDescriptionUI.f202500r) {
                addDescriptionUI.f202491f.setVisibility(0);
                View view2 = addDescriptionUI.f202492g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/AddDescriptionUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (id == C0966R.C0970id.nyg) {
                addDescriptionUI.f202491f.setVisibility(8);
                View view4 = addDescriptionUI.f202492g;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/AddDescriptionUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI", "applyEditModeForDesc", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AddDescriptionUI.this.f202490e.performClick();
            AddDescriptionUI.this.f202490e.requestFocus();
            AddDescriptionUI.this.showVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$d */
    public class C4938d implements View.OnClickListener {
        public C4938d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AddDescriptionUI addDescriptionUI = AddDescriptionUI.this;
            int i = AddDescriptionUI.f202484E;
            C77407n nVar = new C77407n((Context) addDescriptionUI.getContext(), 1, true);
            nVar.f225771i = new C4984e(addDescriptionUI);
            nVar.f225782p = new C4987f(addDescriptionUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$e */
    public class C4939e implements MenuItem.OnMenuItemClickListener {
        public C4939e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AddDescriptionUI addDescriptionUI = AddDescriptionUI.this;
            int i = AddDescriptionUI.f202484E;
            addDescriptionUI.getClass();
            Intent intent = new Intent();
            intent.putExtra("Contact_get_desc_report_data", addDescriptionUI.f202486B);
            addDescriptionUI.setResult(-1, intent);
            AddDescriptionUI.m82637I7(AddDescriptionUI.this, true);
            AddDescriptionUI.this.hideVKB();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$f */
    public class C4940f implements MenuItem.OnMenuItemClickListener {
        public C4940f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AddDescriptionUI addDescriptionUI = AddDescriptionUI.this;
            int i = AddDescriptionUI.f202484E;
            addDescriptionUI.mo96568N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$h */
    public class C4941h extends ClickableSpan {

        /* renamed from: d */
        public String f20118d;

        /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$h$a */
        public class C4942a implements C15014e {

            /* renamed from: a */
            public final /* synthetic */ CharSequence f20120a;

            public C4942a(CharSequence charSequence) {
                this.f20120a = charSequence;
            }

            /* renamed from: a */
            public void mo5899a(String str) {
                AddDescriptionUI.this.f202486B[1] = 1;
                if (!C77702q0.m93719b(str)) {
                    AddDescriptionUI.this.f202486B[2] = 1;
                }
                MMEditText mMEditText = AddDescriptionUI.this.f202490e;
                mMEditText.setText(this.f20120a + str);
                AddDescriptionUI.this.f202490e.clearFocus();
                View view = AddDescriptionUI.this.f202496n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C4941h(String str) {
            this.f20118d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            Editable text = AddDescriptionUI.this.f202490e.getText();
            C10531a.m10449a(AddDescriptionUI.this.getContext(), new C15016h(this.f20118d, C45078p0.m49926e(text.toString(), C45078p0.C45079a.MODE_CHINESE_AS_2), 400, new C4942a(text)));
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(AddDescriptionUI.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$b */
    public class C70145b implements DialogInterface.OnClickListener {
        public C70145b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AddDescriptionUI.this.f202505w.clear();
            AddDescriptionUI addDescriptionUI = AddDescriptionUI.this;
            addDescriptionUI.f202505w.addAll(addDescriptionUI.f202504v);
            AddDescriptionUI.this.mo96567M7();
            AddDescriptionUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI$g */
    public class C70146g implements TextWatcher {
        public C70146g(C4937c cVar) {
        }

        public void afterTextChanged(Editable editable) {
            int c;
            C45078p0.m49923b(400, editable.toString());
            AddDescriptionUI.this.f202490e.removeTextChangedListener(this);
            String obj = editable.toString();
            if (!Util.isNullOrNil(obj)) {
                int f = C45078p0.m49927f(obj);
                C45078p0.m49925d(400, obj);
                if (f > 400 && (c = C45078p0.m49924c(400, obj)) > 0 && c < 400 && c < obj.length()) {
                    AddDescriptionUI.this.f202490e.setText(obj.substring(0, c + 1));
                    MMEditText mMEditText = AddDescriptionUI.this.f202490e;
                    mMEditText.setSelection(mMEditText.getText().length());
                    C74804o4.m89546a();
                }
            }
            AddDescriptionUI.this.f202490e.addTextChangedListener(this);
            AddDescriptionUI.this.mo96565K7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: H7 */
    public static void m82636H7(AddDescriptionUI addDescriptionUI, int i) {
        addDescriptionUI.f202499q--;
        addDescriptionUI.f202503u.remove(i);
        if (i == 0) {
            addDescriptionUI.f202493h.setVisibility(8);
        } else if (i == 1) {
            addDescriptionUI.f202494i.setVisibility(8);
        } else if (i == 2) {
            addDescriptionUI.f202495j.setVisibility(8);
        }
        addDescriptionUI.f202489d.setVisibility(0);
        addDescriptionUI.f202498p.setVisibility(8);
        addDescriptionUI.mo96571Q7(addDescriptionUI.f202503u, 0);
        addDescriptionUI.mo96565K7();
    }

    /* renamed from: I7 */
    public static void m82637I7(AddDescriptionUI addDescriptionUI, boolean z) {
        addDescriptionUI.f202488D = true;
        C77382c b = C77382c.m93286b(addDescriptionUI.f202490e);
        int i = 0;
        b.f225611e = 0;
        b.f225610d = 400;
        b.mo107499d(new C70262d(addDescriptionUI));
        if (addDescriptionUI.f202488D) {
            if (addDescriptionUI.mo96570P7()) {
                if (z) {
                    ArrayList<String> arrayList = addDescriptionUI.f202503u;
                    int size = arrayList != null ? arrayList.size() : 0;
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            String c = C78795g.m95196e().mo108706c(addDescriptionUI.f202508z, i2);
                            if (!c.equals(addDescriptionUI.f202503u.get(i2))) {
                                C86013q1.m106442c(addDescriptionUI.f202503u.get(i2), c);
                                C86013q1.m106447h(addDescriptionUI.f202503u.get(i2));
                            }
                            addDescriptionUI.f202505w.add(c);
                        }
                    }
                } else {
                    addDescriptionUI.f202505w.clear();
                    addDescriptionUI.f202505w.addAll(addDescriptionUI.f202504v);
                }
                addDescriptionUI.mo96567M7();
            }
            Log.m105925i("MiroMsg.AddDescriptionUI", "[dealModRemarkDesc] :%s", addDescriptionUI.f202508z);
            if (addDescriptionUI.mo96569O7()) {
                String obj = addDescriptionUI.f202490e.getText().toString();
                addDescriptionUI.f202501s = obj;
                C50467my2 my22 = new C50467my2();
                my22.f138287d = addDescriptionUI.f202508z;
                my22.f138288e = obj;
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(54, my22));
            }
            String str = addDescriptionUI.f202501s;
            String a = C1234b.m1358a(addDescriptionUI.f202505w);
            Log.m105925i("MiroMsg.AddDescriptionUI", "[saveStrangerRemarkInfo] :%s ", addDescriptionUI.f202508z);
            if (C97625j3.m125812b().mo105907v().get(addDescriptionUI.f202508z) != null) {
                addDescriptionUI.f202506x.mo62895d4(str);
                addDescriptionUI.f202506x.mo62897e4(a);
                addDescriptionUI.f202506x.getClass();
                Log.m105925i("MiroMsg.AddDescriptionUI", "saveStrangerRemarkInfo ret %s, remarkImgUrl:%s", Boolean.valueOf(C97625j3.m125812b().mo105907v().mo69668Q3(addDescriptionUI.f202506x)), a);
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(str == null);
                if (str != null) {
                    i = str.length();
                }
                objArr[1] = Integer.valueOf(i);
                objArr[2] = str == null ? "" : Util.secPrint(str);
                Log.m105925i("MiroMsg.AddDescriptionUI", "remarkDesc (%s, %s, %s)", objArr);
            }
            C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(addDescriptionUI.f202508z);
            if (Lo != null) {
                Lo.field_encryptUsername = addDescriptionUI.f202508z;
                Lo.field_conDescription = str;
                ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
            }
            addDescriptionUI.finish();
        }
    }

    /* renamed from: J7 */
    public static void m82638J7(AddDescriptionUI addDescriptionUI, int i) {
        addDescriptionUI.getClass();
        Intent intent = new Intent(addDescriptionUI, ContactRemarkImagePreviewUI.class);
        intent.putExtra("Contact_User", addDescriptionUI.f202508z);
        intent.putExtra("remark_image_path", addDescriptionUI.f202503u);
        intent.putExtra("selected_item", i);
        intent.putExtra("view_only", false);
        addDescriptionUI.startActivityForResult(intent, 400);
    }

    /* renamed from: K7 */
    public final void mo96565K7() {
        if (mo96569O7() || mo96570P7()) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
    }

    /* renamed from: L7 */
    public final String mo96566L7(String str, int i) {
        if (!C86013q1.m106450k(str)) {
            return null;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        String str2 = C78795g.m95196e().mo108706c(this.f202508z, i) + ".tmp";
        if (!BitmapUtil.createThumbNail(str, 1080, 1080, Bitmap.CompressFormat.JPEG, 80, str2)) {
            Log.m105920e("MiroMsg.AddDescriptionUI", "createThumbNail big pic fail");
            return null;
        } else if (exifOrientation == 0 || BitmapUtil.rotate(str2, exifOrientation, Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        } else {
            Log.m105920e("MiroMsg.AddDescriptionUI", "rotate big pic fail");
            return null;
        }
    }

    /* renamed from: M7 */
    public final void mo96567M7() {
        Iterable<C86001b0> t;
        String a = C78795g.m95196e().mo108704a(this.f202508z);
        C86009m1 m1Var = new C86009m1(a);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (t = C86013q1.m106459t(a, true)) != null) {
            for (C86001b0 next : t) {
                if (next != null) {
                    if (!this.f202505w.contains(a + next.f250472b)) {
                        next.mo119954a();
                    }
                }
            }
        }
    }

    /* renamed from: N7 */
    public final void mo96568N7() {
        Intent intent = new Intent();
        intent.putExtra("Contact_get_desc_report_data", this.f202486B);
        setResult(-1, intent);
        if (mo96569O7() || mo96570P7()) {
            C76879j.m92707A(this, getString(C0966R.string.f360302bq2), (String) null, getString(C0966R.string.bq4), getString(C0966R.string.f360303bq3), new C4936a(), new C70145b());
            return;
        }
        hideVKB();
        finish();
    }

    /* renamed from: O7 */
    public final boolean mo96569O7() {
        String obj = this.f202490e.getText().toString();
        String str = this.f202501s;
        return (str == null || !str.equals(obj)) && (!C77702q0.m93719b(this.f202501s) || !C77702q0.m93719b(obj));
    }

    /* renamed from: P7 */
    public final boolean mo96570P7() {
        return this.f202504v.size() != this.f202503u.size() || !this.f202504v.containsAll(this.f202503u);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
    }

    /* renamed from: Q7 */
    public final void mo96571Q7(ArrayList<String> arrayList, int i) {
        Bitmap decodeFile;
        this.f202498p.setVisibility(8);
        this.f202489d.setVisibility(0);
        if (arrayList != null && arrayList.size() != 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                float g = C76577a.m92156g(this);
                if (new C86009m1(next).mo119967g() && (decodeFile = BackwardSupportUtil.BitmapFactory.decodeFile(next, g)) != null) {
                    if (i == 0) {
                        this.f202499q = 1;
                        this.f202493h.setVisibility(0);
                        this.f202493h.setImageBitmap(decodeFile);
                        this.f202494i.setVisibility(8);
                        this.f202495j.setVisibility(8);
                    } else if (i == 1) {
                        this.f202499q = 2;
                        this.f202494i.setVisibility(0);
                        this.f202494i.setImageBitmap(decodeFile);
                        this.f202495j.setVisibility(8);
                    } else if (i == 2) {
                        this.f202499q = 3;
                        this.f202495j.setVisibility(0);
                        this.f202495j.setImageBitmap(decodeFile);
                        this.f202489d.setVisibility(8);
                        this.f202498p.setVisibility(0);
                    }
                    i++;
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d3j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0295  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r14 = this;
            r0 = 2131300259(0x7f090fa3, float:1.8218543E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r14.f202489d = r0
            r0 = 2131312152(0x7f093e18, float:1.8242664E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.f202491f = r0
            r0 = 2131309433(0x7f093379, float:1.823715E38)
            android.view.View r0 = r14.findViewById(r0)
            com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0
            r14.f202490e = r0
            r0 = 2131309432(0x7f093378, float:1.8237148E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.f202492g = r0
            r0 = 2131306359(0x7f092777, float:1.8230915E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.f202493h = r0
            r0 = 2131306361(0x7f092779, float:1.8230919E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.f202494i = r0
            r0 = 2131306360(0x7f092778, float:1.8230917E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.f202495j = r0
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r14.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r0 = r0.x
            r1 = 3
            if (r0 <= 0) goto L_0x00b0
            android.content.res.Resources r2 = r14.getResources()
            r3 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r2 = r2.getDimensionPixelSize(r3)
            int r0 = r0 - r2
            int r0 = r0 / r1
            android.widget.ImageView r2 = r14.f202493h
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.width = r0
            r2.height = r0
            android.widget.ImageView r3 = r14.f202493h
            r3.setLayoutParams(r2)
            android.widget.ImageView r2 = r14.f202494i
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.width = r0
            r2.height = r0
            android.widget.ImageView r3 = r14.f202494i
            r3.setLayoutParams(r2)
            android.widget.ImageView r2 = r14.f202495j
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.width = r0
            r2.height = r0
            android.widget.ImageView r3 = r14.f202495j
            r3.setLayoutParams(r2)
            android.widget.LinearLayout r2 = r14.f202489d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.width = r0
            r2.height = r0
            android.widget.LinearLayout r0 = r14.f202489d
            r0.setLayoutParams(r2)
        L_0x00b0:
            r0 = 2131309436(0x7f09337c, float:1.8237156E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.f202496n = r0
            r0 = 2131309437(0x7f09337d, float:1.8237158E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.f202497o = r0
            r0 = 2131306380(0x7f09278c, float:1.8230957E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.f202498p = r0
            java.lang.String r0 = r14.f202485A
            boolean r0 = sf0.C77702q0.m93719b(r0)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = r14.f202485A
            goto L_0x0109
        L_0x00dc:
            com.tencent.mm.storage.n3 r0 = fd0.C75743h.wx0()
            java.lang.String r4 = r14.f202508z
            com.tencent.mm.storage.m3 r0 = r0.mo101190bD(r4)
            if (r0 != 0) goto L_0x00ea
            goto L_0x01ab
        L_0x00ea:
            ae3.b r0 = ae3.C67030b.m79187b(r14, r0)
            java.lang.String r4 = r0.f192525b
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01ab
            java.lang.String r4 = r0.f192525b
            r5 = 2131830284(0x7f11260c, float:1.929356E38)
            java.lang.String r5 = r14.getString(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0107
            goto L_0x01ab
        L_0x0107:
            java.lang.String r0 = r0.f192525b
        L_0x0109:
            boolean r4 = sf0.C77702q0.m93719b(r0)
            if (r4 != 0) goto L_0x01ab
            int[] r4 = r14.f202486B
            r4[r3] = r2
            android.view.View r4 = r14.f202496n
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/profile/ui/AddDescriptionUI"
            java.lang.String r8 = "initVerifyNameArea"
            java.lang.String r9 = "()Z"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/AddDescriptionUI"
            java.lang.String r7 = "initVerifyNameArea"
            java.lang.String r8 = "()Z"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r4
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.widget.TextView r4 = r14.f202497o
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            r6 = 2131824308(0x7f110eb4, float:1.928144E38)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r0
            java.lang.String r6 = r14.getString(r6, r7)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            android.widget.TextView r7 = r14.f202497o
            float r7 = r7.getTextSize()
            android.text.SpannableString r5 = r5.yp0(r14, r6, r7)
            r4.setText(r5)
            de3.u r4 = new de3.u
            r5 = 2131840235(0x7f114ceb, float:1.9313744E38)
            java.lang.String r5 = r14.getString(r5)
            r4.<init>((java.lang.String) r5)
            com.tencent.mm.plugin.profile.ui.AddDescriptionUI$h r5 = new com.tencent.mm.plugin.profile.ui.AddDescriptionUI$h
            r5.<init>(r0)
            int r0 = r4.length()
            r6 = 17
            r4.mo105705b(r5, r3, r0, r6)
            android.widget.TextView r0 = r14.f202497o
            java.lang.String r5 = " "
            r0.append(r5)
            android.widget.TextView r0 = r14.f202497o
            r0.append(r4)
            android.widget.TextView r0 = r14.f202497o
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r4)
        L_0x01ab:
            com.tencent.mm.ui.widget.MMEditText r0 = r14.f202490e
            r0.performClick()
            com.tencent.mm.ui.widget.MMEditText r0 = r14.f202490e
            r0.requestFocus()
            r14.showVKB()
            android.widget.TextView r0 = r14.f202491f
            com.tencent.mm.plugin.profile.ui.AddDescriptionUI$c r4 = new com.tencent.mm.plugin.profile.ui.AddDescriptionUI$c
            r4.<init>()
            r0.setOnClickListener(r4)
            com.tencent.mm.ui.widget.MMEditText r0 = r14.f202490e
            com.tencent.mm.plugin.profile.ui.AddDescriptionUI$g r4 = r14.f202487C
            r0.addTextChangedListener(r4)
            r0 = 0
        L_0x01ca:
            if (r0 >= r1) goto L_0x0220
            xc0.g r4 = xc0.C78795g.m95196e()
            java.lang.String r5 = r14.f202508z
            java.lang.String r4 = r4.mo108706c(r5, r0)
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            r6 = 0
            java.lang.String r7 = r5.getPath()
            if (r7 == 0) goto L_0x01fb
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r3, r3)
            java.lang.String r8 = r5.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x01fb
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r7)
            android.net.Uri r5 = r5.build()
        L_0x01fb:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r7.mo177799l(r5, r6)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x0209
            r5 = 0
            goto L_0x0211
        L_0x0209:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r6.mo119948x(r5)
        L_0x0211:
            if (r5 == 0) goto L_0x021d
            java.util.ArrayList<java.lang.String> r5 = r14.f202504v
            r5.add(r4)
            java.util.ArrayList<java.lang.String> r5 = r14.f202503u
            r5.add(r4)
        L_0x021d:
            int r0 = r0 + 1
            goto L_0x01ca
        L_0x0220:
            java.util.ArrayList<java.lang.String> r0 = r14.f202504v
            r14.mo96571Q7(r0, r3)
            android.widget.ImageView r0 = r14.f202493h
            com.tencent.mm.plugin.profile.ui.g r1 = new com.tencent.mm.plugin.profile.ui.g
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r14.f202494i
            com.tencent.mm.plugin.profile.ui.h r1 = new com.tencent.mm.plugin.profile.ui.h
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r14.f202495j
            com.tencent.mm.plugin.profile.ui.i r1 = new com.tencent.mm.plugin.profile.ui.i
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r14.f202493h
            com.tencent.mm.plugin.profile.ui.a r1 = new com.tencent.mm.plugin.profile.ui.a
            r1.<init>(r14)
            r0.setOnLongClickListener(r1)
            android.widget.ImageView r0 = r14.f202494i
            com.tencent.mm.plugin.profile.ui.b r1 = new com.tencent.mm.plugin.profile.ui.b
            r1.<init>(r14)
            r0.setOnLongClickListener(r1)
            android.widget.ImageView r0 = r14.f202495j
            com.tencent.mm.plugin.profile.ui.c r1 = new com.tencent.mm.plugin.profile.ui.c
            r1.<init>(r14)
            r0.setOnLongClickListener(r1)
            android.widget.LinearLayout r0 = r14.f202489d
            com.tencent.mm.plugin.profile.ui.AddDescriptionUI$d r1 = new com.tencent.mm.plugin.profile.ui.AddDescriptionUI$d
            r1.<init>()
            r0.setOnClickListener(r1)
            java.lang.String r0 = r14.f202501s
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0272
            r0 = r1
        L_0x0272:
            android.widget.TextView r4 = r14.f202491f
            r4.getTextSize()
            android.text.SpannableString r0 = de3.C75370s.m90383i(r14, r0, r3, r2)
            com.tencent.mm.ui.widget.MMEditText r4 = r14.f202490e
            r4.setText(r0)
            com.tencent.mm.ui.widget.MMEditText r0 = r14.f202490e
            android.text.Editable r4 = r0.getText()
            int r4 = r4.length()
            r0.setSelection(r4)
            java.lang.String r0 = r14.f202501s
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 != 0) goto L_0x02bb
            android.widget.TextView r0 = r14.f202491f
            java.lang.String r4 = r14.f202501s
            if (r4 != 0) goto L_0x029c
            goto L_0x029d
        L_0x029c:
            r1 = r4
        L_0x029d:
            r0.getTextSize()
            android.text.SpannableString r1 = de3.C75370s.m90383i(r14, r1, r3, r2)
            r0.setText(r1)
            android.widget.TextView r0 = r14.f202491f
            androidx.appcompat.app.AppCompatActivity r1 = r14.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x02bb:
            r3 = 0
            r0 = 2131821539(0x7f1103e3, float:1.9275824E38)
            java.lang.String r4 = r14.getString(r0)
            com.tencent.mm.plugin.profile.ui.AddDescriptionUI$e r5 = new com.tencent.mm.plugin.profile.ui.AddDescriptionUI$e
            r5.<init>()
            r6 = 0
            com.tencent.mm.ui.MMActivityController$r r7 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
            r2 = r14
            r2.addTextOptionMenu(r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.profile.ui.AddDescriptionUI$f r0 = new com.tencent.mm.plugin.profile.ui.AddDescriptionUI$f
            r0.<init>()
            r14.setBackBtn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.AddDescriptionUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MiroMsg.AddDescriptionUI", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 100) {
            Context applicationContext = getApplicationContext();
            C97625j3.m125812b().getClass();
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(applicationContext, intent, C7970a.m8127a());
            if (g6 != null) {
                ArrayList<String> arrayList = this.f202503u;
                arrayList.add(mo96566L7(g6, arrayList.size()));
                mo96571Q7(this.f202503u, 0);
                mo96565K7();
            }
        } else if (i != 200) {
            if (i == 400) {
                if (intent == null) {
                    Log.m105920e("MiroMsg.AddDescriptionUI", "data shouldnot be null");
                } else if (intent.getBooleanExtra("response_delete", false)) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
                    if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                        this.f202499q = 0;
                        this.f202493h.setVisibility(8);
                        this.f202494i.setVisibility(8);
                        this.f202495j.setVisibility(8);
                    }
                    mo96571Q7(stringArrayListExtra, 0);
                    this.f202503u.clear();
                    this.f202503u.addAll(stringArrayListExtra);
                    mo96565K7();
                }
            }
        } else if (intent == null) {
            Log.m105920e("MiroMsg.AddDescriptionUI", "data shouldnot be null");
        } else {
            Iterator<String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                ArrayList<String> arrayList2 = this.f202503u;
                arrayList2.add(mo96566L7(it.next(), arrayList2.size()));
            }
            mo96571Q7(this.f202503u, 0);
            mo96565K7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        setMMTitle((int) C0966R.string.f361041n42);
        hideActionbarLine();
        this.f202508z = getIntent().getStringExtra("Contact_User");
        this.f202485A = getIntent().getStringExtra("Contact_verify_string");
        this.f202506x = C97625j3.m125812b().mo105907v().get(this.f202508z);
        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f202508z);
        this.f202507y = Lo;
        if (Lo == null || C77702q0.m93719b(Lo.field_conDescription)) {
            this.f202501s = this.f202506x.f149513S0;
        } else {
            this.f202501s = this.f202507y.field_conDescription;
        }
        String str = this.f202506x.f149515T0;
        this.f202502t = str;
        if (C77702q0.m93719b(str) || this.f202502t.startsWith(HttpWrapperBase.PROTOCAL_HTTP)) {
            String b = C78795g.m95196e().mo108705b(this.f202508z);
            if (C78795g.m95196e().mo108709g(this.f202508z)) {
                this.f202502t = b;
            } else {
                this.f202502t = "";
            }
        }
        initView();
        mo96565K7();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        mo96568N7();
        return true;
    }
}
