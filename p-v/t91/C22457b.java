package t91;

import aa1.C91980d;
import android.content.Intent;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponentActivity;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import e91.C116711b;
import gy3.C8480h;
import gy3.C87412m;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p217oq.C11716d;
import r91.C22218b;
import u91.C22623c;
import z04.C112551y;

/* renamed from: t91.b */
public final class C22457b {

    /* renamed from: a */
    public String f63602a;

    /* renamed from: b */
    public String f63603b;

    /* renamed from: c */
    public boolean f63604c;

    /* renamed from: d */
    public boolean f63605d = true;

    /* renamed from: e */
    public C22218b f63606e;

    /* renamed from: f */
    public WeakReference<UIComponentActivity> f63607f;
    private Field field_activity;
    private Field field_fragments;

    /* renamed from: g */
    public WeakReference<UIComponentFragment> f63608g;

    /* renamed from: h */
    public int f63609h = -1;

    /* renamed from: i */
    public int f63610i = -1;

    /* renamed from: j */
    public boolean f63611j;

    /* renamed from: k */
    public Object f63612k = new Object();

    /* renamed from: l */
    public final HashMap<String, Pair<String, List<Pair<String, String>>>> f63613l;

    /* renamed from: m */
    public final C22458a f63614m;

    /* renamed from: t91.b$a */
    public static final class C22458a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C22457b f63615a;

