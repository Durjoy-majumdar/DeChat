package qo3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.AlertActivity;
import com.tencent.p014mm.p136ui.C74942w4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import qo3.C77398g;
import vl3.C102226d;

/* renamed from: qo3.q */
public class C77426q {

    /* renamed from: a */
    public final C77398g.C77402i f225837a;

    /* renamed from: b */
    public Context f225838b;

    /* renamed from: c */
    public C77398g f225839c;

    /* renamed from: d */
    public String f225840d = null;

    /* renamed from: e */
    public String f225841e = null;

    /* renamed from: f */
    public RadioGroup f225842f;

    /* renamed from: qo3.q$b */
    public class C47881b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C47883u f128481d;

        public C47881b(C77426q qVar, C47883u uVar) {
            this.f128481d = uVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C47883u uVar = this.f128481d;
            if (uVar != null) {
                uVar.mo353a(false, (String) null);
            }
        }
    }

    /* renamed from: qo3.q$c */
    public class C47882c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C47883u f128482d;

        public C47882c(C77426q qVar, C47883u uVar) {
            this.f128482d = uVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f128482d != null) {
                this.f128482d.mo353a(true, dialogInterface == null ? null : ((C77398g) dialogInterface).mo107527g());
            }
        }
    }

    /* renamed from: qo3.q$a */
    public class C63301a implements C77398g.C77402i.C63298d {
        public C63301a() {
        }

        /* renamed from: a */
        public CharSequence mo88206a(Context context, CharSequence charSequence, float f) {
            return C102226d.m134696a(C77426q.this.f225838b, charSequence);
        }
    }

    /* renamed from: qo3.q$d */
    public class C77427d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77429t f225843d;

        public C77427d(C77426q qVar, C77429t tVar) {
            this.f225843d = tVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f225843d != null) {
                this.f225843d.mo8330a(true, dialogInterface == null ? null : ((C77398g) dialogInterface).mo107527g(), dialogInterface == null ? false : ((C77398g) dialogInterface).f225702s.isChecked());
            }
        }
    }

    /* renamed from: qo3.q$e */
    public class C77428e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77429t f225844d;

        public C77428e(C77426q qVar, C77429t tVar) {
            this.f225844d = tVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f225844d != null) {
                this.f225844d.mo8330a(false, (String) null, dialogInterface == null ? false : ((C77398g) dialogInterface).f225702s.isChecked());
            }
        }
    }

    public C77426q(Context context) {
        this.f225838b = context;
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        this.f225837a = iVar;
        C77389a aVar = iVar.f225714b;
        aVar.f225668y = false;
        aVar.f225669z = false;
        aVar.f225656m = new C63301a();
        this.f225841e = this.f225838b.getResources().getString(C0966R.string.atx);
        this.f225840d = this.f225838b.getResources().getString(C0966R.string.au5);
    }

    /* renamed from: a */
    public C77426q mo107589a(boolean z) {
        C77389a aVar = this.f225837a.f225714b;
        aVar.f225668y = z;
        aVar.f225669z = z;
        return this;
    }

    /* renamed from: b */
    public C77426q mo107590b(C47883u uVar) {
        RadioGroup radioGroup = this.f225842f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f225839c);
        }
        mo107600l(uVar);
        mo107597i(uVar);
        return this;
    }

    /* renamed from: c */
    public C77426q mo107591c(C47883u uVar, C47883u uVar2) {
        RadioGroup radioGroup = this.f225842f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f225839c);
        }
        mo107597i(uVar);
        mo107600l(uVar2);
        return this;
    }

    /* renamed from: d */
    public C77426q mo107592d(View view) {
        this.f225837a.f225714b.f225627J = view;
        return this;
    }

    /* renamed from: e */
    public C77426q mo107593e(DialogInterface.OnDismissListener onDismissListener) {
        this.f225837a.f225714b.f225623F = onDismissListener;
        return this;
    }

    /* renamed from: f */
    public C77426q mo107594f(Boolean bool) {
        this.f225837a.f225714b.f225649f = bool.booleanValue();
        return this;
    }

    /* renamed from: g */
    public C77426q mo107595g(String str) {
        this.f225837a.f225714b.f225660q = str;
        return this;
    }

    /* renamed from: h */
    public C77426q mo107596h(CharSequence charSequence) {
        Context context = this.f225838b;
        C74942w4.m89784a(context, (int) (C74942w4.m89788e(context) * 14.0f));
        if (charSequence != null && charSequence.length() > 0) {
            charSequence = C102226d.m134696a(this.f225838b, charSequence.toString());
        }
        this.f225837a.f225714b.f225661r = charSequence;
        return this;
    }

    /* renamed from: i */
    public C77426q mo107597i(C47883u uVar) {
        String str = this.f225841e;
        if (str == null || (str != null && str.length() == 0)) {
            this.f225841e = this.f225838b.getResources().getString(C0966R.string.atx);
        }
        RadioGroup radioGroup = this.f225842f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f225839c);
        }
        C77398g.C77402i iVar = this.f225837a;
        String str2 = this.f225841e;
        C77389a aVar = iVar.f225714b;
        aVar.f225664u = str2;
        aVar.f225621D = new C47881b(this, uVar);
        return this;
    }

    /* renamed from: j */
    public C77426q mo107598j(String str) {
        this.f225841e = str;
        this.f225837a.f225714b.f225664u = str;
        return this;
    }

    /* renamed from: k */
    public C77426q mo107599k(int i) {
        this.f225837a.f225714b.f225638U = i;
        return this;
    }

    /* renamed from: l */
    public C77426q mo107600l(C47883u uVar) {
        String str = this.f225840d;
        if (str == null || (str != null && str.length() == 0)) {
            this.f225840d = this.f225838b.getResources().getString(C0966R.string.au5);
        }
        RadioGroup radioGroup = this.f225842f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f225839c);
        }
        C77398g.C77402i iVar = this.f225837a;
        String str2 = this.f225840d;
        C77389a aVar = iVar.f225714b;
        aVar.f225663t = str2;
        aVar.f225620C = new C47882c(this, uVar);
        return this;
    }

    /* renamed from: m */
    public C77426q mo107601m(int i) {
        String string = this.f225838b.getResources().getString(i);
        this.f225840d = string;
        this.f225837a.f225714b.f225663t = string;
        return this;
    }

    /* renamed from: n */
    public C77426q mo107602n(String str) {
        this.f225840d = str;
        this.f225837a.f225714b.f225663t = str;
        return this;
    }

    /* renamed from: o */
    public void mo107603o() {
        if (this.f225838b instanceof Activity) {
            if (this.f225839c == null) {
                this.f225839c = this.f225837a.mo107548a();
            }
            this.f225839c.show();
            return;
        }
        AlertActivity.f284187j = this.f225837a;
        Intent intent = new Intent(this.f225838b, AlertActivity.class);
        intent.setFlags(335544320);
        Context context = this.f225838b;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/ui/widget/dialog/MMConfirmDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: p */
    public C77426q mo107604p(boolean z) {
        this.f225837a.f225714b.f225642Y = z;
        return this;
    }

    /* renamed from: q */
    public C77426q mo107605q(ArrayList<String> arrayList, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, int i) {
        View inflate = View.inflate(this.f225838b, C0966R.C0971layout.f7143zn, (ViewGroup) null);
        this.f225842f = (RadioGroup) inflate.findViewById(C0966R.C0970id.ic4);
        int size = arrayList != null ? arrayList.size() : 0;
        for (int i2 = 0; i2 < size; i2++) {
            RadioButton radioButton = (RadioButton) View.inflate(this.f225838b, C0966R.C0971layout.f7142zm, (ViewGroup) null);
            radioButton.setId(i2);
            if (i2 == i) {
                radioButton.setChecked(true);
            }
            radioButton.setText(arrayList.get(i2));
            this.f225842f.addView(radioButton);
        }
        this.f225842f.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f225837a.f225714b.f225627J = inflate;
        return this;
    }

    /* renamed from: r */
    public C77426q mo107606r(CharSequence charSequence) {
        Context context = this.f225838b;
        C74942w4.m89784a(context, (int) (C74942w4.m89788e(context) * 20.0f));
        if (charSequence != null && charSequence.length() > 0) {
            charSequence = C102226d.m134696a(this.f225838b, charSequence.toString());
        }
        this.f225837a.f225714b.f225644a = charSequence;
        return this;
    }

    /* renamed from: s */
    public C77426q mo107607s(C77429t tVar) {
        RadioGroup radioGroup = this.f225842f;
        if (radioGroup != null) {
            radioGroup.setTag(this.f225839c);
        }
        String str = this.f225840d;
        if (str == null || (str != null && str.length() == 0)) {
            this.f225840d = this.f225838b.getResources().getString(C0966R.string.au5);
        }
        C77398g.C77402i iVar = this.f225837a;
        String str2 = this.f225840d;
        C77389a aVar = iVar.f225714b;
        aVar.f225663t = str2;
        aVar.f225620C = new C77427d(this, tVar);
        String str3 = this.f225841e;
        if (str3 == null || (str3 != null && str3.length() == 0)) {
            this.f225841e = this.f225838b.getResources().getString(C0966R.string.atx);
        }
        C77398g.C77402i iVar2 = this.f225837a;
        String str4 = this.f225841e;
        C77389a aVar2 = iVar2.f225714b;
        aVar2.f225664u = str4;
        aVar2.f225621D = new C77428e(this, tVar);
        return this;
    }
}
