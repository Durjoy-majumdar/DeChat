package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.model.C29855f0;
import com.tencent.p014mm.plugin.downloader_app.model.C40982b0;
import com.tencent.p014mm.plugin.downloader_app.model.C40984c0;
import com.tencent.p014mm.plugin.downloader_app.model.C40986d0;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C41009x;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchUI;
import com.tencent.p014mm.plugin.webview.luggage.util.C6012a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45548j;
import g51.C45880a;
import j20.C117292a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nx1.C47305b;
import p763ym.C79138l;
import u41.C52427g;
import uv0.C22663i;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI */
public class DownloadMainUI extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f110428s = 0;

    /* renamed from: d */
    public TaskListView f110429d;

    /* renamed from: e */
    public DeleteTaskFooterView f110430e;

    /* renamed from: f */
    public TaskManagerHeaderView f110431f;

    /* renamed from: g */
    public View f110432g;

    /* renamed from: h */
    public boolean f110433h;

    /* renamed from: i */
    public C40984c0 f110434i;

    /* renamed from: j */
    public String f110435j;

    /* renamed from: n */
    public boolean f110436n = false;

    /* renamed from: o */
    public int f110437o;

    /* renamed from: p */
    public View f110438p;

    /* renamed from: q */
    public C52427g f110439q;

    /* renamed from: r */
    public C40982b0 f110440r;

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$a */
    public class C41020a implements MenuItem.OnMenuItemClickListener {
        public C41020a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C40982b0 b0Var;
            DownloadMainUI downloadMainUI = DownloadMainUI.this;
            int i = DownloadMainUI.f110428s;
            if ((downloadMainUI.f110437o == 2) && (b0Var = downloadMainUI.f110440r) != null && b0Var.mo64004y0(1)) {
                return true;
            }
            DownloadMainUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$b */
    public class C41021b implements MenuItem.OnMenuItemClickListener {
        public C41021b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            DownloadMainUI downloadMainUI = DownloadMainUI.this;
            Intent intent = new Intent(DownloadMainUI.this, DownloadSearchUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(downloadMainUI, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            downloadMainUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(downloadMainUI, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C45880a.m51163b(10, 1001, 1, 2, "", "", "");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$c */
    public class C41022c implements C41027f {
        public C41022c() {
        }

        /* renamed from: a */
        public void mo64060a(boolean z) {
            if (z) {
                DownloadMainUI.this.f110430e.setVisibility(0);
                DownloadMainUI downloadMainUI = DownloadMainUI.this;
                downloadMainUI.f110430e.startAnimation(AnimationUtils.loadAnimation(downloadMainUI, C0966R.C0968anim.f2358am));
                DownloadMainUI.this.f110431f.setVisibility(0);
                DownloadMainUI downloadMainUI2 = DownloadMainUI.this;
                downloadMainUI2.f110431f.startAnimation(AnimationUtils.loadAnimation(downloadMainUI2, C0966R.C0968anim.f2533fl));
                return;
            }
            DownloadMainUI.this.f110430e.setVisibility(8);
            DownloadMainUI downloadMainUI3 = DownloadMainUI.this;
            downloadMainUI3.f110430e.startAnimation(AnimationUtils.loadAnimation(downloadMainUI3, C0966R.C0968anim.f2359an));
            DownloadMainUI.this.f110431f.setVisibility(8);
            DownloadMainUI downloadMainUI4 = DownloadMainUI.this;
            downloadMainUI4.f110431f.startAnimation(AnimationUtils.loadAnimation(downloadMainUI4, C0966R.C0968anim.f2534fm));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$d */
    public class C41023d implements TaskItemView.C41028a {
        public C41023d() {
        }

        /* renamed from: a */
        public boolean mo64061a(View view, int i) {
            boolean a = C6012a.m5887a();
            Log.m105925i("MicroMsg.DownloadMainUI", "onOnItemButtonClick isTeenMode: %s", Boolean.valueOf(a));
            if (!a) {
                return false;
            }
            C6012a.m5888b(DownloadMainUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e */
    public class C41024e implements Runnable {

        /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e$a */
        public class C41025a implements Runnable {
            public C41025a() {
            }

            public void run() {
                DownloadMainUI downloadMainUI = DownloadMainUI.this;
                downloadMainUI.mo64056I7(downloadMainUI.f110434i, false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e$b */
        public class C41026b implements Runnable {
            public C41026b() {
            }

            public void run() {
                DownloadMainUI downloadMainUI = DownloadMainUI.this;
                if (downloadMainUI.f110438p == null) {
                    View findViewById = downloadMainUI.findViewById(C0966R.C0970id.g3t);
                    downloadMainUI.f110438p = findViewById;
                    downloadMainUI.f110438p = ((ViewStub) findViewById).inflate();
                }
                View view = downloadMainUI.f110438p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C41024e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r0 = com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.this
                com.tencent.mm.plugin.downloader_app.model.c0 r1 = com.tencent.p014mm.plugin.downloader_app.model.C40986d0.m44429a()
                r0.f110434i = r1
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e$a r0 = new com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e$a
                r0.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r0 = com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.this
                java.lang.String r1 = r0.f110435j
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                r3 = 1
                if (r2 == 0) goto L_0x001c
                goto L_0x0080
            L_0x001c:
                boolean r2 = com.tencent.p014mm.plugin.downloader_app.model.C29855f0.m38891b(r1)
                if (r2 == 0) goto L_0x0082
                com.tencent.mm.plugin.downloader_app.model.c0 r2 = r0.f110434i
                if (r2 != 0) goto L_0x0027
                goto L_0x0082
            L_0x0027:
                java.util.Map<java.lang.String, com.tencent.mm.plugin.downloader_app.model.e0> r2 = r2.f110321b
                java.util.HashMap r2 = (java.util.HashMap) r2
                java.lang.Object r1 = r2.get(r1)
                com.tencent.mm.plugin.downloader_app.model.e0 r1 = (com.tencent.p014mm.plugin.downloader_app.model.C40990e0) r1
                if (r1 != 0) goto L_0x0034
                goto L_0x0082
            L_0x0034:
                boolean r2 = r0.f110436n
                r4 = 200(0xc8, double:9.9E-322)
                if (r2 != 0) goto L_0x0078
                v41.c r2 = r1.f110342m
                java.lang.String r2 = r2.f147350e
                android.content.pm.PackageInfo r2 = js0.C9512b.m9207a(r0, r2)
                if (r2 == 0) goto L_0x0055
                int r2 = r2.versionCode
                v41.c r6 = r1.f110342m
                int r6 = r6.f147354i
                if (r2 < r6) goto L_0x0055
                j51.e r1 = new j51.e
                r1.<init>(r0)
                com.tencent.p014mm.ipcinvoker.C40319a0.m43496d(r1, r4)
                goto L_0x0080
            L_0x0055:
                java.lang.String r2 = r0.f110435j
                z41.a r2 = com.tencent.p014mm.plugin.downloader.model.C40933j.m44315d(r2)
                if (r2 == 0) goto L_0x006c
                int r6 = r2.field_status
                r7 = 3
                if (r6 != r7) goto L_0x006c
                boolean r1 = com.tencent.p014mm.plugin.downloader_app.model.C40983c.m44422d(r0, r1)
                if (r1 == 0) goto L_0x0080
                r0.finish()
                goto L_0x0080
            L_0x006c:
                zt3.t r6 = zt3.C119157j.f356862d
                j51.f r7 = new j51.f
                r7.<init>(r0, r2, r1)
                zt3.j r6 = (zt3.C119157j) r6
                r6.mo183878i(r7, r4)
            L_0x0078:
                j51.g r1 = new j51.g
                r1.<init>(r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r1, r4)
            L_0x0080:
                r0 = 1
                goto L_0x0083
            L_0x0082:
                r0 = 0
            L_0x0083:
                if (r0 == 0) goto L_0x0098
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r0 = com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.this
                java.util.LinkedList r1 = com.tencent.p014mm.plugin.downloader_app.model.C29855f0.m38892c()
                r2 = 0
                r0.getClass()
                j51.h r3 = new j51.h
                r3.<init>(r0, r2)
                com.tencent.p014mm.plugin.downloader_app.model.C40986d0.m44430b(r1, r3)
                goto L_0x00c1
            L_0x0098:
                java.util.LinkedList r0 = com.tencent.p014mm.plugin.downloader_app.model.C29855f0.m38892c()
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r1 = com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.this
                java.lang.String r1 = r1.f110435j
                boolean r1 = r0.contains(r1)
                if (r1 != 0) goto L_0x00ad
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r1 = com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.this
                java.lang.String r1 = r1.f110435j
                r0.add(r1)
            L_0x00ad:
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r1 = com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.this
                java.lang.String r2 = r1.f110435j
                j51.h r4 = new j51.h
                r4.<init>(r1, r2)
                com.tencent.p014mm.plugin.downloader_app.model.C40986d0.m44430b(r0, r4)
                com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e$b r0 = new com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$e$b
                r0.<init>()
                com.tencent.p014mm.ipcinvoker.C40319a0.m43495c(r3, r0)
            L_0x00c1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.C41024e.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$f */
    public interface C41027f {
    }

    /* renamed from: H7 */
    public final void mo64055H7() {
        C53736a d;
        this.f110435j = getIntent().getStringExtra("appId");
        boolean booleanExtra = getIntent().getBooleanExtra("view_task", false);
        this.f110436n = booleanExtra;
        Log.m105925i("MicroMsg.DownloadMainUI", "initData, appId : %s, viewTask : %b", this.f110435j, Boolean.valueOf(booleanExtra));
        ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(this.f110435j);
        if (this.f110437o == 1 && (d = C40933j.m44315d(this.f110435j)) != null) {
            C53493b bVar = new C53493b();
            bVar.mo74165a(d);
            bVar.f150424j = 0;
            C53491a.m60013c(19, bVar);
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C41024e());
    }

    /* renamed from: I7 */
    public final void mo64056I7(C40984c0 c0Var, boolean z) {
        this.f110439q = c0Var != null ? c0Var.f110323d : null;
        if (c0Var != null) {
            if (!(((HashMap) c0Var.f110321b).size() == 0)) {
                LinkedList<String> c = C29855f0.m38892c();
                c0Var.f110322c.clear();
                if (!Util.isNullOrNil((List) c)) {
                    Iterator<String> it = c.iterator();
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (it.hasNext()) {
                        C40990e0 e0Var = (C40990e0) ((HashMap) c0Var.f110321b).get(it.next());
                        if (e0Var != null) {
                            int i4 = e0Var.f110332c;
                            if (i4 == 2) {
                                i++;
                                e0Var.f110333d = i;
                            } else if (i4 == 4) {
                                i2++;
                                e0Var.f110333d = i2;
                            } else if (i4 == 6) {
                                i3++;
                                e0Var.f110333d = i3;
                            }
                            c0Var.f110322c.add(e0Var);
                        }
                    }
                    C40990e0 e0Var2 = new C40990e0(8);
                    e0Var2.f110343n = c0Var.f110323d;
                    c0Var.f110322c.add(e0Var2);
                }
                LinkedList<C40990e0> linkedList = c0Var.f110322c;
                if (Util.isNullOrNil((List) linkedList)) {
                    mo64057J7(true);
                    return;
                }
                mo64057J7(false);
                this.f110429d.setData(linkedList);
                return;
            }
        }
        if (z) {
            mo64057J7(true);
        }
    }

    /* renamed from: J7 */
    public final void mo64057J7(boolean z) {
        if (z) {
            View view = this.f110432g;
            if (view instanceof ViewStub) {
                View inflate = ((ViewStub) view).inflate();
                this.f110432g = inflate;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(inflate, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view2 = this.f110432g;
            if (!(view2 instanceof ViewStub)) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (z) {
            View view4 = this.f110432g;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showNoTaskLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((NoTaskLayout) this.f110432g).setData(this.f110439q);
        }
    }

    public void finish() {
        super.finish();
        if (this.f110437o == 3) {
            overridePendingTransition(C0966R.C0968anim.f2350ae, C0966R.C0968anim.f2360ao);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7150zu;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0089, code lost:
        r0 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init() {
        /*
            r8 = this;
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131100431(0x7f06030f, float:1.7813243E38)
            int r0 = r0.getColor(r1)
            r8.setActionbarColor(r0)
            r8.showActionbarLine()
            r0 = 2131840114(0x7f114c72, float:1.9313499E38)
            r8.setMMTitle((int) r0)
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$a r0 = new com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$a
            r0.<init>()
            r8.setBackBtn(r0)
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$b r0 = new com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$b
            r0.<init>()
            r1 = 0
            r2 = 2131821674(0x7f11046a, float:1.9276098E38)
            r3 = 2131755027(0x7f100013, float:1.9140922E38)
            r8.addIconOptionMenu((int) r1, (int) r2, (int) r3, (android.view.MenuItem.OnMenuItemClickListener) r0)
            r0 = 2131307338(0x7f092b4a, float:1.82329E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.downloader_app.ui.TaskListView r0 = (com.tencent.p014mm.plugin.downloader_app.p039ui.TaskListView) r0
            r8.f110429d = r0
            r0 = 2131300805(0x7f0911c5, float:1.821965E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView r0 = (com.tencent.p014mm.plugin.downloader_app.p039ui.DeleteTaskFooterView) r0
            r8.f110430e = r0
            com.tencent.mm.plugin.downloader_app.ui.TaskListView r0 = r8.f110429d
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$c r1 = new com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$c
            r1.<init>()
            r0.f110480E1 = r1
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$d r1 = new com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI$d
            r1.<init>()
            r0.setOnItemButtonClickListener(r1)
            r0 = 2131305941(0x7f0925d5, float:1.8230067E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView r0 = (com.tencent.p014mm.plugin.downloader_app.p039ui.TaskManagerHeaderView) r0
            r8.f110431f = r0
            r0 = 2131310322(0x7f0936f2, float:1.8238953E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.f110432g = r0
            r8.mo64055H7()
            r1 = 10
            r2 = 0
            r3 = 0
            r4 = 1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r5 = "source"
            int r6 = r8.f110437o     // Catch:{ JSONException -> 0x007e }
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x007e }
        L_0x007e:
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0089 }
            java.lang.String r5 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r5)     // Catch:{ UnsupportedEncodingException -> 0x0089 }
            goto L_0x008b
        L_0x0089:
            java.lang.String r0 = ""
        L_0x008b:
            r7 = r0
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            g51.C45880a.m51163b(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI.init():void");
    }

    public void onBackPressed() {
        C40982b0 b0Var;
        boolean z;
        TaskListView taskListView = this.f110429d;
        boolean z2 = true;
        if (taskListView != null) {
            if (taskListView.f110481F1) {
                taskListView.mo64076B1();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        if (this.f110437o != 2) {
            z2 = false;
        }
        if (!z2 || (b0Var = this.f110440r) == null || !b0Var.mo64004y0(2)) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("from_scene", 0);
        this.f110437o = intExtra;
        if (intExtra == 3) {
            overridePendingTransition(C0966R.C0968anim.f2520f_, C0966R.C0968anim.f2354ai);
        }
        Log.m105924i("MicroMsg.DownloadMainUI", "onCreate: " + System.currentTimeMillis());
        this.f110433h = true;
        init();
        C40982b0 b0Var = new C40982b0(new C22663i(this));
        this.f110440r = b0Var;
        b0Var.mo35648A(16, "GameDownloadFloatBall");
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        C41009x.C41012c.f110393a.mo64038y0(false);
    }

    public void onDestroy() {
        super.onDestroy();
        C40986d0.f110326a = null;
        C40982b0 b0Var = this.f110440r;
        if (b0Var != null) {
            b0Var.mo67996A0();
        }
    }

    public void onNewIntent(Intent intent) {
        setIntent(intent);
        this.f110429d.mo64076B1();
        mo64055H7();
    }

    public void onPause() {
        super.onPause();
        C40984c0 c0Var = this.f110434i;
        if (c0Var != null) {
            c0Var.getClass();
            ((C47305b) C86312j.m106911c(C47305b.class)).mo57105l6("pb_appinfo", c0Var.f110320a);
        }
        C40982b0 b0Var = this.f110440r;
        if (b0Var != null) {
            b0Var.mo64001C();
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f110433h) {
            C40984c0 a = C40986d0.m44429a();
            this.f110434i = a;
            mo64056I7(a, true);
        }
        this.f110433h = false;
        C40982b0 b0Var = this.f110440r;
        if (b0Var != null) {
            b0Var.mo64003o();
        }
    }
}
