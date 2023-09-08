package o91;

import aa1.C112764f;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import j91.C21199a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l31.C61212e;
import op3.C117877b;
import op3.C117882j;
import p91.C100693b;
import p91.C62209a;
import p91.C62210c;
import t91.C64208c;
import te3.e74;
import te3.v84;
import z91.C23462b;
import zt3.C119157j;

/* renamed from: o91.d */
public final class C100312d {

    /* renamed from: A */
    public int f293836A;

    /* renamed from: B */
    public int f293837B;

    /* renamed from: C */
    public int f293838C;

    /* renamed from: D */
    public int f293839D;

    /* renamed from: E */
    public WindowManager f293840E;

    /* renamed from: a */
    public int f293841a = 0;

    /* renamed from: b */
    public final int f293842b;

    /* renamed from: c */
    public final int f293843c;

    /* renamed from: d */
    public final Map<String, C100313f> f293844d;

    /* renamed from: e */
    public final Map<String, Boolean> f293845e = new ConcurrentHashMap();

    /* renamed from: f */
    public v84 f293846f;

    /* renamed from: g */
    public long f293847g = 0;

    /* renamed from: h */
    public final Map<Integer, String> f293848h = new ConcurrentHashMap();

    /* renamed from: i */
    public C100319l f293849i;

    /* renamed from: j */
    public C100318k f293850j;

    /* renamed from: k */
    public final C100693b f293851k;

    /* renamed from: l */
    public final String f293852l;

    /* renamed from: m */
    public String f293853m;

    /* renamed from: n */
    public int f293854n;

    /* renamed from: o */
    public boolean f293855o = false;

    /* renamed from: p */
    public boolean f293856p = false;

    /* renamed from: q */
    public WeakReference<ViewGroup> f293857q;

    /* renamed from: r */
    public int f293858r;

    /* renamed from: s */
    public int f293859s;

    /* renamed from: t */
    public int f293860t;

    /* renamed from: u */
    public WeakReference<LinearLayoutManager> f293861u;

    /* renamed from: v */
    public boolean f293862v;

    /* renamed from: w */
    public int f293863w;

    /* renamed from: x */
    public long f293864x;

    /* renamed from: y */
    public long f293865y;

    /* renamed from: z */
    public String f293866z;

    public C100312d(int i, String str, String str2) {
        C100693b bVar = null;
        this.f293857q = null;
        this.f293858r = -1;
        this.f293859s = 0;
        this.f293860t = 0;
        this.f293861u = null;
        this.f293862v = false;
        this.f293863w = -1;
        this.f293864x = 0;
        this.f293865y = -1;
        this.f293866z = "";
        this.f293836A = -1;
        this.f293837B = -1;
        this.f293838C = 0;
        this.f293839D = 0;
        this.f293840E = null;
        switch (i) {
            case 0:
                bVar = new C62210c();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                bVar = new C62209a();
                break;
        }
        this.f293851k = bVar;
        this.f293842b = ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop();
        this.f293844d = new ConcurrentHashMap();
        this.f293843c = i;
        this.f293852l = str;
        this.f293853m = str2;
        this.f293854n = -1;
    }

    /* renamed from: f */
    public static void m131121f(C100312d dVar) {
        C100313f fVar;
        v84 v84;
        if (dVar.f293846f != null) {
            dVar.mo139584e();
            if (!((ConcurrentHashMap) dVar.f293844d).isEmpty()) {
                Log.m105924i("HABBYGE-MALI.FeedMonitor", "_moveMonitoringFeed2ReadyReport");
                for (Map.Entry entry : ((ConcurrentHashMap) dVar.f293844d).entrySet()) {
                    if (!(entry == null || (fVar = (C100313f) entry.getValue()) == null || (v84 = dVar.f293846f) == null)) {
                        v84.f299658h.add(fVar.f293867a);
                    }
                }
                ((ConcurrentHashMap) dVar.f293844d).clear();
            }
            v84 v842 = dVar.f293846f;
            dVar.f293846f = null;
            ((C119157j) C119157j.f356862d).mo183876g(new C100311c(dVar, v842), "_reportTimeline");
        }
    }

