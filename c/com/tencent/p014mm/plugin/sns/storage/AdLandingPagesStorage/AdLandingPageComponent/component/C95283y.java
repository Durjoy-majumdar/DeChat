package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import co2.C92428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.C57367x164e93ac;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import lo2.C99516a;
import org.json.JSONObject;
import qo3.C101218e0;
import qo3.C77407n;
import qo3.C89779i0;
import qs2.C101271i0;
import sq2.C101695a;
import ts2.C101925a;
import us2.C14381a;
import us2.C14382b;
import us2.C14383c;
import vr2.C102260r;
import ys2.C66696h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y */
public class C95283y extends C95108i0 {

    /* renamed from: I */
    public static HashMap<Long, Long> f276541I = new HashMap<>();

    /* renamed from: B */
    public C101925a f276542B;

    /* renamed from: C */
    public C89779i0 f276543C;

    /* renamed from: D */
    public C95284a f276544D;

    /* renamed from: E */
    public String f276545E = "0";

    /* renamed from: F */
    public String f276546F;

    /* renamed from: G */
    public String f276547G;

    /* renamed from: H */
    public String f276548H;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y$a */
    public static class C95284a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public WeakReference<Context> f276549a;

        /* renamed from: b */
        public WeakReference<C95283y> f276550b;

        /* renamed from: c */
        public long f276551c;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y$a$a */
        public class C95285a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f276552d;

            /* renamed from: e */
            public final /* synthetic */ int f276553e;

            /* renamed from: f */
            public final /* synthetic */ C95283y f276554f;

            /* renamed from: g */
            public final /* synthetic */ Object f276555g;

