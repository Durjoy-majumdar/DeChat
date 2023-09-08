package rs1;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de1.C7290r;
import di3.C86312j;
import dp1.C7435f2;
import dp1.C7450q;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.Date;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import p145dx.C7526s;
import pf1.C62273n;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import te3.C50838pj1;
import zc1.C66785b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: rs1.b */
public abstract class C13117b extends C13308kb {

    /* renamed from: j */
    public static boolean f37342j;

    /* renamed from: f */
    public boolean f37343f;

    /* renamed from: g */
    public String f37344g = "";

    /* renamed from: h */
    public int f37345h;

    /* renamed from: i */
    public final C13601g f37346i = C36568h.m40985a(C13119b.f37348d);

    /* renamed from: rs1.b$a */
    public static final class C13118a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f37347d;

        public C13118a(View view) {
            this.f37347d = view;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f37347d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem$hide$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem$hide$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f37347d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem$hide$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem$hide$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: rs1.b$b */
    public static final class C13119b extends C87413o implements C32224a<C62273n> {

        /* renamed from: d */
        public static final C13119b f37348d = new C13119b();

        public C13119b() {
            super(0);
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            return (C62273n) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13117b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: n3 */
    public static final boolean m12548n3(C13117b bVar, C8477a0 a0Var) {
        C66785b bVar2 = C66785b.f191882e;
        C50838pj1 pj12 = bVar2.mo90673n0().mo62397b().f140480x;
        int i = pj12 != null ? pj12.f139787h : 3;
        C50838pj1 pj13 = bVar2.mo90673n0().mo62397b().f140480x;
        int i2 = pj13 != null ? pj13.f139788i : 1;
        boolean z = !bVar.mo12625m3() ? bVar.mo12623k3() < i2 : bVar.mo12623k3() < i;
        Log.m105924i("Finder.FinderFeedRingtoneUIC", "isCanFreqCtrl limit:" + i + " isSetIn90:" + bVar.mo12625m3() + " limit90:" + i2 + " today:" + bVar.mo12623k3() + " ctrl:" + z + " condition:" + bVar.f37343f + " threshold:" + a0Var.f27482d);
        return bVar.f37343f && z;
    }

    /* renamed from: F3 */
    public final void mo12617F3(BaseFinderFeed baseFinderFeed, String str) {
        C87412m.m108594g(baseFinderFeed, "feed");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed.getItemId()));
            boolean z = false;
            if (f37342j) {
                jSONObject.put("feed_source", 1);
            } else {
                jSONObject.put("feed_source", 0);
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("songid", str);
            if (this.f37344g.length() > 0) {
                z = true;
            }
            if (z) {
                jSONObject.put("bell_info", this.f37344g);
            }
            if (f37342j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("intab", this.f37345h);
                jSONObject.put("video_pos_info", jSONObject2.toString());
            }
        } catch (JSONException unused) {
        }
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        f2Var.mo8577a(f != null ? f.mo12861q3() : null, "set_song_tips", 1, jSONObject);
    }

    /* renamed from: G3 */
    public final void mo12618G3(BaseFinderFeed baseFinderFeed, String str) {
        C87412m.m108594g(baseFinderFeed, "feed");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed.getItemId()));
            boolean z = true;
            if (f37342j) {
                jSONObject.put("feed_source", 1);
            } else {
                jSONObject.put("feed_source", 0);
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("songid", str);
            if (this.f37344g.length() <= 0) {
                z = false;
            }
            if (z) {
                jSONObject.put("bell_info", this.f37344g);
            }
            if (f37342j) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("intab", this.f37345h);
                jSONObject.put("video_pos_info", jSONObject2.toString());
            }
        } catch (JSONException unused) {
        }
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        C7435f2.f25626a.mo8577a(q3, "set_song_tips", 0, jSONObject);
        if (q3 != null) {
            C7450q.f25643a.mo8594b(q3, baseFinderFeed, 43);
        }
    }

    /* renamed from: d3 */
    public void mo12619d3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        View c3 = mo12677c3(oVar);
        if (c3 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view = c3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem", "hide", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem", "hide", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c3.animate().alpha(0.0f).setDuration(250).setListener(new C13118a(c3)).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r7.f27482d != false) goto L_0x0125;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12620e3(jq3.C60905o r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r10, r0)
            android.view.View r0 = r9.mo12677c3(r10)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99435j7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x0023
            goto L_0x0127
        L_0x0023:
            java.lang.Object r10 = r10.f173503E
            boolean r0 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r3 = 0
            if (r0 == 0) goto L_0x002d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            goto L_0x002e
        L_0x002d:
            r10 = r3
        L_0x002e:
            if (r10 != 0) goto L_0x0032
            goto L_0x0126
        L_0x0032:
            vq1.w r0 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            int r0 = r0.mo89909h(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.field_finderObject
            int r4 = r4.ringtone_count
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x0057
            te3.l93 r5 = r5.originalsound_info
            goto L_0x0058
        L_0x0057:
            r5 = r3
        L_0x0058:
            zc1.b r6 = zc1.C66785b.f191882e
            bd1.e r7 = r6.mo90673n0()
            te3.qq2 r7 = r7.mo62397b()
            te3.pj1 r7 = r7.f140480x
            if (r7 == 0) goto L_0x0069
            boolean r7 = r7.f139789j
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            java.lang.String r8 = "Finder.FinderFeedRingtoneUIC"
            if (r11 == 0) goto L_0x008d
            if (r7 == 0) goto L_0x008d
            if (r4 <= 0) goto L_0x008d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "isShowRingtoneInfo self show ringtoneCount:"
            r10.append(r11)
            r10.append(r4)
            r11 = 46
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            goto L_0x0125
        L_0x008d:
            bd1.e r11 = r6.mo90673n0()
            te3.qq2 r11 = r11.mo62397b()
            te3.pj1 r11 = r11.f140480x
            if (r11 == 0) goto L_0x009c
            int r11 = r11.f139783d
            goto L_0x009e
        L_0x009c:
            r11 = 30
        L_0x009e:
            bd1.e r6 = r6.mo90673n0()
            te3.qq2 r6 = r6.mo62397b()
            te3.pj1 r6 = r6.f140480x
            if (r6 == 0) goto L_0x00ad
            int r6 = r6.f139784e
            goto L_0x00af
        L_0x00ad:
            r6 = 10
        L_0x00af:
            gy3.a0 r7 = new gy3.a0
            r7.<init>()
            if (r5 == 0) goto L_0x00b8
            java.lang.String r3 = r5.f137267e
        L_0x00b8:
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00bf
            r11 = r6
        L_0x00bf:
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r0 >= r3) goto L_0x00c8
            if (r4 <= r11) goto L_0x00d9
            r7.f27482d = r2
            goto L_0x00d9
        L_0x00c8:
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r0 = (float) r0
            float r0 = r0 * r5
            float r3 = (float) r3
            float r0 = r0 / r3
            float r11 = (float) r11
            float r0 = r0 * r11
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x00d9
            r7.f27482d = r2
        L_0x00d9:
            er1.w3 r11 = er1.C58784w3.f168295a
            boolean r11 = r11.mo83933h(r10)
            if (r11 != 0) goto L_0x00e7
            java.lang.String r10 = "isShowRingtoneInfo return for canShareRingTone"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            goto L_0x0126
        L_0x00e7:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.mo3513o()
            boolean r11 = r11.isDisableShowSetRingtoneBtn()
            if (r11 == 0) goto L_0x00f7
            java.lang.String r10 = "isShowRingtoneInfo return for isDisableShowSetRingtoneBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            goto L_0x0126
        L_0x00f7:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.mo3513o()
            boolean r11 = r11.isShowSetRingtoneBtn()
            if (r11 == 0) goto L_0x0107
            java.lang.String r10 = "isShowRingtoneInfo return for isShowSetRingtoneBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            goto L_0x0125
        L_0x0107:
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            boolean r10 = r10.isEnableShowSetRingtoneBtn()
            if (r10 == 0) goto L_0x011b
            java.lang.String r10 = "isShowRingtoneInfo return for isEnableShowSetRingtoneBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            boolean r1 = m12548n3(r9, r7)
            goto L_0x0126
        L_0x011b:
            boolean r10 = m12548n3(r9, r7)
            if (r10 == 0) goto L_0x0126
            boolean r10 = r7.f27482d
            if (r10 == 0) goto L_0x0126
        L_0x0125:
            r1 = 1
        L_0x0126:
            r2 = r1
        L_0x0127:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13117b.mo12620e3(jq3.o, boolean):boolean");
    }

    /* renamed from: i3 */
    public void mo12621i3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.FinderFeedRingtoneUIC", "showRingtoneInfo");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LAST_REMIND_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
        int k3 = mo12623k3() + 1;
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        C87412m.m108593f(format, "sdfStr");
        long parseLong = (Long.parseLong(format) * ((long) 1000)) + ((long) k3);
        Log.m105924i("Finder.FinderFeedRingtoneUIC", "increaseTodayRemindCount todayCount:" + k3 + " formatCount:" + parseLong);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, Long.valueOf(parseLong));
        View c3 = mo12677c3(oVar);
        if (c3 != null) {
            Object obj = oVar.f173503E;
            if ((obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = c3;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem", "showRingtoneInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem", "showRingtoneInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem", "showRingtoneInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/BaseFinderDescPanelItem", "showRingtoneInfo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C119179t tVar = C119157j.f356862d;
                C13130c cVar = new C13130c(c3, this, oVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(cVar, 150, false);
            }
        }
    }

    /* renamed from: j3 */
    public abstract void mo12622j3(C60905o oVar, String str);

    /* renamed from: k3 */
    public final int mo12623k3() {
        long j = 0;
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, 0);
        if (G == 0) {
            return 0;
        }
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        C87412m.m108593f(format, "sdfStr");
        long parseLong = Long.parseLong(format);
        long j2 = G / ((long) 1000);
        if (j2 == parseLong) {
            j = G % parseLong;
        }
        Log.m105924i("Finder.FinderFeedRingtoneUIC", "getTodayRemindCount today:" + parseLong + " formatToday:" + j2 + " formatCount:" + G + " remindCount:" + j);
        return (int) j;
    }

    /* renamed from: l3 */
    public final int mo12624l3(View view) {
        C87412m.m108594g(view, "<this>");
        int width = view.getWidth();
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (width > 0 || view2 == null) {
            return width;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new Point(view.getMeasuredWidth(), view.getMeasuredHeight()).x;
    }

    /* renamed from: m3 */
    public final boolean mo12625m3() {
        long currentTimeMillis = System.currentTimeMillis();
        long Fh = ((C7526s) C86312j.m106911c(C7526s.class)).mo8652Fh();
        return Fh != 0 && currentTimeMillis - Fh <= 7776000000L;
    }

    /* renamed from: o3 */
    public void mo12626o3(C60905o oVar, int i, int i2, String str) {
        Intent intent;
        C87412m.m108594g(oVar, "holder");
        Context context = oVar.f173499A;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        boolean z = false;
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            z = intent.getBooleanExtra("key_enable_ringtone_bubble", false);
        }
        f37342j = z;
        mo12622j3(oVar, str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C50838pj1 pj12 = C66785b.f191882e.mo90673n0().mo62397b().f140480x;
        int i = pj12 != null ? pj12.f139785f : 14;
        long currentTimeMillis = System.currentTimeMillis();
        long Fh = ((C7526s) C86312j.m106911c(C7526s.class)).mo8652Fh();
        if (Fh != 0) {
            long j = currentTimeMillis - Fh;
            if (i == 0 || j >= ((long) i) * 86400000) {
                this.f37343f = true;
            }
            Log.m105924i("Finder.FinderFeedRingtoneUIC", "setRingtoneFrequencyLimit = " + i + " diffMs = " + j + " isSetRingtoneMeetCondition = " + this.f37343f);
            return;
        }
        this.f37343f = true;
    }
}
