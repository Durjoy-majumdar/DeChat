package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.RecyclerView;
import az0.C39665e;
import az0.C39666f;
import az0.C79640g;
import bz0.C79889p;
import bz0.C79890q;
import bz0.C79892r;
import bz0.C79896s;
import bz0.C79903t;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.TouchableLayout;
import cz0.C86159b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C11184p0;
import nj3.C76879j;
import p385u2.C111105a;
import rx3.C13598b0;
import sx3.C110818d0;
import u24.C90599h;
import uo3.C78253a;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI;", "Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "<init>", "()V", "a", "b", "c", "d", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI */
public final class CarLicensePlateListUI extends CarLicensePlateBaseActivity {

    /* renamed from: e */
    public CarLicensePlateListViewContract$ViewModel f248012e;

    /* renamed from: f */
    public C79889p f248013f;

    /* renamed from: g */
    public MRecyclerView f248014g;

    /* renamed from: h */
    public C85119a f248015h;

    /* renamed from: i */
    public View f248016i;

    /* renamed from: j */
    public View f248017j;

    /* renamed from: n */
    public final C85126f f248018n = new C85126f(this);

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$c */
    public final class C55588c extends C54234f {
        public C55588c(CarLicensePlateListUI carLicensePlateListUI) {
        }

        /* renamed from: b */
        public boolean mo17314b(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
            C87412m.m108594g(zVar, "oldHolder");
            C87412m.m108594g(zVar2, "newHolder");
            C87412m.m108594g(cVar, "preInfo");
            C87412m.m108594g(cVar2, "postInfo");
            mo17321j(zVar);
            mo17319h(zVar);
            mo17321j(zVar2);
            mo17319h(zVar2);
            return false;
        }

        /* renamed from: g */
        public boolean mo17318g(RecyclerView.C16631z zVar, List<Object> list) {
            C87412m.m108594g(zVar, "viewHolder");
            C87412m.m108594g(list, "payloads");
            return (zVar instanceof C55589d) || super.mo17318g(zVar, list);
        }