    /* renamed from: a */
    public final void mo139580a(ViewGroup viewGroup, int i, int i2) {
        if (this.f293849i != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C100319l lVar = this.f293849i;
            if (lVar.f293894c <= 0) {
                lVar.f293894c = currentTimeMillis;
            }
            if ((this.f293864x <= 1000) || this.f293841a == 0) {
                mo139581b(viewGroup, i, i2, currentTimeMillis);
            } else if (this.f293843c != 0 || this.f293854n == -1) {
                long j = lVar.f293892a;
                if (j > 0) {
                    v84 v84 = this.f293846f;
                    if (v84 != null) {
                        v84.f299656f += currentTimeMillis - j;
                    }
                    lVar.f293892a = 0;
                    mo139585g(viewGroup, i, i2, currentTimeMillis, false);
                }
                C100319l lVar2 = this.f293849i;
                if (lVar2.f293893b <= 0) {
                    lVar2.f293893b = currentTimeMillis;
                }
            } else {
                mo139581b(viewGroup, i, i2, currentTimeMillis);
            }
        }
    }

    /* renamed from: b */
    public final void mo139581b(ViewGroup viewGroup, int i, int i2, long j) {
        long j2 = j;
        C100319l lVar = this.f293849i;
        if (lVar.f293892a <= 0) {
            lVar.f293892a = j2;
            C100318k kVar = this.f293850j;
            if (kVar != null) {
                kVar.f293891a = j2;
                if (this.f293843c != 0) {
                    mo139585g(viewGroup, i, i2, j, true);
                }
            }
        } else {
            mo139585g(viewGroup, i, i2, j, true);
        }
        C100319l lVar2 = this.f293849i;
        long j3 = lVar2.f293893b;
        if (j3 > 0) {
            v84 v84 = this.f293846f;
            if (v84 != null) {
                v84.f299657g += j2 - j3;
            }
            lVar2.f293893b = 0;
        }
    }

    /* renamed from: c */
    public final C117877b<C100313f, Boolean> mo139582c(View view, int i) {
        String e = this.f293851k.mo87292e(view, i);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        this.f293851k.mo87289b(view, pInt, pInt2, i);
        int max = (this.f293843c != 0 || this.f293862v) ? Math.max(view.getMeasuredHeight(), view.getHeight()) : view.getHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        C117877b c = C117882j.m166284c(Integer.valueOf(Math.min(iArr[1], (int) view.getY())), Integer.valueOf(max));
        int intValue = ((Integer) c.mo182596a(0)).intValue();
        int intValue2 = ((Integer) c.mo182596a(1)).intValue();
        C100313f fVar = new C100313f();
        e74 e74 = new e74();
        fVar.f293867a = e74;
        e74.f298179d = e;
        e74.f298196x = pInt.value;
        e74.f298195w = pInt2.value;
        String a = this.f293851k.mo87288a(view, i);
        e74 e742 = fVar.f293867a;
        String str = "";
        if (a == null) {
            a = str;
        }
        e742.f298197y = a;
        fVar.f293875i = a;
        String f = this.f293851k.mo87293f(view, i);
        e74 e743 = fVar.f293867a;
        if (f != null) {
            str = f;
        }
        e743.f298178A = str;
        e743.f298198z = this.f293851k.mo87290c(view, i);
        e74 e744 = fVar.f293867a;
        e744.f298180e = intValue;
        e744.f298181f = intValue2;
        int i2 = this.f293839D;
        e744.f298182g = i2;
        e744.f298183h = i2 - this.f293838C;
        e744.f298184i = this.f293837B;
        int i3 = this.f293836A;
        if (i3 <= 0) {
            i3 = 144;
        }
        e744.f298185j = i3;
        e744.f298186n = this.f293841a;
        e744.f298187o = this.f293860t;
        fVar.f293868b = i;
        return C117882j.m166284c(fVar, Boolean.valueOf(fVar.mo139595a(this.f293843c)));
    }

