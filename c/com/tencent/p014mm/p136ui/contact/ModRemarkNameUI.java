package com.tencent.p014mm.p136ui.contact;

import a22.C27740g;
import a22.C67001a;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import android.widget.Toast;
import b22.C28250a;
import cm0.C28613b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.contact.C1234b;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C75375u;
import dg0.C75398e;
import di3.C86312j;
import eb0.C97625j3;
import f12.C7970a;
import hg0.C76166a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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
import qn3.C77382c;
import qo3.C77407n;
import sf0.C77702q0;
import so3.C77751a;
import xc0.C78795g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI */
public class ModRemarkNameUI extends MMActivity implements C11385n, C7020t0 {

    /* renamed from: V0 */
    public static final /* synthetic */ int f218631V0 = 0;

    /* renamed from: A */
    public LinearLayout f218632A;

    /* renamed from: B */
    public ImageView f218633B;

    /* renamed from: C */
    public ImageView f218634C;

    /* renamed from: D */
    public ImageView f218635D;

    /* renamed from: E */
    public TextView f218636E;

    /* renamed from: F */
    public String f218637F;

    /* renamed from: G */
    public int f218638G = 0;

    /* renamed from: H */
    public ArrayList<String> f218639H = new ArrayList<>();

    /* renamed from: I */
    public ArrayList<String> f218640I = new ArrayList<>();

    /* renamed from: J */
    public ArrayList<String> f218641J = new ArrayList<>();

    /* renamed from: K */
    public int f218642K = 9;

    /* renamed from: L */
    public C74403k f218643L = new C74403k((C6831d) null);

    /* renamed from: M */
    public View f218644M;

    /* renamed from: N */
    public ScrollView f218645N;

    /* renamed from: P */
    public TextView f218646P;

    /* renamed from: Q */
    public TextView f218647Q;

    /* renamed from: Q0 */
    public HashSet<String> f218648Q0 = new HashSet<>();

    /* renamed from: R */
    public LinearLayout f218649R;

    /* renamed from: R0 */
    public HashSet<String> f218650R0 = new HashSet<>();

    /* renamed from: S */
    public String f218651S;

    /* renamed from: S0 */
    public HashSet<String> f218652S0 = new HashSet<>();

    /* renamed from: T */
    public KeyboardHeightProvider f218653T;

    /* renamed from: T0 */
    public HashSet<String> f218654T0 = new HashSet<>();

    /* renamed from: U */
    public int f218655U = 0;

    /* renamed from: U0 */
    public ObjectAnimator f218656U0 = null;

    /* renamed from: V */
    public List<String> f218657V = new ArrayList();

    /* renamed from: W */
    public List<String> f218658W = new ArrayList();

    /* renamed from: X */
    public List<String> f218659X = new ArrayList();

    /* renamed from: Y */
    public boolean f218660Y;

    /* renamed from: Z */
    public long f218661Z;

    /* renamed from: d */
    public MMClearEditText f218662d;

    /* renamed from: e */
    public TextView f218663e;

    /* renamed from: f */
    public C72996z1 f218664f;

    /* renamed from: g */
    public C44673z4 f218665g;

    /* renamed from: h */
    public String f218666h;

    /* renamed from: i */
    public int f218667i;

    /* renamed from: j */
    public String f218668j = "";

    /* renamed from: n */
    public String f218669n = "";

    /* renamed from: o */
    public String f218670o;

    /* renamed from: p */
    public int f218671p = -1;

    /* renamed from: p0 */
    public int f218672p0;

    /* renamed from: q */
    public String f218673q;

    /* renamed from: r */
    public boolean f218674r = false;

    /* renamed from: s */
    public TextView f218675s = null;

    /* renamed from: t */
    public EditText f218676t = null;

    /* renamed from: u */
    public View f218677u;

    /* renamed from: v */
    public String f218678v = "";

    /* renamed from: w */
    public boolean f218679w = false;

    /* renamed from: x */
    public TextView f218680x;

    /* renamed from: x0 */
    public int f218681x0;

    /* renamed from: y */
    public View f218682y;

    /* renamed from: y0 */
    public HashSet<String> f218683y0 = new HashSet<>();

