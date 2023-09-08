package x22;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.C116072d;
import com.tencent.p014mm.p136ui.base.MMGridPaper;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint;
import com.tencent.p014mm.plugin.location.p069ui.impl.TrackPointAnimAvatar;
import com.tencent.p014mm.plugin.location_soso.ViewManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import p702ts.C78085c;
import qo3.C77390c0;
import t22.C101715i;
import t22.C118351p;
import t22.C77832s;
import te3.C118475vf3;
import te3.ep4;
import te3.ii4;
import y22.C118911c;
import y22.C118913e;

/* renamed from: x22.s */
public class C118812s {

    /* renamed from: x */
    public static Object f355460x = new Object();

    /* renamed from: a */
    public Context f355461a;

    /* renamed from: b */
    public List<ep4> f355462b;

    /* renamed from: c */
    public ep4 f355463c;

    /* renamed from: d */
    public TrackPoint f355464d;

    /* renamed from: e */
    public boolean f355465e = false;

    /* renamed from: f */
    public boolean f355466f = false;

    /* renamed from: g */
    public boolean f355467g = true;

    /* renamed from: h */
    public boolean f355468h = false;

    /* renamed from: i */
    public boolean f355469i = false;

    /* renamed from: j */
    public boolean f355470j = false;

    /* renamed from: k */
    public ii4 f355471k;

    /* renamed from: l */
    public C118913e f355472l;

    /* renamed from: m */
    public boolean f355473m;

    /* renamed from: n */
    public boolean f355474n = true;

    /* renamed from: o */
    public float f355475o = 0.0f;

    /* renamed from: p */
    public float f355476p = 0.0f;

    /* renamed from: q */
    public boolean f355477q = false;

    /* renamed from: r */
    public long f355478r = 0;

    /* renamed from: s */
    public View.OnTouchListener f355479s = new C118813a();

    /* renamed from: t */
    public View.OnClickListener f355480t = new C53285b(this);

    /* renamed from: u */
    public View.OnClickListener f355481u = new C118814c();

    /* renamed from: v */
    public C92411b.C92412a f355482v = new C118815d();

    /* renamed from: w */
    public C118351p.C118353b f355483w = new C118816e();