            public C95285a(int i, int i2, C95283y yVar, Object obj) {
                this.f276552d = i;
                this.f276553e = i2;
                this.f276554f = yVar;
                this.f276555g = obj;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback$1");
                try {
                    boolean z = this.f276552d == 0 && this.f276553e == 0;
                    this.f276554f.mo131826g0();
                    String str = "-1";
                    int i = -1;
                    if (this.f276555g instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) this.f276555g);
                        String optString = jSONObject.optString("status");
                        i = jSONObject.optInt("opType");
                        str = optString;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("onCallback, status=");
                    sb.append(str);
                    sb.append(", opType=");
                    sb.append(i);
                    sb.append(", appointmentId=");
                    C95284a aVar = C95284a.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
                    long j = aVar.f276551c;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
                    sb.append(j);
                    Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", sb.toString());
                    if (z) {
                        if (i == 0 && "1".equals(str)) {
                            C95283y.m121329c0(this.f276554f);
                        } else if (i == 1 && "0".equals(str)) {
                            C95283y.m121330d0(this.f276554f, i, true);
                        }
                        C95283y.m121331e0(this.f276554f, str);
                    } else {
                        C95283y.m121330d0(this.f276554f, i, false);
                    }
                } catch (Throwable th) {
                    Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback exp=" + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback$1");
            }
        }

        public C95284a(Context context, C95283y yVar, long j) {
            this.f276549a = new WeakReference<>(context);
            this.f276550b = new WeakReference<>(yVar);
            this.f276551c = j;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback, errType=" + i + ", errCode=" + i2 + ", data=" + obj);
            Context context = this.f276549a.get();
            C95283y yVar = this.f276550b.get();
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                Log.m105928w("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback, isFinishing return");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            } else if (yVar == null) {
                Log.m105928w("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback, btnComp == null");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new C95285a(i, i2, yVar, obj));
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            }
        }
    }

    public C95283y(Context context, C101925a aVar, ViewGroup viewGroup) {
        super(context, aVar, viewGroup);
        this.f276542B = aVar;
        if (aVar.f300101Z != null) {
            C66696h.C66697a aVar2 = this.f276010t;
            aVar2.mo90729c("appointmentId", aVar.f300101Z.f264476a + "");
        } else {
            Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "appointmentInfo==null");
            this.f276010t.mo90729c("appointmentId", "");
        }
        C101925a aVar3 = this.f276542B;
        this.f276546F = aVar3.f296695G;
        this.f276547G = aVar3.f296691C;
        this.f276548H = aVar3.f296696H;
        this.f276544D = new C95284a(context, this, aVar3.f300101Z.f264476a);
    }

    /* renamed from: b0 */
    public static void m121328b0(C95283y yVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        yVar.getClass();
        SnsMethodCalculate.markStartTimeMs("doCancelReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            JSONObject jSONObject = new JSONObject();
            C101271i0 m = yVar.mo131854m();
            jSONObject.put("snsid", m.mo140740g());
            jSONObject.put("uxinfo", m.mo140745l());
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, m.mo140742i());
            JSONObject jSONObject2 = new JSONObject();
            C92428a aVar = yVar.f276542B.f300101Z;
            jSONObject2.put("appointmentId", aVar == null ? 0 : aVar.f264476a);
            jSONObject.put("extInfo", jSONObject2);
            C102260r.m134858a("canvas_ad_appointment_cancel_action", jSONObject.toString());
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "doCancelReport, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doCancelReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: c0 */
    public static void m121329c0(C95283y yVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        yVar.getClass();
        SnsMethodCalculate.markStartTimeMs("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        if (yVar.f276542B.f300101Z == null) {
            SnsMethodCalculate.markEndTimeMs("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        } else {
            try {
                C101271i0 m = yVar.mo131854m();
                new C101695a(yVar.f276579d, 2).mo141151g(m.mo140740g(), Util.nullAsNil(m.mo140745l()), yVar.f276542B.f300101Z, yVar.f276545E);
            } catch (Throwable th) {
                Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "showSuccHalfDialog exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m121330d0(com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95283y r5, int r6, boolean r7) {
        /*
            java.lang.String r0 = "access$500"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r5.getClass()
            java.lang.String r2 = "showResultToast"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            ts2.a r3 = r5.f276542B
            co2.a r3 = r3.f300101Z
            if (r3 != 0) goto L_0x001a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0061
        L_0x001a:
            if (r6 != 0) goto L_0x0021
            if (r7 != 0) goto L_0x002c
            java.lang.String r6 = r3.f264486k
            goto L_0x002e
        L_0x0021:
            r4 = 1
            if (r6 != r4) goto L_0x002c
            if (r7 == 0) goto L_0x0029
            java.lang.String r6 = r3.f264487l
            goto L_0x002e
        L_0x0029:
            java.lang.String r6 = r3.f264488m
            goto L_0x002e
        L_0x002c:
            java.lang.String r6 = ""
        L_0x002e:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x005e
            if (r7 == 0) goto L_0x003c
            android.content.Context r5 = r5.f276579d     // Catch:{ all -> 0x0042 }
            nj3.C76912y0.m92768g(r5, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x005e
        L_0x003c:
            android.content.Context r5 = r5.f276579d     // Catch:{ all -> 0x0042 }
            nj3.C76912y0.m92767f(r5, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x005e
        L_0x0042:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "showResultToast, exp="
            r6.append(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ADAppointment.AdLandingPageAppointmentBtnComp"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
        L_0x005e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x0061:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95283y.m121330d0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y, int, boolean):void");
    }

    /* renamed from: e0 */
    public static void m121331e0(C95283y yVar, String str) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        yVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        if (yVar.f276542B.f300101Z == null) {
            SnsMethodCalculate.markEndTimeMs("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        } else {
            Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", "onStatusChange, old=" + yVar.f276545E + ", new=" + str);
            yVar.f276545E = str;
            yVar.mo131830n0();
            AdLandingPagesProxy.getInstance().setAdValue(yVar.mo131854m().mo140740g(), C99516a.m129867d(yVar.f276542B.f300101Z.f264476a), str);
            SnsMethodCalculate.markEndTimeMs("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: P */
    public void mo130182P() {
        String str;
        String str2;
        String str3;
        C95283y yVar;
        View view;
        View view2;
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        if (this.f276542B.f300101Z == null) {
            SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", "onBtnClick, status=" + this.f276545E);
        if ("0".equals(this.f276545E)) {
            C101271i0 m = mo131854m();
            C92428a aVar = this.f276542B.f300101Z;
            boolean z = aVar.f264491p == 1 && !Util.isNullOrNil(aVar.f264493r) && !Util.isNullOrNil(this.f276542B.f300101Z.f264492q);
            String phoneNumber = z ? AdLandingPagesProxy.getInstance().getPhoneNumber() : "";
            if (z && !Util.isNullOrNil(phoneNumber)) {
                Context context = this.f276579d;
                if (context instanceof MMActivity) {
                    MMActivity mMActivity = (MMActivity) context;
                    SnsMethodCalculate.markStartTimeMs("requestPhoneNumberInHfScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
                    C92428a aVar2 = this.f276542B.f300101Z;
                    String str4 = aVar2.f264492q;
                    String str5 = aVar2.f264493r;
                    C95242v vVar = new C95242v(this, m, phoneNumber);
                    SnsMethodCalculate.markStartTimeMs("showRequestPhoneNumDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper");
                    C87412m.m108594g(mMActivity, "context");
                    C101218e0 e0Var = new C101218e0(mMActivity, 0, 0, false);
                    str = "onBtnClick";
                    e0Var.f296384g.setBackgroundColor(mMActivity.getResources().getColor(C0966R.color.al6));
                    View inflate = View.inflate(mMActivity, C0966R.C0971layout.c0t, (ViewGroup) null);
                    ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f359083iq3);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.iq5);
                    str3 = "opType";
                    TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.hvf);
                    View findViewById = inflate.findViewById(C0966R.C0970id.hvg);
                    String str6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp";
                    View findViewById2 = inflate.findViewById(C0966R.C0970id.aoi);
                    String str7 = "requestPhoneNumberInHfScreen";
                    View findViewById3 = inflate.findViewById(C0966R.C0970id.aoj);
                    String str8 = "showRequestPhoneNumDialog";
                    View findViewById4 = inflate.findViewById(C0966R.C0970id.ipy);
                    String str9 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper";
                    View findViewById5 = inflate.findViewById(C0966R.C0970id.iq6);
                    View view3 = inflate;
                    if (TextUtils.isEmpty(phoneNumber)) {
                        view2 = findViewById5;
                        textView2.setVisibility(0);
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view4 = findViewById;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view = findViewById4;
                        findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view5 = findViewById2;
                        C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(0);
                        View view6 = findViewById3;
                        C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView2.setTextColor(mMActivity.getResources().getColor(C0966R.color.f3563xt));
                        textView2.setText(mMActivity.getText(C0966R.string.ja4));
                    } else {
                        view = findViewById4;
                        view2 = findViewById5;
                        textView2.setVisibility(0);
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar6.mo10233c(0);
                        View view7 = findViewById;
                        C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(0);
                        View view8 = findViewById2;
                        C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar8 = new C9556a();
                        aVar8.mo10233c(8);
                        View view9 = findViewById3;
                        C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper", "showRequestPhoneNumDialog", "(Lcom/tencent/mm/ui/MMActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView2.setText(phoneNumber);
                    }
                    textView.setText(Util.nullAsNil(str4));
                    if (!TextUtils.isEmpty(str5)) {
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59347c = true;
                        bVar.f59359o = C0966R.raw.default_avatar_round;
                        bVar.f59364t = true;
                        C20828a.m22825b().mo32519h(str5, imageView, bVar.mo32666a());
                    }
                    view.setOnClickListener(new C14381a(e0Var, vVar));
                    view2.setOnClickListener(new C14382b(e0Var, phoneNumber, vVar));
                    findViewById3.setOnClickListener(new C14383c(e0Var, vVar));
                    e0Var.mo140663j(view3);
                    e0Var.mo140655A();
                    mMActivity.getLifecycle().addObserver(new C57367x164e93ac(e0Var, mMActivity));
                    SnsMethodCalculate.markEndTimeMs(str8, str9);
                    str2 = str6;
                    SnsMethodCalculate.markEndTimeMs(str7, str2);
                    yVar = this;
                    yVar.f276010t.mo90728b(str3, 0);
                }
            }
            str = "onBtnClick";
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp";
            str3 = "opType";
            yVar = this;
            yVar.mo131827h0(m.mo140745l(), yVar.f276542B.f300101Z.f264476a, 0);
            yVar.f276010t.mo90728b(str3, 0);
        } else {
            str = "onBtnClick";
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp";
            String str10 = "opType";
            if ("1".equals(this.f276545E)) {
                SnsMethodCalculate.markStartTimeMs("showCancelSheet", str2);
                if (this.f276542B.f300101Z == null) {
                    SnsMethodCalculate.markEndTimeMs("showCancelSheet", str2);
                } else {
                    C77407n nVar = new C77407n(this.f276579d, 1, false);
                    nVar.f225771i = new C95246w(this);
                    nVar.f225779n1 = true;
                    nVar.f225782p = new C95281x(this);
                    nVar.mo107573q();
                    SnsMethodCalculate.markEndTimeMs("showCancelSheet", str2);
                }
                this.f276010t.mo90728b(str10, 1);
            }
        }
        mo131613G();
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        super.mo67240g();
        C92428a aVar = this.f276542B.f300101Z;
        if (aVar == null) {
            Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "fillItem,appointmentInfo==null");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        long j = aVar.f264476a;
        C101271i0 m = mo131854m();
        String g = m.mo140740g();
        C99516a.m129867d(j);
        String c = C99516a.m129866c(g, this.f276542B.f300101Z);
        Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", "fillItem, snsId=" + g + ", cacheStatus=" + c);
        this.f276545E = c;
        mo131830n0();
        if (!"1000".equals(this.f276545E)) {
            long longValue = f276541I.containsKey(Long.valueOf(j)) ? f276541I.get(Long.valueOf(j)).longValue() : 0;
            if (longValue == 0 || System.currentTimeMillis() - longValue > 30000) {
                mo131827h0(m.mo140745l(), j, 2);
                f276541I.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: g0 */
    public void mo131826g0() {
        SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            C89779i0 i0Var = this.f276543C;
            if (i0Var != null && i0Var.isShowing()) {
                this.f276543C.dismiss();
            }
            Context context = this.f276579d;
            if (context instanceof SnsAdNativeLandingPagesUI) {
                C95198o2.m121133e((SnsAdNativeLandingPagesUI) context);
            }
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "showLoading exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: h0 */
    public final void mo131827h0(String str, long j, int i) {
        SnsMethodCalculate.markStartTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        mo131828i0(str, j, i, "");
        SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: i0 */
    public final void mo131828i0(String str, long j, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", "sendAppointmentReq, opType=" + i + ", id=" + j + ", uxInfo=" + str);
        if (TextUtils.isEmpty(str) || j == 0) {
            SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        if (i == 0) {
            mo131829k0();
        } else if (i == 1) {
            mo131829k0();
        }
        AdLandingPagesProxy.getInstance().sendAppointmentReq(str, j, i, str2, this.f276544D);
        SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: k0 */
    public void mo131829k0() {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            String string = this.f276579d.getString(C0966R.string.a4d);
            if (this.f276543C == null) {
                this.f276543C = C89779i0.m112246c(this.f276579d, string, true, 0, (DialogInterface.OnCancelListener) null);
            }
            if (!this.f276543C.isShowing()) {
                this.f276543C.show();
            }
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "showLoading exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* renamed from: n0 */
    public void mo131830n0() {
        Button button;
        SnsMethodCalculate.markStartTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        if (this.f276542B.f300101Z == null) {
            SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        Log.m105924i("ADAppointment.AdLandingPageAppointmentBtnComp", "updateBtnUI, status=" + this.f276545E);
        Button button2 = this.f276027v;
        if (button2 != null) {
            button2.setEnabled(true);
        }
        if ("0".equals(this.f276545E)) {
            C101925a aVar = this.f276542B;
            aVar.f296695G = this.f276546F;
            aVar.f296691C = this.f276547G;
            aVar.f296696H = this.f276548H;
        } else {
            int safeParseDouble = (int) (Util.safeParseDouble("0.6") * 255.0d);
            if (!TextUtils.isEmpty(this.f276546F)) {
                mo131626O().f296695G = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), this.f276546F.substring(1)});
            }
            if (!TextUtils.isEmpty(this.f276547G)) {
                mo131626O().f296691C = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), this.f276547G.substring(1)});
            }
            if (!TextUtils.isEmpty(this.f276548H)) {
                mo131626O().f296696H = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), this.f276548H.substring(1)});
            }
            if ("1000".equals(this.f276545E) && (button = this.f276027v) != null) {
                button.setEnabled(false);
            }
        }
        mo131629U();
        if ("1".equals(this.f276545E)) {
            this.f276027v.setText(this.f276542B.f300101Z.f264484i);
        } else if ("1000".equals(this.f276545E)) {
            this.f276027v.setText(this.f276542B.f300101Z.f264490o);
        }
        SnsMethodCalculate.markEndTimeMs("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }
}
