package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ZoomControls;
import com.tencent.mapsdk.internal.C113701eo;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.mapsdk.internal.C114065pl;
import com.tencent.mapsdk.internal.C114165rp;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.bl */
public final class C113558bl implements C26873al, C113535bd, C113717fb, C113723fh, C113727fl {

    /* renamed from: a */
    public static final String f339834a = "key_change_style";

    /* renamed from: b */
    public ViewGroup f339835b = null;

    /* renamed from: c */
    public C114322sx f339836c;

    /* renamed from: d */
    public C114175rr f339837d;

    /* renamed from: e */
    public C114165rp f339838e;

    /* renamed from: f */
    public C114063pk f339839f;

    /* renamed from: g */
    public C114065pl.C114066a f339840g;

    /* renamed from: h */
    public Bundle f339841h;

    /* renamed from: i */
    public List<C113701eo> f339842i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public Handler f339843j = new Handler(C113865kb.m157395a("gesture")) {
        public final void handleMessage(Message message) {
            Object obj;
            C113558bl blVar;
            ViewGroup viewGroup;
            String str;
            if (message != null && (obj = message.obj) != null) {
                C113739fu fuVar = (C113739fu) obj;
                int i = fuVar.f340295f;
                if (i == 0) {
                    C114175rr rrVar = C113558bl.this.f339837d;
                    if (rrVar != null) {
                        boolean z = fuVar.f340296g;
                        boolean z2 = fuVar.f340297h;
                        if (rrVar.f341814b != null) {
                            C113865kb.m157399a((Runnable) new Runnable(z, z2) {
                                public final void run() {
                                    C114175rr.this.f341814b.setIsZoomInEnabled(r2);
                                    C114175rr.this.f341814b.setIsZoomOutEnabled(r3);
                                }
                            });
                        }
                    }
                } else if (i == 1) {
                    C114165rp rpVar = C113558bl.this.f339838e;
                    if (rpVar != null) {
                        int i2 = fuVar.f340298i;
                        double d = fuVar.f340299j;
                        rpVar.f341785k = i2;
                        rpVar.f341786l = d;
                        int width = rpVar.f341767a.getWidth();
                        if (width <= 0) {
                            width = 1000;
                        }
                        int ceil = (int) Math.ceil((double) (((float) width) / 4.0f));
                        int ceil2 = (int) (Math.ceil((double) ((((float) rpVar.f341779d) * 3.0f) / 8.0f)) - ((double) (rpVar.f341784j * 6.0f)));
                        float[] fArr = C114165rp.f341740f;
                        int length = fArr.length;
                        int i3 = rpVar.f341785k - rpVar.f341790p;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        if (i3 >= length) {
                            i3 = length - 1;
                        }
                        float f = fArr[i3];
                        if (rpVar.f341781g != f) {
                            rpVar.f341781g = f;
                            C113865kb.m157399a((Runnable) new Runnable() {
                                public final void run() {
                                    C114165rp.this.f341775ak.mo171577b(C114165rp.this.f341781g);
                                }
                            });
                        }
                        float f2 = (float) ceil;
                        double d2 = rpVar.f341786l;
                        if (d2 != 0.0d) {
                            f2 = (float) (((double) f) / d2);
                        }
                        int round = Math.round(f2);
                        rpVar.f341783i = round;
                        if (round > ceil2) {
                            rpVar.f341783i = ceil2;
                        } else if (round < ceil) {
                            rpVar.f341783i = ceil;
                        }
                        if (f >= 1000.0f) {
                            f /= 1000.0f;
                            str = "公里";
                        } else {
                            str = "米";
                        }
                        rpVar.f341782h = ((int) f) + str;
                        rpVar.mo172799f();
                    }
                } else if (i == 3 && C113798hb.f340501i == 1) {
                    if (!TextUtils.equals(C114207sl.f341931c, "wechat") && (viewGroup = blVar.f339835b) != null) {
                        if ((blVar = C113558bl.this).f339839f == null) {
                            blVar.f339839f = new C114063pk(viewGroup.getContext().getApplicationContext(), C113558bl.this.f339836c.f339876d_);
                            C113558bl blVar2 = C113558bl.this;
                            blVar2.f339839f.f341300b = blVar2.f339840g;
                        }
                        C113558bl blVar3 = C113558bl.this;
                        blVar3.f339839f.mo171999a(blVar3.f339835b, (Bundle) null);
                    }
                } else if (i == 2 && C113558bl.this.f339836c.f342537T) {
                    boolean b = C114367v.m160528b(fuVar.f340301l);
                    VectorMap vectorMap = (VectorMap) C113558bl.this.f339836c.f339878e_;
                    String str2 = b ? C114005ny.f340984b : C114005ny.f340983a;
                    C114216sq sqVar = vectorMap.f342909o.f340899g;
                    if (sqVar != null && 0 != sqVar.f342024e) {
                        sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(str2) {
                            /* renamed from: a */
                            public final void mo54067a(GL10 gl10) {
                                if (C114216sq.this.f342024e != 0) {
                                    C114216sq.this.f342023d.nativeSetCompassImage(C114216sq.this.f342024e, r6);
                                }
                            }
                        });
                    }
                }
            }
        }
    };

    /* renamed from: n */
    private TencentMapOptions f339844n;

    /* renamed from: o */
    private C114097qd f339845o;

    /* renamed from: p */
    private int f339846p;

    /* renamed from: q */
    private boolean f339847q = false;

    /* renamed from: com.tencent.mapsdk.internal.bl$3 */
    public static /* synthetic */ class C1135613 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f339850a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.mapsdk.internal.eo$b[] r0 = com.tencent.mapsdk.internal.C113701eo.C113703b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f339850a = r0
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f339850a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f339850a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f339850a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113558bl.C1135613.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.bl$a */
    public interface C113562a {
        /* renamed from: a */
        void mo171699a();
    }

    public C113558bl(C113536be beVar, ViewGroup viewGroup, C113572bv bvVar) {
        this.f339835b = viewGroup;
        if (bvVar != null) {
            C114322sx sxVar = (C114322sx) beVar.mo171634b();
            this.f339836c = sxVar;
            this.f339844n = sxVar.mo171547K();
            ((VectorMap) this.f339836c.f339878e_).f342909o.f340901i.mo171216a((C113727fl) this);
            if (bvVar instanceof View) {
                View view = (View) bvVar;
                if (this.f339835b.indexOfChild(view) < 0) {
                    this.f339835b.addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
                    this.f339835b.requestLayout();
                }
            }
            C114165rp rpVar = new C114165rp(this.f339835b.getContext().getApplicationContext(), this.f339836c, ((VectorMap) this.f339836c.f339878e_).mo173487o());
            this.f339838e = rpVar;
            this.f339836c.f342586m = rpVar;
            C114097qd qdVar = new C114097qd(beVar);
            this.f339845o = qdVar;
            this.f339838e.f341795u = qdVar;
            this.f339836c.f342587n = qdVar;
            this.f339837d = new C114175rr(this.f339835b.getContext(), this.f339836c);
            this.f339842i.add(this.f339838e);
            this.f339842i.add(this.f339837d);
            this.f339842i.add(this.f339845o);
            this.f339836c.mo171560a((C113717fb) this);
            C114322sx sxVar2 = this.f339836c;
            sxVar2.f342579av.remove(this);
            sxVar2.f342579av.add(this);
            this.f339836c.mo171561a((C113723fh) this);
        }
    }

    /* renamed from: k */
    private void m156219k() {
        ViewGroup viewGroup = this.f339835b;
        C114322sx sxVar = this.f339836c;
        if (viewGroup != null && sxVar != null) {
            Handler handler = this.f339843j;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            ((VectorMap) sxVar.f339878e_).f342909o.f340901i.mo171232b((C113727fl) this);
            sxVar.f342579av.remove(this);
            sxVar.mo171580b((C113717fb) this);
            viewGroup.removeAllViews();
            for (C113701eo c : this.f339842i) {
                c.mo172000c();
            }
            this.f339842i.clear();
        }
    }

    /* renamed from: h */
    public final void mo54056h(boolean z) {
        this.f339836c.mo171598f(z);
    }

    /* renamed from: i */
    public final void mo54058i(boolean z) {
        this.f339836c.f342657ay = z;
        mo54044d(z);
        mo54050f(z);
        mo54053g(z);
        mo54056h(z);
    }

    /* renamed from: j */
    public final void mo171696j() {
        C113865kb.m157399a((Runnable) new Runnable() {
            public final void run() {
                C113558bl blVar = C113558bl.this;
                Bundle bundle = blVar.f339841h;
                for (C113701eo a : blVar.f339842i) {
                    a.mo171999a(blVar.f339835b, bundle);
                }
            }
        });
    }

    /* renamed from: l */
    public final void mo54062l(boolean z) {
        M m;
        C113961mq mqVar;
        C113503ad adVar;
        C114322sx sxVar = this.f339836c;
        if (sxVar != null && (m = sxVar.f339878e_) != null && (mqVar = ((VectorMap) m).f342909o) != null && (adVar = mqVar.f340901i) != null) {
            adVar.f339674L = z;
        }
    }

    /* renamed from: m */
    public final void mo54063m(boolean z) {
        M m;
        C113961mq mqVar;
        C113503ad adVar;
        C114322sx sxVar = this.f339836c;
        if (sxVar != null && (m = sxVar.f339878e_) != null && (mqVar = ((VectorMap) m).f342909o) != null && (adVar = mqVar.f340901i) != null) {
            adVar.f339675M = z;
        }
    }

    /* renamed from: n */
    public final void mo54064n(boolean z) {
        C114322sx sxVar;
        C113497ab abVar;
        C114097qd qdVar = this.f339845o;
        ViewGroup viewGroup = qdVar.f341486b;
        if (viewGroup != null && (sxVar = qdVar.f341490f) != null) {
            if (z) {
                qdVar.f341487c = true;
            } else {
                qdVar.f341487c = false;
            }
            boolean z2 = qdVar.f341487c;
            if (viewGroup != null && sxVar != null) {
                if (qdVar.f341485a == null) {
                    if (z2) {
                        qdVar.mo172695e();
                    } else {
                        return;
                    }
                }
                VectorMap vectorMap = (VectorMap) qdVar.f341490f.f339878e_;
                if (!qdVar.f341487c || !z2 || (abVar = qdVar.f341489e) == null || !abVar.f339625f) {
                    qdVar.mo172694a((IndoorBuilding) null);
                    if (qdVar.f341485a.getVisibility() != 8) {
                        qdVar.f341485a.setVisibility(8);
                        return;
                    }
                    return;
                }
                qdVar.mo172694a(vectorMap.f342911q.mo171356u());
            }
        }
    }

    /* renamed from: o */
    public final void mo54065o(boolean z) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.f341788n = !z;
            rpVar.mo172798e();
        }
    }

    /* renamed from: b */
    public final void mo54038b(boolean z) {
        C114322sx sxVar = this.f339836c;
        if (sxVar.f342537T != z) {
            C113739fu fuVar = new C113739fu();
            fuVar.f340295f = 2;
            for (C113717fb a : sxVar.f342590q) {
                a.mo171693a(fuVar);
            }
        }
        sxVar.f342537T = z;
        C113503ad adVar = ((VectorMap) sxVar.f339878e_).f342909o.f340901i;
        adVar.f339669G = z;
        adVar.f339696z.mo171638f().mo172932b(adVar.f339669G);
        ((VectorMap) sxVar.f339878e_).f342909o.f340914v = true;
    }

    /* renamed from: c */
    public final void mo54041c(boolean z) {
        this.f339847q = z;
        C114175rr rrVar = this.f339837d;
        rrVar.f341818f = z;
        if (z && rrVar.f341815c == null) {
            rrVar.mo172816b(rrVar.f341813a);
        }
        C92456rq rqVar = rrVar.f341815c;
        if (rqVar != null) {
            rqVar.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: d */
    public final void mo54044d(boolean z) {
        this.f339836c.mo171583b(z);
    }

    /* renamed from: e */
    public final void mo54047e(boolean z) {
        this.f339836c.mo171588c(z);
    }

    /* renamed from: f */
    public final void mo54050f(boolean z) {
        this.f339836c.mo171593d(z);
    }

    /* renamed from: g */
    public final void mo54053g(boolean z) {
        this.f339836c.mo171596e(z);
    }

    /* renamed from: h */
    public final boolean mo54057h() {
        C114097qd qdVar = this.f339845o;
        if (qdVar != null) {
            return qdVar.f341487c;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo54060j(boolean z) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            if (rpVar.f341787m != z) {
                rpVar.f341787m = z;
                List<C114165rp.C114173c> list = rpVar.f341792r;
                if (list != null) {
                    for (C114165rp.C114173c b : list) {
                        b.mo171687b(rpVar.f341789o, new Rect(rpVar.f341793s, rpVar.f341794t, 0, 0), rpVar.f341787m);
                    }
                }
            }
            rpVar.mo172798e();
        }
    }

    /* renamed from: a */
    private void m156209a(C113562a aVar) {
        C114175rr rrVar = this.f339837d;
        if (rrVar != null) {
            rrVar.f341816d = aVar;
        }
    }

    /* renamed from: d */
    public final boolean mo54045d() {
        return this.f339836c.mo171602g();
    }

    /* renamed from: e */
    public final boolean mo54048e() {
        return this.f339836c.mo171605h();
    }

    /* renamed from: f */
    public final boolean mo54051f() {
        return this.f339836c.mo171607i();
    }

    /* renamed from: g */
    public final boolean mo54054g() {
        return this.f339836c.mo171609j();
    }

    /* renamed from: d */
    public final void mo54043d(int i) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.mo172792a(C113701eo.C113702a.BOTTOM, i);
            this.f339838e.mo172801h();
            mo171696j();
        }
    }

    /* renamed from: e */
    public final void mo54046e(int i) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.mo172797b(C113701eo.C113703b.m156708a(i));
            mo171696j();
        }
    }

    /* renamed from: f */
    public final void mo54049f(int i) {
        C114322sx sxVar = this.f339836c;
        if (sxVar != null) {
            sxVar.mo171554a(i);
        }
    }

    /* renamed from: g */
    public final void mo54052g(int i) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.f341780e = i;
            rpVar.f341791q = Float.MIN_VALUE;
            rpVar.mo172801h();
        }
    }

    /* renamed from: h */
    public final void mo54055h(int i) {
        C114175rr rrVar = this.f339837d;
        if (rrVar != null) {
            rrVar.mo171998a(C113701eo.C113703b.m156708a(i));
        }
    }

    /* renamed from: a */
    public final void mo54034a(boolean z) {
        C114175rr rrVar = this.f339837d;
        rrVar.f341819g = z;
        if (z && rrVar.f341814b == null) {
            rrVar.mo172815a(rrVar.f341813a);
        }
        ZoomControls zoomControls = rrVar.f341814b;
        if (zoomControls != null) {
            zoomControls.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: i */
    public final void mo171695i(int i) {
        if (this.f339841h == null) {
            this.f339841h = new Bundle();
        }
        this.f339841h.putInt(f339834a, i);
        mo171696j();
        C113739fu fuVar = new C113739fu();
        fuVar.f340295f = 2;
        fuVar.f340301l = i;
        mo171693a(fuVar);
    }

    /* renamed from: c */
    public final boolean mo54042c() {
        return this.f339847q;
    }

    /* renamed from: c */
    public final void mo54040c(int i) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.mo172792a(C113701eo.C113702a.LEFT, i);
            this.f339838e.mo172801h();
            mo171696j();
        }
    }

    /* renamed from: a */
    public final boolean mo54035a() {
        ZoomControls zoomControls = this.f339837d.f341814b;
        return zoomControls != null && zoomControls.getVisibility() == 0;
    }

    /* renamed from: a */
    private void m156208a(Bundle bundle) {
        for (C113701eo a : this.f339842i) {
            a.mo171999a(this.f339835b, bundle);
        }
    }

    /* renamed from: i */
    public final boolean mo54059i() {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            return rpVar.f341787m;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54030a(int i, float f) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            C113701eo.C113702a a = C113701eo.C113702a.m156707a(i);
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            rpVar.f341778c[a.f340162e] = f;
            rpVar.mo172801h();
            mo171696j();
        }
    }

    /* renamed from: k */
    public final void mo54061k(boolean z) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.f341777b = z;
            ImageView imageView = rpVar.f341767a;
            if (imageView != null) {
                imageView.setVisibility(z ? 0 : 4);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo54039b() {
        return this.f339836c.f342537T;
    }

    /* renamed from: a */
    public final float mo54028a(int i) {
        C114165rp rpVar = this.f339838e;
        if (rpVar == null) {
            return 0.0f;
        }
        return rpVar.f341778c[C113701eo.C113702a.m156707a(i).f340162e];
    }

    /* renamed from: b */
    public final void mo171655b(int i, int i2) {
        this.f339846p = i2;
        for (C113701eo b : this.f339842i) {
            b.mo171655b(i, i2);
        }
        mo171696j();
    }

    /* renamed from: a */
    public final void mo54032a(int i, int i2, int i3, int i4, int i5) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.mo171998a(C113701eo.C113703b.m156708a(i));
            this.f339838e.mo172792a(C113701eo.C113702a.TOP, i2);
            this.f339838e.mo172792a(C113701eo.C113702a.BOTTOM, i3);
            this.f339838e.mo172792a(C113701eo.C113702a.LEFT, i4);
            this.f339838e.mo172792a(C113701eo.C113702a.RIGHT, i5);
            this.f339838e.mo172801h();
            mo171696j();
        }
    }

    /* renamed from: b */
    public final void mo54036b(int i) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.mo171998a(C113701eo.C113703b.m156708a(i));
            mo171696j();
        }
    }

    /* renamed from: b */
    public final void mo54037b(int i, int i2, int i3, int i4, int i5) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            rpVar.mo172797b(C113701eo.C113703b.m156708a(i));
            this.f339838e.mo172796b(C113701eo.C113702a.TOP, i2);
            this.f339838e.mo172796b(C113701eo.C113702a.BOTTOM, i3);
            this.f339838e.mo172796b(C113701eo.C113702a.LEFT, i4);
            this.f339838e.mo172796b(C113701eo.C113702a.RIGHT, i5);
            this.f339838e.mo172802i();
            mo171696j();
        }
    }

    /* renamed from: a */
    public final void mo54033a(int i, int[] iArr) {
        if (this.f339838e != null) {
            C113701eo.C113703b a = C113701eo.C113703b.m156708a(i);
            this.f339838e.mo171998a(a);
            int i2 = C1135613.f339850a[a.ordinal()];
            if (i2 == 1) {
                this.f339838e.mo172792a(C113701eo.C113702a.TOP, iArr[0]);
                this.f339838e.mo172792a(C113701eo.C113702a.LEFT, iArr[1]);
            } else if (i2 == 2) {
                this.f339838e.mo172792a(C113701eo.C113702a.BOTTOM, iArr[0]);
                this.f339838e.mo172792a(C113701eo.C113702a.LEFT, iArr[1]);
            } else if (i2 == 3) {
                this.f339838e.mo172792a(C113701eo.C113702a.BOTTOM, iArr[0]);
                this.f339838e.mo172792a(C113701eo.C113702a.RIGHT, iArr[1]);
            } else if (i2 == 4) {
                this.f339838e.mo172792a(C113701eo.C113702a.TOP, iArr[0]);
                this.f339838e.mo172792a(C113701eo.C113702a.RIGHT, iArr[1]);
            }
            this.f339838e.mo172801h();
            mo171696j();
        }
    }

    /* renamed from: b */
    private void m156213b(boolean z, List<C114193ry> list) {
        C114322sx sxVar;
        C114165rp rpVar = this.f339838e;
        if (rpVar != null && (sxVar = this.f339836c) != null && sxVar.f339878e_ != null) {
            rpVar.mo172794a(list);
            if (z) {
                this.f339838e.mo172800g();
            }
            this.f339838e.mo172793a(this.f339836c.mo172976U(), ((C113961mq) this.f339836c.f339876d_).mo171803l());
        }
    }

    /* renamed from: a */
    public final void mo171693a(C113739fu fuVar) {
        int i = fuVar.f340295f;
        if (i != -1) {
            this.f339843j.sendMessage(this.f339843j.obtainMessage(i, fuVar));
        }
    }

    /* renamed from: a */
    public final void mo54031a(int i, int i2) {
        C114322sx sxVar = this.f339836c;
        if (sxVar != null) {
            sxVar.mo171555a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo54029a(float f) {
        C114165rp rpVar = this.f339838e;
        if (rpVar != null) {
            if (f > 1.3f) {
                f = 1.3f;
            }
            if (f < 0.7f) {
                f = 0.7f;
            }
            rpVar.f341780e = 0;
            rpVar.f341791q = f;
            rpVar.mo172801h();
        }
    }

    /* renamed from: a */
    private void m156211a(C114165rp.C114173c cVar, TencentMapOptions tencentMapOptions) {
        C114165rp rpVar;
        if (tencentMapOptions != null && tencentMapOptions.getExtSurface() != null && (rpVar = this.f339838e) != null) {
            List<C114165rp.C114173c> list = rpVar.f341792r;
            if (!(list == null || cVar == null)) {
                list.add(cVar);
            }
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            this.f339835b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
            mo171655b(extSurfaceWidth, extSurfaceHeight);
        }
    }

    /* renamed from: a */
    public final void mo171694a(C114065pl.C114066a aVar, TencentMapOptions tencentMapOptions) {
        if (tencentMapOptions != null && tencentMapOptions.getExtSurface() != null) {
            this.f339840g = aVar;
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            this.f339835b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
            mo171655b(extSurfaceWidth, extSurfaceHeight);
        }
    }

    /* renamed from: a */
    public final void mo171632a(boolean z, List<C114193ry> list) {
        C114322sx sxVar;
        C114165rp rpVar = this.f339838e;
        if (rpVar != null && (sxVar = this.f339836c) != null && sxVar.f339878e_ != null) {
            rpVar.mo172794a(list);
            if (z) {
                this.f339838e.mo172800g();
            }
            this.f339838e.mo172793a(this.f339836c.mo172976U(), ((C113961mq) this.f339836c.f339876d_).mo171803l());
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m156210a(C113558bl blVar, Bundle bundle) {
        for (C113701eo a : blVar.f339842i) {
            a.mo171999a(blVar.f339835b, bundle);
        }
    }
}
