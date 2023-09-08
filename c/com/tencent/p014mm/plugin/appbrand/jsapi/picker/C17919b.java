package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import android.widget.NumberPicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.picker.base.view.WheelView;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandDatePicker;
import com.tencent.p014mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.util.WXWebReporter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import of0.C21794b;
import org.json.JSONObject;
import p385u2.C111105a;
import pf0.C21966a;
import rf0.C22230d;
import vt0.C22778a;
import vt0.C22781c;
import vt0.C22782d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.b */
public final class C17919b extends C17926h {

    /* renamed from: n */
    public volatile C17922c f49424n;

    /* renamed from: o */
    public volatile Long f49425o = null;

    /* renamed from: p */
    public volatile Long f49426p = null;

    /* renamed from: q */
    public volatile int f49427q = -1;

    /* renamed from: r */
    public volatile int f49428r = -1;

    /* renamed from: s */
    public volatile int f49429s = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.b$a */
    public class C17920a implements Runnable {
        public C17920a() {
        }

        public void run() {
            C17919b bVar = C17919b.this;
            bVar.getClass();
            AppBrandDatePicker appBrandDatePicker = (AppBrandDatePicker) bVar.mo35917b(AppBrandDatePicker.class);
            if (appBrandDatePicker == null) {
                bVar.mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            C22778a aVar = bVar.f65507d;
            aVar.setOnResultListener(new C17924d(bVar));
            if (bVar.f49425o != null) {
                appBrandDatePicker.setMinDate(bVar.f49425o.longValue());
            }
            if (bVar.f49426p != null) {
                appBrandDatePicker.setMaxDate(bVar.f49426p.longValue());
            }
            appBrandDatePicker.mo22605a(bVar.f49427q, bVar.f49428r, bVar.f49429s);
            boolean z = true;
            int i = 0;
            boolean z2 = bVar.f49424n.ordinal() >= C17922c.YEAR.ordinal();
            boolean z3 = bVar.f49424n.ordinal() >= C17922c.MONTH.ordinal();
            if (bVar.f49424n.ordinal() < C17922c.DAY.ordinal()) {
                z = false;
            }
            appBrandDatePicker.f49928f = z3;
            appBrandDatePicker.f49929g = z;
            NumberPicker numberPicker = appBrandDatePicker.f49930h;
            if (numberPicker != null) {
                numberPicker.setEnabled(z2);
                appBrandDatePicker.f49930h.setVisibility(z2 ? 0 : 8);
            }
            NumberPicker numberPicker2 = appBrandDatePicker.f49931i;
            if (numberPicker2 != null) {
                numberPicker2.setEnabled(z3);
                appBrandDatePicker.f49931i.setVisibility(z3 ? 0 : 8);
            }
            NumberPicker numberPicker3 = appBrandDatePicker.f49932j;
            if (numberPicker3 != null) {
                numberPicker3.setEnabled(z);
                NumberPicker numberPicker4 = appBrandDatePicker.f49932j;
                if (!z) {
                    i = 8;
                }
                numberPicker4.setVisibility(i);
            }
            aVar.mo35911i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.b$b */
    public class C17921b implements Runnable {
        public C17921b() {
        }

        public void run() {
            C17919b bVar = C17919b.this;
            AppBrandDatePickerV2 appBrandDatePickerV2 = (AppBrandDatePickerV2) bVar.mo35917b(AppBrandDatePickerV2.class);
            if (appBrandDatePickerV2 == null) {
                bVar.mo22194c("fail cant init view", (Map<String, Object>) null);
                return;
            }
            C22778a aVar = bVar.f65507d;
            aVar.setOnResultListener(new C17923c(bVar));
            if (bVar.f49425o != null) {
                appBrandDatePickerV2.f49941g = new Date(bVar.f49425o.longValue());
            }
            if (bVar.f49426p != null) {
                appBrandDatePickerV2.f49942h = new Date(bVar.f49426p.longValue());
            }
            int i = bVar.f49427q;
            int i2 = bVar.f49428r;
            int i3 = bVar.f49429s;
            boolean z = bVar.f49424n.ordinal() >= C17922c.YEAR.ordinal();
            boolean z2 = bVar.f49424n.ordinal() >= C17922c.MONTH.ordinal();
            boolean z3 = bVar.f49424n.ordinal() >= C17922c.DAY.ordinal();
            appBrandDatePickerV2.f49946o = z3;
            appBrandDatePickerV2.f49947p = z2;
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2 - 1, i3);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(appBrandDatePickerV2.f49941g);
            Calendar instance3 = Calendar.getInstance();
            instance3.setTime(appBrandDatePickerV2.f49942h);
            C21794b bVar2 = new C21794b(appBrandDatePickerV2.f49940f, new C22782d(appBrandDatePickerV2));
            C22781c cVar = new C22781c(appBrandDatePickerV2);
            C21966a aVar2 = bVar2.f61767a;
            aVar2.f62186c = cVar;
            aVar2.f62189f = false;
            aVar2.f62190g = new boolean[]{z, z2, z3, false, false, false};
            aVar2.f62191h = instance;
            aVar2.f62192i = instance2;
            aVar2.f62193j = instance3;
            bVar2.f61767a.f62198o = appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.aja);
            bVar2.mo34202a(appBrandDatePickerV2.f49939e);
            appBrandDatePickerV2.f49939e.mo35392h((float) appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
            C22230d dVar = appBrandDatePickerV2.f49939e;
            appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.aja);
            dVar.f62981p.getClass();
            appBrandDatePickerV2.f49939e.f62981p.mo35399f(C111105a.m151500b(appBrandDatePickerV2.f49940f, C0966R.color.BW_0_Alpha_0_1));
            appBrandDatePickerV2.f49939e.mo35393i(0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            Iterator it = ((ArrayList) appBrandDatePickerV2.f49939e.mo35390f()).iterator();
            while (it.hasNext()) {
                WheelView wheelView = (WheelView) it.next();
                wheelView.mo22032e(C111105a.m151500b(appBrandDatePickerV2.f49940f, C0966R.color.BW_0_Alpha_0_9));
                wheelView.f49141d = appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
                wheelView.invalidate();
                wheelView.setBackgroundColor(C111105a.m151500b(appBrandDatePickerV2.f49940f, C0966R.color.f2932f));
            }
            ArrayList arrayList = (ArrayList) appBrandDatePickerV2.f49939e.mo35390f();
            if (arrayList.size() == 1) {
                ((WheelView) arrayList.get(0)).setPadding(0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            } else if (arrayList.size() == 2) {
                ((WheelView) arrayList.get(0)).setPadding(0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                ((WheelView) arrayList.get(1)).setPadding(appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            } else if (arrayList.size() == 3) {
                ((WheelView) arrayList.get(0)).setPadding(0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                ((WheelView) arrayList.get(1)).setPadding(appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                ((WheelView) arrayList.get(2)).setPadding(appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, appBrandDatePickerV2.f49940f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
            }
            aVar.setHeader(bVar.f49444i);
            aVar.mo35911i();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.b$c */
    public enum C17922c {
        YEAR(new SimpleDateFormat("yyyy", r2)),
        MONTH(new SimpleDateFormat("yyyy-MM", r2)),
        DAY(new SimpleDateFormat("yyyy-MM-dd", r2));
        

        /* renamed from: d */
        public final DateFormat f49436d;

        /* access modifiers changed from: public */
        C17922c(DateFormat dateFormat) {
            this.f49436d = dateFormat;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            if (r3.equals("day") == false) goto L_0x0021;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17919b.C17922c m18357a(java.lang.String r3) {
            /*
                int r0 = r3.length()
                r1 = 5
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
                int r0 = java.lang.Math.max(r1, r0)
                java.lang.String r3 = r3.substring(r1, r0)
                java.lang.String r3 = r3.toLowerCase()
                r3.getClass()
                int r0 = r3.hashCode()
                r2 = -1
                switch(r0) {
                    case 99228: goto L_0x003a;
                    case 3704893: goto L_0x002e;
                    case 104080000: goto L_0x0023;
                    default: goto L_0x0021;
                }
            L_0x0021:
                r1 = -1
                goto L_0x0043
            L_0x0023:
                java.lang.String r0 = "month"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x002c
                goto L_0x0021
            L_0x002c:
                r1 = 2
                goto L_0x0043
            L_0x002e:
                java.lang.String r0 = "year"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x0038
                goto L_0x0021
            L_0x0038:
                r1 = 1
                goto L_0x0043
            L_0x003a:
                java.lang.String r0 = "day"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x0043
                goto L_0x0021
            L_0x0043:
                switch(r1) {
                    case 0: goto L_0x004f;
                    case 1: goto L_0x004c;
                    case 2: goto L_0x0049;
                    default: goto L_0x0046;
                }
            L_0x0046:
                com.tencent.mm.plugin.appbrand.jsapi.picker.b$c r3 = MONTH
                return r3
            L_0x0049:
                com.tencent.mm.plugin.appbrand.jsapi.picker.b$c r3 = MONTH
                return r3
            L_0x004c:
                com.tencent.mm.plugin.appbrand.jsapi.picker.b$c r3 = YEAR
                return r3
            L_0x004f:
                com.tencent.mm.plugin.appbrand.jsapi.picker.b$c r3 = DAY
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17919b.C17922c.m18357a(java.lang.String):com.tencent.mm.plugin.appbrand.jsapi.picker.b$c");
        }

        /* renamed from: b */
        public Date mo22192b(String str) {
            try {
                return this.f49436d.parse(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: j */
    public static void m18353j(C17919b bVar, boolean z, String str) {
        if (bVar.f65507d != null) {
            if (!z) {
                bVar.mo22194c("fail cancel", (Map<String, Object>) null);
            }
            if (Util.isNullOrNil(str)) {
                bVar.mo22194c("fail", (Map<String, Object>) null);
            } else {
                HashMap hashMap = new HashMap(1);
                hashMap.put("value", str);
                bVar.mo22194c("ok", hashMap);
            }
            bVar.f65507d.mo35924d(true);
        }
    }

    /* renamed from: d */
    public void mo22187d(JSONObject jSONObject) {
        super.mo22187d(jSONObject);
    }

    /* renamed from: e */
    public void mo22188e(JSONObject jSONObject) {
        this.f49424n = C17922c.m18357a(jSONObject.optString("fields"));
        JSONObject optJSONObject = jSONObject.optJSONObject("range");
        if (optJSONObject != null) {
            Date b = this.f49424n.mo22192b(optJSONObject.optString(IXWebBroadcastListener.STAGE_START, ""));
            Date b2 = this.f49424n.mo22192b(optJSONObject.optString("end", ""));
            if (b != null) {
                this.f49425o = Long.valueOf(b.getTime());
            }
            if (b2 != null) {
                this.f49426p = Long.valueOf(b2.getTime());
            }
        }
        if (this.f49425o == null) {
            Calendar instance = Calendar.getInstance(LocaleUtil.sysDefaultLocale);
            instance.set(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID, 0, 1);
            this.f49425o = Long.valueOf(instance.getTimeInMillis());
        }
        if (this.f49426p == null) {
            Calendar instance2 = Calendar.getInstance(LocaleUtil.sysDefaultLocale);
            instance2.set(2100, 11, 31);
            this.f49426p = Long.valueOf(instance2.getTimeInMillis());
        }
        Date b3 = this.f49424n.mo22192b(jSONObject.optString("current", ""));
        if (b3 == null) {
            b3 = new Date(System.currentTimeMillis());
            Date date = new Date(this.f49426p.longValue());
            Date date2 = new Date(this.f49425o.longValue());
            if (b3.after(date)) {
                b3 = date;
            } else if (b3.before(date2)) {
                b3 = date2;
            }
        }
        this.f49427q = b3.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;
        this.f49428r = b3.getMonth() + 1;
        this.f49429s = b3.getDate();
        mo22196h(new C17920a());
    }

    /* renamed from: f */
    public void mo22189f(JSONObject jSONObject) {
        this.f49424n = C17922c.m18357a(jSONObject.optString("fields"));
        JSONObject optJSONObject = jSONObject.optJSONObject("range");
        if (optJSONObject != null) {
            Date b = this.f49424n.mo22192b(optJSONObject.optString(IXWebBroadcastListener.STAGE_START, ""));
            Date b2 = this.f49424n.mo22192b(optJSONObject.optString("end", ""));
            if (b != null) {
                this.f49425o = Long.valueOf(b.getTime());
            }
            if (b2 != null) {
                this.f49426p = Long.valueOf(b2.getTime());
            }
        }
        if (this.f49425o == null) {
            Calendar instance = Calendar.getInstance(LocaleUtil.sysDefaultLocale);
            instance.set(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID, 0, 1);
            this.f49425o = Long.valueOf(instance.getTimeInMillis());
        }
        if (this.f49426p == null) {
            Calendar instance2 = Calendar.getInstance(LocaleUtil.sysDefaultLocale);
            instance2.set(2100, 11, 31);
            this.f49426p = Long.valueOf(instance2.getTimeInMillis());
        }
        Date b3 = this.f49424n.mo22192b(jSONObject.optString("current", ""));
        if (b3 == null) {
            b3 = new Date(System.currentTimeMillis());
            Date date = new Date(this.f49426p.longValue());
            Date date2 = new Date(this.f49425o.longValue());
            if (b3.after(date)) {
                b3 = date;
            } else if (b3.before(date2)) {
                b3 = date2;
            }
        }
        this.f49427q = b3.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;
        this.f49428r = b3.getMonth() + 1;
        this.f49429s = b3.getDate();
        mo22196h(new C17921b());
    }
}