        public C22458a(C22457b bVar) {
            this.f63615a = bVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (str != null && C112551y.m153819s(str, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$", false)) {
                if (!C87412m.m108589b("onUserVisibleFragmentChange", str2) || !C87412m.m108589b("(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V", str3)) {
                    if (C87412m.m108589b("onFragmentChange", str2) && C87412m.m108589b("(IIII)V", str3) && objArr != null && objArr.length >= 4) {
                        C22457b bVar = this.f63615a;
                        Integer num = objArr[0];
                        C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                        bVar.f63610i = num.intValue();
                        C22457b bVar2 = this.f63615a;
                        Integer num2 = objArr[1];
                        C87412m.m108592e(num2, "null cannot be cast to non-null type kotlin.Int");
                        bVar2.f63609h = num2.intValue();
                        if (obj != null) {
                            C22457b bVar3 = this.f63615a;
                            UIComponentFragment b = bVar3.mo35599b(obj, bVar3.f63609h);
                            UIComponentFragment c = bVar3.mo35600c(obj, bVar3.f63610i);
                            UIComponentActivity a = C22457b.m26165a(bVar3, obj);
                            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            MMActivity mMActivity = (MMActivity) a;
                            WeakReference<UIComponentActivity> weakReference = bVar3.f63607f;
                            String str4 = null;
                            if ((weakReference != null ? weakReference.get() : null) == null) {
                                bVar3.f63607f = new WeakReference<>(mMActivity);
                            }
                            C22218b bVar4 = bVar3.f63606e;
                            if (bVar4 != null) {
                                String name = b != null ? b.getClass().getName() : null;
                                if (!C87412m.m108589b(name, c != null ? c.getClass().getName() : null) || name == null) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("switchFragment, cur=");
                                    sb.append(b != null ? b.getClass().getName() : null);
                                    sb.append(", last=");
                                    if (c != null) {
                                        str4 = c.getClass().getName();
                                    }
                                    sb.append(str4);
                                    Log.m105924i("HABBYGE-MALI.FinderHomeMonitor", sb.toString());
                                    if (c != null) {
                                        bVar4.mo35349a(mMActivity, c, currentTimeMillis, 1);
                                    }
                                    if (b != null) {
                                        bVar4.mo35350b(mMActivity, b, currentTimeMillis, 0);
                                    }
                                }
                            }
                        }
                    }
                } else if (objArr != null && objArr.length >= 3) {
                    Boolean bool = objArr[0];
                    C87412m.m108592e(bool, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = bool.booleanValue();
                    Integer num3 = objArr[1];
                    C87412m.m108592e(num3, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = num3.intValue();
                    UIComponentFragment uIComponentFragment = objArr[2];
                    C87412m.m108592e(uIComponentFragment, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentFragment");
                    UIComponentFragment uIComponentFragment2 = uIComponentFragment;
                    if (booleanValue) {
                        C22457b bVar5 = this.f63615a;
                        if (intValue == bVar5.f63609h) {
                            bVar5.f63608g = new WeakReference<>(uIComponentFragment2);
                            return;
                        }
                        return;
                    }
                    C22457b bVar6 = this.f63615a;
                    if (intValue == bVar6.f63610i) {
                        new WeakReference(uIComponentFragment2);
                        bVar6.getClass();
                    }
                }
            }
        }
    }

    public C22457b() {
        HashMap<String, Pair<String, List<Pair<String, String>>>> hashMap = new HashMap<>();
        this.f63613l = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V"));
        arrayList.add(new Pair("onFragmentChange", "(IIII)V"));
        hashMap.put("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$", new Pair("com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", arrayList));
        Class<FinderFragmentChangeObserver> cls = FinderFragmentChangeObserver.class;
        try {
            Field declaredField = cls.getDeclaredField(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.field_activity = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField("fragments");
            this.field_fragments = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.FinderFragmentCallback", e, "FinderFragmentCallback reflect crash: " + e.getMessage(), new Object[0]);
        }
        this.f63610i = -1;
        this.f63602a = null;
        this.f63603b = null;
        this.f63604c = false;
        this.f63605d = true;
        this.f63606e = new C22218b();
        this.f63614m = new C22458a(this);
    }

    /* renamed from: a */
    public static final UIComponentActivity m26165a(C22457b bVar, Object obj) {
        bVar.getClass();
        try {
            Field field = bVar.field_activity;
            Object obj2 = field != null ? field.get(obj) : null;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentActivity");
            return (UIComponentActivity) obj2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final UIComponentFragment mo35599b(Object obj, int i) {
        UIComponentFragment uIComponentFragment = null;
        if (obj == null || i < 0) {
            WeakReference<UIComponentFragment> weakReference = this.f63608g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
        try {
            return mo35600c(obj, i);
        } catch (Exception unused) {
            WeakReference<UIComponentFragment> weakReference2 = this.f63608g;
            if (weakReference2 != null) {
                uIComponentFragment = weakReference2.get();
            }
            return uIComponentFragment;
        }
    }

    /* renamed from: c */
    public final UIComponentFragment mo35600c(Object obj, int i) {
        if (i < 0) {
            return null;
        }
        try {
            Field field = this.field_fragments;
            Object obj2 = field != null ? field.get(obj) : null;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Object obj3 = ((List) obj2).get(i);
            C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentFragment");
            return (UIComponentFragment) obj3;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.FinderFragmentCallback", e, "getFragment exception: " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (gy3.C87412m.m108589b(r4.f65065b, r6) != false) goto L_0x0058;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35601d(androidx.fragment.app.FragmentActivity r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r10, r0)
            r91.b r0 = r9.f63606e
            r1 = 0
            r2 = 0
            java.lang.String r3 = "HABBYGE-MALI.FinderHomeMonitor"
            if (r0 == 0) goto L_0x0091
            u91.c r4 = r0.f62957d
            if (r4 == 0) goto L_0x0013
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = "com.tencent.mm.plugin.finder.ui.FinderHomeUI"
            java.lang.String r4 = e91.C116711b.m164583h(r4)
            java.lang.String r5 = "com.tencent.mm.plugin.finder.ui.FinderConversationUI"
            java.lang.String r5 = e91.C116711b.m164583h(r5)
            java.lang.String r6 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
            java.lang.String r6 = e91.C116711b.m164583h(r6)
            u91.c r7 = r0.f62957d
            java.lang.String r8 = "statyTimeStaticHome"
            if (r7 == 0) goto L_0x008d
            java.lang.String r7 = r7.f65065b
            boolean r4 = gy3.C87412m.m108589b(r7, r4)
            if (r4 != 0) goto L_0x0058
            u91.c r4 = r0.f62957d
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r4.f65065b
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 != 0) goto L_0x0058
            u91.c r4 = r0.f62957d
            if (r4 == 0) goto L_0x0050
            java.lang.String r4 = r4.f65065b
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x0091
            goto L_0x0058
        L_0x0050:
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x0054:
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x0058:
            u91.c r4 = r0.f62957d
            if (r4 == 0) goto L_0x0089
            r4.f65068e = r11
            long r5 = r4.f65067d
            long r5 = r11 - r5
            r4.f65066c = r5
            java.lang.String r5 = "143"
            r4.f65070g = r5
            java.lang.String r5 = e91.C116711b.m164580e()
            r4.f65069f = r5
            u91.c r0 = r0.f62957d
            if (r0 == 0) goto L_0x0085
            java.lang.String r4 = r0.f65073j
            if (r4 != 0) goto L_0x007a
            java.lang.String r4 = p217oq.C11716d.f34294a
            r0.f65073j = r4
        L_0x007a:
            u91.a$a r4 = u91.C22618a.f65058a
            r4.mo35741b(r0)
            java.lang.String r0 = "onFinderHomeUIPause..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0091
        L_0x0085:
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x0089:
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x008d:
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x0091:
            boolean r0 = r9.f63605d
            if (r0 == 0) goto L_0x00a1
            r9.f63605d = r1
            r9.f63602a = r2
            r91.b r0 = r9.f63606e
            if (r0 == 0) goto L_0x00f2
            r0.mo35353e(r10, r11, r1)
            goto L_0x00f2
        L_0x00a1:
            java.lang.String r0 = r9.f63602a
            if (r0 == 0) goto L_0x00c1
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = r9.f63602a
            boolean r0 = gy3.C87412m.m108589b(r0, r4)
            if (r0 != 0) goto L_0x00c1
            r9.f63605d = r1
            r9.f63602a = r2
            r91.b r0 = r9.f63606e
            if (r0 == 0) goto L_0x00f2
            r0.mo35353e(r10, r11, r1)
            goto L_0x00f2
        L_0x00c1:
            r91.b r0 = r9.f63606e
            if (r0 == 0) goto L_0x00f2
            androidx.fragment.app.Fragment r4 = r0.mo35351c(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "switch2Back: "
            r1.append(r5)
            if (r4 == 0) goto L_0x00de
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
        L_0x00de:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            if (r4 != 0) goto L_0x00eb
            goto L_0x00f2
        L_0x00eb:
            r7 = 3
            r2 = r0
            r3 = r10
            r5 = r11
            r2.mo35349a(r3, r4, r5, r7)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t91.C22457b.mo35601d(androidx.fragment.app.FragmentActivity, long):void");
    }

    /* renamed from: e */
    public final void mo35602e(FragmentActivity fragmentActivity, long j) {
        String str;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        long j2 = j;
        C87412m.m108594g(fragmentActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C22218b bVar = this.f63606e;
        if (bVar != null) {
            C22623c cVar = r8;
            C22623c cVar2 = new C22623c((String) null, (String) null, 0, 0, 0, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 4095, (C8480h) null);
            bVar.f62957d = cVar;
            cVar.f65064a = C91980d.vx0().mo84751Wb();
            C22623c cVar3 = bVar.f62957d;
            if (cVar3 != null) {
                cVar3.f65065b = C116711b.m164583h(fragmentActivity.getClass().getName());
                C22623c cVar4 = bVar.f62957d;
                if (cVar4 != null) {
                    cVar4.f65067d = j2;
                    cVar4.f65070g = "143";
                    cVar4.f65071h = 0;
                    Intent intent = fragmentActivity.getIntent();
                    String str2 = "";
                    if (intent == null || (str = intent.getStringExtra("key_extra_info")) == null) {
                        str = str2;
                    }
                    cVar4.f65073j = str;
                    C22623c cVar5 = bVar.f62957d;
                    if (cVar5 != null) {
                        String str3 = cVar5.f65073j;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        C11716d.f34294a = str2;
                        Log.m105924i("HABBYGE-MALI.FinderHomeMonitor", "onFinderHomeUIResume...");
                    } else {
                        C87412m.m108603p("statyTimeStaticHome");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("statyTimeStaticHome");
                    throw null;
                }
            } else {
                C87412m.m108603p("statyTimeStaticHome");
                throw null;
            }
        }
        if (this.f63603b != null && !C87412m.m108589b(fragmentActivity.getClass().getName(), this.f63603b) && !this.f63604c) {
            this.f63604c = false;
            this.f63603b = null;
            this.f63602a = null;
            C22218b bVar2 = this.f63606e;
            if (bVar2 != null) {
                bVar2.mo35353e(fragmentActivity2, j2, true);
            }
        } else if (this.f63604c) {
            this.f63604c = false;
            this.f63603b = null;
            this.f63602a = null;
        } else {
            String str4 = null;
            C22218b bVar3 = this.f63606e;
            if (bVar3 != null) {
                Fragment c = bVar3.mo35351c(fragmentActivity2);
                StringBuilder sb = new StringBuilder();
                sb.append("switch2Front: ");
                if (c != null) {
                    str4 = c.getClass().getName();
                }
                sb.append(str4);
                Log.m105918d("HABBYGE-MALI.FinderHomeMonitor", sb.toString());
                if (c != null) {
                    bVar3.mo35350b(fragmentActivity, c, j, 2);
                }
            }
        }
    }
}
