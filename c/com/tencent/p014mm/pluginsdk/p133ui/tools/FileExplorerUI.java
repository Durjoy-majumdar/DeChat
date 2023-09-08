package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.FileExplorerUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import sf0.C77691f;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI */
public class FileExplorerUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f55213p = 0;

    /* renamed from: d */
    public int f55214d = 0;

    /* renamed from: e */
    public ListView f55215e;

    /* renamed from: f */
    public C19522e f55216f;

    /* renamed from: g */
    public TextView f55217g;

    /* renamed from: h */
    public TextView f55218h;

    /* renamed from: i */
    public View f55219i;

    /* renamed from: j */
    public View f55220j;

    /* renamed from: n */
    public C86009m1 f55221n;

    /* renamed from: o */
    public C86009m1 f55222o;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$a */
    public class C19518a implements MenuItem.OnMenuItemClickListener {
        public C19518a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FileExplorerUI fileExplorerUI = FileExplorerUI.this;
            C19522e eVar = fileExplorerUI.f55216f;
            C86009m1 m1Var = eVar.f55230e;
            if (m1Var != null) {
                int i = fileExplorerUI.f55214d;
                if (1 == i) {
                    fileExplorerUI.f55222o = m1Var;
                } else if (i == 0) {
                    fileExplorerUI.f55221n = m1Var;
                }
                eVar.mo25327a(m1Var.mo119974l(), FileExplorerUI.this.f55216f.f55230e);
                FileExplorerUI.this.f55216f.notifyDataSetChanged();
                FileExplorerUI.this.f55215e.setSelection(0);
                FileExplorerUI.this.getClass();
                return true;
            }
            C86709a0.m107535s().mo121142i().mo119676J(131074, FileExplorerUI.this.f55222o.mo119971i());
            C86709a0.m107535s().mo121142i().mo119676J(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON, FileExplorerUI.this.f55221n.mo119971i());
            FileExplorerUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$b */
    public class C19519b implements AdapterView.OnItemClickListener {
        public C19519b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C86009m1 m1Var = (C86009m1) FileExplorerUI.this.f55216f.getItem(i);
            int i2 = FileExplorerUI.this.f55214d;
            if (1 == i2) {
                if (m1Var.mo119978p()) {
                    C86709a0.m107535s().mo121142i().mo119676J(131074, FileExplorerUI.this.f55216f.f55231f.mo119971i());
                    C86709a0.m107535s().mo121142i().mo119676J(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON, FileExplorerUI.this.f55221n.mo119971i());
                } else {
                    FileExplorerUI.this.f55222o = m1Var;
                }
            } else if (i2 == 0) {
                if (m1Var.mo119978p()) {
                    C86709a0.m107535s().mo121142i().mo119676J(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON, FileExplorerUI.this.f55216f.f55231f.mo119971i());
                    C86709a0.m107535s().mo121142i().mo119676J(131074, FileExplorerUI.this.f55222o.mo119971i());
                } else {
                    FileExplorerUI.this.f55221n = m1Var;
                }
            }
            C19522e eVar = FileExplorerUI.this.f55216f;
            C86009m1 m1Var2 = eVar.f55230e;
            if (m1Var == m1Var2) {
                eVar.mo25327a(m1Var2.mo119974l(), FileExplorerUI.this.f55216f.f55230e);
            } else if (m1Var.mo119977o()) {
                C19522e eVar2 = FileExplorerUI.this.f55216f;
                eVar2.mo25327a(eVar2.f55231f, m1Var);
            } else if (m1Var.mo119978p()) {
                FileExplorerUI.this.setResult(-1, new Intent().putExtra("choosed_file_path", m1Var.mo119971i()));
                FileExplorerUI.this.finish();
            }
            FileExplorerUI.this.getClass();
            FileExplorerUI.this.f55216f.notifyDataSetChanged();
            FileExplorerUI.this.f55215e.setSelection(0);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$c */
    public class C19520c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C86009m1 f55225d;

        public C19520c(C86009m1 m1Var) {
            this.f55225d = m1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FileExplorerUI fileExplorerUI = FileExplorerUI.this;
            int i = FileExplorerUI.f55213p;
            fileExplorerUI.mo25322H7(0);
            FileExplorerUI.this.f55216f.f55229d = this.f55225d.mo119976n();
            FileExplorerUI fileExplorerUI2 = FileExplorerUI.this;
            fileExplorerUI2.f55216f.mo25327a(fileExplorerUI2.f55221n.mo119974l(), FileExplorerUI.this.f55221n);
            FileExplorerUI.this.f55216f.notifyDataSetInvalidated();
            FileExplorerUI.this.f55216f.notifyDataSetChanged();
            FileExplorerUI.this.f55215e.setSelection(0);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$d */
    public class C19521d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C86009m1 f55227d;

        public C19521d(C86009m1 m1Var) {
            this.f55227d = m1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FileExplorerUI fileExplorerUI = FileExplorerUI.this;
            int i = FileExplorerUI.f55213p;
            fileExplorerUI.mo25322H7(1);
            FileExplorerUI.this.f55216f.f55229d = this.f55227d.mo119976n();
            FileExplorerUI fileExplorerUI2 = FileExplorerUI.this;
            fileExplorerUI2.f55216f.mo25327a(fileExplorerUI2.f55222o.mo119974l(), FileExplorerUI.this.f55222o);
            FileExplorerUI.this.f55216f.notifyDataSetInvalidated();
            FileExplorerUI.this.f55216f.notifyDataSetChanged();
            FileExplorerUI.this.f55215e.setSelection(0);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e */
    public class C19522e extends BaseAdapter {

        /* renamed from: d */
        public String f55229d;

        /* renamed from: e */
        public C86009m1 f55230e;

        /* renamed from: f */
        public C86009m1 f55231f;

        /* renamed from: g */
        public C86009m1[] f55232g;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e$a */
        public class C19523a implements C86011o1 {
            public C19523a(C19522e eVar) {
            }

            public boolean accept(C86009m1 m1Var) {
                return !(m1Var.f250486d.getPath().isEmpty() ? false : m1Var.getName().startsWith("."));
            }
        }

        public C19522e(C19518a aVar) {
        }

        /* renamed from: a */
        public void mo25327a(C86009m1 m1Var, C86009m1 m1Var2) {
            this.f55230e = m1Var;
            if (m1Var2.mo119971i().equalsIgnoreCase(this.f55229d)) {
                this.f55230e = null;
            }
            this.f55231f = m1Var2;
            boolean a = m1Var2.mo119961a();
            int i = 0;
            if (!a || !this.f55231f.mo119977o()) {
                this.f55232g = new C86009m1[0];
                return;
            }
            C86009m1[] v = this.f55231f.mo119985v(new C19523a(this));
            this.f55232g = v;
            if (v == null) {
                this.f55232g = new C86009m1[0];
            }
            C86009m1[] m1VarArr = this.f55232g;
            if (m1VarArr.length > 0 && m1VarArr != null && m1VarArr.length != 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C86009m1 m1Var3 : m1VarArr) {
                    C19524f fVar = new C19524f(FileExplorerUI.this, (C19518a) null);
                    fVar.f55234a = m1Var3;
                    fVar.f55235b = C77691f.m93686a(m1Var3.getName()).toUpperCase();
                    if (m1Var3.mo119977o()) {
                        arrayList.add(fVar);
                    } else {
                        arrayList2.add(fVar);
                    }
                }
                Collections.sort(arrayList, new C19574w(this));
                Collections.sort(arrayList2, new C19576x(this));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1VarArr[i] = ((C19524f) it.next()).f55234a;
                    i++;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    m1VarArr[i] = ((C19524f) it4.next()).f55234a;
                    i++;
                }
            }
        }

        public int getCount() {
            C86009m1[] m1VarArr = this.f55232g;
            int i = 0;
            if (m1VarArr == null) {
                return 0;
            }
            int length = m1VarArr.length;
            if (this.f55230e != null) {
                i = 1;
            }
            return length + i;
        }

        public Object getItem(int i) {
            C86009m1 m1Var = this.f55230e;
            if (m1Var != null && i == 0) {
                return m1Var;
            }
            Log.m105918d("FileExplorer", "pos:" + i + ", subFile length:" + this.f55232g.length);
            C86009m1[] m1VarArr = this.f55232g;
            if (this.f55230e != null) {
                i--;
            }
            return m1VarArr[i];
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            String str;
            if (view == null) {
                view = View.inflate(FileExplorerUI.this, C0966R.C0971layout.b_p, (ViewGroup) null);
                C19525g gVar = new C19525g(FileExplorerUI.this, (C19518a) null);
                gVar.f55236a = (ImageView) view.findViewById(C0966R.C0970id.d0m);
                gVar.f55237b = (TextView) view.findViewById(C0966R.C0970id.d0s);
                gVar.f55238c = (TextView) view.findViewById(C0966R.C0970id.d0z);
                view.setTag(gVar);
            }
            C19525g gVar2 = (C19525g) view.getTag();
            C86009m1 m1Var = (C86009m1) getItem(i);
            if (m1Var == this.f55230e) {
                gVar2.f55237b.setText(m1Var.getName());
                gVar2.f55236a.setImageResource(C0966R.C0969drawable.bjr);
                gVar2.f55238c.setVisibility(0);
            } else {
                ImageView imageView = gVar2.f55236a;
                FileExplorerUI fileExplorerUI = FileExplorerUI.this;
                int i2 = FileExplorerUI.f55213p;
                fileExplorerUI.getClass();
                imageView.setImageResource(m1Var.mo119977o() ? C0966R.C0969drawable.bjs : FileExplorerUI.m20925I7(m1Var.getName()));
                gVar2.f55237b.setText(m1Var.getName());
                TextView textView = gVar2.f55238c;
                StringBuilder sb = new StringBuilder();
                sb.append(DateFormat.format("yyyy-MM-dd hh:mm:ss", m1Var.mo119979q()).toString());
                if (m1Var.mo119977o()) {
                    str = "";
                } else {
                    str = "  " + Util.getSizeKB(m1Var.mo119980r());
                }
                sb.append(str);
                textView.setText(sb.toString());
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$f */
    public class C19524f {

        /* renamed from: a */
        public C86009m1 f55234a;

        /* renamed from: b */
        public String f55235b;

        public C19524f(FileExplorerUI fileExplorerUI, C19518a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$g */
    public class C19525g {

        /* renamed from: a */
        public ImageView f55236a;

        /* renamed from: b */
        public TextView f55237b;

        /* renamed from: c */
        public TextView f55238c;

        public C19525g(FileExplorerUI fileExplorerUI, C19518a aVar) {
        }
    }

    /* renamed from: I7 */
    public static int m20925I7(String str) {
        String lowerCase = str.toLowerCase();
        return FileExplorerUtil.isDoc(lowerCase) ? C0966R.raw.app_attach_file_icon_word : FileExplorerUtil.isImg(lowerCase) ? C0966R.C0969drawable.bjt : FileExplorerUtil.isCompressFile(lowerCase) ? C0966R.raw.app_attach_file_icon_rar : FileExplorerUtil.isTxt(lowerCase) ? C0966R.raw.app_attach_file_icon_txt : FileExplorerUtil.isPdf(lowerCase) ? C0966R.raw.app_attach_file_icon_pdf : FileExplorerUtil.isPpt(lowerCase) ? C0966R.raw.app_attach_file_icon_ppt : FileExplorerUtil.isXls(lowerCase) ? C0966R.raw.app_attach_file_icon_excel : FileExplorerUtil.isOfd(lowerCase) ? C0966R.raw.app_attach_file_icon_ofd : C0966R.raw.app_attach_file_icon_unknow;
    }

    /* renamed from: H7 */
    public final void mo25322H7(int i) {
        if (1 == i) {
            this.f55214d = 1;
            this.f55218h.setTextColor(getResources().getColor(C0966R.color.f3536x0));
            this.f55217g.setTextColor(getResources().getColor(C0966R.color.a7f));
            View view = this.f55219i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f55220j;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f55214d = 0;
        this.f55217g.setTextColor(getResources().getColor(C0966R.color.f3536x0));
        this.f55218h.setTextColor(getResources().getColor(C0966R.color.a7f));
        View view5 = this.f55219i;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f55220j;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(4);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/pluginsdk/ui/tools/FileExplorerUI", "changeTabTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
        if (r4.mo119967g() != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
        if (r4.mo119967g() != false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r7 = this;
            r0 = 2131311603(0x7f093bf3, float:1.824155E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r7.f55215e = r0
            r0 = 2131312644(0x7f094004, float:1.8243662E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f55217g = r0
            r0 = 2131312645(0x7f094005, float:1.8243664E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f55219i = r0
            r0 = 2131312863(0x7f0940df, float:1.8244107E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f55218h = r0
            r0 = 2131312864(0x7f0940e0, float:1.8244109E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f55220j = r0
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$a r0 = new com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$a
            r0.<init>()
            r7.setBackBtn(r0)
            r0 = 2131834069(0x7f1134d5, float:1.9301238E38)
            r7.getString(r0)
            r0 = 2131834070(0x7f1134d6, float:1.930124E38)
            r7.getString(r0)
            gj.m r0 = p156gj.C107835h0.f322856m
            java.lang.String r0 = r0.f322881U
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0056
            java.io.File r0 = android.os.Environment.getRootDirectory()
            goto L_0x005f
        L_0x0056:
            java.io.File r0 = new java.io.File
            gj.m r1 = p156gj.C107835h0.f322856m
            java.lang.String r1 = r1.f322881U
            r0.<init>(r1)
        L_0x005f:
            com.tencent.mm.vfs.m1 r0 = com.tencent.p014mm.vfs.C86009m1.m106378c(r0)
            boolean r1 = r0.mo119961a()
            r2 = 0
            if (r1 == 0) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            java.io.File r0 = p206nj.C88956h.m111060a()
            com.tencent.mm.vfs.m1 r0 = com.tencent.p014mm.vfs.C86009m1.m106378c(r0)
            boolean r1 = r0.mo119961a()
            if (r1 == 0) goto L_0x007d
            r0.getName()
            goto L_0x007e
        L_0x007d:
            r0 = r2
        L_0x007e:
            f40.o r1 = f40.C86709a0.m107535s()
            boolean r1 = r1.mo121147n()
            if (r1 == 0) goto L_0x0091
            java.io.File r1 = p206nj.C88956h.m111061b()
            com.tencent.mm.vfs.m1 r1 = com.tencent.p014mm.vfs.C86009m1.m106378c(r1)
            goto L_0x00b8
        L_0x0091:
            gj.m r1 = p156gj.C107835h0.f322856m
            java.lang.String r1 = r1.f322883W
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x00a0
            java.io.File r1 = android.os.Environment.getDownloadCacheDirectory()
            goto L_0x00a9
        L_0x00a0:
            java.io.File r1 = new java.io.File
            gj.m r3 = p156gj.C107835h0.f322856m
            java.lang.String r3 = r3.f322883W
            r1.<init>(r3)
        L_0x00a9:
            com.tencent.mm.vfs.m1 r1 = com.tencent.p014mm.vfs.C86009m1.m106378c(r1)
            boolean r3 = r1.mo119961a()
            if (r3 == 0) goto L_0x00b7
            r1.getName()
            goto L_0x00b8
        L_0x00b7:
            r1 = r2
        L_0x00b8:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            if (r0 != 0) goto L_0x00c4
            r4 = r2
            goto L_0x00c8
        L_0x00c4:
            java.lang.String r4 = r0.mo119971i()
        L_0x00c8:
            r5 = 131073(0x20001, float:1.83672E-40)
            java.lang.Object r3 = r3.mo119684e(r5, r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x00eb
            if (r0 == 0) goto L_0x00eb
            java.lang.String r4 = r0.mo119971i()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x00eb
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            r4.<init>((java.lang.String) r3)
            boolean r3 = r4.mo119967g()
            if (r3 == 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r4 = r0
        L_0x00ec:
            r7.f55221n = r4
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            if (r1 != 0) goto L_0x00fa
            r4 = r2
            goto L_0x00fe
        L_0x00fa:
            java.lang.String r4 = r1.mo119971i()
        L_0x00fe:
            r5 = 131074(0x20002, float:1.83674E-40)
            java.lang.Object r3 = r3.mo119684e(r5, r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0121
            if (r1 == 0) goto L_0x0121
            java.lang.String r4 = r1.mo119971i()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0121
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            r4.<init>((java.lang.String) r3)
            boolean r3 = r4.mo119967g()
            if (r3 == 0) goto L_0x0121
            goto L_0x0122
        L_0x0121:
            r4 = r1
        L_0x0122:
            r7.f55222o = r4
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r3 = new com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e
            r3.<init>(r2)
            r7.f55216f = r3
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0148
            r7.mo25322H7(r3)
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r4 = r7.f55216f
            java.lang.String r5 = r1.mo119976n()
            r4.f55229d = r5
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r4 = r7.f55216f
            com.tencent.mm.vfs.m1 r5 = r7.f55222o
            com.tencent.mm.vfs.m1 r5 = r5.mo119974l()
            com.tencent.mm.vfs.m1 r6 = r7.f55222o
            r4.mo25327a(r5, r6)
            goto L_0x0162
        L_0x0148:
            if (r0 == 0) goto L_0x019f
            r7.mo25322H7(r2)
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r4 = r7.f55216f
            java.lang.String r5 = r0.mo119976n()
            r4.f55229d = r5
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r4 = r7.f55216f
            com.tencent.mm.vfs.m1 r5 = r7.f55221n
            com.tencent.mm.vfs.m1 r5 = r5.mo119974l()
            com.tencent.mm.vfs.m1 r6 = r7.f55221n
            r4.mo25327a(r5, r6)
        L_0x0162:
            android.widget.TextView r4 = r7.f55217g
            if (r0 == 0) goto L_0x0168
            r5 = 1
            goto L_0x0169
        L_0x0168:
            r5 = 0
        L_0x0169:
            r4.setEnabled(r5)
            android.widget.TextView r4 = r7.f55218h
            if (r1 == 0) goto L_0x0171
            r2 = 1
        L_0x0171:
            r4.setEnabled(r2)
            android.widget.ListView r2 = r7.f55215e
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r3 = r7.f55216f
            r2.setAdapter(r3)
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r2 = r7.f55216f
            r2.notifyDataSetChanged()
            android.widget.ListView r2 = r7.f55215e
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$b r3 = new com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$b
            r3.<init>()
            r2.setOnItemClickListener(r3)
            android.widget.TextView r2 = r7.f55217g
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$c r3 = new com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$c
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            android.widget.TextView r0 = r7.f55218h
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$d r2 = new com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$d
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            return
        L_0x019f:
            java.lang.String r0 = "MicroMsg.FileExplorerUI"
            java.lang.String r1 = "left and right tag disabled in the same time."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_title");
        if (Util.isNullOrNil(stringExtra)) {
            setMMTitle((int) C0966R.string.f361141hl3);
        } else {
            setMMTitle(stringExtra);
        }
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r3.f55216f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            r0 = 4
            if (r4 != r0) goto L_0x002c
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r0 = r3.f55216f
            com.tencent.mm.vfs.m1 r1 = r0.f55230e
            if (r1 == 0) goto L_0x002c
            int r4 = r3.f55214d
            r5 = 1
            if (r5 != r4) goto L_0x0011
            r3.f55222o = r1
            goto L_0x0015
        L_0x0011:
            if (r4 != 0) goto L_0x0015
            r3.f55221n = r1
        L_0x0015:
            com.tencent.mm.vfs.m1 r4 = r1.mo119974l()
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r1 = r3.f55216f
            com.tencent.mm.vfs.m1 r1 = r1.f55230e
            r0.mo25327a(r4, r1)
            com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI$e r4 = r3.f55216f
            r4.notifyDataSetChanged()
            android.widget.ListView r4 = r3.f55215e
            r0 = 0
            r4.setSelection(r0)
            return r5
        L_0x002c:
            com.tencent.mm.vfs.m1 r0 = r3.f55222o
            if (r0 == 0) goto L_0x0044
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 131074(0x20002, float:1.83674E-40)
            com.tencent.mm.vfs.m1 r2 = r3.f55222o
            java.lang.String r2 = r2.mo119971i()
            r0.mo119676J(r1, r2)
        L_0x0044:
            com.tencent.mm.vfs.m1 r0 = r3.f55221n
            if (r0 == 0) goto L_0x005c
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 131073(0x20001, float:1.83672E-40)
            com.tencent.mm.vfs.m1 r2 = r3.f55221n
            java.lang.String r2 = r2.mo119971i()
            r0.mo119676J(r1, r2)
        L_0x005c:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
