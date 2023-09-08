package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.brandservice.p028ui.C40658c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import qj3.C47856a;
import te3.C50139kk;
import te3.C50274lk;
import te3.C51256sk;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI */
public class BizSearchDetailPageUI extends MMActivity implements C106742j1.C106756o {

    /* renamed from: d */
    public C106742j1 f109039d;

    /* renamed from: e */
    public BizSearchResultItemContainer f109040e;

    /* renamed from: f */
    public long f109041f;

    /* renamed from: g */
    public String f109042g;

    /* renamed from: h */
    public int f109043h;

    /* renamed from: i */
    public int f109044i;

    /* renamed from: j */
    public int f109045j;

    /* renamed from: n */
    public Runnable f109046n = new C40598a();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$a */
    public class C40598a implements Runnable {
        public C40598a() {
        }

        public void run() {
            BizSearchDetailPageUI bizSearchDetailPageUI = BizSearchDetailPageUI.this;
            bizSearchDetailPageUI.f109040e.mo63469a(bizSearchDetailPageUI.f109042g, bizSearchDetailPageUI.f109043h);
            BizSearchDetailPageUI.this.f109043h = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$b */
    public class C40599b implements MenuItem.OnMenuItemClickListener {
        public C40599b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BizSearchDetailPageUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$c */
    public class C40600c implements C40658c.C40660b {
        public C40600c() {
        }

        /* renamed from: a */
        public void mo63467a(C40658c cVar, C47856a aVar, int i, String str, int i2, int i3) {
            String str2;
            if (BizSearchDetailPageUI.this.f109044i == 1 && aVar.f128455a == 5) {
                C51256sk skVar = (C51256sk) aVar.f128456b;
                C50139kk kkVar = skVar.f141568e;
                if (kkVar == null || kkVar.f136834f == null) {
                    Log.m105920e("MicroMsg.BrandService.BizSearchDetailPageUI", "bcdItem.ContactItem == null || bcdItem.ContactItem.ContactItem == null");
                    return;
                }
                C50274lk i4 = cVar.mo63566i(i3);
                StringBuilder sb = new StringBuilder();
                sb.append(Util.nullAsNil(BizSearchDetailPageUI.this.f109042g));
                sb.append(",");
                sb.append(i);
                sb.append(",");
                sb.append(Util.nullAsNil(str));
                sb.append(",");
                sb.append(i2);
                sb.append(",");
                sb.append(cVar.f109236q);
                sb.append(",");
                if (i4 == null) {
                    str2 = "";
                } else {
                    str2 = i4.f137474j + ",1";
                }
                sb.append(str2);
                String sb4 = sb.toString();
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(10866, sb4);
                Log.m105918d("MicroMsg.BrandService.BizSearchDetailPageUI", "report : " + sb4);
                if ((skVar.f141568e.f136834f.f134967n & 8) > 0) {
                    nVar.kvStat(10298, str + "," + 35);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$d */
    public class C40601d implements View.OnTouchListener {
        public C40601d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C106742j1 j1Var = BizSearchDetailPageUI.this.f109039d;
            if (j1Var != null) {
                j1Var.mo153849a();
            }
            BizSearchDetailPageUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/BizSearchDetailPageUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        finish();
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6590j4;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r13 = this;
            com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$b r0 = new com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$b
            r0.<init>()
            r13.setBackBtn(r0)
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "businessType"
            r2 = 0
            long r4 = r0.getLongExtra(r1, r2)
            r13.f109041f = r4
            java.lang.String r1 = "showEditText"
            r4 = 0
            boolean r1 = r0.getBooleanExtra(r1, r4)
            java.lang.String r5 = "fromScene"
            int r5 = r0.getIntExtra(r5, r4)
            r13.f109044i = r5
            java.lang.String r5 = "addContactScene"
            r6 = 35
            int r5 = r0.getIntExtra(r5, r6)
            r13.f109045j = r5
            java.lang.String r5 = "title"
            java.lang.String r5 = r0.getStringExtra(r5)
            java.lang.String r6 = "keyword"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "showCatalog"
            boolean r7 = r0.getBooleanExtra(r7, r4)
            java.lang.String r8 = "offset"
            int r8 = r0.getIntExtra(r8, r4)
            r13.f109043h = r8
            long r8 = r13.f109041f
            r10 = 1
            java.lang.String r11 = "MicroMsg.BrandService.BizSearchDetailPageUI"
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x0154
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x005d
            goto L_0x0154
        L_0x005d:
            java.lang.String r2 = "result"
            byte[] r0 = r0.getByteArrayExtra(r2)
            r2 = 0
            if (r0 == 0) goto L_0x0082
            te3.lk r3 = new te3.lk     // Catch:{ IOException -> 0x0076 }
            r3.<init>()     // Catch:{ IOException -> 0x0076 }
            pe3.a r0 = r3.parseFrom(r0)     // Catch:{ IOException -> 0x0076 }
            te3.lk r0 = (te3.C50274lk) r0     // Catch:{ IOException -> 0x0076 }
            if (r0 == 0) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0076:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r2, r1)
            r13.finish()
            return
        L_0x0082:
            r0 = r2
        L_0x0083:
            r3 = 0
        L_0x0084:
            r8 = 2131312881(0x7f0940f1, float:1.8244143E38)
            android.view.View r8 = r13.findViewById(r8)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r8 = (com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchResultItemContainer) r8
            r13.f109040e = r8
            com.tencent.mm.plugin.brandservice.ui.c r9 = new com.tencent.mm.plugin.brandservice.ui.c
            r9.<init>(r13)
            r8.setAdapter(r9)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r8 = r13.f109040e
            long[] r9 = new long[r10]
            long r11 = r13.f109041f
            r9[r4] = r11
            r8.setBusinessTypes(r9)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r8 = r13.f109040e
            r8.setMode(r10)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r8 = r13.f109040e
            com.tencent.mm.plugin.brandservice.ui.c r9 = r8.f109052e
            r9.f109235p = r7
            r9.f109234o = r4
            int r7 = r13.f109044i
            r8.setScene(r7)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r7 = r13.f109040e
            int r8 = r13.f109045j
            r7.setAddContactScene(r8)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r7 = r13.f109040e
            com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$c r8 = new com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$c
            r8.<init>()
            r7.setReporter(r8)
            if (r1 == 0) goto L_0x00ef
            com.tencent.mm.ui.tools.j1 r1 = new com.tencent.mm.ui.tools.j1
            r1.<init>()
            r13.f109039d = r1
            r13.addSearchMenu(r10, r1)
            com.tencent.mm.ui.tools.j1 r1 = r13.f109039d
            r1.mo153851c(r4)
            com.tencent.mm.ui.tools.j1 r1 = r13.f109039d
            r1.mo153849a()
            com.tencent.mm.ui.tools.j1 r1 = r13.f109039d
            r1.mo23884r(r6)
            com.tencent.mm.ui.tools.j1 r1 = r13.f109039d
            r1.f319122j = r13
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r1 = r13.f109040e
            com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$d r5 = new com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI$d
            r5.<init>()
            r1.setOnTouchListener(r5)
            goto L_0x00f8
        L_0x00ef:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 != 0) goto L_0x00f8
            r13.setMMTitle((java.lang.String) r5)
        L_0x00f8:
            if (r3 == 0) goto L_0x0150
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer r1 = r13.f109040e
            int r3 = r13.f109043h
            com.tencent.mm.plugin.brandservice.ui.c r5 = r1.f109052e
            r5.mo63562g()
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$b r5 = r1.f109055h
            r5.mo63483a(r4)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r5 = r1.f109054g
            r5.f109073f = r4
            r5.f109072e = r4
            r5.f109071d = r4
            r5.f109069b = r2
            r5.f109068a = r10
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "MicroMsg.BrandService.BizSearchResultItemContainer"
            java.lang.String r1 = "setFirst page content failed, content is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0153
        L_0x011f:
            r5.f109069b = r6
            long[] r2 = new long[r10]
            long r7 = r0.f137468d
            r2[r4] = r7
            r1.setBusinessTypes(r2)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r2 = r1.f109054g
            int r4 = r0.f137469e
            r2.f109068a = r4
            r1.f109060p = r3
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r2.add(r0)
            com.tencent.mm.plugin.brandservice.ui.c r4 = r1.f109052e
            r4.mo63570n(r6, r2)
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer$d r2 = r1.f109054g
            int r0 = r0.f137475n
            int r0 = r0 + r3
            r2.f109071d = r0
            com.tencent.mm.plugin.brandservice.ui.c r0 = r1.f109052e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r10
            r2.f109073f = r0
            goto L_0x0153
        L_0x0150:
            r13.mo1324l3(r6)
        L_0x0153:
            return
        L_0x0154:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            long r1 = r13.f109041f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "businessType(%d) or queryStr is nil."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r1, r0)
            r13.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchDetailPageUI.init():void");
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        if (!Util.isNullOrNil(str)) {
            String trim = str.trim();
            if (!trim.equals(this.f109042g)) {
                MMHandlerThread.removeRunnable(this.f109046n);
                this.f109042g = trim;
                MMHandlerThread.postToMainThreadDelayed(this.f109046n, 400);
            }
        }
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C106742j1 j1Var = this.f109039d;
        if (j1Var == null) {
            return true;
        }
        j1Var.mo23882j(this, menu);
        return true;
    }

    public void onPause() {
        super.onPause();
        C106742j1 j1Var = this.f109039d;
        if (j1Var != null) {
            j1Var.mo153849a();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C106742j1 j1Var = this.f109039d;
        if (j1Var == null) {
            return true;
        }
        j1Var.mo153858m(this, menu);
        return true;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
