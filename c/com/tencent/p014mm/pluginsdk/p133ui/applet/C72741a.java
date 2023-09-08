package com.tencent.p014mm.pluginsdk.p133ui.applet;

import a11.C39479c;
import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import p609mp.C76803c;
import p609mp.C76804d;
import p609mp.C76805e;
import pj3.C47511g;
import wd3.C78565f0;
import wd3.C78569g0;
import wd3.C78585u0;

/* renamed from: com.tencent.mm.pluginsdk.ui.applet.a */
public class C72741a implements C76803c {

    /* renamed from: a */
    public Context f211664a;

    /* renamed from: b */
    public C47511g f211665b;

    /* renamed from: c */
    public String f211666c;

    /* renamed from: d */
    public HashMap<String, Preference> f211667d = new HashMap<>();

    /* renamed from: e */
    public boolean f211668e = false;

    /* renamed from: f */
    public boolean f211669f;

    /* renamed from: g */
    public C78565f0 f211670g;

    /* renamed from: h */
    public C76805e.C76807b f211671h = null;

    /* renamed from: i */
    public View.OnClickListener f211672i = null;

    /* renamed from: j */
    public ContactListExpandPreference.C72740a f211673j = null;

    /* renamed from: k */
    public String f211674k;

    /* renamed from: l */
    public boolean f211675l = false;

    /* renamed from: m */
    public View.OnClickListener f211676m = new C6675a(this);

    /* renamed from: n */
    public C76805e.C76807b f211677n = new C6676b();

    /* renamed from: o */
    public C76805e.C76806a f211678o = new C72742c();

