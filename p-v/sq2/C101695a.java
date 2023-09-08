package sq2;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import co2.C92428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import lo2.C99516a;
import lp2.C46884e;
import nj3.C76912y0;
import org.json.JSONObject;
import qo3.C77407n;
import qo3.C89779i0;
import rq2.C101419f;
import rq2.C63489a;
import up2.C102064e;
import vr2.C102260r;

/* renamed from: sq2.a */
public class C101695a implements View.OnClickListener {

    /* renamed from: d */
    public Context f297735d;

    /* renamed from: e */
    public C77407n f297736e;

    /* renamed from: f */
    public C89779i0 f297737f;

    /* renamed from: g */
    public View f297738g;

    /* renamed from: h */
    public ImageView f297739h;

    /* renamed from: i */
    public TextView f297740i;

    /* renamed from: j */
    public TextView f297741j;

    /* renamed from: n */
    public TextView f297742n;

    /* renamed from: o */
    public TextView f297743o;

    /* renamed from: p */
    public Button f297744p;

    /* renamed from: q */
    public String f297745q;

    /* renamed from: r */
    public String f297746r;

    /* renamed from: s */
    public String f297747s;

    /* renamed from: t */
    public C92428a f297748t;

    /* renamed from: u */
    public int f297749u;

    /* renamed from: v */
    public C102064e.C102068b f297750v;

    /* renamed from: w */
    public AdClickActionInfo f297751w;

    /* renamed from: sq2.a$a */
    public class C101696a implements C99516a.C99517a {
        public C101696a() {
        }

        /* renamed from: a */
        public void mo133816a(long j, int i, boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget$1");
            C101695a.m133588a(C101695a.this);
            if (!z) {
                C101695a aVar = C101695a.this;
                C101695a.m133590c(aVar, C101695a.m133589b(aVar).f264486k, false);
            } else {
                if (C101695a.m133591d(C101695a.this) != null) {
                    C102064e.C102068b d = C101695a.m133591d(C101695a.this);
                    C101695a aVar2 = C101695a.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
                    AdClickActionInfo adClickActionInfo = aVar2.f297751w;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
                    ((C96177r2.C96178a) d).mo133812a(adClickActionInfo);
                }
                C101695a aVar3 = C101695a.this;
                C101695a.m133590c(aVar3, C101695a.m133589b(aVar3).f264485j, true);
            }
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget$1");
        }
    }

    /* renamed from: sq2.a$b */
    public class C101697b implements C99516a.C99517a {
        public C101697b() {
        }

        /* renamed from: a */
        public void mo133816a(long j, int i, boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget$2");
            C101695a.m133588a(C101695a.this);
            if (!z) {
                C101695a aVar = C101695a.this;
                C101695a.m133590c(aVar, C101695a.m133589b(aVar).f264488m, false);
            } else {
                if (C101695a.m133591d(C101695a.this) != null) {
                    C102064e.C102068b d = C101695a.m133591d(C101695a.this);
                    C101695a aVar2 = C101695a.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
                    AdClickActionInfo adClickActionInfo = aVar2.f297751w;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
                    ((C96177r2.C96178a) d).mo133812a(adClickActionInfo);
                }
                C101695a aVar3 = C101695a.this;
                C101695a.m133590c(aVar3, C101695a.m133589b(aVar3).f264487l, true);
            }
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget$2");
        }
    }

    public C101695a(Context context, int i) {
        this.f297735d = context;
        this.f297749u = i;
    }

