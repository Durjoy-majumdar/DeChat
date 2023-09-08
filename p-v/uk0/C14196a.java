package uk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import kr0.C88267e;

/* renamed from: uk0.a */
public class C14196a extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 912;
    public static final String NAME = "addPhoneCalendar";

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014f  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r29, org.json.JSONObject r30, int r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            r2 = r31
            r3 = r29
            kr0.e r3 = (kr0.C88267e) r3
            android.content.Context r12 = r3.getContext()
            java.lang.String r4 = "title"
            java.lang.String r5 = ""
            java.lang.String r6 = r0.optString(r4, r5)
            java.lang.String r7 = "startTime"
            r8 = 0
            long r10 = r0.optLong(r7, r8)
            java.lang.String r7 = "allDay"
            r13 = 0
            boolean r14 = r0.optBoolean(r7, r13)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            java.lang.String r15 = "repeat"
            boolean r15 = r0.optBoolean(r15, r13)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            boolean r16 = r5.equals(r6)
            java.lang.String r13 = "MicroMsg.JsApiAddPhoneCalendar"
            if (r16 != 0) goto L_0x0249
            int r16 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x0043
            goto L_0x0249
        L_0x0043:
            java.lang.String r8 = "endTime"
            long r18 = r0.optLong(r8, r10)
            java.lang.String r9 = "description"
            r20 = r12
            java.lang.String r12 = r0.optString(r9, r5)
            r21 = r7
            java.lang.String r7 = "location"
            java.lang.String r7 = r0.optString(r7, r5)
            r22 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r23 = r7
            r7 = 64
            r14.<init>(r7)
            java.lang.String r7 = "FREQ="
            r14.append(r7)
            boolean r7 = r15.booleanValue()
            r24 = 1000(0x3e8, double:4.94E-321)
            r26 = r15
            if (r7 == 0) goto L_0x015e
            java.lang.String r7 = "repeatInterval"
            java.lang.String r7 = r0.optString(r7, r5)
            r7.getClass()
            r27 = -1
            int r15 = r7.hashCode()
            if (r15 == 0) goto L_0x00c7
            r5 = 99228(0x1839c, float:1.39048E-40)
            if (r15 == r5) goto L_0x00bc
            r5 = 3645428(0x379ff4, float:5.108333E-39)
            if (r15 == r5) goto L_0x00b0
            r5 = 3704893(0x38883d, float:5.191661E-39)
            if (r15 == r5) goto L_0x00a4
            r5 = 104080000(0x6342280, float:3.3879584E-35)
            if (r15 == r5) goto L_0x0099
            goto L_0x00cd
        L_0x0099:
            java.lang.String r5 = "month"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00a2
            goto L_0x00cd
        L_0x00a2:
            r5 = 4
            goto L_0x00d0
        L_0x00a4:
            java.lang.String r5 = "year"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00ae
            goto L_0x00cd
        L_0x00ae:
            r5 = 3
            goto L_0x00d0
        L_0x00b0:
            java.lang.String r5 = "week"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00ba
            goto L_0x00cd
        L_0x00ba:
            r5 = 2
            goto L_0x00d0
        L_0x00bc:
            java.lang.String r5 = "day"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r5 = 1
            goto L_0x00d0
        L_0x00c7:
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x00cf
        L_0x00cd:
            r5 = -1
            goto L_0x00d0
        L_0x00cf:
            r5 = 0
        L_0x00d0:
            java.lang.String r7 = "fail:wrong format:repeat"
            if (r5 == 0) goto L_0x014f
            r15 = 1
            if (r5 == r15) goto L_0x011f
            r15 = 2
            if (r5 == r15) goto L_0x0116
            r15 = 3
            if (r5 == r15) goto L_0x010d
            r15 = 4
            if (r5 == r15) goto L_0x00ef
            java.lang.String r0 = "wrong format, repeat is true,but the repeatInterval is not day,week,month,year"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            java.lang.String r0 = r1.mo115109j(r7)
            r3.mo109647a(r2, r0)
            goto L_0x0258
        L_0x00ef:
            java.lang.String r5 = "MONTHLY;BYMONTHDAY="
            r14.append(r5)
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r7 = "d"
            r5.<init>(r7)
            java.util.Date r7 = new java.util.Date
            r15 = r8
            r27 = r9
            long r8 = r10 * r24
            r7.<init>(r8)
            java.lang.String r5 = r5.format(r7)
            r14.append(r5)
            goto L_0x0127
        L_0x010d:
            r15 = r8
            r27 = r9
            java.lang.String r5 = "YEARLY"
            r14.append(r5)
            goto L_0x0127
        L_0x0116:
            r15 = r8
            r27 = r9
            java.lang.String r5 = "WEEKLY"
            r14.append(r5)
            goto L_0x0127
        L_0x011f:
            r15 = r8
            r27 = r9
            java.lang.String r5 = "DAILY"
            r14.append(r5)
        L_0x0127:
            java.lang.String r5 = "repeatEndTime"
            r7 = 0
            long r16 = r0.optLong(r5, r7)
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0161
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyyMMdd'T'HHmmss'Z'"
            r0.<init>(r5)
            java.util.Date r5 = new java.util.Date
            long r7 = r16 * r24
            r5.<init>(r7)
            java.lang.String r0 = r0.format(r5)
            java.lang.String r5 = ";UNTIL="
            r14.append(r5)
            r14.append(r0)
            goto L_0x0161
        L_0x014f:
            java.lang.String r0 = "wrong format, repeat is true,but the repeatInterval is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            java.lang.String r0 = r1.mo115109j(r7)
            r3.mo109647a(r2, r0)
            goto L_0x0258
        L_0x015e:
            r15 = r8
            r27 = r9
        L_0x0161:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = 0
            r0[r5] = r6
            r5 = 1
            r0[r5] = r12
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r7 = 2
            r0[r7] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r18)
            r7 = 3
            r0[r7] = r5
            r5 = 4
            r0[r5] = r14
            java.lang.String r5 = "title:%s, description:%s, startTime:%d, endTime:%d, repeatValue:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.INSERT"
            r0.<init>(r5)
            android.net.Uri r5 = android.provider.CalendarContract.Events.CONTENT_URI
            android.content.Intent r0 = r0.setData(r5)
            long r10 = r10 * r24
            java.lang.String r5 = "beginTime"
            android.content.Intent r0 = r0.putExtra(r5, r10)
            long r7 = r18 * r24
            r5 = r15
            android.content.Intent r0 = r0.putExtra(r5, r7)
            android.content.Intent r0 = r0.putExtra(r4, r6)
            r4 = r27
            android.content.Intent r0 = r0.putExtra(r4, r12)
            java.lang.String r4 = "eventLocation"
            r5 = r23
            android.content.Intent r0 = r0.putExtra(r4, r5)
            java.lang.String r4 = "availability"
            r5 = 0
            android.content.Intent r0 = r0.putExtra(r4, r5)
            r4 = r21
            r5 = r22
            android.content.Intent r0 = r0.putExtra(r4, r5)
            boolean r4 = r26.booleanValue()
            if (r4 == 0) goto L_0x01ce
            java.lang.String r4 = r14.toString()
            java.lang.String r5 = "rrule"
            r0.putExtra(r5, r4)
        L_0x01ce:
            if (r20 == 0) goto L_0x023f
            android.content.pm.PackageManager r4 = r20.getPackageManager()
            android.content.ComponentName r4 = r0.resolveActivity(r4)
            if (r4 == 0) goto L_0x0235
            k20.a r12 = new k20.a     // Catch:{ Exception -> 0x021e }
            r12.<init>()     // Catch:{ Exception -> 0x021e }
            r12.mo10233c(r0)     // Catch:{ Exception -> 0x021e }
            java.lang.Object[] r5 = r12.mo10232b()     // Catch:{ Exception -> 0x021e }
            java.lang.String r6 = "com/tencent/mm/plugin/appbrand/jsapi/calendar/JsApiAddPhoneCalendar"
            java.lang.String r7 = "invoke"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;Lorg/json/JSONObject;I)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r20
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x021e }
            r4 = 0
            java.lang.Object r0 = r12.mo10231a(r4)     // Catch:{ Exception -> 0x021e }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x021e }
            r4 = r20
            r4.startActivity(r0)     // Catch:{ Exception -> 0x021e }
            java.lang.String r5 = "com/tencent/mm/plugin/appbrand/jsapi/calendar/JsApiAddPhoneCalendar"
            java.lang.String r6 = "invoke"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;Lorg/json/JSONObject;I)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x021e }
            java.lang.String r0 = "ok"
            java.lang.String r0 = r1.mo115109j(r0)
            r3.mo109647a(r2, r0)
            goto L_0x0258
        L_0x021e:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "startActivity exp:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r4)
            java.lang.String r0 = "fail:startActivity exception"
            java.lang.String r0 = r1.mo115109j(r0)
            r3.mo109647a(r2, r0)
            goto L_0x0258
        L_0x0235:
            java.lang.String r0 = "fail:no supporting apps"
            java.lang.String r0 = r1.mo115109j(r0)
            r3.mo109647a(r2, r0)
            goto L_0x0258
        L_0x023f:
            java.lang.String r0 = "fail:context nil"
            java.lang.String r0 = r1.mo115109j(r0)
            r3.mo109647a(r2, r0)
            goto L_0x0258
        L_0x0249:
            java.lang.String r0 = "wrong format, title is blank, or startTime is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            java.lang.String r0 = "fail:wrong format:title or startTime"
            java.lang.String r0 = r1.mo115109j(r0)
            r3.mo109647a(r2, r0)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uk0.C14196a.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