    /* renamed from: x22.s$b */
    public class C53285b implements View.OnClickListener {
        public C53285b(C118812s sVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x22.s$a */
    public class C118813a implements View.OnTouchListener {
        public C118813a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action != 0) {
                boolean z = true;
                if (action != 1) {
                    if (action == 2 && (Math.abs(motionEvent.getX() - C118812s.this.f355475o) > 10.0f || Math.abs(motionEvent.getY() - C118812s.this.f355476p) > 10.0f)) {
                        C118812s.this.f355477q = true;
                    }
                } else if (!C118812s.this.f355477q) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C118812s sVar = C118812s.this;
                    if (currentTimeMillis - sVar.f355478r < 200) {
                        if (sVar.f355469i) {
                            sVar.mo183520c(false);
                        }
                        Collection<Object> childs = sVar.f355472l.getChilds();
                        Iterator<Object> it = childs.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            Object next = it.next();
                            if (next instanceof TrackPoint) {
                                if (((TrackPoint) next).f346477e.getVisibility() == 0) {
                                    break;
                                }
                            }
                        }
                        for (Object next2 : childs) {
                            if (next2 instanceof TrackPoint) {
                                if (z) {
                                    ((TrackPoint) next2).mo175553a();
                                } else {
                                    TrackPoint trackPoint = (TrackPoint) next2;
                                    trackPoint.f346477e.setVisibility(0);
                                    ViewManager viewManager = trackPoint.f346485p;
                                    if (viewManager != null) {
                                        viewManager.toggleViewVisible(trackPoint.f346477e);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                C118812s.this.f355475o = motionEvent.getX();
                C118812s.this.f355476p = motionEvent.getY();
                C118812s.this.f355478r = System.currentTimeMillis();
                C118812s.this.f355477q = false;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: x22.s$c */
    public class C118814c implements View.OnClickListener {
        public C118814c() {
        }

        public void onClick(View view) {
            int i;
            int i2;
            int i3;
            int i4;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            C118812s sVar = C118812s.this;
            int i5 = iArr[0];
            int i6 = iArr[1];
            if (sVar.f355462b != null) {
                ArrayList arrayList2 = new ArrayList();
                float fromDPToPix = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(sVar.f355461a, 85.0f);
                Iterator it = ((ArrayList) sVar.f355462b).iterator();
                while (it.hasNext()) {
                    ep4 ep4 = (ep4) it.next();
                    C118913e eVar = sVar.f355472l;
                    C118475vf3 vf32 = ep4.f353979e;
                    int i7 = i5;
                    Point pointByGeoPoint = eVar.getPointByGeoPoint(vf32.f354500d, vf32.f354501e);
                    Log.m105919d("MicroMsg.TrackPointViewMgrImpl", "cal %f %f %d %d", Double.valueOf(ep4.f353979e.f354500d), Double.valueOf(ep4.f353979e.f354501e), Integer.valueOf(pointByGeoPoint.x), Integer.valueOf(pointByGeoPoint.y));
                    int i8 = pointByGeoPoint.x - i7;
                    int i9 = pointByGeoPoint.y - i6;
                    if (Math.sqrt((double) ((i8 * i8) + (i9 * i9))) < ((double) fromDPToPix)) {
                        arrayList2.add(ep4.f353978d);
                    }
                    i5 = i7;
                }
                int i15 = i5;
                ep4 ep42 = sVar.f355463c;
                if (ep42 != null) {
                    C118913e eVar2 = sVar.f355472l;
                    C118475vf3 vf33 = ep42.f353979e;
                    Point pointByGeoPoint2 = eVar2.getPointByGeoPoint(vf33.f354500d, vf33.f354501e);
                    Log.m105919d("MicroMsg.TrackPointViewMgrImpl", "cal %f %f %d %d", Double.valueOf(sVar.f355463c.f353979e.f354500d), Double.valueOf(sVar.f355463c.f353979e.f354501e), Integer.valueOf(pointByGeoPoint2.x), Integer.valueOf(pointByGeoPoint2.y));
                    int i16 = pointByGeoPoint2.x - i15;
                    int i17 = pointByGeoPoint2.y - i6;
                    if (Math.sqrt((double) ((i16 * i16) + (i17 * i17))) < ((double) fromDPToPix)) {
                        arrayList2.add(sVar.f355463c.f353978d);
                    }
                }
                Log.m105919d("MicroMsg.TrackPointViewMgrImpl", "cal username size %d ", Integer.valueOf(arrayList2.size()));
                if (arrayList2.size() > 1) {
                    C115669n.INSTANCE.mo160131h(10997, "12", 0, 0, 0);
                    Context context = sVar.f355461a;
                    Log.m105919d("MicroMsg.AvatarsDialog", "showDialog, username.size = %d", Integer.valueOf(arrayList2.size()));
                    C77390c0 c0Var = new C77390c0(context, C0966R.style.a7b);
                    ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6533hg, (ViewGroup) null);
                    MMGridPaper mMGridPaper = (MMGridPaper) viewGroup.findViewById(C0966R.C0970id.c6k);
                    mMGridPaper.f348206B = 8;
                    mMGridPaper.f348207C = 15;
                    mMGridPaper.setDialogMode(true);
                    mMGridPaper.f348211G = 3;
                    mMGridPaper.f348210F = 3;
                    mMGridPaper.setMaxRow(3);
                    mMGridPaper.setMaxCol(3);
                    mMGridPaper.setHeaderView((View) null);
                    mMGridPaper.f348206B = 8;
                    mMGridPaper.f348207C = 15;
                    mMGridPaper.setItemWidthInDp(70);
                    mMGridPaper.setItemHeightInDp(70);
                    c0Var.setCanceledOnTouchOutside(true);
                    c0Var.setContentView(viewGroup);
                    C118793a aVar = new C118793a();
                    mMGridPaper.setGridPaperAdapter(aVar);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add((String) it4.next());
                    }
                    if (arrayList3.size() < 3) {
                        mMGridPaper.setMaxCol(arrayList3.size());
                    } else {
                        mMGridPaper.setMaxCol(3);
                    }
                    ViewGroup.LayoutParams layoutParams = mMGridPaper.getLayoutParams();
                    int b = C76577a.m92151b(context, 70);
                    int b2 = C76577a.m92151b(context, 8);
                    if (arrayList3.size() > 0) {
                        if (arrayList3.size() < 3) {
                            i3 = arrayList3.size() * b;
                            i4 = b2 * (arrayList3.size() - 1);
                        } else {
                            i3 = b * 3;
                            i4 = b2 * 2;
                        }
                        i = i4 + i3;
                    } else {
                        i = 0;
                    }
                    Log.m105919d("MicroMsg.AvatarsDialog", "calculateGridWidth, result = %d, mUsername.size = %d, avatarSize = %d, densityType = %s", Integer.valueOf(i), Integer.valueOf(arrayList3.size()), Integer.valueOf(b), BackwardSupportUtil.BitmapFactory.getDisplayDensityType(context));
                    layoutParams.width = i;
                    int b3 = C76577a.m92151b(context, 70);
                    int b4 = C76577a.m92151b(context, 15);
                    if (arrayList3.size() > 0) {
                        if (arrayList3.size() > 3) {
                            if (arrayList3.size() <= 6) {
                                b3 *= 2;
                            } else {
                                b3 = (b3 * 3) + (b4 * 2);
                                b4 = C76577a.m92151b(context, 10);
                            }
                        }
                        i2 = b3 + b4;
                        Log.m105919d("MicroMsg.AvatarsDialog", "calculateGridHeight, result = %d", Integer.valueOf(i2));
                    } else {
                        i2 = 0;
                    }
                    layoutParams.height = i2;
                    mMGridPaper.setLayoutParams(layoutParams);
                    mMGridPaper.requestLayout();
                    aVar.f355422b.clear();
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        aVar.f355422b.add((String) it5.next());
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(aVar.f348349a == null);
                    Log.m105925i("MicroMsg.MMGridPaperAdapter", "notifyDataSetChange, notifier is null ? %B", objArr);
                    C116072d.C116073a aVar2 = aVar.f348349a;
                    if (aVar2 != null) {
                        MMGridPaper.this.mo177262f();
                    }
                    c0Var.show();
                }
                arrayList2.size();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x22.s$d */
    public class C118815d implements C92411b.C92412a {
        public C118815d() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            TrackPoint trackPoint;
            if (!z) {
                return false;
            }
            C118812s sVar = C118812s.this;
            double d4 = (double) f2;
            double d5 = (double) f;
            sVar.getClass();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[refreshMyLocation] ");
            stringBuffer.append(String.format("latitude = %f, longtitude = %f", new Object[]{Double.valueOf(d4), Double.valueOf(d5)}));
            if (sVar.f355463c == null) {
                sVar.f355463c = new ep4();
                sVar.f355463c.f353979e = new C118475vf3();
                String s = C75592q0.m90789s();
                ep4 ep4 = sVar.f355463c;
                ep4.f353978d = s;
                C118475vf3 vf32 = ep4.f353979e;
                vf32.f354500d = d4;
                vf32.f354501e = d5;
                if (sVar.f355473m && sVar.f355465e) {
                    sVar.mo183522e();
                }
            }
            ep4 ep42 = sVar.f355463c;
            C118475vf3 vf33 = ep42.f353979e;
            vf33.f354500d = d4;
            vf33.f354501e = d5;
            Object viewByItag = sVar.f355472l.getViewByItag(ep42.f353978d);
            if (viewByItag != null) {
                stringBuffer.append("[ view is not null hasCode: " + viewByItag.hashCode() + " ] ");
                trackPoint = viewByItag;
            } else {
                TrackPoint trackPoint2 = new TrackPoint(sVar.f355461a, (ViewManager) sVar.f355472l.getViewManager(), C0966R.C0969drawable.chu);
                sVar.f355472l.addView(trackPoint2, 0.0d, 0.0d, sVar.f355463c.f353978d);
                ViewManager viewManager = trackPoint2.f346485p;
                if (viewManager != null) {
                    double d6 = d4;
                    double d7 = d5;
                    viewManager.addView(trackPoint2.f346477e, d6, d7);
                    trackPoint2.f346485p.addView(trackPoint2.f346478f, d6, d7);
                }
                if (sVar.f355470j) {
                    trackPoint2.setOnAvatarOnClickListener((View.OnClickListener) null);
                    trackPoint2.setOnLocationOnClickListener((View.OnClickListener) null);
                    trackPoint2.mo175553a();
                } else {
                    trackPoint2.setOnAvatarOnClickListener(sVar.f355481u);
                    trackPoint2.setOnLocationOnClickListener(sVar.f355480t);
                }
                trackPoint2.setAvatar(sVar.f355463c.f353978d);
                stringBuffer.append("[view is null new one: " + trackPoint2.hashCode() + " ] ");
                new TrackPointAnimAvatar(sVar.f355461a);
                trackPoint = trackPoint2;
            }
            Log.m105918d("MicroMsg.TrackPointViewMgrImpl", stringBuffer.toString());
            if (trackPoint instanceof TrackPoint) {
                sVar.f355464d = (TrackPoint) trackPoint;
                Log.m105918d("MicroMsg.TrackPointViewMgrImpl", "udpate view layout");
                TrackPoint trackPoint3 = sVar.f355464d;
                ViewManager viewManager2 = trackPoint3.f346485p;
                if (viewManager2 != null) {
                    double d8 = d4;
                    double d9 = d5;
                    viewManager2.updateViewLayout(trackPoint3.f346477e, d8, d9, false);
                    trackPoint3.f346485p.updateLocationPinLayout(trackPoint3.f346478f, d8, d9, false);
                }
                if (!sVar.f355467g) {
                    sVar.f355464d.getClass();
                } else {
                    sVar.f355464d.getClass();
                }
            }
            if (sVar.f355474n) {
                C118911c iController = sVar.f355472l.getIController();
                C118475vf3 vf34 = sVar.f355463c.f353979e;
                iController.setCenter(vf34.f354500d, vf34.f354501e);
            }
            return true;
        }
    }

    /* renamed from: x22.s$e */
    public class C118816e implements C118351p.C118353b {
        public C118816e() {
        }

        /* renamed from: a */
        public void mo183155a(double d) {
            if (C118812s.this.f355464d != null) {
                Log.m105919d("MicroMsg.TrackPointViewMgrImpl", "updateMyTrackPointDegree, degree = %f", Double.valueOf(d));
                TrackPoint trackPoint = C118812s.this.f355464d;
                trackPoint.f346479g = d;
                ViewManager viewManager = trackPoint.f346485p;
                if (viewManager != null) {
                    viewManager.updateRotation(trackPoint.f346478f, (float) d);
                }
            }
        }
    }

    /* renamed from: x22.s$f */
    public class C118817f implements C113177k.C113181e {
        public C118817f() {
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126412f(C118812s.this.f355482v, true);
                C77832s.xx0().mo183152b(C118812s.this.f355483w);
            }
        }
    }

    public C118812s(Context context, C118913e eVar, boolean z) {
        this.f355461a = context;
        this.f355473m = z;
        this.f355472l = eVar;
        this.f355462b = new ArrayList();
        eVar.setMapViewOnTouchListener(this.f355479s);
    }

    /* renamed from: a */
    public void mo183518a(C118913e eVar) {
        if (this.f355463c != null) {
            if (eVar.getZoomLevel() < 15) {
                C118911c iController = eVar.getIController();
                C118475vf3 vf32 = this.f355463c.f353979e;
                iController.animateTo(vf32.f354500d, vf32.f354501e, 15);
                return;
            }
            C118911c iController2 = eVar.getIController();
            C118475vf3 vf33 = this.f355463c.f353979e;
            iController2.animateTo(vf33.f354500d, vf33.f354501e);
        }
    }

    /* renamed from: b */
    public void mo183519b() {
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.LOCAION, new C118817f())) {
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126412f(this.f355482v, true);
            C77832s.xx0().mo183152b(this.f355483w);
        }
    }

    /* renamed from: c */
    public void mo183520c(boolean z) {
        if (z) {
            if (this.f355464d != null) {
                C115669n.INSTANCE.mo160131h(10997, "20", 0, 0, 0);
                this.f355469i = z;
                return;
            }
            return;
        }
        this.f355469i = z;
    }

    /* renamed from: d */
    public void mo183521d(boolean z) {
        C118913e eVar;
        if (z && !this.f355468h && (eVar = this.f355472l) != null) {
            for (Object next : eVar.getChilds()) {
                if (next instanceof TrackPoint) {
                    TrackPoint trackPoint = (TrackPoint) next;
                    trackPoint.f346477e.setVisibility(0);
                    ViewManager viewManager = trackPoint.f346485p;
                    if (viewManager != null) {
                        viewManager.toggleViewVisible(trackPoint.f346477e);
                    }
                }
            }
        }
        this.f355468h = z;
    }

    /* renamed from: e */
    public final void mo183522e() {
        ep4 ep4;
        double d;
        if (!this.f355466f && (ep4 = this.f355463c) != null) {
            if (ep4 != null) {
                LocationInfo locationInfo = C77832s.Ax0().f353747p;
                double d2 = 0.0d;
                if (this.f355463c == null || !C101715i.m133627d(locationInfo.f271930e, locationInfo.f271931f)) {
                    d = 0.0d;
                } else {
                    d2 = Math.abs(this.f355463c.f353979e.f354500d - locationInfo.f271930e) * 2.0d;
                    d = Math.abs(this.f355463c.f353979e.f354501e - locationInfo.f271931f) * 2.0d;
                }
                double d3 = d2;
                double d4 = d;
                for (int i = 0; i < ((ArrayList) this.f355462b).size(); i++) {
                    ep4 ep42 = (ep4) ((ArrayList) this.f355462b).get(i);
                    if (ep42 != null) {
                        C118475vf3 vf32 = ep42.f353979e;
                        if (C101715i.m133627d(vf32.f354500d, vf32.f354501e)) {
                            double abs = Math.abs(ep42.f353979e.f354500d - this.f355463c.f353979e.f354500d) * 2.0d;
                            double abs2 = Math.abs(ep42.f353979e.f354501e - this.f355463c.f353979e.f354501e) * 2.0d;
                            if (abs > d3) {
                                d3 = abs;
                            }
                            if (abs2 > d4) {
                                d4 = abs2;
                            }
                            Log.m105919d("MicroMsg.TrackPointViewMgrImpl", "update %s %f %f", ep42.f353978d, Double.valueOf(ep42.f353979e.f354500d), Double.valueOf(ep42.f353979e.f354501e));
                        }
                    }
                }
                if (Math.abs(d3 - -1000.0d) >= 0.5d && Math.abs(d4 - -1000.0d) >= 0.5d) {
                    Log.m105918d("MicroMsg.TrackPointViewMgrImpl", "zoomToSpan maxlat " + (d3 * 1000000.0d) + " maxlng " + (1000000.0d * d4) + " poi " + locationInfo.f271930e + " " + locationInfo.f271931f);
                    ep4 ep43 = this.f355463c;
                    if (ep43 != null) {
                        Log.m105919d("MicroMsg.TrackPointViewMgrImpl", "mPosition item %f %f", Double.valueOf(ep43.f353979e.f354500d), Double.valueOf(this.f355463c.f353979e.f354501e));
                        C118913e eVar = this.f355472l;
                        C118475vf3 vf33 = this.f355463c.f353979e;
                        eVar.zoomToSpan(vf33.f354500d, vf33.f354501e, d3, d4);
                    } else if (C101715i.m133627d(locationInfo.f271930e, locationInfo.f271931f)) {
                        this.f355472l.zoomToSpan(locationInfo.f271930e, locationInfo.f271931f, d3, d4);
                    }
                }
            }
            this.f355466f = true;
        }
    }
}
