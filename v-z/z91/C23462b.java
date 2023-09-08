package z91;

import aa1.C91980d;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ba1.C113156i;
import ba1.C16777c;
import ba1.C16778j;
import ba1.C16780k;
import ca1.C113263a;
import ca1.C113264b;
import com.tencent.p014mm.autogen.events.SessionChangeEvent;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d91.C20449a;
import da1.C116606c;
import da1.C20455a;
import e91.C116711b;
import ea1.C116718g;
import f91.C116850b;
import fa1.C20696a;
import g91.C20813c;
import ga1.C20819a;
import ga1.C20822b;
import ga1.C20823c;
import gy3.C87412m;
import i91.C21062c;
import j91.C21199a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k91.C117393b;
import l91.C117467h;
import op3.C117877b;
import p185kq.C10384l;
import sx3.C110818d0;
import t91.C22466j;
import t91.C64208c;
import te3.C110960dr1;
import te3.C110962fr1;
import te3.C110970q14;
import te3.C118423dg2;
import te3.C118427eg2;
import te3.C118430fa3;
import te3.C118433ga3;
import te3.C118434gg2;
import te3.C118467t1;
import te3.C118478x14;
import te3.C118484zl2;
import te3.C22505ka3;
import te3.C22527qp1;
import te3.fh4;
import u91.C22618a;
import u91.C22623c;
import x91.C118865a;
import x91.C23066b;
import x91.C23072e;
import y91.C118948a;

/* renamed from: z91.b */
public final class C23462b implements C10384l {

    /* renamed from: l */
    public static C23462b f67288l;

    /* renamed from: a */
    public final C20819a f67289a = new C20819a();

    /* renamed from: b */
    public final C20823c f67290b = new C20823c();

    /* renamed from: c */
    public String f67291c = null;

    /* renamed from: d */
    public int f67292d = 0;

    /* renamed from: e */
    public int f67293e = -1;

    /* renamed from: f */
    public int f67294f = -1;

    /* renamed from: g */
    public long f67295g = -1;

    /* renamed from: h */
    public boolean f67296h = false;

    /* renamed from: i */
    public boolean f67297i = false;

    /* renamed from: j */
    public C22505ka3 f67298j = null;

    /* renamed from: k */
    public C22505ka3 f67299k = null;

    public C23462b() {
        if (C116711b.m164589n()) {
            C113156i.m154837e();
        }
    }

    /* renamed from: f */
    public static C23462b m28021f() {
        if (f67288l == null) {
            synchronized (C23462b.class) {
                if (f67288l == null) {
                    f67288l = new C23462b();
                }
            }
        }
        return f67288l;
    }

