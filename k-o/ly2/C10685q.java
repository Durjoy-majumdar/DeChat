package ly2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.TeenModeAuthStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.teenmode.p111ui.AuthorizationDetailUI;
import com.tencent.p014mm.plugin.teenmode.p111ui.AuthorizationRequestUI;
import com.tencent.p014mm.plugin.teenmode.p111ui.BindGuardianMsgUI;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeIntro;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModeVerifyPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import d62.C7250m;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import k20.C60958c;
import k20.C9556a;
import ky2.C10428a;
import ky2.C10431b;
import ky2.C10432i;
import ky2.C10434j;
import ky2.C10435k;
import ky2.C10436l;
import ky2.C10437m;
import ky2.C10439o;
import lc3.C10485b;
import my2.C11098e;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C89132b;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36570n;
import t90.C13867d;
import tc0.C77885p;
import te3.C48909bv;
import te3.C51018qv3;
import te3.C64266br1;
import wd3.C15153w0;
import wd3.C65953v0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ly2.q */
public class C10685q extends C86301e implements C10432i {

    /* renamed from: d */
    public int f32104d = 0;

    /* renamed from: e */
    public Set<C10439o> f32105e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public String f32106f;

    /* renamed from: g */
    public int f32107g = 1;

    /* renamed from: h */
    public Map<Integer, C10428a> f32108h = new HashMap();

    /* renamed from: i */
    public HashMap<Integer, C10431b> f32109i = new HashMap<>();

    /* renamed from: ly2.q$a */
    public class C10686a implements C87581a<Object, C89132b.C89134c<C48909bv>> {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f32110a;

        /* renamed from: b */
        public final /* synthetic */ Context f32111b;

