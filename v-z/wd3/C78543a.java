package wd3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.events.ModNewContactEvent;
import com.tencent.p014mm.feature.openim.impl.SpamInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import cp3.C7123c;
import di3.C86312j;
import eb0.C31519v2;
import f40.C86709a0;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import je0.C46472e;
import junit.framework.Assert;
import nj3.C76870b0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C39989b;
import p148ei.C7660a;
import p148ei.C7662f;
import p910lj.C76701a;
import p921uv.C78282a;
import qo3.C89779i0;
import sj0.C90202a;
import te3.mq4;
import te3.pq4;
import te3.qq4;
import wd3.C78553c1;

/* renamed from: wd3.a */
public class C78543a implements C11385n, C39989b.C0704a {

    /* renamed from: A */
    public String f230027A = "";

    /* renamed from: B */
    public int f230028B = 0;

    /* renamed from: C */
    public mq4 f230029C;

    /* renamed from: D */
    public C78553c1.C78560f f230030D;

    /* renamed from: E */
    public String f230031E = "";

    /* renamed from: F */
    public Map<String, Integer> f230032F;

    /* renamed from: G */
    public boolean f230033G = false;

    /* renamed from: H */
    public String f230034H = "";

    /* renamed from: d */
    public C39989b.C0705b f230035d;

    /* renamed from: e */
    public C39989b.C0706c f230036e;

    /* renamed from: f */
    public Context f230037f;

    /* renamed from: g */
    public C89779i0 f230038g;

    /* renamed from: h */
    public LinkedList<String> f230039h;

    /* renamed from: i */
    public LinkedList<Integer> f230040i;

    /* renamed from: j */
    public LinkedList<String> f230041j;

    /* renamed from: n */
    public SpamInfo f230042n;

    /* renamed from: o */
    public String f230043o = "";

    /* renamed from: p */
    public String f230044p;

    /* renamed from: q */
    public String f230045q = "";

    /* renamed from: r */
    public String f230046r = "";

    /* renamed from: s */
    public String f230047s = "";

    /* renamed from: t */
    public String f230048t;

    /* renamed from: u */
    public String f230049u;

    /* renamed from: v */
    public boolean f230050v = true;

    /* renamed from: w */
    public boolean f230051w = true;

    /* renamed from: x */
    public boolean f230052x = true;

    /* renamed from: y */
    public String f230053y = "";

    /* renamed from: z */
    public boolean f230054z = false;

    public C78543a(Context context, C39989b.C0705b bVar) {
        this.f230037f = context;
        this.f230035d = bVar;
        this.f230039h = new LinkedList<>();
        this.f230041j = new LinkedList<>();
        this.f230038g = null;
    }