    /* renamed from: p */
    public C76804d f211679p = new C72743d();

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.a$a */
    public class C6675a implements View.OnClickListener {
        public C6675a(C72741a aVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ContactListAnchor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.ContactListArchor", "OnClickListener = onClick ");
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ContactListAnchor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.a$b */
    public class C6676b implements C76805e.C76807b {
        public C6676b() {
        }

        /* renamed from: a */
        public boolean mo1069a(ViewGroup viewGroup, View view, int i) {
            C78565f0 f0Var = C72741a.this.f211670g;
            if (f0Var.f230155v && f0Var.mo108546d(i) && !C72741a.this.f211670g.mo108544a(i)) {
                Log.m105918d("MicroMsg.ContactListArchor", "onItemLongClick " + i);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.a$c */
    public class C72742c implements C76805e.C76806a {
        public C72742c() {
        }

        /* renamed from: a */
        public void mo100311a(ViewGroup viewGroup, View view, int i) {
            C78565f0 f0Var;
            C72741a aVar = C72741a.this;
            ContactListExpandPreference.C72740a aVar2 = aVar.f211673j;
            if (aVar2 != null && (f0Var = aVar.f211670g) != null) {
                boolean z = f0Var.f230155v;
                boolean z2 = true;
                if (!z ? !(f0Var.f230144h || i != f0Var.f230153t + 1) : !(f0Var.f230144h || i != f0Var.f230153t + 2)) {
                    aVar2.mo5954b(viewGroup, view, i);
                    return;
                }
                boolean z3 = f0Var.f230144h;
                if (!(!z3 && i == f0Var.f230153t)) {
                    if (z3 || i != f0Var.f230153t + 1) {
                        z2 = false;
                    }
                    if (z2) {
                        if (!z) {
                            return;
                        }
                        if (C72996z1.m85820U5(aVar.f211674k)) {
                            C72741a.this.f211673j.mo5953a(viewGroup, view, i);
                        } else {
                            C72741a.this.f211670g.mo108544a(0);
                        }
                    } else if (!z3 || !f0Var.mo108546d(i)) {
                        C78565f0 f0Var2 = C72741a.this.f211670g;
                        if (!f0Var2.f230144h || f0Var2.mo108546d(i)) {
                            C78565f0 f0Var3 = C72741a.this.f211670g;
                            if (!f0Var3.f230144h && f0Var3.mo108546d(i)) {
                                C72741a.this.f211673j.mo5957e(viewGroup, view, i);
                                return;
                            }
                            return;
                        }
                        C72741a.this.f211673j.mo5956d(viewGroup, view, i);
                    } else {
                        C72741a.this.f211673j.mo5953a(viewGroup, view, i);
                    }
                } else if (f0Var.f230156w) {
                    aVar2.mo5955c(viewGroup, view, i);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.a$d */
    public class C72743d implements C76804d {
        public C72743d() {
        }
    }

    public C72741a(Context context) {
        this.f211664a = context;
        C78565f0 f0Var = new C78565f0(this.f211664a);
        this.f211670g = f0Var;
        f0Var.f230140d = this.f211679p;
    }

    /* renamed from: a */
    public final void mo100308a(String str) {
        C78565f0 f0Var = this.f211670g;
        Class cls = C78585u0.class;
        f0Var.f230135B = str;
        boolean U5 = C72996z1.m85820U5(str);
        f0Var.f230145i = U5;
        if (!U5 && C86312j.m106911c(cls) != null) {
            f0Var.f230146j = ((C78585u0) C86312j.m106911c(cls)).mo73840qC(str);
        }
        if (!f0Var.f230146j) {
            f0Var.f230149p = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        }
        if (f0Var.f230146j && C86312j.m106911c(cls) != null) {
            f0Var.f230137D = ((C78585u0) C86312j.m106911c(cls)).Im0(f0Var.f230135B);
        }
        C78565f0 f0Var2 = this.f211670g;
        f0Var2.f230159z = this.f211668e;
        f0Var2.mo108547f();
        mo100309b();
    }

    /* renamed from: b */
    public void mo100309b() {
        int i;
        String str;
        if (this.f211665b != null && this.f211666c != null) {
            for (String o : this.f211667d.keySet()) {
                this.f211665b.mo72531o(o);
            }
            this.f211667d.clear();
            if (!this.f211675l) {
                int d = this.f211665b.mo72521d(this.f211666c);
                C76805e.C76807b bVar = this.f211671h;
                if (bVar == null) {
                    bVar = this.f211677n;
                }
                View.OnClickListener onClickListener = this.f211672i;
                if (onClickListener == null) {
                    onClickListener = this.f211676m;
                }
                this.f211670g.getClass();
                C44661m1 m1Var = this.f211670g.f230149p;
                int i2 = 0;
                boolean z = m1Var != null && m1Var.mo69797y2();
                C78565f0 f0Var = this.f211670g;
                boolean U5 = f0Var.f230146j ? f0Var.f230148o : C72996z1.m85820U5(f0Var.f230135B);
                C78565f0 f0Var2 = this.f211670g;
                if (f0Var2.f230146j) {
                    z = f0Var2.f230147n;
                }
                int i3 = f0Var2.f230153t + ((!U5 || z) ? 2 : 1);
                Context context = this.f211664a;
                if (context == null) {
                    i = 0;
                } else {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    int width = defaultDisplay.getWidth();
                    int height = defaultDisplay.getHeight();
                    if (((float) width) / (context.getResources().getDimension(C0966R.dimen.f3921j0) + (context.getResources().getDimension(C0966R.dimen.f3913iq) * 2.0f)) < 5.0f || height <= width) {
                        f0Var2.f230139F = false;
                    } else {
                        f0Var2.f230139F = true;
                    }
                    i = width / ((int) ((context.getResources().getDimension(C0966R.dimen.f3913iq) * 2.0f) + context.getResources().getDimension(f0Var2.f230139F ? C0966R.dimen.f3921j0 : C0966R.dimen.f3919iy)));
                    Log.m105925i("MicroMsg.ContactsListArchAdapter", "[getWrapColNum] :%s", Integer.valueOf(i));
                    C78565f0.f230133H = i;
                    if (i == 4) {
                        C78565f0.f230132G = 15;
                    }
                }
                int i4 = 0;
                while (i2 < this.f211670g.getCount() && i2 < i3) {
                    ContactListExpandPreference contactListExpandPreference = new ContactListExpandPreference(this.f211664a, 1);
                    if (i4 >= 0) {
                        str = "pref_contact_list_row_" + i4;
                    } else {
                        str = "pref_contact_list_row_" + (i4 == -1 ? "header" : i4 == -2 ? "footer" : "unkown");
                    }
                    contactListExpandPreference.mo26273A(str);
                    C76805e eVar = contactListExpandPreference.f211663L;
                    C78565f0 f0Var3 = this.f211670g;
                    C78569g0 g0Var = (C78569g0) eVar;
                    g0Var.getClass();
                    g0Var.f230170a = f0Var3;
                    g0Var.f230171b = i4;
                    C78569g0 g0Var2 = (C78569g0) contactListExpandPreference.f211663L;
                    g0Var2.f230172c = i;
                    g0Var2.f230173d = z;
                    g0Var2.f230178i = onClickListener;
                    g0Var2.f230176g = this.f211678o;
                    g0Var2.f230177h = bVar;
                    this.f211665b.mo72524h(contactListExpandPreference, d + i4);
                    this.f211667d.put(contactListExpandPreference.f121285r, contactListExpandPreference);
                    i2 += i;
                    i4++;
                }
                mo100310c(this.f211669f);
            }
        }
    }

    /* renamed from: c */
    public void mo100310c(boolean z) {
        this.f211669f = z;
        for (Preference next : this.f211667d.values()) {
            if (next instanceof ContactListExpandPreference) {
                ((ContactListExpandPreference) next).mo100306R(z);
            }
        }
    }
}
