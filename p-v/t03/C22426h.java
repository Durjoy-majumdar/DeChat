package t03;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import bp3.C79758p;
import com.google.android.gms.common.Scopes;
import com.google.android.material.tabs.TabLayout;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TopStoryEvent;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import h81.C32735h;
import hc0.C20937c;
import j20.C117292a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o03.C21723h;
import org.json.JSONArray;
import org.json.JSONObject;
import p03.C21912d;
import p03.C21914h;
import p03.C21915i;
import p156gj.C87200o;
import p156gj.C87203t;
import qe3.C89625d;
import te3.C49768hy;
import te3.jh4;
import te3.rh4;
import te3.th4;
import u73.C22613h1;
import u73.C78137s0;
import yf3.C112443e;

/* renamed from: t03.h */
public class C22426h {

    /* renamed from: a */
    public static C20937c f63540a;

    /* renamed from: b */
    public static C20937c f63541b;

    /* renamed from: c */
    public static long f63542c = 0;

    /* renamed from: t03.h$a */
    public class C22427a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ jh4 f63543d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList f63544e;

        public C22427a(jh4 jh4, LinkedList linkedList) {
            this.f63543d = jh4;
            this.f63544e = linkedList;
        }

        public void run() {
            ((C22420e) C86312j.m106911c(C22420e.class)).T60().mo67495c(this.f63543d, true, this.f63544e);
        }
    }

    /* renamed from: t03.h$b */
    public class C22428b implements Comparator<th4> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((th4) obj).f142234e, ((th4) obj2).f142234e);
        }
    }

    /* renamed from: t03.h$c */
    public static class C22429c {

        /* renamed from: a */
        public String f63545a = "";

        /* renamed from: b */
        public int f63546b = 0;

        /* renamed from: c */
        public String f63547c = "";

        /* renamed from: d */
        public int f63548d = 0;

        /* renamed from: e */
        public int f63549e = 0;

        /* renamed from: f */
        public String f63550f = "";

        /* renamed from: g */
        public String f63551g = "";

        /* renamed from: h */
        public TabLayout.C55061f f63552h;

        /* renamed from: i */
        public View f63553i;

        /* renamed from: j */
        public TextView f63554j;

        /* renamed from: k */
        public TextView f63555k;

        /* renamed from: l */
        public View f63556l;

        /* renamed from: m */
        public View f63557m;

        /* renamed from: a */
        public void mo35580a(int i, String str) {
            int i2 = i;
            this.f63548d = i2;
            this.f63550f = str;
            if (i2 <= 0) {
                View view = this.f63557m;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (this.f63549e <= 0) {
                this.f63555k.setVisibility(8);
                View view3 = this.f63557m;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo35582c(this);
        }

        /* renamed from: b */
        public void mo35581b(int i, String str) {
            this.f63549e = i;
            this.f63551g = str;
            if (i <= 0) {
                this.f63555k.setText("");
                this.f63555k.setVisibility(8);
                int i2 = this.f63548d;
                if (i2 > 0) {
                    mo35580a(i2, this.f63550f);
                }
            } else {
                String str2 = "" + this.f63549e;
                if (this.f63549e > 99) {
                    str2 = "99+";
                }
                this.f63555k.setText(str2);
                this.f63555k.setVisibility(0);
                View view = this.f63557m;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateNumberRedDot", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateNumberRedDot", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo35582c(this);
        }

        /* renamed from: c */
        public void mo35582c(C22429c cVar) {
            TextView textView = cVar.f63555k;
            if (textView == null || textView.getVisibility() != 0) {
                View view = cVar.f63557m;
                if (view == null || view.getVisibility() != 0) {
                    TextView textView2 = cVar.f63554j;
                    textView2.setContentDescription(cVar.f63545a + cVar.f63554j.getContext().getResources().getString(C0966R.string.f361471k51));
                    return;
                }
                TextView textView3 = cVar.f63554j;
                StringBuilder sb = new StringBuilder();
                sb.append(cVar.f63545a);
                sb.append(cVar.f63557m.getVisibility() == 0 ? cVar.f63557m.getContext().getString(C0966R.string.f7268b0) : "");
                sb.append(cVar.f63554j.getContext().getResources().getString(C0966R.string.f361471k51));
                textView3.setContentDescription(sb.toString());
            } else if (Util.isNullOrNil(cVar.f63555k.getText())) {
                TextView textView4 = cVar.f63554j;
                textView4.setContentDescription(cVar.f63545a + cVar.f63554j.getContext().getResources().getString(C0966R.string.f361471k51));
            } else {
                TextView textView5 = cVar.f63554j;
                textView5.setContentDescription(cVar.f63545a + cVar.f63554j.getContext().getString(C0966R.string.f7269b1, new Object[]{cVar.f63555k.getText()}) + cVar.f63554j.getContext().getResources().getString(C0966R.string.f361471k51));
            }
        }
    }

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59346b = true;
        bVar.f59347c = true;
        bVar.f59364t = true;
        bVar.f59359o = C0966R.C0969drawable.bfa;
        f63540a = bVar.mo32666a();
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59346b = true;
        bVar2.f59347c = true;
        bVar2.f59359o = C0966R.C0969drawable.bfa;
        f63541b = bVar2.mo32666a();
    }

    /* renamed from: a */
    public static final void m26099a(jh4 jh4, String str, long j) {
        C21915i.m25174f(jh4, str, j);
        if (jh4.f64039q.size() > 0) {
            th4 th4 = new th4();
            th4.f142233d = str;
            th4.f142234e = j;
            jh4.f64039q.add(th4);
        }
    }

    /* renamed from: b */
    public static final String m26100b(String str, long j) {
        return str + "_" + j;
    }

    /* renamed from: c */
    public static int m26101c() {
        int i;
        Class cls = C21912d.class;
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_topstory_tab_reddot_select, 0) == 0;
        if (z) {
            int e = m26103e();
            if (e == 0) {
                e = 110;
            }
            i = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34008s(e);
        } else {
            int e2 = m26103e();
            if (e2 == 0) {
                e2 = 100;
            }
            i = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34008s(e2);
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryUILogic", "getEnterTabCategory, haokanfirst:%s enterTabCategory:%s", Boolean.valueOf(z), Integer.valueOf(i));
        return i;
    }

    /* renamed from: d */
    public static final String m26102d() {
        TopStoryEvent topStoryEvent = new TopStoryEvent();
        topStoryEvent.f310012d.f310014a = 3;
        topStoryEvent.publish();
        jh4 jh4 = topStoryEvent.f310013e.f310016b;
        String str = jh4 != null ? jh4.f64038p : "";
        return Util.isNullOrNil(str) ? UUID.randomUUID().toString() : str;
    }

    /* renamed from: e */
    public static int m26103e() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_LAST_ENTER_TAB_REC_INT, 0);
        if (!C21914h.m25162j(j) || C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1) == 1) {
            return j;
        }
        return 100;
    }

    /* renamed from: f */
    public static List<C22429c> m26104f() {
        rh4 rh4;
        rh4 o;
        Class cls = C21912d.class;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = C78137s0.m94340d("topstoryTopTabParam").getJSONArray("tabs");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C22429c cVar = new C22429c();
                cVar.f63546b = jSONObject.getInt("category");
                String applicationLanguage = LocaleUtil.getApplicationLanguage();
                if (applicationLanguage.equals("zh_TW")) {
                    cVar.f63545a = jSONObject.getString("wording_tw");
                } else if (applicationLanguage.equals("zh_HK")) {
                    cVar.f63545a = jSONObject.getString("wording_hk");
                } else if (applicationLanguage.equals("zh_CN")) {
                    cVar.f63545a = jSONObject.getString("wording_cn");
                } else {
                    cVar.f63545a = jSONObject.getString("wording_en");
                }
                if (Util.isNullOrNil(cVar.f63545a)) {
                    arrayList.clear();
                    return arrayList;
                }
                int i2 = jSONObject.getInt("showWhenRedDot");
                cVar.f63547c = jSONObject.getString("tabInfo");
                if (C21914h.m25162j(cVar.f63546b)) {
                    cVar.f63548d = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33991b() ? 1 : 0;
                    int p = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34005p();
                    cVar.f63549e = p;
                    if (p > 0 && (o = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34004o()) != null) {
                        cVar.f63551g = o.f64533d;
                    }
                    if (cVar.f63548d > 0 && (rh4 = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61498b) != null) {
                        cVar.f63550f = rh4.f64533d;
                    }
                } else if (C21914h.m25163k(cVar.f63546b)) {
                    int i3 = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33992c() ? 1 : 0;
                    cVar.f63548d = i3;
                    if (i3 > 0) {
                        cVar.f63550f = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61497a.f64533d;
                    }
                } else if (C21914h.m25164l(cVar.f63546b)) {
                    int i4 = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33993d() ? 1 : 0;
                    cVar.f63548d = i4;
                    if (i4 > 0) {
                        cVar.f63550f = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).f61499c.f64533d;
                    }
                }
                arrayList.add(cVar);
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.TopStory.TopStoryUILogic", "parse tabconfig failed: %s", e.getMessage());
            arrayList.clear();
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final String m26105g(int i) {
        String string = MMApplicationContext.getContext().getString(C0966R.string.k44);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
        C76577a.m92172w(MMApplicationContext.getContext());
        if (sharedPreferences.getFloat("current_text_size_scale_key", 1.0f) >= C76577a.m92167r(MMApplicationContext.getContext())) {
            return string;
        }
        if (i <= 0 || LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()) != "zh_CN") {
            if (i > 99999) {
                return string + String.format(" 100%s+", new Object[]{MMApplicationContext.getContext().getString(C0966R.string.k3o)});
            } else if (i > 999) {
                return string + String.format(" %.1f%s", new Object[]{Float.valueOf(((float) i) / 1000.0f), MMApplicationContext.getContext().getString(C0966R.string.k3o)});
            } else if (i <= 0) {
                return string;
            } else {
                return string + " " + i;
            }
        } else if (i > 9999) {
            return string + String.format(" %.1f%s", new Object[]{Float.valueOf(((float) i) / 10000.0f), MMApplicationContext.getContext().getString(C0966R.string.k3p)});
        } else if (i > 99999) {
            return string + String.format(" 10%s+", new Object[]{MMApplicationContext.getContext().getString(C0966R.string.k3p)});
        } else {
            return string + " " + i;
        }
    }

    /* renamed from: h */
    public static boolean m26106h() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_topstory_top_multitask, false) || C79758p.f233760a.mo109883f(new C112443e()) == 1;
    }

    /* renamed from: i */
    public static void m26107i(List<C49768hy> list, String str, String str2, boolean z) {
        C49768hy hyVar = new C49768hy();
        hyVar.f134951d = "redPointMsgId";
        hyVar.f134953f = String.valueOf(str);
        list.add(hyVar);
        C49768hy hyVar2 = new C49768hy();
        hyVar2.f134951d = "currentPage";
        hyVar2.f134952e = 1;
        list.add(hyVar2);
        C49768hy hyVar3 = new C49768hy();
        hyVar3.f134951d = "is_prefetch";
        hyVar3.f134952e = 0;
        list.add(hyVar3);
        if (!Util.isNullOrNil(str2)) {
            C49768hy hyVar4 = new C49768hy();
            hyVar4.f134951d = TPReportKeys.Common.COMMON_SEQ;
            hyVar4.f134953f = str2;
            list.add(hyVar4);
            C49768hy hyVar5 = new C49768hy();
            hyVar5.f134951d = "requestId";
            hyVar5.f134953f = str2;
            list.add(hyVar5);
        }
        C49768hy hyVar6 = new C49768hy();
        hyVar6.f134951d = "recType";
        hyVar6.f134952e = 0;
        list.add(hyVar6);
        if (z) {
            C49768hy hyVar7 = new C49768hy();
            hyVar7.f134951d = TencentLocation.EXTRA_DIRECTION;
            hyVar7.f134952e = 1;
            list.add(hyVar7);
            C49768hy hyVar8 = new C49768hy();
            hyVar8.f134951d = "time_zone_min";
            TimeZone timeZone = TimeZone.getDefault();
            hyVar8.f134953f = "" + (((0 - timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis())) / 1000) / 60);
            list.add(hyVar8);
        }
    }

    /* renamed from: j */
    public static void m26108j(Context context) {
        C22613h1.m26478d("", 0, 0, 100);
        Intent intent = new Intent();
        if (m26106h()) {
            C43471q.m46985i(context, ".ui.home.TopStoryTabSettingAffinityUI", intent);
        } else {
            C43471q.m46985i(context, ".ui.home.TopStorySettingUI", intent);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0252 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0127 A[SYNTHETIC, Splitter:B:24:0x0127] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01da A[SYNTHETIC, Splitter:B:36:0x01da] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02c7  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26109k(android.content.Context r36, int r37, android.os.Bundle r38, java.lang.String r39, t83.C13841a r40) {
        /*
            r1 = r36
            r2 = r38
            r0 = r40
            java.lang.Class<t03.f> r3 = t03.C22422f.class
            java.lang.Class<p03.d> r4 = p03.C21912d.class
            long r5 = eb0.C31543z5.m39453c()
            long r7 = f63542c
            long r5 = r5 - r7
            r7 = 1500(0x5dc, double:7.41E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0018
            return
        L_0x0018:
            long r5 = eb0.C31543z5.m39453c()
            f63542c = r5
            r5 = 1
            int r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r5)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r37)
            r10 = 0
            r8[r10] = r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r5] = r6
            java.lang.String r6 = "MicroMsg.TopStory.TopStoryUILogic"
            java.lang.String r9 = "click top story scene %d version %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r8)
            di3.d r8 = di3.C86312j.m106911c(r4)
            p03.d r8 = (p03.C21912d) r8
            hz.k r8 = r8.mo34966t4()
            o03.h r8 = (o03.C21723h) r8
            boolean r8 = r8.mo33991b()
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x006a
            di3.d r8 = di3.C86312j.m106911c(r4)
            p03.d r8 = (p03.C21912d) r8
            hz.k r8 = r8.mo34966t4()
            o03.h r8 = (o03.C21723h) r8
            te3.rh4 r11 = r8.f61498b
            java.lang.String r8 = r11.f64533d
            r12 = 102(0x66, float:1.43E-43)
            r13 = 1
            r14 = 0
            r15 = 0
            java.lang.String r17 = ""
            u73.C22613h1.m26484j(r11, r12, r13, r14, r15, r17)
            goto L_0x0097
        L_0x006a:
            di3.d r8 = di3.C86312j.m106911c(r4)
            p03.d r8 = (p03.C21912d) r8
            hz.k r8 = r8.mo34966t4()
            o03.h r8 = (o03.C21723h) r8
            boolean r8 = r8.mo33993d()
            if (r8 == 0) goto L_0x009a
            di3.d r8 = di3.C86312j.m106911c(r4)
            p03.d r8 = (p03.C21912d) r8
            hz.k r8 = r8.mo34966t4()
            o03.h r8 = (o03.C21723h) r8
            te3.rh4 r11 = r8.f61499c
            java.lang.String r8 = r11.f64533d
            r12 = 102(0x66, float:1.43E-43)
            r13 = 1
            r14 = 0
            r15 = 0
            java.lang.String r17 = ""
            u73.C22613h1.m26484j(r11, r12, r13, r14, r15, r17)
        L_0x0097:
            r17 = 1
            goto L_0x009d
        L_0x009a:
            r8 = r9
            r17 = 0
        L_0x009d:
            di3.d r11 = di3.C86312j.m106911c(r4)
            p03.d r11 = (p03.C21912d) r11
            hz.k r11 = r11.mo34966t4()
            o03.h r11 = (o03.C21723h) r11
            int r25 = r11.mo34005p()
            if (r25 <= 0) goto L_0x00cc
            di3.d r11 = di3.C86312j.m106911c(r4)
            p03.d r11 = (p03.C21912d) r11
            hz.k r11 = r11.mo34966t4()
            o03.h r11 = (o03.C21723h) r11
            te3.rh4 r18 = r11.mo34004o()
            r19 = 102(0x66, float:1.43E-43)
            r20 = 2
            r22 = 0
            java.lang.String r24 = ""
            r21 = r25
            u73.C22613h1.m26484j(r18, r19, r20, r21, r22, r24)
        L_0x00cc:
            di3.d r11 = di3.C86312j.m106911c(r4)
            p03.d r11 = (p03.C21912d) r11
            hz.k r11 = r11.mo34966t4()
            o03.h r11 = (o03.C21723h) r11
            boolean r11 = r11.mo33992c()
            if (r11 == 0) goto L_0x00fb
            di3.d r11 = di3.C86312j.m106911c(r4)
            p03.d r11 = (p03.C21912d) r11
            hz.k r11 = r11.mo34966t4()
            o03.h r11 = (o03.C21723h) r11
            te3.rh4 r11 = r11.f61497a
            r19 = 102(0x66, float:1.43E-43)
            r20 = 3
            r21 = 0
            r22 = 0
            java.lang.String r24 = ""
            r18 = r11
            u73.C22613h1.m26484j(r18, r19, r20, r21, r22, r24)
        L_0x00fb:
            com.tencent.mm.autogen.events.TopStoryEvent r11 = new com.tencent.mm.autogen.events.TopStoryEvent
            r11.<init>()
            com.tencent.mm.autogen.events.TopStoryEvent$a r12 = r11.f310012d
            r12.f310014a = r5
            r11.publish()
            com.tencent.mm.autogen.events.TopStoryEvent$b r11 = r11.f310013e
            boolean r11 = r11.f310015a
            if (r11 == 0) goto L_0x0124
            boolean r11 = m26106h()
            if (r11 != 0) goto L_0x0124
            com.tencent.mm.autogen.events.TopStoryEvent r11 = new com.tencent.mm.autogen.events.TopStoryEvent
            r11.<init>()
            com.tencent.mm.autogen.events.TopStoryEvent$a r12 = r11.f310012d
            r12.f310014a = r7
            r11.publish()
            java.lang.String r11 = "TopStoryHomeUI Exist And Clear"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
        L_0x0124:
            r11 = -1
            if (r0 == 0) goto L_0x0139
            java.util.Map<java.lang.String, java.lang.Object> r12 = r0.f38983a     // Catch:{ Exception -> 0x0138 }
            java.lang.String r13 = "category"
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0138 }
            int r11 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0139
        L_0x0138:
        L_0x0139:
            long r12 = eb0.C31543z5.m39453c()
            java.lang.String r14 = java.lang.String.valueOf(r12)
            r12 = 2131830525(0x7f1126fd, float:1.929405E38)
            java.lang.String r13 = r1.getString(r12)
            te3.jh4 r15 = new te3.jh4
            r15.<init>()
            java.lang.String r12 = m26102d()
            r15.f64038p = r12
            r12 = r37
            r15.f64034i = r12
            r15.f64029d = r9
            r15.f64033h = r13
            if (r11 > 0) goto L_0x0162
            r16 = 100
            r10 = 100
            goto L_0x0163
        L_0x0162:
            r10 = r11
        L_0x0163:
            r15.f64041s = r10
            di3.d r10 = di3.C86312j.m106911c(r3)
            t03.f r10 = (t03.C22422f) r10
            int r10 = r10.f63532d
            r15.f64040r = r10
            java.lang.String r10 = u73.C101987v0.m134271e(r37)
            r15.f64030e = r10
            r15.f64031f = r10
            r15.f64044v = r13
            r15.f64043u = r5
            r15.f64036n = r14
            java.lang.String r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46979c()
            r15.f64045w = r7
            di3.d r7 = di3.C86312j.m106911c(r4)
            p03.d r7 = (p03.C21912d) r7
            com.tencent.xweb.WebView$WebViewKind r7 = r7.mo34965kw()
            java.lang.String r7 = r7.name()
            r15.f64046x = r7
            java.util.LinkedList<te3.hy> r7 = r15.f64037o
            m26107i(r7, r8, r14, r5)
            r19 = r6
            long r5 = eb0.C31543z5.m39453c()
            java.lang.String r7 = "clickTopStory"
            p03.C21915i.m25174f(r15, r7, r5)
            java.util.LinkedList<te3.th4> r12 = r15.f64039q
            int r12 = r12.size()
            if (r12 == 0) goto L_0x01ac
            goto L_0x01ba
        L_0x01ac:
            te3.th4 r12 = new te3.th4
            r12.<init>()
            r12.f142233d = r7
            r12.f142234e = r5
            java.util.LinkedList<te3.th4> r5 = r15.f64039q
            r5.add(r12)
        L_0x01ba:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            di3.d r4 = di3.C86312j.m106911c(r4)
            p03.d r4 = (p03.C21912d) r4
            hz.k r4 = r4.mo34966t4()
            o03.h r4 = (o03.C21723h) r4
            te3.rh4 r4 = r4.f61497a
            java.lang.String r4 = r4.f64533d
            r15.f64026B = r4
            r15.f64027C = r8
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            if (r0 == 0) goto L_0x0250
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f38983a     // Catch:{ Exception -> 0x0250 }
            java.lang.String r6 = "extReqParam"
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0250 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0250 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0243 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x0243 }
            r0 = 0
        L_0x01ee:
            int r7 = r6.length()     // Catch:{ JSONException -> 0x0243 }
            if (r0 >= r7) goto L_0x0250
            org.json.JSONObject r7 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x0243 }
            if (r7 == 0) goto L_0x0234
            te3.hy r8 = new te3.hy     // Catch:{ JSONException -> 0x0243 }
            r8.<init>()     // Catch:{ JSONException -> 0x0243 }
            java.lang.String r12 = "key"
            java.lang.String r12 = r7.getString(r12)     // Catch:{ JSONException -> 0x0243 }
            r8.f134951d = r12     // Catch:{ JSONException -> 0x0243 }
            java.lang.String r12 = "text_value"
            java.lang.String r7 = r7.getString(r12)     // Catch:{ JSONException -> 0x0243 }
            r8.f134953f = r7     // Catch:{ JSONException -> 0x0243 }
            java.lang.String r12 = "TopStoryHomeUI addreq, kvItem: %s, %s."
            r21 = r3
            r40 = r6
            r6 = 2
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x0232 }
            java.lang.String r6 = r8.f134951d     // Catch:{ JSONException -> 0x0232 }
            r16 = 0
            r3[r16] = r6     // Catch:{ JSONException -> 0x0232 }
            r6 = 1
            r3[r6] = r7     // Catch:{ JSONException -> 0x0232 }
            r6 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r3)     // Catch:{ JSONException -> 0x0230 }
            r4.add(r8)     // Catch:{ JSONException -> 0x0230 }
            java.util.LinkedList<te3.hy> r3 = r15.f64037o     // Catch:{ JSONException -> 0x0230 }
            r3.add(r8)     // Catch:{ JSONException -> 0x0230 }
            goto L_0x023a
        L_0x0230:
            r0 = move-exception
            goto L_0x0248
        L_0x0232:
            r0 = move-exception
            goto L_0x0246
        L_0x0234:
            r21 = r3
            r40 = r6
            r6 = r19
        L_0x023a:
            int r0 = r0 + 1
            r19 = r6
            r3 = r21
            r6 = r40
            goto L_0x01ee
        L_0x0243:
            r0 = move-exception
            r21 = r3
        L_0x0246:
            r6 = r19
        L_0x0248:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ Exception -> 0x0252 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ Exception -> 0x0252 }
            goto L_0x0252
        L_0x0250:
            r21 = r3
        L_0x0252:
            java.util.List r0 = m26104f()     // Catch:{ IOException -> 0x02f9 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IOException -> 0x02f9 }
            boolean r3 = r0.isEmpty()     // Catch:{ IOException -> 0x02f9 }
            java.lang.String r6 = "key_chosetab"
            if (r3 != 0) goto L_0x02c7
            if (r11 > 0) goto L_0x0269
            int r11 = m26101c()     // Catch:{ IOException -> 0x0267 }
            goto L_0x0269
        L_0x0267:
            goto L_0x029a
        L_0x0269:
            r3 = 0
            java.lang.Object r8 = r0.get(r3)     // Catch:{ IOException -> 0x02c3 }
            t03.h$c r8 = (t03.C22426h.C22429c) r8     // Catch:{ IOException -> 0x02c3 }
            int r8 = r8.f63546b     // Catch:{ IOException -> 0x02c3 }
            java.lang.Object r9 = r0.get(r3)     // Catch:{ IOException -> 0x02c3 }
            t03.h$c r9 = (t03.C22426h.C22429c) r9     // Catch:{ IOException -> 0x02c3 }
            java.lang.String r3 = r9.f63547c     // Catch:{ IOException -> 0x02c3 }
            r9 = 0
        L_0x027b:
            int r12 = r0.size()     // Catch:{ IOException -> 0x02c3 }
            if (r9 >= r12) goto L_0x029d
            java.lang.Object r12 = r0.get(r9)     // Catch:{ IOException -> 0x0267 }
            t03.h$c r12 = (t03.C22426h.C22429c) r12     // Catch:{ IOException -> 0x0267 }
            int r12 = r12.f63546b     // Catch:{ IOException -> 0x0267 }
            if (r12 != r11) goto L_0x0297
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IOException -> 0x0267 }
            t03.h$c r0 = (t03.C22426h.C22429c) r0     // Catch:{ IOException -> 0x0267 }
            java.lang.String r0 = r0.f63547c     // Catch:{ IOException -> 0x0267 }
            r16 = r0
            r8 = r11
            goto L_0x029f
        L_0x0297:
            int r9 = r9 + 1
            goto L_0x027b
        L_0x029a:
            r3 = r15
            goto L_0x02fb
        L_0x029d:
            r16 = r3
        L_0x029f:
            java.lang.String r0 = r15.f64027C     // Catch:{ IOException -> 0x02c3 }
            java.lang.String r3 = r15.f64026B     // Catch:{ IOException -> 0x02c3 }
            r11 = r37
            r12 = r10
            r9 = r15
            r15 = r0
            r18 = r25
            r19 = r3
            r20 = r39
            java.lang.String r0 = p03.C21914h.m25155c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x02c1 }
            r9.f64035j = r0     // Catch:{ IOException -> 0x02c1 }
            r5.putExtra(r6, r8)     // Catch:{ IOException -> 0x02c1 }
            java.lang.String r0 = "key_isfromhomepage"
            r3 = 1
            r5.putExtra(r0, r3)     // Catch:{ IOException -> 0x02c1 }
            r9.f64041s = r8     // Catch:{ IOException -> 0x02c1 }
            r3 = r9
            goto L_0x02ef
        L_0x02c1:
            goto L_0x02c5
        L_0x02c3:
            r9 = r15
            goto L_0x02c1
        L_0x02c5:
            r3 = r9
            goto L_0x02fb
        L_0x02c7:
            r3 = r15
            java.lang.String r0 = r3.f64027C     // Catch:{ IOException -> 0x02fa }
            java.lang.String r31 = ""
            r32 = 0
            r33 = 0
            java.lang.String r8 = r3.f64026B     // Catch:{ IOException -> 0x02fa }
            r26 = r37
            r27 = r10
            r28 = r13
            r29 = r14
            r30 = r0
            r34 = r8
            r35 = r39
            java.lang.String r0 = p03.C21914h.m25155c(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ IOException -> 0x02fa }
            r3.f64035j = r0     // Catch:{ IOException -> 0x02fa }
            java.lang.String r0 = "key_tabconfig"
            r5.putExtra(r0, r9)     // Catch:{ IOException -> 0x02fa }
            r8 = 0
            r5.putExtra(r6, r8)     // Catch:{ IOException -> 0x02fa }
        L_0x02ef:
            java.lang.String r0 = "key_context"
            byte[] r6 = r3.toByteArray()     // Catch:{ IOException -> 0x02fa }
            r5.putExtra(r0, r6)     // Catch:{ IOException -> 0x02fa }
            goto L_0x02fb
        L_0x02f9:
            r3 = r15
        L_0x02fa:
        L_0x02fb:
            if (r2 == 0) goto L_0x0302
            java.lang.String r0 = "key_extra_data"
            r5.putExtra(r0, r2)
        L_0x0302:
            boolean r0 = m26106h()
            if (r0 == 0) goto L_0x031e
            java.lang.String r0 = ".ui.home.TopStoryHomeAffinityUI"
            com.tencent.p014mm.plugin.websearch.C43471q.m46985i(r1, r0, r5)
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0330
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r2 = 2130772177(0x7f0100d1, float:1.7147465E38)
            r0.overridePendingTransition(r1, r2)
            goto L_0x0330
        L_0x031e:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r0)
            java.lang.String r0 = ".ui.home.TopStoryHomeUI"
            com.tencent.p014mm.plugin.websearch.C43471q.m46985i(r1, r0, r5)
            t03.h$a r0 = new t03.h$a
            r0.<init>(r3, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x0330:
            di3.d r0 = di3.C86312j.m106911c(r21)
            t03.f r0 = (t03.C22422f) r0
            r1 = 1
            r0.f63532d = r1
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TOP_STORY_HOME_UI_TIMESTAMP_LONG
            long r2 = eb0.C31543z5.m39453c()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119677K(r1, r2)
            java.lang.Class<tw0.e> r0 = tw0.C90584e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tw0.e r0 = (tw0.C90584e) r0
            int r1 = tw0.C90583b.f260258b
            r2 = 884(0x374, float:1.239E-42)
            r0.bs0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t03.C22426h.m26109k(android.content.Context, int, android.os.Bundle, java.lang.String, t83.a):void");
    }

    /* renamed from: l */
    public static void m26110l(Context context, jh4 jh4) {
        String valueOf = String.valueOf(C31543z5.m39453c());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("path", "good-look-history");
            jSONObject.put("subscene", 6);
            jSONObject.put("tagId", 10802);
            jSONObject.put("nickname", URLEncoder.encode((String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null), "UTF-8"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", e, "goUserProfiler", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(21));
        hashMap.put("sessionId", jh4.f64030e);
        hashMap.put("extParams", jSONObject.toString());
        hashMap.put("extInfo", ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo34011v());
        hashMap.put(Scopes.PROFILE, "1");
        hashMap.put("requestId", valueOf);
        hashMap.put("pRequestId", valueOf);
        hashMap.put(TPReportKeys.Common.COMMON_SEQ, valueOf);
        try {
            hashMap.put(MJTextResolver.KEY_DEVICE_NAME, URLEncoder.encode(C89625d.f257838d, "utf8"));
            hashMap.put("deviceBrand", URLEncoder.encode(Build.BRAND, "utf8"));
            hashMap.put(ConstValue.INIT_CONFIG_KEY_DEVICE_MODEL, URLEncoder.encode(C87203t.m108275k(), "utf8"));
            hashMap.put("ostype", C87200o.f252872e);
        } catch (UnsupportedEncodingException e2) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryUILogic", e2, "", new Object[0]);
        }
        jh4 jh42 = new jh4();
        jh42.f64038p = m26102d();
        jh42.f64034i = 21;
        jh42.f64029d = "";
        jh42.f64033h = "";
        jh42.f64036n = valueOf;
        jh42.f64030e = jh4.f64030e;
        jh42.f64031f = jh4.f64031f;
        jh42.f64043u = 2;
        jh42.f64035j = C21914h.m25156d(hashMap);
        jh42.f64044v = "";
        jh42.f64041s = 10802;
        jh42.f64045w = C43471q.m46979c();
        jh42.f64048z = context.getResources().getColor(C0966R.color.al6);
        C49768hy hyVar = new C49768hy();
        hyVar.f134951d = "rec_category";
        int i = jh4.f64041s;
        hyVar.f134952e = (long) i;
        hyVar.f134953f = String.valueOf(i);
        jh42.f64037o.add(hyVar);
        m26107i(jh42.f64037o, "", valueOf, false);
        m26111m(context, jh42, valueOf, false, 2);
    }

    /* renamed from: m */
    public static void m26111m(Context context, jh4 jh4, String str, boolean z, int i) {
        m26107i(jh4.f64037o, "", str, false);
        long c = C31543z5.m39453c();
        C21915i.m25174f(jh4, "clickTopStory", c);
        if (jh4.f64039q.size() == 0) {
            th4 th4 = new th4();
            th4.f142233d = "clickTopStory";
            th4.f142234e = c;
            jh4.f64039q.add(th4);
        }
        Intent intent = new Intent();
        try {
            intent.putExtra("key_context", jh4.toByteArray());
        } catch (IOException unused) {
        }
        intent.putExtra("key_navbarbgcolortype", i);
        C43471q.m46985i(context, ".ui.home.TopStoryTabHomeUI", intent);
    }

    /* renamed from: n */
    public static final String m26112n(jh4 jh4) {
        Collections.sort(jh4.f64039q, new C22428b());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < jh4.f64039q.size(); i++) {
            int i2 = i - 1;
            stringBuffer.append(jh4.f64039q.get(i2).f142233d);
            stringBuffer.append("->");
            stringBuffer.append(jh4.f64039q.get(i).f142233d);
            stringBuffer.append(XVFSFile.PATH_SEPARATOR);
            stringBuffer.append(jh4.f64039q.get(i).f142234e - jh4.f64039q.get(i2).f142234e);
            stringBuffer.append("\n");
        }
        if (jh4.f64039q.size() > 2) {
            stringBuffer.append("TotalUseTime:");
            LinkedList<th4> linkedList = jh4.f64039q;
            stringBuffer.append(linkedList.get(linkedList.size() - 1).f142234e - jh4.f64039q.get(0).f142234e);
            stringBuffer.append("\n");
        }
        jh4.f64039q.clear();
        stringBuffer.append("============ TopStory Trace ============");
        return stringBuffer.toString();
    }
}
