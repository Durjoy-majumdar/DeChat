package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMLoadMoreListView;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import fc2.C116858d;
import fc2.C116859f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import p680ru.C101464l;
import p702ts.C78085c;
import te3.C51018qv3;
import te3.C64234an2;
import wc3.C118761i0;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI */
public abstract class BaseLifeUI extends MMActivity implements C11385n {

    /* renamed from: T */
    public static final /* synthetic */ int f346721T = 0;

    /* renamed from: A */
    public long f346722A = -1;

    /* renamed from: B */
    public long f346723B = -1;

    /* renamed from: C */
    public int f346724C = 0;

    /* renamed from: D */
    public boolean f346725D = false;

    /* renamed from: E */
    public boolean f346726E = false;

    /* renamed from: F */
    public String f346727F = "";

    /* renamed from: G */
    public String f346728G = "";

    /* renamed from: H */
    public C106742j1 f346729H;

    /* renamed from: I */
    public boolean f346730I = false;

    /* renamed from: J */
    public boolean f346731J = false;

    /* renamed from: K */
    public boolean f346732K = false;

    /* renamed from: L */
    public int f346733L = 0;

    /* renamed from: M */
    public int f346734M = 1;

    /* renamed from: N */
    public int f346735N = -1;

    /* renamed from: P */
    public boolean f346736P = true;

    /* renamed from: Q */
    public boolean f346737Q;

    /* renamed from: R */
    public View.OnClickListener f346738R = new C115601a();

    /* renamed from: S */
    public C92411b.C92412a f346739S = new C115605f();

    /* renamed from: d */
    public MMLoadMoreListView f346740d;

    /* renamed from: e */
    public View f346741e;

    /* renamed from: f */
    public NearLifeErrorContent f346742f;

    /* renamed from: g */
    public C115614a f346743g;

    /* renamed from: h */
    public C115614a f346744h;

    /* renamed from: i */
    public View f346745i;

    /* renamed from: j */
    public TextView f346746j;

    /* renamed from: n */
    public TextView f346747n;

    /* renamed from: o */
    public String f346748o = "";

    /* renamed from: p */
    public C92411b f346749p = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();

    /* renamed from: q */
    public C116859f f346750q;

    /* renamed from: r */
    public int f346751r;

    /* renamed from: s */
    public List<C64234an2> f346752s;

    /* renamed from: t */
    public C64234an2 f346753t = null;

    /* renamed from: u */
    public float f346754u = 0.0f;

    /* renamed from: v */
    public float f346755v = 0.0f;

    /* renamed from: w */
    public int f346756w = 0;

    /* renamed from: x */
    public float f346757x = 0.0f;

    /* renamed from: y */
    public boolean f346758y = true;

