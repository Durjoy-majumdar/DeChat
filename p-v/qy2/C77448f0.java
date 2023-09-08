package qy2;

import android.text.TextUtils;
import bp3.C104160f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lc3.C10485b;
import org.json.JSONObject;

/* renamed from: qy2.f0 */
public class C77448f0 {

    /* renamed from: a */
    public static final SimpleDateFormat f225876a = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS);

    /* renamed from: b */
    public static final SimpleDateFormat f225877b = new SimpleDateFormat("HH:mm");

    /* renamed from: c */
    public static final SimpleDateFormat f225878c = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: qy2.f0$a */
    public static class C77449a {

        /* renamed from: a */
        public int f225879a;

        /* renamed from: b */
        public int f225880b;

        /* renamed from: c */
        public boolean f225881c = false;

        /* renamed from: d */
        public int f225882d;

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0051 A[SYNTHETIC, Splitter:B:32:0x0051] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<qy2.C77448f0.C77449a> m93397b(org.json.JSONArray r11) {
            /*
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                if (r11 == 0) goto L_0x0096
                r1 = 0
                r2 = 0
            L_0x0009:
                int r3 = r11.length()
                if (r2 >= r3) goto L_0x0096
                java.lang.String r3 = r11.optString(r2)
                r4 = 0
                java.lang.String r5 = "-"
                java.lang.String[] r3 = r3.split(r5)     // Catch:{ all -> 0x008c }
                if (r3 == 0) goto L_0x008d
                int r5 = r3.length     // Catch:{ all -> 0x008c }
                r6 = 2
                if (r5 == r6) goto L_0x0022
                goto L_0x008d
            L_0x0022:
                r5 = r3[r1]     // Catch:{ all -> 0x008c }
                java.text.SimpleDateFormat r6 = qy2.C77448f0.f225877b     // Catch:{ all -> 0x0035 }
                java.util.Date r5 = r6.parse(r5)     // Catch:{ all -> 0x0035 }
                java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0035 }
                if (r5 != 0) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                r6.setTime(r5)     // Catch:{ all -> 0x0035 }
                goto L_0x0036
            L_0x0035:
                r6 = r4
            L_0x0036:
                if (r6 != 0) goto L_0x0039
                goto L_0x008d
            L_0x0039:
                r5 = 1
                r3 = r3[r5]     // Catch:{ all -> 0x008c }
                java.text.SimpleDateFormat r7 = qy2.C77448f0.f225877b     // Catch:{ all -> 0x004d }
                java.util.Date r3 = r7.parse(r3)     // Catch:{ all -> 0x004d }
                java.util.Calendar r7 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x004d }
                if (r3 != 0) goto L_0x0049
                goto L_0x004d
            L_0x0049:
                r7.setTime(r3)     // Catch:{ all -> 0x004d }
                goto L_0x004e
            L_0x004d:
                r7 = r4
            L_0x004e:
                if (r7 != 0) goto L_0x0051
                goto L_0x008d
            L_0x0051:
                qy2.f0$a r3 = new qy2.f0$a     // Catch:{ all -> 0x008c }
                r3.<init>()     // Catch:{ all -> 0x008c }
                java.text.SimpleDateFormat r8 = qy2.C77448f0.f225876a     // Catch:{ all -> 0x008c }
                r8 = 11
                int r9 = r6.get(r8)     // Catch:{ all -> 0x008c }
                r10 = 12
                int r6 = r6.get(r10)     // Catch:{ all -> 0x008c }
                int r9 = r9 * 60
                int r9 = r9 + r6
                r3.f225879a = r9     // Catch:{ all -> 0x008c }
                int r6 = r7.get(r8)     // Catch:{ all -> 0x008c }
                int r7 = r7.get(r10)     // Catch:{ all -> 0x008c }
                int r6 = r6 * 60
                int r6 = r6 + r7
                r3.f225880b = r6     // Catch:{ all -> 0x008c }
                if (r6 != 0) goto L_0x007c
                r6 = 1440(0x5a0, float:2.018E-42)
                r3.f225880b = r6     // Catch:{ all -> 0x008c }
            L_0x007c:
                int r6 = r3.f225880b     // Catch:{ all -> 0x008c }
                int r7 = r3.f225879a     // Catch:{ all -> 0x008c }
                if (r6 >= r7) goto L_0x008a
                r3.f225881c = r5     // Catch:{ all -> 0x008c }
                r3.f225882d = r6     // Catch:{ all -> 0x008c }
                int r6 = r6 + 1440
                r3.f225880b = r6     // Catch:{ all -> 0x008c }
            L_0x008a:
                r4 = r3
                goto L_0x008d
            L_0x008c:
            L_0x008d:
                if (r4 == 0) goto L_0x0092
                r0.add(r4)
            L_0x0092:
                int r2 = r2 + 1
                goto L_0x0009
            L_0x0096:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qy2.C77448f0.C77449a.m93397b(org.json.JSONArray):java.util.List");
        }

        /* renamed from: a */
        public boolean mo107617a(int i) {
            int i2 = this.f225879a;
            boolean z = true;
            boolean z2 = i >= i2 && i <= this.f225880b;
            if (!this.f225881c || z2) {
                return z2;
            }
            int i3 = i + 1440;
            if (i3 < i2 || i3 > this.f225880b) {
                z = false;
            }
            return z;
        }

        public String toString() {
            return "DD{bT=" + this.f225879a + ", eT=" + this.f225880b + ", iC=" + this.f225881c + ", oT=" + this.f225882d + '}';
        }
    }

    /* renamed from: qy2.f0$b */
    public static class C77450b {

        /* renamed from: a */
        public int f225883a = 0;

        /* renamed from: b */
        public C77449a f225884b;

        public String toString() {
            return "btnStyle{style=" + this.f225883a + ", durationData=" + this.f225884b + '}';
        }
    }

    /* renamed from: a */
    public static C77450b m93389a(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING;
        C77450b bVar = new C77450b();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("style", 0);
                if (optInt >= 1 && optInt <= 2) {
                    List<C77449a> b = C77449a.m93397b(jSONObject.optJSONArray("durations"));
                    if (((LinkedList) b).size() > 0) {
                        Calendar b2 = m93390b(C31543z5.m39453c());
                        if (b2 != null) {
                            int i = b2.get(11);
                            int i2 = b2.get(12);
                            int i3 = (i * 60) + i2;
                            Log.m105919d("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle convert cur h:%s, m:%s, tm:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                            Iterator<C77449a> it = b.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C77449a next = it.next();
                                Log.m105919d("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle convert DurationData:%s", next);
                                if (next.mo107617a(i3)) {
                                    String I = C86709a0.m107535s().mo121142i().mo119675I(aVar, "");
                                    String c = m93391c(String.valueOf(optInt), next);
                                    Log.m105919d("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle convert curtag:%s, targetTag:%s", I, c);
                                    if (!TextUtils.equals(I, c)) {
                                        bVar.f225883a = optInt;
                                        bVar.f225884b = next;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        String I2 = C86709a0.m107535s().mo121142i().mo119675I(aVar, "");
                        String c2 = m93391c(String.valueOf(optInt), (C77449a) null);
                        Log.m105919d("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle convert curtag:%s, targetTag:%s", I2, c2);
                        if (!TextUtils.equals(I2, c2)) {
                            bVar.f225883a = optInt;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusSwitch", th, "convertBtnStyle", new Object[0]);
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public static Calendar m93390b(long j) {
        try {
            SimpleDateFormat simpleDateFormat = f225876a;
            Date parse = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j)));
            Calendar instance = Calendar.getInstance();
            if (parse == null) {
                return null;
            }
            instance.setTime(parse);
            return instance;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m93391c(String str, C77449a aVar) {
        String str2;
        Calendar b;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (aVar != null) {
            str2 = aVar.f225879a + "_" + aVar.f225880b;
        } else {
            str2 = str3;
        }
        long a = C31543z5.m39451a();
        if (TextUtils.isEmpty(str2)) {
            try {
                str3 = f225878c.format(Long.valueOf(a));
            } catch (Throwable unused) {
            }
        } else {
            if (aVar != null) {
                boolean z = false;
                if (aVar.f225881c && (b = m93390b(a)) != null) {
                    if ((b.get(11) * 60) + b.get(12) < aVar.f225882d) {
                        z = true;
                    }
                }
                if (z) {
                    Log.m105918d("MicroMsg.TextStatus.TextStatusSwitch", "getFriendsStatusBtnTag isHitLastDay");
                    str3 = f225878c.format(Long.valueOf(a - 86400000));
                }
            }
            str3 = f225878c.format(Long.valueOf(a));
        }
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: d */
    public static int m93392d(String str, boolean z) {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("StatusUseBypassMsg", 0);
        Log.m105925i("MicroMsg.TextStatus.TextStatusSwitch", "getUseByPassMsgSwitchValue result:%s type:%s isFromPassByMsg:%s", Integer.valueOf(b), str, Boolean.valueOf(z));
        return b;
    }

    /* renamed from: e */
    public static boolean m93393e() {
        Class cls = C32735h.class;
        return ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_text_status_dynamic_label_and, C104160f.RepairerConfig_TextStatus_DynamicLabel_Int, 1) == 1 && ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_group_dynamic_label_enable, true);
    }

    /* renamed from: f */
    public static boolean m93394f() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_entry_and, C104160f.RepairerConfig_TextStatus_EntrySwitch_Int, 1) == 1;
    }

    /* renamed from: g */
    public static boolean m93395g() {
        return m93394f() && ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_icon_timeline_comments_and_like_and, C104160f.RepairerConfig_TextStatus_SnsCommentAndLikeIcon_Int, 0) == 1;
    }

    /* renamed from: h */
    public static void m93396h() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN, Boolean.TRUE);
    }
}