    /* renamed from: a */
    public static void m133588a(C101695a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        C89779i0 i0Var = aVar.f297737f;
        if (i0Var != null && i0Var.isShowing()) {
            aVar.f297737f.dismiss();
            Log.m105924i("ADAppointment.ADAppointmentHalfScreenWidget", "hideProgressDlg");
        }
        SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    /* renamed from: b */
    public static /* synthetic */ C92428a m133589b(C101695a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        C92428a aVar2 = aVar.f297748t;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        return aVar2;
    }

    /* renamed from: c */
    public static void m133590c(C101695a aVar, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("showToast", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    C76912y0.m92768g(aVar.f297735d, str);
                } catch (Throwable th) {
                    Log.m105920e("ADAppointment.ADAppointmentHalfScreenWidget", "showToast, exp=" + th.toString());
                }
            } else {
                C76912y0.m92767f(aVar.f297735d, str);
            }
        }
        SnsMethodCalculate.markEndTimeMs("showToast", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    /* renamed from: d */
    public static /* synthetic */ C102064e.C102068b m133591d(C101695a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        C102064e.C102068b bVar = aVar.f297750v;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        return bVar;
    }

    /* renamed from: e */
    public final void mo141149e(int i) {
        SnsMethodCalculate.markStartTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", this.f297747s);
            jSONObject.put("uxinfo", this.f297746r);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f297749u == 0 ? 1 : 2);
            JSONObject jSONObject2 = new JSONObject();
            C92428a aVar = this.f297748t;
            jSONObject2.put("appointmentId", aVar == null ? 0 : aVar.f264476a);
            jSONObject2.put("opType", i);
            jSONObject.put("extInfo", jSONObject2);
            C102260r.m134858a("timeline_ad_appointment_submit_action", jSONObject.toString());
        } catch (Throwable th) {
            Log.m105920e("ADAppointment.ADAppointmentHalfScreenWidget", "doCancelReport, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    /* renamed from: f */
    public final void mo141150f() {
        SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        C77407n nVar = this.f297736e;
        if (nVar != null && nVar.mo107563h()) {
            this.f297736e.mo107572p();
        }
        SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    /* renamed from: g */
    public void mo141151g(String str, String str2, C92428a aVar, String str3) {
        SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        if (TextUtils.isEmpty(str2) || aVar == null) {
            Log.m105920e("ADAppointment.ADAppointmentHalfScreenWidget", "showBottomSheet err, uxinfo=" + str2 + ", info=" + aVar);
            SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            return;
        }
        Log.m105924i("ADAppointment.ADAppointmentHalfScreenWidget", "showBottomSheet, status=" + str3 + ", appointmentId=" + aVar.f264476a + ", uxInfo=" + str2);
        this.f297746r = str2;
        this.f297747s = str;
        this.f297748t = aVar;
        this.f297745q = str3;
        if (this.f297736e == null) {
            SnsMethodCalculate.markStartTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            View inflate = LayoutInflater.from(this.f297735d).inflate(C0966R.C0971layout.f6336c2, (ViewGroup) null);
            this.f297738g = inflate;
            this.f297739h = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            this.f297740i = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            this.f297741j = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            this.f297742n = (TextView) inflate.findViewById(C0966R.C0970id.bsk);
            this.f297743o = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            inflate.findViewById(C0966R.C0970id.bem).setOnClickListener(this);
            Button button = (Button) inflate.findViewById(C0966R.C0970id.f357579al0);
            this.f297744p = button;
            button.setOnClickListener(this);
            SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            this.f297740i.setText(this.f297748t.f264477b);
            this.f297741j.setText(this.f297748t.f264479d);
            this.f297742n.setText(this.f297748t.f264480e);
            this.f297743o.setText(this.f297748t.f264481f);
            int i = this.f297749u;
            if (i != 0 && i != 1) {
                this.f297744p.setText(this.f297748t.f264482g);
            } else if ("0".equals(this.f297745q)) {
                this.f297744p.setText(this.f297748t.f264482g);
                this.f297744p.setEnabled(true);
            } else if ("1".equals(this.f297745q)) {
                this.f297744p.setText(this.f297748t.f264483h);
                this.f297744p.setEnabled(true);
                this.f297744p.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                this.f297744p.setTextColor(this.f297735d.getResources().getColor(C0966R.color.al7));
            } else if ("1000".equals(this.f297745q)) {
                this.f297744p.setText(this.f297748t.f264490o);
                this.f297744p.setEnabled(false);
            }
            if (MMApplicationContext.isMainProcess()) {
                C63489a.m74826a(this.f297748t.f264478c, this.f297739h);
            } else {
                C101419f.m133080c(this.f297748t.f264478c, this.f297739h);
            }
            SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
            C77407n nVar = new C77407n(this.f297735d, true, 0);
            this.f297736e = nVar;
            nVar.mo107569n(this.f297738g, true);
            C77407n nVar2 = this.f297736e;
            nVar2.f225776l1 = true;
            nVar2.mo107559d(true);
            if (this.f297749u == 2) {
                this.f297736e.f225779n1 = true;
            }
            SnsMethodCalculate.markEndTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        }
        if (!this.f297736e.mo107563h()) {
            this.f297736e.mo107573q();
        }
        SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    /* renamed from: h */
    public final void mo141152h() {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        String string = this.f297735d.getString(C0966R.string.a4d);
        if (this.f297737f == null) {
            this.f297737f = C89779i0.m112246c(this.f297735d, string, true, 0, (DialogInterface.OnCancelListener) null);
        }
        if (!this.f297737f.isShowing()) {
            this.f297737f.show();
        }
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/widget/ADAppointmentHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        int id = view.getId();
        if (id == C0966R.C0970id.bem) {
            mo141150f();
        } else if (id == C0966R.C0970id.f357579al0) {
            int i = this.f297749u;
            if (i == 0 || i == 1) {
                mo141150f();
                if ("0".equals(this.f297745q)) {
                    mo141152h();
                    String str = this.f297747s;
                    String str2 = this.f297746r;
                    long j = this.f297748t.f264476a;
                    C101696a aVar = new C101696a();
                    HashMap<Long, Long> hashMap = C99516a.f291746a;
                    SnsMethodCalculate.markStartTimeMs("doAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    Log.m105924i("ADAppointment.AdAppointmentHelper", "doAppointment, id=" + j + ", snsId=" + str + ", uxInfo=" + str2);
                    C46884e eVar = new C46884e(str2, j, 0);
                    C86709a0.m107524d().mo123455a(5159, new C99516a.C99518b(str, j, 0, aVar));
                    C86709a0.m107524d().mo123460f(eVar);
                    SnsMethodCalculate.markEndTimeMs("doAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    mo141149e(0);
                } else {
                    mo141152h();
                    String str3 = this.f297747s;
                    String str4 = this.f297746r;
                    long j2 = this.f297748t.f264476a;
                    C101697b bVar = new C101697b();
                    HashMap<Long, Long> hashMap2 = C99516a.f291746a;
                    SnsMethodCalculate.markStartTimeMs("cancelAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    Log.m105924i("ADAppointment.AdAppointmentHelper", "cancelAppointment, id=" + j2 + ", snsId=" + str3 + ", uxInfo=" + str4);
                    C46884e eVar2 = new C46884e(str4, j2, 1);
                    C86709a0.m107524d().mo123455a(5159, new C99516a.C99518b(str3, j2, 1, bVar));
                    C86709a0.m107524d().mo123460f(eVar2);
                    SnsMethodCalculate.markEndTimeMs("cancelAppointment", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                    mo141149e(1);
                }
            } else {
                mo141150f();
            }
        }
        try {
            Context context = this.f297735d;
            if (context instanceof SnsAdNativeLandingPagesUI) {
                C95198o2.m121133e((SnsAdNativeLandingPagesUI) context);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.ADAppointmentHalfScreenWidget");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/widget/ADAppointmentHalfScreenWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
