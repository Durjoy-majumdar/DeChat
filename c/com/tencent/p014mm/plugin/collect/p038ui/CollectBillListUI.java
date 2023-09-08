package com.tencent.p014mm.plugin.collect.p038ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import e21.C75480d0;
import e21.C75483n0;
import h21.C76100b;
import h21.C76102c;
import h21.C76103d;
import h21.C76104e;
import h21.C76105f;
import h21.C76106g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import ob0.C117747y;
import p910lj.C76701a;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillListUI */
public class CollectBillListUI extends WalletBaseUI {

    /* renamed from: d */
    public ListView f197752d;

    /* renamed from: e */
    public C76100b f197753e;

    /* renamed from: f */
    public View f197754f;

    /* renamed from: g */
    public LinearLayout f197755g;

    /* renamed from: h */
    public CollectPullDownView f197756h;

    /* renamed from: i */
    public TextView f197757i;

    /* renamed from: j */
    public Dialog f197758j;

    /* renamed from: n */
    public boolean f197759n = false;

    /* renamed from: o */
    public boolean f197760o = false;

    /* renamed from: p */
    public boolean f197761p = false;

    /* renamed from: q */
    public int f197762q = 0;

    /* renamed from: r */
    public int f197763r = 20;

    /* renamed from: s */
    public int f197764s = 0;

    /* renamed from: t */
    public long f197765t = 0;

    /* renamed from: u */
    public List<C75480d0> f197766u = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillListUI$a */
    public class C68830a implements AdapterView.OnItemClickListener {
        public C68830a() {
        }

        /* JADX WARNING: type inference failed for: r20v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r20, android.view.View r21, int r22, long r23) {
            /*
                r19 = this;
                r6 = r19
                r7 = r20
                r8 = r22
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r7)
                r1 = r21
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r0.add(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r23)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r4 = r19
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.CollectBillListUI"
                java.lang.String r4 = "click item: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
                java.lang.String r1 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r4 = "onItemClick"
                java.lang.String r5 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r9 = "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5"
                if (r8 < 0) goto L_0x00e2
                android.widget.Adapter r10 = r20.getAdapter()
                int r10 = r10.getCount()
                if (r8 < r10) goto L_0x005c
                goto L_0x00e2
            L_0x005c:
                android.content.Intent r10 = new android.content.Intent
                com.tencent.mm.plugin.collect.ui.CollectBillListUI r11 = com.tencent.p014mm.plugin.collect.p038ui.CollectBillListUI.this
                androidx.appcompat.app.AppCompatActivity r11 = r11.getContext()
                java.lang.Class<com.tencent.mm.plugin.collect.ui.CollectBillUI> r12 = com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI.class
                r10.<init>(r11, r12)
                java.lang.Object r7 = r7.getItemAtPosition(r8)
                e21.d0 r7 = (e21.C75480d0) r7
                if (r7 != 0) goto L_0x0082
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r22)
                r0[r3] = r7
                java.lang.String r3 = "invaild record: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r0)
                j20.C117292a.m165361g(r6, r9, r5, r4, r1)
                return
            L_0x0082:
                int r2 = r7.f221805a
                java.lang.String r8 = "key_type"
                r10.putExtra(r8, r2)
                long r7 = r7.f221806b
                java.lang.String r2 = "key_timestamp"
                r10.putExtra(r2, r7)
                r2 = 2
                java.lang.String r7 = "key_from_scene"
                r10.putExtra(r7, r2)
                com.tencent.mm.plugin.collect.ui.CollectBillListUI r2 = com.tencent.p014mm.plugin.collect.p038ui.CollectBillListUI.this
                k20.a r7 = new k20.a
                r7.<init>()
                r7.mo10233c(r10)
                java.lang.Object[] r12 = r7.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5"
                java.lang.String r14 = "onItemClick"
                java.lang.String r15 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r16 = "Undefined"
                java.lang.String r17 = "startActivity"
                java.lang.String r18 = "(Landroid/content/Intent;)V"
                r11 = r2
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r7 = r7.mo10231a(r3)
                android.content.Intent r7 = (android.content.Intent) r7
                r2.startActivity(r7)
                java.lang.String r12 = "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5"
                java.lang.String r13 = "onItemClick"
                java.lang.String r14 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r15 = "Undefined"
                java.lang.String r16 = "startActivity"
                java.lang.String r17 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r7 = 13944(0x3678, float:1.954E-41)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = 3
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r3] = r8
                r2.mo160131h(r7, r0)
                j20.C117292a.m165361g(r6, r9, r5, r4, r1)
                return
            L_0x00e2:
                j20.C117292a.m165361g(r6, r9, r5, r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.p038ui.CollectBillListUI.C68830a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillListUI$b */
    public class C68831b implements AbsListView.OnScrollListener {
        public C68831b(CollectBillListUI collectBillListUI) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectBillListUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectBillListUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectBillListUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectBillListUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: H7 */
    public final void mo94676H7() {
        int count = this.f197753e.getCount();
        if (count > 0) {
            long j = ((C75480d0) ((ArrayList) this.f197753e.f223014e).get(count - 1)).f221806b;
            if (j < this.f197765t) {
                Log.m105925i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", Long.valueOf(j), Long.valueOf(this.f197765t));
                this.f197765t = j;
            }
        }
        Log.m105925i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", Integer.valueOf(this.f197762q), Long.valueOf(this.f197765t));
        doSceneProgress(new C75483n0(this.f197762q, this.f197765t, 0, this.f197763r, 0), false);
        this.f197759n = true;
    }

