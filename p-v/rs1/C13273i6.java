package rs1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import m53.C10756c;
import m53.C10762h;
import m53.C10763i;
import o40.C61937h;
import p244tt.C14088e;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C48643a02;
import te3.C48797b21;
import te3.C49028cn3;
import te3.C50292lo2;
import te3.C51418tn0;
import te3.C52189yz1;
import te3.h35;
import tf1.C13914m;

/* renamed from: rs1.i6 */
public final class C13273i6 extends UIComponent implements C10763i {

    /* renamed from: d */
    public LinearLayout f37674d;

    /* renamed from: e */
    public WxRecyclerView f37675e;

    /* renamed from: f */
    public TextView f37676f;

    /* renamed from: g */
    public final ArrayList<C13274a> f37677g = new ArrayList<>();

    /* renamed from: h */
    public final C51418tn0 f37678h = new C51418tn0();

    /* renamed from: i */
    public int f37679i;

    /* renamed from: rs1.i6$a */
    public static final class C13274a implements C0740i2 {

        /* renamed from: d */
        public final C48797b21 f37680d;

        /* renamed from: e */
        public Long f37681e;

        /* renamed from: f */
        public h35 f37682f;

        /* renamed from: g */
        public C49028cn3 f37683g;

        /* renamed from: h */
        public String f37684h;

        /* renamed from: i */
        public Long f37685i;

        /* renamed from: j */
        public C50292lo2 f37686j;

        public C13274a(C48797b21 b212) {
            C87412m.m108594g(b212, "item");
            this.f37680d = b212;
        }

        /* renamed from: a */
        public final String mo12731a() {
            StringBuilder sb = new StringBuilder();
            sb.append("appid:");
            C50292lo2 lo22 = this.f37686j;
            String str = null;
            sb.append(lo22 != null ? lo22.f137549d : null);
            sb.append(", query:");
            C50292lo2 lo23 = this.f37686j;
            sb.append(lo23 != null ? lo23.f137550e : null);
            sb.append(", path:");
            C50292lo2 lo24 = this.f37686j;
            sb.append(lo24 != null ? lo24.f137551f : null);
            sb.append(", default_url:");
            C50292lo2 lo25 = this.f37686j;
            if (lo25 != null) {
                str = lo25.f137552g;
            }
            sb.append(str);
            sb.append(", ");
            return sb.toString();
        }

        /* renamed from: c */
        public int mo75c() {
            return C13274a.class.hashCode();
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            C13274a aVar = mVar instanceof C13274a ? (C13274a) mVar : null;
            return (aVar == null || !Util.isEqual(aVar.getItemId(), getItemId())) ? -1 : 0;
        }

        public long getItemId() {
            return (long) (this.f37680d.f130897f + '_' + this.f37680d.f130900i + '_' + this.f37680d.f130896e).hashCode();
        }
    }

    /* renamed from: rs1.i6$b */
    public static final class C13275b implements C10762h<C48643a02> {

        /* renamed from: a */
        public final /* synthetic */ C13273i6 f37687a;

