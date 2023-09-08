package wd3;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import je0.C33544n;
import je0.C46498v;
import junit.framework.Assert;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C39989b;
import p910lj.C76701a;
import qo3.C77398g;
import qo3.C89779i0;

/* renamed from: wd3.c1 */
public class C78553c1 implements C11385n, C39989b.C39990f {

    /* renamed from: d */
    public C89779i0 f230102d;

    /* renamed from: e */
    public C77398g f230103e = null;

    /* renamed from: f */
    public C39989b.C39992e f230104f;

    /* renamed from: g */
    public Context f230105g;

    /* renamed from: h */
    public View f230106h;

    /* renamed from: i */
    public EditText f230107i;

    /* renamed from: j */
    public TextView f230108j;

    /* renamed from: n */
    public LinkedList<String> f230109n;

    /* renamed from: o */
    public LinkedList<Integer> f230110o;

    /* renamed from: p */
    public LinkedList<String> f230111p;

    /* renamed from: q */
    public String f230112q = "";

    /* renamed from: r */
    public Map<String, Integer> f230113r;

    /* renamed from: s */
    public String f230114s;

    /* renamed from: t */
    public String f230115t;

    /* renamed from: u */
    public String f230116u;

    /* renamed from: v */
    public String f230117v;

    /* renamed from: w */
    public boolean f230118w = true;

    /* renamed from: x */
    public boolean f230119x = true;

    /* renamed from: y */
    public C44590b1 f230120y;

    /* renamed from: z */
    public boolean f230121z = false;

    /* renamed from: wd3.c1$a */
    public class C78554a implements TextWatcher {
        public C78554a() {
        }

        public void afterTextChanged(Editable editable) {
            int length = 50 - editable.length();
            if (length < 0) {
                length = 0;
            }
            TextView textView = C78553c1.this.f230108j;
            if (textView != null) {
                textView.setText(String.valueOf(length));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: wd3.c1$b */
    public class C78555b implements DialogInterface.OnClickListener {

        /* renamed from: wd3.c1$b$a */
        public class C78556a implements MTimerHandler.CallBack {
            public C78556a() {
            }

            public boolean onTimerExpired() {
                C78553c1 c1Var = C78553c1.this;
                if (c1Var.f230106h == null) {
                    return false;
                }
                String trim = c1Var.f230107i.getText().toString().trim();
                Context context = c1Var.f230105g;
                c1Var.f230102d = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), c1Var.f230105g.getString(C0966R.string.ilx), true, true, new C78562d1(c1Var));
                c1Var.f230112q = trim;
                if (c1Var.f230109n.size() != 1 || !C72996z1.m85843n5(c1Var.f230109n.getFirst())) {
                    c1Var.mo108527c();
                    return false;
                }
                c1Var.mo108528d();
                return false;
            }
        }

        public C78555b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = C78553c1.this.f230103e;
            if (gVar != null) {
                gVar.dismiss();
                C78553c1.this.f230103e = null;
            }
            new MTimerHandler(new C78556a(), false).startTimer(500);
        }
    }