    /* renamed from: m */
    public static void m28022m(String str, long j) {
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "notify session close [%s] [%d]", str, Long.valueOf(j));
        SessionChangeEvent sessionChangeEvent = new SessionChangeEvent();
        SessionChangeEvent.C28822a aVar = sessionChangeEvent.f78973d;
        aVar.f78974a = str;
        aVar.f78975b = j;
        aVar.f78976c = 1;
        sessionChangeEvent.publish();
    }

    /* renamed from: n */
    public static void m28023n(String str, long j) {
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "notify session start [%s] [%d]", str, Long.valueOf(j));
        SessionChangeEvent sessionChangeEvent = new SessionChangeEvent();
        SessionChangeEvent.C28822a aVar = sessionChangeEvent.f78973d;
        aVar.f78974a = str;
        aVar.f78975b = j;
        aVar.f78976c = 0;
        sessionChangeEvent.publish();
    }

    /* renamed from: v */
    public static void m28024v(C22505ka3 ka32) {
        int i;
        Object[] objArr = new Object[1];
        objArr[0] = ka32 == null ? "NULL" : ka32.f64087d;
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, report: %s", objArr);
        C118434gg2 h = C16777c.m16416h();
        if (h != null) {
            C118423dg2 a = C113263a.m155052a();
            C115411b.C115412a aVar = C115411b.f345922a;
            LinkedList<C22505ka3> linkedList = h.f354028f;
            C87412m.m108593f(linkedList, "hellSession.sessions");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                C22505ka3 ka33 = (C22505ka3) next;
                C115411b.C115412a aVar2 = C115411b.f345922a;
                String str = ka33.f64087d;
                C87412m.m108593f(str, "it.sessionId");
                if (C87412m.m108589b(aVar2.mo175244a(str), "999") && ((i = ka33.f64091h) == 0 || i == 1 || i == 2 || i == 4 || i == 5)) {
                    arrayList.add(next);
                }
            }
            List<C22505ka3> y0 = C110818d0.m150953y0(arrayList);
            Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "after, sessionList.size: " + y0.size());
            String str2 = null;
            for (C22505ka3 ka34 : y0) {
                C117877b<String, String> j = aVar.mo175253j(ka34.f64087d);
                if (j != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('_');
                    sb.append(j.mo182596a(1));
                    str2 = sb.toString();
                }
                Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "handleChatting, session, Start: " + ka34.f64087d + ", " + str2);
                String d = aVar.mo175247d(ka34.f64091h);
                ka34.f64087d = d;
                if (!C87412m.m108589b(d, "-1")) {
                    ka34.f64087d += str2;
                }
                Log.m105924i("HABBYGE-MALI.HellKSessionConfig", "handleChatting, session, End: " + ka34.f64087d);
            }
            if ((!h.f354030h.isEmpty() || !h.f354028f.isEmpty()) && !a.f353948d.isEmpty()) {
                Log.m105924i("HABBYGE-MALI.HellSessionReport", "reportWhenEvent8 BEGIN !!");
                C116718g.m164622i(a, h, false);
                C116718g.m164614a(h, a.f353948d.getFirst());
                C116718g.m164617d(h, a, ka32);
            }
            C118434gg2 h2 = C16777c.m16416h();
            if (h2 != null) {
                h2.f354033n = 0;
                C16777c.m16419k(h2);
            }
            C113264b.m155061g();
        }
    }

    /* renamed from: w */
    public static void m28025w(C22505ka3 ka32, String str) {
        View view;
        boolean z;
        if (ka32 != null) {
            if (ka32.f64087d.startsWith("142")) {
                if (str == null || C116711b.m164587l(str)) {
                    try {
                        Fragment f = C117467h.m165691f(C116711b.m164582g(), "com.tencent.mm.ui.MoreTabUI");
                        Field declaredField = Class.forName("com.tencent.mm.ui.MoreTabUI").getDeclaredField("storyGallery");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(f);
                        Field declaredField2 = Class.forName("com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView").getDeclaredField("holderView");
                        declaredField2.setAccessible(true);
                        view = (View) declaredField2.get(obj);
                    } catch (Exception unused) {
                        view = null;
                    }
                    if (view == null) {
                        Log.m105924i("HABBYGE-MALI.FragmentMonitor", "isStoryGalleryShow = NULL");
                        z = false;
                    } else {
                        z = view.getVisibility() != 0;
                        Log.m105925i("HABBYGE-MALI.FragmentMonitor", "isStoryGalleryShow: %b", Boolean.valueOf(z));
                    }
                    Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession, 142: isActive: %b", Boolean.valueOf(z));
                    if (!z) {
                        return;
                    }
                } else {
                    Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession, 142: isStoryGalleryViewShow: FALSE");
                }
            }
            C118434gg2 gg22 = new C118434gg2();
            C22505ka3 ka33 = new C22505ka3();
            C115411b.m162218a(ka32);
            ka33.f64087d = ka32.f64087d;
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession, curSession.session: %s", ka32.f64087d);
            ka33.f64096p = true;
            ka33.f64099s = 1;
            ka33.f64100t = ka32.f64100t;
            ka33.f64090g = ka32.f64090g;
            ka33.f64091h = ka32.f64091h;
            ka33.f64097q = ka32.f64097q;
            ka33.f64094n = ka32.f64094n;
            ka33.f64095o = ka32.f64095o;
            ka33.f64088e = C16777c.m16412d();
            gg22.f354028f.addLast(ka33);
            gg22.f354029g = gg22.f354028f.size() - 1;
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "retainCurSession.session: %s, %s", ka33.f64087d, ka33.f64090g);
            C16777c.m16417i(gg22);
        }
    }

    /* renamed from: a */
    public void mo36917a(Activity activity, int i) {
        if (C115411b.m162220c()) {
            Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, catchParamsOnActivityAsync: FALSE");
            return;
        }
        Map<Integer, WeakReference<Activity>> map = C20455a.f57485a;
        if (activity != null) {
            if (i == 0) {
                int hashCode = activity.hashCode();
                HashMap hashMap = (HashMap) C20455a.f57485a;
                if (!hashMap.containsKey(Integer.valueOf(hashCode))) {
                    hashMap.put(Integer.valueOf(hashCode), new WeakReference(activity));
                } else {
                    WeakReference weakReference = (WeakReference) hashMap.get(Integer.valueOf(hashCode));
                    if (weakReference == null || weakReference.get() == null) {
                        hashMap.remove(Integer.valueOf(hashCode));
                        hashMap.put(Integer.valueOf(hashCode), new WeakReference(activity));
                    }
                }
                C20813c.m22810a().mo32508c(400, Integer.valueOf(hashCode));
            } else if (i == 2) {
                int hashCode2 = activity.hashCode();
                HashMap hashMap2 = (HashMap) C20455a.f57485a;
                if (!hashMap2.containsKey(Integer.valueOf(hashCode2))) {
                    hashMap2.put(Integer.valueOf(hashCode2), new WeakReference(activity));
                } else {
                    WeakReference weakReference2 = (WeakReference) hashMap2.get(Integer.valueOf(hashCode2));
                    if (weakReference2 == null || weakReference2.get() == null) {
                        hashMap2.remove(Integer.valueOf(hashCode2));
                        hashMap2.put(Integer.valueOf(hashCode2), new WeakReference(activity));
                    }
                }
                C20813c.m22810a().mo32508c(401, Integer.valueOf(hashCode2));
            }
        }
        Map<Integer, WeakReference<Activity>> map2 = C116606c.f349667a;
        Class<C116606c> cls = C116606c.class;
        if (activity != null) {
            if (i == 0) {
                synchronized (cls) {
                    int hashCode3 = activity.hashCode();
                    Map<Integer, WeakReference<Activity>> map3 = C116606c.f349667a;
                    if (!((HashMap) map3).containsKey(Integer.valueOf(hashCode3))) {
                        HashMap hashMap3 = (HashMap) map3;
                        hashMap3.put(Integer.valueOf(hashCode3), new WeakReference(activity));
                    } else {
                        WeakReference weakReference3 = (WeakReference) ((HashMap) map3).get(Integer.valueOf(hashCode3));
                        if (weakReference3 == null || weakReference3.get() == null) {
                            ((HashMap) map3).remove(Integer.valueOf(hashCode3));
                            HashMap hashMap4 = (HashMap) map3;
                            hashMap4.put(Integer.valueOf(hashCode3), new WeakReference(activity));
                        }
                    }
                    C20813c.m22810a().mo32508c(402, Integer.valueOf(hashCode3));
                }
            } else if (i == 2) {
                synchronized (cls) {
                    int hashCode4 = activity.hashCode();
                    Map<Integer, WeakReference<Activity>> map4 = C116606c.f349667a;
                    if (!((HashMap) map4).containsKey(Integer.valueOf(hashCode4))) {
                        HashMap hashMap5 = (HashMap) map4;
                        hashMap5.put(Integer.valueOf(hashCode4), new WeakReference(activity));
                    } else {
                        WeakReference weakReference4 = (WeakReference) ((HashMap) map4).get(Integer.valueOf(hashCode4));
                        if (weakReference4 == null || weakReference4.get() == null) {
                            ((HashMap) map4).remove(Integer.valueOf(hashCode4));
                            HashMap hashMap6 = (HashMap) map4;
                            hashMap6.put(Integer.valueOf(hashCode4), new WeakReference(activity));
                        }
                    }
                    C20813c.m22810a().mo32508c(403, Integer.valueOf(hashCode4));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo36918b(Fragment fragment, int i) {
        C22505ka3 e;
        C22505ka3 e2;
        if (C115411b.m162220c()) {
            Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, catchParamsOnFragment: FALSE");
            return;
        }
        Map<Integer, WeakReference<Activity>> map = C20455a.f57485a;
        if (fragment != null) {
            if (i == 0) {
                C22505ka3 e3 = C16777c.m16413e();
                if (e3 != null) {
                    C20455a.m22072d(fragment, e3, true);
                }
            } else if (i == 2 && (e2 = C16777c.m16413e()) != null) {
                C20455a.m22072d(fragment, e2, false);
            }
        }
        Map<Integer, WeakReference<Activity>> map2 = C116606c.f349667a;
        if (fragment != null) {
            if (i == 0) {
                C22505ka3 e4 = C16777c.m16413e();
                if (e4 != null) {
                    C116606c.m164450a(fragment, e4, true);
                }
            } else if (i == 2 && (e = C16777c.m16413e()) != null) {
                C116606c.m164450a(fragment, e, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03f3  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36919c(java.lang.String r21, int r22, long r23, int r25) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = r22
            r0 = r25
            r8.f67294f = r0
            r1 = r23
            r8.f67295g = r1
            boolean r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162220c()
            java.lang.String r11 = "HABBYGE-MALI.HellSessionMonitor"
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "HellSessionMonitor, frontbackEvent, needSessionMonitor: FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            ca1.C113264b.m155061g()
            return
        L_0x001f:
            r12 = 3
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r13 = 0
            r1[r13] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r14 = 1
            r1[r14] = r2
            long r2 = r8.f67295g
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r15 = 2
            r1[r15] = r2
            java.lang.String r2 = "frontbackEvent: %s, %d, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            boolean r1 = e91.C116711b.m164587l(r21)
            java.lang.String r2 = "FloatBall"
            java.lang.String r6 = "FinderHomeAffinityUI"
            java.lang.String r16 = ""
            java.lang.String r5 = "mmkv_key_hell_sessions"
            java.lang.String r7 = "HellSessionDao, reset"
            java.lang.String r12 = "HABBYGE-MALI.HellSessionDao"
            r15 = 0
            if (r1 == 0) goto L_0x02b5
            long r3 = r8.f67295g
            java.lang.Object[] r10 = new java.lang.Object[r14]
            r10[r13] = r9
            java.lang.String r1 = "_launcherUIOnFrontBack, pageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r10)
            r1 = 7
            if (r0 == r1) goto L_0x0121
            r1 = 8
            if (r0 == r1) goto L_0x0061
            goto L_0x0553
        L_0x0061:
            r8.f67293e = r1
            te3.ka3 r0 = ba1.C16777c.m16413e()
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r0.f64087d
            if (r1 == 0) goto L_0x0088
            java.lang.String r2 = "155"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0088
            boolean r1 = e91.C116711b.m164587l(r21)
            if (r1 == 0) goto L_0x0088
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r0 = r0.f64087d
            r1[r13] = r0
            java.lang.String r0 = "finder muil launcherUIOn8Event error sid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            goto L_0x0553
        L_0x0088:
            if (r0 == 0) goto L_0x00b7
            r0.f64096p = r14
            r0.f64093j = r3
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f64087d
            r1[r13] = r2
            r1[r14] = r9
            java.lang.String r2 = "launcherUIOn8Event, curSession: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            te3.gg2 r1 = ba1.C16777c.m16416h()
            if (r1 != 0) goto L_0x00a4
            goto L_0x0553
        L_0x00a4:
            ca1.C113264b.m155062h(r9, r3)
            r1.f354027e = r3
            ba1.C16777c.m16417i(r1)
            r8.mo36930q(r0, r3)
            m28024v(r0)
            m28025w(r0, r9)
            goto L_0x0553
        L_0x00b7:
            i91.c r0 = i91.C21062c.m23249d()
            te3.t1 r0 = r0.mo32772b(r9)
            if (r0 == 0) goto L_0x00ed
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            te3.fh4 r2 = r0.f354392d
            java.lang.String r2 = r2.f354001d
            r1[r13] = r2
            java.lang.String r2 = r0.f354397i
            r1[r14] = r2
            java.lang.String r2 = r0.f354395g
            r6 = 2
            r1[r6] = r2
            java.lang.String r2 = r0.f354396h
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "_launcherUIOn8Event, curAR: %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            java.lang.String r1 = r0.f354395g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00ea
            te3.fh4 r0 = r0.f354392d
            java.lang.String r0 = r0.f354001d
            goto L_0x00ee
        L_0x00ea:
            java.lang.String r0 = r0.f354395g
            goto L_0x00ee
        L_0x00ed:
            r0 = r9
        L_0x00ee:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00f8
            java.lang.String r0 = e91.C116711b.m164583h(r0)
        L_0x00f8:
            r8.mo36933t(r0, r3)
            te3.gg2 r1 = ba1.C16777c.m16416h()
            if (r1 != 0) goto L_0x0103
            goto L_0x0553
        L_0x0103:
            ca1.C113264b.m155062h(r0, r3)
            r1.f354027e = r3
            ba1.C16777c.m16417i(r1)
            m28024v(r15)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            byte[] r1 = new byte[r13]
            f91.C116850b.m164834d(r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r13] = r0
            java.lang.String r0 = "_launcherUIOn8Event, 无Session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            goto L_0x0553
        L_0x0121:
            r0 = 7
            r8.f67293e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 == 0) goto L_0x012c
            goto L_0x0553
        L_0x012c:
            te3.gg2 r0 = ba1.C16777c.m16416h()
            if (r0 != 0) goto L_0x0137
            te3.gg2 r0 = new te3.gg2
            r0.<init>()
        L_0x0137:
            r0.f354026d = r3
            ba1.C16777c.m16417i(r0)
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r13] = r9
            long r0 = r0.f354026d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5[r14] = r0
            java.lang.String r0 = "_launcherUIOn7Event: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r5)
            te3.ka3 r0 = ba1.C16777c.m16413e()
            if (r0 == 0) goto L_0x02aa
            boolean r1 = r0.f64096p
            if (r1 == 0) goto L_0x0553
            java.lang.String r1 = r0.f64087d
            java.lang.String r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r1)
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r13] = r1
            java.lang.String r7 = "_launcherUIOn7Event, curSid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r7, r5)
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r5 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            if (r1 != 0) goto L_0x016d
            r7 = 0
            goto L_0x0177
        L_0x016d:
            java.lang.String r7 = r5.mo175244a(r1)
            java.lang.String r10 = "105"
            boolean r7 = gy3.C87412m.m108589b(r10, r7)
        L_0x0177:
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = "131"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = "144"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = r0.f64090g
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r6 = 0
            goto L_0x0195
        L_0x0194:
            r6 = 1
        L_0x0195:
            if (r6 == 0) goto L_0x01a9
            boolean r6 = e91.C116711b.m164587l(r21)
            if (r6 == 0) goto L_0x01a9
            java.lang.String r1 = "_launcherUIOn7Event, AppBrand 7Event !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            java.lang.String r0 = r0.f64087d
            ba1.C16777c.m16410b(r0)
            goto L_0x0553
        L_0x01a9:
            boolean r6 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r1)
            if (r6 == 0) goto L_0x0247
            ga1.a r6 = r8.f67289a
            r6.getClass()
            te3.qp1 r6 = ga1.C20822b.m22817a()
            if (r6 != 0) goto L_0x01bc
            r6 = r15
            goto L_0x01be
        L_0x01bc:
            te3.eg2 r6 = r6.f64510e
        L_0x01be:
            if (r6 == 0) goto L_0x0247
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r7 = r6.f353972g
            r9[r13] = r7
            java.lang.String r7 = r6.f353969d
            r9[r14] = r7
            java.lang.String r7 = "lstItem: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r7, r9)
            java.lang.String r7 = r6.f353972g
            boolean r7 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r7)
            if (r7 == 0) goto L_0x0247
            java.lang.String r7 = r6.f353969d
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x01e8
            java.lang.String r6 = r6.f353969d
            boolean r6 = e91.C116711b.m164586k(r6)
            if (r6 == 0) goto L_0x0247
        L_0x01e8:
            java.lang.String r1 = r5.mo175246c()
            te3.gg2 r5 = ba1.C16777c.m16416h()
            if (r5 == 0) goto L_0x0221
            java.util.LinkedList<te3.ka3> r6 = r5.f354028f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x01fb
            goto L_0x0221
        L_0x01fb:
            java.lang.Object[] r6 = new java.lang.Object[r14]
            int r7 = r5.f354029g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r13] = r7
            java.lang.String r7 = "getLastSession, hellSession: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r6)
            boolean r6 = ba1.C16777c.m16415g(r5)
            if (r6 == 0) goto L_0x0221
            int r6 = r5.f354029g
            int r7 = r6 + -1
            if (r7 >= 0) goto L_0x0217
            goto L_0x0221
        L_0x0217:
            java.util.LinkedList<te3.ka3> r5 = r5.f354028f
            int r6 = r6 - r14
            java.lang.Object r5 = r5.get(r6)
            r15 = r5
            te3.ka3 r15 = (te3.C22505ka3) r15
        L_0x0221:
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r13] = r1
            java.lang.String r1 = "lstSessionId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r1, r5)
            if (r15 == 0) goto L_0x0237
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r5 = r15.f64087d
            r1[r13] = r5
            java.lang.String r5 = "lstSession: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r5, r1)
        L_0x0237:
            r0.f64092i = r3
            r0.f64093j = r3
            r0.f64090g = r2
            r0.f64099s = r14
            ba1.C16777c.m16418j(r0)
            r8.mo36930q(r0, r3)
            goto L_0x0553
        L_0x0247:
            r0.f64096p = r13
            r0.f64099s = r13
            r0.f64092i = r3
            java.lang.String r2 = ba1.C16780k.m16423b()
            if (r2 != 0) goto L_0x0255
            r2 = r16
        L_0x0255:
            r0.f64102v = r2
            java.lang.String r2 = "142"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x026a
            java.lang.String r1 = "launcherUIOn7Event, addPageFlow: StoryGalleryView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            java.lang.String r1 = "StoryGalleryView"
            ca1.C113264b.m155056b(r0, r1, r13, r3)
            goto L_0x0284
        L_0x026a:
            java.lang.String r1 = "launcherUIOn7Event, addPageFlow: ChattingUIFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            androidx.fragment.app.FragmentActivity r1 = e91.C116711b.m164582g()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.ChattingUIFragment"
            androidx.fragment.app.Fragment r1 = l91.C117467h.m165691f(r1, r2)
            if (r1 != 0) goto L_0x027d
            r1 = 0
            goto L_0x0281
        L_0x027d:
            int r1 = r1.hashCode()
        L_0x0281:
            ca1.C113264b.m155056b(r0, r2, r1, r3)
        L_0x0284:
            ba1.C16777c.m16418j(r0)
            r8.mo36932s(r0)
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f64087d
            r1[r13] = r2
            java.lang.String r2 = r0.f64090g
            r1[r14] = r2
            java.lang.String r2 = r0.f64095o
            r3 = 2
            r1[r3] = r2
            int r0 = r0.f64091h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "_launcherUIOn7Event, curSession: %s, %s, %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            goto L_0x0553
        L_0x02aa:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            java.lang.String r1 = "_launcherUIOn7Event, no Session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            goto L_0x0553
        L_0x02b5:
            long r3 = r8.f67295g
            r1 = 7
            if (r0 == r1) goto L_0x0366
            r1 = 8
            if (r0 == r1) goto L_0x02c0
            goto L_0x0553
        L_0x02c0:
            te3.ka3 r0 = ba1.C16777c.m16413e()
            if (r0 == 0) goto L_0x02f5
            r0.f64096p = r14
            r0.f64093j = r3
            te3.gg2 r1 = ba1.C16777c.m16416h()
            if (r1 != 0) goto L_0x02d2
            goto L_0x0553
        L_0x02d2:
            ca1.C113264b.m155062h(r9, r3)
            r1.f354027e = r3
            ba1.C16777c.m16417i(r1)
            r8.mo36931r(r0, r3, r14)
            m28024v(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f64087d
            r1[r13] = r2
            java.lang.String r2 = r0.f64090g
            r1[r14] = r2
            java.lang.String r2 = "_activityOn8Event: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            m28025w(r0, r9)
            goto L_0x0553
        L_0x02f5:
            if (r9 != 0) goto L_0x02f9
            goto L_0x0553
        L_0x02f9:
            i91.c r0 = i91.C21062c.m23249d()
            te3.t1 r0 = r0.mo32772b(r9)
            if (r0 == 0) goto L_0x032f
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            te3.fh4 r2 = r0.f354392d
            java.lang.String r2 = r2.f354001d
            r1[r13] = r2
            java.lang.String r2 = r0.f354397i
            r1[r14] = r2
            java.lang.String r2 = r0.f354395g
            r6 = 2
            r1[r6] = r2
            java.lang.String r2 = r0.f354396h
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "_activityOn8Event, curAR: %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            java.lang.String r1 = r0.f354395g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x032c
            te3.fh4 r0 = r0.f354392d
            java.lang.String r0 = r0.f354001d
            goto L_0x0333
        L_0x032c:
            java.lang.String r0 = r0.f354395g
            goto L_0x0333
        L_0x032f:
            java.lang.String r0 = e91.C116711b.m164583h(r21)
        L_0x0333:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x033d
            java.lang.String r0 = e91.C116711b.m164583h(r0)
        L_0x033d:
            r8.mo36933t(r0, r3)
            te3.gg2 r1 = ba1.C16777c.m16416h()
            if (r1 != 0) goto L_0x0348
            goto L_0x0553
        L_0x0348:
            ca1.C113264b.m155062h(r9, r3)
            r1.f354027e = r3
            ba1.C16777c.m16417i(r1)
            m28024v(r15)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            byte[] r1 = new byte[r13]
            f91.C116850b.m164834d(r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r13] = r0
            java.lang.String r0 = "_activityOn8Event, 无Session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            goto L_0x0553
        L_0x0366:
            te3.gg2 r0 = ba1.C16777c.m16416h()
            if (r0 != 0) goto L_0x0371
            te3.gg2 r0 = new te3.gg2
            r0.<init>()
        L_0x0371:
            r0.f354026d = r3
            ba1.C16777c.m16417i(r0)
            te3.ka3 r1 = ba1.C16777c.m16413e()
            if (r1 == 0) goto L_0x050d
            boolean r0 = r1.f64096p
            if (r0 == 0) goto L_0x0553
            ga1.a r0 = r8.f67289a
            r0.getClass()
            te3.qp1 r0 = ga1.C20822b.m22817a()
            if (r0 != 0) goto L_0x038d
            r5 = r15
            goto L_0x0390
        L_0x038d:
            te3.eg2 r0 = r0.f64510e
            r5 = r0
        L_0x0390:
            java.lang.String r0 = r1.f64087d
            boolean r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r0)
            java.lang.String r7 = "SessionPair, _read: %s"
            java.lang.String r12 = "HABBYGE-MALI.SessionPairDao"
            java.lang.String r17 = "mmkv_sionpairD_table_hell"
            if (r0 == 0) goto L_0x0427
            if (r5 == 0) goto L_0x0427
            java.lang.String r15 = e91.C116711b.m164583h(r21)
            r14 = 3
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r14 = r5.f353972g
            r0[r13] = r14
            java.lang.String r14 = r5.f353969d
            r18 = 1
            r0[r18] = r14
            r14 = 2
            r0[r14] = r15
            java.lang.String r14 = "activityOn7Event, lstItem: %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r11, r14, r0)
            java.lang.String r0 = r5.f353972g
            boolean r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r0)
            if (r0 == 0) goto L_0x0427
            byte[] r0 = f91.C116850b.m164831a(r17)
            if (r0 == 0) goto L_0x03e9
            int r14 = r0.length
            if (r14 != 0) goto L_0x03cc
            r14 = 1
            goto L_0x03cd
        L_0x03cc:
            r14 = 0
        L_0x03cd:
            if (r14 == 0) goto L_0x03d0
            goto L_0x03e9
        L_0x03d0:
            te3.x14 r14 = new te3.x14
            r14.<init>()
            r14.parseFrom(r0)     // Catch:{ IOException -> 0x03d9 }
            goto L_0x03ea
        L_0x03d9:
            r0 = move-exception
            r14 = r0
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r13 = r14.getMessage()
            r19 = 0
            r0[r19] = r13
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r14, r7, r0)
        L_0x03e9:
            r14 = 0
        L_0x03ea:
            if (r14 == 0) goto L_0x03f3
            boolean r0 = r14.f354530h
            if (r0 != 0) goto L_0x03f1
            goto L_0x03f3
        L_0x03f1:
            r0 = 0
            goto L_0x03f4
        L_0x03f3:
            r0 = 1
        L_0x03f4:
            java.lang.String r13 = r5.f353969d
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto L_0x0416
            java.lang.String r13 = r5.f353969d
            boolean r13 = e91.C116711b.m164586k(r13)
            if (r13 == 0) goto L_0x0406
            if (r0 != 0) goto L_0x0416
        L_0x0406:
            java.lang.String r0 = r5.f353969d
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x0427
            java.lang.String r0 = "WebViewUI"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0427
        L_0x0416:
            r1.f64092i = r3
            r1.f64093j = r3
            r1.f64090g = r2
            r2 = 1
            r1.f64099s = r2
            ba1.C16777c.m16418j(r1)
            r8.mo36930q(r1, r3)
            goto L_0x0553
        L_0x0427:
            if (r5 == 0) goto L_0x0483
            java.lang.String r0 = r1.f64087d
            boolean r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r0)
            if (r0 == 0) goto L_0x0483
            byte[] r0 = f91.C116850b.m164831a(r17)
            if (r0 == 0) goto L_0x0459
            int r2 = r0.length
            if (r2 != 0) goto L_0x043c
            r2 = 1
            goto L_0x043d
        L_0x043c:
            r2 = 0
        L_0x043d:
            if (r2 == 0) goto L_0x0440
            goto L_0x0459
        L_0x0440:
            te3.x14 r2 = new te3.x14
            r2.<init>()
            r2.parseFrom(r0)     // Catch:{ IOException -> 0x044a }
            r15 = r2
            goto L_0x045a
        L_0x044a:
            r0 = move-exception
            r2 = r0
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r13 = r2.getMessage()
            r14 = 0
            r0[r14] = r13
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r2, r7, r0)
        L_0x0459:
            r15 = 0
        L_0x045a:
            if (r15 == 0) goto L_0x0483
            java.lang.String r0 = r5.f353969d
            boolean r0 = e91.C116711b.m164586k(r0)
            if (r0 == 0) goto L_0x0483
            java.lang.String r0 = r1.f64090g
            java.lang.String r2 = "FloatingBall"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0483
            boolean r0 = r15.f354530h
            if (r0 == 0) goto L_0x0483
            te3.ka3 r0 = r15.f354526d
            if (r0 == 0) goto L_0x0483
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "activityOn7Event, floatSession, lastSession: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            te3.ka3 r1 = r15.f354526d
        L_0x0483:
            java.lang.String r0 = e91.C116711b.m164583h(r21)
            boolean r2 = r6.equals(r0)
            if (r2 == 0) goto L_0x049e
            r2 = 0
            java.lang.String r5 = ""
            r1 = r20
            r12 = r3
            r3 = r5
            r4 = r0
            r5 = r22
            r14 = r6
            r6 = r12
            te3.ka3 r1 = r1.mo36927l(r2, r3, r4, r5, r6)
            goto L_0x04a0
        L_0x049e:
            r12 = r3
            r14 = r6
        L_0x04a0:
            java.lang.String r2 = r1.f64090g
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x04c5
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r2 == 0) goto L_0x04b0
            r2 = 0
            goto L_0x04b6
        L_0x04b0:
            java.lang.String r2 = ".plugin.finder."
            boolean r2 = r9.contains(r2)
        L_0x04b6:
            if (r2 != 0) goto L_0x04c5
            r2 = 0
            java.lang.String r3 = r1.f64095o
            r1 = r20
            r4 = r0
            r5 = r22
            r6 = r12
            te3.ka3 r1 = r1.mo36927l(r2, r3, r4, r5, r6)
        L_0x04c5:
            r2 = 0
            r1.f64096p = r2
            r1.f64099s = r2
            r1.f64092i = r12
            java.lang.String r0 = ba1.C16780k.m16423b()
            if (r0 != 0) goto L_0x04d4
            r0 = r16
        L_0x04d4:
            r1.f64102v = r0
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r1.f64090g
            r0[r2] = r3
            r3 = 1
            r0[r3] = r9
            java.lang.String r4 = "activityOn7Event, curSession: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
            ca1.C113264b.m155056b(r1, r9, r10, r12)
            ba1.C16777c.m16418j(r1)
            r8.mo36932s(r1)
            r4 = 4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r1.f64087d
            r0[r2] = r4
            java.lang.String r2 = r1.f64090g
            r0[r3] = r2
            java.lang.String r2 = r1.f64095o
            r3 = 2
            r0[r3] = r2
            int r1 = r1.f64091h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = "_activityOn7Event, curSession: %s, %s, %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            goto L_0x0553
        L_0x050d:
            r12 = r3
            r14 = r6
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            r0[r1] = r9
            java.lang.String r1 = "_activityOn7Event, 无Session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            java.lang.String r4 = e91.C116711b.m164583h(r21)
            boolean r0 = r14.equals(r4)
            if (r0 == 0) goto L_0x0544
            r2 = 0
            java.lang.String r3 = ""
            r1 = r20
            r5 = r22
            r6 = r12
            te3.ka3 r0 = r1.mo36927l(r2, r3, r4, r5, r6)
            r1 = 0
            r0.f64099s = r1
            java.lang.String r1 = ba1.C16780k.m16423b()
            if (r1 != 0) goto L_0x053b
            r1 = r16
        L_0x053b:
            r0.f64102v = r1
            ba1.C16777c.m16409a(r0)
            r8.mo36932s(r0)
            goto L_0x0553
        L_0x0544:
            java.lang.String r0 = "LauncherUI"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0553
            r8.mo36934u(r4, r10, r12)
            r1 = 0
            ca1.C113264b.m155056b(r1, r4, r10, r12)
        L_0x0553:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z91.C23462b.mo36919c(java.lang.String, int, long, int):void");
    }

    /* renamed from: d */
    public String mo36920d() {
        if (!C20449a.m22052d() || !C20449a.m22053e() || C116711b.m164584i() == 0) {
            return "-1";
        }
        C22505ka3 e = C16777c.m16413e();
        if (e != null) {
            return e.f64087d;
        }
        String str = this.f67291c;
        return str == null ? "-2" : str;
    }

    /* renamed from: e */
    public String mo36921e() {
        C22505ka3 e = C16777c.m16413e();
        if (e != null) {
            return C115411b.m162227j(e.f64087d) ? C115411b.m162222e(e) : C115411b.m162219b(e.f64087d);
        }
        String str = null;
        String str2 = this.f67291c;
        if (str2 != null) {
            str = C115411b.m162219b(str2);
        }
        return TextUtils.isEmpty(str) ? "-2" : str;
    }

    /* renamed from: g */
    public final Pair<String, String> mo36922g(C22505ka3 ka32, C22505ka3 ka33, C118434gg2 gg22) {
        int size = gg22.f354030h.size();
        if (ka32 == null && ka33 == null) {
            if (size <= 0) {
                return null;
            }
            if (size < 2) {
                C118430fa3 last = gg22.f354030h.getLast();
                return Pair.create(last.f353996j + "_" + last.f353993g, (Object) null);
            } else if (size == 2) {
                C118430fa3 last2 = gg22.f354030h.getLast();
                C118430fa3 fa32 = gg22.f354030h.get(0);
                return Pair.create(last2.f353996j + "_" + last2.f353993g, fa32.f353996j + "_" + fa32.f353993g);
            } else {
                C118430fa3 last3 = gg22.f354030h.getLast();
                int i = size - 2;
                for (int i2 = i; i2 >= 0; i2--) {
                    C118430fa3 fa33 = gg22.f354030h.get(i2);
                    if (!last3.f353996j.equals(fa33.f353996j)) {
                        return Pair.create(last3.f353996j + "_" + last3.f353993g, fa33.f353996j + "_" + fa33.f353993g);
                    }
                }
                C118430fa3 fa34 = gg22.f354030h.get(i);
                return Pair.create(last3.f353996j + "_" + last3.f353993g, fa34.f353996j + "_" + fa34.f353993g);
            }
        } else if (ka32 == null || ka33 != null) {
            if (ka32 == null) {
                return null;
            }
            if (size <= 0) {
                return Pair.create(ka32.f64087d, ka33.f64087d);
            }
            if (size < 2) {
                C118430fa3 last4 = gg22.f354030h.getLast();
                long j = last4.f353993g;
                if (j > ka32.f64092i) {
                    return Pair.create(last4.f353996j + "_" + last4.f353993g, ka32.f64087d);
                } else if (j <= ka33.f64092i) {
                    return Pair.create(ka32.f64087d, ka33.f64087d);
                } else {
                    return Pair.create(ka32.f64087d, last4.f353996j + "_" + last4.f353993g);
                }
            } else {
                C118430fa3 last5 = gg22.f354030h.getLast();
                C118430fa3 fa35 = gg22.f354030h.get(size - 2);
                long j2 = last5.f353993g;
                long j3 = ka32.f64092i;
                if (j2 <= j3) {
                    if (j2 <= ka33.f64092i) {
                        return Pair.create(ka32.f64087d, ka33.f64087d);
                    }
                    return Pair.create(ka32.f64087d, last5.f353996j + "_" + last5.f353993g);
                } else if (j3 >= fa35.f353993g) {
                    return Pair.create(last5.f353996j + "_" + last5.f353993g, ka32.f64087d);
                } else {
                    return Pair.create(last5.f353996j + "_" + last5.f353993g, fa35.f353996j + "_" + fa35.f353993g);
                }
            }
        } else if (size <= 0) {
            return Pair.create(ka32.f64087d, (Object) null);
        } else {
            if (size < 2) {
                C118430fa3 last6 = gg22.f354030h.getLast();
                if (last6.f353993g <= ka32.f64092i) {
                    return Pair.create(ka32.f64087d, last6.f353996j + "_" + last6.f353993g);
                }
                return Pair.create(last6.f353996j + "_" + last6.f353993g, ka32.f64087d);
            } else if (size == 2) {
                C118430fa3 last7 = gg22.f354030h.getLast();
                C118430fa3 fa36 = gg22.f354030h.get(size - 2);
                long j4 = last7.f353993g;
                long j5 = ka32.f64092i;
                if (j4 <= j5) {
                    return Pair.create(ka32.f64087d, last7.f353996j + "_" + last7.f353993g);
                } else if (fa36.f353993g <= j5) {
                    return Pair.create(last7.f353996j + "_" + last7.f353993g, ka32.f64087d);
                } else {
                    return Pair.create(last7.f353996j + "_" + last7.f353993g, fa36.f353996j + "_" + fa36.f353993g);
                }
            } else {
                C118430fa3 last8 = gg22.f354030h.getLast();
                if (last8.f353993g <= ka32.f64092i) {
                    return Pair.create(ka32.f64087d, last8.f353996j + "_" + last8.f353993g);
                }
                int i3 = size - 2;
                C118430fa3 fa37 = gg22.f354030h.get(i3);
                if (fa37.f353993g <= ka32.f64092i) {
                    return Pair.create(last8.f353996j + "_" + last8.f353993g, ka32.f64087d);
                } else if (!last8.f353996j.equals(fa37.f353996j)) {
                    return Pair.create(last8.f353996j + "_" + last8.f353993g, fa37.f353996j + "_" + fa37.f353993g);
                } else {
                    while (i3 >= 0) {
                        C118430fa3 fa38 = gg22.f354030h.get(i3);
                        if (fa38.f353996j.equals(last8.f353996j)) {
                            if (fa38.f353993g <= ka32.f64092i) {
                                return Pair.create(last8.f353996j + "_" + last8.f353993g, ka32.f64087d);
                            }
                            i3--;
                        } else if (fa38.f353993g <= ka32.f64092i) {
                            return Pair.create(last8.f353996j + "_" + last8.f353993g, ka32.f64087d);
                        } else {
                            return Pair.create(last8.f353996j + "_" + last8.f353993g, fa38.f353996j + "_" + fa38.f353993g);
                        }
                    }
                    return Pair.create(last8.f353996j + "_" + last8.f353993g, ka32.f64087d);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0645, code lost:
        if ("148".equals(r13) != false) goto L_0x064a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0767  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07f7  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x082c  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08f2  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0919  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ca  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36923h(android.app.Activity r24, te3.C118467t1 r25, int r26, te3.C118467t1 r27) {
        /*
            r23 = this;
            r7 = r23
            r8 = r25
            r9 = r26
            r0 = r27
            boolean r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162220c()
            java.lang.String r10 = "HABBYGE-MALI.HellSessionMonitor"
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "HellSessionMonitor, monitor, needSessionMonitor: FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return
        L_0x0016:
            if (r8 != 0) goto L_0x0019
            return
        L_0x0019:
            r11 = 1
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r12 = 0
            r1[r12] = r2
            java.lang.String r2 = "HellSessionMonitor monitor: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            java.lang.String r13 = "ChattingUIFragment"
            java.lang.String r1 = "142"
            java.lang.String r14 = "FinderHomeAffinityUI"
            r2 = 3
            r5 = 2
            if (r9 == 0) goto L_0x0229
            if (r9 == r11) goto L_0x0229
            if (r9 == r5) goto L_0x0229
            if (r9 == r2) goto L_0x0229
            r4 = 4
            r6 = 5
            if (r9 == r4) goto L_0x004f
            if (r9 == r6) goto L_0x004f
            r1 = 7
            if (r9 == r1) goto L_0x0043
            goto L_0x093c
        L_0x0043:
            long r1 = r8.f354398j
            r7.mo36924i(r9, r0, r1)
            java.lang.String r0 = "monitor, session end: ChattingUIFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x093c
        L_0x004f:
            te3.fh4 r15 = r8.f354392d
            java.lang.String r15 = r15.f354001d
            java.lang.String r15 = e91.C116711b.m164583h(r15)
            if (r9 != r4) goto L_0x0078
            java.lang.String r3 = r8.f354395g
            java.lang.String r3 = e91.C116711b.m164583h(r3)
            java.lang.String r4 = r8.f354396h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            java.lang.String r4 = r0.f354396h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x008b
            java.lang.String r4 = r0.f354396h
            java.lang.String r4 = e91.C116711b.m164583h(r4)
            goto L_0x008c
        L_0x0078:
            if (r9 != r6) goto L_0x008a
            java.lang.String r3 = r8.f354396h
            java.lang.String r3 = e91.C116711b.m164583h(r3)
            java.lang.Object[] r4 = new java.lang.Object[r11]
            r4[r12] = r3
            java.lang.String r6 = "_getCurLastFragment, EVENT_FRAGMENT_OUT: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r4)
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r4 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r15 = r4
        L_0x0090:
            op3.b r3 = op3.C117882j.m166284c(r3, r15)
            r7.f67292d = r9
            java.lang.Object r4 = r3.mo182596a(r12)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.mo182596a(r11)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r12] = r4
            r2[r11] = r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r2[r5] = r6
            java.lang.String r6 = "monitorFragment: %s, %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r2)
            te3.ka3 r2 = ba1.C16777c.m16413e()
            java.lang.String r6 = "155"
            r15 = 4
            if (r9 != r15) goto L_0x01ca
            java.lang.String r4 = e91.C116711b.m164583h(r4)
            te3.ka3 r15 = r7.f67298j
            java.lang.String r5 = "996"
            if (r15 == 0) goto L_0x00dc
            java.lang.String r15 = r15.f64090g
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00dc
            java.lang.String r14 = r7.f67291c
            boolean r14 = r14.startsWith(r5)
            if (r14 == 0) goto L_0x00dc
            te3.ka3 r14 = r7.f67299k
            if (r14 == 0) goto L_0x00dc
            r14 = 0
            goto L_0x00dd
        L_0x00dc:
            r14 = 1
        L_0x00dd:
            boolean r15 = r13.equals(r4)
            r12 = 6
            if (r15 == 0) goto L_0x00f2
            if (r14 == 0) goto L_0x00f2
            java.lang.String r1 = "monitorFragment, EVENT_CHATTINGUIFRAGMENT_IN"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            long r1 = r8.f354398j
            r7.mo36924i(r12, r0, r1)
            goto L_0x020d
        L_0x00f2:
            if (r2 == 0) goto L_0x00fe
            java.lang.String r14 = r2.f64087d
            boolean r1 = r14.startsWith(r1)
            if (r1 == 0) goto L_0x00fe
            goto L_0x0214
        L_0x00fe:
            if (r2 == 0) goto L_0x0108
            java.lang.String r1 = r8.f354395g
            boolean r1 = t91.C64208c.m75547a(r1)
            if (r1 != 0) goto L_0x0114
        L_0x0108:
            te3.ka3 r1 = r7.f67299k
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = r8.f354395g
            boolean r1 = t91.C64208c.m75547a(r1)
            if (r1 == 0) goto L_0x011f
        L_0x0114:
            java.lang.String r0 = r8.f354395g
            int r1 = r8.f354399n
            long r3 = r8.f354398j
            ca1.C113264b.m155056b(r2, r0, r1, r3)
            goto L_0x0214
        L_0x011f:
            if (r2 == 0) goto L_0x014b
            java.lang.String r1 = r2.f64087d
            if (r1 == 0) goto L_0x014b
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = r8.f354395g
            boolean r1 = e91.C116711b.m164588m(r1)
            if (r1 == 0) goto L_0x014b
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x014b
            int r1 = r7.f67292d
            if (r1 != r9) goto L_0x014b
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r2.f64087d
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "finder muil monitorFragment error sid[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r1, r0)
            goto L_0x0214
        L_0x014b:
            java.lang.String r1 = r8.f354395g
            int r3 = r8.f354399n
            long r14 = r8.f354398j
            r4 = 0
            ca1.C113264b.m155056b(r4, r1, r3, r14)
            if (r2 != 0) goto L_0x018f
            java.lang.String r1 = r8.f354395g
            java.lang.String r1 = e91.C116711b.m164583h(r1)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = 0
            r2[r3] = r1
            java.lang.String r3 = "monitorFragment, curSession == null: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x0174
            long r1 = r8.f354398j
            r7.mo36924i(r12, r0, r1)
            goto L_0x020d
        L_0x0174:
            androidx.fragment.app.FragmentActivity r0 = e91.C116711b.m164582g()
            java.lang.String r1 = r8.f354395g
            androidx.fragment.app.Fragment r0 = l91.C117467h.m165691f(r0, r1)
            if (r0 != 0) goto L_0x0182
            r0 = 0
            goto L_0x0186
        L_0x0182:
            int r0 = r0.hashCode()
        L_0x0186:
            java.lang.String r1 = r8.f354395g
            long r2 = r8.f354398j
            r7.mo36934u(r1, r0, r2)
            goto L_0x020d
        L_0x018f:
            java.lang.String r0 = r8.f354395g
            boolean r0 = e91.C116711b.m164588m(r0)
            if (r0 == 0) goto L_0x020d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r8.f354395g
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "curAR.currFragment: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.String r0 = r7.f67291c
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x01b0
            long r0 = r8.f354398j
            r7.mo36931r(r2, r0, r3)
        L_0x01b0:
            androidx.fragment.app.FragmentActivity r0 = e91.C116711b.m164582g()
            java.lang.String r1 = r8.f354395g
            androidx.fragment.app.Fragment r0 = l91.C117467h.m165691f(r0, r1)
            if (r0 != 0) goto L_0x01be
            r0 = 0
            goto L_0x01c2
        L_0x01be:
            int r0 = r0.hashCode()
        L_0x01c2:
            java.lang.String r1 = r8.f354395g
            long r2 = r8.f354398j
            r7.mo36934u(r1, r0, r2)
            goto L_0x020d
        L_0x01ca:
            r0 = 5
            if (r9 != r0) goto L_0x020d
            if (r2 == 0) goto L_0x01d2
            java.lang.String r0 = r2.f64102v
            goto L_0x01d4
        L_0x01d2:
            java.lang.String r0 = "-1"
        L_0x01d4:
            boolean r1 = r13.equals(r4)
            if (r1 == 0) goto L_0x01e0
            boolean r0 = r0.startsWith(r6)
            if (r0 == 0) goto L_0x01e6
        L_0x01e0:
            boolean r0 = t91.C64208c.m75547a(r4)
            if (r0 == 0) goto L_0x01f1
        L_0x01e6:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r1 = 0
            r0[r1] = r4
            java.lang.String r1 = "monitorFragment, out event, no need handle, curFragment=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            goto L_0x0214
        L_0x01f1:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            java.lang.String r0 = r0.mo175246c()
            boolean r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r0)
            if (r0 == 0) goto L_0x0208
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r1 = 0
            r0[r1] = r4
            java.lang.String r1 = "isFloatSession, out event, no need handle, curFragment=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            goto L_0x0214
        L_0x0208:
            long r0 = r8.f354398j
            r7.mo36933t(r4, r0)
        L_0x020d:
            int r0 = r7.f67293e
            r1 = -1
            if (r0 == r1) goto L_0x0214
            r7.f67293e = r1
        L_0x0214:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r8.f354395g
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r11] = r1
            java.lang.String r1 = "monitor, fragment: %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            goto L_0x093c
        L_0x0229:
            r4 = 0
            te3.fh4 r3 = r8.f354392d
            java.lang.String r3 = r3.f354001d
            java.lang.String r3 = e91.C116711b.m164583h(r3)
            java.lang.String r5 = "ChattingUI"
            boolean r3 = r5.equals(r3)
            r6 = 101(0x65, float:1.42E-43)
            r12 = 100
            java.lang.String r15 = "com.tencent.mm.ui.chatting.ChattingUI"
            if (r3 == 0) goto L_0x03c5
            te3.fh4 r0 = r8.f354392d
            int r1 = r0.f354002e
            long r3 = r0.f354003f
            if (r9 == 0) goto L_0x0325
            if (r9 == r11) goto L_0x0251
            r0 = 2
            if (r9 == r0) goto L_0x0251
            if (r9 == r2) goto L_0x0251
            goto L_0x05b9
        L_0x0251:
            te3.ka3 r0 = ba1.C16777c.m16413e()
            if (r0 != 0) goto L_0x025e
            java.lang.String r0 = "_chattingUIOut, 不是合法session !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x05b9
        L_0x025e:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = r0.f64087d
            r6 = 0
            r1[r6] = r2
            java.lang.String r2 = "_chattingUIOut, curSessionId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            java.lang.String r1 = r0.f64087d
            boolean r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162227j(r1)
            if (r1 != 0) goto L_0x02a0
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = r0.f64087d
            r1[r6] = r2
            java.lang.String r2 = "_chattingUIOut, not chat session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            i91.c r1 = i91.C21062c.m23249d()
            te3.t1 r1 = r1.mo32776g()
            if (r1 == 0) goto L_0x05b9
            te3.fh4 r2 = r1.f354392d
            java.lang.String r2 = r2.f354001d
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r6] = r2
            java.lang.String r12 = "_chattingUIOut, not chat session, page: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r5)
            r5 = 2
            if (r9 == r5) goto L_0x05b9
            te3.fh4 r1 = r1.f354392d
            int r1 = r1.f354002e
            ca1.C113264b.m155056b(r0, r2, r1, r3)
            goto L_0x05b9
        L_0x02a0:
            op3.b r1 = z91.C119088a.m167881b()
            java.lang.Object r2 = r1.mo182596a(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r6] = r2
            java.lang.String r2 = "_chattingUIOut, userName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r12)
            java.lang.Object r1 = r1.mo182596a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 2
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r12[r6] = r2
            int r2 = r0.f64091h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r11] = r2
            java.lang.String r2 = "_chattingUIOut, newChattingType: %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r12)
            int r2 = r0.f64091h
            if (r1 != r2) goto L_0x0315
            java.lang.String r1 = r0.f64090g
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x02e9
            java.lang.String r1 = "chattingUIOut, CHATTING_UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r7.mo36930q(r0, r3)
            goto L_0x05b9
        L_0x02e9:
            r1 = 2
            if (r9 != r1) goto L_0x02fd
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = r0.f64090g
            r5 = 0
            r1[r5] = r2
            java.lang.String r2 = "chattingUIOut, SLIENCE: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            r7.mo36930q(r0, r3)
            goto L_0x05b9
        L_0x02fd:
            i91.c r1 = i91.C21062c.m23249d()
            te3.t1 r1 = r1.mo32776g()
            if (r1 == 0) goto L_0x05b9
            te3.fh4 r1 = r1.f354392d
            java.lang.String r2 = r1.f354001d
            int r1 = r1.f354002e
            ca1.C113264b.m155056b(r0, r2, r1, r3)
            ba1.C16777c.m16418j(r0)
            goto L_0x05b9
        L_0x0315:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "_chattingUIOut, curChattingType不等: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r1, r0)
            goto L_0x05b9
        L_0x0325:
            te3.ka3 r0 = ba1.C16777c.m16413e()
            if (r0 != 0) goto L_0x0365
            java.lang.String r0 = k91.C117394e.m165536b(r12)
            java.lang.String r2 = k91.C117394e.m165536b(r6)
            r5 = 102(0x66, float:1.43E-43)
            java.lang.String r5 = k91.C117394e.m165536b(r5)
            r6 = 104(0x68, float:1.46E-43)
            java.lang.String r6 = k91.C117394e.m165536b(r6)
            java.lang.String r12 = "com.tencent.mm.ui.contact.SelectContactUI"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x035e
            boolean r0 = r15.equals(r2)
            if (r0 == 0) goto L_0x035e
            boolean r0 = r12.equals(r5)
            if (r0 == 0) goto L_0x035e
            boolean r0 = r15.equals(r6)
            if (r0 == 0) goto L_0x035e
            r7.mo36926k(r1, r3)
            goto L_0x05b9
        L_0x035e:
            java.lang.String r0 = "chattingUIIn, 不是合法session !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x05b9
        L_0x0365:
            java.lang.String r2 = r0.f64087d
            java.lang.String r2 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r2)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r6 = 0
            r5[r6] = r2
            java.lang.String r12 = "chattingUIIn, curSessionId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r5)
            boolean r2 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162227j(r2)
            if (r2 != 0) goto L_0x0380
            ca1.C113264b.m155056b(r0, r15, r1, r3)
            goto L_0x05b9
        L_0x0380:
            op3.b r2 = z91.C119088a.m167881b()
            java.lang.Object r5 = r2.mo182596a(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r6] = r5
            java.lang.String r5 = "chattingUIIn, userName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r12)
            java.lang.Object r2 = r2.mo182596a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r5[r6] = r12
            java.lang.String r6 = "chattingUIIn, newChattingType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r5)
            int r5 = r0.f64091h
            if (r2 != r5) goto L_0x03b8
            java.lang.String r2 = "chattingUIIn, newChattingType same !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            ca1.C113264b.m155056b(r0, r15, r1, r3)
            goto L_0x05b9
        L_0x03b8:
            java.lang.String r2 = "chattingUIIn, newChattingType difference !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r7.mo36930q(r0, r3)
            r7.mo36926k(r1, r3)
            goto L_0x05b9
        L_0x03c5:
            te3.fh4 r3 = r8.f354392d
            long r4 = r3.f354003f
            java.lang.String r6 = "LauncherUI"
            if (r9 == 0) goto L_0x06fe
            if (r9 == r11) goto L_0x03d6
            r0 = 2
            if (r9 == r0) goto L_0x03d6
            if (r9 == r2) goto L_0x03d6
            goto L_0x05b9
        L_0x03d6:
            te3.ka3 r0 = ba1.C16777c.m16413e()
            if (r0 != 0) goto L_0x03e3
            java.lang.String r0 = "_activityOut, 不是合法session !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x05b9
        L_0x03e3:
            te3.fh4 r3 = r8.f354392d
            java.lang.String r3 = r3.f354001d
            java.lang.String r3 = e91.C116711b.m164583h(r3)
            if (r3 != 0) goto L_0x03ef
            goto L_0x05b9
        L_0x03ef:
            java.lang.String r13 = r0.f64087d
            java.lang.String r13 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162219b(r13)
            r14 = 2
            java.lang.Object[] r12 = new java.lang.Object[r14]
            r14 = 0
            r12[r14] = r13
            r12[r11] = r3
            java.lang.String r14 = "activityOut, curSesssion: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r12)
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r12 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            if (r13 != 0) goto L_0x0408
            r12 = 0
            goto L_0x0412
        L_0x0408:
            java.lang.String r12 = r12.mo175244a(r13)
            java.lang.String r14 = "105"
            boolean r12 = gy3.C87412m.m108589b(r14, r12)
        L_0x0412:
            if (r12 != 0) goto L_0x0427
            java.lang.String r12 = "131"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0427
            java.lang.String r12 = "144"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0425
            goto L_0x0427
        L_0x0425:
            r12 = 0
            goto L_0x0428
        L_0x0427:
            r12 = 1
        L_0x0428:
            if (r12 == 0) goto L_0x04e4
            java.lang.String r12 = r0.f64098r
            java.lang.String r12 = e91.C116711b.m164583h(r12)
            java.lang.String r14 = "AppBrandLauncherUI"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x045c
            java.lang.String r1 = e91.C116711b.m164583h(r3)
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L_0x0447
            r7.mo36930q(r0, r4)
            goto L_0x05b9
        L_0x0447:
            i91.c r1 = i91.C21062c.m23249d()
            te3.t1 r1 = r1.mo32776g()
            if (r1 == 0) goto L_0x05b9
            te3.fh4 r1 = r1.f354392d
            java.lang.String r2 = r1.f354001d
            int r1 = r1.f354002e
            ca1.C113264b.m155056b(r0, r2, r1, r4)
            goto L_0x05b9
        L_0x045c:
            java.lang.String r12 = "AppBrandLaunchProxyUI"
            boolean r14 = r12.equals(r3)
            if (r14 == 0) goto L_0x046b
            java.lang.String r0 = "_activityOut, AppBrandLaunchProxyUI out ~~"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x05b9
        L_0x046b:
            r14 = 2
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r14 = 0
            r2[r14] = r3
            java.lang.String r14 = r0.f64098r
            r2[r11] = r14
            java.lang.String r14 = "_activityOut, AppBrand cur: %s, start: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r2)
            boolean r2 = e91.C116711b.m164586k(r3)
            if (r2 == 0) goto L_0x048d
            java.lang.String r2 = r0.f64098r
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x048d
            r7.mo36930q(r0, r4)
            goto L_0x05b9
        L_0x048d:
            boolean r2 = e91.C116711b.m164586k(r3)
            if (r2 == 0) goto L_0x049f
            java.lang.String r2 = r0.f64098r
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x049f
            r7.mo36930q(r0, r4)
            goto L_0x04e4
        L_0x049f:
            i91.c r2 = i91.C21062c.m23249d()
            te3.t1 r2 = r2.mo32776g()
            if (r2 == 0) goto L_0x04b8
            java.lang.Object[] r12 = new java.lang.Object[r11]
            te3.fh4 r14 = r2.f354392d
            java.lang.String r14 = r14.f354001d
            r18 = 0
            r12[r18] = r14
            java.lang.String r14 = "_activityOut, dstAR: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r12)
        L_0x04b8:
            boolean r12 = e91.C116711b.m164586k(r3)
            if (r12 == 0) goto L_0x04cf
            if (r2 == 0) goto L_0x04cf
            te3.fh4 r12 = r2.f354392d
            java.lang.String r12 = r12.f354001d
            boolean r12 = e91.C116711b.m164587l(r12)
            if (r12 == 0) goto L_0x04cf
            r7.mo36930q(r0, r4)
            goto L_0x05b9
        L_0x04cf:
            if (r2 == 0) goto L_0x04e4
            te3.fh4 r12 = r2.f354392d
            java.lang.String r12 = r12.f354001d
            boolean r12 = e91.C116711b.m164587l(r12)
            if (r12 != 0) goto L_0x04e4
            te3.fh4 r2 = r2.f354392d
            java.lang.String r12 = r2.f354001d
            int r2 = r2.f354002e
            ca1.C113264b.m155056b(r0, r12, r2, r4)
        L_0x04e4:
            java.lang.String r2 = "132"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x051a
            java.lang.String r2 = "GameCenterUI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x04fb
            java.lang.String r0 = "_activityOut, GameCenterUI out ~~"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x05b9
        L_0x04fb:
            java.lang.String r2 = "GameWebViewUI"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x050b
            java.lang.String r2 = "LuggageGameWebViewUI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x051a
        L_0x050b:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = "_activityOut, GameWebViewUI: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            r7.mo36930q(r0, r4)
            goto L_0x05b9
        L_0x051a:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0525
            java.lang.String r1 = "_activityOut, StoryGallery Session(142)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x0525:
            java.lang.String r1 = "110"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0558
            java.lang.String r1 = "WalletOfflineCoinPurseUI"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0551
            java.lang.String r1 = "WalletOfflineEntranceUI"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0551
            i91.c r1 = i91.C21062c.m23249d()
            te3.t1 r1 = r1.mo32776g()
            if (r1 == 0) goto L_0x05b9
            te3.fh4 r1 = r1.f354392d
            java.lang.String r2 = r1.f354001d
            int r1 = r1.f354002e
            ca1.C113264b.m155056b(r0, r2, r1, r4)
            goto L_0x05b9
        L_0x0551:
            r1 = 2
            if (r9 == r1) goto L_0x05b9
            r7.mo36930q(r0, r4)
            goto L_0x05b9
        L_0x0558:
            r1 = 2
            java.lang.String r2 = r8.f354397i
            if (r2 == 0) goto L_0x0585
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0585
            java.lang.String r2 = r8.f354397i
            java.lang.String r2 = e91.C116711b.m164583h(r2)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r14 = 0
            r12[r14] = r2
            java.lang.Integer r16 = java.lang.Integer.valueOf(r26)
            r12[r11] = r16
            java.lang.String r11 = "_activityOut, nextActivity: %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            if (r9 == r1) goto L_0x0586
            boolean r1 = r6.equals(r2)
            if (r1 != 0) goto L_0x0586
            ca1.C113264b.m155056b(r0, r2, r14, r4)
            goto L_0x0586
        L_0x0585:
            r2 = 0
        L_0x0586:
            java.lang.String r1 = r0.f64090g
            boolean r1 = r3.equals(r1)
            java.lang.String r11 = "WebViewUI"
            if (r1 != 0) goto L_0x05bd
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = r0.f64087d
            r6 = 1
            r1[r6] = r2
            java.lang.String r2 = r0.f64090g
            r6 = 2
            r1[r6] = r2
            java.lang.String r2 = "_activityOut, curActivity: %s is not curSession: %s preActivity %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            boolean r1 = fa1.C20696a.m22649a(r13)
            if (r1 == 0) goto L_0x05b9
            boolean r1 = r11.equals(r3)
            if (r1 == 0) goto L_0x05b9
            java.lang.String r1 = "HellSessionMonitor, isScanSession true !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r7.mo36930q(r0, r4)
        L_0x05b9:
            r11 = r8
        L_0x05ba:
            r6 = 2
            goto L_0x084a
        L_0x05bd:
            boolean r1 = r11.equals(r3)
            if (r1 == 0) goto L_0x0648
            java.lang.String r1 = "minimize_secene"
            java.lang.String r11 = k91.C117393b.m165534c(r1)
            java.lang.String r12 = "KPublisherId"
            java.lang.String r14 = k91.C117393b.m165534c(r12)
            r21 = r4
            r8 = 2
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r5 = 0
            r4[r5] = r11
            r5 = 1
            r4[r5] = r14
            java.lang.String r5 = "_activityOut, WebViewUI: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            te3.ga3 r4 = r0.f64094n
            if (r4 == 0) goto L_0x0630
            java.util.LinkedList<te3.zl2> r4 = r4.f354025d
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r8 = 0
        L_0x05eb:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x0632
            java.lang.Object r11 = r4.next()
            te3.zl2 r11 = (te3.C118484zl2) r11
            if (r11 != 0) goto L_0x05fc
            r24 = r1
            goto L_0x062d
        L_0x05fc:
            java.lang.String r14 = r11.f354630d
            boolean r14 = r1.equals(r14)
            r24 = r1
            if (r14 == 0) goto L_0x0617
            r14 = 1
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r14 = r11.f354631e
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x0617
            r8 = 1
            if (r5 == 0) goto L_0x062d
            goto L_0x0632
        L_0x0617:
            java.lang.String r1 = r11.f354630d
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L_0x062d
            java.lang.String r1 = r11.f354631e
            java.lang.String r11 = "jd_store"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x062d
            r5 = 1
            if (r8 == 0) goto L_0x062d
            goto L_0x0632
        L_0x062d:
            r1 = r24
            goto L_0x05eb
        L_0x0630:
            r5 = 0
            r8 = 0
        L_0x0632:
            if (r8 == 0) goto L_0x0638
            if (r5 == 0) goto L_0x0638
            r1 = 1
            goto L_0x0639
        L_0x0638:
            r1 = 0
        L_0x0639:
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x064b
            java.lang.String r2 = "148"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x064b
            goto L_0x064a
        L_0x0648:
            r21 = r4
        L_0x064a:
            r1 = 1
        L_0x064b:
            if (r1 == 0) goto L_0x06fa
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4 = 0
            r2[r4] = r3
            java.lang.String r5 = "HellSessionMonitor, isStartPageOfSession true: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r2)
            boolean r2 = fa1.C20696a.m22649a(r13)
            if (r2 == 0) goto L_0x06a2
            boolean r2 = y91.C118948a.f356270c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r5[r4] = r1
            java.lang.String r1 = "HellSessionMonitor, scan session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r1, r5)
            if (r2 == 0) goto L_0x06fa
            y91.C118948a.f356270c = r4
            i91.c r1 = i91.C21062c.m23249d()
            te3.t1 r1 = r1.mo32776g()
            te3.fh4 r1 = r1.f354392d
            java.lang.String r1 = r1.f354001d
            java.lang.String r1 = e91.C116711b.m164583h(r1)
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r3
            r2 = 1
            r5[r2] = r1
            java.lang.String r2 = "scan session: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r5)
            java.lang.String r2 = "BaseScanUI"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x06fa
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x06fa
            java.lang.String r1 = "BaseScanUI, LauncherUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x06a2:
            java.lang.String r1 = "ContactInfoUI"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x06e7
            java.lang.String r1 = "122"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x06e7
            r1 = 2
            if (r9 != r1) goto L_0x06e7
            java.lang.String r2 = "HellSessionMonitor, EVENT_ACTIVITY_OUT_SLIENCE: ContactInfoUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r2 = 100
            java.lang.String r2 = k91.C117394e.m165536b(r2)
            r4 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = k91.C117394e.m165536b(r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r5[r1] = r2
            r1 = 1
            r5[r1] = r4
            java.lang.String r1 = "HellSessionMonitor, from: %s, to: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r5)
            java.lang.String r1 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x06e7
            boolean r1 = r15.equals(r4)
            if (r1 == 0) goto L_0x06e7
            java.lang.String r0 = "ContactInfoUI->ChattingUI YES"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x06fa
        L_0x06e7:
            java.lang.String r1 = "FinderSelfUI"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x06f5
            java.lang.String r0 = "123-session -> 60s finder share path..."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x06fa
        L_0x06f5:
            r1 = r21
            r7.mo36930q(r0, r1)
        L_0x06fa:
            r11 = r25
            goto L_0x05ba
        L_0x06fe:
            r1 = r4
            java.lang.String r3 = r3.f354001d
            java.lang.String r8 = e91.C116711b.m164583h(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r8
            java.lang.String r3 = "activityIn, curActivityName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r4)
            r11 = r25
            te3.fh4 r3 = r11.f354392d
            long r3 = r3.f354003f
            r19 = 0
            int r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r5 > 0) goto L_0x071e
            r4 = r1
            goto L_0x071f
        L_0x071e:
            r4 = r3
        L_0x071f:
            te3.ka3 r12 = ba1.C16777c.m16413e()
            java.lang.String r1 = r11.f354396h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r15 = ""
            if (r1 != 0) goto L_0x0740
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = r11.f354396h
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "getLastPageName, curAR.lastPageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.String r0 = r11.f354396h
        L_0x073c:
            r16 = 0
            goto L_0x07f1
        L_0x0740:
            if (r0 == 0) goto L_0x0760
            java.lang.String r1 = r0.f354395g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0751
            java.lang.String r0 = r0.f354395g
            java.lang.String r0 = e91.C116711b.m164583h(r0)
            goto L_0x0761
        L_0x0751:
            java.lang.String r1 = r0.f354396h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0760
            java.lang.String r0 = r0.f354395g
            java.lang.String r0 = e91.C116711b.m164583h(r0)
            goto L_0x0761
        L_0x0760:
            r0 = 0
        L_0x0761:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0773
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r1 = "getLastPageName, lnARA, lastPageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            goto L_0x073c
        L_0x0773:
            k91.c r0 = k91.C21316c.m23893a()
            k91.a r0 = r0.f60219a
            k91.d r0 = (k91.C21317d) r0
            te3.q1 r0 = r0.mo33321a()
            if (r0 != 0) goto L_0x0782
            goto L_0x078a
        L_0x0782:
            java.lang.String r1 = r0.f64472p
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x078c
        L_0x078a:
            r3 = 0
            goto L_0x078e
        L_0x078c:
            java.lang.String r3 = r0.f64472p
        L_0x078e:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            java.lang.String r2 = "getLastPageName, lastPageName-1: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            boolean r1 = e91.C116711b.m164587l(r3)
            if (r1 == 0) goto L_0x07d9
            i91.c r1 = i91.C21062c.m23249d()
            te3.t1 r1 = r1.mo32776g()
            if (r1 == 0) goto L_0x07d4
            java.lang.String r2 = r1.f354395g
            java.lang.String r2 = e91.C116711b.m164583h(r2)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r16 = 0
            r3[r16] = r2
            java.lang.String r0 = "getLastPageName, lastPageName-2: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x07d1
            java.lang.String r0 = r1.f354396h
            java.lang.String r0 = e91.C116711b.m164583h(r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r16] = r0
            java.lang.String r3 = "activityIn, lastPageName-3: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            goto L_0x07e0
        L_0x07d1:
            r1 = 1
            r0 = r2
            goto L_0x07e0
        L_0x07d4:
            r1 = 1
            r16 = 0
            r0 = r3
            goto L_0x07e0
        L_0x07d9:
            r1 = 1
            r16 = 0
            java.lang.String r0 = e91.C116711b.m164583h(r3)
        L_0x07e0:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r16] = r0
            java.lang.String r1 = "getLastPageName, lastPageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x07f1
            java.lang.String r0 = "MainUI"
        L_0x07f1:
            java.lang.String r3 = e91.C116711b.m164583h(r0)
            if (r12 != 0) goto L_0x082c
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r16] = r8
            r1 = 1
            r0[r1] = r3
            java.lang.String r1 = "_activityIn, newSession: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            te3.fh4 r0 = r11.f354392d
            int r12 = r0.f354002e
            r0 = r23
            r1 = r24
            r13 = 2
            r2 = r3
            r3 = r8
            r16 = r4
            r4 = r12
            r12 = r6
            r5 = r16
            te3.ka3 r0 = r0.mo36927l(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0822
            java.lang.String r0 = "_activityIn, illegal session ~~~"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x05ba
        L_0x0822:
            r19 = r10
            r10 = r12
            r20 = r15
            r1 = r16
        L_0x0829:
            r12 = r0
            goto L_0x08dc
        L_0x082c:
            r16 = r4
            r5 = r6
            r0 = 3
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r12.f64087d
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            r0[r6] = r8
            java.lang.String r1 = "_activityIn, curSession: %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.lang.String r0 = r12.f64087d
            boolean r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.m162229l(r0)
            if (r0 == 0) goto L_0x084d
        L_0x084a:
            r3 = r10
            goto L_0x0915
        L_0x084d:
            boolean r0 = e91.C116711b.m164590o(r3)
            java.lang.String r4 = "FinderMultiTaskRouterUI"
            if (r0 != 0) goto L_0x086b
            boolean r0 = r14.equals(r8)
            if (r0 != 0) goto L_0x086b
            boolean r0 = r4.equals(r8)
            if (r0 == 0) goto L_0x0862
            goto L_0x086b
        L_0x0862:
            r19 = r10
            r20 = r15
            r1 = r16
            r10 = r5
            goto L_0x08e0
        L_0x086b:
            te3.fh4 r0 = r11.f354392d
            int r2 = r0.f354002e
            r0 = r23
            r1 = r24
            r19 = r2
            r2 = r3
            r9 = r3
            r3 = r8
            r20 = r15
            r15 = r4
            r4 = r19
            r19 = r10
            r10 = r5
            r5 = r16
            te3.ka3 r0 = r0.mo36927l(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x08de
            boolean r1 = r13.equals(r9)
            if (r1 == 0) goto L_0x0897
            boolean r1 = r15.equals(r8)
            if (r1 != 0) goto L_0x0895
            goto L_0x0897
        L_0x0895:
            r1 = 1
            goto L_0x08a6
        L_0x0897:
            java.lang.String r1 = "SnsTimeLineUI"
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L_0x08a9
            boolean r2 = r15.equals(r8)
            if (r2 == 0) goto L_0x08a9
            goto L_0x0895
        L_0x08a6:
            r0.f64100t = r1
            goto L_0x08d3
        L_0x08a9:
            boolean r2 = r13.equals(r9)
            if (r2 == 0) goto L_0x08b8
            boolean r2 = r14.equals(r8)
            if (r2 != 0) goto L_0x08b6
            goto L_0x08b8
        L_0x08b6:
            r1 = 1
            goto L_0x08c5
        L_0x08b8:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x08ca
            boolean r1 = r14.equals(r8)
            if (r1 == 0) goto L_0x08ca
            goto L_0x08b6
        L_0x08c5:
            r0.f64100t = r1
            r7.f67299k = r12
            goto L_0x08d3
        L_0x08ca:
            r1 = 1
            boolean r2 = e91.C116711b.m164590o(r9)
            if (r2 == 0) goto L_0x08d3
            r0.f64100t = r1
        L_0x08d3:
            r1 = r16
            r7.mo36930q(r12, r1)
            r7.f67298j = r12
            goto L_0x0829
        L_0x08dc:
            r0 = 1
            goto L_0x08e1
        L_0x08de:
            r1 = r16
        L_0x08e0:
            r0 = 0
        L_0x08e1:
            if (r8 == 0) goto L_0x08f0
            boolean r3 = r8.equals(r10)
            if (r3 != 0) goto L_0x08f0
            te3.fh4 r3 = r11.f354392d
            int r3 = r3.f354002e
            ca1.C113264b.m155056b(r12, r8, r3, r1)
        L_0x08f0:
            if (r0 == 0) goto L_0x0919
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r12.f64087d
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "activityIn, isNewSession: %s"
            r3 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            r12.f64099s = r2
            java.lang.String r0 = ba1.C16780k.m16423b()
            if (r0 != 0) goto L_0x090c
            r15 = r20
            goto L_0x090d
        L_0x090c:
            r15 = r0
        L_0x090d:
            r12.f64102v = r15
            ba1.C16777c.m16409a(r12)
            r7.mo36932s(r12)
        L_0x0915:
            r0 = 1
            r1 = 2
            r4 = 0
            goto L_0x0929
        L_0x0919:
            r3 = r19
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r12.f64087d
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "activityIn, setPageFlow: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            r1 = 2
        L_0x0929:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            te3.fh4 r2 = r11.f354392d
            java.lang.String r2 = r2.f354001d
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r1[r0] = r2
            java.lang.String r0 = "monitor, activity: %s, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
        L_0x093c:
            r0 = -1
            r7.f67294f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z91.C23462b.mo36923h(android.app.Activity, te3.t1, int, te3.t1):void");
    }

    /* renamed from: i */
    public final void mo36924i(int i, C118467t1 t1Var, long j) {
        boolean z;
        int i2 = i;
        C118467t1 t1Var2 = t1Var;
        long j2 = j;
        int i3 = 0;
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "monitorChatUIFragment: %d", Integer.valueOf(i));
        if (i2 == 6) {
            FragmentActivity g = C116711b.m164582g();
            String str = null;
            Fragment f = g == null ? null : C117467h.m165691f(g, "com.tencent.mm.ui.chatting.ChattingUIFragment");
            int hashCode = f == null ? 0 : f.hashCode();
            C22505ka3 e = C16777c.m16413e();
            if (e == null) {
                if (t1Var2 != null) {
                    str = C116711b.m164583h(t1Var2.f354396h);
                }
                String str2 = str;
                e = mo36927l((Activity) null, str2, "ChattingUIFragment", hashCode, j);
                if (e == null) {
                    Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, curSession == null");
                    return;
                } else {
                    Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, lastPage: %s", str2);
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart new Session: %s", Long.valueOf(j));
                Fragment f2 = C117467h.m165691f(C116711b.m164582g(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
                C113264b.m155056b(e, "com.tencent.mm.ui.chatting.ChattingUIFragment", f2 == null ? 0 : f2.hashCode(), j2);
                e.f64099s = 0;
                String b = C16780k.m16423b();
                if (b == null) {
                    b = "";
                }
                e.f64102v = b;
                C16777c.m16409a(e);
                mo36932s(e);
            } else if (C20696a.m22649a(e.f64087d)) {
                Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, NOT, sessionId: %s", e.f64087d);
                Fragment f3 = C117467h.m165691f(C116711b.m164582g(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
                if (f3 != null) {
                    i3 = f3.hashCode();
                }
                C113264b.m155056b(e, "com.tencent.mm.ui.chatting.ChattingUIFragment", i3, j2);
            } else {
                C117877b<String, Integer> c = C119088a.m167882c();
                int intValue = ((Integer) c.mo182596a(1)).intValue();
                Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart: %s, %d", (String) c.mo182596a(0), Integer.valueOf(intValue));
                if (intValue == e.f64091h) {
                    Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, curChatType == chatType");
                    if (this.f67293e != 7) {
                        Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, 7-Event-NOT");
                        Fragment f4 = C117467h.m165691f(C116711b.m164582g(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
                        if (f4 != null) {
                            i3 = f4.hashCode();
                        }
                        C113264b.m155056b(e, "com.tencent.mm.ui.chatting.ChattingUIFragment", i3, j2);
                        return;
                    }
                    Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, 7-Event");
                    return;
                }
                Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionStart, curChatType!=chatType: %d, %d", Integer.valueOf(intValue), Integer.valueOf(e.f64091h));
                mo36930q(e, j2);
                C22505ka3 l = mo36927l((Activity) null, "MainUI", "ChattingUIFragment", hashCode, j);
                if (l != null) {
                    Fragment f5 = C117467h.m165691f(C116711b.m164582g(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
                    C113264b.m155056b(l, "com.tencent.mm.ui.chatting.ChattingUIFragment", f5 == null ? 0 : f5.hashCode(), j2);
                    l.f64099s = 0;
                    String b2 = C16780k.m16423b();
                    if (b2 == null) {
                        b2 = "";
                    }
                    l.f64102v = b2;
                    C16777c.m16409a(l);
                    mo36932s(l);
                }
            }
        } else if (i2 == 7) {
            C22505ka3 e2 = C16777c.m16413e();
            if (e2 == null) {
                Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose, curSession不合法");
                return;
            }
            C117877b<String, Integer> c2 = C119088a.m167882c();
            int intValue2 = ((Integer) c2.mo182596a(1)).intValue();
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose: %s, %d", (String) c2.mo182596a(0), Integer.valueOf(intValue2));
            int i4 = e2.f64091h;
            if (intValue2 == i4) {
                Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose, ==");
                mo36930q(e2, j2);
                return;
            }
            Log.m105921e("HABBYGE-MALI.HellSessionMonitor", "chatUIFragmentSessionClose, != %d", Integer.valueOf(i4));
        }
    }

    /* renamed from: j */
    public void mo36925j(int i, int i2, long j) {
        fh4 fh4;
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        if (C115411b.m162220c()) {
            Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, monitorStorySession: FALSE");
            return;
        }
        boolean z = true;
        int i5 = 0;
        if (i3 != 8) {
            if (i3 == 9) {
                if (i4 == 1) {
                    Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: OUT, FROM_StoryGallery_GONE");
                    C22505ka3 e = C16777c.m16413e();
                    if (e == null) {
                        Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "closeStoryGalleryView, 不是合法session !!!");
                    } else {
                        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "closeStoryGalleryView, curSession: %s", e.f64087d);
                        if ("142".equals(C115411b.m162219b(e.f64087d))) {
                            mo36930q(e, j2);
                        } else if (!"StoryGalleryView".equals(e.f64090g)) {
                            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "curActivity: %s IS NOT curSession: %s startPage: %s", "StoryGalleryView", e.f64087d, e.f64090g);
                            C16777c.m16418j(e);
                        }
                    }
                    Fragment f = C117467h.m165691f(C116711b.m164582g(), "com.tencent.mm.ui.MoreTabUI");
                    if (f != null) {
                        i5 = f.hashCode();
                    }
                    mo36934u("com.tencent.mm.ui.MoreTabUI", i5, j2);
                    C113264b.m155056b((C22505ka3) null, "MoreTabUI", i5, j2);
                } else if (i4 == 3) {
                    Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: OUT, FROM_PAUSE Event-8, !!");
                    C118467t1 g = C21062c.m23249d().mo32776g();
                    if (g != null && (fh4 = g.f354392d) != null) {
                        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGalleryViewSession, topActivity: %s", C116711b.m164583h(fh4.f354001d));
                    }
                }
            }
        } else if (i4 == 0) {
            Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: IN, FROM_StoryGallery_SHOW");
            mo36933t("com.tencent.mm.ui.MoreTabUI", j2);
            Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "关闭(闭环)MoreTabUI无效页之后，再开启动态视频session");
            Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "openStoryGalleryView");
            C22505ka3 e2 = C16777c.m16413e();
            if (e2 == null) {
                e2 = mo36927l((Activity) null, "MoreTabUI", "StoryGalleryView", 0, j);
                if (e2 == null) {
                    Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "openStoryGalleryView, 不是合法session ~~~");
                    return;
                }
            } else {
                Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "openStoryGalleryView, curSession: %s", e2.f64087d);
                z = false;
            }
            C113264b.m155056b(e2, "StoryGalleryView", 0, j2);
            if (z) {
                e2.f64099s = 0;
                String b = C16780k.m16423b();
                if (b == null) {
                    b = "";
                }
                e2.f64102v = b;
                C16777c.m16409a(e2);
                mo36932s(e2);
                return;
            }
            C16777c.m16418j(e2);
        } else if (i4 == 2) {
            Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "monitorStoryGallery: IN, FROM_RESUME, Event-7, !!");
        }
    }

    /* renamed from: k */
    public final void mo36926k(int i, long j) {
        Log.m105924i("HABBYGE-MALI.HellSessionMonitor", "newChattingUISession");
        C22505ka3 l = mo36927l((Activity) null, "MainUI", "ChattingUI", i, j);
        if (l == null) {
            Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "_doChattingUIInContinue, 不是合法session ~~~");
            return;
        }
        String b = C16780k.m16423b();
        if (b == null) {
            b = "";
        }
        l.f64102v = b;
        C113264b.m155056b(l, "com.tencent.mm.ui.chatting.ChattingUI", i, j);
        l.f64099s = 0;
        C16777c.m16409a(l);
        mo36932s(l);
    }

    /* renamed from: l */
    public C22505ka3 mo36927l(Activity activity, String str, String str2, int i, long j) {
        C118484zl2 zl22;
        C118484zl2 zl23;
        String str3;
        Activity activity2 = activity;
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        if (str5 == null) {
            Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "newSession: dstPageName is NULL");
            return null;
        }
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "newSession: srcPageName: %s, dstPageName: %s", str4, str5);
        if ("WebViewUI".equals(str5)) {
            zl23 = new C118484zl2();
            zl23.f354630d = "minimize_secene";
            zl23.f354631e = C117393b.m165534c("minimize_secene");
            zl22 = new C118484zl2();
            zl22.f354630d = "KPublisherId";
            zl22.f354631e = C117393b.m165534c("KPublisherId");
            ArrayList arrayList = new ArrayList();
            arrayList.add(zl23.f354631e);
            arrayList.add(zl22.f354631e);
            str3 = C115411b.m162224g(activity2, str4, str5, arrayList);
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "newSession(WebViewUI)sid = %s, %s", str3, Long.valueOf(j));
        } else {
            str3 = C115411b.m162224g(activity2, str4, str5, (List<String>) null);
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "newSession(no args)sid = %s, %s", str3, Long.valueOf(j));
            zl23 = null;
            zl22 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        C22505ka3 ka32 = new C22505ka3();
        ka32.f64087d = str3 + "_" + j2;
        ka32.f64088e = C16777c.m16412d();
        ka32.f64090g = str5;
        ka32.f64101u = i;
        ka32.f64095o = str4;
        ka32.f64092i = j2;
        if ("WebViewUI".equals(str5)) {
            C118433ga3 ga32 = new C118433ga3();
            ka32.f64094n = ga32;
            ga32.f354025d.add(zl23);
            ka32.f64094n.f354025d.add(zl22);
        } else {
            if ("ChattingUI".equals(ka32.f64090g)) {
                C117877b<String, Integer> b = C119088a.m167881b();
                ka32.f64097q = (String) b.mo182596a(0);
                ka32.f64091h = ((Integer) b.mo182596a(1)).intValue();
            } else if ("ChattingUIFragment".equals(ka32.f64090g)) {
                C117877b<String, Integer> c = C119088a.m167882c();
                ka32.f64097q = (String) c.mo182596a(0);
                ka32.f64091h = ((Integer) c.mo182596a(1)).intValue();
            }
            C115411b.m162218a(ka32);
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "newSession, %s", ka32.f64087d);
        }
        ka32.f64098r = str5;
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "newSession: %s, %s", ka32.f64087d, str5);
        this.f67291c = ka32.f64087d;
        return ka32;
    }

    /* renamed from: o */
    public void mo36928o(int i) {
        this.f67289a.getClass();
        Log.m105925i("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSession, %d", Integer.valueOf(i));
        C20822b.m22821e(-1, i);
        C22527qp1 a = C20822b.m22817a();
        if (a == null) {
            a = new C22527qp1();
        }
        a.f64509d = i;
        C20822b.m22818b(a);
    }

    /* renamed from: p */
    public void mo36929p(boolean z, String str, int i, long j) {
        if (z) {
            String h = C116711b.m164583h(str);
            if ("AppBrandLaunchProxyUI".equals(h) || "AppBrandPreLoadingUI".equals(h)) {
                return;
            }
        }
        Log.m105929w("HABBYGE-MALI.HellSessionMonitor", "onFloatSessionExit: %b, %s", Boolean.valueOf(z), str);
        C20819a aVar = this.f67289a;
        aVar.getClass();
        C20822b.m22820d(false);
        Pair<Integer, Integer> c = C20822b.m22819c();
        if (c != null) {
            int intValue = ((Integer) c.first).intValue();
            int intValue2 = ((Integer) c.second).intValue();
            Log.m105925i("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSessionExit, finish: %b, %d, %d", Boolean.valueOf(z), Integer.valueOf(intValue), Integer.valueOf(intValue2));
            if (intValue != 2 || intValue2 == 3 || intValue2 == 4) {
                C22505ka3 e = C16777c.m16413e();
                if (e == null) {
                    Log.m105928w("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSessionExit, curSession == null");
                } else if (z) {
                    String b = C115411b.m162219b(e.f64087d);
                    if (b == null || !b.equals("145")) {
                        Log.m105929w("HABBYGE-MALI.FloatBallSessionHandler", "onFloatSessionExit, sid: %s, %s", b, e.f64087d);
                        return;
                    }
                    C22527qp1 a = C20822b.m22817a();
                    int i2 = a == null ? -1 : a.f64509d;
                    if (i2 == 3 || i2 == 4) {
                        Object[] objArr = new Object[1];
                        C22527qp1 a2 = C20822b.m22817a();
                        objArr[0] = Integer.valueOf(a2 == null ? 8 : a2.f64514i);
                        Log.m105925i("HABBYGE-MALI.FloatBallSessionHandler", "FloatBall, state, read %d", objArr);
                        C22527qp1 a3 = C20822b.m22817a();
                        if ((a3 == null ? 8 : a3.f64514i) == 8) {
                            aVar.mo32510a(e, true, intValue, intValue2, j);
                        }
                    }
                } else {
                    aVar.mo32510a(e, false, intValue, intValue2, j);
                }
            } else {
                Log.m105928w("HABBYGE-MALI.FloatBallSessionHandler", "FoatBall, onFloatSessionExit: onFloatMenuItemClicked");
            }
        }
    }

    /* renamed from: q */
    public void mo36930q(C22505ka3 ka32, long j) {
        C22505ka3 ka33;
        C22505ka3 ka34 = ka32;
        long j2 = j;
        if (ka34 == null) {
            Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "HABBYGE-MLAI, onSessionClose, curSession == null");
        } else if (!ka34.f64096p || ka34.f64099s != 1) {
            C118423dg2 a = C113263a.m155052a();
            if (!a.f353948d.isEmpty()) {
                C118427eg2 last = a.f353948d.getLast();
                if (C115411b.m162229l(last.f353972g)) {
                    this.f67289a.getClass();
                    C22527qp1 a2 = C20822b.m22817a();
                    if (a2 == null) {
                        a2 = new C22527qp1();
                    }
                    C118427eg2 eg22 = new C118427eg2();
                    a2.f64510e = eg22;
                    eg22.f353969d = last.f353969d;
                    eg22.f353972g = last.f353972g;
                    eg22.f353977o = last.f353977o;
                    C20822b.m22818b(a2);
                }
            }
            ka34.f64093j = j2;
            ka34.f64099s = 1;
            C115411b.m162218a(ka32);
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "onSessionClose temp: %s, %s, %s, %b, %d", ka34.f64087d, Long.valueOf(ka34.f64092i), Long.valueOf(ka34.f64093j), Boolean.valueOf(ka34.f64096p), Integer.valueOf(ka34.f64099s));
            C118865a.f355584a.mo183575c(ka34.f64090g, j2, C23072e.MATCH_PAGE_SESSION_CLOSE);
            m28022m(C115411b.m162219b(ka34.f64087d), j2);
            C118434gg2 h = C16777c.m16416h();
            if (h != null && C16777c.m16415g(h)) {
                Log.m105924i("HABBYGE-MALI.HellSessionDao", "HellSessionDao, updateSessionOnClose");
                h.f354028f.set(h.f354029g, ka34);
                h.f354029g = -1;
                C16777c.m16419k(h);
            }
            String str = "";
            if (ka34.f64100t) {
                String str2 = ka34.f64087d;
                if (C21199a.m23656a() == 8) {
                    Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "hellSessionMonitor, restoreLastSession 8Event!!");
                    this.f67298j = C16777c.m16414f(str2);
                } else {
                    Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "hellSessionMonitor, restoreLastSession: %s", str2);
                    C22505ka3 f = C16777c.m16414f(str2);
                    if (f == null) {
                        C22505ka3 ka35 = this.f67298j;
                        if (ka35 != null) {
                            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "hellSessionMonitor, mLastSession4Nested: %s", ka35.f64087d);
                            f = this.f67298j;
                        } else {
                            Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "hellSessionMonitor, restoreLastSession: LastSession NULL !!");
                        }
                    }
                    f.f64099s = 0;
                    f.f64100t = false;
                    f.f64092i = j2;
                    f.f64093j = 0;
                    String h2 = C116711b.m164583h(f.f64090g);
                    if (h2 != null && !h2.equals("LauncherUI")) {
                        C113264b.m155056b(f, h2, f.f64101u, j2);
                    }
                    String b = C16780k.m16423b();
                    if (b == null) {
                        b = str;
                    }
                    f.f64102v = b;
                    C16777c.m16409a(f);
                    mo36932s(f);
                }
            }
            C118948a.f356270c = false;
            C22466j.f63632l.getClass();
            String b2 = C115411b.m162219b(ka34.f64087d);
            if (("143".equals(b2) || "155".equals(b2)) && C64208c.f181953c) {
                Log.m105919d("HABBYGE-MALI.SnsFinderMonitor", "stop19943, sessionId=%s, startTime=%s, endTime=%s", ka34.f64087d, Long.valueOf(ka34.f64092i), Long.valueOf(ka34.f64093j));
                C22623c cVar = new C22623c();
                cVar.f65064a = C91980d.vx0().mo84751Wb();
                cVar.f65065b = "All-Sns";
                long j3 = ka34.f64092i;
                cVar.f65067d = j3;
                long j4 = ka34.f64093j;
                cVar.f65068e = j4;
                cVar.f65066c = j4 - j3;
                cVar.f65069f = C116711b.m164579d();
                cVar.f65070g = b2;
                cVar.f65071h = 1;
                C22618a.f65058a.mo35741b(cVar);
            }
            if ((ka34.f64087d.startsWith("143") || ka34.f64087d.startsWith("155")) && !C64208c.f181953c) {
                C22623c cVar2 = new C22623c();
                cVar2.f65064a = C91980d.vx0().mo84751Wb();
                cVar2.f65065b = "All";
                long j5 = ka34.f64092i;
                cVar2.f65067d = j5;
                long j6 = ka34.f64093j;
                cVar2.f65068e = j6;
                cVar2.f65066c = j6 - j5;
                cVar2.f65069f = C116711b.m164579d();
                cVar2.f65070g = C115411b.m162219b(ka34.f64087d);
                cVar2.f65071h = 1;
                C22618a.f65058a.mo35741b(cVar2);
            }
            if (((this.f67291c.startsWith("996") && this.f67299k != null && ka34.f64087d.startsWith("143")) || (this.f67291c.startsWith("996") && this.f67299k != null && ka34.f64087d.startsWith("155"))) && (ka33 = this.f67299k) != null) {
                if (C21199a.m23656a() == 8) {
                    Log.m105928w("HABBYGE-MALI.HellSessionMonitor", "hellSessionMonitor, onNeedSessionStart 8Event!!");
                    return;
                }
                ka33.f64099s = 0;
                ka33.f64100t = false;
                long j7 = j;
                ka33.f64092i = j7;
                ka33.f64093j = 0;
                String h3 = C116711b.m164583h(ka33.f64090g);
                if (h3 != null && !h3.equals("LauncherUI")) {
                    C113264b.m155056b(ka33, h3, ka33.f64101u, j7);
                }
                String b3 = C16780k.m16423b();
                if (b3 != null) {
                    str = b3;
                }
                ka33.f64102v = str;
                C16777c.m16409a(ka33);
                mo36932s(ka33);
                this.f67299k = null;
            }
        } else {
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "onSessionClose: The Repeated sesson close Event: %s", ka34.f64087d);
            C16777c.m16410b(ka34.f64087d);
        }
    }

    /* renamed from: r */
    public void mo36931r(C22505ka3 ka32, long j, boolean z) {
        String str;
        if (z || ka32 == null || (str = ka32.f64087d) == null || !str.startsWith("150")) {
            mo36930q(ka32, j);
            this.f67297i = false;
            return;
        }
        Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "HABBYGE-MLAI, onSessionClose, curSession ge pi la !!!!!!");
        this.f67297i = true;
    }

    /* renamed from: s */
    public void mo36932s(C22505ka3 ka32) {
        if (ka32 != null) {
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "onSessionStart: %s, %s, %s", ka32.f64087d, Long.valueOf(ka32.f64092i), ka32.f64102v);
            C22466j.f63632l.getClass();
            if ("143".equals(C115411b.m162219b(ka32.f64087d)) && C64208c.f181953c) {
                Log.m105919d("HABBYGE-MALI.SnsFinderMonitor", "begin19943, sessionId=%s, startTime=%s, endTime=%s", ka32.f64087d, Long.valueOf(ka32.f64092i), Long.valueOf(ka32.f64093j));
            }
            C16780k.m16422a(ka32.f64087d);
            C16778j.C16779a aVar = C16778j.f45341a;
            int a = C21199a.m23656a();
            if (a == 7 || a == 8) {
                Log.m105924i("HABBYGE-MALI.SessionPairDao", "setCurSession, activityMethod: " + a);
            } else {
                C118478x14 a2 = aVar.mo17809a();
                if (a2 == null) {
                    a2 = new C118478x14();
                }
                boolean z = a2.f354531i;
                if (z) {
                    a2.f354526d = a2.f354528f;
                } else {
                    a2.f354527e = a2.f354529g;
                }
                a2.f354530h = z;
                a2.f354531i = true;
                a2.f354528f = ka32;
                aVar.mo17810b(a2);
            }
            String str = ka32.f64087d;
            Log.m105924i("HABBYGE-MALI.FuzzyMatch", "resetFuzzyDaoOnStart: " + str);
            if (str != null) {
                C23066b.C23067a aVar2 = C23066b.f66278a;
                C110960dr1 a3 = aVar2.mo36463a();
                if (a3 != null) {
                    for (int size = a3.f331954d.size() - 1; -1 < size; size--) {
                        C110970q14 q142 = a3.f331954d.get(size);
                        C87412m.m108593f(q142, "matchInfo.sessionFuzzyPaths[i]");
                        C110970q14 q143 = q142;
                        if (!C87412m.m108589b(str, q143.f332254d)) {
                            Log.m105924i("HABBYGE-MALI.FuzzyMatchDao", "resetOnStart, need remove: " + q143.f332254d);
                            for (int size2 = q143.f332255e.size() + -1; -1 < size2; size2--) {
                                C110962fr1 fr12 = q143.f332255e.get(size2);
                                C87412m.m108593f(fr12, "sessionPath.paths[j]");
                                if (fr12.f331976h) {
                                    Log.m105924i("HABBYGE-MALI.FuzzyMatchDao", "resetOnStart, real remove: " + q143.f332254d);
                                    q143.f332255e.remove(size2);
                                }
                            }
                            if (q143.f332255e.isEmpty()) {
                                a3.f331954d.remove(size);
                            }
                        }
                    }
                    aVar2.mo36466d(a3);
                }
                C116850b.m164834d("mmkv_fuzzy_matched_bckup", new byte[0]);
                C116850b.m164834d("mmkv_ssionPg_matched_bckup", new byte[0]);
            }
            m28023n(C115411b.m162219b(ka32.f64087d), ka32.f64092i);
        }
    }

    /* renamed from: t */
    public void mo36933t(String str, long j) {
        boolean z = false;
        if (this.f67296h) {
            this.f67296h = false;
            Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "onUnknownSessionClose exception !!!!!!");
            return;
        }
        C118434gg2 h = C16777c.m16416h();
        C118430fa3 fa32 = null;
        if (h != null) {
            int i = h.f354031i;
            if (i >= 0 && i < h.f354030h.size()) {
                fa32 = h.f354030h.get(h.f354031i);
            }
        }
        if (fa32 != null) {
            fa32.f353994h = j;
            Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "onSessionClose, unknow: %s, %s, %s, %s", str, fa32.f353996j, Long.valueOf(fa32.f353993g), Long.valueOf(fa32.f353994h));
            C118434gg2 h2 = C16777c.m16416h();
            if (h2 != null) {
                int i2 = h2.f354031i;
                if (i2 >= 0 && i2 < h2.f354030h.size()) {
                    z = true;
                }
                if (z) {
                    h2.f354030h.set(h2.f354031i, fa32);
                    C16777c.m16419k(h2);
                }
            }
            m28022m(C115411b.m162225h(fa32.f353996j), j);
        }
    }

    /* renamed from: u */
    public void mo36934u(String str, int i, long j) {
        Fragment a;
        if (TextUtils.isEmpty(str) || this.f67297i) {
            this.f67297i = false;
            this.f67296h = true;
            Log.m105920e("HABBYGE-MALI.HellSessionMonitor", "addUnknownPage: page is NULL");
            return;
        }
        C118430fa3 fa32 = new C118430fa3();
        fa32.f353996j = C116711b.m164583h(str);
        fa32.f353997n = i;
        if (this.f67294f == 7) {
            fa32.f353993g = this.f67295g;
            this.f67294f = -1;
        } else {
            fa32.f353993g = j;
        }
        fa32.f353992f = C16777c.m16412d();
        if ("LauncherUI".equals(fa32.f353996j)) {
            Fragment e = C117467h.m165690e("com.tencent.mm.ui.LauncherUI");
            if (e != null) {
                fa32.f353996j = e.getClass().getSimpleName();
                fa32.f353997n = e.hashCode();
            }
        } else if (("FinderHomeUI".equals(fa32.f353996j) || "FinderHomeAffinityUI".equals(fa32.f353996j) || "FinderConversationUI".equals(fa32.f353996j)) && (a = C22466j.m26184a()) != null) {
            fa32.f353996j = a.getClass().getSimpleName();
        }
        String b = C16780k.m16423b();
        if (b == null) {
            b = "";
        }
        fa32.f354000q = b;
        Log.m105925i("HABBYGE-MALI.HellSessionMonitor", "onSessionStart, unknow: %s, %s, %s", fa32.f353996j, Long.valueOf(fa32.f353993g), fa32.f354000q);
        C118434gg2 h = C16777c.m16416h();
        if (h == null) {
            h = new C118434gg2();
        }
        h.f354030h.addLast(fa32);
        h.f354031i = h.f354030h.size() - 1;
        h.f354034o = false;
        C16777c.m16419k(h);
        C16780k.m16422a(fa32.f353996j + "_" + fa32.f353993g);
        C16778j.C16779a aVar = C16778j.f45341a;
        C118478x14 a2 = aVar.mo17809a();
        if (a2 == null) {
            a2 = new C118478x14();
        }
        boolean z = a2.f354531i;
        if (z) {
            a2.f354526d = a2.f354528f;
        } else {
            a2.f354527e = a2.f354529g;
        }
        a2.f354530h = z;
        a2.f354531i = false;
        a2.f354529g = fa32;
        aVar.mo17810b(a2);
        m28023n(C115411b.m162225h(fa32.f353996j), j);
    }
}
