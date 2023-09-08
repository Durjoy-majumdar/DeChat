package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19444f1;
import com.tencent.p014mm.pluginsdk.model.C19446g1;
import com.tencent.p014mm.pluginsdk.model.C19447h1;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C88989a;
import ow1.a$$a;
import p159gw.C45962f;
import p237sp.C13754y;
import p262wm.C22921c;
import p407zo.C23547h;
import qo3.C12925w;
import qo3.C77398g;
import qo3.C77426q;
import qo3.w$$d;

@C88989a(7)
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI */
public class AppChooserUI extends MMActivity {

    /* renamed from: x0 */
    public static final /* synthetic */ int f55121x0 = 0;

    /* renamed from: A */
    public C19509p f55122A = null;

    /* renamed from: B */
    public C19509p f55123B = new C19509p(this);

    /* renamed from: C */
    public ArrayList<C19509p> f55124C = new ArrayList<>();

    /* renamed from: D */
    public ArrayList<C19509p> f55125D = new ArrayList<>();

    /* renamed from: E */
    public boolean f55126E = false;

    /* renamed from: F */
    public String f55127F;

    /* renamed from: G */
    public String f55128G = null;

    /* renamed from: H */
    public int f55129H;

    /* renamed from: I */
    public int f55130I;

    /* renamed from: J */
    public boolean f55131J = false;

    /* renamed from: K */
    public boolean f55132K = false;

    /* renamed from: L */
    public boolean f55133L = false;

    /* renamed from: M */
    public long f55134M;

    /* renamed from: N */
    public C19511s f55135N = C19511s.UNINSTALL;

    /* renamed from: P */
    public C19510r f55136P;

    /* renamed from: Q */
    public AdapterView.OnItemClickListener f55137Q = new C19498b();

    /* renamed from: R */
    public DialogInterface.OnClickListener f55138R = new C19499c();

    /* renamed from: S */
    public View.OnClickListener f55139S = new C19500d();

    /* renamed from: T */
    public DialogInterface.OnClickListener f55140T = new C19501e();

    /* renamed from: U */
    public C60898l.C9502b<C60905o> f55141U = new C19502f();

    /* renamed from: V */
    public View.OnClickListener f55142V = new C19503g();

    /* renamed from: W */
    public w$$d f55143W = new C19504h();

    /* renamed from: X */
    public w$$d f55144X = new C19505i();

    /* renamed from: Y */
    public DialogInterface.OnDismissListener f55145Y = new C19513j();

    /* renamed from: Z */
    public C40952u f55146Z = new C19497a();

    /* renamed from: d */
    public PackageManager f55147d;

    /* renamed from: e */
    public C19507n f55148e;

    /* renamed from: f */
    public C12925w f55149f;

    /* renamed from: g */
    public WxRecyclerView f55150g;

    /* renamed from: h */
    public WxRecyclerAdapter<C19509p> f55151h;

    /* renamed from: i */
    public final C19509p f55152i;

    /* renamed from: j */
    public C12925w f55153j;

    /* renamed from: n */
    public WxRecyclerView f55154n;

    /* renamed from: o */
    public WxRecyclerAdapter<C19509p> f55155o;

    /* renamed from: p */
    public C19509p f55156p;

    /* renamed from: p0 */
    public List<Integer> f55157p0 = Arrays.asList(new Integer[]{1, 2, 8, 7});

    /* renamed from: q */
    public C19509p f55158q;

    /* renamed from: r */
    public boolean f55159r = true;

    /* renamed from: s */
    public Intent f55160s = null;

    /* renamed from: t */
    public int f55161t;

    /* renamed from: u */
    public String f55162u = null;

    /* renamed from: v */
    public Bundle f55163v = null;

    /* renamed from: w */
    public C19446g1 f55164w = null;

    /* renamed from: x */
    public ArrayList<String> f55165x = null;

    /* renamed from: y */
    public int f55166y = 0;

