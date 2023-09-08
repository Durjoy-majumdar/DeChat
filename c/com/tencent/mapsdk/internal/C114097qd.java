package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mapsdk.internal.C113701eo;
import com.tencent.mapsdk.internal.C114103qe;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.qd */
public final class C114097qd extends C113699em implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, C114103qe.C114104a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final int f341459A = Color.parseColor("#979797");

    /* renamed from: l */
    private static final String f341460l = "VIEW_TAG_HEADER";

    /* renamed from: m */
    private static final String f341461m = "VIEW_TAG_FOOTER";

    /* renamed from: n */
    private static final float f341462n = 2.7f;

    /* renamed from: o */
    private static final float f341463o = 44.0f;

    /* renamed from: p */
    private static final float f341464p = 13.0f;

    /* renamed from: q */
    private static final float f341465q = 26.0f;

    /* renamed from: r */
    private static final float f341466r = 9.5f;

    /* renamed from: s */
    private static final float f341467s = 37.0f;

    /* renamed from: t */
    private static final float f341468t = 4.0f;

    /* renamed from: u */
    private static final float f341469u = 45.0f;

    /* renamed from: v */
    private static final float f341470v = 15.0f;

    /* renamed from: x */
    private static final int f341471x = -1;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final int f341472y = Color.parseColor("#333333");

    /* renamed from: z */
    private static final int f341473z = -1;

    /* renamed from: B */
    private C114101a f341474B;

    /* renamed from: C */
    private Context f341475C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f341476D = -1;

    /* renamed from: E */
    private int f341477E = 0;

    /* renamed from: F */
    private IndoorBuilding f341478F;

    /* renamed from: G */
    private String f341479G;

    /* renamed from: H */
    private boolean f341480H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f341481I;

    /* renamed from: J */
    private C104565pz f341482J;

    /* renamed from: K */
    private C104565pz f341483K;

    /* renamed from: L */
    private C114101a.C114102a f341484L = null;

    /* renamed from: a */
    public C104567qb f341485a;

    /* renamed from: b */
    public ViewGroup f341486b;

    /* renamed from: c */
    public boolean f341487c = false;

    /* renamed from: d */
    public boolean f341488d = false;

    /* renamed from: e */
    public C113497ab f341489e;

    /* renamed from: f */
    public C114322sx f341490f;

    /* renamed from: g */
    public int f341491g;

    /* renamed from: h */
    public int f341492h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C114103qe f341493i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C104566qa f341494j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f341495k = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f341496w = 0;

    /* renamed from: com.tencent.mapsdk.internal.qd$a */
    public class C114101a extends BaseAdapter {

        /* renamed from: b */
        private Context f341501b;

        /* renamed from: c */
        private List<IndoorLevel> f341502c;

        /* renamed from: com.tencent.mapsdk.internal.qd$a$a */
        public class C114102a {

            /* renamed from: a */
            public TextView f341503a;

            /* renamed from: b */
            public View f341504b;

            public C114102a(TextView textView, View view) {
                this.f341503a = textView;
                this.f341504b = view;
            }
        }

        public C114101a(Context context, List<IndoorLevel> list) {
            this.f341501b = context;
            this.f341502c = list;
        }

        /* renamed from: a */
        public final void mo172704a(List<IndoorLevel> list) {
            this.f341502c = list;
            notifyDataSetChanged();
        }

        public final int getCount() {
            List<IndoorLevel> list = this.f341502c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public final Object getItem(int i) {
            List<IndoorLevel> list = this.f341502c;
            if (list == null) {
                return null;
            }
            return list.get(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            FrameLayout frameLayout;
            TextView textView;
            View view2;
            List<IndoorLevel> list = this.f341502c;
            if (list == null || list.size() == 0) {
                return null;
            }
            if (view != null) {
                C114102a aVar = (C114102a) view.getTag();
                textView = aVar.f341503a;
                view2 = aVar.f341504b;
                frameLayout = view;
            } else {
                FrameLayout frameLayout2 = new FrameLayout(this.f341501b);
                view2 = new View(this.f341501b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) C114097qd.this.f341495k) * 26.5d), (int) (((double) C114097qd.this.f341495k) * 26.5d));
                if (C114097qd.this.f341494j == null) {
                    C104566qa unused = C114097qd.this.f341494j = new C104566qa();
                    C114097qd.this.f341494j.setBounds(0, 0, layoutParams.width, layoutParams.height);
                }
                view2.setBackground(C114097qd.this.f341494j);
                layoutParams.gravity = 17;
                frameLayout2.addView(view2, layoutParams);
                textView = new TextView(this.f341501b);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine();
                textView.setGravity(17);
                textView.setTextSize(2, C114097qd.f341464p);
                int e = (int) (((double) C114097qd.this.f341495k) * 10.0d);
                textView.setPadding(0, e, 0, e);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) (C114097qd.this.f341495k * 37.5f));
                layoutParams2.gravity = 17;
                frameLayout2.addView(textView, layoutParams2);
                frameLayout2.setTag(new C114102a(textView, view2));
                frameLayout = frameLayout2;
            }
            textView.setText(this.f341502c.get(i).getName());
            if (i != C114097qd.this.f341476D) {
                textView.setTextColor(C114097qd.this.f341481I ? C114097qd.f341459A : C114097qd.f341472y);
                view2.setVisibility(4);
            } else {
                boolean unused2 = C114097qd.this.f341481I;
                textView.setTextColor(-1);
                view2.setVisibility(0);
            }
            return frameLayout;
        }
    }

    public C114097qd(C113536be beVar) {
        C114322sx sxVar = (C114322sx) beVar.mo171634b();
        this.f341490f = sxVar;
        this.f341486b = sxVar.f339875d;
        this.f341481I = beVar.mo171644l();
        this.f341475C = this.f341486b.getContext().getApplicationContext();
        this.f341487c = true;
    }

    /* renamed from: j */
    private boolean m159028j() {
        return this.f341487c;
    }

    /* renamed from: k */
    private void m159029k() {
        boolean l = this.f341490f.f342647aD.mo171803l();
        C113889km.m157545b(C0949kl.f2236f, "updateIndoorStyle isDark: cur[" + l + "]|old[" + this.f341481I + "]");
        if (l != this.f341481I) {
            this.f341485a.setDarkStyle(l);
            this.f341482J.setDarkStyle(l);
            this.f341483K.setDarkStyle(l);
            this.f341474B.notifyDataSetChanged();
            this.f341481I = l;
        }
    }

    /* renamed from: l */
    private void m159030l() {
        IndoorBuilding indoorBuilding = this.f341478F;
        if (indoorBuilding != null) {
            int activeLevelIndex = indoorBuilding.getActiveLevelIndex();
            List<IndoorLevel> levels = this.f341478F.getLevels();
            if (levels != null && activeLevelIndex < levels.size() && activeLevelIndex != -1 && levels.get(activeLevelIndex) != null) {
                String str = this.f341479G;
                if (str == null || !this.f341488d || !str.equals(this.f341478F.getBuidlingId())) {
                    this.f341493i.setSelectionFromTop(activeLevelIndex, ((int) (((double) (this.f341495k * f341467s)) + 0.5d)) * 2);
                } else {
                    this.f341493i.setItemChecked(activeLevelIndex, true);
                    this.f341488d = false;
                }
                this.f341476D = activeLevelIndex;
                this.f341479G = this.f341478F.getBuidlingId();
            }
        }
    }

    /* renamed from: m */
    private void m159031m() {
        C114103qe qeVar = this.f341493i;
        if (qeVar != null) {
            qeVar.getLayoutParams().width = m159006a((Adapter) this.f341474B);
            this.f341493i.requestLayout();
        }
    }

    /* renamed from: n */
    private void m159032n() {
        if (this.f341486b != null && this.f341485a != null) {
            int i = (this.f341491g * 2) + ((int) (((double) this.f341495k) * 16.700000762939453d));
            if (C114207sl.f341931c.equals("wechat") && this.f341486b.getMeasuredHeight() > this.f341492h) {
                int measuredHeight = this.f341486b.getMeasuredHeight() - this.f341492h;
                int i2 = this.f341491g;
                i = ((int) (((double) this.f341495k) * 16.700000762939453d)) + i2 + (measuredHeight - i2);
            }
            int i3 = this.f341477E;
            if (((float) i3) >= 4.0f) {
                this.f341496w = (int) (((double) this.f341495k) * 148.5d);
                if (this.f341486b.getMeasuredHeight() > this.f341496w + i) {
                    this.f341480H = false;
                    return;
                }
                this.f341496w = (int) (((double) this.f341495k) * 111.5d);
                if (this.f341486b.getMeasuredHeight() > i + this.f341496w) {
                    this.f341480H = false;
                    return;
                }
            } else {
                this.f341496w = (int) ((((double) (((float) i3) * f341467s)) + 0.5d) * ((double) this.f341495k));
                if (this.f341486b.getMeasuredHeight() > i + this.f341496w) {
                    this.f341480H = false;
                    return;
                }
            }
            this.f341480H = true;
        }
    }

    /* renamed from: a */
    public final void mo171998a(C113701eo.C113703b bVar) {
    }

    /* renamed from: c */
    public final void mo172000c() {
    }

    /* renamed from: d */
    public final C113701eo.C113703b mo172001d() {
        return null;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        M m = this.f341490f.f339878e_;
        if (m != null) {
            C114101a.C114102a aVar = this.f341484L;
            if (aVar != null) {
                aVar.f341503a.setTextColor(-16777216);
                this.f341484L.f341504b.setVisibility(4);
            }
            C114101a.C114102a aVar2 = (C114101a.C114102a) view.getTag();
            aVar2.f341503a.setTextColor(-1);
            aVar2.f341504b.setVisibility(0);
            this.f341484L = aVar2;
            this.f341476D = i;
            this.f341488d = true;
            m.setIndoorFloor(i);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C104567qb qbVar = this.f341485a;
        if (qbVar != null) {
            C104565pz pzVar = (C104565pz) qbVar.findViewWithTag(f341460l);
            C104565pz pzVar2 = (C104565pz) this.f341485a.findViewWithTag(f341461m);
            if (pzVar != null && pzVar2 != null) {
                if (i2 == i3) {
                    pzVar.setActivate(false);
                } else {
                    if (i == 0) {
                        pzVar.setActivate(false);
                    } else {
                        pzVar.setActivate(true);
                    }
                    if (i + i2 < i3) {
                        pzVar2.setActivate(true);
                        return;
                    }
                }
                pzVar2.setActivate(false);
            }
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    /* renamed from: b */
    private void m159015b(Context context) {
        this.f341485a = new C104567qb(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = (int) (this.f341495k * f341470v);
        layoutParams.bottomMargin = this.f341491g;
        this.f341485a.setDarkStyle(this.f341481I);
        this.f341485a.setLayoutParams(layoutParams);
        this.f341485a.setWillNotDraw(false);
        this.f341485a.setOrientation(1);
        this.f341485a.setGravity(1);
        this.f341485a.setVisibility(8);
    }

    /* renamed from: c */
    private void m159019c(Context context) {
        C104565pz pzVar = new C104565pz(context);
        this.f341482J = pzVar;
        pzVar.setDarkStyle(this.f341481I);
        this.f341482J.setTag(f341460l);
        int i = (int) (((double) this.f341495k) * 5.900000095367432d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, (int) (((double) this.f341495k) * 3.200000047683716d));
        layoutParams.setMargins(0, i, 0, i);
        this.f341482J.setLayoutParams(layoutParams);
        this.f341485a.addView(this.f341482J);
    }

    /* renamed from: d */
    private void m159021d(Context context) {
        C104565pz pzVar = new C104565pz(context);
        this.f341483K = pzVar;
        pzVar.setDarkStyle(this.f341481I);
        this.f341483K.setTag(f341461m);
        this.f341483K.setRotation(180.0f);
        int i = (int) (((double) this.f341495k) * 5.900000095367432d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, (int) (((double) this.f341495k) * 3.200000047683716d));
        layoutParams.setMargins(0, i, 0, i);
        this.f341483K.setLayoutParams(layoutParams);
        this.f341485a.addView(this.f341483K);
    }

    /* renamed from: e */
    public final void mo172695e() {
        if (this.f341485a == null) {
            this.f341474B = new C114101a(this.f341475C, new ArrayList());
            m159010a(this.f341475C);
            this.f341491g = (int) (this.f341495k * f341469u);
            m159011a(this.f341475C, this.f341474B);
            C114322sx sxVar = this.f341490f;
            if (sxVar != null) {
                this.f341489e = sxVar.f342588o;
            }
        }
    }

    /* renamed from: f */
    public final void mo172696f() {
        m159032n();
        C104567qb qbVar = this.f341485a;
        if (qbVar != null && this.f341493i != null) {
            if (!this.f341487c || this.f341480H || this.f341477E <= 0) {
                qbVar.post(new Runnable() {
                    public final void run() {
                        if (C114097qd.this.f341485a != null && C114097qd.this.f341485a.getVisibility() == 0) {
                            C114097qd.this.f341485a.setVisibility(8);
                        }
                    }
                });
            } else {
                qbVar.post(new Runnable() {
                    public final void run() {
                        if (C114097qd.this.f341485a != null && C114097qd.this.f341493i != null) {
                            ViewGroup.LayoutParams layoutParams = C114097qd.this.f341493i.getLayoutParams();
                            if (layoutParams.height != C114097qd.this.f341496w) {
                                layoutParams.height = C114097qd.this.f341496w;
                                C114097qd.this.f341493i.setLayoutParams(layoutParams);
                            }
                            if (C114097qd.this.f341485a.getVisibility() != 0) {
                                C114097qd.this.f341485a.setVisibility(0);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public final void mo172697g() {
        m159031m();
        IndoorBuilding indoorBuilding = this.f341478F;
        if (indoorBuilding != null) {
            int activeLevelIndex = indoorBuilding.getActiveLevelIndex();
            List<IndoorLevel> levels = this.f341478F.getLevels();
            if (levels != null && activeLevelIndex < levels.size() && activeLevelIndex != -1 && levels.get(activeLevelIndex) != null) {
                String str = this.f341479G;
                if (str == null || !this.f341488d || !str.equals(this.f341478F.getBuidlingId())) {
                    this.f341493i.setSelectionFromTop(activeLevelIndex, ((int) (((double) (this.f341495k * f341467s)) + 0.5d)) * 2);
                } else {
                    this.f341493i.setItemChecked(activeLevelIndex, true);
                    this.f341488d = false;
                }
                this.f341476D = activeLevelIndex;
                this.f341479G = this.f341478F.getBuidlingId();
            }
        }
    }

    /* renamed from: a */
    private void m159010a(Context context) {
        this.f341495k = context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private void m159013a(boolean z) {
        C114322sx sxVar;
        C113497ab abVar;
        ViewGroup viewGroup = this.f341486b;
        if (viewGroup != null && (sxVar = this.f341490f) != null) {
            if (z) {
                this.f341487c = true;
            } else {
                this.f341487c = false;
            }
            boolean z2 = this.f341487c;
            if (viewGroup != null && sxVar != null) {
                if (this.f341485a == null) {
                    if (z2) {
                        mo172695e();
                    } else {
                        return;
                    }
                }
                VectorMap vectorMap = (VectorMap) this.f341490f.f339878e_;
                if (!this.f341487c || !z2 || (abVar = this.f341489e) == null || !abVar.f339625f) {
                    mo172694a((IndoorBuilding) null);
                    if (this.f341485a.getVisibility() != 8) {
                        this.f341485a.setVisibility(8);
                        return;
                    }
                    return;
                }
                mo172694a(vectorMap.f342911q.mo171356u());
            }
        }
    }

    /* renamed from: b */
    private void m159016b(Context context, C114101a aVar) {
        this.f341493i = new C114103qe(context);
        this.f341493i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f341493i.setChoiceMode(1);
        this.f341493i.setAdapter(aVar);
        this.f341493i.setOnItemClickListener(this);
        this.f341493i.setVerticalScrollBarEnabled(false);
        this.f341493i.setHorizontalScrollBarEnabled(false);
        this.f341493i.setOverScrollMode(2);
        this.f341493i.setDivider((Drawable) null);
        this.f341493i.setDividerHeight(0);
        this.f341493i.setOnDataChangedListener(this);
        this.f341485a.addView(this.f341493i);
        this.f341493i.setOnScrollListener(this);
    }

    /* renamed from: a */
    public final void mo172694a(IndoorBuilding indoorBuilding) {
        if (indoorBuilding == null) {
            this.f341478F = indoorBuilding;
            this.f341477E = 0;
            mo172696f();
            return;
        }
        if (this.f341485a == null) {
            mo172695e();
        }
        IndoorBuilding indoorBuilding2 = this.f341478F;
        if (indoorBuilding2 == null || !indoorBuilding2.getBuidlingId().equals(indoorBuilding.getBuidlingId()) || this.f341478F.getActiveLevelIndex() != indoorBuilding.getActiveLevelIndex()) {
            this.f341478F = indoorBuilding;
            this.f341477E = indoorBuilding.getLevels().size();
            m159012a(indoorBuilding.getLevels());
        }
    }

    /* renamed from: b */
    public final void mo171655b(int i, int i2) {
        if (this.f341485a != null && this.f341493i != null) {
            mo172696f();
        }
    }

    /* renamed from: b */
    public final View[] mo171997b() {
        return new View[]{this.f341485a};
    }

    /* renamed from: b */
    private void m159017b(boolean z) {
        C113497ab abVar;
        if (this.f341486b != null && this.f341490f != null) {
            if (this.f341485a == null) {
                if (z) {
                    mo172695e();
                } else {
                    return;
                }
            }
            VectorMap vectorMap = (VectorMap) this.f341490f.f339878e_;
            if (!this.f341487c || !z || (abVar = this.f341489e) == null || !abVar.f339625f) {
                mo172694a((IndoorBuilding) null);
                if (this.f341485a.getVisibility() != 8) {
                    this.f341485a.setVisibility(8);
                    return;
                }
                return;
            }
            mo172694a(vectorMap.f342911q.mo171356u());
        }
    }

    /* renamed from: a */
    private void m159011a(Context context, C114101a aVar) {
        m159015b(context);
        m159019c(context);
        m159016b(context, aVar);
        m159021d(context);
        mo171999a(this.f341486b, (Bundle) null);
        this.f341485a.setVisibility(8);
    }

    /* renamed from: a */
    public final boolean mo171999a(ViewGroup viewGroup, Bundle bundle) {
        C104567qb qbVar = this.f341485a;
        if (qbVar == null) {
            return false;
        }
        if (viewGroup.indexOfChild(qbVar) < 0) {
            viewGroup.addView(this.f341485a);
        }
        m159029k();
        m159031m();
        return true;
    }

    /* renamed from: a */
    private void m159009a(int i) {
        M m;
        this.f341491g = i;
        C104567qb qbVar = this.f341485a;
        if (qbVar != null) {
            qbVar.post(new Runnable() {
                public final void run() {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C114097qd.this.f341485a.getLayoutParams();
                    marginLayoutParams.bottomMargin = C114097qd.this.f341491g;
                    C114097qd.this.f341485a.setLayoutParams(marginLayoutParams);
                }
            });
        }
        ViewGroup viewGroup = this.f341486b;
        if (viewGroup != null) {
            this.f341492h = viewGroup.getMeasuredHeight();
        }
        C114322sx sxVar = this.f341490f;
        if (sxVar != null && (m = sxVar.f339878e_) != null && ((VectorMap) m).f342909o.f340912t != null && ((VectorMap) m).f342909o.f340912t.f342798q != null) {
            this.f341492h = (((int) ((VectorMap) m).f342909o.f340912t.f342798q.f340216b) - i) * 2;
            mo172696f();
        }
    }

    /* renamed from: a */
    private void m159012a(List<IndoorLevel> list) {
        if (this.f341486b != null) {
            mo172696f();
            C114101a aVar = this.f341474B;
            if (aVar != null) {
                aVar.mo172704a(list);
            }
        }
    }

    /* renamed from: a */
    private int m159006a(Adapter adapter) {
        int i = (int) (((double) this.f341495k) * 44.5d);
        int count = adapter.getCount();
        View view = null;
        for (int i2 = 0; i2 < count; i2++) {
            view = adapter.getView(i2, view, this.f341493i);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth > i) {
                i = measuredWidth;
            }
        }
        return i;
    }
}