        public C13275b(C13273i6 i6Var) {
            this.f37687a = i6Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
            if ((r5.length() > 0) == true) goto L_0x0035;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo605a(int r3, int r4, java.lang.String r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getEncashPrepareInfo failed: "
                r0.append(r1)
                r0.append(r3)
                r3 = 32
                r0.append(r3)
                r0.append(r4)
                r0.append(r3)
                r0.append(r5)
                java.lang.String r3 = r0.toString()
                java.lang.String r4 = "MicroMsg.FinderLiveIncomeListUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
                r3 = 1
                r4 = 0
                if (r5 == 0) goto L_0x0034
                int r0 = r5.length()
                if (r0 <= 0) goto L_0x0030
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                if (r0 != r3) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r3 = 0
            L_0x0035:
                if (r3 == 0) goto L_0x0041
                rs1.i6 r3 = r2.f37687a
                android.app.Activity r3 = r3.getContext()
                nj3.C76912y0.m92767f(r3, r5)
                goto L_0x0057
            L_0x0041:
                rs1.i6 r3 = r2.f37687a
                android.app.Activity r3 = r3.getContext()
                rs1.i6 r4 = r2.f37687a
                android.app.Activity r4 = r4.getContext()
                r5 = 2131826257(0x7f111651, float:1.9285393E38)
                java.lang.String r4 = r4.getString(r5)
                nj3.C76912y0.m92767f(r3, r4)
            L_0x0057:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13273i6.C13275b.mo605a(int, int, java.lang.String):void");
        }

        public void onSuccess(Object obj) {
            boolean z;
            C13274a aVar;
            boolean z2;
            C48643a02 a022 = (C48643a02) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("CgiGetEncashPrepareInfoRequest success, ");
            sb.append(C61937h.m72709h(a022 == null ? "" : a022));
            Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", sb.toString());
            if (a022 != null) {
                LinkedList<C52189yz1> linkedList = a022.f130184d;
                C87412m.m108593f(linkedList, "data.infos");
                List<T> J = C110818d0.m150912J(linkedList);
                C13273i6 i6Var = this.f37687a;
                Iterator it = ((ArrayList) J).iterator();
                while (it.hasNext()) {
                    C52189yz1 yz12 = (C52189yz1) it.next();
                    Iterator<C13274a> it4 = i6Var.f37677g.iterator();
                    while (true) {
                        z = false;
                        if (!it4.hasNext()) {
                            aVar = null;
                            break;
                        }
                        aVar = it4.next();
                        if (aVar.f37680d.f130896e == yz12.f145593h) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    C13274a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.f37681e = Long.valueOf(yz12.f145589d);
                        aVar2.f37683g = yz12.f145591f;
                        aVar2.f37682f = yz12.f145592g;
                        aVar2.f37684h = yz12.f145590e;
                        aVar2.f37685i = Long.valueOf(yz12.f145594i);
                        aVar2.f37686j = yz12.f145595j;
                        Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", "encashInterceptJumpInfo, " + aVar2.mo12731a());
                        C50292lo2 lo22 = aVar2.f37686j;
                        if (lo22 != null) {
                            String str = lo22.f137549d;
                            if (str == null || str.length() == 0) {
                                z = true;
                            }
                            if (!z) {
                                C14088e eVar = (C14088e) C86312j.m106911c(C14088e.class);
                                C50292lo2 lo23 = aVar2.f37686j;
                                String str2 = lo23 != null ? lo23.f137549d : null;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                eVar.u50(str2, new C13304k6(aVar2));
                            }
                        }
                        WxRecyclerView wxRecyclerView = i6Var.f37675e;
                        if (wxRecyclerView != null) {
                            RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                            if (adapter != null) {
                                adapter.notifyItemChanged(i6Var.f37677g.indexOf(aVar2));
                            }
                        } else {
                            C87412m.m108603p("listView");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13273i6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m12630c3(C13273i6 i6Var, String str) {
        i6Var.getClass();
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("allow_mix_content_mode", false);
            intent.putExtra("rawUrl", str);
            intent.putExtra("showShare", false);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C88144b.m109791i(i6Var.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: M1 */
    public void mo11005M1() {
        Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", "realNameDidSuccess callback");
        mo12730d3();
    }

    /* renamed from: a2 */
    public void mo11006a2() {
    }

    /* renamed from: d3 */
    public final void mo12730d3() {
        Log.m105924i("MicroMsg.FinderLiveIncomeListUIC", "refreshEncashInfo");
        C10756c cVar = (C10756c) C86709a0.m107533q(C10756c.class);
        ArrayList<C13274a> arrayList = this.f37677g;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C13274a aVar : arrayList) {
            arrayList2.add(Integer.valueOf(aVar.f37680d.f130896e));
        }
        cVar.mo10997dF(new LinkedList(arrayList2), new C13275b(this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ah7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0251 A[LOOP:3: B:78:0x024b->B:80:0x0251, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r1 = r21
            super.onCreate(r22)
            r0 = 2131301682(0x7f091532, float:1.8221429E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.entry_container)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f37674d = r0
            r0 = 2131307338(0x7f092b4a, float:1.82329E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r2
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r4 = r2.getContext()
            r5 = 1
            r6 = 0
            r3.<init>(r4, r5, r6)
            r2.setLayoutManager(r3)
            java.lang.String r2 = "findViewById<WxRecyclerV…ERTICAL, false)\n        }"
            gy3.C87412m.m108593f(r0, r2)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            r1.f37675e = r0
            r0 = 2131298233(0x7f0907b9, float:1.8214433E38)
            android.view.View r0 = r1.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.bottom_note)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f37676f = r0
            java.lang.String r2 = "MicroMsg.FinderLiveIncomeListUIC"
            te3.tn0 r0 = r1.f37678h     // Catch:{ all -> 0x0058 }
            android.content.Intent r3 = r21.getIntent()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "PARAMS_DATA"
            byte[] r3 = r3.getByteArrayExtra(r4)     // Catch:{ all -> 0x0058 }
            r0.parseFrom(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x0066
        L_0x0058:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x0066:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "initData "
            r0.append(r3)
            te3.tn0 r3 = r1.f37678h
            org.json.JSONObject r3 = o40.C61937h.m72709h(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            te3.tn0 r0 = r1.f37678h
            java.util.LinkedList<te3.b21> r0 = r0.f142294d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0093
            androidx.appcompat.app.AppCompatActivity r0 = r21.getActivity()
            r0.finish()
            goto L_0x027e
        L_0x0093:
            te3.tn0 r0 = r1.f37678h
            java.lang.String r0 = r0.f142295e
            if (r0 == 0) goto L_0x00a6
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != r5) goto L_0x00a6
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            java.lang.String r2 = "bottomNoteText"
            r3 = 0
            if (r0 == 0) goto L_0x00d6
            android.widget.TextView r0 = r1.f37676f
            if (r0 == 0) goto L_0x00d2
            r0.setVisibility(r6)
            android.widget.TextView r0 = r1.f37676f
            if (r0 == 0) goto L_0x00ce
            android.content.res.Resources r2 = r21.getResources()
            r4 = 2131827607(0x7f111b97, float:1.9288131E38)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            te3.tn0 r8 = r1.f37678h
            java.lang.String r8 = r8.f142295e
            r7[r6] = r8
            java.lang.String r2 = r2.getString(r4, r7)
            r0.setText(r2)
            goto L_0x00df
        L_0x00ce:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00d2:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x00d6:
            android.widget.TextView r0 = r1.f37676f
            if (r0 == 0) goto L_0x0285
            r2 = 8
            r0.setVisibility(r2)
        L_0x00df:
            te3.tn0 r0 = r1.f37678h
            java.util.LinkedList<te3.b21> r0 = r0.f142294d
            java.lang.String r2 = "resp.items"
            gy3.C87412m.m108593f(r0, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00f1:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0120
            java.lang.Object r7 = r0.next()
            r8 = r7
            te3.b21 r8 = (te3.C48797b21) r8
            int r9 = r8.f130895d
            r10 = 2
            if (r9 != r10) goto L_0x0119
            java.lang.String r8 = r8.f130900i
            if (r8 == 0) goto L_0x0114
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x010f
            r8 = 1
            goto L_0x0110
        L_0x010f:
            r8 = 0
        L_0x0110:
            if (r8 != r5) goto L_0x0114
            r8 = 1
            goto L_0x0115
        L_0x0114:
            r8 = 0
        L_0x0115:
            if (r8 == 0) goto L_0x0119
            r8 = 1
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r8 == 0) goto L_0x00f1
            r4.add(r7)
            goto L_0x00f1
        L_0x0120:
            java.util.Iterator r0 = r4.iterator()
        L_0x0124:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x020a
            java.lang.Object r4 = r0.next()
            te3.b21 r4 = (te3.C48797b21) r4
            java.lang.String r7 = r4.f130900i
            if (r7 != 0) goto L_0x0136
            java.lang.String r7 = ""
        L_0x0136:
            int r9 = r4.f130897f
            java.lang.String r10 = r4.f130898g
            java.lang.String r12 = r4.f130901j
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r4.f130903o
            int r4 = r1.f37679i
            int r8 = r4 + 1
            r1.f37679i = r8
            java.lang.String r14 = "entryContainer"
            if (r4 <= 0) goto L_0x0191
            android.view.View r4 = new android.view.View
            android.app.Activity r8 = r21.getContext()
            r4.<init>(r8)
            r8 = 2131101462(0x7f060716, float:1.7815334E38)
            r4.setBackgroundResource(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            android.app.Activity r11 = r21.getContext()
            int r11 = kg3.C76577a.m92151b(r11, r5)
            android.app.Activity r15 = r21.getContext()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r5 = kg3.C76577a.m92155f(r15, r5)
            r8.<init>(r11, r5)
            android.app.Activity r5 = r21.getContext()
            r11 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r5 = kg3.C76577a.m92155f(r5, r11)
            android.app.Activity r15 = r21.getContext()
            int r11 = kg3.C76577a.m92155f(r15, r11)
            r8.setMargins(r5, r6, r11, r6)
            android.widget.LinearLayout r5 = r1.f37674d
            if (r5 == 0) goto L_0x018d
            r5.addView(r4, r8)
            goto L_0x0191
        L_0x018d:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x0191:
            android.widget.TextView r4 = new android.widget.TextView
            android.app.Activity r5 = r21.getContext()
            r4.<init>(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            r8 = 1
            r4.setTextSize(r8, r5)
            er1.C7919x.m8091a(r4)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r7)
            java.lang.Class<ny.g> r8 = p629ny.C76978g.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            r15 = r8
            ny.g r15 = (p629ny.C76978g) r15
            android.content.Context r8 = r4.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131101015(0x7f060557, float:1.7814428E38)
            int r17 = r8.getColor(r11)
            android.content.Context r8 = r4.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131099665(0x7f060011, float:1.781169E38)
            int r18 = r8.getColor(r11)
            r19 = 1
            rs1.j6 r20 = new rs1.j6
            r8 = r20
            r11 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r16 = ""
            de3.b0 r8 = r15.Co0(r16, r17, r18, r19, r20)
            int r7 = r7.length()
            r9 = 17
            r5.setSpan(r8, r6, r7, r9)
            r4.setText(r5)
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            r7.mo107056S3(r4, r5)
            android.widget.LinearLayout r5 = r1.f37674d
            if (r5 == 0) goto L_0x0206
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r7.<init>(r8, r8)
            r5.addView(r4, r7)
            r5 = 1
            goto L_0x0124
        L_0x0206:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x020a:
            java.util.ArrayList<rs1.i6$a> r0 = r1.f37677g
            r0.clear()
            java.util.ArrayList<rs1.i6$a> r0 = r1.f37677g
            te3.tn0 r4 = r1.f37678h
            java.util.LinkedList<te3.b21> r4 = r4.f142294d
            gy3.C87412m.m108593f(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0221:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023c
            java.lang.Object r5 = r4.next()
            r7 = r5
            te3.b21 r7 = (te3.C48797b21) r7
            int r7 = r7.f130895d
            r8 = 1
            if (r7 != r8) goto L_0x0235
            r7 = 1
            goto L_0x0236
        L_0x0235:
            r7 = 0
        L_0x0236:
            if (r7 == 0) goto L_0x0221
            r2.add(r5)
            goto L_0x0221
        L_0x023c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x024b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0265
            java.lang.Object r5 = r2.next()
            te3.b21 r5 = (te3.C48797b21) r5
            rs1.i6$a r7 = new rs1.i6$a
            java.lang.String r8 = "it"
            gy3.C87412m.m108593f(r5, r8)
            r7.<init>(r5)
            r4.add(r7)
            goto L_0x024b
        L_0x0265:
            r0.addAll(r4)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r1.f37675e
            if (r0 == 0) goto L_0x027f
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.viewmodel.component.FinderLiveIncomeListUIC$initData$5 r3 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderLiveIncomeListUIC$initData$5
            r3.<init>(r1)
            java.util.ArrayList<rs1.i6$a> r4 = r1.f37677g
            r2.<init>(r3, r4, r6)
            r0.setAdapter(r2)
            r21.mo12730d3()
        L_0x027e:
            return
        L_0x027f:
            java.lang.String r0 = "listView"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0285:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13273i6.onCreate(android.os.Bundle):void");
    }

    /* renamed from: u2 */
    public void mo11007u2() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13273i6(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
