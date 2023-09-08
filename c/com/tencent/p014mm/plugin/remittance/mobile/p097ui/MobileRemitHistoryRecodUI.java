package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C77947ig2;
import te3.gj4;
import xi2.C78842a;
import xi2.C78843b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI */
public class MobileRemitHistoryRecodUI extends MobileRemitBaseUI {

    /* renamed from: r */
    public static final /* synthetic */ int f203842r = 0;

    /* renamed from: d */
    public RecyclerView f203843d;

    /* renamed from: e */
    public TextView f203844e;

    /* renamed from: f */
    public String f203845f = null;

    /* renamed from: g */
    public String f203846g = null;

    /* renamed from: h */
    public boolean f203847h = false;

    /* renamed from: i */
    public List<C77947ig2> f203848i = new ArrayList();

    /* renamed from: j */
    public LinearLayoutManager f203849j;

    /* renamed from: n */
    public C70528f f203850n;

    /* renamed from: o */
    public int f203851o = 0;

    /* renamed from: p */
    public int[] f203852p = new int[2];

    /* renamed from: q */
    public Runnable f203853q = new C70524b();

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$g */
    public static class C5052g extends RecyclerView.C0129l {

        /* renamed from: d */
        public Paint f20402d;

        /* renamed from: e */
        public Paint f20403e;

        /* renamed from: f */
        public int f20404f;

        /* renamed from: g */
        public int f20405g;