        public C10686a(C10685q qVar, C89779i0 i0Var, Context context) {
            this.f32110a = i0Var;
            this.f32111b = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class<SettingsTeenModeMain> cls = SettingsTeenModeMain.class;
            this.f32110a.dismiss();
            if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                return null;
            }
            if (((C48909bv) cVar.f256796d).f131322d) {
                Intent intent = new Intent(this.f32111b, TeenModePrivatePwdUI.class);
                intent.putExtra("intent_process", 1);
                MMWizardActivity.m7018M7(this.f32111b, intent, new Intent(this.f32111b, cls));
                return null;
            }
            MMWizardActivity.m7018M7(this.f32111b, new Intent(this.f32111b, TeenModeVerifyPwdUI.class), new Intent(this.f32111b, cls));
            return null;
        }
    }

    /* renamed from: ly2.q$b */
    public class C10687b implements C38172g<C10436l> {
        public C10687b(C10685q qVar) {
        }

        public boolean invoke(C15510f fVar) {
            ((C10436l) fVar).onDataChanged();
            return false;
        }
    }

    /* renamed from: ly2.q$c */
    public class C10688c implements C87581a<Object, C89132b.C89134c<C48909bv>> {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f32112a;

        /* renamed from: b */
        public final /* synthetic */ DialogInterface.OnDismissListener f32113b;

        /* renamed from: c */
        public final /* synthetic */ Activity f32114c;

        /* renamed from: d */
        public final /* synthetic */ int f32115d;

        /* renamed from: e */
        public final /* synthetic */ String f32116e;

        /* renamed from: f */
        public final /* synthetic */ int f32117f;

        public C10688c(C10685q qVar, C89779i0 i0Var, DialogInterface.OnDismissListener onDismissListener, Activity activity, int i, String str, int i2) {
            this.f32112a = i0Var;
            this.f32113b = onDismissListener;
            this.f32114c = activity;
            this.f32115d = i;
            this.f32116e = str;
            this.f32117f = i2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            this.f32112a.dismiss();
            DialogInterface.OnDismissListener onDismissListener = this.f32113b;
            if (onDismissListener != null) {
                onDismissListener.onDismiss((DialogInterface) null);
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                if (((C48909bv) cVar.f256796d).f131322d) {
                    Intent intent = new Intent(this.f32114c, TeenModePrivatePwdUI.class);
                    intent.putExtra("intent_process", 1);
                    intent.putExtra("intent_extra_biz_type", this.f32115d);
                    intent.putExtra("intent_extra_biz_key", this.f32116e);
                    Activity activity = this.f32114c;
                    int i = this.f32117f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    aVar.mo10233c(intent);
                    C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$3", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                } else {
                    Intent intent2 = new Intent(this.f32114c, TeenModeVerifyPwdUI.class);
                    intent2.putExtra("intent_extra_biz_type", this.f32115d);
                    intent2.putExtra("intent_extra_biz_key", this.f32116e);
                    Activity activity2 = this.f32114c;
                    int i2 = this.f32117f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    aVar2.mo10233c(intent2);
                    C117292a.m165364j(activity2, aVar2.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService$3", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
            return null;
        }
    }

    /* renamed from: ly2.q$d */
    public class C10689d implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f32118a;

        /* renamed from: b */
        public final /* synthetic */ String f32119b;

        /* renamed from: c */
        public final /* synthetic */ int f32120c;

        /* renamed from: d */
        public final /* synthetic */ String f32121d;

        /* renamed from: e */
        public final /* synthetic */ String f32122e;

        /* renamed from: f */
        public final /* synthetic */ C72996z1 f32123f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f32124g;

        /* renamed from: h */
        public final /* synthetic */ Context f32125h;

        /* renamed from: i */
        public final /* synthetic */ C15153w0 f32126i;

        /* renamed from: ly2.q$d$a */
        public class C10690a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public int f32128d = 0;

            /* renamed from: e */
            public final /* synthetic */ long f32129e;

            /* renamed from: f */
            public final /* synthetic */ C89779i0 f32130f;

            /* renamed from: g */
            public final /* synthetic */ boolean f32131g;

            public C10690a(long j, C89779i0 i0Var, boolean z) {
                this.f32129e = j;
                this.f32130f = i0Var;
                this.f32131g = z;
            }

            public boolean onTimerExpired() {
                Map<String, String> parseXml;
                int i;
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f32129e);
                if (b002.mo108774y2() > 0 || (i = this.f32128d) >= 10) {
                    this.f32130f.dismiss();
                    if (b002.mo108774y2() > 0) {
                        C10689d dVar = C10689d.this;
                        C10685q.this.mo10744WJ(dVar.f32125h, dVar.f32123f.getUsername(), C75592q0.m90789s(), b002.getCreateTime(), b002.mo108774y2(), b002.getContent(), b002.mo108765s2(), Boolean.FALSE);
                    }
                    C10689d dVar2 = C10689d.this;
                    C10685q qVar = C10685q.this;
                    C15153w0 w0Var = dVar2.f32126i;
                    boolean z = this.f32131g;
                    qVar.getClass();
                    if (w0Var != null) {
                        w0Var.mo5557a(z);
                    }
                    C10689d dVar3 = C10689d.this;
                    if (dVar3.f32120c != 3 || (parseXml = XmlParser.parseXml(dVar3.f32122e, "content", (String) null)) == null || parseXml.get(".content") == null) {
                        return false;
                    }
                    C68070l.C68072b u = C68070l.C68072b.m80422u(parseXml.get(".content"), (String) null);
                    TeenModeAuthStruct teenModeAuthStruct = new TeenModeAuthStruct();
                    teenModeAuthStruct.f10061d = 1;
                    teenModeAuthStruct.f10062e = 1;
                    teenModeAuthStruct.f10063f = (long) C10689d.this.f32120c;
                    teenModeAuthStruct.f10064g = teenModeAuthStruct.mo86045b("requestID", b002.mo108774y2() + "", true);
                    teenModeAuthStruct.f10065h = teenModeAuthStruct.mo86045b("requestResource", u.f195586j, true);
                    teenModeAuthStruct.mo86054n();
                    return false;
                }
                this.f32128d = i + 1;
                return true;
            }
        }

        public C10689d(String str, String str2, int i, String str3, String str4, C72996z1 z1Var, byte[] bArr, Context context, C15153w0 w0Var) {
            this.f32118a = str;
            this.f32119b = str2;
            this.f32120c = i;
            this.f32121d = str3;
            this.f32122e = str4;
            this.f32123f = z1Var;
            this.f32124g = bArr;
            this.f32125h = context;
            this.f32126i = w0Var;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195570f = this.f32118a;
                bVar.f195574g = this.f32119b;
                bVar.f195586j = "https://support.weixin.qq.com/update/";
                bVar.f195646y = "http://wxapp.tc.qq.com/251/20304/stodownload?m=adb36df21d075a4c2148a2c0fc361304&filekey=30450201010420301e020200fb0402535a0410adb36df21d075a4c2148a2c0fc3613040202188a041e000000046274667300000001310000000861707073746f72650000000131&hy=SZ&storeid=32303231303932383030353631353030303362636238303062633631346565633763333930613030303030306662&dotrans=0&sourceflag=1&bizid=1023&adaptivelytrans=0";
                bVar.f195582i = 84;
                C13867d dVar = new C13867d();
                dVar.f39032d = this.f32120c;
                dVar.f39031c = this.f32121d;
                dVar.f39033e = Util.nullAsNil(this.f32122e);
                bVar.mo93545f(dVar);
                Pair<Integer, Long> qE = C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", this.f32123f.getUsername(), "", this.f32124g);
                if (!Util.isNullOrNil(str)) {
                    C7250m.m7431a().mo136257Tm(this.f32123f.getUsername(), str, C45628s0.m50810y(this.f32123f.getUsername()), 0);
                }
                long longValue = ((Long) qE.second).longValue();
                if (longValue > 0) {
                    Context context = this.f32125h;
                    new MTimerHandler(new C10690a(longValue, C76879j.m92723Q(context, "", context.getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null), z), true).startTimer(0, 1000);
                    return;
                }
                C10685q qVar = C10685q.this;
                C15153w0 w0Var = this.f32126i;
                qVar.getClass();
                if (w0Var != null) {
                    w0Var.mo5557a(false);
                    return;
                }
                return;
            }
            C10685q qVar2 = C10685q.this;
            C15153w0 w0Var2 = this.f32126i;
            qVar2.getClass();
            if (w0Var2 != null) {
                w0Var2.mo5557a(false);
            }
        }
    }

    /* renamed from: ly2.q$e */
    public class C10691e implements C38172g<C10434j> {

        /* renamed from: a */
        public final /* synthetic */ C10434j[] f32133a;

        public C10691e(C10685q qVar, C10434j[] jVarArr) {
            this.f32133a = jVarArr;
        }

        public boolean invoke(C15510f fVar) {
            this.f32133a[0] = (C10434j) fVar;
            return true;
        }
    }

    /* renamed from: ly2.q$f */
    public class C10692f implements C38172g<C10434j> {

        /* renamed from: a */
        public final /* synthetic */ C10434j[] f32134a;

        public C10692f(C10685q qVar, C10434j[] jVarArr) {
            this.f32134a = jVarArr;
        }

        public boolean invoke(C15510f fVar) {
            this.f32134a[0] = (C10434j) fVar;
            return true;
        }
    }

    /* renamed from: ly2.q$g */
    public class C10693g implements C38172g<C10435k> {

        /* renamed from: a */
        public final /* synthetic */ C10435k[] f32135a;

        public C10693g(C10685q qVar, C10435k[] kVarArr) {
            this.f32135a = kVarArr;
        }

        public boolean invoke(C15510f fVar) {
            this.f32135a[0] = (C10435k) fVar;
            return true;
        }
    }

    public static void vx0(Activity activity, int i, int i2, String str, String str2, String str3, String str4, boolean z, C10432i.C10433a aVar) {
        Activity activity2 = activity;
        int i3 = i2;
        String str5 = str;
        C10432i.C10433a aVar2 = aVar;
        Intent intent = new Intent(activity, AuthorizationRequestUI.class);
        intent.putExtra("intent_extra_type", i2);
        intent.putExtra("intent_extra_key", str);
        String str6 = str2;
        intent.putExtra("intent_extra_title", str2);
        String str7 = str3;
        intent.putExtra("intent_extra_digest", str3);
        String str8 = str4;
        intent.putExtra("intent_extra_content", str4);
        intent.putExtra("intent_extra_can_auth", z);
        C13601g gVar = C10672b.f32092a;
        C87412m.m108594g(str, "bizKey");
        if (aVar2 != null) {
            Log.m105924i("MicroMsg.AuthorizationReqCallbackMgr", "addCallback bizType:" + i2 + " bizKey:" + str);
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('#');
            sb.append(str);
            ((Map) ((C36570n) C10672b.f32092a).getValue()).put(sb.toString(), aVar2);
        }
        if (i > 0) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(Integer.valueOf(i));
            aVar3.mo10233c(intent);
            C117292a.m165364j(activity, aVar3.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(intent);
        C117292a.m165358d(activity, aVar4.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar4.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: BD */
    public C72996z1 mo10736BD() {
        Cursor A3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69648A3(1073741824, false);
        C72996z1 z1Var = null;
        while (A3.moveToNext()) {
            z1Var = new C72996z1();
            z1Var.convertFrom(A3);
        }
        A3.close();
        return z1Var;
    }

    public void I40() {
        Log.m105919d("MicroMsg.TeenModeService", "notifyTeenModeDataChanged %d", Integer.valueOf(((CopyOnWriteArraySet) this.f32105e).size()));
        Iterator it = ((CopyOnWriteArraySet) this.f32105e).iterator();
        while (it.hasNext()) {
            ((C10439o) it.next()).onDataChanged();
        }
        C38166b.m41755b(C10436l.class, new C10687b(this));
    }

    /* renamed from: JD */
    public boolean mo10738JD(int i, String str) {
        C10437m jo = C11098e.f32878a.mo11232a().mo11231jo(i, str, 0);
        return !mo10761ts(i).mo10734d(jo.field_time, C31543z5.m39451a()) && C75592q0.m90789s().equals(jo.field_wardUserName);
    }

    /* renamed from: MV */
    public void mo10739MV(C10439o oVar) {
        if (oVar != null) {
            ((CopyOnWriteArraySet) this.f32105e).add(oVar);
        }
    }

    /* renamed from: Mn */
    public int mo10740Mn() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, 2);
        Log.m105919d("MicroMsg.TeenModeService", "getFinderOption, option:%s", Integer.valueOf(j));
        return j;
    }

    public int Oh0() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, 0);
        Log.m105919d("MicroMsg.TeenModeService", "getMiniProgramOption, option:%s", Integer.valueOf(j));
        return j;
    }

    public boolean Pj0() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        if (!(!Util.isNullOrNil(str) && str.toUpperCase().equals("CN"))) {
            Log.m105924i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, not in china, hide entrance.");
            return true;
        }
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowTeenagerMode");
        if (Util.isNullOrNil(c)) {
            Log.m105924i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, ShowTeenagerMode is null");
            return false;
        }
        int parseInt = Integer.parseInt(c);
        Log.m105925i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, val is %s", Integer.valueOf(parseInt));
        return c != null && 1 == parseInt;
    }

    public boolean Ql0(Context context, int i, String str, String str2, String str3, String str4, byte[] bArr, C15153w0 w0Var) {
        Context context2 = context;
        C72996z1 BD = mo10736BD();
        if (BD == null) {
            return false;
        }
        String username = BD.getUsername();
        StringBuilder sb = new StringBuilder();
        sb.append(context2.getString(C0966R.string.jvs));
        String str5 = str2;
        sb.append(str5);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).Tp0(context, username, sb.toString(), true, context2.getString(C0966R.string.a2s), new C10689d(str5, str3, i, str, str4, BD, bArr, context, w0Var), (DialogInterface.OnDismissListener) null);
        return true;
    }

    /* renamed from: WJ */
    public void mo10744WJ(Context context, String str, String str2, long j, long j2, String str3, String str4, Boolean bool) {
        Intent intent = new Intent(context, AuthorizationDetailUI.class);
        intent.putExtra("intent_extra_msg_content", str3);
        intent.putExtra("intent_extra_cdn_img_path", str4);
        intent.putExtra("intent_extra_guardian_username", str);
        intent.putExtra("intent_extra_ward_username", str2);
        intent.putExtra("intent_extra_request_time", j);
        intent.putExtra("intent_extra_msg_svrid", j2);
        intent.putExtra("intent_extra_need_anim", bool);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToAuthorizationMsgUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToAuthorizationMsgUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: WR */
    public <T extends C10428a> void mo10745WR(int i, T t) {
        ((HashMap) this.f32108h).put(Integer.valueOf(i), t);
    }

    public void Wg0(Activity activity, int i) {
        wx0(activity, i, 0, (String) null, (DialogInterface.OnDismissListener) null);
    }

    public void Wq0(Activity activity, int i, int i2, String str, String str2, String str3, String str4, boolean z, C10432i.C10433a aVar) {
        vx0(activity, i, i2, str, str2, str3, str4, z, aVar);
    }

    public void Xp0(int i, C10431b bVar) {
        this.f32109i.put(Integer.valueOf(i), bVar);
    }

    public void dt0(Context context, String str, String str2, String str3, long j) {
        Intent intent = new Intent(context, BindGuardianMsgUI.class);
        intent.putExtra("intent_extra_bind_guardian_username", str);
        intent.putExtra("intent_extra_bind_ward_username", str2);
        intent.putExtra("intent_extra_bind_ticket", str3);
        intent.putExtra("intent_extra_request_time", j);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToBindGuardianUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToBindGuardianUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: e */
    public boolean mo10750e() {
        boolean nullAsFalse = Util.nullAsFalse(Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, false)));
        Log.m105919d("MicroMsg.TeenModeService", "isTeenMode:%s", Boolean.valueOf(nullAsFalse));
        return nullAsFalse;
    }

    /* renamed from: fd */
    public int mo10751fd() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, 0);
        Log.m105919d("MicroMsg.TeenModeService", "getBizAcctOption, option:%s", Integer.valueOf(j));
        return j;
    }

    /* renamed from: gg */
    public void mo10752gg() {
        Class cls = C10432i.class;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, Boolean.FALSE);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_ALREADY_SWITCH_OFF_BOOLEAN, Boolean.TRUE);
        ((C10432i) C86312j.m106911c(cls)).I40();
        ((C10432i) C86312j.m106911c(cls)).mo10757ri(4);
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 59;
        br12.f182325e = 2;
        if (this.f32106f != null) {
            C51018qv3 qv32 = new C51018qv3();
            br12.f182326f = qv32;
            qv32.mo73350k(this.f32106f.getBytes());
        }
        br12.f182327g = this.f32107g;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
    }

    /* renamed from: jE */
    public C10428a mo10753jE(int i) {
        Class<C10434j> cls = C10434j.class;
        C10428a aVar = (C10428a) ((HashMap) this.f32108h).get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        C10434j[] jVarArr = {null};
        C38166b.m41754a(cls, Integer.valueOf(i), new C10691e(this, jVarArr));
        C10434j jVar = jVarArr[0];
        if (jVar != null) {
            return jVar;
        }
        C10428a aVar2 = (C10428a) ((HashMap) this.f32108h).get(Integer.MAX_VALUE);
        if (aVar2 != null) {
            return aVar2;
        }
        C10434j[] jVarArr2 = {null};
        C38166b.m41754a(cls, Integer.MAX_VALUE, new C10692f(this, jVarArr2));
        return jVarArr2[0];
    }

    public HashMap<Integer, String> k50() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, MMApplicationContext.getString(C0966R.string.jyd));
        if (mo10736BD() != null) {
            hashMap.put(2, MMApplicationContext.getString(C0966R.string.jvv));
        }
        return hashMap;
    }

    /* renamed from: m4 */
    public void mo10755m4(Context context) {
        C76912y0.m92769h(context, context.getString(C0966R.string.jxq), C0966R.raw.icons_outlined_umbrella);
    }

    /* renamed from: rY */
    public void mo10756rY(C10439o oVar) {
        if (oVar != null) {
            ((CopyOnWriteArraySet) this.f32105e).remove(oVar);
        }
    }

    /* renamed from: ri */
    public void mo10757ri(int i) {
        C115669n.INSTANCE.mo160131h(20917, Integer.valueOf(i), Integer.valueOf(this.f32104d));
    }

    /* renamed from: sX */
    public boolean mo10758sX(Activity activity, int i, int i2, String str, String str2, String str3, String str4, byte[] bArr, C15153w0 w0Var, DialogInterface.OnDismissListener onDismissListener) {
        int i3 = i;
        if (i3 == 1) {
            return wx0(activity, 0, i2, str, onDismissListener);
        }
        if (i3 == 2) {
            return Ql0(activity, i2, str, str2, str3, str4, bArr, w0Var);
        }
        return false;
    }

    public void setScene(int i) {
        this.f32104d = i;
    }

    public void t60(Context context) {
        Class cls = C10432i.class;
        boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        ((C10432i) C86312j.m106911c(cls)).setScene(1);
        ((C10432i) C86312j.m106911c(cls)).mo10757ri(1);
        this.f32106f = null;
        this.f32107g = 1;
        if (!e) {
            Intent intent = new Intent(context, SettingsTeenModeIntro.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "enterTeenMode", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "enterTeenMode", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        new C10679m().mo9225i().mo123062e(new C10686a(this, C76879j.m92723Q(context, "", context.getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null), context));
    }

    /* renamed from: ts */
    public C10431b mo10761ts(int i) {
        C10431b bVar = this.f32109i.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        C10435k[] kVarArr = {null};
        C38166b.m41754a(C10435k.class, Integer.valueOf(i), new C10693g(this, kVarArr));
        C10435k kVar = kVarArr[0];
        return kVar != null ? kVar : C10674e.f32094d;
    }

    public boolean wx0(Activity activity, int i, int i2, String str, DialogInterface.OnDismissListener onDismissListener) {
        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            return false;
        }
        new C10679m().mo9225i().mo123062e(new C10688c(this, C76879j.m92723Q(activity, "", "", true, false, (DialogInterface.OnCancelListener) null), onDismissListener, activity, i2, str, i));
        return true;
    }

    public boolean xm0(String str) {
        C72996z1 z1Var;
        Cursor A3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69648A3(536870912, false);
        while (true) {
            if (!A3.moveToNext()) {
                z1Var = null;
                break;
            }
            z1Var = new C72996z1();
            z1Var.convertFrom(A3);
            if (z1Var.getUsername().equalsIgnoreCase(str)) {
                break;
            }
        }
        A3.close();
        return z1Var != null;
    }
}