    /* renamed from: z */
    public int f55167z = 0;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$a */
    public class C19497a implements C40952u {
        public C19497a() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            Log.m105919d("MicroMsg.AppChooserUI", "onTaskRemove downloadId:%s", Long.valueOf(j));
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            Log.m105919d("MicroMsg.AppChooserUI", "onTaskPaused downloadId:%s", Long.valueOf(j));
            C85801v1 i = C86709a0.m107535s().mo121142i();
            AppChooserUI appChooserUI = AppChooserUI.this;
            i.mo119676J(AppChooserUI.m20897I7(274560, appChooserUI.f55128G, appChooserUI.f55161t), 0L);
            AppChooserUI.this.mo25301M7(C19511s.UNINSTALL);
            C19507n nVar = AppChooserUI.this.f55148e;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
            WxRecyclerAdapter<C19509p> wxRecyclerAdapter = AppChooserUI.this.f55151h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            Log.m105919d("MicroMsg.AppChooserUI", "onTaskFailed downloadId:%s", Long.valueOf(j));
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            AppChooserUI appChooserUI = AppChooserUI.this;
            i2.mo119676J(AppChooserUI.m20897I7(274560, appChooserUI.f55128G, appChooserUI.f55161t), 0L);
            AppChooserUI.this.mo25301M7(C19511s.UNINSTALL);
            C19507n nVar = AppChooserUI.this.f55148e;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
            WxRecyclerAdapter<C19509p> wxRecyclerAdapter = AppChooserUI.this.f55151h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            AppChooserUI.this.f55134M = j;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            AppChooserUI appChooserUI = AppChooserUI.this;
            i.mo119676J(AppChooserUI.m20897I7(274560, appChooserUI.f55128G, appChooserUI.f55161t), Long.valueOf(AppChooserUI.this.f55134M));
            Log.m105919d("MicroMsg.AppChooserUI", "onTaskStarted downloadId:%s savedFilePath:%s", j + "", str);
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            Log.m105919d("MicroMsg.AppChooserUI", "onTaskFinished downloadId: %d, savedPath: %s", Long.valueOf(j), str);
            if (!Util.isNullOrNil(str) && C86013q1.m106450k(str)) {
                C85801v1 i = C86709a0.m107535s().mo121142i();
                AppChooserUI appChooserUI = AppChooserUI.this;
                i.mo119676J(AppChooserUI.m20897I7(274560, appChooserUI.f55128G, appChooserUI.f55161t), Long.valueOf(AppChooserUI.this.f55134M));
                AppChooserUI.this.mo25301M7(C19511s.DOWNLOADED);
                AppChooserUI appChooserUI2 = AppChooserUI.this;
                C19507n nVar = appChooserUI2.f55148e;
                if (nVar != null && appChooserUI2.f55134M == j) {
                    nVar.notifyDataSetChanged();
                }
                AppChooserUI appChooserUI3 = AppChooserUI.this;
                WxRecyclerAdapter<C19509p> wxRecyclerAdapter = appChooserUI3.f55151h;
                if (wxRecyclerAdapter != null && appChooserUI3.f55134M == j) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$b */
    public class C19498b implements AdapterView.OnItemClickListener {
        public C19498b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C19509p pVar;
            ResolveInfo resolveInfo;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            AppChooserUI appChooserUI = AppChooserUI.this;
            C19507n nVar = appChooserUI.f55148e;
            if (nVar != null) {
                appChooserUI.f55122A = nVar.getItem(i);
                AppChooserUI.this.f55148e.notifyDataSetChanged();
                C19510r rVar = AppChooserUI.this.f55136P;
                if (rVar != null && rVar.f55194b.isShowing()) {
                    AppChooserUI appChooserUI2 = AppChooserUI.this;
                    C19509p pVar2 = appChooserUI2.f55122A;
                    if (pVar2 == null || !pVar2.f55189g || (pVar2.f55192j && (pVar2.f55190h || appChooserUI2.f55129H >= appChooserUI2.f55130I))) {
                        appChooserUI2.f55136P.mo25316a(true);
                    } else {
                        appChooserUI2.f55136P.mo25316a(false);
                    }
                }
                AppChooserUI appChooserUI3 = AppChooserUI.this;
                if (!((appChooserUI3.f55166y != 6 && appChooserUI3.f55161t != 2) || (pVar = appChooserUI3.f55122A) == null || (resolveInfo = pVar.f55186d) == null)) {
                    appChooserUI3.mo25300L7(-1, resolveInfo.activityInfo.packageName, false);
                    C115669n.INSTANCE.mo160131h(12809, 4, AppChooserUI.this.f55122A.f55186d.activityInfo.packageName);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$c */
    public class C19499c implements DialogInterface.OnClickListener {
        public C19499c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C19509p pVar = AppChooserUI.this.f55122A;
            if (pVar != null && pVar.f55186d != null) {
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                AppChooserUI appChooserUI = AppChooserUI.this;
                i2.mo119676J(AppChooserUI.m20897I7(274528, appChooserUI.f55128G, appChooserUI.f55161t), AppChooserUI.this.f55122A.f55186d.activityInfo.packageName);
                AppChooserUI appChooserUI2 = AppChooserUI.this;
                C19556e.m20961h(appChooserUI2.f55128G, appChooserUI2.f55161t);
                AppChooserUI appChooserUI3 = AppChooserUI.this;
                appChooserUI3.mo25300L7(-1, appChooserUI3.f55122A.f55186d.activityInfo.packageName, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$d */
    public class C19500d implements View.OnClickListener {
        public C19500d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
            r8 = r0.f55186d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$3"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r8.f55158q
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r8 = r8.f55152i
                if (r0 == r8) goto L_0x002c
                android.content.pm.ResolveInfo r8 = r0.f55186d
                if (r8 == 0) goto L_0x002c
                android.content.pm.ActivityInfo r8 = r8.activityInfo
                java.lang.String r8 = r8.packageName
                goto L_0x002e
            L_0x002c:
                java.lang.String r8 = ""
            L_0x002e:
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r1 = 274528(0x43060, float:3.84696E-40)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                java.lang.String r3 = r2.f55128G
                int r2 = r2.f55161t
                int r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.m20897I7(r1, r3, r2)
                r0.mo119676J(r1, r8)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                java.lang.String r0 = r8.f55128G
                int r8 = r8.f55161t
                com.tencent.p014mm.pluginsdk.p133ui.tools.C19556e.m20961h(r0, r8)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                r0 = 0
                r8.f55159r = r0
                qo3.w r8 = r8.f55153j
                r8.mo5085n()
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                qo3.w r8 = r8.f55149f
                r8.mo5085n()
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r8.f55158q
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r1 = r8.f55152i
                if (r0 != r1) goto L_0x0070
                r0 = 2131821449(0x7f110389, float:1.9275641E38)
                java.lang.String r8 = r8.getString(r0)
                goto L_0x0076
            L_0x0070:
                java.lang.CharSequence r8 = r0.f55187e
                java.lang.String r8 = r8.toString()
            L_0x0076:
                java.lang.Class<zo.h> r0 = p407zo.C23547h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                zo.h r0 = (p407zo.C23547h) r0
                r1 = 4
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                int r3 = r2.f55167z
                java.lang.String r2 = r2.f55128G
                r0.mo36794Mf(r1, r3, r8, r2)
                java.lang.String r8 = "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19500d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$e */
    public class C19501e implements DialogInterface.OnClickListener {
        public C19501e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ResolveInfo resolveInfo;
            AppChooserUI appChooserUI = AppChooserUI.this;
            C19509p pVar = appChooserUI.f55122A;
            if (pVar != null && (resolveInfo = pVar.f55186d) != null) {
                appChooserUI.mo25300L7(-1, resolveInfo.activityInfo.packageName, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$f */
    public class C19502f implements C60898l.C9502b<C60905o> {
        public C19502f() {
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            C19509p pVar = AppChooserUI.this.f55124C.get(i);
            ((C23547h) C86312j.m106911c(C23547h.class)).mo36794Mf(2, AppChooserUI.this.f55167z, pVar.f55187e.toString(), AppChooserUI.this.f55128G);
            if (!pVar.f55190h || pVar.f55186d == null) {
                AppChooserUI appChooserUI = AppChooserUI.this;
                if (pVar != appChooserUI.f55123B) {
                    return;
                }
                if (!pVar.f55192j || pVar.f55191i) {
                    C19444f1.m20778r(appChooserUI.getContext(), (String) null, (String) null, (String) null, Integer.toString(hashCode()), "OTHER_APP_OPEN", (String) null);
                    return;
                }
                return;
            }
            C77426q qVar = new C77426q(AppChooserUI.this);
            qVar.mo107595g(AppChooserUI.this.getString(C0966R.string.f360935g33));
            qVar.mo107589a(true);
            qVar.mo107601m(C0966R.string.f7564js);
            qVar.mo107600l(new AppChooserUI$f$$a(this, pVar));
            qVar.mo107597i(new a$$a());
            qVar.mo107603o();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$g */
    public class C19503g implements View.OnClickListener {
        public C19503g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.AppChooserUI", "mDownloadOnClickListener");
            AppChooserUI appChooserUI = AppChooserUI.this;
            if (appChooserUI.f55148e != null) {
                C19511s sVar = appChooserUI.mo25302N7() ? appChooserUI.f55135N : appChooserUI.f55148e.f55179e;
                if (sVar == C19511s.UNINSTALL) {
                    C19510r rVar = appChooserUI.f55136P;
                    if (rVar != null && rVar.f55194b.isShowing()) {
                        appChooserUI.f55136P.f55194b.dismiss();
                    }
                    if (!Util.isNullOrNil(appChooserUI.f55164w.mo25201g())) {
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", appChooserUI.f55164w.mo25201g());
                        C88144b.m109791i(appChooserUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    } else {
                        Intent intent2 = new Intent();
                        intent2.setClassName(appChooserUI.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
                        intent2.putExtra("task_name", appChooserUI.f55164w.mo25198d());
                        intent2.putExtra("task_download_type", 1);
                        C22921c.C22922a c = appChooserUI.f55164w.mo25197c();
                        String d = appChooserUI.f55164w.mo25198d();
                        if (c.f65899d > 0) {
                            d = appChooserUI.getResources().getString(c.f65899d);
                        } else if (!Util.isNullOrNil(c.f65900e)) {
                            d = c.f65900e;
                        }
                        intent2.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, d);
                        intent2.putExtra("icon_res_id", c.f65896a);
                        if (appChooserUI.f55166y == 1) {
                            intent2.putExtra("task_url", "http://appchannel.html5.qq.com/directdown?app=qqbrowser&channel=10375");
                        } else {
                            intent2.putExtra("task_url", appChooserUI.f55164w.mo25199e());
                        }
                        intent2.putExtra("fileType", 1);
                        intent2.putExtra("package_name", appChooserUI.f55164w.mo25200f());
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent2);
                        AppChooserUI appChooserUI2 = appChooserUI;
                        C117292a.m165358d(appChooserUI2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI", "tryDownloadQB", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        appChooserUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(appChooserUI2, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI", "tryDownloadQB", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    C19447h1 a = C19447h1.m20801a();
                    int i = appChooserUI.f55161t;
                    a.getClass();
                    if (i == 0) {
                        C115669n.INSTANCE.mo160131h(10998, 2);
                    } else if (i == 1) {
                        C115669n.INSTANCE.mo160131h(11091, 2);
                    }
                    if (appChooserUI.f55161t == 0) {
                        if (appChooserUI.f55132K) {
                            C115669n.INSTANCE.mo160131h(11168, 4, Integer.valueOf(appChooserUI.f55166y));
                        } else {
                            C115669n.INSTANCE.mo160131h(11168, 3, Integer.valueOf(appChooserUI.f55166y));
                        }
                    }
                    if (appChooserUI.f55161t == 1) {
                        C115669n.INSTANCE.mo160131h(12809, 5, "");
                    }
                } else if (sVar == C19511s.DOWNLOADED) {
                    long j = appChooserUI.f55134M;
                    Log.m105924i("MicroMsg.AppChooserUI", "installRecommendApp");
                    String str = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(j).f12197g;
                    Log.m105919d("MicroMsg.AppChooserUI", "filepath:%s", str + "");
                    ((C45962f) C86312j.m106911c(C45962f.class)).go0(appChooserUI.getContext(), str, new C19565j(appChooserUI), false);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$h */
    public class C19504h implements w$$d {
        public C19504h() {
        }

        public void onDismiss() {
            AppChooserUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$i */
    public class C19505i implements w$$d {
        public C19505i() {
        }

        public void onDismiss() {
            AppChooserUI appChooserUI = AppChooserUI.this;
            if (appChooserUI.f55159r) {
                appChooserUI.f55158q = appChooserUI.f55156p;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$k */
    public class C19506k extends C60896i<C19509p> {
        public C19506k() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.aib;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
            if (r5.f55129H >= r5.f55130I) goto L_0x0083;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo44e(jq3.C60905o r3, jq3.C9493c r4, int r5, int r6, boolean r7, java.util.List r8) {
            /*
                r2 = this;
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p) r4
                r5 = 2131302382(0x7f0917ee, float:1.8222849E38)
                android.view.View r5 = r3.mo85812D(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r6 = 2131302383(0x7f0917ef, float:1.822285E38)
                android.view.View r6 = r3.mo85812D(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r7 = 2131302381(0x7f0917ed, float:1.8222847E38)
                android.view.View r3 = r3.mo85812D(r7)
                android.widget.TextView r3 = (android.widget.TextView) r3
                android.graphics.drawable.Drawable r7 = r4.f55188f
                r8 = 0
                r0 = 1
                if (r7 != 0) goto L_0x0031
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$q r7 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$q
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                r7.<init>()
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p[] r1 = new com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p[r0]
                r1[r8] = r4
                r7.execute(r1)
            L_0x0031:
                android.graphics.drawable.Drawable r7 = r4.f55188f
                r5.setImageDrawable(r7)
                java.lang.CharSequence r5 = r4.f55187e
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                boolean r1 = r7.f55126E
                if (r1 == 0) goto L_0x006a
                android.content.pm.ResolveInfo r1 = r4.f55186d
                if (r1 == 0) goto L_0x006a
                android.content.pm.ActivityInfo r1 = r1.activityInfo
                java.lang.String r1 = r1.packageName
                java.lang.String r7 = r7.f55127F
                boolean r7 = r1.equals(r7)
                if (r7 == 0) goto L_0x006a
                r7 = 2
                java.lang.CharSequence[] r7 = new java.lang.CharSequence[r7]
                r7[r8] = r5
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r5 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                r1 = 2131821448(0x7f110388, float:1.927564E38)
                java.lang.String r5 = r5.getString(r1)
                r7[r0] = r5
                java.lang.CharSequence r5 = android.text.TextUtils.concat(r7)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r1 = r7.f55122A
                if (r1 != 0) goto L_0x006a
                r7.f55122A = r4
            L_0x006a:
                r6.setText(r5)
                boolean r5 = r4.f55189g
                if (r5 == 0) goto L_0x0083
                boolean r6 = r4.f55190h
                if (r6 != 0) goto L_0x0083
                if (r5 == 0) goto L_0x008d
                boolean r5 = r4.f55192j
                if (r5 == 0) goto L_0x008d
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r5 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                int r6 = r5.f55129H
                int r5 = r5.f55130I
                if (r6 < r5) goto L_0x008d
            L_0x0083:
                boolean r5 = r4.f55191i
                if (r5 != 0) goto L_0x008d
                r4 = 8
                r3.setVisibility(r4)
                goto L_0x00d3
            L_0x008d:
                r3.setVisibility(r8)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r5 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r5 = r5.f55135N
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19511s.UNINSTALL
                if (r5 != r6) goto L_0x00ad
                boolean r4 = r4.f55191i
                if (r4 == 0) goto L_0x00a3
                r4 = 2131821609(0x7f110429, float:1.9275966E38)
                r3.setText(r4)
                goto L_0x00a9
            L_0x00a3:
                r4 = 2131821458(0x7f110392, float:1.927566E38)
                r3.setText(r4)
            L_0x00a9:
                r3.setEnabled(r0)
                goto L_0x00d3
            L_0x00ad:
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19511s.DOWNLOADING
                if (r5 != r6) goto L_0x00bb
                r4 = 2131821465(0x7f110399, float:1.9275674E38)
                r3.setText(r4)
                r3.setEnabled(r8)
                goto L_0x00d3
            L_0x00bb:
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r6 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19511s.DOWNLOADED
                if (r5 != r6) goto L_0x00d3
                boolean r4 = r4.f55191i
                if (r4 == 0) goto L_0x00ca
                r4 = 2131821709(0x7f11048d, float:1.9276169E38)
                r3.setText(r4)
                goto L_0x00d0
            L_0x00ca:
                r4 = 2131821708(0x7f11048c, float:1.9276167E38)
                r3.setText(r4)
            L_0x00d0:
                r3.setEnabled(r0)
            L_0x00d3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19506k.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$n */
    public class C19507n extends BaseAdapter {

        /* renamed from: d */
        public List<C19509p> f55178d = new ArrayList();

        /* renamed from: e */
        public C19511s f55179e = C19511s.UNINSTALL;

        public C19507n() {
            AppChooserUI.this.f55147d = AppChooserUI.this.getPackageManager();
        }

        /* renamed from: a */
        public C19509p getItem(int i) {
            List<C19509p> list = this.f55178d;
            if (list == null) {
                return null;
            }
            return list.get(i);
        }

        public int getCount() {
            List<C19509p> list = this.f55178d;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return getItem(i).f55189g ? 1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
            if (r0.f55129H >= r0.f55130I) goto L_0x00a4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0155  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            /*
                r6 = this;
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r7 = r6.getItem(r7)
                if (r8 == 0) goto L_0x0014
                java.lang.Object r9 = r8.getTag()
                if (r9 != 0) goto L_0x000d
                goto L_0x0014
            L_0x000d:
                java.lang.Object r9 = r8.getTag()
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$o r9 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19508o) r9
                goto L_0x0038
            L_0x0014:
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r8 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
                boolean r9 = r7.f55189g
                if (r9 == 0) goto L_0x0026
                r9 = 2131493184(0x7f0c0140, float:1.860984E38)
                goto L_0x0029
            L_0x0026:
                r9 = 2131493183(0x7f0c013f, float:1.8609839E38)
            L_0x0029:
                r0 = 0
                android.view.View r8 = r8.inflate(r9, r0)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$o r9 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$o
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                r9.<init>(r0, r8)
                r8.setTag(r9)
            L_0x0038:
                android.graphics.drawable.Drawable r0 = r7.f55188f
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x004c
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$q r0 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$q
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                r0.<init>()
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p[] r3 = new com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p[r1]
                r3[r2] = r7
                r0.execute(r3)
            L_0x004c:
                android.widget.ImageView r0 = r9.f55181a
                android.graphics.drawable.Drawable r3 = r7.f55188f
                r0.setImageDrawable(r3)
                java.lang.CharSequence r0 = r7.f55187e
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                boolean r4 = r3.f55126E
                if (r4 == 0) goto L_0x0087
                android.content.pm.ResolveInfo r4 = r7.f55186d
                if (r4 == 0) goto L_0x0087
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r4 = r4.packageName
                java.lang.String r3 = r3.f55127F
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L_0x0087
                r3 = 2
                java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
                r3[r2] = r0
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                r4 = 2131821448(0x7f110388, float:1.927564E38)
                java.lang.String r0 = r0.getString(r4)
                r3[r1] = r0
                java.lang.CharSequence r0 = android.text.TextUtils.concat(r3)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r4 = r3.f55122A
                if (r4 != 0) goto L_0x0087
                r3.f55122A = r7
            L_0x0087:
                android.widget.TextView r3 = r9.f55182b
                r3.setText(r0)
                boolean r0 = r7.f55189g
                r3 = 8
                if (r0 == 0) goto L_0x00a4
                boolean r4 = r7.f55190h
                if (r4 != 0) goto L_0x00a4
                if (r0 == 0) goto L_0x00c0
                boolean r0 = r7.f55192j
                if (r0 == 0) goto L_0x00c0
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                int r4 = r0.f55129H
                int r0 = r0.f55130I
                if (r4 < r0) goto L_0x00c0
            L_0x00a4:
                boolean r0 = r7.f55191i
                if (r0 != 0) goto L_0x00c0
                android.widget.TextView r0 = r9.f55184d
                r0.setVisibility(r3)
                android.widget.RadioButton r0 = r9.f55185e
                r0.setVisibility(r2)
                android.widget.RadioButton r0 = r9.f55185e
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r4 = r4.f55122A
                boolean r4 = r7.mo25315a(r4)
                r0.setChecked(r4)
                goto L_0x0124
            L_0x00c0:
                android.widget.TextView r0 = r9.f55184d
                r0.setVisibility(r2)
                android.widget.RadioButton r0 = r9.f55185e
                r0.setVisibility(r3)
                android.widget.TextView r0 = r9.f55184d
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                android.view.View$OnClickListener r4 = r4.f55142V
                r0.setOnClickListener(r4)
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r0 = r6.f55179e
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19511s.UNINSTALL
                if (r0 != r4) goto L_0x00f4
                boolean r0 = r7.f55191i
                if (r0 == 0) goto L_0x00e6
                android.widget.TextView r0 = r9.f55184d
                r4 = 2131821609(0x7f110429, float:1.9275966E38)
                r0.setText(r4)
                goto L_0x00ee
            L_0x00e6:
                android.widget.TextView r0 = r9.f55184d
                r4 = 2131821458(0x7f110392, float:1.927566E38)
                r0.setText(r4)
            L_0x00ee:
                android.widget.TextView r0 = r9.f55184d
                r0.setEnabled(r1)
                goto L_0x0124
            L_0x00f4:
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19511s.DOWNLOADING
                if (r0 != r4) goto L_0x0106
                android.widget.TextView r0 = r9.f55184d
                r4 = 2131821465(0x7f110399, float:1.9275674E38)
                r0.setText(r4)
                android.widget.TextView r0 = r9.f55184d
                r0.setEnabled(r2)
                goto L_0x0124
            L_0x0106:
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19511s.DOWNLOADED
                if (r0 != r4) goto L_0x0124
                boolean r0 = r7.f55191i
                if (r0 == 0) goto L_0x0117
                android.widget.TextView r0 = r9.f55184d
                r4 = 2131821709(0x7f11048d, float:1.9276169E38)
                r0.setText(r4)
                goto L_0x011f
            L_0x0117:
                android.widget.TextView r0 = r9.f55184d
                r4 = 2131821708(0x7f11048c, float:1.9276167E38)
                r0.setText(r4)
            L_0x011f:
                android.widget.TextView r0 = r9.f55184d
                r0.setEnabled(r1)
            L_0x0124:
                boolean r0 = r7.f55189g
                if (r0 == 0) goto L_0x0155
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                int r4 = r0.f55166y
                r5 = 4
                if (r4 != r5) goto L_0x0138
                android.widget.TextView r0 = r9.f55183c
                r4 = 2131834227(0x7f113573, float:1.9301558E38)
                r0.setText(r4)
                goto L_0x0143
            L_0x0138:
                android.widget.TextView r4 = r9.f55183c
                java.lang.String r0 = r0.f55162u
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                r4.setText(r0)
            L_0x0143:
                android.widget.TextView r0 = r9.f55183c
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                java.lang.String r4 = r4.f55162u
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x0151
                r2 = 8
            L_0x0151:
                r0.setVisibility(r2)
                goto L_0x015a
            L_0x0155:
                android.widget.TextView r0 = r9.f55183c
                r0.setVisibility(r3)
            L_0x015a:
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                int r2 = r0.f55166y
                r3 = 6
                if (r2 == r3) goto L_0x0170
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r0.f55122A
                if (r0 == 0) goto L_0x0170
                boolean r7 = r0.equals(r7)
                if (r7 == 0) goto L_0x0170
                android.widget.RadioButton r7 = r9.f55185e
                r7.setChecked(r1)
            L_0x0170:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19507n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$o */
    public class C19508o {

        /* renamed from: a */
        public ImageView f55181a;

        /* renamed from: b */
        public TextView f55182b;

        /* renamed from: c */
        public TextView f55183c;

        /* renamed from: d */
        public TextView f55184d;

        /* renamed from: e */
        public RadioButton f55185e;

        public C19508o(AppChooserUI appChooserUI, View view) {
            this.f55181a = (ImageView) view.findViewById(C0966R.C0970id.f6037vj);
            this.f55182b = (TextView) view.findViewById(C0966R.C0970id.f6056w3);
            this.f55183c = (TextView) view.findViewById(C0966R.C0970id.f6029va);
            this.f55184d = (TextView) view.findViewById(C0966R.C0970id.f6067wd);
            this.f55185e = (RadioButton) view.findViewById(C0966R.C0970id.f6063w_);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p */
    public class C19509p implements C9493c {

        /* renamed from: d */
        public ResolveInfo f55186d;

        /* renamed from: e */
        public CharSequence f55187e;

        /* renamed from: f */
        public Drawable f55188f;

        /* renamed from: g */
        public boolean f55189g;

        /* renamed from: h */
        public boolean f55190h;

        /* renamed from: i */
        public boolean f55191i;

        /* renamed from: j */
        public boolean f55192j;

        public C19509p(AppChooserUI appChooserUI) {
        }

        /* renamed from: a */
        public boolean mo25315a(Object obj) {
            ResolveInfo resolveInfo;
            if (!(obj instanceof C19509p)) {
                return false;
            }
            C19509p pVar = (C19509p) obj;
            ResolveInfo resolveInfo2 = pVar.f55186d;
            if (resolveInfo2 == null || (resolveInfo = this.f55186d) == null || !resolveInfo2.activityInfo.packageName.equals(resolveInfo.activityInfo.packageName)) {
                return pVar.f55189g && this.f55189g;
            }
            return true;
        }

        /* renamed from: c */
        public int mo75c() {
            return 0;
        }

        public long getItemId() {
            return (long) hashCode();
        }

        public C19509p(AppChooserUI appChooserUI, ResolveInfo resolveInfo, CharSequence charSequence, boolean z, boolean z2, boolean z3) {
            this.f55186d = resolveInfo;
            this.f55187e = charSequence;
            this.f55189g = z;
            this.f55190h = z2;
            this.f55191i = z3;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$r */
    public class C19510r {

        /* renamed from: a */
        public Context f55193a;

        /* renamed from: b */
        public C77398g f55194b;

        /* renamed from: c */
        public ListViewInScrollView f55195c;

        /* renamed from: d */
        public String f55196d;

        /* renamed from: e */
        public BaseAdapter f55197e;

        /* renamed from: f */
        public AdapterView.OnItemClickListener f55198f;

        /* renamed from: g */
        public DialogInterface.OnClickListener f55199g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f55200h;

        /* renamed from: i */
        public DialogInterface.OnDismissListener f55201i;

        public C19510r(AppChooserUI appChooserUI, Context context) {
            this.f55193a = context;
            this.f55195c = (ListViewInScrollView) View.inflate(context, C0966R.C0971layout.f6492ga, (ViewGroup) null);
        }

        /* renamed from: a */
        public void mo25316a(boolean z) {
            C77398g gVar = this.f55194b;
            if (gVar == null) {
                return;
            }
            if (!z) {
                gVar.mo107541v(C0966R.string.a3z, (DialogInterface.OnClickListener) null);
                this.f55194b.mo107534s(C0966R.string.a3y, (DialogInterface.OnClickListener) null);
                return;
            }
            gVar.mo107541v(C0966R.string.a3z, this.f55200h);
            this.f55194b.mo107534s(C0966R.string.a3y, this.f55199g);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$s */
    public enum C19511s {
        UNINSTALL,
        DOWNLOADING,
        DOWNLOADED
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$j */
    public class C19513j implements DialogInterface.OnDismissListener {
        public C19513j() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            AppChooserUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$l */
    public class C19514l extends C60896i<C19509p> {
        public C19514l() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.czj;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C19509p pVar = (C19509p) cVar;
            View view = oVar.f44854d;
            int i3 = pVar.f55190h ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/tools/AppChooserUI$DisplayResolveInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/tools/AppChooserUI$DisplayResolveInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AppChooseItemCheckedView appChooseItemCheckedView = (AppChooseItemCheckedView) oVar.mo85812D(C0966R.C0970id.ne4);
            appChooseItemCheckedView.f120993d = true;
            appChooseItemCheckedView.mo69409a();
            appChooseItemCheckedView.getTitleTv().setText(pVar.f55187e);
            if (appChooseItemCheckedView.getIconImg() != null) {
                appChooseItemCheckedView.getIconImg().setImageDrawable(pVar.f55188f);
            }
            appChooseItemCheckedView.setChecked(AppChooserUI.this.f55158q.mo25315a(pVar));
            oVar.f44854d.setOnClickListener(new C44639k(this, pVar));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$m */
    public class C19515m extends C60896i<C9493c> {

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$m$a */
        public class C19516a implements View.OnClickListener {
            public C19516a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultNotSetItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                AppChooserUI appChooserUI = AppChooserUI.this;
                appChooserUI.f55158q = appChooserUI.f55152i;
                appChooserUI.f55155o.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultNotSetItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C19515m() {
        }

        /* renamed from: b */
        public C60905o mo25318b(RecyclerView recyclerView, View view) {
            return new C60905o(view);
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.czj;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List<Object> list) {
            AppChooseItemCheckedView appChooseItemCheckedView = (AppChooseItemCheckedView) oVar.mo85812D(C0966R.C0970id.ne4);
            boolean z2 = false;
            appChooseItemCheckedView.f120993d = false;
            appChooseItemCheckedView.mo69409a();
            AppChooserUI appChooserUI = AppChooserUI.this;
            C19509p pVar = appChooserUI.f55152i;
            C19509p pVar2 = appChooserUI.f55158q;
            if (pVar == pVar2 || pVar2 == null) {
                z2 = true;
            }
            appChooseItemCheckedView.setChecked(z2);
            oVar.f44854d.setOnClickListener(new C19516a());
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$q */
    public class C19517q extends AsyncTask<C19509p, Void, C19509p> {
        public C19517q() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
            if (r5 == null) goto L_0x0044;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r11) {
            /*
                r10 = this;
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p[] r11 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p[]) r11
                r0 = 0
                r11 = r11[r0]
                android.graphics.drawable.Drawable r1 = r11.f55188f
                if (r1 != 0) goto L_0x0091
                com.tencent.mm.pluginsdk.ui.tools.AppChooserUI r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.this
                android.content.pm.ResolveInfo r2 = r11.f55186d
                int r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.f55121x0
                r1.getClass()
                java.lang.String r3 = "MicroMsg.AppChooserUI"
                r4 = 1
                java.lang.String r5 = r2.resolvePackageName     // Catch:{ NameNotFoundException -> 0x007f }
                r6 = 0
                if (r5 == 0) goto L_0x0044
                int r7 = r2.icon     // Catch:{ NameNotFoundException -> 0x007f }
                if (r7 == 0) goto L_0x0044
                android.content.pm.PackageManager r7 = r1.f55147d     // Catch:{ NameNotFoundException -> 0x007f }
                android.content.res.Resources r5 = r7.getResourcesForApplication(r5)     // Catch:{ NameNotFoundException -> 0x007f }
                int r7 = r2.icon     // Catch:{ NameNotFoundException -> 0x007f }
                java.lang.reflect.Method r8 = lg3.C88496e.f255626f     // Catch:{ NotFoundException -> 0x0040 }
                if (r5 != 0) goto L_0x002d
                hi3.e$c r5 = hi3.C87520e.f253545a     // Catch:{ NotFoundException -> 0x0040 }
                goto L_0x0040
            L_0x002d:
                java.lang.ThreadLocal<java.lang.Boolean> r8 = hi3.C87520e.f253558n     // Catch:{ NotFoundException -> 0x0040 }
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ NotFoundException -> 0x0040 }
                r8.set(r9)     // Catch:{ NotFoundException -> 0x0040 }
                android.graphics.drawable.Drawable r5 = r5.getDrawable(r7)     // Catch:{ NotFoundException -> 0x0040 }
                java.lang.ThreadLocal<java.lang.Boolean> r7 = hi3.C87520e.f253558n     // Catch:{ NotFoundException -> 0x0040 }
                java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x0040 }
                r7.set(r8)     // Catch:{ NotFoundException -> 0x0040 }
                goto L_0x0041
            L_0x0040:
                r5 = r6
            L_0x0041:
                if (r5 == 0) goto L_0x0044
                goto L_0x008f
            L_0x0044:
                int r5 = r2.getIconResource()     // Catch:{ NameNotFoundException -> 0x007f }
                if (r5 == 0) goto L_0x0089
                android.content.pm.PackageManager r7 = r1.f55147d     // Catch:{ NameNotFoundException -> 0x007f }
                android.content.pm.ActivityInfo r8 = r2.activityInfo     // Catch:{ NameNotFoundException -> 0x007f }
                java.lang.String r8 = r8.packageName     // Catch:{ NameNotFoundException -> 0x007f }
                android.content.res.Resources r7 = r7.getResourcesForApplication(r8)     // Catch:{ NameNotFoundException -> 0x007f }
                java.lang.reflect.Method r8 = lg3.C88496e.f255626f     // Catch:{ NotFoundException -> 0x006e }
                if (r7 != 0) goto L_0x005b
                hi3.e$c r7 = hi3.C87520e.f253545a     // Catch:{ NotFoundException -> 0x006e }
                goto L_0x006e
            L_0x005b:
                java.lang.ThreadLocal<java.lang.Boolean> r8 = hi3.C87520e.f253558n     // Catch:{ NotFoundException -> 0x006e }
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ NotFoundException -> 0x006e }
                r8.set(r9)     // Catch:{ NotFoundException -> 0x006e }
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r5)     // Catch:{ NotFoundException -> 0x006e }
                java.lang.ThreadLocal<java.lang.Boolean> r8 = hi3.C87520e.f253558n     // Catch:{ NotFoundException -> 0x006e }
                java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x006e }
                r8.set(r9)     // Catch:{ NotFoundException -> 0x006e }
                r6 = r7
            L_0x006e:
                if (r6 == 0) goto L_0x0089
                java.lang.String r7 = "loadIconForResolveInfo iconRes %d done"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ NameNotFoundException -> 0x007f }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NameNotFoundException -> 0x007f }
                r8[r0] = r5     // Catch:{ NameNotFoundException -> 0x007f }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r8)     // Catch:{ NameNotFoundException -> 0x007f }
                r5 = r6
                goto L_0x008f
            L_0x007f:
                r5 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r0] = r5
                java.lang.String r0 = "Couldn't find resources for package"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r4)
            L_0x0089:
                android.content.pm.PackageManager r0 = r1.f55147d
                android.graphics.drawable.Drawable r5 = r2.loadIcon(r0)
            L_0x008f:
                r11.f55188f = r5
            L_0x0091:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19517q.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onPostExecute(Object obj) {
            C19509p pVar = (C19509p) obj;
            C19507n nVar = AppChooserUI.this.f55148e;
            if (nVar != null) {
                nVar.notifyDataSetChanged();
            }
            WxRecyclerAdapter<C19509p> wxRecyclerAdapter = AppChooserUI.this.f55151h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
    }

    public AppChooserUI() {
        C19509p pVar = new C19509p(this);
        this.f55152i = pVar;
        this.f55156p = pVar;
        this.f55158q = pVar;
    }

    /* renamed from: I7 */
    public static int m20897I7(int i, String str, int i2) {
        return str != null ? i + i2 + str.hashCode() : i + i2;
    }

    /* renamed from: H7 */
    public final boolean mo25297H7() {
        this.f55134M = ((Long) C86709a0.m107535s().mo121142i().mo119684e(m20897I7(274560, this.f55128G, this.f55161t), 0L)).longValue();
        FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(this.f55134M);
        Log.m105918d("MicroMsg.AppChooserUI", "downloadId:" + this.f55134M + ", status:" + n.f12196f);
        if (3 != n.f12196f || !C86013q1.m106450k(n.f12197g)) {
            return false;
        }
        mo25301M7(C19511s.DOWNLOADED);
        C19507n nVar = this.f55148e;
        if (nVar != null) {
            nVar.notifyDataSetChanged();
        }
        WxRecyclerAdapter<C19509p> wxRecyclerAdapter = this.f55151h;
        if (wxRecyclerAdapter == null) {
            return true;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        return true;
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r11v1, types: [boolean, int] */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p> mo25298J7(android.content.Intent r18, boolean r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.content.pm.PackageManager r0 = r7.f55147d
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = r18
            java.util.List r10 = r0.queryIntentActivities(r2, r1)
            com.tencent.mm.pluginsdk.model.g1 r0 = r7.f55164w
            wm.c$a r0 = r0.mo25197c()
            java.lang.String r1 = r0.f65898c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = r0.f65898c
            r7.f55162u = r1
            goto L_0x0036
        L_0x0026:
            int r1 = r0.f65897b
            if (r1 <= 0) goto L_0x0036
            android.content.res.Resources r1 = r17.getResources()
            int r2 = r0.f65897b
            java.lang.String r1 = r1.getString(r2)
            r7.f55162u = r1
        L_0x0036:
            int r1 = r0.f65896a
            if (r1 <= 0) goto L_0x0048
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r1 = r7.f55123B
            android.content.res.Resources r2 = r17.getResources()
            int r3 = r0.f65896a
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.f55188f = r2
        L_0x0048:
            int r1 = r0.f65899d
            if (r1 <= 0) goto L_0x005b
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r1 = r7.f55123B
            android.content.res.Resources r2 = r17.getResources()
            int r0 = r0.f65899d
            java.lang.String r0 = r2.getString(r0)
            r1.f55187e = r0
            goto L_0x0061
        L_0x005b:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r1 = r7.f55123B
            java.lang.String r0 = r0.f65900e
            r1.f55187e = r0
        L_0x0061:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            r11 = 1
            r0.f55189g = r11
            boolean r1 = r7.f55131J
            r0.f55190h = r1
            if (r1 == 0) goto L_0x006e
            r0.f55192j = r11
        L_0x006e:
            boolean r1 = r7.f55132K
            if (r1 == 0) goto L_0x0074
            r0.f55191i = r11
        L_0x0074:
            r12 = 0
            if (r10 == 0) goto L_0x00fe
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x00fe
            int r13 = r10.size()
            r14 = 0
            r15 = 0
        L_0x0083:
            if (r14 >= r13) goto L_0x00ff
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Object r1 = r10.get(r14)
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.name
            r0[r12] = r1
            java.lang.String r1 = "MicroMsg.AppChooserUI"
            java.lang.String r2 = "cpan name:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            java.lang.Object r0 = r10.get(r14)
            r2 = r0
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            if (r2 == 0) goto L_0x00fa
            android.content.pm.ActivityInfo r0 = r2.activityInfo
            java.lang.String r0 = r0.packageName
            if (r8 == 0) goto L_0x00b5
            boolean r1 = r20.isEmpty()
            if (r1 != 0) goto L_0x00b5
            boolean r1 = r8.contains(r0)
            if (r1 == 0) goto L_0x00fa
        L_0x00b5:
            com.tencent.mm.pluginsdk.model.g1 r1 = r7.f55164w
            boolean r0 = r1.mo25203i(r0)
            if (r0 == 0) goto L_0x00cf
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            r0.f55186d = r2
            r0.f55192j = r11
            if (r19 != 0) goto L_0x00c9
            boolean r1 = r7.f55131J
            if (r1 != 0) goto L_0x00cb
        L_0x00c9:
            if (r19 != 0) goto L_0x00fa
        L_0x00cb:
            r9.add(r12, r0)
            goto L_0x00f9
        L_0x00cf:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r6 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p
            com.tencent.mm.pluginsdk.model.g1 r0 = r7.f55164w
            androidx.appcompat.app.AppCompatActivity r1 = r17.getContext()
            java.lang.String r3 = r0.mo25196b(r1, r2)
            r4 = 0
            r5 = 1
            r16 = 0
            r0 = r6
            r1 = r17
            r11 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.add(r11)
            com.tencent.mm.pluginsdk.model.g1 r0 = r7.f55164w
            android.content.pm.ResolveInfo r1 = r11.f55186d
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.packageName
            boolean r0 = r0.mo25203i(r1)
            if (r0 == 0) goto L_0x00fa
        L_0x00f9:
            r15 = 1
        L_0x00fa:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x0083
        L_0x00fe:
            r15 = 0
        L_0x00ff:
            if (r19 == 0) goto L_0x014a
            if (r15 != 0) goto L_0x014a
            int r0 = r7.f55161t
            if (r0 != 0) goto L_0x0145
            java.lang.String r0 = r7.f55128G
            if (r0 == 0) goto L_0x0145
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            r9.add(r12, r0)
            boolean r0 = r7.f55132K
            r1 = 11168(0x2ba0, float:1.565E-41)
            r2 = 2
            if (r0 == 0) goto L_0x012e
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r12] = r2
            int r2 = r7.f55166y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r3[r4] = r2
            r0.mo160131h(r1, r3)
            goto L_0x014a
        L_0x012e:
            r4 = 1
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2[r12] = r3
            int r3 = r7.f55166y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            r0.mo160131h(r1, r2)
            goto L_0x014a
        L_0x0145:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            r9.add(r12, r0)
        L_0x014a:
            int r0 = r7.f55166y
            r1 = 4
            if (r0 == r1) goto L_0x0153
            r1 = 8
            if (r0 != r1) goto L_0x0175
        L_0x0153:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            android.content.pm.ResolveInfo r1 = r0.f55186d
            if (r1 != 0) goto L_0x0175
            android.content.pm.ResolveInfo r1 = new android.content.pm.ResolveInfo
            r1.<init>()
            r0.f55186d = r1
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            android.content.pm.ResolveInfo r0 = r0.f55186d
            android.content.pm.ActivityInfo r1 = new android.content.pm.ActivityInfo
            r1.<init>()
            r0.activityInfo = r1
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r0 = r7.f55123B
            android.content.pm.ResolveInfo r0 = r0.f55186d
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = "com.tencent.mtt"
            r0.packageName = r1
        L_0x0175:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r9.size()
            r2 = 1
            int r1 = r1 - r2
        L_0x0180:
            if (r1 < 0) goto L_0x01a2
            java.lang.Object r2 = r9.get(r1)
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p) r2
            android.content.pm.ResolveInfo r2 = r2.f55186d
            if (r2 == 0) goto L_0x019f
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.packageName
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x019f
            boolean r2 = r0.add(r2)
            if (r2 != 0) goto L_0x019f
            r9.remove(r1)
        L_0x019f:
            int r1 = r1 + -1
            goto L_0x0180
        L_0x01a2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.mo25298J7(android.content.Intent, boolean, java.util.ArrayList):java.util.ArrayList");
    }

    /* renamed from: K7 */
    public final boolean mo25299K7() {
        Log.m105919d("MicroMsg.AppChooserUI", "mShouldShowRecommendApp %s | mAppRecommendCount %d | mAppMaxRecommendCount %d | isOverseasUser %s", Boolean.valueOf(this.f55133L), Integer.valueOf(this.f55129H), Integer.valueOf(this.f55130I), Boolean.valueOf(Util.isOverseasUser(this)));
        return this.f55133L && this.f55129H < this.f55130I && !Util.isOverseasUser(this) && ChannelUtil.channelId != 1;
    }

    /* renamed from: L7 */
    public final void mo25300L7(int i, String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("selectpkg", str);
        intent.putExtra("isalways", z);
        intent.putExtra("transferback", this.f55163v);
        setResult(i, intent);
        finish();
    }

    /* renamed from: M7 */
    public void mo25301M7(C19511s sVar) {
        if (mo25302N7()) {
            this.f55135N = sVar;
            return;
        }
        C19507n nVar = this.f55148e;
        if (nVar != null) {
            nVar.f55179e = sVar;
        }
    }

    /* renamed from: N7 */
    public final boolean mo25302N7() {
        return this.f55157p0.contains(Integer.valueOf(this.f55166y));
    }

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo25300L7(0, (String) null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            super.onCreate(r18)
            com.tencent.mm.pluginsdk.model.h1 r1 = com.tencent.p014mm.pluginsdk.model.C19447h1.m20801a()
            int r2 = r0.f55161t
            r1.getClass()
            r1 = 11091(0x2b53, float:1.5542E-41)
            r3 = 10998(0x2af6, float:1.5411E-41)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0027
            if (r2 == r4) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r5] = r7
            r2.mo160131h(r1, r6)
            goto L_0x0034
        L_0x0027:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r5] = r7
            r2.mo160131h(r3, r6)
        L_0x0034:
            android.view.Window r2 = r17.getWindow()
            com.tencent.p014mm.p136ui.C85875k4.m106177d0(r2)
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r6 = "targetintent"
            android.os.Parcelable r6 = r2.getParcelableExtra(r6)
            boolean r7 = r6 instanceof android.content.Intent
            r8 = 0
            if (r7 != 0) goto L_0x0065
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Target is not an intent: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ChooseActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            r0.mo25300L7(r5, r8, r5)
            return
        L_0x0065:
            android.content.Intent r6 = (android.content.Intent) r6
            r0.f55160s = r6
            java.lang.String r6 = "title"
            java.lang.String r6 = r2.getStringExtra(r6)
            java.lang.String r7 = "type"
            int r7 = r2.getIntExtra(r7, r5)
            r0.f55161t = r7
            java.lang.String r7 = "openWay"
            boolean r7 = r2.getBooleanExtra(r7, r5)
            r0.f55126E = r7
            java.lang.String r7 = "transferback"
            android.os.Bundle r7 = r2.getBundleExtra(r7)
            r0.f55163v = r7
            java.lang.String r7 = "targetwhitelist"
            java.util.ArrayList r7 = r2.getStringArrayListExtra(r7)
            r0.f55165x = r7
            java.lang.String r7 = "needupate"
            boolean r7 = r2.getBooleanExtra(r7, r5)
            r0.f55132K = r7
            java.lang.String r7 = "mimetype"
            java.lang.String r7 = r2.getStringExtra(r7)
            r0.f55128G = r7
            java.lang.String r7 = "enter_scene"
            int r7 = r2.getIntExtra(r7, r5)
            r0.f55167z = r7
            java.lang.String r7 = "scene"
            int r7 = r2.getIntExtra(r7, r5)
            r0.f55166y = r7
            boolean r7 = f40.C86709a0.m107522a()
            r9 = 4097(0x1001, float:5.741E-42)
            java.lang.String r10 = "MicroMsg.AppChooserUI"
            if (r7 == 0) goto L_0x0446
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            r11 = 274528(0x43060, float:3.84696E-40)
            java.lang.String r12 = r0.f55128G
            int r13 = r0.f55161t
            int r11 = m20897I7(r11, r12, r13)
            java.lang.String r12 = ""
            java.lang.Object r7 = r7.mo119684e(r11, r12)
            java.lang.String r7 = (java.lang.String) r7
            r0.f55127F = r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x011a
            androidx.appcompat.app.AppCompatActivity r7 = r17.getContext()
            java.lang.String r11 = r0.f55127F
            boolean r7 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r7, r11)
            if (r7 == 0) goto L_0x011a
            java.util.ArrayList<java.lang.String> r7 = r0.f55165x
            if (r7 == 0) goto L_0x0102
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0102
            java.util.ArrayList<java.lang.String> r7 = r0.f55165x
            java.lang.String r11 = r0.f55127F
            boolean r7 = r7.contains(r11)
            if (r7 == 0) goto L_0x011a
        L_0x0102:
            boolean r7 = r0.f55126E
            if (r7 != 0) goto L_0x011a
            android.content.Intent r7 = new android.content.Intent
            android.content.Intent r11 = r0.f55160s
            r7.<init>(r11)
            java.lang.String r11 = r0.f55127F
            r7.setPackage(r11)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r0, r7, r5)
            if (r7 == 0) goto L_0x011a
            r7 = 1
            goto L_0x011b
        L_0x011a:
            r7 = 0
        L_0x011b:
            r11 = 5
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r7)
            r13[r5] = r14
            int r14 = r0.f55166y
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r4] = r14
            java.lang.String r14 = r0.f55127F
            r15 = 2
            r13[r15] = r14
            java.lang.String r14 = r0.f55128G
            r16 = 3
            r13[r16] = r14
            boolean r14 = r0.f55126E
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r11 = 4
            r13[r11] = r14
            java.lang.String r14 = "isAlwaysUseOption %b, scene %d, mDefaultAppPackageName %s, mimeType %s, isOpenWay %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r13)
            if (r7 == 0) goto L_0x0159
            int r7 = r0.f55166y
            r13 = 6
            if (r7 == r13) goto L_0x0159
            boolean r7 = r17.mo25302N7()
            if (r7 != 0) goto L_0x0159
            r1 = -1
            java.lang.String r2 = r0.f55127F
            r0.mo25300L7(r1, r2, r4)
            return
        L_0x0159:
            android.content.pm.PackageManager r7 = r17.getPackageManager()
            r0.f55147d = r7
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$n r7 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$n
            r7.<init>()
            r0.f55148e = r7
            com.tencent.mm.pluginsdk.model.h1 r7 = com.tencent.p014mm.pluginsdk.model.C19447h1.m20801a()
            int r13 = r0.f55161t
            java.lang.String r14 = "key_recommend_params"
            android.os.Bundle r14 = r2.getBundleExtra(r14)
            com.tencent.mm.pluginsdk.model.g1 r7 = r7.mo25208b(r13, r14)
            r0.f55164w = r7
            androidx.appcompat.app.AppCompatActivity r13 = r17.getContext()
            boolean r7 = r7.mo25202h(r13)
            r0.f55131J = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            int r13 = r0.f55161t
            r14 = 274496(0x43040, float:3.84651E-40)
            int r13 = r13 + r14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r7.mo119684e(r13, r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f55129H = r7
            com.tencent.mm.pluginsdk.model.h1 r7 = com.tencent.p014mm.pluginsdk.model.C19447h1.m20801a()
            int r11 = r0.f55161t
            r7.getClass()
            if (r11 == 0) goto L_0x01b3
            if (r11 == r4) goto L_0x01af
            r11 = 5
            goto L_0x01b4
        L_0x01af:
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x01b4
        L_0x01b3:
            r11 = 0
        L_0x01b4:
            r0.f55130I = r11
            java.lang.Object[] r7 = new java.lang.Object[r15]
            boolean r11 = r0.f55131J
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r7[r5] = r11
            int r11 = r0.f55129H
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r4] = r11
            java.lang.String r11 = "jiaminchen mRecommendAppAvailable is %s, mAppRecommendCount is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r7)
            java.lang.String r7 = "not_show_recommend_app"
            boolean r2 = r2.getBooleanExtra(r7, r5)
            r2 = r2 ^ r4
            r0.f55133L = r2
            int r2 = r0.f55129H
            int r7 = r0.f55130I
            if (r2 < r7) goto L_0x01de
            r2 = 1
            goto L_0x01df
        L_0x01de:
            r2 = 0
        L_0x01df:
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r7 = r0.f55124C
            r7.clear()
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r7 = r0.f55124C
            android.content.Intent r11 = r0.f55160s
            boolean r13 = r17.mo25299K7()
            java.util.ArrayList<java.lang.String> r15 = r0.f55165x
            java.util.ArrayList r11 = r0.mo25298J7(r11, r13, r15)
            r7.addAll(r11)
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r7 = r0.f55125D
            r7.clear()
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r7 = r0.f55124C
            java.util.Iterator r7 = r7.iterator()
        L_0x0200:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0216
            java.lang.Object r11 = r7.next()
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r11 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p) r11
            boolean r13 = r11.f55190h
            if (r13 == 0) goto L_0x0200
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r13 = r0.f55125D
            r13.add(r11)
            goto L_0x0200
        L_0x0216:
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r7 = r0.f55124C
            java.util.Iterator r7 = r7.iterator()
        L_0x021c:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0248
            java.lang.Object r11 = r7.next()
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r11 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p) r11
            android.content.pm.ResolveInfo r13 = r11.f55186d
            if (r13 != 0) goto L_0x022d
            goto L_0x021c
        L_0x022d:
            android.content.pm.ActivityInfo r13 = r13.activityInfo
            java.lang.String r13 = r13.packageName
            java.lang.String r15 = r0.f55127F
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x021c
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r13 = r0.f55127F
            r7[r5] = r13
            java.lang.String r13 = "init default pkg name: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r7)
            r0.f55156p = r11
            r0.f55158q = r11
        L_0x0248:
            if (r2 != 0) goto L_0x0263
            boolean r7 = r0.f55131J
            if (r7 != 0) goto L_0x0263
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            int r11 = r0.f55161t
            int r14 = r14 + r11
            int r11 = r0.f55129H
            int r11 = r11 + r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7.mo119676J(r14, r11)
        L_0x0263:
            boolean r7 = r0.f55131J
            if (r7 == 0) goto L_0x0291
            com.tencent.mm.pluginsdk.model.h1 r7 = com.tencent.p014mm.pluginsdk.model.C19447h1.m20801a()
            int r11 = r0.f55161t
            r7.getClass()
            if (r11 == 0) goto L_0x0283
            if (r11 == r4) goto L_0x0275
            goto L_0x02bc
        L_0x0275:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            r7[r5] = r11
            r3.mo160131h(r1, r7)
            goto L_0x02bc
        L_0x0283:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            r7[r5] = r11
            r1.mo160131h(r3, r7)
            goto L_0x02bc
        L_0x0291:
            if (r2 != 0) goto L_0x02bc
            com.tencent.mm.pluginsdk.model.h1 r7 = com.tencent.p014mm.pluginsdk.model.C19447h1.m20801a()
            int r11 = r0.f55161t
            r7.getClass()
            if (r11 == 0) goto L_0x02af
            if (r11 == r4) goto L_0x02a1
            goto L_0x02bc
        L_0x02a1:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r7[r5] = r11
            r3.mo160131h(r1, r7)
            goto L_0x02bc
        L_0x02af:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r7[r5] = r11
            r1.mo160131h(r3, r7)
        L_0x02bc:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r3 = r0.f55124C
            if (r3 == 0) goto L_0x02c7
            int r3 = r3.size()
            goto L_0x02c8
        L_0x02c7:
            r3 = 0
        L_0x02c8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r5] = r3
            java.lang.String r3 = "mResolveListData size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r1)
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r1 = r0.f55124C
            if (r1 == 0) goto L_0x0300
            int r1 = r1.size()
            if (r1 != r4) goto L_0x0300
            boolean r1 = r17.mo25299K7()
            if (r1 == 0) goto L_0x02e7
            boolean r1 = r0.f55131J
            if (r1 == 0) goto L_0x0300
        L_0x02e7:
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r1 = r0.f55124C
            java.lang.Object r1 = r1.get(r5)
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r1 = (com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.C19509p) r1
            if (r1 == 0) goto L_0x02fc
            android.content.pm.ResolveInfo r1 = r1.f55186d
            if (r1 == 0) goto L_0x02f6
            goto L_0x0300
        L_0x02f6:
            r1 = 4098(0x1002, float:5.743E-42)
            r0.mo25300L7(r1, r8, r5)
            return
        L_0x02fc:
            r0.mo25300L7(r9, r8, r5)
            return
        L_0x0300:
            r1 = 8
            r0.setTitleVisibility(r1)
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r1 = r0.f55124C
            if (r1 == 0) goto L_0x0442
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0442
            boolean r1 = r17.mo25302N7()
            if (r1 == 0) goto L_0x03a6
            qo3.w r1 = new qo3.w
            r1.<init>(r0)
            r0.f55149f = r1
            r2 = 2131494423(0x7f0c0617, float:1.8612354E38)
            r1.mo12470j(r2)
            qo3.w r1 = r0.f55149f
            android.view.View r1 = r1.f36927f
            r2 = 2131302387(0x7f0917f3, float:1.8222859E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.TextPaint r2 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r2)
            r2 = 2131302374(0x7f0917e6, float:1.8222832E38)
            android.view.View r2 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r3 = 2131302385(0x7f0917f1, float:1.8222855E38)
            android.view.View r3 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r5 = 2131302384(0x7f0917f0, float:1.8222853E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            r0.f55150g = r1
            com.tencent.mm.pluginsdk.ui.tools.f r1 = new com.tencent.mm.pluginsdk.ui.tools.f
            r1.<init>(r0)
            r2.setOnClickListener(r1)
            com.tencent.mm.pluginsdk.ui.tools.g r1 = new com.tencent.mm.pluginsdk.ui.tools.g
            r1.<init>(r0)
            r3.setOnClickListener(r1)
            qo3.w r1 = r0.f55149f
            qo3.w$$d r2 = r0.f55143W
            r1.f36937s = r2
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r0.f55150g
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$16 r3 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$16
            r3.<init>()
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r5 = r0.f55124C
            r2.<init>(r3, r5, r4)
            r0.f55151h = r2
            r1.setAdapter(r2)
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r2 = 4
            r1.<init>(r0, r2)
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r0.f55150g
            r2.setLayoutManager(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r1 = r0.f55151h
            jq3.l$b<jq3.o> r2 = r0.f55141U
            r1.f173488o = r2
            qo3.w r1 = r0.f55149f
            r1.mo5086o()
            java.lang.Class<zo.h> r1 = p407zo.C23547h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            zo.h r1 = (p407zo.C23547h) r1
            int r2 = r0.f55167z
            java.lang.String r3 = r0.f55128G
            r1.mo36794Mf(r4, r2, r12, r3)
            r17.mo25297H7()
            goto L_0x042e
        L_0x03a6:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$n r1 = r0.f55148e
            java.util.ArrayList<com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p> r3 = r0.f55124C
            r1.f55178d = r3
            r17.mo25297H7()
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$r r1 = new com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$r
            androidx.appcompat.app.AppCompatActivity r3 = r17.getContext()
            r1.<init>(r0, r3)
            r0.f55136P = r1
            if (r6 == 0) goto L_0x03c3
            java.lang.String r3 = r6.toString()
            r1.f55196d = r3
            goto L_0x03c5
        L_0x03c3:
            r1.f55196d = r8
        L_0x03c5:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$r r1 = r0.f55136P
            android.widget.AdapterView$OnItemClickListener r3 = r0.f55137Q
            r1.f55198f = r3
            android.content.DialogInterface$OnClickListener r3 = r0.f55140T
            r1.f55200h = r3
            android.content.DialogInterface$OnClickListener r3 = r0.f55138R
            r1.f55199g = r3
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$n r3 = r0.f55148e
            r1.f55197e = r3
            android.content.DialogInterface$OnDismissListener r3 = r0.f55145Y
            r1.f55201i = r3
            boolean r3 = r0.f55132K
            if (r3 != 0) goto L_0x03ec
            boolean r3 = r0.f55131J
            if (r3 == 0) goto L_0x03ec
            if (r2 != 0) goto L_0x03ec
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$p r2 = r0.f55123B
            r0.f55122A = r2
            r1.mo25316a(r4)
        L_0x03ec:
            com.tencent.mm.pluginsdk.ui.tools.AppChooserUI$r r1 = r0.f55136P
            android.widget.AdapterView$OnItemClickListener r2 = r1.f55198f
            if (r2 == 0) goto L_0x03f7
            com.tencent.mm.ui.ListViewInScrollView r3 = r1.f55195c
            r3.setOnItemClickListener(r2)
        L_0x03f7:
            android.widget.BaseAdapter r2 = r1.f55197e
            if (r2 == 0) goto L_0x0400
            com.tencent.mm.ui.ListViewInScrollView r3 = r1.f55195c
            r3.setAdapter(r2)
        L_0x0400:
            android.content.Context r4 = r1.f55193a
            r5 = 1
            java.lang.String r6 = r1.f55196d
            com.tencent.mm.ui.ListViewInScrollView r7 = r1.f55195c
            r2 = 2131821724(0x7f11049c, float:1.92762E38)
            java.lang.String r8 = r4.getString(r2)
            android.content.Context r2 = r1.f55193a
            r3 = 2131821723(0x7f11049b, float:1.9276197E38)
            java.lang.String r9 = r2.getString(r3)
            android.content.DialogInterface$OnClickListener r10 = r1.f55200h
            android.content.DialogInterface$OnClickListener r11 = r1.f55199g
            r12 = 2131100878(0x7f0604ce, float:1.781415E38)
            qo3.g r2 = nj3.C76879j.m92716J(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.f55194b = r2
            android.content.DialogInterface$OnDismissListener r3 = r1.f55201i
            r2.setOnDismissListener(r3)
            qo3.g r1 = r1.f55194b
            r1.show()
        L_0x042e:
            java.lang.Class<sp.y> r1 = p237sp.C13754y.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sp.y r1 = (p237sp.C13754y) r1
            sp.v r1 = r1.Ds0()
            com.tencent.mm.plugin.downloader.model.u r2 = r0.f55146Z
            com.tencent.mm.plugin.downloader.model.l r1 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r1
            r1.mo63955a(r2)
            goto L_0x0445
        L_0x0442:
            r0.mo25300L7(r9, r8, r5)
        L_0x0445:
            return
        L_0x0446:
            java.lang.String r1 = "acc not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            r0.mo25300L7(r9, r8, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63969q(this.f55146Z);
        C19510r rVar = this.f55136P;
        if (rVar != null) {
            rVar.f55194b.dismiss();
        }
    }

    public void onResume() {
        Intent intent;
        super.onResume();
        if (this.f55132K && (intent = this.f55160s) != null && this.f55164w.mo25204j(this, intent)) {
            Log.m105924i("MicroMsg.AppChooserUI", "user installed lasted recommend app");
            this.f55132K = false;
            this.f55123B.f55191i = false;
        }
        this.f55131J = this.f55164w.mo25202h(getContext());
        this.f55124C.clear();
        this.f55124C.addAll(mo25298J7(this.f55160s, mo25299K7(), this.f55165x));
        this.f55125D.clear();
        Iterator<C19509p> it = this.f55124C.iterator();
        while (it.hasNext()) {
            C19509p next = it.next();
            if (next.f55190h) {
                this.f55125D.add(next);
            }
        }
        C19510r rVar = this.f55136P;
        if (rVar != null && this.f55131J && this.f55122A == null && !this.f55126E) {
            this.f55122A = this.f55123B;
            rVar.mo25316a(true);
        }
        C19507n nVar = this.f55148e;
        if (nVar != null) {
            nVar.f55178d = this.f55124C;
            nVar.notifyDataSetChanged();
        }
        WxRecyclerAdapter<C19509p> wxRecyclerAdapter = this.f55151h;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }
}
