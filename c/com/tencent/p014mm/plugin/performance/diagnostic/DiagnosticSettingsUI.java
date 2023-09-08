package com.tencent.p014mm.plugin.performance.diagnostic;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import ce2.C28544a;
import com.tencent.matrix.openglleak.hook.OpenGLHook;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.xweb.FileReaderHelper;
import ee2.C86510a;
import ee2.C86511b;
import fe2.C86862a;
import fe2.C86863b;
import j20.C117292a;
import java.util.ArrayList;
import org.xwalk.core.XWalkEnvironment;
import p1034se.C90173a;
import p1040te.C90399e;
import p1046ue.C90650d;
import p1060we.C90970b;
import p1060we.C90971c;
import p269xe.C91185g;
import p761yd.C91441c;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI */
public class DiagnosticSettingsUI extends MMActivity implements View.OnClickListener {

    /* renamed from: A */
    public CheckBox f248477A;

    /* renamed from: B */
    public CheckBox f248478B;

    /* renamed from: C */
    public EditText f248479C;

    /* renamed from: D */
    public EditText f248480D;

    /* renamed from: E */
    public EditText f248481E;

    /* renamed from: F */
    public EditText f248482F;

    /* renamed from: G */
    public Button f248483G;

    /* renamed from: H */
    public Button f248484H;

    /* renamed from: I */
    public C86510a f248485I;

    /* renamed from: J */
    public C86862a f248486J;

    /* renamed from: d */
    public CheckBox f248487d;

    /* renamed from: e */
    public CheckBox f248488e;

    /* renamed from: f */
    public CheckBox f248489f;

    /* renamed from: g */
    public CheckBox f248490g;

    /* renamed from: h */
    public CheckBox f248491h;

    /* renamed from: i */
    public CheckBox f248492i;

    /* renamed from: j */
    public CheckBox f248493j;

    /* renamed from: n */
    public CheckBox f248494n;

    /* renamed from: o */
    public EditText f248495o;

    /* renamed from: p */
    public EditText f248496p;

    /* renamed from: q */
    public EditText f248497q;

    /* renamed from: r */
    public EditText f248498r;

    /* renamed from: s */
    public EditText f248499s;

    /* renamed from: t */
    public EditText f248500t;

    /* renamed from: u */
    public EditText f248501u;

    /* renamed from: v */
    public Button f248502v;

    /* renamed from: w */
    public Button f248503w;

    /* renamed from: x */
    public CheckBox f248504x;

    /* renamed from: y */
    public CheckBox f248505y;

    /* renamed from: z */
    public CheckBox f248506z;

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$a */
    public class C85299a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$a$a */
        public class C85300a implements C90971c {
            public C85300a(C85299a aVar) {
            }

            /* renamed from: a */
            public void mo110075a(C91185g gVar) {
            }

            /* renamed from: b */
            public void mo110076b(C90970b bVar) {
            }

            /* renamed from: c */
            public void mo110077c(C90970b bVar) {
            }

            /* renamed from: d */
            public void mo110078d(C90970b bVar) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$a$b */
        public class C85301b implements C90399e.C90402c {
            public C85301b(C85299a aVar) {
            }

            /* renamed from: a */
            public void mo112812a(C90650d dVar) {
                Log.m105920e("onLeak", dVar + "");
            }
        }

