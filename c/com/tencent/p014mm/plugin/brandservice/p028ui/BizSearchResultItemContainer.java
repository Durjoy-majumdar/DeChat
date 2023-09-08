package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.C40658c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import fx0.C45841u;
import fx0.C45842v;
import gx0.C45978o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import te3.C50274lk;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer */
public class BizSearchResultItemContainer extends LinearLayout implements C11385n {

    /* renamed from: d */
    public ListView f109051d;

    /* renamed from: e */
    public C40658c f109052e;

    /* renamed from: f */
    public TextView f109053f;

    /* renamed from: g */
    public C40605d f109054g;

    /* renamed from: h */
    public C40603b f109055h;

    /* renamed from: i */
    public C45842v f109056i;

    /* renamed from: j */
    public C40604c f109057j;

    /* renamed from: n */
    public int f109058n = 0;

    /* renamed from: o */
    public long[] f109059o;

    /* renamed from: p */
    public int f109060p;

    /* renamed from: q */
    public boolean f109061q;

    /* renamed from: r */
    public int f109062r;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$a */
    public class C40602a implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public boolean f109063d = false;

        public C40602a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i + i2 == i3) {
                this.f109063d = true;
            } else {
                this.f109063d = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && this.f109063d) {
                BizSearchResultItemContainer bizSearchResultItemContainer = BizSearchResultItemContainer.this;
                C40605d dVar = bizSearchResultItemContainer.f109054g;
                if (dVar.f109073f && dVar.f109068a != 0 && !dVar.f109072e) {
                    String str = dVar.f109069b;
                    int i2 = dVar.f109071d;
                    long[] jArr = bizSearchResultItemContainer.f109059o;
                    bizSearchResultItemContainer.mo63470b(str, i2, jArr[jArr.length - 1]);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$b */
    public static class C40603b {

        /* renamed from: a */
        public View f109065a;

        /* renamed from: b */
        public View f109066b;

        /* renamed from: c */
        public View f109067c;

        public C40603b(C40602a aVar) {
        }

        /* renamed from: a */
        public void mo63483a(int i) {
            if (i == 1) {
                mo63484b(true, false, false);
            } else if (i == 2) {
                mo63484b(false, false, true);
            } else if (i != 3) {
                mo63484b(false, false, false);
            } else {
                mo63484b(false, false, false);
            }
        }

        /* renamed from: b */
        public final void mo63484b(boolean z, boolean z2, boolean z3) {
            View view = this.f109065a;
            int i = 8;
            int i2 = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f109066b;
            int i3 = z2 ? 0 : 8;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Integer.valueOf(i3));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f109067c;
            if (z3) {
                i = 0;
            }
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "updateViewStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$c */
    public interface C40604c {
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d */
    public static class C40605d {

        /* renamed from: a */
        public int f109068a = 1;

        /* renamed from: b */
        public String f109069b;

        /* renamed from: c */
        public long f109070c;

        /* renamed from: d */
        public int f109071d;

        /* renamed from: e */
        public boolean f109072e;

        /* renamed from: f */
        public boolean f109073f;

        public C40605d(C40602a aVar) {
        }
    }

    public BizSearchResultItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.bvi, this);
        this.f109054g = new C40605d((C40602a) null);
        this.f109055h = new C40603b((C40602a) null);
        this.f109053f = (TextView) inflate.findViewById(C0966R.C0970id.cih);
        this.f109051d = (ListView) inflate.findViewById(C0966R.C0970id.irw);
    }

    /* renamed from: a */
    public void mo63469a(String str, int i) {
        if (this.f109052e.isEmpty()) {
            this.f109053f.setVisibility(8);
        }
        if (str != null) {
            String trim = str.trim();
            if ("".equals(trim)) {
                return;
            }
            if ((!trim.equals(this.f109054g.f109069b) || this.f109061q) && !this.f109054g.f109072e) {
                this.f109052e.mo63562g();
                this.f109055h.mo63483a(0);
                C40605d dVar = this.f109054g;
                dVar.f109073f = false;
                dVar.f109072e = false;
                dVar.f109071d = 0;
                dVar.f109069b = null;
                dVar.f109068a = 1;
                dVar.f109072e = true;
                dVar.f109069b = trim;
                this.f109060p = i;
                if (this.f109062r != 1) {
                    C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_IDKEY_FR_EXCEL_ID, this);
                    C40605d dVar2 = this.f109054g;
                    this.f109056i = new C45842v(dVar2.f109069b, dVar2.f109070c, this.f109058n);
                    C86709a0.m107524d().mo123460f(this.f109056i);
                } else {
                    long[] jArr = this.f109059o;
                    if (jArr.length == 0) {
                        Log.m105924i("MicroMsg.BrandService.BizSearchResultItemContainer", "business type size is 0.");
                        return;
                    } else {
                        mo63470b(trim, i, jArr[0]);
                        this.f109055h.mo63483a(0);
                    }
                }
                C40604c cVar = this.f109057j;
                if (cVar != null) {
                    SearchOrRecommendBizUI searchOrRecommendBizUI = (SearchOrRecommendBizUI) cVar;
                    searchOrRecommendBizUI.f109167d = C76879j.m92723Q(searchOrRecommendBizUI.getContext(), searchOrRecommendBizUI.getString(C0966R.string.a3h), searchOrRecommendBizUI.getString(C0966R.string.bud), true, true, new C45978o(searchOrRecommendBizUI));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63470b(String str, int i, long j) {
        this.f109054g.f109072e = true;
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_IDKEY_FR_PDF_ID, this);
        C40658c cVar = this.f109052e;
        long[] jArr = this.f109059o;
        C40658c.C40659a j2 = cVar.mo63567j(jArr[jArr.length - 1]);
        C50274lk lkVar = null;
        List<C50274lk> list = j2 != null ? j2.f109246h : null;
        if (list == null || list.size() == 0) {
            Log.m105925i("MicroMsg.BrandService.BizSearchResultItemContainer", "Get business content by type failed.(keyword : %s, offset : %s, businessType : %s)", str, Integer.valueOf(i), Long.valueOf(j));
        } else {
            lkVar = list.get(list.size() - 1);
        }
        String str2 = lkVar != null ? lkVar.f137474j : "";
        Log.m105919d("MicroMsg.BrandService.BizSearchResultItemContainer", "keyword(%s), offset(%d), businessType(%d), searchId(%s).", str, Integer.valueOf(i), Long.valueOf(j), str2);
        C86709a0.m107524d().mo123460f(new C45841u(str, j, i, this.f109058n, str2));
        this.f109055h.mo63483a(1);
    }

    public C40658c getAdapter() {
        return this.f109052e;
    }

    public C40604c getIOnSearchStateChangedListener() {
        return this.f109057j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: te3.lk} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r9, int r10, java.lang.String r11, ob0.C117747y r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r11
            java.lang.String r5 = "MicroMsg.BrandService.BizSearchResultItemContainer"
            java.lang.String r6 = "errType (%d) , errCode (%d) , errMsg (errMsg)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r1)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$c r1 = r8.f109057j
            r6 = 0
            if (r1 == 0) goto L_0x002b
            com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.SearchOrRecommendBizUI) r1
            android.app.ProgressDialog r7 = r1.f109167d
            if (r7 == 0) goto L_0x002b
            r7.dismiss()
            r1.f109167d = r6
        L_0x002b:
            if (r9 != 0) goto L_0x0137
            if (r10 == 0) goto L_0x0031
            goto L_0x0137
        L_0x0031:
            r8.f109061q = r3
            if (r12 != 0) goto L_0x003c
            java.lang.String r9 = "scene is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            return
        L_0x003c:
            int r9 = r12.getType()
            r10 = 1070(0x42e, float:1.5E-42)
            if (r9 != r10) goto L_0x009c
            java.lang.String r9 = "BizSearchHomePage."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            ob0.b0 r9 = f40.C86709a0.m107524d()
            r9.mo123470p(r10, r8)
            fx0.v r12 = (fx0.C45842v) r12
            te3.cy3 r9 = r12.f123786h
            if (r9 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            java.util.LinkedList<te3.lk> r6 = r9.f132030e
        L_0x0059:
            com.tencent.mm.plugin.brandservice.ui.c r9 = r8.f109052e
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r10 = r8.f109054g
            java.lang.String r10 = r10.f109069b
            r9.mo63570n(r10, r6)
            com.tencent.mm.plugin.brandservice.ui.c r9 = r8.f109052e
            long[] r10 = r8.f109059o
            int r11 = r10.length
            int r11 = r11 - r4
            r11 = r10[r11]
            com.tencent.mm.plugin.brandservice.ui.c$a r9 = r9.mo63567j(r11)
            if (r9 == 0) goto L_0x0078
            boolean r10 = r9.f109245g
            if (r10 == 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            int r9 = r9.f109241c
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            if (r9 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 2
        L_0x007d:
            if (r6 == 0) goto L_0x00ea
            int r10 = r6.size()
            if (r10 <= 0) goto L_0x00ea
            int r10 = r6.size()
            int r10 = r10 - r4
            java.lang.Object r10 = r6.get(r10)
            te3.lk r10 = (te3.C50274lk) r10
            if (r10 == 0) goto L_0x00ea
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r11 = r8.f109054g
            int r10 = r10.f137475n
            int r12 = r8.f109060p
            int r10 = r10 + r12
            r11.f109071d = r10
            goto L_0x00ea
        L_0x009c:
            int r9 = r12.getType()
            r10 = 1071(0x42f, float:1.501E-42)
            if (r9 != r10) goto L_0x0125
            ob0.b0 r9 = f40.C86709a0.m107524d()
            r9.mo123470p(r10, r8)
            java.lang.String r9 = "BizSearchDetailPage."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
            fx0.u r12 = (fx0.C45841u) r12
            te3.ox3 r9 = r12.f123776f
            if (r9 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            te3.lk r6 = r9.f139435d
        L_0x00b9:
            if (r6 == 0) goto L_0x00bf
            java.util.LinkedList<te3.sk> r9 = r6.f137472h
            if (r9 != 0) goto L_0x00c4
        L_0x00bf:
            java.lang.String r9 = "BusinessContent or itemList is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
        L_0x00c4:
            if (r6 != 0) goto L_0x00c8
            r9 = 0
            goto L_0x00ca
        L_0x00c8:
            int r9 = r6.f137469e
        L_0x00ca:
            if (r9 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r0 = 2
        L_0x00ce:
            com.tencent.mm.plugin.brandservice.ui.c r10 = r8.f109052e
            r10.mo63561f(r6, r4)
            if (r6 == 0) goto L_0x00ea
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = r6.f137474j
            r10[r3] = r11
            java.lang.String r11 = "searchId : %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r11, r10)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r10 = r8.f109054g
            int r11 = r6.f137475n
            int r12 = r8.f109060p
            int r11 = r11 + r12
            r10.f109071d = r11
        L_0x00ea:
            com.tencent.mm.plugin.brandservice.ui.c r10 = r8.f109052e
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0104
            com.tencent.mm.sdk.platformtools.MMHandler r10 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>((android.os.Looper) r11)
            gx0.a r11 = new gx0.a
            r11.<init>(r8)
            r10.post(r11)
            goto L_0x0108
        L_0x0104:
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r10 = r8.f109054g
            r10.f109073f = r4
        L_0x0108:
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r10 = r8.f109054g
            r10.f109068a = r9
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$b r9 = r8.f109055h
            r9.mo63483a(r0)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r9 = r8.f109054g
            r9.f109072e = r3
            java.lang.Object[] r10 = new java.lang.Object[r4]
            int r9 = r9.f109071d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r3] = r9
            java.lang.String r9 = "The next load data offset is (%d)."
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r9, r10)
            return
        L_0x0125:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            int r10 = r12.getType()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r3] = r10
            java.lang.String r10 = "Error type(%d)."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r9)
            return
        L_0x0137:
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r12 = r8.f109054g
            r12.f109072e = r3
            r8.f109061q = r4
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.getErrMsgContent(r11)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 == 0) goto L_0x0160
            android.content.Context r11 = r8.getContext()
            r12 = 2131830378(0x7f11266a, float:1.9293752E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r0[r4] = r9
            java.lang.String r11 = r11.getString(r12, r0)
        L_0x0160:
            android.content.Context r9 = r8.getContext()
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r11, (int) r3)
            r9.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchResultItemContainer.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void setAdapter(C40658c cVar) {
        C40658c cVar2 = cVar;
        this.f109052e = cVar2;
        if (cVar2 != null) {
            cVar.getClass();
            ListView listView = this.f109051d;
            C40603b bVar = this.f109055h;
            Context context = getContext();
            bVar.getClass();
            View inflate = View.inflate(context, C0966R.C0971layout.b7z, (ViewGroup) null);
            bVar.f109065a = inflate.findViewById(C0966R.C0970id.g3j);
            bVar.f109066b = inflate.findViewById(C0966R.C0970id.g39);
            bVar.f109067c = inflate.findViewById(C0966R.C0970id.g3o);
            View view = bVar.f109065a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = bVar.f109066b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = bVar.f109067c;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            listView.addFooterView(inflate, (Object) null, false);
            this.f109051d.setAdapter(this.f109052e);
            this.f109051d.setOnScrollListener(new C40602a());
            this.f109051d.setOnItemClickListener(this.f109052e);
            if (this.f109054g.f109070c == 0) {
                setBusinessTypes(1);
                return;
            }
            return;
        }
        this.f109051d.setAdapter(cVar2);
    }

    public void setAddContactScene(int i) {
        this.f109052e.f109231i = i;
    }

    public void setBusinessTypes(long... jArr) {
        if (jArr != null && jArr.length > 0) {
            this.f109059o = jArr;
            this.f109054g.f109070c = 0;
            for (int i = 0; i < jArr.length; i++) {
                this.f109054g.f109070c |= jArr[i];
            }
            C40658c cVar = this.f109052e;
            cVar.getClass();
            if (jArr.length > 0) {
                cVar.f109237r = jArr;
            }
        }
    }

    public void setIOnSearchStateChangedListener(C40604c cVar) {
        this.f109057j = cVar;
    }

    public void setMode(int i) {
        this.f109062r = i;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(onTouchListener);
        this.f109051d.setOnTouchListener(onTouchListener);
    }

    public void setReporter(C40658c.C40660b bVar) {
        C40658c cVar = this.f109052e;
        if (cVar != null) {
            cVar.f109238s = bVar;
        }
    }

    public void setScene(int i) {
        this.f109058n = i;
        this.f109052e.getClass();
    }
}