    /* renamed from: I7 */
    public final void mo94677I7(int i, long j, int i2, int i3) {
        Log.m105925i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", Integer.valueOf(this.f197762q), Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        doSceneProgress(new C75483n0(this.f197762q, j, i2, this.f197763r, i3, i), false);
        this.f197764s++;
    }

    /* renamed from: J7 */
    public final void mo94678J7() {
        CollectPullDownView collectPullDownView = this.f197756h;
        collectPullDownView.scrollTo(0, collectPullDownView.getTopHeight());
    }

    /* renamed from: K7 */
    public final void mo94679K7() {
        this.f197752d.setVisibility(8);
        this.f197755g.setVisibility(0);
        this.f197757i.setVisibility(0);
    }

    /* renamed from: L7 */
    public final void mo94680L7(String str) {
        if (this.f197753e.getCount() == 0) {
            Log.m105924i("MicroMsg.CollectBillListUI", "show empty view");
            if (!Util.isNullOrNil(str)) {
                this.f197757i.setText(str);
            } else if (this.f197761p) {
                this.f197757i.setText(getString(C0966R.string.bfy));
            } else {
                this.f197757i.setText(getString(C0966R.string.bfy) + getString(C0966R.string.bfz));
            }
            mo94679K7();
        } else if (!Util.isNullOrNil(str)) {
            C76701a.makeText((Context) getContext(), (CharSequence) str, 1).show();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7014uy;
    }

    public void initView() {
        this.f197752d = (ListView) findViewById(C0966R.C0970id.bgx);
        this.f197755g = (LinearLayout) findViewById(C0966R.C0970id.bgv);
        this.f197757i = (TextView) findViewById(C0966R.C0970id.bgw);
        this.f197754f = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f7016v0, this.f197752d, false);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, C76577a.m92151b(this, 5)));
        this.f197752d.addHeaderView(view, (Object) null, true);
        new View(this).setLayoutParams(new AbsListView.LayoutParams(-1, C76577a.m92151b(this, 10)));
        this.f197752d.addFooterView(view, (Object) null, true);
        this.f197752d.setOverScrollMode(2);
        C76100b bVar = new C76100b(this);
        this.f197753e = bVar;
        this.f197752d.setAdapter(bVar);
        this.f197752d.setOnItemClickListener(new C68830a());
        this.f197752d.setOnScrollListener(new C68831b(this));
        CollectPullDownView collectPullDownView = (CollectPullDownView) findViewById(C0966R.C0970id.bgz);
        this.f197756h = collectPullDownView;
        collectPullDownView.setTopViewVisible(false);
        this.f197756h.setIsTopShowAll(false);
        this.f197756h.setBottomViewVisible(true);
        this.f197756h.setIsBottomShowAll(false);
        this.f197756h.setCanOverScrool(true);
        this.f197756h.setAtTopCallBack(new C76104e(this));
        this.f197756h.setAtBottomCallBack(new C76105f(this));
        this.f197756h.setOnTopLoadDataListener(new C76106g(this));
        this.f197756h.setOnBottomLoadDataListener(new C76102c(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setMMTitle((int) C0966R.string.f360281bg0);
        this.f197758j = C75197d0.m90164e(this, false, new C76103d(this));
        mo94676H7();
        C115669n.INSTANCE.mo160131h(13944, 4);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        int i4;
        if (!(yVar instanceof C75483n0)) {
            return false;
        }
        C75483n0 n0Var = (C75483n0) yVar;
        if (this.f197758j.isShowing()) {
            this.f197758j.dismiss();
        }
        this.f197756h.setLoadDataEnd(true);
        if (i == 0 && i2 == 0) {
            if (n0Var.f221831f != 0) {
                this.f197761p = n0Var.f221829d;
                if (n0Var.f221830e) {
                    if (!((ArrayList) n0Var.f221837o).isEmpty()) {
                        ((ArrayList) this.f197766u).addAll(n0Var.f221837o);
                    }
                    int i5 = n0Var.f221833h;
                    if (i5 != 0 || n0Var.f221834i <= 0) {
                        this.f197764s = 0;
                        this.f197765t = n0Var.f221835j;
                        if (i5 == 0) {
                            this.f197761p = false;
                        } else {
                            this.f197761p = true;
                        }
                        if (((ArrayList) this.f197766u).size() > 0) {
                            C76100b bVar = this.f197753e;
                            List<C75480d0> list = this.f197766u;
                            ((ArrayList) bVar.f223014e).clear();
                            ((ArrayList) bVar.f223014e).addAll(list);
                            bVar.notifyDataSetChanged();
                        } else {
                            Log.m105924i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
                            mo94679K7();
                            if (!Util.isNullOrNil(n0Var.f221836n)) {
                                this.f197757i.setText(n0Var.f221836n);
                                this.f197757i.setVisibility(0);
                            }
                            C76100b bVar2 = this.f197753e;
                            ((ArrayList) bVar2.f223014e).clear();
                            bVar2.notifyDataSetChanged();
                        }
                    } else {
                        Log.m105925i("MicroMsg.CollectBillListUI", "continue retry: %d", Integer.valueOf(this.f197764s));
                        mo94677I7(n0Var.f221834i, n0Var.f221835j, n0Var.f221832g, n0Var.f221831f);
                    }
                    return true;
                }
                if (!((ArrayList) n0Var.f221837o).isEmpty()) {
                    C76100b bVar3 = this.f197753e;
                    List<C75480d0> list2 = n0Var.f221837o;
                    ((ArrayList) bVar3.f223014e).clear();
                    ((ArrayList) bVar3.f223014e).addAll(list2);
                    bVar3.notifyDataSetChanged();
                    long j = ((C75480d0) ((ArrayList) n0Var.f221837o).get(0)).f221806b;
                    ArrayList arrayList = (ArrayList) n0Var.f221837o;
                    this.f197765t = ((C75480d0) arrayList.get(arrayList.size() - 1)).f221806b;
                } else if (n0Var.f221833h != 0 || (i3 = n0Var.f221834i) <= 0) {
                    mo94679K7();
                } else {
                    Log.m105925i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", Integer.valueOf(i3), Long.valueOf(n0Var.f221835j));
                    mo94677I7(n0Var.f221834i, n0Var.f221835j, n0Var.f221832g, n0Var.f221831f);
                    ((ArrayList) this.f197766u).clear();
                }
                this.f197760o = false;
            } else if (this.f197760o) {
                Log.m105924i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
                return true;
            } else if (n0Var.f221832g != 1) {
                this.f197761p = n0Var.f221829d;
                this.f197752d.setVisibility(0);
                this.f197755g.setVisibility(8);
                if (n0Var.f221830e) {
                    if (!((ArrayList) n0Var.f221837o).isEmpty()) {
                        ((ArrayList) this.f197766u).addAll(n0Var.f221837o);
                    }
                    if (n0Var.f221833h != 0 || n0Var.f221834i <= 0 || !((ArrayList) n0Var.f221837o).isEmpty()) {
                        this.f197764s = 0;
                        if (((ArrayList) this.f197766u).size() > 0) {
                            C76100b bVar4 = this.f197753e;
                            ((ArrayList) bVar4.f223014e).addAll(this.f197766u);
                            bVar4.notifyDataSetChanged();
                        } else {
                            Log.m105924i("MicroMsg.CollectBillListUI", "retry data is empty");
                            mo94680L7(n0Var.f221836n);
                        }
                        this.f197759n = false;
                        this.f197765t = n0Var.f221835j;
                        mo94678J7();
                        this.f197756h.setBottomViewVisible(!this.f197761p);
                    } else {
                        Log.m105925i("MicroMsg.CollectBillListUI", "continue retry: %d", Integer.valueOf(this.f197764s));
                        mo94677I7(n0Var.f221834i, n0Var.f221835j, n0Var.f221832g, n0Var.f221831f);
                    }
                    return true;
                } else if (!((ArrayList) n0Var.f221837o).isEmpty()) {
                    C76100b bVar5 = this.f197753e;
                    ((ArrayList) bVar5.f223014e).addAll(n0Var.f221837o);
                    bVar5.notifyDataSetChanged();
                    ArrayList arrayList2 = (ArrayList) n0Var.f221837o;
                    long j2 = ((C75480d0) arrayList2.get(arrayList2.size() - 1)).f221806b;
                    this.f197765t = j2;
                    if (j2 > n0Var.f221835j) {
                        Log.m105918d("MicroMsg.CollectBillListUI", "use from_timestamp");
                        this.f197765t = n0Var.f221835j;
                    } else {
                        Log.m105925i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", Long.valueOf(j2), Long.valueOf(n0Var.f221835j));
                    }
                    this.f197759n = false;
                    mo94678J7();
                    this.f197756h.setBottomViewVisible(!this.f197761p);
                } else if (n0Var.f221833h != 0 || (i4 = n0Var.f221834i) <= 0) {
                    this.f197759n = false;
                    mo94678J7();
                    Log.m105924i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
                    mo94680L7(n0Var.f221836n);
                    this.f197756h.setBottomViewVisible(!this.f197761p);
                } else {
                    Log.m105925i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", Integer.valueOf(i4), Long.valueOf(n0Var.f221835j));
                    mo94677I7(n0Var.f221834i, n0Var.f221835j, n0Var.f221832g, n0Var.f221831f);
                    ((ArrayList) this.f197766u).clear();
                }
            } else if (!((ArrayList) n0Var.f221837o).isEmpty()) {
                C76100b bVar6 = this.f197753e;
                ((ArrayList) bVar6.f223014e).addAll(0, n0Var.f221837o);
                bVar6.notifyDataSetChanged();
                long j3 = ((C75480d0) ((ArrayList) n0Var.f221837o).get(0)).f221806b;
            }
            return true;
        }
        Log.m105925i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(n0Var.f221831f), Integer.valueOf(n0Var.f221832g));
        if (n0Var.f221831f != 0) {
            this.f197760o = false;
        } else if (n0Var.f221832g == 0) {
            this.f197759n = false;
            mo94678J7();
        }
        if (this.f197753e.isEmpty()) {
            mo94679K7();
        }
        C76701a.makeText((Context) this, (int) C0966R.string.bfx, 1).show();
        return true;
    }
}
