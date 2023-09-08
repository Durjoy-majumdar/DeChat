package n62;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l62.C10468a;
import nj3.C76879j;
import nj3.C76912y0;
import o62.C11375e;
import o62.C11379f;
import ob0.C11385n;
import ob0.C117747y;
import p62.C35382d;
import p629ny.C76979h;
import qo3.C47883u;
import qo3.C77426q;
import te3.C49095d43;
import wd3.C53155r0;

/* renamed from: n62.a */
public class C11136a extends C11375e implements C11385n {

    /* renamed from: e */
    public ProgressDialog f32896e = null;

    /* renamed from: f */
    public C10468a f32897f;

    /* renamed from: g */
    public WeakReference<Context> f32898g;

    /* renamed from: h */
    public long f32899h;

    /* renamed from: i */
    public String f32900i;

    /* renamed from: j */
    public String f32901j;

    /* renamed from: n */
    public String f32902n;

    /* renamed from: o */
    public String f32903o;

    /* renamed from: p */
    public String f32904p;

    /* renamed from: q */
    public String f32905q;

    /* renamed from: n62.a$a */
    public class C11137a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ Bundle f32906e;

        /* renamed from: f */
        public final /* synthetic */ Map f32907f;

        /* renamed from: g */
        public final /* synthetic */ String f32908g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference f32909h;