        /* renamed from: s */
        public boolean mo75017s(RecyclerView.C16631z zVar) {
            C87412m.m108594g(zVar, "holder");
            if (!(zVar instanceof C55589d)) {
                mo17321j(zVar);
                mo17319h(zVar);
                return false;
            }
            super.mo75017s(zVar);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$d */
    public static final class C55589d extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f158260z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55589d(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.khj);
            C87412m.m108591d(findViewById);
            this.f158260z = (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a */
    public final class C85119a extends RecyclerView.C16613e<RecyclerView.C16631z> implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: d */
        public final ArrayList<String> f248019d = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a$a */
        public static final class C85120a extends C78253a {

            /* renamed from: R */
            public final /* synthetic */ View f248021R;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85120a(View view, Context context) {
                super(context);
                this.f248021R = view;
            }

            /* renamed from: a */
            public boolean mo108266a() {
                ViewParent parent = this.f248021R.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                return super.mo108266a();
            }

            /* renamed from: n */
            public boolean mo71743n(int i, int i2) {
                ViewParent parent = this.f248021R.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return super.mo71743n(i, i2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a$b */
        public static final class C85121b implements View.OnCreateContextMenuListener {

            /* renamed from: d */
            public static final C85121b f248022d = new C85121b();

            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 0, 0, MMApplicationContext.getString(C0966R.string.f7944x1));
            }
        }

        /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a$c */
        public static final class C85122c implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ CarLicensePlateListUI f248023d;

            /* renamed from: e */
            public final /* synthetic */ String f248024e;

            /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a$c$a */
            public static final class C85123a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ CarLicensePlateListUI f248025d;

                /* renamed from: e */
                public final /* synthetic */ String f248026e;

                public C85123a(CarLicensePlateListUI carLicensePlateListUI, String str) {
                    this.f248025d = carLicensePlateListUI;
                    this.f248026e = str;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C79889p pVar = this.f248025d.f248013f;
                    if (pVar != null) {
                        String str = this.f248026e;
                        C79896s sVar = (C79896s) pVar;
                        C87412m.m108594g(str, "plateNo");
                        C53895h.m60466d(sVar.mo110058a(), (C66212f) null, (C53934p0) null, new C79892r(str, sVar, (C15601d<? super C79892r>) null), 3, (Object) null);
                        return;
                    }
                    C87412m.m108603p("presenter");
                    throw null;
                }
            }

            public C85122c(CarLicensePlateListUI carLicensePlateListUI, String str) {
                this.f248023d = carLicensePlateListUI;
                this.f248024e = str;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getGroupId() == 0 && menuItem.getItemId() == 0) {
                    CarLicensePlateListUI carLicensePlateListUI = this.f248023d;
                    C76879j.m92708B(carLicensePlateListUI, carLicensePlateListUI.getString(C0966R.string.avf), "", this.f248023d.getString(C0966R.string.f7944x1), this.f248023d.getString(C0966R.string.f7926wf), new C85123a(this.f248023d, this.f248024e), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
                }
            }
        }

        public C85119a() {
        }

        /* renamed from: F4 */
        public final int mo118128F4(View view) {
            MRecyclerView mRecyclerView = CarLicensePlateListUI.this.f248014g;
            if (mRecyclerView != null) {
                RecyclerView.C16631z P0 = mRecyclerView.mo17031P0(view);
                if (P0 == null) {
                    return -1;
                }
                MRecyclerView mRecyclerView2 = CarLicensePlateListUI.this.f248014g;
                if (mRecyclerView2 != null) {
                    return mRecyclerView2.mo63440x1(P0);
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }

        public int getItemCount() {
            return this.f248019d.size();
        }

        public long getItemId(int i) {
            String str = (String) C110818d0.m150917O(this.f248019d, i);
            if (str != null) {
                return (long) str.hashCode();
            }
            return -1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            C55589d dVar = (C55589d) zVar;
            String str = this.f248019d.get(i);
            C87412m.m108593f(str, "plateNoList[position]");
            String str2 = str;
            if (str2.length() >= 7) {
                TextView textView = dVar.f158260z;
                textView.setText(C90599h.m113522o(str2, 0, 2) + " · " + C90599h.m113522o(str2, 2, str2.length()));
                dVar.f158260z.setContentDescription(str2);
            }
        }

        public void onClick(View view) {
            Activity d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String str = (String) C110818d0.m150917O(this.f248019d, mo118128F4(view));
            if (!(str == null || str.length() == 0)) {
                C79889p pVar = CarLicensePlateListUI.this.f248013f;
                if (pVar != null) {
                    C79896s sVar = (C79896s) pVar;
                    C87412m.m108594g(str, "plateNo");
                    C79890q qVar = sVar.f234075b;
                    if (qVar == null || (d = qVar.mo110056d()) == null) {
                        Log.m105920e("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForUpdate(plate:" + str + ") get NULL activity");
                    } else {
                        C53895h.m60466d(sVar.mo110058a(), (C66212f) null, (C53934p0) null, new C79903t(d, str, sVar, (C15601d<? super C79903t>) null), 3, (Object) null);
                    }
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6681lm, viewGroup, false);
            inflate.setOnClickListener(this);
            inflate.setOnLongClickListener(this);
            return new C55589d(inflate);
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            String str = (String) C110818d0.m150917O(this.f248019d, mo118128F4(view));
            if (!(str == null || str.length() == 0)) {
                C85120a aVar = new C85120a(view, view.getContext());
                CarLicensePlateListUI carLicensePlateListUI = CarLicensePlateListUI.this;
                C85121b bVar = C85121b.f248022d;
                C85122c cVar = new C85122c(carLicensePlateListUI, str);
                int i = TouchableLayout.f24959d;
                aVar.mo108273h(view, bVar, cVar, TouchableLayout.f24959d, TouchableLayout.f24960e);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$ListAdapter", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$b */
    public static final class C85124b extends C54248l.C54250b {

        /* renamed from: a */
        public final ArrayList<String> f248027a;

        /* renamed from: b */
        public final ArrayList<String> f248028b;

        public C85124b(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            C87412m.m108594g(arrayList, "oldList");
            C87412m.m108594g(arrayList2, "newList");
            this.f248027a = arrayList;
            this.f248028b = arrayList2;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            String str = (String) C110818d0.m150917O(this.f248027a, i);
            return str != null && C87412m.m108589b(str, (String) C110818d0.m150917O(this.f248028b, i2));
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            return mo11465a(i, i2);
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f248028b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f248027a.size();
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$e */
    public static final class C85125e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CarLicensePlateListUI f248029d;

        public C85125e(CarLicensePlateListUI carLicensePlateListUI) {
            this.f248029d = carLicensePlateListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f248029d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$f */
    public static final class C85126f implements C79890q {

        /* renamed from: a */
        public final /* synthetic */ CarLicensePlateListUI f248030a;

        public C85126f(CarLicensePlateListUI carLicensePlateListUI) {
            this.f248030a = carLicensePlateListUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0052, code lost:
            r3 = r1.f247996d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo110053a(com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r2 = r0.f248030a
                android.view.View r2 = r2.f248017j
                r11 = 0
                if (r2 == 0) goto L_0x0196
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r13 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
                r12.mo10233c(r3)
                java.lang.Object[] r4 = r12.mo10232b()
                java.lang.String r5 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1"
                java.lang.String r6 = "onRenderData"
                java.lang.String r7 = "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r3 = r2
                j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                r10 = 0
                java.lang.Object r3 = r12.mo10231a(r10)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.setVisibility(r3)
                java.lang.String r4 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1"
                java.lang.String r5 = "onRenderData"
                java.lang.String r6 = "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r3 = r2
                j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
                r2 = 1
                if (r1 == 0) goto L_0x005f
                java.util.ArrayList<java.lang.String> r3 = r1.f247996d
                if (r3 == 0) goto L_0x005f
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r2
                if (r3 != r2) goto L_0x005f
                r3 = 1
                goto L_0x0060
            L_0x005f:
                r3 = 0
            L_0x0060:
                java.lang.String r4 = "recyclerAdapter"
                java.lang.String r5 = "recyclerView"
                java.lang.String r6 = "emptyView"
                if (r3 == 0) goto L_0x011f
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r3 = r0.f248030a
                android.view.View r3 = r3.f248016i
                if (r3 == 0) goto L_0x011b
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
                r6.mo10233c(r7)
                java.lang.Object[] r15 = r6.mo10232b()
                java.lang.String r16 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1"
                java.lang.String r17 = "onRenderData"
                java.lang.String r18 = "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                r14 = r3
                j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
                java.lang.Object r6 = r6.mo10231a(r10)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r15 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1"
                java.lang.String r16 = "onRenderData"
                java.lang.String r17 = "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r3 = r0.f248030a
                com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView r3 = r3.f248014g
                if (r3 == 0) goto L_0x0117
                r3.setVisibility(r10)
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r3 = r0.f248030a
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a r3 = r3.f248015h
                if (r3 == 0) goto L_0x0113
                java.util.ArrayList<java.lang.String> r1 = r1.f247996d
                java.lang.String r4 = "newList"
                gy3.C87412m.m108594g(r1, r4)
                java.util.ArrayList<java.lang.String> r4 = r3.f248019d
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x00e0
                boolean r4 = r1.isEmpty()
                r4 = r4 ^ r2
                if (r4 == 0) goto L_0x0102
                java.util.ArrayList<java.lang.String> r4 = r3.f248019d
                r4.addAll(r1)
                int r1 = r1.size()
                r3.notifyItemRangeInserted(r10, r1)
                goto L_0x0102
            L_0x00e0:
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$b r4 = new com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$b
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.ArrayList<java.lang.String> r6 = r3.f248019d
                r5.<init>(r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r1)
                r4.<init>(r5, r6)
                androidx.recyclerview.widget.l$c r4 = androidx.recyclerview.widget.C54248l.m60949a(r4, r2)
                java.util.ArrayList<java.lang.String> r5 = r3.f248019d
                r5.clear()
                java.util.ArrayList<java.lang.String> r5 = r3.f248019d
                r5.addAll(r1)
                r4.mo75046b(r3)
            L_0x0102:
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r1 = r0.f248030a
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r3 = r1.f248012e
                if (r3 == 0) goto L_0x010d
                boolean r3 = r3.f248032e
                if (r3 != r2) goto L_0x010d
                r10 = 1
            L_0x010d:
                if (r10 == 0) goto L_0x0189
                r1.finish()
                goto L_0x0189
            L_0x0113:
                gy3.C87412m.m108603p(r4)
                throw r11
            L_0x0117:
                gy3.C87412m.m108603p(r5)
                throw r11
            L_0x011b:
                gy3.C87412m.m108603p(r6)
                throw r11
            L_0x011f:
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r1 = r0.f248030a
                android.view.View r1 = r1.f248016i
                if (r1 == 0) goto L_0x0192
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
                r3.mo10233c(r6)
                java.lang.Object[] r15 = r3.mo10232b()
                java.lang.String r16 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1"
                java.lang.String r17 = "onRenderData"
                java.lang.String r18 = "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                r14 = r1
                j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
                java.lang.Object r3 = r3.mo10231a(r10)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r15 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1"
                java.lang.String r16 = "onRenderData"
                java.lang.String r17 = "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r1 = r0.f248030a
                com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView r1 = r1.f248014g
                if (r1 == 0) goto L_0x018e
                r1.setVisibility(r13)
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI r1 = r0.f248030a
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$a r1 = r1.f248015h
                if (r1 == 0) goto L_0x018a
                java.util.ArrayList<java.lang.String> r3 = r1.f248019d
                boolean r3 = r3.isEmpty()
                r2 = r2 ^ r3
                if (r2 == 0) goto L_0x0189
                java.util.ArrayList<java.lang.String> r2 = r1.f248019d
                int r2 = r2.size()
                r1.notifyItemRangeRemoved(r10, r2)
                java.util.ArrayList<java.lang.String> r1 = r1.f248019d
                r1.clear()
            L_0x0189:
                return
            L_0x018a:
                gy3.C87412m.m108603p(r4)
                throw r11
            L_0x018e:
                gy3.C87412m.m108603p(r5)
                throw r11
            L_0x0192:
                gy3.C87412m.m108603p(r6)
                throw r11
            L_0x0196:
                java.lang.String r1 = "loadingView"
                gy3.C87412m.m108603p(r1)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListUI.C85126f.mo110053a(com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo):void");
        }

        /* renamed from: b */
        public void mo110054b(C79890q.C79891a aVar) {
            C87412m.m108594g(aVar, "request");
            if (C79890q.C79891a.FETCH_DATA_NO_CACHE == aVar) {
                View view = this.f248030a.f248017j;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view2 = this.f248030a.f248016i;
                    if (view2 != null) {
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        MRecyclerView mRecyclerView = this.f248030a.f248014g;
                        if (mRecyclerView != null) {
                            mRecyclerView.setVisibility(8);
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("emptyView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loadingView");
                    throw null;
                }
            }
        }

        /* renamed from: c */
        public void mo110055c(C39666f fVar) {
            C87412m.m108594g(fVar, "exception");
            if (fVar.f106441g instanceof C39665e) {
                C86159b.m106674b(fVar);
            }
        }

        /* renamed from: d */
        public Activity mo110056d() {
            return this.f248030a;
        }

        /* renamed from: f */
        public C0000n0 mo110057f() {
            return this.f248030a.f248000d;
        }
    }

    public void finish() {
        CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f248012e;
        if (carLicensePlateListViewContract$ViewModel != null) {
            Intent intent = new Intent();
            MMCarLicensePlateInfo mMCarLicensePlateInfo = carLicensePlateListViewContract$ViewModel.f248031d;
            intent.putExtra("RESULT_KEY_UPDATED_LIST", mMCarLicensePlateInfo != null ? mMCarLicensePlateInfo.f247996d : null);
            C13598b0 b0Var = C13598b0.f38549a;
            setResult(-1, intent);
        }
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        setMMTitle(getString(C0966R.string.avj));
        setActionbarColor(C111105a.m151500b(this, C0966R.color.al6));
        setBackBtn(new C85125e(this), C0966R.raw.actionbar_icon_dark_back);
        setBackBtnColorFilter(C0966R.color.f3021cg);
        getContentView().setBackgroundColor(C111105a.m151500b(this, C0966R.color.al6));
        getController().mo177103x0(C111105a.m151500b(this, C0966R.color.al6));
        getIntent().setExtrasClassLoader(CarLicensePlateListViewContract$ViewModel.class.getClassLoader());
        this.f248012e = (CarLicensePlateListViewContract$ViewModel) getIntent().getParcelableExtra("INTENT_KEY_VIEW_MODEL");
        C79896s sVar = new C79896s(C79640g.C79641a.ReqScene_MyPlateInfo);
        this.f248013f = sVar;
        C85126f fVar = this.f248018n;
        View contentView = fVar.f248030a.getContentView();
        C87412m.m108592e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) contentView;
        CarLicensePlateListUI carLicensePlateListUI = fVar.f248030a;
        LayoutInflater.from(carLicensePlateListUI).inflate(C0966R.C0971layout.f6679lk, viewGroup, true);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ara);
        C87412m.m108593f(findViewById, "contentView.findViewById…se_plate_list_empty_view)");
        carLicensePlateListUI.f248016i = findViewById;
        findViewById.findViewById(C0966R.C0970id.al9).setOnClickListener(new C85128a(carLicensePlateListUI));
        LayoutInflater.from(carLicensePlateListUI).inflate(C0966R.C0971layout.f6682ln, viewGroup, true);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.arb);
        C87412m.m108593f(findViewById2, "contentView.findViewById…_plate_list_loading_view)");
        carLicensePlateListUI.f248017j = findViewById2;
        CarPlateListRecyclerViewBase carPlateListRecyclerViewBase = new CarPlateListRecyclerViewBase(carLicensePlateListUI);
        viewGroup.addView(carPlateListRecyclerViewBase, new ViewGroup.LayoutParams(-1, -1));
        carPlateListRecyclerViewBase.setLayoutManager(new CarLicensePlateListUI$viewCallback$1$init$1$2$1(carLicensePlateListUI));
        carPlateListRecyclerViewBase.setPadding(0, carPlateListRecyclerViewBase.getResources().getDimensionPixelSize(C0966R.dimen.f3723cd), 0, 0);
        View inflate = LayoutInflater.from(carLicensePlateListUI).inflate(C0966R.C0971layout.f6680ll, carPlateListRecyclerViewBase, false);
        inflate.setOnClickListener(new C85129b(carLicensePlateListUI));
        carPlateListRecyclerViewBase.addFooterView(inflate);
        carLicensePlateListUI.f248014g = carPlateListRecyclerViewBase;
        CarLicensePlateListUI carLicensePlateListUI2 = fVar.f248030a;
        MRecyclerView mRecyclerView = carLicensePlateListUI2.f248014g;
        if (mRecyclerView != null) {
            mRecyclerView.setItemAnimator(new C55588c(carLicensePlateListUI2));
            CarLicensePlateListUI carLicensePlateListUI3 = fVar.f248030a;
            C85119a aVar = new C85119a();
            aVar.setHasStableIds(true);
            carLicensePlateListUI3.f248015h = aVar;
            CarLicensePlateListUI carLicensePlateListUI4 = fVar.f248030a;
            MRecyclerView mRecyclerView2 = carLicensePlateListUI4.f248014g;
            if (mRecyclerView2 != null) {
                C85119a aVar2 = carLicensePlateListUI4.f248015h;
                if (aVar2 != null) {
                    mRecyclerView2.setAdapter(aVar2);
                    View view = fVar.f248030a.f248016i;
                    if (view != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        MRecyclerView mRecyclerView3 = fVar.f248030a.f248014g;
                        if (mRecyclerView3 != null) {
                            mRecyclerView3.setVisibility(8);
                            sVar.f234075b = fVar;
                            CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f248012e;
                            if (carLicensePlateListViewContract$ViewModel != null) {
                                C79889p pVar = this.f248013f;
                                if (pVar != null) {
                                    ((C79896s) pVar).mo110060c(carLicensePlateListViewContract$ViewModel);
                                } else {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                }
                            } else {
                                C79889p pVar2 = this.f248013f;
                                if (pVar2 != null) {
                                    ((C79896s) pVar2).mo110059b();
                                } else {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                }
                            }
                            C79889p pVar3 = this.f248013f;
                            if (pVar3 != null) {
                                this.f248012e = ((C79896s) pVar3).getViewModel();
                                StringBuilder sb = new StringBuilder();
                                sb.append("onPostCreate, viewModel.callbackAfterCreated:");
                                CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel2 = this.f248012e;
                                sb.append(carLicensePlateListViewContract$ViewModel2 != null && carLicensePlateListViewContract$ViewModel2.f248032e);
                                Log.m105924i("MicroMsg.CarLicensePlateListUI", sb.toString());
                                return;
                            }
                            C87412m.m108603p("presenter");
                            throw null;
                        }
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                    C87412m.m108603p("emptyView");
                    throw null;
                }
                C87412m.m108603p("recyclerAdapter");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public View provideCustomActivityContentView() {
        return new TouchableLayout(this);
    }
}
