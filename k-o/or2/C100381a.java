package or2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.model.C43035c;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.HalfScreenAddBrandView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import ir2.C60616b;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p011cm.C28611c;
import p214om.C11502f;
import p239sv.C48464g;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import qs2.C101271i0;
import qs2.C89839x;
import up2.C102064e;
import vr2.C102245g;
import vr2.C102260r;
import zt3.C119157j;

/* renamed from: or2.a */
public class C100381a {

    /* renamed from: a */
    public C102064e.C102068b f294018a;

    /* renamed from: b */
    public AdClickActionInfo f294019b;

    /* renamed from: c */
    public Context f294020c;

    /* renamed from: d */
    public C77407n f294021d;

    /* renamed from: e */
    public int f294022e;

    /* renamed from: f */
    public C72996z1 f294023f;

    /* renamed from: g */
    public C44668u3 f294024g;

    /* renamed from: h */
    public C89779i0 f294025h;

    /* renamed from: i */
    public C102245g f294026i;

    /* renamed from: j */
    public boolean f294027j;

    /* renamed from: k */
    public String f294028k;

    /* renamed from: l */
    public String f294029l;

    /* renamed from: m */
    public String f294030m;

    /* renamed from: or2.a$a */
    public class C100382a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ int f294031a;

        /* renamed from: or2.a$a$a */
        public class C100383a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f294033d;

            /* renamed from: e */
            public final /* synthetic */ String f294034e;

            /* renamed from: f */
            public final /* synthetic */ int f294035f;

            /* renamed from: g */
            public final /* synthetic */ String f294036g;