        /* renamed from: i */
        public final /* synthetic */ WeakReference f32910i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11137a(int i, C53155r0 r0Var, Bundle bundle, Map map, String str, WeakReference weakReference, String str2, WeakReference weakReference2) {
            super(i, r0Var);
            this.f32906e = bundle;
            this.f32907f = map;
            this.f32908g = str;
            this.f32909h = weakReference;
            this.f32910i = weakReference2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            C11136a.this.f32899h = this.f32906e.getLong("msg_id");
            C11136a aVar = C11136a.this;
            Map map = this.f32907f;
            String str = this.f32908g;
            WeakReference<Context> weakReference = this.f32909h;
            aVar.getClass();
            if (weakReference != null) {
                int i = 1;
                try {
                    if (weakReference.get() != null) {
                        aVar.f32898g = weakReference;
                        if ("new_tmpl_type_succeed_contact_window".equals((String) map.get(str + ".window_template.$type"))) {
                            aVar.f32900i = Util.nullAs((String) map.get(str + ".window_template.title"), "");
                            aVar.f32901j = Util.nullAs((String) map.get(str + ".window_template.cancel_wording"), "");
                            aVar.f32902n = Util.nullAs((String) map.get(str + ".window_template.confirm_wording"), "");
                            aVar.f32903o = Util.nullAs((String) map.get(str + ".origin_username"), "");
                            aVar.f32904p = Util.nullAs((String) map.get(str + ".heir_username"), "");
                            aVar.f32905q = Util.nullAs((String) map.get(str + ".succeed_ticket"), "");
                            ArrayList<C11379f.C11380a> a = C11379f.m11201a(aVar.f32900i);
                            if (a != null && a.size() > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<C11379f.C11380a> it = a.iterator();
                                while (it.hasNext()) {
                                    C11379f.C11380a next = it.next();
                                    if (next != null) {
                                        if (next.f33506b != null) {
                                            int i2 = next.f33505a;
                                            if (i2 == 0) {
                                                arrayList.add(new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), next.f33506b)));
                                            } else if (i2 == i) {
                                                int i3 = 0;
                                                while (true) {
                                                    String str2 = str + ".window_template.link_list.link";
                                                    if (i3 != 0) {
                                                        str2 = str2 + i3;
                                                    }
                                                    if (Util.isNullOrNil((String) map.get(str2))) {
                                                        break;
                                                    }
                                                    String str3 = (String) map.get(str2 + ".$type");
                                                    if (next.f33506b.equals((String) map.get(str2 + ".$name")) && "link_plain".equals(str3)) {
                                                        arrayList.add(Util.nullAs((String) map.get(str2 + ".plain"), ""));
                                                    }
                                                    i3++;
                                                    i = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                CharSequence spannableString = new SpannableString("");
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    spannableString = TextUtils.concat(new CharSequence[]{spannableString, (CharSequence) it4.next()});
                                }
                                aVar.f32900i = spannableString.toString();
                            }
                            aVar.mo11241e(weakReference.get());
                            aVar.f32897f = new C10468a(aVar.f32903o, aVar.f32904p, aVar.f32905q, 1);
                            C86709a0.m107524d().mo123460f(aVar.f32897f);
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            }
            C11136a.this.getClass();
            ((C7241k) C86312j.m106911c(C7241k.class)).h80("new_link_succeed_contact", this.f32907f, this.f32906e, this.f32909h, this.f32910i);
        }
    }

    /* renamed from: n62.a$b */
    public class C11138b implements DialogInterface.OnCancelListener {
        public C11138b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(C11136a.this.f32897f);
        }
    }

    /* renamed from: n62.a$c */
    public class C11139c implements C47883u {
        public C11139c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105925i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "click %s", Boolean.valueOf(z));
            if (z) {
                WeakReference<Context> weakReference = C11136a.this.f32898g;
                if (weakReference == null || weakReference.get() == null) {
                    Log.m105920e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "onDialogClick context == null");
                    return;
                }
                C11136a aVar = C11136a.this;
                aVar.f32897f = new C10468a(aVar.f32903o, aVar.f32904p, aVar.f32905q, 2);
                C86709a0.m107524d().mo123460f(C11136a.this.f32897f);
                C11136a.this.mo11241e(C11136a.this.f32898g.get());
                C35382d.m40670O(C11136a.this.f32899h, 9);
                return;
            }
            C35382d.m40670O(C11136a.this.f32899h, 10);
        }
    }

    public C11136a(C11375e.C11378c cVar) {
        super(cVar);
        C86709a0.m107524d().mo123455a(3713, this);
    }

    /* renamed from: b */
    public String mo11238b() {
        return "new_link_succeed_contact";
    }

    /* renamed from: c */
    public CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        Bundle bundle2 = bundle;
        if (map == null) {
            return null;
        }
        String string = bundle2 != null ? bundle2.getString("conv_talker_username") : "";
        String nullAsNil = Util.nullAsNil(map.get(str + ".title"));
        SpannableString spannableString = new SpannableString(nullAsNil);
        spannableString.setSpan(new C11137a(1, (C53155r0) null, bundle, map, str, weakReference, string, weakReference2), 0, nullAsNil.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    public void mo11240d() {
        super.mo11240d();
        C86709a0.m107524d().mo123470p(3713, this);
    }

    /* renamed from: e */
    public final void mo11241e(Context context) {
        ProgressDialog progressDialog = this.f32896e;
        if (progressDialog == null) {
            this.f32896e = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.hfy), true, true, new C11138b());
        } else if (!progressDialog.isShowing()) {
            this.f32896e.show();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        ProgressDialog progressDialog = this.f32896e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f32896e.dismiss();
        }
        if (yVar instanceof C10468a) {
            C49095d43 d432 = null;
            if (i2 == -3600) {
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.hft));
                qVar.mo107601m(C0966R.string.lkg);
                qVar.mo107600l((C47883u) null);
                qVar.mo107603o();
                C35382d.m40670O(this.f32899h, 7);
                return;
            }
            if (i == 0 && i2 == 0) {
                C10468a aVar = (C10468a) yVar;
                C49095d43 d433 = aVar.f31702f;
                if (d433 != null) {
                    d432 = d433;
                }
                int i3 = aVar.f31703g;
                if (d432 != null) {
                    Log.m105925i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "NetSceneOpenImNotAutoSucceed ret:%s action:%s", Integer.valueOf(d432.BaseResponse.f135955d), Integer.valueOf(i3));
                    if (i3 == 1) {
                        WeakReference<Context> weakReference = this.f32898g;
                        if (weakReference == null || weakReference.get() == null) {
                            Log.m105920e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "NOT_AUTO_SUCCEED_ACTION_PREPARE context == null");
                            return;
                        }
                        C77426q qVar2 = new C77426q(this.f32898g.get());
                        qVar2.mo107589a(false);
                        qVar2.mo107595g(this.f32900i);
                        qVar2.mo107598j(this.f32901j);
                        qVar2.mo107602n(this.f32902n);
                        qVar2.mo107590b(new C11139c());
                        qVar2.mo107603o();
                        C35382d.m40670O(this.f32899h, 8);
                        return;
                    }
                    return;
                }
                Log.m105920e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "notAutoSucceedResp is null");
            }
            Context context = MMApplicationContext.getContext();
            if (Util.isNullOrNil(str)) {
                str = MMApplicationContext.getContext().getString(C0966R.string.f7966xq);
            }
            C76912y0.makeText(context, (CharSequence) str, 0).show();
            C35382d.m40670O(this.f32899h, 6);
        }
    }
}