    /* renamed from: z */
    public long f346759z = -1;

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$c */
    public class C69935c implements View.OnClickListener {
        public C69935c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMLoadMoreListView mMLoadMoreListView = BaseLifeUI.this.f346740d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(mMLoadMoreListView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$4", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$4", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$a */
    public class C115601a implements View.OnClickListener {
        public C115601a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            if (baseLifeUI.f346753t == null) {
                Log.m105920e("MicroMsg.BaseLifeUI", "Location is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C115669n.INSTANCE.mo160131h(11138, "1", Integer.valueOf(baseLifeUI.f346744h.getCount() + 1), BaseLifeUI.this.f346727F);
            Intent intent = new Intent();
            intent.setClass(BaseLifeUI.this, NearLifeCreatePoiUI.class);
            intent.putExtra("get_lat", BaseLifeUI.this.f346753t.f182095e);
            intent.putExtra("get_lng", BaseLifeUI.this.f346753t.f182094d);
            intent.putExtra("get_preci", BaseLifeUI.this.f346753t.f182096f);
            intent.putExtra("get_poi_name", BaseLifeUI.this.f346744h.f346824r);
            intent.putExtra("get_cur_lat", BaseLifeUI.this.f346754u);
            intent.putExtra("get_cur_lng", BaseLifeUI.this.f346755v);
            intent.putExtra("get_accuracy", BaseLifeUI.this.f346757x);
            intent.putExtra("get_loctype", BaseLifeUI.this.f346756w);
            intent.putExtra("search_id", BaseLifeUI.this.f346727F);
            intent.putExtra("get_is_mars", BaseLifeUI.this.f346758y);
            BaseLifeUI.this.startActivityForResult(intent, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$b */
    public class C115602b implements MenuItem.OnMenuItemClickListener {
        public C115602b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            baseLifeUI.mo175725N7(-1, false, "", baseLifeUI.f346731J);
            BaseLifeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$d */
    public class C115603d implements C106742j1.C106756o {

        /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$d$a */
        public class C42587a implements View.OnTouchListener {
            public C42587a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                BaseLifeUI.this.hideVKB();
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C115603d() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            View view;
            Log.m105918d("MicroMsg.BaseLifeUI", "search helper onQuitSearch");
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            baseLifeUI.f346730I = false;
            baseLifeUI.f346740d.setAdapter(baseLifeUI.f346743g);
            BaseLifeUI.this.f346743g.notifyDataSetChanged();
            BaseLifeUI baseLifeUI2 = BaseLifeUI.this;
            baseLifeUI2.f346742f.mo5874b(baseLifeUI2.f346743g.f346825s);
            if (!BaseLifeUI.this.f346743g.mo175742d() && (view = BaseLifeUI.this.f346741e) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            BaseLifeUI.this.f346740d.setOnTouchListener((View.OnTouchListener) null);
            BaseLifeUI.this.mo175722K7(8);
            BaseLifeUI baseLifeUI3 = BaseLifeUI.this;
            BaseLifeUI.m162515I7(baseLifeUI3, baseLifeUI3.f346743g);
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            C116859f fVar;
            Log.m105918d("MicroMsg.BaseLifeUI", "search key click");
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            int i = BaseLifeUI.f346721T;
            baseLifeUI.getClass();
            if (!Util.isNullOrNil(str) && ((fVar = baseLifeUI.f346750q) == null || !str.equals(fVar.f350256g))) {
                baseLifeUI.mo175722K7(8);
                if (baseLifeUI.f346750q != null) {
                    C97625j3.m125815e().mo123458d(baseLifeUI.f346750q);
                }
                if (baseLifeUI.f346753t != null) {
                    baseLifeUI.f346744h.mo175741b();
                    C115614a aVar = baseLifeUI.f346744h;
                    if (str != null) {
                        aVar.f346824r = str;
                    } else {
                        aVar.getClass();
                    }
                    baseLifeUI.mo175728Q7(false);
                    baseLifeUI.f346740d.mo101728c();
                }
            }
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
            Log.m105918d("MicroMsg.BaseLifeUI", "search helper onEnterSearch");
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            baseLifeUI.f346725D = true;
            baseLifeUI.f346729H.mo153859q(baseLifeUI.getString(C0966R.string.h5a));
            BaseLifeUI baseLifeUI2 = BaseLifeUI.this;
            baseLifeUI2.f346730I = true;
            baseLifeUI2.f346744h.mo175741b();
            BaseLifeUI baseLifeUI3 = BaseLifeUI.this;
            baseLifeUI3.f346740d.setAdapter(baseLifeUI3.f346744h);
            BaseLifeUI.this.f346744h.notifyDataSetChanged();
            BaseLifeUI.this.f346740d.mo101727b();
            BaseLifeUI baseLifeUI4 = BaseLifeUI.this;
            baseLifeUI4.f346742f.mo5874b(baseLifeUI4.f346744h.f346825s);
            View view = BaseLifeUI.this.f346741e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$5", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            BaseLifeUI.this.f346740d.setOnTouchListener(new C42587a());
            BaseLifeUI baseLifeUI5 = BaseLifeUI.this;
            BaseLifeUI.m162515I7(baseLifeUI5, baseLifeUI5.f346744h);
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            C64234an2 an22;
            String str2 = str;
            Log.m105919d("MicroMsg.BaseLifeUI", "onSearchBarChange  %s", str2);
            if (Util.isNullOrNil(str)) {
                mo1325l5();
                return;
            }
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            int i = BaseLifeUI.f346721T;
            baseLifeUI.getClass();
            Log.m105918d("MicroMsg.BaseLifeUI", "do auto query");
            baseLifeUI.mo175722K7(8);
            int i2 = baseLifeUI.f346734M;
            if (i2 <= 0) {
                Log.m105925i("MicroMsg.BaseLifeUI", "block by autoQueryInterval: %d", Integer.valueOf(i2));
                return;
            }
            if (baseLifeUI.f346750q != null) {
                C97625j3.m125815e().mo123458d(baseLifeUI.f346750q);
                baseLifeUI.f346750q = null;
            }
            if (((ArrayList) baseLifeUI.f346752s).size() > 0) {
                an22 = (C64234an2) ((ArrayList) baseLifeUI.f346752s).get(0);
            } else {
                Log.m105924i("MicroMsg.BaseLifeUI", "empty lbslist");
                an22 = new C64234an2();
            }
            baseLifeUI.f346751r = 0;
            C115614a aVar = baseLifeUI.f346744h;
            if (str2 != null) {
                aVar.f346824r = str2;
            } else {
                aVar.getClass();
            }
            baseLifeUI.f346750q = new C116859f(1, baseLifeUI.f346733L, an22.f182094d, an22.f182095e, an22.f182096f, an22.f182099i, an22.f182097g, an22.f182098h, (C51018qv3) null, baseLifeUI.f346730I ? baseLifeUI.f346744h.f346824r : "", baseLifeUI.f346735N, false, true);
            C97625j3.m125815e().mo123460f(baseLifeUI.f346750q);
        }

        /* renamed from: l5 */
        public void mo1325l5() {
            Log.m105918d("MicroMsg.BaseLifeUI", "click clear");
            if (BaseLifeUI.this.f346750q != null) {
                C97625j3.m125815e().mo123458d(BaseLifeUI.this.f346750q);
                BaseLifeUI.this.f346750q = null;
            }
            BaseLifeUI.this.f346744h.mo175741b();
            BaseLifeUI.this.mo175722K7(8);
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$e */
    public class C115604e implements MMLoadMoreListView.C73175b {
        public C115604e() {
        }

        public void onLoadMore() {
            BaseLifeUI.m162514H7(BaseLifeUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$f */
    public class C115605f implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI$f$a */
        public class C115606a implements DialogInterface.OnClickListener {
            public C115606a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(BaseLifeUI.this);
            }
        }

        public C115605f() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            float f3 = f;
            float f4 = f2;
            double d4 = d2;
            BaseLifeUI.this.getClass();
            BaseLifeUI baseLifeUI = BaseLifeUI.this;
            if (baseLifeUI.f346732K) {
                return false;
            }
            if (!z) {
                if (!baseLifeUI.f346737Q && !LocationUtil.isGpsEnable()) {
                    BaseLifeUI baseLifeUI2 = BaseLifeUI.this;
                    baseLifeUI2.f346737Q = true;
                    C76879j.m92709C(baseLifeUI2, baseLifeUI2.getString(C0966R.string.fez), BaseLifeUI.this.getString(C0966R.string.a3h), BaseLifeUI.this.getString(C0966R.string.fyd), BaseLifeUI.this.getString(C0966R.string.f7926wf), false, new C115606a(), (DialogInterface.OnClickListener) null);
                }
                return true;
            }
            int i2 = (int) d4;
            ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2003, f3, f4, i2);
            BaseLifeUI baseLifeUI3 = BaseLifeUI.this;
            baseLifeUI3.f346732K = true;
            C92411b bVar = baseLifeUI3.f346749p;
            if (bVar != null) {
                bVar.mo126408b(baseLifeUI3.f346739S);
            }
            Log.m105925i("MicroMsg.BaseLifeUI", "on get location %f %f " + System.currentTimeMillis(), Float.valueOf(f2), Float.valueOf(f));
            BaseLifeUI.this.f346753t = new C64234an2();
            BaseLifeUI baseLifeUI4 = BaseLifeUI.this;
            C64234an2 an22 = baseLifeUI4.f346753t;
            an22.f182098h = "";
            an22.f182099i = 0;
            an22.f182095e = f4;
            an22.f182094d = f3;
            an22.f182097g = "";
            an22.f182096f = i2;
            baseLifeUI4.f346754u = f4;
            baseLifeUI4.f346755v = f3;
            baseLifeUI4.f346756w = i;
            baseLifeUI4.f346757x = (float) d4;
            C92411b bVar2 = baseLifeUI4.f346749p;
            baseLifeUI4.f346758y = bVar2 == null ? false : bVar2.mo126410d();
            ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> arrayList = BaseLifeUI.this.f346743g.f346818i;
            if (arrayList == null || arrayList.size() <= 0) {
                BaseLifeUI.this.mo175726O7((double) f4, (double) f3);
            } else {
                BackwardSupportUtil.ExifHelper.LatLongData latLongData = arrayList.get(arrayList.size() - 1);
                BaseLifeUI.this.mo175726O7((double) latLongData.latitude, (double) latLongData.longtitude);
                BaseLifeUI baseLifeUI5 = BaseLifeUI.this;
                float f5 = latLongData.latitude;
                float f6 = latLongData.longtitude;
                baseLifeUI5.getClass();
                baseLifeUI5.f346726E = C118761i0.m167457a((double) f5, (double) f6, (double) f4, (double) f3) > 1000.0d;
            }
            C115614a aVar = BaseLifeUI.this.f346743g;
            C64234an2 an23 = BaseLifeUI.this.f346753t;
            aVar.f346822p = new BackwardSupportUtil.ExifHelper.LatLongData(an23.f182095e, an23.f182094d);
            C115614a aVar2 = BaseLifeUI.this.f346744h;
            C64234an2 an24 = BaseLifeUI.this.f346753t;
            aVar2.f346822p = new BackwardSupportUtil.ExifHelper.LatLongData(an24.f182095e, an24.f182094d);
            BaseLifeUI baseLifeUI6 = BaseLifeUI.this;
            BaseLifeUI.m162515I7(baseLifeUI6, baseLifeUI6.f346730I ? baseLifeUI6.f346744h : baseLifeUI6.f346743g);
            BaseLifeUI.this.mo175728Q7(false);
            BaseLifeUI baseLifeUI7 = BaseLifeUI.this;
            baseLifeUI7.addSearchMenu(true, baseLifeUI7.f346729H);
            return false;
        }
    }

    /* renamed from: H7 */
    public static void m162514H7(BaseLifeUI baseLifeUI) {
        if (baseLifeUI.f346751r != -1 || baseLifeUI.f346750q != null) {
            Log.m105924i("MicroMsg.BaseLifeUI", "is loading, please wait");
        } else if (baseLifeUI.mo175728Q7(true)) {
            baseLifeUI.f346740d.mo101728c();
        }
    }

    /* renamed from: I7 */
    public static void m162515I7(BaseLifeUI baseLifeUI, C115614a aVar) {
        C64234an2 an22;
        if (baseLifeUI.f346753t == null) {
            Log.m105920e("MicroMsg.BaseLifeUI", "location is null");
            return;
        }
        HashMap hashMap = new HashMap();
        ((ArrayList) baseLifeUI.f346752s).clear();
        if (aVar.f346823q && (an22 = baseLifeUI.f346753t) != null) {
            ((ArrayList) baseLifeUI.f346752s).add(an22);
            C64234an2 an23 = baseLifeUI.f346753t;
            hashMap.put(new BackwardSupportUtil.ExifHelper.LatLongData(an23.f182095e, an23.f182094d), 1);
        }
        Iterator<BackwardSupportUtil.ExifHelper.LatLongData> it = aVar.f346818i.iterator();
        while (it.hasNext()) {
            BackwardSupportUtil.ExifHelper.LatLongData next = it.next();
            if (!hashMap.containsKey(next)) {
                C64234an2 an24 = new C64234an2();
                an24.f182098h = "";
                an24.f182099i = 0;
                an24.f182095e = next.latitude;
                an24.f182094d = next.longtitude;
                an24.f182097g = "";
                an24.f182096f = 0;
                ((ArrayList) baseLifeUI.f346752s).add(an24);
                hashMap.put(next, 1);
            }
        }
        baseLifeUI.f346750q = null;
        baseLifeUI.f346751r = -1;
        Log.m105924i("MicroMsg.BaseLifeUI", "list size:" + ((ArrayList) baseLifeUI.f346752s).size() + " show curpos: " + aVar.f346823q);
    }

    /* renamed from: J7 */
    public boolean mo175721J7() {
        return true;
    }

    /* renamed from: K7 */
    public final void mo175722K7(int i) {
        this.f346740d.removeFooterView(this.f346741e);
        this.f346740d.removeFooterView(this.f346745i);
        MMLoadMoreListView mMLoadMoreListView = this.f346740d;
        mMLoadMoreListView.removeFooterView(mMLoadMoreListView.f214846d);
        View view = this.f346745i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "creaetPoiVisble", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "creaetPoiVisble", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346746j.setVisibility(i);
        this.f346747n.setVisibility(i);
        if (i == 0) {
            this.f346740d.addFooterView(this.f346745i);
            return;
        }
        MMLoadMoreListView mMLoadMoreListView2 = this.f346740d;
        if (mMLoadMoreListView2.f214846d == null) {
            mMLoadMoreListView2.mo101730f();
        }
        try {
            mMLoadMoreListView2.removeFooterView(mMLoadMoreListView2.f214846d);
            mMLoadMoreListView2.addFooterView(mMLoadMoreListView2.f214846d);
        } catch (Exception unused) {
        }
        this.f346740d.addFooterView(this.f346741e);
    }

    /* renamed from: L7 */
    public abstract C115614a mo175723L7();

    /* renamed from: M7 */
    public abstract C115614a mo175724M7();

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo175725N7(int r18, boolean r19, java.lang.String r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0014
            java.lang.String r4 = "mm_"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x0014
            r2 = r3
        L_0x0014:
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 0
            r9 = 1
            if (r1 < 0) goto L_0x0081
            if (r19 == 0) goto L_0x0025
            if (r21 == 0) goto L_0x0023
            r10 = 43
            goto L_0x002b
        L_0x0023:
            r10 = 3
            goto L_0x002b
        L_0x0025:
            if (r21 == 0) goto L_0x002a
            r10 = 41
            goto L_0x002b
        L_0x002a:
            r10 = 1
        L_0x002b:
            boolean r11 = r0.f346726E
            if (r11 == 0) goto L_0x0043
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 11139(0x2b83, float:1.5609E-41)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            if (r19 == 0) goto L_0x0039
            r14 = 5
            goto L_0x003a
        L_0x0039:
            r14 = 4
        L_0x003a:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r8] = r14
            r11.mo160131h(r12, r13)
        L_0x0043:
            if (r19 == 0) goto L_0x005e
            com.tencent.mm.plugin.nearlife.ui.a r11 = r0.f346744h
            fc2.d r11 = r11.getItem(r1)
            java.lang.String r11 = r11.f350243a
            com.tencent.mm.plugin.nearlife.ui.a r12 = r0.f346744h
            int r12 = r12.getCount()
            if (r12 < r9) goto L_0x0077
            com.tencent.mm.plugin.nearlife.ui.a r12 = r0.f346744h
            fc2.d r12 = r12.getItem(r9)
            java.lang.String r12 = r12.f350250h
            goto L_0x0078
        L_0x005e:
            com.tencent.mm.plugin.nearlife.ui.a r11 = r0.f346743g
            fc2.d r11 = r11.getItem(r1)
            java.lang.String r11 = r11.f350243a
            com.tencent.mm.plugin.nearlife.ui.a r12 = r0.f346743g
            int r12 = r12.getCount()
            if (r12 < r9) goto L_0x0077
            com.tencent.mm.plugin.nearlife.ui.a r12 = r0.f346743g
            fc2.d r12 = r12.getItem(r9)
            java.lang.String r12 = r12.f350250h
            goto L_0x0078
        L_0x0077:
            r12 = r3
        L_0x0078:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x0094
            java.lang.String r12 = r0.f346728G
            goto L_0x0094
        L_0x0081:
            boolean r10 = r0.f346725D
            if (r10 == 0) goto L_0x008c
            if (r21 == 0) goto L_0x008a
            r10 = 44
            goto L_0x0092
        L_0x008a:
            r10 = 4
            goto L_0x0092
        L_0x008c:
            if (r21 == 0) goto L_0x0091
            r10 = 42
            goto L_0x0092
        L_0x0091:
            r10 = 2
        L_0x0092:
            r11 = r3
            r12 = r11
        L_0x0094:
            te3.an2 r13 = r0.f346753t
            if (r13 != 0) goto L_0x009c
            java.lang.String r13 = "null/null"
            goto L_0x00b6
        L_0x009c:
            java.lang.Object[] r14 = new java.lang.Object[r7]
            float r13 = r13.f182095e
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14[r8] = r13
            te3.an2 r13 = r0.f346753t
            float r13 = r13.f182094d
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14[r9] = r13
            java.lang.String r13 = "%f/%f"
            java.lang.String r13 = java.lang.String.format(r13, r14)
        L_0x00b6:
            java.lang.Object[] r14 = new java.lang.Object[r4]
            int r15 = r1 + 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r14[r8] = r16
            r14[r9] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r14[r7] = r1
            r14[r5] = r11
            r14[r6] = r12
            java.lang.String r1 = "MicroMsg.BaseLifeUI"
            java.lang.String r4 = "index: %s, bid: %s, index: %s, searchId: %s, requestId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r14)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 11135(0x2b7f, float:1.5603E-41)
            r14 = 18
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14[r8] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r14[r9] = r10
            long r8 = r0.f346759z
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r14[r7] = r8
            long r7 = r0.f346723B
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r14[r5] = r7
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r14[r6] = r5
            long r5 = r0.f346722A
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            r14[r6] = r5
            r5 = 6
            int r6 = r0.f346724C
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r5] = r6
            r5 = 7
            r14[r5] = r13
            r5 = 8
            r14[r5] = r2
            r2 = 9
            int r5 = r0.f346735N
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14[r2] = r5
            r2 = 10
            r14[r2] = r11
            r2 = 11
            r5 = 1
            java.lang.String r5 = p156gj.C87203t.m108270f(r5)
            r14[r2] = r5
            r2 = 12
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r14[r2] = r6
            r2 = 13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r14[r2] = r6
            r2 = 14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r14[r2] = r6
            r2 = 15
            r14[r2] = r3
            r2 = 16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r14[r2] = r3
            r2 = 17
            r14[r2] = r12
            r1.mo160131h(r4, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.nearlife.p084ui.BaseLifeUI.mo175725N7(int, boolean, java.lang.String, boolean):void");
    }

    /* renamed from: O7 */
    public abstract void mo175726O7(double d, double d2);

    /* renamed from: P7 */
    public void mo175727P7() {
        Log.m105918d("MicroMsg.BaseLifeUI", "init header");
        View inflate = View.inflate(this, C0966R.C0971layout.f7109yk, (ViewGroup) null);
        this.f346745i = inflate;
        this.f346746j = (TextView) inflate.findViewById(C0966R.C0970id.f359426kw0);
        this.f346747n = (TextView) this.f346745i.findViewById(C0966R.C0970id.kvz);
        this.f346745i.setOnClickListener(this.f346738R);
        View inflate2 = View.inflate(this, C0966R.C0971layout.bnh, (ViewGroup) null);
        this.f346741e = inflate2;
        this.f346740d.addFooterView(inflate2);
        View view = this.f346741e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "preAddHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "preAddHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: te3.qv3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: te3.qv3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo175728Q7(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            fc2.f r1 = r0.f346750q
            r2 = 0
            java.lang.String r3 = "MicroMsg.BaseLifeUI"
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = "scene is doing..."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            return r2
        L_0x0010:
            java.util.List<te3.an2> r1 = r0.f346752s
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r4 = 1
            int r1 = r1 - r4
            int r5 = r0.f346751r
            r6 = -1
            if (r1 > r5) goto L_0x0027
            r0.f346751r = r6
            java.lang.String r1 = "index inc to end, ret"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r2
        L_0x0027:
            int r5 = r5 + r4
            r0.f346751r = r5
            java.util.List<te3.an2> r1 = r0.f346752s
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r5)
            te3.an2 r1 = (te3.C64234an2) r1
            int r5 = r0.f346751r
            if (r5 != 0) goto L_0x003d
            int r5 = r0.f346724C
            int r5 = r5 + r4
            r0.f346724C = r5
        L_0x003d:
            boolean r5 = r0.f346730I
            if (r5 == 0) goto L_0x0051
            com.tencent.mm.plugin.nearlife.ui.a r5 = r0.f346744h
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r7 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData
            float r8 = r1.f182095e
            float r9 = r1.f182094d
            r7.<init>(r8, r9)
            int r5 = r5.mo175743g(r7)
            goto L_0x0060
        L_0x0051:
            com.tencent.mm.plugin.nearlife.ui.a r5 = r0.f346743g
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r7 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData
            float r8 = r1.f182095e
            float r9 = r1.f182094d
            r7.<init>(r8, r9)
            int r5 = r5.mo175743g(r7)
        L_0x0060:
            if (r5 > 0) goto L_0x0067
            boolean r1 = r22.mo175728Q7(r23)
            return r1
        L_0x0067:
            boolean r5 = r0.f346730I
            r7 = 0
            if (r5 == 0) goto L_0x008d
            com.tencent.mm.plugin.nearlife.ui.a r5 = r0.f346744h
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r8 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData
            float r9 = r1.f182095e
            float r10 = r1.f182094d
            r8.<init>(r9, r10)
            java.util.Map<com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData, te3.qv3> r9 = r5.f346819j
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x00ad
            java.util.Map<com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData, te3.qv3> r5 = r5.f346819j
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r8)
            r7 = r5
            te3.qv3 r7 = (te3.C51018qv3) r7
            goto L_0x00ad
        L_0x008d:
            com.tencent.mm.plugin.nearlife.ui.a r5 = r0.f346743g
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r8 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData
            float r9 = r1.f182095e
            float r10 = r1.f182094d
            r8.<init>(r9, r10)
            java.util.Map<com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData, te3.qv3> r9 = r5.f346819j
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x00ad
            java.util.Map<com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData, te3.qv3> r5 = r5.f346819j
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r8)
            r7 = r5
            te3.qv3 r7 = (te3.C51018qv3) r7
        L_0x00ad:
            r17 = r7
            boolean r9 = r0.f346730I
            java.util.Vector<java.lang.String> r5 = fc2.C116859f.f350252p
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            java.lang.String r7 = ""
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.util.Vector<java.lang.String> r8 = fc2.C116859f.f350252p
            boolean r8 = r8.contains(r5)
            if (r8 == 0) goto L_0x00ce
            r5 = 0
            goto L_0x00d4
        L_0x00ce:
            java.util.Vector<java.lang.String> r8 = fc2.C116859f.f350252p
            r8.add(r5)
            r5 = 1
        L_0x00d4:
            if (r5 != 0) goto L_0x00d9
            r0.f346751r = r6
            return r2
        L_0x00d9:
            r5 = -1
            long r10 = r0.f346759z
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00e7
            long r5 = java.lang.System.currentTimeMillis()
            r0.f346759z = r5
        L_0x00e7:
            fc2.f r5 = new fc2.f
            int r10 = r0.f346733L
            float r11 = r1.f182094d
            float r12 = r1.f182095e
            int r13 = r1.f182096f
            int r14 = r1.f182099i
            java.lang.String r15 = r1.f182097g
            java.lang.String r6 = r1.f182098h
            boolean r8 = r0.f346730I
            if (r8 == 0) goto L_0x00ff
            com.tencent.mm.plugin.nearlife.ui.a r7 = r0.f346744h
            java.lang.String r7 = r7.f346824r
        L_0x00ff:
            r18 = r7
            int r7 = r0.f346735N
            r21 = 0
            r8 = r5
            r16 = r6
            r19 = r7
            r20 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.f346750q = r5
            ob0.b0 r5 = eb0.C97625j3.m125815e()
            fc2.f r6 = r0.f346750q
            r5.mo123460f(r6)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r0.f346751r
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            float r2 = r1.f182095e
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r5[r4] = r2
            r2 = 2
            float r1 = r1.f182094d
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r5[r2] = r1
            java.lang.String r1 = "start get lbs life list, index:%d, lat:%f, long:%f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.nearlife.p084ui.BaseLifeUI.mo175728Q7(boolean):boolean");
    }

    /* renamed from: R7 */
    public final void mo175729R7() {
        boolean z;
        if (!this.f346730I) {
            Log.m105924i("MicroMsg.BaseLifeUI", "is not Search mode pass createpoi");
        } else if (mo175721J7()) {
            try {
                int intValue = Integer.valueOf(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("POICreateForbiden")).intValue();
                Log.m105925i("MicroMsg.BaseLifeUI", "getDynamicConfig createpoi %d", Integer.valueOf(intValue));
                if (intValue == 1) {
                    return;
                }
            } catch (Exception unused) {
            }
            C115614a aVar = this.f346744h;
            String str = aVar.f346824r;
            aVar.getClass();
            String trim = str.trim();
            Iterator<C116858d> it = aVar.f346816g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C116858d next = it.next();
                if (!Util.isNullOrNil(next.f350245c) && trim.equals(next.f350245c.trim())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.f346746j.setText(String.format(getResources().getString(C0966R.string.h9a), new Object[]{this.f346744h.f346824r}));
                mo175722K7(0);
                return;
            }
            mo175722K7(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bjv;
    }

    public void initView() {
        MMLoadMoreListView mMLoadMoreListView = (MMLoadMoreListView) findViewById(C0966R.C0970id.h_n);
        this.f346740d = mMLoadMoreListView;
        mMLoadMoreListView.setFooterTips(getString(C0966R.string.h5b));
        this.f346742f = (NearLifeErrorContent) findViewById(C0966R.C0970id.h_m);
        mo175727P7();
        this.f346743g = mo175723L7();
        this.f346744h = mo175724M7();
        this.f346740d.setAdapter(this.f346743g);
        this.f346742f.setListView(this.f346740d);
        this.f346743g.notifyDataSetChanged();
        setBackBtn(new C115602b());
        setToTop(new C69935c());
        C106742j1 j1Var = new C106742j1(true, true);
        this.f346729H = j1Var;
        j1Var.f319122j = new C115603d();
        this.f346740d.setOnLoadMoreListener(new C115604e());
        this.f346740d.mo101731g();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105919d("MicroMsg.BaseLifeUI", "onActivityResult requestCode %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1 && i == 1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f346736P = getIntent().getBooleanExtra("poi_show_none", true);
        this.f346735N = (int) (System.currentTimeMillis() / 1000);
        C116859f.f350252p.clear();
        C97625j3.m125815e().mo123455a(603, this);
        this.f346733L = getIntent().getIntExtra("near_life_scene", 0);
        this.f346728G = getIntent().getStringExtra("request_id");
        this.f346752s = new ArrayList();
        initView();
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(603, this);
        super.onDestroy();
        C92411b bVar = this.f346749p;
        if (bVar != null) {
            bVar.mo126408b(this.f346739S);
        }
    }

    public void onPause() {
        super.onPause();
        this.f346749p.mo126408b(this.f346739S);
    }

    public void onResume() {
        C92411b bVar;
        super.onResume();
        this.f346743g.notifyDataSetChanged();
        this.f346740d.mo101728c();
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.LOCAION, new C115615b(this)) && (bVar = this.f346749p) != null) {
            bVar.mo126409c(this.f346739S, true, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r9 = r3.f346784g;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0330  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r23, int r24, java.lang.String r25, ob0.C117747y r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            int r2 = r26.getType()
            r3 = 603(0x25b, float:8.45E-43)
            if (r2 == r3) goto L_0x000d
            return
        L_0x000d:
            com.tencent.mm.ui.base.MMLoadMoreListView r2 = r0.f346740d
            r2.mo101727b()
            r2 = r26
            fc2.f r2 = (fc2.C116859f) r2
            java.lang.String r3 = r2.f350257h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 8
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L_0x00bd
            java.lang.String r3 = r2.f350257h
            r0.f346748o = r3
            android.view.View r3 = r0.f346741e
            r7 = 2131311556(0x7f093bc4, float:1.8241456E38)
            android.view.View r3 = r3.findViewById(r7)
            com.tencent.mm.plugin.nearlife.ui.LogoImageView r3 = (com.tencent.p014mm.plugin.nearlife.p084ui.LogoImageView) r3
            java.lang.String r7 = r0.f346748o
            eb0.c r8 = eb0.C97625j3.m125812b()
            r8.getClass()
            java.lang.String r8 = f12.C7970a.m8128b()
            r3.f346781d = r8
            r3.f346782e = r7
            r3.f346783f = r6
            r3.f346784g = r6
            if (r7 == 0) goto L_0x00ba
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0050
            goto L_0x00ba
        L_0x0050:
            java.lang.String r8 = "http"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x0094
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r3.f346781d
            r8.append(r9)
            byte[] r9 = r7.getBytes()
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8)
            if (r8 == 0) goto L_0x0087
            int r7 = r3.f346783f
            if (r7 <= 0) goto L_0x0083
            int r9 = r3.f346784g
            if (r9 <= 0) goto L_0x0083
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r8, r7, r9, r5, r6)
        L_0x0083:
            r3.setImageBitmap(r8)
            goto L_0x00bd
        L_0x0087:
            com.tencent.mm.plugin.nearlife.ui.LogoImageView$b r8 = new com.tencent.mm.plugin.nearlife.ui.LogoImageView$b
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r3.f346785h
            r8.<init>(r7, r3)
            java.lang.String r3 = "LogoImageView_download"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r8, r3)
            goto L_0x00bd
        L_0x0094:
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r8 != 0) goto L_0x009e
            r3.setVisibility(r4)
            goto L_0x00bd
        L_0x009e:
            int r8 = r3.f346783f
            if (r8 <= 0) goto L_0x00ac
            int r9 = r3.f346784g
            if (r9 > 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r7, r8, r9, r5)
            goto L_0x00b0
        L_0x00ac:
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r7)
        L_0x00b0:
            if (r7 != 0) goto L_0x00b6
            r3.setVisibility(r4)
            goto L_0x00bd
        L_0x00b6:
            r3.setImageBitmap(r7)
            goto L_0x00bd
        L_0x00ba:
            r3.setVisibility(r4)
        L_0x00bd:
            java.lang.String r3 = r2.f350258i
            r0.f346727F = r3
            int r3 = r2.f350260n
            r0.f346734M = r3
            int r3 = r2.f350255f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r8 = ""
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.Vector<java.lang.String> r8 = fc2.C116859f.f350252p
            r8.remove(r7)
            fc2.f r7 = r0.f346750q
            java.lang.String r8 = "MicroMsg.BaseLifeUI"
            if (r7 != 0) goto L_0x00ea
            java.lang.String r1 = "scene is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            return
        L_0x00ea:
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r9 = r0.f346751r
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r6] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)
            r7[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r24)
            r10 = 2
            r7[r10] = r9
            r9 = 3
            r7[r9] = r25
            r9 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r9] = r3
            java.lang.String r3 = "onSceneEnd: index:%d, errType=%d, errCode=%d, errMsg=%s opcde %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r7)
            r3 = 101(0x65, float:1.42E-43)
            if (r1 == 0) goto L_0x011b
            if (r1 != r3) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            r7 = 0
            goto L_0x011c
        L_0x011b:
            r7 = 1
        L_0x011c:
            if (r23 == 0) goto L_0x014c
            if (r7 != 0) goto L_0x014c
            java.lang.String r1 = "error"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            boolean r1 = r0.f346730I
            if (r1 == 0) goto L_0x012c
            com.tencent.mm.plugin.nearlife.ui.a r1 = r0.f346744h
            goto L_0x012e
        L_0x012c:
            com.tencent.mm.plugin.nearlife.ui.a r1 = r0.f346743g
        L_0x012e:
            java.util.List<te3.an2> r2 = r0.f346752s
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            int r2 = r2 - r5
            int r3 = r0.f346751r
            if (r2 == r3) goto L_0x013d
            goto L_0x0374
        L_0x013d:
            int r2 = r1.getCount()
            if (r2 != 0) goto L_0x0374
            r1.f346825s = r5
            com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent r1 = r0.f346742f
            r1.mo5874b(r5)
            goto L_0x0374
        L_0x014c:
            r7 = -1
            long r11 = r0.f346722A
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x015a
            long r7 = java.lang.System.currentTimeMillis()
            r0.f346722A = r7
        L_0x015a:
            long r7 = java.lang.System.currentTimeMillis()
            r0.f346723B = r7
            java.util.List<fc2.d> r7 = r2.f350259j
            java.util.List<te3.an2> r8 = r0.f346752s
            int r9 = r0.f346751r
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r9)
            te3.an2 r8 = (te3.C64234an2) r8
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r9 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData
            float r11 = r8.f182095e
            float r8 = r8.f182094d
            r9.<init>(r11, r8)
            boolean r8 = r0.f346730I
            if (r8 == 0) goto L_0x0186
            fc2.f r8 = r0.f346750q
            boolean r8 = r8.f350261o
            if (r8 != 0) goto L_0x0186
            com.tencent.mm.plugin.nearlife.ui.a r8 = r0.f346744h
            r8.mo175741b()
        L_0x0186:
            boolean r8 = r0.f346730I
            if (r8 == 0) goto L_0x01ab
            com.tencent.mm.plugin.nearlife.ui.a r8 = r0.f346744h
            ob0.c r2 = r2.f350254e
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            r11 = r2
            te3.o22 r11 = (te3.C118449o22) r11
            int r11 = r11.f354164i
            te3.o22 r2 = (te3.C118449o22) r2
            te3.qv3 r2 = r2.f354159d
            if (r2 != 0) goto L_0x01a7
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            byte[] r12 = new byte[r6]
            r2.mo73350k(r12)
        L_0x01a7:
            r8.mo175749j(r9, r11, r2)
            goto L_0x01cb
        L_0x01ab:
            com.tencent.mm.plugin.nearlife.ui.a r8 = r0.f346743g
            ob0.c r2 = r2.f350254e
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            r11 = r2
            te3.o22 r11 = (te3.C118449o22) r11
            int r11 = r11.f354164i
            te3.o22 r2 = (te3.C118449o22) r2
            te3.qv3 r2 = r2.f354159d
            if (r2 != 0) goto L_0x01c8
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            byte[] r12 = new byte[r6]
            r2.mo73350k(r12)
        L_0x01c8:
            r8.mo175749j(r9, r11, r2)
        L_0x01cb:
            if (r7 == 0) goto L_0x025e
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r2 = r7.size()
            if (r2 != 0) goto L_0x01d7
            goto L_0x025e
        L_0x01d7:
            boolean r1 = r0.f346730I
            if (r1 == 0) goto L_0x01de
            com.tencent.mm.plugin.nearlife.ui.a r1 = r0.f346744h
            goto L_0x01e0
        L_0x01de:
            com.tencent.mm.plugin.nearlife.ui.a r1 = r0.f346743g
        L_0x01e0:
            fc2.f r2 = r0.f346750q
            boolean r2 = r2.f350261o
            com.tencent.mm.ui.base.MMLoadMoreListView r2 = r0.f346740d
            r2.setVisibility(r6)
            r1.f346825s = r6
            com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent r2 = r0.f346742f
            com.tencent.mm.plugin.nearlife.ui.a r3 = r0.f346744h
            int r3 = r3.f346825s
            r2.mo5874b(r3)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r3 = r1.f346814e
            r2[r6] = r3
            int r3 = r7.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.BaseLifeAdapter"
            java.lang.String r8 = "mkey %s addlifes %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r2)
            java.util.Iterator r2 = r7.iterator()
        L_0x0210:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023c
            java.lang.Object r3 = r2.next()
            fc2.d r3 = (fc2.C116858d) r3
            java.util.HashSet<java.lang.String> r7 = r1.f346817h
            java.lang.String r8 = r3.f350244b
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x0210
            java.util.ArrayList<fc2.d> r7 = r1.f346816g
            r7.add(r3)
            java.util.HashSet<java.lang.String> r7 = r1.f346817h
            java.lang.String r8 = r3.f350244b
            r7.add(r8)
            java.util.Map<java.lang.String, com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData> r7 = r1.f346821o
            java.lang.String r3 = r3.f350244b
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r3, r9)
            goto L_0x0210
        L_0x023c:
            r1.notifyDataSetChanged()
            r1.notifyDataSetChanged()
            java.util.List<te3.an2> r2 = r0.f346752s
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            int r2 = r2 - r5
            int r3 = r0.f346751r
            if (r2 != r3) goto L_0x0293
            boolean r1 = r1.mo175742d()
            if (r1 != 0) goto L_0x0293
            com.tencent.mm.ui.base.MMLoadMoreListView r1 = r0.f346740d
            r1.mo101727b()
            r22.mo175729R7()
            goto L_0x0293
        L_0x025e:
            boolean r2 = r0.f346730I
            if (r2 == 0) goto L_0x0265
            com.tencent.mm.plugin.nearlife.ui.a r2 = r0.f346744h
            goto L_0x0267
        L_0x0265:
            com.tencent.mm.plugin.nearlife.ui.a r2 = r0.f346743g
        L_0x0267:
            java.util.List<te3.an2> r5 = r0.f346752s
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            int r5 = r5 + -1
            int r7 = r0.f346751r
            if (r5 == r7) goto L_0x0276
            goto L_0x0293
        L_0x0276:
            int r5 = r2.getCount()
            if (r5 != 0) goto L_0x0283
            com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent r5 = r0.f346742f
            int r7 = r2.f346825s
            r5.mo5874b(r7)
        L_0x0283:
            com.tencent.mm.ui.base.MMLoadMoreListView r5 = r0.f346740d
            r5.mo101727b()
            boolean r2 = r2.mo175742d()
            if (r2 != 0) goto L_0x0293
            if (r1 == r3) goto L_0x0293
            r22.mo175729R7()
        L_0x0293:
            com.tencent.mm.plugin.nearlife.ui.a r1 = r0.f346743g
            boolean r1 = r1.mo175742d()
            if (r1 != 0) goto L_0x02e5
            android.view.View r1 = r0.f346741e
            if (r1 == 0) goto L_0x02e5
            boolean r2 = r0.f346730I
            if (r2 != 0) goto L_0x02e5
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r3)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI"
            java.lang.String r10 = "onSceneEnd"
            java.lang.String r11 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI"
            java.lang.String r9 = "onSceneEnd"
            java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x02e5:
            android.view.View r1 = r0.f346741e
            if (r1 == 0) goto L_0x0330
            boolean r2 = r0.f346730I
            if (r2 != 0) goto L_0x0330
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r3)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI"
            java.lang.String r17 = "onSceneEnd"
            java.lang.String r18 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0374
        L_0x0330:
            if (r1 == 0) goto L_0x0374
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI"
            java.lang.String r17 = "onSceneEnd"
            java.lang.String r18 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI"
            java.lang.String r16 = "onSceneEnd"
            java.lang.String r17 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0374:
            r1 = 0
            r0.f346750q = r1
            r0.mo175728Q7(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.nearlife.p084ui.BaseLifeUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