    /* renamed from: g */
    public static boolean m94879g(C44590b1 b1Var, qq4 qq4) {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_stranger_bad_man_error_dialog_show_switch, 1);
        Log.m105925i("MicroMsg.AddContact", "isSupportStrangerBadManDialogShow() swt:%s", Integer.valueOf(Qe));
        if (!(Qe == 1)) {
            Log.m105924i("MicroMsg.AddContact", "needShowDialog, isSupportStrangerBadManDialogShow is 0.");
            return false;
        } else if (qq4 == null) {
            Log.m105924i("MicroMsg.AddContact", "needShowDialog, verifyUserSpamInfo is null.");
            return false;
        } else if (b1Var.f120898g != 1) {
            Log.m105924i("MicroMsg.AddContact", "needShowDialog, is not MM_VERIFYUSER_ADDCONTACT.");
            return false;
        } else if (!Util.isNullOrNil(qq4.f140488f) && !Util.isNullOrNil(qq4.f140487e)) {
            return true;
        } else {
            Log.m105924i("MicroMsg.AddContact", "needShowDialog, key word is null.");
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m94880h(C44590b1 b1Var) {
        if (!(b1Var instanceof C44590b1)) {
            return false;
        }
        pq4 pq4 = (pq4) b1Var.f120896e.f127056b.f127083a;
        if (pq4 == null) {
            Log.m105924i("MicroMsg.AddContact", "needShowErrorDialog, response is null.");
            return false;
        } else if (b1Var.f120898g == 1) {
            return m94879g(b1Var, pq4.f139907f);
        } else {
            Log.m105924i("MicroMsg.AddContact", "needShowErrorDialog, MM_VERIFYUSER_ADDCONTACT is not.");
            return false;
        }
    }

    /* renamed from: a */
    public void mo108500a(String str, String str2, LinkedList<Integer> linkedList) {
        this.f230047s = str2;
        mo108501b(str, linkedList, false, "");
    }

    /* renamed from: b */
    public void mo108501b(String str, LinkedList<Integer> linkedList, boolean z, String str2) {
        boolean z2 = true;
        Assert.assertTrue(str != null && str.length() > 0);
        if (linkedList == null) {
            z2 = false;
        }
        Assert.assertTrue(z2);
        this.f230050v = z;
        this.f230043o = str2;
        this.f230040i = linkedList;
        this.f230039h.add(str);
        this.f230046r = str;
        mo108503d();
    }

    /* renamed from: c */
    public final void mo108502c(int i, int i2, String str) {
        C7662f fVar;
        C7660a a = C7660a.m7782a(str);
        if (a != null && !Util.isNullOrNil(a.f26001b)) {
            str = a.f26001b;
        }
        if (this.f230054z && !Util.isNullOrNil(str)) {
            C76879j.m92748s(this.f230037f, str, "");
        } else if (i == 4 && i2 == -22) {
            Context context = this.f230037f;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f7410fi), 1).show();
        } else if (i != 4 || i2 != -24 || Util.isNullOrNil(str)) {
            Context context2 = this.f230037f;
            C76701a.makeText(context2, (CharSequence) context2.getString(C0966R.string.f7409fh), 1).show();
        } else if (a != null) {
            String str2 = a.f26001b;
            if (!Util.isNullOrNil(str2)) {
                if (a.f26002c == 4 && (fVar = a.f26004e) != null && fVar.f26012d == 1) {
                    C7123c.f25086a.mo8286a(this.f230037f, a);
                } else {
                    C76701a.makeText(this.f230037f, (CharSequence) str2, 1).show();
                }
            }
        } else {
            C76701a.makeText(this.f230037f, (CharSequence) str, 1).show();
        }
        mo108505f(false, false, this.f230046r, this.f230053y);
        mo108504e();
    }

    /* renamed from: d */
    public final void mo108503d() {
        C86709a0.m107529k().f251779b.mo123455a(30, this);
        C86709a0.m107529k().f251779b.mo123455a(C90202a.CTRL_INDEX, this);
        if (this.f230051w) {
            Context context = this.f230037f;
            this.f230038g = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f230037f.getString(C0966R.string.bjo), true, true, new a$$c(this));
        }
        if (C72996z1.m85843n5(this.f230039h.getFirst())) {
            SpamInfo spamInfo = this.f230042n;
            C86709a0.m107529k().f251779b.mo123460f(new C46472e(this.f230039h.getFirst(), this.f230041j.isEmpty() ? "" : this.f230041j.getFirst(), spamInfo == null ? null : spamInfo.f195286f));
            return;
        }
        C44590b1 b1Var = new C44590b1(1, this.f230039h, this.f230040i, this.f230041j, this.f230031E, this.f230045q, this.f230032F, this.f230047s, this.f230043o, this.f230034H);
        if (!Util.isNullOrNil(this.f230048t)) {
            b1Var.mo69384k1(this.f230048t, this.f230049u);
        }
        b1Var.mo69385q(this.f230027A);
        b1Var.mo69382J(this.f230028B);
        b1Var.mo56092a1(this.f230029C);
        b1Var.mo69383j1(this.f230052x);
        C86709a0.m107529k().f251779b.mo123460f(b1Var);
    }

    /* renamed from: e */
    public final void mo108504e() {
        C78553c1.C78560f fVar = this.f230030D;
        if (fVar != null) {
            fVar.mo62594b();
            Log.m105924i("MicroMsg.AddContact", "errorFinishAddContact.");
        }
    }

    /* renamed from: f */
    public final void mo108505f(boolean z, boolean z2, String str, String str2) {
        C39989b.C0705b bVar = this.f230035d;
        if (bVar != null) {
            bVar.mo677a(z, z2, str, str2);
        }
        if (z) {
            ModNewContactEvent modNewContactEvent = new ModNewContactEvent();
            modNewContactEvent.f193738d.f193739a = str;
            modNewContactEvent.publish();
        }
    }

    /* renamed from: i */
    public final void mo108506i(int i, int i2, String str, C117747y yVar, String str2) {
        int i3 = i;
        int i4 = i2;
        C89779i0 i0Var = this.f230038g;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f230038g = null;
        }
        C86709a0.m107529k().f251779b.mo123470p(30, this);
        C86709a0.m107529k().f251779b.mo123470p(C90202a.CTRL_INDEX, this);
        int i5 = 0;
        this.f230033G = false;
        C7660a a = C7660a.m7782a(str);
        String str3 = (a == null || Util.isNullOrNil(a.f26001b)) ? str : a.f26001b;
        if (yVar.getType() == 667) {
            boolean z = (i3 == 0 && i4 == 0) || i4 == -44;
            SpamInfo spamInfo = this.f230042n;
            int i6 = spamInfo != null && !TextUtils.isEmpty(spamInfo.f195285e) ? 4 : 3;
            int i7 = z ? 1 : 2;
            SpamInfo spamInfo2 = this.f230042n;
            C78282a.m94571a(i6, i7, spamInfo2 != null ? spamInfo2.f195284d : 0);
        }
        if (i3 == 0 && i4 == 0) {
            if (yVar.getType() == 30) {
                this.f230046r = ((C44590b1) yVar).mo56091T0();
            } else if (yVar.getType() == 667) {
                this.f230046r = ((C46472e) yVar).f125202f;
            }
            mo108505f(true, false, this.f230046r, this.f230053y);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[7];
            objArr[0] = this.f230048t;
            objArr[1] = 1;
            objArr[2] = 0;
            objArr[3] = 0;
            if (this.f230040i.size() > 0) {
                i5 = this.f230040i.getLast().intValue();
            }
            objArr[4] = Integer.valueOf(i5);
            objArr[5] = 1;
            objArr[6] = 0;
            nVar.mo160131h(18713, objArr);
            return;
        }
        String str4 = "";
        if (i4 == -44) {
            String str5 = this.f230053y;
            C39989b.C0706c cVar = this.f230036e;
            if (cVar != null) {
                String str6 = this.f230046r;
                if (!this.f230041j.isEmpty()) {
                    str4 = this.f230041j.getFirst();
                }
                if (cVar.mo678a(str6, str5, str4, i2, str2)) {
                    mo108505f(false, false, this.f230046r, str5);
                    return;
                }
            }
            mo108508k();
        } else if (i4 == -4000) {
            String str7 = this.f230053y;
            C39989b.C0706c cVar2 = this.f230036e;
            if (cVar2 != null) {
                String str8 = this.f230046r;
                if (!this.f230041j.isEmpty()) {
                    str4 = this.f230041j.getFirst();
                }
                if (cVar2.mo678a(str8, str7, str4, i2, str2)) {
                    mo108505f(false, false, this.f230046r, str7);
                    return;
                }
            }
            mo108508k();
        } else if (i4 == -87) {
            Context context = this.f230037f;
            C76879j.m92713G(context, context.getString(C0966R.string.bkh), str4, false, new a$$a(this));
        } else if (i4 == -101 && !Util.isNullOrNil(str3)) {
            Log.m105919d("MicroMsg.AddContact", "jacks catch add Contact errCode: %d && errMsg: %s", Integer.valueOf(i2), str3);
            C76879j.m92713G(this.f230037f, str3, str4, false, new a$$h(this));
        } else if (i4 == -2) {
            if (!Util.isNullOrNil(str3)) {
                Context context2 = this.f230037f;
                C76879j.m92711E(context2, str3, context2.getString(C0966R.string.a3h), this.f230037f.getString(C0966R.string.a18), false, new a$$b(this));
                return;
            }
            mo108502c(i3, i4, (String) null);
        } else if (i4 != -160) {
            mo108502c(i, i2, str);
        } else if (!Util.isNullOrNil(str3)) {
            Context context3 = this.f230037f;
            C76879j.m92707A(context3, str3, "", context3.getResources().getString(C0966R.string.f7935ws), this.f230037f.getResources().getString(C0966R.string.f7926wf), new a$$i(this), (DialogInterface.OnClickListener) null);
        } else {
            mo108502c(i, i2, str);
        }
    }

    /* renamed from: j */
    public void mo108507j(Activity activity, C72996z1 z1Var, String str, LinkedList<Integer> linkedList) {
        C72996z1 z1Var2 = z1Var;
        String str2 = str;
        LinkedList<Integer> linkedList2 = linkedList;
        this.f230040i = linkedList2;
        if (this.f230041j == null) {
            this.f230041j = new LinkedList<>();
        }
        Log.m105925i("MicroMsg.AddContact", "sendRequestImmediateAddContact, userName: %s.", str2);
        if (linkedList2 != null) {
            Log.m105925i("MicroMsg.AddContact", "sendRequestImmediateAddContact, lstScene.size: %s.", Integer.valueOf(linkedList.size()));
        }
        if (z1Var2 != null) {
            Log.m105925i("MicroMsg.AddContact", "sendRequestImmediateAddContact, contact getUsername: %s, getAntiSpamTicket: %s.", z1Var.getUsername(), z1Var2.f149527Z0);
        }
        String stringExtra = activity.getIntent().getStringExtra("room_name");
        String stringExtra2 = activity.getIntent().getStringExtra("AntispamTicket");
        Log.m105925i("MicroMsg.AddContact", "sendRequestImmediateAddContact， roomId = %s, antispamTicketFromCard = %s.", stringExtra, stringExtra2);
        if (!TextUtils.isEmpty(stringExtra2)) {
            mo108509l(stringExtra2);
            mo108500a(str, stringExtra, linkedList2);
            return;
        }
        String str3 = "";
        if (TextUtils.isEmpty(stringExtra)) {
            mo108509l(z1Var2.f149527Z0);
            mo108501b(str, linkedList2, false, str3);
        } else if (!TextUtils.isEmpty(this.f230045q)) {
            mo108500a(str, stringExtra, linkedList2);
        } else {
            if (z1Var2 != null) {
                str3 = Util.nullAs(z1Var2.f149527Z0, str3);
            }
            Log.m105925i("MicroMsg.AddContact", "dkverify footer add:%s chat:%s ticket:%s", str2, stringExtra, str3);
            if (!TextUtils.isEmpty(str3)) {
                mo108509l(str3);
                mo108500a(str, stringExtra, linkedList2);
                return;
            }
            C31519v2.m39436a().mo55988e(str, stringExtra, new a$$k(this, z1Var, str, stringExtra, linkedList));
        }
    }

    /* renamed from: k */
    public final void mo108508k() {
        C78553c1 c1Var = new C78553c1(this.f230037f, new a$$j(this));
        String str = this.f230044p;
        if (str != null) {
            c1Var.f230117v = str;
        }
        if (this.f230050v) {
            c1Var.mo108533i(this.f230039h, this.f230040i);
        } else {
            c1Var.mo108532h(this.f230039h, this.f230040i, this.f230041j);
        }
    }

    /* renamed from: l */
    public void mo108509l(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f230041j.add(str);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onSceneEnd, errType = ");
        int i3 = i;
        sb.append(i);
        sb.append(", errCode = ");
        int i4 = i2;
        sb.append(i2);
        sb.append(",");
        sb.append(str);
        Log.m105924i("MicroMsg.AddContact", sb.toString());
        if (yVar.getType() == 30 || yVar.getType() == 667) {
            boolean z = yVar2 instanceof C44590b1;
            if (!z || ((C44590b1) yVar2).f120898g == 1) {
                C89779i0 i0Var = this.f230038g;
                Activity activity = null;
                if (i0Var != null) {
                    i0Var.dismiss();
                    this.f230038g = null;
                }
                if (z) {
                    C44590b1 b1Var = (C44590b1) yVar2;
                    pq4 pq4 = (pq4) b1Var.f120896e.f127056b.f127083a;
                    if (this.f230033G) {
                        Log.m105924i("MicroMsg.AddContact", "needShowDialog, isShowErrorDialog.");
                        return;
                    } else if (pq4 != null && m94879g(b1Var, pq4.f139907f)) {
                        WeakReference<Activity> f = AppForegroundDelegate.INSTANCE.mo174212f();
                        if (f != null) {
                            activity = f.get();
                        }
                        if (activity != null) {
                            C76870b0 b0Var = new C76870b0(activity);
                            b0Var.f224692L.setText(pq4.f139907f.f140487e);
                            b0Var.f224693M.setText(pq4.f139907f.f140488f);
                            b0Var.f224694N.setOnClickListener(new a$$f(this, b0Var, i, i2, str, yVar, pq4));
                            a$$e a__e = new a$$e(this, b0Var);
                            b0Var.f224695P.setOnClickListener(a__e);
                            View view = b0Var.f296376G;
                            if (view != null) {
                                view.setOnClickListener(a__e);
                            }
                            b0Var.f224697R.setOnClickListener(new a$$d(this, pq4));
                            if (Util.isNullOrNil(pq4.f139907f.f140489g)) {
                                Log.m105924i("MicroMsg.MMHalfBottomDialog", "hideLinkTips");
                                b0Var.f224697R.setVisibility(4);
                            }
                            b0Var.mo140655A();
                            this.f230033G = true;
                            C78553c1.C78560f fVar = this.f230030D;
                            if (fVar != null) {
                                fVar.mo62593a();
                            }
                            b0Var.mo140665l(new a$$g(this));
                            return;
                        }
                    }
                }
                mo108506i(i, i2, str, yVar, (String) null);
                return;
            }
            Log.m105920e("MicroMsg.AddContact", "not opcode addcontact!");
            return;
        }
        Log.m105928w("MicroMsg.AddContact", "not expected scene,  type = " + yVar.getType());
    }
}