        public C5052g(Context context) {
            this.f20404f = C76577a.m92150a(context, 0.5f);
            this.f20405g = C76577a.m92151b(context, 16);
            Paint paint = new Paint();
            this.f20402d = paint;
            paint.setColor(context.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
            Paint paint2 = new Paint();
            this.f20403e = paint2;
            paint2.setColor(context.getResources().getColor(C0966R.color.BW_93));
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            super.mo21g(rect, view, recyclerView, wVar);
            rect.bottom = this.f20404f;
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int i = this.f20405g + paddingLeft;
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                float bottom = (float) childAt.getBottom();
                float bottom2 = (float) (childAt.getBottom() + this.f20404f);
                if (i2 == childCount - 1) {
                    canvas.drawRect((float) paddingLeft, bottom, (float) width, bottom2, this.f20403e);
                } else {
                    canvas.drawRect((float) i, bottom, (float) width, bottom2, this.f20402d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$a */
    public class C70523a implements MenuItem.OnMenuItemClickListener {
        public C70523a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MobileRemitHistoryRecodUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$b */
    public class C70524b implements Runnable {
        public C70524b() {
        }

        public void run() {
            if (MobileRemitHistoryRecodUI.this.f203843d.getScrollState() == 0) {
                MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = MobileRemitHistoryRecodUI.this;
                if (!mobileRemitHistoryRecodUI.f203850n.f203861d && mobileRemitHistoryRecodUI.f203849j.mo16959E() + 1 == MobileRemitHistoryRecodUI.this.f203850n.getItemCount()) {
                    Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "first screen refresh data!");
                    MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI2 = MobileRemitHistoryRecodUI.this;
                    Log.m105925i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "doFetchHistoryRecord() mLastId:%s", mobileRemitHistoryRecodUI2.f203846g);
                    mobileRemitHistoryRecodUI2.doSceneProgress(new NetSceneMobileRemitGetRecord(mobileRemitHistoryRecodUI2.f203846g, mobileRemitHistoryRecodUI2.f203845f), false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$c */
    public class C70525c extends C78842a {

        /* renamed from: a */
        public final /* synthetic */ gj4 f203856a;

        public C70525c(gj4 gj4) {
            this.f203856a = gj4;
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "wxname_chg_win dialog click jumpItem.action:exit");
            MobileRemitHistoryRecodUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "wxname_chg_win dialog click jumpItem.action:continue");
            C78843b.m95367a(MobileRemitHistoryRecodUI.this.getContext(), this.f203856a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$d */
    public class C70526d extends C78842a {

        /* renamed from: a */
        public final /* synthetic */ gj4 f203858a;

        public C70526d(gj4 gj4) {
            this.f203858a = gj4;
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "jump_win dialog click jumpItem.action:exit");
            MobileRemitHistoryRecodUI.this.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "jump_win dialog click jumpItem.action:continue");
            C78843b.m95367a(MobileRemitHistoryRecodUI.this.getContext(), this.f203858a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$e */
    public static class C70527e extends RecyclerView.C16631z {

        /* renamed from: z */
        public View f203860z;

        public C70527e(View view) {
            super(view);
            this.f203860z = view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f */
    public static class C70528f extends RecyclerView.C16613e {

        /* renamed from: d */
        public boolean f203861d;

        /* renamed from: e */
        public Context f203862e;

        /* renamed from: f */
        public List<C77947ig2> f203863f;

        /* renamed from: g */
        public int f203864g;

        /* renamed from: h */
        public int f203865h;

        /* renamed from: i */
        public int f203866i;

        /* renamed from: j */
        public C70532h f203867j;

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f$a */
        public class C70529a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C70533i f203868d;

            /* renamed from: e */
            public final /* synthetic */ C77947ig2 f203869e;

            public C70529a(C70533i iVar, C77947ig2 ig22) {
                this.f203868d = iVar;
                this.f203869e = ig22;
            }

            public void run() {
                int measuredWidth = this.f203868d.f203873A.getMeasuredWidth();
                if (measuredWidth != 0) {
                    float measureText = this.f203868d.f203874B.getPaint().measureText(this.f203869e.f227616e);
                    float measureText2 = this.f203868d.f203875C.getPaint().measureText(this.f203869e.f227617f);
                    float b = (float) C76577a.m92151b(C70528f.this.f203862e, 14);
                    float f = (float) measuredWidth;
                    if (measureText + measureText2 + b > f) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f203868d.f203874B.getLayoutParams();
                        layoutParams.width = (int) ((f - measureText2) - b);
                        this.f203868d.f203874B.setLayoutParams(layoutParams);
                    }
                }
                this.f203868d.f203874B.setText(this.f203869e.f227616e);
                this.f203868d.f203875C.setText(this.f203869e.f227617f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f$b */
        public class C70530b extends C7089c0 {
            public C70530b() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                C70532h hVar = C70528f.this.f203867j;
                if (hVar != null) {
                    hVar.onClick(view);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f$c */
        public class C70531c implements View.OnLongClickListener {
            public C70531c() {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C70532h hVar = C70528f.this.f203867j;
                if (hVar != null) {
                    boolean onLongClick = hVar.onLongClick(view);
                    C117292a.m165362h(onLongClick, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return onLongClick;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        public C70528f(Context context, boolean z, List<C77947ig2> list, C70532h hVar) {
            this.f203862e = context;
            this.f203861d = z;
            this.f203863f = list;
            this.f203867j = hVar;
            this.f203864g = context.getResources().getColor(C0966R.color.f3139gn);
            this.f203865h = context.getResources().getColor(C0966R.color.BW_0_Alpha_0_5);
            this.f203866i = context.getResources().getColor(C0966R.color.BW_0_Alpha_0_3);
        }

        public int getItemCount() {
            return this.f203861d ? this.f203863f.size() : this.f203863f.size() + 1;
        }

        public int getItemViewType(int i) {
            return (!this.f203861d && i == getItemCount() - 1) ? 1 : 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            RecyclerView.C16631z zVar2 = zVar;
            int i2 = i;
            if (zVar2 instanceof C70533i) {
                List<C77947ig2> list = this.f203863f;
                if (list != null && i2 >= 0 && i2 < list.size()) {
                    C70533i iVar = (C70533i) zVar2;
                    C77947ig2 ig22 = this.f203863f.get(i2);
                    Log.m105919d("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "onBindViewHolder() i:%s invalid:%s", Integer.valueOf(i), Integer.valueOf(ig22.f227620i));
                    View view = iVar.f203878z;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    iVar.f203873A.post(new C70529a(iVar, ig22));
                    iVar.f203876D.setText(ig22.f227618g);
                    if (ig22.f227620i == 0) {
                        iVar.f203874B.setTextColor(this.f203864g);
                        iVar.f203875C.setTextColor(this.f203864g);
                        iVar.f203876D.setTextColor(this.f203865h);
                        iVar.f203877E.setVisibility(8);
                    } else {
                        iVar.f203874B.setTextColor(this.f203866i);
                        iVar.f203875C.setTextColor(this.f203866i);
                        iVar.f203876D.setTextColor(this.f203866i);
                        iVar.f203877E.setVisibility(0);
                    }
                    iVar.f203878z.setTag(ig22);
                    iVar.f203878z.setOnClickListener(new C70530b());
                    iVar.f203878z.setOnLongClickListener(new C70531c());
                    return;
                }
                return;
            }
            C70527e eVar = (C70527e) zVar2;
            if (this.f203861d) {
                View view3 = eVar.f203860z;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view5 = eVar.f203860z;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$HistoryRecordAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i == 0 ? new C70533i(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bg9, viewGroup, false)) : new C70527e(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bg_, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$h */
    public interface C70532h {
        void onClick(View view);

        boolean onLongClick(View view);
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$i */
    public static class C70533i extends RecyclerView.C16631z {

        /* renamed from: A */
        public LinearLayout f203873A;

        /* renamed from: B */
        public TextView f203874B;

        /* renamed from: C */
        public TextView f203875C;

        /* renamed from: D */
        public TextView f203876D;

        /* renamed from: E */
        public TextView f203877E;

        /* renamed from: z */
        public View f203878z;

        public C70533i(View view) {
            super(view);
            this.f203878z = view;
            this.f203873A = (LinearLayout) view.findViewById(C0966R.C0970id.h_7);
            this.f203874B = (TextView) view.findViewById(C0966R.C0970id.hg4);
            this.f203875C = (TextView) view.findViewById(C0966R.C0970id.iek);
            this.f203876D = (TextView) view.findViewById(C0966R.C0970id.hvn);
            this.f203877E = (TextView) view.findViewById(C0966R.C0970id.f359287k10);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bg8;
    }

    public void initView() {
        super.initView();
        setMMTitle(getString(C0966R.string.gu8));
        setBackBtn(new C70523a());
        this.f203843d = (RecyclerView) findViewById(C0966R.C0970id.gwk);
        this.f203844e = (TextView) findViewById(C0966R.C0970id.gwj);
        if (((ArrayList) this.f203848i).isEmpty()) {
            this.f203843d.setVisibility(8);
            this.f203844e.setVisibility(0);
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.f203849j = linearLayoutManager;
        linearLayoutManager.mo16974W(1);
        this.f203843d.setLayoutManager(this.f203849j);
        this.f203843d.mo17085h0(new C5052g(getContext()));
        C70528f fVar = new C70528f(getContext(), this.f203847h, this.f203848i, new C70555b(this));
        this.f203850n = fVar;
        this.f203843d.setAdapter(fVar);
        this.f203843d.mo17043c(new C70558c(this));
        this.f203850n.notifyDataSetChanged();
        this.f203843d.post(this.f203853q);
        this.f203843d.mo17092j0(new C5056d(this));
        this.f203843d.setVisibility(0);
        this.f203844e.setVisibility(8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f203845f = getIntent().getStringExtra("key_homepage_ext");
        this.f203847h = getIntent().getBooleanExtra("key_finish", true);
        this.f203846g = getIntent().getStringExtra("key_last_id");
        ArrayList<NetSceneMobileRemitGetRecord.HisRcvrParcel> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_history_record");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            List<C77947ig2> list = this.f203848i;
            int i = NetSceneMobileRemitGetRecord.f115981u;
            ArrayList arrayList = new ArrayList();
            for (NetSceneMobileRemitGetRecord.HisRcvrParcel hisRcvrParcel : parcelableArrayListExtra) {
                C77947ig2 ig22 = new C77947ig2();
                ig22.f227615d = hisRcvrParcel.f115983d;
                ig22.f227616e = hisRcvrParcel.f115984e;
                ig22.f227617f = hisRcvrParcel.f115985f;
                ig22.f227618g = hisRcvrParcel.f115986g;
                ig22.f227619h = hisRcvrParcel.f115987h;
                ig22.f227620i = hisRcvrParcel.f115988i;
                arrayList.add(ig22);
            }
            ((ArrayList) list).addAll(arrayList);
        }
        Log.m105925i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "initData() mFinish:%s mLastId:%s mHisRecord.size:%s", Boolean.valueOf(this.f203847h), this.f203846g, Integer.valueOf(((ArrayList) this.f203848i).size()));
        initView();
        addSceneEndListener(2993);
        addSceneEndListener(1495);
        addSceneEndListener(1275);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2993);
        removeSceneEndListener(1495);
        removeSceneEndListener(1275);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: te3.cj4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: te3.ej4} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r10, int r11, java.lang.String r12, ob0.C117747y r13) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "errType:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " errCode:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " errMsg:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " scenetype:"
            r0.append(r1)
            int r1 = r13.getType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.mobileRemit.MobileRemitHistoryRecodUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            if (r10 != 0) goto L_0x0173
            if (r11 != 0) goto L_0x0173
            boolean r10 = r13 instanceof com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord
            r11 = 2131839043(0x7f114843, float:1.9311326E38)
            r12 = 0
            r2 = 1
            if (r10 == 0) goto L_0x008f
            com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord r13 = (com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord) r13
            te3.ej4 r10 = r13.f115982t
            if (r10 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r12 = r10
        L_0x0048:
            if (r12 == 0) goto L_0x0071
            int r10 = r12.f132961d
            if (r10 != 0) goto L_0x0071
            java.lang.String r10 = r12.f132965h
            r9.f203846g = r10
            boolean r10 = r12.f132964g
            r9.f203847h = r10
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f r11 = r9.f203850n
            r11.f203861d = r10
            java.util.LinkedList<te3.ig2> r10 = r12.f132963f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x006b
            java.util.List<te3.ig2> r10 = r9.f203848i
            java.util.LinkedList<te3.ig2> r11 = r12.f132963f
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.addAll(r11)
        L_0x006b:
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f r10 = r9.f203850n
            r10.notifyDataSetChanged()
            goto L_0x008e
        L_0x0071:
            androidx.appcompat.app.AppCompatActivity r10 = r9.getContext()
            if (r12 == 0) goto L_0x0083
            java.lang.String r13 = r12.f132962e
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            java.lang.String r11 = r12.f132962e
            goto L_0x0087
        L_0x0083:
            java.lang.String r11 = r9.getString(r11)
        L_0x0087:
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (java.lang.CharSequence) r11, (int) r0)
            r10.show()
        L_0x008e:
            return r2
        L_0x008f:
            boolean r10 = r13 instanceof com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo
            if (r10 == 0) goto L_0x0143
            com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo r13 = (com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo) r13
            te3.gj4 r10 = r13.f115992v
            if (r10 != 0) goto L_0x009a
            r10 = r12
        L_0x009a:
            if (r10 != 0) goto L_0x00a2
            java.lang.String r10 = "NetSceneMobileRemitGetRecvInfo rcvrResp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            return r2
        L_0x00a2:
            java.lang.String r13 = r13.f115990t
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r13
            int r0 = r10.f227461d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            r0 = 2
            java.lang.String r4 = r10.f227462e
            r3[r0] = r4
            java.lang.String r0 = "NetSceneMobileRemitGetRecvInfo rcvrId:%s ret_code:%s ret_msg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
            int r0 = r10.f227461d
            if (r0 == 0) goto L_0x0111
            int r12 = r10.f227463f
            if (r12 != r2) goto L_0x00e6
            java.util.List<te3.ig2> r12 = r9.f203848i
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00cb:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r12.next()
            te3.ig2 r0 = (te3.C77947ig2) r0
            java.lang.String r1 = r0.f227615d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r13)
            if (r1 == 0) goto L_0x00cb
            r0.f227620i = r2
        L_0x00e1:
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$f r12 = r9.f203850n
            r12.notifyDataSetChanged()
        L_0x00e6:
            androidx.appcompat.app.AppCompatActivity r3 = r9.getContext()
            java.lang.String r12 = r10.f227462e
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x00f7
            java.lang.String r10 = r9.getString(r11)
            goto L_0x00f9
        L_0x00f7:
            java.lang.String r10 = r10.f227462e
        L_0x00f9:
            r4 = r10
            android.content.res.Resources r10 = r9.getResources()
            r11 = 2131832967(0x7f113087, float:1.9299003E38)
            java.lang.String r6 = r10.getString(r11)
            r7 = 0
            r8 = 0
            java.lang.String r5 = ""
            qo3.g r10 = nj3.C76879j.m92711E(r3, r4, r5, r6, r7, r8)
            r10.show()
            return r2
        L_0x0111:
            te3.ar3 r11 = r10.f227464g
            if (r11 == 0) goto L_0x0126
            java.lang.String r11 = "show remark or nickname change dialog!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            te3.ar3 r11 = r10.f227464g
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$c r13 = new com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$c
            r13.<init>(r10)
            com.tencent.p014mm.wallet_core.model.C75129p.m90109d(r9, r11, r12, r13)
            goto L_0x0142
        L_0x0126:
            te3.ar3 r11 = r10.f227477w
            if (r11 == 0) goto L_0x013b
            java.lang.String r11 = "show free oneself from dialog!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            te3.ar3 r11 = r10.f227477w
            com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$d r13 = new com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI$d
            r13.<init>(r10)
            com.tencent.p014mm.wallet_core.model.C75129p.m90109d(r9, r11, r12, r13)
            goto L_0x0142
        L_0x013b:
            androidx.appcompat.app.AppCompatActivity r11 = r9.getContext()
            xi2.C78843b.m95367a(r11, r10)
        L_0x0142:
            return r2
        L_0x0143:
            boolean r10 = r13 instanceof wi2.C53180c
            if (r10 == 0) goto L_0x0199
            wi2.c r13 = (wi2.C53180c) r13
            te3.cj4 r10 = r13.f148364t
            if (r10 != 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r12 = r10
        L_0x014f:
            if (r12 == 0) goto L_0x0155
            int r10 = r12.f131782d
            if (r10 == 0) goto L_0x0172
        L_0x0155:
            androidx.appcompat.app.AppCompatActivity r10 = r9.getContext()
            if (r12 == 0) goto L_0x0167
            java.lang.String r13 = r12.f131783e
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0164
            goto L_0x0167
        L_0x0164:
            java.lang.String r11 = r12.f131783e
            goto L_0x016b
        L_0x0167:
            java.lang.String r11 = r9.getString(r11)
        L_0x016b:
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (java.lang.CharSequence) r11, (int) r0)
            r10.show()
        L_0x0172:
            return r2
        L_0x0173:
            boolean r10 = r13 instanceof com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord
            if (r10 == 0) goto L_0x0178
            goto L_0x017f
        L_0x0178:
            boolean r10 = r13 instanceof com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo
            if (r10 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            boolean r10 = r13 instanceof wi2.C53180c
        L_0x017f:
            if (r11 != 0) goto L_0x0199
            androidx.appcompat.app.AppCompatActivity r10 = r9.getContext()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r11 == 0) goto L_0x0192
            r11 = 2131832968(0x7f113088, float:1.9299005E38)
            java.lang.String r12 = r9.getString(r11)
        L_0x0192:
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (java.lang.CharSequence) r12, (int) r0)
            r10.show()
        L_0x0199:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.mobile.p097ui.MobileRemitHistoryRecodUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }
}