            public C100383a(int i, String str, int i2, String str2) {
                this.f294033d = i;
                this.f294034e = str;
                this.f294035f = i2;
                this.f294036g = str2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1$1");
                C100381a aVar = C100381a.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                C89779i0 i0Var = aVar.f294025h;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                if (i0Var != null) {
                    C100381a aVar2 = C100381a.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                    C89779i0 i0Var2 = aVar2.f294025h;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                    i0Var2.dismiss();
                    C100381a aVar3 = C100381a.this;
                    SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                    aVar3.f294025h = null;
                    SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                }
                Log.m105925i("HalfScreenAddBrandController", "catch add Contact errCode: %d && errMsg: %s", Integer.valueOf(this.f294033d), this.f294034e);
                C100381a aVar4 = C100381a.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                Context context = aVar4.f294020c;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                C100381a.m131290a(aVar4, context, this.f294035f, this.f294033d, this.f294034e, C100382a.this.f294031a, this.f294036g);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1$1");
            }
        }

        public C100382a(int i) {
            this.f294031a = i;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
            if (!(obj instanceof String)) {
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
                return;
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (Throwable th) {
                Log.m105920e("HalfScreenAddBrandController", th.toString());
            }
            if (jSONObject != null) {
                C100381a aVar = C100381a.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                Context context = aVar.f294020c;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                if (context != null) {
                    MMHandlerThread.postToMainThread(new C100383a(i2, jSONObject.optString("errMsg"), i, jSONObject.optString("respUsername")));
                    SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        }
    }

    /* renamed from: or2.a$b */
    public class C100384b implements C11385n {

        /* renamed from: d */
        public Context f294038d;

        /* renamed from: e */
        public int f294039e;

        /* renamed from: f */
        public C89779i0 f294040f;

        /* renamed from: or2.a$b$a */
        public class C100385a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f294042d;

            /* renamed from: e */
            public final /* synthetic */ int f294043e;

            /* renamed from: f */
            public final /* synthetic */ C117747y f294044f;

            /* renamed from: g */
            public final /* synthetic */ String f294045g;

            public C100385a(int i, int i2, C117747y yVar, String str) {
                this.f294042d = i;
                this.f294043e = i2;
                this.f294044f = yVar;
                this.f294045g = str;
            }

            public void run() {
                String str;
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
                C100384b bVar = C100384b.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                C89779i0 i0Var = bVar.f294040f;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                if (i0Var != null) {
                    C100384b bVar2 = C100384b.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    C89779i0 i0Var2 = bVar2.f294040f;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    i0Var2.dismiss();
                    C100384b bVar3 = C100384b.this;
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    bVar3.f294040f = null;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                }
                if (this.f294042d == 0 && this.f294043e == 0) {
                    if (this.f294044f.getType() == 30) {
                        str = ((C28611c) this.f294044f).mo56091T0();
                    } else if (this.f294044f.getType() == 667) {
                        str = ((C48464g) this.f294044f).mo71849i();
                    }
                    String str2 = str;
                    C100384b bVar4 = C100384b.this;
                    C100381a aVar = C100381a.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    Context context = bVar4.f294038d;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    int i = this.f294042d;
                    int i2 = this.f294043e;
                    String str3 = this.f294045g;
                    C100384b bVar5 = C100384b.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    int i3 = bVar5.f294039e;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    C100381a.m131290a(aVar, context, i, i2, str3, i3, str2);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
                }
                str = "";
                String str22 = str;
                C100384b bVar42 = C100384b.this;
                C100381a aVar2 = C100381a.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                Context context2 = bVar42.f294038d;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                int i4 = this.f294042d;
                int i25 = this.f294043e;
                String str32 = this.f294045g;
                C100384b bVar52 = C100384b.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                int i35 = bVar52.f294039e;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                C100381a.m131290a(aVar2, context2, i4, i25, str32, i35, str22);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
            }
        }

        public C100384b(Context context, int i, C89779i0 i0Var, C100382a aVar) {
            this.f294038d = context;
            this.f294039e = i;
            this.f294040f = i0Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
            if ((yVar instanceof C48464g) || (yVar instanceof C28611c)) {
                if (yVar.getType() != 30 && yVar.getType() != 667) {
                    Log.m105928w("HalfScreenAddBrandController", "not expected scene,  type = " + yVar.getType());
                    SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    return;
                } else if (!(yVar instanceof C28611c) || ((C28611c) yVar).mo56095v0() == 1) {
                    C43035c.m46670b(this);
                    Log.m105925i("HalfScreenAddBrandController", "catch add Contact errCode: %d && errMsg: %s", Integer.valueOf(i2), str);
                    MMHandlerThread.postToMainThread(new C100385a(i, i2, yVar, str));
                } else {
                    Log.m105920e("HalfScreenAddBrandController", "not opcode addcontact!");
                    SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        }
    }

    /* renamed from: a */
    public static void m131290a(C100381a aVar, Context context, int i, int i2, String str, int i3, String str2) {
        AdClickActionInfo adClickActionInfo;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("deal", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (i == 0 && i2 == 0 && !Util.isNullOrNil(str2)) {
            if (i3 == 182) {
                aVar.mo139665d(true, str2);
            } else {
                SnsMethodCalculate.markStartTimeMs("updateBrandBtnTitle", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                C102064e.C102068b bVar = aVar.f294018a;
                if (bVar == null || (adClickActionInfo = aVar.f294019b) == null) {
                    SnsMethodCalculate.markEndTimeMs("updateBrandBtnTitle", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                } else {
                    ((C96177r2.C96178a) bVar).mo133812a(adClickActionInfo);
                    SnsMethodCalculate.markEndTimeMs("updateBrandBtnTitle", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                }
            }
            SnsMethodCalculate.markStartTimeMs("processUpdateContact", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            if (MMApplicationContext.isMainProcess()) {
                Log.m105924i("HalfScreenAddBrandController", "updateContact, main, respUsername = " + str2);
                SnsMethodCalculate.markStartTimeMs("updateContact", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                C72996z1 z1Var = aVar.f294023f;
                if (!(z1Var == null || aVar.f294024g == null)) {
                    z1Var.mo62868O3();
                    aVar.f294023f.setUsername(str2);
                    ((C119157j) C119157j.f356862d).mo183875f(new C77034b(aVar));
                }
                SnsMethodCalculate.markEndTimeMs("updateContact", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            } else if (MMApplicationContext.isToolsProcess()) {
                AdLandingPagesProxy.getInstance().updateContact(str2);
                Log.m105924i("HalfScreenAddBrandController", "updateContact, tools, respUsername = " + str2);
            } else {
                Log.m105920e("HalfScreenAddBrandController", "updateContact, process err");
            }
            SnsMethodCalculate.markEndTimeMs("processUpdateContact", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            aVar.mo139664c(i3, 1, str2);
        } else if (i2 == -44) {
            aVar.mo139665d(false, str2);
            aVar.mo139664c(i3, 2, str2);
        } else if (i2 == -87) {
            C76879j.m92748s(context, context.getString(C0966R.string.bkh), "");
            aVar.mo139664c(i3, 2, str2);
        } else if (i2 == -101) {
            aVar.mo139665d(false, str2);
            aVar.mo139664c(i3, 2, str2);
        } else if (i2 == -2) {
            if (!Util.isNullOrNil(str)) {
                C76879j.m92754y(context, str, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
            } else {
                aVar.mo139665d(false, str2);
            }
            aVar.mo139664c(i3, 2, str2);
        } else if (i2 == -160) {
            aVar.mo139665d(false, str2);
            aVar.mo139664c(i3, 2, str2);
        } else {
            aVar.mo139665d(false, str2);
            aVar.mo139664c(i3, 2, str2);
        }
        SnsMethodCalculate.markEndTimeMs("deal", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: b */
    public static /* synthetic */ C72996z1 m131291b(C100381a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        C72996z1 z1Var = aVar.f294023f;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        return z1Var;
    }

    /* renamed from: f */
    public static void m131292f(Context context, SnsInfo snsInfo, SnsAdClick snsAdClick, int i, AdClickActionInfo adClickActionInfo) {
        SnsMethodCalculate.markStartTimeMs("jumpBrandUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (context == null || snsInfo == null || adClickActionInfo == null || Util.isNullOrNil(adClickActionInfo.f273679y)) {
            SnsMethodCalculate.markEndTimeMs("jumpBrandUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", adClickActionInfo.f273679y);
        intent.putExtra("KSnsAdTag", snsAdClick);
        intent.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i == 0 ? 6 : 1);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
        SnsMethodCalculate.markEndTimeMs("jumpBrandUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: c */
    public void mo139664c(int i, int i2, String str) {
        SnsMethodCalculate.markStartTimeMs("addBrandReport", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        int i3 = i == 0 ? 1 : i == 182 ? 3 : 2;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("enterType", i3);
            jSONObject2.put("result", i2);
            jSONObject2.put("brandUsername", Util.nullAsNil(str));
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", this.f294028k);
            jSONObject.put("snsid", this.f294030m);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            jSONObject.put("adExtInfo", this.f294029l);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_ad_half_screen_quickly_add_brand_result", jSONObject3);
            Log.m105924i("HalfScreenAddBrandController", "addBrandReport timeline_ad_half_screen_quickly_add_brand_result, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("HalfScreenAddBrandController", "addBrandReport exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("addBrandReport", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: d */
    public final void mo139665d(boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (this.f294020c == null) {
            Log.m105924i("HalfScreenAddBrandController", "context is null");
            SnsMethodCalculate.markEndTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            return;
        }
        if (!z || Util.isNullOrNil(str)) {
            Context context = this.f294020c;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f7409fh), 1).show();
        } else {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("key_has_add_contact", true);
            intent.putExtra("finish_direct", true);
            intent.setClassName(this.f294020c, "com.tencent.mm.ui.chatting.ChattingUI");
            Context context2 = this.f294020c;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/controller/HalfScreenAddBrandController", "dealRet", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/sns/controller/HalfScreenAddBrandController", "dealRet", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        SnsMethodCalculate.markEndTimeMs("dealRet", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: e */
    public final void mo139666e() {
        SnsMethodCalculate.markStartTimeMs("halfScreenViewShow", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        this.f294021d = new C77407n(this.f294020c, true, 0);
        HalfScreenAddBrandView halfScreenAddBrandView = new HalfScreenAddBrandView(this.f294020c, (AttributeSet) null);
        C102245g gVar = this.f294026i;
        int i = this.f294022e;
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        halfScreenAddBrandView.f281272e = gVar;
        halfScreenAddBrandView.f281273f = i;
        halfScreenAddBrandView.f281280p = this;
        SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        halfScreenAddBrandView.f281277j.setText(halfScreenAddBrandView.f281272e.f301114c);
        halfScreenAddBrandView.f281278n.setText(halfScreenAddBrandView.f281272e.f301115d);
        String str = halfScreenAddBrandView.f281272e.f301113b;
        if (!TextUtils.equals((String) halfScreenAddBrandView.f281276i.getTag(C0966R.C0970id.jr4), str)) {
            halfScreenAddBrandView.f281276i.setImageDrawable((Drawable) null);
            C60616b.m70876a(C0966R.C0970id.jr4, str, halfScreenAddBrandView.f281276i);
        }
        SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        if (this.f294022e == 182 && this.f294027j) {
            SnsMethodCalculate.markStartTimeMs("updateBtnText", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
            halfScreenAddBrandView.f281279o.setText(halfScreenAddBrandView.f281272e.f301116e);
            SnsMethodCalculate.markEndTimeMs("updateBtnText", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        }
        this.f294021d.mo107569n(halfScreenAddBrandView, true);
        this.f294021d.mo107559d(true);
        this.f294021d.mo107573q();
        SnsMethodCalculate.markEndTimeMs("halfScreenViewShow", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: g */
    public void mo139667g(int i) {
        SnsMethodCalculate.markStartTimeMs("sendAddBrandFromNativeUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (this.f294027j) {
            Log.m105924i("HalfScreenAddBrandController", "sendAddBrandFromNativeUI isAddContact is true");
            mo139665d(true, this.f294026i.f301112a);
            SnsMethodCalculate.markEndTimeMs("sendAddBrandFromNativeUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            return;
        }
        Context context = this.f294020c;
        this.f294025h = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f294020c.getString(C0966R.string.bjo), true, true, (DialogInterface.OnCancelListener) null);
        AdLandingPagesProxy.getInstance().doAddBrandScene(this.f294026i.f301112a, i, new C100382a(i));
        SnsMethodCalculate.markEndTimeMs("sendAddBrandFromNativeUI", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: h */
    public void mo139668h(Context context, C89839x xVar, C101271i0 i0Var, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        this.f294020c = context;
        this.f294022e = i;
        this.f294027j = z;
        this.f294030m = i0Var.mo140741h();
        this.f294028k = i0Var.mo140745l();
        this.f294029l = i0Var.mo140734a();
        C102245g gVar = new C102245g();
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        if (xVar == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        } else {
            gVar.f301112a = Util.nullAs(xVar.f258259Z, "");
            gVar.f301113b = Util.nullAs(xVar.f258260a0, "");
            gVar.f301114c = Util.nullAs(xVar.f258261b0, "");
            gVar.f301115d = Util.nullAs(xVar.f258262c0, "");
            gVar.f301116e = Util.nullAs(xVar.f258263d0, "");
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        }
        this.f294026i = gVar;
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }

    /* renamed from: i */
    public void mo139669i(Context context, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, int i, C44668u3 u3Var, C72996z1 z1Var, C102064e.C102068b bVar) {
        SnsMethodCalculate.markStartTimeMs("showHalfScreenBrandView", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        this.f294019b = adClickActionInfo;
        this.f294020c = context;
        this.f294022e = i;
        this.f294024g = u3Var;
        this.f294023f = z1Var;
        this.f294018a = bVar;
        this.f294030m = String.valueOf(C102260r.m134863c0(snsInfo.getSnsId()));
        this.f294028k = snsInfo.getUxinfo();
        this.f294029l = snsInfo.getAdXml().adExtInfo;
        C102245g gVar = new C102245g();
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        if (adClickActionInfo == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        } else {
            gVar.f301112a = Util.nullAs(adClickActionInfo.f273679y, "");
            gVar.f301113b = Util.nullAs(adClickActionInfo.f273680z, "");
            gVar.f301114c = Util.nullAs(adClickActionInfo.f273613A, "");
            gVar.f301115d = Util.nullAs(adClickActionInfo.f273614B, "");
            gVar.f301116e = Util.nullAs(adClickActionInfo.f273615C, "");
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.data.AddBrandUIData");
        }
        this.f294026i = gVar;
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        mo139666e();
        SnsMethodCalculate.markEndTimeMs("showHalfScreenBrandView", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
    }
}