        public C85299a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C91441c.m114730d().mo125378b("OpenglLeak") != null) {
                Log.m105918d("MicroMsg.DiagnosticSettingsUI", "MM process openGL hook already started");
                C117292a.m165361g(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C90173a aVar = new C90173a(MMApplicationContext.getContext());
            OpenGLHook.getInstance().setJavaStackDump(true);
            OpenGLHook.getInstance().setNativeStackDump(true);
            aVar.mo112099c((Application) MMApplicationContext.getContext(), new C85300a(this));
            aVar.mo112100d();
            C91441c.m114730d().f262167a.add(aVar);
            C90399e eVar = new C90399e(900000);
            eVar.f259414g = new C85301b(this);
            eVar.mo124620a((Application) DiagnosticSettingsUI.this.getApplicationContext());
            Log.m105918d("MicroMsg.DiagnosticSettingsUI", "MM process openGL hook start success!!");
            C117292a.m165361g(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$b */
    public class C85302b implements MenuItem.OnMenuItemClickListener {
        public C85302b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            DiagnosticSettingsUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$c */
    public class C85303c implements CompoundButton.OnCheckedChangeListener {
        public C85303c() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248492i.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$d */
    public class C85304d implements CompoundButton.OnCheckedChangeListener {
        public C85304d() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248492i.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$e */
    public class C85305e implements CompoundButton.OnCheckedChangeListener {
        public C85305e() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248492i.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$f */
    public class C85306f implements CompoundButton.OnCheckedChangeListener {
        public C85306f() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248489f.setChecked(false);
                DiagnosticSettingsUI.this.f248490g.setChecked(false);
                DiagnosticSettingsUI.this.f248491h.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$g */
    public class C85307g implements CompoundButton.OnCheckedChangeListener {
        public C85307g() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248478B.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$h */
    public class C85308h implements CompoundButton.OnCheckedChangeListener {
        public C85308h() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248478B.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$i */
    public class C85309i implements CompoundButton.OnCheckedChangeListener {
        public C85309i() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248478B.setChecked(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI$j */
    public class C85310j implements CompoundButton.OnCheckedChangeListener {
        public C85310j() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DiagnosticSettingsUI.this.f248505y.setChecked(false);
                DiagnosticSettingsUI.this.f248506z.setChecked(false);
                DiagnosticSettingsUI.this.f248477A.setChecked(false);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7137zf;
    }

    public final void init() {
        this.f248487d = (CheckBox) findViewById(C0966R.C0970id.c4v);
        this.f248488e = (CheckBox) findViewById(C0966R.C0970id.f357863c52);
        this.f248489f = (CheckBox) findViewById(C0966R.C0970id.f357861c50);
        this.f248490g = (CheckBox) findViewById(C0966R.C0970id.c4z);
        this.f248491h = (CheckBox) findViewById(C0966R.C0970id.f357862c51);
        this.f248492i = (CheckBox) findViewById(C0966R.C0970id.c4y);
        this.f248493j = (CheckBox) findViewById(C0966R.C0970id.c4w);
        this.f248494n = (CheckBox) findViewById(C0966R.C0970id.c4x);
        this.f248489f.setOnCheckedChangeListener(new C85303c());
        this.f248490g.setOnCheckedChangeListener(new C85304d());
        this.f248491h.setOnCheckedChangeListener(new C85305e());
        this.f248492i.setOnCheckedChangeListener(new C85306f());
        this.f248495o = (EditText) findViewById(C0966R.C0970id.c59);
        this.f248496p = (EditText) findViewById(C0966R.C0970id.c5_);
        this.f248497q = (EditText) findViewById(C0966R.C0970id.c58);
        this.f248498r = (EditText) findViewById(C0966R.C0970id.c5b);
        this.f248499s = (EditText) findViewById(C0966R.C0970id.c5a);
        this.f248500t = (EditText) findViewById(C0966R.C0970id.c5c);
        this.f248501u = (EditText) findViewById(C0966R.C0970id.c5d);
        this.f248502v = (Button) findViewById(C0966R.C0970id.c4r);
        this.f248503w = (Button) findViewById(C0966R.C0970id.c4s);
        this.f248502v.setOnClickListener(this);
        this.f248503w.setOnClickListener(this);
        this.f248487d.setChecked(this.f248485I.mo118547e());
        CheckBox checkBox = this.f248488e;
        C86510a aVar = this.f248485I;
        checkBox.setChecked(aVar.f248523a.decodeBool(aVar.f251342n, false));
        this.f248489f.setChecked(this.f248485I.mo118546d().contains(XWalkEnvironment.MODULE_MM));
        this.f248490g.setChecked(this.f248485I.mo118546d().contains(XWalkEnvironment.MODULE_APPBRAND));
        this.f248491h.setChecked(this.f248485I.mo118546d().contains(XWalkEnvironment.MODULE_TOOLS));
        this.f248492i.setChecked(this.f248485I.mo118546d().contains("all"));
        CheckBox checkBox2 = this.f248493j;
        C86510a aVar2 = this.f248485I;
        checkBox2.setChecked(aVar2.f248523a.decodeBool(aVar2.f251346r, false));
        CheckBox checkBox3 = this.f248494n;
        C86510a aVar3 = this.f248485I;
        checkBox3.setChecked(aVar3.f248523a.decodeBool(aVar3.f251347s, false));
        EditText editText = this.f248495o;
        C86510a aVar4 = this.f248485I;
        editText.setText(aVar4.f248523a.decodeString(aVar4.f251340l, ".*com\\.tencent\\.mm.*\\.so$"));
        EditText editText2 = this.f248496p;
        C86510a aVar5 = this.f248485I;
        editText2.setText(aVar5.f248523a.decodeString(aVar5.f251341m, ""));
        EditText editText3 = this.f248497q;
        C86510a aVar6 = this.f248485I;
        editText3.setText(Long.toString((long) aVar6.f248523a.decodeInt(aVar6.f248526d, 1)));
        EditText editText4 = this.f248498r;
        C86510a aVar7 = this.f248485I;
        editText4.setText(Integer.toString(aVar7.f248523a.decodeInt(aVar7.f251343o, 0)));
        EditText editText5 = this.f248499s;
        C86510a aVar8 = this.f248485I;
        editText5.setText(Integer.toString(aVar8.f248523a.decodeInt(aVar8.f251344p, 0)));
        EditText editText6 = this.f248500t;
        C86510a aVar9 = this.f248485I;
        editText6.setText(Double.toString(aVar9.f248523a.decodeDouble(aVar9.f251345q, 1.0d)));
        EditText editText7 = this.f248501u;
        C86510a aVar10 = this.f248485I;
        editText7.setText(Integer.toString(aVar10.f248523a.decodeInt(aVar10.f251348t, 52428800)));
        this.f248504x = (CheckBox) findViewById(C0966R.C0970id.f357864c53);
        this.f248505y = (CheckBox) findViewById(C0966R.C0970id.c56);
        this.f248506z = (CheckBox) findViewById(C0966R.C0970id.c55);
        this.f248477A = (CheckBox) findViewById(C0966R.C0970id.c57);
        this.f248478B = (CheckBox) findViewById(C0966R.C0970id.c54);
        this.f248479C = (EditText) findViewById(C0966R.C0970id.c5f);
        this.f248480D = (EditText) findViewById(C0966R.C0970id.c5h);
        this.f248481E = (EditText) findViewById(C0966R.C0970id.c5g);
        this.f248482F = (EditText) findViewById(C0966R.C0970id.c5e);
        this.f248483G = (Button) findViewById(C0966R.C0970id.c4t);
        this.f248484H = (Button) findViewById(C0966R.C0970id.c4u);
        this.f248505y.setOnCheckedChangeListener(new C85307g());
        this.f248506z.setOnCheckedChangeListener(new C85308h());
        this.f248477A.setOnCheckedChangeListener(new C85309i());
        this.f248478B.setOnCheckedChangeListener(new C85310j());
        this.f248504x.setChecked(this.f248486J.mo118547e());
        EditText editText8 = this.f248479C;
        C86862a aVar11 = this.f248486J;
        editText8.setText(aVar11.f248523a.decodeString(aVar11.f252151l, ".*\\.so$"));
        EditText editText9 = this.f248480D;
        C86862a aVar12 = this.f248486J;
        editText9.setText(aVar12.f248523a.decodeString(aVar12.f252152m, (String) null));
        EditText editText10 = this.f248481E;
        C86862a aVar13 = this.f248486J;
        editText10.setText(aVar13.f248523a.decodeString(aVar13.f252153n, ".*"));
        EditText editText11 = this.f248482F;
        C86862a aVar14 = this.f248486J;
        editText11.setText(Integer.toString(aVar14.f248523a.decodeInt(aVar14.f248526d, 1)));
        this.f248505y.setChecked(this.f248486J.mo118546d().contains(XWalkEnvironment.MODULE_MM));
        this.f248506z.setChecked(this.f248486J.mo118546d().contains(XWalkEnvironment.MODULE_APPBRAND));
        this.f248477A.setChecked(this.f248486J.mo118546d().contains(XWalkEnvironment.MODULE_TOOLS));
        this.f248478B.setChecked(this.f248486J.mo118546d().contains("all"));
        this.f248483G.setOnClickListener(this);
        this.f248484H.setOnClickListener(this);
        ((Button) findViewById(C0966R.C0970id.f357860lq0)).setOnClickListener(new C85299a());
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id = view.getId();
        String str = "tools;";
        String str2 = "appbrand;";
        String str3 = "mm;";
        String str4 = "all";
        if (C0966R.C0970id.c4r == id) {
            if (!this.f248492i.isChecked()) {
                StringBuilder sb = new StringBuilder();
                if (!this.f248489f.isChecked()) {
                    str3 = "";
                }
                sb.append(str3);
                if (!this.f248490g.isChecked()) {
                    str2 = "";
                }
                sb.append(str2);
                if (!this.f248491h.isChecked()) {
                    str = "";
                }
                sb.append(str);
                str4 = sb.toString();
            }
            String str5 = "<cmd><diagnostic><MemoryHook enable='" + (this.f248487d.isChecked() ? 1 : 0) + "' process='" + str4 + "' source='push' duration='" + Util.getInt(this.f248497q.getText().toString(), 1) + "' stacklog='" + Util.getInt(this.f248501u.getText().toString(), 52428800) + "' hook='" + this.f248495o.getText().toString() + "' ignore='" + this.f248496p.getText().toString() + "' stack='" + (this.f248488e.isChecked() ? 1 : 0) + "' min='" + Util.getInt(this.f248498r.getText().toString(), 0) + "' max='" + Util.getInt(this.f248499s.getText().toString(), 0) + "' sampling='" + Util.getDouble(this.f248500t.getText().toString(), 1.0d) + "' extreme='" + (this.f248493j.isChecked() ? 1 : 0) + "' mmap='" + (this.f248494n.isChecked() ? 1 : 0) + "'/></diagnostic></cmd>";
            Log.m105919d("MicroMsg.DiagnosticSettingsUI", "cmd = [%s]", str5);
            C28544a.INSTANCE.mo56047c(str5);
            C76701a.makeText((Context) this, (CharSequence) "MemoryHook:Confirmed, pls restart process", 0).show();
        } else if (C0966R.C0970id.c4s == id) {
            C28544a.INSTANCE.mo56046b(XmlParser.parseXml("<cmd><diagnostic><report><MemoryHook/></report></diagnostic></cmd>", FileReaderHelper.OPEN_FILE_FROM_CMD, (String) null));
            C76701a.makeText((Context) this, (CharSequence) "MemoryHook:Reported, pls run `logcat |grep MemoryHookLogic` for result", 0).show();
        } else if (C0966R.C0970id.c4t == id) {
            if (!this.f248478B.isChecked()) {
                StringBuilder sb4 = new StringBuilder();
                if (!this.f248505y.isChecked()) {
                    str3 = "";
                }
                sb4.append(str3);
                if (!this.f248506z.isChecked()) {
                    str2 = "";
                }
                sb4.append(str2);
                if (!this.f248477A.isChecked()) {
                    str = "";
                }
                sb4.append(str);
                str4 = sb4.toString();
            }
            String str6 = "<cmd><diagnostic><PthreadHook enable='" + (this.f248504x.isChecked() ? 1 : 0) + "' source='push' process='" + str4 + "' duration='" + Util.getInt(this.f248482F.getText().toString(), 1) + "' hook='" + this.f248479C.getText().toString() + "' ignore='" + this.f248480D.getText().toString() + "' thread='" + this.f248481E.getText().toString() + "'/></diagnostic></cmd>";
            Log.m105919d("MicroMsg.DiagnosticSettingsUI", "cmd = [%s]", str6);
            C28544a.INSTANCE.mo56047c(str6);
            C76701a.makeText((Context) this, (CharSequence) "PthreadHook:Confirmed, pls restart process", 0).show();
        } else if (C0966R.C0970id.c4u == id) {
            C28544a.INSTANCE.mo56047c("<cmd><diagnostic><report><PthreadHook/></report></diagnostic></cmd>");
            C76701a.makeText((Context) this, (CharSequence) "PthreadHook:Reported, pls run `logcat |grep PthreadHookLogic` for result", 0).show();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        getWindow().setSoftInputMode(32);
        super.onCreate(bundle);
        setBackBtn(new C85302b());
        setMMTitle("诊断模式");
        C28544a aVar = C28544a.INSTANCE;
        this.f248485I = ((C86511b) aVar.mo56045a(C86511b.class)).f251353g;
        this.f248486J = ((C86863b) aVar.mo56045a(C86863b.class)).f252158g;
        init();
    }
}