    /* renamed from: d */
    public final void mo139583d(ViewGroup viewGroup, int i, int i2) {
        View view;
        String str;
        e74 e74;
        boolean z = true;
        if (this.f293841a == 0) {
            this.f293864x = 0;
        } else {
            if (viewGroup instanceof AbsListView) {
                view = viewGroup.getChildAt(i2 - 1);
                if (view == null) {
                    view = viewGroup.getChildAt(((AbsListView) viewGroup).getLastVisiblePosition());
                }
            } else if (viewGroup instanceof RecyclerView) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
                if (linearLayoutManager != null) {
                    View findViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.mo16959E());
                    if (findViewByPosition == null) {
                        view = viewGroup.getChildAt(linearLayoutManager.mo16959E());
                        if (view == null) {
                            view = viewGroup.getChildAt(i2 - 1);
                        }
                    } else {
                        view = findViewByPosition;
                    }
                } else {
                    view = viewGroup.getChildAt(i2 - 1);
                }
            } else {
                view = null;
            }
            if (view != null) {
                if (this.f293862v) {
                    str = (String) ((ConcurrentHashMap) this.f293848h).get(Integer.valueOf(view.hashCode()));
                    if (str == null && (e74 = mo139587i(view).f293867a) != null) {
                        str = e74.f298179d;
                    }
                } else {
                    str = this.f293851k.mo87292e(view, i2 - 1);
                }
                if (str != null) {
                    if (!str.equals(this.f293866z)) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        this.f293863w = iArr[1];
                        this.f293865y = System.currentTimeMillis();
                        this.f293866z = str;
                    } else {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        int i3 = iArr2[1];
                        int abs = Math.abs(i3 - this.f293863w);
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis - this.f293865y;
                        if (j <= 0 || abs <= this.f293842b) {
                            z = false;
                        } else {
                            this.f293864x = (((long) abs) * 1000) / j;
                            this.f293863w = i3;
                            this.f293865y = currentTimeMillis;
                        }
                    }
                }
            }
        }
        if (z) {
            mo139580a(viewGroup, i, i2);
        }
    }

    /* renamed from: e */
    public final void mo139584e() {
        ViewGroup viewGroup;
        if (this.f293849i != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C100319l lVar = this.f293849i;
            long j = lVar.f293892a;
            if (j > 0) {
                v84 v84 = this.f293846f;
                if (v84 != null) {
                    v84.f299656f += currentTimeMillis - j;
                }
                lVar.f293892a = 0;
                WeakReference<ViewGroup> weakReference = this.f293857q;
                if (!(weakReference == null || (viewGroup = weakReference.get()) == null)) {
                    mo139585g(viewGroup, this.f293858r, this.f293859s, currentTimeMillis, false);
                }
            }
            long j2 = this.f293849i.f293893b;
            if (j2 > 0) {
                v84 v842 = this.f293846f;
                if (v842 != null) {
                    v842.f299657g += currentTimeMillis - j2;
                } else {
                    Log.m105920e("HABBYGE-MALI.FeedMonitor", "_stopComputeTimelineSliceTime mSnsTimeline is NULL 2");
                }
                this.f293849i.f293893b = 0;
            }
            C100319l lVar2 = this.f293849i;
            long j3 = lVar2.f293894c;
            if (j3 > 0) {
                v84 v843 = this.f293846f;
                if (v843 != null) {
                    v843.f299655e += currentTimeMillis - j3;
                }
                lVar2.f293894c = 0;
            }
        }
    }

    /* renamed from: g */
    public final void mo139585g(ViewGroup viewGroup, int i, int i2, long j, boolean z) {
        C100318k kVar;
        C117877b<Map<C100313f, Boolean>, Integer> bVar;
        C117877b<C100313f, Boolean> c;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        if (viewGroup2 != null && (kVar = this.f293850j) != null) {
            this.f293856p = false;
            long j3 = kVar.f293891a;
            if (j3 > 0) {
                long j4 = j2 - j3;
                if (j4 <= 0) {
                    if (this.f293855o) {
                        this.f293855o = false;
                    } else {
                        return;
                    }
                }
                if (this.f293843c != 0) {
                    bVar = mo139586h(viewGroup2, i3, i4, false);
                } else if (viewGroup2 instanceof RecyclerView) {
                    this.f293862v = true;
                    bVar = mo139586h(viewGroup2, i3, i4, true);
                } else {
                    this.f293862v = false;
                    HashMap hashMap = new HashMap();
                    int i5 = 0;
                    for (int i6 = i4 - 1; i6 >= 0; i6--) {
                        View childAt = viewGroup2.getChildAt(i6);
                        if (!(childAt == null || (c = mo139582c(childAt, i6)) == null)) {
                            boolean booleanValue = ((Boolean) c.mo182596a(1)).booleanValue();
                            hashMap.put((C100313f) c.mo182596a(0), Boolean.valueOf(booleanValue));
                            if (booleanValue) {
                                i5++;
                            }
                        }
                    }
                    bVar = C117882j.m166284c(hashMap, Integer.valueOf(i5));
                }
                Map map = (Map) bVar.mo182596a(0);
                int intValue = ((Integer) bVar.mo182596a(1)).intValue();
                if (intValue > 0) {
                    ((ConcurrentHashMap) this.f293845e).clear();
                    double d = (double) j4;
                    double d2 = d / ((double) intValue);
                    for (Map.Entry entry : map.entrySet()) {
                        C100313f fVar = (C100313f) entry.getKey();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            Map<String, Boolean> map2 = this.f293845e;
                            e74 e74 = fVar.f293867a;
                            ((ConcurrentHashMap) map2).put(e74.f298179d, Boolean.valueOf(e74.f298198z));
                            if (((ConcurrentHashMap) this.f293844d).containsKey(fVar.f293867a.f298179d)) {
                                C100313f fVar2 = (C100313f) ((ConcurrentHashMap) this.f293844d).get(fVar.f293867a.f298179d);
                                if (fVar2 != null) {
                                    e74 e742 = fVar2.f293867a;
                                    e742.f298193u += d2;
                                    e742.f298194v += d;
                                    e74 e743 = fVar.f293867a;
                                    e742.f298180e = e743.f298180e;
                                    e742.f298181f = e743.f298181f;
                                    e742.f298186n = e743.f298186n;
                                    e742.f298187o = e743.f298187o;
                                    e742.f298182g = e743.f298182g;
                                    e742.f298183h = e743.f298183h;
                                    ((ConcurrentHashMap) this.f293844d).put(e743.f298179d, fVar2);
                                    e74 e744 = fVar2.f293867a;
                                    e74 e745 = fVar.f293867a;
                                    e744.f298196x = e745.f298196x;
                                    e744.f298195w = e745.f298195w;
                                    e744.f298197y = e745.f298197y;
                                    e744.f298178A = e745.f298178A;
                                    e744.f298198z = e745.f298198z;
                                }
                            } else {
                                e74 e746 = fVar.f293867a;
                                e746.f298193u = d2;
                                e746.f298194v = d;
                                ((ConcurrentHashMap) this.f293844d).put(e746.f298179d, fVar);
                            }
                        }
                    }
                    if (z) {
                        this.f293850j.f293891a = j2;
                    } else {
                        this.f293850j.f293891a = 0;
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final C117877b<Map<C100313f, Boolean>, Integer> mo139586h(ViewGroup viewGroup, int i, int i2, boolean z) {
        int i3;
        View view;
        C117877b<C100313f, Boolean> bVar;
        LinearLayoutManager linearLayoutManager;
        HashMap hashMap = new HashMap();
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        int i4 = 0;
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            if (recyclerView == null) {
                view = viewGroup.getChildAt(i5);
                i3 = i5;
            } else {
                WeakReference<LinearLayoutManager> weakReference = this.f293861u;
                if (weakReference == null || (linearLayoutManager = weakReference.get()) == null) {
                    linearLayoutManager = (LinearLayoutManager) ((RecyclerView) viewGroup).getLayoutManager();
                    if (linearLayoutManager == null) {
                    } else {
                        this.f293861u = new WeakReference<>(linearLayoutManager);
                    }
                }
                i3 = i + i5;
                view = linearLayoutManager.findViewByPosition(i3);
                if (view == null && (view = viewGroup.getChildAt(i5)) == null) {
                    view = viewGroup.getChildAt(i3);
                }
            }
            if (view != null) {
                if (z) {
                    C100313f i6 = mo139587i(view);
                    if (i6.f293867a != null) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        e74 e74 = i6.f293867a;
                        e74.f298180e = iArr[1];
                        String str = e74.f298179d;
                        if (str != null && !str.equals("")) {
                            ((ConcurrentHashMap) this.f293848h).put(Integer.valueOf(view.hashCode()), i6.f293867a.f298179d);
                        }
                    }
                    bVar = C117882j.m166284c(i6, Boolean.valueOf(i6.mo139595a(this.f293843c)));
                } else {
                    bVar = mo139582c(view, i3);
                }
                if (bVar != null) {
                    boolean booleanValue = ((Boolean) bVar.mo182596a(1)).booleanValue();
                    hashMap.put((C100313f) bVar.mo182596a(0), Boolean.valueOf(booleanValue));
                    if (booleanValue) {
                        i4++;
                    }
                }
            }
        }
        return C117882j.m166284c(hashMap, Integer.valueOf(i4));
    }

    /* renamed from: i */
    public final C100313f mo139587i(View view) {
        C100313f fVar = new C100313f();
        fVar.f293867a = new e74();
        if (view == null) {
            return fVar;
        }
        Map<String, Object> us = ((C61212e) C86312j.m106911c(C61212e.class)).mo86185us(view);
        try {
            if (us instanceof Map) {
                String str = (String) us.get("sns_feed_id");
                if (TextUtils.isEmpty(str)) {
                    return fVar;
                }
                e74 e74 = fVar.f293867a;
                e74.f298179d = str;
                e74.f298197y = (String) us.get("sns_feed_username");
                fVar.f293875i = (String) us.get("sns_feed_share_name");
                fVar.f293867a.f298178A = (String) us.get("sns_nick_name");
                e74 e742 = fVar.f293867a;
                boolean z = true;
                if (((Integer) us.get("sns_feed_is_ad")).intValue() != 1) {
                    z = false;
                }
                e742.f298198z = z;
                fVar.f293867a.f298183h = ((Integer) us.get("sns_feed_virtual_key_height")).intValue();
                fVar.f293867a.f298184i = ((Integer) us.get("sns_feed_status_bar_height")).intValue();
                fVar.f293867a.f298185j = ((Integer) us.get("sns_feed_action_bar_height")).intValue();
                fVar.f293868b = ((Integer) us.get("sns_feed_position")).intValue();
                fVar.f293867a.f298196x = ((Integer) us.get("sns_feed_like_count")).intValue();
                fVar.f293867a.f298195w = ((Integer) us.get("sns_feed_comment_count")).intValue();
                fVar.f293867a.f298182g = ((Integer) us.get("sns_feed_screen_height")).intValue();
                fVar.f293867a.f298181f = Math.max(view.getMeasuredHeight(), view.getHeight());
                e74 e743 = fVar.f293867a;
                e743.f298186n = this.f293841a;
                e743.f298187o = this.f293860t;
            }
            return fVar;
        } catch (Exception unused) {
            Log.m105920e("HABBYGE-MALI.FeedMonitor", "new snsUI get amoeba sdk  params err");
            return fVar;
        }
    }

    /* renamed from: j */
    public final void mo139588j(Activity activity) {
        Display display;
        try {
            if (this.f293840E == null) {
                this.f293840E = (WindowManager) MMApplicationContext.getContext().getSystemService("window");
            }
            display = this.f293840E.getDefaultDisplay();
        } catch (Exception unused) {
            if (activity != null) {
                display = activity.getWindowManager().getDefaultDisplay();
            } else {
                return;
            }
        }
        Point point = new Point();
        display.getSize(point);
        Point point2 = new Point();
        display.getRealSize(point2);
        this.f293838C = point.y;
        this.f293839D = point2.y;
    }

    /* renamed from: k */
    public final void mo139589k(Activity activity) {
        if (this.f293837B <= 0 && activity != null) {
            Resources resources = activity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID));
            this.f293837B = dimensionPixelSize;
            if (dimensionPixelSize <= 0) {
                this.f293837B = resources.getDimensionPixelSize(C0966R.dimen.a54);
            }
        }
    }

    /* renamed from: l */
    public final void mo139590l(String str, String str2) {
        v84 v84 = new v84();
        this.f293846f = v84;
        v84.f299655e = 0;
        v84.f299660j = this.f293852l;
        v84.f299661n = this.f293853m;
        if (str == null) {
            str = "";
        }
        v84.f299654d = str;
        v84.f299659i = str2;
        C64208c.f181965o = str;
        Log.m105925i("HABBYGE-MALI.FeedMonitor", "initTimelineParams: %s, %s", str, str2);
        v84 v842 = this.f293846f;
        v842.f299656f = 0;
        v842.f299657g = 0;
        ((ConcurrentHashMap) this.f293844d).clear();
        this.f293849i = new C100319l();
        this.f293850j = new C100318k();
    }

    /* renamed from: m */
    public void mo139591m(int i, Activity activity) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (i == 0) {
            this.f293841a = 0;
            mo139589k(activity);
            mo139588j(activity);
            int a = C21199a.m23656a();
            Log.m105925i("HABBYGE-MALI.FeedMonitor", "startMonitor activityMethod: %d", Integer.valueOf(a));
            if (a == 0) {
                mo139590l(C23462b.m28021f().mo36920d(), C112764f.m154260c());
                this.f293855o = true;
            } else if (a == 1) {
                this.f293855o = true;
                WeakReference<ViewGroup> weakReference = this.f293857q;
                if (weakReference != null && (viewGroup = weakReference.get()) != null) {
                    mo139583d(viewGroup, this.f293858r, this.f293859s);
                }
            } else if (a == 7) {
                if (System.currentTimeMillis() - this.f293847g > 30000) {
                    Log.m105924i("HABBYGE-MALI.FeedMonitor", "_handleActivityMethod.BACK_2_FRONT: New Session");
                    MMHandlerThread.postToMainThread(new C100310b(this, C23462b.m28021f().mo36920d(), C112764f.m154260c()));
                    return;
                }
                this.f293855o = true;
                WeakReference<ViewGroup> weakReference2 = this.f293857q;
                if (weakReference2 != null && (viewGroup2 = weakReference2.get()) != null) {
                    mo139583d(viewGroup2, this.f293858r, this.f293859s);
                }
            }
        } else if (i == 1) {
            int a2 = C21199a.m23656a();
            Log.m105925i("HABBYGE-MALI.FeedMonitor", "stopMonitor, activityMethod: %s", Integer.valueOf(a2));
            if (a2 == 0) {
                mo139584e();
            } else if (a2 == 1) {
                MMHandlerThread.postToMainThread(new C100309a(this));
            } else if (a2 == 8) {
                mo139584e();
                this.f293847g = System.currentTimeMillis();
            }
        } else if (i == 2) {
            Map<String, C100313f> map = this.f293844d;
            if (map != null) {
                ((ConcurrentHashMap) map).clear();
            }
            ((ConcurrentHashMap) this.f293848h).clear();
            this.f293840E = null;
            WeakReference<ViewGroup> weakReference3 = this.f293857q;
            if (weakReference3 != null) {
                weakReference3.clear();
                this.f293857q = null;
            }
        } else if (i == 3) {
            MMHandlerThread.postToMainThread(new C100309a(this));
        } else if (i == 4) {
            this.f293841a = 0;
            mo139589k(activity);
            mo139588j(activity);
            mo139590l(C23462b.m28021f().mo36920d(), C112764f.m154260c());
            this.f293855o = true;
            this.f293856p = true;
            WeakReference<ViewGroup> weakReference4 = this.f293857q;
            if (weakReference4 != null && (viewGroup3 = weakReference4.get()) != null) {
                mo139583d(viewGroup3, Math.max(this.f293858r, 0), Math.max(this.f293859s, 1));
            }
        } else if (i == 5) {
            this.f293856p = false;
            MMHandlerThread.postToMainThread(new C100309a(this));
        }
    }

    /* renamed from: n */
    public void mo139592n(boolean z) {
        ViewGroup viewGroup;
        WeakReference<ViewGroup> weakReference = this.f293857q;
        if (weakReference != null && (viewGroup = weakReference.get()) != null) {
            mo139580a(viewGroup, z ? 0 : this.f293858r, viewGroup.getChildCount());
        }
    }

    /* renamed from: o */
    public void mo139593o(Activity activity, ViewGroup viewGroup, int i, int i2, int i3) {
        ActionBar supportActionBar;
        if (viewGroup instanceof RecyclerView) {
            this.f293851k.setRecyclerView((RecyclerView) viewGroup);
        }
        WeakReference<ViewGroup> weakReference = this.f293857q;
        if (weakReference == null || weakReference.get() == null) {
            this.f293857q = new WeakReference<>(viewGroup);
        }
        this.f293858r = i;
        this.f293859s = i2;
        int i4 = this.f293841a;
        if (i4 == 1) {
            try {
                if (Math.abs(i3) > this.f293842b) {
                    if (i3 > 0) {
                        this.f293860t = -1;
                    } else if (i3 < 0) {
                        this.f293860t = 1;
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.FeedMonitor", e, "scrollingState, crash: %s", e.getMessage());
            }
        } else if (i4 == 0 && this.f293836A <= 0 && activity != null) {
            try {
                if ((activity instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) activity).getSupportActionBar()) != null) {
                    this.f293836A = supportActionBar.mo91099j().getHeight();
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("HABBYGE-MALI.FeedMonitor", e2, "initBarHeight", new Object[0]);
            }
        }
        mo139583d(viewGroup, i, i2);
    }

    /* renamed from: p */
    public void mo139594p(ViewGroup viewGroup, int i) {
        this.f293841a = i;
        WeakReference<ViewGroup> weakReference = this.f293857q;
        if (weakReference == null || weakReference.get() == null) {
            this.f293857q = new WeakReference<>(viewGroup);
        }
        if (viewGroup instanceof RecyclerView) {
            this.f293851k.setRecyclerView((RecyclerView) viewGroup);
        }
        if (i == 0) {
            this.f293860t = 0;
        }
        if (this.f293843c == 0 && i != 2) {
            this.f293854n = -1;
        }
        if (this.f293856p) {
            this.f293856p = false;
            mo139585g(viewGroup, Math.max(this.f293858r, 0), Math.max(this.f293859s, 1), System.currentTimeMillis(), true);
        }
    }
}