    /* renamed from: z */
    public String f218684z;

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$c */
    public class C6830c implements ValueAnimator.AnimatorUpdateListener {
        public C6830c(ModRemarkNameUI modRemarkNameUI) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Log.m105925i("MiroMsg.ModRemarkName", "onAnimationUpdate %s", Float.valueOf(((Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$d */
    public class C6831d implements View.OnClickListener {
        public C6831d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
            int i = ModRemarkNameUI.f218631V0;
            C77407n nVar = new C77407n((Context) modRemarkNameUI.getContext(), 1, true);
            nVar.f225771i = new C6876a2(modRemarkNameUI);
            nVar.f225782p = new C6879b2(modRemarkNameUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$g */
    public class C6832g implements View.OnFocusChangeListener {
        public C6832g() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                if (!Util.isNullOrNil(ModRemarkNameUI.this.f218662d.getHint()) && Util.isNullOrNil((CharSequence) ModRemarkNameUI.this.f218662d.getText())) {
                    MMClearEditText mMClearEditText = ModRemarkNameUI.this.f218662d;
                    mMClearEditText.setText(mMClearEditText.getHint());
                    ModRemarkNameUI.this.f218662d.setHint((CharSequence) null);
                }
                ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
                modRemarkNameUI.f218674r = true;
                MMClearEditText mMClearEditText2 = modRemarkNameUI.f218662d;
                mMClearEditText2.setSelection(mMClearEditText2.getText().length());
                ModRemarkNameUI.this.f218655U = 1;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$j */
    public class C6833j implements View.OnClickListener {
        public C6833j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = ModRemarkNameUI.this.f218677u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ModRemarkNameUI.this.f218675s.setVisibility(8);
            ModRemarkNameUI.this.f218676t.requestFocus();
            EditText editText = ModRemarkNameUI.this.f218676t;
            editText.setSelection(editText.getText().length());
            ModRemarkNameUI.this.showVKB();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$l */
    public class C6834l implements TextWatcher {
        public C6834l(C6831d dVar) {
        }

        public void afterTextChanged(Editable editable) {
            C45078p0.m49923b(400, editable.toString());
            ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
            int i = ModRemarkNameUI.f218631V0;
            modRemarkNameUI.mo103396L7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$m */
    public class C6835m extends ClickableSpan {

        /* renamed from: d */
        public String f24419d;

        public C6835m(String str) {
            this.f24419d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            ModRemarkNameUI.this.f218662d.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(ModRemarkNameUI.this, Util.nullAsNil(this.f24419d), ModRemarkNameUI.this.f218662d.getTextSize()));
            MMClearEditText mMClearEditText = ModRemarkNameUI.this.f218662d;
            mMClearEditText.setSelection(mMClearEditText.getText().length());
            View view2 = ModRemarkNameUI.this.f218682y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ModRemarkNameUI.this.getResources().getColor(C0966R.color.f3144gt));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$a */
    public class C74397a implements DialogInterface.OnClickListener {
        public C74397a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ModRemarkNameUI.m88897J7(ModRemarkNameUI.this);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$b */
    public class C74398b implements DialogInterface.OnClickListener {
        public C74398b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ModRemarkNameUI.this.f218641J.clear();
            ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
            modRemarkNameUI.f218641J.addAll(modRemarkNameUI.f218640I);
            ModRemarkNameUI.this.mo103398N7();
            ModRemarkNameUI.this.finish();
            ModRemarkNameUI modRemarkNameUI2 = ModRemarkNameUI.this;
            modRemarkNameUI2.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C74603z1(modRemarkNameUI2, 2));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$e */
    public class C74399e implements MMEditText.C74950c {
        public C74399e() {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$f */
    public class C74400f implements MMClearEditText.C57661e {
        public C74400f() {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$h */
    public class C74401h implements MenuItem.OnMenuItemClickListener {
        public C74401h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ModRemarkNameUI.m88897J7(ModRemarkNameUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$i */
    public class C74402i implements MenuItem.OnMenuItemClickListener {
        public C74402i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
            int i = ModRemarkNameUI.f218631V0;
            modRemarkNameUI.mo103400P7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI$k */
    public class C74403k implements View.OnClickListener {
        public C74403k(C6831d dVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ModRemarkNameUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
            int i = ModRemarkNameUI.f218631V0;
            modRemarkNameUI.getClass();
            Intent intent = new Intent();
            List<String> list = modRemarkNameUI.f218659X;
            if (list != null) {
                intent.putStringArrayListExtra("label_str_list", (ArrayList) list);
            }
            modRemarkNameUI.f218660Y = true;
            intent.putStringArrayListExtra("contact_net_label_list", (ArrayList) modRemarkNameUI.f218658W);
            int i2 = 0;
            String str = "";
            while (i2 < ((ArrayList) modRemarkNameUI.f218659X).size()) {
                String str2 = (String) ((ArrayList) modRemarkNameUI.f218659X).get(i2);
                if (!C77702q0.m93719b(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(C27740g.vx0().mo100944LL(str2));
                    sb.append(i2 < ((ArrayList) modRemarkNameUI.f218659X).size() - 1 ? "," : "");
                    str = sb.toString();
                }
                i2++;
            }
            intent.putExtra("label_id_list", str);
            intent.putExtra("is_stranger", true);
            intent.putExtra("label_username", modRemarkNameUI.f218666h);
            intent.putExtra("contact_search_label_new_list", modRemarkNameUI.f218648Q0);
            intent.putExtra("contact_search_label_add_list", modRemarkNameUI.f218650R0);
            intent.putExtra("contact_select_label_add_list", modRemarkNameUI.f218654T0);
            intent.putExtra("contact_select_label_new_list", modRemarkNameUI.f218652S0);
            C88144b.m109795m(modRemarkNameUI, "label", ".ui.ContactLabelUI", intent, 600);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m88895H7(ModRemarkNameUI modRemarkNameUI, int i) {
        modRemarkNameUI.getClass();
        Intent intent = new Intent(modRemarkNameUI, ContactRemarkImagePreviewUI.class);
        intent.putExtra("Contact_User", modRemarkNameUI.f218666h);
        intent.putExtra("remark_image_path", modRemarkNameUI.f218639H);
        intent.putExtra("selected_item", i);
        intent.putExtra("view_only", false);
        modRemarkNameUI.startActivityForResult(intent, 400);
    }

    /* renamed from: I7 */
    public static void m88896I7(ModRemarkNameUI modRemarkNameUI, int i) {
        modRemarkNameUI.f218638G--;
        modRemarkNameUI.f218639H.remove(i);
        if (i == 0) {
            modRemarkNameUI.f218633B.setVisibility(8);
        } else if (i == 1) {
            modRemarkNameUI.f218634C.setVisibility(8);
        } else if (i == 2) {
            modRemarkNameUI.f218635D.setVisibility(8);
        }
        modRemarkNameUI.f218632A.setVisibility(0);
        modRemarkNameUI.f218636E.setVisibility(8);
        modRemarkNameUI.mo103404T7(modRemarkNameUI.f218639H, 0);
        modRemarkNameUI.mo103396L7();
    }

    /* renamed from: J7 */
    public static void m88897J7(ModRemarkNameUI modRemarkNameUI) {
        int i = modRemarkNameUI.f218667i;
        if (i == 0) {
            if (!C97625j3.m125811a()) {
                Log.m105920e("MiroMsg.ModRemarkName", "!MMCore.hasSetUin()");
            } else {
                MMClearEditText mMClearEditText = modRemarkNameUI.f218662d;
                if (mMClearEditText == null) {
                    Log.m105920e("MiroMsg.ModRemarkName", "remarkName == null in dealModNickName(), return");
                } else {
                    String trim = mMClearEditText.getText().toString().trim();
                    Log.m105924i("MiroMsg.ModRemarkName", "Set New RemarkName : " + trim + ", Report kvStat, addContactScene = " + modRemarkNameUI.f218642K);
                    C115669n.INSTANCE.mo160131h(10448, Integer.valueOf(modRemarkNameUI.f218642K));
                    if (modRemarkNameUI.f218679w) {
                        modRemarkNameUI.f218664f.mo62860K2(trim);
                        modRemarkNameUI.f218664f.mo62895d4(modRemarkNameUI.f218678v);
                        if (modRemarkNameUI.mo103402R7()) {
                            ArrayList<String> arrayList = modRemarkNameUI.f218639H;
                            int size = arrayList != null ? arrayList.size() : 0;
                            if (size > 0) {
                                for (int i2 = 0; i2 < size; i2++) {
                                    String c = C78795g.m95196e().mo108706c(modRemarkNameUI.f218666h, i2);
                                    if (!c.equals(modRemarkNameUI.f218639H.get(i2))) {
                                        C86013q1.m106442c(modRemarkNameUI.f218639H.get(i2), c);
                                        C86013q1.m106447h(modRemarkNameUI.f218639H.get(i2));
                                    }
                                    modRemarkNameUI.f218641J.add(c);
                                }
                            }
                            modRemarkNameUI.mo103398N7();
                        } else {
                            modRemarkNameUI.f218641J.clear();
                            modRemarkNameUI.f218641J.addAll(modRemarkNameUI.f218640I);
                        }
                        modRemarkNameUI.f218664f.mo62897e4(C1234b.m1358a(modRemarkNameUI.f218641J));
                        C97625j3.m125812b().mo105907v().mo69668Q3(modRemarkNameUI.f218664f);
                        C44673z4 z4Var = new C44673z4(modRemarkNameUI.f218664f.getUsername(), trim);
                        z4Var.field_conDescription = modRemarkNameUI.f218676t.getText().toString().trim();
                        if (!Util.isNullOrNil(modRemarkNameUI.f218651S)) {
                            z4Var.field_contactLabels = modRemarkNameUI.f218651S;
                        }
                        ((C44651a5) C97625j3.m125812b().mo105880F()).replace(z4Var);
                        if (modRemarkNameUI.f218664f != null) {
                            C97625j3.m125812b().mo105907v().mo69719p3(modRemarkNameUI.f218664f.getUsername(), modRemarkNameUI.f218664f);
                        }
                    }
                    modRemarkNameUI.finish();
                }
            }
            Log.m105924i("MiroMsg.ModRemarkName", "cpan[saveStranger]");
            C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(modRemarkNameUI.f218666h);
            List<String> list = modRemarkNameUI.f218659X;
            if (list != null) {
                String i3 = ((C67001a) C28250a.m38138a()).mo90971i(list);
                if (!Util.isNullOrNil(i3)) {
                    Lo.field_contactLabels = i3;
                    if (Util.isNullOrNil(Lo.field_encryptUsername)) {
                        Lo.field_encryptUsername = modRemarkNameUI.f218666h;
                    }
                    ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                } else {
                    Lo.field_contactLabels = "";
                    ((C44651a5) C97625j3.m125812b().mo105880F()).replace(Lo);
                }
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C74603z1(modRemarkNameUI, 1));
        } else if (i == 3) {
            String trim2 = modRemarkNameUI.f218662d.getText().toString().trim();
            Intent intent = new Intent();
            if (Util.isNullOrNil(trim2)) {
                trim2 = modRemarkNameUI.getResources().getString(C0966R.string.ji8);
            }
            intent.putExtra("k_sns_tag_name", trim2);
            modRemarkNameUI.setResult(-1, intent);
            modRemarkNameUI.finish();
        } else if (i == 4) {
            String trim3 = modRemarkNameUI.f218662d.getText().toString().trim();
            if (trim3.length() > 32) {
                C76879j.m92754y(modRemarkNameUI.getContext(), modRemarkNameUI.getString(C0966R.string.i5u), modRemarkNameUI.getString(C0966R.string.i9c), modRemarkNameUI.getString(C0966R.string.f7926wf), (DialogInterface.OnClickListener) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_Nick", trim3);
            modRemarkNameUI.setResult(-1, intent2);
            modRemarkNameUI.finish();
            new UpdateSearchIndexAtOnceEvent().publish();
        }
    }

    /* renamed from: K7 */
    public final boolean mo103395K7(List<String> list, List<String> list2) {
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

    /* renamed from: L7 */
    public final void mo103396L7() {
        if (mo103401Q7() || mo103403S7() || mo103402R7()) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
    }

    /* renamed from: M7 */
    public final String mo103397M7(String str, int i) {
        if (!C86013q1.m106450k(str)) {
            return null;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        String str2 = C78795g.m95196e().mo108706c(this.f218666h, i) + ".tmp";
        if (!BitmapUtil.createThumbNail(str, 1080, 1080, Bitmap.CompressFormat.JPEG, 80, str2)) {
            Log.m105920e("MiroMsg.ModRemarkName", "createThumbNail big pic fail");
            return null;
        } else if (exifOrientation == 0 || BitmapUtil.rotate(str2, exifOrientation, Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        } else {
            Log.m105920e("MiroMsg.ModRemarkName", "rotate big pic fail");
            return null;
        }
    }

    /* renamed from: N7 */
    public final void mo103398N7() {
        Iterable<C86001b0> t;
        String a = C78795g.m95196e().mo108704a(this.f218666h);
        C86009m1 m1Var = new C86009m1(a);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (t = C86013q1.m106459t(a, true)) != null) {
            for (C86001b0 next : t) {
                if (next != null) {
                    if (!this.f218641J.contains(a + next.f250472b)) {
                        next.mo119954a();
                    }
                }
            }
        }
    }

    /* renamed from: O7 */
    public final List<EditText> mo103399O7(View view) {
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
                arrayList.addAll(mo103399O7(childAt));
            }
        }
        return arrayList;
    }

    /* renamed from: P7 */
    public final void mo103400P7() {
        boolean S7 = mo103403S7();
        boolean Q7 = mo103401Q7();
        if (S7 || Q7 || mo103402R7()) {
            C76879j.m92707A(this, getString(C0966R.string.f360302bq2), (String) null, getString(C0966R.string.bq4), getString(C0966R.string.f360303bq3), new C74397a(), new C74398b());
            return;
        }
        finish();
        ((C119157j) C119157j.f356862d).mo183875f(new C74603z1(this, 2));
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105925i("MiroMsg.ModRemarkName", "height:%s", Integer.valueOf(i));
        ObjectAnimator objectAnimator = this.f218656U0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f218656U0.cancel();
        }
        ScrollView scrollView = this.f218645N;
        if (scrollView != null) {
            ArrayList arrayList = (ArrayList) mo103399O7(scrollView);
            if (!arrayList.isEmpty()) {
                int[] iArr = new int[2];
                ((EditText) arrayList.get(arrayList.size() - 1)).getLocationOnScreen(iArr);
                int i2 = iArr[1] - (C77751a.m93806a(getContext())[1] - i);
                if (i2 > 0) {
                    if (scrollView.getTranslationY() != 0.0f) {
                        scrollView.setTranslationY(0.0f);
                    }
                    this.f218656U0 = ObjectAnimator.ofFloat(scrollView, "translationY", new float[]{0.0f, (float) (-i2)});
                } else {
                    this.f218656U0 = ObjectAnimator.ofFloat(scrollView, "translationY", new float[]{scrollView.getTranslationY(), 0.0f});
                }
                this.f218656U0.setDuration(200);
                this.f218656U0.setInterpolator(new C109678b());
                this.f218656U0.addUpdateListener(new C6830c(this));
                this.f218656U0.start();
            }
        }
    }

    /* renamed from: Q7 */
    public final boolean mo103401Q7() {
        String trim = this.f218676t.getText().toString().trim();
        String str = this.f218678v;
        return (str == null || !str.equals(trim)) && (!Util.isNullOrNil(this.f218678v) || !Util.isNullOrNil(trim));
    }

    /* renamed from: R7 */
    public final boolean mo103402R7() {
        return this.f218640I.size() != this.f218639H.size() || !this.f218640I.containsAll(this.f218639H);
    }

    /* renamed from: S7 */
    public final boolean mo103403S7() {
        String trim = this.f218662d.getText().toString().trim();
        if (trim == null) {
            trim = "";
        }
        int i = this.f218667i;
        if (i == 0) {
            int i2 = this.f218671p;
            if (i2 == 1) {
                return !Util.isNullOrNil(trim) || this.f218674r;
            }
            if (i2 == 2) {
                return (!Util.isNullOrNil(trim) || !Util.isNullOrNil(this.f218670o)) && !trim.equals(this.f218670o);
            }
        }
        if (i == 3 && !Util.isNullOrNil(this.f218670o)) {
            return !this.f218670o.equals(trim);
        }
        String str = this.f218669n;
        if (str == null || !str.equals(trim)) {
            return !Util.isNullOrNil(this.f218669n) || !Util.isNullOrNil(trim);
        }
        return false;
    }

    /* renamed from: T7 */
    public final void mo103404T7(ArrayList<String> arrayList, int i) {
        Bitmap decodeFile;
        this.f218636E.setVisibility(8);
        this.f218632A.setVisibility(0);
        if (arrayList != null && arrayList.size() != 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                float g = C76577a.m92156g(this);
                if (new C86009m1(next).mo119967g() && (decodeFile = BackwardSupportUtil.BitmapFactory.decodeFile(next, g)) != null) {
                    if (i == 0) {
                        this.f218638G = 1;
                        this.f218633B.setVisibility(0);
                        this.f218633B.setImageBitmap(decodeFile);
                        this.f218634C.setVisibility(8);
                        this.f218635D.setVisibility(8);
                    } else if (i == 1) {
                        this.f218638G = 2;
                        this.f218634C.setVisibility(0);
                        this.f218634C.setImageBitmap(decodeFile);
                        this.f218635D.setVisibility(8);
                    } else if (i == 2) {
                        this.f218638G = 3;
                        this.f218635D.setVisibility(0);
                        this.f218635D.setImageBitmap(decodeFile);
                        this.f218632A.setVisibility(8);
                        this.f218636E.setVisibility(0);
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: U7 */
    public final void mo103405U7() {
        List<String> list;
        C44673z4 Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f218666h);
        this.f218665g = Lo;
        if (Lo != null) {
            this.f218651S = Lo.field_contactLabels;
            list = ((C67001a) C28250a.m38138a()).mo90969g(this.f218651S);
        } else {
            list = null;
        }
        if (this.f218657V == null) {
            this.f218657V = new ArrayList();
        }
        ((ArrayList) this.f218658W).clear();
        this.f218657V.clear();
        ((ArrayList) this.f218659X).clear();
        if (list != null) {
            this.f218657V.addAll(list);
            ((ArrayList) this.f218658W).addAll(list);
            ((ArrayList) this.f218659X).addAll(list);
        } else {
            new ArrayList();
        }
        List d = ((C67001a) C28250a.m38138a()).mo90966d();
        int i = 0;
        if (d != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) d;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (!this.f218657V.contains(arrayList.get(i2))) {
                    this.f218657V.add((String) arrayList.get(i2));
                }
                i2++;
            }
        }
        List<String> list2 = this.f218658W;
        if (list2 != null) {
            ArrayList arrayList2 = (ArrayList) list2;
            if (arrayList2.size() != 0) {
                String str = "";
                while (i < arrayList2.size()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((String) arrayList2.get(i));
                    sb.append(i < arrayList2.size() + -1 ? "，" : "");
                    str = sb.toString();
                    i++;
                }
                this.f218646P.setText(str);
                this.f218672p0 = ((ArrayList) d).size();
                this.f218681x0 = ((ArrayList) this.f218658W).size();
                this.f218683y0.addAll(this.f218658W);
            }
        }
        this.f218646P.setText("");
        this.f218672p0 = ((ArrayList) d).size();
        this.f218681x0 = ((ArrayList) this.f218658W).size();
        this.f218683y0.addAll(this.f218658W);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgi;
    }

    public void initView() {
        C72996z1 z1Var;
        TextView textView;
        int i;
        Class cls = C76979h.class;
        String stringExtra = getIntent().getStringExtra("Contact_User");
        this.f218666h = stringExtra;
        if (stringExtra != null && stringExtra.length() > 0) {
            this.f218664f = C97625j3.m125812b().mo105907v().get(this.f218666h);
            this.f218665g = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f218666h);
            C72996z1 z1Var2 = this.f218664f;
            if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
                C72996z1 z1Var3 = new C72996z1(this.f218666h);
                this.f218664f = z1Var3;
                z1Var3.mo62878U2(Util.nullAsNil(this.f218668j));
                this.f218664f.mo62860K2(Util.nullAsNil(this.f218669n));
            }
            C72996z1 z1Var4 = this.f218664f;
            if (z1Var4 != null) {
                this.f218637F = z1Var4.f149515T0;
            }
            if (C77702q0.m93719b(this.f218637F) || this.f218637F.startsWith(HttpWrapperBase.PROTOCAL_HTTP)) {
                String b = C78795g.m95196e().mo108705b(this.f218666h);
                if (C78795g.m95196e().mo108709g(this.f218666h)) {
                    this.f218637F = b;
                } else {
                    this.f218637F = "";
                }
            }
        }
        this.f218645N = (ScrollView) findViewById(C0966R.C0970id.j4b);
        this.f218663e = (TextView) findViewById(C0966R.C0970id.ko6);
        this.f218662d = (MMClearEditText) findViewById(C0966R.C0970id.bo5);
        this.f218632A = (LinearLayout) findViewById(C0966R.C0970id.boc);
        this.f218633B = (ImageView) findViewById(C0966R.C0970id.oem);
        this.f218634C = (ImageView) findViewById(C0966R.C0970id.oeo);
        this.f218635D = (ImageView) findViewById(C0966R.C0970id.oen);
        this.f218636E = (TextView) findViewById(C0966R.C0970id.oep);
        C75044y4.m89990b(getContext());
        int i2 = C75044y4.m89990b(getContext()).x;
        if (i2 > 0) {
            int dimensionPixelSize = (i2 - getResources().getDimensionPixelSize(C0966R.dimen.f3761db)) / 3;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f218633B.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            this.f218633B.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f218634C.getLayoutParams();
            layoutParams2.width = dimensionPixelSize;
            layoutParams2.height = dimensionPixelSize;
            this.f218634C.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f218635D.getLayoutParams();
            layoutParams3.width = dimensionPixelSize;
            layoutParams3.height = dimensionPixelSize;
            this.f218635D.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f218632A.getLayoutParams();
            layoutParams4.width = dimensionPixelSize;
            layoutParams4.height = dimensionPixelSize;
            this.f218632A.setLayoutParams(layoutParams4);
        }
        for (int i3 = 0; i3 < 3; i3++) {
            String c = C78795g.m95196e().mo108706c(this.f218666h, i3);
            if (!Util.isNullOrNil(c)) {
                Uri n = C116299g2.m163858n(c);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    this.f218640I.add(c);
                    this.f218639H.add(c);
                }
            }
        }
        mo103404T7(this.f218640I, 0);
        this.f218633B.setOnClickListener(new C74565t1(this));
        this.f218634C.setOnClickListener(new C74569u1(this));
        this.f218635D.setOnClickListener(new C74573v1(this));
        this.f218633B.setOnLongClickListener(new C74580w1(this));
        this.f218634C.setOnLongClickListener(new C74586x1(this));
        this.f218635D.setOnLongClickListener(new C74596y1(this));
        this.f218632A.setOnClickListener(new C6831d());
        C74399e eVar = new C74399e();
        this.f218662d.setClearBtnListener(new C74400f());
        C72927t0.C72928a aVar = new C72927t0.C72928a();
        aVar.f212545d = eVar;
        this.f218662d.addTextChangedListener(aVar);
        this.f218662d.setOnFocusChangeListener(new C6832g());
        C77382c b2 = C77382c.m93286b(this.f218662d);
        b2.f225611e = 0;
        b2.f225610d = 32;
        b2.mo107499d((C77382c.C77383a) null);
        C72996z1 z1Var5 = this.f218664f;
        if (!(z1Var5 == null || (i = this.f218667i) == 3)) {
            if (i == 4) {
                this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218668j), this.f218662d.getTextSize()));
            } else if (!Util.isNullOrNil(z1Var5.mo73969n2())) {
                if (this.f218667i != 0 || Util.isNullOrNil(this.f218669n)) {
                    this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218664f.mo73969n2()), this.f218662d.getTextSize()));
                } else {
                    this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f218669n, this.f218662d.getTextSize()));
                }
                this.f218664f.mo73969n2().equals(this.f218669n);
            } else if (!Util.isNullOrNil(this.f218669n)) {
                this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218669n), this.f218662d.getTextSize()));
                this.f218664f.mo73969n2().equals(this.f218669n);
            } else if (!Util.isNullOrNil(this.f218664f.getNickname())) {
                if (this.f218667i != 0 || Util.isNullOrNil(this.f218668j) || this.f218664f.mo62927s3()) {
                    this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218664f.getNickname()), this.f218662d.getTextSize()));
                } else {
                    this.f218662d.setHint(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218668j), this.f218662d.getTextSize()));
                }
            } else if (!Util.isNullOrNil(this.f218668j)) {
                this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218668j), this.f218662d.getTextSize()));
            } else {
                String nickname = this.f218664f.getNickname();
                if (!Util.isNullOrNil(nickname) && nickname.length() <= 50) {
                    this.f218662d.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218664f.mo62898f()), this.f218662d.getTextSize()));
                } else {
                    this.f218662d.setText("");
                }
            }
            MMClearEditText mMClearEditText = this.f218662d;
            mMClearEditText.setSelection(mMClearEditText.getText().length());
        }
        if (this.f218667i != 0 || C72996z1.m85825X4(this.f218666h)) {
            int i4 = this.f218667i;
            if (i4 == 3) {
                this.f218663e.setText(C0966R.string.f361424jt0);
                this.f218662d.setHint("");
                if (!Util.isNullOrNil(this.f218668j)) {
                    this.f218662d.setText(this.f218668j);
                }
                TextView textView2 = (TextView) findViewById(C0966R.C0970id.bo6);
                textView2.setText(C0966R.string.imh);
                textView2.setVisibility(0);
                View findViewById = findViewById(C0966R.C0970id.gxs);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.gxp);
                if (findViewById2 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i4 == 4) {
                this.f218663e.setText(C0966R.string.i7r);
                this.f218662d.setHint("");
                TextView textView3 = (TextView) findViewById(C0966R.C0970id.bo6);
                textView3.setText(C0966R.string.i95);
                textView3.setVisibility(0);
            } else if (C72996z1.m85825X4(this.f218666h)) {
                this.f218663e.setText(C0966R.string.f361424jt0);
            }
        } else {
            this.f218663e.setText(C0966R.string.bod);
            C76166a a = C75398e.vx0().mo106401a(this.f218664f.getUsername());
            if (a != null && !Util.isNullOrNil(a.mo106388h()) && !a.mo106388h().equals(this.f218662d.getText())) {
                this.f218680x = (TextView) findViewById(C0966R.C0970id.f358763gy0);
                View findViewById3 = findViewById(C0966R.C0970id.gxr);
                this.f218682y = findViewById3;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initMobileNameArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initMobileNameArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f218680x.setText(Util.nullAsNil(getString(C0966R.string.bqs, new Object[]{a.mo106388h()})));
                C75375u uVar = new C75375u(getString(C0966R.string.ll_));
                uVar.mo105705b(new C6835m(a.mo106388h()), 0, uVar.length(), 17);
                this.f218680x.append(" ");
                this.f218680x.append(uVar);
                this.f218680x.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (!Util.isNullOrNil(this.f218684z) && (((textView = this.f218680x) == null || Util.isNullOrNil(textView.getText())) && (this.f218662d.getText() == null || !this.f218684z.equals(this.f218662d.getText().toString())))) {
                this.f218680x = (TextView) findViewById(C0966R.C0970id.f358763gy0);
                View findViewById4 = findViewById(C0966R.C0970id.gxr);
                this.f218682y = findViewById4;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initChatRoomNameArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initChatRoomNameArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f218680x.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(getString(C0966R.string.bqr, new Object[]{this.f218684z})), this.f218680x.getTextSize()));
                C75375u uVar2 = new C75375u(getString(C0966R.string.ll_));
                uVar2.mo105705b(new C6835m(this.f218684z), 0, uVar2.length(), 17);
                this.f218680x.append(" ");
                this.f218680x.append(uVar2);
                this.f218680x.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (C72996z1.m85843n5(this.f218666h)) {
                View findViewById5 = findViewById(C0966R.C0970id.gxs);
                if (findViewById5 != null) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar6.mo10233c(8);
                    View view5 = findViewById5;
                    C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById6 = findViewById(C0966R.C0970id.gxp);
                if (findViewById6 != null) {
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar7.mo10233c(8);
                    View view6 = findViewById6;
                    C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        setMMTitle("");
        if (this.f218662d.getHint() != null && !Util.isNullOrNil(this.f218662d.getHint().toString())) {
            this.f218670o = this.f218662d.getHint().toString();
            this.f218671p = 1;
        }
        if (this.f218662d.getText() != null && !Util.isNullOrNil(this.f218662d.getText().toString())) {
            this.f218670o = this.f218662d.getText().toString();
            this.f218671p = 2;
        }
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C74401h(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al8));
        hideActionbarLine();
        this.mController.mo177105z0(getResources().getColor(C0966R.color.al8));
        setBackBtn(new C74402i());
        this.f218675s = (TextView) findViewById(C0966R.C0970id.bob);
        this.f218676t = (EditText) findViewById(C0966R.C0970id.bo4);
        this.f218677u = findViewById(C0966R.C0970id.f357776bo3);
        C77382c b3 = C77382c.m93286b(this.f218676t);
        b3.f225611e = 0;
        b3.f225610d = 400;
        b3.mo107499d((C77382c.C77383a) null);
        this.f218676t.append(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218678v), this.f218676t.getTextSize()));
        this.f218675s.append(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218678v), this.f218675s.getTextSize()));
        C44673z4 z4Var = this.f218665g;
        if (z4Var != null) {
            this.f218678v = Util.nullAsNil(z4Var.field_conDescription);
        }
        if (Util.isNullOrNil(this.f218678v) && (z1Var = this.f218664f) != null) {
            this.f218678v = z1Var.f149513S0;
        }
        if (!Util.isNullOrNil(this.f218678v)) {
            this.f218676t.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218678v), this.f218676t.getTextSize()));
            this.f218675s.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, Util.nullAsNil(this.f218678v), this.f218675s.getTextSize()));
            this.f218675s.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0));
        }
        this.f218676t.addTextChangedListener(new C6834l((C6831d) null));
        this.f218675s.setOnClickListener(new C6833j());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MiroMsg.ModRemarkName", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 100) {
            Context applicationContext = getApplicationContext();
            C97625j3.m125812b().getClass();
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(applicationContext, intent, C7970a.m8127a());
            if (g6 != null) {
                ArrayList<String> arrayList = this.f218639H;
                arrayList.add(mo103397M7(g6, arrayList.size()));
                mo103404T7(this.f218639H, 0);
                mo103396L7();
            }
        } else if (i != 200) {
            if (i != 400) {
                if (i == 600) {
                    if (intent == null) {
                        Log.m105920e("MiroMsg.ModRemarkName", "data shouldnot be null");
                        return;
                    }
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
                    List d = ((C67001a) C28250a.m38138a()).mo90966d();
                    Log.m105925i("MiroMsg.ModRemarkName", "onAcvityResult，labelLists: %s, allLabelListsNow: %s.", stringArrayListExtra, d);
                    if (mo103395K7(stringArrayListExtra, this.f218659X) || mo103395K7(d, this.f218657V)) {
                        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                        if (stringArrayListExtra2 != null) {
                            this.f218648Q0.addAll(stringArrayListExtra2);
                        }
                        ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                        if (stringArrayListExtra3 != null) {
                            this.f218650R0.addAll(stringArrayListExtra3);
                        }
                        ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                        if (stringArrayListExtra4 != null) {
                            this.f218654T0.addAll(stringArrayListExtra4);
                        }
                        ArrayList<String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                        if (stringArrayListExtra5 != null) {
                            this.f218652S0.addAll(stringArrayListExtra5);
                        }
                        if (this.f218657V == null) {
                            this.f218657V = new ArrayList();
                        }
                        mo103405U7();
                        if (i2 == -1) {
                            enableOptionMenu(true);
                            return;
                        }
                        return;
                    }
                    Log.m105924i("MiroMsg.ModRemarkName", "onAcvityResult checkLebalChanges.");
                }
            } else if (intent == null) {
                Log.m105920e("MiroMsg.ModRemarkName", "data shouldnot be null");
            } else if (intent.getBooleanExtra("response_delete", false)) {
                ArrayList<String> stringArrayListExtra6 = intent.getStringArrayListExtra("remark_image_path");
                if (stringArrayListExtra6 == null || stringArrayListExtra6.size() == 0) {
                    this.f218638G = 0;
                    this.f218633B.setVisibility(8);
                    this.f218634C.setVisibility(8);
                    this.f218635D.setVisibility(8);
                }
                mo103404T7(stringArrayListExtra6, 0);
                this.f218639H.clear();
                this.f218639H.addAll(stringArrayListExtra6);
                mo103396L7();
            }
        } else if (intent == null) {
            Log.m105920e("MiroMsg.ModRemarkName", "data shouldnot be null");
        } else {
            Iterator<String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                ArrayList<String> arrayList2 = this.f218639H;
                arrayList2.add(mo103397M7(it.next(), arrayList2.size()));
            }
            mo103404T7(this.f218639H, 0);
            mo103396L7();
        }
    }

    public void onCreate(Bundle bundle) {
        MMClearEditText mMClearEditText;
        super.onCreate(bundle);
        this.f218661Z = System.currentTimeMillis();
        this.f218642K = getIntent().getIntExtra("Contact_Scene", 9);
        this.f218684z = getIntent().getStringExtra("Contact_RoomNickname");
        this.f218667i = getIntent().getIntExtra("Contact_mode_name_type", 0);
        this.f218668j = Util.nullAsNil(getIntent().getStringExtra("Contact_Nick"));
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("Contact_RemarkName"));
        this.f218669n = nullAsNil;
        this.f218673q = nullAsNil;
        boolean z = true;
        this.f218679w = getIntent().getBooleanExtra("Contact_ModStrangerRemark", true);
        initView();
        if (C72996z1.m85843n5(this.f218666h)) {
            Log.m105925i("MiroMsg.ModRemarkName", "initLabelPanelAll, isOpenIM, userName: %s.", this.f218666h);
            View findViewById = findViewById(C0966R.C0970id.f357775bo2);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = findViewById(C0966R.C0970id.f357774bo1);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            this.f218647Q = (TextView) findViewById(C0966R.C0970id.f357775bo2);
            this.f218644M = findViewById(C0966R.C0970id.f357774bo1);
            this.f218649R = (LinearLayout) findViewById(C0966R.C0970id.f357774bo1);
            this.f218646P = (TextView) findViewById(C0966R.C0970id.f357773bo0);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f6151yq);
            if (imageView != null) {
                imageView.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_arrow, C76577a.m92153d(getContext(), C0966R.color.BW_70)));
            }
            this.f218649R.setOnClickListener(this.f218643L);
            if (this.f218667i != 0) {
                View view3 = this.f218644M;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f218647Q.setVisibility(8);
            } else {
                View view4 = this.f218644M;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f218647Q.setVisibility(0);
                this.f218646P.setVisibility(0);
            }
            mo103405U7();
        }
        C72996z1 z1Var = this.f218664f;
        if (z1Var == null || !C72996z1.m85843n5(z1Var.getUsername())) {
            z = false;
        }
        if (z && (mMClearEditText = this.f218662d) != null) {
            ViewGroup viewGroup = (ViewGroup) mMClearEditText.getParent();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                int id = childAt.getId();
                if (!(id == C0966R.C0970id.bo6 || id == C0966R.C0970id.bo5)) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(8);
                    C117292a.m165358d(childAt, aVar5.mo10232b(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/ui/contact/ModRemarkNameUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f218653T = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
    }

    public void onDestroy() {
        KeyboardHeightProvider keyboardHeightProvider = this.f218653T;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        mo103400P7();
        return true;
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f218653T;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        KeyboardHeightProvider keyboardHeightProvider = this.f218653T;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MiroMsg.ModRemarkName", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar.getType() != 44) {
            return;
        }
        if (i == 0 || i2 >= 0) {
            finish();
            return;
        }
        Log.m105918d("MiroMsg.ModRemarkName", "addRoomCard Error!");
        Toast.makeText(this, getString(C0966R.string.i8u, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        finish();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f218653T;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