    /* renamed from: wd3.c1$c */
    public class C78557c implements DialogInterface.OnClickListener {
        public C78557c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = C78553c1.this.f230103e;
            if (gVar != null) {
                gVar.dismiss();
                C78553c1.this.f230103e = null;
            }
            C78553c1.this.mo108530f();
            C39989b.C39992e eVar = C78553c1.this.f230104f;
            if (eVar != null) {
                eVar.mo62595a(false);
            }
        }
    }

    /* renamed from: wd3.c1$d */
    public class C78558d implements Runnable {
        public C78558d() {
        }

        public void run() {
            Context context = C78553c1.this.f230105g;
            if (context instanceof MMActivity) {
                ((MMActivity) context).showVKB();
            }
        }
    }

    /* renamed from: wd3.c1$e */
    public class C78559e implements DialogInterface.OnClickListener {
        public C78559e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C78553c1 c1Var = C78553c1.this;
            c1Var.f230118w = false;
            c1Var.mo108527c();
        }
    }

    /* renamed from: wd3.c1$f */
    public interface C78560f extends C39989b.C39991d {
    }

    public C78553c1(Context context, C39989b.C39992e eVar) {
        this.f230105g = context;
        this.f230104f = eVar;
    }

    /* renamed from: a */
    public void mo108525a() {
        if (this.f230120y != null) {
            C86709a0.m107524d().mo123458d(this.f230120y);
        }
    }

    /* renamed from: b */
    public final void mo108526b(int i, int i2, String str) {
        if (i == 4 && i2 == -22) {
            Context context = this.f230105g;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f7410fi), 1).show();
        } else if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
            C76701a.makeText(this.f230105g, (CharSequence) str, 1).show();
        } else {
            Context context2 = this.f230105g;
            C76701a.makeText(context2, (CharSequence) context2.getString(C0966R.string.f7409fh), 1).show();
        }
        Log.m105924i("MicroMsg.SendVerifyRequest", "dealFail.");
    }

    /* renamed from: c */
    public final void mo108527c() {
        C44590b1 b1Var = new C44590b1(2, this.f230109n, this.f230110o, this.f230112q, "", this.f230113r, this.f230116u);
        this.f230120y = b1Var;
        b1Var.mo69383j1(this.f230118w);
        this.f230120y.mo69384k1(this.f230114s, this.f230115t);
        C86709a0.m107529k().f251779b.mo123460f(this.f230120y);
    }

    /* renamed from: d */
    public final void mo108528d() {
        LinkedList<String> linkedList = this.f230111p;
        if (linkedList == null || linkedList.isEmpty()) {
            this.f230121z = true;
            C86709a0.m107529k().f251779b.mo123455a(881, this);
            C86709a0.m107529k().f251779b.mo123460f(new C33544n(this.f230109n.getFirst(), "", ""));
            return;
        }
        C86709a0.m107529k().f251779b.mo123460f(new C46498v(this.f230109n.getFirst(), this.f230112q, this.f230111p.getFirst(), 0));
    }

    /* renamed from: e */
    public final void mo108529e() {
        C86709a0.m107529k().f251779b.mo123455a(30, this);
        C86709a0.m107529k().f251779b.mo123455a(243, this);
    }

    /* renamed from: f */
    public final void mo108530f() {
        C86709a0.m107529k().f251779b.mo123470p(30, this);
        C86709a0.m107529k().f251779b.mo123470p(243, this);
        C77398g gVar = this.f230103e;
        if (gVar != null) {
            gVar.dismiss();
            this.f230103e = null;
        }
    }

    /* renamed from: g */
    public void mo108531g(LinkedList<String> linkedList, LinkedList<Integer> linkedList2) {
        mo108532h(linkedList, linkedList2, (LinkedList<String>) null);
    }

    /* renamed from: h */
    public void mo108532h(LinkedList<String> linkedList, LinkedList<Integer> linkedList2, LinkedList<String> linkedList3) {
        Assert.assertTrue(linkedList.size() >= 1);
        Assert.assertTrue(linkedList2.size() >= 1);
        mo108529e();
        this.f230109n = linkedList;
        this.f230110o = linkedList2;
        this.f230111p = linkedList3;
        this.f230106h = View.inflate(this.f230105g, C0966R.C0971layout.bwo, (ViewGroup) null);
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.f230117v == null);
        String str = this.f230117v;
        objArr[1] = Integer.valueOf(str == null ? 0 : str.length());
        objArr[2] = this.f230117v;
        Log.m105925i("MicroMsg.SendVerifyRequest", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
        if (!Util.isNullOrNil(this.f230117v)) {
            ((TextView) this.f230106h.findViewById(C0966R.C0970id.jc8)).setText(this.f230117v);
        }
        this.f230107i = (EditText) this.f230106h.findViewById(C0966R.C0970id.jc7);
        TextView textView = (TextView) this.f230106h.findViewById(C0966R.C0970id.lr4);
        this.f230108j = textView;
        textView.setVisibility(0);
        this.f230107i.setText((CharSequence) null);
        this.f230108j.setText(String.valueOf(50));
        this.f230107i.setFilters(C72927t0.f212544a);
        this.f230107i.addTextChangedListener(new C78554a());
        C78555b bVar = new C78555b();
        C78557c cVar = new C78557c();
        Context context = this.f230105g;
        C77398g x = C76879j.m92753x(context, context.getString(C0966R.string.f361263im1), (String) null, this.f230106h, bVar, cVar);
        this.f230103e = x;
        if (x == null) {
            mo108530f();
        }
        this.f230107i.post(new C78558d());
    }

    /* renamed from: i */
    public void mo108533i(List<String> list, List<Integer> list2) {
        this.f230119x = false;
        mo108529e();
        this.f230109n = new LinkedList<>(list);
        this.f230110o = new LinkedList<>(list2);
        if (list.size() != 1 || !C72996z1.m85843n5(this.f230109n.getFirst())) {
            mo108527c();
        } else {
            mo108528d();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        int i3;
        int i4 = i;
        int i5 = i2;
        String str3 = str;
        C117747y yVar2 = yVar;
        if (yVar.getType() == 881) {
            C86709a0.m107529k().f251779b.mo123470p(881, this);
            if (i4 != 0 || i5 != 0) {
                Context context = this.f230105g;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.ilv), 1).show();
            } else if (this.f230121z) {
                C86709a0.m107529k().f251779b.mo123460f(new C46498v(this.f230109n.getFirst(), this.f230112q, ((C33544n) yVar2).f90818h.f130355s, 0));
            }
            this.f230121z = false;
        } else if (yVar.getType() == 30 || yVar.getType() == 243) {
            boolean z = yVar2 instanceof C44590b1;
            if (!z || (i3 = ((C44590b1) yVar2).f120898g) == 2 || i3 == 1) {
                Log.m105918d("MicroMsg.SendVerifyRequest", "onSceneEnd, errType = " + i4 + ", errCode = " + i5);
                C89779i0 i0Var = this.f230102d;
                if (i0Var != null) {
                    i0Var.dismiss();
                    this.f230102d = null;
                }
                mo108530f();
                if (!(i4 == 0 && i5 == 0) && z && ((C44590b1) yVar2).f120898g == 1) {
                    Log.m105924i("MicroMsg.SendVerifyRequest", "onSceneEnd, addcontact error.");
                    if (i5 == -44) {
                        Log.m105924i("MicroMsg.SendVerifyRequest", "dealAddContactError, resend request ver.");
                        this.f230116u = "";
                        C44590b1 b1Var = new C44590b1(2, this.f230109n, this.f230110o, this.f230112q, "", this.f230113r, "");
                        this.f230120y = b1Var;
                        b1Var.mo69383j1(this.f230118w);
                        this.f230120y.mo69384k1(this.f230114s, this.f230115t);
                        C86709a0.m107529k().f251779b.mo123460f(this.f230120y);
                    } else if (i5 == -87) {
                        Context context2 = this.f230105g;
                        C76879j.m92748s(context2, context2.getString(C0966R.string.bkh), "");
                    } else if (i5 == -101 && !Util.isNullOrNil(str)) {
                        Log.m105919d("MicroMsg.SendVerifyRequest", "jacks catch add Contact errCode: %d && errMsg: %s", Integer.valueOf(i2), str3);
                        C76879j.m92713G(this.f230105g, str3, "", false, new C78564e1(this, i5, str3));
                    } else if (i5 == -2) {
                        if (!Util.isNullOrNil(str)) {
                            Context context3 = this.f230105g;
                            C76879j.m92754y(context3, str3, context3.getString(C0966R.string.a3h), this.f230105g.getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                            return;
                        }
                        mo108526b(i4, i5, (String) null);
                    } else if (i5 != -160) {
                        mo108526b(i, i2, str);
                    } else if (!Util.isNullOrNil(str)) {
                        Context context4 = this.f230105g;
                        C76879j.m92707A(context4, str, "", context4.getResources().getString(C0966R.string.f7935ws), this.f230105g.getResources().getString(C0966R.string.f7926wf), new C78568f1(this), (DialogInterface.OnClickListener) null);
                    } else {
                        mo108526b(i, i2, str);
                    }
                } else if (i4 == 0 && i5 == 0) {
                    Log.m105924i("MicroMsg.SendVerifyRequest", "onSceneEnd, 已发送");
                    if (this.f230119x) {
                        Context context5 = this.f230105g;
                        C76879j.m92726T(context5, context5.getString(C0966R.string.ilw));
                    }
                    C39989b.C39992e eVar = this.f230104f;
                    if (eVar != null) {
                        eVar.mo62595a(true);
                    }
                } else {
                    if (i4 == 4 && i5 == -34) {
                        str2 = this.f230105g.getString(C0966R.string.exz);
                    } else if (i4 == 4 && i5 == -94) {
                        str2 = this.f230105g.getString(C0966R.string.f360807ey2);
                    } else {
                        if (!(i4 == 4 && i5 == -24 && !Util.isNullOrNil(str))) {
                            if (i5 == -160) {
                                if (!Util.isNullOrNil(str)) {
                                    Context context6 = this.f230105g;
                                    C76879j.m92707A(context6, str, "", context6.getResources().getString(C0966R.string.f7935ws), this.f230105g.getResources().getString(C0966R.string.f7926wf), new C78559e(), (DialogInterface.OnClickListener) null);
                                }
                                str2 = null;
                            } else if (i4 != 4 || Util.isNullOrNil(str)) {
                                str2 = this.f230105g.getString(C0966R.string.ilv);
                            }
                        }
                        str2 = str3;
                    }
                    if (this.f230119x && !Util.isNullOrNil(str2)) {
                        C76701a.makeText(this.f230105g, (CharSequence) str2, 1).show();
                    }
                    C39989b.C39992e eVar2 = this.f230104f;
                    if (eVar2 != null) {
                        eVar2.mo62595a(false);
                    }
                }
            } else {
                Log.m105920e("MicroMsg.SendVerifyRequest", "not opcode sendrequest!");
            }
        } else {
            Log.m105928w("MicroMsg.SendVerifyRequest", "not expected scene,  type = " + yVar.getType());
        }
    }
}
